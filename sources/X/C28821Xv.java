package X;

import android.os.ConditionVariable;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.ListIterator;
import org.whispersystems.jobqueue.Job;

/* renamed from: X.1Xv  reason: invalid class name and case insensitive filesystem */
public class C28821Xv extends Thread {
    public final ConditionVariable A00 = new ConditionVariable(true);
    public final /* synthetic */ C28811Xu A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28821Xv(C28811Xu r3) {
        super("ReadyJobsProducer");
        this.A01 = r3;
    }

    public void run() {
        boolean z2;
        Job job;
        while (true) {
            ConditionVariable conditionVariable = this.A00;
            conditionVariable.block();
            conditionVariable.close();
            C28811Xu r6 = this.A01;
            synchronized (r6) {
                LinkedList linkedList = r6.A01;
                z2 = false;
                job = null;
                if (!linkedList.isEmpty()) {
                    ListIterator listIterator = linkedList.listIterator();
                    HashMap hashMap = new HashMap();
                    while (true) {
                        if (!listIterator.hasNext()) {
                            break;
                        }
                        Job job2 = (Job) listIterator.next();
                        String str = job2.parameters.groupId;
                        if ((str == null || !r6.A03.contains(str)) && job2.A03()) {
                            if (r6.A06 && !TextUtils.isEmpty(job2.parameters.groupId) && hashMap.containsKey(job2.parameters.groupId)) {
                                Job job3 = (Job) hashMap.get(job2.parameters.groupId);
                                if (job3.A03()) {
                                    AnonymousClass2Nu r0 = r6.A00;
                                    if (r0 != null) {
                                        r0.A00.A01.AcB("JobQueue/DeterministicJobSelection/Fixed", (String) null, false);
                                    }
                                    while (listIterator.hasPrevious() && listIterator.previous() != job3) {
                                    }
                                    hashMap.remove(job2.parameters.groupId);
                                    job2 = job3;
                                } else {
                                    AnonymousClass2Nu r02 = r6.A00;
                                    if (r02 != null) {
                                        r02.A00.A01.AcB("JobQueue/DeterministicJobSelection/Broken", (String) null, false);
                                    }
                                }
                            }
                            listIterator.remove();
                            String str2 = job2.parameters.groupId;
                            if (str2 != null) {
                                r6.A03.add(str2);
                                int A002 = r6.A00(str2);
                                if (A002 != 0) {
                                    if (A002 == 1) {
                                        r6.A02.remove(str2);
                                    } else {
                                        r6.A02.put(str2, Integer.valueOf(A002 - 1));
                                    }
                                }
                            }
                            if (!r6.A04.offer(job2)) {
                                z2 = listIterator.hasNext();
                                job = job2;
                                break;
                            }
                        } else if (r6.A06 && !TextUtils.isEmpty(job2.parameters.groupId) && !hashMap.containsKey(job2.parameters.groupId)) {
                            hashMap.put(job2.parameters.groupId, job2);
                        }
                    }
                }
            }
            if (job != null) {
                if (z2) {
                    conditionVariable.open();
                }
                try {
                    r6.A04.put(job);
                } catch (InterruptedException unused) {
                }
            }
        }
    }
}
