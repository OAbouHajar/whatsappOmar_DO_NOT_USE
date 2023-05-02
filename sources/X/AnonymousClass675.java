package X;

import android.graphics.Rect;
import android.hardware.Camera;
import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.675  reason: invalid class name */
public class AnonymousClass675 implements Callable {
    public final /* synthetic */ C118645v1 A00;
    public final /* synthetic */ AnonymousClass5zC A01;
    public final /* synthetic */ AnonymousClass5wQ A02;

    public AnonymousClass675(C118645v1 r1, AnonymousClass5zC r2, AnonymousClass5wQ r3) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
    }

    /* JADX INFO: finally extract failed */
    public /* bridge */ /* synthetic */ Object call() {
        AnonymousClass5yK r1;
        AnonymousClass5zC r4 = this.A01;
        AnonymousClass5wI.A04(r4.A05());
        int A03 = r4.A0J.A03(r4.A00, r4.A0X);
        AnonymousClass5vU r5 = r4.A0R;
        C111205fV A002 = r5.A00(r4.A00);
        C115845qP.A02(AnonymousClass5wI.A0c, A002, Integer.valueOf(A03));
        A002.A02();
        Rect rect = (Rect) r5.A02(r4.A00).A05(AnonymousClass5wI.A0l);
        int A022 = AnonymousClass5wI.A02(AnonymousClass5wI.A0o, r5.A02(r4.A00));
        r4.A0T.A05(new AnonymousClass63T(this), r4.A0S.A03);
        AnonymousClass5wQ r7 = this.A02;
        Camera.ShutterCallback shutterCallback = AnonymousClass000.A1X(r7.A00(AnonymousClass5wQ.A02)) ? null : AnonymousClass5zC.A0g;
        C118835vK r11 = new C118835vK((Rect) r5.A02(r4.A00).A05(AnonymousClass5wI.A0f), rect, A03, r4.A00);
        if (AnonymousClass000.A1X(r7.A00(AnonymousClass5wQ.A03))) {
            r1 = new AnonymousClass5yK(this, r11);
        } else {
            ((CountDownLatch) r4.A0N.A00.get()).countDown();
            r1 = null;
        }
        r4.A0Y.takePicture(shutterCallback, (Camera.PictureCallback) null, r1, new AnonymousClass5yM(rect, this, r11, A03, A022));
        C118655v2 r2 = r4.A0L.A00;
        ReentrantLock reentrantLock = r2.A01;
        reentrantLock.lock();
        try {
            r2.A00 = 0;
            reentrantLock.unlock();
            AnonymousClass5xT.A01("Some how photo taking call is happening on the UI Thread!!");
            try {
                ((CountDownLatch) r4.A0N.A00.get()).await(10000, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e2) {
                Log.e("Camera1Device", "Interrupted while waiting on Camera.takePicture", e2);
            }
            C117825tc r8 = r4.A0N;
            if (((CountDownLatch) r8.A00.get()).getCount() <= 0) {
                boolean A1X = AnonymousClass000.A1X(r7.A00(AnonymousClass5wQ.A04));
                AnonymousClass5xT.A01("Performing post photo capture on UI thread");
                if (r4.isConnected()) {
                    if (A1X) {
                        r4.A07();
                    }
                    r8.A01(0);
                }
                return null;
            }
            r4.A0W.set(true);
            throw new AnonymousClass67M();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
