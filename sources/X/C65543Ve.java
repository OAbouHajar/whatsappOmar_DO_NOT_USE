package X;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.wawebrtc.MediaCodecVideoEncoder;

/* renamed from: X.3Ve  reason: invalid class name and case insensitive filesystem */
public final class C65543Ve extends C97524q8 {
    public static final int[] A0I = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, AnonymousClass2EA.A03, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};
    public static final int[] A0J = {0, 4, 8, 12, 16, 20, 24, 28};
    public static final int[] A0K = {11, 1, 3, 12, 14, 5, 7, 9};
    public static final int[] A0L = {174, MediaCodecVideoEncoder.MIN_ENCODER_WIDTH, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};
    public static final int[] A0M = {193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};
    public static final int[] A0N = {195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};
    public static final int[] A0O = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};
    public static final boolean[] A0P = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};
    public byte A00;
    public byte A01;
    public int A02;
    public int A03;
    public int A04 = 0;
    public long A05;
    public C87464Ww A06 = new C87464Ww(0, 4);
    public List A07;
    public List A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public final int A0C;
    public final int A0D;
    public final int A0E;
    public final long A0F = 16000000;
    public final C90504eH A0G = new C90504eH();
    public final ArrayList A0H = AnonymousClass000.A0u();

    public C65543Ve(int i2, String str) {
        this.A0C = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    this.A0D = 0;
                } else if (i2 != 4) {
                    Log.w("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
                } else {
                    this.A0D = 1;
                }
                this.A0E = 1;
                A04(0);
                A03();
                this.A0A = true;
                this.A05 = -9223372036854775807L;
            }
            this.A0D = 1;
            this.A0E = 0;
            A04(0);
            A03();
            this.A0A = true;
            this.A05 = -9223372036854775807L;
        }
        this.A0D = 0;
        this.A0E = 0;
        A04(0);
        A03();
        this.A0A = true;
        this.A05 = -9223372036854775807L;
    }

    public C65303Uf A00() {
        C65303Uf A002 = super.A7r();
        if (A002 == null) {
            long j2 = this.A0F;
            if (j2 == -9223372036854775807L) {
                return null;
            }
            long j3 = this.A05;
            if (j3 == -9223372036854775807L || this.A00 - j3 < j2 || (A002 = (C65303Uf) this.A04.pollFirst()) == null) {
                return null;
            }
            this.A07 = Collections.emptyList();
            this.A05 = -9223372036854775807L;
            List list = this.A07;
            this.A08 = list;
            C97434pz r2 = new C97434pz(list);
            long j4 = this.A00;
            A002.timeUs = j4;
            A002.A01 = r2;
            A002.A00 = j4;
        }
        return A002;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0256, code lost:
        if (r0 != 3) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0274, code lost:
        r11.A03 = r1;
        r11.A06.A01 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004a, code lost:
        if (r1[r2] == false) goto L_0x004c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x0011 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0101  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(X.AnonymousClass3Uc r12) {
        /*
            r11 = this;
            java.nio.ByteBuffer r0 = r12.A01
            X.4eH r4 = r11.A0G
            byte[] r1 = r0.array()
            int r0 = r0.limit()
            r4.A0U(r1, r0)
            r3 = 1
            r10 = 0
        L_0x0011:
            int r0 = X.C90504eH.A00(r4)
            int r1 = r11.A0C
            if (r0 < r1) goto L_0x028d
            r0 = 2
            if (r1 != r0) goto L_0x0286
            r9 = -4
        L_0x001d:
            int r7 = r4.A0C()
            int r2 = r4.A0C()
            r0 = r9 & 2
            if (r0 != 0) goto L_0x0011
            r1 = r9 & 1
            int r0 = r11.A0E
            if (r1 != r0) goto L_0x0011
            r0 = r7 & 127(0x7f, float:1.78E-43)
            byte r6 = (byte) r0
            r0 = r2 & 127(0x7f, float:1.78E-43)
            byte r5 = (byte) r0
            if (r6 != 0) goto L_0x003a
            if (r5 != 0) goto L_0x003a
            goto L_0x0011
        L_0x003a:
            boolean r8 = r11.A09
            r1 = r9 & 4
            r0 = 4
            if (r1 != r0) goto L_0x004c
            boolean[] r1 = A0P
            boolean r0 = r1[r7]
            if (r0 == 0) goto L_0x004c
            boolean r0 = r1[r2]
            r7 = 1
            if (r0 != 0) goto L_0x004d
        L_0x004c:
            r7 = 0
        L_0x004d:
            r11.A09 = r7
            r2 = 0
            if (r7 == 0) goto L_0x0067
            r1 = r6 & 240(0xf0, float:3.36E-43)
            r0 = 16
            if (r1 != r0) goto L_0x0067
            boolean r0 = r11.A0B
            if (r0 == 0) goto L_0x0072
            byte r0 = r11.A00
            if (r0 != r6) goto L_0x0072
            byte r0 = r11.A01
            if (r0 != r5) goto L_0x0072
            r11.A0B = r2
            goto L_0x0011
        L_0x0067:
            r11.A0B = r2
            if (r7 != 0) goto L_0x0078
            if (r8 == 0) goto L_0x0011
        L_0x006d:
            r11.A03()
        L_0x0070:
            r10 = 1
            goto L_0x0011
        L_0x0072:
            r11.A0B = r3
            r11.A00 = r6
            r11.A01 = r5
        L_0x0078:
            if (r3 > r6) goto L_0x00fb
            r0 = 15
            if (r6 > r0) goto L_0x00fb
        L_0x007e:
            r11.A0A = r2
        L_0x0080:
            boolean r0 = r11.A0A
            if (r0 == 0) goto L_0x0011
            r2 = r6 & 224(0xe0, float:3.14E-43)
            if (r2 != 0) goto L_0x008e
            int r0 = r6 >> 3
            r0 = r0 & 1
            r11.A04 = r0
        L_0x008e:
            int r1 = r11.A04
            int r0 = r11.A0D
            if (r1 != r0) goto L_0x0011
            if (r2 != 0) goto L_0x00d8
            r7 = r6 & 247(0xf7, float:3.46E-43)
            r0 = 17
            if (r7 != r0) goto L_0x00b9
            r1 = r5 & 240(0xf0, float:3.36E-43)
            r0 = 48
            if (r1 != r0) goto L_0x00b9
            X.4Ww r8 = r11.A06
            r1 = r5 & 15
            int[] r0 = A0L
        L_0x00a8:
            r0 = r0[r1]
        L_0x00aa:
            char r5 = (char) r0
            java.lang.StringBuilder r2 = r8.A05
            int r1 = r2.length()
            r0 = 32
            if (r1 >= r0) goto L_0x0070
            r2.append(r5)
            goto L_0x0070
        L_0x00b9:
            r2 = r6 & 246(0xf6, float:3.45E-43)
            r0 = 18
            if (r2 != r0) goto L_0x0115
            r1 = r5 & 224(0xe0, float:3.14E-43)
            r0 = 32
            if (r1 != r0) goto L_0x0115
            X.4Ww r0 = r11.A06
            r0.A02()
            X.4Ww r8 = r11.A06
            r0 = r6 & 1
            r1 = r5 & 31
            if (r0 != 0) goto L_0x00d5
            int[] r0 = A0M
            goto L_0x00a8
        L_0x00d5:
            int[] r0 = A0N
            goto L_0x00a8
        L_0x00d8:
            X.4Ww r8 = r11.A06
            r0 = r6 & 127(0x7f, float:1.78E-43)
            int r0 = r0 + -32
            int[] r7 = A0I
            r0 = r7[r0]
            char r6 = (char) r0
            java.lang.StringBuilder r2 = r8.A05
            int r1 = r2.length()
            r0 = 32
            if (r1 >= r0) goto L_0x00f0
            r2.append(r6)
        L_0x00f0:
            r0 = r5 & 224(0xe0, float:3.14E-43)
            if (r0 == 0) goto L_0x0070
            r0 = r5 & 127(0x7f, float:1.78E-43)
            int r0 = r0 + -32
            r0 = r7[r0]
            goto L_0x00aa
        L_0x00fb:
            r1 = r6 & 247(0xf7, float:3.46E-43)
            r0 = 20
            if (r1 != r0) goto L_0x0080
            r0 = 32
            if (r5 == r0) goto L_0x0111
            r0 = 47
            if (r5 == r0) goto L_0x0111
            switch(r5) {
                case 37: goto L_0x0111;
                case 38: goto L_0x0111;
                case 39: goto L_0x0111;
                default: goto L_0x010c;
            }
        L_0x010c:
            switch(r5) {
                case 41: goto L_0x0111;
                case 42: goto L_0x007e;
                case 43: goto L_0x007e;
                default: goto L_0x010f;
            }
        L_0x010f:
            goto L_0x0080
        L_0x0111:
            r11.A0A = r3
            goto L_0x0080
        L_0x0115:
            r0 = 17
            if (r7 != r0) goto L_0x0147
            r1 = r5 & 240(0xf0, float:3.36E-43)
            r0 = 32
            if (r1 != r0) goto L_0x0147
            X.4Ww r7 = r11.A06
            r2 = 32
            java.lang.StringBuilder r1 = r7.A05
            int r0 = r1.length()
            if (r0 >= r2) goto L_0x012e
            r1.append(r2)
        L_0x012e:
            r0 = r5 & 1
            boolean r6 = X.AnonymousClass000.A1R(r0, r3)
            int r5 = r5 >> r3
            r5 = r5 & 7
            java.util.List r2 = r7.A06
            int r1 = r1.length()
            X.4Ja r0 = new X.4Ja
            r0.<init>(r5, r1, r6)
            r2.add(r0)
            goto L_0x0070
        L_0x0147:
            r1 = r6 & 240(0xf0, float:3.36E-43)
            r0 = 16
            if (r1 != r0) goto L_0x01c8
            r1 = r5 & 192(0xc0, float:2.69E-43)
            r0 = 64
            if (r1 != r0) goto L_0x01c8
            int[] r1 = A0K
            r0 = r6 & 7
            r6 = r1[r0]
            r0 = r5 & 32
            r7 = 0
            if (r0 == 0) goto L_0x0160
            int r6 = r6 + 1
        L_0x0160:
            X.4Ww r9 = r11.A06
            int r0 = r9.A03
            if (r6 == r0) goto L_0x0186
            int r0 = r11.A02
            if (r0 == r3) goto L_0x0182
            java.util.List r0 = r9.A06
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x01b7
            java.util.List r0 = r9.A07
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x01b7
            java.lang.StringBuilder r0 = r9.A05
            int r0 = r0.length()
            if (r0 != 0) goto L_0x01b7
        L_0x0182:
            X.4Ww r9 = r11.A06
            r9.A03 = r6
        L_0x0186:
            r1 = r5 & 16
            r0 = 16
            boolean r8 = X.AnonymousClass000.A1R(r1, r0)
            r0 = r5 & 1
            if (r0 != r3) goto L_0x0193
            r7 = 1
        L_0x0193:
            int r5 = r5 >> r3
            r6 = r5 & 7
            r5 = r6
            if (r8 == 0) goto L_0x019b
            r5 = 8
        L_0x019b:
            java.util.List r2 = r9.A06
            java.lang.StringBuilder r0 = r9.A05
            int r1 = r0.length()
            X.4Ja r0 = new X.4Ja
            r0.<init>(r5, r1, r7)
            r2.add(r0)
            if (r8 == 0) goto L_0x0070
            X.4Ww r1 = r11.A06
            int[] r0 = A0J
            r0 = r0[r6]
            r1.A02 = r0
            goto L_0x0070
        L_0x01b7:
            int r2 = r11.A02
            int r0 = r11.A03
            X.4Ww r1 = new X.4Ww
            r1.<init>(r2, r0)
            r11.A06 = r1
            java.util.ArrayList r0 = r11.A0H
            r0.add(r1)
            goto L_0x0182
        L_0x01c8:
            r0 = 23
            if (r7 != r0) goto L_0x01dc
            r0 = 33
            if (r5 < r0) goto L_0x01dc
            r0 = 35
            if (r5 > r0) goto L_0x01dc
            X.4Ww r1 = r11.A06
            int r0 = r5 + -32
            r1.A04 = r0
            goto L_0x0070
        L_0x01dc:
            r0 = 20
            if (r2 != r0) goto L_0x0070
            r1 = r5 & 240(0xf0, float:3.36E-43)
            r0 = 32
            if (r1 != r0) goto L_0x0070
            r1 = 2
            if (r5 == r0) goto L_0x0281
            r0 = 41
            r2 = 3
            if (r5 == r0) goto L_0x027c
            switch(r5) {
                case 37: goto L_0x0271;
                case 38: goto L_0x0266;
                case 39: goto L_0x0261;
                default: goto L_0x01f1;
            }
        L_0x01f1:
            int r1 = r11.A02
            if (r1 == 0) goto L_0x0070
            r0 = 33
            if (r5 == r0) goto L_0x025a
            switch(r5) {
                case 44: goto L_0x024c;
                case 45: goto L_0x0206;
                case 46: goto L_0x006d;
                case 47: goto L_0x01fe;
                default: goto L_0x01fc;
            }
        L_0x01fc:
            goto L_0x0070
        L_0x01fe:
            java.util.List r0 = r11.A02()
            r11.A07 = r0
            goto L_0x006d
        L_0x0206:
            if (r1 != r3) goto L_0x0070
            X.4Ww r1 = r11.A06
            java.util.List r0 = r1.A06
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0224
            java.util.List r0 = r1.A07
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0224
            java.lang.StringBuilder r0 = r1.A05
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0224
            goto L_0x0070
        L_0x0224:
            X.4Ww r6 = r11.A06
            java.util.List r5 = r6.A07
            android.text.SpannableString r0 = r6.A00()
            r5.add(r0)
            java.lang.StringBuilder r0 = r6.A05
            r2 = 0
            r0.setLength(r2)
            java.util.List r0 = r6.A06
            r0.clear()
            int r1 = r6.A01
            int r0 = r6.A03
            int r1 = java.lang.Math.min(r1, r0)
        L_0x0242:
            int r0 = r5.size()
            if (r0 < r1) goto L_0x0070
            r5.remove(r2)
            goto L_0x0242
        L_0x024c:
            java.util.List r0 = java.util.Collections.emptyList()
            r11.A07 = r0
            int r0 = r11.A02
            if (r0 == r3) goto L_0x006d
            if (r0 != r2) goto L_0x0070
            goto L_0x006d
        L_0x025a:
            X.4Ww r0 = r11.A06
            r0.A02()
            goto L_0x0070
        L_0x0261:
            r11.A04(r3)
            r1 = 4
            goto L_0x0274
        L_0x0266:
            r11.A04(r3)
            r11.A03 = r2
            X.4Ww r0 = r11.A06
            r0.A01 = r2
            goto L_0x0070
        L_0x0271:
            r11.A04(r3)
        L_0x0274:
            r11.A03 = r1
            X.4Ww r0 = r11.A06
            r0.A01 = r1
            goto L_0x0070
        L_0x027c:
            r11.A04(r2)
            goto L_0x0070
        L_0x0281:
            r11.A04(r1)
            goto L_0x0070
        L_0x0286:
            int r0 = r4.A0C()
            byte r9 = (byte) r0
            goto L_0x001d
        L_0x028d:
            if (r10 == 0) goto L_0x02a0
            int r1 = r11.A02
            if (r1 == r3) goto L_0x0296
            r0 = 3
            if (r1 != r0) goto L_0x02a0
        L_0x0296:
            java.util.List r0 = r11.A02()
            r11.A07 = r0
            long r0 = r11.A00
            r11.A05 = r0
        L_0x02a0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65543Ve.A01(X.3Uc):void");
    }

    public final List A02() {
        ArrayList arrayList = this.A0H;
        int size = arrayList.size();
        ArrayList A0i = C13690nt.A0i(size);
        int i2 = 2;
        for (int i3 = 0; i3 < size; i3++) {
            C88444aV A012 = ((C87464Ww) arrayList.get(i3)).A01(Integer.MIN_VALUE);
            A0i.add(A012);
            if (A012 != null) {
                i2 = Math.min(i2, A012.A08);
            }
        }
        ArrayList A0i2 = C13690nt.A0i(size);
        for (int i4 = 0; i4 < size; i4++) {
            C88444aV r1 = (C88444aV) A0i.get(i4);
            if (r1 != null) {
                if (r1.A08 != i2) {
                    r1 = ((C87464Ww) arrayList.get(i4)).A01(i2);
                }
                A0i2.add(r1);
            }
        }
        return A0i2;
    }

    public final void A03() {
        C87464Ww r2 = this.A06;
        r2.A00 = this.A02;
        r2.A06.clear();
        r2.A07.clear();
        r2.A05.setLength(0);
        r2.A03 = 15;
        r2.A02 = 0;
        r2.A04 = 0;
        ArrayList arrayList = this.A0H;
        arrayList.clear();
        arrayList.add(this.A06);
    }

    public final void A04(int i2) {
        int i3 = this.A02;
        if (i3 != i2) {
            this.A02 = i2;
            if (i2 == 3) {
                int i4 = 0;
                while (true) {
                    ArrayList arrayList = this.A0H;
                    if (i4 < arrayList.size()) {
                        ((C87464Ww) arrayList.get(i4)).A00 = 3;
                        i4++;
                    } else {
                        return;
                    }
                }
            } else {
                A03();
                if (i3 == 3 || i2 == 1 || i2 == 0) {
                    this.A07 = Collections.emptyList();
                }
            }
        }
    }

    public void flush() {
        super.flush();
        this.A07 = null;
        this.A08 = null;
        A04(0);
        this.A03 = 4;
        this.A06.A01 = 4;
        A03();
        this.A09 = false;
        this.A0B = false;
        this.A00 = 0;
        this.A01 = 0;
        this.A04 = 0;
        this.A0A = true;
        this.A05 = -9223372036854775807L;
    }
}
