package com.obwhatsapp.yo.autoschedreply;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class SQLite extends SQLiteOpenHelper {
    public SQLite(Context context) {
        super(context, "DBScheduler.db", (SQLiteDatabase.CursorFactory) null, 2);
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        String str = "۫۬ۥۘ۫۟ۥ۟ۚۤۢۚۨۘۛۜۧ";
        while (true) {
            switch ((str.hashCode() ^ 27) ^ -1483024060) {
                case -1778326992:
                    sQLiteDatabase.execSQL("CREATE TABLE Scheduler (_id  INTEGER PRIMARY KEY AUTOINCREMENT, receipt TEXT, text_message TEXT, start_date TEXT, end_date TEXT, clock TEXT, frequency_type TEXT)");
                    str = "ۖۛۨۘۢۚۜۦۡۥۧۢۖۘۛ۫ۥۘ۬ۜۧۘۜۥۨۘ";
                    break;
                case -1313676142:
                    str = "ۖۡ۬ۚۧۘ۟ۚۖۦۖۗۤۜۜۤۙۡۘۙۚۤ۬ۤۥ۫ۢۧ";
                    break;
                case -878585069:
                    sQLiteDatabase.execSQL("CREATE TABLE EditMessage (_id  INTEGER PRIMARY KEY AUTOINCREMENT, text_message TEXT)");
                    str = "ۨ۫ۨۧۤ۠ۜۡۛۦۨۘ۫ۥۖۘۡۘ۠";
                    break;
                case -587081779:
                    str = "ۦۗ۬ۦۚۢۛۚۤۘۨۢ۟ۥۛ۟ۗ";
                    break;
                case 458047786:
                    return;
            }
        }
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        String str = "ۗۧۦۘۚۥۢۨۦ۟۬۠۠ۥۛۡۤۘۡۘۘۤۙ۠ۜۖۨۡۘ";
        while (true) {
            switch (str.hashCode() ^ -1913129213) {
                case -569941349:
                    String str2 = "ۧ۬ۖۘ۠ۡۘۢۙۥۛۤۚۤۘۢۦۤۚۖ۟ۦۘۦۙۨۨۜۡ";
                    while (true) {
                        switch (str2.hashCode() ^ 1630462834) {
                            case -1498120499:
                                try {
                                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS Scheduler");
                                    sQLiteDatabase.execSQL("CREATE TABLE Scheduler (_id  INTEGER PRIMARY KEY AUTOINCREMENT, receipt TEXT, text_message TEXT, start_date TEXT, end_date TEXT, clock TEXT, frequency_type TEXT)");
                                    return;
                                } catch (Exception e2) {
                                    return;
                                }
                            case -575757914:
                                if (i3 != 2) {
                                    str2 = "ۙۦۢ۟۬ۧ۟۬ۨۘ۬ۜ۬۫ۙۤۚۥۘ۟ۙۙۛ۟ۚۡ۠ۦۘ";
                                    break;
                                } else {
                                    str2 = "ۘۧۥ۬۬ۤۗۛۗۛ۬ۖۘۘۘۛ";
                                    break;
                                }
                            case 517319307:
                                return;
                            case 1971771601:
                                str2 = "ۥۚۘۜۜۖۗۖۜۚۚۛۤ۟ۥۘ";
                                break;
                        }
                    }
                    break;
                case -529653287:
                    return;
                case 118153309:
                    str = "ۨۗۢۥۢۜۘ۟ۢۖۘ۬ۨ۫ۜۖۜۧۖۜۘۥۘۥۢۗ";
                    break;
                case 900438431:
                    if (i3 <= i2) {
                        str = "ۙۚۖۘۖۥۤۥ۟ۜ۬ۗۖۢ۫۫ۖۡۙۜۚ۬۟ۖۘ";
                        break;
                    } else {
                        str = "ۤۛۘۢ۟ۗ۬ۗۖۥۡۨۘۜ۠ۜۘ";
                        break;
                    }
            }
        }
    }
}
