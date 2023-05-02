package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1Qw  reason: invalid class name and case insensitive filesystem */
public class C27211Qw {
    public final Map A00 = new HashMap();
    public final Map A01 = new HashMap();
    public final Map A02 = new HashMap();

    public final Map A00(String str) {
        HashMap hashMap;
        HashMap hashMap2 = new HashMap();
        Map map = (Map) this.A01.get(str);
        if (map != null) {
            hashMap = new HashMap(map);
        }
        hashMap2.put("data", hashMap);
        hashMap2.put("context", new HashMap(this.A00));
        return hashMap2;
    }
}
