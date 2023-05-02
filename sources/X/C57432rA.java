package X;

import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import com.obwhatsapp.R;
import com.obwhatsapp.biz.catalog.view.CatalogCarouselDetailImageView;
import com.obwhatsapp.components.button.ThumbnailButton;
import com.whatsapp.util.ViewOnClickCListenerShape0S0101000_I1;
import java.util.Map;

/* renamed from: X.2rA  reason: invalid class name and case insensitive filesystem */
public class C57432rA extends AnonymousClass01X {
    public final Map A00 = AnonymousClass000.A0x();
    public final /* synthetic */ CatalogCarouselDetailImageView A01;

    public C57432rA(CatalogCarouselDetailImageView catalogCarouselDetailImageView) {
        this.A01 = catalogCarouselDetailImageView;
    }

    public /* bridge */ /* synthetic */ void A07(C005602k r3) {
        ThumbnailButton thumbnailButton = ((C65103Sw) r3).A01;
        thumbnailButton.setImageBitmap((Bitmap) null);
        thumbnailButton.setOnClickListener((View.OnClickListener) null);
    }

    public int A0C() {
        return this.A01.A02.A06.size();
    }

    public /* bridge */ /* synthetic */ void ANf(C005602k r23, int i2) {
        ThumbnailButton thumbnailButton;
        C65103Sw r3 = (C65103Sw) r23;
        Map map = this.A00;
        CatalogCarouselDetailImageView catalogCarouselDetailImageView = r3.A02;
        if (!catalogCarouselDetailImageView.A02.A06.isEmpty()) {
            C35701mM r1 = catalogCarouselDetailImageView.A02;
            if (!r1.A02()) {
                boolean z2 = true;
                if (r1.A06.size() <= 1) {
                    z2 = false;
                }
                int i3 = i2;
                if (catalogCarouselDetailImageView.A02.A06.get(i3) != null) {
                    C35691mL r11 = (C35691mL) catalogCarouselDetailImageView.A02.A06.get(i3);
                    int i4 = r11.A03;
                    int i5 = r11.A02;
                    if (!(i4 == 0 || i5 == 0)) {
                        r3.A07(i4, i5, z2);
                    }
                    String A002 = AnonymousClass1KX.A00(i3, catalogCarouselDetailImageView.A02.A0D);
                    thumbnailButton = r3.A01;
                    if (!A002.equals(thumbnailButton.getTag())) {
                        thumbnailButton.setImageResource(R.color.color04f2);
                    }
                    thumbnailButton.setTag(A002);
                    int i6 = i4;
                    Map map2 = map;
                    String str = A002;
                    C65103Sw r16 = r3;
                    catalogCarouselDetailImageView.A04.A01(thumbnailButton, r11, (C108515Oh) null, catalogCarouselDetailImageView.getImageLoadContext(), (C108525Oi) null, new C62803Ez(r16, str, map2, i6, i5, z2), 1);
                } else {
                    thumbnailButton = r3.A01;
                    thumbnailButton.setImageResource(R.color.color04f2);
                }
                if (catalogCarouselDetailImageView.A0B) {
                    int i7 = 2;
                    if (!z2) {
                        i7 = 1;
                    }
                    thumbnailButton.setOnClickListener(new ViewOnClickCListenerShape0S0101000_I1(r3, i3, i7));
                    return;
                }
                return;
            }
        }
        C808345t.A00(r3.A01);
    }

    public /* bridge */ /* synthetic */ C005602k APF(ViewGroup viewGroup, int i2) {
        CatalogCarouselDetailImageView catalogCarouselDetailImageView = this.A01;
        return new C65103Sw(C13680ns.A0H(C13680ns.A0G(catalogCarouselDetailImageView), viewGroup, R.layout.layout04d3), catalogCarouselDetailImageView);
    }
}
