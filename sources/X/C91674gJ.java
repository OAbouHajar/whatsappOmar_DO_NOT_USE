package X;

import android.hardware.Camera;

/* renamed from: X.4gJ  reason: invalid class name and case insensitive filesystem */
public class C91674gJ implements Camera.PreviewCallback {
    public Camera.Size A00;
    public boolean A01 = true;
    public final /* synthetic */ C49062Qp A02;

    public C91674gJ(C49062Qp r2) {
        this.A02 = r2;
    }

    public void onPreviewFrame(byte[] bArr, Camera camera) {
        boolean z2;
        Camera camera2;
        if (this.A01) {
            this.A01 = false;
            this.A02.A0I.A01("cameraView1");
        }
        if (this.A00 == null) {
            try {
                this.A00 = camera.getParameters().getPreviewSize();
            } catch (RuntimeException unused) {
            }
        }
        Camera.Size size = this.A00;
        if (size != null) {
            C49062Qp r5 = this.A02;
            C101204wt r4 = r5.A0W;
            int i2 = size.width;
            int i3 = size.height;
            synchronized (r4) {
                AnonymousClass4KL r1 = r4.A00;
                if (r1.A02 == null) {
                    r1.A02 = bArr;
                    r1.A01 = i2;
                    r1.A00 = i3;
                    r4.notify();
                    z2 = true;
                } else {
                    z2 = false;
                }
            }
            if (!z2 && (camera2 = r5.A07) != null && !r5.A0R && bArr == r5.A0S) {
                camera2.addCallbackBuffer(bArr);
            }
        }
    }
}
