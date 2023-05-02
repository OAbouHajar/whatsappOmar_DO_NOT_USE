package X;

import android.view.View;

/* renamed from: X.55p  reason: invalid class name and case insensitive filesystem */
public class C1044955p implements Runnable {
    public long A00;
    public boolean A01;
    public final View A02;
    public final C47792Kn A03;

    public C1044955p(View view, C47792Kn r2) {
        this.A02 = view;
        this.A03 = r2;
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
            }
            View view = this.A02;
            view.invalidate();
            if (!this.A01) {
                view.post(this);
            }
        }
    }
}
