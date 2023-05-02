package X;

import android.view.View;
import com.obwhatsapp.textstatuscomposer.voice.VoiceRecordingView;

/* renamed from: X.52J  reason: invalid class name */
public final /* synthetic */ class AnonymousClass52J implements AnonymousClass5QX {
    public final /* synthetic */ VoiceRecordingView A00;

    public /* synthetic */ AnonymousClass52J(VoiceRecordingView voiceRecordingView) {
        this.A00 = voiceRecordingView;
    }

    public final void AWu(int i2) {
        C41531w5 r5 = this.A00.A0B;
        if (r5 != null) {
            C41521w4 r52 = (C41521w4) r5;
            long j2 = C41521w4.A0M / ((long) i2);
            r52.A02 = j2;
            if (r52.A0B && r52.A07 == null) {
                C41501w2 A002 = r52.A0D.A00(r52, j2);
                r52.A07 = A002;
                A002.A00();
                AnonymousClass2ZQ.A00(C19980zJ.A02((View) r52.A0H));
            }
        }
    }
}
