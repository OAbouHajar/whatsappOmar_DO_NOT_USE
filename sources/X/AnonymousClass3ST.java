package X;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;

/* renamed from: X.3ST  reason: invalid class name */
public class AnonymousClass3ST extends C005602k {
    public final Button A00;
    public final ImageView A01;
    public final TextView A02;
    public final TextEmojiLabel A03;

    public AnonymousClass3ST(View view) {
        super(view);
        C004601z.A0o(view, true);
        this.A03 = C13680ns.A0R(view, R.id.name);
        this.A02 = C13680ns.A0M(view, R.id.description);
        this.A01 = C13680ns.A0K(view, R.id.image);
        this.A00 = (Button) view.findViewById(R.id.add_contact_btn);
    }
}
