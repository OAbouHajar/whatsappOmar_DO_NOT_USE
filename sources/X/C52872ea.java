package X;

import android.content.Context;
import android.content.Intent;
import com.whatsapp.jid.UserJid;

/* renamed from: X.2ea  reason: invalid class name and case insensitive filesystem */
public class C52872ea implements C52852eY {
    public AnonymousClass1ME A00;
    public C14710pd A01;
    public C227919h A02;
    public C18090w8 A03;
    public AnonymousClass1N2 A04;

    public void AaR(Context context, C16740tZ r19, C16880tn r20, int i2) {
        Intent A012;
        Intent A002;
        C16880tn r0 = r20;
        C35251lc r13 = r0.A01;
        if (r13 != null) {
            boolean z2 = false;
            Context context2 = context;
            int i3 = i2;
            if (!"review_order".equals(r0.A00()) || !this.A01.A0E(C16620tM.A02, 2688)) {
                this.A00.A00();
                if (i3 == 1) {
                    z2 = true;
                }
            } else if (i2 != 0) {
                if (i3 == 1 && (A002 = this.A04.A00(context2, r13, (C28381Vw) null, r13.A08, r13.A03)) != null) {
                    context2.startActivity(A002);
                    return;
                }
                return;
            }
            String str = r13.A08;
            C18090w8 r9 = this.A03;
            C227919h r1 = this.A02;
            C16740tZ r02 = r19;
            UserJid A0C = r02.A0C();
            AnonymousClass00B.A06(A0C);
            String str2 = r13.A07;
            AnonymousClass00B.A06(str2);
            C28381Vw r8 = r02.A11;
            String str3 = r13.A0B;
            String str4 = r13.A09;
            String str5 = r13.A05.A07;
            if (r9.A07() && r9.A0D(str)) {
                A012 = r1.A00(context2);
            } else if (z2) {
                Class AEo = r1.A07.A03().AEo();
                if (AEo != null) {
                    A012 = new Intent(context2, AEo).putExtra("extra_is_quick_buy", true);
                } else {
                    return;
                }
            } else {
                A012 = r1.A01(context2);
            }
            if (A012 != null) {
                AnonymousClass1yL.A00(A012, r8);
                A012.putExtra("extra_order_id", str4);
                A012.putExtra("extra_order_discount_program_name", str5);
                A012.putExtra("extra_order_type", str3);
                A012.putExtra("extra_transaction_type", "p2m");
                A012.putExtra("extra_payment_config_id", str2);
                A012.putExtra("referral_screen", "order_details");
                A012.setFlags(603979776);
                AnonymousClass477.A00(context2, A012, A0C);
            }
        }
    }
}
