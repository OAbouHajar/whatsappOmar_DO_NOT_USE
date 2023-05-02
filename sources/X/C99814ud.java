package X;

import android.text.SpannableStringBuilder;
import android.text.style.RelativeSizeSpan;
import com.obwhatsapp.CodeInputField;
import com.obwhatsapp.R;

/* renamed from: X.4ud  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C99814ud implements AnonymousClass5OV {
    public final /* synthetic */ int A00;
    public final /* synthetic */ CodeInputField A01;

    public /* synthetic */ C99814ud(CodeInputField codeInputField, int i2) {
        this.A01 = codeInputField;
        this.A00 = i2;
    }

    public final SpannableStringBuilder AGB(String str) {
        CodeInputField codeInputField = this.A01;
        int i2 = this.A00;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        for (int i3 = 0; i3 < spannableStringBuilder.length(); i3++) {
            if (spannableStringBuilder.charAt(i3) == ')') {
                int i4 = i3 + 1;
                spannableStringBuilder.setSpan(new RelativeSizeSpan(0.9f), i3, i4, 33);
                spannableStringBuilder.setSpan(new AnonymousClass3MQ(codeInputField.A07, i2 != 0 ? i2 : AnonymousClass00T.A00(codeInputField.getContext(), R.color.left)), i3, i4, 33);
            } else if (spannableStringBuilder.charAt(i3) != 160) {
                spannableStringBuilder.setSpan(new AnonymousClass3MQ(codeInputField.A07, i2 != 0 ? i2 : AnonymousClass00T.A00(codeInputField.getContext(), R.color.left)), i3, i3 + 1, 33);
            }
        }
        return spannableStringBuilder;
    }
}
