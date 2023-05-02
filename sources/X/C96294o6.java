package X;

import java.nio.ByteBuffer;
import java.nio.ShortBuffer;

/* renamed from: X.4o6  reason: invalid class name and case insensitive filesystem */
public final class C96294o6 implements C109765Tm {
    public float A00 = 1.0f;
    public float A01 = 1.0f;
    public long A02;
    public long A03;
    public C88734b0 A04;
    public C88734b0 A05;
    public C88734b0 A06;
    public C88734b0 A07;
    public AnonymousClass4X8 A08;
    public ByteBuffer A09;
    public ByteBuffer A0A;
    public ShortBuffer A0B;
    public boolean A0C;
    public boolean A0D;

    public C96294o6() {
        C88734b0 r0 = C88734b0.A04;
        this.A06 = r0;
        this.A07 = r0;
        this.A04 = r0;
        this.A05 = r0;
        ByteBuffer byteBuffer = C109765Tm.A00;
        this.A09 = byteBuffer;
        this.A0B = byteBuffer.asShortBuffer();
        this.A0A = byteBuffer;
    }

    public C88734b0 A6W(C88734b0 r5) {
        if (r5.A02 == 2) {
            int i2 = r5.A03;
            this.A06 = r5;
            C88734b0 r1 = new C88734b0(i2, r5.A01, 2);
            this.A07 = r1;
            this.A0D = true;
            return r1;
        }
        throw new AnonymousClass43M(r5);
    }

    public ByteBuffer AE7() {
        int i2;
        AnonymousClass4X8 r7 = this.A08;
        if (r7 != null && (i2 = (r7.A05 * r7.A0G) << 1) > 0) {
            if (this.A09.capacity() < i2) {
                ByteBuffer A0s = AnonymousClass3K3.A0s(i2);
                this.A09 = A0s;
                this.A0B = A0s.asShortBuffer();
            } else {
                this.A09.clear();
                this.A0B.clear();
            }
            ShortBuffer shortBuffer = this.A0B;
            int remaining = shortBuffer.remaining();
            int i3 = r7.A0G;
            int min = Math.min(remaining / i3, r7.A05);
            shortBuffer.put(r7.A0B, 0, i3 * min);
            int i4 = r7.A05 - min;
            r7.A05 = i4;
            short[] sArr = r7.A0B;
            System.arraycopy(sArr, min * i3, sArr, 0, i4 * i3);
            this.A03 += (long) i2;
            this.A09.limit(i2);
            this.A0A = this.A09;
        }
        ByteBuffer byteBuffer = this.A0A;
        this.A0A = C109765Tm.A00;
        return byteBuffer;
    }

    public boolean AIc() {
        int i2 = this.A07.A03;
        if (i2 != -1) {
            return AnonymousClass3K4.A01(this.A01, 1.0f) >= 1.0E-4f || AnonymousClass3K4.A01(this.A00, 1.0f) >= 1.0E-4f || i2 != this.A06.A03;
        }
        return false;
    }

    public boolean AIm() {
        if (!this.A0C) {
            return false;
        }
        AnonymousClass4X8 r0 = this.A08;
        return r0 == null || ((r0.A05 * r0.A0G) << 1) == 0;
    }

    public void AbG() {
        AnonymousClass4X8 r7 = this.A08;
        if (r7 != null) {
            int i2 = r7.A00;
            float f2 = r7.A0F;
            float f3 = r7.A0D;
            int i3 = r7.A05 + ((int) ((((((float) i2) / (f2 / f3)) + ((float) r7.A06)) / (r7.A0E * f3)) + 0.5f));
            short[] sArr = r7.A0A;
            int i4 = r7.A0J << 1;
            short[] A042 = r7.A04(sArr, i2, i4 + i2);
            r7.A0A = A042;
            int i5 = 0;
            while (true) {
                int i6 = r7.A0G;
                if (i5 >= i4 * i6) {
                    break;
                }
                A042[(i6 * i2) + i5] = 0;
                i5++;
            }
            r7.A00 += i4;
            r7.A01();
            if (r7.A05 > i3) {
                r7.A05 = i3;
            }
            r7.A00 = 0;
            r7.A09 = 0;
            r7.A06 = 0;
        }
        this.A0C = true;
    }

    public void AbH(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            AnonymousClass4X8 r5 = this.A08;
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.A02 += (long) remaining;
            int remaining2 = asShortBuffer.remaining();
            int i2 = r5.A0G;
            int i3 = remaining2 / i2;
            short[] A042 = r5.A04(r5.A0A, r5.A00, i3);
            r5.A0A = A042;
            asShortBuffer.get(A042, r5.A00 * i2, ((i2 * i3) << 1) >> 1);
            r5.A00 += i3;
            r5.A01();
            byteBuffer.position(byteBuffer.position() + remaining);
        }
    }

    public void flush() {
        if (AIc()) {
            C88734b0 r2 = this.A06;
            this.A04 = r2;
            C88734b0 r1 = this.A07;
            this.A05 = r1;
            if (this.A0D) {
                this.A08 = new AnonymousClass4X8(this.A01, this.A00, r2.A03, r2.A01, r1.A03);
            } else {
                AnonymousClass4X8 r12 = this.A08;
                if (r12 != null) {
                    r12.A00 = 0;
                    r12.A05 = 0;
                    r12.A06 = 0;
                    r12.A04 = 0;
                    r12.A03 = 0;
                    r12.A09 = 0;
                    r12.A08 = 0;
                    r12.A07 = 0;
                    r12.A02 = 0;
                    r12.A01 = 0;
                }
            }
        }
        this.A0A = C109765Tm.A00;
        this.A02 = 0;
        this.A03 = 0;
        this.A0C = false;
    }

    public void reset() {
        this.A01 = 1.0f;
        this.A00 = 1.0f;
        C88734b0 r0 = C88734b0.A04;
        this.A06 = r0;
        this.A07 = r0;
        this.A04 = r0;
        this.A05 = r0;
        ByteBuffer byteBuffer = C109765Tm.A00;
        this.A09 = byteBuffer;
        this.A0B = byteBuffer.asShortBuffer();
        this.A0A = byteBuffer;
        this.A0D = false;
        this.A08 = null;
        this.A02 = 0;
        this.A03 = 0;
        this.A0C = false;
    }
}
