package X;

import java.util.Map;

/* renamed from: X.4R8  reason: invalid class name */
public class AnonymousClass4R8 {
    public final /* synthetic */ C14960q4 A00;
    public final /* synthetic */ C14950q3 A01;
    public final /* synthetic */ C25491Jz A02;

    public AnonymousClass4R8(C14960q4 r1, C14950q3 r2, C25491Jz r3) {
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
    }

    public void A00(String str, Map map) {
        Object obj = this.A01.A00.get(1);
        if (obj instanceof C31411e8) {
            C14960q4 r3 = this.A00;
            C31421e9 r2 = ((C31411e8) obj).A00;
            C14940q2 r1 = new C14940q2();
            r1.A03(str, 0);
            r1.A03(map, 1);
            C14980q6.A00(r3, r1.A01(), r2);
        }
    }
}
