package androidx.work.impl.background.systemjob;

import X.AnonymousClass000;
import X.AnonymousClass022;
import X.AnonymousClass0NV;
import X.AnonymousClass0R5;
import X.AnonymousClass0Rl;
import X.C06530Wm;
import X.C08080d0;
import X.C12580kd;
import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.PersistableBundle;
import android.util.Log;
import java.util.Map;

public class SystemJobService extends JobService implements C12580kd {
    public static final String A03 = C06530Wm.A01("SystemJobService");
    public AnonymousClass022 A00;
    public final AnonymousClass0Rl A01 = new AnonymousClass0Rl();
    public final Map A02 = AnonymousClass000.A0x();

    public void AQm(AnonymousClass0R5 r5, boolean z2) {
        JobParameters jobParameters;
        C06530Wm A002 = C06530Wm.A00();
        String str = A03;
        StringBuilder A0o = AnonymousClass000.A0o();
        A0o.append(r5.A01);
        A002.A02(str, AnonymousClass000.A0h(" executed on JobScheduler", A0o));
        Map map = this.A02;
        synchronized (map) {
            jobParameters = (JobParameters) map.remove(r5);
        }
        this.A01.A00(r5);
        if (jobParameters != null) {
            jobFinished(jobParameters, z2);
        }
    }

    public void onCreate() {
        super.onCreate();
        try {
            AnonymousClass022 A012 = AnonymousClass022.A01(getApplicationContext());
            this.A00 = A012;
            A012.A03.A02(this);
        } catch (IllegalStateException unused) {
            if (Application.class.equals(getApplication().getClass())) {
                C06530Wm.A00();
                Log.w(A03, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
                return;
            }
            throw AnonymousClass000.A0V("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
        }
    }

    public void onDestroy() {
        super.onDestroy();
        AnonymousClass022 r0 = this.A00;
        if (r0 != null) {
            r0.A03.A03(this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0067, code lost:
        r4 = null;
        r2 = android.os.Build.VERSION.SDK_INT;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006c, code lost:
        if (r2 < 24) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006e, code lost:
        r4 = new X.AnonymousClass0OP();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0077, code lost:
        if (X.C05760Sx.A00(r9) == null) goto L_0x0083;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0079, code lost:
        r4.A02 = java.util.Arrays.asList(X.C05760Sx.A00(r9));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0087, code lost:
        if (X.C05760Sx.A01(r9) == null) goto L_0x0093;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0089, code lost:
        r4.A01 = java.util.Arrays.asList(X.C05760Sx.A01(r9));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0095, code lost:
        if (r2 < 28) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0097, code lost:
        r4.A00 = X.AnonymousClass0ML.A00(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009d, code lost:
        r3 = r8.A00;
        r3.A06.A8p(new X.C10350gz(r4, r8.A01.A01(r1), r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00af, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onStartJob(android.app.job.JobParameters r9) {
        /*
            r8 = this;
            X.022 r0 = r8.A00
            r5 = 1
            r7 = 0
            if (r0 != 0) goto L_0x0015
            X.0Wm r2 = X.C06530Wm.A00()
            java.lang.String r1 = A03
            java.lang.String r0 = "WorkManager is not initialized; requesting retry."
            r2.A02(r1, r0)
            r8.jobFinished(r9, r5)
            return r7
        L_0x0015:
            java.lang.String r2 = "EXTRA_WORK_SPEC_ID"
            android.os.PersistableBundle r1 = r9.getExtras()     // Catch:{ NullPointerException -> 0x00b3 }
            if (r1 == 0) goto L_0x00b3
            boolean r0 = r1.containsKey(r2)     // Catch:{ NullPointerException -> 0x00b3 }
            if (r0 == 0) goto L_0x00b3
            java.lang.String r2 = r1.getString(r2)     // Catch:{ NullPointerException -> 0x00b3 }
            java.lang.String r0 = "EXTRA_WORK_SPEC_GENERATION"
            int r0 = r1.getInt(r0)     // Catch:{ NullPointerException -> 0x00b3 }
            X.0R5 r1 = new X.0R5     // Catch:{ NullPointerException -> 0x00b3 }
            r1.<init>(r2, r0)     // Catch:{ NullPointerException -> 0x00b3 }
            java.util.Map r6 = r8.A02
            monitor-enter(r6)
            boolean r0 = r6.containsKey(r1)     // Catch:{ all -> 0x00b0 }
            if (r0 == 0) goto L_0x0050
            X.0Wm r4 = X.C06530Wm.A00()     // Catch:{ all -> 0x00b0 }
            java.lang.String r3 = A03     // Catch:{ all -> 0x00b0 }
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0o()     // Catch:{ all -> 0x00b0 }
            java.lang.String r0 = "Job is already being executed by SystemJobService: "
            java.lang.String r0 = X.AnonymousClass000.A0e(r1, r0, r2)     // Catch:{ all -> 0x00b0 }
            r4.A02(r3, r0)     // Catch:{ all -> 0x00b0 }
            monitor-exit(r6)     // Catch:{ all -> 0x00b0 }
            return r7
        L_0x0050:
            X.0Wm r4 = X.C06530Wm.A00()     // Catch:{ all -> 0x00b0 }
            java.lang.String r3 = A03     // Catch:{ all -> 0x00b0 }
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0o()     // Catch:{ all -> 0x00b0 }
            java.lang.String r0 = "onStartJob for "
            java.lang.String r0 = X.AnonymousClass000.A0e(r1, r0, r2)     // Catch:{ all -> 0x00b0 }
            r4.A02(r3, r0)     // Catch:{ all -> 0x00b0 }
            r6.put(r1, r9)     // Catch:{ all -> 0x00b0 }
            monitor-exit(r6)     // Catch:{ all -> 0x00b0 }
            r4 = 0
            int r2 = android.os.Build.VERSION.SDK_INT
            r0 = 24
            if (r2 < r0) goto L_0x009d
            X.0OP r4 = new X.0OP
            r4.<init>()
            android.net.Uri[] r0 = X.C05760Sx.A00(r9)
            if (r0 == 0) goto L_0x0083
            android.net.Uri[] r0 = X.C05760Sx.A00(r9)
            java.util.List r0 = java.util.Arrays.asList(r0)
            r4.A02 = r0
        L_0x0083:
            java.lang.String[] r0 = X.C05760Sx.A01(r9)
            if (r0 == 0) goto L_0x0093
            java.lang.String[] r0 = X.C05760Sx.A01(r9)
            java.util.List r0 = java.util.Arrays.asList(r0)
            r4.A01 = r0
        L_0x0093:
            r0 = 28
            if (r2 < r0) goto L_0x009d
            android.net.Network r0 = X.AnonymousClass0ML.A00(r9)
            r4.A00 = r0
        L_0x009d:
            X.022 r3 = r8.A00
            X.0Rl r0 = r8.A01
            X.0NV r2 = r0.A01(r1)
            X.04d r1 = r3.A06
            X.0gz r0 = new X.0gz
            r0.<init>(r4, r2, r3)
            r1.A8p(r0)
            return r5
        L_0x00b0:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x00b0 }
            throw r0
        L_0x00b3:
            X.C06530Wm.A00()
            java.lang.String r1 = A03
            java.lang.String r0 = "WorkSpec id not found!"
            android.util.Log.e(r1, r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.background.systemjob.SystemJobService.onStartJob(android.app.job.JobParameters):boolean");
    }

    public boolean onStopJob(JobParameters jobParameters) {
        boolean contains;
        if (this.A00 == null) {
            C06530Wm.A00().A02(A03, "WorkManager is not initialized; requesting retry.");
            return true;
        }
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras != null && extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                AnonymousClass0R5 r3 = new AnonymousClass0R5(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
                C06530Wm.A00().A02(A03, AnonymousClass000.A0g("onStopJob for ", r3));
                Map map = this.A02;
                synchronized (map) {
                    map.remove(r3);
                }
                AnonymousClass0NV A002 = this.A01.A00(r3);
                if (A002 != null) {
                    this.A00.A08(A002);
                }
                C08080d0 r0 = this.A00.A03;
                String str = r3.A01;
                synchronized (r0.A0A) {
                    contains = r0.A09.contains(str);
                }
                return !contains;
            }
        } catch (NullPointerException unused) {
        }
        C06530Wm.A00();
        Log.e(A03, "WorkSpec id not found!");
        return false;
    }
}
