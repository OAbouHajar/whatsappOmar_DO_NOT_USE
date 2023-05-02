package X;

import com.facebook.redex.IDxComparatorShape19S0000000_2_I0;
import java.util.Comparator;
import java.util.List;

/* renamed from: X.26y  reason: invalid class name and case insensitive filesystem */
public class C450726y {
    public final AnonymousClass1OB A00;
    public final Comparator A01 = new IDxComparatorShape19S0000000_2_I0(7);
    public volatile List A02;

    public C450726y(AnonymousClass1OB r3) {
        this.A00 = r3;
    }

    public List A00() {
        List list;
        synchronized (this) {
            if (this.A02 == null) {
                A01();
            }
            list = this.A02;
        }
        return list;
    }

    public void A01() {
        synchronized (this) {
            if (this.A02 == null) {
                this.A02 = this.A00.A00();
            }
        }
    }
}
