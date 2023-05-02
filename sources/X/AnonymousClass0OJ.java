package X;

import android.content.Context;
import android.os.PowerManager;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: X.0OJ  reason: invalid class name */
public class AnonymousClass0OJ {
    public static AnonymousClass0OJ A02;
    public final PowerManager A00;
    public final ExecutorService A01 = Executors.newSingleThreadExecutor();

    public AnonymousClass0OJ(Context context) {
        this.A00 = (PowerManager) context.getSystemService("power");
    }
}
