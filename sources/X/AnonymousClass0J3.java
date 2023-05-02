package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.0J3  reason: invalid class name */
public final class AnonymousClass0J3 extends AnonymousClass4Q1 {
    public final AnonymousClass2Wa A00;
    public final C88894bG A01;
    public final List A02;
    public final Map A03;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AnonymousClass0J3(AnonymousClass2Wa r3, C88894bG r4) {
        this(r3, r4, AnonymousClass1JA.A0P(), C25411Jr.A01());
        C18450wi.A0H(r3, 1);
        C18450wi.A0H(r4, 2);
    }

    public AnonymousClass0J3(AnonymousClass2Wa r1, C88894bG r2, List list, Map map) {
        super(r2);
        this.A00 = r1;
        this.A02 = list;
        this.A03 = map;
        this.A01 = r2;
    }

    public final AnonymousClass2Wa A01() {
        return this.A00;
    }

    public final List A02() {
        return this.A02;
    }

    public final Map A03() {
        return this.A03;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass0J3) {
                AnonymousClass0J3 r5 = (AnonymousClass0J3) obj;
                if (!C18450wi.A0R(this.A00, r5.A00) || !C18450wi.A0R(this.A02, r5.A02) || !C18450wi.A0R(this.A03, r5.A03) || !C18450wi.A0R(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0E(this.A03, AnonymousClass000.A0E(this.A02, this.A00.hashCode() * 31)) + this.A01.hashCode();
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("Success(data=");
        A0r.append(this.A00);
        A0r.append(", actions=");
        A0r.append(this.A02);
        A0r.append(", externalVariables=");
        A0r.append(this.A03);
        A0r.append(", fetchSummaryData=");
        A0r.append(this.A01);
        return AnonymousClass000.A0j(A0r);
    }
}
