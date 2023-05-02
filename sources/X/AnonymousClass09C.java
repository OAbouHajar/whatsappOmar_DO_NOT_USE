package X;

import android.view.Menu;
import android.view.View;
import android.view.Window;

/* renamed from: X.09C  reason: invalid class name */
public class AnonymousClass09C implements Runnable {
    public final /* synthetic */ AnonymousClass09B A00;

    public AnonymousClass09C(AnonymousClass09B r1) {
        this.A00 = r1;
    }

    public void run() {
        C016607w r3;
        AnonymousClass09B r1 = this.A00;
        Menu A0Y = r1.A0Y();
        if (A0Y instanceof C016607w) {
            r3 = (C016607w) A0Y;
            if (r3 != null) {
                r3.A08();
            }
        } else {
            r3 = null;
        }
        try {
            A0Y.clear();
            Window.Callback callback = r1.A00;
            if (!callback.onCreatePanelMenu(0, A0Y) || !callback.onPreparePanel(0, (View) null, A0Y)) {
                A0Y.clear();
            }
        } finally {
            if (r3 != null) {
                r3.A07();
            }
        }
    }
}
