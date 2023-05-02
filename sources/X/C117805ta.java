package X;

import android.text.TextUtils;
import java.util.HashMap;

/* renamed from: X.5ta  reason: invalid class name and case insensitive filesystem */
public final class C117805ta {
    public HashMap A00(String str) {
        HashMap A0x = AnonymousClass000.A0x();
        if (!TextUtils.isEmpty(str)) {
            int i2 = 0;
            while (true) {
                int length = str.length();
                if (i2 >= length) {
                    break;
                }
                int i3 = i2 + 2;
                String substring = i3 < length ? str.substring(i2, i3) : null;
                i2 += 2;
                int i4 = i2 + 2;
                int parseInt = i4 < length ? Integer.parseInt(str.substring(i2, i4)) : -1;
                if (!(substring == null || parseInt == -1)) {
                    i2 += 2;
                    int i5 = parseInt + i2;
                    String substring2 = i5 <= length ? str.substring(i2, i5) : null;
                    if (!TextUtils.isEmpty(substring2)) {
                        A0x.put(substring, substring2);
                        i2 += parseInt;
                    }
                }
            }
        }
        return A0x;
    }
}
