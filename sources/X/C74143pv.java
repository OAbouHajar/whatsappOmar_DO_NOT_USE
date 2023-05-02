package X;

import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.3pv  reason: invalid class name and case insensitive filesystem */
public class C74143pv extends C102014yG {
    public final /* synthetic */ AnonymousClass5SY A00;
    public final /* synthetic */ C213613u A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ KeyPair A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C74143pv(AnonymousClass5SY r1, AnonymousClass5SY r2, C213613u r3, String str, KeyPair keyPair) {
        super(r1);
        this.A01 = r3;
        this.A03 = keyPair;
        this.A02 = str;
        this.A00 = r2;
    }

    public void AYJ(AnonymousClass4MF r5, Integer num) {
        try {
            C213613u r3 = this.A01;
            JSONObject jSONObject = new JSONObject(r3.A01.A01(r5, this.A03.getPrivate()));
            this.A00.AY5(C213313r.A00(r3.A03, this.A02, jSONObject));
        } catch (UnsupportedEncodingException | GeneralSecurityException | JSONException e2) {
            this.A00.AQa(e2);
        }
    }
}
