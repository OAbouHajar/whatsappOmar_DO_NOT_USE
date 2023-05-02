package X;

import android.view.View;
import android.widget.TextView;
import com.obwhatsapp.R;
import com.obwhatsapp.components.button.ThumbnailButton;

/* renamed from: X.3SH  reason: invalid class name */
public class AnonymousClass3SH extends C005602k {
    public final View A00;
    public final TextView A01;
    public final ThumbnailButton A02;

    public AnonymousClass3SH(View view) {
        super(view);
        this.A00 = view;
        this.A02 = (ThumbnailButton) view.findViewById(R.id.contact_row_photo);
        TextView A0M = C13680ns.A0M(view, R.id.contact_name);
        this.A01 = A0M;
        C004601z.A0d(A0M, 2);
    }
}
