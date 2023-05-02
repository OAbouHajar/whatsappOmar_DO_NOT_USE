package X;

import android.text.TextUtils;
import com.obwhatsapp.payments.ui.BrazilPayBloksActivity;
import java.util.HashMap;

/* renamed from: X.5uG  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C118175uG {
    public final /* synthetic */ AnonymousClass1Z7 A00;
    public final /* synthetic */ BrazilPayBloksActivity A01;
    public final /* synthetic */ String A02;

    public /* synthetic */ C118175uG(AnonymousClass1Z7 r1, BrazilPayBloksActivity brazilPayBloksActivity, String str) {
        this.A01 = brazilPayBloksActivity;
        this.A00 = r1;
        this.A02 = str;
    }

    public final void A00(C35391lr r7, AnonymousClass2HJ r8) {
        BrazilPayBloksActivity brazilPayBloksActivity = this.A01;
        AnonymousClass1Z7 r5 = this.A00;
        String str = this.A02;
        if (r8 != null || r7 == null) {
            HashMap A0x = AnonymousClass000.A0x();
            A0x.put("remaining_validates", "1");
            A0x.put("next_resend_ts", String.valueOf((long) Math.ceil(((double) (brazilPayBloksActivity.A05.A00() + ((long) ((!TextUtils.isEmpty(str) ? Integer.parseInt(str) : 60) * 1000)))) / 1000.0d)));
            C112855jo.A09(r5, A0x, r8 != null ? r8.A00 : 0);
            return;
        }
        r5.A00("on_success");
    }
}
