package X;

import android.support.v4.view.MotionEventCompat;
import android.util.Log;
import android.util.SparseArray;
import androidx.core.view.ViewCompat;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* renamed from: X.4ob  reason: invalid class name and case insensitive filesystem */
public class C96604ob implements C55132it {
    public static final C32491gT A0U;
    public static final byte[] A0V = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    public int A00;
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
    public C15060qG A0C;
    public C87474Wx A0D;
    public C90504eH A0E;
    public boolean A0F;
    public boolean A0G;
    public C32481gS[] A0H;
    public C32481gS[] A0I;
    public final SparseArray A0J;
    public final C88584ak A0K = new C88584ak();
    public final C90504eH A0L = C90504eH.A05(16);
    public final C90504eH A0M = new C90504eH();
    public final C90504eH A0N = C90504eH.A05(5);
    public final C90504eH A0O = new C90504eH(C90674eb.A02);
    public final C90504eH A0P;
    public final ArrayDeque A0Q;
    public final ArrayDeque A0R;
    public final List A0S = Collections.unmodifiableList(Collections.emptyList());
    public final byte[] A0T;

    static {
        C32471gR A0N2 = AnonymousClass3K4.A0N();
        A0N2.A0R = "application/x-emsg";
        A0U = new C32491gT(A0N2);
    }

    public C96604ob() {
        byte[] bArr = new byte[16];
        this.A0T = bArr;
        this.A0P = new C90504eH(bArr);
        this.A0Q = new ArrayDeque();
        this.A0R = new ArrayDeque();
        this.A0J = new SparseArray();
        this.A08 = -9223372036854775807L;
        this.A0A = -9223372036854775807L;
        this.A0B = -9223372036854775807L;
        this.A0C = C15060qG.A00;
        this.A0I = new C32481gS[0];
        this.A0H = new C32481gS[0];
    }

    public static AnonymousClass57J A00(List list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < size; i2++) {
            C65413Ur r1 = (C65413Ur) list.get(i2);
            if (r1.A00 == 1886614376) {
                if (arrayList == null) {
                    arrayList = AnonymousClass000.A0u();
                }
                byte[] bArr = r1.A00.A02;
                C90504eH r11 = new C90504eH(bArr);
                if (r11.A00 >= 32 && C90504eH.A03(r11, 0) == C90504eH.A00(r11) + 4 && r11.A07() == 1886614376) {
                    int A072 = (r11.A07() >> 24) & MotionEventCompat.ACTION_MASK;
                    if (A072 > 1) {
                        Log.w("PsshAtomUtil", C13680ns.A0c(A072, "Unsupported pssh version: "));
                    } else {
                        UUID uuid = new UUID(r11.A0H(), r11.A0H());
                        if (A072 == 1) {
                            r11.A0T(r11.A0E() << 4);
                        }
                        int A0E2 = r11.A0E();
                        if (A0E2 == C90504eH.A00(r11)) {
                            byte[] bArr2 = new byte[A0E2];
                            r11.A0V(bArr2, 0, A0E2);
                            arrayList.add(new C93624jV("video/mp4", new AnonymousClass4GC(uuid, bArr2).A00, bArr));
                        }
                    }
                }
                Log.w("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
            }
        }
        if (arrayList != null) {
            return new AnonymousClass57J((String) null, (C93624jV[]) arrayList.toArray(new C93624jV[0]), false);
        }
        return null;
    }

    public static void A01(AnonymousClass4PE r5, C90504eH r6, int i2) {
        String str;
        int A032 = C90504eH.A03(r6, i2 + 8) & ViewCompat.MEASURED_SIZE_MASK;
        if ((A032 & 1) == 0) {
            boolean A1O = AnonymousClass000.A1O(A032 & 2);
            int A0E2 = r6.A0E();
            if (A0E2 == 0) {
                Arrays.fill(r5.A0F, 0, r5.A00, false);
                return;
            }
            int i3 = r5.A00;
            if (A0E2 == i3) {
                Arrays.fill(r5.A0F, 0, A0E2, A1O);
                int A002 = C90504eH.A00(r6);
                C90504eH r2 = r5.A0H;
                r2.A0Q(A002);
                r5.A07 = true;
                r5.A09 = true;
                r6.A0V(r2.A02, 0, r2.A00);
                r2.A0S(0);
                r5.A09 = false;
                return;
            }
            StringBuilder A0r = AnonymousClass000.A0r("Senc sample count ");
            A0r.append(A0E2);
            str = C13680ns.A0i(" is different from fragment sample count", A0r, i3);
        } else {
            str = "Overriding TrackEncryptionBox parameters is unsupported.";
        }
        throw AnonymousClass40M.A00(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:259:0x0635, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(long r46) {
        /*
            r45 = this;
        L_0x0000:
            r8 = r45
            java.util.ArrayDeque r3 = r8.A0Q
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x0630
            java.lang.Object r0 = r3.peek()
            X.3Us r0 = (X.C65423Us) r0
            long r1 = r0.A00
            int r0 = (r1 > r46 ? 1 : (r1 == r46 ? 0 : -1))
            if (r0 != 0) goto L_0x0630
            java.lang.Object r12 = r3.pop()
            X.3Us r12 = (X.C65423Us) r12
            int r1 = r12.A00
            r0 = 1836019574(0x6d6f6f76, float:4.631354E27)
            if (r1 != r0) goto L_0x0147
            r11 = 1
            r5 = 0
            java.util.List r0 = r12.A02
            X.57J r15 = A00(r0)
            r0 = 1836475768(0x6d766578, float:4.7659988E27)
            X.3Us r0 = r12.A00(r0)
            android.util.SparseArray r4 = new android.util.SparseArray
            r4.<init>()
            java.util.List r13 = r0.A02
            int r10 = r13.size()
            r19 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r9 = 0
        L_0x0043:
            if (r9 >= r10) goto L_0x00a4
            java.lang.Object r2 = r13.get(r9)
            X.3Ur r2 = (X.C65413Ur) r2
            int r1 = r2.A00
            r0 = 1953654136(0x74726578, float:7.6818474E31)
            if (r1 != r0) goto L_0x0087
            X.4eH r0 = r2.A00
            r1 = 12
            int r14 = X.C90504eH.A03(r0, r1)
            int r1 = r0.A07()
            int r7 = r1 + -1
            int r6 = r0.A07()
            int r3 = r0.A07()
            int r2 = r0.A07()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r14)
            X.4LQ r0 = new X.4LQ
            r0.<init>(r7, r6, r3, r2)
            android.util.Pair r2 = android.util.Pair.create(r1, r0)
            java.lang.Object r0 = r2.first
            int r1 = X.AnonymousClass000.A0D(r0)
            java.lang.Object r0 = r2.second
            r4.put(r1, r0)
        L_0x0084:
            int r9 = r9 + 1
            goto L_0x0043
        L_0x0087:
            r0 = 1835362404(0x6d656864, float:4.4373917E27)
            if (r1 != r0) goto L_0x0084
            X.4eH r1 = r2.A00
            r0 = 8
            int r0 = X.C90504eH.A03(r1, r0)
            int r0 = r0 >> 24
            r0 = r0 & 255(0xff, float:3.57E-43)
            if (r0 != 0) goto L_0x009f
            long r19 = r1.A0I()
            goto L_0x0084
        L_0x009f:
            long r19 = r1.A0J()
            goto L_0x0084
        L_0x00a4:
            X.4ar r16 = new X.4ar
            r16.<init>()
            X.4tJ r0 = new X.4tJ
            r0.<init>(r8)
            r6 = 0
            r21 = 0
            r17 = r12
            r18 = r0
            java.util.List r10 = X.C90564eN.A03(r15, r16, r17, r18, r19, r21)
            int r9 = r10.size()
            android.util.SparseArray r7 = r8.A0J
            int r0 = r7.size()
            if (r0 == 0) goto L_0x0106
            int r0 = r7.size()
            if (r0 == r9) goto L_0x00cc
            r11 = 0
        L_0x00cc:
            X.C90524eJ.A04(r11)
        L_0x00cf:
            if (r5 >= r9) goto L_0x0000
            java.lang.Object r8 = r10.get(r5)
            X.4S8 r8 = (X.AnonymousClass4S8) r8
            X.4Or r0 = r8.A03
            int r3 = r0.A00
            java.lang.Object r2 = r7.get(r3)
            X.4Wx r2 = (X.C87474Wx) r2
            int r1 = r4.size()
            r0 = 1
            if (r1 != r0) goto L_0x0101
            java.lang.Object r0 = r4.valueAt(r6)
        L_0x00ec:
            X.4LQ r0 = (X.AnonymousClass4LQ) r0
            r2.A05 = r8
            r2.A04 = r0
            X.1gS r1 = r2.A07
            X.4Or r0 = r8.A03
            X.1gT r0 = r0.A07
            r1.A9D(r0)
            r2.A02()
            int r5 = r5 + 1
            goto L_0x00cf
        L_0x0101:
            java.lang.Object r0 = r4.get(r3)
            goto L_0x00ec
        L_0x0106:
            if (r5 >= r9) goto L_0x0140
            java.lang.Object r13 = r10.get(r5)
            X.4S8 r13 = (X.AnonymousClass4S8) r13
            X.4Or r12 = r13.A03
            X.0qG r1 = r8.A0C
            int r0 = r12.A03
            X.1gS r3 = r1.Ah1(r5, r0)
            int r2 = r12.A00
            int r0 = r4.size()
            if (r0 != r11) goto L_0x013b
            java.lang.Object r1 = r4.valueAt(r6)
        L_0x0124:
            X.4LQ r1 = (X.AnonymousClass4LQ) r1
            X.4Wx r0 = new X.4Wx
            r0.<init>(r3, r1, r13)
            r7.put(r2, r0)
            long r2 = r8.A08
            long r0 = r12.A04
            long r0 = java.lang.Math.max(r2, r0)
            r8.A08 = r0
            int r5 = r5 + 1
            goto L_0x0106
        L_0x013b:
            java.lang.Object r1 = r4.get(r2)
            goto L_0x0124
        L_0x0140:
            X.0qG r0 = r8.A0C
            r0.A8W()
            goto L_0x0000
        L_0x0147:
            r0 = 1836019558(0x6d6f6f66, float:4.6313494E27)
            if (r1 != r0) goto L_0x05ee
            android.util.SparseArray r0 = r8.A0J
            r44 = r0
            byte[] r0 = r8.A0T
            r43 = r0
            java.util.List r0 = r12.A01
            r42 = r0
            int r35 = r42.size()
            r36 = 0
        L_0x015e:
            r1 = r35
            r0 = r36
            if (r0 >= r1) goto L_0x0556
            r1 = r42
            java.lang.Object r37 = r1.get(r0)
            r0 = r37
            X.3Us r0 = (X.C65423Us) r0
            r37 = r0
            int r1 = r0.A00
            r0 = 1953653094(0x74726166, float:7.6813435E31)
            if (r1 != r0) goto L_0x0552
            r1 = 1952868452(0x74666864, float:7.301914E31)
            r0 = r37
            X.3Ur r0 = r0.A01(r1)
            X.4eH r4 = r0.A00
            r0 = 8
            int r5 = X.C90504eH.A03(r4, r0)
            r0 = 16777215(0xffffff, float:2.3509886E-38)
            r5 = r5 & r0
            int r2 = r4.A07()
            int r1 = r44.size()
            r0 = 1
            if (r1 != r0) goto L_0x054a
            r1 = 0
            r0 = r44
            java.lang.Object r7 = r0.valueAt(r1)
        L_0x019e:
            X.4Wx r7 = (X.C87474Wx) r7
            if (r7 == 0) goto L_0x0552
            r0 = r5 & 1
            if (r0 == 0) goto L_0x01b0
            long r0 = r4.A0J()
            X.4PE r2 = r7.A08
            r2.A03 = r0
            r2.A02 = r0
        L_0x01b0:
            X.4LQ r1 = r7.A04
            r0 = r5 & 2
            if (r0 == 0) goto L_0x0546
            int r0 = r4.A07()
            int r6 = r0 + -1
        L_0x01bc:
            r0 = r5 & 8
            if (r0 == 0) goto L_0x0542
            int r3 = r4.A07()
        L_0x01c4:
            r0 = r5 & 16
            if (r0 == 0) goto L_0x053e
            int r2 = r4.A07()
        L_0x01cc:
            r0 = r5 & 32
            if (r0 == 0) goto L_0x053a
            int r1 = r4.A07()
        L_0x01d4:
            X.4PE r5 = r7.A08
            X.4LQ r0 = new X.4LQ
            r0.<init>(r6, r3, r2, r1)
            r5.A05 = r0
            long r0 = r5.A04
            boolean r6 = r5.A08
            r7.A02()
            r4 = 1
            r7.A06 = r4
            r3 = 1952867444(0x74666474, float:7.3014264E31)
            r2 = r37
            X.3Ur r2 = r2.A01(r3)
            if (r2 == 0) goto L_0x0534
            X.4eH r1 = r2.A00
            r0 = 8
            int r0 = X.C90504eH.A03(r1, r0)
            int r0 = r0 >> 24
            r0 = r0 & 255(0xff, float:3.57E-43)
            if (r0 != r4) goto L_0x052e
            long r0 = r1.A0J()
        L_0x0204:
            r5.A04 = r0
            r5.A08 = r4
        L_0x0208:
            r0 = r37
            java.util.List r0 = r0.A02
            r41 = r0
            int r34 = r41.size()
            r9 = 0
            r6 = 0
            r2 = 0
            r1 = 0
        L_0x0216:
            r0 = r34
            if (r6 >= r0) goto L_0x0239
            r0 = r41
            java.lang.Object r10 = r0.get(r6)
            X.3Ur r10 = (X.C65413Ur) r10
            int r3 = r10.A00
            r0 = 1953658222(0x7472756e, float:7.683823E31)
            if (r3 != r0) goto L_0x0236
            X.4eH r3 = r10.A00
            r0 = 12
            int r0 = X.C90504eH.A02(r3, r0)
            if (r0 <= 0) goto L_0x0236
            int r1 = r1 + r0
            int r2 = r2 + 1
        L_0x0236:
            int r6 = r6 + 1
            goto L_0x0216
        L_0x0239:
            r7.A02 = r9
            r7.A00 = r9
            r7.A01 = r9
            r5.A01 = r2
            r5.A00 = r1
            int[] r0 = r5.A0C
            int r0 = r0.length
            if (r0 >= r2) goto L_0x0250
            long[] r0 = new long[r2]
            r5.A0E = r0
            int[] r0 = new int[r2]
            r5.A0C = r0
        L_0x0250:
            int[] r0 = r5.A0B
            int r0 = r0.length
            if (r0 >= r1) goto L_0x026d
            int r0 = r1 * 125
            int r1 = r0 / 100
            int[] r0 = new int[r1]
            r5.A0B = r0
            int[] r0 = new int[r1]
            r5.A0A = r0
            long[] r0 = new long[r1]
            r5.A0D = r0
            boolean[] r0 = new boolean[r1]
            r5.A0G = r0
            boolean[] r0 = new boolean[r1]
            r5.A0F = r0
        L_0x026d:
            r14 = 0
            r6 = 0
        L_0x026f:
            r0 = r34
            if (r9 >= r0) goto L_0x038d
            r0 = r41
            java.lang.Object r2 = r0.get(r9)
            X.3Ur r2 = (X.C65413Ur) r2
            int r1 = r2.A00
            r0 = 1953658222(0x7472756e, float:7.683823E31)
            if (r1 != r0) goto L_0x0389
            int r33 = r14 + 1
            X.4eH r0 = r2.A00
            r40 = r0
            r1 = 8
            int r13 = X.C90504eH.A03(r0, r1)
            r0 = 16777215(0xffffff, float:2.3509886E-38)
            r13 = r13 & r0
            X.4S8 r0 = r7.A05
            r39 = r0
            X.4Or r2 = r0.A03
            X.4LQ r15 = r5.A05
            int[] r0 = r5.A0C
            int r16 = r40.A0E()
            r0[r14] = r16
            long[] r3 = r5.A0E
            long r0 = r5.A03
            r3[r14] = r0
            r10 = r13 & 1
            if (r10 == 0) goto L_0x02b4
            int r10 = r40.A07()
            long r10 = (long) r10
            long r0 = r0 + r10
            r3[r14] = r0
        L_0x02b4:
            r0 = r13 & 4
            r3 = 0
            boolean r32 = X.AnonymousClass000.A1O(r0)
            int r0 = r15.A01
            r31 = r0
            r38 = r0
            if (r32 == 0) goto L_0x02c7
            int r31 = r40.A07()
        L_0x02c7:
            r0 = r13 & 256(0x100, float:3.59E-43)
            boolean r30 = X.AnonymousClass000.A1O(r0)
            r0 = r13 & 512(0x200, float:7.175E-43)
            boolean r29 = X.AnonymousClass000.A1O(r0)
            r0 = r13 & 1024(0x400, float:1.435E-42)
            boolean r28 = X.AnonymousClass000.A1O(r0)
            r0 = r13 & 2048(0x800, float:2.87E-42)
            boolean r27 = X.AnonymousClass000.A1O(r0)
            long[] r1 = r2.A08
            if (r1 == 0) goto L_0x0380
            int r0 = r1.length
            if (r0 != r4) goto L_0x0380
            r13 = r1[r3]
            r10 = 0
            int r0 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r0 != 0) goto L_0x0380
            long[] r0 = r2.A09
            r17 = r0[r3]
            r19 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = r2.A06
            r21 = r0
            long r25 = X.AnonymousClass3C1.A05(r17, r19, r21)
        L_0x02fd:
            int[] r0 = r5.A0B
            r24 = r0
            int[] r0 = r5.A0A
            r23 = r0
            long[] r13 = r5.A0D
            boolean[] r0 = r5.A0G
            r22 = r0
            int r21 = r6 + r16
            long r0 = r2.A06
            r19 = r0
            long r2 = r5.A04
        L_0x0313:
            r0 = r21
            if (r6 >= r0) goto L_0x0384
            if (r30 == 0) goto L_0x037d
            int r11 = r40.A07()
        L_0x031d:
            if (r11 < 0) goto L_0x0601
            if (r29 == 0) goto L_0x037a
            int r10 = r40.A07()
        L_0x0325:
            if (r10 < 0) goto L_0x0625
            if (r28 == 0) goto L_0x036e
            int r18 = r40.A07()
        L_0x032d:
            if (r27 == 0) goto L_0x0369
            r27 = 1
            int r0 = r40.A07()
            long r0 = (long) r0
            r16 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = r0 * r16
            long r0 = r0 / r19
            int r14 = (int) r0
            r23[r6] = r14
        L_0x0340:
            r0 = r19
            long r0 = X.AnonymousClass3K4.A0G(r2, r0)
            long r0 = r0 - r25
            r13[r6] = r0
            boolean r0 = r5.A08
            if (r0 != 0) goto L_0x0358
            r16 = r13[r6]
            r0 = r39
            long r0 = r0.A02
            long r16 = r16 + r0
            r13[r6] = r16
        L_0x0358:
            r24[r6] = r10
            int r0 = r18 >> 16
            r0 = r0 & 1
            boolean r0 = X.AnonymousClass000.A1P(r0)
            r22[r6] = r0
            long r0 = (long) r11
            long r2 = r2 + r0
            int r6 = r6 + 1
            goto L_0x0313
        L_0x0369:
            r27 = 0
            r23[r6] = r27
            goto L_0x0340
        L_0x036e:
            if (r6 != 0) goto L_0x0377
            if (r32 == 0) goto L_0x0377
            r32 = 1
            r18 = r31
            goto L_0x032d
        L_0x0377:
            r18 = r38
            goto L_0x032d
        L_0x037a:
            int r10 = r15.A03
            goto L_0x0325
        L_0x037d:
            int r11 = r15.A00
            goto L_0x031d
        L_0x0380:
            r25 = 0
            goto L_0x02fd
        L_0x0384:
            r5.A04 = r2
            r6 = r0
            r14 = r33
        L_0x0389:
            int r9 = r9 + 1
            goto L_0x026f
        L_0x038d:
            X.4S8 r0 = r7.A05
            X.4Or r2 = r0.A03
            X.4LQ r0 = r5.A05
            int r1 = r0.A02
            X.4Mw[] r0 = r2.A0A
            r2 = r0[r1]
            r1 = 1935763834(0x7361697a, float:1.785898E31)
            r0 = r37
            X.3Ur r0 = r0.A01(r1)
            if (r0 == 0) goto L_0x03f8
            X.4eH r11 = r0.A00
            int r10 = r2.A00
            r6 = 8
            int r3 = X.C90504eH.A03(r11, r6)
            r0 = 16777215(0xffffff, float:2.3509886E-38)
            r3 = r3 & r0
            r1 = 1
            r0 = r3 & 1
            if (r0 != r4) goto L_0x03ba
            r11.A0T(r6)
        L_0x03ba:
            int r6 = r11.A0C()
            int r3 = r11.A0E()
            int r7 = r5.A00
            if (r3 > r7) goto L_0x0608
            r7 = 0
            if (r6 != 0) goto L_0x03dd
            boolean[] r9 = r5.A0F
            r1 = 0
            r6 = 0
        L_0x03cd:
            if (r1 >= r3) goto L_0x03e6
            int r0 = r11.A0C()
            int r6 = r6 + r0
            boolean r0 = X.C13700nu.A0g(r0, r10)
            r9[r1] = r0
            int r1 = r1 + 1
            goto L_0x03cd
        L_0x03dd:
            if (r6 > r10) goto L_0x03e0
            r1 = 0
        L_0x03e0:
            int r6 = r6 * r3
            boolean[] r0 = r5.A0F
            java.util.Arrays.fill(r0, r7, r3, r1)
        L_0x03e6:
            boolean[] r1 = r5.A0F
            int r0 = r5.A00
            java.util.Arrays.fill(r1, r3, r0, r7)
            if (r6 <= 0) goto L_0x03f8
            X.4eH r0 = r5.A0H
            r0.A0Q(r6)
            r5.A07 = r4
            r5.A09 = r4
        L_0x03f8:
            r1 = 1935763823(0x7361696f, float:1.7858967E31)
            r0 = r37
            X.3Ur r0 = r0.A01(r1)
            if (r0 == 0) goto L_0x042b
            X.4eH r6 = r0.A00
            r1 = 8
            int r3 = X.C90504eH.A03(r6, r1)
            r0 = 16777215(0xffffff, float:2.3509886E-38)
            r0 = r0 & r3
            r0 = r0 & 1
            if (r0 != r4) goto L_0x0416
            r6.A0T(r1)
        L_0x0416:
            int r1 = r6.A0E()
            if (r1 != r4) goto L_0x061e
            int r0 = r3 >> 24
            r3 = r0 & 255(0xff, float:3.57E-43)
            long r0 = r5.A02
            if (r3 != 0) goto L_0x047a
            long r6 = r6.A0I()
        L_0x0428:
            long r0 = r0 + r6
            r5.A02 = r0
        L_0x042b:
            r1 = 1936027235(0x73656e63, float:1.8177412E31)
            r0 = r37
            X.3Ur r0 = r0.A01(r1)
            if (r0 == 0) goto L_0x043c
            X.4eH r1 = r0.A00
            r0 = 0
            A01(r5, r1, r0)
        L_0x043c:
            if (r2 == 0) goto L_0x0478
            java.lang.String r14 = r2.A02
        L_0x0440:
            r7 = 0
            r6 = 0
            r13 = r7
            r9 = r7
            r11 = 0
        L_0x0445:
            int r0 = r41.size()
            if (r11 >= r0) goto L_0x047f
            r0 = r41
            java.lang.Object r0 = r0.get(r11)
            X.3Ur r0 = (X.C65413Ur) r0
            X.4eH r10 = r0.A00
            int r3 = r0.A00
            r0 = 1935828848(0x73626770, float:1.7937577E31)
            r2 = 1936025959(0x73656967, float:1.817587E31)
            r1 = 12
            if (r3 != r0) goto L_0x046b
            int r0 = X.C90504eH.A03(r10, r1)
            if (r0 != r2) goto L_0x0468
            r13 = r10
        L_0x0468:
            int r11 = r11 + 1
            goto L_0x0445
        L_0x046b:
            r0 = 1936158820(0x73677064, float:1.8336489E31)
            if (r3 != r0) goto L_0x0468
            int r0 = X.C90504eH.A03(r10, r1)
            if (r0 != r2) goto L_0x0468
            r9 = r10
            goto L_0x0468
        L_0x0478:
            r14 = 0
            goto L_0x0440
        L_0x047a:
            long r6 = r6.A0J()
            goto L_0x0428
        L_0x047f:
            if (r13 == 0) goto L_0x04fc
            if (r9 == 0) goto L_0x04fc
            r1 = 8
            int r0 = X.C90504eH.A03(r13, r1)
            int r0 = r0 >> 24
            r0 = r0 & 255(0xff, float:3.57E-43)
            r2 = 4
            r13.A0T(r2)
            if (r0 != r4) goto L_0x0496
            r13.A0T(r2)
        L_0x0496:
            int r0 = r13.A07()
            if (r0 != r4) goto L_0x0618
            int r0 = X.C90504eH.A03(r9, r1)
            int r0 = r0 >> 24
            r1 = r0 & 255(0xff, float:3.57E-43)
            r9.A0T(r2)
            if (r1 != r4) goto L_0x04b7
            long r10 = r9.A0I()
            r1 = 0
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x04bd
            java.lang.String r0 = "Variable length description in sgpd found (unsupported)"
            goto L_0x062b
        L_0x04b7:
            r0 = 2
            if (r1 < r0) goto L_0x04bd
            r9.A0T(r2)
        L_0x04bd:
            long r10 = r9.A0I()
            r1 = 1
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x061b
            int r1 = X.C90504eH.A01(r9, r4)
            r0 = r1 & 240(0xf0, float:3.36E-43)
            int r18 = r0 >> 4
            r19 = r1 & 15
            int r0 = r9.A0C()
            if (r0 != r4) goto L_0x04fc
            int r17 = r9.A0C()
            r0 = 16
            byte[] r1 = new byte[r0]
            r9.A0V(r1, r6, r0)
            if (r17 != 0) goto L_0x04ed
            int r0 = r9.A0C()
            byte[] r7 = new byte[r0]
            r9.A0V(r7, r6, r0)
        L_0x04ed:
            r5.A07 = r4
            X.4Mw r0 = new X.4Mw
            r20 = 1
            r13 = r0
            r15 = r1
            r16 = r7
            r13.<init>(r14, r15, r16, r17, r18, r19, r20)
            r5.A06 = r0
        L_0x04fc:
            int r7 = r41.size()
            r4 = 0
        L_0x0501:
            if (r4 >= r7) goto L_0x0552
            r0 = r41
            java.lang.Object r2 = r0.get(r4)
            X.3Ur r2 = (X.C65413Ur) r2
            int r1 = r2.A00
            r0 = 1970628964(0x75756964, float:3.1109627E32)
            if (r1 != r0) goto L_0x052b
            X.4eH r3 = r2.A00
            r0 = 8
            r3.A0S(r0)
            r2 = 16
            r0 = r43
            r3.A0V(r0, r6, r2)
            byte[] r1 = A0V
            boolean r0 = java.util.Arrays.equals(r0, r1)
            if (r0 == 0) goto L_0x052b
            A01(r5, r3, r2)
        L_0x052b:
            int r4 = r4 + 1
            goto L_0x0501
        L_0x052e:
            long r0 = r1.A0I()
            goto L_0x0204
        L_0x0534:
            r5.A04 = r0
            r5.A08 = r6
            goto L_0x0208
        L_0x053a:
            int r1 = r1.A01
            goto L_0x01d4
        L_0x053e:
            int r2 = r1.A03
            goto L_0x01cc
        L_0x0542:
            int r3 = r1.A00
            goto L_0x01c4
        L_0x0546:
            int r6 = r1.A02
            goto L_0x01bc
        L_0x054a:
            r0 = r44
            java.lang.Object r7 = r0.get(r2)
            goto L_0x019e
        L_0x0552:
            int r36 = r36 + 1
            goto L_0x015e
        L_0x0556:
            java.util.List r0 = r12.A02
            X.57J r5 = A00(r0)
            r9 = 0
            if (r5 == 0) goto L_0x05ad
            int r4 = r44.size()
            r3 = 0
        L_0x0564:
            if (r3 >= r4) goto L_0x05ad
            r0 = r44
            java.lang.Object r6 = r0.valueAt(r3)
            X.4Wx r6 = (X.C87474Wx) r6
            X.4S8 r0 = r6.A05
            X.4Or r2 = r0.A03
            X.4PE r0 = r6.A08
            X.4LQ r0 = r0.A05
            int r1 = r0.A02
            X.4Mw[] r0 = r2.A0A
            r0 = r0[r1]
            if (r0 == 0) goto L_0x05ab
            java.lang.String r1 = r0.A02
        L_0x0580:
            java.lang.String r0 = r5.A01
            boolean r0 = X.AnonymousClass3C1.A0F(r0, r1)
            if (r0 == 0) goto L_0x05a3
            r2 = r5
        L_0x0589:
            X.4S8 r0 = r6.A05
            X.4Or r0 = r0.A03
            X.1gT r1 = r0.A07
            X.1gR r0 = new X.1gR
            r0.<init>(r1)
            r0.A0I = r2
            X.1gT r1 = new X.1gT
            r1.<init>((X.C32471gR) r0)
            X.1gS r0 = r6.A07
            r0.A9D(r1)
            int r3 = r3 + 1
            goto L_0x0564
        L_0x05a3:
            X.4jV[] r0 = r5.A02
            X.57J r2 = new X.57J
            r2.<init>(r1, r0, r9)
            goto L_0x0589
        L_0x05ab:
            r1 = 0
            goto L_0x0580
        L_0x05ad:
            long r3 = r8.A0A
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0000
            int r10 = r44.size()
        L_0x05bc:
            if (r9 >= r10) goto L_0x05ea
            r0 = r44
            java.lang.Object r11 = r0.valueAt(r9)
            X.4Wx r11 = (X.C87474Wx) r11
            int r7 = r11.A01
        L_0x05c8:
            X.4PE r12 = r11.A08
            int r0 = r12.A00
            if (r7 >= r0) goto L_0x05e7
            long[] r0 = r12.A0D
            r13 = r0[r7]
            int[] r0 = r12.A0A
            r0 = r0[r7]
            long r5 = (long) r0
            long r13 = r13 + r5
            int r0 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x05e7
            boolean[] r0 = r12.A0G
            boolean r0 = r0[r7]
            if (r0 == 0) goto L_0x05e4
            r11.A03 = r7
        L_0x05e4:
            int r7 = r7 + 1
            goto L_0x05c8
        L_0x05e7:
            int r9 = r9 + 1
            goto L_0x05bc
        L_0x05ea:
            r8.A0A = r1
            goto L_0x0000
        L_0x05ee:
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x0000
            java.lang.Object r0 = r3.peek()
            X.3Us r0 = (X.C65423Us) r0
            java.util.List r0 = r0.A01
            r0.add(r12)
            goto L_0x0000
        L_0x0601:
            java.lang.String r0 = "Unexpected negative value: "
            java.lang.String r0 = X.C13680ns.A0c(r11, r0)
            goto L_0x062b
        L_0x0608:
            java.lang.String r0 = "Saiz sample count "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            r1.append(r3)
            java.lang.String r0 = " is greater than fragment sample count"
            java.lang.String r0 = X.C13680ns.A0i(r0, r1, r7)
            goto L_0x062b
        L_0x0618:
            java.lang.String r0 = "Entry count in sbgp != 1 (unsupported)."
            goto L_0x062b
        L_0x061b:
            java.lang.String r0 = "Entry count in sgpd != 1 (unsupported)."
            goto L_0x062b
        L_0x061e:
            java.lang.String r0 = "Unexpected saio entry count: "
            java.lang.String r0 = X.C13680ns.A0c(r1, r0)
            goto L_0x062b
        L_0x0625:
            java.lang.String r0 = "Unexpected negative value: "
            java.lang.String r0 = X.C13680ns.A0c(r10, r0)
        L_0x062b:
            X.40M r0 = X.AnonymousClass40M.A00(r0)
            throw r0
        L_0x0630:
            r0 = 0
            r8.A02 = r0
            r8.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C96604ob.A02(long):void");
    }

    public void AHx(C15060qG r8) {
        this.A0C = r8;
        this.A02 = 0;
        this.A00 = 0;
        C32481gS[] r0 = new C32481gS[2];
        this.A0I = r0;
        int i2 = 0;
        int i3 = 100;
        C32481gS[] r3 = (C32481gS[]) Arrays.copyOf(r0, 0);
        this.A0I = r3;
        for (C32481gS A9D : r3) {
            A9D.A9D(A0U);
        }
        List list = this.A0S;
        C32481gS[] r02 = new C32481gS[list.size()];
        this.A0H = r02;
        while (i2 < r02.length) {
            C32481gS Ah1 = this.A0C.Ah1(i3, 3);
            Ah1.A9D((C32491gT) list.get(i2));
            r02 = this.A0H;
            r02[i2] = Ah1;
            i2++;
            i3++;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:200:0x041e, code lost:
        if (r10 == 1701671783) goto L_0x0420;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x0497, code lost:
        r12 = 4;
        r11 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x049d, code lost:
        if (r0.A02 != 3) goto L_0x052f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x04a1, code lost:
        if (r5.A06 != false) goto L_0x04e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x04a3, code lost:
        r1 = r5.A05.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x04a7, code lost:
        r7 = r5.A01;
        r2 = r1[r7];
        r0.A06 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x04af, code lost:
        if (r7 >= r5.A03) goto L_0x04eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x04b1, code lost:
        r3.Afx(r2);
        r1 = r5.A01();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x04b8, code lost:
        if (r1 == null) goto L_0x04da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x04ba, code lost:
        r7 = r5.A08;
        r3 = r7.A0H;
        r1 = r1.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x04c0, code lost:
        if (r1 == 0) goto L_0x04c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x04c2, code lost:
        r3.A0T(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x04c5, code lost:
        r2 = r5.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x04c9, code lost:
        if (r7.A07 == false) goto L_0x04da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x04cf, code lost:
        if (r7.A0F[r2] == false) goto L_0x04da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x04d1, code lost:
        r3.A0T(r3.A0F() * 6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x04de, code lost:
        if (r5.A03() != false) goto L_0x04e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x04e0, code lost:
        r0.A0D = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x04e2, code lost:
        r0.A02 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x04e6, code lost:
        r1 = r5.A08.A0B;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x04f1, code lost:
        if (r5.A05.A03.A02 != 1) goto L_0x04fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x04f3, code lost:
        r0.A06 = r2 - 8;
        r3.Afx(8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x04fb, code lost:
        r2 = "audio/ac4".equals(r5.A05.A03.A07.A0T);
        r1 = r0.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x050b, code lost:
        if (r2 == false) goto L_0x0602;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x050d, code lost:
        r0.A04 = r5.A00(r1, 7);
        r1 = r0.A06;
        r2 = r0.A0P;
        X.C89654cc.A00(r2, r1);
        r5.A07.Acw(r2, 7);
        r2 = r0.A04 + 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x0524, code lost:
        r0.A04 = r2;
        r0.A06 += r2;
        r0.A02 = 4;
        r0.A05 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x052f, code lost:
        r2 = r5.A05;
        r10 = r2.A03;
        r9 = r5.A07;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x0537, code lost:
        if (r5.A06 != false) goto L_0x05f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x0539, code lost:
        r1 = r2.A07[r5.A01];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x053f, code lost:
        r4 = r10.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x0541, code lost:
        if (r4 == 0) goto L_0x0608;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x0543, code lost:
        r14 = r0.A0N;
        r7 = r14.A02;
        r7[0] = 0;
        r7[1] = 0;
        r7[2] = 0;
        r17 = r4 + 1;
        r13 = 4 - r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x0551, code lost:
        r4 = r0.A04;
        r6 = r0.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x0555, code lost:
        if (r4 >= r6) goto L_0x0619;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x0557, code lost:
        r6 = r0.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x0559, code lost:
        if (r6 != 0) goto L_0x05ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x055b, code lost:
        r3.readFully(r7, r13, r17);
        r4 = X.C90504eH.A03(r14, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x0564, code lost:
        if (r4 < r11) goto L_0x0688;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x0566, code lost:
        r0.A05 = r4 - 1;
        r4 = r0.A0O;
        r4.A0S(0);
        r9.Acw(r4, r12);
        r9.Acw(r14, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x0578, code lost:
        if (r0.A0H.length <= 0) goto L_0x05ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x057a, code lost:
        r6 = r10.A07.A0T;
        r16 = r7[r12];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x0586, code lost:
        if ("video/avc".equals(r6) == false) goto L_0x058d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x058b, code lost:
        if ((r16 & 31) == 6) goto L_0x059c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x0593, code lost:
        if ("video/hevc".equals(r6) == false) goto L_0x05ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x059a, code lost:
        if (((r16 & 126) >> r11) != 39) goto L_0x05ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x059c, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x059d, code lost:
        r0.A0G = r4;
        r0.A04 += 5;
        r0.A06 += r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x05ab, code lost:
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x05af, code lost:
        if (r0.A0G == false) goto L_0x05ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x05b1, code lost:
        r11 = r0.A0M;
        r11.A0Q(r6);
        r3.readFully(r11.A02, 0, r6);
        r9.Acw(r11, r0.A05);
        r6 = r0.A05;
        r12 = X.C90674eb.A00(r11.A02, r11.A00);
        r11.A0S("video/hevc".equals(r10.A07.A0T) ? 1 : 0);
        r11.A0R(r12);
        X.C87504Xd.A00(r11, r0.A0H, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x05df, code lost:
        r0.A04 += r6;
        r0.A05 -= r6;
        r12 = 4;
        r11 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x05ed, code lost:
        r6 = r9.Acz(r3, r6, 0, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x05f2, code lost:
        r4 = r5.A08;
        r6 = r5.A01;
        r1 = r4.A0D[r6] + ((long) r4.A0A[r6]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x0602, code lost:
        r2 = r5.A00(r1, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x0608, code lost:
        r4 = r0.A04;
        r6 = r0.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x060c, code lost:
        if (r4 >= r6) goto L_0x0619;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x060e, code lost:
        r0.A04 += r9.Acz(r3, r6 - r4, 0, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x061b, code lost:
        if (r5.A06 != false) goto L_0x0666;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x061d, code lost:
        r8 = r5.A05.A04[r5.A01];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x0625, code lost:
        r4 = r5.A01();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x0629, code lost:
        if (r4 == null) goto L_0x062e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x062b, code lost:
        r8 = r8 | 1073741824;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x062e, code lost:
        if (r4 == null) goto L_0x0664;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x0630, code lost:
        r3 = r4.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x0632, code lost:
        r9.Ad0(r3, r8, r6, 0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:0x063a, code lost:
        r4 = r0.A0R;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x0640, code lost:
        if (r4.isEmpty() != false) goto L_0x0672;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x0642, code lost:
        r4 = (X.AnonymousClass4GB) r4.removeFirst();
        r3 = r0.A03;
        r10 = r4.A00;
        r0.A03 = r3 - r10;
        r12 = r4.A01 + r1;
        r6 = r0.A0I;
        r4 = r6.length;
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x0656, code lost:
        if (r3 >= r4) goto L_0x063a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x0658, code lost:
        r6[r3].Ad0((X.C86824Uh) null, 1, r10, r0.A03, r12);
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x0664, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x066e, code lost:
        if (r5.A08.A0G[r5.A01] == false) goto L_0x0625;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:305:0x0670, code lost:
        r8 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x0676, code lost:
        if (r5.A03() != false) goto L_0x067b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x0678, code lost:
        r0.A0D = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:0x067b, code lost:
        r0.A02 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:0x0688, code lost:
        r0 = "Invalid NAL length";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:365:?, code lost:
        return 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:366:?, code lost:
        return 0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x02ed  */
    /* JADX WARNING: Removed duplicated region for block: B:333:0x06a1 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int AbN(X.C55142iu r27, X.AnonymousClass4Bt r28) {
        /*
            r26 = this;
        L_0x0000:
            r0 = r26
            int r1 = r0.A02
            r3 = r27
            if (r1 == 0) goto L_0x02a4
            r9 = 1
            if (r1 == r9) goto L_0x00bf
            r13 = 2
            if (r1 == r13) goto L_0x0071
            X.4Wx r5 = r0.A0D
            r8 = 0
            if (r5 != 0) goto L_0x0497
            android.util.SparseArray r11 = r0.A0J
            int r10 = r11.size()
            r5 = 0
            r14 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r9 = 0
        L_0x0020:
            if (r9 >= r10) goto L_0x005d
            java.lang.Object r4 = r11.valueAt(r9)
            X.4Wx r4 = (X.C87474Wx) r4
            boolean r1 = r4.A06
            if (r1 != 0) goto L_0x0034
            int r2 = r4.A01
            X.4S8 r1 = r4.A05
            int r1 = r1.A01
            if (r2 == r1) goto L_0x0040
        L_0x0034:
            boolean r1 = r4.A06
            if (r1 == 0) goto L_0x0043
            int r2 = r4.A02
            X.4PE r1 = r4.A08
            int r1 = r1.A01
            if (r2 != r1) goto L_0x0043
        L_0x0040:
            int r9 = r9 + 1
            goto L_0x0020
        L_0x0043:
            boolean r1 = r4.A06
            if (r1 != 0) goto L_0x0056
            X.4S8 r1 = r4.A05
            long[] r2 = r1.A06
            int r1 = r4.A01
        L_0x004d:
            r6 = r2[r1]
            int r1 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r1 >= 0) goto L_0x0040
            r5 = r4
            r14 = r6
            goto L_0x0040
        L_0x0056:
            X.4PE r1 = r4.A08
            long[] r2 = r1.A0E
            int r1 = r4.A02
            goto L_0x004d
        L_0x005d:
            if (r5 != 0) goto L_0x0476
            long r4 = r0.A09
            long r1 = r3.AF7()
            long r4 = r4 - r1
            int r1 = (int) r4
            if (r1 < 0) goto L_0x06a4
            r3.Afx(r1)
            r0.A02 = r8
            r0.A00 = r8
            goto L_0x0000
        L_0x0071:
            android.util.SparseArray r10 = r0.A0J
            int r9 = r10.size()
            r2 = 0
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r8 = 0
        L_0x007e:
            if (r8 >= r9) goto L_0x009c
            java.lang.Object r1 = r10.valueAt(r8)
            X.4Wx r1 = (X.C87474Wx) r1
            X.4PE r6 = r1.A08
            boolean r1 = r6.A09
            if (r1 == 0) goto L_0x0099
            long r6 = r6.A02
            int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r1 >= 0) goto L_0x0099
            java.lang.Object r2 = r10.valueAt(r8)
            X.4Wx r2 = (X.C87474Wx) r2
            r4 = r6
        L_0x0099:
            int r8 = r8 + 1
            goto L_0x007e
        L_0x009c:
            if (r2 != 0) goto L_0x00a1
            r1 = 3
            goto L_0x0365
        L_0x00a1:
            long r0 = r3.AF7()
            long r4 = r4 - r0
            int r0 = (int) r4
            if (r0 < 0) goto L_0x068b
            r3.Afx(r0)
            X.4PE r5 = r2.A08
            X.4eH r4 = r5.A0H
            byte[] r2 = r4.A02
            int r1 = r4.A00
            r0 = 0
            r3.readFully(r2, r0, r1)
            r4.A0S(r0)
            r5.A09 = r0
            goto L_0x0000
        L_0x00bf:
            long r1 = r0.A07
            int r4 = (int) r1
            int r1 = r0.A00
            int r4 = r4 - r1
            X.4eH r5 = r0.A0E
            if (r5 == 0) goto L_0x029f
            byte[] r2 = r5.A02
            r1 = 8
            r3.readFully(r2, r1, r4)
            int r1 = r0.A01
            X.3Ur r4 = new X.3Ur
            r4.<init>(r5, r1)
            long r18 = r3.AF7()
            java.util.ArrayDeque r2 = r0.A0Q
            boolean r1 = r2.isEmpty()
            if (r1 != 0) goto L_0x00f7
            java.lang.Object r1 = r2.peek()
            X.3Us r1 = (X.C65423Us) r1
            java.util.List r1 = r1.A02
            r1.add(r4)
        L_0x00ee:
            long r1 = r3.AF7()
            r0.A02(r1)
            goto L_0x0000
        L_0x00f7:
            int r2 = r4.A00
            r1 = 1936286840(0x73696478, float:1.8491255E31)
            if (r2 != r1) goto L_0x0193
            X.4eH r8 = r4.A00
            r1 = 8
            int r1 = X.C90504eH.A03(r8, r1)
            int r1 = r1 >> 24
            r2 = r1 & 255(0xff, float:3.57E-43)
            r1 = 4
            r8.A0T(r1)
            long r24 = r8.A0I()
            if (r2 != 0) goto L_0x0168
            long r20 = r8.A0I()
            long r1 = r8.A0I()
        L_0x011c:
            long r18 = r18 + r1
            r22 = 1000000(0xf4240, double:4.940656E-318)
            long r16 = X.AnonymousClass3C1.A05(r20, r22, r24)
            r1 = 2
            r8.A0T(r1)
            int r7 = r8.A0F()
            int[] r6 = new int[r7]
            long[] r5 = new long[r7]
            long[] r4 = new long[r7]
            long[] r2 = new long[r7]
            r14 = r16
            r1 = 0
        L_0x0138:
            if (r1 >= r7) goto L_0x0171
            int r13 = r8.A07()
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
            r10 = r10 & r13
            if (r10 != 0) goto L_0x068e
            long r11 = r8.A0I()
            r10 = 2147483647(0x7fffffff, float:NaN)
            r13 = r13 & r10
            r6[r1] = r13
            r5[r1] = r18
            r2[r1] = r14
            long r20 = r20 + r11
            long r12 = X.AnonymousClass3C1.A05(r20, r22, r24)
            long r10 = r12 - r14
            r4[r1] = r10
            r10 = 4
            r8.A0T(r10)
            r10 = r6[r1]
            long r10 = (long) r10
            long r18 = r18 + r10
            int r1 = r1 + 1
            r14 = r12
            goto L_0x0138
        L_0x0168:
            long r20 = r8.A0J()
            long r1 = r8.A0J()
            goto L_0x011c
        L_0x0171:
            java.lang.Long r7 = java.lang.Long.valueOf(r16)
            X.4oo r1 = new X.4oo
            r1.<init>(r6, r5, r4, r2)
            android.util.Pair r4 = android.util.Pair.create(r7, r1)
            java.lang.Object r1 = r4.first
            long r1 = X.C13700nu.A01(r1)
            r0.A0B = r1
            X.0qG r2 = r0.A0C
            java.lang.Object r1 = r4.second
            X.1gD r1 = (X.C32371gD) r1
            r2.AdD(r1)
            r0.A0F = r9
            goto L_0x00ee
        L_0x0193:
            r1 = 1701671783(0x656d7367, float:7.0083103E22)
            if (r2 != r1) goto L_0x00ee
            X.4eH r11 = r4.A00
            X.1gS[] r1 = r0.A0I
            int r1 = r1.length
            if (r1 == 0) goto L_0x00ee
            r1 = 8
            int r1 = X.C90504eH.A03(r11, r1)
            int r1 = r1 >> 24
            r2 = r1 & 255(0xff, float:3.57E-43)
            r13 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r2 == 0) goto L_0x01bf
            if (r2 == r9) goto L_0x01f1
            java.lang.String r1 = "Skipping unsupported emsg version: "
            java.lang.String r2 = X.C13680ns.A0c(r2, r1)
            java.lang.String r1 = "FragmentedMp4Extractor"
            android.util.Log.w(r1, r2)
            goto L_0x00ee
        L_0x01bf:
            java.lang.String r16 = r11.A0M()
            java.lang.String r17 = r11.A0M()
            long r9 = r11.A0I()
            long r1 = r11.A0I()
            long r7 = X.AnonymousClass3K4.A0G(r1, r9)
            long r5 = r0.A0B
            int r1 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r1 == 0) goto L_0x01eb
            long r5 = r5 + r7
        L_0x01da:
            long r18 = r11.A0I()
            r20 = 1000(0x3e8, double:4.94E-321)
            r22 = r9
            long r19 = X.AnonymousClass3C1.A05(r18, r20, r22)
            long r21 = r11.A0I()
            goto L_0x021a
        L_0x01eb:
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x01da
        L_0x01f1:
            long r1 = r11.A0I()
            long r4 = r11.A0J()
            long r5 = X.AnonymousClass3K4.A0G(r4, r1)
            long r15 = r11.A0I()
            r17 = 1000(0x3e8, double:4.94E-321)
            r19 = r1
            long r19 = X.AnonymousClass3C1.A05(r15, r17, r19)
            long r21 = r11.A0I()
            java.lang.String r16 = r11.A0M()
            java.lang.String r17 = r11.A0M()
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x021a:
            int r2 = X.C90504eH.A00(r11)
            byte[] r1 = new byte[r2]
            r4 = 0
            r11.A0V(r1, r4, r2)
            X.4pb r15 = new X.4pb
            r18 = r1
            r15.<init>(r16, r17, r18, r19, r21)
            X.4ak r1 = r0.A0K
            java.io.ByteArrayOutputStream r10 = r1.A00
            r10.reset()
            java.io.DataOutputStream r9 = r1.A01     // Catch:{ IOException -> 0x0691 }
            java.lang.String r1 = r15.A03     // Catch:{ IOException -> 0x0691 }
            r9.writeBytes(r1)     // Catch:{ IOException -> 0x0691 }
            r9.writeByte(r4)     // Catch:{ IOException -> 0x0691 }
            java.lang.String r1 = r15.A04     // Catch:{ IOException -> 0x0691 }
            if (r1 != 0) goto L_0x0242
            java.lang.String r1 = ""
        L_0x0242:
            r9.writeBytes(r1)     // Catch:{ IOException -> 0x0691 }
            r9.writeByte(r4)     // Catch:{ IOException -> 0x0691 }
            long r1 = r15.A01     // Catch:{ IOException -> 0x0691 }
            X.C88584ak.A00(r9, r1)     // Catch:{ IOException -> 0x0691 }
            long r1 = r15.A02     // Catch:{ IOException -> 0x0691 }
            X.C88584ak.A00(r9, r1)     // Catch:{ IOException -> 0x0691 }
            byte[] r1 = r15.A05     // Catch:{ IOException -> 0x0691 }
            r9.write(r1)     // Catch:{ IOException -> 0x0691 }
            r9.flush()     // Catch:{ IOException -> 0x0691 }
            byte[] r1 = r10.toByteArray()     // Catch:{ IOException -> 0x0691 }
            X.4eH r12 = new X.4eH
            r12.<init>((byte[]) r1)
            int r9 = X.C90504eH.A00(r12)
            X.1gS[] r11 = r0.A0I
            int r10 = r11.length
            r2 = 0
        L_0x026b:
            if (r2 >= r10) goto L_0x0278
            r1 = r11[r2]
            r12.A0S(r4)
            r1.Acw(r12, r9)
            int r2 = r2 + 1
            goto L_0x026b
        L_0x0278:
            int r1 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r1 != 0) goto L_0x028d
            java.util.ArrayDeque r2 = r0.A0R
            X.4GB r1 = new X.4GB
            r1.<init>(r7, r9)
            r2.addLast(r1)
            int r1 = r0.A03
            int r1 = r1 + r9
            r0.A03 = r1
            goto L_0x00ee
        L_0x028d:
            X.1gS[] r2 = r0.A0I
            int r1 = r2.length
        L_0x0290:
            if (r4 >= r1) goto L_0x00ee
            r10 = r2[r4]
            r14 = 0
            r11 = 0
            r12 = 1
            r13 = r9
            r15 = r5
            r10.Ad0(r11, r12, r13, r14, r15)
            int r4 = r4 + 1
            goto L_0x0290
        L_0x029f:
            r3.Afx(r4)
            goto L_0x00ee
        L_0x02a4:
            int r1 = r0.A00
            r7 = 8
            r6 = 0
            r8 = 1
            if (r1 != 0) goto L_0x02c9
            X.4eH r4 = r0.A0L
            byte[] r1 = r4.A02
            boolean r1 = r3.AbV(r1, r6, r7, r8)
            if (r1 != 0) goto L_0x02b8
            r0 = -1
            return r0
        L_0x02b8:
            r0.A00 = r7
            r4.A0S(r6)
            long r1 = r4.A0I()
            r0.A07 = r1
            int r1 = r4.A07()
            r0.A01 = r1
        L_0x02c9:
            long r1 = r0.A07
            r9 = 1
            int r4 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r4 != 0) goto L_0x032c
            X.4eH r2 = r0.A0L
            byte[] r1 = r2.A02
            r3.readFully(r1, r7, r7)
            int r1 = r0.A00
            int r1 = r1 + 8
            r0.A00 = r1
            long r4 = r2.A0J()
        L_0x02e2:
            r0.A07 = r4
        L_0x02e4:
            long r4 = r0.A07
            int r1 = r0.A00
            long r1 = (long) r1
            int r9 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r9 < 0) goto L_0x06a1
            long r4 = r3.AF7()
            long r4 = r4 - r1
            int r1 = r0.A01
            r12 = 1835295092(0x6d646174, float:4.4175247E27)
            r11 = 1836019558(0x6d6f6f66, float:4.6313494E27)
            if (r1 == r11) goto L_0x02fe
            if (r1 != r12) goto L_0x0310
        L_0x02fe:
            boolean r1 = r0.A0F
            if (r1 != 0) goto L_0x0310
            X.0qG r10 = r0.A0C
            long r1 = r0.A08
            X.1gC r9 = new X.1gC
            r9.<init>(r1, r4)
            r10.AdD(r9)
            r0.A0F = r8
        L_0x0310:
            int r10 = r0.A01
            if (r10 != r11) goto L_0x035a
            android.util.SparseArray r7 = r0.A0J
            int r6 = r7.size()
            r2 = 0
        L_0x031b:
            if (r2 >= r6) goto L_0x044d
            java.lang.Object r1 = r7.valueAt(r2)
            X.4Wx r1 = (X.C87474Wx) r1
            X.4PE r1 = r1.A08
            r1.A02 = r4
            r1.A03 = r4
            int r2 = r2 + 1
            goto L_0x031b
        L_0x032c:
            r9 = 0
            int r4 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r4 != 0) goto L_0x02e4
            long r4 = r3.getLength()
            r9 = -1
            int r1 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r1 != 0) goto L_0x034c
            java.util.ArrayDeque r2 = r0.A0Q
            boolean r1 = r2.isEmpty()
            if (r1 != 0) goto L_0x034c
            java.lang.Object r1 = r2.peek()
            X.3Us r1 = (X.C65423Us) r1
            long r4 = r1.A00
        L_0x034c:
            int r1 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r1 == 0) goto L_0x02e4
            long r1 = r3.AF7()
            long r4 = r4 - r1
            int r1 = r0.A00
            long r1 = (long) r1
            long r4 = r4 + r1
            goto L_0x02e2
        L_0x035a:
            r9 = 0
            if (r10 != r12) goto L_0x0369
            r0.A0D = r9
            long r1 = r0.A07
            long r4 = r4 + r1
            r0.A09 = r4
            r1 = 2
        L_0x0365:
            r0.A02 = r1
            goto L_0x0000
        L_0x0369:
            r1 = 1836019574(0x6d6f6f76, float:4.631354E27)
            if (r10 == r1) goto L_0x044d
            r1 = 1953653099(0x7472616b, float:7.681346E31)
            if (r10 == r1) goto L_0x044d
            r1 = 1835297121(0x6d646961, float:4.4181236E27)
            if (r10 == r1) goto L_0x044d
            r1 = 1835626086(0x6d696e66, float:4.515217E27)
            if (r10 == r1) goto L_0x044d
            r1 = 1937007212(0x7374626c, float:1.9362132E31)
            if (r10 == r1) goto L_0x044d
            if (r10 == r11) goto L_0x044d
            r1 = 1953653094(0x74726166, float:7.6813435E31)
            if (r10 == r1) goto L_0x044d
            r1 = 1836475768(0x6d766578, float:4.7659988E27)
            if (r10 == r1) goto L_0x044d
            r1 = 1701082227(0x65647473, float:6.742798E22)
            if (r10 == r1) goto L_0x044d
            r1 = 1751411826(0x68646c72, float:4.3148E24)
            if (r10 == r1) goto L_0x0420
            r1 = 1835296868(0x6d646864, float:4.418049E27)
            if (r10 == r1) goto L_0x0420
            r1 = 1836476516(0x6d766864, float:4.7662196E27)
            if (r10 == r1) goto L_0x0420
            r1 = 1936286840(0x73696478, float:1.8491255E31)
            if (r10 == r1) goto L_0x0420
            r1 = 1937011556(0x73747364, float:1.9367383E31)
            if (r10 == r1) goto L_0x0420
            r1 = 1937011827(0x73747473, float:1.9367711E31)
            if (r10 == r1) goto L_0x0420
            r1 = 1668576371(0x63747473, float:4.5093966E21)
            if (r10 == r1) goto L_0x0420
            r1 = 1937011555(0x73747363, float:1.9367382E31)
            if (r10 == r1) goto L_0x0420
            r1 = 1937011578(0x7374737a, float:1.936741E31)
            if (r10 == r1) goto L_0x0420
            r1 = 1937013298(0x73747a32, float:1.9369489E31)
            if (r10 == r1) goto L_0x0420
            r1 = 1937007471(0x7374636f, float:1.9362445E31)
            if (r10 == r1) goto L_0x0420
            r1 = 1668232756(0x636f3634, float:4.4126776E21)
            if (r10 == r1) goto L_0x0420
            r1 = 1937011571(0x73747373, float:1.9367401E31)
            if (r10 == r1) goto L_0x0420
            r1 = 1952867444(0x74666474, float:7.3014264E31)
            if (r10 == r1) goto L_0x0420
            r1 = 1952868452(0x74666864, float:7.301914E31)
            if (r10 == r1) goto L_0x0420
            r1 = 1953196132(0x746b6864, float:7.46037E31)
            if (r10 == r1) goto L_0x0420
            r1 = 1953654136(0x74726578, float:7.6818474E31)
            if (r10 == r1) goto L_0x0420
            r1 = 1953658222(0x7472756e, float:7.683823E31)
            if (r10 == r1) goto L_0x0420
            r1 = 1886614376(0x70737368, float:3.013775E29)
            if (r10 == r1) goto L_0x0420
            r1 = 1935763834(0x7361697a, float:1.785898E31)
            if (r10 == r1) goto L_0x0420
            r1 = 1935763823(0x7361696f, float:1.7858967E31)
            if (r10 == r1) goto L_0x0420
            r1 = 1936027235(0x73656e63, float:1.8177412E31)
            if (r10 == r1) goto L_0x0420
            r1 = 1970628964(0x75756964, float:3.1109627E32)
            if (r10 == r1) goto L_0x0420
            r1 = 1935828848(0x73626770, float:1.7937577E31)
            if (r10 == r1) goto L_0x0420
            r1 = 1936158820(0x73677064, float:1.8336489E31)
            if (r10 == r1) goto L_0x0420
            r1 = 1701606260(0x656c7374, float:6.9788014E22)
            if (r10 == r1) goto L_0x0420
            r1 = 1835362404(0x6d656864, float:4.4373917E27)
            if (r10 == r1) goto L_0x0420
            r2 = 1701671783(0x656d7367, float:7.0083103E22)
            r1 = 0
            if (r10 != r2) goto L_0x0421
        L_0x0420:
            r1 = 1
        L_0x0421:
            r4 = 2147483647(0x7fffffff, double:1.060997895E-314)
            if (r1 == 0) goto L_0x0444
            int r1 = r0.A00
            if (r1 != r7) goto L_0x069b
            long r2 = r0.A07
            int r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r1 > 0) goto L_0x0698
            int r1 = (int) r2
            X.4eH r3 = X.C90504eH.A05(r1)
            X.4eH r1 = r0.A0L
            byte[] r2 = r1.A02
            byte[] r1 = r3.A02
            java.lang.System.arraycopy(r2, r6, r1, r6, r7)
            r0.A0E = r3
        L_0x0440:
            r0.A02 = r8
            goto L_0x0000
        L_0x0444:
            long r2 = r0.A07
            int r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r1 > 0) goto L_0x069e
            r0.A0E = r9
            goto L_0x0440
        L_0x044d:
            long r4 = r3.AF7()
            long r1 = r0.A07
            long r4 = r4 + r1
            r1 = 8
            long r4 = r4 - r1
            java.util.ArrayDeque r2 = r0.A0Q
            X.3Us r1 = new X.3Us
            r1.<init>(r10, r4)
            r2.push(r1)
            long r6 = r0.A07
            int r1 = r0.A00
            long r2 = (long) r1
            int r1 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r1 != 0) goto L_0x046f
            r0.A02(r4)
            goto L_0x0000
        L_0x046f:
            r1 = 0
            r0.A02 = r1
            r0.A00 = r1
            goto L_0x0000
        L_0x0476:
            boolean r1 = r5.A06
            if (r1 != 0) goto L_0x0680
            X.4S8 r1 = r5.A05
            long[] r2 = r1.A06
            int r1 = r5.A01
        L_0x0480:
            r1 = r2[r1]
            long r6 = r3.AF7()
            long r1 = r1 - r6
            int r4 = (int) r1
            if (r4 >= 0) goto L_0x0492
            java.lang.String r2 = "FragmentedMp4Extractor"
            java.lang.String r1 = "Ignoring negative offset to sample data."
            android.util.Log.w(r2, r1)
            r4 = 0
        L_0x0492:
            r3.Afx(r4)
            r0.A0D = r5
        L_0x0497:
            int r1 = r0.A02
            r6 = 0
            r4 = 3
            r12 = 4
            r11 = 1
            if (r1 != r4) goto L_0x052f
            boolean r1 = r5.A06
            if (r1 != 0) goto L_0x04e6
            X.4S8 r1 = r5.A05
            int[] r1 = r1.A05
        L_0x04a7:
            int r7 = r5.A01
            r2 = r1[r7]
            r0.A06 = r2
            int r1 = r5.A03
            if (r7 >= r1) goto L_0x04eb
            r3.Afx(r2)
            X.4Mw r1 = r5.A01()
            if (r1 == 0) goto L_0x04da
            X.4PE r7 = r5.A08
            X.4eH r3 = r7.A0H
            int r1 = r1.A00
            if (r1 == 0) goto L_0x04c5
            r3.A0T(r1)
        L_0x04c5:
            int r2 = r5.A01
            boolean r1 = r7.A07
            if (r1 == 0) goto L_0x04da
            boolean[] r1 = r7.A0F
            boolean r1 = r1[r2]
            if (r1 == 0) goto L_0x04da
            int r1 = r3.A0F()
            int r1 = r1 * 6
            r3.A0T(r1)
        L_0x04da:
            boolean r1 = r5.A03()
            if (r1 != 0) goto L_0x04e2
            r0.A0D = r6
        L_0x04e2:
            r0.A02 = r4
        L_0x04e4:
            r0 = 0
            return r0
        L_0x04e6:
            X.4PE r1 = r5.A08
            int[] r1 = r1.A0B
            goto L_0x04a7
        L_0x04eb:
            X.4S8 r1 = r5.A05
            X.4Or r1 = r1.A03
            int r1 = r1.A02
            if (r1 != r11) goto L_0x04fb
            r1 = 8
            int r2 = r2 - r1
            r0.A06 = r2
            r3.Afx(r1)
        L_0x04fb:
            X.4S8 r1 = r5.A05
            X.4Or r1 = r1.A03
            X.1gT r1 = r1.A07
            java.lang.String r2 = r1.A0T
            java.lang.String r1 = "audio/ac4"
            boolean r2 = r1.equals(r2)
            int r1 = r0.A06
            if (r2 == 0) goto L_0x0602
            r4 = 7
            int r1 = r5.A00(r1, r4)
            r0.A04 = r1
            int r1 = r0.A06
            X.4eH r2 = r0.A0P
            X.C89654cc.A00(r2, r1)
            X.1gS r1 = r5.A07
            r1.Acw(r2, r4)
            int r1 = r0.A04
            int r2 = r1 + 7
        L_0x0524:
            r0.A04 = r2
            int r1 = r0.A06
            int r1 = r1 + r2
            r0.A06 = r1
            r0.A02 = r12
            r0.A05 = r8
        L_0x052f:
            X.4S8 r2 = r5.A05
            X.4Or r10 = r2.A03
            X.1gS r9 = r5.A07
            boolean r1 = r5.A06
            if (r1 != 0) goto L_0x05f2
            long[] r2 = r2.A07
            int r1 = r5.A01
            r1 = r2[r1]
        L_0x053f:
            int r4 = r10.A01
            if (r4 == 0) goto L_0x0608
            X.4eH r14 = r0.A0N
            byte[] r7 = r14.A02
            r7[r8] = r8
            r7[r11] = r8
            r7[r13] = r8
            int r17 = r4 + 1
            int r13 = 4 - r4
        L_0x0551:
            int r4 = r0.A04
            int r6 = r0.A06
            if (r4 >= r6) goto L_0x0619
            int r6 = r0.A05
            if (r6 != 0) goto L_0x05ad
            r4 = r17
            r3.readFully(r7, r13, r4)
            int r4 = X.C90504eH.A03(r14, r8)
            if (r4 < r11) goto L_0x0688
            int r4 = r4 + -1
            r0.A05 = r4
            X.4eH r4 = r0.A0O
            r4.A0S(r8)
            r9.Acw(r4, r12)
            r9.Acw(r14, r11)
            X.1gS[] r4 = r0.A0H
            int r4 = r4.length
            if (r4 <= 0) goto L_0x05ab
            X.1gT r4 = r10.A07
            java.lang.String r6 = r4.A0T
            byte r16 = r7[r12]
            java.lang.String r4 = "video/avc"
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L_0x058d
            r15 = r16 & 31
            r4 = 6
            if (r15 == r4) goto L_0x059c
        L_0x058d:
            java.lang.String r4 = "video/hevc"
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L_0x05ab
            r6 = r16 & 126(0x7e, float:1.77E-43)
            int r6 = r6 >> r11
            r4 = 39
            if (r6 != r4) goto L_0x05ab
        L_0x059c:
            r4 = 1
        L_0x059d:
            r0.A0G = r4
            int r4 = r0.A04
            int r4 = r4 + 5
            r0.A04 = r4
            int r4 = r0.A06
            int r4 = r4 + r13
            r0.A06 = r4
            goto L_0x0551
        L_0x05ab:
            r4 = 0
            goto L_0x059d
        L_0x05ad:
            boolean r4 = r0.A0G
            if (r4 == 0) goto L_0x05ed
            X.4eH r11 = r0.A0M
            r11.A0Q(r6)
            byte[] r4 = r11.A02
            r3.readFully(r4, r8, r6)
            int r4 = r0.A05
            r9.Acw(r11, r4)
            int r6 = r0.A05
            byte[] r12 = r11.A02
            int r4 = r11.A00
            int r12 = X.C90674eb.A00(r12, r4)
            X.1gT r4 = r10.A07
            java.lang.String r15 = r4.A0T
            java.lang.String r4 = "video/hevc"
            boolean r4 = r4.equals(r15)
            r11.A0S(r4)
            r11.A0R(r12)
            X.1gS[] r4 = r0.A0H
            X.C87504Xd.A00(r11, r4, r1)
        L_0x05df:
            int r4 = r0.A04
            int r4 = r4 + r6
            r0.A04 = r4
            int r4 = r0.A05
            int r4 = r4 - r6
            r0.A05 = r4
            r12 = 4
            r11 = 1
            goto L_0x0551
        L_0x05ed:
            int r6 = r9.Acz(r3, r6, r8, r8)
            goto L_0x05df
        L_0x05f2:
            X.4PE r4 = r5.A08
            int r6 = r5.A01
            long[] r1 = r4.A0D
            r1 = r1[r6]
            int[] r4 = r4.A0A
            r4 = r4[r6]
            long r6 = (long) r4
            long r1 = r1 + r6
            goto L_0x053f
        L_0x0602:
            int r2 = r5.A00(r1, r8)
            goto L_0x0524
        L_0x0608:
            int r4 = r0.A04
            int r6 = r0.A06
            if (r4 >= r6) goto L_0x0619
            int r6 = r6 - r4
            int r6 = r9.Acz(r3, r6, r8, r8)
            int r4 = r0.A04
            int r4 = r4 + r6
            r0.A04 = r4
            goto L_0x0608
        L_0x0619:
            boolean r3 = r5.A06
            if (r3 != 0) goto L_0x0666
            X.4S8 r3 = r5.A05
            int[] r4 = r3.A04
            int r3 = r5.A01
            r8 = r4[r3]
        L_0x0625:
            X.4Mw r4 = r5.A01()
            if (r4 == 0) goto L_0x062e
            r3 = 1073741824(0x40000000, float:2.0)
            r8 = r8 | r3
        L_0x062e:
            if (r4 == 0) goto L_0x0664
            X.4Uh r3 = r4.A01
        L_0x0632:
            r13 = 0
            r12 = r6
            r14 = r1
            r10 = r3
            r11 = r8
            r9.Ad0(r10, r11, r12, r13, r14)
        L_0x063a:
            java.util.ArrayDeque r4 = r0.A0R
            boolean r3 = r4.isEmpty()
            if (r3 != 0) goto L_0x0672
            java.lang.Object r4 = r4.removeFirst()
            X.4GB r4 = (X.AnonymousClass4GB) r4
            int r3 = r0.A03
            int r10 = r4.A00
            int r3 = r3 - r10
            r0.A03 = r3
            long r12 = r4.A01
            long r12 = r12 + r1
            X.1gS[] r6 = r0.A0I
            int r4 = r6.length
            r3 = 0
        L_0x0656:
            if (r3 >= r4) goto L_0x063a
            r7 = r6[r3]
            int r11 = r0.A03
            r8 = 0
            r9 = 1
            r7.Ad0(r8, r9, r10, r11, r12)
            int r3 = r3 + 1
            goto L_0x0656
        L_0x0664:
            r3 = 0
            goto L_0x0632
        L_0x0666:
            X.4PE r3 = r5.A08
            boolean[] r4 = r3.A0G
            int r3 = r5.A01
            boolean r3 = r4[r3]
            if (r3 == 0) goto L_0x0625
            r8 = 1
            goto L_0x0625
        L_0x0672:
            boolean r1 = r5.A03()
            if (r1 != 0) goto L_0x067b
            r1 = 0
            r0.A0D = r1
        L_0x067b:
            r1 = 3
            r0.A02 = r1
            goto L_0x04e4
        L_0x0680:
            X.4PE r1 = r5.A08
            long[] r2 = r1.A0E
            int r1 = r5.A02
            goto L_0x0480
        L_0x0688:
            java.lang.String r0 = "Invalid NAL length"
            goto L_0x06a6
        L_0x068b:
            java.lang.String r0 = "Offset to encryption data was negative."
            goto L_0x06a6
        L_0x068e:
            java.lang.String r0 = "Unhandled indirect reference"
            goto L_0x06a6
        L_0x0691:
            r1 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x0698:
            java.lang.String r0 = "Leaf atom with length > 2147483647 (unsupported)."
            goto L_0x06a6
        L_0x069b:
            java.lang.String r0 = "Leaf atom defines extended atom size (unsupported)."
            goto L_0x06a6
        L_0x069e:
            java.lang.String r0 = "Skipping atom with length > 2147483647 (unsupported)."
            goto L_0x06a6
        L_0x06a1:
            java.lang.String r0 = "Atom size less than header length (unsupported)."
            goto L_0x06a6
        L_0x06a4:
            java.lang.String r0 = "Offset to end of mdat was negative."
        L_0x06a6:
            X.40M r0 = X.AnonymousClass40M.A00(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C96604ob.AbN(X.2iu, X.4Bt):int");
    }

    public void AdC(long j2, long j3) {
        SparseArray sparseArray = this.A0J;
        int size = sparseArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((C87474Wx) sparseArray.valueAt(i2)).A02();
        }
        this.A0R.clear();
        this.A03 = 0;
        this.A0A = j3;
        this.A0Q.clear();
        this.A02 = 0;
        this.A00 = 0;
    }

    public boolean Afz(C55142iu r2) {
        return AnonymousClass4YJ.A00(r2, true);
    }
}
