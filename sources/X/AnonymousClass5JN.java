package X;

/* renamed from: X.5JN  reason: invalid class name */
public class AnonymousClass5JN extends C1053459d {
    public static final byte[] A04 = {105, 0, 114, 34, 100, -55, 4, 35, -115, 58, -37, -106, 70, -23, 42, -60, 24, -2, -84, -108, 0, -19, 7, 18, -64, -122, -36, -62, -17, 76, -87, 43};
    public long A00 = 0;
    public C46922Gu A01;
    public boolean A02;
    public final AnonymousClass5JL A03;

    public AnonymousClass5JN(AnonymousClass5T1 r3) {
        super(r3);
        this.A03 = new AnonymousClass5JL(r3, r3.AA7() << 3);
    }

    public String A9q() {
        String A9q = this.A03.A9q();
        StringBuilder A0o = AnonymousClass000.A0o();
        int indexOf = A9q.indexOf(47);
        AnonymousClass3K3.A1M(A9q, A0o, 0, indexOf);
        A0o.append("/G");
        return AnonymousClass000.A0h(A9q.substring(indexOf + 1), A0o);
    }

    public int AA7() {
        return this.A03.A00;
    }

    public void AI1(C46932Gv r3, boolean z2) {
        this.A00 = 0;
        this.A03.AI1(r3, z2);
        this.A02 = z2;
        if (r3 instanceof C1054259l) {
            r3 = ((C1054259l) r3).A00;
        }
        if (r3 instanceof C1053759g) {
            r3 = ((C1053759g) r3).A01;
        }
        if (r3 instanceof C1053559e) {
            r3 = null;
        }
        this.A01 = (C46922Gu) r3;
    }

    public int Aaq(byte[] bArr, byte[] bArr2, int i2, int i3) {
        int i4 = this.A03.A00;
        A01(bArr, bArr2, i2, i4, i3);
        return i4;
    }

    public void reset() {
        this.A00 = 0;
        this.A03.reset();
    }
}
