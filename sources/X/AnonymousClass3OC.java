package X;

import android.content.Context;
import android.widget.FrameLayout;
import com.obwhatsapp.R;
import com.obwhatsapp.status.playback.content.BlurFrameLayout;
import com.obwhatsapp.status.playback.widget.VoiceStatusContentView;

/* renamed from: X.3OC  reason: invalid class name */
public class AnonymousClass3OC extends FrameLayout implements AnonymousClass006 {
    public BlurFrameLayout A00;
    public VoiceStatusContentView A01;
    public C52662eE A02;
    public boolean A03;

    public AnonymousClass3OC(Context context) {
        super(context);
        if (!this.A03) {
            this.A03 = true;
            generatedComponent();
        }
        FrameLayout.inflate(context, R.layout.layout0577, this);
        this.A01 = (VoiceStatusContentView) C004601z.A0E(this, R.id.message_voice);
        this.A00 = (BlurFrameLayout) C004601z.A0E(this, R.id.blur_container);
        this.A01.A06 = new C1035551v(this);
    }

    private void setBackgroundColorFromMessage(C38701rH r3) {
        int A002 = AnonymousClass47Y.A00(getContext(), r3);
        setBackgroundColor(A002);
        this.A00.setBackgroundColor(A002);
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A02;
        if (r0 == null) {
            r0 = C52662eE.A00(this);
            this.A02 = r0;
        }
        return r0.generatedComponent();
    }

    public C47772Kk getWavesView() {
        return this.A01;
    }

    public void setBlurEnabled(boolean z2) {
        this.A00.setBlurEnabled(z2);
    }

    public final void setMessage(C38701rH r2, AnonymousClass2Ao r3) {
        setBackgroundColorFromMessage(r2);
        this.A01.setVoiceMessage(r2, r3);
    }
}
