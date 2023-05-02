package X;

import android.text.TextUtils;
import java.util.AbstractMap;

/* renamed from: X.1W0  reason: invalid class name */
public class AnonymousClass1W0 {
    public static int A00(String str) {
        Integer A01;
        if (TextUtils.isEmpty(str) || !AnonymousClass4B1.A02.containsKey(str) || (A01 = A01(str, "stable_release")) == null) {
            return 1;
        }
        return A01.intValue();
    }

    public static Integer A01(String str, String str2) {
        AbstractMap abstractMap = (AbstractMap) AnonymousClass4B1.A02.get(str);
        if (abstractMap != null) {
            return (Integer) abstractMap.get(str2);
        }
        return null;
    }
}
