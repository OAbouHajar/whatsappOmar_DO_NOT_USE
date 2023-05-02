package X;

import android.media.audiofx.Visualizer;

/* renamed from: X.4gh  reason: invalid class name and case insensitive filesystem */
public class C91914gh implements Visualizer.OnDataCaptureListener {
    public final /* synthetic */ AnonymousClass2DT A00;

    public C91914gh(AnonymousClass2DT r1) {
        this.A00 = r1;
    }

    public void onFftDataCapture(Visualizer visualizer, byte[] bArr, int i2) {
    }

    public void onWaveFormDataCapture(Visualizer visualizer, byte[] bArr, int i2) {
        AnonymousClass5PL r0 = this.A00.A0L;
        if (r0 != null) {
            r0.AZm(bArr);
        }
    }
}
