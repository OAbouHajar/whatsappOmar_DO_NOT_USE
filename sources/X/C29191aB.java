package X;

import android.support.v4.view.accessibility.AccessibilityEventCompat;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: X.1aB  reason: invalid class name and case insensitive filesystem */
public class C29191aB {
    public int A00 = 0;
    public int A01 = 0;
    public final int A02;
    public final C28991Zq A03 = new C28991Zq();
    public final AnonymousClass02I A04;
    public final AnonymousClass2I6 A05;
    public final AnonymousClass1CK A06;

    public C29191aB(AnonymousClass2I6 r5, AnonymousClass1CK r6, RandomAccessFile randomAccessFile, int i2, int i3) {
        AnonymousClass02I r2;
        int i4 = AccessibilityEventCompat.TYPE_VIEW_ACCESSIBILITY_FOCUS_CLEARED;
        int i5 = (i2 * AccessibilityEventCompat.TYPE_VIEW_ACCESSIBILITY_FOCUS_CLEARED) + AccessibilityEventCompat.TYPE_VIEW_ACCESSIBILITY_FOCUS_CLEARED;
        if (i3 != 0) {
            if (i3 == 1) {
                i5 = (i2 << 14) + AccessibilityEventCompat.TYPE_VIEW_ACCESSIBILITY_FOCUS_CLEARED;
                i4 = 16384;
            } else {
                r2 = new AnonymousClass02I(r6, randomAccessFile, (i2 * 32768) + AccessibilityEventCompat.TYPE_VIEW_ACCESSIBILITY_FOCUS_CLEARED, 32768);
                this.A04 = r2;
                this.A02 = i2;
                this.A05 = r5;
                this.A06 = r6;
            }
        }
        r2 = new AnonymousClass02I(r6, randomAccessFile, i5, i4);
        this.A04 = r2;
        this.A02 = i2;
        this.A05 = r5;
        this.A06 = r6;
    }

    public final int A00() {
        if (A05()) {
            return this.A00;
        }
        throw new UnsupportedOperationException("No event count available for rotated buffers");
    }

    public void A01() {
        AnonymousClass02I r4 = this.A04;
        r4.A02();
        AnonymousClass2I7 r3 = this.A05.A05[this.A02];
        r3.A01 = r4.A01;
        r3.A04 = 0;
        r3.A02 = 1;
        r3.A00 = 0;
        r3.A03 = r4.A00();
        this.A01 = 0;
        this.A00 = 0;
        this.A03.A00.clear();
    }

    public void A02() {
        try {
            AnonymousClass02I r3 = this.A04;
            r3.A03();
            AnonymousClass2I7 r2 = this.A05.A05[this.A02];
            r2.A01 = r3.A01;
            r2.A03 = r3.A00();
        } catch (IOException e2) {
            AnonymousClass1CK r1 = this.A06;
            r1.A0G = Boolean.TRUE;
            r1.A09();
            Log.e("eventbuffer/flushEventBuffers: cannot write event buffer", e2);
            throw e2;
        }
    }

    public void A03() {
        try {
            AnonymousClass02I r6 = this.A04;
            AnonymousClass2I7[] r7 = this.A05.A05;
            int i2 = this.A02;
            r6.A04(r7[i2].A01);
            boolean z2 = true;
            boolean z3 = false;
            if (r6.A05.position() == r7[i2].A01) {
                z3 = true;
            }
            Log.a(z3);
            if (r6.A01 != r7[i2].A01) {
                z2 = false;
            }
            Log.a(z2);
            int i3 = (r6.A00() > r7[i2].A03 ? 1 : (r6.A00() == r7[i2].A03 ? 0 : -1));
            boolean A052 = A05();
            if (i3 != 0) {
                AnonymousClass1CK r1 = this.A06;
                Boolean bool = Boolean.TRUE;
                if (A052) {
                    r1.A01 = bool;
                } else {
                    r1.A06 = bool;
                }
                throw new AnonymousClass2PO("Invalid checksum");
            } else if (A052) {
                this.A01 = 0;
                this.A00 = 0;
                C28991Zq r5 = this.A03;
                r5.A00.clear();
                ByteBuffer A012 = r6.A01();
                if (A012.limit() != 0) {
                    byte[][] bArr = AnonymousClass2P4.A00;
                    int length = bArr.length;
                    int i4 = length - 1;
                    byte[] bArr2 = new byte[AnonymousClass2P4.A00(i4).length];
                    try {
                        A012.get(bArr2);
                        int i5 = 0;
                        while (i5 < length) {
                            if (!Arrays.equals(bArr2, bArr[i5])) {
                                i5++;
                            } else if (i5 < 0 || i5 > i4) {
                                throw new AnonymousClass2PO("Invalid event buffer header");
                            } else {
                                if (i5 >= 1) {
                                    A012.get(A07(i5));
                                }
                                while (A012.position() < A012.limit()) {
                                    try {
                                        AnonymousClass056 A062 = AnonymousClass02K.A06(A012);
                                        this.A01++;
                                        int i6 = A062.A01;
                                        if (i6 == 1) {
                                            this.A00++;
                                        } else if (i6 == 0) {
                                            r5.A00(A062.A00, A062.A02);
                                        }
                                    } catch (BufferUnderflowException unused) {
                                        throw new AnonymousClass2PY("Incomplete buffer");
                                    } catch (AnonymousClass2PY e2) {
                                        throw new AnonymousClass2PO(e2.toString());
                                    }
                                }
                                return;
                            }
                        }
                        StringBuilder sb = new StringBuilder("Invalid value: ");
                        sb.append(bArr2);
                        throw new RuntimeException(sb.toString());
                    } catch (BufferUnderflowException unused2) {
                        throw new AnonymousClass2PO("Event buffer does not have a header");
                    }
                }
            }
        } catch (IOException e3) {
            throw new AnonymousClass2PO(e3.toString());
        }
    }

    public final void A04(byte[] bArr, int i2) {
        if (A06()) {
            AnonymousClass02I r1 = this.A04;
            byte[] A002 = AnonymousClass2P4.A00(2);
            ByteBuffer byteBuffer = r1.A05;
            byteBuffer.put(A002);
            AnonymousClass2I6 r4 = this.A05;
            AnonymousClass2I7 r3 = r4.A05[this.A02];
            int i3 = r4.A00 + 1;
            r4.A00 = i3;
            if (i3 > 65535) {
                r4.A00 = 1;
                i3 = 1;
            }
            r3.A00 = i3;
            byteBuffer.put(A07(2));
        }
        int min = Math.min(bArr.length, i2);
        ByteBuffer byteBuffer2 = this.A04.A05;
        if (min <= byteBuffer2.remaining()) {
            byteBuffer2.put(bArr, 0, min);
            return;
        }
        StringBuilder sb = new StringBuilder("Not enough space in the buffer lenToWrite = ");
        sb.append(min);
        sb.append(" remaining = ");
        sb.append(byteBuffer2.remaining());
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public boolean A05() {
        return this.A02 == this.A05.A01;
    }

    public final boolean A06() {
        return this.A04.A05.position() == 0;
    }

    public byte[] A07(int i2) {
        if (i2 == 1) {
            AnonymousClass2I7 r1 = this.A05.A05[this.A02];
            int i3 = r1.A00;
            return new byte[]{(byte) r1.A02, (byte) i3, (byte) (i3 >> 8)};
        }
        AnonymousClass2I7 r2 = this.A05.A05[this.A02];
        int i4 = r2.A00;
        return new byte[]{(byte) r2.A02, (byte) i4, (byte) (i4 >> 8), (byte) r2.A05};
    }
}
