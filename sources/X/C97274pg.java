package X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import com.facebook.redex.RunnableRunnableShape12S0200000_I1;
import com.google.android.exoplayer2.Timeline;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.4pg  reason: invalid class name and case insensitive filesystem */
public final class C97274pg implements C15120qM, Handler.Callback, AnonymousClass5L4, AnonymousClass5L8, AnonymousClass5L9, AnonymousClass5LT {
    public int A00;
    public int A01;
    public int A02 = 0;
    public long A03;
    public C804643y A04;
    public AnonymousClass4V3 A05;
    public AnonymousClass4JQ A06;
    public C90184df A07;
    public C88884bF A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I = false;
    public final long A0J;
    public final HandlerThread A0K;
    public final Looper A0L;
    public final C97764qW A0M;
    public final AnonymousClass5L5 A0N;
    public final AnonymousClass5L6 A0O;
    public final AnonymousClass5L7 A0P;
    public final AnonymousClass4XV A0Q;
    public final AnonymousClass4XK A0R;
    public final AnonymousClass4XE A0S;
    public final C89324by A0T;
    public final AnonymousClass4GL A0U;
    public final AnonymousClass4LY A0V;
    public final AnonymousClass5LX A0W;
    public final AnonymousClass5TU A0X;
    public final C107695La A0Y;
    public final ArrayList A0Z;
    public final AnonymousClass5UO[] A0a;
    public final AnonymousClass5SK[] A0b;

    public C97274pg(Looper looper, AnonymousClass5L5 r6, AnonymousClass5L6 r7, AnonymousClass5L7 r8, C88884bF r9, C96224nz r10, AnonymousClass4GL r11, AnonymousClass4LY r12, AnonymousClass5LX r13, AnonymousClass5TU r14, AnonymousClass5UO[] r15) {
        this.A0N = r6;
        this.A0a = r15;
        this.A0U = r11;
        this.A0V = r12;
        this.A0P = r8;
        this.A0W = r13;
        this.A08 = r9;
        this.A0O = r7;
        this.A0D = false;
        this.A0X = r14;
        this.A0J = ((C96184nv) r8).A02;
        C90184df A002 = C90184df.A00(r12);
        this.A07 = A002;
        this.A05 = new AnonymousClass4V3(A002);
        int length = r15.length;
        AnonymousClass5SK[] r2 = new AnonymousClass5SK[length];
        this.A0b = r2;
        for (int i2 = 0; i2 < length; i2++) {
            C96244o1 r0 = r15[i2];
            r0.A00 = i2;
            r2[i2] = r0;
        }
        this.A0M = new C97764qW(this, r14);
        this.A0Z = AnonymousClass000.A0u();
        this.A0T = new C89324by();
        this.A0S = new AnonymousClass4XE();
        r11.A00 = this;
        r11.A01 = r13;
        this.A09 = true;
        Handler handler = new Handler(looper);
        this.A0Q = new AnonymousClass4XV(handler, r10);
        this.A0R = new AnonymousClass4XK(handler, this, r10);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.A0K = handlerThread;
        handlerThread.start();
        Looper looper2 = handlerThread.getLooper();
        this.A0L = looper2;
        this.A0Y = new C97684qO(new Handler(looper2, this));
    }

    public static Pair A00(AnonymousClass4JQ r19, AnonymousClass4XE r20, C89324by r21, Timeline timeline, int i2, boolean z2) {
        AnonymousClass4JQ r1 = r19;
        Timeline timeline2 = r1.A02;
        Timeline timeline3 = timeline;
        if (AnonymousClass000.A1P(timeline3.A01())) {
            return null;
        }
        if (AnonymousClass000.A1P(timeline2.A01())) {
            timeline2 = timeline3;
        }
        try {
            int i3 = r1.A00;
            long j2 = r1.A01;
            AnonymousClass4XE r8 = r20;
            C89324by r9 = r21;
            Pair A072 = timeline2.A07(r8, r9, i3, j2, 0);
            if (timeline3.equals(timeline2)) {
                return A072;
            }
            if (timeline3.A04(A072.first) != -1) {
                timeline2.A09(r8, A072.first);
                if (!timeline2.A0A(r9, r8.A00, 0).A0C) {
                    return A072;
                }
                return timeline3.A07(r8, r9, AnonymousClass4XE.A00(r8, timeline3, A072.first), j2, 0);
            }
            Object A012 = A01(r8, r9, timeline2, timeline3, A072.first, i2, z2);
            if (A012 != null) {
                return timeline3.A07(r8, r9, AnonymousClass4XE.A00(r8, timeline3, A012), -9223372036854775807L, 0);
            }
            return null;
        } catch (IndexOutOfBoundsException unused) {
        }
    }

    public static Object A01(AnonymousClass4XE r10, C89324by r11, Timeline timeline, Timeline timeline2, Object obj, int i2, boolean z2) {
        Timeline timeline3 = timeline;
        int A042 = timeline.A04(obj);
        int A002 = timeline.A00();
        int i3 = -1;
        for (int i4 = 0; i4 < A002 && i3 == -1; i4++) {
            A042 = timeline3.A03(r10, r11, A042, i2, z2);
            if (A042 == -1) {
                return null;
            }
            i3 = timeline2.A04(timeline.A0B(A042));
        }
        if (i3 != -1) {
            return timeline2.A0B(i3);
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0162, code lost:
        if (r1.A00 != r4) goto L_0x0164;
     */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x01c2 A[Catch:{ all -> 0x01e2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x01d8 A[Catch:{ all -> 0x01e2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00ee A[Catch:{ all -> 0x01e2 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(X.AnonymousClass4VB r8) {
        /*
            monitor-enter(r8)
            monitor-exit(r8)
            r3 = 1
            X.5Nc r1 = r8.A07     // Catch:{ all -> 0x01e2 }
            int r2 = r8.A00     // Catch:{ all -> 0x01e2 }
            java.lang.Object r4 = r8.A02     // Catch:{ all -> 0x01e2 }
            boolean r0 = r1 instanceof X.AnonymousClass3UG     // Catch:{ all -> 0x01e2 }
            if (r0 != 0) goto L_0x0181
            boolean r0 = r1 instanceof X.AnonymousClass3UK     // Catch:{ all -> 0x01e2 }
            if (r0 == 0) goto L_0x004d
            X.3UK r1 = (X.AnonymousClass3UK) r1     // Catch:{ all -> 0x01e2 }
            r0 = 2
            if (r2 == r0) goto L_0x0156
            r0 = 3
            if (r2 == r0) goto L_0x01ca
            r0 = 5
            if (r2 == r0) goto L_0x01b4
            r0 = 101(0x65, float:1.42E-43)
            if (r2 == r0) goto L_0x003a
            r0 = 102(0x66, float:1.43E-43)
            if (r2 != r0) goto L_0x0181
            X.5TO r2 = r1.A0I     // Catch:{ all -> 0x01e2 }
            int r1 = X.AnonymousClass000.A0D(r4)     // Catch:{ all -> 0x01e2 }
            X.4oA r2 = (X.C96334oA) r2     // Catch:{ all -> 0x01e2 }
            int r0 = r2.A01     // Catch:{ all -> 0x01e2 }
            if (r0 == r1) goto L_0x0181
            r2.A01 = r1     // Catch:{ all -> 0x01e2 }
            boolean r0 = X.AnonymousClass000.A1O(r1)     // Catch:{ all -> 0x01e2 }
            r2.A0Q = r0     // Catch:{ all -> 0x01e2 }
            goto L_0x0199
        L_0x003a:
            X.5TO r2 = r1.A0I     // Catch:{ all -> 0x01e2 }
            boolean r1 = X.AnonymousClass000.A1X(r4)     // Catch:{ all -> 0x01e2 }
            X.4oA r2 = (X.C96334oA) r2     // Catch:{ all -> 0x01e2 }
            X.4LP r0 = r2.A08()     // Catch:{ all -> 0x01e2 }
            X.4bm r0 = r0.A02     // Catch:{ all -> 0x01e2 }
            r2.A0D(r0, r1)     // Catch:{ all -> 0x01e2 }
            goto L_0x0181
        L_0x004d:
            boolean r0 = r1 instanceof X.C65473Ux     // Catch:{ all -> 0x01e2 }
            if (r0 == 0) goto L_0x013d
            X.3Ux r1 = (X.C65473Ux) r1     // Catch:{ all -> 0x01e2 }
            if (r2 == r3) goto L_0x0085
            r0 = 4
            if (r2 == r0) goto L_0x0072
            r0 = 6
            if (r2 == r0) goto L_0x0181
            r0 = 102(0x66, float:1.43E-43)
            if (r2 != r0) goto L_0x0181
            int r2 = X.AnonymousClass000.A0D(r4)     // Catch:{ all -> 0x01e2 }
            int r0 = r1.A0C     // Catch:{ all -> 0x01e2 }
            if (r0 == r2) goto L_0x0181
            r1.A0C = r2     // Catch:{ all -> 0x01e2 }
            boolean r0 = r1.A0U     // Catch:{ all -> 0x01e2 }
            if (r0 == 0) goto L_0x0181
            r1.A0E()     // Catch:{ all -> 0x01e2 }
            goto L_0x0181
        L_0x0072:
            int r2 = X.AnonymousClass000.A0D(r4)     // Catch:{ all -> 0x01e2 }
            r1.A0B = r2     // Catch:{ all -> 0x01e2 }
            X.5T3 r0 = r1.A0O     // Catch:{ all -> 0x01e2 }
            if (r0 == 0) goto L_0x0181
            X.4pN r0 = (X.C97084pN) r0     // Catch:{ all -> 0x01e2 }
            android.media.MediaCodec r0 = r0.A02     // Catch:{ all -> 0x01e2 }
            r0.setVideoScalingMode(r2)     // Catch:{ all -> 0x01e2 }
            goto L_0x0181
        L_0x0085:
            android.view.Surface r4 = (android.view.Surface) r4     // Catch:{ all -> 0x01e2 }
            if (r4 != 0) goto L_0x00a3
            android.view.Surface r0 = r1.A0K     // Catch:{ all -> 0x01e2 }
            if (r0 == 0) goto L_0x008f
            r4 = r0
            goto L_0x00a3
        L_0x008f:
            X.4eg r5 = r1.A0P     // Catch:{ all -> 0x01e2 }
            if (r5 == 0) goto L_0x00a3
            boolean r0 = r1.A0e(r5)     // Catch:{ all -> 0x01e2 }
            if (r0 == 0) goto L_0x00a3
            android.content.Context r2 = r1.A0X     // Catch:{ all -> 0x01e2 }
            boolean r0 = r5.A06     // Catch:{ all -> 0x01e2 }
            X.3Mg r4 = X.C63973Mg.A00(r2, r0)     // Catch:{ all -> 0x01e2 }
            r1.A0K = r4     // Catch:{ all -> 0x01e2 }
        L_0x00a3:
            android.view.Surface r0 = r1.A0L     // Catch:{ all -> 0x01e2 }
            if (r0 == r4) goto L_0x0124
            r1.A0L = r4     // Catch:{ all -> 0x01e2 }
            X.4cB r7 = r1.A0Y     // Catch:{ all -> 0x01e2 }
            r6 = r4
            boolean r0 = r4 instanceof X.C63973Mg     // Catch:{ all -> 0x01e2 }
            if (r0 == 0) goto L_0x00b1
            r6 = 0
        L_0x00b1:
            android.view.Surface r5 = r7.A0B     // Catch:{ all -> 0x01e2 }
            if (r5 == r6) goto L_0x00ce
            int r2 = X.AnonymousClass3C1.A01     // Catch:{ all -> 0x01e2 }
            r0 = 30
            if (r2 < r0) goto L_0x00c9
            if (r5 == 0) goto L_0x00c9
            float r0 = r7.A03     // Catch:{ all -> 0x01e2 }
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x00c9
            r7.A03 = r2     // Catch:{ all -> 0x01e2 }
            X.C89444cB.A00(r5, r2)     // Catch:{ all -> 0x01e2 }
        L_0x00c9:
            r7.A0B = r6     // Catch:{ all -> 0x01e2 }
            r7.A06(r3)     // Catch:{ all -> 0x01e2 }
        L_0x00ce:
            r0 = 0
            r1.A0Q = r0     // Catch:{ all -> 0x01e2 }
            int r6 = r1.A01     // Catch:{ all -> 0x01e2 }
            X.5T3 r5 = r1.A0O     // Catch:{ all -> 0x01e2 }
            if (r5 == 0) goto L_0x00e0
            int r2 = X.AnonymousClass3C1.A01     // Catch:{ all -> 0x01e2 }
            r0 = 23
            if (r2 < r0) goto L_0x00f5
            if (r4 == 0) goto L_0x00f5
            goto L_0x00e3
        L_0x00e0:
            if (r4 == 0) goto L_0x0115
            goto L_0x00ea
        L_0x00e3:
            boolean r0 = r1.A0P     // Catch:{ all -> 0x01e2 }
            if (r0 != 0) goto L_0x00f5
            X.C65473Ux.A05(r4, r5)     // Catch:{ all -> 0x01e2 }
        L_0x00ea:
            android.view.Surface r0 = r1.A0K     // Catch:{ all -> 0x01e2 }
            if (r4 == r0) goto L_0x0115
            r1.A0a()     // Catch:{ all -> 0x01e2 }
            r1.A0X()     // Catch:{ all -> 0x01e2 }
            goto L_0x00fc
        L_0x00f5:
            r1.A0E()     // Catch:{ all -> 0x01e2 }
            r1.A0L()     // Catch:{ all -> 0x01e2 }
            goto L_0x00e0
        L_0x00fc:
            r0 = 2
            if (r6 != r0) goto L_0x0181
            long r6 = r1.A0W     // Catch:{ all -> 0x01e2 }
            r4 = 0
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x010f
            long r4 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x01e2 }
            long r4 = r4 + r6
        L_0x010c:
            r1.A0G = r4     // Catch:{ all -> 0x01e2 }
            goto L_0x0181
        L_0x010f:
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x010c
        L_0x0115:
            r2 = -1
            r1.A0A = r2     // Catch:{ all -> 0x01e2 }
            r1.A08 = r2     // Catch:{ all -> 0x01e2 }
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1.A01 = r0     // Catch:{ all -> 0x01e2 }
            r1.A09 = r2     // Catch:{ all -> 0x01e2 }
            r1.A0X()     // Catch:{ all -> 0x01e2 }
            goto L_0x0181
        L_0x0124:
            if (r4 == 0) goto L_0x0181
            android.view.Surface r0 = r1.A0K     // Catch:{ all -> 0x01e2 }
            if (r4 == r0) goto L_0x0181
            r1.A0a()     // Catch:{ all -> 0x01e2 }
            boolean r0 = r1.A0Q     // Catch:{ all -> 0x01e2 }
            if (r0 == 0) goto L_0x0181
            X.4GS r4 = r1.A0Z     // Catch:{ all -> 0x01e2 }
            android.view.Surface r2 = r1.A0L     // Catch:{ all -> 0x01e2 }
            android.os.Handler r1 = r4.A00     // Catch:{ all -> 0x01e2 }
            r0 = 11
            X.C13700nu.A0O(r1, r4, r2, r0)     // Catch:{ all -> 0x01e2 }
            goto L_0x0181
        L_0x013d:
            boolean r0 = r1 instanceof X.C65483Uy     // Catch:{ all -> 0x01e2 }
            if (r0 == 0) goto L_0x0181
            X.3Uy r1 = (X.C65483Uy) r1     // Catch:{ all -> 0x01e2 }
            r0 = 2
            if (r2 == r0) goto L_0x0147
            goto L_0x0178
        L_0x0147:
            X.5TO r1 = r1.A0A     // Catch:{ all -> 0x01e2 }
            float r4 = X.AnonymousClass000.A04(r4)     // Catch:{ all -> 0x01e2 }
            X.4oA r1 = (X.C96334oA) r1     // Catch:{ all -> 0x01e2 }
            float r0 = r1.A00     // Catch:{ all -> 0x01e2 }
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0181
            goto L_0x0164
        L_0x0156:
            X.5TO r1 = r1.A0I     // Catch:{ all -> 0x01e2 }
            float r4 = X.AnonymousClass000.A04(r4)     // Catch:{ all -> 0x01e2 }
            X.4oA r1 = (X.C96334oA) r1     // Catch:{ all -> 0x01e2 }
            float r0 = r1.A00     // Catch:{ all -> 0x01e2 }
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0181
        L_0x0164:
            r1.A00 = r4     // Catch:{ all -> 0x01e2 }
            android.media.AudioTrack r2 = r1.A0D     // Catch:{ all -> 0x01e2 }
            if (r2 == 0) goto L_0x0181
            int r1 = X.AnonymousClass3C1.A01     // Catch:{ all -> 0x01e2 }
            r0 = 21
            if (r1 < r0) goto L_0x0174
            X.C96334oA.A05(r2, r4)     // Catch:{ all -> 0x01e2 }
            goto L_0x0181
        L_0x0174:
            r2.setStereoVolume(r4, r4)     // Catch:{ all -> 0x01e2 }
            goto L_0x0181
        L_0x0178:
            r0 = 3
            if (r2 == r0) goto L_0x01c5
            r0 = 5
            if (r2 == r0) goto L_0x01af
            switch(r2) {
                case 101: goto L_0x019d;
                case 102: goto L_0x0185;
                default: goto L_0x0181;
            }     // Catch:{ all -> 0x01e2 }
        L_0x0181:
            r8.A01(r3)
            return
        L_0x0185:
            X.5TO r2 = r1.A0A     // Catch:{ all -> 0x01e2 }
            int r1 = X.AnonymousClass000.A0D(r4)     // Catch:{ all -> 0x01e2 }
            X.4oA r2 = (X.C96334oA) r2     // Catch:{ all -> 0x01e2 }
            int r0 = r2.A01     // Catch:{ all -> 0x01e2 }
            if (r0 == r1) goto L_0x0181
            r2.A01 = r1     // Catch:{ all -> 0x01e2 }
            boolean r0 = X.AnonymousClass000.A1O(r1)     // Catch:{ all -> 0x01e2 }
            r2.A0Q = r0     // Catch:{ all -> 0x01e2 }
        L_0x0199:
            r2.flush()     // Catch:{ all -> 0x01e2 }
            goto L_0x0181
        L_0x019d:
            X.5TO r2 = r1.A0A     // Catch:{ all -> 0x01e2 }
            boolean r1 = X.AnonymousClass000.A1X(r4)     // Catch:{ all -> 0x01e2 }
            X.4oA r2 = (X.C96334oA) r2     // Catch:{ all -> 0x01e2 }
            X.4LP r0 = r2.A08()     // Catch:{ all -> 0x01e2 }
            X.4bm r0 = r0.A02     // Catch:{ all -> 0x01e2 }
            r2.A0D(r0, r1)     // Catch:{ all -> 0x01e2 }
            goto L_0x0181
        L_0x01af:
            X.4SQ r4 = (X.AnonymousClass4SQ) r4     // Catch:{ all -> 0x01e2 }
            X.5TO r1 = r1.A0A     // Catch:{ all -> 0x01e2 }
            goto L_0x01b8
        L_0x01b4:
            X.4SQ r4 = (X.AnonymousClass4SQ) r4     // Catch:{ all -> 0x01e2 }
            X.5TO r1 = r1.A0I     // Catch:{ all -> 0x01e2 }
        L_0x01b8:
            X.4oA r1 = (X.C96334oA) r1     // Catch:{ all -> 0x01e2 }
            X.4SQ r0 = r1.A0H     // Catch:{ all -> 0x01e2 }
            boolean r0 = r0.equals(r4)     // Catch:{ all -> 0x01e2 }
            if (r0 != 0) goto L_0x0181
            r1.A0H = r4     // Catch:{ all -> 0x01e2 }
            goto L_0x0181
        L_0x01c5:
            X.4bh r4 = (X.C89164bh) r4     // Catch:{ all -> 0x01e2 }
            X.5TO r1 = r1.A0A     // Catch:{ all -> 0x01e2 }
            goto L_0x01ce
        L_0x01ca:
            X.4bh r4 = (X.C89164bh) r4     // Catch:{ all -> 0x01e2 }
            X.5TO r1 = r1.A0I     // Catch:{ all -> 0x01e2 }
        L_0x01ce:
            X.4oA r1 = (X.C96334oA) r1     // Catch:{ all -> 0x01e2 }
            X.4bh r0 = r1.A0F     // Catch:{ all -> 0x01e2 }
            boolean r0 = r0.equals(r4)     // Catch:{ all -> 0x01e2 }
            if (r0 != 0) goto L_0x0181
            r1.A0F = r4     // Catch:{ all -> 0x01e2 }
            boolean r0 = r1.A0X     // Catch:{ all -> 0x01e2 }
            if (r0 != 0) goto L_0x0181
            r1.flush()     // Catch:{ all -> 0x01e2 }
            goto L_0x0181
        L_0x01e2:
            r0 = move-exception
            r8.A01(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C97274pg.A02(X.4VB):void");
    }

    public static final void A03(AnonymousClass5UO r2, long j2) {
        ((C96244o1) r2).A06 = true;
        if (r2 instanceof AnonymousClass3UJ) {
            AnonymousClass3UJ r22 = (AnonymousClass3UJ) r2;
            C90524eJ.A04(r22.A06);
            r22.A02 = j2;
        }
    }

    public static boolean A04(C90184df r3, AnonymousClass4XE r4, C89324by r5) {
        C30271c3 r2 = r3.A07;
        Timeline timeline = r3.A05;
        return r2.A00() || AnonymousClass000.A1P(timeline.A01()) || AnonymousClass3K4.A0O(r5, timeline, AnonymousClass4XE.A00(r4, timeline, r2.A04)).A0C;
    }

    public final long A05() {
        long j2 = this.A07.A0F;
        AnonymousClass4X7 r0 = this.A0Q.A04;
        if (r0 == null) {
            return 0;
        }
        return Math.max(0, j2 - (this.A03 - r0.A00));
    }

    public final long A06(Timeline timeline, Object obj, long j2) {
        AnonymousClass4XE r6 = this.A0S;
        int A002 = AnonymousClass4XE.A00(r6, timeline, obj);
        C89324by r3 = this.A0T;
        timeline.A0A(r3, A002, 0);
        long j3 = r3.A05;
        if (j3 != -9223372036854775807L) {
            boolean z2 = r3.A0B;
            AnonymousClass4SO r1 = r3.A06;
            C90524eJ.A04(AnonymousClass000.A1R(z2 ? 1 : 0, AnonymousClass000.A1V(r1) ? 1 : 0));
            if (r1 != null && r3.A0A) {
                long j4 = r3.A03;
                return C90604eR.A01((j4 == -9223372036854775807L ? System.currentTimeMillis() : j4 + SystemClock.elapsedRealtime()) - j3) - (j2 + r6.A02);
            }
        }
        return -9223372036854775807L;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0035, code lost:
        if ((r12 + r6.A00) < 0) goto L_0x0037;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long A07(X.C30271c3 r11, long r12, boolean r14, boolean r15) {
        /*
            r10 = this;
            r10.A0E()
            r5 = 0
            r10.A0B = r5
            r4 = 2
            if (r15 != 0) goto L_0x0010
            X.4df r0 = r10.A07
            int r1 = r0.A00
            r0 = 3
            if (r1 != r0) goto L_0x0013
        L_0x0010:
            r10.A0H(r4)
        L_0x0013:
            X.4XV r7 = r10.A0Q
            X.4X7 r6 = r7.A05
            r1 = r6
        L_0x0018:
            if (r6 == 0) goto L_0x0027
            X.4Wv r0 = r6.A02
            X.1c3 r0 = r0.A04
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x0027
            X.4X7 r6 = r6.A01
            goto L_0x0018
        L_0x0027:
            r2 = 0
            if (r14 != 0) goto L_0x0037
            if (r1 != r6) goto L_0x0037
            if (r6 == 0) goto L_0x0097
            long r0 = r6.A00
            long r8 = r12 + r0
            int r0 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x0059
        L_0x0037:
            X.5UO[] r9 = r10.A0a
            int r8 = r9.length
            r1 = 0
        L_0x003b:
            if (r1 >= r8) goto L_0x0045
            r0 = r9[r1]
            r10.A0L(r0)
            int r1 = r1 + 1
            goto L_0x003b
        L_0x0045:
            if (r6 == 0) goto L_0x0097
        L_0x0047:
            X.4X7 r0 = r7.A05
            if (r0 == r6) goto L_0x004f
            r7.A00()
            goto L_0x0047
        L_0x004f:
            r7.A08(r6)
            r6.A00 = r2
            boolean[] r0 = new boolean[r8]
            r10.A0U(r0)
        L_0x0059:
            r7.A08(r6)
            boolean r1 = r6.A07
            X.4Wv r0 = r6.A02
            if (r1 != 0) goto L_0x006f
            X.4Wv r0 = r0.A01(r12)
            r6.A02 = r0
        L_0x0068:
            r10.A0J(r12)
            r10.A0A()
            goto L_0x009d
        L_0x006f:
            long r0 = r0.A00
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r7 == 0) goto L_0x0085
            int r7 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r7 < 0) goto L_0x0085
            r7 = 1
            long r0 = r0 - r7
            long r12 = java.lang.Math.max(r2, r0)
        L_0x0085:
            boolean r0 = r6.A06
            if (r0 == 0) goto L_0x0068
            X.0qH r6 = r6.A09
            long r12 = r6.AdG(r12)
            long r2 = r10.A0J
            long r0 = r12 - r2
            r6.A7z(r0, r5)
            goto L_0x0068
        L_0x0097:
            r7.A06()
            r10.A0J(r12)
        L_0x009d:
            r10.A0Q(r5)
            X.5La r0 = r10.A0Y
            X.4qO r0 = (X.C97684qO) r0
            android.os.Handler r0 = r0.A00
            r0.sendEmptyMessage(r4)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C97274pg.A07(X.1c3, long, boolean, boolean):long");
    }

    public final Pair A08(Timeline timeline) {
        Timeline timeline2 = timeline;
        if (AnonymousClass000.A1P(timeline.A01())) {
            return Pair.create(C90184df.A0I, 0L);
        }
        int A052 = timeline.A05(this.A0I);
        C89324by r6 = this.A0T;
        AnonymousClass4XE r5 = this.A0S;
        Pair A072 = timeline2.A07(r5, r6, A052, -9223372036854775807L, 0);
        C30271c3 A053 = this.A0Q.A05(timeline, A072.first, 0);
        long A012 = C13700nu.A01(A072.second);
        if (A053.A00()) {
            timeline.A09(r5, A053.A04);
            A012 = 0;
        }
        return Pair.create(A053, Long.valueOf(A012));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        if (r12.equals(r6.A07.A07) == false) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C90184df A09(X.C30271c3 r23, long r24, long r26) {
        /*
            r22 = this;
            r6 = r22
            boolean r0 = r6.A09
            r12 = r23
            r16 = r24
            if (r0 != 0) goto L_0x001d
            X.4df r0 = r6.A07
            long r1 = r0.A0G
            int r0 = (r24 > r1 ? 1 : (r24 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x001d
            X.4df r0 = r6.A07
            X.1c3 r0 = r0.A07
            boolean r1 = r12.equals(r0)
            r0 = 0
            if (r1 != 0) goto L_0x001e
        L_0x001d:
            r0 = 1
        L_0x001e:
            r6.A09 = r0
            r6.A0C()
            X.4df r1 = r6.A07
            X.4jT r13 = r1.A08
            X.4LY r14 = r1.A09
            java.util.List r15 = r1.A0A
            X.4XK r0 = r6.A0R
            boolean r0 = r0.A02
            r2 = r26
            if (r0 == 0) goto L_0x008b
            X.4XV r0 = r6.A0Q
            X.4X7 r7 = r0.A05
            if (r7 != 0) goto L_0x006a
            X.4jT r13 = X.C93604jT.A03
            X.4LY r14 = r6.A0V
        L_0x003d:
            X.5UR[] r10 = r14.A03
            X.3cL r9 = new X.3cL
            r9.<init>()
            int r8 = r10.length
            r5 = 0
            r4 = 0
            r11 = 0
        L_0x0048:
            if (r4 >= r8) goto L_0x006f
            r0 = r10[r4]
            if (r0 == 0) goto L_0x0062
            X.4qB r0 = (X.C97554qB) r0
            X.1gT[] r0 = r0.A04
            r0 = r0[r5]
            X.4jf r0 = r0.A0L
            if (r0 != 0) goto L_0x0065
            X.1mP[] r1 = new X.C35731mP[r5]
            X.4jf r0 = new X.4jf
            r0.<init>((X.C35731mP[]) r1)
            r9.add((java.lang.Object) r0)
        L_0x0062:
            int r4 = r4 + 1
            goto L_0x0048
        L_0x0065:
            r9.add((java.lang.Object) r0)
            r11 = 1
            goto L_0x0062
        L_0x006a:
            X.4jT r13 = r7.A03
            X.4LY r14 = r7.A04
            goto L_0x003d
        L_0x006f:
            if (r11 == 0) goto L_0x0086
            X.1kb r15 = r9.build()
        L_0x0075:
            if (r7 == 0) goto L_0x009b
            X.4Wv r5 = r7.A02
            long r0 = r5.A02
            int r4 = (r0 > r26 ? 1 : (r0 == r26 ? 0 : -1))
            if (r4 == 0) goto L_0x009b
            X.4Wv r0 = r5.A00(r2)
            r7.A02 = r0
            goto L_0x009b
        L_0x0086:
            X.1kb r15 = X.C34641kb.of()
            goto L_0x0075
        L_0x008b:
            X.1c3 r0 = r1.A07
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x009b
            X.4jT r13 = X.C93604jT.A03
            X.4LY r14 = r6.A0V
            X.1kb r15 = X.C34641kb.of()
        L_0x009b:
            X.4df r11 = r6.A07
            long r20 = r6.A05()
            r18 = r2
            X.4df r0 = r11.A07(r12, r13, r14, r15, r16, r18, r20)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C97274pg.A09(X.1c3, long, long):X.4df");
    }

    public final void A0A() {
        int i2;
        boolean z2;
        if (!A0V()) {
            z2 = false;
        } else {
            AnonymousClass4XV r2 = this.A0Q;
            AnonymousClass4X7 r1 = r2.A04;
            long ADw = !r1.A07 ? 0 : r1.A09.ADw();
            AnonymousClass4X7 r0 = r2.A04;
            long max = r0 == null ? 0 : Math.max(0, ADw - (this.A03 - r0.A00));
            AnonymousClass5L7 r4 = this.A0P;
            float f2 = this.A0M.AF4().A01;
            C96184nv r42 = (C96184nv) r4;
            C97574qD r3 = r42.A07;
            synchronized (r3) {
                i2 = r3.A00 * r3.A04;
            }
            boolean z3 = true;
            boolean A1P = AnonymousClass3K3.A1P(i2, r42.A00);
            long j2 = r42.A06;
            if (f2 > 1.0f) {
                if (f2 != 1.0f) {
                    j2 = Math.round(((double) j2) * ((double) f2));
                }
                j2 = Math.min(j2, r42.A05);
            }
            if (max < Math.max(j2, 500000)) {
                if (A1P) {
                    z3 = false;
                }
                r42.A01 = z3;
                if (!z3 && max < 500000) {
                    Log.w("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
                }
            } else if (max >= r42.A05 || A1P) {
                r42.A01 = false;
            }
            z2 = r42.A01;
        }
        this.A0H = z2;
        if (z2) {
            AnonymousClass4X7 r43 = this.A0Q.A04;
            long j3 = this.A03;
            C90524eJ.A04(AnonymousClass000.A1W(r43.A01));
            r43.A09.A6f(j3 - r43.A00);
        }
        A0F();
    }

    public final void A0B() {
        AnonymousClass4V3 r4 = this.A05;
        C90184df r2 = this.A07;
        boolean A1a = r4.A04 | C13680ns.A1a(r4.A03, r2);
        r4.A04 = A1a;
        r4.A03 = r2;
        if (A1a) {
            AnonymousClass3UF r3 = ((C96164nt) this.A0N).A00;
            C107695La r22 = r3.A0J;
            ((C97684qO) r22).A00.post(new RunnableRunnableShape12S0200000_I1(r3, 4, r4));
            this.A05 = new AnonymousClass4V3(this.A07);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000f, code lost:
        if (r2.A0D == false) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0C() {
        /*
            r2 = this;
            X.4XV r0 = r2.A0Q
            X.4X7 r0 = r0.A05
            if (r0 == 0) goto L_0x0011
            X.4Wv r0 = r0.A02
            boolean r0 = r0.A07
            if (r0 == 0) goto L_0x0011
            boolean r1 = r2.A0D
            r0 = 1
            if (r1 != 0) goto L_0x0012
        L_0x0011:
            r0 = 0
        L_0x0012:
            r2.A0E = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C97274pg.A0C():void");
    }

    public final void A0D() {
        this.A0B = false;
        C97764qW r1 = this.A0M;
        r1.A03 = true;
        C97774qX r2 = r1.A05;
        if (!r2.A03) {
            r2.A00 = SystemClock.elapsedRealtime();
            r2.A03 = true;
        }
        for (AnonymousClass5UO r12 : this.A0a) {
            if (AnonymousClass000.A1O(((C96244o1) r12).A01)) {
                C96244o1 r13 = (C96244o1) r12;
                C90524eJ.A04(C13690nt.A1R(r13.A01));
                r13.A01 = 2;
                r13.A02();
            }
        }
    }

    public final void A0E() {
        C97764qW r1 = this.A0M;
        r1.A03 = false;
        C97774qX r2 = r1.A05;
        if (r2.A03) {
            r2.A00(r2.AFA());
            r2.A03 = false;
        }
        for (AnonymousClass5UO r22 : this.A0a) {
            if (AnonymousClass000.A1O(((C96244o1) r22).A01)) {
                C96244o1 r23 = (C96244o1) r22;
                if (r23.A01 == 2) {
                    r23.A01 = 1;
                    r23.A03();
                }
            }
        }
    }

    public final void A0F() {
        AnonymousClass4X7 r1 = this.A0Q.A04;
        boolean z2 = this.A0H || (r1 != null && r1.A09.AJ6());
        C90184df r9 = this.A07;
        if (z2 != r9.A0B) {
            Timeline timeline = r9.A05;
            C30271c3 r37 = r9.A07;
            long j2 = r9.A02;
            int i2 = r9.A00;
            C804643y r18 = r9.A03;
            C93604jT r20 = r9.A08;
            AnonymousClass4LY r17 = r9.A09;
            List list = r9.A0A;
            boolean z3 = r9.A0D;
            int i3 = r9.A01;
            C89214bm r13 = r9.A04;
            C804643y r15 = r18;
            C89214bm r16 = r13;
            Timeline timeline2 = timeline;
            C30271c3 r182 = r37;
            this.A07 = new C90184df(r15, r16, timeline2, r182, r9.A06, r20, r17, list, i2, i3, j2, r9.A0F, r9.A0H, r9.A0G, z2, z3, r9.A0C, r9.A0E);
        }
    }

    public final void A0G() {
        AnonymousClass4XV r6 = this.A0Q;
        AnonymousClass4X7 r5 = r6.A05;
        if (r5 != null) {
            long AbU = r5.A07 ? r5.A09.AbU() : -9223372036854775807L;
            if (AbU != -9223372036854775807L) {
                A0J(AbU);
                if (AbU != this.A07.A0G) {
                    C90184df r0 = this.A07;
                    this.A07 = A09(r0.A07, AbU, r0.A02);
                    this.A05.A01(4);
                }
            } else {
                C97764qW r7 = this.A0M;
                boolean A1a = C13680ns.A1a(r5, r6.A06);
                AnonymousClass5UO r02 = r7.A00;
                if (r02 == null || r02.AIm() || (!r7.A00.AJY() && (A1a || r7.A00.AHf()))) {
                    r7.A02 = true;
                    if (r7.A03) {
                        C97774qX r2 = r7.A05;
                        if (!r2.A03) {
                            r2.A00 = SystemClock.elapsedRealtime();
                            r2.A03 = true;
                        }
                    }
                } else {
                    AnonymousClass5SP r9 = r7.A01;
                    long AFA = r9.AFA();
                    if (r7.A02) {
                        C97774qX r8 = r7.A05;
                        if (AFA >= r8.AFA()) {
                            r7.A02 = false;
                            if (r7.A03 && !r8.A03) {
                                r8.A00 = SystemClock.elapsedRealtime();
                                r8.A03 = true;
                            }
                        } else if (r8.A03) {
                            r8.A00(r8.AFA());
                            r8.A03 = false;
                        }
                    }
                    C97774qX r1 = r7.A05;
                    r1.A00(AFA);
                    C89214bm AF4 = r9.AF4();
                    if (!AF4.equals(r1.A02)) {
                        r1.AeL(AF4);
                        C97684qO.A00(((C97274pg) r7.A04).A0Y, 16, AF4);
                    }
                }
                long AFA2 = r7.AFA();
                this.A03 = AFA2;
                long j2 = AFA2 - r5.A00;
                ArrayList arrayList = this.A0Z;
                if (!arrayList.isEmpty()) {
                    C90184df r3 = this.A07;
                    C30271c3 r52 = r3.A07;
                    if (!r52.A00()) {
                        if (this.A09) {
                            this.A09 = false;
                        }
                        r3.A05.A04(r52.A04);
                        int min = Math.min(this.A01, arrayList.size());
                        if (min > 0) {
                            arrayList.get(min - 1);
                        }
                        if (min < arrayList.size()) {
                            arrayList.get(min);
                        }
                        this.A01 = min;
                    }
                }
                this.A07.A0G = j2;
            }
            this.A07.A0F = r6.A04.A00();
            this.A07.A0H = A05();
            C90184df r22 = this.A07;
            if (r22.A0D && r22.A00 == 3 && A0Y(r22.A05, r22.A07)) {
                C90184df r62 = this.A07;
                if (r62.A04.A01 == 1.0f) {
                    A06(r62.A05, r62.A07.A04, r62.A0G);
                    A05();
                    C97764qW r23 = this.A0M;
                    if (r23.AF4().A01 != 1.0f) {
                        r23.AeL(new C89214bm(1.0f, this.A07.A04.A00));
                        A0K(this.A07.A04, r23.AF4().A01, false, false);
                    }
                }
            }
        }
    }

    public final void A0H(int i2) {
        C90184df r1 = this.A07;
        if (r1.A00 != i2) {
            this.A07 = r1.A01(i2);
        }
    }

    public final void A0I(int i2, int i3, boolean z2, boolean z3) {
        AnonymousClass4V3 r1 = this.A05;
        r1.A00(z3 ? 1 : 0);
        r1.A04 = true;
        r1.A05 = true;
        r1.A02 = i3;
        C90184df A022 = this.A07.A02(i2, z2);
        this.A07 = A022;
        this.A0B = false;
        if (!A0X()) {
            A0E();
            A0G();
            return;
        }
        int i4 = A022.A00;
        if (i4 == 3) {
            A0D();
        } else if (i4 != 2) {
            return;
        }
        ((C97684qO) this.A0Y).A00.sendEmptyMessage(2);
    }

    public final void A0J(long j2) {
        AnonymousClass4X7 r0 = this.A0Q.A05;
        if (r0 != null) {
            j2 += r0.A00;
        }
        this.A03 = j2;
        this.A0M.A05.A00(j2);
        for (AnonymousClass5UO r3 : this.A0a) {
            if (AnonymousClass000.A1O(((C96244o1) r3).A01)) {
                long j3 = this.A03;
                C96244o1 r32 = (C96244o1) r3;
                r32.A06 = false;
                r32.A02 = j3;
                r32.A09(j3, false);
            }
        }
    }

    public final void A0K(C89214bm r6, float f2, boolean z2, boolean z3) {
        if (z2) {
            if (z3) {
                this.A05.A00(1);
            }
            this.A07 = this.A07.A04(r6);
        }
        float f3 = r6.A01;
        for (AnonymousClass4X7 r2 = this.A0Q.A05; r2 != null; r2 = r2.A01) {
            for (int i2 = 0; i2 < r2.A04.A03.length; i2++) {
            }
        }
        for (AnonymousClass5UO r0 : this.A0a) {
            if (r0 != null) {
                r0.AeM(f2, f3);
            }
        }
    }

    public final void A0L(AnonymousClass5UO r5) {
        C96244o1 r3 = (C96244o1) r5;
        if (AnonymousClass000.A1O(r3.A01)) {
            C97764qW r1 = this.A0M;
            if (r5 == r1.A00) {
                r1.A01 = null;
                r1.A00 = null;
                r1.A02 = true;
            }
            if (r3.A01 == 2) {
                r3.A01 = 1;
                r3.A03();
            }
            boolean z2 = true;
            if (r3.A01 != 1) {
                z2 = false;
            }
            C90524eJ.A04(z2);
            AnonymousClass4G5 r12 = r3.A0A;
            r12.A01 = null;
            r12.A00 = null;
            r3.A01 = 0;
            r3.A05 = null;
            r3.A08 = null;
            r3.A06 = false;
            r3.A08();
            this.A00--;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0289, code lost:
        if (r1 == false) goto L_0x028b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x02aa, code lost:
        if (r18 != r1.A02) goto L_0x02ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x02d7, code lost:
        if ((!r9.A08(r7)) != false) goto L_0x028b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0300, code lost:
        if (r18 != r5.A02) goto L_0x0302;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0052, code lost:
        if (r15 != r2.A07.A0G) goto L_0x0054;
     */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x02eb  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x02fa  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0320  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0M(com.google.android.exoplayer2.Timeline r40) {
        /*
            r39 = this;
            r2 = r39
            X.4df r5 = r2.A07
            X.4JQ r11 = r2.A06
            X.4XV r9 = r2.A0Q
            int r14 = r2.A02
            boolean r10 = r2.A0I
            X.4by r13 = r2.A0T
            X.4XE r4 = r2.A0S
            r3 = r40
            int r0 = r3.A01()
            boolean r21 = X.AnonymousClass000.A1P(r0)
            if (r21 == 0) goto L_0x005e
            X.1c3 r12 = X.C90184df.A0I
            r13 = 0
            r15 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r17 = 0
            r18 = 1
            r19 = 0
            X.4Nc r11 = new X.4Nc
            r11.<init>(r12, r13, r15, r17, r18, r19)
        L_0x0030:
            X.1c3 r0 = r11.A02
            r25 = r0
            long r0 = r11.A01
            r18 = r0
            boolean r4 = r11.A04
            long r15 = r11.A00
            X.4df r0 = r2.A07
            X.1c3 r1 = r0.A07
            r0 = r25
            boolean r0 = r1.equals(r0)
            r5 = 1
            r8 = 0
            if (r0 == 0) goto L_0x0054
            X.4df r0 = r2.A07
            long r0 = r0.A0G
            int r6 = (r15 > r0 ? 1 : (r15 == r0 ? 0 : -1))
            r20 = 0
            if (r6 == 0) goto L_0x0056
        L_0x0054:
            r20 = 1
        L_0x0056:
            r6 = 0
            r27 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x0198
        L_0x005e:
            X.1c3 r12 = r5.A07
            java.lang.Object r7 = r12.A04
            r15 = r7
            boolean r16 = A04(r5, r4, r13)
            if (r16 == 0) goto L_0x0194
            long r0 = r5.A02
        L_0x006b:
            r29 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r11 == 0) goto L_0x011b
            r18 = 1
            r8 = -1
            r22 = r11
            r23 = r4
            r24 = r13
            r25 = r3
            r26 = r14
            r27 = r10
            android.util.Pair r6 = A00(r22, r23, r24, r25, r26, r27)
            if (r6 != 0) goto L_0x00f9
            int r6 = r3.A05(r10)
            r20 = 0
            r18 = 0
            r19 = 1
        L_0x0091:
            if (r6 == r8) goto L_0x00f6
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r31 = 0
            r25 = r3
            r26 = r4
            r27 = r13
            r28 = r6
            android.util.Pair r0 = r25.A07(r26, r27, r28, r29, r31)
            java.lang.Object r7 = r0.first
            java.lang.Object r0 = r0.second
            long r0 = X.C13700nu.A01(r0)
        L_0x00ae:
            X.1c3 r6 = r9.A05(r3, r7, r0)
            int r10 = r6.A02
            if (r10 == r8) goto L_0x00be
            int r10 = r12.A02
            if (r10 == r8) goto L_0x00f4
            int r8 = r6.A00
            if (r8 < r10) goto L_0x00f4
        L_0x00be:
            r8 = 1
        L_0x00bf:
            boolean r7 = r15.equals(r7)
            if (r7 == 0) goto L_0x00d4
            boolean r7 = r12.A00()
            if (r7 != 0) goto L_0x00d4
            boolean r7 = r6.A00()
            if (r7 != 0) goto L_0x00d4
            if (r8 == 0) goto L_0x00d4
            r6 = r12
        L_0x00d4:
            boolean r7 = r6.A00()
            if (r7 == 0) goto L_0x00e2
            boolean r0 = r6.equals(r12)
            if (r0 == 0) goto L_0x00ec
            long r0 = r5.A0G
        L_0x00e2:
            X.4Nc r11 = new X.4Nc
            r12 = r11
            r13 = r6
            r14 = r0
            r12.<init>(r13, r14, r16, r18, r19, r20)
            goto L_0x0030
        L_0x00ec:
            java.lang.Object r0 = r6.A04
            r3.A09(r4, r0)
            r0 = 0
            goto L_0x00e2
        L_0x00f4:
            r8 = 0
            goto L_0x00bf
        L_0x00f6:
            r16 = r0
            goto L_0x00ae
        L_0x00f9:
            long r10 = r11.A01
            int r14 = (r10 > r29 ? 1 : (r10 == r29 ? 0 : -1))
            if (r14 != 0) goto L_0x010f
            java.lang.Object r6 = r6.first
            int r6 = X.AnonymousClass4XE.A00(r4, r3, r6)
            r20 = 0
        L_0x0107:
            int r11 = r5.A00
            r10 = 4
            if (r11 == r10) goto L_0x0130
            r18 = 0
            goto L_0x0130
        L_0x010f:
            java.lang.Object r7 = r6.first
            java.lang.Object r0 = r6.second
            long r0 = X.C13700nu.A01(r0)
            r20 = 1
            r6 = -1
            goto L_0x0107
        L_0x011b:
            r8 = -1
            com.google.android.exoplayer2.Timeline r11 = r5.A05
            int r6 = r11.A01()
            boolean r6 = X.AnonymousClass000.A1P(r6)
            if (r6 == 0) goto L_0x0134
            int r6 = r3.A05(r10)
        L_0x012c:
            r18 = 0
            r20 = 0
        L_0x0130:
            r19 = 0
            goto L_0x0091
        L_0x0134:
            int r6 = r3.A04(r7)
            if (r6 != r8) goto L_0x0161
            r22 = r4
            r23 = r13
            r24 = r11
            r25 = r3
            r26 = r7
            r27 = r14
            r28 = r10
            java.lang.Object r6 = A01(r22, r23, r24, r25, r26, r27, r28)
            if (r6 != 0) goto L_0x015a
            int r6 = r3.A05(r10)
            r19 = 1
        L_0x0154:
            r18 = 0
            r20 = 0
            goto L_0x0091
        L_0x015a:
            int r6 = X.AnonymousClass4XE.A00(r4, r3, r6)
            r19 = 0
            goto L_0x0154
        L_0x0161:
            if (r16 == 0) goto L_0x0192
            int r6 = (r0 > r29 ? 1 : (r0 == r29 ? 0 : -1))
            if (r6 != 0) goto L_0x016c
            int r6 = X.AnonymousClass4XE.A00(r4, r3, r7)
            goto L_0x012c
        L_0x016c:
            r11.A09(r4, r7)
            long r10 = r4.A02
            long r0 = r0 + r10
            int r34 = X.AnonymousClass4XE.A00(r4, r3, r7)
            r37 = 0
            r31 = r3
            r32 = r4
            r33 = r13
            r35 = r0
            android.util.Pair r0 = r31.A07(r32, r33, r34, r35, r37)
            java.lang.Object r7 = r0.first
            java.lang.Object r0 = r0.second
            long r0 = X.C13700nu.A01(r0)
            r6 = -1
            r18 = 0
            r20 = 1
            goto L_0x0130
        L_0x0192:
            r6 = -1
            goto L_0x012c
        L_0x0194:
            long r0 = r5.A0G
            goto L_0x006b
        L_0x0198:
            boolean r0 = r11.A03     // Catch:{ all -> 0x02e0 }
            if (r0 == 0) goto L_0x01a9
            X.4df r0 = r2.A07     // Catch:{ all -> 0x02e0 }
            int r0 = r0.A00     // Catch:{ all -> 0x02e0 }
            if (r0 == r5) goto L_0x01a6
            r0 = 4
            r2.A0H(r0)     // Catch:{ all -> 0x02e0 }
        L_0x01a6:
            r2.A0T(r8, r8, r8, r5)     // Catch:{ all -> 0x02e0 }
        L_0x01a9:
            if (r20 != 0) goto L_0x0257
            long r0 = r2.A03     // Catch:{ all -> 0x02e0 }
            r22 = r0
            X.4X7 r10 = r9.A06     // Catch:{ all -> 0x02e0 }
            if (r10 != 0) goto L_0x01b6
            r4 = 0
            goto L_0x01f0
        L_0x01b6:
            long r4 = r10.A00     // Catch:{ all -> 0x02e0 }
            boolean r0 = r10.A07     // Catch:{ all -> 0x02e0 }
            if (r0 == 0) goto L_0x01f0
            r7 = 0
        L_0x01bd:
            X.5UO[] r12 = r2.A0a     // Catch:{ all -> 0x02e0 }
            int r0 = r12.length     // Catch:{ all -> 0x02e0 }
            if (r7 >= r0) goto L_0x01f0
            r0 = r12[r7]     // Catch:{ all -> 0x02e0 }
            X.4o1 r0 = (X.C96244o1) r0     // Catch:{ all -> 0x02e0 }
            int r0 = r0.A01     // Catch:{ all -> 0x02e0 }
            boolean r0 = X.AnonymousClass000.A1O(r0)     // Catch:{ all -> 0x02e0 }
            if (r0 == 0) goto L_0x01eb
            r0 = r12[r7]     // Catch:{ all -> 0x02e0 }
            X.4o1 r0 = (X.C96244o1) r0     // Catch:{ all -> 0x02e0 }
            X.5Sm r1 = r0.A05     // Catch:{ all -> 0x02e0 }
            X.5Sm[] r0 = r10.A0D     // Catch:{ all -> 0x02e0 }
            r0 = r0[r7]     // Catch:{ all -> 0x02e0 }
            if (r1 != r0) goto L_0x01eb
            r0 = r12[r7]     // Catch:{ all -> 0x02e0 }
            X.4o1 r0 = (X.C96244o1) r0     // Catch:{ all -> 0x02e0 }
            long r0 = r0.A02     // Catch:{ all -> 0x02e0 }
            r13 = -9223372036854775808
            int r12 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r12 != 0) goto L_0x01e7
            goto L_0x01ee
        L_0x01e7:
            long r4 = java.lang.Math.max(r0, r4)     // Catch:{ all -> 0x02e0 }
        L_0x01eb:
            int r7 = r7 + 1
            goto L_0x01bd
        L_0x01ee:
            r4 = -9223372036854775808
        L_0x01f0:
            X.4X7 r10 = r9.A05     // Catch:{ all -> 0x02dd }
            r7 = 0
        L_0x01f3:
            if (r10 == 0) goto L_0x028b
            X.4Wv r6 = r10.A02     // Catch:{ all -> 0x02dd }
            if (r7 != 0) goto L_0x020e
            X.4Wv r12 = r9.A02(r6, r3)     // Catch:{ all -> 0x02dd }
        L_0x01fd:
            long r0 = r6.A02     // Catch:{ all -> 0x02dd }
            X.4Wv r0 = r12.A00(r0)     // Catch:{ all -> 0x02dd }
            r10.A02 = r0     // Catch:{ all -> 0x02dd }
            long r6 = r6.A00     // Catch:{ all -> 0x02dd }
            long r0 = r12.A00     // Catch:{ all -> 0x02dd }
            int r12 = (r6 > r27 ? 1 : (r6 == r27 ? 0 : -1))
            if (r12 == 0) goto L_0x0237
            goto L_0x0229
        L_0x020e:
            r0 = r22
            X.4Wv r12 = r9.A01(r7, r3, r0)     // Catch:{ all -> 0x02dd }
            if (r12 == 0) goto L_0x02d1
            long r13 = r6.A03     // Catch:{ all -> 0x02dd }
            long r0 = r12.A03     // Catch:{ all -> 0x02dd }
            int r17 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r17 != 0) goto L_0x02d1
            X.1c3 r1 = r6.A04     // Catch:{ all -> 0x02dd }
            X.1c3 r0 = r12.A04     // Catch:{ all -> 0x02dd }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x02dd }
            if (r0 == 0) goto L_0x02d1
            goto L_0x01fd
        L_0x0229:
            int r12 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r12 == 0) goto L_0x0237
            int r6 = (r0 > r27 ? 1 : (r0 == r27 ? 0 : -1))
            if (r6 != 0) goto L_0x023c
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L_0x023f
        L_0x0237:
            X.4X7 r0 = r10.A01     // Catch:{ all -> 0x02dd }
            r7 = r10
            r10 = r0
            goto L_0x01f3
        L_0x023c:
            long r6 = r10.A00     // Catch:{ all -> 0x02dd }
            long r0 = r0 + r6
        L_0x023f:
            X.4X7 r6 = r9.A06     // Catch:{ all -> 0x02dd }
            if (r10 != r6) goto L_0x024f
            r12 = -9223372036854775808
            int r6 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r6 == 0) goto L_0x024d
            int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r6 < 0) goto L_0x024f
        L_0x024d:
            r1 = 1
            goto L_0x0250
        L_0x024f:
            r1 = 0
        L_0x0250:
            boolean r0 = r9.A08(r10)     // Catch:{ all -> 0x02dd }
            if (r0 != 0) goto L_0x02d9
            goto L_0x0289
        L_0x0257:
            if (r21 != 0) goto L_0x028b
            X.4X7 r5 = r9.A05     // Catch:{ all -> 0x02dd }
        L_0x025b:
            if (r5 == 0) goto L_0x0274
            X.4Wv r0 = r5.A02     // Catch:{ all -> 0x02dd }
            X.1c3 r1 = r0.A04     // Catch:{ all -> 0x02dd }
            r0 = r25
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x02dd }
            if (r0 == 0) goto L_0x0271
            X.4Wv r0 = r5.A02     // Catch:{ all -> 0x02dd }
            X.4Wv r0 = r9.A02(r0, r3)     // Catch:{ all -> 0x02dd }
            r5.A02 = r0     // Catch:{ all -> 0x02dd }
        L_0x0271:
            X.4X7 r5 = r5.A01     // Catch:{ all -> 0x02dd }
            goto L_0x025b
        L_0x0274:
            X.4X7 r1 = r9.A05     // Catch:{ all -> 0x02dd }
            X.4X7 r0 = r9.A06     // Catch:{ all -> 0x02dd }
            boolean r33 = X.C13680ns.A1a(r1, r0)
            r29 = r2
            r30 = r25
            r31 = r15
            r34 = r4
            long r15 = r29.A07(r30, r31, r33, r34)     // Catch:{ all -> 0x02dd }
            goto L_0x028b
        L_0x0289:
            if (r1 != 0) goto L_0x02d9
        L_0x028b:
            X.4df r0 = r2.A07
            com.google.android.exoplayer2.Timeline r4 = r0.A05
            X.1c3 r1 = r0.A07
            boolean r0 = r11.A05
            if (r0 == 0) goto L_0x0297
            r27 = r15
        L_0x0297:
            r22 = r2
            r23 = r3
            r24 = r4
            r26 = r1
            r22.A0O(r23, r24, r25, r26, r27)
            if (r20 != 0) goto L_0x02ac
            X.4df r1 = r2.A07
            long r4 = r1.A02
            int r0 = (r18 > r4 ? 1 : (r18 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x02b8
        L_0x02ac:
            r9 = r2
            r10 = r25
            r11 = r15
            r13 = r18
            X.4df r1 = r9.A09(r10, r11, r13)
            r2.A07 = r1
        L_0x02b8:
            r2.A0C()
            com.google.android.exoplayer2.Timeline r0 = r1.A05
            r2.A0N(r3, r0)
            X.4df r0 = r2.A07
            X.4df r0 = r0.A05(r3)
            r2.A07 = r0
            if (r21 != 0) goto L_0x02cd
            r0 = 0
            r2.A06 = r0
        L_0x02cd:
            r2.A0Q(r8)
            return
        L_0x02d1:
            boolean r0 = r9.A08(r7)     // Catch:{ all -> 0x02dd }
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x028b
        L_0x02d9:
            r2.A0R(r8)     // Catch:{ all -> 0x02dd }
            goto L_0x028b
        L_0x02dd:
            r7 = move-exception
            r6 = 0
            goto L_0x02e1
        L_0x02e0:
            r7 = move-exception
        L_0x02e1:
            X.4df r0 = r2.A07
            com.google.android.exoplayer2.Timeline r4 = r0.A05
            X.1c3 r1 = r0.A07
            boolean r0 = r11.A05
            if (r0 == 0) goto L_0x02ed
            r27 = r15
        L_0x02ed:
            r22 = r2
            r23 = r3
            r24 = r4
            r26 = r1
            r22.A0O(r23, r24, r25, r26, r27)
            if (r20 != 0) goto L_0x0302
            X.4df r5 = r2.A07
            long r0 = r5.A02
            int r4 = (r18 > r0 ? 1 : (r18 == r0 ? 0 : -1))
            if (r4 == 0) goto L_0x030e
        L_0x0302:
            r9 = r2
            r10 = r25
            r11 = r15
            r13 = r18
            X.4df r5 = r9.A09(r10, r11, r13)
            r2.A07 = r5
        L_0x030e:
            r2.A0C()
            com.google.android.exoplayer2.Timeline r0 = r5.A05
            r2.A0N(r3, r0)
            X.4df r0 = r2.A07
            X.4df r0 = r0.A05(r3)
            r2.A07 = r0
            if (r21 != 0) goto L_0x0322
            r2.A06 = r6
        L_0x0322:
            r2.A0Q(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C97274pg.A0M(com.google.android.exoplayer2.Timeline):void");
    }

    public final void A0N(Timeline timeline, Timeline timeline2) {
        if (!AnonymousClass000.A1P(timeline.A01()) || !AnonymousClass000.A1P(timeline2.A01())) {
            ArrayList arrayList = this.A0Z;
            int size = arrayList.size() - 1;
            if (size >= 0) {
                arrayList.get(size);
                throw AnonymousClass000.A0W("resolvedPeriodUid");
            } else {
                Collections.sort(arrayList);
            }
        }
    }

    public final void A0O(Timeline timeline, Timeline timeline2, C30271c3 r11, C30271c3 r12, long j2) {
        if (AnonymousClass000.A1P(timeline.A01()) || !A0Y(timeline, r11)) {
            C97764qW r3 = this.A0M;
            float f2 = r3.AF4().A01;
            C89214bm r1 = this.A07.A04;
            if (f2 != r1.A01) {
                r3.AeL(r1);
                return;
            }
            return;
        }
        Object obj = r11.A04;
        AnonymousClass4XE r5 = this.A0S;
        int A002 = AnonymousClass4XE.A00(r5, timeline, obj);
        C89324by r4 = this.A0T;
        timeline.A0A(r4, A002, 0);
        C96174nu r32 = (C96174nu) this.A0O;
        long j3 = -9223372036854775807L;
        r32.A05 = -9223372036854775807L;
        r32.A06 = -9223372036854775807L;
        r32.A04 = -9223372036854775807L;
        if (j2 != -9223372036854775807L) {
            j3 = A06(timeline, obj, j2);
        } else {
            Object obj2 = r4.A09;
            Object obj3 = null;
            if (!AnonymousClass000.A1P(timeline2.A01())) {
                obj3 = AnonymousClass3K4.A0O(r4, timeline2, AnonymousClass4XE.A00(r5, timeline2, r12.A04)).A09;
            }
            if (AnonymousClass3C1.A0F(obj3, obj2)) {
                return;
            }
        }
        r32.A09 = j3;
    }

    public final void A0P(AnonymousClass4LY r9) {
        AnonymousClass5L7 r4 = this.A0P;
        AnonymousClass5UO[] r6 = this.A0a;
        AnonymousClass5UR[] r7 = r9.A03;
        C96184nv r42 = (C96184nv) r4;
        int i2 = 0;
        for (int i3 = 0; i3 < r6.length; i3++) {
            if (r7[i3] != null) {
                int i4 = ((C96244o1) r6[i3]).A09;
                int i5 = 13107200;
                if (i4 != 1) {
                    i5 = 131072000;
                    if (i4 != 2) {
                        if (i4 == 3 || i4 == 5 || i4 == 6) {
                            i5 = 131072;
                        } else {
                            throw AnonymousClass3K3.A0f();
                        }
                    }
                }
                i2 += i5;
            }
        }
        int max = Math.max(13107200, i2);
        r42.A00 = max;
        r42.A07.A00(max);
    }

    public final void A0Q(boolean z2) {
        AnonymousClass4X7 r4 = this.A0Q.A04;
        C30271c3 r1 = r4 == null ? this.A07.A07 : r4.A02.A04;
        boolean z3 = !this.A07.A06.equals(r1);
        if (z3) {
            this.A07 = this.A07.A06(r1);
        }
        C90184df r2 = this.A07;
        r2.A0F = r4 == null ? r2.A0G : r4.A00();
        this.A07.A0H = A05();
        if ((z3 || z2) && r4 != null && r4.A07) {
            A0P(r4.A04);
        }
    }

    public final void A0R(boolean z2) {
        C30271c3 r4 = this.A0Q.A05.A02.A04;
        long A072 = A07(r4, this.A07.A0G, true, false);
        if (A072 != this.A07.A0G) {
            this.A07 = A09(r4, A072, this.A07.A02);
            if (z2) {
                this.A05.A01(4);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0007, code lost:
        if (r4.A0A == false) goto L_0x0009;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0S(boolean r5, boolean r6) {
        /*
            r4 = this;
            r3 = 0
            r2 = 1
            if (r5 != 0) goto L_0x0009
            boolean r1 = r4.A0A
            r0 = 0
            if (r1 != 0) goto L_0x000a
        L_0x0009:
            r0 = 1
        L_0x000a:
            r4.A0T(r0, r3, r2, r3)
            X.4V3 r0 = r4.A05
            r0.A00(r6)
            X.5L7 r1 = r4.A0P
            X.4nv r1 = (X.C96184nv) r1
            r0 = 13107200(0xc80000, float:1.8367099E-38)
            r1.A00 = r0
            r1.A01 = r3
            X.4qD r1 = r1.A07
            monitor-enter(r1)
            r1.A00(r3)     // Catch:{ all -> 0x0027 }
            monitor-exit(r1)
            r4.A0H(r2)
            return
        L_0x0027:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C97274pg.A0S(boolean, boolean):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x011c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0T(boolean r38, boolean r39, boolean r40, boolean r41) {
        /*
            r37 = this;
            r5 = r37
            X.5La r0 = r5.A0Y
            X.4qO r0 = (X.C97684qO) r0
            r1 = 2
            android.os.Handler r0 = r0.A00
            r0.removeMessages(r1)
            r4 = 0
            r5.A0B = r4
            X.4qW r0 = r5.A0M
            r0.A03 = r4
            X.4qX r2 = r0.A05
            boolean r0 = r2.A03
            if (r0 == 0) goto L_0x0022
            long r0 = r2.AFA()
            r2.A00(r0)
            r2.A03 = r4
        L_0x0022:
            r0 = 0
            r5.A03 = r0
            X.5UO[] r7 = r5.A0a
            int r6 = r7.length
            r2 = 0
        L_0x002a:
            java.lang.String r3 = "ExoPlayerImplInternal"
            if (r2 >= r6) goto L_0x003d
            r0 = r7[r2]
            r5.A0L(r0)     // Catch:{ 43y | RuntimeException -> 0x0034 }
            goto L_0x003a
        L_0x0034:
            r1 = move-exception
            java.lang.String r0 = "Disable failed."
            X.C89504cL.A01(r3, r0, r1)
        L_0x003a:
            int r2 = r2 + 1
            goto L_0x002a
        L_0x003d:
            if (r38 == 0) goto L_0x0051
            r2 = 0
        L_0x0040:
            if (r2 >= r6) goto L_0x0051
            r0 = r7[r2]
            r0.reset()     // Catch:{ RuntimeException -> 0x0048 }
            goto L_0x004e
        L_0x0048:
            r1 = move-exception
            java.lang.String r0 = "Reset failed."
            X.C89504cL.A01(r3, r0, r1)
        L_0x004e:
            int r2 = r2 + 1
            goto L_0x0040
        L_0x0051:
            r5.A00 = r4
            X.4df r0 = r5.A07
            X.1c3 r7 = r0.A07
            long r2 = r0.A0G
            X.4df r6 = r5.A07
            X.4XE r1 = r5.A0S
            X.4by r0 = r5.A0T
            boolean r1 = A04(r6, r1, r0)
            X.4df r0 = r5.A07
            if (r1 == 0) goto L_0x0129
            long r0 = r0.A02
        L_0x0069:
            r8 = 0
            if (r39 == 0) goto L_0x0126
            r5.A06 = r8
            X.4df r0 = r5.A07
            com.google.android.exoplayer2.Timeline r0 = r0.A05
            android.util.Pair r0 = r5.A08(r0)
            java.lang.Object r7 = r0.first
            X.1c3 r7 = (X.C30271c3) r7
            java.lang.Object r0 = r0.second
            long r2 = X.C13700nu.A01(r0)
            X.4df r0 = r5.A07
            X.1c3 r0 = r0.A07
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L_0x0121
            r9 = 1
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x0090:
            X.4XV r6 = r5.A0Q
            r6.A06()
            r5.A0H = r4
            X.4df r4 = r5.A07
            com.google.android.exoplayer2.Timeline r6 = r4.A05
            r36 = r6
            int r6 = r4.A00
            r18 = r6
            if (r41 == 0) goto L_0x011c
            r16 = r8
        L_0x00a5:
            r11 = 0
            if (r9 == 0) goto L_0x0115
            X.4jT r10 = X.C93604jT.A03
            X.4LY r9 = r5.A0V
            X.1kb r6 = X.C34641kb.of()
        L_0x00b0:
            boolean r15 = r4.A0D
            int r14 = r4.A01
            X.4bm r13 = r4.A04
            r28 = 0
            boolean r12 = r5.A0C
            X.4df r4 = new X.4df
            r30 = r2
            r32 = 0
            r35 = 0
            r17 = r7
            r26 = r2
            r33 = r15
            r34 = r12
            r22 = r18
            r23 = r14
            r24 = r0
            r18 = r7
            r19 = r10
            r20 = r9
            r21 = r6
            r14 = r16
            r15 = r13
            r16 = r36
            r13 = r4
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r26, r28, r30, r32, r33, r34, r35)
            r5.A07 = r4
            if (r40 == 0) goto L_0x0137
            X.4XK r6 = r5.A0R
            java.util.HashMap r7 = r6.A06
            java.util.Collection r0 = r7.values()
            java.util.Iterator r4 = r0.iterator()
        L_0x00f1:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x012d
            java.lang.Object r3 = r4.next()
            X.4JR r3 = (X.AnonymousClass4JR) r3
            X.2PW r1 = r3.A01     // Catch:{ RuntimeException -> 0x0105 }
            X.5Nm r0 = r3.A00     // Catch:{ RuntimeException -> 0x0105 }
            r1.Abm(r0)     // Catch:{ RuntimeException -> 0x0105 }
            goto L_0x010d
        L_0x0105:
            r2 = move-exception
            java.lang.String r1 = "MediaSourceList"
            java.lang.String r0 = "Failed to release child source."
            X.C89504cL.A01(r1, r0, r2)
        L_0x010d:
            X.2PW r1 = r3.A01
            X.1c0 r0 = r3.A02
            r1.Abw(r0)
            goto L_0x00f1
        L_0x0115:
            X.4jT r10 = r4.A08
            X.4LY r9 = r4.A09
            java.util.List r6 = r4.A0A
            goto L_0x00b0
        L_0x011c:
            X.43y r6 = r4.A03
            r16 = r6
            goto L_0x00a5
        L_0x0121:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x0126:
            r9 = 0
            goto L_0x0090
        L_0x0129:
            long r0 = r0.A0G
            goto L_0x0069
        L_0x012d:
            r7.clear()
            java.util.Set r0 = r6.A0A
            r0.clear()
            r6.A02 = r11
        L_0x0137:
            r5.A04 = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C97274pg.A0T(boolean, boolean, boolean, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0070, code lost:
        if (r10.A07.A00 != 3) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0077, code lost:
        if (r17 == false) goto L_0x0079;
     */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0112 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0U(boolean[] r28) {
        /*
            r27 = this;
            r10 = r27
            X.4XV r9 = r10.A0Q
            X.4X7 r0 = r9.A06
            r26 = r0
            X.4LY r15 = r0.A04
            r8 = 0
            r1 = 0
        L_0x000c:
            X.5UO[] r7 = r10.A0a
            int r13 = r7.length
            if (r1 >= r13) goto L_0x001f
            X.4bE[] r0 = r15.A02
            r0 = r0[r1]
            if (r0 != 0) goto L_0x001c
            r0 = r7[r1]
            r0.reset()
        L_0x001c:
            int r1 = r1 + 1
            goto L_0x000c
        L_0x001f:
            if (r8 >= r13) goto L_0x0130
            X.4bE[] r0 = r15.A02
            r0 = r0[r8]
            if (r0 == 0) goto L_0x0112
            boolean r5 = r28[r8]
            r6 = r7[r8]
            r0 = r6
            X.4o1 r0 = (X.C96244o1) r0
            int r0 = r0.A01
            boolean r0 = X.AnonymousClass000.A1O(r0)
            if (r0 != 0) goto L_0x0112
            X.4X7 r2 = r9.A06
            X.4X7 r0 = r9.A05
            boolean r19 = X.AnonymousClass000.A1Y(r2, r0)
            X.4LY r1 = r2.A04
            X.4bE[] r0 = r1.A02
            r18 = r0[r8]
            X.5UR[] r0 = r1.A03
            r4 = r0[r8]
            r3 = 0
            if (r4 == 0) goto L_0x0061
            r0 = r4
            X.4qB r0 = (X.C97554qB) r0
            int[] r0 = r0.A03
            int r1 = r0.length
        L_0x0051:
            X.1gT[] r12 = new X.C32491gT[r1]
        L_0x0053:
            if (r3 >= r1) goto L_0x0063
            r0 = r4
            X.4qB r0 = (X.C97554qB) r0
            X.1gT[] r0 = r0.A04
            r0 = r0[r3]
            r12[r3] = r0
            int r3 = r3 + 1
            goto L_0x0053
        L_0x0061:
            r1 = 0
            goto L_0x0051
        L_0x0063:
            boolean r0 = r10.A0X()
            if (r0 == 0) goto L_0x0072
            X.4df r0 = r10.A07
            int r1 = r0.A00
            r0 = 3
            r17 = 1
            if (r1 == r0) goto L_0x0074
        L_0x0072:
            r17 = 0
        L_0x0074:
            if (r5 != 0) goto L_0x0079
            r5 = 1
            if (r17 != 0) goto L_0x007a
        L_0x0079:
            r5 = 0
        L_0x007a:
            int r0 = r10.A00
            int r0 = r0 + 1
            r10.A00 = r0
            X.5Sm[] r0 = r2.A0D
            r16 = r0[r8]
            long r0 = r10.A03
            r24 = r0
            X.4Wv r0 = r2.A02
            long r3 = r0.A03
            long r0 = r2.A00
            long r3 = r3 + r0
            r11 = r6
            X.4o1 r11 = (X.C96244o1) r11
            int r2 = r11.A01
            r14 = r2
            r2 = 1
            boolean r14 = X.AnonymousClass000.A1P(r14)
            X.C90524eJ.A04(r14)
            r14 = r18
            r11.A04 = r14
            r11.A01 = r2
            r14 = r19
            r11.A0A(r5, r14)
            boolean r14 = r11.A06
            r14 = r14 ^ 1
            X.C90524eJ.A04(r14)
            r14 = r16
            r11.A05 = r14
            r11.A02 = r0
            r11.A08 = r12
            r11.A03 = r0
            r18 = r11
            r19 = r12
            r20 = r3
            r22 = r0
            r18.A04(r19, r20, r22)
            r0 = r24
            r11.A09(r0, r5)
            X.4o0 r1 = new X.4o0
            r1.<init>(r10)
            boolean r0 = r6 instanceof X.AnonymousClass3UG
            if (r0 != 0) goto L_0x00e5
            boolean r0 = r6 instanceof X.AnonymousClass3UK
            if (r0 != 0) goto L_0x00e5
            boolean r0 = r6 instanceof X.C65473Ux
            if (r0 != 0) goto L_0x00e5
            boolean r0 = r6 instanceof X.C65483Uy
            if (r0 == 0) goto L_0x00e5
            r0 = r6
            X.3Uy r0 = (X.C65483Uy) r0
            X.5LA r1 = (X.AnonymousClass5LA) r1
            r0.A03 = r1
        L_0x00e5:
            X.4qW r3 = r10.A0M
            boolean r0 = r6 instanceof X.AnonymousClass3UK
            if (r0 == 0) goto L_0x0116
            r1 = r6
            X.3UK r1 = (X.AnonymousClass3UK) r1
        L_0x00ee:
            if (r1 == 0) goto L_0x0101
            X.5SP r0 = r3.A01
            if (r1 == r0) goto L_0x0101
            if (r0 != 0) goto L_0x011e
            r3.A01 = r1
            r3.A00 = r6
            X.4qX r0 = r3.A05
            X.4bm r0 = r0.A02
            r1.AeL(r0)
        L_0x0101:
            if (r17 == 0) goto L_0x0112
            int r1 = r11.A01
            r0 = 1
            if (r1 == r2) goto L_0x0109
            r0 = 0
        L_0x0109:
            X.C90524eJ.A04(r0)
            r0 = 2
            r11.A01 = r0
            r11.A02()
        L_0x0112:
            int r8 = r8 + 1
            goto L_0x001f
        L_0x0116:
            boolean r0 = r6 instanceof X.C65483Uy
            if (r0 == 0) goto L_0x0101
            r1 = r6
            X.3Uy r1 = (X.C65483Uy) r1
            goto L_0x00ee
        L_0x011e:
            java.lang.String r0 = "Multiple renderer media clocks enabled."
            java.lang.IllegalStateException r3 = X.AnonymousClass000.A0V(r0)
            r4 = 2
            r1 = 0
            r5 = -1
            r6 = 4
            r7 = 0
            X.43y r0 = new X.43y
            r2 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            throw r0
        L_0x0130:
            r1 = 1
            r0 = r26
            r0.A05 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C97274pg.A0U(boolean[]):void");
    }

    public final boolean A0V() {
        AnonymousClass4X7 r1 = this.A0Q.A04;
        return r1 != null && (!r1.A07 || r1.A09.ADw() != Long.MIN_VALUE);
    }

    public final boolean A0W() {
        AnonymousClass4X7 r1 = this.A0Q.A05;
        long j2 = r1.A02.A00;
        if (r1.A07) {
            return j2 == -9223372036854775807L || this.A07.A0G < j2 || !A0X();
        }
        return false;
    }

    public final boolean A0X() {
        C90184df r1 = this.A07;
        return r1.A0D && r1.A01 == 0;
    }

    public final boolean A0Y(Timeline timeline, C30271c3 r8) {
        if (r8.A00() || AnonymousClass000.A1P(timeline.A01())) {
            return false;
        }
        int A002 = AnonymousClass4XE.A00(this.A0S, timeline, r8.A04);
        C89324by r3 = this.A0T;
        timeline.A0A(r3, A002, 0);
        boolean z2 = r3.A0B;
        AnonymousClass4SO r1 = r3.A06;
        C90524eJ.A04(AnonymousClass000.A1R(z2 ? 1 : 0, AnonymousClass000.A1V(r1) ? 1 : 0));
        return (r1 == null || !r3.A0A || r3.A05 == -9223372036854775807L) ? false : true;
    }

    public /* bridge */ /* synthetic */ void AP8(C15080qI r3) {
        C97684qO.A00(this.A0Y, 9, r3);
    }

    public void AVC(C15070qH r3) {
        C97684qO.A00(this.A0Y, 8, r3);
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:871)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:128)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:261:0x0580 A[Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:264:0x058d A[Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:271:0x05a0 A[Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:308:0x0615 A[Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:477:0x08eb A[Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:484:0x090d A[Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:486:0x0916 A[Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:487:0x0919 A[Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:490:0x0924 A[Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:665:0x0720 A[SYNTHETIC] */
    public boolean handleMessage(android.os.Message r43) {
        /*
            r42 = this;
            r0 = r42
            java.lang.String r18 = "Playback error"
            java.lang.String r17 = "ExoPlayerImplInternal"
            r4 = 0
            r1 = 1
            r5 = r43
            int r2 = r5.what     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            switch(r2) {
                case 0: goto L_0x043b;
                case 1: goto L_0x0010;
                case 2: goto L_0x0497;
                case 3: goto L_0x001d;
                case 4: goto L_0x017d;
                case 5: goto L_0x0191;
                case 6: goto L_0x0199;
                case 7: goto L_0x0a93;
                case 8: goto L_0x019e;
                case 9: goto L_0x0229;
                case 10: goto L_0x0abd;
                case 11: goto L_0x0245;
                case 12: goto L_0x0259;
                case 13: goto L_0x027e;
                case 14: goto L_0x02b9;
                case 15: goto L_0x02e4;
                case 16: goto L_0x0318;
                case 17: goto L_0x0323;
                case 18: goto L_0x035f;
                case 19: goto L_0x0271;
                case 20: goto L_0x0382;
                case 21: goto L_0x03b0;
                case 22: goto L_0x0bb6;
                case 23: goto L_0x03da;
                case 24: goto L_0x03f9;
                case 25: goto L_0x0424;
                default: goto L_0x000f;
            }     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
        L_0x000f:
            return r4
        L_0x0010:
            int r2 = r5.arg1     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            boolean r3 = X.AnonymousClass000.A1O(r2)
            int r2 = r5.arg2     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r0.A0I(r2, r1, r3, r1)     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            goto L_0x0bbf
        L_0x001d:
            java.lang.Object r10 = r5.obj     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.4JQ r10 = (X.AnonymousClass4JQ) r10     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.4V3 r2 = r0.A05     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r15 = 1
            r2.A00(r1)     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.4df r2 = r0.A07     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            com.google.android.exoplayer2.Timeline r6 = r2.A05     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            int r5 = r0.A02     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            boolean r3 = r0.A0I     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.4by r2 = r0.A0T     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.4XE r11 = r0.A0S     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r19 = r10
            r20 = r11
            r21 = r2
            r22 = r6
            r23 = r5
            r24 = r3
            android.util.Pair r9 = A00(r19, r20, r21, r22, r23, r24)     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r13 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r9 != 0) goto L_0x0072
            X.4df r2 = r0.A07     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            com.google.android.exoplayer2.Timeline r2 = r2.A05     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            android.util.Pair r2 = r0.A08(r2)     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            java.lang.Object r7 = r2.first     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.1c3 r7 = (X.C30271c3) r7     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            java.lang.Object r2 = r2.second     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            java.lang.Long r2 = (java.lang.Long) r2     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            long r2 = r2.longValue()     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.4df r5 = r0.A07     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            com.google.android.exoplayer2.Timeline r5 = r5.A05     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            int r5 = r5.A01()     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            boolean r5 = X.AnonymousClass000.A1P(r5)     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r13 = r5 ^ 1
            r24 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x00ac
        L_0x0072:
            java.lang.Object r12 = r9.first     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            java.lang.Object r2 = r9.second     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            java.lang.Long r2 = (java.lang.Long) r2     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            long r2 = r2.longValue()     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            long r5 = r10.A01     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            int r7 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r7 != 0) goto L_0x0088
            r24 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x008a
        L_0x0088:
            r24 = r2
        L_0x008a:
            X.4XV r8 = r0.A0Q     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.4df r7 = r0.A07     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            com.google.android.exoplayer2.Timeline r7 = r7.A05     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.1c3 r7 = r8.A05(r7, r12, r2)     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            boolean r8 = r7.A00()     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            if (r8 == 0) goto L_0x00a6
            X.4df r2 = r0.A07     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            com.google.android.exoplayer2.Timeline r3 = r2.A05     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            java.lang.Object r2 = r7.A04     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r3.A09(r11, r2)     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r2 = 0
            goto L_0x00ab
        L_0x00a6:
            int r8 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            r13 = 0
            if (r8 != 0) goto L_0x00ac
        L_0x00ab:
            r13 = 1
        L_0x00ac:
            r8 = 2
            X.4df r11 = r0.A07     // Catch:{ all -> 0x0165 }
            com.google.android.exoplayer2.Timeline r5 = r11.A05     // Catch:{ all -> 0x0165 }
            int r5 = r5.A01()     // Catch:{ all -> 0x0165 }
            boolean r5 = X.AnonymousClass000.A1P(r5)     // Catch:{ all -> 0x0165 }
            if (r5 == 0) goto L_0x00be
            r0.A06 = r10     // Catch:{ all -> 0x00ed }
            goto L_0x010f
        L_0x00be:
            r6 = 4
            if (r9 != 0) goto L_0x00cc
            int r5 = r11.A00     // Catch:{ all -> 0x00ed }
            if (r5 == r1) goto L_0x00c8
            r0.A0H(r6)     // Catch:{ all -> 0x00ed }
        L_0x00c8:
            r0.A0T(r4, r1, r4, r1)     // Catch:{ all -> 0x00ed }
            goto L_0x010f
        L_0x00cc:
            X.1c3 r5 = r11.A07     // Catch:{ all -> 0x0165 }
            boolean r5 = r7.equals(r5)     // Catch:{ all -> 0x0165 }
            if (r5 == 0) goto L_0x0113
            X.4XV r5 = r0.A0Q     // Catch:{ all -> 0x0165 }
            X.4X7 r6 = r5.A05     // Catch:{ all -> 0x0165 }
            if (r6 == 0) goto L_0x00f2
            boolean r5 = r6.A07     // Catch:{ all -> 0x00ed }
            if (r5 == 0) goto L_0x00f2
            r9 = 0
            int r5 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r5 == 0) goto L_0x00f2
            X.0qH r6 = r6.A09     // Catch:{ all -> 0x00ed }
            X.4bF r5 = r0.A08     // Catch:{ all -> 0x00ed }
            long r28 = r6.A9p(r5, r2)     // Catch:{ all -> 0x00ed }
            goto L_0x00f4
        L_0x00ed:
            r6 = move-exception
            r28 = r2
            r5 = 2
            goto L_0x0169
        L_0x00f2:
            r28 = r2
        L_0x00f4:
            long r11 = X.C90604eR.A02(r28)     // Catch:{ all -> 0x0165 }
            X.4df r5 = r0.A07     // Catch:{ all -> 0x0165 }
            long r5 = r5.A0G     // Catch:{ all -> 0x0165 }
            long r9 = X.C90604eR.A02(r5)     // Catch:{ all -> 0x0165 }
            int r5 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r5 != 0) goto L_0x0111
            X.4df r9 = r0.A07     // Catch:{ all -> 0x0165 }
            int r6 = r9.A00     // Catch:{ all -> 0x0165 }
            if (r6 == r8) goto L_0x010d
            r5 = 3
            if (r6 != r5) goto L_0x0111
        L_0x010d:
            long r2 = r9.A0G     // Catch:{ all -> 0x0165 }
        L_0x010f:
            r5 = 2
            goto L_0x014d
        L_0x0111:
            r5 = 2
            goto L_0x0116
        L_0x0113:
            r5 = 2
            r28 = r2
        L_0x0116:
            X.4df r6 = r0.A07     // Catch:{ all -> 0x0163 }
            int r8 = r6.A00     // Catch:{ all -> 0x0163 }
            r6 = 4
            boolean r31 = X.AnonymousClass000.A1R(r8, r6)
            X.4XV r6 = r0.A0Q     // Catch:{ all -> 0x0163 }
            X.4X7 r8 = r6.A05     // Catch:{ all -> 0x0163 }
            X.4X7 r6 = r6.A06     // Catch:{ all -> 0x0163 }
            boolean r30 = X.C13680ns.A1a(r8, r6)
            r26 = r0
            r27 = r7
            long r28 = r26.A07(r27, r28, r30, r31)     // Catch:{ all -> 0x0163 }
            int r6 = (r2 > r28 ? 1 : (r2 == r28 ? 0 : -1))
            if (r6 != 0) goto L_0x0136
            r15 = 0
        L_0x0136:
            r15 = r15 | r13
            X.4df r2 = r0.A07     // Catch:{ all -> 0x0160 }
            com.google.android.exoplayer2.Timeline r3 = r2.A05     // Catch:{ all -> 0x0160 }
            X.1c3 r2 = r2.A07     // Catch:{ all -> 0x0160 }
            r21 = r3
            r19 = r0
            r20 = r3
            r22 = r7
            r23 = r2
            r19.A0O(r20, r21, r22, r23, r24)     // Catch:{ all -> 0x0160 }
            r13 = r15
            r2 = r28
        L_0x014d:
            r6 = r0
            r8 = r2
            r10 = r24
            X.4df r2 = r6.A09(r7, r8, r10)     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r0.A07 = r2     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            if (r13 == 0) goto L_0x0bbf
            X.4V3 r2 = r0.A05     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r2.A01(r5)     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            goto L_0x0bbf
        L_0x0160:
            r6 = move-exception
            r13 = r15
            goto L_0x0169
        L_0x0163:
            r6 = move-exception
            goto L_0x0167
        L_0x0165:
            r6 = move-exception
            r5 = 2
        L_0x0167:
            r28 = r2
        L_0x0169:
            r26 = r0
            r27 = r7
            r30 = r24
            X.4df r2 = r26.A09(r27, r28, r30)     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r0.A07 = r2     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            if (r13 == 0) goto L_0x017c
            X.4V3 r2 = r0.A05     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r2.A01(r5)     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
        L_0x017c:
            throw r6     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
        L_0x017d:
            java.lang.Object r3 = r5.obj     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.4bm r3 = (X.C89214bm) r3     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.4qW r2 = r0.A0M     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r2.AeL(r3)     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.4bm r3 = r2.AF4()     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            float r2 = r3.A01     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r0.A0K(r3, r2, r1, r1)     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            goto L_0x0bbf
        L_0x0191:
            java.lang.Object r2 = r5.obj     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.4bF r2 = (X.C88884bF) r2     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r0.A08 = r2     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            goto L_0x0bbf
        L_0x0199:
            r0.A0S(r4, r1)     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            goto L_0x0bbf
        L_0x019e:
            java.lang.Object r3 = r5.obj     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.0qH r3 = (X.C15070qH) r3     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.4XV r10 = r0.A0Q     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.4X7 r9 = r10.A04     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            if (r9 == 0) goto L_0x0bbf
            X.0qH r2 = r9.A09     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            if (r2 != r3) goto L_0x0bbf
            X.4qW r2 = r0.A0M     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r2.AF4()     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r9.A07 = r1     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.0qH r2 = r9.A09     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.4jT r2 = r2.AGe()     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r9.A03 = r2     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.4LY r20 = r9.A02()     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.4Wv r2 = r9.A02     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            long r5 = r2.A03     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            long r2 = r2.A00     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r7 == 0) goto L_0x01db
            int r7 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r7 < 0) goto L_0x01db
            r5 = 0
            r7 = 1
            long r2 = r2 - r7
            long r5 = java.lang.Math.max(r5, r2)     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
        L_0x01db:
            X.5SK[] r2 = r9.A0C     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            int r2 = r2.length     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            boolean[] r2 = new boolean[r2]     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r24 = 0
            r19 = r9
            r21 = r2
            r22 = r5
            long r5 = r19.A01(r20, r21, r22, r24)     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            long r7 = r9.A00     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.4Wv r11 = r9.A02     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            long r2 = r11.A03     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            long r2 = r2 - r5
            long r7 = r7 + r2
            r9.A00 = r7     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.4Wv r2 = r11.A01(r5)     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r9.A02 = r2     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.4LY r2 = r9.A04     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r0.A0P(r2)     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.4X7 r2 = r10.A05     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            if (r9 != r2) goto L_0x0240
            X.4Wv r2 = r9.A02     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            long r2 = r2.A03     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r0.A0J(r2)     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.5UO[] r2 = r0.A0a     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            int r2 = r2.length     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            boolean[] r2 = new boolean[r2]     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r0.A0U(r2)     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.4df r3 = r0.A07     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.1c3 r7 = r3.A07     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.4Wv r2 = r9.A02     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            long r5 = r2.A03     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            long r2 = r3.A02     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r8 = r0
            r9 = r7
            r10 = r5
            r12 = r2
            X.4df r2 = r8.A09(r9, r10, r12)     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r0.A07 = r2     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            goto L_0x0240
        L_0x0229:
            java.lang.Object r5 = r5.obj     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.0qH r5 = (X.C15070qH) r5     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.4XV r2 = r0.A0Q     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.4X7 r3 = r2.A04     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            if (r3 == 0) goto L_0x0bbf
            X.0qH r2 = r3.A09     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            if (r2 != r5) goto L_0x0bbf
            X.4X7 r2 = r3.A01     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            boolean r2 = X.AnonymousClass000.A1W(r2)
            X.C90524eJ.A04(r2)     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
        L_0x0240:
            r0.A0A()     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            goto L_0x0bbf
        L_0x0245:
            int r5 = r5.arg1     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r0.A02 = r5     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.4XV r3 = r0.A0Q     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.4df r2 = r0.A07     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            com.google.android.exoplayer2.Timeline r2 = r2.A05     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r3.A01 = r5     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            boolean r2 = r3.A09(r2)     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            if (r2 != 0) goto L_0x03f4
            goto L_0x03f1
        L_0x0259:
            int r2 = r5.arg1     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            boolean r5 = X.AnonymousClass000.A1O(r2)
            r0.A0I = r5     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.4XV r3 = r0.A0Q     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.4df r2 = r0.A07     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            com.google.android.exoplayer2.Timeline r2 = r2.A05     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r3.A08 = r5     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            boolean r2 = r3.A09(r2)     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            if (r2 != 0) goto L_0x03f4
            goto L_0x03f1
        L_0x0271:
            X.4V3 r2 = r0.A05     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r2.A00(r1)     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            java.lang.String r2 = "fromIndex"
            java.lang.NullPointerException r2 = X.AnonymousClass000.A0W(r2)     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            goto L_0x0abc
        L_0x027e:
            int r2 = r5.arg1     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            boolean r3 = X.AnonymousClass000.A1O(r2)
            java.lang.Object r8 = r5.obj     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            java.util.concurrent.atomic.AtomicBoolean r8 = (java.util.concurrent.atomic.AtomicBoolean) r8     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            boolean r2 = r0.A0A     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            if (r2 == r3) goto L_0x02a9
            r0.A0A = r3     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            if (r3 != 0) goto L_0x02a9
            X.5UO[] r7 = r0.A0a     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            int r6 = r7.length     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r5 = 0
        L_0x0294:
            if (r5 >= r6) goto L_0x02a9
            r3 = r7[r5]     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r2 = r3
            X.4o1 r2 = (X.C96244o1) r2     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            int r2 = r2.A01     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            boolean r2 = X.AnonymousClass000.A1O(r2)     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            if (r2 != 0) goto L_0x02a6
            r3.reset()     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
        L_0x02a6:
            int r5 = r5 + 1
            goto L_0x0294
        L_0x02a9:
            if (r8 == 0) goto L_0x0bbf
            monitor-enter(r0)     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r8.set(r1)     // Catch:{ all -> 0x02b5 }
            r0.notifyAll()     // Catch:{ all -> 0x02b5 }
            monitor-exit(r0)     // Catch:{ all -> 0x02b5 }
            goto L_0x0bbf
        L_0x02b5:
            r2 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x02b5 }
            goto L_0x0abc
        L_0x02b9:
            java.lang.Object r5 = r5.obj     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.4VB r5 = (X.AnonymousClass4VB) r5     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            android.os.Looper r3 = r5.A01     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            android.os.Looper r2 = r0.A0L     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            if (r3 != r2) goto L_0x02db
            A02(r5)     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.4df r2 = r0.A07     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            int r5 = r2.A00     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r2 = 3
            r3 = 2
            if (r5 == r2) goto L_0x02d0
            if (r5 != r3) goto L_0x0bbf
        L_0x02d0:
            X.5La r2 = r0.A0Y     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.4qO r2 = (X.C97684qO) r2     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            android.os.Handler r2 = r2.A00     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r2.sendEmptyMessage(r3)     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            goto L_0x0bbf
        L_0x02db:
            X.5La r3 = r0.A0Y     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r2 = 15
            X.C97684qO.A00(r3, r2, r5)     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            goto L_0x0bbf
        L_0x02e4:
            java.lang.Object r6 = r5.obj     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.4VB r6 = (X.AnonymousClass4VB) r6     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            android.os.Looper r5 = r6.A01     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            java.lang.Thread r2 = r5.getThread()     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            boolean r2 = r2.isAlive()     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            if (r2 != 0) goto L_0x0300
            java.lang.String r3 = "TAG"
            java.lang.String r2 = "Trying to send message on a dead thread."
            android.util.Log.w(r3, r2)     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r6.A01(r4)     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            goto L_0x0bbf
        L_0x0300:
            r3 = 0
            android.os.Handler r2 = new android.os.Handler     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r2.<init>(r5, r3)     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.4qO r5 = new X.4qO     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r5.<init>(r2)     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r2 = 5
            com.facebook.redex.RunnableRunnableShape12S0200000_I1 r3 = new com.facebook.redex.RunnableRunnableShape12S0200000_I1     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r3.<init>(r0, r2, r6)     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            android.os.Handler r2 = r5.A00     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r2.post(r3)     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            goto L_0x0bbf
        L_0x0318:
            java.lang.Object r3 = r5.obj     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.4bm r3 = (X.C89214bm) r3     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            float r2 = r3.A01     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r0.A0K(r3, r2, r1, r4)     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            goto L_0x0bbf
        L_0x0323:
            java.lang.Object r8 = r5.obj     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.4LO r8 = (X.AnonymousClass4LO) r8     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.4V3 r2 = r0.A05     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r2.A00(r1)     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            int r7 = r8.A00     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r2 = -1
            if (r7 == r2) goto L_0x0343
            java.util.List r3 = r8.A03     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.5TE r2 = r8.A02     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.3UE r6 = new X.3UE     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r6.<init>(r2, r3)     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            long r2 = r8.A01     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.4JQ r5 = new X.4JQ     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r5.<init>(r6, r7, r2)     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r0.A06 = r5     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
        L_0x0343:
            X.4XK r7 = r0.A0R     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            java.util.List r6 = r8.A03     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.5TE r5 = r8.A02     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            java.util.List r3 = r7.A08     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            int r2 = r3.size()     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r7.A03(r4, r2)     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            int r2 = r3.size()     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            com.google.android.exoplayer2.Timeline r2 = r7.A01(r5, r6, r2)     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r0.A0M(r2)     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            goto L_0x0bbf
        L_0x035f:
            java.lang.Object r7 = r5.obj     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.4LO r7 = (X.AnonymousClass4LO) r7     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            int r6 = r5.arg1     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.4V3 r2 = r0.A05     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r2.A00(r1)     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.4XK r5 = r0.A0R     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r2 = -1
            if (r6 != r2) goto L_0x0375
            java.util.List r2 = r5.A08     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            int r6 = r2.size()     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
        L_0x0375:
            java.util.List r3 = r7.A03     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.5TE r2 = r7.A02     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            com.google.android.exoplayer2.Timeline r2 = r5.A01(r2, r3, r6)     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r0.A0M(r2)     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            goto L_0x0bbf
        L_0x0382:
            int r8 = r5.arg1     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            int r7 = r5.arg2     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            java.lang.Object r6 = r5.obj     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.5TE r6 = (X.AnonymousClass5TE) r6     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.4V3 r2 = r0.A05     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r2.A00(r1)     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.4XK r5 = r0.A0R     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            if (r8 < 0) goto L_0x039e
            if (r8 > r7) goto L_0x039e
            java.util.List r2 = r5.A08     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            int r3 = r2.size()     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r2 = 1
            if (r7 <= r3) goto L_0x039f
        L_0x039e:
            r2 = 0
        L_0x039f:
            X.C90524eJ.A03(r2)     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r5.A00 = r6     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r5.A03(r8, r7)     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            com.google.android.exoplayer2.Timeline r2 = r5.A00()     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r0.A0M(r2)     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            goto L_0x0bbf
        L_0x03b0:
            java.lang.Object r6 = r5.obj     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.5TE r6 = (X.AnonymousClass5TE) r6     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.4V3 r2 = r0.A05     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r2.A00(r1)     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.4XK r5 = r0.A0R     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            java.util.List r2 = r5.A08     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            int r3 = r2.size()     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            int r2 = r6.getLength()     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            if (r2 == r3) goto L_0x03cf
            X.5TE r2 = r6.A6I()     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.5TE r6 = r2.A6J(r4, r3)     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
        L_0x03cf:
            r5.A00 = r6     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            com.google.android.exoplayer2.Timeline r2 = r5.A00()     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r0.A0M(r2)     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            goto L_0x0bbf
        L_0x03da:
            int r2 = r5.arg1     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            boolean r2 = X.AnonymousClass000.A1O(r2)
            r0.A0D = r2     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r0.A0C()     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            boolean r2 = r0.A0E     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            if (r2 == 0) goto L_0x0bbf
            X.4XV r2 = r0.A0Q     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.4X7 r3 = r2.A06     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.4X7 r2 = r2.A05     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            if (r3 == r2) goto L_0x0bbf
        L_0x03f1:
            r0.A0R(r1)     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
        L_0x03f4:
            r0.A0Q(r4)     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            goto L_0x0bbf
        L_0x03f9:
            int r2 = r5.arg1     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            boolean r6 = X.AnonymousClass000.A1R(r2, r1)
            boolean r2 = r0.A0C     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            if (r6 == r2) goto L_0x0bbf
            r0.A0C = r6     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.4df r5 = r0.A07     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            int r3 = r5.A00     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            if (r6 != 0) goto L_0x041c
            r2 = 4
            if (r3 == r2) goto L_0x041c
            if (r3 == r1) goto L_0x041c
            X.5La r2 = r0.A0Y     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r3 = 2
            X.4qO r2 = (X.C97684qO) r2     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            android.os.Handler r2 = r2.A00     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r2.sendEmptyMessage(r3)     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            goto L_0x0bbf
        L_0x041c:
            X.4df r2 = r5.A08(r6)     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r0.A07 = r2     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            goto L_0x0bbf
        L_0x0424:
            java.lang.Object r5 = r5.obj     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.43y r5 = (X.C804643y) r5     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            boolean r2 = r5.isRecoverable     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            if (r2 == 0) goto L_0x0431
            int r3 = r5.type     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r2 = 1
            if (r3 == r1) goto L_0x0432
        L_0x0431:
            r2 = 0
        L_0x0432:
            X.C90524eJ.A03(r2)     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r0.A0R(r1)     // Catch:{ Exception -> 0x043a }
            goto L_0x0bbf
        L_0x043a:
            throw r5     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
        L_0x043b:
            X.4V3 r2 = r0.A05     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r2.A00(r1)     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r0.A0T(r4, r4, r4, r1)     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.5L7 r3 = r0.A0P     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.4nv r3 = (X.C96184nv) r3     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r2 = 13107200(0xc80000, float:1.8367099E-38)
            r3.A00 = r2     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r6 = 0
            r3.A01 = r4     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.4df r2 = r0.A07     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            com.google.android.exoplayer2.Timeline r2 = r2.A05     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            int r2 = r2.A01()     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            boolean r3 = X.AnonymousClass000.A1P(r2)     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r2 = 2
            if (r3 == 0) goto L_0x045e
            r2 = 4
        L_0x045e:
            r0.A0H(r2)     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.4XK r5 = r0.A0R     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.5LX r3 = r0.A0W     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.3E2 r3 = (X.AnonymousClass3E2) r3     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            boolean r2 = r5.A02     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r2 = r2 ^ 1
            X.C90524eJ.A04(r2)     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r5.A01 = r3     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
        L_0x0470:
            java.util.List r3 = r5.A08     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            int r2 = r3.size()     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            if (r6 >= r2) goto L_0x0489
            java.lang.Object r3 = r3.get(r6)     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.4nx r3 = (X.C96204nx) r3     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r5.A05(r3)     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            java.util.Set r2 = r5.A0A     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r2.add(r3)     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            int r6 = r6 + 1
            goto L_0x0470
        L_0x0489:
            r5.A02 = r1     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.5La r2 = r0.A0Y     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r3 = 2
            X.4qO r2 = (X.C97684qO) r2     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            android.os.Handler r2 = r2.A00     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r2.sendEmptyMessage(r3)     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            goto L_0x0bbf
        L_0x0497:
            long r15 = android.os.SystemClock.uptimeMillis()     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.4df r2 = r0.A07     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            com.google.android.exoplayer2.Timeline r2 = r2.A05     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            int r2 = r2.A01()     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            boolean r2 = X.AnonymousClass000.A1P(r2)     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            if (r2 != 0) goto L_0x079f
            X.4XK r7 = r0.A0R     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            boolean r2 = r7.A02     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            if (r2 == 0) goto L_0x079f
            X.4XV r9 = r0.A0Q     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.4X7 r6 = r9.A04     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            if (r6 == 0) goto L_0x04be
            X.4X7 r2 = r6.A01     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            boolean r2 = X.AnonymousClass000.A1W(r2)
            X.C90524eJ.A04(r2)     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
        L_0x04be:
            if (r6 == 0) goto L_0x04ef
            X.4Wv r2 = r6.A02     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            boolean r2 = r2.A05     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            if (r2 != 0) goto L_0x057c
            boolean r2 = r6.A07     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            if (r2 == 0) goto L_0x057c
            boolean r2 = r6.A06     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            if (r2 == 0) goto L_0x04da
            X.0qH r2 = r6.A09     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            long r10 = r2.AAG()     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r5 = -9223372036854775808
            int r2 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r2 != 0) goto L_0x057c
        L_0x04da:
            X.4X7 r6 = r9.A04     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.4Wv r2 = r6.A02     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            long r2 = r2.A00     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r5 == 0) goto L_0x057c
            int r3 = r9.A00     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r2 = 100
            if (r3 >= r2) goto L_0x057c
        L_0x04ef:
            long r2 = r0.A03     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.4df r11 = r0.A07     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            if (r6 != 0) goto L_0x050c
            com.google.android.exoplayer2.Timeline r10 = r11.A05     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.1c3 r8 = r11.A07     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            long r5 = r11.A02     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            long r2 = r11.A0G     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r19 = r9
            r20 = r10
            r21 = r8
            r22 = r5
            r24 = r2
            X.4Wv r13 = r19.A03(r20, r21, r22, r24)     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            goto L_0x0512
        L_0x050c:
            com.google.android.exoplayer2.Timeline r5 = r11.A05     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.4Wv r13 = r9.A01(r6, r5, r2)     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
        L_0x0512:
            if (r13 == 0) goto L_0x057c
            X.5SK[] r14 = r0.A0b     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.4GL r12 = r0.A0U     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.5L7 r2 = r0.A0P     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.4nv r2 = (X.C96184nv) r2     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.4qD r11 = r2.A07     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.4LY r10 = r0.A0V     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.4X7 r2 = r9.A04     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            if (r2 != 0) goto L_0x05ac
            X.1c3 r2 = r13.A04     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            boolean r2 = r2.A00()     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            if (r2 == 0) goto L_0x05a9
            long r5 = r13.A02     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r19 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r5 > r19 ? 1 : (r5 == r19 ? 0 : -1))
            if (r2 == 0) goto L_0x05a9
        L_0x0537:
            X.4X7 r8 = new X.4X7     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r19 = r8
            r20 = r13
            r21 = r7
            r22 = r12
            r23 = r10
            r24 = r11
            r25 = r14
            r26 = r5
            r19.<init>(r20, r21, r22, r23, r24, r25, r26)     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.4X7 r3 = r9.A04     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            if (r3 == 0) goto L_0x05a4
            X.4X7 r2 = r3.A01     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            if (r8 == r2) goto L_0x0556
            r3.A01 = r8     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
        L_0x0556:
            r2 = 0
            r9.A07 = r2     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r9.A04 = r8     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            int r2 = r9.A00     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            int r2 = r2 + 1
            r9.A00 = r2     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r9.A07()     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.0qH r5 = r8.A09     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            long r2 = r13.A03     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r5.Aal(r0, r2)     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.4X7 r2 = r9.A05     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            if (r2 != r8) goto L_0x0579
            X.4Wv r2 = r8.A02     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            long r2 = r2.A03     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            long r5 = r8.A00     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            long r2 = r2 + r5
            r0.A0J(r2)     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
        L_0x0579:
            r0.A0Q(r4)     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
        L_0x057c:
            boolean r2 = r0.A0H     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            if (r2 == 0) goto L_0x05a0
            boolean r2 = r0.A0V()     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r0.A0H = r2     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r0.A0F()     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
        L_0x0589:
            X.4X7 r8 = r9.A06     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            if (r8 == 0) goto L_0x0600
            X.4X7 r13 = r8.A01     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r19 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r10 = 0
            if (r13 == 0) goto L_0x05ba
            boolean r2 = r0.A0E     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            if (r2 != 0) goto L_0x05ba
            boolean r2 = r8.A07     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            if (r2 == 0) goto L_0x0600
            goto L_0x05b7
        L_0x05a0:
            r0.A0A()     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            goto L_0x0589
        L_0x05a4:
            r9.A05 = r8     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r9.A06 = r8     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            goto L_0x0556
        L_0x05a9:
            r5 = 0
            goto L_0x0537
        L_0x05ac:
            long r5 = r2.A00     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.4Wv r2 = r2.A02     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            long r2 = r2.A00     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            long r5 = r5 + r2
            long r2 = r13.A03     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            long r5 = r5 - r2
            goto L_0x0537
        L_0x05b7:
            r3 = 0
            goto L_0x0689
        L_0x05ba:
            X.4Wv r11 = r8.A02     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            boolean r2 = r11.A05     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            if (r2 != 0) goto L_0x05c4
            boolean r2 = r0.A0E     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            if (r2 == 0) goto L_0x0600
        L_0x05c4:
            X.5UO[] r3 = r0.A0a     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            int r2 = r3.length     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            if (r10 >= r2) goto L_0x0600
            r7 = r3[r10]     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.5Sm[] r2 = r8.A0D     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r3 = r2[r10]     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            if (r3 == 0) goto L_0x05f7
            r2 = r7
            X.4o1 r2 = (X.C96244o1) r2     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.5Sm r2 = r2.A05     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            if (r2 != r3) goto L_0x05f7
            boolean r2 = r7.AHf()     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            if (r2 == 0) goto L_0x05f7
            long r5 = r11.A00     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            int r2 = (r5 > r19 ? 1 : (r5 == r19 ? 0 : -1))
            if (r2 == 0) goto L_0x05eb
            r12 = -9223372036854775808
            int r2 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r2 == 0) goto L_0x05eb
            goto L_0x05f1
        L_0x05eb:
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x05f4
        L_0x05f1:
            long r2 = r8.A00     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            long r2 = r2 + r5
        L_0x05f4:
            A03(r7, r2)     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
        L_0x05f7:
            int r10 = r10 + 1
            goto L_0x05c4
        L_0x05fa:
            boolean r2 = r6.AHf()     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            if (r2 != 0) goto L_0x0687
        L_0x0600:
            X.4X7 r13 = r9.A06     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            if (r13 == 0) goto L_0x0729
            X.4X7 r2 = r9.A05     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            if (r2 == r13) goto L_0x0729
            boolean r2 = r13.A05     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            if (r2 != 0) goto L_0x0729
            X.4LY r12 = r13.A04     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r11 = 0
            r14 = 0
        L_0x0610:
            X.5UO[] r2 = r0.A0a     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            int r3 = r2.length     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            if (r11 >= r3) goto L_0x0720
            r3 = r2[r11]     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r2 = r3
            X.4o1 r2 = (X.C96244o1) r2     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            int r2 = r2.A01     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            boolean r2 = X.AnonymousClass000.A1O(r2)     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            if (r2 == 0) goto L_0x0637
            r10 = r3
            X.4o1 r10 = (X.C96244o1) r10     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.5Sm r5 = r10.A05     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.5Sm[] r6 = r13.A0D     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r2 = r6[r11]     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            boolean r5 = X.C13680ns.A1a(r5, r2)
            X.4bE[] r2 = r12.A02     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r2 = r2[r11]     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            if (r2 == 0) goto L_0x063a
            if (r5 != 0) goto L_0x063a
        L_0x0637:
            int r11 = r11 + 1
            goto L_0x0610
        L_0x063a:
            boolean r2 = r10.A06     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            if (r2 != 0) goto L_0x067b
            X.5UR[] r2 = r12.A03     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r7 = r2[r11]     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r5 = 0
            if (r7 == 0) goto L_0x064e
            r2 = r7
            X.4qB r2 = (X.C97554qB) r2     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            int[] r2 = r2.A03     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            int r3 = r2.length     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
        L_0x064b:
            X.1gT[] r8 = new X.C32491gT[r3]     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            goto L_0x0650
        L_0x064e:
            r3 = 0
            goto L_0x064b
        L_0x0650:
            if (r5 >= r3) goto L_0x065e
            r2 = r7
            X.4qB r2 = (X.C97554qB) r2     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.1gT[] r2 = r2.A04     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r2 = r2[r5]     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r8[r5] = r2     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            int r5 = r5 + 1
            goto L_0x0650
        L_0x065e:
            r7 = r6[r11]     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.4Wv r2 = r13.A02     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            long r5 = r2.A03     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            long r2 = r13.A00     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            long r5 = r5 + r2
            r10.A05 = r7     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r10.A02 = r2     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r10.A08 = r8     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r10.A03 = r2     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r19 = r10
            r20 = r8
            r21 = r5
            r23 = r2
            r19.A04(r20, r21, r23)     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            goto L_0x0637
        L_0x067b:
            boolean r2 = r3.AIm()     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            if (r2 == 0) goto L_0x0685
            r0.A0L(r3)     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            goto L_0x0637
        L_0x0685:
            r14 = 1
            goto L_0x0637
        L_0x0687:
            int r3 = r3 + 1
        L_0x0689:
            X.5UO[] r7 = r0.A0a     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            int r12 = r7.length     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            if (r3 >= r12) goto L_0x069f
            r6 = r7[r3]     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.5Sm[] r2 = r8.A0D     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r5 = r2[r3]     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r2 = r6
            X.4o1 r2 = (X.C96244o1) r2     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.5Sm r2 = r2.A05     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            if (r2 != r5) goto L_0x0600
            if (r5 == 0) goto L_0x0687
            goto L_0x05fa
        L_0x069f:
            boolean r2 = r13.A07     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            if (r2 != 0) goto L_0x06b2
            long r10 = r0.A03     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.4Wv r2 = r13.A02     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            long r2 = r2.A03     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            long r5 = r13.A00     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            long r2 = r2 + r5
            int r5 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r5 >= 0) goto L_0x06b2
            goto L_0x0600
        L_0x06b2:
            X.4LY r14 = r8.A04     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.C90524eJ.A04(r1)     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r9.A06 = r13     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r9.A07()     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.4X7 r13 = r9.A06     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.4LY r11 = r13.A04     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            boolean r2 = r13.A07     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            if (r2 == 0) goto L_0x06e7
            X.0qH r2 = r13.A09     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            long r5 = r2.AbU()     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            int r2 = (r5 > r19 ? 1 : (r5 == r19 ? 0 : -1))
            if (r2 == 0) goto L_0x06e7
            X.4Wv r2 = r13.A02     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            long r2 = r2.A03     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            long r5 = r13.A00     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            long r2 = r2 + r5
            r8 = 0
        L_0x06d6:
            if (r8 >= r12) goto L_0x0600
            r6 = r7[r8]     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r5 = r6
            X.4o1 r5 = (X.C96244o1) r5     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.5Sm r5 = r5.A05     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            if (r5 == 0) goto L_0x06e4
            A03(r6, r2)     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
        L_0x06e4:
            int r8 = r8 + 1
            goto L_0x06d6
        L_0x06e7:
            r10 = 0
        L_0x06e8:
            if (r10 >= r12) goto L_0x0600
            X.4bE[] r5 = r14.A02     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r2 = r5[r10]     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            boolean r8 = X.AnonymousClass000.A1V(r2)
            X.4bE[] r3 = r11.A02     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r2 = r3[r10]     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            boolean r6 = X.AnonymousClass000.A1V(r2)
            if (r8 == 0) goto L_0x071d
            r2 = r7[r10]     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.4o1 r2 = (X.C96244o1) r2     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            boolean r2 = r2.A06     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            if (r2 != 0) goto L_0x071d
            r2 = r5[r10]     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r3 = r3[r10]     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            if (r6 == 0) goto L_0x0711
            boolean r2 = r3.equals(r2)     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            if (r2 == 0) goto L_0x0711
            goto L_0x071d
        L_0x0711:
            r8 = r7[r10]     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.4Wv r2 = r13.A02     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            long r5 = r2.A03     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            long r2 = r13.A00     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            long r5 = r5 + r2
            A03(r8, r5)     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
        L_0x071d:
            int r10 = r10 + 1
            goto L_0x06e8
        L_0x0720:
            r2 = r14 ^ 1
            if (r2 == 0) goto L_0x0729
            boolean[] r2 = new boolean[r3]     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r0.A0U(r2)     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
        L_0x0729:
            r11 = 0
        L_0x072a:
            boolean r2 = r0.A0X()     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            if (r2 == 0) goto L_0x079f
            boolean r2 = r0.A0E     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            if (r2 != 0) goto L_0x079f
            X.4X7 r2 = r9.A05     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            if (r2 == 0) goto L_0x079f
            X.4X7 r10 = r2.A01     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            if (r10 == 0) goto L_0x079f
            long r7 = r0.A03     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.4Wv r2 = r10.A02     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            long r5 = r2.A03     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            long r2 = r10.A00     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            long r5 = r5 + r2
            int r2 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r2 < 0) goto L_0x079f
            boolean r2 = r10.A05     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            if (r2 == 0) goto L_0x079f
            if (r11 == 0) goto L_0x0752
            r0.A0B()     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
        L_0x0752:
            X.4X7 r7 = r9.A05     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.4X7 r8 = r9.A00()     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.4Wv r2 = r8.A02     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.1c3 r10 = r2.A04     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            long r5 = r2.A03     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            long r2 = r2.A02     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r19 = r0
            r20 = r10
            r21 = r5
            r23 = r2
            X.4df r2 = r19.A09(r20, r21, r23)     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r0.A07 = r2     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.4Wv r2 = r7.A02     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            boolean r2 = r2.A06     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r3 = 3
            if (r2 == 0) goto L_0x0776
            r3 = 0
        L_0x0776:
            X.4V3 r2 = r0.A05     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r2.A01(r3)     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.4df r2 = r0.A07     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            com.google.android.exoplayer2.Timeline r5 = r2.A05     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.4Wv r2 = r8.A02     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.1c3 r3 = r2.A04     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.4Wv r2 = r7.A02     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.1c3 r2 = r2.A04     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r24 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r21 = r5
            r20 = r5
            r22 = r3
            r23 = r2
            r19.A0O(r20, r21, r22, r23, r24)     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r0.A0C()     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r0.A0G()     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r11 = 1
            goto L_0x072a
        L_0x079f:
            X.4df r2 = r0.A07     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            int r3 = r2.A00     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            if (r3 == r1) goto L_0x0a87
            r2 = 4
            if (r3 == r2) goto L_0x0a87
            X.4XV r11 = r0.A0Q     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.4X7 r9 = r11.A05     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            if (r9 != 0) goto L_0x07c1
            r7 = 10
            X.5La r2 = r0.A0Y     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.4qO r2 = (X.C97684qO) r2     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r6 = 2
            android.os.Handler r5 = r2.A00     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r5.removeMessages(r6)     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            long r15 = r15 + r7
            r2 = r15
            r5.sendEmptyMessageAtTime(r6, r2)     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            goto L_0x0bbf
        L_0x07c1:
            java.lang.String r2 = "doSomeWork"
            X.C90224dm.A02(r2)     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r0.A0G()     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            boolean r5 = r9.A07     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r2 = 1000(0x3e8, double:4.94E-321)
            if (r5 == 0) goto L_0x0836
            long r5 = android.os.SystemClock.elapsedRealtime()     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            long r5 = r5 * r2
            X.0qH r10 = r9.A09     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.4df r2 = r0.A07     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            long r2 = r2.A0G     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            long r7 = r0.A0J     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            long r2 = r2 - r7
            r7 = 0
            r10.A7z(r2, r4)     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r12 = 1
            r21 = 1
        L_0x07e4:
            X.5UO[] r3 = r0.A0a     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            int r2 = r3.length     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            if (r7 >= r2) goto L_0x083e
            r10 = r3[r7]     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r2 = r10
            X.4o1 r2 = (X.C96244o1) r2     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            int r2 = r2.A01     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            boolean r2 = X.AnonymousClass000.A1O(r2)     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            if (r2 == 0) goto L_0x0833
            long r2 = r0.A03     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r10.Ac6(r2, r5)     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            if (r12 == 0) goto L_0x0804
            boolean r2 = r10.AIm()     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r12 = 1
            if (r2 != 0) goto L_0x0805
        L_0x0804:
            r12 = 0
        L_0x0805:
            X.5Sm[] r2 = r9.A0D     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r3 = r2[r7]     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r8 = r10
            X.4o1 r8 = (X.C96244o1) r8     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.5Sm r2 = r8.A05     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            if (r3 != r2) goto L_0x0823
            boolean r2 = r10.AHf()     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            if (r2 != 0) goto L_0x0823
            boolean r2 = r10.AJY()     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            if (r2 != 0) goto L_0x0823
            boolean r3 = r10.AIm()     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r2 = 0
            if (r3 == 0) goto L_0x0824
        L_0x0823:
            r2 = 1
        L_0x0824:
            if (r21 == 0) goto L_0x082a
            r21 = 1
            if (r2 != 0) goto L_0x0833
        L_0x082a:
            r21 = 0
            if (r2 != 0) goto L_0x0833
            X.5Sm r2 = r8.A05     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r2.ALU()     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
        L_0x0833:
            int r7 = r7 + 1
            goto L_0x07e4
        L_0x0836:
            X.0qH r2 = r9.A09     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r2.ALV()     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r12 = 1
            r21 = 1
        L_0x083e:
            X.4Wv r2 = r9.A02     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            long r5 = r2.A00     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            if (r12 == 0) goto L_0x0869
            boolean r2 = r9.A07     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            if (r2 == 0) goto L_0x0869
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 == 0) goto L_0x0859
            X.4df r2 = r0.A07     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            long r2 = r2.A0G     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            int r7 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r7 > 0) goto L_0x0869
        L_0x0859:
            r5 = 1
            boolean r2 = r0.A0E     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            if (r2 == 0) goto L_0x086a
            r0.A0E = r4     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.4df r2 = r0.A07     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            int r3 = r2.A01     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r2 = 5
            r0.A0I(r3, r2, r4, r4)     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            goto L_0x086a
        L_0x0869:
            r5 = 0
        L_0x086a:
            r10 = 3
            if (r5 == 0) goto L_0x0879
            X.4Wv r2 = r9.A02     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            boolean r2 = r2.A05     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            if (r2 == 0) goto L_0x0879
            r2 = 4
            r0.A0H(r2)     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            goto L_0x097c
        L_0x0879:
            X.4df r3 = r0.A07     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            int r2 = r3.A00     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r12 = 2
            if (r2 != r12) goto L_0x0944
            int r2 = r0.A00     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            if (r2 != 0) goto L_0x08a2
            boolean r2 = r0.A0W()     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            if (r2 == 0) goto L_0x0944
        L_0x088a:
            r0.A0H(r10)     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r2 = 0
            r0.A04 = r2     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            boolean r2 = r0.A0X()     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            if (r2 == 0) goto L_0x0899
            r0.A0D()     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
        L_0x0899:
            X.4df r5 = r0.A07     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            int r3 = r5.A00     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r2 = 2
            if (r3 != r2) goto L_0x09c6
            goto L_0x0981
        L_0x08a2:
            if (r21 == 0) goto L_0x0944
            boolean r2 = r3.A0B     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            if (r2 == 0) goto L_0x088a
            com.google.android.exoplayer2.Timeline r3 = r3.A05     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.4X7 r2 = r11.A05     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.4Wv r2 = r2.A02     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.1c3 r2 = r2.A04     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            boolean r2 = r0.A0Y(r3, r2)     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            if (r2 == 0) goto L_0x08da
            X.5L6 r2 = r0.A0O     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.4nu r2 = (X.C96174nu) r2     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            long r5 = r2.A01     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
        L_0x08bc:
            X.4X7 r3 = r11.A04     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            boolean r2 = r3.A07     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            if (r2 == 0) goto L_0x08e0
            boolean r2 = r3.A06     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            if (r2 == 0) goto L_0x08d2
            X.0qH r2 = r3.A09     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            long r13 = r2.AAG()     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r7 = -9223372036854775808
            int r2 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r2 != 0) goto L_0x08e0
        L_0x08d2:
            X.4Wv r2 = r3.A02     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            boolean r2 = r2.A05     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r7 = 1
            if (r2 != 0) goto L_0x08e1
            goto L_0x08e0
        L_0x08da:
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x08bc
        L_0x08e0:
            r7 = 0
        L_0x08e1:
            X.4Wv r2 = r3.A02     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.1c3 r2 = r2.A04     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            boolean r2 = r2.A00()     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            if (r2 == 0) goto L_0x08f0
            boolean r3 = r3.A07     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r2 = 1
            if (r3 == 0) goto L_0x08f1
        L_0x08f0:
            r2 = 0
        L_0x08f1:
            if (r7 != 0) goto L_0x088a
            if (r2 != 0) goto L_0x088a
            X.5L7 r11 = r0.A0P     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            long r7 = r0.A05()     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.4qW r2 = r0.A0M     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.4bm r2 = r2.AF4()     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            float r14 = r2.A01     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            boolean r13 = r0.A0B     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.4nv r11 = (X.C96184nv) r11     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r2 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x0914
            double r2 = (double) r7     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            double r7 = (double) r14     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            double r2 = r2 / r7
            long r7 = java.lang.Math.round(r2)     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
        L_0x0914:
            if (r13 == 0) goto L_0x0919
            long r2 = r11.A03     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            goto L_0x091b
        L_0x0919:
            long r2 = r11.A04     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
        L_0x091b:
            r19 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r13 = (r5 > r19 ? 1 : (r5 == r19 ? 0 : -1))
            if (r13 == 0) goto L_0x092b
            r13 = 2
            long r5 = r5 / r13
            long r2 = java.lang.Math.min(r5, r2)     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
        L_0x092b:
            r13 = 0
            int r5 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r5 <= 0) goto L_0x088a
            int r5 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r5 >= 0) goto L_0x088a
            X.4qD r5 = r11.A07     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            monitor-enter(r5)     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            int r3 = r5.A00     // Catch:{ all -> 0x0a84 }
            int r2 = r5.A04     // Catch:{ all -> 0x0a84 }
            int r3 = r3 * r2
            monitor-exit(r5)     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            int r2 = r11.A00     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            if (r3 < r2) goto L_0x0944
            goto L_0x088a
        L_0x0944:
            X.4df r2 = r0.A07     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            int r2 = r2.A00     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            if (r2 != r10) goto L_0x0899
            int r2 = r0.A00     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            if (r2 != 0) goto L_0x0956
            boolean r2 = r0.A0W()     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            if (r2 == 0) goto L_0x0958
            goto L_0x0899
        L_0x0956:
            if (r21 != 0) goto L_0x0899
        L_0x0958:
            boolean r2 = r0.A0X()     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r0.A0B = r2     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r0.A0H(r12)     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            boolean r2 = r0.A0B     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            if (r2 == 0) goto L_0x097c
            X.5L6 r7 = r0.A0O     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.4nu r7 = (X.C96174nu) r7     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            long r5 = r7.A01     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r8 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r8 == 0) goto L_0x097c
            r11 = 500000(0x7a120, double:2.47033E-318)
            long r5 = r5 + r11
            r7.A01 = r5     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r7.A03 = r2     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
        L_0x097c:
            r0.A0E()     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            goto L_0x0899
        L_0x0981:
            r6 = 0
        L_0x0982:
            X.5UO[] r7 = r0.A0a     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            int r2 = r7.length     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            if (r6 >= r2) goto L_0x09ab
            r2 = r7[r6]     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.4o1 r2 = (X.C96244o1) r2     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            int r2 = r2.A01     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            boolean r2 = X.AnonymousClass000.A1O(r2)     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            if (r2 == 0) goto L_0x09a8
            r2 = r7[r6]     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.4o1 r2 = (X.C96244o1) r2     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.5Sm r3 = r2.A05     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.5Sm[] r2 = r9.A0D     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r2 = r2[r6]     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            if (r3 != r2) goto L_0x09a8
            r2 = r7[r6]     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.4o1 r2 = (X.C96244o1) r2     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.5Sm r2 = r2.A05     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r2.ALU()     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
        L_0x09a8:
            int r6 = r6 + 1
            goto L_0x0982
        L_0x09ab:
            boolean r2 = r5.A0B     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            if (r2 != 0) goto L_0x09c6
            long r2 = r5.A0H     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r6 = 500000(0x7a120, double:2.47033E-318)
            int r5 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r5 >= 0) goto L_0x09c6
            boolean r2 = r0.A0V()     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            if (r2 == 0) goto L_0x09c6
            java.lang.String r2 = "Playback stuck buffering and not loading"
            java.lang.IllegalStateException r2 = X.AnonymousClass000.A0V(r2)     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            goto L_0x0abc
        L_0x09c6:
            boolean r5 = r0.A0C     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.4df r3 = r0.A07     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            boolean r2 = r3.A0C     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            if (r5 == r2) goto L_0x09d4
            X.4df r3 = r3.A08(r5)     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r0.A07 = r3     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
        L_0x09d4:
            boolean r2 = r0.A0X()     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            if (r2 == 0) goto L_0x09de
            int r2 = r3.A00     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            if (r2 == r10) goto L_0x0a08
        L_0x09de:
            int r3 = r3.A00     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r2 = 2
            if (r3 == r2) goto L_0x0a08
            int r2 = r0.A00     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            if (r2 == 0) goto L_0x09fc
            r2 = 4
            if (r3 == r2) goto L_0x09fc
            r7 = 1000(0x3e8, double:4.94E-321)
            X.5La r2 = r0.A0Y     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.4qO r2 = (X.C97684qO) r2     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r6 = 2
            android.os.Handler r5 = r2.A00     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r5.removeMessages(r6)     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            long r15 = r15 + r7
            r2 = r15
            r5.sendEmptyMessageAtTime(r6, r2)     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            goto L_0x0a06
        L_0x09fc:
            X.5La r2 = r0.A0Y     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.4qO r2 = (X.C97684qO) r2     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r3 = 2
            android.os.Handler r2 = r2.A00     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r2.removeMessages(r3)     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
        L_0x0a06:
            r12 = 0
            goto L_0x0a26
        L_0x0a08:
            boolean r2 = r0.A0C     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            if (r2 == 0) goto L_0x0a12
            boolean r2 = r0.A0G     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            if (r2 == 0) goto L_0x0a12
            r2 = 0
            goto L_0x0a24
        L_0x0a12:
            r7 = 10
            X.5La r2 = r0.A0Y     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.4qO r2 = (X.C97684qO) r2     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r6 = 2
            android.os.Handler r5 = r2.A00     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r5.removeMessages(r6)     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            long r15 = r15 + r7
            r2 = r15
            r5.sendEmptyMessageAtTime(r6, r2)     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r2 = 1
        L_0x0a24:
            r12 = r2 ^ 1
        L_0x0a26:
            X.4df r11 = r0.A07     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            boolean r2 = r11.A0E     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            if (r2 == r12) goto L_0x0a7d
            com.google.android.exoplayer2.Timeline r2 = r11.A05     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r22 = r2
            X.1c3 r2 = r11.A07     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r23 = r2
            long r9 = r11.A02     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            int r2 = r11.A00     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r28 = r2
            X.43y r2 = r11.A03     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r20 = r2
            boolean r2 = r11.A0B     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r38 = r2
            X.4jT r2 = r11.A08     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r25 = r2
            X.4LY r2 = r11.A09     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r26 = r2
            java.util.List r2 = r11.A0A     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r27 = r2
            X.1c3 r2 = r11.A06     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r24 = r2
            boolean r2 = r11.A0D     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r16 = r2
            int r14 = r11.A01     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.4bm r13 = r11.A04     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            long r7 = r11.A0F     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            long r5 = r11.A0H     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            long r2 = r11.A0G     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            boolean r15 = r11.A0C     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.4df r11 = new X.4df     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r19 = r11
            r21 = r13
            r29 = r14
            r30 = r9
            r32 = r7
            r34 = r5
            r36 = r2
            r39 = r16
            r40 = r15
            r41 = r12
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r32, r34, r36, r38, r39, r40, r41)     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r0.A07 = r11     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
        L_0x0a7d:
            r0.A0G = r4     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.C90224dm.A00()     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            goto L_0x0bbf
        L_0x0a84:
            r2 = move-exception
            monitor-exit(r5)     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            goto L_0x0abc
        L_0x0a87:
            X.5La r2 = r0.A0Y     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.4qO r2 = (X.C97684qO) r2     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r3 = 2
            android.os.Handler r2 = r2.A00     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r2.removeMessages(r3)     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            goto L_0x0bbf
        L_0x0a93:
            r0.A0T(r1, r4, r1, r4)     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.5L7 r3 = r0.A0P     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.4nv r3 = (X.C96184nv) r3     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r2 = 13107200(0xc80000, float:1.8367099E-38)
            r3.A00 = r2     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r3.A01 = r4     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.4qD r3 = r3.A07     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            monitor-enter(r3)     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r3.A00(r4)     // Catch:{ all -> 0x0aba }
            monitor-exit(r3)     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r0.A0H(r1)     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            android.os.HandlerThread r2 = r0.A0K     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r2.quit()     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            monitor-enter(r0)     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r0.A0F = r1     // Catch:{ all -> 0x0ab7 }
            r0.notifyAll()     // Catch:{ all -> 0x0ab7 }
            monitor-exit(r0)     // Catch:{ all -> 0x0ab7 }
            return r1
        L_0x0ab7:
            r2 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0ab7 }
            goto L_0x0abc
        L_0x0aba:
            r2 = move-exception
            monitor-exit(r3)     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
        L_0x0abc:
            throw r2     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
        L_0x0abd:
            X.4qW r2 = r0.A0M     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r2.AF4()     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.4XV r7 = r0.A0Q     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.4X7 r11 = r7.A05     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.4X7 r12 = r7.A06     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r14 = 1
        L_0x0ac9:
            if (r11 == 0) goto L_0x0bbf
            boolean r2 = r11.A07     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            if (r2 == 0) goto L_0x0bbf
            X.4LY r10 = r11.A02()     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.4LY r9 = r11.A04     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.5UR[] r8 = r9.A03     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            int r2 = r8.length     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.5UR[] r6 = r10.A03     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            int r5 = r6.length     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            if (r2 != r5) goto L_0x0b01
            r3 = 0
        L_0x0ade:
            if (r3 >= r5) goto L_0x0afb
            X.4bE[] r2 = r10.A02     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r13 = r2[r3]     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.4bE[] r2 = r9.A02     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r2 = r2[r3]     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            boolean r2 = X.AnonymousClass3C1.A0F(r13, r2)     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            if (r2 == 0) goto L_0x0b01
            r13 = r6[r3]     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r2 = r8[r3]     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            boolean r2 = X.AnonymousClass3C1.A0F(r13, r2)     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            if (r2 == 0) goto L_0x0b01
            int r3 = r3 + 1
            goto L_0x0ade
        L_0x0afb:
            if (r11 != r12) goto L_0x0afe
            r14 = 0
        L_0x0afe:
            X.4X7 r11 = r11.A01     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            goto L_0x0ac9
        L_0x0b01:
            r12 = 0
            r9 = 4
            if (r14 == 0) goto L_0x0b7c
            X.4X7 r11 = r7.A05     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            boolean r24 = r7.A08(r11)     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.5UO[] r8 = r0.A0a     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            int r7 = r8.length     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            boolean[] r13 = new boolean[r7]     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.4df r2 = r0.A07     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            long r2 = r2.A0G     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r19 = r11
            r20 = r10
            r21 = r13
            r22 = r2
            long r2 = r19.A01(r20, r21, r22, r24)     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.4df r5 = r0.A07     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.1c3 r10 = r5.A07     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            long r5 = r5.A02     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r19 = r0
            r20 = r10
            r21 = r2
            r23 = r5
            X.4df r6 = r19.A09(r20, r21, r23)     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r0.A07 = r6     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            int r5 = r6.A00     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            if (r5 == r9) goto L_0x0b46
            long r5 = r6.A0G     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            int r10 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r10 == 0) goto L_0x0b46
            X.4V3 r5 = r0.A05     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r5.A01(r9)     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r0.A0J(r2)     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
        L_0x0b46:
            boolean[] r6 = new boolean[r7]     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
        L_0x0b48:
            if (r12 >= r7) goto L_0x0b78
            r10 = r8[r12]     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r2 = r10
            X.4o1 r2 = (X.C96244o1) r2     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            int r2 = r2.A01     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            boolean r5 = X.AnonymousClass000.A1O(r2)     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r6[r12] = r5     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.5Sm[] r2 = r11.A0D     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r3 = r2[r12]     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            if (r5 == 0) goto L_0x0b75
            r5 = r10
            X.4o1 r5 = (X.C96244o1) r5     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.5Sm r2 = r5.A05     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            if (r3 == r2) goto L_0x0b68
            r0.A0L(r10)     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            goto L_0x0b75
        L_0x0b68:
            boolean r2 = r13[r12]     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            if (r2 == 0) goto L_0x0b75
            long r2 = r0.A03     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r5.A06 = r4     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r5.A02 = r2     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r5.A09(r2, r4)     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
        L_0x0b75:
            int r12 = r12 + 1
            goto L_0x0b48
        L_0x0b78:
            r0.A0U(r6)     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            goto L_0x0b9c
        L_0x0b7c:
            r7.A08(r11)     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            boolean r2 = r11.A07     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            if (r2 == 0) goto L_0x0b9c
            X.4Wv r2 = r11.A02     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            long r5 = r2.A03     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            long r2 = r0.A03     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            long r7 = r11.A00     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            long r2 = r2 - r7
            long r14 = java.lang.Math.max(r5, r2)     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.5SK[] r2 = r11.A0C     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            int r2 = r2.length     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            boolean[] r2 = new boolean[r2]     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r16 = 0
            r12 = r10
            r13 = r2
            r11.A01(r12, r13, r14, r16)     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
        L_0x0b9c:
            r0.A0Q(r1)     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.4df r2 = r0.A07     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            int r2 = r2.A00     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            if (r2 == r9) goto L_0x0bbf
            r0.A0A()     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r0.A0G()     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            X.5La r2 = r0.A0Y     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r3 = 2
            X.4qO r2 = (X.C97684qO) r2     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            android.os.Handler r2 = r2.A00     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r2.sendEmptyMessage(r3)     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            goto L_0x0bbf
        L_0x0bb6:
            X.4XK r2 = r0.A0R     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            com.google.android.exoplayer2.Timeline r2 = r2.A00()     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            r0.A0M(r2)     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
        L_0x0bbf:
            r0.A0B()     // Catch:{ 43y -> 0x0c0a, IOException -> 0x0be5, RuntimeException -> 0x0bc3 }
            return r1
        L_0x0bc3:
            r8 = move-exception
            r9 = 2
            r6 = 0
            r10 = -1
            r11 = 4
            r12 = 0
            X.43y r5 = new X.43y
            r7 = r6
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            r3 = r18
            r2 = r17
            X.C89504cL.A01(r2, r3, r5)
            r0.A0S(r1, r4)
            X.4df r2 = r0.A07
            X.4df r2 = r2.A03(r5)
            r0.A07 = r2
            r0.A0B()
            return r1
        L_0x0be5:
            r8 = move-exception
            r6 = 0
            r10 = -1
            r11 = 4
            r9 = 0
            r12 = 0
            X.43y r5 = new X.43y
            r7 = r6
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            X.4XV r2 = r0.A0Q
            X.4X7 r2 = r2.A05
            if (r2 == 0) goto L_0x0bff
            X.4Wv r2 = r2.A02
            X.1c3 r2 = r2.A04
            X.43y r5 = r5.A00(r2)
        L_0x0bff:
            r3 = r18
            r2 = r17
            X.C89504cL.A01(r2, r3, r5)
            r0.A0S(r4, r4)
            goto L_0x0c56
        L_0x0c0a:
            r5 = move-exception
            int r2 = r5.type
            if (r2 != r1) goto L_0x0c1d
            X.4XV r2 = r0.A0Q
            X.4X7 r2 = r2.A06
            if (r2 == 0) goto L_0x0c1d
            X.4Wv r2 = r2.A02
            X.1c3 r2 = r2.A04
            X.43y r5 = r5.A00(r2)
        L_0x0c1d:
            boolean r2 = r5.isRecoverable
            if (r2 == 0) goto L_0x0c45
            X.43y r2 = r0.A04
            if (r2 != 0) goto L_0x0c45
            java.lang.String r3 = "Recoverable playback error"
            r2 = r17
            X.C89504cL.A02(r2, r3, r5)
            r0.A04 = r5
            X.5La r2 = r0.A0Y
            r3 = 25
            X.4qO r2 = (X.C97684qO) r2
            android.os.Handler r2 = r2.A00
            android.os.Message r3 = r2.obtainMessage(r3, r5)
            android.os.Handler r2 = r3.getTarget()
            r2.sendMessageAtFrontOfQueue(r3)
        L_0x0c41:
            r0.A0B()
            return r1
        L_0x0c45:
            X.43y r2 = r0.A04
            if (r2 == 0) goto L_0x0c4c
            r2 = 0
            r0.A04 = r2
        L_0x0c4c:
            r3 = r18
            r2 = r17
            X.C89504cL.A01(r2, r3, r5)
            r0.A0S(r1, r4)
        L_0x0c56:
            X.4df r2 = r0.A07
            X.4df r2 = r2.A03(r5)
            r0.A07 = r2
            goto L_0x0c41
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C97274pg.handleMessage(android.os.Message):boolean");
    }
}
