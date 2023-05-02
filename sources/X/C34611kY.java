package X;

import com.obwhatsapp.status.viewmodels.StatusesViewModel;
import com.whatsapp.jid.UserJid;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.1kY  reason: invalid class name and case insensitive filesystem */
public class C34611kY extends C18940xV {
    public final /* synthetic */ StatusesViewModel A00;

    public /* synthetic */ C34611kY(StatusesViewModel statusesViewModel) {
        this.A00 = statusesViewModel;
    }

    public void A02(C16740tZ r3) {
        if (C16030sJ.A0Q(r3.A11.A00)) {
            StatusesViewModel.A02(UserJid.of(r3.A0B()), this.A00);
        }
    }

    public void A04(C15830rv r3) {
        if (C16030sJ.A0Q(r3)) {
            StatusesViewModel.A02(UserJid.of(r3), this.A00);
        }
    }

    public void A06(C16740tZ r3, int i2) {
        if (C16030sJ.A0Q(r3.A11.A00)) {
            StatusesViewModel.A02(UserJid.of(r3.A0B()), this.A00);
        }
    }

    public void A07(C16740tZ r3, int i2) {
        if (C16030sJ.A0Q(r3.A11.A00) && i2 == 12) {
            StatusesViewModel.A02(UserJid.of(r3.A0B()), this.A00);
        }
    }

    public void A08(Collection collection, Map map) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C16740tZ r2 = (C16740tZ) it.next();
            if (C16030sJ.A0Q(r2.A11.A00)) {
                StatusesViewModel.A02(UserJid.of(r2.A0B()), this.A00);
                return;
            }
        }
    }
}
