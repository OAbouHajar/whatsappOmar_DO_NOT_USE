package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;

/* renamed from: X.2z5  reason: invalid class name and case insensitive filesystem */
public final class C59822z5 extends C72823ml {
    public final View A00;
    public final View A01;
    public final TextEmojiLabel A02;

    public C59822z5(View view) {
        super(view);
        this.A00 = view;
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) C18450wi.A00(view, R.id.allow_location_btn);
        this.A02 = textEmojiLabel;
        this.A01 = C18450wi.A00(view, R.id.more_options_btn);
        Context context = view.getContext();
        SpannableStringBuilder A0F = C13690nt.A0F(C18450wi.A06("# ", context.getString(R.string.str01a1)));
        C56522nn.A02(textEmojiLabel.getPaint(), AnonymousClass2SR.A04(context, C13690nt.A0C(context, R.drawable.ic_location_nearby), R.color.color090b), A0F, -1, 0, 1);
        textEmojiLabel.setText(A0F);
    }

    public /* bridge */ /* synthetic */ void A08(Object obj) {
        C18450wi.A0H(obj, 0);
        C13680ns.A18(this.A02, obj, 23);
        C13680ns.A18(this.A01, obj, 24);
    }
}
