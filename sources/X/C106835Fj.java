package X;

import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.PrivateKey;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.5Fj  reason: invalid class name and case insensitive filesystem */
public final class C106835Fj extends AnonymousClass1DR implements AnonymousClass22J {
    public final /* synthetic */ AnonymousClass5SY $callback;
    public final /* synthetic */ KeyPair $keyPair;
    public final /* synthetic */ String $password;
    public final /* synthetic */ AnonymousClass142 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C106835Fj(AnonymousClass5SY r2, AnonymousClass142 r3, String str, KeyPair keyPair) {
        super(1);
        this.this$0 = r3;
        this.$keyPair = keyPair;
        this.$password = str;
        this.$callback = r2;
    }

    public /* bridge */ /* synthetic */ Object AIU(Object obj) {
        AnonymousClass4MF r6 = (AnonymousClass4MF) obj;
        if (r6 != null) {
            AnonymousClass142 r4 = this.this$0;
            KeyPair keyPair = this.$keyPair;
            String str = this.$password;
            AnonymousClass5SY r2 = this.$callback;
            PrivateKey privateKey = keyPair.getPrivate();
            C18450wi.A0B(privateKey);
            try {
                r2.AY5(C213313r.A00(AnonymousClass143.A00, str, new JSONObject(r4.A00.A01(r6, privateKey))));
            } catch (UnsupportedEncodingException | GeneralSecurityException | JSONException e2) {
                r2.AQa(e2);
            }
        }
        return AnonymousClass22M.A00;
    }
}
