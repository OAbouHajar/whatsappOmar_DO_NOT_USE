package X;

import com.whatsapp.stickers.store.StickerStoreFeaturedTabFragment;
import com.whatsapp.util.Log;
import java.util.Collections;
import java.util.List;

/* renamed from: X.4Pd  reason: invalid class name and case insensitive filesystem */
public abstract class C85614Pd {
    public void A00(List list) {
        List<C37771pi> list2 = list;
        if (this instanceof C78383xw) {
            C78383xw r2 = (C78383xw) this;
            Collections.sort(list2, new C38371qg());
            StickerStoreFeaturedTabFragment stickerStoreFeaturedTabFragment = r2.A00;
            stickerStoreFeaturedTabFragment.A06 = false;
            if (!stickerStoreFeaturedTabFragment.A1L() || !stickerStoreFeaturedTabFragment.A09.A01()) {
                stickerStoreFeaturedTabFragment.A0I = list2;
                StickerStoreFeaturedTabFragment.A01(stickerStoreFeaturedTabFragment);
            } else {
                stickerStoreFeaturedTabFragment.A0F.A0E(new AnonymousClass522(r2, list2), "meta-avatar", false);
            }
            stickerStoreFeaturedTabFragment.A1E();
            return;
        }
        C78393xx r22 = (C78393xx) this;
        for (C37771pi r13 : list2) {
            if (r13.A0F.equals("whatsappcuppy")) {
                AnonymousClass1MI r1 = r22.A00;
                if (r1.A00.A02(AnonymousClass1XK.A0S, 0, r13.A08, true, false, false, false)) {
                    r1.A02.A00(r13, new AnonymousClass520(r22.A01), (Integer) null, 4, false);
                    return;
                }
                Log.i("InitialStickerPackDownloader/downloadInitialStickerPack/autodownload is not safe, going to do nothing");
            }
        }
    }
}
