package X;

import com.obwhatsapp.payments.ui.BrazilPayBloksActivity;
import com.whatsapp.util.Log;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.5u3  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C118095u3 {
    public final /* synthetic */ BrazilPayBloksActivity A00;
    public final /* synthetic */ String A01;

    public /* synthetic */ C118095u3(BrazilPayBloksActivity brazilPayBloksActivity, String str) {
        this.A00 = brazilPayBloksActivity;
        this.A01 = str;
    }

    public final void A00(AnonymousClass2HJ r5) {
        BrazilPayBloksActivity brazilPayBloksActivity = this.A00;
        String str = this.A01;
        AnonymousClass1Z7 r2 = brazilPayBloksActivity.A01;
        if (r2 == null) {
            Log.i("PAY: BrazilPayBloksActivity onActivityResult - appToAppBloksCallback is null!");
        } else if (r5 != null) {
            C112855jo.A09(r2, (Map) null, r5.A00);
        } else {
            HashMap A0x = AnonymousClass000.A0x();
            A0x.put("app_to_app_authorization_code", str);
            brazilPayBloksActivity.A01.A01("on_success", A0x);
        }
    }
}
