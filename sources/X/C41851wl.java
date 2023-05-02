package X;

import android.os.SystemClock;
import com.obwhatsapp.textstatuscomposer.voice.VoiceRecordingView;
import com.obwhatsapp.textstatuscomposer.voice.VoiceStatusRecordingVisualizer;

/* renamed from: X.1wl  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C41851wl implements Runnable {
    public final /* synthetic */ float A00;
    public final /* synthetic */ C41501w2 A01;

    public /* synthetic */ C41851wl(C41501w2 r1, float f2) {
        this.A01 = r1;
        this.A00 = f2;
    }

    public final void run() {
        C41501w2 r0 = this.A01;
        float f2 = this.A00;
        C41521w4 r02 = (C41521w4) r0.A0C.get();
        if (r02 != null) {
            VoiceStatusRecordingVisualizer voiceStatusRecordingVisualizer = ((VoiceRecordingView) r02.A0H).A0C;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j2 = voiceStatusRecordingVisualizer.A00;
            if (j2 != 0) {
                voiceStatusRecordingVisualizer.A01 = Math.max(elapsedRealtime - j2, 0);
            }
            voiceStatusRecordingVisualizer.A00 = elapsedRealtime;
            voiceStatusRecordingVisualizer.A0B.add(Float.valueOf(f2));
            if (!voiceStatusRecordingVisualizer.A06) {
                voiceStatusRecordingVisualizer.A06 = true;
                voiceStatusRecordingVisualizer.invalidate();
            }
        }
    }
}
