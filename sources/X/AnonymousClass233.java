package X;

/* renamed from: X.233  reason: invalid class name */
public class AnonymousClass233 {
    public static final void A0S(Appendable appendable, Object obj) {
        CharSequence charSequence;
        if (obj == null || (obj instanceof CharSequence)) {
            charSequence = (CharSequence) obj;
        } else if (obj instanceof Character) {
            appendable.append(((Character) obj).charValue());
            return;
        } else {
            charSequence = String.valueOf(obj);
        }
        appendable.append(charSequence);
    }
}
