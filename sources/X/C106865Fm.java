package X;

import java.security.PublicKey;
import java.security.cert.X509Certificate;

/* renamed from: X.5Fm  reason: invalid class name and case insensitive filesystem */
public final class C106865Fm extends AnonymousClass1DR implements AnonymousClass22J {
    public final /* synthetic */ AnonymousClass2HX $data;
    public final /* synthetic */ AnonymousClass5SY $operationCallback;
    public final /* synthetic */ AnonymousClass4UI $requestRetryState;
    public final /* synthetic */ C214113z this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C106865Fm(AnonymousClass5SY r2, AnonymousClass4UI r3, C214113z r4, AnonymousClass2HX r5) {
        super(1);
        this.this$0 = r4;
        this.$data = r5;
        this.$operationCallback = r2;
        this.$requestRetryState = r3;
    }

    public /* bridge */ /* synthetic */ Object AIU(Object obj) {
        AnonymousClass4WO r8 = (AnonymousClass4WO) obj;
        C18450wi.A0H(r8, 0);
        C214113z r0 = this.this$0;
        AnonymousClass2HX r3 = this.$data;
        X509Certificate x509Certificate = r8.A02;
        PublicKey publicKey = r8.A01;
        r0.AaV(this.$operationCallback, this.$requestRetryState, r3, r8.A00, publicKey, x509Certificate);
        return AnonymousClass22M.A00;
    }
}
