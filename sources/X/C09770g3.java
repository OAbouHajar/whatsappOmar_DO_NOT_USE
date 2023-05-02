package X;

import android.util.Log;
import java.lang.reflect.Method;

/* renamed from: X.0g3  reason: invalid class name and case insensitive filesystem */
public class C09770g3 implements Runnable {
    public final /* synthetic */ Object A00;
    public final /* synthetic */ Object A01;

    public C09770g3(Object obj, Object obj2) {
        this.A00 = obj;
        this.A01 = obj2;
    }

    public void run() {
        Object obj;
        Object[] objArr;
        try {
            Method method = C05890Tk.A04;
            if (method != null) {
                obj = this.A00;
                objArr = new Object[]{this.A01, Boolean.FALSE, "AppCompat recreation"};
            } else {
                method = C05890Tk.A03;
                obj = this.A00;
                objArr = new Object[]{this.A01, Boolean.FALSE};
            }
            method.invoke(obj, objArr);
        } catch (RuntimeException e2) {
            if (e2.getClass() == RuntimeException.class && e2.getMessage() != null && e2.getMessage().startsWith("Unable to stop")) {
                throw e2;
            }
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
        }
    }
}
