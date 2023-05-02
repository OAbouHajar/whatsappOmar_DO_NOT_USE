package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1aZ  reason: invalid class name and case insensitive filesystem */
public class C29401aZ extends LinkedHashMap<String, String> {
    public final /* synthetic */ C29391aY this$1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C29401aZ(C29391aY r4) {
        super(64, 0.75f, true);
        this.this$1 = r4;
    }

    public boolean removeEldestEntry(Map.Entry entry) {
        return size() > 64;
    }
}
