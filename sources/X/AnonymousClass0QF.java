package X;

/* renamed from: X.0QF  reason: invalid class name */
public class AnonymousClass0QF {
    public final int A00;
    public final CharSequence A01;

    public AnonymousClass0QF(int i2, CharSequence charSequence) {
        this.A00 = i2;
        this.A01 = charSequence;
    }

    public boolean equals(Object obj) {
        if (obj instanceof AnonymousClass0QF) {
            AnonymousClass0QF r5 = (AnonymousClass0QF) obj;
            if (this.A00 == r5.A00) {
                CharSequence charSequence = r5.A01;
                CharSequence charSequence2 = this.A01;
                String charSequence3 = charSequence2 != null ? charSequence2.toString() : null;
                String charSequence4 = charSequence != null ? charSequence.toString() : null;
                if (charSequence3 == null) {
                    return charSequence4 == null;
                }
                if (charSequence3.equals(charSequence4)) {
                    return true;
                }
            }
        }
    }

    public int hashCode() {
        Object[] objArr = new Object[2];
        AnonymousClass000.A1K(objArr, this.A00);
        CharSequence charSequence = this.A01;
        return AnonymousClass000.A0F(charSequence != null ? charSequence.toString() : null, objArr, 1);
    }
}
