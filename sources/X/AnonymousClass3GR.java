package X;

import com.mod2.fblibs.FacebookFacade;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.List;
import java.util.Map;

/* renamed from: X.3GR  reason: invalid class name */
public class AnonymousClass3GR implements C19550yc {
    public final C16300so A00;
    public final C109325Rp A01;

    public AnonymousClass3GR(C16300so r1, C109325Rp r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public void APb(String str) {
    }

    public void AQe(C28371Vv r3, String str) {
        this.A01.AQR(C34451kH.A00(r3));
    }

    public void AYG(C28371Vv r22, String str) {
        int i2;
        C28371Vv A0J = r22.A0J("linked_group");
        if (A0J != null) {
            List A0O = A0J.A0O("group");
            if (A0O.size() != 0) {
                C28371Vv r1 = (C28371Vv) C13690nt.A0Z(A0O);
                C16300so r0 = this.A00;
                UserJid userJid = (UserJid) r1.A0F(r0, UserJid.class, "creator");
                long A012 = C29501aj.A01(r1.A0N("creation", (String) null), 0) * 1000;
                String A0N = r1.A0N("subject", (String) null);
                long A013 = C29501aj.A01(r1.A0N("s_t", (String) null), 0) * 1000;
                int i3 = 0;
                if (r1.A0J("default_sub_group") != null) {
                    i3 = 3;
                }
                String A0N2 = r1.A0N("id", (String) null);
                if (A0N2 != null) {
                    boolean A1V = AnonymousClass000.A1V(r1.A0J("admin_request_required"));
                    try {
                        C16050sL A014 = C16030sJ.A01(A0N2);
                        Map A06 = C53262fQ.A06(r0, r1);
                        int A002 = C29501aj.A00(r1.A0N("size", (String) null), A06.size());
                        C109325Rp r7 = this.A01;
                        C30371cF A04 = C53262fQ.A04(r0, r1, r1.A0J(FacebookFacade.RequestParameter.DESCRIPTION));
                        if (C53262fQ.A08(r1)) {
                            i2 = 1;
                            if (r1.A0J("membership_approval_request") != null) {
                                i2 = 2;
                            }
                        } else {
                            i2 = 0;
                        }
                        r7.AY1(A014, userJid, A04, A0N, A06, A002, i3, i2, A012, A013, A1V);
                    } catch (AnonymousClass1W4 e2) {
                        Log.e("GetSubgroupInfoProtocolCallbackonSuccess/invalid jid exception", e2);
                    }
                }
            }
        }
    }
}
