package X;

import android.view.View;
import com.obwhatsapp.R;
import com.obwhatsapp.biz.catalog.view.CatalogCarouselDetailImageView;
import com.obwhatsapp.components.button.ThumbnailButton;

/* renamed from: X.3Sw  reason: invalid class name and case insensitive filesystem */
public class C65103Sw extends C005602k {
    public View A00;
    public ThumbnailButton A01;
    public final /* synthetic */ CatalogCarouselDetailImageView A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C65103Sw(View view, CatalogCarouselDetailImageView catalogCarouselDetailImageView) {
        super(view);
        this.A02 = catalogCarouselDetailImageView;
        this.A00 = C004601z.A0E(view, R.id.product_detail_image_container);
        this.A01 = (ThumbnailButton) C004601z.A0E(view, R.id.product_detail_image);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0018, code lost:
        if (r9 == false) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A07(int r12, int r13, boolean r14) {
        /*
            r11 = this;
            if (r13 != 0) goto L_0x007a
            r2 = 0
        L_0x0004:
            r10 = 1
            boolean r9 = X.AnonymousClass3K3.A1Q(r12, r13)
            if (r12 == r13) goto L_0x000c
            r10 = 0
        L_0x000c:
            android.view.View r4 = r11.A00
            android.view.ViewGroup$LayoutParams r1 = r4.getLayoutParams()
            r8 = -1
            r1.height = r8
            if (r14 == 0) goto L_0x001a
            r0 = -2
            if (r9 != 0) goto L_0x001b
        L_0x001a:
            r0 = -1
        L_0x001b:
            r1.width = r0
            r4.setLayoutParams(r1)
            com.obwhatsapp.components.button.ThumbnailButton r5 = r11.A01
            android.view.ViewGroup$LayoutParams r4 = r5.getLayoutParams()
            r6 = 4605380978949069210(0x3fe999999999999a, double:0.8)
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 >= 0) goto L_0x004a
            com.obwhatsapp.biz.catalog.view.CatalogCarouselDetailImageView r0 = r11.A02
            android.content.Context r0 = r0.getContext()
            android.view.WindowManager r0 = X.AnonymousClass01V.A02(r0)
            android.graphics.Point r0 = X.C87594Xo.A01(r0)
            int r0 = r0.x
            r4.height = r0
            double r0 = (double) r0
            double r0 = r0 * r6
            int r8 = (int) r0
        L_0x0044:
            r4.width = r8
        L_0x0046:
            r5.setLayoutParams(r4)
            return
        L_0x004a:
            r6 = 4611280694460924559(0x3ffe8f5c28f5c28f, double:1.91)
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x006b
            com.obwhatsapp.biz.catalog.view.CatalogCarouselDetailImageView r0 = r11.A02
            android.content.Context r0 = r0.getContext()
            android.view.WindowManager r0 = X.AnonymousClass01V.A02(r0)
            android.graphics.Point r0 = X.C87594Xo.A01(r0)
            int r0 = r0.x
            r4.width = r0
            double r1 = (double) r0
            double r1 = r1 / r6
            int r0 = (int) r1
            r4.height = r0
            goto L_0x0046
        L_0x006b:
            if (r10 == 0) goto L_0x0070
            r4.height = r8
            goto L_0x0044
        L_0x0070:
            r0 = -2
            if (r9 == 0) goto L_0x0074
            r0 = -1
        L_0x0074:
            r4.height = r0
            if (r9 == 0) goto L_0x0044
            r8 = -2
            goto L_0x0044
        L_0x007a:
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r2 = (double) r12
            double r2 = r2 * r0
            double r0 = (double) r13
            double r2 = r2 / r0
            goto L_0x0004
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65103Sw.A07(int, int, boolean):void");
    }
}
