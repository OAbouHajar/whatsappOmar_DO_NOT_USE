package X;

import com.facebook.redex.RunnableRunnableShape9S0200000_I0_7;
import java.util.Map;

/* renamed from: X.0vL  reason: invalid class name and case insensitive filesystem */
public class C17600vL {
    public final C16000sG A00;
    public final C17580vJ A01;
    public final C17590vK A02;
    public final C16320sq A03;

    public C17600vL(C16000sG r1, C17580vJ r2, C17590vK r3, C16320sq r4) {
        this.A03 = r4;
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }

    public void A00(Map map) {
        AnonymousClass1WA r1;
        C16320sq r5 = this.A03;
        RunnableRunnableShape9S0200000_I0_7 runnableRunnableShape9S0200000_I0_7 = new RunnableRunnableShape9S0200000_I0_7(this, 30, map);
        C23291Bk r52 = (C23291Bk) r5;
        Map map2 = r52.A01;
        synchronized (map2) {
            r1 = (AnonymousClass1WA) map2.get("PrivacyPhoneNumberHidingHelper/updateLidPhoneMappingAndDisplayName");
            if (r1 == null) {
                r1 = new AnonymousClass1WA(r52, false);
                map2.put("PrivacyPhoneNumberHidingHelper/updateLidPhoneMappingAndDisplayName", r1);
            }
        }
        r1.execute(runnableRunnableShape9S0200000_I0_7);
    }
}
