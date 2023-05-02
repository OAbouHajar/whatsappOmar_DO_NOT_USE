package com.obwhatsapp.youbasha.ui.views;

import android.app.Activity;
import android.view.LayoutInflater;
import android.widget.BaseAdapter;
import com.obwhatsapp.youbasha.others;
import java.util.ArrayList;

public class CustomListAdapter extends BaseAdapter {

    /* renamed from: e  reason: collision with root package name */
    public static final int f1344e = 0;

    /* renamed from: a  reason: collision with root package name */
    public final Activity f1345a;

    /* renamed from: b  reason: collision with root package name */
    public ArrayList f1346b;

    /* renamed from: c  reason: collision with root package name */
    public final LayoutInflater f1347c;

    /* renamed from: d  reason: collision with root package name */
    public final int f1348d = others.getID("activity_customlist_row", "layout");

    public CustomListAdapter(Activity activity, ArrayList<String> arrayList) {
        this.f1345a = activity;
        this.f1347c = LayoutInflater.from(activity);
        this.f1346b = arrayList;
    }

    public int getCount() {
        String str = "ۖ۟ۤ۟ۢۡۘ۬ۧۚ۟ۢۘۧۙۤۧۗۧۢۧۗۦ۬";
        while (true) {
            switch ((str.hashCode() ^ 370) ^ -1357250466) {
                case -508473043:
                    return this.f1346b.size();
                case 69860580:
                    str = "ۤۖۦۛۧۙۦۙ۫ۤۘ۬ۜۚۨ۫ۢۖۖۖۡۚ۫ۥ";
                    break;
            }
        }
    }

    public Object getItem(int i2) {
        String str = "۠ۦۡۘۖۤ۬ۤۧ۫ۜۦۘۗ۠ۧۡۘۧۘ";
        while (true) {
            switch ((str.hashCode() ^ 391) ^ 698073333) {
                case -324734204:
                    return this.f1346b.get(i2);
                case 746268749:
                    str = "۬ۦۡۘ۫ۡۗۤ۟ۤ۫ۘ۬ۖۦ";
                    break;
                case 1342599364:
                    str = "ۛۙۤ۟ۡۦۘۨۜۥۛۙۜۨۢۨۧۤۚ";
                    break;
            }
        }
    }

    public long getItemId(int i2) {
        String str = "۟۠ۖۛ۫ۙۧ۟ۡۘۤۗۙۦۗ۫ۜۧۤۘۡ۫";
        while (true) {
            switch ((str.hashCode() ^ 536) ^ 1536501693) {
                case -1076146356:
                    str = "ۧۨۦۥۦۜۡ۠ۖۘۨ۠ۖۘۧ۠ۜۡۡۛۖۘ";
                    break;
                case -640275835:
                    str = "ۤۤۖۘۡۘۦۥۢۢۥۥۨۘۦۖۚ۠ۡۖۡۖۢ۬ۡۘ";
                    break;
                case -192119986:
                    return (long) getItem(i2).hashCode();
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0196, code lost:
        r3 = "ۥۚۦۘۛ۠ۦۧۚۦۙ۬۠ۘۤۦۡ۠ۚۛۛۜۙۥ۫ۘ۟ۧ";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r29, android.view.View r30, android.view.ViewGroup r31) {
        /*
            r28 = this;
            r25 = 0
            r24 = 0
            r23 = 0
            r21 = 0
            r22 = 0
            r20 = 0
            r19 = 0
            r18 = 0
            r15 = 0
            r17 = 0
            r13 = 0
            r12 = 0
            r14 = 0
            r16 = 0
            r11 = 0
            r10 = 0
            r9 = 0
            r7 = 0
            r8 = 0
            r6 = 0
            r5 = 0
            r4 = 0
            java.lang.String r2 = "ۢۥ۟ۡۡۥۢۡ۬ۢۦۡۘۥۚۨۘ"
            r3 = r2
        L_0x0023:
            int r2 = r3.hashCode()
            r26 = 747(0x2eb, float:1.047E-42)
            r27 = -493647228(0xffffffffe2938a84, float:-1.3608262E21)
            r2 = r2 ^ r26
            r2 = r2 ^ r27
            switch(r2) {
                case -1989818357: goto L_0x0165;
                case -1850871081: goto L_0x014d;
                case -1589373337: goto L_0x00f9;
                case -1537147284: goto L_0x0062;
                case -1517556479: goto L_0x026c;
                case -1412163597: goto L_0x00a9;
                case -1396373569: goto L_0x022c;
                case -1374875916: goto L_0x003c;
                case -1365241981: goto L_0x01f4;
                case -1148201878: goto L_0x006c;
                case -980688991: goto L_0x0139;
                case -897208520: goto L_0x007d;
                case -887504668: goto L_0x0146;
                case -792699224: goto L_0x00cf;
                case -763436883: goto L_0x025d;
                case -749344875: goto L_0x0140;
                case -710199201: goto L_0x0203;
                case -523850476: goto L_0x0123;
                case -519745084: goto L_0x00a2;
                case -280319468: goto L_0x0172;
                case -242832486: goto L_0x020b;
                case 63739841: goto L_0x0271;
                case 144974620: goto L_0x0086;
                case 150970441: goto L_0x01d2;
                case 235892533: goto L_0x0267;
                case 331563020: goto L_0x01ab;
                case 489980112: goto L_0x023c;
                case 497019286: goto L_0x021c;
                case 571321086: goto L_0x00bb;
                case 599571313: goto L_0x0097;
                case 862610859: goto L_0x0034;
                case 929927910: goto L_0x0103;
                case 942552360: goto L_0x01fa;
                case 953936221: goto L_0x0187;
                case 966209983: goto L_0x011d;
                case 1080669828: goto L_0x0044;
                case 1133496557: goto L_0x0091;
                case 1197307062: goto L_0x017e;
                case 1238316394: goto L_0x0040;
                case 1473450189: goto L_0x010f;
                case 1596652646: goto L_0x012d;
                case 1602434904: goto L_0x0116;
                case 1797024774: goto L_0x0157;
                case 1856817841: goto L_0x00da;
                case 1866988430: goto L_0x01e0;
                case 1912834465: goto L_0x0038;
                case 2071270682: goto L_0x024c;
                case 2074542375: goto L_0x01e6;
                case 2085398980: goto L_0x0214;
                case 2099126492: goto L_0x00c6;
                default: goto L_0x0033;
            }
        L_0x0033:
            goto L_0x0023
        L_0x0034:
            java.lang.String r2 = "ۚ۟ۡ۟ۤۧۢ۠۫ۖ۟۟ۚۗ۟ۤۜۗۧۧۚ"
            r3 = r2
            goto L_0x0023
        L_0x0038:
            java.lang.String r2 = "۬ۗۡۘۙۡۧۘۖۚۨ۟ۨ۠ۤۚۦۘ۫ۚ۠"
            r3 = r2
            goto L_0x0023
        L_0x003c:
            java.lang.String r2 = "۠ۦۧۘۥۖ۫ۜۥۤۖۖۙ۠ۢ۠ۘۜۦ"
            r3 = r2
            goto L_0x0023
        L_0x0040:
            java.lang.String r2 = "ۜۘۘۘۙۖۘۡۧ۬ۥ۠ۨۖ۠ۗۗۤۜۢۢۛۧۜۘۡۥ۟"
            r3 = r2
            goto L_0x0023
        L_0x0044:
            r3 = 29192670(0x1bd71de, float:6.9591026E-38)
            java.lang.String r2 = "ۖ۠۫۫۫۬ۖۥۡۘۘۡۘۘۡۙۚۗۜۘۘۢۛ۟ۙۙۡ۠ۤ"
        L_0x0049:
            int r26 = r2.hashCode()
            r26 = r26 ^ r3
            switch(r26) {
                case -1427509585: goto L_0x005e;
                case -148531430: goto L_0x0258;
                case 1629395698: goto L_0x0053;
                case 1727725039: goto L_0x005b;
                default: goto L_0x0052;
            }
        L_0x0052:
            goto L_0x0049
        L_0x0053:
            if (r30 != 0) goto L_0x0058
            java.lang.String r2 = "ۖۦۘۘۧۥۙۦۥۘۘۢۖ۫ۦۨۗۤۚۡۚۥۜ۠ۥۤ"
            goto L_0x0049
        L_0x0058:
            java.lang.String r2 = "۟ۖ۟ۚۥ۬ۧۛۗۥۘۘۖ۟ۨ"
            goto L_0x0049
        L_0x005b:
            java.lang.String r2 = "۬ۧۨۘۤۢۜۘۢۥۜۘۦۙۡ۠ۥۖۘ"
            goto L_0x0049
        L_0x005e:
            java.lang.String r2 = "ۥۜۚ۠۠ۦۛۛۖۘۢۖۦۘۧۖۗ۬ۧۚۘۨۥۙۖ۫ۖۘ۠"
            r3 = r2
            goto L_0x0023
        L_0x0062:
            r0 = r28
            int r0 = r0.f1348d
            r25 = r0
            java.lang.String r2 = "ۖ۠ۡۘۡ۟ۖۚۨۚۘۤۚۨۖ۬ۗۤۗ"
            r3 = r2
            goto L_0x0023
        L_0x006c:
            r0 = r28
            android.view.LayoutInflater r2 = r0.f1347c
            r3 = 0
            r0 = r25
            r1 = r31
            android.view.View r24 = r2.inflate(r0, r1, r3)
            java.lang.String r2 = "ۡۢۡۘۘۗۚ۟ۘۙۖۗۥۘۚ۠ۘۘ"
            r3 = r2
            goto L_0x0023
        L_0x007d:
            com.obwhatsapp.youbasha.ui.views.c r23 = new com.obwhatsapp.youbasha.ui.views.c
            r23.<init>(r24)
            java.lang.String r2 = "ۜۨۙۤۡۧۦۚۖۥۤ۟ۢۡۘۚۜۘۖۜۗ۠ۚۦۘۧۖۧ"
            r3 = r2
            goto L_0x0023
        L_0x0086:
            r0 = r24
            r1 = r23
            r0.setTag(r1)
            java.lang.String r2 = "ۜۛۜۘۦۗۚۚۢ۟ۨ۬ۢۢ۫۠"
            r3 = r2
            goto L_0x0023
        L_0x0091:
            java.lang.String r2 = "ۖۗۧۧ۠ۡۖۚۚۦۡۡۧۤۡۘۛۨۧۘۦۛۛ"
            r3 = r2
            r22 = r23
            goto L_0x0023
        L_0x0097:
            java.lang.Object r2 = r30.getTag()
            com.obwhatsapp.youbasha.ui.views.c r2 = (com.obwhatsapp.youbasha.ui.views.c) r2
            java.lang.String r3 = "۫ۥۗۨۘۙۘۥۛۙۗۥۙۡ۠ۤۦ۟ۥۦ"
            r21 = r2
            goto L_0x0023
        L_0x00a2:
            java.lang.String r2 = "ۙۜ۫ۖۛ۬۫ۛۖۢ۠ۦ۬ۜۡۘۜۚۢ"
            r3 = r2
            r22 = r21
            goto L_0x0023
        L_0x00a9:
            r0 = r28
            java.util.ArrayList r2 = r0.f1346b
            r0 = r29
            java.lang.Object r2 = r2.get(r0)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = "ۧۗۧۥ۟ۘۘۡۡۨۨۙۡۘ۟ۥۖ"
            r20 = r2
            goto L_0x0023
        L_0x00bb:
            r0 = r20
            r1 = r22
            r1.f1442f = r0
            java.lang.String r2 = "۬ۖۤۧۥ۬۠۬ۛۜۥۨۘۧۥۥ۟۟"
            r3 = r2
            goto L_0x0023
        L_0x00c6:
            boolean r19 = com.obwhatsapp.yo.yo.isGroupJid(r20)
            java.lang.String r2 = "۫۟ۦۙۨ۟ۖۧۚۥۢۖۘۡۘۢۤۥۚۜ۫"
            r3 = r2
            goto L_0x0023
        L_0x00cf:
            r0 = r22
            android.widget.ImageView r0 = r0.f1438b
            r18 = r0
            java.lang.String r2 = "۫ۤۚۤ۬ۦۤۢۡۗۛۨۘۘۛۖۘۗۜۧۘۨۖۡ"
            r3 = r2
            goto L_0x0023
        L_0x00da:
            r3 = 1035140198(0x3db2fc66, float:0.087395474)
            java.lang.String r2 = "ۤ۫ۜۘۥۢ۠ۨۢۙۡۙۖۤۖۖۙۙۙۘۨۦۨۚ۬"
        L_0x00df:
            int r26 = r2.hashCode()
            r26 = r26 ^ r3
            switch(r26) {
                case -2074331306: goto L_0x0262;
                case -1079302794: goto L_0x00f6;
                case -257880856: goto L_0x00e9;
                case 289617310: goto L_0x00f1;
                default: goto L_0x00e8;
            }
        L_0x00e8:
            goto L_0x00df
        L_0x00e9:
            java.lang.String r2 = "۟ۗۘۘۚۤۚۘۛۨۖۜۛ۠ۚۗۛۘۗۚۤۖ۠ۤۙۙۜۡۘ"
            r3 = r2
            goto L_0x0023
        L_0x00ee:
            java.lang.String r2 = "۬ۤۙۨۤ۬ۧۘۘۘۜۙۡۛۥۖۘ"
            goto L_0x00df
        L_0x00f1:
            if (r19 == 0) goto L_0x00ee
            java.lang.String r2 = "ۨۥۦۘ۟ۜۗۧ۫ۥۘۧۙۢۢۖۥۘۖۙۗۘ۟ۖ"
            goto L_0x00df
        L_0x00f6:
            java.lang.String r2 = "ۤۥۢۢۛ۫ۡۙۙۡۖۛۥۡۘۧۛ۠۬ۥ۫ۜۨۢۥ۬۟"
            goto L_0x00df
        L_0x00f9:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r2 = "ۚۧۦۛۦۨۘۥۥۜۘۚۡۥۦ۬ۨۘ۠ۘۢۦۘۡ"
            r3 = r2
            goto L_0x0023
        L_0x0103:
            r0 = r22
            java.lang.String r2 = r0.f1442f
            r15.append(r2)
            java.lang.String r2 = "ۥۡۘۘ۠ۢۖ۫ۨۘۘۛۥۘۘۦۗۜۘۜ۬ۨۘۨۨۘۘۛۧۙ۟۠"
            r3 = r2
            goto L_0x0023
        L_0x010f:
            java.lang.String r17 = "@g.us"
            java.lang.String r2 = "ۧ۠۟۟ۥۧۥۚ۬ۤۘ۠ۛ۫ۨۘۦۖ۫۠ۢۙۧۜۘۢۖۢ"
            r3 = r2
            goto L_0x0023
        L_0x0116:
            java.lang.String r2 = "ۥ۟ۦۘۦۨۜۘ۫ۧۚۥ۟ۥۘۛۙۧۢۡۥ۠ۧۤۛۙ۠۟۬"
            r3 = r2
            r16 = r17
            goto L_0x0023
        L_0x011d:
            java.lang.String r2 = "۟ۤۢ۠ۧۘۘ۫ۧۜۘۥۨۥۘۛۨۜۗ"
            r3 = r2
            r14 = r15
            goto L_0x0023
        L_0x0123:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r2 = "ۥ۬ۜۘۧ۫۠ۛۥۖۘۜۥۘۥۤ"
            r3 = r2
            goto L_0x0023
        L_0x012d:
            r0 = r22
            java.lang.String r2 = r0.f1442f
            r13.append(r2)
            java.lang.String r2 = "ۜۢۖۜۡ۫ۢۢۢ۫ۦۨۡ۫ۙ"
            r3 = r2
            goto L_0x0023
        L_0x0139:
            java.lang.String r12 = "@s.whatsapp.net"
            java.lang.String r2 = "ۤۦۦۘۛ۫ۙ۫ۡۘۖۥۛۦۛ۫ۡۤ"
            r3 = r2
            goto L_0x0023
        L_0x0140:
            java.lang.String r2 = "ۧۜ۫۫۠۬ۤ۫۬ۤۡ۬ۖ"
            r3 = r2
            r14 = r13
            goto L_0x0023
        L_0x0146:
            java.lang.String r2 = "ۚۨۨۘۦۜۚۙۦۨۘ۫ۙۙۘۥ۠ۥ۫ۚۥۜۘ"
            r3 = r2
            r16 = r12
            goto L_0x0023
        L_0x014d:
            r0 = r16
            r14.append(r0)
            java.lang.String r2 = "۫ۜۨۥۢۨۧ۫ۡۗۡۤۧۡۖۢۙۘۘۧۦۢ۟۫ۜۘ"
            r3 = r2
            goto L_0x0023
        L_0x0157:
            java.lang.String r2 = r14.toString()
            r0 = r18
            com.obwhatsapp.yo.dep.loadCImage(r2, r0)
            java.lang.String r2 = "ۡۘۧۘۛۗۧۖۗۥۜ۟ۨۘ۫ۢۤۧۡۗ"
            r3 = r2
            goto L_0x0023
        L_0x0165:
            r0 = r22
            java.lang.String r2 = r0.f1442f
            java.lang.String r11 = com.obwhatsapp.yo.dep.getContactName(r2)
            java.lang.String r2 = "ۤۜ۟۬۠ۖۦۘۤۦۥ۫ۡۧۨۚۢۧۢۛۛ۫ۖ"
            r3 = r2
            goto L_0x0023
        L_0x0172:
            r0 = r22
            android.widget.TextView r2 = r0.f1439c
            r2.setText(r11)
            java.lang.String r2 = "ۘۘۨۘۛۜۜۘ۟ۜۘۗۗۢۚۗۜۢۤۗۚۘۖۖۜۚۡۤۨۘ"
            r3 = r2
            goto L_0x0023
        L_0x017e:
            r0 = r28
            android.app.Activity r10 = r0.f1345a
            java.lang.String r2 = "ۨۛۘۘۤۗ۫ۢۥ۟۬ۥ۬ۢۖۤۧۥ۫ۦ۟"
            r3 = r2
            goto L_0x0023
        L_0x0187:
            r3 = 838741251(0x31fe2d03, float:7.39749E-9)
            java.lang.String r2 = "ۚۥۡۦۛۡ۫ۖۥۛۡۚۘۢۥۗۚۖۗ۠۬"
        L_0x018c:
            int r26 = r2.hashCode()
            r26 = r26 ^ r3
            switch(r26) {
                case -872364744: goto L_0x019e;
                case -137850550: goto L_0x01a3;
                case 1706896256: goto L_0x0196;
                case 2107881962: goto L_0x01a6;
                default: goto L_0x0195;
            }
        L_0x0195:
            goto L_0x018c
        L_0x0196:
            java.lang.String r2 = "ۥۚۦۘۛ۠ۦۧۚۦۙ۬۠ۘۤۦۡ۠ۚۛۛۜۙۥ۫ۘ۟ۧ"
            r3 = r2
            goto L_0x0023
        L_0x019b:
            java.lang.String r2 = "۠۟ۗۥۧ۬ۛۨۘۙۗۖۨ۠۟ۨۙۜۨۤۜۡۘۦۘ۫ۨ"
            goto L_0x018c
        L_0x019e:
            if (r11 == 0) goto L_0x019b
            java.lang.String r2 = "ۢۛۡۘۢ۠ۡ۬ۦ۬ۙۛۖ۠ۘۘۘ۬ۢۨ۬ۦۥ۟ۨۘ"
            goto L_0x018c
        L_0x01a3:
            java.lang.String r2 = "ۧۡۜۗۜۥۘۚۤۙۥۛۤۛۥۥۘۥۘ"
            goto L_0x018c
        L_0x01a6:
            java.lang.String r2 = "ۢۜۡۨۢۥۘۘۡۨۘ۟۫ۜۘ۬ۧۘۘ۠۟ۖۗۙۘۙ۟ۙۧۛۛ"
            r3 = r2
            goto L_0x0023
        L_0x01ab:
            r3 = -107863851(0xfffffffff99220d5, float:-9.484266E34)
            java.lang.String r2 = "ۦۥۡۘ۬ۢۖۥ۠ۦۜۥۧۘۜۜۦۘ"
        L_0x01b0:
            int r26 = r2.hashCode()
            r26 = r26 ^ r3
            switch(r26) {
                case -1108352520: goto L_0x01ba;
                case -801381599: goto L_0x0196;
                case 955984926: goto L_0x01cd;
                case 1276637880: goto L_0x01c0;
                default: goto L_0x01b9;
            }
        L_0x01b9:
            goto L_0x01b0
        L_0x01ba:
            java.lang.String r2 = "۫ۨۥۧ۟ۜۘ۠ۛۙۥۨۜۘۗۨۖۡۛۨۡۜۧۥۖ۠ۢۤۜۘ"
            goto L_0x01b0
        L_0x01bd:
            java.lang.String r2 = "ۙۚۦۘۖۡۘۘۥۖۧۜ۬ۙۘۡ۫ۖۡۘۧ۟ۘۘ"
            goto L_0x01b0
        L_0x01c0:
            r0 = r22
            java.lang.String r2 = r0.f1442f
            boolean r2 = r11.equals(r2)
            if (r2 == 0) goto L_0x01bd
            java.lang.String r2 = "۟ۦۙۛۙ۬۟ۖۘۦ۠ۡۘۖ۬ۥۦۜۜ"
            goto L_0x01b0
        L_0x01cd:
            java.lang.String r2 = "۬۠ۘ۫ۘۡۘ۟ۡۗ۟ۜۘۧۘۥ"
            r3 = r2
            goto L_0x0023
        L_0x01d2:
            com.obwhatsapp.youbasha.ui.activity.specPrivacy r9 = new com.obwhatsapp.youbasha.ui.activity.specPrivacy
            r0 = r22
            java.lang.String r2 = r0.f1442f
            r9.<init>(r10, r2)
            java.lang.String r2 = "ۦۧۥۘۜۘۖۚۗۦۘۡۗ۬ۧ۬۠ۥۛۗ۠ۘۜۘۧۧۜ"
            r3 = r2
            goto L_0x0023
        L_0x01e0:
            java.lang.String r2 = "۟ۙۙۘ۠ۖۘۙۗۗۢۜۨۚۤۢۥۧۛ۠۟ۨۘ"
            r3 = r2
            r8 = r9
            goto L_0x0023
        L_0x01e6:
            com.obwhatsapp.youbasha.ui.activity.specPrivacy r7 = new com.obwhatsapp.youbasha.ui.activity.specPrivacy
            r0 = r22
            java.lang.String r2 = r0.f1442f
            r7.<init>(r10, r2, r11)
            java.lang.String r2 = "ۡۡۨۘ۬ۘۘۜ۫ۚ۠ۜ۟ۛۜۡۛ۫ۦۘۖۥۙۧۗۘۘ"
            r3 = r2
            goto L_0x0023
        L_0x01f4:
            java.lang.String r2 = "ۥۨۜۤۘۥۘۜۥۜۧ۠ۖۘۢۘۡۘۖۙ۟ۛ۬ۙ"
            r3 = r2
            r8 = r7
            goto L_0x0023
        L_0x01fa:
            r0 = r22
            android.widget.CheckBox r6 = r0.f1440d
            java.lang.String r2 = "۟۫ۜ۟ۤۨۢ۟ۙۜ۬ۨۗۤۜ۬ۗۛ"
            r3 = r2
            goto L_0x0023
        L_0x0203:
            r8.setSW(r6)
            java.lang.String r2 = "۟ۨۤۦ۠ۘۘۘ۫ۥۧۚۛۥۗۨۙۧۥۘۚۧۜۘ"
            r3 = r2
            goto L_0x0023
        L_0x020b:
            r0 = r22
            android.view.View r5 = r0.f1437a
            java.lang.String r2 = "۫۟ۜۘۢۨۗ۬ۧۥۘۨ۟ۜۘۘ۫ۜ۠۠۠۬ۚۚۦۙۦ۫"
            r3 = r2
            goto L_0x0023
        L_0x0214:
            r5.setOnClickListener(r8)
            java.lang.String r2 = "ۦۖۗۘۥۖۘۖۡۛ۬ۤ۫ۘ۟۠ۚۢ۫ۤۚ"
            r3 = r2
            goto L_0x0023
        L_0x021c:
            r0 = r22
            java.lang.String r2 = r0.f1442f
            boolean r2 = com.obwhatsapp.yo.yo.wantsSpecific(r2)
            r6.setChecked(r2)
            java.lang.String r2 = "ۘۙۤۘۤ۠ۧۧۥۨۙۡۙۧۦۘۙۤ۫ۦ۫ۨۘ۬ۥۢ"
            r3 = r2
            goto L_0x0023
        L_0x022c:
            com.obwhatsapp.yo.l r2 = new com.obwhatsapp.yo.l
            r3 = 2
            r0 = r22
            r2.<init>(r0, r3)
            r6.setOnCheckedChangeListener(r2)
            java.lang.String r2 = "ۤۢۥۛۜۛۙۖۥۖۛۢۥۘ۟ۤۗۖ"
            r3 = r2
            goto L_0x0023
        L_0x023c:
            c.b r4 = new c.b
            r2 = 8
            r0 = r28
            r1 = r22
            r4.<init>(r0, r1, r2)
            java.lang.String r2 = "ۧۢۥۢۘۥۢۧ۫ۘ۫۠ۛۘۘۥۥۤ"
            r3 = r2
            goto L_0x0023
        L_0x024c:
            r0 = r22
            android.widget.ImageView r2 = r0.f1441e
            r2.setOnClickListener(r4)
            java.lang.String r2 = "۫ۙۤۥۤۙۦۥۜۥۚۗۢۧۥ۟ۦ۬"
            r3 = r2
            goto L_0x0023
        L_0x0258:
            java.lang.String r2 = "۟۠۫۬۠ۥۖ۠ۖ۬ۧۙ۟ۡۘ۫۬ۜ"
            r3 = r2
            goto L_0x0023
        L_0x025d:
            java.lang.String r2 = "ۙۜ۫ۖۛ۬۫ۛۖۢ۠ۦ۬ۜۡۘۜۚۢ"
            r3 = r2
            goto L_0x0023
        L_0x0262:
            java.lang.String r2 = "ۢۥۦۚۗ۬ۦۙۡۘ۟ۡۘ۫ۡۥۘۤۛۨۚۘۢۘۢۡ"
            r3 = r2
            goto L_0x0023
        L_0x0267:
            java.lang.String r2 = "ۚۨۨۘۦۜۚۙۦۨۘ۫ۙۙۘۥ۠ۥ۫ۚۥۜۘ"
            r3 = r2
            goto L_0x0023
        L_0x026c:
            java.lang.String r2 = "ۥۨۜۤۘۥۘۜۥۜۧ۠ۖۘۢۘۡۘۖۙ۟ۛ۬ۙ"
            r3 = r2
            goto L_0x0023
        L_0x0271:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.youbasha.ui.views.CustomListAdapter.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public void updateData(ArrayList<String> arrayList) {
        String str = "ۡ۫۬ۘۧ۠ۙۖۘۨۤ۟ۦۦۘۧۘ۠۟ۤ۠";
        while (true) {
            switch ((str.hashCode() ^ 698) ^ 386751549) {
                case -1395462268:
                    notifyDataSetChanged();
                    str = "ۛ۠۫ۡۜۦۘۤۤۜ۫ۗۢۙۤۦۛ۬ۡۘ";
                    break;
                case -816612207:
                    return;
                case -413694730:
                    str = "ۡۥ۬ۙۨۚۦۚۢۡۙۦۗۥۚۨۛۛ";
                    break;
                case -26828616:
                    this.f1346b = arrayList;
                    str = "ۛۙۥۖۚۦۘۡۜ۠ۙۗۙۨۨۜۘ۟ۨۢۘۛۢۥۤۗ";
                    break;
                case 1988619562:
                    str = "ۧۗۥۘۧۗۘۘۗۨۦۜۢۦۘ۠۠۠ۙۨۦۘۜ۬ۦۘۚۧ۠۬ۗۜۘ";
                    break;
            }
        }
    }
}
