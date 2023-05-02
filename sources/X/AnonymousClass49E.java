package X;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.49E  reason: invalid class name */
public class AnonymousClass49E {
    public static final Map A00;

    static {
        Class<C99624uK> cls = C99624uK.class;
        HashMap A0x = AnonymousClass000.A0x();
        A0x.put("avg", C70223gJ.class);
        A0x.put("stddev", C70233gK.class);
        A0x.put("sum", C70213gI.class);
        A0x.put("min", C70203gH.class);
        A0x.put("max", C70193gG.class);
        A0x.put("concat", C99614uJ.class);
        A0x.put("length", cls);
        A0x.put("size", cls);
        A0x.put("append", C99594uH.class);
        A0x.put("keys", C99604uI.class);
        A00 = Collections.unmodifiableMap(A0x);
    }
}
