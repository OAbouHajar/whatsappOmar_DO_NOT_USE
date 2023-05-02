package X;

import android.graphics.Rect;
import android.graphics.RectF;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
import android.view.View;
import com.facebook.rendercore.text.RCTextView;

/* renamed from: X.0Iw  reason: invalid class name and case insensitive filesystem */
public class C03530Iw extends AnonymousClass3MH {
    public final C14990q7 A00;
    public final C31201dg A01;
    public final C31201dg A02;
    public final C14930q1 A03;
    public final boolean A04;

    public C03530Iw(C14990q7 r1, C31201dg r2, C31201dg r3, C14930q1 r4, String str, String str2, boolean z2) {
        super(str, str2);
        this.A03 = r4;
        this.A02 = r2;
        this.A01 = r3;
        this.A00 = r1;
        this.A04 = z2;
    }

    public final C84614Lf A00(RCTextView rCTextView) {
        Spanned spanned = (Spanned) rCTextView.getText();
        Layout layout = rCTextView.getLayout();
        double spanStart = (double) spanned.getSpanStart(this);
        double spanEnd = (double) spanned.getSpanEnd(this);
        int i2 = (int) spanStart;
        double primaryHorizontal = (double) layout.getPrimaryHorizontal(i2);
        double primaryHorizontal2 = (double) layout.getPrimaryHorizontal((int) spanEnd);
        int lineForOffset = layout.getLineForOffset(i2);
        Rect A0J = AnonymousClass000.A0J();
        layout.getLineBounds(lineForOffset, A0J);
        RectF rectF = new RectF(A0J);
        float paddingBottom = (float) (((double) rectF.left) + ((((double) rCTextView.getPaddingBottom()) + primaryHorizontal) - ((double) rCTextView.getScrollX())) + ((double) rCTextView.getLayoutTranslationX()));
        rectF.left = paddingBottom;
        rectF.right = (float) ((((double) paddingBottom) + primaryHorizontal2) - primaryHorizontal);
        double scrollY = (double) (((float) (rCTextView.getScrollY() + rCTextView.getPaddingTop())) + rCTextView.getLayoutTranslationY());
        rectF.top = (float) (((double) rectF.top) + scrollY);
        rectF.bottom = (float) (((double) rectF.bottom) + scrollY);
        rCTextView.getMatrix().mapRect(rectF);
        rectF.offset((float) rCTextView.getLeft(), (float) rCTextView.getTop());
        return new C84614Lf(rectF.left + (rectF.width() / 2.0f), rectF.top + (rectF.height() / 2.0f), rectF.width(), rectF.height());
    }

    public void onClick(View view) {
        C14940q2 r4 = new C14940q2();
        r4.A03(this.A02, 0);
        if (!this.A04 || !(view instanceof RCTextView)) {
            r4.A03(this.A00, 1);
        } else {
            r4.A03(A00((RCTextView) view), 1);
        }
        C31201dg r3 = this.A01;
        C14930q1 r2 = this.A03;
        C29701b3.A01(this.A00, r3, r4.A01(), r2);
    }

    public void updateDrawState(TextPaint textPaint) {
    }
}
