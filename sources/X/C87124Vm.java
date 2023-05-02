package X;

import java.util.List;

/* renamed from: X.4Vm  reason: invalid class name and case insensitive filesystem */
public final class C87124Vm {
    public final List A00;
    public final List A01;

    public C87124Vm(List list, List list2) {
        this.A01 = list;
        this.A00 = list2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C87124Vm) {
                C87124Vm r5 = (C87124Vm) obj;
                if (!C18450wi.A0R(this.A01, r5.A01) || !C18450wi.A0R(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i2 = 0;
        int A0C = AnonymousClass000.A0C(this.A01) * 31;
        List list = this.A00;
        if (list != null) {
            i2 = list.hashCode();
        }
        return A0C + i2;
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("BusinessSearchSuggestion(suggestedSearches=");
        A0r.append(this.A01);
        A0r.append(", popularSearches=");
        return AnonymousClass3K2.A0k(this.A00, A0r);
    }
}
