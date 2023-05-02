package X;

import android.os.Handler;
import android.os.HandlerThread;
import com.whatsapp.anr.SigquitBasedANRDetector;

/* renamed from: X.0rB  reason: invalid class name */
public class AnonymousClass0rB {
    public final AnonymousClass01D A00;

    public AnonymousClass0rB(AnonymousClass01D r1) {
        this.A00 = r1;
    }

    public synchronized void A00() {
        SigquitBasedANRDetector sigquitBasedANRDetector = (SigquitBasedANRDetector) this.A00.get();
        synchronized (sigquitBasedANRDetector.A08) {
            if (!sigquitBasedANRDetector.A0B) {
                HandlerThread handlerThread = new HandlerThread("SigquitBasedANRDetectorThread");
                sigquitBasedANRDetector.A00 = handlerThread;
                handlerThread.start();
                sigquitBasedANRDetector.A09 = new Handler(sigquitBasedANRDetector.A00.getLooper());
                SigquitBasedANRDetector.startDetector();
                sigquitBasedANRDetector.A0B = true;
            }
        }
    }
}
