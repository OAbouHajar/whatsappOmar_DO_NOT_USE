package X;

import android.media.MediaCodec;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import com.facebook.redex.IDxComparatorShape184S0100000_2_I1;
import com.facebook.redex.RunnableRunnableShape1S1100000_I1;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: X.3UH  reason: invalid class name */
public abstract class AnonymousClass3UH extends C96244o1 {
    public static final byte[] A14 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    public float A00;
    public float A01;
    public float A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public long A0A;
    public long A0B;
    public long A0C;
    public long A0D;
    public long A0E;
    public MediaFormat A0F;
    public C804643y A0G;
    public C32491gT A0H;
    public C32491gT A0I;
    public C32491gT A0J;
    public C85484Oq A0K;
    public C55102iq A0L;
    public C55102iq A0M;
    public AnonymousClass4JV A0N;
    public AnonymousClass5T3 A0O;
    public C90714eg A0P;
    public AnonymousClass441 A0Q;
    public ByteBuffer A0R;
    public ArrayDeque A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public boolean A0d;
    public boolean A0e;
    public boolean A0f;
    public boolean A0g;
    public boolean A0h;
    public boolean A0i;
    public boolean A0j;
    public boolean A0k;
    public boolean A0l;
    public boolean A0m;
    public boolean A0n;
    public boolean A0o;
    public boolean A0p;
    public boolean A0q;
    public final float A0r;
    public final MediaCodec.BufferInfo A0s;
    public final AnonymousClass3UX A0t = new AnonymousClass3UX(0);
    public final AnonymousClass3UX A0u = new AnonymousClass3UX(2);
    public final AnonymousClass3UX A0v = new AnonymousClass3UX(0);
    public final C65293Ud A0w;
    public final AnonymousClass5TR A0x;
    public final C109725Ti A0y;
    public final C84564La A0z;
    public final ArrayList A10;
    public final long[] A11;
    public final long[] A12;
    public final long[] A13;

    public AnonymousClass3UH(AnonymousClass5TR r7, C109725Ti r8, float f2, int i2) {
        super(i2);
        this.A0x = r7;
        this.A0y = r8;
        this.A0r = f2;
        C65293Ud r4 = new C65293Ud();
        this.A0w = r4;
        this.A0z = new C84564La();
        this.A10 = AnonymousClass000.A0u();
        this.A0s = new MediaCodec.BufferInfo();
        this.A01 = 1.0f;
        this.A02 = 1.0f;
        this.A12 = new long[10];
        this.A11 = new long[10];
        this.A13 = new long[10];
        this.A0E = -9223372036854775807L;
        this.A0D = -9223372036854775807L;
        r4.A01(0);
        r4.A01.order(ByteOrder.nativeOrder());
        A0H();
    }

    private void A00() {
        int i2 = this.A04;
        if (i2 == 1) {
            A0K();
        } else if (i2 == 2) {
            A0K();
            A0M();
            throw AnonymousClass000.A0Z();
        } else if (i2 != 3) {
            this.A0n = true;
            A0F();
        } else {
            A0E();
            A0L();
        }
    }

    public static boolean A01(IllegalStateException illegalStateException) {
        return illegalStateException instanceof MediaCodec.CodecException;
    }

    public void A07() {
        try {
            A0I();
            A0E();
        } finally {
            this.A0M = null;
        }
    }

    public void A08() {
        this.A0I = null;
        this.A0E = -9223372036854775807L;
        this.A0D = -9223372036854775807L;
        this.A09 = 0;
        if (this.A0M == null && this.A0L == null) {
            A0R();
        } else {
            A07();
        }
    }

    public void A09(long j2, boolean z2) {
        int i2;
        this.A0k = false;
        this.A0n = false;
        this.A0o = false;
        if (this.A0U) {
            this.A0w.clear();
            this.A0u.clear();
            this.A0V = false;
        } else if (A0R()) {
            A0L();
        }
        C84564La r2 = this.A0z;
        synchronized (r2) {
            i2 = r2.A01;
        }
        if (i2 > 0) {
            this.A0q = true;
        }
        synchronized (r2) {
            r2.A00 = 0;
            r2.A01 = 0;
            Arrays.fill(r2.A03, (Object) null);
        }
        int i3 = this.A09;
        if (i3 != 0) {
            this.A0D = this.A11[i3 - 1];
            this.A0E = this.A12[i3 - 1];
            this.A09 = 0;
        }
    }

    public void A0A(boolean z2, boolean z3) {
        this.A0K = new C85484Oq();
    }

    public float A0B(C32491gT[] r7, float f2) {
        if (this instanceof C65473Ux) {
            float f3 = -1.0f;
            for (C32491gT r0 : r7) {
                float f4 = r0.A01;
                if (f4 != -1.0f) {
                    f3 = Math.max(f3, f4);
                }
            }
            if (f3 != -1.0f) {
                return f3 * f2;
            }
            return -1.0f;
        }
        int i2 = -1;
        for (C32491gT r02 : r7) {
            int i3 = r02.A0F;
            if (i3 != -1) {
                i2 = Math.max(i2, i3);
            }
        }
        if (i2 == -1) {
            return -1.0f;
        }
        return f2 * ((float) i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0034, code lost:
        if (X.AnonymousClass3C1.A01 >= 23) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x007e, code lost:
        if (A0T() == false) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00cd, code lost:
        if (r8 != false) goto L_0x00cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00d3, code lost:
        if (A0S() == false) goto L_0x00da;
     */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C86944Ut A0C(X.AnonymousClass4G5 r16) {
        /*
            r15 = this;
            r4 = 1
            r15.A0q = r4
            r1 = r16
            X.1gT r11 = r1.A00
            java.lang.String r0 = r11.A0T
            if (r0 == 0) goto L_0x011d
            X.2iq r2 = r1.A01
            r15.A0M = r2
            r15.A0I = r11
            boolean r1 = r15.A0U
            r0 = 0
            if (r1 == 0) goto L_0x0019
            r15.A0T = r4
            return r0
        L_0x0019:
            X.5T3 r3 = r15.A0O
            if (r3 != 0) goto L_0x0023
            r15.A0S = r0
            r15.A0L()
            return r0
        L_0x0023:
            X.4eg r5 = r15.A0P
            X.1gT r10 = r15.A0H
            X.2iq r0 = r15.A0L
            if (r0 != r2) goto L_0x00f9
            r8 = 0
            if (r2 == r0) goto L_0x0036
            r8 = 1
            int r2 = X.AnonymousClass3C1.A01
            r1 = 23
            r0 = 0
            if (r2 < r1) goto L_0x0037
        L_0x0036:
            r0 = 1
        L_0x0037:
            X.C90524eJ.A04(r0)
            r7 = r15
            boolean r0 = r15 instanceof X.C65473Ux
            if (r0 == 0) goto L_0x00dc
            X.3Ux r7 = (X.C65473Ux) r7
            X.4Ut r6 = r5.A06(r10, r11)
            int r14 = r6.A00
            int r1 = r11.A0I
            X.4Jf r2 = r7.A0M
            int r0 = r2.A02
            if (r1 > r0) goto L_0x0055
            int r1 = r11.A09
            int r0 = r2.A00
            if (r1 <= r0) goto L_0x0057
        L_0x0055:
            r14 = r14 | 256(0x100, float:3.59E-43)
        L_0x0057:
            int r1 = X.C65473Ux.A00(r11, r5)
            X.4Jf r0 = r7.A0M
            int r0 = r0.A01
            if (r1 <= r0) goto L_0x0063
            r14 = r14 | 64
        L_0x0063:
            java.lang.String r12 = r5.A03
            if (r14 != 0) goto L_0x00f6
            int r13 = r6.A01
        L_0x0069:
            X.4Ut r9 = new X.4Ut
            r9.<init>(r10, r11, r12, r13, r14)
            int r0 = r9.A01
            r2 = 3
            r1 = 2
            if (r0 == 0) goto L_0x0119
            if (r0 == r4) goto L_0x0091
            if (r0 == r1) goto L_0x00ad
            if (r0 != r2) goto L_0x0114
            boolean r0 = r15.A0T()
            if (r0 != 0) goto L_0x00cb
        L_0x0080:
            r14 = 16
        L_0x0082:
            X.5T3 r0 = r15.A0O
            if (r0 != r3) goto L_0x008a
            int r0 = r15.A04
            if (r0 != r2) goto L_0x0090
        L_0x008a:
            r13 = 0
        L_0x008b:
            X.4Ut r9 = new X.4Ut
            r9.<init>(r10, r11, r12, r13, r14)
        L_0x0090:
            return r9
        L_0x0091:
            boolean r0 = r15.A0T()
            if (r0 == 0) goto L_0x0080
            r15.A0H = r11
            if (r8 != 0) goto L_0x00cf
            boolean r0 = r15.A0h
            if (r0 == 0) goto L_0x00ab
            r15.A05 = r4
            boolean r0 = r15.A0d
            if (r0 != 0) goto L_0x00d8
            boolean r0 = r15.A0a
            if (r0 != 0) goto L_0x00d8
            r15.A04 = r4
        L_0x00ab:
            r14 = 0
            goto L_0x0082
        L_0x00ad:
            boolean r0 = r15.A0T()
            if (r0 == 0) goto L_0x0080
            r15.A0j = r4
            r15.A06 = r4
            int r0 = r15.A03
            if (r0 == r1) goto L_0x00c9
            if (r0 != r4) goto L_0x00d6
            int r1 = r11.A0I
            int r0 = r10.A0I
            if (r1 != r0) goto L_0x00d6
            int r1 = r11.A09
            int r0 = r10.A09
            if (r1 != r0) goto L_0x00d6
        L_0x00c9:
            r15.A0X = r4
        L_0x00cb:
            r15.A0H = r11
            if (r8 == 0) goto L_0x00ab
        L_0x00cf:
            boolean r0 = r15.A0S()
            if (r0 != 0) goto L_0x00ab
            goto L_0x00da
        L_0x00d6:
            r4 = 0
            goto L_0x00c9
        L_0x00d8:
            r15.A04 = r2
        L_0x00da:
            r14 = 2
            goto L_0x0082
        L_0x00dc:
            X.3Uy r7 = (X.C65483Uy) r7
            X.4Ut r2 = r5.A06(r10, r11)
            int r14 = r2.A00
            int r1 = r7.A0W(r11, r5)
            int r0 = r7.A00
            if (r1 <= r0) goto L_0x00ee
            r14 = r14 | 64
        L_0x00ee:
            java.lang.String r12 = r5.A03
            if (r14 != 0) goto L_0x00f6
            int r13 = r2.A01
            goto L_0x0069
        L_0x00f6:
            r13 = 0
            goto L_0x0069
        L_0x00f9:
            if (r2 == 0) goto L_0x010a
            if (r0 == 0) goto L_0x010a
            int r1 = X.AnonymousClass3C1.A01
            r0 = 23
            if (r1 < r0) goto L_0x010a
            java.util.UUID r1 = X.C90604eR.A02
            java.util.UUID r0 = X.C90604eR.A03
            r1.equals(r0)
        L_0x010a:
            r15.A0J()
            java.lang.String r12 = r5.A03
            r13 = 0
            r14 = 128(0x80, float:1.794E-43)
            goto L_0x008b
        L_0x0114:
            java.lang.IllegalStateException r0 = X.AnonymousClass3K4.A0V()
            throw r0
        L_0x0119:
            r15.A0J()
            return r9
        L_0x011d:
            java.lang.IllegalArgumentException r1 = X.AnonymousClass3K3.A0f()
            r0 = 0
            X.43y r0 = r15.A01(r11, r1, r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3UH.A0C(X.4G5):X.4Ut");
    }

    public List A0D(C32491gT r7, C109725Ti r8) {
        Object obj;
        if (this instanceof C65473Ux) {
            return C65473Ux.A04(r7, r8, false, ((C65473Ux) this).A0U);
        }
        C65483Uy r0 = (C65483Uy) this;
        String str = r7.A0T;
        if (str == null) {
            return Collections.emptyList();
        }
        if (((C96334oA) r0.A0A).ACO(r7) != 0) {
            List A032 = C90884f0.A03("audio/raw", false, false);
            if (!A032.isEmpty() && (obj = A032.get(0)) != null) {
                return Collections.singletonList(obj);
            }
        }
        ArrayList A0n2 = C13680ns.A0n(r8.ABf(str, false, false));
        Collections.sort(A0n2, new IDxComparatorShape184S0100000_2_I1(new C97134pS(r7), 1));
        if ("audio/eac3-joc".equals(str)) {
            A0n2 = C13680ns.A0n(A0n2);
            A0n2.addAll(r8.ABf("audio/eac3", false, false));
        }
        return Collections.unmodifiableList(A0n2);
    }

    public void A0E() {
        Handler handler;
        RunnableRunnableShape1S1100000_I1 runnableRunnableShape1S1100000_I1;
        try {
            AnonymousClass5T3 r0 = this.A0O;
            if (r0 != null) {
                C97084pN r02 = (C97084pN) r0;
                r02.A00 = null;
                r02.A01 = null;
                r02.A02.release();
                this.A0K.A01++;
                String str = this.A0P.A03;
                if (this instanceof C65473Ux) {
                    AnonymousClass4GS r1 = ((C65473Ux) this).A0Z;
                    handler = r1.A00;
                    runnableRunnableShape1S1100000_I1 = new RunnableRunnableShape1S1100000_I1(1, str, r1);
                } else {
                    AnonymousClass4TD r12 = ((C65483Uy) this).A09;
                    handler = r12.A00;
                    if (handler != null) {
                        runnableRunnableShape1S1100000_I1 = new RunnableRunnableShape1S1100000_I1(0, str, r12);
                    }
                }
                handler.post(runnableRunnableShape1S1100000_I1);
            }
        } finally {
            this.A0O = null;
            this.A0L = null;
            A0H();
        }
    }

    public void A0F() {
        if (this instanceof C65483Uy) {
            C65483Uy r3 = (C65483Uy) this;
            try {
                C96334oA r1 = (C96334oA) r3.A0A;
                if (!r1.A0R && r1.A0D != null && r1.A0F()) {
                    r1.A09();
                    r1.A0R = true;
                }
            } catch (C802943h e2) {
                throw r3.A01(e2.format, e2, e2.isRecoverable);
            }
        }
    }

    public void A0G() {
        this.A07 = -1;
        this.A0t.A01 = null;
        this.A08 = -1;
        this.A0R = null;
        this.A0A = -9223372036854775807L;
        this.A0i = false;
        this.A0h = false;
        this.A0X = false;
        this.A0p = false;
        this.A0l = false;
        this.A0m = false;
        this.A10.clear();
        this.A0B = -9223372036854775807L;
        this.A0C = -9223372036854775807L;
        AnonymousClass4JV r2 = this.A0N;
        if (r2 != null) {
            r2.A01 = 0;
            r2.A00 = 0;
            r2.A02 = false;
        }
        this.A05 = 0;
        this.A04 = 0;
        this.A06 = this.A0j ? 1 : 0;
    }

    public void A0H() {
        A0G();
        this.A0G = null;
        this.A0N = null;
        this.A0S = null;
        this.A0P = null;
        this.A0H = null;
        this.A0F = null;
        this.A0g = false;
        this.A0W = false;
        this.A00 = -1.0f;
        this.A03 = 0;
        this.A0Y = false;
        this.A0d = false;
        this.A0f = false;
        this.A0a = false;
        this.A0b = false;
        this.A0Z = false;
        this.A0e = false;
        this.A0c = false;
        this.A0j = false;
        this.A06 = 0;
    }

    public final void A0I() {
        this.A0T = false;
        this.A0w.clear();
        this.A0u.clear();
        this.A0V = false;
        this.A0U = false;
    }

    public final void A0J() {
        if (this.A0h) {
            this.A05 = 1;
            this.A04 = 3;
            return;
        }
        A0E();
        A0L();
    }

    public final void A0K() {
        try {
            ((C97084pN) this.A0O).A02.flush();
        } finally {
            A0G();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:173:0x0379, code lost:
        if ("AXON 7 mini".equals(r2) == false) goto L_0x038c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x0398, code lost:
        if (r6 < 24) goto L_0x03af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x047d, code lost:
        if ("OMX.MTK.VIDEO.DECODER.AVC".equals(r5) == false) goto L_0x047f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x04c8, code lost:
        if ("c2.android.aac.decoder".equals(r5) == false) goto L_0x04ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x04ed, code lost:
        if ("stvm8".equals(r2) == false) goto L_0x0501;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x04fd, code lost:
        if ("OMX.amlogic.avc.decoder.awesome.secure".equals(r5) == false) goto L_0x0501;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x050f, code lost:
        if ("OMX.google.aac.decoder".equals(r5) == false) goto L_0x0511;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:318:0x0595, code lost:
        if ("OMX.allwinner.video.decoder.avc".equals(r5) == false) goto L_0x0597;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:322:0x05a5, code lost:
        if ("OMX.broadcom.video_decoder.tunnel.secure".equals(r5) == false) goto L_0x05a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0165, code lost:
        if (r14.A09 == -1) goto L_0x0167;
     */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x0337 A[Catch:{ Exception -> 0x065b }, LOOP:4: B:158:0x0331->B:160:0x0337, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0352 A[Catch:{ Exception -> 0x065b }] */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x0359 A[Catch:{ Exception -> 0x065b }] */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x0385 A[Catch:{ Exception -> 0x065b }] */
    /* JADX WARNING: Removed duplicated region for block: B:255:0x04c1 A[Catch:{ Exception -> 0x066b }] */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x04d1 A[Catch:{ Exception -> 0x066b }] */
    /* JADX WARNING: Removed duplicated region for block: B:276:0x0508 A[Catch:{ Exception -> 0x066b }] */
    /* JADX WARNING: Removed duplicated region for block: B:309:0x057d A[Catch:{ Exception -> 0x066b }] */
    /* JADX WARNING: Removed duplicated region for block: B:314:0x058a A[Catch:{ Exception -> 0x066b }] */
    /* JADX WARNING: Removed duplicated region for block: B:321:0x059f A[Catch:{ Exception -> 0x066b }] */
    /* JADX WARNING: Removed duplicated region for block: B:340:0x05da A[Catch:{ Exception -> 0x066b }] */
    /* JADX WARNING: Removed duplicated region for block: B:343:0x05e6 A[Catch:{ Exception -> 0x066b }] */
    /* JADX WARNING: Removed duplicated region for block: B:346:0x05fc A[Catch:{ Exception -> 0x066b }] */
    /* JADX WARNING: Removed duplicated region for block: B:364:0x0645 A[Catch:{ Exception -> 0x066b }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0L() {
        /*
            r32 = this;
            r0 = r32
            X.5T3 r1 = r0.A0O
            if (r1 != 0) goto L_0x004d
            boolean r1 = r0.A0U
            if (r1 != 0) goto L_0x004d
            X.1gT r3 = r0.A0I
            if (r3 == 0) goto L_0x004d
            X.2iq r1 = r0.A0M
            if (r1 != 0) goto L_0x0055
            r2 = r0
            boolean r1 = r0 instanceof X.C65483Uy
            if (r1 == 0) goto L_0x0055
            X.3Uy r2 = (X.C65483Uy) r2
            X.5TO r1 = r2.A0A
            X.4oA r1 = (X.C96334oA) r1
            int r1 = r1.ACO(r3)
            boolean r1 = X.AnonymousClass000.A1O(r1)
            if (r1 == 0) goto L_0x0055
            X.1gT r1 = r0.A0I
            r0.A0I()
            java.lang.String r2 = r1.A0T
            java.lang.String r1 = "audio/mp4a-latm"
            boolean r1 = r1.equals(r2)
            r3 = 1
            if (r1 != 0) goto L_0x004e
            java.lang.String r1 = "audio/mpeg"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x004e
            java.lang.String r1 = "audio/opus"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x004e
            X.3Ud r1 = r0.A0w
            r1.A00 = r3
        L_0x004b:
            r0.A0U = r3
        L_0x004d:
            return
        L_0x004e:
            X.3Ud r2 = r0.A0w
            r1 = 32
            r2.A00 = r1
            goto L_0x004b
        L_0x0055:
            X.2iq r2 = r0.A0M
            r0.A0L = r2
            if (r2 == 0) goto L_0x006b
            boolean r1 = X.C96414oI.A00
            if (r1 == 0) goto L_0x006b
            X.4oE r2 = (X.C96374oE) r2
            X.405 r3 = r2.A00
            X.1gT r2 = r0.A0I
            r1 = 0
            X.43y r0 = r0.A01(r2, r3, r1)
            throw r0
        L_0x006b:
            r18 = 0
            java.util.ArrayDeque r1 = r0.A0S     // Catch:{ 441 -> 0x06e0 }
            if (r1 != 0) goto L_0x0097
            X.5Ti r3 = r0.A0y     // Catch:{ 43N -> 0x06cf }
            X.1gT r2 = r0.A0I     // Catch:{ 43N -> 0x06cf }
            java.util.List r3 = r0.A0D(r2, r3)     // Catch:{ 43N -> 0x06cf }
            r3.isEmpty()     // Catch:{ 43N -> 0x06cf }
            java.util.ArrayDeque r1 = new java.util.ArrayDeque     // Catch:{ 43N -> 0x06cf }
            r1.<init>()     // Catch:{ 43N -> 0x06cf }
            r0.A0S = r1     // Catch:{ 43N -> 0x06cf }
            boolean r1 = r3.isEmpty()     // Catch:{ 43N -> 0x06cf }
            if (r1 != 0) goto L_0x0093
            java.util.ArrayDeque r2 = r0.A0S     // Catch:{ 43N -> 0x06cf }
            r1 = 0
            java.lang.Object r1 = r3.get(r1)     // Catch:{ 43N -> 0x06cf }
            r2.add(r1)     // Catch:{ 43N -> 0x06cf }
        L_0x0093:
            r1 = r18
            r0.A0Q = r1     // Catch:{ 43N -> 0x06cf }
        L_0x0097:
            java.util.ArrayDeque r1 = r0.A0S     // Catch:{ 441 -> 0x06e0 }
            boolean r1 = r1.isEmpty()     // Catch:{ 441 -> 0x06e0 }
            if (r1 == 0) goto L_0x00ad
            X.1gT r3 = r0.A0I     // Catch:{ 441 -> 0x06e0 }
            r2 = -49999(0xffffffffffff3cb1, float:NaN)
            X.441 r4 = new X.441     // Catch:{ 441 -> 0x06e0 }
            r1 = r18
            r4.<init>(r3, r1, r2)     // Catch:{ 441 -> 0x06e0 }
            goto L_0x06da
        L_0x00ad:
            X.5T3 r1 = r0.A0O     // Catch:{ 441 -> 0x06e0 }
            if (r1 != 0) goto L_0x06db
            java.util.ArrayDeque r1 = r0.A0S     // Catch:{ 441 -> 0x06e0 }
            java.lang.Object r3 = r1.peekFirst()     // Catch:{ 441 -> 0x06e0 }
            X.4eg r3 = (X.C90714eg) r3     // Catch:{ 441 -> 0x06e0 }
            r2 = r0
            boolean r1 = r0 instanceof X.C65473Ux     // Catch:{ 441 -> 0x06e0 }
            r19 = r1
            if (r1 == 0) goto L_0x00cc
            X.3Ux r2 = (X.C65473Ux) r2     // Catch:{ 441 -> 0x06e0 }
            android.view.Surface r1 = r2.A0L     // Catch:{ 441 -> 0x06e0 }
            if (r1 != 0) goto L_0x00cc
            boolean r1 = r2.A0e(r3)     // Catch:{ 441 -> 0x06e0 }
            if (r1 == 0) goto L_0x004d
        L_0x00cc:
            java.lang.String r5 = r3.A03     // Catch:{ Exception -> 0x066b }
            int r6 = X.AnonymousClass3C1.A01     // Catch:{ Exception -> 0x066b }
            r1 = 23
            if (r6 >= r1) goto L_0x00d7
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L_0x00df
        L_0x00d7:
            float r2 = r0.A02     // Catch:{ Exception -> 0x066b }
            X.1gT[] r1 = r0.A08     // Catch:{ Exception -> 0x066b }
            float r7 = r0.A0B(r1, r2)     // Catch:{ Exception -> 0x066b }
        L_0x00df:
            float r1 = r0.A0r     // Catch:{ Exception -> 0x066b }
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 > 0) goto L_0x00e7
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x00e7:
            long r16 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x065d }
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0o()     // Catch:{ Exception -> 0x065d }
            java.lang.String r1 = "createCodec:"
            r2.append(r1)     // Catch:{ Exception -> 0x065d }
            java.lang.String r1 = X.AnonymousClass000.A0h(r5, r2)     // Catch:{ Exception -> 0x065d }
            X.C90224dm.A02(r1)     // Catch:{ Exception -> 0x065d }
            android.media.MediaCodec r1 = android.media.MediaCodec.createByCodecName(r5)     // Catch:{ Exception -> 0x065d }
            X.4pN r4 = new X.4pN     // Catch:{ Exception -> 0x065d }
            r4.<init>(r1)     // Catch:{ Exception -> 0x065d }
            X.C90224dm.A00()     // Catch:{ Exception -> 0x065b }
            java.lang.String r1 = "configureCodec"
            X.C90224dm.A02(r1)     // Catch:{ Exception -> 0x065b }
            X.1gT r10 = r0.A0I     // Catch:{ Exception -> 0x065b }
            r25 = r0
            if (r19 == 0) goto L_0x02af
            r1 = r25
            X.3Ux r1 = (X.C65473Ux) r1     // Catch:{ Exception -> 0x065b }
            r25 = r1
            java.lang.String r1 = r3.A01     // Catch:{ Exception -> 0x065b }
            r31 = r1
            r1 = r25
            X.1gT[] r1 = r1.A08     // Catch:{ Exception -> 0x065b }
            r21 = r1
            int r12 = r10.A0I     // Catch:{ Exception -> 0x065b }
            r26 = r12
            int r11 = r10.A09     // Catch:{ Exception -> 0x065b }
            r30 = r11
            int r9 = X.C65473Ux.A00(r10, r3)     // Catch:{ Exception -> 0x065b }
            int r1 = r1.length     // Catch:{ Exception -> 0x065b }
            r22 = r1
            r2 = 1
            r8 = -1
            if (r1 != r2) goto L_0x0139
            if (r9 == r8) goto L_0x024c
            goto L_0x023b
        L_0x0139:
            r13 = 0
            r20 = 0
        L_0x013c:
            r1 = r22
            if (r13 >= r1) goto L_0x017f
            r14 = r21[r13]     // Catch:{ Exception -> 0x065b }
            X.4jd r2 = r10.A0M     // Catch:{ Exception -> 0x065b }
            if (r2 == 0) goto L_0x0156
            X.4jd r1 = r14.A0M     // Catch:{ Exception -> 0x065b }
            if (r1 != 0) goto L_0x0156
            X.1gR r1 = new X.1gR     // Catch:{ Exception -> 0x065b }
            r1.<init>(r14)     // Catch:{ Exception -> 0x065b }
            r1.A0K = r2     // Catch:{ Exception -> 0x065b }
            X.1gT r14 = new X.1gT     // Catch:{ Exception -> 0x065b }
            r14.<init>((X.C32471gR) r1)     // Catch:{ Exception -> 0x065b }
        L_0x0156:
            X.4Ut r1 = r3.A06(r10, r14)     // Catch:{ Exception -> 0x065b }
            int r1 = r1.A01     // Catch:{ Exception -> 0x065b }
            if (r1 == 0) goto L_0x017c
            int r2 = r14.A0I     // Catch:{ Exception -> 0x065b }
            if (r2 == r8) goto L_0x0167
            int r1 = r14.A09     // Catch:{ Exception -> 0x065b }
            r15 = 0
            if (r1 != r8) goto L_0x0168
        L_0x0167:
            r15 = 1
        L_0x0168:
            r20 = r20 | r15
            int r12 = java.lang.Math.max(r12, r2)     // Catch:{ Exception -> 0x065b }
            int r1 = r14.A09     // Catch:{ Exception -> 0x065b }
            int r11 = java.lang.Math.max(r11, r1)     // Catch:{ Exception -> 0x065b }
            int r1 = X.C65473Ux.A00(r14, r3)     // Catch:{ Exception -> 0x065b }
            int r9 = java.lang.Math.max(r9, r1)     // Catch:{ Exception -> 0x065b }
        L_0x017c:
            int r13 = r13 + 1
            goto L_0x013c
        L_0x017f:
            if (r20 == 0) goto L_0x024c
            java.lang.String r1 = "Resolutions unknown. Codec max resolution: "
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0r(r1)     // Catch:{ Exception -> 0x065b }
            r2.append(r12)     // Catch:{ Exception -> 0x065b }
            java.lang.String r24 = "x"
            r1 = r24
            java.lang.String r2 = X.C13680ns.A0i(r1, r2, r11)     // Catch:{ Exception -> 0x065b }
            java.lang.String r23 = "MediaCodecVideoRenderer"
            r1 = r23
            android.util.Log.w(r1, r2)     // Catch:{ Exception -> 0x065b }
            r8 = 0
            r22 = 0
            r29 = r26
            r2 = r30
            r1 = r26
            if (r2 <= r1) goto L_0x01aa
            r22 = 1
            r29 = r2
            r30 = r1
        L_0x01aa:
            r1 = r30
            float r1 = (float) r1     // Catch:{ Exception -> 0x065b }
            r21 = r1
            r1 = r29
            float r1 = (float) r1     // Catch:{ Exception -> 0x065b }
            float r21 = r21 / r1
            int[] r20 = X.C65473Ux.A0d     // Catch:{ Exception -> 0x065b }
            r1 = r20
            int r1 = r1.length     // Catch:{ Exception -> 0x065b }
            r28 = r1
            goto L_0x01be
        L_0x01bc:
            int r8 = r8 + 1
        L_0x01be:
            r1 = r28
            if (r8 >= r1) goto L_0x024c
            r13 = r20[r8]     // Catch:{ Exception -> 0x065b }
            float r1 = (float) r13     // Catch:{ Exception -> 0x065b }
            float r1 = r1 * r21
            int r2 = (int) r1     // Catch:{ Exception -> 0x065b }
            r1 = r29
            if (r13 <= r1) goto L_0x024c
            r1 = r30
            if (r2 <= r1) goto L_0x024c
            r1 = 21
            if (r6 < r1) goto L_0x01da
            r1 = r2
            if (r22 != 0) goto L_0x01fd
            r1 = r13
            r13 = r2
            goto L_0x01fd
        L_0x01da:
            r14 = 16
            int r1 = r13 + 16
            int r1 = r1 + -1
            int r1 = r1 / r14
            int r1 = r1 << 4
            int r2 = r2 + 16
            int r2 = r2 + -1
            int r2 = r2 / r14
            int r14 = r2 << 4
            int r13 = r1 * r14
            int r2 = X.C90884f0.A00()     // Catch:{ 43N -> 0x024c }
            if (r13 > r2) goto L_0x01bc
            r2 = r14
            if (r22 != 0) goto L_0x01f7
            r2 = r1
            r1 = r14
        L_0x01f7:
            android.graphics.Point r13 = new android.graphics.Point     // Catch:{ 43N -> 0x024c }
            r13.<init>(r2, r1)     // Catch:{ 43N -> 0x024c }
            goto L_0x0210
        L_0x01fd:
            android.graphics.Point r13 = r3.A05(r1, r13)     // Catch:{ Exception -> 0x065b }
            float r2 = r10.A01     // Catch:{ Exception -> 0x065b }
            int r1 = r13.x     // Catch:{ Exception -> 0x065b }
            r15 = r1
            int r1 = r13.y     // Catch:{ Exception -> 0x065b }
            r14 = r1
            double r1 = (double) r2     // Catch:{ Exception -> 0x065b }
            boolean r1 = r3.A0A(r15, r14, r1)     // Catch:{ Exception -> 0x065b }
            if (r1 == 0) goto L_0x01bc
        L_0x0210:
            int r1 = r13.x     // Catch:{ Exception -> 0x065b }
            int r12 = java.lang.Math.max(r12, r1)     // Catch:{ Exception -> 0x065b }
            int r1 = r13.y     // Catch:{ Exception -> 0x065b }
            int r11 = java.lang.Math.max(r11, r1)     // Catch:{ Exception -> 0x065b }
            java.lang.String r1 = r10.A0T     // Catch:{ Exception -> 0x065b }
            int r1 = X.C65473Ux.A02(r3, r1, r12, r11)     // Catch:{ Exception -> 0x065b }
            int r9 = java.lang.Math.max(r9, r1)     // Catch:{ Exception -> 0x065b }
            java.lang.String r1 = "Codec max resolution adjusted to: "
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0r(r1)     // Catch:{ Exception -> 0x065b }
            r2.append(r12)     // Catch:{ Exception -> 0x065b }
            r1 = r24
            java.lang.String r2 = X.C13680ns.A0i(r1, r2, r11)     // Catch:{ Exception -> 0x065b }
            r1 = r23
            android.util.Log.w(r1, r2)     // Catch:{ Exception -> 0x065b }
            goto L_0x024c
        L_0x023b:
            java.lang.String r1 = r10.A0T     // Catch:{ Exception -> 0x065b }
            int r1 = X.C65473Ux.A02(r3, r1, r12, r11)     // Catch:{ Exception -> 0x065b }
            if (r1 == r8) goto L_0x024c
            float r8 = (float) r9     // Catch:{ Exception -> 0x065b }
            r2 = 1069547520(0x3fc00000, float:1.5)
            float r8 = r8 * r2
            int r2 = (int) r8     // Catch:{ Exception -> 0x065b }
            int r9 = java.lang.Math.min(r2, r1)     // Catch:{ Exception -> 0x065b }
        L_0x024c:
            X.4Jf r2 = new X.4Jf     // Catch:{ Exception -> 0x065b }
            r2.<init>(r12, r11, r9)     // Catch:{ Exception -> 0x065b }
            r1 = r25
            r1.A0M = r2     // Catch:{ Exception -> 0x065b }
            boolean r8 = r1.A0a     // Catch:{ Exception -> 0x065b }
            boolean r1 = r1.A0U     // Catch:{ Exception -> 0x065b }
            if (r1 == 0) goto L_0x0293
            r1 = r25
            int r1 = r1.A0C     // Catch:{ Exception -> 0x065b }
        L_0x025f:
            r9 = r10
            r10 = r2
            r11 = r31
            r12 = r7
            r13 = r1
            r14 = r8
            android.media.MediaFormat r2 = X.C65473Ux.A03(r9, r10, r11, r12, r13, r14)     // Catch:{ Exception -> 0x065b }
            r1 = r25
            android.view.Surface r9 = r1.A0L     // Catch:{ Exception -> 0x065b }
            if (r9 != 0) goto L_0x028a
            boolean r1 = r1.A0e(r3)     // Catch:{ Exception -> 0x065b }
            if (r1 == 0) goto L_0x02aa
            r1 = r25
            android.view.Surface r9 = r1.A0K     // Catch:{ Exception -> 0x065b }
            if (r9 != 0) goto L_0x0288
            android.content.Context r8 = r1.A0X     // Catch:{ Exception -> 0x065b }
            boolean r1 = r3.A06     // Catch:{ Exception -> 0x065b }
            X.3Mg r9 = X.C63973Mg.A00(r8, r1)     // Catch:{ Exception -> 0x065b }
            r1 = r25
            r1.A0K = r9     // Catch:{ Exception -> 0x065b }
        L_0x0288:
            r1.A0L = r9     // Catch:{ Exception -> 0x065b }
        L_0x028a:
            android.media.MediaCodec r10 = r4.A02     // Catch:{ Exception -> 0x065b }
            r8 = 0
            r1 = r18
            r10.configure(r2, r9, r1, r8)     // Catch:{ Exception -> 0x065b }
            goto L_0x0295
        L_0x0293:
            r1 = 0
            goto L_0x025f
        L_0x0295:
            r1 = 23
            if (r6 < r1) goto L_0x03cd
            r1 = r25
            boolean r1 = r1.A0U     // Catch:{ Exception -> 0x065b }
            if (r1 == 0) goto L_0x03cd
            X.4gr r2 = new X.4gr     // Catch:{ Exception -> 0x065b }
            r1 = r25
            r2.<init>(r4, r1)     // Catch:{ Exception -> 0x065b }
            r1.A0N = r2     // Catch:{ Exception -> 0x065b }
            goto L_0x03cd
        L_0x02aa:
            java.lang.IllegalStateException r1 = X.AnonymousClass3K4.A0V()     // Catch:{ Exception -> 0x065b }
            throw r1     // Catch:{ Exception -> 0x065b }
        L_0x02af:
            r1 = r25
            X.3Uy r1 = (X.C65483Uy) r1     // Catch:{ Exception -> 0x065b }
            r25 = r1
            X.1gT[] r9 = r1.A08     // Catch:{ Exception -> 0x065b }
            int r11 = r1.A0W(r10, r3)     // Catch:{ Exception -> 0x065b }
            int r12 = r9.length     // Catch:{ Exception -> 0x065b }
            r1 = 1
            if (r12 == r1) goto L_0x02d9
            r8 = 0
        L_0x02c0:
            if (r8 >= r12) goto L_0x02d9
            r2 = r9[r8]     // Catch:{ Exception -> 0x065b }
            X.4Ut r1 = r3.A06(r10, r2)     // Catch:{ Exception -> 0x065b }
            int r1 = r1.A01     // Catch:{ Exception -> 0x065b }
            if (r1 == 0) goto L_0x02d6
            r1 = r25
            int r1 = r1.A0W(r2, r3)     // Catch:{ Exception -> 0x065b }
            int r11 = java.lang.Math.max(r11, r1)     // Catch:{ Exception -> 0x065b }
        L_0x02d6:
            int r8 = r8 + 1
            goto L_0x02c0
        L_0x02d9:
            r1 = r25
            r1.A00 = r11     // Catch:{ Exception -> 0x065b }
            r1 = 24
            if (r6 >= r1) goto L_0x030f
            java.lang.String r1 = "OMX.SEC.aac.dec"
            boolean r1 = r1.equals(r5)     // Catch:{ Exception -> 0x065b }
            if (r1 == 0) goto L_0x030f
            java.lang.String r2 = X.AnonymousClass3C1.A04     // Catch:{ Exception -> 0x065b }
            java.lang.String r1 = "samsung"
            boolean r1 = r1.equals(r2)     // Catch:{ Exception -> 0x065b }
            if (r1 == 0) goto L_0x030f
            java.lang.String r2 = X.AnonymousClass3C1.A02     // Catch:{ Exception -> 0x065b }
            java.lang.String r1 = "zeroflte"
            boolean r1 = r2.startsWith(r1)     // Catch:{ Exception -> 0x065b }
            if (r1 != 0) goto L_0x030d
            java.lang.String r1 = "herolte"
            boolean r1 = r2.startsWith(r1)     // Catch:{ Exception -> 0x065b }
            if (r1 != 0) goto L_0x030d
            java.lang.String r1 = "heroqlte"
            boolean r1 = r2.startsWith(r1)     // Catch:{ Exception -> 0x065b }
            if (r1 == 0) goto L_0x030f
        L_0x030d:
            r2 = 1
            goto L_0x0310
        L_0x030f:
            r2 = 0
        L_0x0310:
            r1 = r25
            r1.A07 = r2     // Catch:{ Exception -> 0x065b }
            java.lang.String r2 = r3.A01     // Catch:{ Exception -> 0x065b }
            android.media.MediaFormat r9 = new android.media.MediaFormat     // Catch:{ Exception -> 0x065b }
            r9.<init>()     // Catch:{ Exception -> 0x065b }
            java.lang.String r1 = "mime"
            r9.setString(r1, r2)     // Catch:{ Exception -> 0x065b }
            int r13 = r10.A06     // Catch:{ Exception -> 0x065b }
            java.lang.String r1 = "channel-count"
            r9.setInteger(r1, r13)     // Catch:{ Exception -> 0x065b }
            int r12 = r10.A0F     // Catch:{ Exception -> 0x065b }
            java.lang.String r1 = "sample-rate"
            r9.setInteger(r1, r12)     // Catch:{ Exception -> 0x065b }
            java.util.List r14 = r10.A0U     // Catch:{ Exception -> 0x065b }
            r8 = 0
        L_0x0331:
            int r1 = r14.size()     // Catch:{ Exception -> 0x065b }
            if (r8 >= r1) goto L_0x034d
            java.lang.String r1 = "csd-"
            java.lang.String r2 = X.C13680ns.A0c(r8, r1)     // Catch:{ Exception -> 0x065b }
            java.lang.Object r1 = r14.get(r8)     // Catch:{ Exception -> 0x065b }
            byte[] r1 = (byte[]) r1     // Catch:{ Exception -> 0x065b }
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.wrap(r1)     // Catch:{ Exception -> 0x065b }
            r9.setByteBuffer(r2, r1)     // Catch:{ Exception -> 0x065b }
            int r8 = r8 + 1
            goto L_0x0331
        L_0x034d:
            java.lang.String r2 = "max-input-size"
            r1 = -1
            if (r11 == r1) goto L_0x0355
            r9.setInteger(r2, r11)     // Catch:{ Exception -> 0x065b }
        L_0x0355:
            r1 = 23
            if (r6 < r1) goto L_0x037b
            java.lang.String r2 = "priority"
            r1 = 0
            r9.setInteger(r2, r1)     // Catch:{ Exception -> 0x065b }
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 == 0) goto L_0x0391
            r1 = 23
            if (r6 != r1) goto L_0x038c
            java.lang.String r2 = X.AnonymousClass3C1.A05     // Catch:{ Exception -> 0x065b }
            java.lang.String r1 = "ZTE B2017G"
            boolean r1 = r1.equals(r2)     // Catch:{ Exception -> 0x065b }
            if (r1 != 0) goto L_0x037b
            java.lang.String r1 = "AXON 7 mini"
            boolean r1 = r1.equals(r2)     // Catch:{ Exception -> 0x065b }
            if (r1 == 0) goto L_0x038c
        L_0x037b:
            java.lang.String r2 = r10.A0T     // Catch:{ Exception -> 0x065b }
            java.lang.String r1 = "audio/ac4"
            boolean r1 = r1.equals(r2)     // Catch:{ Exception -> 0x065b }
            if (r1 == 0) goto L_0x0396
            r2 = 1
            java.lang.String r1 = "ac4-is-sync"
            r9.setInteger(r1, r2)     // Catch:{ Exception -> 0x065b }
            goto L_0x0396
        L_0x038c:
            java.lang.String r1 = "operating-rate"
            r9.setFloat(r1, r7)     // Catch:{ Exception -> 0x065b }
        L_0x0391:
            r1 = 28
            if (r6 > r1) goto L_0x039a
            goto L_0x037b
        L_0x0396:
            r1 = 24
            if (r6 < r1) goto L_0x03af
        L_0x039a:
            r1 = r25
            X.5TO r1 = r1.A0A     // Catch:{ Exception -> 0x065b }
            r2 = 4
            X.1gT r8 = X.AnonymousClass3C1.A06(r2, r13, r12)     // Catch:{ Exception -> 0x065b }
            int r8 = r1.ACO(r8)     // Catch:{ Exception -> 0x065b }
            r1 = 2
            if (r8 != r1) goto L_0x03af
            java.lang.String r1 = "pcm-encoding"
            r9.setInteger(r1, r2)     // Catch:{ Exception -> 0x065b }
        L_0x03af:
            android.media.MediaCodec r11 = r4.A02     // Catch:{ Exception -> 0x065b }
            r8 = 0
            r2 = r18
            r11.configure(r9, r2, r2, r8)     // Catch:{ Exception -> 0x065b }
            java.lang.String r1 = r3.A02     // Catch:{ Exception -> 0x065b }
            java.lang.String r2 = "audio/raw"
            boolean r1 = r2.equals(r1)     // Catch:{ Exception -> 0x065b }
            if (r1 == 0) goto L_0x03db
            java.lang.String r1 = r10.A0T     // Catch:{ Exception -> 0x065b }
            boolean r1 = r2.equals(r1)     // Catch:{ Exception -> 0x065b }
            if (r1 != 0) goto L_0x03db
        L_0x03c9:
            r1 = r25
            r1.A02 = r10     // Catch:{ Exception -> 0x065b }
        L_0x03cd:
            X.C90224dm.A00()     // Catch:{ Exception -> 0x065b }
            java.lang.String r1 = "startCodec"
            X.C90224dm.A02(r1)     // Catch:{ Exception -> 0x065b }
            android.media.MediaCodec r2 = r4.A02     // Catch:{ Exception -> 0x065b }
            r2.start()     // Catch:{ Exception -> 0x065b }
            goto L_0x03de
        L_0x03db:
            r10 = r18
            goto L_0x03c9
        L_0x03de:
            r1 = 21
            if (r6 >= r1) goto L_0x03ee
            java.nio.ByteBuffer[] r1 = r2.getInputBuffers()     // Catch:{ Exception -> 0x065b }
            r4.A00 = r1     // Catch:{ Exception -> 0x065b }
            java.nio.ByteBuffer[] r1 = r2.getOutputBuffers()     // Catch:{ Exception -> 0x065b }
            r4.A01 = r1     // Catch:{ Exception -> 0x065b }
        L_0x03ee:
            X.C90224dm.A00()     // Catch:{ Exception -> 0x065b }
            long r12 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x065b }
            r0.A0O = r4     // Catch:{ Exception -> 0x066b }
            r0.A0P = r3     // Catch:{ Exception -> 0x066b }
            r0.A00 = r7     // Catch:{ Exception -> 0x066b }
            X.1gT r2 = r0.A0I     // Catch:{ Exception -> 0x066b }
            r0.A0H = r2     // Catch:{ Exception -> 0x066b }
            r1 = 25
            if (r6 > r1) goto L_0x0467
            java.lang.String r1 = "OMX.Exynos.avc.dec.secure"
            boolean r1 = r1.equals(r5)     // Catch:{ Exception -> 0x066b }
            if (r1 == 0) goto L_0x042f
            java.lang.String r4 = X.AnonymousClass3C1.A05     // Catch:{ Exception -> 0x066b }
            java.lang.String r1 = "SM-T585"
            boolean r1 = r4.startsWith(r1)     // Catch:{ Exception -> 0x066b }
            if (r1 != 0) goto L_0x042d
            java.lang.String r1 = "SM-A510"
            boolean r1 = r4.startsWith(r1)     // Catch:{ Exception -> 0x066b }
            if (r1 != 0) goto L_0x042d
            java.lang.String r1 = "SM-A520"
            boolean r1 = r4.startsWith(r1)     // Catch:{ Exception -> 0x066b }
            if (r1 != 0) goto L_0x042d
            java.lang.String r1 = "SM-J700"
            boolean r1 = r4.startsWith(r1)     // Catch:{ Exception -> 0x066b }
            if (r1 == 0) goto L_0x042f
        L_0x042d:
            r1 = 2
            goto L_0x0468
        L_0x042f:
            r1 = 24
            if (r6 >= r1) goto L_0x0467
            java.lang.String r1 = "OMX.Nvidia.h264.decode"
            boolean r1 = r1.equals(r5)     // Catch:{ Exception -> 0x066b }
            if (r1 != 0) goto L_0x0443
            java.lang.String r1 = "OMX.Nvidia.h264.decode.secure"
            boolean r1 = r1.equals(r5)     // Catch:{ Exception -> 0x066b }
            if (r1 == 0) goto L_0x0467
        L_0x0443:
            java.lang.String r4 = X.AnonymousClass3C1.A02     // Catch:{ Exception -> 0x066b }
            java.lang.String r1 = "flounder"
            boolean r1 = r1.equals(r4)     // Catch:{ Exception -> 0x066b }
            if (r1 != 0) goto L_0x0465
            java.lang.String r1 = "flounder_lte"
            boolean r1 = r1.equals(r4)     // Catch:{ Exception -> 0x066b }
            if (r1 != 0) goto L_0x0465
            java.lang.String r1 = "grouper"
            boolean r1 = r1.equals(r4)     // Catch:{ Exception -> 0x066b }
            if (r1 != 0) goto L_0x0465
            java.lang.String r1 = "tilapia"
            boolean r1 = r1.equals(r4)     // Catch:{ Exception -> 0x066b }
            if (r1 == 0) goto L_0x0467
        L_0x0465:
            r1 = 1
            goto L_0x0468
        L_0x0467:
            r1 = 0
        L_0x0468:
            r0.A03 = r1     // Catch:{ Exception -> 0x066b }
            r1 = 21
            if (r6 >= r1) goto L_0x047f
            java.util.List r1 = r2.A0U     // Catch:{ Exception -> 0x066b }
            boolean r1 = r1.isEmpty()     // Catch:{ Exception -> 0x066b }
            if (r1 == 0) goto L_0x047f
            java.lang.String r1 = "OMX.MTK.VIDEO.DECODER.AVC"
            boolean r2 = r1.equals(r5)     // Catch:{ Exception -> 0x066b }
            r1 = 1
            if (r2 != 0) goto L_0x0480
        L_0x047f:
            r1 = 0
        L_0x0480:
            r0.A0Y = r1     // Catch:{ Exception -> 0x066b }
            r1 = 18
            if (r6 < r1) goto L_0x04ba
            if (r6 != r1) goto L_0x0499
            java.lang.String r1 = "OMX.SEC.avc.dec"
            boolean r1 = r1.equals(r5)     // Catch:{ Exception -> 0x066b }
            if (r1 != 0) goto L_0x04ba
            java.lang.String r1 = "OMX.SEC.avc.dec.secure"
            boolean r1 = r1.equals(r5)     // Catch:{ Exception -> 0x066b }
            if (r1 != 0) goto L_0x04ba
            goto L_0x04b8
        L_0x0499:
            r1 = 19
            if (r6 != r1) goto L_0x04b8
            java.lang.String r2 = X.AnonymousClass3C1.A05     // Catch:{ Exception -> 0x066b }
            java.lang.String r1 = "SM-G800"
            boolean r1 = r2.startsWith(r1)     // Catch:{ Exception -> 0x066b }
            if (r1 == 0) goto L_0x04b8
            java.lang.String r1 = "OMX.Exynos.avc.dec"
            boolean r1 = r1.equals(r5)     // Catch:{ Exception -> 0x066b }
            if (r1 != 0) goto L_0x04ba
            java.lang.String r1 = "OMX.Exynos.avc.dec.secure"
            boolean r1 = r1.equals(r5)     // Catch:{ Exception -> 0x066b }
            if (r1 == 0) goto L_0x04b8
            goto L_0x04ba
        L_0x04b8:
            r1 = 0
            goto L_0x04bb
        L_0x04ba:
            r1 = 1
        L_0x04bb:
            r0.A0d = r1     // Catch:{ Exception -> 0x066b }
            r1 = 29
            if (r6 != r1) goto L_0x04ca
            java.lang.String r1 = "c2.android.aac.decoder"
            boolean r2 = r1.equals(r5)     // Catch:{ Exception -> 0x066b }
            r1 = 1
            if (r2 != 0) goto L_0x04cb
        L_0x04ca:
            r1 = 0
        L_0x04cb:
            r0.A0f = r1     // Catch:{ Exception -> 0x066b }
            r1 = 23
            if (r6 > r1) goto L_0x0501
            java.lang.String r1 = "OMX.google.vorbis.decoder"
            boolean r1 = r1.equals(r5)     // Catch:{ Exception -> 0x066b }
            if (r1 != 0) goto L_0x04ff
            r1 = 19
            if (r6 > r1) goto L_0x0501
            java.lang.String r2 = X.AnonymousClass3C1.A02     // Catch:{ Exception -> 0x066b }
            java.lang.String r1 = "hb2000"
            boolean r1 = r1.equals(r2)     // Catch:{ Exception -> 0x066b }
            if (r1 != 0) goto L_0x04ef
            java.lang.String r1 = "stvm8"
            boolean r1 = r1.equals(r2)     // Catch:{ Exception -> 0x066b }
            if (r1 == 0) goto L_0x0501
        L_0x04ef:
            java.lang.String r1 = "OMX.amlogic.avc.decoder.awesome"
            boolean r1 = r1.equals(r5)     // Catch:{ Exception -> 0x066b }
            if (r1 != 0) goto L_0x04ff
            java.lang.String r1 = "OMX.amlogic.avc.decoder.awesome.secure"
            boolean r1 = r1.equals(r5)     // Catch:{ Exception -> 0x066b }
            if (r1 == 0) goto L_0x0501
        L_0x04ff:
            r1 = 1
            goto L_0x0502
        L_0x0501:
            r1 = 0
        L_0x0502:
            r0.A0a = r1     // Catch:{ Exception -> 0x066b }
            r1 = 21
            if (r6 != r1) goto L_0x0511
            java.lang.String r1 = "OMX.google.aac.decoder"
            boolean r2 = r1.equals(r5)     // Catch:{ Exception -> 0x066b }
            r1 = 1
            if (r2 != 0) goto L_0x0512
        L_0x0511:
            r1 = 0
        L_0x0512:
            r0.A0b = r1     // Catch:{ Exception -> 0x066b }
            r1 = 21
            if (r6 >= r1) goto L_0x055e
            java.lang.String r1 = "OMX.SEC.mp3.dec"
            boolean r1 = r1.equals(r5)     // Catch:{ Exception -> 0x066b }
            if (r1 == 0) goto L_0x055e
            java.lang.String r2 = X.AnonymousClass3C1.A04     // Catch:{ Exception -> 0x066b }
            java.lang.String r1 = "samsung"
            boolean r1 = r1.equals(r2)     // Catch:{ Exception -> 0x066b }
            if (r1 == 0) goto L_0x055e
            java.lang.String r2 = X.AnonymousClass3C1.A02     // Catch:{ Exception -> 0x066b }
            java.lang.String r1 = "baffin"
            boolean r1 = r2.startsWith(r1)     // Catch:{ Exception -> 0x066b }
            if (r1 != 0) goto L_0x055c
            java.lang.String r1 = "grand"
            boolean r1 = r2.startsWith(r1)     // Catch:{ Exception -> 0x066b }
            if (r1 != 0) goto L_0x055c
            java.lang.String r1 = "fortuna"
            boolean r1 = r2.startsWith(r1)     // Catch:{ Exception -> 0x066b }
            if (r1 != 0) goto L_0x055c
            java.lang.String r1 = "gprimelte"
            boolean r1 = r2.startsWith(r1)     // Catch:{ Exception -> 0x066b }
            if (r1 != 0) goto L_0x055c
            java.lang.String r1 = "j2y18lte"
            boolean r1 = r2.startsWith(r1)     // Catch:{ Exception -> 0x066b }
            if (r1 != 0) goto L_0x055c
            java.lang.String r1 = "ms01"
            boolean r1 = r2.startsWith(r1)     // Catch:{ Exception -> 0x066b }
            if (r1 == 0) goto L_0x055e
        L_0x055c:
            r1 = 1
            goto L_0x055f
        L_0x055e:
            r1 = 0
        L_0x055f:
            r0.A0Z = r1     // Catch:{ Exception -> 0x066b }
            X.1gT r4 = r0.A0H     // Catch:{ Exception -> 0x066b }
            r2 = 1
            r1 = 18
            if (r6 > r1) goto L_0x0577
            int r1 = r4.A06     // Catch:{ Exception -> 0x066b }
            if (r1 != r2) goto L_0x0577
            java.lang.String r1 = "OMX.MTK.AUDIO.DECODER.MP3"
            boolean r1 = r1.equals(r5)     // Catch:{ Exception -> 0x066b }
            if (r1 == 0) goto L_0x0577
        L_0x0574:
            r0.A0e = r2     // Catch:{ Exception -> 0x066b }
            goto L_0x0579
        L_0x0577:
            r2 = 0
            goto L_0x0574
        L_0x0579:
            r1 = 25
            if (r6 > r1) goto L_0x058a
            java.lang.String r1 = "OMX.rk.video_decoder.avc"
            boolean r1 = r1.equals(r5)     // Catch:{ Exception -> 0x066b }
            if (r1 != 0) goto L_0x05cf
            r1 = 17
            if (r6 > r1) goto L_0x0597
            goto L_0x058f
        L_0x058a:
            r1 = 29
            if (r6 > r1) goto L_0x05a7
            goto L_0x0597
        L_0x058f:
            java.lang.String r1 = "OMX.allwinner.video.decoder.avc"
            boolean r1 = r1.equals(r5)     // Catch:{ Exception -> 0x066b }
            if (r1 != 0) goto L_0x05cf
        L_0x0597:
            java.lang.String r1 = "OMX.broadcom.video_decoder.tunnel"
            boolean r1 = r1.equals(r5)     // Catch:{ Exception -> 0x066b }
            if (r1 != 0) goto L_0x05cf
            java.lang.String r1 = "OMX.broadcom.video_decoder.tunnel.secure"
            boolean r1 = r1.equals(r5)     // Catch:{ Exception -> 0x066b }
            if (r1 != 0) goto L_0x05cf
        L_0x05a7:
            java.lang.String r2 = X.AnonymousClass3C1.A04     // Catch:{ Exception -> 0x066b }
            java.lang.String r1 = "Amazon"
            boolean r1 = r1.equals(r2)     // Catch:{ Exception -> 0x066b }
            if (r1 == 0) goto L_0x05c0
            java.lang.String r2 = X.AnonymousClass3C1.A05     // Catch:{ Exception -> 0x066b }
            java.lang.String r1 = "AFTS"
            boolean r1 = r1.equals(r2)     // Catch:{ Exception -> 0x066b }
            if (r1 == 0) goto L_0x05c0
            boolean r1 = r3.A06     // Catch:{ Exception -> 0x066b }
            if (r1 == 0) goto L_0x05c0
            goto L_0x05cf
        L_0x05c0:
            r1 = r0
            if (r19 == 0) goto L_0x05cd
            X.3Ux r1 = (X.C65473Ux) r1     // Catch:{ Exception -> 0x066b }
            boolean r1 = r1.A0U     // Catch:{ Exception -> 0x066b }
            if (r1 == 0) goto L_0x05cd
            r1 = 23
            if (r6 < r1) goto L_0x05cf
        L_0x05cd:
            r1 = 0
            goto L_0x05d0
        L_0x05cf:
            r1 = 1
        L_0x05d0:
            r0.A0c = r1     // Catch:{ Exception -> 0x066b }
            java.lang.String r1 = "c2.android.mp3.decoder"
            boolean r1 = r1.equals(r5)     // Catch:{ Exception -> 0x066b }
            if (r1 == 0) goto L_0x05e1
            X.4JV r1 = new X.4JV     // Catch:{ Exception -> 0x066b }
            r1.<init>()     // Catch:{ Exception -> 0x066b }
            r0.A0N = r1     // Catch:{ Exception -> 0x066b }
        L_0x05e1:
            int r2 = r0.A01     // Catch:{ Exception -> 0x066b }
            r1 = 2
            if (r2 != r1) goto L_0x05ef
            long r1 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x066b }
            r7 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 + r7
            r0.A0A = r1     // Catch:{ Exception -> 0x066b }
        L_0x05ef:
            X.4Oq r2 = r0.A0K     // Catch:{ Exception -> 0x066b }
            int r1 = r2.A00     // Catch:{ Exception -> 0x066b }
            int r1 = r1 + 1
            r2.A00 = r1     // Catch:{ Exception -> 0x066b }
            long r14 = r12 - r16
            r7 = r0
            if (r19 == 0) goto L_0x0645
            X.3Ux r7 = (X.C65473Ux) r7     // Catch:{ Exception -> 0x066b }
            X.4GS r4 = r7.A0Z     // Catch:{ Exception -> 0x066b }
            android.os.Handler r2 = r4.A00     // Catch:{ Exception -> 0x066b }
            r11 = 1
            com.facebook.redex.RunnableRunnableShape0S1100200_I1 r1 = new com.facebook.redex.RunnableRunnableShape0S1100200_I1     // Catch:{ Exception -> 0x066b }
            r8 = r1
            r9 = r4
            r10 = r5
            r8.<init>(r9, r10, r11, r12, r14)     // Catch:{ Exception -> 0x066b }
            r2.post(r1)     // Catch:{ Exception -> 0x066b }
            boolean r1 = X.C65473Ux.A06(r5)     // Catch:{ Exception -> 0x066b }
            r7.A0P = r1     // Catch:{ Exception -> 0x066b }
            X.4eg r4 = r7.A0P     // Catch:{ Exception -> 0x066b }
            r8 = 0
            r1 = 29
            if (r6 < r1) goto L_0x0640
            java.lang.String r2 = r4.A02     // Catch:{ Exception -> 0x066b }
            java.lang.String r1 = "video/x-vnd.on2.vp9"
            boolean r1 = r1.equals(r2)     // Catch:{ Exception -> 0x066b }
            if (r1 == 0) goto L_0x0640
            android.media.MediaCodecInfo$CodecCapabilities r1 = r4.A00     // Catch:{ Exception -> 0x066b }
            if (r1 == 0) goto L_0x062d
            android.media.MediaCodecInfo$CodecProfileLevel[] r5 = r1.profileLevels     // Catch:{ Exception -> 0x066b }
            if (r5 != 0) goto L_0x062f
        L_0x062d:
            android.media.MediaCodecInfo$CodecProfileLevel[] r5 = new android.media.MediaCodecInfo.CodecProfileLevel[r8]     // Catch:{ Exception -> 0x066b }
        L_0x062f:
            int r4 = r5.length     // Catch:{ Exception -> 0x066b }
        L_0x0630:
            if (r8 >= r4) goto L_0x0640
            r1 = r5[r8]     // Catch:{ Exception -> 0x066b }
            int r2 = r1.profile     // Catch:{ Exception -> 0x066b }
            r1 = 16384(0x4000, float:2.2959E-41)
            if (r2 != r1) goto L_0x063b
            goto L_0x063e
        L_0x063b:
            int r8 = r8 + 1
            goto L_0x0630
        L_0x063e:
            r1 = 1
            goto L_0x0641
        L_0x0640:
            r1 = 0
        L_0x0641:
            r7.A0O = r1     // Catch:{ Exception -> 0x066b }
            goto L_0x00ad
        L_0x0645:
            X.3Uy r7 = (X.C65483Uy) r7     // Catch:{ Exception -> 0x066b }
            X.4TD r4 = r7.A09     // Catch:{ Exception -> 0x066b }
            android.os.Handler r2 = r4.A00     // Catch:{ Exception -> 0x066b }
            if (r2 == 0) goto L_0x00ad
            r11 = 0
            com.facebook.redex.RunnableRunnableShape0S1100200_I1 r1 = new com.facebook.redex.RunnableRunnableShape0S1100200_I1     // Catch:{ Exception -> 0x066b }
            r8 = r1
            r9 = r4
            r10 = r5
            r8.<init>(r9, r10, r11, r12, r14)     // Catch:{ Exception -> 0x066b }
            r2.post(r1)     // Catch:{ Exception -> 0x066b }
            goto L_0x00ad
        L_0x065b:
            r2 = move-exception
            goto L_0x065f
        L_0x065d:
            r2 = move-exception
            goto L_0x066a
        L_0x065f:
            r1 = r18
            r4.A00 = r1     // Catch:{ Exception -> 0x066b }
            r4.A01 = r1     // Catch:{ Exception -> 0x066b }
            android.media.MediaCodec r1 = r4.A02     // Catch:{ Exception -> 0x066b }
            r1.release()     // Catch:{ Exception -> 0x066b }
        L_0x066a:
            throw r2     // Catch:{ Exception -> 0x066b }
        L_0x066b:
            r5 = move-exception
            java.lang.String r1 = "Failed to initialize decoder: "
            java.lang.String r2 = X.AnonymousClass000.A0g(r1, r3)     // Catch:{ 441 -> 0x06e0 }
            java.lang.String r1 = "MediaCodecRenderer"
            X.C89504cL.A02(r1, r2, r5)     // Catch:{ 441 -> 0x06e0 }
            java.util.ArrayDeque r1 = r0.A0S     // Catch:{ 441 -> 0x06e0 }
            r1.removeFirst()     // Catch:{ 441 -> 0x06e0 }
            X.1gT r4 = r0.A0I     // Catch:{ 441 -> 0x06e0 }
            java.lang.String r1 = "Decoder init failed: "
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0r(r1)     // Catch:{ 441 -> 0x06e0 }
            java.lang.String r1 = r3.A03     // Catch:{ 441 -> 0x06e0 }
            X.AnonymousClass3K3.A1N(r2, r1)     // Catch:{ 441 -> 0x06e0 }
            java.lang.String r9 = X.AnonymousClass000.A0f(r4, r2)     // Catch:{ 441 -> 0x06e0 }
            java.lang.String r4 = r4.A0T     // Catch:{ 441 -> 0x06e0 }
            int r2 = X.AnonymousClass3C1.A01     // Catch:{ 441 -> 0x06e0 }
            r1 = 21
            if (r2 < r1) goto L_0x06cd
            java.lang.String r11 = X.AnonymousClass441.A00(r5)     // Catch:{ 441 -> 0x06e0 }
        L_0x0699:
            r13 = 0
            X.441 r6 = new X.441     // Catch:{ 441 -> 0x06e0 }
            r7 = r3
            r8 = r18
            r10 = r4
            r12 = r5
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)     // Catch:{ 441 -> 0x06e0 }
            X.441 r1 = r0.A0Q     // Catch:{ 441 -> 0x06e0 }
            if (r1 != 0) goto L_0x06b5
            r0.A0Q = r6     // Catch:{ 441 -> 0x06e0 }
        L_0x06aa:
            java.util.ArrayDeque r1 = r0.A0S     // Catch:{ 441 -> 0x06e0 }
            boolean r1 = r1.isEmpty()     // Catch:{ 441 -> 0x06e0 }
            if (r1 == 0) goto L_0x00ad
            X.441 r4 = r0.A0Q     // Catch:{ 441 -> 0x06e0 }
            goto L_0x06da
        L_0x06b5:
            java.lang.String r7 = r1.getMessage()     // Catch:{ 441 -> 0x06e0 }
            java.lang.Throwable r10 = r1.getCause()     // Catch:{ 441 -> 0x06e0 }
            java.lang.String r8 = r1.mimeType     // Catch:{ 441 -> 0x06e0 }
            boolean r11 = r1.secureDecoderRequired     // Catch:{ 441 -> 0x06e0 }
            X.4eg r5 = r1.codecInfo     // Catch:{ 441 -> 0x06e0 }
            java.lang.String r9 = r1.diagnosticInfo     // Catch:{ 441 -> 0x06e0 }
            X.441 r4 = new X.441     // Catch:{ 441 -> 0x06e0 }
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ 441 -> 0x06e0 }
            r0.A0Q = r4     // Catch:{ 441 -> 0x06e0 }
            goto L_0x06aa
        L_0x06cd:
            r11 = 0
            goto L_0x0699
        L_0x06cf:
            r3 = move-exception
            X.1gT r2 = r0.A0I     // Catch:{ 441 -> 0x06e0 }
            r1 = -49998(0xffffffffffff3cb2, float:NaN)
            X.441 r4 = new X.441     // Catch:{ 441 -> 0x06e0 }
            r4.<init>(r2, r3, r1)     // Catch:{ 441 -> 0x06e0 }
        L_0x06da:
            throw r4     // Catch:{ 441 -> 0x06e0 }
        L_0x06db:
            r1 = r18
            r0.A0S = r1     // Catch:{ 441 -> 0x06e0 }
            return
        L_0x06e0:
            r3 = move-exception
            X.1gT r2 = r0.A0I
            r1 = 0
            X.43y r0 = r0.A01(r2, r3, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3UH.A0L():void");
    }

    public final void A0M() {
        try {
            throw AnonymousClass000.A0W("sessionId");
        } catch (MediaCryptoException e2) {
            throw A01(this.A0I, e2, false);
        }
    }

    public void A0N(long j2) {
        while (true) {
            int i2 = this.A09;
            if (i2 != 0) {
                long[] jArr = this.A13;
                if (j2 >= jArr[0]) {
                    long[] jArr2 = this.A12;
                    this.A0E = jArr2[0];
                    long[] jArr3 = this.A11;
                    this.A0D = jArr3[0];
                    int i3 = i2 - 1;
                    this.A09 = i3;
                    System.arraycopy(jArr2, 1, jArr2, 0, i3);
                    System.arraycopy(jArr3, 1, jArr3, 0, this.A09);
                    System.arraycopy(jArr, 1, jArr, 0, this.A09);
                    if (this instanceof C65473Ux) {
                        ((C65473Ux) this).A0X();
                    } else {
                        ((C96334oA) ((C65483Uy) this).A0A).A0V = true;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v11, resolved type: X.1gT} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0O(long r10) {
        /*
            r9 = this;
            X.4La r6 = r9.A0z
            monitor-enter(r6)
            r5 = 0
        L_0x0004:
            int r7 = r6.A01     // Catch:{ all -> 0x006c }
            if (r7 <= 0) goto L_0x0028
            long[] r0 = r6.A02     // Catch:{ all -> 0x006c }
            int r8 = r6.A00     // Catch:{ all -> 0x006c }
            r0 = r0[r8]     // Catch:{ all -> 0x006c }
            long r3 = r10 - r0
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0028
            r3 = 1
            java.lang.Object[] r2 = r6.A03     // Catch:{ all -> 0x006c }
            r5 = r2[r8]     // Catch:{ all -> 0x006c }
            r0 = 0
            r2[r8] = r0     // Catch:{ all -> 0x006c }
            int r1 = r8 + 1
            int r0 = r2.length     // Catch:{ all -> 0x006c }
            int r1 = r1 % r0
            r6.A00 = r1     // Catch:{ all -> 0x006c }
            int r7 = r7 - r3
            r6.A01 = r7     // Catch:{ all -> 0x006c }
            goto L_0x0004
        L_0x0028:
            monitor-exit(r6)
            X.1gT r5 = (X.C32491gT) r5
            if (r5 != 0) goto L_0x0056
            boolean r0 = r9.A0g
            if (r0 == 0) goto L_0x0056
            monitor-enter(r6)
            int r4 = r6.A01     // Catch:{ all -> 0x006c }
            if (r4 != 0) goto L_0x0037
            goto L_0x0052
        L_0x0037:
            r3 = 1
            boolean r0 = X.AnonymousClass000.A1Q(r4)
            X.C90524eJ.A04(r0)     // Catch:{ all -> 0x006c }
            java.lang.Object[] r2 = r6.A03     // Catch:{ all -> 0x006c }
            int r1 = r6.A00     // Catch:{ all -> 0x006c }
            r5 = r2[r1]     // Catch:{ all -> 0x006c }
            r0 = 0
            r2[r1] = r0     // Catch:{ all -> 0x006c }
            int r1 = r1 + 1
            int r0 = r2.length     // Catch:{ all -> 0x006c }
            int r1 = r1 % r0
            r6.A00 = r1     // Catch:{ all -> 0x006c }
            int r4 = r4 - r3
            r6.A01 = r4     // Catch:{ all -> 0x006c }
            goto L_0x0053
        L_0x0052:
            r5 = 0
        L_0x0053:
            monitor-exit(r6)
            X.1gT r5 = (X.C32491gT) r5
        L_0x0056:
            r1 = 0
            if (r5 == 0) goto L_0x0063
            r9.A0J = r5
        L_0x005b:
            android.media.MediaFormat r0 = r9.A0F
            r9.A0P(r0, r5)
            r9.A0g = r1
        L_0x0062:
            return
        L_0x0063:
            boolean r0 = r9.A0g
            if (r0 == 0) goto L_0x0062
            X.1gT r5 = r9.A0J
            if (r5 == 0) goto L_0x0062
            goto L_0x005b
        L_0x006c:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3UH.A0O(long):void");
    }

    public void A0P(MediaFormat mediaFormat, C32491gT r9) {
        int i2;
        boolean z2;
        int integer;
        int integer2;
        if (this instanceof C65473Ux) {
            C65473Ux r4 = (C65473Ux) this;
            AnonymousClass5T3 r0 = r4.A0O;
            if (r0 != null) {
                ((C97084pN) r0).A02.setVideoScalingMode(r4.A0B);
            }
            if (r4.A0U) {
                r4.A06 = r9.A0I;
                integer2 = r9.A09;
            } else {
                if (!mediaFormat.containsKey("crop-right") || !mediaFormat.containsKey("crop-left") || !mediaFormat.containsKey("crop-bottom") || !mediaFormat.containsKey("crop-top")) {
                    z2 = false;
                    integer = mediaFormat.getInteger("width");
                } else {
                    z2 = true;
                    integer = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
                }
                r4.A06 = integer;
                integer2 = z2 ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
            }
            r4.A04 = integer2;
            float f2 = r9.A02;
            r4.A00 = f2;
            if (AnonymousClass3C1.A01 >= 21) {
                int i3 = r9.A0E;
                if (i3 == 90 || i3 == 270) {
                    int i4 = r4.A06;
                    r4.A06 = integer2;
                    r4.A04 = i4;
                    r4.A00 = 1.0f / f2;
                }
            } else {
                r4.A05 = r9.A0E;
            }
            C89444cB r42 = r4.A0Y;
            r42.A00 = r9.A01;
            C86114Rg r3 = r42.A0E;
            r3.A03.A00();
            r3.A02.A00();
            r3.A04 = false;
            r3.A01 = -9223372036854775807L;
            r3.A00 = 0;
            r42.A05();
            return;
        }
        C65483Uy r32 = (C65483Uy) this;
        C32491gT r02 = r32.A02;
        int[] iArr = null;
        if (r02 != null) {
            r9 = r02;
        } else if (r32.A0O != null) {
            int A012 = "audio/raw".equals(r9.A0T) ? r9.A0B : (AnonymousClass3C1.A01 < 24 || !mediaFormat.containsKey("pcm-encoding")) ? mediaFormat.containsKey("v-bits-per-sample") ? AnonymousClass3C1.A01(mediaFormat.getInteger("v-bits-per-sample")) : 2 : mediaFormat.getInteger("pcm-encoding");
            C32471gR A0N2 = AnonymousClass3K4.A0N();
            A0N2.A0R = "audio/raw";
            A0N2.A09 = A012;
            A0N2.A05 = r9.A07;
            A0N2.A06 = r9.A08;
            A0N2.A04 = mediaFormat.getInteger("channel-count");
            A0N2.A0D = mediaFormat.getInteger("sample-rate");
            C32491gT r5 = new C32491gT(A0N2);
            if (r32.A07 && r5.A06 == 6 && (i2 = r9.A06) < 6) {
                iArr = new int[i2];
                for (int i5 = 0; i5 < i2; i5++) {
                    iArr[i5] = i5;
                }
            }
            r9 = r5;
        }
        try {
            r32.A0A.A6X(r9, iArr, 0);
        } catch (C804243u e2) {
            throw r32.A01(e2.format, e2, false);
        }
    }

    public void A0Q(AnonymousClass3UX r1) {
    }

    public boolean A0R() {
        if (this.A0O != null) {
            if (this.A04 == 3 || this.A0d || ((this.A0f && !this.A0W) || (this.A0a && this.A0i))) {
                A0E();
                return true;
            }
            A0K();
        }
        return false;
    }

    public final boolean A0S() {
        if (this.A0h) {
            this.A05 = 1;
            if (this.A0d || this.A0a) {
                this.A04 = 3;
                return false;
            }
            this.A04 = 2;
            return true;
        }
        A0M();
        throw AnonymousClass000.A0Z();
    }

    public final boolean A0T() {
        if (AnonymousClass3C1.A01 >= 23) {
            float A0B2 = A0B(this.A08, this.A02);
            float f2 = this.A00;
            if (f2 != A0B2) {
                if (A0B2 == -1.0f) {
                    A0J();
                    return false;
                } else if (f2 != -1.0f || A0B2 > this.A0r) {
                    Bundle A0D2 = C13690nt.A0D();
                    A0D2.putFloat("operating-rate", A0B2);
                    this.A0O.AeH(A0D2);
                    this.A00 = A0B2;
                }
            }
        }
        return true;
    }

    public boolean A0U(C32491gT r6, AnonymousClass5T3 r7, ByteBuffer byteBuffer, int i2, int i3, int i4, long j2, long j3, long j4, boolean z2, boolean z3) {
        C65483Uy r3 = (C65483Uy) this;
        if (r3.A02 != null && (i3 & 2) != 0) {
            ((C97084pN) r7).A02.releaseOutputBuffer(i2, false);
            return true;
        } else if (z2) {
            if (r7 != null) {
                ((C97084pN) r7).A02.releaseOutputBuffer(i2, false);
            }
            r3.A0K.A08 += i4;
            ((C96334oA) r3.A0A).A0V = true;
            return true;
        } else {
            try {
                if (!r3.A0A.AHJ(byteBuffer, i4, j4)) {
                    return false;
                }
                if (r7 != null) {
                    ((C97084pN) r7).A02.releaseOutputBuffer(i2, false);
                }
                r3.A0K.A06 += i4;
                return true;
            } catch (C802843g e2) {
                throw r3.A01(e2.format, e2, e2.isRecoverable);
            } catch (C802943h e3) {
                throw r3.A01(r6, e3, e3.isRecoverable);
            }
        }
    }

    public final boolean A0V(boolean z2) {
        AnonymousClass4G5 r4 = this.A0A;
        r4.A01 = null;
        r4.A00 = null;
        AnonymousClass3UX r3 = this.A0v;
        r3.clear();
        int A002 = A00(r4, r3, z2);
        if (A002 == -5) {
            A0C(r4);
            return true;
        } else if (A002 != -4 || !AnonymousClass4XM.A00(r3)) {
            return false;
        } else {
            this.A0k = true;
            A00();
            return false;
        }
    }

    public boolean AIm() {
        if (!(this instanceof C65483Uy)) {
            return this.A0n;
        }
        C65483Uy r1 = (C65483Uy) this;
        if (!r1.A0n) {
            return false;
        }
        C96334oA r12 = (C96334oA) r1.A0A;
        if (r12.A0D != null) {
            return r12.A0R && !r12.AHd();
        }
        return true;
    }

    public boolean AJY() {
        if (this.A0I == null) {
            return false;
        }
        if ((AHf() ? this.A06 : this.A05.AJY()) || this.A08 >= 0) {
            return true;
        }
        long j2 = this.A0A;
        return j2 != -9223372036854775807L && SystemClock.elapsedRealtime() < j2;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public void Ac6(long r30, long r32) {
        /*
            r29 = this;
            r0 = r30
            r14 = r29
            boolean r2 = r14.A0o
            r6 = 0
            if (r2 == 0) goto L_0x000e
            r14.A0o = r6
            r14.A00()
        L_0x000e:
            X.43y r2 = r14.A0G
            if (r2 != 0) goto L_0x063c
            boolean r2 = r14.A0n     // Catch:{ IllegalStateException -> 0x05fb }
            if (r2 == 0) goto L_0x001a
            r14.A0F()     // Catch:{ IllegalStateException -> 0x05fb }
            return
        L_0x001a:
            X.1gT r2 = r14.A0I     // Catch:{ IllegalStateException -> 0x05fb }
            if (r2 != 0) goto L_0x0026
            r2 = 1
            boolean r2 = r14.A0V(r2)     // Catch:{ IllegalStateException -> 0x05fb }
            if (r2 != 0) goto L_0x0026
            return
        L_0x0026:
            r14.A0L()     // Catch:{ IllegalStateException -> 0x05fb }
            boolean r2 = r14.A0U     // Catch:{ IllegalStateException -> 0x05fb }
            r23 = r32
            if (r2 == 0) goto L_0x0105
            java.lang.String r2 = "bypassRender"
            X.C90224dm.A02(r2)     // Catch:{ IllegalStateException -> 0x05fb }
        L_0x0034:
            boolean r2 = r14.A0n     // Catch:{ IllegalStateException -> 0x05fb }
            r2 = r2 ^ 1
            X.C90524eJ.A04(r2)     // Catch:{ IllegalStateException -> 0x05fb }
            X.3Ud r4 = r14.A0w     // Catch:{ IllegalStateException -> 0x05fb }
            int r9 = r4.A01     // Catch:{ IllegalStateException -> 0x05fb }
            if (r9 <= 0) goto L_0x0072
            r16 = 0
            java.nio.ByteBuffer r8 = r4.A01     // Catch:{ IllegalStateException -> 0x05fb }
            int r7 = r14.A08     // Catch:{ IllegalStateException -> 0x05fb }
            long r2 = r4.A00     // Catch:{ IllegalStateException -> 0x05fb }
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
            int r5 = r4.flags     // Catch:{ IllegalStateException -> 0x05fb }
            r5 = r5 & r10
            boolean r27 = X.AnonymousClass000.A1R(r5, r10)     // Catch:{ IllegalStateException -> 0x05fb }
            boolean r28 = X.AnonymousClass4XM.A00(r4)     // Catch:{ IllegalStateException -> 0x05fb }
            X.1gT r15 = r14.A0J     // Catch:{ IllegalStateException -> 0x05fb }
            r19 = 0
            r17 = r8
            r18 = r7
            r20 = r9
            r21 = r0
            r25 = r2
            boolean r2 = r14.A0U(r15, r16, r17, r18, r19, r20, r21, r23, r25, r27, r28)     // Catch:{ IllegalStateException -> 0x05fb }
            if (r2 == 0) goto L_0x0079
            long r2 = r4.A02     // Catch:{ IllegalStateException -> 0x05fb }
            r14.A0N(r2)     // Catch:{ IllegalStateException -> 0x05fb }
            r4.clear()     // Catch:{ IllegalStateException -> 0x05fb }
        L_0x0072:
            boolean r2 = r14.A0k     // Catch:{ IllegalStateException -> 0x05fb }
            r9 = 1
            if (r2 == 0) goto L_0x0082
            r14.A0n = r9     // Catch:{ IllegalStateException -> 0x05fb }
        L_0x0079:
            X.C90224dm.A00()     // Catch:{ IllegalStateException -> 0x05fb }
        L_0x007c:
            X.4Oq r0 = r14.A0K     // Catch:{ IllegalStateException -> 0x05fb }
            monitor-enter(r0)     // Catch:{ IllegalStateException -> 0x05fb }
            monitor-exit(r0)     // Catch:{ IllegalStateException -> 0x05fb }
            goto L_0x05e8
        L_0x0082:
            boolean r2 = r14.A0V     // Catch:{ IllegalStateException -> 0x05fb }
            if (r2 == 0) goto L_0x0091
            X.3UX r2 = r14.A0u     // Catch:{ IllegalStateException -> 0x05fb }
            boolean r2 = r4.A02(r2)     // Catch:{ IllegalStateException -> 0x05fb }
            X.C90524eJ.A04(r2)     // Catch:{ IllegalStateException -> 0x05fb }
            r14.A0V = r6     // Catch:{ IllegalStateException -> 0x05fb }
        L_0x0091:
            boolean r2 = r14.A0T     // Catch:{ IllegalStateException -> 0x05fb }
            if (r2 == 0) goto L_0x00a6
            int r2 = r4.A01     // Catch:{ IllegalStateException -> 0x05fb }
            if (r2 > 0) goto L_0x0034
            r14.A0I()     // Catch:{ IllegalStateException -> 0x05fb }
            r14.A0T = r6     // Catch:{ IllegalStateException -> 0x05fb }
            r14.A0L()     // Catch:{ IllegalStateException -> 0x05fb }
            boolean r2 = r14.A0U     // Catch:{ IllegalStateException -> 0x05fb }
            if (r2 != 0) goto L_0x00a6
            goto L_0x0079
        L_0x00a6:
            boolean r2 = r14.A0k     // Catch:{ IllegalStateException -> 0x05fb }
            r2 = r2 ^ 1
            X.C90524eJ.A04(r2)     // Catch:{ IllegalStateException -> 0x05fb }
            X.4G5 r8 = r14.A0A     // Catch:{ IllegalStateException -> 0x05fb }
            r7 = 0
            r8.A01 = r7     // Catch:{ IllegalStateException -> 0x05fb }
            r8.A00 = r7     // Catch:{ IllegalStateException -> 0x05fb }
            X.3UX r5 = r14.A0u     // Catch:{ IllegalStateException -> 0x05fb }
            r5.clear()     // Catch:{ IllegalStateException -> 0x05fb }
        L_0x00b9:
            r5.clear()     // Catch:{ IllegalStateException -> 0x05fb }
            int r3 = r14.A00(r8, r5, r6)     // Catch:{ IllegalStateException -> 0x05fb }
            r2 = -5
            if (r3 == r2) goto L_0x00cb
            r2 = -4
            if (r3 == r2) goto L_0x00cf
            r2 = -3
            if (r3 == r2) goto L_0x00d7
            goto L_0x05f6
        L_0x00cb:
            r14.A0C(r8)     // Catch:{ IllegalStateException -> 0x05fb }
            goto L_0x00d7
        L_0x00cf:
            boolean r2 = X.AnonymousClass4XM.A00(r5)     // Catch:{ IllegalStateException -> 0x05fb }
            if (r2 == 0) goto L_0x00ec
            r14.A0k = r9     // Catch:{ IllegalStateException -> 0x05fb }
        L_0x00d7:
            int r2 = r4.A01     // Catch:{ IllegalStateException -> 0x05fb }
            if (r2 <= 0) goto L_0x00de
            r4.A00()     // Catch:{ IllegalStateException -> 0x05fb }
        L_0x00de:
            int r2 = r4.A01     // Catch:{ IllegalStateException -> 0x05fb }
            if (r2 > 0) goto L_0x0034
            boolean r2 = r14.A0k     // Catch:{ IllegalStateException -> 0x05fb }
            if (r2 != 0) goto L_0x0034
            boolean r2 = r14.A0T     // Catch:{ IllegalStateException -> 0x05fb }
            if (r2 == 0) goto L_0x0079
            goto L_0x0034
        L_0x00ec:
            boolean r2 = r14.A0q     // Catch:{ IllegalStateException -> 0x05fb }
            if (r2 == 0) goto L_0x00f9
            X.1gT r2 = r14.A0I     // Catch:{ IllegalStateException -> 0x05fb }
            r14.A0J = r2     // Catch:{ IllegalStateException -> 0x05fb }
            r14.A0P(r7, r2)     // Catch:{ IllegalStateException -> 0x05fb }
            r14.A0q = r6     // Catch:{ IllegalStateException -> 0x05fb }
        L_0x00f9:
            r5.A00()     // Catch:{ IllegalStateException -> 0x05fb }
            boolean r2 = r4.A02(r5)     // Catch:{ IllegalStateException -> 0x05fb }
            if (r2 != 0) goto L_0x00b9
            r14.A0V = r9     // Catch:{ IllegalStateException -> 0x05fb }
            goto L_0x00d7
        L_0x0105:
            X.5T3 r2 = r14.A0O     // Catch:{ IllegalStateException -> 0x05fb }
            if (r2 == 0) goto L_0x05d2
            android.os.SystemClock.elapsedRealtime()     // Catch:{ IllegalStateException -> 0x05fb }
            java.lang.String r2 = "drainAndFeed"
            X.C90224dm.A02(r2)     // Catch:{ IllegalStateException -> 0x05fb }
        L_0x0111:
            int r2 = r14.A08     // Catch:{ IllegalStateException -> 0x05fb }
            if (r2 >= 0) goto L_0x01bd
            r4 = 1
            boolean r2 = r14.A0b     // Catch:{ IllegalStateException -> 0x05fb }
            if (r2 == 0) goto L_0x013f
            boolean r2 = r14.A0i     // Catch:{ IllegalStateException -> 0x05fb }
            if (r2 == 0) goto L_0x013f
            X.5T3 r8 = r14.A0O     // Catch:{ IllegalStateException -> 0x01f6 }
            android.media.MediaCodec$BufferInfo r5 = r14.A0s     // Catch:{ IllegalStateException -> 0x01f6 }
            X.4pN r8 = (X.C97084pN) r8     // Catch:{ IllegalStateException -> 0x01f6 }
        L_0x0124:
            android.media.MediaCodec r7 = r8.A02     // Catch:{ IllegalStateException -> 0x01f6 }
            r2 = 0
            int r3 = r7.dequeueOutputBuffer(r5, r2)     // Catch:{ IllegalStateException -> 0x01f6 }
            r2 = -3
            if (r3 != r2) goto L_0x013c
            int r3 = X.AnonymousClass3C1.A01     // Catch:{ IllegalStateException -> 0x01f6 }
            r2 = 21
            if (r3 >= r2) goto L_0x0124
            java.nio.ByteBuffer[] r2 = r7.getOutputBuffers()     // Catch:{ IllegalStateException -> 0x01f6 }
            r8.A01 = r2     // Catch:{ IllegalStateException -> 0x01f6 }
            goto L_0x0124
        L_0x013c:
            if (r3 == r2) goto L_0x0124
            goto L_0x015f
        L_0x013f:
            X.5T3 r8 = r14.A0O     // Catch:{ IllegalStateException -> 0x05fb }
            android.media.MediaCodec$BufferInfo r5 = r14.A0s     // Catch:{ IllegalStateException -> 0x05fb }
            X.4pN r8 = (X.C97084pN) r8     // Catch:{ IllegalStateException -> 0x05fb }
        L_0x0145:
            android.media.MediaCodec r7 = r8.A02     // Catch:{ IllegalStateException -> 0x05fb }
            r2 = 0
            int r3 = r7.dequeueOutputBuffer(r5, r2)     // Catch:{ IllegalStateException -> 0x05fb }
            r2 = -3
            if (r3 != r2) goto L_0x015d
            int r3 = X.AnonymousClass3C1.A01     // Catch:{ IllegalStateException -> 0x05fb }
            r2 = 21
            if (r3 >= r2) goto L_0x0145
            java.nio.ByteBuffer[] r2 = r7.getOutputBuffers()     // Catch:{ IllegalStateException -> 0x05fb }
            r8.A01 = r2     // Catch:{ IllegalStateException -> 0x05fb }
            goto L_0x0145
        L_0x015d:
            if (r3 == r2) goto L_0x0145
        L_0x015f:
            if (r3 >= 0) goto L_0x01a7
            r2 = -2
            if (r3 != r2) goto L_0x0198
            r14.A0W = r4     // Catch:{ IllegalStateException -> 0x05fb }
            X.5T3 r2 = r14.A0O     // Catch:{ IllegalStateException -> 0x05fb }
            X.4pN r2 = (X.C97084pN) r2     // Catch:{ IllegalStateException -> 0x05fb }
            android.media.MediaCodec r2 = r2.A02     // Catch:{ IllegalStateException -> 0x05fb }
            android.media.MediaFormat r5 = r2.getOutputFormat()     // Catch:{ IllegalStateException -> 0x05fb }
            int r2 = r14.A03     // Catch:{ IllegalStateException -> 0x05fb }
            if (r2 == 0) goto L_0x0189
            java.lang.String r2 = "width"
            int r2 = r5.getInteger(r2)     // Catch:{ IllegalStateException -> 0x05fb }
            r3 = 32
            if (r2 != r3) goto L_0x0189
            java.lang.String r2 = "height"
            int r2 = r5.getInteger(r2)     // Catch:{ IllegalStateException -> 0x05fb }
            if (r2 != r3) goto L_0x0189
            r14.A0p = r4     // Catch:{ IllegalStateException -> 0x05fb }
            goto L_0x0111
        L_0x0189:
            boolean r2 = r14.A0e     // Catch:{ IllegalStateException -> 0x05fb }
            if (r2 == 0) goto L_0x0192
            java.lang.String r2 = "channel-count"
            r5.setInteger(r2, r4)     // Catch:{ IllegalStateException -> 0x05fb }
        L_0x0192:
            r14.A0F = r5     // Catch:{ IllegalStateException -> 0x05fb }
            r14.A0g = r4     // Catch:{ IllegalStateException -> 0x05fb }
            goto L_0x0111
        L_0x0198:
            boolean r0 = r14.A0c     // Catch:{ IllegalStateException -> 0x05fb }
            if (r0 == 0) goto L_0x024f
            boolean r0 = r14.A0k     // Catch:{ IllegalStateException -> 0x05fb }
            if (r0 != 0) goto L_0x024c
            int r1 = r14.A05     // Catch:{ IllegalStateException -> 0x05fb }
            r0 = 2
            if (r1 != r0) goto L_0x024f
            goto L_0x024c
        L_0x01a7:
            boolean r2 = r14.A0p     // Catch:{ IllegalStateException -> 0x05fb }
            if (r2 == 0) goto L_0x0242
            r14.A0p = r6     // Catch:{ IllegalStateException -> 0x05fb }
            X.5T3 r2 = r14.A0O     // Catch:{ IllegalStateException -> 0x05fb }
            X.4pN r2 = (X.C97084pN) r2     // Catch:{ IllegalStateException -> 0x05fb }
            android.media.MediaCodec r2 = r2.A02     // Catch:{ IllegalStateException -> 0x05fb }
            r2.releaseOutputBuffer(r3, r6)     // Catch:{ IllegalStateException -> 0x05fb }
            goto L_0x0111
        L_0x01b8:
            r14.A0m = r2     // Catch:{ IllegalStateException -> 0x05fb }
            r14.A0O(r3)     // Catch:{ IllegalStateException -> 0x05fb }
        L_0x01bd:
            boolean r2 = r14.A0b     // Catch:{ IllegalStateException -> 0x05fb }
            if (r2 == 0) goto L_0x0201
            boolean r2 = r14.A0i     // Catch:{ IllegalStateException -> 0x05fb }
            if (r2 == 0) goto L_0x0201
            X.5T3 r11 = r14.A0O     // Catch:{ IllegalStateException -> 0x01ee }
            java.nio.ByteBuffer r10 = r14.A0R     // Catch:{ IllegalStateException -> 0x01ee }
            int r9 = r14.A08     // Catch:{ IllegalStateException -> 0x01ee }
            android.media.MediaCodec$BufferInfo r5 = r14.A0s     // Catch:{ IllegalStateException -> 0x01ee }
            int r8 = r5.flags     // Catch:{ IllegalStateException -> 0x01ee }
            long r2 = r5.presentationTimeUs     // Catch:{ IllegalStateException -> 0x01ee }
            boolean r7 = r14.A0l     // Catch:{ IllegalStateException -> 0x01ee }
            boolean r4 = r14.A0m     // Catch:{ IllegalStateException -> 0x01ee }
            X.1gT r15 = r14.A0J     // Catch:{ IllegalStateException -> 0x01ee }
            r20 = 1
            r17 = r10
            r18 = r9
            r19 = r8
            r21 = r0
            r25 = r2
            r27 = r7
            r28 = r4
            r16 = r11
            boolean r2 = r14.A0U(r15, r16, r17, r18, r19, r20, r21, r23, r25, r27, r28)     // Catch:{ IllegalStateException -> 0x01ee }
            goto L_0x0229
        L_0x01ee:
            r14.A00()     // Catch:{ IllegalStateException -> 0x05fb }
            boolean r0 = r14.A0n     // Catch:{ IllegalStateException -> 0x05fb }
            if (r0 == 0) goto L_0x024f
            goto L_0x01fd
        L_0x01f6:
            r14.A00()     // Catch:{ IllegalStateException -> 0x05fb }
            boolean r0 = r14.A0n     // Catch:{ IllegalStateException -> 0x05fb }
            if (r0 == 0) goto L_0x024f
        L_0x01fd:
            r14.A0E()     // Catch:{ IllegalStateException -> 0x05fb }
            goto L_0x024f
        L_0x0201:
            X.5T3 r11 = r14.A0O     // Catch:{ IllegalStateException -> 0x05fb }
            java.nio.ByteBuffer r10 = r14.A0R     // Catch:{ IllegalStateException -> 0x05fb }
            int r9 = r14.A08     // Catch:{ IllegalStateException -> 0x05fb }
            android.media.MediaCodec$BufferInfo r5 = r14.A0s     // Catch:{ IllegalStateException -> 0x05fb }
            int r8 = r5.flags     // Catch:{ IllegalStateException -> 0x05fb }
            long r2 = r5.presentationTimeUs     // Catch:{ IllegalStateException -> 0x05fb }
            boolean r7 = r14.A0l     // Catch:{ IllegalStateException -> 0x05fb }
            boolean r4 = r14.A0m     // Catch:{ IllegalStateException -> 0x05fb }
            X.1gT r15 = r14.A0J     // Catch:{ IllegalStateException -> 0x05fb }
            r20 = 1
            r17 = r10
            r18 = r9
            r19 = r8
            r21 = r0
            r25 = r2
            r27 = r7
            r28 = r4
            r16 = r11
            boolean r2 = r14.A0U(r15, r16, r17, r18, r19, r20, r21, r23, r25, r27, r28)     // Catch:{ IllegalStateException -> 0x05fb }
        L_0x0229:
            if (r2 == 0) goto L_0x024f
            long r2 = r5.presentationTimeUs     // Catch:{ IllegalStateException -> 0x05fb }
            r14.A0N(r2)     // Catch:{ IllegalStateException -> 0x05fb }
            int r2 = r5.flags     // Catch:{ IllegalStateException -> 0x05fb }
            r2 = r2 & 4
            boolean r3 = X.AnonymousClass000.A1O(r2)
            r2 = -1
            r14.A08 = r2     // Catch:{ IllegalStateException -> 0x05fb }
            r2 = 0
            r14.A0R = r2     // Catch:{ IllegalStateException -> 0x05fb }
            if (r3 != 0) goto L_0x024c
            goto L_0x0111
        L_0x0242:
            int r2 = r5.size     // Catch:{ IllegalStateException -> 0x05fb }
            if (r2 != 0) goto L_0x054e
            int r2 = r5.flags     // Catch:{ IllegalStateException -> 0x05fb }
            r2 = r2 & 4
            if (r2 == 0) goto L_0x054e
        L_0x024c:
            r14.A00()     // Catch:{ IllegalStateException -> 0x05fb }
        L_0x024f:
            X.5T3 r2 = r14.A0O     // Catch:{ IllegalStateException -> 0x05fb }
            if (r2 == 0) goto L_0x0079
            int r0 = r14.A05     // Catch:{ IllegalStateException -> 0x05fb }
            r1 = 2
            if (r0 == r1) goto L_0x0079
            boolean r0 = r14.A0k     // Catch:{ IllegalStateException -> 0x05fb }
            if (r0 != 0) goto L_0x0079
            int r0 = r14.A07     // Catch:{ IllegalStateException -> 0x05fb }
            if (r0 >= 0) goto L_0x027b
            X.4pN r2 = (X.C97084pN) r2     // Catch:{ IllegalStateException -> 0x05fb }
            android.media.MediaCodec r0 = r2.A02     // Catch:{ IllegalStateException -> 0x05fb }
            r2 = 0
            int r3 = r0.dequeueInputBuffer(r2)     // Catch:{ IllegalStateException -> 0x05fb }
            r14.A07 = r3     // Catch:{ IllegalStateException -> 0x05fb }
            if (r3 < 0) goto L_0x0079
            X.3UX r2 = r14.A0t     // Catch:{ IllegalStateException -> 0x05fb }
            X.5T3 r0 = r14.A0O     // Catch:{ IllegalStateException -> 0x05fb }
            java.nio.ByteBuffer r0 = r0.ACo(r3)     // Catch:{ IllegalStateException -> 0x05fb }
            r2.A01 = r0     // Catch:{ IllegalStateException -> 0x05fb }
            r2.clear()     // Catch:{ IllegalStateException -> 0x05fb }
        L_0x027b:
            int r0 = r14.A05     // Catch:{ IllegalStateException -> 0x05fb }
            r3 = 1
            if (r0 != r3) goto L_0x02a2
            boolean r0 = r14.A0c     // Catch:{ IllegalStateException -> 0x05fb }
            if (r0 != 0) goto L_0x029e
            r14.A0i = r3     // Catch:{ IllegalStateException -> 0x05fb }
            X.5T3 r0 = r14.A0O     // Catch:{ IllegalStateException -> 0x05fb }
            int r8 = r14.A07     // Catch:{ IllegalStateException -> 0x05fb }
            r11 = 0
            r13 = 4
            X.4pN r0 = (X.C97084pN) r0     // Catch:{ IllegalStateException -> 0x05fb }
            android.media.MediaCodec r7 = r0.A02     // Catch:{ IllegalStateException -> 0x05fb }
            r9 = 0
            r10 = 0
            r7.queueInputBuffer(r8, r9, r10, r11, r13)     // Catch:{ IllegalStateException -> 0x05fb }
            r0 = -1
            r14.A07 = r0     // Catch:{ IllegalStateException -> 0x05fb }
            X.3UX r2 = r14.A0t     // Catch:{ IllegalStateException -> 0x05fb }
            r0 = 0
            r2.A01 = r0     // Catch:{ IllegalStateException -> 0x05fb }
        L_0x029e:
            r14.A05 = r1     // Catch:{ IllegalStateException -> 0x05fb }
            goto L_0x0079
        L_0x02a2:
            boolean r0 = r14.A0X     // Catch:{ IllegalStateException -> 0x05fb }
            if (r0 == 0) goto L_0x02ca
            r14.A0X = r6     // Catch:{ IllegalStateException -> 0x05fb }
            X.3UX r2 = r14.A0t     // Catch:{ IllegalStateException -> 0x05fb }
            java.nio.ByteBuffer r0 = r2.A01     // Catch:{ IllegalStateException -> 0x05fb }
            byte[] r1 = A14     // Catch:{ IllegalStateException -> 0x05fb }
            r0.put(r1)     // Catch:{ IllegalStateException -> 0x05fb }
            X.5T3 r0 = r14.A0O     // Catch:{ IllegalStateException -> 0x05fb }
            int r8 = r14.A07     // Catch:{ IllegalStateException -> 0x05fb }
            int r10 = r1.length     // Catch:{ IllegalStateException -> 0x05fb }
            r11 = 0
            X.4pN r0 = (X.C97084pN) r0     // Catch:{ IllegalStateException -> 0x05fb }
            android.media.MediaCodec r7 = r0.A02     // Catch:{ IllegalStateException -> 0x05fb }
            r9 = 0
            r13 = 0
            r7.queueInputBuffer(r8, r9, r10, r11, r13)     // Catch:{ IllegalStateException -> 0x05fb }
            r0 = -1
            r14.A07 = r0     // Catch:{ IllegalStateException -> 0x05fb }
            r0 = 0
            r2.A01 = r0     // Catch:{ IllegalStateException -> 0x05fb }
            r14.A0h = r3     // Catch:{ IllegalStateException -> 0x05fb }
            goto L_0x024f
        L_0x02ca:
            int r0 = r14.A06     // Catch:{ IllegalStateException -> 0x05fb }
            if (r0 != r3) goto L_0x02ef
            r4 = 0
        L_0x02cf:
            X.1gT r0 = r14.A0H     // Catch:{ IllegalStateException -> 0x05fb }
            java.util.List r0 = r0.A0U     // Catch:{ IllegalStateException -> 0x05fb }
            int r0 = r0.size()     // Catch:{ IllegalStateException -> 0x05fb }
            if (r4 >= r0) goto L_0x02ed
            X.1gT r0 = r14.A0H     // Catch:{ IllegalStateException -> 0x05fb }
            java.util.List r0 = r0.A0U     // Catch:{ IllegalStateException -> 0x05fb }
            java.lang.Object r2 = r0.get(r4)     // Catch:{ IllegalStateException -> 0x05fb }
            byte[] r2 = (byte[]) r2     // Catch:{ IllegalStateException -> 0x05fb }
            X.3UX r0 = r14.A0t     // Catch:{ IllegalStateException -> 0x05fb }
            java.nio.ByteBuffer r0 = r0.A01     // Catch:{ IllegalStateException -> 0x05fb }
            r0.put(r2)     // Catch:{ IllegalStateException -> 0x05fb }
            int r4 = r4 + 1
            goto L_0x02cf
        L_0x02ed:
            r14.A06 = r1     // Catch:{ IllegalStateException -> 0x05fb }
        L_0x02ef:
            X.3UX r0 = r14.A0t     // Catch:{ IllegalStateException -> 0x05fb }
            java.nio.ByteBuffer r2 = r0.A01     // Catch:{ IllegalStateException -> 0x05fb }
            int r9 = r2.position()     // Catch:{ IllegalStateException -> 0x05fb }
            X.4G5 r8 = r14.A0A     // Catch:{ IllegalStateException -> 0x05fb }
            r2 = 0
            r8.A01 = r2     // Catch:{ IllegalStateException -> 0x05fb }
            r8.A00 = r2     // Catch:{ IllegalStateException -> 0x05fb }
            int r7 = r14.A00(r8, r0, r6)     // Catch:{ IllegalStateException -> 0x05fb }
            boolean r4 = r14.AHf()     // Catch:{ IllegalStateException -> 0x05fb }
            if (r4 == 0) goto L_0x030c
            long r4 = r14.A0B     // Catch:{ IllegalStateException -> 0x05fb }
            r14.A0C = r4     // Catch:{ IllegalStateException -> 0x05fb }
        L_0x030c:
            r4 = -3
            if (r7 == r4) goto L_0x0079
            r4 = -5
            if (r7 != r4) goto L_0x0320
            int r2 = r14.A06     // Catch:{ IllegalStateException -> 0x05fb }
            if (r2 != r1) goto L_0x031b
            r0.clear()     // Catch:{ IllegalStateException -> 0x05fb }
            r14.A06 = r3     // Catch:{ IllegalStateException -> 0x05fb }
        L_0x031b:
            r14.A0C(r8)     // Catch:{ IllegalStateException -> 0x05fb }
            goto L_0x024f
        L_0x0320:
            boolean r4 = X.AnonymousClass4XM.A00(r0)     // Catch:{ IllegalStateException -> 0x05fb }
            if (r4 == 0) goto L_0x033a
            int r4 = r14.A06     // Catch:{ IllegalStateException -> 0x05fb }
            if (r4 != r1) goto L_0x032f
            r0.clear()     // Catch:{ IllegalStateException -> 0x05fb }
            r14.A06 = r3     // Catch:{ IllegalStateException -> 0x05fb }
        L_0x032f:
            r14.A0k = r3     // Catch:{ IllegalStateException -> 0x05fb }
            boolean r1 = r14.A0h     // Catch:{ IllegalStateException -> 0x05fb }
            if (r1 != 0) goto L_0x05b5
            r14.A00()     // Catch:{ IllegalStateException -> 0x05fb }
            goto L_0x0079
        L_0x033a:
            boolean r2 = r14.A0h     // Catch:{ IllegalStateException -> 0x05fb }
            if (r2 != 0) goto L_0x0353
            int r2 = r0.flags     // Catch:{ IllegalStateException -> 0x05fb }
            r2 = r2 & 1
            boolean r2 = X.AnonymousClass000.A1R(r2, r3)     // Catch:{ IllegalStateException -> 0x05fb }
            if (r2 != 0) goto L_0x0353
            r0.clear()     // Catch:{ IllegalStateException -> 0x05fb }
            int r0 = r14.A06     // Catch:{ IllegalStateException -> 0x05fb }
            if (r0 != r1) goto L_0x024f
            r14.A06 = r3     // Catch:{ IllegalStateException -> 0x05fb }
            goto L_0x024f
        L_0x0353:
            r2 = 1073741824(0x40000000, float:2.0)
            int r1 = r0.flags     // Catch:{ IllegalStateException -> 0x05fb }
            r1 = r1 & r2
            boolean r13 = X.AnonymousClass000.A1R(r1, r2)     // Catch:{ IllegalStateException -> 0x05fb }
            if (r13 == 0) goto L_0x0373
            X.4OQ r1 = r0.A05     // Catch:{ IllegalStateException -> 0x05fb }
            if (r9 == 0) goto L_0x0373
            int[] r2 = r1.A04     // Catch:{ IllegalStateException -> 0x05fb }
            if (r2 != 0) goto L_0x036e
            int[] r2 = new int[r3]     // Catch:{ IllegalStateException -> 0x05fb }
            r1.A04 = r2     // Catch:{ IllegalStateException -> 0x05fb }
            android.media.MediaCodec$CryptoInfo r1 = r1.A06     // Catch:{ IllegalStateException -> 0x05fb }
            r1.numBytesOfClearData = r2     // Catch:{ IllegalStateException -> 0x05fb }
        L_0x036e:
            r1 = r2[r6]     // Catch:{ IllegalStateException -> 0x05fb }
            int r1 = r1 + r9
            r2[r6] = r1     // Catch:{ IllegalStateException -> 0x05fb }
        L_0x0373:
            boolean r1 = r14.A0Y     // Catch:{ IllegalStateException -> 0x05fb }
            if (r1 == 0) goto L_0x03a7
            if (r13 != 0) goto L_0x03a7
            java.nio.ByteBuffer r9 = r0.A01     // Catch:{ IllegalStateException -> 0x05fb }
            int r8 = r9.position()     // Catch:{ IllegalStateException -> 0x05fb }
            r7 = 0
            r2 = 0
            goto L_0x041b
        L_0x0383:
            byte r1 = r9.get(r5)     // Catch:{ IllegalStateException -> 0x05fb }
            r2 = r1 & 31
            r1 = 7
            if (r2 != r1) goto L_0x0419
            java.nio.ByteBuffer r1 = r9.duplicate()     // Catch:{ IllegalStateException -> 0x05fb }
            int r7 = r7 - r4
            r1.position(r7)     // Catch:{ IllegalStateException -> 0x05fb }
            r1.limit(r8)     // Catch:{ IllegalStateException -> 0x05fb }
            r9.position(r6)     // Catch:{ IllegalStateException -> 0x05fb }
            r9.put(r1)     // Catch:{ IllegalStateException -> 0x05fb }
        L_0x039d:
            java.nio.ByteBuffer r1 = r0.A01     // Catch:{ IllegalStateException -> 0x05fb }
            int r1 = r1.position()     // Catch:{ IllegalStateException -> 0x05fb }
            if (r1 == 0) goto L_0x024f
            r14.A0Y = r6     // Catch:{ IllegalStateException -> 0x05fb }
        L_0x03a7:
            long r1 = r0.A00     // Catch:{ IllegalStateException -> 0x05fb }
            X.4JV r7 = r14.A0N     // Catch:{ IllegalStateException -> 0x05fb }
            if (r7 == 0) goto L_0x03d7
            X.1gT r11 = r14.A0I     // Catch:{ IllegalStateException -> 0x05fb }
            boolean r1 = r7.A02     // Catch:{ IllegalStateException -> 0x05fb }
            if (r1 != 0) goto L_0x03d5
            java.nio.ByteBuffer r5 = r0.A01     // Catch:{ IllegalStateException -> 0x05fb }
            r4 = 0
            r2 = 0
        L_0x03b7:
            int r2 = r2 << 8
            byte r1 = r5.get(r4)     // Catch:{ IllegalStateException -> 0x05fb }
            r1 = r1 & 255(0xff, float:3.57E-43)
            r2 = r2 | r1
            int r4 = r4 + 1
            r1 = 4
            if (r4 < r1) goto L_0x03b7
            int r10 = X.C89824cz.A01(r2)     // Catch:{ IllegalStateException -> 0x05fb }
            r1 = -1
            if (r10 != r1) goto L_0x03f1
            r7.A02 = r3     // Catch:{ IllegalStateException -> 0x05fb }
            java.lang.String r2 = "C2Mp3TimestampTracker"
            java.lang.String r1 = "MPEG audio header is invalid."
            android.util.Log.w(r2, r1)     // Catch:{ IllegalStateException -> 0x05fb }
        L_0x03d5:
            long r1 = r0.A00     // Catch:{ IllegalStateException -> 0x05fb }
        L_0x03d7:
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            int r4 = r0.flags     // Catch:{ IllegalStateException -> 0x05fb }
            r4 = r4 & r5
            boolean r4 = X.AnonymousClass000.A1R(r4, r5)     // Catch:{ IllegalStateException -> 0x05fb }
            if (r4 == 0) goto L_0x03e7
            java.util.ArrayList r4 = r14.A10     // Catch:{ IllegalStateException -> 0x05fb }
            X.C13700nu.A0d(r4, r1)     // Catch:{ IllegalStateException -> 0x05fb }
        L_0x03e7:
            boolean r4 = r14.A0q     // Catch:{ IllegalStateException -> 0x05fb }
            if (r4 == 0) goto L_0x0494
            X.4La r9 = r14.A0z     // Catch:{ IllegalStateException -> 0x05fb }
            X.1gT r11 = r14.A0I     // Catch:{ IllegalStateException -> 0x05fb }
            monitor-enter(r9)     // Catch:{ IllegalStateException -> 0x05fb }
            goto L_0x0431
        L_0x03f1:
            long r4 = r7.A01     // Catch:{ IllegalStateException -> 0x05fb }
            r8 = 0
            int r1 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r1 != 0) goto L_0x0404
            long r1 = r0.A00     // Catch:{ IllegalStateException -> 0x05fb }
            r7.A00 = r1     // Catch:{ IllegalStateException -> 0x05fb }
            long r4 = (long) r10     // Catch:{ IllegalStateException -> 0x05fb }
            r8 = 529(0x211, double:2.614E-321)
            long r4 = r4 - r8
            r7.A01 = r4     // Catch:{ IllegalStateException -> 0x05fb }
            goto L_0x03d7
        L_0x0404:
            r1 = 1000000(0xf4240, double:4.940656E-318)
            long r8 = r4 * r1
            int r1 = r11.A0F     // Catch:{ IllegalStateException -> 0x05fb }
            long r1 = (long) r1     // Catch:{ IllegalStateException -> 0x05fb }
            long r8 = r8 / r1
            long r1 = (long) r10     // Catch:{ IllegalStateException -> 0x05fb }
            long r4 = r4 + r1
            r7.A01 = r4     // Catch:{ IllegalStateException -> 0x05fb }
            long r1 = r7.A00     // Catch:{ IllegalStateException -> 0x05fb }
            long r1 = r1 + r8
            goto L_0x03d7
        L_0x0415:
            int r2 = r2 + 1
        L_0x0417:
            if (r1 == 0) goto L_0x041a
        L_0x0419:
            r2 = 0
        L_0x041a:
            r7 = r5
        L_0x041b:
            int r5 = r7 + 1
            if (r5 >= r8) goto L_0x042c
            byte r1 = r9.get(r7)     // Catch:{ IllegalStateException -> 0x05fb }
            r1 = r1 & 255(0xff, float:3.57E-43)
            r4 = 3
            if (r2 != r4) goto L_0x0415
            if (r1 != r3) goto L_0x0417
            goto L_0x0383
        L_0x042c:
            r9.clear()     // Catch:{ IllegalStateException -> 0x05fb }
            goto L_0x039d
        L_0x0431:
            int r5 = r9.A01     // Catch:{ all -> 0x05eb }
            if (r5 <= 0) goto L_0x044e
            int r4 = r9.A00     // Catch:{ all -> 0x05eb }
            int r4 = r4 + r5
            int r7 = r4 + -1
            java.lang.Object[] r5 = r9.A03     // Catch:{ all -> 0x05eb }
            int r4 = r5.length     // Catch:{ all -> 0x05eb }
            int r7 = r7 % r4
            long[] r4 = r9.A02     // Catch:{ all -> 0x05eb }
            r7 = r4[r7]     // Catch:{ all -> 0x05eb }
            int r4 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r4 > 0) goto L_0x044e
            r9.A00 = r6     // Catch:{ all -> 0x05e9 }
            r9.A01 = r6     // Catch:{ all -> 0x05e9 }
            r4 = 0
            java.util.Arrays.fill(r5, r4)     // Catch:{ all -> 0x05e9 }
        L_0x044e:
            java.lang.Object[] r10 = r9.A03     // Catch:{ all -> 0x05eb }
            int r8 = r10.length     // Catch:{ all -> 0x05eb }
            int r4 = r9.A01     // Catch:{ all -> 0x05eb }
            if (r4 < r8) goto L_0x0480
            int r4 = r8 << 1
            long[] r7 = new long[r4]     // Catch:{ all -> 0x05eb }
            java.lang.Object[] r10 = new java.lang.Object[r4]     // Catch:{ all -> 0x05eb }
            int r5 = r9.A00     // Catch:{ all -> 0x05eb }
            int r8 = r8 - r5
            long[] r4 = r9.A02     // Catch:{ all -> 0x05eb }
            java.lang.System.arraycopy(r4, r5, r7, r6, r8)     // Catch:{ all -> 0x05eb }
            java.lang.Object[] r5 = r9.A03     // Catch:{ all -> 0x05eb }
            int r4 = r9.A00     // Catch:{ all -> 0x05eb }
            java.lang.System.arraycopy(r5, r4, r10, r6, r8)     // Catch:{ all -> 0x05eb }
            int r5 = r9.A00     // Catch:{ all -> 0x05eb }
            if (r5 <= 0) goto L_0x047a
            long[] r4 = r9.A02     // Catch:{ all -> 0x05eb }
            java.lang.System.arraycopy(r4, r6, r7, r8, r5)     // Catch:{ all -> 0x05eb }
            java.lang.Object[] r5 = r9.A03     // Catch:{ all -> 0x05eb }
            int r4 = r9.A00     // Catch:{ all -> 0x05eb }
            java.lang.System.arraycopy(r5, r6, r10, r8, r4)     // Catch:{ all -> 0x05eb }
        L_0x047a:
            r9.A02 = r7     // Catch:{ all -> 0x05eb }
            r9.A03 = r10     // Catch:{ all -> 0x05eb }
            r9.A00 = r6     // Catch:{ all -> 0x05eb }
        L_0x0480:
            int r7 = r9.A00     // Catch:{ all -> 0x05eb }
            int r5 = r9.A01     // Catch:{ all -> 0x05eb }
            int r7 = r7 + r5
            int r4 = r10.length     // Catch:{ all -> 0x05eb }
            int r7 = r7 % r4
            long[] r4 = r9.A02     // Catch:{ all -> 0x05eb }
            r4[r7] = r1     // Catch:{ all -> 0x05eb }
            r10[r7] = r11     // Catch:{ all -> 0x05eb }
            int r4 = r5 + 1
            r9.A01 = r4     // Catch:{ all -> 0x05eb }
            monitor-exit(r9)     // Catch:{ IllegalStateException -> 0x05fb }
            r14.A0q = r6     // Catch:{ IllegalStateException -> 0x05fb }
        L_0x0494:
            X.4JV r7 = r14.A0N     // Catch:{ IllegalStateException -> 0x05fb }
            long r4 = r14.A0B     // Catch:{ IllegalStateException -> 0x05fb }
            if (r7 == 0) goto L_0x04cb
            long r7 = r0.A00     // Catch:{ IllegalStateException -> 0x05fb }
            long r4 = java.lang.Math.max(r4, r7)     // Catch:{ IllegalStateException -> 0x05fb }
        L_0x04a0:
            r14.A0B = r4     // Catch:{ IllegalStateException -> 0x05fb }
            r0.A00()     // Catch:{ IllegalStateException -> 0x05fb }
            r5 = 268435456(0x10000000, float:2.5243549E-29)
            int r4 = r0.flags     // Catch:{ IllegalStateException -> 0x05fb }
            r4 = r4 & r5
            boolean r4 = X.AnonymousClass000.A1R(r4, r5)     // Catch:{ IllegalStateException -> 0x05fb }
            if (r4 == 0) goto L_0x04b3
            r14.A0Q(r0)     // Catch:{ IllegalStateException -> 0x05fb }
        L_0x04b3:
            boolean r4 = r14 instanceof X.C65473Ux     // Catch:{ IllegalStateException -> 0x05fb }
            if (r4 == 0) goto L_0x04e9
            r9 = r14
            X.3Ux r9 = (X.C65473Ux) r9     // Catch:{ IllegalStateException -> 0x05fb }
            boolean r7 = r9.A0U     // Catch:{ IllegalStateException -> 0x05fb }
            if (r7 != 0) goto L_0x04c4
            int r4 = r9.A02     // Catch:{ IllegalStateException -> 0x05fb }
            int r4 = r4 + 1
            r9.A02 = r4     // Catch:{ IllegalStateException -> 0x05fb }
        L_0x04c4:
            int r5 = X.AnonymousClass3C1.A01     // Catch:{ IllegalStateException -> 0x05fb }
            r4 = 23
            if (r5 >= r4) goto L_0x0510
            goto L_0x04d0
        L_0x04cb:
            long r4 = java.lang.Math.max(r4, r1)     // Catch:{ IllegalStateException -> 0x05fb }
            goto L_0x04a0
        L_0x04d0:
            if (r7 == 0) goto L_0x0510
            long r4 = r0.A00     // Catch:{ IllegalStateException -> 0x05fb }
            r9.A0O(r4)     // Catch:{ IllegalStateException -> 0x05fb }
            r9.A0Z()     // Catch:{ IllegalStateException -> 0x05fb }
            X.4Oq r8 = r9.A0K     // Catch:{ IllegalStateException -> 0x05fb }
            int r7 = r8.A06     // Catch:{ IllegalStateException -> 0x05fb }
            int r7 = r7 + 1
            r8.A06 = r7     // Catch:{ IllegalStateException -> 0x05fb }
            r9.A0W()     // Catch:{ IllegalStateException -> 0x05fb }
            r9.A0N(r4)     // Catch:{ IllegalStateException -> 0x05fb }
            goto L_0x0510
        L_0x04e9:
            r12 = r14
            X.3Uy r12 = (X.C65483Uy) r12     // Catch:{ IllegalStateException -> 0x05fb }
            boolean r4 = r12.A04     // Catch:{ IllegalStateException -> 0x05fb }
            if (r4 == 0) goto L_0x0510
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            int r4 = r0.flags     // Catch:{ IllegalStateException -> 0x05fb }
            r4 = r4 & r5
            boolean r4 = X.AnonymousClass000.A1R(r4, r5)     // Catch:{ IllegalStateException -> 0x05fb }
            if (r4 != 0) goto L_0x0510
            long r4 = r0.A00     // Catch:{ IllegalStateException -> 0x05fb }
            long r7 = r12.A01     // Catch:{ IllegalStateException -> 0x05fb }
            long r9 = r4 - r7
            long r10 = java.lang.Math.abs(r9)     // Catch:{ IllegalStateException -> 0x05fb }
            r8 = 500000(0x7a120, double:2.47033E-318)
            int r7 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r7 <= 0) goto L_0x050e
            r12.A01 = r4     // Catch:{ IllegalStateException -> 0x05fb }
        L_0x050e:
            r12.A04 = r6     // Catch:{ IllegalStateException -> 0x05fb }
        L_0x0510:
            if (r13 == 0) goto L_0x0526
            X.5T3 r5 = r14.A0O     // Catch:{ CryptoException -> 0x05ee }
            int r8 = r14.A07     // Catch:{ CryptoException -> 0x05ee }
            X.4OQ r4 = r0.A05     // Catch:{ CryptoException -> 0x05ee }
            X.4pN r5 = (X.C97084pN) r5     // Catch:{ CryptoException -> 0x05ee }
            android.media.MediaCodec r7 = r5.A02     // Catch:{ CryptoException -> 0x05ee }
            android.media.MediaCodec$CryptoInfo r4 = r4.A06     // Catch:{ CryptoException -> 0x05ee }
            r9 = 0
            r13 = 0
            r10 = r4
            r11 = r1
            r7.queueSecureInputBuffer(r8, r9, r10, r11, r13)     // Catch:{ CryptoException -> 0x05ee }
            goto L_0x053a
        L_0x0526:
            X.5T3 r5 = r14.A0O     // Catch:{ CryptoException -> 0x05ee }
            int r8 = r14.A07     // Catch:{ CryptoException -> 0x05ee }
            java.nio.ByteBuffer r4 = r0.A01     // Catch:{ CryptoException -> 0x05ee }
            int r10 = r4.limit()     // Catch:{ CryptoException -> 0x05ee }
            X.4pN r5 = (X.C97084pN) r5     // Catch:{ CryptoException -> 0x05ee }
            android.media.MediaCodec r7 = r5.A02     // Catch:{ CryptoException -> 0x05ee }
            r9 = 0
            r13 = 0
            r11 = r1
            r7.queueInputBuffer(r8, r9, r10, r11, r13)     // Catch:{ CryptoException -> 0x05ee }
        L_0x053a:
            r1 = -1
            r14.A07 = r1     // Catch:{ IllegalStateException -> 0x05fb }
            r1 = 0
            r0.A01 = r1     // Catch:{ IllegalStateException -> 0x05fb }
            r14.A0h = r3     // Catch:{ IllegalStateException -> 0x05fb }
            r14.A06 = r6     // Catch:{ IllegalStateException -> 0x05fb }
            X.4Oq r1 = r14.A0K     // Catch:{ IllegalStateException -> 0x05fb }
            int r0 = r1.A04     // Catch:{ IllegalStateException -> 0x05fb }
            int r0 = r0 + 1
            r1.A04 = r0     // Catch:{ IllegalStateException -> 0x05fb }
            goto L_0x024f
        L_0x054e:
            r14.A08 = r3     // Catch:{ IllegalStateException -> 0x05fb }
            X.5T3 r2 = r14.A0O     // Catch:{ IllegalStateException -> 0x05fb }
            java.nio.ByteBuffer r3 = r2.AE8(r3)     // Catch:{ IllegalStateException -> 0x05fb }
            r14.A0R = r3     // Catch:{ IllegalStateException -> 0x05fb }
            if (r3 == 0) goto L_0x0569
            int r2 = r5.offset     // Catch:{ IllegalStateException -> 0x05fb }
            r3.position(r2)     // Catch:{ IllegalStateException -> 0x05fb }
            java.nio.ByteBuffer r4 = r14.A0R     // Catch:{ IllegalStateException -> 0x05fb }
            int r3 = r5.offset     // Catch:{ IllegalStateException -> 0x05fb }
            int r2 = r5.size     // Catch:{ IllegalStateException -> 0x05fb }
            int r3 = r3 + r2
            r4.limit(r3)     // Catch:{ IllegalStateException -> 0x05fb }
        L_0x0569:
            boolean r2 = r14.A0Z     // Catch:{ IllegalStateException -> 0x05fb }
            if (r2 == 0) goto L_0x0588
            long r3 = r5.presentationTimeUs     // Catch:{ IllegalStateException -> 0x05fb }
            r7 = 0
            int r2 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r2 != 0) goto L_0x0588
            int r2 = r5.flags     // Catch:{ IllegalStateException -> 0x05fb }
            r2 = r2 & 4
            if (r2 == 0) goto L_0x0588
            long r7 = r14.A0B     // Catch:{ IllegalStateException -> 0x05fb }
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x0588
            r5.presentationTimeUs = r7     // Catch:{ IllegalStateException -> 0x05fb }
        L_0x0588:
            long r3 = r5.presentationTimeUs     // Catch:{ IllegalStateException -> 0x05fb }
            java.util.ArrayList r10 = r14.A10     // Catch:{ IllegalStateException -> 0x05fb }
            int r9 = r10.size()     // Catch:{ IllegalStateException -> 0x05fb }
            r5 = 0
        L_0x0591:
            if (r5 >= r9) goto L_0x05a8
            java.lang.Object r2 = r10.get(r5)     // Catch:{ IllegalStateException -> 0x05fb }
            long r7 = X.C13700nu.A01(r2)     // Catch:{ IllegalStateException -> 0x05fb }
            int r2 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x05a3
            r10.remove(r5)     // Catch:{ IllegalStateException -> 0x05fb }
            goto L_0x05a6
        L_0x05a3:
            int r5 = r5 + 1
            goto L_0x0591
        L_0x05a6:
            r2 = 1
            goto L_0x05a9
        L_0x05a8:
            r2 = 0
        L_0x05a9:
            r14.A0l = r2     // Catch:{ IllegalStateException -> 0x05fb }
            long r7 = r14.A0C     // Catch:{ IllegalStateException -> 0x05fb }
            int r2 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            boolean r2 = X.AnonymousClass000.A1P(r2)
            goto L_0x01b8
        L_0x05b5:
            boolean r1 = r14.A0c     // Catch:{ CryptoException -> 0x05ee }
            if (r1 != 0) goto L_0x0079
            r14.A0i = r3     // Catch:{ CryptoException -> 0x05ee }
            X.5T3 r1 = r14.A0O     // Catch:{ CryptoException -> 0x05ee }
            int r8 = r14.A07     // Catch:{ CryptoException -> 0x05ee }
            r11 = 0
            r13 = 4
            X.4pN r1 = (X.C97084pN) r1     // Catch:{ CryptoException -> 0x05ee }
            android.media.MediaCodec r7 = r1.A02     // Catch:{ CryptoException -> 0x05ee }
            r9 = 0
            r10 = 0
            r7.queueInputBuffer(r8, r9, r10, r11, r13)     // Catch:{ CryptoException -> 0x05ee }
            r1 = -1
            r14.A07 = r1     // Catch:{ CryptoException -> 0x05ee }
            r0.A01 = r2     // Catch:{ CryptoException -> 0x05ee }
            goto L_0x0079
        L_0x05d2:
            X.4Oq r7 = r14.A0K     // Catch:{ IllegalStateException -> 0x05fb }
            int r5 = r7.A07     // Catch:{ IllegalStateException -> 0x05fb }
            X.5Sm r4 = r14.A05     // Catch:{ IllegalStateException -> 0x05fb }
            long r2 = r14.A03     // Catch:{ IllegalStateException -> 0x05fb }
            long r0 = r30 - r2
            int r0 = r4.Afw(r0)     // Catch:{ IllegalStateException -> 0x05fb }
            int r5 = r5 + r0
            r7.A07 = r5     // Catch:{ IllegalStateException -> 0x05fb }
            r14.A0V(r6)     // Catch:{ IllegalStateException -> 0x05fb }
            goto L_0x007c
        L_0x05e8:
            return
        L_0x05e9:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x05eb }
        L_0x05eb:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ IllegalStateException -> 0x05fb }
            goto L_0x05fa
        L_0x05ee:
            r1 = move-exception
            X.1gT r0 = r14.A0I     // Catch:{ IllegalStateException -> 0x05fb }
            X.43y r0 = r14.A01(r0, r1, r6)     // Catch:{ IllegalStateException -> 0x05fb }
            goto L_0x05fa
        L_0x05f6:
            java.lang.IllegalStateException r0 = X.AnonymousClass3K4.A0V()     // Catch:{ IllegalStateException -> 0x05fb }
        L_0x05fa:
            throw r0     // Catch:{ IllegalStateException -> 0x05fb }
        L_0x05fb:
            r3 = move-exception
            int r1 = X.AnonymousClass3C1.A01
            r0 = 21
            if (r1 < r0) goto L_0x0625
            boolean r0 = A01(r3)
            if (r0 == 0) goto L_0x0625
        L_0x0608:
            X.4eg r2 = r14.A0P
            boolean r0 = r14 instanceof X.C65473Ux
            if (r0 == 0) goto L_0x061f
            r0 = r14
            X.3Ux r0 = (X.C65473Ux) r0
            android.view.Surface r0 = r0.A0L
            X.3Uw r1 = new X.3Uw
            r1.<init>(r0, r2, r3)
        L_0x0618:
            X.1gT r0 = r14.A0I
            X.43y r0 = r14.A01(r0, r1, r6)
            throw r0
        L_0x061f:
            X.3UZ r1 = new X.3UZ
            r1.<init>(r2, r3)
            goto L_0x0618
        L_0x0625:
            java.lang.StackTraceElement[] r1 = r3.getStackTrace()
            int r0 = r1.length
            if (r0 <= 0) goto L_0x063b
            r0 = r1[r6]
            java.lang.String r1 = r0.getClassName()
            java.lang.String r0 = "android.media.MediaCodec"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x063b
            goto L_0x0608
        L_0x063b:
            throw r3
        L_0x063c:
            r0 = 0
            r14.A0G = r0
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3UH.Ac6(long, long):void");
    }

    public void AeM(float f2, float f3) {
        this.A01 = f2;
        this.A02 = f3;
        if (this.A0O != null && this.A04 != 3 && this.A01 != 0) {
            A0T();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0094, code lost:
        if (X.C96414oI.class.equals(r3) != false) goto L_0x0096;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int AgX(X.C32491gT r12) {
        /*
            r11 = this;
            X.5Ti r6 = r11.A0y     // Catch:{ 43N -> 0x010b }
            r5 = r11
            boolean r0 = r11 instanceof X.C65473Ux     // Catch:{ 43N -> 0x010b }
            if (r0 == 0) goto L_0x0073
            java.lang.String r0 = r12.A0T     // Catch:{ 43N -> 0x010b }
            boolean r0 = X.C90834eu.A05(r0)     // Catch:{ 43N -> 0x010b }
            r3 = 0
            if (r0 == 0) goto L_0x0109
            X.57J r0 = r12.A0K     // Catch:{ 43N -> 0x010b }
            r5 = 1
            boolean r4 = X.AnonymousClass000.A1V(r0)     // Catch:{ 43N -> 0x010b }
            java.util.List r2 = X.C65473Ux.A04(r12, r6, r4, r3)     // Catch:{ 43N -> 0x010b }
            if (r4 == 0) goto L_0x0027
            boolean r0 = r2.isEmpty()     // Catch:{ 43N -> 0x010b }
            if (r0 == 0) goto L_0x0027
            java.util.List r2 = X.C65473Ux.A04(r12, r6, r3, r3)     // Catch:{ 43N -> 0x010b }
        L_0x0027:
            boolean r0 = r2.isEmpty()     // Catch:{ 43N -> 0x010b }
            if (r0 != 0) goto L_0x0107
            java.lang.Class r1 = r12.A0N     // Catch:{ 43N -> 0x010b }
            if (r1 == 0) goto L_0x0039
            java.lang.Class<X.4oI> r0 = X.C96414oI.class
            boolean r0 = r0.equals(r1)     // Catch:{ 43N -> 0x010b }
            if (r0 == 0) goto L_0x0105
        L_0x0039:
            java.lang.Object r0 = r2.get(r3)     // Catch:{ 43N -> 0x010b }
            X.4eg r0 = (X.C90714eg) r0     // Catch:{ 43N -> 0x010b }
            boolean r1 = r0.A0B(r12)     // Catch:{ 43N -> 0x010b }
            boolean r0 = r0.A0C(r12)     // Catch:{ 43N -> 0x010b }
            r2 = 8
            if (r0 == 0) goto L_0x004d
            r2 = 16
        L_0x004d:
            if (r1 == 0) goto L_0x006f
            java.util.List r1 = X.C65473Ux.A04(r12, r6, r4, r5)     // Catch:{ 43N -> 0x010b }
            boolean r0 = r1.isEmpty()     // Catch:{ 43N -> 0x010b }
            if (r0 != 0) goto L_0x006d
            java.lang.Object r1 = r1.get(r3)     // Catch:{ 43N -> 0x010b }
            X.4eg r1 = (X.C90714eg) r1     // Catch:{ 43N -> 0x010b }
            boolean r0 = r1.A0B(r12)     // Catch:{ 43N -> 0x010b }
            if (r0 == 0) goto L_0x006d
            boolean r0 = r1.A0C(r12)     // Catch:{ 43N -> 0x010b }
            if (r0 == 0) goto L_0x006d
            r3 = 32
        L_0x006d:
            r10 = 4
            goto L_0x0070
        L_0x006f:
            r10 = 3
        L_0x0070:
            r10 = r10 | r2
            r10 = r10 | r3
            return r10
        L_0x0073:
            X.3Uy r5 = (X.C65483Uy) r5     // Catch:{ 43N -> 0x010b }
            java.lang.String r2 = r12.A0T     // Catch:{ 43N -> 0x010b }
            boolean r0 = X.C90834eu.A03(r2)     // Catch:{ 43N -> 0x010b }
            r4 = 0
            if (r0 == 0) goto L_0x0109
            int r1 = X.AnonymousClass3C1.A01     // Catch:{ 43N -> 0x010b }
            r0 = 21
            r9 = 0
            if (r1 < r0) goto L_0x0087
            r9 = 32
        L_0x0087:
            java.lang.Class r3 = r12.A0N     // Catch:{ 43N -> 0x010b }
            r1 = 0
            if (r3 == 0) goto L_0x0096
            r1 = 1
            java.lang.Class<X.4oI> r0 = X.C96414oI.class
            boolean r0 = r0.equals(r3)     // Catch:{ 43N -> 0x010b }
            r8 = 0
            if (r0 == 0) goto L_0x0097
        L_0x0096:
            r8 = 1
        L_0x0097:
            r7 = 8
            r10 = 4
            if (r8 == 0) goto L_0x00bb
            X.5TO r0 = r5.A0A     // Catch:{ 43N -> 0x010b }
            X.4oA r0 = (X.C96334oA) r0     // Catch:{ 43N -> 0x010b }
            int r0 = r0.ACO(r12)     // Catch:{ 43N -> 0x010b }
            if (r0 == 0) goto L_0x00bb
            if (r1 == 0) goto L_0x0102
            java.lang.String r0 = "audio/raw"
            java.util.List r1 = X.C90884f0.A03(r0, r4, r4)     // Catch:{ 43N -> 0x010b }
            boolean r0 = r1.isEmpty()     // Catch:{ 43N -> 0x010b }
            if (r0 != 0) goto L_0x00bb
            java.lang.Object r0 = r1.get(r4)     // Catch:{ 43N -> 0x010b }
            if (r0 == 0) goto L_0x00bb
            goto L_0x0102
        L_0x00bb:
            java.lang.String r0 = "audio/raw"
            boolean r0 = r0.equals(r2)     // Catch:{ 43N -> 0x010b }
            if (r0 == 0) goto L_0x00cd
            X.5TO r0 = r5.A0A     // Catch:{ 43N -> 0x010b }
            X.4oA r0 = (X.C96334oA) r0     // Catch:{ 43N -> 0x010b }
            int r0 = r0.ACO(r12)     // Catch:{ 43N -> 0x010b }
            if (r0 == 0) goto L_0x0107
        L_0x00cd:
            X.5TO r3 = r5.A0A     // Catch:{ 43N -> 0x010b }
            int r2 = r12.A06     // Catch:{ 43N -> 0x010b }
            int r1 = r12.A0F     // Catch:{ 43N -> 0x010b }
            r0 = 2
            X.1gT r0 = X.AnonymousClass3C1.A06(r0, r2, r1)     // Catch:{ 43N -> 0x010b }
            X.4oA r3 = (X.C96334oA) r3     // Catch:{ 43N -> 0x010b }
            int r0 = r3.ACO(r0)     // Catch:{ 43N -> 0x010b }
            if (r0 == 0) goto L_0x0107
            java.util.List r1 = r5.A0D(r12, r6)     // Catch:{ 43N -> 0x010b }
            boolean r0 = r1.isEmpty()     // Catch:{ 43N -> 0x010b }
            if (r0 != 0) goto L_0x0107
            if (r8 == 0) goto L_0x0105
            java.lang.Object r1 = r1.get(r4)     // Catch:{ 43N -> 0x010b }
            X.4eg r1 = (X.C90714eg) r1     // Catch:{ 43N -> 0x010b }
            boolean r0 = r1.A0B(r12)     // Catch:{ 43N -> 0x010b }
            if (r0 == 0) goto L_0x0101
            boolean r0 = r1.A0C(r12)     // Catch:{ 43N -> 0x010b }
            if (r0 == 0) goto L_0x0102
            r7 = 16
            goto L_0x0102
        L_0x0101:
            r10 = 3
        L_0x0102:
            r10 = r10 | r7
            r10 = r10 | r9
            return r10
        L_0x0105:
            r10 = 2
            return r10
        L_0x0107:
            r10 = 1
            return r10
        L_0x0109:
            r10 = 0
            return r10
        L_0x010b:
            r1 = move-exception
            r0 = 0
            X.43y r0 = r11.A01(r12, r1, r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3UH.AgX(X.1gT):int");
    }
}
