package X;

import android.text.TextUtils;
import com.obwhatsapp.emoji.EmojiDescriptor;

/* renamed from: X.1dK  reason: invalid class name and case insensitive filesystem */
public abstract class C31011dK {
    public static int A00(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            return 0;
        }
        return A01(charSequence, 0, charSequence.length());
    }

    public static int A01(CharSequence charSequence, int i2, int i3) {
        int length = charSequence.length();
        if (i2 < 0 || i3 > length || i2 > i3) {
            throw new IndexOutOfBoundsException();
        }
        int i4 = 0;
        if (length != 0) {
            C435020g r2 = new C435020g(charSequence);
            while (i2 < i3) {
                r2.A00 = i2;
                i2 += r2.A01(i2, EmojiDescriptor.A00(r2, false));
                i4++;
            }
        }
        return i4;
    }
}
