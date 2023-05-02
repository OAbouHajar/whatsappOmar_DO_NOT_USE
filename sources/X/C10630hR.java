package X;

import android.content.Context;
import android.database.Cursor;
import android.util.Log;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Executor;

/* renamed from: X.0hR  reason: invalid class name and case insensitive filesystem */
public class C10630hR implements Runnable {
    public static final String A0I = C06530Wm.A01("WorkerWrapper");
    public Context A00;
    public AnonymousClass0Pz A01;
    public AnonymousClass02Q A02 = new C02890Gc();
    public AnonymousClass02O A03;
    public AnonymousClass0OP A04;
    public WorkDatabase A05;
    public C12080jo A06;
    public C12600kf A07;
    public C007303i A08;
    public C13360lu A09;
    public AnonymousClass0H9 A0A = AnonymousClass0H9.A00();
    public AnonymousClass04d A0B;
    public String A0C;
    public List A0D;
    public List A0E;
    public final AnonymousClass0H9 A0F = AnonymousClass0H9.A00();
    public final String A0G;
    public volatile boolean A0H;

    public C10630hR(AnonymousClass0P8 r2) {
        this.A00 = r2.A00;
        this.A0B = r2.A06;
        this.A06 = r2.A04;
        C007303i r0 = r2.A05;
        this.A08 = r0;
        this.A0G = r0.A0J;
        this.A0D = r2.A07;
        this.A04 = r2.A02;
        this.A03 = null;
        this.A01 = r2.A01;
        WorkDatabase workDatabase = r2.A03;
        this.A05 = workDatabase;
        this.A09 = workDatabase.A0J();
        this.A07 = this.A05.A0E();
        this.A0E = r2.A08;
    }

    public static /* synthetic */ void A00(C10630hR r0, C29981bY r1) {
        if (r0.A0F.isCancelled()) {
            r1.cancel(true);
        }
    }

    public C29981bY A01() {
        return this.A0A;
    }

    public void A02() {
        this.A0H = true;
        A08();
        AnonymousClass0H9 r1 = this.A0F;
        r1.cancel(true);
        if (this.A03 == null || !r1.isCancelled()) {
            StringBuilder A0r = AnonymousClass000.A0r("WorkSpec ");
            A0r.append(this.A08);
            C06530Wm.A00().A02(A0I, AnonymousClass000.A0h(" is already done. Not interrupting.", A0r));
            return;
        }
        AnonymousClass02O r12 = this.A03;
        r12.A03 = true;
        r12.A03();
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01be, code lost:
        if (r4.A00() == false) goto L_0x01c0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03() {
        /*
            r14 = this;
            boolean r0 = r14.A08()
            if (r0 != 0) goto L_0x0231
            androidx.work.impl.WorkDatabase r7 = r14.A05
            r7.A0A()
            X.0lu r9 = r14.A09     // Catch:{ all -> 0x0229 }
            java.lang.String r8 = r14.A0G     // Catch:{ all -> 0x0229 }
            X.0KV r4 = r9.AGF(r8)     // Catch:{ all -> 0x0229 }
            X.0jr r0 = r7.A0I()     // Catch:{ all -> 0x0229 }
            X.0dB r0 = (X.C08160dB) r0     // Catch:{ all -> 0x0229 }
            X.0SM r3 = r0.A01     // Catch:{ all -> 0x0229 }
            r3.A09()     // Catch:{ all -> 0x0229 }
            X.0Rm r2 = r0.A02     // Catch:{ all -> 0x0229 }
            X.0mT r1 = r2.A00()     // Catch:{ all -> 0x0229 }
            r0 = 1
            r1.A5S(r0, r8)     // Catch:{ all -> 0x0229 }
            r3.A0A()     // Catch:{ all -> 0x0229 }
            X.AnonymousClass0GC.A00(r3, r1)     // Catch:{ all -> 0x0219 }
            r3.A0B()     // Catch:{ all -> 0x0229 }
            r2.A03(r1)     // Catch:{ all -> 0x0229 }
            if (r4 != 0) goto L_0x003c
            r0 = 0
            r14.A07(r0)     // Catch:{ all -> 0x0229 }
            goto L_0x0215
        L_0x003c:
            X.0KV r0 = X.AnonymousClass0KV.RUNNING     // Catch:{ all -> 0x0229 }
            if (r4 != r0) goto L_0x01ba
            X.02Q r1 = r14.A02     // Catch:{ all -> 0x0229 }
            boolean r0 = r1 instanceof X.C02900Gd     // Catch:{ all -> 0x0229 }
            if (r0 == 0) goto L_0x0108
            X.C06530Wm.A00()     // Catch:{ all -> 0x0229 }
            java.lang.String r10 = A0I     // Catch:{ all -> 0x0229 }
            java.lang.String r0 = "Worker result SUCCESS for "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)     // Catch:{ all -> 0x0229 }
            java.lang.String r0 = r14.A0C     // Catch:{ all -> 0x0229 }
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)     // Catch:{ all -> 0x0229 }
            android.util.Log.i(r10, r0)     // Catch:{ all -> 0x0229 }
            X.03i r0 = r14.A08     // Catch:{ all -> 0x0229 }
            long r0 = r0.A05     // Catch:{ all -> 0x0229 }
            r3 = 0
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x0140
            r7.A0A()     // Catch:{ all -> 0x0229 }
            r6 = 0
            X.0KV r0 = X.AnonymousClass0KV.SUCCEEDED     // Catch:{ all -> 0x0207 }
            r9.Aeh(r0, r8)     // Catch:{ all -> 0x0207 }
            X.02Q r0 = r14.A02     // Catch:{ all -> 0x0207 }
            X.0Gd r0 = (X.C02900Gd) r0     // Catch:{ all -> 0x0207 }
            X.03h r0 = r0.A00     // Catch:{ all -> 0x0207 }
            r9.AeF(r0, r8)     // Catch:{ all -> 0x0207 }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0207 }
            X.0kf r5 = r14.A07     // Catch:{ all -> 0x0207 }
            java.util.List r2 = r5.ABk(r8)     // Catch:{ all -> 0x0207 }
            java.util.Iterator r13 = r2.iterator()     // Catch:{ all -> 0x0207 }
        L_0x0084:
            boolean r2 = r13.hasNext()     // Catch:{ all -> 0x0207 }
            if (r2 == 0) goto L_0x01f3
            java.lang.String r8 = X.AnonymousClass000.A0m(r13)     // Catch:{ all -> 0x0207 }
            X.0KV r3 = r9.AGF(r8)     // Catch:{ all -> 0x0207 }
            X.0KV r2 = X.AnonymousClass0KV.BLOCKED     // Catch:{ all -> 0x0207 }
            if (r3 != r2) goto L_0x0084
            r3 = r5
            X.0d7 r3 = (X.C08120d7) r3     // Catch:{ all -> 0x0207 }
            java.lang.String r2 = "SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)"
            r12 = 1
            X.0cR r11 = X.AnonymousClass0M4.A00(r2, r12)     // Catch:{ all -> 0x0207 }
            if (r8 != 0) goto L_0x00fb
            r11.A5R(r12)     // Catch:{ all -> 0x0207 }
        L_0x00a5:
            X.0SM r2 = r3.A01     // Catch:{ all -> 0x0207 }
            r2.A09()     // Catch:{ all -> 0x0207 }
            r4 = 0
            android.database.Cursor r3 = X.AnonymousClass0M5.A00(r2, r11, r6)     // Catch:{ all -> 0x0207 }
            boolean r2 = r3.moveToFirst()     // Catch:{ all -> 0x00ff }
            if (r2 == 0) goto L_0x00bd
            int r2 = r3.getInt(r6)     // Catch:{ all -> 0x00ff }
            if (r2 != 0) goto L_0x00bc
            r12 = 0
        L_0x00bc:
            r4 = r12
        L_0x00bd:
            r3.close()     // Catch:{ all -> 0x0207 }
            r11.A01()     // Catch:{ all -> 0x0207 }
            if (r4 == 0) goto L_0x0084
            X.C06530Wm.A00()     // Catch:{ all -> 0x0207 }
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0o()     // Catch:{ all -> 0x0207 }
            java.lang.String r2 = "Setting status to enqueued for "
            r3.append(r2)     // Catch:{ all -> 0x0207 }
            java.lang.String r2 = X.AnonymousClass000.A0h(r8, r3)     // Catch:{ all -> 0x0207 }
            android.util.Log.i(r10, r2)     // Catch:{ all -> 0x0207 }
            X.0KV r2 = X.AnonymousClass0KV.ENQUEUED     // Catch:{ all -> 0x0207 }
            r9.Aeh(r2, r8)     // Catch:{ all -> 0x0207 }
            r2 = r9
            X.0dC r2 = (X.C08170dC) r2     // Catch:{ all -> 0x0207 }
            X.0SM r4 = r2.A01     // Catch:{ all -> 0x0207 }
            r4.A09()     // Catch:{ all -> 0x0207 }
            X.0Rm r3 = r2.A0A     // Catch:{ all -> 0x0207 }
            X.0mT r2 = r3.A00()     // Catch:{ all -> 0x0207 }
            X.AnonymousClass000.A16(r2, r8, r0)     // Catch:{ all -> 0x0207 }
            r4.A0A()     // Catch:{ all -> 0x0207 }
            X.AnonymousClass0GC.A00(r4, r2)     // Catch:{ all -> 0x01ff }
            r4.A0B()     // Catch:{ all -> 0x0207 }
            r3.A03(r2)     // Catch:{ all -> 0x0207 }
            goto L_0x0084
        L_0x00fb:
            r11.A5S(r12, r8)     // Catch:{ all -> 0x0207 }
            goto L_0x00a5
        L_0x00ff:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0207 }
            r11.A01()     // Catch:{ all -> 0x0207 }
            goto L_0x0206
        L_0x0108:
            boolean r0 = r1 instanceof X.AnonymousClass02P     // Catch:{ all -> 0x0229 }
            X.C06530Wm.A00()     // Catch:{ all -> 0x0229 }
            java.lang.String r2 = A0I     // Catch:{ all -> 0x0229 }
            if (r0 == 0) goto L_0x0122
            java.lang.String r0 = "Worker result RETRY for "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)     // Catch:{ all -> 0x0229 }
            java.lang.String r0 = r14.A0C     // Catch:{ all -> 0x0229 }
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)     // Catch:{ all -> 0x0229 }
            android.util.Log.i(r2, r0)     // Catch:{ all -> 0x0229 }
            goto L_0x01c0
        L_0x0122:
            java.lang.String r0 = "Worker result FAILURE for "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)     // Catch:{ all -> 0x0229 }
            java.lang.String r0 = r14.A0C     // Catch:{ all -> 0x0229 }
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)     // Catch:{ all -> 0x0229 }
            android.util.Log.i(r2, r0)     // Catch:{ all -> 0x0229 }
            X.03i r0 = r14.A08     // Catch:{ all -> 0x0229 }
            long r1 = r0.A05     // Catch:{ all -> 0x0229 }
            r3 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0140
            r14.A04()     // Catch:{ all -> 0x0229 }
            goto L_0x0215
        L_0x0140:
            r7.A0A()     // Catch:{ all -> 0x0229 }
            r3 = 0
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0221 }
            r6 = r9
            X.0dC r6 = (X.C08170dC) r6     // Catch:{ all -> 0x0221 }
            X.0SM r5 = r6.A01     // Catch:{ all -> 0x0221 }
            r5.A09()     // Catch:{ all -> 0x0221 }
            X.0Rm r4 = r6.A0A     // Catch:{ all -> 0x0221 }
            X.0mT r2 = r4.A00()     // Catch:{ all -> 0x0221 }
            X.AnonymousClass000.A16(r2, r8, r0)     // Catch:{ all -> 0x0221 }
            r5.A0A()     // Catch:{ all -> 0x0221 }
            X.AnonymousClass0GC.A00(r5, r2)     // Catch:{ all -> 0x01aa }
            r5.A0B()     // Catch:{ all -> 0x0221 }
            r4.A03(r2)     // Catch:{ all -> 0x0221 }
            X.0KV r0 = X.AnonymousClass0KV.ENQUEUED     // Catch:{ all -> 0x0221 }
            r9.Aeh(r0, r8)     // Catch:{ all -> 0x0221 }
            r5.A09()     // Catch:{ all -> 0x0221 }
            X.0Rm r2 = r6.A09     // Catch:{ all -> 0x0221 }
            X.0mT r1 = r2.A00()     // Catch:{ all -> 0x0221 }
            r0 = 1
            r1.A5S(r0, r8)     // Catch:{ all -> 0x0221 }
            r5.A0A()     // Catch:{ all -> 0x0221 }
            X.AnonymousClass0GC.A00(r5, r1)     // Catch:{ all -> 0x01b2 }
            r5.A0B()     // Catch:{ all -> 0x0221 }
            r2.A03(r1)     // Catch:{ all -> 0x0221 }
            r5.A09()     // Catch:{ all -> 0x0221 }
            X.0Rm r2 = r6.A04     // Catch:{ all -> 0x0221 }
            X.0mT r1 = r2.A00()     // Catch:{ all -> 0x0221 }
            r1.A5S(r0, r8)     // Catch:{ all -> 0x0221 }
            r5.A0A()     // Catch:{ all -> 0x0221 }
            X.AnonymousClass0GC.A00(r5, r1)     // Catch:{ all -> 0x01b2 }
            r5.A0B()     // Catch:{ all -> 0x0221 }
            r2.A03(r1)     // Catch:{ all -> 0x0221 }
            r0 = -1
            r9.AKf(r8, r0)     // Catch:{ all -> 0x0221 }
            r7.A0C()     // Catch:{ all -> 0x0221 }
            r7.A0B()     // Catch:{ all -> 0x0229 }
            r14.A07(r3)     // Catch:{ all -> 0x0229 }
            goto L_0x0215
        L_0x01aa:
            r0 = move-exception
            r5.A0B()     // Catch:{ all -> 0x0221 }
            r4.A03(r2)     // Catch:{ all -> 0x0221 }
            goto L_0x01b9
        L_0x01b2:
            r0 = move-exception
            r5.A0B()     // Catch:{ all -> 0x0221 }
            r2.A03(r1)     // Catch:{ all -> 0x0221 }
        L_0x01b9:
            throw r0     // Catch:{ all -> 0x0221 }
        L_0x01ba:
            boolean r0 = r4.A00()     // Catch:{ all -> 0x0229 }
            if (r0 != 0) goto L_0x0215
        L_0x01c0:
            r7.A0A()     // Catch:{ all -> 0x0229 }
            r6 = 1
            X.0KV r0 = X.AnonymousClass0KV.ENQUEUED     // Catch:{ all -> 0x0207 }
            r9.Aeh(r0, r8)     // Catch:{ all -> 0x0207 }
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0207 }
            r0 = r9
            X.0dC r0 = (X.C08170dC) r0     // Catch:{ all -> 0x0207 }
            X.0SM r3 = r0.A01     // Catch:{ all -> 0x0207 }
            r3.A09()     // Catch:{ all -> 0x0207 }
            X.0Rm r2 = r0.A0A     // Catch:{ all -> 0x0207 }
            X.0mT r1 = r2.A00()     // Catch:{ all -> 0x0207 }
            r1.A5Q(r6, r4)     // Catch:{ all -> 0x0207 }
            r0 = 2
            r1.A5S(r0, r8)     // Catch:{ all -> 0x0207 }
            r3.A0A()     // Catch:{ all -> 0x0207 }
            X.AnonymousClass0GC.A00(r3, r1)     // Catch:{ all -> 0x01f7 }
            r3.A0B()     // Catch:{ all -> 0x0207 }
            r2.A03(r1)     // Catch:{ all -> 0x0207 }
            r0 = -1
            r9.AKf(r8, r0)     // Catch:{ all -> 0x0207 }
        L_0x01f3:
            r7.A0C()     // Catch:{ all -> 0x0207 }
            goto L_0x020f
        L_0x01f7:
            r0 = move-exception
            r3.A0B()     // Catch:{ all -> 0x0207 }
            r2.A03(r1)     // Catch:{ all -> 0x0207 }
            goto L_0x0206
        L_0x01ff:
            r0 = move-exception
            r4.A0B()     // Catch:{ all -> 0x0207 }
            r3.A03(r2)     // Catch:{ all -> 0x0207 }
        L_0x0206:
            throw r0     // Catch:{ all -> 0x0207 }
        L_0x0207:
            r0 = move-exception
            r7.A0B()     // Catch:{ all -> 0x0229 }
            r14.A07(r6)     // Catch:{ all -> 0x0229 }
            goto L_0x0228
        L_0x020f:
            r7.A0B()     // Catch:{ all -> 0x0229 }
            r14.A07(r6)     // Catch:{ all -> 0x0229 }
        L_0x0215:
            r7.A0C()     // Catch:{ all -> 0x0229 }
            goto L_0x022e
        L_0x0219:
            r0 = move-exception
            r3.A0B()     // Catch:{ all -> 0x0229 }
            r2.A03(r1)     // Catch:{ all -> 0x0229 }
            goto L_0x0228
        L_0x0221:
            r0 = move-exception
            r7.A0B()     // Catch:{ all -> 0x0229 }
            r14.A07(r3)     // Catch:{ all -> 0x0229 }
        L_0x0228:
            throw r0     // Catch:{ all -> 0x0229 }
        L_0x0229:
            r0 = move-exception
            r7.A0B()
            throw r0
        L_0x022e:
            r7.A0B()
        L_0x0231:
            java.util.List r3 = r14.A0D
            if (r3 == 0) goto L_0x0252
            java.util.Iterator r2 = r3.iterator()
        L_0x0239:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x024b
            java.lang.Object r1 = r2.next()
            X.0lf r1 = (X.C13220lf) r1
            java.lang.String r0 = r14.A0G
            r1.A61(r0)
            goto L_0x0239
        L_0x024b:
            X.0Pz r1 = r14.A01
            androidx.work.impl.WorkDatabase r0 = r14.A05
            X.C06310Vf.A01(r1, r0, r3)
        L_0x0252:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10630hR.A03():void");
    }

    public void A04() {
        WorkDatabase workDatabase = this.A05;
        workDatabase.A0A();
        try {
            String str = this.A0G;
            LinkedList linkedList = new LinkedList();
            linkedList.add(str);
            while (!linkedList.isEmpty()) {
                String str2 = (String) linkedList.remove();
                C13360lu r2 = this.A09;
                if (r2.AGF(str2) != AnonymousClass0KV.CANCELLED) {
                    r2.Aeh(AnonymousClass0KV.FAILED, str2);
                }
                linkedList.addAll(this.A07.ABk(str2));
            }
            this.A09.AeF(((C02890Gc) this.A02).A00, str);
            workDatabase.A0C();
        } finally {
            workDatabase.A0B();
            A07(false);
        }
    }

    public final void A05() {
        boolean z2;
        C13360lu r0 = this.A09;
        String str = this.A0G;
        AnonymousClass0KV AGF = r0.AGF(str);
        AnonymousClass0KV r4 = AnonymousClass0KV.RUNNING;
        C06530Wm A002 = C06530Wm.A00();
        String str2 = A0I;
        StringBuilder A0q = AnonymousClass000.A0q("Status for ");
        if (AGF == r4) {
            A0q.append(str);
            A002.A02(str2, AnonymousClass000.A0h(" is RUNNING; not doing any work and rescheduling for later execution", A0q));
            z2 = true;
        } else {
            A0q.append(str);
            A0q.append(" is ");
            A0q.append(AGF);
            A002.A02(str2, AnonymousClass000.A0h(" ; not doing any work", A0q));
            z2 = false;
        }
        A07(z2);
    }

    /* JADX INFO: finally extract failed */
    public final void A06() {
        String str;
        StringBuilder A0r;
        String str2;
        C007203h A032;
        boolean z2;
        AnonymousClass0SM r7;
        C05450Rm r5;
        C13500mT A002;
        if (!A08()) {
            WorkDatabase workDatabase = this.A05;
            workDatabase.A0A();
            try {
                C007303i r3 = this.A08;
                AnonymousClass0KV r1 = r3.A0E;
                AnonymousClass0KV r52 = AnonymousClass0KV.ENQUEUED;
                if (r1 != r52) {
                    A05();
                    workDatabase.A0C();
                    C06530Wm A003 = C06530Wm.A00();
                    String str3 = A0I;
                    StringBuilder A0o = AnonymousClass000.A0o();
                    A0o.append(r3.A0G);
                    A003.A02(str3, AnonymousClass000.A0h(" is not in ENQUEUED state. Nothing more to do", A0o));
                } else if ((r3.A05 != 0 || (r1 == r52 && r3.A01 > 0)) && System.currentTimeMillis() < r3.A02()) {
                    C06530Wm.A00().A02(A0I, String.format("Delaying execution for %s because it is being executed before schedule.", new Object[]{r3.A0G}));
                    A07(true);
                    workDatabase.A0C();
                } else {
                    workDatabase.A0C();
                    workDatabase.A0B();
                    if (r3.A05 != 0) {
                        A032 = r3.A0B;
                    } else {
                        String str4 = r3.A0F;
                        try {
                            AnonymousClass0UK r11 = (AnonymousClass0UK) Class.forName(str4).newInstance();
                            if (r11 != null) {
                                ArrayList A0u = AnonymousClass000.A0u();
                                A0u.add(r3.A0B);
                                C13360lu r72 = this.A09;
                                String str5 = this.A0G;
                                C07770cR A004 = AnonymousClass0M4.A00("SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", 1);
                                A004.A5S(1, str5);
                                AnonymousClass0SM r0 = ((C08170dC) r72).A01;
                                r0.A09();
                                Cursor A005 = AnonymousClass0M5.A00(r0, A004, false);
                                try {
                                    ArrayList A0v = AnonymousClass000.A0v(A005);
                                    while (A005.moveToNext()) {
                                        A0v.add(C007203h.A00(A005.isNull(0) ? null : A005.getBlob(0)));
                                    }
                                    A005.close();
                                    A004.A01();
                                    A0u.addAll(A0v);
                                    A032 = r11.A03(A0u);
                                } catch (Throwable th) {
                                    A005.close();
                                    A004.A01();
                                    throw th;
                                }
                            }
                        } catch (Exception e2) {
                            C06530Wm.A00();
                            Log.e(AnonymousClass0UK.A00, AnonymousClass000.A0h(str4, AnonymousClass000.A0r("Trouble instantiating + ")), e2);
                        }
                        C06530Wm.A00();
                        str = A0I;
                        A0r = AnonymousClass000.A0r("Could not create Input Merger ");
                        str2 = r3.A0F;
                        Log.e(str, AnonymousClass000.A0h(str2, A0r));
                        A04();
                        return;
                    }
                    String str6 = this.A0G;
                    UUID fromString = UUID.fromString(str6);
                    List list = this.A0E;
                    AnonymousClass0OP r13 = this.A04;
                    int i2 = r3.A01;
                    AnonymousClass0Pz r73 = this.A01;
                    Executor executor = r73.A05;
                    AnonymousClass04d r14 = this.A0B;
                    AnonymousClass0UL r12 = r73.A04;
                    WorkerParameters workerParameters = new WorkerParameters(A032, new C08010ct(workDatabase, this.A06, r14), new C08030cv(workDatabase, r14), r12, r13, r14, list, fromString, executor, i2);
                    AnonymousClass02O r15 = this.A03;
                    if (r15 == null) {
                        Context context = this.A00;
                        str2 = r3.A0G;
                        r15 = r12.A00(context, workerParameters, str2);
                        this.A03 = r15;
                        if (r15 == null) {
                            C06530Wm.A00();
                            str = A0I;
                            A0r = AnonymousClass000.A0r("Could not create Worker ");
                            Log.e(str, AnonymousClass000.A0h(str2, A0r));
                            A04();
                            return;
                        }
                    }
                    if (r15.A02) {
                        C06530Wm.A00();
                        str = A0I;
                        A0r = AnonymousClass000.A0r("Received an already-used Worker ");
                        A0r.append(r3.A0G);
                        str2 = "; Worker Factory should return new instances";
                        Log.e(str, AnonymousClass000.A0h(str2, A0r));
                        A04();
                        return;
                    }
                    r15.A02 = true;
                    workDatabase.A0A();
                    C13360lu r16 = this.A09;
                    if (r16.AGF(str6) == r52) {
                        r16.Aeh(AnonymousClass0KV.RUNNING, str6);
                        C08170dC r17 = (C08170dC) r16;
                        r7 = r17.A01;
                        r7.A09();
                        r5 = r17.A05;
                        A002 = r5.A00();
                        z2 = true;
                        A002.A5S(1, str6);
                        r7.A0A();
                        AnonymousClass0GC.A00(r7, A002);
                        r7.A0B();
                        r5.A03(A002);
                    } else {
                        z2 = false;
                    }
                    workDatabase.A0C();
                    workDatabase.A0B();
                    if (!z2) {
                        A05();
                        return;
                    } else if (!A08()) {
                        C10650hT r4 = new C10650hT(this.A00, workerParameters.A02, this.A03, r3, r14);
                        C08190dE r142 = (C08190dE) r14;
                        Executor executor2 = r142.A02;
                        executor2.execute(r4);
                        C29981bY A022 = r4.A02();
                        AnonymousClass0H9 r32 = this.A0F;
                        r32.A4b(new C09960gM(this, A022), new C10820hk());
                        A022.A4b(new C09970gN(this, A022), executor2);
                        r32.A4b(new C09980gO(this, this.A0C), r142.A01);
                        return;
                    } else {
                        return;
                    }
                }
                workDatabase.A0B();
            } catch (Throwable th2) {
                workDatabase.A0B();
                throw th2;
            }
        }
    }

    public final void A07(boolean z2) {
        Map map;
        boolean containsKey;
        WorkDatabase workDatabase = this.A05;
        workDatabase.A0A();
        boolean z3 = false;
        C07770cR A002 = AnonymousClass0M4.A00("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1", 0);
        AnonymousClass0SM r0 = ((C08170dC) workDatabase.A0J()).A01;
        r0.A09();
        Cursor A003 = AnonymousClass0M5.A00(r0, A002, false);
        try {
            if (A003.moveToFirst() && A003.getInt(0) != 0) {
                z3 = true;
            }
            A003.close();
            A002.A01();
            if (!z3) {
                AnonymousClass0TB.A00(this.A00, RescheduleReceiver.class, false);
            }
            if (z2) {
                C13360lu r3 = this.A09;
                AnonymousClass0KV r02 = AnonymousClass0KV.ENQUEUED;
                String str = this.A0G;
                r3.Aeh(r02, str);
                r3.AKf(str, -1);
            }
            if (this.A03 != null) {
                C12080jo r4 = this.A06;
                String str2 = this.A0G;
                C08080d0 r42 = (C08080d0) r4;
                Object obj = r42.A0A;
                synchronized (obj) {
                    try {
                        map = r42.A07;
                        containsKey = map.containsKey(str2);
                    } catch (Throwable th) {
                        while (true) {
                            th = th;
                            break;
                        }
                    }
                }
                if (containsKey) {
                    synchronized (obj) {
                        try {
                            map.remove(str2);
                            r42.A01();
                        } catch (Throwable th2) {
                            th = th2;
                            throw th;
                        }
                    }
                }
            }
            workDatabase.A0C();
            workDatabase.A0B();
            this.A0A.A09(Boolean.valueOf(z2));
        } catch (Throwable th3) {
            workDatabase.A0B();
            throw th3;
        }
    }

    public final boolean A08() {
        if (!this.A0H) {
            return false;
        }
        C06530Wm.A00().A02(A0I, AnonymousClass000.A0h(this.A0C, AnonymousClass000.A0r("Work interrupted for ")));
        AnonymousClass0KV AGF = this.A09.AGF(this.A0G);
        if (AGF == null) {
            A07(false);
            return true;
        }
        A07(!AGF.A00());
        return true;
    }

    public void run() {
        List list = this.A0E;
        StringBuilder A0r = AnonymousClass000.A0r("Work [ id=");
        A0r.append(this.A0G);
        A0r.append(", tags={ ");
        Iterator it = list.iterator();
        boolean z2 = true;
        while (it.hasNext()) {
            String A0m = AnonymousClass000.A0m(it);
            if (z2) {
                z2 = false;
            } else {
                A0r.append(", ");
            }
            A0r.append(A0m);
        }
        this.A0C = AnonymousClass000.A0h(" } ]", A0r);
        A06();
    }
}
