package X;

import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* renamed from: X.0iX  reason: invalid class name and case insensitive filesystem */
public class C11310iX extends FutureTask {
    public final /* synthetic */ C10590hN A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11310iX(C10590hN r1, Callable callable) {
        super(callable);
        this.A00 = r1;
    }

    public void done() {
        try {
            Object obj = get();
            C10590hN r1 = this.A00;
            if (!r1.A04.get()) {
                r1.A00(obj);
            }
        } catch (InterruptedException e2) {
            Log.w("AsyncTask", e2);
        } catch (ExecutionException e3) {
            throw new RuntimeException("An error occurred while executing doInBackground()", e3.getCause());
        } catch (CancellationException unused) {
            C10590hN r2 = this.A00;
            if (!r2.A04.get()) {
                r2.A00((Object) null);
            }
        } catch (Throwable th) {
            throw new RuntimeException("An error occurred while executing doInBackground()", th);
        }
    }
}
