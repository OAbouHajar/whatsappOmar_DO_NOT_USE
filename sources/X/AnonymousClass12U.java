package X;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.obwhatsapp.backup.google.IDxTConditionShape56S0100000_2_I0;
import com.whatsapp.util.Log;
import org.apache.commons.io.IOUtils;

/* renamed from: X.12U  reason: invalid class name */
public class AnonymousClass12U {
    public AnonymousClass2GM A00;
    public AnonymousClass2GT A01;
    public AnonymousClass2GU A02;
    public String A03;
    public final C16300so A04;
    public final C17130ua A05;
    public final C16200sd A06;
    public final C19670yo A07;
    public final AnonymousClass12M A08;
    public final AnonymousClass12N A09;
    public final AnonymousClass12Q A0A;
    public final AnonymousClass12T A0B;
    public final AnonymousClass2GJ A0C = new AnonymousClass2GR(this);
    public final AnonymousClass2GJ A0D = new IDxTConditionShape56S0100000_2_I0(this, 1);
    public final C19080xj A0E;
    public final C18260wP A0F;
    public final C16190sc A0G;
    public final C16980tz A0H;
    public final C16260sj A0I;
    public final C15860rz A0J;
    public final C14710pd A0K;
    public final C16510tB A0L;
    public final C17660vR A0M;
    public final C16320sq A0N;
    public final Object A0O = new Object();

    public AnonymousClass12U(C16300so r3, C17130ua r4, C16200sd r5, C19670yo r6, AnonymousClass12M r7, AnonymousClass12N r8, AnonymousClass12Q r9, AnonymousClass12T r10, C19080xj r11, C18260wP r12, C16190sc r13, C16980tz r14, C16260sj r15, C15860rz r16, C14710pd r17, C16510tB r18, C17660vR r19, C16320sq r20) {
        this.A0H = r14;
        this.A0K = r17;
        this.A04 = r3;
        this.A0M = r19;
        this.A0N = r20;
        this.A05 = r4;
        this.A0G = r13;
        this.A0E = r11;
        this.A06 = r5;
        this.A0B = r10;
        this.A0I = r15;
        this.A0J = r16;
        this.A0L = r18;
        this.A0F = r12;
        this.A07 = r6;
        this.A08 = r7;
        this.A0A = r9;
        this.A09 = r8;
    }

    public AnonymousClass2GM A00() {
        AnonymousClass2GM r0;
        synchronized (this.A0O) {
            r0 = this.A00;
        }
        return r0;
    }

    public AnonymousClass2GM A01(String str, String str2) {
        AnonymousClass2GM r3;
        synchronized (this.A0O) {
            Context context = this.A0H.A00;
            C14710pd r12 = this.A0K;
            C16300so r5 = this.A04;
            C17660vR r14 = this.A0M;
            C17130ua r6 = this.A05;
            C16190sc r10 = this.A0G;
            r3 = new AnonymousClass2GM(context, r5, r6, this.A06, this.A0B, this.A0F, r10, this.A0I, r12, this.A0L, r14, this.A0N, str, str2);
            this.A00 = r3;
        }
        return r3;
    }

    public void A02() {
        synchronized (this.A0O) {
            AnonymousClass2GM r1 = this.A00;
            if (r1 != null) {
                synchronized (r1) {
                    Log.i("GoogleBackupApi/cancel");
                    r1.A01 = true;
                    r1.A09(false);
                }
            }
        }
        this.A0E.A00(2, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03() {
        /*
            r6 = this;
            java.lang.String r0 = "gdrive-service/cancel-pending-backup-and-restore-if-any"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0rz r4 = r6.A0J
            boolean r0 = X.AnonymousClass2GK.A0G(r4)
            java.lang.String r1 = "gdrive-service/drive-api/null"
            r3 = 0
            if (r0 != 0) goto L_0x00af
            X.0yo r2 = r6.A07
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.A0c
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x00af
            boolean r0 = X.AnonymousClass2GK.A0H(r4)
            if (r0 == 0) goto L_0x0085
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.A0e
            r0.getAndSet(r3)
            android.os.ConditionVariable r0 = r2.A0G
            r0.open()
            X.2GM r0 = r6.A00()
            if (r0 == 0) goto L_0x006b
            java.lang.String r0 = "gdrive-service/cancel-media-restore/interrupt-drive-api"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r6.A02()
            android.os.ConditionVariable r0 = r2.A0F
            r0.open()
            android.os.ConditionVariable r0 = r2.A0C
            r0.open()
            X.12M r0 = r6.A08
            r0.A05()
        L_0x0047:
            r4.A0j(r3)
        L_0x004a:
            r0 = 10
            r6.A05(r0)
            X.01D r0 = r4.A01
            java.lang.Object r0 = r0.get()
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0
            java.lang.String r1 = "gdrive_user_initiated_backup"
            boolean r0 = r0.getBoolean(r1, r3)
            if (r0 == 0) goto L_0x006a
            android.content.SharedPreferences$Editor r0 = r4.A0K()
            android.content.SharedPreferences$Editor r0 = r0.putBoolean(r1, r3)
            r0.apply()
        L_0x006a:
            return
        L_0x006b:
            com.whatsapp.util.Log.i((java.lang.String) r1)
            android.os.ConditionVariable r0 = r2.A0F
            r0.open()
            android.os.ConditionVariable r0 = r2.A0C
            r0.open()
            X.0sq r2 = r6.A0N
            r1 = 11
            com.facebook.redex.RunnableRunnableShape3S0100000_I0_2 r0 = new com.facebook.redex.RunnableRunnableShape3S0100000_I0_2
            r0.<init>(r6, r1)
            r2.Acl(r0)
            goto L_0x004a
        L_0x0085:
            int r1 = r4.A09()
            r0 = 3
            if (r1 != r0) goto L_0x00a9
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.A0f
            r0.getAndSet(r3)
            android.os.ConditionVariable r0 = r2.A0G
            r0.open()
            r6.A02()
            android.os.ConditionVariable r0 = r2.A0E
            r0.open()
            android.os.ConditionVariable r0 = r2.A0B
            r0.open()
            X.12Q r0 = r6.A0A
            r0.A03()
            goto L_0x0047
        L_0x00a9:
            java.lang.String r0 = "gdrive-service/cancel/nothing-to-cancel"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x004a
        L_0x00af:
            X.0yo r5 = r6.A07
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.A0c
            r0.getAndSet(r3)
            X.AnonymousClass2GS.A02()
            android.os.ConditionVariable r0 = r5.A0G
            r0.open()
            X.2GM r0 = r6.A00()
            if (r0 == 0) goto L_0x00df
            java.lang.String r0 = "gdrive-service/cancel-backup/interrupt-drive-api"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r6.A02()
            android.os.ConditionVariable r0 = r5.A0D
            r0.open()
            android.os.ConditionVariable r0 = r5.A0A
            r0.open()
        L_0x00d6:
            X.12Q r0 = r6.A0A
            r0.A03()
            r5.A04 = r3
            goto L_0x0047
        L_0x00df:
            com.whatsapp.util.Log.i((java.lang.String) r1)
            android.os.ConditionVariable r0 = r5.A0D
            r0.open()
            android.os.ConditionVariable r0 = r5.A0A
            r0.open()
            X.0sq r2 = r6.A0N
            r1 = 10
            com.facebook.redex.RunnableRunnableShape3S0100000_I0_2 r0 = new com.facebook.redex.RunnableRunnableShape3S0100000_I0_2
            r0.<init>(r6, r1)
            r2.Acl(r0)
            goto L_0x00d6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass12U.A03():void");
    }

    public void A04() {
        synchronized (this.A0O) {
            this.A01 = null;
        }
    }

    public void A05(int i2) {
        String str;
        AnonymousClass2GU r1;
        AnonymousClass2GT r12;
        String A042 = AnonymousClass2GK.A04(i2);
        if (i2 != 10) {
            TextUtils.join(IOUtils.LINE_SEPARATOR_UNIX, Thread.currentThread().getStackTrace());
            StringBuilder sb = new StringBuilder("gdrive-service/set-error/");
            sb.append(A042);
            Log.e(sb.toString());
        }
        C15860rz r7 = this.A0J;
        r7.A0K().putInt("gdrive_error_code", i2).apply();
        Object obj = this.A0O;
        synchronized (obj) {
            str = this.A03;
        }
        if (AnonymousClass2GK.A0H(r7) || "action_restore_media".equals(str)) {
            AnonymousClass12M r13 = this.A08;
            Bundle A002 = this.A09.A00();
            for (AnonymousClass12R AQi : r13.A01()) {
                AQi.AQi(i2, A002);
            }
            synchronized (obj) {
                r1 = this.A02;
            }
            if (r1 != null) {
                r1.A09 = Integer.valueOf(AnonymousClass2GK.A00(i2));
            }
        } else if (r7.A09() == 3 || "action_restore".equals(str)) {
            AnonymousClass12M r14 = this.A08;
            Bundle A003 = this.A09.A00();
            for (AnonymousClass12R AQj : r14.A01()) {
                AQj.AQj(i2, A003);
            }
        } else {
            if (AnonymousClass2GK.A0G(r7) || "action_backup".equals(str)) {
                synchronized (obj) {
                    r12 = this.A01;
                }
                if (r12 != null && r12.A0C == null) {
                    r12.A0C = Integer.valueOf(AnonymousClass2GK.A00(i2));
                }
            } else if (str != null) {
                if (i2 != 10) {
                    StringBuilder sb2 = new StringBuilder("gdrive-service/set-error/unexpected-service-start-action/");
                    sb2.append(str);
                    Log.e(sb2.toString());
                    return;
                }
                return;
            } else if (i2 != 10) {
                Log.e("gdrive-service/set-error/unexpected-service-start-action/null", new Throwable());
                return;
            } else {
                Log.i("gdrive-service/set-error/action-is-null and nothing is pending (probably backup attempt failed)");
            }
            this.A08.A06(i2, this.A09.A00());
        }
    }
}
