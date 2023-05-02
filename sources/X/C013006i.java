package X;

/* renamed from: X.06i  reason: invalid class name and case insensitive filesystem */
public class C013006i implements C013106j {
    public static final C013006i A00 = new C013006i();

    public int A66(CharSequence charSequence, int i2, int i3) {
        int i4 = 2;
        for (int i5 = 0; i5 < i3 && i4 == 2; i5++) {
            byte directionality = Character.getDirectionality(charSequence.charAt(i5));
            i4 = 1;
            if (directionality != 0) {
                if (!(directionality == 1 || directionality == 2)) {
                    switch (directionality) {
                        case 14:
                        case 15:
                            break;
                        case 16:
                        case 17:
                            break;
                        default:
                            i4 = 2;
                            continue;
                    }
                }
                i4 = 0;
            }
        }
        return i4;
    }
}
