package com.obwhatsapp.youbasha;

import android.app.Activity;
import android.view.ViewGroup;
import com.obwhatsapp.Conversation;
import com.obwhatsapp.yo.yo;

public class paintHome implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final ViewGroup f1062a;

    /* renamed from: b  reason: collision with root package name */
    public final int f1063b = yo.mainpagercolor();

    /* renamed from: c  reason: collision with root package name */
    public final Activity f1064c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f1065d;

    public paintHome(ViewGroup viewGroup, Activity activity) {
        this.f1062a = viewGroup;
        this.f1064c = activity;
        this.f1065d = activity instanceof Conversation;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0072, code lost:
        r0.setColorFilter(r4);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(android.app.Activity r9, android.view.ViewGroup r10, int r11) {
        /*
            android.graphics.PorterDuffColorFilter r4 = new android.graphics.PorterDuffColorFilter
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            r4.<init>(r11, r0)
            java.lang.String r0 = "conversation_contact_photo"
            java.lang.String r1 = "id"
            int r5 = com.obwhatsapp.yo.yo.getID(r0, r1)
            boolean r6 = r9 instanceof com.obwhatsapp.Conversation
            r0 = 0
            r2 = r0
        L_0x0013:
            r1 = 176984716(0xa8c928c, float:1.3536634E-32)
            java.lang.String r0 = "ۤ۟ۨۛۨۜۗۢۥۧ۬ۥۘۤۖۨۘ۬ۘۜ۫ۦۖۢۛۡۘ"
        L_0x0018:
            int r3 = r0.hashCode()
            r3 = r3 ^ r1
            switch(r3) {
                case -1619000526: goto L_0x0058;
                case 225255155: goto L_0x0021;
                case 926212292: goto L_0x0142;
                case 1280569217: goto L_0x004f;
                default: goto L_0x0020;
            }
        L_0x0020:
            goto L_0x0018
        L_0x0021:
            android.view.View r0 = r10.getChildAt(r2)
            r3 = 207115518(0xc5854fe, float:1.6665611E-31)
            java.lang.String r1 = "ۤۚۥۘۢۦۗ۫ۚۗ۬ۥۘۘۥۨۘۤ۟ۘ۫۟ۨۘ۬ۡۧۘۗۛۤ"
        L_0x002a:
            int r7 = r1.hashCode()
            r7 = r7 ^ r3
            switch(r7) {
                case -1885256225: goto L_0x0079;
                case -729765673: goto L_0x0065;
                case -441168436: goto L_0x0033;
                case 1813105065: goto L_0x005e;
                default: goto L_0x0032;
            }
        L_0x0032:
            goto L_0x002a
        L_0x0033:
            android.widget.ImageButton r0 = (android.widget.ImageButton) r0
            r3 = -1975256033(0xffffffff8a43fc1f, float:-9.436327E-33)
            java.lang.String r1 = "ۥۜ۠ۦۧۖۡۨۘۘۢۨۚ۠ۡۨۘ"
        L_0x003a:
            int r7 = r1.hashCode()
            r7 = r7 ^ r3
            switch(r7) {
                case -530613555: goto L_0x0043;
                case 46300754: goto L_0x006b;
                case 486554390: goto L_0x0075;
                case 1039266190: goto L_0x006e;
                default: goto L_0x0042;
            }
        L_0x0042:
            goto L_0x003a
        L_0x0043:
            android.graphics.drawable.Drawable r1 = r0.getDrawable()
            if (r1 == 0) goto L_0x0068
            java.lang.String r1 = "۟ۖۡۥۘۜۘ۠ۘۢۖۚۧ۠ۥۤ"
            goto L_0x003a
        L_0x004c:
            java.lang.String r0 = "ۢ۫ۘۘۛۗۜۛ۟ۖۘۨۤۨۖۥۦ"
            goto L_0x0018
        L_0x004f:
            int r0 = r10.getChildCount()
            if (r2 >= r0) goto L_0x004c
            java.lang.String r0 = "ۜۖ۠ۜۨۥۘۢۖ۟ۡۡ۬ۢۙۢ۠ۡۨۗۜۢۘۛ"
            goto L_0x0018
        L_0x0058:
            java.lang.String r0 = "۫۠ۨۙ۫ۚ۬ۡۜۥۚۛۙۨۢ"
            goto L_0x0018
        L_0x005b:
            java.lang.String r1 = "ۢۢۖۘۦۙۡ۫ۦۖۦ۟ۦۤ۟ۚ"
            goto L_0x002a
        L_0x005e:
            boolean r1 = r0 instanceof android.widget.ImageButton
            if (r1 == 0) goto L_0x005b
            java.lang.String r1 = "ۗۘۚ۫ۡ۟ۛۜۨۘ۟ۘۦۥۨۦۤۤۜۘۨۨ۟ۥۘۨۘ۫ۛۨ"
            goto L_0x002a
        L_0x0065:
            java.lang.String r1 = "ۥۙۡۥۛۦۙۨۧۤۤۜۘۘ۬ۡۨۛۡ"
            goto L_0x002a
        L_0x0068:
            java.lang.String r1 = "۠ۧۛۚۥۥ۬ۙۤۦۜۘۦۥ۬۫ۤۡۘ۫ۨۡ۫ۦۨۥۦ۟"
            goto L_0x003a
        L_0x006b:
            java.lang.String r1 = "ۥ۟ۡۢۚۥۧۡۘ۫ۘۙ۫۫ۥ"
            goto L_0x003a
        L_0x006e:
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
        L_0x0072:
            r0.setColorFilter(r4)
        L_0x0075:
            int r0 = r2 + 1
            r2 = r0
            goto L_0x0013
        L_0x0079:
            r3 = 1680788296(0x642ecb48, float:1.2897526E22)
            java.lang.String r1 = "ۛ۫ۨۘۨ۟ۖۗۨۘۘۗۥۜۗۘۘۛۘ۬"
        L_0x007e:
            int r7 = r1.hashCode()
            r7 = r7 ^ r3
            switch(r7) {
                case -990393870: goto L_0x00ef;
                case 856873561: goto L_0x0087;
                case 1438180638: goto L_0x009e;
                case 1794586727: goto L_0x00a5;
                default: goto L_0x0086;
            }
        L_0x0086:
            goto L_0x007e
        L_0x0087:
            r1 = r0
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r7 = -348152705(0xffffffffeb3f9c7f, float:-2.3164386E26)
            java.lang.String r3 = "ۚۧۘۤۚۡۦۧ۠ۧۚۢۙۨۧۙ۟ۥۤۧۨ"
        L_0x008f:
            int r8 = r3.hashCode()
            r8 = r8 ^ r7
            switch(r8) {
                case -1426448251: goto L_0x0098;
                case -763745917: goto L_0x00b4;
                case -35994902: goto L_0x0075;
                case 1090038257: goto L_0x00ab;
                default: goto L_0x0097;
            }
        L_0x0097:
            goto L_0x008f
        L_0x0098:
            java.lang.String r3 = "ۛ۫ۢۚۘۡۨۥۖ۠ۡۡ۠ۨۜ"
            goto L_0x008f
        L_0x009b:
            java.lang.String r1 = "ۥۡۚۤۛۥۘۨ۫ۦۘ۟ۖۛ۠ۦۙ۟ۛۦ۬ۚۖۘۦۜۡۘۧۦ"
            goto L_0x007e
        L_0x009e:
            boolean r1 = r0 instanceof android.widget.ImageView
            if (r1 == 0) goto L_0x009b
            java.lang.String r1 = "۬ۢۘۘۘۡۦۘۦۢۛۖۛۢۚۡۦۤ۟ۜۙۙۖۤۖۧۘۛۛۗ"
            goto L_0x007e
        L_0x00a5:
            java.lang.String r1 = "ۢ۟ۦۘ۟۬ۛۘۚۨۚ۬ۙۘۗۦۘ"
            goto L_0x007e
        L_0x00a8:
            java.lang.String r3 = "ۛۨۨۡۤۨۦۜ۫ۦۡۥ۫۬ۡۘۜۜۨۚۘۜ۠۫ۖۘ۫ۖۚ"
            goto L_0x008f
        L_0x00ab:
            android.graphics.drawable.Drawable r3 = r1.getDrawable()
            if (r3 == 0) goto L_0x00a8
            java.lang.String r3 = "۫۠ۦۗۖ۬ۤ۟ۦۘۡ۠ۖۡۜۥۘۛۛۨۘۤۚۜ"
            goto L_0x008f
        L_0x00b4:
            r7 = 1915571145(0x722d4bc9, float:3.4324816E30)
            java.lang.String r3 = "ۡۘۢۜۦۥۘ۬ۢ۫ۥۘ۟ۦۥ۟ۘۘۥۘۡۚ۟"
        L_0x00b9:
            int r8 = r3.hashCode()
            r8 = r8 ^ r7
            switch(r8) {
                case -1909984384: goto L_0x00cd;
                case 19561243: goto L_0x00c2;
                case 829085869: goto L_0x00db;
                case 1967635022: goto L_0x00ca;
                default: goto L_0x00c1;
            }
        L_0x00c1:
            goto L_0x00b9
        L_0x00c2:
            if (r6 == 0) goto L_0x00c7
            java.lang.String r3 = "۟ۚۖۘۤۜۚ۫ۦۡۘۚۜۖۘۘۦ۟ۥۙۗۧۡ"
            goto L_0x00b9
        L_0x00c7:
            java.lang.String r3 = "ۦ۫۬ۤۚۚۗۦۧۡۖ۫۫ۨۜ"
            goto L_0x00b9
        L_0x00ca:
            java.lang.String r3 = "ۤ۟ۜۛۤۙۜۧۤۨۡۖۘ۠۫۫ۢۡۨۘ۫ۗۥۘ"
            goto L_0x00b9
        L_0x00cd:
            r7 = -1877629474(0xffffffff9015a5de, float:-2.9512848E-29)
            java.lang.String r3 = "ۨۖۘ۫ۚۤۢ۠ۘۤۙۤۦۙۘۘۢۚۛۡۢۤۡۘ"
        L_0x00d2:
            int r8 = r3.hashCode()
            r8 = r8 ^ r7
            switch(r8) {
                case -2137888884: goto L_0x00ec;
                case -648054950: goto L_0x00db;
                case 652209672: goto L_0x0075;
                case 1902279668: goto L_0x00e3;
                default: goto L_0x00da;
            }
        L_0x00da:
            goto L_0x00d2
        L_0x00db:
            android.graphics.drawable.Drawable r0 = r1.getDrawable()
            goto L_0x0072
        L_0x00e0:
            java.lang.String r3 = "ۤ۫ۡۘۜۛۨۡ۫۫ۚۨۛۚۛۡۘۜۜۧۢ۟ۦ۬ۙۢ"
            goto L_0x00d2
        L_0x00e3:
            int r3 = r0.getId()
            if (r3 != r5) goto L_0x00e0
            java.lang.String r3 = "۠ۨ۟ۤۘ۬ۡۜۘ۟۟ۥۤۦ۬ۤ۠ۥۘۘۚۡۤ۠ۢۗۧۙ"
            goto L_0x00d2
        L_0x00ec:
            java.lang.String r3 = "ۨۤۜۘۦۚۘۘۚ۬ۘۙۢۢ۫ۥۤۜۜ۬ۤۙ"
            goto L_0x00d2
        L_0x00ef:
            r3 = -710910417(0xffffffffd5a05e2f, float:-2.2040797E13)
            java.lang.String r1 = "ۢۥۖۘ۫ۤۡۘۜۚۗۧ۬ۜۘ۬ۙۘۥۤۡۘۦۚ"
        L_0x00f4:
            int r7 = r1.hashCode()
            r7 = r7 ^ r3
            switch(r7) {
                case -1350631187: goto L_0x011f;
                case 698719583: goto L_0x0115;
                case 1679846243: goto L_0x011c;
                case 1887671523: goto L_0x00fd;
                default: goto L_0x00fc;
            }
        L_0x00fc:
            goto L_0x00f4
        L_0x00fd:
            r3 = 885129755(0x34c2021b, float:3.6136848E-7)
            java.lang.String r1 = "ۛۦۡۤۥۡۨۜۡۘ۠ۨۥۖۢۢ"
        L_0x0102:
            int r7 = r1.hashCode()
            r7 = r7 ^ r3
            switch(r7) {
                case -1376593963: goto L_0x010b;
                case -193428744: goto L_0x012c;
                case 479699712: goto L_0x0129;
                case 1645259053: goto L_0x0075;
                default: goto L_0x010a;
            }
        L_0x010a:
            goto L_0x0102
        L_0x010b:
            boolean r1 = r0 instanceof android.widget.TextView
            if (r1 == 0) goto L_0x0126
            java.lang.String r1 = "ۛۗۗ۬ۜۖۘۗۥ۟ۢۤۜۗ۟ۦ۫ۥۧۛۜۖۘۜ۟ۨۘ"
            goto L_0x0102
        L_0x0112:
            java.lang.String r1 = "ۧۤۖۘۗ۫۟۬ۦۧۨۙۗۜۜۙۢۜۨۡۜۡ"
            goto L_0x00f4
        L_0x0115:
            boolean r1 = r0 instanceof android.view.ViewGroup
            if (r1 == 0) goto L_0x0112
            java.lang.String r1 = "ۢۡۦۘ۫ۗۥۦ۟ۜۚ۠ۖۘ۬۟ۙۤۗۖۘ۟۠ۥ"
            goto L_0x00f4
        L_0x011c:
            java.lang.String r1 = "ۤۘۡۢ۟ۡ۬۟ۚۨ۟۟ۦۢۥۨۦۢۘۧۘۘ"
            goto L_0x00f4
        L_0x011f:
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            a(r9, r0, r11)
            goto L_0x0075
        L_0x0126:
            java.lang.String r1 = "ۢۦۦۘ۟ۖۨۘۖۤۨۨ۬ۨۧ۠ۖ"
            goto L_0x0102
        L_0x0129:
            java.lang.String r1 = "ۖۙۨۘ۟ۨۘۜۨۜۖۢۦۧۘۧۡۦۘ"
            goto L_0x0102
        L_0x012c:
            r1 = r0
            android.widget.TextView r1 = (android.widget.TextView) r1
            r1.setTextColor(r11)
            androidx.appcompat.view.menu.ActionMenuItemView r0 = (androidx.appcompat.view.menu.ActionMenuItemView) r0     // Catch:{ Exception -> 0x013f }
            com.obwhatsapp.yo.n r1 = new com.obwhatsapp.yo.n     // Catch:{ Exception -> 0x013f }
            r3 = 1
            r1.<init>(r0, r11, r3)     // Catch:{ Exception -> 0x013f }
            r0.post(r1)     // Catch:{ Exception -> 0x013f }
            goto L_0x0075
        L_0x013f:
            r0 = move-exception
            goto L_0x0075
        L_0x0142:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.youbasha.paintHome.a(android.app.Activity, android.view.ViewGroup, int):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r8 = this;
            android.view.ViewGroup r2 = r8.f1062a
            r1 = 0
            android.view.View r1 = r2.getChildAt(r1)     // Catch:{ Exception -> 0x005c }
            boolean r3 = r1 instanceof android.widget.TextView     // Catch:{ Exception -> 0x005c }
            int r4 = r8.f1063b     // Catch:{ Exception -> 0x005c }
            r5 = 1445373283(0x5626a563, float:4.5807315E13)
            java.lang.String r1 = "ۛۧ۟ۚۥۥۘ۠ۖۘۨۨۖۘۧۚ۫ۡۨۦۘۘ۬ۦۧۜۡ"
        L_0x0010:
            int r6 = r1.hashCode()     // Catch:{ Exception -> 0x005c }
            r6 = r6 ^ r5
            switch(r6) {
                case -1754531876: goto L_0x0019;
                case -834744965: goto L_0x0049;
                case -705923158: goto L_0x0051;
                case 322371383: goto L_0x004e;
                default: goto L_0x0018;
            }     // Catch:{ Exception -> 0x005c }
        L_0x0018:
            goto L_0x0010
        L_0x0019:
            r0 = r2
            androidx.appcompat.widget.Toolbar r0 = (androidx.appcompat.widget.Toolbar) r0     // Catch:{ Exception -> 0x005c }
            r1 = r0
            android.graphics.drawable.Drawable r5 = r1.getOverflowIcon()     // Catch:{ Exception -> 0x005c }
            r6 = -289637250(0xffffffffeebc7c7e, float:-2.9166842E28)
            java.lang.String r3 = "ۖۡۥۘۤۘۘۡۧۖۖۗۤۜۘۧۘۥۗ۬"
        L_0x0026:
            int r7 = r3.hashCode()     // Catch:{ Exception -> 0x005c }
            r7 = r7 ^ r6
            switch(r7) {
                case -1505481570: goto L_0x0066;
                case 25640010: goto L_0x0061;
                case 1921643428: goto L_0x0037;
                case 1982989384: goto L_0x002f;
                default: goto L_0x002e;
            }     // Catch:{ Exception -> 0x005c }
        L_0x002e:
            goto L_0x0026
        L_0x002f:
            android.graphics.PorterDuff$Mode r3 = android.graphics.PorterDuff.Mode.SRC_IN     // Catch:{ Exception -> 0x005c }
            r5.setColorFilter(r4, r3)     // Catch:{ Exception -> 0x005c }
            r1.setOverflowIcon(r5)     // Catch:{ Exception -> 0x005c }
        L_0x0037:
            r3 = 1188294154(0x46d3ee0a, float:27127.02)
            java.lang.String r1 = "ۖۖۛۘۖۥۧۥۙ۫ۦۛۤۜۦ"
        L_0x003c:
            int r5 = r1.hashCode()     // Catch:{ Exception -> 0x005c }
            r5 = r5 ^ r3
            switch(r5) {
                case -1925343282: goto L_0x0076;
                case -142771758: goto L_0x0045;
                case 1718990807: goto L_0x006c;
                case 1776937709: goto L_0x0073;
                default: goto L_0x0044;
            }     // Catch:{ Exception -> 0x005c }
        L_0x0044:
            goto L_0x003c
        L_0x0045:
            return
        L_0x0046:
            java.lang.String r1 = "ۨۖ۟ۢۢ۫ۜۢۚ۟۠ۨۨۘۥۘۦۖ۟"
            goto L_0x0010
        L_0x0049:
            if (r3 == 0) goto L_0x0046
            java.lang.String r1 = "ۙۛ۬ۖ۟ۨۤۘۨ۬ۖۡۢۢۙ۬۟"
            goto L_0x0010
        L_0x004e:
            java.lang.String r1 = "ۡ۟ۘ۟ۨۛۖۦۡ۫ۖۗ۬۫ۦۘ۟ۗۡۘ۫ۨۙ"
            goto L_0x0010
        L_0x0051:
            r1 = 0
            android.view.View r1 = r2.getChildAt(r1)     // Catch:{ Exception -> 0x005c }
            android.widget.TextView r1 = (android.widget.TextView) r1     // Catch:{ Exception -> 0x005c }
            r1.setTextColor(r4)     // Catch:{ Exception -> 0x005c }
            goto L_0x0019
        L_0x005c:
            r1 = move-exception
            goto L_0x0045
        L_0x005e:
            java.lang.String r3 = "ۨۜۖۘ۫۟ۡۘۙۨۧۖۛ۟ۥۛۡۛۛۢ"
            goto L_0x0026
        L_0x0061:
            if (r5 == 0) goto L_0x005e
            java.lang.String r3 = "ۤۜۚۙۘۘۘ۬ۖۤۖۥ۬ۧۧۧۦۢ۠ۚۜۥ۟ۘۛ"
            goto L_0x0026
        L_0x0066:
            java.lang.String r3 = "ۚۛ۬۠ۜۛۘۨ۬ۗ۬ۧۖۜۙ۫ۨۨۘ"
            goto L_0x0026
        L_0x0069:
            java.lang.String r1 = "ۤۥۖ۫ۙۦۖۦۡۘۗۥۧۘۦ۠ۥۡۨۢۗۢۨ"
            goto L_0x003c
        L_0x006c:
            boolean r1 = r8.f1065d     // Catch:{ Exception -> 0x005c }
            if (r1 == 0) goto L_0x0069
            java.lang.String r1 = "ۘۥۜۨۙۙ۠ۥۦۘۤۢ۬۠ۗۡ۠۬ۦۘۜۢۡۘ"
            goto L_0x003c
        L_0x0073:
            java.lang.String r1 = "ۛۛۢۤۥۧۘۦۜۡۧۛۨۢ۫ۧۨۧۘ"
            goto L_0x003c
        L_0x0076:
            android.app.Activity r1 = r8.f1064c     // Catch:{ Exception -> 0x005c }
            a(r1, r2, r4)     // Catch:{ Exception -> 0x005c }
            goto L_0x0045
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.youbasha.paintHome.run():void");
    }
}
