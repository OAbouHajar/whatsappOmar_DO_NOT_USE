package X;

import android.view.View;
import android.widget.TextView;
import com.obwhatsapp.R;

/* renamed from: X.3h3  reason: invalid class name and case insensitive filesystem */
public class C70513h3 extends C55812kR {
    public TextView A00;

    public boolean A01() {
        return false;
    }

    public void A02(View.OnClickListener onClickListener, String str, String str2) {
        super.A00(onClickListener, str, 0);
        TextView A0L = C13680ns.A0L(this.A00, R.id.share_link_action_item_description);
        this.A00 = A0L;
        A0L.setVisibility(0);
        TextView textView = this.A00;
        if (textView != null) {
            textView.setText(str2);
        }
    }
}
