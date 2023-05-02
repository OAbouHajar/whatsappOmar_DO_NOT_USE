package X;

import java.util.List;

/* renamed from: X.0RV  reason: invalid class name */
public final class AnonymousClass0RV {
    public final String A00;
    public final String A01;
    public final String A02;
    public final List A03;
    public final List A04;

    public AnonymousClass0RV(String str, String str2, String str3, List list, List list2) {
        C18450wi.A0H(str, 1);
        C18450wi.A0H(str2, 2);
        C18450wi.A0H(str3, 3);
        C18450wi.A0H(list, 4);
        C18450wi.A0H(list2, 5);
        this.A02 = str;
        this.A00 = str2;
        this.A01 = str3;
        this.A03 = list;
        this.A04 = list2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass0RV)) {
            return false;
        }
        AnonymousClass0RV r4 = (AnonymousClass0RV) obj;
        if (!C18450wi.A0R(this.A02, r4.A02) || !C18450wi.A0R(this.A00, r4.A00) || !C18450wi.A0R(this.A01, r4.A01) || !C18450wi.A0R(this.A03, r4.A03)) {
            return false;
        }
        return C18450wi.A0R(this.A04, r4.A04);
    }

    public int hashCode() {
        return AnonymousClass000.A0E(this.A03, ((((this.A02.hashCode() * 31) + this.A00.hashCode()) * 31) + this.A01.hashCode()) * 31) + this.A04.hashCode();
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("ForeignKey{referenceTable='");
        A0r.append(this.A02);
        A0r.append("', onDelete='");
        A0r.append(this.A00);
        A0r.append(" +', onUpdate='");
        A0r.append(this.A01);
        A0r.append("', columnNames=");
        A0r.append(this.A03);
        A0r.append(", referenceColumnNames=");
        A0r.append(this.A04);
        return AnonymousClass000.A0k(A0r);
    }
}
