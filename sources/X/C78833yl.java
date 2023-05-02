package X;

import com.facebook.redex.RunnableRunnableShape7S0100000_I0_6;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;

/* renamed from: X.3yl  reason: invalid class name and case insensitive filesystem */
public class C78833yl extends C16690tT {
    public final C27421Rr A00;
    public final C16010sH A01;
    public final WeakReference A02;

    public C78833yl(C49682Va r2, C27421Rr r3, C16010sH r4) {
        this.A01 = r4;
        this.A00 = r3;
        this.A02 = C13690nt.A0h(r2);
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        C27421Rr r2 = this.A00;
        Jid A08 = this.A01.A08(UserJid.class);
        AnonymousClass00B.A06(A08);
        return r2.A00((UserJid) A08);
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        UserJid userJid;
        C49682Va r4;
        AnonymousClass1WT r6 = (AnonymousClass1WT) obj;
        UserJid userJid2 = null;
        if (r6 != null) {
            UserJid userJid3 = r6.A00;
            userJid = r6.A01;
            if (userJid3 == null || userJid == null) {
                Log.e("ChangeNumberNotificationBanner/GetChangeNumberMessageTask trying to show change number message for non-user jids");
            } else {
                userJid2 = userJid3;
                r4 = (C49682Va) this.A02.get();
                if (r4 != null && userJid2 != null && userJid != null) {
                    r4.A02 = userJid2;
                    r4.A03 = userJid;
                    boolean A03 = r4.A03();
                    boolean A04 = r4.A04();
                    if (A03) {
                        if (A04) {
                            r4.A05();
                            return;
                        } else {
                            r4.A04.postDelayed(new RunnableRunnableShape7S0100000_I0_6(r4, 12), 500);
                            return;
                        }
                    } else if (A04) {
                        r4.A02(true);
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
        }
        userJid = null;
        r4 = (C49682Va) this.A02.get();
        if (r4 != null) {
        }
    }
}
