package X;

import android.content.Context;
import org.whispersystems.jobqueue.Job;
import org.whispersystems.jobqueue.requirements.Requirement;

/* renamed from: X.1Xo  reason: invalid class name and case insensitive filesystem */
public class C28771Xo {
    public void A00(Context context, Job job) {
        if (job instanceof C28791Xq) {
            ((C28791Xq) job).Adl(context);
        }
        for (Requirement requirement : job.parameters.requirements) {
            if (requirement instanceof C28791Xq) {
                ((C28791Xq) requirement).Adl(context);
            }
        }
    }
}
