package X;

import android.content.Context;
import android.text.SpannableStringBuilder;

/* renamed from: X.270  reason: invalid class name */
public final /* synthetic */ class AnonymousClass270 implements C450826z {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ C19990zK A02;
    public final /* synthetic */ boolean A03;

    public /* synthetic */ AnonymousClass270(Context context, C19990zK r2, int i2, boolean z2) {
        this.A02 = r2;
        this.A01 = context;
        this.A00 = i2;
        this.A03 = z2;
    }

    public final void AW6(SpannableStringBuilder spannableStringBuilder, C16010sH r7, int i2, int i3) {
        C19990zK r0 = this.A02;
        Context context = this.A01;
        int i4 = this.A00;
        boolean z2 = this.A03;
        spannableStringBuilder.setSpan(new C70413gd(context, r0.A00, r7, i4), i2, i3, 33);
        if (z2) {
            spannableStringBuilder.setSpan(new AnonymousClass3MR(context.getApplicationContext()), i2 + 1, i3, 33);
        }
    }
}
