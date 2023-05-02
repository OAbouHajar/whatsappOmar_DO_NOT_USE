package e;

import android.os.Handler;
import android.os.Message;
import android.os.Process;
import java.lang.ref.ReferenceQueue;

/* compiled from: XFMFile */
public final class d0 extends Thread {

    /* renamed from: a  reason: collision with root package name */
    public final ReferenceQueue f1624a;

    /* renamed from: b  reason: collision with root package name */
    public final Handler f1625b;

    public d0(ReferenceQueue referenceQueue, c0 c0Var) {
        this.f1624a = referenceQueue;
        this.f1625b = c0Var;
        setDaemon(true);
        setName("Picasso-refQueue");
    }

    public final void run() {
        Handler handler = this.f1625b;
        Process.setThreadPriority(10);
        while (true) {
            try {
                a aVar = (a) this.f1624a.remove(1000);
                Message obtainMessage = handler.obtainMessage();
                if (aVar != null) {
                    obtainMessage.what = 3;
                    obtainMessage.obj = aVar.f1602a;
                    handler.sendMessage(obtainMessage);
                } else {
                    obtainMessage.recycle();
                }
            } catch (InterruptedException unused) {
                return;
            } catch (Exception e2) {
                handler.post(new f(this, e2, 2));
                return;
            }
        }
    }
}
