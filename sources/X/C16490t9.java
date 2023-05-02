package X;

import android.content.SharedPreferences;
import com.facebook.redex.RunnableRunnableShape0S0110000_I0;
import com.facebook.redex.RunnableRunnableShape0S0111000_I0;
import com.facebook.redex.RunnableRunnableShape0S0201000_I0;
import com.facebook.redex.RunnableRunnableShape9S0100000_I0_8;
import com.whatsapp.fieldstats.events.WamCall;
import com.whatsapp.util.Log;
import java.util.Random;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.0t9  reason: invalid class name and case insensitive filesystem */
public class C16490t9 {
    public int A00;
    public C29171a9 A01;
    public C29171a9 A02;
    public C29171a9 A03;
    public C29161a8 A04;
    public C29161a8 A05;
    public C29161a8 A06;
    public C19140xp A07;
    public C19140xp A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public final C15860rz A0D;
    public final C14710pd A0E;
    public final AnonymousClass1CL A0F;
    public final AnonymousClass1CI A0G;
    public final C226318r A0H;
    public final AnonymousClass1CK A0I;
    public final AnonymousClass1CJ A0J;
    public final CountDownLatch A0K = new CountDownLatch(1);
    public final CountDownLatch A0L = new CountDownLatch(1);
    public final CountDownLatch A0M = new CountDownLatch(1);
    public volatile int A0N;
    public volatile boolean A0O;
    public volatile boolean A0P;
    public volatile boolean A0Q;

    public C16490t9(C15860rz r3, C14710pd r4, AnonymousClass1CL r5, AnonymousClass1CI r6, C226318r r7, AnonymousClass1CK r8, AnonymousClass1CJ r9) {
        this.A0E = r4;
        this.A0G = r6;
        this.A0J = r9;
        this.A0I = r8;
        this.A0H = r7;
        this.A0D = r3;
        this.A0F = r5;
        this.A0Q = false;
        this.A0O = false;
        this.A0P = false;
    }

    public final Integer A00(AnonymousClass00F r10, int i2, boolean z2) {
        SharedPreferences sharedPreferences;
        AnonymousClass00F r3 = r10;
        AnonymousClass1CL r2 = this.A0F;
        synchronized (r2) {
            sharedPreferences = r2.A00;
            if (sharedPreferences == null) {
                sharedPreferences = r2.A01.A00("field-stats-events-sampling");
                r2.A00 = sharedPreferences;
            }
        }
        int i3 = sharedPreferences.getInt(String.valueOf(i2), 0);
        if (i3 != 0) {
            int abs = Math.abs(i3);
            r3 = new AnonymousClass00F(false, abs, abs, abs, abs);
        } else {
            i3 = r10.A03;
            if (z2) {
                i3 = -i3;
            }
        }
        if (r3.A00()) {
            return Integer.valueOf(i3);
        }
        return null;
    }

    public void A01() {
        this.A0J.A01.execute(new RunnableRunnableShape9S0100000_I0_8(this, 8));
    }

    public final void A02() {
        if (this.A04.A00() > this.A02.A04.A7h().A04.A05.remaining() && !this.A02.A04.A7h().A06()) {
            if (this.A02.A04.A5v()) {
                this.A02.A02();
                this.A0I.A09();
                this.A04.A01();
            } else {
                A0D("no space in buffer for more events");
                return;
            }
        }
        if (this.A04.A00() > this.A02.A00()) {
            Log.e("wamruntime/logPrivateStatsEventInternal: dropping event because it is larger than the buffer itself");
            return;
        }
        C29171a9 r2 = this.A02;
        C29161a8 r0 = this.A04;
        r2.A03(r0.A00, r0.A01);
        AnonymousClass1CK r22 = this.A0I;
        r22.A0K = Long.valueOf(this.A02.A04.AAE());
        int i2 = (this.A00 + 1) % 10;
        this.A00 = i2;
        if (i2 == 0) {
            r22.A09();
        }
        this.A02.A01();
    }

    public final void A03() {
        if (this.A05.A00() > this.A03.A04.A7h().A04.A05.remaining() && !this.A03.A04.A7h().A06()) {
            if (this.A03.A04.A5v()) {
                this.A03.A02();
                this.A05.A01();
            } else {
                AnonymousClass1CK r5 = this.A0I;
                Long l2 = r5.A0Q;
                if (l2 == null) {
                    r5.A0Q = 0L;
                    l2 = 0L;
                }
                Long l3 = r5.A0R;
                if (l3 == null) {
                    r5.A0R = 0L;
                    l3 = 0L;
                }
                r5.A0Q = Long.valueOf(l2.longValue() + 1);
                r5.A0R = Long.valueOf(l3.longValue() + ((long) this.A05.A00()));
                r5.A09();
                Log.w("wamruntime/logevent: no room for a new event record");
                return;
            }
        }
        if (this.A05.A00() > this.A03.A00()) {
            Log.e("wamruntime/logevent: dropping wam real time event because it is larger than the buffer itself");
            return;
        }
        C29171a9 r2 = this.A03;
        C29161a8 r0 = this.A05;
        r2.A03(r0.A00, r0.A01);
        AnonymousClass1CK r22 = this.A0I;
        r22.A0L = Long.valueOf(this.A03.A04.AAE());
        int i2 = (this.A00 + 1) % 10;
        this.A00 = i2;
        if (i2 == 0) {
            r22.A09();
        }
        this.A03.A01();
        this.A08.AdM(this.A03, false);
    }

    public void A04(C16470t7 r3) {
        A0B(r3, (AnonymousClass00F) null, true);
    }

    @Deprecated
    public void A05(C16470t7 r2) {
        A08(r2, 1);
        A0C(r2, "");
    }

    public void A06(C16470t7 r3) {
        A0B(r3, (AnonymousClass00F) null, false);
    }

    public void A07(C16470t7 r3, int i2) {
        A08(r3, i2);
        StringBuilder sb = new StringBuilder("(with weight=");
        sb.append(i2);
        sb.append(")");
        A0C(r3, sb.toString());
    }

    public final void A08(C16470t7 r3, int i2) {
        RunnableRunnableShape0S0201000_I0 runnableRunnableShape0S0201000_I0;
        AnonymousClass1WA r0;
        if (r3.channel != 2) {
            runnableRunnableShape0S0201000_I0 = new RunnableRunnableShape0S0201000_I0((Object) this, i2, (Object) r3, 27);
            r0 = this.A0J.A01;
        } else {
            runnableRunnableShape0S0201000_I0 = new RunnableRunnableShape0S0201000_I0((Object) this, i2, (Object) r3, 26);
            r0 = this.A0J.A02;
        }
        r0.execute(runnableRunnableShape0S0201000_I0);
    }

    public final void A09(C16470t7 r3, int i2, boolean z2) {
        if (A0H()) {
            this.A06.A03(r3, i2);
            this.A06.A01();
            A0G(z2);
            AnonymousClass1CK r1 = this.A0I;
            if (r3 == r1) {
                r1.A0M = null;
                r1.A0N = null;
                r1.A00 = null;
                r1.A0O = null;
                r1.A0P = null;
                r1.A0Q = null;
                r1.A0R = null;
                r1.A01 = null;
                r1.A02 = null;
                r1.A03 = null;
                r1.A04 = null;
                r1.A05 = null;
                r1.A06 = null;
                r1.A07 = null;
                r1.A08 = null;
                r1.A09 = null;
                r1.A0A = null;
                r1.A0B = null;
                r1.A0C = null;
                r1.A0D = null;
                r1.A0E = null;
                r1.A0F = null;
                r1.A0G = null;
                r1.A0H = null;
                r1.A0I = null;
                r1.A09();
            }
            if (!z2) {
                this.A01.A01();
            }
        }
    }

    public void A0A(C16470t7 r2, AnonymousClass00F r3) {
        A0B(r2, r3, false);
    }

    public void A0B(C16470t7 r4, AnonymousClass00F r5, boolean z2) {
        String str;
        int i2 = r4.code;
        if (r5 == null) {
            r5 = r4.samplingRate;
        }
        Integer A002 = A00(r5, i2, z2);
        if (A002 != null) {
            A08(r4, A002.intValue());
            StringBuilder sb = new StringBuilder("(sampled with weight ");
            sb.append(A002);
            sb.append(")");
            str = sb.toString();
        } else {
            str = "(dropped)";
        }
        A0C(r4, str);
    }

    public final void A0C(C16470t7 r4, String str) {
        if (r4 instanceof WamCall) {
            StringBuilder sb = new StringBuilder();
            sb.append("wamruntime/printevent");
            sb.append(str);
            sb.append(": ");
            sb.append(r4.toString());
            Log.i(sb.toString());
        }
    }

    public final void A0D(String str) {
        AnonymousClass1CK r5 = this.A0I;
        Long l2 = r5.A0O;
        if (l2 == null) {
            r5.A0O = 0L;
            l2 = 0L;
        }
        Long l3 = r5.A0P;
        if (l3 == null) {
            r5.A0P = 0L;
            l3 = 0L;
        }
        r5.A0O = Long.valueOf(l2.longValue() + 1);
        r5.A0P = Long.valueOf(l3.longValue() + ((long) this.A04.A00()));
        r5.A09();
        StringBuilder sb = new StringBuilder("wamruntime/recordPrivateStatsDroppedEvent: ");
        sb.append(str);
        Log.w(sb.toString());
    }

    public final void A0E(CountDownLatch countDownLatch) {
        CountDownLatch countDownLatch2 = this.A0L;
        AnonymousClass1CJ r0 = this.A0J;
        long j2 = (countDownLatch == countDownLatch2 ? r0.A02 : r0.A01).A05;
        Thread currentThread = Thread.currentThread();
        boolean z2 = false;
        if (j2 == currentThread.getId()) {
            z2 = true;
        }
        AnonymousClass00B.A0B("Not running on this SerialExecutor", z2);
        try {
            countDownLatch.await();
        } catch (InterruptedException e2) {
            StringBuilder sb = new StringBuilder("wamruntime: unexpected thread interrupt (");
            sb.append(e2);
            sb.append(")");
            Log.a(sb.toString());
            currentThread.interrupt();
        }
    }

    public void A0F(boolean z2) {
        int nextInt;
        RunnableRunnableShape0S0110000_I0 runnableRunnableShape0S0110000_I0 = new RunnableRunnableShape0S0110000_I0(this, 16, z2);
        AnonymousClass1CJ r2 = this.A0J;
        r2.A01.execute(runnableRunnableShape0S0110000_I0);
        if (this.A0N <= 0 || (nextInt = new Random().nextInt(this.A0N) + 5) <= 0) {
            r2.A02.execute(new RunnableRunnableShape0S0110000_I0(this, 15, z2));
            return;
        }
        r2.A02.A02(new RunnableRunnableShape0S0111000_I0(this, nextInt, 2, z2), (long) (nextInt * 1000));
    }

    public final void A0G(boolean z2) {
        if (this.A06.A00() > this.A01.A04.A7h().A04.A05.remaining() && !this.A01.A04.A7h().A06()) {
            if (this.A01.A04.A5v()) {
                this.A01.A02();
                this.A0D.A0K().putBoolean("wam_is_current_buffer_real_time", false).apply();
                this.A06.A01();
            } else {
                AnonymousClass1CK r5 = this.A0I;
                Long l2 = r5.A0M;
                if (l2 == null) {
                    r5.A0M = 0L;
                    l2 = 0L;
                }
                Long l3 = r5.A0N;
                if (l3 == null) {
                    r5.A0N = 0L;
                    l3 = 0L;
                }
                r5.A0M = Long.valueOf(l2.longValue() + 1);
                r5.A0N = Long.valueOf(l3.longValue() + ((long) this.A06.A00()));
                r5.A09();
                Log.w("wamruntime/logevent: no room for a new event record");
                return;
            }
        }
        if (this.A06.A00() > this.A01.A00()) {
            Log.e("wamruntime/logevent: dropping event because it is larger than the buffer itself");
            return;
        }
        C29171a9 r2 = this.A01;
        C29161a8 r0 = this.A06;
        r2.A03(r0.A00, r0.A01);
        AnonymousClass1CK r3 = this.A0I;
        r3.A0J = Long.valueOf(this.A01.A04.AAE());
        int i2 = (this.A00 + 1) % 10;
        this.A00 = i2;
        if (i2 == 0) {
            r3.A09();
        }
        C29171a9 r22 = this.A01;
        if (r22.A04.A7h().A00() == 1 && !z2) {
            if (!r22.A02) {
                r3.A0D = Boolean.TRUE;
            }
            if (!r3.A0A()) {
                A09(r3, 0, true);
            }
        }
    }

    public final boolean A0H() {
        if (!this.A0A) {
            A0E(this.A0K);
            this.A0H.A00(0);
            this.A0A = true;
        }
        return this.A09 || this.A01.A02;
    }

    public final boolean A0I() {
        if (!this.A0B) {
            A0E(this.A0L);
            this.A0H.A00(2);
            this.A0B = true;
        }
        return this.A09 || this.A02.A02;
    }

    public final boolean A0J() {
        if (!this.A0C) {
            A0E(this.A0M);
            this.A0H.A00(1);
            this.A0C = true;
        }
        return this.A09 || this.A03.A02;
    }
}
