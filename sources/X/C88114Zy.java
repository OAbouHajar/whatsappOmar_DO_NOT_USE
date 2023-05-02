package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.4Zy  reason: invalid class name and case insensitive filesystem */
public final class C88114Zy {
    public static final AnonymousClass4PZ A03 = new AnonymousClass4PZ();
    public final String A00;
    public final Map A01;
    public final C88114Zy[] A02;

    public C88114Zy(String str, C88114Zy[] r7) {
        LinkedHashMap linkedHashMap;
        this.A00 = str;
        this.A02 = r7;
        if (r7 == null) {
            linkedHashMap = null;
        } else {
            int length = r7.length;
            int A07 = C25421Js.A07(length);
            linkedHashMap = new LinkedHashMap(A07 < 16 ? 16 : A07);
            int i2 = 0;
            while (i2 < length) {
                C88114Zy r1 = r7[i2];
                i2++;
                linkedHashMap.put(r1.A00, r1);
            }
        }
        this.A01 = linkedHashMap;
    }
}
