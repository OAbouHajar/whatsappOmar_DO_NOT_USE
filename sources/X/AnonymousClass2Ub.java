package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.obwhatsapp.calling.videoparticipant.VideoCallParticipantView;

/* renamed from: X.2Ub  reason: invalid class name */
public abstract class AnonymousClass2Ub extends FrameLayout implements AnonymousClass006 {
    public C52662eE A00;
    public boolean A01;

    public AnonymousClass2Ub(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        if (!this.A01) {
            this.A01 = true;
            VideoCallParticipantView videoCallParticipantView = (VideoCallParticipantView) this;
            C16150sX r1 = ((C52652eD) ((C52642eC) generatedComponent())).A07;
            videoCallParticipantView.A0E = (C14710pd) r1.A05.get();
            videoCallParticipantView.A0D = (AnonymousClass013) r1.AR8.get();
        }
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A00;
        if (r0 == null) {
            r0 = new C52662eE(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }
}
