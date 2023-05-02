package X;

import com.obwhatsapp.payments.ui.P2mLiteOrderDetailsActivity;
import java.util.Map;

/* renamed from: X.3GK  reason: invalid class name */
public final class AnonymousClass3GK implements AnonymousClass5Q9 {
    public final /* synthetic */ P2mLiteOrderDetailsActivity A00;

    public AnonymousClass3GK(P2mLiteOrderDetailsActivity p2mLiteOrderDetailsActivity) {
        this.A00 = p2mLiteOrderDetailsActivity;
    }

    public static /* synthetic */ void A00(P2mLiteOrderDetailsActivity p2mLiteOrderDetailsActivity, C16830ti r7, String str, String str2) {
        C35251lc r0;
        P2mLiteOrderDetailsActivity p2mLiteOrderDetailsActivity2 = p2mLiteOrderDetailsActivity;
        C16830ti r5 = r7;
        if (r7 != null) {
            C16880tn r02 = r7.A00;
            if (!(r02 == null || (r0 = r02.A01) == null)) {
                r0.A03 = str;
            }
            p2mLiteOrderDetailsActivity.A35().A0a(r7);
        }
        if ("COMPLETED".equals(str2) || "SUCCESS".equals(str2)) {
            AnonymousClass2St A002 = C49382Ss.A00();
            A002.A02("success_redirect", true);
            A002.A02("unsuccessful_redirect", false);
            A002.A01("transaction_status", "SUCCESS");
            p2mLiteOrderDetailsActivity2.A38(A002, r5, (Integer) null, "api_event", "in_app_browser_checkout", 3);
        }
    }

    public void ARR(Map map) {
        AnonymousClass4W3 r3;
        P2mLiteOrderDetailsActivity p2mLiteOrderDetailsActivity = this.A00;
        p2mLiteOrderDetailsActivity.Ac1();
        C52372dh r0 = p2mLiteOrderDetailsActivity.A0O;
        if (r0 != null) {
            r0.A03(p2mLiteOrderDetailsActivity);
        }
        p2mLiteOrderDetailsActivity.A0O = null;
        C16830ti r6 = (C16830ti) C16460t6.A00(p2mLiteOrderDetailsActivity.A35(), p2mLiteOrderDetailsActivity.A37().A08);
        String str = null;
        Object obj = map == null ? null : map.get(C795940l.A00.key);
        if (!(obj instanceof AnonymousClass4W3) || (r3 = (AnonymousClass4W3) obj) == null) {
            Object obj2 = map == null ? null : map.get("result");
            String str2 = obj2 instanceof String ? (String) obj2 : null;
            Object obj3 = map == null ? null : map.get("payment_transaction_id");
            if (obj3 instanceof String) {
                str = (String) obj3;
            }
            if (("COMPLETED".equals(str2) || "DISMISSED".equals(str2) || "SUCCESS".equals(str2)) && str != null) {
                p2mLiteOrderDetailsActivity.A05.Aco(new C1045555v(p2mLiteOrderDetailsActivity, r6, str, str2));
            }
            if ("BLOCKED".equals(str2)) {
                p2mLiteOrderDetailsActivity.A3A(r6, "enter_dob");
                return;
            }
            return;
        }
        AnonymousClass2St A002 = C49382Ss.A00();
        A002.A02("success_redirect", false);
        A002.A02("unsuccessful_redirect", true);
        p2mLiteOrderDetailsActivity.A38(A002, r6, (Integer) null, "api_event", "in_app_browser_checkout", 3);
        p2mLiteOrderDetailsActivity.A0S.A00(r3.A00);
    }
}
