package X;

import java.util.List;

/* renamed from: X.3QM  reason: invalid class name */
public class AnonymousClass3QM extends AnonymousClass07A {
    public final /* synthetic */ C57522rJ A00;
    public final /* synthetic */ List A01;

    public AnonymousClass3QM(C57522rJ r1, List list) {
        this.A00 = r1;
        this.A01 = list;
    }

    public int A00() {
        return this.A00.A04.size();
    }

    public int A01() {
        return this.A01.size();
    }

    public boolean A03(int i2, int i3) {
        C83364Gj r3 = (C83364Gj) this.A01.get(i2);
        C83364Gj r2 = (C83364Gj) this.A00.A04.get(i3);
        if (AnonymousClass08I.A01(r3.A01, r2.A01)) {
            C613538o r32 = r3.A00;
            int i4 = r32.A02;
            C613538o r22 = r2.A00;
            return AnonymousClass4Xc.A00(i4, r22.A02) && AnonymousClass4Xc.A00(r32.A00, r22.A00);
        }
    }

    public boolean A04(int i2, int i3) {
        return AnonymousClass000.A1P((((long) ((C83364Gj) this.A01.get(i2)).A01.A00) > ((long) ((C83364Gj) this.A00.A04.get(i3)).A01.A00) ? 1 : (((long) ((C83364Gj) this.A01.get(i2)).A01.A00) == ((long) ((C83364Gj) this.A00.A04.get(i3)).A01.A00) ? 0 : -1)));
    }
}
