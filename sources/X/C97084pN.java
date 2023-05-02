package X;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;

/* renamed from: X.4pN  reason: invalid class name and case insensitive filesystem */
public final class C97084pN implements AnonymousClass5T3 {
    public ByteBuffer[] A00;
    public ByteBuffer[] A01;
    public final MediaCodec A02;

    public C97084pN(MediaCodec mediaCodec) {
        this.A02 = mediaCodec;
    }

    public ByteBuffer ACo(int i2) {
        return AnonymousClass3C1.A01 >= 21 ? this.A02.getInputBuffer(i2) : this.A00[i2];
    }

    public ByteBuffer AE8(int i2) {
        return AnonymousClass3C1.A01 >= 21 ? this.A02.getOutputBuffer(i2) : this.A01[i2];
    }

    public void Abj(int i2, long j2) {
        this.A02.releaseOutputBuffer(i2, j2);
    }

    public void AeC(Handler handler, C108265Nh r4) {
        this.A02.setOnFrameRenderedListener(new C91804gW(r4, this), handler);
    }

    public void AeG(Surface surface) {
        this.A02.setOutputSurface(surface);
    }

    public void AeH(Bundle bundle) {
        this.A02.setParameters(bundle);
    }
}
