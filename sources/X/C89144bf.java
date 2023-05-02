package X;

import java.util.Arrays;
import java.util.LinkedList;

/* renamed from: X.4bf  reason: invalid class name and case insensitive filesystem */
public class C89144bf {
    public final AnonymousClass4XU A00;
    public final LinkedList A01;

    public C89144bf(AnonymousClass4XU r1, LinkedList linkedList) {
        this.A01 = linkedList;
        this.A00 = r1;
    }

    public static AnonymousClass4TN A00(String str, AnonymousClass5OQ... r5) {
        try {
            AnonymousClass4XU r3 = new AnonymousClass4XU(str);
            r3.A05();
            CharSequence charSequence = r3.A02;
            if (!(charSequence.charAt(0) == '$' || charSequence.charAt(0) == '@')) {
                StringBuilder A0o = AnonymousClass000.A0o();
                A0o.append("$.");
                r3 = new AnonymousClass4XU(AnonymousClass000.A0h(str, A0o));
                r3.A05();
            }
            if (r3.A02.charAt(r3.A00) != '.') {
                return new C89144bf(r3, new LinkedList(Arrays.asList(r5))).A01();
            }
            throw C70003fx.A00("Path must not end with a '.' or '..'");
        } catch (Exception e2) {
            if (!(e2 instanceof C70003fx)) {
                throw new C70003fx((Throwable) e2);
            }
            throw e2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0036, code lost:
        if (r2 == '@') goto L_0x0038;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass4TN A01() {
        /*
            r5 = this;
        L_0x0000:
            X.4XU r3 = r5.A00
            int r1 = r3.A01
            boolean r0 = r3.A09(r1)
            if (r0 == 0) goto L_0x0027
            java.lang.CharSequence r0 = r3.A02
            char r1 = r0.charAt(r1)
            r0 = 32
            if (r1 == r0) goto L_0x0020
            r0 = 9
            if (r1 == r0) goto L_0x0020
            r0 = 10
            if (r1 == r0) goto L_0x0020
            r0 = 13
            if (r1 != r0) goto L_0x0027
        L_0x0020:
            int r0 = r3.A01
            int r0 = r0 + 1
            r3.A01 = r0
            goto L_0x0000
        L_0x0027:
            java.lang.CharSequence r4 = r3.A02
            int r0 = r3.A01
            char r2 = r4.charAt(r0)
            r0 = 36
            if (r2 == r0) goto L_0x0038
            r1 = 64
            r0 = 0
            if (r2 != r1) goto L_0x0039
        L_0x0038:
            r0 = 1
        L_0x0039:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0080
            int r0 = r3.A01
            char r0 = r4.charAt(r0)
            X.3gR r2 = new X.3gR
            r2.<init>(r0)
            int r1 = r3.A01
            int r0 = r3.A00
            if (r1 >= r0) goto L_0x008b
            int r0 = r1 + 1
            r3.A01 = r0
            char r1 = r4.charAt(r0)
            r0 = 46
            if (r1 == r0) goto L_0x0083
            int r0 = r3.A01
            char r1 = r4.charAt(r0)
            r0 = 91
            if (r1 == r0) goto L_0x0083
            java.lang.String r0 = "Illegal character at position "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            int r0 = r3.A01
            r1.append(r0)
            java.lang.String r0 = " expected '.' or '['"
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)
        L_0x007b:
            X.3fx r0 = X.C70003fx.A00(r0)
            throw r0
        L_0x0080:
            java.lang.String r0 = "Path must start with '$' or '@'"
            goto L_0x007b
        L_0x0083:
            X.4Q2 r0 = new X.4Q2
            r0.<init>(r2)
            r5.A02(r0)
        L_0x008b:
            java.lang.String r1 = r2.A02
            java.lang.String r0 = "$"
            boolean r1 = r1.equals(r0)
            X.4TN r0 = new X.4TN
            r0.<init>(r2, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C89144bf.A01():X.4TN");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:123:0x01a5, code lost:
        r24 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x023f, code lost:
        if (r0 == false) goto L_0x0241;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x04f0, code lost:
        r11.A01 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:331:0x0584, code lost:
        r0 = X.AnonymousClass000.A0l(X.AnonymousClass000.A0r(r0), r11.A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:342:0x05b8, code lost:
        if (r1 >= r11.A00) goto L_0x05ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00d7, code lost:
        if (r1 == '@') goto L_0x00d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0153, code lost:
        r5.add(r14);
     */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0213  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x0224  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A02(X.AnonymousClass4Q2 r26) {
        /*
            r25 = this;
            r12 = r25
            X.4XU r11 = r12.A00
            java.lang.CharSequence r10 = r11.A02
            int r0 = r11.A01
            char r2 = r10.charAt(r0)
            r0 = 42
            java.lang.String r15 = "Could not parse token starting at position "
            r9 = 1
            r13 = r26
            if (r2 == r0) goto L_0x023b
            r1 = 46
            if (r2 == r1) goto L_0x01e9
            r8 = 91
            boolean r0 = r11.A07(r8)
            if (r2 == r8) goto L_0x024b
            if (r0 != 0) goto L_0x0241
            r0 = 42
            boolean r0 = r11.A07(r0)
            if (r0 != 0) goto L_0x0241
            boolean r0 = r11.A07(r1)
            if (r0 != 0) goto L_0x0241
            r2 = 32
            boolean r0 = r11.A07(r2)
            if (r0 != 0) goto L_0x0241
            int r7 = r11.A01
            r3 = r7
        L_0x003c:
            boolean r0 = r11.A09(r3)
            r14 = 40
            if (r0 == 0) goto L_0x01a4
            char r0 = r10.charAt(r3)
            if (r0 == r2) goto L_0x01e5
            if (r0 == r1) goto L_0x01a2
            if (r0 == r8) goto L_0x01a2
            if (r0 != r14) goto L_0x019e
            r6 = r3
            r24 = 1
        L_0x0053:
            if (r6 != 0) goto L_0x0059
            int r0 = r11.A00
            int r6 = r0 + 1
        L_0x0059:
            r5 = 0
            if (r24 == 0) goto L_0x01e1
            int r2 = r3 + 1
            r1 = r2
            r15 = 1
        L_0x0060:
            int r0 = r11.A00
            int r0 = r0 + 1
            r4 = 41
            if (r1 >= r0) goto L_0x01cc
            char r0 = r10.charAt(r1)
            if (r0 != r4) goto L_0x0190
            int r15 = r15 + -1
        L_0x0070:
            if (r15 != 0) goto L_0x019a
            boolean r0 = r11.A09(r2)
            if (r0 == 0) goto L_0x01c8
            char r0 = r10.charAt(r2)
            if (r0 == r4) goto L_0x05a4
            int r0 = r6 + 1
            r11.A01 = r0
            java.lang.String r23 = X.AnonymousClass3K4.A0Y(r10, r7, r6)
            java.util.ArrayList r5 = X.AnonymousClass000.A0u()
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0o()
            r22 = 0
            r2 = 1
            r21 = 0
            r20 = 0
            r19 = 0
            r18 = 0
            r17 = 0
        L_0x009b:
            int r1 = r11.A01
            boolean r0 = r11.A09(r1)
            if (r0 == 0) goto L_0x01ad
            if (r22 != 0) goto L_0x01ad
            char r1 = r10.charAt(r1)
            int r0 = r11.A01
            int r0 = r0 + 1
            r11.A01 = r0
            r15 = 123(0x7b, float:1.72E-43)
            r14 = 34
            if (r20 != 0) goto L_0x00e7
            r0 = 32
            if (r1 == r0) goto L_0x009b
            r0 = 9
            if (r1 == r0) goto L_0x009b
            r0 = 10
            if (r1 == r0) goto L_0x009b
            r0 = 13
            if (r1 == r0) goto L_0x009b
            if (r1 == r15) goto L_0x018c
            boolean r0 = java.lang.Character.isDigit(r1)
            if (r0 != 0) goto L_0x018c
            if (r14 == r1) goto L_0x018c
            r0 = 36
            if (r1 == r0) goto L_0x00d9
            r16 = 0
            r0 = 64
            if (r1 != r0) goto L_0x00db
        L_0x00d9:
            r16 = 1
        L_0x00db:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r16)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00e7
            X.41D r20 = X.AnonymousClass41D.PATH
        L_0x00e7:
            if (r1 == r14) goto L_0x016c
            r0 = 44
            if (r1 == r0) goto L_0x010a
            if (r1 == r8) goto L_0x0169
            r0 = 93
            if (r1 == r0) goto L_0x0164
            if (r1 == r15) goto L_0x0161
            r0 = 125(0x7d, float:1.75E-43)
            if (r1 == r0) goto L_0x015c
            r14 = 40
            if (r1 == r14) goto L_0x017a
            if (r1 != r4) goto L_0x017c
            int r2 = r2 + -1
            if (r2 < 0) goto L_0x0107
            r0 = r17
            if (r0 != r14) goto L_0x010a
        L_0x0107:
            r3.append(r1)
        L_0x010a:
            if (r18 != 0) goto L_0x017c
            if (r21 != 0) goto L_0x017c
            if (r19 != 0) goto L_0x017c
            if (r2 != 0) goto L_0x0157
            if (r4 != r1) goto L_0x017c
            r22 = 1
        L_0x0116:
            if (r20 == 0) goto L_0x0129
            int r0 = r20.ordinal()
            switch(r0) {
                case 0: goto L_0x012d;
                case 1: goto L_0x0137;
                default: goto L_0x011f;
            }
        L_0x011f:
            int r14 = r3.length()
            r0 = 0
            r3.delete(r0, r14)
            r20 = 0
        L_0x0129:
            r17 = r1
            goto L_0x009b
        L_0x012d:
            java.lang.String r0 = r3.toString()
            X.4eA r14 = new X.4eA
            r14.<init>((java.lang.String) r0)
            goto L_0x0153
        L_0x0137:
            java.util.LinkedList r15 = new java.util.LinkedList
            r15.<init>()
            java.lang.String r0 = r3.toString()
            X.4XU r14 = new X.4XU
            r14.<init>(r0)
            X.4bf r0 = new X.4bf
            r0.<init>(r14, r15)
            X.4TN r0 = r0.A01()
            X.4eA r14 = new X.4eA
            r14.<init>((X.AnonymousClass4TN) r0)
        L_0x0153:
            r5.add(r14)
            goto L_0x011f
        L_0x0157:
            if (r9 != r2) goto L_0x017c
            r22 = 0
            goto L_0x0116
        L_0x015c:
            if (r21 == 0) goto L_0x0582
            int r21 = r21 + -1
            goto L_0x017c
        L_0x0161:
            int r21 = r21 + 1
            goto L_0x017c
        L_0x0164:
            if (r19 == 0) goto L_0x01a9
            int r19 = r19 + -1
            goto L_0x017c
        L_0x0169:
            int r19 = r19 + 1
            goto L_0x017c
        L_0x016c:
            r14 = 92
            r0 = r17
            if (r0 == r14) goto L_0x0177
            if (r18 <= 0) goto L_0x0177
            int r18 = r18 + -1
            goto L_0x017c
        L_0x0177:
            int r18 = r18 + 1
            goto L_0x017c
        L_0x017a:
            int r2 = r2 + 1
        L_0x017c:
            if (r20 == 0) goto L_0x0129
            r0 = 44
            if (r1 != r0) goto L_0x0188
            if (r21 != 0) goto L_0x0188
            if (r19 != 0) goto L_0x0188
            if (r9 == r2) goto L_0x0129
        L_0x0188:
            r3.append(r1)
            goto L_0x0129
        L_0x018c:
            X.41D r20 = X.AnonymousClass41D.JSON
            goto L_0x00e7
        L_0x0190:
            char r0 = r10.charAt(r1)
            if (r0 != r14) goto L_0x019a
            int r15 = r15 + 1
            goto L_0x0070
        L_0x019a:
            int r1 = r1 + 1
            goto L_0x0060
        L_0x019e:
            int r3 = r3 + 1
            goto L_0x003c
        L_0x01a2:
            r6 = r3
            goto L_0x01a5
        L_0x01a4:
            r6 = 0
        L_0x01a5:
            r24 = 0
            goto L_0x0053
        L_0x01a9:
            java.lang.String r0 = "Unexpected close bracket ']' at character position: "
            goto L_0x0584
        L_0x01ad:
            if (r21 != 0) goto L_0x01b5
            if (r2 != 0) goto L_0x01b5
            if (r19 != 0) goto L_0x01b5
            goto L_0x05a6
        L_0x01b5:
            java.lang.String r0 = "Arguments to function: '"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            r0 = r23
            r1.append(r0)
            java.lang.String r0 = "' are not closed properly."
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)
            goto L_0x058e
        L_0x01c8:
            r11.A01 = r3
            goto L_0x05a6
        L_0x01cc:
            java.lang.String r2 = X.AnonymousClass3K4.A0Y(r10, r7, r6)
            java.lang.String r0 = "Arguments to function: '"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            r1.append(r2)
            java.lang.String r0 = "' are not closed properly."
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)
            goto L_0x058e
        L_0x01e1:
            r11.A01 = r6
            goto L_0x05a6
        L_0x01e5:
            java.lang.String r0 = "Use bracket notion ['my prop'] if your property contains blank characters. position: "
            goto L_0x0584
        L_0x01e9:
            boolean r0 = r11.A07(r1)
            if (r0 == 0) goto L_0x0218
            int r0 = r11.A01
            int r2 = r0 + 1
            boolean r0 = r11.A09(r2)
            if (r0 == 0) goto L_0x0218
            char r0 = r10.charAt(r2)
            if (r0 != r1) goto L_0x0218
            X.3gT r0 = new X.3gT
            r0.<init>()
            r13.A00(r0)
            r2 = 2
        L_0x0208:
            int r0 = r11.A01
            int r0 = r0 + r2
            r11.A01 = r0
            boolean r0 = r11.A07(r1)
            if (r0 != 0) goto L_0x0224
            boolean r0 = r12.A02(r13)
            goto L_0x023f
        L_0x0218:
            int r0 = r11.A01
            int r0 = r0 + 1
            boolean r0 = r11.A09(r0)
            if (r0 == 0) goto L_0x0237
            r2 = 1
            goto L_0x0208
        L_0x0224:
            java.lang.String r0 = "Character '.' on position "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            int r0 = r11.A01
            r1.append(r0)
            java.lang.String r0 = " is not valid."
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)
            goto L_0x058e
        L_0x0237:
            java.lang.String r0 = "Path must not end with a '."
            goto L_0x058e
        L_0x023b:
            boolean r0 = r12.A03(r13)
        L_0x023f:
            if (r0 != 0) goto L_0x05ba
        L_0x0241:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0q(r15)
            int r0 = r11.A01
            r1.append(r0)
            goto L_0x02b8
        L_0x024b:
            if (r0 == 0) goto L_0x025b
            int r0 = r11.A01
            char r2 = r11.A00(r0)
            r0 = 39
            if (r2 == r0) goto L_0x04fe
            r0 = 34
            if (r2 == r0) goto L_0x04fe
        L_0x025b:
            boolean r0 = r11.A07(r8)
            r1 = 0
            if (r0 == 0) goto L_0x0276
            int r0 = r11.A01
            char r2 = r11.A00(r0)
            boolean r0 = java.lang.Character.isDigit(r2)
            r14 = 58
            r7 = 45
            if (r0 != 0) goto L_0x0344
            if (r2 == r7) goto L_0x0344
            if (r2 == r14) goto L_0x0344
        L_0x0276:
            boolean r0 = r12.A03(r13)
            if (r0 != 0) goto L_0x05ba
            boolean r0 = r11.A07(r8)
            r7 = 0
            if (r0 != 0) goto L_0x0311
            r1 = 63
            int r0 = r11.A01
            boolean r0 = r11.A08(r1, r0)
            if (r0 != 0) goto L_0x0311
        L_0x028d:
            boolean r0 = r11.A07(r8)
            if (r0 == 0) goto L_0x02aa
            r1 = 63
            int r0 = r11.A01
            int r0 = r11.A02(r1, r0)
            r3 = -1
            if (r0 == r3) goto L_0x02aa
            char r1 = r11.A00(r0)
            r2 = 93
            if (r1 == r2) goto L_0x02be
            r0 = 44
            if (r1 == r0) goto L_0x02be
        L_0x02aa:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0q(r15)
            int r0 = r11.A01
            r1.append(r0)
            java.lang.String r0 = ". Expected ?, ', 0-9, * "
            r1.append(r0)
        L_0x02b8:
            java.lang.String r0 = r1.toString()
            goto L_0x058e
        L_0x02be:
            int r0 = r11.A01
            int r1 = r0 + 1
            r6 = r1
        L_0x02c3:
            boolean r0 = r11.A09(r6)
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x02aa
            char r0 = r10.charAt(r6)
            if (r0 != r2) goto L_0x030e
            if (r6 == r3) goto L_0x02aa
            java.lang.String r2 = X.AnonymousClass3K4.A0Y(r10, r1, r6)
            java.lang.String r0 = ","
            java.lang.String[] r8 = r2.split(r0)
            java.util.LinkedList r7 = r12.A01
            int r0 = r7.size()
            int r5 = r8.length
            if (r0 < r5) goto L_0x039d
            java.util.ArrayList r4 = X.AnonymousClass000.A0u()
            r3 = 0
        L_0x02eb:
            if (r3 >= r5) goto L_0x04e6
            r0 = r8[r3]
            if (r0 == 0) goto L_0x030a
            java.lang.String r2 = r0.trim()
            if (r2 == 0) goto L_0x030b
            r1 = r2
        L_0x02f8:
            java.lang.String r0 = "?"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0391
            java.lang.Object r0 = r7.pop()
            r4.add(r0)
            int r3 = r3 + 1
            goto L_0x02eb
        L_0x030a:
            r2 = 0
        L_0x030b:
            java.lang.String r1 = ""
            goto L_0x02f8
        L_0x030e:
            int r6 = r6 + 1
            goto L_0x02c3
        L_0x0311:
            int r4 = r11.A01
            r0 = 63
            int r0 = r11.A02(r0, r4)
            r3 = -1
            if (r0 == r3) goto L_0x028d
            r2 = 40
            int r1 = r11.A02(r2, r0)
            if (r1 == r3) goto L_0x028d
            r0 = 41
            int r2 = r11.A01(r2, r0, r1, r9)
            if (r2 == r3) goto L_0x028d
            r1 = 93
            boolean r0 = r11.A08(r1, r2)
            if (r0 == 0) goto L_0x028d
            int r0 = r11.A02(r1, r2)
            int r3 = r0 + 1
            java.lang.String r0 = X.AnonymousClass3K4.A0Y(r10, r4, r3)
            X.4bb r4 = new X.4bb
            r4.<init>(r0)
            goto L_0x03b3
        L_0x0344:
            int r0 = r11.A01
            int r3 = r0 + 1
            r4 = r3
            r2 = 93
        L_0x034b:
            boolean r0 = r11.A09(r4)
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x0276
            char r0 = r10.charAt(r4)
            if (r0 != r2) goto L_0x038e
            r0 = -1
            if (r4 == r0) goto L_0x0276
            java.lang.String r0 = X.AnonymousClass3K4.A0Y(r10, r3, r4)
            java.lang.String r5 = r0.trim()
            java.lang.String r0 = "*"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x0276
            r2 = 0
        L_0x036d:
            int r3 = r5.length()
            if (r2 >= r3) goto L_0x041c
            char r3 = r5.charAt(r2)
            boolean r0 = java.lang.Character.isDigit(r3)
            if (r0 != 0) goto L_0x038b
            r0 = 44
            if (r3 == r0) goto L_0x038b
            if (r3 == r7) goto L_0x038b
            if (r3 == r14) goto L_0x038b
            r0 = 32
            if (r3 == r0) goto L_0x038b
            goto L_0x0276
        L_0x038b:
            int r2 = r2 + 1
            goto L_0x036d
        L_0x038e:
            int r4 = r4 + 1
            goto L_0x034b
        L_0x0391:
            java.lang.String r0 = "Expected '?' but found "
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0r(r0)
            java.lang.String r0 = X.AnonymousClass000.A0h(r2, r0)
            goto L_0x058e
        L_0x039d:
            java.lang.String r0 = "Not enough predicates supplied for filter ["
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            r1.append(r2)
            java.lang.String r0 = "] at position "
            r1.append(r0)
            int r0 = r11.A01
            java.lang.String r0 = X.AnonymousClass000.A0l(r1, r0)
            goto L_0x058e
        L_0x03b3:
            X.4tu r2 = r4.A02()     // Catch:{ 3fx -> 0x041a, Exception -> 0x03f1 }
            X.4XU r6 = r4.A00     // Catch:{ 3fx -> 0x041a, Exception -> 0x03f1 }
            r6.A04()     // Catch:{ 3fx -> 0x041a, Exception -> 0x03f1 }
            int r5 = r6.A01     // Catch:{ 3fx -> 0x041a, Exception -> 0x03f1 }
            boolean r0 = r6.A09(r5)     // Catch:{ 3fx -> 0x041a, Exception -> 0x03f1 }
            if (r0 != 0) goto L_0x03d8
            X.4tv r1 = new X.4tv
            r1.<init>(r2)
            X.3gS r0 = new X.3gS
            r0.<init>((X.AnonymousClass5OQ) r1)
            r13.A00(r0)
            r11.A01 = r3
            int r0 = r11.A00
            if (r3 < r0) goto L_0x05c7
            return r9
        L_0x03d8:
            java.lang.String r3 = "Expected end of filter expression instead of: %s"
            java.lang.Object[] r2 = new java.lang.Object[r9]     // Catch:{ 3fx -> 0x041a, Exception -> 0x03f1 }
            int r0 = r6.A00     // Catch:{ 3fx -> 0x041a, Exception -> 0x03f1 }
            int r1 = r0 + 1
            java.lang.CharSequence r0 = r6.A02     // Catch:{ 3fx -> 0x041a, Exception -> 0x03f1 }
            java.lang.CharSequence r0 = r0.subSequence(r5, r1)     // Catch:{ 3fx -> 0x041a, Exception -> 0x03f1 }
            r2[r7] = r0     // Catch:{ 3fx -> 0x041a, Exception -> 0x03f1 }
            java.lang.String r0 = java.lang.String.format(r3, r2)     // Catch:{ 3fx -> 0x041a, Exception -> 0x03f1 }
            X.3fx r0 = X.C70003fx.A00(r0)     // Catch:{ 3fx -> 0x041a, Exception -> 0x03f1 }
            throw r0     // Catch:{ 3fx -> 0x041a, Exception -> 0x03f1 }
        L_0x03f1:
            java.lang.String r0 = "Failed to parse filter: "
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0r(r0)
            X.4XU r2 = r4.A00
            r3.append(r2)
            java.lang.String r0 = ", error on position: "
            r3.append(r0)
            int r1 = r2.A01
            r3.append(r1)
            java.lang.String r0 = ", char: "
            r3.append(r0)
            java.lang.CharSequence r0 = r2.A02
            char r0 = r0.charAt(r1)
            java.lang.String r0 = X.AnonymousClass3K3.A0p(r3, r0)
            X.3fx r0 = X.C70003fx.A00(r0)
            throw r0
        L_0x041a:
            r0 = move-exception
            throw r0
        L_0x041c:
            java.lang.String r8 = ":"
            boolean r0 = r5.contains(r8)
            r6 = 0
            if (r0 != 0) goto L_0x047a
            r2 = 0
        L_0x0426:
            if (r2 >= r3) goto L_0x044b
            char r1 = r5.charAt(r2)
            boolean r0 = java.lang.Character.isDigit(r1)
            if (r0 != 0) goto L_0x0448
            r0 = 44
            if (r1 == r0) goto L_0x0448
            r0 = 32
            if (r1 == r0) goto L_0x0448
            if (r1 == r7) goto L_0x0448
            java.lang.String r0 = "Failed to parse ArrayIndexOperation: "
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0r(r0)
            java.lang.String r0 = X.AnonymousClass000.A0h(r5, r0)
            goto L_0x058e
        L_0x0448:
            int r2 = r2 + 1
            goto L_0x0426
        L_0x044b:
            java.util.regex.Pattern r1 = X.C88524ae.A01
            r0 = -1
            java.lang.String[] r5 = r1.split(r5, r0)
            int r3 = r5.length
            java.util.ArrayList r2 = X.C13690nt.A0i(r3)
        L_0x0457:
            if (r6 >= r3) goto L_0x04d6
            r1 = r5[r6]
            int r0 = java.lang.Integer.parseInt(r1)     // Catch:{ Exception -> 0x0469 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x0469 }
            r2.add(r0)
            int r6 = r6 + 1
            goto L_0x0457
        L_0x0469:
            r2 = move-exception
            java.lang.String r0 = "Failed to parse token in ArrayIndexOperation: "
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0r(r0)
            java.lang.String r1 = X.AnonymousClass000.A0h(r1, r0)
            X.3fx r0 = new X.3fx
            r0.<init>(r1, r2)
            throw r0
        L_0x047a:
            java.lang.String r10 = "Failed to parse SliceOperation: "
            if (r6 >= r3) goto L_0x048f
            char r2 = r5.charAt(r6)
            boolean r0 = java.lang.Character.isDigit(r2)
            if (r0 != 0) goto L_0x048c
            if (r2 == r7) goto L_0x048c
            if (r2 != r14) goto L_0x04f4
        L_0x048c:
            int r6 = r6 + 1
            goto L_0x047a
        L_0x048f:
            java.lang.String[] r8 = r5.split(r8)
            int r7 = r8.length
            r6 = 0
            if (r7 <= r1) goto L_0x04f4
            r1 = r8[r1]
            java.lang.String r3 = ""
            boolean r0 = r1.equals(r3)
            if (r0 == 0) goto L_0x04cd
            r2 = r6
        L_0x04a2:
            if (r7 <= r9) goto L_0x04b4
            r1 = r8[r9]
            boolean r0 = r1.equals(r3)
            if (r0 != 0) goto L_0x04b4
            int r0 = java.lang.Integer.parseInt(r1)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
        L_0x04b4:
            if (r2 == 0) goto L_0x04c8
            if (r6 != 0) goto L_0x04c5
            X.41W r1 = X.AnonymousClass41W.SLICE_FROM
        L_0x04ba:
            X.4R7 r0 = new X.4R7
            r0.<init>(r1, r2, r6)
            X.3gM r1 = new X.3gM
            r1.<init>(r0)
            goto L_0x04e0
        L_0x04c5:
            X.41W r1 = X.AnonymousClass41W.SLICE_BETWEEN
            goto L_0x04ba
        L_0x04c8:
            if (r6 == 0) goto L_0x04f4
            X.41W r1 = X.AnonymousClass41W.SLICE_TO
            goto L_0x04ba
        L_0x04cd:
            int r0 = java.lang.Integer.parseInt(r1)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            goto L_0x04a2
        L_0x04d6:
            X.4ae r0 = new X.4ae
            r0.<init>(r2)
            X.3gL r1 = new X.3gL
            r1.<init>(r0)
        L_0x04e0:
            r13.A00(r1)
            int r1 = r4 + 1
            goto L_0x04f0
        L_0x04e6:
            X.3gS r0 = new X.3gS
            r0.<init>((java.util.Collection) r4)
            r13.A00(r0)
            int r1 = r6 + 1
        L_0x04f0:
            r11.A01 = r1
            goto L_0x05b6
        L_0x04f4:
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0q(r10)
            java.lang.String r0 = X.AnonymousClass000.A0h(r5, r0)
            goto L_0x058e
        L_0x04fe:
            java.util.ArrayList r5 = X.AnonymousClass000.A0u()
            int r0 = r11.A01
            int r4 = r0 + 1
            r7 = r4
            r17 = 0
            r16 = 0
            r15 = 0
            r14 = 0
        L_0x050d:
            boolean r0 = r11.A09(r4)
            r8 = 93
            if (r0 == 0) goto L_0x0527
            char r6 = r10.charAt(r4)
            if (r17 == 0) goto L_0x0520
            r17 = 0
        L_0x051d:
            int r4 = r4 + 1
            goto L_0x050d
        L_0x0520:
            r0 = 92
            if (r0 != r6) goto L_0x0533
            r17 = 1
            goto L_0x051d
        L_0x0527:
            if (r16 == 0) goto L_0x0593
            java.lang.String r0 = "Property has not been closed - missing closing "
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0r(r0)
            r0.append(r2)
            goto L_0x0542
        L_0x0533:
            java.lang.String r3 = "Found empty property at index "
            if (r6 != r8) goto L_0x0547
            if (r16 != 0) goto L_0x051d
            if (r15 == 0) goto L_0x0593
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0q(r3)
            r0.append(r4)
        L_0x0542:
            java.lang.String r0 = r0.toString()
            goto L_0x058e
        L_0x0547:
            r1 = 44
            if (r6 != r2) goto L_0x0571
            if (r16 == 0) goto L_0x056b
            char r0 = r11.A00(r4)
            if (r0 == r8) goto L_0x055c
            if (r0 == r1) goto L_0x055c
            java.lang.String r0 = "Property must be separated by comma or Property must be terminated close square bracket at index "
            java.lang.String r0 = X.C13680ns.A0c(r4, r0)
            goto L_0x058e
        L_0x055c:
            java.lang.String r0 = X.AnonymousClass3K4.A0Y(r10, r7, r4)
            java.lang.String r0 = X.C90264dr.A01(r0)
            r5.add(r0)
            r14 = r4
            r16 = 0
            goto L_0x051d
        L_0x056b:
            int r7 = r4 + 1
            r16 = 1
            r15 = 0
            goto L_0x051d
        L_0x0571:
            if (r6 != r1) goto L_0x051d
            if (r16 != 0) goto L_0x051d
            if (r15 == 0) goto L_0x0580
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0o()
            java.lang.String r0 = X.C13680ns.A0i(r3, r0, r4)
            goto L_0x058e
        L_0x0580:
            r15 = 1
            goto L_0x051d
        L_0x0582:
            java.lang.String r0 = "Unexpected close brace '}' at character position: "
        L_0x0584:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            int r0 = r11.A01
            java.lang.String r0 = X.AnonymousClass000.A0l(r1, r0)
        L_0x058e:
            X.3fx r0 = X.C70003fx.A00(r0)
            throw r0
        L_0x0593:
            int r0 = r11.A02(r8, r14)
            int r0 = r0 + 1
            r11.A01 = r0
            X.3gP r0 = new X.3gP
            r0.<init>(r5, r2)
            r13.A00(r0)
            goto L_0x05b4
        L_0x05a4:
            r11.A01 = r2
        L_0x05a6:
            java.lang.String r0 = X.AnonymousClass3K4.A0Y(r10, r7, r6)
            if (r24 == 0) goto L_0x05bb
            X.3gQ r2 = new X.3gQ
            r2.<init>(r0, r5)
        L_0x05b1:
            r13.A00(r2)
        L_0x05b4:
            int r1 = r11.A01
        L_0x05b6:
            int r0 = r11.A00
            if (r1 < r0) goto L_0x05c7
        L_0x05ba:
            return r9
        L_0x05bb:
            r1 = 39
            java.util.List r0 = java.util.Collections.singletonList(r0)
            X.3gP r2 = new X.3gP
            r2.<init>(r0, r1)
            goto L_0x05b1
        L_0x05c7:
            r12.A02(r13)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C89144bf.A02(X.4Q2):boolean");
    }

    public final boolean A03(AnonymousClass4Q2 r6) {
        AnonymousClass4XU r3 = this.A00;
        boolean A07 = r3.A07('[');
        if (A07 && !r3.A08('*', r3.A01)) {
            return false;
        }
        if (!r3.A07('*') && (!r3.A09(r3.A01 + 1))) {
            return false;
        }
        int i2 = r3.A01;
        if (A07) {
            int A02 = r3.A02('*', i2);
            if (r3.A08(']', A02)) {
                i2 = r3.A02(']', A02);
            } else {
                throw C70003fx.A00(C13680ns.A0c(A02 + 1, "Expected wildcard token to end with ']' on position "));
            }
        }
        int i3 = i2 + 1;
        r3.A01 = i3;
        r6.A00(new C70273gO());
        if (i3 >= r3.A00) {
            return true;
        }
        A02(r6);
        return true;
    }
}
