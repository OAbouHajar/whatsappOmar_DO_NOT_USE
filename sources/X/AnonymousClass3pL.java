package X;

import android.view.View;
import android.widget.RadioButton;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;

/* renamed from: X.3pL  reason: invalid class name */
public class AnonymousClass3pL extends C64683Rg {
    public final RadioButton A00;
    public final TextEmojiLabel A01;
    public final TextEmojiLabel A02;
    public final /* synthetic */ C57462rD A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3pL(View view, C57462rD r3) {
        super(view, r3);
        this.A03 = r3;
        this.A02 = C13680ns.A0R(view, R.id.select_list_item_title);
        this.A01 = C13680ns.A0R(view, R.id.select_list_item_description);
        this.A00 = (RadioButton) view.findViewById(R.id.select_list_item_radio_button);
        C13680ns.A17(view, this, 30);
    }
}
