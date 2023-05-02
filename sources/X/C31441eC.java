package X;

import android.util.Log;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.ClosedByInterruptException;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.1eC  reason: invalid class name and case insensitive filesystem */
public final class C31441eC {
    public static final ReentrantReadWriteLock A00 = new ReentrantReadWriteLock();

    public static long A00(C31121dV r1, ByteBuffer byteBuffer, long j2) {
        A01(r1, byteBuffer, 4, j2);
        return ((long) byteBuffer.getInt()) & 4294967295L;
    }

    public static void A01(C31121dV r3, ByteBuffer byteBuffer, int i2, long j2) {
        int AbO;
        byteBuffer.position(0);
        byteBuffer.limit(i2);
        while (byteBuffer.remaining() > 0 && (AbO = r3.AbO(byteBuffer, j2)) != -1) {
            j2 += (long) AbO;
        }
        if (byteBuffer.remaining() <= 0) {
            byteBuffer.position(0);
            return;
        }
        throw new C31561eO("ELF file truncated");
    }

    public static String[] A02(C31121dV r31) {
        long j2;
        int i2;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        long j8;
        long j9;
        long j10;
        long j11;
        long j12;
        long j13;
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        C31121dV r9 = r31;
        long A002 = A00(r9, allocate, 0);
        if (A002 == 1179403647) {
            A01(r9, allocate, 1, 4);
            boolean z2 = true;
            if (((short) (allocate.get() & 255)) != 1) {
                z2 = false;
            }
            A01(r9, allocate, 1, 5);
            if (((short) (allocate.get() & 255)) == 2) {
                allocate.order(ByteOrder.BIG_ENDIAN);
            }
            if (z2) {
                j2 = A00(r9, allocate, 28);
                i2 = 2;
                A01(r9, allocate, 2, 44);
                j3 = (long) (allocate.getShort() & 65535);
                j4 = 42;
            } else {
                A01(r9, allocate, 8, 32);
                j2 = allocate.getLong();
                i2 = 2;
                A01(r9, allocate, 2, 56);
                j3 = (long) (allocate.getShort() & 65535);
                j4 = 54;
            }
            A01(r9, allocate, i2, j4);
            short s2 = allocate.getShort() & 65535;
            if (j3 == 65535) {
                if (z2) {
                    j13 = A00(r9, allocate, 32) + 28;
                } else {
                    A01(r9, allocate, 8, 40);
                    j13 = allocate.getLong() + 44;
                }
                j3 = A00(r9, allocate, j13);
            }
            long j14 = j2;
            long j15 = 0;
            while (true) {
                if (j15 >= j3) {
                    break;
                } else if (A00(r9, allocate, j14 + 0) == 2) {
                    if (z2) {
                        j5 = A00(r9, allocate, j14 + 4);
                    } else {
                        A01(r9, allocate, 8, j14 + 8);
                        j5 = allocate.getLong();
                    }
                    if (j5 != 0) {
                        long j16 = j5;
                        long j17 = 0;
                        int i3 = 0;
                        do {
                            long j18 = j16 + 0;
                            if (z2) {
                                j6 = A00(r9, allocate, j18);
                            } else {
                                A01(r9, allocate, 8, j18);
                                j6 = allocate.getLong();
                            }
                            if (j6 == 1) {
                                if (i3 != Integer.MAX_VALUE) {
                                    i3++;
                                } else {
                                    throw new C31561eO("malformed DT_NEEDED section");
                                }
                            } else if (j6 == 5) {
                                if (z2) {
                                    j17 = A00(r9, allocate, j16 + 4);
                                } else {
                                    A01(r9, allocate, 8, j16 + 8);
                                    j17 = allocate.getLong();
                                }
                            }
                            j7 = 16;
                            j16 += z2 ? 8 : 16;
                        } while (j6 != 0);
                        if (j17 != 0) {
                            int i4 = 0;
                            while (true) {
                                if (((long) i4) >= j3) {
                                    break;
                                }
                                if (A00(r9, allocate, j2 + 0) == 1) {
                                    if (z2) {
                                        j8 = A00(r9, allocate, j2 + 8);
                                        j9 = A00(r9, allocate, j2 + 20);
                                    } else {
                                        A01(r9, allocate, 8, j2 + j7);
                                        j8 = allocate.getLong();
                                        A01(r9, allocate, 8, j2 + 40);
                                        j9 = allocate.getLong();
                                    }
                                    if (j8 <= j17 && j17 < j9 + j8) {
                                        if (z2) {
                                            j10 = A00(r9, allocate, j2 + 4);
                                        } else {
                                            A01(r9, allocate, 8, j2 + 8);
                                            j10 = allocate.getLong();
                                        }
                                        long j19 = j10 + (j17 - j8);
                                        if (j19 != 0) {
                                            String[] strArr = new String[i3];
                                            int i5 = 0;
                                            do {
                                                long j20 = j5 + 0;
                                                if (z2) {
                                                    j11 = A00(r9, allocate, j20);
                                                } else {
                                                    A01(r9, allocate, 8, j20);
                                                    j11 = allocate.getLong();
                                                }
                                                if (j11 == 1) {
                                                    if (z2) {
                                                        j12 = A00(r9, allocate, j5 + 4);
                                                    } else {
                                                        A01(r9, allocate, 8, j5 + 8);
                                                        j12 = allocate.getLong();
                                                    }
                                                    long j21 = j12 + j19;
                                                    StringBuilder sb = new StringBuilder();
                                                    while (true) {
                                                        long j22 = 1 + j21;
                                                        A01(r9, allocate, 1, j21);
                                                        short s3 = (short) (allocate.get() & 255);
                                                        if (s3 == 0) {
                                                            break;
                                                        }
                                                        sb.append((char) s3);
                                                        j21 = j22;
                                                    }
                                                    strArr[i5] = sb.toString();
                                                    if (i5 != Integer.MAX_VALUE) {
                                                        i5++;
                                                    } else {
                                                        throw new C31561eO("malformed DT_NEEDED section");
                                                    }
                                                }
                                                j5 += z2 ? 8 : 16;
                                            } while (j11 != 0);
                                            if (i5 == i3) {
                                                return strArr;
                                            }
                                            throw new C31561eO("malformed DT_NEEDED section");
                                        }
                                    }
                                }
                                j2 += (long) s2;
                                i4++;
                                j7 = 16;
                            }
                            throw new C31561eO("did not find file offset of DT_STRTAB table");
                        }
                        throw new C31561eO("Dynamic section string-table not found");
                    }
                } else {
                    j14 += (long) s2;
                    j15++;
                }
            }
            throw new C31561eO("ELF file does not contain dynamic linking information");
        }
        StringBuilder sb2 = new StringBuilder("file is not ELF: 0x");
        sb2.append(Long.toHexString(A002));
        throw new C31561eO(sb2.toString());
    }

    public static String[] A03(C31121dV r4) {
        if (!(r4 instanceof C31431eA)) {
            return A02(r4);
        }
        C31431eA r42 = (C31431eA) r4;
        int i2 = 0;
        while (true) {
            try {
                return A02(r42);
            } catch (ClosedByInterruptException e2) {
                i2++;
                if (i2 <= 4) {
                    Thread.interrupted();
                    Log.e("MinElf", "retrying extract_DT_NEEDED due to ClosedByInterruptException", e2);
                    FileInputStream fileInputStream = new FileInputStream(r42.A00);
                    r42.A01 = fileInputStream;
                    r42.A02 = fileInputStream.getChannel();
                } else {
                    throw e2;
                }
            }
        }
    }
}
