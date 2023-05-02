package com.mod.libs;

import android.content.Context;

public class TPhp {
    public static int stsNoConnection = 1;
    public static int stsNoData = 2;
    public static int stsPosted = 0;
    public String Host;
    public int PostStatus;
    private TTR TR;
    private TStringArray arrCacheField;
    private String cacheId;
    private Context context;
    public THttp http = new THttp();
    public TTable table;

    public TPhp(Context context2, String str) {
        this.context = context2;
        this.TR = new TTR(context2);
        this.cacheId = this.TR.ExtractFileName(str).replace(".", "");
        InitPhp(str, this.cacheId);
    }

    public TPhp(Context context2, String str, String str2) {
        this.context = context2;
        this.TR = new TTR(context2);
        InitPhp(str, str2);
    }

    public void AddParam(String str, String str2) {
        this.table.PutField(str);
        this.arrCacheField.Add(str);
        this.http.AddHttpParam(str, str2);
        this.table.AddField(str, str2);
    }

    public void AddParamFromMem(String str) {
        this.http.AddHttpParam(str, this.table.GetFieldValue(str));
        this.table.AddKeyField(str, this.table.GetFieldValue(str));
    }

    public void BuildCache() {
        if (!this.TR.FreshSharedVar(this.cacheId).booleanValue()) {
            TStringArray tStringArray = new TStringArray();
            tStringArray.LoadFromText(this.TR.GetSharedString(this.cacheId));
            for (int i2 = 0; i2 < tStringArray.Count(); i2++) {
                this.table.PutField(tStringArray.Strings(i2));
            }
            this.table.BuildTable();
        }
    }

    public void CreateParams() {
        this.http.Host = this.Host;
        this.arrCacheField = new TStringArray();
        this.http.CreateHttpParams();
        this.table.CreateField();
        this.table.CreateKeyField();
    }

    public boolean GetData() {
        return this.http.GetData();
    }

    public String GetFieldName(int i2) {
        return this.http.GetFieldName(i2);
    }

    public String GetFieldType(int i2) {
        return this.http.GetFieldType(i2);
    }

    public String GetFieldType(String str) {
        return this.http.GetFieldType(str);
    }

    public String GetFieldValue(int i2) {
        return this.http.GetFieldValue(i2);
    }

    public String GetFieldValue(String str) {
        return this.http.GetFieldValue(str);
    }

    public void InitPhp(String str, String str2) {
        this.Host = str;
        this.table = new TTable(this.context, str2);
    }

    public void OpenSQL(String str) {
        this.http.Host = this.Host;
        this.http.OpenSQL(str);
    }

    public void Post() {
        this.table.BuildTable();
        this.TR.SetSharedString(this.cacheId, this.arrCacheField.SaveToText());
        this.http.Post();
    }

    public boolean PostAllRecords() {
        try {
            BuildCache();
            this.PostStatus = stsPosted;
            boolean z2 = true;
            this.table.OpenSQL();
            this.http.Host = this.Host;
            while (this.table.GetData()) {
                CreateParams();
                for (int i2 = 0; i2 < this.table.GetFieldCount(); i2++) {
                    AddParamFromMem(this.table.GetFieldName(i2));
                }
                this.http.Post();
                if (Posted()) {
                    this.table.Delete();
                } else {
                    this.PostStatus = stsNoConnection;
                    z2 = false;
                }
            }
            return z2;
        } catch (Exception e2) {
            this.PostStatus = stsNoData;
            return false;
        }
    }

    public boolean Posted() {
        return this.http.Posted;
    }

    public String Response() {
        return this.http.Response;
    }

    public void SaveToMem() {
        this.table.Insert();
    }
}
