package X;

import android.util.Log;
import com.facebook.redex.IDxOwnerShape355S0100000_2_I1;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.PriorityQueue;

/* renamed from: X.4q8  reason: invalid class name and case insensitive filesystem */
public abstract class C97524q8 implements AnonymousClass5UP {
    public long A00;
    public long A01;
    public C65503Va A02;
    public final ArrayDeque A03 = new ArrayDeque();
    public final ArrayDeque A04;
    public final PriorityQueue A05;

    public C97524q8() {
        int i2 = 0;
        int i3 = 0;
        do {
            this.A03.add(new C65503Va());
            i3++;
        } while (i3 < 10);
        this.A04 = new ArrayDeque();
        do {
            this.A04.add(new C65523Vc(new IDxOwnerShape355S0100000_2_I1(this, 2)));
            i2++;
        } while (i2 < 2);
        this.A05 = new PriorityQueue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0036, code lost:
        r4.clear();
        r8.A03.add(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003e, code lost:
        return r5;
     */
    /* renamed from: A00 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C65303Uf A7r() {
        /*
            r8 = this;
            java.util.ArrayDeque r6 = r8.A04
            boolean r0 = r6.isEmpty()
            r5 = 0
            if (r0 == 0) goto L_0x000a
        L_0x0009:
            return r5
        L_0x000a:
            java.util.PriorityQueue r7 = r8.A05
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x0009
            java.lang.Object r0 = r7.peek()
            X.3UX r0 = (X.AnonymousClass3UX) r0
            long r3 = r0.A00
            long r1 = r8.A00
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0009
            java.lang.Object r4 = r7.poll()
            X.3Uc r4 = (X.AnonymousClass3Uc) r4
            boolean r0 = X.AnonymousClass4XM.A00(r4)
            if (r0 == 0) goto L_0x003f
            java.lang.Object r5 = r6.pollFirst()
            X.3Uf r5 = (X.C65303Uf) r5
            r0 = 4
            r5.addFlag(r0)
        L_0x0036:
            r4.clear()
            java.util.ArrayDeque r0 = r8.A03
            r0.add(r4)
            return r5
        L_0x003f:
            r8.A01(r4)
            r3 = r8
            boolean r2 = r8 instanceof X.C65533Vd
            if (r2 == 0) goto L_0x0077
            r0 = r3
            X.3Vd r0 = (X.C65533Vd) r0
            java.util.List r1 = r0.A04
            java.util.List r0 = r0.A05
        L_0x004e:
            boolean r0 = X.C13680ns.A1a(r1, r0)
            if (r0 == 0) goto L_0x007f
            if (r2 == 0) goto L_0x0070
            X.3Vd r3 = (X.C65533Vd) r3
            java.util.List r0 = r3.A04
            r3.A05 = r0
        L_0x005c:
            X.4pz r2 = new X.4pz
            r2.<init>(r0)
            java.lang.Object r5 = r6.pollFirst()
            X.3Uf r5 = (X.C65303Uf) r5
            long r0 = r4.A00
            r5.timeUs = r0
            r5.A01 = r2
            r5.A00 = r0
            goto L_0x0036
        L_0x0070:
            X.3Ve r3 = (X.C65543Ve) r3
            java.util.List r0 = r3.A07
            r3.A08 = r0
            goto L_0x005c
        L_0x0077:
            r0 = r3
            X.3Ve r0 = (X.C65543Ve) r0
            java.util.List r1 = r0.A07
            java.util.List r0 = r0.A08
            goto L_0x004e
        L_0x007f:
            r4.clear()
            java.util.ArrayDeque r0 = r8.A03
            r0.add(r4)
            goto L_0x000a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C97524q8.A7r():X.3Uf");
    }

    public void A01(AnonymousClass3Uc r12) {
        AnonymousClass4LU r4;
        byte[] bArr;
        int i2;
        C65533Vd r5 = (C65533Vd) this;
        ByteBuffer byteBuffer = r12.A01;
        byte[] array = byteBuffer.array();
        C90504eH r6 = r5.A08;
        r6.A0U(array, byteBuffer.limit());
        while (C90504eH.A00(r6) >= 3) {
            int A0C = r6.A0C() & 7;
            int i3 = A0C & 3;
            boolean A1R = AnonymousClass000.A1R(A0C & 4, 4);
            byte A0C2 = (byte) r6.A0C();
            byte A0C3 = (byte) r6.A0C();
            if ((i3 == 2 || i3 == 3) && A1R) {
                if (i3 == 3) {
                    r5.A03();
                    int i4 = (A0C2 & 192) >> 6;
                    int i5 = r5.A01;
                    if (!(i5 == -1 || i4 == (i5 + 1) % 4)) {
                        r5.A04();
                        StringBuilder A0r = AnonymousClass000.A0r("Sequence number discontinuity. previous=");
                        A0r.append(r5.A01);
                        Log.w("Cea708Decoder", C13680ns.A0i(" current=", A0r, i4));
                    }
                    r5.A01 = i4;
                    byte b2 = A0C2 & 63;
                    if (b2 == 0) {
                        b2 = 64;
                    }
                    r4 = new AnonymousClass4LU(i4, b2);
                    r5.A03 = r4;
                    bArr = r4.A03;
                    i2 = r4.A00;
                } else {
                    r4 = r5.A03;
                    if (r4 == null) {
                        Log.e("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                    } else {
                        bArr = r4.A03;
                        int i6 = r4.A00;
                        i2 = i6 + 1;
                        r4.A00 = i2;
                        bArr[i6] = A0C2;
                    }
                }
                int i7 = i2 + 1;
                r4.A00 = i7;
                bArr[i2] = A0C3;
                if (i7 == (r4.A01 << 1) - 1) {
                    r5.A03();
                }
            }
        }
    }

    public /* bridge */ /* synthetic */ Object A7q() {
        C90524eJ.A04(AnonymousClass000.A1W(this.A02));
        ArrayDeque arrayDeque = this.A03;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        C65503Va r0 = (C65503Va) arrayDeque.pollFirst();
        this.A02 = r0;
        return r0;
    }

    public /* bridge */ /* synthetic */ void AbI(Object obj) {
        AnonymousClass3Uc r5 = (AnonymousClass3Uc) obj;
        C90524eJ.A03(AnonymousClass000.A1Y(r5, this.A02));
        C65503Va r52 = (C65503Va) r5;
        if (AnonymousClass000.A1R(r52.flags & Integer.MIN_VALUE, Integer.MIN_VALUE)) {
            r52.clear();
            this.A03.add(r52);
        } else {
            long j2 = this.A01;
            this.A01 = 1 + j2;
            r52.A00 = j2;
            this.A05.add(r52);
        }
        this.A02 = null;
    }

    public void AeO(long j2) {
        this.A00 = j2;
    }

    public void flush() {
        this.A01 = 0;
        this.A00 = 0;
        while (true) {
            PriorityQueue priorityQueue = this.A05;
            if (priorityQueue.isEmpty()) {
                break;
            }
            AnonymousClass4XM r1 = (AnonymousClass4XM) priorityQueue.poll();
            r1.clear();
            this.A03.add(r1);
        }
        C65503Va r12 = this.A02;
        if (r12 != null) {
            r12.clear();
            this.A03.add(r12);
            this.A02 = null;
        }
    }

    public String getName() {
        return this instanceof C65533Vd ? "Cea708Decoder" : "Cea608Decoder";
    }

    public void release() {
    }
}
