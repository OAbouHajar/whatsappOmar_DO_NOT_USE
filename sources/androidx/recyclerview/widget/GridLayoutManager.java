package androidx.recyclerview.widget;

import X.AnonymousClass02W;
import X.AnonymousClass0Bp;
import X.AnonymousClass0FY;
import X.AnonymousClass0Q9;
import X.AnonymousClass0Ri;
import X.AnonymousClass0SJ;
import X.C02820Fj;
import X.C04420Mm;
import X.C05300Qc;
import X.C05470Ro;
import X.C12490kU;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;

public class GridLayoutManager extends LinearLayoutManager {
    public int A00 = -1;
    public AnonymousClass0Q9 A01 = new AnonymousClass0FY();
    public boolean A02 = false;
    public int[] A03;
    public View[] A04;
    public final Rect A05 = new Rect();
    public final SparseIntArray A06 = new SparseIntArray();
    public final SparseIntArray A07 = new SparseIntArray();

    public GridLayoutManager(int i2) {
        super(1);
        A1g(i2);
    }

    public GridLayoutManager(int i2, int i3) {
        super(i3);
        A1g(i2);
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C04420Mm.A00, i2, i3);
        obtainStyledAttributes.getInt(0, 1);
        int i4 = obtainStyledAttributes.getInt(9, 1);
        obtainStyledAttributes.getBoolean(8, false);
        obtainStyledAttributes.getBoolean(10, false);
        obtainStyledAttributes.recycle();
        A1g(i4);
    }

    public int A0V(AnonymousClass0SJ r3, AnonymousClass0Ri r4) {
        if (this.A01 == 1) {
            return this.A00;
        }
        int A002 = r4.A00();
        if (A002 < 1) {
            return 0;
        }
        return A1b(r3, r4, A002 - 1) + 1;
    }

    public int A0W(AnonymousClass0SJ r3, AnonymousClass0Ri r4) {
        if (this.A01 == 0) {
            return this.A00;
        }
        int A002 = r4.A00();
        if (A002 < 1) {
            return 0;
        }
        return A1b(r3, r4, A002 - 1) + 1;
    }

    public int A0X(AnonymousClass0SJ r2, AnonymousClass0Ri r3, int i2) {
        A1f();
        A1e();
        return super.A0X(r2, r3, i2);
    }

    public int A0Y(AnonymousClass0SJ r2, AnonymousClass0Ri r3, int i2) {
        A1f();
        A1e();
        return super.A0Y(r2, r3, i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0058, code lost:
        if (A1a() == false) goto L_0x005a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View A0g(android.view.View r25, X.AnonymousClass0SJ r26, X.AnonymousClass0Ri r27, int r28) {
        /*
            r24 = this;
            r10 = r24
            androidx.recyclerview.widget.RecyclerView r0 = r10.A07
            r22 = 0
            r2 = r25
            if (r0 == 0) goto L_0x001a
            android.view.View r9 = r0.A0C(r2)
            if (r9 == 0) goto L_0x001a
            X.0SK r0 = r10.A05
            java.util.List r0 = r0.A02
            boolean r0 = r0.contains(r9)
            if (r0 == 0) goto L_0x001c
        L_0x001a:
            r9 = r22
        L_0x001c:
            r21 = 0
            if (r9 == 0) goto L_0x0083
            android.view.ViewGroup$LayoutParams r0 = r9.getLayoutParams()
            X.0Fj r0 = (X.C02820Fj) r0
            int r8 = r0.A00
            int r7 = r0.A01
            int r7 = r7 + r8
            r23 = r26
            r11 = r27
            r1 = r28
            r0 = r23
            android.view.View r0 = super.A0g(r2, r0, r11, r1)
            if (r0 == 0) goto L_0x0083
            int r0 = r10.A1C(r1)
            r2 = 1
            r1 = 0
            if (r0 != r2) goto L_0x0042
            r1 = 1
        L_0x0042:
            boolean r0 = r10.A09
            int r12 = r10.A05()
            if (r1 == r0) goto L_0x010d
            int r12 = r12 - r2
            r20 = -1
            r19 = -1
        L_0x004f:
            int r0 = r10.A01
            if (r0 != r2) goto L_0x005a
            boolean r0 = r10.A1a()
            r6 = 1
            if (r0 != 0) goto L_0x005b
        L_0x005a:
            r6 = 0
        L_0x005b:
            r0 = r23
            int r18 = r10.A1b(r0, r11, r12)
            r3 = 0
            r17 = -1
            r16 = -1
            r2 = 0
        L_0x0067:
            r0 = r20
            if (r12 == r0) goto L_0x010a
            r0 = r23
            int r1 = r10.A1b(r0, r11, r12)
            android.view.View r14 = r10.A0C(r12)
            if (r14 == r9) goto L_0x010a
            boolean r0 = r14.hasFocusable()
            if (r0 == 0) goto L_0x0084
            r0 = r18
            if (r1 == r0) goto L_0x0084
            if (r21 == 0) goto L_0x00bf
        L_0x0083:
            return r21
        L_0x0084:
            android.view.ViewGroup$LayoutParams r13 = r14.getLayoutParams()
            X.0Fj r13 = (X.C02820Fj) r13
            int r5 = r13.A00
            int r4 = r13.A01
            int r4 = r4 + r5
            boolean r0 = r14.hasFocusable()
            if (r0 == 0) goto L_0x009a
            if (r5 != r8) goto L_0x009a
            if (r4 != r7) goto L_0x009a
            return r14
        L_0x009a:
            boolean r0 = r14.hasFocusable()
            if (r0 == 0) goto L_0x00a2
            if (r21 == 0) goto L_0x00aa
        L_0x00a2:
            boolean r0 = r14.hasFocusable()
            if (r0 != 0) goto L_0x00d0
            if (r22 != 0) goto L_0x00d0
        L_0x00aa:
            boolean r1 = r14.hasFocusable()
            int r0 = r13.A00
            if (r1 == 0) goto L_0x00c2
            r17 = r0
            int r3 = java.lang.Math.min(r4, r7)
            int r0 = java.lang.Math.max(r5, r8)
            int r3 = r3 - r0
            r21 = r14
        L_0x00bf:
            int r12 = r12 + r19
            goto L_0x0067
        L_0x00c2:
            r16 = r0
            int r2 = java.lang.Math.min(r4, r7)
            int r0 = java.lang.Math.max(r5, r8)
            int r2 = r2 - r0
            r22 = r14
            goto L_0x00bf
        L_0x00d0:
            int r0 = java.lang.Math.max(r5, r8)
            int r15 = java.lang.Math.min(r4, r7)
            int r15 = r15 - r0
            boolean r0 = r14.hasFocusable()
            if (r0 == 0) goto L_0x00ec
            if (r15 > r3) goto L_0x00aa
            if (r15 != r3) goto L_0x00bf
            r1 = 0
            r0 = r17
            if (r5 <= r0) goto L_0x00e9
            r1 = 1
        L_0x00e9:
            if (r6 != r1) goto L_0x00bf
            goto L_0x00aa
        L_0x00ec:
            if (r21 != 0) goto L_0x00bf
            r1 = 1
            X.0QK r0 = r10.A08
            boolean r0 = r0.A01(r14)
            if (r0 == 0) goto L_0x0100
            X.0QK r0 = r10.A09
            boolean r0 = r0.A01(r14)
            if (r0 == 0) goto L_0x0100
            goto L_0x00bf
        L_0x0100:
            if (r15 > r2) goto L_0x00aa
            if (r15 != r2) goto L_0x00bf
            r0 = r16
            if (r5 > r0) goto L_0x00e9
            r1 = 0
            goto L_0x00e9
        L_0x010a:
            if (r21 != 0) goto L_0x0083
            return r22
        L_0x010d:
            r20 = r12
            r12 = 0
            r19 = 1
            goto L_0x004f
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.A0g(android.view.View, X.0SJ, X.0Ri, int):android.view.View");
    }

    public AnonymousClass0Bp A0h() {
        C02820Fj r0;
        if (this.A01 == 0) {
            return r0;
        }
        r0 = new C02820Fj(-1, -2);
        return r0;
    }

    public AnonymousClass0Bp A0i(Context context, AttributeSet attributeSet) {
        return new C02820Fj(context, attributeSet);
    }

    public AnonymousClass0Bp A0j(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C02820Fj((ViewGroup.MarginLayoutParams) layoutParams) : new C02820Fj(layoutParams);
    }

    public void A0o(Rect rect, int i2, int i3) {
        int A002;
        int A003;
        if (this.A03 == null) {
            super.A0o(rect, i2, i3);
        }
        int A08 = A08() + A09();
        int A0A = A0A() + A07();
        if (this.A01 == 1) {
            A003 = AnonymousClass02W.A00(i3, rect.height() + A0A, this.A07.getMinimumHeight());
            int[] iArr = this.A03;
            A002 = AnonymousClass02W.A00(i2, iArr[iArr.length - 1] + A08, this.A07.getMinimumWidth());
        } else {
            A002 = AnonymousClass02W.A00(i2, rect.width() + A08, this.A07.getMinimumWidth());
            int[] iArr2 = this.A03;
            A003 = AnonymousClass02W.A00(i3, iArr2[iArr2.length - 1] + A0A, this.A07.getMinimumHeight());
        }
        this.A07.setMeasuredDimension(A002, A003);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0039, code lost:
        if (r7 != r0) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0024, code lost:
        if (r3 != r0) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0q(android.view.View r11, X.AnonymousClass031 r12, X.AnonymousClass0SJ r13, X.AnonymousClass0Ri r14) {
        /*
            r10 = this;
            android.view.ViewGroup$LayoutParams r1 = r11.getLayoutParams()
            boolean r0 = r1 instanceof X.C02820Fj
            if (r0 != 0) goto L_0x000c
            super.A0J(r11, r12)
            return
        L_0x000c:
            X.0Fj r1 = (X.C02820Fj) r1
            int r0 = r1.A01()
            int r4 = r10.A1b(r13, r14, r0)
            int r0 = r10.A01
            r5 = 1
            if (r0 != 0) goto L_0x0030
            int r2 = r1.A00
            int r3 = r1.A01
            int r0 = r10.A00
            if (r0 <= r5) goto L_0x0026
            r6 = 1
            if (r3 == r0) goto L_0x0027
        L_0x0026:
            r6 = 0
        L_0x0027:
            r7 = 0
            X.0WL r0 = X.AnonymousClass0WL.A01(r2, r3, r4, r5, r6, r7)
        L_0x002c:
            r12.A0J(r0)
            return
        L_0x0030:
            int r6 = r1.A00
            int r7 = r1.A01
            int r0 = r10.A00
            if (r0 <= r5) goto L_0x003b
            r8 = 1
            if (r7 == r0) goto L_0x003c
        L_0x003b:
            r8 = 0
        L_0x003c:
            r9 = 0
            X.0WL r0 = X.AnonymousClass0WL.A01(r4, r5, r6, r7, r8, r9)
            goto L_0x002c
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.A0q(android.view.View, X.031, X.0SJ, X.0Ri):void");
    }

    public void A0t(AnonymousClass0SJ r7, AnonymousClass0Ri r8) {
        if (r8.A08) {
            int A052 = A05();
            for (int i2 = 0; i2 < A052; i2++) {
                C02820Fj r3 = (C02820Fj) A0C(i2).getLayoutParams();
                int A012 = r3.A01();
                this.A07.put(A012, r3.A01);
                this.A06.put(A012, r3.A00);
            }
        }
        super.A0t(r7, r8);
        this.A07.clear();
        this.A06.clear();
    }

    public void A0v(AnonymousClass0Ri r2) {
        super.A0v(r2);
        this.A02 = false;
    }

    public void A0x(RecyclerView recyclerView) {
        this.A01.A00.clear();
    }

    public void A0y(RecyclerView recyclerView, int i2, int i3) {
        this.A01.A00.clear();
    }

    public void A0z(RecyclerView recyclerView, int i2, int i3) {
        this.A01.A00.clear();
    }

    public void A10(RecyclerView recyclerView, int i2, int i3, int i4) {
        this.A01.A00.clear();
    }

    public void A11(RecyclerView recyclerView, Object obj, int i2, int i3) {
        this.A01.A00.clear();
    }

    public boolean A16() {
        return this.A05 == null && !this.A02;
    }

    public boolean A17(AnonymousClass0Bp r2) {
        return r2 instanceof C02820Fj;
    }

    public View A1K(AnonymousClass0SJ r8, AnonymousClass0Ri r9, int i2, int i3, int i4) {
        A1N();
        int A062 = this.A06.A06();
        int A022 = this.A06.A02();
        int i5 = -1;
        if (i3 > i2) {
            i5 = 1;
        }
        View view = null;
        View view2 = null;
        while (i2 != i3) {
            View A0C = A0C(i2);
            int A023 = AnonymousClass02W.A02(A0C);
            if (A023 >= 0 && A023 < i4 && A1c(r8, r9, A023) == 0) {
                if ((((AnonymousClass0Bp) A0C.getLayoutParams()).A00.A00 & 8) != 0) {
                    if (view2 == null) {
                        view2 = A0C;
                    }
                } else if (this.A06.A0B(A0C) < A022 && this.A06.A08(A0C) >= A062) {
                    return A0C;
                } else {
                    if (view == null) {
                        view = A0C;
                    }
                }
            }
            i2 += i5;
        }
        return view == null ? view2 : view;
    }

    public void A1T(C05470Ro r6, AnonymousClass0SJ r7, AnonymousClass0Ri r8, int i2) {
        A1f();
        if (r8.A00() > 0 && !r8.A08) {
            boolean z2 = false;
            if (i2 == 1) {
                z2 = true;
            }
            int A1c = A1c(r7, r8, r6.A01);
            if (z2) {
                while (A1c > 0) {
                    int i3 = r6.A01;
                    if (i3 <= 0) {
                        break;
                    }
                    int i4 = i3 - 1;
                    r6.A01 = i4;
                    A1c = A1c(r7, r8, i4);
                }
            } else {
                int A002 = r8.A00() - 1;
                int i5 = r6.A01;
                while (i5 < A002) {
                    int i6 = i5 + 1;
                    int A1c2 = A1c(r7, r8, i6);
                    if (A1c2 <= A1c) {
                        break;
                    }
                    i5 = i6;
                    A1c = A1c2;
                }
                r6.A01 = i5;
            }
        }
        A1e();
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00c1  */
    public void A1U(X.C04840Od r19, X.C05300Qc r20, X.AnonymousClass0SJ r21, X.AnonymousClass0Ri r22) {
        /*
            r18 = this;
            r8 = r18
            X.0VA r0 = r8.A06
            int r4 = r0.A05()
            r0 = 1073741824(0x40000000, float:2.0)
            r7 = 1
            r17 = 0
            if (r4 == r0) goto L_0x0011
            r17 = 1
        L_0x0011:
            int r0 = r8.A05()
            if (r0 <= 0) goto L_0x006a
            int[] r1 = r8.A03
            int r0 = r8.A00
            r3 = r1[r0]
        L_0x001d:
            if (r17 == 0) goto L_0x0022
            r8.A1f()
        L_0x0022:
            r2 = r20
            int r0 = r2.A03
            r16 = 0
            if (r0 != r7) goto L_0x002c
            r16 = 1
        L_0x002c:
            int r13 = r8.A00
            r11 = r21
            r9 = r22
            if (r16 != 0) goto L_0x0041
            int r0 = r2.A01
            int r13 = r8.A1c(r11, r9, r0)
            int r0 = r2.A01
            int r0 = r8.A1d(r11, r9, r0)
            int r13 = r13 + r0
        L_0x0041:
            r6 = 0
        L_0x0042:
            int r0 = r8.A00
            if (r6 >= r0) goto L_0x0095
            int r12 = r2.A01
            if (r12 < 0) goto L_0x0095
            int r0 = r9.A00()
            if (r12 >= r0) goto L_0x0095
            if (r13 <= 0) goto L_0x0095
            int r10 = r8.A1d(r11, r9, r12)
            int r5 = r8.A00
            if (r10 > r5) goto L_0x006c
            int r13 = r13 - r10
            if (r13 < 0) goto L_0x0095
            android.view.View r1 = r2.A00(r11)
            if (r1 == 0) goto L_0x0095
            android.view.View[] r0 = r8.A04
            r0[r6] = r1
            int r6 = r6 + 1
            goto L_0x0042
        L_0x006a:
            r3 = 0
            goto L_0x001d
        L_0x006c:
            java.lang.String r0 = "Item at position "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r12)
            java.lang.String r0 = " requires "
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = " spans but GridLayoutManager has only "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = " spans."
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0095:
            r10 = r19
            if (r6 != 0) goto L_0x009c
            r10.A01 = r7
            return
        L_0x009c:
            r15 = 0
            r13 = 0
            r12 = -1
            int r5 = r6 + -1
            r14 = -1
            if (r16 == 0) goto L_0x00bf
            r12 = r6
            r5 = 0
            r14 = 1
        L_0x00a7:
            android.view.View[] r0 = r8.A04
            r0 = r0[r5]
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            X.0Fj r1 = (X.C02820Fj) r1
            int r0 = X.AnonymousClass02W.A02(r0)
            int r0 = r8.A1d(r11, r9, r0)
            r1.A01 = r0
            r1.A00 = r13
            int r13 = r13 + r0
            int r5 = r5 + r14
        L_0x00bf:
            if (r5 != r12) goto L_0x00a7
            r9 = 0
            r5 = 0
        L_0x00c3:
            if (r9 >= r6) goto L_0x0113
            android.view.View[] r0 = r8.A04
            r1 = r0[r9]
            java.util.List r0 = r2.A08
            if (r0 != 0) goto L_0x0107
            if (r16 == 0) goto L_0x0102
            r11 = -1
            r0 = 0
            r8.A0H(r1, r11, r0)
            r11 = 0
        L_0x00d5:
            android.graphics.Rect r0 = r8.A05
            r8.A0I(r1, r0)
            r8.A1i(r1, r4, r11)
            X.0VA r0 = r8.A06
            int r0 = r0.A09(r1)
            if (r0 <= r5) goto L_0x00e6
            r5 = r0
        L_0x00e6:
            android.view.ViewGroup$LayoutParams r12 = r1.getLayoutParams()
            X.0Fj r12 = (X.C02820Fj) r12
            r11 = 1065353216(0x3f800000, float:1.0)
            X.0VA r0 = r8.A06
            int r0 = r0.A0A(r1)
            float r1 = (float) r0
            float r1 = r1 * r11
            int r0 = r12.A01
            float r0 = (float) r0
            float r1 = r1 / r0
            int r0 = (r1 > r15 ? 1 : (r1 == r15 ? 0 : -1))
            if (r0 <= 0) goto L_0x00ff
            r15 = r1
        L_0x00ff:
            int r9 = r9 + 1
            goto L_0x00c3
        L_0x0102:
            r11 = 0
            r8.A0H(r1, r11, r11)
            goto L_0x00d5
        L_0x0107:
            r11 = 0
            if (r16 == 0) goto L_0x010f
            r0 = -1
            r8.A0H(r1, r0, r7)
            goto L_0x00d5
        L_0x010f:
            r8.A0H(r1, r11, r7)
            goto L_0x00d5
        L_0x0113:
            if (r17 == 0) goto L_0x013d
            int r0 = r8.A00
            float r0 = (float) r0
            float r15 = r15 * r0
            int r0 = java.lang.Math.round(r15)
            int r0 = java.lang.Math.max(r0, r3)
            r8.A1h(r0)
            r5 = 0
            r3 = 0
        L_0x0126:
            if (r3 >= r6) goto L_0x013d
            android.view.View[] r0 = r8.A04
            r1 = r0[r3]
            r0 = 1073741824(0x40000000, float:2.0)
            r8.A1i(r1, r0, r7)
            X.0VA r0 = r8.A06
            int r0 = r0.A09(r1)
            if (r0 <= r5) goto L_0x013a
            r5 = r0
        L_0x013a:
            int r3 = r3 + 1
            goto L_0x0126
        L_0x013d:
            r9 = 0
        L_0x013e:
            if (r9 >= r6) goto L_0x01d2
            android.view.View[] r0 = r8.A04
            r4 = r0[r9]
            X.0VA r0 = r8.A06
            int r0 = r0.A09(r4)
            if (r0 == r5) goto L_0x01b7
            android.view.ViewGroup$LayoutParams r14 = r4.getLayoutParams()
            X.0Fj r14 = (X.C02820Fj) r14
            android.graphics.Rect r1 = r14.A03
            int r13 = r1.top
            int r0 = r1.bottom
            int r13 = r13 + r0
            int r0 = r14.topMargin
            int r13 = r13 + r0
            int r0 = r14.bottomMargin
            int r13 = r13 + r0
            int r11 = r1.left
            int r0 = r1.right
            int r11 = r11 + r0
            int r0 = r14.leftMargin
            int r11 = r11 + r0
            int r0 = r14.rightMargin
            int r11 = r11 + r0
            int r3 = r14.A00
            int r1 = r14.A01
            int r0 = r8.A01
            if (r0 != r7) goto L_0x01ca
            boolean r0 = r8.A1a()
            if (r0 == 0) goto L_0x01ca
            int[] r15 = r8.A03
            int r0 = r8.A00
            int r0 = r0 - r3
            r12 = r15[r0]
            int r0 = r0 - r1
            r0 = r15[r0]
        L_0x0182:
            int r12 = r12 - r0
            int r0 = r8.A01
            if (r0 != r7) goto L_0x01ba
            int r3 = r14.width
            r0 = 0
            r1 = 1073741824(0x40000000, float:2.0)
            int r11 = X.AnonymousClass02W.A01(r12, r1, r11, r3, r0)
            int r0 = r5 - r13
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
        L_0x0196:
            android.view.ViewGroup$LayoutParams r12 = r4.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r12 = (android.view.ViewGroup.MarginLayoutParams) r12
            int r1 = r4.getMeasuredWidth()
            int r0 = r12.width
            boolean r0 = X.AnonymousClass02W.A04(r1, r11, r0)
            if (r0 == 0) goto L_0x01b4
            int r1 = r4.getMeasuredHeight()
            int r0 = r12.height
            boolean r0 = X.AnonymousClass02W.A04(r1, r3, r0)
            if (r0 != 0) goto L_0x01b7
        L_0x01b4:
            r4.measure(r11, r3)
        L_0x01b7:
            int r9 = r9 + 1
            goto L_0x013e
        L_0x01ba:
            r3 = 0
            r1 = 1073741824(0x40000000, float:2.0)
            int r0 = r5 - r11
            int r11 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
            int r0 = r14.height
            int r3 = X.AnonymousClass02W.A01(r12, r1, r13, r0, r3)
            goto L_0x0196
        L_0x01ca:
            int[] r0 = r8.A03
            int r1 = r1 + r3
            r12 = r0[r1]
            r0 = r0[r3]
            goto L_0x0182
        L_0x01d2:
            r9 = 0
            r10.A00 = r5
            int r0 = r8.A01
            r4 = -1
            int r1 = r2.A05
            int r2 = r2.A06
            if (r0 != r7) goto L_0x0253
            int r0 = r2 + r5
            r11 = 0
            r3 = 0
            if (r1 != r4) goto L_0x01e8
            int r1 = r2 - r5
            r0 = r2
            r2 = r1
        L_0x01e8:
            android.view.View[] r1 = r8.A04
            if (r9 >= r6) goto L_0x025e
            r5 = r1[r9]
            android.view.ViewGroup$LayoutParams r4 = r5.getLayoutParams()
            X.0Fj r4 = (X.C02820Fj) r4
            int r1 = r8.A01
            if (r1 != r7) goto L_0x0240
            boolean r1 = r8.A1a()
            int r3 = r8.A08()
            int[] r12 = r8.A03
            if (r1 == 0) goto L_0x0231
            int r11 = r8.A00
            int r1 = r4.A00
            int r11 = r11 - r1
            r1 = r12[r11]
            int r3 = r3 + r1
            X.0VA r1 = r8.A06
            int r1 = r1.A0A(r5)
            int r11 = r3 - r1
        L_0x0214:
            X.AnonymousClass02W.A03(r5, r11, r2, r3, r0)
            X.02k r1 = r4.A00
            int r4 = r1.A00
            r1 = r4 & 8
            if (r1 != 0) goto L_0x0223
            r1 = r4 & 2
            if (r1 == 0) goto L_0x0225
        L_0x0223:
            r10.A03 = r7
        L_0x0225:
            boolean r4 = r10.A02
            boolean r1 = r5.hasFocusable()
            r4 = r4 | r1
            r10.A02 = r4
            int r9 = r9 + 1
            goto L_0x01e8
        L_0x0231:
            int r1 = r4.A00
            r1 = r12[r1]
            int r3 = r3 + r1
            X.0VA r1 = r8.A06
            int r1 = r1.A0A(r5)
            int r1 = r1 + r3
            r11 = r3
            r3 = r1
            goto L_0x0214
        L_0x0240:
            int r2 = r8.A0A()
            int[] r1 = r8.A03
            int r0 = r4.A00
            r0 = r1[r0]
            int r2 = r2 + r0
            X.0VA r0 = r8.A06
            int r0 = r0.A0A(r5)
            int r0 = r0 + r2
            goto L_0x0214
        L_0x0253:
            int r3 = r2 + r5
            r11 = r2
            if (r1 != r4) goto L_0x025b
            int r11 = r2 - r5
            r3 = r2
        L_0x025b:
            r0 = 0
            r2 = 0
            goto L_0x01e8
        L_0x025e:
            r0 = 0
            java.util.Arrays.fill(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.A1U(X.0Od, X.0Qc, X.0SJ, X.0Ri):void");
    }

    public void A1V(C05300Qc r6, C12490kU r7, AnonymousClass0Ri r8) {
        int i2;
        int i3 = this.A00;
        for (int i4 = 0; i4 < this.A00 && (i2 = r6.A01) >= 0 && i2 < r8.A00() && i3 > 0; i4++) {
            r7.A4h(i2, Math.max(0, r6.A07));
            i3 -= this.A01.A00(i2);
            r6.A01 += r6.A03;
        }
    }

    public void A1Z(boolean z2) {
        if (!z2) {
            super.A1Z(false);
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    public final int A1b(AnonymousClass0SJ r9, AnonymousClass0Ri r10, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        if (!r10.A08) {
            AnonymousClass0Q9 r2 = this.A01;
            i3 = this.A00;
            i4 = r2.A00(i2);
            i5 = 0;
            i6 = 0;
            for (int i7 = 0; i7 < i2; i7++) {
                int A002 = r2.A00(i7);
                i5 += A002;
                if (i5 == i3) {
                    i6++;
                    i5 = 0;
                } else if (i5 > i3) {
                    i6++;
                    i5 = A002;
                }
            }
        } else {
            int A003 = r9.A00(i2);
            if (A003 == -1) {
                StringBuilder sb = new StringBuilder("Cannot find span size for pre layout position. ");
                sb.append(i2);
                Log.w("GridLayoutManager", sb.toString());
                return 0;
            }
            AnonymousClass0Q9 r22 = this.A01;
            i3 = this.A00;
            i4 = r22.A00(A003);
            int i8 = 0;
            i6 = 0;
            for (int i9 = 0; i9 < A003; i9++) {
                int A004 = r22.A00(i9);
                i8 = i5 + A004;
                if (i8 == i3) {
                    i6++;
                    i8 = 0;
                } else if (i8 > i3) {
                    i6++;
                    i8 = A004;
                }
            }
        }
        return i5 + i4 > i3 ? i6 + 1 : i6;
    }

    public final int A1c(AnonymousClass0SJ r4, AnonymousClass0Ri r5, int i2) {
        if (!r5.A08) {
            return this.A01.A01(i2, this.A00);
        }
        int i3 = this.A06.get(i2, -1);
        if (i3 != -1) {
            return i3;
        }
        int A002 = r4.A00(i2);
        if (A002 != -1) {
            return this.A01.A01(A002, this.A00);
        }
        StringBuilder sb = new StringBuilder("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:");
        sb.append(i2);
        Log.w("GridLayoutManager", sb.toString());
        return 0;
    }

    public final int A1d(AnonymousClass0SJ r3, AnonymousClass0Ri r4, int i2) {
        if (!r4.A08) {
            return this.A01.A00(i2);
        }
        int i3 = this.A07.get(i2, -1);
        if (i3 != -1) {
            return i3;
        }
        int A002 = r3.A00(i2);
        if (A002 != -1) {
            return this.A01.A00(A002);
        }
        StringBuilder sb = new StringBuilder("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:");
        sb.append(i2);
        Log.w("GridLayoutManager", sb.toString());
        return 1;
    }

    public final void A1e() {
        View[] viewArr = this.A04;
        if (viewArr == null || viewArr.length != this.A00) {
            this.A04 = new View[this.A00];
        }
    }

    public final void A1f() {
        int A072;
        int A0A;
        if (this.A01 == 1) {
            A072 = this.A03 - A09();
            A0A = A08();
        } else {
            A072 = this.A00 - A07();
            A0A = A0A();
        }
        A1h(A072 - A0A);
    }

    public void A1g(int i2) {
        if (i2 != this.A00) {
            this.A02 = true;
            if (i2 >= 1) {
                this.A00 = i2;
                this.A01.A00.clear();
                A0D();
                return;
            }
            StringBuilder sb = new StringBuilder("Span count should be at least 1. Provided ");
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public final void A1h(int i2) {
        int i3;
        int length;
        int[] iArr = this.A03;
        int i4 = this.A00;
        if (!(iArr != null && (length = iArr.length) == i4 + 1 && iArr[length - 1] == i2)) {
            iArr = new int[(i4 + 1)];
        }
        int i5 = 0;
        iArr[0] = 0;
        int i6 = i2 / i4;
        int i7 = i2 % i4;
        int i8 = 0;
        for (int i9 = 1; i9 <= i4; i9++) {
            i5 += i7;
            if (i5 <= 0 || i4 - i5 >= i7) {
                i3 = i6;
            } else {
                i3 = i6 + 1;
                i5 -= i4;
            }
            i8 += i3;
            iArr[i9] = i8;
        }
        this.A03 = iArr;
    }

    public final void A1i(View view, int i2, boolean z2) {
        int i3;
        int i4;
        int A012;
        int A013;
        C02820Fj r6 = (C02820Fj) view.getLayoutParams();
        Rect rect = r6.A03;
        int i5 = rect.top + rect.bottom + r6.topMargin + r6.bottomMargin;
        int i6 = rect.left + rect.right + r6.leftMargin + r6.rightMargin;
        int i7 = r6.A00;
        int i8 = r6.A01;
        if (this.A01 != 1 || !A1a()) {
            int[] iArr = this.A03;
            i3 = iArr[i8 + i7];
            i4 = iArr[i7];
        } else {
            int[] iArr2 = this.A03;
            int i9 = this.A00 - i7;
            i3 = iArr2[i9];
            i4 = iArr2[i9 - i8];
        }
        int i10 = i3 - i4;
        if (this.A01 == 1) {
            A013 = AnonymousClass02W.A01(i10, i2, i6, r6.width, false);
            A012 = AnonymousClass02W.A01(this.A06.A07(), this.A01, i5, r6.height, true);
        } else {
            A012 = AnonymousClass02W.A01(i10, i2, i5, r6.height, false);
            A013 = AnonymousClass02W.A01(this.A06.A07(), this.A04, i6, r6.width, true);
        }
        AnonymousClass0Bp r2 = (AnonymousClass0Bp) view.getLayoutParams();
        if (z2) {
            if (AnonymousClass02W.A04(view.getMeasuredWidth(), A013, r2.width) && AnonymousClass02W.A04(view.getMeasuredHeight(), A012, r2.height)) {
                return;
            }
        } else if (!A0U(view, r2, A013, A012)) {
            return;
        }
        view.measure(A013, A012);
    }
}
