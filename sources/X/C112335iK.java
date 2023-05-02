package X;

import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.ArrayList;

/* renamed from: X.5iK  reason: invalid class name and case insensitive filesystem */
public class C112335iK extends C116635rh {
    public final C14870pt A00;
    public final C16980tz A01;
    public final C18340wX A02;
    public final AnonymousClass61W A03;
    public final AnonymousClass1Vo A04 = C110105dW.A0Q("IndiaUpiRegisterAliasAction", "network");
    public final C18280wR A05;

    public C112335iK(C14870pt r3, C16980tz r4, C119365wy r5, C18340wX r6, C18310wU r7, AnonymousClass61W r8, C18280wR r9) {
        super(r5.A04, r7);
        this.A01 = r4;
        this.A00 = r3;
        this.A05 = r9;
        this.A02 = r6;
        this.A03 = r8;
    }

    public static /* synthetic */ void A00(AnonymousClass2HJ r2, C112335iK r3, String str) {
        AnonymousClass61W r1;
        int i2;
        if (str.equalsIgnoreCase("add")) {
            r1 = r3.A03;
            i2 = 22;
        } else if (str.equalsIgnoreCase("port")) {
            r1 = r3.A03;
            i2 = 24;
        } else {
            return;
        }
        r1.AKK(r2, i2);
    }

    public void A01(C35301lh r16, C35301lh r17, AnonymousClass4QP r18, String str, String str2) {
        Log.i("PAY: registerAlias called");
        AnonymousClass4XO r5 = this.A00;
        r5.A04("register-alias");
        ArrayList A0u = AnonymousClass000.A0u();
        C110105dW.A1P("alias_value", (String) C39841t9.A02(r17), A0u);
        C110105dW.A1P("alias_type", "mobile_number", A0u);
        String str3 = str;
        if (!TextUtils.isEmpty(str3)) {
            C110105dW.A1P("vpa_id", str3, A0u);
        }
        C35301lh r1 = r16;
        if (!C39841t9.A03(r1)) {
            C110105dW.A1P("vpa", (String) r1.A00, A0u);
        }
        ArrayList A0u2 = AnonymousClass000.A0u();
        C110105dW.A1P("action", "register-alias", A0u2);
        C110105dW.A1P("device_id", this.A05.A01(), A0u2);
        String str4 = str2;
        C110105dW.A1P("op", str4, A0u2);
        this.A01.A0H(new C112425iT(this.A01.A00, this.A00, this.A02, r5, this, r18, str4), new C28371Vv(new C28371Vv("alias", C110115dX.A1F(A0u, 0)), "account", C110115dX.A1F(A0u2, 0)), "set", 0);
    }
}
