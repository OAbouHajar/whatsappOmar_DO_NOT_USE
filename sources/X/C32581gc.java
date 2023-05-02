package X;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: X.1gc  reason: invalid class name and case insensitive filesystem */
public final class C32581gc {
    public static final C32581gc A02 = new C32581gc();
    public final C107905Lw A00;
    public final ConcurrentMap A01 = new ConcurrentHashMap();

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0026, code lost:
        if (r0 == null) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C32581gc() {
        /*
            r3 = this;
            r3.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r3.A01 = r0
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]
            java.lang.String r0 = "com.google.protobuf.AndroidProto3SchemaFactory"
            r2 = 0
            r1[r2] = r0
            r0 = r1[r2]
            java.lang.Class r1 = java.lang.Class.forName(r0)     // Catch:{ all -> 0x0028 }
            java.lang.Class[] r0 = new java.lang.Class[r2]     // Catch:{ all -> 0x0028 }
            java.lang.reflect.Constructor r1 = r1.getConstructor(r0)     // Catch:{ all -> 0x0028 }
            java.lang.Object[] r0 = new java.lang.Object[r2]     // Catch:{ all -> 0x0028 }
            java.lang.Object r0 = r1.newInstance(r0)     // Catch:{ all -> 0x0028 }
            X.5Lw r0 = (X.C107905Lw) r0     // Catch:{ all -> 0x0028 }
            if (r0 != 0) goto L_0x002d
        L_0x0028:
            X.4rT r0 = new X.4rT
            r0.<init>()
        L_0x002d:
            r3.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32581gc.<init>():void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: X.4rS} */
    /* JADX WARNING: type inference failed for: r4v7, types: [X.4rR] */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x013d, code lost:
        if (r1 == null) goto L_0x0143;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0202 A[EDGE_INSN: B:126:0x0202->B:118:0x0202 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0155  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x015b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C32591gd A00(java.lang.Class r39) {
        /*
            r38 = this;
            java.lang.String r1 = "messageType"
            r8 = r39
            if (r39 == 0) goto L_0x0235
            r0 = r38
            java.util.concurrent.ConcurrentMap r15 = r0.A01
            java.lang.Object r4 = r15.get(r8)
            X.1gd r4 = (X.C32591gd) r4
            if (r4 != 0) goto L_0x0234
            X.5Lw r1 = r0.A00
            X.4rT r1 = (X.C98334rT) r1
            java.lang.Class<X.3Z1> r2 = X.AnonymousClass3Z1.class
            boolean r0 = r2.isAssignableFrom(r8)
            if (r0 != 0) goto L_0x0030
            java.lang.Class r0 = X.C90954f8.A03
            if (r0 == 0) goto L_0x0030
            boolean r0 = r0.isAssignableFrom(r8)
            if (r0 != 0) goto L_0x0030
            java.lang.String r1 = "Message classes must extend GeneratedMessage or GeneratedMessageLite"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0030:
            X.5RG r0 = r1.A00
            X.5Lt r3 = r0.Aj4(r8)
            r7 = r3
            X.4rK r7 = (X.C98244rK) r7
            X.4b8 r6 = r7.A01
            int r4 = r6.A0I
            r1 = 2
            r0 = r4 & 2
            if (r0 != r1) goto L_0x006a
            boolean r0 = r2.isAssignableFrom(r8)
            if (r0 == 0) goto L_0x005c
            X.45G r2 = X.C90954f8.A02
            X.45F r1 = X.AnonymousClass4AV.A00
        L_0x004c:
            X.5UZ r0 = r7.A00
            X.4rR r4 = new X.4rR
            r4.<init>(r1, r0, r2)
        L_0x0053:
            java.lang.Object r0 = r15.putIfAbsent(r8, r4)
            X.1gd r0 = (X.C32591gd) r0
            if (r0 == 0) goto L_0x0234
            return r0
        L_0x005c:
            X.45G r2 = X.C90954f8.A00
            X.45F r1 = X.AnonymousClass4AV.A01
            if (r1 != 0) goto L_0x004c
            java.lang.String r1 = "Protobuf runtime is not correctly loaded."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x006a:
            boolean r2 = r2.isAssignableFrom(r8)
            r1 = 1
            r5 = r4 & 1
            r0 = 0
            if (r5 != r1) goto L_0x0075
            r0 = 1
        L_0x0075:
            if (r2 == 0) goto L_0x01ea
            X.5Lu r27 = X.AnonymousClass4AY.A01
            X.4bA r24 = X.C88834bA.A01
            X.45G r28 = X.C90954f8.A02
            if (r0 == 0) goto L_0x01e4
            X.45F r23 = X.AnonymousClass4AV.A00
            X.5O2 r25 = X.AnonymousClass4AX.A01
        L_0x0083:
            boolean r0 = r3 instanceof X.C98244rK
            if (r0 == 0) goto L_0x0223
            if (r5 == r1) goto L_0x008a
            r1 = 2
        L_0x008a:
            r0 = 2
            r4 = 1
            r37 = 0
            if (r1 != r0) goto L_0x0092
            r37 = 1
        L_0x0092:
            int r0 = r6.A0M
            if (r0 != 0) goto L_0x01da
            r0 = 0
            r14 = 0
            r16 = 0
        L_0x009a:
            int r1 = r0 << 2
            int[] r3 = new int[r1]
            int r0 = r0 << 1
            java.lang.Object[] r13 = new java.lang.Object[r0]
            int r0 = r6.A0O
            r12 = 0
            if (r0 <= 0) goto L_0x01d6
            int[] r0 = new int[r0]
            r22 = r0
        L_0x00ab:
            int r0 = r6.A0Q
            if (r0 <= 0) goto L_0x00b1
            int[] r12 = new int[r0]
        L_0x00b1:
            boolean r0 = r6.A01()
            if (r0 == 0) goto L_0x0202
            int r9 = r6.A08
            r2 = 0
            r21 = 0
            r20 = 0
        L_0x00be:
            int r0 = r6.A0L
            if (r9 >= r0) goto L_0x00d4
            int r0 = r9 - r14
            int r0 = r0 << 2
            if (r2 >= r0) goto L_0x00d4
            r1 = 0
        L_0x00c9:
            int r10 = r2 + r1
            r0 = -1
            r3[r10] = r0
            int r1 = r1 + 1
            r0 = 4
            if (r1 >= r0) goto L_0x0157
            goto L_0x00c9
        L_0x00d4:
            int r1 = r6.A0A
            X.414 r19 = X.AnonymousClass414.A09
            r0 = r19
            int r0 = r0.id
            if (r1 <= r0) goto L_0x0194
            int r0 = r6.A0B
            int r10 = r0 << 1
            java.lang.Object[] r1 = r6.A0T
            r9 = r1[r10]
            boolean r0 = r9 instanceof java.lang.reflect.Field
            if (r0 == 0) goto L_0x0188
            java.lang.reflect.Field r9 = (java.lang.reflect.Field) r9
        L_0x00ec:
            X.4XX r0 = X.C90904f2.A02
            long r9 = r0.A06(r9)
            int r11 = (int) r9
            int r9 = r6.A0B
            int r9 = r9 << 1
            int r17 = r9 + 1
            r9 = r1[r17]
            boolean r10 = r9 instanceof java.lang.reflect.Field
            if (r10 == 0) goto L_0x017c
            java.lang.reflect.Field r9 = (java.lang.reflect.Field) r9
        L_0x0101:
            long r0 = r0.A06(r9)
            int r9 = (int) r0
            r18 = 0
        L_0x0108:
            int r0 = r6.A08
            r3[r2] = r0
            int r17 = r2 + 1
            int r1 = r6.A09
            r0 = r1 & 512(0x200, float:7.175E-43)
            r10 = 0
            if (r0 == 0) goto L_0x0117
            r10 = 536870912(0x20000000, float:1.0842022E-19)
        L_0x0117:
            r0 = r1 & 256(0x100, float:3.59E-43)
            r1 = 0
            if (r0 == 0) goto L_0x011e
            r1 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x011e:
            r10 = r10 | r1
            int r0 = r6.A0A
            int r1 = r0 << 20
            r10 = r10 | r1
            r10 = r10 | r11
            r3[r17] = r10
            int r10 = r2 + 2
            int r1 = r18 << 20
            r1 = r1 | r9
            r3[r10] = r1
            java.lang.Object r1 = r6.A0G
            if (r1 == 0) goto L_0x0170
            int r9 = r2 >> 2
            int r9 = r9 << r4
            r13[r9] = r1
            java.lang.Object r1 = r6.A0E
            if (r1 != 0) goto L_0x013f
            java.lang.Object r1 = r6.A0F
            if (r1 == 0) goto L_0x0143
        L_0x013f:
            int r9 = r9 + 1
            r13[r9] = r1
        L_0x0143:
            int r1 = r19.ordinal()
            if (r0 != r1) goto L_0x015b
            int r0 = r21 + 1
            r22[r21] = r2
            r21 = r0
        L_0x014f:
            boolean r0 = r6.A01()
            if (r0 == 0) goto L_0x0202
            int r9 = r6.A08
        L_0x0157:
            int r2 = r2 + 4
            goto L_0x00be
        L_0x015b:
            r1 = 18
            if (r0 < r1) goto L_0x014f
            r1 = 49
            if (r0 > r1) goto L_0x014f
            int r9 = r20 + 1
            r1 = r3[r17]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r0
            r12[r20] = r1
            r20 = r9
            goto L_0x014f
        L_0x0170:
            java.lang.Object r1 = r6.A0E
            if (r1 != 0) goto L_0x0178
            java.lang.Object r1 = r6.A0F
            if (r1 == 0) goto L_0x0143
        L_0x0178:
            int r9 = r2 >> 2
            int r9 = r9 << r4
            goto L_0x013f
        L_0x017c:
            java.lang.Class r10 = r6.A0D
            java.lang.String r9 = (java.lang.String) r9
            java.lang.reflect.Field r9 = X.C88814b8.A00(r10, r9)
            r1[r17] = r9
            goto L_0x0101
        L_0x0188:
            java.lang.Class r0 = r6.A0D
            java.lang.String r9 = (java.lang.String) r9
            java.lang.reflect.Field r9 = X.C88814b8.A00(r0, r9)
            r1[r10] = r9
            goto L_0x00ec
        L_0x0194:
            java.lang.reflect.Field r0 = r6.A0H
            X.4XX r9 = X.C90904f2.A02
            long r0 = r9.A06(r0)
            int r11 = (int) r0
            if (r5 != r4) goto L_0x01d1
            int r1 = r6.A0A
            X.414 r0 = X.AnonymousClass414.A03
            int r0 = r0.id
            if (r1 > r0) goto L_0x01d1
            int r0 = r6.A0N
            int r17 = r0 << 1
            int r0 = r6.A0C
            int r0 = r0 >> 5
            int r17 = r17 + r0
            java.lang.Object[] r1 = r6.A0T
            r0 = r1[r17]
            boolean r10 = r0 instanceof java.lang.reflect.Field
            if (r10 == 0) goto L_0x01c6
            java.lang.reflect.Field r0 = (java.lang.reflect.Field) r0
        L_0x01bb:
            long r0 = r9.A06(r0)
            int r9 = (int) r0
            int r0 = r6.A0C
            int r18 = r0 % 32
            goto L_0x0108
        L_0x01c6:
            java.lang.Class r10 = r6.A0D
            java.lang.String r0 = (java.lang.String) r0
            java.lang.reflect.Field r0 = X.C88814b8.A00(r10, r0)
            r1[r17] = r0
            goto L_0x01bb
        L_0x01d1:
            r18 = 0
            r9 = 0
            goto L_0x0108
        L_0x01d6:
            r22 = r12
            goto L_0x00ab
        L_0x01da:
            int r14 = r6.A0J
            int r0 = r6.A0K
            r16 = r0
            int r0 = r6.A0P
            goto L_0x009a
        L_0x01e4:
            r23 = 0
            X.5O2 r25 = X.AnonymousClass4AX.A01
            goto L_0x0083
        L_0x01ea:
            X.5Lu r27 = X.AnonymousClass4AY.A00
            X.4bA r24 = X.C88834bA.A00
            if (r0 == 0) goto L_0x01fa
            X.45G r28 = X.C90954f8.A00
            X.45F r23 = X.AnonymousClass4AV.A01
            if (r23 == 0) goto L_0x022c
            X.5O2 r25 = X.AnonymousClass4AX.A00
            goto L_0x0083
        L_0x01fa:
            X.45G r28 = X.C90954f8.A01
            r23 = 0
            X.5O2 r25 = X.AnonymousClass4AX.A00
            goto L_0x0083
        L_0x0202:
            int r1 = r6.A0L
            X.5UZ r2 = r7.A00
            int[] r0 = r6.A0S
            X.4rS r4 = new X.4rS
            r26 = r2
            r29 = r3
            r30 = r0
            r31 = r22
            r32 = r12
            r33 = r13
            r34 = r14
            r35 = r16
            r36 = r1
            r22 = r4
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            goto L_0x0053
        L_0x0223:
            java.lang.String r1 = "zzcf"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x022c:
            java.lang.String r1 = "Protobuf runtime is not correctly loaded."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0234:
            return r4
        L_0x0235:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32581gc.A00(java.lang.Class):X.1gd");
    }
}
