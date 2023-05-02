package X;

import android.content.Context;
import android.view.View;
import com.obwhatsapp.R;
import com.obwhatsapp.biz.catalog.view.CatalogMediaCard;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.3HC  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3HC implements C54312hC {
    public final /* synthetic */ C35701mM A00;
    public final /* synthetic */ AnonymousClass3F2 A01;
    public final /* synthetic */ UserJid A02;
    public final /* synthetic */ boolean A03;

    public /* synthetic */ AnonymousClass3HC(C35701mM r1, AnonymousClass3F2 r2, UserJid userJid, boolean z2) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = userJid;
        this.A03 = z2;
    }

    public final void AOh(View view, C54302hB r13) {
        AnonymousClass3F2 r4 = this.A01;
        C35701mM r3 = this.A00;
        UserJid userJid = this.A02;
        boolean z2 = this.A03;
        if (view.getTag(R.id.loaded_image_url) != null) {
            C18640x1 r1 = r4.A0A;
            String str = r3.A0D;
            if (r1.A05((UserJid) null, str) == null) {
                r4.A06.A09(R.string.str03c6, 0);
                Log.w("CatalogMediaCard/MediaThumbnailOnClick/product no longer exists");
                return;
            }
            CatalogMediaCard catalogMediaCard = r4.A0D;
            AnonymousClass5MT r0 = catalogMediaCard.A0B;
            if (r0 != null) {
                AnonymousClass2Xz.A01(((C100564vq) r0).A00, 7);
            }
            int thumbnailPixelSize = catalogMediaCard.A0I.getThumbnailPixelSize();
            boolean A0I = r4.A07.A0I(userJid);
            Context context = r4.A04;
            int i2 = 5;
            if (r4.A01 == null) {
                i2 = 4;
            }
            Integer valueOf = Integer.valueOf(thumbnailPixelSize);
            C61843Ap.A00(context, A0I ? C13680ns.A09().setClassName(context.getPackageName(), "com.obwhatsapp.biz.product.view.activity.ProductDetailActivity") : C14750ph.A0o(context, z2), userJid, valueOf, valueOf, str, i2, A0I);
        }
    }
}
