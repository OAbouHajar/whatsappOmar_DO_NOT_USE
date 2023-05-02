package X;

import android.content.Context;
import android.text.TextUtils;
import com.obwhatsapp.payments.IDxRCallbackShape94S0100000_3_I1;
import com.whatsapp.util.Log;
import com.whatsapp.wamsys.JniBridge;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.5vI  reason: invalid class name and case insensitive filesystem */
public class C118815vI {
    public final Context A00;
    public final C14870pt A01;
    public final C16040sK A02;
    public final C18260wP A03;
    public final C16440t3 A04;
    public final AnonymousClass173 A05;
    public final C17190ug A06;
    public final C119315wt A07;
    public final C18340wX A08;
    public final C18310wU A09;
    public final C18290wS A0A;
    public final AnonymousClass68M A0B;
    public final C118335uW A0C;

    public C118815vI(Context context, C14870pt r2, C16040sK r3, C18260wP r4, C16440t3 r5, AnonymousClass173 r6, C17190ug r7, C119315wt r8, C18340wX r9, C18310wU r10, C18290wS r11, AnonymousClass68M r12, C118335uW r13) {
        this.A04 = r5;
        this.A00 = context;
        this.A01 = r2;
        this.A02 = r3;
        this.A06 = r7;
        this.A0A = r11;
        this.A09 = r10;
        this.A0C = r13;
        this.A05 = r6;
        this.A07 = r8;
        this.A03 = r4;
        this.A08 = r9;
        this.A0B = r12;
    }

    public void A00(C35391lr r9) {
        if (r9 == null) {
            this.A0B.APf((C35391lr) null, C110115dX.A0N(), (ArrayList) null, false);
            return;
        }
        C39901tF r0 = r9.A08;
        AnonymousClass00B.A06(r0);
        if (TextUtils.isEmpty(((C111815hS) r0).A06)) {
            new C118425uf(this.A00, this.A01, this.A03, this.A08, this.A09, new AnonymousClass61B(r9, this)).A00(r9.A0A);
            return;
        }
        A01(r9);
    }

    public final void A01(C35391lr r22) {
        String str;
        Log.i("PAY: BrazilDeviceBindingAction starts to bind device");
        C16440t3 r5 = this.A04;
        C16040sK r3 = this.A02;
        String A0g = C110105dW.A0g(r3, r5);
        C35391lr r4 = r22;
        String A002 = this.A0C.A00(r4.A01);
        String A0g2 = C110105dW.A0g(r3, r5);
        C119315wt r6 = this.A07;
        String A012 = r6.A01(1);
        String str2 = null;
        if (!TextUtils.isEmpty(A012)) {
            byte[] bArr = (byte[]) JniBridge.jvidispatchOOO(8, A012.getBytes(), AnonymousClass000.A0h(A002, AnonymousClass000.A0r("C=US,ST=California,L=Menlo Park,O=Facebook,OU=WhatsApp,CN=")).getBytes());
            if (bArr != null) {
                str2 = new String(bArr).split("\u0000")[0];
            }
        }
        C39901tF r0 = r4.A08;
        AnonymousClass00B.A06(r0);
        String str3 = ((C111815hS) r0).A06;
        try {
            JSONObject A0J = C13700nu.A0J();
            A0J.put("alg", "PS256");
            A0J.put("typ", "JOSE");
            str = r6.A06(C110115dX.A0f(A002, "kid", A0J), C119315wt.A00(A002, A0g, str3));
        } catch (JSONException e2) {
            Log.w("PAY: generateDeviceBindingJwsToken threw creating json string: ", e2);
            str = null;
        }
        C17190ug r12 = this.A06;
        String A022 = r12.A02();
        String str4 = r4.A0A;
        C51812cK r7 = new C51812cK(A022);
        C32461gQ A0X = C110105dW.A0X();
        C32461gQ A0Y = C110105dW.A0Y(A0X);
        C32461gQ.A00(A0Y, "action", "br-bind-network-token");
        if (C110115dX.A1C(str4, false)) {
            C32461gQ.A00(A0Y, "credential-id", str4);
        }
        if (C32271fx.A0D(str2, 1, 10000, false)) {
            C32461gQ.A00(A0Y, "device-csr", str2);
        }
        if (C32271fx.A0D(str, 1, 10000, false)) {
            C32461gQ.A00(A0Y, "jws-token", str);
        }
        if (C32271fx.A0D(A0g, 1, 10000, false)) {
            C32461gQ.A00(A0Y, "client-reference-id", A0g);
        }
        if (C110105dW.A1V(A002, 1, false)) {
            C32461gQ.A00(A0Y, "device-id", A002);
        }
        if (C110105dW.A1W(A0g2, 1, false)) {
            C32461gQ.A00(A0Y, "nonce", A0g2);
        }
        C110105dW.A1H(r12, new IDxRCallbackShape94S0100000_3_I1(this.A00, this.A08, this.A01, this, 1), C110105dW.A0T(A0Y, A0X, r7), A022);
    }
}
