package X;

import android.os.SystemClock;
import com.facebook.redex.RunnableRunnableShape13S0100000_I0_12;
import com.facebook.redex.RunnableRunnableShape4S0200000_I0_2;
import java.lang.ref.WeakReference;

/* renamed from: X.3Fv  reason: invalid class name and case insensitive filesystem */
public class C63023Fv implements C109335Rq {
    public final C17130ua A00;
    public final AnonymousClass12A A01;
    public final C16980tz A02;
    public final C219215y A03;
    public final AnonymousClass12B A04;
    public final C219115x A05;
    public final AnonymousClass273 A06;
    public final AnonymousClass279 A07;
    public final C17670vS A08;
    public final C17770vc A09;
    public final C17660vR A0A;
    public final C16320sq A0B;

    public C63023Fv(C17130ua r1, AnonymousClass12A r2, C16980tz r3, C219215y r4, AnonymousClass12B r5, C219115x r6, AnonymousClass273 r7, AnonymousClass279 r8, C17670vS r9, C17770vc r10, C17660vR r11, C16320sq r12) {
        this.A02 = r3;
        this.A0A = r11;
        this.A0B = r12;
        this.A00 = r1;
        this.A09 = r10;
        this.A05 = r6;
        this.A08 = r9;
        this.A01 = r2;
        this.A03 = r4;
        this.A04 = r5;
        this.A06 = r7;
        this.A07 = r8;
    }

    public void AVJ(C15830rv r6, String str, int i2, long j2) {
        C17770vc r1 = this.A09;
        r1.A01.A01(r6);
        r1.A02.A01(r6);
        this.A04.A00(r6, i2);
        C219115x r4 = this.A05;
        int i3 = 2;
        if ("preview".equals(str)) {
            i3 = 1;
        }
        r4.A00((Double) null, Long.valueOf(System.currentTimeMillis() - j2), 6, i3);
    }

    public void AVK(AnonymousClass277 r17, long j2) {
        AnonymousClass273 r0 = this.A06;
        int i2 = 2;
        if (r0 != null) {
            r0.A00(2);
        }
        AnonymousClass277 r8 = r17;
        int i3 = r8.A01;
        if (i3 == -1) {
            C40801ui r02 = this.A09.A02;
            C15830rv r1 = r8.A03;
            r02.A01(r1);
            this.A01.A03(r1);
        } else {
            int i4 = r8.A02;
            long j3 = j2;
            if (r8.A04 != null) {
                this.A03.A01(r8, j3);
            } else if (r8.A05 != null) {
                C16980tz r7 = this.A02;
                C17660vR r11 = this.A0A;
                C16320sq r12 = this.A0B;
                AnonymousClass37V.A04(this.A00, this.A01, r7, r8, this.A05, this.A08, r11, r12, 0, j3);
            } else {
                AnonymousClass12A r5 = this.A01;
                r5.A00.A01(new RunnableRunnableShape4S0200000_I0_2(r5, 43, r8));
                C219115x r52 = this.A05;
                if (i4 != 1) {
                    i2 = 1;
                }
                r52.A00((Double) null, Long.valueOf(SystemClock.elapsedRealtime() - j2), 1, i2);
            }
        }
        AnonymousClass279 r13 = this.A07;
        if (r13 != null && i3 == -1) {
            WeakReference weakReference = r13.A00;
            if (weakReference.get() != null) {
                C14570pP r3 = (C14570pP) weakReference.get();
                r3.A05.Acl(new RunnableRunnableShape13S0100000_I0_12((Object) r3, 21));
            }
        }
    }
}
