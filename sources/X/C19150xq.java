package X;

import com.obwhatsapp.data.IDxMObserverShape73S0100000_1_I0;
import com.obwhatsapp.status.StatusesFragment;
import com.obwhatsapp.status.viewmodels.StatusesViewModel;
import com.whatsapp.jid.UserJid;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;

/* renamed from: X.0xq  reason: invalid class name and case insensitive filesystem */
public class C19150xq extends C16580tI {
    public long A00;

    public C19150xq() {
        super(new AnonymousClass01T(Collections.emptySet(), (AnonymousClass01J) null));
    }

    public C19150xq(AnonymousClass01D r1) {
        super(r1);
    }

    public void A04(C15830rv r15) {
        for (C18940xV r4 : A01()) {
            this.A00++;
            if (r4 instanceof C34611kY) {
                C34611kY r42 = (C34611kY) r4;
                if (C16030sJ.A0Q(r15)) {
                    StatusesViewModel.A02(UserJid.of(r15), r42.A00);
                }
            } else if (r4 instanceof IDxMObserverShape73S0100000_1_I0) {
                IDxMObserverShape73S0100000_1_I0 iDxMObserverShape73S0100000_1_I0 = (IDxMObserverShape73S0100000_1_I0) r4;
                switch (iDxMObserverShape73S0100000_1_I0.A01) {
                    case 2:
                        C34621kZ r1 = (C34621kZ) iDxMObserverShape73S0100000_1_I0.A00;
                        if (r15 != null && r15.equals(r1.A0h)) {
                            r1.A0n.A0B(new C34631ka((C34641kb) null, (C34651kc) null, (Boolean) null, (Boolean) null, (Collection) null, false, true));
                            r1.A0C();
                            break;
                        }
                    case 6:
                        if (!C16030sJ.A0Q(r15)) {
                            break;
                        } else {
                            ((StatusesFragment) iDxMObserverShape73S0100000_1_I0.A00).A1D();
                            break;
                        }
                }
            }
        }
    }

    public void A05(C15830rv r7) {
        for (C18940xV A04 : A01()) {
            this.A00++;
            A04.A04(r7);
        }
    }

    public void A06(C15830rv r7, Collection collection, boolean z2) {
        for (C18940xV A002 : A01()) {
            this.A00++;
            A002.A00(r7, collection, z2);
        }
    }

    public void A07(C16740tZ r7, int i2) {
        for (C18940xV A06 : A01()) {
            this.A00++;
            A06.A06(r7, i2);
        }
    }

    public void A08(C16740tZ r7, int i2) {
        for (C18940xV A07 : A01()) {
            this.A00++;
            A07.A07(r7, i2);
        }
    }

    public void A09(Collection collection, int i2) {
        for (C18940xV A03 : A01()) {
            this.A00++;
            A03.A03(collection, i2);
        }
    }

    public void A0A(Collection collection, Map map) {
        for (C18940xV A08 : A01()) {
            this.A00++;
            A08.A08(collection, map);
        }
    }
}
