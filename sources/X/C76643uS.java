package X;

import android.widget.ImageView;
import com.obwhatsapp.R;
import com.obwhatsapp.businessdirectory.view.activity.BusinessDirectoryMapViewActivity;

/* renamed from: X.3uS  reason: invalid class name and case insensitive filesystem */
public final class C76643uS extends C55562jx {
    public final /* synthetic */ BusinessDirectoryMapViewActivity A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C76643uS(AnonymousClass0P5 r1, BusinessDirectoryMapViewActivity businessDirectoryMapViewActivity) {
        super(businessDirectoryMapViewActivity, r1);
        this.A00 = businessDirectoryMapViewActivity;
    }

    public void A0M(int i2) {
        ImageView imageView = this.A00.A04;
        if (imageView == null) {
            throw C18450wi.A03("myLocationBtn");
        }
        imageView.setImageResource(R.drawable.btn_myl);
    }
}
