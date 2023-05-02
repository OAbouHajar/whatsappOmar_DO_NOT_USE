package X;

import android.os.SystemClock;
import android.view.View;

/* renamed from: X.5yk  reason: invalid class name and case insensitive filesystem */
public final class C119605yk implements View.OnClickListener {
    public long A00;
    public final View.OnClickListener A01;
    public final C16440t3 A02;

    public C119605yk(View.OnClickListener onClickListener, C16440t3 r3) {
        C18450wi.A0H(r3, 1);
        this.A02 = r3;
        this.A01 = onClickListener;
    }

    public void onClick(View view) {
        C18450wi.A0H(view, 0);
        if (SystemClock.elapsedRealtime() - this.A00 >= 1000) {
            this.A00 = SystemClock.elapsedRealtime();
            this.A01.onClick(view);
        }
    }
}
