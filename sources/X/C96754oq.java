package X;

import java.util.ArrayDeque;
import java.util.List;

/* renamed from: X.4oq  reason: invalid class name and case insensitive filesystem */
public final class C96754oq implements C32371gD, C55132it {
    public static final C108255Ng A0M = new C96654og();
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04 = 0;
    public int A05;
    public int A06;
    public int A07;
    public int A08 = -1;
    public long A09;
    public long A0A;
    public C15060qG A0B;
    public C90504eH A0C;
    public AnonymousClass4LR[] A0D;
    public long[][] A0E;
    public final AnonymousClass4ZR A0F = new AnonymousClass4ZR();
    public final C90504eH A0G = C90504eH.A05(16);
    public final C90504eH A0H = C90504eH.A05(4);
    public final C90504eH A0I = new C90504eH(C90674eb.A02);
    public final C90504eH A0J = new C90504eH();
    public final ArrayDeque A0K = new ArrayDeque();
    public final List A0L = AnonymousClass000.A0u();

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v7, resolved type: X.4jf[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v53, resolved type: X.4jf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v94, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v2, resolved type: X.4jf} */
    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x04ec: MOVE  (r0v68 X.4ar) = (r24v0 X.4ar)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x0319  */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x052c  */
    /* JADX WARNING: Removed duplicated region for block: B:320:0x0094 A[SYNTHETIC] */
    public final void A00(long r34) {
        /*
            r33 = this;
        L_0x0000:
            r9 = r33
            java.util.ArrayDeque r0 = r9.A0K
            r32 = r0
            boolean r0 = r32.isEmpty()
            if (r0 != 0) goto L_0x061f
            java.lang.Object r0 = r32.peek()
            X.3Us r0 = (X.C65423Us) r0
            long r1 = r0.A00
            int r0 = (r1 > r34 ? 1 : (r1 == r34 ? 0 : -1))
            if (r0 != 0) goto L_0x061f
            java.lang.Object r8 = r32.pop()
            X.3Us r8 = (X.C65423Us) r8
            int r1 = r8.A00
            r0 = 1836019574(0x6d6f6f76, float:4.631354E27)
            if (r1 != r0) goto L_0x0607
            java.util.ArrayList r23 = X.AnonymousClass000.A0u()
            int r0 = r9.A02
            r12 = 1
            boolean r31 = X.AnonymousClass000.A1R(r0, r12)
            X.4ar r24 = new X.4ar
            r24.<init>()
            r0 = 1969517665(0x75647461, float:2.8960062E32)
            X.3Ur r0 = r8.A01(r0)
            if (r0 == 0) goto L_0x038d
            X.4eH r11 = r0.A00
            r10 = 8
            r11.A0S(r10)
            r3 = 0
            r19 = r3
        L_0x0048:
            int r0 = r11.A00
            int r7 = r11.A01
            int r0 = r0 - r7
            if (r0 < r10) goto L_0x0392
            int r18 = r11.A07()
            int r1 = r11.A07()
            r0 = 1835365473(0x6d657461, float:4.4382975E27)
            if (r1 != r0) goto L_0x0326
            r11.A0S(r7)
            int r3 = r7 + r18
            r11.A0T(r10)
            int r2 = r11.A01
            r0 = 4
            r11.A0T(r0)
            int r1 = r11.A07()
            r0 = 1751411826(0x68646c72, float:4.3148E24)
            if (r1 == r0) goto L_0x0075
            int r2 = r2 + 4
        L_0x0075:
            r11.A0S(r2)
        L_0x0078:
            int r6 = r11.A01
            if (r6 >= r3) goto L_0x038b
            int r2 = r11.A07()
            int r1 = r11.A07()
            r0 = 1768715124(0x696c7374, float:1.7865732E25)
            if (r1 != r0) goto L_0x0320
            r11.A0S(r6)
            int r6 = r6 + r2
            r11.A0T(r10)
            java.util.ArrayList r17 = X.AnonymousClass000.A0u()
        L_0x0094:
            int r5 = r11.A01
            if (r5 >= r6) goto L_0x0377
            int r0 = r11.A07()
            int r5 = r5 + r0
            int r3 = r11.A07()
            int r0 = r3 >> 24
            r1 = r0 & 255(0xff, float:3.57E-43)
            r0 = 169(0xa9, float:2.37E-43)
            if (r1 == r0) goto L_0x0249
            r0 = 253(0xfd, float:3.55E-43)
            if (r1 == r0) goto L_0x0249
            r0 = 1735291493(0x676e7265, float:1.1260334E24)
            if (r3 != r0) goto L_0x00ec
            r0 = 4
            r11.A0T(r0)     // Catch:{ all -> 0x061a }
            int r1 = r11.A07()     // Catch:{ all -> 0x061a }
            r0 = 1684108385(0x64617461, float:1.6635614E22)
            if (r1 != r0) goto L_0x00c4
            int r3 = X.C90504eH.A01(r11, r10)     // Catch:{ all -> 0x061a }
            goto L_0x00cc
        L_0x00c4:
            java.lang.String r1 = "MetadataUtil"
            java.lang.String r0 = "Failed to parse uint8 attribute value"
            android.util.Log.w(r1, r0)     // Catch:{ all -> 0x061a }
            r3 = -1
        L_0x00cc:
            r2 = 0
            if (r3 <= 0) goto L_0x00e3
            java.lang.String[] r1 = X.C90314dw.A00     // Catch:{ all -> 0x061a }
            int r0 = r1.length     // Catch:{ all -> 0x061a }
            if (r3 > r0) goto L_0x00e3
            int r0 = r3 + -1
            r1 = r1[r0]     // Catch:{ all -> 0x061a }
            if (r1 == 0) goto L_0x00e3
            java.lang.String r0 = "TCON"
            X.3V7 r4 = new X.3V7     // Catch:{ all -> 0x061a }
            r4.<init>(r0, r2, r1)     // Catch:{ all -> 0x061a }
            goto L_0x0314
        L_0x00e3:
            java.lang.String r1 = "MetadataUtil"
            java.lang.String r0 = "Failed to parse standard genre code"
            android.util.Log.w(r1, r0)     // Catch:{ all -> 0x061a }
            goto L_0x0313
        L_0x00ec:
            r0 = 1684632427(0x6469736b, float:1.7225632E22)
            if (r3 != r0) goto L_0x00f9
            java.lang.String r0 = "TPOS"
            X.3V7 r4 = X.C90314dw.A01(r11, r0, r3)     // Catch:{ all -> 0x061a }
            goto L_0x0314
        L_0x00f9:
            r0 = 1953655662(0x74726b6e, float:7.6825853E31)
            if (r3 != r0) goto L_0x0106
            java.lang.String r0 = "TRCK"
            X.3V7 r4 = X.C90314dw.A01(r11, r0, r3)     // Catch:{ all -> 0x061a }
            goto L_0x0314
        L_0x0106:
            r0 = 1953329263(0x746d706f, float:7.5247484E31)
            r1 = 0
            if (r3 != r0) goto L_0x0114
            java.lang.String r0 = "TBPM"
            X.4pU r4 = X.C90314dw.A00(r11, r0, r3, r12, r1)     // Catch:{ all -> 0x061a }
            goto L_0x0314
        L_0x0114:
            r0 = 1668311404(0x6370696c, float:4.434815E21)
            if (r3 != r0) goto L_0x0121
            java.lang.String r0 = "TCMP"
            X.4pU r4 = X.C90314dw.A00(r11, r0, r3, r12, r12)     // Catch:{ all -> 0x061a }
            goto L_0x0314
        L_0x0121:
            r0 = 1668249202(0x636f7672, float:4.4173067E21)
            if (r3 != r0) goto L_0x016c
            int r13 = r11.A07()     // Catch:{ all -> 0x061a }
            int r4 = r11.A07()     // Catch:{ all -> 0x061a }
            java.lang.String r3 = "MetadataUtil"
            r2 = 0
            r0 = 1684108385(0x64617461, float:1.6635614E22)
            if (r4 != r0) goto L_0x0165
            int r4 = r11.A07()     // Catch:{ all -> 0x061a }
            r0 = 16777215(0xffffff, float:2.3509886E-38)
            r4 = r4 & r0
            r0 = 13
            if (r4 != r0) goto L_0x0157
            java.lang.String r3 = "image/jpeg"
        L_0x0144:
            r0 = 4
            r11.A0T(r0)     // Catch:{ all -> 0x061a }
            int r4 = r13 + -16
            byte[] r0 = new byte[r4]     // Catch:{ all -> 0x061a }
            r11.A0V(r0, r1, r4)     // Catch:{ all -> 0x061a }
            r1 = 3
            X.3VB r4 = new X.3VB     // Catch:{ all -> 0x061a }
            r4.<init>(r3, r2, r0, r1)     // Catch:{ all -> 0x061a }
            goto L_0x0314
        L_0x0157:
            r0 = 14
            if (r4 != r0) goto L_0x015e
            java.lang.String r3 = "image/png"
            goto L_0x0144
        L_0x015e:
            java.lang.String r0 = "Unrecognized cover art flags: "
            java.lang.String r0 = X.C13680ns.A0c(r4, r0)     // Catch:{ all -> 0x061a }
            goto L_0x0167
        L_0x0165:
            java.lang.String r0 = "Failed to parse cover art attribute"
        L_0x0167:
            android.util.Log.w(r3, r0)     // Catch:{ all -> 0x061a }
            goto L_0x0313
        L_0x016c:
            r0 = 1631670868(0x61415254, float:2.2288462E20)
            if (r3 != r0) goto L_0x0179
            java.lang.String r0 = "TPE2"
            X.3V7 r4 = X.C90314dw.A02(r11, r0, r3)     // Catch:{ all -> 0x061a }
            goto L_0x0314
        L_0x0179:
            r0 = 1936682605(0x736f6e6d, float:1.8969706E31)
            if (r3 != r0) goto L_0x0186
            java.lang.String r0 = "TSOT"
            X.3V7 r4 = X.C90314dw.A02(r11, r0, r3)     // Catch:{ all -> 0x061a }
            goto L_0x0314
        L_0x0186:
            r0 = 1936679276(0x736f616c, float:1.8965681E31)
            if (r3 != r0) goto L_0x0193
            java.lang.String r0 = "TSO2"
            X.3V7 r4 = X.C90314dw.A02(r11, r0, r3)     // Catch:{ all -> 0x061a }
            goto L_0x0314
        L_0x0193:
            r0 = 1936679282(0x736f6172, float:1.8965689E31)
            if (r3 != r0) goto L_0x01a0
            java.lang.String r0 = "TSOA"
            X.3V7 r4 = X.C90314dw.A02(r11, r0, r3)     // Catch:{ all -> 0x061a }
            goto L_0x0314
        L_0x01a0:
            r0 = 1936679265(0x736f6161, float:1.8965668E31)
            if (r3 != r0) goto L_0x01ad
            java.lang.String r0 = "TSOP"
            X.3V7 r4 = X.C90314dw.A02(r11, r0, r3)     // Catch:{ all -> 0x061a }
            goto L_0x0314
        L_0x01ad:
            r0 = 1936679791(0x736f636f, float:1.8966304E31)
            if (r3 != r0) goto L_0x01ba
            java.lang.String r0 = "TSOC"
            X.3V7 r4 = X.C90314dw.A02(r11, r0, r3)     // Catch:{ all -> 0x061a }
            goto L_0x0314
        L_0x01ba:
            r0 = 1920233063(0x72746e67, float:4.84146E30)
            if (r3 != r0) goto L_0x01c7
            java.lang.String r0 = "ITUNESADVISORY"
            X.4pU r4 = X.C90314dw.A00(r11, r0, r3, r1, r1)     // Catch:{ all -> 0x061a }
            goto L_0x0314
        L_0x01c7:
            r0 = 1885823344(0x70676170, float:2.8643533E29)
            if (r3 != r0) goto L_0x01d4
            java.lang.String r0 = "ITUNESGAPLESS"
            X.4pU r4 = X.C90314dw.A00(r11, r0, r3, r1, r12)     // Catch:{ all -> 0x061a }
            goto L_0x0314
        L_0x01d4:
            r0 = 1936683886(0x736f736e, float:1.8971255E31)
            if (r3 != r0) goto L_0x01e1
            java.lang.String r0 = "TVSHOWSORT"
            X.3V7 r4 = X.C90314dw.A02(r11, r0, r3)     // Catch:{ all -> 0x061a }
            goto L_0x0314
        L_0x01e1:
            r0 = 1953919848(0x74767368, float:7.810338E31)
            if (r3 != r0) goto L_0x01ee
            java.lang.String r0 = "TVSHOW"
            X.3V7 r4 = X.C90314dw.A02(r11, r0, r3)     // Catch:{ all -> 0x061a }
            goto L_0x0314
        L_0x01ee:
            r0 = 757935405(0x2d2d2d2d, float:9.8439425E-12)
            if (r3 != r0) goto L_0x02ed
            r4 = 0
            r13 = r4
            r3 = r4
            r2 = -1
            r1 = -1
        L_0x01f8:
            int r15 = r11.A01     // Catch:{ all -> 0x061a }
            if (r15 >= r5) goto L_0x022e
            int r16 = r11.A07()     // Catch:{ all -> 0x061a }
            int r0 = r11.A07()     // Catch:{ all -> 0x061a }
            r14 = 4
            r11.A0T(r14)     // Catch:{ all -> 0x061a }
            r14 = 1835360622(0x6d65616e, float:4.4368658E27)
            if (r0 != r14) goto L_0x0214
            int r0 = r16 + -12
            java.lang.String r13 = r11.A0N(r0)     // Catch:{ all -> 0x061a }
            goto L_0x01f8
        L_0x0214:
            r14 = 1851878757(0x6e616d65, float:1.7441594E28)
            if (r0 != r14) goto L_0x0220
            int r0 = r16 + -12
            java.lang.String r3 = r11.A0N(r0)     // Catch:{ all -> 0x061a }
            goto L_0x01f8
        L_0x0220:
            r14 = 1684108385(0x64617461, float:1.6635614E22)
            if (r0 != r14) goto L_0x0228
            r2 = r15
            r1 = r16
        L_0x0228:
            int r0 = r16 + -12
            r11.A0T(r0)     // Catch:{ all -> 0x061a }
            goto L_0x01f8
        L_0x022e:
            if (r13 == 0) goto L_0x0314
            if (r3 == 0) goto L_0x0314
            r0 = -1
            if (r2 == r0) goto L_0x0314
            r11.A0S(r2)     // Catch:{ all -> 0x061a }
            r0 = 16
            r11.A0T(r0)     // Catch:{ all -> 0x061a }
            int r1 = r1 - r0
            java.lang.String r0 = r11.A0N(r1)     // Catch:{ all -> 0x061a }
            X.3VA r4 = new X.3VA     // Catch:{ all -> 0x061a }
            r4.<init>(r13, r3, r0)     // Catch:{ all -> 0x061a }
            goto L_0x0314
        L_0x0249:
            r1 = 16777215(0xffffff, float:2.3509886E-38)
            r1 = r1 & r3
            r0 = 6516084(0x636d74, float:9.130979E-39)
            if (r1 != r0) goto L_0x0285
            int r2 = r11.A07()     // Catch:{ all -> 0x061a }
            int r1 = r11.A07()     // Catch:{ all -> 0x061a }
            r0 = 1684108385(0x64617461, float:1.6635614E22)
            if (r1 != r0) goto L_0x0271
            r11.A0T(r10)     // Catch:{ all -> 0x061a }
            int r0 = r2 + -16
            java.lang.String r1 = r11.A0N(r0)     // Catch:{ all -> 0x061a }
            java.lang.String r0 = "und"
            X.3V9 r4 = new X.3V9     // Catch:{ all -> 0x061a }
            r4.<init>(r0, r1, r1)     // Catch:{ all -> 0x061a }
            goto L_0x0314
        L_0x0271:
            java.lang.String r0 = "Failed to parse comment attribute: "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)     // Catch:{ all -> 0x061a }
            java.lang.String r0 = X.C88494ab.A00(r3)     // Catch:{ all -> 0x061a }
            java.lang.String r1 = X.AnonymousClass000.A0h(r0, r1)     // Catch:{ all -> 0x061a }
            java.lang.String r0 = "MetadataUtil"
            android.util.Log.w(r0, r1)     // Catch:{ all -> 0x061a }
            goto L_0x0303
        L_0x0285:
            r0 = 7233901(0x6e616d, float:1.0136854E-38)
            if (r1 == r0) goto L_0x030c
            r0 = 7631467(0x74726b, float:1.0693963E-38)
            if (r1 == r0) goto L_0x030c
            r0 = 6516589(0x636f6d, float:9.131686E-39)
            if (r1 == r0) goto L_0x0305
            r0 = 7828084(0x777274, float:1.0969482E-38)
            if (r1 == r0) goto L_0x0305
            r0 = 6578553(0x646179, float:9.218516E-39)
            if (r1 != r0) goto L_0x02a5
            java.lang.String r0 = "TDRC"
            X.3V7 r4 = X.C90314dw.A02(r11, r0, r3)     // Catch:{ all -> 0x061a }
            goto L_0x0314
        L_0x02a5:
            r0 = 4280916(0x415254, float:5.998841E-39)
            if (r1 != r0) goto L_0x02b1
            java.lang.String r0 = "TPE1"
            X.3V7 r4 = X.C90314dw.A02(r11, r0, r3)     // Catch:{ all -> 0x061a }
            goto L_0x0314
        L_0x02b1:
            r0 = 7630703(0x746f6f, float:1.0692892E-38)
            if (r1 != r0) goto L_0x02bd
            java.lang.String r0 = "TSSE"
            X.3V7 r4 = X.C90314dw.A02(r11, r0, r3)     // Catch:{ all -> 0x061a }
            goto L_0x0314
        L_0x02bd:
            r0 = 6384738(0x616c62, float:8.946924E-39)
            if (r1 != r0) goto L_0x02c9
            java.lang.String r0 = "TALB"
            X.3V7 r4 = X.C90314dw.A02(r11, r0, r3)     // Catch:{ all -> 0x061a }
            goto L_0x0314
        L_0x02c9:
            r0 = 7108978(0x6c7972, float:9.9618E-39)
            if (r1 != r0) goto L_0x02d5
            java.lang.String r0 = "USLT"
            X.3V7 r4 = X.C90314dw.A02(r11, r0, r3)     // Catch:{ all -> 0x061a }
            goto L_0x0314
        L_0x02d5:
            r0 = 6776174(0x67656e, float:9.495442E-39)
            if (r1 != r0) goto L_0x02e1
            java.lang.String r0 = "TCON"
            X.3V7 r4 = X.C90314dw.A02(r11, r0, r3)     // Catch:{ all -> 0x061a }
            goto L_0x0314
        L_0x02e1:
            r0 = 6779504(0x677270, float:9.500109E-39)
            if (r1 != r0) goto L_0x02ed
            java.lang.String r0 = "TIT1"
            X.3V7 r4 = X.C90314dw.A02(r11, r0, r3)     // Catch:{ all -> 0x061a }
            goto L_0x0314
        L_0x02ed:
            java.lang.String r2 = "MetadataUtil"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()     // Catch:{ all -> 0x061a }
            java.lang.String r0 = "Skipped unknown metadata entry: "
            r1.append(r0)     // Catch:{ all -> 0x061a }
            java.lang.String r0 = X.C88494ab.A00(r3)     // Catch:{ all -> 0x061a }
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)     // Catch:{ all -> 0x061a }
            android.util.Log.d(r2, r0)     // Catch:{ all -> 0x061a }
        L_0x0303:
            r4 = 0
            goto L_0x0314
        L_0x0305:
            java.lang.String r0 = "TCOM"
            X.3V7 r4 = X.C90314dw.A02(r11, r0, r3)     // Catch:{ all -> 0x061a }
            goto L_0x0314
        L_0x030c:
            java.lang.String r0 = "TIT2"
            X.3V7 r4 = X.C90314dw.A02(r11, r0, r3)     // Catch:{ all -> 0x061a }
            goto L_0x0314
        L_0x0313:
            r4 = r2
        L_0x0314:
            r11.A0S(r5)
            if (r4 == 0) goto L_0x0094
            r0 = r17
            r0.add(r4)
            goto L_0x0094
        L_0x0320:
            int r6 = r6 + r2
            r11.A0S(r6)
            goto L_0x0078
        L_0x0326:
            r0 = 1936553057(0x736d7461, float:1.8813092E31)
            if (r1 != r0) goto L_0x0384
            r11.A0S(r7)
            int r6 = r7 + r18
            r2 = 12
            r11.A0T(r2)
        L_0x0335:
            int r5 = r11.A01
            r19 = 0
            if (r5 >= r6) goto L_0x0384
            int r4 = r11.A07()
            int r1 = r11.A07()
            r0 = 1935766900(0x73617574, float:1.7862687E31)
            if (r1 != r0) goto L_0x0372
            r0 = 14
            if (r4 < r0) goto L_0x0384
            r0 = 5
            int r1 = X.C90504eH.A01(r11, r0)
            if (r1 == r2) goto L_0x036f
            r0 = 13
            if (r1 != r0) goto L_0x0384
            r5 = 1123024896(0x42f00000, float:120.0)
        L_0x0359:
            int r4 = X.C90504eH.A01(r11, r12)
            X.1mP[] r2 = new X.C35731mP[r12]
            r1 = 0
            X.4pX r0 = new X.4pX
            r0.<init>(r5, r4)
            r2[r1] = r0
            X.4jf r19 = new X.4jf
            r0 = r19
            r0.<init>((X.C35731mP[]) r2)
            goto L_0x0384
        L_0x036f:
            r5 = 1131413504(0x43700000, float:240.0)
            goto L_0x0359
        L_0x0372:
            int r5 = r5 + r4
            r11.A0S(r5)
            goto L_0x0335
        L_0x0377:
            boolean r0 = r17.isEmpty()
            if (r0 != 0) goto L_0x038b
            X.4jf r3 = new X.4jf
            r0 = r17
            r3.<init>((java.util.List) r0)
        L_0x0384:
            int r7 = r7 + r18
            r11.A0S(r7)
            goto L_0x0048
        L_0x038b:
            r3 = 0
            goto L_0x0384
        L_0x038d:
            r21 = 0
            r22 = 0
            goto L_0x03af
        L_0x0392:
            r0 = r19
            android.util.Pair r1 = android.util.Pair.create(r3, r0)
            java.lang.Object r0 = r1.first
            r22 = r0
            r0 = r22
            X.4jf r0 = (X.C93724jf) r0
            r22 = r0
            java.lang.Object r0 = r1.second
            r21 = r0
            if (r22 == 0) goto L_0x03af
            r1 = r22
            r0 = r24
            r0.A00(r1)
        L_0x03af:
            r0 = 1835365473(0x6d657461, float:4.4382975E27)
            X.3Us r3 = r8.A00(r0)
            if (r3 == 0) goto L_0x0464
            r0 = 1751411826(0x68646c72, float:4.3148E24)
            X.3Ur r1 = r3.A01(r0)
            r0 = 1801812339(0x6b657973, float:2.7741754E26)
            X.3Ur r2 = r3.A01(r0)
            r0 = 1768715124(0x696c7374, float:1.7865732E25)
            X.3Ur r4 = r3.A01(r0)
            r13 = 0
            if (r1 == 0) goto L_0x0471
            if (r2 == 0) goto L_0x0471
            if (r4 == 0) goto L_0x0471
            X.4eH r1 = r1.A00
            r0 = 16
            int r1 = X.C90504eH.A03(r1, r0)
            r0 = 1835299937(0x6d647461, float:4.4189547E27)
            if (r1 != r0) goto L_0x0471
            X.4eH r3 = r2.A00
            r0 = 12
            int r12 = X.C90504eH.A03(r3, r0)
            java.lang.String[] r11 = new java.lang.String[r12]
            r2 = 0
        L_0x03ec:
            r10 = 8
            if (r2 >= r12) goto L_0x0402
            int r1 = r3.A07()
            r0 = 4
            r3.A0T(r0)
            int r1 = r1 - r10
            java.lang.String r0 = r3.A0O(r1)
            r11[r2] = r0
            int r2 = r2 + 1
            goto L_0x03ec
        L_0x0402:
            X.4eH r7 = r4.A00
            r7.A0S(r10)
            java.util.ArrayList r6 = X.AnonymousClass000.A0u()
        L_0x040b:
            int r0 = r7.A00
            int r5 = r7.A01
            int r0 = r0 - r5
            if (r0 <= r10) goto L_0x0466
            int r16 = r7.A07()
            int r0 = r7.A07()
            int r1 = r0 + -1
            if (r1 < 0) goto L_0x0458
            if (r1 >= r12) goto L_0x0458
            r14 = r11[r1]
            int r3 = r5 + r16
        L_0x0424:
            int r2 = r7.A01
            if (r2 >= r3) goto L_0x044d
            int r15 = r7.A07()
            int r1 = r7.A07()
            r0 = 1684108385(0x64617461, float:1.6635614E22)
            if (r1 != r0) goto L_0x0453
            int r4 = r7.A07()
            int r3 = r7.A07()
            int r2 = r15 + -16
            byte[] r1 = new byte[r2]
            r0 = 0
            r7.A0V(r1, r0, r2)
            X.4pZ r0 = new X.4pZ
            r0.<init>(r1, r3, r4, r14)
            r6.add(r0)
        L_0x044d:
            int r5 = r5 + r16
            r7.A0S(r5)
            goto L_0x040b
        L_0x0453:
            int r2 = r2 + r15
            r7.A0S(r2)
            goto L_0x0424
        L_0x0458:
            java.lang.String r0 = "Skipped metadata with unknown key index: "
            java.lang.String r1 = X.C13680ns.A0c(r1, r0)
            java.lang.String r0 = "AtomParsers"
            android.util.Log.w(r0, r1)
            goto L_0x044d
        L_0x0464:
            r13 = 0
            goto L_0x0471
        L_0x0466:
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x0471
            X.4jf r13 = new X.4jf
            r13.<init>((java.util.List) r6)
        L_0x0471:
            r5 = 0
            r29 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r25 = 0
            com.facebook.redex.IDxFunctionShape49S0000000_2_I1 r0 = new com.facebook.redex.IDxFunctionShape49S0000000_2_I1
            r0.<init>(r5)
            r26 = r24
            r27 = r8
            r28 = r0
            java.util.List r20 = X.C90564eN.A03(r25, r26, r27, r28, r29, r31)
            X.0qG r0 = r9.A0B
            r25 = r0
            int r19 = r20.size()
            r8 = 0
            r18 = -1
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x0498:
            r0 = r19
            if (r8 >= r0) goto L_0x057d
            r0 = r20
            java.lang.Object r11 = r0.get(r8)
            X.4S8 r11 = (X.AnonymousClass4S8) r11
            int r0 = r11.A01
            if (r0 == 0) goto L_0x0546
            X.4Or r7 = r11.A03
            long r3 = r7.A04
            int r0 = (r3 > r29 ? 1 : (r3 == r29 ? 0 : -1))
            if (r0 != 0) goto L_0x04b2
            long r3 = r11.A02
        L_0x04b2:
            long r1 = java.lang.Math.max(r1, r3)
            int r10 = r7.A03
            r0 = r25
            X.1gS r0 = r0.Ah1(r8, r10)
            X.4LR r15 = new X.4LR
            r15.<init>(r0, r7, r11)
            int r0 = r11.A00
            int r12 = r0 + 30
            X.1gT r0 = r7.A07
            X.1gR r6 = new X.1gR
            r6.<init>(r0)
            r6.A08 = r12
            r0 = 2
            if (r10 != r0) goto L_0x04e7
            r16 = 0
            int r0 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x04e7
            int r10 = r11.A01
            r0 = 1
            if (r10 <= r0) goto L_0x04e7
            float r10 = (float) r10
            float r0 = (float) r3
            r3 = 1232348160(0x49742400, float:1000000.0)
            float r0 = r0 / r3
            float r10 = r10 / r0
            r6.A00 = r10
        L_0x04e7:
            int r4 = r7.A03
            r3 = 1
            if (r4 != r3) goto L_0x04fb
            r0 = r24
            int r11 = r0.A00
            r10 = -1
            if (r11 == r10) goto L_0x04fb
            int r0 = r0.A01
            if (r0 == r10) goto L_0x04fb
            r6.A05 = r11
            r6.A06 = r0
        L_0x04fb:
            r0 = 2
            X.4jf[] r11 = new X.C93724jf[r0]
            r11[r5] = r21
            java.util.List r10 = r9.A0L
            boolean r0 = r10.isEmpty()
            if (r0 == 0) goto L_0x0577
            r0 = 0
        L_0x0509:
            r14 = 1
            r11[r3] = r0
            r3 = r22
            r10 = 0
            X.1mP[] r12 = new X.C35731mP[r5]
            X.4jf r16 = new X.4jf
            r0 = r16
            r0.<init>((X.C35731mP[]) r12)
            if (r4 != r14) goto L_0x054a
            if (r22 == 0) goto L_0x0574
        L_0x051c:
            r0 = r11[r10]
            X.4jf r3 = r3.A00(r0)
            int r10 = r10 + 1
            r0 = 2
            if (r10 < r0) goto L_0x051c
            X.1mP[] r0 = r3.A00
            int r0 = r0.length
            if (r0 <= 0) goto L_0x052e
            r6.A0J = r3
        L_0x052e:
            X.1gS r0 = r15.A01
            X.AnonymousClass3K3.A19(r6, r0)
            int r3 = r7.A03
            r0 = 2
            if (r3 != r0) goto L_0x0541
            r3 = -1
            r0 = r18
            if (r0 != r3) goto L_0x0541
            int r18 = r23.size()
        L_0x0541:
            r0 = r23
            r0.add(r15)
        L_0x0546:
            int r8 = r8 + 1
            goto L_0x0498
        L_0x054a:
            r0 = 2
            if (r4 != r0) goto L_0x0574
            if (r13 == 0) goto L_0x0574
            r4 = 0
        L_0x0550:
            X.1mP[] r3 = r13.A00
            int r0 = r3.length
            if (r4 >= r0) goto L_0x0574
            r3 = r3[r4]
            boolean r0 = r3 instanceof X.C97204pZ
            if (r0 == 0) goto L_0x0571
            X.4pZ r3 = (X.C97204pZ) r3
            java.lang.String r12 = r3.A02
            java.lang.String r0 = "com.android.capture.fps"
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto L_0x0571
            X.1mP[] r0 = new X.C35731mP[r14]
            r0[r5] = r3
            X.4jf r3 = new X.4jf
            r3.<init>((X.C35731mP[]) r0)
            goto L_0x051c
        L_0x0571:
            int r4 = r4 + 1
            goto L_0x0550
        L_0x0574:
            r3 = r16
            goto L_0x051c
        L_0x0577:
            X.4jf r0 = new X.4jf
            r0.<init>((java.util.List) r10)
            goto L_0x0509
        L_0x057d:
            r0 = r18
            r9.A03 = r0
            r9.A0A = r1
            X.4LR[] r1 = new X.AnonymousClass4LR[r5]
            r0 = r23
            java.lang.Object[] r10 = r0.toArray(r1)
            X.4LR[] r10 = (X.AnonymousClass4LR[]) r10
            r9.A0D = r10
            int r8 = r10.length
            long[][] r7 = new long[r8][]
            int[] r6 = new int[r8]
            long[] r4 = new long[r8]
            boolean[] r3 = new boolean[r8]
            r2 = 0
            r11 = 0
        L_0x059a:
            if (r11 >= r8) goto L_0x05b3
            r0 = r10[r11]
            X.4S8 r0 = r0.A03
            int r0 = r0.A01
            long[] r0 = new long[r0]
            r7[r11] = r0
            r0 = r10[r11]
            X.4S8 r0 = r0.A03
            long[] r0 = r0.A07
            r0 = r0[r5]
            r4[r11] = r0
            int r11 = r11 + 1
            goto L_0x059a
        L_0x05b3:
            r17 = 0
        L_0x05b5:
            if (r2 >= r8) goto L_0x05f5
            r15 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r14 = -1
            r1 = 0
        L_0x05be:
            if (r1 >= r8) goto L_0x05d0
            boolean r0 = r3[r1]
            if (r0 != 0) goto L_0x05cd
            r11 = r4[r1]
            int r0 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r0 > 0) goto L_0x05cd
            r15 = r4[r1]
            r14 = r1
        L_0x05cd:
            int r1 = r1 + 1
            goto L_0x05be
        L_0x05d0:
            r13 = r6[r14]
            r12 = r7[r14]
            r12[r13] = r17
            r0 = r10[r14]
            X.4S8 r11 = r0.A03
            int[] r0 = r11.A05
            r0 = r0[r13]
            long r0 = (long) r0
            long r17 = r17 + r0
            r5 = 1
            int r1 = r13 + 1
            r6[r14] = r1
            int r0 = r12.length
            if (r1 >= r0) goto L_0x05f0
            long[] r0 = r11.A07
            r0 = r0[r1]
            r4[r14] = r0
            goto L_0x05b5
        L_0x05f0:
            r3[r14] = r5
            int r2 = r2 + 1
            goto L_0x05b5
        L_0x05f5:
            r9.A0E = r7
            r25.A8W()
            r0 = r25
            r0.AdD(r9)
            r32.clear()
            r0 = 2
            r9.A04 = r0
            goto L_0x0000
        L_0x0607:
            boolean r0 = r32.isEmpty()
            if (r0 != 0) goto L_0x0000
            java.lang.Object r0 = r32.peek()
            X.3Us r0 = (X.C65423Us) r0
            java.util.List r0 = r0.A01
            r0.add(r8)
            goto L_0x0000
        L_0x061a:
            r0 = move-exception
            r11.A0S(r5)
            throw r0
        L_0x061f:
            int r1 = r9.A04
            r0 = 2
            if (r1 == r0) goto L_0x0629
            r0 = 0
            r9.A04 = r0
            r9.A00 = r0
        L_0x0629:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C96754oq.A00(long):void");
    }

    public long ABr() {
        return this.A0A;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002b, code lost:
        if (r3 == -1) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0090, code lost:
        if (r7 == -1) goto L_0x0092;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass4VV AFq(long r13) {
        /*
            r12 = this;
            X.4LR[] r1 = r12.A0D
            int r0 = r1.length
            if (r0 == 0) goto L_0x002d
            int r0 = r12.A03
            r8 = -1
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r0 == r8) goto L_0x005d
            r0 = r1[r0]
            X.4S8 r9 = r0.A03
            long[] r1 = r9.A07
            r0 = 0
            int r3 = X.AnonymousClass3C1.A04(r1, r13, r0)
        L_0x001a:
            if (r3 < 0) goto L_0x0027
            int[] r0 = r9.A04
            r0 = r0[r3]
            r0 = r0 & 1
            if (r0 != 0) goto L_0x0035
            int r3 = r3 + -1
            goto L_0x001a
        L_0x0027:
            int r3 = r9.A00(r13)
            if (r3 != r8) goto L_0x0035
        L_0x002d:
            X.4bi r1 = X.C89174bi.A02
            X.4VV r0 = new X.4VV
            r0.<init>(r1, r1)
            return r0
        L_0x0035:
            long[] r2 = r9.A07
            r6 = r2[r3]
            long[] r1 = r9.A06
            r4 = r1[r3]
            int r0 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r0 >= 0) goto L_0x0055
            int r0 = r9.A01
            int r0 = r0 + -1
            if (r3 >= r0) goto L_0x0055
            int r0 = r9.A00(r13)
            if (r0 == r8) goto L_0x0055
            if (r0 == r3) goto L_0x0055
            r2 = r2[r0]
            r0 = r1[r0]
        L_0x0053:
            r13 = r6
            goto L_0x0069
        L_0x0055:
            r0 = -1
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x0053
        L_0x005d:
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r0 = -1
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x0069:
            r8 = 0
        L_0x006a:
            X.4LR[] r7 = r12.A0D
            int r6 = r7.length
            if (r8 >= r6) goto L_0x00c6
            int r6 = r12.A03
            if (r8 == r6) goto L_0x00ba
            r6 = r7[r8]
            X.4S8 r9 = r6.A03
            long[] r7 = r9.A07
            r6 = 0
            int r7 = X.AnonymousClass3C1.A04(r7, r13, r6)
        L_0x007e:
            if (r7 < 0) goto L_0x008b
            int[] r6 = r9.A04
            r6 = r6[r7]
            r6 = r6 & 1
            if (r6 != 0) goto L_0x00aa
            int r7 = r7 + -1
            goto L_0x007e
        L_0x008b:
            int r7 = r9.A00(r13)
            r6 = -1
            if (r7 != r6) goto L_0x00aa
        L_0x0092:
            int r6 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r6 == 0) goto L_0x00ba
            long[] r7 = r9.A07
            r6 = 0
            int r7 = X.AnonymousClass3C1.A04(r7, r2, r6)
        L_0x009d:
            if (r7 < 0) goto L_0x00b3
            int[] r6 = r9.A04
            r6 = r6[r7]
            r6 = r6 & 1
            if (r6 != 0) goto L_0x00bd
            int r7 = r7 + -1
            goto L_0x009d
        L_0x00aa:
            long[] r6 = r9.A06
            r6 = r6[r7]
            long r4 = java.lang.Math.min(r6, r4)
            goto L_0x0092
        L_0x00b3:
            int r7 = r9.A00(r2)
            r6 = -1
            if (r7 != r6) goto L_0x00bd
        L_0x00ba:
            int r8 = r8 + 1
            goto L_0x006a
        L_0x00bd:
            long[] r6 = r9.A06
            r6 = r6[r7]
            long r0 = java.lang.Math.min(r6, r0)
            goto L_0x00ba
        L_0x00c6:
            X.4bi r6 = new X.4bi
            r6.<init>(r13, r4)
            int r4 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r4 != 0) goto L_0x00d5
            X.4VV r0 = new X.4VV
            r0.<init>(r6, r6)
            return r0
        L_0x00d5:
            X.4VV r0 = X.AnonymousClass4VV.A00(r6, r2, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C96754oq.AFq(long):X.4VV");
    }

    public void AHx(C15060qG r1) {
        this.A0B = r1;
    }

    public boolean AJe() {
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0054, code lost:
        if (r6 == false) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0058, code lost:
        if (r15 < r17) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005a, code lost:
        r6 = r1;
        r17 = r15;
        r23 = r7;
        r19 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0063, code lost:
        if (r8 >= r21) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0065, code lost:
        r12 = r1;
        r5 = r7;
        r21 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006d, code lost:
        if (true == r6) goto L_0x0056;
     */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x0260 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x013a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int AbN(X.C55142iu r27, X.AnonymousClass4Bt r28) {
        /*
            r26 = this;
        L_0x0000:
            r2 = r26
            int r0 = r2.A04
            r11 = r27
            if (r0 == 0) goto L_0x00f3
            r13 = 1
            r14 = r28
            if (r0 == r13) goto L_0x0070
            long r24 = r11.AF7()
            int r5 = r2.A08
            r10 = -1
            if (r5 != r10) goto L_0x0280
            r5 = -1
            r23 = -1
            r7 = 0
            r21 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r12 = 1
            r19 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r6 = 1
            r17 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L_0x002b:
            X.4LR[] r1 = r2.A0D
            int r0 = r1.length
            if (r7 >= r0) goto L_0x0264
            r0 = r1[r7]
            int r3 = r0.A00
            X.4S8 r1 = r0.A03
            int r0 = r1.A01
            if (r3 == r0) goto L_0x0069
            long[] r0 = r1.A06
            r15 = r0[r3]
            long[][] r0 = r2.A0E
            r0 = r0[r7]
            r8 = r0[r3]
            long r15 = r15 - r24
            r3 = 0
            int r0 = (r15 > r3 ? 1 : (r15 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x006c
            r3 = 262144(0x40000, double:1.295163E-318)
            int r0 = (r15 > r3 ? 1 : (r15 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x006c
            r1 = 0
            if (r6 != 0) goto L_0x005a
        L_0x0056:
            int r0 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r0 >= 0) goto L_0x0061
        L_0x005a:
            r6 = r1
            r17 = r15
            r23 = r7
            r19 = r8
        L_0x0061:
            int r0 = (r8 > r21 ? 1 : (r8 == r21 ? 0 : -1))
            if (r0 >= 0) goto L_0x0069
            r12 = r1
            r5 = r7
            r21 = r8
        L_0x0069:
            int r7 = r7 + 1
            goto L_0x002b
        L_0x006c:
            r1 = 1
            if (r13 != r6) goto L_0x0061
            goto L_0x0056
        L_0x0070:
            long r3 = r2.A09
            int r8 = r2.A00
            long r0 = (long) r8
            long r3 = r3 - r0
            long r0 = r11.AF7()
            long r0 = r0 + r3
            X.4eH r6 = r2.A0C
            if (r6 == 0) goto L_0x00d4
            byte[] r7 = r6.A02
            int r5 = (int) r3
            r11.readFully(r7, r8, r5)
            int r4 = r2.A01
            r3 = 1718909296(0x66747970, float:2.8862439E23)
            if (r4 != r3) goto L_0x00b9
            r3 = 8
            int r4 = X.C90504eH.A03(r6, r3)
            r3 = 1751476579(0x68656963, float:4.333464E24)
            if (r4 == r3) goto L_0x00b7
            r3 = 1903435808(0x71742020, float:1.2088509E30)
            if (r4 == r3) goto L_0x00e4
            r3 = 4
            r6.A0T(r3)
        L_0x00a0:
            int r3 = X.C90504eH.A00(r6)
            if (r3 <= 0) goto L_0x00b5
            int r4 = r6.A07()
            r3 = 1751476579(0x68656963, float:4.333464E24)
            if (r4 == r3) goto L_0x00b7
            r3 = 1903435808(0x71742020, float:1.2088509E30)
            if (r4 == r3) goto L_0x00e4
            goto L_0x00a0
        L_0x00b5:
            r3 = 0
            goto L_0x00e5
        L_0x00b7:
            r3 = 2
            goto L_0x00e5
        L_0x00b9:
            java.util.ArrayDeque r4 = r2.A0K
            boolean r3 = r4.isEmpty()
            if (r3 != 0) goto L_0x00e7
            java.lang.Object r5 = r4.peek()
            X.3Us r5 = (X.C65423Us) r5
            int r3 = r2.A01
            X.3Ur r4 = new X.3Ur
            r4.<init>(r6, r3)
            java.util.List r3 = r5.A02
            r3.add(r4)
            goto L_0x00e7
        L_0x00d4:
            r6 = 262144(0x40000, double:1.295163E-318)
            int r5 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r5 >= 0) goto L_0x00e0
            int r5 = (int) r3
            r11.Afx(r5)
            goto L_0x00e7
        L_0x00e0:
            r14.A00 = r0
            r3 = 1
            goto L_0x00e8
        L_0x00e4:
            r3 = 1
        L_0x00e5:
            r2.A02 = r3
        L_0x00e7:
            r3 = 0
        L_0x00e8:
            r2.A00(r0)
            if (r3 == 0) goto L_0x0000
            int r1 = r2.A04
            r0 = 2
            if (r1 == r0) goto L_0x0000
            return r13
        L_0x00f3:
            int r0 = r2.A00
            r9 = 1
            r8 = 8
            r7 = 0
            if (r0 != 0) goto L_0x0116
            X.4eH r3 = r2.A0G
            byte[] r0 = r3.A02
            boolean r0 = r11.AbV(r0, r7, r8, r9)
            if (r0 == 0) goto L_0x027e
            r2.A00 = r8
            r3.A0S(r7)
            long r0 = r3.A0I()
            r2.A09 = r0
            int r0 = r3.A07()
            r2.A01 = r0
        L_0x0116:
            long r0 = r2.A09
            r4 = 1
            int r3 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r3 != 0) goto L_0x01e2
            X.4eH r1 = r2.A0G
            byte[] r0 = r1.A02
            r11.readFully(r0, r8, r8)
            int r0 = r2.A00
            int r0 = r0 + 8
            r2.A00 = r0
            long r3 = r1.A0J()
        L_0x012f:
            r2.A09 = r3
        L_0x0131:
            long r5 = r2.A09
            int r1 = r2.A00
            long r3 = (long) r1
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x0260
            int r10 = r2.A01
            r0 = 1836019574(0x6d6f6f76, float:4.631354E27)
            if (r10 == r0) goto L_0x020d
            r0 = 1953653099(0x7472616b, float:7.681346E31)
            if (r10 == r0) goto L_0x020d
            r0 = 1835297121(0x6d646961, float:4.4181236E27)
            if (r10 == r0) goto L_0x020d
            r0 = 1835626086(0x6d696e66, float:4.515217E27)
            if (r10 == r0) goto L_0x020d
            r0 = 1937007212(0x7374626c, float:1.9362132E31)
            if (r10 == r0) goto L_0x020d
            r0 = 1701082227(0x65647473, float:6.742798E22)
            if (r10 == r0) goto L_0x020d
            r0 = 1835365473(0x6d657461, float:4.4382975E27)
            if (r10 == r0) goto L_0x020d
            r0 = 1835296868(0x6d646864, float:4.418049E27)
            if (r10 == r0) goto L_0x01c0
            r0 = 1836476516(0x6d766864, float:4.7662196E27)
            if (r10 == r0) goto L_0x01c0
            r0 = 1751411826(0x68646c72, float:4.3148E24)
            if (r10 == r0) goto L_0x01c0
            r0 = 1937011556(0x73747364, float:1.9367383E31)
            if (r10 == r0) goto L_0x01c0
            r0 = 1937011827(0x73747473, float:1.9367711E31)
            if (r10 == r0) goto L_0x01c0
            r0 = 1937011571(0x73747373, float:1.9367401E31)
            if (r10 == r0) goto L_0x01c0
            r0 = 1668576371(0x63747473, float:4.5093966E21)
            if (r10 == r0) goto L_0x01c0
            r0 = 1701606260(0x656c7374, float:6.9788014E22)
            if (r10 == r0) goto L_0x01c0
            r0 = 1937011555(0x73747363, float:1.9367382E31)
            if (r10 == r0) goto L_0x01c0
            r0 = 1937011578(0x7374737a, float:1.936741E31)
            if (r10 == r0) goto L_0x01c0
            r0 = 1937013298(0x73747a32, float:1.9369489E31)
            if (r10 == r0) goto L_0x01c0
            r0 = 1937007471(0x7374636f, float:1.9362445E31)
            if (r10 == r0) goto L_0x01c0
            r0 = 1668232756(0x636f3634, float:4.4126776E21)
            if (r10 == r0) goto L_0x01c0
            r0 = 1953196132(0x746b6864, float:7.46037E31)
            if (r10 == r0) goto L_0x01c0
            r0 = 1718909296(0x66747970, float:2.8862439E23)
            if (r10 == r0) goto L_0x01c0
            r0 = 1969517665(0x75647461, float:2.8960062E32)
            if (r10 == r0) goto L_0x01c0
            r0 = 1801812339(0x6b657973, float:2.7741754E26)
            if (r10 == r0) goto L_0x01c0
            r0 = 1768715124(0x696c7374, float:1.7865732E25)
            if (r10 == r0) goto L_0x01c0
            r3 = 0
        L_0x01ba:
            r2.A0C = r3
            r2.A04 = r9
            goto L_0x0000
        L_0x01c0:
            boolean r0 = X.AnonymousClass000.A1R(r1, r8)
            X.C90524eJ.A04(r0)
            r3 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            boolean r0 = X.AnonymousClass3K4.A18(r0)
            X.C90524eJ.A04(r0)
            int r0 = (int) r5
            X.4eH r3 = X.C90504eH.A05(r0)
            X.4eH r0 = r2.A0G
            byte[] r1 = r0.A02
            byte[] r0 = r3.A02
            java.lang.System.arraycopy(r1, r7, r0, r7, r8)
            goto L_0x01ba
        L_0x01e2:
            r4 = 0
            int r3 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r3 != 0) goto L_0x0131
            long r3 = r11.getLength()
            r5 = -1
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x01fe
            java.util.ArrayDeque r0 = r2.A0K
            java.lang.Object r0 = r0.peek()
            X.3Us r0 = (X.C65423Us) r0
            if (r0 == 0) goto L_0x01fe
            long r3 = r0.A00
        L_0x01fe:
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x0131
            long r0 = r11.AF7()
            long r3 = r3 - r0
            int r0 = r2.A00
            long r0 = (long) r0
            long r3 = r3 + r0
            goto L_0x012f
        L_0x020d:
            long r0 = r11.AF7()
            long r0 = r0 + r5
            long r0 = r0 - r3
            int r9 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r9 == 0) goto L_0x0240
            r3 = 1835365473(0x6d657461, float:4.4382975E27)
            if (r10 != r3) goto L_0x0240
            X.4eH r6 = r2.A0J
            r6.A0Q(r8)
            X.C90504eH.A06(r11, r6, r8)
            int r5 = r6.A01
            r3 = 4
            r6.A0T(r3)
            int r4 = r6.A07()
            r3 = 1751411826(0x68646c72, float:4.3148E24)
            if (r4 == r3) goto L_0x0235
            int r5 = r5 + 4
        L_0x0235:
            r6.A0S(r5)
            int r3 = r6.A01
            r11.Afx(r3)
            r11.AcS()
        L_0x0240:
            java.util.ArrayDeque r5 = r2.A0K
            int r4 = r2.A01
            X.3Us r3 = new X.3Us
            r3.<init>(r4, r0)
            r5.push(r3)
            long r8 = r2.A09
            int r3 = r2.A00
            long r4 = (long) r3
            int r3 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r3 != 0) goto L_0x025a
            r2.A00(r0)
            goto L_0x0000
        L_0x025a:
            r2.A04 = r7
            r2.A00 = r7
            goto L_0x0000
        L_0x0260:
            java.lang.String r0 = "Atom size less than header length (unsupported)."
            goto L_0x0307
        L_0x0264:
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r21 > r3 ? 1 : (r21 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x0278
            if (r12 == 0) goto L_0x0278
            r0 = 10485760(0xa00000, double:5.180654E-317)
            long r21 = r21 + r0
            int r0 = (r19 > r21 ? 1 : (r19 == r21 ? 0 : -1))
            if (r0 >= 0) goto L_0x027a
        L_0x0278:
            r5 = r23
        L_0x027a:
            r2.A08 = r5
            if (r5 != r10) goto L_0x0280
        L_0x027e:
            r0 = -1
            return r0
        L_0x0280:
            X.4LR[] r0 = r2.A0D
            r9 = r0[r5]
            X.1gS r8 = r9.A01
            int r12 = r9.A00
            X.4S8 r1 = r9.A03
            long[] r0 = r1.A06
            r6 = r0[r12]
            int[] r0 = r1.A05
            r5 = r0[r12]
            long r3 = r6 - r24
            int r0 = r2.A05
            long r0 = (long) r0
            long r3 = r3 + r0
            r15 = 0
            int r0 = (r3 > r15 ? 1 : (r3 == r15 ? 0 : -1))
            if (r0 < 0) goto L_0x0368
            r15 = 262144(0x40000, double:1.295163E-318)
            int r0 = (r3 > r15 ? 1 : (r3 == r15 ? 0 : -1))
            if (r0 >= 0) goto L_0x0368
            X.4Or r0 = r9.A02
            int r0 = r0.A02
            if (r0 != r13) goto L_0x02b0
            r0 = 8
            long r3 = r3 + r0
            int r5 = r5 + -8
        L_0x02b0:
            int r0 = (int) r3
            r11.Afx(r0)
            X.4Or r0 = r9.A02
            int r7 = r0.A01
            r1 = 0
            if (r7 == 0) goto L_0x030c
            X.4eH r6 = r2.A0H
            byte[] r4 = r6.A02
            r4[r1] = r1
            r4[r13] = r1
            r0 = 2
            r4[r0] = r1
            int r13 = 4 - r7
        L_0x02c8:
            int r0 = r2.A06
            if (r0 >= r5) goto L_0x0347
            int r0 = r2.A07
            if (r0 != 0) goto L_0x02f1
            r11.readFully(r4, r13, r7)
            int r0 = r2.A05
            int r0 = r0 + r7
            r2.A05 = r0
            int r0 = X.C90504eH.A03(r6, r1)
            if (r0 < 0) goto L_0x0305
            r2.A07 = r0
            X.4eH r3 = r2.A0I
            r3.A0S(r1)
            r0 = 4
            r8.Acw(r3, r0)
            int r0 = r2.A06
            int r0 = r0 + 4
            r2.A06 = r0
            int r5 = r5 + r13
            goto L_0x02c8
        L_0x02f1:
            int r3 = r8.Acz(r11, r0, r1, r1)
            int r0 = r2.A05
            int r0 = r0 + r3
            r2.A05 = r0
            int r0 = r2.A06
            int r0 = r0 + r3
            r2.A06 = r0
            int r0 = r2.A07
            int r0 = r0 - r3
            r2.A07 = r0
            goto L_0x02c8
        L_0x0305:
            java.lang.String r0 = "Invalid NAL length"
        L_0x0307:
            X.40M r0 = X.AnonymousClass40M.A00(r0)
            throw r0
        L_0x030c:
            X.1gT r0 = r0.A07
            java.lang.String r3 = r0.A0T
            java.lang.String r0 = "audio/ac4"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x032d
            int r0 = r2.A06
            if (r0 != 0) goto L_0x032b
            X.4eH r3 = r2.A0J
            X.C89654cc.A00(r3, r5)
            r0 = 7
            r8.Acw(r3, r0)
            int r0 = r2.A06
            int r0 = r0 + 7
            r2.A06 = r0
        L_0x032b:
            int r5 = r5 + 7
        L_0x032d:
            int r0 = r2.A06
            if (r0 >= r5) goto L_0x0347
            int r0 = r5 - r0
            int r3 = r8.Acz(r11, r0, r1, r1)
            int r0 = r2.A05
            int r0 = r0 + r3
            r2.A05 = r0
            int r0 = r2.A06
            int r0 = r0 + r3
            r2.A06 = r0
            int r0 = r2.A07
            int r0 = r0 - r3
            r2.A07 = r0
            goto L_0x032d
        L_0x0347:
            X.4S8 r3 = r9.A03
            long[] r0 = r3.A07
            r16 = r0[r12]
            int[] r0 = r3.A04
            r13 = r0[r12]
            r12 = 0
            r15 = 0
            r14 = r5
            r11 = r8
            r11.Ad0(r12, r13, r14, r15, r16)
            int r0 = r9.A00
            int r0 = r0 + 1
            r9.A00 = r0
            r2.A08 = r10
            r2.A05 = r1
            r2.A06 = r1
            r2.A07 = r1
            r0 = 0
            return r0
        L_0x0368:
            r14.A00 = r6
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C96754oq.AbN(X.2iu, X.4Bt):int");
    }

    public void AdC(long j2, long j3) {
        this.A0K.clear();
        this.A00 = 0;
        this.A08 = -1;
        this.A05 = 0;
        this.A06 = 0;
        this.A07 = 0;
        if (j2 == 0) {
            this.A04 = 0;
            this.A00 = 0;
            return;
        }
        AnonymousClass4LR[] r6 = this.A0D;
        if (r6 != null) {
            for (AnonymousClass4LR r3 : r6) {
                AnonymousClass4S8 r2 = r3.A03;
                int A042 = AnonymousClass3C1.A04(r2.A07, j3, false);
                while (true) {
                    if (A042 >= 0) {
                        if ((r2.A04[A042] & 1) != 0) {
                            break;
                        }
                        A042--;
                    } else {
                        A042 = r2.A00(j3);
                        break;
                    }
                }
                r3.A00 = A042;
            }
        }
    }

    public boolean Afz(C55142iu r2) {
        return AnonymousClass4YJ.A00(r2, false);
    }
}
