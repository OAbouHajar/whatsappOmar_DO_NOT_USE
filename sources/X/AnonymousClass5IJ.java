package X;

/* renamed from: X.5IJ  reason: invalid class name */
public class AnonymousClass5IJ extends C32061fa {
    public C107595Iu A00;

    public AnonymousClass5IJ(C32071fb r3, C32041fY r4) {
        C32391gH A0v = AnonymousClass3K3.A0v();
        A0v.A02(r4);
        this.A00 = new C107585It((C32071fb) AnonymousClass3K3.A0x(r3, A0v));
    }

    public AnonymousClass5IJ(C107595Iu r1) {
        this.A00 = r1;
    }

    public AnonymousClass5IJ(AnonymousClass5I9[] r2) {
        this.A00 = new C107585It((C32071fb[]) r2);
    }

    public static AnonymousClass5IJ A00(Object obj) {
        if (obj instanceof AnonymousClass5IJ) {
            return (AnonymousClass5IJ) obj;
        }
        if (obj != null) {
            return new AnonymousClass5IJ(C107595Iu.A00(obj));
        }
        return null;
    }

    public AnonymousClass5I9 A03() {
        C32071fb[] r1 = this.A00.A01;
        if (r1.length == 0) {
            return null;
        }
        return AnonymousClass5I9.A00(r1[0]);
    }

    public AnonymousClass5I9[] A04() {
        C32071fb[] r4 = this.A00.A01;
        int length = r4.length;
        AnonymousClass5I9[] r2 = new AnonymousClass5I9[length];
        for (int i2 = 0; i2 != length; i2++) {
            r2[i2] = AnonymousClass5I9.A00(r4[i2]);
        }
        return r2;
    }

    public C32051fZ Agm() {
        return this.A00;
    }
}
