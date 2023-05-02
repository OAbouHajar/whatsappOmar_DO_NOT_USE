package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import com.obwhatsapp.WaImageView;

/* renamed from: X.2z3  reason: invalid class name and case insensitive filesystem */
public final class C59802z3 extends C72823ml {
    public final View A00;
    public final TextEmojiLabel A01;
    public final WaImageView A02;

    public C59802z3(View view) {
        super(view);
        TextEmojiLabel A0R = C13680ns.A0R(view, R.id.allow_location_btn);
        this.A01 = A0R;
        this.A00 = view.findViewById(R.id.more_options_btn);
        this.A02 = (WaImageView) view.findViewById(R.id.icon);
        Context context = view.getContext();
        SpannableStringBuilder A0F = C13690nt.A0F(C18450wi.A06("# ", context.getString(R.string.str01a1)));
        C56522nn.A02(A0R.getPaint(), AnonymousClass2SR.A04(context, C13690nt.A0C(context, R.drawable.ic_location_nearby), R.color.color090b), A0F, -1, 0, 1);
        A0R.setText(A0F);
    }

    public /* bridge */ /* synthetic */ void A08(Object obj) {
        C72193li r5 = (C72193li) obj;
        C18450wi.A0H(r5, 0);
        C13680ns.A18(this.A01, r5, 18);
        C13680ns.A18(this.A00, r5, 19);
        WaImageView waImageView = this.A02;
        Context context = this.A0H.getContext();
        String str = r5.A01;
        if (str == null) {
            str = "";
        }
        waImageView.setImageDrawable(AnonymousClass2SR.A02(context, C52602e7.A01(str), R.color.color0086));
    }
}
