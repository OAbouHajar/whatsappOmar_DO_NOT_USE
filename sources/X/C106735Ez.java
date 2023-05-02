package X;

import java.security.PublicKey;
import java.security.cert.X509Certificate;

/* renamed from: X.5Ez  reason: invalid class name and case insensitive filesystem */
public final class C106735Ez extends AnonymousClass1DR implements AnonymousClass1DU {
    public final /* synthetic */ X509Certificate $encryptionCert;
    public final /* synthetic */ AnonymousClass5SY $operationCallback;
    public final /* synthetic */ Integer $passwordKeyId;
    public final /* synthetic */ PublicKey $passwordPublicKey;
    public final /* synthetic */ AnonymousClass4UI $requestRetryState;
    public final /* synthetic */ C214113z this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C106735Ez(AnonymousClass5SY r2, AnonymousClass4UI r3, C214113z r4, Integer num, PublicKey publicKey, X509Certificate x509Certificate) {
        super(0);
        this.this$0 = r4;
        this.$encryptionCert = x509Certificate;
        this.$passwordPublicKey = publicKey;
        this.$passwordKeyId = num;
        this.$operationCallback = r2;
        this.$requestRetryState = r3;
    }

    public /* bridge */ /* synthetic */ Object AIT() {
        C214113z r0 = this.this$0;
        X509Certificate x509Certificate = this.$encryptionCert;
        PublicKey publicKey = this.$passwordPublicKey;
        r0.AaU(this.$operationCallback, this.$requestRetryState, this.$passwordKeyId, publicKey, x509Certificate);
        return AnonymousClass22M.A00;
    }
}
