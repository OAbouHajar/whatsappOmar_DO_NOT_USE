package com.mod.libs;

import android.content.Context;
import android.view.View;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.mod.libs.TAdapter;
import com.mod.libs.TThread;
import com.mod.libs.TTrigger;
import java.util.ArrayList;
import java.util.List;

public class TDBListView implements TThread.OnThreadEvent, TTrigger.OnTriggerEvent {
    public String Host;
    public String SQLText;
    private TTR TR;
    private TThread Thread;
    private TTrigger Trigger;
    public TAdapter adapter;
    private TStringArray arrFieldName;
    private ArrayList<String> arrKey;
    /* access modifiers changed from: private */
    public TStringArray arrLabelID;
    private ArrayList<TStringArray> arrRecord;
    private Context context;
    private THttp http = new THttp();
    private TAdapter.OnListingEvent onListViewListing = new TAdapter.OnListingEvent() {
        public void onListing(int i2, View view) {
            TDBListView.this.thisRow = i2;
            TDBListView.this.thisView = view;
            for (int i3 = 0; i3 < TDBListView.this.arrLabelID.Count(); i3++) {
                TDBListView.this.FillTextView(i3);
            }
            try {
                TDBListView.this.thisOnRowListingEvent.onRowListing(i2, view);
            } catch (Exception e2) {
            }
        }
    };
    public ProgressBar progressBar;
    private TTable table;
    private String thisListItemLayoutID;
    private ListView thisListView;
    /* access modifiers changed from: private */
    public OnRowListingEvent thisOnRowListingEvent;
    /* access modifiers changed from: private */
    public int thisRow;
    private String thisTableNameCust;
    /* access modifiers changed from: private */
    public View thisView;

    public interface OnRowListingEvent {
        void onRowListing(int i2, View view);
    }

    public TDBListView(Context context2, String str, OnRowListingEvent onRowListingEvent) {
        this.context = context2;
        this.thisListItemLayoutID = str;
        this.TR = new TTR(context2);
        this.Thread = new TThread(this);
        this.Trigger = new TTrigger(context2, this);
        this.thisOnRowListingEvent = onRowListingEvent;
    }

    public void Activate(ListView listView) {
        this.thisListView = listView;
        if (this.progressBar != null) {
            this.TR.Show(this.progressBar);
        }
        this.Thread.DoThread("GetDB");
    }

    public void AddFieldView(String str, String str2) {
        this.arrFieldName.Add(str);
        this.arrLabelID.Add(str2);
    }

    public void BuildTableCustomList(String str, boolean z2) {
        this.table = new TTable(this.context, str);
        if (z2) {
            this.table.DropTable(str);
        }
        for (int i2 = 0; i2 < this.arrFieldName.Count(); i2++) {
            this.table.PutField(this.arrFieldName.Strings(i2));
        }
        this.table.BuildTable();
        if (z2) {
            this.table.ExecSQL("Delete From " + str);
        }
    }

    public int Count() {
        return this.arrKey.size();
    }

    public void CreateFieldView() {
        this.arrFieldName = new TStringArray();
        this.arrLabelID = new TStringArray();
    }

    public boolean DoRefresh(ListView listView, String str, OnRowListingEvent onRowListingEvent) {
        String str2 = String.valueOf(this.TR.GetOwner(this.context)) + this.TR.GetViewTag(listView);
        for (int i2 = 0; i2 < this.arrFieldName.Count(); i2++) {
            str2 = String.valueOf(str2) + this.arrFieldName.Strings(i2);
        }
        this.thisTableNameCust = str2;
        boolean z2 = false;
        try {
            this.http.Host = this.Host;
            this.http.OpenSQL(this.SQLText);
            this.arrKey = new ArrayList<>();
            this.arrRecord = new ArrayList<>();
            if (this.http.TableReady()) {
                z2 = true;
                BuildTableCustomList(str2, true);
                while (this.http.GetData()) {
                    this.arrKey.add("-");
                    TStringArray tStringArray = new TStringArray();
                    for (int i3 = 0; i3 < this.arrFieldName.Count(); i3++) {
                        tStringArray.Add(this.http.GetFieldValue(this.arrFieldName.Strings(i3)));
                    }
                    this.arrRecord.add(tStringArray);
                    this.table.CreateField();
                    for (int i4 = 0; i4 < this.arrFieldName.Count(); i4++) {
                        String Strings = this.arrFieldName.Strings(i4);
                        this.table.AddField(Strings, this.http.GetFieldValue(Strings));
                    }
                    this.table.Insert();
                }
                this.Trigger.DoTrigger("ListPart");
            } else {
                BuildTableCustomList(str2, false);
                this.table.OpenSQL("Select * From " + str2);
                while (this.table.GetData()) {
                    this.arrKey.add("-");
                    TStringArray tStringArray2 = new TStringArray();
                    for (int i5 = 0; i5 < this.arrFieldName.Count(); i5++) {
                        tStringArray2.Add(this.table.GetFieldValue(this.arrFieldName.Strings(i5)));
                    }
                    this.arrRecord.add(tStringArray2);
                }
                this.Trigger.DoTrigger("ListPart");
            }
            return z2;
        } catch (Exception e2) {
            return false;
        }
    }

    public void FillTextView(int i2) {
        try {
            String Strings = this.arrLabelID.Strings(i2);
            if (!Strings.isEmpty()) {
                this.TR.InitTextView(this.thisView, Strings).setText(GetListValue(i2));
            }
        } catch (Exception e2) {
        }
    }

    public int GetFieldIndex(String str) {
        for (int i2 = 0; i2 < this.arrFieldName.Count(); i2++) {
            if (this.arrFieldName.Strings(i2).equals(str)) {
                return i2;
            }
        }
        return -1;
    }

    public String GetItemValue(int i2, int i3) {
        return i3 > -1 ? this.arrRecord.get(i2).Strings(i3) : "";
    }

    public String GetItemValue(int i2, String str) {
        return GetItemValue(i2, GetLabelIndex(str));
    }

    public String GetItemValueByFieldName(int i2, String str) {
        return GetItemValue(i2, GetFieldIndex(str));
    }

    public int GetLabelIndex(String str) {
        for (int i2 = 0; i2 < this.arrLabelID.Count(); i2++) {
            if (this.arrLabelID.Strings(i2).equals(str)) {
                return i2;
            }
        }
        return -1;
    }

    public String GetListValue(int i2) {
        return i2 > -1 ? this.arrRecord.get(this.thisRow).Strings(i2) : "";
    }

    public String GetListValue(String str) {
        return GetListValue(GetLabelIndex(str));
    }

    public String GetListValueByFieldName(String str) {
        return GetListValue(GetFieldIndex(str));
    }

    public TextView InitTextView(String str) {
        return this.TR.InitTextView(this.thisView, str);
    }

    public TextView InitTextViewByFieldName(String str) {
        return this.TR.InitTextView(this.thisView, this.arrLabelID.Strings(GetFieldIndex(str)));
    }

    public void RemoveItem(int i2) {
        this.arrKey.remove(i2);
        this.arrRecord.remove(i2);
        this.adapter.notifyDataSetChanged();
    }

    public void SetItemValue(int i2, int i3, String str) {
        if (i3 > -1) {
            this.arrRecord.get(i2).Update(i3, str);
            this.adapter.notifyDataSetChanged();
            UpdateCache();
        }
    }

    public void SetItemValue(int i2, String str, String str2) {
        SetItemValue(i2, GetLabelIndex(str), str2);
    }

    public void SetItemValueByFieldName(int i2, String str, String str2) {
        SetItemValue(i2, GetFieldIndex(str), str2);
    }

    public void UpdateCache() {
        BuildTableCustomList(this.thisTableNameCust, true);
        for (int i2 = 0; i2 < this.arrKey.size(); i2++) {
            this.table.CreateField();
            for (int i3 = 0; i3 < this.arrFieldName.Count(); i3++) {
                this.table.AddField(this.arrFieldName.Strings(i3), this.arrRecord.get(i2).Strings(i3));
            }
            this.table.Insert();
        }
    }

    public void onThread(String str) {
        if (str.equals("GetDB")) {
            if (!DoRefresh(this.thisListView, this.thisListItemLayoutID, this.thisOnRowListingEvent)) {
                this.TR.ShowToast("No Connection");
            }
            if (this.progressBar != null) {
                this.TR.Hide(this.progressBar);
            }
        }
    }

    public void onTriggered(String str) {
        if (str.equals("ListPart")) {
            this.adapter = this.TR.InitListView(this.thisListView, this.thisListItemLayoutID, (List<String>) this.arrKey, this.onListViewListing);
        }
    }
}
