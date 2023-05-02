package X;

/* renamed from: X.5DB  reason: invalid class name */
public class AnonymousClass5DB extends C1042554o implements AnonymousClass1DT, AnonymousClass1DS, AnonymousClass5VG {
    public final int arity;
    public final int flags = 0;

    public AnonymousClass5DB(Class cls, Object obj, String str, String str2, int i2) {
        super(cls, obj, str, str2, false);
        this.arity = i2;
    }

    public int A9z() {
        return this.arity;
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof AnonymousClass5DB)) {
                return false;
            }
            AnonymousClass5DB r4 = (AnonymousClass5DB) obj;
            if (!C18450wi.A0R(A00(), r4.A00()) || !this.name.equals(r4.name) || !this.signature.equals(r4.signature) || this.flags != r4.flags || this.arity != r4.arity || !C18450wi.A0R(this.receiver, r4.receiver)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass3K4.A08(this.signature, AnonymousClass3K2.A09(this.name, A00() == null ? 0 : AnonymousClass3K3.A0H(A00())));
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
        String str = this.name;
        if ("<init>".equals(str)) {
            return "constructor (Kotlin reflection is not available)";
        }
        StringBuilder A0r = AnonymousClass000.A0r("function ");
        A0r.append(str);
        return AnonymousClass000.A0h(" (Kotlin reflection is not available)", A0r);
    }
}
