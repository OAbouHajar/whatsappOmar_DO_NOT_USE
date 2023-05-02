package X;

import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.obwhatsapp.R;
import java.lang.ref.WeakReference;

/* renamed from: X.06G  reason: invalid class name */
public class AnonymousClass06G extends C004301w implements AnonymousClass06H, LayoutInflater.Factory2 {
    public static final AnonymousClass00O A0n = new AnonymousClass00O();
    public static final boolean A0o;
    public static final boolean A0p;
    public static final boolean A0q = (!"robolectric".equals(Build.FINGERPRINT));
    public static final int[] A0r = {16842836};
    public int A00;
    public int A01 = -100;
    public int A02;
    public Rect A03;
    public Rect A04;
    public MenuInflater A05;
    public View A06;
    public ViewGroup A07;
    public Window A08;
    public PopupWindow A09;
    public TextView A0A;
    public C005402i A0B;
    public AnonymousClass0ZN A0C;
    public AnonymousClass07R A0D;
    public C05510Rv A0E;
    public C05510Rv A0F;
    public AnonymousClass09A A0G;
    public AnonymousClass0ZO A0H;
    public AnonymousClass081 A0I;
    public AnonymousClass082 A0J;
    public AnonymousClass05J A0K;
    public ActionBarContextView A0L;
    public C13260lj A0M;
    public AnonymousClass0SH A0N = null;
    public CharSequence A0O;
    public Runnable A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public boolean A0d;
    public boolean A0e;
    public boolean A0f;
    public boolean A0g;
    public boolean A0h;
    public AnonymousClass09A[] A0i;
    public final Context A0j;
    public final C002300y A0k;
    public final Object A0l;
    public final Runnable A0m = new AnonymousClass06J(this);

    static {
        int i2 = Build.VERSION.SDK_INT;
        boolean z2 = false;
        boolean z3 = false;
        if (i2 < 21) {
            z3 = true;
        }
        A0o = z3;
        if (i2 >= 17) {
            z2 = true;
        }
        A0p = z2;
        if (z3) {
            Thread.setDefaultUncaughtExceptionHandler(new AnonymousClass06I(Thread.getDefaultUncaughtExceptionHandler()));
        }
    }

    public AnonymousClass06G(Context context, Window window, C002300y r6, Object obj) {
        this.A0j = context;
        this.A0k = r6;
        this.A0l = obj;
        if (obj instanceof Dialog) {
            while (true) {
                if (context != null) {
                    if (!(context instanceof C000900k)) {
                        if (!(context instanceof ContextWrapper)) {
                            break;
                        }
                        context = ((ContextWrapper) context).getBaseContext();
                    } else {
                        C000900k r4 = (C000900k) context;
                        if (r4 != null) {
                            this.A01 = ((AnonymousClass06G) r4.A1S()).A01;
                        }
                    }
                } else {
                    break;
                }
            }
        }
        if (this.A01 == -100) {
            AnonymousClass00O r2 = A0n;
            String name = obj.getClass().getName();
            Number number = (Number) r2.get(name);
            if (number != null) {
                this.A01 = number.intValue();
                r2.remove(name);
            }
        }
        if (window != null) {
            A0S(window);
        }
        AnonymousClass06K.A02();
    }

    public static final Configuration A02(Context context, Configuration configuration, int i2) {
        int i3 = i2 != 1 ? i2 != 2 ? context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i3 | (configuration2.uiMode & -49);
        return configuration2;
    }

    public Context A03(Context context) {
        this.A0S = true;
        int i2 = this.A01;
        if (i2 == -100) {
            i2 = C004301w.A00;
        }
        int A0I2 = A0I(context, i2);
        Configuration configuration = null;
        if (A0p && (context instanceof ContextThemeWrapper)) {
            try {
                AnonymousClass0L3.A00(A02(context, (Configuration) null, A0I2), (ContextThemeWrapper) context);
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof AnonymousClass06V) {
            try {
                ((AnonymousClass06V) context).A01(A02(context, (Configuration) null, A0I2));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!A0q) {
            return context;
        }
        if (Build.VERSION.SDK_INT >= 17) {
            Configuration configuration2 = new Configuration();
            configuration2.uiMode = -1;
            configuration2.fontScale = 0.0f;
            Configuration configuration3 = AnonymousClass06W.A00(context, configuration2).getResources().getConfiguration();
            Configuration configuration4 = context.getResources().getConfiguration();
            configuration3.uiMode = configuration4.uiMode;
            if (!configuration3.equals(configuration4)) {
                configuration = new Configuration();
                configuration.fontScale = 0.0f;
                if (configuration3.diff(configuration4) != 0) {
                    float f2 = configuration3.fontScale;
                    float f3 = configuration4.fontScale;
                    if (f2 != f3) {
                        configuration.fontScale = f3;
                    }
                    int i3 = configuration3.mcc;
                    int i4 = configuration4.mcc;
                    if (i3 != i4) {
                        configuration.mcc = i4;
                    }
                    int i5 = configuration3.mnc;
                    int i6 = configuration4.mnc;
                    if (i5 != i6) {
                        configuration.mnc = i6;
                    }
                    int i7 = Build.VERSION.SDK_INT;
                    if (i7 >= 24) {
                        AnonymousClass0L1.A00(configuration3, configuration4, configuration);
                    } else if (!AnonymousClass08I.A01(configuration3.locale, configuration4.locale)) {
                        configuration.locale = configuration4.locale;
                    }
                    int i8 = configuration3.touchscreen;
                    int i9 = configuration4.touchscreen;
                    if (i8 != i9) {
                        configuration.touchscreen = i9;
                    }
                    int i10 = configuration3.keyboard;
                    int i11 = configuration4.keyboard;
                    if (i10 != i11) {
                        configuration.keyboard = i11;
                    }
                    int i12 = configuration3.keyboardHidden;
                    int i13 = configuration4.keyboardHidden;
                    if (i12 != i13) {
                        configuration.keyboardHidden = i13;
                    }
                    int i14 = configuration3.navigation;
                    int i15 = configuration4.navigation;
                    if (i14 != i15) {
                        configuration.navigation = i15;
                    }
                    int i16 = configuration3.navigationHidden;
                    int i17 = configuration4.navigationHidden;
                    if (i16 != i17) {
                        configuration.navigationHidden = i17;
                    }
                    int i18 = configuration3.orientation;
                    int i19 = configuration4.orientation;
                    if (i18 != i19) {
                        configuration.orientation = i19;
                    }
                    int i20 = configuration3.screenLayout & 15;
                    int i21 = configuration4.screenLayout & 15;
                    if (i20 != i21) {
                        configuration.screenLayout |= i21;
                    }
                    int i22 = configuration3.screenLayout & 192;
                    int i23 = configuration4.screenLayout & 192;
                    if (i22 != i23) {
                        configuration.screenLayout |= i23;
                    }
                    int i24 = configuration3.screenLayout & 48;
                    int i25 = configuration4.screenLayout & 48;
                    if (i24 != i25) {
                        configuration.screenLayout |= i25;
                    }
                    int i26 = configuration3.screenLayout & 768;
                    int i27 = configuration4.screenLayout & 768;
                    if (i26 != i27) {
                        configuration.screenLayout |= i27;
                    }
                    if (i7 >= 26) {
                        AnonymousClass0L2.A00(configuration3, configuration4, configuration);
                    }
                    int i28 = configuration3.uiMode & 15;
                    int i29 = configuration4.uiMode & 15;
                    if (i28 != i29) {
                        configuration.uiMode |= i29;
                    }
                    int i30 = configuration3.uiMode & 48;
                    int i31 = configuration4.uiMode & 48;
                    if (i30 != i31) {
                        configuration.uiMode |= i31;
                    }
                    int i32 = configuration3.screenWidthDp;
                    int i33 = configuration4.screenWidthDp;
                    if (i32 != i33) {
                        configuration.screenWidthDp = i33;
                    }
                    int i34 = configuration3.screenHeightDp;
                    int i35 = configuration4.screenHeightDp;
                    if (i34 != i35) {
                        configuration.screenHeightDp = i35;
                    }
                    int i36 = configuration3.smallestScreenWidthDp;
                    int i37 = configuration4.smallestScreenWidthDp;
                    if (i36 != i37) {
                        configuration.smallestScreenWidthDp = i37;
                    }
                    if (i7 >= 17) {
                        AnonymousClass06W.A01(configuration3, configuration4, configuration);
                    }
                }
            }
        }
        Configuration A022 = A02(context, configuration, A0I2);
        AnonymousClass06V r3 = new AnonymousClass06V(context, (int) R.style.style0334);
        r3.A01(A022);
        try {
            if (context.getTheme() != null) {
                Resources.Theme theme = r3.getTheme();
                int i38 = Build.VERSION.SDK_INT;
                if (i38 >= 29) {
                    AnonymousClass0LU.A00(theme);
                } else if (i38 >= 23) {
                    C05810Tc.A00(theme);
                    return r3;
                }
            }
        } catch (NullPointerException unused3) {
        }
        return r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00b9, code lost:
        if ("include".equals(r4.getName()) == false) goto L_0x00bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00c7, code lost:
        if (((org.xmlpull.v1.XmlPullParser) r10).getDepth() > 1) goto L_0x00c9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View A04(android.view.View r16, java.lang.String r17, android.content.Context r18, android.util.AttributeSet r19) {
        /*
            r15 = this;
            X.081 r0 = r15.A0I
            r11 = 0
            if (r0 != 0) goto L_0x001c
            android.content.Context r1 = r15.A0j
            int[] r0 = X.AnonymousClass05L.A09
            android.content.res.TypedArray r1 = r1.obtainStyledAttributes(r0)
            r0 = 116(0x74, float:1.63E-43)
            java.lang.String r3 = r1.getString(r0)
            if (r3 != 0) goto L_0x0064
            X.081 r0 = new X.081
            r0.<init>()
            r15.A0I = r0
        L_0x001c:
            boolean r12 = A0o
            r2 = 1
            r7 = r16
            r10 = r19
            if (r12 == 0) goto L_0x00ca
            X.082 r1 = r15.A0J
            if (r1 != 0) goto L_0x0030
            X.082 r1 = new X.082
            r1.<init>()
            r15.A0J = r1
        L_0x0030:
            boolean r3 = r10 instanceof org.xmlpull.v1.XmlPullParser
            if (r3 == 0) goto L_0x00bb
            r6 = r10
            org.xmlpull.v1.XmlPullParser r6 = (org.xmlpull.v1.XmlPullParser) r6
            int r0 = r6.getDepth()
            if (r0 != r2) goto L_0x00bb
            java.util.Deque r5 = r1.A00
        L_0x003f:
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x009a
            java.lang.Object r0 = r5.peek()
            java.lang.ref.Reference r0 = (java.lang.ref.Reference) r0
            java.lang.Object r4 = r0.get()
            org.xmlpull.v1.XmlPullParser r4 = (org.xmlpull.v1.XmlPullParser) r4
            if (r4 == 0) goto L_0x0060
            int r1 = r4.getEventType()     // Catch:{ XmlPullParserException -> 0x0060 }
            r0 = 3
            if (r1 == r0) goto L_0x0060
            int r0 = r4.getEventType()     // Catch:{ XmlPullParserException -> 0x0060 }
            if (r0 != r2) goto L_0x009b
        L_0x0060:
            r5.pop()
            goto L_0x003f
        L_0x0064:
            java.lang.Class r1 = java.lang.Class.forName(r3)     // Catch:{ all -> 0x0079 }
            java.lang.Class[] r0 = new java.lang.Class[r11]     // Catch:{ all -> 0x0079 }
            java.lang.reflect.Constructor r1 = r1.getDeclaredConstructor(r0)     // Catch:{ all -> 0x0079 }
            java.lang.Object[] r0 = new java.lang.Object[r11]     // Catch:{ all -> 0x0079 }
            java.lang.Object r0 = r1.newInstance(r0)     // Catch:{ all -> 0x0079 }
            X.081 r0 = (X.AnonymousClass081) r0     // Catch:{ all -> 0x0079 }
            r15.A0I = r0     // Catch:{ all -> 0x0079 }
            goto L_0x001c
        L_0x0079:
            r2 = move-exception
            java.lang.String r0 = "Failed to instantiate custom view inflater "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r3)
            java.lang.String r0 = ". Falling back to default."
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "AppCompatDelegate"
            android.util.Log.i(r0, r1, r2)
            X.081 r0 = new X.081
            r0.<init>()
            r15.A0I = r0
            goto L_0x001c
        L_0x009a:
            r4 = 0
        L_0x009b:
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r6)
            r5.push(r0)
            if (r4 == 0) goto L_0x00bb
            if (r6 == r4) goto L_0x00bb
            int r1 = r4.getEventType()     // Catch:{ XmlPullParserException -> 0x00bb }
            r0 = 2
            if (r1 != r0) goto L_0x00bb
            java.lang.String r1 = "include"
            java.lang.String r0 = r4.getName()     // Catch:{ XmlPullParserException -> 0x00bb }
            boolean r1 = r1.equals(r0)     // Catch:{ XmlPullParserException -> 0x00bb }
            r0 = 1
            if (r1 != 0) goto L_0x00bc
        L_0x00bb:
            r0 = 0
        L_0x00bc:
            if (r0 != 0) goto L_0x00c9
            if (r3 == 0) goto L_0x00d7
            r0 = r10
            org.xmlpull.v1.XmlPullParser r0 = (org.xmlpull.v1.XmlPullParser) r0
            int r0 = r0.getDepth()
            if (r0 <= r2) goto L_0x00ca
        L_0x00c9:
            r11 = 1
        L_0x00ca:
            X.081 r6 = r15.A0I
            r13 = 1
            r14 = 0
            r8 = r17
            r9 = r18
            android.view.View r0 = r6.createView(r7, r8, r9, r10, r11, r12, r13, r14)
            return r0
        L_0x00d7:
            r2 = r7
            android.view.ViewParent r2 = (android.view.ViewParent) r2
            if (r2 == 0) goto L_0x00ca
            android.view.Window r0 = r15.A08
            android.view.View r1 = r0.getDecorView()
        L_0x00e2:
            if (r2 == r1) goto L_0x00ca
            boolean r0 = r2 instanceof android.view.View
            if (r0 == 0) goto L_0x00ca
            r0 = r2
            android.view.View r0 = (android.view.View) r0
            boolean r0 = X.C004601z.A0t(r0)
            if (r0 != 0) goto L_0x00ca
            android.view.ViewParent r2 = r2.getParent()
            if (r2 != 0) goto L_0x00e2
            goto L_0x00c9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass06G.A04(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00fd, code lost:
        if (r1 == false) goto L_0x00ff;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass05J A05(X.C009804r r11) {
        /*
            r10 = this;
            if (r11 == 0) goto L_0x0191
            X.05J r0 = r10.A0K
            if (r0 == 0) goto L_0x0009
            r0.A05()
        L_0x0009:
            X.0ZH r6 = new X.0ZH
            r6.<init>(r10, r11)
            r10.A0O()
            X.02i r0 = r10.A0B
            if (r0 == 0) goto L_0x0024
            X.05J r1 = r0.A04(r6)
            r10.A0K = r1
            if (r1 == 0) goto L_0x0024
            X.00y r0 = r10.A0k
            if (r0 == 0) goto L_0x0024
            r0.AYY(r1)
        L_0x0024:
            X.05J r0 = r10.A0K
            if (r0 != 0) goto L_0x0139
            X.0SH r0 = r10.A0N
            if (r0 == 0) goto L_0x002f
            r0.A01()
        L_0x002f:
            X.05J r0 = r10.A0K
            if (r0 == 0) goto L_0x0036
            r0.A05()
        L_0x0036:
            X.00y r2 = r10.A0k
            r5 = 0
            androidx.appcompat.widget.ActionBarContextView r0 = r10.A0L
            r4 = 0
            r8 = 1
            if (r0 != 0) goto L_0x00bf
            boolean r0 = r10.A0b
            if (r0 == 0) goto L_0x0165
            android.util.TypedValue r7 = new android.util.TypedValue
            r7.<init>()
            android.content.Context r9 = r10.A0j
            android.content.res.Resources$Theme r3 = r9.getTheme()
            r0 = 2130968589(0x7f04000d, float:1.7545836E38)
            r3.resolveAttribute(r0, r7, r8)
            int r0 = r7.resourceId
            if (r0 == 0) goto L_0x0162
            android.content.res.Resources r0 = r9.getResources()
            android.content.res.Resources$Theme r1 = r0.newTheme()
            r1.setTo(r3)
            int r0 = r7.resourceId
            r1.applyStyle(r0, r8)
            X.06V r3 = new X.06V
            r3.<init>((android.content.Context) r9, (int) r4)
            android.content.res.Resources$Theme r0 = r3.getTheme()
            r0.setTo(r1)
        L_0x0074:
            androidx.appcompat.widget.ActionBarContextView r0 = new androidx.appcompat.widget.ActionBarContextView
            r0.<init>(r3, r5)
            r10.A0L = r0
            r0 = 2130968604(0x7f04001c, float:1.7545866E38)
            android.widget.PopupWindow r1 = new android.widget.PopupWindow
            r1.<init>(r3, r5, r0)
            r10.A09 = r1
            r0 = 2
            X.AnonymousClass0Vw.A01(r1, r0)
            android.widget.PopupWindow r1 = r10.A09
            androidx.appcompat.widget.ActionBarContextView r0 = r10.A0L
            r1.setContentView(r0)
            android.widget.PopupWindow r1 = r10.A09
            r0 = -1
            r1.setWidth(r0)
            android.content.res.Resources$Theme r1 = r3.getTheme()
            r0 = 2130968583(0x7f040007, float:1.7545824E38)
            r1.resolveAttribute(r0, r7, r8)
            int r1 = r7.data
            android.content.res.Resources r0 = r3.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r1 = android.util.TypedValue.complexToDimensionPixelSize(r1, r0)
            androidx.appcompat.widget.ActionBarContextView r0 = r10.A0L
            r0.A01 = r1
            android.widget.PopupWindow r1 = r10.A09
            r0 = -2
            r1.setHeight(r0)
            X.0f9 r0 = new X.0f9
            r0.<init>(r10)
            r10.A0P = r0
        L_0x00bf:
            androidx.appcompat.widget.ActionBarContextView r0 = r10.A0L
            if (r0 == 0) goto L_0x012c
            X.0SH r0 = r10.A0N
            if (r0 == 0) goto L_0x00ca
            r0.A01()
        L_0x00ca:
            androidx.appcompat.widget.ActionBarContextView r0 = r10.A0L
            r0.A03()
            androidx.appcompat.widget.ActionBarContextView r0 = r10.A0L
            android.content.Context r1 = r0.getContext()
            androidx.appcompat.widget.ActionBarContextView r0 = r10.A0L
            X.0Cs r3 = new X.0Cs
            r3.<init>(r1, r6, r0)
            X.07w r1 = r3.A02
            X.04r r0 = r6.A00
            boolean r0 = r0.APA(r1, r3)
            if (r0 == 0) goto L_0x015f
            r3.A06()
            androidx.appcompat.widget.ActionBarContextView r0 = r10.A0L
            r0.A05(r3)
            r10.A0K = r3
            boolean r0 = r10.A0g
            if (r0 == 0) goto L_0x00ff
            android.view.ViewGroup r0 = r10.A07
            if (r0 == 0) goto L_0x00ff
            boolean r1 = X.C004601z.A0u(r0)
            r0 = 1
            if (r1 != 0) goto L_0x0100
        L_0x00ff:
            r0 = 0
        L_0x0100:
            r3 = 1065353216(0x3f800000, float:1.0)
            androidx.appcompat.widget.ActionBarContextView r1 = r10.A0L
            if (r0 == 0) goto L_0x013a
            r0 = 0
            r1.setAlpha(r0)
            androidx.appcompat.widget.ActionBarContextView r0 = r10.A0L
            X.0SH r1 = X.C004601z.A0H(r0)
            r1.A03(r3)
            r10.A0N = r1
            X.0EN r0 = new X.0EN
            r0.<init>(r10)
            r1.A0A(r0)
        L_0x011d:
            android.widget.PopupWindow r0 = r10.A09
            if (r0 == 0) goto L_0x012c
            android.view.Window r0 = r10.A08
            android.view.View r1 = r0.getDecorView()
            java.lang.Runnable r0 = r10.A0P
            r1.post(r0)
        L_0x012c:
            X.05J r0 = r10.A0K
            if (r0 == 0) goto L_0x0135
            if (r2 == 0) goto L_0x0135
            r2.AYY(r0)
        L_0x0135:
            X.05J r0 = r10.A0K
            r10.A0K = r0
        L_0x0139:
            return r0
        L_0x013a:
            r1.setAlpha(r3)
            androidx.appcompat.widget.ActionBarContextView r0 = r10.A0L
            r0.setVisibility(r4)
            androidx.appcompat.widget.ActionBarContextView r1 = r10.A0L
            r0 = 32
            r1.sendAccessibilityEvent(r0)
            androidx.appcompat.widget.ActionBarContextView r0 = r10.A0L
            android.view.ViewParent r0 = r0.getParent()
            boolean r0 = r0 instanceof android.view.View
            if (r0 == 0) goto L_0x011d
            androidx.appcompat.widget.ActionBarContextView r0 = r10.A0L
            android.view.ViewParent r0 = r0.getParent()
            android.view.View r0 = (android.view.View) r0
            X.C004601z.A0T(r0)
            goto L_0x011d
        L_0x015f:
            r10.A0K = r5
            goto L_0x012c
        L_0x0162:
            r3 = r9
            goto L_0x0074
        L_0x0165:
            android.view.ViewGroup r1 = r10.A07
            r0 = 2131361915(0x7f0a007b, float:1.8343596E38)
            android.view.View r1 = r1.findViewById(r0)
            androidx.appcompat.widget.ViewStubCompat r1 = (androidx.appcompat.widget.ViewStubCompat) r1
            if (r1 == 0) goto L_0x00bf
            r10.A0O()
            X.02i r0 = r10.A0B
            if (r0 == 0) goto L_0x017f
            android.content.Context r0 = r0.A02()
            if (r0 != 0) goto L_0x0181
        L_0x017f:
            android.content.Context r0 = r10.A0j
        L_0x0181:
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            r1.A02 = r0
            android.view.View r0 = r1.A00()
            androidx.appcompat.widget.ActionBarContextView r0 = (androidx.appcompat.widget.ActionBarContextView) r0
            r10.A0L = r0
            goto L_0x00bf
        L_0x0191:
            java.lang.String r1 = "ActionMode callback can not be null."
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass06G.A05(X.04r):X.05J");
    }

    public void A06() {
        LayoutInflater from = LayoutInflater.from(this.A0j);
        if (from.getFactory() == null) {
            AnonymousClass07Q.A01(this, from);
        } else if (!(from.getFactory2() instanceof AnonymousClass06G)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    public void A07() {
        A0O();
        C005402i r0 = this.A0B;
        if (r0 == null || !r0.A0T()) {
            this.A00 = (1 << 0) | this.A00;
            if (!this.A0Z) {
                this.A08.getDecorView().postOnAnimation(this.A0m);
                this.A0Z = true;
            }
        }
    }

    public void A08() {
        Object obj = this.A0l;
        boolean z2 = obj instanceof Activity;
        if (z2) {
            synchronized (C004301w.A02) {
                C004301w.A01(this);
            }
        }
        if (this.A0Z) {
            this.A08.getDecorView().removeCallbacks(this.A0m);
        }
        this.A0f = false;
        this.A0a = true;
        if (this.A01 == -100 || !z2 || !((Activity) obj).isChangingConfigurations()) {
            A0n.remove(obj.getClass().getName());
        } else {
            A0n.put(obj.getClass().getName(), Integer.valueOf(this.A01));
        }
        C005402i r0 = this.A0B;
        if (r0 != null) {
            r0.A05();
        }
        C05510Rv r02 = this.A0F;
        if (r02 != null) {
            r02.A02();
        }
        C05510Rv r03 = this.A0E;
        if (r03 != null) {
            r03.A02();
        }
    }

    public void A09() {
        this.A0f = false;
        A0O();
        C005402i r0 = this.A0B;
        if (r0 != null) {
            r0.A0R(false);
        }
    }

    public void A0A(int i2) {
        A0M();
        ViewGroup viewGroup = (ViewGroup) this.A07.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.A0j).inflate(i2, viewGroup);
        this.A0D.A00.onContentChanged();
    }

    public void A0B(int i2) {
        if (this.A01 != i2) {
            this.A01 = i2;
            if (this.A0S) {
                A0V(true);
            }
        }
    }

    public void A0C(Configuration configuration) {
        if (this.A0Y && this.A0g) {
            A0O();
            C005402i r0 = this.A0B;
            if (r0 != null) {
                r0.A0C(configuration);
            }
        }
        AnonymousClass06K A012 = AnonymousClass06K.A01();
        Context context = this.A0j;
        synchronized (A012) {
            AnonymousClass06L r1 = A012.A00;
            synchronized (r1) {
                AnonymousClass03G r02 = (AnonymousClass03G) r1.A06.get(context);
                if (r02 != null) {
                    r02.A05();
                }
            }
        }
        A0V(false);
    }

    public void A0D(Bundle bundle) {
        this.A0S = true;
        A0V(false);
        A0N();
        Object obj = this.A0l;
        if (obj instanceof Activity) {
            String str = null;
            try {
                Activity activity = (Activity) obj;
                str = C015407k.A00(activity.getComponentName(), activity);
            } catch (PackageManager.NameNotFoundException e2) {
                throw new IllegalArgumentException(e2);
            } catch (IllegalArgumentException unused) {
            }
            if (str != null) {
                C005402i r0 = this.A0B;
                if (r0 == null) {
                    this.A0V = true;
                } else {
                    r0.A0M(true);
                }
            }
            synchronized (C004301w.A02) {
                C004301w.A01(this);
                C004301w.A01.add(new WeakReference(this));
            }
        }
        this.A0U = true;
    }

    public void A0E(View view) {
        A0M();
        ViewGroup viewGroup = (ViewGroup) this.A07.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.A0D.A00.onContentChanged();
    }

    public void A0F(View view, ViewGroup.LayoutParams layoutParams) {
        A0M();
        ((ViewGroup) this.A07.findViewById(16908290)).addView(view, layoutParams);
        this.A0D.A00.onContentChanged();
    }

    public void A0G(View view, ViewGroup.LayoutParams layoutParams) {
        A0M();
        ViewGroup viewGroup = (ViewGroup) this.A07.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.A0D.A00.onContentChanged();
    }

    public final void A0H(CharSequence charSequence) {
        this.A0O = charSequence;
        C13260lj r0 = this.A0M;
        if (r0 != null) {
            r0.setWindowTitle(charSequence);
            return;
        }
        C005402i r02 = this.A0B;
        if (r02 != null) {
            r02.A0K(charSequence);
            return;
        }
        TextView textView = this.A0A;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public int A0I(Context context, int i2) {
        C05510Rv A0K2;
        if (i2 != -100) {
            if (i2 != -1) {
                if (i2 != 0) {
                    if (!(i2 == 1 || i2 == 2)) {
                        if (i2 == 3) {
                            A0K2 = this.A0E;
                            if (A0K2 == null) {
                                A0K2 = new C02490Ch(context, this);
                                this.A0E = A0K2;
                            }
                        } else {
                            throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                        }
                    }
                } else if (Build.VERSION.SDK_INT < 23 || ((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                    A0K2 = A0K(context);
                }
                return A0K2.A00();
            }
            return i2;
        }
        return -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00b4, code lost:
        if (r10 != false) goto L_0x00b6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00bf  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A0J(android.graphics.Rect r13, X.AnonymousClass030 r14) {
        /*
            r12 = this;
            r6 = 0
            if (r14 == 0) goto L_0x011f
            int r5 = r14.A06()
        L_0x0007:
            androidx.appcompat.widget.ActionBarContextView r0 = r12.A0L
            r9 = 8
            if (r0 == 0) goto L_0x011d
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            boolean r0 = r0 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L_0x011d
            androidx.appcompat.widget.ActionBarContextView r0 = r12.A0L
            android.view.ViewGroup$LayoutParams r4 = r0.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r4 = (android.view.ViewGroup.MarginLayoutParams) r4
            androidx.appcompat.widget.ActionBarContextView r0 = r12.A0L
            boolean r0 = r0.isShown()
            r11 = 1
            if (r0 == 0) goto L_0x0115
            android.graphics.Rect r0 = r12.A03
            if (r0 != 0) goto L_0x0038
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r12.A03 = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r12.A04 = r0
        L_0x0038:
            android.graphics.Rect r8 = r12.A03
            android.graphics.Rect r7 = r12.A04
            if (r14 != 0) goto L_0x0100
            r8.set(r13)
        L_0x0041:
            android.view.ViewGroup r0 = r12.A07
            X.C06470Wb.A00(r8, r7, r0)
            int r3 = r8.top
            int r2 = r8.left
            int r1 = r8.right
            android.view.ViewGroup r0 = r12.A07
            X.030 r0 = X.C004601z.A0I(r0)
            if (r0 != 0) goto L_0x00f6
            r8 = 0
            r7 = 0
        L_0x0056:
            int r0 = r4.topMargin
            if (r0 != r3) goto L_0x00ed
            int r0 = r4.leftMargin
            if (r0 != r2) goto L_0x00ed
            int r0 = r4.rightMargin
            if (r0 != r1) goto L_0x00ed
            r10 = 0
        L_0x0063:
            if (r3 <= 0) goto L_0x00c9
            android.view.View r0 = r12.A06
            if (r0 != 0) goto L_0x00c9
            android.content.Context r1 = r12.A0j
            android.view.View r0 = new android.view.View
            r0.<init>(r1)
            r12.A06 = r0
            r0.setVisibility(r9)
            int r1 = r4.topMargin
            r0 = 51
            r3 = -1
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r2.<init>(r3, r1, r0)
            r2.leftMargin = r8
            r2.rightMargin = r7
            android.view.ViewGroup r1 = r12.A07
            android.view.View r0 = r12.A06
            r1.addView(r0, r3, r2)
        L_0x008a:
            android.view.View r0 = r12.A06
            if (r0 == 0) goto L_0x00c7
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L_0x00ad
            android.view.View r3 = r12.A06
            int r0 = r3.getWindowSystemUiVisibility()
            r2 = r0 & 8192(0x2000, float:1.14794E-41)
            android.content.Context r1 = r12.A0j
            r0 = 2131099653(0x7f060005, float:1.7811665E38)
            if (r2 == 0) goto L_0x00a6
            r0 = 2131099654(0x7f060006, float:1.7811667E38)
        L_0x00a6:
            int r0 = X.AnonymousClass00T.A00(r1, r0)
            r3.setBackgroundColor(r0)
        L_0x00ad:
            boolean r0 = r12.A0e
            if (r0 != 0) goto L_0x00b4
            if (r11 == 0) goto L_0x00b4
            r5 = 0
        L_0x00b4:
            if (r10 == 0) goto L_0x00bb
        L_0x00b6:
            androidx.appcompat.widget.ActionBarContextView r0 = r12.A0L
            r0.setLayoutParams(r4)
        L_0x00bb:
            android.view.View r0 = r12.A06
            if (r0 == 0) goto L_0x00c6
            if (r11 != 0) goto L_0x00c3
            r6 = 8
        L_0x00c3:
            r0.setVisibility(r6)
        L_0x00c6:
            return r5
        L_0x00c7:
            r11 = 0
            goto L_0x00ad
        L_0x00c9:
            android.view.View r0 = r12.A06
            if (r0 == 0) goto L_0x008a
            android.view.ViewGroup$LayoutParams r2 = r0.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            int r0 = r2.height
            int r1 = r4.topMargin
            if (r0 != r1) goto L_0x00e1
            int r0 = r2.leftMargin
            if (r0 != r8) goto L_0x00e1
            int r0 = r2.rightMargin
            if (r0 == r7) goto L_0x008a
        L_0x00e1:
            r2.height = r1
            r2.leftMargin = r8
            r2.rightMargin = r7
            android.view.View r0 = r12.A06
            r0.setLayoutParams(r2)
            goto L_0x008a
        L_0x00ed:
            r4.topMargin = r3
            r4.leftMargin = r2
            r4.rightMargin = r1
            r10 = 1
            goto L_0x0063
        L_0x00f6:
            int r8 = r0.A04()
            int r7 = r0.A05()
            goto L_0x0056
        L_0x0100:
            int r3 = r14.A04()
            int r2 = r14.A06()
            int r1 = r14.A05()
            int r0 = r14.A03()
            r8.set(r3, r2, r1, r0)
            goto L_0x0041
        L_0x0115:
            int r0 = r4.topMargin
            if (r0 == 0) goto L_0x011d
            r4.topMargin = r6
            r11 = 0
            goto L_0x00b6
        L_0x011d:
            r11 = 0
            goto L_0x00bb
        L_0x011f:
            if (r13 == 0) goto L_0x0125
            int r5 = r13.top
            goto L_0x0007
        L_0x0125:
            r5 = 0
            goto L_0x0007
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass06G.A0J(android.graphics.Rect, X.030):int");
    }

    public final C05510Rv A0K(Context context) {
        C05510Rv r0 = this.A0F;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass0OY r2 = AnonymousClass0OY.A03;
        if (r2 == null) {
            Context applicationContext = context.getApplicationContext();
            r2 = new AnonymousClass0OY(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            AnonymousClass0OY.A03 = r2;
        }
        C02500Ci r02 = new C02500Ci(this, r2);
        this.A0F = r02;
        return r02;
    }

    public AnonymousClass09A A0L(int i2) {
        AnonymousClass09A[] r3 = this.A0i;
        if (r3 == null || r3.length <= i2) {
            AnonymousClass09A[] r2 = new AnonymousClass09A[(i2 + 1)];
            if (r3 != null) {
                System.arraycopy(r3, 0, r2, 0, r3.length);
            }
            this.A0i = r2;
            r3 = r2;
        }
        AnonymousClass09A r0 = r3[i2];
        if (r0 != null) {
            return r0;
        }
        AnonymousClass09A r02 = new AnonymousClass09A(i2);
        r3[i2] = r02;
        return r02;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006e, code lost:
        if (r5 != null) goto L_0x0070;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0M() {
        /*
            r10 = this;
            boolean r0 = r10.A0g
            if (r0 != 0) goto L_0x02b9
            android.content.Context r8 = r10.A0j
            int[] r7 = X.AnonymousClass05L.A09
            android.content.res.TypedArray r1 = r8.obtainStyledAttributes(r7)
            r4 = 117(0x75, float:1.64E-43)
            boolean r0 = r1.hasValue(r4)
            if (r0 == 0) goto L_0x01c9
            r0 = 126(0x7e, float:1.77E-43)
            r2 = 0
            boolean r0 = r1.getBoolean(r0, r2)
            r3 = 1
            if (r0 == 0) goto L_0x0128
            boolean r0 = r10.A0Y
            if (r0 == 0) goto L_0x0024
            r10.A0Y = r2
        L_0x0024:
            r10.A0P()
            r10.A0h = r3
        L_0x0029:
            r0 = 118(0x76, float:1.65E-43)
            boolean r0 = r1.getBoolean(r0, r2)
            if (r0 == 0) goto L_0x0036
            r10.A0P()
            r10.A0d = r3
        L_0x0036:
            r0 = 119(0x77, float:1.67E-43)
            boolean r0 = r1.getBoolean(r0, r2)
            if (r0 == 0) goto L_0x0043
            r10.A0P()
            r10.A0e = r3
        L_0x0043:
            boolean r0 = r1.getBoolean(r2, r2)
            r10.A0b = r0
            r1.recycle()
            r10.A0N()
            android.view.Window r0 = r10.A08
            r0.getDecorView()
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r8)
            boolean r0 = r10.A0h
            r6 = 0
            if (r0 != 0) goto L_0x0116
            boolean r0 = r10.A0b
            if (r0 == 0) goto L_0x00a3
            r0 = 2131558412(0x7f0d000c, float:1.874214E38)
            android.view.View r5 = r4.inflate(r0, r6)
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            r10.A0d = r2
            r10.A0Y = r2
        L_0x006e:
            if (r5 == 0) goto L_0x0186
        L_0x0070:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 21
            if (r1 < r0) goto L_0x0093
            com.facebook.redex.IDxIListenerShape216S0100000_I0 r0 = new com.facebook.redex.IDxIListenerShape216S0100000_I0
            r0.<init>(r10, r2)
            X.C004601z.A0k(r5, r0)
        L_0x007e:
            X.0lj r0 = r10.A0M
            if (r0 != 0) goto L_0x008d
            r0 = 2131366639(0x7f0a12ef, float:1.8353177E38)
            android.view.View r0 = r5.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r10.A0A = r0
        L_0x008d:
            java.lang.String r9 = "Could not invoke makeOptionalFitsSystemWindows"
            java.lang.String r4 = "ViewUtils"
            goto L_0x0139
        L_0x0093:
            boolean r0 = r5 instanceof X.AnonymousClass092
            if (r0 == 0) goto L_0x007e
            r1 = r5
            X.092 r1 = (X.AnonymousClass092) r1
            X.095 r0 = new X.095
            r0.<init>(r10)
            r1.setOnFitSystemWindowsListener(r0)
            goto L_0x007e
        L_0x00a3:
            boolean r0 = r10.A0Y
            if (r0 == 0) goto L_0x0186
            android.util.TypedValue r4 = new android.util.TypedValue
            r4.<init>()
            android.content.res.Resources$Theme r1 = r8.getTheme()
            r0 = 2130968589(0x7f04000d, float:1.7545836E38)
            r1.resolveAttribute(r0, r4, r3)
            int r1 = r4.resourceId
            if (r1 == 0) goto L_0x0114
            X.06V r0 = new X.06V
            r0.<init>((android.content.Context) r8, (int) r1)
        L_0x00bf:
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r0)
            r0 = 2131558423(0x7f0d0017, float:1.8742161E38)
            android.view.View r5 = r1.inflate(r0, r6)
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            r0 = 2131363103(0x7f0a051f, float:1.8346005E38)
            android.view.View r1 = r5.findViewById(r0)
            X.0lj r1 = (X.C13260lj) r1
            r10.A0M = r1
            android.view.Window r0 = r10.A08
            android.view.Window$Callback r0 = r0.getCallback()
            r1.setWindowCallback(r0)
            boolean r0 = r10.A0d
            if (r0 == 0) goto L_0x00ee
            X.0lj r0 = r10.A0M
            androidx.appcompat.widget.ActionBarOverlayLayout r0 = (androidx.appcompat.widget.ActionBarOverlayLayout) r0
            r0.A01()
            r0.setOverlayMode(r3)
        L_0x00ee:
            boolean r0 = r10.A0X
            if (r0 == 0) goto L_0x0100
            X.0lj r0 = r10.A0M
            androidx.appcompat.widget.ActionBarOverlayLayout r0 = (androidx.appcompat.widget.ActionBarOverlayLayout) r0
            r0.A01()
            java.lang.String r1 = "ToolbarWidgetWrapper"
            java.lang.String r0 = "Progress display unsupported"
            android.util.Log.i(r1, r0)
        L_0x0100:
            boolean r0 = r10.A0W
            if (r0 == 0) goto L_0x0070
            X.0lj r0 = r10.A0M
            androidx.appcompat.widget.ActionBarOverlayLayout r0 = (androidx.appcompat.widget.ActionBarOverlayLayout) r0
            r0.A01()
            java.lang.String r1 = "ToolbarWidgetWrapper"
            java.lang.String r0 = "Progress display unsupported"
            android.util.Log.i(r1, r0)
            goto L_0x0070
        L_0x0114:
            r0 = r8
            goto L_0x00bf
        L_0x0116:
            boolean r1 = r10.A0e
            r0 = 2131558421(0x7f0d0015, float:1.8742157E38)
            if (r1 == 0) goto L_0x0120
            r0 = 2131558422(0x7f0d0016, float:1.874216E38)
        L_0x0120:
            android.view.View r5 = r4.inflate(r0, r6)
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            goto L_0x006e
        L_0x0128:
            boolean r0 = r1.getBoolean(r4, r2)
            if (r0 == 0) goto L_0x0029
            boolean r0 = r10.A0h
            if (r0 != 0) goto L_0x0029
            r10.A0P()
            r10.A0Y = r3
            goto L_0x0029
        L_0x0139:
            java.lang.Class r3 = r5.getClass()     // Catch:{ NoSuchMethodException -> 0x0155, IllegalAccessException | InvocationTargetException -> 0x015b }
            java.lang.String r1 = "makeOptionalFitsSystemWindows"
            java.lang.Class[] r0 = new java.lang.Class[r2]     // Catch:{ NoSuchMethodException -> 0x0155, IllegalAccessException | InvocationTargetException -> 0x015b }
            java.lang.reflect.Method r1 = r3.getMethod(r1, r0)     // Catch:{ NoSuchMethodException -> 0x0155, IllegalAccessException | InvocationTargetException -> 0x015b }
            boolean r0 = r1.isAccessible()     // Catch:{ NoSuchMethodException -> 0x0155, IllegalAccessException | InvocationTargetException -> 0x015b }
            if (r0 != 0) goto L_0x014f
            r0 = 1
            r1.setAccessible(r0)     // Catch:{ NoSuchMethodException -> 0x0155, IllegalAccessException | InvocationTargetException -> 0x015b }
        L_0x014f:
            java.lang.Object[] r0 = new java.lang.Object[r2]     // Catch:{ NoSuchMethodException -> 0x0155, IllegalAccessException | InvocationTargetException -> 0x015b }
            r1.invoke(r5, r0)     // Catch:{ NoSuchMethodException -> 0x0155, IllegalAccessException | InvocationTargetException -> 0x015b }
            goto L_0x015f
        L_0x0155:
            java.lang.String r0 = "Could not find method makeOptionalFitsSystemWindows. Oh well..."
            android.util.Log.d(r4, r0)
            goto L_0x015f
        L_0x015b:
            r0 = move-exception
            android.util.Log.d(r4, r9, r0)
        L_0x015f:
            r0 = 2131361885(0x7f0a005d, float:1.8343535E38)
            android.view.View r4 = r5.findViewById(r0)
            androidx.appcompat.widget.ContentFrameLayout r4 = (androidx.appcompat.widget.ContentFrameLayout) r4
            android.view.Window r0 = r10.A08
            r3 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r1 = r0.findViewById(r3)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            if (r1 == 0) goto L_0x01e4
        L_0x0175:
            int r0 = r1.getChildCount()
            if (r0 <= 0) goto L_0x01d4
            android.view.View r0 = r1.getChildAt(r2)
            r1.removeViewAt(r2)
            r4.addView(r0)
            goto L_0x0175
        L_0x0186:
            java.lang.String r0 = "AppCompat does not support the current theme features: { windowActionBar: "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            boolean r0 = r10.A0Y
            r1.append(r0)
            java.lang.String r0 = ", windowActionBarOverlay: "
            r1.append(r0)
            boolean r0 = r10.A0d
            r1.append(r0)
            java.lang.String r0 = ", android:windowIsFloating: "
            r1.append(r0)
            boolean r0 = r10.A0b
            r1.append(r0)
            java.lang.String r0 = ", windowActionModeOverlay: "
            r1.append(r0)
            boolean r0 = r10.A0e
            r1.append(r0)
            java.lang.String r0 = ", windowNoTitle: "
            r1.append(r0)
            boolean r0 = r10.A0h
            r1.append(r0)
            java.lang.String r0 = " }"
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x01c9:
            r1.recycle()
            java.lang.String r1 = "You need to use a Theme.AppCompat theme (or descendant) with this activity."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x01d4:
            r0 = -1
            r1.setId(r0)
            r4.setId(r3)
            boolean r0 = r1 instanceof android.widget.FrameLayout
            if (r0 == 0) goto L_0x01e4
            android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1
            r1.setForeground(r6)
        L_0x01e4:
            android.view.Window r0 = r10.A08
            r0.setContentView(r5)
            X.097 r0 = new X.097
            r0.<init>(r10)
            r4.A06 = r0
            r10.A07 = r5
            java.lang.Object r1 = r10.A0l
            boolean r0 = r1 instanceof android.app.Activity
            if (r0 == 0) goto L_0x02cc
            android.app.Activity r1 = (android.app.Activity) r1
            java.lang.CharSequence r1 = r1.getTitle()
        L_0x01fe:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x020b
            X.0lj r0 = r10.A0M
            if (r0 == 0) goto L_0x02ba
            r0.setWindowTitle(r1)
        L_0x020b:
            android.view.ViewGroup r0 = r10.A07
            android.view.View r4 = r0.findViewById(r3)
            androidx.appcompat.widget.ContentFrameLayout r4 = (androidx.appcompat.widget.ContentFrameLayout) r4
            android.view.Window r0 = r10.A08
            android.view.View r0 = r0.getDecorView()
            int r6 = r0.getPaddingLeft()
            int r5 = r0.getPaddingTop()
            int r3 = r0.getPaddingRight()
            int r1 = r0.getPaddingBottom()
            android.graphics.Rect r0 = r4.A07
            r0.set(r6, r5, r3, r1)
            boolean r0 = X.C004601z.A0u(r4)
            if (r0 == 0) goto L_0x0237
            r4.requestLayout()
        L_0x0237:
            android.content.res.TypedArray r3 = r8.obtainStyledAttributes(r7)
            r1 = 124(0x7c, float:1.74E-43)
            android.util.TypedValue r0 = r4.getMinWidthMajor()
            r3.getValue(r1, r0)
            r1 = 125(0x7d, float:1.75E-43)
            android.util.TypedValue r0 = r4.getMinWidthMinor()
            r3.getValue(r1, r0)
            r1 = 122(0x7a, float:1.71E-43)
            boolean r0 = r3.hasValue(r1)
            if (r0 == 0) goto L_0x025c
            android.util.TypedValue r0 = r4.getFixedWidthMajor()
            r3.getValue(r1, r0)
        L_0x025c:
            r1 = 123(0x7b, float:1.72E-43)
            boolean r0 = r3.hasValue(r1)
            if (r0 == 0) goto L_0x026b
            android.util.TypedValue r0 = r4.getFixedWidthMinor()
            r3.getValue(r1, r0)
        L_0x026b:
            r1 = 120(0x78, float:1.68E-43)
            boolean r0 = r3.hasValue(r1)
            if (r0 == 0) goto L_0x027a
            android.util.TypedValue r0 = r4.getFixedHeightMajor()
            r3.getValue(r1, r0)
        L_0x027a:
            r1 = 121(0x79, float:1.7E-43)
            boolean r0 = r3.hasValue(r1)
            if (r0 == 0) goto L_0x0289
            android.util.TypedValue r0 = r4.getFixedHeightMinor()
            r3.getValue(r1, r0)
        L_0x0289:
            r3.recycle()
            r4.requestLayout()
            r0 = 1
            r10.A0g = r0
            X.09A r1 = r10.A0L(r2)
            boolean r0 = r10.A0a
            if (r0 != 0) goto L_0x02b9
            X.07w r0 = r1.A0A
            if (r0 != 0) goto L_0x02b9
            r0 = 108(0x6c, float:1.51E-43)
            int r1 = r10.A00
            r2 = 1
            int r0 = r2 << r0
            r0 = r0 | r1
            r10.A00 = r0
            boolean r0 = r10.A0Z
            if (r0 != 0) goto L_0x02b9
            android.view.Window r0 = r10.A08
            android.view.View r1 = r0.getDecorView()
            java.lang.Runnable r0 = r10.A0m
            r1.postOnAnimation(r0)
            r10.A0Z = r2
        L_0x02b9:
            return
        L_0x02ba:
            X.02i r0 = r10.A0B
            if (r0 == 0) goto L_0x02c3
            r0.A0K(r1)
            goto L_0x020b
        L_0x02c3:
            android.widget.TextView r0 = r10.A0A
            if (r0 == 0) goto L_0x020b
            r0.setText(r1)
            goto L_0x020b
        L_0x02cc:
            java.lang.CharSequence r1 = r10.A0O
            goto L_0x01fe
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass06G.A0M():void");
    }

    public final void A0N() {
        if (this.A08 == null) {
            Object obj = this.A0l;
            if (obj instanceof Activity) {
                A0S(((Activity) obj).getWindow());
            }
        }
        if (this.A08 == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public final void A0O() {
        C02480Cg r1;
        A0M();
        if (this.A0Y && this.A0B == null) {
            Object obj = this.A0l;
            if (obj instanceof Activity) {
                r1 = new C02480Cg((Activity) obj, this.A0d);
            } else if (obj instanceof Dialog) {
                r1 = new C02480Cg((Dialog) obj);
            } else {
                return;
            }
            this.A0B = r1;
            r1.A0M(this.A0V);
        }
    }

    public final void A0P() {
        if (this.A0g) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public void A0Q(int i2) {
        AnonymousClass09A A0L2 = A0L(i2);
        if (A0L2.A0A != null) {
            Bundle bundle = new Bundle();
            A0L2.A0A.A0B(bundle);
            if (bundle.size() > 0) {
                A0L2.A05 = bundle;
            }
            C016607w r0 = A0L2.A0A;
            r0.A08();
            r0.clear();
        }
        A0L2.A0F = true;
        A0L2.A0E = true;
        if ((i2 == 108 || i2 == 0) && this.A0M != null) {
            AnonymousClass09A A0L3 = A0L(0);
            A0L3.A0D = false;
            A0X((KeyEvent) null, A0L3);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0076, code lost:
        if (r0.getCount() > 0) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0122, code lost:
        if (r0 != null) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0133, code lost:
        if (r0.width != -1) goto L_0x00b1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0R(android.view.KeyEvent r14, X.AnonymousClass09A r15) {
        /*
            r13 = this;
            boolean r0 = r15.A0C
            if (r0 != 0) goto L_0x001f
            boolean r0 = r13.A0a
            if (r0 != 0) goto L_0x001f
            int r2 = r15.A01
            r8 = 0
            r3 = 1
            if (r2 != 0) goto L_0x0020
            android.content.Context r0 = r13.A0j
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.screenLayout
            r1 = r0 & 15
            r0 = 4
            if (r1 != r0) goto L_0x0020
        L_0x001f:
            return
        L_0x0020:
            android.view.Window r0 = r13.A08
            android.view.Window$Callback r1 = r0.getCallback()
            if (r1 == 0) goto L_0x0034
            X.07w r0 = r15.A0A
            boolean r0 = r1.onMenuOpened(r2, r0)
            if (r0 != 0) goto L_0x0034
            r13.A0T(r15, r3)
            return
        L_0x0034:
            android.content.Context r6 = r13.A0j
            java.lang.String r0 = "window"
            java.lang.Object r2 = r6.getSystemService(r0)
            android.view.WindowManager r2 = (android.view.WindowManager) r2
            if (r2 == 0) goto L_0x001f
            boolean r0 = r13.A0X(r14, r15)
            if (r0 == 0) goto L_0x001f
            android.view.ViewGroup r4 = r15.A08
            r1 = -1
            r7 = -2
            if (r4 == 0) goto L_0x0137
            boolean r0 = r15.A0E
            if (r0 == 0) goto L_0x0126
            int r0 = r4.getChildCount()
            if (r0 <= 0) goto L_0x005b
            android.view.ViewGroup r0 = r15.A08
            r0.removeAllViews()
        L_0x005b:
            android.view.View r0 = r15.A06
            if (r0 == 0) goto L_0x00cf
            r15.A07 = r0
        L_0x0061:
            android.view.View r0 = r15.A06
            if (r0 != 0) goto L_0x0078
            X.0ZT r1 = r15.A09
            X.0C4 r0 = r1.A03
            if (r0 != 0) goto L_0x0072
            X.0C4 r0 = new X.0C4
            r0.<init>(r1)
            r1.A03 = r0
        L_0x0072:
            int r0 = r0.getCount()
            if (r0 <= 0) goto L_0x01aa
        L_0x0078:
            android.view.View r0 = r15.A07
            android.view.ViewGroup$LayoutParams r4 = r0.getLayoutParams()
            if (r4 != 0) goto L_0x0085
            android.view.ViewGroup$LayoutParams r4 = new android.view.ViewGroup$LayoutParams
            r4.<init>(r7, r7)
        L_0x0085:
            int r1 = r15.A00
            android.view.ViewGroup r0 = r15.A08
            r0.setBackgroundResource(r1)
            android.view.View r0 = r15.A07
            android.view.ViewParent r1 = r0.getParent()
            boolean r0 = r1 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x009d
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            android.view.View r0 = r15.A07
            r1.removeView(r0)
        L_0x009d:
            android.view.ViewGroup r1 = r15.A08
            android.view.View r0 = r15.A07
            r1.addView(r0, r4)
            android.view.View r0 = r15.A07
            boolean r0 = r0.hasFocus()
            if (r0 != 0) goto L_0x00b1
            android.view.View r0 = r15.A07
            r0.requestFocus()
        L_0x00b1:
            r6 = -2
        L_0x00b2:
            r15.A0B = r8
            r10 = 1002(0x3ea, float:1.404E-42)
            r11 = 8519680(0x820000, float:1.1938615E-38)
            r12 = -3
            r9 = 0
            android.view.WindowManager$LayoutParams r5 = new android.view.WindowManager$LayoutParams
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            int r0 = r15.A02
            r5.gravity = r0
            int r0 = r15.A03
            r5.windowAnimations = r0
            android.view.ViewGroup r0 = r15.A08
            r2.addView(r0, r5)
            r15.A0C = r3
            return
        L_0x00cf:
            X.07w r0 = r15.A0A
            if (r0 == 0) goto L_0x01aa
            X.0ZO r1 = r13.A0H
            if (r1 != 0) goto L_0x00de
            X.0ZO r1 = new X.0ZO
            r1.<init>(r13)
            r13.A0H = r1
        L_0x00de:
            X.0ZT r0 = r15.A09
            if (r0 != 0) goto L_0x00f4
            android.content.Context r0 = r15.A04
            X.0ZT r4 = new X.0ZT
            r4.<init>(r0)
            r15.A09 = r4
            r4.A05 = r1
            X.07w r1 = r15.A0A
            android.content.Context r0 = r1.A0N
            r1.A09(r0, r4)
        L_0x00f4:
            X.0ZT r5 = r15.A09
            android.view.ViewGroup r4 = r15.A08
            androidx.appcompat.view.menu.ExpandedMenuView r0 = r5.A02
            if (r0 != 0) goto L_0x011e
            android.view.LayoutInflater r1 = r5.A01
            r0 = 2131558413(0x7f0d000d, float:1.8742141E38)
            android.view.View r0 = r1.inflate(r0, r4, r8)
            androidx.appcompat.view.menu.ExpandedMenuView r0 = (androidx.appcompat.view.menu.ExpandedMenuView) r0
            r5.A02 = r0
            X.0C4 r1 = r5.A03
            if (r1 != 0) goto L_0x0114
            X.0C4 r1 = new X.0C4
            r1.<init>(r5)
            r5.A03 = r1
        L_0x0114:
            androidx.appcompat.view.menu.ExpandedMenuView r0 = r5.A02
            r0.setAdapter(r1)
            androidx.appcompat.view.menu.ExpandedMenuView r0 = r5.A02
            r0.setOnItemClickListener(r5)
        L_0x011e:
            androidx.appcompat.view.menu.ExpandedMenuView r0 = r5.A02
            r15.A07 = r0
            if (r0 == 0) goto L_0x01aa
            goto L_0x0061
        L_0x0126:
            android.view.View r0 = r15.A06
            if (r0 == 0) goto L_0x00b1
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            if (r0 == 0) goto L_0x00b1
            int r0 = r0.width
            r6 = -1
            if (r0 == r1) goto L_0x00b2
            goto L_0x00b1
        L_0x0137:
            r13.A0O()
            X.02i r0 = r13.A0B
            if (r0 == 0) goto L_0x0144
            android.content.Context r5 = r0.A02()
            if (r5 != 0) goto L_0x0145
        L_0x0144:
            r5 = r6
        L_0x0145:
            android.util.TypedValue r1 = new android.util.TypedValue
            r1.<init>()
            android.content.res.Resources r0 = r5.getResources()
            android.content.res.Resources$Theme r4 = r0.newTheme()
            android.content.res.Resources$Theme r0 = r5.getTheme()
            r4.setTo(r0)
            r0 = 2130968582(0x7f040006, float:1.7545822E38)
            r4.resolveAttribute(r0, r1, r3)
            int r0 = r1.resourceId
            if (r0 == 0) goto L_0x0166
            r4.applyStyle(r0, r3)
        L_0x0166:
            r0 = 2130969525(0x7f0403b5, float:1.7547734E38)
            r4.resolveAttribute(r0, r1, r3)
            int r0 = r1.resourceId
            if (r0 != 0) goto L_0x0173
            r0 = 2131952424(0x7f130328, float:1.954129E38)
        L_0x0173:
            r4.applyStyle(r0, r3)
            X.06V r1 = new X.06V
            r1.<init>((android.content.Context) r5, (int) r8)
            android.content.res.Resources$Theme r0 = r1.getTheme()
            r0.setTo(r4)
            r15.A04 = r1
            int[] r0 = X.AnonymousClass05L.A09
            android.content.res.TypedArray r1 = r1.obtainStyledAttributes(r0)
            r0 = 86
            int r0 = r1.getResourceId(r0, r8)
            r15.A00 = r0
            int r0 = r1.getResourceId(r3, r8)
            r15.A03 = r0
            r1.recycle()
            android.content.Context r1 = r15.A04
            X.0D7 r0 = new X.0D7
            r0.<init>(r1, r13)
            r15.A08 = r0
            r0 = 81
            r15.A02 = r0
            goto L_0x005b
        L_0x01aa:
            r15.A0E = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass06G.A0R(android.view.KeyEvent, X.09A):void");
    }

    public final void A0S(Window window) {
        if (this.A08 == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof AnonymousClass07R)) {
                AnonymousClass07R r0 = new AnonymousClass07R(callback, this);
                this.A0D = r0;
                window.setCallback(r0);
                Context context = this.A0j;
                AnonymousClass07T r1 = new AnonymousClass07T(context, context.obtainStyledAttributes((AttributeSet) null, A0r));
                Drawable A032 = r1.A03(0);
                if (A032 != null) {
                    window.setBackgroundDrawable(A032);
                }
                r1.A04();
                this.A08 = window;
                return;
            }
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    public void A0T(AnonymousClass09A r5, boolean z2) {
        ViewGroup viewGroup;
        C13260lj r0;
        if (!z2 || r5.A01 != 0 || (r0 = this.A0M) == null || !r0.AJL()) {
            WindowManager windowManager = (WindowManager) this.A0j.getSystemService("window");
            if (!(windowManager == null || !r5.A0C || (viewGroup = r5.A08) == null)) {
                windowManager.removeView(viewGroup);
                if (z2) {
                    int i2 = r5.A01;
                    C016607w r1 = r5.A0A;
                    if (r5.A0C && !this.A0a) {
                        this.A0D.A00.onPanelClosed(i2, r1);
                    }
                }
            }
            r5.A0D = false;
            r5.A0B = false;
            r5.A0C = false;
            r5.A07 = null;
            r5.A0E = true;
            if (this.A0G == r5) {
                this.A0G = null;
                return;
            }
            return;
        }
        A0U(r5.A0A);
    }

    public void A0U(C016607w r3) {
        if (!this.A0T) {
            this.A0T = true;
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.A0M;
            actionBarOverlayLayout.A01();
            actionBarOverlayLayout.A0A.A85();
            Window.Callback callback = this.A08.getCallback();
            if (callback != null && !this.A0a) {
                callback.onPanelClosed(AnonymousClass2EA.A03, r3);
            }
            this.A0T = false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004d, code lost:
        if (r1 == 0) goto L_0x004f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0V(boolean r12) {
        /*
            r11 = this;
            boolean r0 = r11.A0a
            if (r0 != 0) goto L_0x0121
            int r8 = r11.A01
            r0 = -100
            if (r8 != r0) goto L_0x000c
            int r8 = X.C004301w.A00
        L_0x000c:
            android.content.Context r7 = r11.A0j
            int r0 = r11.A0I(r7, r8)
            r6 = 0
            android.content.res.Configuration r5 = A02(r7, r6, r0)
            boolean r0 = r11.A0R
            r4 = 1
            if (r0 != 0) goto L_0x005d
            java.lang.Object r10 = r11.A0l
            boolean r0 = r10 instanceof android.app.Activity
            if (r0 == 0) goto L_0x005d
            android.content.pm.PackageManager r9 = r7.getPackageManager()
            r3 = 0
            if (r9 == 0) goto L_0x0061
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ NameNotFoundException -> 0x0053 }
            r0 = 29
            if (r1 < r0) goto L_0x0032
            r2 = 269221888(0x100c0000, float:2.7610132E-29)
            goto L_0x0039
        L_0x0032:
            r0 = 24
            r2 = 0
            if (r1 < r0) goto L_0x0039
            r2 = 786432(0xc0000, float:1.102026E-39)
        L_0x0039:
            java.lang.Class r1 = r10.getClass()     // Catch:{ NameNotFoundException -> 0x0053 }
            android.content.ComponentName r0 = new android.content.ComponentName     // Catch:{ NameNotFoundException -> 0x0053 }
            r0.<init>(r7, r1)     // Catch:{ NameNotFoundException -> 0x0053 }
            android.content.pm.ActivityInfo r0 = r9.getActivityInfo(r0, r2)     // Catch:{ NameNotFoundException -> 0x0053 }
            if (r0 == 0) goto L_0x004f
            int r0 = r0.configChanges     // Catch:{ NameNotFoundException -> 0x0053 }
            r1 = r0 & 512(0x200, float:7.175E-43)
            r0 = 1
            if (r1 != 0) goto L_0x0050
        L_0x004f:
            r0 = 0
        L_0x0050:
            r11.A0Q = r0     // Catch:{ NameNotFoundException -> 0x0053 }
            goto L_0x005d
        L_0x0053:
            r2 = move-exception
            java.lang.String r1 = "AppCompatDelegate"
            java.lang.String r0 = "Exception while getting ActivityInfo"
            android.util.Log.d(r1, r0, r2)
            r11.A0Q = r3
        L_0x005d:
            r11.A0R = r4
            boolean r3 = r11.A0Q
        L_0x0061:
            android.content.res.Resources r0 = r7.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.uiMode
            r9 = r0 & 48
            int r0 = r5.uiMode
            r1 = r0 & 48
            if (r9 == r1) goto L_0x00be
            if (r12 == 0) goto L_0x00be
            if (r3 != 0) goto L_0x00be
            boolean r0 = r11.A0S
            if (r0 == 0) goto L_0x00be
            boolean r0 = A0q
            if (r0 != 0) goto L_0x0083
            boolean r0 = r11.A0U
            if (r0 == 0) goto L_0x00be
        L_0x0083:
            java.lang.Object r2 = r11.A0l
            boolean r0 = r2 instanceof android.app.Activity
            if (r0 == 0) goto L_0x00be
            android.app.Activity r2 = (android.app.Activity) r2
            boolean r0 = r2.isChild()
            if (r0 != 0) goto L_0x00be
            X.AnonymousClass00T.A0B(r2)
        L_0x0094:
            if (r8 != 0) goto L_0x00a5
            X.0Rv r0 = r11.A0K(r7)
            r0.A03()
        L_0x009d:
            X.0Rv r0 = r11.A0E
            if (r0 == 0) goto L_0x0121
            r0.A02()
            return
        L_0x00a5:
            X.0Rv r0 = r11.A0F
            if (r0 == 0) goto L_0x00ac
            r0.A02()
        L_0x00ac:
            r0 = 3
            if (r8 != r0) goto L_0x009d
            X.0Rv r0 = r11.A0E
            if (r0 != 0) goto L_0x00ba
            X.0Ch r0 = new X.0Ch
            r0.<init>(r7, r11)
            r11.A0E = r0
        L_0x00ba:
            r0.A03()
            return
        L_0x00be:
            if (r9 == r1) goto L_0x0094
            android.content.res.Resources r2 = r7.getResources()
            android.content.res.Configuration r0 = r2.getConfiguration()
            android.content.res.Configuration r5 = new android.content.res.Configuration
            r5.<init>(r0)
            android.content.res.Configuration r0 = r2.getConfiguration()
            int r0 = r0.uiMode
            r0 = r0 & -49
            r1 = r1 | r0
            r5.uiMode = r1
            r2.updateConfiguration(r5, r6)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r1 >= r0) goto L_0x00e4
            X.C06570Wu.A00(r2)
        L_0x00e4:
            int r0 = r11.A02
            if (r0 == 0) goto L_0x00f8
            r7.setTheme(r0)
            r0 = 23
            if (r1 < r0) goto L_0x00f8
            android.content.res.Resources$Theme r1 = r7.getTheme()
            int r0 = r11.A02
            r1.applyStyle(r0, r4)
        L_0x00f8:
            if (r3 == 0) goto L_0x0094
            java.lang.Object r2 = r11.A0l
            boolean r0 = r2 instanceof android.app.Activity
            if (r0 == 0) goto L_0x0094
            android.app.Activity r2 = (android.app.Activity) r2
            boolean r0 = r2 instanceof X.C001300o
            if (r0 == 0) goto L_0x011e
            r0 = r2
            X.00o r0 = (X.C001300o) r0
            X.04q r0 = r0.getLifecycle()
            X.04p r0 = (X.C009604p) r0
            X.05f r1 = r0.A02
            X.05f r0 = X.C011005f.STARTED
            boolean r0 = r1.A00(r0)
        L_0x0117:
            if (r0 == 0) goto L_0x0094
            r2.onConfigurationChanged(r5)
            goto L_0x0094
        L_0x011e:
            boolean r0 = r11.A0f
            goto L_0x0117
        L_0x0121:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass06G.A0V(boolean):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:55:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0108  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0W(android.view.KeyEvent r6) {
        /*
            r5 = this;
            java.lang.Object r1 = r5.A0l
            boolean r0 = r1 instanceof X.C001400p
            r4 = 1
            if (r0 != 0) goto L_0x000b
            boolean r0 = r1 instanceof X.C005802m
            if (r0 == 0) goto L_0x001a
        L_0x000b:
            android.view.Window r0 = r5.A08
            android.view.View r0 = r0.getDecorView()
            if (r0 == 0) goto L_0x001a
            boolean r0 = X.C004601z.A0r(r6, r0)
            if (r0 == 0) goto L_0x001a
            return r4
        L_0x001a:
            int r1 = r6.getKeyCode()
            r0 = 82
            if (r1 != r0) goto L_0x002d
            X.07R r0 = r5.A0D
            android.view.Window$Callback r0 = r0.A00
            boolean r0 = r0.dispatchKeyEvent(r6)
            if (r0 == 0) goto L_0x002d
            return r4
        L_0x002d:
            int r3 = r6.getKeyCode()
            int r1 = r6.getAction()
            r0 = 4
            if (r1 != 0) goto L_0x0053
            r2 = 1
            r1 = 0
            if (r3 == r0) goto L_0x013c
            r0 = 82
            if (r3 != r0) goto L_0x0147
            int r0 = r6.getRepeatCount()
            if (r0 != 0) goto L_0x0051
            X.09A r1 = r5.A0L(r1)
            boolean r0 = r1.A0C
            if (r0 != 0) goto L_0x0051
            r5.A0X(r6, r1)
        L_0x0051:
            r0 = 1
            return r0
        L_0x0053:
            r2 = 0
            if (r3 == r0) goto L_0x0111
            r0 = 82
            if (r3 != r0) goto L_0x0147
            X.05J r0 = r5.A0K
            if (r0 != 0) goto L_0x0051
            X.09A r3 = r5.A0L(r2)
            X.0lj r0 = r5.A0M
            if (r0 == 0) goto L_0x00e6
            androidx.appcompat.widget.ActionBarOverlayLayout r0 = (androidx.appcompat.widget.ActionBarOverlayLayout) r0
            r0.A01()
            X.09G r0 = r0.A0A
            X.09F r0 = (X.AnonymousClass09F) r0
            androidx.appcompat.widget.Toolbar r1 = r0.A09
            int r0 = r1.getVisibility()
            if (r0 != 0) goto L_0x00e6
            androidx.appcompat.widget.ActionMenuView r0 = r1.A0O
            if (r0 == 0) goto L_0x00e6
            boolean r0 = r0.A0B
            if (r0 == 0) goto L_0x00e6
            android.content.Context r0 = r5.A0j
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            boolean r0 = r0.hasPermanentMenuKey()
            if (r0 != 0) goto L_0x00e6
            X.0lj r0 = r5.A0M
            boolean r0 = r0.AJL()
            if (r0 != 0) goto L_0x00cc
            boolean r0 = r5.A0a
            if (r0 != 0) goto L_0x0051
            boolean r0 = r5.A0X(r6, r3)
            if (r0 == 0) goto L_0x0051
            X.0lj r0 = r5.A0M
            androidx.appcompat.widget.ActionBarOverlayLayout r0 = (androidx.appcompat.widget.ActionBarOverlayLayout) r0
            r0.A01()
            X.09G r0 = r0.A0A
            X.09F r0 = (X.AnonymousClass09F) r0
            androidx.appcompat.widget.Toolbar r0 = r0.A09
            androidx.appcompat.widget.ActionMenuView r0 = r0.A0O
            if (r0 == 0) goto L_0x0051
            X.0ZV r0 = r0.A08
            if (r0 == 0) goto L_0x0051
            boolean r0 = r0.A03()
        L_0x00b6:
            if (r0 == 0) goto L_0x0051
        L_0x00b8:
            android.content.Context r0 = r5.A0j
            android.content.Context r1 = r0.getApplicationContext()
            java.lang.String r0 = "audio"
            java.lang.Object r0 = r1.getSystemService(r0)
            android.media.AudioManager r0 = (android.media.AudioManager) r0
            if (r0 == 0) goto L_0x0108
            r0.playSoundEffect(r2)
            goto L_0x0051
        L_0x00cc:
            X.0lj r0 = r5.A0M
            androidx.appcompat.widget.ActionBarOverlayLayout r0 = (androidx.appcompat.widget.ActionBarOverlayLayout) r0
            r0.A01()
            X.09G r0 = r0.A0A
            X.09F r0 = (X.AnonymousClass09F) r0
            androidx.appcompat.widget.Toolbar r0 = r0.A09
            androidx.appcompat.widget.ActionMenuView r0 = r0.A0O
            if (r0 == 0) goto L_0x0051
            X.0ZV r0 = r0.A08
            if (r0 == 0) goto L_0x0051
            boolean r0 = r0.A01()
            goto L_0x00b6
        L_0x00e6:
            boolean r1 = r3.A0C
            if (r1 != 0) goto L_0x0102
            boolean r0 = r3.A0B
            if (r0 != 0) goto L_0x0102
            boolean r0 = r3.A0D
            if (r0 == 0) goto L_0x0051
            boolean r0 = r3.A0F
            if (r0 == 0) goto L_0x00fe
            r3.A0D = r2
            boolean r0 = r5.A0X(r6, r3)
            if (r0 == 0) goto L_0x0051
        L_0x00fe:
            r5.A0R(r6, r3)
            goto L_0x00b8
        L_0x0102:
            r5.A0T(r3, r4)
            if (r1 == 0) goto L_0x0051
            goto L_0x00b8
        L_0x0108:
            java.lang.String r1 = "AppCompatDelegate"
            java.lang.String r0 = "Couldn't get audio manager"
            android.util.Log.w(r1, r0)
            goto L_0x0051
        L_0x0111:
            boolean r3 = r5.A0c
            r5.A0c = r2
            X.09A r1 = r5.A0L(r2)
            boolean r0 = r1.A0C
            if (r0 == 0) goto L_0x0124
            if (r3 != 0) goto L_0x0051
            r5.A0T(r1, r4)
            goto L_0x0051
        L_0x0124:
            X.05J r0 = r5.A0K
            if (r0 == 0) goto L_0x012d
            r0.A05()
            goto L_0x0051
        L_0x012d:
            r5.A0O()
            X.02i r0 = r5.A0B
            if (r0 == 0) goto L_0x0147
            boolean r0 = r0.A0V()
            if (r0 == 0) goto L_0x0147
            goto L_0x0051
        L_0x013c:
            int r0 = r6.getFlags()
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 != 0) goto L_0x0145
            r2 = 0
        L_0x0145:
            r5.A0c = r2
        L_0x0147:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass06G.A0W(android.view.KeyEvent):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        if (r7 == 108) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004f, code lost:
        if (r13.A0F != false) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0103, code lost:
        if (r6 != null) goto L_0x00d3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0X(android.view.KeyEvent r12, X.AnonymousClass09A r13) {
        /*
            r11 = this;
            boolean r0 = r11.A0a
            r2 = 0
            if (r0 != 0) goto L_0x0086
            boolean r0 = r13.A0D
            r3 = 1
            if (r0 != 0) goto L_0x015d
            X.09A r0 = r11.A0G
            if (r0 == 0) goto L_0x0013
            if (r0 == r13) goto L_0x0013
            r11.A0T(r0, r2)
        L_0x0013:
            android.view.Window r0 = r11.A08
            android.view.Window$Callback r5 = r0.getCallback()
            if (r5 == 0) goto L_0x0023
            int r0 = r13.A01
            android.view.View r0 = r5.onCreatePanelView(r0)
            r13.A06 = r0
        L_0x0023:
            int r7 = r13.A01
            if (r7 == 0) goto L_0x002c
            r0 = 108(0x6c, float:1.51E-43)
            r10 = 0
            if (r7 != r0) goto L_0x003c
        L_0x002c:
            r10 = 1
            X.0lj r0 = r11.A0M
            if (r0 == 0) goto L_0x003c
            androidx.appcompat.widget.ActionBarOverlayLayout r0 = (androidx.appcompat.widget.ActionBarOverlayLayout) r0
            r0.A01()
            X.09G r0 = r0.A0A
            X.09F r0 = (X.AnonymousClass09F) r0
            r0.A0D = r3
        L_0x003c:
            android.view.View r0 = r13.A06
            if (r0 != 0) goto L_0x0154
            if (r10 == 0) goto L_0x0048
            X.02i r0 = r11.A0B
            boolean r0 = r0 instanceof X.AnonymousClass09B
            if (r0 != 0) goto L_0x0154
        L_0x0048:
            X.07w r6 = r13.A0A
            r4 = 0
            if (r6 == 0) goto L_0x0087
            boolean r0 = r13.A0F
            if (r0 == 0) goto L_0x010f
        L_0x0051:
            if (r10 == 0) goto L_0x0065
            X.0lj r1 = r11.A0M
            if (r1 == 0) goto L_0x0065
            X.0ZN r0 = r11.A0C
            if (r0 != 0) goto L_0x0062
            X.0ZN r0 = new X.0ZN
            r0.<init>(r11)
            r11.A0C = r0
        L_0x0062:
            r1.setMenu(r6, r0)
        L_0x0065:
            X.07w r0 = r13.A0A
            r0.A08()
            boolean r0 = r5.onCreatePanelMenu(r7, r0)
            if (r0 != 0) goto L_0x010d
            X.07w r1 = r13.A0A
            if (r4 == r1) goto L_0x007b
            X.0ZT r0 = r13.A09
            r1.A0E(r0)
            r13.A0A = r4
        L_0x007b:
            if (r10 == 0) goto L_0x0086
            X.0lj r1 = r11.A0M
            if (r1 == 0) goto L_0x0086
            X.0ZN r0 = r11.A0C
            r1.setMenu(r4, r0)
        L_0x0086:
            return r2
        L_0x0087:
            android.content.Context r8 = r11.A0j
            if (r7 == 0) goto L_0x008f
            r0 = 108(0x6c, float:1.51E-43)
            if (r7 != r0) goto L_0x00e0
        L_0x008f:
            X.0lj r0 = r11.A0M
            if (r0 == 0) goto L_0x00e0
            android.util.TypedValue r9 = new android.util.TypedValue
            r9.<init>()
            android.content.res.Resources$Theme r1 = r8.getTheme()
            r0 = 2130968589(0x7f04000d, float:1.7545836E38)
            r1.resolveAttribute(r0, r9, r3)
            r6 = 0
            int r0 = r9.resourceId
            if (r0 == 0) goto L_0x0106
            android.content.res.Resources r0 = r8.getResources()
            android.content.res.Resources$Theme r6 = r0.newTheme()
            r6.setTo(r1)
            int r0 = r9.resourceId
            r6.applyStyle(r0, r3)
            r0 = 2130968590(0x7f04000e, float:1.7545838E38)
            r6.resolveAttribute(r0, r9, r3)
        L_0x00bd:
            int r0 = r9.resourceId
            if (r0 == 0) goto L_0x0103
            if (r6 != 0) goto L_0x00ce
            android.content.res.Resources r0 = r8.getResources()
            android.content.res.Resources$Theme r6 = r0.newTheme()
            r6.setTo(r1)
        L_0x00ce:
            int r0 = r9.resourceId
            r6.applyStyle(r0, r3)
        L_0x00d3:
            X.06V r1 = new X.06V
            r1.<init>((android.content.Context) r8, (int) r2)
            android.content.res.Resources$Theme r0 = r1.getTheme()
            r0.setTo(r6)
            r8 = r1
        L_0x00e0:
            X.07w r6 = new X.07w
            r6.<init>(r8)
            r6.A0D(r11)
            X.07w r1 = r13.A0A
            if (r6 == r1) goto L_0x00fe
            if (r1 == 0) goto L_0x00f3
            X.0ZT r0 = r13.A09
            r1.A0E(r0)
        L_0x00f3:
            r13.A0A = r6
            X.0ZT r1 = r13.A09
            if (r1 == 0) goto L_0x00fe
            android.content.Context r0 = r6.A0N
            r6.A09(r0, r1)
        L_0x00fe:
            X.07w r6 = r13.A0A
            if (r6 != 0) goto L_0x0051
            return r2
        L_0x0103:
            if (r6 == 0) goto L_0x00e0
            goto L_0x00d3
        L_0x0106:
            r0 = 2130968590(0x7f04000e, float:1.7545838E38)
            r1.resolveAttribute(r0, r9, r3)
            goto L_0x00bd
        L_0x010d:
            r13.A0F = r2
        L_0x010f:
            X.07w r1 = r13.A0A
            r1.A08()
            android.os.Bundle r0 = r13.A05
            if (r0 == 0) goto L_0x011d
            r1.A0A(r0)
            r13.A05 = r4
        L_0x011d:
            android.view.View r1 = r13.A06
            X.07w r0 = r13.A0A
            boolean r0 = r5.onPreparePanel(r2, r1, r0)
            if (r0 != 0) goto L_0x0138
            if (r10 == 0) goto L_0x0132
            X.0lj r1 = r11.A0M
            if (r1 == 0) goto L_0x0132
            X.0ZN r0 = r11.A0C
            r1.setMenu(r4, r0)
        L_0x0132:
            X.07w r0 = r13.A0A
            r0.A07()
            return r2
        L_0x0138:
            if (r12 == 0) goto L_0x015b
            int r0 = r12.getDeviceId()
        L_0x013e:
            android.view.KeyCharacterMap r0 = android.view.KeyCharacterMap.load(r0)
            int r0 = r0.getKeyboardType()
            r1 = 0
            if (r0 == r3) goto L_0x014a
            r1 = 1
        L_0x014a:
            X.07w r0 = r13.A0A
            r0.setQwertyMode(r1)
            X.07w r0 = r13.A0A
            r0.A07()
        L_0x0154:
            r13.A0D = r3
            r13.A0B = r2
            r11.A0G = r13
            return r3
        L_0x015b:
            r0 = -1
            goto L_0x013e
        L_0x015d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass06G.A0X(android.view.KeyEvent, X.09A):boolean");
    }

    public boolean ATe(MenuItem menuItem, C016607w r9) {
        Window.Callback callback = this.A08.getCallback();
        if (callback == null || this.A0a) {
            return false;
        }
        C016607w A022 = r9.A02();
        AnonymousClass09A[] r4 = this.A0i;
        if (r4 == null) {
            return false;
        }
        for (AnonymousClass09A r1 : r4) {
            if (r1 != null && r1.A0A == A022) {
                return callback.onMenuItemSelected(r1.A01, menuItem);
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0048, code lost:
        if (r1.A02() != false) goto L_0x004a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void ATf(X.C016607w r7) {
        /*
            r6 = this;
            X.0lj r0 = r6.A0M
            r2 = 1
            r5 = 0
            if (r0 == 0) goto L_0x00d0
            androidx.appcompat.widget.ActionBarOverlayLayout r0 = (androidx.appcompat.widget.ActionBarOverlayLayout) r0
            r0.A01()
            X.09G r0 = r0.A0A
            X.09F r0 = (X.AnonymousClass09F) r0
            androidx.appcompat.widget.Toolbar r1 = r0.A09
            int r0 = r1.getVisibility()
            if (r0 != 0) goto L_0x00d0
            androidx.appcompat.widget.ActionMenuView r0 = r1.A0O
            if (r0 == 0) goto L_0x00d0
            boolean r0 = r0.A0B
            if (r0 == 0) goto L_0x00d0
            android.content.Context r0 = r6.A0j
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            boolean r0 = r0.hasPermanentMenuKey()
            if (r0 == 0) goto L_0x004a
            X.0lj r0 = r6.A0M
            androidx.appcompat.widget.ActionBarOverlayLayout r0 = (androidx.appcompat.widget.ActionBarOverlayLayout) r0
            r0.A01()
            X.09G r0 = r0.A0A
            X.09F r0 = (X.AnonymousClass09F) r0
            androidx.appcompat.widget.Toolbar r0 = r0.A09
            androidx.appcompat.widget.ActionMenuView r0 = r0.A0O
            if (r0 == 0) goto L_0x00d0
            X.0ZV r1 = r0.A08
            if (r1 == 0) goto L_0x00d0
            X.0fy r0 = r1.A0D
            if (r0 != 0) goto L_0x004a
            boolean r0 = r1.A02()
            if (r0 == 0) goto L_0x00d0
        L_0x004a:
            android.view.Window r0 = r6.A08
            android.view.Window$Callback r4 = r0.getCallback()
            X.0lj r0 = r6.A0M
            boolean r0 = r0.AJL()
            r3 = 108(0x6c, float:1.51E-43)
            if (r0 == 0) goto L_0x0080
            X.0lj r0 = r6.A0M
            androidx.appcompat.widget.ActionBarOverlayLayout r0 = (androidx.appcompat.widget.ActionBarOverlayLayout) r0
            r0.A01()
            X.09G r0 = r0.A0A
            X.09F r0 = (X.AnonymousClass09F) r0
            androidx.appcompat.widget.Toolbar r0 = r0.A09
            androidx.appcompat.widget.ActionMenuView r0 = r0.A0O
            if (r0 == 0) goto L_0x0072
            X.0ZV r0 = r0.A08
            if (r0 == 0) goto L_0x0072
            r0.A01()
        L_0x0072:
            boolean r0 = r6.A0a
            if (r0 != 0) goto L_0x007f
            X.09A r0 = r6.A0L(r5)
            X.07w r0 = r0.A0A
            r4.onPanelClosed(r3, r0)
        L_0x007f:
            return
        L_0x0080:
            if (r4 == 0) goto L_0x007f
            boolean r0 = r6.A0a
            if (r0 != 0) goto L_0x007f
            boolean r0 = r6.A0Z
            if (r0 == 0) goto L_0x009e
            int r0 = r6.A00
            r0 = r0 & 1
            if (r0 == 0) goto L_0x009e
            android.view.Window r0 = r6.A08
            android.view.View r1 = r0.getDecorView()
            java.lang.Runnable r0 = r6.A0m
            r1.removeCallbacks(r0)
            r0.run()
        L_0x009e:
            X.09A r2 = r6.A0L(r5)
            X.07w r1 = r2.A0A
            if (r1 == 0) goto L_0x007f
            boolean r0 = r2.A0F
            if (r0 != 0) goto L_0x007f
            android.view.View r0 = r2.A06
            boolean r0 = r4.onPreparePanel(r5, r0, r1)
            if (r0 == 0) goto L_0x007f
            X.07w r0 = r2.A0A
            r4.onMenuOpened(r3, r0)
            X.0lj r0 = r6.A0M
            androidx.appcompat.widget.ActionBarOverlayLayout r0 = (androidx.appcompat.widget.ActionBarOverlayLayout) r0
            r0.A01()
            X.09G r0 = r0.A0A
            X.09F r0 = (X.AnonymousClass09F) r0
            androidx.appcompat.widget.Toolbar r0 = r0.A09
            androidx.appcompat.widget.ActionMenuView r0 = r0.A0O
            if (r0 == 0) goto L_0x007f
            X.0ZV r0 = r0.A08
            if (r0 == 0) goto L_0x007f
            r0.A03()
            return
        L_0x00d0:
            X.09A r1 = r6.A0L(r5)
            r1.A0E = r2
            r6.A0T(r1, r5)
            r0 = 0
            r6.A0R(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass06G.ATf(X.07w):void");
    }

    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return A04(view, str, context, attributeSet);
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView((View) null, str, context, attributeSet);
    }
}
