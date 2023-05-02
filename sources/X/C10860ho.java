package X;

import java.util.concurrent.Executor;

/* renamed from: X.0ho  reason: invalid class name and case insensitive filesystem */
public class C10860ho implements Executor {
    public final /* synthetic */ C08190dE A00;

    public C10860ho(C08190dE r1) {
        this.A00 = r1;
    }

    public void execute(Runnable runnable) {
        this.A00.A00.post(runnable);
    }
}
