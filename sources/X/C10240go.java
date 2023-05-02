package X;

import android.os.Handler;
import java.util.concurrent.Callable;

/* renamed from: X.0go  reason: invalid class name and case insensitive filesystem */
public class C10240go implements Runnable {
    public Handler A00;
    public AnonymousClass04N A01;
    public Callable A02;

    public C10240go(Handler handler, AnonymousClass04N r2, Callable callable) {
        this.A02 = callable;
        this.A01 = r2;
        this.A00 = handler;
    }

    public void run() {
        Object obj;
        try {
            obj = this.A02.call();
        } catch (Exception unused) {
            obj = null;
        }
        this.A00.post(new C10230gn(this, this.A01, obj));
    }
}
