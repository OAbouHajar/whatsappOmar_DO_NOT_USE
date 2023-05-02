package X;

import android.util.SparseArray;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: X.2P1  reason: invalid class name */
public class AnonymousClass2P1 implements C29181aA {
    public C29191aB[] A00;
    public final int A01;
    public final int A02;
    public final AnonymousClass2I6 A03;
    public final AnonymousClass1CK A04;
    public final RandomAccessFile A05;
    public final long[] A06;

    public AnonymousClass2P1(AnonymousClass2I6 r2, AnonymousClass1CK r3, RandomAccessFile randomAccessFile, int i2, int i3) {
        this.A05 = randomAccessFile;
        this.A03 = r2;
        this.A02 = i2;
        this.A01 = i3;
        this.A04 = r3;
        this.A06 = new long[i2];
    }

    public boolean A5v() {
        C29191aB[] r2 = this.A00;
        return r2[(this.A03.A01 + 1) % r2.length].A06();
    }

    public void A6B() {
        for (C29191aB A012 : this.A00) {
            A012.A01();
            this.A06[this.A03.A01] = 0;
        }
    }

    public C29191aB A7h() {
        return this.A00[this.A03.A01];
    }

    public void A8I(List list) {
        if (AHV()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue = ((Number) it.next()).intValue();
                if (intValue != this.A03.A01 && !this.A00[intValue].A06()) {
                    this.A00[intValue].A01();
                    this.A06[intValue] = 0;
                }
            }
            return;
        }
        throw new Error("InMemoryMultipleEventBuffersManager: Tried to drop empty buffer");
    }

    public boolean A98() {
        try {
            for (C29191aB A022 : this.A00) {
                A022.A02();
            }
            return true;
        } catch (IOException unused) {
            Log.e("InMemoryMultipleEventBufferManager/flushEventBuffers: error while event buffer flush");
            return false;
        }
    }

    public long AAE() {
        long j2 = 0;
        int i2 = 0;
        while (i2 < this.A02) {
            j2 += i2 == this.A03.A01 ? (long) this.A00[i2].A00() : this.A06[i2];
            i2++;
        }
        return j2;
    }

    public SparseArray ABd() {
        SparseArray sparseArray = new SparseArray();
        AnonymousClass2I6 r3 = this.A03;
        int i2 = r3.A01 + 1;
        while (true) {
            C29191aB[] r1 = this.A00;
            int length = i2 % r1.length;
            if (length == r3.A01) {
                return sparseArray;
            }
            C29191aB r12 = r1[length];
            if (!r12.A06()) {
                ByteBuffer byteBuffer = r12.A04.A05;
                sparseArray.put(length, Arrays.copyOf(byteBuffer.array(), byteBuffer.position()));
            }
            i2 = length + 1;
        }
    }

    public boolean AHV() {
        for (C29191aB r1 : this.A00) {
            if (!r1.A05() && !r1.A06()) {
                return true;
            }
        }
        return false;
    }

    public void AI9() {
        AIL();
        int i2 = 0;
        while (true) {
            C29191aB[] r1 = this.A00;
            if (i2 < r1.length) {
                AnonymousClass2I6 r4 = this.A03;
                AnonymousClass2I7 r6 = r4.A05[i2];
                try {
                    r1[i2].A03();
                    long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
                    if (i2 == r4.A01) {
                        long j2 = r6.A04;
                        if (j2 > seconds) {
                            StringBuilder sb = new StringBuilder("InMemoryMultipleEventBuffersManager/initfromfile: current event buffer timestamp is ");
                            sb.append(j2 - seconds);
                            sb.append(" seconds in the future");
                            Log.w(sb.toString());
                            r6.A04 = seconds;
                        }
                    }
                    Locale locale = Locale.US;
                    Object[] objArr = new Object[6];
                    C29191aB A7h = A7h();
                    if (A7h.A05()) {
                        objArr[0] = Integer.valueOf(A7h.A01);
                        objArr[1] = Integer.valueOf(A7h().A00());
                        C29191aB A7h2 = A7h();
                        if (A7h2.A05()) {
                            objArr[2] = Integer.valueOf(A7h2.A03.A00.size());
                            objArr[3] = Integer.valueOf(A7h().A04.A05.position());
                            C29191aB A7h3 = A7h();
                            objArr[4] = Long.valueOf(A7h3.A05.A05[A7h3.A02].A04);
                            int i3 = 0;
                            for (C29191aB r12 : this.A00) {
                                if (!r12.A05()) {
                                    i3 += r12.A04.A05.position();
                                }
                            }
                            objArr[5] = Integer.valueOf(i3);
                            Log.i(String.format(locale, "InMemoryMultipleEventBuffersManager/initfromfile: opened existing wam file: record_count = %d, event_count = %d, attribute_count = %d, size = %d, create_ts = %d, rotated_size = %d", objArr));
                            i2++;
                        } else {
                            throw new UnsupportedOperationException("No attribute count available for rotated buffers");
                        }
                    } else {
                        throw new UnsupportedOperationException("No record count available for rotated buffers");
                    }
                } catch (AnonymousClass2PO e2) {
                    throw new C48772Oy(e2.toString());
                }
            } else {
                long[] jArr = this.A06;
                int i4 = this.A03.A01;
                jArr[i4] = (long) r1[i4].A00();
                return;
            }
        }
    }

    public void AIL() {
        this.A00 = new C29191aB[this.A02];
        int i2 = 0;
        while (true) {
            C29191aB[] r1 = this.A00;
            if (i2 < r1.length) {
                RandomAccessFile randomAccessFile = this.A05;
                r1[i2] = new C29191aB(this.A03, this.A04, randomAccessFile, i2, this.A01);
                i2++;
            } else {
                return;
            }
        }
    }

    public void Acf() {
        long[] jArr = this.A06;
        AnonymousClass2I6 r3 = this.A03;
        int i2 = r3.A01;
        jArr[i2] = (long) A7h().A00();
        r3.A01 = (i2 + 1) % this.A00.length;
    }
}
