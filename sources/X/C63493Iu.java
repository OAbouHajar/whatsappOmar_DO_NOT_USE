package X;

import com.facebook.redex.RunnableRunnableShape1S0600000_I1;
import java.security.PublicKey;
import java.security.cert.X509Certificate;

/* renamed from: X.3Iu  reason: invalid class name and case insensitive filesystem */
public final class C63493Iu extends AnonymousClass1DR implements AnonymousClass22J {
    public final /* synthetic */ AnonymousClass5SY $callback;
    public final /* synthetic */ X509Certificate $encryptionCert;
    public final /* synthetic */ AnonymousClass4UI $operationRetryState;
    public final /* synthetic */ Integer $passwordKeyId;
    public final /* synthetic */ PublicKey $passwordPublicKey;
    public final /* synthetic */ C214113z this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63493Iu(AnonymousClass5SY r2, AnonymousClass4UI r3, C214113z r4, Integer num, PublicKey publicKey, X509Certificate x509Certificate) {
        super(1);
        this.this$0 = r4;
        this.$encryptionCert = x509Certificate;
        this.$passwordPublicKey = publicKey;
        this.$passwordKeyId = num;
        this.$callback = r2;
        this.$operationRetryState = r3;
    }

    public /* bridge */ /* synthetic */ Object AIU(Object obj) {
        C48802Pe r14 = (C48802Pe) obj;
        C18450wi.A0H(r14, 0);
        C214113z r6 = this.this$0;
        X509Certificate x509Certificate = this.$encryptionCert;
        PublicKey publicKey = this.$passwordPublicKey;
        RunnableRunnableShape1S0600000_I1 runnableRunnableShape1S0600000_I1 = new RunnableRunnableShape1S0600000_I1(this.$callback, this.$operationRetryState, r6, this.$passwordKeyId, publicKey, x509Certificate);
        C214113z r7 = this.this$0;
        C213913x r11 = r7.A03;
        AnonymousClass4UI r62 = this.$operationRetryState;
        AnonymousClass5SY r5 = this.$callback;
        C106815Fh r2 = new C106815Fh(r5, r62, r7);
        X509Certificate x509Certificate2 = this.$encryptionCert;
        C106725Ey r4 = new C106725Ey(r5, r62, r7, this.$passwordKeyId, this.$passwordPublicKey, x509Certificate2);
        C18450wi.A0I(r62, 1, r5);
        if (C34451kH.A00(r14.node) == 304) {
            ((AnonymousClass14L) r11.A02.get()).A03(new C102034yI(r5, r14, r4), AnonymousClass146.A00);
        } else {
            r11.A01(r5, r62, r14, runnableRunnableShape1S0600000_I1, r4, r2);
        }
        return AnonymousClass22M.A00;
    }
}
