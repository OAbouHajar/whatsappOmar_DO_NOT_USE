package X;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: X.25M  reason: invalid class name */
public class AnonymousClass25M {
    public static final Pattern A00 = Pattern.compile("\r?\n");
    public static final Pattern A01 = Pattern.compile("(?<=\nEND:VCARD)\\s*\r?\n", 2);

    public static List A00(String str) {
        List asList = Arrays.asList(A01.split(str, 258));
        int i2 = 1;
        if (asList.size() <= 0 || !((String) asList.get(asList.size() - 1)).isEmpty()) {
            i2 = 0;
        }
        int min = Math.min(asList.size(), 257) - i2;
        return min < asList.size() ? asList.subList(0, min) : asList;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(12:(4:118|(1:119)|403|121)|122|(1:145)|124|(4:138|(1:140)|131|(4:135|(1:137)|141|142))(8:126|(1:128)|131|133|135|(0)|141|142)|130|131|133|135|(0)|141|142) */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x02e2, code lost:
        if (r0 != null) goto L_0x02e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0323, code lost:
        r6[1] = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x046c, code lost:
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x0504, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x0584, code lost:
        if (r1 != ',') goto L_0x059c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x05c0, code lost:
        if (r0 != false) goto L_0x05ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x05c2, code lost:
        r5 = java.lang.System.currentTimeMillis();
        r4.A04.A02.add(r4.A03);
        r14.A00 += java.lang.System.currentTimeMillis() - r5;
        r5 = java.lang.System.currentTimeMillis();
        r4.A03 = new X.C87294We();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:0x07b0, code lost:
        throw new X.AnonymousClass25G(r1.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x019b, code lost:
        r2 = r9.substring(r4, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01a3, code lost:
        if (r2.equalsIgnoreCase("END") != false) goto L_0x05a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01a5, code lost:
        r6[0] = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01a8, code lost:
        if (r7 >= (r8 - 1)) goto L_0x01db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01aa, code lost:
        r6[1] = r9.substring(r7 + 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01db, code lost:
        r6[1] = "";
     */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x02fd  */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x04a5 A[SYNTHETIC, Splitter:B:220:0x04a5] */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x04b9 A[Catch:{ OutOfMemoryError -> 0x0505 }] */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x04e9 A[Catch:{ OutOfMemoryError -> 0x0505 }] */
    /* JADX WARNING: Removed duplicated region for block: B:250:0x052e  */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x0536  */
    /* JADX WARNING: Removed duplicated region for block: B:293:0x05e6 A[LOOP:3: B:37:0x00ee->B:293:0x05e6, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:386:0x05c0 A[EDGE_INSN: B:386:0x05c0->B:291:0x05c0 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(java.util.List r26, X.AnonymousClass25L r27) {
        /*
            r1 = r26
            int r2 = r1.size()
            r0 = 5
            int r5 = java.lang.Math.min(r0, r2)
            r4 = 0
        L_0x000c:
            java.lang.String r3 = "vcard2.1"
            if (r4 >= r5) goto L_0x0735
            java.lang.Object r2 = r1.get(r4)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r0 = "VERSION:"
            boolean r0 = r2.startsWith(r0)
            if (r0 == 0) goto L_0x0731
            java.lang.String r0 = "2.1"
            boolean r0 = r2.contains(r0)
            if (r0 != 0) goto L_0x0735
            java.lang.String r0 = "3.0"
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L_0x0731
            java.lang.String r0 = "vcard3.0"
        L_0x0032:
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x072a
            X.3BN r14 = new X.3BN
            r14.<init>()
        L_0x003d:
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0657
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
        L_0x0048:
            X.5AT r1 = new X.5AT
            r1.<init>(r6)
            X.5AS r0 = new X.5AS
            r0.<init>(r1)
            r14.A0H = r0
            r0 = r27
            r14.A0G = r0
            long r16 = java.lang.System.currentTimeMillis()
        L_0x005c:
            r13 = 1
            r12 = 0
        L_0x005e:
            java.lang.String r2 = r14.A00()
            if (r2 != 0) goto L_0x0070
            long r2 = r14.A0B
            long r0 = java.lang.System.currentTimeMillis()
            long r0 = r0 - r16
            long r2 = r2 + r0
            r14.A0B = r2
            return
        L_0x0070:
            java.lang.String r0 = r2.trim()
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x005e
            java.lang.String r11 = ":"
            r1 = 2
            java.lang.String[] r3 = r2.split(r11, r1)
            int r0 = r3.length
            if (r0 != r1) goto L_0x0798
            r0 = r3[r12]
            java.lang.String r1 = r0.trim()
            java.lang.String r22 = "BEGIN"
            r0 = r22
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0798
            r0 = r3[r13]
            java.lang.String r0 = r0.trim()
            java.lang.String r10 = "VCARD"
            boolean r0 = r0.equalsIgnoreCase(r10)
            if (r0 == 0) goto L_0x0798
            X.25L r2 = r14.A0G
            if (r2 == 0) goto L_0x00d1
            long r4 = java.lang.System.currentTimeMillis()
            X.25N r0 = new X.25N
            r0.<init>()
            r0.A00 = r13
            r0.A01 = r10
            java.util.List r1 = r2.A02
            r1.add(r0)
            int r0 = r1.size()
            int r0 = r0 - r13
            r2.A00 = r0
            java.lang.Object r0 = r1.get(r0)
            X.25N r0 = (X.AnonymousClass25N) r0
            r2.A04 = r0
            long r0 = r14.A0A
            long r2 = java.lang.System.currentTimeMillis()
            long r2 = r2 - r4
            long r0 = r0 + r2
            r14.A0A = r0
        L_0x00d1:
            long r18 = java.lang.System.currentTimeMillis()
            X.25L r1 = r14.A0G
            if (r1 == 0) goto L_0x00ee
            long r5 = java.lang.System.currentTimeMillis()
            X.4We r0 = new X.4We
            r0.<init>()
            r1.A03 = r0
        L_0x00e4:
            long r0 = r14.A09
            long r2 = java.lang.System.currentTimeMillis()
            long r2 = r2 - r5
            long r0 = r0 + r2
            r14.A09 = r0
        L_0x00ee:
            java.lang.String r27 = "8BIT"
            r0 = r27
            r14.A0C = r0
            java.lang.String r9 = r14.A01()
            long r20 = java.lang.System.currentTimeMillis()
            int r8 = r9.length()
            r7 = 2
            java.lang.String[] r6 = new java.lang.String[r7]
            java.lang.String r0 = "item"
            boolean r0 = r9.startsWith(r0)
            java.lang.String r26 = ""
            r5 = 0
            r25 = 0
            if (r0 == 0) goto L_0x0166
            java.lang.String[] r4 = r9.split(r11)
            int r3 = r4.length
            if (r3 < r7) goto L_0x05a2
            r2 = r4[r12]
            java.lang.StringBuilder r24 = new java.lang.StringBuilder
            r24.<init>()
            java.lang.String r0 = "."
            int r0 = r2.indexOf(r0)
            int r1 = r0 + 1
            r23 = 64
        L_0x0128:
            int r0 = r2.length()
            if (r1 >= r0) goto L_0x01de
            char r15 = r2.charAt(r1)
            r0 = 65
            if (r15 < r0) goto L_0x014e
            char r15 = r2.charAt(r1)
            r0 = 90
            if (r15 > r0) goto L_0x014e
            char r15 = r2.charAt(r1)
            r0 = r24
            r0.append(r15)
            char r23 = r2.charAt(r1)
        L_0x014b:
            int r1 = r1 + 1
            goto L_0x0128
        L_0x014e:
            char r15 = r2.charAt(r1)
            r0 = 45
            if (r15 != r0) goto L_0x01de
            r15 = 88
            r0 = r23
            if (r0 != r15) goto L_0x01de
            char r0 = r2.charAt(r1)
            r15 = r24
            r15.append(r0)
            goto L_0x014b
        L_0x0166:
            r7 = 0
            r5 = 0
            r4 = 0
        L_0x0169:
            if (r7 >= r8) goto L_0x077f
            char r3 = r9.charAt(r7)
            r2 = 59
            r15 = 58
            if (r5 == 0) goto L_0x0197
            r0 = 34
            if (r5 == r13) goto L_0x017f
            if (r3 != r0) goto L_0x017c
        L_0x017b:
            r5 = 1
        L_0x017c:
            int r7 = r7 + 1
            goto L_0x0169
        L_0x017f:
            if (r3 != r0) goto L_0x0183
            r5 = 2
            goto L_0x017c
        L_0x0183:
            if (r3 != r2) goto L_0x018d
            java.lang.String r0 = r9.substring(r4, r7)
            r14.A04(r0)
            goto L_0x01c7
        L_0x018d:
            if (r3 != r15) goto L_0x017c
            java.lang.String r0 = r9.substring(r4, r7)
            r14.A04(r0)
            goto L_0x01a7
        L_0x0197:
            java.lang.String r1 = "END"
            if (r3 != r15) goto L_0x01b4
            java.lang.String r2 = r9.substring(r4, r7)
            boolean r0 = r2.equalsIgnoreCase(r1)
            if (r0 != 0) goto L_0x05a0
            r6[r12] = r2
        L_0x01a7:
            int r8 = r8 - r13
            if (r7 >= r8) goto L_0x01db
            int r0 = r7 + 1
            java.lang.String r0 = r9.substring(r0)
            r6[r13] = r0
            goto L_0x0255
        L_0x01b4:
            r0 = 46
            if (r3 != r0) goto L_0x01ca
            java.lang.String r1 = r9.substring(r4, r7)
            X.25L r0 = r14.A0G
            if (r0 == 0) goto L_0x01c7
            X.4We r0 = r0.A03
            java.util.Set r0 = r0.A05
            r0.add(r1)
        L_0x01c7:
            int r4 = r7 + 1
            goto L_0x017c
        L_0x01ca:
            if (r3 != r2) goto L_0x017c
            java.lang.String r2 = r9.substring(r4, r7)
            boolean r0 = r2.equalsIgnoreCase(r1)
            if (r0 != 0) goto L_0x05a0
            r6[r12] = r2
            int r4 = r7 + 1
            goto L_0x017b
        L_0x01db:
            r6[r13] = r26
            goto L_0x0255
        L_0x01de:
            java.lang.String r0 = r24.toString()
            r6[r12] = r0
            r2 = r4[r13]
            java.lang.String r1 = "(\r\n|\r|\n|\n\r)"
            r0 = r26
            java.lang.String r0 = r2.replaceAll(r1, r0)
            r6[r13] = r0
            r1 = r6[r12]
            java.lang.String r0 = "ADR"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x02a2
            java.lang.String r0 = "type"
            boolean r0 = r9.contains(r0)
            if (r0 == 0) goto L_0x029e
            java.lang.String r0 = "="
            int r0 = r9.indexOf(r0)
            int r1 = r0 + 1
            int r0 = r9.indexOf(r11)
            java.lang.String r0 = r9.substring(r1, r0)
            r14.A05(r0)
        L_0x0216:
            java.lang.String r0 = "X-ABADR"
            java.lang.String r2 = r14.A03(r9, r0)
            if (r2 == 0) goto L_0x0240
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r0 = r6[r13]
            r1.append(r0)
            java.lang.String r0 = ";"
            r1.append(r0)
            int r0 = r2.lastIndexOf(r11)
            int r0 = r0 + 1
            java.lang.String r0 = r2.substring(r0)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r6[r13] = r0
        L_0x0240:
            if (r25 == 0) goto L_0x0255
            java.lang.String r1 = r14.A03(r9, r5)
        L_0x0246:
            if (r1 == 0) goto L_0x0255
            int r0 = r1.lastIndexOf(r11)
            int r0 = r0 + 1
            java.lang.String r0 = r1.substring(r0)
            r14.A05(r0)
        L_0x0255:
            r0 = r6[r12]
            java.util.Locale r3 = java.util.Locale.US
            java.lang.String r7 = r0.toUpperCase(r3)
            r2 = r6[r13]
            long r0 = r14.A05
            long r4 = java.lang.System.currentTimeMillis()
            long r4 = r4 - r20
            long r0 = r0 + r4
            r14.A05 = r0
            X.25L r0 = r14.A0G
            if (r0 == 0) goto L_0x0272
            X.4We r0 = r0.A03
            r0.A01 = r7
        L_0x0272:
            java.lang.String r15 = "ADR"
            boolean r0 = r7.equals(r15)
            if (r0 != 0) goto L_0x0520
            java.lang.String r0 = "ORG"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L_0x0520
            java.lang.String r0 = "N"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L_0x0520
            java.lang.String r0 = "AGENT"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x032f
            boolean r0 = r14 instanceof X.C63533Iy
            if (r0 == 0) goto L_0x0738
            java.lang.String r1 = "AGENT in vCard 3.0 is not supported yet."
            X.25G r0 = new X.25G
            r0.<init>(r1)
            throw r0
        L_0x029e:
            r25 = 1
            goto L_0x0216
        L_0x02a2:
            if (r3 <= r7) goto L_0x02c0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r8)
            r0 = r6[r13]
            r1.append(r0)
        L_0x02ae:
            r1.append(r11)
            r0 = r4[r7]
            r1.append(r0)
            int r7 = r7 + 1
            if (r7 < r3) goto L_0x02ae
            java.lang.String r0 = r1.toString()
            r6[r13] = r0
        L_0x02c0:
            java.lang.String r0 = "waid"
            boolean r0 = r9.contains(r0)
            if (r0 == 0) goto L_0x0327
            java.lang.String r0 = "type"
            boolean r0 = r9.contains(r0)
            if (r0 == 0) goto L_0x0306
            java.util.regex.Pattern r0 = X.AnonymousClass3BN.A0N
            java.util.regex.Matcher r1 = r0.matcher(r9)
            boolean r0 = r1.find()
            if (r0 == 0) goto L_0x02e7
            java.lang.String r0 = r1.group(r13)
            if (r0 == 0) goto L_0x02e7
        L_0x02e4:
            r14.A05(r0)
        L_0x02e7:
            java.util.regex.Pattern r0 = X.AnonymousClass3BN.A0O
            java.util.regex.Matcher r1 = r0.matcher(r9)
            boolean r0 = r1.find()
            if (r0 == 0) goto L_0x0255
            java.lang.String r2 = r1.group(r13)
            if (r2 == 0) goto L_0x0255
            X.25L r1 = r14.A0G
            if (r1 == 0) goto L_0x0317
            java.lang.String r0 = "waId"
            r1.A01 = r0
            r1.A00(r2)
            goto L_0x0317
        L_0x0306:
            java.lang.String r1 = r14.A03(r9, r5)
            if (r1 == 0) goto L_0x02e7
            int r0 = r1.lastIndexOf(r11)
            int r0 = r0 + 1
            java.lang.String r0 = r1.substring(r0)
            goto L_0x02e4
        L_0x0317:
            X.1ZT r0 = X.AnonymousClass1ZT.A03(r2)     // Catch:{ 1W4 -> 0x0323 }
            java.lang.String r0 = X.C24561Gk.A04(r0)     // Catch:{ 1W4 -> 0x0323 }
            r6[r13] = r0     // Catch:{ 1W4 -> 0x0323 }
            goto L_0x0255
        L_0x0323:
            r6[r13] = r5
            goto L_0x0255
        L_0x0327:
            java.lang.String r0 = "X-ABLabel"
            java.lang.String r1 = r14.A03(r9, r0)
            goto L_0x0246
        L_0x032f:
            boolean r1 = r14 instanceof X.C63533Iy
            if (r1 == 0) goto L_0x036c
            java.util.HashSet r0 = X.C63533Iy.A02
            boolean r0 = r0.contains(r7)
            if (r0 != 0) goto L_0x0356
            java.util.HashSet r0 = X.C63533Iy.A03
            boolean r0 = r0.contains(r7)
            if (r0 != 0) goto L_0x0356
            java.lang.String r0 = "X-"
            boolean r0 = r7.startsWith(r0)
            if (r0 != 0) goto L_0x0356
            java.util.HashSet r4 = r14.A0F
            boolean r0 = r4.contains(r7)
            if (r0 != 0) goto L_0x0356
            r4.add(r7)
        L_0x0356:
            r0 = r22
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0395
            boolean r0 = r2.equals(r10)
            if (r0 == 0) goto L_0x0740
            java.lang.String r1 = "This vCard has nested vCard data in it."
            X.5Kv r0 = new X.5Kv
            r0.<init>(r1)
            throw r0
        L_0x036c:
            java.util.HashSet r4 = X.AnonymousClass3BN.A0K
            java.lang.String r0 = r7.toUpperCase(r3)
            boolean r0 = r4.contains(r0)
            if (r0 != 0) goto L_0x0356
            java.lang.String r0 = "X-"
            boolean r0 = r7.startsWith(r0)
            if (r0 != 0) goto L_0x0356
            java.util.HashSet r4 = r14.A0F
            boolean r0 = r4.contains(r7)
            if (r0 != 0) goto L_0x0356
            r4.add(r7)
            java.lang.String r0 = "Property name unsupported by vCard 2.1: "
            java.lang.String r0 = X.C13680ns.A0h(r0, r7)
            com.whatsapp.util.Log.w((java.lang.String) r0)
            goto L_0x0356
        L_0x0395:
            java.lang.String r0 = "VERSION"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x03c6
            if (r1 == 0) goto L_0x03c3
            java.lang.String r4 = "3.0"
        L_0x03a1:
            boolean r0 = r2.equals(r4)
            if (r0 != 0) goto L_0x03c6
            java.lang.String r0 = "Incompatible version: "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r2)
            java.lang.String r0 = " != "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            X.5Kw r0 = new X.5Kw
            r0.<init>(r1)
            throw r0
        L_0x03c3:
            java.lang.String r4 = "2.1"
            goto L_0x03a1
        L_0x03c6:
            long r20 = java.lang.System.currentTimeMillis()
            java.lang.String r4 = r14.A0C
            java.lang.String r0 = "QUOTED-PRINTABLE"
            boolean r0 = r4.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0402
            long r4 = java.lang.System.currentTimeMillis()
            java.lang.String r2 = r14.A02(r2)
            X.25L r1 = r14.A0G
            if (r1 == 0) goto L_0x03eb
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0.add(r2)
            r1.A01(r0)
        L_0x03eb:
            long r0 = r14.A03
            long r2 = java.lang.System.currentTimeMillis()
            long r2 = r2 - r4
            long r0 = r0 + r2
            r14.A03 = r0
        L_0x03f5:
            long r0 = r14.A06
            long r2 = java.lang.System.currentTimeMillis()
            long r2 = r2 - r20
            long r0 = r0 + r2
            r14.A06 = r0
            goto L_0x05bb
        L_0x0402:
            java.lang.String r0 = "BASE64"
            boolean r0 = r4.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x049e
            java.lang.String r0 = "B"
            boolean r0 = r4.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x049e
            java.lang.String r0 = "7BIT"
            boolean r0 = r4.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x0444
            r0 = r27
            boolean r0 = r4.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x0444
            java.lang.String r3 = r4.toUpperCase(r3)
            java.lang.String r0 = "X-"
            boolean r0 = r3.startsWith(r0)
            if (r0 != 0) goto L_0x0444
            java.lang.String r0 = "The encoding unsupported by vCard spec: \""
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r0)
            r3.append(r4)
            java.lang.String r0 = "\"."
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x0444:
            long r7 = java.lang.System.currentTimeMillis()
            X.25L r0 = r14.A0G
            if (r0 == 0) goto L_0x0492
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            if (r2 == 0) goto L_0x0754
            if (r1 == 0) goto L_0x048a
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0o()
            int r3 = r2.length()
            r1 = 0
        L_0x045e:
            if (r1 >= r3) goto L_0x0486
            char r6 = r2.charAt(r1)
            r0 = 92
            if (r6 != r0) goto L_0x0482
            int r0 = r3 + -1
            if (r1 >= r0) goto L_0x0482
            int r1 = r1 + 1
            char r6 = r2.charAt(r1)
            r0 = 110(0x6e, float:1.54E-43)
            if (r6 == r0) goto L_0x047a
            r0 = 78
            if (r6 != r0) goto L_0x0482
        L_0x047a:
            java.lang.String r0 = "\r\n"
            r5.append(r0)
        L_0x047f:
            int r1 = r1 + 1
            goto L_0x045e
        L_0x0482:
            r5.append(r6)
            goto L_0x047f
        L_0x0486:
            java.lang.String r2 = r5.toString()
        L_0x048a:
            r4.add(r2)
            X.25L r0 = r14.A0G
            r0.A01(r4)
        L_0x0492:
            long r0 = r14.A02
            long r2 = java.lang.System.currentTimeMillis()
            long r2 = r2 - r7
            long r0 = r0 + r2
            r14.A02 = r0
            goto L_0x03f5
        L_0x049e:
            long r4 = java.lang.System.currentTimeMillis()
            if (r1 == 0) goto L_0x04a5
            goto L_0x04b9
        L_0x04a5:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()     // Catch:{ OutOfMemoryError -> 0x0505 }
        L_0x04a9:
            r1.append(r2)     // Catch:{ OutOfMemoryError -> 0x0505 }
            java.lang.String r2 = r14.A00()     // Catch:{ OutOfMemoryError -> 0x0505 }
            if (r2 == 0) goto L_0x04f5
            int r0 = r2.length()     // Catch:{ OutOfMemoryError -> 0x0505 }
            if (r0 != 0) goto L_0x04a9
            goto L_0x04e1
        L_0x04b9:
            r3 = r14
            X.3Iy r3 = (X.C63533Iy) r3     // Catch:{ OutOfMemoryError -> 0x0505 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()     // Catch:{ OutOfMemoryError -> 0x0505 }
        L_0x04c0:
            r1.append(r2)     // Catch:{ OutOfMemoryError -> 0x0505 }
            java.lang.String r2 = r3.A00()     // Catch:{ OutOfMemoryError -> 0x0505 }
            if (r2 == 0) goto L_0x04fd
            int r0 = r2.length()     // Catch:{ OutOfMemoryError -> 0x0505 }
            if (r0 == 0) goto L_0x04e1
            java.lang.String r0 = " "
            boolean r0 = r2.startsWith(r0)     // Catch:{ OutOfMemoryError -> 0x0505 }
            if (r0 != 0) goto L_0x04c0
            java.lang.String r0 = "\t"
            boolean r0 = r2.startsWith(r0)     // Catch:{ OutOfMemoryError -> 0x0505 }
            if (r0 != 0) goto L_0x04c0
            r3.A00 = r2     // Catch:{ OutOfMemoryError -> 0x0505 }
        L_0x04e1:
            java.lang.String r2 = r1.toString()     // Catch:{ OutOfMemoryError -> 0x0505 }
            X.25L r1 = r14.A0G     // Catch:{ OutOfMemoryError -> 0x0505 }
            if (r1 == 0) goto L_0x0514
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ OutOfMemoryError -> 0x0505 }
            r0.<init>()     // Catch:{ OutOfMemoryError -> 0x0505 }
            r0.add(r2)     // Catch:{ OutOfMemoryError -> 0x0505 }
            r1.A01(r0)     // Catch:{ OutOfMemoryError -> 0x0505 }
            goto L_0x0514
        L_0x04f5:
            java.lang.String r0 = "File ended during parsing BASE64 binary"
            X.25G r1 = new X.25G     // Catch:{ OutOfMemoryError -> 0x0505 }
            r1.<init>(r0)     // Catch:{ OutOfMemoryError -> 0x0505 }
            goto L_0x0504
        L_0x04fd:
            java.lang.String r0 = "File ended during parsing BASE64 binary"
            X.25G r1 = new X.25G     // Catch:{ OutOfMemoryError -> 0x0505 }
            r1.<init>(r0)     // Catch:{ OutOfMemoryError -> 0x0505 }
        L_0x0504:
            throw r1     // Catch:{ OutOfMemoryError -> 0x0505 }
        L_0x0505:
            r1 = move-exception
            java.lang.String r0 = "vcardparser/out-of-memory "
            com.whatsapp.util.Log.e(r0, r1)
            X.25L r1 = r14.A0G
            if (r1 == 0) goto L_0x0514
            r0 = 0
            r1.A01(r0)
        L_0x0514:
            long r0 = r14.A04
            long r2 = java.lang.System.currentTimeMillis()
            long r2 = r2 - r4
            long r0 = r0 + r2
            r14.A04 = r0
            goto L_0x03f5
        L_0x0520:
            long r20 = java.lang.System.currentTimeMillis()
            java.lang.String r1 = r14.A0C
            java.lang.String r0 = "QUOTED-PRINTABLE"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0532
            java.lang.String r2 = r14.A02(r2)
        L_0x0532:
            X.25L r0 = r14.A0G
            if (r0 == 0) goto L_0x05b0
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            int r6 = r2.length()
            r5 = 0
        L_0x0545:
            if (r5 >= r6) goto L_0x05a4
            char r4 = r2.charAt(r5)
            r0 = 92
            if (r4 != r0) goto L_0x058b
            int r0 = r6 + -1
            if (r5 >= r0) goto L_0x059c
            boolean r0 = r7.equals(r15)
            if (r0 != 0) goto L_0x059c
            int r3 = r5 + 1
            char r1 = r2.charAt(r3)
            boolean r0 = r14 instanceof X.C63533Iy
            if (r0 == 0) goto L_0x0576
            r0 = 110(0x6e, float:1.54E-43)
            if (r1 == r0) goto L_0x056b
            r0 = 78
            if (r1 != r0) goto L_0x0586
        L_0x056b:
            java.lang.String r0 = "\r\n"
        L_0x056d:
            if (r0 == 0) goto L_0x059c
            r9.append(r0)
            r5 = r3
        L_0x0573:
            int r5 = r5 + 1
            goto L_0x0545
        L_0x0576:
            r0 = 92
            if (r1 == r0) goto L_0x0586
            r0 = 59
            if (r1 == r0) goto L_0x0586
            r0 = 58
            if (r1 == r0) goto L_0x0586
            r0 = 44
            if (r1 != r0) goto L_0x059c
        L_0x0586:
            java.lang.String r0 = java.lang.String.valueOf(r1)
            goto L_0x056d
        L_0x058b:
            r0 = 59
            if (r4 != r0) goto L_0x059c
            java.lang.String r0 = r9.toString()
            r8.add(r0)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            goto L_0x0573
        L_0x059c:
            r9.append(r4)
            goto L_0x0573
        L_0x05a0:
            r14.A0E = r9
        L_0x05a2:
            r0 = 1
            goto L_0x05bc
        L_0x05a4:
            java.lang.String r0 = r9.toString()
            r8.add(r0)
            X.25L r0 = r14.A0G
            r0.A01(r8)
        L_0x05b0:
            long r0 = r14.A07
            long r2 = java.lang.System.currentTimeMillis()
            long r2 = r2 - r20
            long r0 = r0 + r2
            r14.A07 = r0
        L_0x05bb:
            r0 = 0
        L_0x05bc:
            X.25L r4 = r14.A0G
            if (r4 == 0) goto L_0x05e6
            if (r0 != 0) goto L_0x05ea
            long r5 = java.lang.System.currentTimeMillis()
            X.25N r0 = r4.A04
            java.util.ArrayList r1 = r0.A02
            X.4We r0 = r4.A03
            r1.add(r0)
            long r0 = r14.A00
            long r2 = java.lang.System.currentTimeMillis()
            long r2 = r2 - r5
            long r0 = r0 + r2
            r14.A00 = r0
            long r5 = java.lang.System.currentTimeMillis()
            X.4We r0 = new X.4We
            r0.<init>()
            r4.A03 = r0
            goto L_0x00e4
        L_0x05e6:
            if (r0 != 0) goto L_0x05ea
            goto L_0x00ee
        L_0x05ea:
            long r0 = r14.A08
            long r2 = java.lang.System.currentTimeMillis()
            long r2 = r2 - r18
            long r0 = r0 + r2
            r14.A08 = r0
            java.lang.String r0 = r14.A0E
            if (r0 == 0) goto L_0x0777
            r1 = 2
            java.lang.String[] r2 = r0.split(r11, r1)
            int r0 = r2.length
            if (r0 != r1) goto L_0x075c
            r0 = r2[r12]
            java.lang.String r1 = r0.trim()
            java.lang.String r0 = "END"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x075c
            r0 = r2[r13]
            java.lang.String r0 = r0.trim()
            boolean r0 = r0.equalsIgnoreCase(r10)
            if (r0 == 0) goto L_0x075c
            X.25L r2 = r14.A0G
            if (r2 == 0) goto L_0x005c
            long r4 = java.lang.System.currentTimeMillis()
            java.util.List r1 = r2.A02
            int r0 = r2.A00
            java.lang.Object r0 = r1.get(r0)
            X.25N r0 = (X.AnonymousClass25N) r0
            r0.A00 = r12
        L_0x062f:
            int r0 = r2.A00
            if (r0 <= 0) goto L_0x0641
            int r0 = r0 + -1
            r2.A00 = r0
            java.lang.Object r0 = r1.get(r0)
            X.25N r0 = (X.AnonymousClass25N) r0
            int r0 = r0.A00
            if (r0 != r13) goto L_0x062f
        L_0x0641:
            int r0 = r2.A00
            java.lang.Object r0 = r1.get(r0)
            X.25N r0 = (X.AnonymousClass25N) r0
            r2.A04 = r0
            long r2 = r14.A01
            long r0 = java.lang.System.currentTimeMillis()
            long r0 = r0 - r4
            long r2 = r2 + r0
            r14.A01 = r2
            goto L_0x005c
        L_0x0657:
            int r0 = r1.size()
            int r0 = r0 + -1
            java.lang.Object r5 = r1.get(r0)
            java.lang.String r5 = (java.lang.String) r5
            int r0 = r1.size()
            int r0 = r0 + -1
            r4 = 0
            java.util.List r9 = r1.subList(r4, r0)
            r8 = 99
            r1 = 198(0xc6, float:2.77E-43)
            int r0 = r9.size()
            int r0 = java.lang.Math.min(r1, r0)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r0)
            r7 = 0
            r3 = 0
        L_0x0681:
            int r0 = r9.size()
            if (r7 >= r0) goto L_0x06dc
            int r10 = r9.size()
            java.lang.Object r11 = r9.get(r7)
            java.lang.String r11 = (java.lang.String) r11
            int r13 = r11.length()
            r12 = 0
            if (r13 <= 0) goto L_0x06a9
            char r1 = r11.charAt(r4)
            r0 = 32
            if (r1 == r0) goto L_0x06a8
            char r1 = r11.charAt(r4)
            r0 = 9
            if (r1 != r0) goto L_0x06a9
        L_0x06a8:
            r12 = 1
        L_0x06a9:
            r2 = 1
            if (r12 != 0) goto L_0x06c6
            r1 = 58
            int r0 = r11.indexOf(r1)
            if (r0 >= 0) goto L_0x06d7
            if (r13 != 0) goto L_0x06c6
            int r0 = r7 + 1
            if (r0 >= r10) goto L_0x06c6
            java.lang.Object r0 = r9.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            int r0 = r0.indexOf(r1)
            if (r0 > 0) goto L_0x06d7
        L_0x06c6:
            java.lang.Object r1 = r9.get(r7)
            java.lang.String r1 = (java.lang.String) r1
            X.4JM r0 = new X.4JM
            r0.<init>(r1, r2)
            r6.add(r0)
            int r7 = r7 + 1
            goto L_0x0681
        L_0x06d7:
            r2 = 0
            int r3 = r3 + 1
            if (r3 <= r8) goto L_0x06c6
        L_0x06dc:
            int r7 = r6.size()
            r3 = 0
        L_0x06e1:
            if (r3 >= r7) goto L_0x0720
            java.lang.Object r8 = r6.get(r3)
            X.4JM r8 = (X.AnonymousClass4JM) r8
            java.lang.String r2 = r8.A00
            int r0 = r2.length()
            if (r0 <= 0) goto L_0x0704
            char r1 = r2.charAt(r4)
            r0 = 32
            if (r1 == r0) goto L_0x0701
            char r1 = r2.charAt(r4)
            r0 = 9
            if (r1 != r0) goto L_0x0704
        L_0x0701:
            int r3 = r3 + 1
            goto L_0x06e1
        L_0x0704:
            boolean r0 = r8.A01
            if (r0 == 0) goto L_0x0701
            java.lang.String r1 = " "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r1 = 1
            X.4JM r0 = new X.4JM
            r0.<init>(r2, r1)
            r6.set(r3, r0)
            goto L_0x0701
        L_0x0720:
            X.4JM r0 = new X.4JM
            r0.<init>(r5, r4)
            r6.add(r0)
            goto L_0x0048
        L_0x072a:
            X.3Iy r14 = new X.3Iy
            r14.<init>()
            goto L_0x003d
        L_0x0731:
            int r4 = r4 + 1
            goto L_0x000c
        L_0x0735:
            r0 = r3
            goto L_0x0032
        L_0x0738:
            java.lang.String r1 = "AGENT Property is not supported."
            X.25G r0 = new X.25G
            r0.<init>(r1)
            throw r0
        L_0x0740:
            java.lang.String r1 = "Unknown BEGIN type: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r1 = r0.toString()
            X.25G r0 = new X.25G
            r0.<init>(r1)
            throw r0
        L_0x0754:
            java.lang.String r1 = "null property value is not supported"
            X.25G r0 = new X.25G
            r0.<init>(r1)
            throw r0
        L_0x075c:
            java.lang.String r0 = "END:VCARD != \""
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = r14.A0E
            r1.append(r0)
            java.lang.String r0 = "\""
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            X.25G r0 = new X.25G
            r0.<init>(r1)
            throw r0
        L_0x0777:
            java.lang.String r1 = "Attempted to split null line"
            X.25G r0 = new X.25G
            r0.<init>(r1)
            throw r0
        L_0x077f:
            java.lang.String r0 = "Invalid line: \""
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r9)
            java.lang.String r0 = "\""
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            X.25G r0 = new X.25G
            r0.<init>(r1)
            throw r0
        L_0x0798:
            java.lang.String r0 = "Expected String \"BEGIN:VCARD\" did not come (Instead, \""
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r2)
            java.lang.String r0 = "\" came)"
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            X.25G r0 = new X.25G
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass25M.A01(java.util.List, X.25L):void");
    }
}
