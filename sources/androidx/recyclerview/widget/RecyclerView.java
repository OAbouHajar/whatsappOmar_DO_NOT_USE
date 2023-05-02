package androidx.recyclerview.widget;

import X.AnonymousClass00N;
import X.AnonymousClass01X;
import X.AnonymousClass02S;
import X.AnonymousClass02U;
import X.AnonymousClass02W;
import X.AnonymousClass03G;
import X.AnonymousClass05I;
import X.AnonymousClass071;
import X.AnonymousClass07D;
import X.AnonymousClass0Bp;
import X.AnonymousClass0EK;
import X.AnonymousClass0Fc;
import X.AnonymousClass0M2;
import X.AnonymousClass0M3;
import X.AnonymousClass0O0;
import X.AnonymousClass0PR;
import X.AnonymousClass0RN;
import X.AnonymousClass0Ri;
import X.AnonymousClass0SJ;
import X.AnonymousClass0SK;
import X.AnonymousClass0U1;
import X.AnonymousClass0XH;
import X.C004201v;
import X.C004601z;
import X.C005502j;
import X.C005602k;
import X.C02680Ek;
import X.C02800Fh;
import X.C03960Ko;
import X.C04220Lq;
import X.C04850Oe;
import X.C05490Rq;
import X.C05530Rx;
import X.C05670Sm;
import X.C07570c7;
import X.C07620cC;
import X.C07630cD;
import X.C07650cF;
import X.C10540hI;
import X.C10620hQ;
import X.C11950jb;
import X.C11960jc;
import X.C11970jd;
import X.C12500kV;
import X.C13210le;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import com.facebook.redex.IDxObjectShape30S0000000_I0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public class RecyclerView extends ViewGroup implements AnonymousClass02S, AnonymousClass02U {
    public static final Interpolator A1B = new IDxObjectShape30S0000000_I0(0);
    public static final boolean A1C;
    public static final boolean A1D;
    public static final boolean A1E;
    public static final int[] A1F = {16842987};
    public static final int[] A1G = {16843830};
    public static final Class[] A1H;
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public VelocityTracker A0D;
    public EdgeEffect A0E;
    public EdgeEffect A0F;
    public EdgeEffect A0G;
    public EdgeEffect A0H;
    public AnonymousClass0XH A0I;
    public C07620cC A0J;
    public AnonymousClass0SK A0K;
    public C07650cF A0L;
    public C10620hQ A0M;
    public AnonymousClass01X A0N;
    public C11950jb A0O;
    public AnonymousClass0M2 A0P;
    public C11960jc A0Q;
    public C005502j A0R;
    public AnonymousClass02W A0S;
    public AnonymousClass0M3 A0T;
    public C13210le A0U;
    public AnonymousClass071 A0V;
    public C12500kV A0W;
    public C02680Ek A0X;
    public AnonymousClass0EK A0Y;
    public Runnable A0Z;
    public List A0a;
    public List A0b;
    public boolean A0c;
    public boolean A0d;
    public boolean A0e;
    public boolean A0f;
    public boolean A0g;
    public boolean A0h;
    public boolean A0i;
    public boolean A0j;
    public boolean A0k;
    public boolean A0l;
    public boolean A0m;
    public boolean A0n;
    public boolean A0o;
    public boolean A0p;
    public final int A0q;
    public final int A0r;
    public final Rect A0s;
    public final Rect A0t;
    public final RectF A0u;
    public final AccessibilityManager A0v;
    public final AnonymousClass0SJ A0w;
    public final AnonymousClass0Fc A0x;
    public final AnonymousClass0Ri A0y;
    public final C10540hI A0z;
    public final C11970jd A10;
    public final C05530Rx A11;
    public final Runnable A12;
    public final ArrayList A13;
    public final ArrayList A14;
    public final List A15;
    public final int[] A16;
    public final int[] A17;
    public final int[] A18;
    public final int[] A19;
    public final int[] A1A;

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0021, code lost:
        if (r2 == 20) goto L_0x0023;
     */
    static {
        /*
            r4 = 1
            int[] r1 = new int[r4]
            r0 = 16843830(0x1010436, float:2.369658E-38)
            r3 = 0
            r1[r3] = r0
            A1G = r1
            int[] r1 = new int[r4]
            r0 = 16842987(0x10100eb, float:2.3694217E-38)
            r1[r3] = r0
            A1F = r1
            int r2 = android.os.Build.VERSION.SDK_INT
            r0 = 18
            if (r2 == r0) goto L_0x0023
            r0 = 19
            if (r2 == r0) goto L_0x0023
            r1 = 20
            r0 = 0
            if (r2 != r1) goto L_0x0024
        L_0x0023:
            r0 = 1
        L_0x0024:
            A1E = r0
            r1 = 23
            r0 = 0
            if (r2 < r1) goto L_0x002c
            r0 = 1
        L_0x002c:
            A1C = r0
            r1 = 21
            r0 = 0
            if (r2 < r1) goto L_0x0034
            r0 = 1
        L_0x0034:
            A1D = r0
            r0 = 4
            java.lang.Class[] r2 = new java.lang.Class[r0]
            java.lang.Class<android.content.Context> r0 = android.content.Context.class
            r2[r3] = r0
            java.lang.Class<android.util.AttributeSet> r0 = android.util.AttributeSet.class
            r2[r4] = r0
            r0 = 2
            java.lang.Class r1 = java.lang.Integer.TYPE
            r2[r0] = r1
            r0 = 3
            r2[r0] = r1
            A1H = r2
            com.facebook.redex.IDxObjectShape30S0000000_I0 r0 = new com.facebook.redex.IDxObjectShape30S0000000_I0
            r0.<init>(r3)
            A1B = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.<clinit>():void");
    }

    public RecyclerView(Context context) {
        this(context, (AttributeSet) null);
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0203 A[Catch:{ NoSuchMethodException -> 0x024e, ClassNotFoundException -> 0x02e8, InvocationTargetException -> 0x02cb, InstantiationException -> 0x02ae, IllegalAccessException -> 0x028f, ClassCastException -> 0x0270 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0217 A[Catch:{ NoSuchMethodException -> 0x024e, ClassNotFoundException -> 0x02e8, InvocationTargetException -> 0x02cb, InstantiationException -> 0x02ae, IllegalAccessException -> 0x028f, ClassCastException -> 0x0270 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public RecyclerView(android.content.Context r19, android.util.AttributeSet r20, int r21) {
        /*
            r18 = this;
            r14 = r18
            r5 = r19
            r4 = r20
            r3 = r21
            r14.<init>(r5, r4, r3)
            X.0Fc r0 = new X.0Fc
            r0.<init>(r14)
            r14.A0x = r0
            X.0SJ r0 = new X.0SJ
            r0.<init>(r14)
            r14.A0w = r0
            X.0Rx r0 = new X.0Rx
            r0.<init>()
            r14.A11 = r0
            X.0fe r0 = new X.0fe
            r0.<init>(r14)
            r14.A12 = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r14.A0s = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r14.A0t = r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r14.A0u = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r14.A13 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r14.A14 = r0
            r2 = 0
            r14.A06 = r2
            r14.A0e = r2
            r14.A0f = r2
            r14.A09 = r2
            r14.A02 = r2
            X.0M2 r0 = new X.0M2
            r0.<init>()
            r14.A0P = r0
            X.0Fr r0 = new X.0Fr
            r0.<init>()
            r14.A0R = r0
            r14.A0B = r2
            r9 = -1
            r14.A0A = r9
            r0 = 1
            r14.A00 = r0
            r14.A01 = r0
            r1 = 1
            r14.A0p = r1
            X.0hI r0 = new X.0hI
            r0.<init>(r14)
            r14.A0z = r0
            boolean r0 = A1D
            if (r0 == 0) goto L_0x01fa
            X.0cF r0 = new X.0cF
            r0.<init>()
        L_0x0080:
            r14.A0L = r0
            X.0Ri r0 = new X.0Ri
            r0.<init>()
            r14.A0y = r0
            r14.A0k = r2
            r14.A0l = r2
            X.0cE r0 = new X.0cE
            r0.<init>(r14)
            r14.A0Q = r0
            r14.A0o = r2
            r7 = 2
            int[] r0 = new int[r7]
            r14.A16 = r0
            int[] r0 = new int[r7]
            r14.A19 = r0
            int[] r0 = new int[r7]
            r14.A18 = r0
            int[] r0 = new int[r7]
            r14.A17 = r0
            int[] r0 = new int[r7]
            r14.A1A = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r14.A15 = r0
            X.0ff r0 = new X.0ff
            r0.<init>(r14)
            r14.A0Z = r0
            X.0cI r0 = new X.0cI
            r0.<init>(r14)
            r14.A10 = r0
            if (r20 == 0) goto L_0x01f6
            int[] r0 = A1F
            android.content.res.TypedArray r6 = r5.obtainStyledAttributes(r4, r0, r3, r2)
            boolean r0 = r6.getBoolean(r2, r1)
            r14.A0d = r0
            r6.recycle()
        L_0x00d1:
            r14.setScrollContainer(r1)
            r14.setFocusableInTouchMode(r1)
            android.view.ViewConfiguration r6 = android.view.ViewConfiguration.get(r5)
            int r0 = r6.getScaledTouchSlop()
            r14.A0C = r0
            float r0 = X.AnonymousClass0XB.A01(r5, r6)
            r14.A00 = r0
            float r0 = X.AnonymousClass0XB.A02(r5, r6)
            r14.A01 = r0
            int r0 = r6.getScaledMinimumFlingVelocity()
            r14.A0r = r0
            int r0 = r6.getScaledMaximumFlingVelocity()
            r14.A0q = r0
            int r6 = r14.getOverScrollMode()
            r0 = 0
            if (r6 != r7) goto L_0x0101
            r0 = 1
        L_0x0101:
            r14.setWillNotDraw(r0)
            X.02j r6 = r14.A0R
            X.0jc r0 = r14.A0Q
            r6.A04 = r0
            X.0c6 r6 = new X.0c6
            r6.<init>(r14)
            X.0cC r0 = new X.0cC
            r0.<init>(r6)
            r14.A0J = r0
            X.0c7 r6 = new X.0c7
            r6.<init>(r14)
            X.0SK r0 = new X.0SK
            r0.<init>(r6)
            r14.A0K = r0
            int r0 = X.C004601z.A05(r14)
            if (r0 != 0) goto L_0x012b
            X.C004601z.A0U(r14)
        L_0x012b:
            int r0 = r14.getImportantForAccessibility()
            if (r0 != 0) goto L_0x0134
            X.C004601z.A0d(r14, r1)
        L_0x0134:
            android.content.Context r6 = r14.getContext()
            java.lang.String r0 = "accessibility"
            java.lang.Object r0 = r6.getSystemService(r0)
            android.view.accessibility.AccessibilityManager r0 = (android.view.accessibility.AccessibilityManager) r0
            r14.A0v = r0
            X.0EK r0 = new X.0EK
            r0.<init>(r14)
            r14.setAccessibilityDelegateCompat(r0)
            r7 = 262144(0x40000, float:3.67342E-40)
            if (r20 == 0) goto L_0x031f
            int[] r0 = X.C04420Mm.A00
            android.content.res.TypedArray r6 = r5.obtainStyledAttributes(r4, r0, r3, r2)
            r0 = 7
            java.lang.String r8 = r6.getString(r0)
            int r0 = r6.getInt(r1, r9)
            if (r0 != r9) goto L_0x0162
            r14.setDescendantFocusability(r7)
        L_0x0162:
            r0 = 2
            boolean r0 = r6.getBoolean(r0, r2)
            if (r0 == 0) goto L_0x01ab
            r0 = 5
            android.graphics.drawable.Drawable r12 = r6.getDrawable(r0)
            android.graphics.drawable.StateListDrawable r12 = (android.graphics.drawable.StateListDrawable) r12
            r0 = 6
            android.graphics.drawable.Drawable r10 = r6.getDrawable(r0)
            r0 = 3
            android.graphics.drawable.Drawable r13 = r6.getDrawable(r0)
            android.graphics.drawable.StateListDrawable r13 = (android.graphics.drawable.StateListDrawable) r13
            r0 = 4
            android.graphics.drawable.Drawable r11 = r6.getDrawable(r0)
            if (r12 == 0) goto L_0x0307
            if (r10 == 0) goto L_0x0307
            if (r13 == 0) goto L_0x0307
            if (r11 == 0) goto L_0x0307
            android.content.Context r0 = r14.getContext()
            android.content.res.Resources r7 = r0.getResources()
            r0 = 2131166143(0x7f0703bf, float:1.7946523E38)
            int r15 = r7.getDimensionPixelSize(r0)
            r0 = 2131166145(0x7f0703c1, float:1.7946527E38)
            int r16 = r7.getDimensionPixelSize(r0)
            r0 = 2131166144(0x7f0703c0, float:1.7946525E38)
            int r17 = r7.getDimensionPixelOffset(r0)
            X.0Fi r9 = new X.0Fi
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
        L_0x01ab:
            r6.recycle()
            java.lang.String r7 = ": Could not instantiate the LayoutManager: "
            if (r8 == 0) goto L_0x0323
            java.lang.String r6 = r8.trim()
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x0323
            char r0 = r6.charAt(r2)
            r9 = 46
            if (r0 != r9) goto L_0x01d8
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = r5.getPackageName()
            r8.append(r0)
        L_0x01d0:
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            goto L_0x01fd
        L_0x01d8:
            java.lang.String r0 = "."
            boolean r0 = r6.contains(r0)
            if (r0 != 0) goto L_0x01fd
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.Class<androidx.recyclerview.widget.RecyclerView> r0 = androidx.recyclerview.widget.RecyclerView.class
            java.lang.Package r0 = r0.getPackage()
            java.lang.String r0 = r0.getName()
            r8.append(r0)
            r8.append(r9)
            goto L_0x01d0
        L_0x01f6:
            r14.A0d = r1
            goto L_0x00d1
        L_0x01fa:
            r0 = 0
            goto L_0x0080
        L_0x01fd:
            boolean r0 = r14.isInEditMode()     // Catch:{ ClassNotFoundException -> 0x02e8, InvocationTargetException -> 0x02cb, InstantiationException -> 0x02ae, IllegalAccessException -> 0x028f, ClassCastException -> 0x0270 }
            if (r0 == 0) goto L_0x0217
            java.lang.Class r0 = r14.getClass()     // Catch:{ ClassNotFoundException -> 0x02e8, InvocationTargetException -> 0x02cb, InstantiationException -> 0x02ae, IllegalAccessException -> 0x028f, ClassCastException -> 0x0270 }
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x02e8, InvocationTargetException -> 0x02cb, InstantiationException -> 0x02ae, IllegalAccessException -> 0x028f, ClassCastException -> 0x0270 }
        L_0x020b:
            java.lang.Class r8 = r0.loadClass(r6)     // Catch:{ ClassNotFoundException -> 0x02e8, InvocationTargetException -> 0x02cb, InstantiationException -> 0x02ae, IllegalAccessException -> 0x028f, ClassCastException -> 0x0270 }
            java.lang.Class<X.02W> r0 = X.AnonymousClass02W.class
            java.lang.Class r10 = r8.asSubclass(r0)     // Catch:{ ClassNotFoundException -> 0x02e8, InvocationTargetException -> 0x02cb, InstantiationException -> 0x02ae, IllegalAccessException -> 0x028f, ClassCastException -> 0x0270 }
            r9 = 0
            goto L_0x021c
        L_0x0217:
            java.lang.ClassLoader r0 = r5.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x02e8, InvocationTargetException -> 0x02cb, InstantiationException -> 0x02ae, IllegalAccessException -> 0x028f, ClassCastException -> 0x0270 }
            goto L_0x020b
        L_0x021c:
            java.lang.Class[] r0 = A1H     // Catch:{ NoSuchMethodException -> 0x0239 }
            java.lang.reflect.Constructor r12 = r10.getConstructor(r0)     // Catch:{ NoSuchMethodException -> 0x0239 }
            r0 = 4
            java.lang.Object[] r11 = new java.lang.Object[r0]     // Catch:{ NoSuchMethodException -> 0x0239 }
            r11[r2] = r19     // Catch:{ NoSuchMethodException -> 0x0239 }
            r11[r1] = r20     // Catch:{ NoSuchMethodException -> 0x0239 }
            r8 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)     // Catch:{ NoSuchMethodException -> 0x0239 }
            r11[r8] = r0     // Catch:{ NoSuchMethodException -> 0x0239 }
            r8 = 3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)     // Catch:{ NoSuchMethodException -> 0x0239 }
            r11[r8] = r0     // Catch:{ NoSuchMethodException -> 0x0239 }
            r9 = r11
            goto L_0x0240
        L_0x0239:
            r8 = move-exception
            java.lang.Class[] r0 = new java.lang.Class[r2]     // Catch:{ NoSuchMethodException -> 0x024e }
            java.lang.reflect.Constructor r12 = r10.getConstructor(r0)     // Catch:{ NoSuchMethodException -> 0x024e }
        L_0x0240:
            r12.setAccessible(r1)     // Catch:{ ClassNotFoundException -> 0x02e8, InvocationTargetException -> 0x02cb, InstantiationException -> 0x02ae, IllegalAccessException -> 0x028f, ClassCastException -> 0x0270 }
            java.lang.Object r0 = r12.newInstance(r9)     // Catch:{ ClassNotFoundException -> 0x02e8, InvocationTargetException -> 0x02cb, InstantiationException -> 0x02ae, IllegalAccessException -> 0x028f, ClassCastException -> 0x0270 }
            X.02W r0 = (X.AnonymousClass02W) r0     // Catch:{ ClassNotFoundException -> 0x02e8, InvocationTargetException -> 0x02cb, InstantiationException -> 0x02ae, IllegalAccessException -> 0x028f, ClassCastException -> 0x0270 }
            r14.setLayoutManager(r0)     // Catch:{ ClassNotFoundException -> 0x02e8, InvocationTargetException -> 0x02cb, InstantiationException -> 0x02ae, IllegalAccessException -> 0x028f, ClassCastException -> 0x0270 }
            goto L_0x0323
        L_0x024e:
            r2 = move-exception
            r2.initCause(r8)     // Catch:{ ClassNotFoundException -> 0x02e8, InvocationTargetException -> 0x02cb, InstantiationException -> 0x02ae, IllegalAccessException -> 0x028f, ClassCastException -> 0x0270 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException -> 0x02e8, InvocationTargetException -> 0x02cb, InstantiationException -> 0x02ae, IllegalAccessException -> 0x028f, ClassCastException -> 0x0270 }
            r1.<init>()     // Catch:{ ClassNotFoundException -> 0x02e8, InvocationTargetException -> 0x02cb, InstantiationException -> 0x02ae, IllegalAccessException -> 0x028f, ClassCastException -> 0x0270 }
            java.lang.String r0 = r4.getPositionDescription()     // Catch:{ ClassNotFoundException -> 0x02e8, InvocationTargetException -> 0x02cb, InstantiationException -> 0x02ae, IllegalAccessException -> 0x028f, ClassCastException -> 0x0270 }
            r1.append(r0)     // Catch:{ ClassNotFoundException -> 0x02e8, InvocationTargetException -> 0x02cb, InstantiationException -> 0x02ae, IllegalAccessException -> 0x028f, ClassCastException -> 0x0270 }
            java.lang.String r0 = ": Error creating LayoutManager "
            r1.append(r0)     // Catch:{ ClassNotFoundException -> 0x02e8, InvocationTargetException -> 0x02cb, InstantiationException -> 0x02ae, IllegalAccessException -> 0x028f, ClassCastException -> 0x0270 }
            r1.append(r6)     // Catch:{ ClassNotFoundException -> 0x02e8, InvocationTargetException -> 0x02cb, InstantiationException -> 0x02ae, IllegalAccessException -> 0x028f, ClassCastException -> 0x0270 }
            java.lang.String r1 = r1.toString()     // Catch:{ ClassNotFoundException -> 0x02e8, InvocationTargetException -> 0x02cb, InstantiationException -> 0x02ae, IllegalAccessException -> 0x028f, ClassCastException -> 0x0270 }
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ ClassNotFoundException -> 0x02e8, InvocationTargetException -> 0x02cb, InstantiationException -> 0x02ae, IllegalAccessException -> 0x028f, ClassCastException -> 0x0270 }
            r0.<init>(r1, r2)     // Catch:{ ClassNotFoundException -> 0x02e8, InvocationTargetException -> 0x02cb, InstantiationException -> 0x02ae, IllegalAccessException -> 0x028f, ClassCastException -> 0x0270 }
            throw r0     // Catch:{ ClassNotFoundException -> 0x02e8, InvocationTargetException -> 0x02cb, InstantiationException -> 0x02ae, IllegalAccessException -> 0x028f, ClassCastException -> 0x0270 }
        L_0x0270:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = r4.getPositionDescription()
            r1.append(r0)
            java.lang.String r0 = ": Class is not a LayoutManager "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1, r2)
            throw r0
        L_0x028f:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = r4.getPositionDescription()
            r1.append(r0)
            java.lang.String r0 = ": Cannot access non-public constructor "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1, r2)
            throw r0
        L_0x02ae:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = r4.getPositionDescription()
            r1.append(r0)
            r1.append(r7)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1, r2)
            throw r0
        L_0x02cb:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = r4.getPositionDescription()
            r1.append(r0)
            r1.append(r7)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1, r2)
            throw r0
        L_0x02e8:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = r4.getPositionDescription()
            r1.append(r0)
            java.lang.String r0 = ": Unable to find LayoutManager "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1, r2)
            throw r0
        L_0x0307:
            java.lang.String r0 = "Trying to set fast scroller without both required drawables."
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = r14.A0G()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x031f:
            r14.setDescendantFocusability(r7)
            goto L_0x0336
        L_0x0323:
            int r6 = android.os.Build.VERSION.SDK_INT
            r0 = 21
            if (r6 < r0) goto L_0x0336
            int[] r0 = A1G
            android.content.res.TypedArray r0 = r5.obtainStyledAttributes(r4, r0, r3, r2)
            boolean r1 = r0.getBoolean(r2, r1)
            r0.recycle()
        L_0x0336:
            r14.setNestedScrollingEnabled(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public static int A00(View view) {
        C005602k A012 = A01(view);
        if (A012 != null) {
            return A012.A00();
        }
        return -1;
    }

    public static C005602k A01(View view) {
        if (view == null) {
            return null;
        }
        return ((AnonymousClass0Bp) view.getLayoutParams()).A00;
    }

    public static RecyclerView A02(View view) {
        if (view instanceof ViewGroup) {
            if (view instanceof RecyclerView) {
                return (RecyclerView) view;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                RecyclerView A022 = A02(viewGroup.getChildAt(i2));
                if (A022 != null) {
                    return A022;
                }
            }
        }
        return null;
    }

    public static void A03(View view, Rect rect) {
        AnonymousClass0Bp r6 = (AnonymousClass0Bp) view.getLayoutParams();
        Rect rect2 = r6.A03;
        rect.set((view.getLeft() - rect2.left) - r6.leftMargin, (view.getTop() - rect2.top) - r6.topMargin, view.getRight() + rect2.right + r6.rightMargin, view.getBottom() + rect2.bottom + r6.bottomMargin);
    }

    public static void A05(C005602k r3) {
        WeakReference weakReference = r3.A0D;
        if (weakReference != null) {
            Object obj = weakReference.get();
            while (true) {
                View view = (View) obj;
                while (true) {
                    if (view == null) {
                        r3.A0D = null;
                        return;
                    } else if (view != r3.A0H) {
                        obj = view.getParent();
                        if (!(obj instanceof View)) {
                            view = null;
                        }
                    } else {
                        return;
                    }
                }
            }
        }
    }

    private AnonymousClass0XH getScrollingChildHelper() {
        AnonymousClass0XH r0 = this.A0I;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass0XH r02 = new AnonymousClass0XH(this);
        this.A0I = r02;
        return r02;
    }

    public int A09(C005602k r9) {
        if ((524 & r9.A00) == 0 && r9.A06()) {
            C07620cC r0 = this.A0J;
            int i2 = r9.A05;
            ArrayList arrayList = r0.A04;
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                AnonymousClass0RN r7 = (AnonymousClass0RN) arrayList.get(i3);
                int i4 = r7.A00;
                if (i4 != 1) {
                    if (i4 == 2) {
                        int i5 = r7.A02;
                        if (i5 <= i2) {
                            int i6 = r7.A01;
                            int i7 = i2;
                            i2 -= i6;
                            if (i5 + i6 > i7) {
                            }
                        } else {
                            continue;
                        }
                    } else if (i4 == 8) {
                        int i8 = r7.A02;
                        if (i8 == i2) {
                            i2 = r7.A01;
                        } else {
                            if (i8 < i2) {
                                i2--;
                            }
                            if (r7.A01 <= i2) {
                                i2++;
                            }
                        }
                    }
                } else if (r7.A02 <= i2) {
                    i2 += r7.A01;
                }
            }
            return i2;
        }
        return -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001a, code lost:
        if ((r1 & 4) == 0) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Rect A0A(android.view.View r11) {
        /*
            r10 = this;
            android.view.ViewGroup$LayoutParams r8 = r11.getLayoutParams()
            X.0Bp r8 = (X.AnonymousClass0Bp) r8
            boolean r0 = r8.A01
            if (r0 == 0) goto L_0x001c
            X.0Ri r7 = r10.A0y
            boolean r0 = r7.A08
            if (r0 == 0) goto L_0x001f
            X.02k r0 = r8.A00
            int r1 = r0.A00
            r0 = r1 & 2
            if (r0 != 0) goto L_0x001c
            r0 = r1 & 4
            if (r0 == 0) goto L_0x001f
        L_0x001c:
            android.graphics.Rect r0 = r8.A03
            return r0
        L_0x001f:
            android.graphics.Rect r6 = r8.A03
            r5 = 0
            r6.set(r5, r5, r5, r5)
            java.util.ArrayList r4 = r10.A13
            int r3 = r4.size()
            r2 = 0
        L_0x002c:
            if (r2 >= r3) goto L_0x005b
            android.graphics.Rect r9 = r10.A0s
            r9.set(r5, r5, r5, r5)
            java.lang.Object r0 = r4.get(r2)
            X.07D r0 = (X.AnonymousClass07D) r0
            r0.A03(r9, r11, r7, r10)
            int r1 = r6.left
            int r0 = r9.left
            int r1 = r1 + r0
            r6.left = r1
            int r1 = r6.top
            int r0 = r9.top
            int r1 = r1 + r0
            r6.top = r1
            int r1 = r6.right
            int r0 = r9.right
            int r1 = r1 + r0
            r6.right = r1
            int r1 = r6.bottom
            int r0 = r9.bottom
            int r1 = r1 + r0
            r6.bottom = r1
            int r2 = r2 + 1
            goto L_0x002c
        L_0x005b:
            r8.A01 = r5
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.A0A(android.view.View):android.graphics.Rect");
    }

    public View A0B(float f2, float f3) {
        AnonymousClass0SK r2 = this.A0K;
        int A002 = r2.A00();
        while (true) {
            A002--;
            if (A002 < 0) {
                return null;
            }
            View A032 = r2.A03(A002);
            float translationX = A032.getTranslationX();
            float translationY = A032.getTranslationY();
            if (f2 >= ((float) A032.getLeft()) + translationX && f2 <= ((float) A032.getRight()) + translationX && f3 >= ((float) A032.getTop()) + translationY && f3 <= ((float) A032.getBottom()) + translationY) {
                return A032;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0012 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View A0C(android.view.View r3) {
        /*
            r2 = this;
        L_0x0000:
            android.view.ViewParent r1 = r3.getParent()
            if (r1 == 0) goto L_0x0010
            if (r1 == r2) goto L_0x0010
            boolean r0 = r1 instanceof android.view.View
            if (r0 == 0) goto L_0x0010
            r3 = r1
            android.view.View r3 = (android.view.View) r3
            goto L_0x0000
        L_0x0010:
            if (r1 == r2) goto L_0x0013
            r3 = 0
        L_0x0013:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.A0C(android.view.View):android.view.View");
    }

    public C005602k A0D(int i2) {
        C005602k r1 = null;
        if (!this.A0e) {
            AnonymousClass0SK r5 = this.A0K;
            int A012 = r5.A01();
            for (int i3 = 0; i3 < A012; i3++) {
                C005602k A013 = A01(r5.A04(i3));
                if (A013 != null && (A013.A00 & 8) == 0 && A09(A013) == i2) {
                    if (!r5.A02.contains(A013.A0H)) {
                        return A013;
                    }
                    r1 = A013;
                }
            }
        }
        return r1;
    }

    public C005602k A0E(int i2, boolean z2) {
        int i3;
        AnonymousClass0SK r6 = this.A0K;
        int A012 = r6.A01();
        C005602k r4 = null;
        for (int i4 = 0; i4 < A012; i4++) {
            C005602k A013 = A01(r6.A04(i4));
            if (A013 != null && (A013.A00 & 8) == 0) {
                if (z2 || (i3 = A013.A06) == -1) {
                    i3 = A013.A05;
                }
                if (i3 == i2) {
                    if (!r6.A02.contains(A013.A0H)) {
                        return A013;
                    }
                    r4 = A013;
                } else {
                    continue;
                }
            }
        }
        return r4;
    }

    public C005602k A0F(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return A01(view);
        }
        StringBuilder sb = new StringBuilder("View ");
        sb.append(view);
        sb.append(" is not a direct child of ");
        sb.append(this);
        throw new IllegalArgumentException(sb.toString());
    }

    public String A0G() {
        StringBuilder sb = new StringBuilder(" ");
        sb.append(super.toString());
        sb.append(", adapter:");
        sb.append(this.A0N);
        sb.append(", layout:");
        sb.append(this.A0S);
        sb.append(", context:");
        sb.append(getContext());
        return sb.toString();
    }

    public void A0H() {
        if (this.A0g && !this.A0e) {
            C07620cC r5 = this.A0J;
            ArrayList arrayList = r5.A04;
            if (arrayList.size() > 0) {
                int i2 = r5.A00;
                if ((4 & i2) != 0 && (11 & i2) == 0) {
                    C004201v.A01("RV PartialInvalidate");
                    A0R();
                    this.A09++;
                    r5.A05();
                    if (!this.A0n) {
                        AnonymousClass0SK r4 = this.A0K;
                        int A002 = r4.A00();
                        int i3 = 0;
                        while (true) {
                            if (i3 < A002) {
                                C005602k A012 = A01(r4.A03(i3));
                                if (A012 != null && !A012.A05() && (A012.A00 & 2) != 0) {
                                    A0I();
                                    break;
                                }
                                i3++;
                            } else {
                                r5.A03();
                                break;
                            }
                        }
                    }
                    A0t(true);
                    A0P();
                    C004201v.A00();
                } else if (arrayList.size() <= 0) {
                    return;
                }
            } else {
                return;
            }
        }
        C004201v.A01("RV FullInvalidate");
        A0I();
        C004201v.A00();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:190:0x0453, code lost:
        if (r2.A0K.A02.contains(getFocusedChild()) == false) goto L_0x0437;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x0492, code lost:
        if (r1 != null) goto L_0x0494;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x04a2, code lost:
        if (r6.hasFocusable() != false) goto L_0x04e0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x03da  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x03e1  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x0447  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x046e  */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x049e  */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x04ac  */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x0492 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0I() {
        /*
            r22 = this;
            r2 = r22
            X.01X r0 = r2.A0N
            java.lang.String r18 = "RecyclerView"
            if (r0 != 0) goto L_0x0010
            java.lang.String r1 = "No adapter attached; skipping layout"
        L_0x000a:
            r0 = r18
            android.util.Log.e(r0, r1)
            return
        L_0x0010:
            X.02W r3 = r2.A0S
            if (r3 != 0) goto L_0x0017
            java.lang.String r1 = "No layout manager attached; skipping layout"
            goto L_0x000a
        L_0x0017:
            X.0Ri r4 = r2.A0y
            r0 = 0
            r4.A09 = r0
            int r1 = r4.A04
            r0 = 1
            if (r1 != r0) goto L_0x0211
            r2.A0T()
        L_0x0024:
            X.02W r5 = r2.A0S
            int r0 = r2.getWidth()
            r3 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
            int r0 = r2.getHeight()
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
            r5.A0E(r1, r0)
            r2.A0U()
        L_0x003e:
            r0 = 4
            r4.A01(r0)
            r2.A0R()
            int r0 = r2.A09
            int r0 = r0 + 1
            r2.A09 = r0
            r6 = 1
            r4.A04 = r6
            boolean r0 = r4.A0B
            if (r0 == 0) goto L_0x03be
            X.0SK r0 = r2.A0K
            r19 = r0
            int r3 = r19.A00()
            int r3 = r3 - r6
        L_0x005b:
            if (r3 < 0) goto L_0x0271
            r0 = r19
            android.view.View r0 = r0.A03(r3)
            X.02k r9 = A01(r0)
            boolean r0 = r9.A05()
            if (r0 != 0) goto L_0x00ca
            X.01X r0 = r2.A0N
            boolean r0 = r0.A00
            if (r0 == 0) goto L_0x020c
            long r7 = r9.A08
        L_0x0075:
            X.0O0 r13 = new X.0O0
            r13.<init>()
            android.view.View r1 = r9.A0H
            int r0 = r1.getLeft()
            r13.A00 = r0
            int r0 = r1.getTop()
            r13.A01 = r0
            r1.getRight()
            r1.getBottom()
            X.0Rx r11 = r2.A11
            X.03G r1 = r11.A01
            r0 = 0
            java.lang.Object r10 = r1.A04(r7, r0)
            X.02k r10 = (X.C005602k) r10
            if (r10 == 0) goto L_0x00c7
            boolean r0 = r10.A05()
            if (r0 != 0) goto L_0x00c7
            X.00N r12 = r11.A00
            java.lang.Object r0 = r12.get(r10)
            X.0U1 r0 = (X.AnonymousClass0U1) r0
            r17 = 1
            if (r0 == 0) goto L_0x0208
            int r0 = r0.A00
            r0 = r0 & 1
            if (r0 == 0) goto L_0x0208
        L_0x00b3:
            java.lang.Object r0 = r12.get(r9)
            X.0U1 r0 = (X.AnonymousClass0U1) r0
            r16 = 1
            if (r0 == 0) goto L_0x0204
            int r0 = r0.A00
            r0 = r0 & 1
            if (r0 == 0) goto L_0x0204
        L_0x00c3:
            if (r17 == 0) goto L_0x00cd
            if (r10 != r9) goto L_0x00cd
        L_0x00c7:
            r11.A00(r13, r9)
        L_0x00ca:
            int r3 = r3 + -1
            goto L_0x005b
        L_0x00cd:
            int r0 = r10.hashCode()
            int r14 = r12.A05(r10, r0)
            r5 = 0
            if (r14 < 0) goto L_0x0104
            java.lang.Object[] r1 = r12.A02
            int r0 = r14 << 1
            int r0 = r0 + 1
            r1 = r1[r0]
            X.0U1 r1 = (X.AnonymousClass0U1) r1
            if (r1 == 0) goto L_0x0104
            int r15 = r1.A00
            r0 = r15 & 4
            if (r0 == 0) goto L_0x0104
            r0 = -5
            r0 = r0 & r15
            r1.A00 = r0
            X.0O0 r5 = r1.A02
            r0 = r0 & 12
            if (r0 != 0) goto L_0x0104
            r12.A06(r14)
            r0 = 0
            r1.A00 = r0
            r0 = 0
            r1.A02 = r0
            r1.A01 = r0
            X.0lK r0 = X.AnonymousClass0U1.A03
            r0.Abi(r1)
        L_0x0104:
            r11.A00(r13, r9)
            int r0 = r9.hashCode()
            int r13 = r12.A05(r9, r0)
            r11 = 0
            if (r13 < 0) goto L_0x013f
            java.lang.Object[] r1 = r12.A02
            int r0 = r13 << 1
            int r0 = r0 + 1
            r1 = r1[r0]
            X.0U1 r1 = (X.AnonymousClass0U1) r1
            if (r1 == 0) goto L_0x013f
            int r14 = r1.A00
            r0 = r14 & 8
            if (r0 == 0) goto L_0x013f
            r0 = -9
            r0 = r0 & r14
            r1.A00 = r0
            X.0O0 r11 = r1.A01
            r0 = r0 & 12
            if (r0 != 0) goto L_0x013f
            r12.A06(r13)
            r0 = 0
            r1.A00 = r0
            r0 = 0
            r1.A02 = r0
            r1.A01 = r0
            X.0lK r0 = X.AnonymousClass0U1.A03
            r0.Abi(r1)
        L_0x013f:
            if (r5 != 0) goto L_0x01b0
            int r13 = r19.A00()
            r12 = 0
        L_0x0146:
            if (r12 >= r13) goto L_0x018c
            r0 = r19
            android.view.View r0 = r0.A03(r12)
            X.02k r5 = A01(r0)
            if (r5 == r9) goto L_0x0189
            X.01X r0 = r2.A0N
            boolean r11 = r0.A00
            if (r11 == 0) goto L_0x0185
            long r0 = r5.A08
        L_0x015c:
            int r14 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r14 != 0) goto L_0x0189
            java.lang.String r3 = " \n View Holder 2:"
            if (r11 == 0) goto L_0x0250
            java.lang.String r0 = "Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r5)
            r1.append(r3)
            r1.append(r9)
            java.lang.String r0 = r2.A0G()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0185:
            int r0 = r5.A05
            long r0 = (long) r0
            goto L_0x015c
        L_0x0189:
            int r12 = r12 + 1
            goto L_0x0146
        L_0x018c:
            java.lang.String r0 = "Problem while matching changed view holders with the newones. The pre-layout information for the change holder "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r10)
            java.lang.String r0 = " cannot be found but it is necessary for "
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = r2.A0G()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            r0 = r18
            android.util.Log.e(r0, r1)
            goto L_0x00ca
        L_0x01b0:
            r1 = 0
            r10.A04(r1)
            if (r17 == 0) goto L_0x01b9
            r2.A0q(r10)
        L_0x01b9:
            if (r10 == r9) goto L_0x01cf
            if (r16 == 0) goto L_0x01c0
            r2.A0q(r9)
        L_0x01c0:
            r10.A0A = r9
            r2.A0q(r10)
            X.0SJ r0 = r2.A0w
            r0.A09(r10)
            r9.A04(r1)
            r9.A0B = r10
        L_0x01cf:
            X.02j r8 = r2.A0R
            X.0Fd r8 = (X.AnonymousClass0Fd) r8
            int r7 = r5.A00
            int r5 = r5.A01
            boolean r0 = r9.A05()
            if (r0 == 0) goto L_0x01ff
            r1 = r5
            r0 = r7
        L_0x01df:
            r11 = r8
            r12 = r10
            r13 = r9
            r14 = r7
            r15 = r5
            r16 = r0
            r17 = r1
            boolean r0 = r11.A0G(r12, r13, r14, r15, r16, r17)
            if (r0 == 0) goto L_0x00ca
            boolean r0 = r2.A0o
            if (r0 != 0) goto L_0x00ca
            boolean r0 = r2.A0j
            if (r0 == 0) goto L_0x00ca
            java.lang.Runnable r0 = r2.A0Z
            r2.postOnAnimation(r0)
            r2.A0o = r6
            goto L_0x00ca
        L_0x01ff:
            int r0 = r11.A00
            int r1 = r11.A01
            goto L_0x01df
        L_0x0204:
            r16 = 0
            goto L_0x00c3
        L_0x0208:
            r17 = 0
            goto L_0x00b3
        L_0x020c:
            int r0 = r9.A05
            long r7 = (long) r0
            goto L_0x0075
        L_0x0211:
            X.0cC r1 = r2.A0J
            java.util.ArrayList r0 = r1.A05
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0225
            java.util.ArrayList r0 = r1.A04
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0225
            goto L_0x0024
        L_0x0225:
            int r1 = r3.A03
            int r0 = r2.getWidth()
            if (r1 != r0) goto L_0x0024
            X.02W r0 = r2.A0S
            int r1 = r0.A00
            int r0 = r2.getHeight()
            if (r1 != r0) goto L_0x0024
            X.02W r5 = r2.A0S
            int r0 = r2.getWidth()
            r3 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
            int r0 = r2.getHeight()
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
            r5.A0E(r1, r0)
            goto L_0x003e
        L_0x0250:
            java.lang.String r0 = "Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r5)
            r1.append(r3)
            r1.append(r9)
            java.lang.String r0 = r2.A0G()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0271:
            X.0Rx r0 = r2.A11
            X.0jd r11 = r2.A10
            X.00N r10 = r0.A00
            int r9 = r10.size()
        L_0x027b:
            int r9 = r9 + -1
            if (r9 < 0) goto L_0x03be
            java.lang.Object[] r1 = r10.A02
            int r0 = r9 << 1
            r8 = r1[r0]
            X.02k r8 = (X.C005602k) r8
            java.lang.Object r7 = r10.A06(r9)
            X.0U1 r7 = (X.AnonymousClass0U1) r7
            int r3 = r7.A00
            r1 = r3 & 3
            r0 = 3
            if (r1 == r0) goto L_0x03ae
            r0 = r3 & 1
            if (r0 == 0) goto L_0x0315
            X.0O0 r3 = r7.A02
            if (r3 == 0) goto L_0x03ae
            X.0O0 r1 = r7.A01
        L_0x029e:
            r0 = r11
            X.0cI r0 = (X.C07680cI) r0
            androidx.recyclerview.widget.RecyclerView r12 = r0.A00
            X.0SJ r0 = r12.A0w
            r0.A09(r8)
            r12.A0q(r8)
            r0 = 0
            r8.A04(r0)
            X.02j r13 = r12.A0R
            X.0Fd r13 = (X.AnonymousClass0Fd) r13
            int r0 = r3.A00
            r19 = r0
            int r14 = r3.A01
            android.view.View r5 = r8.A0H
            if (r1 != 0) goto L_0x0310
            int r3 = r5.getLeft()
            int r1 = r5.getTop()
        L_0x02c5:
            int r0 = r8.A00
            r0 = r0 & 8
            if (r0 != 0) goto L_0x030b
            r0 = r19
            if (r0 != r3) goto L_0x02d1
            if (r14 == r1) goto L_0x030b
        L_0x02d1:
            int r15 = r5.getWidth()
            int r15 = r15 + r3
            int r0 = r5.getHeight()
            int r0 = r0 + r1
            r5.layout(r3, r1, r15, r0)
            r16 = r14
            r17 = r3
            r18 = r1
            r15 = r19
            r14 = r8
            boolean r0 = r13.A0F(r14, r15, r16, r17, r18)
        L_0x02eb:
            if (r0 == 0) goto L_0x02fc
            boolean r0 = r12.A0o
            if (r0 != 0) goto L_0x02fc
            boolean r0 = r12.A0j
            if (r0 == 0) goto L_0x02fc
            java.lang.Runnable r0 = r12.A0Z
            r12.postOnAnimation(r0)
            r12.A0o = r6
        L_0x02fc:
            r0 = 0
            r7.A00 = r0
            r0 = 0
            r7.A02 = r0
            r7.A01 = r0
            X.0lK r0 = X.AnonymousClass0U1.A03
            r0.Abi(r7)
            goto L_0x027b
        L_0x030b:
            boolean r0 = r13.A0E(r8)
            goto L_0x02eb
        L_0x0310:
            int r3 = r1.A00
            int r1 = r1.A01
            goto L_0x02c5
        L_0x0315:
            r1 = r3 & 14
            r0 = 14
            if (r1 == r0) goto L_0x0375
            r1 = r3 & 12
            r0 = 12
            if (r1 != r0) goto L_0x0368
            X.0O0 r3 = r7.A02
            X.0O0 r5 = r7.A01
            r1 = r11
            X.0cI r1 = (X.C07680cI) r1
            r0 = 0
            r8.A04(r0)
            androidx.recyclerview.widget.RecyclerView r12 = r1.A00
            boolean r0 = r12.A0e
            X.02j r15 = r12.A0R
            X.0Fd r15 = (X.AnonymousClass0Fd) r15
            if (r0 == 0) goto L_0x0358
            int r13 = r3.A00
            int r3 = r3.A01
            boolean r0 = r8.A05()
            if (r0 == 0) goto L_0x0353
            r1 = r3
            r0 = r13
        L_0x0342:
            r16 = r8
            r19 = r3
            r20 = r0
            r21 = r1
            r17 = r8
            r18 = r13
            boolean r0 = r15.A0G(r16, r17, r18, r19, r20, r21)
            goto L_0x02eb
        L_0x0353:
            int r0 = r5.A00
            int r1 = r5.A01
            goto L_0x0342
        L_0x0358:
            int r14 = r3.A00
            int r13 = r5.A00
            if (r14 != r13) goto L_0x0394
            int r1 = r3.A01
            int r0 = r5.A01
            if (r1 != r0) goto L_0x0394
            r15.A03(r8)
            goto L_0x02fc
        L_0x0368:
            r0 = r3 & 4
            if (r0 == 0) goto L_0x0371
            X.0O0 r3 = r7.A02
            r1 = 0
            goto L_0x029e
        L_0x0371:
            r0 = r3 & 8
            if (r0 == 0) goto L_0x02fc
        L_0x0375:
            X.0O0 r3 = r7.A02
            X.0O0 r5 = r7.A01
            r0 = r11
            X.0cI r0 = (X.C07680cI) r0
            androidx.recyclerview.widget.RecyclerView r12 = r0.A00
            r0 = 0
            r8.A04(r0)
            X.02j r15 = r12.A0R
            X.0Fd r15 = (X.AnonymousClass0Fd) r15
            if (r3 == 0) goto L_0x03a8
            int r14 = r3.A00
            int r13 = r5.A00
            if (r14 != r13) goto L_0x0394
            int r1 = r3.A01
            int r0 = r5.A01
            if (r1 == r0) goto L_0x03a8
        L_0x0394:
            int r1 = r3.A01
            int r0 = r5.A01
            r16 = r8
            r17 = r14
            r18 = r1
            r19 = r13
            r20 = r0
            boolean r0 = r15.A0F(r16, r17, r18, r19, r20)
            goto L_0x02eb
        L_0x03a8:
            boolean r0 = r15.A0D(r8)
            goto L_0x02eb
        L_0x03ae:
            r0 = r11
            X.0cI r0 = (X.C07680cI) r0
            androidx.recyclerview.widget.RecyclerView r0 = r0.A00
            X.02W r3 = r0.A0S
            android.view.View r1 = r8.A0H
            X.0SJ r0 = r0.A0w
            r3.A0K(r1, r0)
            goto L_0x02fc
        L_0x03be:
            X.02W r0 = r2.A0S
            X.0SJ r3 = r2.A0w
            r0.A0O(r3)
            int r0 = r4.A03
            r4.A05 = r0
            r7 = 0
            r2.A0e = r7
            r2.A0f = r7
            r4.A0B = r7
            r4.A0A = r7
            X.02W r1 = r2.A0S
            r1.A0D = r7
            java.util.ArrayList r0 = r3.A04
            if (r0 == 0) goto L_0x03dd
            r0.clear()
        L_0x03dd:
            boolean r0 = r1.A0C
            if (r0 == 0) goto L_0x03e8
            r1.A02 = r7
            r1.A0C = r7
            r3.A03()
        L_0x03e8:
            X.02W r0 = r2.A0S
            r0.A0v(r4)
            r2.A0P()
            r2.A0t(r7)
            X.0Rx r1 = r2.A11
            X.00N r0 = r1.A00
            r0.clear()
            X.03G r0 = r1.A01
            r0.A05()
            int[] r5 = r2.A16
            r3 = r5[r7]
            r1 = r5[r6]
            r2.A0u(r5)
            r0 = r5[r7]
            if (r0 != r3) goto L_0x0410
            r0 = r5[r6]
            if (r0 == r1) goto L_0x0413
        L_0x0410:
            r2.A0d(r7, r7)
        L_0x0413:
            boolean r0 = r2.A0p
            if (r0 == 0) goto L_0x0437
            X.01X r0 = r2.A0N
            if (r0 == 0) goto L_0x0437
            boolean r0 = r2.hasFocus()
            if (r0 == 0) goto L_0x0437
            int r1 = r2.getDescendantFocusability()
            r0 = 393216(0x60000, float:5.51013E-40)
            if (r1 == r0) goto L_0x0437
            int r1 = r2.getDescendantFocusability()
            r0 = 131072(0x20000, float:1.83671E-40)
            if (r1 != r0) goto L_0x0441
            boolean r0 = r2.isFocused()
            if (r0 == 0) goto L_0x0441
        L_0x0437:
            r0 = -1
            r4.A07 = r0
            r0 = -1
            r4.A01 = r0
            r4.A02 = r0
            return
        L_0x0441:
            boolean r0 = r2.isFocused()
            if (r0 != 0) goto L_0x0456
            android.view.View r1 = r2.getFocusedChild()
            X.0SK r0 = r2.A0K
            java.util.List r0 = r0.A02
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x0456
            goto L_0x0437
        L_0x0456:
            long r5 = r4.A07
            r12 = -1
            int r0 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r0 == 0) goto L_0x04a4
            X.01X r0 = r2.A0N
            boolean r0 = r0.A00
            if (r0 == 0) goto L_0x04a4
            r1 = 0
            X.0SK r10 = r2.A0K
            int r11 = r10.A01()
            r9 = 0
        L_0x046c:
            if (r9 >= r11) goto L_0x0492
            android.view.View r0 = r10.A04(r9)
            X.02k r3 = A01(r0)
            if (r3 == 0) goto L_0x048f
            int r0 = r3.A00
            r0 = r0 & 8
            if (r0 != 0) goto L_0x048f
            long r7 = r3.A08
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x048f
            android.view.View r1 = r3.A0H
            java.util.List r0 = r10.A02
            boolean r0 = r0.contains(r1)
            r1 = r3
            if (r0 == 0) goto L_0x0494
        L_0x048f:
            int r9 = r9 + 1
            goto L_0x046c
        L_0x0492:
            if (r1 == 0) goto L_0x04a4
        L_0x0494:
            android.view.View r6 = r1.A0H
            java.util.List r0 = r10.A02
            boolean r0 = r0.contains(r6)
            if (r0 != 0) goto L_0x04a4
            boolean r0 = r6.hasFocusable()
            if (r0 != 0) goto L_0x04e0
        L_0x04a4:
            X.0SK r0 = r2.A0K
            int r0 = r0.A00()
            if (r0 <= 0) goto L_0x0437
            int r5 = r4.A01
            r0 = -1
            if (r5 != r0) goto L_0x04b2
            r5 = 0
        L_0x04b2:
            int r3 = r4.A00()
            r1 = r5
        L_0x04b7:
            if (r1 >= r3) goto L_0x04ca
            X.02k r0 = r2.A0D(r1)
            if (r0 == 0) goto L_0x04ca
            android.view.View r6 = r0.A0H
            boolean r0 = r6.hasFocusable()
            if (r0 != 0) goto L_0x04e0
            int r1 = r1 + 1
            goto L_0x04b7
        L_0x04ca:
            int r1 = java.lang.Math.min(r3, r5)
        L_0x04ce:
            int r1 = r1 + -1
            if (r1 < 0) goto L_0x0437
            X.02k r0 = r2.A0D(r1)
            if (r0 == 0) goto L_0x0437
            android.view.View r6 = r0.A0H
            boolean r0 = r6.hasFocusable()
            if (r0 == 0) goto L_0x04ce
        L_0x04e0:
            int r3 = r4.A02
            long r1 = (long) r3
            int r0 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r0 == 0) goto L_0x04f4
            android.view.View r1 = r6.findViewById(r3)
            if (r1 == 0) goto L_0x04f4
            boolean r0 = r1.isFocusable()
            if (r0 == 0) goto L_0x04f4
            r6 = r1
        L_0x04f4:
            r6.requestFocus()
            goto L_0x0437
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.A0I():void");
    }

    public void A0J() {
        int measuredHeight;
        if (this.A0E == null) {
            EdgeEffect edgeEffect = new EdgeEffect(getContext());
            this.A0E = edgeEffect;
            boolean z2 = this.A0d;
            int measuredWidth = getMeasuredWidth();
            if (z2) {
                measuredWidth = (measuredWidth - getPaddingLeft()) - getPaddingRight();
                measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            } else {
                measuredHeight = getMeasuredHeight();
            }
            edgeEffect.setSize(measuredWidth, measuredHeight);
        }
    }

    public void A0K() {
        int measuredWidth;
        if (this.A0F == null) {
            EdgeEffect edgeEffect = new EdgeEffect(getContext());
            this.A0F = edgeEffect;
            boolean z2 = this.A0d;
            int measuredHeight = getMeasuredHeight();
            if (z2) {
                measuredHeight = (measuredHeight - getPaddingTop()) - getPaddingBottom();
                measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            } else {
                measuredWidth = getMeasuredWidth();
            }
            edgeEffect.setSize(measuredHeight, measuredWidth);
        }
    }

    public void A0L() {
        int measuredWidth;
        if (this.A0G == null) {
            EdgeEffect edgeEffect = new EdgeEffect(getContext());
            this.A0G = edgeEffect;
            boolean z2 = this.A0d;
            int measuredHeight = getMeasuredHeight();
            if (z2) {
                measuredHeight = (measuredHeight - getPaddingTop()) - getPaddingBottom();
                measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            } else {
                measuredWidth = getMeasuredWidth();
            }
            edgeEffect.setSize(measuredHeight, measuredWidth);
        }
    }

    public void A0M() {
        int measuredHeight;
        if (this.A0H == null) {
            EdgeEffect edgeEffect = new EdgeEffect(getContext());
            this.A0H = edgeEffect;
            boolean z2 = this.A0d;
            int measuredWidth = getMeasuredWidth();
            if (z2) {
                measuredWidth = (measuredWidth - getPaddingLeft()) - getPaddingRight();
                measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            } else {
                measuredHeight = getMeasuredHeight();
            }
            edgeEffect.setSize(measuredWidth, measuredHeight);
        }
    }

    public void A0N() {
        if (this.A13.size() != 0) {
            AnonymousClass02W r1 = this.A0S;
            if (r1 != null) {
                r1.A12("Cannot invalidate item decorations during a scroll or layout");
            }
            A0O();
            requestLayout();
        }
    }

    public void A0O() {
        AnonymousClass0SK r4 = this.A0K;
        int A012 = r4.A01();
        for (int i2 = 0; i2 < A012; i2++) {
            ((AnonymousClass0Bp) r4.A04(i2).getLayoutParams()).A01 = true;
        }
        ArrayList arrayList = this.A0w.A06;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            AnonymousClass0Bp r1 = (AnonymousClass0Bp) ((C005602k) arrayList.get(i3)).A0H.getLayoutParams();
            if (r1 != null) {
                r1.A01 = true;
            }
        }
    }

    public void A0P() {
        int i2;
        AccessibilityManager accessibilityManager;
        int i3 = this.A09 - 1;
        this.A09 = i3;
        if (i3 < 1) {
            this.A09 = 0;
            int i4 = this.A03;
            this.A03 = 0;
            if (!(i4 == 0 || (accessibilityManager = this.A0v) == null || !accessibilityManager.isEnabled())) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(2048);
                C04220Lq.A00(obtain, i4);
                sendAccessibilityEventUnchecked(obtain);
            }
            List list = this.A15;
            int size = list.size();
            while (true) {
                size--;
                if (size >= 0) {
                    C005602k r3 = (C005602k) list.get(size);
                    if (r3.A0H.getParent() == this && !r3.A05() && (i2 = r3.A04) != -1) {
                        C004601z.A0d(r3.A0H, i2);
                        r3.A04 = -1;
                    }
                } else {
                    list.clear();
                    return;
                }
            }
        }
    }

    public void A0Q() {
        C005502j r0 = this.A0R;
        if (r0 != null) {
            r0.A08();
        }
        AnonymousClass02W r02 = this.A0S;
        if (r02 != null) {
            AnonymousClass0SJ r1 = this.A0w;
            r02.A0N(r1);
            this.A0S.A0O(r1);
        }
        AnonymousClass0SJ r12 = this.A0w;
        r12.A05.clear();
        r12.A02();
    }

    public void A0R() {
        int i2 = this.A06 + 1;
        this.A06 = i2;
        if (i2 == 1 && !this.A0m) {
            this.A0n = false;
        }
    }

    public void A0S() {
        C05490Rq r0;
        setScrollState(0);
        C10540hI r1 = this.A0z;
        r1.A06.removeCallbacks(r1);
        r1.A03.abortAnimation();
        AnonymousClass02W r02 = this.A0S;
        if (r02 != null && (r0 = r02.A06) != null) {
            r0.A01();
        }
    }

    public final void A0T() {
        AnonymousClass0U1 r0;
        View focusedChild;
        View A0C2;
        C005602k A0F2;
        int id;
        AnonymousClass0Ri r6 = this.A0y;
        boolean z2 = true;
        r6.A01(1);
        if (this.A0B == 2) {
            OverScroller overScroller = this.A0z.A03;
            overScroller.getFinalX();
            overScroller.getCurrX();
            overScroller.getFinalY();
            overScroller.getCurrY();
        }
        r6.A09 = false;
        A0R();
        C05530Rx r3 = this.A11;
        AnonymousClass00N r5 = r3.A00;
        r5.clear();
        AnonymousClass03G r2 = r3.A01;
        r2.A05();
        this.A09++;
        A0V();
        if (!this.A0p || !hasFocus() || this.A0N == null || (focusedChild = getFocusedChild()) == null || (A0C2 = A0C(focusedChild)) == null || (A0F2 = A0F(A0C2)) == null) {
            r6.A07 = -1;
            r6.A01 = -1;
            r6.A02 = -1;
        } else {
            r6.A07 = this.A0N.A00 ? A0F2.A08 : -1;
            r6.A01 = this.A0e ? -1 : (A0F2.A00 & 8) != 0 ? A0F2.A03 : A0F2.A00();
            View view = A0F2.A0H;
            loop0:
            while (true) {
                id = view.getId();
                while (true) {
                    if (view.isFocused() || !(view instanceof ViewGroup) || !view.hasFocus()) {
                        r6.A02 = id;
                    } else {
                        view = ((ViewGroup) view).getFocusedChild();
                        if (view.getId() != -1) {
                        }
                    }
                }
            }
            r6.A02 = id;
        }
        if (!r6.A0B || !this.A0l) {
            z2 = false;
        }
        r6.A0D = z2;
        this.A0l = false;
        this.A0k = false;
        r6.A08 = r6.A0A;
        r6.A03 = this.A0N.A0C();
        A0u(this.A16);
        if (r6.A0B) {
            AnonymousClass0SK r10 = this.A0K;
            int A002 = r10.A00();
            for (int i2 = 0; i2 < A002; i2++) {
                C005602k A012 = A01(r10.A03(i2));
                if (!A012.A05() && ((A012.A00 & 4) == 0 || this.A0N.A00)) {
                    C005502j r02 = this.A0R;
                    C005502j.A00(A012);
                    A012.A01();
                    r3.A01(r02.A01(A012), A012);
                    if (r6.A0D && (A012.A00 & 2) != 0 && (A012.A00 & 8) == 0 && !A012.A05() && (A012.A00 & 4) == 0) {
                        r2.A09(this.A0N.A00 ? A012.A08 : (long) A012.A05, A012);
                    }
                }
            }
        }
        if (r6.A0A) {
            AnonymousClass0SK r4 = this.A0K;
            int A013 = r4.A01();
            for (int i3 = 0; i3 < A013; i3++) {
                C005602k A014 = A01(r4.A04(i3));
                if (!A014.A05() && A014.A03 == -1) {
                    A014.A03 = A014.A05;
                }
            }
            boolean z3 = r6.A0C;
            r6.A0C = false;
            this.A0S.A0t(this.A0w, r6);
            r6.A0C = z3;
            for (int i4 = 0; i4 < r4.A00(); i4++) {
                C005602k A015 = A01(r4.A03(i4));
                if (!A015.A05() && ((r0 = (AnonymousClass0U1) r5.get(A015)) == null || (r0.A00 & 4) == 0)) {
                    C005502j.A00(A015);
                    boolean z4 = false;
                    if ((8192 & A015.A00) != 0) {
                        z4 = true;
                    }
                    C005502j r03 = this.A0R;
                    A015.A01();
                    AnonymousClass0O0 A016 = r03.A01(A015);
                    if (z4) {
                        A0l(A016, A015);
                    } else {
                        AnonymousClass0U1 r1 = (AnonymousClass0U1) r5.get(A015);
                        if (r1 == null) {
                            r1 = (AnonymousClass0U1) AnonymousClass0U1.A03.A4T();
                            if (r1 == null) {
                                r1 = new AnonymousClass0U1();
                            }
                            r5.put(A015, r1);
                        }
                        r1.A00 |= 2;
                        r1.A02 = A016;
                    }
                }
            }
        }
        AnonymousClass0SK r42 = this.A0K;
        int A017 = r42.A01();
        for (int i5 = 0; i5 < A017; i5++) {
            C005602k A018 = A01(r42.A04(i5));
            if (!A018.A05()) {
                A018.A03 = -1;
                A018.A06 = -1;
            }
        }
        AnonymousClass0SJ r8 = this.A0w;
        ArrayList arrayList = r8.A06;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            C005602k r12 = (C005602k) arrayList.get(i6);
            r12.A03 = -1;
            r12.A06 = -1;
        }
        ArrayList arrayList2 = r8.A05;
        int size2 = arrayList2.size();
        for (int i7 = 0; i7 < size2; i7++) {
            C005602k r13 = (C005602k) arrayList2.get(i7);
            r13.A03 = -1;
            r13.A06 = -1;
        }
        ArrayList arrayList3 = r8.A04;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i8 = 0; i8 < size3; i8++) {
                C005602k r14 = (C005602k) arrayList3.get(i8);
                r14.A03 = -1;
                r14.A06 = -1;
            }
        }
        A0P();
        A0t(false);
        r6.A04 = 2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0034, code lost:
        if (r4.A0R == null) goto L_0x0036;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0U() {
        /*
            r4 = this;
            r4.A0R()
            int r0 = r4.A09
            int r0 = r0 + 1
            r4.A09 = r0
            X.0Ri r3 = r4.A0y
            r0 = 6
            r3.A01(r0)
            X.0cC r0 = r4.A0J
            r0.A04()
            X.01X r0 = r4.A0N
            int r0 = r0.A0C()
            r3.A03 = r0
            r2 = 0
            r3.A00 = r2
            r3.A08 = r2
            X.02W r1 = r4.A0S
            X.0SJ r0 = r4.A0w
            r1.A0t(r0, r3)
            r3.A0C = r2
            r0 = 0
            r4.A0X = r0
            boolean r0 = r3.A0B
            if (r0 == 0) goto L_0x0036
            X.02j r1 = r4.A0R
            r0 = 1
            if (r1 != 0) goto L_0x0037
        L_0x0036:
            r0 = 0
        L_0x0037:
            r3.A0B = r0
            r0 = 4
            r3.A04 = r0
            r4.A0P()
            r4.A0t(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.A0U():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0039, code lost:
        if (r4.A0l != false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0050, code lost:
        if (r0 != false) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0027, code lost:
        if (r4.A0S.A16() == false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0V() {
        /*
            r4 = this;
            boolean r0 = r4.A0e
            if (r0 == 0) goto L_0x001c
            X.0cC r1 = r4.A0J
            java.util.ArrayList r0 = r1.A04
            r1.A09(r0)
            java.util.ArrayList r0 = r1.A05
            r1.A09(r0)
            r0 = 0
            r1.A00 = r0
            boolean r0 = r4.A0f
            if (r0 == 0) goto L_0x001c
            X.02W r0 = r4.A0S
            r0.A0x(r4)
        L_0x001c:
            X.02j r0 = r4.A0R
            if (r0 == 0) goto L_0x0029
            X.02W r0 = r4.A0S
            boolean r0 = r0.A16()
            r1 = 1
            if (r0 != 0) goto L_0x002a
        L_0x0029:
            r1 = 0
        L_0x002a:
            X.0cC r0 = r4.A0J
            if (r1 == 0) goto L_0x0074
            r0.A05()
        L_0x0031:
            boolean r0 = r4.A0k
            r3 = 0
            if (r0 != 0) goto L_0x003b
            boolean r0 = r4.A0l
            r2 = 0
            if (r0 == 0) goto L_0x003c
        L_0x003b:
            r2 = 1
        L_0x003c:
            X.0Ri r1 = r4.A0y
            boolean r0 = r4.A0g
            if (r0 == 0) goto L_0x0072
            X.02j r0 = r4.A0R
            if (r0 == 0) goto L_0x0072
            boolean r0 = r4.A0e
            if (r0 != 0) goto L_0x006d
            if (r2 != 0) goto L_0x0052
            X.02W r0 = r4.A0S
            boolean r0 = r0.A0D
        L_0x0050:
            if (r0 == 0) goto L_0x0072
        L_0x0052:
            r0 = 1
        L_0x0053:
            r1.A0B = r0
            if (r0 == 0) goto L_0x006a
            if (r2 == 0) goto L_0x006a
            boolean r0 = r4.A0e
            if (r0 != 0) goto L_0x006a
            X.02j r0 = r4.A0R
            if (r0 == 0) goto L_0x006a
            X.02W r0 = r4.A0S
            boolean r0 = r0.A16()
            if (r0 == 0) goto L_0x006a
            r3 = 1
        L_0x006a:
            r1.A0A = r3
            return
        L_0x006d:
            X.01X r0 = r4.A0N
            boolean r0 = r0.A00
            goto L_0x0050
        L_0x0072:
            r0 = 0
            goto L_0x0053
        L_0x0074:
            r0.A04()
            goto L_0x0031
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.A0V():void");
    }

    public final void A0W() {
        boolean z2;
        VelocityTracker velocityTracker = this.A0D;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        AgM(0);
        EdgeEffect edgeEffect = this.A0F;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z2 = this.A0F.isFinished();
        } else {
            z2 = false;
        }
        EdgeEffect edgeEffect2 = this.A0H;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z2 |= this.A0H.isFinished();
        }
        EdgeEffect edgeEffect3 = this.A0G;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z2 |= this.A0G.isFinished();
        }
        EdgeEffect edgeEffect4 = this.A0E;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z2 |= this.A0E.isFinished();
        }
        if (z2) {
            postInvalidateOnAnimation();
        }
    }

    public void A0X(int i2) {
        AnonymousClass02W r0 = this.A0S;
        if (r0 != null) {
            r0.A0n(i2);
            awakenScrollBars();
        }
    }

    public void A0Y(int i2) {
    }

    public void A0Z(int i2) {
        if (!this.A0m) {
            A0S();
            AnonymousClass02W r0 = this.A0S;
            if (r0 == null) {
                Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
                return;
            }
            r0.A0n(i2);
            awakenScrollBars();
        }
    }

    public void A0a(int i2) {
        if (!this.A0m) {
            AnonymousClass02W r1 = this.A0S;
            if (r1 == null) {
                Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            } else {
                r1.A0w(this.A0y, this, i2);
            }
        }
    }

    public void A0b(int i2, int i3) {
        boolean z2;
        EdgeEffect edgeEffect = this.A0F;
        if (edgeEffect == null || edgeEffect.isFinished() || i2 <= 0) {
            z2 = false;
        } else {
            this.A0F.onRelease();
            z2 = this.A0F.isFinished();
        }
        EdgeEffect edgeEffect2 = this.A0G;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i2 < 0) {
            this.A0G.onRelease();
            z2 |= this.A0G.isFinished();
        }
        EdgeEffect edgeEffect3 = this.A0H;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i3 > 0) {
            this.A0H.onRelease();
            z2 |= this.A0H.isFinished();
        }
        EdgeEffect edgeEffect4 = this.A0E;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i3 < 0) {
            this.A0E.onRelease();
            z2 |= this.A0E.isFinished();
        }
        if (z2) {
            postInvalidateOnAnimation();
        }
    }

    public void A0c(int i2, int i3) {
        setMeasuredDimension(AnonymousClass02W.A00(i2, getPaddingLeft() + getPaddingRight(), getMinimumWidth()), AnonymousClass02W.A00(i3, getPaddingTop() + getPaddingBottom(), getMinimumHeight()));
    }

    public void A0d(int i2, int i3) {
        this.A02++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX, scrollY);
        AnonymousClass071 r0 = this.A0V;
        if (r0 != null) {
            r0.A00(this, i2, i3);
        }
        List list = this.A0b;
        if (list != null) {
            int size = list.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                ((AnonymousClass071) this.A0b.get(size)).A00(this, i2, i3);
            }
        }
        this.A02--;
    }

    public void A0e(int i2, int i3) {
        int i4;
        AnonymousClass02W r1 = this.A0S;
        if (r1 == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.A0m) {
            if (!r1.A13()) {
                i2 = 0;
            }
            if (!r1.A14()) {
                i3 = 0;
            }
            if (i2 != 0 || i3 != 0) {
                C10540hI r4 = this.A0z;
                int abs = Math.abs(i2);
                int abs2 = Math.abs(i3);
                boolean z2 = false;
                if (abs > abs2) {
                    z2 = true;
                }
                int sqrt = (int) Math.sqrt((double) 0);
                int sqrt2 = (int) Math.sqrt((double) ((i2 * i2) + (i3 * i3)));
                RecyclerView recyclerView = r4.A06;
                int width = z2 ? recyclerView.getWidth() : recyclerView.getHeight();
                float f2 = (float) width;
                float f3 = (float) (width >> 1);
                float sin = f3 + (((float) Math.sin((double) ((Math.min(1.0f, (((float) sqrt2) * 1.0f) / f2) - 0.5f) * 0.47123894f))) * f3);
                if (sqrt > 0) {
                    i4 = Math.round(Math.abs(sin / ((float) sqrt)) * 1000.0f) << 2;
                } else {
                    if (!z2) {
                        abs = abs2;
                    }
                    i4 = (int) (((((float) abs) / f2) + 1.0f) * 300.0f);
                }
                r4.A01(A1B, i2, i3, Math.min(i4, 2000));
            }
        }
    }

    public void A0f(int i2, int i3, boolean z2) {
        int i4 = i2 + i3;
        AnonymousClass0SK r8 = this.A0K;
        int A012 = r8.A01();
        for (int i5 = 0; i5 < A012; i5++) {
            C005602k A013 = A01(r8.A04(i5));
            if (A013 != null && !A013.A05()) {
                int i6 = A013.A05;
                if (i6 >= i4) {
                    A013.A03(-i3, z2);
                } else if (i6 >= i2) {
                    A013.A00 = 8 | A013.A00;
                    A013.A03(-i3, z2);
                    A013.A05 = i2 - 1;
                }
                this.A0y.A0C = true;
            }
        }
        AnonymousClass0SJ r5 = this.A0w;
        ArrayList arrayList = r5.A06;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                C005602k r2 = (C005602k) arrayList.get(size);
                if (r2 != null) {
                    int i7 = r2.A05;
                    if (i7 >= i4) {
                        r2.A03(-i3, z2);
                    } else if (i7 >= i2) {
                        r2.A00 = 8 | r2.A00;
                        r5.A04(size);
                    }
                }
            } else {
                requestLayout();
                return;
            }
        }
    }

    public void A0g(int i2, int[] iArr, int i3) {
        C005602k r0;
        A0R();
        this.A09++;
        C004201v.A01("RV Scroll");
        AnonymousClass0Ri r2 = this.A0y;
        if (this.A0B == 2) {
            OverScroller overScroller = this.A0z.A03;
            overScroller.getFinalX();
            overScroller.getCurrX();
            overScroller.getFinalY();
            overScroller.getCurrY();
        }
        int A0X2 = i2 != 0 ? this.A0S.A0X(this.A0w, r2, i2) : 0;
        int A0Y2 = i3 != 0 ? this.A0S.A0Y(this.A0w, r2, i3) : 0;
        C004201v.A00();
        AnonymousClass0SK r8 = this.A0K;
        int A002 = r8.A00();
        for (int i4 = 0; i4 < A002; i4++) {
            View A032 = r8.A03(i4);
            C005602k A0F2 = A0F(A032);
            if (!(A0F2 == null || (r0 = A0F2.A0B) == null)) {
                View view = r0.A0H;
                int left = A032.getLeft();
                int top2 = A032.getTop();
                if (left != view.getLeft() || top2 != view.getTop()) {
                    view.layout(left, top2, view.getWidth() + left, view.getHeight() + top2);
                }
            }
        }
        A0P();
        A0t(false);
        if (iArr != null) {
            iArr[0] = A0X2;
            iArr[1] = A0Y2;
        }
    }

    public final void A0h(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.A0A) {
            int i2 = 0;
            if (actionIndex == 0) {
                i2 = 1;
            }
            this.A0A = motionEvent.getPointerId(i2);
            int x2 = (int) (motionEvent.getX(i2) + 0.5f);
            this.A07 = x2;
            this.A04 = x2;
            int y2 = (int) (motionEvent.getY(i2) + 0.5f);
            this.A08 = y2;
            this.A05 = y2;
        }
    }

    public void A0i(View view) {
        C005602k A012 = A01(view);
        AnonymousClass01X r0 = this.A0N;
        if (!(r0 == null || A012 == null)) {
            r0.A06(A012);
        }
        List list = this.A0a;
        if (list != null) {
            int size = list.size();
            while (true) {
                size--;
                if (size >= 0) {
                    ((AnonymousClass05I) this.A0a.get(size)).AOR(view);
                } else {
                    return;
                }
            }
        }
    }

    public final void A0j(View view, View view2) {
        View view3 = view;
        View view4 = view;
        if (view2 != null) {
            view4 = view2;
        }
        Rect rect = this.A0s;
        rect.set(0, 0, view4.getWidth(), view4.getHeight());
        ViewGroup.LayoutParams layoutParams = view4.getLayoutParams();
        if (layoutParams instanceof AnonymousClass0Bp) {
            AnonymousClass0Bp r1 = (AnonymousClass0Bp) layoutParams;
            if (!r1.A01) {
                Rect rect2 = r1.A03;
                rect.left -= rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        AnonymousClass02W r2 = this.A0S;
        boolean z2 = !this.A0g;
        boolean z3 = false;
        if (view2 == null) {
            z3 = true;
        }
        r2.A0T(rect, view3, this, z2, z3);
    }

    public final void A0k(AnonymousClass01X r6, boolean z2, boolean z3) {
        AnonymousClass01X r0 = this.A0N;
        if (r0 != null) {
            r0.A01.unregisterObserver(this.A0x);
            this.A0N.A0A(this);
        }
        if (!z2 || z3) {
            A0Q();
        }
        C07620cC r1 = this.A0J;
        r1.A09(r1.A04);
        r1.A09(r1.A05);
        r1.A00 = 0;
        AnonymousClass01X r2 = this.A0N;
        this.A0N = r6;
        if (r6 != null) {
            r6.A01.registerObserver(this.A0x);
            r6.A09(this);
        }
        AnonymousClass0SJ r12 = this.A0w;
        AnonymousClass01X r4 = this.A0N;
        r12.A05.clear();
        r12.A02();
        AnonymousClass0PR r3 = r12.A02;
        if (r3 == null) {
            r3 = new AnonymousClass0PR();
            r12.A02 = r3;
        }
        if (r2 != null) {
            r3.A00--;
        }
        if (!z2 && r3.A00 == 0) {
            int i2 = 0;
            while (true) {
                SparseArray sparseArray = r3.A01;
                if (i2 >= sparseArray.size()) {
                    break;
                }
                ((C04850Oe) sparseArray.valueAt(i2)).A03.clear();
                i2++;
            }
        }
        if (r4 != null) {
            r3.A00++;
        }
        this.A0y.A0C = true;
    }

    public void A0l(AnonymousClass0O0 r4, C005602k r5) {
        int i2 = 0 | (r5.A00 & -8193);
        r5.A00 = i2;
        if (this.A0y.A0D && (i2 & 2) != 0 && (i2 & 8) == 0 && !r5.A05()) {
            this.A11.A01.A09(this.A0N.A00 ? r5.A08 : (long) r5.A05, r5);
        }
        this.A11.A01(r4, r5);
    }

    public void A0m(AnonymousClass07D r3) {
        AnonymousClass02W r1 = this.A0S;
        if (r1 != null) {
            r1.A12("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.A13;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(r3);
        A0O();
        requestLayout();
    }

    public void A0n(AnonymousClass07D r4) {
        AnonymousClass02W r1 = this.A0S;
        if (r1 != null) {
            r1.A12("Cannot remove item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.A13;
        arrayList.remove(r4);
        if (arrayList.isEmpty()) {
            boolean z2 = false;
            if (getOverScrollMode() == 2) {
                z2 = true;
            }
            setWillNotDraw(z2);
        }
        A0O();
        requestLayout();
    }

    public void A0o(AnonymousClass071 r2) {
        List list = this.A0b;
        if (list == null) {
            list = new ArrayList();
            this.A0b = list;
        }
        list.add(r2);
    }

    public void A0p(AnonymousClass071 r2) {
        List list = this.A0b;
        if (list != null) {
            list.remove(r2);
        }
    }

    public final void A0q(C005602k r7) {
        View view = r7.A0H;
        boolean z2 = false;
        if (view.getParent() == this) {
            z2 = true;
        }
        this.A0w.A09(A0F(view));
        boolean z3 = false;
        if ((r7.A00 & 256) != 0) {
            z3 = true;
        }
        AnonymousClass0SK r2 = this.A0K;
        if (z3) {
            r2.A0A(view, view.getLayoutParams(), -1, true);
        } else if (!z2) {
            r2.A09(view, -1, true);
        } else {
            int indexOfChild = ((C07570c7) r2.A01).A00.indexOfChild(view);
            if (indexOfChild >= 0) {
                r2.A00.A04(indexOfChild);
                r2.A07(view);
                return;
            }
            StringBuilder sb = new StringBuilder("view is not a child, cannot hide ");
            sb.append(view);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public void A0r(String str) {
        if (this.A09 > 0) {
            if (str == null) {
                StringBuilder sb = new StringBuilder("Cannot call this method while RecyclerView is computing a layout or scrolling");
                sb.append(A0G());
                throw new IllegalStateException(sb.toString());
            }
            throw new IllegalStateException(str);
        } else if (this.A02 > 0) {
            StringBuilder sb2 = new StringBuilder("");
            sb2.append(A0G());
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(sb2.toString()));
        }
    }

    public void A0s(boolean z2) {
        this.A0f = z2 | this.A0f;
        this.A0e = true;
        AnonymousClass0SK r5 = this.A0K;
        int A012 = r5.A01();
        for (int i2 = 0; i2 < A012; i2++) {
            C005602k A013 = A01(r5.A04(i2));
            if (A013 != null && !A013.A05()) {
                A013.A00 = 6 | A013.A00;
            }
        }
        A0O();
        AnonymousClass0SJ r6 = this.A0w;
        ArrayList arrayList = r6.A06;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            C005602k r2 = (C005602k) arrayList.get(i3);
            if (r2 != null) {
                int i4 = 6 | r2.A00;
                r2.A00 = i4;
                r2.A00 = 1024 | i4;
            }
        }
        AnonymousClass01X r0 = r6.A08.A0N;
        if (r0 == null || !r0.A00) {
            r6.A02();
        }
    }

    public void A0t(boolean z2) {
        int i2 = this.A06;
        if (i2 < 1) {
            this.A06 = 1;
            i2 = 1;
        }
        if (!z2 && !this.A0m) {
            this.A0n = false;
        }
        if (i2 == 1) {
            if (z2 && this.A0n && !this.A0m && this.A0S != null && this.A0N != null) {
                A0I();
            }
            if (!this.A0m) {
                this.A0n = false;
            }
        }
        this.A06--;
    }

    public final void A0u(int[] iArr) {
        AnonymousClass0SK r9 = this.A0K;
        int A002 = r9.A00();
        if (A002 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i2 = Integer.MAX_VALUE;
        int i3 = Integer.MIN_VALUE;
        for (int i4 = 0; i4 < A002; i4++) {
            C005602k A012 = A01(r9.A03(i4));
            if (!A012.A05()) {
                int i5 = A012.A06;
                if (i5 == -1) {
                    i5 = A012.A05;
                }
                if (i5 < i2) {
                    i2 = i5;
                }
                if (i5 > i3) {
                    i3 = i5;
                }
            }
        }
        iArr[0] = i2;
        iArr[1] = i3;
    }

    public boolean A0v() {
        return getScrollingChildHelper().A00 != null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00ee, code lost:
        if (r4 == 0.0f) goto L_0x00c8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00cc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0w(android.view.MotionEvent r20, int r21, int r22) {
        /*
            r19 = this;
            r12 = r19
            r12.A0H()
            X.01X r0 = r12.A0N
            r11 = 1
            r18 = 0
            r2 = r21
            r1 = r22
            if (r0 == 0) goto L_0x010a
            int[] r0 = r12.A1A
            r12.A0g(r2, r0, r1)
            r14 = r0[r18]
            r15 = r0[r11]
            int r6 = r21 - r14
            int r8 = r22 - r15
        L_0x001d:
            java.util.ArrayList r0 = r12.A13
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0028
            r12.invalidate()
        L_0x0028:
            int[] r13 = r12.A19
            r16 = r6
            r17 = r8
            boolean r0 = r12.A0x(r13, r14, r15, r16, r17, r18)
            r4 = r20
            if (r0 == 0) goto L_0x0071
            int r0 = r12.A07
            r2 = r13[r18]
            int r0 = r0 - r2
            r12.A07 = r0
            int r1 = r12.A08
            r0 = r13[r11]
            int r1 = r1 - r0
            r12.A08 = r1
            if (r20 == 0) goto L_0x004b
            float r1 = (float) r2
            float r0 = (float) r0
            r4.offsetLocation(r1, r0)
        L_0x004b:
            int[] r2 = r12.A17
            r1 = r2[r18]
            r0 = r13[r18]
            int r1 = r1 + r0
            r2[r18] = r1
            r1 = r2[r11]
            r0 = r13[r11]
            int r1 = r1 + r0
            r2[r11] = r1
        L_0x005b:
            if (r14 != 0) goto L_0x005f
            if (r15 == 0) goto L_0x0062
        L_0x005f:
            r12.A0d(r14, r15)
        L_0x0062:
            boolean r0 = r12.awakenScrollBars()
            if (r0 != 0) goto L_0x006b
            r12.invalidate()
        L_0x006b:
            if (r14 != 0) goto L_0x0070
            if (r15 != 0) goto L_0x0070
            r11 = 0
        L_0x0070:
            return r11
        L_0x0071:
            int r3 = r12.getOverScrollMode()
            r0 = 2
            if (r3 == r0) goto L_0x005b
            if (r20 == 0) goto L_0x00c8
            r3 = 8194(0x2002, float:1.1482E-41)
            int r0 = r4.getSource()
            r0 = r0 & r3
            if (r0 == r3) goto L_0x00c8
            float r5 = r4.getX()
            float r6 = (float) r6
            float r7 = r4.getY()
            float r4 = (float) r8
            r3 = 1065353216(0x3f800000, float:1.0)
            r10 = 0
            int r0 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r0 >= 0) goto L_0x00f1
            r12.A0K()
            android.widget.EdgeEffect r8 = r12.A0F
            float r9 = -r6
            int r0 = r12.getWidth()
            float r0 = (float) r0
            float r9 = r9 / r0
            int r0 = r12.getHeight()
            float r0 = (float) r0
            float r7 = r7 / r0
            float r7 = r3 - r7
        L_0x00a8:
            X.C04270Lw.A00(r8, r9, r7)
            r7 = 1
        L_0x00ac:
            int r0 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r0 >= 0) goto L_0x00cc
            r12.A0M()
            android.widget.EdgeEffect r6 = r12.A0H
            float r3 = -r4
            int r0 = r12.getHeight()
            float r0 = (float) r0
            float r3 = r3 / r0
            int r0 = r12.getWidth()
            float r0 = (float) r0
            float r5 = r5 / r0
            X.C04270Lw.A00(r6, r3, r5)
        L_0x00c5:
            r12.postInvalidateOnAnimation()
        L_0x00c8:
            r12.A0b(r2, r1)
            goto L_0x005b
        L_0x00cc:
            int r0 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r0 <= 0) goto L_0x00e6
            r12.A0J()
            android.widget.EdgeEffect r6 = r12.A0E
            int r0 = r12.getHeight()
            float r0 = (float) r0
            float r4 = r4 / r0
            int r0 = r12.getWidth()
            float r0 = (float) r0
            float r5 = r5 / r0
            float r3 = r3 - r5
            X.C04270Lw.A00(r6, r4, r3)
            goto L_0x00c5
        L_0x00e6:
            if (r7 != 0) goto L_0x00c5
            int r0 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r0 != 0) goto L_0x00c5
            int r0 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r0 == 0) goto L_0x00c8
            goto L_0x00c5
        L_0x00f1:
            int r0 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r0 <= 0) goto L_0x0108
            r12.A0L()
            android.widget.EdgeEffect r8 = r12.A0G
            int r0 = r12.getWidth()
            float r0 = (float) r0
            float r9 = r6 / r0
            int r0 = r12.getHeight()
            float r0 = (float) r0
            float r7 = r7 / r0
            goto L_0x00a8
        L_0x0108:
            r7 = 0
            goto L_0x00ac
        L_0x010a:
            r8 = 0
            r15 = 0
            r14 = 0
            r6 = 0
            goto L_0x001d
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.A0w(android.view.MotionEvent, int, int):boolean");
    }

    public boolean A0x(int[] iArr, int i2, int i3, int i4, int i5, int i6) {
        return getScrollingChildHelper().A05(iArr, (int[]) null, i2, i3, i4, i5, i6);
    }

    public boolean A0y(int[] iArr, int[] iArr2, int i2, int i3, int i4) {
        return getScrollingChildHelper().A04(iArr, iArr2, i2, i3, i4);
    }

    public void AgM(int i2) {
        getScrollingChildHelper().A00(i2);
    }

    public void addFocusables(ArrayList arrayList, int i2, int i3) {
        super.addFocusables(arrayList, i2, i3);
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof AnonymousClass0Bp) && this.A0S.A17((AnonymousClass0Bp) layoutParams);
    }

    public int computeHorizontalScrollExtent() {
        AnonymousClass02W r2 = this.A0S;
        if (r2 == null || !r2.A13()) {
            return 0;
        }
        return r2.A0Z(this.A0y);
    }

    public int computeHorizontalScrollOffset() {
        AnonymousClass02W r2 = this.A0S;
        if (r2 == null || !r2.A13()) {
            return 0;
        }
        return r2.A0a(this.A0y);
    }

    public int computeHorizontalScrollRange() {
        AnonymousClass02W r2 = this.A0S;
        if (r2 == null || !r2.A13()) {
            return 0;
        }
        return r2.A0b(this.A0y);
    }

    public int computeVerticalScrollExtent() {
        AnonymousClass02W r2 = this.A0S;
        if (r2 == null || !r2.A14()) {
            return 0;
        }
        return r2.A0c(this.A0y);
    }

    public int computeVerticalScrollOffset() {
        AnonymousClass02W r2 = this.A0S;
        if (r2 == null || !r2.A14()) {
            return 0;
        }
        return r2.A0d(this.A0y);
    }

    public int computeVerticalScrollRange() {
        AnonymousClass02W r2 = this.A0S;
        if (r2 == null || !r2.A14()) {
            return 0;
        }
        return r2.A0e(this.A0y);
    }

    public boolean dispatchNestedFling(float f2, float f3, boolean z2) {
        return getScrollingChildHelper().A02(f2, f3, z2);
    }

    public boolean dispatchNestedPreFling(float f2, float f3) {
        return getScrollingChildHelper().A01(f2, f3);
    }

    public boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().A04(iArr, iArr2, i2, i3, 0);
    }

    public boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
        return getScrollingChildHelper().A05(iArr, (int[]) null, i2, i3, i4, i5, 0);
    }

    public void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    public void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004a, code lost:
        if (r0.draw(r8) == false) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0078, code lost:
        if (r1 == false) goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ae, code lost:
        if (r1 == false) goto L_0x00b0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void draw(android.graphics.Canvas r8) {
        /*
            r7 = this;
            super.draw(r8)
            java.util.ArrayList r3 = r7.A13
            int r4 = r3.size()
            r6 = 0
            r2 = 0
        L_0x000b:
            if (r2 >= r4) goto L_0x001b
            java.lang.Object r1 = r3.get(r2)
            X.07D r1 = (X.AnonymousClass07D) r1
            X.0Ri r0 = r7.A0y
            r1.A02(r8, r0, r7)
            int r2 = r2 + 1
            goto L_0x000b
        L_0x001b:
            android.widget.EdgeEffect r0 = r7.A0F
            if (r0 == 0) goto L_0x0116
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x0116
            int r2 = r8.save()
            boolean r0 = r7.A0d
            if (r0 == 0) goto L_0x0113
            int r1 = r7.getPaddingBottom()
        L_0x0031:
            r0 = 1132920832(0x43870000, float:270.0)
            r8.rotate(r0)
            int r0 = r7.getHeight()
            int r0 = -r0
            int r0 = r0 + r1
            float r1 = (float) r0
            r0 = 0
            r8.translate(r1, r0)
            android.widget.EdgeEffect r0 = r7.A0F
            if (r0 == 0) goto L_0x004c
            boolean r0 = r0.draw(r8)
            r5 = 1
            if (r0 != 0) goto L_0x004d
        L_0x004c:
            r5 = 0
        L_0x004d:
            r8.restoreToCount(r2)
        L_0x0050:
            android.widget.EdgeEffect r0 = r7.A0H
            if (r0 == 0) goto L_0x007f
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x007f
            int r2 = r8.save()
            boolean r0 = r7.A0d
            if (r0 == 0) goto L_0x006f
            int r0 = r7.getPaddingLeft()
            float r1 = (float) r0
            int r0 = r7.getPaddingTop()
            float r0 = (float) r0
            r8.translate(r1, r0)
        L_0x006f:
            android.widget.EdgeEffect r0 = r7.A0H
            if (r0 == 0) goto L_0x007a
            boolean r1 = r0.draw(r8)
            r0 = 1
            if (r1 != 0) goto L_0x007b
        L_0x007a:
            r0 = 0
        L_0x007b:
            r5 = r5 | r0
            r8.restoreToCount(r2)
        L_0x007f:
            android.widget.EdgeEffect r0 = r7.A0G
            if (r0 == 0) goto L_0x00b5
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x00b5
            int r4 = r8.save()
            int r2 = r7.getWidth()
            boolean r0 = r7.A0d
            if (r0 == 0) goto L_0x0111
            int r1 = r7.getPaddingTop()
        L_0x0099:
            r0 = 1119092736(0x42b40000, float:90.0)
            r8.rotate(r0)
            int r0 = -r1
            float r1 = (float) r0
            int r0 = -r2
            float r0 = (float) r0
            r8.translate(r1, r0)
            android.widget.EdgeEffect r0 = r7.A0G
            if (r0 == 0) goto L_0x00b0
            boolean r1 = r0.draw(r8)
            r0 = 1
            if (r1 != 0) goto L_0x00b1
        L_0x00b0:
            r0 = 0
        L_0x00b1:
            r5 = r5 | r0
            r8.restoreToCount(r4)
        L_0x00b5:
            android.widget.EdgeEffect r0 = r7.A0E
            if (r0 == 0) goto L_0x00f4
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x00f4
            int r4 = r8.save()
            r0 = 1127481344(0x43340000, float:180.0)
            r8.rotate(r0)
            boolean r2 = r7.A0d
            int r0 = r7.getWidth()
            int r1 = -r0
            if (r2 == 0) goto L_0x010a
            int r0 = r7.getPaddingRight()
            int r1 = r1 + r0
            float r2 = (float) r1
            int r0 = r7.getHeight()
            int r1 = -r0
            int r0 = r7.getPaddingBottom()
            int r1 = r1 + r0
        L_0x00e1:
            float r0 = (float) r1
            r8.translate(r2, r0)
            android.widget.EdgeEffect r0 = r7.A0E
            if (r0 == 0) goto L_0x00f0
            boolean r0 = r0.draw(r8)
            if (r0 == 0) goto L_0x00f0
            r6 = 1
        L_0x00f0:
            r5 = r5 | r6
            r8.restoreToCount(r4)
        L_0x00f4:
            if (r5 != 0) goto L_0x0106
            X.02j r1 = r7.A0R
            if (r1 == 0) goto L_0x0109
            int r0 = r3.size()
            if (r0 <= 0) goto L_0x0109
            boolean r0 = r1.A0B()
            if (r0 == 0) goto L_0x0109
        L_0x0106:
            r7.postInvalidateOnAnimation()
        L_0x0109:
            return
        L_0x010a:
            float r2 = (float) r1
            int r0 = r7.getHeight()
            int r1 = -r0
            goto L_0x00e1
        L_0x0111:
            r1 = 0
            goto L_0x0099
        L_0x0113:
            r1 = 0
            goto L_0x0031
        L_0x0116:
            r5 = 0
            goto L_0x0050
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.draw(android.graphics.Canvas):void");
    }

    public boolean drawChild(Canvas canvas, View view, long j2) {
        return super.drawChild(canvas, view, j2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0146, code lost:
        if (r3 <= r2) goto L_0x0148;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0032, code lost:
        if (r5.findNextFocus(r11, r12, r0) == null) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0034, code lost:
        A0H();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003b, code lost:
        if (A0C(r12) == null) goto L_0x016e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003d, code lost:
        A0R();
        r11.A0S.A0g(r12, r11.A0w, r11.A0y, r13);
        A0t(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0050, code lost:
        if (r5 != null) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0084, code lost:
        if (r5.findNextFocus(r11, r12, r0) == null) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        if (r11.A0m != false) goto L_0x0013;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0121, code lost:
        if (r10 > 0) goto L_0x0123;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View focusSearch(android.view.View r12, int r13) {
        /*
            r11 = this;
            X.01X r0 = r11.A0N
            r6 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0013
            X.02W r0 = r11.A0S
            if (r0 == 0) goto L_0x0013
            int r0 = r11.A09
            if (r0 > 0) goto L_0x0013
            boolean r0 = r11.A0m
            r1 = 1
            if (r0 == 0) goto L_0x0014
        L_0x0013:
            r1 = 0
        L_0x0014:
            android.view.FocusFinder r5 = android.view.FocusFinder.getInstance()
            r4 = 0
            if (r1 == 0) goto L_0x0087
            r3 = 2
            if (r13 == r3) goto L_0x0020
            if (r13 != r6) goto L_0x0087
        L_0x0020:
            X.02W r0 = r11.A0S
            boolean r0 = r0.A14()
            if (r0 == 0) goto L_0x0063
            r0 = 33
            if (r13 != r3) goto L_0x002e
            r0 = 130(0x82, float:1.82E-43)
        L_0x002e:
            android.view.View r0 = r5.findNextFocus(r11, r12, r0)
            if (r0 != 0) goto L_0x0063
        L_0x0034:
            r11.A0H()
            android.view.View r0 = r11.A0C(r12)
            if (r0 == 0) goto L_0x016e
            r11.A0R()
            X.02W r3 = r11.A0S
            X.0SJ r1 = r11.A0w
            X.0Ri r0 = r11.A0y
            r3.A0g(r12, r1, r0, r13)
            r11.A0t(r2)
        L_0x004c:
            android.view.View r5 = r5.findNextFocus(r11, r12, r13)
        L_0x0050:
            if (r5 == 0) goto L_0x016f
        L_0x0052:
            boolean r0 = r5.hasFocusable()
            if (r0 != 0) goto L_0x00ad
            android.view.View r0 = r11.getFocusedChild()
            if (r0 != 0) goto L_0x00a9
            android.view.View r12 = super.focusSearch(r12, r13)
            return r12
        L_0x0063:
            X.02W r1 = r11.A0S
            boolean r0 = r1.A13()
            if (r0 == 0) goto L_0x004c
            androidx.recyclerview.widget.RecyclerView r0 = r1.A07
            int r0 = X.C004601z.A06(r0)
            r1 = 0
            if (r0 != r6) goto L_0x0075
            r1 = 1
        L_0x0075:
            r0 = 0
            if (r13 != r3) goto L_0x0079
            r0 = 1
        L_0x0079:
            r1 = r1 ^ r0
            r0 = 17
            if (r1 == 0) goto L_0x0080
            r0 = 66
        L_0x0080:
            android.view.View r0 = r5.findNextFocus(r11, r12, r0)
            if (r0 != 0) goto L_0x004c
            goto L_0x0034
        L_0x0087:
            android.view.View r5 = r5.findNextFocus(r11, r12, r13)
            if (r5 != 0) goto L_0x0052
            if (r1 == 0) goto L_0x016f
            r11.A0H()
            android.view.View r0 = r11.A0C(r12)
            if (r0 == 0) goto L_0x016e
            r11.A0R()
            X.02W r3 = r11.A0S
            X.0SJ r1 = r11.A0w
            X.0Ri r0 = r11.A0y
            android.view.View r5 = r3.A0g(r12, r1, r0, r13)
            r11.A0t(r2)
            goto L_0x0050
        L_0x00a9:
            r11.A0j(r5, r4)
            return r12
        L_0x00ad:
            if (r5 == r11) goto L_0x016f
            android.view.View r0 = r11.A0C(r5)
            if (r0 == 0) goto L_0x016f
            if (r12 == 0) goto L_0x0123
            android.view.View r0 = r11.A0C(r12)
            if (r0 == 0) goto L_0x0123
            android.graphics.Rect r8 = r11.A0s
            int r1 = r12.getWidth()
            int r0 = r12.getHeight()
            r8.set(r2, r2, r1, r0)
            android.graphics.Rect r7 = r11.A0t
            int r1 = r5.getWidth()
            int r0 = r5.getHeight()
            r7.set(r2, r2, r1, r0)
            r11.offsetDescendantRectToMyCoords(r12, r8)
            r11.offsetDescendantRectToMyCoords(r5, r7)
            X.02W r0 = r11.A0S
            androidx.recyclerview.widget.RecyclerView r0 = r0.A07
            int r0 = X.C004601z.A06(r0)
            r10 = -1
            r9 = 1
            if (r0 != r6) goto L_0x00ea
            r9 = -1
        L_0x00ea:
            int r3 = r8.left
            int r2 = r7.left
            if (r3 < r2) goto L_0x00f4
            int r1 = r8.right
            if (r1 > r2) goto L_0x013f
        L_0x00f4:
            int r1 = r8.right
            int r0 = r7.right
            if (r1 >= r0) goto L_0x013f
            r4 = 1
        L_0x00fb:
            int r3 = r8.top
            int r2 = r7.top
            if (r3 < r2) goto L_0x0105
            int r1 = r8.bottom
            if (r1 > r2) goto L_0x0134
        L_0x0105:
            int r1 = r8.bottom
            int r0 = r7.bottom
            if (r1 >= r0) goto L_0x0134
            r10 = 1
        L_0x010c:
            if (r13 == r6) goto L_0x012c
            r0 = 2
            if (r13 == r0) goto L_0x0124
            r0 = 17
            if (r13 == r0) goto L_0x016b
            r0 = 33
            if (r13 == r0) goto L_0x0168
            r0 = 66
            if (r13 == r0) goto L_0x0165
            r0 = 130(0x82, float:1.82E-43)
            if (r13 != r0) goto L_0x014a
            if (r10 <= 0) goto L_0x016f
        L_0x0123:
            return r5
        L_0x0124:
            if (r10 > 0) goto L_0x0123
            if (r10 != 0) goto L_0x016f
            int r4 = r4 * r9
            if (r4 < 0) goto L_0x016f
            return r5
        L_0x012c:
            if (r10 < 0) goto L_0x0123
            if (r10 != 0) goto L_0x016f
            int r4 = r4 * r9
            if (r4 > 0) goto L_0x016f
            return r5
        L_0x0134:
            int r0 = r7.bottom
            if (r1 > r0) goto L_0x013a
            if (r3 < r0) goto L_0x013d
        L_0x013a:
            if (r3 <= r2) goto L_0x013d
            goto L_0x010c
        L_0x013d:
            r10 = 0
            goto L_0x010c
        L_0x013f:
            int r0 = r7.right
            if (r1 > r0) goto L_0x0145
            if (r3 < r0) goto L_0x0148
        L_0x0145:
            r4 = -1
            if (r3 > r2) goto L_0x00fb
        L_0x0148:
            r4 = 0
            goto L_0x00fb
        L_0x014a:
            java.lang.String r0 = "Invalid direction: "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r13)
            java.lang.String r0 = r11.A0G()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0165:
            if (r4 <= 0) goto L_0x016f
            return r5
        L_0x0168:
            if (r10 >= 0) goto L_0x016f
            return r5
        L_0x016b:
            if (r4 >= 0) goto L_0x016f
            return r5
        L_0x016e:
            return r4
        L_0x016f:
            android.view.View r5 = super.focusSearch(r12, r13)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        AnonymousClass02W r0 = this.A0S;
        if (r0 != null) {
            return r0.A0h();
        }
        StringBuilder sb = new StringBuilder("RecyclerView has no LayoutManager");
        sb.append(A0G());
        throw new IllegalStateException(sb.toString());
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        AnonymousClass02W r1 = this.A0S;
        if (r1 != null) {
            return r1.A0i(getContext(), attributeSet);
        }
        StringBuilder sb = new StringBuilder("RecyclerView has no LayoutManager");
        sb.append(A0G());
        throw new IllegalStateException(sb.toString());
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        AnonymousClass02W r0 = this.A0S;
        if (r0 != null) {
            return r0.A0j(layoutParams);
        }
        StringBuilder sb = new StringBuilder("RecyclerView has no LayoutManager");
        sb.append(A0G());
        throw new IllegalStateException(sb.toString());
    }

    public AnonymousClass01X getAdapter() {
        return this.A0N;
    }

    public int getBaseline() {
        if (this.A0S != null) {
            return -1;
        }
        return super.getBaseline();
    }

    public int getChildDrawingOrder(int i2, int i3) {
        C11950jb r0 = this.A0O;
        if (r0 == null) {
            return super.getChildDrawingOrder(i2, i3);
        }
        C02800Fh r3 = ((C07630cD) r0).A00;
        View view = r3.A0G;
        if (view == null) {
            return i3;
        }
        int i4 = r3.A0A;
        if (i4 == -1) {
            i4 = r3.A0M.indexOfChild(view);
            r3.A0A = i4;
        }
        return i3 == i2 + -1 ? i4 : i3 >= i4 ? i3 + 1 : i3;
    }

    public boolean getClipToPadding() {
        return this.A0d;
    }

    public AnonymousClass0EK getCompatAccessibilityDelegate() {
        return this.A0Y;
    }

    public AnonymousClass0M2 getEdgeEffectFactory() {
        return this.A0P;
    }

    public C005502j getItemAnimator() {
        return this.A0R;
    }

    public int getItemDecorationCount() {
        return this.A13.size();
    }

    public AnonymousClass02W getLayoutManager() {
        return this.A0S;
    }

    public int getMaxFlingVelocity() {
        return this.A0q;
    }

    public int getMinFlingVelocity() {
        return this.A0r;
    }

    public long getNanoTime() {
        if (A1D) {
            return System.nanoTime();
        }
        return 0;
    }

    public AnonymousClass0M3 getOnFlingListener() {
        return this.A0T;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.A0p;
    }

    public AnonymousClass0PR getRecycledViewPool() {
        AnonymousClass0SJ r1 = this.A0w;
        AnonymousClass0PR r0 = r1.A02;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass0PR r02 = new AnonymousClass0PR();
        r1.A02 = r02;
        return r02;
    }

    public int getScrollState() {
        return this.A0B;
    }

    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().A01 != null;
    }

    public boolean isAttachedToWindow() {
        return this.A0j;
    }

    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().A02;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A09 = 0;
        boolean z2 = true;
        this.A0j = true;
        if (!this.A0g || isLayoutRequested()) {
            z2 = false;
        }
        this.A0g = z2;
        AnonymousClass02W r1 = this.A0S;
        if (r1 != null) {
            r1.A0B = true;
        }
        this.A0o = false;
        if (A1D) {
            ThreadLocal threadLocal = C10620hQ.A05;
            C10620hQ r0 = (C10620hQ) threadLocal.get();
            this.A0M = r0;
            if (r0 == null) {
                this.A0M = new C10620hQ();
                Display A0C2 = C004601z.A0C(this);
                float f2 = 60.0f;
                if (!isInEditMode() && A0C2 != null) {
                    float refreshRate = A0C2.getRefreshRate();
                    if (refreshRate >= 30.0f) {
                        f2 = refreshRate;
                    }
                }
                C10620hQ r2 = this.A0M;
                r2.A00 = (long) (1.0E9f / f2);
                threadLocal.set(r2);
            }
            this.A0M.A02.add(this);
        }
    }

    public void onDetachedFromWindow() {
        C10620hQ r0;
        super.onDetachedFromWindow();
        C005502j r02 = this.A0R;
        if (r02 != null) {
            r02.A08();
        }
        A0S();
        this.A0j = false;
        AnonymousClass02W r1 = this.A0S;
        if (r1 != null) {
            AnonymousClass0SJ r03 = this.A0w;
            r1.A0B = false;
            r1.A0u(r03, this);
        }
        this.A15.clear();
        removeCallbacks(this.A0Z);
        do {
        } while (AnonymousClass0U1.A03.A4T() != null);
        if (A1D && (r0 = this.A0M) != null) {
            r0.A02.remove(this);
            this.A0M = null;
        }
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.A13;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((AnonymousClass07D) arrayList.get(i2)).A01(canvas, this.A0y, this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0039, code lost:
        if (r3 == 0.0f) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003d, code lost:
        if (r2 != 0.0f) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003f, code lost:
        A0w(r7, (int) (r2 * r6.A00), (int) (r3 * r6.A01));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onGenericMotionEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            X.02W r0 = r6.A0S
            r5 = 0
            if (r0 == 0) goto L_0x004a
            boolean r0 = r6.A0m
            if (r0 != 0) goto L_0x004a
            int r1 = r7.getAction()
            r0 = 8
            if (r1 != r0) goto L_0x004a
            int r0 = r7.getSource()
            r0 = r0 & 2
            r4 = 0
            if (r0 == 0) goto L_0x004d
            X.02W r0 = r6.A0S
            boolean r0 = r0.A14()
            if (r0 == 0) goto L_0x004b
            r0 = 9
            float r0 = r7.getAxisValue(r0)
            float r3 = -r0
        L_0x0029:
            X.02W r0 = r6.A0S
            boolean r0 = r0.A13()
            if (r0 == 0) goto L_0x0065
            r0 = 10
            float r2 = r7.getAxisValue(r0)
        L_0x0037:
            int r0 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x003f
        L_0x003b:
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x004a
        L_0x003f:
            float r0 = r6.A00
            float r2 = r2 * r0
            int r1 = (int) r2
            float r0 = r6.A01
            float r3 = r3 * r0
            int r0 = (int) r3
            r6.A0w(r7, r1, r0)
        L_0x004a:
            return r5
        L_0x004b:
            r3 = 0
            goto L_0x0029
        L_0x004d:
            int r1 = r7.getSource()
            r0 = 4194304(0x400000, float:5.877472E-39)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x004a
            r0 = 26
            float r2 = r7.getAxisValue(r0)
            X.02W r1 = r6.A0S
            boolean r0 = r1.A14()
            if (r0 == 0) goto L_0x0067
            float r3 = -r2
        L_0x0065:
            r2 = 0
            goto L_0x0037
        L_0x0067:
            boolean r0 = r1.A13()
            if (r0 == 0) goto L_0x004a
            r3 = 0
            goto L_0x003b
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00ef, code lost:
        if (r4 != false) goto L_0x00eb;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r11) {
        /*
            r10 = this;
            boolean r0 = r10.A0m
            r2 = 0
            if (r0 != 0) goto L_0x013f
            int r6 = r11.getAction()
            r9 = 3
            if (r6 == r9) goto L_0x000e
            if (r6 != 0) goto L_0x0011
        L_0x000e:
            r0 = 0
            r10.A0U = r0
        L_0x0011:
            java.util.ArrayList r5 = r10.A14
            int r4 = r5.size()
            r3 = 0
        L_0x0018:
            if (r3 >= r4) goto L_0x0038
            java.lang.Object r1 = r5.get(r3)
            X.0le r1 = (X.C13210le) r1
            boolean r0 = r1.ASI(r11, r10)
            if (r0 == 0) goto L_0x0035
            if (r6 == r9) goto L_0x0035
            r10.A0U = r1
            r0 = 1
        L_0x002b:
            r1 = 1
            if (r0 == 0) goto L_0x003a
            r10.A0W()
            r10.setScrollState(r2)
            return r1
        L_0x0035:
            int r3 = r3 + 1
            goto L_0x0018
        L_0x0038:
            r0 = 0
            goto L_0x002b
        L_0x003a:
            X.02W r0 = r10.A0S
            if (r0 == 0) goto L_0x013f
            boolean r3 = r0.A13()
            boolean r8 = r0.A14()
            android.view.VelocityTracker r0 = r10.A0D
            if (r0 != 0) goto L_0x0050
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r10.A0D = r0
        L_0x0050:
            r0.addMovement(r11)
            int r7 = r11.getActionMasked()
            int r6 = r11.getActionIndex()
            r4 = 2
            r5 = 1056964608(0x3f000000, float:0.5)
            if (r7 == 0) goto L_0x00fe
            if (r7 == r1) goto L_0x00f4
            if (r7 == r4) goto L_0x0097
            if (r7 == r9) goto L_0x0090
            r0 = 5
            if (r7 == r0) goto L_0x0075
            r0 = 6
            if (r7 != r0) goto L_0x006f
            r10.A0h(r11)
        L_0x006f:
            int r0 = r10.A0B
            if (r0 != r1) goto L_0x013f
            r2 = 1
            return r2
        L_0x0075:
            int r0 = r11.getPointerId(r6)
            r10.A0A = r0
            float r0 = r11.getX(r6)
            float r0 = r0 + r5
            int r0 = (int) r0
            r10.A07 = r0
            r10.A04 = r0
            float r0 = r11.getY(r6)
            float r0 = r0 + r5
            int r0 = (int) r0
            r10.A08 = r0
            r10.A05 = r0
            goto L_0x006f
        L_0x0090:
            r10.A0W()
            r10.setScrollState(r2)
            goto L_0x006f
        L_0x0097:
            int r0 = r10.A0A
            int r4 = r11.findPointerIndex(r0)
            if (r4 >= 0) goto L_0x00ba
            java.lang.String r0 = "Error processing scroll; pointer index for id "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            int r0 = r10.A0A
            r1.append(r0)
            java.lang.String r0 = " not found. Did any MotionEvents get skipped?"
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "RecyclerView"
            android.util.Log.e(r0, r1)
            return r2
        L_0x00ba:
            float r0 = r11.getX(r4)
            float r0 = r0 + r5
            int r7 = (int) r0
            float r0 = r11.getY(r4)
            float r0 = r0 + r5
            int r6 = (int) r0
            int r0 = r10.A0B
            if (r0 == r1) goto L_0x006f
            int r0 = r10.A04
            int r4 = r7 - r0
            int r0 = r10.A05
            int r5 = r6 - r0
            if (r3 == 0) goto L_0x00f2
            int r3 = java.lang.Math.abs(r4)
            int r0 = r10.A0C
            if (r3 <= r0) goto L_0x00f2
            r10.A07 = r7
            r4 = 1
        L_0x00df:
            if (r8 == 0) goto L_0x00ef
            int r3 = java.lang.Math.abs(r5)
            int r0 = r10.A0C
            if (r3 <= r0) goto L_0x00ef
            r10.A08 = r6
        L_0x00eb:
            r10.setScrollState(r1)
            goto L_0x006f
        L_0x00ef:
            if (r4 == 0) goto L_0x006f
            goto L_0x00eb
        L_0x00f2:
            r4 = 0
            goto L_0x00df
        L_0x00f4:
            android.view.VelocityTracker r0 = r10.A0D
            r0.clear()
            r10.AgM(r2)
            goto L_0x006f
        L_0x00fe:
            boolean r0 = r10.A0i
            if (r0 == 0) goto L_0x0104
            r10.A0i = r2
        L_0x0104:
            int r0 = r11.getPointerId(r2)
            r10.A0A = r0
            float r0 = r11.getX()
            float r0 = r0 + r5
            int r0 = (int) r0
            r10.A07 = r0
            r10.A04 = r0
            float r0 = r11.getY()
            float r0 = r0 + r5
            int r0 = (int) r0
            r10.A08 = r0
            r10.A05 = r0
            int r0 = r10.A0B
            if (r0 != r4) goto L_0x012c
            android.view.ViewParent r0 = r10.getParent()
            r0.requestDisallowInterceptTouchEvent(r1)
            r10.setScrollState(r1)
        L_0x012c:
            int[] r0 = r10.A17
            r0[r1] = r2
            r0[r2] = r2
            if (r8 == 0) goto L_0x0136
            r3 = r3 | 2
        L_0x0136:
            X.0XH r0 = r10.getScrollingChildHelper()
            r0.A03(r3, r2)
            goto L_0x006f
        L_0x013f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        C004201v.A01("RV OnLayout");
        A0I();
        C004201v.A00();
        this.A0g = true;
    }

    public void onMeasure(int i2, int i3) {
        AnonymousClass0Ri r1;
        AnonymousClass02W r12 = this.A0S;
        if (r12 == null) {
            A0c(i2, i3);
        } else if (r12.A15()) {
            int mode = View.MeasureSpec.getMode(i2);
            int mode2 = View.MeasureSpec.getMode(i3);
            AnonymousClass02W r0 = this.A0S;
            AnonymousClass0Ri r4 = this.A0y;
            r0.A07.A0c(i2, i3);
            if ((mode != 1073741824 || mode2 != 1073741824) && this.A0N != null) {
                if (r4.A04 == 1) {
                    A0T();
                }
                this.A0S.A0E(i2, i3);
                r4.A09 = true;
                A0U();
                this.A0S.A0F(i2, i3);
                if (this.A0S.A0S()) {
                    this.A0S.A0E(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    r4.A09 = true;
                    A0U();
                    this.A0S.A0F(i2, i3);
                }
            }
        } else if (this.A0h) {
            r12.A07.A0c(i2, i3);
        } else {
            if (this.A0c) {
                A0R();
                this.A09++;
                A0V();
                A0P();
                r1 = this.A0y;
                if (r1.A0A) {
                    r1.A08 = true;
                } else {
                    this.A0J.A04();
                    r1.A08 = false;
                }
                this.A0c = false;
                A0t(false);
            } else {
                r1 = this.A0y;
                if (r1.A0A) {
                    setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                    return;
                }
            }
            AnonymousClass01X r02 = this.A0N;
            if (r02 != null) {
                r1.A03 = r02.A0C();
            } else {
                r1.A03 = 0;
            }
            A0R();
            this.A0S.A07.A0c(i2, i3);
            A0t(false);
            r1.A08 = false;
        }
    }

    public boolean onRequestFocusInDescendants(int i2, Rect rect) {
        if (this.A09 > 0) {
            return false;
        }
        return super.onRequestFocusInDescendants(i2, rect);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof C02680Ek)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C02680Ek r3 = (C02680Ek) parcelable;
        this.A0X = r3;
        super.onRestoreInstanceState(r3.A00);
        AnonymousClass02W r1 = this.A0S;
        if (r1 != null && (parcelable2 = this.A0X.A00) != null) {
            r1.A0p(parcelable2);
        }
    }

    public Parcelable onSaveInstanceState() {
        Parcelable A0f2;
        C02680Ek r1 = new C02680Ek(super.onSaveInstanceState());
        C02680Ek r0 = this.A0X;
        if (r0 != null) {
            A0f2 = r0.A00;
        } else {
            AnonymousClass02W r02 = this.A0S;
            A0f2 = r02 != null ? r02.A0f() : null;
        }
        r1.A00 = A0f2;
        return r1;
    }

    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 != i4 || i3 != i5) {
            this.A0E = null;
            this.A0H = null;
            this.A0G = null;
            this.A0F = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:130:0x021d, code lost:
        r12 = (X.C02840Fl) r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0046, code lost:
        if (r2 != 1) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0194, code lost:
        if (r12 != false) goto L_0x0147;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x001f  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r23) {
        /*
            r22 = this;
            r5 = r22
            boolean r0 = r5.A0m
            r14 = 0
            if (r0 != 0) goto L_0x02bc
            boolean r0 = r5.A0i
            if (r0 != 0) goto L_0x02bc
            r7 = r23
            int r2 = r7.getAction()
            X.0le r0 = r5.A0U
            r6 = 1
            if (r0 == 0) goto L_0x0026
            r1 = 0
            if (r2 != 0) goto L_0x0040
            r5.A0U = r1
        L_0x001b:
            r0 = 0
        L_0x001c:
            r2 = 1
            if (r0 == 0) goto L_0x004c
            r5.A0W()
            r5.setScrollState(r14)
            return r2
        L_0x0026:
            if (r2 == 0) goto L_0x001b
            java.util.ArrayList r4 = r5.A14
            int r3 = r4.size()
            r2 = 0
        L_0x002f:
            if (r2 >= r3) goto L_0x001b
            java.lang.Object r1 = r4.get(r2)
            X.0le r1 = (X.C13210le) r1
            boolean r0 = r1.ASI(r7, r5)
            if (r0 != 0) goto L_0x0048
            int r2 = r2 + 1
            goto L_0x002f
        L_0x0040:
            r0.AYx(r7, r5)
            r0 = 3
            if (r2 == r0) goto L_0x0048
            if (r2 != r6) goto L_0x004a
        L_0x0048:
            r5.A0U = r1
        L_0x004a:
            r0 = 1
            goto L_0x001c
        L_0x004c:
            X.02W r0 = r5.A0S
            if (r0 == 0) goto L_0x02bc
            boolean r3 = r0.A13()
            boolean r13 = r0.A14()
            android.view.VelocityTracker r0 = r5.A0D
            if (r0 != 0) goto L_0x0062
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r5.A0D = r0
        L_0x0062:
            android.view.MotionEvent r1 = android.view.MotionEvent.obtain(r7)
            int r9 = r7.getActionMasked()
            int r4 = r7.getActionIndex()
            if (r9 != 0) goto L_0x0076
            int[] r0 = r5.A17
            r0[r6] = r14
            r0[r14] = r14
        L_0x0076:
            int[] r12 = r5.A17
            r0 = r12[r14]
            float r8 = (float) r0
            r0 = r12[r6]
            float r0 = (float) r0
            r1.offsetLocation(r8, r0)
            r8 = 1056964608(0x3f000000, float:0.5)
            if (r9 == 0) goto L_0x0295
            if (r9 == r6) goto L_0x019b
            r0 = 2
            if (r9 == r0) goto L_0x00c1
            r0 = 3
            if (r9 == r0) goto L_0x00ba
            r0 = 5
            if (r9 == r0) goto L_0x009f
            r0 = 6
            if (r9 != r0) goto L_0x0096
            r5.A0h(r7)
        L_0x0096:
            android.view.VelocityTracker r0 = r5.A0D
            r0.addMovement(r1)
        L_0x009b:
            r1.recycle()
            return r2
        L_0x009f:
            int r0 = r7.getPointerId(r4)
            r5.A0A = r0
            float r0 = r7.getX(r4)
            float r0 = r0 + r8
            int r0 = (int) r0
            r5.A07 = r0
            r5.A04 = r0
            float r0 = r7.getY(r4)
            float r0 = r0 + r8
            int r0 = (int) r0
            r5.A08 = r0
            r5.A05 = r0
            goto L_0x0096
        L_0x00ba:
            r5.A0W()
            r5.setScrollState(r14)
            goto L_0x0096
        L_0x00c1:
            int r0 = r5.A0A
            int r4 = r7.findPointerIndex(r0)
            if (r4 >= 0) goto L_0x00e4
            java.lang.String r0 = "Error processing scroll; pointer index for id "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            int r0 = r5.A0A
            r1.append(r0)
            java.lang.String r0 = " not found. Did any MotionEvents get skipped?"
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "RecyclerView"
            android.util.Log.e(r0, r1)
            return r14
        L_0x00e4:
            float r0 = r7.getX(r4)
            float r0 = r0 + r8
            int r10 = (int) r0
            float r0 = r7.getY(r4)
            float r0 = r0 + r8
            int r9 = (int) r0
            int r8 = r5.A07
            int r8 = r8 - r10
            int r7 = r5.A08
            int r7 = r7 - r9
            int[] r4 = r5.A18
            int[] r11 = r5.A19
            r20 = 0
            r15 = r5
            r16 = r4
            r17 = r11
            r18 = r8
            r19 = r7
            boolean r0 = r15.A0y(r16, r17, r18, r19, r20)
            if (r0 == 0) goto L_0x0128
            r0 = r4[r14]
            int r8 = r8 - r0
            r0 = r4[r6]
            int r7 = r7 - r0
            r0 = r11[r14]
            float r4 = (float) r0
            r0 = r11[r6]
            float r0 = (float) r0
            r1.offsetLocation(r4, r0)
            r4 = r12[r14]
            r0 = r11[r14]
            int r4 = r4 + r0
            r12[r14] = r4
            r4 = r12[r6]
            r0 = r11[r6]
            int r4 = r4 + r0
            r12[r6] = r4
        L_0x0128:
            int r0 = r5.A0B
            if (r0 == r6) goto L_0x014a
            if (r3 == 0) goto L_0x0199
            int r4 = java.lang.Math.abs(r8)
            int r0 = r5.A0C
            if (r4 <= r0) goto L_0x0199
            if (r8 <= 0) goto L_0x0197
            int r8 = r8 - r0
        L_0x0139:
            r12 = 1
        L_0x013a:
            if (r13 == 0) goto L_0x0194
            int r4 = java.lang.Math.abs(r7)
            int r0 = r5.A0C
            if (r4 <= r0) goto L_0x0194
            if (r7 <= 0) goto L_0x0192
            int r7 = r7 - r0
        L_0x0147:
            r5.setScrollState(r6)
        L_0x014a:
            int r0 = r5.A0B
            if (r0 != r6) goto L_0x0096
            r0 = r11[r14]
            int r10 = r10 - r0
            r5.A07 = r10
            r0 = r11[r6]
            int r9 = r9 - r0
            r5.A08 = r9
            r4 = 0
            if (r3 == 0) goto L_0x015c
            r4 = r8
        L_0x015c:
            r0 = 0
            if (r13 == 0) goto L_0x0160
            r0 = r7
        L_0x0160:
            boolean r0 = r5.A0w(r1, r4, r0)
            if (r0 == 0) goto L_0x016d
            android.view.ViewParent r0 = r5.getParent()
            r0.requestDisallowInterceptTouchEvent(r6)
        L_0x016d:
            X.0hQ r6 = r5.A0M
            if (r6 == 0) goto L_0x0096
            if (r8 != 0) goto L_0x0175
            if (r7 == 0) goto L_0x0096
        L_0x0175:
            boolean r0 = r5.A0j
            if (r0 == 0) goto L_0x018a
            long r3 = r6.A01
            r9 = 0
            int r0 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r0 != 0) goto L_0x018a
            long r3 = r5.getNanoTime()
            r6.A01 = r3
            r5.post(r6)
        L_0x018a:
            X.0cF r0 = r5.A0L
            r0.A01 = r8
            r0.A02 = r7
            goto L_0x0096
        L_0x0192:
            int r7 = r7 + r0
            goto L_0x0147
        L_0x0194:
            if (r12 == 0) goto L_0x014a
            goto L_0x0147
        L_0x0197:
            int r8 = r8 + r0
            goto L_0x0139
        L_0x0199:
            r12 = 0
            goto L_0x013a
        L_0x019b:
            android.view.VelocityTracker r0 = r5.A0D
            r0.addMovement(r1)
            android.view.VelocityTracker r7 = r5.A0D
            r4 = 1000(0x3e8, float:1.401E-42)
            int r10 = r5.A0q
            float r0 = (float) r10
            r7.computeCurrentVelocity(r4, r0)
            r7 = 0
            if (r3 == 0) goto L_0x0292
            android.view.VelocityTracker r3 = r5.A0D
            int r0 = r5.A0A
            float r0 = r3.getXVelocity(r0)
            float r4 = -r0
        L_0x01b6:
            if (r13 == 0) goto L_0x028f
            android.view.VelocityTracker r3 = r5.A0D
            int r0 = r5.A0A
            float r0 = r3.getYVelocity(r0)
            float r3 = -r0
        L_0x01c1:
            int r0 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x01c9
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 == 0) goto L_0x01d6
        L_0x01c9:
            int r11 = (int) r4
            int r9 = (int) r3
            X.02W r3 = r5.A0S
            if (r3 != 0) goto L_0x01de
            java.lang.String r3 = "RecyclerView"
            java.lang.String r0 = "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument."
            android.util.Log.e(r3, r0)
        L_0x01d6:
            r5.setScrollState(r14)
        L_0x01d9:
            r5.A0W()
            goto L_0x009b
        L_0x01de:
            boolean r0 = r5.A0m
            if (r0 != 0) goto L_0x01d6
            boolean r8 = r3.A13()
            boolean r13 = r3.A14()
            if (r8 == 0) goto L_0x01f4
            int r3 = java.lang.Math.abs(r11)
            int r0 = r5.A0r
            if (r3 >= r0) goto L_0x01f5
        L_0x01f4:
            r11 = 0
        L_0x01f5:
            if (r13 == 0) goto L_0x01ff
            int r3 = java.lang.Math.abs(r9)
            int r0 = r5.A0r
            if (r3 >= r0) goto L_0x0200
        L_0x01ff:
            r9 = 0
        L_0x0200:
            if (r11 != 0) goto L_0x0205
            if (r9 != 0) goto L_0x0205
            goto L_0x01d6
        L_0x0205:
            float r4 = (float) r11
            float r3 = (float) r9
            X.0XH r0 = r5.getScrollingChildHelper()
            boolean r0 = r0.A01(r4, r3)
            if (r0 != 0) goto L_0x01d6
            if (r8 != 0) goto L_0x0216
            if (r13 != 0) goto L_0x0216
            r6 = 0
        L_0x0216:
            r5.dispatchNestedFling(r4, r3, r6)
            X.0M3 r12 = r5.A0T
            if (r12 == 0) goto L_0x0250
            X.0Fl r12 = (X.C02840Fl) r12
            androidx.recyclerview.widget.RecyclerView r3 = r12.A01
            X.02W r7 = r3.getLayoutManager()
            if (r7 == 0) goto L_0x0250
            X.01X r0 = r3.A0N
            if (r0 == 0) goto L_0x0250
            int r3 = r3.A0r
            int r0 = java.lang.Math.abs(r9)
            if (r0 > r3) goto L_0x0239
            int r0 = java.lang.Math.abs(r11)
            if (r0 <= r3) goto L_0x0250
        L_0x0239:
            boolean r0 = r7 instanceof X.AnonymousClass02X
            if (r0 == 0) goto L_0x0250
            X.0Fo r4 = r12.A00(r7)
            if (r4 == 0) goto L_0x0250
            int r3 = r12.A03(r7, r11, r9)
            r0 = -1
            if (r3 == r0) goto L_0x0250
            r4.A00 = r3
            r7.A0Q(r4)
            goto L_0x01d9
        L_0x0250:
            if (r6 == 0) goto L_0x01d6
            if (r13 == 0) goto L_0x0256
            r8 = r8 | 2
        L_0x0256:
            X.0XH r0 = r5.getScrollingChildHelper()
            r0.A03(r8, r2)
            int r3 = -r10
            int r0 = java.lang.Math.min(r11, r10)
            int r16 = java.lang.Math.max(r3, r0)
            int r0 = java.lang.Math.min(r9, r10)
            int r17 = java.lang.Math.max(r3, r0)
            X.0hI r4 = r5.A0z
            androidx.recyclerview.widget.RecyclerView r3 = r4.A06
            r0 = 2
            r3.setScrollState(r0)
            r4.A01 = r14
            r4.A00 = r14
            android.widget.OverScroller r13 = r4.A03
            r18 = -2147483648(0xffffffff80000000, float:-0.0)
            r19 = 2147483647(0x7fffffff, float:NaN)
            r15 = 0
            r20 = -2147483648(0xffffffff80000000, float:-0.0)
            r21 = 2147483647(0x7fffffff, float:NaN)
            r13.fling(r14, r15, r16, r17, r18, r19, r20, r21)
            r4.A00()
            goto L_0x01d9
        L_0x028f:
            r3 = 0
            goto L_0x01c1
        L_0x0292:
            r4 = 0
            goto L_0x01b6
        L_0x0295:
            int r0 = r7.getPointerId(r14)
            r5.A0A = r0
            float r0 = r7.getX()
            float r0 = r0 + r8
            int r0 = (int) r0
            r5.A07 = r0
            r5.A04 = r0
            float r0 = r7.getY()
            float r0 = r0 + r8
            int r0 = (int) r0
            r5.A08 = r0
            r5.A05 = r0
            if (r13 == 0) goto L_0x02b3
            r3 = r3 | 2
        L_0x02b3:
            X.0XH r0 = r5.getScrollingChildHelper()
            r0.A03(r3, r14)
            goto L_0x0096
        L_0x02bc:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void removeDetachedView(View view, boolean z2) {
        C005602k A012 = A01(view);
        if (A012 != null) {
            int i2 = A012.A00;
            if ((i2 & 256) != 0) {
                A012.A00 = i2 & -257;
            } else if (!A012.A05()) {
                StringBuilder sb = new StringBuilder("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb.append(A012);
                sb.append(A0G());
                throw new IllegalArgumentException(sb.toString());
            }
        }
        view.clearAnimation();
        A0i(view);
        super.removeDetachedView(view, z2);
    }

    public void requestChildFocus(View view, View view2) {
        C05490Rq r0 = this.A0S.A06;
        if ((r0 == null || !r0.A05) && this.A09 <= 0 && view2 != null) {
            A0j(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        return this.A0S.A0T(rect, view, this, z2, false);
    }

    public void requestDisallowInterceptTouchEvent(boolean z2) {
        ArrayList arrayList = this.A14;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((C13210le) arrayList.get(i2)).AWB(z2);
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    public void requestLayout() {
        if (this.A06 != 0 || this.A0m) {
            this.A0n = true;
        } else {
            super.requestLayout();
        }
    }

    public void scrollBy(int i2, int i3) {
        AnonymousClass02W r2 = this.A0S;
        if (r2 == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.A0m) {
            boolean A132 = r2.A13();
            boolean A142 = r2.A14();
            if (!A132) {
                if (A142) {
                    i2 = 0;
                } else {
                    return;
                }
            } else if (!A142) {
                i3 = 0;
            }
            A0w((MotionEvent) null, i2, i3);
        }
    }

    public void scrollTo(int i2, int i3) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        int A002;
        if (this.A09 > 0) {
            int i2 = 0;
            if (!(accessibilityEvent == null || Build.VERSION.SDK_INT < 19 || (A002 = C05670Sm.A00(accessibilityEvent)) == 0)) {
                i2 = A002;
            }
            this.A03 |= i2;
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(AnonymousClass0EK r1) {
        this.A0Y = r1;
        C004601z.A0j(this, r1);
    }

    public void setAdapter(AnonymousClass01X r3) {
        setLayoutFrozen(false);
        A0k(r3, false, true);
        A0s(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(C11950jb r2) {
        if (r2 != this.A0O) {
            this.A0O = r2;
            boolean z2 = false;
            if (r2 != null) {
                z2 = true;
            }
            setChildrenDrawingOrderEnabled(z2);
        }
    }

    public void setClipToPadding(boolean z2) {
        if (z2 != this.A0d) {
            this.A0E = null;
            this.A0H = null;
            this.A0G = null;
            this.A0F = null;
        }
        this.A0d = z2;
        super.setClipToPadding(z2);
        if (this.A0g) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(AnonymousClass0M2 r2) {
        this.A0P = r2;
        this.A0E = null;
        this.A0H = null;
        this.A0G = null;
        this.A0F = null;
    }

    public void setHasFixedSize(boolean z2) {
        this.A0h = z2;
    }

    public void setItemAnimator(C005502j r3) {
        C005502j r0 = this.A0R;
        if (r0 != null) {
            r0.A08();
            this.A0R.A04 = null;
        }
        this.A0R = r3;
        if (r3 != null) {
            r3.A04 = this.A0Q;
        }
    }

    public void setItemViewCacheSize(int i2) {
        AnonymousClass0SJ r0 = this.A0w;
        r0.A00 = i2;
        r0.A03();
    }

    public void setLayoutFrozen(boolean z2) {
        if (z2 != this.A0m) {
            A0r("Do not setLayoutFrozen in layout or scroll");
            if (!z2) {
                this.A0m = false;
                if (!(!this.A0n || this.A0S == null || this.A0N == null)) {
                    requestLayout();
                }
                this.A0n = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.A0m = true;
            this.A0i = true;
            A0S();
        }
    }

    public void setLayoutManager(AnonymousClass02W r7) {
        AnonymousClass0SJ r4;
        if (r7 != this.A0S) {
            A0S();
            if (this.A0S != null) {
                C005502j r0 = this.A0R;
                if (r0 != null) {
                    r0.A08();
                }
                AnonymousClass02W r02 = this.A0S;
                r4 = this.A0w;
                r02.A0N(r4);
                this.A0S.A0O(r4);
                r4.A05.clear();
                r4.A02();
                if (this.A0j) {
                    AnonymousClass02W r1 = this.A0S;
                    r1.A0B = false;
                    r1.A0u(r4, this);
                }
                AnonymousClass02W r2 = this.A0S;
                r2.A07 = null;
                r2.A05 = null;
                r2.A03 = 0;
                r2.A00 = 0;
                r2.A04 = 1073741824;
                r2.A01 = 1073741824;
                this.A0S = null;
            } else {
                r4 = this.A0w;
                r4.A05.clear();
                r4.A02();
            }
            AnonymousClass0SK r5 = this.A0K;
            r5.A00.A01();
            List list = r5.A02;
            int size = list.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                r5.A01.ASb((View) list.get(size));
                list.remove(size);
            }
            RecyclerView recyclerView = ((C07570c7) r5.A01).A00;
            int childCount = recyclerView.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = recyclerView.getChildAt(i2);
                recyclerView.A0i(childAt);
                childAt.clearAnimation();
            }
            recyclerView.removeAllViews();
            this.A0S = r7;
            if (r7 != null) {
                if (r7.A07 == null) {
                    r7.A07 = this;
                    r7.A05 = r5;
                    r7.A03 = getWidth();
                    r7.A00 = getHeight();
                    r7.A04 = 1073741824;
                    r7.A01 = 1073741824;
                    if (this.A0j) {
                        this.A0S.A0B = true;
                    }
                } else {
                    StringBuilder sb = new StringBuilder("LayoutManager ");
                    sb.append(r7);
                    sb.append(" is already attached to a RecyclerView:");
                    sb.append(r7.A07.A0G());
                    throw new IllegalArgumentException(sb.toString());
                }
            }
            r4.A03();
            requestLayout();
        }
    }

    public void setNestedScrollingEnabled(boolean z2) {
        AnonymousClass0XH scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.A02) {
            C004601z.A0V(scrollingChildHelper.A04);
        }
        scrollingChildHelper.A02 = z2;
    }

    public void setOnFlingListener(AnonymousClass0M3 r1) {
        this.A0T = r1;
    }

    @Deprecated
    public void setOnScrollListener(AnonymousClass071 r1) {
        this.A0V = r1;
    }

    public void setPreserveFocusAfterLayout(boolean z2) {
        this.A0p = z2;
    }

    public void setRecycledViewPool(AnonymousClass0PR r4) {
        AnonymousClass0SJ r2 = this.A0w;
        AnonymousClass0PR r1 = r2.A02;
        if (r1 != null) {
            r1.A00--;
        }
        r2.A02 = r4;
        if (r4 != null && r2.A08.A0N != null) {
            r4.A00++;
        }
    }

    public void setRecyclerListener(C12500kV r1) {
        this.A0W = r1;
    }

    public void setScrollState(int i2) {
        C05490Rq r0;
        if (i2 != this.A0B) {
            this.A0B = i2;
            if (i2 != 2) {
                C10540hI r1 = this.A0z;
                r1.A06.removeCallbacks(r1);
                r1.A03.abortAnimation();
                AnonymousClass02W r02 = this.A0S;
                if (!(r02 == null || (r0 = r02.A06) == null)) {
                    r0.A01();
                }
            }
            AnonymousClass02W r03 = this.A0S;
            if (r03 != null) {
                r03.A0m(i2);
            }
            A0Y(i2);
            AnonymousClass071 r04 = this.A0V;
            if (r04 != null) {
                r04.A01(this, i2);
            }
            List list = this.A0b;
            if (list != null) {
                int size = list.size();
                while (true) {
                    size--;
                    if (size >= 0) {
                        ((AnonymousClass071) this.A0b.get(size)).A01(this, i2);
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public void setScrollingTouchSlop(int i2) {
        int i3;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i2 != 0) {
            if (i2 != 1) {
                StringBuilder sb = new StringBuilder("setScrollingTouchSlop(): bad argument constant ");
                sb.append(i2);
                sb.append("; using default value");
                Log.w("RecyclerView", sb.toString());
            } else {
                i3 = viewConfiguration.getScaledPagingTouchSlop();
                this.A0C = i3;
            }
        }
        i3 = viewConfiguration.getScaledTouchSlop();
        this.A0C = i3;
    }

    public void setViewCacheExtension(C03960Ko r2) {
        this.A0w.A03 = r2;
    }

    public boolean startNestedScroll(int i2) {
        return getScrollingChildHelper().A03(i2, 0);
    }

    public void stopNestedScroll() {
        getScrollingChildHelper().A00(0);
    }
}
