package com.obwhatsapp.yo;

import X.C30011bb;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import com.obwhatsapp.yo.TouchImageView;

public final class y extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a  reason: collision with root package name */
    public final int f911a;

    /* renamed from: b  reason: collision with root package name */
    public final View f912b;

    public /* synthetic */ y(View view, int i2) {
        this.f911a = i2;
        this.f912b = view;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(TouchImageView touchImageView) {
        this(touchImageView, 1);
        this.f911a = 1;
    }

    public final boolean onDoubleTap(MotionEvent motionEvent) {
        KeyEvent.Callback callback;
        int i2 = 0;
        KeyEvent.Callback callback2 = null;
        String str = null;
        TouchImageView touchImageView = null;
        boolean z2 = false;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        boolean z3 = false;
        String str2 = "۫ۡۧ۫۟ۥۥۨۡ۟ۙ۠ۦۛۜۘۥ۫ۧۗۨۙۧۡۤ";
        boolean z4 = false;
        float f6 = 0.0f;
        while (true) {
            switch ((str2.hashCode() ^ 988) ^ -522623863) {
                case -1840378974:
                    return z3;
                case -1716878516:
                    str2 = "ۡۛۨۢۗ۫ۤۗۚۗۨۛ۟۟ۦۚۧۚۧۖۘ۠ۢ";
                    touchImageView = (TouchImageView) callback2;
                    callback = callback2;
                    break;
                case -1688193186:
                    str2 = "ۨۤۤۘۨۥۘۙۛۖۙۙ۟۟ۘۘۢۙۜ۬ۧۨ";
                    f2 = touchImageView.f591l;
                    callback = callback2;
                    break;
                case -1670788576:
                    str2 = "۠ۜۙۥ۫۬۬ۢ۠ۛۢۥۘ۬۫ۨۘۦۚ۟۬ۡ۫ۜۘۗ";
                    f5 = f4;
                    callback = callback2;
                    break;
                case -1538139238:
                    f4 = touchImageView.f589j;
                    str2 = "ۜۘۨۘۤۗۢۧۘۥ۬ۡۖۘۙۢۘۘۜۛۥۘۙۛۚ";
                    callback = callback2;
                    break;
                case -861276848:
                    str2 = "ۦ۠ۧۥۧۡۘۢۖۧۘۛۢۗۡۛ۫ۧ۠ۦۘ";
                    z3 = z4;
                    callback = callback2;
                    break;
                case -548010192:
                    str2 = "ۛۨۜۖۚۘۘۤ۫۠ۨۥۧۘۥۘۛ۬ۛ۬ۨۜۡۘ";
                    z3 = z2;
                    callback = callback2;
                    break;
                case -413982441:
                    str2 = "ۛ۬ۛۦۛۖۘ۬ۗ۫ۘۧۦۘ۬ۙ۟ۙۢۦۘ";
                    f5 = f6;
                    callback = callback2;
                    break;
                case -330350700:
                    str2 = "ۖۗۦۘۤۙۡۛۢۖۘ۠ۧۥۡۗۚۥ۟ۛ";
                    callback = callback2;
                    break;
                case -243460097:
                    str2 = "ۤۨ۟ۤۙۥۗ۠ۤۛۦۙۚۚۘ۬ۖۘ۠ۛۗۚ۟ۖۘۘۚۧ";
                    callback = callback2;
                    break;
                case -164851595:
                    return super.onDoubleTap(motionEvent);
                case -9707373:
                    str2 = "ۛ۬ۛۦۛۖۘ۬ۗ۫ۘۧۦۘ۬ۙ۟ۙۢۦۘ";
                    callback = callback2;
                    break;
                case 14243853:
                    switch (i2) {
                        case 0:
                            str2 = "ۙۘۦۘۖۡۥۘۖ۫۫۠ۙ۠ۦ۫ۗۙۘۡۘۘ۟ۢ۬ۛۥۥ";
                            callback = callback2;
                            break;
                        default:
                            str2 = "ۜۚۚ۠۠ۜۧۘۥۘۜۧۜۡۖۨۘۚ۬ۖۗۖۦۡۗ۠ۖۢ";
                            callback = callback2;
                            break;
                    }
                case 146258044:
                    String str3 = "ۨۤۢ۟ۤۤ۬ۧۘۢ۠ۢ۫ۛۦۘۖۧ۫ۛۢۥ";
                    while (true) {
                        switch (str3.hashCode() ^ 469920193) {
                            case -977790229:
                                str2 = "۫۟ۡۦ۟ۤ۬ۥۘ۫ۨۧۙۤ۫ۘۖۡۢ۬ۥۙۨۛ۬ۤۤ";
                                callback = callback2;
                                continue;
                            case -129635249:
                                str2 = "ۜۥۦۘ۟ۦۧ۠ۡۖۘۜۦۚۘۗ";
                                callback = callback2;
                                continue;
                            case 519778848:
                                str3 = "ۦۢۨۛۥۧۛ۬ۗۤ۠ۡۘ۟ۨۜۘۥ۬ۨۚۛۜۡ۫ۢۡۚۘۘ";
                                break;
                            case 2014689127:
                                if (f2 != f3) {
                                    str3 = "۬۟ۥۜ۟۟۫ۖۘۖۖ۠ۤۘۧ۟ۛ۟۫ۜۧۘۦۛۥۥۛۡۘ";
                                    break;
                                } else {
                                    str3 = "۬ۖۡۢۚۛ۠ۥۨۘ۫ۙۚۖۥۤۤ۫ۜۘۙ۫ۖۘ";
                                    break;
                                }
                        }
                    }
                    break;
                case 466315218:
                    str2 = "۟ۤۜۘۡۨۡۘۥ۠۬۬ۛۤۚۜۘ۟ۡۗ";
                    f6 = f3;
                    callback = callback2;
                    break;
                case 527221004:
                    String str4 = "ۗۘۘۘۢۡۘۛۨ۠۟۫ۧۜ۠ۛۗۛۦۘۙۥۤۚۚ۬۫ۗۡ";
                    while (true) {
                        switch (str4.hashCode() ^ 364641345) {
                            case -593491755:
                                if (touchImageView.f598s == TouchImageView.State.NONE) {
                                    str4 = "۬ۗ۬۬ۥۨۢۤۦۖ۬ۖۡۢۛۚ۬";
                                    break;
                                } else {
                                    str4 = "ۜۥۡ۬ۖۧۘۘۚ۠ۜۨۗۛۡۗۛۤ۬۫ۙۗۦ";
                                    break;
                                }
                            case -159776722:
                                str4 = "ۨۨۥۘۦ۟ۖۘۦ۟ۗۤ۟ۘۚ۟ۥۗ۠۬۬ۘ۟ۛ۫ۡۘ";
                                break;
                            case -143004405:
                                str2 = "۬ۜۗ۬ۙۡۘ۬ۢۢ۟ۦۗ۫ۙۡۘ";
                                callback = callback2;
                                continue;
                            case 2113618243:
                                str2 = "ۦۧۤۥۛۖۜ۠ۘۘۘۧۡۘۦ۬ۜۤۜۘۨۢ";
                                callback = callback2;
                                continue;
                        }
                    }
                    break;
                case 937314081:
                    z2 = false;
                    str2 = "ۧۤۡۜۚۦۘ۬ۦ۬ۖۜ۬ۘ۫۬ۨۖۧۘۙۤ۠";
                    callback = callback2;
                    break;
                case 1142872676:
                    dep.sendAReaction(((C30011bb) callback2).getFMessage(), str);
                    str2 = "ۚ۟ۢۧۥۘۜۛۨۧۨۨۘۥ۫۫ۢۗ۬ۙۦۜ";
                    callback = callback2;
                    break;
                case 1220058295:
                    str2 = "ۧۡۦۘۥۘۧۖۧۤۨۘ۟ۡۧۨۡۚۨ";
                    str = Conversation.getCustomDTTLreaction();
                    callback = callback2;
                    break;
                case 1427492836:
                    f3 = touchImageView.f590k;
                    str2 = "ۧۢۜۙۡ۠ۛۦۘۘۜ۬ۡۚۧۧ۠ۛۜۘ۫ۨ۬ۦۗۧ";
                    callback = callback2;
                    break;
                case 1505821176:
                    touchImageView.postOnAnimation(new r0(touchImageView, f5, motionEvent.getX(), motionEvent.getY(), false));
                    str2 = "ۖۙۦ۠۬ۘۦۨۥ۟ۧ۟ۖۥۥۘۖۧۜۘۧۥۗ";
                    callback = callback2;
                    break;
                case 1696042744:
                    str2 = "ۛۛۚۧۤۨ۟ۤۤۥۘ۫ۖۥۚۢۨ۬";
                    z4 = true;
                    callback = callback2;
                    break;
                case 1822521985:
                    str2 = "ۦ۠ۧۥۧۡۘۢۖۧۘۛۢۗۡۛ۫ۧ۠ۦۘ";
                    callback = callback2;
                    break;
                case 1845640213:
                    str2 = "ۤ۠ۜۘۢۜۘ۬ۧۡۡۛۦۡۥۚۤ۟ۖۘۗۙۚ";
                    callback = callback2;
                    break;
                case 1900894226:
                    str2 = "ۥۘۜۚۦۜۘۖ۬ۚۜ۬ۦۧۨۧۤۛ۠ۨۥۘۜۨۙ";
                    callback = this.f912b;
                    break;
                case 1913006020:
                    str2 = "۠ۢ۫ۡۨۧۘ۬ۦۡۢۨۘۘۤۘۘۛ۟ۙ۟۟۟ۛ۠";
                    i2 = this.f911a;
                    callback = callback2;
                    break;
                default:
                    callback = callback2;
                    break;
            }
            callback2 = callback;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00c0, code lost:
        r1 = "ۙۚۘ۟ۢۛ۫ۤۦۘ۟۠ۨۦۚۜۡۤ۬ۤۚۢۨۗۙۚۦۢ";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onFling(android.view.MotionEvent r8, android.view.MotionEvent r9, float r10, float r11) {
        /*
            r7 = this;
            r3 = 0
            java.lang.String r0 = "ۨ۫۬۠ۥۢۥۢۜ۫ۤۖۘ۬ۗۦۚ۠۠ۧۖۥۘۛۨۘۘۗۧۢ"
            r1 = r0
            r2 = r3
            r4 = r3
            r5 = r3
        L_0x0007:
            int r0 = r1.hashCode()
            r3 = 65
            r6 = -2124964273(0xffffffff81579e4f, float:-3.9602844E-38)
            r0 = r0 ^ r3
            r0 = r0 ^ r6
            switch(r0) {
                case -2114661969: goto L_0x0064;
                case -1994660762: goto L_0x00b5;
                case -1667058406: goto L_0x0022;
                case -1323701168: goto L_0x0016;
                case -1082366789: goto L_0x0047;
                case -814899670: goto L_0x0038;
                case -509305171: goto L_0x0026;
                case -491341914: goto L_0x001e;
                case -343682927: goto L_0x0040;
                case 625149798: goto L_0x00a6;
                case 664175259: goto L_0x002a;
                case 669474098: goto L_0x009a;
                case 1093794652: goto L_0x00ad;
                case 1096527521: goto L_0x0083;
                case 1123926286: goto L_0x001a;
                case 1259481489: goto L_0x0033;
                case 1644289439: goto L_0x008f;
                default: goto L_0x0015;
            }
        L_0x0015:
            goto L_0x0007
        L_0x0016:
            java.lang.String r0 = "ۚۛۗۘۗۖۘ۟۬ۧۨ۬۠ۗ۫ۥۘ"
            r1 = r0
            goto L_0x0007
        L_0x001a:
            java.lang.String r0 = "۠ۚۙۤۘۗۘ۠ۛۜۧۘۢ۫ۤۤۨۡۡۡۨ"
            r1 = r0
            goto L_0x0007
        L_0x001e:
            java.lang.String r0 = "ۜۖ۫ۢ۬ۧۨۢۘۗ۠ۤۨۛۖ۬ۙۖۘ۠ۦۙۚۘۙۥۨۨ"
            r1 = r0
            goto L_0x0007
        L_0x0022:
            java.lang.String r0 = "ۤۜۜۜۡ۫ۙ۫ۖۜۥ۬ۡ۟ۜۚۙۖۦ۟ۨۘ"
            r1 = r0
            goto L_0x0007
        L_0x0026:
            java.lang.String r0 = "۠ۥ۟ۖ۬ۛۖۤۡۜۧۦۘۨۚۘۢۡ۟ۢۨۦۘۙۗ۫ۜ۬ۛ"
            r1 = r0
            goto L_0x0007
        L_0x002a:
            int r0 = r7.f911a
            switch(r0) {
                case 1: goto L_0x00bb;
                default: goto L_0x002f;
            }
        L_0x002f:
            java.lang.String r0 = "ۧۧۦۘۛۖ۟ۙۧۛۡۢۢۢ۟ۢ"
            r1 = r0
            goto L_0x0007
        L_0x0033:
            boolean r0 = super.onFling(r8, r9, r10, r11)
        L_0x0037:
            return r0
        L_0x0038:
            android.view.View r0 = r7.f912b
            com.obwhatsapp.yo.TouchImageView r0 = (com.obwhatsapp.yo.TouchImageView) r0
            java.lang.String r1 = "۬ۡۚۗۘۡۘۘ۠ۗۙ۠ۗۨۧۙۤۧ"
            r5 = r0
            goto L_0x0007
        L_0x0040:
            com.obwhatsapp.yo.s0 r3 = r5.f581b
            java.lang.String r0 = "ۛۜۡۘ۬ۤ۬ۦۥ۬ۘۥۗ۬ۜۢۖۤۘۜۡۘۜۥ۠"
            r1 = r0
            r4 = r3
            goto L_0x0007
        L_0x0047:
            r1 = -736022637(0xffffffffd4212f93, float:-2.76915159E12)
            java.lang.String r0 = "۬۬ۜ۬ۙۖۖ۟ۤۦۧۡۘۥۤۖۡۜۨۘۚۨۚۥۦۖۗۧ۠"
        L_0x004c:
            int r3 = r0.hashCode()
            r3 = r3 ^ r1
            switch(r3) {
                case -1757535227: goto L_0x00c0;
                case 532445767: goto L_0x0061;
                case 1161939768: goto L_0x005c;
                case 1357095746: goto L_0x0055;
                default: goto L_0x0054;
            }
        L_0x0054:
            goto L_0x004c
        L_0x0055:
            java.lang.String r0 = "ۙۨۦۘ۠ۧۡۘۙۜ۬ۘۨ۬ۘۢۖۘۙۨۙۘۘۘۙۢۖ"
            r1 = r0
            goto L_0x0007
        L_0x0059:
            java.lang.String r0 = "ۜ۫۫ۥۙۡۘۥۖۦۤۛۘ۫۬ۥۛۜۨ"
            goto L_0x004c
        L_0x005c:
            if (r4 == 0) goto L_0x0059
            java.lang.String r0 = "ۥ۠ۖۗ۠ۘۦۡۨۥۦ۫ۜ۟ۨ"
            goto L_0x004c
        L_0x0061:
            java.lang.String r0 = "ۤۗۖۘۡۡۤۖ۠ۥ۠ۦ۫ۢۦۦۘۡ۬۟ۧۨۧۛۨ۟ۥۙۖ"
            goto L_0x004c
        L_0x0064:
            r1 = -659814341(0xffffffffd8ac083b, float:-1.5132108E15)
            java.lang.String r0 = "ۨ۠ۘۖۚۨۘ۟ۗۧ۫ۙۡۜۖ۬ۥ۬ۧۗ۟ۦۘ"
        L_0x0069:
            int r3 = r0.hashCode()
            r3 = r3 ^ r1
            switch(r3) {
                case -666862146: goto L_0x0072;
                case -487794821: goto L_0x0078;
                case 1967022517: goto L_0x00c0;
                case 2016514830: goto L_0x007f;
                default: goto L_0x0071;
            }
        L_0x0071:
            goto L_0x0069
        L_0x0072:
            java.lang.String r0 = "ۗۥ۫ۗۖۦۘۛۜۡۘۙ۬ۖۘۡۨۖۘۢۡۨۘۗۢۧۨ۫ۤۧۖۜ"
            goto L_0x0069
        L_0x0075:
            java.lang.String r0 = "۫ۗ۟ۛۤۘۡ۫ۖۘۥۤۘۥ۬ۧۜۦۡۧۘۨۛۢۤ"
            goto L_0x0069
        L_0x0078:
            android.widget.Scroller r0 = r4.f871c
            if (r0 == 0) goto L_0x0075
            java.lang.String r0 = "ۢۥ۬۟ۖۧۘ۬ۜۘۦ۠ۨۘۖۙۜۘ۬۠ۦۜۛۗۡۙ۬ۙۦ۠"
            goto L_0x0069
        L_0x007f:
            java.lang.String r0 = "ۨۚۖۘۡۧۧۙۜۦ۟۫ۘۤ۟ۜۘۤۜۜۖۚ۬ۨۖۨۘۘۦ۬"
            r1 = r0
            goto L_0x0007
        L_0x0083:
            com.obwhatsapp.yo.TouchImageView r0 = r4.f872d
            com.obwhatsapp.yo.TouchImageView$State r1 = com.obwhatsapp.yo.TouchImageView.State.NONE
            com.obwhatsapp.yo.TouchImageView.a(r0, r1)
            java.lang.String r0 = "۠۬۠ۢۖ۠ۘۦۥۘۙ۟۠۫ۥۗ۬ۥۗۥۨ۫ۦۘۡۚۢ"
            r1 = r0
            goto L_0x0007
        L_0x008f:
            android.widget.Scroller r0 = r4.f871c
            r1 = 1
            r0.forceFinished(r1)
            java.lang.String r0 = "ۙۚۘ۟ۢۛ۫ۤۦۘ۟۠ۨۦۚۜۡۤ۬ۤۚۢۨۗۙۚۦۢ"
            r1 = r0
            goto L_0x0007
        L_0x009a:
            com.obwhatsapp.yo.s0 r2 = new com.obwhatsapp.yo.s0
            int r0 = (int) r10
            int r1 = (int) r11
            r2.<init>(r5, r0, r1)
            java.lang.String r0 = "ۧۖۚۛۛۥۖۜۤۛۚۦۘ۬ۖۧ"
            r1 = r0
            goto L_0x0007
        L_0x00a6:
            r5.f581b = r2
            java.lang.String r0 = "۫ۖۗۨۡۢ۬ۡ۟۟۬ۡۡۙۗ۠۟ۜۥ۬۠ۤ۫ۡۘ"
            r1 = r0
            goto L_0x0007
        L_0x00ad:
            r5.postOnAnimation(r2)
            java.lang.String r0 = "ۥۧۧۘۡۖۘۘ۠ۡۤۛۖۘۤۘۨۘۦۜۘۘۜ۫ۨۘ۟ۙۨۘۢۥۘۘ"
            r1 = r0
            goto L_0x0007
        L_0x00b5:
            boolean r0 = super.onFling(r8, r9, r10, r11)
            goto L_0x0037
        L_0x00bb:
            java.lang.String r0 = "۠۫ۗۥۤۥۢۚۜۘۨ۫۫ۜۗۙ"
            r1 = r0
            goto L_0x0007
        L_0x00c0:
            java.lang.String r0 = "ۙۚۘ۟ۢۛ۫ۤۦۘ۟۠ۨۦۚۜۡۤ۬ۤۚۢۨۗۙۚۦۢ"
            r1 = r0
            goto L_0x0007
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.y.onFling(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
    }

    public final void onLongPress(MotionEvent motionEvent) {
        String str = "ۦۙۙۨۖۦۘۛ۬ۤۗۢۥۘۚۜۡۤۡۦۘۦۜ۟ۜ۬۟ۦ۫ۦۘ";
        while (true) {
            switch ((str.hashCode() ^ 220) ^ 1993892773) {
                case -2131789237:
                    switch (this.f911a) {
                        case 1:
                            str = "۬ۦۤۘۨۨۖۦۛۢۦۦۡۘۛ";
                            break;
                        default:
                            str = "ۥ۠ۢۦۢۚۤۧۨۘۘۧ۬ۖۡ۬ۘۨۨ";
                            break;
                    }
                case -1674271773:
                case 1975841835:
                    return;
                case -1626480487:
                    str = "ۧۖ۬ۘۖ۬ۦۧ۟ۙۖۘ۟ۘۙ";
                    break;
                case -294802266:
                    ((TouchImageView) this.f912b).performLongClick();
                    str = "ۚۗۜۘ۠۟ۖۘۗۤۢۡۗۛۨۖ۠۬ۖ۬";
                    break;
                case 592351059:
                    super.onLongPress(motionEvent);
                    str = "ۜ۟۫ۚ۟ۢ۫ۢۚۚ۠ۘۧ۟۫ۢۨۗۜۤۜۘۡۖۜۘۥۜ۠";
                    break;
                case 1595133369:
                    str = "ۦۡۖۛۥۜۘۤۨۛۙۥ۠ۦۨ";
                    break;
            }
        }
    }

    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        String str = "۟ۧۖ۫۠ۤۘۚۗۢۥ۟ۦۤۜۡۜۗۙۨ۟ۢۜۘ";
        while (true) {
            switch ((str.hashCode() ^ 377) ^ -719826138) {
                case -1549073269:
                    str = "۠ۜۤۛۢۨۘۧۢۥۘۙۗۨۧۖ۟ۦ۬ۦۘ";
                    break;
                case -1321831596:
                    str = "ۖۥ۬ۤۡۛۚۡۛۥۙۖۢ۬ۜۘۘ۟ۨۘۧۖۚ";
                    break;
                case 68623137:
                    return super.onSingleTapConfirmed(motionEvent);
                case 783020355:
                    return ((TouchImageView) this.f912b).performClick();
                case 1558303392:
                    switch (this.f911a) {
                        case 1:
                            str = "ۙۧۢۛۥۖ۫ۧۗۡ۫ۜۜۚۖۘۧۙۛۧۨ۬۬۠ۡۘ";
                            break;
                        default:
                            str = "ۙ۫ۨۘۗۜ۠ۚۨۦۘۙۤۢۡۙۥۤۥۤۤۖۘۦۡۡۘۤۜۚ";
                            break;
                    }
            }
        }
    }
}
