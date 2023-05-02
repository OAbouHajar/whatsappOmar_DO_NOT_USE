package com.obwhatsapp.youbasha.colorPicker;

import X.AnonymousClass00T;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.obwhatsapp.yo.yo;
import com.obwhatsapp.youbasha.others;

public class HsvHueSelectorView extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public Drawable f1014a;

    /* renamed from: b  reason: collision with root package name */
    public ImageView f1015b;

    /* renamed from: c  reason: collision with root package name */
    public int f1016c = 0;

    /* renamed from: d  reason: collision with root package name */
    public ImageView f1017d;

    /* renamed from: e  reason: collision with root package name */
    public float f1018e = 0.0f;

    /* renamed from: f  reason: collision with root package name */
    public OnHueChangedListener f1019f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f1020g = false;

    public interface OnHueChangedListener {
        void hueChanged(HsvHueSelectorView hsvHueSelectorView, float f2);
    }

    public HsvHueSelectorView(Context context) {
        super(context);
        a();
    }

    public HsvHueSelectorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    private int getOffset() {
        String str = "ۚۤ۟۟ۤۡۙۥۘ۫۟ۨۘۡۗ۠ۡۥۡۨۖۨ";
        while (true) {
            switch ((str.hashCode() ^ 517) ^ 1588398519) {
                case -1665057748:
                    str = "۠ۖۘۚۥۦۖۗۧۗۥۧ۠۬ۜۘۧۖۨۜۗۢ";
                    break;
                case 405779312:
                    return Math.max(this.f1016c, getSelectorOffset());
            }
        }
    }

    private int getSelectorOffset() {
        String str = "ۛۜۨ۟ۥۗۤ۬ۖۙۖۢۡۚۜۤۧۧ۬ۗۢ۟۫ۛۖ۠ۖ";
        while (true) {
            switch ((str.hashCode() ^ 922) ^ -668689448) {
                case -1084659504:
                    str = "ۡۦۘ۫ۚۦۘۙۢۘۧۚۨۘ۠ۢۘۘۤۧۡۛۥۖۘ";
                    break;
                case 220003432:
                    return (int) Math.ceil((double) (((float) this.f1014a.getIntrinsicHeight()) / 2.0f));
            }
        }
    }

    private void setPosition(int i2) {
        OnHueChangedListener onHueChangedListener = null;
        String str = "۫۠ۨۢۘۢ۫ۡ۠ۗۨۚۛۤۘۘۘۖۛۜۜۡۧۜۗۗۜۢ";
        while (true) {
            switch ((str.hashCode() ^ 393) ^ 28263999) {
                case -1357374187:
                    onHueChangedListener.hueChanged(this, this.f1018e);
                    str = "۬ۢۡۘ۠ۨۚۛۘۖۢۖۖ۫ۜۘ۬ۙۜۘۤ۠ۦۢۛۦ";
                    break;
                case -777418514:
                    str = "۠ۡۧۘۚۛۘۘ۬ۢۦۘۨۗۡۧۤۧۡۗ";
                    break;
                case -199533485:
                    return;
                case 29870047:
                    this.f1018e = Math.max(Math.min(360.0f - ((((float) (i2 - getOffset())) / ((float) this.f1017d.getHeight())) * 360.0f), 360.0f), 0.0f);
                    str = "ۡۗ۟ۚۛۡۜۦ۫ۛۛۗۥۤۡ";
                    break;
                case 416088470:
                    str = "ۖ۬۬ۤۧۜۘۧۢۨۚۡۨۘۗ۫ۛ";
                    break;
                case 1055103152:
                    onHueChangedListener = this.f1019f;
                    str = "۬ۖۨۘۖۚۦۘۨ۟ۗ۬ۢۜۘ۟ۗۗۧۦۘۜۚۡۖۥۡ";
                    break;
                case 1699105987:
                    b();
                    str = "ۙ۬ۦۘ۟ۤۜۘ۬ۦۡۘۘۤۨۘۡ۠۠۟ۡۖ";
                    break;
                case 1981234813:
                    String str2 = "۟ۗۧ۠۬۠ۥ۠ۚ۠ۜۨۘۡ۠ۡۛۖۥۙۤۘ";
                    while (true) {
                        switch (str2.hashCode() ^ -582324682) {
                            case -2038172315:
                                str = "۬ۢۡۘ۠ۨۚۛۘۖۢۖۖ۫ۜۘ۬ۙۜۘۤ۠ۦۢۛۦ";
                                continue;
                            case -1108308406:
                                str2 = "۫ۙۡۘۗ۫ۛۢۨۗۛۛۦۘۘ۟۟۬ۦۜۘۘۡۘۧۖۡۗۧۙ";
                                break;
                            case 1858650383:
                                str = "ۚۗۨۘۙۧۖۙ۬ۛۥۥۡۢۖۜۘۥۢۥۘ۫ۙۤۧۖۦۘ";
                                continue;
                            case 1887256329:
                                if (onHueChangedListener == null) {
                                    str2 = "ۦ۠۟ۤۨۨۨۘۘۢ۬۠ۙ۫ۦۘ۫ۦ۟";
                                    break;
                                } else {
                                    str2 = "۬ۜۖۘۡۧۤۤ۬ۡۘۦ۟ۜۙۦۘۗۚۢۨ";
                                    break;
                                }
                        }
                    }
                    break;
            }
        }
    }

    public final void a() {
        String str = "ۛۥۥۘۡ۟ۥۘ۬۠ۗۧۦ۬ۢۨۢۚۜۡۘۢۧۨۘۗۥۨۘ";
        LinearLayout.LayoutParams layoutParams = null;
        ImageView imageView = null;
        LinearLayout.LayoutParams layoutParams2 = null;
        ImageView imageView2 = null;
        while (true) {
            switch ((str.hashCode() ^ 834) ^ 1327783475) {
                case -2137679360:
                    str = "ۘۤۤۖۤۧۖۘ۟ۛۧۥۘۖۢۘ";
                    layoutParams2 = new LinearLayout.LayoutParams(this.f1014a.getIntrinsicWidth(), this.f1014a.getIntrinsicHeight());
                    break;
                case -1759447785:
                    layoutParams = new LinearLayout.LayoutParams(-1, -1);
                    str = "ۥۤۢۛ۠ۖۘۖۡۘۘۥۡۥۘ۬ۗۡۨۨۙۡۨۘۚۧۖۢۚۨ";
                    break;
                case -1727465407:
                    str = "ۡ۬۟ۘ۫ۥۘۜۜ۫ۜۜۡۧۘۤۘۖۧۘۨۚۙۖۤ۬۬۟";
                    break;
                case -1472834125:
                    setOrientation(0);
                    str = "۫ۚۢۨۢۧۥۚۚۘۧۡۙ۠ۘۡۦۧۘ۫ۧ";
                    break;
                case -954869034:
                    imageView.setImageDrawable(AnonymousClass00T.A04(yo.getCtx(), others.getID("color_hue", "drawable")));
                    str = "۫ۚۚۗۦ۫ۘۨۘۤۜۘۚۦ";
                    break;
                case -495975424:
                    addView(this.f1015b, layoutParams2);
                    str = "ۡۤ۠ۚۤۦۗۢۙۥۜۡۘۚۜۥۘ۠ۢۥۘ";
                    break;
                case -60434414:
                    imageView2.setImageDrawable(this.f1014a);
                    str = "۬۫ۜۘ۬۬۫ۖۗۜۘۤۦۥۘۧ۟۫";
                    break;
                case 406452237:
                    this.f1014a = AnonymousClass00T.A04(yo.getCtx(), others.getID("color_seekselector", "drawable"));
                    str = "۬ۛۧ۬ۧۙ۬ۜۖ۟ۜۧۦۚۜۥۘۘۘۜۡ۟۬ۥ";
                    break;
                case 488708840:
                    this.f1015b = imageView2;
                    str = "ۡۖۥۤۤۢۥ۟۬۠ۘۧۙۖ۟ۤۤۖۘۜۡۥ۠ۖۖۘ";
                    break;
                case 547781508:
                    str = "ۘۧۨۥۜ۬ۡۜۨۢۤۥۘۛ۟۬ۡ۟ۛۚۢۗۡۜۨ";
                    imageView2 = new ImageView(getContext());
                    break;
                case 1018153944:
                    addView(this.f1017d, layoutParams);
                    str = "ۜۥۡۘۦۖۘۧۖۦۘۥۗۨۜۢۖۘۜ۠ۤ";
                    break;
                case 1111284101:
                    this.f1017d = imageView;
                    str = "ۙ۫ۖۘۥۚۨۛ۠ۡۧۧۘۘۘ۬ۘۨ۬ۚ۫ۛۙۦۡۚۤ۟ۧ";
                    break;
                case 1218142816:
                    layoutParams.setMargins(0, getOffset(), 0, getSelectorOffset());
                    str = "ۚ۟ۥۘۘ۬۟ۡۗۛۛۢۥۙۦۢ";
                    break;
                case 1404754509:
                    setGravity(1);
                    str = "ۤۘۦ۠ۢ۬ۢ۬ۙۘۦۙۛۦۡۚۛ۫۬ۗۛۚۗۚ";
                    break;
                case 1429989078:
                    str = "۫ۖ۟ۡۤ۫ۛۘۖ۫۟ۥۖۙۧۗۨۘۘۜۧ";
                    imageView = new ImageView(getContext());
                    break;
                case 1555150852:
                    this.f1017d.setScaleType(ImageView.ScaleType.FIT_XY);
                    str = "ۡۛۙۥۛ۫ۧۘۘۨۧ۬ۙۡۖۘ";
                    break;
                case 1847519098:
                    return;
            }
        }
    }

    public final void b() {
        ImageView imageView = null;
        String str = "ۦ۟ۜۘۙ۟ۡۘۗۦ۟ۢۦۨۘ۫ۗۦۘۖۗۙۖۢۖ۟ۖۙ";
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            switch ((str.hashCode() ^ 413) ^ -1650785583) {
                case -2100564359:
                    i7 = (int) (((360.0f - this.f1018e) / 360.0f) * ((float) this.f1017d.getHeight()));
                    str = "ۢ۬ۧۨۤۡۘۥ۫ۡۦۤۥۘ۟ۤۜۘۡ۬ۘۘ۟ۙۛۚ۫ۦۘ۠ۧۡ";
                    break;
                case -1930793913:
                    return;
                case -224429728:
                    imageView.layout(0, (i6 + i7) - i5, i4, this.f1015b.getHeight() + ((i7 + i3) - i2));
                    str = "ۨۗۨۘ۟۫ۖۢۙۖۘۧۧ۬ۖ۫ۖۧ۠ۛۧ۫ۘ";
                    break;
                case -123977006:
                    imageView = this.f1015b;
                    str = "ۨۦ۠۟۠ۤۨۚۖۘۢۦۥۛۛۦۦۦۖۘ";
                    break;
                case -70942213:
                    i4 = this.f1015b.getWidth();
                    str = "۠ۨۥ۟ۢۧ۫ۨۢۤ۬ۨۘۢۗ۫ۙۖۜۘ۠ۗۘ۫۠ۘۘ";
                    break;
                case -13539247:
                    i3 = getOffset();
                    str = "ۖۙۨۢ۟ۖ۬ۗۥۘۗۘ۫۬ۗۥ";
                    break;
                case 679062711:
                    i5 = getSelectorOffset();
                    str = "ۘۘۥۙۙۧۖۘۧۧ۬ۡۖۡۜۜۤۘ۠ۙۢ۬ۥۡ";
                    break;
                case 1170294414:
                    i2 = getSelectorOffset();
                    str = "ۚۧۜۙۚۛ۬ۘۢۧۗۘۘۨۢۡۘ";
                    break;
                case 1374064268:
                    str = "ۚ۬ۛۧۗۡۛۘ۬ۡۨۤۨۧ";
                    break;
                case 2015154992:
                    i6 = getOffset();
                    str = "ۛ۫ۢۘۗۤ۫ۚۢ۟۬ۧۦۧۦۨ۬ۡۗ۠";
                    break;
            }
        }
    }

    public float getHue() {
        String str = "ۚۢۥۥ۫ۨۖۖۧۗۚۗۤۢ";
        while (true) {
            switch ((str.hashCode() ^ 266) ^ 813157597) {
                case -1743841852:
                    return this.f1018e;
                case -1429185145:
                    str = "ۨۖۖۘۦۤ۟ۥ۟ۡۛۢۘ۟ۜ۟ۘۜۥۘۦۗۢ";
                    break;
            }
        }
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        String str = "۠ۛۥۘۗۦۚ۬۟ۜۘۘ۟ۗۙۗۛ۠ۜۧۘۡۢۜۘۚۢۖۦ۟ۜۘ";
        while (true) {
            switch ((str.hashCode() ^ 649) ^ -1536477426) {
                case -2140863417:
                    str = "ۤۘۨۘۖۛۡ۫ۨۖۘۨۘۧۘۢۗۨۘ";
                    break;
                case -1287761841:
                    str = "ۦۛۢۚۥۖۘۚۖۤۛۙۡۧۘۜۛۖۦۛۗۥ";
                    break;
                case -831868582:
                    str = "ۡۢۛۜ۠ۚۢۚۦۘۤۨۘۛۢۥ۠۬ۘۘۖۤۛۘۦۖ";
                    break;
                case -339804078:
                    return;
                case -42448109:
                    str = "ۤ۬ۡۘۛۚۜۘ۠۠ۡۦۦ۠۬۠۬";
                    break;
                case 990897016:
                    super.onLayout(z2, i2, i3, i4, i5);
                    str = "ۖ۬ۘۛۥۘۨۤۦۚۛۢۥ۠۬";
                    break;
                case 1091330697:
                    b();
                    str = "ۖۨۧۜ۬ۤ۠ۨۨۚ۫ۧۥۙۜۖۡۡۘ";
                    break;
                case 1215809523:
                    str = "ۖۚۧۨ۬ۙۗۜۧۛۢۡۘۨۥۙۧۡ";
                    break;
                case 1655420496:
                    str = "ۡ۟ۘۘۤۖۨ۫ۛۧۥۥۛۢۜ۟ۥۢۚ";
                    break;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00ce, code lost:
        r0 = "ۗۘۛ۫ۖۨۘۙ۬ۖ۠ۜۨۧۨۥۘۜۙۢۖۜۧۘ";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            r1 = 1
            java.lang.String r0 = "ۦ۫ۦۢ۠ۦۛۚۖۙۥۘۙ۬ۚ۠ۨۚۜۚۤۚۦۘۨۤۢ"
        L_0x0003:
            int r2 = r0.hashCode()
            r3 = 717(0x2cd, float:1.005E-42)
            r4 = 553788262(0x21022366, float:4.4092563E-19)
            r2 = r2 ^ r3
            r2 = r2 ^ r4
            switch(r2) {
                case -2126547163: goto L_0x006a;
                case -2024141640: goto L_0x0048;
                case -1861942612: goto L_0x00b3;
                case -1711826833: goto L_0x003d;
                case -1316409345: goto L_0x0015;
                case -1232469227: goto L_0x0018;
                case -401797535: goto L_0x00c1;
                case 68880322: goto L_0x004a;
                case 95427850: goto L_0x00bf;
                case 142044716: goto L_0x0038;
                case 1026080530: goto L_0x0012;
                case 1434181538: goto L_0x0072;
                case 1699546784: goto L_0x0070;
                case 1954479640: goto L_0x0091;
                default: goto L_0x0011;
            }
        L_0x0011:
            goto L_0x0003
        L_0x0012:
            java.lang.String r0 = "۫ۘۧۘۢ۫۟ۨۘۨۘ۬۫ۙۖ۠ۨۘۗ۫ۥ۬ۥۦۘۗۥۛۜۡۖۘ"
            goto L_0x0003
        L_0x0015:
            java.lang.String r0 = "ۡ۠ۡ۬ۡۡۛۙۚۥۖۜۘۢۜۨۘۘۧۗ۫۬ۤۚۤۨۘ"
            goto L_0x0003
        L_0x0018:
            r2 = -574252395(0xffffffffddc59a95, float:-1.77985712E18)
            java.lang.String r0 = "ۙ۠ۖۧۢۦۨۢۙۢۤۨۘۖۤۜۜۗۗۗۥۘۖ۟۠"
        L_0x001d:
            int r3 = r0.hashCode()
            r3 = r3 ^ r2
            switch(r3) {
                case -1854097083: goto L_0x002c;
                case -914842092: goto L_0x00c6;
                case 689368368: goto L_0x0026;
                case 2102831368: goto L_0x0035;
                default: goto L_0x0025;
            }
        L_0x0025:
            goto L_0x001d
        L_0x0026:
            java.lang.String r0 = "ۦۚۖۘۨۤۡۘۛۛۖۢۥۙۜۗۡ"
            goto L_0x001d
        L_0x0029:
            java.lang.String r0 = "ۚۛ۫ۜ۟ۜۗۦۗۚۢۘۘۦۚۖۦۢۘۛۖۗ"
            goto L_0x001d
        L_0x002c:
            int r0 = r6.getAction()
            if (r0 != 0) goto L_0x0029
            java.lang.String r0 = "ۘۦۗۗۜۢۛ۠ۤۡۨ۠ۧۘۘۘ۠ۛۖۡ"
            goto L_0x001d
        L_0x0035:
            java.lang.String r0 = "ۗۢۘۦۜۗۨۘۤ۫ۦۥۖ۫ۥ۫ۤ۬ۗۘۧ۫ۥۚ"
            goto L_0x0003
        L_0x0038:
            r5.f1020g = r1
            java.lang.String r0 = "۫ۥۖۘۙۖۜۘۜۨۘۘۙۦۚۧۡۘۚۤۚۧۧۢ"
            goto L_0x0003
        L_0x003d:
            float r0 = r6.getY()
            int r0 = (int) r0
            r5.setPosition(r0)
            java.lang.String r0 = "ۤۖۡ۠ۢ۟ۖۥۜۘۦۛۡۦۙۤۛۖ۬"
            goto L_0x0003
        L_0x0048:
            r0 = r1
        L_0x0049:
            return r0
        L_0x004a:
            r2 = 1479066264(0x5828c298, float:7.4221491E14)
            java.lang.String r0 = "ۖۙۛۦۥۘ۟ۛۧۖۢۦۘۜ۬ۛۢۧۡۘۘۨۤ"
        L_0x004f:
            int r3 = r0.hashCode()
            r3 = r3 ^ r2
            switch(r3) {
                case -1669840403: goto L_0x005e;
                case 216188602: goto L_0x00ca;
                case 241372823: goto L_0x0067;
                case 1825381896: goto L_0x0058;
                default: goto L_0x0057;
            }
        L_0x0057:
            goto L_0x004f
        L_0x0058:
            java.lang.String r0 = "ۥۡۙ۫ۥۨۘۡۧۖۘۜۢۚۨۜۡۘۡۘۚۥۗۢۚۦۧۘۢۛۡ"
            goto L_0x0003
        L_0x005b:
            java.lang.String r0 = "ۛۚۡۤۗۘۘۤ۟ۨۘۘۨۙۙۜۚۡۤ۫ۗۚۧۤۗۦ۫"
            goto L_0x004f
        L_0x005e:
            int r0 = r6.getAction()
            if (r0 != r1) goto L_0x005b
            java.lang.String r0 = "ۦۢۙۡۡۦۘ۬ۡ۟۫ۛۧۙۨۚ"
            goto L_0x004f
        L_0x0067:
            java.lang.String r0 = "ۥۨۦۘۤۖۜۘۙۘۢ۬۬ۧ۟ۥۖۘ۫ۙۡۘۘۛۙۛ۫ۢ۟۟"
            goto L_0x004f
        L_0x006a:
            r0 = 0
            r5.f1020g = r0
            java.lang.String r0 = "۫ۤۜۨۙۥۘۖۛۖۘۖۥۘۨۖۜۘۤۘۦۘ"
            goto L_0x0003
        L_0x0070:
            r0 = r1
            goto L_0x0049
        L_0x0072:
            r2 = 1494278401(0x5910e101, float:2.54873694E15)
            java.lang.String r0 = "ۥ۬ۤۥ۫ۗ۬ۦۢۤۜۤۤۘ۫ۛۘۙ"
        L_0x0077:
            int r3 = r0.hashCode()
            r3 = r3 ^ r2
            switch(r3) {
                case -1539832516: goto L_0x0080;
                case -19563139: goto L_0x008d;
                case 238839405: goto L_0x00ce;
                case 1301526565: goto L_0x008a;
                default: goto L_0x007f;
            }
        L_0x007f:
            goto L_0x0077
        L_0x0080:
            boolean r0 = r5.f1020g
            if (r0 == 0) goto L_0x0087
            java.lang.String r0 = "۠ۡۨۘ۬ۘۘۛۡۛۖۢ۠ۧۗۙ۠ۧۚ"
            goto L_0x0077
        L_0x0087:
            java.lang.String r0 = "ۥ۟ۧۛۧۘۦۦۨۘۖۙۙۙ۟ۙ"
            goto L_0x0077
        L_0x008a:
            java.lang.String r0 = "ۡۙۢۗۙۖۨۚۜۘۡ۠ۤ۟ۨۨ۬ۨۖۧۖ۠ۖۗۦۘ"
            goto L_0x0077
        L_0x008d:
            java.lang.String r0 = "ۥۥ۟ۜۡۥۨۧۙۚ۬ۦۘۤ۠ۨۡ۬ۗۤۜۨۚۛۗ۫ۛ"
            goto L_0x0003
        L_0x0091:
            r2 = -440619575(0xffffffffe5bcadc9, float:-1.1137633E23)
            java.lang.String r0 = "ۘۖ۟ۘۧۡۘۢۤۘۘۛۙۥۘۖۖۢۡۗۨ"
        L_0x0096:
            int r3 = r0.hashCode()
            r3 = r3 ^ r2
            switch(r3) {
                case -1833475677: goto L_0x00a5;
                case -273450530: goto L_0x00af;
                case 46198414: goto L_0x00ce;
                case 1004157432: goto L_0x009f;
                default: goto L_0x009e;
            }
        L_0x009e:
            goto L_0x0096
        L_0x009f:
            java.lang.String r0 = "ۧۘۖۜۨۧۘۡۦۖۘۢۗ۟ۙۥۜۚۢ"
            goto L_0x0096
        L_0x00a2:
            java.lang.String r0 = "ۜۘۖۘۚ۟ۡۧ۫ۜۘ۠ۛۧۢۥۘ"
            goto L_0x0096
        L_0x00a5:
            int r0 = r6.getAction()
            r3 = 2
            if (r0 != r3) goto L_0x00a2
            java.lang.String r0 = "ۢ۟ۙ۬ۙۨ۠۬ۖۘۨۚۨۘۙ۟ۜۘ"
            goto L_0x0096
        L_0x00af:
            java.lang.String r0 = "ۜۧۡ۠ۛۧۤ۫ۡۢۢ۫ۜۥۘۘۗۚۚ"
            goto L_0x0003
        L_0x00b3:
            float r0 = r6.getY()
            int r0 = (int) r0
            r5.setPosition(r0)
            java.lang.String r0 = "۠ۧۜ۟۠ۗۧۥۦ۬ۘۘۦۨۘ۟ۡۜۘۗۖۧۘۤۗۖۘۗۛۙ"
            goto L_0x0003
        L_0x00bf:
            r0 = r1
            goto L_0x0049
        L_0x00c1:
            boolean r0 = super.onTouchEvent(r6)
            goto L_0x0049
        L_0x00c6:
            java.lang.String r0 = "۬۫ۡۘۡۨۜۘۧ۠ۗۗۢۦۘۗۡۘۢۦۙۙۢۛ"
            goto L_0x0003
        L_0x00ca:
            java.lang.String r0 = "ۤۤۘۚۨ۬ۢۤۤۥۙۢ۠ۧۖۘۙ۬ۨۘ۠ۘۥۘۙۜۘۤۛ۬"
            goto L_0x0003
        L_0x00ce:
            java.lang.String r0 = "ۗۘۛ۫ۖۨۘۙ۬ۖ۠ۜۨۧۨۥۘۜۙۢۖۜۧۘ"
            goto L_0x0003
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.youbasha.colorPicker.HsvHueSelectorView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setHue(float f2) {
        String str = "۠۬ۨ۟۟ۡۘ۫ۜۦۘ۫۫ۡۗ۟ۖۘ";
        while (true) {
            switch ((str.hashCode() ^ 824) ^ 202772035) {
                case -1735776345:
                    String str2 = "ۦ۠ۘۢۜۘۡۨۙ۠ۛۦۘۢۤۖۗۛۚۦ۠";
                    while (true) {
                        switch (str2.hashCode() ^ -343927161) {
                            case -2065123753:
                                str = "ۜۙۖ۠۟۫۠ۧۡۨ۟ۘۨۖ۬ۛۧۨ";
                                continue;
                            case -781103716:
                                if (this.f1018e != f2) {
                                    str2 = "ۡۜۧۘ۫ۢۥۙۜۦۘۦ۫ۖۘۜۖۗ۠ۧۘۘۖۘۛ۟ۘۘ";
                                    break;
                                } else {
                                    str2 = "۬۫ۗۢۨۗۛۢۘۗۧۖۘۘۢ";
                                    break;
                                }
                            case 1148034091:
                                str = "ۖۛۜۘۧۨۖۛۦۜۘۖۜۗۡۥۨۘۧۨ۠ۙۥۨۘ";
                                continue;
                            case 1716752979:
                                str2 = "۬۟ۛۦ۫ۜۘۛۥۥۘۥۖ۫ۧ۟ۥۘۥ۟ۡۘۖۡ۟۫ۚۧۨۨۤ";
                                break;
                        }
                    }
                    break;
                case -455696338:
                    str = "۠۠ۗۗۡۨۙۘۦۥۧۖۘۗۛۜ";
                    break;
                case -218247830:
                    this.f1018e = f2;
                    str = "ۦ۟ۘۛۥۦۘۛۚۨۛۖ۬ۛ۠ۛ";
                    break;
                case -210438584:
                    b();
                    str = "ۙۡ۫ۤۧۘۧۦۖۦۦۖۘۥۤۗ";
                    break;
                case 73127754:
                case 1761606595:
                    return;
                case 111322799:
                    str = "ۨۢۤۤ۟ۧۜۥۦۤۤۨ۬۠ۗ۟ۖۘۚۚۦۘۚۙۘ";
                    break;
            }
        }
    }

    public void setMaxHeight(int i2) {
        String str = "ۧۛۦۘۘۗ۫ۙۘۥۘۜۛۜۖۗۜۖۨ۫ۙۥۢ";
        while (true) {
            switch ((str.hashCode() ^ 92) ^ -598741784) {
                case -1628969099:
                    this.f1017d.getLayoutParams().height = i2 - this.f1015b.getMeasuredHeight();
                    str = "ۧۗۚ۫ۜۘۘۘۚۥۘۜۥۖۘۧ۠ۙۦۗۨۘۜۡۗ";
                    break;
                case -1343745928:
                    return;
                case 303423655:
                    str = "ۦ۬ۛۚۡۖۘۗ۠ۡۘۦۙۚ۬ۛۘۘۘۡۜ۫ۜ۟۠ۡۨ";
                    break;
                case 1567640576:
                    str = "ۜۙ۫ۦۤۘۘ۠ۥۨۘۧۦۤۖۙۧۧۥۜۘ۠ۢۡۘۚ۬ۦ";
                    break;
            }
        }
    }

    public void setMinContentOffset(int i2) {
        LinearLayout.LayoutParams layoutParams = null;
        String str = "ۢۦۙۥۚۗۜۨۦۘۡۜۘ۬ۡۦ";
        while (true) {
            switch ((str.hashCode() ^ 470) ^ 818966962) {
                case -2052098809:
                    return;
                case -2018652218:
                    this.f1016c = i2;
                    str = "ۧۥۡۦۜ۫ۡۨۛۧۨۘۙۘۧ";
                    break;
                case -1612604713:
                    layoutParams = new LinearLayout.LayoutParams(this.f1017d.getLayoutParams());
                    str = "ۧ۟ۘۤۧۖ۬۬ۗۦ۫ۧۢۤۜ۟ۡ۟۠ۖۦ";
                    break;
                case -1490483061:
                    layoutParams.setMargins(0, getOffset(), 0, getSelectorOffset());
                    str = "ۨۛ۫ۡۤ۠ۘۘۥۘۥۢۡۘۡۧۘۨ۟ۧ۠ۛ۟";
                    break;
                case 187284449:
                    str = "ۡۚۦۘۗۡۛ۠۬ۚۨۨۥۘۖۗۢۛۖۖۛ۟ۙ۟ۡ";
                    break;
                case 917571739:
                    str = "ۜ۬ۢۧۚۥۥ۟ۦۘ۫ۡۨۢۘۡ";
                    break;
                case 1365457150:
                    this.f1017d.setLayoutParams(layoutParams);
                    str = "۠ۘۛۚۤ۠ۢ۫ۛ۠ۖۘۜۗۡ";
                    break;
            }
        }
    }

    public void setOnHueChangedListener(OnHueChangedListener onHueChangedListener) {
        String str = "ۨ۟۬۫ۘۡۥ۬ۗۤۙ۬۠ۧۛۘۜۗ";
        while (true) {
            switch ((str.hashCode() ^ 666) ^ 509512455) {
                case -2090880995:
                    str = "۟ۜۨۧۘۢۛۚۧ۬ۘۥۘۧۖۜ";
                    break;
                case -1479086127:
                    this.f1019f = onHueChangedListener;
                    str = "ۢۗۚ۟ۖۨۘۖۚۨ۫ۥۤۛۥۘۛ۠ۛۨۨۡۘۤۡۨۘ";
                    break;
                case 120013624:
                    str = "ۢۛۨۘۨۗۜۜۡۥۙ۬۫ۙۖۧ۠۬ۛۖۥۖۘ۬ۙ۟";
                    break;
                case 2111919811:
                    return;
            }
        }
    }
}
