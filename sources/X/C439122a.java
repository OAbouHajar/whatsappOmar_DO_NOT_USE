package X;

import android.text.TextUtils;
import android.util.Pair;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.22a  reason: invalid class name and case insensitive filesystem */
public class C439122a implements C19550yc {
    public C439322c A00;
    public final UserJid A01;
    public final C17190ug A02;

    public C439122a(UserJid userJid, C17190ug r2) {
        this.A01 = userJid;
        this.A02 = r2;
    }

    public void A00(C439322c r15) {
        this.A00 = r15;
        C17190ug r7 = this.A02;
        String A022 = r7.A02();
        r7.A0A(this, new C28371Vv(new C28371Vv("public_key", new C35081lL[]{new C35081lL("jid", this.A01.getRawString())}), "iq", new C35081lL[]{new C35081lL((Jid) C34791ks.A00, "to"), new C35081lL("xmlns", "w:biz:catalog"), new C35081lL("type", "get"), new C35081lL("smax_id", "52"), new C35081lL("id", A022)}), A022, 283, 32000);
    }

    public void APb(String str) {
        StringBuilder sb = new StringBuilder("GetBusinessPublicKeyProtocol/delivery-error with iqId ");
        sb.append(str);
        Log.w(sb.toString());
        C439322c r1 = this.A00;
        if (r1 != null) {
            r1.ARk(this.A01);
        }
    }

    public void AQe(C28371Vv r4, String str) {
        StringBuilder sb = new StringBuilder("GetBusinessPublicKeyProtocol/onError with iqId ");
        sb.append(str);
        Log.w(sb.toString());
        Pair A012 = C34451kH.A01(r4);
        if (A012 != null) {
            StringBuilder sb2 = new StringBuilder("GetBusinessPublicKeyProtocol/onError error_code=");
            sb2.append(A012.first);
            Log.w(sb2.toString());
        }
        C439322c r1 = this.A00;
        if (r1 != null) {
            r1.ARk(this.A01);
        }
    }

    public void AYG(C28371Vv r4, String str) {
        C28371Vv A0J;
        C28371Vv A0J2 = r4.A0J("public_key");
        if (!(A0J2 == null || (A0J = A0J2.A0J("pem")) == null)) {
            String A0L = A0J.A0L();
            if (!TextUtils.isEmpty(A0L)) {
                C439322c r1 = this.A00;
                if (r1 != null) {
                    UserJid userJid = this.A01;
                    AnonymousClass00B.A06(A0L);
                    r1.ARl(userJid, A0L);
                    return;
                }
                return;
            }
        }
        C439322c r12 = this.A00;
        if (r12 != null) {
            r12.ARk(this.A01);
        }
    }
}
