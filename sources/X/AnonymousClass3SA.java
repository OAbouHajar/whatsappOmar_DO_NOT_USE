package X;

import android.view.View;
import android.widget.ImageView;
import com.obwhatsapp.R;

/* renamed from: X.3SA  reason: invalid class name */
public final class AnonymousClass3SA extends C005602k {
    public final View A00;
    public final ImageView A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3SA(View view) {
        super(view);
        C18450wi.A0H(view, 1);
        this.A01 = (ImageView) AnonymousClass3K4.A0L(view, R.id.sticker_preview);
        this.A00 = AnonymousClass3K4.A0L(view, R.id.loading_progress);
    }
}
