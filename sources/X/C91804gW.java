package X;

import android.media.MediaCodec;

/* renamed from: X.4gW  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C91804gW implements MediaCodec.OnFrameRenderedListener {
    public final /* synthetic */ C108265Nh A00;
    public final /* synthetic */ C97084pN A01;

    public /* synthetic */ C91804gW(C108265Nh r1, C97084pN r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void onFrameRendered(MediaCodec mediaCodec, long j2, long j3) {
        this.A00.ARd(this.A01, j2, j3);
    }
}
