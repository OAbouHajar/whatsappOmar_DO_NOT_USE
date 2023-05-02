package X;

/* renamed from: X.5J9  reason: invalid class name */
public class AnonymousClass5J9 extends C89424c9 {
    public AnonymousClass5J9(AnonymousClass5T1 r2) {
        if (!(r2 instanceof C1053459d)) {
            this.A01 = r2;
            this.A05 = new byte[(r2.AA7() << 1)];
            this.A00 = 0;
            return;
        }
        throw AnonymousClass000.A0T("CTSBlockCipher can only accept ECB, or CBC ciphers");
    }
}
