package X;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

/* renamed from: X.4Hk  reason: invalid class name and case insensitive filesystem */
public final class C83624Hk {
    public final Collection A00;
    public final Collection A01;

    public C83624Hk(String... strArr) {
        this.A00 = r4 != 0 ? r4 != 1 ? (r4 == 2 || r4 == 3 || r4 == 4 || r4 == 5) ? Arrays.asList(strArr) : new HashSet(Arrays.asList(strArr)) : Collections.singleton(strArr[0]) : Collections.emptySet();
        this.A01 = C13680ns.A0o();
        for (String str : strArr) {
            Collection collection = this.A01;
            Object[] objArr = (Object[]) AnonymousClass3AA.A02.A00.get(str);
            AnonymousClass00B.A06(objArr);
            Collections.addAll(collection, objArr);
        }
    }
}
