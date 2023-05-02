package X;

import com.obwhatsapp.R;
import com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.362  reason: invalid class name */
public final class AnonymousClass362 extends C16690tT {
    public final AnonymousClass1CX A00;
    public final AnonymousClass4FJ A01;

    public AnonymousClass362(AnonymousClass1CX r2, AnonymousClass4FJ r3) {
        C18450wi.A0H(r2, 2);
        this.A01 = r3;
        this.A00 = r2;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        C37771pi[] r8 = (C37771pi[]) objArr;
        C18450wi.A0H(r8, 0);
        AnonymousClass00B.A06(r8);
        AnonymousClass00B.A0F(C13690nt.A1R(r8.length));
        C37771pi r6 = r8[0];
        List<C34151jm> list = r6.A04;
        C18450wi.A0B(list);
        ArrayList A0N = AnonymousClass1J9.A0N(list);
        for (C34151jm r3 : list) {
            A0N.add(new AnonymousClass4WQ(r3, 6, this.A00.A0H(r3)));
        }
        return new C87164Vr(r6, A0N);
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        C87164Vr r14 = (C87164Vr) obj;
        C18450wi.A0H(r14, 0);
        StickerStorePackPreviewActivity stickerStorePackPreviewActivity = this.A01.A00;
        stickerStorePackPreviewActivity.A0c = false;
        if (stickerStorePackPreviewActivity.A0S == null) {
            C14710pd r4 = stickerStorePackPreviewActivity.A0C;
            C38411qk A03 = stickerStorePackPreviewActivity.A0O.A03();
            AnonymousClass1MF r6 = stickerStorePackPreviewActivity.A0L;
            int dimensionPixelSize = stickerStorePackPreviewActivity.getResources().getDimensionPixelSize(R.dimen.dimen07b8);
            int dimensionPixelSize2 = stickerStorePackPreviewActivity.getResources().getDimensionPixelSize(R.dimen.dimen07b9);
            boolean z2 = stickerStorePackPreviewActivity.A0b;
            C55552jq r3 = new C55552jq(r4, stickerStorePackPreviewActivity.A0K, r6, stickerStorePackPreviewActivity.A0P, A03, dimensionPixelSize, dimensionPixelSize2, true, z2);
            stickerStorePackPreviewActivity.A0S = r3;
            r3.A05 = stickerStorePackPreviewActivity.A0h;
            stickerStorePackPreviewActivity.A0B.setAdapter(r3);
        }
        C55552jq r1 = stickerStorePackPreviewActivity.A0S;
        r1.A04 = r14.A00;
        r1.A06 = r14.A01;
        r1.A01();
        stickerStorePackPreviewActivity.A35();
    }
}
