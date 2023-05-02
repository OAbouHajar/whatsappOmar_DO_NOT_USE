package X;

import com.facebook.redex.RunnableRunnableShape8S0100000_I0_7;
import com.obwhatsapp.data.IDxMObserverShape74S0100000_2_I0;
import com.whatsapp.util.Log;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.11K  reason: invalid class name */
public class AnonymousClass11K {
    public C18940xV A00;
    public ScheduledFuture A01;
    public final C16000sG A02;
    public final C17120uZ A03;
    public final C15810rt A04;
    public final AnonymousClass17R A05;
    public final AnonymousClass2Fm A06;
    public final AnonymousClass2Fn A07;
    public final AnonymousClass2Fn A08;
    public final C19150xq A09;
    public final ScheduledThreadPoolExecutor A0A;

    public AnonymousClass11K(C16300so r18, C16000sG r19, C16440t3 r20, C17120uZ r21, C16920ts r22, C15810rt r23, C16460t6 r24, AnonymousClass182 r25, AnonymousClass17R r26, AnonymousClass17E r27, C27681Ss r28, C19150xq r29, AnonymousClass16V r30, AnonymousClass180 r31, C14710pd r32, C16320sq r33) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        C16320sq r2 = r33;
        if (r32.A0E(C16620tM.A02, 2335)) {
            scheduledThreadPoolExecutor = new C46682Fl((C23291Bk) r2, new C46672Fk("ephemeral-update"));
        } else {
            scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
            scheduledThreadPoolExecutor.setKeepAliveTime(10, TimeUnit.MILLISECONDS);
        }
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.A00 = new IDxMObserverShape74S0100000_2_I0(this, 5);
        AnonymousClass17R r10 = r26;
        this.A05 = r10;
        AnonymousClass2Fm r11 = new AnonymousClass2Fm(this);
        this.A06 = r11;
        this.A09 = r29;
        this.A04 = r23;
        this.A02 = r19;
        AnonymousClass16V r14 = r30;
        C27681Ss r13 = r28;
        C16440t3 r6 = r20;
        AnonymousClass180 r15 = r31;
        C16300so r5 = r18;
        C16920ts r7 = r22;
        C16460t6 r8 = r24;
        AnonymousClass182 r9 = r25;
        AnonymousClass17E r12 = r27;
        this.A07 = new AnonymousClass2Fn(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, 100);
        this.A08 = new AnonymousClass2Fn(r5, r6, r7, r8, r9, r10, (AnonymousClass2Fm) null, r12, r13, r14, r15, 0);
        this.A03 = r21;
        this.A0A = scheduledThreadPoolExecutor;
    }

    public void A00() {
        this.A0A.execute(new RunnableRunnableShape8S0100000_I0_7(this, 36));
    }

    public final synchronized void A01(AnonymousClass2Fn r6, long j2, boolean z2) {
        long j3 = 0;
        if (j2 != 0) {
            j3 = Math.max(AnonymousClass1NO.A0L, j2);
        }
        ScheduledFuture scheduledFuture = this.A01;
        if (scheduledFuture != null && !scheduledFuture.isDone() && this.A01.getDelay(TimeUnit.MILLISECONDS) > j3 && !this.A01.cancel(false)) {
            Log.e("EphemeralUpdateManager/scheduleRunnable/unable to cancel future");
        }
        if (j3 < 86400000) {
            ScheduledFuture<?> schedule = this.A0A.schedule(r6, j3, TimeUnit.MILLISECONDS);
            this.A01 = schedule;
            if (z2) {
                try {
                    schedule.get();
                } catch (InterruptedException | ExecutionException e2) {
                    Log.e("EphemeralUpdateManager/scheduleNextRun", e2);
                }
            }
        }
        return;
    }

    public void A02(C15830rv r7, String str) {
        AnonymousClass17R r5 = this.A05;
        if (r5.A00 == -1) {
            r5.A00 = r5.A01.A00();
        }
        Map map = r5.A03;
        Set set = (Set) map.get(r7);
        if (set == null) {
            set = new HashSet();
        }
        set.add(str);
        map.put(r7, set);
    }

    public void A03(C15830rv r5, String str) {
        AnonymousClass17R r3 = this.A05;
        Map map = r3.A03;
        Set set = (Set) map.get(r5);
        if (set != null) {
            set.remove(str);
            if (set.isEmpty()) {
                map.remove(r5);
            }
        } else {
            StringBuilder sb = new StringBuilder("EphemeralSessionManager/null session: ");
            sb.append(r5);
            Log.e(sb.toString());
        }
        if (map.isEmpty()) {
            r3.A00 = -1;
        }
        if (r5 != null) {
            C15840rx A062 = r3.A02.A04.A06(r5);
            if (A062 == null) {
                StringBuilder sb2 = new StringBuilder("msgstore/last/message/no chat for ");
                sb2.append(r5);
                Log.w(sb2.toString());
                return;
            }
            C16740tZ r1 = A062.A0Z;
            if (r1 == null) {
                return;
            }
            if (r1.A04 <= 0 && !C30921dB.A00(r1.A10)) {
                return;
            }
        }
        A00();
    }
}
