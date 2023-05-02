package com.obwhatsapp.yo;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public final class a extends SQLiteOpenHelper {

    /* renamed from: a  reason: collision with root package name */
    public static SQLiteDatabase f608a;

    /* renamed from: b  reason: collision with root package name */
    public static a f609b;

    public a(Context context) {
        super(context, "BTOR.DB", (SQLiteDatabase.CursorFactory) null, 5);
    }

    public static long a(String str, String str2) {
        Cursor cursor = null;
        long j2 = 0;
        String str3 = "۬ۛۡ۫ۛ۟ۨۡۦ۫ۡۦۖۖۖۧۚۖ";
        long j3 = 0;
        long j4 = 0;
        while (true) {
            switch ((str3.hashCode() ^ 330) ^ 52892012) {
                case -2118099784:
                    return j4;
                case -1592044194:
                    String str4 = "ۘۧ۬ۚۖۦۡۤۡۘ۫ۘۡۘۧۗۥ۟ۢ۟ۚۖ۬ۨۦ۫";
                    while (true) {
                        switch (str4.hashCode() ^ 232782067) {
                            case -2124879556:
                                if (cursor != null) {
                                    str4 = "ۡۖۡ۫ۦۘۘۨۙۧۤۦۨۧۜۗ۟۫ۖۘۦ۟ۤ";
                                    break;
                                } else {
                                    str4 = "ۚۙۦۘۦۢ۫ۧۖۨۘۚۗۙۧۥۛ";
                                    break;
                                }
                            case -1949204755:
                                str4 = "ۛ۟ۜۜۙۚۜ۫ۜۢۛۤۨۨۥۘ";
                                break;
                            case -1910199007:
                                str3 = "۫ۖۖۦ۟ۜۘۡ۟ۙۜ۟ۖ۬ۘۖ";
                                continue;
                            case 407251237:
                                str3 = "ۗ۬۬ۘ۬۠ۖ۠ۙۦۦۛۨۧۚ";
                                continue;
                        }
                    }
                    break;
                case -618376388:
                    str3 = "ۨۢۦۘۡۘۨۢ۟ۨۘۙۤۙۖ۬ۨۨۦۦ۫۠ۧ";
                    break;
                case -245872413:
                    str3 = "ۗۦ۠ۖۧۗۤۚ۫ۥۨۘۤۛۥۘۧۦۨ";
                    break;
                case -60854837:
                    str3 = "۠ۙۨۘۗۥۘۗۦۘۘۙۧ۬ۗۛۚۤۡ";
                    break;
                case 668485908:
                    String str5 = "ۘ۬ۡۘۗ۠۠ۜۛۡۚۥ۟۟ۡۘ";
                    while (true) {
                        switch (str5.hashCode() ^ -1759222625) {
                            case 272951031:
                                str5 = "ۥ۫ۡۘ۟۠ۨۘ۟ۜۜۖ۟ۖۘۜۤۘۘۢۜۖۘۗ۟ۡۡۡۘ۫ۙ۟";
                                break;
                            case 415721965:
                                str3 = "ۤۡۙۛ۟ۡۘۖۥۖۚۛۥۢ۫ۖۘۢۤۨ۫۫ۨۗ۠ۢ";
                                continue;
                            case 937385319:
                                if (cursor.moveToFirst()) {
                                    str5 = "ۦۢۘۘۘۥۡۘۤۙۨۘۢۙۧۤ۠ۦۘ۠۟ۥۘ";
                                    break;
                                } else {
                                    str5 = "ۛۧۚۧۘۦۙۗۦۜۧۙ۟ۜۨۘۦ۬ۘۘۡۡۚۨۘۘۢ۬ۨۘ";
                                    break;
                                }
                            case 1942093108:
                                str3 = "۫۬ۘۘۗۥۚ۬ۤۤ۫ۖۘۘۢ۬۫ۢ۟۠ۚۚۜ";
                                continue;
                        }
                    }
                    break;
                case 843222125:
                    str3 = "ۗ۫ۥۜۙۨۘ۬ۛۛۨۤۗۦۗ";
                    break;
                case 1072156542:
                    cursor.close();
                    str3 = "ۨۢۦۘۡۘۨۢ۟ۨۘۙۤۙۖ۬ۨۨۦۦ۫۠ۧ";
                    break;
                case 1079123238:
                    j2 = -1;
                    str3 = "ۗۗ۟۠ۡ۟ۚۧۖۧۥۖۘۘۛ۠ۛۖۦۘ";
                    break;
                case 1360206502:
                    str3 = "ۜ۠ۜۚۧۦۘۦۙۜۘ۟ۨۧ۠ۧۥۜۜ۫ۥۤۜۘ۬ۧۨۘ";
                    j4 = j2;
                    break;
                case 1485137851:
                    str3 = "ۗ۫ۥۜۙۨۘ۬ۛۛۨۤۗۦۗ";
                    j4 = j3;
                    break;
                case 1741327532:
                    cursor = f608a.query("GroupChatsUnreadMsgs", new String[]{"_id", "gid", "msgid", "mrkrd"}, "gid=? AND mrkrd=? AND msgid=?", new String[]{str, String.valueOf(1), str2}, (String) null, (String) null, (String) null, "1");
                    str3 = "ۚۢۛۤ۬۟ۥۘۜۜۚ۬ۛۖۜ";
                    break;
                case 2045751112:
                    str3 = "ۖ۬۠ۨۘ۬ۜ۟ۘۖۘۡ۫ۢۙۜۚ۫ۗۜۢۥ۬ۘۘ";
                    j3 = cursor.getLong(cursor.getColumnIndexOrThrow("_id"));
                    break;
            }
        }
    }

    public static boolean c(String str, String str2) {
        boolean z2 = false;
        long j2 = 0;
        String str3 = "ۛۤۘۘ۠ۘۖۘۨۥۗ۠ۘۘۥۡۖۙۨۘ";
        boolean z3 = false;
        boolean z4 = false;
        long j3 = 0;
        long j4 = 0;
        Cursor cursor = null;
        while (true) {
            switch ((str3.hashCode() ^ 524) ^ -1764737310) {
                case -2073549132:
                    String str4 = "ۧۜۢۚۜۚۥۖۗۦۦۡۜۨۖۙۤۜۛۥۘۤۜۗۜۜۜۘ";
                    while (true) {
                        switch (str4.hashCode() ^ 1513997468) {
                            case -1932025096:
                                str4 = "۫۬ۗۢۦ۠ۙۜ۟ۡۚۜۘ۬۬ۖۘۛۛۨۘ۠۫ۙ۟ۙۦۘۗۨۙ";
                                break;
                            case -1739731113:
                                str3 = "۟ۧۘۧۘۥۖ۬۫ۥۤۤۘۘۡۢۖۜ";
                                continue;
                            case -1307151730:
                                str3 = "ۢ۬ۨۘۛ۫۬ۥ۠ۢ۠ۛۛۚۘۦۘۚۜۜۘ";
                                continue;
                            case 1861105638:
                                if (cursor != null) {
                                    str4 = "ۡۚ۠ۜۛۥ۟ۨۦۘۖۡۖۖۧۤۡۤۖۘۛۗۜۤۘ۟";
                                    break;
                                } else {
                                    str4 = "ۢۧۡ۠۟ۛۢۢ۬ۨۨۦۘۘۘۥۘۡۗۛۖۤۦ";
                                    break;
                                }
                        }
                    }
                    break;
                case -868783828:
                    str3 = "ۧ۠ۡۙۧۘۘۧ۬ۤۤۨۛۨۥۤ۬۠ۡ";
                    z4 = z3;
                    break;
                case -721752566:
                    z2 = false;
                    str3 = "ۧۚۡۘۘ۫ۛ۫ۥ۠ۢ۫۟ۘۙ۠ۚۢ";
                    break;
                case -677118423:
                    str3 = "ۧۡ۫ۡۘ۠ۛۗۥۘۧۢۘ۫ۚ۫۟۫ۛۤۡۡۜۘۛ";
                    break;
                case -670024905:
                    str3 = "۟ۧۥۘۤ۠ۡۨۗۛۥۖ۬ۛۡۙ";
                    cursor = f608a.query("GroupChatsUnreadMsgs", new String[]{"_id", "gid", "msgid"}, "gid=? AND msgid=?", new String[]{str, str2}, (String) null, (String) null, (String) null, "1");
                    break;
                case -475744804:
                    j2 = -1;
                    str3 = "ۢۧۙۦۖۘۗۦۡ۟ۥۖۘ۟ۥۙ۫ۗۦۘ";
                    break;
                case -447008762:
                    str3 = "ۙۦۥۡ۫ۖۘ۬ۨۖۘ۬ۘ۬ۙۥ۫ۨۜۜۘۘۖ۟ۧ۠ۘۗۗۥۘ";
                    z3 = true;
                    break;
                case -326996270:
                    str3 = "۫ۙۗۨۛۡۡۢۦۗۘۤۢۥۧ۬۟ۨۘ";
                    break;
                case -156403211:
                    str3 = "ۛۚۦۘۚۢ۬ۤۘۙ۬ۚۡۘۥۚۗ۠۠۟ۦۡۡ";
                    break;
                case -23868502:
                    String str5 = "ۚۦۚۜۤۦۛۦۖۥۜ۬ۜۜۛۢۡۘ۠۟ۜۘۡۚۦۘ۠ۜۦ";
                    while (true) {
                        switch (str5.hashCode() ^ -776272361) {
                            case -356771860:
                                str3 = "ۗۜۧۛۥۘۘ۬ۗۛۧ۠ۘۧۥۧۘۖۧۨۥۧۗ";
                                continue;
                            case -130213915:
                                str5 = "ۦۧ۬ۘۛۙۡ۬ۦۘۚۘۙۥۘۚ۠ۖۘۘۥۜۘۛ۫ۖۘۤۦۦ";
                                break;
                            case 1466550938:
                                str3 = "ۧ۠ۡۙۧۘۘۧ۬ۤۤۨۛۨۥۤ۬۠ۡ";
                                continue;
                            case 1779868699:
                                if (j4 == -1) {
                                    str5 = "ۧ۫ۚۡۗۨۘۧۚۘۨ۟ۖۘۖ۟ۘ";
                                    break;
                                } else {
                                    str5 = "ۡ۫ۘ۠ۢ۫ۡۗۘۘۨۦۜ۟ۥ۬ۗۦۚ";
                                    break;
                                }
                        }
                    }
                    break;
                case 319332342:
                    str3 = "۫۫۠ۨۨ۫ۢۥۡۙۙۧ۟ۗۖۘۛ۫ۨۘۢۖۥۘ۟ۡۨۘ";
                    break;
                case 442961258:
                    str3 = "ۦۥۥۘۗ۟ۙ۟ۜ۬ۧۧۗۢۦۨۘۦۘۡۘ";
                    z4 = z2;
                    break;
                case 535467611:
                    str3 = "۫ۙۗۨۛۡۡۢۦۗۘۤۢۥۧ۬۟ۨۘ";
                    j4 = j3;
                    break;
                case 774878554:
                    return z4;
                case 1197550855:
                    String str6 = "۬۠ۦۘۨۧۘۡۢۨ۫ۨۨۧ۠ۡۜۛۖۙ۬ۖ۬ۡ۫ۜۨۘۘ";
                    while (true) {
                        switch (str6.hashCode() ^ -2092495661) {
                            case -876295881:
                                str3 = "ۡۛۗۢۢۥۘۜۖۦۜۦۧۘۤۖۨۘ";
                                continue;
                            case 51145686:
                                if (cursor.moveToFirst()) {
                                    str6 = "ۥۨۛ۠ۢۨۘۗۥۖۘۢۨۙۦۙۥۙۡۨۚ۠ۘۘ";
                                    break;
                                } else {
                                    str6 = "۬ۗۡۘۢۚ۟۫ۛۢۛۡۢۜ۫";
                                    break;
                                }
                            case 1975649950:
                                str3 = "ۦۜۖۘۧۥۡۢۨۡۛۙۡۢۦۘۖۘ۬ۧ۫ۦۢ۠ۚO";
                                continue;
                            case 2008613837:
                                str6 = "ۛۗ۠ۜۚ۟ۚۡۨۘۘۘ۠ۧۧۥۘۤۙۨۘ";
                                break;
                        }
                    }
                    break;
                case 1235915653:
                    str3 = "۬ۧۡۘۨۢۖۘۘۡۡۘ۟ۖ۫ۖ۬۬ۚ۠۟ۤۤۥ";
                    j4 = j2;
                    break;
                case 1537822018:
                    str3 = "ۘۧۨۘ۬ۧۘۘۗۘۘۥۚۢۢۥۘۧۘۙۦۜۜۘ";
                    j3 = cursor.getLong(cursor.getColumnIndexOrThrow("_id"));
                    break;
                case 2013066615:
                    cursor.close();
                    str3 = "ۛۚۦۘۚۢ۬ۤۘۙ۬ۚۡۘۥۚۗ۠۠۟ۦۡۡ";
                    break;
            }
        }
    }

    public static void d(long j2) {
        String str = "۫ۗۜۘۢۧۚۥۛۥۛ۠۫۫ۗ۫ۥۤۜۘۙۛۡۘۖۘۨۜۧۥۘ";
        ContentValues contentValues = null;
        while (true) {
            switch ((str.hashCode() ^ 572) ^ 1527829554) {
                case -1770454138:
                    contentValues.put("mrkrd", 1);
                    str = "ۢۨۘ۠ۘ۬ۚۖۧۘ۠ۧۘۖۗۘ";
                    break;
                case -1557870662:
                    return;
                case 262534683:
                    str = "ۗۘۖۘ۫۠ۧۦۘۗ۫ۧۘۚۙۛ۟ۧۦۤۛۡۘ";
                    break;
                case 278434424:
                    contentValues = new ContentValues();
                    str = "ۘ۠ۨۘ۫ۛۗۦۤۤ۫ۤۖۖۘ";
                    break;
                case 864011035:
                    f608a.update("GroupChatsUnreadMsgs", contentValues, a.a.e("_id = ", j2), (String[]) null);
                    str = "۟ۤۡۘۗۥۙ۫ۧۦۖۢۦۘۚ۟ۥۗ۫ۛۖۦ۫ۚ۫ۙ۠ۚۛ";
                    break;
            }
        }
    }

    public final void b(String str, String str2, String str3) {
        synchronized (this) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("gid", str);
            contentValues.put("msgid", str2);
            contentValues.put("participant_jid", str3);
            f608a.insert("GroupChatsUnreadMsgs", (String) null, contentValues);
        }
    }

    public final void close() {
        synchronized (this) {
            String str = "ۜۚۡۘۤ۬ۡۘۡۗۨۘ۠ۦۜۘۤۜۡۘۢۖۧۘ۬ۗۜ";
            while (true) {
                switch (str.hashCode() ^ 375210436) {
                    case -418721770:
                        str = "ۡۤۡۘۚۤۦۨ۫۫۟ۗۥۘۡۛۨ۟۬ۛۤۚۘ۫۠ۘۘۨۗ";
                        continue;
                    case -172028718:
                        break;
                    case 581697265:
                        f608a.close();
                        break;
                    case 2002961093:
                        if (f609b == null) {
                            str = "ۤۛ۬۬ۢۙ۟ۙۘۜۢۢۙ۟ۨۘ۠ۢۦۘ";
                            break;
                        } else {
                            str = "ۖۘۧۖ۬۟ۙۤۦۧۙ۟ۦۢ";
                            continue;
                        }
                    default:
                        continue;
                }
            }
        }
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        String str = "ۤۘۧۙۦۙۚۘۜۘۦۤۢۦ۟۬ۙۙۧ";
        while (true) {
            switch ((str.hashCode() ^ 286) ^ -155617367) {
                case -1067591406:
                    str = "ۙۧۘۘۗۚ۟ۘۘۙۧ۬۬ۨۜۘۨۧۗ";
                    break;
                case -897109133:
                    return;
                case -287665977:
                    str = "ۤۡۢۤۨۗ۟ۗ۬۟ۧۘۙۢۥۘ۠ۥۘۛۗۡۥ۫۫ۙۦ۫";
                    break;
                case 686862534:
                    sQLiteDatabase.execSQL("create table GroupChatsUnreadMsgs(_id INTEGER PRIMARY KEY AUTOINCREMENT, gid TEXT NOT NULL, msgid TEXT NOT NULL, participant_jid TEXT NOT NULL, mrkrd INTEGER DEFAULT 0 );");
                    str = "ۖۗۜۘۖ۠ۗ۬ۖۚۨۢۖۘۢۜۘۥۥۖۜۦۢ";
                    break;
            }
        }
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        String str = "۟ۙۦۘۗۧۗۗۧۘۢ۬ۤۡۧۖۢۥۖۘۚۧۙ";
        while (true) {
            switch ((str.hashCode() ^ 490) ^ -1417859791) {
                case -1849319169:
                    str = "ۛۗۡ۟ۦۘۘۢۨۜۘۘۨۧۘۤ۟ۗۡۚۧ";
                    break;
                case -103257565:
                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS GroupChatsUnreadMsgs");
                    str = "ۖ۫ۢۢ۟۠ۨۗۢۖ۬۟ۛۛۨۘۡۘۙۡۗ۟ۦۨ۬ۥۦۘ";
                    break;
                case 795337063:
                    return;
                case 1020378539:
                    sQLiteDatabase.execSQL("create table GroupChatsUnreadMsgs(_id INTEGER PRIMARY KEY AUTOINCREMENT, gid TEXT NOT NULL, msgid TEXT NOT NULL, participant_jid TEXT NOT NULL, mrkrd INTEGER DEFAULT 0 );");
                    str = "ۢۖۖ۬ۤۘۘۘ۟ۘۘ۬ۜۡۘۧۙۜۜۢۢۗۛۚ";
                    break;
                case 1217910024:
                    str = "ۜ۬ۢۗ۠ۡۘ۫ۙۢۛۛۧۦۗ";
                    break;
                case 2057948781:
                    str = "ۛۨۘۢۥۘۛ۟۬ۥۧۚۙۗۖۖۤۙۨۨۥ";
                    break;
                case 2120581786:
                    str = "ۛۥۤ۫ۜۧۢ۟ۜۜۢۡۘۥ۫ۙۢۢ";
                    break;
            }
        }
    }
}
