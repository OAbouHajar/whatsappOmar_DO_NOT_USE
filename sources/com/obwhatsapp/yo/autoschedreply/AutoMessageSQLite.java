package com.obwhatsapp.yo.autoschedreply;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class AutoMessageSQLite extends SQLiteOpenHelper {
    public AutoMessageSQLite(Context context) {
        super(context, "AutoMessage.db", (SQLiteDatabase.CursorFactory) null, 5);
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        String str = "ۤۢۢۤۧۘۤۖۚۥۗ۠ۢ۬ۖۚۛ۫ۧۨۘ";
        while (true) {
            switch ((str.hashCode() ^ 797) ^ -1418312608) {
                case -2100336129:
                    str = "ۥۜۙۛ۟ۚۖۢۨۖۚۖۘۖ۬ۥۘۡۙۗ";
                    break;
                case -1760898302:
                    sQLiteDatabase.execSQL("CREATE TABLE automsg (_id  INTEGER PRIMARY KEY AUTOINCREMENT, received_message TEXT, reply_message TEXT, recipients TEXT, reply_delay TEXT, pattern_matching TEXT, disabled INTEGER, start_time TEXT, end_time TEXT, specific TEXT, ignored TEXT)");
                    str = "ۤۧۨۤۨۦ۬ۘۘۦ۟ۦۘ۬ۛ۬۟ۛۤ۟ۦۧۘ";
                    break;
                case -431843072:
                    return;
                case 1386562069:
                    str = "۬۟ۗۗۨۜۙ۬ۨ۠ۦۡۡۖ۬ۡۥۚۢۙۜۘ";
                    break;
            }
        }
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        String str = "۟ۦۙۢۡۡۘ۟۠ۛ۠۫ۡۘۛ۬ۜۥۚ۟ۚۤۛ";
        while (true) {
            switch (str.hashCode() ^ -1388839820) {
                case -437536935:
                    return;
                case 1285601866:
                    str = "ۜ۬ۘۘۗۧۦ۟ۙۦ۬ۧۧۘۘۦۘ۬۟ۚۦۦۜۙۜۘۛۤ۫";
                    break;
                case 1529363498:
                    if (i3 <= i2) {
                        str = "ۨ۬ۛ۬۬ۧۧۡ۟ۧۦۖۘ۠ۨ۫";
                        break;
                    } else {
                        str = "ۢۤۥۘۡ۫۬ۗۗۘۤۚۦۡۤ۫ۡ";
                        break;
                    }
                case 1706278478:
                    String str2 = "ۙ۬ۖۥۢ۬ۗۡ۫ۦۙۘ۫۠ۘۦۤۤ";
                    while (true) {
                        switch (str2.hashCode() ^ -1292496169) {
                            case -1931566600:
                                try {
                                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS automsg");
                                    sQLiteDatabase.execSQL("CREATE TABLE automsg (_id  INTEGER PRIMARY KEY AUTOINCREMENT, received_message TEXT, reply_message TEXT, recipients TEXT, reply_delay TEXT, pattern_matching TEXT, disabled INTEGER, start_time TEXT, end_time TEXT, specific TEXT, ignored TEXT)");
                                    return;
                                } catch (Exception e2) {
                                    return;
                                }
                            case -638757963:
                                str2 = "ۧ۬ۗۛۜۡۤۙۡۘۨۜۘۘ۬ۘۢۚۗۜۘ۟۫ۜ";
                                break;
                            case 767382596:
                                if (i3 != 5) {
                                    str2 = "ۦۢۜۚ۫ۧۥۛۤۙ۬ۚۘۢۡۛۛۚۗۦۙ";
                                    break;
                                } else {
                                    str2 = "ۜۢۖۧ۠ۘۘۡۢۦۘۨۚۥۘۢ۫ۥۘۧۘۧ۠ۗۜۢۥۜۙۤۚ";
                                    break;
                                }
                            case 1383969839:
                                return;
                        }
                    }
                    break;
            }
        }
    }
}
