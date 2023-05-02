package X;

import com.whatsapp.stickers.StickerView;

/* renamed from: X.51z  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C1035951z implements C436420x {
    public final /* synthetic */ C16750ta A00;
    public final /* synthetic */ C61783Ah A01;
    public final /* synthetic */ C38641rB A02;
    public final /* synthetic */ boolean A03;

    public /* synthetic */ C1035951z(C16750ta r1, C61783Ah r2, C38641rB r3, boolean z2) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
        this.A03 = z2;
    }

    public final void AXn(boolean z2) {
        StickerView stickerView;
        C61783Ah r4 = this.A01;
        C16750ta r3 = this.A00;
        C38641rB r2 = this.A02;
        boolean z3 = this.A03;
        if (!z2) {
            r3.A0W = true;
            r4.A04(r2, z3);
            r4.A00();
            return;
        }
        if (r4.A02 || C89674ci.A00) {
            stickerView = r4.A0F;
            stickerView.A00 = C61783Ah.A0P;
            stickerView.A04();
        } else {
            stickerView = r4.A0F;
            if (stickerView.A03) {
                stickerView.A04();
            }
            stickerView.A00 = C61783Ah.A0O;
        }
        stickerView.setOnClickListener(r4.A03);
    }
}
