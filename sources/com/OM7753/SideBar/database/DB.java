package com.OM7753.SideBar.database;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.obwhatsapp.yo.yo;
import java.io.File;

public class DB {
    private static final String WHATSAPP_MSGSTORE_DB_PATH = (appData() + "databases/wa.db");
    public SQLiteDatabase msgstore;

    public static String appData() {
        return (yo.getCtx().getFilesDir().getAbsolutePath() + File.separator).replace("files/", "");
    }

    public boolean openDatabases() {
        try {
            this.msgstore = SQLiteDatabase.openDatabase(WHATSAPP_MSGSTORE_DB_PATH, (SQLiteDatabase.CursorFactory) null, 0);
            return true;
        } catch (SQLiteException e2) {
            e2.printStackTrace();
            return false;
        }
    }
}
