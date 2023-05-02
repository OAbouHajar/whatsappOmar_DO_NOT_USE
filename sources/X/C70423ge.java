package X;

import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import java.util.Map;

/* renamed from: X.3ge  reason: invalid class name and case insensitive filesystem */
public class C70423ge extends AnonymousClass3MG {
    public final /* synthetic */ int A00;
    public final /* synthetic */ URLSpan A01;
    public final /* synthetic */ Map A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C70423ge(URLSpan uRLSpan, Map map, int i2) {
        super(0, 0, 0);
        this.A02 = map;
        this.A01 = uRLSpan;
        this.A00 = i2;
    }

    public void onClick(View view) {
        Runnable runnable = (Runnable) this.A02.get(this.A01.getURL());
        if (runnable != null) {
            runnable.run();
        }
    }

    public void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
        int i2 = this.A00;
        if (i2 == 0) {
            i2 = textPaint.linkColor;
        }
        textPaint.setColor(i2);
    }
}
