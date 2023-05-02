package X;

import android.os.PowerManager;
import android.os.SystemClock;
import com.whatsapp.util.Log;
import java.util.Set;

/* renamed from: X.2Gb  reason: invalid class name and case insensitive filesystem */
public class C46742Gb extends C16690tT {
    public final long A00;
    public final AnonymousClass12E A01;
    public final C19080xj A02;
    public final AnonymousClass01V A03;
    public final C210912t A04;
    public final AnonymousClass2GV A05;
    public final C16250si A06;
    public final AnonymousClass01D A07;

    public C46742Gb(AnonymousClass12E r1, C19080xj r2, AnonymousClass01V r3, C210912t r4, AnonymousClass2GV r5, C16250si r6, AnonymousClass01D r7, long j2) {
        this.A00 = j2;
        this.A07 = r7;
        this.A02 = r2;
        this.A03 = r3;
        this.A04 = r4;
        this.A06 = r6;
        this.A05 = r5;
        this.A01 = r1;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        PowerManager.WakeLock A002;
        PowerManager A0I = this.A03.A0I();
        int i2 = 1;
        if (A0I == null) {
            Log.w("localbackupmanager/backup pm=null");
            A002 = null;
        } else {
            A002 = C43421zy.A00(A0I, "backupdb", 1);
        }
        if (A002 != null) {
            try {
                A002.acquire();
            } catch (Exception e2) {
                Log.e("localbackupmanager/backup/error", e2);
            } catch (Throwable th) {
                StringBuilder sb = new StringBuilder();
                sb.append("localbackupmanager/backup/wl/releasing ");
                sb.append(A002);
                Log.i(sb.toString());
                if (A002 != null && A002.isHeld()) {
                    A002.release();
                    Log.i("localbackupmanager/backup/wl/release");
                }
                throw th;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("localbackupmanager/backup/wl/acquire ");
        sb2.append(A002);
        Log.i(sb2.toString());
        long currentTimeMillis = System.currentTimeMillis();
        this.A04.A00();
        i2 = this.A06.A06(new C17000u1(this));
        StringBuilder sb3 = new StringBuilder();
        sb3.append("localbackupmanager/backup/msgstore/result/");
        sb3.append(i2);
        Log.i(sb3.toString());
        for (C16240sh r5 : (Set) this.A07.get()) {
            String AA3 = r5.AA3();
            StringBuilder sb4 = new StringBuilder();
            sb4.append("localbackupmanager/backup/");
            sb4.append(AA3);
            Log.i(sb4.toString());
            if (!r5.A5J()) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append("localbackupmanager/backup/failed-to-generate-backup ");
                sb5.append(AA3);
                Log.e(sb5.toString());
            }
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        long j2 = this.A00;
        if (j2 > 0) {
            long j3 = j2 - (currentTimeMillis2 - currentTimeMillis);
            if (j3 > 0 && i2 == 0) {
                SystemClock.sleep(j3);
            }
        }
        StringBuilder sb6 = new StringBuilder();
        sb6.append("localbackupmanager/backup/wl/releasing ");
        sb6.append(A002);
        Log.i(sb6.toString());
        if (A002 != null && A002.isHeld()) {
            A002.release();
            Log.i("localbackupmanager/backup/wl/release");
        }
        StringBuilder sb7 = new StringBuilder("localbackupmanager/backup/result = ");
        sb7.append(i2);
        Log.i(sb7.toString());
        return Integer.valueOf(i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0089, code lost:
        if (r1.isFinishing() == false) goto L_0x0021;
     */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0077 A[LOOP:0: B:5:0x0071->B:7:0x0077, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void A0A(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Number r13 = (java.lang.Number) r13
            java.lang.String r1 = "local/backup/done "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r13)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.12E r0 = r12.A01
            X.1yO r1 = r0.A00()
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x0081
            X.1yP r1 = r1.A00()
        L_0x0021:
            com.obwhatsapp.Conversation r1 = (com.obwhatsapp.Conversation) r1
            X.1yj r0 = r1.A00
            X.1kZ r0 = r0.A2C
            X.0t6 r1 = r0.A0Z
            X.0rv r2 = r0.A0h
            long r4 = r0.A09
            int r3 = r0.A06()
            long r6 = r0.A0K
            r8 = 1
            X.1kc r6 = r1.A0C(r2, r3, r4, r6, r8)
            long r1 = r6.A01
            r0.A0G(r1)
            long r1 = r6.A02
            r0.A0H(r1)
            r0.A0I(r6)
            r5 = 0
            r10 = 0
            r8 = r5
            r9 = r5
            r11 = 0
            X.1ka r4 = new X.1ka
            r7 = r5
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            android.os.Handler r3 = new android.os.Handler
            r3.<init>(r1)
            r2 = 28
            com.facebook.redex.RunnableRunnableShape5S0200000_I0_3 r1 = new com.facebook.redex.RunnableRunnableShape5S0200000_I0_3
            r1.<init>(r0, r2, r4)
            r3.post(r1)
        L_0x0063:
            X.2GV r0 = r12.A05
            int r2 = r13.intValue()
            java.lang.Iterable r0 = r0.A01()
            java.util.Iterator r1 = r0.iterator()
        L_0x0071:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x008c
            java.lang.Object r0 = r1.next()
            X.2Ga r0 = (X.AnonymousClass2Ga) r0
            r0.AMF(r2)
            goto L_0x0071
        L_0x0081:
            X.1yP r1 = r1.A00
            if (r1 == 0) goto L_0x0063
            boolean r0 = r1.isFinishing()
            if (r0 != 0) goto L_0x0063
            goto L_0x0021
        L_0x008c:
            X.0xj r2 = r12.A02
            r1 = 1
            r0 = 0
            r2.A00(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46742Gb.A0A(java.lang.Object):void");
    }
}
