package X;

import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.IDxComparatorShape18S0000000_I1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0hQ  reason: invalid class name and case insensitive filesystem */
public final class C10620hQ implements Runnable {
    public static Comparator A04 = new IDxComparatorShape18S0000000_I1(2);
    public static final ThreadLocal A05 = new ThreadLocal();
    public long A00;
    public long A01;
    public ArrayList A02 = AnonymousClass000.A0u();
    public ArrayList A03 = AnonymousClass000.A0u();

    public static final C005602k A00(RecyclerView recyclerView, int i2, long j2) {
        AnonymousClass0SK r4 = recyclerView.A0K;
        int A012 = r4.A01();
        for (int i3 = 0; i3 < A012; i3++) {
            C005602k A013 = RecyclerView.A01(r4.A04(i3));
            if (A013.A05 == i2 && (A013.A00 & 4) == 0) {
                return null;
            }
        }
        AnonymousClass0SJ r1 = recyclerView.A0w;
        try {
            recyclerView.A09++;
            C005602k A014 = r1.A01(i2, j2);
            if (A014 != null) {
                if (!A014.A06() || (A014.A00 & 4) != 0) {
                    r1.A0A(A014, false);
                } else {
                    r1.A05(A014.A0H);
                }
            }
            return A014;
        } finally {
            int i4 = 1;
            int i5 = recyclerView.A09 - i4;
            recyclerView.A09 = i5;
            if (i5 < i4) {
                recyclerView.A09 = 0;
            }
        }
    }

    public void run() {
        WeakReference weakReference;
        RecyclerView recyclerView;
        C04970Os r0;
        try {
            C004201v.A01("RV Prefetch");
            ArrayList arrayList = this.A02;
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                long j2 = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    RecyclerView recyclerView2 = (RecyclerView) arrayList.get(i2);
                    if (recyclerView2.getWindowVisibility() == 0) {
                        j2 = Math.max(recyclerView2.getDrawingTime(), j2);
                    }
                }
                if (j2 != 0) {
                    long nanos = TimeUnit.MILLISECONDS.toNanos(j2) + this.A00;
                    int size2 = arrayList.size();
                    int i3 = 0;
                    for (int i4 = 0; i4 < size2; i4++) {
                        RecyclerView recyclerView3 = (RecyclerView) arrayList.get(i4);
                        if (recyclerView3.getWindowVisibility() == 0) {
                            C07650cF r02 = recyclerView3.A0L;
                            r02.A00(recyclerView3, false);
                            i3 += r02.A00;
                        }
                    }
                    ArrayList arrayList2 = this.A03;
                    arrayList2.ensureCapacity(i3);
                    int i5 = 0;
                    for (int i6 = 0; i6 < size2; i6++) {
                        RecyclerView recyclerView4 = (RecyclerView) arrayList.get(i6);
                        if (recyclerView4.getWindowVisibility() == 0) {
                            C07650cF r13 = recyclerView4.A0L;
                            int abs = Math.abs(r13.A01) + Math.abs(r13.A02);
                            for (int i7 = 0; i7 < (r13.A00 << 1); i7 += 2) {
                                if (i5 >= arrayList2.size()) {
                                    r0 = new C04970Os();
                                    arrayList2.add(r0);
                                } else {
                                    r0 = (C04970Os) arrayList2.get(i5);
                                }
                                int[] iArr = r13.A03;
                                int i8 = iArr[i7 + 1];
                                boolean z2 = false;
                                if (i8 <= abs) {
                                    z2 = true;
                                }
                                r0.A04 = z2;
                                r0.A02 = abs;
                                r0.A00 = i8;
                                r0.A03 = recyclerView4;
                                r0.A01 = iArr[i7];
                                i5++;
                            }
                        }
                    }
                    Collections.sort(arrayList2, A04);
                    for (int i9 = 0; i9 < arrayList2.size(); i9++) {
                        C04970Os r9 = (C04970Os) arrayList2.get(i9);
                        if (r9.A03 == null) {
                            break;
                        }
                        C005602k A002 = A00(r9.A03, r9.A01, r9.A04 ? Long.MAX_VALUE : nanos);
                        if (!(A002 == null || (weakReference = A002.A0D) == null || !A002.A06() || (A002.A00 & 4) != 0 || (recyclerView = (RecyclerView) weakReference.get()) == null)) {
                            if (recyclerView.A0e && recyclerView.A0K.A01() != 0) {
                                recyclerView.A0Q();
                            }
                            C07650cF r7 = recyclerView.A0L;
                            r7.A00(recyclerView, true);
                            if (r7.A00 != 0) {
                                C004201v.A01("RV Nested Prefetch");
                                AnonymousClass0Ri r12 = recyclerView.A0y;
                                AnonymousClass01X r6 = recyclerView.A0N;
                                r12.A04 = 1;
                                r12.A03 = r6.A0C();
                                r12.A08 = false;
                                r12.A0D = false;
                                r12.A09 = false;
                                for (int i10 = 0; i10 < (r7.A00 << 1); i10 += 2) {
                                    A00(recyclerView, r7.A03[i10], nanos);
                                }
                            }
                        }
                        r9.A04 = false;
                        r9.A02 = 0;
                        r9.A00 = 0;
                        r9.A03 = null;
                        r9.A01 = 0;
                    }
                }
            }
            this.A01 = 0;
            C004201v.A00();
        } catch (Throwable th) {
            this.A01 = 0;
            throw th;
        } finally {
        }
    }
}
