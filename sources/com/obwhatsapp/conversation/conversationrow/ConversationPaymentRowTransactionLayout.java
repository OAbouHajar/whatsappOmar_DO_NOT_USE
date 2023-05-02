package com.obwhatsapp.conversation.conversationrow;

import X.AnonymousClass000;
import X.AnonymousClass006;
import X.C13690nt;
import X.C52662eE;
import android.content.Context;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.util.Log;

public class ConversationPaymentRowTransactionLayout extends LinearLayout implements AnonymousClass006 {
    public ViewGroup A00;
    public C52662eE A01;
    public boolean A02;

    public ConversationPaymentRowTransactionLayout(Context context) {
        this(context, (AttributeSet) null, 0, 0, 0);
    }

    public ConversationPaymentRowTransactionLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
    }

    public ConversationPaymentRowTransactionLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2, 0);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
    }

    public ConversationPaymentRowTransactionLayout(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
    }

    public ConversationPaymentRowTransactionLayout(Context context, AttributeSet attributeSet, int i2, int i3, int i4) {
        super(context, attributeSet);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A01;
        if (r0 == null) {
            r0 = C52662eE.A00(this);
            this.A01 = r0;
        }
        return r0.generatedComponent();
    }

    public void onMeasure(int i2, int i3) {
        int measuredWidth;
        int measuredHeight;
        TextView textView = (TextView) getChildAt(0);
        TextView textView2 = (TextView) getChildAt(1);
        if (textView2.getVisibility() != 0) {
            if (textView.getVisibility() != 0) {
                textView = null;
            }
            textView2 = textView;
        }
        super.onMeasure(i2, i3);
        if (textView2 != null && this.A00 != null) {
            boolean A1W = AnonymousClass000.A1W(textView2.getLayout());
            int measuredWidth2 = getMeasuredWidth();
            Layout layout = textView2.getLayout();
            if (layout == null) {
                Log.e("ConversationRowTransactionPill/onMeasure/error getting textView layout");
                return;
            }
            if (layout.getLineCount() > 1) {
                int desiredWidth = (int) Layout.getDesiredWidth(textView2.getText().subSequence(layout.getLineStart(layout.getLineCount() - 1), layout.getLineEnd(layout.getLineCount() - 1)), textView2.getPaint());
                int measuredWidth3 = textView2.getMeasuredWidth();
                if (!A1W && textView2.getText() != null && TextUtils.indexOf(textView2.getText(), 10) >= 0) {
                    measuredWidth3 = Math.min(measuredWidth3, ((int) Math.ceil((double) Layout.getDesiredWidth(textView2.getText(), textView2.getPaint()))) + textView2.getPaddingRight() + textView2.getPaddingLeft());
                }
                if (C13690nt.A05(this, measuredWidth2) >= this.A00.getMeasuredWidth() + measuredWidth3) {
                    setMeasuredDimension(measuredWidth3 + this.A00.getMeasuredWidth() + getPaddingLeft() + getPaddingRight(), getMeasuredHeight());
                    return;
                }
                if (C13690nt.A05(textView2, measuredWidth3) >= desiredWidth + this.A00.getMeasuredWidth()) {
                    return;
                }
                measuredWidth = getMeasuredWidth();
                measuredHeight = getMeasuredHeight() + this.A00.getMeasuredHeight();
            } else {
                if (C13690nt.A05(this, measuredWidth2) >= textView2.getMeasuredWidth() + this.A00.getMeasuredWidth()) {
                    measuredWidth = textView2.getMeasuredWidth() + this.A00.getMeasuredWidth() + getPaddingLeft() + getPaddingRight();
                    if (measuredWidth > getMeasuredWidth()) {
                        measuredHeight = getMeasuredHeight();
                    } else {
                        return;
                    }
                }
                measuredWidth = getMeasuredWidth();
                measuredHeight = getMeasuredHeight() + this.A00.getMeasuredHeight();
            }
            setMeasuredDimension(measuredWidth, measuredHeight);
        }
    }

    public void setDateWrapper(ViewGroup viewGroup) {
        this.A00 = viewGroup;
    }
}
