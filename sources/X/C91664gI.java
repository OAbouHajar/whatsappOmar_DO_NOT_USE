package X;

import android.hardware.Camera;
import com.facebook.redex.RunnableRunnableShape15S0200000_I1_3;

/* renamed from: X.4gI  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C91664gI implements Camera.PreviewCallback {
    public final /* synthetic */ C56542np A00;

    public /* synthetic */ C91664gI(C56542np r1) {
        this.A00 = r1;
    }

    public final void onPreviewFrame(byte[] bArr, Camera camera) {
        C56542np r3 = this.A00;
        r3.A05.post(new RunnableRunnableShape15S0200000_I1_3(r3, 5, bArr));
    }
}
