package X;

import android.text.TextUtils;
import com.facebook.redex.IDxSListenerShape50S0200000_3_I1;
import com.obwhatsapp.payments.ui.BrazilPayBloksActivity;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.5uF  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C118165uF {
    public final /* synthetic */ AnonymousClass1Z7 A00;
    public final /* synthetic */ BrazilPayBloksActivity A01;
    public final /* synthetic */ String A02;

    public /* synthetic */ C118165uF(AnonymousClass1Z7 r1, BrazilPayBloksActivity brazilPayBloksActivity, String str) {
        this.A01 = brazilPayBloksActivity;
        this.A02 = str;
        this.A00 = r1;
    }

    public final void A00(AnonymousClass2HJ r9, C111815hS r10) {
        BrazilPayBloksActivity brazilPayBloksActivity = this.A01;
        String str = this.A02;
        AnonymousClass1Z7 r4 = this.A00;
        if (r9 == null) {
            HashMap A0x = AnonymousClass000.A0x();
            String str2 = "1";
            A0x.put("remaining_validates", str2);
            A0x.put("next_resend_ts", String.valueOf((long) Math.ceil(((double) (brazilPayBloksActivity.A05.A00() + ((long) ((!TextUtils.isEmpty(str) ? Integer.parseInt(str) : 60) * 1000)))) / 1000.0d)));
            if (r10 != null) {
                if (!r10.A0a) {
                    str2 = "0";
                }
                A0x.put("verified_state", str2);
                brazilPayBloksActivity.A0G.A01().A02(new IDxSListenerShape50S0200000_3_I1(A0x, 10, r4), r10.A05());
                return;
            }
            r4.A01("on_success", A0x);
            return;
        }
        C112855jo.A09(r4, (Map) null, r9.A00);
    }
}
