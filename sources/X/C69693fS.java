package X;

/* renamed from: X.3fS  reason: invalid class name and case insensitive filesystem */
public final class C69693fS extends C87354Wl {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final byte[] A04;

    public C69693fS(byte[] bArr, int i2, int i3, int i4, int i5, int i6, int i7) {
        super(i6, i7);
        if (i4 + i6 > i2 || i5 + i7 > i3) {
            throw AnonymousClass000.A0T("Crop rectangle does not fit within image data.");
        }
        this.A04 = bArr;
        this.A01 = i2;
        this.A00 = i3;
        this.A02 = i4;
        this.A03 = i5;
    }
}
