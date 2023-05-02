package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: X.0c6  reason: invalid class name and case insensitive filesystem */
public class C07560c6 implements C13200ld {
    public final /* synthetic */ RecyclerView A00;

    public C07560c6(RecyclerView recyclerView) {
        this.A00 = recyclerView;
    }

    public void A00(AnonymousClass0RN r6) {
        int i2 = r6.A00;
        if (i2 == 1) {
            RecyclerView recyclerView = this.A00;
            recyclerView.A0S.A0y(recyclerView, r6.A02, r6.A01);
        } else if (i2 == 2) {
            RecyclerView recyclerView2 = this.A00;
            recyclerView2.A0S.A0z(recyclerView2, r6.A02, r6.A01);
        } else if (i2 == 4) {
            RecyclerView recyclerView3 = this.A00;
            recyclerView3.A0S.A11(recyclerView3, r6.A03, r6.A02, r6.A01);
        } else if (i2 == 8) {
            RecyclerView recyclerView4 = this.A00;
            recyclerView4.A0S.A10(recyclerView4, r6.A02, r6.A01, 1);
        }
    }

    public void AKe(Object obj, int i2, int i3) {
        int i4;
        int i5;
        RecyclerView recyclerView = this.A00;
        AnonymousClass0SK r3 = recyclerView.A0K;
        int A01 = r3.A01();
        int i6 = i2 + i3;
        for (int i7 = 0; i7 < A01; i7++) {
            View A04 = r3.A04(i7);
            C005602k A012 = RecyclerView.A01(A04);
            if (A012 != null && !A012.A05() && (i5 = A012.A05) >= i2 && i5 < i6) {
                int i8 = 2 | A012.A00;
                A012.A00 = i8;
                if (obj == null) {
                    A012.A00 = 1024 | i8;
                } else if ((1024 & i8) == 0) {
                    if (A012.A0E == null) {
                        ArrayList A0u = AnonymousClass000.A0u();
                        A012.A0E = A0u;
                        A012.A0F = Collections.unmodifiableList(A0u);
                    }
                    A012.A0E.add(obj);
                }
                ((AnonymousClass0Bp) A04.getLayoutParams()).A01 = true;
            }
        }
        AnonymousClass0SJ r5 = recyclerView.A0w;
        ArrayList arrayList = r5.A06;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                C005602k r2 = (C005602k) arrayList.get(size);
                if (r2 != null && (i4 = r2.A05) >= i2 && i4 < i6) {
                    r2.A00 = 2 | r2.A00;
                    r5.A04(size);
                }
            } else {
                recyclerView.A0l = true;
                return;
            }
        }
    }

    public void ALu(int i2, int i3) {
        RecyclerView recyclerView = this.A00;
        AnonymousClass0SK r6 = recyclerView.A0K;
        int A01 = r6.A01();
        for (int i4 = 0; i4 < A01; i4++) {
            C005602k A012 = RecyclerView.A01(r6.A04(i4));
            if (A012 != null && !A012.A05() && A012.A05 >= i2) {
                A012.A03(i3, false);
                recyclerView.A0y.A0C = true;
            }
        }
        ArrayList arrayList = recyclerView.A0w.A06;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            C005602k r1 = (C005602k) arrayList.get(i5);
            if (r1 != null && r1.A05 >= i2) {
                r1.A03(i3, true);
            }
        }
        recyclerView.requestLayout();
        recyclerView.A0k = true;
    }

    public void ALv(int i2, int i3) {
        int i4;
        int i5;
        RecyclerView recyclerView = this.A00;
        AnonymousClass0SK r10 = recyclerView.A0K;
        int A01 = r10.A01();
        int i6 = i2;
        int i7 = i3;
        int i8 = 1;
        if (i2 < i3) {
            i8 = -1;
            i7 = i2;
            i6 = i3;
        }
        for (int i9 = 0; i9 < A01; i9++) {
            C005602k A012 = RecyclerView.A01(r10.A04(i9));
            if (A012 != null && (i5 = A012.A05) >= i7 && i5 <= i6) {
                if (i5 == i2) {
                    A012.A03(i3 - i2, false);
                } else {
                    A012.A03(i8, false);
                }
                recyclerView.A0y.A0C = true;
            }
        }
        AnonymousClass0SJ r0 = recyclerView.A0w;
        int i10 = 1;
        int i11 = i2;
        int i12 = i3;
        if (i2 < i3) {
            i10 = -1;
            i12 = i2;
            i11 = i3;
        }
        ArrayList arrayList = r0.A06;
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            C005602k r1 = (C005602k) arrayList.get(i13);
            if (r1 != null && (i4 = r1.A05) >= i12 && i4 <= i11) {
                if (i4 == i2) {
                    r1.A03(i3 - i2, false);
                } else {
                    r1.A03(i10, false);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.A0k = true;
    }
}
