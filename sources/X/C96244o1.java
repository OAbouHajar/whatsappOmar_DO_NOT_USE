package X;

import android.media.AudioTrack;
import android.os.SystemClock;
import android.util.Log;
import android.view.Surface;
import com.facebook.redex.RunnableRunnableShape0S0101100_I1;

/* renamed from: X.4o1  reason: invalid class name and case insensitive filesystem */
public abstract class C96244o1 implements AnonymousClass5UO, AnonymousClass5SK {
    public int A00;
    public int A01;
    public long A02 = Long.MIN_VALUE;
    public long A03;
    public C88874bE A04;
    public C109525Sm A05;
    public boolean A06;
    public boolean A07;
    public C32491gT[] A08;
    public final int A09;
    public final AnonymousClass4G5 A0A = new AnonymousClass4G5();

    public C96244o1(int i2) {
        this.A09 = i2;
    }

    public final int A00(AnonymousClass4G5 r8, AnonymousClass3UX r9, boolean z2) {
        int AbT = this.A05.AbT(r8, r9, z2);
        if (AbT == -4) {
            if (AnonymousClass4XM.A00(r9)) {
                this.A02 = Long.MIN_VALUE;
                return !this.A06 ? -3 : -4;
            }
            long j2 = r9.A00 + this.A03;
            r9.A00 = j2;
            this.A02 = Math.max(this.A02, j2);
        } else if (AbT == -5) {
            C32491gT r3 = r8.A00;
            long j3 = r3.A0J;
            if (j3 != Long.MAX_VALUE) {
                C32471gR r2 = new C32471gR(r3);
                r2.A0H = j3 + this.A03;
                r8.A00 = new C32491gT(r2);
                return AbT;
            }
        }
        return AbT;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C804643y A01(X.C32491gT r10, java.lang.Throwable r11, boolean r12) {
        /*
            r9 = this;
            r2 = r10
            if (r10 == 0) goto L_0x001a
            boolean r0 = r9.A07
            if (r0 != 0) goto L_0x001a
            r0 = 1
            r9.A07 = r0
            r1 = 0
            int r0 = r9.AgX(r10)     // Catch:{ 43y -> 0x0018, all -> 0x0014 }
            r7 = r0 & 7
            r9.A07 = r1
            goto L_0x001b
        L_0x0014:
            r0 = move-exception
            r9.A07 = r1
            throw r0
        L_0x0018:
            r9.A07 = r1
        L_0x001a:
            r7 = 4
        L_0x001b:
            java.lang.String r3 = r9.getName()
            int r6 = r9.A00
            if (r10 != 0) goto L_0x0024
            r7 = 4
        L_0x0024:
            r5 = 1
            X.43y r1 = new X.43y
            r4 = r11
            r8 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C96244o1.A01(X.1gT, java.lang.Throwable, boolean):X.43y");
    }

    public void A02() {
        AnonymousClass5TO r2;
        if (this instanceof AnonymousClass3UK) {
            r2 = ((AnonymousClass3UK) this).A0I;
        } else if (this instanceof C65473Ux) {
            C65473Ux r6 = (C65473Ux) this;
            r6.A07 = 0;
            r6.A0E = SystemClock.elapsedRealtime();
            r6.A0I = SystemClock.elapsedRealtime() * 1000;
            r6.A0J = 0;
            r6.A0D = 0;
            C89444cB r22 = r6.A0Y;
            r22.A0C = true;
            r22.A04 = 0;
            r22.A05 = -1;
            r22.A07 = -1;
            r22.A06(false);
            return;
        } else if (this instanceof C65483Uy) {
            r2 = ((C65483Uy) this).A0A;
        } else {
            return;
        }
        C96334oA r23 = (C96334oA) r2;
        r23.A0T = true;
        AudioTrack audioTrack = r23.A0D;
        if (audioTrack != null) {
            r23.A0d.A0N.A02();
            audioTrack.play();
        }
    }

    public void A03() {
        AnonymousClass5TO r0;
        Surface surface;
        if (this instanceof AnonymousClass3UK) {
            AnonymousClass3UK r02 = (AnonymousClass3UK) this;
            r02.A0D();
            r0 = r02.A0I;
        } else if (this instanceof C65473Ux) {
            C65473Ux r2 = (C65473Ux) this;
            r2.A0G = -9223372036854775807L;
            r2.A0Y();
            int i2 = r2.A0D;
            if (i2 != 0) {
                AnonymousClass4GS r4 = r2.A0Z;
                r4.A00.post(new RunnableRunnableShape0S0101100_I1(r4, i2, 1, r2.A0J));
                r2.A0J = 0;
                r2.A0D = 0;
            }
            C89444cB r3 = r2.A0Y;
            r3.A0C = false;
            if (AnonymousClass3C1.A01 >= 30 && (surface = r3.A0B) != null && r3.A03 != 0.0f) {
                r3.A03 = 0.0f;
                C89444cB.A00(surface, 0.0f);
                return;
            }
            return;
        } else if (this instanceof C65483Uy) {
            C65483Uy r03 = (C65483Uy) this;
            r03.A0X();
            r0 = r03.A0A;
        } else {
            return;
        }
        C96334oA r04 = (C96334oA) r0;
        r04.A0T = false;
        AudioTrack audioTrack = r04.A0D;
        if (audioTrack != null) {
            AnonymousClass4VJ r5 = r04.A0d;
            r5.A0J = 0;
            r5.A05 = 0;
            r5.A02 = 0;
            r5.A0A = 0;
            r5.A0D = 0;
            r5.A0H = 0;
            r5.A0T = false;
            if (r5.A0L == -9223372036854775807L) {
                r5.A0N.A02();
                audioTrack.pause();
            }
        }
    }

    public void A04(C32491gT[] r10, long j2, long j3) {
        if (this instanceof AnonymousClass3UJ) {
            AnonymousClass3UJ r1 = (AnonymousClass3UJ) this;
            r1.A03 = r10[0];
            if (r1.A04 != null) {
                r1.A00 = 1;
            } else {
                r1.A0D();
            }
        } else if (this instanceof AnonymousClass3UI) {
            AnonymousClass3UI r2 = (AnonymousClass3UI) this;
            r2.A03 = r2.A07.A7J(r10[0]);
        } else if (this instanceof AnonymousClass3UH) {
            AnonymousClass3UH r4 = (AnonymousClass3UH) this;
            boolean z2 = true;
            if (r4.A0D == -9223372036854775807L) {
                if (r4.A0E != -9223372036854775807L) {
                    z2 = false;
                }
                C90524eJ.A04(z2);
                r4.A0E = j2;
                r4.A0D = j3;
                return;
            }
            int i2 = r4.A09;
            long[] jArr = r4.A11;
            if (i2 == jArr.length) {
                Log.w("MediaCodecRenderer", C13680ns.A0j(AnonymousClass000.A0r("Too many stream changes, so dropping offset: "), jArr[i2 - 1]));
            } else {
                r4.A09 = i2 + 1;
            }
            long[] jArr2 = r4.A12;
            int i3 = r4.A09;
            int i4 = i3 - 1;
            jArr2[i4] = j2;
            jArr[i4] = j3;
            r4.A13[i3 - 1] = r4.A0B;
        }
    }

    public void A07() {
    }

    public abstract void A08();

    public abstract void A09(long j2, boolean z2);

    public void A0A(boolean z2, boolean z3) {
    }

    public final boolean AHf() {
        return AnonymousClass000.A1P((this.A02 > Long.MIN_VALUE ? 1 : (this.A02 == Long.MIN_VALUE ? 0 : -1)));
    }

    public /* synthetic */ void AeM(float f2, float f3) {
    }

    public final void reset() {
        C90524eJ.A04(AnonymousClass000.A1P(this.A01));
        AnonymousClass4G5 r1 = this.A0A;
        r1.A01 = null;
        r1.A00 = null;
        A07();
    }
}
