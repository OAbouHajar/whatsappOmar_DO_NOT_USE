package X;

import android.content.Context;
import android.util.Base64;
import com.whatsapp.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.5ue  reason: invalid class name and case insensitive filesystem */
public class C118415ue {
    public String A00;
    public final Context A01;
    public final C14870pt A02;
    public final C18340wX A03;
    public final C18310wU A04;
    public final C119285wq A05;
    public final C18280wR A06;

    public C118415ue(Context context, C14870pt r8, C18340wX r9, C18310wU r10, C119285wq r11, C18280wR r12, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        String str11 = str5;
        String str12 = str6;
        this.A01 = context;
        this.A02 = r8;
        this.A06 = r12;
        this.A04 = r10;
        this.A03 = r9;
        this.A05 = r11;
        if (str3.length() == 12) {
            StringBuilder A0o = AnonymousClass000.A0o();
            A0o.append(str3.substring(0, 4));
            A0o.append("9");
            str3 = AnonymousClass000.A0h(str3.substring(4), A0o);
        }
        try {
            JSONObject A0J = C13700nu.A0J();
            A0J.put("fullName", str);
            A0J.put("personalID", str2);
            A0J.put("phone", str3);
            JSONObject A0J2 = C13700nu.A0J();
            A0J2.put("street", str4);
            String str13 = "";
            A0J2.put("addressNumber", str5 == null ? str13 : str11);
            A0J2.put("extraLine", str6 == null ? str13 : str12);
            A0J2.put("neighborhood", str7 != null ? str7 : str13);
            A0J2.put("city", str8);
            A0J2.put("state", str9);
            A0J2.put("addressCode", str10);
            A0J2.put("country", "BR");
            this.A00 = C110115dX.A0f(A0J2, "address", A0J);
        } catch (JSONException e2) {
            Log.e(AnonymousClass000.A0g("PAY: BrazilSendKYCAction Exception: ", e2));
        }
    }

    public final void A00(AnonymousClass690 r19, AnonymousClass50C r20) {
        Context context = this.A01;
        C14870pt r10 = this.A02;
        C18280wR r14 = this.A06;
        C117565tC r8 = new C117565tC(context, r10, this.A03, this.A04, this.A05, r14);
        try {
            C28371Vv[] r3 = new C28371Vv[1];
            AnonymousClass50C r6 = r20;
            byte[] A8P = r6.A8P(this.A00.getBytes(AnonymousClass01S.A08), C004101u.A0E(16));
            AnonymousClass1Vo r2 = r8.A05;
            StringBuilder A0o = AnonymousClass000.A0o();
            A0o.append("sendKyc Text Blob : ");
            r2.A06(AnonymousClass000.A0h(Base64.encodeToString(A8P, 2), A0o));
            C35081lL[] r22 = new C35081lL[1];
            int A032 = C35081lL.A03("key-type", r6.A03, r22);
            r3[A032] = new C28371Vv("text", A8P, r22);
            ArrayList A0u = AnonymousClass000.A0u();
            C110105dW.A1P("action", "send-kyc-data", A0u);
            String str = r6.A05;
            C110105dW.A1P("provider", str, A0u);
            C110105dW.A1P("key-version", r6.A04, A0u);
            C110105dW.A1P("device-id", r8.A06.A01(), A0u);
            C28371Vv r142 = new C28371Vv("account", C110115dX.A1F(A0u, A032), r3);
            r8.A03.A0H(new C112065ht(r8.A00, r8.A02, r19, r8, r8.A01, "send-kyc-data", str), r142, "set", 0);
        } catch (UnsupportedEncodingException e2) {
            throw new Error(e2);
        }
    }
}
