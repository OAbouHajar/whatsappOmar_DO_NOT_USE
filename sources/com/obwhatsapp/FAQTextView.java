package com.obwhatsapp;

import X.AnonymousClass3MF;
import X.AnonymousClass4BW;
import X.C14870pt;
import X.C17090uW;
import X.C17220uj;
import X.C45922Bq;
import X.C57102q8;
import X.C59142uk;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;

public class FAQTextView extends TextEmojiLabel {
    public C14870pt A00;
    public C17090uW A01;
    public C17220uj A02;
    public boolean A03;

    public FAQTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FAQTextView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        A00();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, AnonymousClass4BW.A05, 0, 0);
            try {
                String A0F = this.A01.A0F(obtainStyledAttributes, 1);
                String string = obtainStyledAttributes.getString(0);
                if (!(A0F == null || string == null)) {
                    setEducationTextFromArticleID(new SpannableStringBuilder(A0F), string);
                }
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        setAccessibilityHelper(new C57102q8(this, this.A09));
        setClickable(true);
    }

    public void setEducationText(Spannable spannable, String str, String str2) {
        setLinksClickable(true);
        setFocusable(false);
        this.A07 = new AnonymousClass3MF();
        if (str2 == null) {
            str2 = getContext().getString(R.string.str1cf6);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2);
        spannableStringBuilder.setSpan(new C59142uk(getContext(), this.A01, this.A00, this.A09, str), 0, str2.length(), 33);
        setText(C45922Bq.A02(getContext().getString(R.string.str08dd), spannable, spannableStringBuilder));
    }

    public void setEducationTextFromArticleID(Spannable spannable, String str) {
        setEducationText(spannable, this.A02.A04(str).toString(), (String) null);
    }

    public void setEducationTextFromNamedArticle(Spannable spannable, String str, String str2) {
        setEducationText(spannable, this.A02.A05(str, str2).toString(), (String) null);
    }
}
