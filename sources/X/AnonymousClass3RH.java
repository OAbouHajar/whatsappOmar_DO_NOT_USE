package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.obwhatsapp.biz.catalog.view.CatalogCarouselDetailImageView;

/* renamed from: X.3RH  reason: invalid class name */
public class AnonymousClass3RH extends AnonymousClass07D {
    public final int A00;
    public final /* synthetic */ CatalogCarouselDetailImageView A01;

    public AnonymousClass3RH(CatalogCarouselDetailImageView catalogCarouselDetailImageView, int i2) {
        this.A01 = catalogCarouselDetailImageView;
        this.A00 = i2;
    }

    public void A03(Rect rect, View view, AnonymousClass0Ri r5, RecyclerView recyclerView) {
        int A002 = RecyclerView.A00(view);
        int i2 = 0;
        rect.top = 0;
        rect.bottom = 0;
        if (A002 != 0) {
            i2 = this.A00;
        }
        rect.left = i2;
    }
}
