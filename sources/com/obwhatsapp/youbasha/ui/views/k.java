package com.obwhatsapp.youbasha.ui.views;

import X.C005602k;
import X.C16820th;
import X.C25791Ld;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.obwhatsapp.status.StatusesFragment;
import com.obwhatsapp.yo.shp;
import com.obwhatsapp.yo.yo;
import rc.whatsapp.stories.value.Stories;

class k extends RecyclerView.Adapter<j> {

    /* renamed from: c  reason: collision with root package name */
    public static boolean f1479c;

    /* renamed from: d  reason: collision with root package name */
    public static C16820th f1480d;

    /* renamed from: e  reason: collision with root package name */
    public static C25791Ld f1481e;

    /* renamed from: a  reason: collision with root package name */
    public final View.OnClickListener f1482a = null;

    /* renamed from: b  reason: collision with root package name */
    public final int f1483b = Stories.storyLayout();

    public k() {
        f1479c = shp.getBoolean("key_with_thumb");
    }

    public final int A0C() {
        StatusesFragment statusesFragment = null;
        String str = "ۢۚۛۨۦۡۧ۟۫۬ۛۢ۟ۡۧۥۘۘ۬۟۬ۨۨۖ";
        while (true) {
            switch ((str.hashCode() ^ 366) ^ 322687762) {
                case -285689568:
                    return statusesFragment.A12.size();
                case -88982687:
                    str = "ۧ۟ۙ۟ۧۦۛۥۨ۫ۡۘۖۡۧۥۙۧ۫ۘۙۦۧۖۘ";
                    break;
                case 615296831:
                    String str2 = "ۥۛۚ۟ۡ۫۫ۜ۠ۜۦۘ۠";
                    while (true) {
                        switch (str2.hashCode() ^ -1116958794) {
                            case -1633436048:
                                str2 = "ۛۚۚۢۘۖۘۙۦۛ۠۬ۘۤۚۥۗۨۙۗۥ۫ۛۦۦ";
                                break;
                            case -805936278:
                                if (statusesFragment == null) {
                                    str2 = "ۘۢۥۘۘۖ۠ۖ۟ۖۘۗۥۜۥۤۥۘۖ۟ۥۤۤۢۢۖۡۚۥۥۘ";
                                    break;
                                } else {
                                    str2 = "ۙ۫ۜۙۡۘۛۚ۠ۦۢۜۡۢۡۡۢۨۘ۬ۥ۬ۥۙۡ";
                                    break;
                                }
                            case 1190516931:
                                str = "ۚۢۨۘۢۢۨۘۢۤۘۘ۠ۜ۟ۛۚۨۤۜۦۘ";
                                continue;
                            case 1605656126:
                                str = "۟ۜۛۥۡۦ۠۫ۙۜۧ۫ۚ";
                                continue;
                        }
                    }
                    break;
                case 1592579462:
                    return 0;
                case 1838947723:
                    statusesFragment = yo.mInnerStatusesFragment;
                    str = "ۢ۟ۡ۠ۡۖۘۙ۬ۘۥۥۥۘ۫ۖ۟";
                    break;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x07c5, code lost:
        r6 = "ۥۤۨۘۜۗۦۘۛ۠ۚ۟ۘۦۡۧ۠ۘۤۨۤۗۡ۟۬ۦۘۧ۟ۜۘ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x07d9, code lost:
        r6 = "ۗۖۨۘۘۧۦۖۖۢۖۚ۬ۚۙ۬ۡ۬ۢ۬ۢۦۘۥۜۜ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x07ed, code lost:
        r6 = "ۛۡۧۘۚۙۨۘ۠ۛۘۘۤۧۛۙۚ۟ۜۨ۟ۢۨۘۘۜۗ۟ۘ۠ۘۘ";
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void ANf(X.C005602k r55, int r56) {
        /*
            r54 = this;
            r51 = 0
            r4 = 0
            r50 = 0
            r9 = 0
            r49 = 0
            r48 = 0
            r5 = 0
            r47 = 0
            r45 = 0
            r46 = 0
            r43 = 0
            r44 = 0
            r42 = 0
            r41 = 0
            r40 = 0
            r39 = 0
            r37 = 0
            r38 = 0
            r36 = 0
            r35 = 0
            r34 = 0
            r33 = 0
            r32 = 0
            r31 = 0
            r30 = 0
            r29 = 0
            r28 = 0
            r26 = 0
            r27 = 0
            r25 = 0
            r24 = 0
            r22 = 0
            r23 = 0
            r21 = 0
            r20 = 0
            r19 = 0
            r18 = 0
            r17 = 0
            r16 = 0
            r15 = 0
            r13 = 0
            r14 = 0
            r12 = 0
            r11 = 0
            r10 = 0
            r7 = 0
            r8 = 0
            java.lang.String r3 = "ۡۚۘ۬ۘۤۙۚۥۘۗ۬ۥۗۢۘۘۧۛۘۙۥۘ"
            r6 = r3
        L_0x0056:
            int r3 = r6.hashCode()
            r52 = 232(0xe8, float:3.25E-43)
            r53 = -2057425979(0xffffffff855e2bc5, float:-1.0446429E-35)
            r3 = r3 ^ r52
            r3 = r3 ^ r53
            switch(r3) {
                case -2112770240: goto L_0x014a;
                case -2088268264: goto L_0x066f;
                case -2018322166: goto L_0x04d8;
                case -1972530074: goto L_0x06a6;
                case -1963818865: goto L_0x0785;
                case -1962453880: goto L_0x052e;
                case -1866566974: goto L_0x02eb;
                case -1858447350: goto L_0x038f;
                case -1835949259: goto L_0x008a;
                case -1834442978: goto L_0x039a;
                case -1769459523: goto L_0x007c;
                case -1725503995: goto L_0x025c;
                case -1692237610: goto L_0x01d4;
                case -1610155241: goto L_0x0541;
                case -1590810441: goto L_0x05fd;
                case -1587391797: goto L_0x0209;
                case -1464410470: goto L_0x0132;
                case -1446867719: goto L_0x059c;
                case -1416631624: goto L_0x073f;
                case -1399861151: goto L_0x05c7;
                case -1396660452: goto L_0x0706;
                case -1393071064: goto L_0x046b;
                case -1367034922: goto L_0x00d7;
                case -1300657648: goto L_0x02e0;
                case -1283029806: goto L_0x0097;
                case -1263254746: goto L_0x0125;
                case -1190993546: goto L_0x07a1;
                case -1190050211: goto L_0x060b;
                case -1186465691: goto L_0x04ca;
                case -1182712480: goto L_0x02ce;
                case -1140718510: goto L_0x0535;
                case -1130141363: goto L_0x0527;
                case -1128700262: goto L_0x0268;
                case -1073618067: goto L_0x0175;
                case -1040171860: goto L_0x06be;
                case -1017239076: goto L_0x0664;
                case -1012940389: goto L_0x070c;
                case -959052957: goto L_0x0311;
                case -877346253: goto L_0x00f1;
                case -852826305: goto L_0x0298;
                case -806245911: goto L_0x0151;
                case -789099960: goto L_0x054c;
                case -775648717: goto L_0x03cb;
                case -761761752: goto L_0x04d1;
                case -755426106: goto L_0x036e;
                case -704638063: goto L_0x006b;
                case -704546589: goto L_0x07d4;
                case -656466088: goto L_0x0453;
                case -636992489: goto L_0x00b5;
                case -612270941: goto L_0x07de;
                case -593411129: goto L_0x006f;
                case -560575610: goto L_0x075b;
                case -543375674: goto L_0x031c;
                case -519797419: goto L_0x04df;
                case -494775650: goto L_0x013f;
                case -492334301: goto L_0x03f3;
                case -464984311: goto L_0x0519;
                case -271161719: goto L_0x017c;
                case -219340229: goto L_0x0067;
                case -175121473: goto L_0x00e3;
                case -134967591: goto L_0x0251;
                case -24076706: goto L_0x0197;
                case 9240969: goto L_0x01c3;
                case 124357963: goto L_0x04f6;
                case 136066615: goto L_0x06fd;
                case 173736795: goto L_0x0210;
                case 178676862: goto L_0x0553;
                case 225193004: goto L_0x0306;
                case 345640494: goto L_0x04a0;
                case 381241376: goto L_0x0755;
                case 383908121: goto L_0x010f;
                case 471800018: goto L_0x0092;
                case 472687980: goto L_0x057b;
                case 525590064: goto L_0x01b6;
                case 578610825: goto L_0x0432;
                case 578784598: goto L_0x0183;
                case 589691880: goto L_0x07f7;
                case 591605964: goto L_0x0806;
                case 666519339: goto L_0x0202;
                case 673978748: goto L_0x018e;
                case 725495754: goto L_0x06c7;
                case 742434515: goto L_0x0073;
                case 817479268: goto L_0x047d;
                case 838629573: goto L_0x078b;
                case 853054370: goto L_0x028d;
                case 872782413: goto L_0x0795;
                case 893308038: goto L_0x011a;
                case 945202863: goto L_0x00cd;
                case 957484073: goto L_0x0273;
                case 973736472: goto L_0x035e;
                case 979641719: goto L_0x065b;
                case 1017245863: goto L_0x068e;
                case 1018404613: goto L_0x0567;
                case 1024265542: goto L_0x02a3;
                case 1054998679: goto L_0x0737;
                case 1057496469: goto L_0x072e;
                case 1109589749: goto L_0x06cd;
                case 1127648848: goto L_0x0645;
                case 1145502877: goto L_0x077e;
                case 1154948637: goto L_0x03c0;
                case 1180561202: goto L_0x0619;
                case 1242967290: goto L_0x063a;
                case 1368454408: goto L_0x0520;
                case 1377077139: goto L_0x07d4;
                case 1386021985: goto L_0x05a5;
                case 1395547873: goto L_0x033b;
                case 1398657021: goto L_0x024a;
                case 1477772739: goto L_0x0627;
                case 1491543917: goto L_0x0719;
                case 1499043588: goto L_0x02c2;
                case 1501698385: goto L_0x023f;
                case 1563022041: goto L_0x064d;
                case 1598042679: goto L_0x0280;
                case 1628988450: goto L_0x03da;
                case 1699904567: goto L_0x01db;
                case 1769530751: goto L_0x0801;
                case 1769918459: goto L_0x041a;
                case 1819041818: goto L_0x0104;
                case 1837131694: goto L_0x0725;
                case 1888674557: goto L_0x02f6;
                case 1901852787: goto L_0x05b4;
                case 1950734504: goto L_0x06e5;
                case 1960832118: goto L_0x07e8;
                case 2022110940: goto L_0x05ec;
                case 2059214814: goto L_0x04ea;
                case 2077093346: goto L_0x00fa;
                case 2093549573: goto L_0x04c3;
                case 2102643245: goto L_0x0217;
                default: goto L_0x0066;
            }
        L_0x0066:
            goto L_0x0056
        L_0x0067:
            java.lang.String r3 = "ۢۡۦۥ۬ۛ۬ۡۨۜۨۧۘ۠ۙۖۘۥۦۖۘ۟ۤۢ"
            r6 = r3
            goto L_0x0056
        L_0x006b:
            java.lang.String r3 = "ۚۙۛۚۡۡۘۨۗۙۨۚۘۘ۠ۤۘۘ۬ۧۡ۠ۡۨۜۨۨۘ۫ۤۦ"
            r6 = r3
            goto L_0x0056
        L_0x006f:
            java.lang.String r3 = "ۧۥۦۦۢۦ۬ۤۙۖۙۤۙۧۢۛۜۖۘ۫ۙۡ"
            r6 = r3
            goto L_0x0056
        L_0x0073:
            r3 = r55
            com.obwhatsapp.youbasha.ui.views.j r3 = (com.obwhatsapp.youbasha.ui.views.j) r3
            java.lang.String r6 = "ۤ۬ۤۙۦۘۨۜۦۘۛۜۢۚۚۨۦۗۘ۟ۥۘۚ۟ۜ"
            r51 = r3
            goto L_0x0056
        L_0x007c:
            com.obwhatsapp.status.StatusesFragment r3 = com.obwhatsapp.yo.yo.mInnerStatusesFragment
            java.util.List r3 = r3.A12
            r0 = r56
            java.lang.Object r4 = r3.get(r0)
            java.lang.String r3 = "ۥۨۧۨۗ۟ۜۥۦۚۥۢۨۨۥۘۘۤۘۗۡ۬ۨۗۖ"
            r6 = r3
            goto L_0x0056
        L_0x008a:
            boolean r0 = r4 instanceof X.C63303Gx
            r50 = r0
            java.lang.String r3 = "۬ۡۖۘۘۚۜۢۤۘۧ۟ۜۖۢۖۘ"
            r6 = r3
            goto L_0x0056
        L_0x0092:
            r9 = 0
            java.lang.String r3 = "۠ۗۥۘۛۨۦۘۖۤۨۥۖۢۥ۫ۡۘۧۤۧۨ۫ۜۘۨۡۢ۠ۢ"
            r6 = r3
            goto L_0x0056
        L_0x0097:
            r6 = -381263835(0xffffffffe9466025, float:-1.4988834E25)
            java.lang.String r3 = "۠۬۫ۚ۠ۨۚۘۖۘۚ۬ۡۘ۠۬ۡ۟ۘۗۥۙۜۘۖۖۨۘۡۦۡۘ"
        L_0x009c:
            int r52 = r3.hashCode()
            r52 = r52 ^ r6
            switch(r52) {
                case -2047134716: goto L_0x07b1;
                case -1710680905: goto L_0x00b2;
                case -802182028: goto L_0x00a6;
                case 1160032468: goto L_0x00ad;
                default: goto L_0x00a5;
            }
        L_0x00a5:
            goto L_0x009c
        L_0x00a6:
            java.lang.String r3 = "ۗۚۨۘۡۤۜۖ۬ۚۚ۬ۦۡۥۖۡۤۚۤۛۖۘۤۚۨۘ"
            r6 = r3
            goto L_0x0056
        L_0x00aa:
            java.lang.String r3 = "ۤۘۛۚۤۖۜ۠۬ۖۧ۟ۖۨۘۨۖۘ۬ۜۖۘ"
            goto L_0x009c
        L_0x00ad:
            if (r50 != 0) goto L_0x00aa
            java.lang.String r3 = "ۡ۫ۡۘۚۖۥۘ۠ۤۙۛ۟ۡۛۚ۠ۚۙۨۢۗۜ۟۬ۚۘ"
            goto L_0x009c
        L_0x00b2:
            java.lang.String r3 = "ۜۘۥۘۦۤۢ۫ۧۗۘۢۘۘۛ۠ۖۙۤۡۘۨۨ۬ۚۤۤ"
            goto L_0x009c
        L_0x00b5:
            r0 = r51
            android.widget.FrameLayout r3 = r0.f1465e
            android.widget.RelativeLayout$LayoutParams r6 = new android.widget.RelativeLayout$LayoutParams
            r52 = 0
            r53 = 0
            r0 = r52
            r1 = r53
            r6.<init>(r0, r1)
            r3.setLayoutParams(r6)
            java.lang.String r3 = "ۚۘۘۚۥ۬ۘ۠۠ۨۥۘۘۨۤۜ"
            r6 = r3
            goto L_0x0056
        L_0x00cd:
            r3 = 0
            r0 = r51
            r0.A04(r3)
            java.lang.String r3 = "ۡ۬ۖۘۖ۠۫ۥۚۙۦۗۚۙۡۜۘۥۥۘ"
            r6 = r3
            goto L_0x0056
        L_0x00d7:
            r3 = r4
            X.3Gx r3 = (X.C63303Gx) r3
            X.1dI r0 = r3.A01
            r49 = r0
            java.lang.String r3 = "ۘۖ۟ۢۡۨۡۜ۬ۖۚۛۛۜۘۢ۫ۘۘۥۜۛ"
            r6 = r3
            goto L_0x0056
        L_0x00e3:
            android.widget.RelativeLayout$LayoutParams r48 = new android.widget.RelativeLayout$LayoutParams
            r3 = -2
            r6 = -2
            r0 = r48
            r0.<init>(r3, r6)
            java.lang.String r3 = "ۧۖۧۖۧۡ۫ۢۖۘۙۥۨۙ۟ۥۛۜ۠ۖۤۘۤۧۜۘ"
            r6 = r3
            goto L_0x0056
        L_0x00f1:
            r0 = r51
            android.widget.FrameLayout r5 = r0.f1465e
            java.lang.String r3 = "ۙۜۡۘۖۙۥۘۧۖۦۘۛۨۧۧۢۢ۠ۡۗۢۨ۠ۘۗۚۨ"
            r6 = r3
            goto L_0x0056
        L_0x00fa:
            r0 = r48
            r5.setLayoutParams(r0)
            java.lang.String r3 = "ۧۤۡ۟ۦۨۘۘۡۧ۠ۧۜۘۧۨۨۘ"
            r6 = r3
            goto L_0x0056
        L_0x0104:
            r0 = r51
            com.obwhatsapp.status.ContactStatusThumbnail r0 = r0.f1464d
            r47 = r0
            java.lang.String r3 = "ۦۚۗۛ۬ۖۘ۠۠ۜۢۗ۠ۙۖۧۘۤۘۡۘۥۖۖۘۦۛۥۘۥۤ۬"
            r6 = r3
            goto L_0x0056
        L_0x010f:
            r3 = 0
            r0 = r47
            r0.setImageDrawable(r3)
            java.lang.String r3 = "ۢۤۜۙۦۘۘۢۙۥۢ۫ۢۨۡۘۘ"
            r6 = r3
            goto L_0x0056
        L_0x011a:
            r0 = r49
            r1 = r51
            r1.f1473m = r0
            java.lang.String r3 = "۫۟۠ۚۛ۟ۤۜۦۘ۫ۙۛ۬ۙۖۘۙۚ۠۬ۧۨۙۖ"
            r6 = r3
            goto L_0x0056
        L_0x0125:
            r0 = r49
            com.whatsapp.jid.UserJid r3 = r0.A0B
            java.lang.String r45 = com.obwhatsapp.yo.dep.getJID_t(r3)
            java.lang.String r3 = "ۚۥ۬ۢۘۧۘۧۧۧ۟ۙۛۤۢۘۜۥۜۥۚ۬ۙۗ۠ۧۦۜ"
            r6 = r3
            goto L_0x0056
        L_0x0132:
            java.lang.String r3 = "status_me"
            r0 = r45
            boolean r46 = r0.equals(r3)
            java.lang.String r3 = "ۜۢۢۢۛۨۗۚ۠ۦۨ۠ۘۥۚۘۡۡۘ۠۟۫"
            r6 = r3
            goto L_0x0056
        L_0x013f:
            r0 = r46
            r1 = r51
            r1.f1475o = r0
            java.lang.String r3 = "ۙ۫ۨ۬ۚۧۜ۟ۥۥۨۦۘۡۖۖ"
            r6 = r3
            goto L_0x0056
        L_0x014a:
            java.lang.String r3 = "۟ۖۛۜ۫ۘۘۙۙۘۘۢۤۙۧۜۦۗۦۘۘۗۙۛۤ۫ۦۗۜ۫"
            r6 = r3
            r44 = r45
            goto L_0x0056
        L_0x0151:
            r6 = 653069391(0x26ed0c4f, float:1.6448515E-15)
            java.lang.String r3 = "ۜۚۙۚۘۡۘۜۘۨۤۜۘ۟ۨۡۘ۠ۗ۫"
        L_0x0156:
            int r52 = r3.hashCode()
            r52 = r52 ^ r6
            switch(r52) {
                case -825903862: goto L_0x0160;
                case 144132039: goto L_0x0170;
                case 279094143: goto L_0x0168;
                case 1383653777: goto L_0x016d;
                default: goto L_0x015f;
            }
        L_0x015f:
            goto L_0x0156
        L_0x0160:
            java.lang.String r3 = "ۘۗۚۜ۟۟ۛ۫ۛۡۜ۠ۘۘ"
            r6 = r3
            goto L_0x0056
        L_0x0165:
            java.lang.String r3 = "۬ۗۧۜۗۦۘۥۦۖۘۨۢۥۘۥۙۨۚ۫ۥۘۗۗۤ"
            goto L_0x0156
        L_0x0168:
            if (r46 == 0) goto L_0x0165
            java.lang.String r3 = "ۘ۟ۢ۫ۧۤۨ۠۠ۥ۬ۖۘۤۚۨۘۦۤۤۛۜۛ"
            goto L_0x0156
        L_0x016d:
            java.lang.String r3 = "ۡۥۧۢ۬ۘۥۗۦۘۤ۟ۘۘ۠ۧۡۘ"
            goto L_0x0156
        L_0x0170:
            java.lang.String r3 = "ۖۖ۠ۛۥۙ۟ۥۘ۫ۢۡۘۛۙۖۘ۫ۖۜ"
            r6 = r3
            goto L_0x0056
        L_0x0175:
            java.lang.String r43 = com.obwhatsapp.yo.dep.myNum
            java.lang.String r3 = "ۜ۬ۘۙۛ۟۬ۤۗۦ۬۫ۡۦۦۘۢۘۥۘ۟ۨ"
            r6 = r3
            goto L_0x0056
        L_0x017c:
            java.lang.String r3 = "ۘۗۚۜ۟۟ۛ۫ۛۡۜ۠ۘۘ"
            r6 = r3
            r44 = r43
            goto L_0x0056
        L_0x0183:
            r0 = r44
            r1 = r51
            r1.f1474n = r0
            java.lang.String r3 = "ۦ۠ۥۜۘۤۗ۟۟۠ۥۡۗۜۘ"
            r6 = r3
            goto L_0x0056
        L_0x018e:
            com.whatsapp.jid.UserJid r42 = com.whatsapp.jid.UserJid.getNullable(r44)
            java.lang.String r3 = "ۡۚۥۤۚۢۘۦۖ۫ۧۜۘۨۡ۬"
            r6 = r3
            goto L_0x0056
        L_0x0197:
            r6 = -1158930810(0xffffffffbaec1e86, float:-0.0018014468)
            java.lang.String r3 = "ۥۨ۠۫ۘۥۘۛ۫ۗ۟ۦۦۘۛ۟ۘۘۥ۠ۚ۫ۧۖۘ"
        L_0x019c:
            int r52 = r3.hashCode()
            r52 = r52 ^ r6
            switch(r52) {
                case -1602433932: goto L_0x07b6;
                case -350705594: goto L_0x01a6;
                case 531652822: goto L_0x01b3;
                case 1088794768: goto L_0x01ae;
                default: goto L_0x01a5;
            }
        L_0x01a5:
            goto L_0x019c
        L_0x01a6:
            java.lang.String r3 = "ۨ۠۫ۧ۟ۧ۟ۤۘۘۦ۠ۙۧۛۜۦۧۦۘ"
            r6 = r3
            goto L_0x0056
        L_0x01ab:
            java.lang.String r3 = "ۧۖۖۘ۟ۜۦۢۦۖ۟ۤۘۘۦۙۘۘ"
            goto L_0x019c
        L_0x01ae:
            if (r42 == 0) goto L_0x01ab
            java.lang.String r3 = "ۗۚۥۜ۫ۤۥۖۨۘ۠ۛۡۘۢۡۨۘۚۚۙۙۥ۠"
            goto L_0x019c
        L_0x01b3:
            java.lang.String r3 = "ۖۖۡۤ۬۠ۖۤۥۘۚۛۨۘۙۖۧۘ۟ۘۛۘۤۗ"
            goto L_0x019c
        L_0x01b6:
            boolean r3 = com.obwhatsapp.yo.dep.isContactMuted(r42)
            r0 = r51
            r0.f1476p = r3
            java.lang.String r3 = "ۡۛۗ۠۬ۖۡۢ۟۟۫ۘۨۦۙۧۨۥ"
            r6 = r3
            goto L_0x0056
        L_0x01c3:
            r0 = r51
            java.lang.String r3 = r0.f1474n
            java.lang.String r3 = com.obwhatsapp.yo.yo.stripJID(r3)
            java.lang.String r41 = com.obwhatsapp.yo.dep.getContactName(r3)
            java.lang.String r3 = "۬ۜۚۡۧ۠ۦۤۗ۟ۡۘۨۦۦ"
            r6 = r3
            goto L_0x0056
        L_0x01d4:
            java.lang.String r3 = "ۢۙۦۘۢۘۙۡ۫۬۟ۥۤۛ۫۠"
            r6 = r3
            r39 = r41
            goto L_0x0056
        L_0x01db:
            r6 = 1601820205(0x5f79d62d, float:1.8002626E19)
            java.lang.String r3 = "ۥۚۘۢۜ۟ۜۙۦ۫۬ۡۚ۬ۨ۬ۡ"
        L_0x01e0:
            int r52 = r3.hashCode()
            r52 = r52 ^ r6
            switch(r52) {
                case -1417887489: goto L_0x01ea;
                case -358526798: goto L_0x01fa;
                case -74174478: goto L_0x07bb;
                case 1326374082: goto L_0x01fd;
                default: goto L_0x01e9;
            }
        L_0x01e9:
            goto L_0x01e0
        L_0x01ea:
            java.lang.String r3 = "0"
            r0 = r41
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x01f7
            java.lang.String r3 = "ۤۥۢۖۙۖۢۘۘ۟ۢۚۚۙۥ"
            goto L_0x01e0
        L_0x01f7:
            java.lang.String r3 = "۬ۘۚۚۧۚۜۘ۟۟ۘۡۥۛۙ"
            goto L_0x01e0
        L_0x01fa:
            java.lang.String r3 = "ۙ۠ۥۛۢۜۧ۬ۘ۫ۘۖۖۚۤۧۧۜۘ"
            goto L_0x01e0
        L_0x01fd:
            java.lang.String r3 = "ۙۤۢۖۥۜۚۡۨۘۛۥۥۘ۫۠ۥ"
            r6 = r3
            goto L_0x0056
        L_0x0202:
            java.lang.String r40 = com.obwhatsapp.yo.yo.pname
            java.lang.String r3 = "ۛۧۚۨۡۤ۟۫ۧۤۡۘۘ۫ۖ۬"
            r6 = r3
            goto L_0x0056
        L_0x0209:
            java.lang.String r3 = "ۖۦۨۤۖۘۘۡۚ۟ۜ۠ۨۘ۬ۥ۟"
            r6 = r3
            r39 = r40
            goto L_0x0056
        L_0x0210:
            java.lang.String r3 = "ۢۙۦۖۡۥۙۤۨۘ۟ۦۘۘۨۨۥۜۦۧۘۜۗۦۘ"
            r6 = r3
            r38 = r39
            goto L_0x0056
        L_0x0217:
            r6 = -1800736552(0xffffffff94aaf0d8, float:-1.726061E-26)
            java.lang.String r3 = "ۘۗۤۗۜۖۚۨۡۘۗۥۖ۠ۖۖۦۘۡۦۘ"
        L_0x021c:
            int r52 = r3.hashCode()
            r52 = r52 ^ r6
            switch(r52) {
                case -1079559823: goto L_0x023a;
                case -603515537: goto L_0x0237;
                case -423828256: goto L_0x022e;
                case 112753830: goto L_0x0226;
                default: goto L_0x0225;
            }
        L_0x0225:
            goto L_0x021c
        L_0x0226:
            java.lang.String r3 = "۬۠ۧ۫۠ۨۘۢۛۢۥۢۜۘۢۜۘ"
            r6 = r3
            goto L_0x0056
        L_0x022b:
            java.lang.String r3 = "ۤۢۧۙۗۦۥۤۧۗۥۥ۬ۛۛ"
            goto L_0x021c
        L_0x022e:
            r0 = r51
            boolean r3 = r0.f1475o
            if (r3 == 0) goto L_0x022b
            java.lang.String r3 = "۠ۢۙۤۦۚ۠ۥۨۨۗۖۘۚۦۘۘۤۦۘ"
            goto L_0x021c
        L_0x0237:
            java.lang.String r3 = "ۨۙۘ۫ۛۙۗۙۥۜۤۗۢۖۘۡۛۙ"
            goto L_0x021c
        L_0x023a:
            java.lang.String r3 = "۫ۡۥ۟ۨۥۖۡ۫ۨۢۛۤۛۤۜۦۚۖ۠ۢۙۛۥۘ"
            r6 = r3
            goto L_0x0056
        L_0x023f:
            java.lang.String r3 = "you"
            java.lang.String r37 = com.obwhatsapp.yo.yo.getString((java.lang.String) r3)
            java.lang.String r3 = "ۗۗۗ۫ۢۡ۫ۘ۬۟ۛۤۤۘۤۗۦۖۚۨ۫ۤۤۘۘۙ۟۠"
            r6 = r3
            goto L_0x0056
        L_0x024a:
            java.lang.String r3 = "۬۠ۧ۫۠ۨۘۢۛۢۥۢۜۘۢۜۘ"
            r6 = r3
            r38 = r37
            goto L_0x0056
        L_0x0251:
            r0 = r51
            com.obwhatsapp.TextEmojiLabel r0 = r0.f1463c
            r36 = r0
            java.lang.String r3 = "ۤ۫۬ۜۤۥۘ۬ۢۜۘۘۥۜۘۜۘۘۙۙۗۙۘۦۨ۫ۤۛۜۙ"
            r6 = r3
            goto L_0x0056
        L_0x025c:
            r0 = r36
            r1 = r38
            r0.setText(r1)
            java.lang.String r3 = "ۡۡۗۧۥۥۨۢ۠ۘ۟ۜۚۤۥۛۢۢۘۚۥۛۛۙ۬ۘۘ"
            r6 = r3
            goto L_0x0056
        L_0x0268:
            r0 = r51
            X.1dI r0 = r0.f1473m
            r35 = r0
            java.lang.String r3 = "۫ۙۤۖۧۙۜۤۦۘۢۧۗۤۤۜۘۧ۬۫"
            r6 = r3
            goto L_0x0056
        L_0x0273:
            r0 = r35
            int r3 = r0.A01
            r0 = r51
            r0.f1478r = r3
            java.lang.String r3 = "ۗۛۢۡۜۢ۫ۜ۫ۥۜۨ۫۠ۛ۫ۙۦۙۥۘ"
            r6 = r3
            goto L_0x0056
        L_0x0280:
            r0 = r35
            int r3 = r0.A00
            r0 = r51
            r0.f1477q = r3
            java.lang.String r3 = "ۜ۬ۚۤ۠ۚۦۥۘ۫ۙۜ۬ۡۧۘ"
            r6 = r3
            goto L_0x0056
        L_0x028d:
            r0 = r51
            boolean r0 = r0.f1476p
            r34 = r0
            java.lang.String r3 = "۟ۚ۠ۜۙۧۨۥۦۡ۟ۖۘۙۨۜۘ۠ۖۗ"
            r6 = r3
            goto L_0x0056
        L_0x0298:
            r0 = r51
            android.view.ViewGroup r0 = r0.f1461a
            r33 = r0
            java.lang.String r3 = "ۗۢۘۘۘۚ۬۬ۥۨ۠ۢۦۦۗۢۡۚۡۘۡۨۨۡۘ"
            r6 = r3
            goto L_0x0056
        L_0x02a3:
            r6 = 990905059(0x3b1002e3, float:0.0021974377)
            java.lang.String r3 = "ۦ۠ۦۘۡۗۘۘ۫ۚۦۘ۟ۦۨۘۧۢۤ"
        L_0x02a8:
            int r52 = r3.hashCode()
            r52 = r52 ^ r6
            switch(r52) {
                case -1130326228: goto L_0x02b8;
                case -1097992887: goto L_0x07c0;
                case -411857104: goto L_0x02bd;
                case 874796512: goto L_0x02b2;
                default: goto L_0x02b1;
            }
        L_0x02b1:
            goto L_0x02a8
        L_0x02b2:
            java.lang.String r3 = "ۚۧ۬ۖۙۘۘ۬ۥۧۢۧۤۢۤۙۤۚۛۢۨۚ"
            goto L_0x02a8
        L_0x02b5:
            java.lang.String r3 = "ۖ۬ۙ۫ۧۡۡ۟ۢۙۥۖۙۛۘۘ"
            goto L_0x02a8
        L_0x02b8:
            if (r34 == 0) goto L_0x02b5
            java.lang.String r3 = "ۖۗ۠ۖۙۧۗۥۧۘۥۦۡۗۤۢۚۙۛ"
            goto L_0x02a8
        L_0x02bd:
            java.lang.String r3 = "ۨۡۖۗۥۙۦۘۘۧ۬ۜۤۡۜۦۗۚ"
            r6 = r3
            goto L_0x0056
        L_0x02c2:
            r3 = 1048576000(0x3e800000, float:0.25)
            r0 = r33
            r0.setAlpha(r3)
            java.lang.String r3 = "ۧۦ۬ۡۥۦ۠ۢۘۥۛۚۦۨۦۘۥۡۛۙۨۗۜۦۗ"
            r6 = r3
            goto L_0x0056
        L_0x02ce:
            r0 = r51
            java.lang.String r3 = r0.f1474n
            r0 = r51
            boolean r6 = r0.f1475o
            r0 = r47
            z.j.h(r0, r3, r6)
            java.lang.String r3 = "ۢۡۛ۫ۛ۬۫ۚۨۧۜۦۢ۫۠ۦۖۜۡۘۡ"
            r6 = r3
            goto L_0x0056
        L_0x02e0:
            r0 = r51
            java.lang.String r0 = r0.f1474n
            r32 = r0
            java.lang.String r3 = "۬ۗۤ۬۬۬ۢۚۡۡۛۨۘۗۘۦ۬ۛۨۡۥ۬۬ۧۜۘۛۚۙ"
            r6 = r3
            goto L_0x0056
        L_0x02eb:
            r0 = r51
            boolean r0 = r0.f1475o
            r31 = r0
            java.lang.String r3 = "ۢۚۘۘۥۨۨۡۗۖۙۨ۟۬۠ۜۖۙۨۘۗۡۥۘ۫ۨۨ"
            r6 = r3
            goto L_0x0056
        L_0x02f6:
            r0 = r51
            android.widget.ImageView r3 = r0.f1467g
            r0 = r32
            r1 = r31
            z.j.h(r3, r0, r1)
            java.lang.String r3 = "ۥۘۗ۠ۢۖۦ۟ۖ۫ۗۦۘۗۛ۟ۙۨۖۘ"
            r6 = r3
            goto L_0x0056
        L_0x0306:
            r0 = r51
            boolean r0 = r0.f1475o
            r30 = r0
            java.lang.String r3 = "۬ۢۥۚۚۦ۬ۙۨۘ۫ۖۡۗۜ۠ۢۥۨۚۦۘۘۢۘ"
            r6 = r3
            goto L_0x0056
        L_0x0311:
            r0 = r51
            android.widget.ImageView r0 = r0.f1466f
            r29 = r0
            java.lang.String r3 = "ۖۖۨۘۜۚۡ۟۠ۜۘ۫۫ۦ۟ۘۚ"
            r6 = r3
            goto L_0x0056
        L_0x031c:
            r6 = -748330188(0xffffffffd3656334, float:-9.8521186E11)
            java.lang.String r3 = "ۢۧۙۚۧۘ۬ۤۧ۫ۖ۟ۧ۠ۨۘۙ۟ۨ"
        L_0x0321:
            int r52 = r3.hashCode()
            r52 = r52 ^ r6
            switch(r52) {
                case -2039076881: goto L_0x07c5;
                case -1084705975: goto L_0x0333;
                case 82472925: goto L_0x032b;
                case 1944146294: goto L_0x0338;
                default: goto L_0x032a;
            }
        L_0x032a:
            goto L_0x0321
        L_0x032b:
            java.lang.String r3 = "ۘ۠ۘ۠ۚۥۘۢ۟ۦۨۡۖ۟ۚۡۜۘۜۖۚۙۦۨ"
            r6 = r3
            goto L_0x0056
        L_0x0330:
            java.lang.String r3 = "ۡۘۖۘ۟ۢ۫ۦۚ۫ۦ۠۫۫ۢۘۘۗۥۘۤۢۜۘۛۤۨ"
            goto L_0x0321
        L_0x0333:
            if (r30 == 0) goto L_0x0330
            java.lang.String r3 = "ۥۚۘۛ۫۫۟ۡۖۤۘ۬ۗۜۚۥۡ۠۠ۘۛ۟ۧۤۤۗۙ"
            goto L_0x0321
        L_0x0338:
            java.lang.String r3 = "ۢۧ۠ۛ۬ۧۜۤۢۦ۫ۡ۟ۚۡ"
            goto L_0x0321
        L_0x033b:
            r6 = 995035661(0x3b4f0a0d, float:0.0031591684)
            java.lang.String r3 = "ۛۙۨۘۛۖۖ۠ۢۡ۠۫ۖۗۨۘۤ"
        L_0x0340:
            int r52 = r3.hashCode()
            r52 = r52 ^ r6
            switch(r52) {
                case -1056729378: goto L_0x07c5;
                case -760697477: goto L_0x0350;
                case 599061907: goto L_0x034a;
                case 2026795098: goto L_0x0359;
                default: goto L_0x0349;
            }
        L_0x0349:
            goto L_0x0340
        L_0x034a:
            java.lang.String r3 = "۬ۦۦۘ۟ۤۤۖۗ۟۠ۛۨۘ۫۫ۘ۟ۗۦۘۗ۬ۢۖ۠ۢ"
            goto L_0x0340
        L_0x034d:
            java.lang.String r3 = "۠ۜۤۛۚۡۗۜۙۦۢۡۘۤ۠ۙۢۖۦۘۧۗۙ"
            goto L_0x0340
        L_0x0350:
            r0 = r51
            int r3 = r0.f1477q
            if (r3 != 0) goto L_0x034d
            java.lang.String r3 = "ۚۘۖ۫ۧۜۘۛۥۧۘ۠۟ۥۘۗۦۦۘ"
            goto L_0x0340
        L_0x0359:
            java.lang.String r3 = "ۚ۬ۡۘۧۤۘۘۥۘۥ۠ۜۧۢۦۧۘۧۗۦۘۙۦۖۧۢۦۘ۬ۡ"
            r6 = r3
            goto L_0x0056
        L_0x035e:
            r0 = r51
            java.lang.String r3 = r0.f1474n
            r0 = r29
            r1 = r30
            z.j.h(r0, r3, r1)
            java.lang.String r3 = "ۤۙۘۘۜۡ۫۟ۛۨۘۘۢۚۙۧۘۘ۬۫ۜۘ۫ۛۗ۠ۚ۠ۖۨۧۘ"
            r6 = r3
            goto L_0x0056
        L_0x036e:
            r6 = 712915844(0x2a7e3b84, float:2.258038E-13)
            java.lang.String r3 = "ۙۦ۫۬ۘۧۥۥۧۘ۟ۥ۬ۡۧ"
        L_0x0373:
            int r52 = r3.hashCode()
            r52 = r52 ^ r6
            switch(r52) {
                case -110226017: goto L_0x07ca;
                case 324445450: goto L_0x038a;
                case 1371088090: goto L_0x0383;
                case 1965921600: goto L_0x037d;
                default: goto L_0x037c;
            }
        L_0x037c:
            goto L_0x0373
        L_0x037d:
            java.lang.String r3 = "ۘ۫ۚۢۖۘۘۢۥۙ۬۫ۤۘۙ۬ۡۥۥۘۘۜۦۘ"
            goto L_0x0373
        L_0x0380:
            java.lang.String r3 = "ۦ۫۬ۤۧۧۙۧ۟ۖۨۘۜۧۨۙ۬ۘۘ۠ۤ۟ۥۧۚ"
            goto L_0x0373
        L_0x0383:
            X.0th r3 = f1480d
            if (r3 != 0) goto L_0x0380
            java.lang.String r3 = "ۖۨۥ۫ۜ۬ۗ۟ۧۨۧۘۜۧۡۘ"
            goto L_0x0373
        L_0x038a:
            java.lang.String r3 = "۫ۡۜۘ۟ۗۜۘ۫ۧۜۤ۟ۢۘۙۦۘۤۚ۠۟ۚۖۘ"
            r6 = r3
            goto L_0x0056
        L_0x038f:
            X.0th r3 = X.C16820th.A21()
            f1480d = r3
            java.lang.String r3 = "ۙ۠ۙ۠ۡ۬۠ۢۦۘۤۢۥۘ۬ۡۧۘۙۨ"
            r6 = r3
            goto L_0x0056
        L_0x039a:
            r6 = -666660819(0xffffffffd843902d, float:-8.6009599E14)
            java.lang.String r3 = "ۧۦ۟ۗۖۖۘ۟ۚ۬ۛۘۘۚۤۡۘۘ۠ۨۘۘۙۗ"
        L_0x039f:
            int r52 = r3.hashCode()
            r52 = r52 ^ r6
            switch(r52) {
                case -1937474544: goto L_0x03b8;
                case 809386116: goto L_0x03a9;
                case 817436735: goto L_0x03b1;
                case 1611935201: goto L_0x03bb;
                default: goto L_0x03a8;
            }
        L_0x03a8:
            goto L_0x039f
        L_0x03a9:
            java.lang.String r3 = "ۙ۫ۡۡۖۖۘ۫ۡ۬۫۟ۧۙۤۘۘۧ۠ۡۘ"
            r6 = r3
            goto L_0x0056
        L_0x03ae:
            java.lang.String r3 = "۠ۜۡۡۜۤۘۦ۟ۡ۫ۥۛۧۢ۫ۗۤۧۤۜۘ۫ۚۚۢ۟ۨ"
            goto L_0x039f
        L_0x03b1:
            X.1Ld r3 = f1481e
            if (r3 != 0) goto L_0x03ae
            java.lang.String r3 = "ۚۦۚۥۨ۫ۜۛۧۖۚ۫ۦۗۥۘ"
            goto L_0x039f
        L_0x03b8:
            java.lang.String r3 = "ۥۚۙۤۦۥۘۖ۬ۡۘۛ۬ۦۥۜۘۥ۫ۦۘۤۤۗۖۢۥۘ"
            goto L_0x039f
        L_0x03bb:
            java.lang.String r3 = "ۗۛۘۥۧۥۥۥۜ۟۬۠ۗۨۧ"
            r6 = r3
            goto L_0x0056
        L_0x03c0:
            X.1Ld r3 = X.C25791Ld.A21()
            f1481e = r3
            java.lang.String r3 = "ۙ۫ۡۡۖۖۘ۫ۡ۬۫۟ۧۙۤۘۘۧ۠ۡۘ"
            r6 = r3
            goto L_0x0056
        L_0x03cb:
            r6 = -1664524137(0xffffffff9cc96097, float:-1.3326032E-21)
            java.lang.String r3 = "ۙۧ۫۟۠۠ۨۜۜۘ۟ۜۡۢۨۚۜۢ۟ۗ۟۬ۤ۠"
        L_0x03d0:
            int r52 = r3.hashCode()
            r52 = r52 ^ r6
            switch(r52) {
                case -1810608801: goto L_0x03eb;
                case 704309528: goto L_0x03ee;
                case 1275932668: goto L_0x03da;
                case 2072263998: goto L_0x03e2;
                default: goto L_0x03d9;
            }
        L_0x03d9:
            goto L_0x03d0
        L_0x03da:
            java.lang.String r3 = "ۘۢۖۙۦۜۘۘ۬۬ۤۥۤ۟۟ۘ۬ۡۘۤ۟ۚۖۖۨۘ"
            r6 = r3
            goto L_0x0056
        L_0x03df:
            java.lang.String r3 = "ۘ۟ۛۨ۟ۡ۠ۛۖۙ۠ۧۤۘۚ"
            goto L_0x03d0
        L_0x03e2:
            int r3 = rc.whatsapp.stories.value.Stories.storyStyle()
            if (r3 == 0) goto L_0x03df
            java.lang.String r3 = "ۥ۫۠ۗۛۨۡۧۘۘۙۨۦۦ۬ۥۘۡۙ۠"
            goto L_0x03d0
        L_0x03eb:
            java.lang.String r3 = "ۤۨۦۘۤۥۘ۠ۚۖۦ۬ۦۘۡ۟ۗۥۧۗ"
            goto L_0x03d0
        L_0x03ee:
            java.lang.String r3 = "ۜۖۥۘۨۨۖۘۙۤۖۘۢۦۘۢ۠ۗۥۢۨۧ۬ۨۘۡۛۧ"
            r6 = r3
            goto L_0x0056
        L_0x03f3:
            r6 = 1294796546(0x4d2d0702, float:1.81432352E8)
            java.lang.String r3 = "۬ۛ۫ۥۛۧۥۤۡ۬ۗۗۜۚۤۦۙۡۘۚۨۤۤ۬ۢۧۤۨ"
        L_0x03f8:
            int r52 = r3.hashCode()
            r52 = r52 ^ r6
            switch(r52) {
                case -1393211900: goto L_0x0415;
                case -1054087788: goto L_0x0408;
                case 465004564: goto L_0x0402;
                case 600301645: goto L_0x07cf;
                default: goto L_0x0401;
            }
        L_0x0401:
            goto L_0x03f8
        L_0x0402:
            java.lang.String r3 = "ۗۥۦۘۤۖۡۘ۠۬۠۟ۗۤۖۨۥۘ"
            goto L_0x03f8
        L_0x0405:
            java.lang.String r3 = "۫ۖۨۗۢۧۖ۟۟۬ۡۡۗۛۨ"
            goto L_0x03f8
        L_0x0408:
            int r3 = rc.whatsapp.stories.value.Stories.storyStyle()
            r52 = 1
            r0 = r52
            if (r3 != r0) goto L_0x0405
            java.lang.String r3 = "ۤۥۨۘۖ۫ۨۘ۬۠ۖۘۦۙۡۜ۬ۙ۬ۨۙ"
            goto L_0x03f8
        L_0x0415:
            java.lang.String r3 = "ۙۥ۫ۙۙۘۤۦۤ۟ۚۥۘۧۤۨۖۚۡۘ"
            r6 = r3
            goto L_0x0056
        L_0x041a:
            X.0th r3 = f1480d
            X.1Ld r6 = f1481e
            r0 = r51
            X.1dI r0 = r0.f1473m
            r52 = r0
            r0 = r29
            r1 = r33
            r2 = r52
            z.j.i(r3, r6, r0, r1, r2)
            java.lang.String r3 = "۟ۛۜۘۥۙۥۜۘۗۥۘۗۡۘۧ"
            r6 = r3
            goto L_0x0056
        L_0x0432:
            r6 = -796817706(0xffffffffd08186d6, float:-1.73847798E10)
            java.lang.String r3 = "ۢۘۢۢۨۨۡۧ۠ۙ۫ۗ۠ۨۨۘۦۢۦ"
        L_0x0437:
            int r52 = r3.hashCode()
            r52 = r52 ^ r6
            switch(r52) {
                case -1888966489: goto L_0x0447;
                case -821960108: goto L_0x044e;
                case 1012958033: goto L_0x07d4;
                case 1133429491: goto L_0x0441;
                default: goto L_0x0440;
            }
        L_0x0440:
            goto L_0x0437
        L_0x0441:
            java.lang.String r3 = "ۙۙۗۥۛۗ۬ۡۢۗۨۜۘ۟ۚۚۜۜ۫ۢۨ"
            goto L_0x0437
        L_0x0444:
            java.lang.String r3 = "۫ۨۨۘ۠۬ۜۘۛۡۖۚۧۗۚ۫ۢ۠ۜۥۘۡۜۨۘ۟ۘۦۘۦۙۡ"
            goto L_0x0437
        L_0x0447:
            boolean r3 = f1479c
            if (r3 == 0) goto L_0x0444
            java.lang.String r3 = "۬ۛۛۜ۫ۧۢۤ۫ۘۨۙۖۘ۟ۜ۠ۨۘ"
            goto L_0x0437
        L_0x044e:
            java.lang.String r3 = "ۚۦۧۙۘۨۘ۫ۛ۟ۥۜ۠۠ۢ۟ۥۘۨۘۢۧۖ"
            r6 = r3
            goto L_0x0056
        L_0x0453:
            X.0th r3 = f1480d
            X.1Ld r6 = f1481e
            r0 = r51
            X.1dI r0 = r0.f1473m
            r52 = r0
            r0 = r47
            r1 = r33
            r2 = r52
            z.j.i(r3, r6, r0, r1, r2)
            java.lang.String r3 = "۫ۖۤ۬ۥۥۘۗ۠ۘۗۡۥۘ۫ۧۨ"
            r6 = r3
            goto L_0x0056
        L_0x046b:
            r0 = r51
            int r3 = r0.f1478r
            r0 = r51
            int r6 = r0.f1477q
            r0 = r47
            r0.a(r3, r6)
            java.lang.String r3 = "ۙۗۚ۬ۢ۫ۥۦۙۨۡۘۨۖۡۡۖۧۘۛۘۖۨۙۚ"
            r6 = r3
            goto L_0x0056
        L_0x047d:
            r6 = -940358991(0xffffffffc7f342b1, float:-124549.38)
            java.lang.String r3 = "ۚ۠۠ۤۦۘۗۨۡۛۗۗۦۧۤۨۥ۬۬ۤۙۨۜۘ۫ۜۨ"
        L_0x0482:
            int r52 = r3.hashCode()
            r52 = r52 ^ r6
            switch(r52) {
                case -1447105936: goto L_0x0492;
                case -409611340: goto L_0x07d9;
                case 800485259: goto L_0x048c;
                case 1573680984: goto L_0x049b;
                default: goto L_0x048b;
            }
        L_0x048b:
            goto L_0x0482
        L_0x048c:
            java.lang.String r3 = "ۜۦۤۦۦۖۘۡۙۧۜۜۡۘۚۥۘۘۧۢۛۗۤۘۨ۬۟ۜ۠ۨ"
            goto L_0x0482
        L_0x048f:
            java.lang.String r3 = "ۘۙۖۘ۟ۡۘۢۦۧ۫ۜ۟ۚۦۨۘۘۨۦۘۜۘۡ۫ۖۧۘ"
            goto L_0x0482
        L_0x0492:
            r0 = r51
            boolean r3 = r0.f1475o
            if (r3 == 0) goto L_0x048f
            java.lang.String r3 = "ۨ۬ۖۜۢۛۢۤۨۘۨۤۥۛۢ۫۟ۗ۠ۦ۠ۤۤ۬ۘۘ"
            goto L_0x0482
        L_0x049b:
            java.lang.String r3 = "ۚۛۛ۟ۡۙ۫۟ۛۘ۟۟ۙۖۙۘۦ۟"
            r6 = r3
            goto L_0x0056
        L_0x04a0:
            r6 = 618686594(0x24e06882, float:9.732156E-17)
            java.lang.String r3 = "ۡۧۡۘۡ۫ۦۜۤۚۤۚۜۥۘۦۨۦۘۘۤ۠۟"
        L_0x04a5:
            int r52 = r3.hashCode()
            r52 = r52 ^ r6
            switch(r52) {
                case -731352799: goto L_0x04af;
                case 630489284: goto L_0x07d9;
                case 1287966151: goto L_0x04b7;
                case 1852948018: goto L_0x04c0;
                default: goto L_0x04ae;
            }
        L_0x04ae:
            goto L_0x04a5
        L_0x04af:
            java.lang.String r3 = "ۥۖۡۘۗ۬ۤۙۦۜۧ۬ۦۡ"
            r6 = r3
            goto L_0x0056
        L_0x04b4:
            java.lang.String r3 = "ۧۦۨۘ۠ۜۡۜۢۙۛۚۖۤۤ۠"
            goto L_0x04a5
        L_0x04b7:
            r0 = r51
            int r3 = r0.f1477q
            if (r3 != 0) goto L_0x04b4
            java.lang.String r3 = "۟۫ۤۢۥۥۙۨۤ۟ۡۘۥۨۖۘ"
            goto L_0x04a5
        L_0x04c0:
            java.lang.String r3 = "ۤۘۜۘۛ۟ۤ۠ۢۘۘۤ۬۟ۦۧۛۙۚۘۘۧۘۛۗۦۘۘ"
            goto L_0x04a5
        L_0x04c3:
            r28 = 0
            java.lang.String r3 = "ۙ۬ۦۘۧۡ۠۫ۖۘۦۛۗۨۘۙۡۦۛۗۧۗ۟ۡ۫ۛۚ۬"
            r6 = r3
            goto L_0x0056
        L_0x04ca:
            java.lang.String r3 = "ۖۦۚۢۤۥۚۚۘۢۥۧۨۤۛۧۚۤۚ۠ۙۛۛ۟ۛۥۛ"
            r6 = r3
            r27 = r28
            goto L_0x0056
        L_0x04d1:
            r26 = 8
            java.lang.String r3 = "ۗ۠۟ۨۜۧۘۥۧۧ۠۫ۤۚۘ۟ۤۨۧۘ"
            r6 = r3
            goto L_0x0056
        L_0x04d8:
            java.lang.String r3 = "ۗۚۨۡۡۡۘۧ۬ۚۥۛۛۖۚۤۡۥۡۘۛۢۘۘ۟ۡ"
            r6 = r3
            r27 = r26
            goto L_0x0056
        L_0x04df:
            r0 = r51
            android.view.View r0 = r0.f1462b
            r25 = r0
            java.lang.String r3 = "ۙ۬ۡۙۦۖۗۢۖۜۧ۟ۜۛۖ"
            r6 = r3
            goto L_0x0056
        L_0x04ea:
            r0 = r25
            r1 = r27
            r0.setVisibility(r1)
            java.lang.String r3 = "۠ۥۗۖۢۢۘۘۥۛۥۘۘ۟ۧ۠ۘۧۢ"
            r6 = r3
            goto L_0x0056
        L_0x04f6:
            r6 = 639624921(0x261fe6d9, float:5.5477063E-16)
            java.lang.String r3 = "ۥ۟ۡۘۖ۟ۦ۟ۛۢۨ۟ۖۙۡۖۚ۫ۛ"
        L_0x04fb:
            int r52 = r3.hashCode()
            r52 = r52 ^ r6
            switch(r52) {
                case -150654425: goto L_0x0514;
                case 123860087: goto L_0x07e3;
                case 279961016: goto L_0x050b;
                case 547698289: goto L_0x0505;
                default: goto L_0x0504;
            }
        L_0x0504:
            goto L_0x04fb
        L_0x0505:
            java.lang.String r3 = "ۘۘۗۗۗۖۖۡ۠ۙۨۦۘۥ۟ۖۘۢۖۖۘ۫ۦۖۨۙۥ۠ۚۚ"
            goto L_0x04fb
        L_0x0508:
            java.lang.String r3 = "ۨۧ۫ۤ۟ۜۖۡۘۧۤۜۘ۬ۖۥۘۗ۠ۡۘ"
            goto L_0x04fb
        L_0x050b:
            r0 = r51
            int r3 = r0.f1478r
            if (r3 != 0) goto L_0x0508
            java.lang.String r3 = "ۧ۟ۜۘۦۘۨۘۨ۫ۢ۟۬۫ۜ۫۟ۤۗۨۘۡۦۥۨۤ۬ۖۗۗ"
            goto L_0x04fb
        L_0x0514:
            java.lang.String r3 = "ۗۦۧۘ۫ۙۜۘۗۗۦۤ۬ۦۦ۫۫"
            r6 = r3
            goto L_0x0056
        L_0x0519:
            r24 = 1056964608(0x3f000000, float:0.5)
            java.lang.String r3 = "۠ۙۖۛۖۗۘۤۥۖۤۦۘ۟۫۫ۦ۟ۘۘۦۙۨۜۖۖۘۘ"
            r6 = r3
            goto L_0x0056
        L_0x0520:
            java.lang.String r3 = "ۛۨۙۖۜ۟ۛۥۦۢ۠ۨۙۡۛۗ۫۬۠ۛ"
            r6 = r3
            r23 = r24
            goto L_0x0056
        L_0x0527:
            r22 = 1065353216(0x3f800000, float:1.0)
            java.lang.String r3 = "ۗ۬ۖۘۙۘۧۘ۟ۤۦۘۖۧۨۘۛۥۘۘۖۜۖۤۧۘۨ۠ۧۜۤۜۘ"
            r6 = r3
            goto L_0x0056
        L_0x052e:
            java.lang.String r3 = "ۚ۟ۦۛۢۚۡ۫ۚۙۨۦ۠ۖۜۘۘۛۜۘۢۥۦۘ"
            r6 = r3
            r23 = r22
            goto L_0x0056
        L_0x0535:
            r0 = r36
            r1 = r23
            r0.setAlpha(r1)
            java.lang.String r3 = "ۖ۫ۘ۬۬ۘۦۢۖۘۧۥۖۘۙۨۜ"
            r6 = r3
            goto L_0x0056
        L_0x0541:
            r3 = 0
            r0 = r33
            r0.setVisibility(r3)
            java.lang.String r3 = "ۥ۠ۗۨۨۜۘۘۡۡۦۢۘۘۙۜۡۘۧ۠۠۠۟ۚۦۖۘۛۙۡ"
            r6 = r3
            goto L_0x0056
        L_0x054c:
            com.obwhatsapp.HomeActivity r21 = com.obwhatsapp.yo.yo.Homeac
            java.lang.String r3 = "ۤ۠ۛ۠ۡۧۧۘۘۘۡ۠ۧۚۧۗ۟ۖۤ"
            r6 = r3
            goto L_0x0056
        L_0x0553:
            com.obwhatsapp.youbasha.ui.views.i r3 = new com.obwhatsapp.youbasha.ui.views.i
            r6 = 0
            r0 = r51
            r1 = r21
            r3.<init>(r0, r1, r6)
            r0 = r47
            r0.setOnClickListener(r3)
            java.lang.String r3 = "ۘۛۨۘۢۙۖۘۧۢ۟۟ۢۚۢۜۡ"
            r6 = r3
            goto L_0x0056
        L_0x0567:
            com.obwhatsapp.youbasha.ui.views.i r3 = new com.obwhatsapp.youbasha.ui.views.i
            r6 = 1
            r0 = r51
            r1 = r21
            r3.<init>(r0, r1, r6)
            r0 = r29
            r0.setOnClickListener(r3)
            java.lang.String r3 = "ۡۚۚ۟۫ۢۧۦۡۜۡۥۘۨۜۨۘۡۡۥ۟۫ۧۖۛۤ۫ۡۗ"
            r6 = r3
            goto L_0x0056
        L_0x057b:
            r6 = -1564237745(0xffffffffa2c3a04f, float:-5.302459E-18)
            java.lang.String r3 = "۫۬ۛۧ۟ۨۧۡۘۘۖۥۥۘۦۖ۬۫ۥۜۚۚۥۜۚ۬ۚ۬۠"
        L_0x0580:
            int r52 = r3.hashCode()
            r52 = r52 ^ r6
            switch(r52) {
                case -2069861903: goto L_0x07ed;
                case -1849909940: goto L_0x0597;
                case -1610901996: goto L_0x058a;
                case 483533378: goto L_0x0590;
                default: goto L_0x0589;
            }
        L_0x0589:
            goto L_0x0580
        L_0x058a:
            java.lang.String r3 = "ۙۙۦ۟ۖ۟ۛۙۡۘۗۢۖۦ۬۠۟ۤۖۘ۠ۛ۫"
            goto L_0x0580
        L_0x058d:
            java.lang.String r3 = "ۛۨۥۡ۫ۜۘۤۦۧۧۜۙۚۦۦۘۦۨ۫ۜ۫۟ۥۛۖ"
            goto L_0x0580
        L_0x0590:
            boolean r3 = r5 instanceof androidx.cardview.widget.CardView
            if (r3 == 0) goto L_0x058d
            java.lang.String r3 = "ۖ۫ۘۘۢۖۨۤ۠۬۫۟ۙۡ۫۫ۥۦۥۧۛۨۘ"
            goto L_0x0580
        L_0x0597:
            java.lang.String r3 = "ۗۛۜۘۨۤ۟۠ۖۙۜۥ۫۫ۢۦۜ۫ۡ۟۬ۦ"
            r6 = r3
            goto L_0x0056
        L_0x059c:
            r3 = r5
            androidx.cardview.widget.CardView r3 = (androidx.cardview.widget.CardView) r3
            java.lang.String r6 = "۫۬ۗۚ۫ۘۡۜۡۘۨۡۗۦۘۛۘۥۧۘ"
            r20 = r3
            goto L_0x0056
        L_0x05a5:
            int r3 = rc.whatsapp.stories.value.Stories.cardElevation()
            float r3 = (float) r3
            r0 = r20
            r0.setCardElevation(r3)
            java.lang.String r3 = "۬ۙۧۗ۫ۚ۬ۙۦۡۙۜۤۙۗۥۘ"
            r6 = r3
            goto L_0x0056
        L_0x05b4:
            int r3 = rc.whatsapp.stories.value.Stories.cardRounded()
            int r3 = com.obwhatsapp.youbasha.task.utils.dimenInDP(r3)
            float r3 = (float) r3
            r0 = r20
            r0.setRadius(r3)
            java.lang.String r3 = "ۙۢۘۜۗۜۘۨ۬ۛۢۨۢ۟۟ۤۨۗۜۘۤۥۢۨۚۛۤۥۙ"
            r6 = r3
            goto L_0x0056
        L_0x05c7:
            r6 = -1660494344(0xffffffff9d06ddf8, float:-1.7849507E-21)
            java.lang.String r3 = "ۛۘۥ۠ۜ۠۫ۨۨۘۤ۠ۦۘ۠ۥۢۢۜۗۙۨۛۤ۟۠ۧۢۖۘ"
        L_0x05cc:
            int r52 = r3.hashCode()
            r52 = r52 ^ r6
            switch(r52) {
                case -192943854: goto L_0x05e7;
                case 67466421: goto L_0x05d6;
                case 153637710: goto L_0x05e4;
                case 253794799: goto L_0x07ed;
                default: goto L_0x05d5;
            }
        L_0x05d5:
            goto L_0x05cc
        L_0x05d6:
            java.lang.String r3 = "key_stories_elevation"
            boolean r3 = com.obwhatsapp.yo.shp.getBoolean(r3)
            if (r3 == 0) goto L_0x05e1
            java.lang.String r3 = "ۨۦۡۘۜۢۡۦۘۢۘۗ۠ۨۙۚۗۦۖۘۦۢۡۘ"
            goto L_0x05cc
        L_0x05e1:
            java.lang.String r3 = "ۜۧۖۘ۟ۜۘۚ۫ۨۚ۟ۡۨۗۧ۠ۛۖ۟۠"
            goto L_0x05cc
        L_0x05e4:
            java.lang.String r3 = "ۖۦۨۖۚۡۘۡۡ۟ۛۧۘۘ۬ۤۦۘ۫ۥ۟ۤۗۦۘۙۨۥۘ"
            goto L_0x05cc
        L_0x05e7:
            java.lang.String r3 = "ۦ۟ۦۘ۬۟ۘ۟ۚۨۘۜۢۢۜۖ"
            r6 = r3
            goto L_0x0056
        L_0x05ec:
            r3 = 1077936128(0x40400000, float:3.0)
            int r3 = com.obwhatsapp.youbasha.task.utils.dpToPx(r3)
            float r3 = (float) r3
            r0 = r20
            r0.setCardElevation(r3)
            java.lang.String r3 = "ۛۡۧۘۚۙۨۘ۠ۛۘۘۤۧۛۙۚ۟ۜۨ۟ۢۨۘۘۜۗ۟ۘ۠ۘۘ"
            r6 = r3
            goto L_0x0056
        L_0x05fd:
            int r3 = rc.whatsapp.stories.value.Stories.seenColor()
            r0 = r47
            r0.seen(r3)
            java.lang.String r3 = "ۗ۠۟ۤۨۖۤۦ۠ۧ۬ۨۗۖۜۘۙۦۙ"
            r6 = r3
            goto L_0x0056
        L_0x060b:
            int r3 = rc.whatsapp.stories.value.Stories.unseenColor()
            r0 = r47
            r0.unseen(r3)
            java.lang.String r3 = "ۨۤ۠ۧۤۤۚ۫ۡۥ۫۫ۚۡ"
            r6 = r3
            goto L_0x0056
        L_0x0619:
            int r3 = rc.whatsapp.stories.value.Stories.nameColor()
            r0 = r36
            r0.setTextColor(r3)
            java.lang.String r3 = "ۥۤۜۚۘ۫۬ۜۧۙۗۗ۬ۚۡۘ۬ۜۧۧۛۗ۬ۗ"
            r6 = r3
            goto L_0x0056
        L_0x0627:
            java.lang.String r3 = "rc_add_bg"
            int r6 = com.obwhatsapp.yo.HomeUI.fab_Bg()
            android.graphics.PorterDuff$Mode r19 = android.graphics.PorterDuff.Mode.SRC_ATOP
            r0 = r19
            android.graphics.drawable.Drawable r19 = com.obwhatsapp.youbasha.others.coloredDrawable(r3, r6, r0)
            java.lang.String r3 = "ۡ۫ۨۗ۠۟ۖۖۥۘ۬ۦۦۘۜۙۨۨۨۘۘ۬ۗۙۘۛۜۡۙ"
            r6 = r3
            goto L_0x0056
        L_0x063a:
            r0 = r51
            android.widget.ImageView r0 = r0.f1468h
            r18 = r0
            java.lang.String r3 = "۠ۜۡۘۜ۠ۡۧۡۦۘ۫۫۟ۖ۫ۙ۫ۡۗۙۗۖۦۡۨۘ"
            r6 = r3
            goto L_0x0056
        L_0x0645:
            r18.setBackground(r19)
            java.lang.String r3 = "ۢۥۦۘۖۖۢۖۘۙۖ۫ۦۘۨۤۨۖ۫ۘۤۡۧۘۙۜۘۘۡ۬ۨۘ"
            r6 = r3
            goto L_0x0056
        L_0x064d:
            int r3 = com.obwhatsapp.youbasha.ui.views.FloatingActionButton.getFABIconsColor()
            r0 = r18
            r0.setColorFilter(r3)
            java.lang.String r3 = "ۢۙۚۖ۟۠ۛۖۧۘۡۧۘۘۡۜۚۥۛۡۥۥۖۢۜۘ"
            r6 = r3
            goto L_0x0056
        L_0x065b:
            boolean r17 = com.obwhatsapp.yo.HomeUI.isOneUIEnabled()
            java.lang.String r3 = "ۛۛۦ۟ۢۙۧۗۜۘ۟ۖ۬ۧۘۜۙۘۢ"
            r6 = r3
            goto L_0x0056
        L_0x0664:
            r0 = r51
            android.view.View r0 = r0.f1469i
            r16 = r0
            java.lang.String r3 = "ۦ۬ۛۤۨ۠ۗۢۖ۠ۜۥۧۗۘۘ"
            r6 = r3
            goto L_0x0056
        L_0x066f:
            r6 = -267451241(0xfffffffff00f0497, float:-1.7704762E29)
            java.lang.String r3 = "ۢۘۘۢۨۛ۠ۥۗۡ۫ۤۧۙۜۘ۟ۡۢۘۧۨۘ"
        L_0x0674:
            int r52 = r3.hashCode()
            r52 = r52 ^ r6
            switch(r52) {
                case -822661533: goto L_0x0689;
                case -223239922: goto L_0x07f2;
                case 480986561: goto L_0x0684;
                case 808925434: goto L_0x067e;
                default: goto L_0x067d;
            }
        L_0x067d:
            goto L_0x0674
        L_0x067e:
            java.lang.String r3 = "ۜۖۧ۟ۢ۫ۧ۬ۤۛۙۛۚۙۙۢۧ۟ۤ۬ۥۘ"
            goto L_0x0674
        L_0x0681:
            java.lang.String r3 = "ۙۤۡۘۦ۬۬ۖ۠ۛ۟ۚ۫ۖۡۤۥۡ۬ۗۜۨۘۛ۟ۤۗۘ۫"
            goto L_0x0674
        L_0x0684:
            if (r17 == 0) goto L_0x0681
            java.lang.String r3 = "۫ۚۚ۫۟ۛۨۚۦۘۗۖۗۥۤۧۖۙۥۦۛۢۙۙۜۘۤ"
            goto L_0x0674
        L_0x0689:
            java.lang.String r3 = "۟۫ۦۘۙۤۤۨۖۥۘ۠ۙ۬۫ۜۥ۟۠ۖۤۗۖۘۥۢۦ۟ۚۡ"
            r6 = r3
            goto L_0x0056
        L_0x068e:
            java.lang.String r3 = "rc_add_bg_2"
            int r6 = com.obwhatsapp.yo.HomeUI.listbg_Color()
            android.graphics.PorterDuff$Mode r52 = android.graphics.PorterDuff.Mode.SRC_ATOP
            r0 = r52
            android.graphics.drawable.Drawable r3 = com.obwhatsapp.youbasha.others.coloredDrawable(r3, r6, r0)
            r0 = r25
            r0.setBackground(r3)
            java.lang.String r3 = "ۤۛۦۘۢۗ۬ۧ۬ۦۡۢۥۗۗۜۘ۬ۛۗۙۛۨ"
            r6 = r3
            goto L_0x0056
        L_0x06a6:
            java.lang.String r3 = "rc_add_bg_2"
            int r6 = com.obwhatsapp.yo.HomeUI.listbg_Color()
            android.graphics.PorterDuff$Mode r52 = android.graphics.PorterDuff.Mode.SRC_ATOP
            r0 = r52
            android.graphics.drawable.Drawable r3 = com.obwhatsapp.youbasha.others.coloredDrawable(r3, r6, r0)
            r0 = r16
            r0.setBackground(r3)
            java.lang.String r3 = "ۡ۫۠ۗۙۨۖۤۦۙۜۧۗۤۧ۬ۥۘ"
            r6 = r3
            goto L_0x0056
        L_0x06be:
            int r15 = com.obwhatsapp.yo.HomeUI.listbg_Color()
            java.lang.String r3 = "ۨۖۜۢۨۦۢۨ۬ۡۜۦۘۘۨۘ"
            r6 = r3
            goto L_0x0056
        L_0x06c7:
            java.lang.String r3 = "ۖۙۚۢۥۗۨۡۘۤۧۦۘۦ۠۠ۜ۟ۧۙۧۦۘ۠ۜۖ"
            r6 = r3
            r14 = r15
            goto L_0x0056
        L_0x06cd:
            java.lang.String r3 = "rc_add_bg_2"
            int r6 = com.obwhatsapp.yo.HomeUI.BG_aux()
            android.graphics.PorterDuff$Mode r52 = android.graphics.PorterDuff.Mode.SRC_ATOP
            r0 = r52
            android.graphics.drawable.Drawable r3 = com.obwhatsapp.youbasha.others.coloredDrawable(r3, r6, r0)
            r0 = r25
            r0.setBackground(r3)
            java.lang.String r3 = "۟ۡۘ۬ۚۛۜ۬ۜۘۦۢۡۘۧۚۨۚۡ۫"
            r6 = r3
            goto L_0x0056
        L_0x06e5:
            java.lang.String r3 = "rc_add_bg_2"
            int r6 = com.obwhatsapp.yo.HomeUI.BG_aux()
            android.graphics.PorterDuff$Mode r52 = android.graphics.PorterDuff.Mode.SRC_ATOP
            r0 = r52
            android.graphics.drawable.Drawable r3 = com.obwhatsapp.youbasha.others.coloredDrawable(r3, r6, r0)
            r0 = r16
            r0.setBackground(r3)
            java.lang.String r3 = "ۦ۠ۗۘۢۙۨۜۛۥۨۘ۟ۡۡۘۜۛۗۛۥۦ۬ۛۦ"
            r6 = r3
            goto L_0x0056
        L_0x06fd:
            int r13 = com.obwhatsapp.yo.HomeUI.BG_aux()
            java.lang.String r3 = "ۜۚۜۘۡۧ۟ۛۗۜۜ۠ۖۗۛۜۘ"
            r6 = r3
            goto L_0x0056
        L_0x0706:
            java.lang.String r3 = "ۨۘۚ۫ۙۧۜۦۘۖۛ۠ۦۨۚۘۜۧۖۨۤۜۢۧ"
            r6 = r3
            r14 = r13
            goto L_0x0056
        L_0x070c:
            java.lang.String r3 = "rc_add_bg_2"
            android.graphics.PorterDuff$Mode r6 = android.graphics.PorterDuff.Mode.SRC_ATOP
            android.graphics.drawable.Drawable r12 = com.obwhatsapp.youbasha.others.coloredDrawable(r3, r14, r6)
            java.lang.String r3 = "۬ۥۘۘ۟ۛۧ۠ۛۛۛۥ۟۠ۧ۫ۜۚۡۚ۟۫"
            r6 = r3
            goto L_0x0056
        L_0x0719:
            r0 = r51
            android.view.View r3 = r0.f1470j
            r3.setBackground(r12)
            java.lang.String r3 = "۟ۦۙۥۡۖۡۛ۫ۧۢۖۘۡ۠ۚۥۗۖۘ۟ۗۖۘ"
            r6 = r3
            goto L_0x0056
        L_0x0725:
            int r11 = rc.whatsapp.stories.value.Stories.counterTextColor()
            java.lang.String r3 = "ۨۦۜۧۢۛۦۛ۟ۧ۫ۜۘۖۢ۬"
            r6 = r3
            goto L_0x0056
        L_0x072e:
            r0 = r51
            android.widget.TextView r10 = r0.f1472l
            java.lang.String r3 = "ۚۜۤ۬ۢۥ۠ۧۙۨۘۜۘۢ۬۠ۚ۠ۛۤ۠ۨۘۖ۠ۦۘۗۙ"
            r6 = r3
            goto L_0x0056
        L_0x0737:
            r10.setTextColor(r11)
            java.lang.String r3 = "۬۠ۦ۟۬ۙۥۨۛۡۖۦ۠ۙ۫ۘ۠ۜ۠۬۟ۢ۠ۗ۟ۦۗ"
            r6 = r3
            goto L_0x0056
        L_0x073f:
            java.lang.String r3 = "rc_add_bg_1"
            int r6 = rc.whatsapp.stories.value.Stories.counterColor()
            android.graphics.PorterDuff$Mode r52 = android.graphics.PorterDuff.Mode.SRC_ATOP
            r0 = r52
            android.graphics.drawable.Drawable r3 = com.obwhatsapp.youbasha.others.coloredDrawable(r3, r6, r0)
            r10.setBackground(r3)
            java.lang.String r3 = "ۧ۟ۜۜۤۥۖۙۗۛۜۗۖۥۚ۟ۡۤۚۢ۠ۙ۠"
            r6 = r3
            goto L_0x0056
        L_0x0755:
            java.lang.String r3 = "ۖ۟۬ۥۖۨۘۤۜۗۚۤۗۥۥ۟ۛۚۦۘ۫ۖۘۡۧ۠"
            r6 = r3
            r8 = r9
            goto L_0x0056
        L_0x075b:
            r6 = 362638862(0x159d6e0e, float:6.358543E-26)
            java.lang.String r3 = "ۜۘۜۦۜۖۘۦۖۧۘۙ۟ۜۘۡۛ۠ۨۘۘۗۜۙ"
        L_0x0760:
            int r52 = r3.hashCode()
            r52 = r52 ^ r6
            switch(r52) {
                case -1433995531: goto L_0x07fc;
                case -1095574887: goto L_0x0770;
                case 1061895229: goto L_0x0779;
                case 1105753104: goto L_0x076a;
                default: goto L_0x0769;
            }
        L_0x0769:
            goto L_0x0760
        L_0x076a:
            java.lang.String r3 = "ۘۛۜۗۜۙۡ۟ۢۜۜ۟ۛۖ۫۫ۤ"
            goto L_0x0760
        L_0x076d:
            java.lang.String r3 = "ۥۙۘۘۛۧۡۘۖۥۘۦۡۦۘۜۢۘۘۖۥۡۘۘ۫ۙ"
            goto L_0x0760
        L_0x0770:
            r0 = r51
            int r3 = r0.f1478r
            if (r3 > 0) goto L_0x076d
            java.lang.String r3 = "ۧ۠۬ۡۛ۫ۚ۫ۜۨ۫ۜ۟۠ۨۛۨ۟ۗ۬ۥۖۧۨ"
            goto L_0x0760
        L_0x0779:
            java.lang.String r3 = "ۦۧۘ۬ۤۦۘۘۙۖۘۜ۠ۥ۠ۨۦۚۢۙ"
            r6 = r3
            goto L_0x0056
        L_0x077e:
            r7 = 8
            java.lang.String r3 = "ۙۖۦۘۡۡۨ۠ۧ۫ۨۥۦۘ۟ۧ"
            r6 = r3
            goto L_0x0056
        L_0x0785:
            java.lang.String r3 = "ۚۥۛۚۗۖۘۙۧۨۘۘۤۖۙ۫۟ۥۗ۫ۘۗ"
            r6 = r3
            r8 = r7
            goto L_0x0056
        L_0x078b:
            r0 = r16
            r0.setVisibility(r8)
            java.lang.String r3 = "ۢۨۘۘۚۙۜۨ۬ۘۘ۟ۗۦۢۖۨۘۗۧ۫ۡۤۧ"
            r6 = r3
            goto L_0x0056
        L_0x0795:
            r0 = r51
            android.view.View r3 = r0.f1471k
            r3.setVisibility(r8)
            java.lang.String r3 = "ۘۚ۬ۢۖۗ۠ۦۦۦ۠ۜۘ۠ۧۡۘ"
            r6 = r3
            goto L_0x0056
        L_0x07a1:
            r0 = r51
            int r3 = r0.f1478r
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r10.setText(r3)
            java.lang.String r3 = "ۗۖۡۘ۠۠ۙۡۦۨۘ۫ۙۛۢۦۡۘ۫ۚ۠ۡۛۜ"
            r6 = r3
            goto L_0x0056
        L_0x07b1:
            java.lang.String r3 = "ۤ۬ۜۘۚۖۗۧ۟ۥۤۜۘ۫ۨۖۘۗۛۦۛۗۗۢ۬ۨ۫ۥۘ"
            r6 = r3
            goto L_0x0056
        L_0x07b6:
            java.lang.String r3 = "ۡۛۗ۠۬ۖۡۢ۟۟۫ۘۨۦۙۧۨۥ"
            r6 = r3
            goto L_0x0056
        L_0x07bb:
            java.lang.String r3 = "ۖۦۨۤۖۘۘۡۚ۟ۜ۠ۨۘ۬ۥ۟"
            r6 = r3
            goto L_0x0056
        L_0x07c0:
            java.lang.String r3 = "ۧۦ۬ۡۥۦ۠ۢۘۥۛۚۦۨۦۘۥۡۛۙۨۗۜۦۗ"
            r6 = r3
            goto L_0x0056
        L_0x07c5:
            java.lang.String r3 = "ۥۤۨۘۜۗۦۘۛ۠ۚ۟ۘۦۡۧ۠ۘۤۨۤۗۡ۟۬ۦۘۧ۟ۜۘ"
            r6 = r3
            goto L_0x0056
        L_0x07ca:
            java.lang.String r3 = "ۙ۠ۙ۠ۡ۬۠ۢۦۘۤۢۥۘ۬ۡۧۘۙۨ"
            r6 = r3
            goto L_0x0056
        L_0x07cf:
            java.lang.String r3 = "ۖ۠۫ۚۡ۟ۙۥۡۘۧ۬ۖۗۥۧۘ"
            r6 = r3
            goto L_0x0056
        L_0x07d4:
            java.lang.String r3 = "۫ۖۤ۬ۥۥۘۗ۠ۘۗۡۥۘ۫ۧۨ"
            r6 = r3
            goto L_0x0056
        L_0x07d9:
            java.lang.String r3 = "ۗۖۨۘۘۧۦۖۖۢۖۚ۬ۚۙ۬ۡ۬ۢ۬ۢۦۘۥۜۜ"
            r6 = r3
            goto L_0x0056
        L_0x07de:
            java.lang.String r3 = "ۗۚۨۡۡۡۘۧ۬ۚۥۛۛۖۚۤۡۥۡۘۛۢۘۘ۟ۡ"
            r6 = r3
            goto L_0x0056
        L_0x07e3:
            java.lang.String r3 = "ۙۡۦ۟ۚۛ۟ۦ۟۬ۙۘۘۙۛۨۗۤۨۘ"
            r6 = r3
            goto L_0x0056
        L_0x07e8:
            java.lang.String r3 = "ۚ۟ۦۛۢۚۡ۫ۚۙۨۦ۠ۖۜۘۘۛۜۘۢۥۦۘ"
            r6 = r3
            goto L_0x0056
        L_0x07ed:
            java.lang.String r3 = "ۛۡۧۘۚۙۨۘ۠ۛۘۘۤۧۛۙۚ۟ۜۨ۟ۢۨۘۘۜۗ۟ۘ۠ۘۘ"
            r6 = r3
            goto L_0x0056
        L_0x07f2:
            java.lang.String r3 = "ۚۚۤۥۜ۠ۜۧۢ۬ۛۥۘۙۖۜ۬۟ۖ"
            r6 = r3
            goto L_0x0056
        L_0x07f7:
            java.lang.String r3 = "ۨۘۚ۫ۙۧۜۦۘۖۛ۠ۦۨۚۘۜۧۖۨۤۜۢۧ"
            r6 = r3
            goto L_0x0056
        L_0x07fc:
            java.lang.String r3 = "ۚۥۛۚۗۖۘۙۧۨۘۘۤۖۙ۫۟ۥۗ۫ۘۗ"
            r6 = r3
            goto L_0x0056
        L_0x0801:
            java.lang.String r3 = "ۗۖۡۘ۠۠ۙۡۦۨۘ۫ۙۛۢۦۡۘ۫ۚ۠ۡۛۜ"
            r6 = r3
            goto L_0x0056
        L_0x0806:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.youbasha.ui.views.k.ANf(X.02k, int):void");
    }

    public final C005602k APF(ViewGroup viewGroup, int i2) {
        String str = "ۛ۟ۘۛ۬ۘۤۙۛۦۘۛۘۘۘ";
        while (true) {
            switch ((str.hashCode() ^ 724) ^ 869390517) {
                case -1541777149:
                    str = "ۥۜۘۘ۠۟ۦۚ۬ۖۥ۟ۨۘۥۡۘۢۢۛۤۢۢۙۚۤ";
                    break;
                case -1526252547:
                    str = "ۗۧۘۘۤۖۢۢۡۡۦۨۘۢۧۤ۫ۙۨۘۧۗۗۨۦۜۘۡ۠۬";
                    break;
                case -258316652:
                    return new j(LayoutInflater.from(viewGroup.getContext()).inflate(this.f1483b, viewGroup, false), this.f1482a);
                case 1954972099:
                    str = "ۙ۬ۦۢۜۛ۟ۛۦ۟ۚۤ۫ۨۤ۫ۘۜۡۤ۠ۡۜۘۙۖۨۘ";
                    break;
            }
        }
    }

    public final long getItemId(int i2) {
        String str = "ۡۥۦ۠ۦ۟ۘۥۜ۟ۦ۟ۢ۬ۦۘ";
        while (true) {
            switch ((str.hashCode() ^ 368) ^ -1404437663) {
                case -1832672033:
                    str = "ۖۥۘۜ۠ۧۚۖۗۚۦ۠ۢ۠۟۫۟ۘۘۢ۠ۢۤۧۙ";
                    break;
                case -1783181787:
                    return (long) i2;
                case -802388915:
                    str = "۟ۨ۬ۤۛۘۘۤ۠ۨۘۨ۠ۜۘۙۥۗۙ۠ۨۘۤۡۨۘۗۤۥۧۖۜۘ";
                    break;
            }
        }
    }

    public final int getItemViewType(int i2) {
        String str = "۬ۜ۫ۢ۫ۗۡۡۖ۟۫ۘۥۖۥۚۥ";
        while (true) {
            switch ((str.hashCode() ^ 746) ^ 1275517170) {
                case 183938502:
                    str = "ۨۢ۬ۚۛۡۧۖۘۘۡ۫ۤۡ۬ۦۘ۟ۤۖۘۡۥۜۘ";
                    break;
                case 997379150:
                    str = "ۛۙۖۚ۠۠۬ۚۥۡۡۖ۫ۥۥۘ۠ۛۧ";
                    break;
                case 1071668409:
                    return i2;
            }
        }
    }
}
