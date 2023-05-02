package androidx.recyclerview.widget;

import X.AnonymousClass02W;
import X.AnonymousClass02X;
import X.AnonymousClass031;
import X.AnonymousClass0Bp;
import X.AnonymousClass0Fo;
import X.AnonymousClass0Q2;
import X.AnonymousClass0Ri;
import X.AnonymousClass0S8;
import X.AnonymousClass0SJ;
import X.AnonymousClass0SL;
import X.AnonymousClass0VA;
import X.AnonymousClass0VZ;
import X.AnonymousClass0WL;
import X.AnonymousClass0YJ;
import X.C004601z;
import X.C02830Fk;
import X.C04420Mm;
import X.C05270Py;
import X.C09540fg;
import X.C12490kU;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.Arrays;
import java.util.BitSet;

public class StaggeredGridLayoutManager extends AnonymousClass02W implements AnonymousClass02X {
    public int A00;
    public int A01 = 2;
    public int A02;
    public int A03 = -1;
    public int A04 = Integer.MIN_VALUE;
    public int A05;
    public int A06 = -1;
    public AnonymousClass0VA A07;
    public AnonymousClass0VA A08;
    public AnonymousClass0S8 A09 = new AnonymousClass0S8();
    public AnonymousClass0YJ A0A;
    public BitSet A0B;
    public boolean A0C = false;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F = false;
    public boolean A0G = false;
    public boolean A0H = true;
    public int[] A0I;
    public AnonymousClass0SL[] A0J;
    public final Rect A0K = new Rect();
    public final AnonymousClass0Q2 A0L;
    public final C05270Py A0M = new C05270Py(this);
    public final Runnable A0N = new C09540fg(this);

    public StaggeredGridLayoutManager(int i2, int i3) {
        this.A02 = i3;
        A1J(i2);
        this.A0L = new AnonymousClass0Q2();
        this.A07 = AnonymousClass0VA.A00(this, this.A02);
        this.A08 = AnonymousClass0VA.A00(this, 1 - this.A02);
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C04420Mm.A00, i2, i3);
        int i4 = obtainStyledAttributes.getInt(0, 1);
        int i5 = obtainStyledAttributes.getInt(9, 1);
        boolean z2 = obtainStyledAttributes.getBoolean(8, false);
        obtainStyledAttributes.getBoolean(10, false);
        obtainStyledAttributes.recycle();
        if (i4 == 0 || i4 == 1) {
            A12((String) null);
            if (i4 != this.A02) {
                this.A02 = i4;
                AnonymousClass0VA r1 = this.A07;
                this.A07 = this.A08;
                this.A08 = r1;
                A0D();
            }
            A1J(i5);
            A12((String) null);
            AnonymousClass0YJ r12 = this.A0A;
            if (!(r12 == null || r12.A07 == z2)) {
                r12.A07 = z2;
            }
            this.A0F = z2;
            A0D();
            this.A0L = new AnonymousClass0Q2();
            this.A07 = AnonymousClass0VA.A00(this, this.A02);
            this.A08 = AnonymousClass0VA.A00(this, 1 - this.A02);
            return;
        }
        throw new IllegalArgumentException("invalid orientation.");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0005, code lost:
        r2 = android.view.View.MeasureSpec.getMode(r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int A05(int r3, int r4, int r5) {
        /*
            if (r4 != 0) goto L_0x0005
            if (r5 != 0) goto L_0x0005
        L_0x0004:
            return r3
        L_0x0005:
            int r2 = android.view.View.MeasureSpec.getMode(r3)
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 == r0) goto L_0x0011
            r0 = 1073741824(0x40000000, float:2.0)
            if (r2 != r0) goto L_0x0004
        L_0x0011:
            r1 = 0
            int r0 = android.view.View.MeasureSpec.getSize(r3)
            int r0 = r0 - r4
            int r0 = r0 - r5
            int r0 = java.lang.Math.max(r1, r0)
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r2)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.A05(int, int, int):int");
    }

    public int A0V(AnonymousClass0SJ r3, AnonymousClass0Ri r4) {
        return this.A02 == 1 ? this.A06 : super.A0V(r3, r4);
    }

    public int A0W(AnonymousClass0SJ r2, AnonymousClass0Ri r3) {
        return this.A02 == 0 ? this.A06 : super.A0W(r2, r3);
    }

    public int A0X(AnonymousClass0SJ r2, AnonymousClass0Ri r3, int i2) {
        return A1D(r2, r3, i2);
    }

    public int A0Y(AnonymousClass0SJ r2, AnonymousClass0Ri r3, int i2) {
        return A1D(r2, r3, i2);
    }

    public int A0Z(AnonymousClass0Ri r8) {
        if (A05() == 0) {
            return 0;
        }
        AnonymousClass0VA r3 = this.A07;
        boolean z2 = this.A0H;
        boolean z3 = !z2;
        return AnonymousClass0VZ.A00(A1H(z3), A1G(z3), r3, this, r8, z2);
    }

    public int A0a(AnonymousClass0Ri r2) {
        return A1E(r2);
    }

    public int A0b(AnonymousClass0Ri r8) {
        if (A05() == 0) {
            return 0;
        }
        AnonymousClass0VA r3 = this.A07;
        boolean z2 = this.A0H;
        boolean z3 = !z2;
        return AnonymousClass0VZ.A01(A1H(z3), A1G(z3), r3, this, r8, z2);
    }

    public int A0c(AnonymousClass0Ri r8) {
        if (A05() == 0) {
            return 0;
        }
        AnonymousClass0VA r3 = this.A07;
        boolean z2 = this.A0H;
        boolean z3 = !z2;
        return AnonymousClass0VZ.A00(A1H(z3), A1G(z3), r3, this, r8, z2);
    }

    public int A0d(AnonymousClass0Ri r2) {
        return A1E(r2);
    }

    public int A0e(AnonymousClass0Ri r8) {
        if (A05() == 0) {
            return 0;
        }
        AnonymousClass0VA r3 = this.A07;
        boolean z2 = this.A0H;
        boolean z3 = !z2;
        return AnonymousClass0VZ.A01(A1H(z3), A1G(z3), r3, this, r8, z2);
    }

    public Parcelable A0f() {
        AnonymousClass0YJ r4;
        int A032;
        int A062;
        int[] iArr;
        AnonymousClass0YJ r0 = this.A0A;
        if (r0 == null) {
            r4 = new AnonymousClass0YJ();
            r4.A07 = this.A0F;
            r4.A05 = this.A0D;
            r4.A06 = this.A0E;
            AnonymousClass0S8 r1 = this.A09;
            if (r1 == null || (iArr = r1.A01) == null) {
                r4.A01 = 0;
            } else {
                r4.A08 = iArr;
                r4.A01 = iArr.length;
                r4.A04 = r1.A00;
            }
            if (A05() > 0) {
                r4.A00 = this.A0D ? A19() : A18();
                View A1G = this.A0G ? A1G(true) : A1H(true);
                r4.A03 = A1G == null ? -1 : AnonymousClass02W.A02(A1G);
                int i2 = this.A06;
                r4.A02 = i2;
                r4.A09 = new int[i2];
                for (int i3 = 0; i3 < this.A06; i3++) {
                    boolean z2 = this.A0D;
                    AnonymousClass0SL r02 = this.A0J[i3];
                    if (z2) {
                        A032 = r02.A02(Integer.MIN_VALUE);
                        if (A032 != Integer.MIN_VALUE) {
                            A062 = this.A07.A02();
                        } else {
                            r4.A09[i3] = A032;
                        }
                    } else {
                        A032 = r02.A03(Integer.MIN_VALUE);
                        if (A032 != Integer.MIN_VALUE) {
                            A062 = this.A07.A06();
                        } else {
                            r4.A09[i3] = A032;
                        }
                    }
                    A032 -= A062;
                    r4.A09[i3] = A032;
                }
            } else {
                r4.A00 = -1;
                r4.A03 = -1;
                r4.A02 = 0;
                return r4;
            }
        }
        return r4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0088, code lost:
        if (r11.A02 == 0) goto L_0x00a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0093, code lost:
        if (A1T() != false) goto L_0x00a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x009e, code lost:
        if (A1T() != false) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00a3, code lost:
        if (r11.A02 == 1) goto L_0x00a5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0123 A[LOOP:3: B:94:0x0123->B:103:0x013a, LOOP_START, PHI: r5 
      PHI: (r5v2 int) = (r5v1 int), (r5v3 int) binds: [B:80:0x00fd, B:103:0x013a] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View A0g(android.view.View r12, X.AnonymousClass0SJ r13, X.AnonymousClass0Ri r14, int r15) {
        /*
            r11 = this;
            int r0 = r11.A05()
            r10 = 0
            if (r0 == 0) goto L_0x0142
            androidx.recyclerview.widget.RecyclerView r0 = r11.A07
            if (r0 == 0) goto L_0x0142
            android.view.View r2 = r0.A0C(r12)
            if (r2 == 0) goto L_0x0142
            X.0SK r0 = r11.A05
            java.util.List r0 = r0.A02
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto L_0x0142
            r11.A1I()
            r3 = -1
            r6 = 1
            if (r15 == r6) goto L_0x0096
            r0 = 2
            if (r15 == r0) goto L_0x008b
            r0 = 17
            if (r15 == r0) goto L_0x0086
            r0 = 33
            if (r15 == r0) goto L_0x00a1
            r0 = 66
            if (r15 == r0) goto L_0x0081
            r0 = 130(0x82, float:1.82E-43)
            if (r15 != r0) goto L_0x0142
            int r0 = r11.A02
            if (r0 != r6) goto L_0x0142
        L_0x0039:
            r8 = 1
        L_0x003a:
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
            X.0Fk r0 = (X.C02830Fk) r0
            boolean r7 = r0.A01
            X.0SL r4 = r0.A00
            if (r8 != r6) goto L_0x007c
            int r9 = r11.A19()
        L_0x004a:
            r11.A1Q(r14, r9)
            r11.A1K(r8)
            X.0Q2 r1 = r11.A0L
            int r0 = r1.A03
            int r0 = r0 + r9
            r1.A01 = r0
            r5 = 1051372203(0x3eaaaaab, float:0.33333334)
            X.0VA r0 = r11.A07
            int r0 = r0.A07()
            float r0 = (float) r0
            float r0 = r0 * r5
            int r0 = (int) r0
            r1.A00 = r0
            r1.A08 = r6
            r5 = 0
            r1.A07 = r5
            r11.A1C(r1, r13, r14)
            boolean r0 = r11.A0G
            r11.A0D = r0
            if (r7 != 0) goto L_0x00a7
            android.view.View r0 = r4.A05(r9, r8)
            if (r0 == 0) goto L_0x00a7
            if (r0 == r2) goto L_0x00a7
            return r0
        L_0x007c:
            int r9 = r11.A18()
            goto L_0x004a
        L_0x0081:
            int r0 = r11.A02
            if (r0 != 0) goto L_0x0142
            goto L_0x0039
        L_0x0086:
            int r0 = r11.A02
            if (r0 != 0) goto L_0x0142
            goto L_0x00a5
        L_0x008b:
            int r0 = r11.A02
            if (r0 == r6) goto L_0x0039
            boolean r0 = r11.A1T()
            if (r0 == 0) goto L_0x0039
            goto L_0x00a5
        L_0x0096:
            int r0 = r11.A02
            if (r0 == r6) goto L_0x00a5
            boolean r0 = r11.A1T()
            if (r0 == 0) goto L_0x00a5
            goto L_0x0039
        L_0x00a1:
            int r0 = r11.A02
            if (r0 != r6) goto L_0x0142
        L_0x00a5:
            r8 = -1
            goto L_0x003a
        L_0x00a7:
            boolean r0 = r11.A1U(r8)
            if (r0 == 0) goto L_0x00c2
            int r1 = r11.A06
            int r1 = r1 - r6
        L_0x00b0:
            if (r1 < 0) goto L_0x00d7
            X.0SL[] r0 = r11.A0J
            r0 = r0[r1]
            android.view.View r0 = r0.A05(r9, r8)
            if (r0 == 0) goto L_0x00bf
            if (r0 == r2) goto L_0x00bf
            return r0
        L_0x00bf:
            int r1 = r1 + -1
            goto L_0x00b0
        L_0x00c2:
            r1 = 0
        L_0x00c3:
            int r0 = r11.A06
            if (r1 >= r0) goto L_0x00d7
            X.0SL[] r0 = r11.A0J
            r0 = r0[r1]
            android.view.View r0 = r0.A05(r9, r8)
            if (r0 == 0) goto L_0x00d4
            if (r0 == r2) goto L_0x00d4
            return r0
        L_0x00d4:
            int r1 = r1 + 1
            goto L_0x00c3
        L_0x00d7:
            boolean r0 = r11.A0F
            r1 = r0 ^ 1
            r0 = 0
            if (r8 != r3) goto L_0x00df
            r0 = 1
        L_0x00df:
            r3 = 0
            if (r1 != r0) goto L_0x00e3
            r3 = 1
        L_0x00e3:
            if (r7 != 0) goto L_0x00f9
            if (r3 == 0) goto L_0x00f4
            int r0 = r4.A00()
        L_0x00eb:
            android.view.View r0 = r11.A0B(r0)
            if (r0 == 0) goto L_0x00f9
            if (r0 == r2) goto L_0x00f9
            return r0
        L_0x00f4:
            int r0 = r4.A01()
            goto L_0x00eb
        L_0x00f9:
            boolean r0 = r11.A1U(r8)
            if (r0 == 0) goto L_0x0123
            int r1 = r11.A06
            int r1 = r1 - r6
        L_0x0102:
            if (r1 < 0) goto L_0x0142
            int r0 = r4.A04
            if (r1 == r0) goto L_0x0120
            X.0SL[] r0 = r11.A0J
            r0 = r0[r1]
            if (r3 == 0) goto L_0x011b
            int r0 = r0.A00()
        L_0x0112:
            android.view.View r0 = r11.A0B(r0)
            if (r0 == 0) goto L_0x0120
            if (r0 == r2) goto L_0x0120
            return r0
        L_0x011b:
            int r0 = r0.A01()
            goto L_0x0112
        L_0x0120:
            int r1 = r1 + -1
            goto L_0x0102
        L_0x0123:
            int r0 = r11.A06
            if (r5 >= r0) goto L_0x0142
            X.0SL[] r0 = r11.A0J
            r0 = r0[r5]
            if (r3 == 0) goto L_0x013d
            int r0 = r0.A00()
        L_0x0131:
            android.view.View r0 = r11.A0B(r0)
            if (r0 == 0) goto L_0x013a
            if (r0 == r2) goto L_0x013a
            return r0
        L_0x013a:
            int r5 = r5 + 1
            goto L_0x0123
        L_0x013d:
            int r0 = r0.A01()
            goto L_0x0131
        L_0x0142:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.A0g(android.view.View, X.0SJ, X.0Ri, int):android.view.View");
    }

    public AnonymousClass0Bp A0h() {
        C02830Fk r0;
        if (this.A02 == 0) {
            return r0;
        }
        r0 = new C02830Fk(-1, -2);
        return r0;
    }

    public AnonymousClass0Bp A0i(Context context, AttributeSet attributeSet) {
        return new C02830Fk(context, attributeSet);
    }

    public AnonymousClass0Bp A0j(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C02830Fk((ViewGroup.MarginLayoutParams) layoutParams) : new C02830Fk(layoutParams);
    }

    public void A0k(int i2) {
        super.A0k(i2);
        for (int i3 = 0; i3 < this.A06; i3++) {
            AnonymousClass0SL r2 = this.A0J[i3];
            int i4 = r2.A01;
            if (i4 != Integer.MIN_VALUE) {
                r2.A01 = i4 + i2;
            }
            int i5 = r2.A00;
            if (i5 != Integer.MIN_VALUE) {
                r2.A00 = i5 + i2;
            }
        }
    }

    public void A0l(int i2) {
        super.A0l(i2);
        for (int i3 = 0; i3 < this.A06; i3++) {
            AnonymousClass0SL r2 = this.A0J[i3];
            int i4 = r2.A01;
            if (i4 != Integer.MIN_VALUE) {
                r2.A01 = i4 + i2;
            }
            int i5 = r2.A00;
            if (i5 != Integer.MIN_VALUE) {
                r2.A00 = i5 + i2;
            }
        }
    }

    public void A0m(int i2) {
        if (i2 == 0) {
            A1S();
        }
    }

    public void A0n(int i2) {
        AnonymousClass0YJ r1 = this.A0A;
        if (!(r1 == null || r1.A00 == i2)) {
            r1.A09 = null;
            r1.A02 = 0;
            r1.A00 = -1;
            r1.A03 = -1;
        }
        this.A03 = i2;
        this.A04 = Integer.MIN_VALUE;
        A0D();
    }

    public void A0o(Rect rect, int i2, int i3) {
        int A002;
        int A003;
        int A082 = A08() + A09();
        int A0A2 = A0A() + A07();
        if (this.A02 == 1) {
            A003 = AnonymousClass02W.A00(i3, rect.height() + A0A2, this.A07.getMinimumHeight());
            A002 = AnonymousClass02W.A00(i2, (this.A05 * this.A06) + A082, this.A07.getMinimumWidth());
        } else {
            A002 = AnonymousClass02W.A00(i2, rect.width() + A082, this.A07.getMinimumWidth());
            A003 = AnonymousClass02W.A00(i3, (this.A05 * this.A06) + A0A2, this.A07.getMinimumHeight());
        }
        this.A07.setMeasuredDimension(A002, A003);
    }

    public void A0p(Parcelable parcelable) {
        if (parcelable instanceof AnonymousClass0YJ) {
            this.A0A = (AnonymousClass0YJ) parcelable;
            A0D();
        }
    }

    public void A0q(View view, AnonymousClass031 r10, AnonymousClass0SJ r11, AnonymousClass0Ri r12) {
        AnonymousClass0WL A012;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C02830Fk)) {
            super.A0J(view, r10);
            return;
        }
        C02830Fk r1 = (C02830Fk) layoutParams;
        if (this.A02 == 0) {
            AnonymousClass0SL r0 = r1.A00;
            int i2 = r0 == null ? -1 : r0.A04;
            boolean z2 = r1.A01;
            A012 = AnonymousClass0WL.A01(i2, z2 ? this.A06 : 1, -1, -1, z2, false);
        } else {
            AnonymousClass0SL r02 = r1.A00;
            int i3 = r02 == null ? -1 : r02.A04;
            boolean z3 = r1.A01;
            A012 = AnonymousClass0WL.A01(-1, -1, i3, z3 ? this.A06 : 1, z3, false);
        }
        r10.A0J(A012);
    }

    public void A0r(AccessibilityEvent accessibilityEvent) {
        super.A0r(accessibilityEvent);
        if (A05() > 0) {
            View A1H = A1H(false);
            View A1G = A1G(false);
            if (A1H != null && A1G != null) {
                int A022 = AnonymousClass02W.A02(A1H);
                int A023 = AnonymousClass02W.A02(A1G);
                if (A022 < A023) {
                    accessibilityEvent.setFromIndex(A022);
                    accessibilityEvent.setToIndex(A023);
                    return;
                }
                accessibilityEvent.setFromIndex(A023);
                accessibilityEvent.setToIndex(A022);
            }
        }
    }

    public void A0s(C12490kU r7, AnonymousClass0Ri r8, int i2, int i3) {
        int A022;
        int i4;
        if (this.A02 != 0) {
            i2 = i3;
        }
        if (A05() != 0 && i2 != 0) {
            A1P(r8, i2);
            int[] iArr = this.A0I;
            if (iArr == null || iArr.length < this.A06) {
                this.A0I = new int[this.A06];
            }
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < this.A06; i7++) {
                AnonymousClass0Q2 r5 = this.A0L;
                if (r5.A03 == -1) {
                    A022 = r5.A05;
                    i4 = this.A0J[i7].A03(A022);
                } else {
                    A022 = this.A0J[i7].A02(r5.A02);
                    i4 = r5.A02;
                }
                int i8 = A022 - i4;
                if (i8 >= 0) {
                    this.A0I[i6] = i8;
                    i6++;
                }
            }
            Arrays.sort(this.A0I, 0, i6);
            while (i5 < i6) {
                AnonymousClass0Q2 r2 = this.A0L;
                int i9 = r2.A01;
                if (i9 >= 0 && i9 < r8.A00()) {
                    r7.A4h(i9, this.A0I[i5]);
                    r2.A01 += r2.A03;
                    i5++;
                } else {
                    return;
                }
            }
        }
    }

    public void A0t(AnonymousClass0SJ r2, AnonymousClass0Ri r3) {
        A1O(r2, r3, true);
    }

    public void A0u(AnonymousClass0SJ r3, RecyclerView recyclerView) {
        Runnable runnable = this.A0N;
        RecyclerView recyclerView2 = this.A07;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(runnable);
        }
        for (int i2 = 0; i2 < this.A06; i2++) {
            this.A0J[i2].A08();
        }
        recyclerView.requestLayout();
    }

    public void A0v(AnonymousClass0Ri r2) {
        this.A03 = -1;
        this.A04 = Integer.MIN_VALUE;
        this.A0A = null;
        this.A0M.A00();
    }

    public void A0w(AnonymousClass0Ri r3, RecyclerView recyclerView, int i2) {
        AnonymousClass0Fo r0 = new AnonymousClass0Fo(recyclerView.getContext());
        r0.A00 = i2;
        A0Q(r0);
    }

    public void A0x(RecyclerView recyclerView) {
        AnonymousClass0S8 r2 = this.A09;
        int[] iArr = r2.A01;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        r2.A00 = null;
        A0D();
    }

    public void A0y(RecyclerView recyclerView, int i2, int i3) {
        A1L(i2, i3, 1);
    }

    public void A0z(RecyclerView recyclerView, int i2, int i3) {
        A1L(i2, i3, 2);
    }

    public void A10(RecyclerView recyclerView, int i2, int i3, int i4) {
        A1L(i2, i3, 8);
    }

    public void A11(RecyclerView recyclerView, Object obj, int i2, int i3) {
        A1L(i2, i3, 4);
    }

    public void A12(String str) {
        if (this.A0A == null) {
            super.A12(str);
        }
    }

    public boolean A13() {
        return this.A02 == 0;
    }

    public boolean A14() {
        return this.A02 == 1;
    }

    public boolean A15() {
        return this.A01 != 0;
    }

    public boolean A16() {
        return this.A0A == null;
    }

    public boolean A17(AnonymousClass0Bp r2) {
        return r2 instanceof C02830Fk;
    }

    public int A18() {
        if (A05() != 0) {
            return AnonymousClass02W.A02(A0C(0));
        }
        return 0;
    }

    public int A19() {
        int A052 = A05();
        if (A052 == 0) {
            return 0;
        }
        return AnonymousClass02W.A02(A0C(A052 - 1));
    }

    public final int A1A(int i2) {
        int A022 = this.A0J[0].A02(i2);
        for (int i3 = 1; i3 < this.A06; i3++) {
            int A023 = this.A0J[i3].A02(i2);
            if (A023 > A022) {
                A022 = A023;
            }
        }
        return A022;
    }

    public final int A1B(int i2) {
        int A032 = this.A0J[0].A03(i2);
        for (int i3 = 1; i3 < this.A06; i3++) {
            int A033 = this.A0J[i3].A03(i2);
            if (A033 < A032) {
                A032 = A033;
            }
        }
        return A032;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0063, code lost:
        if (r2 >= r28.A00()) goto L_0x0065;
     */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x01f0  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0206  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0225  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x024a  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x0265  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x0289  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x02a5  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x02ab  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x0368  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x01c6 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01a3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A1C(X.AnonymousClass0Q2 r26, X.AnonymousClass0SJ r27, X.AnonymousClass0Ri r28) {
        /*
            r25 = this;
            r6 = r25
            java.util.BitSet r1 = r6.A0B
            int r0 = r6.A06
            r5 = 0
            r8 = 1
            r1.set(r5, r0, r8)
            X.0Q2 r0 = r6.A0L
            r23 = r0
            boolean r0 = r0.A06
            r7 = r26
            int r2 = r7.A04
            if (r0 == 0) goto L_0x0039
            r20 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 != r8) goto L_0x001e
            r20 = 2147483647(0x7fffffff, float:NaN)
        L_0x001e:
            r3 = 0
        L_0x001f:
            int r0 = r6.A06
            if (r3 >= r0) goto L_0x004d
            X.0SL[] r1 = r6.A0J
            r0 = r1[r3]
            java.util.ArrayList r0 = r0.A03
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0036
            r1 = r1[r3]
            r0 = r20
            r6.A1R(r1, r2, r0)
        L_0x0036:
            int r3 = r3 + 1
            goto L_0x001f
        L_0x0039:
            if (r2 != r8) goto L_0x0044
            int r0 = r7.A02
            r20 = r0
            int r0 = r7.A00
            int r20 = r20 + r0
            goto L_0x001e
        L_0x0044:
            int r0 = r7.A05
            r20 = r0
            int r0 = r7.A00
            int r20 = r20 - r0
            goto L_0x001e
        L_0x004d:
            boolean r1 = r6.A0G
            X.0VA r0 = r6.A07
            r22 = r0
            if (r1 == 0) goto L_0x0360
            int r19 = r22.A02()
        L_0x0059:
            r3 = 0
        L_0x005a:
            int r2 = r7.A01
            if (r2 < 0) goto L_0x0065
            int r1 = r28.A00()
            r0 = 1
            if (r2 < r1) goto L_0x0066
        L_0x0065:
            r0 = 0
        L_0x0066:
            r4 = -1
            r24 = r27
            if (r0 == 0) goto L_0x0366
            r0 = r23
            boolean r0 = r0.A06
            if (r0 != 0) goto L_0x0079
            java.util.BitSet r0 = r6.A0B
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0366
        L_0x0079:
            int r3 = r7.A01
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r2 = r24
            X.02k r0 = r2.A01(r3, r0)
            android.view.View r10 = r0.A0H
            int r1 = r7.A01
            int r0 = r7.A03
            int r1 = r1 + r0
            r7.A01 = r1
            android.view.ViewGroup$LayoutParams r9 = r10.getLayoutParams()
            X.0Fk r9 = (X.C02830Fk) r9
            int r3 = r9.A01()
            X.0S8 r2 = r6.A09
            int[] r1 = r2.A01
            if (r1 == 0) goto L_0x02fd
            int r0 = r1.length
            if (r3 >= r0) goto L_0x02fd
            r1 = r1[r3]
            if (r1 == r4) goto L_0x02fd
            r18 = 0
            X.0SL[] r0 = r6.A0J
            r1 = r0[r1]
        L_0x00ac:
            r9.A00 = r1
            int r0 = r7.A04
            if (r0 != r8) goto L_0x02f8
            r6.A0H(r10, r4, r5)
        L_0x00b5:
            boolean r11 = r9.A01
            int r0 = r6.A02
            r21 = r0
            if (r11 == 0) goto L_0x02cb
            if (r0 != r8) goto L_0x02b1
            int r13 = r6.A00
        L_0x00c1:
            int r14 = r6.A00
            int r12 = r6.A01
            int r11 = r6.A0A()
            int r0 = r6.A07()
            int r11 = r11 + r0
            int r0 = r9.height
            int r0 = X.AnonymousClass02W.A01(r14, r12, r11, r0, r8)
        L_0x00d4:
            r6.A1M(r10, r13, r0)
        L_0x00d7:
            int r11 = r7.A04
            boolean r0 = r9.A01
            if (r11 != r8) goto L_0x011e
            if (r0 == 0) goto L_0x0117
            r0 = r19
            int r14 = r6.A1A(r0)
        L_0x00e5:
            r0 = r22
            int r13 = r0.A09(r10)
            int r13 = r13 + r14
            if (r18 == 0) goto L_0x0199
            boolean r0 = r9.A01
            if (r0 == 0) goto L_0x0199
            X.0YE r12 = new X.0YE
            r12.<init>()
            int r0 = r6.A06
            int[] r0 = new int[r0]
            r12.A03 = r0
            r11 = 0
        L_0x00fe:
            int r0 = r6.A06
            if (r11 >= r0) goto L_0x0114
            int[] r0 = r12.A03
            r15 = r0
            X.0SL[] r0 = r6.A0J
            r0 = r0[r11]
            int r0 = r0.A02(r14)
            int r0 = r14 - r0
            r15[r11] = r0
            int r11 = r11 + 1
            goto L_0x00fe
        L_0x0114:
            r12.A00 = r4
            goto L_0x015e
        L_0x0117:
            r0 = r19
            int r14 = r1.A02(r0)
            goto L_0x00e5
        L_0x011e:
            if (r0 == 0) goto L_0x0155
            r0 = r19
            int r13 = r6.A1B(r0)
        L_0x0126:
            r0 = r22
            int r0 = r0.A09(r10)
            int r14 = r13 - r0
            if (r18 == 0) goto L_0x0199
            boolean r0 = r9.A01
            if (r0 == 0) goto L_0x0199
            X.0YE r12 = new X.0YE
            r12.<init>()
            int r0 = r6.A06
            int[] r0 = new int[r0]
            r12.A03 = r0
            r11 = 0
        L_0x0140:
            int r0 = r6.A06
            if (r11 >= r0) goto L_0x015c
            int[] r0 = r12.A03
            r15 = r0
            X.0SL[] r0 = r6.A0J
            r0 = r0[r11]
            int r0 = r0.A03(r13)
            int r0 = r0 - r13
            r15[r11] = r0
            int r11 = r11 + 1
            goto L_0x0140
        L_0x0155:
            r0 = r19
            int r13 = r1.A03(r0)
            goto L_0x0126
        L_0x015c:
            r12.A00 = r8
        L_0x015e:
            r12.A01 = r3
            java.util.List r0 = r2.A00
            if (r0 != 0) goto L_0x016b
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.A00 = r0
        L_0x016b:
            int r17 = r0.size()
            r11 = 0
        L_0x0170:
            r0 = r17
            java.util.List r15 = r2.A00
            if (r11 >= r0) goto L_0x01c6
            java.lang.Object r16 = r15.get(r11)
            r0 = r16
            X.0YE r0 = (X.AnonymousClass0YE) r0
            r16 = r0
            int r0 = r0.A01
            r15 = r0
            int r0 = r12.A01
            if (r15 != r0) goto L_0x018c
            java.util.List r0 = r2.A00
            r0.remove(r11)
        L_0x018c:
            r0 = r16
            int r0 = r0.A01
            int r15 = r12.A01
            if (r0 < r15) goto L_0x01c3
            java.util.List r0 = r2.A00
            r0.add(r11, r12)
        L_0x0199:
            boolean r0 = r9.A01
            if (r0 == 0) goto L_0x01ea
            int r0 = r7.A03
            if (r0 != r4) goto L_0x01ea
            if (r18 != 0) goto L_0x01e8
            int r4 = r7.A04
            X.0SL[] r0 = r6.A0J
            r0 = r0[r5]
            r12 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r4 != r8) goto L_0x01ca
            int r11 = r0.A02(r12)
            r4 = 1
        L_0x01b2:
            int r0 = r6.A06
            if (r4 >= r0) goto L_0x01ea
            X.0SL[] r0 = r6.A0J
            r0 = r0[r4]
            int r0 = r0.A02(r12)
            if (r0 != r11) goto L_0x01e0
            int r4 = r4 + 1
            goto L_0x01b2
        L_0x01c3:
            int r11 = r11 + 1
            goto L_0x0170
        L_0x01c6:
            r15.add(r12)
            goto L_0x0199
        L_0x01ca:
            int r11 = r0.A03(r12)
            r4 = 1
        L_0x01cf:
            int r0 = r6.A06
            if (r4 >= r0) goto L_0x01ea
            X.0SL[] r0 = r6.A0J
            r0 = r0[r4]
            int r0 = r0.A03(r12)
            if (r0 != r11) goto L_0x01e0
            int r4 = r4 + 1
            goto L_0x01cf
        L_0x01e0:
            X.0YE r0 = r2.A00(r3)
            if (r0 == 0) goto L_0x01e8
            r0.A02 = r8
        L_0x01e8:
            r6.A0C = r8
        L_0x01ea:
            int r2 = r7.A04
            boolean r0 = r9.A01
            if (r2 != r8) goto L_0x0206
            if (r0 == 0) goto L_0x0200
            int r2 = r6.A06
        L_0x01f4:
            int r2 = r2 + -1
            if (r2 < 0) goto L_0x021b
            X.0SL[] r0 = r6.A0J
            r0 = r0[r2]
            r0.A0B(r10)
            goto L_0x01f4
        L_0x0200:
            X.0SL r0 = r9.A00
            r0.A0B(r10)
            goto L_0x021b
        L_0x0206:
            if (r0 == 0) goto L_0x0216
            int r2 = r6.A06
        L_0x020a:
            int r2 = r2 + -1
            if (r2 < 0) goto L_0x021b
            X.0SL[] r0 = r6.A0J
            r0 = r0[r2]
            r0.A0C(r10)
            goto L_0x020a
        L_0x0216:
            X.0SL r0 = r9.A00
            r0.A0C(r10)
        L_0x021b:
            boolean r0 = r6.A1T()
            if (r0 == 0) goto L_0x0265
            r0 = r21
            if (r0 != r8) goto L_0x0265
            boolean r0 = r9.A01
            X.0VA r4 = r6.A08
            int r3 = r4.A02()
            if (r0 != 0) goto L_0x0239
            int r2 = r6.A06
            int r2 = r2 - r8
            int r0 = r1.A04
            int r2 = r2 - r0
            int r0 = r6.A05
            int r2 = r2 * r0
            int r3 = r3 - r2
        L_0x0239:
            int r0 = r4.A09(r10)
            int r2 = r3 - r0
        L_0x023f:
            X.AnonymousClass02W.A03(r10, r2, r14, r3, r13)
        L_0x0242:
            boolean r2 = r9.A01
            r0 = r23
            int r3 = r0.A04
            if (r2 == 0) goto L_0x0289
            r4 = 0
        L_0x024b:
            int r0 = r6.A06
            if (r4 >= r0) goto L_0x028e
            X.0SL[] r2 = r6.A0J
            r0 = r2[r4]
            java.util.ArrayList r0 = r0.A03
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0262
            r2 = r2[r4]
            r0 = r20
            r6.A1R(r2, r3, r0)
        L_0x0262:
            int r4 = r4 + 1
            goto L_0x024b
        L_0x0265:
            boolean r0 = r9.A01
            if (r0 == 0) goto L_0x027c
            X.0VA r3 = r6.A08
            int r2 = r3.A06()
        L_0x026f:
            int r3 = r3.A09(r10)
            int r3 = r3 + r2
            r0 = r21
            if (r0 == r8) goto L_0x023f
            X.AnonymousClass02W.A03(r10, r14, r2, r13, r3)
            goto L_0x0242
        L_0x027c:
            int r2 = r1.A04
            int r0 = r6.A05
            int r2 = r2 * r0
            X.0VA r3 = r6.A08
            int r0 = r3.A06()
            int r2 = r2 + r0
            goto L_0x026f
        L_0x0289:
            r0 = r20
            r6.A1R(r1, r3, r0)
        L_0x028e:
            r2 = r24
            r0 = r23
            r6.A1N(r0, r2)
            boolean r0 = r0.A08
            if (r0 == 0) goto L_0x02a8
            boolean r0 = r10.hasFocusable()
            if (r0 == 0) goto L_0x02a8
            boolean r0 = r9.A01
            java.util.BitSet r2 = r6.A0B
            if (r0 == 0) goto L_0x02ab
            r2.clear()
        L_0x02a8:
            r3 = 1
            goto L_0x005a
        L_0x02ab:
            int r0 = r1.A04
            r2.set(r0, r5)
            goto L_0x02a8
        L_0x02b1:
            int r13 = r6.A03
            int r12 = r6.A04
            int r11 = r6.A08()
            int r0 = r6.A09()
            int r11 = r11 + r0
            int r0 = r9.width
            int r11 = X.AnonymousClass02W.A01(r13, r12, r11, r0, r8)
            int r0 = r6.A00
            r6.A1M(r10, r11, r0)
            goto L_0x00d7
        L_0x02cb:
            if (r0 != r8) goto L_0x02d9
            int r12 = r6.A05
            int r11 = r6.A04
            int r0 = r9.width
            int r13 = X.AnonymousClass02W.A01(r12, r11, r5, r0, r5)
            goto L_0x00c1
        L_0x02d9:
            int r13 = r6.A03
            int r12 = r6.A04
            int r11 = r6.A08()
            int r0 = r6.A09()
            int r11 = r11 + r0
            int r0 = r9.width
            int r13 = X.AnonymousClass02W.A01(r13, r12, r11, r0, r8)
            int r12 = r6.A05
            int r11 = r6.A01
            int r0 = r9.height
            int r0 = X.AnonymousClass02W.A01(r12, r11, r5, r0, r5)
            goto L_0x00d4
        L_0x02f8:
            r6.A0H(r10, r5, r5)
            goto L_0x00b5
        L_0x02fd:
            r18 = 1
            boolean r0 = r9.A01
            if (r0 == 0) goto L_0x0312
            X.0SL[] r0 = r6.A0J
            r1 = r0[r5]
        L_0x0307:
            r2.A01(r3)
            int[] r11 = r2.A01
            int r0 = r1.A04
            r11[r3] = r0
            goto L_0x00ac
        L_0x0312:
            int r0 = r7.A04
            boolean r0 = r6.A1U(r0)
            r14 = -1
            if (r0 == 0) goto L_0x0340
            int r13 = r6.A06
            int r13 = r13 - r8
            r17 = -1
        L_0x0320:
            int r0 = r7.A04
            r1 = 0
            if (r0 != r8) goto L_0x0346
            r16 = 2147483647(0x7fffffff, float:NaN)
            int r15 = r22.A06()
        L_0x032c:
            if (r13 == r14) goto L_0x0307
            X.0SL[] r0 = r6.A0J
            r12 = r0[r13]
            int r11 = r12.A02(r15)
            r0 = r16
            if (r11 >= r0) goto L_0x033d
            r1 = r12
            r16 = r11
        L_0x033d:
            int r13 = r13 + r17
            goto L_0x032c
        L_0x0340:
            r13 = 0
            int r14 = r6.A06
            r17 = 1
            goto L_0x0320
        L_0x0346:
            r16 = -2147483648(0xffffffff80000000, float:-0.0)
            int r15 = r22.A02()
        L_0x034c:
            if (r13 == r14) goto L_0x0307
            X.0SL[] r0 = r6.A0J
            r12 = r0[r13]
            int r11 = r12.A03(r15)
            r0 = r16
            if (r11 <= r0) goto L_0x035d
            r1 = r12
            r16 = r11
        L_0x035d:
            int r13 = r13 + r17
            goto L_0x034c
        L_0x0360:
            int r19 = r22.A06()
            goto L_0x0059
        L_0x0366:
            if (r3 != 0) goto L_0x036f
            r1 = r23
            r0 = r24
            r6.A1N(r1, r0)
        L_0x036f:
            r0 = r23
            int r0 = r0.A04
            if (r0 != r4) goto L_0x038b
            int r0 = r22.A06()
            int r0 = r6.A1B(r0)
            int r1 = r22.A06()
        L_0x0381:
            int r1 = r1 - r0
            if (r1 <= 0) goto L_0x038a
            int r0 = r7.A00
            int r5 = java.lang.Math.min(r0, r1)
        L_0x038a:
            return r5
        L_0x038b:
            int r0 = r22.A02()
            int r1 = r6.A1A(r0)
            int r0 = r22.A02()
            goto L_0x0381
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.A1C(X.0Q2, X.0SJ, X.0Ri):int");
    }

    public int A1D(AnonymousClass0SJ r5, AnonymousClass0Ri r6, int i2) {
        if (A05() == 0 || i2 == 0) {
            return 0;
        }
        A1P(r6, i2);
        AnonymousClass0Q2 r2 = this.A0L;
        int A1C = A1C(r2, r5, r6);
        if (r2.A00 >= A1C) {
            int i3 = i2;
            i2 = A1C;
            if (i3 < 0) {
                i2 = -A1C;
            }
        }
        this.A07.A0E(-i2);
        this.A0D = this.A0G;
        r2.A00 = 0;
        A1N(r2, r5);
        return i2;
    }

    public final int A1E(AnonymousClass0Ri r9) {
        if (A05() == 0) {
            return 0;
        }
        AnonymousClass0VA r3 = this.A07;
        boolean z2 = this.A0H;
        boolean z3 = !z2;
        return AnonymousClass0VZ.A02(A1H(z3), A1G(z3), r3, this, r9, z2, this.A0G);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001b, code lost:
        if (A1T() == false) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View A1F() {
        /*
            r11 = this;
            int r6 = r11.A05()
            r2 = 1
            int r6 = r6 - r2
            int r1 = r11.A06
            java.util.BitSet r5 = new java.util.BitSet
            r5.<init>(r1)
            r0 = 0
            r5.set(r0, r1, r2)
            int r0 = r11.A02
            r10 = -1
            if (r0 != r2) goto L_0x001d
            boolean r0 = r11.A1T()
            r9 = 1
            if (r0 != 0) goto L_0x001e
        L_0x001d:
            r9 = -1
        L_0x001e:
            boolean r0 = r11.A0G
            r4 = -1
            if (r0 != 0) goto L_0x0026
            int r4 = r6 + 1
            r6 = 0
        L_0x0026:
            if (r6 >= r4) goto L_0x0029
            r10 = 1
        L_0x0029:
            if (r6 == r4) goto L_0x00d8
            android.view.View r3 = r11.A0C(r6)
            android.view.ViewGroup$LayoutParams r7 = r3.getLayoutParams()
            X.0Fk r7 = (X.C02830Fk) r7
            X.0SL r0 = r7.A00
            int r0 = r0.A04
            boolean r0 = r5.get(r0)
            if (r0 == 0) goto L_0x0091
            X.0SL r8 = r7.A00
            boolean r0 = r11.A0G
            r2 = 0
            if (r0 == 0) goto L_0x0074
            int r1 = r8.A00
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 != r0) goto L_0x0051
            r8.A06()
            int r1 = r8.A00
        L_0x0051:
            X.0VA r0 = r11.A07
            int r0 = r0.A02()
            if (r1 >= r0) goto L_0x008a
            java.util.ArrayList r1 = r8.A03
            int r0 = r1.size()
            int r2 = r0 + -1
        L_0x0061:
            java.lang.Object r0 = r1.get(r2)
            android.view.View r0 = (android.view.View) r0
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            X.0Fk r0 = (X.C02830Fk) r0
            boolean r0 = r0.A01
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x008a
            return r3
        L_0x0074:
            int r1 = r8.A01
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 != r0) goto L_0x007f
            r8.A07()
            int r1 = r8.A01
        L_0x007f:
            X.0VA r0 = r11.A07
            int r0 = r0.A06()
            if (r1 <= r0) goto L_0x008a
            java.util.ArrayList r1 = r8.A03
            goto L_0x0061
        L_0x008a:
            X.0SL r0 = r7.A00
            int r0 = r0.A04
            r5.clear(r0)
        L_0x0091:
            boolean r0 = r7.A01
            if (r0 != 0) goto L_0x00d5
            int r0 = r6 + r10
            if (r0 == r4) goto L_0x00d5
            android.view.View r2 = r11.A0C(r0)
            boolean r1 = r11.A0G
            X.0VA r0 = r11.A07
            if (r1 == 0) goto L_0x00ae
            int r1 = r0.A08(r3)
            int r0 = r0.A08(r2)
            if (r1 >= r0) goto L_0x00b9
            return r3
        L_0x00ae:
            int r1 = r0.A0B(r3)
            int r0 = r0.A0B(r2)
            if (r1 <= r0) goto L_0x00b9
            return r3
        L_0x00b9:
            if (r1 != r0) goto L_0x00d5
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            X.0Fk r1 = (X.C02830Fk) r1
            X.0SL r0 = r7.A00
            int r2 = r0.A04
            X.0SL r0 = r1.A00
            int r0 = r0.A04
            int r2 = r2 - r0
            r1 = 0
            if (r2 >= 0) goto L_0x00ce
            r1 = 1
        L_0x00ce:
            r0 = 0
            if (r9 >= 0) goto L_0x00d2
            r0 = 1
        L_0x00d2:
            if (r1 == r0) goto L_0x00d5
            return r3
        L_0x00d5:
            int r6 = r6 + r10
            goto L_0x0029
        L_0x00d8:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.A1F():android.view.View");
    }

    public View A1G(boolean z2) {
        AnonymousClass0VA r7 = this.A07;
        int A062 = r7.A06();
        int A022 = r7.A02();
        View view = null;
        for (int A052 = A05() - 1; A052 >= 0; A052--) {
            View A0C2 = A0C(A052);
            int A0B2 = r7.A0B(A0C2);
            int A082 = r7.A08(A0C2);
            if (A082 > A062 && A0B2 < A022) {
                if (A082 <= A022 || !z2) {
                    return A0C2;
                }
                if (view == null) {
                    view = A0C2;
                }
            }
        }
        return view;
    }

    public View A1H(boolean z2) {
        AnonymousClass0VA r8 = this.A07;
        int A062 = r8.A06();
        int A022 = r8.A02();
        int A052 = A05();
        View view = null;
        for (int i2 = 0; i2 < A052; i2++) {
            View A0C2 = A0C(i2);
            int A0B2 = r8.A0B(A0C2);
            if (r8.A08(A0C2) > A062 && A0B2 < A022) {
                if (A0B2 >= A062 || !z2) {
                    return A0C2;
                }
                if (view == null) {
                    view = A0C2;
                }
            }
        }
        return view;
    }

    public final void A1I() {
        this.A0G = (this.A02 == 1 || !A1T()) ? this.A0F : !this.A0F;
    }

    public void A1J(int i2) {
        A12((String) null);
        if (i2 != this.A06) {
            AnonymousClass0S8 r2 = this.A09;
            int[] iArr = r2.A01;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            r2.A00 = null;
            A0D();
            this.A06 = i2;
            this.A0B = new BitSet(i2);
            AnonymousClass0SL[] r22 = new AnonymousClass0SL[i2];
            this.A0J = r22;
            for (int i3 = 0; i3 < i2; i3++) {
                r22[i3] = new AnonymousClass0SL(this, i3);
            }
            A0D();
        }
    }

    public final void A1K(int i2) {
        AnonymousClass0Q2 r4 = this.A0L;
        r4.A04 = i2;
        boolean z2 = this.A0G;
        int i3 = 1;
        boolean z3 = false;
        if (i2 == -1) {
            z3 = true;
        }
        if (z2 != z3) {
            i3 = -1;
        }
        r4.A03 = i3;
    }

    public final void A1L(int i2, int i3, int i4) {
        int i5;
        int i6;
        int A19 = this.A0G ? A19() : A18();
        if (i4 == 8) {
            i5 = i3 + 1;
            if (i2 >= i3) {
                i5 = i2 + 1;
                i6 = i3;
            }
            i6 = i2;
        } else {
            i5 = i2 + i3;
            i6 = i2;
        }
        AnonymousClass0S8 r2 = this.A09;
        r2.A03(i6);
        if (i4 == 1) {
            r2.A04(i2, i3);
        } else if (i4 == 2) {
            r2.A05(i2, i3);
        } else if (i4 == 8) {
            r2.A05(i2, 1);
            r2.A04(i3, 1);
        }
        if (i5 > A19) {
            if (i6 <= (this.A0G ? A18() : A19())) {
                A0D();
            }
        }
    }

    public final void A1M(View view, int i2, int i3) {
        Rect rect = this.A0K;
        A0I(view, rect);
        AnonymousClass0Bp r4 = (AnonymousClass0Bp) view.getLayoutParams();
        int A052 = A05(i2, r4.leftMargin + rect.left, r4.rightMargin + rect.right);
        int A053 = A05(i3, r4.topMargin + rect.top, r4.bottomMargin + rect.bottom);
        if (A0U(view, r4, A052, A053)) {
            view.measure(A052, A053);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000f, code lost:
        if (r0 == -1) goto L_0x0011;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x001b  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00cf  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A1N(X.AnonymousClass0Q2 r8, X.AnonymousClass0SJ r9) {
        /*
            r7 = this;
            boolean r0 = r8.A07
            if (r0 == 0) goto L_0x0123
            boolean r0 = r8.A06
            if (r0 != 0) goto L_0x0123
            int r2 = r8.A00
            r1 = -1
            int r0 = r8.A04
            if (r2 != 0) goto L_0x006f
            if (r0 != r1) goto L_0x0120
        L_0x0011:
            int r1 = r8.A02
        L_0x0013:
            int r4 = r7.A05()
            r3 = 1
            int r4 = r4 - r3
        L_0x0019:
            if (r4 < 0) goto L_0x0123
            android.view.View r2 = r7.A0C(r4)
            X.0VA r5 = r7.A07
            int r0 = r5.A0B(r2)
            if (r0 < r1) goto L_0x0123
            int r0 = r5.A0D(r2)
            if (r0 < r1) goto L_0x0123
            android.view.ViewGroup$LayoutParams r5 = r2.getLayoutParams()
            X.0Fk r5 = (X.C02830Fk) r5
            boolean r0 = r5.A01
            if (r0 == 0) goto L_0x005a
            r6 = 0
            r5 = 0
        L_0x0039:
            int r0 = r7.A06
            if (r5 >= r0) goto L_0x004c
            X.0SL[] r0 = r7.A0J
            r0 = r0[r5]
            java.util.ArrayList r0 = r0.A03
            int r0 = r0.size()
            if (r0 == r3) goto L_0x0123
            int r5 = r5 + 1
            goto L_0x0039
        L_0x004c:
            int r0 = r7.A06
            if (r6 >= r0) goto L_0x0069
            X.0SL[] r0 = r7.A0J
            r0 = r0[r6]
            r0.A09()
            int r6 = r6 + 1
            goto L_0x004c
        L_0x005a:
            X.0SL r0 = r5.A00
            java.util.ArrayList r0 = r0.A03
            int r0 = r0.size()
            if (r0 == r3) goto L_0x0123
            X.0SL r0 = r5.A00
            r0.A09()
        L_0x0069:
            r7.A0K(r2, r9)
            int r4 = r4 + -1
            goto L_0x0019
        L_0x006f:
            if (r0 != r1) goto L_0x009d
            int r3 = r8.A05
            X.0SL[] r1 = r7.A0J
            r0 = 0
            r0 = r1[r0]
            int r2 = r0.A03(r3)
            r1 = 1
        L_0x007d:
            int r0 = r7.A06
            if (r1 >= r0) goto L_0x008f
            X.0SL[] r0 = r7.A0J
            r0 = r0[r1]
            int r0 = r0.A03(r3)
            if (r0 <= r2) goto L_0x008c
            r2 = r0
        L_0x008c:
            int r1 = r1 + 1
            goto L_0x007d
        L_0x008f:
            int r3 = r3 - r2
            if (r3 < 0) goto L_0x0011
            int r1 = r8.A02
            int r0 = r8.A00
            int r0 = java.lang.Math.min(r3, r0)
            int r1 = r1 - r0
            goto L_0x0013
        L_0x009d:
            int r3 = r8.A02
            X.0SL[] r1 = r7.A0J
            r0 = 0
            r0 = r1[r0]
            int r2 = r0.A02(r3)
            r1 = 1
        L_0x00a9:
            int r0 = r7.A06
            if (r1 >= r0) goto L_0x00bb
            X.0SL[] r0 = r7.A0J
            r0 = r0[r1]
            int r0 = r0.A02(r3)
            if (r0 >= r2) goto L_0x00b8
            r2 = r0
        L_0x00b8:
            int r1 = r1 + 1
            goto L_0x00a9
        L_0x00bb:
            int r0 = r8.A02
            int r2 = r2 - r0
            if (r2 < 0) goto L_0x0120
            int r1 = r8.A05
            int r0 = r8.A00
            int r0 = java.lang.Math.min(r2, r0)
            int r0 = r0 + r1
        L_0x00c9:
            int r1 = r7.A05()
            if (r1 <= 0) goto L_0x0123
            r5 = 0
            android.view.View r3 = r7.A0C(r5)
            X.0VA r2 = r7.A07
            int r1 = r2.A08(r3)
            if (r1 > r0) goto L_0x0123
            int r1 = r2.A0C(r3)
            if (r1 > r0) goto L_0x0123
            android.view.ViewGroup$LayoutParams r2 = r3.getLayoutParams()
            X.0Fk r2 = (X.C02830Fk) r2
            boolean r1 = r2.A01
            r4 = 1
            if (r1 == 0) goto L_0x010f
            r2 = 0
        L_0x00ee:
            int r1 = r7.A06
            if (r2 >= r1) goto L_0x0101
            X.0SL[] r1 = r7.A0J
            r1 = r1[r2]
            java.util.ArrayList r1 = r1.A03
            int r1 = r1.size()
            if (r1 == r4) goto L_0x0123
            int r2 = r2 + 1
            goto L_0x00ee
        L_0x0101:
            int r1 = r7.A06
            if (r5 >= r1) goto L_0x011c
            X.0SL[] r1 = r7.A0J
            r1 = r1[r5]
            r1.A0A()
            int r5 = r5 + 1
            goto L_0x0101
        L_0x010f:
            X.0SL r2 = r2.A00
            java.util.ArrayList r1 = r2.A03
            int r1 = r1.size()
            if (r1 == r4) goto L_0x0123
            r2.A0A()
        L_0x011c:
            r7.A0K(r3, r9)
            goto L_0x00c9
        L_0x0120:
            int r0 = r8.A05
            goto L_0x00c9
        L_0x0123:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.A1N(X.0Q2, X.0SJ):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0023, code lost:
        if (r2 != null) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x01f0, code lost:
        if (r11.A0G != false) goto L_0x01f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0214, code lost:
        if (r2 != r11.A0G) goto L_0x01f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x03b1, code lost:
        if (A1S() != false) goto L_0x03b3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x022b  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x02cd  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x02e8  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x0316  */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x0354  */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x03aa  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0113  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A1O(X.AnonymousClass0SJ r12, X.AnonymousClass0Ri r13, boolean r14) {
        /*
            r11 = this;
            X.0Py r9 = r11.A0M
            X.0YJ r2 = r11.A0A
            r1 = -1
            if (r2 != 0) goto L_0x000b
            int r0 = r11.A03
            if (r0 == r1) goto L_0x0018
        L_0x000b:
            int r0 = r13.A00()
            if (r0 != 0) goto L_0x0018
            r11.A0N(r12)
            r9.A00()
        L_0x0017:
            return
        L_0x0018:
            boolean r0 = r9.A04
            r8 = 0
            r7 = 1
            if (r0 == 0) goto L_0x0025
            int r0 = r11.A03
            if (r0 != r1) goto L_0x0025
            r10 = 0
            if (r2 == 0) goto L_0x00dd
        L_0x0025:
            r10 = 1
            r9.A00()
            X.0YJ r3 = r11.A0A
            if (r3 == 0) goto L_0x00b1
            int r2 = r3.A02
            if (r2 <= 0) goto L_0x0075
            int r0 = r11.A06
            if (r2 != r0) goto L_0x0066
            r4 = 0
        L_0x0036:
            int r0 = r11.A06
            if (r4 >= r0) goto L_0x0075
            X.0SL[] r0 = r11.A0J
            r0 = r0[r4]
            r0.A08()
            X.0YJ r2 = r11.A0A
            int[] r0 = r2.A09
            r3 = r0[r4]
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 == r0) goto L_0x0056
            boolean r2 = r2.A05
            X.0VA r0 = r11.A07
            if (r2 == 0) goto L_0x0061
            int r0 = r0.A02()
        L_0x0055:
            int r3 = r3 + r0
        L_0x0056:
            X.0SL[] r0 = r11.A0J
            r0 = r0[r4]
            r0.A01 = r3
            r0.A00 = r3
            int r4 = r4 + 1
            goto L_0x0036
        L_0x0061:
            int r0 = r0.A06()
            goto L_0x0055
        L_0x0066:
            r0 = 0
            r3.A09 = r0
            r3.A02 = r8
            r3.A01 = r8
            r3.A08 = r0
            r3.A04 = r0
            int r0 = r3.A03
            r3.A00 = r0
        L_0x0075:
            X.0YJ r2 = r11.A0A
            boolean r0 = r2.A06
            r11.A0E = r0
            boolean r3 = r2.A07
            r0 = 0
            r11.A12(r0)
            X.0YJ r2 = r11.A0A
            if (r2 == 0) goto L_0x008b
            boolean r0 = r2.A07
            if (r0 == r3) goto L_0x008b
            r2.A07 = r3
        L_0x008b:
            r11.A0F = r3
            r11.A0D()
            r11.A1I()
            X.0YJ r3 = r11.A0A
            int r0 = r3.A00
            if (r0 == r1) goto L_0x00ae
            r11.A03 = r0
            boolean r0 = r3.A05
        L_0x009d:
            r9.A03 = r0
            int r0 = r3.A01
            if (r0 <= r7) goto L_0x00b8
            X.0S8 r2 = r11.A09
            int[] r0 = r3.A08
            r2.A01 = r0
            java.util.List r0 = r3.A04
            r2.A00 = r0
            goto L_0x00b8
        L_0x00ae:
            boolean r0 = r11.A0G
            goto L_0x009d
        L_0x00b1:
            r11.A1I()
            boolean r0 = r11.A0G
            r9.A03 = r0
        L_0x00b8:
            boolean r0 = r13.A08
            r3 = 0
            if (r0 != 0) goto L_0x0132
            int r4 = r11.A03
            if (r4 == r1) goto L_0x0132
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r4 < 0) goto L_0x012e
            int r0 = r13.A00()
            if (r4 >= r0) goto L_0x012e
            X.0YJ r2 = r11.A0A
            if (r2 == 0) goto L_0x01a5
            int r0 = r2.A00
            if (r0 == r1) goto L_0x01a5
            int r0 = r2.A02
            if (r0 < r7) goto L_0x01a5
            r9.A00 = r6
            r9.A01 = r4
        L_0x00db:
            r9.A04 = r7
        L_0x00dd:
            X.0YJ r0 = r11.A0A
            if (r0 != 0) goto L_0x0101
            int r0 = r11.A03
            if (r0 != r1) goto L_0x0101
            boolean r2 = r9.A03
            boolean r0 = r11.A0D
            if (r2 != r0) goto L_0x00f3
            boolean r2 = r11.A1T()
            boolean r0 = r11.A0E
            if (r2 == r0) goto L_0x0101
        L_0x00f3:
            X.0S8 r2 = r11.A09
            int[] r0 = r2.A01
            if (r0 == 0) goto L_0x00fc
            java.util.Arrays.fill(r0, r1)
        L_0x00fc:
            r0 = 0
            r2.A00 = r0
            r9.A02 = r7
        L_0x0101:
            int r0 = r11.A05()
            if (r0 <= 0) goto L_0x02a5
            X.0YJ r0 = r11.A0A
            if (r0 == 0) goto L_0x010f
            int r0 = r0.A02
            if (r0 >= r7) goto L_0x02a5
        L_0x010f:
            boolean r0 = r9.A02
            if (r0 == 0) goto L_0x022b
            r4 = 0
        L_0x0114:
            int r0 = r11.A06
            if (r4 >= r0) goto L_0x02a5
            X.0SL[] r3 = r11.A0J
            r0 = r3[r4]
            r0.A08()
            int r2 = r9.A00
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 == r0) goto L_0x012b
            r0 = r3[r4]
            r0.A01 = r2
            r0.A00 = r2
        L_0x012b:
            int r4 = r4 + 1
            goto L_0x0114
        L_0x012e:
            r11.A03 = r1
            r11.A04 = r6
        L_0x0132:
            boolean r0 = r11.A0D
            int r4 = r13.A00()
            if (r0 == 0) goto L_0x0153
            int r2 = r11.A05()
        L_0x013e:
            int r2 = r2 + -1
            if (r2 < 0) goto L_0x016a
            android.view.View r0 = r11.A0C(r2)
            int r0 = X.AnonymousClass02W.A02(r0)
            if (r0 < 0) goto L_0x013e
            if (r0 >= r4) goto L_0x013e
        L_0x014e:
            r9.A01 = r0
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x0180
        L_0x0153:
            int r3 = r11.A05()
            r2 = 0
        L_0x0158:
            if (r2 >= r3) goto L_0x016a
            android.view.View r0 = r11.A0C(r2)
            int r0 = X.AnonymousClass02W.A02(r0)
            if (r0 < 0) goto L_0x0167
            if (r0 >= r4) goto L_0x0167
            goto L_0x014e
        L_0x0167:
            int r2 = r2 + 1
            goto L_0x0158
        L_0x016a:
            r0 = 0
            goto L_0x014e
        L_0x016c:
            X.0VA r3 = r11.A07
            int r2 = r3.A09(r4)
            int r0 = r3.A07()
            if (r2 <= r0) goto L_0x0189
            boolean r0 = r9.A03
            if (r0 == 0) goto L_0x0184
            int r0 = r3.A02()
        L_0x0180:
            r9.A00 = r0
            goto L_0x00db
        L_0x0184:
            int r0 = r3.A06()
            goto L_0x0180
        L_0x0189:
            int r2 = r3.A0B(r4)
            int r0 = r3.A06()
            int r2 = r2 - r0
            if (r2 >= 0) goto L_0x0196
            int r0 = -r2
            goto L_0x0180
        L_0x0196:
            int r2 = r3.A02()
            int r0 = r3.A08(r4)
            int r2 = r2 - r0
            if (r2 < 0) goto L_0x01cb
            r9.A00 = r6
            goto L_0x00db
        L_0x01a5:
            android.view.View r4 = r11.A0B(r4)
            if (r4 == 0) goto L_0x01e0
            boolean r0 = r11.A0G
            if (r0 == 0) goto L_0x01db
            int r0 = r11.A19()
        L_0x01b3:
            r9.A01 = r0
            int r0 = r11.A04
            if (r0 == r6) goto L_0x016c
            boolean r0 = r9.A03
            X.0VA r3 = r11.A07
            if (r0 == 0) goto L_0x01cf
            int r2 = r3.A02()
            int r0 = r11.A04
            int r2 = r2 - r0
            int r0 = r3.A08(r4)
        L_0x01ca:
            int r2 = r2 - r0
        L_0x01cb:
            r9.A00 = r2
            goto L_0x00db
        L_0x01cf:
            int r2 = r3.A06()
            int r0 = r11.A04
            int r2 = r2 + r0
            int r0 = r3.A0B(r4)
            goto L_0x01ca
        L_0x01db:
            int r0 = r11.A18()
            goto L_0x01b3
        L_0x01e0:
            int r5 = r11.A03
            r9.A01 = r5
            int r4 = r11.A04
            if (r4 != r6) goto L_0x0217
            int r0 = r11.A05()
            if (r0 != 0) goto L_0x020a
            boolean r0 = r11.A0G
            if (r0 == 0) goto L_0x01f3
        L_0x01f2:
            r3 = 1
        L_0x01f3:
            r9.A03 = r3
            androidx.recyclerview.widget.StaggeredGridLayoutManager r0 = r9.A06
            X.0VA r0 = r0.A07
            if (r3 == 0) goto L_0x0205
            int r0 = r0.A02()
        L_0x01ff:
            r9.A00 = r0
            r9.A02 = r7
            goto L_0x00db
        L_0x0205:
            int r0 = r0.A06()
            goto L_0x01ff
        L_0x020a:
            int r0 = r11.A18()
            r2 = 0
            if (r5 >= r0) goto L_0x0212
            r2 = 1
        L_0x0212:
            boolean r0 = r11.A0G
            if (r2 == r0) goto L_0x01f2
            goto L_0x01f3
        L_0x0217:
            boolean r2 = r9.A03
            androidx.recyclerview.widget.StaggeredGridLayoutManager r0 = r9.A06
            X.0VA r0 = r0.A07
            if (r2 == 0) goto L_0x0225
            int r0 = r0.A02()
            int r0 = r0 - r4
            goto L_0x01ff
        L_0x0225:
            int r0 = r0.A06()
            int r0 = r0 + r4
            goto L_0x01ff
        L_0x022b:
            if (r10 != 0) goto L_0x0246
            int[] r4 = r9.A05
            if (r4 == 0) goto L_0x0246
            r3 = 0
        L_0x0232:
            int r0 = r11.A06
            if (r3 >= r0) goto L_0x02a5
            X.0SL[] r0 = r11.A0J
            r2 = r0[r3]
            r2.A08()
            r0 = r4[r3]
            r2.A01 = r0
            r2.A00 = r0
            int r3 = r3 + 1
            goto L_0x0232
        L_0x0246:
            r5 = 0
        L_0x0247:
            int r0 = r11.A06
            X.0SL[] r6 = r11.A0J
            if (r5 >= r0) goto L_0x0282
            r6 = r6[r5]
            boolean r10 = r11.A0G
            int r4 = r9.A00
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r10 == 0) goto L_0x027d
            int r2 = r6.A02(r3)
        L_0x025b:
            r6.A08()
            if (r2 == r3) goto L_0x0273
            androidx.recyclerview.widget.StaggeredGridLayoutManager r0 = r6.A05
            X.0VA r0 = r0.A07
            if (r10 == 0) goto L_0x0276
            int r0 = r0.A02()
            if (r2 < r0) goto L_0x0273
        L_0x026c:
            if (r4 == r3) goto L_0x026f
            int r2 = r2 + r4
        L_0x026f:
            r6.A00 = r2
            r6.A01 = r2
        L_0x0273:
            int r5 = r5 + 1
            goto L_0x0247
        L_0x0276:
            int r0 = r0.A06()
            if (r2 <= r0) goto L_0x026c
            goto L_0x0273
        L_0x027d:
            int r2 = r6.A03(r3)
            goto L_0x025b
        L_0x0282:
            int r5 = r6.length
            int[] r0 = r9.A05
            if (r0 == 0) goto L_0x028a
            int r0 = r0.length
            if (r0 >= r5) goto L_0x0293
        L_0x028a:
            androidx.recyclerview.widget.StaggeredGridLayoutManager r0 = r9.A06
            X.0SL[] r0 = r0.A0J
            int r0 = r0.length
            int[] r0 = new int[r0]
            r9.A05 = r0
        L_0x0293:
            r4 = 0
        L_0x0294:
            if (r4 >= r5) goto L_0x02a5
            int[] r3 = r9.A05
            r2 = r6[r4]
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            int r0 = r2.A03(r0)
            r3[r4] = r0
            int r4 = r4 + 1
            goto L_0x0294
        L_0x02a5:
            r11.A0M(r12)
            X.0Q2 r3 = r11.A0L
            r3.A07 = r8
            r11.A0C = r8
            X.0VA r2 = r11.A08
            int r4 = r2.A07()
            int r0 = r11.A06
            int r0 = r4 / r0
            r11.A05 = r0
            int r0 = r2.A04()
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r0)
            r11.A00 = r0
            int r0 = r9.A01
            r11.A1Q(r13, r0)
            boolean r0 = r9.A03
            if (r0 == 0) goto L_0x0316
            r11.A1K(r1)
            r11.A1C(r3, r12, r13)
            r11.A1K(r7)
        L_0x02d6:
            int r1 = r9.A01
            int r0 = r3.A03
            int r1 = r1 + r0
            r3.A01 = r1
            r11.A1C(r3, r12, r13)
            int r1 = r2.A04()
            r0 = 1073741824(0x40000000, float:2.0)
            if (r1 == r0) goto L_0x034e
            r1 = 0
            int r6 = r11.A05()
            r5 = 0
            r4 = 0
        L_0x02ef:
            if (r4 >= r6) goto L_0x0320
            android.view.View r10 = r11.A0C(r4)
            int r0 = r2.A09(r10)
            float r3 = (float) r0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0313
            android.view.ViewGroup$LayoutParams r0 = r10.getLayoutParams()
            X.0Fk r0 = (X.C02830Fk) r0
            boolean r0 = r0.A01
            if (r0 == 0) goto L_0x030f
            r0 = 1065353216(0x3f800000, float:1.0)
            float r3 = r3 * r0
            int r0 = r11.A06
            float r0 = (float) r0
            float r3 = r3 / r0
        L_0x030f:
            float r1 = java.lang.Math.max(r1, r3)
        L_0x0313:
            int r4 = r4 + 1
            goto L_0x02ef
        L_0x0316:
            r11.A1K(r7)
            r11.A1C(r3, r12, r13)
            r11.A1K(r1)
            goto L_0x02d6
        L_0x0320:
            int r4 = r11.A05
            int r0 = r11.A06
            float r0 = (float) r0
            float r1 = r1 * r0
            int r1 = java.lang.Math.round(r1)
            int r3 = r2.A04()
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 != r0) goto L_0x033a
            int r0 = r2.A07()
            int r1 = java.lang.Math.min(r1, r0)
        L_0x033a:
            int r0 = r11.A06
            int r0 = r1 / r0
            r11.A05 = r0
            int r0 = r2.A04()
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r0)
            r11.A00 = r0
            int r0 = r11.A05
            if (r0 != r4) goto L_0x0402
        L_0x034e:
            int r0 = r11.A05()
            if (r0 <= 0) goto L_0x038a
            boolean r0 = r11.A0G
            if (r0 == 0) goto L_0x03cf
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            int r0 = r11.A1A(r1)
            if (r0 == r1) goto L_0x0375
            X.0VA r2 = r11.A07
            int r1 = r2.A02()
            int r1 = r1 - r0
            if (r1 <= 0) goto L_0x0375
            int r0 = -r1
            int r0 = r11.A1D(r12, r13, r0)
            int r0 = -r0
            int r1 = r1 - r0
            if (r1 <= 0) goto L_0x0375
            r2.A0E(r1)
        L_0x0375:
            r0 = 2147483647(0x7fffffff, float:NaN)
            int r1 = r11.A1B(r0)
            if (r1 == r0) goto L_0x038a
            X.0VA r0 = r11.A07
            int r0 = r0.A06()
            int r1 = r1 - r0
            if (r1 <= 0) goto L_0x038a
            r11.A1D(r12, r13, r1)
        L_0x038a:
            if (r14 == 0) goto L_0x03cd
            boolean r0 = r13.A08
            if (r0 != 0) goto L_0x03cd
            int r0 = r11.A01
            if (r0 == 0) goto L_0x03cd
            int r0 = r11.A05()
            if (r0 <= 0) goto L_0x03cd
            boolean r0 = r11.A0C
            if (r0 != 0) goto L_0x03a4
            android.view.View r0 = r11.A1F()
            if (r0 == 0) goto L_0x03cd
        L_0x03a4:
            java.lang.Runnable r1 = r11.A0N
            androidx.recyclerview.widget.RecyclerView r0 = r11.A07
            if (r0 == 0) goto L_0x03ad
            r0.removeCallbacks(r1)
        L_0x03ad:
            boolean r0 = r11.A1S()
            if (r0 == 0) goto L_0x03cd
        L_0x03b3:
            boolean r0 = r13.A08
            if (r0 == 0) goto L_0x03ba
            r9.A00()
        L_0x03ba:
            boolean r0 = r9.A03
            r11.A0D = r0
            boolean r0 = r11.A1T()
            r11.A0E = r0
            if (r7 == 0) goto L_0x0017
            r9.A00()
            r11.A1O(r12, r13, r8)
            return
        L_0x03cd:
            r7 = 0
            goto L_0x03b3
        L_0x03cf:
            r0 = 2147483647(0x7fffffff, float:NaN)
            int r2 = r11.A1B(r0)
            if (r2 == r0) goto L_0x03ec
            X.0VA r1 = r11.A07
            int r0 = r1.A06()
            int r2 = r2 - r0
            if (r2 <= 0) goto L_0x03ec
            int r0 = r11.A1D(r12, r13, r2)
            int r2 = r2 - r0
            if (r2 <= 0) goto L_0x03ec
            int r0 = -r2
            r1.A0E(r0)
        L_0x03ec:
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r11.A1A(r0)
            if (r1 == r0) goto L_0x038a
            X.0VA r0 = r11.A07
            int r0 = r0.A02()
            int r0 = r0 - r1
            if (r0 <= 0) goto L_0x038a
            int r0 = -r0
            r11.A1D(r12, r13, r0)
            goto L_0x038a
        L_0x0402:
            if (r5 >= r6) goto L_0x034e
            android.view.View r3 = r11.A0C(r5)
            android.view.ViewGroup$LayoutParams r2 = r3.getLayoutParams()
            X.0Fk r2 = (X.C02830Fk) r2
            boolean r0 = r2.A01
            if (r0 != 0) goto L_0x0431
            boolean r0 = r11.A1T()
            if (r0 == 0) goto L_0x0434
            int r0 = r11.A02
            if (r0 != r7) goto L_0x0434
            int r10 = r11.A06
            int r1 = r10 + -1
            X.0SL r0 = r2.A00
            int r2 = r0.A04
            int r1 = r1 - r2
            int r1 = -r1
            int r0 = r11.A05
            int r1 = r1 * r0
            int r10 = r10 - r7
            int r10 = r10 - r2
            int r0 = -r10
            int r0 = r0 * r4
            int r1 = r1 - r0
        L_0x042e:
            r3.offsetLeftAndRight(r1)
        L_0x0431:
            int r5 = r5 + 1
            goto L_0x0402
        L_0x0434:
            X.0SL r0 = r2.A00
            int r2 = r0.A04
            int r1 = r11.A05
            int r1 = r1 * r2
            int r2 = r2 * r4
            int r0 = r11.A02
            int r1 = r1 - r2
            if (r0 == r7) goto L_0x042e
            r3.offsetTopAndBottom(r1)
            goto L_0x0431
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.A1O(X.0SJ, X.0Ri, boolean):void");
    }

    public void A1P(AnonymousClass0Ri r5, int i2) {
        int A18;
        int i3;
        if (i2 > 0) {
            A18 = A19();
            i3 = 1;
        } else {
            A18 = A18();
            i3 = -1;
        }
        AnonymousClass0Q2 r1 = this.A0L;
        r1.A07 = true;
        A1Q(r5, A18);
        A1K(i3);
        r1.A01 = A18 + r1.A03;
        r1.A00 = Math.abs(i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r1 == false) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A1Q(X.AnonymousClass0Ri r8, int r9) {
        /*
            r7 = this;
            X.0Q2 r5 = r7.A0L
            r4 = 0
            r5.A00 = r4
            r5.A01 = r9
            X.0Rq r0 = r7.A06
            if (r0 == 0) goto L_0x0010
            boolean r1 = r0.A05
            r0 = 1
            if (r1 != 0) goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            r6 = 1
            if (r0 == 0) goto L_0x005e
            int r3 = r8.A06
            r0 = -1
            if (r3 == r0) goto L_0x005e
            boolean r2 = r7.A0G
            r1 = 0
            if (r3 >= r9) goto L_0x001f
            r1 = 1
        L_0x001f:
            X.0VA r0 = r7.A07
            int r3 = r0.A07()
            if (r2 == r1) goto L_0x005f
            r2 = r3
            r3 = 0
        L_0x0029:
            boolean r0 = r7.A0R()
            X.0VA r1 = r7.A07
            if (r0 == 0) goto L_0x0053
            int r0 = r1.A06()
            int r0 = r0 - r2
            r5.A05 = r0
            int r0 = r1.A02()
            int r0 = r0 + r3
            r5.A02 = r0
        L_0x003f:
            r5.A08 = r4
            r5.A07 = r6
            int r0 = r1.A04()
            if (r0 != 0) goto L_0x0050
            int r0 = r1.A01()
            if (r0 != 0) goto L_0x0050
            r4 = 1
        L_0x0050:
            r5.A06 = r4
            return
        L_0x0053:
            int r0 = r1.A01()
            int r0 = r0 + r3
            r5.A02 = r0
            int r0 = -r2
            r5.A05 = r0
            goto L_0x003f
        L_0x005e:
            r3 = 0
        L_0x005f:
            r2 = 0
            goto L_0x0029
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.A1Q(X.0Ri, int):void");
    }

    public final void A1R(AnonymousClass0SL r5, int i2, int i3) {
        int i4 = r5.A02;
        if (i2 == -1) {
            int i5 = r5.A01;
            if (i5 == Integer.MIN_VALUE) {
                r5.A07();
                i5 = r5.A01;
            }
            if (i5 + i4 > i3) {
                return;
            }
        } else {
            int i6 = r5.A00;
            if (i6 == Integer.MIN_VALUE) {
                r5.A06();
                i6 = r5.A00;
            }
            if (i6 - i4 < i3) {
                return;
            }
        }
        this.A0B.set(r5.A04, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x008a, code lost:
        r0 = r1 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A1S() {
        /*
            r11 = this;
            int r0 = r11.A05()
            r5 = 0
            if (r0 == 0) goto L_0x00a8
            int r0 = r11.A01
            if (r0 == 0) goto L_0x00a8
            boolean r0 = r11.A0B
            if (r0 == 0) goto L_0x00a8
            boolean r0 = r11.A0G
            if (r0 == 0) goto L_0x0099
            int r10 = r11.A19()
            int r1 = r11.A18()
        L_0x001b:
            r9 = 1
            if (r10 != 0) goto L_0x0037
            android.view.View r0 = r11.A1F()
            if (r0 == 0) goto L_0x0037
            X.0S8 r2 = r11.A09
            int[] r1 = r2.A01
            if (r1 == 0) goto L_0x002e
            r0 = -1
            java.util.Arrays.fill(r1, r0)
        L_0x002e:
            r0 = 0
            r2.A00 = r0
        L_0x0031:
            r11.A0D = r9
            r11.A0D()
            return r9
        L_0x0037:
            boolean r0 = r11.A0C
            if (r0 == 0) goto L_0x00a8
            boolean r0 = r11.A0G
            r4 = 1
            if (r0 == 0) goto L_0x0041
            r4 = -1
        L_0x0041:
            X.0S8 r8 = r11.A09
            int r3 = r1 + 1
            java.util.List r0 = r8.A00
            if (r0 == 0) goto L_0x00a3
            int r2 = r0.size()
            r1 = 0
        L_0x004e:
            if (r1 >= r2) goto L_0x00a3
            java.util.List r0 = r8.A00
            java.lang.Object r7 = r0.get(r1)
            X.0YE r7 = (X.AnonymousClass0YE) r7
            int r6 = r7.A01
            if (r6 >= r3) goto L_0x00a3
            if (r6 < r10) goto L_0x0096
            int r0 = r7.A00
            if (r0 == r4) goto L_0x0066
            boolean r0 = r7.A02
            if (r0 == 0) goto L_0x0096
        L_0x0066:
            int r5 = -r4
            java.util.List r0 = r8.A00
            if (r0 == 0) goto L_0x0093
            int r4 = r0.size()
            r3 = 0
        L_0x0070:
            if (r3 >= r4) goto L_0x0093
            java.util.List r0 = r8.A00
            java.lang.Object r2 = r0.get(r3)
            X.0YE r2 = (X.AnonymousClass0YE) r2
            int r1 = r2.A01
            if (r1 >= r6) goto L_0x0093
            if (r1 < r10) goto L_0x0090
            if (r5 == 0) goto L_0x008a
            int r0 = r2.A00
            if (r0 == r5) goto L_0x008a
            boolean r0 = r2.A02
            if (r0 == 0) goto L_0x0090
        L_0x008a:
            int r0 = r1 + 1
        L_0x008c:
            r8.A02(r0)
            goto L_0x0031
        L_0x0090:
            int r3 = r3 + 1
            goto L_0x0070
        L_0x0093:
            int r0 = r7.A01
            goto L_0x008c
        L_0x0096:
            int r1 = r1 + 1
            goto L_0x004e
        L_0x0099:
            int r10 = r11.A18()
            int r1 = r11.A19()
            goto L_0x001b
        L_0x00a3:
            r11.A0C = r5
            r8.A02(r3)
        L_0x00a8:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.A1S():boolean");
    }

    public boolean A1T() {
        return C004601z.A06(this.A07) == 1;
    }

    public final boolean A1U(int i2) {
        if (this.A02 == 0) {
            boolean z2 = false;
            if (i2 == -1) {
                z2 = true;
            }
            return z2 != this.A0G;
        }
        boolean z3 = false;
        if (i2 == -1) {
            z3 = true;
        }
        boolean z4 = false;
        if (z3 == this.A0G) {
            z4 = true;
        }
        return z4 == A1T();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0026, code lost:
        if (r1 != r4.A0G) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if (r4.A0G != false) goto L_0x000b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.PointF A6V(int r5) {
        /*
            r4 = this;
            int r0 = r4.A05()
            r3 = -1
            if (r0 != 0) goto L_0x001c
            boolean r0 = r4.A0G
            if (r0 == 0) goto L_0x000c
        L_0x000b:
            r3 = 1
        L_0x000c:
            android.graphics.PointF r2 = new android.graphics.PointF
            r2.<init>()
            int r0 = r4.A02
            r1 = 0
            if (r0 != 0) goto L_0x0029
            float r0 = (float) r3
            r2.x = r0
            r2.y = r1
            return r2
        L_0x001c:
            int r0 = r4.A18()
            r1 = 0
            if (r5 >= r0) goto L_0x0024
            r1 = 1
        L_0x0024:
            boolean r0 = r4.A0G
            if (r1 == r0) goto L_0x000b
            goto L_0x000c
        L_0x0029:
            r2.x = r1
            float r0 = (float) r3
            r2.y = r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.A6V(int):android.graphics.PointF");
    }
}
