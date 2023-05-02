package X;

import android.text.TextPaint;
import android.text.style.UnderlineSpan;

/* renamed from: X.3MT  reason: invalid class name */
public class AnonymousClass3MT extends UnderlineSpan {
    public final /* synthetic */ AnonymousClass39V A00;

    public AnonymousClass3MT(AnonymousClass39V r1) {
        this.A00 = r1;
    }

    public void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
