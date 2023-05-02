package X;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;

/* renamed from: X.0SL  reason: invalid class name */
public class AnonymousClass0SL {
    public int A00 = Integer.MIN_VALUE;
    public int A01 = Integer.MIN_VALUE;
    public int A02 = 0;
    public ArrayList A03 = AnonymousClass000.A0u();
    public final int A04;
    public final /* synthetic */ StaggeredGridLayoutManager A05;

    public AnonymousClass0SL(StaggeredGridLayoutManager staggeredGridLayoutManager, int i2) {
        this.A05 = staggeredGridLayoutManager;
        this.A04 = i2;
    }

    public int A00() {
        return this.A05.A0F ? A04(this.A03.size() - 1, -1) : A04(0, this.A03.size());
    }

    public int A01() {
        return this.A05.A0F ? A04(0, this.A03.size()) : A04(this.A03.size() - 1, -1);
    }

    public int A02(int i2) {
        int i3 = this.A00;
        if (i3 != Integer.MIN_VALUE) {
            return i3;
        }
        if (this.A03.size() == 0) {
            return i2;
        }
        A06();
        return this.A00;
    }

    public int A03(int i2) {
        int i3 = this.A01;
        if (i3 != Integer.MIN_VALUE) {
            return i3;
        }
        if (this.A03.size() == 0) {
            return i2;
        }
        A07();
        return this.A01;
    }

    public int A04(int i2, int i3) {
        AnonymousClass0VA r8 = this.A05.A07;
        int A06 = r8.A06();
        int A022 = r8.A02();
        int i4 = -1;
        if (i3 > i2) {
            i4 = 1;
        }
        while (i2 != i3) {
            View A0N = AnonymousClass000.A0N(this.A03, i2);
            int A0B = r8.A0B(A0N);
            int A08 = r8.A08(A0N);
            boolean z2 = false;
            boolean z3 = false;
            if (A0B <= A022) {
                z3 = true;
            }
            if (A08 >= A06) {
                z2 = true;
            }
            if (z3 && z2 && (A0B < A06 || A08 > A022)) {
                return AnonymousClass02W.A02(A0N);
            }
            i2 += i4;
        }
        return -1;
    }

    public View A05(int i2, int i3) {
        View view = null;
        ArrayList arrayList = this.A03;
        int size = arrayList.size();
        int i4 = size - 1;
        if (i3 != -1) {
            while (i4 >= 0) {
                View A0N = AnonymousClass000.A0N(arrayList, i4);
                StaggeredGridLayoutManager staggeredGridLayoutManager = this.A05;
                if (staggeredGridLayoutManager.A0F && AnonymousClass02W.A02(A0N) >= i2) {
                    break;
                } else if (staggeredGridLayoutManager.A0F || AnonymousClass02W.A02(A0N) > i2) {
                    if (!A0N.hasFocusable()) {
                        break;
                    }
                    i4--;
                    view = A0N;
                } else {
                    return view;
                }
            }
        } else {
            int i5 = 0;
            while (i5 < size) {
                View A0N2 = AnonymousClass000.A0N(arrayList, i5);
                StaggeredGridLayoutManager staggeredGridLayoutManager2 = this.A05;
                if ((staggeredGridLayoutManager2.A0F && AnonymousClass02W.A02(A0N2) <= i2) || ((!staggeredGridLayoutManager2.A0F && AnonymousClass02W.A02(A0N2) >= i2) || !A0N2.hasFocusable())) {
                    break;
                }
                i5++;
                view = A0N2;
            }
        }
        return view;
    }

    public void A06() {
        AnonymousClass0YE A002;
        ArrayList arrayList = this.A03;
        View A0N = AnonymousClass000.A0N(arrayList, arrayList.size() - 1);
        C02830Fk r2 = (C02830Fk) A0N.getLayoutParams();
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.A05;
        this.A00 = staggeredGridLayoutManager.A07.A08(A0N);
        if (r2.A01 && (A002 = staggeredGridLayoutManager.A09.A00(r2.A01())) != null && A002.A00 == 1) {
            int i2 = this.A00;
            int i3 = this.A04;
            int[] iArr = A002.A03;
            this.A00 = i2 + (iArr == null ? 0 : iArr[i3]);
        }
    }

    public void A07() {
        AnonymousClass0YE A002;
        View A0N = AnonymousClass000.A0N(this.A03, 0);
        C02830Fk r2 = (C02830Fk) A0N.getLayoutParams();
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.A05;
        this.A01 = staggeredGridLayoutManager.A07.A0B(A0N);
        if (r2.A01 && (A002 = staggeredGridLayoutManager.A09.A00(r2.A01())) != null && A002.A00 == -1) {
            int i2 = this.A01;
            int i3 = this.A04;
            int[] iArr = A002.A03;
            this.A01 = i2 - (iArr == null ? 0 : iArr[i3]);
        }
    }

    public void A08() {
        this.A03.clear();
        this.A01 = Integer.MIN_VALUE;
        this.A00 = Integer.MIN_VALUE;
        this.A02 = 0;
    }

    public void A09() {
        ArrayList arrayList = this.A03;
        int size = arrayList.size();
        View view = (View) arrayList.remove(size - 1);
        C02830Fk r1 = (C02830Fk) view.getLayoutParams();
        r1.A00 = null;
        int i2 = r1.A00.A00;
        if (!((i2 & 8) == 0 && (i2 & 2) == 0)) {
            this.A02 -= this.A05.A07.A09(view);
        }
        if (size == 1) {
            this.A01 = Integer.MIN_VALUE;
        }
        this.A00 = Integer.MIN_VALUE;
    }

    public void A0A() {
        ArrayList arrayList = this.A03;
        View view = (View) arrayList.remove(0);
        C02830Fk r1 = (C02830Fk) view.getLayoutParams();
        r1.A00 = null;
        if (arrayList.size() == 0) {
            this.A00 = Integer.MIN_VALUE;
        }
        int i2 = r1.A00.A00;
        if (!((i2 & 8) == 0 && (i2 & 2) == 0)) {
            this.A02 -= this.A05.A07.A09(view);
        }
        this.A01 = Integer.MIN_VALUE;
    }

    public void A0B(View view) {
        C02830Fk r3 = (C02830Fk) view.getLayoutParams();
        r3.A00 = this;
        ArrayList arrayList = this.A03;
        arrayList.add(view);
        this.A00 = Integer.MIN_VALUE;
        if (arrayList.size() == 1) {
            this.A01 = Integer.MIN_VALUE;
        }
        int i2 = r3.A00.A00;
        if ((i2 & 8) != 0 || (i2 & 2) != 0) {
            this.A02 += this.A05.A07.A09(view);
        }
    }

    public void A0C(View view) {
        C02830Fk r3 = (C02830Fk) view.getLayoutParams();
        r3.A00 = this;
        ArrayList arrayList = this.A03;
        arrayList.add(0, view);
        this.A01 = Integer.MIN_VALUE;
        if (arrayList.size() == 1) {
            this.A00 = Integer.MIN_VALUE;
        }
        int i2 = r3.A00.A00;
        if ((i2 & 8) != 0 || (i2 & 2) != 0) {
            this.A02 += this.A05.A07.A09(view);
        }
    }
}
