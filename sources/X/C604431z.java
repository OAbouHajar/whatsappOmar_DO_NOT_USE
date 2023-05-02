package X;

import com.mod2.fblibs.Facebook;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.31z  reason: invalid class name and case insensitive filesystem */
public class C604431z extends C102014yG {
    public final /* synthetic */ AnonymousClass28T A00;
    public final /* synthetic */ AnonymousClass5SY A01;
    public final /* synthetic */ C213613u A02;
    public final /* synthetic */ KeyPair A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C604431z(AnonymousClass28T r1, AnonymousClass5SY r2, AnonymousClass5SY r3, C213613u r4, KeyPair keyPair) {
        super(r2);
        this.A02 = r4;
        this.A03 = keyPair;
        this.A01 = r3;
        this.A00 = r1;
    }

    public void AYJ(AnonymousClass4MF r14, Integer num) {
        try {
            JSONObject A0K = C13700nu.A0K(this.A02.A01.A01(r14, this.A03.getPrivate()));
            AnonymousClass5SY r2 = this.A01;
            AnonymousClass28T r3 = this.A00;
            Object obj = r3.A03.A00;
            AnonymousClass00B.A06(obj);
            long A012 = C13700nu.A01(obj);
            Object obj2 = r3.A04.A00;
            AnonymousClass00B.A06(obj2);
            String string = C13700nu.A0K(A0K.getString("data")).getString(Facebook.TOKEN);
            long j2 = r3.A00;
            Long l2 = r3.A05;
            String str = r3.A06;
            r2.AY5(new AnonymousClass28T(r3.A01, l2, (String) obj2, string, str, A012, j2));
        } catch (UnsupportedEncodingException | GeneralSecurityException | JSONException e2) {
            this.A01.AQa(e2);
        }
    }
}
