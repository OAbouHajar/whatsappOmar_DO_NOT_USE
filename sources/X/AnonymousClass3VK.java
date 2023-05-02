package X;

import android.net.Uri;
import com.facebook.redex.RunnableRunnableShape17S0100000_I1;
import com.google.android.exoplayer2.Timeline;
import java.util.concurrent.ExecutorService;

/* renamed from: X.3VK  reason: invalid class name */
public final class AnonymousClass3VK extends C97294pi implements C108325Nn {
    public long A00 = -9223372036854775807L;
    public AnonymousClass5LZ A01;
    public boolean A02;
    public boolean A03 = true;
    public boolean A04;
    public final C86804Uf A05;
    public final C86924Ur A06;
    public final AnonymousClass5TW A07;
    public final C108255Ng A08;
    public final C108355Nq A09;
    public final AnonymousClass5LY A0A;

    public AnonymousClass3VK(C86924Ur r3, AnonymousClass5TW r4, C108255Ng r5, C108355Nq r6, AnonymousClass5LY r7) {
        this.A05 = r3.A02;
        this.A06 = r3;
        this.A09 = r6;
        this.A08 = r5;
        this.A07 = r4;
        this.A0A = r7;
    }

    public void A01() {
    }

    public void A03(AnonymousClass5LZ r1) {
        this.A01 = r1;
        A04();
    }

    public final void A04() {
        Timeline r1 = new AnonymousClass3UR(this.A06, this.A00, this.A04, this.A02);
        if (this.A03) {
            r1 = new AnonymousClass3VQ(r1, this);
        }
        A02(r1);
    }

    public C15070qH A7W(C30271c3 r12, AnonymousClass5RB r13, long j2) {
        C48612Oe A7I = this.A09.A7I();
        AnonymousClass5LZ r0 = this.A01;
        if (r0 != null) {
            A7I.A4k(r0);
        }
        Uri uri = this.A05.A00;
        C108255Ng r5 = this.A08;
        AnonymousClass5TW r4 = this.A07;
        return new C15050qF(uri, new AnonymousClass4JT(r12, this.A02.A02, 0), r4, r5, new C30231bz(r12, this.A03.A02, 0), this, r13, A7I, this.A0A);
    }

    public C86924Ur ADS() {
        return this.A06;
    }

    public void ALW() {
    }

    public void AXL(long j2, boolean z2, boolean z3) {
        if (j2 == -9223372036854775807L) {
            j2 = this.A00;
        }
        if (this.A03 || this.A00 != j2 || this.A04 != z2 || this.A02 != z3) {
            this.A00 = j2;
            this.A04 = z2;
            this.A02 = z3;
            this.A03 = false;
            A04();
        }
    }

    public void Abl(C15070qH r6) {
        C15050qF r62 = (C15050qF) r6;
        if (r62.A0G) {
            for (C55092ip r1 : r62.A0L) {
                r1.A02();
                if (r1.A0C != null) {
                    r1.A0C = null;
                    r1.A08 = null;
                }
            }
        }
        C88124Zz r2 = r62.A0X;
        AnonymousClass2ni r12 = r2.A00;
        if (r12 != null) {
            r12.A00(true);
        }
        ExecutorService executorService = r2.A02;
        executorService.execute(new RunnableRunnableShape17S0100000_I1((Object) r62, 1));
        executorService.shutdown();
        r62.A0O.removeCallbacksAndMessages((Object) null);
        r62.A09 = null;
        r62.A0H = true;
    }
}
