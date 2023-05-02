package androidx.recyclerview.widget;

import X.AnonymousClass02W;
import X.AnonymousClass02X;
import X.AnonymousClass02Y;
import X.AnonymousClass0Bp;
import X.AnonymousClass0Fo;
import X.AnonymousClass0Ri;
import X.AnonymousClass0SJ;
import X.AnonymousClass0VA;
import X.AnonymousClass0VZ;
import X.AnonymousClass0YI;
import X.C004601z;
import X.C04420Mm;
import X.C04840Od;
import X.C05300Qc;
import X.C05470Ro;
import X.C12490kU;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.support.v4.app.FragmentTransaction;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

public class LinearLayoutManager extends AnonymousClass02W implements AnonymousClass02X, AnonymousClass02Y {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public C05300Qc A04;
    public AnonymousClass0YI A05;
    public AnonymousClass0VA A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public final C05470Ro A0C;
    public final C04840Od A0D;

    public LinearLayoutManager() {
        this(1);
    }

    public LinearLayoutManager(int i2) {
        this.A01 = 1;
        this.A08 = false;
        this.A09 = false;
        this.A0B = false;
        this.A0A = true;
        this.A02 = -1;
        this.A03 = Integer.MIN_VALUE;
        this.A05 = null;
        this.A0C = new C05470Ro();
        this.A0D = new C04840Od();
        this.A00 = 2;
        A1P(i2);
        A1Y(false);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
        this.A01 = 1;
        this.A08 = false;
        this.A09 = false;
        this.A0B = false;
        this.A0A = true;
        this.A02 = -1;
        this.A03 = Integer.MIN_VALUE;
        this.A05 = null;
        this.A0C = new C05470Ro();
        this.A0D = new C04840Od();
        this.A00 = 2;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C04420Mm.A00, i2, i3);
        int i4 = obtainStyledAttributes.getInt(0, 1);
        obtainStyledAttributes.getInt(9, 1);
        boolean z2 = obtainStyledAttributes.getBoolean(8, false);
        boolean z3 = obtainStyledAttributes.getBoolean(10, false);
        obtainStyledAttributes.recycle();
        A1P(i4);
        A1Y(z2);
        A1Z(z3);
    }

    public View A0B(int i2) {
        int A052 = A05();
        if (A052 == 0) {
            return null;
        }
        int A022 = i2 - AnonymousClass02W.A02(A0C(0));
        if (A022 >= 0 && A022 < A052) {
            View A0C2 = A0C(A022);
            if (AnonymousClass02W.A02(A0C2) == i2) {
                return A0C2;
            }
        }
        return super.A0B(i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000c, code lost:
        if (r0 != false) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0L(X.C12490kU r6, int r7) {
        /*
            r5 = this;
            X.0YI r0 = r5.A05
            r4 = -1
            r3 = 0
            if (r0 == 0) goto L_0x001e
            int r2 = r0.A01
            if (r2 < 0) goto L_0x001e
            boolean r0 = r0.A02
        L_0x000c:
            if (r0 == 0) goto L_0x002d
        L_0x000e:
            r1 = 0
        L_0x000f:
            int r0 = r5.A00
            if (r1 >= r0) goto L_0x002f
            if (r2 < 0) goto L_0x002f
            if (r2 >= r7) goto L_0x002f
            r6.A4h(r2, r3)
            int r2 = r2 + r4
            int r1 = r1 + 1
            goto L_0x000f
        L_0x001e:
            r5.A1O()
            boolean r0 = r5.A09
            int r2 = r5.A02
            if (r2 != r4) goto L_0x000c
            r2 = 0
            if (r0 == 0) goto L_0x002d
            int r2 = r7 + -1
            goto L_0x000e
        L_0x002d:
            r4 = 1
            goto L_0x000e
        L_0x002f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.A0L(X.0kU, int):void");
    }

    public boolean A0S() {
        if (this.A01 == 1073741824 || this.A04 == 1073741824) {
            return false;
        }
        int A052 = A05();
        for (int i2 = 0; i2 < A052; i2++) {
            ViewGroup.LayoutParams layoutParams = A0C(i2).getLayoutParams();
            if (layoutParams.width < 0 && layoutParams.height < 0) {
                return true;
            }
        }
        return false;
    }

    public int A0X(AnonymousClass0SJ r3, AnonymousClass0Ri r4, int i2) {
        if (this.A01 == 1) {
            return 0;
        }
        return A1E(r3, r4, i2);
    }

    public int A0Y(AnonymousClass0SJ r2, AnonymousClass0Ri r3, int i2) {
        if (this.A01 == 0) {
            return 0;
        }
        return A1E(r2, r3, i2);
    }

    public int A0Z(AnonymousClass0Ri r2) {
        return A1F(r2);
    }

    public int A0a(AnonymousClass0Ri r2) {
        return A1G(r2);
    }

    public int A0b(AnonymousClass0Ri r2) {
        return A1H(r2);
    }

    public int A0c(AnonymousClass0Ri r2) {
        return A1F(r2);
    }

    public int A0d(AnonymousClass0Ri r2) {
        return A1G(r2);
    }

    public int A0e(AnonymousClass0Ri r2) {
        return A1H(r2);
    }

    public Parcelable A0f() {
        AnonymousClass0YI r2;
        int i2;
        AnonymousClass0YI r0 = this.A05;
        if (r0 != null) {
            return r2;
        }
        r2 = new AnonymousClass0YI();
        if (A05() > 0) {
            A1N();
            boolean z2 = this.A07;
            boolean z3 = this.A09;
            boolean z4 = z2 ^ z3;
            r2.A02 = z4;
            if (z4) {
                View A0C2 = A0C(z3 ? 0 : A05() - 1);
                r2.A00 = this.A06.A02() - this.A06.A08(A0C2);
                i2 = AnonymousClass02W.A02(A0C2);
            } else {
                View A0C3 = A0C(z3 ? A05() - 1 : 0);
                r2.A01 = AnonymousClass02W.A02(A0C3);
                r2.A00 = this.A06.A0B(A0C3) - this.A06.A06();
                return r2;
            }
        } else {
            i2 = -1;
        }
        r2.A01 = i2;
        return r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0047, code lost:
        r0 = A05() - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x004d, code lost:
        r1 = A0C(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0055, code lost:
        if (r1.hasFocusable() == false) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0057, code lost:
        if (r2 == null) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0059, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0069, code lost:
        if (r6.A09 != false) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006b, code lost:
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0074, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0045, code lost:
        if (r6.A09 != false) goto L_0x0047;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View A0g(android.view.View r7, X.AnonymousClass0SJ r8, X.AnonymousClass0Ri r9, int r10) {
        /*
            r6 = this;
            r6.A1O()
            int r0 = r6.A05()
            r5 = 0
            if (r0 == 0) goto L_0x0075
            int r4 = r6.A1C(r10)
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r4 == r3) goto L_0x0075
            r6.A1N()
            r6.A1N()
            r1 = 1051372203(0x3eaaaaab, float:0.33333334)
            X.0VA r0 = r6.A06
            int r0 = r0.A07()
            float r0 = (float) r0
            float r0 = r0 * r1
            int r0 = (int) r0
            r2 = 0
            r6.A1X(r9, r4, r0, r2)
            X.0Qc r1 = r6.A04
            r1.A07 = r3
            r1.A0A = r2
            r0 = 1
            r6.A1D(r1, r8, r9, r0)
            r3 = -1
            boolean r1 = r6.A09
            int r0 = r6.A05()
            if (r4 != r3) goto L_0x005f
            if (r1 == 0) goto L_0x005a
            int r0 = r0 + -1
            android.view.View r2 = r6.A1I(r0, r3)
        L_0x0043:
            boolean r0 = r6.A09
            if (r0 == 0) goto L_0x006b
        L_0x0047:
            int r0 = r6.A05()
            int r0 = r0 + -1
        L_0x004d:
            android.view.View r1 = r6.A0C(r0)
            boolean r0 = r1.hasFocusable()
            if (r0 == 0) goto L_0x0074
            if (r2 == 0) goto L_0x0075
            return r1
        L_0x005a:
            android.view.View r2 = r6.A1I(r2, r0)
            goto L_0x0043
        L_0x005f:
            if (r1 == 0) goto L_0x006d
            android.view.View r2 = r6.A1I(r2, r0)
        L_0x0065:
            if (r4 == r3) goto L_0x0043
            boolean r0 = r6.A09
            if (r0 == 0) goto L_0x0047
        L_0x006b:
            r0 = 0
            goto L_0x004d
        L_0x006d:
            int r0 = r0 + -1
            android.view.View r2 = r6.A1I(r0, r3)
            goto L_0x0065
        L_0x0074:
            return r2
        L_0x0075:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.A0g(android.view.View, X.0SJ, X.0Ri, int):android.view.View");
    }

    public AnonymousClass0Bp A0h() {
        return new AnonymousClass0Bp(-2, -2);
    }

    public void A0n(int i2) {
        this.A02 = i2;
        this.A03 = Integer.MIN_VALUE;
        AnonymousClass0YI r1 = this.A05;
        if (r1 != null) {
            r1.A01 = -1;
        }
        A0D();
    }

    public void A0p(Parcelable parcelable) {
        if (parcelable instanceof AnonymousClass0YI) {
            this.A05 = (AnonymousClass0YI) parcelable;
            A0D();
        }
    }

    public void A0r(AccessibilityEvent accessibilityEvent) {
        super.A0r(accessibilityEvent);
        if (A05() > 0) {
            accessibilityEvent.setFromIndex(A19());
            accessibilityEvent.setToIndex(A1B());
        }
    }

    public void A0s(C12490kU r4, AnonymousClass0Ri r5, int i2, int i3) {
        if (this.A01 != 0) {
            i2 = i3;
        }
        if (A05() != 0 && i2 != 0) {
            A1N();
            int i4 = -1;
            if (i2 > 0) {
                i4 = 1;
            }
            A1X(r5, i4, Math.abs(i2), true);
            A1V(this.A04, r4, r5);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:113:0x01ec, code lost:
        if (r0 <= 0) goto L_0x01ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x01ee, code lost:
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00e0, code lost:
        if (r1.A01() != 0) goto L_0x00e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0164, code lost:
        if (r1 > 0) goto L_0x0166;
     */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x03d9  */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x03e1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0t(X.AnonymousClass0SJ r18, X.AnonymousClass0Ri r19) {
        /*
            r17 = this;
            r3 = r17
            X.0YI r1 = r3.A05
            r6 = -1
            r5 = r18
            r4 = r19
            if (r1 != 0) goto L_0x000f
            int r0 = r3.A02
            if (r0 == r6) goto L_0x0021
        L_0x000f:
            int r0 = r4.A00()
            if (r0 != 0) goto L_0x0019
            r3.A0N(r5)
            return
        L_0x0019:
            if (r1 == 0) goto L_0x0021
            int r0 = r1.A01
            if (r0 < 0) goto L_0x0021
            r3.A02 = r0
        L_0x0021:
            r3.A1N()
            X.0Qc r0 = r3.A04
            r2 = 0
            r0.A0A = r2
            r3.A1O()
            androidx.recyclerview.widget.RecyclerView r0 = r3.A07
            r8 = 0
            if (r0 == 0) goto L_0x0042
            android.view.View r1 = r0.getFocusedChild()
            if (r1 == 0) goto L_0x0042
            X.0SK r0 = r3.A05
            java.util.List r0 = r0.A02
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x0042
            r8 = r1
        L_0x0042:
            X.0Ro r7 = r3.A0C
            boolean r0 = r7.A04
            r9 = 1
            if (r0 == 0) goto L_0x024e
            int r0 = r3.A02
            if (r0 != r6) goto L_0x024e
            X.0YI r0 = r3.A05
            if (r0 != 0) goto L_0x024e
            if (r8 == 0) goto L_0x0076
            X.0VA r0 = r3.A06
            int r1 = r0.A0B(r8)
            X.0VA r0 = r3.A06
            int r0 = r0.A02()
            if (r1 >= r0) goto L_0x006f
            X.0VA r0 = r3.A06
            int r1 = r0.A08(r8)
            X.0VA r0 = r3.A06
            int r0 = r0.A06()
            if (r1 > r0) goto L_0x0076
        L_0x006f:
            int r0 = X.AnonymousClass02W.A02(r8)
            r7.A02(r8, r0)
        L_0x0076:
            int r0 = r4.A06
            if (r0 == r6) goto L_0x024b
            X.0VA r0 = r3.A06
            int r10 = r0.A07()
        L_0x0080:
            X.0Qc r0 = r3.A04
            int r0 = r0.A04
            r9 = 0
            if (r0 < 0) goto L_0x0089
            r9 = r10
            r10 = 0
        L_0x0089:
            X.0VA r0 = r3.A06
            int r0 = r0.A06()
            int r10 = r10 + r0
            X.0VA r0 = r3.A06
            int r0 = r0.A03()
            int r9 = r9 + r0
            boolean r0 = r4.A08
            if (r0 == 0) goto L_0x00c2
            int r8 = r3.A02
            if (r8 == r6) goto L_0x00c2
            int r1 = r3.A03
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r0) goto L_0x00c2
            android.view.View r11 = r3.A0B(r8)
            if (r11 == 0) goto L_0x00c2
            boolean r1 = r3.A09
            X.0VA r0 = r3.A06
            if (r1 == 0) goto L_0x023c
            int r8 = r0.A02()
            X.0VA r0 = r3.A06
            int r0 = r0.A08(r11)
            int r8 = r8 - r0
            int r1 = r3.A03
        L_0x00be:
            int r8 = r8 - r1
            if (r8 <= 0) goto L_0x0239
            int r10 = r10 + r8
        L_0x00c2:
            boolean r1 = r7.A03
            boolean r0 = r3.A09
            if (r1 == 0) goto L_0x0235
            if (r0 == 0) goto L_0x00cb
        L_0x00ca:
            r6 = 1
        L_0x00cb:
            r3.A1T(r7, r5, r4, r6)
            r3.A0M(r5)
            X.0Qc r6 = r3.A04
            X.0VA r1 = r3.A06
            int r0 = r1.A04()
            if (r0 != 0) goto L_0x00e2
            int r1 = r1.A01()
            r0 = 1
            if (r1 == 0) goto L_0x00e3
        L_0x00e2:
            r0 = 0
        L_0x00e3:
            r6.A09 = r0
            boolean r6 = r7.A03
            int r1 = r7.A01
            int r0 = r7.A00
            if (r6 == 0) goto L_0x01f3
            r3.A1S(r1, r0)
            X.0Qc r0 = r3.A04
            r0.A02 = r10
            r3.A1D(r0, r5, r4, r2)
            X.0Qc r0 = r3.A04
            int r6 = r0.A06
            int r10 = r0.A01
            int r0 = r0.A00
            if (r0 <= 0) goto L_0x0102
            int r9 = r9 + r0
        L_0x0102:
            int r1 = r7.A01
            int r0 = r7.A00
            r3.A1R(r1, r0)
            X.0Qc r8 = r3.A04
            r8.A02 = r9
            int r1 = r8.A01
            int r0 = r8.A03
            int r1 = r1 + r0
            r8.A01 = r1
            r3.A1D(r8, r5, r4, r2)
            X.0Qc r0 = r3.A04
            int r9 = r0.A06
            int r1 = r0.A00
            if (r1 <= 0) goto L_0x012d
            r3.A1S(r10, r6)
            X.0Qc r0 = r3.A04
            r0.A02 = r1
            r3.A1D(r0, r5, r4, r2)
            X.0Qc r0 = r3.A04
            int r6 = r0.A06
        L_0x012d:
            int r0 = r3.A05()
            if (r0 <= 0) goto L_0x016d
            boolean r1 = r3.A09
            boolean r0 = r3.A0B
            r1 = r1 ^ r0
            X.0VA r0 = r3.A06
            if (r1 == 0) goto L_0x01c3
            int r0 = r0.A02()
            int r0 = r0 - r9
            if (r0 <= 0) goto L_0x01c1
            int r0 = -r0
            int r0 = r3.A1E(r5, r4, r0)
            int r10 = -r0
            int r8 = r9 + r10
            X.0VA r0 = r3.A06
            int r1 = r0.A02()
            int r1 = r1 - r8
            if (r1 <= 0) goto L_0x01bf
            X.0VA r0 = r3.A06
            r0.A0E(r1)
            int r1 = r1 + r10
        L_0x015a:
            int r6 = r6 + r1
            int r9 = r9 + r1
            X.0VA r0 = r3.A06
            int r0 = r0.A06()
            int r1 = r6 - r0
            if (r1 <= 0) goto L_0x01ee
        L_0x0166:
            int r0 = r3.A1E(r5, r4, r1)
            int r0 = -r0
        L_0x016b:
            int r6 = r6 + r0
            int r9 = r9 + r0
        L_0x016d:
            boolean r0 = r4.A0A
            if (r0 == 0) goto L_0x0457
            int r0 = r3.A05()
            if (r0 == 0) goto L_0x0457
            boolean r0 = r4.A08
            if (r0 != 0) goto L_0x0457
            boolean r0 = r3.A16()
            if (r0 == 0) goto L_0x0457
            java.util.List r12 = r5.A07
            int r16 = r12.size()
            android.view.View r0 = r3.A0C(r2)
            int r13 = X.AnonymousClass02W.A02(r0)
            r11 = 0
            r10 = 0
            r8 = 0
        L_0x0192:
            r0 = r16
            if (r11 >= r0) goto L_0x0407
            java.lang.Object r0 = r12.get(r11)
            X.02k r0 = (X.C005602k) r0
            int r1 = r0.A00
            r1 = r1 & 8
            if (r1 != 0) goto L_0x01ba
            int r15 = r0.A06
            r1 = -1
            if (r15 != r1) goto L_0x01a9
            int r15 = r0.A05
        L_0x01a9:
            r14 = 0
            if (r15 >= r13) goto L_0x01ad
            r14 = 1
        L_0x01ad:
            boolean r1 = r3.A09
            X.0VA r15 = r3.A06
            android.view.View r0 = r0.A0H
            int r0 = r15.A09(r0)
            if (r14 == r1) goto L_0x01bd
            int r10 = r10 + r0
        L_0x01ba:
            int r11 = r11 + 1
            goto L_0x0192
        L_0x01bd:
            int r8 = r8 + r0
            goto L_0x01ba
        L_0x01bf:
            r1 = r10
            goto L_0x015a
        L_0x01c1:
            r1 = 0
            goto L_0x015a
        L_0x01c3:
            int r0 = r0.A06()
            int r0 = r6 - r0
            if (r0 <= 0) goto L_0x01f1
            int r0 = r3.A1E(r5, r4, r0)
            int r10 = -r0
            int r8 = r6 + r10
            X.0VA r0 = r3.A06
            int r0 = r0.A06()
            int r8 = r8 - r0
            if (r8 <= 0) goto L_0x01e2
            X.0VA r1 = r3.A06
            int r0 = -r8
            r1.A0E(r0)
            int r10 = r10 - r8
        L_0x01e2:
            int r6 = r6 + r10
            int r9 = r9 + r10
            X.0VA r0 = r3.A06
            int r0 = r0.A02()
            int r0 = r0 - r9
            int r1 = -r0
            if (r0 > 0) goto L_0x0166
        L_0x01ee:
            r0 = 0
            goto L_0x016b
        L_0x01f1:
            r10 = 0
            goto L_0x01e2
        L_0x01f3:
            r3.A1R(r1, r0)
            X.0Qc r0 = r3.A04
            r0.A02 = r9
            r3.A1D(r0, r5, r4, r2)
            X.0Qc r0 = r3.A04
            int r9 = r0.A06
            int r8 = r0.A01
            int r0 = r0.A00
            if (r0 <= 0) goto L_0x0208
            int r10 = r10 + r0
        L_0x0208:
            int r1 = r7.A01
            int r0 = r7.A00
            r3.A1S(r1, r0)
            X.0Qc r6 = r3.A04
            r6.A02 = r10
            int r1 = r6.A01
            int r0 = r6.A03
            int r1 = r1 + r0
            r6.A01 = r1
            r3.A1D(r6, r5, r4, r2)
            X.0Qc r0 = r3.A04
            int r6 = r0.A06
            int r1 = r0.A00
            if (r1 <= 0) goto L_0x012d
            r3.A1R(r8, r9)
            X.0Qc r0 = r3.A04
            r0.A02 = r1
            r3.A1D(r0, r5, r4, r2)
            X.0Qc r0 = r3.A04
            int r9 = r0.A06
            goto L_0x012d
        L_0x0235:
            if (r0 == 0) goto L_0x00ca
            goto L_0x00cb
        L_0x0239:
            int r9 = r9 - r8
            goto L_0x00c2
        L_0x023c:
            int r1 = r0.A0B(r11)
            X.0VA r0 = r3.A06
            int r0 = r0.A06()
            int r1 = r1 - r0
            int r8 = r3.A03
            goto L_0x00be
        L_0x024b:
            r10 = 0
            goto L_0x0080
        L_0x024e:
            r7.A00()
            boolean r12 = r3.A09
            boolean r0 = r3.A0B
            r0 = r0 ^ r12
            r7.A03 = r0
            boolean r0 = r4.A08
            r10 = 0
            if (r0 != 0) goto L_0x031b
            int r11 = r3.A02
            if (r11 == r6) goto L_0x031b
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r11 < 0) goto L_0x0317
            int r0 = r4.A00()
            if (r11 >= r0) goto L_0x0317
            r7.A01 = r11
            X.0YI r1 = r3.A05
            if (r1 == 0) goto L_0x0295
            int r0 = r1.A01
            if (r0 < 0) goto L_0x0295
            boolean r1 = r1.A02
            r7.A03 = r1
            X.0VA r0 = r3.A06
            if (r1 == 0) goto L_0x028c
            int r10 = r0.A02()
            X.0YI r0 = r3.A05
            int r0 = r0.A00
        L_0x0285:
            int r10 = r10 - r0
        L_0x0286:
            r7.A00 = r10
        L_0x0288:
            r7.A04 = r9
            goto L_0x0076
        L_0x028c:
            int r10 = r0.A06()
            X.0YI r0 = r3.A05
            int r1 = r0.A00
            goto L_0x0306
        L_0x0295:
            int r0 = r3.A03
            if (r0 != r8) goto L_0x02df
            android.view.View r8 = r3.A0B(r11)
            if (r8 == 0) goto L_0x03b8
            X.0VA r0 = r3.A06
            int r1 = r0.A09(r8)
            X.0VA r0 = r3.A06
            int r0 = r0.A07()
            if (r1 > r0) goto L_0x03d3
            X.0VA r0 = r3.A06
            int r1 = r0.A0B(r8)
            X.0VA r0 = r3.A06
            int r0 = r0.A06()
            int r1 = r1 - r0
            X.0VA r0 = r3.A06
            if (r1 >= 0) goto L_0x02c7
            int r0 = r0.A06()
            r7.A00 = r0
            r7.A03 = r2
            goto L_0x0288
        L_0x02c7:
            int r1 = r0.A02()
            X.0VA r0 = r3.A06
            int r0 = r0.A08(r8)
            int r1 = r1 - r0
            if (r1 >= 0) goto L_0x02f3
            X.0VA r0 = r3.A06
            int r0 = r0.A02()
            r7.A00 = r0
            r7.A03 = r9
            goto L_0x0288
        L_0x02df:
            r7.A03 = r12
            X.0VA r0 = r3.A06
            if (r12 == 0) goto L_0x02ec
            int r10 = r0.A02()
            int r0 = r3.A03
            goto L_0x0285
        L_0x02ec:
            int r10 = r0.A06()
            int r1 = r3.A03
            goto L_0x0306
        L_0x02f3:
            boolean r1 = r7.A03
            X.0VA r0 = r3.A06
            if (r1 == 0) goto L_0x0311
            int r10 = r0.A08(r8)
            X.0VA r8 = r3.A06
            int r1 = r8.A00
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != r1) goto L_0x0309
            r1 = 0
        L_0x0306:
            int r10 = r10 + r1
            goto L_0x0286
        L_0x0309:
            int r1 = r8.A07()
            int r0 = r8.A00
            int r1 = r1 - r0
            goto L_0x0306
        L_0x0311:
            int r10 = r0.A0B(r8)
            goto L_0x0286
        L_0x0317:
            r3.A02 = r6
            r3.A03 = r8
        L_0x031b:
            int r0 = r3.A05()
            if (r0 == 0) goto L_0x03e6
            androidx.recyclerview.widget.RecyclerView r0 = r3.A07
            if (r0 == 0) goto L_0x0358
            android.view.View r8 = r0.getFocusedChild()
            if (r8 == 0) goto L_0x0358
            X.0SK r0 = r3.A05
            java.util.List r0 = r0.A02
            boolean r0 = r0.contains(r8)
            if (r0 != 0) goto L_0x0358
            android.view.ViewGroup$LayoutParams r1 = r8.getLayoutParams()
            X.0Bp r1 = (X.AnonymousClass0Bp) r1
            X.02k r0 = r1.A00
            int r0 = r0.A00
            r0 = r0 & 8
            if (r0 != 0) goto L_0x0358
            int r1 = r1.A01()
            if (r1 < 0) goto L_0x0358
            int r0 = r4.A00()
            if (r1 >= r0) goto L_0x0358
            int r0 = X.AnonymousClass02W.A02(r8)
            r7.A02(r8, r0)
            goto L_0x0288
        L_0x0358:
            boolean r1 = r3.A07
            boolean r0 = r3.A0B
            if (r1 != r0) goto L_0x03e6
            boolean r1 = r7.A03
            boolean r0 = r3.A09
            if (r1 == 0) goto L_0x03aa
            if (r0 == 0) goto L_0x03ac
        L_0x0366:
            int r14 = r3.A05()
            int r15 = r4.A00()
            r13 = 0
        L_0x036f:
            r11 = r5
            r12 = r4
            r10 = r3
            android.view.View r8 = r10.A1K(r11, r12, r13, r14, r15)
            if (r8 == 0) goto L_0x03e6
            int r0 = X.AnonymousClass02W.A02(r8)
            r7.A01(r8, r0)
            boolean r0 = r4.A08
            if (r0 != 0) goto L_0x0288
            boolean r0 = r3.A16()
            if (r0 == 0) goto L_0x0288
            X.0VA r0 = r3.A06
            int r1 = r0.A0B(r8)
            X.0VA r0 = r3.A06
            int r0 = r0.A02()
            if (r1 >= r0) goto L_0x03a5
            X.0VA r0 = r3.A06
            int r1 = r0.A08(r8)
            X.0VA r0 = r3.A06
            int r0 = r0.A06()
            if (r1 >= r0) goto L_0x0288
        L_0x03a5:
            boolean r1 = r7.A03
            X.0VA r0 = r3.A06
            goto L_0x03d7
        L_0x03aa:
            if (r0 == 0) goto L_0x0366
        L_0x03ac:
            int r0 = r3.A05()
            int r13 = r0 + -1
            int r15 = r4.A00()
            r14 = -1
            goto L_0x036f
        L_0x03b8:
            int r0 = r3.A05()
            if (r0 <= 0) goto L_0x03d3
            android.view.View r0 = r3.A0C(r2)
            int r8 = X.AnonymousClass02W.A02(r0)
            int r0 = r3.A02
            r1 = 0
            if (r0 >= r8) goto L_0x03cc
            r1 = 1
        L_0x03cc:
            boolean r0 = r3.A09
            if (r1 != r0) goto L_0x03d1
            r10 = 1
        L_0x03d1:
            r7.A03 = r10
        L_0x03d3:
            boolean r1 = r7.A03
            X.0VA r0 = r7.A02
        L_0x03d7:
            if (r1 == 0) goto L_0x03e1
            int r0 = r0.A02()
        L_0x03dd:
            r7.A00 = r0
            goto L_0x0288
        L_0x03e1:
            int r0 = r0.A06()
            goto L_0x03dd
        L_0x03e6:
            boolean r1 = r7.A03
            X.0VA r0 = r7.A02
            if (r1 == 0) goto L_0x0402
            int r0 = r0.A02()
        L_0x03f0:
            r7.A00 = r0
            boolean r0 = r3.A0B
            if (r0 == 0) goto L_0x0400
            int r0 = r4.A00()
            int r0 = r0 + -1
        L_0x03fc:
            r7.A01 = r0
            goto L_0x0288
        L_0x0400:
            r0 = 0
            goto L_0x03fc
        L_0x0402:
            int r0 = r0.A06()
            goto L_0x03f0
        L_0x0407:
            X.0Qc r0 = r3.A04
            r0.A08 = r12
            if (r10 <= 0) goto L_0x0431
            boolean r0 = r3.A09
            if (r0 == 0) goto L_0x0473
            int r0 = r3.A05()
            int r0 = r0 + -1
        L_0x0417:
            android.view.View r0 = r3.A0C(r0)
            int r0 = X.AnonymousClass02W.A02(r0)
            r3.A1S(r0, r6)
            X.0Qc r1 = r3.A04
            r1.A02 = r10
            r1.A00 = r2
            r0 = 0
            r1.A01(r0)
            X.0Qc r0 = r3.A04
            r3.A1D(r0, r5, r4, r2)
        L_0x0431:
            if (r8 <= 0) goto L_0x0452
            boolean r0 = r3.A09
            if (r0 == 0) goto L_0x046c
            r0 = 0
        L_0x0438:
            android.view.View r0 = r3.A0C(r0)
            int r0 = X.AnonymousClass02W.A02(r0)
            r3.A1R(r0, r9)
            X.0Qc r1 = r3.A04
            r1.A02 = r8
            r1.A00 = r2
            r0 = 0
            r1.A01(r0)
            X.0Qc r0 = r3.A04
            r3.A1D(r0, r5, r4, r2)
        L_0x0452:
            X.0Qc r1 = r3.A04
            r0 = 0
            r1.A08 = r0
        L_0x0457:
            boolean r0 = r4.A08
            if (r0 != 0) goto L_0x0468
            X.0VA r1 = r3.A06
            int r0 = r1.A07()
            r1.A00 = r0
        L_0x0463:
            boolean r0 = r3.A0B
            r3.A07 = r0
            return
        L_0x0468:
            r7.A00()
            goto L_0x0463
        L_0x046c:
            int r0 = r3.A05()
            int r0 = r0 + -1
            goto L_0x0438
        L_0x0473:
            r0 = 0
            goto L_0x0417
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.A0t(X.0SJ, X.0Ri):void");
    }

    public void A0v(AnonymousClass0Ri r2) {
        this.A05 = null;
        this.A02 = -1;
        this.A03 = Integer.MIN_VALUE;
        this.A0C.A00();
    }

    public void A0w(AnonymousClass0Ri r3, RecyclerView recyclerView, int i2) {
        AnonymousClass0Fo r0 = new AnonymousClass0Fo(recyclerView.getContext());
        r0.A00 = i2;
        A0Q(r0);
    }

    public void A12(String str) {
        if (this.A05 == null) {
            super.A12(str);
        }
    }

    public boolean A13() {
        return this.A01 == 0;
    }

    public boolean A14() {
        return this.A01 == 1;
    }

    public boolean A15() {
        return true;
    }

    public boolean A16() {
        return this.A05 == null && this.A07 == this.A0B;
    }

    public int A18() {
        View A1J = A1J(0, A05(), true, false);
        if (A1J == null) {
            return -1;
        }
        return AnonymousClass02W.A02(A1J);
    }

    public int A19() {
        View A1J = A1J(0, A05(), false, true);
        if (A1J == null) {
            return -1;
        }
        return AnonymousClass02W.A02(A1J);
    }

    public int A1A() {
        View A1J = A1J(A05() - 1, -1, true, false);
        if (A1J != null) {
            return AnonymousClass02W.A02(A1J);
        }
        return -1;
    }

    public int A1B() {
        View A1J = A1J(A05() - 1, -1, false, true);
        if (A1J != null) {
            return AnonymousClass02W.A02(A1J);
        }
        return -1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0033 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0046 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A1C(int r5) {
        /*
            r4 = this;
            r3 = -1
            r2 = 1
            if (r5 == r2) goto L_0x0037
            r0 = 2
            if (r5 == r0) goto L_0x0024
            r0 = 17
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r5 == r0) goto L_0x0042
            r0 = 33
            if (r5 == r0) goto L_0x001f
            r0 = 66
            if (r5 == r0) goto L_0x002f
            r0 = 130(0x82, float:1.82E-43)
            if (r5 == r0) goto L_0x001a
            return r1
        L_0x001a:
            int r0 = r4.A01
            if (r0 != r2) goto L_0x0034
            return r2
        L_0x001f:
            int r0 = r4.A01
            if (r0 != r2) goto L_0x0047
            return r3
        L_0x0024:
            int r0 = r4.A01
            if (r0 == r2) goto L_0x0033
            boolean r0 = r4.A1a()
            if (r0 == 0) goto L_0x0033
            return r3
        L_0x002f:
            int r0 = r4.A01
            if (r0 != 0) goto L_0x0034
        L_0x0033:
            return r2
        L_0x0034:
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            return r2
        L_0x0037:
            int r0 = r4.A01
            if (r0 == r2) goto L_0x0046
            boolean r0 = r4.A1a()
            if (r0 == 0) goto L_0x0046
            return r2
        L_0x0042:
            int r0 = r4.A01
            if (r0 != 0) goto L_0x0047
        L_0x0046:
            return r3
        L_0x0047:
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.A1C(int):int");
    }

    public int A1D(C05300Qc r8, AnonymousClass0SJ r9, AnonymousClass0Ri r10, boolean z2) {
        int i2;
        int i3 = r8.A00;
        int i4 = r8.A07;
        if (i4 != Integer.MIN_VALUE) {
            if (i3 < 0) {
                r8.A07 = i4 + i3;
            }
            A1W(r8, r9);
        }
        int i5 = r8.A00 + r8.A02;
        C04840Od r2 = this.A0D;
        while (true) {
            if ((!r8.A09 && i5 <= 0) || (i2 = r8.A01) < 0 || i2 >= r10.A00()) {
                break;
            }
            r2.A00 = 0;
            r2.A01 = false;
            r2.A03 = false;
            r2.A02 = false;
            A1U(r2, r8, r9, r10);
            if (r2.A01) {
                break;
            }
            int i6 = r8.A06;
            int i7 = r2.A00;
            r8.A06 = i6 + (r8.A05 * i7);
            if (!r2.A03 || this.A04.A08 != null || !r10.A08) {
                r8.A00 -= i7;
                i5 -= i7;
            }
            int i8 = r8.A07;
            if (i8 != Integer.MIN_VALUE) {
                int i9 = i8 + i7;
                r8.A07 = i9;
                int i10 = r8.A00;
                if (i10 < 0) {
                    r8.A07 = i9 + i10;
                }
                A1W(r8, r9);
            }
            if (z2 && r2.A02) {
                break;
            }
        }
        return i3 - r8.A00;
    }

    public int A1E(AnonymousClass0SJ r6, AnonymousClass0Ri r7, int i2) {
        if (!(A05() == 0 || i2 == 0)) {
            this.A04.A0A = true;
            A1N();
            int i3 = -1;
            if (i2 > 0) {
                i3 = 1;
            }
            int abs = Math.abs(i2);
            A1X(r7, i3, abs, true);
            C05300Qc r0 = this.A04;
            int A1D = r0.A07 + A1D(r0, r6, r7, false);
            if (A1D >= 0) {
                if (abs > A1D) {
                    i2 = i3 * A1D;
                }
                this.A06.A0E(-i2);
                this.A04.A04 = i2;
                return i2;
            }
        }
        return 0;
    }

    public final int A1F(AnonymousClass0Ri r8) {
        if (A05() == 0) {
            return 0;
        }
        A1N();
        AnonymousClass0VA r3 = this.A06;
        boolean z2 = this.A0A;
        boolean z3 = !z2;
        return AnonymousClass0VZ.A00(A1M(z3), A1L(z3), r3, this, r8, z2);
    }

    public final int A1G(AnonymousClass0Ri r9) {
        if (A05() == 0) {
            return 0;
        }
        A1N();
        AnonymousClass0VA r3 = this.A06;
        boolean z2 = this.A0A;
        boolean z3 = !z2;
        return AnonymousClass0VZ.A02(A1M(z3), A1L(z3), r3, this, r9, z2, this.A09);
    }

    public final int A1H(AnonymousClass0Ri r8) {
        if (A05() == 0) {
            return 0;
        }
        A1N();
        AnonymousClass0VA r3 = this.A06;
        boolean z2 = this.A0A;
        boolean z3 = !z2;
        return AnonymousClass0VZ.A01(A1M(z3), A1L(z3), r3, this, r8, z2);
    }

    public View A1I(int i2, int i3) {
        A1N();
        if (i3 <= i2 && i3 >= i2) {
            return A0C(i2);
        }
        int A0B2 = this.A06.A0B(A0C(i2));
        int A062 = this.A06.A06();
        int i4 = 4161;
        int i5 = FragmentTransaction.TRANSIT_FRAGMENT_OPEN;
        if (A0B2 < A062) {
            i4 = 16644;
            i5 = 16388;
        }
        return (this.A01 == 0 ? this.A08 : this.A09).A00(i2, i3, i4, i5);
    }

    public View A1J(int i2, int i3, boolean z2, boolean z3) {
        A1N();
        int i4 = 320;
        int i5 = 320;
        if (z2) {
            i5 = 24579;
        }
        if (!z3) {
            i4 = 0;
        }
        return (this.A01 == 0 ? this.A08 : this.A09).A00(i2, i3, i5, i4);
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
            View A0C2 = A0C(i2);
            int A023 = AnonymousClass02W.A02(A0C2);
            if (A023 >= 0 && A023 < i4) {
                if ((((AnonymousClass0Bp) A0C2.getLayoutParams()).A00.A00 & 8) != 0) {
                    if (view2 == null) {
                        view2 = A0C2;
                    }
                } else if (this.A06.A0B(A0C2) < A022 && this.A06.A08(A0C2) >= A062) {
                    return A0C2;
                } else {
                    if (view == null) {
                        view = A0C2;
                    }
                }
            }
            i2 += i5;
        }
        return view == null ? view2 : view;
    }

    public final View A1L(boolean z2) {
        return this.A09 ? A1J(0, A05(), z2, true) : A1J(A05() - 1, -1, z2, true);
    }

    public final View A1M(boolean z2) {
        return this.A09 ? A1J(A05() - 1, -1, z2, true) : A1J(0, A05(), z2, true);
    }

    public void A1N() {
        if (this.A04 == null) {
            this.A04 = new C05300Qc();
        }
    }

    public final void A1O() {
        this.A09 = (this.A01 == 1 || !A1a()) ? this.A08 : !this.A08;
    }

    public void A1P(int i2) {
        if (i2 == 0 || i2 == 1) {
            A12((String) null);
            if (i2 != this.A01 || this.A06 == null) {
                AnonymousClass0VA A002 = AnonymousClass0VA.A00(this, i2);
                this.A06 = A002;
                this.A0C.A02 = A002;
                this.A01 = i2;
                A0D();
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder("invalid orientation:");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }

    public void A1Q(int i2, int i3) {
        this.A02 = i2;
        this.A03 = i3;
        AnonymousClass0YI r1 = this.A05;
        if (r1 != null) {
            r1.A01 = -1;
        }
        A0D();
    }

    public final void A1R(int i2, int i3) {
        this.A04.A00 = this.A06.A02() - i3;
        C05300Qc r3 = this.A04;
        int i4 = 1;
        if (this.A09) {
            i4 = -1;
        }
        r3.A03 = i4;
        r3.A01 = i2;
        r3.A05 = 1;
        r3.A06 = i3;
        r3.A07 = Integer.MIN_VALUE;
    }

    public final void A1S(int i2, int i3) {
        this.A04.A00 = i3 - this.A06.A06();
        C05300Qc r3 = this.A04;
        r3.A01 = i2;
        int i4 = -1;
        if (this.A09) {
            i4 = 1;
        }
        r3.A03 = i4;
        r3.A05 = -1;
        r3.A06 = i3;
        r3.A07 = Integer.MIN_VALUE;
    }

    public void A1T(C05470Ro r1, AnonymousClass0SJ r2, AnonymousClass0Ri r3, int i2) {
    }

    public void A1U(C04840Od r12, C05300Qc r13, AnonymousClass0SJ r14, AnonymousClass0Ri r15) {
        int A0A2;
        int A0A3;
        int i2;
        int i3;
        View A002 = r13.A00(r14);
        if (A002 == null) {
            r12.A01 = true;
            return;
        }
        AnonymousClass0Bp r7 = (AnonymousClass0Bp) A002.getLayoutParams();
        List list = r13.A08;
        boolean z2 = this.A09;
        int i4 = r13.A05;
        if (list == null) {
            boolean z3 = false;
            if (i4 == -1) {
                z3 = true;
            }
            if (z2 == z3) {
                A0H(A002, -1, false);
            } else {
                A0H(A002, 0, false);
            }
        } else {
            boolean z4 = false;
            if (i4 == -1) {
                z4 = true;
            }
            if (z2 == z4) {
                A0H(A002, -1, true);
            } else {
                A0H(A002, 0, true);
            }
        }
        AnonymousClass0Bp r8 = (AnonymousClass0Bp) A002.getLayoutParams();
        Rect A0A4 = this.A07.A0A(A002);
        int i5 = 0 + A0A4.left + A0A4.right;
        int i6 = 0 + A0A4.top + A0A4.bottom;
        int A012 = AnonymousClass02W.A01(this.A03, this.A04, A08() + A09() + r8.leftMargin + r8.rightMargin + i5, r8.width, A13());
        int A013 = AnonymousClass02W.A01(this.A00, this.A01, A0A() + A07() + r8.topMargin + r8.bottomMargin + i6, r8.height, A14());
        if (A0U(A002, r8, A012, A013)) {
            A002.measure(A012, A013);
        }
        r12.A00 = this.A06.A09(A002);
        if (this.A01 == 1) {
            if (A1a()) {
                i2 = this.A03 - A09();
                i3 = i2 - this.A06.A0A(A002);
            } else {
                i3 = A08();
                i2 = this.A06.A0A(A002) + i3;
            }
            int i7 = r13.A05;
            A0A3 = r13.A06;
            int i8 = r12.A00;
            A0A2 = A0A3 - i8;
            if (i7 != -1) {
                A0A2 = A0A3;
                A0A3 = i8 + A0A3;
            }
        } else {
            A0A2 = A0A();
            A0A3 = this.A06.A0A(A002) + A0A2;
            int i9 = r13.A05;
            int i10 = r13.A06;
            int i11 = r12.A00;
            if (i9 == -1) {
                i3 = i10 - i11;
                i2 = i10;
            } else {
                i2 = i11 + i10;
                i3 = i10;
            }
        }
        AnonymousClass02W.A03(A002, i3, A0A2, i2, A0A3);
        int i12 = r7.A00.A00;
        if (!((i12 & 8) == 0 && (i12 & 2) == 0)) {
            r12.A03 = true;
        }
        r12.A02 = A002.hasFocusable();
    }

    public void A1V(C05300Qc r4, C12490kU r5, AnonymousClass0Ri r6) {
        int i2 = r4.A01;
        if (i2 >= 0 && i2 < r6.A00()) {
            r5.A4h(i2, Math.max(0, r4.A07));
        }
    }

    public final void A1W(C05300Qc r8, AnonymousClass0SJ r9) {
        int i2;
        int i3;
        if (r8.A0A && !r8.A09) {
            int i4 = r8.A05;
            int i5 = r8.A07;
            if (i4 == -1) {
                int A052 = A05();
                if (i5 >= 0) {
                    int A012 = this.A06.A01() - i5;
                    i2 = A052 - 1;
                    int i6 = i2;
                    if (this.A09) {
                        i2 = 0;
                        i3 = 0;
                        while (i3 < A052) {
                            View A0C2 = A0C(i3);
                            if (this.A06.A0B(A0C2) >= A012 && this.A06.A0D(A0C2) >= A012) {
                                i3++;
                            }
                        }
                        return;
                    }
                    while (i3 >= 0) {
                        View A0C3 = A0C(i3);
                        if (this.A06.A0B(A0C3) >= A012 && this.A06.A0D(A0C3) >= A012) {
                            i6 = i3 - 1;
                        }
                    }
                    return;
                }
                return;
            } else if (i5 >= 0) {
                int A053 = A05();
                i2 = 0;
                int i7 = 0;
                if (this.A09) {
                    i2 = A053 - 1;
                    int i8 = i2;
                    while (i3 >= 0) {
                        View A0C4 = A0C(i3);
                        if (this.A06.A08(A0C4) <= i5 && this.A06.A0C(A0C4) <= i5) {
                            i8 = i3 - 1;
                        }
                    }
                    return;
                }
                while (i3 < A053) {
                    View A0C5 = A0C(i3);
                    if (this.A06.A08(A0C5) <= i5 && this.A06.A0C(A0C5) <= i5) {
                        i7 = i3 + 1;
                    }
                }
                return;
            } else {
                return;
            }
            if (i2 == i3) {
                return;
            }
            if (i3 > i2) {
                while (true) {
                    i3--;
                    if (i3 >= i2) {
                        A0P(r9, i3);
                    } else {
                        return;
                    }
                }
            } else {
                while (i2 > i3) {
                    A0P(r9, i2);
                    i2--;
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        if (r1.A01() != 0) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A1X(X.AnonymousClass0Ri r7, int r8, int r9, boolean r10) {
        /*
            r6 = this;
            X.0Qc r2 = r6.A04
            X.0VA r1 = r6.A06
            int r0 = r1.A04()
            if (r0 != 0) goto L_0x0011
            int r1 = r1.A01()
            r0 = 1
            if (r1 == 0) goto L_0x0012
        L_0x0011:
            r0 = 0
        L_0x0012:
            r2.A09 = r0
            int r1 = r7.A06
            r0 = -1
            if (r1 == r0) goto L_0x00c1
            X.0VA r0 = r6.A06
            int r0 = r0.A07()
        L_0x001f:
            r2.A02 = r0
            X.0Qc r2 = r6.A04
            r2.A05 = r8
            r5 = -1
            r0 = 1
            if (r8 != r0) goto L_0x0079
            int r1 = r2.A02
            X.0VA r0 = r6.A06
            int r0 = r0.A03()
            int r1 = r1 + r0
            r2.A02 = r1
            boolean r0 = r6.A09
            if (r0 == 0) goto L_0x0072
            r0 = 0
        L_0x0039:
            android.view.View r4 = r6.A0C(r0)
            X.0Qc r3 = r6.A04
            boolean r0 = r6.A09
            if (r0 != 0) goto L_0x0044
            r5 = 1
        L_0x0044:
            r3.A03 = r5
            int r2 = X.AnonymousClass02W.A02(r4)
            X.0Qc r1 = r6.A04
            int r0 = r1.A03
            int r2 = r2 + r0
            r3.A01 = r2
            X.0VA r0 = r6.A06
            int r0 = r0.A08(r4)
            r1.A06 = r0
            X.0VA r0 = r6.A06
            int r1 = r0.A08(r4)
            X.0VA r0 = r6.A06
            int r0 = r0.A02()
            int r1 = r1 - r0
        L_0x0066:
            X.0Qc r0 = r6.A04
            r0.A00 = r9
            if (r10 == 0) goto L_0x006f
            int r9 = r9 - r1
            r0.A00 = r9
        L_0x006f:
            r0.A07 = r1
            return
        L_0x0072:
            int r0 = r6.A05()
            int r0 = r0 + -1
            goto L_0x0039
        L_0x0079:
            boolean r0 = r6.A09
            if (r0 == 0) goto L_0x00bf
            int r0 = r6.A05()
            int r0 = r0 + -1
        L_0x0083:
            android.view.View r4 = r6.A0C(r0)
            X.0Qc r2 = r6.A04
            int r1 = r2.A02
            X.0VA r0 = r6.A06
            int r0 = r0.A06()
            int r1 = r1 + r0
            r2.A02 = r1
            X.0Qc r3 = r6.A04
            boolean r0 = r6.A09
            if (r0 == 0) goto L_0x009b
            r5 = 1
        L_0x009b:
            r3.A03 = r5
            int r2 = X.AnonymousClass02W.A02(r4)
            X.0Qc r1 = r6.A04
            int r0 = r1.A03
            int r2 = r2 + r0
            r3.A01 = r2
            X.0VA r0 = r6.A06
            int r0 = r0.A0B(r4)
            r1.A06 = r0
            X.0VA r0 = r6.A06
            int r0 = r0.A0B(r4)
            int r1 = -r0
            X.0VA r0 = r6.A06
            int r0 = r0.A06()
            int r1 = r1 + r0
            goto L_0x0066
        L_0x00bf:
            r0 = 0
            goto L_0x0083
        L_0x00c1:
            r0 = 0
            goto L_0x001f
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.A1X(X.0Ri, int, int, boolean):void");
    }

    public void A1Y(boolean z2) {
        A12((String) null);
        if (z2 != this.A08) {
            this.A08 = z2;
            A0D();
        }
    }

    public void A1Z(boolean z2) {
        A12((String) null);
        if (this.A0B != z2) {
            this.A0B = z2;
            A0D();
        }
    }

    public boolean A1a() {
        return C004601z.A06(this.A07) == 1;
    }

    public PointF A6V(int i2) {
        PointF pointF;
        if (A05() == 0) {
            return null;
        }
        boolean z2 = false;
        int i3 = 1;
        if (i2 < AnonymousClass02W.A02(A0C(0))) {
            z2 = true;
        }
        if (z2 != this.A09) {
            i3 = -1;
        }
        float f2 = (float) i3;
        if (this.A01 == 0) {
            return pointF;
        }
        pointF = new PointF(0.0f, f2);
        return pointF;
    }
}
