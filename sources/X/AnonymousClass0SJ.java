package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: X.0SJ  reason: invalid class name */
public final class AnonymousClass0SJ {
    public int A00;
    public int A01;
    public AnonymousClass0PR A02;
    public C03960Ko A03;
    public ArrayList A04 = null;
    public final ArrayList A05;
    public final ArrayList A06 = AnonymousClass000.A0u();
    public final List A07;
    public final /* synthetic */ RecyclerView A08;

    public AnonymousClass0SJ(RecyclerView recyclerView) {
        this.A08 = recyclerView;
        ArrayList A0u = AnonymousClass000.A0u();
        this.A05 = A0u;
        this.A07 = Collections.unmodifiableList(A0u);
        this.A00 = 2;
        this.A01 = 2;
    }

    public int A00(int i2) {
        if (i2 >= 0) {
            RecyclerView recyclerView = this.A08;
            AnonymousClass0Ri r1 = recyclerView.A0y;
            if (i2 < r1.A00()) {
                return r1.A08 ? recyclerView.A0J.A01(i2, 0) : i2;
            }
        }
        StringBuilder A0r = AnonymousClass000.A0r("invalid position ");
        A0r.append(i2);
        A0r.append(". State ");
        A0r.append("item count is ");
        RecyclerView recyclerView2 = this.A08;
        A0r.append(recyclerView2.A0y.A00());
        throw new IndexOutOfBoundsException(AnonymousClass000.A0h(recyclerView2.A0G(), A0r));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:140:0x024f, code lost:
        if (r4.A08 == false) goto L_0x0251;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x02bb, code lost:
        r8.A05 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x0331, code lost:
        if (r8.A08 != r10.A0D(r8.A05)) goto L_0x0251;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00ac, code lost:
        if ((r1 & 4) == 0) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00d7, code lost:
        if ((r11 + r0) >= r21) goto L_0x0073;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x009e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C005602k A01(int r20, long r21) {
        /*
            r19 = this;
            r6 = r19
            r7 = r20
            if (r20 < 0) goto L_0x046e
            androidx.recyclerview.widget.RecyclerView r5 = r6.A08
            X.0Ri r4 = r5.A0y
            int r0 = r4.A00()
            if (r7 >= r0) goto L_0x046e
            boolean r0 = r4.A08
            r18 = 0
            r14 = 1
            r9 = 0
            if (r0 == 0) goto L_0x01a5
            java.util.ArrayList r11 = r6.A04
            if (r11 == 0) goto L_0x01a5
            int r10 = r11.size()
            if (r10 == 0) goto L_0x01a5
            r3 = 0
            r2 = 0
        L_0x0024:
            if (r2 >= r10) goto L_0x0170
            java.lang.Object r8 = r11.get(r2)
            X.02k r8 = (X.C005602k) r8
            int r0 = r8.A00
            r0 = r0 & 32
            if (r0 != 0) goto L_0x016c
            int r1 = r8.A06
            r0 = -1
            if (r1 != r0) goto L_0x0039
            int r1 = r8.A05
        L_0x0039:
            if (r1 != r7) goto L_0x016c
        L_0x003b:
            r1 = 32
            int r0 = r8.A00
            r1 = r1 | r0
            r8.A00 = r1
        L_0x0042:
            r17 = 1
            boolean r0 = r4.A08
            if (r0 != 0) goto L_0x0067
            r0 = 8192(0x2000, float:1.14794E-41)
            int r1 = r8.A00
            r0 = r0 & r1
            if (r0 == 0) goto L_0x0067
            r0 = -8193(0xffffffffffffdfff, float:NaN)
            r1 = r1 & r0
            r8.A00 = r1
            boolean r0 = r4.A0B
            if (r0 == 0) goto L_0x0067
            X.C005502j.A00(r8)
            X.02j r0 = r5.A0R
            r8.A01()
            X.0O0 r0 = r0.A01(r8)
            r5.A0l(r0, r8)
        L_0x0067:
            boolean r0 = r4.A08
            if (r0 == 0) goto L_0x009e
            boolean r0 = r8.A06()
            if (r0 == 0) goto L_0x009e
            r8.A06 = r7
        L_0x0073:
            r3 = 0
        L_0x0074:
            android.view.View r2 = r8.A0H
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            if (r1 != 0) goto L_0x0090
            android.view.ViewGroup$LayoutParams r1 = r5.generateDefaultLayoutParams()
        L_0x0080:
            X.0Bp r1 = (X.AnonymousClass0Bp) r1
            r2.setLayoutParams(r1)
        L_0x0085:
            r1.A00 = r8
            if (r17 == 0) goto L_0x008e
            if (r3 == 0) goto L_0x008e
        L_0x008b:
            r1.A02 = r14
            return r8
        L_0x008e:
            r14 = 0
            goto L_0x008b
        L_0x0090:
            boolean r0 = r5.checkLayoutParams(r1)
            if (r0 != 0) goto L_0x009b
            android.view.ViewGroup$LayoutParams r1 = r5.generateLayoutParams((android.view.ViewGroup.LayoutParams) r1)
            goto L_0x0080
        L_0x009b:
            X.0Bp r1 = (X.AnonymousClass0Bp) r1
            goto L_0x0085
        L_0x009e:
            boolean r0 = r8.A06()
            if (r0 == 0) goto L_0x00ae
            int r1 = r8.A00
            r0 = r1 & 2
            if (r0 != 0) goto L_0x00ae
            r0 = r1 & 4
            if (r0 == 0) goto L_0x0073
        L_0x00ae:
            X.0cC r0 = r5.A0J
            int r2 = r0.A01(r7, r9)
            r8.A0C = r5
            int r1 = r8.A02
            long r11 = r5.getNanoTime()
            r9 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r21 > r9 ? 1 : (r21 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x00d9
            X.0PR r0 = r6.A02
            X.0Oe r0 = r0.A00(r1)
            long r0 = r0.A01
            r9 = 0
            int r3 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r3 == 0) goto L_0x00d9
            long r9 = r11 + r0
            int r0 = (r9 > r21 ? 1 : (r9 == r21 ? 0 : -1))
            if (r0 >= 0) goto L_0x0073
        L_0x00d9:
            X.01X r3 = r5.A0N
            r8.A05 = r2
            boolean r0 = r3.A00
            if (r0 == 0) goto L_0x00e7
            long r0 = r3.A0D(r2)
            r8.A08 = r0
        L_0x00e7:
            int r1 = r8.A00
            r0 = -520(0xfffffffffffffdf8, float:NaN)
            r1 = r1 & r0
            r0 = r1 | 1
            r8.A00 = r0
            java.lang.String r0 = "RV OnBindView"
            X.C004201v.A01(r0)
            java.util.List r0 = r8.A01()
            r3.A08(r8, r0, r2)
            java.util.List r0 = r8.A0E
            if (r0 == 0) goto L_0x0103
            r0.clear()
        L_0x0103:
            int r0 = r8.A00
            r0 = r0 & -1025(0xfffffffffffffbff, float:NaN)
            r8.A00 = r0
            android.view.View r13 = r8.A0H
            android.view.ViewGroup$LayoutParams r1 = r13.getLayoutParams()
            boolean r0 = r1 instanceof X.AnonymousClass0Bp
            if (r0 == 0) goto L_0x0117
            X.0Bp r1 = (X.AnonymousClass0Bp) r1
            r1.A01 = r14
        L_0x0117:
            X.C004201v.A00()
            long r0 = r5.getNanoTime()
            X.0PR r3 = r6.A02
            int r2 = r8.A02
            long r0 = r0 - r11
            X.0Oe r15 = r3.A00(r2)
            long r2 = r15.A01
            r9 = 0
            int r6 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r6 == 0) goto L_0x0138
            r11 = 4
            long r2 = r2 / r11
            r9 = 3
            long r2 = r2 * r9
            long r0 = r0 / r11
            long r2 = r2 + r0
            r0 = r2
        L_0x0138:
            r15.A01 = r0
            android.view.accessibility.AccessibilityManager r0 = r5.A0v
            if (r0 == 0) goto L_0x0163
            boolean r0 = r0.isEnabled()
            if (r0 == 0) goto L_0x0163
            int r0 = r13.getImportantForAccessibility()
            if (r0 != 0) goto L_0x014d
            X.C004601z.A0d(r13, r14)
        L_0x014d:
            android.view.View$AccessibilityDelegate r0 = X.C004601z.A0D(r13)
            if (r0 != 0) goto L_0x0163
            r1 = 16384(0x4000, float:2.2959E-41)
            int r0 = r8.A00
            r1 = r1 | r0
            r8.A00 = r1
            X.0EK r0 = r5.A0Y
            X.05M r0 = r0.A07()
            X.C004601z.A0j(r13, r0)
        L_0x0163:
            boolean r0 = r4.A08
            if (r0 == 0) goto L_0x0169
            r8.A06 = r7
        L_0x0169:
            r3 = 1
            goto L_0x0074
        L_0x016c:
            int r2 = r2 + 1
            goto L_0x0024
        L_0x0170:
            X.01X r2 = r5.A0N
            boolean r0 = r2.A00
            if (r0 == 0) goto L_0x01a5
            X.0cC r0 = r5.A0J
            int r1 = r0.A01(r7, r9)
            if (r1 <= 0) goto L_0x01a5
            int r0 = r2.A0C()
            if (r1 >= r0) goto L_0x01a5
            X.01X r0 = r5.A0N
            long r11 = r0.A0D(r1)
        L_0x018a:
            if (r3 >= r10) goto L_0x01a5
            java.util.ArrayList r0 = r6.A04
            java.lang.Object r8 = r0.get(r3)
            X.02k r8 = (X.C005602k) r8
            int r0 = r8.A00
            r0 = r0 & 32
            if (r0 != 0) goto L_0x01a2
            long r0 = r8.A08
            int r2 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r2 != 0) goto L_0x01a2
            goto L_0x003b
        L_0x01a2:
            int r3 = r3 + 1
            goto L_0x018a
        L_0x01a5:
            r17 = 0
            java.util.ArrayList r2 = r6.A05
            int r3 = r2.size()
            r12 = 0
            r1 = 0
        L_0x01af:
            if (r1 >= r3) goto L_0x01dc
            java.lang.Object r8 = r2.get(r1)
            X.02k r8 = (X.C005602k) r8
            int r0 = r8.A00
            r0 = r0 & 32
            if (r0 != 0) goto L_0x01d6
            int r10 = r8.A06
            r0 = -1
            if (r10 != r0) goto L_0x01c4
            int r10 = r8.A05
        L_0x01c4:
            if (r10 != r7) goto L_0x01d6
            int r0 = r8.A00
            r0 = r0 & 4
            if (r0 != 0) goto L_0x01d6
            boolean r0 = r4.A08
            if (r0 != 0) goto L_0x01d9
            int r0 = r8.A00
            r0 = r0 & 8
            if (r0 == 0) goto L_0x01d9
        L_0x01d6:
            int r1 = r1 + 1
            goto L_0x01af
        L_0x01d9:
            r1 = 32
            goto L_0x0242
        L_0x01dc:
            X.0SK r11 = r5.A0K
            java.util.List r15 = r11.A02
            int r13 = r15.size()
            r8 = 0
        L_0x01e5:
            if (r8 >= r13) goto L_0x0339
            java.lang.Object r10 = r15.get(r8)
            android.view.View r10 = (android.view.View) r10
            X.02k r3 = androidx.recyclerview.widget.RecyclerView.A01(r10)
            int r1 = r3.A06
            r0 = -1
            if (r1 != r0) goto L_0x01f8
            int r1 = r3.A05
        L_0x01f8:
            if (r1 != r7) goto L_0x0335
            int r0 = r3.A00
            r0 = r0 & 4
            if (r0 != 0) goto L_0x0335
            int r0 = r3.A00
            r0 = r0 & 8
            if (r0 != 0) goto L_0x0335
            if (r10 == 0) goto L_0x0339
            X.02k r8 = androidx.recyclerview.widget.RecyclerView.A01(r10)
            X.0kS r0 = r11.A01
            X.0c7 r0 = (X.C07570c7) r0
            androidx.recyclerview.widget.RecyclerView r3 = r0.A00
            int r1 = r3.indexOfChild(r10)
            if (r1 < 0) goto L_0x0463
            X.0SE r12 = r11.A00
            boolean r0 = r12.A06(r1)
            if (r0 == 0) goto L_0x0458
            r12.A03(r1)
            r11.A08(r10)
            int r3 = r3.indexOfChild(r10)
            r1 = -1
            if (r3 == r1) goto L_0x0442
            boolean r0 = r12.A06(r3)
            if (r0 != 0) goto L_0x0442
            int r0 = r12.A00(r3)
            int r3 = r3 - r0
            if (r3 == r1) goto L_0x0442
            r11.A05(r3)
            r6.A06(r10)
            r1 = 8224(0x2020, float:1.1524E-41)
        L_0x0242:
            int r0 = r8.A00
            r1 = r1 | r0
            r8.A00 = r1
        L_0x0247:
            int r0 = r8.A00
            r0 = r0 & 8
            if (r0 == 0) goto L_0x0303
            boolean r0 = r4.A08
            if (r0 != 0) goto L_0x0042
        L_0x0251:
            r1 = 4
            int r0 = r8.A00
            r1 = r1 | r0
            r8.A00 = r1
            X.0SJ r0 = r8.A09
            if (r0 == 0) goto L_0x02f9
            android.view.View r0 = r8.A0H
            r5.removeDetachedView(r0, r9)
            X.0SJ r0 = r8.A09
            r0.A09(r8)
        L_0x0265:
            r6.A08(r8)
        L_0x0268:
            X.0cC r0 = r5.A0J
            int r3 = r0.A01(r7, r9)
            if (r3 < 0) goto L_0x03fb
            X.01X r0 = r5.A0N
            int r0 = r0.A0C()
            if (r3 >= r0) goto L_0x03fb
            X.01X r0 = r5.A0N
            int r10 = r0.getItemViewType(r3)
            X.01X r1 = r5.A0N
            boolean r0 = r1.A00
            if (r0 == 0) goto L_0x0361
            long r15 = r1.A0D(r3)
            int r11 = r2.size()
        L_0x028c:
            int r11 = r11 + -1
            if (r11 < 0) goto L_0x02db
            java.lang.Object r8 = r2.get(r11)
            X.02k r8 = (X.C005602k) r8
            long r0 = r8.A08
            int r12 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r12 != 0) goto L_0x028c
            int r0 = r8.A00
            r0 = r0 & 32
            if (r0 != 0) goto L_0x028c
            int r0 = r8.A02
            if (r10 != r0) goto L_0x02bf
            r1 = 32
            int r0 = r8.A00
            r1 = r1 | r0
            r8.A00 = r1
            r0 = r1 & 8
            if (r0 == 0) goto L_0x02bb
            boolean r0 = r4.A08
            if (r0 != 0) goto L_0x02bb
            r1 = r1 & -15
            r0 = 2
            r0 = r0 | r1
            r8.A00 = r0
        L_0x02bb:
            r8.A05 = r3
            goto L_0x0042
        L_0x02bf:
            r2.remove(r11)
            android.view.View r0 = r8.A0H
            r5.removeDetachedView(r0, r9)
            X.02k r1 = androidx.recyclerview.widget.RecyclerView.A01(r0)
            r0 = r18
            r1.A09 = r0
            r1.A0G = r9
            int r0 = r1.A00
            r0 = r0 & -33
            r1.A00 = r0
            r6.A08(r1)
            goto L_0x028c
        L_0x02db:
            java.util.ArrayList r11 = r6.A06
            int r2 = r11.size()
        L_0x02e1:
            int r2 = r2 + -1
            if (r2 < 0) goto L_0x0361
            java.lang.Object r8 = r11.get(r2)
            X.02k r8 = (X.C005602k) r8
            long r0 = r8.A08
            int r12 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r12 != 0) goto L_0x02e1
            int r0 = r8.A02
            if (r10 != r0) goto L_0x035e
            r11.remove(r2)
            goto L_0x02bb
        L_0x02f9:
            r0 = r1 & 32
            if (r0 == 0) goto L_0x0265
            r0 = r1 & -33
            r8.A00 = r0
            goto L_0x0265
        L_0x0303:
            int r1 = r8.A05
            if (r1 < 0) goto L_0x042b
            X.01X r0 = r5.A0N
            int r0 = r0.A0C()
            if (r1 >= r0) goto L_0x042b
            boolean r0 = r4.A08
            if (r0 != 0) goto L_0x0321
            X.01X r1 = r5.A0N
            int r0 = r8.A05
            int r1 = r1.getItemViewType(r0)
            int r0 = r8.A02
            if (r1 == r0) goto L_0x0321
            goto L_0x0251
        L_0x0321:
            X.01X r10 = r5.A0N
            boolean r0 = r10.A00
            if (r0 == 0) goto L_0x0042
            long r0 = r8.A08
            int r3 = r8.A05
            long r10 = r10.A0D(r3)
            int r3 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r3 != 0) goto L_0x0251
            goto L_0x0042
        L_0x0335:
            int r8 = r8 + 1
            goto L_0x01e5
        L_0x0339:
            java.util.ArrayList r10 = r6.A06
            int r3 = r10.size()
        L_0x033f:
            if (r12 >= r3) goto L_0x0268
            java.lang.Object r8 = r10.get(r12)
            X.02k r8 = (X.C005602k) r8
            int r0 = r8.A00
            r0 = r0 & 4
            if (r0 != 0) goto L_0x035b
            int r1 = r8.A06
            r0 = -1
            if (r1 != r0) goto L_0x0354
            int r1 = r8.A05
        L_0x0354:
            if (r1 != r7) goto L_0x035b
            r10.remove(r12)
            goto L_0x0247
        L_0x035b:
            int r12 = r12 + 1
            goto L_0x033f
        L_0x035e:
            r6.A04(r2)
        L_0x0361:
            X.0PR r0 = r6.A02
            if (r0 != 0) goto L_0x036c
            X.0PR r0 = new X.0PR
            r0.<init>()
            r6.A02 = r0
        L_0x036c:
            android.util.SparseArray r0 = r0.A01
            java.lang.Object r0 = r0.get(r10)
            X.0Oe r0 = (X.C04850Oe) r0
            if (r0 == 0) goto L_0x03a0
            java.util.ArrayList r1 = r0.A03
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x03a0
            int r0 = r1.size()
            int r0 = r0 + -1
            java.lang.Object r8 = r1.remove(r0)
            X.02k r8 = (X.C005602k) r8
            if (r8 == 0) goto L_0x03a0
            r8.A02()
            boolean r0 = androidx.recyclerview.widget.RecyclerView.A1E
            if (r0 == 0) goto L_0x0067
            android.view.View r1 = r8.A0H
            boolean r0 = r1 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x0067
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r6.A07(r1, r9)
            goto L_0x0067
        L_0x03a0:
            long r15 = r5.getNanoTime()
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r21 > r1 ? 1 : (r21 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x03c2
            X.0PR r0 = r6.A02
            X.0Oe r0 = r0.A00(r10)
            long r0 = r0.A02
            r11 = 0
            int r2 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r2 == 0) goto L_0x03c2
            long r2 = r15 + r0
            int r0 = (r2 > r21 ? 1 : (r2 == r21 ? 0 : -1))
            if (r0 < 0) goto L_0x03c2
            return r18
        L_0x03c2:
            X.01X r0 = r5.A0N
            X.02k r8 = r0.A00(r5, r10)
            boolean r0 = androidx.recyclerview.widget.RecyclerView.A1D
            if (r0 == 0) goto L_0x03db
            android.view.View r0 = r8.A0H
            androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.A02(r0)
            if (r1 == 0) goto L_0x03db
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r1)
            r8.A0D = r0
        L_0x03db:
            long r2 = r5.getNanoTime()
            X.0PR r0 = r6.A02
            long r2 = r2 - r15
            X.0Oe r12 = r0.A00(r10)
            long r0 = r12.A02
            r15 = 0
            int r10 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r10 == 0) goto L_0x03f7
            r15 = 4
            long r0 = r0 / r15
            r10 = 3
            long r0 = r0 * r10
            long r2 = r2 / r15
            long r0 = r0 + r2
            r2 = r0
        L_0x03f7:
            r12.A02 = r2
            goto L_0x0067
        L_0x03fb:
            java.lang.String r0 = "Inconsistency detected. Invalid item position "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            r1.append(r7)
            java.lang.String r0 = "(offset:"
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = ")."
            r1.append(r0)
            java.lang.String r0 = "state:"
            r1.append(r0)
            int r0 = r4.A00()
            r1.append(r0)
            java.lang.String r0 = r5.A0G()
            java.lang.String r1 = X.AnonymousClass000.A0h(r0, r1)
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            r0.<init>(r1)
            throw r0
        L_0x042b:
            java.lang.String r0 = "Inconsistency detected. Invalid view holder adapter position"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            r1.append(r8)
            java.lang.String r0 = r5.A0G()
            java.lang.String r1 = X.AnonymousClass000.A0h(r0, r1)
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            r0.<init>(r1)
            throw r0
        L_0x0442:
            java.lang.String r0 = "layout index should not be -1 after unhiding a view:"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            r1.append(r8)
            java.lang.String r0 = r5.A0G()
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0V(r0)
            throw r0
        L_0x0458:
            java.lang.String r0 = "trying to unhide a view that was not hidden"
            java.lang.String r0 = X.AnonymousClass000.A0g(r0, r10)
            java.lang.RuntimeException r0 = X.AnonymousClass000.A0a(r0)
            throw r0
        L_0x0463:
            java.lang.String r0 = "view is not a child, cannot hide "
            java.lang.String r0 = X.AnonymousClass000.A0g(r0, r10)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0T(r0)
            throw r0
        L_0x046e:
            java.lang.String r0 = "Invalid item position "
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0r(r0)
            r2.append(r7)
            java.lang.String r0 = "("
            r2.append(r0)
            r2.append(r7)
            java.lang.String r0 = "). Item count:"
            r2.append(r0)
            androidx.recyclerview.widget.RecyclerView r1 = r6.A08
            X.0Ri r0 = r1.A0y
            int r0 = r0.A00()
            r2.append(r0)
            java.lang.String r0 = r1.A0G()
            java.lang.String r1 = X.AnonymousClass000.A0h(r0, r2)
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0SJ.A01(int, long):X.02k");
    }

    public void A02() {
        ArrayList arrayList = this.A06;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            A04(size);
        }
        arrayList.clear();
        if (RecyclerView.A1D) {
            C07650cF r2 = this.A08.A0L;
            int[] iArr = r2.A03;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            r2.A00 = 0;
        }
    }

    public void A03() {
        AnonymousClass02W r0 = this.A08.A0S;
        this.A01 = this.A00 + (r0 != null ? r0.A02 : 0);
        ArrayList arrayList = this.A06;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0 && arrayList.size() > this.A01) {
                A04(size);
            } else {
                return;
            }
        }
    }

    public void A04(int i2) {
        ArrayList arrayList = this.A06;
        A0A((C005602k) arrayList.get(i2), true);
        arrayList.remove(i2);
    }

    public void A05(View view) {
        C005602k A012 = RecyclerView.A01(view);
        if ((A012.A00 & 256) != 0) {
            this.A08.removeDetachedView(view, false);
        }
        AnonymousClass0SJ r0 = A012.A09;
        if (r0 != null) {
            r0.A09(A012);
        } else {
            int i2 = A012.A00;
            if ((i2 & 32) != 0) {
                A012.A00 = i2 & -33;
            }
        }
        A08(A012);
    }

    public void A06(View view) {
        ArrayList arrayList;
        C005502j r1;
        C005602k A012 = RecyclerView.A01(view);
        int i2 = A012.A00;
        if ((12 & i2) != 0 || (i2 & 2) == 0 || (r1 = this.A08.A0R) == null || r1.A0C(A012, A012.A01())) {
            int i3 = A012.A00;
            if ((i3 & 4) != 0 && (i3 & 8) == 0) {
                RecyclerView recyclerView = this.A08;
                if (!recyclerView.A0N.A00) {
                    throw AnonymousClass000.A0T(AnonymousClass000.A0h(recyclerView.A0G(), AnonymousClass000.A0r("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.")));
                }
            }
            A012.A09 = this;
            A012.A0G = false;
            arrayList = this.A05;
        } else {
            arrayList = this.A04;
            if (arrayList == null) {
                arrayList = AnonymousClass000.A0u();
                this.A04 = arrayList;
            }
            A012.A09 = this;
            A012.A0G = true;
        }
        arrayList.add(A012);
    }

    public final void A07(ViewGroup viewGroup, boolean z2) {
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            if (childAt instanceof ViewGroup) {
                A07((ViewGroup) childAt, true);
            }
        }
        if (!z2) {
            return;
        }
        if (viewGroup.getVisibility() == 4) {
            viewGroup.setVisibility(0);
            viewGroup.setVisibility(4);
            return;
        }
        int visibility = viewGroup.getVisibility();
        viewGroup.setVisibility(4);
        viewGroup.setVisibility(visibility);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003f, code lost:
        if (r2.hasTransientState() == false) goto L_0x0041;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A08(X.C005602k r11) {
        /*
            r10 = this;
            X.0SJ r0 = r11.A09
            boolean r0 = X.AnonymousClass000.A1V(r0)
            r3 = 0
            r4 = 1
            if (r0 != 0) goto L_0x008b
            android.view.View r2 = r11.A0H
            android.view.ViewParent r0 = r2.getParent()
            if (r0 != 0) goto L_0x008b
            int r1 = r11.A00
            r0 = r1 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0030
            java.lang.String r0 = "Tmp detached view should be removed from RecyclerView before it can be recycled: "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            r1.append(r11)
        L_0x0021:
            androidx.recyclerview.widget.RecyclerView r0 = r10.A08
            java.lang.String r0 = r0.A0G()
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0T(r0)
            throw r0
        L_0x0030:
            boolean r0 = r11.A05()
            if (r0 != 0) goto L_0x0084
            r0 = r1 & 16
            if (r0 != 0) goto L_0x0041
            boolean r0 = r2.hasTransientState()
            r9 = 1
            if (r0 != 0) goto L_0x0042
        L_0x0041:
            r9 = 0
        L_0x0042:
            androidx.recyclerview.widget.RecyclerView r8 = r10.A08
            int r0 = r11.A00
            r0 = r0 & 16
            if (r0 != 0) goto L_0x00d5
            boolean r0 = r2.hasTransientState()
            if (r0 != 0) goto L_0x00d5
            int r2 = r10.A01
            if (r2 <= 0) goto L_0x00cb
            r1 = 526(0x20e, float:7.37E-43)
            int r0 = r11.A00
            r1 = r1 & r0
            if (r1 != 0) goto L_0x00cb
            java.util.ArrayList r7 = r10.A06
            int r6 = r7.size()
            if (r6 < r2) goto L_0x0068
            r10.A04(r3)
            int r6 = r6 + -1
        L_0x0068:
            boolean r0 = androidx.recyclerview.widget.RecyclerView.A1D
            if (r0 == 0) goto L_0x00d1
            if (r6 <= 0) goto L_0x00d1
            X.0cF r5 = r8.A0L
            int r4 = r11.A05
            int[] r3 = r5.A03
            if (r3 == 0) goto L_0x00ad
            int r0 = r5.A00
            int r2 = r0 << 1
            r1 = 0
        L_0x007b:
            if (r1 >= r2) goto L_0x00ad
            r0 = r3[r1]
            if (r0 == r4) goto L_0x00d1
            int r1 = r1 + 2
            goto L_0x007b
        L_0x0084:
            java.lang.String r0 = "Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle."
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            goto L_0x0021
        L_0x008b:
            java.lang.String r0 = "Scrapped or attached views may not be recycled. isScrap:"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            X.0SJ r0 = r11.A09
            boolean r0 = X.AnonymousClass000.A1V(r0)
            r1.append(r0)
            java.lang.String r0 = " isAttached:"
            r1.append(r0)
            android.view.View r0 = r11.A0H
            android.view.ViewParent r0 = r0.getParent()
            if (r0 == 0) goto L_0x00a8
            r3 = 1
        L_0x00a8:
            r1.append(r3)
            goto L_0x0021
        L_0x00ad:
            int r6 = r6 + -1
            if (r6 < 0) goto L_0x00cf
            java.lang.Object r0 = r7.get(r6)
            X.02k r0 = (X.C005602k) r0
            int r4 = r0.A05
            int[] r3 = r5.A03
            if (r3 == 0) goto L_0x00cf
            int r0 = r5.A00
            int r2 = r0 << 1
            r1 = 0
        L_0x00c2:
            if (r1 >= r2) goto L_0x00cf
            r0 = r3[r1]
            if (r0 == r4) goto L_0x00ad
            int r1 = r1 + 2
            goto L_0x00c2
        L_0x00cb:
            r10.A0A(r11, r4)
            goto L_0x00d6
        L_0x00cf:
            int r6 = r6 + 1
        L_0x00d1:
            r7.add(r6, r11)
            r3 = 1
        L_0x00d5:
            r4 = 0
        L_0x00d6:
            X.0Rx r0 = r8.A11
            r0.A04(r11)
            if (r3 != 0) goto L_0x00e4
            if (r4 != 0) goto L_0x00e4
            if (r9 == 0) goto L_0x00e4
            r0 = 0
            r11.A0C = r0
        L_0x00e4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0SJ.A08(X.02k):void");
    }

    public void A09(C005602k r2) {
        (r2.A0G ? this.A04 : this.A05).remove(r2);
        r2.A09 = null;
        r2.A0G = false;
        r2.A00 &= -33;
    }

    public void A0A(C005602k r5, boolean z2) {
        RecyclerView.A05(r5);
        int i2 = r5.A00;
        if (AnonymousClass000.A1O(16384 & i2)) {
            r5.A00 = 0 | (i2 & -16385);
            C004601z.A0j(r5.A0H, (AnonymousClass05M) null);
        }
        if (z2) {
            RecyclerView recyclerView = this.A08;
            C12500kV r0 = recyclerView.A0W;
            if (r0 != null) {
                r0.AZh(r5);
            }
            AnonymousClass01X r02 = recyclerView.A0N;
            if (r02 != null) {
                r02.A07(r5);
            }
            if (recyclerView.A0y != null) {
                recyclerView.A11.A04(r5);
            }
        }
        r5.A0C = null;
        AnonymousClass0PR r3 = this.A02;
        if (r3 == null) {
            r3 = new AnonymousClass0PR();
            this.A02 = r3;
        }
        int i3 = r5.A02;
        ArrayList arrayList = r3.A00(i3).A03;
        if (((C04850Oe) r3.A01.get(i3)).A00 > arrayList.size()) {
            r5.A02();
            arrayList.add(r5);
        }
    }
}
