package X;

import com.whatsapp.stickers.store.StickerStoreActivity;

/* renamed from: X.2vc  reason: invalid class name and case insensitive filesystem */
public abstract class C59262vc extends C14530pL {
    public boolean A00 = false;

    public C59262vc() {
        C13680ns.A1G(this, 133);
    }

    public void A1q() {
        if (!this.A00) {
            this.A00 = true;
            StickerStoreActivity stickerStoreActivity = (StickerStoreActivity) this;
            C49132Rg r3 = (C49132Rg) C14570pP.A1S(this);
            C16150sX r1 = r3.A1s;
            C14550pN.A15(r1, stickerStoreActivity);
            C14530pL.A0b(r3, r1, stickerStoreActivity, C14550pN.A0v(r1));
            stickerStoreActivity.A04 = C16150sX.A0Z(r1);
        }
    }
}
