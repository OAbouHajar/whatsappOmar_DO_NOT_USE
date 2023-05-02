package X;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import android.view.MotionEvent;
import android.view.View;
import com.obwhatsapp.R;
import com.obwhatsapp.yo.Conversation;

/* renamed from: X.3MG  reason: invalid class name */
public abstract class AnonymousClass3MG extends CharacterStyle implements AnonymousClass5RP, UpdateAppearance {
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public boolean A04;

    public AnonymousClass3MG(int i2, int i3, int i4) {
        this.A01 = i2;
        this.A02 = i3;
        this.A00 = i4;
    }

    public AnonymousClass3MG(Context context) {
        this(context, R.color.color04f8);
    }

    public AnonymousClass3MG(Context context, int i2) {
        this.A01 = Conversation.getHyperlinksColor(i2, AnonymousClass00T.A00(context, i2));
        int A002 = AnonymousClass00T.A00(context, i2);
        this.A02 = A002;
        this.A00 = AnonymousClass090.A06(A002, 72);
    }

    public void AYv(MotionEvent motionEvent, View view) {
        boolean z2 = true;
        if (motionEvent.getAction() == 1) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (elapsedRealtime - this.A03 > 1000) {
                this.A03 = elapsedRealtime;
                if (this.A04) {
                    onClick(view);
                }
            }
        }
        if (motionEvent.getAction() != 0) {
            z2 = false;
        }
        this.A04 = z2;
        view.invalidate();
    }

    public void updateDrawState(TextPaint textPaint) {
        if (this.A04) {
            textPaint.setColor(this.A02);
            textPaint.bgColor = this.A00;
            textPaint.setUnderlineText(true);
            return;
        }
        int i2 = this.A01;
        if (i2 == 0) {
            i2 = textPaint.linkColor;
        }
        textPaint.setColor(i2);
        textPaint.setUnderlineText(false);
        textPaint.bgColor = 0;
    }
}
