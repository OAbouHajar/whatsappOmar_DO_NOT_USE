package X;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import com.obwhatsapp.R;
import com.obwhatsapp.WaMediaThumbnailView;

/* renamed from: X.3SU  reason: invalid class name */
public final class AnonymousClass3SU extends C005602k {
    public final int A00;
    public final int A01;
    public final ColorDrawable A02;
    public final WaMediaThumbnailView A03;
    public final AnonymousClass2OM A04;

    public AnonymousClass3SU(View view, AnonymousClass2OM r4) {
        super(view);
        this.A04 = r4;
        this.A00 = view.getResources().getDimensionPixelSize(R.dimen.dimen03fd);
        int A002 = AnonymousClass00T.A00(view.getContext(), R.color.color00ef);
        this.A01 = A002;
        this.A02 = new ColorDrawable(A002);
        this.A03 = (WaMediaThumbnailView) AnonymousClass3K4.A0L(view, R.id.selected_media_item_thumbnail);
    }
}
