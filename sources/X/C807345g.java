package X;

/* renamed from: X.45g  reason: invalid class name and case insensitive filesystem */
public class C807345g {
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x02d1, code lost:
        if (r0 != null) goto L_0x02d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x031a, code lost:
        throw X.AnonymousClass000.A0V("getBytecodeFile() was called while bytecodeFile is null. This normally happens when getBytecodeFile() is called before calling \"ensurePrepared()\" method");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0230, code lost:
        if (r0 != null) goto L_0x0232;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object A00(X.C14950q3 r18, X.C14930q1 r19, X.C14970q5 r20) {
        /*
            r5 = r19
            boolean r0 = r5 instanceof X.C31421e9
            if (r0 == 0) goto L_0x0322
            r8 = r5
            X.1e9 r8 = (X.C31421e9) r8
            r1 = r20
            X.4K0 r6 = r1.A01
            X.4ts r2 = r1.A03
            if (r8 == 0) goto L_0x031b
            X.4Gs r3 = r8.A00
            if (r3 != 0) goto L_0x022a
            X.4Gr r10 = r8.A02
            if (r10 == 0) goto L_0x0207
            X.4dR r12 = r10.A00
            if (r12 != 0) goto L_0x021c
            java.lang.String r4 = r10.A01
            if (r4 == 0) goto L_0x0200
            java.lang.String r0 = "sraxr"
            boolean r12 = r4.startsWith(r0)
            if (r12 != 0) goto L_0x0076
            java.lang.String r0 = " "
            boolean r0 = r4.startsWith(r0)
            if (r0 != 0) goto L_0x0076
            java.lang.String r0 = "lispx"
            boolean r0 = r4.startsWith(r0)
            r9 = 200(0xc8, float:2.8E-43)
            r7 = 0
            if (r0 == 0) goto L_0x0116
            r3 = 5
            r0 = 15
            java.lang.String r11 = r4.substring(r3, r0)
            java.lang.String r6 = r6.A02
            boolean r0 = r11.equals(r6)
            if (r0 != 0) goto L_0x0076
            java.lang.String r0 = "MinScript compiler detected version id mismatch (client "
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0r(r0)
            r3.append(r6)
            java.lang.String r0 = ", got "
            r3.append(r0)
            r3.append(r11)
            java.lang.String r0 = "): "
            r3.append(r0)
        L_0x0061:
            int r0 = r4.length()
            int r0 = java.lang.Math.min(r0, r9)
            java.lang.String r0 = r4.substring(r7, r0)
            java.lang.String r3 = X.AnonymousClass000.A0h(r0, r3)
            java.lang.String r0 = "MinScript"
            X.C29691b2.A00(r0, r3)
        L_0x0076:
            if (r12 == 0) goto L_0x00fc
            r0 = 0
            byte[] r0 = android.util.Base64.decode(r4, r0)
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.wrap(r0)
        L_0x0081:
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            r4.order(r0)
            java.nio.ByteBuffer r16 = r4.slice()
            java.nio.ByteOrder r3 = r4.order()
            r0 = r16
            r0.order(r3)
            int r6 = r4.capacity()
            int r3 = r16.getInt()
            short r9 = r16.getShort()
            r7 = 65535(0xffff, float:9.1834E-41)
            r9 = r9 & r7
            short r0 = r16.getShort()
            r7 = r7 & r0
            r0 = -1397639502(0xffffffffacb1b6b2, float:-5.050926E-12)
            if (r3 != r0) goto L_0x01f1
            r3 = 1
            if (r9 != r3) goto L_0x01f1
            if (r7 != 0) goto L_0x01f1
            int r13 = r16.getInt()
            int r12 = r16.getInt()
            int r15 = r4.position()
            if (r13 > r6) goto L_0x01c1
            if (r13 < r15) goto L_0x01b9
            int r0 = r12 << 4
            int r15 = r15 + r0
            if (r15 > r13) goto L_0x01b1
            X.4K1[] r11 = new X.AnonymousClass4K1[r12]
            r6 = 0
            r9 = 0
        L_0x00cd:
            if (r9 >= r12) goto L_0x014a
            X.4K1 r7 = new X.4K1
            r7.<init>()
            int r0 = r16.getInt()
            r7.A00 = r0
            int r0 = r16.getInt()
            r7.A02 = r0
            int r0 = r16.getInt()
            r7.A01 = r0
            r16.getInt()
            int r14 = r7.A02
            int r0 = r14 % 4
            r4 = 2
            if (r0 != 0) goto L_0x0134
            int r0 = r7.A01
            if (r15 > r14) goto L_0x011e
            int r14 = r14 + r0
            if (r14 > r13) goto L_0x011e
            r11[r9] = r7
            int r9 = r9 + 1
            goto L_0x00cd
        L_0x00fc:
            java.lang.String r0 = "lispx"
            boolean r0 = r4.startsWith(r0)
            if (r0 == 0) goto L_0x010a
            r0 = 15
            java.lang.String r4 = r4.substring(r0)
        L_0x010a:
            java.lang.String r0 = "UTF-8"
            byte[] r0 = r4.getBytes(r0)     // Catch:{ UnsupportedEncodingException -> 0x01f9 }
            java.nio.ByteBuffer r4 = com.facebook.minscript.compiler.MinsCompilerImpl$Helper.doCompile(r0)     // Catch:{ UnsupportedEncodingException -> 0x01f9 }
            goto L_0x0081
        L_0x0116:
            java.lang.String r0 = "MinScript compiler detected raw Lispy: "
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0r(r0)
            goto L_0x0061
        L_0x011e:
            java.lang.Object[] r1 = new java.lang.Object[r4]
            X.AnonymousClass000.A1M(r1, r9, r6)
            int r0 = r7.A00
            X.AnonymousClass000.A1M(r1, r0, r3)
            java.lang.String r0 = "section index %d kind %d invalid offset/size"
            java.lang.String r1 = java.lang.String.format(r0, r1)
            X.5Aq r0 = new X.5Aq
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0134:
            java.lang.Object[] r1 = new java.lang.Object[r4]
            X.AnonymousClass000.A1M(r1, r9, r6)
            int r0 = r7.A00
            X.AnonymousClass000.A1M(r1, r0, r3)
            java.lang.String r0 = "section index %d kind %d invalid alignment"
            java.lang.String r1 = java.lang.String.format(r0, r1)
            X.5Aq r0 = new X.5Aq
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x014a:
            r9 = 4
            if (r12 < r9) goto L_0x01a9
            r4 = 0
        L_0x014e:
            r0 = r11[r4]
            int r0 = r0.A00
            if (r0 != r4) goto L_0x019d
            int r4 = r4 + 1
            if (r4 < r9) goto L_0x014e
            r0 = r11[r6]
            int r0 = r0.A01
            int r0 = r0 >> 4
            java.util.concurrent.atomic.AtomicReferenceArray r7 = new java.util.concurrent.atomic.AtomicReferenceArray
            r7.<init>(r0)
            r0 = r11[r3]
            int r0 = r0.A01
            int r0 = r0 >> 4
            java.util.concurrent.atomic.AtomicReferenceArray r6 = new java.util.concurrent.atomic.AtomicReferenceArray
            r6.<init>(r0)
            java.lang.String r13 = ""
            r4 = 4
        L_0x0171:
            if (r4 >= r12) goto L_0x020e
            r14 = r11[r4]
            int r0 = r14.A00
            if (r0 != r9) goto L_0x019a
            java.nio.ByteBuffer r13 = r16.duplicate()
            int r0 = r14.A02
            r13.position(r0)
            int r3 = r14.A02
            int r0 = r14.A01
            int r3 = r3 + r0
            r13.limit(r3)
            int r0 = r13.remaining()
            byte[] r3 = new byte[r0]
            r13.get(r3)
            java.nio.charset.Charset r0 = X.C90064dR.A05
            java.lang.String r13 = new java.lang.String
            r13.<init>(r3, r0)
        L_0x019a:
            int r4 = r4 + 1
            goto L_0x0171
        L_0x019d:
            java.lang.String r0 = "missing required section "
            java.lang.String r1 = X.C13680ns.A0c(r4, r0)
            X.5Aq r0 = new X.5Aq
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x01a9:
            java.lang.String r1 = "less than required number of sections"
            X.5Aq r0 = new X.5Aq
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x01b1:
            java.lang.String r1 = "encoded size not enough for section headers"
            X.5Aq r0 = new X.5Aq
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x01b9:
            java.lang.String r1 = "encoded size is too small"
            X.5Aq r0 = new X.5Aq
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x01c1:
            java.lang.String r0 = "buffer is smaller than encoded size "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            r1.append(r13)
            java.lang.String r0 = " "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = " byteBuffer.order:"
            r1.append(r0)
            java.nio.ByteOrder r0 = r4.order()
            r1.append(r0)
            java.lang.String r0 = " native order:"
            r1.append(r0)
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            java.lang.String r1 = X.AnonymousClass000.A0f(r0, r1)
            X.5Aq r0 = new X.5Aq
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x01f1:
            java.lang.String r1 = "invalid magic or version"
            X.5Aq r0 = new X.5Aq
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x01f9:
            r1 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x0200:
            java.lang.String r0 = "mUnparsed is null"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0V(r0)
            throw r0
        L_0x0207:
            java.lang.String r0 = "The Lispy expression cannot be parsed"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0V(r0)
            throw r0
        L_0x020e:
            X.4dR r12 = new X.4dR
            r17 = r11
            r14 = r16
            r15 = r7
            r16 = r6
            r12.<init>(r13, r14, r15, r16, r17)
            r10.A00 = r12
        L_0x021c:
            int r0 = r8.A01
            X.4RT r4 = r12.A00(r0)
            r0 = 0
            X.4Gs r3 = new X.4Gs
            r3.<init>(r4, r0)
            r8.A00 = r3
        L_0x022a:
            X.4Gr r11 = r8.A02
            if (r11 == 0) goto L_0x023a
            X.4dR r0 = r11.A00
            if (r0 == 0) goto L_0x0314
        L_0x0232:
            java.lang.String r0 = r0.A00
            r7 = r18
            r2.ANb(r7, r5, r0)
            goto L_0x023f
        L_0x023a:
            X.4RT r0 = r3.A00
            X.4dR r0 = r0.A03
            goto L_0x0232
        L_0x023f:
            java.util.List r0 = r7.A00     // Catch:{ 43P -> 0x0302 }
            java.util.List r15 = java.util.Collections.unmodifiableList(r0)     // Catch:{ 43P -> 0x0302 }
            java.lang.ThreadLocal r4 = X.AnonymousClass49B.A00     // Catch:{ 43P -> 0x0302 }
            java.lang.Object r0 = r4.get()     // Catch:{ 43P -> 0x0302 }
            if (r0 != 0) goto L_0x0257
            r14 = 1
            X.4f6 r10 = new X.4f6     // Catch:{ 43P -> 0x0302 }
            r10.<init>()     // Catch:{ 43P -> 0x0302 }
            r4.set(r10)     // Catch:{ 43P -> 0x0302 }
            goto L_0x025e
        L_0x0257:
            r14 = 0
            java.lang.Object r10 = r4.get()     // Catch:{ 43P -> 0x0302 }
            X.4f6 r10 = (X.C90934f6) r10     // Catch:{ 43P -> 0x0302 }
        L_0x025e:
            X.4CP r12 = new X.4CP     // Catch:{ 5Aq -> 0x02ef, RuntimeException -> 0x02e8 }
            r12.<init>(r1)     // Catch:{ 5Aq -> 0x02ef, RuntimeException -> 0x02e8 }
            int r9 = r10.A01     // Catch:{ 5Aq -> 0x02ef, RuntimeException -> 0x02e8 }
            int r0 = r15.size()     // Catch:{ 5Aq -> 0x02ef, RuntimeException -> 0x02e8 }
            r6 = 1
            int r0 = r0 + 1
            int r0 = r0 + 5
            r10.A0P(r0)     // Catch:{ 5Aq -> 0x02ef, RuntimeException -> 0x02e8 }
            r13 = 0
            r10.A0U(r13)     // Catch:{ 5Aq -> 0x02ef, RuntimeException -> 0x02e8 }
            java.util.Iterator r1 = r15.iterator()     // Catch:{ 5Aq -> 0x02ef, RuntimeException -> 0x02e8 }
        L_0x0279:
            boolean r0 = r1.hasNext()     // Catch:{ 5Aq -> 0x02ef, RuntimeException -> 0x02e8 }
            if (r0 == 0) goto L_0x0287
            java.lang.Object r0 = r1.next()     // Catch:{ 5Aq -> 0x02ef, RuntimeException -> 0x02e8 }
            r10.A0U(r0)     // Catch:{ 5Aq -> 0x02ef, RuntimeException -> 0x02e8 }
            goto L_0x0279
        L_0x0287:
            r1 = -1
            X.1e9 r0 = new X.1e9     // Catch:{ 5Aq -> 0x02ef, RuntimeException -> 0x02e8 }
            r0.<init>(r13, r3, r1)     // Catch:{ 5Aq -> 0x02ef, RuntimeException -> 0x02e8 }
            X.1e8 r3 = new X.1e8     // Catch:{ 5Aq -> 0x02ef, RuntimeException -> 0x02e8 }
            r3.<init>(r0)     // Catch:{ 5Aq -> 0x02ef, RuntimeException -> 0x02e8 }
            int r1 = r15.size()     // Catch:{ 5Aq -> 0x02ef, RuntimeException -> 0x02e8 }
            int r0 = r10.A02     // Catch:{ 5Aq -> 0x02ef, RuntimeException -> 0x02e8 }
            r10.A0V(r3, r1, r13, r0)     // Catch:{ 5Aq -> 0x02ef, RuntimeException -> 0x02e8 }
            X.4CP r1 = r10.A03     // Catch:{ 5Aq -> 0x02ef, RuntimeException -> 0x02e8 }
            r10.A03 = r12     // Catch:{ 5Aq -> 0x02ef, RuntimeException -> 0x02e8 }
            r10.A0M()     // Catch:{ all -> 0x02e4 }
            r10.A03 = r1     // Catch:{ 5Aq -> 0x02ef, RuntimeException -> 0x02e8 }
            r3 = 0
            java.lang.Object r1 = X.C90934f6.A08(r10)     // Catch:{ 5Aq -> 0x02ef, RuntimeException -> 0x02e8 }
            r10.A0N()     // Catch:{ 5Aq -> 0x02ef, RuntimeException -> 0x02e8 }
            int r0 = r10.A01     // Catch:{ 5Aq -> 0x02ef, RuntimeException -> 0x02e8 }
            if (r0 == r9) goto L_0x02c8
            java.lang.Object[] r1 = X.C13690nt.A1Z()     // Catch:{ 5Aq -> 0x02ef, RuntimeException -> 0x02e8 }
            X.AnonymousClass000.A1M(r1, r0, r3)     // Catch:{ 5Aq -> 0x02ef, RuntimeException -> 0x02e8 }
            X.AnonymousClass000.A1M(r1, r9, r6)     // Catch:{ 5Aq -> 0x02ef, RuntimeException -> 0x02e8 }
            java.lang.String r0 = "Execution ended prematurely: stack size = %d, initial stack size = %d"
            java.lang.String r0 = java.lang.String.format(r0, r1)     // Catch:{ 5Aq -> 0x02ef, RuntimeException -> 0x02e8 }
            X.C90934f6.A0C(r0)     // Catch:{ 5Aq -> 0x02ef, RuntimeException -> 0x02e8 }
            java.lang.RuntimeException r0 = X.AnonymousClass000.A0Z()     // Catch:{ 5Aq -> 0x02ef, RuntimeException -> 0x02e8 }
            goto L_0x02e7
        L_0x02c8:
            if (r14 == 0) goto L_0x02cd
            r4.remove()     // Catch:{ 43P -> 0x0302 }
        L_0x02cd:
            if (r11 == 0) goto L_0x02d9
            X.4dR r0 = r11.A00
            if (r0 == 0) goto L_0x0314
        L_0x02d3:
            java.lang.String r0 = r0.A00
        L_0x02d5:
            r2.AMK(r7, r5, r0)
            return r1
        L_0x02d9:
            X.4Gs r0 = r8.A00
            if (r0 == 0) goto L_0x02e2
            X.4RT r0 = r0.A00
            X.4dR r0 = r0.A03
            goto L_0x02d3
        L_0x02e2:
            r0 = 0
            goto L_0x02d5
        L_0x02e4:
            r0 = move-exception
            r10.A03 = r1     // Catch:{ 5Aq -> 0x02ef, RuntimeException -> 0x02e8 }
        L_0x02e7:
            throw r0     // Catch:{ 5Aq -> 0x02ef, RuntimeException -> 0x02e8 }
        L_0x02e8:
            r1 = move-exception
            X.5Aq r0 = new X.5Aq     // Catch:{ 5Aq -> 0x02f1 }
            r0.<init>((java.lang.Throwable) r1)     // Catch:{ 5Aq -> 0x02f1 }
            throw r0     // Catch:{ 5Aq -> 0x02f1 }
        L_0x02ef:
            r0 = move-exception
            throw r0     // Catch:{ 5Aq -> 0x02f1 }
        L_0x02f1:
            r1 = move-exception
            if (r14 == 0) goto L_0x02fa
            X.43P r0 = new X.43P     // Catch:{ all -> 0x02fb }
            r0.<init>(r1)     // Catch:{ all -> 0x02fb }
            throw r0     // Catch:{ all -> 0x02fb }
        L_0x02fa:
            throw r1     // Catch:{ all -> 0x02fb }
        L_0x02fb:
            r0 = move-exception
            if (r14 == 0) goto L_0x0301
            r4.remove()     // Catch:{ 43P -> 0x0302 }
        L_0x0301:
            throw r0     // Catch:{ 43P -> 0x0302 }
        L_0x0302:
            r1 = move-exception
            java.lang.String r0 = r1.getMessage()
            if (r0 != 0) goto L_0x030f
            java.lang.String r0 = ""
        L_0x030b:
            r2.AWj(r0)
            throw r1
        L_0x030f:
            java.lang.String r0 = r1.getMessage()
            goto L_0x030b
        L_0x0314:
            java.lang.String r0 = "getBytecodeFile() was called while bytecodeFile is null. This normally happens when getBytecodeFile() is called before calling \"ensurePrepared()\" method"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0V(r0)
            throw r0
        L_0x031b:
            java.lang.String r0 = "ensureParsed expects OpaqueExpression"
            java.lang.RuntimeException r0 = X.AnonymousClass000.A0a(r0)
            throw r0
        L_0x0322:
            java.lang.String r0 = "Interpreter.evaluate expects OpaqueExpression"
            java.lang.RuntimeException r0 = X.AnonymousClass000.A0a(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C807345g.A00(X.0q3, X.0q1, X.0q5):java.lang.Object");
    }
}
