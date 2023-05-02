package X;

import android.graphics.Bitmap;
import com.facebook.redex.RunnableRunnableShape17S0100000_I1;
import com.obwhatsapp.biz.catalog.CatalogMediaViewFragment;
import com.obwhatsapp.mediaview.PhotoView;

/* renamed from: X.4vi  reason: invalid class name and case insensitive filesystem */
public class C100484vi implements C108535Oj {
    public boolean A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ CatalogMediaViewFragment A02;
    public final /* synthetic */ PhotoView A03;

    public C100484vi(CatalogMediaViewFragment catalogMediaViewFragment, PhotoView photoView, int i2) {
        this.A02 = catalogMediaViewFragment;
        this.A03 = photoView;
        this.A01 = i2;
    }

    public void ASw(Bitmap bitmap, C62723Er r7, boolean z2) {
        if (this.A00) {
            CatalogMediaViewFragment catalogMediaViewFragment = this.A02;
            C102864ze r1 = new C102864ze(bitmap, this, this.A03);
            if (!catalogMediaViewFragment.A0E) {
                r1.AZA(true);
            } else {
                catalogMediaViewFragment.A0A = r1;
            }
        } else {
            this.A00 = true;
            PhotoView photoView = this.A03;
            photoView.A06(bitmap);
            CatalogMediaViewFragment catalogMediaViewFragment2 = this.A02;
            String str = catalogMediaViewFragment2.A09;
            if (str != null) {
                if (str.equals(AnonymousClass1KX.A00(this.A01, catalogMediaViewFragment2.A02.A0D))) {
                    photoView.post(new RunnableRunnableShape17S0100000_I1((Object) catalogMediaViewFragment2.A0D(), 24));
                }
            }
        }
    }
}
