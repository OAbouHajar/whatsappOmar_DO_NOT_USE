package X;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* renamed from: X.0Rc  reason: invalid class name */
public final class AnonymousClass0Rc {
    public int A00;
    public C007203h A01;
    public C007203h A02;
    public AnonymousClass0KV A03;
    public Set A04;
    public UUID A05;

    public AnonymousClass0Rc(C007203h r2, C007203h r3, AnonymousClass0KV r4, List list, UUID uuid, int i2) {
        this.A05 = uuid;
        this.A03 = r4;
        this.A01 = r2;
        this.A04 = new HashSet(list);
        this.A02 = r3;
        this.A00 = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && AnonymousClass0Rc.class == obj.getClass()) {
            AnonymousClass0Rc r4 = (AnonymousClass0Rc) obj;
            if (this.A00 == r4.A00 && this.A05.equals(r4.A05) && this.A03 == r4.A03 && this.A01.equals(r4.A01) && this.A04.equals(r4.A04)) {
                return this.A02.equals(r4.A02);
            }
        }
        return false;
    }

    public int hashCode() {
        int A0E = AnonymousClass000.A0E(this.A03, this.A05.hashCode() * 31);
        return AnonymousClass000.A0E(this.A02, (AnonymousClass000.A0E(this.A01, A0E) + this.A04.hashCode()) * 31) + this.A00;
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WorkInfo{mId='");
        A0r.append(this.A05);
        A0r.append('\'');
        A0r.append(", mState=");
        A0r.append(this.A03);
        A0r.append(", mOutputData=");
        A0r.append(this.A01);
        A0r.append(", mTags=");
        A0r.append(this.A04);
        A0r.append(", mProgress=");
        A0r.append(this.A02);
        return AnonymousClass000.A0k(A0r);
    }
}
