package X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;

/* renamed from: X.3M5  reason: invalid class name */
public class AnonymousClass3M5 extends HandlerThread implements Handler.Callback {
    public Handler A00;
    public C1046056c A01;
    public C63973Mg A02;
    public Error A03;
    public RuntimeException A04;

    public AnonymousClass3M5() {
        super("ExoPlayer:DummySurface");
    }

    public boolean handleMessage(Message message) {
        int i2 = message.what;
        if (i2 == 1) {
            try {
                this.A01.A01(message.arg1);
                this.A02 = new C63973Mg(this.A01.A00, this);
                synchronized (this) {
                    notify();
                }
                return true;
            } catch (RuntimeException e2) {
                C89504cL.A01("DummySurface", "Failed to initialize dummy surface", e2);
                this.A04 = e2;
                synchronized (this) {
                    notify();
                }
            } catch (Error e3) {
                C89504cL.A01("DummySurface", "Failed to initialize dummy surface", e3);
                this.A03 = e3;
                synchronized (this) {
                    notify();
                    return true;
                }
            } catch (Throwable th) {
                th = th;
                synchronized (this) {
                    try {
                        notify();
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    throw th;
                }
            }
        } else if (i2 == 2) {
            try {
                this.A01.A00();
            } catch (Throwable th3) {
                quit();
                throw th3;
            }
            quit();
            return true;
        }
        return true;
    }
}
