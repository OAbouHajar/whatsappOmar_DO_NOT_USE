package com.facebook.redex;

import X.AnonymousClass01A;
import X.C13680ns;
import X.C13690nt;
import android.content.Context;
import android.content.Intent;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.obwhatsapp.R;
import com.obwhatsapp.support.DescribeProblemActivity;

public class IDxCSpanShape13S0100000_2_I0 extends ClickableSpan {
    public Object A00;
    public final int A01;

    public IDxCSpanShape13S0100000_2_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public void onClick(View view) {
        if (this.A01 != 0) {
            DescribeProblemActivity describeProblemActivity = (DescribeProblemActivity) this.A00;
            describeProblemActivity.startActivity(C13690nt.A0B(describeProblemActivity.A01));
            return;
        }
        Context context = view.getContext();
        Intent A09 = C13680ns.A09();
        A09.setClassName(context.getPackageName(), "com.obwhatsapp.status.audienceselector.StatusPrivacyActivity");
        ((AnonymousClass01A) this.A00).startActivityForResult(A09, 0);
    }

    public void updateDrawState(TextPaint textPaint) {
        if (this.A01 != 0) {
            super.updateDrawState(textPaint);
        } else {
            C13690nt.A0r(((AnonymousClass01A) this.A00).A0u(), textPaint, R.color.normal);
        }
    }
}
