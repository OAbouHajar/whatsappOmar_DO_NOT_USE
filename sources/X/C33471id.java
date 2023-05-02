package X;

import android.os.Handler;
import com.facebook.redex.RunnableRunnableShape10S0100000_I0_9;
import com.whatsapp.jid.UserJid;
import java.util.Collection;

/* renamed from: X.1id  reason: invalid class name and case insensitive filesystem */
public class C33471id extends C33481ie {
    public final C15890s4 A00;
    public final AnonymousClass118 A01;

    public C33471id(C15890s4 r1, AnonymousClass118 r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public void A03(UserJid userJid) {
        A09();
    }

    public void A05(Collection collection) {
        A09();
    }

    public void A07(Collection collection) {
        A09();
    }

    public final void A09() {
        if (this.A00.A00.A05(C15910s6.A11)) {
            for (AnonymousClass1V3 r1 : this.A01.A00()) {
                if (r1 instanceof AnonymousClass1V2) {
                    AnonymousClass1V2 r12 = (AnonymousClass1V2) r1;
                    Handler handler = r12.A00;
                    handler.removeCallbacksAndMessages((Object) null);
                    handler.postDelayed(new RunnableRunnableShape10S0100000_I0_9((Object) r12, 10), 2000);
                }
            }
        }
    }
}
