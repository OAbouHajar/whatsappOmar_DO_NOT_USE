package X;

import android.app.ProgressDialog;
import android.net.Uri;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.39H  reason: invalid class name */
public class AnonymousClass39H {
    public C610136z A00;
    public final C17130ua A01;
    public final AnonymousClass013 A02;
    public final AnonymousClass1KQ A03;
    public final C19950zG A04;
    public final C17220uj A05;
    public final C16320sq A06;

    public AnonymousClass39H(C17130ua r1, AnonymousClass013 r2, AnonymousClass1KQ r3, C19950zG r4, C17220uj r5, C16320sq r6) {
        this.A06 = r6;
        this.A01 = r1;
        this.A05 = r5;
        this.A02 = r2;
        this.A03 = r3;
        this.A04 = r4;
    }

    public void A00() {
        ProgressDialog progressDialog;
        C610136z r1 = this.A00;
        if (r1 != null && (progressDialog = r1.A00) != null && progressDialog.isShowing()) {
            r1.A00.cancel();
        }
    }

    public void A01(C14550pN r12, AnonymousClass12L r13, String str) {
        C13680ns.A1T(this.A00);
        Uri.Builder appendPath = this.A05.A01().appendPath("verification.php");
        AnonymousClass013 r0 = this.A02;
        String A052 = r0.A05();
        String A062 = r0.A06();
        r13.A01();
        AnonymousClass01V r3 = r13.A09;
        TelephonyManager A0N = r3.A0N();
        String A012 = A0N != null ? C47032Hf.A01(A0N.getNetworkOperator(), "000-000") : "none";
        HashMap A0x = AnonymousClass000.A0x();
        if (r13.A00 != null) {
            A0x.put("platform", "android");
            A0x.put("network", A012);
            A0x.put("lc", A052);
            A0x.put("lg", A062);
            A0x.put("context", r13.A00);
            r13.A01();
            StringBuilder A0o = AnonymousClass000.A0o();
            if (C004101u.A0C(r3)) {
                A0o.append("rted ");
            }
            try {
                Class.forName("org.acra.ACRA");
                A0o.append("nw-wap ");
            } catch (ClassNotFoundException unused) {
            }
            A0x.put("diagnostic", A0o.length() == 0 ? null : A0o.toString());
            String str2 = "true";
            String str3 = "false";
            if (r13.A01) {
                str3 = str2;
            }
            A0x.put("fail_too_many", str3);
            String str4 = "false";
            if (r13.A03) {
                str4 = str2;
            }
            A0x.put("no_route_sms", str4);
            String str5 = "false";
            if (r13.A04) {
                str5 = str2;
            }
            A0x.put("no_route_voice", str5);
            String str6 = "false";
            if (r13.A06) {
                str6 = str2;
            }
            A0x.put("valid_number", str6);
            if (!r13.A05) {
                str2 = "false";
            }
            A0x.put("no_number", str2);
            A0x.put("debug-context", r13.A00(r13.A00));
        }
        Iterator it = A0x.keySet().iterator();
        while (it.hasNext()) {
            String A0m = AnonymousClass000.A0m(it);
            String str7 = (String) A0x.get(A0m);
            if (TextUtils.isEmpty(str7)) {
                str7 = "";
            }
            appendPath.appendQueryParameter(A0m, str7);
        }
        C610136z r4 = new C610136z(r12, this.A01, this.A03, this.A04, appendPath.toString(), r13.A00(str));
        this.A00 = r4;
        this.A06.Ack(r4, new String[0]);
    }
}
