package com.obwhatsapp.ui.media;

import X.AnonymousClass00T;
import X.AnonymousClass2Sy;
import X.AnonymousClass3MU;
import X.AnonymousClass52B;
import X.AnonymousClass5QO;
import X.C30931dC;
import X.C40651uT;
import X.C45922Bq;
import X.C56502nl;
import X.C812247i;
import android.content.Context;
import android.content.res.Resources;
import android.support.v4.view.GravityCompat;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.util.AttributeSet;
import com.facebook.redex.ViewOnClickCListenerShape13S0100000_I0_6;
import com.obwhatsapp.R;
import com.obwhatsapp.text.ReadMoreTextView;

public class MediaCaptionTextView extends ReadMoreTextView {
    public boolean A00;

    public MediaCaptionTextView(Context context) {
        super(context);
        A00();
        A07();
    }

    public MediaCaptionTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
        A07();
    }

    public MediaCaptionTextView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        A00();
        A07();
    }

    public MediaCaptionTextView(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet);
        A00();
    }

    private void A07() {
        setOnClickListener(new ViewOnClickCListenerShape13S0100000_I0_6(this, 36));
        this.A02 = new AnonymousClass52B();
    }

    public void A0L(AnonymousClass5QO r11, CharSequence charSequence, boolean z2) {
        float dimensionPixelSize;
        int length;
        if (TextUtils.isEmpty(charSequence)) {
            setVisibility(8);
            return;
        }
        int A002 = C40651uT.A00(charSequence);
        Context context = getContext();
        if (A002 > 0) {
            float dimensionPixelSize2 = (float) context.getResources().getDimensionPixelSize(R.dimen.dimen0144);
            dimensionPixelSize = dimensionPixelSize2 + (((Math.max(dimensionPixelSize2, Math.min(dimensionPixelSize2, (getContext().getResources().getDisplayMetrics().density * dimensionPixelSize2) / getContext().getResources().getDisplayMetrics().scaledDensity) * 1.5f) - dimensionPixelSize2) * ((float) (4 - A002))) / 3.0f);
        } else {
            Resources resources = context.getResources();
            int length2 = charSequence.length();
            int i2 = R.dimen.dimen0145;
            if (length2 < 96) {
                i2 = R.dimen.dimen0144;
            }
            dimensionPixelSize = (float) resources.getDimensionPixelSize(i2);
        }
        int length3 = charSequence.length();
        int i3 = GravityCompat.START;
        if (length3 < 96) {
            i3 = 17;
        }
        setGravity(i3);
        setTextSize(0, dimensionPixelSize);
        setText(AnonymousClass2Sy.A03(getContext(), getPaint(), this.A0A, C45922Bq.A03(this.A09, this.A0B, charSequence)));
        setVisibility(0);
        if (z2 && r11 != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(getText());
            C30931dC.A06(spannableStringBuilder);
            URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class);
            if (uRLSpanArr != null && (length = uRLSpanArr.length) > 0) {
                int i4 = 0;
                do {
                    URLSpan uRLSpan = uRLSpanArr[i4];
                    String url = uRLSpan.getURL();
                    String A003 = C812247i.A00(url);
                    int spanStart = spannableStringBuilder.getSpanStart(uRLSpan);
                    spannableStringBuilder.replace(spanStart, spannableStringBuilder.getSpanEnd(uRLSpan), A003);
                    spannableStringBuilder.removeSpan(uRLSpan);
                    spannableStringBuilder.setSpan(new AnonymousClass3MU(r11, this, url), spanStart, A003.length() + spanStart, 0);
                    i4++;
                } while (i4 < length);
                setLinkTextColor(AnonymousClass00T.A00(getContext(), R.color.color090b));
                setMovementMethod(new C56502nl());
                setText(spannableStringBuilder);
                requestLayout();
            }
        }
    }

    public void setCaptionText(CharSequence charSequence) {
        A0L((AnonymousClass5QO) null, charSequence, false);
    }
}
