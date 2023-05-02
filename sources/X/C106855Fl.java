package X;

import java.security.KeyPair;
import java.security.PrivateKey;
import org.json.JSONObject;

/* renamed from: X.5Fl  reason: invalid class name and case insensitive filesystem */
public final class C106855Fl extends AnonymousClass1DR implements AnonymousClass22J {
    public final /* synthetic */ KeyPair $keyPair;
    public final /* synthetic */ AnonymousClass5SY $operationCallback;
    public final /* synthetic */ String $password;
    public final /* synthetic */ C214113z this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C106855Fl(AnonymousClass5SY r2, C214113z r3, String str, KeyPair keyPair) {
        super(1);
        this.this$0 = r3;
        this.$keyPair = keyPair;
        this.$password = str;
        this.$operationCallback = r2;
    }

    public /* bridge */ /* synthetic */ Object AIU(Object obj) {
        C28371Vv r5 = (C28371Vv) obj;
        C18450wi.A0H(r5, 0);
        C214113z r3 = this.this$0;
        PrivateKey privateKey = this.$keyPair.getPrivate();
        C18450wi.A0B(privateKey);
        this.$operationCallback.AY5(C213313r.A00(AnonymousClass146.A00, this.$password, new JSONObject(r3.A00.A01(C213513t.A00(r5), privateKey))));
        return AnonymousClass22M.A00;
    }
}
