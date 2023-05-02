package androidx.work;

import X.AnonymousClass02O;
import X.AnonymousClass02Q;
import X.AnonymousClass0H9;
import X.C09550fh;
import X.C09940gK;
import X.C29981bY;
import android.content.Context;

public abstract class Worker extends AnonymousClass02O {
    public AnonymousClass0H9 A00;

    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public C29981bY A00() {
        AnonymousClass0H9 A002 = AnonymousClass0H9.A00();
        this.A01.A09.execute(new C09940gK(this, A002));
        return A002;
    }

    public final C29981bY A02() {
        this.A00 = AnonymousClass0H9.A00();
        this.A01.A09.execute(new C09550fh(this));
        return this.A00;
    }

    public abstract AnonymousClass02Q A04();
}
