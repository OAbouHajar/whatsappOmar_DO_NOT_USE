package X;

import java.util.AbstractMap;
import java.util.Map;

/* renamed from: X.3cN  reason: invalid class name and case insensitive filesystem */
public class C67783cN extends C34641kb<Map.Entry<K, V>> {
    public final /* synthetic */ C67913ca this$0;

    public C67783cN(C67913ca r1) {
        this.this$0 = r1;
    }

    public Map.Entry get(int i2) {
        C29031Zu.A01(i2, this.this$0.size);
        C67913ca r0 = this.this$0;
        Object[] access$100 = r0.alternatingKeysAndValues;
        int i3 = i2 << 1;
        return new AbstractMap.SimpleImmutableEntry(access$100[C67913ca.access$200(r0) + i3], access$100[i3 + 1]);
    }

    public boolean isPartialView() {
        return true;
    }

    public int size() {
        return this.this$0.size;
    }
}
