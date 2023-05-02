package X;

/* renamed from: X.4Vk  reason: invalid class name */
public final class AnonymousClass4Vk {
    public final String A00;
    public final String A01;

    public AnonymousClass4Vk(String str, String str2) {
        this.A01 = str;
        this.A00 = str2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4Vk) {
                AnonymousClass4Vk r5 = (AnonymousClass4Vk) obj;
                if (!C18450wi.A0R(this.A01, r5.A01) || !C18450wi.A0R(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass3K4.A08(this.A00, AnonymousClass3K4.A07(this.A01));
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("CounterAbuseData(nonce=");
        A0r.append(this.A01);
        A0r.append(", counterAbuseToken=");
        A0r.append(this.A00);
        return AnonymousClass000.A0j(A0r);
    }
}
