package X;

import com.facebook.redex.IDxLObserverShape336S0100000_2_I0;
import com.facebook.redex.IDxSObserverShape275S0100000_2_I0;
import java.util.List;

/* renamed from: X.2Yl  reason: invalid class name and case insensitive filesystem */
public class C50222Yl extends C003401n {
    public final C15830rv A00;
    public final C454728t A01;
    public final AnonymousClass290 A02;
    public final C19430yQ A03;
    public final C30801cy A04 = new C30801cy();

    public C50222Yl(C15830rv r5, C19430yQ r6) {
        IDxLObserverShape336S0100000_2_I0 iDxLObserverShape336S0100000_2_I0 = new IDxLObserverShape336S0100000_2_I0(this, 1);
        this.A02 = iDxLObserverShape336S0100000_2_I0;
        IDxSObserverShape275S0100000_2_I0 iDxSObserverShape275S0100000_2_I0 = new IDxSObserverShape275S0100000_2_I0(this, 1);
        this.A01 = iDxSObserverShape275S0100000_2_I0;
        this.A03 = r6;
        this.A00 = r5;
        List list = r6.A0X;
        if (!list.contains(iDxLObserverShape336S0100000_2_I0)) {
            list.add(iDxLObserverShape336S0100000_2_I0);
        }
        r6.A0U(iDxSObserverShape275S0100000_2_I0);
    }

    public void A04() {
        C19430yQ r2 = this.A03;
        r2.A0X.remove(this.A02);
        r2.A0W.remove(this.A01);
    }
}
