package X;

import java.util.LinkedList;
import java.util.List;
import org.whispersystems.jobqueue.JobParameters;
import org.whispersystems.jobqueue.requirements.Requirement;

/* renamed from: X.4Ud  reason: invalid class name and case insensitive filesystem */
public class C86784Ud {
    public String A00 = null;
    public List A01 = new LinkedList();
    public boolean A02 = false;

    public JobParameters A00() {
        return new JobParameters(this.A00, this.A01, this.A02);
    }

    public void A01(Requirement requirement) {
        this.A01.add(requirement);
    }
}
