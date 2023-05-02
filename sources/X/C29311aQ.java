package X;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.net.ssl.SSLSession;

/* renamed from: X.1aQ  reason: invalid class name and case insensitive filesystem */
public class C29311aQ extends LinkedHashMap<C29331aS, SSLSession> {
    public final /* synthetic */ C219916f this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C29311aQ(C219916f r4) {
        super(64, 0.75f, true);
        this.this$0 = r4;
    }

    public boolean removeEldestEntry(Map.Entry entry) {
        return size() > this.this$0.A02;
    }
}
