package X;

import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.Context;
import androidx.work.impl.background.systemjob.SystemJobService;

/* renamed from: X.0W4  reason: invalid class name */
public class AnonymousClass0W4 {
    public static final String A01 = C06530Wm.A01("SystemJobInfoConverter");
    public final ComponentName A00;

    public AnonymousClass0W4(Context context) {
        this.A00 = new ComponentName(context.getApplicationContext(), SystemJobService.class);
    }

    public static JobInfo.TriggerContentUri A00(AnonymousClass0QL r3) {
        return new JobInfo.TriggerContentUri(r3.A00, r3.A01 ? 1 : 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0084, code lost:
        if (r1 >= 24) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00d2, code lost:
        if (r5 >= 26) goto L_0x00d4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.app.job.JobInfo A01(X.C007303i r12, int r13) {
        /*
            r11 = this;
            X.042 r6 = r12.A0A
            android.os.PersistableBundle r4 = new android.os.PersistableBundle
            r4.<init>()
            java.lang.String r1 = r12.A0J
            java.lang.String r0 = "EXTRA_WORK_SPEC_ID"
            r4.putString(r0, r1)
            int r1 = r12.A0I
            java.lang.String r0 = "EXTRA_WORK_SPEC_GENERATION"
            r4.putInt(r0, r1)
            long r1 = r12.A05
            r7 = 0
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1O(r0)
            java.lang.String r0 = "EXTRA_IS_PERIODIC"
            r4.putBoolean(r0, r1)
            android.content.ComponentName r0 = r11.A00
            android.app.job.JobInfo$Builder r1 = new android.app.job.JobInfo$Builder
            r1.<init>(r13, r0)
            boolean r0 = r6.A05
            android.app.job.JobInfo$Builder r0 = r1.setRequiresCharging(r0)
            boolean r3 = r6.A06
            android.app.job.JobInfo$Builder r0 = r0.setRequiresDeviceIdle(r3)
            android.app.job.JobInfo$Builder r7 = r0.setExtras(r4)
            X.041 r4 = r6.A02
            int r5 = android.os.Build.VERSION.SDK_INT
            r0 = 30
            if (r5 < r0) goto L_0x00b8
            X.041 r0 = X.AnonymousClass041.TEMPORARILY_UNMETERED
            if (r4 != r0) goto L_0x00b8
            android.net.NetworkRequest$Builder r1 = new android.net.NetworkRequest$Builder
            r1.<init>()
            r0 = 25
            android.net.NetworkRequest$Builder r0 = r1.addCapability(r0)
            android.net.NetworkRequest r0 = r0.build()
            r7.setRequiredNetwork(r0)
        L_0x0059:
            r8 = 0
            r9 = 1
            if (r3 != 0) goto L_0x006a
            X.04P r1 = r12.A09
            X.04P r0 = X.AnonymousClass04P.LINEAR
            r2 = 1
            if (r1 != r0) goto L_0x0065
            r2 = 0
        L_0x0065:
            long r0 = r12.A02
            r7.setBackoffCriteria(r0, r2)
        L_0x006a:
            long r0 = r12.A02()
            long r2 = java.lang.System.currentTimeMillis()
            long r0 = r0 - r2
            r4 = 0
            long r2 = java.lang.Math.max(r0, r4)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 28
            if (r1 > r0) goto L_0x00a8
            r7.setMinimumLatency(r2)
            r0 = 24
            if (r1 < r0) goto L_0x00f9
        L_0x0086:
            java.util.Set r1 = r6.A03
            boolean r0 = r1.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00f9
            java.util.Iterator r1 = r1.iterator()
        L_0x0094:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00ef
            java.lang.Object r0 = r1.next()
            X.0QL r0 = (X.AnonymousClass0QL) r0
            android.app.job.JobInfo$TriggerContentUri r0 = A00(r0)
            r7.addTriggerContentUri(r0)
            goto L_0x0094
        L_0x00a8:
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x00b0
            r7.setMinimumLatency(r2)
            goto L_0x0086
        L_0x00b0:
            boolean r0 = r12.A0H
            if (r0 != 0) goto L_0x0086
            r7.setImportantWhileForeground(r9)
            goto L_0x0086
        L_0x00b8:
            int[] r1 = X.C04460Mq.A00
            int r0 = r4.ordinal()
            r2 = r1[r0]
            r0 = 1
            r1 = 0
            if (r2 == r0) goto L_0x00d4
            r1 = 2
            if (r2 == r1) goto L_0x00ed
            r0 = 3
            if (r2 == r0) goto L_0x00d4
            r1 = 4
            if (r2 == r1) goto L_0x00d8
            r0 = 5
            if (r2 != r0) goto L_0x00de
            r0 = 26
            if (r5 < r0) goto L_0x00de
        L_0x00d4:
            r7.setRequiredNetworkType(r1)
            goto L_0x0059
        L_0x00d8:
            r0 = 24
            if (r5 < r0) goto L_0x00de
            r1 = 3
            goto L_0x00d4
        L_0x00de:
            X.0Wm r2 = X.C06530Wm.A00()
            java.lang.String r1 = A01
            java.lang.String r0 = "API version too low. Cannot convert network type value "
            java.lang.String r0 = X.AnonymousClass000.A0g(r0, r4)
            r2.A02(r1, r0)
        L_0x00ed:
            r1 = 1
            goto L_0x00d4
        L_0x00ef:
            long r0 = r6.A01
            r7.setTriggerContentUpdateDelay(r0)
            long r0 = r6.A00
            r7.setTriggerContentMaxDelay(r0)
        L_0x00f9:
            r7.setPersisted(r8)
            int r10 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r10 < r0) goto L_0x010c
            boolean r0 = r6.A04
            r7.setRequiresBatteryNotLow(r0)
            boolean r0 = r6.A07
            r7.setRequiresStorageNotLow(r0)
        L_0x010c:
            int r0 = r12.A01
            boolean r1 = X.AnonymousClass000.A1Q(r0)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0117
            r8 = 1
        L_0x0117:
            r0 = 31
            if (r10 < r0) goto L_0x0126
            boolean r0 = r12.A0H
            if (r0 == 0) goto L_0x0126
            if (r1 != 0) goto L_0x0126
            if (r8 != 0) goto L_0x0126
            r7.setExpedited(r9)
        L_0x0126:
            android.app.job.JobInfo r0 = r7.build()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0W4.A01(X.03i, int):android.app.job.JobInfo");
    }
}
