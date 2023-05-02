package com.obwhatsapp.conversation.conversationrow;

import X.C004601z;
import X.C18450wi;
import X.C33741j5;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.redex.IDxIListenerShape29S0000000_2_I1;
import com.obwhatsapp.R;

public final class ConversationRowMediaControlView extends FrameLayout {
    public final View A00;
    public final ImageView A01;
    public final TextView A02;
    public final TextView A03;
    public final C33741j5 A04;
    public final C33741j5 A05;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ConversationRowMediaControlView(Context context) {
        this(context, (AttributeSet) null);
        C18450wi.A0H(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ConversationRowMediaControlView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C18450wi.A0H(context, 1);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConversationRowMediaControlView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        C18450wi.A0H(context, 1);
        LayoutInflater.from(context).inflate(R.layout.layout01aa, this, true);
        this.A04 = new C33741j5(C004601z.A0E(this, R.id.media_control_cancel_btn));
        C33741j5 r2 = new C33741j5(C004601z.A0E(this, R.id.media_control_progress_bar));
        this.A05 = r2;
        r2.A05(new IDxIListenerShape29S0000000_2_I1(3));
        this.A01 = (ImageView) C18450wi.A00(this, R.id.media_control_icon);
        this.A00 = C18450wi.A00(this, R.id.media_control_btn);
        this.A02 = (TextView) C18450wi.A00(this, R.id.media_control_primary_text);
        this.A03 = (TextView) C18450wi.A00(this, R.id.media_control_secondary_text);
    }

    public final View getButton() {
        return this.A00;
    }

    public final C33741j5 getCancelBtnViewStubHolder() {
        return this.A04;
    }

    public final ImageView getIcon() {
        return this.A01;
    }

    public final TextView getPrimaryTextView() {
        return this.A02;
    }

    public final C33741j5 getProgressBarViewStubHolder() {
        return this.A05;
    }
}
