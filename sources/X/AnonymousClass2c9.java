package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2c9  reason: invalid class name */
public class AnonymousClass2c9 {
    public long A00;
    public String A01;
    public List A02;
    public List A03;

    /* renamed from: A00 */
    public AnonymousClass2c9 clone() {
        AnonymousClass2c9 r2 = new AnonymousClass2c9();
        r2.A01 = this.A01;
        r2.A00 = this.A00;
        List list = this.A03;
        if (list != null && !list.isEmpty()) {
            r2.A03 = new ArrayList(this.A03);
        }
        List list2 = this.A02;
        if (list2 != null && !list2.isEmpty()) {
            r2.A02 = new ArrayList(this.A02);
        }
        return r2;
    }

    public boolean A01() {
        List list = this.A03;
        if (list != null && !list.isEmpty()) {
            return true;
        }
        List list2 = this.A02;
        return list2 != null && !list2.isEmpty();
    }
}
