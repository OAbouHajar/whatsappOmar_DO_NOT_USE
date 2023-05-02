package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;

/* renamed from: X.3SY  reason: invalid class name */
public class AnonymousClass3SY extends C005602k {
    public View A00;
    public ImageView A01;
    public TextView A02;
    public TextEmojiLabel A03;
    public TextEmojiLabel A04;
    public C30521cU A05;

    public AnonymousClass3SY(View view, C16080sP r9, AnonymousClass013 r10, C25781Lc r11) {
        super(view);
        this.A05 = new C30521cU(view, r9, r10, r11, (int) R.id.name);
        this.A04 = C13680ns.A0R(view, R.id.status);
        this.A01 = C13680ns.A0K(view, R.id.avatar);
        this.A00 = view.findViewById(R.id.divider);
        this.A02 = C13680ns.A0M(view, R.id.invite);
        this.A03 = C13680ns.A0R(view, R.id.push_name);
        C004601z.A0d(this.A01, 2);
        view.setBackgroundResource(R.drawable.selector_orange_gradient);
        view.setFocusable(true);
        view.setClickable(true);
    }
}
