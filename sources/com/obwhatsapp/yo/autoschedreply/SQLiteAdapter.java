package com.obwhatsapp.yo.autoschedreply;

import a.a;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.obwhatsapp.youbasha.ui.YoSettings.HideMedia;
import java.util.ArrayList;

public class SQLiteAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final Context f672a;

    /* renamed from: b  reason: collision with root package name */
    public SQLiteDatabase f673b;

    /* renamed from: c  reason: collision with root package name */
    public SQLite f674c;

    public SQLiteAdapter(Context context) {
        this.f672a = context;
    }

    public long cc(String str, String str2, String str3, String str4, String str5, String str6) {
        String str7 = "ۨ۬ۤۡ۫ۜۚۗۡ۫ۦۜۘۜۛۗۡۦۤۚۘ";
        ContentValues contentValues = null;
        while (true) {
            switch ((str7.hashCode() ^ 623) ^ -621471550) {
                case -2054222140:
                    str7 = "۬۫ۤۖۤۜۘ۬۠ۥۘۥۡ۠ۜۘۙۨۛۢ";
                    break;
                case -1875658131:
                    str7 = "ۦ۬ۨۡۘۙۜ۫۠ۤۚۤۤ۟";
                    break;
                case -1754899507:
                    contentValues.put("text_message", str2);
                    str7 = "ۛۛ۟۬ۡۖۘۖ۟ۛۢۜۧۨۚۚ۟ۙۧ";
                    break;
                case -1624628997:
                    contentValues.put("start_date", str3);
                    str7 = "ۧۨۥۘۨ۠ۜۤۚۗۧۨۖۘ۟۠ۖ۠۟ۨۗ۬ۛۨ۟ۥۘ";
                    break;
                case -1548490216:
                    str7 = "ۙۨۖۜۧۦۘۧ۟۫ۥۗۡۘۧۚۧۙ۠ۢ۫ۘ۟ۖۢ۟";
                    break;
                case -1532842121:
                    contentValues.put("receipt", str);
                    str7 = "۫۫ۛۢۖۧۜۨۛ۠۬۫ۜۘۙۙۦۨۘۜ۟ۢ۬۟۠";
                    break;
                case -1524603468:
                    str7 = "ۜۥۡۦ۬۬ۦۛۤۚۤۤۧۜۨۘ۟ۛۘۨ۫ۜۘ";
                    break;
                case -1055602195:
                    str7 = "ۖۥۘ۫۬ۖۘۗۥۖۘۡۙۘۧۨۤۨۥۗ۠ۤۛۧۤ";
                    break;
                case -714483344:
                    contentValues = new ContentValues();
                    str7 = "ۡۧ۬ۡ۬ۨۘۘۖۧۢ۬ۛۗۘۤ";
                    break;
                case -355208306:
                    contentValues.put("clock", str5);
                    str7 = "ۤ۟۫ۜۧۧۘۦۨۘ۠ۢۥ۠ۤۥۜۨ۟ۡۤ۠ۢۘۗۜۤۤ";
                    break;
                case -272002685:
                    str7 = "ۢۚۘۘۧۨ۟۬ۧۢۦۚۘۘ۟ۜۗۤۥۘۙۜۖ۫۬۫";
                    break;
                case -170657355:
                    str7 = "ۨۜۘۘۥۦۨۘۖ۠ۥۖۘۧۛۗ۟ۧۖۦۘ";
                    break;
                case 1187579061:
                    return this.f673b.insert("Scheduler", (String) null, contentValues);
                case 1553132576:
                    contentValues.put("frequency_type", str6);
                    str7 = "ۖۙۘۘۢۙۥۦۤۥۘۗۖۦۘۤۡۘ۬۠ۙ۬ۥۨۦ۬ۤ۫ۤۗ";
                    break;
                case 1966037061:
                    contentValues.put("end_date", str4);
                    str7 = "ۗۗۦۘۛۙۘۘۜ۠ۦۘۗۥۡۜۛۦۘ۟ۜۙ۠ۥ";
                    break;
            }
        }
    }

    public long cc(ArrayList arrayList, String str, String str2, String str3, String str4, String str5) {
        ContentValues contentValues = null;
        StringBuilder sb = null;
        Object[] objArr = null;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        String str6 = "ۗۚۤ۬ۢۨۘۥۦ۫ۛۨۧ۠ۥۖۘ";
        while (true) {
            switch ((str6.hashCode() ^ 733) ^ 766483590) {
                case -2075842822:
                    contentValues.put("text_message", str);
                    str6 = "۠ۜۥۘ۬۠۬ۨۜۨۘۗۤۡۦۘۘۨۛ۟ۖۡۙۡۨ";
                    break;
                case -2066546413:
                    contentValues.put("start_date", str2);
                    str6 = "ۛۤۖۙۧۖۧۚۘۙۘۡۘۚ۫ۚۥۧۙۖۥۙ۬۟";
                    break;
                case -2064317959:
                    sb.append(objArr[i5]);
                    str6 = "ۚۥۨ۬ۜ۫ۡ۬۠ۢۗ۬ۘۥۖۙۚۜۘۛ۫ۨۘ";
                    break;
                case -1965393069:
                    i4 = i5 + 1;
                    str6 = "ۘۧۚۢۛۘۖۙۨۜۘۜۘۥۢۡۘۙۘۜ";
                    break;
                case -1904195843:
                    sb.append(",");
                    str6 = "۠ۛۥۙۜۦ۫ۗ۬ۗۥ۟۫ۗۧۤ۫ۙۧۘۢ۫ۚۧ";
                    break;
                case -1884575106:
                    sb = new StringBuilder();
                    str6 = "ۘ۫ۧۤۚۧۚ۬ۤ۠۬ۘۛۖۖۤ۟ۤ۫۬ۨۘۘۙۧ";
                    break;
                case -1745492716:
                    str6 = "ۨۘۦۘۗ۠ۦۡ۟ۤ۟ۤۢۥ۫ۥۘ۫۠ۖۢۡۢۨۖۦۤ۟ۦ";
                    i5 = i3;
                    break;
                case -1383289829:
                    str6 = "ۡ۟ۘۘۚۥۜۘۜۥ۬ۖۡۦۡۛۨۧۦۜۘۥ۫ۘ";
                    i5 = i4;
                    break;
                case -1101407577:
                    return this.f673b.insert("Scheduler", (String) null, contentValues);
                case -721596034:
                    contentValues.put("frequency_type", str5);
                    str6 = "ۚ۫ۡۘۥۛ۫ۚ۟ۤۖۗۥۘۢۗ۟ۚۛ۬ۛۜ۫ۡۜۚ";
                    break;
                case -512212829:
                    str6 = "۬ۤ۟ۡۘ۫۫ۨۘ۫ۥۚ۬۠ۥۘۨۢۛۙۘۛۗۢۗ";
                    break;
                case -259597507:
                    str6 = "ۨۘۦۘۗ۠ۦۡ۟ۤ۟ۤۢۥ۫ۥۘ۫۠ۖۢۡۢۨۖۦۤ۟ۦ";
                    break;
                case -243456458:
                    contentValues.put("clock", str4);
                    str6 = "ۚۗ۫ۤۜۨۢۜۡۗۡ۬ۨۗ۫ۤۦۧۘ۟۬ۤ";
                    break;
                case -219358037:
                    objArr = arrayList.toArray();
                    str6 = "۟ۘۚ۫ۡۢ۫ۗۦ۟ۦ۫ۜۢۜۘۘۡۖۘۥۧۘۘۨۢۨۨۗۧ";
                    break;
                case 174628925:
                    str6 = "ۗۙۜۘۛۦ۬ۖۚۦۘۚۧۨۘۨۙۘۛۢۘۘۨۦ۠ۙۧۡۦۘۧ";
                    break;
                case 535517069:
                    contentValues.put("receipt", sb.toString());
                    str6 = "۬ۢۦۘۛ۬ۗۖۘۤۘۙۙ۟۬";
                    break;
                case 813224675:
                    str6 = "۠ۢۜۘۚۚۗۧۢۘۢ۠ۗۨۘۧۙ۟ۡۘ";
                    break;
                case 882470309:
                    str6 = "ۡۧ۟ۚۤۚۦۚۜۤ۟۫ۤۤۜۘۥۧۘ۫ۡ۟";
                    break;
                case 1059267765:
                    i2 = objArr.length;
                    str6 = "ۥ۟ۧۙ۠ۛ۫ۤۖۘ۠ۡۤۘۛۨۘۖۥ۫۟ۤۜۤۨۘ";
                    break;
                case 1256959703:
                    contentValues = new ContentValues();
                    str6 = "ۦۙۜۘۥۜۜ۬ۨۘۘ۫۫۟ۥۤۗۢۙۗۜۚۜۤ۠";
                    break;
                case 1511460980:
                    contentValues.put("end_date", str3);
                    str6 = "ۦۦۚۢۧۦۥ۬ۖۘۤۛۥۤۢۦۤ۫ۜۘ";
                    break;
                case 1633729973:
                    str6 = "ۡۘۜۜۛۥ۬ۤۦۘۚۤۖۙۚۛۦۢۨۘ";
                    break;
                case 1757182718:
                    str6 = "ۦۢ۫ۡۗۡۘ۫ۗۨ۟ۨۤۡۧۖۥ۟ۨۘۦۨۘۖۢۛ";
                    break;
                case 1924003198:
                    i3 = 0;
                    str6 = "۟ۥۚۗۦۘۥۜۡۘۙۡۜۦۙ۠ۨۘۛ";
                    break;
                case 2004504004:
                    str6 = "ۥۘۜۗۜۢۛۜۤۖۚۛۜ۬ۡۘۚۥۤ۫ۦ۠ۢۚۥۘۖۢۘ";
                    break;
                case 2025100219:
                    String str7 = "ۢۖۖۦۙۥۤۖۦۚۢۧ۠ۜۡۧۡۖۡ۟ۢ";
                    while (true) {
                        switch (str7.hashCode() ^ 311623408) {
                            case -1182721631:
                                str6 = "ۢ۟ۙۡۛۜۨۧۖۡۡۨۘۦۦۨۜ۬ۙ";
                                continue;
                            case -1059244130:
                                str6 = "ۙۜ۫ۡۦۨۘۘ۟ۘۨۙۜ۟ۡ۟۫ۚۤۦۥۤ";
                                continue;
                            case -624707646:
                                if (i5 >= i2) {
                                    str7 = "ۜۢۙۧۗۙۜ۬ۥۗۧۡۘ۫ۘ۫ۧۨۦۦۨۛۙ۟۠";
                                    break;
                                } else {
                                    str7 = "ۢۡۥۙۤۘۛۜۨۗۖۡۘ۬ۨ۟";
                                    break;
                                }
                            case 580889245:
                                str7 = "ۡۧ۠ۢۜۚۦۖۤ۠ۥۥۘۚۛۘ";
                                break;
                        }
                    }
                    break;
            }
        }
    }

    public void close() {
        String str = "ۛۚۘۖ۫ۜۘ۠ۛۘۘۥۙۖۧۨۨۘۨۥۥۘۛۚ۬ۦۖۙۨۦۧۘ";
        while (true) {
            switch ((str.hashCode() ^ HideMedia.VIDEOS) ^ -920560811) {
                case -1089038588:
                    return;
                case -837382063:
                    str = "ۙ۠ۥۧۖۤ۟ۡۛ۠۟۠۠ۢۖ۠ۚۖ";
                    break;
                case -228258913:
                    this.f674c.close();
                    str = "۫ۧۚۙۘۡ۠ۧۖۘۚۗۖۘۗۧ";
                    break;
            }
        }
    }

    public long delete(int i2) {
        String str = "ۙۘ۠ۧۥۜۘ۟ۥۘۘ۠ۚۜۘۦۧۧ۠ۦۨۥۚۗۦۨۙ";
        StringBuilder sb = null;
        SQLiteDatabase sQLiteDatabase = null;
        while (true) {
            switch ((str.hashCode() ^ 884) ^ -44549176) {
                case -925900846:
                    return (long) sQLiteDatabase.delete("Scheduler", sb.toString(), (String[]) null);
                case -607355372:
                    str = "۠۟ۥ۬ۛۨۘۜ۠۠ۢۦۢۡۚۥۘ";
                    break;
                case -598897413:
                    sQLiteDatabase = this.f673b;
                    str = "ۜ۬ۥۘ۬۫ۜۙۗۙۡۘۥۙۜۦۜۗ";
                    break;
                case -296308753:
                    str = "ۘۗ۫۠۬ۨۡ۠ۤ۬ۚۡۘۜۥۧۗۡۨۘ۟۬ۥۢ۬۫";
                    break;
                case 740685212:
                    sb.append(i2);
                    str = "ۚۡ۫ۖ۫ۜۘ۟ۤۦ۫ۢ۫ۛ۬ۥۘۘۜۦۘ۟ۢۥۘ۬۠ۖۘ";
                    break;
                case 1917793101:
                    sb = new StringBuilder("_id=");
                    str = "ۡۥۥۘۨۤۜۘ۟۟ۥۢۜ۠ۚ۟ۨۘۧۢ۠";
                    break;
            }
        }
    }

    public int gg(String str, int i2) {
        String str2 = "ۛۧۧ۟۫ۧۢۗ۠ۡۛۥۘۡۚۚۡۧۘۜ۟ۥۘ۫۟ۚۛ۫ۗ";
        ContentValues contentValues = null;
        while (true) {
            switch ((str2.hashCode() ^ 56) ^ 584805424) {
                case -1706460709:
                    contentValues = new ContentValues();
                    str2 = "ۨۤۤۧۥ۠ۜۡ۟ۘۚۘۘۜۜۚۙۘۨ۫۫ۛ";
                    break;
                case -1703988161:
                    str2 = "ۢۙ۟ۤ۬۬ۘۗۡۚۨ۫۬ۜۚ";
                    break;
                case -1081033886:
                    contentValues.put("text_message", str);
                    str2 = "ۙ۟ۛۜۜۧۘۜۖۥۘۥۥۙۨۛ۠ۗۡۘ";
                    break;
                case -895735475:
                    str2 = "ۚۢۘۛۦۦ۠ۖۜۗۚۡۘۧ۫۠ۜۛۙۚۢ۫ۦۛۦۘ";
                    break;
                case 108304264:
                    str2 = "۟۫ۦۘۡۡۨۘۥ۠ۦۨۡۘۘۡۧۡ";
                    break;
                case 1877276111:
                    return this.f673b.update("Scheduler", contentValues, a.d("_id=", i2), (String[]) null);
            }
        }
    }

    public int gg(String str, String str2, String str3, String str4, String str5, String str6, int i2) {
        String str7 = "۬ۛۥۖۦۘۧ۬ۢۚۥۚۘۗ۠";
        ContentValues contentValues = null;
        while (true) {
            switch ((str7.hashCode() ^ 972) ^ -375621214) {
                case -1445625465:
                    contentValues = new ContentValues();
                    str7 = "ۨ۟ۘۘ۟ۙۙۙ۬ۘۘۢۖۨۜ۫ۛۘ۬ۙۛۤۦۤۡۜۜۖۗ";
                    break;
                case -1431111648:
                    str7 = "ۡۨۧۜۘۛۢۥۤۘۚۧۜۙۖۘ";
                    break;
                case -1290224317:
                    contentValues.put("start_date", str3);
                    str7 = "ۚۜۦۥ۠۬ۗۧۜۥۡۚۨۚ";
                    break;
                case -1184467530:
                    str7 = "ۜ۟ۗۜۚۤۜ۟ۨۚۧۗ۬ۧ";
                    break;
                case -1171246088:
                    contentValues.put("frequency_type", str6);
                    str7 = "۬۬ۤۧۜۥۘۡۜۜ۬ۧۘۤۢۧ";
                    break;
                case -838753271:
                    str7 = "ۗۨۧۘۛۗۖ۫ۡۗۙۛۨۘ۠۬ۥۨ۟۠ۦۜۖۘۡۧۛۙ۟۬";
                    break;
                case -544005780:
                    str7 = "ۖۡۛ۠ۘۗۦۧۖ۫ۨۖۙۛۙ۠۠ۡۦۖۥ";
                    break;
                case -486888525:
                    contentValues.put("clock", str5);
                    str7 = "ۡۨۛۖۜۛۧ۫ۙۚۖۦۦۥۤ۠ۖۛ";
                    break;
                case -389187341:
                    str7 = "ۘ۠ۜ۟ۤۡۖۤ۬۠ۖۙۖۧۦۡ۬ۖۚۡۘ";
                    break;
                case 70277936:
                    contentValues.put("text_message", str2);
                    str7 = "ۤۗۨۘ۬ۨۧۘ۟ۖۙ۠ۧۦۘۦۜۜۘۚۥۙۨۨۜۘ";
                    break;
                case 1179615695:
                    return this.f673b.update("Scheduler", contentValues, a.d("_id=", i2), (String[]) null);
                case 1207357980:
                    str7 = "ۦۜۢ۬ۤۚ۟ۨۙۢۚۥۤۚ۬ۢۨۖۖ۬ۧۘۥۘ";
                    break;
                case 1606632831:
                    contentValues.put("end_date", str4);
                    str7 = "۫ۢۜ۠ۨ۟ۖۙۨۗ۫ۛۢۡ۠۫ۢۨۘۦۧۘۖۙۡۘ";
                    break;
                case 1765320839:
                    str7 = "ۚ۫ۦۦۗۚۛۧۚۖۚۛۦۡۥۗ۬ۡۘۚ۫ۤۤ۠۟";
                    break;
                case 1899216167:
                    contentValues.put("receipt", str);
                    str7 = "ۨۢ۟ۥۤ۟ۛ۠ۙۚۡ۠ۜۨ۟ۛۦۘۢۖ۬";
                    break;
                case 2001587898:
                    str7 = "۬ۘۧۘ۠ۗۛ۠ۘ۟۬ۖ۟ۙ۟ۘۤۗۙ";
                    break;
            }
        }
    }

    public int gg(ArrayList arrayList, String str, String str2, String str3, String str4, String str5, int i2) {
        ContentValues contentValues = null;
        StringBuilder sb = null;
        Object[] objArr = null;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        String str6 = "ۨۢۖۘۗ۬ۤۡۗۖۘ۠ۢۥۘ۠ۢۡ";
        while (true) {
            switch ((str6.hashCode() ^ 181) ^ 224178554) {
                case -2085891612:
                    i3 = objArr.length;
                    str6 = "۬ۡۤۖۖۨۘۨ۟ۥ۫۟۠ۦ۠ۖۘۙۗۡۘۚۜۨ۟ۖ";
                    break;
                case -2012964287:
                    objArr = arrayList.toArray();
                    str6 = "۟ۢۡۘ۠ۡۘۘۚ۠ۨۘۧۛۚۨۨۥۦۚۨۘ۬۬۟ۚۘۖۘ";
                    break;
                case -1967833683:
                    str6 = "ۗۚۚۖ۫ۤ۠۟ۡۜۢۜۢۡۘۘۛ۬ۡۘ";
                    i6 = i5;
                    break;
                case -1942847021:
                    str6 = "ۥ۠ۧۜۘۜۖۘۥۜۘۢ۬ۡ۫۠ۢۤ۟ۡۗ";
                    i6 = i4;
                    break;
                case -1875765698:
                    sb = new StringBuilder();
                    str6 = "ۖ۬ۛۢۗۖۡۢۜۘ۫ۜۧۗۤۨ۬ۜۥۘۗۗۛۗۙۨۘۗۤۧ";
                    break;
                case -1854669555:
                    contentValues.put("receipt", sb.toString());
                    str6 = "۫۟ۜۚۨ۫ۖۖۜۦۦۚۤۦ۟ۦۘۧۘ۟۟ۙ";
                    break;
                case -1811774252:
                    contentValues.put("frequency_type", str5);
                    str6 = "ۜۜۢۖۨ۟۫ۖۛۗۥۨۘۦۡۚ۬ۛۘۥۦ۬ۤ۬ۜۘۖۛۢ";
                    break;
                case -1678621796:
                    str6 = "ۥ۠ۧۜۘۜۖۘۥۜۘۢ۬ۡ۫۠ۢۤ۟ۡۗ";
                    break;
                case -1325820189:
                    contentValues.put("text_message", str);
                    str6 = "۫ۚۥۛۨۥۚ۟۟ۛۗۘۘۙۦۖۖۥۡۘ۟ۚۥۘۜۚۛ۟ۙۖ";
                    break;
                case -793536938:
                    str6 = "ۤۜۜۗۙۨۘۥۥۘۘۦۙ۫۬ۙ۟ۢۢۡ";
                    break;
                case -552913725:
                    i5 = i6 + 1;
                    str6 = "ۥۦۘۘ۫ۦۖۧۨ۫ۜ۟۟۬ۨۤۗۢۖ۟ۜۛۚۨۧۧۢۧ";
                    break;
                case -6723312:
                    str6 = "ۚۡۤۡۚۚۡۢۨۘ۫ۦ۬۠ۛۡۨۨۥۘۛ۫ۨۘۧۥ";
                    break;
                case 363597735:
                    contentValues.put("start_date", str2);
                    str6 = "ۡۢۜ۬ۥۤۜ۟ۘۚۨۘۖۘۡۘ";
                    break;
                case 392688189:
                    String str7 = "ۦۙۦۘۤ۠ۗۢۛۖۘۛۧۨۘۥ۟ۙۡۡ۟ۙۘۙۙۥ";
                    while (true) {
                        switch (str7.hashCode() ^ 1898524539) {
                            case -2108255427:
                                str6 = "ۧۧۧ۬ۘۤۧۥۘۙ۫۬ۦۙۧۢۥ۫ۙ۠ۤ۫ۨۡۘۢۥۥۘ";
                                continue;
                            case -321109853:
                                str6 = "ۚۛۚۢۡۖۘۙۨۧۜۡۘۙ۟ۗۖۜۥۧ۬ۚۦ۫۬";
                                continue;
                            case 550075467:
                                str7 = "ۙۡۘۘۚ۠۟ۚۢۖۙۡۡۘۧۙۜۡۢۛ۬ۘۜۗۧ۬";
                                break;
                            case 1459647714:
                                if (i6 >= i3) {
                                    str7 = "ۙ۠ۗۦۗۡۘۛۖۙۜۥ۠ۖ۬ۡۘۦۛ۬ۖۛۖۦۥۚۚۗۦ";
                                    break;
                                } else {
                                    str7 = "۬ۢۦۘۦۖۘۛۧۜۘۦۗۧۢۤ۠";
                                    break;
                                }
                        }
                    }
                    break;
                case 434760828:
                    contentValues = new ContentValues();
                    str6 = "ۦۨۚۥ۠ۡۥۡۚۘ۬۬ۧ۬ۢۦۢۘۘۥۡۘۗۡۖۘۤۨ۬";
                    break;
                case 554604032:
                    i4 = 0;
                    str6 = "ۥۦۥۘۚۡۥۘ۬ۤۜۜۡۙۘۛۗۧۗۨ۬ۥۜۖۙ۠";
                    break;
                case 854401786:
                    sb.append(objArr[i6]);
                    str6 = "۟ۛۥۤۖ۠ۥۜۘۛ۬ۦۘۥۨ۠ۡۜۖۤۜۧ";
                    break;
                case 863477189:
                    contentValues.put("clock", str4);
                    str6 = "ۗۘۦ۠ۥۖۦۖۨۘۢۥۡۥۘۘۜۖۨ";
                    break;
                case 881250045:
                    str6 = "۫ۗۙۤۙۡۘۖۚۘۘۗۛ۟ۧۨۜۘۡۚۤۙ۠ۤۚۦۧۤۘۡۘ";
                    break;
                case 931989339:
                    str6 = "۫ۖۦۗۗۛۖۗۜۤۤ۠ۡۜ۠ۧۖ۠ۗۤۡۘ۠ۘ۟";
                    break;
                case 961968185:
                    str6 = "۠ۗۢۤۛۡۨۖۜۨۜۗۧۥۘ۬ۦۘۘۥۜۡ";
                    break;
                case 1020326484:
                    return this.f673b.update("Scheduler", contentValues, a.d("_id=", i2), (String[]) null);
                case 1173392084:
                    str6 = "۟ۡۧۘۛۧ۬ۜۙۡۘ۬ۗۛۦ۬ۨۥ۟۬ۨۖۤۨۖۙ";
                    break;
                case 1217180701:
                    sb.append(",");
                    str6 = "۫ۡۗۧۜۜۘۡۢۥۗۥۧ۬ۡۗۛ۬ۙۡۢۚ";
                    break;
                case 1354797265:
                    contentValues.put("end_date", str3);
                    str6 = "ۗ۟ۨۘۥ۠ۚۢ۫ۦۘۖ۟ۥ۫ۡۚ";
                    break;
                case 1414032005:
                    str6 = "ۚۖۧۘۤۜۥۧ۠۬ۦۡۗۙۜۜۘۛۖۥۤۗۨ";
                    break;
                case 1958999966:
                    str6 = "ۚ۬ۜۘۦۧۢۜ۫ۡۜۖۚۦۛۖ۠ۖ";
                    break;
            }
        }
    }

    public int hh(String str, String str2, String str3, String str4, String str5, String str6, int i2) {
        String str7 = "ۡۜۦۗۢۜۨۡۥۘ۫ۙۗۡۤۡۘ";
        ContentValues contentValues = null;
        while (true) {
            switch ((str7.hashCode() ^ 969) ^ 67446319) {
                case -1837031637:
                    contentValues.put("text_message", str2);
                    str7 = "۬ۨۤۧۚۧۡۡۥ۫ۧۛۤۚۤ۬ۘۘ";
                    break;
                case -1742620481:
                    return this.f673b.update("Scheduler", contentValues, a.d("_id=", i2), (String[]) null);
                case -538772447:
                    contentValues = new ContentValues();
                    str7 = "ۜۤ۫ۗۘۚۡۜۜۘۢ۠ۥۖۧۦۘۘۗۤۧۧ۠";
                    break;
                case -267097940:
                    str7 = "ۢۨۜۘۨۙۡ۫ۨۢۤۘۜۡ۠۟ۚۗۢۜ۠ۨۘۨۥۘۘ";
                    break;
                case -83987006:
                    contentValues.put("start_date", str3);
                    str7 = "ۤۙ۟ۥۚۥۙۜۨ۟ۡۗۜۧۚۙۨۡ۬ۘ";
                    break;
                case 200623326:
                    contentValues.put("receipt", str);
                    str7 = "ۥ۬ۡۤۙ۠ۢۚ۬۫ۗۦۨۚۥۧۘ";
                    break;
                case 565635672:
                    str7 = "ۘ۟ۨۘۜۙۧۦۢ۟ۦۙ۟ۙۡۦۛۗ۫";
                    break;
                case 590428193:
                    contentValues.put("clock", str5);
                    str7 = "ۦ۬ۖۘۡۦۨۦ۠ۘۘۚۢ۫ۦۦۜۘۨۛۦ";
                    break;
                case 600059755:
                    str7 = "۟ۜۧۨۘۚ۟ۢ۬ۘۙۛ۬ۚۗ۠ۨۡۨۢۥ";
                    break;
                case 855587568:
                    str7 = "ۢۢۘۜۥۘۘ۠ۘۚۙۦۘۚ۠ۥ";
                    break;
                case 1044816791:
                    str7 = "ۡۙۥۘۙۘۚۦۧۧۢۜۧۘۗۡۥۙۡۙۤۜۙۜۖۦۘ";
                    break;
                case 1049353546:
                    str7 = "ۚۨۘۧۛۖۥۡۧۢۦۗۨۧۦۘۜۙۢۖۖۡ";
                    break;
                case 1672970795:
                    str7 = "ۦۙ۫ۜۘۛۢۛ۫ۖۚۨۘۚۜۦۜۡۖ";
                    break;
                case 1894468495:
                    contentValues.put("frequency_type", str6);
                    str7 = "۠ۨۥۚۖۧۘۦۗ۠ۢۨۦۚ۠ۧۧۧ۟";
                    break;
                case 1948581027:
                    contentValues.put("end_date", str4);
                    str7 = "ۡ۟۫ۗۚۢۚۚ۟ۛۗۛۖۙۚ۠ۢ";
                    break;
                case 2065654835:
                    str7 = "ۡ۟ۗۜۨۛ۫ۦۘ۟ۘۦۘۢۖۤ";
                    break;
            }
        }
    }

    public ArrayList<object_alert> ii() {
        int i2 = 0;
        String str = "۬ۤۖۦۖۡۘۙۦۧۙۡۘۥۜ۬";
        int i3 = 0;
        int i4 = 0;
        ArrayList<object_alert> arrayList = null;
        Cursor cursor = null;
        while (true) {
            switch ((str.hashCode() ^ 49) ^ -1980031216) {
                case -2028450061:
                    i2 = 0;
                    str = "ۡۧۙۢۢۙۨۙۘۘۡ۫ۚۡۧۘ۟ۘ۠ۦۜۢۧۦ۫";
                    break;
                case -1931565285:
                    cursor.moveToNext();
                    str = "ۘۛۘۘۚۙ۠۟۟ۗ۫ۗۘۢۙ۟ۖۘۧ۟ۜۧۘۙۘۨۘۜۘۧۘ";
                    break;
                case -1739196408:
                    return arrayList;
                case -1541931375:
                    str = "ۤ۟ۙ۟ۢۜۡۗۡۘ۟۬ۦ۫ۡۡۘۜۜۥ";
                    arrayList = new ArrayList<>();
                    break;
                case -1387401476:
                    arrayList.add(new object_alert(cursor.getInt(0), cursor.getString(1), cursor.getString(2), cursor.getString(3), cursor.getString(4), cursor.getString(5), cursor.getString(6)));
                    str = "ۢۦۥۦۨۨۘ۬ۙۥۖۦۛۧۧ۬ۗ۫";
                    break;
                case -1146479474:
                    cursor.close();
                    str = "۠ۨۛۦۦۦۙ۬۟ۖ۫۬ۦۥ۟ۡۛۨۘۥۛ۫";
                    break;
                case -1050877541:
                    str = "ۚۡۜۘ۬ۙۡۘ۠ۦۨۨۧ۬ۤۗۘۨۖۢۖۜۨ";
                    i3 = i4 + 1;
                    break;
                case -17273885:
                    String str2 = "ۦۧۗۚ۫۫ۚۙۜۘۤۦۘۗۨۜۧۤۜۦۙۨۨۗۛ۟ۥۦۘ";
                    while (true) {
                        switch (str2.hashCode() ^ 457077694) {
                            case -1873096246:
                                str = "ۤۡ۬ۖۦۨۘۙۧۨۥۗۗ۟ۡۚۛ۬ۖ۠ۖ";
                                continue;
                            case -597322908:
                                if (i4 >= cursor.getCount()) {
                                    str2 = "ۢۡ۬ۢۧۜۙۡۖۘۨۖۘ۠۫ۨ";
                                    break;
                                } else {
                                    str2 = "ۧۖۢ۠ۘۜۨۦ۠ۢۜۧۘۢۜۛۖۙۜ";
                                    break;
                                }
                            case 259331402:
                                str2 = "ۘۡ۟ۚۥۡ۟ۜ۠ۧ۫ۛۤۤۚۚۗۡۨۡۘۘۘۥۘ";
                                break;
                            case 930039417:
                                str = "ۙ۬ۜۢۡۢ۫ۢۜۜۨۘ۠ۨۥۦۖۦ۟ۤۨۘ";
                                continue;
                        }
                    }
                    break;
                case 242253286:
                    str = "ۨۡۖۗۡ۟ۧ۬ۛ۠ۛۜۘۛۘۨۘ";
                    break;
                case 492638319:
                    str = "ۨۡۖۗۡ۟ۧ۬ۛ۠ۛۜۘۛۘۨۘ";
                    i4 = i2;
                    break;
                case 564082939:
                    str = "ۘۜۗۡۗۢۢۖۜۨۧ۬ۤۛۚۖۨۡۜۨ";
                    break;
                case 1293696727:
                    str = "ۙ۠ۡۘۨۖۥۘۙۙ۟ۛۦۨۘۡۜۨۘۖۛۦۚۢ۠ۧ۬ۙ۫۫ۧ";
                    cursor = this.f673b.query("Scheduler", (String[]) null, (String) null, (String[]) null, (String) null, (String) null, (String) null);
                    break;
                case 1449077152:
                    str = "۬ۚۚۢۥۚۘۖۚۜۥ۟۫ۜۧۘ";
                    i4 = i3;
                    break;
                case 2103825030:
                    cursor.moveToFirst();
                    str = "ۢۜۛ۫ۨۛ۟ۘۘۘۙۤ۠۫ۜۡۘۦۘ۫";
                    break;
            }
        }
    }

    public SQLiteAdapter open() {
        SQLite sQLite = null;
        String str = "ۨ۟ۦۘۙۘۧ۠ۛۗۛ۬ۥۘۥۘ۠ۢۢۛ۟ۡۘۘۦۢ";
        while (true) {
            switch ((str.hashCode() ^ 784) ^ 824917872) {
                case -1146232863:
                    return this;
                case 323822213:
                    this.f673b = sQLite.getWritableDatabase();
                    str = "ۡۙۖۘۥۤۚۚۗۥۙۖۢۗۜۚ۠۟ۡۘۦ۟ۦۘۢۡۘ";
                    break;
                case 361032413:
                    this.f674c = sQLite;
                    str = "ۦۡۤۙۛۛۥۚۡۘۢ۠ۙۜۘ۠";
                    break;
                case 1365263629:
                    str = "۬ۖۨۢ۬ۜۘ۠ۥۚۛۙۥۘۨۥۧ۬ۡۡ۬ۢ۠ۢۡ";
                    break;
                case 1844159397:
                    sQLite = new SQLite(this.f672a);
                    str = "ۢۤ۫۬ۙۤ۠ۗۚۙۙۙ۬ۦۤۥۥۤۦ۟ۗۜۨۘۨۡۢ";
                    break;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void removeAll() {
        /*
            r20 = this;
            r19 = 0
            r18 = 0
            r17 = 0
            r16 = 0
            r7 = 0
            r6 = 0
            r5 = 0
            r4 = 0
            r3 = 0
            r8 = 0
            r2 = 0
            java.lang.String r1 = "ۜۛ۬ۛۘۢۘۢۖۘۦۛ۟ۗ۫ۡۨۦۘۘۖۗۜۘ۬۬۟ۤۚۧ"
            r9 = r2
            r10 = r3
            r11 = r4
            r12 = r5
            r13 = r6
            r14 = r7
            r15 = r8
        L_0x0018:
            int r2 = r1.hashCode()
            r3 = 702(0x2be, float:9.84E-43)
            r4 = 335825227(0x1404494b, float:6.6787514E-27)
            r2 = r2 ^ r3
            r2 = r2 ^ r4
            switch(r2) {
                case -1613274360: goto L_0x0150;
                case -1329522446: goto L_0x0165;
                case -1160778116: goto L_0x0059;
                case -1056255199: goto L_0x0027;
                case -1045907099: goto L_0x0199;
                case -833337257: goto L_0x01a5;
                case -759966758: goto L_0x0114;
                case -697260805: goto L_0x0186;
                case -630311387: goto L_0x0063;
                case -612220311: goto L_0x00a8;
                case -455614761: goto L_0x004f;
                case -377926562: goto L_0x0091;
                case -25318492: goto L_0x0034;
                case 140736161: goto L_0x0071;
                case 644134515: goto L_0x00b3;
                case 750066437: goto L_0x005e;
                case 780675433: goto L_0x009d;
                case 783731553: goto L_0x0155;
                case 786744318: goto L_0x0049;
                case 848889770: goto L_0x002a;
                case 856196662: goto L_0x01ad;
                case 896293377: goto L_0x0086;
                case 937173897: goto L_0x0149;
                case 1445630019: goto L_0x015c;
                case 1786935480: goto L_0x0128;
                default: goto L_0x0026;
            }
        L_0x0026:
            goto L_0x0018
        L_0x0027:
            java.lang.String r1 = "ۥۚۘ۬ۨۧۥۗۜۡۖۤ۫ۜۜۙۚ"
            goto L_0x0018
        L_0x002a:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.lang.String r1 = "ۚۧۡۖۨۜۗۧۗۦۛۡۛ۟ۡۦۜۦۘۥ۬ۘۘ"
            r19 = r2
            goto L_0x0018
        L_0x0034:
            r0 = r20
            android.database.sqlite.SQLiteDatabase r1 = r0.f673b
            java.lang.String r2 = "Scheduler"
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r2 = r1.query(r2, r3, r4, r5, r6, r7, r8)
            java.lang.String r1 = "ۢۤ۟ۦۙۨۜۘۖ۠ۦ۠ۤۧۘۘۘۨۖ"
            r18 = r2
            goto L_0x0018
        L_0x0049:
            r18.moveToFirst()
            java.lang.String r1 = "ۚۥۧۘ۠ۛۖۘ۫ۦۜۘۘۜۜۘۜۗۧ۠ۧۤ۫ۤۜ"
            goto L_0x0018
        L_0x004f:
            java.util.GregorianCalendar r2 = new java.util.GregorianCalendar
            r2.<init>()
            java.lang.String r1 = "ۜۤۤۥۤۘ۫ۢۥۜۜۧۘۚۡۨۘۦۦۜۢۖۦۘ"
            r17 = r2
            goto L_0x0018
        L_0x0059:
            r16 = 0
            java.lang.String r1 = "۟ۧۤ۟ۤۜ۟۠۫ۗ۟ۢ۬ۥۢ۬ۘۚ"
            goto L_0x0018
        L_0x005e:
            java.lang.String r1 = "ۥۦۙۢۡۧۘۚ۫ۥۘ۬ۛۡۘۚۘ"
            r15 = r16
            goto L_0x0018
        L_0x0063:
            r2 = -430991879(0xffffffffe64f95f9, float:-2.450741E23)
            java.lang.String r1 = "ۧ۟۠ۘۦۤ۫ۨۗۦۙۥۘۛۘ۟"
        L_0x0068:
            int r3 = r1.hashCode()
            r3 = r3 ^ r2
            switch(r3) {
                case -1784377307: goto L_0x0080;
                case -514825879: goto L_0x0077;
                case 217332138: goto L_0x0083;
                case 2118268325: goto L_0x0071;
                default: goto L_0x0070;
            }
        L_0x0070:
            goto L_0x0068
        L_0x0071:
            java.lang.String r1 = "ۛۦۥۘۨۧۙۖۧۤۘۗۢۜۦۜۘۘۗۥ"
            goto L_0x0018
        L_0x0074:
            java.lang.String r1 = "۫۠ۗۥۧۙۡۘۖۘۘ۬ۛۨ۟۬"
            goto L_0x0068
        L_0x0077:
            int r1 = r18.getCount()
            if (r15 >= r1) goto L_0x0074
            java.lang.String r1 = "۠۬ۙۥۡۙۤ۠ۢۧۜ۫ۢۤۜۦۜۨ۬ۧۨۗۜۖ"
            goto L_0x0068
        L_0x0080:
            java.lang.String r1 = "ۚ۠ۡۘۛ۠ۜۘۜۛ۬ۙۛۧۧۘۚ"
            goto L_0x0068
        L_0x0083:
            java.lang.String r1 = "ۘ۟۟ۦۦۡۘۙۛۜۘ۫ۢۢۜۨۨۘۖۛۜۧۜۨ۠ۜۦ"
            goto L_0x0018
        L_0x0086:
            r1 = 4
            r0 = r18
            java.lang.String r2 = r0.getString(r1)
            java.lang.String r1 = "ۧ۫۠ۙۢ۫ۙۗ۬ۚۦۖۖۥۤۧ۟"
            r14 = r2
            goto L_0x0018
        L_0x0091:
            r1 = 5
            r0 = r18
            java.lang.String r2 = r0.getString(r1)
            java.lang.String r1 = "۫ۖۧۘۥۗ۫ۧۦۘۜۧۘۘۘ۠ۢۡۡۢۧۨ۬"
            r13 = r2
            goto L_0x0018
        L_0x009d:
            java.lang.String r1 = "-"
            java.lang.String[] r2 = r14.split(r1)
            java.lang.String r1 = "ۖۦ۠۠ۥ۠ۦۢۜۦۦۜۘۖۘۨۘ۠ۛ۠ۥۦۢۚ۫ۘۘ۫ۤۥ"
            r12 = r2
            goto L_0x0018
        L_0x00a8:
            java.lang.String r1 = ":"
            java.lang.String[] r2 = r13.split(r1)
            java.lang.String r1 = "ۤۛۨۘۜۘۦۘۘۚۖۚۚۖۘۢ۬ۖۘۘ۠ۤۙ۟ۛ"
            r11 = r2
            goto L_0x0018
        L_0x00b3:
            r7 = -775445319(0xffffffffd1c7a4b9, float:-1.0718276E11)
            java.lang.String r1 = "ۨ۫ۧ۬ۘۘۘ۠۬ۧۜۖۥۘۚۡ۫۟ۥۧۘۚ۟ۨۘ۫۬ۘۘۙۚۨ"
        L_0x00b8:
            int r2 = r1.hashCode()
            r2 = r2 ^ r7
            switch(r2) {
                case 271608658: goto L_0x0110;
                case 332593457: goto L_0x00c1;
                case 633114903: goto L_0x00c7;
                case 1849651596: goto L_0x019d;
                default: goto L_0x00c0;
            }
        L_0x00c0:
            goto L_0x00b8
        L_0x00c1:
            java.lang.String r1 = "۠ۧۥۘۚ۠ۛ۬ۘۢۤۖۜۘۦۧۜۘۗ۟ۙ"
            goto L_0x00b8
        L_0x00c4:
            java.lang.String r1 = "ۢۙۖۘۡۧۜۘ۫۠ۥۧۜۖۘ۬ۡۖ"
            goto L_0x00b8
        L_0x00c7:
            java.util.GregorianCalendar r1 = new java.util.GregorianCalendar
            r2 = 0
            r2 = r12[r2]
            java.lang.String r2 = r2.trim()
            int r2 = java.lang.Integer.parseInt(r2)
            r3 = 1
            r3 = r12[r3]
            java.lang.String r3 = r3.trim()
            int r3 = java.lang.Integer.parseInt(r3)
            int r3 = r3 + -1
            r4 = 2
            r4 = r12[r4]
            java.lang.String r4 = r4.trim()
            int r4 = java.lang.Integer.parseInt(r4)
            r5 = 0
            r5 = r11[r5]
            java.lang.String r5 = r5.trim()
            int r5 = java.lang.Integer.parseInt(r5)
            r6 = 1
            r6 = r11[r6]
            java.lang.String r6 = r6.trim()
            int r6 = java.lang.Integer.parseInt(r6)
            r1.<init>(r2, r3, r4, r5, r6)
            r0 = r17
            boolean r1 = r1.after(r0)
            if (r1 == 0) goto L_0x00c4
            java.lang.String r1 = "ۦۛ۠۫ۘۦۥۢۦۘ۫ۖۛۢۦۡۤۨۥۘۨ۫۬"
            goto L_0x00b8
        L_0x0110:
            java.lang.String r1 = "ۗۖۥۘۤۨۧۘ۬۬ۤ۠ۖۘ۬ۚۥۘۗۖۛ۫ۥۥۘۦۢۨۘ"
            goto L_0x0018
        L_0x0114:
            r1 = 0
            r0 = r18
            int r1 = r0.getInt(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0 = r19
            r0.add(r1)
            java.lang.String r1 = "ۨۖۥۘۤۧۨۘ۬ۥۨ۠ۛۗ۠ۨۘ۫۟ۘۛۤۘۚۚۥۘ"
            goto L_0x0018
        L_0x0128:
            r2 = 290471159(0x11503cf7, float:1.6427093E-28)
            java.lang.String r1 = "ۧۖۦۘۤۗۖۘۥ۫۟ۛۚۨۘۘۥۥ"
        L_0x012d:
            int r3 = r1.hashCode()
            r3 = r3 ^ r2
            switch(r3) {
                case -648811037: goto L_0x0136;
                case -437748573: goto L_0x01a1;
                case 347844945: goto L_0x013c;
                case 538451693: goto L_0x0145;
                default: goto L_0x0135;
            }
        L_0x0135:
            goto L_0x012d
        L_0x0136:
            java.lang.String r1 = "۟ۖۘۗۛۧۜۚۦۧۥۘۡۙۗۥ"
            goto L_0x012d
        L_0x0139:
            java.lang.String r1 = "۟ۥۘۥۗۡۘۜ۬ۖۧۥۘۘۚ۟ۗۧ۬ۘۙۥ۬ۜۗۘ۬ۢۡۘ"
            goto L_0x012d
        L_0x013c:
            boolean r1 = r18.moveToNext()
            if (r1 != 0) goto L_0x0139
            java.lang.String r1 = "ۧۢ۬ۤ۟ۥۘۗ۠ۖۘۨۧۖۘۛ۟ۖۨۗۖ۫ۡۧۗ۬ۚ"
            goto L_0x012d
        L_0x0145:
            java.lang.String r1 = "ۘۜۡ۠۟ۘۘۗ۠۫۫ۥۨۘۨۥ۠ۡۖۤ۠ۘ"
            goto L_0x0018
        L_0x0149:
            int r2 = r15 + 1
            java.lang.String r1 = "ۗۦۗۚۢۘ۟ۡۚۥۚۥۢۚۢۘۚ۬۬ۘۜۗۡۗ"
            r10 = r2
            goto L_0x0018
        L_0x0150:
            java.lang.String r1 = "۠ۦۘۘۦۨۤۦۗۢۛۥۤۙۧۖۨۚۤۘۢ۠ۨۘ۠ۦۥۘ"
            r15 = r10
            goto L_0x0018
        L_0x0155:
            r18.close()
            java.lang.String r1 = "۟ۙۘۘۛۘۦۘ۬ۢۜۛ۠ۜۨ۟ۨۥۥۛۚۡۡ۟ۥ۠ۖۖۚ"
            goto L_0x0018
        L_0x015c:
            java.util.Iterator r2 = r19.iterator()
            java.lang.String r1 = "ۨۛۙۘۖۨ۬ۖۘۛۦۧۘۨۨ۟ۤۤ۬ۗۥۚ۟ۥۦ"
            r9 = r2
            goto L_0x0018
        L_0x0165:
            r2 = 525205706(0x1f4e00ca, float:4.362285E-20)
            java.lang.String r1 = "ۜۖۛۙۢۦۚۗۖۢۥۖۜۤۨۤۧۖۘۤۖۖۘ"
        L_0x016a:
            int r3 = r1.hashCode()
            r3 = r3 ^ r2
            switch(r3) {
                case -1856102807: goto L_0x017a;
                case 318833761: goto L_0x01a9;
                case 2119468343: goto L_0x0183;
                case 2142120092: goto L_0x0173;
                default: goto L_0x0172;
            }
        L_0x0172:
            goto L_0x016a
        L_0x0173:
            java.lang.String r1 = "ۢۛۥۘ۬ۢۘۡۧ۬ۤۚۖۘۡۖۧۘ"
            goto L_0x0018
        L_0x0177:
            java.lang.String r1 = "۠ۘۨۧۨۘۖۧۦۖۖۖۘ۠ۚۙۙ۫۬"
            goto L_0x016a
        L_0x017a:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L_0x0177
            java.lang.String r1 = "۟۟ۘۘۗۨۨۘۚۡۚۥۧ۠ۛ۬۫ۧۖۚ"
            goto L_0x016a
        L_0x0183:
            java.lang.String r1 = "ۧۢۧۢ۬ۘۘۥۗ۬۬ۘۢۖۨۙ۫"
            goto L_0x016a
        L_0x0186:
            java.lang.Object r1 = r9.next()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0 = r20
            r0.delete(r1)
            java.lang.String r1 = "ۤۙۧۚۧۖۥۛۥۘۥۨۖ۫ۚۖۙۧۘۘ"
            goto L_0x0018
        L_0x0199:
            java.lang.String r1 = "ۥۦۙۢۡۧۘۚ۫ۥۘ۬ۛۡۘۚۘ"
            goto L_0x0018
        L_0x019d:
            java.lang.String r1 = "ۨۖۥۘۤۧۨۘ۬ۥۨ۠ۛۗ۠ۨۘ۫۟ۘۛۤۘۚۚۥۘ"
            goto L_0x0018
        L_0x01a1:
            java.lang.String r1 = "ۗۖۙۚ۠ۜۢۨۨۘ۬ۘۡۦۨ۠ۗ"
            goto L_0x0018
        L_0x01a5:
            java.lang.String r1 = "ۨۛۙۘۖۨ۬ۖۘۛۦۧۘۨۨ۟ۤۤ۬ۗۥۚ۟ۥۦ"
            goto L_0x0018
        L_0x01a9:
            java.lang.String r1 = "ۜ۠ۘۘۗۗۗۘۘۜ۟ۙۙۡ۟۠ۘ۠ۢۢ۫ۤۡ۠ۡۘ"
            goto L_0x0018
        L_0x01ad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.autoschedreply.SQLiteAdapter.removeAll():void");
    }
}
