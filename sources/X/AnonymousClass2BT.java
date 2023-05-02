package X;

import android.content.Context;
import java.util.LinkedList;
import org.whispersystems.jobqueue.Job;
import org.whispersystems.jobqueue.JobParameters;

/* renamed from: X.2BT  reason: invalid class name */
public final class AnonymousClass2BT extends Job implements C28791Xq {
    public transient C16300so A00;
    public transient AnonymousClass18U A01;
    public transient C17190ug A02;
    public final String groupJidRawString;

    public AnonymousClass2BT(String str) {
        super(new JobParameters("group-fetch-all-membership-approval-requests", new LinkedList(), true));
        this.groupJidRawString = str;
    }

    public void Adl(Context context) {
        C18450wi.A0H(context, 0);
        Context applicationContext = context.getApplicationContext();
        C18450wi.A0B(applicationContext);
        AnonymousClass01F r2 = (AnonymousClass01F) AnonymousClass01I.A00(applicationContext, AnonymousClass01F.class);
        C16150sX r1 = (C16150sX) r2;
        this.A02 = (C17190ug) r1.AEu.get();
        this.A00 = r2.A6q();
        this.A01 = (AnonymousClass18U) r1.ABQ.get();
    }
}
