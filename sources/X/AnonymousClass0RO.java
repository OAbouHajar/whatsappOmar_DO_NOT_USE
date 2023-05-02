package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0RO  reason: invalid class name */
public final class AnonymousClass0RO {
    public List A00;
    public final String A01;
    public final List A02;
    public final boolean A03;

    public AnonymousClass0RO(String str, List list, List list2, boolean z2) {
        C18450wi.A0H(str, 1);
        C18450wi.A0H(list, 3);
        C18450wi.A0H(list2, 4);
        this.A01 = str;
        this.A03 = z2;
        this.A02 = list;
        this.A00 = list2;
        boolean isEmpty = list2.isEmpty();
        ArrayList arrayList = list2;
        if (isEmpty) {
            int size = list.size();
            ArrayList arrayList2 = new ArrayList(size);
            for (int i2 = 0; i2 < size; i2++) {
                arrayList2.add("ASC");
            }
            arrayList = arrayList2;
        }
        this.A00 = arrayList;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AnonymousClass0RO) {
            AnonymousClass0RO r5 = (AnonymousClass0RO) obj;
            if (this.A03 == r5.A03 && C18450wi.A0R(this.A02, r5.A02) && C18450wi.A0R(this.A00, r5.A00)) {
                String str = this.A01;
                boolean A0P = C008703y.A0N(str, "index_");
                String str2 = r5.A01;
                return A0P ? C008703y.A0N(str2, "index_") : C18450wi.A0R(str, str2);
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.A01;
        return AnonymousClass000.A0E(this.A02, (((C008703y.A0N(str, "index_") ? -1184239155 : str.hashCode()) * 31) + (this.A03 ? 1 : 0)) * 31) + this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("Index{name='");
        A0r.append(this.A01);
        A0r.append("', unique=");
        A0r.append(this.A03);
        A0r.append(", columns=");
        A0r.append(this.A02);
        A0r.append(", orders=");
        A0r.append(this.A00);
        return AnonymousClass000.A0h("'}", A0r);
    }
}
