package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import com.obwhatsapp.R;
import com.obwhatsapp.twofactor.SetCodeFragment;

/* renamed from: X.4uc  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C99804uc implements AnonymousClass5OV {
    public final /* synthetic */ SetCodeFragment A00;

    public /* synthetic */ C99804uc(SetCodeFragment setCodeFragment) {
        this.A00 = setCodeFragment;
    }

    public final SpannableStringBuilder AGB(String str) {
        Context context;
        int i2;
        SetCodeFragment setCodeFragment = this.A00;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        for (int i3 = 0; i3 < spannableStringBuilder.length(); i3++) {
            if (spannableStringBuilder.charAt(i3) == '*') {
                context = setCodeFragment.A03.getContext();
                i2 = R.color.color0150;
            } else if (spannableStringBuilder.charAt(i3) != 160) {
                context = setCodeFragment.A03.getContext();
                i2 = R.color.color0151;
            }
            spannableStringBuilder.setSpan(new AnonymousClass3MQ(setCodeFragment.A03.getContext(), AnonymousClass00T.A00(context, i2)), i3, i3 + 1, 33);
        }
        return spannableStringBuilder;
    }
}
