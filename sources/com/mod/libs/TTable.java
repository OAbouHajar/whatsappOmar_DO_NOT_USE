package com.mod.libs;

import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class TTable {
    private TTR TR;
    private TStringPair arrField;
    private TStringPair arrFieldType = new TStringPair();
    private TStringPair arrKeyField;
    private Context context;
    private Cursor cursor;
    private SQLiteDatabase db;
    private String thisTableName;

    public TTable(Context context2, String str) {
        this.context = context2;
        this.TR = new TTR(context2);
        this.thisTableName = str;
    }

    public void AddField(String str, String str2) {
        this.arrField.Add(str, str2);
    }

    public void AddKeyField(String str, String str2) {
        this.arrKeyField.Add(str, str2);
    }

    public SQLiteDatabase BuildTable() {
        this.db = ((Activity) this.context).openOrCreateDatabase(this.thisTableName, 0, (SQLiteDatabase.CursorFactory) null);
        String str = "";
        for (int i2 = 0; i2 < this.arrFieldType.Count(); i2++) {
            str = String.valueOf(str) + this.arrFieldType.Key(i2) + " " + this.arrFieldType.Value(i2) + ",";
        }
        this.db.execSQL("CREATE TABLE IF NOT EXISTS " + this.thisTableName + ("(" + str.substring(0, str.length() - 1) + ")") + ";");
        return this.db;
    }

    public void CreateField() {
        this.arrField = new TStringPair();
    }

    public void CreateKeyField() {
        this.arrKeyField = new TStringPair();
    }

    public boolean DataExist() {
        return this.cursor.moveToFirst();
    }

    public void Delete() {
        String str = "";
        for (int i2 = 0; i2 < this.arrKeyField.Count(); i2++) {
            String Key = this.arrKeyField.Key(i2);
            String Value = this.arrKeyField.Value(i2);
            if (!Value.isEmpty()) {
                str = String.valueOf(str) + " " + Key + "=" + "'" + Value + "' And";
            }
        }
        this.db.execSQL("Delete From " + this.thisTableName + " Where" + str.substring(0, str.length() - 4));
    }

    public void DropTable(String str) {
        this.db = ((Activity) this.context).openOrCreateDatabase(str, 0, (SQLiteDatabase.CursorFactory) null);
        this.db.execSQL("DROP TABLE IF EXISTS " + str + ";");
    }

    public void Edit() {
        String str = "";
        String str2 = "";
        for (int i2 = 0; i2 < this.arrField.Count(); i2++) {
            str = String.valueOf(str) + this.arrField.Key(i2) + "='" + this.arrField.Value(i2) + "',";
        }
        for (int i3 = 0; i3 < this.arrKeyField.Count(); i3++) {
            String Key = this.arrKeyField.Key(i3);
            String Value = this.arrKeyField.Value(i3);
            if (!Value.isEmpty()) {
                str2 = String.valueOf(str2) + " " + Key + "='" + Value + "' And";
            }
        }
        this.db.execSQL("Update " + this.thisTableName + " Set " + str.substring(0, str.length() - 1) + " Where " + str2.substring(0, str2.length() - 4));
    }

    public SQLiteDatabase ExecSQL(String str) {
        this.db.execSQL(str);
        return this.db;
    }

    public boolean FieldValueExist(TTable tTable, String str, String str2) {
        tTable.OpenSQL("Select " + str + " From " + tTable.GetTableName() + " Where " + str + "=" + this.TR.QuotedStr(str2));
        return tTable.GetRowCount() == 1;
    }

    public boolean GetData() {
        return this.cursor.moveToNext();
    }

    public int GetFieldCount() {
        return this.arrFieldType.Count();
    }

    public String GetFieldName(int i2) {
        return this.arrFieldType.Key(i2);
    }

    public String GetFieldValue(int i2) {
        return this.cursor.getString(i2);
    }

    public String GetFieldValue(String str) {
        return this.cursor.getString(this.cursor.getColumnIndex(str));
    }

    public int GetRowCount() {
        return this.cursor.getCount();
    }

    public String GetTableName() {
        return this.thisTableName;
    }

    public void Insert() {
        String str = "";
        String str2 = "";
        for (int i2 = 0; i2 < this.arrField.Count(); i2++) {
            str = String.valueOf(str) + this.arrField.Key(i2) + ",";
            str2 = String.valueOf(str2) + "'" + this.arrField.Value(i2) + "',";
        }
        this.db.execSQL("Insert Into " + this.thisTableName + " " + ("(" + str.substring(0, str.length() - 1) + ")") + " Values" + ("(" + str2.substring(0, str2.length() - 1) + ")"));
    }

    public Cursor OpenSQL() {
        this.cursor = this.db.rawQuery("Select * From " + this.thisTableName, (String[]) null);
        return this.cursor;
    }

    public Cursor OpenSQL(String str) {
        this.cursor = this.db.rawQuery(str, (String[]) null);
        return this.cursor;
    }

    public void PutField(String str) {
        this.arrFieldType.Add(str, "VARCHAR");
    }
}
