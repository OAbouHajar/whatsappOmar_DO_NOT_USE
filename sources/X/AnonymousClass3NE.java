package X;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.obwhatsapp.calling.videoparticipant.VideoCallParticipantView;

/* renamed from: X.3NE  reason: invalid class name */
public class AnonymousClass3NE extends ViewOutlineProvider {
    public final /* synthetic */ int A00;
    public final /* synthetic */ VideoCallParticipantView A01;

    public AnonymousClass3NE(VideoCallParticipantView videoCallParticipantView, int i2) {
        this.A01 = videoCallParticipantView;
        this.A00 = i2;
    }

    public void getOutline(View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), (float) this.A00);
    }
}
