package X;

import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.4eO  reason: invalid class name and case insensitive filesystem */
public abstract class C90574eO {
    public static ConcurrentHashMap A00 = new ConcurrentHashMap();

    public C90574eO() {
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:112:0x02b8, code lost:
        if (r5 < 0) goto L_0x0268;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0321, code lost:
        if (r5 < 0) goto L_0x023c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x03ab, code lost:
        if (r7 < 0) goto L_0x037e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x0424, code lost:
        if (r2 < 0) goto L_0x03f8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(java.lang.Class r35) {
        /*
            java.util.concurrent.ConcurrentHashMap r0 = A00
            r10 = r35
            r0.get(r10)
            r9 = r10
            java.util.HashMap r8 = X.AnonymousClass000.A0x()
        L_0x000c:
            java.lang.Class<java.lang.Object> r7 = java.lang.Object.class
            if (r9 == r7) goto L_0x0040
            java.lang.reflect.Field[] r6 = r9.getDeclaredFields()
            int r5 = r6.length
            r4 = 0
        L_0x0016:
            if (r4 >= r5) goto L_0x003b
            r3 = r6[r4]
            java.lang.String r2 = r3.getName()
            boolean r0 = r8.containsKey(r2)
            if (r0 != 0) goto L_0x0038
            X.4aI r1 = new X.4aI
            r1.<init>(r9, r3)
            java.lang.reflect.Field r0 = r1.A02
            if (r0 != 0) goto L_0x0035
            java.lang.reflect.Method r0 = r1.A03
            if (r0 != 0) goto L_0x0035
            java.lang.reflect.Method r0 = r1.A04
            if (r0 == 0) goto L_0x0038
        L_0x0035:
            r8.put(r2, r1)
        L_0x0038:
            int r4 = r4 + 1
            goto L_0x0016
        L_0x003b:
            java.lang.Class r9 = r9.getSuperclass()
            goto L_0x000c
        L_0x0040:
            java.util.Collection r1 = r8.values()
            int r0 = r8.size()
            X.4aI[] r0 = new X.C88314aI[r0]
            java.lang.Object[] r9 = r1.toArray(r0)
            X.4aI[] r9 = (X.C88314aI[]) r9
            java.lang.String r2 = r10.getName()
            java.lang.String r0 = "java.util."
            boolean r0 = r2.startsWith(r0)
            java.lang.String r1 = "AccAccess"
            if (r0 == 0) goto L_0x0076
            java.lang.String r0 = "net.minidev.asm."
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0r(r0)
            r0.append(r2)
            java.lang.String r19 = X.AnonymousClass000.A0h(r1, r0)
        L_0x006b:
            java.lang.ClassLoader r0 = r10.getClassLoader()
            X.40f r8 = new X.40f
            r8.<init>(r0)
            r6 = 0
            goto L_0x007b
        L_0x0076:
            java.lang.String r19 = r2.concat(r1)
            goto L_0x006b
        L_0x007b:
            r0 = r19
            java.lang.Class r6 = r8.loadClass(r0)     // Catch:{ ClassNotFoundException -> 0x0081 }
        L_0x0081:
            r4 = r10
            java.util.LinkedList r5 = new java.util.LinkedList
            r5.<init>()
        L_0x0087:
            boolean r0 = r4.equals(r7)
            if (r0 != 0) goto L_0x00a7
            r5.addLast(r4)
            java.lang.Class[] r3 = r4.getInterfaces()
            int r2 = r3.length
            r1 = 0
        L_0x0096:
            if (r1 >= r2) goto L_0x00a0
            r0 = r3[r1]
            r5.addLast(r0)
            int r1 = r1 + 1
            goto L_0x0096
        L_0x00a0:
            java.lang.Class r4 = r4.getSuperclass()
            if (r4 == 0) goto L_0x00a7
            goto L_0x0087
        L_0x00a7:
            r5.addLast(r7)
            if (r6 != 0) goto L_0x05ac
            X.4dV r4 = new X.4dV
            r4.<init>(r10, r8, r9)
            java.util.Iterator r11 = r5.iterator()
        L_0x00b5:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0112
            java.lang.Object r1 = r11.next()
            java.util.HashMap r0 = X.AnonymousClass4Z4.A01
            java.lang.Object r0 = r0.get(r1)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            if (r0 == 0) goto L_0x00b5
            java.util.Iterator r10 = r0.iterator()
        L_0x00cd:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x00b5
            java.lang.Object r0 = r10.next()
            java.lang.Class r0 = (java.lang.Class) r0
            if (r0 == 0) goto L_0x00cd
            java.lang.reflect.Method[] r8 = r0.getMethods()
            int r6 = r8.length
            r9 = 0
            r5 = 0
        L_0x00e2:
            if (r5 >= r6) goto L_0x00cd
            r3 = r8[r5]
            int r0 = r3.getModifiers()
            r0 = r0 & 8
            if (r0 == 0) goto L_0x010f
            java.lang.Class[] r2 = r3.getParameterTypes()
            int r1 = r2.length
            r0 = 1
            if (r1 != r0) goto L_0x010f
            r0 = r2[r9]
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x010f
            java.lang.Class r1 = r3.getReturnType()
            java.lang.Class r0 = java.lang.Void.TYPE
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x010f
            java.util.HashMap r0 = r4.A04
            r0.put(r1, r3)
        L_0x010f:
            int r5 = r5 + 1
            goto L_0x00e2
        L_0x0112:
            r3 = 1
            X.4Wj r22 = new X.4Wj
            r22.<init>()
            X.4aI[] r0 = r4.A06
            r21 = r0
            int r1 = r0.length
            r0 = 0
            r2 = 10
            boolean r20 = X.C13700nu.A0g(r1, r2)
            r14 = 14
            java.lang.String r2 = "Lnet/minidev/asm/BeansAccess<L"
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0r(r2)
            java.lang.String r15 = r4.A03
            r5.append(r15)
            java.lang.String r2 = ";>;"
            java.lang.String r8 = X.AnonymousClass000.A0h(r2, r5)
            java.lang.String r10 = r4.A01
            java.lang.String r5 = X.C90104dV.A07
            r25 = 0
            r7 = 50
            r6 = 33
            r2 = r22
            r2.A0D = r7
            r2.A00 = r6
            X.4XW r9 = r2.A0V
            r9.A03 = r7
            r9.A05 = r10
            r7 = 7
            X.4eU r2 = r9.A0A(r10, r7)
            int r6 = r2.A03
            r2 = r22
            r2.A0C = r6
            if (r8 == 0) goto L_0x0160
            int r6 = r9.A02(r8)
            r2.A09 = r6
        L_0x0160:
            if (r5 != 0) goto L_0x0427
            r6 = 0
        L_0x0163:
            r2 = r22
            r2.A0B = r6
            java.lang.String r23 = "<init>"
            java.lang.String r24 = "()V"
            r27 = 1
            r26 = r25
            X.4XT r2 = r22.A03(r23, r24, r25, r26, r27)
            r6 = 25
            r2.A06(r6, r0)
            r30 = 183(0xb7, float:2.56E-43)
            r16 = 0
            r12 = 0
            r10 = 0
            r31 = 0
            r26 = r2
            r27 = r5
            r28 = r23
            r29 = r24
            r26.A0A(r27, r28, r29, r30, r31)
            r7 = 177(0xb1, float:2.48E-43)
            r2.A03(r7)
            r2.A05(r3, r3)
            java.lang.String r27 = "set"
            java.lang.String r28 = "(Ljava/lang/Object;ILjava/lang/Object;)V"
            r18 = 1
            r30 = r25
            r31 = 1
            r26 = r22
            r29 = r25
            X.4XT r11 = r26.A03(r27, r28, r29, r30, r31)
            r5 = 21
            r17 = 2
            if (r1 == 0) goto L_0x01e7
            if (r1 <= r14) goto L_0x03c8
            r2 = r17
            r11.A06(r5, r2)
            X.4c4[] r9 = new X.C89384c4[r1]
            r5 = 0
        L_0x01b5:
            X.4c4 r2 = new X.4c4
            r2.<init>()
            r9[r5] = r2
            int r5 = r5 + 1
            if (r5 < r1) goto L_0x01b5
            X.4c4 r8 = new X.4c4
            r8.<init>()
            int r2 = r1 - r3
            r11.A0D(r8, r9, r0, r2)
            r6 = 0
        L_0x01cb:
            r5 = r21[r6]
            int r10 = r10 + 1
            r2 = r9[r12]
            r11.A0B(r2)
            java.lang.reflect.Field r2 = r5.A02
            if (r2 != 0) goto L_0x03c3
            java.lang.reflect.Method r2 = r5.A03
            if (r2 != 0) goto L_0x03c3
            r11.A03(r7)
        L_0x01df:
            int r6 = r6 + 1
            r12 = r10
            if (r6 < r1) goto L_0x01cb
            r11.A0B(r8)
        L_0x01e7:
            r4.A02(r11)
            r11.A05(r0, r0)
            java.lang.String r29 = "get"
            java.lang.String r30 = "(Ljava/lang/Object;I)Ljava/lang/Object;"
            r6 = 21
            r32 = r25
            r33 = 1
            r28 = r22
            r31 = r25
            X.4XT r2 = r28.A03(r29, r30, r31, r32, r33)
            if (r1 == 0) goto L_0x0256
            if (r1 <= r14) goto L_0x0325
            r5 = r17
            r2.A06(r6, r5)
            X.4c4[] r6 = new X.C89384c4[r1]
            r7 = 0
        L_0x020b:
            X.4c4 r5 = new X.4c4
            r5.<init>()
            r6[r7] = r5
            int r7 = r7 + 1
            if (r7 < r1) goto L_0x020b
            X.4c4 r12 = new X.4c4
            r12.<init>()
            int r5 = r1 - r3
            r2.A0D(r12, r6, r0, r5)
            r5 = 0
        L_0x0221:
            r10 = r21[r0]
            int r16 = r16 + 1
            r5 = r6[r5]
            r2.A0B(r5)
            r14 = 0
            r9 = r2
            X.5HU r9 = (X.AnonymousClass5HU) r9
            int r11 = r9.A0d
            r5 = 3
            if (r11 != r5) goto L_0x02fb
            X.AnonymousClass4XT.A01(r9)
            X.AnonymousClass4XT.A02(r9)
        L_0x0239:
            X.AnonymousClass5HU.A03(r9, r14)
        L_0x023c:
            java.lang.reflect.Field r5 = r10.A02
            if (r5 != 0) goto L_0x02bb
            java.lang.reflect.Method r5 = r10.A03
            if (r5 != 0) goto L_0x02bb
            r2.A03(r3)
        L_0x0247:
            r3 = 176(0xb0, float:2.47E-43)
            r2.A03(r3)
            int r0 = r0 + 1
            r5 = r16
            r3 = 1
            if (r0 < r1) goto L_0x0221
            r2.A0B(r12)
        L_0x0256:
            r3 = 0
            r9 = r2
            X.5HU r9 = (X.AnonymousClass5HU) r9
            int r8 = r9.A0d
            r13 = 3
            if (r8 != r13) goto L_0x0292
            X.AnonymousClass4XT.A01(r9)
            X.AnonymousClass4XT.A02(r9)
        L_0x0265:
            X.AnonymousClass5HU.A03(r9, r3)
        L_0x0268:
            r4.A02(r2)
            r0 = 0
            r2.A05(r3, r3)
            r12 = 153(0x99, float:2.14E-43)
            if (r20 != 0) goto L_0x0569
            java.lang.String r7 = "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V"
            r14 = 176(0xb0, float:2.47E-43)
            r9 = r25
            r10 = 1
            r5 = r22
            r8 = r9
            r6 = r27
            X.4XT r5 = r5.A03(r6, r7, r8, r9, r10)
            X.4c4[] r6 = new X.C89384c4[r1]
            r7 = 0
        L_0x0286:
            if (r7 >= r1) goto L_0x042f
            X.4c4 r2 = new X.4c4
            r2.<init>()
            r6[r7] = r2
            int r7 = r7 + 1
            goto L_0x0286
        L_0x0292:
            X.4XW r0 = r9.A0l
            int r5 = r0.A03
            r0 = 50
            if (r5 < r0) goto L_0x05a5
            X.4cD r7 = r9.A0Q
            if (r7 != 0) goto L_0x02af
            X.4cD r7 = X.C89454cD.A00()
            r9.A0Q = r7
            X.4cD r6 = r9.A0k
            int r5 = r6.A00
        L_0x02a8:
            X.C89454cD.A01(r7, r5)
            X.AnonymousClass4XT.A00(r6, r9, r8)
            goto L_0x0265
        L_0x02af:
            X.4cD r6 = r9.A0k
            int r5 = r6.A00
            int r0 = r9.A0A
            int r5 = r5 - r0
            int r5 = r5 - r18
            if (r5 >= 0) goto L_0x02a8
            goto L_0x0268
        L_0x02bb:
            r5 = 25
            r2.A06(r5, r3)
            r3 = 192(0xc0, float:2.69E-43)
            r2.A07(r3, r15)
            java.lang.Class r3 = r10.A00
            X.4ew r3 = X.C90854ew.A02(r3)
            java.lang.reflect.Method r5 = r10.A04
            if (r5 != 0) goto L_0x02e3
            java.lang.reflect.Method r5 = r10.A03
            if (r5 != 0) goto L_0x02e3
        L_0x02d3:
            java.lang.String r8 = r10.A01
            java.lang.String r7 = r3.A06()
            r5 = 180(0xb4, float:2.52E-43)
            r2.A09(r15, r8, r7, r5)
        L_0x02de:
            A01(r2, r3)
            goto L_0x0247
        L_0x02e3:
            java.lang.reflect.Method r5 = r10.A03
            if (r5 == 0) goto L_0x02d3
            java.lang.String r33 = X.C90854ew.A01(r5)
            r34 = 182(0xb6, float:2.55E-43)
            java.lang.String r32 = r5.getName()
            r35 = 0
            r30 = r2
            r31 = r15
            r30.A0A(r31, r32, r33, r34, r35)
            goto L_0x02de
        L_0x02fb:
            X.4XW r5 = r9.A0l
            int r7 = r5.A03
            r5 = 50
            if (r7 < r5) goto L_0x05a5
            X.4cD r8 = r9.A0Q
            if (r8 != 0) goto L_0x0319
            X.4cD r8 = X.C89454cD.A00()
            r9.A0Q = r8
            X.4cD r7 = r9.A0k
            int r5 = r7.A00
        L_0x0311:
            X.C89454cD.A01(r8, r5)
            X.AnonymousClass4XT.A00(r7, r9, r11)
            goto L_0x0239
        L_0x0319:
            X.4cD r7 = r9.A0k
            int r5 = r7.A00
            int r13 = r9.A0A
            int r5 = r5 - r13
            int r5 = r5 - r3
            if (r5 >= 0) goto L_0x0311
            goto L_0x023c
        L_0x0325:
            X.4c4[] r6 = new X.C89384c4[r1]
            r5 = 0
        L_0x0328:
            X.4c4 r3 = new X.4c4
            r3.<init>()
            r6[r5] = r3
            int r5 = r5 + 1
            if (r5 < r1) goto L_0x0328
            r5 = 0
        L_0x0334:
            r8 = r21[r0]
            r3 = r6[r5]
            X.C90104dV.A00(r3, r2, r5)
            r7 = 25
            r3 = 1
            r2.A06(r7, r3)
            r3 = 192(0xc0, float:2.69E-43)
            r2.A07(r3, r15)
            java.lang.Class r3 = r8.A00
            X.4ew r3 = X.C90854ew.A02(r3)
            java.lang.reflect.Method r7 = r8.A04
            if (r7 != 0) goto L_0x03ae
            java.lang.reflect.Method r7 = r8.A03
            if (r7 != 0) goto L_0x03ae
        L_0x0354:
            java.lang.String r9 = r8.A01
            java.lang.String r8 = r3.A06()
            r7 = 180(0xb4, float:2.52E-43)
            r2.A09(r15, r9, r8, r7)
        L_0x035f:
            A01(r2, r3)
            r3 = 176(0xb0, float:2.47E-43)
            r2.A03(r3)
            r3 = r6[r5]
            r2.A0B(r3)
            r3 = 0
            r10 = r2
            X.5HU r10 = (X.AnonymousClass5HU) r10
            int r11 = r10.A0d
            r13 = 3
            if (r11 != r13) goto L_0x0385
            X.AnonymousClass4XT.A01(r10)
            X.AnonymousClass4XT.A02(r10)
        L_0x037b:
            X.AnonymousClass5HU.A03(r10, r3)
        L_0x037e:
            int r5 = r5 + 1
            int r0 = r0 + 1
            if (r0 >= r1) goto L_0x0268
            goto L_0x0334
        L_0x0385:
            X.4XW r7 = r10.A0l
            int r8 = r7.A03
            r7 = 50
            if (r8 < r7) goto L_0x05a5
            X.4cD r9 = r10.A0Q
            if (r9 != 0) goto L_0x03a2
            X.4cD r9 = X.C89454cD.A00()
            r10.A0Q = r9
            X.4cD r8 = r10.A0k
            int r7 = r8.A00
        L_0x039b:
            X.C89454cD.A01(r9, r7)
            X.AnonymousClass4XT.A00(r8, r10, r11)
            goto L_0x037b
        L_0x03a2:
            X.4cD r8 = r10.A0k
            int r7 = r8.A00
            int r12 = r10.A0A
            int r7 = r7 - r12
            int r7 = r7 - r18
            if (r7 >= 0) goto L_0x039b
            goto L_0x037e
        L_0x03ae:
            java.lang.reflect.Method r7 = r8.A03
            if (r7 == 0) goto L_0x0354
            java.lang.String r10 = X.C90854ew.A01(r7)
            r11 = 182(0xb6, float:2.55E-43)
            java.lang.String r9 = r7.getName()
            r12 = 0
            r7 = r2
            r8 = r15
            r7.A0A(r8, r9, r10, r11, r12)
            goto L_0x035f
        L_0x03c3:
            r4.A01(r5, r11)
            goto L_0x01df
        L_0x03c8:
            X.4c4[] r10 = new X.C89384c4[r1]
            r5 = 0
        L_0x03cb:
            X.4c4 r2 = new X.4c4
            r2.<init>()
            r10[r5] = r2
            int r5 = r5 + 1
            if (r5 < r1) goto L_0x03cb
            r9 = 0
            r8 = 0
        L_0x03d8:
            r5 = r21[r9]
            r2 = r10[r8]
            X.C90104dV.A00(r2, r11, r8)
            r4.A01(r5, r11)
            r2 = r10[r8]
            r11.A0B(r2)
            r7 = r11
            X.5HU r7 = (X.AnonymousClass5HU) r7
            int r12 = r7.A0d
            r2 = 3
            if (r12 != r2) goto L_0x03ff
            X.AnonymousClass4XT.A01(r7)
            X.AnonymousClass4XT.A02(r7)
        L_0x03f5:
            X.AnonymousClass5HU.A03(r7, r0)
        L_0x03f8:
            int r8 = r8 + 1
            int r9 = r9 + 1
            if (r9 >= r1) goto L_0x01e7
            goto L_0x03d8
        L_0x03ff:
            X.4XW r2 = r7.A0l
            int r5 = r2.A03
            r2 = 50
            if (r5 < r2) goto L_0x05a5
            X.4cD r6 = r7.A0Q
            if (r6 != 0) goto L_0x041c
            X.4cD r6 = X.C89454cD.A00()
            r7.A0Q = r6
            X.4cD r5 = r7.A0k
            int r2 = r5.A00
        L_0x0415:
            X.C89454cD.A01(r6, r2)
            X.AnonymousClass4XT.A00(r5, r7, r12)
            goto L_0x03f5
        L_0x041c:
            X.4cD r5 = r7.A0k
            int r2 = r5.A00
            int r13 = r7.A0A
            int r2 = r2 - r13
            int r2 = r2 - r3
            if (r2 >= 0) goto L_0x0415
            goto L_0x03f8
        L_0x0427:
            X.4eU r2 = r9.A0A(r5, r7)
            int r6 = r2.A03
            goto L_0x0163
        L_0x042f:
            r16 = 0
        L_0x0431:
            if (r0 >= r1) goto L_0x049b
            r2 = r21[r0]
            r8 = 25
            r7 = r17
            r5.A06(r8, r7)
            java.lang.String r7 = r2.A01
            r5.A08(r7)
            r34 = 182(0xb6, float:2.55E-43)
            java.lang.String r31 = "java/lang/String"
            java.lang.String r32 = "equals"
            java.lang.String r33 = "(Ljava/lang/Object;)Z"
            r35 = 0
            r30 = r5
            r30.A0A(r31, r32, r33, r34, r35)
            r7 = r6[r16]
            r5.A0C(r7, r12)
            r4.A01(r2, r5)
            r2 = r6[r16]
            r5.A0B(r2)
            r11 = r5
            X.5HU r11 = (X.AnonymousClass5HU) r11
            int r10 = r11.A0d
            if (r10 != r13) goto L_0x0472
            X.AnonymousClass4XT.A01(r11)
            X.AnonymousClass4XT.A02(r11)
        L_0x046a:
            X.AnonymousClass5HU.A03(r11, r3)
        L_0x046d:
            int r16 = r16 + 1
            int r0 = r0 + 1
            goto L_0x0431
        L_0x0472:
            X.4XW r2 = r11.A0l
            int r7 = r2.A03
            r2 = 50
            if (r7 < r2) goto L_0x05a5
            X.4cD r9 = r11.A0Q
            if (r9 != 0) goto L_0x048f
            X.4cD r9 = X.C89454cD.A00()
            r11.A0Q = r9
            X.4cD r8 = r11.A0k
            int r7 = r8.A00
        L_0x0488:
            X.C89454cD.A01(r9, r7)
            X.AnonymousClass4XT.A00(r8, r11, r10)
            goto L_0x046a
        L_0x048f:
            X.4cD r8 = r11.A0k
            int r7 = r8.A00
            int r2 = r11.A0A
            int r7 = r7 - r2
            int r7 = r7 - r18
            if (r7 >= 0) goto L_0x0488
            goto L_0x046d
        L_0x049b:
            r4.A03(r5)
            r2 = 0
            r5.A05(r3, r3)
            java.lang.String r7 = "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;"
            r9 = r25
            r10 = 1
            r5 = r22
            r6 = r29
            r8 = r9
            X.4XT r0 = r5.A03(r6, r7, r8, r9, r10)
            X.4c4[] r5 = new X.C89384c4[r1]
            r7 = 0
        L_0x04b3:
            if (r7 >= r1) goto L_0x04bf
            X.4c4 r6 = new X.4c4
            r6.<init>()
            r5[r7] = r6
            int r7 = r7 + 1
            goto L_0x04b3
        L_0x04bf:
            r16 = 0
        L_0x04c1:
            if (r2 >= r1) goto L_0x0562
            r7 = r21[r2]
            r8 = 25
            r6 = r17
            r0.A06(r8, r6)
            java.lang.String r6 = r7.A01
            r0.A08(r6)
            r30 = 182(0xb6, float:2.55E-43)
            java.lang.String r27 = "java/lang/String"
            java.lang.String r28 = "equals"
            java.lang.String r29 = "(Ljava/lang/Object;)Z"
            r31 = 0
            r26 = r0
            r26.A0A(r27, r28, r29, r30, r31)
            r8 = r5[r16]
            r0.A0C(r8, r12)
            r9 = 25
            r8 = 1
            r0.A06(r9, r8)
            r8 = 192(0xc0, float:2.69E-43)
            r0.A07(r8, r15)
            java.lang.Class r8 = r7.A00
            X.4ew r8 = X.C90854ew.A02(r8)
            java.lang.reflect.Method r9 = r7.A04
            if (r9 != 0) goto L_0x0550
            java.lang.reflect.Method r9 = r7.A03
            if (r9 != 0) goto L_0x0550
        L_0x04fe:
            java.lang.String r9 = r8.A06()
            r7 = 180(0xb4, float:2.52E-43)
            r0.A09(r15, r6, r9, r7)
        L_0x0507:
            A01(r0, r8)
            r0.A03(r14)
            r6 = r5[r16]
            r0.A0B(r6)
            r11 = r0
            X.5HU r11 = (X.AnonymousClass5HU) r11
            int r10 = r11.A0d
            if (r10 != r13) goto L_0x0527
            X.AnonymousClass4XT.A01(r11)
            X.AnonymousClass4XT.A02(r11)
        L_0x051f:
            X.AnonymousClass5HU.A03(r11, r3)
        L_0x0522:
            int r16 = r16 + 1
            int r2 = r2 + 1
            goto L_0x04c1
        L_0x0527:
            X.4XW r6 = r11.A0l
            int r7 = r6.A03
            r6 = 50
            if (r7 < r6) goto L_0x05a5
            X.4cD r9 = r11.A0Q
            if (r9 != 0) goto L_0x0544
            X.4cD r9 = X.C89454cD.A00()
            r11.A0Q = r9
            X.4cD r8 = r11.A0k
            int r7 = r8.A00
        L_0x053d:
            X.C89454cD.A01(r9, r7)
            X.AnonymousClass4XT.A00(r8, r11, r10)
            goto L_0x051f
        L_0x0544:
            X.4cD r8 = r11.A0k
            int r7 = r8.A00
            int r6 = r11.A0A
            int r7 = r7 - r6
            int r7 = r7 - r18
            if (r7 >= 0) goto L_0x053d
            goto L_0x0522
        L_0x0550:
            java.lang.reflect.Method r7 = r7.A03
            if (r7 == 0) goto L_0x04fe
            java.lang.String r29 = X.C90854ew.A01(r7)
            java.lang.String r28 = r7.getName()
            r27 = r15
            r26.A0A(r27, r28, r29, r30, r31)
            goto L_0x0507
        L_0x0562:
            r4.A03(r0)
            r0.A05(r3, r3)
            goto L_0x056b
        L_0x0569:
            r14 = 176(0xb0, float:2.47E-43)
        L_0x056b:
            java.lang.String r6 = "newInstance"
            java.lang.String r7 = "()Ljava/lang/Object;"
            r9 = r25
            r10 = 1
            r5 = r22
            r8 = r9
            X.4XT r2 = r5.A03(r6, r7, r8, r9, r10)
            r0 = 187(0xbb, float:2.62E-43)
            r2.A07(r0, r15)
            r0 = 89
            r2.A03(r0)
            r9 = 183(0xb7, float:2.56E-43)
            r10 = 0
            r5 = r2
            r6 = r15
            r7 = r23
            r8 = r24
            r5.A0A(r6, r7, r8, r9, r10)
            r2.A03(r14)
            r1 = 1
            r0 = r17
            r2.A05(r0, r1)
            byte[] r2 = r22.A04()
            X.40f r1 = r4.A05
            java.lang.String r0 = r4.A00
            java.lang.Class r6 = r1.A00(r0, r2)
            goto L_0x05ac
        L_0x05a5:
            java.lang.String r0 = "Class versions V1_5 or less must use F_NEW frames."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0T(r0)
            throw r0
        L_0x05ac:
            r6.newInstance()     // Catch:{ Exception -> 0x05b6 }
            java.lang.String r0 = "setAccessor"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0W(r0)     // Catch:{ Exception -> 0x05b6 }
            throw r0     // Catch:{ Exception -> 0x05b6 }
        L_0x05b6:
            r2 = move-exception
            java.lang.String r0 = "Error constructing accessor class: "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            r0 = r19
            java.lang.String r1 = X.AnonymousClass000.A0h(r0, r1)
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90574eO.A00(java.lang.Class):void");
    }

    public static void A01(AnonymousClass4XT r6, C90854ew r7) {
        boolean z2;
        int i2;
        String str;
        String str2;
        String str3;
        int i3 = r7.A00;
        if (i3 != 12) {
            switch (i3) {
                case 1:
                    i2 = 184;
                    z2 = false;
                    str3 = "java/lang/Boolean";
                    str2 = "valueOf";
                    str = "(Z)Ljava/lang/Boolean;";
                    break;
                case 2:
                    i2 = 184;
                    z2 = false;
                    str3 = "java/lang/Character";
                    str2 = "valueOf";
                    str = "(C)Ljava/lang/Character;";
                    break;
                case 3:
                    i2 = 184;
                    z2 = false;
                    str3 = "java/lang/Byte";
                    str2 = "valueOf";
                    str = "(B)Ljava/lang/Byte;";
                    break;
                case 4:
                    i2 = 184;
                    z2 = false;
                    str3 = "java/lang/Short";
                    str2 = "valueOf";
                    str = "(S)Ljava/lang/Short;";
                    break;
                case 5:
                    i2 = 184;
                    z2 = false;
                    str3 = "java/lang/Integer";
                    str2 = "valueOf";
                    str = "(I)Ljava/lang/Integer;";
                    break;
                case 6:
                    i2 = 184;
                    z2 = false;
                    str3 = "java/lang/Float";
                    str2 = "valueOf";
                    str = "(F)Ljava/lang/Float;";
                    break;
                case 7:
                    i2 = 184;
                    z2 = false;
                    str3 = "java/lang/Long";
                    str2 = "valueOf";
                    str = "(J)Ljava/lang/Long;";
                    break;
                case 8:
                    i2 = 184;
                    z2 = false;
                    str3 = "java/lang/Double";
                    str2 = "valueOf";
                    str = "(D)Ljava/lang/Double;";
                    break;
                default:
                    return;
            }
            r6.A0A(str3, str2, str, i2, z2);
        }
    }
}
