package X;

import android.os.Handler;
import android.os.SystemClock;
import com.facebook.redex.RunnableRunnableShape0S1100200_I1;
import com.facebook.redex.RunnableRunnableShape1S1100000_I1;
import com.facebook.redex.RunnableRunnableShape3S0300000_I1;
import com.google.android.exoplayer2.decoder.SimpleOutputBuffer;
import com.google.android.exoplayer2.ext.opus.OpusDecoder;

/* renamed from: X.3UK  reason: invalid class name */
public class AnonymousClass3UK extends C96244o1 implements AnonymousClass5SP {
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public C32491gT A04;
    public AnonymousClass5T2 A05;
    public C85484Oq A06;
    public AnonymousClass3UX A07;
    public SimpleOutputBuffer A08;
    public C55102iq A09;
    public C55102iq A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public final AnonymousClass4TD A0H;
    public final AnonymousClass5TO A0I;
    public final AnonymousClass3UX A0J;

    public AnonymousClass3UK(Handler handler, AnonymousClass5TI r3, AnonymousClass5TO r4) {
        this(handler, r3, r4, 0);
    }

    public AnonymousClass3UK(Handler handler, AnonymousClass5TI r5, AnonymousClass5TO r6, int i2) {
        super(1);
        this.A0H = new AnonymousClass4TD(handler, r5);
        this.A0I = r6;
        ((C96334oA) r6).A0G = new C96314o8(this);
        this.A0J = new AnonymousClass3UX(0);
        this.A00 = 0;
        this.A0D = true;
    }

    public void A08() {
        this.A04 = null;
        this.A0D = true;
        try {
            this.A0A = null;
            A0C();
            this.A0I.reset();
        } finally {
            this.A0H.A00(this.A06);
        }
    }

    public void A09(long j2, boolean z2) {
        this.A0I.flush();
        this.A03 = j2;
        this.A0B = true;
        this.A0C = true;
        this.A0F = false;
        this.A0G = false;
        if (this.A05 == null) {
            return;
        }
        if (this.A00 != 0) {
            A0C();
            A0B();
            return;
        }
        this.A07 = null;
        SimpleOutputBuffer simpleOutputBuffer = this.A08;
        if (simpleOutputBuffer != null) {
            simpleOutputBuffer.release();
            this.A08 = null;
        }
        this.A05.flush();
        this.A0E = false;
    }

    public void A0A(boolean z2, boolean z3) {
        C85484Oq r3 = new C85484Oq();
        this.A06 = r3;
        AnonymousClass4TD r2 = this.A0H;
        Handler handler = r2.A00;
        if (handler != null) {
            C13700nu.A0O(handler, r2, r3, 7);
        }
        boolean z4 = this.A04.A00;
        C96334oA r32 = (C96334oA) this.A0I;
        if (z4) {
            C90524eJ.A04(AnonymousClass3K3.A1P(AnonymousClass3C1.A01, 21));
            C90524eJ.A04(r32.A0Q);
            if (!r32.A0X) {
                r32.A0X = true;
            } else {
                return;
            }
        } else if (r32.A0X) {
            r32.A0X = false;
        } else {
            return;
        }
        r32.flush();
    }

    public final void A0B() {
        if (this.A05 == null) {
            this.A09 = this.A0A;
            try {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                C90224dm.A02("createAudioDecoder");
                C32491gT r4 = this.A04;
                C90224dm.A02("createOpusDecoder");
                boolean A1R = AnonymousClass000.A1R(this.A0I.ACO(AnonymousClass3C1.A06(4, r4.A06, r4.A0F)), 2);
                int i2 = r4.A0A;
                if (i2 == -1) {
                    i2 = 5760;
                }
                OpusDecoder opusDecoder = new OpusDecoder(r4.A0U, i2, A1R);
                C90224dm.A00();
                this.A05 = opusDecoder;
                C90224dm.A00();
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                AnonymousClass4TD r7 = this.A0H;
                String name = this.A05.getName();
                long j2 = elapsedRealtime2 - elapsedRealtime;
                Handler handler = r7.A00;
                if (handler != null) {
                    handler.post(new RunnableRunnableShape0S1100200_I1(r7, name, 0, elapsedRealtime2, j2));
                }
                this.A06.A00++;
            } catch (C804743z | OutOfMemoryError e2) {
                throw A01(this.A04, e2, false);
            }
        }
    }

    public final void A0C() {
        this.A07 = null;
        this.A08 = null;
        this.A00 = 0;
        this.A0E = false;
        AnonymousClass5T2 r2 = this.A05;
        if (r2 != null) {
            this.A06.A01++;
            r2.release();
            AnonymousClass4TD r4 = this.A0H;
            String name = this.A05.getName();
            Handler handler = r4.A00;
            if (handler != null) {
                handler.post(new RunnableRunnableShape1S1100000_I1(0, name, r4));
            }
            this.A05 = null;
        }
        this.A09 = null;
    }

    public final void A0D() {
        long ABR = this.A0I.ABR(AIm());
        if (ABR != Long.MIN_VALUE) {
            if (!this.A0C) {
                ABR = Math.max(this.A03, ABR);
            }
            this.A03 = ABR;
            this.A0C = false;
        }
    }

    public final void A0E(AnonymousClass4G5 r12) {
        Handler handler;
        RunnableRunnableShape3S0300000_I1 runnableRunnableShape3S0300000_I1;
        C32491gT r7 = r12.A00;
        C55102iq r2 = r12.A01;
        this.A0A = r2;
        C32491gT r6 = this.A04;
        this.A04 = r7;
        this.A01 = r7.A07;
        this.A02 = r7.A08;
        AnonymousClass5T2 r1 = this.A05;
        if (r1 == null) {
            A0B();
            AnonymousClass4TD r5 = this.A0H;
            C32491gT r22 = this.A04;
            handler = r5.A00;
            if (handler != null) {
                runnableRunnableShape3S0300000_I1 = new RunnableRunnableShape3S0300000_I1(r5, r22, (Object) null, 1);
            } else {
                return;
            }
        } else {
            C86944Ut r52 = new C86944Ut(r6, r7, r1.getName(), 0, r2 != this.A09 ? 128 : 1);
            if (this.A0E) {
                this.A00 = 1;
            } else {
                A0C();
                A0B();
                this.A0D = true;
            }
            AnonymousClass4TD r23 = this.A0H;
            C32491gT r13 = this.A04;
            handler = r23.A00;
            if (handler != null) {
                runnableRunnableShape3S0300000_I1 = new RunnableRunnableShape3S0300000_I1(r23, r13, r52, 1);
            } else {
                return;
            }
        }
        handler.post(runnableRunnableShape3S0300000_I1);
    }

    public C89214bm AF4() {
        return ((C96334oA) this.A0I).A08().A02;
    }

    public long AFA() {
        if (this.A01 == 2) {
            A0D();
        }
        return this.A03;
    }

    public boolean AIm() {
        if (!this.A0G) {
            return false;
        }
        C96334oA r1 = (C96334oA) this.A0I;
        if (r1.A0D != null) {
            return r1.A0R && !r1.AHd();
        }
        return true;
    }

    public boolean AJY() {
        if (this.A0I.AHd()) {
            return true;
        }
        if (this.A04 == null) {
            return false;
        }
        return (AHf() ? this.A06 : this.A05.AJY()) || this.A08 != null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0072, code lost:
        if (r11.A00 != 2) goto L_0x0118;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0074, code lost:
        A0C();
        A0B();
        r11.A0D = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0118, code lost:
        r6.release();
        r11.A08 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:?, code lost:
        r11.A0G = true;
        r1 = (X.C96334oA) r11.A0I;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0125, code lost:
        if (r1.A0R != false) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0129, code lost:
        if (r1.A0D == null) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x012f, code lost:
        if (r1.A0F() == false) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0131, code lost:
        r1.A09();
        r1.A0R = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Ac6(long r12, long r14) {
        /*
            r11 = this;
            boolean r0 = r11.A0G
            if (r0 == 0) goto L_0x001d
            X.5TO r1 = r11.A0I     // Catch:{ 43h -> 0x0196 }
            X.4oA r1 = (X.C96334oA) r1     // Catch:{ 43h -> 0x0196 }
            boolean r0 = r1.A0R     // Catch:{ 43h -> 0x0196 }
            if (r0 != 0) goto L_0x01ed
            android.media.AudioTrack r0 = r1.A0D     // Catch:{ 43h -> 0x0196 }
            if (r0 == 0) goto L_0x01ed
            boolean r0 = r1.A0F()     // Catch:{ 43h -> 0x0196 }
            if (r0 == 0) goto L_0x01ed
            r1.A09()     // Catch:{ 43h -> 0x0196 }
            r0 = 1
            r1.A0R = r0     // Catch:{ 43h -> 0x0196 }
            return
        L_0x001d:
            X.1gT r0 = r11.A04
            if (r0 != 0) goto L_0x0038
            X.4G5 r5 = r11.A0A
            r4 = 0
            r5.A01 = r4
            r5.A00 = r4
            X.3UX r3 = r11.A0J
            r3.clear()
            r2 = 1
            int r1 = r11.A00(r5, r3, r2)
            r0 = -5
            if (r1 != r0) goto L_0x01bc
            r11.A0E(r5)
        L_0x0038:
            r11.A0B()
            X.5T2 r0 = r11.A05
            if (r0 == 0) goto L_0x01ed
            java.lang.String r0 = "drainAndFeed"
            X.C90224dm.A02(r0)     // Catch:{ 43z -> 0x01b3, 43u -> 0x01aa, 43g -> 0x01a0 }
        L_0x0044:
            com.google.android.exoplayer2.decoder.SimpleOutputBuffer r6 = r11.A08     // Catch:{ 43z -> 0x01b3, 43u -> 0x01aa, 43g -> 0x01a0 }
            r3 = 0
            if (r6 != 0) goto L_0x0067
            X.5T2 r0 = r11.A05     // Catch:{ 43z -> 0x01b3, 43u -> 0x01aa, 43g -> 0x01a0 }
            java.lang.Object r6 = r0.A7r()     // Catch:{ 43z -> 0x01b3, 43u -> 0x01aa, 43g -> 0x01a0 }
            com.google.android.exoplayer2.decoder.SimpleOutputBuffer r6 = (com.google.android.exoplayer2.decoder.SimpleOutputBuffer) r6     // Catch:{ 43z -> 0x01b3, 43u -> 0x01aa, 43g -> 0x01a0 }
            r11.A08 = r6     // Catch:{ 43z -> 0x01b3, 43u -> 0x01aa, 43g -> 0x01a0 }
            if (r6 == 0) goto L_0x007c
            int r2 = r6.skippedOutputBufferCount     // Catch:{ 43z -> 0x01b3, 43u -> 0x01aa, 43g -> 0x01a0 }
            if (r2 <= 0) goto L_0x0067
            X.4Oq r1 = r11.A06     // Catch:{ 43z -> 0x01b3, 43u -> 0x01aa, 43g -> 0x01a0 }
            int r0 = r1.A08     // Catch:{ 43z -> 0x01b3, 43u -> 0x01aa, 43g -> 0x01a0 }
            int r0 = r0 + r2
            r1.A08 = r0     // Catch:{ 43z -> 0x01b3, 43u -> 0x01aa, 43g -> 0x01a0 }
            X.5TO r1 = r11.A0I     // Catch:{ 43z -> 0x01b3, 43u -> 0x01aa, 43g -> 0x01a0 }
            X.4oA r1 = (X.C96334oA) r1     // Catch:{ 43z -> 0x01b3, 43u -> 0x01aa, 43g -> 0x01a0 }
            r0 = 1
            r1.A0V = r0     // Catch:{ 43z -> 0x01b3, 43u -> 0x01aa, 43g -> 0x01a0 }
        L_0x0067:
            boolean r0 = X.AnonymousClass4XM.A00(r6)     // Catch:{ 43z -> 0x01b3, 43u -> 0x01aa, 43g -> 0x01a0 }
            r4 = 0
            r5 = 1
            if (r0 == 0) goto L_0x0138
            int r1 = r11.A00     // Catch:{ 43z -> 0x01b3, 43u -> 0x01aa, 43g -> 0x01a0 }
            r0 = 2
            if (r1 != r0) goto L_0x0118
            r11.A0C()     // Catch:{ 43z -> 0x01b3, 43u -> 0x01aa, 43g -> 0x01a0 }
            r11.A0B()     // Catch:{ 43z -> 0x01b3, 43u -> 0x01aa, 43g -> 0x01a0 }
            r11.A0D = r5     // Catch:{ 43z -> 0x01b3, 43u -> 0x01aa, 43g -> 0x01a0 }
        L_0x007c:
            X.5T2 r3 = r11.A05     // Catch:{ 43z -> 0x01b3, 43u -> 0x01aa, 43g -> 0x01a0 }
            r10 = 0
            if (r3 == 0) goto L_0x00ab
            int r0 = r11.A00     // Catch:{ 43z -> 0x01b3, 43u -> 0x01aa, 43g -> 0x01a0 }
            r2 = 2
            if (r0 == r2) goto L_0x00ab
            boolean r0 = r11.A0F     // Catch:{ 43z -> 0x01b3, 43u -> 0x01aa, 43g -> 0x01a0 }
            if (r0 != 0) goto L_0x00ab
            X.3UX r1 = r11.A07     // Catch:{ 43z -> 0x01b3, 43u -> 0x01aa, 43g -> 0x01a0 }
            if (r1 != 0) goto L_0x0099
            java.lang.Object r1 = r3.A7q()     // Catch:{ 43z -> 0x01b3, 43u -> 0x01aa, 43g -> 0x01a0 }
            X.3UX r1 = (X.AnonymousClass3UX) r1     // Catch:{ 43z -> 0x01b3, 43u -> 0x01aa, 43g -> 0x01a0 }
            r11.A07 = r1     // Catch:{ 43z -> 0x01b3, 43u -> 0x01aa, 43g -> 0x01a0 }
            if (r1 != 0) goto L_0x0099
            goto L_0x00ab
        L_0x0099:
            int r0 = r11.A00     // Catch:{ 43z -> 0x01b3, 43u -> 0x01aa, 43g -> 0x01a0 }
            r7 = 0
            r9 = 1
            if (r0 != r9) goto L_0x00b0
            r0 = 4
            r1.flags = r0     // Catch:{ 43z -> 0x01b3, 43u -> 0x01aa, 43g -> 0x01a0 }
            X.5T2 r0 = r11.A05     // Catch:{ 43z -> 0x01b3, 43u -> 0x01aa, 43g -> 0x01a0 }
            r0.AbI(r1)     // Catch:{ 43z -> 0x01b3, 43u -> 0x01aa, 43g -> 0x01a0 }
            r11.A07 = r7     // Catch:{ 43z -> 0x01b3, 43u -> 0x01aa, 43g -> 0x01a0 }
            r11.A00 = r2     // Catch:{ 43z -> 0x01b3, 43u -> 0x01aa, 43g -> 0x01a0 }
        L_0x00ab:
            X.C90224dm.A00()     // Catch:{ 43z -> 0x01b3, 43u -> 0x01aa, 43g -> 0x01a0 }
            goto L_0x01e9
        L_0x00b0:
            X.4G5 r2 = r11.A0A     // Catch:{ 43z -> 0x01b3, 43u -> 0x01aa, 43g -> 0x01a0 }
            r2.A01 = r7     // Catch:{ 43z -> 0x01b3, 43u -> 0x01aa, 43g -> 0x01a0 }
            r2.A00 = r7     // Catch:{ 43z -> 0x01b3, 43u -> 0x01aa, 43g -> 0x01a0 }
            int r1 = r11.A00(r2, r1, r10)     // Catch:{ 43z -> 0x01b3, 43u -> 0x01aa, 43g -> 0x01a0 }
            r0 = -5
            if (r1 == r0) goto L_0x0113
            r0 = -4
            if (r1 == r0) goto L_0x00c5
            r0 = -3
            if (r1 == r0) goto L_0x00ab
            goto L_0x0187
        L_0x00c5:
            X.3UX r1 = r11.A07     // Catch:{ 43z -> 0x01b3, 43u -> 0x01aa, 43g -> 0x01a0 }
            boolean r0 = X.AnonymousClass4XM.A00(r1)     // Catch:{ 43z -> 0x01b3, 43u -> 0x01aa, 43g -> 0x01a0 }
            if (r0 == 0) goto L_0x00d7
            r11.A0F = r9     // Catch:{ 43z -> 0x01b3, 43u -> 0x01aa, 43g -> 0x01a0 }
            X.5T2 r0 = r11.A05     // Catch:{ 43z -> 0x01b3, 43u -> 0x01aa, 43g -> 0x01a0 }
            r0.AbI(r1)     // Catch:{ 43z -> 0x01b3, 43u -> 0x01aa, 43g -> 0x01a0 }
            r11.A07 = r7     // Catch:{ 43z -> 0x01b3, 43u -> 0x01aa, 43g -> 0x01a0 }
            goto L_0x00ab
        L_0x00d7:
            r1.A00()     // Catch:{ 43z -> 0x01b3, 43u -> 0x01aa, 43g -> 0x01a0 }
            X.3UX r8 = r11.A07     // Catch:{ 43z -> 0x01b3, 43u -> 0x01aa, 43g -> 0x01a0 }
            boolean r0 = r11.A0B     // Catch:{ 43z -> 0x01b3, 43u -> 0x01aa, 43g -> 0x01a0 }
            if (r0 == 0) goto L_0x0100
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            int r0 = r8.flags     // Catch:{ 43z -> 0x01b3, 43u -> 0x01aa, 43g -> 0x01a0 }
            r0 = r0 & r1
            boolean r0 = X.AnonymousClass000.A1R(r0, r1)     // Catch:{ 43z -> 0x01b3, 43u -> 0x01aa, 43g -> 0x01a0 }
            if (r0 != 0) goto L_0x0100
            long r5 = r8.A00     // Catch:{ 43z -> 0x01b3, 43u -> 0x01aa, 43g -> 0x01a0 }
            long r2 = r11.A03     // Catch:{ 43z -> 0x01b3, 43u -> 0x01aa, 43g -> 0x01a0 }
            long r0 = r5 - r2
            long r3 = java.lang.Math.abs(r0)     // Catch:{ 43z -> 0x01b3, 43u -> 0x01aa, 43g -> 0x01a0 }
            r1 = 500000(0x7a120, double:2.47033E-318)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x00fe
            r11.A03 = r5     // Catch:{ 43z -> 0x01b3, 43u -> 0x01aa, 43g -> 0x01a0 }
        L_0x00fe:
            r11.A0B = r10     // Catch:{ 43z -> 0x01b3, 43u -> 0x01aa, 43g -> 0x01a0 }
        L_0x0100:
            X.5T2 r0 = r11.A05     // Catch:{ 43z -> 0x01b3, 43u -> 0x01aa, 43g -> 0x01a0 }
            r0.AbI(r8)     // Catch:{ 43z -> 0x01b3, 43u -> 0x01aa, 43g -> 0x01a0 }
            r11.A0E = r9     // Catch:{ 43z -> 0x01b3, 43u -> 0x01aa, 43g -> 0x01a0 }
            X.4Oq r1 = r11.A06     // Catch:{ 43z -> 0x01b3, 43u -> 0x01aa, 43g -> 0x01a0 }
            int r0 = r1.A04     // Catch:{ 43z -> 0x01b3, 43u -> 0x01aa, 43g -> 0x01a0 }
            int r0 = r0 + 1
            r1.A04 = r0     // Catch:{ 43z -> 0x01b3, 43u -> 0x01aa, 43g -> 0x01a0 }
            r11.A07 = r7     // Catch:{ 43z -> 0x01b3, 43u -> 0x01aa, 43g -> 0x01a0 }
            goto L_0x007c
        L_0x0113:
            r11.A0E(r2)     // Catch:{ 43z -> 0x01b3, 43u -> 0x01aa, 43g -> 0x01a0 }
            goto L_0x007c
        L_0x0118:
            r6.release()     // Catch:{ 43z -> 0x01b3, 43u -> 0x01aa, 43g -> 0x01a0 }
            r11.A08 = r4     // Catch:{ 43z -> 0x01b3, 43u -> 0x01aa, 43g -> 0x01a0 }
            r11.A0G = r5     // Catch:{ 43h -> 0x018c }
            X.5TO r1 = r11.A0I     // Catch:{ 43h -> 0x018c }
            X.4oA r1 = (X.C96334oA) r1     // Catch:{ 43h -> 0x018c }
            boolean r0 = r1.A0R     // Catch:{ 43h -> 0x018c }
            if (r0 != 0) goto L_0x007c
            android.media.AudioTrack r0 = r1.A0D     // Catch:{ 43h -> 0x018c }
            if (r0 == 0) goto L_0x007c
            boolean r0 = r1.A0F()     // Catch:{ 43h -> 0x018c }
            if (r0 == 0) goto L_0x007c
            r1.A09()     // Catch:{ 43h -> 0x018c }
            r1.A0R = r5     // Catch:{ 43h -> 0x018c }
            goto L_0x007c
        L_0x0138:
            boolean r0 = r11.A0D     // Catch:{ 43z -> 0x01b3, 43u -> 0x01aa, 43g -> 0x01a0 }
            if (r0 == 0) goto L_0x0168
            X.5T2 r1 = r11.A05     // Catch:{ 43z -> 0x01b3, 43u -> 0x01aa, 43g -> 0x01a0 }
            com.google.android.exoplayer2.ext.opus.OpusDecoder r1 = (com.google.android.exoplayer2.ext.opus.OpusDecoder) r1     // Catch:{ 43z -> 0x01b3, 43u -> 0x01aa, 43g -> 0x01a0 }
            boolean r0 = r1.A05     // Catch:{ 43z -> 0x01b3, 43u -> 0x01aa, 43g -> 0x01a0 }
            r2 = 2
            if (r0 == 0) goto L_0x0146
            r2 = 4
        L_0x0146:
            int r1 = r1.A01     // Catch:{ 43z -> 0x01b3, 43u -> 0x01aa, 43g -> 0x01a0 }
            r0 = 48000(0xbb80, float:6.7262E-41)
            X.1gT r0 = X.AnonymousClass3C1.A06(r2, r1, r0)     // Catch:{ 43z -> 0x01b3, 43u -> 0x01aa, 43g -> 0x01a0 }
            X.1gR r2 = new X.1gR     // Catch:{ 43z -> 0x01b3, 43u -> 0x01aa, 43g -> 0x01a0 }
            r2.<init>(r0)     // Catch:{ 43z -> 0x01b3, 43u -> 0x01aa, 43g -> 0x01a0 }
            int r0 = r11.A01     // Catch:{ 43z -> 0x01b3, 43u -> 0x01aa, 43g -> 0x01a0 }
            r2.A05 = r0     // Catch:{ 43z -> 0x01b3, 43u -> 0x01aa, 43g -> 0x01a0 }
            int r0 = r11.A02     // Catch:{ 43z -> 0x01b3, 43u -> 0x01aa, 43g -> 0x01a0 }
            r2.A06 = r0     // Catch:{ 43z -> 0x01b3, 43u -> 0x01aa, 43g -> 0x01a0 }
            X.1gT r1 = new X.1gT     // Catch:{ 43z -> 0x01b3, 43u -> 0x01aa, 43g -> 0x01a0 }
            r1.<init>((X.C32471gR) r2)     // Catch:{ 43z -> 0x01b3, 43u -> 0x01aa, 43g -> 0x01a0 }
            X.5TO r0 = r11.A0I     // Catch:{ 43z -> 0x01b3, 43u -> 0x01aa, 43g -> 0x01a0 }
            r0.A6X(r1, r4, r3)     // Catch:{ 43z -> 0x01b3, 43u -> 0x01aa, 43g -> 0x01a0 }
            r11.A0D = r3     // Catch:{ 43z -> 0x01b3, 43u -> 0x01aa, 43g -> 0x01a0 }
        L_0x0168:
            X.5TO r3 = r11.A0I     // Catch:{ 43z -> 0x01b3, 43u -> 0x01aa, 43g -> 0x01a0 }
            com.google.android.exoplayer2.decoder.SimpleOutputBuffer r0 = r11.A08     // Catch:{ 43z -> 0x01b3, 43u -> 0x01aa, 43g -> 0x01a0 }
            java.nio.ByteBuffer r2 = r0.data     // Catch:{ 43z -> 0x01b3, 43u -> 0x01aa, 43g -> 0x01a0 }
            long r0 = r0.timeUs     // Catch:{ 43z -> 0x01b3, 43u -> 0x01aa, 43g -> 0x01a0 }
            boolean r0 = r3.AHJ(r2, r5, r0)     // Catch:{ 43z -> 0x01b3, 43u -> 0x01aa, 43g -> 0x01a0 }
            if (r0 == 0) goto L_0x007c
            X.4Oq r1 = r11.A06     // Catch:{ 43z -> 0x01b3, 43u -> 0x01aa, 43g -> 0x01a0 }
            int r0 = r1.A06     // Catch:{ 43z -> 0x01b3, 43u -> 0x01aa, 43g -> 0x01a0 }
            int r0 = r0 + 1
            r1.A06 = r0     // Catch:{ 43z -> 0x01b3, 43u -> 0x01aa, 43g -> 0x01a0 }
            com.google.android.exoplayer2.decoder.SimpleOutputBuffer r0 = r11.A08     // Catch:{ 43z -> 0x01b3, 43u -> 0x01aa, 43g -> 0x01a0 }
            r0.release()     // Catch:{ 43z -> 0x01b3, 43u -> 0x01aa, 43g -> 0x01a0 }
            r11.A08 = r4     // Catch:{ 43z -> 0x01b3, 43u -> 0x01aa, 43g -> 0x01a0 }
            goto L_0x0044
        L_0x0187:
            java.lang.IllegalStateException r0 = X.AnonymousClass3K4.A0V()     // Catch:{ 43z -> 0x01b3, 43u -> 0x01aa, 43g -> 0x01a0 }
            throw r0     // Catch:{ 43z -> 0x01b3, 43u -> 0x01aa, 43g -> 0x01a0 }
        L_0x018c:
            r2 = move-exception
            X.1gT r1 = r2.format     // Catch:{ 43z -> 0x01b3, 43u -> 0x01aa, 43g -> 0x01a0 }
            boolean r0 = r2.isRecoverable     // Catch:{ 43z -> 0x01b3, 43u -> 0x01aa, 43g -> 0x01a0 }
            X.43y r0 = r11.A01(r1, r2, r0)     // Catch:{ 43z -> 0x01b3, 43u -> 0x01aa, 43g -> 0x01a0 }
            throw r0     // Catch:{ 43z -> 0x01b3, 43u -> 0x01aa, 43g -> 0x01a0 }
        L_0x0196:
            r2 = move-exception
            X.1gT r1 = r2.format
            boolean r0 = r2.isRecoverable
            X.43y r0 = r11.A01(r1, r2, r0)
            throw r0
        L_0x01a0:
            r2 = move-exception
            X.1gT r1 = r2.format
            boolean r0 = r2.isRecoverable
            X.43y r0 = r11.A01(r1, r2, r0)
            throw r0
        L_0x01aa:
            r2 = move-exception
            X.1gT r1 = r2.format
            r0 = 0
            X.43y r0 = r11.A01(r1, r2, r0)
            throw r0
        L_0x01b3:
            r2 = move-exception
            X.1gT r1 = r11.A04
            r0 = 0
            X.43y r0 = r11.A01(r1, r2, r0)
            throw r0
        L_0x01bc:
            r0 = -4
            if (r1 != r0) goto L_0x01ed
            boolean r0 = X.AnonymousClass4XM.A00(r3)
            X.C90524eJ.A04(r0)
            r11.A0F = r2
            r11.A0G = r2     // Catch:{ 43h -> 0x01e2 }
            X.5TO r1 = r11.A0I     // Catch:{ 43h -> 0x01e2 }
            X.4oA r1 = (X.C96334oA) r1     // Catch:{ 43h -> 0x01e2 }
            boolean r0 = r1.A0R     // Catch:{ 43h -> 0x01e2 }
            if (r0 != 0) goto L_0x01ed
            android.media.AudioTrack r0 = r1.A0D     // Catch:{ 43h -> 0x01e2 }
            if (r0 == 0) goto L_0x01ed
            boolean r0 = r1.A0F()     // Catch:{ 43h -> 0x01e2 }
            if (r0 == 0) goto L_0x01ed
            r1.A09()     // Catch:{ 43h -> 0x01e2 }
            r1.A0R = r2     // Catch:{ 43h -> 0x01e2 }
            return
        L_0x01e2:
            r1 = move-exception
            r0 = 0
            X.43y r0 = r11.A01(r4, r1, r0)
            throw r0
        L_0x01e9:
            X.4Oq r0 = r11.A06
            monitor-enter(r0)
            monitor-exit(r0)
        L_0x01ed:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3UK.Ac6(long, long):void");
    }

    public void AeL(C89214bm r2) {
        this.A0I.AeL(r2);
    }

    public final int AgX(C32491gT r6) {
        String str = r6.A0T;
        int i2 = 0;
        if (!C90834eu.A03(str)) {
            return 0;
        }
        boolean z2 = true;
        if (r6.A0N != null) {
            z2 = false;
        }
        if (!"audio/opus".equalsIgnoreCase(str)) {
            return 0;
        }
        if (((C96334oA) this.A0I).ACO(AnonymousClass3C1.A06(2, r6.A06, r6.A0F)) == 0) {
            return 1;
        }
        if (!z2) {
            return 2;
        }
        if (AnonymousClass3C1.A01 >= 21) {
            i2 = 32;
        }
        return 12 | i2;
    }

    public String getName() {
        return "LibopusAudioRenderer";
    }
}
