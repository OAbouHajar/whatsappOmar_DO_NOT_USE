package X;

import android.graphics.drawable.ColorDrawable;
import android.view.Window;
import androidx.recyclerview.widget.RecyclerView;
import com.obwhatsapp.CatalogImageListActivity;

/* renamed from: X.2rS  reason: invalid class name and case insensitive filesystem */
public class C57612rS extends AnonymousClass071 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ C005402i A03;
    public final /* synthetic */ CatalogImageListActivity A04;

    public C57612rS(C005402i r1, CatalogImageListActivity catalogImageListActivity, int i2, int i3, int i4) {
        this.A04 = catalogImageListActivity;
        this.A00 = i2;
        this.A01 = i3;
        this.A03 = r1;
        this.A02 = i4;
    }

    public void A00(RecyclerView recyclerView, int i2, int i3) {
        CatalogImageListActivity catalogImageListActivity = this.A04;
        float f2 = 1.0f;
        if (catalogImageListActivity.A02.A19() == 0) {
            int top2 = catalogImageListActivity.A02.A0B(0).getTop();
            int i4 = catalogImageListActivity.A04.A01;
            f2 = Math.min(Math.max(0.0f, ((float) (i4 - top2)) / ((float) i4)), 1.0f);
        }
        int i5 = this.A00;
        int i6 = this.A01;
        this.A03.A0D(new ColorDrawable(AnonymousClass090.A03(f2, i5, i6)));
        if (CatalogImageListActivity.A0C) {
            int A032 = AnonymousClass090.A03(f2, this.A02, i6);
            Window window = catalogImageListActivity.getWindow();
        }
    }
}
