package X;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: X.3ci  reason: invalid class name and case insensitive filesystem */
public class C67993ci extends AnonymousClass4VN {
    public final /* synthetic */ Comparator val$comparator;

    public C67993ci(Comparator comparator) {
        this.val$comparator = comparator;
    }

    public Map createMap() {
        return new TreeMap(this.val$comparator);
    }
}
