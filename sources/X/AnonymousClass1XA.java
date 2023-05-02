package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: X.1XA  reason: invalid class name */
public class AnonymousClass1XA {
    public static final String[] A00 = new String[0];

    public static Boolean A00(String str) {
        if ("1".equals(str)) {
            return Boolean.TRUE;
        }
        if ("0".equals(str)) {
            return Boolean.FALSE;
        }
        return null;
    }

    public static String[] A01(C15830rv r6, C28381Vw r7, String[] strArr) {
        int length = strArr.length;
        String[] strArr2 = new String[(length + 4)];
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            strArr2[i3] = strArr[i2];
            i2++;
            i3++;
        }
        int i4 = i3 + 1;
        C15830rv r0 = r7.A00;
        AnonymousClass00B.A06(r0);
        strArr2[i3] = r0.getRawString();
        int i5 = i4 + 1;
        strArr2[i4] = r7.A01;
        int i6 = i5 + 1;
        strArr2[i5] = r7.A02 ? "1" : "0";
        strArr2[i6] = r6 != null ? r6.getRawString() : "0";
        return strArr2;
    }

    public static String[] A02(Collection collection) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(((AnonymousClass1WJ) it.next()).A03());
        }
        return (String[]) linkedHashSet.toArray(A00);
    }
}
