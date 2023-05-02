package com.mod.libs;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.ListView;
import android.widget.TextView;
import com.mod.libs.TTRButton;
import com.mod.libs.TTRCheckBox;
import com.mod.libs.TThread;
import com.mod.libs.TTimer;
import com.mod.libs.TTrigger;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class TFormFileList extends ListActivity implements TTRButton.OnButtonClickEvent, TTrigger.OnTriggerEvent, TThread.OnThreadEvent, TTimer.OnTimerEvent, TTRCheckBox.OnCheckBoxClickEvent {
    public TTR TR = new TTR(this);
    public TTRButton TRButton = new TTRButton(this, this);
    public TTRCheckBox TRCheckBox = new TTRCheckBox(this, this);
    public TTrigger Trigger = new TTrigger(this, this);
    private String fileSelected;
    private List<String> item = null;
    private String layoutListItem = "list_item_file_explorer";
    private TextView myPath;
    private List<String> path = null;
    public String root = Environment.getExternalStorageDirectory().getAbsolutePath();

    public int Count() {
        return getListView().getCount();
    }

    public void InitFileList(String str) {
        this.myPath = (TextView) this.TR.InitView(str);
        RefreshDir(this.root);
    }

    public void InitFileList(String str, String str2) {
        this.layoutListItem = str2;
        InitFileList(str);
    }

    public void RefreshDir(String str) {
        this.myPath.setText("Location: " + str);
        this.item = new ArrayList();
        this.path = new ArrayList();
        File file = new File(str);
        File[] listFiles = file.listFiles();
        if (!str.equals(this.root)) {
            this.item.add(this.root);
            this.path.add(this.root);
            this.item.add("../");
            this.path.add(file.getParent());
        }
        Arrays.sort(listFiles, TTR.fileComparator);
        for (File file2 : listFiles) {
            this.path.add(file2.getPath());
            if (file2.isDirectory()) {
                this.item.add(String.valueOf(file2.getName()) + "/");
            } else {
                this.item.add(file2.getName());
            }
        }
        setListAdapter(new ArrayAdapter(this, this.TR.GetLayout(this.layoutListItem), this.item));
    }

    public String Strings(int i2) {
        return getListView().getItemAtPosition(i2).toString();
    }

    public Boolean isFileClicked(int i2) {
        File file = new File(this.path.get(i2));
        if (file.isDirectory()) {
            if (file.canRead()) {
                RefreshDir(this.path.get(i2));
            } else {
                this.TR.ShowToast("Folder can't be read");
            }
            return false;
        }
        this.fileSelected = file.getAbsolutePath();
        return true;
    }

    public abstract void onActCreate(Bundle bundle);

    public abstract void onActResult(int i2, int i3, Intent intent);

    /* access modifiers changed from: protected */
    public void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        onActResult(i2, i3, intent);
    }

    public void onCheckBoxClick(CompoundButton compoundButton, boolean z2) {
        this.TRCheckBox.thisCheckBox = compoundButton;
        if (z2) {
            this.TRCheckBox.SetCheckBoxCheckedFlag(compoundButton, true);
            onCheckBoxOn();
            return;
        }
        this.TRCheckBox.SetCheckBoxCheckedFlag(compoundButton, false);
        onCheckBoxOff();
    }

    public abstract void onCheckBoxOff();

    public abstract void onCheckBoxOn();

    public abstract void onClick(String str);

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        onActCreate(bundle);
    }

    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (onSystemKeyDown(i2, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i2, keyEvent);
    }

    /* access modifiers changed from: protected */
    public void onListItemClick(ListView listView, View view, int i2, long j2) {
        if (isFileClicked(i2).booleanValue()) {
            onClick(this.fileSelected);
        }
    }

    public abstract boolean onSystemKeyDown(int i2, KeyEvent keyEvent);
}
