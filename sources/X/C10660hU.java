package X;

import android.os.Build;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.0hU  reason: invalid class name and case insensitive filesystem */
public class C10660hU implements Runnable {
    public static final String A02 = C06530Wm.A01("EnqueueRunnable");
    public final C08020cu A00;
    public final AnonymousClass04Q A01;

    public C10660hU(AnonymousClass04Q r2) {
        C08020cu r0 = new C08020cu();
        this.A01 = r2;
        this.A00 = r0;
    }

    public static final C007303i A00(C007303i r44) {
        C007303i r14 = r44;
        AnonymousClass042 r1 = r14.A0A;
        String str = r14.A0G;
        String name = ConstraintTrackingWorker.class.getName();
        if (C18450wi.A0R(str, name)) {
            return r14;
        }
        if (!r1.A04 && !r1.A07) {
            return r14;
        }
        C007103g r2 = new C007103g();
        r2.A02(r14.A0B.A00);
        r2.A00.put("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str);
        C007203h A002 = r2.A00();
        C18450wi.A0B(name);
        String str2 = r14.A0J;
        AnonymousClass0KV r21 = r14.A0E;
        String str3 = r14.A0F;
        C007203h r442 = r14.A0C;
        long j2 = r14.A04;
        long j3 = r14.A05;
        long j4 = r14.A03;
        AnonymousClass042 r43 = r14.A0A;
        int i2 = r14.A01;
        AnonymousClass04P r42 = r14.A09;
        long j5 = r14.A02;
        long j6 = r14.A06;
        long j7 = r14.A07;
        long j8 = r14.A08;
        boolean z2 = r14.A0H;
        boolean z3 = z2;
        long j9 = j2;
        return C007303i.A00(r42, r43, A002, r442, r14.A0D, r21, str2, name, str3, i2, r14.A00, r14.A0I, j9, j3, j4, j5, j6, j7, j8, z3);
    }

    public static final C007303i A01(C007303i r3, List list) {
        C18450wi.A0H(list, 0);
        int i2 = Build.VERSION.SDK_INT;
        if (23 > i2) {
            try {
                Class<?> cls = Class.forName("androidx.work.impl.background.gcm.GcmScheduler");
                if ((list instanceof Collection) && list.isEmpty()) {
                    return r3;
                }
                for (Object obj : list) {
                    if (cls.isAssignableFrom(obj.getClass())) {
                    }
                }
                return r3;
            } catch (ClassNotFoundException unused) {
                return r3;
            }
        } else if (i2 >= 26) {
            return r3;
        }
        return A00(r3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x021a, code lost:
        if (r13.moveToNext() == false) goto L_0x0235;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0220, code lost:
        if (r13.isNull(0) == false) goto L_0x0224;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0222, code lost:
        r10 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0224, code lost:
        r10 = r13.getString(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0228, code lost:
        r12.add(new X.AnonymousClass0R6(X.AnonymousClass0XK.A08(r13, 1), r10));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0235, code lost:
        r13.close();
        r11.A01();
        r3 = r12.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0243, code lost:
        if (r3.hasNext() == false) goto L_0x0266;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0245, code lost:
        r0 = ((X.AnonymousClass0R6) r3.next()).A01;
        r8.A09();
        r12 = r9.A02;
        r11 = r12.A00();
        r11.A5S(1, r0);
        r8.A0A();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:?, code lost:
        X.AnonymousClass0GC.A00(r8, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x025f, code lost:
        r8.A0B();
        r12.A03(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0266, code lost:
        r20 = false;
        r19 = false;
        r10 = java.util.Collections.emptyList();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0360, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0361, code lost:
        r8.A0B();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x036d, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x036e, code lost:
        r13.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01f1, code lost:
        if (r19 != false) goto L_0x01f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01f3, code lost:
        r9 = (X.C08170dC) r23.A0J();
        r11 = X.AnonymousClass0M4.A00("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01fd, code lost:
        if (r6 != null) goto L_0x020e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01ff, code lost:
        r11.A5R(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0202, code lost:
        r8 = r9.A01;
        r8.A09();
        r13 = X.AnonymousClass0M5.A00(r8, r11, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x020e, code lost:
        r11.A5S(1, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:?, code lost:
        r12 = X.AnonymousClass000.A0v(r13);
     */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0284  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00fa A[Catch:{ all -> 0x0368 }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0120  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A02(X.AnonymousClass04Q r25) {
        /*
            r5 = r25
            java.util.List r0 = r5.A07
            r22 = 0
            if (r0 == 0) goto L_0x0043
            java.util.Iterator r4 = r0.iterator()
        L_0x000c:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0043
            java.lang.Object r1 = r4.next()
            X.04Q r1 = (X.AnonymousClass04Q) r1
            boolean r0 = r1.A01
            if (r0 != 0) goto L_0x0023
            boolean r0 = A02(r1)
            r22 = r22 | r0
            goto L_0x000c
        L_0x0023:
            X.C06530Wm.A00()
            java.lang.String r3 = A02
            java.lang.String r0 = "Already enqueued work ids ("
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0r(r0)
            java.util.List r1 = r1.A06
            java.lang.String r0 = ", "
            java.lang.String r0 = android.text.TextUtils.join(r0, r1)
            r2.append(r0)
            java.lang.String r0 = ")"
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r2)
            android.util.Log.w(r3, r0)
            goto L_0x000c
        L_0x0043:
            java.util.Set r1 = X.AnonymousClass04Q.A00(r5)
            X.022 r0 = r5.A03
            r25 = r0
            java.util.List r0 = r5.A08
            r24 = r0
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.Object[] r7 = r1.toArray(r0)
            java.lang.String[] r7 = (java.lang.String[]) r7
            java.lang.String r6 = r5.A04
            X.03z r3 = r5.A02
            long r1 = java.lang.System.currentTimeMillis()
            r0 = r25
            androidx.work.impl.WorkDatabase r0 = r0.A04
            r23 = r0
            r8 = 1
            r10 = 0
            if (r7 == 0) goto L_0x00bc
            int r11 = r7.length
            if (r11 <= 0) goto L_0x00bc
            r17 = 1
            r9 = 0
            r21 = 1
            r20 = 0
            r19 = 0
        L_0x0076:
            r4 = r7[r9]
            X.0lu r0 = r23.A0J()
            X.03i r0 = r0.AH8(r4)
            if (r0 != 0) goto L_0x00a0
            X.C06530Wm.A00()
            java.lang.String r2 = A02
            java.lang.String r0 = "Prerequisite "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            r1.append(r4)
            java.lang.String r0 = " doesn't exist; not enqueuing"
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)
            android.util.Log.e(r2, r0)
        L_0x0099:
            r8 = 0
        L_0x009a:
            r0 = 1
            r5.A01 = r0
            r8 = r8 | r22
            return r8
        L_0x00a0:
            X.0KV r4 = r0.A0E
            X.0KV r0 = X.AnonymousClass0KV.SUCCEEDED
            boolean r0 = X.AnonymousClass000.A1Y(r4, r0)
            r21 = r21 & r0
            X.0KV r0 = X.AnonymousClass0KV.FAILED
            if (r4 != r0) goto L_0x00b5
            r19 = 1
        L_0x00b0:
            int r9 = r9 + 1
            if (r9 >= r11) goto L_0x00c4
            goto L_0x0076
        L_0x00b5:
            X.0KV r0 = X.AnonymousClass0KV.CANCELLED
            if (r4 != r0) goto L_0x00b0
            r20 = 1
            goto L_0x00b0
        L_0x00bc:
            r17 = 0
            r21 = 1
            r20 = 0
            r19 = 0
        L_0x00c4:
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            r18 = r0 ^ 1
            if (r18 == 0) goto L_0x0279
            if (r17 != 0) goto L_0x0279
            X.0lu r0 = r23.A0J()
            X.0dC r0 = (X.C08170dC) r0
            java.lang.String r12 = "SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)"
            r4 = 1
            X.0cR r11 = X.AnonymousClass0M4.A00(r12, r8)
            if (r6 != 0) goto L_0x00ec
            r11.A5R(r8)
        L_0x00e0:
            X.0SM r0 = r0.A01
            r0.A09()
            r16 = 0
            android.database.Cursor r14 = X.AnonymousClass0M5.A00(r0, r11, r10)
            goto L_0x00f0
        L_0x00ec:
            r11.A5S(r8, r6)
            goto L_0x00e0
        L_0x00f0:
            java.util.ArrayList r9 = X.AnonymousClass000.A0v(r14)     // Catch:{ all -> 0x0368 }
        L_0x00f4:
            boolean r0 = r14.moveToNext()     // Catch:{ all -> 0x0368 }
            if (r0 == 0) goto L_0x0114
            boolean r0 = r14.isNull(r10)     // Catch:{ all -> 0x0368 }
            if (r0 == 0) goto L_0x0103
            r15 = r16
            goto L_0x0107
        L_0x0103:
            java.lang.String r15 = r14.getString(r10)     // Catch:{ all -> 0x0368 }
        L_0x0107:
            X.0KV r13 = X.AnonymousClass0XK.A08(r14, r8)     // Catch:{ all -> 0x0368 }
            X.0R6 r0 = new X.0R6     // Catch:{ all -> 0x0368 }
            r0.<init>(r13, r15)     // Catch:{ all -> 0x0368 }
            r9.add(r0)     // Catch:{ all -> 0x0368 }
            goto L_0x00f4
        L_0x0114:
            r14.close()
            r11.A01()
            boolean r0 = r9.isEmpty()
            if (r0 != 0) goto L_0x0279
            X.03z r0 = X.AnonymousClass03z.APPEND
            if (r3 == r0) goto L_0x0186
            X.03z r0 = X.AnonymousClass03z.APPEND_OR_REPLACE
            if (r3 == r0) goto L_0x0186
            X.03z r0 = X.AnonymousClass03z.KEEP
            if (r3 != r0) goto L_0x0148
            java.util.Iterator r4 = r9.iterator()
        L_0x0130:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0148
            java.lang.Object r0 = r4.next()
            X.0R6 r0 = (X.AnonymousClass0R6) r0
            X.0KV r3 = r0.A00
            X.0KV r0 = X.AnonymousClass0KV.ENQUEUED
            if (r3 == r0) goto L_0x0099
            X.0KV r0 = X.AnonymousClass0KV.RUNNING
            if (r3 != r0) goto L_0x0130
            goto L_0x0099
        L_0x0148:
            X.0H6 r3 = new X.0H6
            r0 = r25
            r3.<init>(r0, r6, r10)
            r3.run()
            X.0lu r10 = r23.A0J()
            java.util.Iterator r9 = r9.iterator()
        L_0x015a:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x027a
            java.lang.Object r0 = r9.next()
            X.0R6 r0 = (X.AnonymousClass0R6) r0
            java.lang.String r4 = r0.A01
            r0 = r10
            X.0dC r0 = (X.C08170dC) r0
            X.0SM r3 = r0.A01
            r3.A09()
            X.0Rm r12 = r0.A02
            X.0mT r11 = r12.A00()
            r11.A5S(r8, r4)
            r3.A0A()
            X.AnonymousClass0GC.A00(r3, r11)     // Catch:{ all -> 0x0353 }
            r3.A0B()
            r12.A03(r11)
            goto L_0x015a
        L_0x0186:
            X.0kf r17 = r23.A0E()
            java.util.ArrayList r10 = X.AnonymousClass000.A0u()
            java.util.Iterator r16 = r9.iterator()
        L_0x0192:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x01eb
            java.lang.Object r14 = r16.next()
            X.0R6 r14 = (X.AnonymousClass0R6) r14
            java.lang.String r11 = r14.A01
            r8 = r17
            X.0d7 r8 = (X.C08120d7) r8
            java.lang.String r0 = "SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?"
            r15 = 1
            X.0cR r13 = X.AnonymousClass0M4.A00(r0, r4)
            r13.A5S(r4, r11)
            X.0SM r0 = r8.A01
            r0.A09()
            r9 = 0
            android.database.Cursor r8 = X.AnonymousClass0M5.A00(r0, r13, r9)
            boolean r0 = r8.moveToFirst()     // Catch:{ all -> 0x0358 }
            if (r0 == 0) goto L_0x01c6
            int r0 = r8.getInt(r9)     // Catch:{ all -> 0x0358 }
            if (r0 != 0) goto L_0x01c5
            r15 = 0
        L_0x01c5:
            r9 = r15
        L_0x01c6:
            r8.close()
            r13.A01()
            if (r9 != 0) goto L_0x0192
            X.0KV r9 = r14.A00
            X.0KV r0 = X.AnonymousClass0KV.SUCCEEDED
            boolean r8 = X.AnonymousClass000.A1Y(r9, r0)
            r8 = r8 & r21
            X.0KV r0 = X.AnonymousClass0KV.FAILED
            if (r9 != r0) goto L_0x01e4
            r19 = 1
        L_0x01de:
            r10.add(r11)
            r21 = r8
            goto L_0x0192
        L_0x01e4:
            X.0KV r0 = X.AnonymousClass0KV.CANCELLED
            if (r9 != r0) goto L_0x01de
            r20 = 1
            goto L_0x01de
        L_0x01eb:
            X.03z r0 = X.AnonymousClass03z.APPEND_OR_REPLACE
            if (r3 != r0) goto L_0x026e
            if (r20 != 0) goto L_0x01f3
            if (r19 == 0) goto L_0x026e
        L_0x01f3:
            X.0lu r9 = r23.A0J()
            X.0dC r9 = (X.C08170dC) r9
            X.0cR r11 = X.AnonymousClass0M4.A00(r12, r4)
            if (r6 != 0) goto L_0x020e
            r11.A5R(r4)
        L_0x0202:
            X.0SM r8 = r9.A01
            r8.A09()
            r14 = 0
            r15 = 0
            android.database.Cursor r13 = X.AnonymousClass0M5.A00(r8, r11, r14)
            goto L_0x0212
        L_0x020e:
            r11.A5S(r4, r6)
            goto L_0x0202
        L_0x0212:
            java.util.ArrayList r12 = X.AnonymousClass000.A0v(r13)     // Catch:{ all -> 0x036d }
        L_0x0216:
            boolean r0 = r13.moveToNext()     // Catch:{ all -> 0x036d }
            if (r0 == 0) goto L_0x0235
            boolean r0 = r13.isNull(r14)     // Catch:{ all -> 0x036d }
            if (r0 == 0) goto L_0x0224
            r10 = r15
            goto L_0x0228
        L_0x0224:
            java.lang.String r10 = r13.getString(r14)     // Catch:{ all -> 0x036d }
        L_0x0228:
            X.0KV r3 = X.AnonymousClass0XK.A08(r13, r4)     // Catch:{ all -> 0x036d }
            X.0R6 r0 = new X.0R6     // Catch:{ all -> 0x036d }
            r0.<init>(r3, r10)     // Catch:{ all -> 0x036d }
            r12.add(r0)     // Catch:{ all -> 0x036d }
            goto L_0x0216
        L_0x0235:
            r13.close()
            r11.A01()
            java.util.Iterator r3 = r12.iterator()
        L_0x023f:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0266
            java.lang.Object r0 = r3.next()
            X.0R6 r0 = (X.AnonymousClass0R6) r0
            java.lang.String r0 = r0.A01
            r8.A09()
            X.0Rm r12 = r9.A02
            X.0mT r11 = r12.A00()
            r11.A5S(r4, r0)
            r8.A0A()
            X.AnonymousClass0GC.A00(r8, r11)     // Catch:{ all -> 0x0360 }
            r8.A0B()
            r12.A03(r11)
            goto L_0x023f
        L_0x0266:
            java.util.List r10 = java.util.Collections.emptyList()
            r20 = 0
            r19 = 0
        L_0x026e:
            java.lang.Object[] r7 = r10.toArray(r7)
            java.lang.String[] r7 = (java.lang.String[]) r7
            int r0 = r7.length
            boolean r17 = X.AnonymousClass000.A1Q(r0)
        L_0x0279:
            r8 = 0
        L_0x027a:
            java.util.Iterator r13 = r24.iterator()
        L_0x027e:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x009a
            java.lang.Object r9 = r13.next()
            X.03k r9 = (X.AnonymousClass03k) r9
            X.03i r10 = r9.A00
            if (r17 == 0) goto L_0x034f
            if (r21 != 0) goto L_0x034f
            if (r19 == 0) goto L_0x0345
            X.0KV r0 = X.AnonymousClass0KV.FAILED
        L_0x0294:
            r10.A0E = r0
        L_0x0296:
            X.0KV r3 = r10.A0E
            X.0KV r0 = X.AnonymousClass0KV.ENQUEUED
            if (r3 != r0) goto L_0x029d
            r8 = 1
        L_0x029d:
            X.0lu r4 = r23.A0J()
            r0 = r25
            java.util.List r0 = r0.A07
            X.03i r3 = A01(r10, r0)
            X.0dC r4 = (X.C08170dC) r4
            X.0SM r10 = r4.A01
            r10.A09()
            r10.A0A()
            X.0Fx r0 = r4.A00     // Catch:{ all -> 0x0375 }
            r0.A05(r3)     // Catch:{ all -> 0x0375 }
            r10.A0C()     // Catch:{ all -> 0x0375 }
            r10.A0B()
            if (r17 == 0) goto L_0x02eb
            int r12 = r7.length
            r11 = 0
        L_0x02c2:
            if (r11 >= r12) goto L_0x02eb
            r4 = r7[r11]
            java.lang.String r0 = r9.A00()
            X.0O4 r3 = new X.0O4
            r3.<init>(r0, r4)
            X.0kf r0 = r23.A0E()
            X.0d7 r0 = (X.C08120d7) r0
            X.0SM r10 = r0.A01
            r10.A09()
            r10.A0A()
            X.0Fx r0 = r0.A00     // Catch:{ all -> 0x0375 }
            r0.A05(r3)     // Catch:{ all -> 0x0375 }
            r10.A0C()     // Catch:{ all -> 0x0375 }
            r10.A0B()
            int r11 = r11 + 1
            goto L_0x02c2
        L_0x02eb:
            X.0kg r12 = r23.A0K()
            java.lang.String r11 = r9.A00()
            java.util.Set r0 = r9.A01
            java.util.Iterator r4 = r0.iterator()
        L_0x02f9:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x031f
            java.lang.String r0 = X.AnonymousClass000.A0m(r4)
            X.0O6 r3 = new X.0O6
            r3.<init>(r0, r11)
            r0 = r12
            X.0dD r0 = (X.C08180dD) r0
            X.0SM r10 = r0.A01
            r10.A09()
            r10.A0A()
            X.0Fx r0 = r0.A00     // Catch:{ all -> 0x0375 }
            r0.A05(r3)     // Catch:{ all -> 0x0375 }
            r10.A0C()     // Catch:{ all -> 0x0375 }
            r10.A0B()
            goto L_0x02f9
        L_0x031f:
            if (r18 == 0) goto L_0x027e
            X.0jq r4 = r23.A0H()
            java.lang.String r0 = r9.A00()
            X.0O5 r3 = new X.0O5
            r3.<init>(r6, r0)
            X.0dA r4 = (X.C08150dA) r4
            X.0SM r10 = r4.A01
            r10.A09()
            r10.A0A()
            X.0Fx r0 = r4.A00     // Catch:{ all -> 0x0375 }
            r0.A05(r3)     // Catch:{ all -> 0x0375 }
            r10.A0C()     // Catch:{ all -> 0x0375 }
            r10.A0B()
            goto L_0x027e
        L_0x0345:
            if (r20 == 0) goto L_0x034b
            X.0KV r0 = X.AnonymousClass0KV.CANCELLED
            goto L_0x0294
        L_0x034b:
            X.0KV r0 = X.AnonymousClass0KV.BLOCKED
            goto L_0x0294
        L_0x034f:
            r10.A06 = r1
            goto L_0x0296
        L_0x0353:
            r0 = move-exception
            r3.A0B()
            goto L_0x0364
        L_0x0358:
            r0 = move-exception
            r8.close()
            r13.A01()
            throw r0
        L_0x0360:
            r0 = move-exception
            r8.A0B()
        L_0x0364:
            r12.A03(r11)
            throw r0
        L_0x0368:
            r0 = move-exception
            r14.close()
            goto L_0x0371
        L_0x036d:
            r0 = move-exception
            r13.close()
        L_0x0371:
            r11.A01()
            throw r0
        L_0x0375:
            r0 = move-exception
            r10.A0B()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10660hU.A02(X.04Q):boolean");
    }

    public void run() {
        IllegalStateException th;
        WorkDatabase workDatabase;
        try {
            AnonymousClass04Q r2 = this.A01;
            if (!AnonymousClass04Q.A01(r2, new HashSet())) {
                AnonymousClass022 r4 = r2.A03;
                workDatabase = r4.A04;
                workDatabase.A0A();
                boolean A022 = A02(r2);
                workDatabase.A0C();
                workDatabase.A0B();
                if (A022) {
                    AnonymousClass0TB.A00(r4.A01, RescheduleReceiver.class, true);
                    C06310Vf.A01(r4.A02, workDatabase, r4.A07);
                }
                this.A00.A00(C13470m5.A01);
                return;
            }
            StringBuilder A0o = AnonymousClass000.A0o();
            A0o.append("WorkContinuation has cycles (");
            A0o.append(r2);
            th = AnonymousClass000.A0V(AnonymousClass000.A0h(")", A0o));
            throw th;
        } catch (Throwable th2) {
            this.A00.A00(new C02930Gh(th2));
        }
    }
}
