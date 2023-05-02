package X;

import com.facebook.redex.RunnableRunnableShape1S0700000_I1;
import java.security.PublicKey;
import java.security.cert.X509Certificate;

/* renamed from: X.5Fq  reason: invalid class name and case insensitive filesystem */
public final class C106905Fq extends AnonymousClass1DR implements AnonymousClass22J {
    public final /* synthetic */ AnonymousClass5SY $callback;
    public final /* synthetic */ X509Certificate $encryptionCert;
    public final /* synthetic */ AnonymousClass4UI $operationRetryState;
    public final /* synthetic */ Integer $passwordKeyId;
    public final /* synthetic */ PublicKey $passwordPublicKey;
    public final /* synthetic */ AnonymousClass28T $userEntity;
    public final /* synthetic */ C214113z this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C106905Fq(AnonymousClass28T r2, AnonymousClass5SY r3, AnonymousClass4UI r4, C214113z r5, Integer num, PublicKey publicKey, X509Certificate x509Certificate) {
        super(1);
        this.this$0 = r5;
        this.$encryptionCert = x509Certificate;
        this.$userEntity = r2;
        this.$passwordPublicKey = publicKey;
        this.$passwordKeyId = num;
        this.$callback = r3;
        this.$operationRetryState = r4;
    }

    public /* bridge */ /* synthetic */ Object AIU(Object obj) {
        C48802Pe r10 = (C48802Pe) obj;
        C18450wi.A0H(r10, 0);
        C214113z r5 = this.this$0;
        X509Certificate x509Certificate = this.$encryptionCert;
        AnonymousClass28T r2 = this.$userEntity;
        PublicKey publicKey = this.$passwordPublicKey;
        RunnableRunnableShape1S0700000_I1 runnableRunnableShape1S0700000_I1 = new RunnableRunnableShape1S0700000_I1(r2, this.$callback, this.$operationRetryState, r5, this.$passwordKeyId, publicKey, x509Certificate, 2);
        C213913x r7 = this.this$0.A03;
        int A00 = C34451kH.A00(r10.node);
        r7.A00(this.$callback, this.$operationRetryState, r10, runnableRunnableShape1S0700000_I1, A00);
        return AnonymousClass22M.A00;
    }
}
