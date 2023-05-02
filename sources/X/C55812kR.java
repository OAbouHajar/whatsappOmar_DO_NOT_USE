package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.obwhatsapp.R;
import com.whatsapp.util.ViewOnClickCListenerShape0S0200000_I0;

/* renamed from: X.2kR  reason: invalid class name and case insensitive filesystem */
public class C55812kR {
    public View A00;
    public C55822kS A01;
    public Runnable A02;

    public void A00(View.OnClickListener onClickListener, String str, int i2) {
        ((TextView) C004601z.A0E(this.A00, R.id.share_link_action_item_text)).setText(str);
        ImageView imageView = (ImageView) C004601z.A0E(this.A00, R.id.share_link_action_item_icon);
        if (A01()) {
            imageView.setImageDrawable(AnonymousClass00T.A04(this.A00.getContext(), i2));
        } else {
            imageView.setImageResource(0);
        }
        this.A00.setOnClickListener(new ViewOnClickCListenerShape0S0200000_I0(onClickListener, 5, this));
    }

    public boolean A01() {
        return true;
    }
}
