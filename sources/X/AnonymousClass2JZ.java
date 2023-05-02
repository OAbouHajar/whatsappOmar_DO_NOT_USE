package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2JZ  reason: invalid class name */
public class AnonymousClass2JZ extends LinkedHashMap<C28381Vw, Long> {
    public final /* synthetic */ AnonymousClass1L1 this$0;

    public AnonymousClass2JZ(AnonymousClass1L1 r1) {
        this.this$0 = r1;
    }

    public boolean removeEldestEntry(Map.Entry entry) {
        return ((long) size()) > 240;
    }
}
