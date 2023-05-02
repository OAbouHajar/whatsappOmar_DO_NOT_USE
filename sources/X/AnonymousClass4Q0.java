package X;

import java.util.LinkedHashMap;
import java.util.regex.Pattern;

/* renamed from: X.4Q0  reason: invalid class name */
public class AnonymousClass4Q0 {
    public C83284Gb A00;

    public AnonymousClass4Q0(int i2) {
        this.A00 = new C83284Gb(i2);
    }

    public Pattern A00(String str) {
        LinkedHashMap linkedHashMap;
        Object obj;
        C83284Gb r2 = this.A00;
        synchronized (r2) {
            linkedHashMap = r2.A01;
            obj = linkedHashMap.get(str);
        }
        Pattern pattern = (Pattern) obj;
        if (pattern == null) {
            pattern = Pattern.compile(str);
            synchronized (r2) {
                linkedHashMap.put(str, pattern);
            }
        }
        return pattern;
    }
}
