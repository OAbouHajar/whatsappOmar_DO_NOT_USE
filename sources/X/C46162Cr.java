package X;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.provider.Settings;
import android.support.v4.view.MotionEventCompat;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.obwhatsapp.R;
import com.obwhatsapp.text.FinalBackspaceAwareEntry;
import com.obwhatsapp.youbasha.others;
import com.whatsapp.util.Log;

/* renamed from: X.2Cr  reason: invalid class name and case insensitive filesystem */
public abstract class C46162Cr extends AnonymousClass2Cs {
    public float A00;
    public int A01;
    public TextPaint A02;
    public String A03;
    public String A04;

    public C46162Cr(Context context) {
        super(context);
    }

    public C46162Cr(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public C46162Cr(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }

    public boolean A05() {
        Editable text;
        if (this instanceof FinalBackspaceAwareEntry) {
            FinalBackspaceAwareEntry finalBackspaceAwareEntry = (FinalBackspaceAwareEntry) this;
            text = finalBackspaceAwareEntry.A07(finalBackspaceAwareEntry.getText());
        } else {
            text = getText();
        }
        return TextUtils.isEmpty(text);
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        int i2 = this.A01;
        if (i2 != 0) {
            int i3 = editorInfo.imeOptions;
            int i4 = i3 & MotionEventCompat.ACTION_MASK;
            if ((i4 & i2) != 0) {
                int i5 = i3 ^ i4;
                editorInfo.imeOptions = i5;
                int i6 = i2 | i5;
                editorInfo.imeOptions = i6;
                i3 = i6;
            }
            if ((1073741824 & i3) != 0) {
                editorInfo.imeOptions = i3 & -1073741825;
            }
        }
        return onCreateInputConnection;
    }

    public void onDraw(Canvas canvas) {
        String str;
        int paddingLeft;
        super.onDraw(canvas);
        if (!isInEditMode() && this.A02 != null && !TextUtils.isEmpty(this.A04) && A05()) {
            AnonymousClass013 r0 = this.A03;
            if (r0 == null || (!r0.A0T())) {
                str = this.A04;
                paddingLeft = getPaddingLeft();
            } else {
                this.A02.setTextAlign(Paint.Align.RIGHT);
                str = this.A04;
                paddingLeft = getWidth() - getPaddingRight();
            }
            canvas.drawText(str, (float) paddingLeft, ((float) getTotalPaddingTop()) - this.A00, this.A02);
        }
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (!TextUtils.isEmpty(this.A03) && A05()) {
            accessibilityNodeInfo.setText(this.A03);
        }
    }

    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.A03 != null) {
            int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            if (this.A02 == null) {
                TextPaint textPaint = new TextPaint(1);
                this.A02 = textPaint;
                textPaint.setColor(AnonymousClass00T.A00(getContext(), R.color.color04c0));
                this.A02.setTextSize(getTextSize());
                this.A02.setTextAlign(Paint.Align.LEFT);
            }
            this.A04 = TextUtils.ellipsize(this.A03, this.A02, (float) measuredWidth, TextUtils.TruncateAt.END).toString();
            this.A00 = this.A02.getFontMetrics().top;
        }
    }

    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        if (!TextUtils.isEmpty(this.A03) && A05()) {
            accessibilityEvent.getText().add(this.A03);
        }
    }

    public void setHint(String str) {
        this.A03 = str;
        this.A04 = null;
        requestLayout();
    }

    public void setInputEnterAction(int i2) {
        this.A01 = i2;
        setRawInputType(180225);
        if (getText() != null) {
            others.rEntryText(this);
        }
        if (i2 == 0) {
            i2 = 1073741824;
        }
        AnonymousClass01V r0 = this.A02;
        if (r0 != null) {
            ContentResolver A0C = r0.A0C();
            if (A0C == null) {
                Log.w("conversation-text-entry/set-input-enter-action cr=null");
            } else if ("com.htc.android.htcime/.HTCIMEService".equals(Settings.Secure.getString(A0C, "default_input_method"))) {
                i2 |= 268435456;
            }
        }
        setImeOptions(i2);
    }
}
