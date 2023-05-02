package X;

import android.hardware.Camera;

/* renamed from: X.4wt  reason: invalid class name and case insensitive filesystem */
public class C101204wt implements AnonymousClass5PC {
    public final AnonymousClass4KL A00 = new AnonymousClass4KL();
    public final /* synthetic */ C49062Qp A01;

    public C101204wt(C49062Qp r2) {
        this.A01 = r2;
    }

    public synchronized AnonymousClass4KL A9X() {
        AnonymousClass4KL r4;
        r4 = this.A00;
        byte[] bArr = r4.A02;
        if (bArr != null) {
            C49062Qp r2 = this.A01;
            Camera camera = r2.A07;
            if (camera != null && !r2.A0R && bArr == r2.A0S) {
                camera.addCallbackBuffer(bArr);
            }
            r4.A02 = null;
        }
        while (r4.A02 == null) {
            wait();
        }
        return r4;
    }
}
