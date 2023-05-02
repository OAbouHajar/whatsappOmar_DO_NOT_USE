package X;

import com.whatsapp.util.Log;

/* renamed from: X.28V  reason: invalid class name */
public final class AnonymousClass28V extends AnonymousClass1DR implements AnonymousClass22J {
    public final /* synthetic */ AnonymousClass22J $callback;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass28V(AnonymousClass22J r2) {
        super(1);
        this.$callback = r2;
    }

    public /* bridge */ /* synthetic */ Object AIU(Object obj) {
        Throwable th = (Throwable) obj;
        C18450wi.A0H(th, 0);
        Log.e(th);
        this.$callback.AIU(Boolean.FALSE);
        return AnonymousClass22M.A00;
    }
}
