package X;

/* renamed from: X.4WZ  reason: invalid class name */
public final class AnonymousClass4WZ {
    public final Object A00;
    public final Object A01;
    public final Throwable A02;
    public final AnonymousClass22J A03;
    public final AnonymousClass5GF A04;

    public AnonymousClass4WZ(Object obj, Object obj2, Throwable th, AnonymousClass22J r4, AnonymousClass5GF r5) {
        this.A01 = obj;
        this.A04 = r5;
        this.A03 = r4;
        this.A00 = obj2;
        this.A02 = th;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4WZ) {
                AnonymousClass4WZ r5 = (AnonymousClass4WZ) obj;
                if (!C18450wi.A0R(this.A01, r5.A01) || !C18450wi.A0R(this.A04, r5.A04) || !C18450wi.A0R(this.A03, r5.A03) || !C18450wi.A0R(this.A00, r5.A00) || !C18450wi.A0R(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i2 = 0;
        int A0C = ((((((AnonymousClass000.A0C(this.A01) * 31) + AnonymousClass000.A0C(this.A04)) * 31) + AnonymousClass000.A0C(this.A03)) * 31) + AnonymousClass000.A0C(this.A00)) * 31;
        Throwable th = this.A02;
        if (th != null) {
            i2 = th.hashCode();
        }
        return A0C + i2;
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("CompletedContinuation(result=");
        A0r.append(this.A01);
        A0r.append(", cancelHandler=");
        A0r.append(this.A04);
        A0r.append(", onCancellation=");
        A0r.append(this.A03);
        A0r.append(", idempotentResume=");
        A0r.append(this.A00);
        A0r.append(", cancelCause=");
        return AnonymousClass3K2.A0k(this.A02, A0r);
    }
}
