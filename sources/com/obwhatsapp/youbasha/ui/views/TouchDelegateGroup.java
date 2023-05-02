package com.obwhatsapp.youbasha.ui.views;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import androidx.annotation.NonNull;
import java.util.ArrayList;

public class TouchDelegateGroup extends TouchDelegate {

    /* renamed from: d  reason: collision with root package name */
    public static final Rect f1382d = new Rect();

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f1383a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public TouchDelegate f1384b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f1385c;

    static {
        String str = "ۨۙۦۘۘۘۜۘۥۥ۫ۖۥۙ۠۠ۦۤۛۡۜۘۖ۬ۦۘۖۧۡ";
        while (true) {
            switch ((str.hashCode() ^ 648) ^ 1185184685) {
                case -358909440:
                    return;
                case 348917839:
                    str = "۠ۦ۟ۗۚۢۧۗ۠۬ۜۤۚ۠ۗۙۖۖۘۥۜۙۡ";
                    break;
            }
        }
    }

    public TouchDelegateGroup(View view) {
        super(f1382d, view);
    }

    public void addTouchDelegate(@NonNull TouchDelegate touchDelegate) {
        String str = "۠ۦۜۦ۬ۢۡۧۦۗۤ۬ۚ۫ۦۘۗۜۧۘۡۢۘۙۛ۫";
        while (true) {
            switch ((str.hashCode() ^ 327) ^ 161076545) {
                case -1659136970:
                    str = "ۜ۠ۖۘ۟۫ۙۢۨۦۚ۬ۢۖۜۘۢ۠ۡۨۢۗ";
                    break;
                case -1175764029:
                    this.f1383a.add(touchDelegate);
                    str = "ۨۘ۠۫ۡۗۗ۟ۘۗۡ۟۠ۚۖۧۚۛۥ۠۟";
                    break;
                case -358063548:
                    return;
                case 1131440755:
                    str = "۠ۜۡۘۦۜۦۧ۠۬۫ۢۨۘۥۧۜۛۜۖۢۛۜ۬ۖۚ";
                    break;
            }
        }
    }

    public void clearTouchDelegates() {
        String str = "ۛۨۗۗۜ۬ۡۜۗۚ۟ۢۜۢ۫ۧۡۖۨۡۨۘ۠ۨۧ";
        while (true) {
            switch ((str.hashCode() ^ 908) ^ -349612494) {
                case -1120465792:
                    return;
                case 380122879:
                    str = "۟ۗۖۘۘۙۚ۟ۛۧۢۖۙ۫ۙۨۗۙۘۘۛۤ";
                    break;
                case 705363056:
                    this.f1384b = null;
                    str = "۬ۗ۟۟ۗۖۢ۠ۙۤ۠۟ۜ۟ۛۛۡۦۘ";
                    break;
                case 1489365522:
                    this.f1383a.clear();
                    str = "۟۫ۘۖۜۥۘۚۛ۠ۡ۠ۡ۟ۤ۠ۦۡ۠۬ۦۖ۠۬ۤ";
                    break;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00da, code lost:
        r2 = "ۖۙ۟۬ۙ۟ۥۗۚۛۗۡ۟ۧۙۛ۬ۘۘ۠ۛ۠";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01c2, code lost:
        r2 = "ۡۜۧۡۗۦۛ۫۬ۥۧ۟ۡۗۥۡۦۘۘ۫ۗۢ۟ۥۖۙۨۦ";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(@androidx.annotation.NonNull android.view.MotionEvent r21) {
        /*
            r20 = this;
            r17 = 0
            r5 = 0
            r16 = 0
            r15 = 0
            r13 = 0
            r12 = 0
            r11 = 0
            r10 = 0
            r8 = 0
            r14 = 0
            r7 = 0
            r6 = 0
            r9 = 0
            r3 = 0
            r4 = 0
            java.lang.String r1 = "ۚۛۦۦۡ۬۬ۙ۫ۤۡۧۦ۠ۦۨۚۥ"
            r2 = r1
        L_0x0014:
            int r1 = r2.hashCode()
            r18 = 91
            r19 = 1051173037(0x3ea7a0ad, float:0.32739773)
            r1 = r1 ^ r18
            r1 = r1 ^ r19
            switch(r1) {
                case -2089741913: goto L_0x012c;
                case -2059555095: goto L_0x0025;
                case -1938731926: goto L_0x0141;
                case -1937243960: goto L_0x005c;
                case -1880530112: goto L_0x0107;
                case -1831949679: goto L_0x0227;
                case -1668829681: goto L_0x013b;
                case -1617578599: goto L_0x0126;
                case -1524333550: goto L_0x0037;
                case -1412567500: goto L_0x0110;
                case -1313851496: goto L_0x005b;
                case -1236015802: goto L_0x016f;
                case -1059062467: goto L_0x01b3;
                case -972992497: goto L_0x0202;
                case -923337244: goto L_0x0227;
                case -803986565: goto L_0x0227;
                case -780727006: goto L_0x0029;
                case -772244949: goto L_0x01a0;
                case -596283291: goto L_0x01a7;
                case -449664495: goto L_0x00a9;
                case -443469599: goto L_0x0164;
                case -245609344: goto L_0x021d;
                case -218398878: goto L_0x0064;
                case -113986329: goto L_0x01d7;
                case -66036899: goto L_0x00f2;
                case 133460000: goto L_0x0120;
                case 206347031: goto L_0x019d;
                case 564061764: goto L_0x005a;
                case 755733063: goto L_0x011a;
                case 889559674: goto L_0x003c;
                case 1017966332: goto L_0x01ad;
                case 1104627119: goto L_0x0101;
                case 1120504028: goto L_0x00f8;
                case 1179737165: goto L_0x0132;
                case 1313207784: goto L_0x0208;
                case 1340176102: goto L_0x0194;
                case 1400638491: goto L_0x002d;
                case 1594344043: goto L_0x0069;
                case 1692429834: goto L_0x00cb;
                case 1769749335: goto L_0x0087;
                case 2121527118: goto L_0x01dd;
                default: goto L_0x0024;
            }
        L_0x0024:
            goto L_0x0014
        L_0x0025:
            java.lang.String r1 = "ۦ۫۫ۚ۬ۨۛۨۘۨۡ۬۠ۛۧ"
            r2 = r1
            goto L_0x0014
        L_0x0029:
            java.lang.String r1 = "ۗۗ۬ۤۦۜۘ۠ۧۙۙۧۧۡ۬ۘ۬ۤۜ۠ۚۧۡۚۤ۠۬۟"
            r2 = r1
            goto L_0x0014
        L_0x002d:
            r0 = r20
            boolean r0 = r0.f1385c
            r17 = r0
            java.lang.String r1 = "ۦۘۦۘۧ۟ۡۘ۫ۛۡۘۧۥ۟ۧۤۨۦۡۘۘۨۖۢۡۢۚ"
            r2 = r1
            goto L_0x0014
        L_0x0037:
            r5 = 0
            java.lang.String r1 = "۫۫ۥۥۘۧۘۘۦۤۨۚۨۢۖۤ۬ۧۡۖۦۢۖۨۙۤۜۘ"
            r2 = r1
            goto L_0x0014
        L_0x003c:
            r2 = -852571453(0xffffffffcd2ecac3, float:-1.83282736E8)
            java.lang.String r1 = "ۤۤۨۘۖ۬ۢۜ۟۬ۥۘۧۚ۫ۢۤ۠۫ۦۗۜۖۧۘ"
        L_0x0041:
            int r18 = r1.hashCode()
            r18 = r18 ^ r2
            switch(r18) {
                case -2022402874: goto L_0x004b;
                case -863551358: goto L_0x0052;
                case 415271810: goto L_0x020e;
                case 1642774644: goto L_0x0057;
                default: goto L_0x004a;
            }
        L_0x004a:
            goto L_0x0041
        L_0x004b:
            java.lang.String r1 = "ۖۖۦۖۨۜۘۡۗۥۦۘۧۘ۫۠ۖۘ۬ۥۧۘۡۛ۫"
            r2 = r1
            goto L_0x0014
        L_0x004f:
            java.lang.String r1 = "ۘۥۦ۬۠ۥۧۤۦۨۙۨۖۢۢۚۖ۟ۢۦۘ"
            goto L_0x0041
        L_0x0052:
            if (r17 != 0) goto L_0x004f
            java.lang.String r1 = "ۦ۫ۗۥۚ۟ۗۚۙۨ۟ۡۘۢۦۦۘۤۢۡۘ"
            goto L_0x0041
        L_0x0057:
            java.lang.String r1 = "ۧۨۙۤۦۗۙۗ۠ۥۢۥۘۡۙۜۘۘ۟ۘۘۡۥۙ"
            goto L_0x0041
        L_0x005a:
            r4 = 0
        L_0x005b:
            return r4
        L_0x005c:
            int r16 = r21.getAction()
            java.lang.String r1 = "ۤ۠۠ۘۢۖ۟ۤۘ۟۟ۙ۟ۢۜۘۘۖۦ۫ۡۡۗۙۦ"
            r2 = r1
            goto L_0x0014
        L_0x0064:
            r15 = 0
            java.lang.String r1 = "۠ۥۘۘۛۛۥۤۥۚۨۥۚۛۛۦۘۥۥ۟ۚۚۦ"
            r2 = r1
            goto L_0x0014
        L_0x0069:
            r2 = -382557642(0xffffffffe932a236, float:-1.3497176E25)
            java.lang.String r1 = "ۨۥ۫ۖ۟ۦ۬۠ۖ۟ۙ۬ۦۥۖۚۜۢۜۥۗۜۙ۫ۗۧۚ"
        L_0x006e:
            int r18 = r1.hashCode()
            r18 = r18 ^ r2
            switch(r18) {
                case -1843903039: goto L_0x0083;
                case -1419509228: goto L_0x0218;
                case 1214631124: goto L_0x007e;
                case 2130694211: goto L_0x0078;
                default: goto L_0x0077;
            }
        L_0x0077:
            goto L_0x006e
        L_0x0078:
            java.lang.String r1 = "ۗۨۙۥ۫ۤۗ۠ۨ۬ۚۡ۬۠ۘۨ۟۟ۤۜۜۗۘ"
            goto L_0x006e
        L_0x007b:
            java.lang.String r1 = "ۘۖۥۘۥۥ۟ۨ۬ۧ۬۬ۥۖ۫ۢۡۜۘۤ۠ۦۘۡۨۗ"
            goto L_0x006e
        L_0x007e:
            if (r16 == 0) goto L_0x007b
            java.lang.String r1 = "۫ۡۘۘۢۜۘۡۛۨۘۚۗۥۘ۫ۡۧۘۢۚۤ۫ۧۨۘۜۢۥۘۛۢۤ"
            goto L_0x006e
        L_0x0083:
            java.lang.String r1 = "۠ۖۥۘۜ۬ۦۚ۟ۚۥۗۨۘ۫ۗۗۘ۠۠ۦۤۖ"
            r2 = r1
            goto L_0x0014
        L_0x0087:
            r2 = -642413144(0xffffffffd9b58da8, float:-6.3878404E15)
            java.lang.String r1 = "ۖۛۥۘ۫ۚۚۨ۬ۜۘۜۤ۬۫ۖۧۘ"
        L_0x008c:
            int r18 = r1.hashCode()
            r18 = r18 ^ r2
            switch(r18) {
                case -1704467418: goto L_0x00a6;
                case -1526665307: goto L_0x009e;
                case -1140585197: goto L_0x00da;
                case -1134784184: goto L_0x0096;
                default: goto L_0x0095;
            }
        L_0x0095:
            goto L_0x008c
        L_0x0096:
            java.lang.String r1 = "ۜۗۤ۠۠ۘۘۛۤۛ۟ۗۖ۫ۢ۠ۚۜۥۖ"
            r2 = r1
            goto L_0x0014
        L_0x009b:
            java.lang.String r1 = "ۦۛۜۨۦۘۧ۠ۦۘۤۥۢۤۥ۟ۘۧۥ"
            goto L_0x008c
        L_0x009e:
            r1 = 1
            r0 = r16
            if (r0 == r1) goto L_0x009b
            java.lang.String r1 = "۬۠ۗۧ۟ۥ۬۟۫۠ۤۥۘۦۡۛۗۦۦۘۛۖۥ"
            goto L_0x008c
        L_0x00a6:
            java.lang.String r1 = "ۛۡۗۧۙۨۘۚ۬ۡۘۛۛۢۖۦۘۤ۫ۡۘۘۤ۟ۜ۬ۡۛۙۜ"
            goto L_0x008c
        L_0x00a9:
            r2 = 1381571222(0x52591a96, float:2.33113485E11)
            java.lang.String r1 = "ۦۡۖۘۥ۫ۘۛ۫ۖ۬ۦۙۧۡۢۦۧۜۘ۟ۛۡۘ"
        L_0x00ae:
            int r18 = r1.hashCode()
            r18 = r18 ^ r2
            switch(r18) {
                case -2082891288: goto L_0x0213;
                case -1235208150: goto L_0x00b8;
                case 68805308: goto L_0x00be;
                case 295630891: goto L_0x00c6;
                default: goto L_0x00b7;
            }
        L_0x00b7:
            goto L_0x00ae
        L_0x00b8:
            java.lang.String r1 = "ۙۥۙۦۡۢۥۦۡۥۜۛ۬ۨۤۖ۫ۜ"
            goto L_0x00ae
        L_0x00bb:
            java.lang.String r1 = "ۗۥۥ۫ۥۥۘ۠ۤۚۦۢۥۨۙۦ"
            goto L_0x00ae
        L_0x00be:
            r1 = 2
            r0 = r16
            if (r0 == r1) goto L_0x00bb
            java.lang.String r1 = "ۖۙ۬ۛۘۨۤۦۨۘۚ۟ۖ۠ۖۤ۫۟ۡۘ"
            goto L_0x00ae
        L_0x00c6:
            java.lang.String r1 = "ۧۖۤۖۘۨۘۜ۠۟ۧ۬ۤۗۛ۬ۡ۠۬ۦۦ۬"
            r2 = r1
            goto L_0x0014
        L_0x00cb:
            r2 = 1971027697(0x757b7ef1, float:3.1880888E32)
            java.lang.String r1 = "ۖۜۡۨۛۚۛۦۦۘۜۤۖۦ۟"
        L_0x00d0:
            int r18 = r1.hashCode()
            r18 = r18 ^ r2
            switch(r18) {
                case -1614385969: goto L_0x00e2;
                case 884152393: goto L_0x00ea;
                case 1660999592: goto L_0x00da;
                case 1973581655: goto L_0x00ed;
                default: goto L_0x00d9;
            }
        L_0x00d9:
            goto L_0x00d0
        L_0x00da:
            java.lang.String r1 = "ۖۙ۟۬ۙ۟ۥۗۚۛۗۡ۟ۧۙۛ۬ۘۘ۠ۛ۠"
            r2 = r1
            goto L_0x0014
        L_0x00df:
            java.lang.String r1 = "ۖ۟۫ۡ۬ۨ۠ۛۗۤۖۗۨۛۨۧۚۤۧۗۨ۬ۚ۟"
            goto L_0x00d0
        L_0x00e2:
            r1 = 3
            r0 = r16
            if (r0 == r1) goto L_0x00df
            java.lang.String r1 = "ۛ۬ۤ۠۟ۘۨۦۨۖۢۢۜۥ۬ۨ۬ۦۤۗۜۘۨ۬ۜ"
            goto L_0x00d0
        L_0x00ea:
            java.lang.String r1 = "۬۬۠ۛۗۖۘۜۜۦۘ۠ۗ۫ۢۜ۫ۗ۟ۜۖ۟ۧۡۧۦۙۖ"
            goto L_0x00d0
        L_0x00ed:
            java.lang.String r1 = "۬ۡ۫ۘۧۘۘۖۡۤۥۛۜۘۘۢۥۘۨۥۦ۟۠ۘۧ۬ۡ"
            r2 = r1
            goto L_0x0014
        L_0x00f2:
            java.lang.String r1 = "۟۠۟۠ۦۘۡۛۨۘ۟ۢۘۢ۟ۖۨۘۧۘۚ۟ۦۚۗۢ"
            r2 = r1
            r14 = r15
            goto L_0x0014
        L_0x00f8:
            r0 = r20
            android.view.TouchDelegate r13 = r0.f1384b
            java.lang.String r1 = "ۜۧۧۦۥۥۘۧۧۜۘ۟ۗ۬ۦۙۦۘۖۢۘۨۨۖ"
            r2 = r1
            goto L_0x0014
        L_0x0101:
            java.lang.String r1 = "ۙ۫۬ۧ۠ۨۘ۫ۥۜۘۧۚۦ۫ۦ۬ۢۖۘ"
            r2 = r1
            r14 = r13
            goto L_0x0014
        L_0x0107:
            r0 = r20
            android.view.TouchDelegate r12 = r0.f1384b
            java.lang.String r1 = "ۖۨۥ۟۬ۨۘۗۡۨۖۢۡۘۡۧۨۜ۬ۖۘۛۡ۟ۢۜۦۘ"
            r2 = r1
            goto L_0x0014
        L_0x0110:
            r1 = 0
            r0 = r20
            r0.f1384b = r1
            java.lang.String r1 = "ۘۨۙۖۥۖۙۨۢ۫ۨۘۢۖۨۖ۫ۤۧۢ۠ۘۧۥۗۖۘۘ"
            r2 = r1
            goto L_0x0014
        L_0x011a:
            java.lang.String r1 = "ۘۨۗۢ۟ۥۖۡۧۘۥۤۥۘۨۤۘ۫ۖ۟ۡۖۘۘۛۛۘۘۧۙۤ"
            r2 = r1
            r11 = r12
            goto L_0x0014
        L_0x0120:
            java.lang.String r1 = "ۚ۬ۥۘۘۤۧۢۨۢۙۡ۠ۥۢ۠ۘۦۘ۟ۢۦۘۤۗۧ۠ۢۚ"
            r2 = r1
            r14 = r11
            goto L_0x0014
        L_0x0126:
            r10 = 0
            java.lang.String r1 = "۟ۡۤۤۚۦۘ۟ۢۗۙ۬۟ۗۛۗۛۤۡۘ"
            r2 = r1
            goto L_0x0014
        L_0x012c:
            java.lang.String r1 = "ۦۥۡۘۙۧۖۛۥۦۘۜ۟ۗۡۡۘۧۛ۬ۙ۠ۨ"
            r2 = r1
            r9 = r10
            goto L_0x0014
        L_0x0132:
            r0 = r20
            java.util.ArrayList r8 = r0.f1383a
            java.lang.String r1 = "ۚۨۢۙۜۗۙ۟ۛۙ۟ۥۘۨ۬۬ۜ۟ۜۘ"
            r2 = r1
            goto L_0x0014
        L_0x013b:
            java.lang.String r1 = "ۜۛۨۘۥۨۧۘۛۨۗۜۗ۠ۖ۟ۚۗ۬ۛ۠۟ۜۘۨۘۚ"
            r2 = r1
            r14 = r15
            goto L_0x0014
        L_0x0141:
            r2 = -243070550(0xfffffffff18309aa, float:-1.297735E30)
            java.lang.String r1 = "ۧۦ۫ۦۡۦۘۨۘ۫۫ۛۨۘ۫۠ۡ"
        L_0x0146:
            int r18 = r1.hashCode()
            r18 = r18 ^ r2
            switch(r18) {
                case 372277481: goto L_0x0161;
                case 711758144: goto L_0x0158;
                case 1650934953: goto L_0x0227;
                case 2047949356: goto L_0x0150;
                default: goto L_0x014f;
            }
        L_0x014f:
            goto L_0x0146
        L_0x0150:
            java.lang.String r1 = "ۗۥۤۡۖۧۗۦۨۘۚۖۢۥۢۨۡۗۘۥۡۙ۫ۥۜۘۨ۬۬"
            r2 = r1
            goto L_0x0014
        L_0x0155:
            java.lang.String r1 = "ۚۨ۫ۚۤۤ۬ۢۡۘۨۗۖۘۛۢۥۘۜۧۨۘۨۛ۟ۖۡۜۘ"
            goto L_0x0146
        L_0x0158:
            int r1 = r8.size()
            if (r9 >= r1) goto L_0x0155
            java.lang.String r1 = "ۙۦۛۛۢۙ۬ۦۧ۟ۧۥۘۨۡۗۡۜۘ"
            goto L_0x0146
        L_0x0161:
            java.lang.String r1 = "ۢ۫ۚۛۜۜۘ۫ۧۜۨ۠۠۬ۖۧۘۛۨۤ"
            goto L_0x0146
        L_0x0164:
            java.lang.Object r1 = r8.get(r9)
            android.view.TouchDelegate r1 = (android.view.TouchDelegate) r1
            java.lang.String r2 = "۫ۧۖ۟ۡۨۘۙۜۤۙۚۜ۠ۨۜۘۘۡۦۤۥۦۦۧۛۘ"
            r7 = r1
            goto L_0x0014
        L_0x016f:
            r2 = -1626570193(0xffffffff9f0c822f, float:-2.975384E-20)
            java.lang.String r1 = "ۤۡ۟ۦۧۧۚ۫ۜ۬ۥۘۗۡ۬ۥۦۖۘۛ۟۫ۗۢۘۘۜۨۢ"
        L_0x0174:
            int r18 = r1.hashCode()
            r18 = r18 ^ r2
            switch(r18) {
                case -1454373570: goto L_0x017e;
                case 548066381: goto L_0x0222;
                case 1636285790: goto L_0x018c;
                case 1738952123: goto L_0x018f;
                default: goto L_0x017d;
            }
        L_0x017d:
            goto L_0x0174
        L_0x017e:
            r0 = r21
            boolean r1 = r7.onTouchEvent(r0)
            if (r1 == 0) goto L_0x0189
            java.lang.String r1 = "ۢۨۥۘ۟ۥۜۘۤۚۘۘۨۚۚۜ۠ۦۘۖ۬ۡۘۗ۬ۖۘ"
            goto L_0x0174
        L_0x0189:
            java.lang.String r1 = "ۨۡۥۘۤۤۡۘۨۜۚۦۖۘۖۧۘ"
            goto L_0x0174
        L_0x018c:
            java.lang.String r1 = "ۚۖۦۜۤۜۘۗۨۛۦۛۡۜ۟ۡۜۤۘۘۥ۫ۥۤۖۙۦ۠ۜۘ"
            goto L_0x0174
        L_0x018f:
            java.lang.String r1 = "ۧۨۡۘ۠ۦۡۙۗۜۢۢۖۦ۠ۨۘ۟ۚۧۦۘ۬ۙۖ۠"
            r2 = r1
            goto L_0x0014
        L_0x0194:
            r0 = r20
            r0.f1384b = r7
            java.lang.String r1 = "ۗۗۜۨۡۚۢ۠۟۫ۙۘۘۨۢۨۛۛۡۢۚۖۘۢ۠ۢۥۢۡۘ"
            r2 = r1
            goto L_0x0014
        L_0x019d:
            r4 = 1
            goto L_0x005b
        L_0x01a0:
            int r6 = r9 + 1
            java.lang.String r1 = "ۡ۠ۘۘۚۚۨ۠ۘۥ۟۬ۡۘۧۖ۫ۨ۫ۜۘ"
            r2 = r1
            goto L_0x0014
        L_0x01a7:
            java.lang.String r1 = "ۙۚۚۦۙۧۛۘ۫ۧۗۘۘۛۦۤ"
            r2 = r1
            r9 = r6
            goto L_0x0014
        L_0x01ad:
            java.lang.String r1 = "۬ۡۛۦۗۨۘۦۜ۟ۢۘۦۗۤۦ"
            r2 = r1
            r4 = r5
            goto L_0x0014
        L_0x01b3:
            r2 = 410014800(0x18705450, float:3.106184E-24)
            java.lang.String r1 = "۟ۥۜۦۘۛۧ۬ۡ۬ۥۚۧۘۥ"
        L_0x01b8:
            int r18 = r1.hashCode()
            r18 = r18 ^ r2
            switch(r18) {
                case -420410804: goto L_0x01ca;
                case 33102956: goto L_0x01cf;
                case 154314087: goto L_0x01c2;
                case 1202164317: goto L_0x01d2;
                default: goto L_0x01c1;
            }
        L_0x01c1:
            goto L_0x01b8
        L_0x01c2:
            java.lang.String r1 = "ۡۜۧۡۗۦۛ۫۬ۥۧ۟ۡۗۥۡۦۘۘ۫ۗۢ۟ۥۖۙۨۦ"
            r2 = r1
            goto L_0x0014
        L_0x01c7:
            java.lang.String r1 = "ۘۘۨ۫۟ۥۤۘ۟ۧۡۖۚۧ۫ۚۨۢۤ۫"
            goto L_0x01b8
        L_0x01ca:
            if (r14 == 0) goto L_0x01c7
            java.lang.String r1 = "ۘۦۨۘۚۧۗۖ۠۬ۜ۬ۥۘ۬ۢۘۘۘۖۜۡۨۗۤۡۜۧۦۙ"
            goto L_0x01b8
        L_0x01cf:
            java.lang.String r1 = "ۙۥۢۦۧۨۡۙ۬ۛ۟ۨۘۖۦۙۡۤۘۙ۬ۡۘۦ۟۠۫۬ۦۘ"
            goto L_0x01b8
        L_0x01d2:
            java.lang.String r1 = "ۧۛۢ۟ۛۥ۟ۤۙ۟۫ۨۢۖ۬ۘۗۧۡ۟"
            r2 = r1
            goto L_0x0014
        L_0x01d7:
            java.lang.String r1 = "ۙۛۜۖۧۥۘۢ۫ۜۘ۬ۤۖۘۧۘۨۚۖۖۘ"
            r2 = r1
            r4 = r5
            goto L_0x0014
        L_0x01dd:
            r2 = 1163917925(0x455ffa65, float:3583.6497)
            java.lang.String r1 = "ۨۥۦۡۜۥۘۦۥۜۖ۬ۨۘۛ۟ۚ"
        L_0x01e2:
            int r18 = r1.hashCode()
            r18 = r18 ^ r2
            switch(r18) {
                case -73219089: goto L_0x01f4;
                case 514628355: goto L_0x01c2;
                case 909240107: goto L_0x01ff;
                case 1132715360: goto L_0x01ec;
                default: goto L_0x01eb;
            }
        L_0x01eb:
            goto L_0x01e2
        L_0x01ec:
            java.lang.String r1 = "۟ۛۛۢ۬۬ۖۜۨۘ۟۫ۥۘۤۦۜۚ۠ۛۙۨۜۢ۫ۜ"
            r2 = r1
            goto L_0x0014
        L_0x01f1:
            java.lang.String r1 = "ۛۧ۫ۢۗۧۛۖۘۨۙ۫۫ۖۤۢ۫ۗ۠ۙ۬ۨۚۦ"
            goto L_0x01e2
        L_0x01f4:
            r0 = r21
            boolean r1 = r14.onTouchEvent(r0)
            if (r1 == 0) goto L_0x01f1
            java.lang.String r1 = "ۜ۟ۘۘ۫ۢۧۤ۫ۖۘۗۜۥۥۙۜۚۗۜۦۗ۫ۖۧ۠۟ۦ۫"
            goto L_0x01e2
        L_0x01ff:
            java.lang.String r1 = "ۡۖۨۗۖۖۘۛۖ۟ۦۨۖۘۦۗ۬ۤۢ"
            goto L_0x01e2
        L_0x0202:
            r3 = 1
            java.lang.String r1 = "ۘۜ۠ۛۙۙۙ۠۫۠ۘۢۦۙۡۘۨۙۚۖ۟ۖۤ۫۟۠ۘۛ"
            r2 = r1
            goto L_0x0014
        L_0x0208:
            java.lang.String r1 = "ۡۜۧۡۗۦۛ۫۬ۥۧ۟ۡۗۥۡۦۘۘ۫ۗۢ۟ۥۖۙۨۦ"
            r2 = r1
            r4 = r3
            goto L_0x0014
        L_0x020e:
            java.lang.String r1 = "ۛۜۛۥۨۖۛۦۛۨۦۥۚۦۧۘۗۢۖ"
            r2 = r1
            goto L_0x0014
        L_0x0213:
            java.lang.String r1 = "ۧۢۤۛۜۥ۠ۢۥۘۛ۟ۨۘۗ۫ۦۘ"
            r2 = r1
            goto L_0x0014
        L_0x0218:
            java.lang.String r1 = "ۘۙۥۘۤۧۖۥۥۜۘۛۜۘۖ۠۠۫۟۬ۘ۠ۥۘ۠۠ۨ"
            r2 = r1
            goto L_0x0014
        L_0x021d:
            java.lang.String r1 = "ۦۥۡۘۙۧۖۛۥۦۘۜ۟ۗۡۡۘۧۛ۬ۙ۠ۨ"
            r2 = r1
            goto L_0x0014
        L_0x0222:
            java.lang.String r1 = "۟ۜۘ۬ۥ۬ۗۧۦۘۜۙۛۦۦۖۘۜۗ۫ۡۦۘۘۢۛۜۤ۬ۙ"
            r2 = r1
            goto L_0x0014
        L_0x0227:
            java.lang.String r1 = "ۡۖۜ۬ۛ۠۬ۜۡۜۛ۬ۢۚۖۛۚ۟ۜۜۖۘ"
            r2 = r1
            goto L_0x0014
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.youbasha.ui.views.TouchDelegateGroup.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void removeTouchDelegate(TouchDelegate touchDelegate) {
        String str = "ۙ۬ۨ۫ۢۖۘۜۘۜۘۙۨۛۦۚۘ۟ۥۢ۠ۡۜۘۢۜۛ";
        while (true) {
            switch ((str.hashCode() ^ 61) ^ -1524655420) {
                case -1682036522:
                    return;
                case -1403896769:
                    str = "ۥۘۦۗۗۙۧۦ۬ۜۥۡۘۥۤۖۤۢۡۘۦۧۜ۫ۧۤۘۢۢ";
                    break;
                case -1280831264:
                    this.f1384b = null;
                    str = "۫۠۟ۘۦۨۘۤ۟ۧ۫۬ۥۘۙۜۜۘۢۜ۫ۜۙۡۘۜ۟ۘۨ۠ۨۘ";
                    break;
                case -995823128:
                    String str2 = "ۤۡۡۢ۫ۢۢۙ۠ۤۨۨۗۛۖۘۦۢۦۦۜۥۘ";
                    while (true) {
                        switch (str2.hashCode() ^ -1118507142) {
                            case -2040798809:
                                if (this.f1384b != touchDelegate) {
                                    str2 = "ۧۤۦ۬ۤۥۥۙ۬۫۬ۘۡۚۦۘ";
                                    break;
                                } else {
                                    str2 = "ۛۙۘۜ۟۫ۧۥۜۘ۠ۧۥۥۙۦۙۧۥ";
                                    break;
                                }
                            case -1038369132:
                                str = "۫۠۟ۘۦۨۘۤ۟ۧ۫۬ۥۘۙۜۜۘۢۜ۫ۜۙۡۘۜ۟ۘۨ۠ۨۘ";
                                continue;
                            case 1316738561:
                                str2 = "ۦۦۡۘۙ۫ۘۘۨۤۨۘۘۛۙۢۛۚۚۛۙۦ۠ۤۙۜۘۨ۫ۥ";
                                break;
                            case 1658358213:
                                str = "ۗۜۖۚۡۘۘۜۢ۫ۛۨۘۜۡۖ۟۟۫ۤ۫ۜۗ۫ۙ۬ۥۚ";
                                continue;
                        }
                    }
                    break;
                case -480158290:
                    this.f1383a.remove(touchDelegate);
                    str = "ۗۘۦۘۦۡۘۤۨۥۘۖۢۡۖۘۘۧۛۧ";
                    break;
                case 1171291775:
                    str = "ۥۚۢۨ۬ۘۛۢۡۛ۟ۤۥۙۗۜۥۘۘۙۧۘۢۜۘۗۥۘ";
                    break;
            }
        }
    }

    public void setEnabled(boolean z2) {
        String str = "ۖۤۡۘۗۦۦۤۥۚ۫ۨۚۥۢ۫۫ۗۤۢۦۖۢۧۧ۬ۡۨۘ";
        while (true) {
            switch ((str.hashCode() ^ 966) ^ 40577926) {
                case 129739497:
                    this.f1385c = z2;
                    str = "ۧۗۜۘۧۜۙۙۨ۫ۤۥۗۡۦۚۚۖۖ۠۠ۨۘ";
                    break;
                case 1327121799:
                    return;
                case 1676336277:
                    str = "ۜۙۜ۬ۥ۟ۜ۫ۢۛۢ۠ۜۗۨۘۚۘۧۘۧۥۡۘۨۤۤ";
                    break;
                case 1827438668:
                    str = "ۨۛۢ۟۬ۥۥۖۖۘۡ۟ۖۘ۬۠ۛ۟ۛۦ۬ۨۙۘۨۗ";
                    break;
            }
        }
    }
}
