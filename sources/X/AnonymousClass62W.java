package X;

import com.whatsapp.stickers.StickerView;

/* renamed from: X.62W  reason: invalid class name */
public final /* synthetic */ class AnonymousClass62W implements C436420x {
    public final /* synthetic */ C1205762e A00;
    public final /* synthetic */ C34151jm A01;
    public final /* synthetic */ Integer A02;

    public /* synthetic */ AnonymousClass62W(C1205762e r1, C34151jm r2, Integer num) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = num;
    }

    public final void AXn(boolean z2) {
        C1205762e r3 = this.A00;
        C34151jm r4 = this.A01;
        Integer num = this.A02;
        if (z2) {
            C110115dX.A0s(r3.A03, r3, 9);
            r3.A09.setVisibility(8);
            r3.A05.setVisibility(8);
            r3.A0B = r4;
            r3.A0D = num;
            r3.A0C.setContentDescription(C89674ci.A00(r3.A0E, r4));
            StickerView stickerView = r3.A0C;
            stickerView.A03 = true;
            stickerView.A04();
            return;
        }
        r3.A06.setVisibility(8);
        r3.A09.setVisibility(0);
        r3.A05.setVisibility(0);
    }
}
