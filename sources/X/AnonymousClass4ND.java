package X;

import android.view.View;
import android.widget.ImageView;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import com.obwhatsapp.components.SelectionCheckView;

/* renamed from: X.4ND  reason: invalid class name */
public class AnonymousClass4ND {
    public final View A00;
    public final ImageView A01;
    public final TextEmojiLabel A02;
    public final TextEmojiLabel A03;
    public final SelectionCheckView A04;

    public AnonymousClass4ND(View view) {
        this.A00 = view;
        this.A01 = C13680ns.A0K(view, R.id.contactpicker_row_photo);
        TextEmojiLabel A0R = C13680ns.A0R(view, R.id.name);
        this.A02 = A0R;
        C004601z.A0d(A0R, 2);
        AnonymousClass1UP.A06(A0R);
        this.A04 = (SelectionCheckView) view.findViewById(R.id.selection_check);
        this.A03 = C13680ns.A0R(view, R.id.phone_number);
    }
}
