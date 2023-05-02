package X;

import com.facebook.redex.RunnableRunnableShape0S1200000_I0;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1Z7  reason: invalid class name */
public class AnonymousClass1Z7 {
    public boolean A00 = true;
    public final C14960q4 A01;
    public final C14930q1 A02;
    public final C85874Qi A03;

    public AnonymousClass1Z7(C14960q4 r2, C14930q1 r3, C85874Qi r4) {
        this.A01 = r2;
        this.A03 = r4;
        this.A02 = r3;
    }

    public void A00(String str) {
        A01(str, new HashMap());
    }

    @Deprecated
    public void A01(String str, Map map) {
        if (this.A00) {
            this.A03.A00(new RunnableRunnableShape0S1200000_I0(map, str, this, 13));
        }
    }

    public void A02(String str, Map map) {
        if (this.A00) {
            this.A03.A00(new RunnableRunnableShape0S1200000_I0(map, str, this, 15));
        }
    }
}
