package X;

import android.view.View;
import android.widget.RadioButton;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import com.obwhatsapp.WaImageView;

/* renamed from: X.5fB  reason: invalid class name and case insensitive filesystem */
public class C111005fB extends C005602k {
    public final View A00;
    public final View A01;
    public final RadioButton A02;
    public final TextEmojiLabel A03;
    public final TextEmojiLabel A04;
    public final WaImageView A05;

    public C111005fB(View view) {
        super(view);
        this.A04 = C13680ns.A0Q(view, R.id.payment_title);
        this.A03 = C13680ns.A0Q(view, R.id.payment_subtitle);
        this.A05 = C13690nt.A0R(view, R.id.payment_option_icon);
        this.A02 = (RadioButton) C004601z.A0E(view, R.id.payment_radio_button);
        this.A01 = C004601z.A0E(view, R.id.payment_secure_badge);
        this.A00 = C004601z.A0E(view, R.id.payment_option_icon_wrapper);
    }
}
