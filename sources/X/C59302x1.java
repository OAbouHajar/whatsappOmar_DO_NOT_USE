package X;

import android.content.Context;
import android.content.Intent;
import com.whatsapp.util.Log;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

/* renamed from: X.2x1  reason: invalid class name and case insensitive filesystem */
public class C59302x1 extends AnonymousClass4X3 {
    public final Context A00;
    public final C16570tH A01;
    public final C16300so A02;
    public final C16180sb A03;
    public final C16040sK A04;
    public final C83484Gv A05;
    public final C210812s A06;
    public final C210712r A07;
    public final AnonymousClass12W A08;
    public final AnonymousClass01V A09;
    public final C16440t3 A0A;
    public final C15860rz A0B;
    public final C14730pf A0C;
    public final C208211s A0D;
    public final AnonymousClass16P A0E;
    public final C210912t A0F;
    public final C16900tq A0G;
    public final AnonymousClass11E A0H;
    public final C14710pd A0I;
    public final C16490t9 A0J;
    public final C16320sq A0K;
    public final AnonymousClass01D A0L;

    public C59302x1(Context context, C16570tH r3, C16300so r4, C16180sb r5, C16040sK r6, C83484Gv r7, C210812s r8, C210712r r9, AnonymousClass12W r10, AnonymousClass01V r11, C16440t3 r12, C15860rz r13, C14730pf r14, C208211s r15, AnonymousClass16P r16, C210912t r17, C16900tq r18, AnonymousClass11E r19, C14710pd r20, C16490t9 r21, C16320sq r22, AnonymousClass01D r23) {
        super(context);
        this.A00 = context;
        this.A0A = r12;
        this.A0I = r20;
        this.A07 = r9;
        this.A02 = r4;
        this.A04 = r6;
        this.A0K = r22;
        this.A03 = r5;
        this.A0J = r21;
        this.A0C = r14;
        this.A0E = r16;
        this.A09 = r11;
        this.A05 = r7;
        this.A0D = r15;
        this.A08 = r10;
        this.A0F = r17;
        this.A0G = r18;
        this.A0B = r13;
        this.A06 = r8;
        this.A0H = r19;
        this.A01 = r3;
        this.A0L = r23;
    }

    public void A01() {
        A05();
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0112 A[DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x014e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(android.content.Intent r16) {
        /*
            r15 = this;
            java.lang.String r0 = "backupMessages"
            X.1Zf r6 = new X.1Zf
            r6.<init>((java.lang.String) r0)
            X.2GY r3 = new X.2GY
            r3.<init>()
            r7 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            r3.A03 = r0
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3.A04 = r0
            java.lang.String r0 = "BackupMessagesAction/backupMessages; intent="
            r1 = r16
            java.lang.String r0 = X.AnonymousClass000.A0g(r0, r1)
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.01V r0 = r15.A09
            android.os.PowerManager r13 = r0.A0I()
            r10 = 0
            r0 = 600000(0x927c0, double:2.964394E-318)
            r12 = 0
            if (r13 != 0) goto L_0x0046
            java.lang.String r2 = "BackupMessagesAction/backupMessages pm=null"
            com.whatsapp.util.Log.w((java.lang.String) r2)
            r9 = r10
        L_0x003b:
            android.os.ConditionVariable r8 = new android.os.ConditionVariable
            r8.<init>(r7)
            android.os.ConditionVariable r5 = new android.os.ConditionVariable
            r5.<init>(r7)
            goto L_0x0053
        L_0x0046:
            java.lang.String r2 = "BackupMessagesAction#backupMessages"
            android.os.PowerManager$WakeLock r9 = X.C43421zy.A00(r13, r2, r7)
            r9.setReferenceCounted(r12)
            r9.acquire(r0)
            goto L_0x003b
        L_0x0053:
            X.0sK r4 = r15.A04     // Catch:{ all -> 0x0189 }
            r4.A0B()     // Catch:{ all -> 0x0189 }
            com.obwhatsapp.Me r2 = r4.A00     // Catch:{ all -> 0x0189 }
            if (r2 != 0) goto L_0x0064
            java.lang.String r2 = "BackupMessagesAction/backupMessages skipping message backup due to not yet registered"
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ all -> 0x0189 }
            r10 = 2
            goto L_0x00f2
        L_0x0064:
            X.0tq r2 = r15.A0G     // Catch:{ all -> 0x0189 }
            r2.A04()     // Catch:{ all -> 0x0189 }
            boolean r2 = r2.A01     // Catch:{ all -> 0x0189 }
            if (r2 != 0) goto L_0x0074
            java.lang.String r2 = "BackupMessagesAction/backupMessages skipping message backup due message store is not ready"
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ all -> 0x0189 }
            r10 = 6
            goto L_0x00f2
        L_0x0074:
            X.12W r11 = r15.A08     // Catch:{ all -> 0x0189 }
            boolean r2 = r11.A02()     // Catch:{ all -> 0x0189 }
            if (r2 == 0) goto L_0x0091
            java.lang.String r2 = "BackupMessagesAction/backupMessages skipping message backup due to missing external writable media"
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ all -> 0x0189 }
            X.12t r10 = r15.A0F     // Catch:{ all -> 0x0189 }
            X.01D r2 = r11.A06     // Catch:{ all -> 0x0189 }
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x0189 }
            X.1ud r2 = (X.C40751ud) r2     // Catch:{ all -> 0x0189 }
            boolean r2 = r2.A00     // Catch:{ all -> 0x0189 }
            r10.A00 = r2     // Catch:{ all -> 0x0189 }
            r10 = 3
            goto L_0x00f2
        L_0x0091:
            X.12s r2 = r15.A06     // Catch:{ all -> 0x0189 }
            X.2Cv r2 = r2.A00     // Catch:{ all -> 0x0189 }
            boolean r2 = r2.A02()     // Catch:{ all -> 0x0189 }
            if (r2 != 0) goto L_0x00a6
            java.lang.String r2 = "BackupMessagesAction/backupMessages skipping message backup due to not plugged in and low battery"
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ all -> 0x0189 }
            X.12t r2 = r15.A0F     // Catch:{ all -> 0x0189 }
            r2.A00 = r7     // Catch:{ all -> 0x0189 }
            r10 = 4
            goto L_0x00f2
        L_0x00a6:
            X.0tH r2 = r15.A01     // Catch:{ all -> 0x0189 }
            boolean r2 = r2.A00     // Catch:{ all -> 0x0189 }
            if (r2 == 0) goto L_0x00b7
            java.lang.String r2 = "BackupMessagesAction/backupMessages skipping message backup since app is in foreground"
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ all -> 0x0189 }
            X.12t r2 = r15.A0F     // Catch:{ all -> 0x0189 }
            r2.A00 = r7     // Catch:{ all -> 0x0189 }
            r10 = 5
            goto L_0x00f2
        L_0x00b7:
            java.lang.String r2 = "BackupMessagesAction/backupMessages starting message backup"
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ all -> 0x0189 }
            X.12t r14 = r15.A0F     // Catch:{ all -> 0x0189 }
            r14.A00 = r12     // Catch:{ all -> 0x0189 }
            r8.close()     // Catch:{ all -> 0x0189 }
            X.2GZ r11 = new X.2GZ     // Catch:{ all -> 0x0189 }
            r11.<init>(r8, r14, r3)     // Catch:{ all -> 0x0189 }
            r2 = -1
            r14.A01(r11, r2)     // Catch:{ all -> 0x0189 }
            if (r13 != 0) goto L_0x00d0
            goto L_0x00e0
        L_0x00d0:
            java.lang.String r2 = "BackupMessagesAction#backupMessages#mediaCleanup"
            android.os.PowerManager$WakeLock r10 = X.C43421zy.A00(r13, r2, r7)     // Catch:{ all -> 0x0189 }
            r10.setReferenceCounted(r12)     // Catch:{ all -> 0x0189 }
            r2 = 120000(0x1d4c0, double:5.9288E-319)
            r10.acquire(r2)     // Catch:{ all -> 0x0189 }
            goto L_0x00e5
        L_0x00e0:
            java.lang.String r2 = "BackupMessagesAction/backupMessages/media-cleanup pm=null"
            com.whatsapp.util.Log.w((java.lang.String) r2)     // Catch:{ all -> 0x0189 }
        L_0x00e5:
            X.0sq r11 = r15.A0K     // Catch:{ all -> 0x0189 }
            r3 = 31
            com.facebook.redex.RunnableRunnableShape12S0200000_I1 r2 = new com.facebook.redex.RunnableRunnableShape12S0200000_I1     // Catch:{ all -> 0x0189 }
            r2.<init>(r15, r3, r10)     // Catch:{ all -> 0x0189 }
            r11.Acl(r2)     // Catch:{ all -> 0x0189 }
            goto L_0x010d
        L_0x00f2:
            X.0rz r2 = r15.A0B     // Catch:{ all -> 0x0189 }
            int r2 = X.AnonymousClass2GK.A01(r2, r12)     // Catch:{ all -> 0x0189 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0189 }
            r3.A01 = r2     // Catch:{ all -> 0x0189 }
            java.lang.Boolean r2 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0189 }
            r3.A00 = r2     // Catch:{ all -> 0x0189 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0189 }
            r3.A02 = r2     // Catch:{ all -> 0x0189 }
            X.0t9 r2 = r15.A0J     // Catch:{ all -> 0x0189 }
            r2.A06(r3)     // Catch:{ all -> 0x0189 }
        L_0x010d:
            r15.A05()     // Catch:{ all -> 0x0189 }
            if (r9 == 0) goto L_0x0115
            r9.release()
        L_0x0115:
            r8.block(r0)
            r4.A0B()
            com.obwhatsapp.Me r2 = r4.A00
            if (r2 == 0) goto L_0x0147
            java.lang.String r2 = "backupMessages/session-verification"
            X.1Zf r3 = new X.1Zf
            r3.<init>((java.lang.String) r2)
            android.os.ConditionVariable r9 = new android.os.ConditionVariable
            r9.<init>(r7)
            r9.close()
            X.0sq r2 = r15.A0K
            X.0so r11 = r15.A02
            X.16P r12 = r15.A0E
            X.11s r10 = r15.A0D
            X.0rz r8 = r15.A0B
            r13 = 3
            com.facebook.redex.RunnableRunnableShape1S0500000_I1 r7 = new com.facebook.redex.RunnableRunnableShape1S0500000_I1
            r7.<init>(r8, r9, r10, r11, r12, r13)
            r2.Acl(r7)
            r9.block(r0)
            r3.A01()
        L_0x0147:
            r4.A0B()
            com.obwhatsapp.Me r0 = r4.A00
            if (r0 == 0) goto L_0x0180
            X.0tq r0 = r15.A0G
            r0.A04()
            boolean r0 = r0.A01
            if (r0 == 0) goto L_0x0180
            java.lang.String r0 = "backupMessages/db-migration"
            X.1Zf r7 = new X.1Zf
            r7.<init>((java.lang.String) r0)
            r5.close()
            X.0sq r4 = r15.A0K
            X.0pd r3 = r15.A0I
            X.11E r2 = r15.A0H
            X.01D r0 = r15.A0L
            java.lang.Object r1 = r0.get()
            X.1Hk r1 = (X.C24821Hk) r1
            com.facebook.redex.RunnableRunnableShape1S0400000_I1 r0 = new com.facebook.redex.RunnableRunnableShape1S0400000_I1
            r0.<init>(r5, r1, r2, r3)
            r4.Acl(r0)
            r0 = 1800000(0x1b7740, double:8.89318E-318)
            r5.block(r0)
            r7.A01()
        L_0x0180:
            java.lang.String r0 = "BackupMessagesAction/backupMessages done"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r6.A01()
            return
        L_0x0189:
            r0 = move-exception
            if (r9 == 0) goto L_0x018f
            r9.release()
        L_0x018f:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59302x1.A02(android.content.Intent):void");
    }

    public boolean A03() {
        return false;
    }

    public boolean A04(Intent intent) {
        return "com.obwhatsapp.action.BACKUP_MESSAGES".equals(intent.getAction());
    }

    public final void A05() {
        if (this.A04.A0G()) {
            Log.i("BackupMessagesAction/setupBackupMessagesAlarmIfNeeded skipping due to companion mode");
            return;
        }
        Calendar instance = Calendar.getInstance();
        if (instance.get(11) >= 2) {
            instance.add(5, 1);
        }
        boolean A1U = C13690nt.A1U(instance);
        instance.set(11, 2);
        long timeInMillis = instance.getTimeInMillis();
        C83484Gv r0 = this.A05;
        C15900s5 r4 = r0.A00;
        Random random = r0.A01;
        int A022 = r4.A02(C15910s6.A1j);
        long A082 = timeInMillis + (A022 <= 0 ? 0 : C13690nt.A08(random.nextInt(A022 << 1)));
        StringBuilder A0r = AnonymousClass000.A0r("BackupMessagesAction/setupBackupMessagesAlarmIfNeeded; alarmTimeMillis=");
        A0r.append(new Date(A082));
        C13680ns.A1V(A0r);
        if (!this.A07.A02(super.A00("com.obwhatsapp.action.BACKUP_MESSAGES", 134217728), A1U ? 1 : 0, A082)) {
            Log.w("BackupMessagesAction/setupBackupMessagesAlarmIfNeeded AlarmManager is null");
        }
    }
}
