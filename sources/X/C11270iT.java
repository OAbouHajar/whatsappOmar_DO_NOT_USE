package X;

import java.util.HashMap;

/* renamed from: X.0iT  reason: invalid class name and case insensitive filesystem */
public class C11270iT extends HashMap<String, Object> {
    public final /* synthetic */ AnonymousClass09W this$0;
    public final /* synthetic */ long val$currentTime;
    public final /* synthetic */ String val$surface;

    public C11270iT(AnonymousClass09W r3, String str, long j2) {
        this.this$0 = r3;
        this.val$currentTime = j2;
        this.val$surface = str;
        put("duration", Long.valueOf(j2 - r3.A0H));
        put("surface", str == null ? "unknown" : str);
    }
}
