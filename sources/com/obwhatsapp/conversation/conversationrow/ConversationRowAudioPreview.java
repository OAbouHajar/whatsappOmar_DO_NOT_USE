package com.obwhatsapp.conversation.conversationrow;

import X.AnonymousClass006;
import X.C004601z;
import X.C13680ns;
import X.C14710pd;
import X.C16150sX;
import X.C16620tM;
import X.C52652eD;
import X.C52662eE;
import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.obwhatsapp.R;

public class ConversationRowAudioPreview extends FrameLayout implements AnonymousClass006 {
    public ImageView A00;
    public ImageView A01;
    public TextView A02;
    public WaveformVisualizerView A03;
    public C14710pd A04;
    public C52662eE A05;
    public boolean A06;

    public ConversationRowAudioPreview(Context context) {
        super(context);
        A01();
        A02(context);
    }

    public ConversationRowAudioPreview(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A01();
        A02(context);
    }

    public ConversationRowAudioPreview(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        A01();
        A02(context);
    }

    public ConversationRowAudioPreview(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet);
        A01();
    }

    public void A00() {
        this.A03.setVisibility(8);
        this.A00.setVisibility(0);
    }

    public void A01() {
        if (!this.A06) {
            this.A06 = true;
            this.A04 = C16150sX.A0k(C52652eD.A00(generatedComponent()));
        }
    }

    public final void A02(Context context) {
        TextView textView;
        float f2;
        FrameLayout.inflate(context, R.layout.layout0175, this);
        this.A01 = C13680ns.A0J(this, R.id.picture);
        this.A03 = (WaveformVisualizerView) C004601z.A0E(this, R.id.visualizer);
        this.A00 = C13680ns.A0J(this, R.id.icon);
        this.A02 = C13680ns.A0L(this, R.id.duration);
        boolean A0E = this.A04.A0E(C16620tM.A02, 1040);
        ImageView imageView = this.A01;
        if (A0E) {
            imageView.setImageResource(R.drawable.audio_file_background);
            this.A02.setTypeface((Typeface) null, 0);
            textView = this.A02;
            f2 = 10.0f;
        } else {
            imageView.setImageResource(R.drawable.audio_message_thumb);
            this.A02.setTypeface((Typeface) null, 1);
            textView = this.A02;
            f2 = 12.0f;
        }
        textView.setTextSize(2, f2);
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A05;
        if (r0 == null) {
            r0 = C52662eE.A00(this);
            this.A05 = r0;
        }
        return r0.generatedComponent();
    }

    public void setDuration(String str) {
        this.A02.setText(str);
    }
}
