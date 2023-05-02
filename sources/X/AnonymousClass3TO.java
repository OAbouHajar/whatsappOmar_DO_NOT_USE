package X;

/* renamed from: X.3TO  reason: invalid class name */
public class AnonymousClass3TO extends AnonymousClass0JC {
    public int A00 = 0;
    public C09110ev A01;
    public final C65143Tc A02;

    public AnonymousClass3TO(C65143Tc r3, int i2) {
        AnonymousClass0T3.A00(AnonymousClass000.A1Q(i2));
        this.A02 = r3;
        this.A01 = C09110ev.A00(r3, r3.get(i2));
    }

    public void close() {
        C09110ev r0 = this.A01;
        if (r0 != null) {
            r0.close();
        }
        this.A01 = null;
        this.A00 = -1;
        super.close();
    }

    public void write(int i2) {
        write(new byte[]{(byte) i2});
    }

    public void write(byte[] bArr, int i2, int i3) {
        if (i2 < 0 || i3 < 0 || i2 + i3 > bArr.length) {
            StringBuilder A0r = AnonymousClass000.A0r("length=");
            A0r.append(bArr.length);
            A0r.append("; regionStart=");
            A0r.append(i2);
            throw new ArrayIndexOutOfBoundsException(C13680ns.A0i("; regionLength=", A0r, i3));
        } else if (C09110ev.A01(this.A01)) {
            int i4 = this.A00 + i3;
            if (C09110ev.A01(this.A01)) {
                if (i4 > ((AnonymousClass5TH) this.A01.A04()).AG6()) {
                    C65143Tc r4 = this.A02;
                    AnonymousClass5TH r3 = (AnonymousClass5TH) r4.get(i4);
                    ((AnonymousClass5TH) this.A01.A04()).A6n(r3, 0, 0, this.A00);
                    this.A01.close();
                    this.A01 = C09110ev.A00(r4, r3);
                }
                ((AnonymousClass5TH) this.A01.A04()).AiD(bArr, this.A00, i2, i3);
                this.A00 += i3;
                return;
            }
            throw new AnonymousClass5AX();
        } else {
            throw new AnonymousClass5AX();
        }
    }
}
