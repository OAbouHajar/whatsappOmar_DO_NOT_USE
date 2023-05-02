package X;

import com.facebook.redex.RunnableRunnableShape1S0700000_I1;
import java.security.PublicKey;
import java.security.cert.X509Certificate;

/* renamed from: X.5Fp  reason: invalid class name and case insensitive filesystem */
public final class C106895Fp extends AnonymousClass1DR implements AnonymousClass22J {
    public final /* synthetic */ AnonymousClass2HX $data;
    public final /* synthetic */ X509Certificate $encryptionCert;
    public final /* synthetic */ AnonymousClass5SY $operationCallback;
    public final /* synthetic */ Integer $passwordKeyId;
    public final /* synthetic */ PublicKey $passwordPublicKey;
    public final /* synthetic */ AnonymousClass4UI $requestRetryState;
    public final /* synthetic */ C214113z this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C106895Fp(AnonymousClass5SY r2, AnonymousClass4UI r3, C214113z r4, AnonymousClass2HX r5, Integer num, PublicKey publicKey, X509Certificate x509Certificate) {
        super(1);
        this.this$0 = r4;
        this.$data = r5;
        this.$encryptionCert = x509Certificate;
        this.$passwordPublicKey = publicKey;
        this.$passwordKeyId = num;
        this.$operationCallback = r2;
        this.$requestRetryState = r3;
    }

    public /* bridge */ /* synthetic */ Object AIU(Object obj) {
        C48802Pe r14 = (C48802Pe) obj;
        C18450wi.A0H(r14, 0);
        C214113z r6 = this.this$0;
        AnonymousClass2HX r7 = this.$data;
        X509Certificate x509Certificate = this.$encryptionCert;
        PublicKey publicKey = this.$passwordPublicKey;
        RunnableRunnableShape1S0700000_I1 runnableRunnableShape1S0700000_I1 = new RunnableRunnableShape1S0700000_I1(this.$operationCallback, this.$requestRetryState, r6, r7, this.$passwordKeyId, publicKey, x509Certificate);
        C214113z r72 = this.this$0;
        C213913x r11 = r72.A03;
        AnonymousClass4UI r62 = this.$requestRetryState;
        AnonymousClass5SY r5 = this.$operationCallback;
        C106865Fm r1 = new C106865Fm(r5, r62, r72, this.$data);
        X509Certificate x509Certificate2 = this.$encryptionCert;
        r11.A01(r5, r62, r14, runnableRunnableShape1S0700000_I1, new C106735Ez(r5, r62, r72, this.$passwordKeyId, this.$passwordPublicKey, x509Certificate2), r1);
        return AnonymousClass22M.A00;
    }
}
