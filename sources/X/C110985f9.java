package X;

import android.view.View;
import android.widget.ImageView;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import com.obwhatsapp.payments.ui.IndiaUpiBankPickerActivity;

/* renamed from: X.5f9  reason: invalid class name and case insensitive filesystem */
public class C110985f9 extends C005602k {
    public final View A00;
    public final ImageView A01;
    public final TextEmojiLabel A02;
    public final /* synthetic */ IndiaUpiBankPickerActivity A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C110985f9(View view, IndiaUpiBankPickerActivity indiaUpiBankPickerActivity) {
        super(view);
        this.A03 = indiaUpiBankPickerActivity;
        this.A01 = C13680ns.A0K(view, R.id.provider_icon);
        this.A02 = (TextEmojiLabel) view.findViewById(R.id.bank_name);
        this.A00 = view.findViewById(R.id.divider);
    }
}
