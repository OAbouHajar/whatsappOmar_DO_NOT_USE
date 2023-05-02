package X;

import com.obwhatsapp.picker.search.StickerSearchDialogFragment;
import com.obwhatsapp.picker.search.StickerSearchTabFragment;
import java.util.List;

/* renamed from: X.4m7  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C95114m7 implements AnonymousClass023 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ StickerSearchDialogFragment A01;
    public final /* synthetic */ StickerSearchTabFragment A02;

    public /* synthetic */ C95114m7(StickerSearchDialogFragment stickerSearchDialogFragment, StickerSearchTabFragment stickerSearchTabFragment, int i2) {
        this.A02 = stickerSearchTabFragment;
        this.A01 = stickerSearchDialogFragment;
        this.A00 = i2;
    }

    public final void AOH(Object obj) {
        StickerSearchTabFragment stickerSearchTabFragment = this.A02;
        StickerSearchDialogFragment stickerSearchDialogFragment = this.A01;
        int i2 = this.A00;
        C57482rF r2 = stickerSearchTabFragment.A03;
        if (r2 != null) {
            List list = (List) stickerSearchDialogFragment.A09.A00.A01();
            r2.A0E(list == null ? C13690nt.A0i(0) : stickerSearchDialogFragment.A0F.A00(list, i2));
            stickerSearchTabFragment.A03.A01();
        }
    }
}
