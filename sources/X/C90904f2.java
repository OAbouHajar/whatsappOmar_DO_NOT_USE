package X;

import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* renamed from: X.4f2  reason: invalid class name and case insensitive filesystem */
public final class C90904f2 {
    public static final long A00;
    public static final long A01;
    public static final AnonymousClass4XX A02;
    public static final Class A03;
    public static final Logger A04 = Logger.getLogger(C90904f2.class.getName());
    public static final Unsafe A05;
    public static final boolean A06;
    public static final boolean A07;
    public static final boolean A08 = AnonymousClass000.A1Y(ByteOrder.nativeOrder(), ByteOrder.BIG_ENDIAN);

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x012b, code lost:
        r0 = A02;
     */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x013e A[SYNTHETIC, Splitter:B:52:0x013e] */
    static {
        /*
            java.lang.Class<java.lang.Object[]> r19 = java.lang.Object[].class
            java.lang.Class<double[]> r18 = double[].class
            java.lang.Class<float[]> r17 = float[].class
            java.lang.Class<long[]> r16 = long[].class
            java.lang.Class<int[]> r15 = int[].class
            java.lang.Class<boolean[]> r14 = boolean[].class
            java.lang.Class<X.4f2> r0 = X.C90904f2.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            A04 = r0
            sun.misc.Unsafe r4 = A03()
            A05 = r4
            java.lang.Class r5 = X.C87854Yx.A00
            A03 = r5
            java.lang.Class r2 = java.lang.Long.TYPE
            java.lang.Class<byte[]> r13 = byte[].class
            if (r5 == 0) goto L_0x0031
            boolean r1 = X.C87854Yx.A01
            if (r1 != 0) goto L_0x0031
            boolean r3 = X.AnonymousClass3K2.A1Y(r5, r2)     // Catch:{ all -> 0x0033 }
            goto L_0x0034
        L_0x0031:
            r3 = 0
            goto L_0x0034
        L_0x0033:
            r3 = 0
        L_0x0034:
            java.lang.Class r6 = java.lang.Integer.TYPE
            if (r5 == 0) goto L_0x0043
            boolean r1 = X.C87854Yx.A01
            if (r1 != 0) goto L_0x0043
            java.lang.Class r0 = A03     // Catch:{ all -> 0x0045 }
            boolean r2 = X.AnonymousClass3K2.A1Y(r0, r6)     // Catch:{ all -> 0x0045 }
            goto L_0x0046
        L_0x0043:
            r2 = 0
            goto L_0x0046
        L_0x0045:
            r2 = 0
        L_0x0046:
            r1 = 0
            if (r4 == 0) goto L_0x0056
            if (r5 == 0) goto L_0x006c
            boolean r0 = X.C87854Yx.A01
            if (r0 != 0) goto L_0x006c
            if (r3 == 0) goto L_0x0064
            X.3ZV r1 = new X.3ZV
            r1.<init>(r4)
        L_0x0056:
            A02 = r1
            java.lang.String r8 = "copyMemory"
            java.lang.String r7 = "getLong"
            java.lang.Class<java.lang.Object> r12 = java.lang.Object.class
            sun.misc.Unsafe r0 = A05
            r11 = 0
            if (r0 == 0) goto L_0x00ee
            goto L_0x0072
        L_0x0064:
            if (r2 == 0) goto L_0x0056
            X.3ZU r1 = new X.3ZU
            r1.<init>(r4)
            goto L_0x0056
        L_0x006c:
            X.3ZW r1 = new X.3ZW
            r1.<init>(r4)
            goto L_0x0056
        L_0x0072:
            java.lang.Class r4 = r0.getClass()     // Catch:{ all -> 0x00c9 }
            java.lang.String r2 = "objectFieldOffset"
            r10 = 1
            java.lang.Class[] r1 = new java.lang.Class[r10]     // Catch:{ all -> 0x00c9 }
            java.lang.Class<java.lang.reflect.Field> r0 = java.lang.reflect.Field.class
            r1[r11] = r0     // Catch:{ all -> 0x00c9 }
            r4.getMethod(r2, r1)     // Catch:{ all -> 0x00c9 }
            r9 = 2
            java.lang.Class[] r0 = new java.lang.Class[r9]     // Catch:{ all -> 0x00c9 }
            r0[r11] = r12     // Catch:{ all -> 0x00c9 }
            java.lang.Class r3 = java.lang.Long.TYPE     // Catch:{ all -> 0x00c9 }
            r0[r10] = r3     // Catch:{ all -> 0x00c9 }
            r4.getMethod(r7, r0)     // Catch:{ all -> 0x00c9 }
            java.lang.reflect.Field r0 = A02()     // Catch:{ all -> 0x00c9 }
            if (r0 == 0) goto L_0x00ee
            if (r5 == 0) goto L_0x009b
            boolean r0 = X.C87854Yx.A01     // Catch:{ all -> 0x00c9 }
            if (r0 != 0) goto L_0x009b
            goto L_0x00f0
        L_0x009b:
            java.lang.Class[] r0 = X.AnonymousClass3K2.A1b(r4, r3)     // Catch:{ all -> 0x00c9 }
            r4.getMethod(r7, r0)     // Catch:{ all -> 0x00c9 }
            java.lang.String r1 = "putLong"
            java.lang.Class[] r0 = new java.lang.Class[r9]     // Catch:{ all -> 0x00c9 }
            r0[r11] = r3     // Catch:{ all -> 0x00c9 }
            r0[r10] = r3     // Catch:{ all -> 0x00c9 }
            r4.getMethod(r1, r0)     // Catch:{ all -> 0x00c9 }
            r2 = 3
            java.lang.Class[] r0 = new java.lang.Class[r2]     // Catch:{ all -> 0x00c9 }
            r0[r11] = r3     // Catch:{ all -> 0x00c9 }
            r0[r10] = r3     // Catch:{ all -> 0x00c9 }
            r0[r9] = r3     // Catch:{ all -> 0x00c9 }
            r4.getMethod(r8, r0)     // Catch:{ all -> 0x00c9 }
            r0 = 5
            java.lang.Class[] r1 = X.AnonymousClass3K3.A1Z(r3, r0)     // Catch:{ all -> 0x00c9 }
            r1[r9] = r12     // Catch:{ all -> 0x00c9 }
            r1[r2] = r3     // Catch:{ all -> 0x00c9 }
            r0 = 4
            r1[r0] = r3     // Catch:{ all -> 0x00c9 }
            r4.getMethod(r8, r1)     // Catch:{ all -> 0x00c9 }
            goto L_0x00f0
        L_0x00c9:
            r0 = move-exception
            java.util.logging.Logger r4 = A04
            java.util.logging.Level r3 = java.util.logging.Level.WARNING
            java.lang.String r2 = java.lang.String.valueOf(r0)
            int r0 = r2.length()
            int r0 = r0 + 71
            java.lang.StringBuilder r1 = X.C13690nt.A0g(r0)
            java.lang.String r0 = "platform method missing - proto runtime falling back to safer methods: "
            r1.append(r0)
            java.lang.String r2 = X.AnonymousClass000.A0h(r2, r1)
            java.lang.String r1 = "com.google.protobuf.UnsafeUtil"
            java.lang.String r0 = "supportsUnsafeByteBufferOperations"
            r4.logp(r3, r1, r0, r2)
            r0 = 0
            goto L_0x00f1
        L_0x00ee:
            r0 = 0
            goto L_0x00f1
        L_0x00f0:
            r0 = 1
        L_0x00f1:
            A07 = r0
            sun.misc.Unsafe r0 = A05
            if (r0 != 0) goto L_0x013e
            r0 = 0
        L_0x00f8:
            A06 = r0
            int r0 = A00(r13)
            long r0 = (long) r0
            A00 = r0
            A00(r14)
            A04(r14)
            A00(r15)
            A04(r15)
            A00(r16)
            A04(r16)
            A00(r17)
            A04(r17)
            A00(r18)
            A04(r18)
            A00(r19)
            A04(r19)
            java.lang.reflect.Field r1 = A02()
            if (r1 == 0) goto L_0x013b
            X.4XX r0 = A02
            if (r0 == 0) goto L_0x013b
            long r0 = r0.A06(r1)
        L_0x0133:
            A01 = r0
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            java.lang.String r0 = "value"
            goto L_0x022a
        L_0x013b:
            r0 = -1
            goto L_0x0133
        L_0x013e:
            java.lang.Class r4 = r0.getClass()     // Catch:{ all -> 0x0204 }
            java.lang.String r2 = "objectFieldOffset"
            r8 = 1
            java.lang.Class[] r1 = new java.lang.Class[r8]     // Catch:{ all -> 0x0204 }
            java.lang.Class<java.lang.reflect.Field> r0 = java.lang.reflect.Field.class
            r1[r11] = r0     // Catch:{ all -> 0x0204 }
            r4.getMethod(r2, r1)     // Catch:{ all -> 0x0204 }
            java.lang.String r1 = "arrayBaseOffset"
            java.lang.Class[] r0 = new java.lang.Class[r8]     // Catch:{ all -> 0x0204 }
            java.lang.Class<java.lang.Class> r2 = java.lang.Class.class
            r0[r11] = r2     // Catch:{ all -> 0x0204 }
            r4.getMethod(r1, r0)     // Catch:{ all -> 0x0204 }
            java.lang.String r1 = "arrayIndexScale"
            java.lang.Class[] r0 = new java.lang.Class[r8]     // Catch:{ all -> 0x0204 }
            r0[r11] = r2     // Catch:{ all -> 0x0204 }
            r4.getMethod(r1, r0)     // Catch:{ all -> 0x0204 }
            java.lang.String r1 = "getInt"
            r3 = 2
            java.lang.Class[] r0 = new java.lang.Class[r3]     // Catch:{ all -> 0x0204 }
            r0[r11] = r12     // Catch:{ all -> 0x0204 }
            java.lang.Class r9 = java.lang.Long.TYPE     // Catch:{ all -> 0x0204 }
            r0[r8] = r9     // Catch:{ all -> 0x0204 }
            r4.getMethod(r1, r0)     // Catch:{ all -> 0x0204 }
            java.lang.String r1 = "putInt"
            r8 = 3
            java.lang.Class[] r0 = X.AnonymousClass3K3.A1Z(r9, r8)     // Catch:{ all -> 0x0204 }
            r0[r3] = r6     // Catch:{ all -> 0x0204 }
            r4.getMethod(r1, r0)     // Catch:{ all -> 0x0204 }
            java.lang.Class[] r0 = X.AnonymousClass3K3.A1Z(r9, r3)     // Catch:{ all -> 0x0204 }
            r4.getMethod(r7, r0)     // Catch:{ all -> 0x0204 }
            java.lang.String r1 = "putLong"
            java.lang.Class[] r0 = X.AnonymousClass3K3.A1Z(r9, r8)     // Catch:{ all -> 0x0204 }
            r0[r3] = r9     // Catch:{ all -> 0x0204 }
            r4.getMethod(r1, r0)     // Catch:{ all -> 0x0204 }
            java.lang.String r1 = "getObject"
            java.lang.Class[] r0 = X.AnonymousClass3K3.A1Z(r9, r3)     // Catch:{ all -> 0x0204 }
            r4.getMethod(r1, r0)     // Catch:{ all -> 0x0204 }
            java.lang.String r1 = "putObject"
            java.lang.Class[] r0 = X.AnonymousClass3K3.A1Z(r9, r8)     // Catch:{ all -> 0x0204 }
            r0[r3] = r12     // Catch:{ all -> 0x0204 }
            r4.getMethod(r1, r0)     // Catch:{ all -> 0x0204 }
            if (r5 == 0) goto L_0x01a9
            boolean r0 = X.C87854Yx.A01     // Catch:{ all -> 0x0204 }
            if (r0 != 0) goto L_0x01a9
            goto L_0x0201
        L_0x01a9:
            java.lang.String r1 = "getByte"
            java.lang.Class[] r0 = X.AnonymousClass3K3.A1Z(r9, r3)     // Catch:{ all -> 0x0204 }
            r4.getMethod(r1, r0)     // Catch:{ all -> 0x0204 }
            java.lang.String r2 = "putByte"
            java.lang.Class[] r1 = X.AnonymousClass3K3.A1Z(r9, r8)     // Catch:{ all -> 0x0204 }
            java.lang.Class r0 = java.lang.Byte.TYPE     // Catch:{ all -> 0x0204 }
            r1[r3] = r0     // Catch:{ all -> 0x0204 }
            r4.getMethod(r2, r1)     // Catch:{ all -> 0x0204 }
            java.lang.String r1 = "getBoolean"
            java.lang.Class[] r0 = X.AnonymousClass3K3.A1Z(r9, r3)     // Catch:{ all -> 0x0204 }
            r4.getMethod(r1, r0)     // Catch:{ all -> 0x0204 }
            java.lang.String r2 = "putBoolean"
            java.lang.Class[] r1 = X.AnonymousClass3K3.A1Z(r9, r8)     // Catch:{ all -> 0x0204 }
            java.lang.Class r0 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x0204 }
            r1[r3] = r0     // Catch:{ all -> 0x0204 }
            r4.getMethod(r2, r1)     // Catch:{ all -> 0x0204 }
            java.lang.String r1 = "getFloat"
            java.lang.Class[] r0 = X.AnonymousClass3K3.A1Z(r9, r3)     // Catch:{ all -> 0x0204 }
            r4.getMethod(r1, r0)     // Catch:{ all -> 0x0204 }
            java.lang.String r2 = "putFloat"
            java.lang.Class[] r1 = X.AnonymousClass3K3.A1Z(r9, r8)     // Catch:{ all -> 0x0204 }
            java.lang.Class r0 = java.lang.Float.TYPE     // Catch:{ all -> 0x0204 }
            r1[r3] = r0     // Catch:{ all -> 0x0204 }
            r4.getMethod(r2, r1)     // Catch:{ all -> 0x0204 }
            java.lang.String r1 = "getDouble"
            java.lang.Class[] r0 = X.AnonymousClass3K3.A1Z(r9, r3)     // Catch:{ all -> 0x0204 }
            r4.getMethod(r1, r0)     // Catch:{ all -> 0x0204 }
            java.lang.String r2 = "putDouble"
            java.lang.Class[] r1 = X.AnonymousClass3K3.A1Z(r9, r8)     // Catch:{ all -> 0x0204 }
            java.lang.Class r0 = java.lang.Double.TYPE     // Catch:{ all -> 0x0204 }
            r1[r3] = r0     // Catch:{ all -> 0x0204 }
            r4.getMethod(r2, r1)     // Catch:{ all -> 0x0204 }
        L_0x0201:
            r0 = 1
            goto L_0x00f8
        L_0x0204:
            r0 = move-exception
            java.util.logging.Logger r4 = A04
            java.util.logging.Level r3 = java.util.logging.Level.WARNING
            java.lang.String r2 = java.lang.String.valueOf(r0)
            int r0 = r2.length()
            int r0 = r0 + 71
            java.lang.StringBuilder r1 = X.C13690nt.A0g(r0)
            java.lang.String r0 = "platform method missing - proto runtime falling back to safer methods: "
            r1.append(r0)
            java.lang.String r2 = X.AnonymousClass000.A0h(r2, r1)
            java.lang.String r1 = "com.google.protobuf.UnsafeUtil"
            java.lang.String r0 = "supportsUnsafeArrayOperations"
            r4.logp(r3, r1, r0, r2)
            r0 = 0
            goto L_0x00f8
        L_0x022a:
            java.lang.reflect.Field r2 = r1.getDeclaredField(r0)     // Catch:{ all -> 0x0241 }
            r0 = 1
            r2.setAccessible(r0)     // Catch:{ all -> 0x0241 }
            java.lang.Class r1 = r2.getType()
            java.lang.Class<char[]> r0 = char[].class
            if (r1 != r0) goto L_0x0241
            X.4XX r0 = A02
            if (r0 == 0) goto L_0x0241
            r0.A06(r2)
        L_0x0241:
            java.nio.ByteOrder r1 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
            boolean r0 = X.AnonymousClass000.A1Y(r1, r0)
            A08 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90904f2.<clinit>():void");
    }

    public static int A00(Class cls) {
        if (A06) {
            return A02.A00.arrayBaseOffset(cls);
        }
        return -1;
    }

    public static Object A01(Object obj, long j2) {
        return A02.A00.getObject(obj, j2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0007, code lost:
        if (X.C87854Yx.A01 != false) goto L_0x0009;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.reflect.Field A02() {
        /*
            java.lang.Class r0 = X.C87854Yx.A00
            if (r0 == 0) goto L_0x0009
            boolean r1 = X.C87854Yx.A01
            r0 = 1
            if (r1 == 0) goto L_0x000a
        L_0x0009:
            r0 = 0
        L_0x000a:
            if (r0 == 0) goto L_0x001d
            java.lang.Class<java.nio.Buffer> r1 = java.nio.Buffer.class
            java.lang.String r0 = "effectiveDirectAddress"
            java.lang.reflect.Field r2 = r1.getDeclaredField(r0)     // Catch:{ all -> 0x0019 }
            r0 = 1
            r2.setAccessible(r0)     // Catch:{ all -> 0x0019 }
            goto L_0x001a
        L_0x0019:
            r2 = 0
        L_0x001a:
            if (r2 == 0) goto L_0x001d
            return r2
        L_0x001d:
            java.lang.Class<java.nio.Buffer> r1 = java.nio.Buffer.class
            java.lang.String r0 = "address"
            java.lang.reflect.Field r2 = r1.getDeclaredField(r0)     // Catch:{ all -> 0x002a }
            r0 = 1
            r2.setAccessible(r0)     // Catch:{ all -> 0x002a }
            goto L_0x002b
        L_0x002a:
            r2 = 0
        L_0x002b:
            if (r2 == 0) goto L_0x0036
            java.lang.Class r1 = r2.getType()
            java.lang.Class r0 = java.lang.Long.TYPE
            if (r1 != r0) goto L_0x0036
            return r2
        L_0x0036:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90904f2.A02():java.lang.reflect.Field");
    }

    public static Unsafe A03() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C1046356g());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void A04(Class cls) {
        if (A06) {
            A02.A00.arrayIndexScale(cls);
        }
    }

    public static void A05(Object obj, long j2, byte b2) {
        long j3 = -4 & j2;
        AnonymousClass4XX r4 = A02;
        r4.A0B(obj, j3, AnonymousClass3K3.A0D(((int) j2) ^ -1, r4.A04(obj, j3), b2));
    }

    public static void A06(Object obj, long j2, byte b2) {
        long j3 = -4 & j2;
        AnonymousClass4XX r4 = A02;
        r4.A0B(obj, j3, AnonymousClass3K3.A0D((int) j2, r4.A04(obj, j3), b2));
    }

    public static void A07(Object obj, long j2, Object obj2) {
        A02.A00.putObject(obj, j2, obj2);
    }

    public static void A08(byte[] bArr, byte b2, long j2) {
        A02.A08(bArr, A00 + j2, b2);
    }
}
