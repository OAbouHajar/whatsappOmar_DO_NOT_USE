package X;

import com.facebook.redex.RunnableRunnableShape1S0700000_I1;
import java.security.PublicKey;
import java.security.cert.X509Certificate;

/* renamed from: X.5Fr  reason: invalid class name and case insensitive filesystem */
public final class C106915Fr extends AnonymousClass1DR implements AnonymousClass22J {
    public final /* synthetic */ AnonymousClass5SY $callback;
    public final /* synthetic */ X509Certificate $encryptionCert;
    public final /* synthetic */ AnonymousClass4UI $operationRetryState;
    public final /* synthetic */ Integer $passwordKeyId;
    public final /* synthetic */ PublicKey $passwordPublicKey;
    public final /* synthetic */ AnonymousClass28T $userEntity;
    public final /* synthetic */ C214113z this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C106915Fr(AnonymousClass28T r2, AnonymousClass5SY r3, AnonymousClass4UI r4, C214113z r5, Integer num, PublicKey publicKey, X509Certificate x509Certificate) {
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
        C48802Pe r14 = (C48802Pe) obj;
        C18450wi.A0H(r14, 0);
        C214113z r7 = this.this$0;
        X509Certificate x509Certificate = this.$encryptionCert;
        AnonymousClass28T r4 = this.$userEntity;
        PublicKey publicKey = this.$passwordPublicKey;
        RunnableRunnableShape1S0700000_I1 runnableRunnableShape1S0700000_I1 = new RunnableRunnableShape1S0700000_I1(r4, this.$callback, this.$operationRetryState, r7, this.$passwordKeyId, publicKey, x509Certificate, 3);
        C214113z r72 = this.this$0;
        C213913x r11 = r72.A03;
        AnonymousClass4UI r6 = this.$operationRetryState;
        AnonymousClass5SY r5 = this.$callback;
        C106885Fo r1 = new C106885Fo(this.$userEntity, r5, r6, r72);
        X509Certificate x509Certificate2 = this.$encryptionCert;
        r11.A01(r5, r6, r14, runnableRunnableShape1S0700000_I1, new AnonymousClass5F0(r5, r6, r72, this.$passwordKeyId, this.$passwordPublicKey, x509Certificate2), r1);
        return AnonymousClass22M.A00;
    }
}
