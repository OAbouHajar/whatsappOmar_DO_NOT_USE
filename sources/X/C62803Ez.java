package X;

import android.graphics.Bitmap;
import com.obwhatsapp.R;
import com.obwhatsapp.biz.catalog.view.CatalogCarouselDetailImageView;
import com.obwhatsapp.components.button.ThumbnailButton;
import java.util.Map;

/* renamed from: X.3Ez  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C62803Ez implements C108535Oj {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C65103Sw A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ Map A04;
    public final /* synthetic */ boolean A05;

    public /* synthetic */ C62803Ez(C65103Sw r1, String str, Map map, int i2, int i3, boolean z2) {
        this.A02 = r1;
        this.A04 = map;
        this.A03 = str;
        this.A05 = z2;
        this.A00 = i2;
        this.A01 = i3;
    }

    public final void ASw(Bitmap bitmap, C62723Er r19, boolean z2) {
        C65103Sw r2 = this.A02;
        Map map = this.A04;
        String str = this.A03;
        boolean z3 = this.A05;
        int i2 = this.A00;
        int i3 = this.A01;
        ThumbnailButton thumbnailButton = r2.A01;
        if (thumbnailButton.getTag().equals(str)) {
            Bitmap bitmap2 = bitmap;
            if (i2 == 0 || i3 == 0) {
                i2 = bitmap2.getWidth();
                i3 = bitmap2.getHeight();
                r2.A07(i2, i3, z3);
            }
            boolean z4 = false;
            if (i2 < i3) {
                z4 = true;
            }
            if (i2 == i3 || (z3 && z4)) {
                thumbnailButton.setImageBitmap(bitmap2);
                return;
            }
            CatalogCarouselDetailImageView catalogCarouselDetailImageView = r2.A02;
            int A002 = AnonymousClass00T.A00(catalogCarouselDetailImageView.getContext(), R.color.color0101);
            AnonymousClass4H7 r12 = (AnonymousClass4H7) map.get(str);
            if (r12 != null) {
                catalogCarouselDetailImageView.setImageAndGradient(r12, z4, thumbnailButton, bitmap2, r2.A00);
                return;
            }
            C13700nu.A0W(new C78993z1(bitmap2, r2.A00, catalogCarouselDetailImageView, thumbnailButton, str, map, A002), catalogCarouselDetailImageView.A08);
        }
    }
}
