package X;

import java.util.List;

/* renamed from: X.3Ff  reason: invalid class name and case insensitive filesystem */
public class C62863Ff implements C16710tV {
    public final /* synthetic */ C18150wE A00;

    public C62863Ff(C18150wE r1) {
        this.A00 = r1;
    }

    public void AQR(int i2) {
        C84774Lv r0 = this.A00.A01;
        if (r0 != null) {
            AnonymousClass027 r2 = r0.A00;
            AnonymousClass4KE r02 = new AnonymousClass4KE(1);
            r02.A00 = i2;
            r2.A09(r02);
        }
    }

    public /* bridge */ /* synthetic */ void AYB(Object obj) {
        List<C73553oL> list = (List) obj;
        C84774Lv r4 = this.A00.A01;
        if (r4 != null) {
            C18450wi.A0H(list, 0);
            AnonymousClass4KE r3 = new AnonymousClass4KE(0);
            for (C73553oL r1 : list) {
                List list2 = r3.A02;
                String str = r1.A01;
                C18450wi.A0A(str);
                list2.add(new C71793l3(r1.A00, str, r1.A01, new AnonymousClass3Iq(r1, r4, list), new C106935Ft(r4)));
            }
            r4.A00.A09(r3);
        }
    }
}
