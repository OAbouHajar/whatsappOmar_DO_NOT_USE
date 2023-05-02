package X;

import java.util.HashMap;

/* renamed from: X.0iS  reason: invalid class name and case insensitive filesystem */
public class C11260iS extends HashMap<String, Object> {
    public final /* synthetic */ C03440In this$0;
    public final /* synthetic */ String val$surface;

    public C11260iS(C03440In r3, String str) {
        this.this$0 = r3;
        this.val$surface = str;
        put("surface", str);
        put("bytes_downloaded", Long.valueOf(r3.A01.get()));
        put("cache_hit_count", Long.valueOf(r3.A00.get()));
        put("cache_miss_count", Long.valueOf(r3.A01.get()));
    }
}
