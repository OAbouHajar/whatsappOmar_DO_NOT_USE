package X;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.ConditionVariable;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import org.apache.commons.io.FileUtils;

/* renamed from: X.4oA  reason: invalid class name and case insensitive filesystem */
public final class C96334oA implements AnonymousClass5TO {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public long A07;
    public long A08;
    public long A09;
    public long A0A;
    public long A0B;
    public long A0C;
    public AudioTrack A0D;
    public C89214bm A0E;
    public C89164bh A0F;
    public AnonymousClass5TB A0G;
    public AnonymousClass4SQ A0H;
    public AnonymousClass4VA A0I;
    public AnonymousClass4VA A0J;
    public AnonymousClass4LP A0K;
    public AnonymousClass4LP A0L;
    public AnonymousClass4UB A0M;
    public ByteBuffer A0N;
    public ByteBuffer A0O;
    public ByteBuffer A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public byte[] A0Y;
    public C109765Tm[] A0Z;
    public ByteBuffer[] A0a;
    public final ConditionVariable A0b = new ConditionVariable(true);
    public final C90094dU A0c;
    public final AnonymousClass4VJ A0d = new AnonymousClass4VJ(new C96344oB(this));
    public final AnonymousClass3UT A0e;
    public final AnonymousClass5LD A0f;
    public final AnonymousClass4G6 A0g;
    public final AnonymousClass4G6 A0h;
    public final AnonymousClass3UU A0i;
    public final ArrayDeque A0j;
    public final C109765Tm[] A0k;
    public final C109765Tm[] A0l;

    public C96334oA(C90094dU r8, AnonymousClass5LD r9) {
        this.A0c = r8;
        this.A0f = r9;
        AnonymousClass3UT r4 = new AnonymousClass3UT();
        this.A0e = r4;
        AnonymousClass3UU r3 = new AnonymousClass3UU();
        this.A0i = r3;
        ArrayList A0u = AnonymousClass000.A0u();
        Collections.addAll(A0u, new C96304o7[]{new AnonymousClass3US(), r4, r3});
        Collections.addAll(A0u, ((C96354oC) r9).A02);
        this.A0l = (C109765Tm[]) A0u.toArray(new C109765Tm[0]);
        this.A0k = new C109765Tm[]{new AnonymousClass3UW()};
        this.A00 = 1.0f;
        this.A0F = C89164bh.A02;
        this.A01 = 0;
        this.A0H = new AnonymousClass4SQ();
        C89214bm r1 = C89214bm.A03;
        this.A0L = new AnonymousClass4LP(r1, 0, 0, false);
        this.A0E = r1;
        this.A03 = -1;
        this.A0Z = new C109765Tm[0];
        this.A0a = new ByteBuffer[0];
        this.A0j = new ArrayDeque();
        this.A0g = new AnonymousClass4G6();
        this.A0h = new AnonymousClass4G6();
    }

    public static int A00(int i2) {
        AudioAttributes build = new AudioAttributes.Builder().setUsage(1).setContentType(3).build();
        int i3 = 8;
        while (!AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(18).setSampleRate(i2).setChannelMask(AnonymousClass3C1.A00(i3)).build(), build)) {
            i3--;
            if (i3 <= 0) {
                return 0;
            }
        }
        return i3;
    }

    public static int A01(AudioTrack audioTrack, ByteBuffer byteBuffer, int i2) {
        return audioTrack.write(byteBuffer, i2, 1);
    }

    public static long A02(AnonymousClass4VJ r2, long j2) {
        return (j2 * SearchActionVerificationClientService.MS_TO_NS) / ((long) r2.A04);
    }

    public static AudioFormat A03(int i2, int i3, int i4) {
        return new AudioFormat.Builder().setSampleRate(i2).setChannelMask(i3).setEncoding(i4).build();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x006f, code lost:
        r3 = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0076, code lost:
        if (r2 == 5) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0078, code lost:
        if (r2 == 6) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x007a, code lost:
        if (r2 == 18) goto L_0x00b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x007e, code lost:
        if (r2 == 17) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0080, code lost:
        if (r2 == 7) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0082, code lost:
        if (r2 == 8) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0086, code lost:
        if (r2 != 14) goto L_0x000e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x008e, code lost:
        if (java.util.Arrays.binarySearch(r8.A01, r2) < 0) goto L_0x000e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0090, code lost:
        if (r2 != 18) goto L_0x00bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0096, code lost:
        if (X.AnonymousClass3C1.A01 < 29) goto L_0x00c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0098, code lost:
        r3 = A00(r7.A0F);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x009e, code lost:
        if (r3 != 0) goto L_0x00c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00a0, code lost:
        android.util.Log.w("DefaultAudioSink", "E-AC3 JOC encoding supported but no channel count supported");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00a7, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00ae, code lost:
        if (java.util.Arrays.binarySearch(r8.A01, 8) >= 0) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00b0, code lost:
        r2 = 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00b8, code lost:
        if (java.util.Arrays.binarySearch(r8.A01, 18) >= 0) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00ba, code lost:
        r2 = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00bc, code lost:
        r3 = r7.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00c0, code lost:
        if (r3 <= r8.A00) goto L_0x00c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00c2, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00c3, code lost:
        r1 = X.AnonymousClass3C1.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00c7, code lost:
        if (r1 > 28) goto L_0x00df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00c9, code lost:
        if (r3 != 7) goto L_0x00f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00cb, code lost:
        r3 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00cf, code lost:
        if (r1 > 26) goto L_0x00df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00d9, code lost:
        if ("fugu".equals(X.AnonymousClass3C1.A02) == false) goto L_0x00df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00dc, code lost:
        if (r3 != 1) goto L_0x00df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00de, code lost:
        r3 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00df, code lost:
        r0 = X.AnonymousClass3C1.A00(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00e3, code lost:
        if (r0 == 0) goto L_0x000e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x00f1, code lost:
        return android.util.Pair.create(java.lang.Integer.valueOf(r2), java.lang.Integer.valueOf(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x00f3, code lost:
        if (r3 == 3) goto L_0x00fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x00f6, code lost:
        if (r3 == 4) goto L_0x00fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x00f9, code lost:
        if (r3 != 5) goto L_0x00cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x00fb, code lost:
        r3 = 6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.util.Pair A04(X.C32491gT r7, X.C90094dU r8) {
        /*
            r6 = 0
            if (r8 == 0) goto L_0x000e
            java.lang.String r2 = r7.A0T
            java.lang.String r1 = r7.A0O
            int r0 = r2.hashCode()
            switch(r0) {
                case -2123537834: goto L_0x001a;
                case -1095064472: goto L_0x0025;
                case -53558318: goto L_0x002f;
                case 187078296: goto L_0x0046;
                case 187078297: goto L_0x0050;
                case 1504578661: goto L_0x005b;
                case 1505942594: goto L_0x0065;
                case 1556697186: goto L_0x000f;
                default: goto L_0x000e;
            }
        L_0x000e:
            return r6
        L_0x000f:
            java.lang.String r0 = "audio/true-hd"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x000e
            r2 = 14
            goto L_0x006f
        L_0x001a:
            java.lang.String r0 = "audio/eac3-joc"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x000e
            r2 = 18
            goto L_0x006f
        L_0x0025:
            java.lang.String r0 = "audio/vnd.dts"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x000e
            r2 = 7
            goto L_0x006f
        L_0x002f:
            java.lang.String r0 = "audio/mp4a-latm"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x000e
            if (r1 == 0) goto L_0x000e
            X.4GR r0 = X.C90834eu.A01(r1)
            if (r0 == 0) goto L_0x000e
            int r0 = r0.A00
            int r2 = X.C89734co.A00(r0)
            goto L_0x006f
        L_0x0046:
            java.lang.String r0 = "audio/ac3"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x000e
            r2 = 5
            goto L_0x006f
        L_0x0050:
            java.lang.String r0 = "audio/ac4"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x000e
            r2 = 17
            goto L_0x006f
        L_0x005b:
            java.lang.String r0 = "audio/eac3"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x000e
            r2 = 6
            goto L_0x006f
        L_0x0065:
            java.lang.String r0 = "audio/vnd.dts.hd"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x000e
            r2 = 8
        L_0x006f:
            r0 = 5
            r4 = 7
            r5 = 8
            r3 = 6
            r1 = 18
            if (r2 == r0) goto L_0x0088
            if (r2 == r3) goto L_0x0088
            if (r2 == r1) goto L_0x00b2
            r0 = 17
            if (r2 == r0) goto L_0x0088
            if (r2 == r4) goto L_0x0088
            if (r2 == r5) goto L_0x00a8
            r0 = 14
            if (r2 != r0) goto L_0x000e
        L_0x0088:
            int[] r0 = r8.A01
            int r0 = java.util.Arrays.binarySearch(r0, r2)
            if (r0 < 0) goto L_0x000e
            if (r2 != r1) goto L_0x00bc
            int r1 = X.AnonymousClass3C1.A01
            r0 = 29
            if (r1 < r0) goto L_0x00c3
            int r0 = r7.A0F
            int r3 = A00(r0)
            if (r3 != 0) goto L_0x00c3
            java.lang.String r1 = "DefaultAudioSink"
            java.lang.String r0 = "E-AC3 JOC encoding supported but no channel count supported"
            android.util.Log.w(r1, r0)
            return r6
        L_0x00a8:
            int[] r0 = r8.A01
            int r0 = java.util.Arrays.binarySearch(r0, r5)
            if (r0 >= 0) goto L_0x0088
            r2 = 7
            goto L_0x0088
        L_0x00b2:
            int[] r0 = r8.A01
            int r0 = java.util.Arrays.binarySearch(r0, r1)
            if (r0 >= 0) goto L_0x0088
            r2 = 6
            goto L_0x0088
        L_0x00bc:
            int r3 = r7.A06
            int r0 = r8.A00
            if (r3 <= r0) goto L_0x00c3
            return r6
        L_0x00c3:
            int r1 = X.AnonymousClass3C1.A01
            r0 = 28
            if (r1 > r0) goto L_0x00df
            if (r3 != r4) goto L_0x00f2
            r3 = 8
        L_0x00cd:
            r0 = 26
            if (r1 > r0) goto L_0x00df
            java.lang.String r1 = X.AnonymousClass3C1.A02
            java.lang.String r0 = "fugu"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00df
            r0 = 1
            if (r3 != r0) goto L_0x00df
            r3 = 2
        L_0x00df:
            int r0 = X.AnonymousClass3C1.A00(r3)
            if (r0 == 0) goto L_0x000e
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            android.util.Pair r0 = android.util.Pair.create(r1, r0)
            return r0
        L_0x00f2:
            r0 = 3
            if (r3 == r0) goto L_0x00fb
            r0 = 4
            if (r3 == r0) goto L_0x00fb
            r0 = 5
            if (r3 != r0) goto L_0x00cd
        L_0x00fb:
            r3 = 6
            goto L_0x00cd
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C96334oA.A04(X.1gT, X.4dU):android.util.Pair");
    }

    public static void A05(AudioTrack audioTrack, float f2) {
        audioTrack.setVolume(f2);
    }

    public final int A06(AudioTrack audioTrack, ByteBuffer byteBuffer, int i2, long j2) {
        AudioTrack audioTrack2 = audioTrack;
        ByteBuffer byteBuffer2 = byteBuffer;
        int i3 = i2;
        if (AnonymousClass3C1.A01 >= 26) {
            return audioTrack2.write(byteBuffer2, i3, 1, j2 * 1000);
        }
        if (this.A0N == null) {
            ByteBuffer allocate = ByteBuffer.allocate(16);
            this.A0N = allocate;
            allocate.order(ByteOrder.BIG_ENDIAN);
            this.A0N.putInt(1431633921);
        }
        if (this.A02 == 0) {
            this.A0N.putInt(4, i2);
            this.A0N.putLong(8, j2 * 1000);
            this.A0N.position(0);
            this.A02 = i2;
        }
        int remaining = this.A0N.remaining();
        if (remaining > 0) {
            int write = audioTrack.write(this.A0N, remaining, 1);
            if (write < 0) {
                this.A02 = 0;
                return write;
            } else if (write < remaining) {
                return 0;
            }
        }
        int write2 = audioTrack.write(byteBuffer, i2, 1);
        if (write2 < 0) {
            this.A02 = 0;
            return write2;
        }
        this.A02 -= write2;
        return write2;
    }

    public final long A07() {
        AnonymousClass4VA r1 = this.A0I;
        return r1.A04 == 0 ? this.A0C / ((long) r1.A05) : this.A0B;
    }

    public final AnonymousClass4LP A08() {
        AnonymousClass4LP r0 = this.A0K;
        if (r0 != null) {
            return r0;
        }
        ArrayDeque arrayDeque = this.A0j;
        return !arrayDeque.isEmpty() ? (AnonymousClass4LP) arrayDeque.getLast() : this.A0L;
    }

    public final void A09() {
        if (!this.A0W) {
            this.A0W = true;
            AnonymousClass4VJ r6 = this.A0d;
            long A072 = A07();
            r6.A0K = r6.A00();
            r6.A0L = SystemClock.elapsedRealtime() * 1000;
            r6.A07 = A072;
            this.A0D.stop();
            this.A02 = 0;
        }
    }

    public final void A0A(long j2) {
        C89214bm r4;
        boolean z2;
        if (this.A0X || !"audio/raw".equals(this.A0I.A07.A0T)) {
            r4 = C89214bm.A03;
        } else {
            AnonymousClass5LD r1 = this.A0f;
            r4 = A08().A02;
            C96294o6 r2 = ((C96354oC) r1).A01;
            float f2 = r4.A01;
            if (r2.A01 != f2) {
                r2.A01 = f2;
                r2.A0D = true;
            }
            float f3 = r4.A00;
            if (r2.A00 != f3) {
                r2.A00 = f3;
                r2.A0D = true;
            }
        }
        if (this.A0X || !"audio/raw".equals(this.A0I.A07.A0T)) {
            z2 = false;
        } else {
            AnonymousClass5LD r12 = this.A0f;
            z2 = A08().A03;
            ((C96354oC) r12).A00.A05 = z2;
        }
        this.A0j.add(new AnonymousClass4LP(r4, Math.max(0, j2), (A07() * SearchActionVerificationClientService.MS_TO_NS) / ((long) this.A0I.A06), z2));
        C109765Tm[] r5 = this.A0I.A08;
        ArrayList A0u = AnonymousClass000.A0u();
        for (C109765Tm r13 : r5) {
            if (r13.AIc()) {
                A0u.add(r13);
            } else {
                r13.flush();
            }
        }
        int size = A0u.size();
        this.A0Z = (C109765Tm[]) A0u.toArray(new C109765Tm[size]);
        this.A0a = new ByteBuffer[size];
        int i2 = 0;
        while (true) {
            C109765Tm[] r14 = this.A0Z;
            if (i2 >= r14.length) {
                break;
            }
            C109765Tm r0 = r14[i2];
            r0.flush();
            this.A0a[i2] = r0.AE7();
            i2++;
        }
        AnonymousClass5TB r02 = this.A0G;
        if (r02 != null) {
            r02.AXJ(z2);
        }
    }

    public final void A0B(long j2) {
        ByteBuffer byteBuffer;
        int length = this.A0Z.length;
        int i2 = length;
        do {
            if (i2 <= 0) {
                byteBuffer = this.A0O;
                if (byteBuffer == null) {
                    byteBuffer = C109765Tm.A00;
                }
            } else {
                byteBuffer = this.A0a[i2 - 1];
            }
            if (i2 == length) {
                A0E(byteBuffer, j2);
            } else {
                C109765Tm r1 = this.A0Z[i2];
                if (i2 > this.A03) {
                    r1.AbH(byteBuffer);
                }
                ByteBuffer AE7 = r1.AE7();
                this.A0a[i2] = AE7;
                if (AE7.hasRemaining()) {
                    i2++;
                    continue;
                }
            }
            if (!byteBuffer.hasRemaining()) {
                i2--;
                continue;
            } else {
                return;
            }
        } while (i2 >= 0);
    }

    public final void A0C(AudioTrack audioTrack) {
        AnonymousClass4UB r0 = this.A0M;
        if (r0 == null) {
            r0 = new AnonymousClass4UB(this);
            this.A0M = r0;
        }
        r0.A00(audioTrack);
    }

    public final void A0D(C89214bm r9, boolean z2) {
        AnonymousClass4LP A082 = A08();
        C89214bm r2 = r9;
        boolean z3 = z2;
        if (!r9.equals(A082.A02) || z2 != A082.A03) {
            AnonymousClass4LP r1 = new AnonymousClass4LP(r2, -9223372036854775807L, -9223372036854775807L, z3);
            if (this.A0D != null) {
                this.A0K = r1;
            } else {
                this.A0L = r1;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0063, code lost:
        if (r5 == -32) goto L_0x0065;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0E(java.nio.ByteBuffer r17, long r18) {
        /*
            r16 = this;
            r12 = r17
            boolean r0 = r12.hasRemaining()
            if (r0 == 0) goto L_0x0143
            r10 = r16
            java.nio.ByteBuffer r0 = r10.A0P
            r3 = 21
            r9 = 1
            r6 = 0
            if (r0 == 0) goto L_0x00ba
            boolean r0 = X.AnonymousClass000.A1Y(r0, r12)
            X.C90524eJ.A03(r0)
        L_0x0019:
            int r13 = r12.remaining()
            int r4 = X.AnonymousClass3C1.A01
            if (r4 >= r3) goto L_0x0098
            X.4VJ r5 = r10.A0d
            long r2 = r10.A0C
            long r7 = r5.A00()
            int r0 = r5.A03
            long r0 = (long) r0
            long r7 = r7 * r0
            long r2 = r2 - r7
            int r1 = (int) r2
            int r0 = r5.A01
            int r0 = r0 - r1
            if (r0 <= 0) goto L_0x0096
            int r3 = java.lang.Math.min(r13, r0)
            android.media.AudioTrack r2 = r10.A0D
            byte[] r1 = r10.A0Y
            int r0 = r10.A06
            int r5 = r2.write(r1, r0, r3)
            if (r5 <= 0) goto L_0x0051
            int r0 = r10.A06
            int r0 = r0 + r5
            r10.A06 = r0
            int r0 = r12.position()
            int r0 = r0 + r5
            r12.position(r0)
        L_0x0051:
            long r0 = android.os.SystemClock.elapsedRealtime()
            r10.A07 = r0
            if (r5 >= 0) goto L_0x00e0
            r0 = 24
            if (r4 < r0) goto L_0x0060
            r0 = -6
            if (r5 == r0) goto L_0x0065
        L_0x0060:
            r0 = -32
            r2 = 0
            if (r5 != r0) goto L_0x0066
        L_0x0065:
            r2 = 1
        L_0x0066:
            X.4VA r0 = r10.A0I
            X.1gT r0 = r0.A07
            X.43h r1 = new X.43h
            r1.<init>(r0, r5, r2)
            X.5TB r0 = r10.A0G
            if (r0 == 0) goto L_0x0076
            r0.AMr(r1)
        L_0x0076:
            boolean r0 = r1.isRecoverable
            if (r0 != 0) goto L_0x00df
            X.4G6 r6 = r10.A0h
            long r4 = android.os.SystemClock.elapsedRealtime()
            java.lang.Exception r3 = r6.A01
            if (r3 != 0) goto L_0x008c
            r6.A01 = r1
            r3 = r1
            r0 = 100
            long r0 = r0 + r4
            r6.A00 = r0
        L_0x008c:
            long r1 = r6.A00
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0143
            r0 = 0
            r6.A01 = r0
            throw r3
        L_0x0096:
            r5 = 0
            goto L_0x0051
        L_0x0098:
            boolean r0 = r10.A0X
            if (r0 == 0) goto L_0x00b3
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r14 = r18
            int r0 = (r18 > r1 ? 1 : (r18 == r1 ? 0 : -1))
            boolean r0 = X.AnonymousClass000.A1O(r0)
            X.C90524eJ.A04(r0)
            android.media.AudioTrack r11 = r10.A0D
            int r5 = r10.A06(r11, r12, r13, r14)
            goto L_0x0051
        L_0x00b3:
            android.media.AudioTrack r0 = r10.A0D
            int r5 = A01(r0, r12, r13)
            goto L_0x0051
        L_0x00ba:
            r10.A0P = r12
            int r0 = X.AnonymousClass3C1.A01
            if (r0 >= r3) goto L_0x0019
            int r2 = r12.remaining()
            byte[] r0 = r10.A0Y
            if (r0 == 0) goto L_0x00cb
            int r0 = r0.length
            if (r0 >= r2) goto L_0x00cf
        L_0x00cb:
            byte[] r0 = new byte[r2]
            r10.A0Y = r0
        L_0x00cf:
            int r1 = r12.position()
            byte[] r0 = r10.A0Y
            r12.get(r0, r6, r2)
            r12.position(r1)
            r10.A06 = r6
            goto L_0x0019
        L_0x00df:
            throw r1
        L_0x00e0:
            X.4G6 r1 = r10.A0h
            r0 = 0
            r1.A01 = r0
            android.media.AudioTrack r1 = r10.A0D
            r0 = 29
            if (r4 < r0) goto L_0x011d
            boolean r0 = r1.isOffloadedPlayback()
            if (r0 == 0) goto L_0x011d
            long r0 = r10.A0B
            r3 = 0
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 <= 0) goto L_0x00fb
            r10.A0S = r6
        L_0x00fb:
            boolean r2 = r10.A0T
            if (r2 == 0) goto L_0x011d
            X.5TB r2 = r10.A0G
            if (r2 == 0) goto L_0x011d
            if (r5 >= r13) goto L_0x011d
            boolean r2 = r10.A0S
            if (r2 != 0) goto L_0x011d
            X.4VJ r4 = r10.A0d
            long r2 = r4.A00()
            long r0 = r0 - r2
            long r0 = A02(r4, r0)
            long r1 = X.C90604eR.A02(r0)
            X.5TB r0 = r10.A0G
            r0.AU8(r1)
        L_0x011d:
            X.4VA r0 = r10.A0I
            int r4 = r0.A04
            if (r4 != 0) goto L_0x0129
            long r2 = r10.A0C
            long r0 = (long) r5
            long r2 = r2 + r0
            r10.A0C = r2
        L_0x0129:
            if (r5 != r13) goto L_0x0143
            if (r4 == 0) goto L_0x0140
            java.nio.ByteBuffer r0 = r10.A0O
            if (r12 == r0) goto L_0x0132
            r9 = 0
        L_0x0132:
            X.C90524eJ.A04(r9)
            long r2 = r10.A0B
            int r1 = r10.A04
            int r0 = r10.A05
            int r1 = r1 * r0
            long r0 = (long) r1
            long r2 = r2 + r0
            r10.A0B = r2
        L_0x0140:
            r0 = 0
            r10.A0P = r0
        L_0x0143:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C96334oA.A0E(java.nio.ByteBuffer, long):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0037, code lost:
        if (r9.A0P != null) goto L_0x0039;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0015  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0F() {
        /*
            r9 = this;
            int r8 = r9.A03
            r7 = -1
            r6 = 1
            r5 = 0
            if (r8 != r7) goto L_0x002c
            r9.A03 = r5
            r8 = 0
        L_0x000a:
            r4 = 1
        L_0x000b:
            X.5Tm[] r3 = r9.A0Z
            int r0 = r3.length
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r8 >= r0) goto L_0x002e
            r0 = r3[r8]
            if (r4 == 0) goto L_0x001c
            r0.AbG()
        L_0x001c:
            r9.A0B(r1)
            boolean r0 = r0.AIm()
            if (r0 == 0) goto L_0x0039
            int r0 = r9.A03
            int r8 = r0 + 1
            r9.A03 = r8
            goto L_0x000a
        L_0x002c:
            r4 = 0
            goto L_0x000b
        L_0x002e:
            java.nio.ByteBuffer r0 = r9.A0P
            if (r0 == 0) goto L_0x003a
            r9.A0E(r0, r1)
            java.nio.ByteBuffer r0 = r9.A0P
            if (r0 == 0) goto L_0x003a
        L_0x0039:
            return r5
        L_0x003a:
            r9.A03 = r7
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C96334oA.A0F():boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x004d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A6X(X.C32491gT r14, int[] r15, int r16) {
        /*
            r13 = this;
            r2 = 0
            r5 = r14
            java.lang.String r1 = r14.A0T
            java.lang.String r0 = "audio/raw"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0074
            int r3 = r14.A0B
            boolean r0 = X.AnonymousClass3C1.A0E(r3)
            X.C90524eJ.A03(r0)
            int r2 = r14.A06
            int r7 = X.AnonymousClass3C1.A02(r3, r2)
            X.5Tm[] r6 = r13.A0l
            X.3UU r4 = r13.A0i
            int r1 = r14.A07
            int r0 = r14.A08
            r4.A03 = r1
            r4.A02 = r0
            int r1 = X.AnonymousClass3C1.A01
            r0 = 21
            if (r1 >= r0) goto L_0x003e
            r0 = 8
            if (r2 != r0) goto L_0x003e
            if (r15 != 0) goto L_0x003e
            r1 = 6
            int[] r15 = new int[r1]
            r0 = 0
        L_0x0037:
            r15[r0] = r0
            int r0 = r0 + 1
            if (r0 >= r1) goto L_0x003e
            goto L_0x0037
        L_0x003e:
            X.3UT r0 = r13.A0e
            r0.A01 = r15
            int r0 = r14.A0F
            X.4b0 r4 = new X.4b0
            r4.<init>(r0, r2, r3)
            int r3 = r6.length
            r2 = 0
        L_0x004b:
            if (r2 >= r3) goto L_0x0064
            r0 = r6[r2]
            X.4b0 r1 = r0.A6W(r4)     // Catch:{ 43M -> 0x005d }
            boolean r0 = r0.AIc()     // Catch:{ 43M -> 0x005d }
            if (r0 == 0) goto L_0x005a
            r4 = r1
        L_0x005a:
            int r2 = r2 + 1
            goto L_0x004b
        L_0x005d:
            r1 = move-exception
            X.43u r0 = new X.43u
            r0.<init>((X.C32491gT) r14, (java.lang.Throwable) r1)
            throw r0
        L_0x0064:
            int r12 = r4.A02
            int r10 = r4.A03
            int r0 = r4.A01
            int r11 = X.AnonymousClass3C1.A00(r0)
            int r9 = X.AnonymousClass3C1.A02(r12, r0)
            r8 = 0
            goto L_0x008f
        L_0x0074:
            X.5Tm[] r6 = new X.C109765Tm[r2]
            int r10 = r14.A0F
            X.4dU r0 = r13.A0c
            android.util.Pair r1 = A04(r14, r0)
            if (r1 == 0) goto L_0x00d0
            java.lang.Object r0 = r1.first
            int r12 = X.AnonymousClass000.A0D(r0)
            java.lang.Object r0 = r1.second
            int r11 = X.AnonymousClass000.A0D(r0)
            r7 = -1
            r9 = -1
            r8 = 2
        L_0x008f:
            java.lang.String r1 = ") for: "
            if (r12 == 0) goto L_0x00ba
            if (r11 == 0) goto L_0x00a4
            X.4VA r4 = new X.4VA
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            android.media.AudioTrack r0 = r13.A0D
            if (r0 == 0) goto L_0x00a1
            r13.A0J = r4
            return
        L_0x00a1:
            r13.A0I = r4
            return
        L_0x00a4:
            java.lang.String r0 = "Invalid output channel config (mode="
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0r(r0)
            r0.append(r8)
            r0.append(r1)
            java.lang.String r1 = X.AnonymousClass000.A0f(r14, r0)
            X.43u r0 = new X.43u
            r0.<init>((X.C32491gT) r14, (java.lang.String) r1)
            throw r0
        L_0x00ba:
            java.lang.String r0 = "Invalid output encoding (mode="
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0r(r0)
            r0.append(r8)
            r0.append(r1)
            java.lang.String r1 = X.AnonymousClass000.A0f(r14, r0)
            X.43u r0 = new X.43u
            r0.<init>((X.C32491gT) r14, (java.lang.String) r1)
            throw r0
        L_0x00d0:
            java.lang.String r0 = "Unable to configure passthrough for: "
            java.lang.String r1 = X.AnonymousClass000.A0g(r0, r14)
            X.43u r0 = new X.43u
            r0.<init>((X.C32491gT) r14, (java.lang.String) r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C96334oA.A6X(X.1gT, int[], int):void");
    }

    public long ABR(boolean z2) {
        boolean z3;
        long A022;
        ArrayDeque arrayDeque;
        long j2;
        long j3;
        Method method;
        C96344oB r13;
        String str;
        if (this.A0D == null || this.A0U) {
            return Long.MIN_VALUE;
        }
        AnonymousClass4VJ r9 = this.A0d;
        if (r9.A0M.getPlayState() == 3) {
            long A023 = A02(r9, r9.A00());
            long j4 = 0;
            if (A023 != 0) {
                long A092 = C13690nt.A09(System.nanoTime());
                if (A092 - r9.A0A >= AnonymousClass1NO.A0L) {
                    long[] jArr = r9.A0V;
                    int i2 = r9.A02;
                    jArr[i2] = A023 - A092;
                    r9.A02 = (i2 + 1) % 10;
                    int i3 = r9.A05;
                    if (i3 < 10) {
                        i3++;
                        r9.A05 = i3;
                    }
                    r9.A0A = A092;
                    r9.A0J = 0;
                    for (int i4 = 0; i4 < i3; i4++) {
                        j4 += jArr[i4] / ((long) i3);
                        r9.A0J = j4;
                    }
                }
                if (!r9.A0S) {
                    C87434Wt r10 = r9.A0N;
                    if (r10.A03(A092)) {
                        long A012 = r10.A01();
                        long A002 = r10.A00();
                        if (Math.abs(A012 - A092) > 5000000) {
                            r13 = (C96344oB) r9.A0U;
                            str = "Spurious audio timestamp (system clock mismatch): ";
                        } else if (Math.abs(A02(r9, A002) - A023) > 5000000) {
                            r13 = (C96344oB) r9.A0U;
                            str = "Spurious audio timestamp (frame position mismatch): ";
                        } else if (r10.A00 == 4) {
                            r10.A02();
                        }
                        StringBuilder A0r = AnonymousClass000.A0r(str);
                        A0r.append(A002);
                        A0r.append(", ");
                        A0r.append(A012);
                        A0r.append(", ");
                        A0r.append(A092);
                        A0r.append(", ");
                        A0r.append(A023);
                        A0r.append(", ");
                        C96334oA r6 = r13.A00;
                        AnonymousClass4VA r4 = r6.A0I;
                        A0r.append(r4.A04 == 0 ? r6.A0A / ((long) r4.A01) : r6.A09);
                        A0r.append(", ");
                        Log.w("DefaultAudioSink", C13680ns.A0j(A0r, r6.A07()));
                        r10.A00 = 4;
                        r10.A04 = 500000;
                    }
                    if (r9.A0Q && (method = r9.A0O) != null && A092 - r9.A09 >= 500000) {
                        try {
                            long intValue = (((long) ((Integer) method.invoke(r9.A0M, new Object[0])).intValue()) * 1000) - r9.A06;
                            r9.A0E = intValue;
                            long max = Math.max(intValue, 0);
                            r9.A0E = max;
                            if (max > 5000000) {
                                Log.w("DefaultAudioSink", C13680ns.A0j(AnonymousClass000.A0r("Ignoring impossibly large audio latency: "), max));
                                r9.A0E = 0;
                            }
                        } catch (Exception unused) {
                            r9.A0O = null;
                        }
                        r9.A09 = A092;
                    }
                }
            }
        }
        long nanoTime = System.nanoTime() / 1000;
        C87434Wt r2 = r9.A0N;
        if (r2.A00 == 2) {
            z3 = true;
            long A024 = A02(r9, r2.A00());
            long A013 = nanoTime - r2.A01();
            float f2 = r9.A00;
            if (f2 != 1.0f) {
                A013 = Math.round(((double) A013) * ((double) f2));
            }
            A022 = A024 + A013;
        } else {
            z3 = false;
            A022 = r9.A05 == 0 ? A02(r9, r9.A00()) : r9.A0J + nanoTime;
            if (!z2) {
                A022 = Math.max(0, A022 - r9.A0E);
            }
        }
        if (r9.A0R != z3) {
            r9.A0H = r9.A0D;
            r9.A0G = r9.A0B;
        }
        long j5 = nanoTime - r9.A0H;
        if (j5 < SearchActionVerificationClientService.MS_TO_NS) {
            long j6 = r9.A0G;
            float f3 = r9.A00;
            long j7 = j5;
            if (f3 != 1.0f) {
                j7 = Math.round(((double) j5) * ((double) f3));
            }
            long j8 = (j5 * 1000) / SearchActionVerificationClientService.MS_TO_NS;
            A022 = ((A022 * j8) + ((1000 - j8) * (j6 + j7))) / 1000;
        }
        if (!r9.A0T) {
            long j9 = r9.A0B;
            if (A022 > j9) {
                r9.A0T = true;
                long A025 = C90604eR.A02(A022 - j9);
                float f4 = r9.A00;
                if (f4 != 1.0f) {
                    A025 = Math.round(((double) A025) / ((double) f4));
                }
                long currentTimeMillis = System.currentTimeMillis() - C90604eR.A02(A025);
                AnonymousClass5TB r22 = ((C96344oB) r9.A0U).A00.A0G;
                if (r22 != null) {
                    r22.AUw(currentTimeMillis);
                }
            }
        }
        r9.A0D = nanoTime;
        r9.A0B = A022;
        r9.A0R = z3;
        long min = Math.min(A022, (A07() * SearchActionVerificationClientService.MS_TO_NS) / ((long) this.A0I.A06));
        while (true) {
            arrayDeque = this.A0j;
            if (arrayDeque.isEmpty() || min < ((AnonymousClass4LP) arrayDeque.getFirst()).A00) {
                AnonymousClass4LP r23 = this.A0L;
                long j10 = min - r23.A00;
            } else {
                this.A0L = (AnonymousClass4LP) arrayDeque.remove();
            }
        }
        AnonymousClass4LP r232 = this.A0L;
        long j102 = min - r232.A00;
        if (r232.A02.equals(C89214bm.A03)) {
            j3 = r232.A01;
        } else if (arrayDeque.isEmpty()) {
            C96294o6 r24 = ((C96354oC) this.A0f).A01;
            long j11 = r24.A03;
            if (j11 >= FileUtils.ONE_KB) {
                long j12 = r24.A02;
                AnonymousClass4X8 r0 = r24.A08;
                long j13 = j12 - ((long) ((r0.A00 * r0.A0G) << 1));
                int i5 = r24.A05.A03;
                int i6 = r24.A04.A03;
                if (i5 != i6) {
                    j13 *= (long) i5;
                    j11 *= (long) i6;
                }
                j102 = AnonymousClass3C1.A05(j102, j13, j11);
            } else {
                j102 = (long) (((double) r24.A01) * ((double) j102));
            }
            j3 = this.A0L.A01;
        } else {
            AnonymousClass4LP r62 = (AnonymousClass4LP) arrayDeque.getFirst();
            long j14 = r62.A00 - min;
            float f5 = this.A0L.A02.A01;
            if (f5 != 1.0f) {
                j14 = Math.round(((double) j14) * ((double) f5));
            }
            j2 = r62.A01 - j14;
            return j2 + ((((C96354oC) this.A0f).A00.A04 * SearchActionVerificationClientService.MS_TO_NS) / ((long) this.A0I.A06));
        }
        j2 = j3 + j102;
        return j2 + ((((C96354oC) this.A0f).A00.A04 * SearchActionVerificationClientService.MS_TO_NS) / ((long) this.A0I.A06));
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002c A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int ACO(X.C32491gT r5) {
        /*
            r4 = this;
            java.lang.String r1 = r5.A0T
            java.lang.String r0 = "audio/raw"
            boolean r0 = r0.equals(r1)
            r3 = 0
            r2 = 2
            if (r0 == 0) goto L_0x0024
            int r1 = r5.A0B
            boolean r0 = X.AnonymousClass3C1.A0E(r1)
            if (r0 != 0) goto L_0x0020
            java.lang.String r0 = "Invalid PCM encoding: "
            java.lang.String r1 = X.C13680ns.A0c(r1, r0)
            java.lang.String r0 = "DefaultAudioSink"
            android.util.Log.w(r0, r1)
        L_0x001f:
            return r3
        L_0x0020:
            if (r1 == r2) goto L_0x002c
            r0 = 1
            return r0
        L_0x0024:
            X.4dU r0 = r4.A0c
            android.util.Pair r0 = A04(r5, r0)
            if (r0 == 0) goto L_0x001f
        L_0x002c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C96334oA.ACO(X.1gT):int");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x044c, code lost:
        if (r8 != 3) goto L_0x044e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x0452, code lost:
        if (r8 == r5) goto L_0x0454;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x0457, code lost:
        if (r8 != 3) goto L_0x0452;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x045a, code lost:
        r12 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        if (r7 == r2) goto L_0x000d;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:85:0x0187 */
    /* JADX WARNING: Removed duplicated region for block: B:262:0x04df  */
    /* JADX WARNING: Removed duplicated region for block: B:268:0x04fe  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0194 A[Catch:{ IllegalArgumentException | UnsupportedOperationException -> 0x01a2, 43g -> 0x01b8 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean AHJ(java.nio.ByteBuffer r29, int r30, long r31) {
        /*
            r28 = this;
            r0 = r28
            java.nio.ByteBuffer r2 = r0.A0O
            r13 = 1
            r15 = 0
            r7 = r29
            if (r2 == 0) goto L_0x000d
            r1 = 0
            if (r7 != r2) goto L_0x000e
        L_0x000d:
            r1 = 1
        L_0x000e:
            X.C90524eJ.A03(r1)
            X.4VA r3 = r0.A0J
            r19 = 0
            r1 = r31
            if (r3 == 0) goto L_0x006c
            boolean r3 = r0.A0F()
            if (r3 == 0) goto L_0x0538
            X.4VA r5 = r0.A0J
            X.4VA r6 = r0.A0I
            int r4 = r6.A04
            int r3 = r5.A04
            if (r4 != r3) goto L_0x0071
            int r4 = r6.A03
            int r3 = r5.A03
            if (r4 != r3) goto L_0x0071
            int r4 = r6.A06
            int r3 = r5.A06
            if (r4 != r3) goto L_0x0071
            int r4 = r6.A02
            int r3 = r5.A02
            if (r4 != r3) goto L_0x0071
            int r4 = r6.A05
            int r3 = r5.A05
            if (r4 != r3) goto L_0x0071
            r0.A0I = r5
            r3 = r19
            r0.A0J = r3
            android.media.AudioTrack r5 = r0.A0D
            int r4 = X.AnonymousClass3C1.A01
            r3 = 29
            if (r4 < r3) goto L_0x0069
            boolean r3 = r5.isOffloadedPlayback()
            if (r3 == 0) goto L_0x0069
            android.media.AudioTrack r3 = r0.A0D
            r3.setOffloadEndOfStream()
            android.media.AudioTrack r5 = r0.A0D
            X.4VA r3 = r0.A0I
            X.1gT r3 = r3.A07
            int r4 = r3.A07
            int r3 = r3.A08
            r5.setOffloadDelayPadding(r4, r3)
            r0.A0S = r13
        L_0x0069:
            r0.A0A(r1)
        L_0x006c:
            android.media.AudioTrack r3 = r0.A0D
            if (r3 != 0) goto L_0x01e4
            goto L_0x007e
        L_0x0071:
            r0.A09()
            boolean r3 = r0.AHd()
            if (r3 != 0) goto L_0x0538
            r0.flush()
            goto L_0x0069
        L_0x007e:
            android.os.ConditionVariable r3 = r0.A0b     // Catch:{ 43g -> 0x01c1 }
            r3.block()     // Catch:{ 43g -> 0x01c1 }
            X.4VA r3 = r0.A0I     // Catch:{ 43g -> 0x01b8 }
            boolean r6 = r0.A0X     // Catch:{ 43g -> 0x01b8 }
            X.4bh r5 = r0.A0F     // Catch:{ 43g -> 0x01b8 }
            int r11 = r0.A01     // Catch:{ 43g -> 0x01b8 }
            int r10 = X.AnonymousClass3C1.A01     // Catch:{ IllegalArgumentException | UnsupportedOperationException -> 0x01a2 }
            r4 = 29
            if (r10 < r4) goto L_0x0096
            android.media.AudioTrack r6 = r3.A01(r5, r11, r6)     // Catch:{ IllegalArgumentException | UnsupportedOperationException -> 0x01a2 }
            goto L_0x00d9
        L_0x0096:
            r4 = 21
            if (r10 < r4) goto L_0x009f
            android.media.AudioTrack r6 = r3.A00(r5, r11, r6)     // Catch:{ IllegalArgumentException | UnsupportedOperationException -> 0x01a2 }
            goto L_0x00d9
        L_0x009f:
            int r4 = r5.A01     // Catch:{ IllegalArgumentException | UnsupportedOperationException -> 0x01a2 }
            int r4 = 2 - r4
            if (r4 == 0) goto L_0x00a8
            r21 = 3
            goto L_0x00aa
        L_0x00a8:
            r21 = 0
        L_0x00aa:
            int r9 = r3.A06     // Catch:{ IllegalArgumentException | UnsupportedOperationException -> 0x01a2 }
            int r8 = r3.A02     // Catch:{ IllegalArgumentException | UnsupportedOperationException -> 0x01a2 }
            int r5 = r3.A03     // Catch:{ IllegalArgumentException | UnsupportedOperationException -> 0x01a2 }
            int r4 = r3.A00     // Catch:{ IllegalArgumentException | UnsupportedOperationException -> 0x01a2 }
            if (r11 != 0) goto L_0x00c6
            android.media.AudioTrack r6 = new android.media.AudioTrack     // Catch:{ IllegalArgumentException | UnsupportedOperationException -> 0x01a2 }
            r26 = 1
            r24 = r5
            r25 = r4
            r20 = r6
            r22 = r9
            r23 = r8
            r20.<init>(r21, r22, r23, r24, r25, r26)     // Catch:{ IllegalArgumentException | UnsupportedOperationException -> 0x01a2 }
            goto L_0x00d9
        L_0x00c6:
            android.media.AudioTrack r6 = new android.media.AudioTrack     // Catch:{ IllegalArgumentException | UnsupportedOperationException -> 0x01a2 }
            r26 = 1
            r24 = r5
            r25 = r4
            r27 = r11
            r20 = r6
            r22 = r9
            r23 = r8
            r20.<init>(r21, r22, r23, r24, r25, r26, r27)     // Catch:{ IllegalArgumentException | UnsupportedOperationException -> 0x01a2 }
        L_0x00d9:
            int r8 = r6.getState()     // Catch:{ 43g -> 0x01b8 }
            if (r8 != r13) goto L_0x0184
            r0.A0D = r6     // Catch:{ 43g -> 0x01c1 }
            r3 = 29
            if (r10 < r3) goto L_0x00fd
            boolean r3 = r6.isOffloadedPlayback()     // Catch:{ 43g -> 0x01c1 }
            if (r3 == 0) goto L_0x00fd
            android.media.AudioTrack r3 = r0.A0D     // Catch:{ 43g -> 0x01c1 }
            r0.A0C(r3)     // Catch:{ 43g -> 0x01c1 }
            android.media.AudioTrack r5 = r0.A0D     // Catch:{ 43g -> 0x01c1 }
            X.4VA r3 = r0.A0I     // Catch:{ 43g -> 0x01c1 }
            X.1gT r3 = r3.A07     // Catch:{ 43g -> 0x01c1 }
            int r4 = r3.A07     // Catch:{ 43g -> 0x01c1 }
            int r3 = r3.A08     // Catch:{ 43g -> 0x01c1 }
            r5.setOffloadDelayPadding(r4, r3)     // Catch:{ 43g -> 0x01c1 }
        L_0x00fd:
            android.media.AudioTrack r3 = r0.A0D     // Catch:{ 43g -> 0x01c1 }
            int r3 = r3.getAudioSessionId()     // Catch:{ 43g -> 0x01c1 }
            r0.A01 = r3     // Catch:{ 43g -> 0x01c1 }
            X.4VJ r11 = r0.A0d     // Catch:{ 43g -> 0x01c1 }
            android.media.AudioTrack r9 = r0.A0D     // Catch:{ 43g -> 0x01c1 }
            X.4VA r12 = r0.A0I     // Catch:{ 43g -> 0x01c1 }
            int r4 = r12.A04     // Catch:{ 43g -> 0x01c1 }
            r3 = 2
            boolean r6 = X.AnonymousClass000.A1R(r4, r3)
            int r5 = r12.A03     // Catch:{ 43g -> 0x01c1 }
            int r8 = r12.A05     // Catch:{ 43g -> 0x01c1 }
            int r4 = r12.A00     // Catch:{ 43g -> 0x01c1 }
            r11.A0M = r9     // Catch:{ 43g -> 0x01c1 }
            r11.A03 = r8     // Catch:{ 43g -> 0x01c1 }
            r11.A01 = r4     // Catch:{ 43g -> 0x01c1 }
            X.4Wt r3 = new X.4Wt     // Catch:{ 43g -> 0x01c1 }
            r3.<init>(r9)     // Catch:{ 43g -> 0x01c1 }
            r11.A0N = r3     // Catch:{ 43g -> 0x01c1 }
            int r12 = r9.getSampleRate()     // Catch:{ 43g -> 0x01c1 }
            r11.A04 = r12     // Catch:{ 43g -> 0x01c1 }
            if (r6 == 0) goto L_0x0139
            r3 = 23
            if (r10 >= r3) goto L_0x0139
            r3 = 5
            if (r5 == r3) goto L_0x0137
            r3 = 6
            if (r5 != r3) goto L_0x0139
        L_0x0137:
            r3 = 1
            goto L_0x013a
        L_0x0139:
            r3 = 0
        L_0x013a:
            r11.A0S = r3     // Catch:{ 43g -> 0x01c1 }
            boolean r3 = X.AnonymousClass3C1.A0E(r5)     // Catch:{ 43g -> 0x01c1 }
            r11.A0Q = r3     // Catch:{ 43g -> 0x01c1 }
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r3 == 0) goto L_0x014a
            goto L_0x0150
        L_0x014a:
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x0158
        L_0x0150:
            int r4 = r4 / r8
            long r8 = (long) r4     // Catch:{ 43g -> 0x01c1 }
            r3 = 1000000(0xf4240, double:4.940656E-318)
            long r8 = r8 * r3
            long r3 = (long) r12     // Catch:{ 43g -> 0x01c1 }
            long r8 = r8 / r3
        L_0x0158:
            r11.A06 = r8     // Catch:{ 43g -> 0x01c1 }
            r3 = 0
            r11.A0C = r3     // Catch:{ 43g -> 0x01c1 }
            r11.A0I = r3     // Catch:{ 43g -> 0x01c1 }
            r11.A0F = r3     // Catch:{ 43g -> 0x01c1 }
            r11.A0P = r15     // Catch:{ 43g -> 0x01c1 }
            r11.A0L = r5     // Catch:{ 43g -> 0x01c1 }
            r11.A08 = r5     // Catch:{ 43g -> 0x01c1 }
            r11.A09 = r3     // Catch:{ 43g -> 0x01c1 }
            r11.A0E = r3     // Catch:{ 43g -> 0x01c1 }
            r3 = 1065353216(0x3f800000, float:1.0)
            r11.A00 = r3     // Catch:{ 43g -> 0x01c1 }
            android.media.AudioTrack r5 = r0.A0D     // Catch:{ 43g -> 0x01c1 }
            if (r5 == 0) goto L_0x017d
            r4 = 21
            float r3 = r0.A00     // Catch:{ 43g -> 0x01c1 }
            if (r10 < r4) goto L_0x0180
            A05(r5, r3)     // Catch:{ 43g -> 0x01c1 }
        L_0x017d:
            r0.A0U = r13     // Catch:{ 43g -> 0x01c1 }
            goto L_0x01e4
        L_0x0180:
            r5.setStereoVolume(r3, r3)     // Catch:{ 43g -> 0x01c1 }
            goto L_0x017d
        L_0x0184:
            r6.release()     // Catch:{ Exception -> 0x0187 }
        L_0x0187:
            int r6 = r3.A06     // Catch:{ 43g -> 0x01b8 }
            int r5 = r3.A02     // Catch:{ 43g -> 0x01b8 }
            int r4 = r3.A00     // Catch:{ 43g -> 0x01b8 }
            X.1gT r2 = r3.A07     // Catch:{ 43g -> 0x01b8 }
            int r1 = r3.A04     // Catch:{ 43g -> 0x01b8 }
            r14 = 1
            if (r1 == r13) goto L_0x0195
            r14 = 0
        L_0x0195:
            X.43g r7 = new X.43g     // Catch:{ 43g -> 0x01b8 }
            r9 = r19
            r10 = r8
            r11 = r6
            r12 = r5
            r13 = r4
            r8 = r2
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)     // Catch:{ 43g -> 0x01b8 }
            throw r7     // Catch:{ 43g -> 0x01b8 }
        L_0x01a2:
            r5 = move-exception
            int r7 = r3.A06     // Catch:{ 43g -> 0x01b8 }
            int r8 = r3.A02     // Catch:{ 43g -> 0x01b8 }
            int r9 = r3.A00     // Catch:{ 43g -> 0x01b8 }
            X.1gT r4 = r3.A07     // Catch:{ 43g -> 0x01b8 }
            int r1 = r3.A04     // Catch:{ 43g -> 0x01b8 }
            r10 = 1
            if (r1 == r13) goto L_0x01b1
            r10 = 0
        L_0x01b1:
            r6 = 0
            X.43g r3 = new X.43g     // Catch:{ 43g -> 0x01b8 }
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ 43g -> 0x01b8 }
            throw r3     // Catch:{ 43g -> 0x01b8 }
        L_0x01b8:
            r2 = move-exception
            X.5TB r1 = r0.A0G     // Catch:{ 43g -> 0x01c1 }
            if (r1 == 0) goto L_0x01c0
            r1.AMr(r2)     // Catch:{ 43g -> 0x01c1 }
        L_0x01c0:
            throw r2     // Catch:{ 43g -> 0x01c1 }
        L_0x01c1:
            r2 = move-exception
            boolean r1 = r2.isRecoverable
            if (r1 != 0) goto L_0x01e3
            X.4G6 r6 = r0.A0g
            long r4 = android.os.SystemClock.elapsedRealtime()
            java.lang.Exception r3 = r6.A01
            if (r3 != 0) goto L_0x01d8
            r6.A01 = r2
            r3 = r2
            r0 = 100
            long r0 = r0 + r4
            r6.A00 = r0
        L_0x01d8:
            long r1 = r6.A00
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0538
            r0 = r19
            r6.A01 = r0
            throw r3
        L_0x01e3:
            throw r2
        L_0x01e4:
            X.4G6 r4 = r0.A0g
            r3 = r19
            r4.A01 = r3
            boolean r5 = r0.A0U
            r3 = 0
            if (r5 == 0) goto L_0x0211
            long r5 = java.lang.Math.max(r3, r1)
            r0.A08 = r5
            r0.A0V = r15
            r0.A0U = r15
            r0.A0A(r1)
            boolean r5 = r0.A0T
            if (r5 == 0) goto L_0x0211
            r0.A0T = r13
            android.media.AudioTrack r6 = r0.A0D
            if (r6 == 0) goto L_0x0211
            X.4VJ r5 = r0.A0d
            X.4Wt r5 = r5.A0N
            r5.A02()
            r6.play()
        L_0x0211:
            X.4VJ r10 = r0.A0d
            long r16 = r0.A07()
            android.media.AudioTrack r5 = r10.A0M
            int r11 = r5.getPlayState()
            boolean r5 = r10.A0S
            if (r5 == 0) goto L_0x0232
            r5 = 2
            if (r11 != r5) goto L_0x0227
            r10.A0P = r15
            return r15
        L_0x0227:
            if (r11 != r13) goto L_0x0232
            long r8 = r10.A00()
            int r5 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x0232
            return r15
        L_0x0232:
            boolean r6 = r10.A0P
            long r8 = r10.A00()
            int r5 = (r16 > r8 ? 1 : (r16 == r8 ? 0 : -1))
            if (r5 > 0) goto L_0x0251
            boolean r5 = r10.A0S
            if (r5 == 0) goto L_0x02b1
            android.media.AudioTrack r5 = r10.A0M
            int r8 = r5.getPlayState()
            r5 = 2
            if (r8 != r5) goto L_0x02b1
            long r8 = r10.A00()
            int r5 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x02b1
        L_0x0251:
            r5 = 1
        L_0x0252:
            r10.A0P = r5
            if (r6 == 0) goto L_0x027b
            if (r5 != 0) goto L_0x027b
            if (r11 == r13) goto L_0x027b
            X.5LC r8 = r10.A0U
            int r9 = r10.A01
            long r5 = r10.A06
            long r22 = X.C90604eR.A02(r5)
            X.4oB r8 = (X.C96344oB) r8
            X.4oA r5 = r8.A00
            X.5TB r8 = r5.A0G
            if (r8 == 0) goto L_0x027b
            long r24 = android.os.SystemClock.elapsedRealtime()
            long r5 = r5.A07
            long r24 = r24 - r5
            r20 = r8
            r21 = r9
            r20.AZL(r21, r22, r24)
        L_0x027b:
            java.nio.ByteBuffer r5 = r0.A0O
            java.lang.String r18 = "DefaultAudioSink"
            if (r5 != 0) goto L_0x04ed
            java.nio.ByteOrder r6 = r7.order()
            java.nio.ByteOrder r5 = java.nio.ByteOrder.LITTLE_ENDIAN
            boolean r5 = X.AnonymousClass000.A1Y(r6, r5)
            X.C90524eJ.A03(r5)
            boolean r5 = r7.hasRemaining()
            if (r5 == 0) goto L_0x0537
            X.4VA r6 = r0.A0I
            int r5 = r6.A04
            if (r5 == 0) goto L_0x045c
            int r5 = r0.A04
            if (r5 != 0) goto L_0x045c
            int r5 = r6.A03
            r12 = 1024(0x400, float:1.435E-42)
            r9 = -1
            switch(r5) {
                case 5: goto L_0x030c;
                case 6: goto L_0x030c;
                case 7: goto L_0x02b3;
                case 8: goto L_0x02b3;
                case 9: goto L_0x0348;
                case 10: goto L_0x0432;
                case 11: goto L_0x0367;
                case 12: goto L_0x0367;
                case 13: goto L_0x02a6;
                case 14: goto L_0x036b;
                case 15: goto L_0x03c4;
                case 16: goto L_0x0432;
                case 17: goto L_0x03c7;
                case 18: goto L_0x030c;
                default: goto L_0x02a6;
            }
        L_0x02a6:
            java.lang.String r0 = "Unexpected audio encoding: "
            java.lang.String r0 = X.C13680ns.A0c(r5, r0)
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0V(r0)
            throw r0
        L_0x02b1:
            r5 = 0
            goto L_0x0252
        L_0x02b3:
            int r6 = r7.position()
            byte r8 = r7.get(r6)
            r5 = -2
            if (r8 == r5) goto L_0x02ff
            if (r8 == r9) goto L_0x02df
            r5 = 31
            if (r8 == r5) goto L_0x02ec
            int r5 = r6 + 4
            byte r5 = r7.get(r5)
            r5 = r5 & 1
            int r8 = r5 << 6
            int r5 = r6 + 5
        L_0x02d0:
            byte r5 = r7.get(r5)
            r5 = r5 & 252(0xfc, float:3.53E-43)
        L_0x02d6:
            int r5 = r5 >> 2
            r5 = r5 | r8
            int r5 = r5 + 1
            int r12 = r5 << 5
            goto L_0x0432
        L_0x02df:
            int r5 = r6 + 4
            byte r5 = r7.get(r5)
            r5 = r5 & 7
            int r8 = r5 << 4
            int r5 = r6 + 7
            goto L_0x02f8
        L_0x02ec:
            int r5 = r6 + 5
            byte r5 = r7.get(r5)
            r5 = r5 & 7
            int r8 = r5 << 4
            int r5 = r6 + 6
        L_0x02f8:
            byte r5 = r7.get(r5)
            r5 = r5 & 60
            goto L_0x02d6
        L_0x02ff:
            int r5 = r6 + 5
            byte r5 = r7.get(r5)
            r5 = r5 & 1
            int r8 = r5 << 6
            int r5 = r6 + 4
            goto L_0x02d0
        L_0x030c:
            int r5 = r7.position()
            int r5 = r5 + 5
            byte r5 = r7.get(r5)
            r8 = r5 & 248(0xf8, float:3.48E-43)
            r6 = 3
            int r8 = r8 >> r6
            r5 = 10
            if (r8 <= r5) goto L_0x0344
            int r5 = r7.position()
            int r5 = r5 + 4
            byte r5 = r7.get(r5)
            r5 = r5 & 192(0xc0, float:2.69E-43)
            int r5 = r5 >> 6
            if (r5 == r6) goto L_0x033c
            int r5 = r7.position()
            int r5 = r5 + 4
            byte r5 = r7.get(r5)
            r5 = r5 & 48
            int r6 = r5 >> 4
        L_0x033c:
            int[] r5 = X.AnonymousClass4ZE.A01
            r5 = r5[r6]
            int r12 = r5 << 8
            goto L_0x0432
        L_0x0344:
            r12 = 1536(0x600, float:2.152E-42)
            goto L_0x0432
        L_0x0348:
            int r5 = r7.position()
            int r8 = r7.getInt(r5)
            java.nio.ByteOrder r6 = r7.order()
            java.nio.ByteOrder r5 = java.nio.ByteOrder.BIG_ENDIAN
            if (r6 == r5) goto L_0x035c
            int r8 = java.lang.Integer.reverseBytes(r8)
        L_0x035c:
            int r12 = X.C89824cz.A01(r8)
            if (r12 != r9) goto L_0x0432
            java.lang.IllegalArgumentException r0 = X.AnonymousClass3K3.A0f()
            throw r0
        L_0x0367:
            r12 = 2048(0x800, float:2.87E-42)
            goto L_0x0432
        L_0x036b:
            int r14 = r7.position()
            int r5 = r7.limit()
            int r8 = r5 + -10
            r11 = r14
        L_0x0376:
            if (r11 > r8) goto L_0x045a
            int r5 = r11 + 4
            int r12 = r7.getInt(r5)
            java.nio.ByteOrder r6 = r7.order()
            java.nio.ByteOrder r5 = java.nio.ByteOrder.BIG_ENDIAN
            if (r6 == r5) goto L_0x038a
            int r12 = java.lang.Integer.reverseBytes(r12)
        L_0x038a:
            r6 = r12 & -2
            r5 = -126718022(0xfffffffff8726fba, float:-1.966878E34)
            if (r6 != r5) goto L_0x03c1
            int r11 = r11 - r14
            if (r11 == r9) goto L_0x045a
            int r5 = r7.position()
            int r5 = r5 + r11
            int r5 = r5 + 7
            byte r5 = r7.get(r5)
            r6 = r5 & 255(0xff, float:3.57E-43)
            r5 = 187(0xbb, float:2.62E-43)
            boolean r9 = X.AnonymousClass000.A1R(r6, r5)
            r8 = 40
            int r6 = r7.position()
            int r6 = r6 + r11
            r5 = 8
            if (r9 == 0) goto L_0x03b4
            r5 = 9
        L_0x03b4:
            int r6 = r6 + r5
            byte r5 = r7.get(r6)
            int r5 = r5 >> 4
            r5 = r5 & 7
            int r8 = r8 << r5
            int r12 = r8 << 4
            goto L_0x0432
        L_0x03c1:
            int r11 = r11 + 1
            goto L_0x0376
        L_0x03c4:
            r12 = 512(0x200, float:7.175E-43)
            goto L_0x0432
        L_0x03c7:
            r9 = 16
            byte[] r6 = new byte[r9]
            int r5 = r7.position()
            r7.get(r6)
            r7.position(r5)
            X.4dh r8 = new X.4dh
            r8.<init>(r6, r9)
            r8.A04(r9)
            int r6 = r8.A04(r9)
            r14 = 4
            r5 = 65535(0xffff, float:9.1834E-41)
            if (r6 != r5) goto L_0x03ec
            r5 = 24
            r8.A04(r5)
        L_0x03ec:
            r11 = 2
            int r5 = r8.A04(r11)
            r9 = 3
            if (r5 != r9) goto L_0x03fd
        L_0x03f4:
            r8.A04(r11)
            boolean r5 = r8.A0C()
            if (r5 != 0) goto L_0x03f4
        L_0x03fd:
            r5 = 10
            int r17 = r8.A04(r5)
            boolean r5 = r8.A0C()
            if (r5 == 0) goto L_0x0412
            int r5 = r8.A04(r9)
            if (r5 <= 0) goto L_0x0412
            r8.A08(r11)
        L_0x0412:
            boolean r16 = r8.A0C()
            r12 = 48000(0xbb80, float:6.7262E-41)
            r6 = 44100(0xac44, float:6.1797E-41)
            r5 = 44100(0xac44, float:6.1797E-41)
            if (r16 == 0) goto L_0x0424
            r5 = 48000(0xbb80, float:6.7262E-41)
        L_0x0424:
            int r8 = r8.A04(r14)
            if (r5 != r6) goto L_0x0437
            r5 = 13
            if (r8 != r5) goto L_0x045a
            int[] r5 = X.C89654cc.A00
            r12 = r5[r8]
        L_0x0432:
            r0.A04 = r12
            if (r12 != 0) goto L_0x045c
            return r13
        L_0x0437:
            if (r5 != r12) goto L_0x045a
            int[] r6 = X.C89654cc.A00
            int r5 = r6.length
            if (r8 >= r5) goto L_0x045a
            r12 = r6[r8]
            int r6 = r17 % 5
            r5 = 8
            if (r6 == r13) goto L_0x0457
            if (r6 == r11) goto L_0x044e
            if (r6 == r9) goto L_0x0457
            if (r6 != r14) goto L_0x0432
            if (r8 == r9) goto L_0x0454
        L_0x044e:
            if (r8 == r5) goto L_0x0454
            r5 = 11
        L_0x0452:
            if (r8 != r5) goto L_0x0432
        L_0x0454:
            int r12 = r12 + 1
            goto L_0x0432
        L_0x0457:
            if (r8 == r9) goto L_0x0454
            goto L_0x0452
        L_0x045a:
            r12 = 0
            goto L_0x0432
        L_0x045c:
            X.4LP r5 = r0.A0K
            if (r5 == 0) goto L_0x046d
            boolean r5 = r0.A0F()
            if (r5 == 0) goto L_0x0538
            r0.A0A(r1)
            r5 = r19
            r0.A0K = r5
        L_0x046d:
            long r5 = r0.A08
            X.4VA r14 = r0.A0I
            int r8 = r14.A04
            if (r8 != 0) goto L_0x0509
            long r8 = r0.A0A
            int r11 = r14.A01
            long r11 = (long) r11
            long r8 = r8 / r11
        L_0x047b:
            X.3UU r11 = r0.A0i
            long r11 = r11.A04
            long r8 = r8 - r11
            r11 = 1000000(0xf4240, double:4.940656E-318)
            long r8 = r8 * r11
            X.1gT r11 = r14.A07
            int r11 = r11.A0F
            long r11 = (long) r11
            long r8 = r8 / r11
            long r5 = r5 + r8
            boolean r8 = r0.A0V
            if (r8 != 0) goto L_0x04ba
            long r8 = r5 - r31
            long r16 = java.lang.Math.abs(r8)
            r11 = 200000(0x30d40, double:9.8813E-319)
            int r8 = (r16 > r11 ? 1 : (r16 == r11 ? 0 : -1))
            if (r8 <= 0) goto L_0x04d7
            java.lang.String r8 = "Discontinuity detected [expected "
            java.lang.StringBuilder r9 = X.AnonymousClass000.A0r(r8)
            r9.append(r5)
            java.lang.String r8 = ", got "
            r9.append(r8)
            r9.append(r1)
            java.lang.String r8 = "]"
            java.lang.String r9 = X.AnonymousClass000.A0h(r8, r9)
            r8 = r18
            android.util.Log.e(r8, r9)
            r0.A0V = r13
        L_0x04ba:
            boolean r8 = r0.A0F()
            if (r8 == 0) goto L_0x0538
            long r8 = r31 - r5
            long r5 = r0.A08
            long r5 = r5 + r8
            r0.A08 = r5
            r0.A0V = r15
            r0.A0A(r1)
            X.5TB r6 = r0.A0G
            if (r6 == 0) goto L_0x04d7
            int r5 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x04d7
            r6.AUx()
        L_0x04d7:
            X.4VA r3 = r0.A0I
            int r3 = r3.A04
            r8 = r30
            if (r3 != 0) goto L_0x04fe
            long r5 = r0.A0A
            int r3 = r7.remaining()
            long r3 = (long) r3
            long r5 = r5 + r3
            r0.A0A = r5
        L_0x04e9:
            r0.A0O = r7
            r0.A05 = r8
        L_0x04ed:
            r0.A0B(r1)
            java.nio.ByteBuffer r1 = r0.A0O
            boolean r1 = r1.hasRemaining()
            if (r1 != 0) goto L_0x050d
            r1 = 0
            r0.A0O = r1
            r0.A05 = r15
            return r13
        L_0x04fe:
            long r5 = r0.A09
            int r3 = r0.A04
            int r3 = r3 * r30
            long r3 = (long) r3
            long r5 = r5 + r3
            r0.A09 = r5
            goto L_0x04e9
        L_0x0509:
            long r8 = r0.A09
            goto L_0x047b
        L_0x050d:
            long r6 = r0.A07()
            long r2 = r10.A08
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r1 == 0) goto L_0x0538
            r4 = 0
            int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r1 <= 0) goto L_0x0538
            long r4 = android.os.SystemClock.elapsedRealtime()
            long r4 = r4 - r2
            r2 = 200(0xc8, double:9.9E-322)
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 < 0) goto L_0x0538
            java.lang.String r2 = "Resetting stalled audio track"
            r1 = r18
            android.util.Log.w(r1, r2)
            r0.flush()
        L_0x0537:
            return r13
        L_0x0538:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C96334oA.AHJ(java.nio.ByteBuffer, int, long):boolean");
    }

    public boolean AHd() {
        if (this.A0D == null) {
            return false;
        }
        AnonymousClass4VJ r5 = this.A0d;
        if (A07() <= r5.A00()) {
            return r5.A0S && r5.A0M.getPlayState() == 2 && r5.A00() == 0;
        }
        return true;
    }

    public void AeL(C89214bm r5) {
        A0D(new C89214bm(AnonymousClass000.A02(r5.A01, 8.0f, 0.1f), AnonymousClass000.A02(r5.A00, 8.0f, 0.1f)), A08().A03);
    }

    public void flush() {
        if (this.A0D != null) {
            this.A0A = 0;
            this.A09 = 0;
            this.A0C = 0;
            this.A0B = 0;
            this.A0S = false;
            this.A04 = 0;
            this.A0L = new AnonymousClass4LP(A08().A02, 0, 0, A08().A03);
            this.A08 = 0;
            this.A0K = null;
            this.A0j.clear();
            this.A0O = null;
            this.A05 = 0;
            this.A0P = null;
            this.A0W = false;
            this.A0R = false;
            this.A03 = -1;
            this.A0N = null;
            this.A02 = 0;
            this.A0i.A04 = 0;
            int i2 = 0;
            while (true) {
                C109765Tm[] r1 = this.A0Z;
                if (i2 >= r1.length) {
                    break;
                }
                C109765Tm r0 = r1[i2];
                r0.flush();
                this.A0a[i2] = r0.AE7();
                i2++;
            }
            AnonymousClass4VJ r5 = this.A0d;
            if (r5.A0M.getPlayState() == 3) {
                this.A0D.pause();
            }
            AudioTrack audioTrack = this.A0D;
            int i3 = AnonymousClass3C1.A01;
            if (i3 >= 29 && audioTrack.isOffloadedPlayback()) {
                this.A0M.A01(this.A0D);
            }
            AudioTrack audioTrack2 = this.A0D;
            this.A0D = null;
            if (i3 < 21 && !this.A0Q) {
                this.A01 = 0;
            }
            AnonymousClass4VA r02 = this.A0J;
            if (r02 != null) {
                this.A0I = r02;
                this.A0J = null;
            }
            r5.A0J = 0;
            r5.A05 = 0;
            r5.A02 = 0;
            r5.A0A = 0;
            r5.A0D = 0;
            r5.A0H = 0;
            r5.A0T = false;
            r5.A0M = null;
            r5.A0N = null;
            this.A0b.close();
            new C105715Aw(audioTrack2, this).start();
        }
        this.A0h.A01 = null;
        this.A0g.A01 = null;
    }

    public void reset() {
        flush();
        for (C109765Tm reset : this.A0l) {
            reset.reset();
        }
        for (C109765Tm reset2 : this.A0k) {
            reset2.reset();
        }
        this.A0T = false;
    }
}
