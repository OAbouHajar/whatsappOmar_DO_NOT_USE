package X;

import java.security.PublicKey;
import java.security.cert.X509Certificate;

/* renamed from: X.5Fo  reason: invalid class name and case insensitive filesystem */
public final class C106885Fo extends AnonymousClass1DR implements AnonymousClass22J {
    public final /* synthetic */ AnonymousClass5SY $callback;
    public final /* synthetic */ AnonymousClass4UI $operationRetryState;
    public final /* synthetic */ AnonymousClass28T $userEntity;
    public final /* synthetic */ C214113z this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C106885Fo(AnonymousClass28T r2, AnonymousClass5SY r3, AnonymousClass4UI r4, C214113z r5) {
        super(1);
        this.this$0 = r5;
        this.$userEntity = r2;
        this.$callback = r3;
        this.$operationRetryState = r4;
    }

    public /* bridge */ /* synthetic */ Object AIU(Object obj) {
        AnonymousClass4WO r8 = (AnonymousClass4WO) obj;
        C18450wi.A0H(r8, 0);
        C214113z r0 = this.this$0;
        X509Certificate x509Certificate = r8.A02;
        AnonymousClass28T r1 = this.$userEntity;
        PublicKey publicKey = r8.A01;
        r0.AaY(r1, this.$callback, this.$operationRetryState, r8.A00, publicKey, x509Certificate);
        return AnonymousClass22M.A00;
    }
}
