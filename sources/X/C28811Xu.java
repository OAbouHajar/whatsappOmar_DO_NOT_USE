package X;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.SynchronousQueue;
import org.whispersystems.jobqueue.Job;

/* renamed from: X.1Xu  reason: invalid class name and case insensitive filesystem */
public class C28811Xu {
    public final AnonymousClass2Nu A00;
    public final LinkedList A01 = new LinkedList();
    public final Map A02;
    public final Set A03 = new HashSet();
    public final SynchronousQueue A04 = new SynchronousQueue();
    public final C28821Xv A05;
    public final boolean A06;

    public C28811Xu(AnonymousClass2Nu r3, boolean z2) {
        C28821Xv r1 = new C28821Xv(this);
        this.A05 = r1;
        this.A02 = new HashMap();
        this.A06 = z2;
        this.A00 = r3;
        r1.start();
    }

    public synchronized int A00(String str) {
        int i2;
        if (str != null) {
            Integer num = (Integer) this.A02.get(str);
            if (num != null) {
                i2 = num.intValue();
            }
        }
        i2 = 0;
        return i2;
    }

    public final void A01(Job job) {
        String str = job.parameters.groupId;
        if (str != null) {
            this.A02.put(str, Integer.valueOf(A00(str) + 1));
        }
    }

    public synchronized void A02(Job job) {
        this.A01.addFirst(job);
        A01(job);
        this.A05.A00.open();
    }
}
