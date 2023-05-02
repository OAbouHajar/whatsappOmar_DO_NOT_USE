package X;

import android.content.Context;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.0In  reason: invalid class name and case insensitive filesystem */
public abstract class C03440In extends C08760eG {
    public static Thread A02;
    public static final BlockingQueue A03 = new ArrayBlockingQueue(10);
    public static final AtomicBoolean A04 = new AtomicBoolean();
    public static volatile C09100eu A05;
    public final AtomicLong A00 = new AtomicLong(0);
    public final AtomicLong A01 = new AtomicLong(0);

    public C03440In(Context context, int i2) {
        super(i2);
        if (A04.compareAndSet(false, true)) {
            AnonymousClass0X2.A01(new C03390Ii(context, this));
        }
    }
}
