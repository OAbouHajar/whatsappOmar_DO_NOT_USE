package X;

/* renamed from: X.3T9  reason: invalid class name */
public class AnonymousClass3T9 extends AnonymousClass0Fu {
    public final AnonymousClass57A A00;

    public AnonymousClass3T9(AnonymousClass01X r2, C15810rt r3) {
        super(r2);
        this.A00 = new AnonymousClass57A(r3);
    }

    public /* bridge */ /* synthetic */ boolean A01(Object obj, Object obj2) {
        C56102ky r4 = (C56102ky) obj;
        C56102ky r5 = (C56102ky) obj2;
        int i2 = r4.A00;
        if (i2 != r5.A00) {
            return false;
        }
        if (i2 == 1) {
            return ((C39461sW) r4.A01).A02.equals(((C39461sW) r5.A01).A02);
        }
        return true;
    }

    public /* bridge */ /* synthetic */ boolean A02(Object obj, Object obj2) {
        C56102ky r4 = (C56102ky) obj;
        C56102ky r5 = (C56102ky) obj2;
        int i2 = r4.A00;
        if (i2 != r5.A00) {
            return false;
        }
        if (i2 == 1) {
            return ((C39461sW) r4.A01).A02.equals(((C39461sW) r5.A01).A02);
        }
        return true;
    }

    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        C56102ky r4 = (C56102ky) obj;
        C56102ky r5 = (C56102ky) obj2;
        int i2 = r4.A00;
        int i3 = r5.A00;
        if (i2 != i3) {
            return i2 - i3;
        }
        if (i2 != 1) {
            return 0;
        }
        return this.A00.compare((C39461sW) r4.A01, (C39461sW) r5.A01);
    }
}
