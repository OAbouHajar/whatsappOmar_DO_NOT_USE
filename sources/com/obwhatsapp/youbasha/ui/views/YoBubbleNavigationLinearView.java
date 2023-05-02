package com.obwhatsapp.youbasha.ui.views;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import com.obwhatsapp.yo.d1;
import com.obwhatsapp.yo.yo;
import com.obwhatsapp.youbasha.others;
import java.util.ArrayList;

public class YoBubbleNavigationLinearView extends LinearLayout implements IBottomNavigation, View.OnClickListener {

    /* renamed from: f  reason: collision with root package name */
    public static final int f1386f = 0;

    /* renamed from: a  reason: collision with root package name */
    public ArrayList f1387a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f1388b;

    /* renamed from: c  reason: collision with root package name */
    public int f1389c = 1;

    /* renamed from: d  reason: collision with root package name */
    public boolean f1390d;

    /* renamed from: e  reason: collision with root package name */
    public SparseArray f1391e;

    public YoBubbleNavigationLinearView(@NonNull Context context) {
        super(context);
        a();
    }

    public YoBubbleNavigationLinearView(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public final void a() {
        String str = "ۗۧ۬ۘۖۤۧۙۡۘۘ۠ۨ۠۟ۢۜۗۡ";
        while (true) {
            switch ((str.hashCode() ^ 456) ^ -1682862708) {
                case -1205666025:
                    return;
                case 168474504:
                    post(new m(this, 1));
                    str = "ۥۡۙۢۚۖۗۖۥۖۢ۟ۚۜۨۘۙ۫ۛ";
                    break;
                case 213547924:
                    str = "ۤۘۨۤۗۖۦۖۤۜۚۦۜۡۨ۠ۖۥ";
                    break;
                case 804526567:
                    this.f1388b = yo.isGrpSeparateEnabled();
                    str = "ۖۨۚۙ۬ۚ۠ۥۘۘۛ۠ۨ۬ۡۥ۟ۢۦۦۤۥ۠۬۬۬ۖۡۘ";
                    break;
                case 1098097483:
                    setOrientation(0);
                    str = "ۢۖۜۛۤۖۘ۠ۖۖۗۙۢ۠ۢ۬۫ۖ۠";
                    break;
                case 1433974522:
                    setGravity(17);
                    str = "ۧۖۙۖۥۦۘۙۛۨۧ۬ۨ۫۠ۙۤۡۡۥۗۛۢۙۘۧۜۘ";
                    break;
                case 1700438797:
                    postDelayed(new m(this, 2), 250);
                    str = "ۧۘ۫ۥۙۡۧۤۨۘۛ۬ۦۘۧۗ";
                    break;
            }
        }
    }

    public int getCurrentActiveItemPosition() {
        String str = "ۜۥ۠ۖۙ۟۟ۥۜ۠ۛۥۘۡۚۦۘ";
        while (true) {
            switch ((str.hashCode() ^ 627) ^ -1606331419) {
                case -1299783951:
                    return this.f1389c;
                case 271228124:
                    str = "ۦۜۖۨۤۖۘۤۖۡۗۛۦۘۦۦ";
                    break;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onClick(android.view.View r22) {
        /*
            r21 = this;
            r18 = 0
            r6 = 0
            r17 = 0
            r14 = 0
            r16 = 0
            r13 = 0
            r15 = 0
            r12 = 0
            r11 = 0
            r10 = 0
            r9 = 0
            r7 = 0
            r8 = 0
            r4 = 0
            r5 = 0
            java.lang.String r2 = "۫ۨۧۘ۠ۧۥۡۢۚ۫ۡۜۘ۬ۧۛ"
            r3 = r2
        L_0x0015:
            int r2 = r3.hashCode()
            r19 = 539(0x21b, float:7.55E-43)
            r20 = 1990728041(0x76a81969, float:1.704729E33)
            r2 = r2 ^ r19
            r2 = r2 ^ r20
            switch(r2) {
                case -2096280078: goto L_0x0175;
                case -2086188700: goto L_0x00ab;
                case -1952104867: goto L_0x0239;
                case -1742205457: goto L_0x02a6;
                case -1592722583: goto L_0x0041;
                case -1370376501: goto L_0x0207;
                case -1317017319: goto L_0x00bf;
                case -1264593578: goto L_0x01ca;
                case -1261022145: goto L_0x0279;
                case -1218470561: goto L_0x028d;
                case -1190542987: goto L_0x0036;
                case -1145976445: goto L_0x01fb;
                case -1103630211: goto L_0x002a;
                case -1065619562: goto L_0x00b9;
                case -978022991: goto L_0x00c5;
                case -919323034: goto L_0x01aa;
                case -885409754: goto L_0x002e;
                case -521665855: goto L_0x01c1;
                case -499011033: goto L_0x02a6;
                case -420139581: goto L_0x014e;
                case -354926445: goto L_0x01d2;
                case -279251087: goto L_0x0047;
                case -249181452: goto L_0x0265;
                case -205031714: goto L_0x02a1;
                case -192764001: goto L_0x017d;
                case -178550732: goto L_0x003b;
                case -36406875: goto L_0x0258;
                case -8977944: goto L_0x025f;
                case 114959069: goto L_0x01f5;
                case 259751385: goto L_0x0297;
                case 428609283: goto L_0x006f;
                case 440283954: goto L_0x0233;
                case 557906148: goto L_0x020d;
                case 872223599: goto L_0x0156;
                case 1167938677: goto L_0x00ed;
                case 1232997155: goto L_0x0111;
                case 1324149490: goto L_0x00a4;
                case 1398812122: goto L_0x00b2;
                case 1445828822: goto L_0x0120;
                case 1521665141: goto L_0x0201;
                case 1716749099: goto L_0x012f;
                case 1948435186: goto L_0x026f;
                case 1981339118: goto L_0x00e4;
                case 2146044471: goto L_0x0026;
                default: goto L_0x0025;
            }
        L_0x0025:
            goto L_0x0015
        L_0x0026:
            java.lang.String r2 = "ۥۧۨۥۗۢۘۖۘۙۘۖۘۡۚۙ"
            r3 = r2
            goto L_0x0015
        L_0x002a:
            java.lang.String r2 = "ۗۚۚۥۧۡۘۜۦ۟ۗ۫ۗۘۦۚۤۗۥۘ"
            r3 = r2
            goto L_0x0015
        L_0x002e:
            int r18 = r22.getId()
            java.lang.String r2 = "ۦۛۖۗ۟ۙ۠ۛۦۖۘۘۨۢ۬ۢۦۡۖۨۗ۫ۨ۫ۚۜۘ"
            r3 = r2
            goto L_0x0015
        L_0x0036:
            r6 = 0
            java.lang.String r2 = "ۢۗۦۙ۬ۡۘ۠ۤۡۦ۬ۖۘۖ۟ۥۘ"
            r3 = r2
            goto L_0x0015
        L_0x003b:
            r17 = 0
            java.lang.String r2 = "۟ۘۘۜۤۛۦۜ۟ۖۚ۬۬ۘۚ"
            r3 = r2
            goto L_0x0015
        L_0x0041:
            java.lang.String r2 = "ۛۘۨۥۘۚۨۗۥۘۤ۠ۡۘۢۗۘ۫۬ۙ۠ۤۘۡۗۛۚۧۧ"
            r3 = r2
            r16 = r17
            goto L_0x0015
        L_0x0047:
            r3 = 1117429610(0x429a9f6a, float:77.311356)
            java.lang.String r2 = "ۨۥۤ۠ۘۖۘۧۗ۬ۜ۬ۜۘۥۘۙۡۥۡۜۧۘۗۧ۟۠ۜ"
        L_0x004c:
            int r19 = r2.hashCode()
            r19 = r19 ^ r3
            switch(r19) {
                case -1515268185: goto L_0x0274;
                case -872056505: goto L_0x0056;
                case 740204279: goto L_0x006b;
                case 1037492502: goto L_0x005c;
                default: goto L_0x0055;
            }
        L_0x0055:
            goto L_0x004c
        L_0x0056:
            java.lang.String r2 = "۬ۧۗۛۚ۫ۦۘۥۤۤۖۘ۬ۦۤۛۤۖۘۗۖۧ۫ۡۜۘۖۧۘ"
            goto L_0x004c
        L_0x0059:
            java.lang.String r2 = "۫ۧۢ۠ۖۘۙۦۢۛۥۥۡۥۘۚۙۜۘ"
            goto L_0x004c
        L_0x005c:
            r0 = r21
            java.util.ArrayList r2 = r0.f1387a
            int r2 = r2.size()
            r0 = r16
            if (r0 >= r2) goto L_0x0059
            java.lang.String r2 = "ۖۦۘۘۨ۫۠۠ۛ۬ۤۡۘۖۦۧۙۢۛۛۛۜۘۥۙۛ۫۠ۛ"
            goto L_0x004c
        L_0x006b:
            java.lang.String r2 = "ۧۘۦۘۧۚۡۘۧۗۧۛۤۛ۬ۜۛۙۤۤ۠ۖۖۘ۟ۢۘۘ"
            r3 = r2
            goto L_0x0015
        L_0x006f:
            r3 = -624900240(0xffffffffdac0c770, float:-2.71312397E16)
            java.lang.String r2 = "ۖ۟ۨ۫ۢۥۙۛ۬ۡۗۢ۟ۜۧۤۖۦۥۜۥۥۥۤۤۜۜ"
        L_0x0074:
            int r19 = r2.hashCode()
            r19 = r19 ^ r3
            switch(r19) {
                case -2099769972: goto L_0x007e;
                case -233740994: goto L_0x009c;
                case -220383544: goto L_0x009f;
                case 836864163: goto L_0x0085;
                default: goto L_0x007d;
            }
        L_0x007d:
            goto L_0x0074
        L_0x007e:
            java.lang.String r2 = "ۨۗۢۖۤۜۘۜۖۤۤۥۙۡۙۨۡۥ۟"
            r3 = r2
            goto L_0x0015
        L_0x0082:
            java.lang.String r2 = "ۡۥۨۡۥۦۘۗ۫ۦۡۦۜۘۘۜ۬ۨۖۗ۟ۖۖۦۛ۬ۜۤۖ"
            goto L_0x0074
        L_0x0085:
            r0 = r21
            java.util.ArrayList r2 = r0.f1387a
            r0 = r16
            java.lang.Object r2 = r2.get(r0)
            com.obwhatsapp.youbasha.ui.views.YoBubbleToggleView r2 = (com.obwhatsapp.youbasha.ui.views.YoBubbleToggleView) r2
            int r2 = r2.getId()
            r0 = r18
            if (r0 != r2) goto L_0x0082
            java.lang.String r2 = "ۧۘۤۗۢۢۛۥ۠ۘ۟ۡۗۙۘۘ۬ۘۦۗۘ۟"
            goto L_0x0074
        L_0x009c:
            java.lang.String r2 = "ۤۘۚۡۙۦۘۤۦ۫۫ۢ۠ۡۤۖ۟ۦۢ"
            goto L_0x0074
        L_0x009f:
            java.lang.String r2 = "ۗۜۡۘ۫۫ۘۗ۠ۘۘۙۜۤۗۥۦۘ۟ۥۜۘۜۡۘۘۙۦۧ۟ۦۖۘ"
            r3 = r2
            goto L_0x0015
        L_0x00a4:
            java.lang.String r2 = "ۖۖۧ۠ۨۥۧۜ۠ۤۛۖۤۡۘۛۡ۠۟ۢۦ۟ۖۜۘۛ۟ۜۘ"
            r3 = r2
            r15 = r16
            goto L_0x0015
        L_0x00ab:
            int r14 = r16 + 1
            java.lang.String r2 = "ۡۜۤۡۥ۟۠ۨۖۘۧۙۜۘۤۖ۫۟۬ۖۙۖۡۘۜۖ"
            r3 = r2
            goto L_0x0015
        L_0x00b2:
            java.lang.String r2 = "ۦۥۖۘۤ۬ۖۘۡۡۡۥ۫ۧۧۖۜۢ۬۬"
            r3 = r2
            r16 = r14
            goto L_0x0015
        L_0x00b9:
            r13 = -1
            java.lang.String r2 = "ۗ۬ۖۘ۠ۜۤۤۨۦۘۤۤۤۢۙ۠ۙۨۦۨ۬ۜۘ"
            r3 = r2
            goto L_0x0015
        L_0x00bf:
            java.lang.String r2 = "ۡۡ۟ۧۜۙ۟۬ۨۘۘۙۦۘۨۖ"
            r3 = r2
            r15 = r13
            goto L_0x0015
        L_0x00c5:
            r3 = 1183436031(0x4689ccff, float:17638.498)
            java.lang.String r2 = "ۨۥ۠ۚ۫۟ۢۧۖۘۗ۠ۘۘۦۦۖۘۘۛۨۨۗۛۡۤۥ۫ۖۦۘ"
        L_0x00ca:
            int r19 = r2.hashCode()
            r19 = r19 ^ r3
            switch(r19) {
                case -1909665909: goto L_0x00d4;
                case -624945502: goto L_0x02a1;
                case 1000214075: goto L_0x00df;
                case 1542520324: goto L_0x00da;
                default: goto L_0x00d3;
            }
        L_0x00d3:
            goto L_0x00ca
        L_0x00d4:
            java.lang.String r2 = "ۘۢۢۖۤۥۛ۟ۗۢۙۘۘۨۚۖۘۨ۠ۙۚۙۥ"
            goto L_0x00ca
        L_0x00d7:
            java.lang.String r2 = "ۥۦۖۗۗۖۘ۠ۢۙ۠ۢۧۡۘۙۙۧۡۘۛۘۗۖ۠۟"
            goto L_0x00ca
        L_0x00da:
            if (r15 < 0) goto L_0x00d7
            java.lang.String r2 = "ۛۖۖۘۤۚۦۘۙ۫ۖۘ۟ۦ۟۬ۡ"
            goto L_0x00ca
        L_0x00df:
            java.lang.String r2 = "ۢۛۘۧۡۖۚ۟ۤۡ۫۫ۜۜ۫۫۫ۨۘ"
            r3 = r2
            goto L_0x0015
        L_0x00e4:
            r0 = r21
            int r12 = r0.f1389c
            java.lang.String r2 = "ۜۧۜۘۤۢۦۨۧ۬۟۬ۡۘۘۥۤ"
            r3 = r2
            goto L_0x0015
        L_0x00ed:
            r3 = 182072040(0xada32e8, float:2.1011785E-32)
            java.lang.String r2 = "ۡۜۦۘ۬ۦۧ۫ۡۢ۫ۨۦۜ۬ۘۘۢۖۡۘ"
        L_0x00f2:
            int r19 = r2.hashCode()
            r19 = r19 ^ r3
            switch(r19) {
                case 432826871: goto L_0x010c;
                case 630915221: goto L_0x0109;
                case 721738576: goto L_0x0104;
                case 1275052270: goto L_0x00fc;
                default: goto L_0x00fb;
            }
        L_0x00fb:
            goto L_0x00f2
        L_0x00fc:
            java.lang.String r2 = "ۜۤۘۘۘۤۢۚۛۛۗۛۙۘ۟ۡ"
            r3 = r2
            goto L_0x0015
        L_0x0101:
            java.lang.String r2 = "ۚۢۦۧۗۙۘۚ۟ۧۘۨۢۤۛۚ"
            goto L_0x00f2
        L_0x0104:
            if (r15 != r12) goto L_0x0101
            java.lang.String r2 = "ۚۗۨۡۨۢۨۨۨۘ۠۬ۡۗۧۡۙ"
            goto L_0x00f2
        L_0x0109:
            java.lang.String r2 = "۠ۖۦۙۦۚۖۡۙۙۥۥۘۖۦۡۘۡۥۘ۟ۗۤ۫ۢۥ"
            goto L_0x00f2
        L_0x010c:
            java.lang.String r2 = "ۤ۬ۖۘ۬ۢۘۗۤۖۥۦۦۘ۟ۦۜ۫ۙۨۘ۫۟ۨۚۘ۠"
            r3 = r2
            goto L_0x0015
        L_0x0111:
            r0 = r21
            java.util.ArrayList r2 = r0.f1387a
            java.lang.Object r2 = r2.get(r12)
            com.obwhatsapp.youbasha.ui.views.YoBubbleToggleView r2 = (com.obwhatsapp.youbasha.ui.views.YoBubbleToggleView) r2
            java.lang.String r3 = "ۙۥۘۥۥۧۘۜۢۡۘۙۥۥ۬ۖۜۛۦۚۥ۟ۚ"
            r11 = r2
            goto L_0x0015
        L_0x0120:
            r0 = r21
            java.util.ArrayList r2 = r0.f1387a
            java.lang.Object r2 = r2.get(r15)
            com.obwhatsapp.youbasha.ui.views.YoBubbleToggleView r2 = (com.obwhatsapp.youbasha.ui.views.YoBubbleToggleView) r2
            java.lang.String r3 = "ۢۚۖۘۖۥۦ۟۟ۛۨۤ۬ۥۨۨۘۤ۠ۛۢۥۜۘ"
            r10 = r2
            goto L_0x0015
        L_0x012f:
            r3 = -330155020(0xffffffffec523bf4, float:-1.0166302E27)
            java.lang.String r2 = "ۧۡۨ۠ۚۙۘۨۦۘۗۥۤۘۨۖۘۚۜۨۛۜ۠"
        L_0x0134:
            int r19 = r2.hashCode()
            r19 = r19 ^ r3
            switch(r19) {
                case -1113362725: goto L_0x013e;
                case -95181318: goto L_0x0146;
                case 1319806531: goto L_0x014b;
                case 1514961109: goto L_0x027e;
                default: goto L_0x013d;
            }
        L_0x013d:
            goto L_0x0134
        L_0x013e:
            java.lang.String r2 = "ۙ۫ۧ۫ۚۡۘۜۚۗۤۧ۠۟ۗۙ۬ۙۖۘۗۤۗ۫ۦۢۡۧۥ"
            r3 = r2
            goto L_0x0015
        L_0x0143:
            java.lang.String r2 = "ۥ۬ۖ۟ۤۙ۬۠ۘ۬ۜۘۛۘۧ"
            goto L_0x0134
        L_0x0146:
            if (r11 == 0) goto L_0x0143
            java.lang.String r2 = "۬ۙ۫ۗۗ۬ۜۦۥ۟۬ۚۗۙۨۙۛۥۘۖۧۙ۬ۖ"
            goto L_0x0134
        L_0x014b:
            java.lang.String r2 = "ۚۛ۫۫ۘۧ۠ۤۖۘۚ۫ۥۘۧ۬ۨۘ"
            goto L_0x0134
        L_0x014e:
            r11.toggle()
            java.lang.String r2 = "ۜۨۡۘۗۚۨۦۤۘۘۧۨۤۧۥۜ۟ۢۚۚ۬ۡۦۚۤ"
            r3 = r2
            goto L_0x0015
        L_0x0156:
            r3 = -952631363(0xffffffffc737ffbd, float:-47103.74)
            java.lang.String r2 = "ۗۙۗۧۤۥۘۢۧ۫ۧۙۨۘۖۨۥۛۤۘۘ"
        L_0x015b:
            int r19 = r2.hashCode()
            r19 = r19 ^ r3
            switch(r19) {
                case -725216837: goto L_0x0170;
                case -578655708: goto L_0x016b;
                case 418358924: goto L_0x0165;
                case 739807819: goto L_0x0283;
                default: goto L_0x0164;
            }
        L_0x0164:
            goto L_0x015b
        L_0x0165:
            java.lang.String r2 = "ۚ۠ۗۗۙۜۦ۬۟ۚۧۚ۬ۜۘۨ۠ۛۦۖۖۘۛۧۙ۬ۢ۟"
            goto L_0x015b
        L_0x0168:
            java.lang.String r2 = "ۡۙۖۥ۟ۤۢ۟ۜۡۢۦۘۥۘ۬۬ۧۘ۠ۘۘ"
            goto L_0x015b
        L_0x016b:
            if (r10 == 0) goto L_0x0168
            java.lang.String r2 = "۫ۤۦۘۛ۠ۘۘۚۜۖۘۗ۬ۦۘۥۡۧۘ۫۬۠ۗۡۘۨۙۙ"
            goto L_0x015b
        L_0x0170:
            java.lang.String r2 = "ۚۡۖۘۛۛ۟ۥۧۖ۟ۖۗۚۡۘۦۖۜۘ۟۟ۥۖۡۥۨۤ۬"
            r3 = r2
            goto L_0x0015
        L_0x0175:
            r10.toggle()
            java.lang.String r2 = "ۛۡۥ۬ۙۥ۫ۜۦۘۖۗۥۘ۠ۧۙۢۧ۟ۙ۠ۦۛۗۖۦۜۖ"
            r3 = r2
            goto L_0x0015
        L_0x017d:
            r3 = 1681296870(0x64368de6, float:1.3470129E22)
            java.lang.String r2 = "ۚۡۗۨۙ۠ۤۤ۬۠ۨۗۖ۬ۤ"
        L_0x0182:
            int r19 = r2.hashCode()
            r19 = r19 ^ r3
            switch(r19) {
                case -2140329126: goto L_0x01a7;
                case -929882454: goto L_0x0194;
                case -882536817: goto L_0x018c;
                case 845601475: goto L_0x0288;
                default: goto L_0x018b;
            }
        L_0x018b:
            goto L_0x0182
        L_0x018c:
            java.lang.String r2 = "ۡۦۘۘۧۦۘۥۘ۠۫ۚ۟۬ۘۗ"
            r3 = r2
            goto L_0x0015
        L_0x0191:
            java.lang.String r2 = "ۢۜۦۘۘۚۢۙۚۤۖ۟ۧۥۗۢۨۜۜۘۤۜۥۘۥۥۘۘۖۗۢ"
            goto L_0x0182
        L_0x0194:
            java.lang.Object r2 = r22.getTag()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r19 = "b_settings"
            r0 = r19
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L_0x0191
            java.lang.String r2 = "ۚۙۧ۟ۢۖۢۖ۟ۖۡۛۡۧۧۤۧۨۥۡ۬"
            goto L_0x0182
        L_0x01a7:
            java.lang.String r2 = "ۗۙ۠ۙۖۦۘۤ۫۠ۨ۠ۜۛۥۚۨۢۛ۬۬ۗ۬ۦ۠۟۠ۢ"
            goto L_0x0182
        L_0x01aa:
            com.obwhatsapp.HomeActivity r2 = com.obwhatsapp.yo.yo.Homeac
            android.content.Intent r3 = new android.content.Intent
            com.obwhatsapp.HomeActivity r19 = com.obwhatsapp.yo.yo.Homeac
            java.lang.Class<com.obwhatsapp.youbasha.ui.YoSettings.AllSettings> r20 = com.obwhatsapp.youbasha.ui.YoSettings.AllSettings.class
            r0 = r19
            r1 = r20
            r3.<init>(r0, r1)
            r2.startActivity(r3)
            java.lang.String r2 = "۟۬۠ۛۛۖۧ۫۬ۙۡۗۗ۫ۖۗ۬"
            r3 = r2
            goto L_0x0015
        L_0x01c1:
            r0 = r21
            r0.f1389c = r15
            java.lang.String r2 = "۫ۙۨۘ۬ۙۥۡۖۘۘۥۡۢۙۥۢۘۢۙ۟ۖ۫"
            r3 = r2
            goto L_0x0015
        L_0x01ca:
            com.obwhatsapp.yo.u1.changeWAViewPager(r15)
            java.lang.String r2 = "ۜ۬۫ۚۖۜۢۡۛۙۗۖۘۤۦۚ"
            r3 = r2
            goto L_0x0015
        L_0x01d2:
            r3 = -28018036(0xfffffffffe547a8c, float:-7.060816E37)
            java.lang.String r2 = "۠ۧۜۘۡۢۨۘۢ۟ۦۘۖۗ۟ۗۖۘۦۖۤۥۜۘۘۢۘۦ"
        L_0x01d7:
            int r19 = r2.hashCode()
            r19 = r19 ^ r3
            switch(r19) {
                case -1805590208: goto L_0x01f2;
                case -1631899665: goto L_0x01e9;
                case -57592068: goto L_0x01e1;
                case 2039286149: goto L_0x0292;
                default: goto L_0x01e0;
            }
        L_0x01e0:
            goto L_0x01d7
        L_0x01e1:
            java.lang.String r2 = "ۦ۫ۢۘ۬ۜ۫ۥۢ۟ۘۜۧ۠ۥۘۨۤۛۨۜۗۚ۟۠ۨۜۨ"
            r3 = r2
            goto L_0x0015
        L_0x01e6:
            java.lang.String r2 = "ۧۡۤۛۡۡۘۦۢۧۗۖۗ۟ۚۜۚۢ۠۬ۖ۫ۜۗۚ"
            goto L_0x01d7
        L_0x01e9:
            r0 = r21
            int r2 = r0.f1389c
            if (r2 != 0) goto L_0x01e6
            java.lang.String r2 = "ۦۢۢۘۜۢ۫ۛۨۘۘۦۨۜۡۥۘ۬ۡۢۨۨۖۘۤ۫ۨ۫ۛۨ"
            goto L_0x01d7
        L_0x01f2:
            java.lang.String r2 = "ۖۜۗ۠ۛۜۘ۟۠ۤ۟ۛۗۢۧۥۡۥۗ۟۫ۡ۬۟ۥ"
            goto L_0x01d7
        L_0x01f5:
            r9 = 1
            java.lang.String r2 = "ۘ۠ۛۙۦۢۜۗۧۨۢ۬ۖۨۖۥۘ۠"
            r3 = r2
            goto L_0x0015
        L_0x01fb:
            java.lang.String r2 = "ۘۨۘۦۨۡۥۜۧۡۙۜۘۘۢۥۘۘۡ۫ۧۛۗ"
            r3 = r2
            r8 = r9
            goto L_0x0015
        L_0x0201:
            r7 = 0
            java.lang.String r2 = "۫ۛۥۘۚۥۦۙۧۡۘ۫ۚۢۡۢۡۘۚ۬ۦۘۙۖۧ۬ۖ۬۠ۤۧ"
            r3 = r2
            goto L_0x0015
        L_0x0207:
            java.lang.String r2 = "ۚۧ۠ۗۨ۠ۦۛۥۘۨۨۦۛۦۜۘۘۘۥۚۗۧۢۙۥ۬ۛۥ"
            r3 = r2
            r8 = r7
            goto L_0x0015
        L_0x020d:
            r3 = 886808113(0x34db9e31, float:4.0907028E-7)
            java.lang.String r2 = "ۨۚ۠ۤۡۧ۠ۗۛ۟ۜۦۜۙۨۘۚ۟ۨ"
        L_0x0212:
            int r19 = r2.hashCode()
            r19 = r19 ^ r3
            switch(r19) {
                case -824952883: goto L_0x022e;
                case 517777681: goto L_0x021c;
                case 522756126: goto L_0x022b;
                case 1380266596: goto L_0x0224;
                default: goto L_0x021b;
            }
        L_0x021b:
            goto L_0x0212
        L_0x021c:
            java.lang.String r2 = "۟ۛۘۘۨۦۦۛۢۢ۟ۘۘۨۘۙۜۦۘۛۤ۠ۜۡۨۨۧ"
            r3 = r2
            goto L_0x0015
        L_0x0221:
            java.lang.String r2 = "۠۟ۧۧۡۘۤۗۗۢۙۨۘۨۥۚ۬ۚ۫ۜۧ"
            goto L_0x0212
        L_0x0224:
            boolean r2 = com.obwhatsapp.yo.yo.isCommunityEnabled
            if (r2 == 0) goto L_0x0221
            java.lang.String r2 = "ۢ۫ۙ۬ۖۛ۟ۦۖۘ۫ۨۡۘۤۢۨۘۚۗۘ"
            goto L_0x0212
        L_0x022b:
            java.lang.String r2 = "ۨۧۚۤۛۥۘ۠ۤۗۗ۬۫ۙۚۤۤ۠۟۠ۘۘۗ۟ۜۘ"
            goto L_0x0212
        L_0x022e:
            java.lang.String r2 = "ۥۡۧۙ۟ۢۤۦۧ۟ۘۧۦۘ"
            r3 = r2
            goto L_0x0015
        L_0x0233:
            java.lang.String r2 = "ۢۙ۫ۥۧۘ۬ۙۢۡۗ۟ۚۧۖۦۡۗۧ۬ۖۘۚۤ۫ۧۥ"
            r3 = r2
            r5 = r6
            goto L_0x0015
        L_0x0239:
            r3 = -1494248861(0xffffffffa6ef9263, float:-1.6623635E-15)
            java.lang.String r2 = "ۙۤ۬۠ۡۖۘۤۨ۟ۚۥۜۘۤۙۦۘ"
        L_0x023e:
            int r19 = r2.hashCode()
            r19 = r19 ^ r3
            switch(r19) {
                case -1784549178: goto L_0x0248;
                case -693198209: goto L_0x0253;
                case -36477874: goto L_0x0250;
                case 730458938: goto L_0x029c;
                default: goto L_0x0247;
            }
        L_0x0247:
            goto L_0x023e
        L_0x0248:
            if (r8 == 0) goto L_0x024d
            java.lang.String r2 = "۬ۖۙۜۨۙۙۙۖۚۗۦۜۙۨۘۦۚ۟"
            goto L_0x023e
        L_0x024d:
            java.lang.String r2 = "ۧۥۤۢۧۥۘۙۚۢۘۥۤۤۥۧۘ۫ۚۡۘۗۨۢۤۥ۟"
            goto L_0x023e
        L_0x0250:
            java.lang.String r2 = "ۢۜۦۘۘۛۧۜۡۘۦۢۦۘۗۙۧ"
            goto L_0x023e
        L_0x0253:
            java.lang.String r2 = "ۜۗ۠ۛۦۛ۫ۨۡۘۙۖۘۨۜۜۨ۬ۦۘۤۘۥۘۧۥۨۥۨۥۘ"
            r3 = r2
            goto L_0x0015
        L_0x0258:
            r4 = 8
            java.lang.String r2 = "ۨ۬ۗ۟۠ۖۙۦ۬ۚۨ۫۟ۗۖۘ"
            r3 = r2
            goto L_0x0015
        L_0x025f:
            java.lang.String r2 = "ۗۚ۟ۛۘۥۢۙۛ۟ۨۥۡۜۙۡۘۘۡۥ۬ۧۘۘۢۢ"
            r3 = r2
            r5 = r4
            goto L_0x0015
        L_0x0265:
            r0 = r21
            r0.setVisibility(r5)
            java.lang.String r2 = "۠۬ۘۜۙۘۘۜ۫ۛۘۙۚۖۥۦۛ۬۫ۡۙۦ"
            r3 = r2
            goto L_0x0015
        L_0x026f:
            java.lang.String r2 = "ۛۘۨۥۘۚۨۗۥۘۤ۠ۡۘۢۗۘ۫۬ۙ۠ۤۘۡۗۛۚۧۧ"
            r3 = r2
            goto L_0x0015
        L_0x0274:
            java.lang.String r2 = "ۚۨۡۘۙ۟ۦۖۨۥۨۦ۬ۡۗۡۘۦۥۡۘ۬ۦۜۢۦۡۘ"
            r3 = r2
            goto L_0x0015
        L_0x0279:
            java.lang.String r2 = "ۡۡ۟ۧۜۙ۟۬ۨۘۘۙۦۘۨۖ"
            r3 = r2
            goto L_0x0015
        L_0x027e:
            java.lang.String r2 = "ۜۨۡۘۗۚۨۦۤۘۘۧۨۤۧۥۜ۟ۢۚۚ۬ۡۦۚۤ"
            r3 = r2
            goto L_0x0015
        L_0x0283:
            java.lang.String r2 = "ۛۡۥ۬ۙۥ۫ۜۦۘۖۗۥۘ۠ۧۙۢۧ۟ۙ۠ۦۛۗۖۦۜۖ"
            r3 = r2
            goto L_0x0015
        L_0x0288:
            java.lang.String r2 = "ۦۖۨۥۖۛۡ۟ۧ۫ۤۡۢۤ۠ۛۦ۫"
            r3 = r2
            goto L_0x0015
        L_0x028d:
            java.lang.String r2 = "ۜ۬۫ۚۖۜۢۡۛۙۗۖۘۤۦۚ"
            r3 = r2
            goto L_0x0015
        L_0x0292:
            java.lang.String r2 = "ۨۖۜۘۖۚ۟ۥۚۦ۠ۖۨ۫ۘۛۥۘۖ"
            r3 = r2
            goto L_0x0015
        L_0x0297:
            java.lang.String r2 = "ۚۧ۠ۗۨ۠ۦۛۥۘۨۨۦۛۦۜۘۘۘۥۚۗۧۢۙۥ۬ۛۥ"
            r3 = r2
            goto L_0x0015
        L_0x029c:
            java.lang.String r2 = "ۗۚ۟ۛۘۥۢۙۛ۟ۨۥۡۜۙۡۘۘۡۥ۬ۧۘۘۢۢ"
            r3 = r2
            goto L_0x0015
        L_0x02a1:
            java.lang.String r2 = "۠۬ۘۜۙۘۘۜ۫ۛۘۙۚۖۥۦۛ۬۫ۡۙۦ"
            r3 = r2
            goto L_0x0015
        L_0x02a6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.youbasha.ui.views.YoBubbleNavigationLinearView.onClick(android.view.View):void");
    }

    public void onFinishInflate() {
        String str = "ۛۢۘۘۛ۠ۦۛۘۤۚ۫ۥۘۘۗۢ۫ۙۘ۠ۛۧ۠ۦۘۘ";
        while (true) {
            switch ((str.hashCode() ^ 647) ^ 1464935901) {
                case 758474144:
                    str = "ۤۤۜۘۚۢۢۛۚۦۥ۫ۛۦۥ۠ۡۡۘۛۚۚۙ۫ۘۘ";
                    break;
                case 823121298:
                    return;
                case 1715797547:
                    others.pagerTabBk(this);
                    str = "ۤۢۥۨ۟۠ۨۥۡۘۤ۫ۥ۠ۛۜۘ۬ۗۘۖۤۤ";
                    break;
                case 1974073360:
                    super.onFinishInflate();
                    str = "۠ۛۧ۠ۗ۠ۙۖۖۙ۟ۜۘ۬ۜۘۘ۬ۤۢۧ۬ۨۘ";
                    break;
            }
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        String str = "ۙۘۦۘۥۜۨۙۧۡۘۤۢۨ۠۟ۚ۠ۤ۠";
        Parcelable parcelable2 = null;
        Bundle bundle = null;
        Parcelable parcelable3 = null;
        while (true) {
            switch ((str.hashCode() ^ 722) ^ 1257577216) {
                case -1820765269:
                    str = "ۨۦۗۗۛۡۘۤۦۜۖۜۦۘۡۛۧ";
                    parcelable3 = parcelable2;
                    break;
                case -1788400026:
                    str = "ۖۡۨۖۜۛ۟ۡۧۘ۫ۢۘۘۘۨۡۜ۠ۥ۠ۖۜ";
                    break;
                case -1656043334:
                    parcelable2 = bundle.getParcelable("superState");
                    str = "ۖۧۢۨۤۡۡ۠ۛۛۖۜ۠ۧۛۙۦۖۜۖۧۘ";
                    break;
                case -1534943255:
                    this.f1389c = bundle.getInt("current_item");
                    str = "ۜۛۜۘۚۡۡۘۗۛۚۘۛۖۘۦۡ۬";
                    break;
                case -1369790307:
                    this.f1390d = bundle.getBoolean("load_prev_state");
                    str = "ۨۘۡۘۜۨۨۡۘ۫ۨ۠۟";
                    break;
                case -93472236:
                    str = "ۘۘۧۘۡۚۤۚۜۤۘ۫ۦ۫۠ۧۗۢۖۖۖۘۦۦۘۘ";
                    break;
                case 19727456:
                    return;
                case 853617653:
                    str = "ۨۖۙۥۨ۟ۘۙۥۘ۬ۘۛ۬۬ۥ";
                    bundle = (Bundle) parcelable;
                    break;
                case 934298620:
                    String str2 = "ۗۡۡۘۜۖۦۚۧۨۧۜۤۦۥۚ";
                    while (true) {
                        switch (str2.hashCode() ^ 1451811470) {
                            case -1320679381:
                                str2 = "ۗۤۦۘ۠ۨۜۤۗۨۘ۬۬ۘۧۗۢۗ۠ۚۘۥ۬ۧۥۗۡۘ۠";
                                break;
                            case 1712600862:
                                str = "ۦۨۙ۬ۥۥۘۨۖۗۗۡۖۧ۟ۗ۠۟۟";
                                continue;
                            case 1724513074:
                                if (!(parcelable instanceof Bundle)) {
                                    str2 = "۫ۗۥۘۖۡۡۗۘۤۙۙۛ۟ۗۥۘ۟ۧ";
                                    break;
                                } else {
                                    str2 = "ۚۜۧۘ۠۫ۡۧۛۘ۬ۘۘۘۗۜۗ";
                                    break;
                                }
                            case 2009032844:
                                str = "ۨۦۗۗۛۡۘۤۦۜۖۜۦۘۡۛۧ";
                                continue;
                        }
                    }
                    break;
                case 1207784093:
                    super.onRestoreInstanceState(parcelable3);
                    str = "ۢۨۜۘ۠ۡۤۘۨۜۘۙۜۙۚۛۜ";
                    break;
                case 1424186406:
                    str = "ۡۖۨۦۘۘۦۙۘۘۤۥ۬ۢۖ۬ۗۘۖۘۛۜۥ";
                    parcelable3 = parcelable;
                    break;
            }
        }
    }

    public Parcelable onSaveInstanceState() {
        Bundle bundle = null;
        String str = "ۦۜ۟ۦۨۛۧۜۖۢۦۗۧ۠۠";
        while (true) {
            switch ((str.hashCode() ^ 915) ^ 535414974) {
                case -1767576729:
                    return bundle;
                case -917064650:
                    bundle.putParcelable("superState", super.onSaveInstanceState());
                    str = "ۦۖۧۘۗۦ۫ۦۢۙۛۘۘۛۨۥ۠ۛۗ۫ۛ۟ۖۘۧۡۜۦۘ";
                    break;
                case -664301208:
                    str = "ۦۙۢۙۢۦۘۙۧۨۙۘۗ۫ۘۦۘۢ۠۟ۘ۬۟ۦۚۦۘۚۛۛ";
                    break;
                case -569145827:
                    bundle.putBoolean("load_prev_state", true);
                    str = "ۤۦۦۨۙۦۘۥۡۜ۫۫ۦۘۧ۟ۙۘۚۛۖۨ۟";
                    break;
                case 1785623694:
                    bundle = new Bundle();
                    str = "۫ۙۘۘۡۙ۟ۨ۠ۦ۟ۚۙۦۚۤۥۥۘۘۚۧۙۡۛۨۙ۫";
                    break;
                case 1972192941:
                    bundle.putInt("current_item", this.f1389c);
                    str = "ۧۧۡۥۤۖۘۘۡۡۥۧۡۘۙۛ۫ۚ۟ۤۛۖۨۘ";
                    break;
            }
        }
    }

    public void setBadgeValue(int i2, String str) {
        String str2 = "ۥۧۢۗۖۚۢۚۘۘۤ۠ۙۢۜۦۨۥۥۘۧۚۡۘۤۜۨۘۚ۠۫";
        while (true) {
            switch ((str2.hashCode() ^ 280) ^ 1477856634) {
                case -1991402305:
                    str2 = "۠ۦۨۘ۟ۛ۠ۖۚۨۘۢۤۖۘۛۜۗۧۘۨ";
                    break;
                case 1051210275:
                    str2 = "۟ۘۢۜۛۗ۟ۗۗۤ۠ۡۘۨۙۥۚۡۙۢۤ۠";
                    break;
                case 1267743365:
                    return;
                case 1375787643:
                    post(new d1(this, i2, str));
                    str2 = "۫ۥۥۤۢۖۨ۫ۦۘۜۧ۠ۗۢۥ";
                    break;
                case 2083091589:
                    str2 = "ۤۤۘ۫۠۠ۧۗۨۜۗۚۚۛۡۘۥ۠ۦ";
                    break;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setCurrentActiveItem(int r6) {
        /*
            r5 = this;
            r1 = 0
            java.lang.String r0 = "ۗۤۨۚۥ۬۠ۧۧۘۜۦ۬ۤۘۥۦۡ"
        L_0x0003:
            int r2 = r0.hashCode()
            r3 = 299(0x12b, float:4.19E-43)
            r4 = 2037044139(0x796ad3ab, float:7.6205663E34)
            r2 = r2 ^ r3
            r2 = r2 ^ r4
            switch(r2) {
                case -2070270190: goto L_0x0015;
                case -2017251078: goto L_0x005f;
                case -1657798508: goto L_0x00b7;
                case -1435955868: goto L_0x00b7;
                case 114837778: goto L_0x00a0;
                case 249206839: goto L_0x0018;
                case 638130660: goto L_0x0039;
                case 765489877: goto L_0x00b3;
                case 1125185155: goto L_0x001d;
                case 1397738280: goto L_0x0012;
                case 1409211199: goto L_0x00b7;
                case 1414567209: goto L_0x007b;
                case 2031165862: goto L_0x003e;
                default: goto L_0x0011;
            }
        L_0x0011:
            goto L_0x0003
        L_0x0012:
            java.lang.String r0 = "ۚۛۜۡۖۧۘۜۖۖ۫ۗۜ۬ۖۚۡۘۙۨۚ۫"
            goto L_0x0003
        L_0x0015:
            java.lang.String r0 = "ۢۛۗۗ۬ۧ۟ۛۡۘ۫۫ۢۥۙۨۜۧۥۘ"
            goto L_0x0003
        L_0x0018:
            java.util.ArrayList r1 = r5.f1387a
            java.lang.String r0 = "ۖۡۜۢ۠ۦۘۨ۠ۖۗ۠ۛۛ۫ۨۚۘۘۤۙۡۘ"
            goto L_0x0003
        L_0x001d:
            r2 = -416000557(0xffffffffe73455d3, float:-8.5160914E23)
            java.lang.String r0 = "ۢۗۢۡۤۜۥۢ۠ۚۢۚۡۡۖۙۘۧۘ"
        L_0x0022:
            int r3 = r0.hashCode()
            r3 = r3 ^ r2
            switch(r3) {
                case -1976139816: goto L_0x0031;
                case -1450997616: goto L_0x0036;
                case 931657025: goto L_0x002b;
                case 1734664144: goto L_0x00af;
                default: goto L_0x002a;
            }
        L_0x002a:
            goto L_0x0022
        L_0x002b:
            java.lang.String r0 = "۫ۦۜۤۢۖۘۘۥۨ۫ۧۨۘ۫ۡ۟ۜۘۘ۠ۥۢ"
            goto L_0x0003
        L_0x002e:
            java.lang.String r0 = "ۦۧۖۘ۫ۗۙۢۗ۟۟ۜۡ۟۫ۥۘ"
            goto L_0x0022
        L_0x0031:
            if (r1 != 0) goto L_0x002e
            java.lang.String r0 = "ۚ۟۫ۢ۟ۨۘۤۛۦ۟ۧۜ۟۠ۨۤ۫ۨۖۙۘ"
            goto L_0x0022
        L_0x0036:
            java.lang.String r0 = "ۦۥۘۤ۟ۦۘۗۥۥۗۘۜۘۧ۫ۜۤۡۖ۟۫۟۫۫ۖ"
            goto L_0x0022
        L_0x0039:
            r5.f1389c = r6
            java.lang.String r0 = "ۘۧۡۨ۫۟ۘۤۖۘۢۤۦۘۙ۠۟۫ۡۦۘ"
            goto L_0x0003
        L_0x003e:
            r2 = 1111035147(0x42390d0b, float:46.262737)
            java.lang.String r0 = "ۚۖ۬ۦۦ۟ۥۙۧ۫ۚۨۥۚۡ"
        L_0x0043:
            int r3 = r0.hashCode()
            r3 = r3 ^ r2
            switch(r3) {
                case -401372518: goto L_0x005c;
                case 92800089: goto L_0x004c;
                case 880109316: goto L_0x0059;
                case 2044138588: goto L_0x0052;
                default: goto L_0x004b;
            }
        L_0x004b:
            goto L_0x0043
        L_0x004c:
            java.lang.String r0 = "ۛ۫ۨۘۥ۫۫۫ۗۡۚ۠ۙ۟ۛۡۘۜۤۢۙۜۧ۫ۨ۬ۙۨۘ"
            goto L_0x0003
        L_0x004f:
            java.lang.String r0 = "ۖۦۥ۠ۧۨ۬ۨۛۢۥۘۙۜۨ۟ۗۜۡۨۨۘ۠ۚ"
            goto L_0x0043
        L_0x0052:
            int r0 = r5.f1389c
            if (r0 != r6) goto L_0x004f
            java.lang.String r0 = "۠۟ۦۘۦۦۦۘۗۛۦۘۧ۫ۥۚۧۨۜۘ"
            goto L_0x0043
        L_0x0059:
            java.lang.String r0 = "ۙۢۗ۟ۢ۟ۧ۬ۦۘۖۘ۠ۨۚۘۘۚۙۛ"
            goto L_0x0043
        L_0x005c:
            java.lang.String r0 = "ۗ۠۟ۖ۠ۜۘ۠ۤۦۘۨۙ۫ۧ۟ۜۥۙۥ۬ۢۘۤۡۨۘۚۦۥ"
            goto L_0x0003
        L_0x005f:
            r2 = -390124155(0xffffffffe8bf2d85, float:-7.2224935E24)
            java.lang.String r0 = "ۤۡۗ۫۠ۘۘ۟۠ۜۚۢۙ۫ۜۖۘۜۗۨۤۘۜۘ۟ۖۗ"
        L_0x0064:
            int r3 = r0.hashCode()
            r3 = r3 ^ r2
            switch(r3) {
                case -2012572596: goto L_0x006d;
                case -1658409794: goto L_0x0073;
                case -313312735: goto L_0x00b3;
                case 904497792: goto L_0x0078;
                default: goto L_0x006c;
            }
        L_0x006c:
            goto L_0x0064
        L_0x006d:
            java.lang.String r0 = "۟ۘۜۗ۬۬ۛۥۤۘۖۦۢۧۥۘۛ۫ۜۧۦۛ۫ۢۖ۬ۦۘ"
            goto L_0x0003
        L_0x0070:
            java.lang.String r0 = "ۖ۫ۖۘۤۦۢۚۡۚۖ۠ۗ۟ۧۜۧ۫ۨۘۥۥۡ۬ۦۛۙۜۜۘ"
            goto L_0x0064
        L_0x0073:
            if (r6 < 0) goto L_0x0070
            java.lang.String r0 = "ۡۘۨۘۧۧۡۦۤ۫ۥۛۧۥ۬"
            goto L_0x0064
        L_0x0078:
            java.lang.String r0 = "ۦۡۖ۟ۨۡۛۥ۫ۢۡۘۘۤۖ۟۬ۦۧۡۜۘۗۢۡۧۨۦ"
            goto L_0x0064
        L_0x007b:
            r2 = 1423790399(0x54dd513f, float:7.6044068E12)
            java.lang.String r0 = "ۤۜۦۘ۟ۙۤۛۧۖۛۦۧۢۖۜۘ"
        L_0x0080:
            int r3 = r0.hashCode()
            r3 = r3 ^ r2
            switch(r3) {
                case -1552323283: goto L_0x0099;
                case 1758788066: goto L_0x009c;
                case 1802874237: goto L_0x0090;
                case 2032050352: goto L_0x0089;
                default: goto L_0x0088;
            }
        L_0x0088:
            goto L_0x0080
        L_0x0089:
            java.lang.String r0 = "ۖۧۦۖۡۘۙ۬ۥۘ۬ۙۖ۬ۡۦۘ"
            goto L_0x0003
        L_0x008d:
            java.lang.String r0 = "ۙۤۜۘ۫ۙۨۘۥۛۨۘۜۤ۬ۤۘۖۘ"
            goto L_0x0080
        L_0x0090:
            int r0 = r1.size()
            if (r6 < r0) goto L_0x008d
            java.lang.String r0 = "۫ۗۦۙۤۤۙۤۡۘۦۥۛۙۜۦۚ۫۫"
            goto L_0x0080
        L_0x0099:
            java.lang.String r0 = "ۛۡۘ۫ۡۦۢ۫ۧ۠ۤ۠ۤۥۨۜ۟ۡ۠ۛۨۤۥۘ"
            goto L_0x0080
        L_0x009c:
            java.lang.String r0 = "ۙۗۘۘۨۢۙ۫ۖۨ۟ۥ۫ۧۤۛ"
            goto L_0x0003
        L_0x00a0:
            java.util.ArrayList r0 = r5.f1387a
            java.lang.Object r0 = r0.get(r6)
            com.obwhatsapp.youbasha.ui.views.YoBubbleToggleView r0 = (com.obwhatsapp.youbasha.ui.views.YoBubbleToggleView) r0
            r0.performClick()
            java.lang.String r0 = "ۢۖۘۙۚۢ۫ۦۚۖۗۧۨۘۘ"
            goto L_0x0003
        L_0x00af:
            java.lang.String r0 = "ۨۚۤۖۗ۬۫ۤۗۧۧۖۘ۫ۥۧ"
            goto L_0x0003
        L_0x00b3:
            java.lang.String r0 = "ۢۖۘۙۚۢ۫ۦۚۖۗۧۨۘۘ"
            goto L_0x0003
        L_0x00b7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.youbasha.ui.views.YoBubbleNavigationLinearView.setCurrentActiveItem(int):void");
    }

    public void updateIconsColors() {
        String str = "ۖۙۡۗۥۛۢۙۦۘ۠ۢۗۖۚ۬۫ۢۥۘۙۖۚ";
        while (true) {
            switch ((str.hashCode() ^ 513) ^ -2038606377) {
                case -683636758:
                    post(new m(this, 0));
                    str = "ۥۧۢۗ۟ۖۘۛۙۤۧ۠۟ۖۨۡۘ۫ۙۘۘۘۥۧۘۧۖۜۘ";
                    break;
                case -534668578:
                    str = "ۜۤۛۧۚۖۘ۬۠ۢۘۨ۠ۙۘ۫ۜۢۤ";
                    break;
                case -220054660:
                    return;
            }
        }
    }
}
