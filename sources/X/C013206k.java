package X;

/* renamed from: X.06k  reason: invalid class name and case insensitive filesystem */
public class C013206k implements C013106j {
    public static final C013206k A00 = new C013206k();

    public int A66(CharSequence charSequence, int i2, int i3) {
        boolean z2 = false;
        for (int i4 = 0; i4 < i3; i4++) {
            byte directionality = Character.getDirectionality(charSequence.charAt(i4));
            if (directionality == 0) {
                z2 = true;
            } else if (directionality == 1 || directionality == 2) {
                return 0;
            }
        }
        return z2 ? 1 : 2;
    }
}
