package X;

import androidx.work.impl.WorkDatabase;
import java.util.concurrent.Callable;

/* renamed from: X.0hi  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C10800hi implements Callable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ AnonymousClass0QA A02;

    public /* synthetic */ C10800hi(AnonymousClass0QA r1, int i2, int i3) {
        this.A02 = r1;
        this.A00 = i2;
        this.A01 = i3;
    }

    public final Object call() {
        AnonymousClass0QA r0 = this.A02;
        int i2 = this.A00;
        int i3 = this.A01;
        WorkDatabase workDatabase = r0.A00;
        int A002 = AnonymousClass0MQ.A00(workDatabase, "next_job_scheduler_id");
        if (i2 > A002 || A002 > i3) {
            workDatabase.A0F().AIP(new AnonymousClass0R4("next_job_scheduler_id", Long.valueOf((long) (i2 + 1))));
        } else {
            i2 = A002;
        }
        return Integer.valueOf(i2);
    }
}
