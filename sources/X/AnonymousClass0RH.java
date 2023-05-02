package X;

import java.util.List;

/* renamed from: X.0RH  reason: invalid class name */
public final class AnonymousClass0RH {
    public final int A00;
    public final String A01;
    public final List A02;

    public AnonymousClass0RH(List list, int i2, String str) {
        C18450wi.A0H(str, 1);
        this.A01 = str;
        this.A00 = i2;
        this.A02 = list;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass0RH) {
                AnonymousClass0RH r5 = (AnonymousClass0RH) obj;
                if (!C18450wi.A0R(this.A01, r5.A01) || this.A00 != r5.A00 || !C18450wi.A0R(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((this.A01.hashCode() * 31) + this.A00) * 31) + this.A02.hashCode();
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("AsyncComponentContainerTargetInfo(serverId=");
        A0r.append(this.A01);
        A0r.append(", clientId=");
        A0r.append(this.A00);
        A0r.append(", keyPath=");
        A0r.append(this.A02);
        return AnonymousClass000.A0j(A0r);
    }
}
