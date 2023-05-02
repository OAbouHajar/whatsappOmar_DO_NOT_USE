package X;

import android.content.Context;
import com.obwhatsapp.wabloks.ui.WaBloksActivity;
import com.whatsapp.jid.UserJid;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.5uV  reason: invalid class name and case insensitive filesystem */
public class C118325uV {
    public C16000sG A00;
    public AnonymousClass013 A01;
    public AnonymousClass1Vt A02;
    public C218315p A03;
    public String A04;

    public void A00(Context context) {
        C16000sG r0;
        try {
            AnonymousClass00B.A06(this.A04);
            AnonymousClass00B.A06(this.A01);
            JSONObject A0J = C13700nu.A0J();
            A0J.put("ref", this.A04);
            A0J.put("locale", this.A01.A07());
            AnonymousClass1Vt r02 = this.A02;
            if (r02 != null) {
                A0J.put("transaction_id", r02.A0K);
                AnonymousClass1Vt r03 = this.A02;
                C28401Vy r4 = r03.A08;
                if (r4 != null) {
                    A0J.put("transaction_amount", C218315p.A07(this.A01, r03.A00(), r4, true));
                }
                C218315p r1 = this.A03;
                if (r1 != null) {
                    A0J.put("transaction_status", r1.A0K(this.A02));
                }
                AnonymousClass1Vt r04 = this.A02;
                A0J.put("transaction_status_enum", AnonymousClass1W1.A04(r04.A03, r04.A02));
                Boolean A022 = this.A02.A02();
                if (A022 != null) {
                    A0J.put("is_transaction_sender", A022);
                }
                UserJid userJid = this.A02.A0D;
                if (!(userJid == null || (r0 = this.A00) == null)) {
                    A0J.put("receiver_name", r0.A0A(userJid).A0B());
                }
            }
            context.startActivity(WaBloksActivity.A09(context, "com.bloks.www.payments.whatsapp.f2care", C13700nu.A0J().put("params", C13700nu.A0J().put("server_params", A0J)).toString()));
        } catch (JSONException unused) {
        }
    }
}
