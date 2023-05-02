package X;

import android.content.Context;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.2Ix  reason: invalid class name and case insensitive filesystem */
public class C47422Ix implements Runnable, Future {
    public final C16980tz A00;
    public final /* synthetic */ C27821Tg A01;

    public C47422Ix(C16980tz r1, C27821Tg r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public boolean cancel(boolean z2) {
        return false;
    }

    public /* bridge */ /* synthetic */ Object get() {
        return null;
    }

    public /* bridge */ /* synthetic */ Object get(long j2, TimeUnit timeUnit) {
        C27821Tg r1 = this.A01;
        if (r1.A02.await(j2, timeUnit)) {
            return r1.A03.get();
        }
        throw new TimeoutException();
    }

    public boolean isCancelled() {
        return false;
    }

    public boolean isDone() {
        return this.A01.A02.getCount() == 0;
    }

    public void run() {
        Context context = this.A00.A00;
        Set A002 = C27821Tg.A00(context, "primary-task-killer", C27821Tg.A04);
        Set A003 = C27821Tg.A00(context, "secondary-task-killer", C27821Tg.A05);
        C27821Tg r4 = this.A01;
        AtomicReference atomicReference = r4.A03;
        Set set = null;
        Set unmodifiableSet = A002 != null ? Collections.unmodifiableSet(A002) : null;
        if (A003 != null) {
            set = Collections.unmodifiableSet(A003);
        }
        atomicReference.set(new C47412Iw(unmodifiableSet, set));
        r4.A02.countDown();
    }
}
