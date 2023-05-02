package com.obwhatsapp.yo.autoschedreply;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;

public class Receiver extends BroadcastReceiver {
    public static final int REQUEST_CODE = 12345;

    /* renamed from: a  reason: collision with root package name */
    public SQLiteAdapter f671a;

    public final void a(object_alert object_alert, Context context) {
        String str = "ۚۦۗۥۛۘۘۢۙۢۥۖۥۘۖ۬ۦۘ۬ۡ۫ۙۖ";
        while (true) {
            switch ((str.hashCode() ^ 237) ^ -228840104) {
                case -1042969208:
                    str = "ۗۡۖۧۘۨۘ۟ۧۧۚ۬ۥۘ۠ۗۥۘۡ۟ۢۚۜۜۡۖۡ";
                    break;
                case 47214216:
                    str = "ۘ۬ۤۦۢۥۧۢۙۧۤ۟ۢۢۦۘۧۨۧۘۨۚ۠";
                    break;
                case 859888544:
                    str = "۬ۢۘۗ۟ۖۘ۟ۡۤۙۚ۬ۦۘۘۥۦ۟۫ۖۚۢۢ۟";
                    break;
                case 1448959511:
                    return;
                case 1540473784:
                    new Handler(Looper.getMainLooper()).post(new p(this, object_alert, context, 0));
                    str = "۫ۦۜۛۤۥۦۚۖۘۦۦ۫ۖ۫ۡۘۡ۬ۙ۬ۛۖۘۡ۬ۜۨۥۗ";
                    break;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x015e, code lost:
        a(r0, r11);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(android.content.Context r11) {
        /*
            r10 = this;
            com.obwhatsapp.yo.autoschedreply.SQLiteAdapter r0 = new com.obwhatsapp.yo.autoschedreply.SQLiteAdapter
            r0.<init>(r11)
            r10.f671a = r0
            r0.open()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.obwhatsapp.yo.autoschedreply.SQLiteAdapter r0 = r10.f671a
            java.util.ArrayList r0 = r0.ii()
            com.obwhatsapp.yo.autoschedreply.SQLiteAdapter r1 = r10.f671a
            r1.close()
            java.util.GregorianCalendar r1 = new java.util.GregorianCalendar
            r1.<init>()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r3 = 1
            int r3 = r1.get(r3)
            r2.append(r3)
            java.lang.String r3 = "-"
            r2.append(r3)
            r3 = 2
            int r3 = r1.get(r3)
            int r3 = r3 + 1
            r2.append(r3)
            java.lang.String r3 = "-"
            r2.append(r3)
            r3 = 5
            int r3 = r1.get(r3)
            r2.append(r3)
            java.lang.String r4 = r2.toString()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r3 = 11
            int r3 = r1.get(r3)
            r2.append(r3)
            java.lang.String r3 = ":"
            r2.append(r3)
            r3 = 12
            int r1 = r1.get(r3)
            r2.append(r1)
            java.lang.String r5 = r2.toString()
            java.util.Iterator r6 = r0.iterator()
        L_0x0070:
            r1 = 477617954(0x1c77df22, float:8.2013837E-22)
            java.lang.String r0 = "۬ۖۥۢۥۧۗۤۡۛ۟ۤۨۜۘۘ۬ۥۘ۟ۛۦۘۢۡۧۘ۟۠۟"
        L_0x0075:
            int r2 = r0.hashCode()
            r2 = r2 ^ r1
            switch(r2) {
                case -811456467: goto L_0x007e;
                case -429478360: goto L_0x00d3;
                case 642614728: goto L_0x00ca;
                case 1641563466: goto L_0x0163;
                default: goto L_0x007d;
            }
        L_0x007d:
            goto L_0x0075
        L_0x007e:
            java.lang.Object r0 = r6.next()
            com.obwhatsapp.yo.autoschedreply.object_alert r0 = (com.obwhatsapp.yo.autoschedreply.object_alert) r0
            r2 = 1722226676(0x66a717f4, float:3.9453853E23)
            java.lang.String r1 = "۟۫ۡۡۨۢۦۜ۫ۛۦ۠ۙ۫۟ۙۦۨۨۡۥ"
        L_0x0089:
            int r3 = r1.hashCode()
            r3 = r3 ^ r2
            switch(r3) {
                case -1630914704: goto L_0x00a0;
                case -1124933677: goto L_0x00e6;
                case -174642804: goto L_0x00d9;
                case 422774651: goto L_0x0092;
                default: goto L_0x0091;
            }
        L_0x0091:
            goto L_0x0089
        L_0x0092:
            r2 = -875344493(0xffffffffcbd34d93, float:-2.769591E7)
            java.lang.String r1 = "۬۬۠ۤ۠ۖۘۥۤۛۛۜۘۤۚۘۘۨۡ۫۬۠ۘۚۡۧۙ۟۟"
        L_0x0097:
            int r3 = r1.hashCode()
            r3 = r3 ^ r2
            switch(r3) {
                case -1662786370: goto L_0x015e;
                case -1598830711: goto L_0x00ec;
                case -1246932533: goto L_0x00a0;
                case 946976913: goto L_0x00f9;
                default: goto L_0x009f;
            }
        L_0x009f:
            goto L_0x0097
        L_0x00a0:
            java.util.Date r3 = new java.util.Date
            r3.<init>()
            java.util.Date r2 = new java.util.Date
            r2.<init>()
            java.lang.String r7 = r0.getA_a()     // Catch:{ ParseException -> 0x012e }
            r8 = -155548697(0xfffffffff6ba83e7, float:-1.8914893E33)
            java.lang.String r1 = "۬ۘۖۜۚ۠ۧ۠ۦۖ۬ۨۘۨۜ۟"
        L_0x00b3:
            int r9 = r1.hashCode()     // Catch:{ ParseException -> 0x012e }
            r9 = r9 ^ r8
            switch(r9) {
                case -1883553880: goto L_0x00ff;
                case 870476238: goto L_0x0124;
                case 1344982903: goto L_0x00bc;
                case 1884420032: goto L_0x0102;
                default: goto L_0x00bb;
            }     // Catch:{ ParseException -> 0x012e }
        L_0x00bb:
            goto L_0x00b3
        L_0x00bc:
            java.lang.String r1 = "12:"
            boolean r1 = r7.contains(r1)     // Catch:{ ParseException -> 0x012e }
            if (r1 == 0) goto L_0x00fc
            java.lang.String r1 = "ۚ۠ۥۘۧۤۛۧۛۘۘۤۧۘۘۡۨ۠ۦۘ"
            goto L_0x00b3
        L_0x00c7:
            java.lang.String r0 = "ۙۘ۫۫ۨ۬۫ۡۡ۫ۨ۠ۛۨۘۘ"
            goto L_0x0075
        L_0x00ca:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x00c7
            java.lang.String r0 = "ۙ۬۟ۡۤۖۥۡۡۦۛۜۢۙ۬ۦۘ۬ۛۗ"
            goto L_0x0075
        L_0x00d3:
            java.lang.String r0 = "۫ۨ۟۬ۦۧۘ۠ۢۜۢۧۗۘۜۖۘ۟ۢۧۤۧۥۗۡۨۤۘۘ"
            goto L_0x0075
        L_0x00d6:
            java.lang.String r1 = "۟ۨۖۘۦۥۡۘۡۤۘۘۖۚۚۤ۟ۥۚۧۖۘۦۘۥۚ۟ۥۘ"
            goto L_0x0089
        L_0x00d9:
            java.lang.String r1 = r0.getD_d()
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x00d6
            java.lang.String r1 = "۠ۨ۟ۖۜۧ۫ۥۧۖ۟۫ۡ۠ۘۘۙۧۡۜ"
            goto L_0x0089
        L_0x00e6:
            java.lang.String r1 = "ۦۧۦۘ۟ۛۚۘۦۧۧ۠ۤۡ۟ۙۛۖۖۘۡۙ۬ۙ۠ۨۘۙۙ۟"
            goto L_0x0089
        L_0x00e9:
            java.lang.String r1 = "ۧ۬ۦ۠ۖۙ۬ۢۨۘۧۖۤۗۤۤۚ۟۠ۡ۬ۥۘ۟ۙۖ"
            goto L_0x0097
        L_0x00ec:
            java.lang.String r1 = r0.getA_a()
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L_0x00e9
            java.lang.String r1 = "ۚۦۡۘۘۘ۫ۛ۬ۚۜۦۘۙۙۨۘۛۖۖۘۤۧ۟"
            goto L_0x0097
        L_0x00f9:
            java.lang.String r1 = "ۛۗ۬ۥۦۖۧ۫ۧ۬ۗ۠ۙۚ"
            goto L_0x0097
        L_0x00fc:
            java.lang.String r1 = "ۥ۫ۗۥۛۡۘ۬۬ۢۤۗۦ۬ۘۘۨۜۢۧۖۢۥ۠ۦ"
            goto L_0x00b3
        L_0x00ff:
            java.lang.String r1 = "ۙۚۤۡۧۜۧۖ۬ۜۛۜۤۖۢ۟۬ۦۘ۟ۤۜۥۜۘۚۧۚ"
            goto L_0x00b3
        L_0x0102:
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat     // Catch:{ ParseException -> 0x012e }
            java.lang.String r8 = "HH:mm"
            java.util.Locale r9 = java.util.Locale.ENGLISH     // Catch:{ ParseException -> 0x012e }
            r1.<init>(r8, r9)     // Catch:{ ParseException -> 0x012e }
        L_0x010b:
            java.util.Date r3 = r1.parse(r7)     // Catch:{ ParseException -> 0x012e }
            java.util.Date r1 = r1.parse(r5)     // Catch:{ ParseException -> 0x012e }
        L_0x0113:
            r7 = 1928583380(0x72f3d8d4, float:9.659774E30)
            java.lang.String r2 = "ۨۙۜۦ۫ۤۜۢۢۚۛۦ۫ۢۘۚۧ۠۠ۨۥ"
        L_0x0118:
            int r8 = r2.hashCode()
            r8 = r8 ^ r7
            switch(r8) {
                case -1661860234: goto L_0x0070;
                case -837662443: goto L_0x0141;
                case 67559606: goto L_0x0121;
                case 949732570: goto L_0x0134;
                default: goto L_0x0120;
            }
        L_0x0120:
            goto L_0x0118
        L_0x0121:
            java.lang.String r2 = "ۖۢۡۘۢۨۖۘۨۡۦۘۦۙۖۘۥۚۧۘ۠ۦۘ"
            goto L_0x0118
        L_0x0124:
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat     // Catch:{ ParseException -> 0x012e }
            java.lang.String r8 = "hh:mm"
            java.util.Locale r9 = java.util.Locale.ENGLISH     // Catch:{ ParseException -> 0x012e }
            r1.<init>(r8, r9)     // Catch:{ ParseException -> 0x012e }
            goto L_0x010b
        L_0x012e:
            r1 = move-exception
            r1 = r2
            goto L_0x0113
        L_0x0131:
            java.lang.String r2 = "ۨۙۡ۠ۗۧۛۨۘۘ۬ۤۤۚ۫ۦۘ"
            goto L_0x0118
        L_0x0134:
            java.lang.String r2 = r0.getD_d()
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x0131
            java.lang.String r2 = "۟۟ۖۘ۟۠ۡۘ۫ۘۧۚۙۙۦۗۤ۟ۛ۫ۙ۟ۚۧ۫"
            goto L_0x0118
        L_0x0141:
            r7 = 1629306697(0x611d3f49, float:1.8129369E20)
            java.lang.String r2 = "ۖۘ۠ۥۚۗۖۜۧۘۙۚ۫۠ۛ۟"
        L_0x0146:
            int r8 = r2.hashCode()
            r8 = r8 ^ r7
            switch(r8) {
                case 46769916: goto L_0x014f;
                case 669230634: goto L_0x0070;
                case 897433291: goto L_0x015b;
                case 1560181058: goto L_0x015e;
                default: goto L_0x014e;
            }
        L_0x014e:
            goto L_0x0146
        L_0x014f:
            boolean r2 = r1.after(r3)
            if (r2 == 0) goto L_0x0158
            java.lang.String r2 = "ۙ۟ۜۚ۠ۥ۠ۧۥۘۗۦۘۜۙۡۘ۫۫ۜ"
            goto L_0x0146
        L_0x0158:
            java.lang.String r2 = "۠ۨۧۘۨۨ۠۠۬۟۠ۙۥ۫ۗۖۛ۬ۚۙۛۤ"
            goto L_0x0146
        L_0x015b:
            java.lang.String r2 = "ۛۢۦ۫ۤ۠ۖۖۤۛۖۡۘۤۧۜ۬ۗۨ۫ۤۘۘ"
            goto L_0x0146
        L_0x015e:
            r10.a(r0, r11)
            goto L_0x0070
        L_0x0163:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.autoschedreply.Receiver.b(android.content.Context):void");
    }

    public void onReceive(Context context, Intent intent) {
        String str = "۟ۘۨ۬۬۠ۡۧۘۘۤۙۘۘۧۖۡۧ۠ۜۘۙۧۨۙ۟ۨۘ";
        while (true) {
            switch ((str.hashCode() ^ 78) ^ -872473939) {
                case -1740842306:
                    str = "ۛۜۖۘۚ۠ۖۛۙۤۡۢۦۘۦۘۖۘ۫۫ۤۚۢ۬";
                    break;
                case -1649717695:
                    b(context);
                    str = "ۦۧۜۘ۟ۨۚۖۖۙ۟ۥۘۦ";
                    break;
                case -669978246:
                case 167849007:
                    return;
                case -669487181:
                    b(context);
                    str = "ۜۨۥ۫ۢۦۡ۫ۡۘۛۦ۟۬ۤۡۘ";
                    break;
                case 900779282:
                    String str2 = "ۤ۫ۧۖۜ۠ۜۢۘۙۥۘۘۧۚ۟ۦۛۨۥ۟ۦۘۖۤۙ";
                    while (true) {
                        switch (str2.hashCode() ^ 2093179140) {
                            case -1809087084:
                                str = "ۘۛۖۦۜۡۙۤۛۥۘۥۘۛۙۘۧۨ۟ۖ۠ۜ";
                                continue;
                            case 42025840:
                                str2 = "۬۬ۥۘۜۡۗ۫ۧۗۦۨۡۖۡۥۡۚ";
                                break;
                            case 1500539572:
                                str = "ۘۥۖۤۧۥۘ۬۫ۚ۠ۤۧۛۚۥ۫ۚ۬";
                                continue;
                            case 1625241296:
                                if (!"android.intent.action.BOOT_COMPLETED".equals(intent.getAction())) {
                                    str2 = "ۖۥۙ۠ۘۜۘۗۥۥۡۦ۫ۦۤۛ";
                                    break;
                                } else {
                                    str2 = "ۨۤۤۜۜ۟۬ۗۜۤۘۙۥۛۜۗۢۚ";
                                    break;
                                }
                        }
                    }
                    break;
                case 1217349795:
                    str = "ۧۖۥۙۤۘۘ۠ۚۤۛۡ۬ۧۡۛۦ۟ۗ۟ۚ۟ۖۗۜ";
                    break;
                case 1690783165:
                    ((AlarmManager) context.getSystemService("alarm")).setInexactRepeating(0, System.currentTimeMillis(), 60000, PendingIntent.getBroadcast(context, REQUEST_CODE, new Intent(context, Receiver.class), 134217728));
                    str = "ۚۨۧۜۡۨۜ۟ۡ۬ۚ۫ۥۧۘۘۘۧۢۡۙۘ۫ۥۨۘ";
                    break;
                case 1703009590:
                    str = "۟ۗۘۜۤۜۘۚۤۤۚۙۥۗۥۙۘۛۡۧۢۥۘۧۖۜۙ";
                    break;
            }
        }
    }
}
