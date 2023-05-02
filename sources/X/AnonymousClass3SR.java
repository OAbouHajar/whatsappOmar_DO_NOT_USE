package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;

/* renamed from: X.3SR  reason: invalid class name */
public class AnonymousClass3SR extends C005602k {
    public final ImageView A00;
    public final TextView A01;
    public final TextView A02;
    public final TextEmojiLabel A03;

    public AnonymousClass3SR(View view) {
        super(view);
        this.A01 = C13680ns.A0L(view, R.id.reactions_bottom_sheet_row_primary_text);
        this.A03 = C13680ns.A0Q(view, R.id.reactions_bottom_sheet_row_emoji);
        this.A02 = C13680ns.A0L(view, R.id.reactions_bottom_sheet_row_secondary_text);
        this.A00 = C13680ns.A0J(view, R.id.reactions_bottom_sheet_row_contact_image);
    }
}
