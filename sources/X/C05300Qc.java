package X;

import android.view.View;
import java.util.List;

/* renamed from: X.0Qc  reason: invalid class name and case insensitive filesystem */
public class C05300Qc {
    public int A00;
    public int A01;
    public int A02 = 0;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public List A08 = null;
    public boolean A09;
    public boolean A0A = true;

    public View A00(AnonymousClass0SJ r7) {
        List list = this.A08;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = ((C005602k) this.A08.get(i2)).A0H;
                AnonymousClass0Bp r2 = (AnonymousClass0Bp) view.getLayoutParams();
                if ((r2.A00.A00 & 8) == 0 && this.A01 == r2.A01()) {
                    A01(view);
                    return view;
                }
            }
            return null;
        }
        View view2 = r7.A01(this.A01, Long.MAX_VALUE).A0H;
        this.A01 += this.A03;
        return view2;
    }

    public void A01(View view) {
        int i2;
        int A012;
        int size = this.A08.size();
        View view2 = null;
        int i3 = Integer.MAX_VALUE;
        int i4 = 0;
        while (true) {
            if (i4 < size) {
                View view3 = ((C005602k) this.A08.get(i4)).A0H;
                AnonymousClass0Bp r1 = (AnonymousClass0Bp) view3.getLayoutParams();
                if (view3 != view && (r1.A00.A00 & 8) == 0 && (A012 = (r1.A01() - this.A01) * this.A03) >= 0 && A012 < i3) {
                    view2 = view3;
                    if (A012 == 0) {
                        break;
                    }
                    i3 = A012;
                }
                i4++;
            } else if (view2 == null) {
                i2 = -1;
            }
        }
        i2 = ((AnonymousClass0Bp) view2.getLayoutParams()).A01();
        this.A01 = i2;
    }
}
