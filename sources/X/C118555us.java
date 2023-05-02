package X;

import android.content.Context;
import android.text.TextUtils;
import com.obwhatsapp.payments.IDxRCallbackShape94S0100000_3_I1;
import com.whatsapp.util.Log;
import com.whatsapp.wamsys.JniBridge;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.5us  reason: invalid class name and case insensitive filesystem */
public class C118555us {
    public final Context A00;
    public final C14870pt A01;
    public final C16040sK A02;
    public final C16440t3 A03;
    public final C17190ug A04;
    public final C119315wt A05;
    public final C18340wX A06;
    public final C18300wT A07;
    public final C18310wU A08;
    public final C119285wq A09;
    public final C117905tk A0A;
    public final C118335uW A0B;

    public C118555us(Context context, C14870pt r2, C16040sK r3, C16440t3 r4, C17190ug r5, C119315wt r6, C18340wX r7, C18300wT r8, C18310wU r9, C119285wq r10, C117905tk r11, C118335uW r12) {
        this.A03 = r4;
        this.A00 = context;
        this.A01 = r2;
        this.A02 = r3;
        this.A04 = r5;
        this.A07 = r8;
        this.A08 = r9;
        this.A0B = r12;
        this.A05 = r6;
        this.A06 = r7;
        this.A09 = r10;
        this.A0A = r11;
    }

    public void A00(AnonymousClass2HJ r20, AnonymousClass50C r21) {
        if (r20 == null) {
            AnonymousClass50C r1 = r21;
            if (r21 != null) {
                Log.i("PAY: BrazilDeviceRegistrationAction starts to bind device");
                AnonymousClass3GH r4 = (AnonymousClass3GH) r1.A00;
                String A002 = this.A0B.A00(5);
                String A062 = this.A07.A06();
                C119315wt r3 = this.A05;
                String A012 = r3.A01(5);
                String str = null;
                if (!TextUtils.isEmpty(A012)) {
                    byte[] bArr = new byte[0];
                    try {
                        byte[] bArr2 = (byte[]) JniBridge.jvidispatchOO(30, A012.getBytes(AnonymousClass01S.A08));
                        bArr = bArr2;
                        if (bArr2 == null) {
                        }
                    } catch (UnsupportedEncodingException e2) {
                        Log.e("PAY: BrazilTokenizationHelper/generateDevicePublicKeyPem failed generating public pem key: ", e2);
                    }
                    str = new String(bArr).split("\u0000")[0];
                }
                JSONObject A0J = C13700nu.A0J();
                try {
                    A0J.put("deviceId", A002).put("devicePublicKey", str).put("walletId", A062);
                } catch (JSONException e3) {
                    Log.i(AnonymousClass000.A0g("PAY: BrazilDeviceRegistrationAction payload generation failed :", e3));
                    e3.printStackTrace();
                }
                String A022 = r3.A02(r4, A0J.toString());
                String A0f = C110105dW.A0f(this.A02, this.A03);
                C17190ug r12 = this.A04;
                String A023 = r12.A02();
                C51812cK r6 = new C51812cK(A023);
                C32461gQ A0X = C110105dW.A0X();
                C32461gQ A0Y = C110105dW.A0Y(A0X);
                C32461gQ.A00(A0Y, "action", "br-device-registration");
                if (C110105dW.A1W(A0f, 1, false)) {
                    C32461gQ.A00(A0Y, "nonce", A0f);
                }
                C32461gQ A0S = AnonymousClass3K4.A0S("elo");
                if (C110115dX.A1B(A022, 1, false)) {
                    C32461gQ.A00(A0S, "ciphered_binding_info", A022);
                }
                if (C110105dW.A1V(A002, 1, false)) {
                    C32461gQ.A00(A0S, "network_device_id", A002);
                }
                AnonymousClass3K4.A0s(A0S, A0Y);
                r12.A0A(new IDxRCallbackShape94S0100000_3_I1(this.A00, this.A06, this.A01, this, 2), C110105dW.A0T(A0Y, A0X, r6), A023, 204, 0);
                return;
            }
        }
        Log.i("PAY: BrazilDeviceRegistrationAction missing key");
        C117905tk r2 = this.A0A;
        new AnonymousClass2HJ();
        r2.A00((C117575tD) null);
    }
}
