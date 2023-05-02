package X;

import com.obwhatsapp.mediaview.PhotoView;

/* renamed from: X.55f  reason: invalid class name and case insensitive filesystem */
public class C1044055f implements Runnable {
    public long A00;
    public boolean A01;
    public final PhotoView A02;

    public C1044055f(PhotoView photoView) {
        this.A02 = photoView;
    }

    public void run() {
        if (!this.A01) {
            long j2 = this.A00;
            if (j2 == 0) {
                j2 = System.currentTimeMillis();
                this.A00 = j2;
            }
            if (((float) (System.currentTimeMillis() - j2)) / ((float) 0) >= 1.0f) {
                this.A01 = true;
                PhotoView photoView = this.A02;
                photoView.invalidate();
                if (!this.A01) {
                    photoView.post(this);
                    return;
                }
                return;
            }
            throw AnonymousClass000.A0W("left");
        }
    }
}
