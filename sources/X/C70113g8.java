package X;

/* renamed from: X.3g8  reason: invalid class name and case insensitive filesystem */
public class C70113g8 extends C89494cI {
    public final Boolean A00;

    public C70113g8(CharSequence charSequence) {
        this.A00 = Boolean.valueOf(Boolean.parseBoolean(charSequence.toString()));
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C70113g8)) {
                return false;
            }
            Boolean bool = this.A00;
            Boolean bool2 = ((C70113g8) obj).A00;
            if (bool == null) {
                return bool2 == null;
            }
            if (!bool.equals(bool2)) {
                return false;
            }
        }
    }

    public String toString() {
        return this.A00.toString();
    }
}
