package X;

import android.widget.SeekBar;
import com.obwhatsapp.textstatuscomposer.voice.VoiceRecordingView;

/* renamed from: X.3DJ  reason: invalid class name */
public class AnonymousClass3DJ implements SeekBar.OnSeekBarChangeListener {
    public final /* synthetic */ VoiceRecordingView A00;

    public AnonymousClass3DJ(VoiceRecordingView voiceRecordingView) {
        this.A00 = voiceRecordingView;
    }

    public void onProgressChanged(SeekBar seekBar, int i2, boolean z2) {
        VoiceRecordingView voiceRecordingView = this.A00;
        C41491w1 r1 = voiceRecordingView.A0D;
        if (r1 != null) {
            ((C41481w0) r1).A03(voiceRecordingView.A0E.getProgress(), z2);
        }
    }

    public void onStartTrackingTouch(SeekBar seekBar) {
        VoiceRecordingView voiceRecordingView = this.A00;
        C41491w1 r3 = voiceRecordingView.A0D;
        if (r3 != null) {
            int progress = voiceRecordingView.A0E.getProgress();
            C41481w0 r32 = (C41481w0) r3;
            AnonymousClass027 r1 = r32.A08;
            Object A01 = r1.A01();
            if (A01 != null) {
                r32.A01 = (AnonymousClass2U6) A01;
                r1.A0B(new AnonymousClass2UA(r32));
                C30211bx r0 = r32.A02;
                if (r0 != null) {
                    r0.A04();
                }
                r32.A04.removeCallbacks(r32.A03);
                r32.A03(progress, false);
            } else {
                throw AnonymousClass000.A0T("Required value was null.");
            }
        }
        voiceRecordingView.setupPreviewProgressIndicatorSizes(true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onStopTrackingTouch(android.widget.SeekBar r6) {
        /*
            r5 = this;
            com.obwhatsapp.textstatuscomposer.voice.VoiceRecordingView r3 = r5.A00
            X.1w1 r2 = r3.A0D
            if (r2 == 0) goto L_0x0036
            com.obwhatsapp.voicerecorder.VoiceNoteSeekBar r0 = r3.A0E
            int r1 = r0.getProgress()
            X.1w0 r2 = (X.C41481w0) r2
            r0 = 1
            r2.A03(r1, r0)
            X.2U6 r1 = r2.A01
            if (r1 == 0) goto L_0x0096
            boolean r0 = r1 instanceof X.AnonymousClass2UA
            if (r0 == 0) goto L_0x0078
            java.lang.String r0 = "VoiceRecordingPreviewController: previous state before dragging is dragging"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x001f:
            X.2U9 r4 = new X.2U9
            r4.<init>(r2)
        L_0x0024:
            boolean r0 = r4 instanceof X.AnonymousClass2UA
            if (r0 == 0) goto L_0x0037
            java.lang.String r0 = "VoiceRecordingPreviewController: nextState is Dragging. This should never happen."
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x002d:
            X.027 r0 = r2.A08
            r0.A0B(r4)
            r0 = 0
            r3.setupPreviewProgressIndicatorSizes(r0)
        L_0x0036:
            return
        L_0x0037:
            boolean r0 = r4 instanceof X.AnonymousClass2U5
            if (r0 != 0) goto L_0x002d
            boolean r0 = r4 instanceof X.AnonymousClass2U9
            if (r0 == 0) goto L_0x0052
            X.1bx r1 = r2.A02
            if (r1 == 0) goto L_0x004a
            int r0 = r2.A00()
            r1.A0A(r0)
        L_0x004a:
            android.os.Handler r1 = r2.A04
            java.lang.Runnable r0 = r2.A03
            r1.post(r0)
            goto L_0x002d
        L_0x0052:
            boolean r0 = r4 instanceof X.AnonymousClass2U7
            if (r0 == 0) goto L_0x002d
            android.os.Handler r1 = r2.A04
            java.lang.Runnable r0 = r2.A03
            r1.post(r0)
            X.1bx r1 = r2.A02
            if (r1 == 0) goto L_0x0068
            int r0 = r2.A00()
            r1.A0A(r0)
        L_0x0068:
            X.1bx r0 = r2.A02
            if (r0 == 0) goto L_0x006f
            r0.A07()
        L_0x006f:
            X.1Az r1 = r2.A0I
            r0 = 2131890860(0x7f1212ac, float:1.9416424E38)
            r1.A02(r0)
            goto L_0x002d
        L_0x0078:
            boolean r0 = r1 instanceof X.AnonymousClass2U5
            if (r0 == 0) goto L_0x0082
            X.2U5 r4 = new X.2U5
            r4.<init>(r2)
            goto L_0x0024
        L_0x0082:
            boolean r0 = r1 instanceof X.AnonymousClass2U9
            if (r0 != 0) goto L_0x001f
            boolean r0 = r1 instanceof X.AnonymousClass2U7
            if (r0 == 0) goto L_0x0090
            X.2U7 r4 = new X.2U7
            r4.<init>(r2)
            goto L_0x0024
        L_0x0090:
            X.2Xe r0 = new X.2Xe
            r0.<init>()
            throw r0
        L_0x0096:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0T(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3DJ.onStopTrackingTouch(android.widget.SeekBar):void");
    }
}
