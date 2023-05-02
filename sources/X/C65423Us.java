package X;

import java.util.Arrays;
import java.util.List;

/* renamed from: X.3Us  reason: invalid class name and case insensitive filesystem */
public final class C65423Us extends C88494ab {
    public final long A00;
    public final List A01 = AnonymousClass000.A0u();
    public final List A02 = AnonymousClass000.A0u();

    public C65423Us(int i2, long j2) {
        super(i2);
        this.A00 = j2;
    }

    public C65423Us A00(int i2) {
        List list = this.A01;
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            C65423Us r1 = (C65423Us) list.get(i3);
            if (r1.A00 == i2) {
                return r1;
            }
        }
        return null;
    }

    public C65413Ur A01(int i2) {
        List list = this.A02;
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            C65413Ur r1 = (C65413Ur) list.get(i3);
            if (r1.A00 == i2) {
                return r1;
            }
        }
        return null;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass000.A0o();
        A0o.append(C88494ab.A00(this.A00));
        A0o.append(" leaves: ");
        A0o.append(Arrays.toString(this.A02.toArray()));
        A0o.append(" containers: ");
        return AnonymousClass000.A0h(Arrays.toString(this.A01.toArray()), A0o);
    }
}
