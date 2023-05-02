package X;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.obwhatsapp.R;

/* renamed from: X.5dm  reason: invalid class name and case insensitive filesystem */
public class C110265dm extends ClickableSpan {
    public final /* synthetic */ C113665mQ A00;
    public final /* synthetic */ C114005my A01;

    public C110265dm(C113665mQ r1, C114005my r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public void onClick(View view) {
        this.A01.A03.onClick(this.A00.A08);
    }

    public void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setColor(C13680ns.A0D(this.A00.A01).getColor(R.color.color04f8));
        textPaint.setUnderlineText(false);
    }
}
