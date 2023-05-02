package X;

import android.text.TextUtils;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;

/* renamed from: X.2yM  reason: invalid class name and case insensitive filesystem */
public class C59482yM extends AnonymousClass26X {
    public final AnonymousClass4Q5 A00;
    public final AnonymousClass2TJ A01;
    public final C18720x9 A02;
    public final C17190ug A03;
    public final C18630x0 A04;

    public C59482yM(C17150uc r1, AnonymousClass4Q5 r2, AnonymousClass2TJ r3, C18720x9 r4, C17190ug r5, C18630x0 r6) {
        super(r1);
        this.A04 = r6;
        this.A03 = r5;
        this.A01 = r3;
        this.A02 = r4;
        this.A00 = r2;
    }

    public boolean A02() {
        boolean z2;
        String A022 = this.A03.A02();
        C17150uc r0 = this.A01;
        AnonymousClass2TJ r7 = this.A01;
        UserJid userJid = r7.A02;
        String A012 = r0.A07.A01(userJid);
        this.A04.A02("report_product_tag");
        C18720x9 r4 = this.A02;
        ArrayList A0u = AnonymousClass000.A0u();
        String str = r7.A03;
        AnonymousClass26X.A00("id", str, A0u);
        String str2 = r7.A04;
        if (!TextUtils.isEmpty(str2)) {
            AnonymousClass26X.A00("reason", str2, A0u);
        }
        AnonymousClass26X.A00("catalog_session_id", r7.A05, A0u);
        if (A012 != null) {
            AnonymousClass26X.A00("direct_connection_encrypted_info", A012, A0u);
        }
        C35081lL[] r2 = new C35081lL[2];
        int A032 = C35081lL.A03("type", "report_product", r2);
        r2[1] = new C35081lL((Jid) userJid, "biz_jid");
        C28371Vv r5 = new C28371Vv("request", r2, (C28371Vv[]) A0u.toArray(new C28371Vv[A032]));
        C35081lL[] r22 = new C35081lL[4];
        C35081lL.A02("id", A022, r22, A032);
        C35081lL.A02("xmlns", "fb:thrift_iq", r22, 1);
        C35081lL.A02("type", "set", r22, 2);
        try {
            z2 = r4.A00.A0E(C16620tM.A02, 1319) ? C18720x9.A00(this, A022) : r4.A01.A0G(this, C28371Vv.A03(C34791ks.A00, r5, r22, 3), A022, 193, 32000);
        } catch (AnonymousClass1W9 e2) {
            Log.e(e2.getMessage());
            z2 = false;
        }
        StringBuilder A0r = AnonymousClass000.A0r("app/sendReportBizProduct productId=");
        A0r.append(str);
        A0r.append(" success:");
        A0r.append(z2);
        C13680ns.A1V(A0r);
        return z2;
    }

    public void APb(String str) {
        Log.e("sendReportBizProduct/delivery-error");
        C18630x0 r4 = this.A04;
        r4.A01("report_product_tag");
        this.A00.A00(this.A01, false);
        r4.A05("report_product_tag", false);
    }

    public void APn(UserJid userJid) {
        Log.e(AnonymousClass000.A0h(userJid.getRawString(), AnonymousClass000.A0r("sendReportBizProduct/direct-connection-error/jid=")));
        this.A00.A00(this.A01, false);
    }

    public void APo(UserJid userJid) {
        Log.e(AnonymousClass000.A0h(userJid.getRawString(), AnonymousClass000.A0r("sendReportBizProduct/direct-connection-success/jid=")));
        A02();
    }

    public void AQe(C28371Vv r6, String str) {
        Log.e("sendReportBizProduct/response-error");
        C18630x0 r4 = this.A04;
        r4.A01("report_product_tag");
        AnonymousClass2TJ r2 = this.A01;
        if (!A01(r2.A02, C34451kH.A00(r6))) {
            this.A00.A00(r2, false);
        }
        r4.A05("report_product_tag", false);
    }

    public void AYG(C28371Vv r6, String str) {
        AnonymousClass4Q5 r1;
        AnonymousClass2TJ r0;
        C18630x0 r4 = this.A04;
        r4.A01("report_product_tag");
        C28371Vv A0J = r6.A0J("response");
        boolean z2 = false;
        if (A0J != null) {
            C28371Vv A0J2 = A0J.A0J("success");
            if (A0J2 != null) {
                if ("true".equals(A0J2.A0L())) {
                    r1 = this.A00;
                    r0 = this.A01;
                    z2 = true;
                }
                r1 = this.A00;
                r0 = this.A01;
            } else {
                return;
            }
        } else {
            Log.e(AnonymousClass000.A0h(r6.toString(), AnonymousClass000.A0r("sendReportBizProduct/corrupted-response:")));
            r1 = this.A00;
            r0 = this.A01;
        }
        r1.A00(r0, z2);
        r4.A05("report_product_tag", z2);
    }
}
