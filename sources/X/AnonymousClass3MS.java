package X;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.MotionEvent;
import android.view.View;
import com.obwhatsapp.R;

/* renamed from: X.3MS  reason: invalid class name */
public class AnonymousClass3MS extends URLSpan implements AnonymousClass5RP {
    public int A00;
    public int A01;
    public boolean A02;

    public AnonymousClass3MS(Context context, String str) {
        super(str);
        int A002 = AnonymousClass00T.A00(context, R.color.color04f8);
        this.A01 = A002;
        this.A00 = AnonymousClass090.A06(A002, 72);
    }

    public void AYv(MotionEvent motionEvent, View view) {
        boolean z2 = true;
        if (motionEvent.getAction() == 1 && this.A02) {
            onClick(view);
        }
        if (motionEvent.getAction() != 0) {
            z2 = false;
        }
        this.A02 = z2;
        view.invalidate();
    }

    public void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setColor(this.A01);
        textPaint.bgColor = this.A02 ? this.A00 : 0;
        textPaint.setUnderlineText(false);
    }
}
