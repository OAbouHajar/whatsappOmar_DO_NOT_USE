package com.whatsapp.util;

import X.AnonymousClass00T;
import X.AnonymousClass2TP;
import X.AnonymousClass3MR;
import X.C13690nt;
import android.content.Context;
import android.text.Spannable;
import android.text.style.BackgroundColorSpan;
import com.obwhatsapp.R;

public class IDxTHighlighterShape12S0000000_2_I0 extends AnonymousClass2TP {
    public final int A00;

    public IDxTHighlighterShape12S0000000_2_I0(int i2) {
        this.A00 = i2;
    }

    public void A03(Context context, Spannable spannable, int i2, int i3) {
        int i4;
        int i5;
        switch (this.A00) {
            case 0:
                spannable.setSpan(C13690nt.A0G(context, R.color.color06c0), i2, i3, 33);
                return;
            case 1:
                i4 = 33;
                spannable.setSpan(new BackgroundColorSpan(AnonymousClass00T.A00(context, R.color.color01ab)), i2, i3, 33);
                i5 = R.color.color01ac;
                break;
            case 2:
                i4 = 33;
                spannable.setSpan(new AnonymousClass3MR(context), i2, i3, 33);
                i5 = R.color.color0456;
                break;
            default:
                return;
        }
        spannable.setSpan(C13690nt.A0G(context, i5), i2, i3, i4);
    }
}
