package X;

import java.security.PublicKey;
import java.security.cert.X509Certificate;

/* renamed from: X.5Fh  reason: invalid class name and case insensitive filesystem */
public final class C106815Fh extends AnonymousClass1DR implements AnonymousClass22J {
    public final /* synthetic */ AnonymousClass5SY $callback;
    public final /* synthetic */ AnonymousClass4UI $operationRetryState;
    public final /* synthetic */ C214113z this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C106815Fh(AnonymousClass5SY r2, AnonymousClass4UI r3, C214113z r4) {
        super(1);
        this.this$0 = r4;
        this.$callback = r2;
        this.$operationRetryState = r3;
    }

    public /* bridge */ /* synthetic */ Object AIU(Object obj) {
        AnonymousClass4WO r7 = (AnonymousClass4WO) obj;
        C18450wi.A0H(r7, 0);
        C214113z r0 = this.this$0;
        X509Certificate x509Certificate = r7.A02;
        PublicKey publicKey = r7.A01;
        r0.AaU(this.$callback, this.$operationRetryState, r7.A00, publicKey, x509Certificate);
        return AnonymousClass22M.A00;
    }
}
