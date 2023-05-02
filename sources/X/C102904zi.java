package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import com.obwhatsapp.R;

/* renamed from: X.4zi  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C102904zi implements C450826z {
    public final /* synthetic */ Context A00;

    public /* synthetic */ C102904zi(Context context) {
        this.A00 = context;
    }

    public final void AW6(SpannableStringBuilder spannableStringBuilder, C16010sH r5, int i2, int i3) {
        Context context = this.A00;
        spannableStringBuilder.setSpan(C13690nt.A0G(context, R.color.color054d), i2, i3, 33);
        spannableStringBuilder.setSpan(new AnonymousClass3MR(context.getApplicationContext()), i2 + 1, i3, 33);
    }
}
