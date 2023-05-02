package X;

import com.whatsapp.stickers.store.StickerStoreFeaturedTabFragment;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.522  reason: invalid class name */
public class AnonymousClass522 implements C38251qU {
    public final /* synthetic */ C78383xw A00;
    public final /* synthetic */ List A01;

    public AnonymousClass522(C78383xw r1, List list) {
        this.A00 = r1;
        this.A01 = list;
    }

    public void AXo(C37771pi r5) {
        StickerStoreFeaturedTabFragment stickerStoreFeaturedTabFragment = this.A00.A00;
        ArrayList A0u = AnonymousClass000.A0u();
        stickerStoreFeaturedTabFragment.A0I = A0u;
        A0u.add(r5);
        A0u.addAll(1, this.A01);
        StickerStoreFeaturedTabFragment.A01(stickerStoreFeaturedTabFragment);
    }

    public void AXq() {
        StickerStoreFeaturedTabFragment stickerStoreFeaturedTabFragment = this.A00.A00;
        stickerStoreFeaturedTabFragment.A0I = this.A01;
        StickerStoreFeaturedTabFragment.A01(stickerStoreFeaturedTabFragment);
        Log.e("StickerStoreFeaturedTabFragment/updatePackList: The avatar config is true but the avatar sticker pack is not available!");
    }
}
