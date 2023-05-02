package com.obwhatsapp.biz.catalog.view;

import X.AnonymousClass3MF;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.View;
import com.obwhatsapp.IDxTSpanShape53S0100000_2_I0;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import java.util.List;

public class EllipsizedTextEmojiLabel extends TextEmojiLabel {
    public int A00;
    public int A01;
    public int A02;
    public View.OnClickListener A03;
    public CharSequence A04;
    public List A05;
    public boolean A06;

    public EllipsizedTextEmojiLabel(Context context) {
        super(context);
        A00();
        this.A07 = new AnonymousClass3MF();
        this.A02 = R.color.color04f8;
    }

    public EllipsizedTextEmojiLabel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
        this.A07 = new AnonymousClass3MF();
        this.A02 = R.color.color04f8;
    }

    public EllipsizedTextEmojiLabel(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        A00();
        this.A07 = new AnonymousClass3MF();
        this.A02 = R.color.color04f8;
    }

    public EllipsizedTextEmojiLabel(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet);
        A00();
    }

    public void A0H(CharSequence charSequence, List list, int i2, boolean z2) {
        this.A04 = charSequence;
        this.A05 = list;
        this.A01 = i2;
        int codePointCount = Character.codePointCount(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        if (codePointCount > this.A00) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(getContext().getString(R.string.str134e));
            spannableStringBuilder2.setSpan(new IDxTSpanShape53S0100000_2_I0(getContext(), this, this.A02), 0, spannableStringBuilder2.length(), 18);
            int i3 = 0;
            for (int i4 = 0; i4 < this.A00; i4++) {
                i3 += Character.charCount(Character.codePointAt(charSequence, i3));
            }
            spannableStringBuilder = spannableStringBuilder.delete(i3, spannableStringBuilder.length()).append("... ").append(spannableStringBuilder2);
        }
        super.A0H(spannableStringBuilder, list, i2, true);
    }

    public void setEllipsizeLength(int i2) {
        this.A00 = i2;
    }

    public void setOnTextExpandClickListener(View.OnClickListener onClickListener) {
        this.A03 = onClickListener;
    }

    public void setReadMoreColor(int i2) {
        this.A02 = i2;
    }
}
