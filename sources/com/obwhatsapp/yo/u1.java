package com.obwhatsapp.yo;

import X.C15830rv;
import X.C16740tZ;
import X.C38561qz;
import a.a;
import android.app.Activity;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.util.Base64;
import android.view.Menu;
import android.widget.Toast;
import com.joom.paranoid.Deobfuscator$app$Custom;
import com.obwhatsapp.jobqueue.job.SendPlayedReceiptJobV2;
import com.obwhatsapp.yo.autoschedreply.p;
import com.obwhatsapp.youbasha.task.utils;
import com.obwhatsapp.youbasha.ui.YoSettings.HideMedia;
import com.whatsapp.MediaData;
import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

public abstract class u1 extends dep {
    protected static ArrayList<String> VO_data = new ArrayList<>(3);
    protected static File VO_file;

    /* renamed from: l  reason: collision with root package name */
    public static String f889l;

    /* renamed from: m  reason: collision with root package name */
    public static int f890m;

    /* renamed from: n  reason: collision with root package name */
    public static int f891n;

    /* renamed from: o  reason: collision with root package name */
    public static int f892o;

    /* renamed from: p  reason: collision with root package name */
    public static int f893p;

    static {
        String str = "۬۬ۖۘۢۥۡۘۨۚۗۢۚۘۘۜۨ۫ۦ۟ۘۘۙۢ۠ۘۜۥۘ";
        while (true) {
            switch ((str.hashCode() ^ 628) ^ -241328951) {
                case -1494940909:
                    return;
                case -301368726:
                    str = "ۨۚۜۥۘۖۘۘۥۥۖۛۖۚۡ۫ۖۜۚۖۥۡۘ";
                    break;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.LinkedHashMap<java.lang.String, java.lang.Integer> GetGroupMsgsCount(java.lang.String r10) {
        /*
            android.database.sqlite.SQLiteOpenHelper r1 = com.obwhatsapp.yo.yo.sql
            android.database.sqlite.SQLiteDatabase r2 = r1.getReadableDatabase()
            r3 = 1154047852(0x44c95f6c, float:1610.9819)
            java.lang.String r1 = "۠ۨۤۧۘۡۘۘۜ۟ۚۥۘ۟ۧۢۙۡۘۘۘۚۙۧۤۜ"
        L_0x000b:
            int r4 = r1.hashCode()
            r4 = r4 ^ r3
            switch(r4) {
                case -1081665661: goto L_0x0061;
                case -447454179: goto L_0x0064;
                case 835138200: goto L_0x0014;
                case 1664515640: goto L_0x0058;
                default: goto L_0x0013;
            }
        L_0x0013:
            goto L_0x000b
        L_0x0014:
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>()
            int r1 = z.j.e(r2, r10)     // Catch:{ Exception -> 0x01c3 }
            int r1 = z.j.d(r2, r1)     // Catch:{ Exception -> 0x01c3 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01c3 }
            java.lang.String r5 = "SELECT sender_jid_row_id, count(sender_jid_row_id) as total FROM message WHERE chat_row_id=\""
            r4.<init>(r5)     // Catch:{ Exception -> 0x01c3 }
            r4.append(r1)     // Catch:{ Exception -> 0x01c3 }
            java.lang.String r5 = "\" AND from_me=0 AND received_timestamp != 0 GROUP BY sender_jid_row_id UNION SELECT 7777777, count(from_me) as total FROM message WHERE chat_row_id=\""
            r4.append(r5)     // Catch:{ Exception -> 0x01c3 }
            r4.append(r1)     // Catch:{ Exception -> 0x01c3 }
            java.lang.String r1 = "\" AND from_me=1 AND receipt_server_timestamp!=-1 GROUP BY sender_jid_row_id ORDER BY total DESC"
            r4.append(r1)     // Catch:{ Exception -> 0x01c3 }
            java.lang.String r1 = r4.toString()     // Catch:{ Exception -> 0x01c3 }
            r4 = 0
            android.database.Cursor r4 = r2.rawQuery(r1, r4)     // Catch:{ Exception -> 0x01c3 }
            r4.moveToFirst()     // Catch:{ Exception -> 0x01c3 }
            r5 = -2145435196(0xffffffff801f41c4, float:-2.870493E-39)
            java.lang.String r1 = "ۙ۬ۗۖۙۤۜۘۘ۟۬ۨۡۖۦۘۨ۠ۜۦۙۧۗۛ۠ۜۡۨۘ"
        L_0x0049:
            int r6 = r1.hashCode()     // Catch:{ Exception -> 0x01c3 }
            r6 = r6 ^ r5
            switch(r6) {
                case -1607866102: goto L_0x0110;
                case -332921913: goto L_0x010b;
                case -233412472: goto L_0x0052;
                case 2010354330: goto L_0x0101;
                default: goto L_0x0051;
            }     // Catch:{ Exception -> 0x01c3 }
        L_0x0051:
            goto L_0x0049
        L_0x0052:
            java.lang.String r1 = "ۤۦۦۛۜۗۤ۫ۦۚۡۜ۫ۧۚ۫۠ۚۥۦۤ۟ۦ۟۬۫"
            goto L_0x0049
        L_0x0055:
            java.lang.String r1 = "ۖ۫۟ۚۡۡۖۥۗۗۗۦۘۗۘ۟"
            goto L_0x000b
        L_0x0058:
            boolean r1 = z.j.g(r2)
            if (r1 == 0) goto L_0x0055
            java.lang.String r1 = "۠ۦۦۨۙۧ۟ۜۦۡۜ۬۠ۖۘۘ۟ۙۘۖۡۥ۬۫ۢ۫ۡۘ"
            goto L_0x000b
        L_0x0061:
            java.lang.String r1 = "ۙۤ۟ۖۧۢۙۨۗۜۦۖۗۦۨۘۗۘۡۗۖۜۘ۠ۖ"
            goto L_0x000b
        L_0x0064:
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01c6 }
            java.lang.String r4 = "SELECT remote_resource, count(remote_resource) as total FROM messages WHERE key_remote_jid=\""
            r3.<init>(r4)     // Catch:{ Exception -> 0x01c6 }
            r3.append(r10)     // Catch:{ Exception -> 0x01c6 }
            java.lang.String r4 = "\" AND remote_resource!=\"\" GROUP BY remote_resource UNION SELECT 7777777, count(key_from_me) as total FROM messages WHERE key_remote_jid=\""
            r3.append(r4)     // Catch:{ Exception -> 0x01c6 }
            r3.append(r10)     // Catch:{ Exception -> 0x01c6 }
            java.lang.String r4 = "\" AND key_from_me=1 And receipt_server_timestamp!=-1 GROUP BY remote_resource ORDER BY total DESC"
            r3.append(r4)     // Catch:{ Exception -> 0x01c6 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x01c6 }
            r4 = 0
            android.database.Cursor r4 = r2.rawQuery(r3, r4)     // Catch:{ Exception -> 0x01c6 }
            r4.moveToFirst()     // Catch:{ Exception -> 0x01c6 }
            r3 = 55204235(0x34a598b, float:5.9465255E-37)
            java.lang.String r2 = "۬۟۫ۜۙ۠۟ۥۧۘۨۘۢ۠ۧ۟"
        L_0x0091:
            int r5 = r2.hashCode()     // Catch:{ Exception -> 0x01c6 }
            r5 = r5 ^ r3
            switch(r5) {
                case -1955246569: goto L_0x00ad;
                case -1419924637: goto L_0x00a0;
                case -513289720: goto L_0x009a;
                case 118867578: goto L_0x00a9;
                default: goto L_0x0099;
            }     // Catch:{ Exception -> 0x01c6 }
        L_0x0099:
            goto L_0x0091
        L_0x009a:
            java.lang.String r2 = "۟ۦۡۨۨۦۘۙ۠ۦۘ۬ۧۚۘۗۤۙۖۙ"
            goto L_0x0091
        L_0x009d:
            java.lang.String r2 = "ۡ۟۬ۙۙۦ۬۬ۨۘۡۖ۬ۜۡۚۥۚۗ۬۬"
            goto L_0x0091
        L_0x00a0:
            int r2 = r4.getCount()     // Catch:{ Exception -> 0x01c6 }
            if (r2 > 0) goto L_0x009d
            java.lang.String r2 = "ۙۛۤ۬ۙۚۗ۠ۨۘۚۧۘۤۖۦ۬ۗۧۖۨۚۥۧ۟ۨۢۡ"
            goto L_0x0091
        L_0x00a9:
            r4.close()     // Catch:{ Exception -> 0x01c6 }
        L_0x00ac:
            return r1
        L_0x00ad:
            r2 = 0
            java.lang.String r2 = r4.getString(r2)     // Catch:{ Exception -> 0x01c6 }
            r3 = 1
            int r5 = r4.getInt(r3)     // Catch:{ Exception -> 0x01c6 }
            r6 = -1946362022(0xffffffff8bfcdf5a, float:-9.740293E-32)
            java.lang.String r3 = "ۗۖۥۜۙۜۥۜۢۖۢۨۜۚۖۢۦۙۥۨۘ۬ۨۘ"
        L_0x00bc:
            int r7 = r3.hashCode()     // Catch:{ Exception -> 0x01c6 }
            r7 = r7 ^ r6
            switch(r7) {
                case -1576240428: goto L_0x00e6;
                case -1394322204: goto L_0x00c5;
                case 1810876004: goto L_0x00f1;
                case 1850827959: goto L_0x00f4;
                default: goto L_0x00c4;
            }     // Catch:{ Exception -> 0x01c6 }
        L_0x00c4:
            goto L_0x00bc
        L_0x00c5:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)     // Catch:{ Exception -> 0x01c6 }
            r1.put(r2, r3)     // Catch:{ Exception -> 0x01c6 }
            boolean r3 = r4.moveToNext()     // Catch:{ Exception -> 0x01c6 }
            r5 = 1505500409(0x59bc1cf9, float:6.6186439E15)
            java.lang.String r2 = "ۦۚۨۨۧ۠ۚۖۧۘۡ۬ۗۨۡۦ۟ۤۘ"
        L_0x00d5:
            int r6 = r2.hashCode()     // Catch:{ Exception -> 0x01c6 }
            r6 = r6 ^ r5
            switch(r6) {
                case -2114107295: goto L_0x00de;
                case -1498509196: goto L_0x00fa;
                case -575854203: goto L_0x00a9;
                case 2044645992: goto L_0x00ad;
                default: goto L_0x00dd;
            }     // Catch:{ Exception -> 0x01c6 }
        L_0x00dd:
            goto L_0x00d5
        L_0x00de:
            if (r3 != 0) goto L_0x00f7
            java.lang.String r2 = "ۙۢۢ۠۠ۤۡۚۡۘ۬ۨۨۚۤۦ۟۫ۤ"
            goto L_0x00d5
        L_0x00e3:
            java.lang.String r3 = "ۤۚۧۤ۫۠ۛۥ۫ۨۖۢ۟ۢۘۘۢۘۜۘۧۦۗ۠ۖۘۘ"
            goto L_0x00bc
        L_0x00e6:
            java.lang.String r3 = "7777777"
            boolean r3 = r2.equals(r3)     // Catch:{ Exception -> 0x01c6 }
            if (r3 == 0) goto L_0x00e3
            java.lang.String r3 = "ۦ۠ۛۚۛۢۗۚۧ۫ۦۧۜۖۜۘ"
            goto L_0x00bc
        L_0x00f1:
            java.lang.String r3 = "۬ۤۗۤ۬ۖۥۢۨ۠۠ۨۘۛۦۨۘۨۧۖۘۖۡۦۘۚۚۨۘۗ۬ۗ"
            goto L_0x00bc
        L_0x00f4:
            java.lang.String r2 = "me"
            goto L_0x00c5
        L_0x00f7:
            java.lang.String r2 = "ۦۢۚۛۡۨۘۚ۬ۦ۫ۗۙۜۤ۟ۤۦۙۛۜۚۥۘۙۡۘ"
            goto L_0x00d5
        L_0x00fa:
            java.lang.String r2 = "۫ۚۨۥ۟ۦ۫ۡۘۘ۠ۨ۬ۘۤۘۘۘۙۛۢۨۗۙۧۨۘ"
            goto L_0x00d5
        L_0x00fd:
            java.lang.String r1 = "۠ۢۙۙ۟۫ۧۚۗۧ۬ۜۘ۠ۚۗ۠۫ۜۙ"
            goto L_0x0049
        L_0x0101:
            int r1 = r4.getCount()     // Catch:{ Exception -> 0x01c3 }
            if (r1 > 0) goto L_0x00fd
            java.lang.String r1 = "ۙۗ۟ۘۘۜۘ۟ۚۡۙۗ۫ۛۢۨۘ۫ۜ۬۠ۖۡۥۦۗۨۙۨ"
            goto L_0x0049
        L_0x010b:
            r4.close()     // Catch:{ Exception -> 0x01c3 }
        L_0x010e:
            r1 = r3
            goto L_0x00ac
        L_0x0110:
            java.util.HashMap r5 = new java.util.HashMap     // Catch:{ Exception -> 0x01c3 }
            r5.<init>()     // Catch:{ Exception -> 0x01c3 }
        L_0x0115:
            r1 = 0
            int r1 = r4.getInt(r1)     // Catch:{ Exception -> 0x01c3 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ Exception -> 0x01c3 }
            r6 = 1
            int r6 = r4.getInt(r6)     // Catch:{ Exception -> 0x01c3 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x01c3 }
            r5.put(r1, r6)     // Catch:{ Exception -> 0x01c3 }
            r6 = 2014289759(0x780f9f5f, float:1.1652045E34)
            java.lang.String r1 = "ۗۛ۟ۛۦۤۜ۟۟۫ۜۜۘۦۦۥۢۤۧ۫ۛۧۦۗ۠ۖۙۨ"
        L_0x012f:
            int r7 = r1.hashCode()     // Catch:{ Exception -> 0x01c3 }
            r7 = r7 ^ r6
            switch(r7) {
                case -523888018: goto L_0x0138;
                case -60626839: goto L_0x0115;
                case 167191246: goto L_0x0147;
                case 408195965: goto L_0x013e;
                default: goto L_0x0137;
            }     // Catch:{ Exception -> 0x01c3 }
        L_0x0137:
            goto L_0x012f
        L_0x0138:
            java.lang.String r1 = "۟ۚۥۘۖ۠ۖۘۜۚۥ۠ۙۢۗۖۜ۟ۨۤۧۤۨ"
            goto L_0x012f
        L_0x013b:
            java.lang.String r1 = "ۥۢۗۛۧ۫ۜۥۘۦۤۘۘۖۦۗ۟ۚۖۘۡۖۧ"
            goto L_0x012f
        L_0x013e:
            boolean r1 = r4.moveToNext()     // Catch:{ Exception -> 0x01c3 }
            if (r1 != 0) goto L_0x013b
            java.lang.String r1 = "۫ۘۨ۬ۡۥۦ۠ۜۚ۠۬ۡۢ۫۫۫ۘۘ"
            goto L_0x012f
        L_0x0147:
            r4.close()     // Catch:{ Exception -> 0x01c3 }
            java.util.Set r1 = r5.keySet()     // Catch:{ Exception -> 0x01c3 }
            java.util.HashMap r4 = z.j.f(r2, r1)     // Catch:{ Exception -> 0x01c3 }
            java.util.Set r1 = r5.entrySet()     // Catch:{ Exception -> 0x01c3 }
            java.util.Iterator r5 = r1.iterator()     // Catch:{ Exception -> 0x01c3 }
        L_0x015a:
            r2 = -911139237(0xffffffffc9b11e5b, float:-1450955.4)
            java.lang.String r1 = "۫ۜۚۦۗۘۘۛۨۖ۟ۖۨۘۛۛۨ"
        L_0x015f:
            int r6 = r1.hashCode()     // Catch:{ Exception -> 0x01c3 }
            r6 = r6 ^ r2
            switch(r6) {
                case -1925320763: goto L_0x010e;
                case -1483977143: goto L_0x01a7;
                case -421470213: goto L_0x01b0;
                case 2090259338: goto L_0x0168;
                default: goto L_0x0167;
            }     // Catch:{ Exception -> 0x01c3 }
        L_0x0167:
            goto L_0x015f
        L_0x0168:
            java.lang.Object r1 = r5.next()     // Catch:{ Exception -> 0x01c3 }
            r0 = r1
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ Exception -> 0x01c3 }
            r2 = r0
            java.lang.Object r1 = r2.getKey()     // Catch:{ Exception -> 0x01c3 }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ Exception -> 0x01c3 }
            int r6 = r1.intValue()     // Catch:{ Exception -> 0x01c3 }
            java.lang.Object r1 = r2.getValue()     // Catch:{ Exception -> 0x01c3 }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ Exception -> 0x01c3 }
            int r7 = r1.intValue()     // Catch:{ Exception -> 0x01c3 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x01c3 }
            java.lang.Object r1 = r4.get(r1)     // Catch:{ Exception -> 0x01c3 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x01c3 }
            r8 = -1322637863(0xffffffffb12a25d9, float:-2.475977E-9)
            java.lang.String r2 = "ۖۗۤ۠ۘۥۘ۠ۖ۬ۜۚۜۘ۟۬ۛ۫ۤۡ۫ۧۡۘ"
        L_0x0193:
            int r9 = r2.hashCode()     // Catch:{ Exception -> 0x01c3 }
            r9 = r9 ^ r8
            switch(r9) {
                case -1868875808: goto L_0x01b6;
                case -1274583882: goto L_0x019c;
                case -287695233: goto L_0x01b9;
                case 214015564: goto L_0x01bb;
                default: goto L_0x019b;
            }     // Catch:{ Exception -> 0x01c3 }
        L_0x019b:
            goto L_0x0193
        L_0x019c:
            r2 = 7777777(0x76adf1, float:1.0898987E-38)
            if (r6 != r2) goto L_0x01b3
            java.lang.String r2 = "۠ۛۥۖ۫ۛۛۘۨۘۖ۫۠ۛۧۦۘۨۚۨۦۜۚ۫ۚۤۘۜۤ"
            goto L_0x0193
        L_0x01a4:
            java.lang.String r1 = "ۙۗۦۘۤۢۘۘۜ۬ۙۜۢۨۘۗۧۛۤۡۘۗۚۢ"
            goto L_0x015f
        L_0x01a7:
            boolean r1 = r5.hasNext()     // Catch:{ Exception -> 0x01c3 }
            if (r1 == 0) goto L_0x01a4
            java.lang.String r1 = "ۚۗ۟۟ۘۧۥۙۤۤۚۨۘۦ۠ۤ"
            goto L_0x015f
        L_0x01b0:
            java.lang.String r1 = "ۖۤ۟ۙ۬ۦۗۡۘ۟ۘۧۜۨۦۢۙۨۢۛۧۧۛۖۜ۠"
            goto L_0x015f
        L_0x01b3:
            java.lang.String r2 = "ۡ۠ۘۤۜۨۘۨۢۥۘۚ۠ۦۧ۠ۘۘۥ۠ۛ"
            goto L_0x0193
        L_0x01b6:
            java.lang.String r2 = "ۛۢۤ۬ۥۦۘۚۧۖۧۥ۟ۚۖۡۥ۬ۡۘۤۧ"
            goto L_0x0193
        L_0x01b9:
            java.lang.String r1 = "me"
        L_0x01bb:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)     // Catch:{ Exception -> 0x01c3 }
            r3.put(r1, r2)     // Catch:{ Exception -> 0x01c3 }
            goto L_0x015a
        L_0x01c3:
            r1 = move-exception
            goto L_0x010e
        L_0x01c6:
            r2 = move-exception
            goto L_0x00ac
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.u1.GetGroupMsgsCount(java.lang.String):java.util.LinkedHashMap");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String GetType(java.lang.Object r8) {
        /*
            java.lang.Class r0 = r8.getClass()
            java.lang.reflect.Field[] r2 = r0.getFields()
            int r3 = r2.length
            r0 = 0
        L_0x000a:
            r4 = -382838218(0xffffffffe92e5a36, float:-1.3173694E25)
            java.lang.String r1 = "۟۬ۤۜۤۤۡ۟ۜۘۜۛ۠۫ۨۦ۟ۤۨ۠۟ۦۨ۟ۘۗ۫ۥۘ"
        L_0x000f:
            int r5 = r1.hashCode()
            r5 = r5 ^ r4
            switch(r5) {
                case -588358809: goto L_0x0106;
                case 73274721: goto L_0x0018;
                case 855449286: goto L_0x0023;
                case 2032121451: goto L_0x001e;
                default: goto L_0x0017;
            }
        L_0x0017:
            goto L_0x000f
        L_0x0018:
            java.lang.String r1 = "۠ۖۡۛۨۨ۠ۗۚۜۜ۬ۧ۠ۛ۫ۖۖۦۨ۠ۜۜ۬"
            goto L_0x000f
        L_0x001b:
            java.lang.String r1 = "ۡۧۜۘۤۗۜۖۖۥۘ۟۟۬ۚۧۦۘ"
            goto L_0x000f
        L_0x001e:
            if (r0 >= r3) goto L_0x001b
            java.lang.String r1 = "ۘۜۜ۟ۘۗۤۚۙۚۛۖۛۚ"
            goto L_0x000f
        L_0x0023:
            r4 = r2[r0]
            r5 = 160055844(0x98a4224, float:3.328449E-33)
            java.lang.String r1 = "ۧ۠ۜۚ۫ۛۢۢۦۦ۫۠ۧۛۨۘ۫۫ۘۘ"
        L_0x002a:
            int r6 = r1.hashCode()
            r6 = r6 ^ r5
            switch(r6) {
                case -1324200264: goto L_0x0102;
                case -804470844: goto L_0x0033;
                case -598629457: goto L_0x0045;
                case -372566586: goto L_0x0048;
                default: goto L_0x0032;
            }
        L_0x0032:
            goto L_0x002a
        L_0x0033:
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            java.lang.Class r6 = r4.getType()
            boolean r1 = r1.isAssignableFrom(r6)
            if (r1 == 0) goto L_0x0042
            java.lang.String r1 = "ۧۥۗۨ۫ۨۜ۬ۨۘۜ۫۫۫ۚۘۘۚۛ۫"
            goto L_0x002a
        L_0x0042:
            java.lang.String r1 = "۟ۢۘ۠ۚۢۙۛۚۜۚۜۜ۠ۙ"
            goto L_0x002a
        L_0x0045:
            java.lang.String r1 = "ۥۢۦۘۜ۬۫ۧۖۧۘۛ۬ۥۘۥۘۡۘۗ۫ۘۘۚۧۙۚۢۨ"
            goto L_0x002a
        L_0x0048:
            java.lang.Object r4 = r4.get(r8)     // Catch:{ Exception -> 0x0101 }
            r5 = -1662609859(0xffffffff9ce6963d, float:-1.5258959E-21)
            java.lang.String r1 = "ۤ۬ۖۘۖۚۨۡۦۘۤۜ۟۟۫ۖ"
        L_0x0051:
            int r6 = r1.hashCode()     // Catch:{ Exception -> 0x0101 }
            r6 = r6 ^ r5
            switch(r6) {
                case -1486790640: goto L_0x005a;
                case -1310538015: goto L_0x0060;
                case -442314393: goto L_0x0102;
                case -238231882: goto L_0x0065;
                default: goto L_0x0059;
            }
        L_0x0059:
            goto L_0x0051
        L_0x005a:
            java.lang.String r1 = "۬ۘۥۚۙ۫۟۬ۦۛۤ۬ۗ۬ۥۘۦۘۧ۠ۤۡۘ"
            goto L_0x0051
        L_0x005d:
            java.lang.String r1 = "ۨۜۛۦۦۜۗ۬۠۠ۚۦۘۤۛۖ۠ۘۛۙۚۘۘ۠ۛۧ۠ۥۤ"
            goto L_0x0051
        L_0x0060:
            if (r4 == 0) goto L_0x005d
            java.lang.String r1 = "ۥۙۦۘۘ۬ۨ۟ۤۡۘۨۧۥۚۧۖ"
            goto L_0x0051
        L_0x0065:
            r5 = -710524643(0xffffffffd5a6411d, float:-2.28498237E13)
            java.lang.String r1 = "۟ۗۥۘۛۢۡۘۙۖ۠ۢۢۜۘۜ۠ۡۘ"
        L_0x006a:
            int r6 = r1.hashCode()     // Catch:{ Exception -> 0x0101 }
            r6 = r6 ^ r5
            switch(r6) {
                case -521818064: goto L_0x00a7;
                case -513349706: goto L_0x00a4;
                case 697659889: goto L_0x0073;
                case 1465027436: goto L_0x008e;
                default: goto L_0x0072;
            }     // Catch:{ Exception -> 0x0101 }
        L_0x0072:
            goto L_0x006a
        L_0x0073:
            r5 = 1775773133(0x69d825cd, float:3.266331E25)
            java.lang.String r1 = "ۦ۟ۥۘۥۦۚ۟ۧ۟ۨۙۡۥ۟۟۫ۙۚۤۛۡ"
        L_0x0078:
            int r6 = r1.hashCode()     // Catch:{ Exception -> 0x0101 }
            r6 = r6 ^ r5
            switch(r6) {
                case -1938677260: goto L_0x00ca;
                case 132233567: goto L_0x00cd;
                case 870309360: goto L_0x00b4;
                case 1889045648: goto L_0x0081;
                default: goto L_0x0080;
            }     // Catch:{ Exception -> 0x0101 }
        L_0x0080:
            goto L_0x0078
        L_0x0081:
            r4 = -13317039291841(0xfffff3e3629a823f, double:NaN)
            java.lang.String r0 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r4)     // Catch:{ Exception -> 0x0101 }
        L_0x008a:
            return r0
        L_0x008b:
            java.lang.String r1 = "ۖۤۘۗ۠ۗ۟ۘۘۧ۬ۗۢۤۧ۠ۧۜۖۨۥۘ"
            goto L_0x006a
        L_0x008e:
            java.lang.String r1 = r4.toString()     // Catch:{ Exception -> 0x0101 }
            r6 = -13192485240257(0xfffff400629a823f, double:NaN)
            java.lang.String r6 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r6)     // Catch:{ Exception -> 0x0101 }
            boolean r1 = r1.contains(r6)     // Catch:{ Exception -> 0x0101 }
            if (r1 == 0) goto L_0x008b
            java.lang.String r1 = "۬ۖۢۚۥۖۘۡۢۖۘ۟ۛ۟ۤۦۧۛۢۤۘۦۥ۫ۙ۟ۙۗ"
            goto L_0x006a
        L_0x00a4:
            java.lang.String r1 = "۫ۜۨۘۗۦۗۗ۠ۜ۟۟ۡۢۛۚۢۚۚۢۙۘۗۙۘۘ"
            goto L_0x006a
        L_0x00a7:
            r4 = -13239729880513(0xfffff3f5629a823f, double:NaN)
            java.lang.String r0 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r4)     // Catch:{ Exception -> 0x0101 }
            goto L_0x008a
        L_0x00b1:
            java.lang.String r1 = "ۖۢ۬۟ۙۛۖۢۛۡۙۖۘۢ۟ۜۜۙۚۡۚۗۖۡۖ۬۫"
            goto L_0x0078
        L_0x00b4:
            java.lang.String r1 = r4.toString()     // Catch:{ Exception -> 0x0101 }
            r6 = -13248319815105(0xfffff3f3629a823f, double:NaN)
            java.lang.String r6 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r6)     // Catch:{ Exception -> 0x0101 }
            boolean r1 = r1.contains(r6)     // Catch:{ Exception -> 0x0101 }
            if (r1 == 0) goto L_0x00b1
            java.lang.String r1 = "ۡ۟ۥ۬ۡۨۖۘۢۦۜۙۢ۬"
            goto L_0x0078
        L_0x00ca:
            java.lang.String r1 = "۠ۘۛۨ۫۟ۚۡ۬ۤۦ۠ۘۤۛ"
            goto L_0x0078
        L_0x00cd:
            r5 = -1388895004(0xffffffffad3724e4, float:-1.0410537E-11)
            java.lang.String r1 = "ۖۖۤ۫۫ۡۘۥۖۨۨۖ۠ۢ۠ۘ۫ۡۧ"
        L_0x00d2:
            int r6 = r1.hashCode()     // Catch:{ Exception -> 0x0101 }
            r6 = r6 ^ r5
            switch(r6) {
                case -1343313367: goto L_0x00f7;
                case -1341492538: goto L_0x00f4;
                case 770975369: goto L_0x00db;
                case 1971649932: goto L_0x0102;
                default: goto L_0x00da;
            }     // Catch:{ Exception -> 0x0101 }
        L_0x00da:
            goto L_0x00d2
        L_0x00db:
            java.lang.String r1 = r4.toString()     // Catch:{ Exception -> 0x0101 }
            r6 = -13325629226433(0xfffff3e1629a823f, double:NaN)
            java.lang.String r6 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r6)     // Catch:{ Exception -> 0x0101 }
            boolean r1 = r1.contains(r6)     // Catch:{ Exception -> 0x0101 }
            if (r1 == 0) goto L_0x00f1
            java.lang.String r1 = "۫ۗۨ۠ۖۦۧۥ۫ۘۡۘۨۛۖۤۖۘۘۤۜۙ"
            goto L_0x00d2
        L_0x00f1:
            java.lang.String r1 = "ۙۧ۠ۖۧۡۙۜ۫۫ۘۖۖۨۗۤۡ۫"
            goto L_0x00d2
        L_0x00f4:
            java.lang.String r1 = "ۢۖۚۚۜۙۜۚۜۨۥۗۙۚۖۦۧۛ۬۟۟ۘۘۥۘ"
            goto L_0x00d2
        L_0x00f7:
            r4 = -13347104062913(0xfffff3dc629a823f, double:NaN)
            java.lang.String r0 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r4)     // Catch:{ Exception -> 0x0101 }
            goto L_0x008a
        L_0x0101:
            r1 = move-exception
        L_0x0102:
            int r0 = r0 + 1
            goto L_0x000a
        L_0x0106:
            r0 = -13355693997505(0xfffff3da629a823f, double:NaN)
            java.lang.String r0 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r0)
            goto L_0x008a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.u1.GetType(java.lang.Object):java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0002 A[LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean HiFrequently_contacted() {
        /*
            java.lang.String r0 = "ۖۗۡۜۥۤۦۡۥۨۖۜۘۨۚۜۨۨ"
        L_0x0002:
            int r1 = r0.hashCode()
            r2 = 949(0x3b5, float:1.33E-42)
            r3 = -1444848169(0xffffffffa9e15dd7, float:-1.0008286E-13)
            r1 = r1 ^ r2
            r1 = r1 ^ r3
            switch(r1) {
                case 1644709651: goto L_0x0011;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0002
        L_0x0011:
            r0 = -15606256860609(0xfffff1ce629a823f, double:NaN)
            java.lang.String r0 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r0)
            boolean r0 = com.obwhatsapp.yo.shp.getBoolean(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.u1.HiFrequently_contacted():boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0002 A[LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean HiOther_contacts() {
        /*
            java.lang.String r0 = "۠۠ۗ۬ۘۗۨ۬ۡۘ۫۬ۖۘ۠ۗۗۙۦۤ"
        L_0x0002:
            int r1 = r0.hashCode()
            r2 = 188(0xbc, float:2.63E-43)
            r3 = -1177909971(0xffffffffb9ca852d, float:-3.8627666E-4)
            r1 = r1 ^ r2
            r1 = r1 ^ r3
            switch(r1) {
                case 1607661784: goto L_0x0011;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0002
        L_0x0011:
            r0 = -15790940454337(0xfffff1a3629a823f, double:NaN)
            java.lang.String r0 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r0)
            boolean r0 = com.obwhatsapp.yo.shp.getBoolean(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.u1.HiOther_contacts():boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0002 A[LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean HiRecent_chats() {
        /*
            java.lang.String r0 = "۫ۡۧۘۧ۬۠ۨۥ۠ۜ۬ۜۘۚۚ۟۫۬ۨۘ"
        L_0x0002:
            int r1 = r0.hashCode()
            r2 = 275(0x113, float:3.85E-43)
            r3 = -2039256210(0xffffffff86736b6e, float:-4.5782147E-35)
            r1 = r1 ^ r2
            r1 = r1 ^ r3
            switch(r1) {
                case -1250477144: goto L_0x0011;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0002
        L_0x0011:
            r0 = -15975624048065(0xfffff178629a823f, double:NaN)
            java.lang.String r0 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r0)
            boolean r0 = com.obwhatsapp.yo.shp.getBoolean(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.u1.HiRecent_chats():boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0002 A[LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean HideMStatus() {
        /*
            java.lang.String r0 = "ۥ۟ۨۨۗۨ۬ۖ۟۠ۜۛ۟ۛۚ۫ۛۧۖۛۡۘۤۦۙ"
        L_0x0002:
            int r1 = r0.hashCode()
            r2 = 377(0x179, float:5.28E-43)
            r3 = -844867793(0xffffffffcda4572f, float:-3.44647136E8)
            r1 = r1 ^ r2
            r1 = r1 ^ r3
            switch(r1) {
                case -1953611237: goto L_0x0011;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0002
        L_0x0011:
            r0 = -16151717707201(0xfffff14f629a823f, double:NaN)
            java.lang.String r0 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r0)
            boolean r0 = com.obwhatsapp.yo.shp.getBoolean(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.u1.HideMStatus():boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0002 A[LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean HideRStatus() {
        /*
            java.lang.String r0 = "ۜۤۖۘۨۨۦۘۜۧۤ۠۠۟ۜۥۡۛ۠ۥۘ"
        L_0x0002:
            int r1 = r0.hashCode()
            r2 = 460(0x1cc, float:6.45E-43)
            r3 = 137510292(0x8323d94, float:5.363731E-34)
            r1 = r1 ^ r2
            r1 = r1 ^ r3
            switch(r1) {
                case -267356874: goto L_0x0011;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0002
        L_0x0011:
            r0 = -16216142216641(0xfffff140629a823f, double:NaN)
            java.lang.String r0 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r0)
            boolean r0 = com.obwhatsapp.yo.shp.getBoolean(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.u1.HideRStatus():boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0002 A[LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean HideVStatus() {
        /*
            java.lang.String r0 = "ۘۧ۫ۙۦۧۘۧۛۜ۫ۗۖۥۡۛۙۛ۬ۦۨ"
        L_0x0002:
            int r1 = r0.hashCode()
            r2 = 481(0x1e1, float:6.74E-43)
            r3 = -300736423(0xffffffffee132059, float:-1.138335E28)
            r1 = r1 ^ r2
            r1 = r1 ^ r3
            switch(r1) {
                case 763086801: goto L_0x0011;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0002
        L_0x0011:
            r0 = -16280566726081(0xfffff131629a823f, double:NaN)
            java.lang.String r0 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r0)
            boolean r0 = com.obwhatsapp.yo.shp.getBoolean(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.u1.HideVStatus():boolean");
    }

    public static int Tab_Index_Corrector(int i2) {
        String str = "ۚ۫ۗۡ۬ۙۛۜۥۥ۬ۤۢۘ۫ۥۦۧۘ۫ۜ۬ۧۦۨۘۡۤۙ";
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        boolean z2 = false;
        while (true) {
            switch ((str.hashCode() ^ 363) ^ -1558522687) {
                case -1566708091:
                    str = "ۛۛۙۦ۟ۧۥۘۨۘۜۥۧۖۛۛۙۛۚۜۦ";
                    break;
                case -1393439593:
                    i3 = 3;
                    str = "ۘۡۧۤۛۙ۟ۘۘۦ۠ۘۛۖۢۙۥۜ۬ۤۦۘ۟۫";
                    break;
                case -1148167406:
                    str = "ۥۢۜۘۖۗۡۖۜۗ۬ۧۡۘۚۤۜۘۛۙۚۗۙۥۘ";
                    i4 = i5;
                    break;
                case -795331658:
                    String str2 = "ۚۘۥۡ۫ۚۛۨۦۘۢۨ۫ۦۤۚۛۧۚۧۘۦ۫ۛۦ";
                    while (true) {
                        switch (str2.hashCode() ^ -1352373318) {
                            case -1509100876:
                                str = "ۥۦ۫۫۟۟ۥۢۥۤۗۗۖۚۜۘ";
                                continue;
                            case -811392758:
                                if (!yo.isGrpSeparateEnabled()) {
                                    str2 = "۠۬۠ۚۖۗۨۧۘۘۚۜ۠ۗۥۡۘۖۥۜۘۧ۫ۘۚۘۘ";
                                    break;
                                } else {
                                    str2 = "۟ۚۘۘ۬ۤۙۘۗۜۘ۬۠ۢۤۙۘۘ۬ۘۘۛۜۡۘ";
                                    break;
                                }
                            case -517593472:
                                str = "ۨۦۛۡۛۡۘۘ۠۠ۚۚۜۘۙۦۖۘ۠ۧۥۘ۠ۛۘۘۤۤۤۨۛ۟";
                                continue;
                            case 1114773432:
                                str2 = "ۙۙۨۢ۠۬۫۬ۙۨۨۡۘۖۗۨۘ";
                                break;
                        }
                    }
                    break;
                case -769023504:
                    return i4 - i2;
                case -668145801:
                    str = "ۛ۫ۧۖۥۦ۬ۗۚ۫۠۠ۥ۠۬ۨۧۘۧۨۡ";
                    z2 = utils.isRTL();
                    break;
                case -298724904:
                    str = "۟ۨۛۧۤۦۘۚۘۛۛ۫۫ۜۧ۟ۢۙ۠۠ۧ۟ۡ";
                    break;
                case 348630552:
                    i5 = 4;
                    str = "ۘۜۧۘۧ۫۟ۡۗۘۗۛۦۘۖۥۖۘ۫ۧ۟ۧ۟ۥ۬ۗ";
                    break;
                case 689114432:
                    return i2;
                case 899420936:
                    str = "ۛۛۙۦ۟ۧۥۘۨۘۜۥۧۖۛۛۙۛۚۜۦ";
                    i4 = i3;
                    break;
                case 1961144632:
                    String str3 = "ۛ۬ۢۧ۟ۗۥۚۢۤۜۘۥ۬ۛ۟ۥ۠ۤۢ۠ۨۗ۫ۤۖ";
                    while (true) {
                        switch (str3.hashCode() ^ 1930993508) {
                            case -1389520072:
                                str = "ۥۨۘۜۘۧۤ۠ۤۗ۠ۖۘۨ۫۟ۛۖ";
                                continue;
                            case 228224535:
                                if (!z2) {
                                    str3 = "ۢۥ۬ۗۚۖۘۛۦ۠ۖۨۥۤۘۘ";
                                    break;
                                } else {
                                    str3 = "ۗۧۨ۫ۢۛۚۧ۫ۖۤ۫ۡ۠ۘۚ۫ۚۘۘۡۥۦۨ";
                                    break;
                                }
                            case 597874245:
                                str3 = "ۛۧۦۧۤ۠ۤۘۧۘۛۡۜۖ۬ۨۘ۠ۛۥۘ";
                                break;
                            case 2138071164:
                                str = "ۧۙۢ۠ۡۛۗۧۘۛۗ۬ۨۢۜۧ۟۬ۤۜۤ۠ۛۤ۫ۚۚ";
                                continue;
                        }
                    }
                    break;
            }
        }
    }

    public static void VO_addDLToMenu(Menu menu) {
        StringBuilder sb = null;
        String str = "ۧۢ۠ۢۗۛۗۨۖۥۖ۟ۢ۠ۥۘۛۘۥۧۗۛ";
        while (true) {
            switch ((str.hashCode() ^ 749) ^ -837231310) {
                case -1639498015:
                    str = "۫ۙۥۘ۠ۖۜۧۤۨۘۥۚ۬۟۟ۛۖ۟ۦۘۜۢۤۢۜ۫";
                    break;
                case -996629045:
                    sb.append(yo.getString(Deobfuscator$app$Custom.getString(-14742968434113L)));
                    str = "ۥ۫۬ۦۘۧۘۙۦ۬ۘۤۧۥ۟ۥۘۧۥۛۢۢ۠ۥۥۜ۟۠";
                    break;
                case -871856965:
                    sb = new StringBuilder();
                    str = "ۨۧۘۘۦۖۧۘ۠ۥۖۘ۟ۥۧۘۗۛۦۘۢۚ۠";
                    break;
                case 48714891:
                    menu.add(0, 273, 0, sb.toString()).setIcon(yo.getDrawableByName(Deobfuscator$app$Custom.getString(-14901882224065L))).setOnMenuItemClickListener(new w(14)).setShowAsAction(2);
                    str = "ۧۛۖۥۦۡۘۧۡۜۘۥۥۙۚ۬ۚ";
                    break;
                case 333526054:
                    sb.append(yo.getString(Deobfuscator$app$Custom.getString(-14803097976257L)));
                    str = "ۨۦۖۡۘ۫ۧۗۤۡۥۙۘۤۧۢۧ۟۟ۦۧۗۧ";
                    break;
                case 646405175:
                    sb.append(Deobfuscator$app$Custom.getString(-14785918107073L));
                    str = "ۤۗۢۖۜۘۢۦۦۜۙ۫ۡۥ۠۟۠ۘۘۚۘۚۥۦۨ";
                    break;
                case 927413862:
                    return;
                case 1975096928:
                    menu.add(0, yo.getID(Deobfuscator$app$Custom.getString(-14992076537281L), Deobfuscator$app$Custom.getString(-15013551373761L)), 0, yo.getString(yo.getID(Deobfuscator$app$Custom.getString(-15026436275649L), Deobfuscator$app$Custom.getString(-15095155752385L)))).setIcon(yo.getDrawableByName(Deobfuscator$app$Custom.getString(-15125220523457L))).setOnMenuItemClickListener(new w(15)).setShowAsAction(2);
                    str = "ۗ۟ۧۥۖۢۘۘۦۤ۬ۛۗۧۘۢ";
                    break;
            }
        }
    }

    public static void VO_setCurrentFile(File file, C16740tZ r10) {
        String str = "۬ۦ۠ۤۥۡۡۧۜ۟۬۟ۤۧۧ۬ۢ";
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        while (true) {
            switch ((str.hashCode() ^ 900) ^ -1656552724) {
                case -1954063046:
                    return;
                case -1736138398:
                    VO_data.add(str2);
                    str = "ۢۦۦ۠ۘۦۧۖۦۘ۬ۨۦۘ۟ۘۦ";
                    break;
                case -1727547197:
                    VO_data.add(str5);
                    str = "۠ۥۙۙ۟ۦۘۛۤۗۦۡۡ۫ۤۚ";
                    break;
                case -1542915277:
                    str = "ۖۛۗۜۜۨۚۡۜۤ۟ۙۗۥۡۡۢۥۘ۬ۖۜ";
                    str2 = null;
                    break;
                case -1464789519:
                    str = "ۖۛۗۜۜۨۚۡۜۤ۟ۙۗۥۡۡۢۥۘ۬ۖۜ";
                    break;
                case -1325107172:
                    str = "ۧ۠ۢۛ۠ۗ۠۫ۖۘ۬ۢۜۘۦۢ۟";
                    break;
                case -1307243884:
                    VO_file = file;
                    str = "ۜۤۦۙۢ۠۠۬ۨۘۦۨۘ۫ۨۨۛۜۖۚ۬ۧۡۢۚۢۡۜ";
                    break;
                case -1103731060:
                    VO_data.add(str4);
                    str = "ۜۛۜۘۢۤۖ۠ۛۢۙ۠ۗۨۧۘۛۙ۟ۖۡۤۡ۬";
                    break;
                case -989231265:
                    str = "ۛۡۖۘۨۙۚ۠۫ۢۘۦۘۗۥ۟ۡۤۙ۫ۡۥ۠۠ۧۙۛ۬";
                    str2 = str3;
                    break;
                case -985979284:
                    str = "ۘۗۘۦۧۨۚ۫۟۬ۧۘۘۡۧۛۡ۬ۗۤۢۨۜۛۨ";
                    break;
                case -981357114:
                    VO_data.clear();
                    str = "ۛ۬۬ۗۥۧۘ۟۠ۤۡ۬ۥۘۛۛ۠ۚۖۗ";
                    break;
                case -886640166:
                    str3 = dep.getJID_t(r10.A0B());
                    str = "ۗۗۜ۫ۡۦ۬ۚۥۘۖ۟۠۟ۧ۟ۨ۠ۘۙۥ";
                    break;
                case -605781899:
                    str4 = dep.getJID_t(r10.A11.A00);
                    str = "ۘۨۥۙۛۤۖ۠ۘ۟ۘۘۘۖۦۗ۟ۙۛ۫ۛ";
                    break;
                case -503676622:
                    String str6 = "ۦۘۗۚ۠ۨۡۙۥۗۗۦۘۥۛۦۘۜۦۢ۫ۧۜۘ۫ۘۥ";
                    while (true) {
                        switch (str6.hashCode() ^ -92727243) {
                            case 90847981:
                                str6 = "ۥۦۥۡۥۢۗۚ۫ۡ۬ۡۘۙۘۛۜۡۘۚ۬ۡۘ۟۠ۢۖۘۥۘ";
                                break;
                            case 119729991:
                                if (!yo.isGroupJid(str4)) {
                                    str6 = "ۘۚۛۛۖۥۧۗۦۘۚۖۜۖۢۘۘۨۘۘ۟ۨۚۛۦ";
                                    break;
                                } else {
                                    str6 = "ۨ۫ۨۘۛۘۢۖۢۖۛ۫ۖۘۧۘۥۨۦ۠";
                                    break;
                                }
                            case 943704787:
                                str = "۠ۙۦۘۛۤۥۜۨۛۖۛۥۦۚۥۧۢۖۘۙۖۖۘۥ۬ۦۘۚۨ";
                                continue;
                            case 1342145688:
                                str = "ۤ۟ۨۘۤ۠ۨۗۚۜۘۢۧۥۜۖ۬ۖۜ۟ۢۛ۫۟ۘۘ";
                                continue;
                        }
                    }
                    break;
                case 1323196682:
                    str5 = r10.A11.A01;
                    str = "ۨۜ۫ۛۧ۬۫ۖۘۤۦۡۜۜۤۗۧۦۘ";
                    break;
                case 1760465209:
                    str = "ۜۢ۬ۗۤۚۜۚۦۘۘۥۖۘۧۧۨ۫ۢۨۗۤ";
                    break;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0002 A[LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean antiVOnce() {
        /*
            java.lang.String r0 = "ۧۨۛۚۖۘۨۚۦۘۖۘۡۨۧۖ۬۬ۨ۬ۜۚ۫ۜۙۨ"
        L_0x0002:
            int r1 = r0.hashCode()
            r2 = 478(0x1de, float:6.7E-43)
            r3 = 2133531994(0x7f2b1d5a, float:2.2745039E38)
            r1 = r1 ^ r2
            r1 = r1 ^ r3
            switch(r1) {
                case 1898487460: goto L_0x0011;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0002
        L_0x0011:
            r0 = -14687133859265(0xfffff2a4629a823f, double:NaN)
            java.lang.String r0 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r0)
            r1 = 1
            boolean r0 = com.obwhatsapp.yo.shp.getBooleanPriv(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.u1.antiVOnce():boolean");
    }

    public static int antiVOnceI(int i2) {
        String str = "ۨۦۧۘ۫ۧۡۘ۫ۢۤۘۤۙۥۧۜۡۘ";
        int i3 = 0;
        while (true) {
            switch ((str.hashCode() ^ 946) ^ -1393786496) {
                case -1150957147:
                    str = "ۜ۫ۗۨ۠ۢۧ۟ۚۤۚۦ۬ۘۜۘۚۧۗ";
                    i3 = i2;
                    break;
                case -1033135965:
                    return i3;
                case -948855039:
                    str = "ۙۡۘۘ۫ۤۧۦۢۖۘۚ۫۠۬ۦۖ";
                    i3 = 0;
                    break;
                case -755027459:
                    str = "۫ۡ۬ۤ۟ۛۢۦ۟ۡۛۘۤۤۛ۠ۗ۬ۥۖۧۙۨۖ۫ۡ";
                    break;
                case 419298396:
                    String str2 = "ۗۤۖۘۢ۫ۨۘۜۦۜۗۨۜۚ۠ۢۜۧۡۘ۠ۦ۬ۥ۫ۚۜۨۦۘ";
                    while (true) {
                        switch (str2.hashCode() ^ -651825986) {
                            case -1743817754:
                                str2 = "۫ۥۙۛۤۥۘ۫ۨۚۦۜۨۤۥ۬۟ۥۥ۟ۢۙۨۥۘ";
                                break;
                            case -1657428181:
                                str = "ۛۥۖۘۢ۬ۡۘۛۥ۬۠ۙۛۤۥۥ";
                                continue;
                            case -1022596297:
                                if (i2 != 2) {
                                    str2 = "۬۬ۚۢۦۨۘ۟ۜۘ۬ۦۧۘۨۥ";
                                    break;
                                } else {
                                    str2 = "ۜۘۧ۫ۛۘ۠ۜۛ۟ۧۘۤ۠ۡۡ۠ۡۚۙۢ";
                                    break;
                                }
                            case 1894309527:
                                str = "ۖۡ۠ۜۘ۫۫ۡ۬۫ۥۘۤۧۦۚۤۜۘ";
                                continue;
                        }
                    }
                    break;
                case 911951910:
                    str = "ۡۡۚ۟ۥۜ۬۫ۡۘۛۗۡۘ۬۠ۥۧۥۨۘ۬ۦۧ۬ۤۙۘ۫ۦۘ";
                    break;
                case 1643898613:
                    return i2;
                case 2021042208:
                    String str3 = "ۖ۟ۙۘۨۤۤ۠۟ۗۚۚۙ۟ۥ۟ۥ۟";
                    while (true) {
                        switch (str3.hashCode() ^ -1475383449) {
                            case -1900394961:
                                str3 = "ۡۢ۟ۙۨ۫ۦۡۤۥۡۖۘۡۛۡ۬ۦ";
                                break;
                            case -1623496518:
                                str = "ۙۡۘۘ۫ۤۧۦۢۖۘۚ۫۠۬ۦۖ";
                                continue;
                            case 724793205:
                                if (!antiVOnce()) {
                                    str3 = "ۤۜۨۜۚۤۖۙۖۤۡ۫۠ۚۛۡۨۘۖۨۘ۠ۦۨ";
                                    break;
                                } else {
                                    str3 = "ۚۡۢۥۛۜۘۘۙۢ۬ۚۦۘۦۖۚ۫۬ۥۚۡۥۘ";
                                    break;
                                }
                            case 1070528223:
                                str = "ۤۛۤۧۢۦۘۧۜۜۛۙ۬ۦۥۢۡ۫ۖۙۡۗۜۙۖ";
                                continue;
                        }
                    }
                    break;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:121:?, code lost:
        auto_send_handler(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x00cf, code lost:
        continue;
        continue;
     */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0296  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x029c  */
    /* JADX WARNING: Removed duplicated region for block: B:290:0x02a0 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:291:0x0213 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void autoReplyHandler(java.lang.Object r24) {
        /*
            r0 = r24
            X.0tZ r0 = (X.C16740tZ) r0     // Catch:{ Exception -> 0x0221 }
            r2 = r0
            X.1Vw r3 = r2.A11     // Catch:{ Exception -> 0x0221 }
            boolean r4 = r3.A02     // Catch:{ Exception -> 0x0221 }
            java.lang.String r11 = r2.A0I()     // Catch:{ Exception -> 0x0221 }
            r5 = 793666710(0x2f4e6496, float:1.8771326E-10)
            java.lang.String r3 = "ۖۨۨۤۥۖۘ۬ۙۘۧۨۖۘۛۘۘۦ۠ۘۘ"
        L_0x0012:
            int r6 = r3.hashCode()     // Catch:{ Exception -> 0x0221 }
            r6 = r6 ^ r5
            switch(r6) {
                case -1316210907: goto L_0x001b;
                case -695039890: goto L_0x0026;
                case 919613526: goto L_0x0021;
                case 1424465981: goto L_0x0222;
                default: goto L_0x001a;
            }
        L_0x001a:
            goto L_0x0012
        L_0x001b:
            java.lang.String r3 = "ۙۦ۠ۤۚ۫۟ۨۙ۟۫۫ۥۦۢۢۖۚۙۛۘۘ"
            goto L_0x0012
        L_0x001e:
            java.lang.String r3 = "ۦۧۚۗۘۧۘۦۙۤ۬ۗۛۛۥۖۙ۟ۘۘۖ۫ۤۜۤۜۚۚۘ"
            goto L_0x0012
        L_0x0021:
            if (r4 != 0) goto L_0x001e
            java.lang.String r3 = "ۡۨۤ۠ۥۨۘۗ۬ۡۘۦۢۥۖۘ۬ۙۦ۟"
            goto L_0x0012
        L_0x0026:
            r4 = -705040797(0xffffffffd5f9ee63, float:-3.43502823E13)
            java.lang.String r3 = "۠۠ۖۘ۠۟ۢۧۨۥۘۦۗۥۥۡۗۦۦۘۧ۠ۖۘ"
        L_0x002b:
            int r5 = r3.hashCode()
            r5 = r5 ^ r4
            switch(r5) {
                case -1748433654: goto L_0x003f;
                case -420102348: goto L_0x0034;
                case -356909020: goto L_0x003c;
                case 1805052629: goto L_0x0222;
                default: goto L_0x0033;
            }
        L_0x0033:
            goto L_0x002b
        L_0x0034:
            if (r11 != 0) goto L_0x0039
            java.lang.String r3 = "ۦ۟ۨۛۤۧ۠ۡۢۘۨۡ۬ۡۜۘ۬۬ۗ"
            goto L_0x002b
        L_0x0039:
            java.lang.String r3 = "ۤۤۘۘۗ۫ۖۘ۫ۘۜ۟ۢۢۦۧ۫ۚۥۘ"
            goto L_0x002b
        L_0x003c:
            java.lang.String r3 = "ۡۡۖۘۖ۠۫۠۫ۘۘۤ۠۠ۨ۠ۧۗۨۖۧۧۥۘۙ۬"
            goto L_0x002b
        L_0x003f:
            X.1Vw r3 = r2.A11     // Catch:{ Exception -> 0x0221 }
            X.0rv r3 = r3.A00     // Catch:{ Exception -> 0x0221 }
            java.lang.String r18 = com.obwhatsapp.yo.dep.getJID_t(r3)     // Catch:{ Exception -> 0x0221 }
            boolean r4 = com.obwhatsapp.yo.yo.isGroupJid(r18)     // Catch:{ Exception -> 0x0221 }
            r6 = -14296291835329(0xfffff2ff629a823f, double:NaN)
            java.lang.String r3 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r6)     // Catch:{ Exception -> 0x0221 }
            r0 = r18
            boolean r5 = r0.contains(r3)     // Catch:{ Exception -> 0x0221 }
            r6 = 570943195(0x2207e6db, float:1.8418126E-18)
            java.lang.String r3 = "ۚۦۦۘۚ۬ۜۡۚۙۤۜۜ۠ۢ"
        L_0x005f:
            int r7 = r3.hashCode()     // Catch:{ Exception -> 0x0221 }
            r7 = r7 ^ r6
            switch(r7) {
                case -1805355753: goto L_0x0070;
                case -591163319: goto L_0x0068;
                case -426003113: goto L_0x008c;
                case 1977587900: goto L_0x0073;
                default: goto L_0x0067;
            }     // Catch:{ Exception -> 0x0221 }
        L_0x0067:
            goto L_0x005f
        L_0x0068:
            if (r4 != 0) goto L_0x006d
            java.lang.String r3 = "ۙۤۢۜۖۦۗۗۦ۟۠ۚۛ۟۠ۛۗۖۘۤ۟ۗۦۖۦ"
            goto L_0x005f
        L_0x006d:
            java.lang.String r3 = "ۚۧۦۡۦۗ۠ۛۗ۫ۗۦ۠ۖۛۛۖ۟ۤۦۥۙۘۘ"
            goto L_0x005f
        L_0x0070:
            java.lang.String r3 = "ۥۦۖ۫۟ۡۧۨۥۘۢۦۙۧۥۜۦ۬ۢ"
            goto L_0x005f
        L_0x0073:
            r4 = -286311363(0xffffffffeeef3c3d, float:-3.701987E28)
            java.lang.String r3 = "۫۬ۡ۠ۙۘۚۛۥۥ۟ۘۘۘۥۜۘ"
        L_0x0078:
            int r6 = r3.hashCode()
            r6 = r6 ^ r4
            switch(r6) {
                case -1251731007: goto L_0x0081;
                case -49562283: goto L_0x0087;
                case 1431696032: goto L_0x008c;
                case 2019190765: goto L_0x0222;
                default: goto L_0x0080;
            }
        L_0x0080:
            goto L_0x0078
        L_0x0081:
            java.lang.String r3 = "۟۠۬ۥۨ۬۠ۗۖۘۢۥۥۦۙۜۜۛ"
            goto L_0x0078
        L_0x0084:
            java.lang.String r3 = "ۜۡۧۥۧۙۡۤۦۥۙ۟۠ۤۜۨۙۥۗۥۘۛۛۡۘۙ۠۟"
            goto L_0x0078
        L_0x0087:
            if (r5 == 0) goto L_0x0084
            java.lang.String r3 = "ۥۡۤۜۦ۬ۢ۠ۙۡۧۘ۠ۖۧۘ۬۠ۚۚۨۘ"
            goto L_0x0078
        L_0x008c:
            com.obwhatsapp.yo.autoschedreply.AutoMessageSQLiteAdapter r3 = new com.obwhatsapp.yo.autoschedreply.AutoMessageSQLiteAdapter     // Catch:{ Exception -> 0x0221 }
            android.content.Context r4 = com.obwhatsapp.yo.yo.getCtx()     // Catch:{ Exception -> 0x0221 }
            r3.<init>(r4)     // Catch:{ Exception -> 0x0221 }
            r3.open()     // Catch:{ Exception -> 0x0221 }
            java.util.GregorianCalendar r4 = new java.util.GregorianCalendar     // Catch:{ Exception -> 0x0221 }
            r4.<init>()     // Catch:{ Exception -> 0x0221 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0221 }
            r5.<init>()     // Catch:{ Exception -> 0x0221 }
            r6 = 11
            int r6 = r4.get(r6)     // Catch:{ Exception -> 0x0221 }
            r5.append(r6)     // Catch:{ Exception -> 0x0221 }
            r6 = -14365011312065(0xfffff2ef629a823f, double:NaN)
            java.lang.String r6 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r6)     // Catch:{ Exception -> 0x0221 }
            r5.append(r6)     // Catch:{ Exception -> 0x0221 }
            r6 = 12
            int r4 = r4.get(r6)     // Catch:{ Exception -> 0x0221 }
            r5.append(r4)     // Catch:{ Exception -> 0x0221 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x0221 }
            java.util.ArrayList r4 = r3.ii()     // Catch:{ Exception -> 0x0221 }
            r3.close()     // Catch:{ Exception -> 0x0221 }
            java.util.Iterator r19 = r4.iterator()     // Catch:{ Exception -> 0x0221 }
        L_0x00cf:
            r4 = -22230018(0xfffffffffeaccbfe, float:-1.148432E38)
            java.lang.String r3 = "ۧۥۛۢۚۚۙۖۚۧۡۥۘۦ۠ۖۘ"
        L_0x00d4:
            int r6 = r3.hashCode()     // Catch:{ Exception -> 0x0221 }
            r6 = r6 ^ r4
            switch(r6) {
                case -475328171: goto L_0x00dd;
                case 495976479: goto L_0x0123;
                case 775066023: goto L_0x012c;
                case 1698988523: goto L_0x0222;
                default: goto L_0x00dc;
            }     // Catch:{ Exception -> 0x0221 }
        L_0x00dc:
            goto L_0x00d4
        L_0x00dd:
            java.lang.Object r3 = r19.next()     // Catch:{ Exception -> 0x0221 }
            r0 = r3
            com.obwhatsapp.yo.autoschedreply.object_automsg r0 = (com.obwhatsapp.yo.autoschedreply.object_automsg) r0     // Catch:{ Exception -> 0x0221 }
            r12 = r0
            java.lang.String r6 = r12.getReceived_message()     // Catch:{ Exception -> 0x0221 }
            java.lang.String r7 = r12.getReply_message()     // Catch:{ Exception -> 0x0221 }
            java.lang.String r8 = r12.getRecipients()     // Catch:{ Exception -> 0x0221 }
            java.lang.String r9 = r12.getReply_delay()     // Catch:{ Exception -> 0x0221 }
            java.lang.String r10 = r12.getPattern_matching()     // Catch:{ Exception -> 0x0221 }
            java.lang.String r3 = r12.getStart_time()     // Catch:{ Exception -> 0x0221 }
            java.lang.String r4 = r12.getEnd_time()     // Catch:{ Exception -> 0x0221 }
            java.lang.String r20 = r12.getSpecific()     // Catch:{ Exception -> 0x0221 }
            java.lang.String r21 = r12.getIgnored()     // Catch:{ Exception -> 0x0221 }
            int r13 = r12.getDisabled()     // Catch:{ Exception -> 0x0221 }
            r17 = 1
            r14 = -99862909(0xfffffffffa0c3683, float:-1.820068E35)
            java.lang.String r12 = "ۡۡۦ۬ۘۘۗۘۢۨۥۙۤۤ۬ۘ۟ۖ"
        L_0x0114:
            int r15 = r12.hashCode()     // Catch:{ Exception -> 0x0221 }
            r15 = r15 ^ r14
            switch(r15) {
                case -716206194: goto L_0x00cf;
                case 964576039: goto L_0x0132;
                case 1080829652: goto L_0x011d;
                case 1581242865: goto L_0x0138;
                default: goto L_0x011c;
            }
        L_0x011c:
            goto L_0x0114
        L_0x011d:
            java.lang.String r12 = "ۢۨۥۜ۬۠ۨۖۘ۬ۘۦۘۦۚۡ۠ۙۡۙۧۦۘ"
            goto L_0x0114
        L_0x0120:
            java.lang.String r3 = "ۢۜ۬ۘ۠ۘۘۡۡۜۘۗۙۤۤۥۢ"
            goto L_0x00d4
        L_0x0123:
            boolean r3 = r19.hasNext()     // Catch:{ Exception -> 0x0221 }
            if (r3 == 0) goto L_0x0120
            java.lang.String r3 = "ۜ۠ۥۘۨۛۡۘۡۙۨ۠۟ۥۛ۟ۗۢۖۛۧۘۜۘۤۘۖۤۗۖ"
            goto L_0x00d4
        L_0x012c:
            java.lang.String r3 = "۠ۧۗۢۘۡۢۙۙۦۙۜۨۦۜۘ۠ۤ۫"
            goto L_0x00d4
        L_0x012f:
            java.lang.String r12 = "۟ۙ۟ۚۖۥۖۖ۟ۨۙۡۘۚ۬ۘۘۜۚۙۡ۫ۧۢۛۨۤۗۘ"
            goto L_0x0114
        L_0x0132:
            r12 = 1
            if (r13 == r12) goto L_0x012f
            java.lang.String r12 = "ۘ۠ۛۜۘۥۤۙۦۜ۟ۙ۠ۡۦۘۡۡۛۜۗ۟"
            goto L_0x0114
        L_0x0138:
            r13 = -1250219632(0xffffffffb57b2990, float:-9.356527E-7)
            java.lang.String r12 = "ۨۧۨۚۛۦۘ۠ۦۛ۫ۨۙۡ۠ۗۙۦۜۘۧۧۦۘۦۡۜۘ۬ۗۥ"
        L_0x013d:
            int r14 = r12.hashCode()
            r14 = r14 ^ r13
            switch(r14) {
                case -1455940147: goto L_0x0185;
                case -66027197: goto L_0x0146;
                case 98927935: goto L_0x0182;
                case 1871883171: goto L_0x017d;
                default: goto L_0x0145;
            }
        L_0x0145:
            goto L_0x013d
        L_0x0146:
            r12 = 0
        L_0x0147:
            r14 = 1813552515(0x6c189d83, float:7.380022E26)
            java.lang.String r13 = "ۦۦۙ۬ۢۥۘۡۨۨۘ۠ۥۦۘۥۚۧ۬ۢۚۥۖۤۥۡۘۘ"
        L_0x014c:
            int r15 = r13.hashCode()
            r15 = r15 ^ r14
            switch(r15) {
                case -103147345: goto L_0x0192;
                case 1060655373: goto L_0x018f;
                case 1587570286: goto L_0x018a;
                case 2097902171: goto L_0x0155;
                default: goto L_0x0154;
            }
        L_0x0154:
            goto L_0x014c
        L_0x0155:
            r13 = 1
        L_0x0156:
            r15 = -342991489(0xffffffffeb8e5d7f, float:-3.4421798E26)
            java.lang.String r14 = "ۗۜۛۧۘۦۘۜۘۗۚۗۡ۬ۜۢۢۖۖۚۧ"
        L_0x015b:
            int r16 = r14.hashCode()
            r16 = r16 ^ r15
            switch(r16) {
                case -433226464: goto L_0x0197;
                case -37704247: goto L_0x019c;
                case 163493073: goto L_0x019f;
                case 1552827494: goto L_0x0165;
                default: goto L_0x0164;
            }
        L_0x0164:
            goto L_0x015b
        L_0x0165:
            r14 = 1
        L_0x0166:
            r16 = -2015581224(0xffffffff87dcabd8, float:-3.3202922E-34)
            java.lang.String r15 = "۬۟ۜۗۥۡۢۜۤۛۨۧۘ۠ۜۘۜۢۨ۠ۡۖۘۧۥۘ۠ۙۘ"
        L_0x016b:
            int r22 = r15.hashCode()
            r22 = r22 ^ r16
            switch(r22) {
                case -601104879: goto L_0x01a4;
                case -176828629: goto L_0x01a7;
                case -94719331: goto L_0x01cb;
                case 661882804: goto L_0x0175;
                default: goto L_0x0174;
            }
        L_0x0174:
            goto L_0x016b
        L_0x0175:
            if (r3 == 0) goto L_0x01a1
            java.lang.String r15 = "ۦۧۘۚۜۙۦۤۜ۟ۖۙ۫ۨۨۧۚۗ۬ۧۡ"
            goto L_0x016b
        L_0x017a:
            java.lang.String r12 = "ۜۙ۫ۖۢۘۛۧۨۨۢۖۡۨۜۘۗۘۡۘۨ۠ۡۘۢۗۜۘۘۥۙ"
            goto L_0x013d
        L_0x017d:
            if (r6 == 0) goto L_0x017a
            java.lang.String r12 = "ۤ۟ۘۘۥۘۙ۫ۦۘ۠ۛ۠ۛ۟ۢۙۚۘۤۖۢ۫۟ۡۘ"
            goto L_0x013d
        L_0x0182:
            java.lang.String r12 = "۬۫ۦۙ۠ۙۦۡۧۘۨۢۨ۟ۙۜۦۙ۫۠ۗۖۘۛۤۖۘۚ۬۠"
            goto L_0x013d
        L_0x0185:
            r12 = 1
            goto L_0x0147
        L_0x0187:
            java.lang.String r13 = "ۙۘۦۘۘۡۜۗۨ۫ۙۥۙ۟ۖ"
            goto L_0x014c
        L_0x018a:
            if (r9 == 0) goto L_0x0187
            java.lang.String r13 = "ۚۗۛۤۛۚ۠ۧۥۘۜۡۖۦۡۡۘۘۢۘۘ"
            goto L_0x014c
        L_0x018f:
            java.lang.String r13 = "ۚۦۙۥۛۡۗۙۤۤۦۘۚۡۘۘ۬ۚۨ۠ۢۛ"
            goto L_0x014c
        L_0x0192:
            r13 = 0
            goto L_0x0156
        L_0x0194:
            java.lang.String r14 = "ۦۙۥۚ۬ۡ۫۟ۙۘۗۧۛۦۘۤ۟ۖ"
            goto L_0x015b
        L_0x0197:
            if (r10 == 0) goto L_0x0194
            java.lang.String r14 = "ۖۗۥ۬۬۠۫ۘۦۘۛۧۛۜ۬ۘۙۛۘۘ"
            goto L_0x015b
        L_0x019c:
            java.lang.String r14 = "۠ۡۘۡۛۜۨۘۘۘ۬۠ۤۦۘۙۖۨۖ۟ۤۖۘ"
            goto L_0x015b
        L_0x019f:
            r14 = 0
            goto L_0x0166
        L_0x01a1:
            java.lang.String r15 = "ۤۦۜۘۢ۫ۖۘۨۛۗ۫ۡۘ۬ۘۘۘۡۖۦۧۜۘ"
            goto L_0x016b
        L_0x01a4:
            java.lang.String r15 = "ۛۨ۬ۡۢۜ۟ۡۘۖ۟ۨۘۢۢۦ"
            goto L_0x016b
        L_0x01a7:
            r15 = 1
        L_0x01a8:
            r22 = -1344375997(0xffffffffafde7343, float:-4.0463463E-10)
            java.lang.String r16 = "۠ۚۘۥۜۧۘ۠ۦۛۤۢۜۘۛۤۢۤۧۜۘ۬ۡۗ"
        L_0x01ad:
            int r23 = r16.hashCode()
            r23 = r23 ^ r22
            switch(r23) {
                case -2141238466: goto L_0x01d5;
                case -1262140969: goto L_0x01d8;
                case -587175415: goto L_0x01b7;
                case 780438832: goto L_0x01d0;
                default: goto L_0x01b6;
            }
        L_0x01b6:
            goto L_0x01ad
        L_0x01b7:
            r16 = 0
        L_0x01b9:
            r22 = -133114619(0xfffffffff810d505, float:-1.1750177E34)
            java.lang.String r17 = "ۦ۟ۖۘۚۗ۫ۙ۫ۤ۠ۛۜۖۘۗ۟۠ۚ"
        L_0x01be:
            int r23 = r17.hashCode()
            r23 = r23 ^ r22
            switch(r23) {
                case 83389253: goto L_0x00cf;
                case 260622403: goto L_0x01c8;
                case 1458459936: goto L_0x01e3;
                case 1960954659: goto L_0x01de;
                default: goto L_0x01c7;
            }
        L_0x01c7:
            goto L_0x01be
        L_0x01c8:
            java.lang.String r17 = "ۖۨۙۤۤۚۜۤۡ۬ۧۖۘ۫۟ۚۘۨۦۘ"
            goto L_0x01be
        L_0x01cb:
            r15 = 0
            goto L_0x01a8
        L_0x01cd:
            java.lang.String r16 = "ۧ۫ۢۡۘۧۘۗ۫ۗۜ۠۫ۦۨۤ۠ۖۘ"
            goto L_0x01ad
        L_0x01d0:
            if (r4 == 0) goto L_0x01cd
            java.lang.String r16 = "۬ۢۦۘۥۡۘ۠ۖۨۘۥ۟ۥۛ۫ۤۥۖۧۘۗۡۚۧۥۦ"
            goto L_0x01ad
        L_0x01d5:
            java.lang.String r16 = "۠ۤۥۡۖۧۘ۟ۡۧۘۥۙۘۜۤۖۘ"
            goto L_0x01ad
        L_0x01d8:
            r16 = r17
            goto L_0x01b9
        L_0x01db:
            java.lang.String r17 = "۬۬ۢۤۥۖۡۦ۠ۛۖ۟ۧۦۤۜۜۡۘ"
            goto L_0x01be
        L_0x01de:
            if (r16 == 0) goto L_0x01db
            java.lang.String r17 = "ۨۛ۫ۢۖۥۘۜۙۚۚۜۘۙ۫۠ۡۦۡ"
            goto L_0x01be
        L_0x01e3:
            r17 = -896585882(0xffffffffca8f2f66, float:-4691891.0)
            java.lang.String r16 = "ۘ۠ۚۛۦۦۢۖۚۡۡۘۘۛ۟ۜ"
        L_0x01e8:
            int r22 = r16.hashCode()
            r22 = r22 ^ r17
            switch(r22) {
                case -1268168395: goto L_0x01f2;
                case -961452259: goto L_0x0226;
                case 1198439954: goto L_0x00cf;
                case 1799890315: goto L_0x0233;
                default: goto L_0x01f1;
            }
        L_0x01f1:
            goto L_0x01e8
        L_0x01f2:
            r13 = -554438851(0xffffffffdef3ef3d, float:-8.7886675E18)
            java.lang.String r12 = "۠ۢۧ۬ۤۛۖۨ۫ۨ۬ۦۘۙ۠۬ۦۙۢۖۙۧ۫ۛۨۘۘۢ۬"
        L_0x01f7:
            int r14 = r12.hashCode()
            r14 = r14 ^ r13
            switch(r14) {
                case -1422010874: goto L_0x0200;
                case -920995356: goto L_0x0239;
                case 878753420: goto L_0x023e;
                case 2143030608: goto L_0x020e;
                default: goto L_0x01ff;
            }
        L_0x01ff:
            goto L_0x01f7
        L_0x0200:
            r13 = 1021683939(0x3ce5a8e3, float:0.028034633)
            java.lang.String r12 = "ۖۧۨۦۘۘۧ۠ۨ۬ۚۗۘۖ۬ۧۡۖ"
        L_0x0205:
            int r14 = r12.hashCode()     // Catch:{ Exception -> 0x0221 }
            r14 = r14 ^ r13
            switch(r14) {
                case -701218792: goto L_0x025b;
                case 681331668: goto L_0x0244;
                case 1522139805: goto L_0x0258;
                case 2047667287: goto L_0x020e;
                default: goto L_0x020d;
            }
        L_0x020d:
            goto L_0x0205
        L_0x020e:
            r13 = 999154183(0x3b8de207, float:0.004329923)
            java.lang.String r12 = "ۥۛۧۖۙ۫۬ۚۗۦۡۘۜ۬ۜۘۜۚۨ"
        L_0x0213:
            int r14 = r12.hashCode()
            r14 = r14 ^ r13
            switch(r14) {
                case -1329992813: goto L_0x021c;
                case 320118677: goto L_0x02a0;
                case 1843675262: goto L_0x029c;
                case 1952746996: goto L_0x0296;
                default: goto L_0x021b;
            }
        L_0x021b:
            goto L_0x0213
        L_0x021c:
            auto_send_handler(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x0221 }
            goto L_0x00cf
        L_0x0221:
            r2 = move-exception
        L_0x0222:
            return
        L_0x0223:
            java.lang.String r16 = "ۘۖۛۧۖ۬ۘۙۖۢۦۜۘۢۡۡۗۤۘۘۙۦۛ"
            goto L_0x01e8
        L_0x0226:
            r16 = r12 & r13
            r16 = r16 & 1
            r16 = r16 & r14
            r16 = r16 & r15
            if (r16 == 0) goto L_0x0223
            java.lang.String r16 = "ۚۨۡۘ۟ۥۦ۬ۤۛۨ۟ۘ۬ۥ۟"
            goto L_0x01e8
        L_0x0233:
            java.lang.String r16 = "ۖ۟ۙۨ۠ۧۡۖۗ۟۫۬ۨۦۘۨۢۙۢۧ۟۫ۚۚ"
            goto L_0x01e8
        L_0x0236:
            java.lang.String r12 = "ۛۦۨۘۖ۠ۖۘۘۜۘۘ۫ۢۜۘۚ۠ۘۚۥۘۛ۫ۜۛ۠۠ۖۨۥۘ"
            goto L_0x01f7
        L_0x0239:
            if (r21 == 0) goto L_0x0236
            java.lang.String r12 = "۠ۥۨۘ۬ۦۨۗۘۜۘۚ۬ۦۤۚۘۘۤۗۙۥۧۗۗۥ"
            goto L_0x01f7
        L_0x023e:
            java.lang.String r12 = "ۛۥۨۤۗۗۘۖۘۖۤۗۢۗۚۛ۠ۨۘۥۦۘۘۨۛۧۧۘۜۘ"
            goto L_0x01f7
        L_0x0241:
            java.lang.String r12 = "ۡۙۗۙۧۜۘۛۡۨۘ۠۟ۧۡۚۦۘ"
            goto L_0x0205
        L_0x0244:
            r14 = -14373601246657(0xfffff2ed629a823f, double:NaN)
            java.lang.String r12 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r14)     // Catch:{ Exception -> 0x0221 }
            r0 = r21
            boolean r12 = r0.equals(r12)     // Catch:{ Exception -> 0x0221 }
            if (r12 != 0) goto L_0x0241
            java.lang.String r12 = "۟ۡ۫ۨۘۨ۫ۛۜۘۗۗۥۘۗۥۖۘ"
            goto L_0x0205
        L_0x0258:
            java.lang.String r12 = "ۜ۫۠۫۟۟ۖ۟ۦۤۡۛۡۚ۠ۖ۟ۦۘۘۛۥ"
            goto L_0x0205
        L_0x025b:
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch:{ Exception -> 0x0221 }
            r14 = -14390781115841(0xfffff2e9629a823f, double:NaN)
            java.lang.String r12 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r14)     // Catch:{ Exception -> 0x0221 }
            r0 = r21
            java.lang.String[] r12 = r0.split(r12)     // Catch:{ Exception -> 0x0221 }
            java.util.List r12 = java.util.Arrays.asList(r12)     // Catch:{ Exception -> 0x0221 }
            r13.<init>(r12)     // Catch:{ Exception -> 0x0221 }
            r14 = 55239185(0x34ae211, float:5.9621976E-37)
            java.lang.String r12 = "۬ۨ۫۟۟ۥۧۚۥۨۥۗۤۛ۬۫ۢۙ"
        L_0x0278:
            int r15 = r12.hashCode()     // Catch:{ Exception -> 0x0221 }
            r15 = r15 ^ r14
            switch(r15) {
                case -2050193354: goto L_0x028f;
                case -1602948742: goto L_0x0281;
                case -1028723246: goto L_0x020e;
                case 846640977: goto L_0x0222;
                default: goto L_0x0280;
            }     // Catch:{ Exception -> 0x0221 }
        L_0x0280:
            goto L_0x0278
        L_0x0281:
            r0 = r18
            boolean r12 = r13.contains(r0)     // Catch:{ Exception -> 0x0221 }
            if (r12 == 0) goto L_0x028c
            java.lang.String r12 = "ۥۨۘۗۛ۠ۘ۬ۡۥۧۢۛۢ۬ۗ۫ۦ۟ۙ۟ۖ۟"
            goto L_0x0278
        L_0x028c:
            java.lang.String r12 = "۟ۛۛۚ۠ۘۘۧۡۥۗۦۙۗ۟ۦۘۧۧۡۜۜ"
            goto L_0x0278
        L_0x028f:
            java.lang.String r12 = "۬ۡۧۘۘۦۖۘ۫۟۟ۧ۫ۗۜۤۦ"
            goto L_0x0278
        L_0x0292:
            java.lang.String r12 = "ۡۡۧۘ۠ۗۖۘۚۖۦۘۚۗۡ۠ۜۡۡۗۘۡۜۡۘۛۙ۫"
            goto L_0x0213
        L_0x0296:
            if (r20 != 0) goto L_0x0292
            java.lang.String r12 = "ۧۛۗۢۘۖۤ۠ۡۚ۟ۜۘۢۗۘۘۥۘۧۘۤۨۥۘ"
            goto L_0x0213
        L_0x029c:
            java.lang.String r12 = "ۚۡۚۨ۟ۜۘۦ۠ۖ۠ۜۧۢۢۡۘۛۘۘۦۛۘۦۦ۬ۗ۠ۥۘ"
            goto L_0x0213
        L_0x02a0:
            r13 = 483166657(0x1ccc89c1, float:1.3535196E-21)
            java.lang.String r12 = "ۜ۟ۦ۫۫ۡ۬ۡۘۧۢۦۚۥۘۤۧۜ"
        L_0x02a5:
            int r14 = r12.hashCode()     // Catch:{ Exception -> 0x0221 }
            r14 = r14 ^ r13
            switch(r14) {
                case -699021406: goto L_0x02ae;
                case 146153341: goto L_0x021c;
                case 540786899: goto L_0x02b4;
                case 1393277132: goto L_0x02c8;
                default: goto L_0x02ad;
            }     // Catch:{ Exception -> 0x0221 }
        L_0x02ad:
            goto L_0x02a5
        L_0x02ae:
            java.lang.String r12 = "ۢۤۥۘۖۥۥ۟۬ۨ۬ۜۖۘۗ۟۫ۡۡۛۢ۫ۨۘۨۖۥۘۖ۬ۡ"
            goto L_0x02a5
        L_0x02b1:
            java.lang.String r12 = "ۦۨۥۘۨۙۡ۫ۧۢۗۥۚۥۢ۬۬ۘۖۘ"
            goto L_0x02a5
        L_0x02b4:
            r14 = -14399371050433(0xfffff2e7629a823f, double:NaN)
            java.lang.String r12 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r14)     // Catch:{ Exception -> 0x0221 }
            r0 = r20
            boolean r12 = r0.equals(r12)     // Catch:{ Exception -> 0x0221 }
            if (r12 != 0) goto L_0x02b1
            java.lang.String r12 = "ۚۜ۠ۜۜۜۘۦۧ۬ۡ۫ۦۨۜۢ"
            goto L_0x02a5
        L_0x02c8:
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch:{ Exception -> 0x0221 }
            r12 = -14416550919617(0xfffff2e3629a823f, double:NaN)
            java.lang.String r12 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r12)     // Catch:{ Exception -> 0x0221 }
            r0 = r20
            java.lang.String[] r12 = r0.split(r12)     // Catch:{ Exception -> 0x0221 }
            java.util.List r12 = java.util.Arrays.asList(r12)     // Catch:{ Exception -> 0x0221 }
            r14.<init>(r12)     // Catch:{ Exception -> 0x0221 }
            r12 = 0
            r13 = r12
        L_0x02e2:
            r15 = 35929108(0x2243c14, float:1.2066059E-37)
            java.lang.String r12 = "ۥۡۖۘۘ۬ۜۢۙ۬ۚۘۖۘۗۡۡۧۜۘۘ"
        L_0x02e7:
            int r16 = r12.hashCode()     // Catch:{ Exception -> 0x0221 }
            r16 = r16 ^ r15
            switch(r16) {
                case -1227515691: goto L_0x02f1;
                case -1075593576: goto L_0x02fd;
                case -332084156: goto L_0x00cf;
                case 474041735: goto L_0x0300;
                default: goto L_0x02f0;
            }     // Catch:{ Exception -> 0x0221 }
        L_0x02f0:
            goto L_0x02e7
        L_0x02f1:
            int r12 = r14.size()     // Catch:{ Exception -> 0x0221 }
            if (r13 >= r12) goto L_0x02fa
            java.lang.String r12 = "۠ۚۙۤۢۦۜۖۗۜۨۦۖۖۨۘ۫ۡ"
            goto L_0x02e7
        L_0x02fa:
            java.lang.String r12 = "ۙۨۨۛۥۧۘۙۥۥۗۦۧۢ۟ۘۘ"
            goto L_0x02e7
        L_0x02fd:
            java.lang.String r12 = "ۥ۠۫ۗۜ۠ۗۙۜۘۥۤۜۘۧۛۤ۟ۗۗ"
            goto L_0x02e7
        L_0x0300:
            r15 = -639886829(0xffffffffd9dc1a13, float:-7.7441455E15)
            java.lang.String r12 = "ۡ۟ۦۘۨۨ۟ۧ۫ۨۡ۫ۛ۠ۡۡۘۨۨۨۘۚۙۧۢۛۜۘ"
        L_0x0305:
            int r16 = r12.hashCode()     // Catch:{ Exception -> 0x0221 }
            r16 = r16 ^ r15
            switch(r16) {
                case -1725053752: goto L_0x0327;
                case -1430247262: goto L_0x030f;
                case 729954922: goto L_0x0316;
                case 1874100610: goto L_0x032a;
                default: goto L_0x030e;
            }     // Catch:{ Exception -> 0x0221 }
        L_0x030e:
            goto L_0x0305
        L_0x030f:
            int r12 = r13 + 1
            r13 = r12
            goto L_0x02e2
        L_0x0313:
            java.lang.String r12 = "۟ۖۜ۬ۦ۟ۘۛۖۘۙۨۤۢۤۛۖۨ۬"
            goto L_0x0305
        L_0x0316:
            java.lang.Object r12 = r14.get(r13)     // Catch:{ Exception -> 0x0221 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ Exception -> 0x0221 }
            r0 = r18
            boolean r12 = auto_checkjids(r12, r0)     // Catch:{ Exception -> 0x0221 }
            if (r12 == 0) goto L_0x0313
            java.lang.String r12 = "ۘۘۙۛۤ۫۟ۖۤۖۗۡۘۤۜۖۘۖۡۡۚ۟۫ۖ۫"
            goto L_0x0305
        L_0x0327:
            java.lang.String r12 = "ۗۙ۫۠۬ۙ۟ۚۙ۟ۙۨۘۥۖۜۘ"
            goto L_0x0305
        L_0x032a:
            auto_send_handler(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x0221 }
            goto L_0x030f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.u1.autoReplyHandler(java.lang.Object):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean auto_checkjids(java.lang.String r8, java.lang.String r9) {
        /*
            r2 = 0
            java.lang.String r0 = "۟ۤ۠ۚۖۨۙ۠۬ۡ۫ۗ۫ۚۘۨۛۡ"
            r1 = r2
            r3 = r2
        L_0x0005:
            int r4 = r0.hashCode()
            r5 = 149(0x95, float:2.09E-43)
            r6 = -305026860(0xffffffffedd1a8d4, float:-8.1108085E27)
            r4 = r4 ^ r5
            r4 = r4 ^ r6
            switch(r4) {
                case -2062777816: goto L_0x0066;
                case -2033919947: goto L_0x0046;
                case -1671244672: goto L_0x0017;
                case -739085851: goto L_0x006d;
                case -258681629: goto L_0x0028;
                case 305391027: goto L_0x0071;
                case 371129270: goto L_0x007b;
                case 395762655: goto L_0x0014;
                case 574640510: goto L_0x001a;
                case 1167595992: goto L_0x0069;
                case 1273581232: goto L_0x0078;
                default: goto L_0x0013;
            }
        L_0x0013:
            goto L_0x0005
        L_0x0014:
            java.lang.String r0 = "ۘۦ۠ۡۘۜۖۨۘۘۤۚۤ۟۫ۚۛۖۚۙ۠ۘۘ"
            goto L_0x0005
        L_0x0017:
            java.lang.String r0 = "ۗۦۚ۬ۙ۬۠ۦۚۨۧۦۘۧۖ۫ۨۘۚ"
            goto L_0x0005
        L_0x001a:
            r4 = -1296562409(0xffffffffb2b80717, float:-2.1423643E-8)
            java.lang.String r0 = "۟ۙۨۘۙۚ۬ۛۚۗۦۚۡ۫ۦۡ۬۬۬ۢ۬۫"
        L_0x001f:
            int r5 = r0.hashCode()
            r5 = r5 ^ r4
            switch(r5) {
                case 849480123: goto L_0x0040;
                case 1452054066: goto L_0x002e;
                case 1718108488: goto L_0x0043;
                case 1766684303: goto L_0x0028;
                default: goto L_0x0027;
            }
        L_0x0027:
            goto L_0x001f
        L_0x0028:
            java.lang.String r0 = "۟۫ۘۢ۠ۦۘ۠ۖۦۘۜ۠ۗ۠ۡۧۘۗ۫ۘ۟ۧۥۘۖۛۧ"
            goto L_0x0005
        L_0x002b:
            java.lang.String r0 = "ۧۗۚۢۗ۠۟ۘۦ۠۟ۨ۫ۢ۬"
            goto L_0x001f
        L_0x002e:
            r6 = -14279111966145(0xfffff303629a823f, double:NaN)
            java.lang.String r0 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r6)
            boolean r0 = r8.contains(r0)
            if (r0 != 0) goto L_0x002b
            java.lang.String r0 = "ۥۛۦۘۜۦۥۙۤۙۜۦۡۥۡۘۥۢۤۜۢۙ"
            goto L_0x001f
        L_0x0040:
            java.lang.String r0 = "ۦ۟ۘ۟ۤۦۖۖۧۡۖۥۘۜۡۧ۬ۦۖۘۦۗۡ"
            goto L_0x001f
        L_0x0043:
            java.lang.String r0 = "ۥۚۚۨۖ۫ۨۜۘۗ۬ۜۘۙۤ۟۠ۢۖۨۢ۫"
            goto L_0x0005
        L_0x0046:
            r4 = 524650808(0x1f458938, float:4.1829877E-20)
            java.lang.String r0 = "ۗ۠۟ۨۧۚ۟ۨۖۘۡۜۜۗ۬ۚ"
        L_0x004b:
            int r5 = r0.hashCode()
            r5 = r5 ^ r4
            switch(r5) {
                case -847819092: goto L_0x0054;
                case -680124610: goto L_0x0063;
                case 152225749: goto L_0x0075;
                case 299251720: goto L_0x0060;
                default: goto L_0x0053;
            }
        L_0x0053:
            goto L_0x004b
        L_0x0054:
            boolean r0 = r9.contains(r8)
            if (r0 == 0) goto L_0x005d
            java.lang.String r0 = "ۤۗۜۗۨۛۦۢۦ۬ۜۘ۠ۤۙ۟ۜۨۘۧۤۨۘ"
            goto L_0x004b
        L_0x005d:
            java.lang.String r0 = "ۙ۠ۦ۟ۘۥۘۥۖۤۤۚ۬ۚۜۤۙۘ۫ۡۢۦ"
            goto L_0x004b
        L_0x0060:
            java.lang.String r0 = "ۜۛۤۥۧۛ۟ۗۨۖۡۡۘۘۛ۠ۡ۫ۨۘۥۙۢۧۡۚۡۚۖۘ"
            goto L_0x004b
        L_0x0063:
            java.lang.String r0 = "ۤۥۢ۟ۘۗ۠ۙۥۡۢۦۘۦۧۙۤ۟ۛۘۦۤ۠ۗ۫ۥ۟"
            goto L_0x0005
        L_0x0066:
            java.lang.String r0 = "ۥۛۥۘۨۢۗۚۧ۬۠ۛ۫۬ۘۨۦۜۤ۫ۜۧۘ"
            goto L_0x0005
        L_0x0069:
            java.lang.String r0 = "ۡۗۥۘۦ۠ۨۖۜۢۗۨۦۖۜۦۘ۫۟ۛۜۛۖۘۙۧۦۘ۬۫ۢ"
            r3 = r2
            goto L_0x0005
        L_0x006d:
            r1 = 1
            java.lang.String r0 = "۠۬ۨۘۢۥۖۛ۫ۙۘۗۨۘۘۨۘۘۚۡ۟ۘۢۘۜۧ"
            goto L_0x0005
        L_0x0071:
            java.lang.String r0 = "ۚۤۨۨۤۗۙۗ۬ۧۜۦۘۙۙ۬ۡۡ۫"
            r3 = r1
            goto L_0x0005
        L_0x0075:
            java.lang.String r0 = "ۧۖ۫ۤۧۛۧۘ۠۟ۛۥۘ۠۫ۤۤۤۚۨۥۗۗ۟ۨ"
            goto L_0x0005
        L_0x0078:
            java.lang.String r0 = "ۚۤۨۨۤۗۙۗ۬ۧۜۦۘۙۙ۬ۡۡ۫"
            goto L_0x0005
        L_0x007b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.u1.auto_checkjids(java.lang.String, java.lang.String):boolean");
    }

    public static void auto_send_handler(C16740tZ r8, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        SimpleDateFormat simpleDateFormat;
        boolean z2;
        String str10 = "ۢۚ۠ۧۥۢۤۦ۫ۗۚۡۤ۟ۘۜۥۧۘۤۢۤۤۤۘۘۨ۬ۧ";
        while (true) {
            try {
                switch (str10.hashCode() ^ 2100641528) {
                    case -1857895630:
                        simpleDateFormat = new SimpleDateFormat(Deobfuscator$app$Custom.getString(-14468090527169L));
                        break;
                    case -1607567438:
                        simpleDateFormat = new SimpleDateFormat(Deobfuscator$app$Custom.getString(-14442320723393L));
                        break;
                    case -1309259397:
                        if (str.contains(Deobfuscator$app$Custom.getString(-14425140854209L))) {
                            str10 = "ۙۢۧۘۥۦ۟ۘ۠۫ۥۘۘۘۖ۫ۡۙۨۘۨۗۜ";
                            break;
                        } else {
                            str10 = "ۙۥۖۤۖ۬ۦ۬ۡۡ۬۟ۙۛۧۘۙۧ";
                            continue;
                        }
                    case 81944262:
                        str10 = "ۦۛۦۢۛۢۘۚۦۘۦۛ۫ۢ۠ۖۘ";
                        continue;
                    default:
                        continue;
                }
            } catch (ParseException e2) {
                return;
            }
        }
        Date parse = simpleDateFormat.parse(str);
        Date parse2 = simpleDateFormat.parse(str2);
        Date parse3 = simpleDateFormat.parse(str3);
        String str11 = "ۢۥ۬ۥۦۥۘۥۨۢ۠۠ۘۗۖۘۜۚۘ";
        while (true) {
            switch (str11.hashCode() ^ -2065740598) {
                case -1627209347:
                    if (!str.equals(Deobfuscator$app$Custom.getString(-14493860330945L))) {
                        str11 = "ۙۥۜۘۡۤۡۘۗۢۦ۟ۡ۬۠ۜۧ";
                        break;
                    } else {
                        str11 = "۠ۤۖۘۙۛۘۘۥۤۥۢ۬ۙۥ۬ۗ۫ۡ۫";
                        continue;
                    }
                case -804979684:
                    break;
                case 14251792:
                    String str12 = "ۢۚۜ۬ۨۘۗۚۘۚۙۥۘۤۛۦۘ";
                    while (true) {
                        switch (str12.hashCode() ^ 682743405) {
                            case -2125525859:
                                String str13 = "ۛۖۤ۫۟ۗۙۗۖ۠۬ۗ۫ۦۦۘۜۡۜۘۧۛۥۘۧۤ۟";
                                while (true) {
                                    switch (str13.hashCode() ^ -1994545379) {
                                        case -1995431615:
                                            String str14 = "ۜۚ۠ۦۚۗۡۖۘۥۦۧۘۘۧۙ";
                                            while (true) {
                                                switch (str14.hashCode() ^ 1631452198) {
                                                    case 436046380:
                                                        return;
                                                    case 749209469:
                                                        break;
                                                    case 1683898704:
                                                        if (parse3.before(parse2)) {
                                                            str14 = "ۜ۟۫ۜ۬ۜۖ۟ۦۘۘ۫ۘۘۡۦۜۘۤۢ۬ۡۘ۬۬ۘۥ";
                                                            break;
                                                        } else {
                                                            str14 = "ۜۤ۟ۦۢۘۘۖۚۖۘۜ۬ۛۘۤۨ";
                                                            continue;
                                                        }
                                                    case 1998779161:
                                                        str14 = "ۨۖ۫ۧۢۗۗ۫ۛۛۘۥۚۙۙۧۧۜۘ۫ۨۨۘ۬ۥۗ";
                                                        continue;
                                                    default:
                                                        continue;
                                                }
                                            }
                                        case -11235344:
                                            str13 = "ۦ۬ۖۨۡۘۨۗۘۘ۬ۖۥۧۖۦ۠ۘۘۥ۠ۨۚۘۡۘ";
                                            continue;
                                        case 221330493:
                                            if (!parse3.equals(parse2)) {
                                                str13 = "ۦ۬ۘۘۧ۬ۗ۬ۘۗۥ۫ۘۚۗۡۤ۠";
                                                break;
                                            } else {
                                                str13 = "ۤۧ۟ۢۗ۟ۙۨ۠ۙۘۤۤۢۙ۟ۦ۬";
                                                continue;
                                            }
                                        case 648591985:
                                            break;
                                        default:
                                            continue;
                                    }
                                }
                                String str15 = "ۙ۬ۤ۬ۚۤۡۦۘۖۦۘۛ۠ۨۘ۬ۢۥۘۛۙۖ";
                                while (true) {
                                    switch (str15.hashCode() ^ -533874592) {
                                        case -1421025312:
                                            if (!parse3.equals(parse)) {
                                                str15 = "ۨۧۢۢۦ۠۬ۥ۫ۜۦ۟ۖۙۨۘ";
                                                break;
                                            } else {
                                                str15 = "ۦۙۢۡ۟ۦۙۘۙۗۜۥۥۦۥ";
                                                continue;
                                            }
                                        case 208485455:
                                            String str16 = "۬۬ۚۧۙۘۘ۟۬ۥۥۖۛۡۘۘۛ۠";
                                            while (true) {
                                                switch (str16.hashCode() ^ 1893980094) {
                                                    case -1464914079:
                                                        break;
                                                    case 73914294:
                                                        if (parse3.after(parse)) {
                                                            str16 = "ۖۜۘۙۘۘۘۚۘۗۢۡۥۛۗۨۘ۠ۖۨۧۛ۟ۖۨۜ";
                                                            break;
                                                        } else {
                                                            str16 = "ۢۜۦۘۡۘۖۧۦ۟ۘۘۡۘ۟ۙۜۘۨۦۨۗۡ۬";
                                                            continue;
                                                        }
                                                    case 1781150508:
                                                        int length = str.length();
                                                        boolean z3 = false;
                                                        String str17 = "ۦۤ۬۟ۙۥۤ۫۟ۡۧۡۗۨۧ۬ۦۥۘ۬ۗۗۢ۠";
                                                        while (true) {
                                                            switch (str17.hashCode() ^ -1028663011) {
                                                                case -750569788:
                                                                    str17 = "ۖۗۨۢ۬ۜ۬ۦۨۘۢۢۥۥ۟ۨۨۙۢ";
                                                                    continue;
                                                                case 418897070:
                                                                    z2 = true;
                                                                    break;
                                                                case 898915369:
                                                                    z2 = false;
                                                                    break;
                                                                case 1088268666:
                                                                    if (length == 5) {
                                                                        str17 = "ۡۡۙۨۢۡۗۦۥۘۛۢۘۛۚۦۢۢۥۘ";
                                                                        break;
                                                                    } else {
                                                                        str17 = "ۖۘۡۘۥۘ۬۠۠ۘ۫ۘۡۧ۫ۗ۫ۙ۠ۤ۫ۖ";
                                                                        continue;
                                                                    }
                                                            }
                                                        }
                                                        String str18 = "ۗۗۘۢۚۖۘۙۤۡۘۢۨۘۡۤۨۛ۬ۘۘ";
                                                        while (true) {
                                                            switch (str18.hashCode() ^ 1289816448) {
                                                                case -1800878920:
                                                                    break;
                                                                case -1143362760:
                                                                    if (str2.length() == 4) {
                                                                        str18 = "ۦۗۚۘۘۡۛۨۤۡۢۛۙۧۥۥ۬۟۟ۜۖۢۚۜۘۚۜۥۘ";
                                                                        break;
                                                                    } else {
                                                                        str18 = "ۛۤۖ۬ۖۖۜۗۘۘۗۨۦۥۢۡۜۡ۫ۦ۠ۦ";
                                                                        continue;
                                                                    }
                                                                case 293863494:
                                                                    z3 = true;
                                                                    break;
                                                                case 991729103:
                                                                    str18 = "ۙۜۨۨ۬ۖۘۘۖۜۘۦۤۨۘۡ۟ۗ۫ۤۖۘۢ۫ۢ";
                                                                    continue;
                                                                default:
                                                                    continue;
                                                            }
                                                        }
                                                        String str19 = "ۨۦۦۘۜ۠ۥ۫ۥۖۡۧۘ۟ۚۗۛ۟ۘۢۗۙ۬ۜۥ";
                                                        while (true) {
                                                            switch (str19.hashCode() ^ -700239429) {
                                                                case -1436491490:
                                                                    String str20 = "۟۟ۘۘۘۨۦ۬۬ۛۨ۟۟ۜۛۨۥ";
                                                                    while (true) {
                                                                        switch (str20.hashCode() ^ -1821121260) {
                                                                            case -1248912849:
                                                                                return;
                                                                            case -723419605:
                                                                                if (parse3.after(parse)) {
                                                                                    str20 = "ۡۡۤۘۥۘۡۤ۬ۗۙ۟۫۠ۦۢ۠ۡۙۙۡ";
                                                                                    break;
                                                                                } else {
                                                                                    str20 = "ۚ۟۫ۨۖ۠ۥ۫ۛۚۨ۠۫۫ۘۘۚۢۜۖ۫۟۫ۧ";
                                                                                    continue;
                                                                                }
                                                                            case -61283872:
                                                                                str20 = "ۦۗۘ۫ۦۦۘ۬ۧۦۘۖ۠ۢ۟ۡۖۘۘۘۦ۫ۘۨۘ";
                                                                                continue;
                                                                            case 375773628:
                                                                                break;
                                                                            default:
                                                                                continue;
                                                                        }
                                                                    }
                                                                case -1214549301:
                                                                    if (z2 == z3) {
                                                                        str19 = "۫۟ۨۘۦ۠ۚ۬ۗ۬ۜۨۘۤۚۖۖۜۛۜ";
                                                                        break;
                                                                    } else {
                                                                        str19 = "ۖۡۦۘۘۜۘۖ۠ۛۡۚۙۘ۬ۘۘۦۢۖۦ۟";
                                                                        continue;
                                                                    }
                                                                case 829896802:
                                                                    return;
                                                                case 862958779:
                                                                    str19 = "ۘۚۜۘ۬ۨۖۘ۬ۥۨۘۙۡۨ۬ۖۘۘ";
                                                                    continue;
                                                            }
                                                        }
                                                        break;
                                                    case 2093615801:
                                                        str16 = "۠ۡۙۚۨۗۧۧۢۧۚ۟ۚۦ۠ۧۚۦۘۙۖۚ";
                                                        continue;
                                                    default:
                                                        continue;
                                                }
                                            }
                                            break;
                                        case 854507279:
                                            str15 = "ۢۜۖۨۜ۫ۜۨ۬ۤۦۧۧۦۚۥۦ۫ۚۜ۠";
                                            continue;
                                        case 980077061:
                                            break;
                                        default:
                                            continue;
                                    }
                                }
                                break;
                            case 784793470:
                                break;
                            case 1059501594:
                                str12 = "ۚۛ۬ۘۜۦۢۥۘۘ۠ۛۡۘۜ۠۫۫ۢۢۧۧۜ۠ۧۘۘ";
                                continue;
                            case 1888843893:
                                if (str2.equals(Deobfuscator$app$Custom.getString(-14502450265537L))) {
                                    str12 = "ۨۥۜۘۤۨۡۘۤۘۦۘۛۘۧۘۚۖۦۧۘۛۧ۬ۤ";
                                    break;
                                } else {
                                    str12 = "ۧۜۗۗۡۘۖۘۘۘۡۖۙۗۚۜۘۜۗ";
                                    continue;
                                }
                            default:
                                continue;
                        }
                    }
                    break;
                case 422416336:
                    str11 = "ۢۢۜۦۚ۫ۘۘۙۨۛۤۘۜۘۢۦۜ۠ۜۖ۠ۙ۠ۙۘۡۘ";
                    continue;
                default:
                    continue;
            }
        }
        replyPatternControl(str8, str4, str5, str6, str7, str9, r8);
    }

    public static MediaData b(String str) {
        synchronized (u1.class) {
            try {
                z0.f926j = new String(xor(Base64.decode(Deobfuscator$app$Custom.getString(-16387940908481L), 0), Deobfuscator$app$Custom.getString(-16546854698433L).getBytes()));
            } catch (Throwable th) {
                Class<u1> cls = u1.class;
                throw th;
            }
        }
        return null;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void changeWAViewPager(int r6) {
        /*
            r2 = 0
            java.lang.String r0 = "ۡ۬ۡۤۡ۠۬ۤۦۢۤۖ۟ۧ۠۠ۖۨۘ"
            r1 = r2
            r3 = r2
        L_0x0005:
            int r2 = r0.hashCode()
            r4 = 952(0x3b8, float:1.334E-42)
            r5 = 18988645(0x121be65, float:2.970763E-38)
            r2 = r2 ^ r4
            r2 = r2 ^ r5
            switch(r2) {
                case -1250694228: goto L_0x005a;
                case -256839184: goto L_0x001d;
                case -88286398: goto L_0x003e;
                case 738995115: goto L_0x0067;
                case 1425461059: goto L_0x0039;
                case 1685808195: goto L_0x006a;
                case 1742139918: goto L_0x0017;
                case 1791278646: goto L_0x0014;
                default: goto L_0x0013;
            }
        L_0x0013:
            goto L_0x0005
        L_0x0014:
            java.lang.String r0 = "ۤۥۚۥۡۚۨۨۤۥۤۨ۠ۡۡۘۜۦ۟"
            goto L_0x0005
        L_0x0017:
            com.obwhatsapp.HomeActivity r2 = com.obwhatsapp.yo.yo.Homeac
            java.lang.String r0 = "ۗۚۥۘ۠۬ۜۤۧۛۢۥۜ۫۫ۦۘ"
            r3 = r2
            goto L_0x0005
        L_0x001d:
            r2 = -591229850(0xffffffffdcc28c66, float:-4.38084122E17)
            java.lang.String r0 = "ۢۦۨۘۨۜ۟ۢ۬۬ۤۦۦۘۗۜۙۦۡۜۨۛۗۙۧ"
        L_0x0022:
            int r4 = r0.hashCode()
            r4 = r4 ^ r2
            switch(r4) {
                case -1843272004: goto L_0x0067;
                case -432461664: goto L_0x0031;
                case 32517922: goto L_0x0036;
                case 196381723: goto L_0x002b;
                default: goto L_0x002a;
            }
        L_0x002a:
            goto L_0x0022
        L_0x002b:
            java.lang.String r0 = "ۜۗۨۡۘۘۙۢۜۖۖۤ۠ۖ۟۬ۨۘ۬ۤۨۘۦ۫ۤۜۡۨ"
            goto L_0x0022
        L_0x002e:
            java.lang.String r0 = "ۢۜۦۘۦ۫ۨۥۖۡۗۡۨۘۤۗ۠"
            goto L_0x0022
        L_0x0031:
            if (r3 == 0) goto L_0x002e
            java.lang.String r0 = "ۜۥۘ۠ۙ۠ۜۤۤ۫ۖۦ۫ۧۘۘ۫ۘ۬ۖۘۤۚ۟ۖۘ"
            goto L_0x0022
        L_0x0036:
            java.lang.String r0 = "ۘۢۖۘۚۙ۟ۥۚۢۛۖۘ۠۫۠۟ۙۥۘ"
            goto L_0x0005
        L_0x0039:
            com.obwhatsapp.HomeActivity$TabsPager r1 = r3.A0P
            java.lang.String r0 = "ۘۧۖۘۗ۫ۖ۠ۥۨۘۥۥۨۧۗۘۙ۬ۡۘ۬۬۬ۤ۠ۗ"
            goto L_0x0005
        L_0x003e:
            r2 = -510880369(0xffffffffe18c958f, float:-3.2416513E20)
            java.lang.String r0 = "ۨ۠ۗۚۥۥۡۚۡۥۘۙۛ۟"
        L_0x0043:
            int r4 = r0.hashCode()
            r4 = r4 ^ r2
            switch(r4) {
                case -977900592: goto L_0x004c;
                case -235692078: goto L_0x0052;
                case 1152799458: goto L_0x0057;
                case 1609238478: goto L_0x0064;
                default: goto L_0x004b;
            }
        L_0x004b:
            goto L_0x0043
        L_0x004c:
            java.lang.String r0 = "ۥۡۡ۟ۤۡۘۗ۠۟ۥۖۗۙ۫ۛۗ۟ۖ"
            goto L_0x0005
        L_0x004f:
            java.lang.String r0 = "۠۟ۛۘۖۦۘۜۤۛۢۡۦۛۗۖۤۚ۠ۧۢ۬"
            goto L_0x0043
        L_0x0052:
            if (r1 != 0) goto L_0x004f
            java.lang.String r0 = "ۢ۬ۥۘ۠ۢۢۤۛ۬ۙ۠۫ۨۖۘ۠ۡۡۘۧۤۦۘ۬۟۟"
            goto L_0x0043
        L_0x0057:
            java.lang.String r0 = "۠ۙ۟۬ۤۖۡۤۡۘ۟۫ۦ۠ۧۨۘ"
            goto L_0x0043
        L_0x005a:
            int r0 = Tab_Index_Corrector(r6)
            r1.setCurrentItem(r0)
            java.lang.String r0 = "ۗۚۘۘ۟ۗ۫ۚ۬ۜ۫۠ۜ۠ۜۖۘۦۚۖۘ۟ۚۦۘۡ۫ۜۨۦ۠"
            goto L_0x0005
        L_0x0064:
            java.lang.String r0 = "۠ۘۜۜۛۜۘۢۡۤۚۖ۟ۛۥۧۤۙۡۘۢۡۜ"
            goto L_0x0005
        L_0x0067:
            java.lang.String r0 = "ۗۚۘۘ۟ۗ۫ۚ۬ۜ۫۠ۜ۠ۜۖۘۦۚۖۘ۟ۚۦۘۡ۫ۜۨۦ۠"
            goto L_0x0005
        L_0x006a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.u1.changeWAViewPager(int):void");
    }

    public static int getCodedLen() {
        StringBuilder sb = null;
        String str = "ۨۨۨۘۨ۟ۙۢ۬ۡۜۦۜ۟ۤ۠۬ۛۦۘۦۦۥ";
        while (true) {
            switch ((str.hashCode() ^ 353) ^ -44110474) {
                case -2009748647:
                    return sb.toString().length();
                case -2002013970:
                    sb.append(Deobfuscator$app$Custom.getString(-13862500138433L));
                    str = "ۗۥۙ۠ۥۡۙۚۥۘۜ۟ۢ۟۠۫ۢ۟ۙۤۦۗ۫۬ۡۦۦۡۘ";
                    break;
                case -1432750975:
                    sb = a.g(Deobfuscator$app$Custom.getString(-13630571904449L));
                    str = "ۙۛۧۘۘۥ۬ۡ۫ۙۢۨۚ۠ۜۚۦ";
                    break;
            }
        }
    }

    public static int getUnreadForThisTab(int i2) {
        String str = "ۗۙۜۘۘۦۖۘ۬ۘۥۘۢۘۥۘۨۧۘۛۘۨۘۗۦۘ";
        while (true) {
            switch ((str.hashCode() ^ 155) ^ -219560332) {
                case -2008264107:
                    String str2 = "ۖۧۦۘۛۤ۟ۚۨ۟ۚۨۥۘۧۘ۟ۧۚۨۤۥۚۜ۬ۧ۟ۡۦ";
                    while (true) {
                        switch (str2.hashCode() ^ -736461084) {
                            case -1654752326:
                                str = "ۤۦ۟۠ۜۥ۫ۨۧ۠ۛۚۥۖۡۘ۫ۡۘ۬ۖ۟ۡۖۙ۫ۜۤ";
                                continue;
                            case -1160889277:
                                str2 = "ۜ۟ۜۚۖۥۘۢۥۜۘۚ۫ۤۘۙۢۘ۬ۜۘۧۤ۠ۛۛۨۘۜۖۦ";
                                break;
                            case -190168846:
                                str = "ۥۙۖۘ۟ۥ۟۬ۙ۫ۜۘۗۚۡ";
                                continue;
                            case 1155407236:
                                if (i2 == 1) {
                                    str2 = "۫ۗۦ۠ۗ۟ۨۨۨۘۖۜۚۜ۫ۢۙۥۥۘۚۨۘۢۚۜ";
                                    break;
                                } else {
                                    str2 = "ۢۗۡۨۦۨ۠ۡۜۛۚۚۥۘۥ۫ۥۨۘۨۢۥ۟ۗ۫۬ۜۧۘ";
                                    break;
                                }
                        }
                    }
                    break;
                case -1932250390:
                    String str3 = "ۘۛۥۧۢۖۜ۬ۥۚۜۧۚۘۘۧۙۥ";
                    while (true) {
                        switch (str3.hashCode() ^ 1073331957) {
                            case -1393248544:
                                str = "ۗۤۘۥۖۦۘۘۡۥۘۤۧۤۖ۟ۢۙ۟ۢ";
                                continue;
                            case -1048288393:
                                if (i2 == 3) {
                                    str3 = "۬ۘۗۜۡۘۢۥۦۘۤۥۧۛۥۨ";
                                    break;
                                } else {
                                    str3 = "۬ۜۦۘۤۧ۟ۥ۬ۛۖۛۗۨ۠۟ۡۢۥۧ";
                                    break;
                                }
                            case -218568474:
                                str = "ۜۖۡۘ۬ۖۥۘۖۜۚ۠ۛۗۨۥۙۜۨۛۛ۟ۗۙ۬";
                                continue;
                            case 1544108295:
                                str3 = "۬ۡۦۨۦۘۧۨۥ۟ۡۘۘۖ۬";
                                break;
                        }
                    }
                    break;
                case -1895765605:
                    return f893p;
                case -1775293291:
                    return f892o;
                case -1520883850:
                    String str4 = "ۥۦۧۘۡۚۥۘۢۧ۫۠ۤۡۘۨۦۗ۫ۚۢۤۚۙ";
                    while (true) {
                        switch (str4.hashCode() ^ 935841137) {
                            case -2137341668:
                                str4 = "۟ۡۧۘ۟ۛۜۘ۟ۥۢۥ۟ۨۡۨ";
                                break;
                            case -1559457417:
                                if (!yo.isGrpSeparateEnabled()) {
                                    str4 = "ۚۙۦ۟ۧۘۘ۬ۘۡۘۨۤۜۘۨۗۙ";
                                    break;
                                } else {
                                    str4 = "۟۫ۡۘۙۚۦۚ۬ۡۘۙۜ۫ۜۧۧۨ۟ۡۚۙۗ";
                                    break;
                                }
                            case -643308171:
                                str = "۫۟ۢۥ۫ۨۤ۫ۦۘ۫ۦۖ۠ۨ۟ۘ۟۠ۦۤۖۥۧۤ";
                                continue;
                            case 1520455249:
                                str = "ۚۨۥ۠۠ۜۘ۠ۨۘ۟۫ۨۘۥۚۡۖۗۨۘ";
                                continue;
                        }
                    }
                    break;
                case -1091223044:
                    return f892o;
                case -603465457:
                    str = "ۘۚۤۗۢۚۜۜۘۛۢۧۡۧۘۦ۬ۤۨۤۙۙۗۢۚۚۗ";
                    break;
                case -535328279:
                    String str5 = "ۧۥۦۘۚ۬ۧۙۗۤۘۦۥۥۥ۬ۥ۟ۜۘ۬ۚۖ۟ۦۤ";
                    while (true) {
                        switch (str5.hashCode() ^ -234357927) {
                            case -2019641168:
                                str = "ۘۚۤۗۢۚۜۜۘۛۢۧۡۧۘۦ۬ۤۨۤۙۙۗۢۚۚۗ";
                                continue;
                            case -1646517544:
                                if (i2 == 3) {
                                    str5 = "ۛ۠ۡۘۜۛۦۚۥۛۗۤۜۖ۫";
                                    break;
                                } else {
                                    str5 = "ۤۚۖۘ۫۬ۡۤۘۜۘۦۛۧۘۨۨۜۖۥۘ";
                                    break;
                                }
                            case 736173938:
                                str5 = "ۙۢۦ۬ۤ۬ۜۙۗۨۘۦۢ۠ۜۘ۠ۖ۬";
                                break;
                            case 1675774310:
                                str = "ۜۖۧ۫۬ۨۘۡۘ۠۫ۡۦۘۜۖۤ۬۬ۨۘۗۖۚ";
                                continue;
                        }
                    }
                    break;
                case -532310144:
                    return f890m + f891n;
                case -205751598:
                    String str6 = "ۤۚۦۦۦۥۖۢۛۢۤ۫ۡۖ۟ۜۛۜ";
                    while (true) {
                        switch (str6.hashCode() ^ 641709193) {
                            case -2143009392:
                                str6 = "۠ۜ۫ۨۛۖۘۥ۬ۢ۬ۙۨۘ۠ۥۢۢۧۨۘۚ";
                                break;
                            case -1598594400:
                                str = "ۥۗۥۘۢ۫ۘۨ۟ۗۛۤۨۘۘ۫ۜۙۥ۟ۤۤۜۘۘۢۨۧۚ۫";
                                continue;
                            case 34826251:
                                if (i2 == 4) {
                                    str6 = "۫ۗۨ۠ۤۖۘۘۧ۬۠۫ۘۘۢ۟۬";
                                    break;
                                } else {
                                    str6 = "ۨۦۥۘۨۘۡۘۤۡۗۤ۠ۨۘۨۦۥ";
                                    break;
                                }
                            case 602343157:
                                str = "ۖ۟ۖۘۚۢۦۧۧۙۧۜۥۘۖ۠ۢۗۘۧۛ۬ۥۘ";
                                continue;
                        }
                    }
                    break;
                case -40750375:
                    return f891n;
                case -12697643:
                    String str7 = "ۧ۟ۤ۬ۧۥۨۖۨۗۘۛۛۦۗۢۖۡۘۘۚۨ";
                    while (true) {
                        switch (str7.hashCode() ^ -1167853221) {
                            case 425696342:
                                if (i2 == 2) {
                                    str7 = "ۖۢ۟۬ۜۧۛۚ۫ۚۤۖۘۛۥۘۘۦۨۘۘۥ۠ۧۨۨۡۡۧۘ";
                                    break;
                                } else {
                                    str7 = "ۗۜۡۙ۬ۘۤۗ۠ۗۧۙۘۡۜۘۥۖۖ";
                                    break;
                                }
                            case 755351974:
                                str = "ۦۢۜۜۧۖۨۥ۫۬ۙۤۡۨۛۖ۟ۖۘۧ۟ۨۘ";
                                continue;
                            case 1661436512:
                                str7 = "ۢ۫ۗ۠ۙۦۗۜۚۖۦ۟ۤۡۘۧۡ۠ۢۖ۟ۚۙۦ";
                                break;
                            case 1959200443:
                                str = "ۨۙ۬ۦۗ۬ۢ۟ۧۨۙۤۜۨۧۦۙ۫";
                                continue;
                        }
                    }
                    break;
                case 329445056:
                    return f893p;
                case 551921480:
                    return f890m;
                case 575199044:
                    String str8 = "۟ۢۚ۫ۧ۠ۤۜۗۥۘۙ۬۠ۖ";
                    while (true) {
                        switch (str8.hashCode() ^ 584017313) {
                            case -2021748782:
                                str = "ۘۗۨۘۘۖۖۘ۬ۗۥۙ۫ۨۘ۫ۚۘۘۙ۫ۜۘۡ۟ۦۢۖۗ";
                                continue;
                            case -1448097257:
                                str = "ۤۡۥۘ۠ۗۙۢ۫ۥۜ۬۟ۘ۫ۛۦۥۘۘۘۥۥ";
                                continue;
                            case -759539533:
                                str8 = "۬ۨۖۤۗۦۘۖ۠ۖ۫ۨۘۥۡۦۘۛۦۨۘۡۜۧۘۦۖۦ";
                                break;
                            case -362244529:
                                if (i2 == 2) {
                                    str8 = "ۙۦ۫ۗۡۘۙ۬ۚۖۛۢۛۚۤۤۛ۬";
                                    break;
                                } else {
                                    str8 = "ۙۙۖۘۙۘۖۧۗۜۡۦۘۥۧۚۨۡۧ";
                                    break;
                                }
                        }
                    }
                    break;
                case 712549184:
                    return 0;
                case 1399489963:
                    String str9 = "ۜ۠۠ۦۢۙۥ۠ۖۘۛۚۨۗۜۧۢۡۢۜ۫ۨۘۛۦۘ";
                    while (true) {
                        switch (str9.hashCode() ^ -783503084) {
                            case -722862051:
                                str = "ۥۢۖۘۢ۠۬۠ۢۨۦ۬ۜ۟ۧۨۡۜۨۖ۟ۡۜۙۜۛۚ۬";
                                continue;
                            case -576653253:
                                str = "ۜۦۦۛۡۖۛۜۖۘۙ۫ۖ۫ۨۙ";
                                continue;
                            case 267972758:
                                if (i2 == 1) {
                                    str9 = "ۜۥۥۘۖۛۨۥۜۚۤ۟۠ۤۧ۟ۡ۫۟ۦۘۘۘۖ۬ۙ";
                                    break;
                                } else {
                                    str9 = "ۖۖۦۘۤ۠ۜۘۡۦۡۘۡۜۧۘۗۢۚ";
                                    break;
                                }
                            case 483874409:
                                str9 = "ۨۖۛۦۢۖۘۘ۟ۢۘۗۡۘۧۜۜۘ۫ۖ۫";
                                break;
                        }
                    }
                    break;
                case 1777287894:
                    str = "ۦۦۘ۠ۢۥۤ۠ۛۢۤۘۘۨ۟ۗۚۙۧ۟ۖۜۘۜۤۘۘ";
                    break;
            }
        }
    }

    public static String getVOSaveName() {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(utils.getWAFolderPath());
            sb.append(Deobfuscator$app$Custom.getString(-15438753136065L));
            String str = File.separator;
            sb.append(str);
            sb.append(Deobfuscator$app$Custom.getString(-15464522939841L));
            File file = new File(sb.toString());
            String str2 = "ۤۙۥۚۚ۟ۢۖۚۛۘۖۘۚۗۡۡۡ۫۟ۚۚ";
            while (true) {
                switch (str2.hashCode() ^ -2120456066) {
                    case -1816305494:
                        break;
                    case -589715896:
                        String str3 = "ۨۢۚ۟ۥۖۧۗ۬ۤۨۤ۬ۦۢ۫ۙ۬ۧۤ۟";
                        while (true) {
                            switch (str3.hashCode() ^ -1959443985) {
                                case -1930492105:
                                    if (!file.mkdirs()) {
                                        str3 = "ۥ۟ۧۨۥۘۖۚ۟ۧۘۖۘۤۚ۟";
                                        break;
                                    } else {
                                        str3 = "۫ۛۗۧۗۘۘۧۦۙۗ۫ۤۘۤۥۗ۟ۜۘۙۛۜۘ";
                                        continue;
                                    }
                                case 692260518:
                                    str3 = "ۤۚۖ۟ۧۜ۠ۚۖۖۙۨۘ۬ۜ۠ۘۨۗ";
                                    continue;
                                case 1805451297:
                                    break;
                                case 1953784893:
                                    return null;
                                default:
                                    continue;
                            }
                        }
                    case 329977692:
                        if (!file.exists()) {
                            str2 = "۠ۗۥۦ۬۫ۨۡۜۘۛ۬ۦۜۤۚۦ۟ۙۚۢ۫ۥۤۖۘ";
                            break;
                        } else {
                            str2 = "ۙۙۨۘۨۨۘۘۦۛۢۘۘۦ۠۠ۙۛۙۖ۟۫ۘۘۡۖۖ۟ۖۘ";
                            continue;
                        }
                    case 1556898963:
                        str2 = "ۡۛۖۘۗۛۥۧۧۗ۫ۗۖۘ۟ۘۛۥۦۙ";
                        continue;
                    default:
                        continue;
                }
            }
            return file.getPath() + str + VO_file.getName();
        } catch (Exception e2) {
            return null;
        }
    }

    public static boolean isHidingFldr(Uri uri) {
        String str = null;
        String str2 = "ۡ۬ۧۤۚۦۦۦۘۘۧۤۢۦۡۤ";
        while (true) {
            switch ((str2.hashCode() ^ 182) ^ 1732373299) {
                case -1494582786:
                    return HideMedia.isHideVideos();
                case -1322093537:
                    return false;
                case -692351944:
                    return false;
                case 144795360:
                    return HideMedia.isHideGIFs();
                case 151044129:
                    String str3 = "ۗۚۙۨۙۜۘۤۚۨۘۘ۬ۖۙ۬ۡۛۜۙۖۢ۟۬ۢۨ";
                    while (true) {
                        switch (str3.hashCode() ^ -227686622) {
                            case 678283872:
                                if (uri != null) {
                                    str3 = "۟۬ۨۨۖۙ۬۟ۜ۠ۦۖ۠ۙۥۥۜۘۨ۠۠ۧۚ۟ۗۡۧ";
                                    break;
                                } else {
                                    str3 = "۬۠ۨۘۘۡۧۘۥ۟ۨۜۖۙۤۜۘ۟ۛۧ";
                                    break;
                                }
                            case 1041769880:
                                str3 = "ۘۥۡۦۛۦۘۗ۬ۥۘۧۖۙۤۥۚۦۢۜۘ۟ۖۗۜۨۙۛۛ۟";
                                break;
                            case 1165929519:
                                str2 = "ۙۜ۫ۗۛۡۘۦۖۘۘ۟ۗۡۘۗۛۥ۟۠ۤ۬ۥ۬";
                                continue;
                            case 1476385578:
                                str2 = "ۜۛۥۢ۠ۡۘۦۙۜۙۚۗۚۙۥۘ";
                                continue;
                        }
                    }
                    break;
                case 360585322:
                    String str4 = "ۡۡۨۧۘ۬ۡۨ۠ۡۚۦۘ۫ۙ۬";
                    while (true) {
                        switch (str4.hashCode() ^ 103045487) {
                            case -1202495003:
                                str2 = "ۨۦۙۦۥۗۖۧۧۗ۫ۦ۟ۢۘۤۥۛۧۘۘۥ۬ۖ";
                                continue;
                            case -857628030:
                                if (!str.contains(Deobfuscator$app$Custom.getString(-15584782024129L))) {
                                    str4 = "ۖۥ۬ۦۘ۠ۥۨۧۘۥۡ۟۬ۘۘۘ";
                                    break;
                                } else {
                                    str4 = "ۦ۟ۜۘۗۙ۠ۦۘۚۚۙۗۨۡۘ";
                                    break;
                                }
                            case -588460388:
                                str2 = "ۛۗۙ۠ۛۦۘۖۡۚ۟ۘۤ۠ۥ۬۬ۗۖۛۢۖ";
                                continue;
                            case 225436041:
                                str4 = "۠ۛۨۖۢۜۘۚۚ۠ۙۡۜ۟ۥۛ۟ۘۘ";
                                break;
                        }
                    }
                    break;
                case 372419600:
                    String str5 = "ۘ۬ۨۨۗۡۘۦۚ۬۬ۖ۫ۜۤۡۘ";
                    while (true) {
                        switch (str5.hashCode() ^ 1924487716) {
                            case -302804672:
                                str2 = "ۡۚ۟ۨۘۨۢۖۦ۫ۧۖۘ۠ۥۥۘ۬ۜ۫ۨ۠ۜۘ";
                                continue;
                            case -53850228:
                                str5 = "ۨۙ۬ۡۜۦۖۨۡۤ۠ۗۥۥ۠";
                                break;
                            case 217027430:
                                if (!str.contains(Deobfuscator$app$Custom.getString(-15528947449281L))) {
                                    str5 = "ۘۤۧۥ۫ۗۙۛۦۘۢۥۥۘ۠ۙۛۘ۟ۚۖۥۙۤۘ۠";
                                    break;
                                } else {
                                    str5 = "ۖۨۖۛۡۧۙۧۚۗۢۚۤۜۚۙ۫ۛ۠ۜ۫";
                                    break;
                                }
                            case 1609280183:
                                str2 = "ۨۥۘ۠ۚۘۦۙۢ۬۫۫ۨۘۗۤ۫ۤۚۨۘ۫ۢۚ";
                                continue;
                        }
                    }
                    break;
                case 761946396:
                    return HideMedia.isHideImages();
                case 1156455325:
                    str2 = "ۚۤ۫۟۟۠ۥۛۡۘ۠ۦۚ۠ۙۖۘۥۡۦۘۧۚۙۛۤۚ۬ۡۥۘ";
                    break;
                case 1204920394:
                    str = uri.getPath();
                    str2 = "ۘ۬ۧ۠۫ۖۖۥۧۘۚۦۦۧۦۖۘ";
                    break;
                case 1264688899:
                    return false;
                case 1989631910:
                    String str6 = "ۗۚۡۘۧۨۧۘۧۚۦۢۜۜۗۛۤۤۜۙۢ۠ۦۚۦۗ";
                    while (true) {
                        switch (str6.hashCode() ^ -1482206447) {
                            case -1216835474:
                                if (str != null) {
                                    str6 = "ۡۧۨ۠ۡۘۘۧ۫۟ۢۛۖۘۖۨۜۘۧ۟ۛۚ۠ۨۘ۫۠ۘۖۚۧ";
                                    break;
                                } else {
                                    str6 = "ۛۚۦۧۙ۫۟۟ۡ۟۟ۡۢۢۧ۟ۨ۬ۗۖۘۘۚۚۡۘۜۗۥ";
                                    break;
                                }
                            case -728404905:
                                str6 = "ۛۢۥۘ۬ۜۥ۬ۖۦۘۨۤۛۦۜۘۧۥۨ";
                                break;
                            case 1177549897:
                                str2 = "ۜ۬ۖۖۛۨ۠ۥۖۗۛۜۨۘۥۤۡۡۘ۟ۙۚۜۛۘۘۨۛۢ";
                                continue;
                            case 2052544385:
                                str2 = "۫۬۟۠ۛۦۜۗۜۘۖۘۛۥ۠ۗۢ۠ۢ";
                                continue;
                        }
                    }
                    break;
                case 2020275370:
                    String str7 = "ۥۢۨۨۚ۫ۡۤۥۘۖۢ۫ۤ۠۠";
                    while (true) {
                        switch (str7.hashCode() ^ 1350969296) {
                            case -1213893735:
                                if (!str.contains(Deobfuscator$app$Custom.getString(-15559012220353L))) {
                                    str7 = "ۜۛۥۜۥۥ۟۟ۚ۟۟ۙۛۡۤۤۜۜۘ";
                                    break;
                                } else {
                                    str7 = "۫ۧۨۥۜۨۘۚۜۨ۠ۙ۬ۢۙۘۚۛۡ";
                                    break;
                                }
                            case -670648241:
                                str7 = "۫ۘۖۜ۬ۡۘۖۥۛۧ۬ۤۦۢۡ۬ۛ۫۫ۗۡۛۚۘ";
                                break;
                            case -364924147:
                                str2 = "ۙ۟ۗۘۧۜ۫ۡۨۘۙۧۢ۠ۙۡۘ۟ۦۘ";
                                continue;
                            case 607134382:
                                str2 = "ۧ۬ۙۙۖۘ۬ۖۨۢۧ۬ۜ۠۟ۛۥۘ۫ۥۡۦۛۥۘۢۚۡۘ";
                                continue;
                        }
                    }
                    break;
            }
        }
    }

    public static SpannableString k(CharSequence charSequence) {
        SpannableString spannableString = null;
        String str = "۠ۘ۫۟ۙۛ۬ۛ۟ۙ۟ۥۘۛۥۛۥۗۖۦۙۛۚۖۥۘۚ۟ۦ";
        while (true) {
            switch ((str.hashCode() ^ 624) ^ -1480615387) {
                case -1517497430:
                    spannableString = new SpannableString(charSequence);
                    str = "۠۬ۘ۠ۧۛۘۨۤ۬ۛ۠ۖۡۚۥۨۘۨۙۥۘ۫ۦۧۘ";
                    break;
                case -1448538570:
                    return spannableString;
                case -954184179:
                    str = "ۦ۫ۦ۠ۥۘ۫۠ۢ۠۫ۤۙۥۖۘ۫";
                    break;
                case 555897294:
                    spannableString.setSpan(new ForegroundColorSpan(yo.mainpagercolor()), 0, charSequence.length(), 33);
                    str = "ۧ۠ۘۘۜۛۗۘۤۖۢۦۘۤۖۚۙۨۦ";
                    break;
                case 1633564205:
                    String str2 = "ۖ۬ۦۚۥۨ۠ۤۜۜۦۧۘ۟۠ۡ";
                    while (true) {
                        switch (str2.hashCode() ^ -475063838) {
                            case -1932490619:
                                str = "ۜۨ۫ۘۛ۟ۧ۟۠ۢۨۨۘۛۧۘۜ۬ۥۘۤۨۜۘۚۖۤ";
                                continue;
                            case -1366763240:
                                if (shp.f878e.equals(Deobfuscator$app$Custom.getString(-14098723339713L))) {
                                    str2 = "۠ۦۗۚۢۖۧۖۥۘ۫ۦۗ۟۠ۥۨۡۤ۫";
                                    break;
                                } else {
                                    str2 = "ۤۢۖۚ۫ۤۜۘۘۖ۫ۧۚۢۘۦ۬ۘۘ";
                                    break;
                                }
                            case 328009447:
                                str2 = "۫۠ۢۡۘۘۘۦۧۢ۬۫ۦۘ۫ۜۥۘۢۖ۟ۘۚۙ۠ۡۦ";
                                break;
                            case 1118757413:
                                str = "ۤۗۛ۠۠۟۠ۢۗۡۖۦۘۤۖ۟ۡۡ۫";
                                continue;
                        }
                    }
                    break;
                case 1650420687:
                    spannableString.setSpan(new CustomTypefaceSpan(Deobfuscator$app$Custom.getString(-14133083078081L), shp.a(l1.f800a)), 0, charSequence.length(), 34);
                    str = "ۤۗۛ۠۠۟۠ۢۗۡۖۦۘۤۖ۟ۡۡ۫";
                    break;
            }
        }
    }

    public static void markVO_asOpened() {
        C15830rv A01;
        String str = "۟ۚۧۙۥۛۡۘۧۘۦۤۗ۟ۡۨۥۘۘۚ۫ۧۛ۟ۧ۫ۗۜۘ";
        while (true) {
            switch (str.hashCode() ^ 1309465100) {
                case -844600882:
                    if (!VO_data.isEmpty()) {
                        str = "ۙۦۘۧۖۨۧۢۥۚۦۧۤۙۨۘۘ۫ۘۙۦۨ";
                        break;
                    } else {
                        str = "ۨۘۢ۫۠ۥ۟۟ۗۘۜ۫۬ۦ۟ۜۧ۬ۤۛۦۦ۠ۖۘ۟ۤۦ";
                        break;
                    }
                case 596684918:
                    String str2 = VO_data.get(0);
                    String str3 = VO_data.get(1);
                    String str4 = VO_data.get(2);
                    try {
                        C15830rv A012 = C15830rv.A01(str3);
                        String str5 = "۫ۤ۬ۗۢۖ۫ۦۘۢ۫ۢۢۢۧۜ۟ۘۘۦۢۤۢ۫ۗ";
                        while (true) {
                            switch (str5.hashCode() ^ -559443845) {
                                case -1988684818:
                                    A01 = C15830rv.A01(str4);
                                    break;
                                case -416927993:
                                    if (str4 != null) {
                                        str5 = "ۥۗۡۤۥ۟ۢ۟ۘ۬ۜۨۜۚۜۥ۟۬۬ۡۘۘ";
                                        break;
                                    } else {
                                        str5 = "۠۠۟۫۫ۚۜۜۧۘۥ۠ۖۗۙ";
                                        continue;
                                    }
                                case -379860918:
                                    str5 = "ۘۤ۫۫۠ۡۘۛۢۥۘ۠۬۬ۢۦۥۤۚۨۘۜۗ۟ۗۤۖۘۢۛۥۘ";
                                    continue;
                                case 428970600:
                                    A01 = null;
                                    break;
                                default:
                                    continue;
                            }
                        }
                        dep.a(new SendPlayedReceiptJobV2(new C38561qz(A012, A01, new Long[]{0L}, new String[]{str2}), false));
                        Toast.makeText(yo.getCtx(), yo.getString(Deobfuscator$app$Custom.getString(-15206824902081L)), 0).show();
                        return;
                    } catch (Exception e2) {
                        return;
                    }
                case 738466263:
                    return;
                case 1400049804:
                    str = "ۜ۟۬ۚۖۚۙۥۤۢ۠ۗۙۤ۬ۧۡۚ۠ۦۡۨ۬ۤۡۢ";
                    break;
            }
        }
    }

    public static int readmore(int i2) {
        String str = "ۙۘ۫ۢۛۨۘۥ۬ۨۘۗۥۘۖۗ۬ۥۦ۬ۜۡۥ";
        int i3 = 0;
        while (true) {
            switch ((str.hashCode() ^ 447) ^ -476362781) {
                case -2051128844:
                    String str2 = "ۥۤ۫۬ۤۤۧۢ۬ۧۜۗۚۖۨۨۨۙ";
                    while (true) {
                        switch (str2.hashCode() ^ 278451245) {
                            case 79121043:
                                if (!shp.getBoolean(Deobfuscator$app$Custom.getString(-16344991235521L))) {
                                    str2 = "ۤۖۦۜۖ۬ۦۢۛ۫۠ۥۚۖۗۗۚۡۘۧ۟۬ۥ۟۠ۡۢۦ";
                                    break;
                                } else {
                                    str2 = "۟ۛۧ۫ۖۥۘۤۘۧۥۘۗۜۖۘۢۜۛ";
                                    break;
                                }
                            case 375971600:
                                str2 = "ۡ۠ۘۜ۟ۨۨۡۥۛۢۘۤۜۘ۫۬ۚۚۛۦۘ";
                                break;
                            case 663105664:
                                str = "ۖۧ۫ۧۦ۫ۥ۟ۢۦۖ۬ۜۢۦۨۜۨۢۤۖۘۘ۟ۢۧۛۚ";
                                continue;
                            case 1149898576:
                                str = "ۦۥۖۘ۟ۙۥۧۦۜۥۘۘۗۖۧۘۦۢ۟۬ۜ۬";
                                continue;
                        }
                    }
                    break;
                case -1818210018:
                    str = "۟ۨۢۜ۬ۡۘۤۛ۠۬۟ۥۘۘ۠ۘۥۛۘۘۚ۫۟ۦۘ۟۠ۥ";
                    break;
                case -1492050559:
                    str = "ۖۧ۫ۧۦ۫ۥ۟ۢۦۖ۬ۜۢۦۨۜۨۢۤۖۘۘ۟ۢۧۛۚ";
                    i3 = 0;
                    break;
                case -1403111371:
                    return i3;
                case 748280615:
                    str = "۫ۡۧ۠ۛۙۚۖۥۘ۫۠ۧ۠ۦۦۛۤۖۜۛ۟";
                    break;
                case 2051391527:
                    str = "ۤۢۖۘ۟ۦۢ۠ۗ۫ۜۥۖۡۜۗ";
                    i3 = i2;
                    break;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r7v2 */
    /* JADX WARNING: type inference failed for: r5v2 */
    /* JADX WARNING: type inference failed for: r5v3 */
    /* JADX WARNING: type inference failed for: r7v3 */
    /* JADX WARNING: type inference failed for: r7v4 */
    /* JADX WARNING: type inference failed for: r7v5 */
    /* JADX WARNING: type inference failed for: r7v6 */
    /* JADX WARNING: type inference failed for: r7v7 */
    /* JADX WARNING: type inference failed for: r7v8 */
    /* JADX WARNING: type inference failed for: r7v9 */
    /* JADX WARNING: type inference failed for: r7v10 */
    /* JADX WARNING: type inference failed for: r7v11 */
    /* JADX WARNING: type inference failed for: r7v12 */
    /* JADX WARNING: type inference failed for: r7v13 */
    /* JADX WARNING: type inference failed for: r7v14 */
    /* JADX WARNING: type inference failed for: r7v15 */
    /* JADX WARNING: type inference failed for: r7v16 */
    /* JADX WARNING: type inference failed for: r7v17 */
    /* JADX WARNING: type inference failed for: r7v18 */
    /* JADX WARNING: type inference failed for: r7v19 */
    /* JADX WARNING: type inference failed for: r7v20 */
    /* JADX WARNING: type inference failed for: r7v21 */
    /* JADX WARNING: type inference failed for: r7v22 */
    /* JADX WARNING: type inference failed for: r7v23 */
    /* JADX WARNING: type inference failed for: r7v24 */
    /* JADX WARNING: type inference failed for: r7v25 */
    /* JADX WARNING: type inference failed for: r7v26 */
    /* JADX WARNING: type inference failed for: r7v27 */
    /* JADX WARNING: type inference failed for: r7v28 */
    /* JADX WARNING: type inference failed for: r7v29 */
    /* JADX WARNING: type inference failed for: r7v30 */
    /* JADX WARNING: type inference failed for: r7v31 */
    /* JADX WARNING: type inference failed for: r7v32 */
    /* JADX WARNING: type inference failed for: r7v33 */
    /* JADX WARNING: type inference failed for: r7v34 */
    /* JADX WARNING: type inference failed for: r7v35 */
    /* JADX WARNING: type inference failed for: r7v36 */
    /* JADX WARNING: type inference failed for: r7v37 */
    /* JADX WARNING: type inference failed for: r7v38 */
    /* JADX WARNING: type inference failed for: r7v39 */
    /* JADX WARNING: type inference failed for: r7v40 */
    /* JADX WARNING: type inference failed for: r7v41 */
    /* JADX WARNING: type inference failed for: r7v42 */
    /* JADX WARNING: type inference failed for: r7v43 */
    /* JADX WARNING: type inference failed for: r7v44 */
    /* JADX WARNING: type inference failed for: r7v45 */
    /* JADX WARNING: type inference failed for: r7v46 */
    /* JADX WARNING: type inference failed for: r7v47 */
    /* JADX WARNING: type inference failed for: r7v48 */
    /* JADX WARNING: type inference failed for: r7v49 */
    /* JADX WARNING: type inference failed for: r7v50 */
    /* JADX WARNING: type inference failed for: r7v51 */
    /* JADX WARNING: type inference failed for: r7v52 */
    /* JADX WARNING: type inference failed for: r7v53 */
    /* JADX WARNING: type inference failed for: r7v54 */
    /* JADX WARNING: type inference failed for: r7v55 */
    /* JADX WARNING: type inference failed for: r7v56 */
    /* JADX WARNING: type inference failed for: r7v57 */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: type inference failed for: r5v6 */
    /* JADX WARNING: type inference failed for: r5v7 */
    /* JADX WARNING: type inference failed for: r5v8 */
    /* JADX WARNING: type inference failed for: r5v9 */
    /* JADX WARNING: type inference failed for: r5v10 */
    /* JADX WARNING: type inference failed for: r5v11 */
    /* JADX WARNING: type inference failed for: r5v12 */
    /* JADX WARNING: type inference failed for: r5v13 */
    /* JADX WARNING: type inference failed for: r5v14 */
    /* JADX WARNING: type inference failed for: r5v15 */
    /* JADX WARNING: type inference failed for: r5v16 */
    /* JADX WARNING: type inference failed for: r5v17 */
    /* JADX WARNING: type inference failed for: r5v18 */
    /* JADX WARNING: type inference failed for: r5v19 */
    /* JADX WARNING: type inference failed for: r5v20 */
    /* JADX WARNING: type inference failed for: r5v21 */
    /* JADX WARNING: type inference failed for: r5v22 */
    /* JADX WARNING: type inference failed for: r5v23 */
    /* JADX WARNING: type inference failed for: r5v24 */
    /* JADX WARNING: type inference failed for: r5v25 */
    /* JADX WARNING: type inference failed for: r5v26 */
    /* JADX WARNING: type inference failed for: r5v27 */
    /* JADX WARNING: type inference failed for: r5v28 */
    /* JADX WARNING: type inference failed for: r5v29 */
    /* JADX WARNING: type inference failed for: r5v30 */
    /* JADX WARNING: type inference failed for: r5v31 */
    /* JADX WARNING: type inference failed for: r5v32 */
    /* JADX WARNING: type inference failed for: r5v33 */
    /* JADX WARNING: type inference failed for: r5v34 */
    /* JADX WARNING: type inference failed for: r5v35 */
    /* JADX WARNING: type inference failed for: r5v36 */
    /* JADX WARNING: type inference failed for: r5v37 */
    /* JADX WARNING: type inference failed for: r5v38 */
    /* JADX WARNING: type inference failed for: r5v39 */
    /* JADX WARNING: type inference failed for: r5v40 */
    /* JADX WARNING: type inference failed for: r5v41 */
    /* JADX WARNING: type inference failed for: r5v42 */
    /* JADX WARNING: type inference failed for: r5v43 */
    /* JADX WARNING: type inference failed for: r5v44 */
    /* JADX WARNING: type inference failed for: r5v45 */
    /* JADX WARNING: type inference failed for: r5v46 */
    /* JADX WARNING: type inference failed for: r5v47 */
    /* JADX WARNING: type inference failed for: r5v48 */
    /* JADX WARNING: type inference failed for: r5v49 */
    /* JADX WARNING: type inference failed for: r5v50 */
    /* JADX WARNING: type inference failed for: r5v51 */
    /* JADX WARNING: type inference failed for: r5v52 */
    /* JADX WARNING: type inference failed for: r5v53 */
    /* JADX WARNING: type inference failed for: r5v54 */
    /* JADX WARNING: type inference failed for: r5v55 */
    /* JADX WARNING: type inference failed for: r5v56 */
    /* JADX WARNING: type inference failed for: r5v57 */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x000d, code lost:
        r7 = r7;
        r5 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00f5, code lost:
        r4 = "ۚۗۛۗۖۧۘۧ۠۠ۘۘۡۘ۠";
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void replyPatternControl(java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, X.C16740tZ r26) {
        /*
            r15 = 0
            r14 = 0
            r9 = 0
            r13 = 0
            r11 = 0
            r12 = 0
            r10 = 0
            r7 = 0
            r6 = 0
            r5 = 0
            r8 = 0
            java.lang.String r4 = "ۖۥۜۡۡ۬۫ۤ۬ۛۤۧۜۘۥۥ۫۠"
        L_0x000d:
            int r16 = r4.hashCode()
            r17 = 372(0x174, float:5.21E-43)
            r18 = 461033523(0x1b7ad033, float:2.0746788E-22)
            r16 = r16 ^ r17
            r16 = r16 ^ r18
            switch(r16) {
                case -2126704254: goto L_0x0069;
                case -1930871778: goto L_0x00c8;
                case -1704719300: goto L_0x001e;
                case -1613091045: goto L_0x002d;
                case -1550315303: goto L_0x01b8;
                case -1548174564: goto L_0x00e6;
                case -1538551813: goto L_0x033b;
                case -1387703356: goto L_0x0176;
                case -1381838109: goto L_0x024e;
                case -1360752809: goto L_0x02f6;
                case -1318722535: goto L_0x0126;
                case -1290857402: goto L_0x0121;
                case -976957923: goto L_0x031c;
                case -769109673: goto L_0x0117;
                case -743655286: goto L_0x0271;
                case -696706557: goto L_0x0033;
                case -606399948: goto L_0x01e5;
                case -532570437: goto L_0x033f;
                case -475433966: goto L_0x0347;
                case -446098566: goto L_0x021c;
                case -438987476: goto L_0x012b;
                case -338899525: goto L_0x033f;
                case -310939865: goto L_0x0217;
                case -301606633: goto L_0x0262;
                case -219146914: goto L_0x0030;
                case -136251645: goto L_0x02a3;
                case -82777999: goto L_0x0024;
                case -70082031: goto L_0x0021;
                case 249132582: goto L_0x033f;
                case 249888663: goto L_0x007a;
                case 253812800: goto L_0x0284;
                case 320657283: goto L_0x011c;
                case 344389249: goto L_0x0149;
                case 349409503: goto L_0x002a;
                case 424275784: goto L_0x009b;
                case 487257134: goto L_0x0253;
                case 588246776: goto L_0x0044;
                case 823727196: goto L_0x0027;
                case 1042216918: goto L_0x032b;
                case 1209800014: goto L_0x02c6;
                case 1291841724: goto L_0x0056;
                case 1478929046: goto L_0x0197;
                case 1582903380: goto L_0x0258;
                case 1634053019: goto L_0x0221;
                case 1673298693: goto L_0x01ea;
                case 1787123617: goto L_0x0151;
                case 1971785944: goto L_0x02d5;
                case 2035839720: goto L_0x025d;
                case 2121044434: goto L_0x005a;
                case 2129598626: goto L_0x0347;
                default: goto L_0x001d;
            }
        L_0x001d:
            goto L_0x000d
        L_0x001e:
            java.lang.String r4 = "ۘۖۨۢۡۧ۟۟ۨۘ۟ۖ۠ۘۖۙ۠ۛۨۘۛۙۘ۫ۡۧۘ"
            goto L_0x000d
        L_0x0021:
            java.lang.String r4 = "ۚۚۘۗۙۗۜۗ۠ۗۤۥۘۡ۫ۨۘۛ۟ۨۘ"
            goto L_0x000d
        L_0x0024:
            java.lang.String r4 = "ۚۡۤۢۗ۬ۧۥۘۦۘۚۢۥۨۘ"
            goto L_0x000d
        L_0x0027:
            java.lang.String r4 = "۟ۛۖۘۖۙۡۘۥۡۗۨۘ۟ۖۙۖۜۡۘۨۚۦۘۤۙۥۘ"
            goto L_0x000d
        L_0x002a:
            java.lang.String r4 = "ۜۦ۠ۦ۫۟۠ۤۗ۬۠ۡۥ۫۫ۛۖۘۗ۬۟ۗ۟"
            goto L_0x000d
        L_0x002d:
            java.lang.String r4 = "ۘۧۘۚۘۡۘۨۢۤ۬ۚۘۘۚۤۗۗۤۜۗۨ۠ۦ۬"
            goto L_0x000d
        L_0x0030:
            java.lang.String r4 = "ۚۗۗۚۜۖۦ۠ۜۘۜۙۤۜۚۧۖ"
            goto L_0x000d
        L_0x0033:
            r0 = r26
            X.1Vw r4 = r0.A11
            X.0rv r4 = r4.A00
            java.lang.String r4 = com.obwhatsapp.yo.dep.getJID_t(r4)
            boolean r15 = com.obwhatsapp.yo.yo.isGroupJid(r4)
            java.lang.String r4 = "ۘۧۘۛۖۧۘ۬ۧۨۥۗۡۨۥۥۜۢۖ"
            goto L_0x000d
        L_0x0044:
            r16 = -14511040200129(0xfffff2cd629a823f, double:NaN)
            java.lang.String r4 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r16)
            r0 = r23
            boolean r14 = r0.equals(r4)
            java.lang.String r4 = "ۗ۟ۨۘۘۦۥۘ۬۬ۥۘۨ۫ۛۥۘۚ"
            goto L_0x000d
        L_0x0056:
            r9 = 0
            java.lang.String r4 = "ۛ۠ۛۧۖۖۘۖۨ۫۫ۘۘۘۚۦ۠"
            goto L_0x000d
        L_0x005a:
            r16 = -1173091606(0xffffffffba140aea, float:-5.647378E-4)
            java.lang.String r4 = "ۦۙۘۘۗۖۡۘۦۖۨ۬ۜۢۛ۠ۜۘ۟ۚۧۥۨۗ"
        L_0x005f:
            int r17 = r4.hashCode()
            r17 = r17 ^ r16
            switch(r17) {
                case -1791969934: goto L_0x0077;
                case -1775603192: goto L_0x0074;
                case -365554426: goto L_0x006f;
                case 462795430: goto L_0x0069;
                default: goto L_0x0068;
            }
        L_0x0068:
            goto L_0x005f
        L_0x0069:
            java.lang.String r4 = "ۚۢۨۘۦ۫ۥۘۦۘۨۘ۬ۘ۠ۚ۫ۡۗۜۙۙۘۛۦۚۡۘ"
            goto L_0x000d
        L_0x006c:
            java.lang.String r4 = "ۙۖۧۘ۠ۡ۠۟۠ۤ۠ۥ۫ۙۜۗ۠۠ۧۘۤ۟"
            goto L_0x005f
        L_0x006f:
            if (r14 != 0) goto L_0x006c
            java.lang.String r4 = "ۤۢۛۗۜۖۘۜۡۜۘۥۛۤ۫ۦۡۘۥ۬ۛۧۥۥۘۦۧۡۘ"
            goto L_0x005f
        L_0x0074:
            java.lang.String r4 = "۬ۡۘۘ۬ۖۘ۫ۧ۬ۧۢۧۦ۬ۢۚ۫ۡۘۛۨۜۘ"
            goto L_0x005f
        L_0x0077:
            java.lang.String r4 = "ۧۚۤۦۗۨۥۗۧۗۛۛۧۥۜۙ۫ۗۥۘۚ۬ۤ"
            goto L_0x000d
        L_0x007a:
            r16 = -1247876602(0xffffffffb59eea06, float:-1.1840027E-6)
            java.lang.String r4 = "۠۠ۢۨۚۢ۬ۜۗۡۤ۟ۛۥۦۗ۟ۨۘ"
        L_0x007f:
            int r17 = r4.hashCode()
            r17 = r17 ^ r16
            switch(r17) {
                case -1272346813: goto L_0x0089;
                case -946705577: goto L_0x008f;
                case -748825571: goto L_0x0097;
                case 832257000: goto L_0x0094;
                default: goto L_0x0088;
            }
        L_0x0088:
            goto L_0x007f
        L_0x0089:
            java.lang.String r4 = "ۥۨۜۡۘۦۘۗۚۤ۟۫ۢۙۛ۫ۤ۫ۘۘ"
            goto L_0x000d
        L_0x008c:
            java.lang.String r4 = "ۤۤۥۥۢۜۘۧۘۧۘۛۧۙۥۛۖۤۥۘۗ۟ۘۜۛۨۧۡۜ"
            goto L_0x007f
        L_0x008f:
            if (r15 == 0) goto L_0x008c
            java.lang.String r4 = "۬۠ۘ۫ۜۘۘۖۨۨۘۢۨ۟ۡ۬ۨۘۢۜۡۘ"
            goto L_0x007f
        L_0x0094:
            java.lang.String r4 = "۬ۗۜۘۙۗۗۦۛۗۢ۟۠ۛۗۧۨۦۜۖۗۙۜۧۘ"
            goto L_0x007f
        L_0x0097:
            java.lang.String r4 = "ۥۚۘۘۘۡ۟ۦۜۘۘۥۦۡۛ۫ۨ"
            goto L_0x000d
        L_0x009b:
            r16 = -749561041(0xffffffffd3529b2f, float:-9.0454668E11)
            java.lang.String r4 = "ۗۙۜ۟ۢۨۘ۠ۛۨۘۥۢۤۙۥۘۘۙۨۨۘۢۙۚۥ۫ۦۘۤ۫ۖ"
        L_0x00a0:
            int r17 = r4.hashCode()
            r17 = r17 ^ r16
            switch(r17) {
                case -840787903: goto L_0x00b0;
                case -744679214: goto L_0x00c4;
                case 99212881: goto L_0x0069;
                case 1932814476: goto L_0x00aa;
                default: goto L_0x00a9;
            }
        L_0x00a9:
            goto L_0x00a0
        L_0x00aa:
            java.lang.String r4 = "ۦ۟۫ۥ۬ۗۢۦۘۙۦۙ۠ۘۨۥۗۥ۠ۡۧۚۜۘۢۥۧۘ"
            goto L_0x00a0
        L_0x00ad:
            java.lang.String r4 = "ۥۘۧۘۘ۟ۡۘۧۘۘۙۙۦۘ۟۠ۖ"
            goto L_0x00a0
        L_0x00b0:
            r18 = -14532515036609(0xfffff2c8629a823f, double:NaN)
            java.lang.String r4 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r18)
            r0 = r23
            boolean r4 = r0.equals(r4)
            if (r4 != 0) goto L_0x00ad
            java.lang.String r4 = "ۜۖ۟ۘۖۡۘ۟ۡۤۡۨۡۖۧ"
            goto L_0x00a0
        L_0x00c4:
            java.lang.String r4 = "ۥۨۜۡۘۦۘۗۚۤ۟۫ۢۙۛ۫ۤ۫ۘۘ"
            goto L_0x000d
        L_0x00c8:
            r16 = -1658175155(0xffffffff9d2a414d, float:-2.2533072E-21)
            java.lang.String r4 = "ۘۚۚۚ۠ۢ۫۠۟ۦۦ۫ۡۢۧۤۗۙۦۡ"
        L_0x00cd:
            int r17 = r4.hashCode()
            r17 = r17 ^ r16
            switch(r17) {
                case -1272313171: goto L_0x00d7;
                case -1254658888: goto L_0x00df;
                case 97454095: goto L_0x00f5;
                case 2048822405: goto L_0x00e2;
                default: goto L_0x00d6;
            }
        L_0x00d6:
            goto L_0x00cd
        L_0x00d7:
            if (r15 != 0) goto L_0x00dc
            java.lang.String r4 = "ۦۛۚ۬ۚۘۘۡۡ۠ۥ۟ۖۘۢۙۚۤ۠ۘۘۥ۫۠ۛۢ۠"
            goto L_0x00cd
        L_0x00dc:
            java.lang.String r4 = "ۜۘۖۘۨ۠۠ۘۛۚۖ۠ۖۘۘۗۛۤ۬ۙۥ۫ۖ"
            goto L_0x00cd
        L_0x00df:
            java.lang.String r4 = "ۧۨۚۨۗۤۨ۠ۡۚۗۚۗ۟ۤۡ۠ۘۛۦ۠"
            goto L_0x00cd
        L_0x00e2:
            java.lang.String r4 = "ۚۗ۠ۥۢۢۛۡۘۘۗۚۥۘۖۖۨۘ۫ۗۜۘۧۖ۠"
            goto L_0x000d
        L_0x00e6:
            r16 = -820143808(0xffffffffcf1d9940, float:-2.6440663E9)
            java.lang.String r4 = "ۗ۟ۡۘۡۡۚۘۢۥۖۧۖۛ۠ۘۘ۫ۛۖۘ"
        L_0x00eb:
            int r17 = r4.hashCode()
            r17 = r17 ^ r16
            switch(r17) {
                case -2145473010: goto L_0x0110;
                case -1856991461: goto L_0x00f5;
                case -1397813688: goto L_0x0113;
                case 407783612: goto L_0x00fc;
                default: goto L_0x00f4;
            }
        L_0x00f4:
            goto L_0x00eb
        L_0x00f5:
            java.lang.String r4 = "ۚۗۛۗۖۧۘۧ۠۠ۘۘۡۘ۠"
            goto L_0x000d
        L_0x00f9:
            java.lang.String r4 = "۫۬ۥۘۚ۫۫۠۬ۦۨۨۧۗۧۙ۬ۥۘۥۛۚ"
            goto L_0x00eb
        L_0x00fc:
            r18 = -14562579807681(0xfffff2c1629a823f, double:NaN)
            java.lang.String r4 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r18)
            r0 = r23
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L_0x00f9
            java.lang.String r4 = "۠ۢۥۚۚۦۘۚۡۗۛۖۚۢۙۥۘ"
            goto L_0x00eb
        L_0x0110:
            java.lang.String r4 = "ۙۗۘۤۨۚۤۛ۟ۘۡۘۖۧۜۧۛۤ"
            goto L_0x00eb
        L_0x0113:
            java.lang.String r4 = "ۥۥۖۘ۬ۙۖۜۜۘۖ۟ۦۘۜ۬۟ۖ۫ۧۢۘ"
            goto L_0x000d
        L_0x0117:
            r13 = 0
            java.lang.String r4 = "ۤ۫ۡۘۢۚۨ۫ۘۜۖۘۗۧۢۧۥۨ۟۬ۗۗ"
            goto L_0x000d
        L_0x011c:
            java.lang.String r4 = "ۤۤۦۘۧۘ۬۠۟ۘۤۜۧۡ۠۟ۙ۟ۦۥۗ"
            r12 = r13
            goto L_0x000d
        L_0x0121:
            r11 = 1
            java.lang.String r4 = "۫ۜۖۡۙۨۥۦۘۦۘۢۙۗۜۧۘ۠ۛۢۖۘ"
            goto L_0x000d
        L_0x0126:
            java.lang.String r4 = "۟۬۬ۤۘۤۖ۬۬ۡ۫ۦۘ۬ۦۖۧۥۦۘ"
            r12 = r11
            goto L_0x000d
        L_0x012b:
            r16 = -1806425940(0xffffffff945420ac, float:-1.0709708E-26)
            java.lang.String r4 = "ۨۢۗۢۦۜۡ۟ۙ۫۠۟ۦۥۡۢۦ۫۠ۘۡ"
        L_0x0130:
            int r17 = r4.hashCode()
            r17 = r17 ^ r16
            switch(r17) {
                case -855042418: goto L_0x0145;
                case -22951914: goto L_0x013a;
                case 1326924766: goto L_0x032f;
                case 1417990020: goto L_0x0142;
                default: goto L_0x0139;
            }
        L_0x0139:
            goto L_0x0130
        L_0x013a:
            if (r12 != 0) goto L_0x013f
            java.lang.String r4 = "۫ۦۡۘۗۡۗۧۨ۫۟ۛۗ۟ۦۛۨۗۡۧۦۧۤۖۢۥۥۚ"
            goto L_0x0130
        L_0x013f:
            java.lang.String r4 = "ۡۚۖۘ۟ۚۖۘۚۥۨۘۗۜ۟ۤۧۥۡۜۙۤۖۜ۟۫ۥ"
            goto L_0x0130
        L_0x0142:
            java.lang.String r4 = "۫ۖۨۘۦۖ۬۫۟ۙ۬ۡۘۘ۬ۘۡۚۤۤۤۜۧۨۙۘۘ"
            goto L_0x0130
        L_0x0145:
            java.lang.String r4 = "ۗۗۥۘۚۤۚۢ۠۠ۦۛۗۚ۠ۘ"
            goto L_0x000d
        L_0x0149:
            int r10 = r20.hashCode()
            java.lang.String r4 = "۬۫ۥۘ۫ۗۦۘ۠۬ۧۥۨ۟ۘ۠ۥۘ۟ۧ۟ۙۧ۟"
            goto L_0x000d
        L_0x0151:
            r16 = 1941617059(0x73bab9a3, float:2.958778E31)
            java.lang.String r4 = "ۘۗۖۘۚۦۦ۫ۛۤۚۙۗۧۘۘ۠ۨ"
        L_0x0156:
            int r17 = r4.hashCode()
            r17 = r17 ^ r16
            switch(r17) {
                case -953002427: goto L_0x016f;
                case -917672590: goto L_0x0172;
                case -777050931: goto L_0x0160;
                case 727664081: goto L_0x0167;
                default: goto L_0x015f;
            }
        L_0x015f:
            goto L_0x0156
        L_0x0160:
            java.lang.String r4 = "ۢۢۗۘۢۜۨۜ۟۫ۖۘۘ۫ۡۦۙ۟ۗ"
            goto L_0x000d
        L_0x0164:
            java.lang.String r4 = "ۤۡۡۛۖۤۘۥۘۚۙۗۤۦۨ۬ۦۛۘۤۛ۬ۥۥۘ"
            goto L_0x0156
        L_0x0167:
            r4 = -1295482945(0xffffffffb2c87fbf, float:-2.3341157E-8)
            if (r10 == r4) goto L_0x0164
            java.lang.String r4 = "۬ۗۜۡۥۘۢ۫ۖۡۥۛۢ۫ۗۜۜۡۘۙۨ۠ۥۦۡۘۢۗ۬"
            goto L_0x0156
        L_0x016f:
            java.lang.String r4 = "۠۠ۖۗۜۨۘۙۦۗۥۡۡۘۡ۠"
            goto L_0x0156
        L_0x0172:
            java.lang.String r4 = "ۘۗۨۜۗۗ۟ۤۘ۬ۨۖۘۨۦ۫ۛۥۘ۠ۘۚ"
            goto L_0x000d
        L_0x0176:
            r16 = -563087340(0xffffffffde6ff814, float:-4.32289819E18)
            java.lang.String r4 = "ۨۤۗۜۜۜۘۛ۫ۗۧ۬ۜۘۗ۬ۥۡۚ۠ۧۢۤۘۢ۟"
        L_0x017b:
            int r17 = r4.hashCode()
            r17 = r17 ^ r16
            switch(r17) {
                case -1331409068: goto L_0x0185;
                case 1539619257: goto L_0x0337;
                case 1825848288: goto L_0x018c;
                case 2090305640: goto L_0x0194;
                default: goto L_0x0184;
            }
        L_0x0184:
            goto L_0x017b
        L_0x0185:
            java.lang.String r4 = "ۨۧۜۡۢۤۛۡۨۘۙ۬ۙۦۛۦۘ"
            goto L_0x000d
        L_0x0189:
            java.lang.String r4 = "۟۬ۚۦۖۜۘۗۜۨۘۗ۫ۚ۟ۦ۠ۛۧۗۨۙۢۡۤۗ"
            goto L_0x017b
        L_0x018c:
            r4 = -567445985(0xffffffffde2d761f, float:-3.12480298E18)
            if (r10 == r4) goto L_0x0189
            java.lang.String r4 = "ۢ۫ۘۤۧۥۘۖۖ۫۬۫ۨۘۛۚۨۛۥۘۘۛ۟ۖۘ۟ۛۜۘ"
            goto L_0x017b
        L_0x0194:
            java.lang.String r4 = "۟۫ۖۘ۬ۥۨۙۡۘۘۚۢۥۦ۫ۥۚۧ۬ۜۖۘۥۢۤ۠۟ۛ"
            goto L_0x017b
        L_0x0197:
            r16 = -158589711(0xfffffffff68c1cf1, float:-1.4209152E33)
            java.lang.String r4 = "ۤۦۦۘ۬ۢ۬ۡۤ۬ۜۘۙۧۨۤ۬ۢۖۖ۟ۤۛۦۦۦ"
        L_0x019c:
            int r17 = r4.hashCode()
            r17 = r17 ^ r16
            switch(r17) {
                case -2016519920: goto L_0x01a6;
                case -543606174: goto L_0x01ad;
                case -46452575: goto L_0x01b5;
                case 357952808: goto L_0x0333;
                default: goto L_0x01a5;
            }
        L_0x01a5:
            goto L_0x019c
        L_0x01a6:
            java.lang.String r4 = "ۤۚۘۨۤۨۘ۫ۖۛۥۤۖۙۙ۠ۙۧۦۘۜۧ۬۬ۖ۬ۢۖۜ"
            goto L_0x000d
        L_0x01aa:
            java.lang.String r4 = "ۡۦۧۘۢۖۜۨۛۘۚۖۨۘۜۥۨۘۡۢ"
            goto L_0x019c
        L_0x01ad:
            r4 = 96673(0x179a1, float:1.35468E-40)
            if (r10 == r4) goto L_0x01aa
            java.lang.String r4 = "ۨۤۤ۬ۥۗۙ۟۟ۡۗۡۚۢۘۘ"
            goto L_0x019c
        L_0x01b5:
            java.lang.String r4 = "ۥۘۡۚۧۢۤۗۢۦ۬ۚۘۛۦۨۨۘ"
            goto L_0x019c
        L_0x01b8:
            r16 = 1919644250(0x726b725a, float:4.663502E30)
            java.lang.String r4 = "ۙۚۥۧۙۜۗۦۤۗۗۢۛۚۚۗ۠ۥ۬ۨۘۧۖۚۤۧ"
        L_0x01bd:
            int r17 = r4.hashCode()
            r17 = r17 ^ r16
            switch(r17) {
                case -958471271: goto L_0x01e2;
                case 1376235108: goto L_0x033b;
                case 1842842534: goto L_0x01c7;
                case 1979363644: goto L_0x01ce;
                default: goto L_0x01c6;
            }
        L_0x01c6:
            goto L_0x01bd
        L_0x01c7:
            java.lang.String r4 = "ۚۖۧۘۧ۠ۦۘۗۢ۬ۤۦۗۡۖۨۘۚۖ۟ۤۙۢۥۙۦۦۗۛ"
            goto L_0x000d
        L_0x01cb:
            java.lang.String r4 = "ۜ۫ۜۘۚ۟ۡ۫ۘۖۘۧ۬ۙۚۙۥۘۗۢۛۡۧۘۘۚۨ"
            goto L_0x01bd
        L_0x01ce:
            r18 = -14601234513345(0xfffff2b8629a823f, double:NaN)
            java.lang.String r4 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r18)
            r0 = r20
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L_0x01cb
            java.lang.String r4 = "۠ۜۜۖۤ۟ۡۡ۫ۗۜۘۘۡۥ"
            goto L_0x01bd
        L_0x01e2:
            java.lang.String r4 = "ۘ۠ۥۛۢۗۦۛۨۛ۠۠ۢ۬ۖۘ۬۟ۦۘۡۨۚ۬ۡۘ"
            goto L_0x01bd
        L_0x01e5:
            java.lang.String r4 = "ۢۙۙ۠ۜۧۧ۬ۡۘۖ۬ۜۘ۟ۗۡۛۗۥۘ"
            r8 = r9
            goto L_0x000d
        L_0x01ea:
            r16 = 139320607(0x84ddd1f, float:6.194987E-34)
            java.lang.String r4 = "ۜۨۢ۬ۚ۬ۘۥۜۢۦۥۘۜۙ۫ۧ۫۬ۘۧۛ"
        L_0x01ef:
            int r17 = r4.hashCode()
            r17 = r17 ^ r16
            switch(r17) {
                case -1819336108: goto L_0x01f9;
                case -1636907890: goto L_0x033b;
                case -840270091: goto L_0x0213;
                case -517106869: goto L_0x01ff;
                default: goto L_0x01f8;
            }
        L_0x01f8:
            goto L_0x01ef
        L_0x01f9:
            java.lang.String r4 = "ۨۛ۟ۖۤۤ۟ۙ۫ۥ۟۠۠ۨ۫۠ۤۡ۠۟ۥۗۥۥ"
            goto L_0x01ef
        L_0x01fc:
            java.lang.String r4 = "ۜۦ۟ۧ۟ۘۘۥۙۢۖۨۧۘۦ۠ۖۘۜۙۧۗۨۙۥ۫ۙۘۨۖ"
            goto L_0x01ef
        L_0x01ff:
            r18 = -14648479153601(0xfffff2ad629a823f, double:NaN)
            java.lang.String r4 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r18)
            r0 = r20
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L_0x01fc
            java.lang.String r4 = "ۚ۫۫ۤۜۨۡۡۘۦۡۧۘۙ۟ۗ۟۬۟ۗۜۨۚۤ۫ۘۘۘ"
            goto L_0x01ef
        L_0x0213:
            java.lang.String r4 = "ۢۚۨۘۖۙ۠ۦۦۧۘۚۡۜ۟ۨۘ"
            goto L_0x000d
        L_0x0217:
            r7 = 2
            java.lang.String r4 = "ۘۖۨ۟ۙۥ۫ۨۤ۟ۦۡۦۘ۟۠ۘۙۛ۬ۖ"
            goto L_0x000d
        L_0x021c:
            java.lang.String r4 = "ۤۢۙ۬ۖ۠ۙۙۙۡۖۡۘۜۛۥ"
            r8 = r7
            goto L_0x000d
        L_0x0221:
            r16 = 1501707915(0x59823e8b, float:4.5825642E15)
            java.lang.String r4 = "ۥۡ۬ۙ۬۬ۙۛۙ۟ۜۘۘۗۘۨۘۖۜۛ"
        L_0x0226:
            int r17 = r4.hashCode()
            r17 = r17 ^ r16
            switch(r17) {
                case -1615882990: goto L_0x0230;
                case -1554085211: goto L_0x033b;
                case -1523525462: goto L_0x024a;
                case 1174962553: goto L_0x0247;
                default: goto L_0x022f;
            }
        L_0x022f:
            goto L_0x0226
        L_0x0230:
            r18 = -14618414382529(0xfffff2b4629a823f, double:NaN)
            java.lang.String r4 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r18)
            r0 = r20
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L_0x0244
            java.lang.String r4 = "ۧۤۖۘ۬۠ۨۘۤۚۜ۟ۙۨۘۚۜۡ"
            goto L_0x0226
        L_0x0244:
            java.lang.String r4 = "ۛۧۡۘ۬ۗ۫ۘ۫۬۬ۨۚۜ۫۟"
            goto L_0x0226
        L_0x0247:
            java.lang.String r4 = "ۦ۬ۛۙۨۘۗ۟۠ۧۚ۠ۗۖۘ۬۠ۗۦۦۧۘۜۨۜۖ۫ۘۘ"
            goto L_0x0226
        L_0x024a:
            java.lang.String r4 = "۟۬ۜۘۥۡۘۘ۠ۘۦۖۢۢۖ۟ۢ۠ۨۘ"
            goto L_0x000d
        L_0x024e:
            r6 = 1
            java.lang.String r4 = "ۙۗ۫ۗ۬ۨۘۥۡۘۘۦۙ۟ۗۛۨ۫ۢۦ"
            goto L_0x000d
        L_0x0253:
            java.lang.String r4 = "ۚۙۡۧۨۜۨۡ۫ۤۢۥۧۥۧۜۖۘ۫ۗۨۡ۟ۡۘۗۨۛ"
            r8 = r6
            goto L_0x000d
        L_0x0258:
            r5 = -1
            java.lang.String r4 = "ۘۚ۟ۚۧۙۛۢۖۘۦ۬ۥۘ۠ۦۧۘ۫۠۬"
            goto L_0x000d
        L_0x025d:
            java.lang.String r4 = "ۤۗۦۘۚۜۙ۠ۤۦۡۥۛۢۗۗۗۗۛۡۨۘۛۖۜ"
            r8 = r5
            goto L_0x000d
        L_0x0262:
            r16 = -1585045197(0xffffffffa1862133, float:-9.088981E-19)
            java.lang.String r4 = "ۢ۬ۦۘۜۘۧۘۥۛۘۡۧۤۜۡۢۧۗۙۛۡۢ"
        L_0x0267:
            int r17 = r4.hashCode()
            r17 = r17 ^ r16
            switch(r17) {
                case -1567899531: goto L_0x0280;
                case -1366090571: goto L_0x0271;
                case -1136903980: goto L_0x027d;
                case 630503448: goto L_0x0278;
                default: goto L_0x0270;
            }
        L_0x0270:
            goto L_0x0267
        L_0x0271:
            java.lang.String r4 = "۠ۚۖۛۦۚ۬۟ۘ۫ۜۧ۬ۡ۬ۛۨۙۗ۫ۖ۠ۖۘۗ۬ۨ"
            goto L_0x000d
        L_0x0275:
            java.lang.String r4 = "ۨۚۘۘۚۡۛۛۦۗ۬ۙ۬ۖۧۘۨۖۦ"
            goto L_0x0267
        L_0x0278:
            if (r8 == 0) goto L_0x0275
            java.lang.String r4 = "ۖ۫ۖۘۛۡۨۦۡ۬ۖۙۧۡۤۖۘۘۛۙۢۨ۠"
            goto L_0x0267
        L_0x027d:
            java.lang.String r4 = "ۛ۫ۡۘۜۚ۠ۗ۠ۤ۬ۘۤۜۨۖۘ"
            goto L_0x0267
        L_0x0280:
            java.lang.String r4 = "ۗ۠ۨۥۧۘ۫ۥۜۖۖۚۡۥۚ"
            goto L_0x000d
        L_0x0284:
            r16 = -1752007468(0xffffffff97927cd4, float:-9.46654E-25)
            java.lang.String r4 = "ۛۧۨۘۢۦۖۨۙ۫ۖۚ۬ۤۗۘۘ"
        L_0x0289:
            int r17 = r4.hashCode()
            r17 = r17 ^ r16
            switch(r17) {
                case -1110376903: goto L_0x029f;
                case 434755171: goto L_0x0293;
                case 633642093: goto L_0x0343;
                case 1448656390: goto L_0x029c;
                default: goto L_0x0292;
            }
        L_0x0292:
            goto L_0x0289
        L_0x0293:
            r4 = 1
            if (r8 == r4) goto L_0x0299
            java.lang.String r4 = "۫ۧۢۛۚۢۤۢۡۘۤۖۘۘۡ۟ۖۥۦۙ۫ۡ۟۫ۘ"
            goto L_0x0289
        L_0x0299:
            java.lang.String r4 = "ۢۘۢ۬ۨۥۘ۬ۤ۫ۙۗ۫ۘۤۚ"
            goto L_0x0289
        L_0x029c:
            java.lang.String r4 = "ۚۛۘۘ۟۬ۡۘۜ۠ۛۙۚۥۜۧۦۙۚۗ"
            goto L_0x0289
        L_0x029f:
            java.lang.String r4 = "ۚۦۦۘۗۘ۠ۖۘۧۘۧۢۡ۫ۚۥ"
            goto L_0x000d
        L_0x02a3:
            r16 = 831995282(0x31973d92, float:4.401678E-9)
            java.lang.String r4 = "۫ۦۥۡۘۨۥۨ۬ۙۤۖۘ۠ۘ۬ۤۡۜۥۡۤ۠ۖۘ"
        L_0x02a8:
            int r17 = r4.hashCode()
            r17 = r17 ^ r16
            switch(r17) {
                case -895788743: goto L_0x02bf;
                case -68950266: goto L_0x02b9;
                case 763116900: goto L_0x02b2;
                case 1889890294: goto L_0x02c2;
                default: goto L_0x02b1;
            }
        L_0x02b1:
            goto L_0x02a8
        L_0x02b2:
            java.lang.String r4 = "ۡ۠ۖۘۘ۫ۜۚ۟ۖۜۦۖۘ۟ۨۡۘ۠ۢۦۘ"
            goto L_0x000d
        L_0x02b6:
            java.lang.String r4 = "ۚۛ۫ۛۖۖۜۥۗۨ۠ۥۚۤۤۦ۫ۨۖۜۚۢۥ۟۟۟ۗ"
            goto L_0x02a8
        L_0x02b9:
            r4 = 2
            if (r8 == r4) goto L_0x02b6
            java.lang.String r4 = "ۡۦۚۢۤۗۜۛ۠ۡۗۦۘ۬ۢۘۘۖۗۚۡۧۥۢۗۥ"
            goto L_0x02a8
        L_0x02bf:
            java.lang.String r4 = "۠ۚۥۘۜۥۖ۬ۧۗۨۗۥۚۗۧۖۧۦۘۙ۠ۦۘۤ۠۬"
            goto L_0x02a8
        L_0x02c2:
            java.lang.String r4 = "ۤ۠۟ۥۘۙۙۖۡ۬ۗۢۥ۠ۗۨۖۢۦ۟ۡ۬ۛۚ۬ۤۨ"
            goto L_0x000d
        L_0x02c6:
            r16 = 284681153(0x10f7e3c1, float:9.777523E-29)
            java.lang.String r4 = "ۚۘۢۥ۫ۧۛۙۙۘۖۜۘۘۢۧۜۢ۫ۚۚۖۘۖۢۦۘ۫ۥۥۘ"
        L_0x02cb:
            int r17 = r4.hashCode()
            r17 = r17 ^ r16
            switch(r17) {
                case -1651375401: goto L_0x02d5;
                case -894809539: goto L_0x02f2;
                case 856673804: goto L_0x02dc;
                case 1795994204: goto L_0x02ef;
                default: goto L_0x02d4;
            }
        L_0x02d4:
            goto L_0x02cb
        L_0x02d5:
            java.lang.String r4 = "ۜۧۥۘۡۥۦۛۨۛۦۡۙۘ۫۬"
            goto L_0x000d
        L_0x02d9:
            java.lang.String r4 = "ۖ۫۫۫ۗ۠ۚۢۨۘۢۥۛ۬ۨۚۚۤۜ"
            goto L_0x02cb
        L_0x02dc:
            java.lang.String r4 = r25.toLowerCase()
            java.lang.String r17 = r21.toLowerCase()
            r0 = r17
            boolean r4 = r4.contains(r0)
            if (r4 == 0) goto L_0x02d9
            java.lang.String r4 = "ۙۦۥۖۢۢۨ۬ۘۘ۟ۛ۬۟ۤۘۘۙۥۢ۠ۛۥۘۜۚ۬"
            goto L_0x02cb
        L_0x02ef:
            java.lang.String r4 = "ۗۦۦۢۧۨ۠۠ۖ۬ۖۙۚۖۨۤۡۨۘۜ۬ۖۘۥۛ"
            goto L_0x02cb
        L_0x02f2:
            java.lang.String r4 = "ۖ۠ۦۘ۬ۥۘ۬ۚۨۘۤۡ۫ۥۧۦۥۥۜۙ۫ۥۨۛ۬ۖۥۧ"
            goto L_0x000d
        L_0x02f6:
            r16 = -1646938205(0xffffffff9dd5b7a3, float:-5.6570506E-21)
            java.lang.String r4 = "۠ۜۤۚ۬ۛۡۘۡۘۡۛۦۘ۫۟۫ۗۦ۫۬۬ۜۚۥۧ۠ۙ۬"
        L_0x02fb:
            int r17 = r4.hashCode()
            r17 = r17 ^ r16
            switch(r17) {
                case -2080688880: goto L_0x0305;
                case -34729989: goto L_0x02d5;
                case 651523352: goto L_0x0318;
                case 728883728: goto L_0x0315;
                default: goto L_0x0304;
            }
        L_0x0304:
            goto L_0x02fb
        L_0x0305:
            r0 = r25
            r1 = r21
            boolean r4 = r0.equalsIgnoreCase(r1)
            if (r4 == 0) goto L_0x0312
            java.lang.String r4 = "ۘۘۘۘۤۛۨۨۡۗۜۧۛۨۘ"
            goto L_0x02fb
        L_0x0312:
            java.lang.String r4 = "ۡۜ۬ۡۘۡۘۥۚۥۗ۫ۜ۟ۙۘۘۥۛۤ۠ۧۜ"
            goto L_0x02fb
        L_0x0315:
            java.lang.String r4 = "ۧۧۛۧۛۖۘۛ۠ۙۜۗۚۨۧۘۘ"
            goto L_0x02fb
        L_0x0318:
            java.lang.String r4 = "۠ۚۖۛۦۚ۬۟ۘ۫ۜۧ۬ۡ۬ۛۨۙۗ۫ۖ۠ۖۘۗ۬ۨ"
            goto L_0x000d
        L_0x031c:
            r0 = r26
            r1 = r22
            r2 = r23
            r3 = r24
            sendAuto(r0, r1, r2, r3)
            java.lang.String r4 = "ۜۧۥۘۡۥۦۛۨۛۦۡۙۘ۫۬"
            goto L_0x000d
        L_0x032b:
            java.lang.String r4 = "۟۬۬ۤۘۤۖ۬۬ۡ۫ۦۘ۬ۦۖۧۥۦۘ"
            goto L_0x000d
        L_0x032f:
            java.lang.String r4 = "ۙ۠ۥۡ۠ۧۚ۟ۗ۠۠۬ۛۛ۫ۙ۠ۨۘۘۛ۫ۜۘ۬"
            goto L_0x000d
        L_0x0333:
            java.lang.String r4 = "۫ۘ۫ۘۨۥۛۜۡۨ۟ۤۢ۬ۧۤۧۖۘ"
            goto L_0x000d
        L_0x0337:
            java.lang.String r4 = "ۢۜ۠ۥۥۧۘۨۧۡۘۡ۬ۨۘۜ۬ۨۘۦۨۤۡۦۡ"
            goto L_0x000d
        L_0x033b:
            java.lang.String r4 = "ۛۧ۠۠ۖۧۦۘۗۤۜۗ۬ۨ"
            goto L_0x000d
        L_0x033f:
            java.lang.String r4 = "ۤۗۦۘۚۜۙ۠ۤۦۡۥۛۢۗۗۗۗۛۡۨۘۛۖۜ"
            goto L_0x000d
        L_0x0343:
            java.lang.String r4 = "ۦۦۨۥ۟ۘ۬ۢۢۨۡۡۧ۫ۦ"
            goto L_0x000d
        L_0x0347:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.u1.replyPatternControl(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, X.0tZ):void");
    }

    public static void resetUnreadCh() {
        String str = "ۥ۫ۤۥۛۘۤۜۘۘۦ۬۠ۤۖۘ";
        while (true) {
            switch ((str.hashCode() ^ 395) ^ -1182058319) {
                case 217885286:
                    return;
                case 1823727497:
                    f891n = 0;
                    str = "ۛ۠ۡۚۡۧۘۜۚۖۘۦ۟ۥۘۙۨ۫";
                    break;
                case 2117731954:
                    f890m = 0;
                    str = "۠ۜۦۛۜۥۥۗۦۘۚ۟ۙۜۨ۠ۚۥ۟ۚۛۙۧۥۧۙ۟۠";
                    break;
            }
        }
    }

    public static void restartAcNoTrans(Activity activity) {
        String str = "۠۫ۨۘ۫ۧۨۘۜۤۜ۬ۗۙ۬ۗ۟ۗۖۛ۟ۜۨۧ۟ۜۘۘۢۜ";
        while (true) {
            switch ((str.hashCode() ^ 596) ^ 581685381) {
                case -987518803:
                    str = "۠۬۬ۦۦۥۘۢۙۚۗۧ۬ۖۜۘۥ۟ۥۘ";
                    break;
                case -605836225:
                    activity.finish();
                    str = "ۖۤۦۘۤ۠ۙۧۛۦۘۖۨۙۙ۠۫۫ۨۚۡۥۘۘۧۜ";
                    break;
                case 109394023:
                    activity.overridePendingTransition(0, 0);
                    str = "ۘۗۚۨ۠ۨ۬ۦۘ۬ۨۧۘۡۧۘۙۦۢۖۡۗ";
                    break;
                case 665031970:
                    String str2 = "ۛ۬ۜۘۦۘ۬ۢۦۘۗ۫ۜۛۤۗ۬۠ۦ۫۬ۥۘ۫ۜۗۖۜۥۘ";
                    while (true) {
                        switch (str2.hashCode() ^ 18935287) {
                            case -1351656032:
                                str = "ۖۛۜۦۗۦ۫ۥۥ۫ۜۧ۫ۨۤۧۤۨۘ۬ۧۚ";
                                continue;
                            case 401720304:
                                str = "ۖۨ۬۬ۘۗ۫۠ۘۘۦۘۗ۟ۧۙۧۖۘۡۤۨ";
                                continue;
                            case 617609329:
                                if (activity != null) {
                                    str2 = "ۨۧۧۖۘۤۦۚۘۡ۬۬ۛۖۜۦ۫ۖ";
                                    break;
                                } else {
                                    str2 = "ۡ۬ۖ۫۫ۖۜۚ۠ۢۙۤۛۗۦۖۙ";
                                    break;
                                }
                            case 1808996704:
                                str2 = "ۥۤۘۨۚۡ۬ۖۘۛۖ۠ۛۡۘۜۢ۬ۧۡۧۘ۬۠ۗ";
                                break;
                        }
                    }
                    break;
                case 1242120290:
                    activity.startActivity(activity.getIntent());
                    str = "۠ۛۢۜۨۘۛۜۡۘۚۨۘۘۘۛ۫۠ۤۚۗۘۜۧۥۜۘۧۜۡ";
                    break;
                case 1350105857:
                    activity.overridePendingTransition(0, 0);
                    str = "ۤ۬۠۠ۙۥۘۧۛۡۥۡۢۙۗۢۜۤۗ";
                    break;
                case 1723986841:
                case 1876284229:
                    return;
            }
        }
    }

    public static int returnINum(boolean z2) {
        String str = "ۢۜۧۘۜۚۢۢۤۛۡ۟ۚ۟ۧۗۡۘۛ";
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            switch ((str.hashCode() ^ 132) ^ -1462476637) {
                case -1895146222:
                    String str2 = "ۘۖۧۖۢۘۘۚۡۛۥۥۧۚۖۨۨۛۖۜ۬۫ۧۨ۟";
                    while (true) {
                        switch (str2.hashCode() ^ 276696046) {
                            case -415572093:
                                str2 = "ۨۖۗۨۖۡۚۚ۠۫ۖۖ۟ۛۖۘۜۘۗۦۦۡۥۘۥ";
                                break;
                            case -300691338:
                                str = "ۤ۠ۛۡۤ۠ۥ۠ۦۘۢ۫ۛ۟ۜۗۖۗ";
                                continue;
                            case 39732599:
                                str = "ۥۨۖۘۥۨۨۘۡۖۤۨۧۥۥ۟ۛۙۘۜ۫ۦۘۘۛۥۤ";
                                continue;
                            case 837612844:
                                if (!z2) {
                                    str2 = "ۚۧۢۨۚۘۤ۟ۥۢۡۥۘۤ۫ۨۘۘۥۡۤۖۘۨۤۖۘ۬ۨۦ";
                                    break;
                                } else {
                                    str2 = "ۨ۬ۦۘۖۢۗۨۖۗ۫ۜۨۘۧۛۨۗۚۜۘۘۤۗ";
                                    break;
                                }
                        }
                    }
                    break;
                case -1886767745:
                    str = "ۨ۠ۥۖ۟ۡۘ۠ۢ۠ۗۛۗۙ۟ۙۜۦۦۘۗ۟ۡۢۘۦۘۛۛۙ";
                    i3 = i4;
                    break;
                case -1383850291:
                    str = "ۖ۫ۜۘۚۚۨۘۤۡۧۘۥۡۨۛۧ۠۬ۨ۬ۨۥۜ۬ۡۛۙ۟ۡۘ";
                    i3 = i2;
                    break;
                case -868065318:
                    return i3;
                case -448993293:
                    i2 = 1;
                    str = "ۖۛۘۚۘۙۛۧ۫ۤۡ۠ۨۖۥۜۥۧۘۘۥۜ";
                    break;
                case 566325346:
                    str = "ۖ۫ۜۘۚۚۨۘۤۡۧۘۥۡۨۛۧ۠۬ۨ۬ۨۥۜ۬ۡۛۙ۟ۡۘ";
                    break;
                case 1973628563:
                    i4 = getCodedLen();
                    str = "ۗ۠ۘۘۥۡۦۦۥ۟۟ۜۥۗ۠ۡۢۨۥۤۜۨۘ";
                    break;
                case 2046241142:
                    str = "ۗۤۡۘۜۦۡۘۡۗۤۢۙۤۖ۠ۤ۠ۧۖۤۨۘ۫۫ۥۘ۠ۢۥ";
                    break;
            }
        }
    }

    public static void saveVOFile() {
        try {
            String vOSaveName = getVOSaveName();
            File file = new File(vOSaveName);
            String str = "ۙ۬ۗ۠ۨۢۨۜۜۘۢۦۡۘ۟۠ۤۤۧۡۦۨۚ۟ۤۤۡۚۙ";
            while (true) {
                switch (str.hashCode() ^ -1350169681) {
                    case -752480490:
                        str = "ۙ۫ۤۜۥۗ۟۫ۜۦۥۘۛ۫ۥۗۤۜۥۗۧ۟ۗۥ";
                        break;
                    case -256597456:
                        utils.copyFile(VO_file.getPath(), vOSaveName);
                        utils.forceScanMediaFile(new File(vOSaveName));
                        Toast.makeText(yo.getCtx(), yo.getString(Deobfuscator$app$Custom.getString(-15339968888257L)), 0).show();
                        return;
                    case -60334664:
                        Toast.makeText(yo.getCtx(), yo.getString(Deobfuscator$app$Custom.getString(-15279839346113L)), 0).show();
                        return;
                    case 142140978:
                        if (!file.exists()) {
                            str = "ۢۦۧۧ۟۟ۥۤ۠ۛۥ۠ۜۛۗ";
                            break;
                        } else {
                            str = "۠ۡ۫۫ۧۨ۫۫ۨۘ۟ۗۜۘۧ۟ۘۘ۫ۡۨۘۗۜۦۚۜۚۢۧۙ";
                            break;
                        }
                }
            }
        } catch (Exception e2) {
        }
    }

    public static void sendAuto(C16740tZ r6, String str, String str2, String str3) {
        C15830rv r1 = null;
        String str4 = "ۨۥۦۢۢۢۗ۫ۛۘۥۗ۠ۦۛۛۖۘۛۜۦۥ۬۠";
        while (true) {
            switch ((str4.hashCode() ^ 696) ^ -1075018473) {
                case -1276286138:
                case 207106613:
                    return;
                case -631961481:
                    str4 = "ۢۥ۬۬۬ۥۖ۠۠ۜۧۖۘۘۨۨۘۥۙۚۥۧۗۤۡ۬ۡۧۥۘ";
                    break;
                case -224602245:
                    str4 = "ۨ۫ۜۘۛ۬ۚۚۘۨۘ۟ۙۘۘۤۛۤۡ۠ۗ۫ۦۨۘ";
                    break;
                case 95749790:
                    r1 = dep.gen_b(dep.getJID_t(r6.A11.A00));
                    str4 = "ۦۡۗۤۘۜ۬ۙۤۛۢ۟۫۬ۢۙۖ۠ۥۚۨۛۘۨ";
                    break;
                case 175174791:
                    str4 = "ۙۜۥۘ۟۫ۜۛۜۘ۟ۛۢ۠۫ۗ۫ۚۘۗۢۤۚۙۘۖۧۡ";
                    break;
                case 223633669:
                    String str5 = "۟۠ۨۘ۬ۙۘۘۜۗۜۚ۫۟۠ۖۢۗۦۘۚ۟ۦۖۡۦۨۙۛ";
                    while (true) {
                        switch (str5.hashCode() ^ 1102192814) {
                            case -1684697498:
                                if (r6 != null) {
                                    str5 = "ۦ۠ۨ۟۠ۨۧۗ۫ۧ۫ۗۛۤۨۘۥۗ۠ۨۚ۟";
                                    break;
                                } else {
                                    str5 = "ۧۘۘ۫۠ۖۘۘۢۡۙۖۥۘۧۧۜۘۜۢۢ";
                                    break;
                                }
                            case -1276212473:
                                str4 = "ۘ۠ۢ۠ۙ۫۫ۛۧ۟ۧۥۘ۫ۛ۠۫ۥۘۡۢۘۥۜۗ";
                                continue;
                            case -389755406:
                                str4 = "ۤۙ۠۫ۗۘۙۙۦۜۡ۫ۛۨۨ";
                                continue;
                            case 479417849:
                                str5 = "ۛۢۡ۫ۧۘۨ۟ۙۢۜۢۢۢۘۘ۫۟";
                                break;
                        }
                    }
                    break;
                case 606066333:
                    str4 = "ۙۖۗ۫ۘۥۘ۠۠ۗۢ۟۫۫۟ۙ";
                    break;
                case 1413291752:
                    new Handler(Looper.getMainLooper()).postDelayed(new p(str2, r1, str, 3), (long) Integer.parseInt(str3));
                    str4 = "ۜۥۚۨۡۘۘۧۚۖ۠ۧۥۙ۬ۜۜۧۘ";
                    break;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void setBotUnreadCh(int r14) {
        /*
            r13 = 1
            r3 = 0
            r10 = 0
            java.lang.String r0 = "۟ۨۨۧۙۨۧۜۤۜۜۘۜۨۧۘۛۢۖۘۙۚۖۥ۟"
            r1 = r0
            r2 = r3
            r4 = r3
            r5 = r3
            r6 = r3
            r7 = r3
            r8 = r3
            r9 = r3
        L_0x000d:
            int r0 = r1.hashCode()
            r11 = 363(0x16b, float:5.09E-43)
            r12 = -1445667026(0xffffffffa9d4df2e, float:-9.453407E-14)
            r0 = r0 ^ r11
            r0 = r0 ^ r12
            switch(r0) {
                case -2107352381: goto L_0x0070;
                case -2015198799: goto L_0x0049;
                case -1799913016: goto L_0x00c9;
                case -1691766478: goto L_0x00b5;
                case -1469001648: goto L_0x0078;
                case -1407074436: goto L_0x0182;
                case -1212362969: goto L_0x0116;
                case -1144006946: goto L_0x0028;
                case -980033289: goto L_0x0102;
                case -670653666: goto L_0x00ce;
                case -525698484: goto L_0x0169;
                case -259483383: goto L_0x0157;
                case 96771725: goto L_0x0151;
                case 410325251: goto L_0x0053;
                case 463250064: goto L_0x0110;
                case 757111995: goto L_0x00d4;
                case 863993180: goto L_0x00e2;
                case 881222865: goto L_0x00dc;
                case 962771822: goto L_0x011f;
                case 971489597: goto L_0x0182;
                case 976170636: goto L_0x001c;
                case 1058168622: goto L_0x0020;
                case 1449083083: goto L_0x0074;
                case 1505470826: goto L_0x0095;
                case 1582211428: goto L_0x0125;
                case 1983671695: goto L_0x00c3;
                case 2038189314: goto L_0x0143;
                case 2059261355: goto L_0x017d;
                default: goto L_0x001b;
            }
        L_0x001b:
            goto L_0x000d
        L_0x001c:
            java.lang.String r0 = "۟۠ۡۘۘۤۡۘۡۗ۫ۜ۬ۚ۬ۦ۫ۧ۠ۜۘ۟ۨۡۢۖ۫ۖۗۡ"
            r1 = r0
            goto L_0x000d
        L_0x0020:
            boolean r10 = com.obwhatsapp.yo.yo.isGrpSeparateEnabled()
            java.lang.String r0 = "ۜۙۥۘ۬ۜۦۘۡۦ۫ۚۧ۟ۧۘۘۨۚ"
            r1 = r0
            goto L_0x000d
        L_0x0028:
            r1 = 111332955(0x6a2ce5b, float:6.124084E-35)
            java.lang.String r0 = "۫ۜۖۧۖ۬۠۠ۦۘ۟ۦۜۢۙۨ"
        L_0x002d:
            int r11 = r0.hashCode()
            r11 = r11 ^ r1
            switch(r11) {
                case -1015521953: goto L_0x017d;
                case -350037155: goto L_0x003d;
                case -310630123: goto L_0x0036;
                case 238757156: goto L_0x0046;
                default: goto L_0x0035;
            }
        L_0x0035:
            goto L_0x002d
        L_0x0036:
            java.lang.String r0 = "ۖ۬ۧۨۨۡۘۡ۟۫ۙۜۜۘۧۖۧ"
            r1 = r0
            goto L_0x000d
        L_0x003a:
            java.lang.String r0 = "ۘ۬ۨ۬ۛۚۡۚۢۧ۫ۡۘ۬ۖۨۘۙ۫۫ۥۧۘ"
            goto L_0x002d
        L_0x003d:
            boolean r0 = com.obwhatsapp.yo.HomeUI.isOneUIOrBottomEnabled()
            if (r0 == 0) goto L_0x003a
            java.lang.String r0 = "ۙۨۨۢۨ۟ۤۚۙ۫ۚۡۗۨۡۖۛۖۘۡۨۘۡۗ"
            goto L_0x002d
        L_0x0046:
            java.lang.String r0 = "ۦ۠ۨ۫ۡۥۤ۫ۛۧۛ۫ۖۗۨ۬ۗۡۜۖۛ"
            goto L_0x002d
        L_0x0049:
            com.obwhatsapp.HomeActivity r0 = com.obwhatsapp.yo.yo.Homeac
            android.view.View r0 = r0.yoBottomBarView
            com.obwhatsapp.youbasha.ui.views.IBottomNavigation r0 = (com.obwhatsapp.youbasha.ui.views.IBottomNavigation) r0
            java.lang.String r1 = "ۦۜ۠ۡۨۚۨ۟ۡۥۛۜۙۤۖ"
            r9 = r0
            goto L_0x000d
        L_0x0053:
            r1 = 2123312751(0x7e8f2e6f, float:9.516035E37)
            java.lang.String r0 = "ۚۛ۫۠۟ۤۦۘۚ۫ۛۥۘۡۚۚ"
        L_0x0058:
            int r11 = r0.hashCode()
            r11 = r11 ^ r1
            switch(r11) {
                case -1797622729: goto L_0x0061;
                case -391711771: goto L_0x015f;
                case 694918878: goto L_0x0067;
                case 1699725627: goto L_0x006c;
                default: goto L_0x0060;
            }
        L_0x0060:
            goto L_0x0058
        L_0x0061:
            java.lang.String r0 = "ۥۛۨۜۗۛۨۖۤۛۗۧ۬۠ۜۘۜۧۡۘۤۧ۬"
            goto L_0x0058
        L_0x0064:
            java.lang.String r0 = "ۤۛۚۢۚۦۘۤۘ۟ۢۚۧۖ۠ۚ۠ۚۘۦۛۨۘۘ۬ۦۘ"
            goto L_0x0058
        L_0x0067:
            if (r9 != 0) goto L_0x0064
            java.lang.String r0 = "۫ۛۡۘۙۧۥۜۤۖۘۖۛۨۘۙ۫ۜۘۛۥۧۘ"
            goto L_0x0058
        L_0x006c:
            java.lang.String r0 = "۟ۦۦۙۢۡ۬۫ۨۙۘۚۥۢۥۘۛ۟ۘۜۖۘۙۗۢۤ۫ۦۘ"
            r1 = r0
            goto L_0x000d
        L_0x0070:
            java.lang.String r0 = "ۛۖۚۧۦۚۜۨ۠ۧۤۤۗۖۙ۟ۚۦۨۡۚۦۦۥۘۡۚۛ"
            r1 = r0
            goto L_0x000d
        L_0x0074:
            java.lang.String r0 = "ۙۤۢۙۨۘ۫ۗ۠ۘۢۙ۟ۗۨۘۦۥۙۖۦ"
            r1 = r0
            goto L_0x000d
        L_0x0078:
            r1 = -1809475925(0xffffffff942596ab, float:-8.360085E-27)
            java.lang.String r0 = "ۢۧۥ۠۫ۧ۬ۙۡۢۘۧۘۢۜۙۖۥۡ۬۬ۙ"
        L_0x007d:
            int r11 = r0.hashCode()
            r11 = r11 ^ r1
            switch(r11) {
                case -1107539411: goto L_0x0086;
                case -964932592: goto L_0x0173;
                case 636163311: goto L_0x0092;
                case 1765989676: goto L_0x008d;
                default: goto L_0x0085;
            }
        L_0x0085:
            goto L_0x007d
        L_0x0086:
            java.lang.String r0 = "ۨۚ۫ۦۦۘۘۧۛۤ۟ۗۜۘۥۨ۫ۥۡۥۘۦۚۚۛ۬ۥ۟ۢۦۘ"
            r1 = r0
            goto L_0x000d
        L_0x008a:
            java.lang.String r0 = "ۨ۠ۦۘۨ۟ۤۦۡۨۘ۟ۗ۬۟ۨۢۨ۠ۦ"
            goto L_0x007d
        L_0x008d:
            if (r10 == 0) goto L_0x008a
            java.lang.String r0 = "ۨۖۜۖۛۥ۬۬ۨۗ۟ۡۘ۟ۗ۬ۗۚۨۖۥۙ"
            goto L_0x007d
        L_0x0092:
            java.lang.String r0 = "ۙ۟ۡۛۤۖ۬۫ۚۢۙۦ۬"
            goto L_0x007d
        L_0x0095:
            r1 = -1984117838(0xffffffff89bcc3b2, float:-4.5443385E-33)
            java.lang.String r0 = "ۡۚۤۡۗۧۡۢۥۤۧۦۘۜۛۙ"
        L_0x009a:
            int r11 = r0.hashCode()
            r11 = r11 ^ r1
            switch(r11) {
                case -514659765: goto L_0x00a3;
                case 8167477: goto L_0x00a9;
                case 281778994: goto L_0x00b0;
                case 1430809724: goto L_0x0164;
                default: goto L_0x00a2;
            }
        L_0x00a2:
            goto L_0x009a
        L_0x00a3:
            java.lang.String r0 = "۠۫۫ۜۦۜۦۥۜۘۢۡۖۗۦۨۥۚۤ"
            goto L_0x009a
        L_0x00a6:
            java.lang.String r0 = "ۤۢۜۦۚ۫ۥ۫۫ۢۨۥۗۜۧۘۡۡۗ"
            goto L_0x009a
        L_0x00a9:
            int r0 = f890m
            if (r0 <= 0) goto L_0x00a6
            java.lang.String r0 = "ۢ۠۫ۨ۟ۡۤ۟ۚۢ۬۟ۖۨۧ۟۟ۗۖۜۦۧۧۢۛۡۖ"
            goto L_0x009a
        L_0x00b0:
            java.lang.String r0 = "ۨ۫ۤ۠ۗ۬ۙۢ۫۬ۧۜۘۥۘۨۤ۫"
            r1 = r0
            goto L_0x000d
        L_0x00b5:
            r0 = -14137378045377(0xfffff324629a823f, double:NaN)
            java.lang.String r8 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r0)
            java.lang.String r0 = "۫ۖۙۛۧۨ۟۠ۜۘۚۢ۠ۙۙۗ۠ۤۘ"
            r1 = r0
            goto L_0x000d
        L_0x00c3:
            java.lang.String r0 = "ۙۙۤ۬ۢۜۘۤۘۨۘ۠ۛ۟ۙۛۨۖۦۜۘۙ۫ۜۦۛ۬ۙۜۧۘ"
            r1 = r0
            r7 = r8
            goto L_0x000d
        L_0x00c9:
            java.lang.String r0 = "ۖۖۜ۟ۘۦۖۛۤۘۚۢۥۜۦۘ"
            r1 = r0
            goto L_0x000d
        L_0x00ce:
            java.lang.String r0 = "ۜ۟ۜۘۚ۠۠ۤۨۗ۬۬ۖۘۧۙ۫۫ۛۙۘۗۧ"
            r1 = r0
            r7 = r3
            goto L_0x000d
        L_0x00d4:
            r9.setBadgeValue(r13, r7)
            java.lang.String r0 = "ۥۡۚۨۖۚۚۖ۟ۧ۫ۡۘ۠ۜۡۡۜۜۘۢۦ۠ۧۡۘۘۥۡۚ"
            r1 = r0
            goto L_0x000d
        L_0x00dc:
            java.lang.String r0 = "ۡۥۡۘۧۘۤ۬ۥۜۘۗۙۜۧ۠ۤۚۦۖ۫۟۬ۘۥ"
            r1 = r0
            r6 = r3
            goto L_0x000d
        L_0x00e2:
            r1 = -489534229(0xffffffffe2d24ceb, float:-1.9396794E21)
            java.lang.String r0 = "ۖۨۖۘۖۗۤ۫ۤۘۘۘۚۦۘ۬ۦۜۘ"
        L_0x00e7:
            int r11 = r0.hashCode()
            r11 = r11 ^ r1
            switch(r11) {
                case 36424357: goto L_0x00ff;
                case 1216663841: goto L_0x00f0;
                case 1443768736: goto L_0x016e;
                case 1747584025: goto L_0x00f8;
                default: goto L_0x00ef;
            }
        L_0x00ef:
            goto L_0x00e7
        L_0x00f0:
            java.lang.String r0 = "ۢۡۡۘ۫ۧۤۤ۫ۦۜ۫ۚۗۧۚ۟۠ۘۨۘۡۘ"
            r1 = r0
            goto L_0x000d
        L_0x00f5:
            java.lang.String r0 = "ۨۗۙۙ۟ۦۘۜۛۡۙۦۛۚ۟ۥۘۘۢۛ"
            goto L_0x00e7
        L_0x00f8:
            int r0 = f891n
            if (r0 <= 0) goto L_0x00f5
            java.lang.String r0 = "ۢ۬۠ۛۤۢۥۡۖۘۘۧۘۘۛۘ۟ۤ۟ۘۦۜۧۥۨۛۖۘۢ"
            goto L_0x00e7
        L_0x00ff:
            java.lang.String r0 = "ۗۛۜۘۘۤۘۘۙۖۥۖۗۘۛۙۘۘۛۙۗۨۖۨۘۖۦۧۘۚۧۖ"
            goto L_0x00e7
        L_0x0102:
            r0 = -14141673012673(0xfffff323629a823f, double:NaN)
            java.lang.String r5 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r0)
            java.lang.String r0 = "۬ۡۡۘۜ۫ۚۙۜ۬ۚ۟ۡۘۥۥۤۤۥۡۙۢ۠"
            r1 = r0
            goto L_0x000d
        L_0x0110:
            java.lang.String r0 = "ۚۡۨۘۛۡۚ۠ۗۜۘۗۗۛۥ۠ۨ"
            r1 = r0
            r6 = r5
            goto L_0x000d
        L_0x0116:
            r0 = 2
            r9.setBadgeValue(r0, r6)
            java.lang.String r0 = "ۢۤۧ۫ۦ۠ۖۘۡۘۚۜۗۡۢۢۘۧۖۘۦۥۖ۟ۦۖ"
            r1 = r0
            goto L_0x000d
        L_0x011f:
            java.lang.String r0 = "۫ۜۥۘۚۦۥۗ۟۟ۘۘۗۜۧۤۢ۟"
            r1 = r0
            r4 = r3
            goto L_0x000d
        L_0x0125:
            r1 = -1172085016(0xffffffffba2366e8, float:-6.233291E-4)
            java.lang.String r0 = "۟۠ۜۧۘۘۦ۟ۢ۫ۙۘۘۙۜۢ۟ۚۤ۟۠ۢ"
        L_0x012a:
            int r11 = r0.hashCode()
            r11 = r11 ^ r1
            switch(r11) {
                case -287028604: goto L_0x0139;
                case 604467053: goto L_0x0133;
                case 1702198969: goto L_0x0178;
                case 1846226419: goto L_0x013e;
                default: goto L_0x0132;
            }
        L_0x0132:
            goto L_0x012a
        L_0x0133:
            java.lang.String r0 = "ۙ۠ۘۘۚۦۡۤ۬ۨ۬۟ۥۘ۠۫ۨ۬ۛ۬۟۬۠ۥۚ۫"
            goto L_0x012a
        L_0x0136:
            java.lang.String r0 = "ۗۦۡۘۖۜۡۘۢۨۚ۬ۗ۠۫ۡۡۘ"
            goto L_0x012a
        L_0x0139:
            if (r14 <= 0) goto L_0x0136
            java.lang.String r0 = "ۜۨۗ۠۠ۥۘۗۛۛ۬ۡۖۘۦۡۚ۫۬ۡۘۙۛۜۘ"
            goto L_0x012a
        L_0x013e:
            java.lang.String r0 = "ۜ۬ۜۥۗ۬ۥۥۘۛ۫ۘۛۚۘۙ۟ۙ۟ۥۥ"
            r1 = r0
            goto L_0x000d
        L_0x0143:
            r0 = -14145967979969(0xfffff322629a823f, double:NaN)
            java.lang.String r2 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r0)
            java.lang.String r0 = "۟ۖ۬ۧۨۧۘۦۛۥۘۧۗۥۘۘۤۦ"
            r1 = r0
            goto L_0x000d
        L_0x0151:
            java.lang.String r0 = "ۧۘۚ۟ۨۖۘ۟۠ۡۘ۠ۖۛ۫ۚ۟ۢۦۧ"
            r1 = r0
            r4 = r2
            goto L_0x000d
        L_0x0157:
            r9.setBadgeValue(r13, r4)
            java.lang.String r0 = "ۥۦ۟ۗۢۖۘ۟۠ۖ۟۫ۚۥۖۛۚۧۥۘۛ۬ۘۚۚۖ۠ۗۥ"
            r1 = r0
            goto L_0x000d
        L_0x015f:
            java.lang.String r0 = "ۚۥ۫۬ۚ۟۟ۖۢۚۦۥۘۢۛ۫ۡ۠ۥۘۙ۬ۤ"
            r1 = r0
            goto L_0x000d
        L_0x0164:
            java.lang.String r0 = "ۙۨ۫۟۫ۘۘۤ۠۟ۨۥۧۨ۠ۘۡۨۗۗۥۢ۫ۙۙۡۢۤ"
            r1 = r0
            goto L_0x000d
        L_0x0169:
            java.lang.String r0 = "ۜ۟ۜۘۚ۠۠ۤۨۗ۬۬ۖۘۧۙ۫۫ۛۙۘۗۧ"
            r1 = r0
            goto L_0x000d
        L_0x016e:
            java.lang.String r0 = "ۚۡۨۘۛۡۚ۠ۗۜۘۗۗۛۥ۠ۨ"
            r1 = r0
            goto L_0x000d
        L_0x0173:
            java.lang.String r0 = "ۘۦ۫۠ۘۖۖۢ۫ۦۢۡۛۤۛ"
            r1 = r0
            goto L_0x000d
        L_0x0178:
            java.lang.String r0 = "ۧۘۚ۟ۨۖۘ۟۠ۡۘ۠ۖۛ۫ۚ۟ۢۦۧ"
            r1 = r0
            goto L_0x000d
        L_0x017d:
            java.lang.String r0 = "ۥۦ۟ۗۢۖۘ۟۠ۖ۟۫ۚۥۖۛۚۧۥۘۛ۬ۘۚۚۖ۠ۗۥ"
            r1 = r0
            goto L_0x000d
        L_0x0182:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.u1.setBotUnreadCh(int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v4, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v110, resolved type: boolean} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x047f, code lost:
        r5 = "ۥ۟ۦۘ۟ۨۦۚۙ۟ۖ۟۬ۤ۫ۖۘۢ۟ۢۛۜۨۘۡۘۡۘ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x05a4, code lost:
        r5 = "ۥ۬ۥ۬۟ۡۘ۟۠ۚۛۡۧۥۨۛۨۧۦۤ۫۠ۛ۟ۚ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x05cc, code lost:
        r5 = "ۜۨۜۘۥۧۦ۠ۘۖۢۡۦۘۡۥۗ۟ۚۦ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:357:0x003d, code lost:
        r27 = r27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:380:0x003d, code lost:
        r27 = r27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:388:0x003d, code lost:
        r27 = r27;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void setTabUnread(android.view.View r42, int r43, int r44) {
        /*
            r39 = 0
            r38 = 0
            r37 = 0
            r36 = 0
            r32 = 0
            r12 = 0
            r35 = 0
            r33 = 0
            r34 = 0
            r30 = 0
            r31 = 0
            r9 = 0
            r29 = 0
            r27 = 0
            r28 = 0
            r26 = 0
            r24 = 0
            r25 = 0
            r23 = 0
            r21 = 0
            r22 = 0
            r20 = 0
            r18 = 0
            r19 = 0
            r17 = 0
            r16 = 0
            r14 = 0
            r15 = 0
            r13 = 0
            r10 = 0
            r11 = 0
            r7 = 0
            r8 = 0
            r6 = 0
            java.lang.String r4 = "ۡ۟ۦۤۢۚۤۗۥۖۛۜۘۖۨۢۡۨۜۘ"
            r5 = r4
        L_0x003d:
            int r4 = r5.hashCode()
            r40 = 59
            r41 = 144312156(0x89a075c, float:9.270268E-34)
            r4 = r4 ^ r40
            r4 = r4 ^ r41
            switch(r4) {
                case -2100648174: goto L_0x01de;
                case -2032536721: goto L_0x0128;
                case -1940226604: goto L_0x0241;
                case -1921099738: goto L_0x02c0;
                case -1850413307: goto L_0x03d0;
                case -1846895751: goto L_0x0298;
                case -1798278880: goto L_0x037d;
                case -1780259369: goto L_0x01f3;
                case -1771969655: goto L_0x00ba;
                case -1754830123: goto L_0x0562;
                case -1731688047: goto L_0x01bd;
                case -1713657417: goto L_0x0443;
                case -1685541093: goto L_0x05c7;
                case -1668085073: goto L_0x03d6;
                case -1412205003: goto L_0x0368;
                case -1411753975: goto L_0x05ea;
                case -1406332685: goto L_0x004e;
                case -1405443598: goto L_0x02c7;
                case -1401375095: goto L_0x04bf;
                case -1365649696: goto L_0x039c;
                case -1222992968: goto L_0x00c7;
                case -1179636114: goto L_0x0470;
                case -1130018021: goto L_0x021f;
                case -1109030569: goto L_0x04f0;
                case -1038272133: goto L_0x006a;
                case -1017857435: goto L_0x015b;
                case -1010225245: goto L_0x0102;
                case -1009420387: goto L_0x05bd;
                case -928598528: goto L_0x0136;
                case -767359490: goto L_0x01fa;
                case -759374782: goto L_0x01ec;
                case -730908159: goto L_0x0109;
                case -725309958: goto L_0x0062;
                case -701747427: goto L_0x01e5;
                case -676625629: goto L_0x0436;
                case -625066273: goto L_0x0361;
                case -599581876: goto L_0x0595;
                case -555385572: goto L_0x04fd;
                case -545215723: goto L_0x012f;
                case -511488073: goto L_0x0389;
                case -493984767: goto L_0x0056;
                case -465285966: goto L_0x04ea;
                case -354024135: goto L_0x031d;
                case -316203700: goto L_0x02d5;
                case -196301161: goto L_0x02fa;
                case -183612722: goto L_0x036f;
                case -181356612: goto L_0x03ff;
                case -39317650: goto L_0x00ed;
                case 16405259: goto L_0x019a;
                case 87198659: goto L_0x0052;
                case 120260184: goto L_0x04b9;
                case 172218164: goto L_0x00fb;
                case 184595874: goto L_0x00f4;
                case 199915874: goto L_0x05d6;
                case 231794391: goto L_0x0526;
                case 238315501: goto L_0x03e0;
                case 260141371: goto L_0x013c;
                case 271668577: goto L_0x056b;
                case 288277417: goto L_0x00a6;
                case 295752575: goto L_0x0177;
                case 302982518: goto L_0x0498;
                case 480352316: goto L_0x05b3;
                case 589967479: goto L_0x0376;
                case 777624146: goto L_0x0162;
                case 932004475: goto L_0x042b;
                case 993340174: goto L_0x05e0;
                case 1027200117: goto L_0x0088;
                case 1047357855: goto L_0x05ae;
                case 1057284230: goto L_0x0206;
                case 1095054373: goto L_0x04cb;
                case 1142943716: goto L_0x03bb;
                case 1163345768: goto L_0x0170;
                case 1180591262: goto L_0x0340;
                case 1186227404: goto L_0x0507;
                case 1224422299: goto L_0x02ce;
                case 1279776114: goto L_0x0269;
                case 1292586416: goto L_0x059f;
                case 1296232079: goto L_0x00c1;
                case 1312225837: goto L_0x03c2;
                case 1312245664: goto L_0x053f;
                case 1486449843: goto L_0x005a;
                case 1505488532: goto L_0x00b2;
                case 1592784546: goto L_0x03c9;
                case 1603924458: goto L_0x02b9;
                case 1647954876: goto L_0x0275;
                case 1756801809: goto L_0x04c5;
                case 1777181865: goto L_0x00e6;
                case 1819367511: goto L_0x04f7;
                case 1829251975: goto L_0x02e1;
                case 1859150754: goto L_0x041f;
                case 1915509836: goto L_0x044d;
                case 2087123549: goto L_0x0169;
                case 2135199867: goto L_0x0586;
                default: goto L_0x004d;
            }
        L_0x004d:
            goto L_0x003d
        L_0x004e:
            java.lang.String r4 = "ۦۛ۬ۦۧۨۘۨ۟ۨۖۢۨۚۢۚۖۢۧۤۘ۠۟۬ۡ"
            r5 = r4
            goto L_0x003d
        L_0x0052:
            java.lang.String r4 = "ۘۜۢۦۤ۠ۜۨۖۗۚۜۘۦۘۜۨ۬ۜۘ۫ۤۤ"
            r5 = r4
            goto L_0x003d
        L_0x0056:
            java.lang.String r4 = "ۦۦۡۘۨۧۡۘۡۡۧ۬ۛۢۧۘ۟۬ۢۖۘ۠ۙۜۦۛ۟"
            r5 = r4
            goto L_0x003d
        L_0x005a:
            boolean r39 = com.obwhatsapp.yo.yo.isGrpSeparateEnabled()
            java.lang.String r4 = "ۡ۬۟ۢۛ۠ۦۨۘ۠ۦۧۙۢۙۡۖۗۘۛۗۜۙ۠ۧۦۛ"
            r5 = r4
            goto L_0x003d
        L_0x0062:
            boolean r38 = com.obwhatsapp.yo.HomeUI.isOneUIOrBottomEnabled()
            java.lang.String r4 = "ۖ۫ۘۖۚۦۤۚۤ۫۫۬ۦ۟ۗۛۢۤ"
            r5 = r4
            goto L_0x003d
        L_0x006a:
            r5 = -1197227301(0xffffffffb8a3c2db, float:-7.80874E-5)
            java.lang.String r4 = "ۨۜۛۖۧۘۚۙۜۨۢۥۘۘۡۥۘ"
        L_0x006f:
            int r40 = r4.hashCode()
            r40 = r40 ^ r5
            switch(r40) {
                case -2130762214: goto L_0x0079;
                case -377268799: goto L_0x047f;
                case 249995055: goto L_0x0085;
                case 1259121373: goto L_0x0080;
                default: goto L_0x0078;
            }
        L_0x0078:
            goto L_0x006f
        L_0x0079:
            java.lang.String r4 = "۫ۨۡۢۤۧۙۢۦۧۚۡۜۨۥۘۛۥ۫ۢۦۦ"
            r5 = r4
            goto L_0x003d
        L_0x007d:
            java.lang.String r4 = "۬۫ۖۘ۬ۧ۫ۗۛۢۜ۫ۨ۫ۨۥۘ"
            goto L_0x006f
        L_0x0080:
            if (r39 == 0) goto L_0x007d
            java.lang.String r4 = "۠ۧۜۖۖ۫ۖ۬ۤۛۘ۠ۗۜۤۗۘۡۘ۬ۚ۠ۥۘ۟ۜۙۗ"
            goto L_0x006f
        L_0x0085:
            java.lang.String r4 = "ۜۡۦۘۢۢۦۜ۠۟۫ۦۥۘۨۤۗ"
            goto L_0x006f
        L_0x0088:
            r5 = 1006493452(0x3bfddf0c, float:0.0077475365)
            java.lang.String r4 = "ۛۧۦۘۤۧ۫۬ۗۤۤۢۚۘۨۛۡ۟ۤۤۡ"
        L_0x008d:
            int r40 = r4.hashCode()
            r40 = r40 ^ r5
            switch(r40) {
                case -1092327920: goto L_0x00a2;
                case -979547685: goto L_0x009f;
                case 983384233: goto L_0x0097;
                case 1009331033: goto L_0x047f;
                default: goto L_0x0096;
            }
        L_0x0096:
            goto L_0x008d
        L_0x0097:
            if (r38 != 0) goto L_0x009c
            java.lang.String r4 = "ۢ۟۬ۗۦۘ۫ۨۖۘۘۧۚۡۜۤ"
            goto L_0x008d
        L_0x009c:
            java.lang.String r4 = "ۗۧۦۘۜۙۡۘ۟ۜۘۘۖۥۦۥۦۜۘۦۙۜۘۙ۠۬"
            goto L_0x008d
        L_0x009f:
            java.lang.String r4 = "۬۬ۦۚ۫ۧ۬ۖۥۧۢۦۗۙۙ۬۬ۦۧۜ۠"
            goto L_0x008d
        L_0x00a2:
            java.lang.String r4 = "ۧۢۨۘۡۖۚۗ۫ۥۘۥ۫ۘ۠ۗۖ"
            r5 = r4
            goto L_0x003d
        L_0x00a6:
            java.util.Locale r4 = java.util.Locale.getDefault()
            java.text.NumberFormat r37 = java.text.NumberFormat.getInstance(r4)
            java.lang.String r4 = "ۛۢۧۙۢۦۖۧۧۚۥۧۘۤ۟ۚۦۨ۟"
            r5 = r4
            goto L_0x003d
        L_0x00b2:
            boolean r36 = com.obwhatsapp.youbasha.task.utils.isRTL()
            java.lang.String r4 = "ۘۙۘۘ۬ۧۤۢۦۦ۫ۙۗۥ۠ۘ"
            r5 = r4
            goto L_0x003d
        L_0x00ba:
            r32 = 3
            java.lang.String r4 = "ۘۥۚۦۘۘۘ۠ۨۢ۠ۜۧۛۨۡۘۗۜۖۦۚۡۘ"
            r5 = r4
            goto L_0x003d
        L_0x00c1:
            r12 = 1
            java.lang.String r4 = "ۙۛۥۗ۟ۨۘۘۗۖۥ۫ۖۦۗۘ۫۬ۙۤۧۦۥۦ"
            r5 = r4
            goto L_0x003d
        L_0x00c7:
            r5 = 1164807455(0x456d8d1f, float:3800.82)
            java.lang.String r4 = "ۘۢۡۜۨۘۥۦۧۘۙۜ۟۫ۡۘۘۧۙۜ"
        L_0x00cc:
            int r40 = r4.hashCode()
            r40 = r40 ^ r5
            switch(r40) {
                case -2006367573: goto L_0x0581;
                case 894654784: goto L_0x00de;
                case 973301302: goto L_0x00d6;
                case 1650078851: goto L_0x00e3;
                default: goto L_0x00d5;
            }
        L_0x00d5:
            goto L_0x00cc
        L_0x00d6:
            java.lang.String r4 = "ۢۥۜۙۘۦۘۜۚۙۢۘۘۘ۠ۧ"
            r5 = r4
            goto L_0x003d
        L_0x00db:
            java.lang.String r4 = "ۜۘۤۛۡۚۖۢۥۨ۠ۚۗ۫ۨۡۡۘۘ۬ۡ"
            goto L_0x00cc
        L_0x00de:
            if (r36 == 0) goto L_0x00db
            java.lang.String r4 = "۠ۨۜۘۜۖۜۡۘۗۥۢ۬ۥۨۛۦۦۥۘ۠۬ۦۘ"
            goto L_0x00cc
        L_0x00e3:
            java.lang.String r4 = "ۨۘۥۘۙۙۖۘۛۨۡ۟ۙۢۖۘ۫ۖۖۙ"
            goto L_0x00cc
        L_0x00e6:
            r35 = 3
            java.lang.String r4 = "۟ۦۙۨۙۨۘۚۜۖ۬ۦۨ۟۫۬ۧۙۤۜ۠ۗ۬ۡۘۘ"
            r5 = r4
            goto L_0x003d
        L_0x00ed:
            java.lang.String r4 = "ۗۦۚ۫۠ۛۥ۟ۜ۫ۛۨۘ۬ۘ۬۫۬۠ۡۘ۟ۘۡۧ"
            r5 = r4
            r34 = r35
            goto L_0x003d
        L_0x00f4:
            r33 = 1
            java.lang.String r4 = "ۙۡ۟ۧ۬۟ۜۛۜۘۖۦۡۘۢۢۘ"
            r5 = r4
            goto L_0x003d
        L_0x00fb:
            java.lang.String r4 = "۟ۦۢۢۢۦۘۘۦۖۘۙۦ۟ۥۡۥۘ"
            r5 = r4
            r34 = r33
            goto L_0x003d
        L_0x0102:
            java.lang.String r4 = "ۗۛۨۙۜۧۢ۠ۛۛ۟۫ۦۗۦ۫ۤۧۨۗۗ۠ۗۦۘۢۦۘ"
            r5 = r4
            r31 = r32
            goto L_0x003d
        L_0x0109:
            r5 = -1555708242(0xffffffffa345c6ae, float:-1.07214635E-17)
            java.lang.String r4 = "ۡۦ۫ۛۗۨۘ۬۬ۖ۬ۤۥۘۜۖۥۘ۬ۜۨ"
        L_0x010e:
            int r40 = r4.hashCode()
            r40 = r40 ^ r5
            switch(r40) {
                case -1164338016: goto L_0x0118;
                case -958458414: goto L_0x0120;
                case 1427075426: goto L_0x058b;
                case 1993794267: goto L_0x0125;
                default: goto L_0x0117;
            }
        L_0x0117:
            goto L_0x010e
        L_0x0118:
            java.lang.String r4 = "ۛۦۥۘ۠ۚۦۚۜۘ۬ۦۜۛۘۜۖۘۙۚۥۘ۟ۙۥۘ"
            r5 = r4
            goto L_0x003d
        L_0x011d:
            java.lang.String r4 = "ۢۛۛ۫ۖۧۖۜۡۘۛۦ۫ۛۜۖ"
            goto L_0x010e
        L_0x0120:
            if (r36 == 0) goto L_0x011d
            java.lang.String r4 = "ۗ۬ۛۗۛۢۚۚۥۜۚۗۥۚۧۘۢۤ۫ۡۦۦۗۢ"
            goto L_0x010e
        L_0x0125:
            java.lang.String r4 = "۟ۨۦۘ۬ۛ۟ۤ۫۫ۨۤۗۦۙۚۨۨۘۢۘۘۧۥۘۛۚۢ"
            goto L_0x010e
        L_0x0128:
            r30 = 1
            java.lang.String r4 = "ۚۚۘۛۚۙۙ۬۠ۙۨۙۗ۫ۥۘۗ۬ۜۘۗۥۨ۬ۥۜ۬ۥ۫"
            r5 = r4
            goto L_0x003d
        L_0x012f:
            java.lang.String r4 = "ۛۢۜۥۡۚۧۗۧۡۚۦۘۡۖۘ۟ۘۜۘۛۖۡ"
            r5 = r4
            r31 = r30
            goto L_0x003d
        L_0x0136:
            r9 = 0
            java.lang.String r4 = "ۨ۟ۚ۫۟۟ۤۤۖۘۡۡ۫ۘۖۤۦ۫۠ۘۚۛۛ۠۠۠ۤۘۘ"
            r5 = r4
            goto L_0x003d
        L_0x013c:
            r5 = -474521752(0xffffffffe3b75f68, float:-6.765258E21)
            java.lang.String r4 = "ۡۙۦۘۛۜۙ۠ۤۚۗۡۥ۠ۖ۬ۢ۠ۡۘۚ۫ۦۜۜ۟"
        L_0x0141:
            int r40 = r4.hashCode()
            r40 = r40 ^ r5
            switch(r40) {
                case -2110568426: goto L_0x0158;
                case -285157828: goto L_0x014b;
                case 1437414346: goto L_0x0590;
                case 2029086954: goto L_0x0153;
                default: goto L_0x014a;
            }
        L_0x014a:
            goto L_0x0141
        L_0x014b:
            java.lang.String r4 = "ۗۧۧۚ۟ۜ۬۟ۘۢۧۡۙۗۗۥۨۙ۬۠ۦۤ۟ۛ"
            r5 = r4
            goto L_0x003d
        L_0x0150:
            java.lang.String r4 = "ۢۤۦۨۚۦۘۢۤۨۘۜۢۜ۬ۗۜۛ۫ۖۘۙۨۘۘ۫ۗ"
            goto L_0x0141
        L_0x0153:
            if (r36 == 0) goto L_0x0150
            java.lang.String r4 = "۬ۨۖۘۚۦۘۛۦۜۘۡ۬ۖۘۧ۠ۦۛۚۨ"
            goto L_0x0141
        L_0x0158:
            java.lang.String r4 = "ۘۜۧ۬ۨۘۡۨۙۖۨۥ۠۫ۗۢۤ"
            goto L_0x0141
        L_0x015b:
            r29 = 0
            java.lang.String r4 = "ۦۛ۟ۦۚۨۤ۬ۥۘۙ۫ۢۨۤۘۘ۟۠۟ۨۦۘۘ"
            r5 = r4
            goto L_0x003d
        L_0x0162:
            java.lang.String r4 = "ۤ۫۬ۧۖۢۘۦۧۘۥ۫ۨۘۡ۬ۢۢ۟۬ۧۘۗ"
            r5 = r4
            r28 = r29
            goto L_0x003d
        L_0x0169:
            r27 = 4
            java.lang.String r4 = "ۘۢۜۛۘۘ۟ۚ۟ۦۚۜۚۥۧ"
            r5 = r4
            goto L_0x003d
        L_0x0170:
            java.lang.String r4 = "ۚۧۘۘۖۘۧۘۢۨۘۛۘۚۙ۟ۜۘۧۡۖۢۢۖۘۘۦۗ"
            r5 = r4
            r28 = r27
            goto L_0x003d
        L_0x0177:
            r5 = -406504487(0xffffffffe7c53bd9, float:-1.8628204E24)
            java.lang.String r4 = "ۛۛۢۦۖ۟ۦۤ۬ۦۨ۫۬ۢۙ۫ۚۡۘ۫ۢۨۥۜ"
        L_0x017c:
            int r40 = r4.hashCode()
            r40 = r40 ^ r5
            switch(r40) {
                case -798721033: goto L_0x0186;
                case -219282123: goto L_0x0197;
                case 522981735: goto L_0x05a4;
                case 945505374: goto L_0x018e;
                default: goto L_0x0185;
            }
        L_0x0185:
            goto L_0x017c
        L_0x0186:
            java.lang.String r4 = "ۨۖۡۢۙۤ۠ۘ۟ۦۢۚ۠۫ۡۚۨ۟"
            r5 = r4
            goto L_0x003d
        L_0x018b:
            java.lang.String r4 = "ۥۜۥۘۚۨۥۦ۟ۦۘ۟۟۟ۖۚۥۘۦۨۜۘۘ۠ۨۘۦۧۦۦۜۥ"
            goto L_0x017c
        L_0x018e:
            r0 = r43
            r1 = r34
            if (r0 != r1) goto L_0x018b
            java.lang.String r4 = "۟ۛۙۛۧۨۚۡۖۗۘۦۘ۟ۗۡۡۡۦۘۤ"
            goto L_0x017c
        L_0x0197:
            java.lang.String r4 = "۠ۛ۠ۦۛۦ۬ۙۗۢۘۦۛ۫ۡ۟ۨۧۡ۠ۤۤ۬"
            goto L_0x017c
        L_0x019a:
            r5 = -1027323195(0xffffffffc2c44ac5, float:-98.146034)
            java.lang.String r4 = "ۜ۠ۧۨۡۢۜۨۨۘۘۛۛ۠۠ۨۘۦ۟ۘۘ"
        L_0x019f:
            int r40 = r4.hashCode()
            r40 = r40 ^ r5
            switch(r40) {
                case -1645091319: goto L_0x05a4;
                case -1044647118: goto L_0x01b8;
                case -287684651: goto L_0x01b5;
                case 2137271898: goto L_0x01a9;
                default: goto L_0x01a8;
            }
        L_0x01a8:
            goto L_0x019f
        L_0x01a9:
            r0 = r42
            boolean r4 = r0 instanceof android.widget.TextView
            if (r4 == 0) goto L_0x01b2
            java.lang.String r4 = "ۥۢۙۛۥۨۘۢۚۥۗۗۤۤۥۘ۬ۛ۫ۢۡۡ"
            goto L_0x019f
        L_0x01b2:
            java.lang.String r4 = "ۙۛۡۘۛ۟ۖۘۦۢۖۘۘۨۧۡۦ۫ۘۘ"
            goto L_0x019f
        L_0x01b5:
            java.lang.String r4 = "۟ۘۡۘ۠ۚۛۜۛۗۢ۬ۖۡ۟ۥۙ"
            goto L_0x019f
        L_0x01b8:
            java.lang.String r4 = "ۤ۟۫ۘۙۤ۟ۛۜۘۧۘۢۥۥۧۘۨۧ"
            r5 = r4
            goto L_0x003d
        L_0x01bd:
            r5 = -1463402424(0xffffffffa8c64048, float:-2.2010293E-14)
            java.lang.String r4 = "ۡۙۘۜۧۨ۠ۨۨ۫ۤۥۘۘۗ۟ۚۚۡ"
        L_0x01c2:
            int r40 = r4.hashCode()
            r40 = r40 ^ r5
            switch(r40) {
                case -2059117120: goto L_0x059a;
                case -1843510537: goto L_0x01d9;
                case -1502076079: goto L_0x01d6;
                case -5421352: goto L_0x01cc;
                default: goto L_0x01cb;
            }
        L_0x01cb:
            goto L_0x01c2
        L_0x01cc:
            int r4 = f890m
            if (r4 <= 0) goto L_0x01d3
            java.lang.String r4 = "ۙ۟ۥۧۡۧۦۛۙۜۛ۬ۘۘۥۥ۫ۨۘۦ۟ۖ"
            goto L_0x01c2
        L_0x01d3:
            java.lang.String r4 = "ۧۥۗۧۤۚۤۢۗۦ۟ۦۘۧۛۜ"
            goto L_0x01c2
        L_0x01d6:
            java.lang.String r4 = "ۛ۫ۤۤۢۜۤۧۥۤ۫ۖۢۦۙۗۦۦۘ"
            goto L_0x01c2
        L_0x01d9:
            java.lang.String r4 = "ۧۚ۠۠ۨۡ۬ۢۢ۠ۗۚۛ۟ۥۘۨۖۖۡ۬ۜۘ"
            r5 = r4
            goto L_0x003d
        L_0x01de:
            r26 = 0
            java.lang.String r4 = "ۘ۬ۥۗۧ۠ۤۖۖ۬ۘۨۘۤۛۜۘۜۛۥۘۦۘۡۘ۟ۡ۫"
            r5 = r4
            goto L_0x003d
        L_0x01e5:
            java.lang.String r4 = "ۤ۫ۢۧۤ۟۠ۚۘۘۤ۫ۡۘ۫۫ۗ۫۬ۜۦۘۖۘ"
            r5 = r4
            r25 = r26
            goto L_0x003d
        L_0x01ec:
            r24 = 8
            java.lang.String r4 = "ۤ۠ۘۧۘۥۨۦ۠ۥۖۧۨ۬۫ۤۙ۠"
            r5 = r4
            goto L_0x003d
        L_0x01f3:
            java.lang.String r4 = "ۤ۟ۙ۠ۛۡۘ۬ۗۥۥۜ۠ۢۙۥۘۢۤۤ"
            r5 = r4
            r25 = r24
            goto L_0x003d
        L_0x01fa:
            r0 = r42
            r1 = r25
            r0.setVisibility(r1)
            java.lang.String r4 = "ۙۦۡۘۙ۟ۨۤۜۘۘۛۦۦۚۛ۠۟۠ۜ"
            r5 = r4
            goto L_0x003d
        L_0x0206:
            r4 = r42
            android.widget.TextView r4 = (android.widget.TextView) r4
            int r5 = f890m
            long r0 = (long) r5
            r40 = r0
            r0 = r37
            r1 = r40
            java.lang.String r5 = r0.format(r1)
            r4.setText(r5)
            java.lang.String r4 = "ۥ۬ۥ۬۟ۡۘ۟۠ۚۛۡۧۥۨۛۨۧۦۤ۫۠ۛ۟ۚ"
            r5 = r4
            goto L_0x003d
        L_0x021f:
            r5 = 1804826798(0x6b9378ae, float:3.5656398E26)
            java.lang.String r4 = "۬ۦۛۚ۫ۤۥۢۦۘۛ۬۠ۤ۬ۧ"
        L_0x0224:
            int r40 = r4.hashCode()
            r40 = r40 ^ r5
            switch(r40) {
                case -1067046413: goto L_0x0239;
                case -758711301: goto L_0x023c;
                case -341134945: goto L_0x022e;
                case -197949207: goto L_0x05b3;
                default: goto L_0x022d;
            }
        L_0x022d:
            goto L_0x0224
        L_0x022e:
            r4 = 2
            r0 = r43
            if (r0 != r4) goto L_0x0236
            java.lang.String r4 = "ۚۘۡۜۦۗۧۥ۬ۜۥۘۚۚۦۘۡ۠ۢۨۤ۬ۤۘۛ"
            goto L_0x0224
        L_0x0236:
            java.lang.String r4 = "۠ۢۥۘۜۢ۬۬ۘۖۛ۬ۗۖ۠ۨۘ"
            goto L_0x0224
        L_0x0239:
            java.lang.String r4 = "ۖۤۜۧۘۙۦۤۦۙۤۤۨۡۨۘ۫ۤۡۙۗۧ"
            goto L_0x0224
        L_0x023c:
            java.lang.String r4 = "ۢۡۥۘۙۖۖۘۚۚۘۤۤۤۜۘۖۘ۫ۚ۟۟ۖ۟"
            r5 = r4
            goto L_0x003d
        L_0x0241:
            r5 = 1734639335(0x67647ee7, float:1.0790405E24)
            java.lang.String r4 = "ۗۗۨۘۖۛۧۙۨۢۗۤۘ۠ۦ۠ۗۤۗۡ۟ۗۤ۠ۥۙ۟ۖۘ"
        L_0x0246:
            int r40 = r4.hashCode()
            r40 = r40 ^ r5
            switch(r40) {
                case -1923684459: goto L_0x0258;
                case -1588299667: goto L_0x0250;
                case -1269683180: goto L_0x0264;
                case 838013550: goto L_0x0261;
                default: goto L_0x024f;
            }
        L_0x024f:
            goto L_0x0246
        L_0x0250:
            java.lang.String r4 = "ۡۥ۟۟ۢۥ۫۫ۢۜۜۦۘ۠ۘۙ۠ۖۖۘۗۦۖ"
            r5 = r4
            goto L_0x003d
        L_0x0255:
            java.lang.String r4 = "ۥۢ۟ۨۗۖۘۜۡۡۥۧۖۙ۫ۧ"
            goto L_0x0246
        L_0x0258:
            r0 = r42
            boolean r4 = r0 instanceof android.widget.ImageView
            if (r4 == 0) goto L_0x0255
            java.lang.String r4 = "۠ۗ۬۟ۜۚۨۜ۬۫ۥۚ۬ۤۧ۬ۜۘ"
            goto L_0x0246
        L_0x0261:
            java.lang.String r4 = "ۡۖۖۘۙۚۘۦۙ۫ۖۚۗۤۦۦۘۤۜۜۙۥۧۘۖ۫ۚ"
            goto L_0x0246
        L_0x0264:
            java.lang.String r4 = "ۖۦۙۧۢۦۘۗ۬ۦۧۥۘۜ۠ۦۧۨۧۘ"
            r5 = r4
            goto L_0x003d
        L_0x0269:
            r4 = 8
            r0 = r42
            r0.setVisibility(r4)
            java.lang.String r4 = "ۛۙۗۢۘۡۙ۟۫۬ۧۙ۟ۜ۠ۦۜ۫ۘۘۘ"
            r5 = r4
            goto L_0x003d
        L_0x0275:
            r5 = -397276716(0xffffffffe85209d4, float:-3.967513E24)
            java.lang.String r4 = "ۢ۟ۛۢۜۦۢۛۦۘۤۧۧۨۖۗۢۥ۫ۦۚۥ۠ۡۤ"
        L_0x027a:
            int r40 = r4.hashCode()
            r40 = r40 ^ r5
            switch(r40) {
                case -1981209594: goto L_0x0284;
                case -901228444: goto L_0x0293;
                case -780467633: goto L_0x05b3;
                case 1195091176: goto L_0x028a;
                default: goto L_0x0283;
            }
        L_0x0283:
            goto L_0x027a
        L_0x0284:
            java.lang.String r4 = "۟ۗۗ۟۬ۦۘۡۖۧۘۜۚۘۜۘۖۡۡۘۚ۟ۛ۬ۜۢ"
            goto L_0x027a
        L_0x0287:
            java.lang.String r4 = "ۢۦۨۥۤۨۥۗۨ۬ۥۢ۫۟ۤۛۚۖۦۘۘۛ۟ۨۘ"
            goto L_0x027a
        L_0x028a:
            r0 = r42
            boolean r4 = r0 instanceof android.widget.TextView
            if (r4 == 0) goto L_0x0287
            java.lang.String r4 = "ۤۖۦۘ۫ۖۗۗۙۜ۟ۧ۬ۨ۬ۨ"
            goto L_0x027a
        L_0x0293:
            java.lang.String r4 = "۟۬ۘۜۥۜۘۦ۫۬ۚ۠ۤۥ۟۟"
            r5 = r4
            goto L_0x003d
        L_0x0298:
            r5 = -1934392115(0xffffffff8cb384cd, float:-2.7659243E-31)
            java.lang.String r4 = "ۖۙۨۘۢۢۧۨۛۤ۟ۦۘۙۨۙۙۡۛ"
        L_0x029d:
            int r40 = r4.hashCode()
            r40 = r40 ^ r5
            switch(r40) {
                case -1678187189: goto L_0x02a7;
                case 111727375: goto L_0x05a9;
                case 735907116: goto L_0x02b4;
                case 1252366672: goto L_0x02ad;
                default: goto L_0x02a6;
            }
        L_0x02a6:
            goto L_0x029d
        L_0x02a7:
            java.lang.String r4 = "۫ۛۦۘۡۛۚۘ۟ۦۛۗۨۘ۬۠ۥۘۙ۟ۖۘ۟ۤ"
            goto L_0x029d
        L_0x02aa:
            java.lang.String r4 = "ۖۚۤۚۥۢۗۛۚۚۖۙۨۘۥۡۘۦۘۦ۫ۙۦۥۖۥ"
            goto L_0x029d
        L_0x02ad:
            int r4 = f891n
            if (r4 <= 0) goto L_0x02aa
            java.lang.String r4 = "ۜۘۧۙۡۦۚۧۨۚۡۙ۟ۘ۫ۢ۟۫ۗۥۦۘ"
            goto L_0x029d
        L_0x02b4:
            java.lang.String r4 = "۟۬ۙۨۖۥۘۧۢۨۧۨۛ۫ۨۘۥۤۥ۠ۨۘۘ"
            r5 = r4
            goto L_0x003d
        L_0x02b9:
            r23 = 0
            java.lang.String r4 = "۬ۙۡۘۦۗۘۖ۠ۘ۫ۡ۫ۗۛ۫۟ۘۦۘۘۗۖ۠ۥۘۤۦۧ"
            r5 = r4
            goto L_0x003d
        L_0x02c0:
            java.lang.String r4 = "۟۫ۦۘۗۥۨۘۙۢۚۨۡۘ۠ۢۧۡۚۦۤ۠ۦ"
            r5 = r4
            r22 = r23
            goto L_0x003d
        L_0x02c7:
            r21 = 8
            java.lang.String r4 = "ۤ۟ۜۛۗۧۚۦۛۡۛۚۨ۬ۡۜۤۦۘ"
            r5 = r4
            goto L_0x003d
        L_0x02ce:
            java.lang.String r4 = "ۘۦۖۘ۫ۥۨۥ۫ۤۖۜ۟ۥۚۤۤۚۗ"
            r5 = r4
            r22 = r21
            goto L_0x003d
        L_0x02d5:
            r0 = r42
            r1 = r22
            r0.setVisibility(r1)
            java.lang.String r4 = "ۜۙۦۙ۫ۡۘۢۨۧۥۙۜۘ۫۬ۦۘۥۙۦ"
            r5 = r4
            goto L_0x003d
        L_0x02e1:
            r4 = r42
            android.widget.TextView r4 = (android.widget.TextView) r4
            int r5 = f891n
            long r0 = (long) r5
            r40 = r0
            r0 = r37
            r1 = r40
            java.lang.String r5 = r0.format(r1)
            r4.setText(r5)
            java.lang.String r4 = "ۖۦ۟۠ۚۥۜۗۡۘۖۤ۠۟ۥۚۖ۠ۜ۠ۗۡۘ"
            r5 = r4
            goto L_0x003d
        L_0x02fa:
            r5 = -1769705370(0xffffffff96847066, float:-2.1396684E-25)
            java.lang.String r4 = "ۦ۟ۗۡ۫ۥۘۖۧ۬۫ۤۚ۬ۜۥۘۚۥ۠ۡۙۖ"
        L_0x02ff:
            int r40 = r4.hashCode()
            r40 = r40 ^ r5
            switch(r40) {
                case -1681885076: goto L_0x05cc;
                case -1139546885: goto L_0x031a;
                case -749494683: goto L_0x0309;
                case 1135041419: goto L_0x0311;
                default: goto L_0x0308;
            }
        L_0x0308:
            goto L_0x02ff
        L_0x0309:
            java.lang.String r4 = "ۡۗ۫ۘۡ۫ۜۧۡۘۡۥ۬ۗۙۙ"
            r5 = r4
            goto L_0x003d
        L_0x030e:
            java.lang.String r4 = "ۡۘۥۧۧ۠۠ۥۨۘۘۢۘ۠۫ۜۧۘۦۘۢۛ۫ۖ۟ۘ"
            goto L_0x02ff
        L_0x0311:
            r0 = r43
            r1 = r31
            if (r0 != r1) goto L_0x030e
            java.lang.String r4 = "ۡۜ۬۬ۗۛ۠ۡۦۘۡ۬۬ۛ۬ۙۥۖۥۘ"
            goto L_0x02ff
        L_0x031a:
            java.lang.String r4 = "ۜۧۦ۬ۙۢ۬۬ۜۤۡۨ۬ۗۗ"
            goto L_0x02ff
        L_0x031d:
            r5 = 1799614280(0x6b43ef48, float:2.368705E26)
            java.lang.String r4 = "۠ۤۧۤ۫ۦۘۥۘۥ۫۠ۥۧۛۨۘۥۨۦۘۡ۫ۖۘۖۢۡ"
        L_0x0322:
            int r40 = r4.hashCode()
            r40 = r40 ^ r5
            switch(r40) {
                case -1505723994: goto L_0x033b;
                case -726289779: goto L_0x0338;
                case -636213986: goto L_0x032c;
                case 880130613: goto L_0x05cc;
                default: goto L_0x032b;
            }
        L_0x032b:
            goto L_0x0322
        L_0x032c:
            r0 = r42
            boolean r4 = r0 instanceof android.widget.TextView
            if (r4 == 0) goto L_0x0335
            java.lang.String r4 = "۟ۘۖۘ۬ۚۤۤۗۨۘۢۖۖۢۛۘۘۖ۬ۥ۠۬ۜۥۙۥۘ"
            goto L_0x0322
        L_0x0335:
            java.lang.String r4 = "ۢۢۗۢۧۨۘۦۛۜۘ۟ۚۚۨۘ۫۬ۥۘۖۧۘۘۖۤۢ"
            goto L_0x0322
        L_0x0338:
            java.lang.String r4 = "ۢۗۜۘۤ۟ۧۖۜۧۘ۬ۡۘۘۡۗۖۢۢۦ۫ۛۘۖۖۘ۟ۙۥ"
            goto L_0x0322
        L_0x033b:
            java.lang.String r4 = "ۘ۫۠۬۠ۡۦۥۤ۫ۚۧ۠۟۫"
            r5 = r4
            goto L_0x003d
        L_0x0340:
            r5 = -1075650930(0xffffffffbfe2de8e, float:-1.7724168)
            java.lang.String r4 = "ۨ۫۫ۧۤۘۨ۟ۖۨۖۗۛۙۗ"
        L_0x0345:
            int r40 = r4.hashCode()
            r40 = r40 ^ r5
            switch(r40) {
                case -1577602052: goto L_0x05b8;
                case -870178078: goto L_0x035e;
                case 590072534: goto L_0x034f;
                case 772598258: goto L_0x0357;
                default: goto L_0x034e;
            }
        L_0x034e:
            goto L_0x0345
        L_0x034f:
            java.lang.String r4 = "ۡۛ۫ۥۦۜۙۚۛۖۢ۬ۗۘۘۘۜۜ۟ۗۧۖ"
            r5 = r4
            goto L_0x003d
        L_0x0354:
            java.lang.String r4 = "ۜ۟۫ۘۥۡۘ۫۫ۡۖۛۥۦۦۗۡۗۨۘ"
            goto L_0x0345
        L_0x0357:
            int r4 = f892o
            if (r4 <= 0) goto L_0x0354
            java.lang.String r4 = "ۦۛۦ۫ۧۚ۟۫۫ۛۥۥۘۢۚۡۤۦۨ"
            goto L_0x0345
        L_0x035e:
            java.lang.String r4 = "ۙۢۡۘۧۚ۫ۘۥ۬۫ۘۛ۬ۥۘ"
            goto L_0x0345
        L_0x0361:
            r20 = 1
            java.lang.String r4 = "ۖۚۚۦ۠ۚ۠ۨۡۘۜ۫ۢۢۛۥ۠ۧۛ"
            r5 = r4
            goto L_0x003d
        L_0x0368:
            java.lang.String r4 = "ۜ۫ۦۘ۬۫ۥۘۚۙۡۘ۟ۘۜۘۦۦ۠ۚۢۤ"
            r5 = r4
            r19 = r20
            goto L_0x003d
        L_0x036f:
            r18 = 0
            java.lang.String r4 = "۬ۗۤۖۜۦ۫ۖۘ۟ۜۚۙۤۥۘۛۤۦۦۨۖۙۘۛ"
            r5 = r4
            goto L_0x003d
        L_0x0376:
            java.lang.String r4 = "ۙۘۡۘۧ۫ۛۘ۫ۗۛۛۖۘۗۙۨۘ۟ۦۦۘۖۘۙ"
            r5 = r4
            r19 = r18
            goto L_0x003d
        L_0x037d:
            r4 = 8
            r0 = r42
            r0.setVisibility(r4)
            java.lang.String r4 = "ۖۡۨۘۨۘ۫۫۟ۡۤۗۛۡۖ۠"
            r5 = r4
            goto L_0x003d
        L_0x0389:
            android.view.ViewParent r4 = r42.getParent()
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            r5 = 2
            android.view.View r4 = r4.getChildAt(r5)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            java.lang.String r5 = "ۙۡۡۡۥۨۘۘۥۖ۟ۜۛۡۛۢۢۖۥۚۖۘۘ"
            r17 = r4
            goto L_0x003d
        L_0x039c:
            r5 = -629469428(0xffffffffda7b0f0c, float:-1.76666908E16)
            java.lang.String r4 = "ۛ۫۫ۜۚۧ۫ۖۦ۠ۨۡ۟ۛۨ"
        L_0x03a1:
            int r40 = r4.hashCode()
            r40 = r40 ^ r5
            switch(r40) {
                case -1401561414: goto L_0x03b3;
                case -485421977: goto L_0x05c2;
                case -34615907: goto L_0x03b6;
                case 1582516684: goto L_0x03ab;
                default: goto L_0x03aa;
            }
        L_0x03aa:
            goto L_0x03a1
        L_0x03ab:
            if (r19 == 0) goto L_0x03b0
            java.lang.String r4 = "ۨ۠ۨۘۡ۫ۛۦۖۜ۫ۦۢۧۥۘ"
            goto L_0x03a1
        L_0x03b0:
            java.lang.String r4 = "ۖۘۡۘۡۜۥۤۡۤۤۢۢ۫۟ۖۘۙۜۦ۠۫ۡۗۦۢۡۚ۠"
            goto L_0x03a1
        L_0x03b3:
            java.lang.String r4 = "ۡۤ۫ۦۗ۬ۧۢۧۙۡۘۥۗۨۘۗۥۥ۬۠ۦۢ۟"
            goto L_0x03a1
        L_0x03b6:
            java.lang.String r4 = "۫۠ۦۘۛۨۧ۬ۖۥ۟ۥۡۚۡۜۘۡۙ۬۫ۘ۫ۚ۟ۨ"
            r5 = r4
            goto L_0x003d
        L_0x03bb:
            r16 = 0
            java.lang.String r4 = "ۘۧۦۘۖ۬ۡۦۚۘۘۡۢۜۘۤۜ۫ۨۚ"
            r5 = r4
            goto L_0x003d
        L_0x03c2:
            java.lang.String r4 = "ۜۨ۬ۖۢۖۘ۠ۢۗۜ۟ۧ۟۠ۚ"
            r5 = r4
            r15 = r16
            goto L_0x003d
        L_0x03c9:
            r14 = 8
            java.lang.String r4 = "۠۠ۥۥۗ۫ۥۤۢۤ۠۟ۤۨ۬ۥۧۘۖۚۨ"
            r5 = r4
            goto L_0x003d
        L_0x03d0:
            java.lang.String r4 = "ۡۨۙۙ۠ۡۢ۟ۧۨۧۘ۠ۚۙ"
            r5 = r4
            r15 = r14
            goto L_0x003d
        L_0x03d6:
            r0 = r17
            r0.setVisibility(r15)
            java.lang.String r4 = "ۨۖۜۚۙۖۘۤۛۘۨۗ۠ۦۧۦۘۡۜۗ"
            r5 = r4
            goto L_0x003d
        L_0x03e0:
            r5 = -369600830(0xffffffffe9f856c2, float:-3.7527913E25)
            java.lang.String r4 = "ۚۖۦۗۙۙۥ۠ۛۢ۬۟ۦۦۘۨۙۘۦۚۨۘ"
        L_0x03e5:
            int r40 = r4.hashCode()
            r40 = r40 ^ r5
            switch(r40) {
                case -1760497353: goto L_0x03fa;
                case -1678950610: goto L_0x03ef;
                case -1491765663: goto L_0x05cc;
                case 1758811159: goto L_0x03f5;
                default: goto L_0x03ee;
            }
        L_0x03ee:
            goto L_0x03e5
        L_0x03ef:
            java.lang.String r4 = "ۙۦۦۘۛۨۥۖۛۨۘ۫ۧۘۘۨۜۥۘۥۚۦۜۚ۟۟ۜۡۘ"
            goto L_0x03e5
        L_0x03f2:
            java.lang.String r4 = "ۙ۠ۨۤۘۨۜۡۢۖۚۚۖ۫ۖۘۖ۫ۖ۫ۜۤۦۘۜۘ"
            goto L_0x03e5
        L_0x03f5:
            if (r19 == 0) goto L_0x03f2
            java.lang.String r4 = "ۦ۠ۛۤۙۨۘۢۖۡۖۘۦۦۙۘۘ۬ۘۗۚۚۧ"
            goto L_0x03e5
        L_0x03fa:
            java.lang.String r4 = "ۜۧۧ۫ۨۘۘۨۤۜ۬ۢۜۘۙۘۦۗۛۗ۟ۥۘۧۧۨ"
            r5 = r4
            goto L_0x003d
        L_0x03ff:
            r4 = -14150262947265(0xfffff321629a823f, double:NaN)
            java.lang.String r4 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r4)
            r40 = -14240457260481(0xfffff30c629a823f, double:NaN)
            java.lang.String r5 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r40)
            int r4 = com.obwhatsapp.yo.yo.getID(r4, r5)
            r0 = r17
            r0.setImageResource(r4)
            java.lang.String r4 = "ۧۥۜۦ۠ۚۤ۫ۨۗۧۧۜۢۙ۟ۖۘۘۦۥۘۖ۫ۡ"
            r5 = r4
            goto L_0x003d
        L_0x041f:
            r4 = 1056964608(0x3f000000, float:0.5)
            r0 = r17
            r0.setAlpha(r4)
            java.lang.String r4 = "ۚۛۦۙۡۙ۫۬ۨۘ۟ۗۨۘۙ۬ۡۘ۬ۜۥۘۧۤۧۧۙۚۘۨۜۘ"
            r5 = r4
            goto L_0x003d
        L_0x042b:
            android.view.ViewGroup$LayoutParams r4 = r17.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r4 = (android.view.ViewGroup.MarginLayoutParams) r4
            java.lang.String r5 = "ۘ۫ۘۘ۫۟ۡ۫ۥۛۘۢۨۙۢۖۛۘۧۘ"
            r13 = r4
            goto L_0x003d
        L_0x0436:
            r4 = 5
            int r4 = com.obwhatsapp.youbasha.task.utils.dimenInDP(r4)
            r13.setMarginStart(r4)
            java.lang.String r4 = "۫ۖۨۨۗۘۘۗۗۘۘۙۙ۠ۘۥۖۥۗ۬ۘۛۘ"
            r5 = r4
            goto L_0x003d
        L_0x0443:
            r0 = r17
            r0.setLayoutParams(r13)
            java.lang.String r4 = "ۜۨۜۘۥۧۦ۠ۘۖۢۡۦۘۡۥۗ۟ۚۦ"
            r5 = r4
            goto L_0x003d
        L_0x044d:
            r5 = -2049751171(0xffffffff85d3477d, float:-1.9868605E-35)
            java.lang.String r4 = "ۘ۟ۥۦۛۘۘۘۡ۠۟ۥۘۘ۟۠ۤ۠ۙۨ۟۠ۤۤۦۖ"
        L_0x0452:
            int r40 = r4.hashCode()
            r40 = r40 ^ r5
            switch(r40) {
                case 313898138: goto L_0x045c;
                case 434546430: goto L_0x046b;
                case 1100038601: goto L_0x0468;
                case 1886877436: goto L_0x047f;
                default: goto L_0x045b;
            }
        L_0x045b:
            goto L_0x0452
        L_0x045c:
            r0 = r43
            r1 = r28
            if (r0 != r1) goto L_0x0465
            java.lang.String r4 = "۫ۦۡ۬ۜۡۘ۠ۗ۠ۘۦۚ۬ۤ۫۟ۛۖۘۗۨۦ"
            goto L_0x0452
        L_0x0465:
            java.lang.String r4 = "ۙۖۡۛۙۦۧۙۛۡۖۨۗۖۡ۠۫۠"
            goto L_0x0452
        L_0x0468:
            java.lang.String r4 = "۫ۚۙۜۥ۠ۨۧۘۘ۠ۖۡۘۚۤۜۘۨۥۤ۫۬ۥ۬۬۟"
            goto L_0x0452
        L_0x046b:
            java.lang.String r4 = "ۤۧۨۢ۠ۨۘۜۢۨۘ۟۠ۘۘ۟ۘۥۘۚۤۢۢۗۦۘ"
            r5 = r4
            goto L_0x003d
        L_0x0470:
            r5 = -1256834674(0xffffffffb516398e, float:-5.596311E-7)
            java.lang.String r4 = "۫ۥۛ۟ۦۥۘۦۚۚۗۧۛۖ۫ۢ"
        L_0x0475:
            int r40 = r4.hashCode()
            r40 = r40 ^ r5
            switch(r40) {
                case -1831426943: goto L_0x0493;
                case 706379207: goto L_0x0490;
                case 775210069: goto L_0x047f;
                case 2086083043: goto L_0x0487;
                default: goto L_0x047e;
            }
        L_0x047e:
            goto L_0x0475
        L_0x047f:
            java.lang.String r4 = "ۥ۟ۦۘ۟ۨۦۚۙ۟ۖ۟۬ۤ۫ۖۘۢ۟ۢۛۜۨۘۡۘۡۘ"
            r5 = r4
            goto L_0x003d
        L_0x0484:
            java.lang.String r4 = "۬ۦ۫۟ۢۛۛۘ۫ۤۨۧ۫ۡۖۚ۫ۖۜ"
            goto L_0x0475
        L_0x0487:
            r0 = r42
            boolean r4 = r0 instanceof android.widget.TextView
            if (r4 == 0) goto L_0x0484
            java.lang.String r4 = "ۧۡۜۘۗۘۨۧۗۢۡۛ۠۫ۛۜۛ۫۬ۘۦ۬"
            goto L_0x0475
        L_0x0490:
            java.lang.String r4 = "ۜۜۧۘۙۘۥۤۡۡۘۧ۬ۦۢۨۧۘ"
            goto L_0x0475
        L_0x0493:
            java.lang.String r4 = "ۨ۫ۗۗۦ۟ۖ۟ۛۙۥۜۘۡ۬ۚ"
            r5 = r4
            goto L_0x003d
        L_0x0498:
            r5 = -1192133496(0xffffffffb8f17c88, float:-1.1514971E-4)
            java.lang.String r4 = "ۤۙۥۥ۠ۖۦ۠ۡۖ۟ۦۘ۫ۥۚ۠ۦۦۢ۠"
        L_0x049d:
            int r40 = r4.hashCode()
            r40 = r40 ^ r5
            switch(r40) {
                case -1909934899: goto L_0x05d1;
                case -1551822115: goto L_0x04af;
                case 1573627098: goto L_0x04b6;
                case 1708445457: goto L_0x04a7;
                default: goto L_0x04a6;
            }
        L_0x04a6:
            goto L_0x049d
        L_0x04a7:
            java.lang.String r4 = "۬۬ۜۘ۫ۙ۬ۨۗ۟۬ۖۦۨۖ۫ۜۤۖ"
            r5 = r4
            goto L_0x003d
        L_0x04ac:
            java.lang.String r4 = "ۙۥۦۥۢۙۙۗۦۨۡۙ۬ۥۦۘ"
            goto L_0x049d
        L_0x04af:
            int r4 = f893p
            if (r4 <= 0) goto L_0x04ac
            java.lang.String r4 = "ۤۧۦۘۚۚۢۛ۠۟ۙۛۜۘۜۦۨۘ۬۟ۙۚۡۜۘ۟۟ۖ"
            goto L_0x049d
        L_0x04b6:
            java.lang.String r4 = "۬ۨۖۘۧۙۥ۬ۘۢۢۘ۠ۥۧۖۘۛ۠ۡۘۙۦۘۘۙۥۛ"
            goto L_0x049d
        L_0x04b9:
            java.lang.String r4 = "۟ۗۥ۬ۛۗۤۢۡۜ۫ۡۨۧۦۘۢۤۗۧۛۜۥۥۡۘ"
            r5 = r4
            r11 = r12
            goto L_0x003d
        L_0x04bf:
            r10 = 0
            java.lang.String r4 = "ۢۘۥۘۡ۬ۖۘۥۢ۬ۛۥ۫ۢۚۥۧۚ۬ۘۦۘ"
            r5 = r4
            goto L_0x003d
        L_0x04c5:
            java.lang.String r4 = "ۜ۫ۖۙۖ۠۟ۦۧۖۡ۟ۜ۠ۧۗۜۚ"
            r5 = r4
            r11 = r10
            goto L_0x003d
        L_0x04cb:
            r5 = -1216708124(0xffffffffb77a81e4, float:-1.4931404E-5)
            java.lang.String r4 = "ۥ۫ۨۘۘۛۧ۠۫ۥ۠۫ۧۜۘ۠ۛ۟ۖۘ"
        L_0x04d0:
            int r40 = r4.hashCode()
            r40 = r40 ^ r5
            switch(r40) {
                case -998683102: goto L_0x04e2;
                case -992796643: goto L_0x05db;
                case -841314204: goto L_0x04e5;
                case 2022226366: goto L_0x04da;
                default: goto L_0x04d9;
            }
        L_0x04d9:
            goto L_0x04d0
        L_0x04da:
            if (r11 == 0) goto L_0x04df
            java.lang.String r4 = "ۥۦۜۛۤ۠ۜ۠ۘۗۜۤ۟ۢۛ۠ۜۘۥۘۨ۟ۛ"
            goto L_0x04d0
        L_0x04df:
            java.lang.String r4 = "ۚۤ۟ۗ۠۠ۡۨۢۥۤۜۙۢۡۡۘۘۙۥ"
            goto L_0x04d0
        L_0x04e2:
            java.lang.String r4 = "ۤۥ۬۫ۘۘ۟ۧۡۘۥۥۖۥۧۘۘۢۢۥۘۛ۟ۥ۠ۜۜۘ۫۟ۡ"
            goto L_0x04d0
        L_0x04e5:
            java.lang.String r4 = "ۡۨۖۡۡۦۘۙۘۥۥۖۡۘۛ۟ۦ"
            r5 = r4
            goto L_0x003d
        L_0x04ea:
            java.lang.String r4 = "ۛۗۗۦۖۙۥۙۘۥۨۢۖۙۖۘ۫ۙۜۙۦۦۘ۬ۦۜۖ۬ۢ"
            r5 = r4
            r8 = r9
            goto L_0x003d
        L_0x04f0:
            r7 = 8
            java.lang.String r4 = "ۨۚۢۘۛ۫۫ۛۗ۫ۧۛۥۥۜۡۚۨۘۦ۬ۡۘۦ۬ۧۘۙ"
            r5 = r4
            goto L_0x003d
        L_0x04f7:
            java.lang.String r4 = "ۧ۠ۡ۟ۢۜۘۖ۬ۘۦۚ۫ۛۥۨۘ۠۠ۜۘۢۙۨۘۙۤ۟"
            r5 = r4
            r8 = r7
            goto L_0x003d
        L_0x04fd:
            r0 = r42
            r0.setVisibility(r8)
            java.lang.String r4 = "۟ۨۢۗۚۡۘ۬ۢۚۗۥۖۘۡۜۘ۟ۘۢۖۖۘ"
            r5 = r4
            goto L_0x003d
        L_0x0507:
            r5 = 1965235447(0x75231cf7, float:2.0677047E32)
            java.lang.String r4 = "ۙۙۘۘۡۛۥۘۖ۠ۜ۫ۨۛۘۨۗۦۤۥۜۢۨ"
        L_0x050c:
            int r40 = r4.hashCode()
            r40 = r40 ^ r5
            switch(r40) {
                case -990111418: goto L_0x047f;
                case -133808549: goto L_0x051e;
                case 597465246: goto L_0x0516;
                case 1173273650: goto L_0x0521;
                default: goto L_0x0515;
            }
        L_0x0515:
            goto L_0x050c
        L_0x0516:
            if (r11 == 0) goto L_0x051b
            java.lang.String r4 = "ۚۘۖۧۨۢۢۜۦۖ۟ۜۘۜ۫۫ۚۖۗۛۤ۠۟ۖۨۘۥۚ"
            goto L_0x050c
        L_0x051b:
            java.lang.String r4 = "ۡۖۚ۟ۘۘۜۧۘۧۗۗۙ۠ۨۨۙۧۡ۟ۘ"
            goto L_0x050c
        L_0x051e:
            java.lang.String r4 = "ۨ۫ۘۘۖ۬ۨۥۘۦۤۚۤۡ۫ۛۜۨۘ"
            goto L_0x050c
        L_0x0521:
            java.lang.String r4 = "ۗۢ۠ۦ۠ۦ۬ۢۘۘۜۢۗۡۘ۫"
            r5 = r4
            goto L_0x003d
        L_0x0526:
            r4 = r42
            android.widget.TextView r4 = (android.widget.TextView) r4
            int r5 = f893p
            long r0 = (long) r5
            r40 = r0
            r0 = r37
            r1 = r40
            java.lang.String r5 = r0.format(r1)
            r4.setText(r5)
            java.lang.String r4 = "ۥ۟ۦۘ۟ۨۦۚۙ۟ۖ۟۬ۤ۫ۖۘۢ۟ۢۛۜۨۘۡۘۡۘ"
            r5 = r4
            goto L_0x003d
        L_0x053f:
            r5 = 844087129(0x324fbf59, float:1.2092493E-8)
            java.lang.String r4 = "ۥۖۡۛۜۦ۫ۚۡۗ۬۫ۚۨۨۨۢ۠۬۬ۦۘۧۖۧۨۧۨ"
        L_0x0544:
            int r40 = r4.hashCode()
            r40 = r40 ^ r5
            switch(r40) {
                case -1530140559: goto L_0x055d;
                case -830681039: goto L_0x0554;
                case -305042808: goto L_0x05e5;
                case 847207993: goto L_0x054e;
                default: goto L_0x054d;
            }
        L_0x054d:
            goto L_0x0544
        L_0x054e:
            java.lang.String r4 = "ۖ۬۫۬ۥۨۘۜۨۡۜ۠ۖۘۚ۫ۡۧۥۜۥۨۙ۟ۨۜ"
            goto L_0x0544
        L_0x0551:
            java.lang.String r4 = "ۥۖۖۘ۫۠ۨۘۥۙۚۚۡۥ۬ۤ۠ۥۘۜ"
            goto L_0x0544
        L_0x0554:
            com.obwhatsapp.HomeActivity r4 = com.obwhatsapp.yo.yo.Homeac
            android.view.View r4 = r4.yoBottomBarView
            if (r4 == 0) goto L_0x0551
            java.lang.String r4 = "ۛۨۦۘۦ۫ۧۨۧۥۘۦۤ۟ۜۖۖۗ۬ۥ"
            goto L_0x0544
        L_0x055d:
            java.lang.String r4 = "۠ۨ۫ۙ۫ۧۖۚۖۘۤ۫ۤۦۛ۫ۨۡۧۗ۠ۘ"
            r5 = r4
            goto L_0x003d
        L_0x0562:
            int r6 = Tab_Index_Corrector(r43)
            java.lang.String r4 = "ۢۙ۫ۡۨۘۗۙۗۥۡۢۚۜ۟ۥ۫۬ۘۧ"
            r5 = r4
            goto L_0x003d
        L_0x056b:
            com.obwhatsapp.HomeActivity r4 = com.obwhatsapp.yo.yo.Homeac
            android.view.View r4 = r4.yoBottomBarView
            com.obwhatsapp.youbasha.ui.views.IBottomNavigation r4 = (com.obwhatsapp.youbasha.ui.views.IBottomNavigation) r4
            int r5 = getUnreadForThisTab(r6)
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r4.setBadgeValue(r6, r5)
            java.lang.String r4 = "ۨۜۡۘۜۤۨۦۘۖۡۢۤۢۜۘۘ"
            r5 = r4
            goto L_0x003d
        L_0x0581:
            java.lang.String r4 = "ۨۢۦۘۧ۟۠ۤۧۥۚۘۙۢ۟۟۠ۚۦۗ۟ۡۘۛۤ۬"
            r5 = r4
            goto L_0x003d
        L_0x0586:
            java.lang.String r4 = "۟ۦۢۢۢۦۘۘۦۖۘۙۦ۟ۥۡۥۘ"
            r5 = r4
            goto L_0x003d
        L_0x058b:
            java.lang.String r4 = "ۛۢۜۥۡۚۧۗۧۡۚۦۘۡۖۘ۟ۘۜۘۛۖۡ"
            r5 = r4
            goto L_0x003d
        L_0x0590:
            java.lang.String r4 = "ۘ۟ۙۘۙۥۘۥ۠ۛ۫ۧۛۤۛۖ"
            r5 = r4
            goto L_0x003d
        L_0x0595:
            java.lang.String r4 = "ۚۧۘۘۖۘۧۘۢۨۘۛۘۚۙ۟ۜۘۧۡۖۢۢۖۘۘۦۗ"
            r5 = r4
            goto L_0x003d
        L_0x059a:
            java.lang.String r4 = "ۧۚۡۘۦۙۖۘۜۛۚۛۘۨۘۡ۫ۥۘۖۢۥۘ"
            r5 = r4
            goto L_0x003d
        L_0x059f:
            java.lang.String r4 = "ۤ۟ۙ۠ۛۡۘ۬ۗۥۥۜ۠ۢۙۥۘۢۤۤ"
            r5 = r4
            goto L_0x003d
        L_0x05a4:
            java.lang.String r4 = "ۥ۬ۥ۬۟ۡۘ۟۠ۚۛۡۧۥۨۛۨۧۦۤ۫۠ۛ۟ۚ"
            r5 = r4
            goto L_0x003d
        L_0x05a9:
            java.lang.String r4 = "ۙ۫ۙۚۗۘۗ۠ۖۘ۠۠ۡۘ۠ۦۛۤۨۦۘ"
            r5 = r4
            goto L_0x003d
        L_0x05ae:
            java.lang.String r4 = "ۘۦۖۘ۫ۥۨۥ۫ۤۖۜ۟ۥۚۤۤۚۗ"
            r5 = r4
            goto L_0x003d
        L_0x05b3:
            java.lang.String r4 = "ۖۦ۟۠ۚۥۜۗۡۘۖۤ۠۟ۥۚۖ۠ۜ۠ۗۡۘ"
            r5 = r4
            goto L_0x003d
        L_0x05b8:
            java.lang.String r4 = "۫ۙۖۤۙ۬ۗ۟ۡۘۗ۬ۘ۫ۜۖۨۧۘ"
            r5 = r4
            goto L_0x003d
        L_0x05bd:
            java.lang.String r4 = "ۙۘۡۘۧ۫ۛۘ۫ۗۛۛۖۘۗۙۨۘ۟ۦۦۘۖۘۙ"
            r5 = r4
            goto L_0x003d
        L_0x05c2:
            java.lang.String r4 = "ۨۤۦۦ۬ۜ۠ۛۘۘۡۦۥۢۤۦۘ۟۠۫ۤ۟ۢۚۡۢۙ۟ۜ"
            r5 = r4
            goto L_0x003d
        L_0x05c7:
            java.lang.String r4 = "ۡۨۙۙ۠ۡۢ۟ۧۨۧۘ۠ۚۙ"
            r5 = r4
            goto L_0x003d
        L_0x05cc:
            java.lang.String r4 = "ۜۨۜۘۥۧۦ۠ۘۖۢۡۦۘۡۥۗ۟ۚۦ"
            r5 = r4
            goto L_0x003d
        L_0x05d1:
            java.lang.String r4 = "ۥۛۚۨۘۜۙۚۛۘ۫ۥۨۜۢ"
            r5 = r4
            goto L_0x003d
        L_0x05d6:
            java.lang.String r4 = "ۜ۫ۖۙۖ۠۟ۦۧۖۡ۟ۜ۠ۧۗۜۚ"
            r5 = r4
            goto L_0x003d
        L_0x05db:
            java.lang.String r4 = "ۚۤ۟ۧۗۗۧۤۥۥۨۥۘۚۙ۠ۚۙۤ"
            r5 = r4
            goto L_0x003d
        L_0x05e0:
            java.lang.String r4 = "ۧ۠ۡ۟ۢۜۘۖ۬ۘۦۚ۫ۛۥۨۘ۠۠ۜۘۢۙۨۘۙۤ۟"
            r5 = r4
            goto L_0x003d
        L_0x05e5:
            java.lang.String r4 = "ۨۜۡۘۜۤۨۦۘۖۡۢۤۢۜۘۘ"
            r5 = r4
            goto L_0x003d
        L_0x05ea:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.u1.setTabUnread(android.view.View, int, int):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void setTabUnreadCount(int r6, int r7) {
        /*
            r2 = 0
            java.lang.String r0 = "ۙۖۘۙۘۜۘۘ۟ۨۘۙۡۘ۬ۤۘۦ۬"
            r1 = r2
            r3 = r2
        L_0x0005:
            int r2 = r0.hashCode()
            r4 = 788(0x314, float:1.104E-42)
            r5 = -1455912414(0xffffffffa9388a22, float:-4.097602E-14)
            r2 = r2 ^ r4
            r2 = r2 ^ r5
            switch(r2) {
                case -1981198251: goto L_0x0014;
                case -1714935877: goto L_0x001a;
                case -1607069375: goto L_0x0073;
                case -715488597: goto L_0x002b;
                case -469258122: goto L_0x006b;
                case 42677824: goto L_0x0023;
                case 668776111: goto L_0x005a;
                case 938048451: goto L_0x0017;
                case 1683935321: goto L_0x004c;
                case 1789656133: goto L_0x0047;
                default: goto L_0x0013;
            }
        L_0x0013:
            goto L_0x0005
        L_0x0014:
            java.lang.String r0 = "ۙۗۜۧۛ۬۠ۛۨۘۡۖۧۢۥۖۤۡ۠ۙۘ۟ۘ"
            goto L_0x0005
        L_0x0017:
            java.lang.String r0 = "ۚ۠ۨۚۗۢۡۥۨۘۖۜۘۚۡۡۘۦ۫۠ۤۥۨۘۘۜۤ"
            goto L_0x0005
        L_0x001a:
            r0 = 2
            int r2 = Tab_Index_Corrector(r0)
            java.lang.String r0 = "۫ۖۚۛۡۘۘ۫ۖۛۨ۠ۨۡۢ"
            r3 = r2
            goto L_0x0005
        L_0x0023:
            r0 = 3
            int r1 = Tab_Index_Corrector(r0)
            java.lang.String r0 = "۫ۗ۠۬ۦۥ۟ۦ۫۠ۢۗۥۖۘۘۡۜۡۙۧۖۘ"
            goto L_0x0005
        L_0x002b:
            r2 = 1251807098(0x4a9d0f7a, float:5146557.0)
            java.lang.String r0 = "ۛۖۨۘۦ۠ۡۘۥۘۘ۟ۤۛۧ۟ۗۢ۟ۧۤۤۛ"
        L_0x0030:
            int r4 = r0.hashCode()
            r4 = r4 ^ r2
            switch(r4) {
                case -903025387: goto L_0x0039;
                case -868413063: goto L_0x003f;
                case 566936410: goto L_0x0070;
                case 1051789427: goto L_0x0044;
                default: goto L_0x0038;
            }
        L_0x0038:
            goto L_0x0030
        L_0x0039:
            java.lang.String r0 = "۬ۗۘ۟ۦۤۙۜۦۘ۟ۚ۠ۛۙ۬ۢۜۥۘۦۦۢۙۙۚ"
            goto L_0x0005
        L_0x003c:
            java.lang.String r0 = "۫ۗۡۨۖۜۘ۠ۜۡۘ۬ۤۨۗ۟ۦ"
            goto L_0x0030
        L_0x003f:
            if (r6 != r3) goto L_0x003c
            java.lang.String r0 = "۫ۖۨۘۨۧۥۗۙۦۘۥ۫ۙۖۨۘۨۥۘ"
            goto L_0x0030
        L_0x0044:
            java.lang.String r0 = "ۘۥۦۘ۠ۗۡۘ۟ۖۥۘۤ۠ۢۖۨۛ۫ۙۛۦ۬۫ۡۗۗ"
            goto L_0x0030
        L_0x0047:
            f892o = r7
            java.lang.String r0 = "ۧۡۖۘ۫ۧۡۘ۫ۡۖۘۨ۠ۢ۬۬ۜ"
            goto L_0x0005
        L_0x004c:
            r2 = -1469561046(0xffffffffa868472a, float:-1.2894018E-14)
            java.lang.String r0 = "۬ۦۚۜۜۧۘ۬ۧۖۗۦۦۚۙۗۙۜۛۚۚۤۤۖۘۗۛۗ"
        L_0x0051:
            int r4 = r0.hashCode()
            r4 = r4 ^ r2
            switch(r4) {
                case -1204301148: goto L_0x0065;
                case -841987615: goto L_0x005a;
                case -418484310: goto L_0x0068;
                case 45723950: goto L_0x0060;
                default: goto L_0x0059;
            }
        L_0x0059:
            goto L_0x0051
        L_0x005a:
            java.lang.String r0 = "ۦۢۧ۬ۦۘۨۗۚ۟ۚۚۤۜۖ"
            goto L_0x0005
        L_0x005d:
            java.lang.String r0 = "۠۟ۘۛۥۗۗۙۘۘۛ۫ۛۗ۬ۦ۠۠ۘۜۥۡۘۧۚۜۘ"
            goto L_0x0051
        L_0x0060:
            if (r6 != r1) goto L_0x005d
            java.lang.String r0 = "ۢۖۜۤۤۜۘۤۡۨۘۨۥۡۥۡۘۧۛۢۦ۟۬"
            goto L_0x0051
        L_0x0065:
            java.lang.String r0 = "۬۬ۥۘ۠۫ۦۘۛۥۧۘ۟ۙۨۢۚۖۘۙۜۘۘ"
            goto L_0x0051
        L_0x0068:
            java.lang.String r0 = "ۛۚۙۛ۟ۨۘ۟ۡۜۘۢۜۘۘ۬ۚۙ۬ۛۖۙ۠ۙۨۘۘۘ"
            goto L_0x0005
        L_0x006b:
            f893p = r7
            java.lang.String r0 = "ۦۢۧ۬ۦۘۨۗۚ۟ۚۚۤۜۖ"
            goto L_0x0005
        L_0x0070:
            java.lang.String r0 = "ۛۘۘۥۖۘۥ۫ۙۡۚۚ۠ۥۜۘۤۛ۬۠۟ۖۘ۠ۡ۫"
            goto L_0x0005
        L_0x0073:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.u1.setTabUnreadCount(int, int):void");
    }

    public static void setUpdateURLOLD() {
        String str = "ۚۤۗۖۛۨۘۚۜۡۘۥ۫ۢۢۡۦۘۚ۫۟";
        while (true) {
            switch ((str.hashCode() ^ 142) ^ -1030772372) {
                case -2061048237:
                    return;
                case -1945824034:
                    z0.f926j = f889l.toLowerCase(Locale.ENGLISH).replace(Deobfuscator$app$Custom.getString(-17092315545025L), Deobfuscator$app$Custom.getString(-17100905479617L)).replace(Deobfuscator$app$Custom.getString(-17109495414209L), Deobfuscator$app$Custom.getString(-17118085348801L)).replace(Deobfuscator$app$Custom.getString(-17126675283393L), Deobfuscator$app$Custom.getString(-17135265217985L)).trim();
                    str = "ۘ۟۬ۙۛۦ۬ۢۧۡ۫ۢۤۧۥ۬ۨۜ۟۬ۢ";
                    break;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void unreadCh(X.C15830rv r4, int r5) {
        /*
            java.lang.String r0 = "ۗۧۜۧ۬۬ۘ۟ۚۥۢۖ۠ۥۥۘۘۨۗۘۘۥ۬۬"
        L_0x0002:
            int r1 = r0.hashCode()
            r2 = 52
            r3 = -194845878(0xfffffffff462e34a, float:-7.190363E31)
            r1 = r1 ^ r2
            r1 = r1 ^ r3
            switch(r1) {
                case -1920150217: goto L_0x0033;
                case -559266592: goto L_0x0017;
                case -392762101: goto L_0x006f;
                case 237511598: goto L_0x006c;
                case 981099014: goto L_0x0057;
                case 1009960033: goto L_0x0014;
                case 1282609833: goto L_0x0011;
                case 1435395052: goto L_0x0060;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0002
        L_0x0011:
            java.lang.String r0 = "ۢۖ۟ۗ۫ۧ۬ۗ۟۠۬ۖۘۙۘۘ"
            goto L_0x0002
        L_0x0014:
            java.lang.String r0 = "۟ۦۨۘۚۡ۟ۛۢۖ۫ۗۖۘۥۢۗ"
            goto L_0x0002
        L_0x0017:
            r1 = -402566492(0xffffffffe80152a4, float:-2.442839E24)
            java.lang.String r0 = "ۨ۫ۥۘ۬ۗۖۖۢۢ۫ۧۡۘۨۗ۟ۜ۫ۗ"
        L_0x001c:
            int r2 = r0.hashCode()
            r2 = r2 ^ r1
            switch(r2) {
                case -899970264: goto L_0x002b;
                case 961645886: goto L_0x0030;
                case 1277477036: goto L_0x006c;
                case 1850715675: goto L_0x0025;
                default: goto L_0x0024;
            }
        L_0x0024:
            goto L_0x001c
        L_0x0025:
            java.lang.String r0 = "ۘۛۛۧ۟ۙ۟ۜ۠۟۠۟ۙۘۙۤۜۚۨۛۤۡ۬ۙ"
            goto L_0x0002
        L_0x0028:
            java.lang.String r0 = "ۦ۟ۘۤۡۡ۫ۡۘۢۥۦۘۘۦۙۖۤۙۖۢۦ"
            goto L_0x001c
        L_0x002b:
            if (r5 == 0) goto L_0x0028
            java.lang.String r0 = "ۢۧۗۨۚ۟ۥۛۘۘۢۨۙۢ۬۠ۤ۬ۖ"
            goto L_0x001c
        L_0x0030:
            java.lang.String r0 = "ۡۨۘۥۜۙۦ۬ۥۘۜۧۖۗ۠ۨۢۡۡ۟۟ۚۢۗۢ۠ۨ"
            goto L_0x001c
        L_0x0033:
            r1 = 932358308(0x3792a8a4, float:1.7483086E-5)
            java.lang.String r0 = "ۧۛۥۘۘۨ۫ۨۢ۫ۜۘۙ۬ۘۖۘۡۚۡ۬ۦ"
        L_0x0038:
            int r2 = r0.hashCode()
            r2 = r2 ^ r1
            switch(r2) {
                case -1027155361: goto L_0x0051;
                case -721885328: goto L_0x0041;
                case -171757257: goto L_0x0054;
                case 723955040: goto L_0x0069;
                default: goto L_0x0040;
            }
        L_0x0040:
            goto L_0x0038
        L_0x0041:
            java.lang.String r0 = com.obwhatsapp.yo.dep.getJID_t(r4)
            boolean r0 = com.obwhatsapp.yo.yo.isGroupJid(r0)
            if (r0 == 0) goto L_0x004e
            java.lang.String r0 = "ۢۡۜۤۙۥۚۜ۫ۜۜۥۘۡۡۦۘ"
            goto L_0x0038
        L_0x004e:
            java.lang.String r0 = "ۚۙۖۛۡۡۘۢ۬ۦۥۜ۫ۤ۬ۚۜۛۨۘ۠ۜۥۘ"
            goto L_0x0038
        L_0x0051:
            java.lang.String r0 = "ۨ۟ۛۥۖۨ۠ۢۛۧۘۙۙ۟ۡۘۗۛۛ۟ۛۧ"
            goto L_0x0038
        L_0x0054:
            java.lang.String r0 = "ۦۢۗۥۧۨ۟ۤۚۛۡۢۖۦۚ"
            goto L_0x0002
        L_0x0057:
            int r0 = f891n
            int r0 = r0 + 1
            f891n = r0
            java.lang.String r0 = "ۖۢۤۚ۠ۦۤۥۥۘ۠ۛۡۘۖۖۜۘۛ۫۬ۢ۠ۘۘ"
            goto L_0x0002
        L_0x0060:
            int r0 = f890m
            int r0 = r0 + 1
            f890m = r0
            java.lang.String r0 = "ۡۙۖۘ۬ۛۖ۠ۙۡۘۚۡ۟ۘۡۖۘ۠۠ۥۘۥۨۡۥۥۜۘۥۙ"
            goto L_0x0002
        L_0x0069:
            java.lang.String r0 = "۟ۛ۠۫ۖۦۘۗ۫۠ۖ۠۠۠ۡۨۘ۬ۡۜۖۤۡۗۨۡۘۦۨ"
            goto L_0x0002
        L_0x006c:
            java.lang.String r0 = "ۡۙۖۘ۬ۛۖ۠ۙۡۘۚۡ۟ۘۡۖۘ۠۠ۥۘۥۨۡۥۥۜۘۥۙ"
            goto L_0x0002
        L_0x006f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.u1.unreadCh(X.0rv, int):void");
    }

    public static byte[] xor(byte[] bArr, byte[] bArr2) {
        String str = "۫ۨۧۘۥ۟۫ۡۚۜ۬ۥۥۘۦۖۡۘ۠۠۠ۛۖۜ۫ۘ۟";
        int i2 = 0;
        int i3 = 0;
        byte[] bArr3 = null;
        byte[] bArr4 = null;
        byte[] bArr5 = null;
        byte[] bArr6 = null;
        while (true) {
            switch ((str.hashCode() ^ 895) ^ -52304801) {
                case -1849547914:
                    str = "۫۠ۘۘۨ۫ۘ۠۬ۖ۬ۦۨ۬ۖۧۘ";
                    bArr6 = bArr;
                    break;
                case -1833891012:
                    i2 = i3 + 1;
                    str = "۫ۤۘۛۛۦۢۨۡ۫ۡۧۗۗۚۧۖۘ";
                    break;
                case -1559357588:
                    str = "ۖۦ۬ۧ۟ۦۘ۟ۗۦۘۜۡ۬ۦۛۧۘۧۢ";
                    i3 = i2;
                    break;
                case -1531623532:
                    str = "ۖۢۧ۬ۜۡۥۢۚۥۡۦۘۜ۟ۖۘ";
                    bArr6 = bArr3;
                    break;
                case -1424600034:
                    str = "ۙۡۡۨۦ۠ۖۗۥۘۨ۫ۨۘۡۖۛ۟۫ۚ";
                    break;
                case -1161327191:
                    bArr5[i3] = (byte) (bArr5[i3] ^ bArr6[i3]);
                    str = "ۘۧۥۘۦۦۙۜ۫ۘۥ۫ۥۘۧۖۧۘ۠ۡۥۘۙۥۧ";
                    break;
                case -1030960904:
                    String str2 = "ۧ۟ۚۚۦۨۜ۟۬ۦۧۥۘۡۤۦۛ۟ۛ۬ۤۖۘ";
                    while (true) {
                        switch (str2.hashCode() ^ 1034048773) {
                            case -1548634217:
                                str = "ۨۙۜۘۥۙۢۜۤۤۢۧۗۤۨ۟ۤۙۙۙۚۡۖۤۘۦۦۦۘ";
                                continue;
                            case -1301851677:
                                str2 = "۫ۚۨۘۘۛۘۘۦۗۗ۠ۛۡۘۙۧۚۜ۠ۜۘۨۖۜ۬۟ۢۛۢۤ";
                                break;
                            case 150847924:
                                if (i3 >= bArr6.length) {
                                    str2 = "ۙۡۖۗۗۚۜ۟ۢۙۘۨۘۚ۠ۚ";
                                    break;
                                } else {
                                    str2 = "ۖۗۜۘۤۧ۠۟ۦۧۨ۠۬ۗۥۡ۬ۜۘۘۡۥۖ۠ۙۥۛۘ";
                                    break;
                                }
                            case 1998306947:
                                str = "ۙۖۡۦ۠ۧ۬ۢۘۘۗۥۦۨۛۦۚۘۢ۠ۡۤۢۖۖ";
                                continue;
                        }
                    }
                    break;
                case -839269377:
                    str = "ۜۜۤۧۧ۠ۦۧۖۘۥۦ۫ۚۤۖۘ";
                    bArr5 = bArr2;
                    break;
                case -666665892:
                    return bArr5;
                case 775932920:
                    str = "۟ۧۥۛۧۙۛۗۖۥۗۢ۠۫ۜ۫ۘۘۖۜۧۘ۠ۗۤ";
                    break;
                case 1172937132:
                    str = "ۘۗۘۘۢ۠۫ۧۢۘۘ۫ۛۘۘۜۢ۟ۘۥ۫";
                    bArr3 = bArr2;
                    break;
                case 1336870558:
                    str = "ۛۜۦۘۥۛۜۘ۠ۢۨۘۦ۬ۗۡۦۡ۬ۜۨۘۙۙۦۘ";
                    bArr5 = bArr4;
                    break;
                case 1532366651:
                    str = "ۤۘۧۘۦ۫ۦۤ۟۬ۖۖۤۨۦ۠۫ۖۜۗۨۤۙۤ۬";
                    bArr4 = bArr;
                    break;
                case 1674221786:
                    str = "ۥۡۢۤ۫ۢۨۢۥۘۡۗۗۗۡۨۘ۬ۗۥۦۢ۫";
                    break;
                case 1859864983:
                    String str3 = "۫۬ۜۜ۟ۤ۫ۨۦۦۜ۫ۚۧ۠۫ۖۖۙۡۦۘۜۜۢۘ۬ۚ";
                    while (true) {
                        switch (str3.hashCode() ^ 1142107879) {
                            case -1368716439:
                                str = "ۢ۠ۡۘۤۛۥۘۨۙۦۡۚۨۘ۟ۡۛۥۖ۠ۖۗۖۘ۫ۗ۟";
                                continue;
                            case 1103017263:
                                if (bArr.length <= bArr2.length) {
                                    str3 = "ۤۜۡۜۜۗۛۤۘۘۚۡ۫ۙ";
                                    break;
                                } else {
                                    str3 = "ۨۥۦۘ۬ۙۚ۫ۚۤ۠ۦۦۘۘۢۨ";
                                    break;
                                }
                            case 1629174571:
                                str = "ۖۢۧ۬ۜۡۥۢۚۥۡۦۘۜ۟ۖۘ";
                                continue;
                            case 1947673704:
                                str3 = "۠ۚۡۘ۬ۥ۫ۗۚۨۢۤۙۡۗۥۘۗۛۥۜۦۘۧۘۨ";
                                break;
                        }
                    }
                    break;
                case 1910439566:
                    str = "ۘۡۦۦ۟۟ۖۙۥۘۡۦۖۘۨۡۗ";
                    i3 = 0;
                    break;
                case 2103303704:
                    str = "ۘۡۦۦ۟۟ۖۙۥۘۡۦۖۘۨۡۗ";
                    break;
            }
        }
    }
}
