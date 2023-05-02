package X;

import android.os.ConditionVariable;
import com.obwhatsapp.R;
import com.whatsapp.util.Log;
import java.util.Calendar;
import java.util.Locale;

/* renamed from: X.2GZ  reason: invalid class name */
public class AnonymousClass2GZ implements AnonymousClass2Ga {
    public final /* synthetic */ ConditionVariable A00;
    public final /* synthetic */ C210912t A01;
    public final /* synthetic */ AnonymousClass2GY A02;

    public AnonymousClass2GZ(ConditionVariable conditionVariable, C210912t r2, AnonymousClass2GY r3) {
        this.A01 = r2;
        this.A00 = conditionVariable;
        this.A02 = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x011c, code lost:
        if (r0.intValue() != 0) goto L_0x011e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0024, code lost:
        if (r6.A06() != 0) goto L_0x0026;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0137  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void AMF(int r13) {
        /*
            r12 = this;
            X.12t r4 = r12.A01
            X.2GV r0 = r4.A0H
            r0.A03(r12)
            boolean r1 = r4.A01
            r5 = 0
            if (r13 != 0) goto L_0x01fa
            X.0yo r0 = r4.A07
            boolean r0 = r0.A0A()
            if (r0 == 0) goto L_0x01fa
            X.0sK r0 = r4.A04
            boolean r0 = r0.A0G()
            if (r0 != 0) goto L_0x01fa
            X.0rz r6 = r4.A0F
            if (r1 == 0) goto L_0x01aa
            int r0 = r6.A06()
            if (r0 == 0) goto L_0x01fa
        L_0x0026:
            boolean r0 = r4.A01
            if (r0 == 0) goto L_0x018c
            r2 = 1
        L_0x002c:
            java.lang.String r1 = "local/backup/gdrive/random-wait-time-in-secs/"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0pd r10 = r4.A0J
            boolean r0 = X.AnonymousClass2GK.A0K(r10)
            if (r0 == 0) goto L_0x0145
            X.12P r0 = r4.A0O
            java.lang.Object r7 = r0.get()
            X.022 r7 = (X.AnonymousClass022) r7
            X.03z r8 = X.AnonymousClass03z.REPLACE
            X.03g r9 = new X.03g
            r9.<init>()
            int r1 = X.AnonymousClass2GK.A01(r6, r5)
            java.lang.String r0 = "KEY_BACKUP_SCHEDULE"
            r9.A01(r0, r1)
            int r11 = r6.A06()
            r5 = 1
            r1 = 671(0x29f, float:9.4E-43)
            if (r11 == r5) goto L_0x013d
            r0 = 2
            r1 = 672(0x2a0, float:9.42E-43)
            if (r11 == r0) goto L_0x013d
            r0 = 3
            if (r11 == r0) goto L_0x013b
            r1 = 0
        L_0x006f:
            java.lang.String r0 = "KEY_MAX_NUMBER_OF_RETRIES"
            r9.A01(r0, r1)
            int r1 = r6.A07()
            java.lang.String r0 = "KEY_BACKUP_NETWORK_SETTING"
            r9.A01(r0, r1)
            X.03h r11 = r9.A00()
            X.040 r1 = new X.040
            r1.<init>()
            r1.A02 = r5
            int r0 = r6.A07()
            if (r0 != 0) goto L_0x0137
            X.041 r0 = X.AnonymousClass041.UNMETERED
        L_0x0090:
            r1.A01(r0)
            java.lang.Class<com.obwhatsapp.backup.google.workers.GoogleBackupWorker> r0 = com.obwhatsapp.backup.google.workers.GoogleBackupWorker.class
            X.03e r9 = new X.03e
            r9.<init>(r0)
            X.03i r0 = r9.A00
            r0.A0B = r11
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
            r9.A02(r2, r0)
            X.042 r1 = r1.A00()
            X.03i r0 = r9.A00
            r0.A0A = r1
            X.04P r3 = X.AnonymousClass04P.LINEAR
            r1 = 901(0x385, float:1.263E-42)
            X.0tM r0 = X.C16620tM.A02
            int r0 = r10.A03(r0, r1)
            long r0 = (long) r0
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            r9.A03(r3, r2, r0)
            X.03k r1 = r9.A00()
            X.043 r1 = (X.AnonymousClass043) r1
            java.lang.String r0 = "com.obwhatsapp.backup.google.google-backup-worker"
            X.04Q r2 = r7.A02(r8, r1, r0)
            X.0sd r0 = r4.A06
            X.0rz r0 = r0.A03
            boolean r0 = r0.A1f()
            if (r0 == 0) goto L_0x00ea
            java.lang.String r0 = r6.A0M()
            int r0 = r6.A0F(r0)
            if (r0 != r5) goto L_0x00ea
            java.lang.String r0 = "com.obwhatsapp.backup.google.google-encrypted-re-upload-worker"
            r7.A0A(r0)
            r0 = 0
            X.043 r0 = com.obwhatsapp.backup.google.workers.GoogleEncryptedReUploadWorker.A00(r6, r0)
            X.04Q r2 = r2.A02(r0)
        L_0x00ea:
            r2.A03()
            r3 = 1
        L_0x00ee:
            r0 = 0
            r4.A01 = r0
            X.0pt r0 = r4.A03
            r0.A05()
            r0 = 3
            if (r13 != r0) goto L_0x0100
            X.0tz r0 = r4.A0E
            android.content.Context r0 = r0.A00
            X.C40691uX.A09(r0)
        L_0x0100:
            android.os.ConditionVariable r0 = r12.A00
            if (r0 == 0) goto L_0x0107
            r0.open()
        L_0x0107:
            X.2GY r2 = r12.A02
            int r0 = X.C40691uX.A00(r13)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A02 = r0
            java.lang.Integer r0 = r2.A03
            if (r0 == 0) goto L_0x011e
            int r0 = r0.intValue()
            r1 = 1
            if (r0 == 0) goto L_0x011f
        L_0x011e:
            r1 = 0
        L_0x011f:
            X.0rz r0 = r4.A0F
            int r0 = X.AnonymousClass2GK.A01(r0, r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A01 = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            r2.A00 = r0
            X.0t9 r0 = r4.A0K
            r0.A06(r2)
            return
        L_0x0137:
            X.041 r0 = X.AnonymousClass041.NOT_ROAMING
            goto L_0x0090
        L_0x013b:
            r1 = 673(0x2a1, float:9.43E-43)
        L_0x013d:
            X.0tM r0 = X.C16620tM.A02
            int r1 = r10.A03(r0, r1)
            goto L_0x006f
        L_0x0145:
            X.0tz r0 = r4.A0E
            android.content.Context r7 = r0.A00
            java.lang.String r0 = "action_backup"
            android.content.Intent r6 = X.C14750ph.A0d(r7, r0)
            boolean r0 = r4.A01
            if (r0 == 0) goto L_0x0189
            java.lang.String r1 = "user_initiated"
        L_0x0156:
            java.lang.String r0 = "backup_mode"
            r6.putExtra(r0, r1)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r1 < r0) goto L_0x017d
            android.app.PendingIntent r9 = X.C42341xd.A02(r7, r6)
        L_0x0165:
            X.12r r8 = r4.A0A
            r7 = 2
            long r0 = android.os.SystemClock.elapsedRealtime()
            r5 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r5
            long r0 = r0 + r2
            boolean r3 = r8.A01(r9, r7, r0)
            if (r3 != 0) goto L_0x00ee
            java.lang.String r0 = "LocalBackupManager/runLocalBackup/onAfterBackup AlarmManager is null"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            goto L_0x00ee
        L_0x017d:
            r1 = 0
            boolean r0 = X.C42341xd.A00
            if (r0 == 0) goto L_0x0184
            r1 = 67108864(0x4000000, float:1.5046328E-36)
        L_0x0184:
            android.app.PendingIntent r9 = android.app.PendingIntent.getService(r7, r5, r6, r1)
            goto L_0x0165
        L_0x0189:
            java.lang.String r1 = "automated"
            goto L_0x0156
        L_0x018c:
            java.util.Random r7 = new java.util.Random
            r7.<init>()
            X.0pd r3 = r4.A0J
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MINUTES
            r1 = 956(0x3bc, float:1.34E-42)
            X.0tM r0 = X.C16620tM.A02
            int r0 = r3.A03(r0, r1)
            long r0 = (long) r0
            long r0 = r2.toSeconds(r0)
            int r2 = (int) r0
            int r0 = r7.nextInt(r2)
            long r2 = (long) r0
            goto L_0x002c
        L_0x01aa:
            long r8 = java.lang.System.currentTimeMillis()
            int r3 = r6.A06()
            java.lang.String r0 = r6.A0M()
            long r0 = r6.A0H(r0)
            int r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r2 <= 0) goto L_0x01d6
            java.lang.String r7 = "gdrive-util/should-backup/last-backup-timestamp-is-in-future/"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r7)
            r2.append(r0)
            java.lang.String r0 = " , ignoring it"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = -1
        L_0x01d6:
            r7 = 1
            if (r3 == 0) goto L_0x0227
            if (r3 == r7) goto L_0x0026
            r2 = 2
            if (r3 == r2) goto L_0x021c
            r2 = 3
            if (r3 == r2) goto L_0x01fd
            r0 = 4
            if (r3 == r0) goto L_0x022a
            java.lang.String r0 = "gdrive-util/should-backup frequency has unexpected value: "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r3)
            java.lang.String r0 = ", no auto backups will be performed."
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x01fa:
            r3 = 0
            goto L_0x00ee
        L_0x01fd:
            long r8 = r8 - r0
            r1 = 2505600000(0x95586c00, double:1.237930882E-314)
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0026
            java.util.Locale r3 = java.util.Locale.ENGLISH
            java.lang.Object[] r2 = new java.lang.Object[r7]
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            long r8 = r8 / r0
            java.lang.Long r0 = java.lang.Long.valueOf(r8)
            r2[r5] = r0
            java.lang.String r0 = "gdrive-util/should-backup/frequency/monthly its only %d days since the last successful backup."
            java.lang.String r0 = java.lang.String.format(r3, r0, r2)
            goto L_0x022c
        L_0x021c:
            long r8 = r8 - r0
            r1 = 518400000(0x1ee62800, double:2.56123631E-315)
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0026
            java.lang.String r0 = "gdrive-util/should-backup/frequency/weekly its not 7 days since the last successful backup."
            goto L_0x022c
        L_0x0227:
            java.lang.String r0 = "gdrive-util/should-backup/frequency/none"
            goto L_0x022c
        L_0x022a:
            java.lang.String r0 = "gdrive-util/should-backup/frequency/manual"
        L_0x022c:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x01fa
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2GZ.AMF(int):void");
    }

    public void ANX() {
        C210912t r4 = this.A01;
        r4.A00 = false;
        C14870pt r7 = r4.A03;
        r7.A08(R.string.str0d82, R.string.str152a);
        Calendar instance = Calendar.getInstance();
        instance.set(14, 0);
        instance.set(13, 0);
        instance.set(12, 0);
        instance.set(11, 2);
        long timeInMillis = instance.getTimeInMillis();
        AnonymousClass013 r6 = r4.A0G;
        r7.A0M(C47672Jx.A01(r6, r4.A0E.A00.getString(R.string.str0d80, new Object[]{C47672Jx.A00(r6, timeInMillis)}), timeInMillis));
    }

    public void AVO(int i2) {
        String format = String.format(Locale.ENGLISH, "app/backup/progress/%d%%", new Object[]{Integer.valueOf(i2)});
        if (i2 % 10 == 0) {
            Log.i(format);
        }
        Calendar instance = Calendar.getInstance();
        instance.set(14, 0);
        instance.set(13, 0);
        instance.set(12, 0);
        instance.set(11, 2);
        long timeInMillis = instance.getTimeInMillis();
        C210912t r0 = this.A01;
        C14870pt r10 = r0.A03;
        AnonymousClass013 r11 = r0.A0G;
        r10.A0M(C47672Jx.A01(r11, r0.A0E.A00.getString(R.string.str0d81, new Object[]{r11.A0L().format(((double) i2) / 100.0d), C47672Jx.A00(r11, timeInMillis)}), timeInMillis));
    }
}
