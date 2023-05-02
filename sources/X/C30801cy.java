package X;

import com.facebook.redex.IDxObserverShape36S0200000_2_I0;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.1cy  reason: invalid class name and case insensitive filesystem */
public class C30801cy extends AnonymousClass027 {
    public final AtomicBoolean A00 = new AtomicBoolean(false);

    public C30801cy() {
    }

    public C30801cy(Object obj) {
        super(obj);
    }

    public static C30801cy A01() {
        return new C30801cy();
    }

    public void A0A(C001300o r3, AnonymousClass023 r4) {
        if (this.A00 > 0) {
            throw new IllegalStateException("Can not register multiple observers for a *Single*LiveEvent");
        }
        super.A0A(r3, new IDxObserverShape36S0200000_2_I0(r4, 10, this));
    }

    public void A0B(Object obj) {
        this.A00.set(true);
        super.A0B(obj);
    }
}
