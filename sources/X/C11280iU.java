package X;

import java.util.HashMap;

/* renamed from: X.0iU  reason: invalid class name and case insensitive filesystem */
public class C11280iU extends HashMap<String, Object> {
    public final /* synthetic */ AnonymousClass09W this$0;
    public final /* synthetic */ long val$currentTime;
    public final /* synthetic */ String val$surface;

    public C11280iU(AnonymousClass09W r3, String str, long j2) {
        this.this$0 = r3;
        this.val$currentTime = j2;
        this.val$surface = str;
        put("duration", Long.valueOf(j2 - r3.A0K));
        put("surface", str == null ? "unknown" : str);
    }
}
