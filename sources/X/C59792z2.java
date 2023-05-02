package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import com.obwhatsapp.WaTextView;

/* renamed from: X.2z2  reason: invalid class name and case insensitive filesystem */
public final class C59792z2 extends C72823ml {
    public final View A00;
    public final TextEmojiLabel A01;
    public final WaTextView A02;

    public C59792z2(View view) {
        super(view);
        this.A00 = view;
        this.A01 = (TextEmojiLabel) C18450wi.A00(view, R.id.search_location_address);
        this.A02 = (WaTextView) C18450wi.A00(view, R.id.title);
    }

    public /* bridge */ /* synthetic */ void A08(Object obj) {
        String A0d;
        C72213lk r13 = (C72213lk) obj;
        C18450wi.A0H(r13, 0);
        TextEmojiLabel textEmojiLabel = this.A01;
        AnonymousClass26B r3 = r13.A01;
        String str = r3.A08;
        boolean A0R = C18450wi.A0R(str, "device");
        View view = this.A00;
        Context context = view.getContext();
        int i2 = R.color.color0505;
        if (A0R) {
            i2 = R.color.color0659;
        }
        C13680ns.A0v(context, textEmojiLabel, i2);
        C13690nt.A0s(view.getContext(), this.A02, r13.A00);
        String str2 = r3.A07;
        if (!TextUtils.isEmpty(str2)) {
            if (r3.A02()) {
                A0d = str2 == null ? null : C008603x.A04(str2).toString();
            } else {
                boolean equals = str.equals("country_default");
                Context context2 = view.getContext();
                int i3 = R.string.str0221;
                if (equals) {
                    i3 = R.string.str021f;
                }
                A0d = C13680ns.A0d(context2, str2, new Object[1], 0, i3);
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append(new SpannableString(C18450wi.A06("# ", A0d)));
            Drawable A04 = AnonymousClass00T.A04(view.getContext(), R.drawable.business_directory_ic_location);
            int A002 = AnonymousClass00T.A00(view.getContext(), R.color.color0505);
            if (C18450wi.A0R(str, "device")) {
                A04 = AnonymousClass00T.A04(view.getContext(), R.drawable.ic_location_nearby);
                A002 = AnonymousClass00T.A00(view.getContext(), R.color.color0659);
            }
            AnonymousClass00B.A06(A04);
            Drawable A06 = AnonymousClass2SR.A06(A04, A002);
            C18450wi.A0B(A06);
            C56522nn.A02(textEmojiLabel.getPaint(), A06, spannableStringBuilder, -1, 0, 1);
            textEmojiLabel.setText(spannableStringBuilder);
        }
        C13680ns.A18(textEmojiLabel, r13, 17);
    }
}
