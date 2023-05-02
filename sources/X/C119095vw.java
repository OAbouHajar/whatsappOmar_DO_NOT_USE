package X;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.5vw  reason: invalid class name and case insensitive filesystem */
public class C119095vw {
    public static AnonymousClass01Q A00(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            Object obj = str;
            if (TextUtils.isEmpty(str2)) {
                List asList = Arrays.asList(str.split("\\|"));
                if (asList.size() == 2) {
                    Object A0Z = C13690nt.A0Z(asList);
                    str2 = TextUtils.join(".", asList);
                    obj = A0Z;
                }
            }
            return new AnonymousClass01Q(obj, str2);
        }
        return null;
    }
}
