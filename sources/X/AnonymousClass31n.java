package X;

import com.facebook.redex.RunnableRunnableShape1S0201000_I1;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.31n  reason: invalid class name */
public class AnonymousClass31n extends C18940xV {
    public boolean A00;
    public final /* synthetic */ C55732kF A01;

    public AnonymousClass31n(C55732kF r1) {
        this.A01 = r1;
    }

    public void A07(C16740tZ r4, int i2) {
        if (r4 != null) {
            C28381Vw r2 = r4.A11;
            C55732kF r1 = this.A01;
            if (r2.equals(r1.A0B.A11) && !r2.A02) {
                C14870pt r22 = r1.A0B;
                r22.A02.post(new RunnableRunnableShape1S0201000_I1(r4, i2, this, 12));
            }
        }
    }

    public void A08(Collection collection, Map map) {
        C16750ta r0;
        C55732kF r6 = this.A01;
        C16740tZ r5 = r6.A0B;
        C55722kE A0A = r6.A0A();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C16740tZ A0V = C13680ns.A0V(it);
            if (A0V.A11.equals(r5.A11)) {
                A0A.A04.setVisibility(8);
                r5.A15 = true;
                if ((A0V instanceof C16730tY) && (r0 = ((C16730tY) A0V).A02) != null && !r0.A0P) {
                    r6.A0D();
                    return;
                }
                return;
            }
        }
    }
}
