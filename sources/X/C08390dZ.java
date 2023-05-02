package X;

import java.util.Arrays;
import java.util.List;

/* renamed from: X.0dZ  reason: invalid class name and case insensitive filesystem */
public abstract class C08390dZ implements C13230lg {
    public final List A00;

    public C08390dZ(List list) {
        this.A00 = list;
    }

    public List AD1() {
        return this.A00;
    }

    public boolean AJi() {
        List list = this.A00;
        return list.isEmpty() || (list.size() == 1 && AnonymousClass000.A0R(list, 0).A03());
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass000.A0o();
        List list = this.A00;
        if (!list.isEmpty()) {
            A0o.append("values=");
            A0o.append(Arrays.toString(list.toArray()));
        }
        return A0o.toString();
    }
}
