package com.google.gson.stream;

import com.google.gson.internal.JsonReaderInternalAccess;
import d.a;
import java.io.Closeable;
import java.io.Reader;
import java.util.Arrays;
import org.apache.commons.io.FilenameUtils;

/* compiled from: XFMFile */
public class JsonReader implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    public final Reader f441a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f442b = false;

    /* renamed from: c  reason: collision with root package name */
    public final char[] f443c = new char[1024];

    /* renamed from: d  reason: collision with root package name */
    public int f444d = 0;

    /* renamed from: e  reason: collision with root package name */
    public int f445e = 0;

    /* renamed from: f  reason: collision with root package name */
    public int f446f = 0;

    /* renamed from: g  reason: collision with root package name */
    public int f447g = 0;

    /* renamed from: h  reason: collision with root package name */
    public int f448h = 0;

    /* renamed from: i  reason: collision with root package name */
    public long f449i;

    /* renamed from: j  reason: collision with root package name */
    public int f450j;

    /* renamed from: k  reason: collision with root package name */
    public String f451k;

    /* renamed from: l  reason: collision with root package name */
    public int[] f452l;

    /* renamed from: m  reason: collision with root package name */
    public int f453m;

    /* renamed from: n  reason: collision with root package name */
    public String[] f454n;

    /* renamed from: o  reason: collision with root package name */
    public int[] f455o;

    static {
        JsonReaderInternalAccess.INSTANCE = new a();
    }

    public JsonReader(Reader reader) {
        int[] iArr = new int[32];
        this.f452l = iArr;
        this.f453m = 0 + 1;
        iArr[0] = 6;
        this.f454n = new String[32];
        this.f455o = new int[32];
        if (reader != null) {
            this.f441a = reader;
            return;
        }
        throw new NullPointerException("in == null");
    }

    public final void a() {
        if (!this.f442b) {
            n("Use JsonReader.setLenient(true) to accept malformed JSON");
            throw null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0211, code lost:
        if (e(r5) != false) goto L_0x026c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0213, code lost:
        r1 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0214, code lost:
        if (r11 != 2) goto L_0x0237;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0216, code lost:
        if (r13 == false) goto L_0x0236;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x021c, code lost:
        if (r7 != Long.MIN_VALUE) goto L_0x0220;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x021e, code lost:
        if (r12 == false) goto L_0x0236;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0222, code lost:
        if (r7 != 0) goto L_0x0226;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0224, code lost:
        if (r12 != false) goto L_0x0236;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0226, code lost:
        if (r12 == false) goto L_0x0229;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0229, code lost:
        r7 = -r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x022a, code lost:
        r0.f449i = r7;
        r0.f444d += r3;
        r8 = 15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0236, code lost:
        r1 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0237, code lost:
        if (r11 == r1) goto L_0x023f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x023a, code lost:
        if (r11 == 4) goto L_0x023f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x023d, code lost:
        if (r11 != 7) goto L_0x026c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x023f, code lost:
        r0.f450j = r3;
        r8 = 16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x0245, code lost:
        r0.f448h = r8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0180 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0181  */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x02b3  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00ed  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int b() {
        /*
            r19 = this;
            r0 = r19
            int[] r1 = r0.f452l
            int r2 = r0.f453m
            int r3 = r2 + -1
            r3 = r1[r3]
            r9 = 0
            r10 = 39
            r11 = 93
            r12 = 59
            r13 = 44
            r14 = 6
            char[] r15 = r0.f443c
            r6 = 3
            r5 = 4
            r8 = 2
            r7 = 5
            r4 = 1
            if (r3 != r4) goto L_0x0025
            int r2 = r2 - r4
            r1[r2] = r8
        L_0x0020:
            r8 = 10
            r9 = 7
            goto L_0x00c3
        L_0x0025:
            if (r3 != r8) goto L_0x003e
            int r1 = r0.g(r4)
            if (r1 == r13) goto L_0x0020
            if (r1 == r12) goto L_0x003a
            if (r1 != r11) goto L_0x0034
            r0.f448h = r5
            return r5
        L_0x0034:
            java.lang.String r1 = "Unterminated array"
            r0.n(r1)
            throw r9
        L_0x003a:
            r19.a()
            goto L_0x0020
        L_0x003e:
            r8 = 125(0x7d, float:1.75E-43)
            if (r3 == r6) goto L_0x02be
            if (r3 != r7) goto L_0x0046
            goto L_0x02be
        L_0x0046:
            if (r3 != r5) goto L_0x0078
            int r2 = r2 - r4
            r1[r2] = r7
            int r1 = r0.g(r4)
            r2 = 58
            if (r1 == r2) goto L_0x0020
            r2 = 61
            if (r1 != r2) goto L_0x0072
            r19.a()
            int r1 = r0.f444d
            int r2 = r0.f445e
            if (r1 < r2) goto L_0x0066
            boolean r1 = r0.c(r4)
            if (r1 == 0) goto L_0x0020
        L_0x0066:
            int r1 = r0.f444d
            char r2 = r15[r1]
            r8 = 62
            if (r2 != r8) goto L_0x0020
            int r1 = r1 + r4
            r0.f444d = r1
            goto L_0x0020
        L_0x0072:
            java.lang.String r1 = "Expected ':'"
            r0.n(r1)
            throw r9
        L_0x0078:
            if (r3 != r14) goto L_0x00c7
            boolean r1 = r0.f442b
            if (r1 == 0) goto L_0x00b9
            r0.g(r4)
            int r1 = r0.f444d
            int r1 = r1 - r4
            r0.f444d = r1
            int r1 = r1 + r7
            int r2 = r0.f445e
            if (r1 <= r2) goto L_0x0092
            boolean r1 = r0.c(r7)
            if (r1 != 0) goto L_0x0092
            goto L_0x00b9
        L_0x0092:
            int r1 = r0.f444d
            char r2 = r15[r1]
            r9 = 41
            if (r2 != r9) goto L_0x00b9
            int r2 = r1 + 1
            char r2 = r15[r2]
            if (r2 != r11) goto L_0x00b9
            int r2 = r1 + 2
            char r2 = r15[r2]
            if (r2 != r8) goto L_0x00b9
            int r2 = r1 + 3
            char r2 = r15[r2]
            if (r2 != r10) goto L_0x00b9
            int r2 = r1 + 4
            char r2 = r15[r2]
            r8 = 10
            if (r2 == r8) goto L_0x00b5
            goto L_0x00bb
        L_0x00b5:
            int r1 = r1 + r7
            r0.f444d = r1
            goto L_0x00bb
        L_0x00b9:
            r8 = 10
        L_0x00bb:
            int[] r1 = r0.f452l
            int r2 = r0.f453m
            int r2 = r2 - r4
            r9 = 7
            r1[r2] = r9
        L_0x00c3:
            r1 = 0
        L_0x00c4:
            r2 = 8
            goto L_0x00e5
        L_0x00c7:
            r8 = 10
            r9 = 7
            r1 = 0
            if (r3 != r9) goto L_0x00e1
            int r2 = r0.g(r1)
            r9 = -1
            if (r2 != r9) goto L_0x00d8
            r4 = 17
            goto L_0x0315
        L_0x00d8:
            r19.a()
            int r2 = r0.f444d
            int r2 = r2 - r4
            r0.f444d = r2
            goto L_0x00c4
        L_0x00e1:
            r2 = 8
            if (r3 == r2) goto L_0x02b6
        L_0x00e5:
            int r9 = r0.g(r4)
            r1 = 34
            if (r9 == r1) goto L_0x02b3
            if (r9 == r10) goto L_0x02ad
            if (r9 == r13) goto L_0x0295
            if (r9 == r12) goto L_0x0295
            r1 = 91
            if (r9 == r1) goto L_0x0292
            if (r9 == r11) goto L_0x028c
            r1 = 123(0x7b, float:1.72E-43)
            if (r9 == r1) goto L_0x0288
            int r1 = r0.f444d
            int r1 = r1 - r4
            r0.f444d = r1
            char r1 = r15[r1]
            r2 = 116(0x74, float:1.63E-43)
            if (r1 == r2) goto L_0x012a
            r2 = 84
            if (r1 != r2) goto L_0x010d
            goto L_0x012a
        L_0x010d:
            r2 = 102(0x66, float:1.43E-43)
            if (r1 == r2) goto L_0x0124
            r2 = 70
            if (r1 != r2) goto L_0x0116
            goto L_0x0124
        L_0x0116:
            r2 = 110(0x6e, float:1.54E-43)
            if (r1 == r2) goto L_0x011e
            r2 = 78
            if (r1 != r2) goto L_0x0175
        L_0x011e:
            java.lang.String r1 = "null"
            java.lang.String r2 = "NULL"
            r9 = 7
            goto L_0x012f
        L_0x0124:
            java.lang.String r1 = "false"
            java.lang.String r2 = "FALSE"
            r9 = 6
            goto L_0x012f
        L_0x012a:
            java.lang.String r1 = "true"
            java.lang.String r2 = "TRUE"
            r9 = 5
        L_0x012f:
            int r3 = r1.length()
            r10 = 1
        L_0x0134:
            if (r10 >= r3) goto L_0x015b
            int r11 = r0.f444d
            int r11 = r11 + r10
            int r12 = r0.f445e
            if (r11 < r12) goto L_0x0146
            int r11 = r10 + 1
            boolean r11 = r0.c(r11)
            if (r11 != 0) goto L_0x0146
            goto L_0x0175
        L_0x0146:
            int r11 = r0.f444d
            int r11 = r11 + r10
            char r11 = r15[r11]
            char r12 = r1.charAt(r10)
            if (r11 == r12) goto L_0x0158
            char r12 = r2.charAt(r10)
            if (r11 == r12) goto L_0x0158
            goto L_0x0175
        L_0x0158:
            int r10 = r10 + 1
            goto L_0x0134
        L_0x015b:
            int r1 = r0.f444d
            int r1 = r1 + r3
            int r2 = r0.f445e
            if (r1 < r2) goto L_0x016a
            int r1 = r3 + 1
            boolean r1 = r0.c(r1)
            if (r1 == 0) goto L_0x0177
        L_0x016a:
            int r1 = r0.f444d
            int r1 = r1 + r3
            char r1 = r15[r1]
            boolean r1 = r0.e(r1)
            if (r1 == 0) goto L_0x0177
        L_0x0175:
            r9 = 0
            goto L_0x017e
        L_0x0177:
            int r1 = r0.f444d
            int r1 = r1 + r3
            r0.f444d = r1
            r0.f448h = r9
        L_0x017e:
            if (r9 == 0) goto L_0x0181
            return r9
        L_0x0181:
            int r1 = r0.f444d
            int r2 = r0.f445e
            r9 = 0
            r7 = r9
            r3 = 0
            r11 = 0
            r12 = 0
            r13 = 1
        L_0x018c:
            int r5 = r1 + r3
            if (r5 != r2) goto L_0x01a3
            int r1 = r15.length
            if (r3 != r1) goto L_0x0195
            goto L_0x026c
        L_0x0195:
            int r1 = r3 + 1
            boolean r1 = r0.c(r1)
            if (r1 != 0) goto L_0x019f
            goto L_0x0213
        L_0x019f:
            int r1 = r0.f444d
            int r2 = r0.f445e
        L_0x01a3:
            int r5 = r1 + r3
            char r5 = r15[r5]
            r14 = 43
            if (r5 == r14) goto L_0x0262
            r14 = 69
            if (r5 == r14) goto L_0x0259
            r14 = 101(0x65, float:1.42E-43)
            if (r5 == r14) goto L_0x0259
            r14 = 45
            if (r5 == r14) goto L_0x024e
            r14 = 46
            if (r5 == r14) goto L_0x0248
            r14 = 48
            if (r5 < r14) goto L_0x020d
            r14 = 57
            if (r5 <= r14) goto L_0x01c4
            goto L_0x020d
        L_0x01c4:
            if (r11 == r4) goto L_0x0206
            if (r11 != 0) goto L_0x01c9
            goto L_0x0206
        L_0x01c9:
            r14 = 2
            if (r11 != r14) goto L_0x01f5
            int r14 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r14 != 0) goto L_0x01d2
            goto L_0x026c
        L_0x01d2:
            r16 = 10
            long r16 = r16 * r7
            int r5 = r5 + -48
            long r4 = (long) r5
            long r16 = r16 - r4
            r4 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r18 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r18 > 0) goto L_0x01ed
            if (r18 != 0) goto L_0x01eb
            int r4 = (r16 > r7 ? 1 : (r16 == r7 ? 0 : -1))
            if (r4 >= 0) goto L_0x01eb
            goto L_0x01ed
        L_0x01eb:
            r4 = 0
            goto L_0x01ee
        L_0x01ed:
            r4 = 1
        L_0x01ee:
            r4 = r4 & r13
            r13 = r4
            r7 = r16
            r4 = 6
            goto L_0x0266
        L_0x01f5:
            if (r11 != r6) goto L_0x01fb
            r4 = 6
            r11 = 4
            goto L_0x0266
        L_0x01fb:
            r4 = 5
            if (r11 == r4) goto L_0x0202
            r4 = 6
            if (r11 != r4) goto L_0x0266
            goto L_0x0203
        L_0x0202:
            r4 = 6
        L_0x0203:
            r11 = 7
            goto L_0x0266
        L_0x0206:
            r4 = 6
            int r5 = r5 + -48
            int r5 = -r5
            long r7 = (long) r5
            r11 = 2
            goto L_0x0266
        L_0x020d:
            boolean r1 = r0.e(r5)
            if (r1 != 0) goto L_0x026c
        L_0x0213:
            r1 = 2
            if (r11 != r1) goto L_0x0237
            if (r13 == 0) goto L_0x0236
            r1 = -9223372036854775808
            int r4 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r4 != 0) goto L_0x0220
            if (r12 == 0) goto L_0x0236
        L_0x0220:
            int r1 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r1 != 0) goto L_0x0226
            if (r12 != 0) goto L_0x0236
        L_0x0226:
            if (r12 == 0) goto L_0x0229
            goto L_0x022a
        L_0x0229:
            long r7 = -r7
        L_0x022a:
            r0.f449i = r7
            int r1 = r0.f444d
            int r1 = r1 + r3
            r0.f444d = r1
            r1 = 15
            r8 = 15
            goto L_0x0245
        L_0x0236:
            r1 = 2
        L_0x0237:
            if (r11 == r1) goto L_0x023f
            r1 = 4
            if (r11 == r1) goto L_0x023f
            r5 = 7
            if (r11 != r5) goto L_0x026c
        L_0x023f:
            r0.f450j = r3
            r1 = 16
            r8 = 16
        L_0x0245:
            r0.f448h = r8
            goto L_0x026d
        L_0x0248:
            r4 = 2
            r5 = 7
            if (r11 != r4) goto L_0x026c
            r11 = 3
            goto L_0x0266
        L_0x024e:
            r4 = 2
            r5 = 7
            if (r11 != 0) goto L_0x0255
            r11 = 1
            r12 = 1
            goto L_0x0266
        L_0x0255:
            r5 = 5
            if (r11 != r5) goto L_0x026c
            goto L_0x0265
        L_0x0259:
            r4 = 2
            r5 = 5
            if (r11 == r4) goto L_0x0260
            r4 = 4
            if (r11 != r4) goto L_0x026c
        L_0x0260:
            r11 = 5
            goto L_0x0266
        L_0x0262:
            r5 = 5
            if (r11 != r5) goto L_0x026c
        L_0x0265:
            r11 = 6
        L_0x0266:
            int r3 = r3 + 1
            r4 = 1
            r14 = 6
            goto L_0x018c
        L_0x026c:
            r8 = 0
        L_0x026d:
            if (r8 == 0) goto L_0x0270
            return r8
        L_0x0270:
            int r1 = r0.f444d
            char r1 = r15[r1]
            boolean r1 = r0.e(r1)
            if (r1 == 0) goto L_0x0281
            r19.a()
            r4 = 10
            goto L_0x0315
        L_0x0281:
            java.lang.String r1 = "Expected value"
            r0.n(r1)
            r1 = 0
            throw r1
        L_0x0288:
            r1 = 1
            r0.f448h = r1
            return r1
        L_0x028c:
            r1 = 1
            if (r3 != r1) goto L_0x0296
            r4 = 4
            goto L_0x0315
        L_0x0292:
            r0.f448h = r6
            return r6
        L_0x0295:
            r1 = 1
        L_0x0296:
            if (r3 == r1) goto L_0x02a3
            r2 = 2
            if (r3 != r2) goto L_0x029c
            goto L_0x02a3
        L_0x029c:
            java.lang.String r1 = "Unexpected value"
            r0.n(r1)
            r1 = 0
            throw r1
        L_0x02a3:
            r19.a()
            int r2 = r0.f444d
            int r2 = r2 - r1
            r0.f444d = r2
            r4 = 7
            goto L_0x0315
        L_0x02ad:
            r19.a()
            r4 = 8
            goto L_0x0315
        L_0x02b3:
            r4 = 9
            goto L_0x0315
        L_0x02b6:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "JsonReader is closed"
            r1.<init>(r2)
            throw r1
        L_0x02be:
            int r2 = r2 - r4
            r5 = 4
            r1[r2] = r5
            r1 = 5
            if (r3 != r1) goto L_0x02db
            int r1 = r0.g(r4)
            if (r1 == r13) goto L_0x02db
            if (r1 == r12) goto L_0x02d8
            if (r1 != r8) goto L_0x02d1
            r4 = 2
            goto L_0x0315
        L_0x02d1:
            java.lang.String r1 = "Unterminated object"
            r0.n(r1)
            r1 = 0
            throw r1
        L_0x02d8:
            r19.a()
        L_0x02db:
            r1 = 1
            int r2 = r0.g(r1)
            r4 = 34
            if (r2 == r4) goto L_0x0313
            if (r2 == r10) goto L_0x030d
            java.lang.String r4 = "Expected name"
            if (r2 == r8) goto L_0x0301
            r19.a()
            int r3 = r0.f444d
            int r3 = r3 - r1
            r0.f444d = r3
            char r1 = (char) r2
            boolean r1 = r0.e(r1)
            if (r1 == 0) goto L_0x02fc
            r4 = 14
            goto L_0x0315
        L_0x02fc:
            r0.n(r4)
            r1 = 0
            throw r1
        L_0x0301:
            r1 = 0
            r2 = 5
            if (r3 == r2) goto L_0x0309
            r2 = 2
            r0.f448h = r2
            return r2
        L_0x0309:
            r0.n(r4)
            throw r1
        L_0x030d:
            r19.a()
            r4 = 12
            goto L_0x0315
        L_0x0313:
            r4 = 13
        L_0x0315:
            r0.f448h = r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.stream.JsonReader.b():int");
    }

    public void beginArray() {
        int i2 = this.f448h;
        if (i2 == 0) {
            i2 = b();
        }
        if (i2 == 3) {
            j(1);
            this.f455o[this.f453m - 1] = 0;
            this.f448h = 0;
            return;
        }
        throw new IllegalStateException("Expected BEGIN_ARRAY but was " + peek() + f());
    }

    public void beginObject() {
        int i2 = this.f448h;
        if (i2 == 0) {
            i2 = b();
        }
        if (i2 == 1) {
            j(3);
            this.f448h = 0;
            return;
        }
        throw new IllegalStateException("Expected BEGIN_OBJECT but was " + peek() + f());
    }

    public final boolean c(int i2) {
        int i3;
        int i4;
        int i5 = this.f447g;
        int i6 = this.f444d;
        this.f447g = i5 - i6;
        int i7 = this.f445e;
        char[] cArr = this.f443c;
        if (i7 != i6) {
            int i8 = i7 - i6;
            this.f445e = i8;
            System.arraycopy(cArr, i6, cArr, 0, i8);
        } else {
            this.f445e = 0;
        }
        this.f444d = 0;
        do {
            int i9 = this.f445e;
            int read = this.f441a.read(cArr, i9, cArr.length - i9);
            if (read == -1) {
                return false;
            }
            i3 = this.f445e + read;
            this.f445e = i3;
            if (this.f446f == 0 && (i4 = this.f447g) == 0 && i3 > 0 && cArr[0] == 65279) {
                this.f444d++;
                this.f447g = i4 + 1;
                i2++;
                continue;
            }
        } while (i3 < i2);
        return true;
    }

    public void close() {
        this.f448h = 0;
        this.f452l[0] = 8;
        this.f453m = 1;
        this.f441a.close();
    }

    public final String d(boolean z2) {
        StringBuilder sb = new StringBuilder("$");
        int i2 = 0;
        while (true) {
            int i3 = this.f453m;
            if (i2 >= i3) {
                return sb.toString();
            }
            int i4 = this.f452l[i2];
            if (i4 == 1 || i4 == 2) {
                int i5 = this.f455o[i2];
                if (z2 && i5 > 0 && i2 == i3 - 1) {
                    i5--;
                }
                sb.append('[');
                sb.append(i5);
                sb.append(']');
            } else if (i4 == 3 || i4 == 4 || i4 == 5) {
                sb.append(FilenameUtils.EXTENSION_SEPARATOR);
                String str = this.f454n[i2];
                if (str != null) {
                    sb.append(str);
                }
            }
            i2++;
        }
    }

    public final boolean e(char c2) {
        if (c2 == 9 || c2 == 10 || c2 == 12 || c2 == 13 || c2 == ' ') {
            return false;
        }
        if (c2 != '#') {
            if (c2 == ',') {
                return false;
            }
            if (!(c2 == '/' || c2 == '=')) {
                if (c2 == '{' || c2 == '}' || c2 == ':') {
                    return false;
                }
                if (c2 != ';') {
                    switch (c2) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        a();
        return false;
    }

    public void endArray() {
        int i2 = this.f448h;
        if (i2 == 0) {
            i2 = b();
        }
        if (i2 == 4) {
            int i3 = this.f453m - 1;
            this.f453m = i3;
            int[] iArr = this.f455o;
            int i4 = i3 - 1;
            iArr[i4] = iArr[i4] + 1;
            this.f448h = 0;
            return;
        }
        throw new IllegalStateException("Expected END_ARRAY but was " + peek() + f());
    }

    public void endObject() {
        int i2 = this.f448h;
        if (i2 == 0) {
            i2 = b();
        }
        if (i2 == 2) {
            int i3 = this.f453m - 1;
            this.f453m = i3;
            this.f454n[i3] = null;
            int[] iArr = this.f455o;
            int i4 = i3 - 1;
            iArr[i4] = iArr[i4] + 1;
            this.f448h = 0;
            return;
        }
        throw new IllegalStateException("Expected END_OBJECT but was " + peek() + f());
    }

    public final String f() {
        return " at line " + (this.f446f + 1) + " column " + ((this.f444d - this.f447g) + 1) + " path " + getPath();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0052, code lost:
        if (r0 != '/') goto L_0x00c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0054, code lost:
        r9.f444d = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0057, code lost:
        if (r3 != r1) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0059, code lost:
        r9.f444d = r3 - 1;
        r1 = c(2);
        r9.f444d++;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0066, code lost:
        if (r1 != false) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0068, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0069, code lost:
        a();
        r1 = r9.f444d;
        r3 = r4[r1];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0072, code lost:
        if (r3 == '*') goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0074, code lost:
        if (r3 == '/') goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0076, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0077, code lost:
        r9.f444d = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x007c, code lost:
        r9.f444d = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0080, code lost:
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0086, code lost:
        if ((r9.f444d + 2) <= r9.f445e) goto L_0x0091;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x008c, code lost:
        if (c(2) == false) goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008f, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0091, code lost:
        r0 = r9.f444d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0095, code lost:
        if (r4[r0] != 10) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0097, code lost:
        r9.f446f++;
        r9.f447g = r0 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a1, code lost:
        if (r3 >= 2) goto L_0x00b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ae, code lost:
        if (r4[r9.f444d + r3] == "*/".charAt(r3)) goto L_0x00b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00b0, code lost:
        r9.f444d++;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00b6, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00b9, code lost:
        if (r2 == false) goto L_0x00c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00c0, code lost:
        n("Unterminated comment");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00c6, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00c7, code lost:
        r9.f444d = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00cb, code lost:
        if (r0 != '#') goto L_0x00d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00cd, code lost:
        a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00d5, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int g(boolean r10) {
        /*
            r9 = this;
        L_0x0000:
            int r0 = r9.f444d
        L_0x0002:
            int r1 = r9.f445e
        L_0x0004:
            r2 = 1
            if (r0 != r1) goto L_0x002f
            r9.f444d = r0
            boolean r0 = r9.c(r2)
            if (r0 != 0) goto L_0x002b
            if (r10 != 0) goto L_0x0013
            r10 = -1
            return r10
        L_0x0013:
            java.io.EOFException r10 = new java.io.EOFException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "End of input"
            r0.<init>(r1)
            java.lang.String r1 = r9.f()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r10.<init>(r0)
            throw r10
        L_0x002b:
            int r0 = r9.f444d
            int r1 = r9.f445e
        L_0x002f:
            int r3 = r0 + 1
            char[] r4 = r9.f443c
            char r0 = r4[r0]
            r5 = 10
            if (r0 != r5) goto L_0x0042
            int r0 = r9.f446f
            int r0 = r0 + r2
            r9.f446f = r0
            r9.f447g = r3
            goto L_0x00d6
        L_0x0042:
            r6 = 32
            if (r0 == r6) goto L_0x00d6
            r6 = 13
            if (r0 == r6) goto L_0x00d6
            r6 = 9
            if (r0 != r6) goto L_0x0050
            goto L_0x00d6
        L_0x0050:
            r6 = 47
            if (r0 != r6) goto L_0x00c7
            r9.f444d = r3
            r7 = 2
            if (r3 != r1) goto L_0x0069
            int r3 = r3 + -1
            r9.f444d = r3
            boolean r1 = r9.c(r7)
            int r3 = r9.f444d
            int r3 = r3 + r2
            r9.f444d = r3
            if (r1 != 0) goto L_0x0069
            return r0
        L_0x0069:
            r9.a()
            int r1 = r9.f444d
            char r3 = r4[r1]
            r8 = 42
            if (r3 == r8) goto L_0x007c
            if (r3 == r6) goto L_0x0077
            return r0
        L_0x0077:
            int r1 = r1 + 1
            r9.f444d = r1
            goto L_0x00d0
        L_0x007c:
            int r1 = r1 + 1
            r9.f444d = r1
        L_0x0080:
            int r0 = r9.f444d
            int r0 = r0 + r7
            int r1 = r9.f445e
            r3 = 0
            if (r0 <= r1) goto L_0x0091
            boolean r0 = r9.c(r7)
            if (r0 == 0) goto L_0x008f
            goto L_0x0091
        L_0x008f:
            r2 = 0
            goto L_0x00b9
        L_0x0091:
            int r0 = r9.f444d
            char r1 = r4[r0]
            if (r1 != r5) goto L_0x00a1
            int r1 = r9.f446f
            int r1 = r1 + r2
            r9.f446f = r1
            int r0 = r0 + 1
            r9.f447g = r0
            goto L_0x00b0
        L_0x00a1:
            if (r3 >= r7) goto L_0x00b9
            int r0 = r9.f444d
            int r0 = r0 + r3
            char r0 = r4[r0]
            java.lang.String r1 = "*/"
            char r1 = r1.charAt(r3)
            if (r0 == r1) goto L_0x00b6
        L_0x00b0:
            int r0 = r9.f444d
            int r0 = r0 + r2
            r9.f444d = r0
            goto L_0x0080
        L_0x00b6:
            int r3 = r3 + 1
            goto L_0x00a1
        L_0x00b9:
            if (r2 == 0) goto L_0x00c0
            int r0 = r9.f444d
            int r0 = r0 + r7
            goto L_0x0002
        L_0x00c0:
            java.lang.String r10 = "Unterminated comment"
            r9.n(r10)
            r10 = 0
            throw r10
        L_0x00c7:
            r9.f444d = r3
            r1 = 35
            if (r0 != r1) goto L_0x00d5
            r9.a()
        L_0x00d0:
            r9.m()
            goto L_0x0000
        L_0x00d5:
            return r0
        L_0x00d6:
            r0 = r3
            goto L_0x0004
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.stream.JsonReader.g(boolean):int");
    }

    public String getPath() {
        return d(false);
    }

    public String getPreviousPath() {
        return d(true);
    }

    public final String h(char c2) {
        StringBuilder sb = null;
        while (true) {
            int i2 = this.f444d;
            int i3 = this.f445e;
            int i4 = i2;
            while (true) {
                char[] cArr = this.f443c;
                if (i4 < i3) {
                    int i5 = i4 + 1;
                    char c3 = cArr[i4];
                    if (c3 == c2) {
                        this.f444d = i5;
                        int i6 = (i5 - i2) - 1;
                        if (sb == null) {
                            return new String(cArr, i2, i6);
                        }
                        sb.append(cArr, i2, i6);
                        return sb.toString();
                    } else if (c3 == '\\') {
                        this.f444d = i5;
                        int i7 = (i5 - i2) - 1;
                        if (sb == null) {
                            sb = new StringBuilder(Math.max((i7 + 1) * 2, 16));
                        }
                        sb.append(cArr, i2, i7);
                        sb.append(k());
                    } else {
                        if (c3 == 10) {
                            this.f446f++;
                            this.f447g = i5;
                        }
                        i4 = i5;
                    }
                } else {
                    if (sb == null) {
                        sb = new StringBuilder(Math.max((i4 - i2) * 2, 16));
                    }
                    sb.append(cArr, i2, i4 - i2);
                    this.f444d = i4;
                    if (!c(1)) {
                        n("Unterminated string");
                        throw null;
                    }
                }
            }
        }
    }

    public boolean hasNext() {
        int i2 = this.f448h;
        if (i2 == 0) {
            i2 = b();
        }
        return (i2 == 2 || i2 == 4 || i2 == 17) ? false : true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x004a, code lost:
        a();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String i() {
        /*
            r7 = this;
            r0 = 0
            r1 = 0
        L_0x0002:
            r2 = 0
        L_0x0003:
            int r3 = r7.f444d
            int r4 = r3 + r2
            int r5 = r7.f445e
            char[] r6 = r7.f443c
            if (r4 >= r5) goto L_0x004e
            int r3 = r3 + r2
            char r3 = r6[r3]
            r4 = 9
            if (r3 == r4) goto L_0x005a
            r4 = 10
            if (r3 == r4) goto L_0x005a
            r4 = 12
            if (r3 == r4) goto L_0x005a
            r4 = 13
            if (r3 == r4) goto L_0x005a
            r4 = 32
            if (r3 == r4) goto L_0x005a
            r4 = 35
            if (r3 == r4) goto L_0x004a
            r4 = 44
            if (r3 == r4) goto L_0x005a
            r4 = 47
            if (r3 == r4) goto L_0x004a
            r4 = 61
            if (r3 == r4) goto L_0x004a
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L_0x005a
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L_0x005a
            r4 = 58
            if (r3 == r4) goto L_0x005a
            r4 = 59
            if (r3 == r4) goto L_0x004a
            switch(r3) {
                case 91: goto L_0x005a;
                case 92: goto L_0x004a;
                case 93: goto L_0x005a;
                default: goto L_0x0047;
            }
        L_0x0047:
            int r2 = r2 + 1
            goto L_0x0003
        L_0x004a:
            r7.a()
            goto L_0x005a
        L_0x004e:
            int r3 = r6.length
            if (r2 >= r3) goto L_0x005c
            int r3 = r2 + 1
            boolean r3 = r7.c(r3)
            if (r3 == 0) goto L_0x005a
            goto L_0x0003
        L_0x005a:
            r1 = r2
            goto L_0x007a
        L_0x005c:
            if (r0 != 0) goto L_0x0069
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r0.<init>(r3)
        L_0x0069:
            int r3 = r7.f444d
            r0.append(r6, r3, r2)
            int r3 = r7.f444d
            int r3 = r3 + r2
            r7.f444d = r3
            r2 = 1
            boolean r2 = r7.c(r2)
            if (r2 != 0) goto L_0x0002
        L_0x007a:
            if (r0 != 0) goto L_0x0084
            java.lang.String r0 = new java.lang.String
            int r2 = r7.f444d
            r0.<init>(r6, r2, r1)
            goto L_0x008d
        L_0x0084:
            int r2 = r7.f444d
            r0.append(r6, r2, r1)
            java.lang.String r0 = r0.toString()
        L_0x008d:
            int r2 = r7.f444d
            int r2 = r2 + r1
            r7.f444d = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.stream.JsonReader.i():java.lang.String");
    }

    public final boolean isLenient() {
        return this.f442b;
    }

    public final void j(int i2) {
        int i3 = this.f453m;
        int[] iArr = this.f452l;
        if (i3 == iArr.length) {
            int i4 = i3 * 2;
            this.f452l = Arrays.copyOf(iArr, i4);
            this.f455o = Arrays.copyOf(this.f455o, i4);
            this.f454n = (String[]) Arrays.copyOf(this.f454n, i4);
        }
        int[] iArr2 = this.f452l;
        int i5 = this.f453m;
        this.f453m = i5 + 1;
        iArr2[i5] = i2;
    }

    public final char k() {
        int i2;
        int i3;
        if (this.f444d != this.f445e || c(1)) {
            int i4 = this.f444d;
            int i5 = i4 + 1;
            this.f444d = i5;
            char[] cArr = this.f443c;
            char c2 = cArr[i4];
            if (c2 == 10) {
                this.f446f++;
                this.f447g = i5;
            } else if (!(c2 == '\"' || c2 == '\'' || c2 == '/' || c2 == '\\')) {
                if (c2 == 'b') {
                    return 8;
                }
                if (c2 == 'f') {
                    return 12;
                }
                if (c2 == 'n') {
                    return 10;
                }
                if (c2 == 'r') {
                    return 13;
                }
                if (c2 == 't') {
                    return 9;
                }
                if (c2 != 'u') {
                    n("Invalid escape sequence");
                    throw null;
                } else if (i5 + 4 <= this.f445e || c(4)) {
                    int i6 = this.f444d;
                    int i7 = i6 + 4;
                    char c3 = 0;
                    while (i6 < i7) {
                        char c4 = cArr[i6];
                        char c5 = (char) (c3 << 4);
                        if (c4 < '0' || c4 > '9') {
                            if (c4 >= 'a' && c4 <= 'f') {
                                i3 = c4 - 'a';
                            } else if (c4 < 'A' || c4 > 'F') {
                                throw new NumberFormatException("\\u".concat(new String(cArr, this.f444d, 4)));
                            } else {
                                i3 = c4 - 'A';
                            }
                            i2 = i3 + 10;
                        } else {
                            i2 = c4 - '0';
                        }
                        c3 = (char) (i2 + c5);
                        i6++;
                    }
                    this.f444d += 4;
                    return c3;
                } else {
                    n("Unterminated escape sequence");
                    throw null;
                }
            }
            return c2;
        }
        n("Unterminated escape sequence");
        throw null;
    }

    public final void l(char c2) {
        while (true) {
            int i2 = this.f444d;
            int i3 = this.f445e;
            while (true) {
                if (i2 < i3) {
                    int i4 = i2 + 1;
                    char c3 = this.f443c[i2];
                    if (c3 == c2) {
                        this.f444d = i4;
                        return;
                    } else if (c3 == '\\') {
                        this.f444d = i4;
                        k();
                        break;
                    } else {
                        if (c3 == 10) {
                            this.f446f++;
                            this.f447g = i4;
                        }
                        i2 = i4;
                    }
                } else {
                    this.f444d = i2;
                    if (!c(1)) {
                        n("Unterminated string");
                        throw null;
                    }
                }
            }
        }
    }

    public final void m() {
        char c2;
        do {
            if (this.f444d < this.f445e || c(1)) {
                int i2 = this.f444d;
                int i3 = i2 + 1;
                this.f444d = i3;
                c2 = this.f443c[i2];
                if (c2 == 10) {
                    this.f446f++;
                    this.f447g = i3;
                    return;
                }
            } else {
                return;
            }
        } while (c2 != 13);
    }

    public final void n(String str) {
        StringBuilder g2 = a.a.g(str);
        g2.append(f());
        throw new MalformedJsonException(g2.toString());
    }

    public boolean nextBoolean() {
        int i2 = this.f448h;
        if (i2 == 0) {
            i2 = b();
        }
        if (i2 == 5) {
            this.f448h = 0;
            int[] iArr = this.f455o;
            int i3 = this.f453m - 1;
            iArr[i3] = iArr[i3] + 1;
            return true;
        } else if (i2 == 6) {
            this.f448h = 0;
            int[] iArr2 = this.f455o;
            int i4 = this.f453m - 1;
            iArr2[i4] = iArr2[i4] + 1;
            return false;
        } else {
            throw new IllegalStateException("Expected a boolean but was " + peek() + f());
        }
    }

    public double nextDouble() {
        String str;
        int i2 = this.f448h;
        if (i2 == 0) {
            i2 = b();
        }
        if (i2 == 15) {
            this.f448h = 0;
            int[] iArr = this.f455o;
            int i3 = this.f453m - 1;
            iArr[i3] = iArr[i3] + 1;
            return (double) this.f449i;
        }
        if (i2 == 16) {
            this.f451k = new String(this.f443c, this.f444d, this.f450j);
            this.f444d += this.f450j;
        } else {
            if (i2 == 8 || i2 == 9) {
                str = h(i2 == 8 ? '\'' : '\"');
            } else if (i2 == 10) {
                str = i();
            } else if (i2 != 11) {
                throw new IllegalStateException("Expected a double but was " + peek() + f());
            }
            this.f451k = str;
        }
        this.f448h = 11;
        double parseDouble = Double.parseDouble(this.f451k);
        if (this.f442b || (!Double.isNaN(parseDouble) && !Double.isInfinite(parseDouble))) {
            this.f451k = null;
            this.f448h = 0;
            int[] iArr2 = this.f455o;
            int i4 = this.f453m - 1;
            iArr2[i4] = iArr2[i4] + 1;
            return parseDouble;
        }
        throw new MalformedJsonException("JSON forbids NaN and infinities: " + parseDouble + f());
    }

    public int nextInt() {
        String h2;
        int i2 = this.f448h;
        if (i2 == 0) {
            i2 = b();
        }
        if (i2 == 15) {
            long j2 = this.f449i;
            int i3 = (int) j2;
            if (j2 == ((long) i3)) {
                this.f448h = 0;
                int[] iArr = this.f455o;
                int i4 = this.f453m - 1;
                iArr[i4] = iArr[i4] + 1;
                return i3;
            }
            throw new NumberFormatException("Expected an int but was " + this.f449i + f());
        }
        if (i2 == 16) {
            this.f451k = new String(this.f443c, this.f444d, this.f450j);
            this.f444d += this.f450j;
        } else if (i2 == 8 || i2 == 9 || i2 == 10) {
            if (i2 == 10) {
                h2 = i();
            } else {
                h2 = h(i2 == 8 ? '\'' : '\"');
            }
            this.f451k = h2;
            try {
                int parseInt = Integer.parseInt(this.f451k);
                this.f448h = 0;
                int[] iArr2 = this.f455o;
                int i5 = this.f453m - 1;
                iArr2[i5] = iArr2[i5] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else {
            throw new IllegalStateException("Expected an int but was " + peek() + f());
        }
        this.f448h = 11;
        double parseDouble = Double.parseDouble(this.f451k);
        int i6 = (int) parseDouble;
        if (((double) i6) == parseDouble) {
            this.f451k = null;
            this.f448h = 0;
            int[] iArr3 = this.f455o;
            int i7 = this.f453m - 1;
            iArr3[i7] = iArr3[i7] + 1;
            return i6;
        }
        throw new NumberFormatException("Expected an int but was " + this.f451k + f());
    }

    public long nextLong() {
        String h2;
        int i2 = this.f448h;
        if (i2 == 0) {
            i2 = b();
        }
        if (i2 == 15) {
            this.f448h = 0;
            int[] iArr = this.f455o;
            int i3 = this.f453m - 1;
            iArr[i3] = iArr[i3] + 1;
            return this.f449i;
        }
        if (i2 == 16) {
            this.f451k = new String(this.f443c, this.f444d, this.f450j);
            this.f444d += this.f450j;
        } else if (i2 == 8 || i2 == 9 || i2 == 10) {
            if (i2 == 10) {
                h2 = i();
            } else {
                h2 = h(i2 == 8 ? '\'' : '\"');
            }
            this.f451k = h2;
            try {
                long parseLong = Long.parseLong(this.f451k);
                this.f448h = 0;
                int[] iArr2 = this.f455o;
                int i4 = this.f453m - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        } else {
            throw new IllegalStateException("Expected a long but was " + peek() + f());
        }
        this.f448h = 11;
        double parseDouble = Double.parseDouble(this.f451k);
        long j2 = (long) parseDouble;
        if (((double) j2) == parseDouble) {
            this.f451k = null;
            this.f448h = 0;
            int[] iArr3 = this.f455o;
            int i5 = this.f453m - 1;
            iArr3[i5] = iArr3[i5] + 1;
            return j2;
        }
        throw new NumberFormatException("Expected a long but was " + this.f451k + f());
    }

    public String nextName() {
        String str;
        char c2;
        int i2 = this.f448h;
        if (i2 == 0) {
            i2 = b();
        }
        if (i2 == 14) {
            str = i();
        } else {
            if (i2 == 12) {
                c2 = '\'';
            } else if (i2 == 13) {
                c2 = '\"';
            } else {
                throw new IllegalStateException("Expected a name but was " + peek() + f());
            }
            str = h(c2);
        }
        this.f448h = 0;
        this.f454n[this.f453m - 1] = str;
        return str;
    }

    public void nextNull() {
        int i2 = this.f448h;
        if (i2 == 0) {
            i2 = b();
        }
        if (i2 == 7) {
            this.f448h = 0;
            int[] iArr = this.f455o;
            int i3 = this.f453m - 1;
            iArr[i3] = iArr[i3] + 1;
            return;
        }
        throw new IllegalStateException("Expected null but was " + peek() + f());
    }

    public String nextString() {
        String str;
        char c2;
        int i2 = this.f448h;
        if (i2 == 0) {
            i2 = b();
        }
        if (i2 == 10) {
            str = i();
        } else {
            if (i2 == 8) {
                c2 = '\'';
            } else if (i2 == 9) {
                c2 = '\"';
            } else if (i2 == 11) {
                str = this.f451k;
                this.f451k = null;
            } else if (i2 == 15) {
                str = Long.toString(this.f449i);
            } else if (i2 == 16) {
                str = new String(this.f443c, this.f444d, this.f450j);
                this.f444d += this.f450j;
            } else {
                throw new IllegalStateException("Expected a string but was " + peek() + f());
            }
            str = h(c2);
        }
        this.f448h = 0;
        int[] iArr = this.f455o;
        int i3 = this.f453m - 1;
        iArr[i3] = iArr[i3] + 1;
        return str;
    }

    public JsonToken peek() {
        int i2 = this.f448h;
        if (i2 == 0) {
            i2 = b();
        }
        switch (i2) {
            case 1:
                return JsonToken.BEGIN_OBJECT;
            case 2:
                return JsonToken.END_OBJECT;
            case 3:
                return JsonToken.BEGIN_ARRAY;
            case 4:
                return JsonToken.END_ARRAY;
            case 5:
            case 6:
                return JsonToken.BOOLEAN;
            case 7:
                return JsonToken.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return JsonToken.STRING;
            case 12:
            case 13:
            case 14:
                return JsonToken.NAME;
            case 15:
            case 16:
                return JsonToken.NUMBER;
            case 17:
                return JsonToken.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    public final void setLenient(boolean z2) {
        this.f442b = z2;
    }

    public void skipValue() {
        int i2;
        char c2;
        int i3 = 0;
        do {
            int i4 = this.f448h;
            if (i4 == 0) {
                i4 = b();
            }
            if (i4 == 3) {
                j(1);
            } else if (i4 == 1) {
                j(3);
            } else if (i4 == 4 || i4 == 2) {
                this.f453m--;
                i3--;
                this.f448h = 0;
            } else if (i4 == 14 || i4 == 10) {
                while (true) {
                    i2 = 0;
                    while (true) {
                        int i5 = this.f444d + i2;
                        if (i5 < this.f445e) {
                            char c3 = this.f443c[i5];
                            if (!(c3 == 9 || c3 == 10 || c3 == 12 || c3 == 13 || c3 == ' ')) {
                                if (c3 != '#') {
                                    if (c3 != ',') {
                                        if (!(c3 == '/' || c3 == '=')) {
                                            if (!(c3 == '{' || c3 == '}' || c3 == ':')) {
                                                if (c3 != ';') {
                                                    switch (c3) {
                                                        case '[':
                                                        case ']':
                                                            break;
                                                        case '\\':
                                                            break;
                                                        default:
                                                            i2++;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            this.f444d = i5;
                            if (!c(1)) {
                            }
                        }
                    }
                }
                a();
                this.f444d += i2;
                this.f448h = 0;
            } else {
                if (i4 == 8 || i4 == 12) {
                    c2 = '\'';
                } else if (i4 == 9 || i4 == 13) {
                    c2 = '\"';
                } else {
                    if (i4 == 16) {
                        this.f444d += this.f450j;
                    }
                    this.f448h = 0;
                }
                l(c2);
                this.f448h = 0;
            }
            i3++;
            this.f448h = 0;
        } while (i3 != 0);
        int[] iArr = this.f455o;
        int i6 = this.f453m;
        int i7 = i6 - 1;
        iArr[i7] = iArr[i7] + 1;
        this.f454n[i6 - 1] = "null";
    }

    public String toString() {
        return getClass().getSimpleName() + f();
    }
}
