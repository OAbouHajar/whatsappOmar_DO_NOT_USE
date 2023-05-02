package X;

import android.content.Intent;
import com.facebook.redex.IDxComparatorShape185S0100000_3_I1;
import com.obwhatsapp.payments.ui.BrazilPayBloksActivity;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.5na  reason: invalid class name and case insensitive filesystem */
public class C114325na extends C16690tT {
    public final C116035qi A00;
    public final C18290wS A01;

    public C114325na(C116035qi r1, C18290wS r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        List A0i = C110105dW.A0i(this.A01);
        if (A0i.size() <= 0) {
            return null;
        }
        Collections.sort(A0i, new IDxComparatorShape185S0100000_3_I1(this, 0));
        C30671cl A0G = C110115dX.A0G(A0i, 0);
        C39901tF r0 = A0G.A08;
        if (r0 == null || ((C39891tE) r0).A06 < 0) {
            return null;
        }
        return new AnonymousClass01Q(Integer.valueOf(A0i.size()), A0G);
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        AnonymousClass01Q r6 = (AnonymousClass01Q) obj;
        if (r6 != null) {
            Object obj2 = r6.A01;
            AnonymousClass00B.A06(obj2);
            C30671cl r2 = (C30671cl) obj2;
            C14530pL r4 = this.A00.A00;
            if (r2 == null) {
                AnonymousClass29T.A01(r4, 102);
                return;
            }
            HashMap A0x = AnonymousClass000.A0x();
            A0x.put("credential_id", r2.A0A);
            A0x.put("last4", C110105dW.A0d(r2.A09));
            C39891tE r22 = (C39891tE) r2.A08;
            A0x.put("remaining_retries", r22 != null ? AnonymousClass000.A0l(AnonymousClass000.A0r(""), r22.A04) : "-1");
            Intent A04 = C110105dW.A04(r4, BrazilPayBloksActivity.class);
            A04.putExtra("screen_name", "brpay_p_reset_pin_from_card");
            A04.putExtra("screen_params", A0x);
            r4.startActivity(A04);
            return;
        }
        AnonymousClass29T.A01(this.A00.A00, 102);
    }
}
