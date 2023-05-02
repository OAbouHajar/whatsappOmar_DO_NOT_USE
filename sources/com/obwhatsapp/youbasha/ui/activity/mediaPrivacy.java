package com.obwhatsapp.youbasha.ui.activity;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ListView;
import com.OM7753.GOLD;
import com.obwhatsapp.yo.shp;
import com.obwhatsapp.yo.yo;

public class mediaPrivacy implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    static String[] f1267a = {"yoMPhoto_", "yoMAudio_", "yoMVideo_", "yoMDocument_"};

    /* renamed from: c  reason: collision with root package name */
    private static final CharSequence[] f1268c = {yo.getString("yoMPhoto"), yo.getString("yoMAudio"), yo.getString("yoMVideo"), yo.getString("yoMDocument")};

    /* renamed from: d  reason: collision with root package name */
    private static String f1269d = yo.getString("settings_autodownload");

    /* renamed from: b  reason: collision with root package name */
    private Activity f1270b;

    /* renamed from: e  reason: collision with root package name */
    private int f1271e = 0;

    /* renamed from: f  reason: collision with root package name */
    private String f1272f;

    /* renamed from: g  reason: collision with root package name */
    private String f1273g = null;

    /* renamed from: h  reason: collision with root package name */
    private CompoundButton f1274h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f1275i;

    public mediaPrivacy(Activity activity, String str) {
        this.f1270b = activity;
        f1269d = yo.getString("settings_autodownload");
        this.f1275i = false;
        this.f1272f = str + "_M";
    }

    public mediaPrivacy(Activity activity, String str, String str2) {
        this.f1270b = activity;
        f1269d = yo.getString("settings_autodownload");
        this.f1275i = false;
        this.f1273g = str2;
        this.f1272f = str + "_M";
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(DialogInterface dialogInterface, int i2) {
        if (this.f1271e == 0 && !GOLD.wantsSpecific()) {
            clear();
            if (this.f1275i) {
                this.f1274h.setChecked(false);
            }
        }
        dialogInterface.dismiss();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(DialogInterface dialogInterface, int i2, boolean z2) {
        this.f1271e++;
        shp.setBooleanPriv(f1267a[i2] + this.f1272f, z2);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(DialogInterface dialogInterface, int i2) {
        shp.setBooleanPriv(this.f1272f, true);
        if (this.f1275i) {
            this.f1274h.setChecked(true);
        }
    }

    public void action() {
        String str = f1269d;
        String str2 = this.f1273g;
        if (str2 != null && !str2.isEmpty()) {
            str = f1269d + ": " + this.f1273g;
        }
        AlertDialog create = new AlertDialog.Builder(this.f1270b, yo.getID("AlertDialogTheme", "style")).setTitle(str).setMultiChoiceItems(f1268c, (boolean[]) null, new mediaPrivacy1(this)).setPositiveButton(17039370, new mediaPrivacy2(this)).setNegativeButton(17039360, new mediaPrivacy3(this)).create();
        create.show();
        ListView listView = create.getListView();
        int i2 = 0;
        while (i2 < f1267a.length) {
            try {
                listView.setItemChecked(i2, shp.getBooleanPriv(f1267a[i2] + this.f1272f));
                i2++;
            } catch (Exception unused) {
                return;
            }
        }
    }

    public void clear() {
        shp.setBooleanPriv(this.f1272f, false);
    }

    public void onClick(View view) {
        action();
    }

    public void setSW(CompoundButton compoundButton) {
        if (compoundButton != null) {
            this.f1274h = compoundButton;
            this.f1275i = true;
        }
    }
}
