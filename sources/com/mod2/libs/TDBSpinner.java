package com.mod2.libs;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import com.mod2.libs.TThread;

public class TDBSpinner {
    public String Host;
    public String SQLText;
    /* access modifiers changed from: private */
    public TTR TR;
    private TThread Thread;
    private Context context;
    private THttp http = new THttp();
    private TTable table;
    private String thisSpinnerID;

    public TDBSpinner(Context context2, TThread.OnThreadEvent onThreadEvent) {
        this.context = context2;
        this.TR = new TTR(context2);
        this.Thread = new TThread(onThreadEvent);
    }

    public String GetItemOnChange(AdapterView<?> adapterView, View view, int i2) {
        String str = "";
        try {
            str = this.TR.GetSpinnerItemOnChange(adapterView, view, i2);
        } catch (Exception e2) {
        }
        return str.equals(" - ") ? "" : str;
    }

    public String GetItemSelected(Spinner spinner) {
        String str = "";
        try {
            str = this.TR.GetSpinnerItemSelected(spinner);
        } catch (Exception e2) {
        }
        return str.equals(" - ") ? "" : str;
    }

    public String GetKeyOnChange(AdapterView<?> adapterView, View view, int i2) {
        String str = "";
        try {
            str = this.TR.StrToParams(adapterView.getItemAtPosition(i2).toString(), " - ")[1].trim();
        } catch (Exception e2) {
        }
        return str.equals(" - ") ? "" : str;
    }

    public String GetKeySelected(Spinner spinner) {
        String str = "";
        try {
            str = this.TR.StrToParams(this.TR.GetSpinnerItemSelected(spinner), " - ")[1].trim();
        } catch (Exception e2) {
        }
        return str.equals(" - ") ? "" : str;
    }

    public String GetValueOnChange(AdapterView<?> adapterView, View view, int i2) {
        String str = "";
        try {
            str = this.TR.StrToParams(adapterView.getItemAtPosition(i2).toString(), " - ")[0].trim();
        } catch (Exception e2) {
        }
        return str.equals(" - ") ? "" : str;
    }

    public String GetValueSelected(Spinner spinner) {
        String str = "";
        try {
            str = this.TR.StrToParams(this.TR.GetSpinnerItemSelected(spinner), " - ")[0].trim();
        } catch (Exception e2) {
        }
        return str.equals(" - ") ? "" : str;
    }

    public void InitThread(String str, String str2) {
        this.thisSpinnerID = str;
        this.table = new TTable(this.context, this.thisSpinnerID);
        this.table.PutField("Item");
        this.table.BuildTable();
        this.Thread.DoThread(str2);
    }

    public void Refresh(Spinner spinner, String str) {
        Refresh(spinner, "", str);
    }

    public boolean Refresh(final Spinner spinner, String str, String str2) {
        boolean z2 = false;
        this.http.Host = this.Host;
        this.http.OpenSQL(this.SQLText);
        if (this.http.TableReady()) {
            z2 = true;
            this.table.ExecSQL("Delete From " + this.thisSpinnerID);
            this.TR.CreateSpinnerList();
            this.TR.AddSpinnerList(" - ");
            while (this.http.GetData()) {
                if (str.isEmpty()) {
                    this.table.CreateField();
                    this.table.AddField("Item", this.http.GetFieldValue(str2));
                    this.table.Insert();
                    this.TR.AddSpinnerList(this.http.GetFieldValue(str2));
                } else {
                    this.table.CreateField();
                    this.table.AddField("Item", String.valueOf(this.http.GetFieldValue(str)) + " - " + this.http.GetFieldValue(str2));
                    this.table.Insert();
                    this.TR.AddSpinnerList(String.valueOf(this.http.GetFieldValue(str)) + " - " + this.http.GetFieldValue(str2));
                }
            }
            ((Activity) this.context).runOnUiThread(new Runnable() {
                public void run() {
                    TDBSpinner.this.TR.RefreshSpinnerList(spinner);
                }
            });
        } else {
            this.table.OpenSQL("Select * From " + this.thisSpinnerID);
            this.TR.CreateSpinnerList();
            this.TR.AddSpinnerList(" - ");
            while (this.table.GetData()) {
                this.TR.AddSpinnerList(this.table.GetFieldValue("Item"));
            }
            ((Activity) this.context).runOnUiThread(new Runnable() {
                public void run() {
                    TDBSpinner.this.TR.RefreshSpinnerList(spinner);
                }
            });
        }
        return z2;
    }

    public void RefreshFromTable(Spinner spinner, TTable tTable, String str) {
        RefreshFromTable(spinner, tTable, "", str);
    }

    public void RefreshFromTable(Spinner spinner, TTable tTable, String str, String str2) {
        tTable.OpenSQL();
        this.TR.CreateSpinnerList();
        this.TR.AddSpinnerList(" - ");
        while (tTable.GetData()) {
            if (str.isEmpty()) {
                this.TR.AddSpinnerList(tTable.GetFieldValue(str2));
            } else {
                this.TR.AddSpinnerList(String.valueOf(tTable.GetFieldValue(str)) + " - " + tTable.GetFieldValue(str2));
            }
        }
        this.TR.RefreshSpinnerList(spinner);
    }
}
