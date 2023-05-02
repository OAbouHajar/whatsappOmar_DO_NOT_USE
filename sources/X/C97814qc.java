package X;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import com.facebook.msys.mci.DefaultCrypto;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.4qc  reason: invalid class name and case insensitive filesystem */
public final class C97814qc implements C107735Le {
    public static Boolean A01;
    public static Long A02;
    public static final C90644eV A03;
    public static final C84174Jn A04;
    public static final C84174Jn A05 = new C84174Jn(new C84174Jn(new C84174Jn(Uri.parse(C13680ns.A0g(String.valueOf(Uri.encode("com.google.android.gms.clearcut.public")), "content://com.google.android.gms.phenotype/")), "", "").A00, "gms:playlog:service:sampling_", "").A00, "gms:playlog:service:sampling_", "LogSampling__");
    public static final Charset A06 = Charset.forName(DefaultCrypto.UTF_8);
    public static final HashMap A07 = AnonymousClass000.A0x();
    public static final ConcurrentHashMap A08 = new ConcurrentHashMap();
    public final Context A00;

    static {
        String valueOf = String.valueOf(Uri.encode("com.google.android.gms.clearcut.public"));
        C84174Jn r4 = new C84174Jn(new C84174Jn(new C84174Jn(Uri.parse(AnonymousClass3K3.A0o("content://com.google.android.gms.phenotype/", valueOf, valueOf.length())), "", "").A00, "gms:playlog:service:samplingrules_", "").A00, "gms:playlog:service:samplingrules_", "LogSamplingRules__");
        A04 = r4;
        A03 = new C66333Yy(r4, false);
    }

    public C97814qc(Context context) {
        this.A00 = context;
        if (context != null) {
            C90644eV.A01(context);
        }
    }

    public static long A00(long j2, long j3, long j4) {
        long j5 = (j2 ^ j3) * j4;
        long j6 = ((j5 ^ (j5 >>> 47)) ^ j3) * j4;
        return (j6 ^ (j6 >>> 47)) * j4;
    }

    public static long A01(Context context) {
        Object obj;
        Long l2 = A02;
        if (l2 == null) {
            long j2 = 0;
            if (context == null) {
                return 0;
            }
            Boolean bool = A01;
            if (bool == null) {
                bool = Boolean.valueOf(AnonymousClass000.A1P(C15560rQ.A00(context).A00.checkCallingOrSelfPermission("com.google.android.providers.gsf.permission.READ_GSERVICES")));
                A01 = bool;
            }
            if (bool.booleanValue()) {
                ContentResolver contentResolver = context.getContentResolver();
                Class<C90434e8> cls = C90434e8.class;
                synchronized (cls) {
                    C90434e8.A01(contentResolver);
                    obj = C90434e8.A00;
                }
                HashMap hashMap = C90434e8.A08;
                long j3 = 0;
                long j4 = 0L;
                synchronized (cls) {
                    if (hashMap.containsKey("android_id")) {
                        Object obj2 = hashMap.get("android_id");
                        if (obj2 != null) {
                            j4 = obj2;
                        }
                    } else {
                        j4 = null;
                    }
                }
                Number number = (Number) j4;
                if (number != null) {
                    j2 = number.longValue();
                } else {
                    String A002 = C90434e8.A00(contentResolver, "android_id");
                    if (A002 != null) {
                        try {
                            long parseLong = Long.parseLong(A002);
                            number = Long.valueOf(parseLong);
                            j3 = parseLong;
                        } catch (NumberFormatException unused) {
                        }
                    }
                    synchronized (cls) {
                        if (obj == C90434e8.A00) {
                            hashMap.put("android_id", number);
                            C90434e8.A01.remove("android_id");
                        }
                    }
                    j2 = j3;
                }
            }
            l2 = Long.valueOf(j2);
            A02 = l2;
        }
        return l2.longValue();
    }

    public static long A02(String str, long j2) {
        ByteBuffer allocate;
        String str2 = str;
        if (str == null || str2.isEmpty()) {
            allocate = ByteBuffer.allocate(8);
        } else {
            byte[] bytes = str2.getBytes(A06);
            allocate = ByteBuffer.allocate(bytes.length + 8);
            allocate.put(bytes);
        }
        allocate.putLong(j2);
        byte[] array = allocate.array();
        int length = array.length;
        if (length <= length) {
            char c2 = 0;
            if (length <= 32) {
                if (length > 16) {
                    long j3 = ((long) (length << 1)) - 7286425919675154353L;
                    long A032 = A03(array, 0) * -5435081209227447693L;
                    long A033 = A03(array, 8);
                    long A034 = A03(array, length - 8) * j3;
                    return A00(Long.rotateRight(A032 + A033, 43) + Long.rotateRight(A034, 30) + (A03(array, length - 16) * -7286425919675154353L), A032 + Long.rotateRight(A033 - 7286425919675154353L, 18) + A034, j3);
                } else if (length >= 8) {
                    long j4 = ((long) (length << 1)) - 7286425919675154353L;
                    long A035 = A03(array, 0) - 7286425919675154353L;
                    long A036 = A03(array, length - 8);
                    return A00((Long.rotateRight(A036, 37) * j4) + A035, (Long.rotateRight(A035, 25) + A036) * j4, j4);
                } else if (length >= 4) {
                    return A00(((long) length) + ((((long) (((array[3] & 255) << 24) | AnonymousClass3K3.A0M(array, 2, AnonymousClass3K3.A0L(array, 1, array[0] & 255)))) & 4294967295L) << 3), ((long) AnonymousClass3K2.A0D(array, length - 4)) & 4294967295L, ((long) (length << 1)) - 7286425919675154353L);
                } else if (length <= 0) {
                    return -7286425919675154353L;
                } else {
                    long j5 = (((long) ((array[0] & 255) + ((array[length >> 1] & 255) << 8))) * -7286425919675154353L) ^ (((long) (length + ((array[length - 1] & 255) << 2))) * -4348849565147123417L);
                    return (j5 ^ (j5 >>> 47)) * -7286425919675154353L;
                }
            } else if (length <= 64) {
                long j6 = ((long) (length << 1)) - 7286425919675154353L;
                long A037 = A03(array, 0) * -7286425919675154353L;
                long A038 = A03(array, 8);
                long A039 = A03(array, length - 8) * j6;
                long rotateRight = Long.rotateRight(A037 + A038, 43) + Long.rotateRight(A039, 30) + (A03(array, length - 16) * -7286425919675154353L);
                long A002 = A00(rotateRight, Long.rotateRight(-7286425919675154353L + A038, 18) + A037 + A039, j6);
                long A0310 = A03(array, 16) * j6;
                long A0311 = A03(array, 24);
                long A0312 = (rotateRight + A03(array, length - 32)) * j6;
                return A00(((A002 + A03(array, length - 24)) * j6) + Long.rotateRight(A0310 + A0311, 43) + Long.rotateRight(A0312, 30), A0310 + Long.rotateRight(A0311 + A037, 18) + A0312, j6);
            } else {
                long j7 = 2480279821605975764L;
                long j8 = 1390051526045402406L;
                long[] jArr = new long[2];
                long[] jArr2 = new long[2];
                long A0313 = A03(array, 0) + 95310865018149119L;
                int i2 = length - 1;
                int i3 = (i2 >> 6) << 6;
                int i4 = i2 & 63;
                int i5 = (i3 + i4) - 63;
                int i6 = 0;
                while (true) {
                    long rotateRight2 = (Long.rotateRight(((A0313 + j7) + jArr[c2]) + A03(array, i6 + 8), 37) * -5435081209227447693L) ^ jArr2[1];
                    j7 = (Long.rotateRight(j7 + jArr[1] + A03(array, i6 + 48), 42) * -5435081209227447693L) + jArr[0] + A03(array, i6 + 40);
                    A0313 = Long.rotateRight(j8 + jArr2[0], 33) * -5435081209227447693L;
                    byte[] bArr = array;
                    A04(bArr, jArr, i6, jArr[1] * -5435081209227447693L, rotateRight2 + jArr2[0]);
                    long[] jArr3 = jArr2;
                    A04(bArr, jArr3, i6 + 32, A0313 + jArr2[1], j7 + A03(array, i6 + 16));
                    i6 += 64;
                    if (i6 == i3) {
                        long j9 = -5435081209227447693L + ((255 & rotateRight2) << 1);
                        long j10 = jArr2[0] + ((long) i4);
                        jArr2[0] = j10;
                        long j11 = jArr[0] + j10;
                        jArr[0] = j11;
                        jArr2[0] = jArr2[0] + j11;
                        long rotateRight3 = (Long.rotateRight(((A0313 + j7) + jArr[0]) + A03(array, i5 + 8), 37) * j9) ^ (jArr2[1] * 9);
                        long rotateRight4 = (Long.rotateRight(j7 + jArr[1] + A03(array, i5 + 48), 42) * j9) + (jArr[0] * 9) + A03(array, i5 + 40);
                        long rotateRight5 = Long.rotateRight(rotateRight2 + jArr2[0], 33) * j9;
                        A04(array, jArr, i5, jArr[1] * j9, rotateRight3 + jArr2[0]);
                        A04(bArr, jArr3, i5 + 32, jArr2[1] + rotateRight5, rotateRight4 + A03(array, i5 + 16));
                        return A00(A00(jArr[0], jArr2[0], j9) + ((rotateRight4 ^ (rotateRight4 >>> 47)) * -4348849565147123417L) + rotateRight3, A00(jArr[1], jArr2[1], j9) + rotateRight5, j9);
                    }
                    j8 = rotateRight2;
                    c2 = 0;
                }
            }
        } else {
            throw new IndexOutOfBoundsException(C13680ns.A0i("Out of bound index with offput: 0 and length: ", C13690nt.A0g(67), length));
        }
    }

    public static long A03(byte[] bArr, int i2) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr, i2, 8);
        wrap.order(ByteOrder.LITTLE_ENDIAN);
        return wrap.getLong();
    }

    public static void A04(byte[] bArr, long[] jArr, int i2, long j2, long j3) {
        long A032 = A03(bArr, i2);
        long A033 = A03(bArr, i2 + 8);
        long A034 = A03(bArr, i2 + 16);
        long A035 = A03(bArr, i2 + 24);
        long j4 = j2 + A032;
        long j5 = A033 + j4 + A034;
        jArr[0] = j5 + A035;
        jArr[1] = Long.rotateRight(j3 + j4 + A035, 21) + Long.rotateRight(j5, 44) + j4;
    }
}
