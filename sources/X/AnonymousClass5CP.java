package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.5CP  reason: invalid class name */
public class AnonymousClass5CP extends LinkedHashMap<K, V> {
    public final /* synthetic */ C83284Gb this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5CP(C83284Gb r3, int i2) {
        super(i2, 0.75f, true);
        this.this$0 = r3;
    }

    public boolean removeEldestEntry(Map.Entry entry) {
        return C13700nu.A0g(size(), this.this$0.A00);
    }
}
