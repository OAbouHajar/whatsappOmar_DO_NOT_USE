package X;

import java.util.List;

/* renamed from: X.0Re  reason: invalid class name and case insensitive filesystem */
public final class C05420Re {
    public int A00;
    public C007203h A01;
    public AnonymousClass0KV A02;
    public String A03;
    public List A04;
    public List A05;
    public final int A06;

    public C05420Re(C007203h r2, AnonymousClass0KV r3, String str, List list, List list2, int i2, int i3) {
        C18450wi.A0H(str, 1);
        C18450wi.A0H(r3, 2);
        this.A03 = str;
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = i2;
        this.A06 = i3;
        this.A05 = list;
        this.A04 = list2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C05420Re) {
                C05420Re r5 = (C05420Re) obj;
                if (!C18450wi.A0R(this.A03, r5.A03) || this.A02 != r5.A02 || !C18450wi.A0R(this.A01, r5.A01) || this.A00 != r5.A00 || this.A06 != r5.A06 || !C18450wi.A0R(this.A05, r5.A05) || !C18450wi.A0R(this.A04, r5.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int A0E = AnonymousClass000.A0E(this.A02, this.A03.hashCode() * 31);
        return AnonymousClass000.A0E(this.A05, (((AnonymousClass000.A0E(this.A01, A0E) + this.A00) * 31) + this.A06) * 31) + this.A04.hashCode();
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WorkInfoPojo(id=");
        A0r.append(this.A03);
        A0r.append(", state=");
        A0r.append(this.A02);
        A0r.append(", output=");
        A0r.append(this.A01);
        A0r.append(", runAttemptCount=");
        A0r.append(this.A00);
        A0r.append(", generation=");
        A0r.append(this.A06);
        A0r.append(", tags=");
        A0r.append(this.A05);
        A0r.append(", progress=");
        A0r.append(this.A04);
        return AnonymousClass000.A0j(A0r);
    }
}
