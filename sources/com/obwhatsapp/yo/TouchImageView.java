package com.obwhatsapp.yo;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.ScaleGestureDetector;
import android.widget.ImageView;

@SuppressLint({"AppCompatCustomView"})
public class TouchImageView extends ImageView {

    /* renamed from: a  reason: collision with root package name */
    public Context f580a;

    /* renamed from: b  reason: collision with root package name */
    public s0 f581b;

    /* renamed from: c  reason: collision with root package name */
    public float[] f582c;

    /* renamed from: d  reason: collision with root package name */
    public GestureDetector f583d;

    /* renamed from: e  reason: collision with root package name */
    public ScaleGestureDetector f584e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f585f;

    /* renamed from: g  reason: collision with root package name */
    public float f586g;

    /* renamed from: h  reason: collision with root package name */
    public float f587h;

    /* renamed from: i  reason: collision with root package name */
    public Matrix f588i;

    /* renamed from: j  reason: collision with root package name */
    public float f589j;

    /* renamed from: k  reason: collision with root package name */
    public float f590k;

    /* renamed from: l  reason: collision with root package name */
    public float f591l;

    /* renamed from: m  reason: collision with root package name */
    public float f592m;

    /* renamed from: n  reason: collision with root package name */
    public float f593n;

    /* renamed from: o  reason: collision with root package name */
    public Matrix f594o;

    /* renamed from: p  reason: collision with root package name */
    public int f595p;

    /* renamed from: q  reason: collision with root package name */
    public int f596q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f597r;

    /* renamed from: s  reason: collision with root package name */
    public State f598s;

    /* renamed from: t  reason: collision with root package name */
    public float f599t;

    /* renamed from: u  reason: collision with root package name */
    public float f600u;

    /* renamed from: v  reason: collision with root package name */
    public int f601v;

    /* renamed from: w  reason: collision with root package name */
    public int f602w;

    public enum State {
        ;
        

        /* renamed from: a  reason: collision with root package name */
        public static final State[] f603a = null;

        /* access modifiers changed from: public */
        static {
            String str = "۟۫ۙ۬۠ۧۡۚۛ۠ۘ۠ۗ۠ۡۧۖۘ";
            State state = null;
            State state2 = null;
            State state3 = null;
            State state4 = null;
            State state5 = null;
            while (true) {
                switch ((str.hashCode() ^ 770) ^ 134720126) {
                    case -1981669830:
                        DRAG = state4;
                        str = "۫ۨۚۙ۫ۧۧ۟ۡۘۨۥۧۘۖۥۛ";
                        break;
                    case -1779455608:
                        str = "ۗۖۗ۟۬۫ۦ۬ۨۘۧۚۗۡ۠ۖۥۘۘۘۧۥۘۘۖۡۧۥۢ۟";
                        state4 = new State(1, "DRAG");
                        break;
                    case -1524663488:
                        FLING = state2;
                        str = "ۖۦۦۜۨۧۘۥۘ۟ۡ۫ۜۘۢۛۨۘۥۙۦۙۖۤۘۘۡۘ";
                        break;
                    case -1522004613:
                        ANIMATE_ZOOM = state;
                        str = "ۤۜۙ۫ۗۘۗۜۗۛۥۥۨۜۡۘۨ۠ۢ";
                        break;
                    case -703179593:
                        f603a = new State[]{state5, state4, state3, state2, state};
                        str = "ۚۖۖۧۙۚۜ۫ۘ۠ۦۧۘۧ۬ۡۘۙۦ۟ۤۡۖۘ۬۟۬";
                        break;
                    case -394235541:
                        str = "۬ۜۥۗۧۜۘۨۨ۟ۡۚۨۦۜۚۖۦۖۛۘۘۦ۫ۧۥ۬ۢ";
                        state3 = new State(2, "ZOOM");
                        break;
                    case 473568349:
                        ZOOM = state3;
                        str = "ۙۦ۠ۛۛۡۙۗۛ۠ۡۖۙۗۦۘۦ۬۬";
                        break;
                    case 655705354:
                        return;
                    case 668565032:
                        state = new State(4, "ANIMATE_ZOOM");
                        str = "ۤ۫۟ۨۘ۫ۥۧۖۨۛ۠۠ۜ۟";
                        break;
                    case 959375873:
                        str = "ۥ۬ۧ۫ۦۦۥۚۤ۠ۢۚۡۦۘۚۤۢۧۜۘۦ۟ۦۜۛ۬";
                        state5 = new State(0, "NONE");
                        break;
                    case 1741123020:
                        str = "ۥۤ۠ۨۖۘۘۘ۫ۜۘ۟۠ۘۡ۠ۦۘ۠ۚ۠ۢۦۜ";
                        state2 = new State(3, "FLING");
                        break;
                    case 2009585430:
                        NONE = state5;
                        str = "ۥۡۜۘۜۜ۫ۢۡۡۦۦ۟ۜ۠";
                        break;
                }
            }
        }

        /* access modifiers changed from: public */
        State() {
        }
    }

    public TouchImageView(Context context) {
        super(context);
        i(context);
    }

    public TouchImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        i(context);
    }

    public TouchImageView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        i(context);
    }

    public static /* synthetic */ void a(TouchImageView touchImageView, State state) {
        String str = "ۢ۟ۦۘۡۚۘۘۜۖۤۘۘۧۘ۬ۢ۟";
        while (true) {
            switch ((str.hashCode() ^ 736) ^ 1042548788) {
                case -1494530927:
                    return;
                case -1283590137:
                    str = "ۛ۠ۦۘۗۧۛ۟ۨۗ۬۬ۖۢ۫ۚۡۖۘ";
                    break;
                case -515668222:
                    str = "ۚۡۡۘۥۥۖۗۖۨۘۢ۬ۖ۫ۚۧ";
                    break;
                case 1490072730:
                    touchImageView.setState(state);
                    str = "ۡۙ۟ۖ۬ۚۥۦ۫ۥۦۡۦۖۨۘۘۙۨۜ۬ۗۜۨۗۥۢۚ";
                    break;
            }
        }
    }

    public static /* synthetic */ float b(TouchImageView touchImageView) {
        String str = "ۛ۟۬ۜۗۖۘۗۨۢۜۛۖۘۡۚۥۚۡۨۗۛ";
        while (true) {
            switch ((str.hashCode() ^ 57) ^ -934826668) {
                case 995962315:
                    str = "ۨ۠ۖۘۢۧۡۘۥۚ۟ۧ۬ۗ۟ۚ۬ۗۨۦۘ۠ۜۖ";
                    break;
                case 1500633769:
                    return touchImageView.getImageWidth();
            }
        }
    }

    public static /* synthetic */ float c(TouchImageView touchImageView) {
        String str = "ۛ۟ۦۘۨۧۡۘۦ۠ۘۘۦ۠ۥۢۜۥۘۦۖۜۘۛۥۗۥۤ۫ۡۜۢ";
        while (true) {
            switch ((str.hashCode() ^ 434) ^ 545262282) {
                case -1365030139:
                    return touchImageView.getImageHeight();
                case -298899374:
                    str = "۟ۗ۬ۜۨۙۧ۠ۘۘۖ۬ۤۤۥۚۡۙۨۚۤ";
                    break;
            }
        }
    }

    public static PointF d(TouchImageView touchImageView, float f2, float f3) {
        String str = "۬ۛۧۘۨۘۘۢۛۥۘۘۦ۫ۖۖۙۨۦۨۘۙ۬ۘۙۖۧۘۚۧۦ";
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        float f7 = 0.0f;
        float f8 = 0.0f;
        while (true) {
            switch ((str.hashCode() ^ 346) ^ -621327654) {
                case -1368600133:
                    str = "ۖۨۨ۬۫ۨۘۡۙۡۥۧۧۡۨۘۚۙ۠ۡۧۛ۬ۖۘ";
                    f8 = touchImageView.f582c[2];
                    break;
                case -1063374502:
                    touchImageView.f588i.getValues(touchImageView.f582c);
                    str = "ۘ۟ۥ۫ۧۥ۬۫ۚۡ۠ۖ۬ۤۜۘ";
                    break;
                case -812265014:
                    str = "ۜۘ۟ۧۥۥۘۥۛۖۘۛۡۧۘۢۦۡۘۦۧۡۗ۠۬ۡۢۚ";
                    f7 = touchImageView.getImageWidth();
                    break;
                case -736053608:
                    str = "ۤۖۢۢ۠ۤ۫۠۠ۡۖۖۡۦ۫ۦۚۡۙۘۘۢۙۗۨ۬";
                    f6 = f2 / ((float) touchImageView.getDrawable().getIntrinsicWidth());
                    break;
                case -715789598:
                    str = "۫۫ۤۡۥۡۦ۟ۚ۠۟ۨۙۜۘ۫ۨۡۙۘۦ۠ۙۥۚۤۛ";
                    break;
                case -108247938:
                    return new PointF((f6 * f7) + f8, (f4 * (f3 / ((float) touchImageView.getDrawable().getIntrinsicHeight()))) + f5);
                case 154777828:
                    str = "ۨۛۗۜۢۚۡۧۡۘۤۙ۫ۢۧ۟ۡ۟ۥۘ";
                    break;
                case 155155100:
                    str = "ۦۢۡۘ۬۟ۜۘۛۜۨۘۗ۟۫ۡۖ۟";
                    break;
                case 1809722737:
                    f4 = touchImageView.getImageHeight();
                    str = "ۧۡۦۘ۬ۥۦۥۜۢۤۖ۫ۢۚۡۛۤۡ";
                    break;
                case 2060951838:
                    str = "ۖۤۥۜۜۘۙۨ۠ۖۥۦۚ۟ۨۗۦۘۙۤۡۡ۫ۤ";
                    f5 = touchImageView.f582c[5];
                    break;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void e(com.obwhatsapp.yo.TouchImageView r17, float r18, float r19, float r20, boolean r21) {
        /*
            r11 = 0
            r13 = 0
            r9 = 0
            r8 = 0
            r10 = 0
            r12 = 0
            r7 = 0
            r6 = 0
            r5 = 0
            r3 = 0
            r4 = 0
            java.lang.String r2 = "ۜۧ۬۬ۤۦ۬ۡۨۖۚۤ۠۬ۧۤۖۥۗۥ۫ۧۢۢ"
        L_0x000d:
            int r14 = r2.hashCode()
            r15 = 17
            r16 = 600584449(0x23cc3101, float:2.2138478E-17)
            r14 = r14 ^ r15
            r14 = r14 ^ r16
            switch(r14) {
                case -2075129970: goto L_0x00ae;
                case -1711273202: goto L_0x0087;
                case -1430256978: goto L_0x004f;
                case -963642724: goto L_0x006c;
                case -941545144: goto L_0x00de;
                case -697727489: goto L_0x0065;
                case -607926932: goto L_0x0113;
                case -506719672: goto L_0x00b9;
                case -469669652: goto L_0x001d;
                case -269096582: goto L_0x0100;
                case -191465366: goto L_0x007b;
                case -186770141: goto L_0x00ec;
                case -128869617: goto L_0x00a6;
                case -127573814: goto L_0x00b4;
                case -72584446: goto L_0x0023;
                case 70818764: goto L_0x0070;
                case 329079030: goto L_0x0117;
                case 329891666: goto L_0x0029;
                case 385665553: goto L_0x0026;
                case 404196970: goto L_0x002c;
                case 500406603: goto L_0x0020;
                case 544816687: goto L_0x0056;
                case 577421183: goto L_0x0080;
                case 628739949: goto L_0x00f1;
                case 641390575: goto L_0x0048;
                case 961156483: goto L_0x010b;
                case 1340422814: goto L_0x005a;
                case 1463058901: goto L_0x00e6;
                case 1665716536: goto L_0x0074;
                case 1720666355: goto L_0x00bf;
                case 1778081464: goto L_0x005e;
                default: goto L_0x001c;
            }
        L_0x001c:
            goto L_0x000d
        L_0x001d:
            java.lang.String r2 = "۫ۢۥۜ۫۟ۧ۫ۦۙۦ۬ۢۛۧۖۢ"
            goto L_0x000d
        L_0x0020:
            java.lang.String r2 = "ۗۛۧۚۢ۫ۙۤۡۘۛۧۡۗۖ"
            goto L_0x000d
        L_0x0023:
            java.lang.String r2 = "ۙۧ۠ۦۛ۬ۜۡۧۦۡۧۘ۫ۜۖ۟ۙۡ۠ۥۥۘ۫۫ۤ"
            goto L_0x000d
        L_0x0026:
            java.lang.String r2 = "۫ۜۖۘۘۨۦۘ۬ۙۖۗۛۤ۠ۙۦۗ۟۟۫ۙۨۘ۠ۧۧۚ۠ۨۘ"
            goto L_0x000d
        L_0x0029:
            java.lang.String r2 = "ۛۗ۟ۚۡۘ۫ۤۗۦ۫ۖ۫۬ۗۡۦ"
            goto L_0x000d
        L_0x002c:
            r14 = 1157047476(0x44f724b4, float:1977.147)
            java.lang.String r2 = "۟۠ۥۘۧ۟ۥ۬ۙۨۦ۬۟ۖ۬ۦ"
        L_0x0031:
            int r15 = r2.hashCode()
            r15 = r15 ^ r14
            switch(r15) {
                case -2138109107: goto L_0x0040;
                case -1999202227: goto L_0x0107;
                case -1409127479: goto L_0x003a;
                case -1126916541: goto L_0x0045;
                default: goto L_0x0039;
            }
        L_0x0039:
            goto L_0x0031
        L_0x003a:
            java.lang.String r2 = "۫۬ۨۗۧۜۘۜۘۚۖۦۥ۠ۢۧ۫ۨۖۘ۟ۥۥۦ۬۬۬ۛۧ"
            goto L_0x0031
        L_0x003d:
            java.lang.String r2 = "ۜۚۘ۬ۢ۠ۘۡۘۤۜۡۘۘ۫ۡۘۢۦۘ۬ۧۖۘ"
            goto L_0x0031
        L_0x0040:
            if (r21 == 0) goto L_0x003d
            java.lang.String r2 = "ۜۖۤۡۖۧۙۗۥۘۜۦۘۘۘ۫ۨۘۨ۟"
            goto L_0x0031
        L_0x0045:
            java.lang.String r2 = "ۗۥۡۘۗ۟ۨۜۡۡۨۨۧۘۛۢۘ"
            goto L_0x000d
        L_0x0048:
            r0 = r17
            float r11 = r0.f600u
            java.lang.String r2 = "ۛۨۦۘۙۧۥ۫ۨۨۘ۫۠۠ۘ۬۬ۨۙۥۘ۬ۨۡ۫ۚ۠ۛۧ۬"
            goto L_0x000d
        L_0x004f:
            r0 = r17
            float r13 = r0.f599t
            java.lang.String r2 = "۫ۙۗۦۡ۟۬۟۬ۧۡۧۘۧۚۛ"
            goto L_0x000d
        L_0x0056:
            java.lang.String r2 = "ۡۖۢۡ۟ۢ۠ۢۜۘۨۦۧۜۧۨۘ۠۟ۘۘ"
            r12 = r13
            goto L_0x000d
        L_0x005a:
            java.lang.String r2 = "ۧۦ۟ۦ۬ۘۧۥۜۚ۠ۗۧۤۚۢۛۤ"
            r10 = r11
            goto L_0x000d
        L_0x005e:
            r0 = r17
            float r9 = r0.f590k
            java.lang.String r2 = "ۤۖۨۘ۟ۦۡۖۜۖۨ۬ۘۘۤ۫ۖۘۤۖۥۘۙ۬ۧۥۘۜۛ۫"
            goto L_0x000d
        L_0x0065:
            r0 = r17
            float r8 = r0.f589j
            java.lang.String r2 = "ۙۛۜۘۜۖۥۘۢ۬ۚۖۥۜ۬۬ۨۜۛۖۘ۬ۗ"
            goto L_0x000d
        L_0x006c:
            java.lang.String r2 = "ۙۡ۠ۖۥۛ۬ۜۜ۠ۨۖۘۘۖۜ"
            r10 = r9
            goto L_0x000d
        L_0x0070:
            java.lang.String r2 = "ۚۧۨۥ۟ۦۘۜۘۜ۟ۙ۟ۛ۠۟ۖ۟ۡۘۦۘۘۤۜۡۙ۠ۨۘ"
            r12 = r8
            goto L_0x000d
        L_0x0074:
            r0 = r17
            float r7 = r0.f591l
            java.lang.String r2 = "۬ۛ۟ۗۜۚۛۛۨۘۧۖۡۘۥ۟ۢ۫۠ۗۗۙ۟ۤۖ"
            goto L_0x000d
        L_0x007b:
            float r6 = r7 * r18
            java.lang.String r2 = "۟ۘۛۗۦۧۘ۫۬ۚۨۛۥۧۧ۬ۤۦۨ۟ۦۘۖۧۖۘ"
            goto L_0x000d
        L_0x0080:
            r0 = r17
            r0.f591l = r6
            java.lang.String r2 = "ۚ۠ۢۥ۬ۥۚۡۧۤۛۤۡۥۘ۫ۛۥۡۤۦۥۙۡۘ"
            goto L_0x000d
        L_0x0087:
            r14 = 2077668777(0x7bd6b5a9, float:2.229672E36)
            java.lang.String r2 = "۠۬ۖۘۨۚۦۦۨۛۛۜ۬ۚ۠ۡۙۙ۫"
        L_0x008c:
            int r15 = r2.hashCode()
            r15 = r15 ^ r14
            switch(r15) {
                case -7847231: goto L_0x009c;
                case 570797494: goto L_0x00a3;
                case 635380119: goto L_0x010f;
                case 1370215223: goto L_0x0095;
                default: goto L_0x0094;
            }
        L_0x0094:
            goto L_0x008c
        L_0x0095:
            java.lang.String r2 = "ۛۦۜۗۜۡۘۜۡۗۙۘۧۚۤۥۘۗ۫۫ۚۙۡۙۛۦۘ"
            goto L_0x000d
        L_0x0099:
            java.lang.String r2 = "ۤۧ۬۟ۦۘۦۘۦۘۦۛۦۘ۟ۥۙۦۦ۠ۡۨۧۘۤ۫ۥۘ۟۫ۘۘ"
            goto L_0x008c
        L_0x009c:
            int r2 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r2 <= 0) goto L_0x0099
            java.lang.String r2 = "ۛۛۜ۟ۗۥۘۡۨۡۘۗ۫ۡۡۢۨۘۚۛۥۡۗۘۙۡ"
            goto L_0x008c
        L_0x00a3:
            java.lang.String r2 = "ۦۘ۟ۚ۟ۧۚۥۘۘۦ۠ۧ۟ۙۡۘ"
            goto L_0x008c
        L_0x00a6:
            r0 = r17
            r0.f591l = r12
            java.lang.String r2 = "ۙۛۚۚ۫ۥ۟ۤۢ۟ۙۦۘۗۡۨ۟۬ۚۦۨۘۘۘۖۛۜ۟ۜۘ"
            goto L_0x000d
        L_0x00ae:
            float r5 = r12 / r7
            java.lang.String r2 = "ۜۦۜۘۙ۟۟ۛۚۖۥۤ۬۠ۤۨۘۦ۫۬ۤ۬۟ۢۗۜ"
            goto L_0x000d
        L_0x00b4:
            java.lang.String r2 = "ۛ۟ۛۜۜۗ۟۠۠ۚۛۢ۬ۧۖۘۖۢۧ"
            r4 = r5
            goto L_0x000d
        L_0x00b9:
            java.lang.String r2 = "ۗۦۙۛ۫ۧ۠ۗ۫۬ۖۡ۠ۙۦۧۧ۠ۧ۫ۦۦۚۨۘ"
            r4 = r18
            goto L_0x000d
        L_0x00bf:
            r14 = 833129451(0x31a88beb, float:4.9053503E-9)
            java.lang.String r2 = "۫ۧ۬ۜۢۧۧۥۨۘۖۦ۬ۦۖۥۡۛۖۘۗۥۧۘ"
        L_0x00c4:
            int r15 = r2.hashCode()
            r15 = r15 ^ r14
            switch(r15) {
                case -1769897105: goto L_0x00db;
                case -489929416: goto L_0x00d4;
                case 211623689: goto L_0x0113;
                case 1542131274: goto L_0x00cd;
                default: goto L_0x00cc;
            }
        L_0x00cc:
            goto L_0x00c4
        L_0x00cd:
            java.lang.String r2 = "ۤۦۦۦۜۦۘۘ۠ۘۘۜۜۛۥۢۥۘۧۚۜۘۖۜۤ"
            goto L_0x000d
        L_0x00d1:
            java.lang.String r2 = "ۚۦۘۡ۠ۢۘۗۜۗۖۘۥۨۖۘۘۥۨۢۗۚ"
            goto L_0x00c4
        L_0x00d4:
            int r2 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r2 >= 0) goto L_0x00d1
            java.lang.String r2 = "۫۟ۥۥۦۧ۠ۖۖۗ۠ۢ۠ۡۘۘۚۘۡۘ"
            goto L_0x00c4
        L_0x00db:
            java.lang.String r2 = "ۗۚ۫ۨۗۚ۬ۨۦۘۧۥ۬ۥ۠ۘ۟ۛۨۘۜۛ۬"
            goto L_0x00c4
        L_0x00de:
            r0 = r17
            r0.f591l = r10
            java.lang.String r2 = "ۙۚ۫ۦۖۢۚۡۡۨۛۜ۬ۡۖ۬ۦۦۡۚۘۥ۟ۖۖۥۡۘ"
            goto L_0x000d
        L_0x00e6:
            float r3 = r10 / r7
            java.lang.String r2 = "ۨ۠ۡۘۧۚۘۤ۠ۙۖۤۤ۬ۚۛۖۜ۫۠ۚۦۘۛۛۘۘ"
            goto L_0x000d
        L_0x00ec:
            java.lang.String r2 = "ۡۗۘۤۙۧۜۗۜۡ۫ۤۘۜۙ۠ۦۦۘ۫ۦۡۨ۫ۨۥۛۖ"
            r4 = r3
            goto L_0x000d
        L_0x00f1:
            r0 = r17
            android.graphics.Matrix r2 = r0.f588i
            r0 = r19
            r1 = r20
            r2.postScale(r4, r4, r0, r1)
            java.lang.String r2 = "۬۫ۦۜۘ۟ۥ۠ۜۘۚ۬ۘۤۤۡۘ"
            goto L_0x000d
        L_0x0100:
            r17.g()
            java.lang.String r2 = "ۛۥۜۘ۟ۨۘۗ۫ۨ۟۬ۦۘۜۤ۟ۤۦۡۘ"
            goto L_0x000d
        L_0x0107:
            java.lang.String r2 = "ۖ۟ۘۘۛۗۙۦ۬ۖۤۢۗ۫ۘۨ۫ۜ۬ۢۤ۠ۡۨ"
            goto L_0x000d
        L_0x010b:
            java.lang.String r2 = "ۚۧۨۥ۟ۦۘۜۘۜ۟ۙ۟ۛ۠۟ۖ۟ۡۘۦۘۘۤۜۡۙ۠ۨۘ"
            goto L_0x000d
        L_0x010f:
            java.lang.String r2 = "ۜۚۜۘۤۚۜ۫ۜۖۤۗۢۘۗۗۧۡۜۘ"
            goto L_0x000d
        L_0x0113:
            java.lang.String r2 = "ۡۗۘۤۙۧۜۗۜۡ۫ۤۘۜۙ۠ۦۦۘ۫ۦۡۨ۫ۨۥۛۖ"
            goto L_0x000d
        L_0x0117:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.TouchImageView.e(com.obwhatsapp.yo.TouchImageView, float, float, float, boolean):void");
    }

    private float getImageHeight() {
        String str = "ۥۛۜۘۨۚ۟ۖ۠ۘۘۚ۠ۖ۬ۡۖۘۧ۠ۡۘۡۘ۟";
        while (true) {
            switch ((str.hashCode() ^ 296) ^ 1894805090) {
                case 495399548:
                    str = "ۜۛۥۘۥ۬ۖۤۧ۟ۚۜۤۜۙۖۘ۫ۤۖۦۤۦ۟ۚۘ";
                    break;
                case 572202234:
                    return this.f586g * this.f591l;
            }
        }
    }

    private float getImageWidth() {
        String str = "ۤ۟۫ۢ۫ۘۘۡ۟ۘۘۖ۠ۢۜ۬۟ۘۧۖۘۥ۟ۡۘ";
        while (true) {
            switch ((str.hashCode() ^ 922) ^ 1352925199) {
                case 651933925:
                    str = "ۛۖۛۧۗۦۘۧۧۥۚۖۙۚۦۜۘ۠ۢۢ۬۟ۧۧۥۖۘ";
                    break;
                case 880737123:
                    return this.f587h * this.f591l;
            }
        }
    }

    private void setState(State state) {
        String str = "ۛ۠۠۠۬ۢۢۤۛ۟ۧۥۢۘۦ۬۫ۗ۟ۖ۠ۜ۠۫";
        while (true) {
            switch ((str.hashCode() ^ 367) ^ -24432576) {
                case -1792784800:
                    str = "ۡۨۖۨۜ۟۬ۢ۬ۤ۠ۜ۟ۘۙۡۧۥۘ۫ۘۘۘ۠ۦۘ۠۠ۗ";
                    break;
                case -1405941270:
                    this.f598s = state;
                    str = "ۜۜۧۘۖۙ۬ۥۨۦۘۧ۬ۘۡ";
                    break;
                case -910724492:
                    return;
                case -211862934:
                    str = "ۚۢۛۘۘۘ۬ۢۦۤۘۘ۟ۗۛۨۦۗ";
                    break;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0058, code lost:
        r2 = "ۤۚۜۚۗۙ۟۫۠۫ۦ۟ۛۜۦ۫ۙ۠ۘۘۦۥ۠ۦ۬ۖۙ";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f() {
        /*
            r32 = this;
            r31 = 0
            r9 = 0
            r17 = 0
            r30 = 0
            r29 = 0
            r16 = 0
            r15 = 0
            r14 = 0
            r13 = 0
            r11 = 0
            r10 = 0
            r8 = 0
            r7 = 0
            r6 = 0
            r5 = 0
            r3 = 0
            r4 = 0
            r12 = 0
            java.lang.String r2 = "ۗ۟ۜۘۙۧۚۖ۫ۥۖ۫ۙۚۜۘۘۤ۬ۤۗۘۥۜۧۖۢ"
            r18 = r3
            r19 = r5
            r20 = r6
            r21 = r7
            r22 = r8
            r23 = r10
            r24 = r11
            r25 = r13
            r26 = r14
            r27 = r15
            r28 = r16
        L_0x002f:
            int r3 = r2.hashCode()
            r5 = 915(0x393, float:1.282E-42)
            r6 = -1674862276(0xffffffff9c2ba13c, float:-5.6787544E-22)
            r3 = r3 ^ r5
            r3 = r3 ^ r6
            switch(r3) {
                case -2073994027: goto L_0x0158;
                case -1609268711: goto L_0x021a;
                case -1550431188: goto L_0x0115;
                case -1449713379: goto L_0x0041;
                case -1404454606: goto L_0x003e;
                case -1277045808: goto L_0x0069;
                case -1178319175: goto L_0x0165;
                case -1099746326: goto L_0x0236;
                case -1041796383: goto L_0x01de;
                case -894655037: goto L_0x0289;
                case -819664073: goto L_0x0106;
                case -670219609: goto L_0x00ca;
                case -577527942: goto L_0x004a;
                case -553791633: goto L_0x0276;
                case -451296334: goto L_0x0293;
                case -234909959: goto L_0x00fb;
                case -224650312: goto L_0x02b5;
                case -181861000: goto L_0x01ea;
                case -121674071: goto L_0x01a4;
                case -44473292: goto L_0x01f4;
                case 82754191: goto L_0x0089;
                case 123355583: goto L_0x017f;
                case 366074773: goto L_0x00a9;
                case 551565712: goto L_0x02ad;
                case 646900363: goto L_0x0129;
                case 666694305: goto L_0x02b1;
                case 799436828: goto L_0x0120;
                case 943228843: goto L_0x01fd;
                case 980313466: goto L_0x0258;
                case 1053624716: goto L_0x0267;
                case 1057203146: goto L_0x00eb;
                case 1297017285: goto L_0x029c;
                case 1446594416: goto L_0x0172;
                case 1449505213: goto L_0x0141;
                case 1463044700: goto L_0x0137;
                case 1572585718: goto L_0x00f3;
                case 1743795478: goto L_0x020c;
                case 1756237500: goto L_0x014e;
                case 1785968054: goto L_0x01d4;
                case 1788041550: goto L_0x01c5;
                case 1877456736: goto L_0x010d;
                case 2049087873: goto L_0x0213;
                default: goto L_0x003d;
            }
        L_0x003d:
            goto L_0x002f
        L_0x003e:
            java.lang.String r2 = "ۥۡ۟ۛ۠ۖۘۛۘۡ۫۠۬ۡۘ۫ۛۚۨ"
            goto L_0x002f
        L_0x0041:
            android.graphics.drawable.Drawable r3 = r32.getDrawable()
            java.lang.String r2 = "ۤۨ۫ۜۥۘۗ۬ۙ۬ۚۙ۟ۢۡۘ۟ۛۚ"
            r31 = r3
            goto L_0x002f
        L_0x004a:
            r3 = -686019871(0xffffffffd71c2ae1, float:-1.71707977E14)
            java.lang.String r2 = "۟۠ۥۥ۬ۛ۬۠۟۠ۘۘۛ۠ۖ"
        L_0x004f:
            int r5 = r2.hashCode()
            r5 = r5 ^ r3
            switch(r5) {
                case -1659017061: goto L_0x0058;
                case -1509522698: goto L_0x0063;
                case -828306291: goto L_0x005e;
                case 1739344566: goto L_0x0066;
                default: goto L_0x0057;
            }
        L_0x0057:
            goto L_0x004f
        L_0x0058:
            java.lang.String r2 = "ۤۚۜۚۗۙ۟۫۠۫ۦ۟ۛۜۦ۫ۙ۠ۘۘۦۥ۠ۦ۬ۖۙ"
            goto L_0x002f
        L_0x005b:
            java.lang.String r2 = "۠ۚۦۘۥ۟ۗۘۗۜۘ۫ۥۘۚ۟۟ۜۛۡ"
            goto L_0x004f
        L_0x005e:
            if (r31 == 0) goto L_0x005b
            java.lang.String r2 = "ۜۗۦۨۚۜۘۧۚۛۡۥۘۡۤۨۢۨۧۘۗۦۖۛۚۦۘۖۜۨۘ"
            goto L_0x004f
        L_0x0063:
            java.lang.String r2 = "ۡۘۘۚۚۥ۬ۤۗ۫ۧ۟ۖۜۗۚۘۨۘ"
            goto L_0x004f
        L_0x0066:
            java.lang.String r2 = "ۢۧ۫ۘۨۧ۫ۛۢ۬ۤ۟ۥۢۜۘ"
            goto L_0x002f
        L_0x0069:
            r3 = -814796168(0xffffffffcf6f3278, float:-4.01306214E9)
            java.lang.String r2 = "ۡۦۤۛۡۦۘۙۚۘۘ۠ۥ۬ۦ۬ۤۙۤۧ۬۬ۜۖۙۜۘۢۡۢ"
        L_0x006e:
            int r5 = r2.hashCode()
            r5 = r5 ^ r3
            switch(r5) {
                case 42552077: goto L_0x007d;
                case 364532401: goto L_0x0058;
                case 1602334445: goto L_0x0077;
                case 1757052624: goto L_0x0086;
                default: goto L_0x0076;
            }
        L_0x0076:
            goto L_0x006e
        L_0x0077:
            java.lang.String r2 = "ۦۙۘۤۙۡۘۥ۬ۖۘۦۖ۫۟ۗۖۘۧ۫ۖۥۖۨ"
            goto L_0x002f
        L_0x007a:
            java.lang.String r2 = "ۢۧ۬۫۟۬ۧ۬ۨۧ۬ۜۘۚۦۧۢۘۛۛ۟ۖ۠ۚ۫ۨۤۡ"
            goto L_0x006e
        L_0x007d:
            int r2 = r31.getIntrinsicWidth()
            if (r2 == 0) goto L_0x007a
            java.lang.String r2 = "ۢۥ۫ۚۖۖ۟ۙۡۘۥۧ۟ۛۧۘۘۧۤۨۦۘۡ۠ۖۢۥۖۛ"
            goto L_0x006e
        L_0x0086:
            java.lang.String r2 = "ۡ۫ۥۘۘ۬ۦۘۖ۬۟۫ۦۜۨۘۤ۬ۜۘۤ۬۬"
            goto L_0x006e
        L_0x0089:
            r3 = 1652734641(0x6282bab1, float:1.2057646E21)
            java.lang.String r2 = "ۗۦۖۘۜ۟ۘۘ۬ۨۘۘۜۡۚۚۘ۫ۚۖۘۜۚۛۤۚۖ"
        L_0x008e:
            int r5 = r2.hashCode()
            r5 = r5 ^ r3
            switch(r5) {
                case -1046186677: goto L_0x0058;
                case -603442362: goto L_0x009d;
                case 2028879912: goto L_0x00a6;
                case 2051227707: goto L_0x0097;
                default: goto L_0x0096;
            }
        L_0x0096:
            goto L_0x008e
        L_0x0097:
            java.lang.String r2 = "ۛۡ۫ۛۘۛۗۢۢۢ۬ۛۙ۬ۥۘۘ۫ۥۘۧۘۜۘ۠ۛۡ"
            goto L_0x002f
        L_0x009a:
            java.lang.String r2 = "ۜۨۡۘۗۢۧۥۚ۬ۧۛ۫ۗۘ"
            goto L_0x008e
        L_0x009d:
            int r2 = r31.getIntrinsicHeight()
            if (r2 == 0) goto L_0x009a
            java.lang.String r2 = "ۥ۠ۗۤۖۘ۬ۖۡۘۛۤۥۧۢۥ"
            goto L_0x008e
        L_0x00a6:
            java.lang.String r2 = "ۡۛۡ۫ۖ۠ۧۗۖۘ۠ۢۥۥۚۡۘۡۜۖۘۢ۬ۦ۫ۘۚۦۡۦۘ"
            goto L_0x008e
        L_0x00a9:
            r3 = 1903909133(0x717b590d, float:1.2446143E30)
            java.lang.String r2 = "ۖ۠ۗ۫۬ۦ۫ۨۤۘۥۧۘۦۥۥۘۚ۬ۜ"
        L_0x00ae:
            int r5 = r2.hashCode()
            r5 = r5 ^ r3
            switch(r5) {
                case -1864141023: goto L_0x0058;
                case -51602106: goto L_0x00be;
                case 752883402: goto L_0x00b7;
                case 1399728712: goto L_0x00c7;
                default: goto L_0x00b6;
            }
        L_0x00b6:
            goto L_0x00ae
        L_0x00b7:
            java.lang.String r2 = "ۥ۫ۦۘۚۗ۫۬۫ۗۜ۟ۖۘ۫ۜۨۘ"
            goto L_0x002f
        L_0x00bb:
            java.lang.String r2 = "ۦۢۨ۟ۜۜۘۦۗۛۥۧۖۖۙۡۘۘۛۥۘۦۢۛ۬ۥۥ"
            goto L_0x00ae
        L_0x00be:
            r0 = r32
            android.graphics.Matrix r2 = r0.f588i
            if (r2 == 0) goto L_0x00bb
            java.lang.String r2 = "ۧ۬ۖۘۧۘۥ۟۬ۗۖۤۡۨۘۧ۬ۙ۟ۚۜۘ"
            goto L_0x00ae
        L_0x00c7:
            java.lang.String r2 = "ۜۧۨۡۖۥۡۖۘۡۗ۫ۡۗ۫ۦۥۗۙۦۦۘ"
            goto L_0x00ae
        L_0x00ca:
            r3 = -1847221686(0xffffffff91e5a24a, float:-3.6229848E-28)
            java.lang.String r2 = "ۦۙۥۥۖۨۚۖۢۧۘۘۥ۟ۨۘ۠ۧۦۚۨۨۘۦۜۘ"
        L_0x00cf:
            int r5 = r2.hashCode()
            r5 = r5 ^ r3
            switch(r5) {
                case -1563249985: goto L_0x00de;
                case -1178521603: goto L_0x00d8;
                case -584816858: goto L_0x0058;
                case 564307179: goto L_0x00e7;
                default: goto L_0x00d7;
            }
        L_0x00d7:
            goto L_0x00cf
        L_0x00d8:
            java.lang.String r2 = "ۘۥۛۛۢۢۨۛۡۘۤۚۘۖ۬ۘۘ"
            goto L_0x00cf
        L_0x00db:
            java.lang.String r2 = "۬ۖۢۡۚۖۦۘۧۙۖۛۛ۬ۧۢۗۘۘۨۚۛ"
            goto L_0x00cf
        L_0x00de:
            r0 = r32
            android.graphics.Matrix r2 = r0.f594o
            if (r2 == 0) goto L_0x00db
            java.lang.String r2 = "ۗۖ۠ۗۡۚۖۦۤۢۡۢۡۙ۠ۚۨۘۛۗۚ۟ۜۜۘ"
            goto L_0x00cf
        L_0x00e7:
            java.lang.String r2 = "ۨۢۥۘ۠۟ۦ۟ۤۜ۬ۨۘۦۛۙ"
            goto L_0x002f
        L_0x00eb:
            int r9 = r31.getIntrinsicWidth()
            java.lang.String r2 = "ۨ۟ۦۘۥۨۘۧۧۘۘۗۥۘ۬۬ۗ"
            goto L_0x002f
        L_0x00f3:
            int r17 = r31.getIntrinsicHeight()
            java.lang.String r2 = "ۛۦۥۘۦ۬ۤۤۥۡۜ۬۫ۚۧ۬ۙۛۥۘ۠۫ۤۖ۬۟ۜۙۜ"
            goto L_0x002f
        L_0x00fb:
            r0 = r32
            int r2 = r0.f602w
            float r3 = (float) r2
            java.lang.String r2 = "ۘۤۘۧۛۙ۟ۜۛۨۛۖۚۛۘۙۧۦۖۙۘۚۤۨۨۡۡۘ"
            r30 = r3
            goto L_0x002f
        L_0x0106:
            float r3 = (float) r9
            java.lang.String r2 = "ۙۛۢۘۥۥۘۚۥۘۥۥۨ۬ۤۥۧۢۧ۬ۢۛۤۘۗۧۘۘ"
            r29 = r3
            goto L_0x002f
        L_0x010d:
            float r3 = r30 / r29
            java.lang.String r2 = "ۗۚۡۤ۠ۤۖۡۖۘۡۛۖۘۗۤۛۥۖۗۛ۠ۥۘ"
            r28 = r3
            goto L_0x002f
        L_0x0115:
            r0 = r32
            int r2 = r0.f601v
            float r3 = (float) r2
            java.lang.String r2 = "ۖۨۥۛۢۘۘۘۥۧۘ۟۟ۦ۬ۤۙ"
            r27 = r3
            goto L_0x002f
        L_0x0120:
            r0 = r17
            float r3 = (float) r0
            java.lang.String r2 = "۬ۘۚۦۤۥۚۘۘۛۘۨۙۛۤۦ۫ۡ۫ۨۜۘۦۜۧۘ"
            r26 = r3
            goto L_0x002f
        L_0x0129:
            float r2 = r27 / r26
            r0 = r28
            float r3 = java.lang.Math.min(r0, r2)
            java.lang.String r2 = "۠ۤۖۘۢۗ۬ۢۙۥۧۡ۫ۨۙۘۚ۠۫ۘۨ۠۫۠ۦ"
            r25 = r3
            goto L_0x002f
        L_0x0137:
            r0 = r32
            int r3 = r0.f601v
            java.lang.String r2 = "ۙۜۧۘۛ۟ۙۨۛۦۘۢۚ۫۬ۥۘ۬۬"
            r24 = r3
            goto L_0x002f
        L_0x0141:
            r0 = r24
            float r2 = (float) r0
            float r3 = r26 * r25
            float r3 = r2 - r3
            java.lang.String r2 = "ۖ۠ۖۘۖۢۙۡۖۜۘۢۤ۟ۧۗۘۦۤۘۘ۠ۘۦۘۜۥۡ"
            r23 = r3
            goto L_0x002f
        L_0x014e:
            r0 = r32
            int r3 = r0.f602w
            java.lang.String r2 = "ۚۦۦۘ۬ۨۡۙۜۦۡ۫ۥ۟ۡۡۦۘۘۢ۟ۡۘ"
            r22 = r3
            goto L_0x002f
        L_0x0158:
            r0 = r22
            float r2 = (float) r0
            float r3 = r29 * r25
            float r3 = r2 - r3
            java.lang.String r2 = "ۚۚۜۘۚۨ۟ۡ۠ۡ۫ۛ۬ۦۘۚۗۜۘۤۡۨۡ۟ۥ"
            r21 = r3
            goto L_0x002f
        L_0x0165:
            r0 = r22
            float r2 = (float) r0
            float r2 = r2 - r21
            r0 = r32
            r0.f587h = r2
            java.lang.String r2 = "ۘۙۛۘ۠ۥۨ۠ۚۨۙۚ۫ۘۡۘۗۡۛۡ۫ۦۘ"
            goto L_0x002f
        L_0x0172:
            r0 = r24
            float r2 = (float) r0
            float r2 = r2 - r23
            r0 = r32
            r0.f586g = r2
            java.lang.String r2 = "۟ۚۘۘۡۜۛۡۛۘۘۦۖۜۚۗ۟ۚ۬ۗ"
            goto L_0x002f
        L_0x017f:
            r3 = 1980710767(0x760f3f6f, float:7.263526E32)
            java.lang.String r2 = "۫ۙۥۘۗۡۙ۟ۙۚۛۘۘۙۛ۠ۡۢۧ"
        L_0x0184:
            int r5 = r2.hashCode()
            r5 = r5 ^ r3
            switch(r5) {
                case -1716575330: goto L_0x018d;
                case 457117210: goto L_0x019d;
                case 549933741: goto L_0x02ad;
                case 1742723054: goto L_0x01a0;
                default: goto L_0x018c;
            }
        L_0x018c:
            goto L_0x0184
        L_0x018d:
            r0 = r32
            float r2 = r0.f591l
            r5 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 == 0) goto L_0x019a
            java.lang.String r2 = "ۜۥۤ۬ۖۗ۫ۥۥۘۗۡۥۘۥۚۢ۠ۛۡ"
            goto L_0x0184
        L_0x019a:
            java.lang.String r2 = "ۗ۟ۢۧۜۥۘۖۦۡ۟ۥۖ۫ۖۖۘۗۚۗۨۥۧۦ"
            goto L_0x0184
        L_0x019d:
            java.lang.String r2 = "ۚۨۚۛۨۥۘ۫ۡۨۘۜۨۧۘۥۜۥۥۧ"
            goto L_0x0184
        L_0x01a0:
            java.lang.String r2 = "ۙۙۛۥۙۙۙۢۨۘۜ۫ۜۘ۬ۛ۫ۨ۠ۛۡ۬۫ۨۧۨۘ۫ۤۥۘ"
            goto L_0x002f
        L_0x01a4:
            r3 = -1919480186(0xffffffff8d970e86, float:-9.30959E-31)
            java.lang.String r2 = "ۤۡۥۨۡۙۧۥۜۢۘۘۛۦۢ"
        L_0x01a9:
            int r5 = r2.hashCode()
            r5 = r5 ^ r3
            switch(r5) {
                case -2117200131: goto L_0x01b9;
                case -1757019345: goto L_0x02a9;
                case -1701294835: goto L_0x01c2;
                case -187548544: goto L_0x01b2;
                default: goto L_0x01b1;
            }
        L_0x01b1:
            goto L_0x01a9
        L_0x01b2:
            java.lang.String r2 = "ۧۢۙۙۤۤ۬ۦ۟ۨۛۜۘۤۨۚ۬ۘۗۧۘۚۨۛۡۘۨۥۡ"
            goto L_0x002f
        L_0x01b6:
            java.lang.String r2 = "ۦ۬ۘۘ۬۠ۦۖ۠ۦ۫ۜۧۘۛ۠ۦۘ"
            goto L_0x01a9
        L_0x01b9:
            r0 = r32
            boolean r2 = r0.f597r
            if (r2 == 0) goto L_0x01b6
            java.lang.String r2 = "ۛۤۨۘ۬ۢۗۤۚۘۙۨۖۧۜۘۜۙۘ۫ۛۥۘۧۘۤ"
            goto L_0x01a9
        L_0x01c2:
            java.lang.String r2 = "ۚۥۙۨ۟ۦۛۡۨۘۨۜۨۚ۬ۡۘ"
            goto L_0x01a9
        L_0x01c5:
            r0 = r32
            android.graphics.Matrix r2 = r0.f594o
            r0 = r32
            float[] r3 = r0.f582c
            r2.getValues(r3)
            java.lang.String r2 = "ۜۘۡۘ۬ۖۡۘۡ۬ۜۘۦۜۧ۠ۢۚۡۚۜۘۧۗ۠"
            goto L_0x002f
        L_0x01d4:
            r0 = r32
            float[] r3 = r0.f582c
            java.lang.String r2 = "ۜۗۙۢۛۨۘ۠ۛۥۗ۠۟ۜۦۧۘ"
            r20 = r3
            goto L_0x002f
        L_0x01de:
            r0 = r32
            float r2 = r0.f587h
            float r3 = r2 / r29
            java.lang.String r2 = "۟ۤ۫۟ۖۘ۫ۨۖۤۤۖۛ۟ۥۤ۠ۦۘ"
            r19 = r3
            goto L_0x002f
        L_0x01ea:
            r0 = r32
            float r3 = r0.f591l
            java.lang.String r2 = "ۧۢۘۦ۬ۥۘۖۧۙۨۜۡۥۤۥۘۦۘۨۜۚۙۡۙۥۗۛۚ"
            r18 = r3
            goto L_0x002f
        L_0x01f4:
            r2 = 0
            float r3 = r19 * r18
            r20[r2] = r3
            java.lang.String r2 = "ۚۚۧۖۦ۟ۙۥۧۦۡۡۘۜۜۧۘۛۚۚ۟ۧۙۨۘۛۡۦ"
            goto L_0x002f
        L_0x01fd:
            r2 = 4
            r0 = r32
            float r3 = r0.f586g
            float r3 = r3 / r26
            float r3 = r3 * r18
            r20[r2] = r3
            java.lang.String r2 = "ۚۥۙۘۦۤۘۤ۫ۨۙۨ۟۠ۢۗۙۡۘۛۚۨۘۙۜۢۜۦۙ"
            goto L_0x002f
        L_0x020c:
            r2 = 2
            r4 = r20[r2]
            java.lang.String r2 = "ۚۚۛۘ۟ۜۘۨۘ۟۠ۙۥۦ۫۫ۚۜۛ"
            goto L_0x002f
        L_0x0213:
            r2 = 5
            r12 = r20[r2]
            java.lang.String r2 = "ۙۜۧ۬ۨۢۚۦۛۤۙۤۨ۟ۡۘۛ۫۬۟۟ۢ"
            goto L_0x002f
        L_0x021a:
            r3 = 2
            r0 = r32
            float r2 = r0.f593n
            float r5 = r2 * r18
            float r6 = r32.getImageWidth()
            r0 = r32
            int r7 = r0.f596q
            r0 = r32
            int r8 = r0.f602w
            r2 = r32
            r2.k(r3, r4, r5, r6, r7, r8, r9)
            java.lang.String r2 = "ۨۨۥۨۦۢ۠ۘ۬۫۫ۤۜ۟ۥۘ"
            goto L_0x002f
        L_0x0236:
            r11 = 5
            r0 = r32
            float r2 = r0.f592m
            r0 = r32
            float r3 = r0.f591l
            float r13 = r2 * r3
            float r14 = r32.getImageHeight()
            r0 = r32
            int r15 = r0.f595p
            r0 = r32
            int r0 = r0.f601v
            r16 = r0
            r10 = r32
            r10.k(r11, r12, r13, r14, r15, r16, r17)
            java.lang.String r2 = "ۗ۟۠ۜۚ۫۫ۡۛۙۥۤۢۥۨ۟ۢ۫ۡۙۦۘ"
            goto L_0x002f
        L_0x0258:
            r0 = r32
            android.graphics.Matrix r2 = r0.f588i
            r0 = r32
            float[] r3 = r0.f582c
            r2.setValues(r3)
            java.lang.String r2 = "۟ۖۥۧۤ۠ۧۧۦۘ۟۬ۚ۠۬۟۟۬ۗۨ۟ۛۡۨ"
            goto L_0x002f
        L_0x0267:
            r0 = r32
            android.graphics.Matrix r2 = r0.f588i
            r0 = r25
            r1 = r25
            r2.setScale(r0, r1)
            java.lang.String r2 = "۬ۧۦۨۚۡۘۜ۬ۧۦۙۧۘۤۥۘۨۘ"
            goto L_0x002f
        L_0x0276:
            r0 = r32
            android.graphics.Matrix r2 = r0.f588i
            r3 = 1073741824(0x40000000, float:2.0)
            float r3 = r21 / r3
            r5 = 1073741824(0x40000000, float:2.0)
            float r5 = r23 / r5
            r2.postTranslate(r3, r5)
            java.lang.String r2 = "۟۫ۘۘ۬ۦۗ۠۠ۘۤۛۗۖۥ۠ۤ۠۠"
            goto L_0x002f
        L_0x0289:
            r2 = 1065353216(0x3f800000, float:1.0)
            r0 = r32
            r0.f591l = r2
            java.lang.String r2 = "ۧۢۘۘۘۧۤ۫ۛۜۧ۠ۢۨۘۧۛۦۡۘۘۗۚۦۖۦ"
            goto L_0x002f
        L_0x0293:
            r2 = 0
            r0 = r32
            r0.f597r = r2
            java.lang.String r2 = "ۙ۟ۡۘۖۗ۫ۜ۬ۗۗ۬ۘۦۚۙۙۛۘۘۜۦۧۥۗۛۨۨۘۘ"
            goto L_0x002f
        L_0x029c:
            r0 = r32
            android.graphics.Matrix r2 = r0.f588i
            r0 = r32
            r0.setImageMatrix(r2)
            java.lang.String r2 = "ۤۚۜۚۗۙ۟۫۠۫ۦ۟ۛۜۦ۫ۙ۠ۘۘۦۥ۠ۦ۬ۖۙ"
            goto L_0x002f
        L_0x02a9:
            java.lang.String r2 = "ۛۙۦۛۛۧ۬ۧۥۛ۠ۙۨۗۤۘۛۛۤۖۘ۟ۢۡۛۖ۠"
            goto L_0x002f
        L_0x02ad:
            java.lang.String r2 = "ۛۨ۟ۚۦۘۤۙ۬ۗۢۖۗۧۡ"
            goto L_0x002f
        L_0x02b1:
            java.lang.String r2 = "ۙ۟ۡۘۖۗ۫ۜ۬ۗۗ۬ۘۦۚۙۙۛۘۘۜۦۧۥۗۛۨۨۘۘ"
            goto L_0x002f
        L_0x02b5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.TouchImageView.f():void");
    }

    public void fixTrans() {
        float[] fArr = null;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        float f7 = 0.0f;
        float f8 = 0.0f;
        float f9 = 0.0f;
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = 0.0f;
        boolean z2 = false;
        boolean z3 = false;
        float f14 = 0.0f;
        float f15 = 0.0f;
        float f16 = 0.0f;
        float f17 = 0.0f;
        float f18 = 0.0f;
        float f19 = 0.0f;
        float f20 = 0.0f;
        float f21 = 0.0f;
        float f22 = 0.0f;
        float f23 = 0.0f;
        float f24 = 0.0f;
        float f25 = 0.0f;
        String str = "۟ۨۡۘۢۢۥۘ۟ۜۖۘۢ۟ۛ۫۠ۡۚۡۦۘۡۜۡ";
        while (true) {
            switch ((str.hashCode() ^ 292) ^ 933329543) {
                case -2135335614:
                    str = "ۖۗۘ۠ۙۚ۫ۦۚۘۧ۬ۚۜ۫";
                    f20 = f19;
                    break;
                case -1722766815:
                    str = "ۖ۟ۘ۬ۤۨۘۡۥ۫۫ۖ۬ۥۗۘ";
                    f7 = f6;
                    break;
                case -1705995512:
                    String str2 = "۠ۨ۟۠۠ۜۡۙۢۛ۠ۛۥۦۘ۬ۖۥ۟ۧۘۨ۟";
                    while (true) {
                        switch (str2.hashCode() ^ 1620978212) {
                            case -1063411210:
                                if (f3 >= f21) {
                                    str2 = "ۛۦۦۨۨۥۢۨۖۜۜ۟ۙۡۘۦۜۖ";
                                    break;
                                } else {
                                    str2 = "ۚۧۢۤ۠ۗۘۜۦۛ۫۫ۘ۠ۧۧۥۡۘۗۙۦۘ۟ۖۜۘ";
                                    break;
                                }
                            case -793248872:
                                str2 = "۫۠ۦۘۦۖۛۜۥۤ۟ۜۜۘۡۙۡۘ";
                                break;
                            case -684527461:
                                str = "ۘۧۥ۫۠۟ۜۚۙۛ۫ۢ۠ۚۦۛۘۡۦۗۡۘۡۙۜ";
                                continue;
                            case 782879501:
                                str = "ۚۥۙۘۜۥۘۡۛۖ۠ۖۥۘۙۛۚ۬ۨۨۡ۟ۚ";
                                continue;
                        }
                    }
                    break;
                case -1673707911:
                    f4 = (float) this.f602w;
                    str = "ۨۖۜۘۘ۟ۢۗۘۢۛۗۖۘۢۖۦۨۚۜۧۦۥۘ";
                    break;
                case -1642252025:
                    str = "ۙ۠ۤۦۡۨۗ۫۫ۢۥۘۧۧۨۘۗۧ۟";
                    f10 = f9;
                    break;
                case -1628995771:
                    String str3 = "۟ۛۨۘۘۥۜۘۤۡۨۢۥۚ۟ۦۦۙ۫ۦۘ";
                    while (true) {
                        switch (str3.hashCode() ^ 863516942) {
                            case -472302619:
                                str3 = "۬۠ۢ۫ۡۜۘ۫۬ۦۘ۫ۖۤۦۗۦۘۧۤۜۘ۫ۙۜ۫۠۬";
                                break;
                            case 226186572:
                                if (f2 <= f10) {
                                    str3 = "ۛ۠ۨ۬۬ۦۘ۫ۢۨۘۤۚۘۘۙۢۨۖۨۖ۟ۢۨۘ۠۬ۦۗ۫ۡۘ";
                                    break;
                                } else {
                                    str3 = "۠ۢ۟ۖ۫ۤۛۚۘۘۡۖۖۘۛۖۧۧۥۚۢۥۛ۟ۗۥۘ۬۬ۘۘ";
                                    break;
                                }
                            case 437228085:
                                str = "ۤۗۖ۫ۤۗ۬ۦۘ۬۬۬ۥۘ۠ۨ۟ۖۘ۬ۗ۫";
                                continue;
                            case 714092133:
                                str = "ۙ۠۟۫ۜۗۖۗۥۘۤۨۨۘ۠ۙۗ۫ۦ۟";
                                continue;
                        }
                    }
                    break;
                case -1568857067:
                    f16 = f14 - f15;
                    str = "ۛۜۡۖۤۘۘۜ۫ۥۜۡ۠ۨۙۚ۠ۥ۫۠ۘۛۥۛ۠ۜۖۨ";
                    break;
                case -1385845349:
                    str = "۟ۖۨۘۖۛ۟ۤۢۡۧۘۘۡۚۨۘۢۨۘ";
                    f21 = f18;
                    break;
                case -1321786662:
                    f22 = (-f3) + f21;
                    str = "ۜۡ۟ۘۛۦۘۜۛۨۥۗۧۙۛۚ";
                    break;
                case -1301569285:
                    str = "ۜۖ۠ۗۤۧۗ۫۠ۗۚۥ۠ۖۗۧۙۖۘۢۚۡۗۖۗۥۙ";
                    f17 = f16;
                    break;
                case -1250855443:
                    str = "۟ۙۥۘۙۛۘ۟ۡۧۨۡ۬ۜ۠ۦ";
                    break;
                case -1238349790:
                    str = "۟ۙۥۘۙۛۘ۟ۡۧۨۡ۬ۜ۠ۦ";
                    f21 = f16;
                    break;
                case -1090959338:
                    f8 = 0.0f;
                    str = "ۚ۫ۦۘۡ۫۫ۗ۠ۥ۬ۛۢۛۜۡۘ";
                    break;
                case -970730208:
                    z2 = false;
                    str = "۟ۢ۠ۨۗۜۤۚۨۚۥۦ۟ۢۘۡ۬ۨۛۡۘۚۤ۬";
                    break;
                case -906076246:
                    String str4 = "ۗۧۙۡۥ۠ۙۦۘۜ۫ۜۙۢۨۘ۟ۤۛۚۘۜۘۙ۟ۜۧۥۜۘ";
                    while (true) {
                        switch (str4.hashCode() ^ 1603036402) {
                            case -1865450180:
                                if (f2 >= f11) {
                                    str4 = "۫ۘۡۘ۬ۡۜۡ۫ۥۜۧ۟ۢۥۘۙۛۢ۬ۥۡۡ۟ۥۘ";
                                    break;
                                } else {
                                    str4 = "ۘۘۢ۠ۡۖۘۚۙۡۘۘۜۙۤۜۧۛۛۜۘۨ۟ۙۖۧۥۜۖۡۘ";
                                    break;
                                }
                            case -1840530688:
                                str = "۠ۛۨۘۚۢ۬ۙۧۧۗۡۡۘۤۘۨ۬ۖۨۚۧۤۦۘۤ";
                                continue;
                            case -1774822945:
                                str = "۠ۛۙۡۢ۟ۛۨۦۘۛۤۖۦ۫ۥۧ۬";
                                continue;
                            case 2131926118:
                                str4 = "ۥ۟ۘۘۛۛۨۢۚۡۘۤۤۨۘ۬ۦۡۘۥۚۨۘۦ۟ۦۘۦۦ۟ۛۡۤ";
                                break;
                        }
                    }
                    break;
                case -844137459:
                    f18 = 0.0f;
                    str = "ۛۨۗۖۦۡۘ۠ۥ۠ۛۛۦۙۚ۫ۛۗۢ";
                    break;
                case -779777377:
                    f13 = (-f2) + f10;
                    str = "ۨۢ۟۠۫ۘۘۦۦ۟ۖۖۖۘۛۤۥۘۦۨۚۚۤۡۦۛ۠۠ۜۙ";
                    break;
                case -758219095:
                    f19 = 0.0f;
                    str = "ۦۦۢۧۧۧۚ۟ۡۨۦۖ۟ۜۜۦۛۛۘۧۘ";
                    break;
                case -748566387:
                case 1253316680:
                    str = "ۧۙۜ۟ۙۢۦ۟ۘ۠ۜۢ۬ۖۖ";
                    break;
                case -579750029:
                    return;
                case -492248481:
                    f9 = 0.0f;
                    str = "ۢۙۧۘۢۖ۫ۜۤۛۤۡۖ۬ۛ";
                    break;
                case -482819455:
                    f15 = getImageHeight();
                    str = "ۤۥۨۨۢۨ۟ۗۙۙۧ۬ۨۧۥۘ";
                    break;
                case -358995317:
                    String str5 = "ۨۘۜۡۖۚ۠ۤۖ۠ۢ۟ۦۘۦۘۚۡۘۘ";
                    while (true) {
                        switch (str5.hashCode() ^ -337099462) {
                            case -1697385377:
                                str5 = "ۢۙۘۘۥۨۨۚۦۘۘۖۚۚۦۘۘ۟ۘ۟۬ۘۘۘ";
                                break;
                            case 1578062662:
                                str = "ۙۗۗۡۚۜۘۛۜۘۘۜۛ۠۠ۢۜۘۜۥۡۘ";
                                continue;
                            case 1838832530:
                                str = "ۚۜۡۘۧۙۥۙۤ۠ۚۗۢۖۙۨۘۘۨۜۘ۫ۙۥۖۙ۫ۦۧۤ";
                                continue;
                            case 1920274453:
                                if (f3 <= f20) {
                                    str5 = "ۤۧ۬۫۫۟۠ۡ۬ۧ۠ۘۘ۠۫ۨۘۡ۠ۤ";
                                    break;
                                } else {
                                    str5 = "۟ۚ۠ۙ۠ۛۦ۟ۨۘ۫ۙۥ۠ۡ۟ۡۘۘۚۢۦۡ۬ۘۢۚۜۘ";
                                    break;
                                }
                        }
                    }
                    break;
                case -64117522:
                    f3 = fArr[5];
                    str = "ۗۥۧۘۨۙۨۘۖۚۨۘۥۙۥۢۖۦۘۦۡۤۨۛۚ۬ۥۨۨۘۜۘ";
                    break;
                case 78041572:
                    String str6 = "ۡ۟ۖۘۨۘۜۢۨۜۘۦۛۨۘۗۗ۬ۚۗۘۘۥ۬ۖۘ۟ۨۧ۬ۗۜۘ";
                    while (true) {
                        switch (str6.hashCode() ^ -443549319) {
                            case -1258324283:
                                str6 = "ۜۦۗۥۡۖ۫۫ۨۘۢۙۖۧۢۚۛۘۤ۬۟۟";
                                break;
                            case -760943525:
                                str = "۠ۗۖۗۜۤۗۘۤۛۖۥۘۦۘ۟ۚۙۢۤ۫ۨۚۡ۠ۤۚۘ";
                                continue;
                            case 151504848:
                                str = "ۖۥۘۘۘۧۘۨۢۘۢۖ۫ۦ۫ۨ";
                                continue;
                            case 962282815:
                                if (f25 == 0.0f) {
                                    str6 = "ۦۗۘۤۢۗۛ۫ۖۚۚۜۘۘۢۜۘۛۖۚ";
                                    break;
                                } else {
                                    str6 = "ۗۧۖۧۥۘۖۤۢۨ۠ۘۘۚۡ۫ۚۜۤۥ۫ۥ۠ۜۡۘ";
                                    break;
                                }
                        }
                    }
                    break;
                case 80289038:
                    this.f588i.getValues(this.f582c);
                    str = "ۙۜۖۘ۬ۘۖۧ۟ۘۘ۠ۥۖۘۛۜۨ";
                    break;
                case 204568404:
                    f12 = (-f2) + f11;
                    str = "ۨۙۡۘۜۤۡ۠ۚۢۨ۟ۨۦۡۖۘۚۚۡۘۨۙۥۘ";
                    break;
                case 312820434:
                    str = "ۗۜۧ۟ۥۚۚ۬ۡ۫ۦۘۦۥۖۜۧۦۨۥۗۜ۟ۦۢۧۡۘ";
                    f11 = f6;
                    break;
                case 475912846:
                    str = "ۗۗۛۘۘ۟ۨ۟ۖۘ۟ۦ۬۫ۡۥۘۡۤۚۙ۟ۥۘۙۛۦۘۡۙۖۘ";
                    break;
                case 500854875:
                    f5 = getImageWidth();
                    str = "ۜۥۘۘ۟۫ۥۚ۟۬۫ۛۙۦ۠ۨۘۚۦۙۙۖ۬ۥۦۨۗ۠ۜ";
                    break;
                case 539126809:
                case 2016340831:
                    str = "ۤۦۖ۬ۥۤۘۘۜۘ۬ۧۗ۟ۨۤۖۛ۟ۙ۬ۙۚۢۜۘ";
                    break;
                case 717959232:
                    this.f588i.postTranslate(z3 ? 1.0f : 0.0f, f25);
                    str = "ۖۥۘۘۘۧۘۨۢۘۢۖ۫ۦ۫ۨ";
                    break;
                case 807812341:
                    str = "ۗۜۧ۟ۥۚۚ۬ۡ۫ۦۘۦۥۖۜۧۦۨۥۗۜ۟ۦۢۧۡۘ";
                    break;
                case 849248542:
                    str = "۠ۙۦۨۥۨۛۥۨۛ۫ۗ۟ۙۧۥۢ۟";
                    f25 = f22;
                    break;
                case 892217428:
                    String str7 = "ۡ۟ۙۘ۬ۘۤۥۡۘۖ۟ۢۤۜۨۥ۟ۜۤۥۘۛۨۜۘ";
                    while (true) {
                        switch (str7.hashCode() ^ 410392532) {
                            case -839606110:
                                if (f15 > f14) {
                                    str7 = "۬۬ۤ۟۠ۜۡ۫ۨۨۦۘ";
                                    break;
                                } else {
                                    str7 = "۠ۤ۫۬ۜۛ۟ۥۨ۬ۨۗ۠ۖۡۜۧۗ";
                                    break;
                                }
                            case 90992534:
                                str = "۠۫ۦۗۙۨۘ۠ۦ۠ۜ۫۠۬ۘۘۦۚۙۛ۟ۚۥۤۘۘ";
                                continue;
                            case 242374919:
                                str = "ۨۢ۫ۧۦۡۗۛۤۤ۬ۧ۟ۙ";
                                continue;
                            case 1368638730:
                                str7 = "ۡۖۙۜۨۗۨۨۜۘۜ۬۫ۚۡۛ۟ۥۘۘ";
                                break;
                        }
                    }
                    break;
                case 1085406835:
                    str = "ۗۥۡۘۙۡۘۙ۠ۢۗ۟ۛۙۚۦۘ";
                    f10 = f7;
                    break;
                case 1107052284:
                    str = "ۥۛۦۢۖۚۜۜۢۚۙۙۨۦ۟ۢۧۤۧۨۘۖۗۦ";
                    f25 = f23;
                    break;
                case 1120622961:
                    str = "۬ۡۘۘۡ۠ۘۘۚۚ۟ۗۨۤۘۖۘ۬ۢۜۘۘۥۖۘ۬ۥۖۚۛۙ";
                    f20 = f17;
                    break;
                case 1173345621:
                    f2 = fArr[2];
                    str = "ۦۨۡۘ۫ۨۡۢۜۜ۬ۥۧۗۨۧۘۦۢ۠ۧ۫۫ۨۧۨ";
                    break;
                case 1176482798:
                    str = "ۚۥۘۥۘۧۘۗ۟۫۟ۘ۫ۘ۠۫۫ۨۨۘ";
                    f11 = f8;
                    break;
                case 1219296009:
                    f6 = f4 - f5;
                    str = "ۨ۫ۘۦ۟ۘۤۙۥۡ۠ۙۖ۬ۨۘ۟ۗۦۢۢۗ۫ۗ۫ۨ۫ۜ";
                    break;
                case 1314681585:
                    str = "ۡۘۜ۟ۡۦۦۦۘۨ۟ۡۘۥۤ۠ۛۚ۟ۦۨۖ";
                    z3 = f12;
                    break;
                case 1340082980:
                    f14 = (float) this.f601v;
                    str = "ۗۨۥۧۗۡۘ۫ۜ۫ۜۡۘۘۜ۫ۨ۬ۨ۟ۤۚۦۘۥۧۡۘۖۦۡ";
                    break;
                case 1421546078:
                    String str8 = "ۚۥۖۢۤ۬ۧۨۡۘۤ۠۠ۦۜۘۦۨۨۘ۬۠۠";
                    while (true) {
                        switch (str8.hashCode() ^ 403173965) {
                            case -1150156625:
                                str = "ۖ۬ۘۚۦۜۘ۟ۤۦۦ۬ۦۛۢۡۘۙ۫ۖۘ۠ۘۘۘ۫ۤ۬ۥ۟ۖ";
                                continue;
                            case -796888312:
                                if (f5 > f4) {
                                    str8 = "ۘۜۧۦۚۡۘۙۧۗۡ۬ۗۧۖۨۙۛ۬";
                                    break;
                                } else {
                                    str8 = "ۡۖۢۗۨۙۥۡۡۘۙۥۥۘۥۢۡۘ";
                                    break;
                                }
                            case 1227223869:
                                str = "ۧ۬۬ۙۡۘۡۦۜۘ۠ۥۢ۠ۦۧۘۥۦۧۡۘۨۥۥۗ";
                                continue;
                            case 1739800620:
                                str8 = "۫ۖۨۘ۫ۤۡۘۥۘۦ۠ۧ۟ۢۦۢۗۙ";
                                break;
                        }
                    }
                    break;
                case 1619467818:
                    f23 = (-f3) + f20;
                    str = "ۛۜ۟ۥۖۧ۬ۖۨ۬۫ۡۘۖۖۧۘۖۨۦۡۚ۟";
                    break;
                case 1943512947:
                    f24 = 0.0f;
                    str = "ۗۨۧۘۥۥۖۧۨۨۘ۠۠ۢ۟ۤۨۘ";
                    break;
                case 2019128448:
                    fArr = this.f582c;
                    str = "ۗۡۘۘ۠ۗۡۘۤ۬ۦۘۦ۠ۘۖۛۖۤۢۙ";
                    break;
                case 2025311425:
                    String str9 = "ۜۢۡۘۡۢ۟ۜۛۧۦۛۚۥ۬ۡۘۡۡۗ۬ۗ";
                    while (true) {
                        switch (str9.hashCode() ^ -1412855197) {
                            case -737280283:
                                if ((z3 ? 1.0f : 0.0f) != 0.0f) {
                                    str9 = "ۨ۬ۨۙۨۧ۬ۖۤۡۥۧۦۥ۬ۗۛۛۡ۠ۜۡۦۨۘۥۤۚ";
                                    break;
                                } else {
                                    str9 = "ۚۛۨۙۜۘۗۙ۬۟ۥ۬ۦۢ۫";
                                    break;
                                }
                            case -496883152:
                                str = "۟ۗۗۘۤۡۘۚۡۙۗۚۥ۬ۚ۟ۗ۬۠۠ۛۘۘ";
                                continue;
                            case 380246995:
                                str = "۠ۗۖۗۜۤۗۘۤۛۖۥۘۦۘ۟ۚۙۢۤ۫ۨۚۡ۠ۤۚۘ";
                                continue;
                            case 1257093030:
                                str9 = "ۛۥۚ۠ۗۢۢ۟ۜۘ۫ۤ۟ۡ۠ۤۖۛۗۖ۬ۦۘۛۥۤ";
                                break;
                        }
                    }
                    break;
                case 2075140465:
                    str = "ۤۦۖ۬ۥۤۘۘۜۘ۬ۧۗ۟ۨۤۖۛ۟ۙ۬ۙۚۢۜۘ";
                    f25 = f24;
                    break;
                case 2117003645:
                    str = "ۨۤۜ۠۫ۡۜۜۤۢۘۨۗۦۡۘ۬ۤ۠۫ۛۧ۬ۤۜ";
                    z3 = f13;
                    break;
                case 2136822226:
                    str = "ۧۙۜ۟ۙۢۦ۟ۘ۠ۜۢ۬ۖۖ";
                    z3 = z2;
                    break;
            }
        }
    }

    public final void g() {
        String str = "۟ۗ۠ۤ۫۟ۡۨ۠ۨۨۘۙۡۚ۟ۘۦ۟ۖ";
        int i2 = 0;
        float f2 = 0.0f;
        int i3 = 0;
        float f3 = 0.0f;
        while (true) {
            switch ((str.hashCode() ^ 101) ^ 312695152) {
                case -2113268091:
                    this.f582c[5] = (((float) i2) - getImageHeight()) / 2.0f;
                    str = "ۡ۫ۧۙ۫ۥۧۘۖۘۦۨۨۘ۬ۥۢۧ۠ۡۘۙۦۖۘ";
                    break;
                case -1713967003:
                    return;
                case -1181577420:
                    str = "ۙۨۦۘ۬ۡۧۘۙۖۘۘۖۤۡۘۡۤۙ۫۬ۜۗۛ۫ۖۦ۫ۧۗۖ";
                    break;
                case -845495376:
                    String str2 = "۠۠ۨۘۢۗۤۥۖۘۘۡۗۖۥۙۜۛۙ۬ۤۜۦۧۨۜۘ۟ۨۤ";
                    while (true) {
                        switch (str2.hashCode() ^ 922259334) {
                            case -2028940787:
                                str = "ۡ۫ۧۙ۫ۥۧۘۖۘۦۨۨۘ۬ۥۢۧ۠ۡۘۙۦۖۘ";
                                continue;
                            case -795834935:
                                str = "ۗ۟ۨۘۤۧۘۘ۠ۚ۫ۘ۫ۙۧۧ";
                                continue;
                            case 800905856:
                                if (f2 >= ((float) i2)) {
                                    str2 = "۟۟ۚۤۡۘۘۥۨۙ۟۫ۘۜۧۘۨۧ۬ۘۙۙ";
                                    break;
                                } else {
                                    str2 = "ۤۜ۟ۙۤۧۧۢۜۡۥۘۘۢۗ۬۟ۦۤۧۚۖۙۙۜۡۖ۫";
                                    break;
                                }
                            case 2052632417:
                                str2 = "ۖۜۦۘۢۨۜۘۥۙۨۘۧۡۨ۫ۥۦۘۗۘ۬";
                                break;
                        }
                    }
                    break;
                case -764083007:
                    i2 = this.f601v;
                    str = "۠ۤۥۖۘۦۙۖۦۘۤۡۘۖ۫ۛۢۚۛۗۢ۠۠۫ۢ۬ۦۧ";
                    break;
                case -694987189:
                    String str3 = "۟ۦ۫ۙ۠ۢۗۥ۟ۜۗ۬ۢۘۢۤۜ۟ۜۡۥۘۨۦۦۘۤ";
                    while (true) {
                        switch (str3.hashCode() ^ -1563720377) {
                            case -388837686:
                                str = "ۛۗۜۘۚ۫ۘۘ۫ۛۥۘۖ۟۠ۦۥۚ";
                                continue;
                            case 329149033:
                                str = "ۛۤۧۦۧۡۘۧۚۖۨۤ۫ۛۡۡۘ";
                                continue;
                            case 676603437:
                                if (f3 >= ((float) i3)) {
                                    str3 = "ۖۦۧۘۨ۠ۥۡۥ۫ۛۤۢ۠ۙۨۚۧۖۘۧۡۘۤۤۧ۫ۛۦ";
                                    break;
                                } else {
                                    str3 = "ۚۤ۫ۖ۫ۢ۟ۗۨۘۗۤۗۛ۬ۡۘۨۗۨۖ";
                                    break;
                                }
                            case 1361168444:
                                str3 = "ۧۢۤ۫ۜۧۘۥۚۨۧۢۙ۟ۨۚ۫ۦۜۛ۬ۦۜ۠ۙۚۦۜۘ";
                                break;
                        }
                    }
                    break;
                case -62962364:
                    this.f588i.getValues(this.f582c);
                    str = "۟ۡۛۚۢۥۦۤۢۘۡۥۦۡۢ۠ۙۦۘۤۨ۬ۗۦۜۘ۫";
                    break;
                case -54601416:
                    this.f588i.setValues(this.f582c);
                    str = "۫۠ۖ۟ۜۙ۬۬ۧ۬ۖۧۢۚۙ";
                    break;
                case 5773489:
                    fixTrans();
                    str = "۟۫ۗ۫ۧۖۘۦۘۢ۬ۤ۫ۗ۫ۡۘۛۗۤ";
                    break;
                case 153917079:
                    str = "ۡۚۨۖۨۘۘۤۘۗۤۗۧۛۘ۬ۥ۫۠۟ۧۦۘۖ۬۫";
                    i3 = this.f602w;
                    break;
                case 1273208667:
                    str = "ۛۥۜۘۜۧۨۘۖۧۤۚۤۖۘۖۢۙۘ۟ۘ";
                    f3 = getImageWidth();
                    break;
                case 1799338442:
                    this.f582c[2] = (((float) i3) - getImageWidth()) / 2.0f;
                    str = "ۛۗۜۘۚ۫ۘۘ۫ۛۥۘۖ۟۠ۦۥۚ";
                    break;
                case 2132450981:
                    str = "ۨۚۨۡۙۖۘ۬ۢۛۛۨۗۚۜۛۗۢۖ۬ۙۨ";
                    f2 = getImageHeight();
                    break;
            }
        }
    }

    public float getCurrentZoom() {
        String str = "ۗۤۜ۠ۢۦۦۜۜ۠۟ۘۘ۬ۧۤۙۢۦۘ";
        while (true) {
            switch ((str.hashCode() ^ 595) ^ -1693672563) {
                case 1583622105:
                    return this.f591l;
                case 2146333258:
                    str = "ۘۡۚۖۜۗ۬ۧ۫ۛۢۡ۬ۘۧۘ";
                    break;
            }
        }
    }

    public PointF getDrawablePointFromTouchPoint(float f2, float f3) {
        String str = "ۧۘ۠ۧۖۥۘۦۘ۫ۨۗۖۡۗۗۧ۬ۦۡۘۜۘۗۖۦۘ۟ۜۨۘ";
        while (true) {
            switch ((str.hashCode() ^ 26) ^ 1692065660) {
                case -1261098282:
                    str = "ۗۖۗۥۛۙ۟ۤۥۙۖۥۙ۬ۡۘۥۖۚ۬۠ۗ";
                    break;
                case -16274234:
                    return j(f2, f3, true);
                case 545586035:
                    str = "ۗ۟ۛۙۢ۠ۚۙۨۘۙۤ۫ۖۤۘۢۖۥۛۢۛ";
                    break;
                case 1621567665:
                    str = "ۖۧۚۜ۬ۧۦۥۘۘ۠۬ۖۦ۬ۘ";
                    break;
            }
        }
    }

    public PointF getDrawablePointFromTouchPoint(PointF pointF) {
        String str = "ۘ۟ۚۤ۟۬ۗۧۙۧۡۘ۫ۥۧۘ";
        while (true) {
            switch ((str.hashCode() ^ 701) ^ 1760939114) {
                case -1624211554:
                    return j(pointF.x, pointF.y, true);
                case -476411831:
                    str = "ۨ۫ۤۚۦۛۤۢۥۘۥ۬ۛۛ۬۬ۛۨۡۥۖۚۡۤۙ";
                    break;
                case 982628492:
                    str = "ۧۘ۟ۦۚۖۗ۬ۥۙ۠۟ۘۚۨۙ۬ۦۡۚ۬ۖۗۜۨ۠";
                    break;
            }
        }
    }

    public float getMaxZoom() {
        String str = "۫ۘۥۘۥۤۗۘ۟ۤۧۡۢۡۦۖۤۚ۫ۤۥۘۚ۟۬";
        while (true) {
            switch ((str.hashCode() ^ 472) ^ 1097861290) {
                case -1636011675:
                    str = "ۦۥ۠ۧۜۦۘۨۘۚۜۦۗۢۤۥۘۖۛۘۘۥۦ۟ۜۤۙۙۨۢ";
                    break;
                case -282646295:
                    return this.f589j;
            }
        }
    }

    public float getMinZoom() {
        String str = "ۙۦۛۖ۫ۧۨ۟ۦۘۛۥ۠۬ۤۜۘۡۜۥۘۥۖۨۘۨۡ۬";
        while (true) {
            switch ((str.hashCode() ^ 630) ^ 1924323808) {
                case -1003929278:
                    return this.f590k;
                case -336659087:
                    str = "ۨۤۜۘ۠ۢ۟۬ۦ۬۠ۤۨۘۙ۬ۡۧۗۢۤۨ۫۟ۨۧ۫ۡۦ";
                    break;
            }
        }
    }

    public final void h() {
        Matrix matrix = null;
        String str = "ۡۡۗۖۨۜۥۥۘۧۨۥۘۧۙۦۥۡۛۥۡۗۙۘۘ";
        while (true) {
            switch ((str.hashCode() ^ 373) ^ -790998560) {
                case -1677853598:
                    this.f595p = this.f601v;
                    str = "ۛۗ۠ۨ۟ۘۢ۠۬۠ۧ۟ۦۜۖۤ۠ۜ";
                    break;
                case -1561331886:
                    this.f596q = this.f602w;
                    str = "ۛۨۦۜۢۙۙۥۨۛۡۥۘۚ۫۬ۗ۠۠ۙۡۘ۟ۥۦ";
                    break;
                case -1137434789:
                    this.f592m = this.f586g;
                    str = "ۦۥۧۨۚۖۦۧۨۘ۬ۚۦۘۥ۟ۤ";
                    break;
                case -795275886:
                    matrix = this.f588i;
                    str = "۫ۗۛ۫ۗ۫۠ۦۛۜۢۙۧۢۦۘ۬۟۬ۢۦۖۘۡ۠ۥ";
                    break;
                case -33638437:
                    matrix.getValues(this.f582c);
                    str = "ۜۥ۫ۜ۠ۤۘۥۘۚ۬ۜۨۖۧۗ۠ۘۘ";
                    break;
                case 330281367:
                    String str2 = "ۚ۫ۛۛۢۜۧۢۦۢۤۡۘۨۛ۫ۡۙ۠۬ۜۥۦۖۦ";
                    while (true) {
                        switch (str2.hashCode() ^ 499249015) {
                            case -11381715:
                                str = "ۛۨۦۜۢۙۙۥۨۛۡۥۘۚ۫۬ۗ۠۠ۙۡۘ۟ۥۦ";
                                continue;
                            case 421926689:
                                str2 = "ۙۨۛۨۢۢۜۧۘۗۡۘۘۙۗۜۘ۠۟ۙۛ۬ۖۘۖۖۗ";
                                break;
                            case 860787709:
                                if (matrix == null) {
                                    str2 = "ۢۖۧۛۤۥۘۦۗۙۙۥۘۘۖۙۗۗۘۘۜۗۡۘ";
                                    break;
                                } else {
                                    str2 = "ۜۙ۬ۨۧۦۘ۟ۖۢۛۦۥۘۛۖۦ۠ۨۙۚ۫ۗۦۙ۠";
                                    break;
                                }
                            case 1716689384:
                                str = "ۡ۠ۦۛ۫ۛۚۢۛۚۗۗ۬ۨۛۜۗۘۥ۟ۘۜۛۡۘ۟ۧۡ";
                                continue;
                        }
                    }
                    break;
                case 669647144:
                    this.f593n = this.f587h;
                    str = "ۡ۫ۜۘ۫ۢۜۘۧۢ۬ۡۤۘۧۛۨ";
                    break;
                case 1241711511:
                    str = "ۘۚۛ۬ۛۙۗۙۡۜ۬ۦۥۛۚۨ۠ۥۘ";
                    break;
                case 1351676338:
                    return;
                case 1846571696:
                    this.f594o.setValues(this.f582c);
                    str = "ۦۧۧۜۗۙۚۢۖۘۨۙۡۗ۠ۡۘ";
                    break;
            }
        }
    }

    public final void i(Context context) {
        String str = "ۧۡۦۘۛ۠ۙۥۙۥۨۥۜۥۤۙۧ۠ۛۢۜۜۘ";
        while (true) {
            switch ((str.hashCode() ^ 575) ^ 438497684) {
                case -2027713728:
                    setOnTouchListener(new u0(this));
                    str = "ۧۚۢۥ۬ۖۤ۫ۗۦۜۛۧۜۘۘ";
                    break;
                case -1988861569:
                    super.setClickable(true);
                    str = "ۨۙۘۘۖۖ۟ۢۚ۫ۨۧۢۨۧۛ۠ۛۗۨ۠ۧ";
                    break;
                case -1903221229:
                    this.f589j = 3.0f;
                    str = "۟۬ۘ۫۟ۛۥۖ۬ۖۚۥۢ۬ۘۘ۫ۘۜۧۡۧۜۛۨۤۤۖ";
                    break;
                case -1810240850:
                    this.f584e = new ScaleGestureDetector(context, new t0(this));
                    str = "ۚ۟ۦۘۨۢ۫ۛۢۜۘۖ۬ۨۘۚۨۡۘۗۜ۠";
                    break;
                case -1563424738:
                    setImageMatrix(this.f588i);
                    str = "ۧ۟ۜۘۨ۠۠ۧ۟ۜۘۡۥۙۜۦۦۘۖۦۘ";
                    break;
                case -1561529938:
                    this.f588i = new Matrix();
                    str = "ۨۧ۫ۗۘۜۡۦۖۘ۫ۦۥۡ۫ۖۘ۬ۦۘۡۡۜۜ۫ۥۦ۠۟";
                    break;
                case -780880396:
                    setScaleType(ImageView.ScaleType.MATRIX);
                    str = "ۜۨۥ۠۠ۢۢۗۦ۟ۗۘۘۡۘۜ";
                    break;
                case -230129082:
                    this.f594o = new Matrix();
                    str = "ۦۙۚ۟ۥۥۘۗ۟ۢ۠ۘۛۖۤۙۘۜۥۙۗ";
                    break;
                case -186683947:
                    this.f590k = 1.0f;
                    str = "ۢۛۢۙۗۨۘۚۢۤۖۢۥ۠ۛۧ";
                    break;
                case 507734849:
                    str = "ۢۛۦۥۧۙۨۗ۫ۚۗۡۚۡ۟ۘۦۘۘ";
                    break;
                case 621417460:
                    this.f585f = true;
                    str = "ۚ۫ۘۘ۬ۡۜۙ۫ۛۧ۫ۤ۬ۗۘ۠ۛۧۡۘۘ";
                    break;
                case 685840892:
                    this.f600u = 0.75f;
                    str = "ۤۤۖۗ۟ۡۘۖۦۘۡ۟۬ۡ۟ۖۘۗ۬۬ۛۨ۫۬ۗۢۖ۟ۤ";
                    break;
                case 781324334:
                    setState(State.NONE);
                    str = "ۗۗۢۤ۬ۖۦ۫۟ۚۥ۫ۡۢۤۨۢۖ";
                    break;
                case 954023615:
                    str = "ۖۧ۟ۚۜۦۨۖۘۘ۟ۗۘۢۘۗۜۘۘۘۨۨۘۛۥ۫";
                    break;
                case 954471322:
                    this.f580a = context;
                    str = "۟ۜ۬ۡۤۡۘۨۤ۬۟ۖ۫ۜ۫ۡۡۨ۟۟ۖ۟۠۠۟۟ۧۥۘ";
                    break;
                case 1048160717:
                    this.f599t = 3.75f;
                    str = "ۥۧ۠ۡۖ۠ۙۜۢ۫ۤۧۖۙ";
                    break;
                case 1274105416:
                    this.f591l = 1.0f;
                    str = "ۦۖۧۘۜۘۛۢۤۥۘۧۧۢۨ۫ۦۘۥ۟۟ۥ۠ۚ";
                    break;
                case 1499955105:
                    return;
                case 1620004248:
                    this.f583d = new GestureDetector(context, new y(this));
                    str = "ۨۖۤۡۘ۠ۥۢۗ۫ۚۛۖ۟ۧۛۦۘۘ۠ۡ";
                    break;
                case 1900695126:
                    this.f582c = new float[9];
                    str = "ۦۨۦۘۤۗۨۘۧۡۧۥۖ۫۟ۧ۬۫ۛۤۡۖۛ۬ۙۙۦۡۘ";
                    break;
            }
        }
    }

    public final PointF j(float f2, float f3, boolean z2) {
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        float f7 = 0.0f;
        float f8 = 0.0f;
        float f9 = 0.0f;
        float f10 = 0.0f;
        float f11 = 0.0f;
        String str = "ۡۛۦ۫ۗۦۘ۠ۖۨۨۢۡۛ۬ۨۘ";
        while (true) {
            switch ((str.hashCode() ^ 359) ^ -1248577390) {
                case -1528831643:
                    this.f588i.getValues(this.f582c);
                    str = "ۗۜۜۘۥ۬ۦۜۜۧۜۖۧ۫ۚۥۘۗ۟۠۬۟ۨ";
                    break;
                case -1393463428:
                    str = "۠ۜۦۘۛۘۡ۫۬ۜۘۖ۬ۤ۟ۡۦۘۥۧۖۘ";
                    f10 = f7;
                    break;
                case -1336979274:
                    f4 = (float) getDrawable().getIntrinsicWidth();
                    str = "۟۬۠ۖۚۦۘۘۛۙ۟ۤۡۛۖۘۘ۠ۙ۫۫۫ۡ۬۬ۚ۟ۛ۬";
                    break;
                case -1285871212:
                    str = "ۚۜۧۧ۬ۗۘۖۚۜۢۤ۬ۤ۫ۦۘۡۘۗۙۛۜۖۖ";
                    break;
                case -1203079766:
                    f9 = Math.min(Math.max(f3, 0.0f), f5);
                    str = "ۢ۠ۜۙ۫۬۟۬ۡۘۦۗۗۜۢۖ";
                    break;
                case -1114129515:
                    str = "ۡۜۖۘ۫۬ۥ۠ۡۜۜۤۡۘۚ۟";
                    break;
                case -410486099:
                    str = "ۙۜۚۗۘۦۛۢۡۘۦۗۖۤۢۘۘ";
                    break;
                case -23213473:
                    str = "ۚۛۖۗۙۖۢۧۙۦ۫ۘۚ۬ۖۘ";
                    f10 = f9;
                    break;
                case 140558003:
                    f8 = Math.min(Math.max(f2, 0.0f), f4);
                    str = "ۗۛ۬ۦ۬ۘۚ۬۠ۛۦۦ۫ۢۜۘۛ۬ۜ۠ۢۢ۬ۦۘ";
                    break;
                case 286535495:
                    str = "ۧۤ۟ۥۦۤ۬ۦ۠ۛۖۥۘ۫ۖۧۧ۠ۛۛۦۧ۟ۦۢۡۛۗ";
                    f11 = f8;
                    break;
                case 536795728:
                    return new PointF(f11, f10);
                case 620376507:
                    f6 = ((f2 - this.f582c[2]) * f4) / getImageWidth();
                    str = "ۗۙۨۘۙۖۗۖ۫ۗۤۚۗ۬ۖۤۧۗۖۢۛ۬ۖۤۥۗۘ";
                    break;
                case 671243821:
                    f7 = ((f3 - this.f582c[5]) * f5) / getImageHeight();
                    str = "ۡۦۢۜۛۨۜۨۧۘۖۙۘ۠۟۫";
                    break;
                case 723570842:
                    f5 = (float) getDrawable().getIntrinsicHeight();
                    str = "ۜۢ۫۬ۦۤ۬ۙۜ۫ۗۨۧ۬ۢۨۦۥۗۗۢ۠ۨ";
                    break;
                case 934735138:
                    str = "۠ۧۖۛ۠ۜۘۚۛ۠ۜۥۖۘۛۨۧۘۗۚۜۘۙۡۧ۠۫ۤۢۜ۬";
                    break;
                case 1195859029:
                    str = "ۚۡۦۘۖۜۡۧۢ۟۫ۚ۫ۨۘۜۛ۫ۤ۫";
                    f11 = f6;
                    break;
                case 1521717862:
                    String str2 = "ۧۨۜۗۚۡۜۥۥۘۖۗۨۢۙ۠ۡ۫ۛۤۡۤۥۥۥۚۧۥۘ";
                    while (true) {
                        switch (str2.hashCode() ^ -389200377) {
                            case -1090837155:
                                str2 = "ۛۨۥۘۗۛۜۘۗۨۦۘۢۗۦۘ۬ۨۨۤ۫ۖۘۛۥۗۜۗۖۘ";
                                break;
                            case 366840760:
                                str = "ۨ۠ۦۘۡۦۥۦۘۧۛۥۢۤۜۘۘۨۙۨ۫ۚۛ";
                                continue;
                            case 1616535913:
                                if (!z2) {
                                    str2 = "ۨ۠ۢ۟ۙۤۡۡۧۙۦۥۘ۠ۡۨۘۡ۠ۢۙۗۛۛۤ۬";
                                    break;
                                } else {
                                    str2 = "ۤۧۘۨۡۘ۟۠ۤ۬ۨۚۛۗۛ";
                                    break;
                                }
                            case 2065274262:
                                str = "ۧۤ۟ۥۦۤ۬ۦ۠ۛۖۥۘ۫ۖۧۧ۠ۛۛۦۧ۟ۦۢۡۛۗ";
                                continue;
                        }
                    }
                    break;
            }
        }
    }

    public final void k(int i2, float f2, float f3, float f4, int i3, int i4, int i5) {
        float f5 = 0.0f;
        float[] fArr = null;
        float[] fArr2 = null;
        float f6 = 0.0f;
        String str = "۠۬ۜۘ۫ۗۗۢۚۙۛۤۙۗۦۘ۬۠ۡ";
        while (true) {
            switch ((str.hashCode() ^ 982) ^ -556139908) {
                case -2134896385:
                    this.f582c[i2] = -((f4 - f5) * 0.5f);
                    str = "ۥۙۖۘۥ۟۬ۤ۠ۖۘۙۧۜ۠ۦۘۦۖۜۘۚۢۘ۫ۗۖۘ";
                    break;
                case -1874205383:
                    str = "ۚۢۢ۫ۗۥۘۧۨۦۘۥۖۦۘۤۙۦۘۨۜۥۘۚۡۙ";
                    break;
                case -1781254825:
                    f5 = (float) i4;
                    str = "ۦ۫ۘۘ۫ۘۛ۫ۢۥۧۛۨۖۚۥ۠۫ۖ";
                    break;
                case -1748655425:
                    str = "ۤ۫ۥۘۤۡۤۖۦۧۥۦۨۜۢۧۛۚ";
                    break;
                case -1449653143:
                    str = "ۗۢۜ۠ۖۘۘۢ۬ۘۙۚ۬ۨ۫ۨۡ۠ۜۘۧۧۘ۟۬ۡۘ۫ۚ۬";
                    break;
                case -1167610760:
                    f6 = Math.abs(f2);
                    str = "ۘۜۢۨۡۥۘۤ۟ۡۜ۠ۛۤ۟ۦۘۢۚۨۘۗۛۡۥۜۘۘ";
                    break;
                case -1060739668:
                    str = "ۥ۟ۧ۟ۙۚۙ۫۫ۙۖۡۥ۟ۖۘۜۦۨۘۤ۟ۜۘ";
                    break;
                case -939086274:
                case -272473153:
                    str = "ۥۘ۫ۚۡۤۨۧۜ۬۫ۨۖ";
                    break;
                case -925238225:
                    return;
                case -606730472:
                    String str2 = "۫ۨ۫ۦۖۘۘۡ۟ۥ۫ۥ۟ۘۡ";
                    while (true) {
                        switch (str2.hashCode() ^ -1616971667) {
                            case -1511887070:
                                str = "ۘۤۨۘ۫ۦۦ۟۬ۖۢۘۘ۫ۤ۠";
                                continue;
                            case -1362623448:
                                if (f2 <= 0.0f) {
                                    str2 = "ۗ۟ۜۦۡۖۘۖ۬ۨۛۘۢۦۡ۬ۚۤۥۘۥۦ۬۬ۥۘۜۖۧ";
                                    break;
                                } else {
                                    str2 = "۟ۦۤ۟۫۟ۗ۠ۚۗۢ۬ۖۛۚۙ";
                                    break;
                                }
                            case -1354764537:
                                str2 = "ۘۤۖۘۧ۫ۡۥ۟ۧۡ۠ۜۘۡۡ۬ۧۜۦۘ";
                                break;
                            case 674198455:
                                str = "ۦۦۗۖۧۜۘۢۡۦۛۗۖ۫ۧۧۥۨ۬ۤۡۥۦۦۖۘ۟۟";
                                continue;
                        }
                    }
                    break;
                case -501298292:
                    str = "ۢۢۨۚ۫ۥ۟ۢ۫ۗۤۦ۫ۛۦ۟ۢ۫ۛۗۢ۫ۛۨۡۥ";
                    break;
                case -415857259:
                    fArr2 = this.f582c;
                    str = "ۛۖۨ۬ۧ۫ۤ۟ۥۘۙۤۖۧ۟ۖۚۖۦۘ";
                    break;
                case -12716941:
                    String str3 = "ۤۥۘ۟ۘۧۘۛ۫ۥۘۢ۟ۗ۟ۥۖۘۚۦۖ";
                    while (true) {
                        switch (str3.hashCode() ^ 243402484) {
                            case -1377375252:
                                str = "ۜۛۜۘۚۢۥۘ۬۠ۥۥۦۥۘۗۨۖۜۢ۠ۗۥ";
                                continue;
                            case -1128886856:
                                if (f4 >= f5) {
                                    str3 = "ۥۙۧۢ۠۠ۖ۫ۢ۬ۧۙۧۨۡۘ";
                                    break;
                                } else {
                                    str3 = "ۧ۬ۜۘ۬ۖۦۘۗۙۜۛ۫۬ۛۗۛ";
                                    break;
                                }
                            case 1055802836:
                                str3 = "ۨ۟ۡۗۘۧۚۧۡۘ۬ۤۜۘۥۤۥۘ";
                                break;
                            case 1427582290:
                                str = "ۖۛۨۘۤ۫ۡۘۙ۬۠ۡۖۦۢۚۡۘۗ۠ۘ";
                                continue;
                        }
                    }
                    break;
                case 260426243:
                    fArr = this.f582c;
                    str = "ۧ۫ۡۜ۬ۖۗ۫۟۫ۨۚۡۧۥۘۘ۬۬ۦۡۛۦۨۦۘۛۘۘ";
                    break;
                case 691428156:
                    str = "ۡ۟ۡۘۚۖۖۘۢۨۤۖ۬ۖۘۚۦ۟ۖۘۘ";
                    break;
                case 1318335873:
                    str = "ۗۨۘۘۚۦۡۘۢۡ۠۠ۖۦۘۘۗۛۡۛۧ";
                    break;
                case 1554482670:
                    fArr2[i2] = -(((((((float) i3) * 0.5f) + f6) / f3) * f4) - (0.5f * f5));
                    str = "ۥۘ۫ۚۡۤۨۧۜ۬۫ۨۖ";
                    break;
                case 1758473249:
                    fArr[i2] = (f5 - (((float) i5) * fArr[0])) * 0.5f;
                    str = "۟ۤۖ۬ۘۚۨۢۗۨۙۥۘۙۜ۬ۥۦۛ";
                    break;
                case 1922180527:
                    str = "۬ۧۡۢۨ۫ۡۨۢۨۛۜۛۡ";
                    break;
            }
        }
    }

    public void maintainZoomAfterSetImage(boolean z2) {
        String str = "ۖۙۘۘۘۧۘ۟ۛۜۥ۫ۧ۠ۨۧۘ۫ۧۦ";
        while (true) {
            switch ((str.hashCode() ^ 423) ^ 1279244644) {
                case -1837740461:
                    this.f585f = z2;
                    str = "ۚۚۗ۠۬ۨۘ۫ۙۡ۠ۥۜۨۛۨۘ";
                    break;
                case -1175006947:
                    str = "ۛۢۛۡۦۛ۬ۚۧۧۥۖۧۥۧۘ";
                    break;
                case -880216279:
                    str = "ۗۜۖۘۚۨۡۘۢ۠ۙۚۦۡۘۤۧۜۙۡۤۧۘۡۜۙۖ";
                    break;
                case 272297081:
                    return;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r19, int r20) {
        /*
            r18 = this;
            r14 = 0
            r11 = 0
            r6 = 0
            r9 = 0
            r13 = 0
            r4 = 0
            r12 = 0
            r8 = 0
            r7 = 0
            r10 = 0
            r3 = 0
            r2 = 0
            r5 = 0
            java.lang.String r1 = "ۥۛۡۤۡۧۘۧۗۦۜۚۥۘۦۚۥۘۧ۬ۙۦ۟ۗ۟ۛۛ۫ۚۤ"
        L_0x000f:
            int r15 = r1.hashCode()
            r16 = 592(0x250, float:8.3E-43)
            r17 = 1942781925(0x73cc7fe5, float:3.2404253E31)
            r15 = r15 ^ r16
            r15 = r15 ^ r17
            switch(r15) {
                case -2104585304: goto L_0x01b6;
                case -2099007241: goto L_0x00b7;
                case -2024086235: goto L_0x017e;
                case -1830179810: goto L_0x0097;
                case -1805577408: goto L_0x0020;
                case -1698915298: goto L_0x01b2;
                case -1676236467: goto L_0x0183;
                case -1445385533: goto L_0x004d;
                case -1407982039: goto L_0x018b;
                case -1309065041: goto L_0x0171;
                case -1171178517: goto L_0x0119;
                case -1146388320: goto L_0x01ba;
                case -1030838876: goto L_0x00af;
                case -802937148: goto L_0x0029;
                case -760965670: goto L_0x016c;
                case -615522631: goto L_0x0198;
                case -471079916: goto L_0x0145;
                case -340494349: goto L_0x014a;
                case -238619119: goto L_0x0121;
                case -223615977: goto L_0x0030;
                case 233678129: goto L_0x0176;
                case 234247565: goto L_0x008f;
                case 481433338: goto L_0x00e4;
                case 545838574: goto L_0x00bf;
                case 569843380: goto L_0x00df;
                case 628709454: goto L_0x0102;
                case 792664867: goto L_0x0107;
                case 816032153: goto L_0x0114;
                case 892782607: goto L_0x010c;
                case 906748932: goto L_0x0023;
                case 1129778813: goto L_0x0026;
                case 1267977315: goto L_0x009f;
                case 1329759615: goto L_0x01ba;
                case 1464333285: goto L_0x006e;
                case 1464596820: goto L_0x00a7;
                case 1968634705: goto L_0x0159;
                case 1975004820: goto L_0x019f;
                default: goto L_0x001f;
            }
        L_0x001f:
            goto L_0x000f
        L_0x0020:
            java.lang.String r1 = "ۦۚۨۥ۠ۘۖۡۘۘۗۧۘ۬ۙۚۙۡۨۘ"
            goto L_0x000f
        L_0x0023:
            java.lang.String r1 = "ۙۧۨۘۛ۬ۦۘۨۨ۬ۜۧۡۘ۠ۢۗ"
            goto L_0x000f
        L_0x0026:
            java.lang.String r1 = "ۜ۟ۡۤۨۙۙۥۦۚۢۛۢۡۡۛۗ۟"
            goto L_0x000f
        L_0x0029:
            android.graphics.drawable.Drawable r14 = r18.getDrawable()
            java.lang.String r1 = "ۢۘ۬ۢۨۥۘۦۛۢۗۖ۫ۨۘۜۢۥۥۘۖ"
            goto L_0x000f
        L_0x0030:
            r15 = -1917727665(0xffffffff8db1cc4f, float:-1.0957653E-30)
            java.lang.String r1 = "ۚۗۦۛۛۘۢۧۥۖۡۤ۫ۛۗۛۧۖۘ۠ۧۘۘۥۡۥۘۘۡۖ"
        L_0x0035:
            int r16 = r1.hashCode()
            r16 = r16 ^ r15
            switch(r16) {
                case -1316511476: goto L_0x003f;
                case 509094693: goto L_0x0045;
                case 1503891649: goto L_0x004a;
                case 1910450207: goto L_0x01b6;
                default: goto L_0x003e;
            }
        L_0x003e:
            goto L_0x0035
        L_0x003f:
            java.lang.String r1 = "ۢۗۖۦۗۜۘۥ۠ۨۧۥۖۘۘۡ۟ۜۛ"
            goto L_0x000f
        L_0x0042:
            java.lang.String r1 = "ۘ۬ۦۘۜۡۨۗ۟۟ۜۥۦۘۜۢ۬ۜۖۘۘۧ۠ۖۘۧۗۦ"
            goto L_0x0035
        L_0x0045:
            if (r14 == 0) goto L_0x0042
            java.lang.String r1 = "ۜۛۥۘۗۗۦۖۖۥۘۤۜۘۘۚۙۨۘۛۗۚۗۖۖۘۡۘۖ"
            goto L_0x0035
        L_0x004a:
            java.lang.String r1 = "۫۫ۨۘۡۥۨۘۤۤۘۜۖ۠ۥۥۙۥۗۘۗۢۛۢۜ۟۟ۧ۟"
            goto L_0x0035
        L_0x004d:
            r15 = -1129276794(0xffffffffbcb09a86, float:-0.021558058)
            java.lang.String r1 = "ۛۨۤ۬ۖۡۘ۟ۙۘۙۨۙۤۛۖۘ"
        L_0x0052:
            int r16 = r1.hashCode()
            r16 = r16 ^ r15
            switch(r16) {
                case -568115093: goto L_0x0068;
                case 1355846171: goto L_0x005c;
                case 1544226304: goto L_0x006b;
                case 1911890565: goto L_0x01b6;
                default: goto L_0x005b;
            }
        L_0x005b:
            goto L_0x0052
        L_0x005c:
            int r1 = r14.getIntrinsicWidth()
            if (r1 == 0) goto L_0x0065
            java.lang.String r1 = "ۚۖۦ۫۬ۢ۠ۚۨ۠ۖۘۘۡۨۤۛۦۚۘ۠ۜۧۥۥۖۚۡۘ"
            goto L_0x0052
        L_0x0065:
            java.lang.String r1 = "ۛ۫۫ۖۙۤۚۢۛ۫ۜۗۦ۫ۦۘۜۙۢۥۨۛ"
            goto L_0x0052
        L_0x0068:
            java.lang.String r1 = "ۢ۟۫ۛۖۘ۠۠ۥ۠ۢ۟ۚۜۖۙۥ۠ۢ۬ۡۧۜ۫"
            goto L_0x0052
        L_0x006b:
            java.lang.String r1 = "ۚ۬ۛۦۨۢ۟ۚۖۨ۬ۡۧ۫ۙ۫ۤۨۘۦۚۡۘ"
            goto L_0x000f
        L_0x006e:
            r15 = -992501803(0xffffffffc4d79fd5, float:-1724.9948)
            java.lang.String r1 = "ۡۨۘۙۨۡۘ۠ۥۡۚۤۖۨۙ"
        L_0x0073:
            int r16 = r1.hashCode()
            r16 = r16 ^ r15
            switch(r16) {
                case -1213747315: goto L_0x0083;
                case -658845329: goto L_0x008c;
                case 876109423: goto L_0x007d;
                case 1836185351: goto L_0x01aa;
                default: goto L_0x007c;
            }
        L_0x007c:
            goto L_0x0073
        L_0x007d:
            java.lang.String r1 = "ۘۜۜۡۨۨۘ۠ۗ۠ۖ۠ۦۘۚۥۙ۠ۖۨۘۛۘۖۖۘۜ۠ۥۡ"
            goto L_0x000f
        L_0x0080:
            java.lang.String r1 = "ۨۥۙۧۗۚ۠ۘۤۛۜۖۧۡۧۘۘۤ۠ۛۗۗۢۚۘۜ۫ۘ"
            goto L_0x0073
        L_0x0083:
            int r1 = r14.getIntrinsicHeight()
            if (r1 != 0) goto L_0x0080
            java.lang.String r1 = "۠ۜۘۘ۟ۜۢۜۨۗۦۗۜۢۡۦۘ"
            goto L_0x0073
        L_0x008c:
            java.lang.String r1 = "۠ۗۖۘۛۛۧۜۥۚۥۛۖۥۢ"
            goto L_0x0073
        L_0x008f:
            int r11 = r14.getIntrinsicWidth()
            java.lang.String r1 = "ۧۥۦۘۜ۫ۖۥ۟ۢۗۡۥۡۙۤۜۡۖۘۥۙۘۥۚۦۚۘ۟"
            goto L_0x000f
        L_0x0097:
            int r6 = r14.getIntrinsicHeight()
            java.lang.String r1 = "۬۠۟ۢۤۗ۬ۛۙۙۡ۬ۜۚۚۤۖ۠"
            goto L_0x000f
        L_0x009f:
            int r9 = android.view.View.MeasureSpec.getSize(r19)
            java.lang.String r1 = "ۢۡۡۘۥۜۤۡ۟ۨۢۦۘۙ۟۟۟ۖۤۙۧۙ۟ۧ۟"
            goto L_0x000f
        L_0x00a7:
            int r13 = android.view.View.MeasureSpec.getMode(r19)
            java.lang.String r1 = "۠۠۫۬ۡۗ۬۠ۘۘۜۥۨۘۙۦ"
            goto L_0x000f
        L_0x00af:
            int r4 = android.view.View.MeasureSpec.getSize(r20)
            java.lang.String r1 = "ۜۡۡۘۛۖ۫ۗ۫۠ۥ۟ۨۘۢۖۧۙۚ۠ۤ۠ۖ۬ۡۜۦ۫ۢ"
            goto L_0x000f
        L_0x00b7:
            int r12 = android.view.View.MeasureSpec.getMode(r20)
            java.lang.String r1 = "ۦۛۙۘۖۦۘۙۙۜۘۨۜۡۘۚ۫ۙۨ۫ۖۥۢۖۗ۫ۢ"
            goto L_0x000f
        L_0x00bf:
            r15 = -618971133(0xffffffffdb1b4003, float:-4.3699003E16)
            java.lang.String r1 = "ۢۡۥۘۦۗ۬ۘۙۤۗۤۖۛ۫۟"
        L_0x00c4:
            int r16 = r1.hashCode()
            r16 = r16 ^ r15
            switch(r16) {
                case -1957175111: goto L_0x01ae;
                case -933567358: goto L_0x00ce;
                case -466729693: goto L_0x00d4;
                case 1439959575: goto L_0x00db;
                default: goto L_0x00cd;
            }
        L_0x00cd:
            goto L_0x00c4
        L_0x00ce:
            java.lang.String r1 = "ۙ۟ۡۘۚۧۢۚ۠ۙۙۖۗ۬ۤ۫ۥۙۖۖ۬ۘۜ۠۬"
            goto L_0x00c4
        L_0x00d1:
            java.lang.String r1 = "ۤ۬ۜۘ۫ۛۤۨ۬ۘۘۗ۠ۗ۫۫۠ۖۜۘۘۙۖۧۘ"
            goto L_0x00c4
        L_0x00d4:
            r1 = -1342177280(0xffffffffb0000000, float:-4.656613E-10)
            if (r13 == r1) goto L_0x00d1
            java.lang.String r1 = "ۤ۬۠ۜ۠ۖۘ۠ۤۨۘۙۚۦ۬ۚۘۘ"
            goto L_0x00c4
        L_0x00db:
            java.lang.String r1 = "۬ۡۡۘ۠ۚۨۖۜ۟ۤۘۢۛۨ۠ۢۤۜۘۧ۫ۙۜۥۥ"
            goto L_0x000f
        L_0x00df:
            java.lang.String r1 = "ۧۘۡۘ۬ۧۡۛ۟ۡۖۦۡۘۡۚۨۘ"
            r10 = r11
            goto L_0x000f
        L_0x00e4:
            r15 = -649744755(0xffffffffd945ae8d, float:-3.47765569E15)
            java.lang.String r1 = "۬۠۬۟ۙ۠۠۫ۘۘۖۢۤۛ۟۠ۜ۫ۘۘۦۥۥ"
        L_0x00e9:
            int r16 = r1.hashCode()
            r16 = r16 ^ r15
            switch(r16) {
                case 1257499092: goto L_0x00ff;
                case 1263263074: goto L_0x01b2;
                case 1725225591: goto L_0x00fa;
                case 1735309325: goto L_0x00f3;
                default: goto L_0x00f2;
            }
        L_0x00f2:
            goto L_0x00e9
        L_0x00f3:
            java.lang.String r1 = "ۖۛ۫ۤۨۧۖۦۢۖ۠ۘۙۙۖۘ"
            goto L_0x000f
        L_0x00f7:
            java.lang.String r1 = "ۜۘۧۘ۠۬ۤۢۜ۠۫۟ۘ۟ۦ۬۫ۤۤ"
            goto L_0x00e9
        L_0x00fa:
            if (r13 == 0) goto L_0x00f7
            java.lang.String r1 = "ۥۡۜۘۢۢۜۘۢۙۥۚ۬۠ۛۦۢۘ۬۠ۡۧۘۚ۠ۨ"
            goto L_0x00e9
        L_0x00ff:
            java.lang.String r1 = "ۗ۫ۨۚۦۘۛۛۘۘۜ۬ۖۘۜۚ۫ۡۗۙ"
            goto L_0x00e9
        L_0x0102:
            java.lang.String r1 = "ۥۦ۠ۙۤۤ۠۬ۘ۫۟ۦۘۢۥۧۘ۫ۡۜۚۛۦۡۥۥ"
            r8 = r9
            goto L_0x000f
        L_0x0107:
            java.lang.String r1 = "ۚۜۡۖ۫ۜۘۖۛۘۜۢ۬۫ۤۚۧۖۘۢۥۙ"
            r10 = r8
            goto L_0x000f
        L_0x010c:
            int r7 = java.lang.Math.min(r11, r9)
            java.lang.String r1 = "۫ۙ۬ۢ۠۫۠۠ۢۗۨۘۘ۬ۦۥۘۖۡۡۘ۟۬۬"
            goto L_0x000f
        L_0x0114:
            java.lang.String r1 = "ۡۧۧۤۗۢۤۙۥۘۥۗۚ۠ۘۨ"
            r10 = r7
            goto L_0x000f
        L_0x0119:
            r0 = r18
            r0.f602w = r10
            java.lang.String r1 = "ۧۙۥۘۥۜۤۛۘۖۘۙۧۛۨۡۘۙۚ۫ۖۘۧۘ"
            goto L_0x000f
        L_0x0121:
            r15 = -623840452(0xffffffffdad0f33c, float:-2.94071171E16)
            java.lang.String r1 = "ۙۘۘۘۘۡۙ۫۟ۖۧ۠ۧۥۚۛۡۦۥۖۥۜۗ۬ۜ"
        L_0x0126:
            int r16 = r1.hashCode()
            r16 = r16 ^ r15
            switch(r16) {
                case -1474715910: goto L_0x0130;
                case -1196974278: goto L_0x013e;
                case 396246445: goto L_0x0137;
                case 690924625: goto L_0x0141;
                default: goto L_0x012f;
            }
        L_0x012f:
            goto L_0x0126
        L_0x0130:
            java.lang.String r1 = "ۢۚۨۚۡۨۡۢۦۗۡۛۗۙ۟ۖۥۘۤۗۧۡۗۥ"
            goto L_0x000f
        L_0x0134:
            java.lang.String r1 = "ۘۘۥۛۡ۟ۥۡۦۘۗۘۘۦۗ"
            goto L_0x0126
        L_0x0137:
            r1 = -1342177280(0xffffffffb0000000, float:-4.656613E-10)
            if (r12 == r1) goto L_0x0134
            java.lang.String r1 = "ۧۨ۟ۚۨ۟ۡۢۢۢۜۡۦۤۙۤۨ۬"
            goto L_0x0126
        L_0x013e:
            java.lang.String r1 = "ۛ۬ۢۚۛۘ۠ۖ۫ۙۨۧۘۛۜۘۘۙ۬۠ۜ۬۬ۚۜۨۘۖۗ۟"
            goto L_0x0126
        L_0x0141:
            java.lang.String r1 = "ۖۜۨۡۛۨۘۢۤۥ۫ۧۗ۫ۘۨۘ"
            goto L_0x000f
        L_0x0145:
            java.lang.String r1 = "ۥ۬ۧۥۜ۫۫۟ۚ۟ۜۘ۬ۗۚ"
            r5 = r6
            goto L_0x000f
        L_0x014a:
            r15 = -482292702(0xffffffffe340cc22, float:-3.5564842E21)
            java.lang.String r1 = "ۖ۫ۖۘ۫ۡۖۗۡۜۧ۠ۜ۫ۙۖۥ۫ۡۨۖۢۜۖ۟"
        L_0x014f:
            int r16 = r1.hashCode()
            r16 = r16 ^ r15
            switch(r16) {
                case -1331984297: goto L_0x0159;
                case -1293934996: goto L_0x0168;
                case -697636618: goto L_0x0165;
                case 1315332220: goto L_0x0160;
                default: goto L_0x0158;
            }
        L_0x0158:
            goto L_0x014f
        L_0x0159:
            java.lang.String r1 = "ۖۙۘۡۧۘۛ۫ۡۨۙۖۖۢ۫ۛ۬ۗۥۙۤ"
            goto L_0x000f
        L_0x015d:
            java.lang.String r1 = "ۘۡ۫۫۟۫ۢ۟ۘۨۤۡۙۛۦ۬ۚۖۘ"
            goto L_0x014f
        L_0x0160:
            if (r12 == 0) goto L_0x015d
            java.lang.String r1 = "۟۬ۡۡۦۤۦۗۥ۠ۙۨۘۢ۠ۜۘ۠"
            goto L_0x014f
        L_0x0165:
            java.lang.String r1 = "ۚ۬۬ۚۘۖۘۥۙۨۘۧۥۥۦۧۡۗۜۦۘ"
            goto L_0x014f
        L_0x0168:
            java.lang.String r1 = "۟۫ۜۨ۠ۨۘۧۘۡۘۗۧ۬۫۬ۢۘۜۥۘۘۜۧۘۧۨۡ"
            goto L_0x000f
        L_0x016c:
            java.lang.String r1 = "ۙۘۜۘ۠ۙۜۙۘۗۛۥۡۤۥۗۜۢۗ۠ۜۘ"
            r3 = r4
            goto L_0x000f
        L_0x0171:
            java.lang.String r1 = "۫۠ۙۜۡ۫۟۬ۥۘۙۗۖۚۧۧ"
            r5 = r3
            goto L_0x000f
        L_0x0176:
            int r2 = java.lang.Math.min(r6, r4)
            java.lang.String r1 = "۬ۧ۠ۛۗ۫ۚۘۢۛۖۤ۫ۨ۫ۖۗۘۘۙ۫ۦ۫۠ۖۘۛ"
            goto L_0x000f
        L_0x017e:
            java.lang.String r1 = "ۖۙۘۡۧۘۛ۫ۡۨۙۖۖۢ۫ۛ۬ۗۥۙۤ"
            r5 = r2
            goto L_0x000f
        L_0x0183:
            r0 = r18
            r0.f601v = r5
            java.lang.String r1 = "ۗۖۘۥۨۥۘ۟۫ۘۨۦۥۡ۟ۖۚۢۦۘۢۥۧ۫ۙۦۘ"
            goto L_0x000f
        L_0x018b:
            r0 = r18
            int r1 = r0.f602w
            r0 = r18
            r0.setMeasuredDimension(r1, r5)
            java.lang.String r1 = "۟ۚ۟ۙ۠ۧ۫۬ۨۦۡۤ۫ۘۡۘۧۙۥۘۘ۟ۚ"
            goto L_0x000f
        L_0x0198:
            r18.f()
            java.lang.String r1 = "۬ۚۡۘۙۚۨۘۦۖ۟ۡۤۡۘ۠ۢۘۘ"
            goto L_0x000f
        L_0x019f:
            r1 = 0
            r15 = 0
            r0 = r18
            r0.setMeasuredDimension(r1, r15)
            java.lang.String r1 = "ۡۥۜۘۜۙۦۘۗۖۨۘ۫ۖۘۖ۟ۢ"
            goto L_0x000f
        L_0x01aa:
            java.lang.String r1 = "ۛۜۥۘۙۗۘۘۨۗۥۘۡۧۥ۠۬ۙۖۚۜ۬ۘۘۘۘ۟ۡ"
            goto L_0x000f
        L_0x01ae:
            java.lang.String r1 = "ۘۦۘ۠ۧ۟ۚۜۘۢۨۨۘۜۨۨۘۢۦۜ۫ۘ۫ۙۡۢ"
            goto L_0x000f
        L_0x01b2:
            java.lang.String r1 = "ۡۧۧۤۗۢۤۙۥۘۥۗۚ۠ۘۨ"
            goto L_0x000f
        L_0x01b6:
            java.lang.String r1 = "ۡ۫ۜۘۙۗۡۖ۬ۘۥۘۢ۠۟ۢۖۤۦۚۜۥۢۤۧ"
            goto L_0x000f
        L_0x01ba:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.TouchImageView.onMeasure(int, int):void");
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        String str = "ۜۢۜۘ۠۠ۖۥ۠ۖۨۦۘ۟ۦۜ۟ۥ۟";
        float[] fArr = null;
        Bundle bundle = null;
        while (true) {
            switch ((str.hashCode() ^ 790) ^ -129573852) {
                case -1889324178:
                    this.f592m = bundle.getFloat("matchViewHeight");
                    str = "ۙۡۘۘۚۜۗۨۖۧۚۥۘ۠ۧۥۘ۬ۦ۬ۜۚۖۘۙۨۡۖۧ۬";
                    break;
                case -1305948470:
                    this.f591l = bundle.getFloat("saveScale");
                    str = "ۙۡ۟ۚ۫ۧۛۛۚۚ۠۫ۖ۬ۡۘ";
                    break;
                case -1185847200:
                case -642420976:
                    return;
                case -1166031291:
                    fArr = bundle.getFloatArray("matrix");
                    str = "۠ۧۦۨۗۗۛۗۜۖۙۛۗۜۜۘ۬ۨۖۧۡۘ۫ۘۨۘۧۨۥۘ";
                    break;
                case -846599061:
                    this.f596q = bundle.getInt("viewWidth");
                    str = "۫ۜ۟۬ۥۡۗ۠ۖۘ۟ۛۘۘۛۢۨۙۘۙۥۘ";
                    break;
                case -649632379:
                    str = "ۛۗۘۘۜۧۨۘۚۖ۠ۤۙۙ۬ۡۜۘۙۢۤ۫ۘ۠";
                    break;
                case 482433601:
                    super.onRestoreInstanceState(parcelable);
                    str = "ۛۡۡۢۥۖۛۧۦۘۤۜۘۘۦۙۡۘۧۙۦۘ۟ۜۧۘ۟ۙۦ";
                    break;
                case 606209286:
                    this.f594o.setValues(fArr);
                    str = "۠۬ۤۗۨۛۢۛۜۘۚۡۧۘۛۖۦ۬ۘۨۢۥۤ۟ۥۙۘۖۜ";
                    break;
                case 674826450:
                    str = "۟ۜ۫ۙۗۙ۬ۥۖۘ۠ۨۨۘۖۘ";
                    break;
                case 757809663:
                    super.onRestoreInstanceState(bundle.getParcelable("instanceState"));
                    str = "ۥۢۜۘۖۨۘۘۥۢۘ۫ۙۖۘۜۢۢۗ۫ۜۘۚ۫ۙۧۤۢۛ";
                    break;
                case 926034839:
                    str = "ۜۖۦۘۨۤۜۘۖۘۥۖۨ۬ۜ۫ۧۢۧۘۘۢۤۜ";
                    bundle = (Bundle) parcelable;
                    break;
                case 1353605458:
                    this.f593n = bundle.getFloat("matchViewWidth");
                    str = "ۜۙۨۖۨۧۘۦۖ۬ۛ۫ۙ۠ۥۥۥ۫ۧۙۚۙ";
                    break;
                case 1365105765:
                    this.f582c = fArr;
                    str = "ۢۗۥ۫ۡ۠ۦۖۖۢۜۚۚۧۙۛۢۗۚۘۙ۬ۗۘۘۢ";
                    break;
                case 1437786224:
                    String str2 = "ۜۛ۫ۜۚۜۘۖۛۦۛۡۦۘۚۗۡۘ";
                    while (true) {
                        switch (str2.hashCode() ^ -1380136650) {
                            case -100758822:
                                str2 = "ۜۘۖۨۡۦۛۜۗۚۖۨۢ۬ۛۗۧۨۘۖۗۜۘۢۧۖ";
                                break;
                            case 571168954:
                                str = "ۖۢ۟۠ۥ۬ۥۙۦۙۨۖۗ۫ۖۘۥۢۖۘۧۚۗۧۦ";
                                continue;
                            case 1114736007:
                                str = "ۖۥۘۘۙۛۗ۠ۚۦۘ۠ۜۘۢۥ۫۟ۧۥۘۜۥۧۘ";
                                continue;
                            case 1589589201:
                                if (!(parcelable instanceof Bundle)) {
                                    str2 = "ۗۡۘۘۙۙۡۜۦۜ۬۟ۤۗۖۡۨۛ۠ۛ۫";
                                    break;
                                } else {
                                    str2 = "۠ۙۤۥۢۖۗ۠ۛۜ۟ۥۘۤۤۦۘ";
                                    break;
                                }
                        }
                    }
                    break;
                case 2106873358:
                    this.f595p = bundle.getInt("viewHeight");
                    str = "۬ۢۘۨۜۘۢ۟ۖۧۡۦۧۨۙۤۘۖۜ۟ۡۘ";
                    break;
            }
        }
    }

    public Parcelable onSaveInstanceState() {
        Bundle bundle = null;
        String str = "ۤۢۥۡۚ۬ۚۚۦ۟۫۠ۖ۫ۥۖۧۜۗۜۘ۠ۢۨ";
        while (true) {
            switch ((str.hashCode() ^ 331) ^ 524393015) {
                case -1768277228:
                    str = "۫ۨۖۡ۫ۥۖ۟ۜۦۘ۠ۢۡۘۘۨۧۘ";
                    break;
                case -1112907351:
                    bundle.putFloat("saveScale", this.f591l);
                    str = "۟۠ۨۘۨ۠ۦۘۨۘ۟ۤۤۥۘ۟۫ۘۘۡۖۗ";
                    break;
                case -964202385:
                    bundle.putInt("viewHeight", this.f601v);
                    str = "ۤۚۘۖ۟ۘۘۥۨۖۘۡۛۨۧۤ۬";
                    break;
                case -919592238:
                    bundle.putFloat("matchViewWidth", this.f587h);
                    str = "۟ۦۚ۟ۘۜۚۥ۟ۛۥ۟ۜۜۚۢۙۗۜۜ۠";
                    break;
                case 19534198:
                    bundle.putFloatArray("matrix", this.f582c);
                    str = "ۡۤۦۘۚ۬ۘ۟ۘۧۘ۟ۘۨۡۚۡۖۧۢ۠ۗۖ";
                    break;
                case 500480254:
                    return bundle;
                case 595580257:
                    bundle = new Bundle();
                    str = "ۖۦۦۘ۬ۥ۟۠۬ۡۘۧۢۥۘۖ۫ۦۘۙۗۗۨۢۧ۟ۡۜ";
                    break;
                case 1558200013:
                    this.f588i.getValues(this.f582c);
                    str = "ۖۙۡۘ۠ۙۜۖ۫ۢۤۘۗ۬ۧۦۘۚۚۧۥ۠۟ۧۘۤ";
                    break;
                case 1563564086:
                    bundle.putParcelable("instanceState", super.onSaveInstanceState());
                    str = "ۜ۬ۙۗۛ۟۫ۨۧۘ۠ۦۤۤۨۧۘۦۖۘ";
                    break;
                case 1599776597:
                    bundle.putInt("viewWidth", this.f602w);
                    str = "۠ۦۦۙۛۤ۟ۡ۠۫۫ۢ۫ۘۖۖۦ";
                    break;
                case 1722832339:
                    bundle.putFloat("matchViewHeight", this.f586g);
                    str = "ۢ۫ۨۢ۟ۙۡۨۖۘۗۜ۬ۜ۠۫ۢ۟ۦۤۡ۫ۖ۫ۨۘۥ۟ۘ";
                    break;
            }
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        String str = "ۘۨۨۡۡۖۘ۫۫ۨۘۙۛۧۥۧ۫";
        while (true) {
            switch ((str.hashCode() ^ 949) ^ 737558631) {
                case -2083780292:
                    str = "ۨۧۚۘۦۘۨۛۨۤۤۨۘۙۦۛۘۤۨۨۘۧ";
                    break;
                case -1959517727:
                    str = "۫ۥ۬ۗۛۧۖ۫ۖۘۤۦۗ۬۟";
                    break;
                case -1742407404:
                    h();
                    str = "۠ۤ۬ۨۖۖۗۖۧۡۚۛۖۨۖۧۨۜۦۚۦۘ۬ۡۘۘۘ۫ۖ";
                    break;
                case -1401893558:
                    String str2 = "ۨ۟ۨۢ۟ۢۧۗۡۘۚ۫ۦۘ۬ۧ۠ۙۦۚ";
                    while (true) {
                        switch (str2.hashCode() ^ 999387285) {
                            case -1405847437:
                                if (this.f585f) {
                                    str2 = "ۖۥ۟ۚۙۖۙۖۜ۟ۦۥۜۖۢ۬ۖۙۦۖۦۘۦۗۗۜۤ۠";
                                    break;
                                } else {
                                    str2 = "ۘ۟۟ۧۤۨۚۛۨۘۨۚۗۗۦۥۘ۫ۤۦۘۨۙۘۘ";
                                    break;
                                }
                            case -288572812:
                                str = "ۗۧۗۛۘۖۘۧۘۘۘۨۥۜۘۚ۠ۜ";
                                continue;
                            case 233693343:
                                str = "۬۟ۜۘۥۙۨۗ۫ۚۗۨ۟۟ۨۡۤ۟۬";
                                continue;
                            case 741751786:
                                str2 = "۫۠ۤ۬ۛۚۤۧۙۧۚۦۘۥۢ۟ۘۛۥۘۥۙۜۘ۫ۚ۬ۖ۬ۘۘ";
                                break;
                        }
                    }
                    break;
                case -359763163:
                    f();
                    str = "ۘۥۙۖۥۖۘ۫ۨۦۘۥ۫ۡۤۚۙۙۨ۬۫ۙۗۥۡۦۘۗۡۛ";
                    break;
                case -336437743:
                    return;
                case 397606580:
                    this.f597r = true;
                    str = "ۗۧۗۛۘۖۘۧۘۘۘۨۥۜۘۚ۠ۜ";
                    break;
                case 415290962:
                    super.setImageBitmap(bitmap);
                    str = "ۥۚۦ۫ۗۨۜۦۘۢ۟ۦۘۧۘۛ";
                    break;
            }
        }
    }

    public void setImageDrawable(Drawable drawable) {
        String str = "ۖۖۢۥۡ۟ۨۧۦۘۘۨۘۘۛۨۖۤۥۙ";
        while (true) {
            switch ((str.hashCode() ^ 39) ^ 1066810435) {
                case -1876320442:
                    this.f597r = true;
                    str = "ۨۚۨۜۦۘ۠ۨ۬ۖۛۘ۠ۧ۫ۛۖۖۖۛ۫";
                    break;
                case -1660932472:
                    super.setImageDrawable(drawable);
                    str = "۠ۡۤۥۜۨۘۗۖۜۚۖۦۦۖۗ";
                    break;
                case -1596895147:
                    str = "ۙۜۜۘ۬ۤۢۛۗۨۘOۛۥۜ";
                    break;
                case -1403992237:
                    return;
                case -417977314:
                    str = "ۡۨۚۙۛۡۧۥۤۤۘۡۘۛۦۜۘ";
                    break;
                case -147687244:
                    String str2 = "ۙۧۚۙۜ۬ۡۘۢۙۜۡۘۜۖۘۜۗ۠ۢۜۜۘ";
                    while (true) {
                        switch (str2.hashCode() ^ -441670567) {
                            case -1568942139:
                                str = "ۨۚۨۜۦۘ۠ۨ۬ۖۛۘ۠ۧ۫ۛۖۖۖۛ۫";
                                continue;
                            case -968632388:
                                if (this.f585f) {
                                    str2 = "ۗۘۙ۟ۜۨۘۙۘۙۥۗۨۘۤۤۢ۠ۗۜۘۨۗۖ۫۫ۥۘ";
                                    break;
                                } else {
                                    str2 = "ۦۙۙۛۚۗ۫ۧۤۜۜۢۤ۬ۦۘۜۗۛ۠ۡۧۘ۠ۘۙ";
                                    break;
                                }
                            case 288230840:
                                str = "۬ۗۘۚ۟ۖ۟۬ۖۘۦۨۖۘۜ۟ۜ";
                                continue;
                            case 1396298668:
                                str2 = "ۖۚ۟ۢۚۗۘۡۗۛۚۙۗۦۖۖ۟ۡ";
                                break;
                        }
                    }
                    break;
                case 185901433:
                    f();
                    str = "ۦۤۖۧۚۨۢۡۡۘۛۖۜۤۢۜ۬ۥۘۙۧۗۧۤۘۘ";
                    break;
                case 519952300:
                    h();
                    str = "ۜۖۛ۬ۜۜۡۡۖۨۦۨۘۦ۟ۥۛۗۘۛۥۢۥ۟ۦ";
                    break;
            }
        }
    }

    public void setImageResource(int i2) {
        String str = "۬ۖۘۘۛۥۨۥۢۚ۬ۧ۬ۧۡۡۥۛ۠۫ۖۘۘۛۘۧۘ";
        while (true) {
            switch ((str.hashCode() ^ 283) ^ -828419012) {
                case -1660001067:
                    str = "ۛ۠ۨۘ۫ۡۖ۟ۜۦۨۧۛۧۨۘۥۚۖ۫ۛۙۚ۫ۦۘۤۗ۬";
                    break;
                case -1347100732:
                    f();
                    str = "۠ۖۡۡۗۢ۬ۧۜۙۛۖۙۢ۟ۛۢۖۖۘۨۘۥ۟۟ۙ۫ۡ";
                    break;
                case -838469917:
                    str = "ۜۛۢۡۦۨۘ۠ۙۥۥۛۨ۠ۗۧ";
                    break;
                case -285250515:
                    String str2 = "۠ۘۧۘۚۤۛۘۖۥۗ۟ۗۢۚۛۜۨۤ";
                    while (true) {
                        switch (str2.hashCode() ^ 710082184) {
                            case -1043239842:
                                str = "ۡۙۙۨ۠۬ۥۤۨۘۨۚۖ۬ۙ۟ۘۡۨۘ";
                                continue;
                            case -834801007:
                                str2 = "۟ۢۛۨۤۘ۬ۨۤ۬ۙۨۢۢ۫ۡۚۥۘۨۤۖ۫ۨۙۤۢۖ";
                                break;
                            case 1527375149:
                                if (this.f585f) {
                                    str2 = "ۧۚۤۚ۫ۥۘ۟ۦۢۦۧ۟ۡۖ۫ۢۖۜۘ۠ۧۥۘ";
                                    break;
                                } else {
                                    str2 = "ۤ۬ۦۘ۫ۨۛۘۖۦۢۘۧۘۜۥ۫ۡۨۥۘۜۙۨۘۙۤۨۘ";
                                    break;
                                }
                            case 2123344672:
                                str = "ۚۢۨۛۧۤۗ۬ۚۧۛ۬ۤ۫ۖۘۥۧ۠ۖۡۘۦۛ۬ۜ۟ۡۘ";
                                continue;
                        }
                    }
                    break;
                case -255477138:
                    return;
                case 126428590:
                    this.f597r = true;
                    str = "ۚۢۨۛۧۤۗ۬ۚۧۛ۬ۤ۫ۖۘۥۧ۠ۖۡۘۦۛ۬ۜ۟ۡۘ";
                    break;
                case 975125906:
                    super.setImageResource(i2);
                    str = "ۛ۬ۥۛۢۧۖۖۘۘ۟۬ۘۘۤ۟ۛۤۦ۬ۛۢۘۘ";
                    break;
                case 1091633257:
                    h();
                    str = "۠ۢۜۘۙۦۜۘۨۖ۟ۛۚ۟۠۠ۙ";
                    break;
            }
        }
    }

    public void setImageURI(Uri uri) {
        String str = "ۢ۠ۢۧ۫ۖۡ۫۬ۢۜۨۖۙۚۚۛۤ";
        while (true) {
            switch ((str.hashCode() ^ 950) ^ -89950012) {
                case -1997117834:
                    this.f597r = true;
                    str = "ۥۖۜۘۘ۠ۤۥۚ۬ۛۢۗۨۦۖ";
                    break;
                case -549422387:
                    return;
                case 200706928:
                    f();
                    str = "۫۟۫ۡۥۡۡ۫ۘۘۛ۟ۢۦۗ";
                    break;
                case 393262013:
                    str = "ۤۘۘۘۧۖۢۢۚۡۧ۠ۨۘۥۨ۫ۗۧۖۘ";
                    break;
                case 459167362:
                    h();
                    str = "ۗۚۖۘ۠ۖ۫ۤۘۡۘۙ۬ۨۘۛۚ۟ۛۨ۫ۦۦۦۘۡۜۧۘۚ۟ۡ";
                    break;
                case 1100471637:
                    super.setImageURI(uri);
                    str = "ۦۙۙ۟۟ۛۚۡۘۛۨۥۘۗۤۡۘۜ۟ۦۦ۟ۘۜ۠۫";
                    break;
                case 1641037140:
                    str = "ۧۥۨ۫۟ۘۤۙۜۘ۠ۖۦۘۡۤۢۥۡۘۘۛ۠ۘۘۜۦۦ";
                    break;
                case 1822004441:
                    String str2 = "۫۬ۛۛۢۨۘۜۥۧۢۦ۟ۚ۬ۚۚۢۨ";
                    while (true) {
                        switch (str2.hashCode() ^ 991961430) {
                            case -1596154128:
                                if (this.f585f) {
                                    str2 = "۫۫ۨۘۙۖۢۛ۬ۥۘۥۧۜۥۤۡۘۜۘۧۘ۫ۙۖۘۥۜۧ";
                                    break;
                                } else {
                                    str2 = "ۘۡۥۘۙ۠ۨۘۡ۫ۥ۠۠ۗۤۤ۠۫۠ۥۡۨۢ";
                                    break;
                                }
                            case -1516268182:
                                str2 = "۬ۙۜۘۡۤۦۘۘۤۛۜ۠۟ۙ۠ۖۤۘۦۘ";
                                break;
                            case -112771830:
                                str = "ۥۖۜۘۘ۠ۤۥۚ۬ۛۢۗۨۦۖ";
                                continue;
                            case 1703689821:
                                str = "ۡۙۥ۟ۛۘۘۦۧۖۥۧۘۘۗ۟ۖۗۗۨۜۜ۬";
                                continue;
                        }
                    }
                    break;
            }
        }
    }

    public void setMaxZoom(float f2) {
        String str = "ۖ۬ۜۧۛۗۖۡۛۘۦۥۨۨ۫";
        while (true) {
            switch ((str.hashCode() ^ 386) ^ 815665049) {
                case -1652259822:
                    return;
                case -668707918:
                    str = "ۧۘۧ۠ۦ۬ۖۦۡۗ۠ۨۘۜۜۡۧۚۚۚۜ۠";
                    break;
                case 1091698031:
                    this.f599t = 1.25f * f2;
                    str = "۫ۡۛۚۜۦۧۖۧ۬۬ۘۘۜۜۨۘ";
                    break;
                case 1202598501:
                    this.f589j = f2;
                    str = "۠ۤۘۘۡۢۦ۬ۚۡۗ۟ۜۘ۟ۙۨۧۚ۟";
                    break;
                case 2046267676:
                    str = "ۧۧۙۢۦۙۧۖۤ۟ۥۖۘۗۙ۠ۜ۟ۤ۠۟۬";
                    break;
            }
        }
    }

    public void setMinZoom(float f2) {
        String str = "۠ۦۖۦۜۡۘۛ۫ۦۘۖۤۜ۫۠ۨۘ۫۫ۤۜۦۗ";
        while (true) {
            switch ((str.hashCode() ^ 71) ^ 167565331) {
                case -1729461737:
                    str = "ۙۘۦۘۛۛۗۥۢۙۙ۠ۚۖۘ";
                    break;
                case -1618319447:
                    str = "ۙۨۦ۬۠ۡۡۨ۠ۚۦۖۤ۠ۘۘ";
                    break;
                case -1394183488:
                    this.f600u = 0.75f * f2;
                    str = "ۥۘۧۘۜۜۦۘۤۤۙۙ۬ۘۦۙۚ۟ۤۘۘ";
                    break;
                case 242189739:
                    this.f590k = f2;
                    str = "۫ۨۡۖۥ۠ۖۡۥۧۥۘۘۦۥۤۧۡ";
                    break;
                case 892514654:
                    return;
            }
        }
    }
}
