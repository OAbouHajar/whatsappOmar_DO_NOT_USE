package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1bk  reason: invalid class name and case insensitive filesystem */
public class C30101bk {
    public List A00;

    public C30101bk(C30091bj... r5) {
        this.A00 = new ArrayList(r3);
        for (C30091bj r1 : r5) {
            if (r1 != null) {
                this.A00.add(r1);
            }
        }
    }

    public boolean A00() {
        for (C30091bj isValid : this.A00) {
            if (!isValid.isValid()) {
                return false;
            }
        }
        return true;
    }
}
