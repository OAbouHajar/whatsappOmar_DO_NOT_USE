package com.obwhatsapp.yo;

import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import com.obwhatsapp.jobqueue.job.SendReadReceiptJob;
import com.obwhatsapp.youbasha.task.utils;
import com.whatsapp.jid.DeviceJid;

public final class b extends Thread {

    /* renamed from: a  reason: collision with root package name */
    public Cursor f732a;

    /* renamed from: b  reason: collision with root package name */
    public final String f733b;

    /* renamed from: c  reason: collision with root package name */
    public final SQLiteDatabase f734c = a.f608a;

    public b(String str) {
        this.f733b = str;
        yo.f126r.getClass();
    }

    public final void run() {
        String str = this.f733b;
        SQLiteDatabase sQLiteDatabase = this.f734c;
        String str2 = "ۛ۟۬۫ۨۧۘ۬۠ۖۦۖۨۧۨۘ۠ۡۗۚۧۚ۫۟ۡۘۘۙ";
        while (true) {
            switch (str2.hashCode() ^ 1229971209) {
                case -2006185088:
                    str2 = "ۛۢۗ۠ۚۘۢۛۥۨۦۦۡۘۘۥۜۘ";
                    break;
                case -1714809597:
                    return;
                case -1274461337:
                    if (sQLiteDatabase != null) {
                        str2 = "۟ۜۦۘۡۢۢ۠ۡۥۥۘۥۥۜۘۢۗۜۨۥۧۘ۫ۜۜۙۚ";
                        break;
                    } else {
                        str2 = "ۡۖۨۘ۠ۡۘۗۖۜۘۤ۟ۤۖۜۢۛۦۘۥۛ۬";
                        break;
                    }
                case 100829329:
                    try {
                        String[] strArr = new String[1];
                        strArr[0] = str;
                        long queryNumEntries = DatabaseUtils.queryNumEntries(sQLiteDatabase, "GroupChatsUnreadMsgs", "gid=?", strArr);
                        String str3 = "ۡۖۚ۬ۦۙۦۦۗۥ۬ۚۗۖۢ۟ۦۡ۟۠ۘ۫۟ۨ";
                        while (true) {
                            switch (str3.hashCode() ^ -302510264) {
                                case -1853292318:
                                    if (queryNumEntries >= 1) {
                                        str3 = "ۥۛۡۘ۬ۥۚۨ۬۟ۜۘۦۢۗ";
                                        break;
                                    } else {
                                        str3 = "ۛۥۦ۟ۚۜ۫ۘۘۨۙۛ۠ۜۢۧۥۤۜۧۤ";
                                        continue;
                                    }
                                case 322540925:
                                    str3 = "ۤۗۗۡ۠۬ۨۦ۬ۖ۬ۖۘۜۗ۟ۜۨۘ۫ۧۢ";
                                    continue;
                                case 1430251024:
                                    int i2 = 0;
                                    while (true) {
                                        Cursor query = this.f734c.query("GroupChatsUnreadMsgs", new String[]{"_id", "gid", "msgid", "participant_jid"}, "gid=?", strArr, (String) null, (String) null, (String) null, i2 + ", " + 1000);
                                        this.f732a = query;
                                        String str4 = "ۥۗۥۦۧۨۙۗۦۛۚۛۖ۟۟ۙۖۦۘۘۜۡۘۧۘۧۘۢۥۤ";
                                        while (true) {
                                            switch (str4.hashCode() ^ -1303283146) {
                                                case -958903116:
                                                    while (true) {
                                                        String str5 = "ۗ۬ۖۘۥۛۦۖۘۧۘۢۧ۬ۡ۠ۘۘۗۥۥۘ۟۠ۡۘ۠۟ۖۘ";
                                                        while (true) {
                                                            switch (str5.hashCode() ^ 771700476) {
                                                                case -1471185036:
                                                                    Cursor cursor = this.f732a;
                                                                    String[] StringToStringArray = utils.StringToStringArray(cursor.getString(cursor.getColumnIndexOrThrow("msgid")));
                                                                    Cursor cursor2 = this.f732a;
                                                                    dep.a(new SendReadReceiptJob(dep.gen_b(str), dep.gen_b(cursor2.getString(cursor2.getColumnIndexOrThrow("participant_jid"))), (DeviceJid) null, StringToStringArray, System.currentTimeMillis(), 0, false));
                                                                    a aVar = yo.f126r;
                                                                    Cursor cursor3 = this.f732a;
                                                                    long j2 = cursor3.getLong(cursor3.getColumnIndexOrThrow("_id"));
                                                                    aVar.getClass();
                                                                    a.d(j2);
                                                                case 704057233:
                                                                    String str6 = "ۥ۟ۨۘۙۖۜۚ۟ۘۘۥ۬۫ۧۥۘۗۦۧۘ۬ۦۘۨ۬ۢ۬۟";
                                                                    while (true) {
                                                                        switch (str6.hashCode() ^ -153171107) {
                                                                            case -1492653314:
                                                                                if (((long) (this.f732a.getCount() + i2)) < queryNumEntries) {
                                                                                    str6 = "ۚ۬ۢۨۦۚ۠ۙۢۤۗۢ۟ۥۛ۟ۦۡۧۧۡۖۦۨ";
                                                                                    break;
                                                                                } else {
                                                                                    str6 = "ۦۜۨۘۥ۠ۢۧۢۘ۬ۚۨ۬۫۫۬ۜ۬";
                                                                                    break;
                                                                                }
                                                                            case -937710413:
                                                                                str6 = "۠ۚۜۖۘۗۖۖۡۖۢ۠ۧۜۖۘ۬ۧۘ۬ۥۨۘ۟۠ۦۘ";
                                                                                break;
                                                                            case -485028127:
                                                                                this.f732a.close();
                                                                                break;
                                                                            case 1505649651:
                                                                                i2 += 1000;
                                                                        }
                                                                    }
                                                                    break;
                                                                case 1296322152:
                                                                    if (!this.f732a.moveToNext()) {
                                                                        str5 = "ۧ۠ۜ۟ۗۜۘ۠ۡۖۢۘۖۨ۠ۨۘۖۖ۟ۖۙۥ";
                                                                        break;
                                                                    } else {
                                                                        str5 = "ۖۥ۫ۦۡۨۘۦۖۧۨۖۦۜۦۘۘۧ۠ۙۛۖۘۘۛۦۨۘ";
                                                                        break;
                                                                    }
                                                                case 2015719736:
                                                                    str5 = "ۜۖ۬۠۠ۙۛۖۨۘ۠ۡۦۙ۟ۧۗۛۖۖۜۨۡۘۤ۟ۘ";
                                                                    break;
                                                            }
                                                        }
                                                    }
                                                    break;
                                                case 337831121:
                                                    str4 = "ۗ۬ۦۘۢۜۧۘ۠ۦۙۨۥۖ۟۫۫ۦۢ";
                                                    break;
                                                case 638634421:
                                                    break;
                                                case 1285259409:
                                                    if (query != null) {
                                                        str4 = "ۢ۟ۘۘۦۖ۠ۗۙ۟۠ۖ۟ۧۥۡۦ۟۟";
                                                        break;
                                                    } else {
                                                        str4 = "ۙ۫ۚ۟ۘۥ۫ۡۦۜۜۦۘۥۥۛۘۨۨ۬ۘۡۥۧۨۘ۬ۖۧۘ";
                                                        break;
                                                    }
                                            }
                                        }
                                    }
                                    Cursor cursor4 = this.f732a;
                                    String str7 = "ۥۡۧۘ۠ۦۥۘۚۖۜۘ۬ۘۖۘ۬ۢۜۘۙۖۖ۫۟ۦ۫ۙۜ";
                                    while (true) {
                                        switch (str7.hashCode() ^ -523412052) {
                                            case -1250168561:
                                                str7 = "ۚۤۖ۬ۡۛۡۘۨۘ۫۬ۨۘ۫ۧۤۨۜۦۘۨۢۘۘۗ۠ۘۘ";
                                                continue;
                                            case -1153939410:
                                                return;
                                            case -746704549:
                                                if (cursor4 == null) {
                                                    str7 = "۠۬ۥۖۢۡۘ۫ۚۛۢ۫ۤۡ۬ۦۙ۟۫ۤۡۨۘ";
                                                    break;
                                                } else {
                                                    str7 = "ۙۙۙ۫ۙۛۢۥۜۘ۫ۖ۠ۖ۟۟۫ۖۢ";
                                                    continue;
                                                }
                                            case 1733513299:
                                                String str8 = "ۖۙۘۥۨۧ۫ۧۤۨۜۡ۬ۚۜۘ";
                                                while (true) {
                                                    switch (str8.hashCode() ^ -4888115) {
                                                        case -59961872:
                                                            return;
                                                        case 306830675:
                                                            if (!cursor4.isClosed()) {
                                                                str8 = "۟۫ۘۗۢ۫۬ۧۨۥۡۧۤۙۗۚۥۘۥۛ";
                                                                break;
                                                            } else {
                                                                str8 = "۫ۤۡۘۤۤۘۜۧۡۖۖۘۚۡۘ۫ۗ۬ۢۙۦۘۚۙۘۖۜۚ";
                                                                continue;
                                                            }
                                                        case 613795250:
                                                            break;
                                                        case 667898142:
                                                            str8 = "ۙۨۘۘۦ۫ۜۘۜ۫ۨۘۘۡۙ۠۠ۦۘ۠ۡۗۡۖۗ";
                                                            continue;
                                                    }
                                                }
                                                break;
                                            default:
                                                continue;
                                        }
                                    }
                                    break;
                                case 2139234985:
                                    Cursor cursor5 = this.f732a;
                                    String str9 = "ۚۖۦۘۤۜۡۜۧۥۗۘۛۨۡۚۤۦۧۚۛۧ";
                                    while (true) {
                                        switch (str9.hashCode() ^ 379484489) {
                                            case -467570098:
                                                if (cursor5 == null) {
                                                    str9 = "ۥۨۛۜۖۖۘۧۚۜۘ۫ۗۜۘ۟ۚۧۛۜۖ";
                                                    break;
                                                } else {
                                                    str9 = "ۦۥۘۥ۠ۜ۬ۦۚۧۖۘۘۥ۠۟ۢ۫ۖ۫ۘ۫ۚۢۛۙۛ";
                                                    break;
                                                }
                                            case -127641379:
                                                return;
                                            case 695103404:
                                                String str10 = "ۖۛۖۛ۬۫ۚۛۛۢ۫ۜۦۗۚ";
                                                while (true) {
                                                    switch (str10.hashCode() ^ 1834756911) {
                                                        case -805456074:
                                                            this.f732a.close();
                                                            return;
                                                        case 533490896:
                                                            str10 = "ۢۤۥۘۨ۠۠ۡۨۡ۬۟ۜۘۡ۟۠ۥۢۨۘ";
                                                            break;
                                                        case 789555688:
                                                            if (cursor5.isClosed()) {
                                                                str10 = "ۢۗۖۘۦۙۖۘ۠ۨۜۘۘۥ۠۠ۦ۬ۤۖۧۘ";
                                                                break;
                                                            } else {
                                                                str10 = "ۥۖ۫ۗۛۗۢۨ۫ۨۘۛ۟ۢۚۚۢ۟";
                                                                break;
                                                            }
                                                        case 1362671145:
                                                            return;
                                                    }
                                                }
                                                break;
                                            case 1595100718:
                                                str9 = "ۢۤۘۘۨۖ۬۫۠۟ۨۦۖۘ۬۟ۦ";
                                                break;
                                        }
                                    }
                                    break;
                                default:
                                    continue;
                            }
                        }
                    } catch (Exception e2) {
                        Cursor cursor6 = this.f732a;
                        String str11 = "ۡ۬ۘۢۥۦۚۗۥۙۢۜۧۘۜۙۤۨۦۖ۬";
                        while (true) {
                            switch (str11.hashCode() ^ -1227545310) {
                                case -1565659950:
                                    return;
                                case -1197862389:
                                    if (cursor6 != null) {
                                        str11 = "ۦ۫ۘۘۚۛۥۖۤۦ۠ۧۜۘۡۙ۬ۖۡۛۥ۬ۡۦ۟ۙ۬ۛ";
                                        break;
                                    } else {
                                        str11 = "ۗۛۢۚۘ۠ۢۢ۟ۜ۬ۥۘ۟ۧۛۛۚۦۚۙۗۦۥۛۦ۠";
                                        continue;
                                    }
                                case 691179695:
                                    str11 = "۠۠ۨ۟ۙۤۥۗ۫ۘۜۨۨۗۙۖۛۢۘۧۘۢۜۡۘ";
                                    continue;
                                case 1472214232:
                                    String str12 = "ۛ۬ۙۦۗ۬ۙۨۚ۠ۨ۬ۡۥۢ";
                                    while (true) {
                                        switch (str12.hashCode() ^ -863218289) {
                                            case -2075689593:
                                                str12 = "ۘۘۥۘۦۘۘۢۜۚ۠ۖۨۘۚۢۜۘ۬ۤۖۡۢۨۘۧ۬۠ۚۦۡۘ";
                                                continue;
                                            case -1773364163:
                                                if (cursor6.isClosed()) {
                                                    str12 = "ۥۥۤۥ۬ۡۦۗ۬ۢۗۚۙۜۜۛۖۜۦۥۡۘۦۦۥ۬ۧۘ";
                                                    break;
                                                } else {
                                                    str12 = "ۜۧ۬ۥۜ۠ۤۦۤۘۡۦۘۙۘۥۘۛۨۜۘۧۧۨۘۡۗۦۘ";
                                                    continue;
                                                }
                                            case -569463399:
                                                return;
                                            case -160216855:
                                                break;
                                        }
                                    }
                            }
                        }
                    } catch (Throwable th) {
                        Throwable th2 = th;
                        Cursor cursor7 = this.f732a;
                        String str13 = "ۧۙۥ۫ۛۦۗۚ۟ۖۜۡۘۜۦۥ";
                        while (true) {
                            switch (str13.hashCode() ^ -1901380295) {
                                case -1831476409:
                                    String str14 = "۟ۧۡۛ۫ۨۥۧۥۘ۟ۙۨۘ۟۠ۛۦۖۜۘ";
                                    while (true) {
                                        switch (str14.hashCode() ^ -691264229) {
                                            case -1410883847:
                                                this.f732a.close();
                                                break;
                                            case 1139094:
                                                str14 = "ۗۜۦ۫ۛۖۛۤۤۛ۫ۦۘۙ۟ۨۘۙۨ۟";
                                                continue;
                                            case 960304494:
                                                break;
                                            case 1346787635:
                                                if (cursor7.isClosed()) {
                                                    str14 = "ۚ۬ۛۜۘۧۢۚ۫ۗۥ۟ۛۤۨ۟ۢۗ";
                                                    break;
                                                } else {
                                                    str14 = "ۘۧۡۛۦۥ۫ۚۨۢۙۜۡۧۥۘ";
                                                    continue;
                                                }
                                        }
                                    }
                                case -1685597759:
                                    break;
                                case 753472988:
                                    if (cursor7 != null) {
                                        str13 = "ۡۨۤۘۖۢۧ۫ۦۘ۟ۤۙۢۨ۬ۨۛ۟ۙۧۜ";
                                        break;
                                    } else {
                                        str13 = "ۡۦ۫۠ۡۧۘۤ۬ۜ۬ۗۦۤ۬۟";
                                        continue;
                                    }
                                case 1558655688:
                                    str13 = "ۡۢۦۘۡ۫ۗۜۡۗۨۙۡۖۚۤۚۘ۫ۧۜۛۙ۟ۡۘۧۧ";
                                    continue;
                            }
                        }
                        throw th2;
                    }
                    this.f732a.close();
                    return;
            }
        }
    }
}
