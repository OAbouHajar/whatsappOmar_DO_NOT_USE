package X;

/* renamed from: X.0ec  reason: invalid class name and case insensitive filesystem */
public class C08920ec implements AnonymousClass5TP {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final AnonymousClass5TP A05;
    public final AnonymousClass3BJ A06;
    public final Object A07;

    public C08920ec(AnonymousClass5TP r10, AnonymousClass3BJ r11) {
        this(r10, r11, (Object) null, r10.getWidth(), r10.getHeight(), r10.AH7(), r10.ACb(), 0);
    }

    public C08920ec(AnonymousClass5TP r11, AnonymousClass3BJ r12, Object obj, int i2, int i3, int i4, int i5, int i6) {
        this(r11, r12, obj, i2, i3, i4, i5, 0, i6);
    }

    public C08920ec(AnonymousClass5TP r2, AnonymousClass3BJ r3, Object obj, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.A06 = r3;
        this.A05 = r2;
        this.A03 = i2;
        this.A01 = i3;
        this.A04 = i4;
        this.A02 = i5;
        this.A00 = i7;
        this.A07 = obj;
    }

    public AnonymousClass5TP AAY(int i2) {
        return this.A05;
    }

    public int AAd() {
        return 1;
    }

    public int ACb() {
        return this.A02;
    }

    public Object AD4() {
        return this.A07;
    }

    public int AEB() {
        return 0;
    }

    public int AEC() {
        return 0;
    }

    public int AED() {
        return 0;
    }

    public int AEE() {
        return 0;
    }

    public AnonymousClass3BJ AFR() {
        return this.A06;
    }

    public int AH7() {
        return this.A04;
    }

    public int AHD(int i2) {
        return 0;
    }

    public int AHE(int i2) {
        return this.A00;
    }

    public int getHeight() {
        return this.A01;
    }

    public int getWidth() {
        return this.A03;
    }
}
