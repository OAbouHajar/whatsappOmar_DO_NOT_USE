package X;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.os.PersistableBundle;
import android.util.Log;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: X.0d2  reason: invalid class name */
public class AnonymousClass0d2 implements C13220lf {
    public static final String A04 = C06530Wm.A01("SystemJobScheduler");
    public final JobScheduler A00;
    public final Context A01;
    public final AnonymousClass022 A02;
    public final AnonymousClass0W4 A03;

    public AnonymousClass0d2(Context context, AnonymousClass022 r4) {
        AnonymousClass0W4 r0 = new AnonymousClass0W4(context);
        this.A01 = context;
        this.A02 = r4;
        this.A00 = (JobScheduler) context.getSystemService("jobscheduler");
        this.A03 = r0;
    }

    public static List A00(JobScheduler jobScheduler, Context context) {
        List<JobInfo> list;
        ArrayList arrayList = null;
        try {
            list = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            C06530Wm.A00();
            Log.e(A04, "getAllPendingJobs() is not reliable on this device.", th);
            list = null;
        }
        if (list != null) {
            arrayList = AnonymousClass000.A0w(list);
            ComponentName componentName = new ComponentName(context, SystemJobService.class);
            for (JobInfo next : list) {
                if (componentName.equals(next.getService())) {
                    arrayList.add(next);
                }
            }
        }
        return arrayList;
    }

    public static List A01(JobScheduler jobScheduler, Context context, String str) {
        AnonymousClass0R5 r0;
        List<JobInfo> A002 = A00(jobScheduler, context);
        if (A002 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(2);
        for (JobInfo jobInfo : A002) {
            PersistableBundle extras = jobInfo.getExtras();
            if (extras != null) {
                try {
                    if (extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                        r0 = new AnonymousClass0R5(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0));
                        if (r0 != null && str.equals(r0.A01)) {
                            arrayList.add(Integer.valueOf(jobInfo.getId()));
                        }
                    }
                } catch (NullPointerException unused) {
                }
            }
            r0 = null;
            arrayList.add(Integer.valueOf(jobInfo.getId()));
        }
        return arrayList;
    }

    public static void A02(JobScheduler jobScheduler, int i2) {
        try {
            jobScheduler.cancel(i2);
        } catch (Throwable th) {
            C06530Wm.A00();
            String str = A04;
            Locale locale = Locale.getDefault();
            Object[] objArr = new Object[1];
            AnonymousClass000.A1M(objArr, i2, 0);
            Log.e(str, String.format(locale, "Exception while trying to cancel job (%d)", objArr), th);
        }
    }

    public static void A03(Context context) {
        List<JobInfo> A002;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler != null && (A002 = A00(jobScheduler, context)) != null && !A002.isEmpty()) {
            for (JobInfo id : A002) {
                A02(jobScheduler, id.getId());
            }
        }
    }

    public static boolean A04(Context context, AnonymousClass022 r10) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        List<JobInfo> A002 = A00(jobScheduler, context);
        WorkDatabase workDatabase = r10.A04;
        boolean z2 = false;
        C07770cR A003 = AnonymousClass0M4.A00("SELECT DISTINCT work_spec_id FROM SystemIdInfo", 0);
        AnonymousClass0SM r0 = ((C08140d9) workDatabase.A0G()).A01;
        r0.A09();
        Cursor A004 = AnonymousClass0M5.A00(r0, A003, false);
        try {
            ArrayList A0v = AnonymousClass000.A0v(A004);
            while (A004.moveToNext()) {
                A0v.add(A004.isNull(0) ? null : A004.getString(0));
            }
            HashSet hashSet = new HashSet(A002 != null ? A002.size() : 0);
            if (A002 != null && !A002.isEmpty()) {
                for (JobInfo jobInfo : A002) {
                    PersistableBundle extras = jobInfo.getExtras();
                    if (extras != null) {
                        try {
                            if (extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                                hashSet.add(new AnonymousClass0R5(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0)).A01);
                            }
                        } catch (NullPointerException unused) {
                        }
                    }
                    A02(jobScheduler, jobInfo.getId());
                }
            }
            Iterator it = A0v.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (!hashSet.contains(it.next())) {
                    C06530Wm.A00().A02(A04, "Reconciling jobs");
                    z2 = true;
                    workDatabase.A0A();
                    try {
                        C13360lu A0J = workDatabase.A0J();
                        Iterator it2 = A0v.iterator();
                        while (it2.hasNext()) {
                            A0J.AKf(AnonymousClass000.A0m(it2), -1);
                        }
                        workDatabase.A0C();
                    } finally {
                        workDatabase.A0B();
                    }
                }
            }
            return z2;
        } finally {
            A004.close();
            A003.A01();
        }
    }

    public void A05(C007303i r9, int i2) {
        JobInfo A012 = this.A03.A01(r9, i2);
        C06530Wm A002 = C06530Wm.A00();
        String str = A04;
        StringBuilder A0r = AnonymousClass000.A0r("Scheduling work ID ");
        String str2 = r9.A0J;
        A0r.append(str2);
        A0r.append("Job ID ");
        A002.A02(str, AnonymousClass000.A0l(A0r, i2));
        try {
            if (this.A00.schedule(A012) == 0) {
                C06530Wm.A00();
                StringBuilder A0o = AnonymousClass000.A0o();
                A0o.append("Unable to schedule work ID ");
                Log.w(str, AnonymousClass000.A0h(str2, A0o));
                if (r9.A0H && r9.A0D == C007403j.RUN_AS_NON_EXPEDITED_WORK_REQUEST) {
                    r9.A0H = false;
                    C06530Wm.A00().A02(str, String.format("Scheduling a non-expedited job (work ID %s)", new Object[]{str2}));
                    A05(r9, i2);
                }
            }
        } catch (IllegalStateException e2) {
            List A003 = A00(this.A00, this.A01);
            int size = A003 != null ? A003.size() : 0;
            Locale locale = Locale.getDefault();
            Object[] objArr = new Object[3];
            AnonymousClass000.A1M(objArr, size, 0);
            AnonymousClass022 r2 = this.A02;
            AnonymousClass000.A1M(objArr, r2.A04.A0J().AFj().size(), 1);
            AnonymousClass000.A1M(objArr, r2.A02.A00(), 2);
            String format = String.format(locale, "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", objArr);
            C06530Wm.A00();
            Log.e(str, format);
            throw new IllegalStateException(format, e2);
        } catch (Throwable th) {
            C06530Wm.A00();
            Log.e(str, AnonymousClass000.A0g("Unable to schedule ", r9), th);
        }
    }

    public void A61(String str) {
        Context context = this.A01;
        JobScheduler jobScheduler = this.A00;
        List<Object> A012 = A01(jobScheduler, context, str);
        if (A012 != null && !A012.isEmpty()) {
            for (Object A0D : A012) {
                A02(jobScheduler, AnonymousClass000.A0D(A0D));
            }
            C08140d9 r0 = (C08140d9) this.A02.A04.A0G();
            AnonymousClass0SM r3 = r0.A01;
            r3.A09();
            C05450Rm r2 = r0.A03;
            C13500mT A002 = r2.A00();
            if (str == null) {
                A002.A5R(1);
            } else {
                A002.A5S(1, str);
            }
            r3.A0A();
            try {
                AnonymousClass0GC.A00(r3, A002);
            } finally {
                r3.A0B();
                r2.A03(A002);
            }
        }
    }

    public boolean AHZ() {
        return true;
    }

    /* JADX INFO: finally extract failed */
    public void Ad3(C007303i... r14) {
        int A012;
        List A013;
        int A014;
        AnonymousClass022 r10 = this.A02;
        WorkDatabase workDatabase = r10.A04;
        AnonymousClass0QA r8 = new AnonymousClass0QA(workDatabase);
        int length = r14.length;
        int i2 = 0;
        while (i2 < length) {
            C007303i r4 = r14[i2];
            workDatabase.A0A();
            try {
                C13360lu A0J = workDatabase.A0J();
                String str = r4.A0J;
                C007303i AH8 = A0J.AH8(str);
                if (AH8 == null) {
                    C06530Wm.A00();
                    String str2 = A04;
                    StringBuilder A0q = AnonymousClass000.A0q("Skipping scheduling ");
                    A0q.append(str);
                    Log.w(str2, AnonymousClass000.A0h(" because it's no longer in the DB", A0q));
                } else if (AH8.A0E != AnonymousClass0KV.ENQUEUED) {
                    C06530Wm.A00();
                    String str3 = A04;
                    StringBuilder A0q2 = AnonymousClass000.A0q("Skipping scheduling ");
                    A0q2.append(str);
                    Log.w(str3, AnonymousClass000.A0h(" because it is no longer enqueued", A0q2));
                } else {
                    AnonymousClass0R5 A002 = AnonymousClass0MO.A00(r4);
                    AnonymousClass0RF AGO = workDatabase.A0G().AGO(A002);
                    if (AGO != null) {
                        A012 = AGO.A01;
                    } else {
                        AnonymousClass0Pz r0 = r10.A02;
                        A012 = r8.A01(r0.A02, r0.A01);
                        workDatabase.A0G().AIQ(new AnonymousClass0RF(A002.A00, A002.A01, A012));
                    }
                    A05(r4, A012);
                    if (Build.VERSION.SDK_INT == 23 && (A013 = A01(this.A00, this.A01, str)) != null) {
                        int indexOf = A013.indexOf(Integer.valueOf(A012));
                        if (indexOf >= 0) {
                            A013.remove(indexOf);
                        }
                        if (!A013.isEmpty()) {
                            A014 = ((Integer) A013.get(0)).intValue();
                        } else {
                            AnonymousClass0Pz r02 = r10.A02;
                            A014 = r8.A01(r02.A02, r02.A01);
                        }
                        A05(r4, A014);
                    }
                }
                workDatabase.A0C();
                workDatabase.A0B();
                i2++;
            } catch (Throwable th) {
                workDatabase.A0B();
                throw th;
            }
        }
    }
}
