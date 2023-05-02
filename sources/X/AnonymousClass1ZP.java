package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.obwhatsapp.R;
import com.obwhatsapp.mentions.MentionableEntry;
import com.obwhatsapp.videoplayback.YoutubePlayerTouchOverlay;
import com.whatsapp.Mp4Ops;
import com.whatsapp.util.Log;
import java.net.URL;

/* renamed from: X.1ZP  reason: invalid class name */
public class AnonymousClass1ZP implements AnonymousClass1ZQ {
    public double A00;
    public int A01 = 0;
    public int A02 = 3;
    public int A03 = 0;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public FrameLayout A08;
    public AnonymousClass4E5 A09;
    public C28381Vw A0A;
    public C55322jK A0B;
    public AnonymousClass2Cx A0C;
    public C86094Re A0D;
    public AnonymousClass29D A0E;
    public String A0F;
    public URL A0G;
    public URL A0H;
    public boolean A0I;
    public boolean A0J;
    public final Context A0K;
    public final Rect A0L = new Rect();
    public final C19980zJ A0M;
    public final C16300so A0N;
    public final AnonymousClass2Z8 A0O;
    public final C14870pt A0P;
    public final Mp4Ops A0Q;
    public final C17130ua A0R;
    public final AnonymousClass01V A0S;
    public final C16980tz A0T;
    public final AnonymousClass013 A0U;
    public final C14710pd A0V;
    public final C16320sq A0W;
    public final C85464Oo A0X;

    public AnonymousClass1ZP(Context context, C19980zJ r3, C16300so r4, AnonymousClass2Z8 r5, C14870pt r6, Mp4Ops mp4Ops, C17130ua r8, AnonymousClass01V r9, C16980tz r10, AnonymousClass013 r11, C14710pd r12, C16490t9 r13, C16320sq r14) {
        this.A0T = r10;
        this.A0K = context;
        this.A0Q = mp4Ops;
        this.A0V = r12;
        this.A0P = r6;
        this.A0N = r4;
        this.A0W = r14;
        this.A0R = r8;
        this.A0M = r3;
        this.A0S = r9;
        this.A0U = r11;
        this.A0X = new C85464Oo(r13);
        this.A0O = r5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002d, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002e, code lost:
        com.whatsapp.util.Log.w("Failed to fetch author thumbnail", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0033, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x002d A[ExcHandler: IOException | URISyntaxException (r1v0 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void A01(X.AnonymousClass1ZR r4, X.AnonymousClass1ZP r5) {
        /*
            java.net.URL r0 = r4.A0L     // Catch:{ IOException | URISyntaxException -> 0x002d }
            if (r0 == 0) goto L_0x000e
            java.lang.String r0 = r0.toString()     // Catch:{ IOException | URISyntaxException -> 0x002d }
            byte[] r0 = r4.A0J(r0)     // Catch:{ IOException | URISyntaxException -> 0x002d }
            r4.A0S = r0     // Catch:{ IOException | URISyntaxException -> 0x002d }
        L_0x000e:
            android.graphics.Bitmap r3 = r4.A07     // Catch:{ IOException | URISyntaxException -> 0x002d }
            if (r3 != 0) goto L_0x0020
            byte[] r2 = r4.A0S     // Catch:{ IOException | URISyntaxException -> 0x002d }
            if (r2 == 0) goto L_0x0020
            r1 = 0
            int r0 = r2.length     // Catch:{ OutOfMemoryError -> 0x001f, IOException | URISyntaxException -> 0x002d }
            android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeByteArray(r2, r1, r0)     // Catch:{ OutOfMemoryError -> 0x001f, IOException | URISyntaxException -> 0x002d }
            r4.A07 = r3     // Catch:{ OutOfMemoryError -> 0x001f, IOException | URISyntaxException -> 0x002d }
            goto L_0x0020
        L_0x001f:
            r3 = 0
        L_0x0020:
            X.0pt r2 = r5.A0P     // Catch:{ IOException | URISyntaxException -> 0x002d }
            r1 = 25
            com.facebook.redex.RunnableRunnableShape11S0200000_I0_9 r0 = new com.facebook.redex.RunnableRunnableShape11S0200000_I0_9     // Catch:{ IOException | URISyntaxException -> 0x002d }
            r0.<init>(r5, r1, r3)     // Catch:{ IOException | URISyntaxException -> 0x002d }
            r2.A0K(r0)     // Catch:{ IOException | URISyntaxException -> 0x002d }
            return
        L_0x002d:
            r1 = move-exception
            java.lang.String r0 = "Failed to fetch author thumbnail"
            com.whatsapp.util.Log.w(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1ZP.A01(X.1ZR, X.1ZP):void");
    }

    public static /* synthetic */ void A02(AnonymousClass1ZP r6) {
        AnonymousClass1ZP r4 = r6;
        String str = r6.A0F;
        C46212Cy.A02(r4.A0K, r4.A0M, r4.A0X, r4, 1, str);
    }

    public static /* synthetic */ void A03(AnonymousClass1ZP r6) {
        AnonymousClass1ZP r4 = r6;
        URL url = r6.A0G;
        C46212Cy.A02(r4.A0K, r4.A0M, r4.A0X, r4, 3, url != null ? url.toString() : r6.A0F);
    }

    public static /* synthetic */ void A04(AnonymousClass1ZP r2) {
        boolean A0A2 = r2.A0C.A0A();
        AnonymousClass2Cx r0 = r2.A0C;
        if (A0A2) {
            r0.A0K();
        } else {
            r0.A0L();
        }
    }

    public static /* synthetic */ void A05(AnonymousClass1ZP r6) {
        AnonymousClass1ZP r4 = r6;
        URL url = r6.A0H;
        C46212Cy.A02(r4.A0K, r4.A0M, r4.A0X, r4, 2, url != null ? url.toString() : r6.A0F);
    }

    public static /* synthetic */ void A06(AnonymousClass1ZP r1) {
        if (r1.A0J) {
            r1.A8r(false);
        } else {
            r1.A8Z();
        }
    }

    public static /* synthetic */ void A07(AnonymousClass1ZP r5, String str) {
        Context context = r5.A0K;
        C85464Oo r3 = r5.A0X;
        C46212Cy.A02(context, r5.A0M, r3, r5, 4, str);
    }

    public static /* synthetic */ boolean A08(MotionEvent motionEvent, AnonymousClass1ZP r2) {
        if (!AnonymousClass2JP.A06(r2.A0S.A0P()) || motionEvent.getActionMasked() != 10) {
            return false;
        }
        r2.A08.requestFocus();
        r2.A08.performClick();
        return true;
    }

    /* JADX WARNING: type inference failed for: r1v26, types: [X.29D] */
    /* JADX WARNING: type inference failed for: r16v3, types: [X.29C] */
    /* JADX WARNING: type inference failed for: r16v4, types: [X.37g] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0008: MOVE  (r27v0 X.1Vw) = (r32v0 X.1Vw)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:122)
        	at jadx.core.dex.visitors.regions.TernaryMod.visitRegion(TernaryMod.java:34)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:73)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:31)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x029c  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x02aa  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x02cb  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x02df  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x03d5  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0410  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0444  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01d0  */
    public void A09(X.AnonymousClass1ZR r29, X.C76703uY r30, X.C16740tZ r31, X.C28381Vw r32, android.graphics.Bitmap[] r33, int r34) {
        /*
            r28 = this;
            r5 = r28
            X.29D r0 = r5.A0E
            if (r0 != 0) goto L_0x0447
            X.1Vw r1 = r5.A0A
            r27 = r32
            r0 = r27
            if (r0 != r1) goto L_0x0447
            r0 = 2
            r6 = r34
            if (r6 == r0) goto L_0x001a
            r0 = 5
            if (r6 == r0) goto L_0x001a
            r0 = 3
            r13 = 0
            if (r6 != r0) goto L_0x001b
        L_0x001a:
            r13 = 1
        L_0x001b:
            r12 = 0
            r8 = r29
            if (r29 == 0) goto L_0x006e
            if (r13 == 0) goto L_0x006e
            java.lang.String r4 = r8.A0I
            java.lang.String r3 = r8.A0J
            if (r4 == 0) goto L_0x006c
            if (r3 == 0) goto L_0x006c
            X.013 r0 = r5.A0U
            boolean r2 = r0.A0T()
            java.lang.String r1 = " - "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            if (r2 == 0) goto L_0x005f
            r0.<init>()
            r0.append(r3)
            r0.append(r1)
            r0.append(r4)
        L_0x0042:
            java.lang.String r7 = r0.toString()
        L_0x0046:
            java.net.URL r0 = r8.A0O
            r5.A0H = r0
            java.net.URL r0 = r8.A0M
            r5.A0G = r0
        L_0x004e:
            r16 = r30
            if (r30 != 0) goto L_0x0086
            java.lang.String r0 = "InlineVideoPlaybackImplHandler/startInlinePlayback - loadPage returned null.  Opening video externally"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r0 = r5.A0F
            X.197 r1 = X.C87664Ya.A00
            monitor-enter(r1)
            if (r0 == 0) goto L_0x0073
            goto L_0x0070
        L_0x005f:
            r0.<init>()
            r0.append(r4)
            r0.append(r1)
            r0.append(r3)
            goto L_0x0042
        L_0x006c:
            r7 = 0
            goto L_0x0046
        L_0x006e:
            r7 = r12
            goto L_0x004e
        L_0x0070:
            r1.remove(r0)     // Catch:{ all -> 0x0083 }
        L_0x0073:
            monitor-exit(r1)     // Catch:{ all -> 0x0083 }
            java.lang.String r0 = r5.A0F
            android.content.Context r1 = r5.A0K
            X.4Oo r3 = r5.A0X
            X.0zJ r2 = r5.A0M
            r4 = r5
            r5 = r12
            r6 = r0
            X.C46212Cy.A02(r1, r2, r3, r4, r5, r6)
            return
        L_0x0083:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0083 }
            throw r0
        L_0x0086:
            X.4Oo r4 = r5.A0X
            X.4Wp r0 = r4.A07
            r0.A02()
            X.4Wp r0 = r4.A08
            r0.A02()
            X.4Re r2 = r5.A0D
            if (r2 == 0) goto L_0x009e
            r1 = 2
            r0 = r27
            r2.A03(r0, r1)
            r5.A02 = r1
        L_0x009e:
            r0 = r16
            int r9 = r0.A00
            r1 = -1
            if (r9 == r1) goto L_0x017f
            int r0 = r0.A01
            if (r0 == r1) goto L_0x017f
            double r2 = (double) r0
            double r0 = (double) r9
            double r2 = r2 / r0
        L_0x00ac:
            double r0 = r5.A00
            double r0 = r0 / r2
            double r0 = java.lang.Math.sqrt(r0)
            int r9 = (int) r0
            r5.A05 = r9
            double r0 = (double) r9
            double r0 = r0 * r2
            int r2 = (int) r0
            r5.A07 = r2
            r5.A04 = r9
            android.content.Context r10 = r5.A0K
            android.content.res.Resources r1 = r10.getResources()
            r0 = 2131166311(0x7f070467, float:1.7946864E38)
            int r1 = r1.getDimensionPixelSize(r0)
            int r0 = r5.A04
            int r0 = r0 + r1
            r5.A04 = r0
            android.content.res.Resources r1 = r10.getResources()
            r0 = 2131166312(0x7f070468, float:1.7946866E38)
            float r0 = r1.getDimension(r0)
            int r3 = (int) r0
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 21
            if (r1 >= r0) goto L_0x0178
            android.widget.FrameLayout r2 = new android.widget.FrameLayout
            r2.<init>(r10)
        L_0x00e6:
            r5.A08 = r2
            boolean r0 = r2 instanceof X.C79153zH
            if (r0 == 0) goto L_0x00f4
            r1 = r2
            X.3zH r1 = (X.C79153zH) r1
            boolean r0 = r5.A0J
            r1.setIsFullscreen(r0)
        L_0x00f4:
            r0 = 2131889027(0x7f120b83, float:1.9412706E38)
            java.lang.String r0 = r10.getString(r0)
            r2.setContentDescription(r0)
            android.widget.FrameLayout r0 = r5.A08
            r2 = 1
            r0.setFocusable(r2)
            android.widget.FrameLayout r0 = r5.A08
            r0.setImportantForAccessibility(r2)
            android.widget.FrameLayout r0 = r5.A08
            r0.setFocusableInTouchMode(r2)
            X.2jK r1 = r5.A0B
            X.52x r0 = new X.52x
            r0.<init>(r5)
            r1.A0G = r0
            r5.A0I = r2
            android.widget.FrameLayout r1 = r5.A08
            r0 = 1086324736(0x40c00000, float:6.0)
            X.C004601z.A0X(r1, r0)
            android.widget.FrameLayout r9 = new android.widget.FrameLayout
            r9.<init>(r10)
            android.widget.FrameLayout r0 = r5.A08
            r0.addView(r9)
            X.2Cw r0 = new X.2Cw
            r0.<init>(r10, r4, r6, r2)
            r5.A0C = r0
            r11 = 0
            r0 = r33[r11]
            if (r0 == 0) goto L_0x0152
            X.0pd r2 = r5.A0V
            r1 = 1052(0x41c, float:1.474E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r2.A0E(r0, r1)
            if (r0 != 0) goto L_0x0152
            X.2Cx r1 = r5.A0C
            r0 = 2131362144(0x7f0a0160, float:1.834406E38)
            android.view.View r1 = X.C004601z.A0E(r1, r0)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r0 = r33[r11]
            r1.setImageBitmap(r0)
        L_0x0152:
            if (r7 == 0) goto L_0x0172
            X.0pd r2 = r5.A0V
            r1 = 1912(0x778, float:2.679E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r2.A0E(r0, r1)
            if (r0 == 0) goto L_0x0172
            X.2Cx r0 = r5.A0C
            X.2Cw r0 = (X.C46202Cw) r0
            r0.setVideoAttribution(r7)
            X.2Cx r2 = r5.A0C
            r1 = 3
            com.facebook.redex.IDxCListenerShape263S0100000_2_I0 r0 = new com.facebook.redex.IDxCListenerShape263S0100000_2_I0
            r0.<init>(r5, r1)
            r2.setMusicAttributionClickListener(r0)
        L_0x0172:
            if (r13 == 0) goto L_0x0175
            r12 = r8
        L_0x0175:
            java.lang.String r1 = r5.A0F
            goto L_0x019c
        L_0x0178:
            X.3zH r2 = new X.3zH
            r2.<init>(r10, r3)
            goto L_0x00e6
        L_0x017f:
            r0 = 4
            if (r6 != r0) goto L_0x0195
            r0 = r16
            java.lang.String r1 = r0.A02
            java.lang.String r0 = "/shorts/"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x0195
            r2 = 4603237813974170650(0x3fe1fc671e937c1a, double:0.5620608899297423)
            goto L_0x00ac
        L_0x0195:
            r2 = 4610685218510194460(0x3ffc71c71c71c71c, double:1.7777777777777777)
            goto L_0x00ac
        L_0x019c:
            java.net.URL r0 = new java.net.URL     // Catch:{ MalformedURLException -> 0x020b }
            r0.<init>(r1)     // Catch:{ MalformedURLException -> 0x020b }
            java.lang.String r2 = r0.getHost()     // Catch:{ MalformedURLException -> 0x020b }
            r0 = 2
            if (r6 == r0) goto L_0x01b3
            r0 = 3
            if (r6 == r0) goto L_0x01af
            r0 = 5
            if (r6 == r0) goto L_0x01b3
            goto L_0x020f
        L_0x01af:
            r1 = 2131231801(0x7f080439, float:1.8079693E38)
            goto L_0x01b6
        L_0x01b3:
            r1 = 2131231798(0x7f080436, float:1.8079687E38)
        L_0x01b6:
            java.lang.String[] r0 = X.C30931dC.A03     // Catch:{ MalformedURLException -> 0x020b }
            java.lang.String r0 = X.C30931dC.A03(r2, r0)     // Catch:{ MalformedURLException -> 0x020b }
            X.C18450wi.A0B(r0)     // Catch:{ MalformedURLException -> 0x020b }
            X.3uX r2 = new X.3uX     // Catch:{ MalformedURLException -> 0x020b }
            r2.<init>(r1, r0)     // Catch:{ MalformedURLException -> 0x020b }
            X.0pd r3 = r5.A0V
            r1 = 2291(0x8f3, float:3.21E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r3.A0E(r0, r1)
            if (r0 == 0) goto L_0x020f
            if (r12 == 0) goto L_0x0208
            X.2Cx r1 = r5.A0C
            java.lang.String r0 = r12.A0E
            r1.setWatchMoreVideosText(r0)
            java.net.URL r0 = r12.A0N
            if (r0 == 0) goto L_0x0208
            java.lang.String r0 = r0.toString()
        L_0x01e1:
            X.2Cx r4 = r5.A0C
            X.532 r3 = new X.532
            r3.<init>(r5, r0)
            int r2 = r2.A00
            X.2Cw r4 = (X.C46202Cw) r4
            r0 = 1
            r4.A0T = r0
            com.obwhatsapp.wds.components.button.WDSButton r1 = r4.A15
            r1.setIcon((int) r2)
            com.facebook.redex.ViewOnClickCListenerShape14S0100000_I0_7 r0 = new com.facebook.redex.ViewOnClickCListenerShape14S0100000_I0_7
            r0.<init>(r3, r11)
            r1.setOnClickListener(r0)
            com.obwhatsapp.wds.components.button.WDSButton r2 = r4.A14
            r1 = 3
            com.facebook.redex.ViewOnClickCListenerShape14S0100000_I0_7 r0 = new com.facebook.redex.ViewOnClickCListenerShape14S0100000_I0_7
            r0.<init>(r4, r1)
            r2.setOnClickListener(r0)
            goto L_0x020f
        L_0x0208:
            java.lang.String r0 = r2.A01
            goto L_0x01e1
        L_0x020b:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
        L_0x020f:
            if (r13 == 0) goto L_0x024f
            if (r29 == 0) goto L_0x024f
            java.lang.String r4 = r8.A0G
            java.lang.String r3 = r8.A0C
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto L_0x0223
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x024f
        L_0x0223:
            X.0pd r2 = r5.A0V
            r1 = 2299(0x8fb, float:3.222E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r2.A0E(r0, r1)
            if (r0 == 0) goto L_0x024f
            X.2Cx r0 = r5.A0C
            X.2Cw r0 = (X.C46202Cw) r0
            r0.setVideoCaption(r4)
            X.2Cx r2 = r5.A0C
            X.2Cw r2 = (X.C46202Cw) r2
            r1 = 2
            com.facebook.redex.IDxCListenerShape263S0100000_2_I0 r0 = new com.facebook.redex.IDxCListenerShape263S0100000_2_I0
            r0.<init>(r5, r1)
            r2.setAuthorInformation(r3, r0)
            X.0sq r2 = r5.A0W
            r1 = 26
            com.facebook.redex.RunnableRunnableShape11S0200000_I0_9 r0 = new com.facebook.redex.RunnableRunnableShape11S0200000_I0_9
            r0.<init>(r5, r1, r8)
            r2.Acl(r0)
        L_0x024f:
            X.2Cx r1 = r5.A0C
            com.facebook.redex.IDxCListenerShape263S0100000_2_I0 r0 = new com.facebook.redex.IDxCListenerShape263S0100000_2_I0
            r0.<init>(r5, r11)
            r1.setCloseButtonListener(r0)
            X.2Cx r1 = r5.A0C
            r8 = 1
            com.facebook.redex.IDxCListenerShape263S0100000_2_I0 r0 = new com.facebook.redex.IDxCListenerShape263S0100000_2_I0
            r0.<init>(r5, r8)
            r1.A09(r0, r6)
            X.2Cx r1 = r5.A0C
            r15 = 4
            com.facebook.redex.IDxCListenerShape263S0100000_2_I0 r0 = new com.facebook.redex.IDxCListenerShape263S0100000_2_I0
            r0.<init>(r5, r15)
            r1.setFullscreenButtonClickListener(r0)
            X.2Cx r0 = r5.A0C
            r9.addView(r0)
            android.widget.FrameLayout r1 = r5.A08
            X.4kO r0 = new X.4kO
            r0.<init>(r5)
            r1.setOnHoverListener(r0)
            android.widget.FrameLayout r2 = r5.A08
            r1 = 12
            com.facebook.redex.ViewOnClickCListenerShape14S0100000_I0_7 r0 = new com.facebook.redex.ViewOnClickCListenerShape14S0100000_I0_7
            r0.<init>(r5, r1)
            r2.setOnClickListener(r0)
            X.2jK r14 = r5.A0B
            android.widget.FrameLayout r13 = r5.A08
            X.4Re r2 = r5.A0D
            X.0tZ r0 = r2.A00
            X.1Vw r1 = r0.A11
            r0 = r27
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0444
            X.2kV r0 = r2.A01
            com.obwhatsapp.webpagepreview.WebPagePreviewView r0 = (com.obwhatsapp.webpagepreview.WebPagePreviewView) r0
            android.widget.FrameLayout r12 = r0.A0A
        L_0x02a2:
            int r7 = r5.A07
            int r4 = r5.A04
            boolean r0 = r14.A0P
            if (r0 == 0) goto L_0x02b4
            int r0 = r14.A07
            r14.A04 = r0
            int r0 = r14.A08
            r14.A05 = r0
            r14.A0P = r11
        L_0x02b4:
            r0 = 1065353216(0x3f800000, float:1.0)
            r14.A00 = r0
            r14.A03 = r7
            r14.A02 = r4
            int r0 = r14.A03(r7)
            r14.A04 = r0
            int r0 = r14.A04(r4)
            r14.A05 = r0
            r3 = 0
            if (r12 != 0) goto L_0x0410
            r13.setScaleX(r3)
            r13.setScaleY(r3)
            r13.setAlpha(r3)
        L_0x02d4:
            r14.A0K = r8
            r14.addView(r13, r7, r4)
            r0 = r16
            java.lang.String r0 = r0.A02
            if (r6 != r15) goto L_0x03d5
            r3 = r33[r11]
            if (r3 == 0) goto L_0x03ba
            int r2 = r5.A07
            int r1 = r5.A05
            android.graphics.Bitmap r7 = android.graphics.Bitmap.createScaledBitmap(r3, r2, r1, r11)
        L_0x02eb:
            X.2Z8 r1 = r5.A0O
            X.2Cx r14 = r5.A0C
            X.2Cw r14 = (X.C46202Cw) r14
            int r13 = r5.A05
            X.2Yk r3 = r1.A00
            X.0sX r2 = r3.A03
            X.01J r1 = r2.A05
            java.lang.Object r12 = r1.get()
            X.0pd r12 = (X.C14710pd) r12
            X.2Rg r1 = r3.A01
            android.app.Activity r6 = r1.A1p
            X.01J r1 = r2.AB3
            java.lang.Object r4 = r1.get()
            X.0pt r4 = (X.C14870pt) r4
            X.01J r1 = r2.A0P
            java.lang.Object r3 = r1.get()
            X.0zJ r3 = (X.C19980zJ) r3
            X.01J r1 = r2.A5l
            java.lang.Object r2 = r1.get()
            X.1Gj r2 = (X.C24551Gj) r2
            X.37g r1 = new X.37g
            r23 = r31
            r25 = r0
            r26 = r13
            r16 = r1
            r17 = r6
            r18 = r7
            r19 = r3
            r20 = r4
            r21 = r12
            r22 = r2
            r24 = r14
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
        L_0x0336:
            r5.A0E = r1
            android.view.View r0 = r1.A06()
            r9.addView(r0, r11)
            r9.setClipChildren(r11)
            X.2Cx r0 = r5.A0C
            r0.setClipChildren(r11)
            X.29D r0 = r5.A0E
            android.view.View r2 = r0.A06()
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            int r0 = r5.A05
            r1.height = r0
            r0 = -1
            r1.width = r0
            r2.setLayoutParams(r1)
            android.content.res.Resources r1 = r10.getResources()
            r0 = 2131101820(0x7f06087c, float:1.781606E38)
            int r0 = r1.getColor(r0)
            r9.setBackgroundColor(r0)
            X.29D r0 = r5.A0E
            android.view.View r2 = r0.A06()
            android.content.res.Resources r1 = r10.getResources()
            r0 = 2131099794(0x7f060092, float:1.7811951E38)
            int r0 = r1.getColor(r0)
            r2.setBackgroundColor(r0)
            X.29D r2 = r5.A0E
            com.facebook.redex.IDxEListenerShape393S0100000_2_I0 r0 = new com.facebook.redex.IDxEListenerShape393S0100000_2_I0
            r0.<init>(r5, r8)
            r2.A02 = r0
            X.53A r1 = new X.53A
            r0 = r27
            r1.<init>(r0, r5)
            r2.A03 = r1
            X.2Cx r0 = r5.A0C
            r0.setPlayer(r2)
            X.2Cx r1 = r5.A0C
            X.2Cw r1 = (X.C46202Cw) r1
            android.widget.ImageButton r0 = r1.A0q
            r0.setVisibility(r15)
            android.widget.ImageButton r1 = r1.A0r
            r0 = 8
            r1.setVisibility(r0)
            X.2jK r1 = r5.A0B
            X.2Cx r0 = r5.A0C
            r1.setControlView(r0)
            X.29D r0 = r5.A0E
            r0.A08()
            X.2jK r1 = r5.A0B
            X.52y r0 = new X.52y
            r0.<init>(r5)
            r1.A0H = r0
            return
        L_0x03ba:
            int r3 = r5.A07
            int r2 = r5.A05
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r7 = android.graphics.Bitmap.createBitmap(r3, r2, r1)
            android.graphics.Canvas r2 = new android.graphics.Canvas
            r2.<init>(r7)
            r1 = 2131101279(0x7f06065f, float:1.7814963E38)
            int r1 = X.AnonymousClass00T.A00(r10, r1)
            r2.drawColor(r1)
            goto L_0x02eb
        L_0x03d5:
            X.0pt r13 = r5.A0P
            X.0sq r7 = r5.A0W
            X.01V r6 = r5.A0S
            X.013 r4 = r5.A0U
            X.0tz r12 = r5.A0T
            com.whatsapp.Mp4Ops r3 = r5.A0Q
            X.0so r2 = r5.A0N
            android.app.Activity r17 = X.C19980zJ.A00(r10)
            android.net.Uri r18 = android.net.Uri.parse(r0)
            r0 = 2131893204(0x7f121bd4, float:1.9421178E38)
            java.lang.String r0 = r10.getString(r0)
            java.lang.String r1 = X.AnonymousClass3C1.A07(r10, r0)
            X.3zF r0 = new X.3zF
            r0.<init>(r2, r3, r12, r1)
            r24 = 0
            X.29C r1 = new X.29C
            r16 = r1
            r19 = r13
            r20 = r6
            r21 = r4
            r22 = r7
            r23 = r0
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24)
            goto L_0x0336
        L_0x0410:
            r0 = 2
            int[] r2 = new int[r0]
            r12.getLocationInWindow(r2)
            r1 = r2[r11]
            int r0 = r14.A04
            int r1 = r1 - r0
            float r0 = (float) r1
            r13.setTranslationX(r0)
            r1 = r2[r8]
            int r0 = r14.A05
            int r1 = r1 - r0
            float r0 = (float) r1
            r13.setTranslationY(r0)
            r13.setPivotY(r3)
            r13.setPivotX(r3)
            int r0 = r12.getWidth()
            float r1 = (float) r0
            float r0 = (float) r7
            float r1 = r1 / r0
            r13.setScaleX(r1)
            int r0 = r12.getHeight()
            float r1 = (float) r0
            float r0 = (float) r4
            float r1 = r1 / r0
            r13.setScaleY(r1)
            goto L_0x02d4
        L_0x0444:
            r12 = 0
            goto L_0x02a2
        L_0x0447:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1ZP.A09(X.1ZR, X.3uY, X.0tZ, X.1Vw, android.graphics.Bitmap[], int):void");
    }

    public void A0A(String str, boolean z2) {
        StringBuilder sb = new StringBuilder("InlineVideoPlaybackImplHandler/onPlaybackError=");
        sb.append(str);
        sb.append(" isTransient=");
        sb.append(z2);
        Log.e(sb.toString());
        String str2 = this.A0F;
        C46212Cy.A02(this.A0K, this.A0M, this.A0X, this, (Integer) null, str2);
    }

    public void A6N() {
        C28381Vw r0;
        int i2;
        Integer valueOf;
        if (this.A0I) {
            boolean A0E2 = this.A0V.A0E(C16620tM.A02, 2431);
            C85464Oo r8 = this.A0X;
            int i3 = this.A06;
            AnonymousClass29D r02 = this.A0E;
            long A042 = r02 != null ? (long) r02.A04() : 0;
            C87394Wp r7 = r8.A09;
            if (r7.A02) {
                r7.A00();
            }
            C87394Wp r9 = r8.A07;
            r9.A00();
            C75823sm r6 = new C75823sm();
            if (!r8.A02 || A0E2) {
                boolean z2 = r8.A04;
                long j2 = 0;
                r6.A04 = Long.valueOf(z2 ? 0 : r9.A00);
                r6.A06 = Long.valueOf(Math.round(((double) A042) / 10000.0d) * 10000);
                if (z2) {
                    j2 = r8.A08.A00;
                }
                r6.A07 = Long.valueOf(j2);
                r6.A01 = Boolean.valueOf(z2);
                r6.A08 = Long.valueOf(r8.A06.A00);
                long j3 = r7.A00;
                r6.A09 = Long.valueOf(Math.round(((double) j3) / 10000.0d) * 10000);
                switch (i3) {
                    case 1:
                        i2 = 5;
                        break;
                    case 2:
                        i2 = 1;
                        break;
                    case 3:
                        i2 = 3;
                        break;
                    case 4:
                        i2 = 4;
                        break;
                    case 5:
                        i2 = 2;
                        break;
                    case 6:
                        i2 = 7;
                        break;
                    case 7:
                        i2 = 6;
                        break;
                    case 8:
                        i2 = 8;
                        break;
                    default:
                        valueOf = null;
                        break;
                }
                valueOf = Integer.valueOf(i2);
                r6.A03 = valueOf;
                if (A0E2) {
                    r6.A05 = Long.valueOf((long) ((((float) j3) * 100.0f) / ((float) A042)));
                    r6.A00 = Boolean.valueOf(r8.A03);
                    r6.A0A = r8.A01;
                    r6.A02 = r8.A00;
                }
                r8.A05.A06(r6);
            }
            r8.A02 = false;
            r8.A04 = false;
            r8.A03 = false;
            r8.A00 = null;
            r8.A01 = null;
            r8.A08.A01();
            r9.A01();
            r7.A01();
            r8.A06.A01();
            this.A02 = 3;
            C86094Re r1 = this.A0D;
            if (!(r1 == null || (r0 = this.A0A) == null)) {
                r1.A03(r0, 3);
                this.A0D = null;
            }
            AnonymousClass2Cx r03 = this.A0C;
            if (r03 != null) {
                r03.A06();
            }
            AnonymousClass29D r04 = this.A0E;
            if (r04 != null) {
                r04.A09();
                this.A0E = null;
            }
            this.A0B.setSystemUiVisibility(0);
            C55322jK r12 = this.A0B;
            r12.A0Q = false;
            r12.A0N = false;
            r12.A0L = true;
            r12.A09 = 0;
            r12.A0A = 0;
            r12.removeAllViews();
            this.A0I = false;
            this.A0J = false;
            this.A0A = null;
            this.A0F = null;
        }
    }

    public void A8Z() {
        Context context = this.A0K;
        if (!C19980zJ.A00(context).isFinishing()) {
            AnonymousClass29D r0 = this.A0E;
            if (r0 != null) {
                View A062 = r0.A06();
                ViewGroup.LayoutParams layoutParams = A062.getLayoutParams();
                layoutParams.height = -1;
                layoutParams.width = -1;
                A062.setLayoutParams(layoutParams);
                if (this.A0E instanceof C610837g) {
                    int i2 = context.getResources().getConfiguration().orientation;
                    YoutubePlayerTouchOverlay youtubePlayerTouchOverlay = ((C610837g) this.A0E).A0G;
                    if (i2 == 2) {
                        youtubePlayerTouchOverlay.setLayoutParams(new RelativeLayout.LayoutParams(-2, -1));
                    } else {
                        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, youtubePlayerTouchOverlay.A00);
                        layoutParams2.addRule(13);
                        youtubePlayerTouchOverlay.setLayoutParams(layoutParams2);
                    }
                    youtubePlayerTouchOverlay.requestLayout();
                }
            }
            this.A08.setContentDescription(context.getString(R.string.str0b82));
            C55322jK r1 = this.A0B;
            r1.A0L = false;
            r1.A0Q = false;
            r1.A0N = true;
            r1.A0M = false;
            r1.A08(1.0f);
            C55322jK r3 = this.A0B;
            FrameLayout frameLayout = this.A08;
            if (!(frameLayout.getX() == 0.0f || frameLayout.getY() == 0.0f)) {
                r3.A09 = r3.A03(r3.A03);
                r3.A0A = r3.A04(r3.A02);
            }
            C004601z.A0T(C19980zJ.A00(context).getWindow().getDecorView());
            this.A08.setScaleX(1.0f);
            this.A08.setScaleY(1.0f);
            C42821yj r12 = this.A09.A00;
            if (C23061Ai.A00(r12.A07)) {
                MentionableEntry mentionableEntry = r12.A37;
                if (mentionableEntry != null) {
                    mentionableEntry.A03();
                }
            } else {
                r12.A0t();
            }
            FrameLayout frameLayout2 = this.A08;
            C55322jK r02 = this.A0B;
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            Point point = new Point();
            Point point2 = new Point();
            frameLayout2.getGlobalVisibleRect(rect, point2);
            r02.getGlobalVisibleRect(rect2, point);
            rect.offset(point2.x - rect.left, point2.y - rect.top);
            rect2.offset(-point.x, -point.y);
            this.A0L.set(rect);
            frameLayout2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            C46212Cy.A01(context, rect, rect2, frameLayout2, (FrameLayout) null, (C606734v) null, this.A0B, this.A0C, this.A0J, true);
            this.A0J = true;
            this.A0C.A01();
            this.A0B.requestLayout();
            FrameLayout frameLayout3 = this.A08;
            if (frameLayout3 instanceof C79153zH) {
                ((C79153zH) frameLayout3).setIsFullscreen(this.A0J);
            }
        }
    }

    public void A8r(boolean z2) {
        AnonymousClass29D r0 = this.A0E;
        if (r0 != null) {
            View A062 = r0.A06();
            ViewGroup.LayoutParams layoutParams = A062.getLayoutParams();
            layoutParams.height = this.A05;
            layoutParams.width = -1;
            A062.setLayoutParams(layoutParams);
            AnonymousClass29D r1 = this.A0E;
            if (r1 instanceof C610837g) {
                YoutubePlayerTouchOverlay youtubePlayerTouchOverlay = ((C610837g) r1).A0G;
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, youtubePlayerTouchOverlay.A00);
                layoutParams2.addRule(13);
                youtubePlayerTouchOverlay.setLayoutParams(layoutParams2);
                youtubePlayerTouchOverlay.requestLayout();
            }
        }
        FrameLayout frameLayout = this.A08;
        Context context = this.A0K;
        frameLayout.setContentDescription(context.getString(R.string.str0b83));
        C55322jK r12 = this.A0B;
        boolean z3 = true;
        r12.A0L = true;
        r12.A0Q = false;
        r12.A08(r12.A00);
        if (z2 || this.A03 != this.A01) {
            this.A08.setLayoutParams(new FrameLayout.LayoutParams(this.A07, this.A04));
        } else {
            FrameLayout frameLayout2 = this.A08;
            C55322jK r02 = this.A0B;
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            Point point = new Point();
            r02.getGlobalVisibleRect(rect, point);
            rect.offset(-point.x, -point.y);
            rect2.set(this.A0L);
            frameLayout2.setLayoutParams(new FrameLayout.LayoutParams(this.A07, this.A04));
            C46212Cy.A01(context, rect, rect2, frameLayout2, (FrameLayout) null, (C606734v) null, this.A0B, this.A0C, this.A0J, true);
        }
        this.A0J = false;
        this.A0C.A02();
        this.A0C.setSystemUiVisibility(0);
        C55322jK r2 = this.A0B;
        r2.A0M = true;
        if (this.A03 != this.A01) {
            z3 = false;
        }
        r2.A09(z3);
        this.A0B.A0N = false;
        C004601z.A0T(C19980zJ.A00(context).getWindow().getDecorView());
        this.A03 = this.A01;
        FrameLayout frameLayout3 = this.A08;
        if (frameLayout3 instanceof C79153zH) {
            ((C79153zH) frameLayout3).setIsFullscreen(this.A0J);
        }
    }

    public void A8w(AnonymousClass1ZR r20, C16740tZ r21, C28381Vw r22, C86094Re r23, String str, String str2, Bitmap[] bitmapArr, int i2) {
        C28381Vw r9 = r22;
        String str3 = str2;
        int i3 = i2;
        if (this.A0A != r9) {
            A6N();
            this.A0A = r9;
            this.A0F = str3;
            this.A0D = r23;
            this.A06 = i3;
        }
        if (i3 != 3) {
            str = str3;
        }
        String obj = Uri.parse(str).buildUpon().appendQueryParameter("wa_logging_event", "video_play_open").build().toString();
        C14870pt r12 = this.A0P;
        C16320sq r2 = this.A0W;
        AnonymousClass013 r14 = this.A0U;
        C16740tZ r8 = r21;
        Bitmap[] bitmapArr2 = bitmapArr;
        if (i3 != 4) {
            AnonymousClass1ZR A002 = C87664Ya.A00(obj);
            if (A002 == null) {
                try {
                    C86094Re r1 = this.A0D;
                    if (r1 != null) {
                        r1.A03(r9, 1);
                        this.A02 = 1;
                    }
                    C51292bO.A00(r12, r20, r14, new C102594zD(r8, r9, this, bitmapArr2), r2, obj, false);
                } catch (Exception unused) {
                    A0A("InlineVideoPlaybackImplHandler/fetchPageInfo - loadPage failed", true);
                }
            } else if (r22 != null && bitmapArr != null) {
                A09(A002, A002.A0A, r8, r9, bitmapArr2, i3);
            }
        } else if (r22 != null && str2 != null && bitmapArr != null) {
            A09((AnonymousClass1ZR) null, new C76703uY(-1, str3, -1), r8, r9, bitmapArr2, 4);
        }
    }

    public int ABK() {
        return this.A02;
    }

    public C28381Vw ABL() {
        return this.A0A;
    }

    public boolean ACn() {
        return this.A0I;
    }

    public boolean ACs() {
        return this.A0J;
    }

    public void AaG() {
        AnonymousClass29D r0 = this.A0E;
        if (r0 != null && r0.A0C()) {
            this.A0C.A03();
        }
    }

    public void Adm(int i2) {
        this.A01 = i2;
    }

    public void Ae0(C86094Re r1) {
        this.A0D = r1;
    }

    public void AeE(int i2) {
        this.A03 = i2;
    }

    public void AgE(AnonymousClass4E5 r6, C55322jK r7) {
        this.A0B = r7;
        this.A09 = r6;
        Context context = this.A0K;
        int width = (context.getResources().getConfiguration().orientation == 1 ? r7.getWidth() : r7.getHeight()) - (context.getResources().getDimensionPixelSize(R.dimen.dimen0485) << 1);
        this.A00 = (((double) (width * width)) * 9.0d) / 16.0d;
        C55322jK r3 = this.A0B;
        int[] viewIdsToIgnoreScaling = AnonymousClass2Cx.getViewIdsToIgnoreScaling();
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.dimen045b);
        r3.A0R = viewIdsToIgnoreScaling;
        r3.A06 = dimensionPixelSize;
    }
}
