package X;

import java.util.List;

/* renamed from: X.0e7  reason: invalid class name and case insensitive filesystem */
public class C08680e7 implements C12740kt {
    public List A00;

    public C08680e7(List list) {
        this.A00 = list;
    }

    public boolean ALM(C04000Ks r3, AnonymousClass0IL r4) {
        for (AnonymousClass0QN A02 : this.A00) {
            if (AnonymousClass0XF.A02(r3, A02, r4)) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("not(");
        A0r.append(this.A00);
        return AnonymousClass000.A0h(")", A0r);
    }
}
