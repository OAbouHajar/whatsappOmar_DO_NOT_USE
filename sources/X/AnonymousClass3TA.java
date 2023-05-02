package X;

/* renamed from: X.3TA  reason: invalid class name */
public class AnonymousClass3TA extends AnonymousClass0Fu {
    public final C16080sP A00;

    public AnonymousClass3TA(AnonymousClass01X r1, C16080sP r2) {
        super(r1);
        this.A00 = r2;
    }

    public /* bridge */ /* synthetic */ boolean A01(Object obj, Object obj2) {
        return C34901l3.A00(obj, obj2);
    }

    public /* bridge */ /* synthetic */ boolean A02(Object obj, Object obj2) {
        return C34901l3.A00(obj, obj2);
    }

    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        C16010sH r4 = (C16010sH) obj;
        C16010sH r5 = (C16010sH) obj2;
        C34911l4 r0 = r4.A0G;
        int i2 = r0 != null ? r0.A00 : 0;
        C34911l4 r02 = r5.A0G;
        if (i2 != (r02 != null ? r02.A00 : 0)) {
            return i2 == 3 ? -1 : 1;
        }
        C16080sP r03 = this.A00;
        String A08 = r03.A08(r4);
        String A082 = r03.A08(r5);
        if (A08 == null || A082 == null) {
            return 0;
        }
        return A08.compareTo(A082);
    }
}
