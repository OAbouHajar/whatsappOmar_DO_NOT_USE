package com.facebook.rendercore.text;

import X.AnonymousClass000;
import X.AnonymousClass05M;
import X.C004601z;
import X.C13700nu;
import X.C57122qA;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.text.style.ImageSpan;
import android.view.MotionEvent;
import android.view.View;

public class RCTextView extends View {
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public ColorStateList A07;
    public Paint A08;
    public Path A09;
    public Layout A0A;
    public CharSequence A0B;
    public boolean A0C = false;
    public boolean A0D;
    public ClickableSpan[] A0E;
    public ImageSpan[] A0F;
    public final C57122qA A0G;

    public RCTextView(Context context) {
        super(context);
        if (getImportantForAccessibility() == 0) {
            C57122qA r1 = new C57122qA(this);
            this.A0G = r1;
            this.A0C = true;
            C004601z.A0j(this, r1);
            this.A0C = false;
            return;
        }
        this.A0G = null;
    }

    private Path getSelectionPath() {
        if (this.A06 == this.A05 || Color.alpha(this.A02) == 0) {
            return null;
        }
        if (this.A0D) {
            Path path = this.A09;
            if (path == null) {
                path = AnonymousClass000.A0I();
                this.A09 = path;
            }
            this.A0A.getSelectionPath(this.A06, this.A05, path);
            this.A0D = false;
        }
        return this.A09;
    }

    /* access modifiers changed from: private */
    public CharSequence getTextForAccessibility() {
        CharSequence charSequence = this.A0B;
        return (charSequence == null || charSequence.length() < 1000000) ? this.A0B : (!Character.isHighSurrogate(this.A0B.charAt(999999)) || !Character.isLowSurrogate(this.A0B.charAt(1000000))) ? this.A0B.subSequence(0, 1000000) : this.A0B.subSequence(0, 999999);
    }

    private void setSelection(ClickableSpan clickableSpan) {
        Spanned spanned = (Spanned) this.A0B;
        A02(spanned.getSpanStart(clickableSpan), spanned.getSpanEnd(clickableSpan));
    }

    public final int A01(int i2, int i3) {
        float paragraphLeft;
        float lineMax;
        int i4 = (int) (((float) i3) - this.A01);
        int i5 = (int) (((float) i2) - this.A00);
        int lineForVertical = this.A0A.getLineForVertical(i4);
        Layout.Alignment alignment = this.A0A.getAlignment();
        Layout.Alignment alignment2 = Layout.Alignment.ALIGN_CENTER;
        Layout layout = this.A0A;
        if (alignment == alignment2) {
            paragraphLeft = layout.getLineLeft(lineForVertical);
            lineMax = this.A0A.getLineRight(lineForVertical);
        } else {
            boolean A1R = AnonymousClass000.A1R(layout.getParagraphDirection(lineForVertical), -1);
            Layout layout2 = this.A0A;
            if (A1R) {
                paragraphLeft = ((float) layout2.getWidth()) - this.A0A.getLineMax(lineForVertical);
                lineMax = (float) this.A0A.getParagraphRight(lineForVertical);
            } else {
                paragraphLeft = (float) layout2.getParagraphLeft(lineForVertical);
                lineMax = this.A0A.getLineMax(lineForVertical);
            }
        }
        float f2 = (float) i5;
        if (f2 >= paragraphLeft && f2 <= lineMax) {
            try {
                return this.A0A.getOffsetForHorizontal(lineForVertical, f2);
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
        }
        return -1;
    }

    public final void A02(int i2, int i3) {
        if (Color.alpha(this.A02) == 0) {
            return;
        }
        if (this.A06 != i2 || this.A05 != i3) {
            this.A06 = i2;
            this.A05 = i3;
            Paint paint = this.A08;
            if (paint == null) {
                paint = C13700nu.A05();
                this.A08 = paint;
            }
            paint.setColor(this.A02);
            int i4 = this.A03;
            this.A08.setPathEffect(i4 != 0 ? new CornerPathEffect((float) i4) : null);
            this.A0D = true;
            invalidate();
        }
    }

    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        C57122qA r0 = this.A0G;
        return (r0 != null && r0.A0K(motionEvent)) || super.dispatchHoverEvent(motionEvent);
    }

    public void draw(Canvas canvas) {
        int save;
        boolean z2;
        super.draw(canvas);
        if (this.A0A != null) {
            if (this.A00 == 0.0f && this.A01 == 0.0f && getPaddingTop() == 0 && getPaddingLeft() == 0) {
                save = 0;
                z2 = false;
            } else {
                save = canvas.save();
                canvas.translate(this.A00, this.A01);
                canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
                z2 = true;
            }
            this.A0A.draw(canvas, getSelectionPath(), this.A08, 0);
            if (z2) {
                canvas.restoreToCount(save);
            }
        }
    }

    public Layout getLayout() {
        return this.A0A;
    }

    public float getLayoutTranslationX() {
        return this.A00;
    }

    public float getLayoutTranslationY() {
        return this.A01;
    }

    public CharSequence getText() {
        return this.A0B;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        ClickableSpan[] clickableSpanArr;
        ClickableSpan clickableSpan;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 3) {
            A02(0, 0);
            return false;
        }
        int A012 = A01((int) motionEvent.getX(), (int) motionEvent.getY());
        CharSequence charSequence = this.A0B;
        if (!(charSequence instanceof Spanned) || A012 < 0 || (clickableSpanArr = (ClickableSpan[]) ((Spanned) charSequence).getSpans(A012, A012, ClickableSpan.class)) == null || clickableSpanArr.length <= 0 || (clickableSpan = clickableSpanArr[0]) == null) {
            A02(0, 0);
            return super.onTouchEvent(motionEvent);
        } else if (actionMasked == 1) {
            A02(0, 0);
            clickableSpan.onClick(this);
            return true;
        } else if (actionMasked != 0) {
            return true;
        } else {
            setSelection(clickableSpan);
            return true;
        }
    }

    public void setAccessibilityDelegate(View.AccessibilityDelegate accessibilityDelegate) {
        AnonymousClass05M A0F2;
        super.setAccessibilityDelegate(accessibilityDelegate);
        C57122qA r1 = this.A0G;
        if (r1 != null && !this.A0C && (A0F2 = C004601z.A0F(this)) != r1) {
            r1.A00 = A0F2;
            this.A0C = true;
            C004601z.A0j(this, r1);
            this.A0C = false;
        }
    }
}
