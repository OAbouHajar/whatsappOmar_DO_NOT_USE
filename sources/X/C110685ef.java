package X;

import com.whatsapp.util.Log;
import java.util.List;
import java.util.regex.Matcher;

/* renamed from: X.5ef  reason: invalid class name and case insensitive filesystem */
public abstract class C110685ef extends C003401n {
    public String A00;
    public final AnonymousClass027 A01;
    public final C15900s5 A02;
    public final C16440t3 A03;
    public final C16460t6 A04;
    public final C14710pd A05;
    public final AnonymousClass2St A06 = C110105dW.A0N();
    public final C1222969a A07;
    public final C222617g A08;
    public final C30801cy A09 = new C30801cy();

    public C110685ef(C15900s5 r4, C16440t3 r5, C16460t6 r6, C14710pd r7, C1222969a r8, C222617g r9) {
        AnonymousClass027 A0O = C13690nt.A0O();
        this.A01 = A0O;
        this.A05 = r7;
        this.A02 = r4;
        this.A03 = r5;
        this.A04 = r6;
        this.A08 = r9;
        this.A07 = r8;
        A0O.A0B(new C116785rw(1));
    }

    public String A05() {
        return this instanceof C114075n5 ? "report_this_payment_submitted" : this instanceof C114045n2 ? "contact_support_integrity_dpo_submitted" : this instanceof C114035n1 ? "appeal_request_ack" : this instanceof C114025n0 ? "contact_support_submitted" : this instanceof C114065n4 ? "contact_support_submitted_p2p" : "contact_ombudsman_submitted";
    }

    public String A06() {
        return this instanceof C114075n5 ? "report_this_payment" : this instanceof C114045n2 ? "contact_support_integrity_dpo" : this instanceof C114035n1 ? "restore_payment" : this instanceof C114025n0 ? "contact_support" : this instanceof C114065n4 ? "contact_support_p2p" : "contact_ombudsman";
    }

    public String A07(String str, String str2) {
        String str3;
        StringBuilder A0o = AnonymousClass000.A0o();
        if (this instanceof C114075n5) {
            str3 = "### ";
        } else if (this instanceof C114045n2) {
            str3 = "##### ";
        } else if (this instanceof C114035n1) {
            str3 = "#### ";
        } else if (this instanceof C114025n0) {
            str3 = "## ";
        } else {
            if (this instanceof C114065n4) {
                str3 = "###### ";
            }
            return AnonymousClass000.A0h(str2, A0o);
        }
        if (str3 != null) {
            A0o.append(str3);
            if (!AnonymousClass1ZW.A0E(str)) {
                A0o.append(str);
            }
            A0o.append(10);
        }
        return AnonymousClass000.A0h(str2, A0o);
    }

    public void A08(String str) {
        AnonymousClass2St A0N = C110105dW.A0N();
        A0N.A01("product_flow", "p2m");
        A0N.A00(this.A06);
        A0N.A01("status", str);
        this.A07.AKU(A0N, C13680ns.A0Y(), 114, A06(), (String) null);
    }

    public void A09(String str) {
        if (str.getBytes().length >= 10) {
            Matcher A0k = C110115dX.A0k(str, "[a-zA-Z\\u0080-\\u00ff]+");
            int i2 = 0;
            while (A0k.find()) {
                i2++;
                if (i2 >= 3) {
                    A08("sent");
                    this.A01.A0B(new C116785rw(4));
                    String A052 = this.A05.A05(this instanceof C114055n3 ? 1925 : 1924);
                    AnonymousClass00B.A06(A052);
                    try {
                        this.A04.A0W(this.A08.A04((AnonymousClass1ZR) null, C15830rv.A01(A052), (C16740tZ) null, (C30771cv) null, A07(this.A00, str), (List) null, this.A03.A00(), false, false));
                        return;
                    } catch (AnonymousClass1W4 unused) {
                        Log.e("PAY: BrazilPaymentCareBaseViewModel - failed to send message to Payment Support Brazil JID");
                        return;
                    }
                }
            }
        }
        A08("failed");
        this.A01.A0B(new C116785rw(2));
    }

    public void A0A(String str) {
        this.A00 = str;
        this.A06.A01("transaction_id", str);
    }
}
