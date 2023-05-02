package X;

/* renamed from: X.5D7  reason: invalid class name */
public abstract class AnonymousClass5D7 extends C1042554o implements AnonymousClass5VF {
    public AnonymousClass5D7() {
        super((Class) null, C1042554o.A01, (String) null, (String) null, false);
    }

    public AnonymousClass5D7(Object obj) {
        super(AnonymousClass486.class, obj, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", true);
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof AnonymousClass5D7) {
                C1042554o r4 = (C1042554o) obj;
                if (!A00().equals(r4.A00()) || !this.name.equals(r4.name) || !this.signature.equals(r4.signature) || !C18450wi.A0R(this.receiver, r4.receiver)) {
                    return false;
                }
            } else if (!(obj instanceof AnonymousClass5VF)) {
                return false;
            } else {
                AnonymousClass5VG r0 = this.A00;
                if (r0 == null) {
                    r0 = this;
                    this.A00 = this;
                }
                return obj.equals(r0);
            }
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass3K4.A08(this.signature, AnonymousClass3K2.A09(this.name, AnonymousClass3K3.A0H(A00())));
    }

    public String toString() {
        AnonymousClass5VG r0 = this.A00;
        if (r0 == null) {
            r0 = this;
            this.A00 = this;
        }
        if (r0 != this) {
            return r0.toString();
        }
        StringBuilder A0r = AnonymousClass000.A0r("property ");
        A0r.append(this.name);
        return AnonymousClass000.A0h(" (Kotlin reflection is not available)", A0r);
    }
}
