package X;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.support.v4.view.accessibility.AccessibilityEventCompat;
import com.facebook.redex.RunnableRunnableShape1S0100000_I0;
import com.facebook.redex.RunnableRunnableShape2S0200000_I0;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.0qF  reason: invalid class name and case insensitive filesystem */
public final class C15050qF implements C15060qG, C15070qH, C15090qJ, C15100qK, C15110qL {
    public static final C32491gT A0b;
    public static final Map A0c;
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public C32371gD A07;
    public C35721mO A08;
    public C15120qM A09;
    public AnonymousClass4LT A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public AnonymousClass4TG[] A0K;
    public C55092ip[] A0L;
    public final long A0M = ((long) AccessibilityEventCompat.TYPE_TOUCH_INTERACTION_START);
    public final Uri A0N;
    public final Handler A0O;
    public final AnonymousClass4JT A0P;
    public final AnonymousClass5TW A0Q;
    public final C30231bz A0R;
    public final C55112ir A0S;
    public final C108325Nn A0T;
    public final AnonymousClass5RB A0U;
    public final C48612Oe A0V;
    public final AnonymousClass5LY A0W;
    public final C88124Zz A0X = new C88124Zz();
    public final AnonymousClass4GQ A0Y;
    public final Runnable A0Z;
    public final Runnable A0a;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        A0c = Collections.unmodifiableMap(hashMap);
        C32471gR r1 = new C32471gR();
        r1.A0O = "icy";
        r1.A0R = "application/x-icy";
        A0b = new C32491gT(r1);
    }

    public C15050qF(Uri uri, AnonymousClass4JT r6, AnonymousClass5TW r7, C108255Ng r8, C30231bz r9, C108325Nn r10, AnonymousClass5RB r11, C48612Oe r12, AnonymousClass5LY r13) {
        this.A0N = uri;
        this.A0V = r12;
        this.A0Q = r7;
        this.A0P = r6;
        this.A0W = r13;
        this.A0R = r9;
        this.A0T = r10;
        this.A0U = r11;
        this.A0S = new C55122is(r8);
        this.A0Y = new AnonymousClass4GQ();
        this.A0Z = new RunnableRunnableShape1S0100000_I0((Object) this, 4);
        this.A0a = new RunnableRunnableShape1S0100000_I0((Object) this, 5);
        Looper myLooper = Looper.myLooper();
        C90524eJ.A01(myLooper);
        this.A0O = new Handler(myLooper, (Handler.Callback) null);
        this.A0K = new AnonymousClass4TG[0];
        this.A0L = new C55092ip[0];
        this.A06 = -9223372036854775807L;
        this.A05 = -1;
        this.A03 = -9223372036854775807L;
        this.A00 = 1;
    }

    public final long A00() {
        long j2;
        long j3 = Long.MIN_VALUE;
        for (C55092ip r2 : this.A0L) {
            synchronized (r2) {
                j2 = r2.A06;
            }
            j3 = Math.max(j3, j2);
        }
        return j3;
    }

    public final C32481gS A01(AnonymousClass4TG r7) {
        C55092ip[] r2 = this.A0L;
        int length = r2.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (r7.equals(this.A0K[i2])) {
                return r2[i2];
            }
        }
        AnonymousClass5RB r4 = this.A0U;
        C55092ip r22 = new C55092ip(this.A0O.getLooper(), this.A0P, this.A0Q, r4);
        r22.A0D = this;
        int i3 = length + 1;
        Object[] copyOf = Arrays.copyOf(this.A0K, i3);
        copyOf[length] = r7;
        this.A0K = (AnonymousClass4TG[]) copyOf;
        Object[] copyOf2 = Arrays.copyOf(this.A0L, i3);
        copyOf2[length] = r22;
        this.A0L = (C55092ip[]) copyOf2;
        return r22;
    }

    public void A02() {
        IOException iOException;
        C88124Zz r3 = this.A0X;
        int i2 = 3;
        if (this.A00 == 7) {
            i2 = 6;
        }
        IOException iOException2 = r3.A01;
        if (iOException2 == null) {
            AnonymousClass2ni r0 = r3.A00;
            if (r0 != null && (iOException = r0.A02) != null && r0.A00 > i2) {
                throw iOException;
            }
            return;
        }
        throw iOException2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0059, code lost:
        if (X.C90834eu.A05(r0) != false) goto L_0x005b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03() {
        /*
            r13 = this;
            boolean r0 = r13.A0H
            if (r0 != 0) goto L_0x00f6
            boolean r0 = r13.A0G
            if (r0 != 0) goto L_0x00f6
            boolean r0 = r13.A0I
            if (r0 == 0) goto L_0x00f6
            X.1gD r0 = r13.A07
            if (r0 == 0) goto L_0x00f6
            X.2ip[] r4 = r13.A0L
            int r3 = r4.length
            r8 = 0
            r2 = 0
        L_0x0015:
            if (r2 >= r3) goto L_0x002c
            r1 = r4[r2]
            monitor-enter(r1)
            boolean r0 = r1.A0H     // Catch:{ all -> 0x0029 }
            if (r0 == 0) goto L_0x001f
            goto L_0x0022
        L_0x001f:
            X.1gT r0 = r1.A0B     // Catch:{ all -> 0x0029 }
            goto L_0x0023
        L_0x0022:
            r0 = 0
        L_0x0023:
            monitor-exit(r1)
            if (r0 == 0) goto L_0x00f6
            int r2 = r2 + 1
            goto L_0x0015
        L_0x0029:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x002c:
            X.4GQ r1 = r13.A0Y
            monitor-enter(r1)
            r1.A00 = r8     // Catch:{ all -> 0x00f3 }
            monitor-exit(r1)
            X.2ip[] r0 = r13.A0L
            int r7 = r0.length
            X.4jQ[] r6 = new X.C93574jQ[r7]
            boolean[] r5 = new boolean[r7]
            r4 = 0
        L_0x003a:
            r3 = 1
            if (r4 >= r7) goto L_0x00df
            X.2ip[] r0 = r13.A0L
            r1 = r0[r4]
            monitor-enter(r1)
            boolean r0 = r1.A0H     // Catch:{ all -> 0x00dc }
            if (r0 == 0) goto L_0x0047
            goto L_0x004a
        L_0x0047:
            X.1gT r9 = r1.A0B     // Catch:{ all -> 0x00dc }
            goto L_0x004b
        L_0x004a:
            r9 = 0
        L_0x004b:
            monitor-exit(r1)
            java.lang.String r0 = r9.A0T
            boolean r12 = X.C90834eu.A03(r0)
            if (r12 != 0) goto L_0x005b
            boolean r0 = X.C90834eu.A05(r0)
            r1 = 0
            if (r0 == 0) goto L_0x005c
        L_0x005b:
            r1 = 1
        L_0x005c:
            r5[r4] = r1
            boolean r0 = r13.A0B
            r1 = r1 | r0
            r13.A0B = r1
            X.1mO r10 = r13.A08
            if (r10 == 0) goto L_0x00a5
            if (r12 != 0) goto L_0x0071
            X.4TG[] r0 = r13.A0K
            r0 = r0[r4]
            boolean r0 = r0.A01
            if (r0 == 0) goto L_0x00a5
        L_0x0071:
            X.4jf r0 = r9.A0L
            X.1mP[] r11 = new X.C35731mP[r3]
            r11[r8] = r10
            if (r0 != 0) goto L_0x00c8
            X.4jf r1 = new X.4jf
            r1.<init>((X.C35731mP[]) r11)
        L_0x007e:
            X.1gR r0 = new X.1gR
            r0.<init>(r9)
            r0.A0J = r1
            X.1gT r9 = new X.1gT
            r9.<init>((X.C32471gR) r0)
            if (r12 == 0) goto L_0x00a5
            int r0 = r9.A04
            r2 = -1
            if (r0 != r2) goto L_0x00a5
            int r0 = r9.A0C
            if (r0 != r2) goto L_0x00a5
            int r1 = r10.A00
            if (r1 == r2) goto L_0x00a5
            X.1gR r0 = new X.1gR
            r0.<init>(r9)
            r0.A03 = r1
            X.1gT r9 = new X.1gT
            r9.<init>((X.C32471gR) r0)
        L_0x00a5:
            X.57J r0 = r9.A0K
            if (r0 == 0) goto L_0x00c6
            java.lang.Class<X.4oH> r0 = X.C96404oH.class
        L_0x00ab:
            X.1gR r1 = new X.1gR
            r1.<init>(r9)
            r1.A0L = r0
            X.1gT r0 = new X.1gT
            r0.<init>((X.C32471gR) r1)
            X.1gT[] r1 = new X.C32491gT[r3]
            r1[r8] = r0
            X.4jQ r0 = new X.4jQ
            r0.<init>((X.C32491gT[]) r1)
            r6[r4] = r0
            int r4 = r4 + 1
            goto L_0x003a
        L_0x00c6:
            r0 = 0
            goto L_0x00ab
        L_0x00c8:
            X.1mP[] r2 = r0.A00
            int r1 = r2.length
            int r0 = r1 + 1
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r2, r0)
            java.lang.System.arraycopy(r11, r8, r0, r1, r3)
            X.1mP[] r0 = (X.C35731mP[]) r0
            X.4jf r1 = new X.4jf
            r1.<init>((X.C35731mP[]) r0)
            goto L_0x007e
        L_0x00dc:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x00df:
            X.4jT r1 = new X.4jT
            r1.<init>((X.C93574jQ[]) r6)
            X.4LT r0 = new X.4LT
            r0.<init>(r1, r5)
            r13.A0A = r0
            r13.A0G = r3
            X.0qM r0 = r13.A09
            r0.AVC(r13)
            return
        L_0x00f3:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x00f6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15050qF.A03():void");
    }

    public final void A04() {
        AnonymousClass3E8 r8 = new AnonymousClass3E8(this.A0N, this, this.A0S, this, this.A0V, this.A0Y);
        if (this.A0G) {
            C90524eJ.A04(A07());
            long j2 = this.A03;
            if (j2 == -9223372036854775807L || this.A06 <= j2) {
                long j3 = this.A07.AFq(this.A06).A00.A00;
                long j4 = this.A06;
                r8.A09.A00 = j3;
                r8.A01 = j4;
                r8.A04 = true;
                r8.A05 = false;
                for (C55092ip r0 : this.A0L) {
                    r0.A07 = j4;
                }
                this.A06 = -9223372036854775807L;
            } else {
                this.A0D = true;
                this.A06 = -9223372036854775807L;
                return;
            }
        }
        int i2 = 0;
        for (C55092ip r02 : this.A0L) {
            i2 += r02.A00 + r02.A02;
        }
        this.A02 = i2;
        C88124Zz r1 = this.A0X;
        Looper myLooper = Looper.myLooper();
        C90524eJ.A01(myLooper);
        r1.A01 = null;
        AnonymousClass2ni r5 = new AnonymousClass2ni(myLooper, this, r8, r1, SystemClock.elapsedRealtime());
        C88124Zz r2 = r5.A08;
        boolean z2 = false;
        if (r2.A00 == null) {
            z2 = true;
        }
        C90524eJ.A04(z2);
        r2.A00 = r5;
        r5.A02 = null;
        r2.A02.execute(r5);
        AnonymousClass3AL r22 = r8.A03;
        C30231bz r4 = this.A0R;
        r4.A03(new C30251c1(r22.A04, r22, Collections.emptyMap()), new C30261c2((C32491gT) null, (Object) null, 1, -1, 0, r4.A00(r8.A01), r4.A00(this.A03)));
    }

    public final void A05(int i2) {
        C90524eJ.A04(this.A0G);
        AnonymousClass4LT r1 = this.A0A;
        boolean[] zArr = r1.A03;
        if (!zArr[i2]) {
            C32491gT r5 = r1.A00.A02[i2].A02[0];
            C30231bz r2 = this.A0R;
            r2.A05(new C30261c2(r5, (Object) null, 1, C90834eu.A00(r5.A0T), 0, r2.A00(this.A04), -9223372036854775807L));
            zArr[i2] = true;
        }
    }

    public final void A06(int i2) {
        C90524eJ.A04(this.A0G);
        boolean[] zArr = this.A0A.A02;
        if (this.A0F && zArr[i2]) {
            if (!this.A0L[i2].A06(false)) {
                this.A06 = 0;
                this.A0F = false;
                this.A0E = true;
                this.A04 = 0;
                this.A02 = 0;
                for (C55092ip A042 : this.A0L) {
                    A042.A04(false);
                }
                this.A09.AP8(this);
            }
        }
    }

    public final boolean A07() {
        return this.A06 != -9223372036854775807L;
    }

    public boolean A6f(long j2) {
        boolean z2;
        if (!this.A0D) {
            C88124Zz r3 = this.A0X;
            if (r3.A01 == null && !this.A0F && (!this.A0G || this.A01 != 0)) {
                AnonymousClass4GQ r1 = this.A0Y;
                synchronized (r1) {
                    z2 = false;
                    if (!r1.A00) {
                        z2 = true;
                        r1.A00 = true;
                        r1.notifyAll();
                    }
                }
                if (r3.A00 != null) {
                    return z2;
                }
                A04();
                return true;
            }
        }
        return false;
    }

    public void A7z(long j2, boolean z2) {
        long j3;
        int i2;
        C90524eJ.A04(this.A0G);
        if (!A07()) {
            boolean[] zArr = this.A0A.A01;
            int length = this.A0L.length;
            for (int i3 = 0; i3 < length; i3++) {
                C55092ip r8 = this.A0L[i3];
                boolean z3 = zArr[i3];
                C90084dT r2 = r8.A0T;
                synchronized (r8) {
                    int i4 = r8.A02;
                    if (i4 != 0) {
                        long[] jArr = r8.A0N;
                        int i5 = r8.A04;
                        long j4 = j2;
                        if (j2 >= jArr[i5]) {
                            if (z3 && (i2 = r8.A03) != i4) {
                                i4 = i2 + 1;
                            }
                            int A002 = r8.A00(i5, i4, j4, false);
                            if (A002 != -1) {
                                j3 = r8.A01(A002);
                            }
                        }
                    }
                    j3 = -1;
                }
                r2.A03(j3);
            }
        }
    }

    public void A8W() {
        this.A0I = true;
        this.A0O.post(this.A0Z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0057, code lost:
        if (r7 > r3) goto L_0x0059;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long A9p(X.C88884bF r18, long r19) {
        /*
            r17 = this;
            r9 = r19
            r1 = r17
            boolean r0 = r1.A0G
            X.C90524eJ.A04(r0)
            X.1gD r1 = r1.A07
            boolean r0 = r1.AJe()
            if (r0 != 0) goto L_0x0014
            r9 = 0
            return r9
        L_0x0014:
            X.4VV r1 = r1.AFq(r9)
            X.4bi r0 = r1.A00
            long r7 = r0.A01
            X.4bi r0 = r1.A01
            long r5 = r0.A01
            r11 = r18
            long r3 = r11.A01
            r15 = 0
            int r0 = (r3 > r15 ? 1 : (r3 == r15 ? 0 : -1))
            if (r0 != 0) goto L_0x0031
            long r0 = r11.A00
            int r2 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r2 != 0) goto L_0x0031
            return r9
        L_0x0031:
            long r13 = r19 - r3
            long r3 = r3 ^ r19
            long r1 = r19 ^ r13
            long r1 = r1 & r3
            int r0 = (r1 > r15 ? 1 : (r1 == r15 ? 0 : -1))
            if (r0 >= 0) goto L_0x003e
            r13 = -9223372036854775808
        L_0x003e:
            long r11 = r11.A00
            long r3 = r19 + r11
            long r1 = r19 ^ r3
            long r11 = r11 ^ r3
            long r1 = r1 & r11
            int r0 = (r1 > r15 ? 1 : (r1 == r15 ? 0 : -1))
            if (r0 >= 0) goto L_0x004f
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L_0x004f:
            r2 = 1
            int r0 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r0 > 0) goto L_0x0059
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            r1 = 1
            if (r0 <= 0) goto L_0x005a
        L_0x0059:
            r1 = 0
        L_0x005a:
            int r0 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r0 > 0) goto L_0x0077
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x0077
        L_0x0062:
            if (r1 == 0) goto L_0x0079
            if (r2 == 0) goto L_0x0076
            long r0 = r7 - r19
            long r3 = java.lang.Math.abs(r0)
            long r0 = r5 - r19
            long r1 = java.lang.Math.abs(r0)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x007c
        L_0x0076:
            return r7
        L_0x0077:
            r2 = 0
            goto L_0x0062
        L_0x0079:
            if (r2 != 0) goto L_0x007c
            return r13
        L_0x007c:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15050qF.A9p(X.4bF, long):long");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0052, code lost:
        if (r2 == Long.MAX_VALUE) goto L_0x0054;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long AAG() {
        /*
            r12 = this;
            boolean r0 = r12.A0G
            X.C90524eJ.A04(r0)
            X.4LT r0 = r12.A0A
            boolean[] r7 = r0.A02
            boolean r0 = r12.A0D
            r10 = -9223372036854775808
            if (r0 == 0) goto L_0x0010
            return r10
        L_0x0010:
            boolean r0 = r12.A07()
            if (r0 == 0) goto L_0x0019
            long r0 = r12.A06
            return r0
        L_0x0019:
            boolean r0 = r12.A0B
            r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r0 == 0) goto L_0x0054
            X.2ip[] r0 = r12.A0L
            int r6 = r0.length
            r5 = 0
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L_0x002b:
            if (r5 >= r6) goto L_0x0050
            boolean r0 = r7[r5]
            if (r0 == 0) goto L_0x0047
            X.2ip[] r0 = r12.A0L
            r1 = r0[r5]
            monitor-enter(r1)
            boolean r0 = r1.A0E     // Catch:{ all -> 0x004d }
            monitor-exit(r1)
            if (r0 != 0) goto L_0x0047
            X.2ip[] r0 = r12.A0L
            r4 = r0[r5]
            monitor-enter(r4)
            long r0 = r4.A06     // Catch:{ all -> 0x004a }
            monitor-exit(r4)
            long r2 = java.lang.Math.min(r2, r0)
        L_0x0047:
            int r5 = r5 + 1
            goto L_0x002b
        L_0x004a:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x004d:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x0050:
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 != 0) goto L_0x0058
        L_0x0054:
            long r2 = r12.A00()
        L_0x0058:
            int r0 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r0 != 0) goto L_0x005e
            long r2 = r12.A04
        L_0x005e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15050qF.AAG():long");
    }

    public long ADw() {
        if (this.A01 == 0) {
            return Long.MIN_VALUE;
        }
        return AAG();
    }

    public C93604jT AGe() {
        C90524eJ.A04(this.A0G);
        return this.A0A.A00;
    }

    public boolean AJ6() {
        boolean z2;
        if (this.A0X.A00 != null) {
            AnonymousClass4GQ r2 = this.A0Y;
            synchronized (r2) {
                z2 = r2.A00;
            }
            return z2;
        }
    }

    public void ALV() {
        A02();
        if (this.A0D && !this.A0G) {
            throw new AnonymousClass40M("Loading finished before preparation is complete.");
        }
    }

    public /* bridge */ /* synthetic */ void ASj(AnonymousClass5RC r19, long j2, long j3, boolean z2) {
        AnonymousClass3E8 r4 = (AnonymousClass3E8) r19;
        C97634qJ r0 = r4.A0B;
        C30251c1 r7 = new C30251c1(r0.A01, r4.A03, r0.A02);
        C30231bz r2 = this.A0R;
        r2.A01(r7, new C30261c2((C32491gT) null, (Object) null, 1, -1, 0, r2.A00(r4.A01), r2.A00(this.A03)));
        if (!z2) {
            if (this.A05 == -1) {
                this.A05 = r4.A00;
            }
            for (C55092ip A042 : this.A0L) {
                A042.A04(false);
            }
            if (this.A01 > 0) {
                this.A09.AP8(this);
            }
        }
    }

    public void Aal(C15120qM r3, long j2) {
        this.A09 = r3;
        AnonymousClass4GQ r1 = this.A0Y;
        synchronized (r1) {
            if (!r1.A00) {
                r1.A00 = true;
                r1.notifyAll();
            }
        }
        A04();
    }

    public long AbU() {
        if (!this.A0E) {
            return -9223372036854775807L;
        }
        if (!this.A0D) {
            int i2 = 0;
            for (C55092ip r0 : this.A0L) {
                i2 += r0.A00 + r0.A02;
            }
            if (i2 <= this.A02) {
                return -9223372036854775807L;
            }
        }
        this.A0E = false;
        return this.A04;
    }

    public void AdD(C32371gD r4) {
        this.A0O.post(new RunnableRunnableShape2S0200000_I0(r4, 2, this));
    }

    public long AdG(long j2) {
        C90524eJ.A04(this.A0G);
        boolean[] zArr = this.A0A.A02;
        if (!this.A07.AJe()) {
            j2 = 0;
        }
        int i2 = 0;
        this.A0E = false;
        this.A04 = j2;
        if (A07()) {
            this.A06 = j2;
        } else {
            if (this.A00 != 7) {
                int length = this.A0L.length;
                int i3 = 0;
                while (true) {
                    if (i3 < length) {
                        if (!this.A0L[i3].A05(j2, false) && (zArr[i3] || !this.A0B)) {
                            break;
                        }
                        i3++;
                    } else {
                        break;
                    }
                }
            }
            this.A0F = false;
            this.A06 = j2;
            this.A0D = false;
            C88124Zz r3 = this.A0X;
            if (r3.A00 != null) {
                C55092ip[] r2 = this.A0L;
                int length2 = r2.length;
                while (i2 < length2) {
                    r2[i2].A02();
                    i2++;
                }
                AnonymousClass2ni r1 = r3.A00;
                C90524eJ.A01(r1);
                r1.A00(false);
                return j2;
            }
            r3.A01 = null;
            C55092ip[] r32 = this.A0L;
            int length3 = r32.length;
            while (i2 < length3) {
                r32[i2].A04(false);
                i2++;
            }
        }
        return j2;
    }

    public long AdK(C109525Sm[] r13, AnonymousClass5UR[] r14, boolean[] zArr, boolean[] zArr2, long j2) {
        int length;
        long j3 = j2;
        C90524eJ.A04(this.A0G);
        AnonymousClass4LT r2 = this.A0A;
        C93604jT r9 = r2.A00;
        boolean[] zArr3 = r2.A01;
        int i2 = this.A01;
        int i3 = i2;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            length = r14.length;
            if (i5 >= length) {
                break;
            }
            if (r13[i5] != null && (r14[i5] == null || !zArr[i5])) {
                int i6 = r13[i5].A00;
                C90524eJ.A04(zArr3[i6]);
                i3--;
                this.A01 = i3;
                zArr3[i6] = false;
                r13[i5] = null;
            }
            i5++;
        }
        boolean z2 = !this.A0J ? j2 != 0 : i2 == 0;
        for (int i7 = 0; i7 < length; i7++) {
            if (r13[i7] == null && r14[i7] != null) {
                C97554qB r4 = r14[i7];
                boolean z3 = false;
                if (r4.A03.length == 1) {
                    z3 = true;
                }
                C90524eJ.A04(z3);
                C97554qB r42 = r4;
                boolean z4 = false;
                if (r42.A03[0] == 0) {
                    z4 = true;
                }
                C90524eJ.A04(z4);
                C93574jQ r43 = r42.A02;
                int i8 = 0;
                while (true) {
                    if (i8 < r9.A01) {
                        if (r9.A02[i8] == r43) {
                            break;
                        }
                        i8++;
                    } else {
                        i8 = -1;
                        break;
                    }
                }
                C90524eJ.A04(!zArr3[i8]);
                this.A01++;
                zArr3[i8] = true;
                r13[i7] = new C97344pq(this, i8);
                zArr2[i7] = true;
                if (!z2) {
                    C55092ip r44 = this.A0L[i8];
                    if (!r44.A05(j3, true)) {
                        z2 = true;
                        if (r44.A00 + r44.A03 != 0) {
                        }
                    }
                    z2 = false;
                }
            }
        }
        if (this.A01 == 0) {
            this.A0F = false;
            this.A0E = false;
            C88124Zz r8 = this.A0X;
            boolean z5 = false;
            if (r8.A00 != null) {
                z5 = true;
            }
            C55092ip[] r6 = this.A0L;
            int length2 = r6.length;
            if (z5) {
                while (i4 < length2) {
                    r6[i4].A02();
                    i4++;
                }
                AnonymousClass2ni r3 = r8.A00;
                C90524eJ.A01(r3);
                r3.A00(false);
            } else {
                while (i4 < length2) {
                    r6[i4].A04(false);
                    i4++;
                }
            }
        } else if (z2) {
            j3 = AdG(j3);
            while (i4 < r13.length) {
                if (r13[i4] != null) {
                    zArr2[i4] = true;
                }
                i4++;
            }
        }
        this.A0J = true;
        return j3;
    }

    public C32481gS Ah1(int i2, int i3) {
        return A01(new AnonymousClass4TG(i2, false));
    }
}
