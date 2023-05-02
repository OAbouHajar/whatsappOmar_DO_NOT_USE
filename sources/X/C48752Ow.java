package X;

import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.2Ow  reason: invalid class name and case insensitive filesystem */
public class C48752Ow implements C29181aA {
    public C29191aB A00;
    public final int A01;
    public final int A02;
    public final AnonymousClass2I6 A03;
    public final AnonymousClass1CK A04;
    public final RandomAccessFile A05;
    public final long[] A06;

    public C48752Ow(AnonymousClass2I6 r2, AnonymousClass1CK r3, RandomAccessFile randomAccessFile, int i2, int i3) {
        this.A05 = randomAccessFile;
        this.A03 = r2;
        this.A02 = i2;
        this.A01 = i3;
        this.A04 = r3;
        this.A06 = new long[i2];
    }

    public C29191aB A00(int i2) {
        RandomAccessFile randomAccessFile = this.A05;
        AnonymousClass2I6 r4 = this.A03;
        C29191aB r3 = new C29191aB(r4, this.A04, randomAccessFile, i2, this.A01);
        try {
            r3.A03();
            if (i2 == r4.A01) {
                this.A06[i2] = (long) r3.A00();
                return r3;
            }
        } catch (AnonymousClass2PO e2) {
            StringBuilder sb = new StringBuilder("InMemorySingleEventBufferManager/readEventBufferFromDisk: error in reading event buffer");
            sb.append(e2.toString());
            Log.e(sb.toString());
        }
        return r3;
    }

    public boolean A5v() {
        C29191aB A002;
        if (this instanceof C48742Ov) {
            C48742Ov r2 = (C48742Ov) this;
            if (!r2.A01.A01()) {
                return true;
            }
            A002 = r2.A00(1);
        } else {
            A002 = A00((this.A03.A01 + 1) % this.A02);
        }
        return A002.A06();
    }

    public void A6B() {
        C29191aB r0 = this.A00;
        if (r0 != null) {
            r0.A01();
            this.A06[this.A03.A01] = 0;
        }
    }

    public C29191aB A7h() {
        return this.A00;
    }

    public void A8I(List list) {
        int i2;
        if (this instanceof C48742Ov) {
            C48742Ov r4 = (C48742Ov) this;
            AnonymousClass2PD r8 = r4.A01;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue = ((Number) it.next()).intValue();
                if (intValue < 1000) {
                    int i3 = intValue >> 3;
                    int i4 = intValue % 8;
                    Iterator it2 = r8.A02.entrySet().iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        AnonymousClass2PF r2 = (AnonymousClass2PF) ((Map.Entry) it2.next()).getValue();
                        if (i3 == r2.A05) {
                            ArrayList arrayList = r2.A04;
                            ((AnonymousClass2PG) arrayList.get(i4)).A01 = 8;
                            ((AnonymousClass2PG) arrayList.get(i4)).A02 = false;
                            try {
                                RandomAccessFile randomAccessFile = r2.A07;
                                randomAccessFile.seek((long) ((i4 * 9) + 56));
                                randomAccessFile.writeInt(8);
                                randomAccessFile.skipBytes(4);
                                randomAccessFile.writeBoolean(false);
                                break;
                            } catch (IOException e2) {
                                StringBuilder sb = new StringBuilder("queuefile/dropsentdata ");
                                sb.append(e2.getMessage());
                                Log.e(sb.toString());
                            }
                        }
                    }
                }
            }
            int i5 = 0;
            do {
                boolean[] zArr = r8.A04;
                if (zArr[i5]) {
                    HashMap hashMap = r8.A02;
                    Iterator it3 = hashMap.entrySet().iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        Map.Entry entry = (Map.Entry) it3.next();
                        AnonymousClass2PF r11 = (AnonymousClass2PF) entry.getValue();
                        Object key = entry.getKey();
                        if (r11.A05 == i5) {
                            int i6 = 0;
                            int i7 = 0;
                            while (true) {
                                i2 = r11.A01;
                                if (i6 >= i2) {
                                    break;
                                }
                                if (((AnonymousClass2PG) r11.A04.get(i6)).A01 <= 8) {
                                    i7++;
                                }
                                i6++;
                            }
                            if (i7 == i2) {
                                try {
                                    r11.A07.close();
                                } catch (IOException e3) {
                                    StringBuilder sb2 = new StringBuilder("queuefile/flush failed to close file ");
                                    sb2.append(e3.getMessage());
                                    Log.e(sb2.toString());
                                }
                                zArr[i5] = false;
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append(r8.A01);
                                sb3.append("wampsid");
                                sb3.append(i5);
                                try {
                                    new File(sb3.toString()).delete();
                                } catch (Exception e4) {
                                    StringBuilder sb4 = new StringBuilder("psuploadqueue/dropSentData failed to delete closed queue file ");
                                    sb4.append(e4.toString());
                                    Log.e(sb4.toString());
                                }
                                hashMap.remove(key);
                            }
                        }
                    }
                }
                i5++;
            } while (i5 < 8);
            r8.A05.A0K().putBoolean("events_ps_phase3_migration_done", true).apply();
            C29191aB A002 = r4.A00(1);
            if (r4.A00) {
                ByteBuffer A012 = A002.A04.A01();
                if (A012.limit() > 0) {
                    r4.A01(A012, false);
                }
                r4.A00 = false;
            }
            try {
                A002.A01();
                A002.A02();
            } catch (IOException e5) {
                StringBuilder sb5 = new StringBuilder("privatestatseventbuffermanager/dropsentdata: ioexception while flushing back buffer");
                sb5.append(e5.toString());
                Log.e(sb5.toString());
            }
        } else if (AHV()) {
            Iterator it4 = list.iterator();
            while (it4.hasNext()) {
                int intValue2 = ((Number) it4.next()).intValue();
                if (intValue2 != this.A03.A01) {
                    C29191aB A003 = A00(intValue2);
                    if (!A003.A06()) {
                        A003.A01();
                        this.A06[intValue2] = 0;
                        try {
                            A003.A02();
                        } catch (IOException e6) {
                            StringBuilder sb6 = new StringBuilder("InMemorySingleEventBufferManager/dropSentData: error while event buffer flush");
                            sb6.append(e6.toString());
                            Log.e(sb6.toString());
                        }
                    }
                }
            }
        } else {
            throw new Error("InMemorySingleEventBufferManager/dropSentData: Tried to drop empty buffer");
        }
    }

    public boolean A98() {
        try {
            this.A00.A02();
            return true;
        } catch (IOException unused) {
            Log.e("InMemorySingleEventBufferManager/flushEventBuffers: error while event buffer flush");
            return false;
        }
    }

    public long AAE() {
        long j2 = 0;
        int i2 = 0;
        while (i2 < this.A02) {
            j2 += i2 == this.A03.A01 ? (long) this.A00.A00() : this.A06[i2];
            i2++;
        }
        return j2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x009c A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.util.SparseArray ABd() {
        /*
            r14 = this;
            boolean r0 = r14 instanceof X.C48742Ov
            if (r0 == 0) goto L_0x00d9
            r0 = r14
            X.2Ov r0 = (X.C48742Ov) r0
            X.2PD r0 = r0.A01
            android.util.SparseArray r2 = new android.util.SparseArray
            r2.<init>()
            java.util.HashMap r0 = r0.A02
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r7 = r0.iterator()
        L_0x0018:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0109
            java.lang.Object r0 = r7.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r4 = r0.getValue()
            X.2PF r4 = (X.AnonymousClass2PF) r4
            r5 = 0
            r3 = 0
        L_0x002c:
            int r0 = r4.A01
            if (r3 >= r0) goto L_0x003f
            java.util.ArrayList r0 = r4.A04
            java.lang.Object r0 = r0.get(r3)
            X.2PG r0 = (X.AnonymousClass2PG) r0
            int r1 = r0.A01
            r0 = 8
            if (r1 <= r0) goto L_0x00d5
            r5 = 1
        L_0x003f:
            if (r5 == 0) goto L_0x0018
            android.util.SparseArray r3 = new android.util.SparseArray
            r3.<init>()
            r11 = 0
        L_0x0047:
            int r0 = r4.A01
            if (r11 >= r0) goto L_0x00bb
            int r0 = r4.A00
            if (r11 != r0) goto L_0x009f
            X.2PK r8 = r4.A02
        L_0x0051:
            int r5 = r8.A02
            r1 = 8
            r0 = 0
            if (r5 > r1) goto L_0x0059
            r0 = 1
        L_0x0059:
            if (r0 != 0) goto L_0x009c
            if (r5 <= r1) goto L_0x008b
            byte[] r6 = new byte[r5]
            java.io.RandomAccessFile r5 = r8.A05     // Catch:{ EOFException -> 0x007d, IOException -> 0x0083 }
            long r0 = r8.A03     // Catch:{ EOFException -> 0x007d, IOException -> 0x0083 }
            r5.seek(r0)     // Catch:{ EOFException -> 0x007d, IOException -> 0x0083 }
            r1 = 0
            int r0 = r8.A02     // Catch:{ EOFException -> 0x007d, IOException -> 0x0083 }
            r5.readFully(r6, r1, r0)     // Catch:{ EOFException -> 0x007d, IOException -> 0x0083 }
            int r0 = r8.A01     // Catch:{ EOFException -> 0x007d, IOException -> 0x0083 }
            int r0 = r0 * 9
            int r0 = r0 + 56
            int r0 = r0 + 8
            long r0 = (long) r0     // Catch:{ EOFException -> 0x007d, IOException -> 0x0083 }
            r5.seek(r0)     // Catch:{ EOFException -> 0x007d, IOException -> 0x0083 }
            r0 = 1
            r5.writeBoolean(r0)     // Catch:{ EOFException -> 0x007d, IOException -> 0x0083 }
            goto L_0x008c
        L_0x007d:
            X.1CK r0 = r8.A04
            r0.A04()
            goto L_0x0088
        L_0x0083:
            X.1CK r0 = r8.A04
            r0.A06()
        L_0x0088:
            r0.A09()
        L_0x008b:
            r6 = 0
        L_0x008c:
            if (r6 == 0) goto L_0x009c
            r3.put(r11, r6)
            java.util.ArrayList r0 = r4.A04
            java.lang.Object r1 = r0.get(r11)
            X.2PG r1 = (X.AnonymousClass2PG) r1
            r0 = 1
            r1.A02 = r0
        L_0x009c:
            int r11 = r11 + 1
            goto L_0x0047
        L_0x009f:
            java.io.RandomAccessFile r10 = r4.A07
            java.util.ArrayList r1 = r4.A04
            java.lang.Object r0 = r1.get(r11)
            X.2PG r0 = (X.AnonymousClass2PG) r0
            int r12 = r0.A01
            java.lang.Object r0 = r1.get(r11)
            X.2PG r0 = (X.AnonymousClass2PG) r0
            int r13 = r0.A00
            X.1CK r9 = r4.A06
            X.2PK r8 = new X.2PK
            r8.<init>(r9, r10, r11, r12, r13)
            goto L_0x0051
        L_0x00bb:
            r6 = 0
        L_0x00bc:
            int r0 = r3.size()
            if (r6 >= r0) goto L_0x0018
            int r5 = r3.keyAt(r6)
            java.lang.Object r1 = r3.get(r5)
            int r0 = r4.A05
            int r0 = r0 << 3
            int r0 = r0 + r5
            r2.put(r0, r1)
            int r6 = r6 + 1
            goto L_0x00bc
        L_0x00d5:
            int r3 = r3 + 1
            goto L_0x002c
        L_0x00d9:
            android.util.SparseArray r2 = new android.util.SparseArray
            r2.<init>()
            X.2I6 r4 = r14.A03
            int r3 = r4.A01
        L_0x00e2:
            int r3 = r3 + 1
            int r0 = r14.A02
            int r3 = r3 % r0
            int r0 = r4.A01
            if (r3 == r0) goto L_0x0109
            X.1aB r1 = r14.A00(r3)
            boolean r0 = r1.A06()
            if (r0 != 0) goto L_0x00e2
            X.02I r0 = r1.A04
            java.nio.ByteBuffer r0 = r0.A05
            byte[] r1 = r0.array()
            int r0 = r0.position()
            byte[] r0 = java.util.Arrays.copyOf(r1, r0)
            r2.put(r3, r0)
            goto L_0x00e2
        L_0x0109:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48752Ow.ABd():android.util.SparseArray");
    }

    public boolean AHV() {
        if (this instanceof C48742Ov) {
            return ((C48742Ov) this).A01.A01();
        }
        for (int i2 = 0; i2 < this.A02; i2++) {
            if (i2 != this.A03.A01 && !A00(i2).A06()) {
                return true;
            }
        }
        return false;
    }

    public void AI9() {
        AnonymousClass2I6 r1 = this.A03;
        AnonymousClass2I7[] r0 = r1.A05;
        int i2 = r1.A01;
        AnonymousClass2I7 r6 = r0[i2];
        C29191aB r02 = new C29191aB(r1, this.A04, this.A05, i2, this.A01);
        this.A00 = r02;
        try {
            r02.A03();
            this.A06[r1.A01] = (long) this.A00.A00();
            long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
            long j2 = r6.A04;
            if (j2 > seconds) {
                StringBuilder sb = new StringBuilder("InMemorySingleEventBufferManager/init event from file: current event buffer timestamp is ");
                sb.append(j2 - seconds);
                sb.append(" seconds in the future");
                Log.w(sb.toString());
                r6.A04 = seconds;
            }
            Locale locale = Locale.US;
            Object[] objArr = new Object[5];
            C29191aB r2 = this.A00;
            if (r2.A05()) {
                objArr[0] = Integer.valueOf(r2.A01);
                objArr[1] = Integer.valueOf(r2.A00());
                objArr[2] = Integer.valueOf(r2.A03.A00.size());
                objArr[3] = Integer.valueOf(this.A00.A04.A05.position());
                C29191aB r22 = this.A00;
                objArr[4] = Long.valueOf(r22.A05.A05[r22.A02].A04);
                Log.i(String.format(locale, "InMemorySingleEventBufferManager/initfromfile: opened existing wam file: record_count = %d, event_count = %d, attribute_count = %d, size = %d, create_ts = %d", objArr));
                return;
            }
            throw new UnsupportedOperationException("No record count available for rotated buffers");
        } catch (AnonymousClass2PO e2) {
            throw new C48772Oy(e2.toString());
        }
    }

    public void AIL() {
        RandomAccessFile randomAccessFile = this.A05;
        AnonymousClass2I6 r1 = this.A03;
        this.A00 = new C29191aB(r1, this.A04, randomAccessFile, r1.A01, this.A01);
    }

    public void Acf() {
        if (this instanceof C48742Ov) {
            C48742Ov r3 = (C48742Ov) this;
            C29191aB r2 = r3.A00;
            ByteBuffer A012 = r2.A04.A01();
            if (A012.limit() != 0) {
                r3.A01(A012, true);
                try {
                    r2.A01();
                    r2.A02();
                } catch (IOException e2) {
                    e2.toString();
                }
            }
        } else {
            long[] jArr = this.A06;
            AnonymousClass2I6 r32 = this.A03;
            int i2 = r32.A01;
            jArr[i2] = (long) this.A00.A00();
            int i3 = (i2 + 1) % this.A02;
            r32.A01 = i3;
            this.A00 = A00(i3);
        }
    }
}
