package androidx.coordinatorlayout.widget;

import X.AnonymousClass00O;
import X.AnonymousClass00T;
import X.AnonymousClass030;
import X.AnonymousClass06y;
import X.AnonymousClass0Bo;
import X.AnonymousClass0EH;
import X.AnonymousClass0NB;
import X.AnonymousClass0TT;
import X.C004601z;
import X.C016507v;
import X.C018208n;
import X.C018908v;
import X.C02670Ej;
import X.C04770Nw;
import X.C05110Pi;
import X.C05570Sc;
import X.C06980Yr;
import X.C07010Yu;
import X.C10690hX;
import X.C13010lK;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.v4.view.GravityCompat;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.redex.IDxIListenerShape216S0100000_I0;
import com.obwhatsapp.R;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CoordinatorLayout extends ViewGroup implements C018908v {
    public static final C13010lK A0I = new AnonymousClass0EH(12);
    public static final String A0J;
    public static final ThreadLocal A0K = new ThreadLocal();
    public static final Comparator A0L = new C10690hX();
    public static final Class[] A0M = {Context.class, AttributeSet.class};
    public Drawable A00;
    public View A01;
    public View A02;
    public ViewGroup.OnHierarchyChangeListener A03;
    public C07010Yu A04;
    public C016507v A05;
    public AnonymousClass030 A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public int[] A0B;
    public final C05110Pi A0C;
    public final C04770Nw A0D;
    public final List A0E;
    public final List A0F;
    public final List A0G;
    public final int[] A0H;

    @Deprecated
    public @interface DefaultBehavior {
        Class value();
    }

    static {
        Package packageR = CoordinatorLayout.class.getPackage();
        String str = null;
        if (packageR != null) {
            str = packageR.getName();
        }
        A0J = str;
        if (Build.VERSION.SDK_INT >= 21) {
        }
    }

    public CoordinatorLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.attr010d);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.A0E = new ArrayList();
        this.A0C = new C05110Pi();
        this.A0G = new ArrayList();
        this.A0F = new ArrayList();
        this.A0H = new int[2];
        this.A0D = new C04770Nw();
        TypedArray obtainStyledAttributes = i2 == 0 ? context.obtainStyledAttributes(attributeSet, AnonymousClass0NB.A00, 0, R.style.style0449) : context.obtainStyledAttributes(attributeSet, AnonymousClass0NB.A00, i2, 0);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.A0B = resources.getIntArray(resourceId);
            float f2 = resources.getDisplayMetrics().density;
            int[] iArr = this.A0B;
            int length = iArr.length;
            for (int i3 = 0; i3 < length; i3++) {
                iArr[i3] = (int) (((float) iArr[i3]) * f2);
            }
        }
        this.A00 = obtainStyledAttributes.getDrawable(1);
        obtainStyledAttributes.recycle();
        A09();
        super.setOnHierarchyChangeListener(new C06980Yr(this));
    }

    public static Rect A00() {
        Rect rect = (Rect) A0I.A4T();
        return rect == null ? new Rect() : rect;
    }

    public static AnonymousClass0Bo A01(View view) {
        AnonymousClass0Bo r5 = (AnonymousClass0Bo) view.getLayoutParams();
        if (!r5.A0B) {
            Class cls = view.getClass();
            while (true) {
                if (cls == null) {
                    break;
                }
                DefaultBehavior defaultBehavior = (DefaultBehavior) cls.getAnnotation(DefaultBehavior.class);
                if (defaultBehavior == null) {
                    cls = cls.getSuperclass();
                } else {
                    try {
                        r5.A01((AnonymousClass06y) defaultBehavior.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                        break;
                    } catch (Exception e2) {
                        StringBuilder sb = new StringBuilder("Default behavior class ");
                        sb.append(defaultBehavior.value().getName());
                        sb.append(" could not be instantiated. Did you forget");
                        sb.append(" a default constructor?");
                        Log.e("CoordinatorLayout", sb.toString(), e2);
                    }
                }
            }
            r5.A0B = true;
        }
        return r5;
    }

    public static void A02(Rect rect) {
        rect.setEmpty();
        A0I.Abi(rect);
    }

    public static final void A03(Rect rect, Rect rect2, AnonymousClass0Bo r11, int i2, int i3, int i4) {
        int i5 = r11.A02;
        if (i5 == 0) {
            i5 = 17;
        }
        int A002 = C05570Sc.A00(i5, i2);
        int i6 = r11.A00;
        if ((i6 & 7) == 0) {
            i6 |= GravityCompat.START;
        }
        if ((i6 & 112) == 0) {
            i6 |= 48;
        }
        int A003 = C05570Sc.A00(i6, i2);
        int i7 = A002 & 7;
        int i8 = A002 & 112;
        int i9 = A003 & 7;
        int i10 = A003 & 112;
        int width = i9 != 1 ? i9 != 5 ? rect.left : rect.right : rect.left + (rect.width() >> 1);
        int height = i10 != 16 ? i10 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() >> 1);
        if (i7 == 1) {
            width -= i3 >> 1;
        } else if (i7 != 5) {
            width -= i3;
        }
        if (i8 == 16) {
            height -= i4 >> 1;
        } else if (i8 != 80) {
            height -= i4;
        }
        rect2.set(width, height, i3 + width, i4 + height);
    }

    public static final void A04(View view, int i2) {
        AnonymousClass0Bo r1 = (AnonymousClass0Bo) view.getLayoutParams();
        int i3 = r1.A06;
        if (i3 != i2) {
            C004601z.A0a(view, i2 - i3);
            r1.A06 = i2;
        }
    }

    public static final void A05(View view, int i2) {
        AnonymousClass0Bo r1 = (AnonymousClass0Bo) view.getLayoutParams();
        int i3 = r1.A07;
        if (i3 != i2) {
            C004601z.A0b(view, i2 - i3);
            r1.A07 = i2;
        }
    }

    public final int A06(int i2) {
        StringBuilder sb;
        int[] iArr = this.A0B;
        if (iArr == null) {
            sb = new StringBuilder("No keylines defined for ");
            sb.append(this);
            sb.append(" - attempted index lookup ");
            sb.append(i2);
        } else if (i2 >= 0 && i2 < iArr.length) {
            return iArr[i2];
        } else {
            sb = new StringBuilder("Keyline index ");
            sb.append(i2);
            sb.append(" out of range for ");
            sb.append(this);
        }
        Log.e("CoordinatorLayout", sb.toString());
        return 0;
    }

    public List A07(View view) {
        AnonymousClass00O r5 = this.A0C.A00;
        int size = r5.size();
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < size; i2++) {
            AbstractCollection abstractCollection = (AbstractCollection) r5.A02[(i2 << 1) + 1];
            if (abstractCollection != null && abstractCollection.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(r5.A02[i2 << 1]);
            }
        }
        List list = this.A0F;
        list.clear();
        if (arrayList != null) {
            list.addAll(arrayList);
        }
        return list;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005a, code lost:
        r11 = X.C004601z.A06(r12);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A08() {
        /*
            r12 = this;
            java.util.List r8 = r12.A0E
            r8.clear()
            X.0Pi r7 = r12.A0C
            X.00O r6 = r7.A00
            int r3 = r6.size()
            r2 = 0
        L_0x000e:
            if (r2 >= r3) goto L_0x0027
            java.lang.Object[] r1 = r6.A02
            int r0 = r2 << 1
            int r0 = r0 + 1
            r1 = r1[r0]
            java.util.AbstractCollection r1 = (java.util.AbstractCollection) r1
            if (r1 == 0) goto L_0x0024
            r1.clear()
            X.0lK r0 = r7.A01
            r0.Abi(r1)
        L_0x0024:
            int r2 = r2 + 1
            goto L_0x000e
        L_0x0027:
            r6.clear()
            int r9 = r12.getChildCount()
            r5 = 0
        L_0x002f:
            if (r5 >= r9) goto L_0x0168
            android.view.View r3 = r12.getChildAt(r5)
            X.0Bo r4 = A01(r3)
            int r1 = r4.A05
            r0 = -1
            if (r1 != r0) goto L_0x00c0
            r0 = 0
            r4.A08 = r0
            r4.A09 = r0
        L_0x0043:
            boolean r0 = r6.containsKey(r3)
            if (r0 != 0) goto L_0x004d
            r0 = 0
            r6.put(r3, r0)
        L_0x004d:
            r2 = 0
        L_0x004e:
            if (r2 >= r9) goto L_0x00bc
            if (r2 == r5) goto L_0x00ae
            android.view.View r1 = r12.getChildAt(r2)
            android.view.View r0 = r4.A08
            if (r1 == r0) goto L_0x0075
            int r11 = X.C004601z.A06(r12)
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            X.0Bo r0 = (X.AnonymousClass0Bo) r0
            int r0 = r0.A03
            int r10 = X.C05570Sc.A00(r0, r11)
            if (r10 == 0) goto L_0x00b1
            int r0 = r4.A01
            int r0 = X.C05570Sc.A00(r0, r11)
            r0 = r0 & r10
            if (r0 != r10) goto L_0x00b1
        L_0x0075:
            boolean r0 = r6.containsKey(r1)
            if (r0 != 0) goto L_0x0085
            boolean r0 = r6.containsKey(r1)
            if (r0 != 0) goto L_0x0085
            r0 = 0
            r6.put(r1, r0)
        L_0x0085:
            boolean r0 = r6.containsKey(r1)
            if (r0 == 0) goto L_0x0160
            boolean r0 = r6.containsKey(r3)
            if (r0 == 0) goto L_0x0160
            java.lang.Object r0 = r6.get(r1)
            java.util.AbstractCollection r0 = (java.util.AbstractCollection) r0
            if (r0 != 0) goto L_0x00ab
            X.0lK r0 = r7.A01
            java.lang.Object r0 = r0.A4T()
            java.util.AbstractCollection r0 = (java.util.AbstractCollection) r0
            if (r0 != 0) goto L_0x00a8
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L_0x00a8:
            r6.put(r1, r0)
        L_0x00ab:
            r0.add(r3)
        L_0x00ae:
            int r2 = r2 + 1
            goto L_0x004e
        L_0x00b1:
            X.06y r0 = r4.A0A
            if (r0 == 0) goto L_0x00ae
            boolean r0 = r0.A0H(r3, r1, r12)
            if (r0 == 0) goto L_0x00ae
            goto L_0x0075
        L_0x00bc:
            int r5 = r5 + 1
            goto L_0x002f
        L_0x00c0:
            android.view.View r0 = r4.A09
            if (r0 == 0) goto L_0x00ed
            int r1 = r0.getId()
            int r0 = r4.A05
            if (r1 != r0) goto L_0x00ed
            android.view.View r2 = r4.A09
            android.view.ViewParent r1 = r2.getParent()
        L_0x00d2:
            if (r1 == r12) goto L_0x00e4
            if (r1 == 0) goto L_0x00e8
            if (r1 == r3) goto L_0x00e8
            boolean r0 = r1 instanceof android.view.View
            if (r0 == 0) goto L_0x00df
            r2 = r1
            android.view.View r2 = (android.view.View) r2
        L_0x00df:
            android.view.ViewParent r1 = r1.getParent()
            goto L_0x00d2
        L_0x00e4:
            r4.A08 = r2
            goto L_0x0043
        L_0x00e8:
            r0 = 0
            r4.A08 = r0
            r4.A09 = r0
        L_0x00ed:
            int r11 = r4.A05
            android.view.View r10 = r12.findViewById(r11)
            r4.A09 = r10
            r2 = 0
            if (r10 == 0) goto L_0x0130
            if (r10 != r12) goto L_0x0108
            boolean r0 = r12.isInEditMode()
            if (r0 != 0) goto L_0x015a
            java.lang.String r1 = "View can not be anchored to the the parent CoordinatorLayout"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0108:
            android.view.ViewParent r1 = r10.getParent()
        L_0x010c:
            if (r1 == r12) goto L_0x012c
            if (r1 == 0) goto L_0x012c
            if (r1 != r3) goto L_0x0120
            boolean r0 = r12.isInEditMode()
            if (r0 != 0) goto L_0x015a
            java.lang.String r1 = "Anchor must not be a descendant of the anchored view"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0120:
            boolean r0 = r1 instanceof android.view.View
            if (r0 == 0) goto L_0x0127
            r10 = r1
            android.view.View r10 = (android.view.View) r10
        L_0x0127:
            android.view.ViewParent r1 = r1.getParent()
            goto L_0x010c
        L_0x012c:
            r4.A08 = r10
            goto L_0x0043
        L_0x0130:
            boolean r0 = r12.isInEditMode()
            if (r0 != 0) goto L_0x015a
            java.lang.String r0 = "Could not find CoordinatorLayout descendant view with id "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            android.content.res.Resources r0 = r12.getResources()
            java.lang.String r0 = r0.getResourceName(r11)
            r1.append(r0)
            java.lang.String r0 = " to anchor view "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x015a:
            r4.A08 = r2
            r4.A09 = r2
            goto L_0x0043
        L_0x0160:
            java.lang.String r1 = "All nodes must be present in the graph before being added as an edge"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0168:
            java.util.ArrayList r5 = r7.A02
            r5.clear()
            java.util.HashSet r4 = r7.A03
            r4.clear()
            int r3 = r6.size()
            r2 = 0
        L_0x0177:
            if (r2 >= r3) goto L_0x0185
            java.lang.Object[] r1 = r6.A02
            int r0 = r2 << 1
            r0 = r1[r0]
            r7.A00(r0, r5, r4)
            int r2 = r2 + 1
            goto L_0x0177
        L_0x0185:
            r8.addAll(r5)
            java.util.Collections.reverse(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.A08():void");
    }

    public final void A09() {
        if (Build.VERSION.SDK_INT < 21) {
            return;
        }
        if (getFitsSystemWindows()) {
            C016507v r1 = this.A05;
            if (r1 == null) {
                r1 = new IDxIListenerShape216S0100000_I0(this, 1);
                this.A05 = r1;
            }
            C004601z.A0k(this, r1);
            setSystemUiVisibility(1280);
            return;
        }
        C004601z.A0k(this, (C016507v) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:142:0x027c A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0A(int r28) {
        /*
            r27 = this;
            r6 = r27
            int r20 = X.C004601z.A06(r6)
            java.util.List r5 = r6.A0E
            int r19 = r5.size()
            android.graphics.Rect r4 = A00()
            android.graphics.Rect r3 = A00()
            android.graphics.Rect r18 = A00()
            r2 = 0
        L_0x0019:
            r0 = r19
            if (r2 >= r0) goto L_0x029a
            java.lang.Object r1 = r5.get(r2)
            android.view.View r1 = (android.view.View) r1
            android.view.ViewGroup$LayoutParams r10 = r1.getLayoutParams()
            X.0Bo r10 = (X.AnonymousClass0Bo) r10
            r7 = r28
            if (r28 != 0) goto L_0x0038
            int r8 = r1.getVisibility()
            r0 = 8
            if (r8 != r0) goto L_0x0038
        L_0x0035:
            int r2 = r2 + 1
            goto L_0x0019
        L_0x0038:
            r14 = 0
        L_0x0039:
            if (r14 >= r2) goto L_0x00db
            java.lang.Object r8 = r5.get(r14)
            android.view.View r0 = r10.A08
            if (r0 != r8) goto L_0x00d3
            android.view.ViewGroup$LayoutParams r13 = r1.getLayoutParams()
            X.0Bo r13 = (X.AnonymousClass0Bo) r13
            android.view.View r0 = r13.A09
            if (r0 == 0) goto L_0x00d3
            android.graphics.Rect r17 = A00()
            android.graphics.Rect r12 = A00()
            android.graphics.Rect r11 = A00()
            android.view.View r8 = r13.A09
            r0 = r17
            r6.A0F(r8, r0)
            r16 = 0
            boolean r0 = r1.isLayoutRequested()
            if (r0 != 0) goto L_0x00d7
            int r8 = r1.getVisibility()
            r0 = 8
            if (r8 == r0) goto L_0x00d7
            int r15 = r1.getLeft()
            int r9 = r1.getTop()
            int r8 = r1.getRight()
            int r0 = r1.getBottom()
            r12.set(r15, r9, r8, r0)
        L_0x0083:
            int r15 = r1.getMeasuredWidth()
            int r9 = r1.getMeasuredHeight()
            r21 = r17
            r22 = r11
            r23 = r13
            r24 = r20
            r25 = r15
            r26 = r9
            A03(r21, r22, r23, r24, r25, r26)
            int r8 = r11.left
            int r0 = r12.left
            if (r8 != r0) goto L_0x00a6
            int r8 = r11.top
            int r0 = r12.top
            if (r8 == r0) goto L_0x00a8
        L_0x00a6:
            r16 = 1
        L_0x00a8:
            r6.A0B(r11, r13, r15, r9)
            int r9 = r11.left
            int r0 = r12.left
            int r9 = r9 - r0
            int r8 = r11.top
            int r0 = r12.top
            int r8 = r8 - r0
            if (r9 == 0) goto L_0x00ba
            X.C004601z.A0a(r1, r9)
        L_0x00ba:
            if (r8 == 0) goto L_0x00bf
            X.C004601z.A0b(r1, r8)
        L_0x00bf:
            if (r16 == 0) goto L_0x00ca
            X.06y r8 = r13.A0A
            if (r8 == 0) goto L_0x00ca
            android.view.View r0 = r13.A09
            r8.A05(r1, r0, r6)
        L_0x00ca:
            A02(r17)
            A02(r12)
            A02(r11)
        L_0x00d3:
            int r14 = r14 + 1
            goto L_0x0039
        L_0x00d7:
            r12.setEmpty()
            goto L_0x0083
        L_0x00db:
            r8 = 1
            boolean r0 = r1.isLayoutRequested()
            if (r0 != 0) goto L_0x01b7
            int r9 = r1.getVisibility()
            r0 = 8
            if (r9 == r0) goto L_0x01b7
            r6.A0F(r1, r3)
        L_0x00ed:
            int r0 = r10.A03
            if (r0 == 0) goto L_0x012f
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x012f
            int r9 = r10.A03
            r0 = r20
            int r12 = X.C05570Sc.A00(r9, r0)
            r9 = r12 & 112(0x70, float:1.57E-43)
            r0 = 48
            if (r9 == r0) goto L_0x01ab
            r0 = 80
            if (r9 != r0) goto L_0x0118
            int r11 = r4.bottom
            int r9 = r6.getHeight()
            int r0 = r3.top
            int r9 = r9 - r0
            int r0 = java.lang.Math.max(r11, r9)
            r4.bottom = r0
        L_0x0118:
            r9 = r12 & 7
            r0 = 3
            if (r9 == r0) goto L_0x01a0
            r0 = 5
            if (r9 != r0) goto L_0x012f
            int r11 = r4.right
            int r9 = r6.getWidth()
            int r0 = r3.left
            int r9 = r9 - r0
            int r0 = java.lang.Math.max(r11, r9)
            r4.right = r0
        L_0x012f:
            int r0 = r10.A01
            if (r0 == 0) goto L_0x0236
            int r0 = r1.getVisibility()
            if (r0 != 0) goto L_0x0236
            boolean r0 = X.C004601z.A0u(r1)
            if (r0 == 0) goto L_0x0236
            int r0 = r1.getWidth()
            if (r0 <= 0) goto L_0x0236
            int r0 = r1.getHeight()
            if (r0 <= 0) goto L_0x0236
            android.view.ViewGroup$LayoutParams r12 = r1.getLayoutParams()
            X.0Bo r12 = (X.AnonymousClass0Bo) r12
            X.06y r15 = r12.A0A
            android.graphics.Rect r9 = A00()
            android.graphics.Rect r10 = A00()
            int r14 = r1.getLeft()
            int r13 = r1.getTop()
            int r11 = r1.getRight()
            int r0 = r1.getBottom()
            r10.set(r14, r13, r11, r0)
            if (r15 == 0) goto L_0x01bc
            boolean r0 = r15.A02(r9, r1, r6)
            if (r0 == 0) goto L_0x01bc
            boolean r0 = r10.contains(r9)
            if (r0 != 0) goto L_0x01bf
            java.lang.String r0 = "Rect should be within the child's bounds. Rect:"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = r9.toShortString()
            r1.append(r0)
            java.lang.String r0 = " | Bounds:"
            r1.append(r0)
            java.lang.String r0 = r10.toShortString()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x01a0:
            int r9 = r4.left
            int r0 = r3.right
            int r0 = java.lang.Math.max(r9, r0)
            r4.left = r0
            goto L_0x012f
        L_0x01ab:
            int r9 = r4.top
            int r0 = r3.bottom
            int r0 = java.lang.Math.max(r9, r0)
            r4.top = r0
            goto L_0x0118
        L_0x01b7:
            r3.setEmpty()
            goto L_0x00ed
        L_0x01bc:
            r9.set(r10)
        L_0x01bf:
            A02(r10)
            boolean r0 = r9.isEmpty()
            if (r0 != 0) goto L_0x0233
            int r10 = r12.A01
            r0 = r20
            int r14 = X.C05570Sc.A00(r10, r0)
            r10 = r14 & 48
            r0 = 48
            r11 = 0
            if (r10 != r0) goto L_0x0297
            int r10 = r9.top
            int r0 = r12.topMargin
            int r10 = r10 - r0
            int r0 = r12.A07
            int r10 = r10 - r0
            int r0 = r4.top
            if (r10 >= r0) goto L_0x0297
            int r0 = r0 - r10
            A05(r1, r0)
            r13 = 1
        L_0x01e8:
            r10 = r14 & 80
            r0 = 80
            if (r10 != r0) goto L_0x0290
            int r10 = r6.getHeight()
            int r0 = r9.bottom
            int r10 = r10 - r0
            int r0 = r12.bottomMargin
            int r10 = r10 - r0
            int r0 = r12.A07
            int r10 = r10 + r0
            int r0 = r4.bottom
            if (r10 >= r0) goto L_0x0290
            int r10 = r10 - r0
            A05(r1, r10)
        L_0x0203:
            r10 = r14 & 3
            r0 = 3
            if (r10 != r0) goto L_0x028e
            int r10 = r9.left
            int r0 = r12.leftMargin
            int r10 = r10 - r0
            int r0 = r12.A06
            int r10 = r10 - r0
            int r0 = r4.left
            if (r10 >= r0) goto L_0x028e
            int r0 = r0 - r10
            A04(r1, r0)
            r13 = 1
        L_0x0219:
            r10 = 5
            r0 = r14 & 5
            if (r0 != r10) goto L_0x0288
            int r10 = r6.getWidth()
            int r0 = r9.right
            int r10 = r10 - r0
            int r0 = r12.rightMargin
            int r10 = r10 - r0
            int r0 = r12.A06
            int r10 = r10 + r0
            int r0 = r4.right
            if (r10 >= r0) goto L_0x0288
            int r10 = r10 - r0
            A04(r1, r10)
        L_0x0233:
            A02(r9)
        L_0x0236:
            r10 = 2
            if (r7 == r10) goto L_0x0257
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            X.0Bo r0 = (X.AnonymousClass0Bo) r0
            android.graphics.Rect r9 = r0.A0F
            r0 = r18
            r0.set(r9)
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x0035
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            X.0Bo r0 = (X.AnonymousClass0Bo) r0
            android.graphics.Rect r0 = r0.A0F
            r0.set(r3)
        L_0x0257:
            int r12 = r2 + 1
        L_0x0259:
            r0 = r19
            if (r12 >= r0) goto L_0x0035
            java.lang.Object r13 = r5.get(r12)
            android.view.View r13 = (android.view.View) r13
            android.view.ViewGroup$LayoutParams r11 = r13.getLayoutParams()
            X.0Bo r11 = (X.AnonymousClass0Bo) r11
            X.06y r9 = r11.A0A
            if (r9 == 0) goto L_0x027c
            boolean r0 = r9.A0H(r13, r1, r6)
            if (r0 == 0) goto L_0x027c
            if (r28 != 0) goto L_0x027f
            boolean r0 = r11.A0E
            if (r0 == 0) goto L_0x0281
            r0 = 0
        L_0x027a:
            r11.A0E = r0
        L_0x027c:
            int r12 = r12 + 1
            goto L_0x0259
        L_0x027f:
            if (r7 == r10) goto L_0x027c
        L_0x0281:
            boolean r0 = r9.A05(r13, r1, r6)
            if (r7 != r8) goto L_0x027c
            goto L_0x027a
        L_0x0288:
            if (r13 != 0) goto L_0x0233
            A04(r1, r11)
            goto L_0x0233
        L_0x028e:
            r13 = 0
            goto L_0x0219
        L_0x0290:
            if (r13 != 0) goto L_0x0203
            A05(r1, r11)
            goto L_0x0203
        L_0x0297:
            r13 = 0
            goto L_0x01e8
        L_0x029a:
            A02(r4)
            A02(r3)
            A02(r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.A0A(int):void");
    }

    public final void A0B(Rect rect, AnonymousClass0Bo r7, int i2, int i3) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + r7.leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i2) - r7.rightMargin));
        int max2 = Math.max(getPaddingTop() + r7.topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i3) - r7.bottomMargin));
        rect.set(max, max2, i2 + max, i3 + max2);
    }

    public void A0C(View view) {
        List list = (List) this.A0C.A00.get(view);
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                View view2 = (View) list.get(i2);
                AnonymousClass06y r0 = ((AnonymousClass0Bo) view2.getLayoutParams()).A0A;
                if (r0 != null) {
                    r0.A05(view2, view, this);
                }
            }
        }
    }

    public void A0D(View view, int i2) {
        AnonymousClass0Bo r2 = (AnonymousClass0Bo) view.getLayoutParams();
        View view2 = r2.A09;
        int i3 = i2;
        if (view2 != null) {
            Rect A002 = A00();
            Rect A003 = A00();
            try {
                A0F(view2, A002);
                AnonymousClass0Bo r7 = (AnonymousClass0Bo) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                A03(A002, A003, r7, i3, measuredWidth, measuredHeight);
                A0B(A003, r7, measuredWidth, measuredHeight);
                view.layout(A003.left, A003.top, A003.right, A003.bottom);
            } finally {
                A02(A002);
                A02(A003);
            }
        } else if (r2.A05 != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        } else {
            int i4 = r2.A04;
            if (i4 >= 0) {
                AnonymousClass0Bo r72 = (AnonymousClass0Bo) view.getLayoutParams();
                int i5 = r72.A02;
                if (i5 == 0) {
                    i5 = 8388661;
                }
                int A004 = C05570Sc.A00(i5, i2);
                int i6 = A004 & 7;
                int i7 = A004 & 112;
                int width = getWidth();
                int height = getHeight();
                int measuredWidth2 = view.getMeasuredWidth();
                int measuredHeight2 = view.getMeasuredHeight();
                if (i2 == 1) {
                    i4 = width - i4;
                }
                int A062 = A06(i4) - measuredWidth2;
                int i8 = 0;
                if (i6 == 1) {
                    A062 += measuredWidth2 >> 1;
                } else if (i6 == 5) {
                    A062 += measuredWidth2;
                }
                if (i7 == 16) {
                    i8 = 0 + (measuredHeight2 >> 1);
                } else if (i7 == 80) {
                    i8 = measuredHeight2;
                }
                int max = Math.max(getPaddingLeft() + r72.leftMargin, Math.min(A062, ((width - getPaddingRight()) - measuredWidth2) - r72.rightMargin));
                int max2 = Math.max(getPaddingTop() + r72.topMargin, Math.min(i8, ((height - getPaddingBottom()) - measuredHeight2) - r72.bottomMargin));
                view.layout(max, max2, measuredWidth2 + max, measuredHeight2 + max2);
                return;
            }
            AnonymousClass0Bo r22 = (AnonymousClass0Bo) view.getLayoutParams();
            Rect A005 = A00();
            A005.set(getPaddingLeft() + r22.leftMargin, getPaddingTop() + r22.topMargin, (getWidth() - getPaddingRight()) - r22.rightMargin, (getHeight() - getPaddingBottom()) - r22.bottomMargin);
            if (this.A06 != null && getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                A005.left += this.A06.A04();
                A005.top += this.A06.A06();
                A005.right -= this.A06.A05();
                A005.bottom -= this.A06.A03();
            }
            Rect A006 = A00();
            int i9 = r22.A02;
            if ((i9 & 7) == 0) {
                i9 |= GravityCompat.START;
            }
            if ((i9 & 112) == 0) {
                i9 |= 48;
            }
            C05570Sc.A01(i9, view.getMeasuredWidth(), view.getMeasuredHeight(), A005, A006, i3);
            view.layout(A006.left, A006.top, A006.right, A006.bottom);
            A02(A005);
            A02(A006);
        }
    }

    public void A0E(View view, int i2, int i3, int i4) {
        measureChildWithMargins(view, i2, i3, i4, 0);
    }

    public void A0F(View view, Rect rect) {
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal threadLocal = AnonymousClass0TT.A00;
        Matrix matrix = (Matrix) threadLocal.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal.set(matrix);
        } else {
            matrix.reset();
        }
        AnonymousClass0TT.A00(matrix, view, this);
        ThreadLocal threadLocal2 = AnonymousClass0TT.A01;
        RectF rectF = (RectF) threadLocal2.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal2.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    public final void A0G(boolean z2) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            AnonymousClass06y r1 = ((AnonymousClass0Bo) childAt.getLayoutParams()).A0A;
            if (r1 != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z2) {
                    r1.A0B(obtain, childAt, this);
                } else {
                    r1.A0C(obtain, childAt, this);
                }
                obtain.recycle();
            }
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            getChildAt(i3).getLayoutParams();
        }
        this.A01 = null;
        this.A07 = false;
    }

    public final boolean A0H(MotionEvent motionEvent, int i2) {
        MotionEvent motionEvent2 = motionEvent;
        int actionMasked = motionEvent2.getActionMasked();
        List list = this.A0G;
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i3 = childCount - 1; i3 >= 0; i3--) {
            list.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i3) : i3));
        }
        Comparator comparator = A0L;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
        int size = list.size();
        MotionEvent motionEvent3 = null;
        boolean z2 = false;
        for (int i4 = 0; i4 < size; i4++) {
            View view = (View) list.get(i4);
            AnonymousClass06y r0 = ((AnonymousClass0Bo) view.getLayoutParams()).A0A;
            if (!z2) {
                if (r0 != null) {
                    z2 = i2 != 0 ? r0.A0C(motionEvent2, view, this) : r0.A0B(motionEvent2, view, this);
                    if (z2) {
                        this.A01 = view;
                    }
                }
            } else if (!(actionMasked == 0 || r0 == null)) {
                if (motionEvent3 == null) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    motionEvent3 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i2 != 0) {
                    r0.A0C(motionEvent3, view, this);
                } else {
                    r0.A0B(motionEvent3, view, this);
                }
            }
        }
        list.clear();
        return z2;
    }

    public boolean A0I(View view, int i2, int i3) {
        Rect A002 = A00();
        A0F(view, A002);
        try {
            return A002.contains(i2, i3);
        } finally {
            A02(A002);
        }
    }

    public void ATu(View view, int[] iArr, int i2, int i3, int i4) {
        AnonymousClass06y r9;
        int childCount = getChildCount();
        boolean z2 = false;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                AnonymousClass0Bo r1 = (AnonymousClass0Bo) childAt.getLayoutParams();
                int i8 = i4;
                if ((i4 != 0 ? r1.A0C : r1.A0D) && (r9 = r1.A0A) != null) {
                    int[] iArr2 = this.A0H;
                    iArr2[1] = 0;
                    iArr2[0] = 0;
                    r9.A0A(childAt, view, this, iArr2, i2, i3, i8);
                    int i9 = iArr2[0];
                    i5 = i2 > 0 ? Math.max(i5, i9) : Math.min(i5, i9);
                    int i10 = iArr2[1];
                    i6 = i3 > 0 ? Math.max(i6, i10) : Math.min(i6, i10);
                    z2 = true;
                }
            }
        }
        iArr[0] = i5;
        iArr[1] = i6;
        if (z2) {
            A0A(1);
        }
    }

    public void ATv(View view, int i2, int i3, int i4, int i5, int i6) {
        AnonymousClass06y r5;
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                AnonymousClass0Bo r1 = (AnonymousClass0Bo) childAt.getLayoutParams();
                int i8 = i6;
                if ((i6 != 0 ? r1.A0C : r1.A0D) && (r5 = r1.A0A) != null) {
                    r5.A01(childAt, view, this, i2, i3, i4, i5, i8);
                    z2 = true;
                }
            }
        }
        if (z2) {
            A0A(1);
        }
    }

    public void ATx(View view, View view2, int i2, int i3) {
        C04770Nw r1 = this.A0D;
        if (i3 == 1) {
            r1.A00 = i2;
        } else {
            r1.A01 = i2;
        }
        this.A02 = view2;
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            getChildAt(i4).getLayoutParams();
        }
    }

    public boolean AXV(View view, View view2, int i2, int i3) {
        boolean z2;
        int childCount = getChildCount();
        boolean z3 = false;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                AnonymousClass0Bo r1 = (AnonymousClass0Bo) childAt.getLayoutParams();
                AnonymousClass06y r5 = r1.A0A;
                int i5 = i3;
                if (r5 != null) {
                    z2 = r5.A0D(childAt, view, view2, this, i2, i5);
                    z3 |= z2;
                } else {
                    z2 = false;
                }
                if (i3 != 0) {
                    r1.A0C = z2;
                } else {
                    r1.A0D = z2;
                }
            }
        }
        return z3;
    }

    public void AXx(View view, int i2) {
        C04770Nw r2 = this.A0D;
        if (i2 == 1) {
            r2.A00 = 0;
        } else {
            r2.A01 = 0;
        }
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            AnonymousClass0Bo r1 = (AnonymousClass0Bo) childAt.getLayoutParams();
            if (i2 != 0 ? r1.A0C : r1.A0D) {
                AnonymousClass06y r0 = r1.A0A;
                if (r0 != null) {
                    r0.A09(childAt, view, this, i2);
                }
                if (i2 != 0) {
                    r1.A0C = false;
                } else {
                    r1.A0D = false;
                }
                r1.A0E = false;
            }
        }
        this.A02 = null;
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof AnonymousClass0Bo) && super.checkLayoutParams(layoutParams);
    }

    public boolean drawChild(Canvas canvas, View view, long j2) {
        view.getLayoutParams();
        return super.drawChild(canvas, view, j2);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.A00;
        if (drawable != null && drawable.isStateful() && (false || drawable.setState(drawableState))) {
            invalidate();
        }
    }

    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new AnonymousClass0Bo();
    }

    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new AnonymousClass0Bo(getContext(), attributeSet);
    }

    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof AnonymousClass0Bo ? new AnonymousClass0Bo((AnonymousClass0Bo) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new AnonymousClass0Bo((ViewGroup.MarginLayoutParams) layoutParams) : new AnonymousClass0Bo(layoutParams);
    }

    public final List getDependencySortedChildren() {
        A08();
        return Collections.unmodifiableList(this.A0E);
    }

    public final AnonymousClass030 getLastWindowInsets() {
        return this.A06;
    }

    public int getNestedScrollAxes() {
        C04770Nw r0 = this.A0D;
        return r0.A01 | r0.A00;
    }

    public Drawable getStatusBarBackground() {
        return this.A00;
    }

    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        A0G(false);
        if (this.A0A) {
            if (this.A04 == null) {
                this.A04 = new C07010Yu(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.A04);
        }
        if (this.A06 == null && getFitsSystemWindows()) {
            C004601z.A0T(this);
        }
        this.A09 = true;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        A0G(false);
        if (this.A0A && this.A04 != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.A04);
        }
        View view = this.A02;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.A09 = false;
    }

    public void onDraw(Canvas canvas) {
        AnonymousClass030 r0;
        int A062;
        super.onDraw(canvas);
        if (this.A08 && this.A00 != null && (r0 = this.A06) != null && (A062 = r0.A06()) > 0) {
            this.A00.setBounds(0, 0, getWidth(), A062);
            this.A00.draw(canvas);
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            A0G(true);
        }
        boolean A0H2 = A0H(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            A0G(true);
        }
        return A0H2;
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        AnonymousClass06y r0;
        int A062 = C004601z.A06(this);
        List list = this.A0E;
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            View view = (View) list.get(i6);
            if (view.getVisibility() != 8 && ((r0 = ((AnonymousClass0Bo) view.getLayoutParams()).A0A) == null || !r0.A0F(view, this, A062))) {
                A0D(view, A062);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0095, code lost:
        if (getFitsSystemWindows() == false) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00d1, code lost:
        if (r20 != false) goto L_0x00d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0157, code lost:
        if (r20 != false) goto L_0x0159;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0159, code lost:
        r3 = java.lang.Math.max(0, (r19 - r21) - r2);
     */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x014f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r34, int r35) {
        /*
            r33 = this;
            r14 = r33
            r14.A08()
            int r8 = r14.getChildCount()
            r7 = 0
            r6 = 0
        L_0x000b:
            if (r6 >= r8) goto L_0x002f
            android.view.View r5 = r14.getChildAt(r6)
            X.0Pi r0 = r14.A0C
            X.00O r4 = r0.A00
            int r3 = r4.size()
            r2 = 0
        L_0x001a:
            if (r2 >= r3) goto L_0x0187
            java.lang.Object[] r1 = r4.A02
            int r0 = r2 << 1
            int r0 = r0 + 1
            r0 = r1[r0]
            java.util.AbstractCollection r0 = (java.util.AbstractCollection) r0
            if (r0 == 0) goto L_0x0183
            boolean r0 = r0.contains(r5)
            if (r0 == 0) goto L_0x0183
            r7 = 1
        L_0x002f:
            boolean r0 = r14.A0A
            if (r7 == r0) goto L_0x0050
            boolean r0 = r14.A09
            if (r7 == 0) goto L_0x0171
            if (r0 == 0) goto L_0x004d
            X.0Yu r0 = r14.A04
            if (r0 != 0) goto L_0x0044
            X.0Yu r0 = new X.0Yu
            r0.<init>(r14)
            r14.A04 = r0
        L_0x0044:
            android.view.ViewTreeObserver r1 = r14.getViewTreeObserver()
            X.0Yu r0 = r14.A04
            r1.addOnPreDrawListener(r0)
        L_0x004d:
            r0 = 1
        L_0x004e:
            r14.A0A = r0
        L_0x0050:
            int r23 = r14.getPaddingLeft()
            int r22 = r14.getPaddingTop()
            int r21 = r14.getPaddingRight()
            int r1 = r14.getPaddingBottom()
            int r13 = X.C004601z.A06(r14)
            r0 = 1
            r20 = 0
            if (r13 != r0) goto L_0x006b
            r20 = 1
        L_0x006b:
            r32 = r34
            int r12 = android.view.View.MeasureSpec.getMode(r32)
            int r19 = android.view.View.MeasureSpec.getSize(r32)
            r31 = r35
            int r15 = android.view.View.MeasureSpec.getMode(r31)
            int r18 = android.view.View.MeasureSpec.getSize(r31)
            int r17 = r23 + r21
            int r22 = r22 + r1
            int r11 = r14.getSuggestedMinimumWidth()
            int r10 = r14.getSuggestedMinimumHeight()
            X.030 r0 = r14.A06
            if (r0 == 0) goto L_0x0097
            boolean r0 = r14.getFitsSystemWindows()
            r16 = 1
            if (r0 != 0) goto L_0x0099
        L_0x0097:
            r16 = 0
        L_0x0099:
            java.util.List r9 = r14.A0E
            int r8 = r9.size()
            r7 = 0
            r6 = 0
        L_0x00a1:
            if (r6 >= r8) goto L_0x018b
            java.lang.Object r5 = r9.get(r6)
            android.view.View r5 = (android.view.View) r5
            int r1 = r5.getVisibility()
            r0 = 8
            if (r1 == r0) goto L_0x014b
            android.view.ViewGroup$LayoutParams r4 = r5.getLayoutParams()
            X.0Bo r4 = (X.AnonymousClass0Bo) r4
            int r0 = r4.A04
            if (r0 < 0) goto L_0x0167
            if (r12 == 0) goto L_0x0167
            int r2 = r14.A06(r0)
            int r0 = r4.A02
            if (r0 != 0) goto L_0x00c8
            r0 = 8388661(0x800035, float:1.1755018E-38)
        L_0x00c8:
            int r0 = X.C05570Sc.A00(r0, r13)
            r1 = r0 & 7
            r0 = 3
            if (r1 != r0) goto L_0x0154
            if (r20 == 0) goto L_0x0159
        L_0x00d3:
            int r2 = r2 - r23
            r0 = 0
            int r3 = java.lang.Math.max(r0, r2)
        L_0x00da:
            if (r16 == 0) goto L_0x014f
            boolean r0 = r5.getFitsSystemWindows()
            if (r0 != 0) goto L_0x014f
            X.030 r0 = r14.A06
            int r2 = r0.A04()
            X.030 r0 = r14.A06
            int r0 = r0.A05()
            int r2 = r2 + r0
            X.030 r0 = r14.A06
            int r1 = r0.A06()
            X.030 r0 = r14.A06
            int r0 = r0.A03()
            int r1 = r1 + r0
            int r0 = r19 - r2
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r12)
            int r0 = r18 - r1
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r15)
        L_0x0108:
            X.06y r0 = r4.A0A
            if (r0 == 0) goto L_0x0120
            r30 = 0
            r24 = r0
            r25 = r5
            r26 = r14
            r27 = r2
            r28 = r3
            r29 = r1
            boolean r0 = r24.A06(r25, r26, r27, r28, r29, r30)
            if (r0 != 0) goto L_0x0123
        L_0x0120:
            r14.A0E(r5, r2, r3, r1)
        L_0x0123:
            int r0 = r5.getMeasuredWidth()
            int r1 = r17 + r0
            int r0 = r4.leftMargin
            int r1 = r1 + r0
            int r0 = r4.rightMargin
            int r1 = r1 + r0
            int r11 = java.lang.Math.max(r11, r1)
            int r0 = r5.getMeasuredHeight()
            int r1 = r22 + r0
            int r0 = r4.topMargin
            int r1 = r1 + r0
            int r0 = r4.bottomMargin
            int r1 = r1 + r0
            int r10 = java.lang.Math.max(r10, r1)
            int r0 = r5.getMeasuredState()
            int r7 = android.view.View.combineMeasuredStates(r7, r0)
        L_0x014b:
            int r6 = r6 + 1
            goto L_0x00a1
        L_0x014f:
            r2 = r32
            r1 = r31
            goto L_0x0108
        L_0x0154:
            r0 = 5
            if (r1 != r0) goto L_0x0163
            if (r20 == 0) goto L_0x00d3
        L_0x0159:
            int r1 = r19 - r21
            int r1 = r1 - r2
            r0 = 0
            int r3 = java.lang.Math.max(r0, r1)
            goto L_0x00da
        L_0x0163:
            if (r1 != r0) goto L_0x016a
            if (r20 == 0) goto L_0x00d3
        L_0x0167:
            r3 = 0
            goto L_0x00da
        L_0x016a:
            r0 = 3
            if (r1 != r0) goto L_0x0167
            if (r20 == 0) goto L_0x0167
            goto L_0x00d3
        L_0x0171:
            if (r0 == 0) goto L_0x0180
            X.0Yu r0 = r14.A04
            if (r0 == 0) goto L_0x0180
            android.view.ViewTreeObserver r1 = r14.getViewTreeObserver()
            X.0Yu r0 = r14.A04
            r1.removeOnPreDrawListener(r0)
        L_0x0180:
            r0 = 0
            goto L_0x004e
        L_0x0183:
            int r2 = r2 + 1
            goto L_0x001a
        L_0x0187:
            int r6 = r6 + 1
            goto L_0x000b
        L_0x018b:
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1 = r1 & r7
            r0 = r32
            int r2 = android.view.View.resolveSizeAndState(r11, r0, r1)
            int r1 = r7 << 16
            r0 = r31
            int r0 = android.view.View.resolveSizeAndState(r10, r0, r1)
            r14.setMeasuredDimension(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    public boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                childAt.getLayoutParams();
            }
        }
        return false;
    }

    public boolean onNestedPreFling(View view, float f2, float f3) {
        AnonymousClass06y r5;
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                AnonymousClass0Bo r1 = (AnonymousClass0Bo) childAt.getLayoutParams();
                if (r1.A0D && (r5 = r1.A0A) != null) {
                    z2 |= r5.A0E(childAt, view, this, f2, f3);
                }
            }
        }
        return z2;
    }

    public void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
        ATu(view, iArr, i2, i3, 0);
    }

    public void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        ATv(view, i2, i3, i4, i5, 0);
    }

    public void onNestedScrollAccepted(View view, View view2, int i2) {
        ATx(view, view2, i2, 0);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof C02670Ej)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C02670Ej r8 = (C02670Ej) parcelable;
        super.onRestoreInstanceState(r8.A00);
        SparseArray sparseArray = r8.A00;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int id = childAt.getId();
            AnonymousClass06y r1 = A01(childAt).A0A;
            if (!(id == -1 || r1 == null || (parcelable2 = (Parcelable) sparseArray.get(id)) == null)) {
                r1.A08(parcelable2, childAt, this);
            }
        }
    }

    public Parcelable onSaveInstanceState() {
        Parcelable A072;
        C02670Ej r7 = new C02670Ej(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int id = childAt.getId();
            AnonymousClass06y r1 = ((AnonymousClass0Bo) childAt.getLayoutParams()).A0A;
            if (!(id == -1 || r1 == null || (A072 = r1.A07(childAt, this)) == null)) {
                sparseArray.append(id, A072);
            }
        }
        r7.A00 = sparseArray;
        return r7;
    }

    public boolean onStartNestedScroll(View view, View view2, int i2) {
        return AXV(view, view2, i2, 0);
    }

    public void onStopNestedScroll(View view) {
        AXx(view, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r4 != false) goto L_0x0010;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r13) {
        /*
            r12 = this;
            int r2 = r13.getActionMasked()
            android.view.View r0 = r12.A01
            r3 = 1
            r11 = 0
            if (r0 != 0) goto L_0x004d
            boolean r4 = r12.A0H(r13, r3)
            if (r4 == 0) goto L_0x004b
        L_0x0010:
            android.view.View r0 = r12.A01
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            X.0Bo r0 = (X.AnonymousClass0Bo) r0
            X.06y r1 = r0.A0A
            if (r1 == 0) goto L_0x004b
            android.view.View r0 = r12.A01
            boolean r1 = r1.A0C(r13, r0, r12)
        L_0x0022:
            android.view.View r0 = r12.A01
            if (r0 != 0) goto L_0x0034
            boolean r0 = super.onTouchEvent(r13)
            r1 = r1 | r0
        L_0x002b:
            if (r2 == r3) goto L_0x0030
            r0 = 3
            if (r2 != r0) goto L_0x0033
        L_0x0030:
            r12.A0G(r11)
        L_0x0033:
            return r1
        L_0x0034:
            if (r4 == 0) goto L_0x002b
            long r4 = android.os.SystemClock.uptimeMillis()
            r8 = 3
            r9 = 0
            r10 = 0
            r6 = r4
            android.view.MotionEvent r0 = android.view.MotionEvent.obtain(r4, r6, r8, r9, r10, r11)
            super.onTouchEvent(r0)
            if (r0 == 0) goto L_0x002b
            r0.recycle()
            goto L_0x002b
        L_0x004b:
            r1 = 0
            goto L_0x0022
        L_0x004d:
            r4 = 0
            goto L_0x0010
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        AnonymousClass06y r0 = ((AnonymousClass0Bo) view.getLayoutParams()).A0A;
        if (r0 == null || !r0.A03(rect, view, this, z2)) {
            return super.requestChildRectangleOnScreen(view, rect, z2);
        }
        return true;
    }

    public void requestDisallowInterceptTouchEvent(boolean z2) {
        super.requestDisallowInterceptTouchEvent(z2);
        if (z2 && !this.A07) {
            A0G(false);
            this.A07 = true;
        }
    }

    public void setFitsSystemWindows(boolean z2) {
        super.setFitsSystemWindows(z2);
        A09();
    }

    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.A03 = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.A00;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.A00 = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.A00.setState(getDrawableState());
                }
                C018208n.A0D(C004601z.A06(this), this.A00);
                Drawable drawable4 = this.A00;
                boolean z2 = false;
                if (getVisibility() == 0) {
                    z2 = true;
                }
                drawable4.setVisible(z2, false);
                this.A00.setCallback(this);
            }
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarBackgroundColor(int i2) {
        setStatusBarBackground(new ColorDrawable(i2));
    }

    public void setStatusBarBackgroundResource(int i2) {
        setStatusBarBackground(i2 != 0 ? AnonymousClass00T.A04(getContext(), i2) : null);
    }

    public void setVisibility(int i2) {
        super.setVisibility(i2);
        boolean z2 = false;
        if (i2 == 0) {
            z2 = true;
        }
        Drawable drawable = this.A00;
        if (drawable != null && drawable.isVisible() != z2) {
            this.A00.setVisible(z2, false);
        }
    }

    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.A00;
    }
}
