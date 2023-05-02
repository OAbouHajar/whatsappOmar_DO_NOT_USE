package X;

import android.os.Handler;
import android.os.Message;
import android.view.GestureDetector;

/* renamed from: X.0BI  reason: invalid class name */
public class AnonymousClass0BI extends Handler {
    public final /* synthetic */ AnonymousClass0b9 A00;

    public AnonymousClass0BI(AnonymousClass0b9 r1) {
        this.A00 = r1;
    }

    public void handleMessage(Message message) {
        int i2 = message.what;
        if (i2 == 1) {
            AnonymousClass0b9 r0 = this.A00;
            r0.A0K.onShowPress(r0.A09);
        } else if (i2 == 2) {
            AnonymousClass0b9 r2 = this.A00;
            r2.A0J.removeMessages(3);
            r2.A0E = false;
            r2.A0F = true;
            r2.A0K.onLongPress(r2.A09);
        } else if (i2 == 3) {
            AnonymousClass0b9 r22 = this.A00;
            GestureDetector.OnDoubleTapListener onDoubleTapListener = r22.A08;
            if (onDoubleTapListener == null) {
                return;
            }
            if (!r22.A0I) {
                onDoubleTapListener.onSingleTapConfirmed(r22.A09);
            } else {
                r22.A0E = true;
            }
        } else {
            throw AnonymousClass000.A0a(AnonymousClass000.A0g("Unknown message ", message));
        }
    }
}
