package X;

import android.content.Context;
import java.lang.Thread;

/* renamed from: X.00M  reason: invalid class name */
public class AnonymousClass00M implements Thread.UncaughtExceptionHandler {
    public final Thread.UncaughtExceptionHandler A00 = Thread.getDefaultUncaughtExceptionHandler();
    public final /* synthetic */ Context A01;
    public final /* synthetic */ AnonymousClass004 A02;

    public AnonymousClass00M(Context context, AnonymousClass004 r3) {
        this.A02 = r3;
        this.A01 = context;
    }

    public void uncaughtException(Thread thread, Throwable th) {
        C003701q.A00(this.A01, th);
        C003701q.A03(this.A00, thread, th);
    }
}
