package X;

import android.graphics.Bitmap;
import android.view.View;
import com.obwhatsapp.biz.catalog.view.CatalogCarouselDetailImageView;
import com.obwhatsapp.components.button.ThumbnailButton;
import java.util.Map;

/* renamed from: X.3z1  reason: invalid class name and case insensitive filesystem */
public class C78993z1 extends C16690tT {
    public int A00;
    public Bitmap A01;
    public View A02;
    public ThumbnailButton A03;
    public String A04;
    public Map A05;
    public final /* synthetic */ CatalogCarouselDetailImageView A06;

    public C78993z1(Bitmap bitmap, View view, CatalogCarouselDetailImageView catalogCarouselDetailImageView, ThumbnailButton thumbnailButton, String str, Map map, int i2) {
        this.A06 = catalogCarouselDetailImageView;
        this.A02 = view;
        this.A03 = thumbnailButton;
        this.A01 = bitmap;
        this.A00 = i2;
        this.A05 = map;
        this.A04 = str;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        AnonymousClass0UB A002;
        AnonymousClass0QR r3;
        Bitmap bitmap = this.A01;
        int i2 = this.A00;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width == 0 || height == 0) {
            return new AnonymousClass4H7(i2, i2);
        }
        boolean A1Q = AnonymousClass3K3.A1Q(width, height);
        AnonymousClass0QR r10 = new AnonymousClass0QR(bitmap);
        if (A1Q) {
            double d2 = (double) width;
            r10.A01(0, 0, (int) (0.05d * d2), height);
            A002 = r10.A00();
            r3 = new AnonymousClass0QR(bitmap);
            r3.A01((int) (d2 * 0.95d), 0, width, height);
        } else {
            double d3 = (double) height;
            r10.A01(0, 0, width, (int) (0.05d * d3));
            A002 = r10.A00();
            r3 = new AnonymousClass0QR(bitmap);
            r3.A01(0, (int) (d3 * 0.95d), width, height);
        }
        AnonymousClass0UB A003 = r3.A00();
        int i3 = i2;
        AnonymousClass0S5 r0 = A002.A01;
        if (r0 != null) {
            i3 = r0.A08;
        }
        AnonymousClass0S5 r02 = A003.A01;
        if (r02 != null) {
            i2 = r02.A08;
        }
        return new AnonymousClass4H7(i3, i2);
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        AnonymousClass4H7 r3 = (AnonymousClass4H7) obj;
        this.A05.put(this.A04, r3);
        CatalogCarouselDetailImageView catalogCarouselDetailImageView = this.A06;
        Bitmap bitmap = this.A01;
        catalogCarouselDetailImageView.setImageAndGradient(r3, AnonymousClass3K3.A1Q(bitmap.getWidth(), bitmap.getHeight()), this.A03, bitmap, this.A02);
    }
}
