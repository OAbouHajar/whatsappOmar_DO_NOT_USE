package X;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.SpannableStringBuilder;
import android.widget.TextView;

/* renamed from: X.568  reason: invalid class name */
public final /* synthetic */ class AnonymousClass568 implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ SpannableStringBuilder A02;
    public final /* synthetic */ C30011bb A03;
    public final /* synthetic */ C70603hL A04;

    public /* synthetic */ AnonymousClass568(Context context, SpannableStringBuilder spannableStringBuilder, C30011bb r3, C70603hL r4, int i2) {
        this.A04 = r4;
        this.A03 = r3;
        this.A02 = spannableStringBuilder;
        this.A01 = context;
        this.A00 = i2;
    }

    public final void run() {
        C70603hL r5 = this.A04;
        C30011bb r1 = this.A03;
        SpannableStringBuilder spannableStringBuilder = this.A02;
        Context context = this.A01;
        int i2 = this.A00;
        r5.A06.setText(r1.A0r(spannableStringBuilder), TextView.BufferType.SPANNABLE);
        r5.A08.setColorFilter(AnonymousClass00T.A00(context, i2), PorterDuff.Mode.SRC_IN);
    }
}
