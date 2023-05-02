package X;

/* renamed from: X.25e  reason: invalid class name and case insensitive filesystem */
public class C447025e extends AnonymousClass1ZS {
    public final C16180sb A00;
    public final AnonymousClass013 A01;
    public final C17250um A02;
    public final C18840xL A03;
    public final /* synthetic */ AnonymousClass25S A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C447025e(C16180sb r2, AnonymousClass013 r3, C17250um r4, C18840xL r5, AnonymousClass25S r6) {
        super("MessageThumbsThread");
        this.A04 = r6;
        this.A00 = r2;
        this.A02 = r4;
        this.A01 = r3;
        this.A03 = r5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0164, code lost:
        if (r7 == null) goto L_0x0166;
     */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x020d A[Catch:{ InterruptedException -> 0x0248 }] */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x022a A[Catch:{ InterruptedException -> 0x0248 }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0090 A[ADDED_TO_REGION, Catch:{ InterruptedException -> 0x0248 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r18 = this;
            r5 = 10
            android.os.Process.setThreadPriority(r5)
        L_0x0005:
            r4 = r18
            X.25S r6 = r4.A04     // Catch:{ InterruptedException -> 0x0248 }
            X.25a r0 = r6.A0A     // Catch:{ InterruptedException -> 0x0248 }
            java.util.concurrent.LinkedBlockingDeque r0 = r0.A00     // Catch:{ InterruptedException -> 0x0248 }
            java.lang.Object r3 = r0.takeLast()     // Catch:{ InterruptedException -> 0x0248 }
            X.25b r3 = (X.C446725b) r3     // Catch:{ InterruptedException -> 0x0248 }
        L_0x0013:
            java.util.concurrent.atomic.AtomicInteger r9 = r6.A0B     // Catch:{ InterruptedException -> 0x0248 }
            int r2 = r9.get()     // Catch:{ InterruptedException -> 0x0248 }
            r16 = 1000(0x3e8, double:4.94E-321)
            if (r2 > r5) goto L_0x022e
            long r7 = java.lang.System.currentTimeMillis()     // Catch:{ InterruptedException -> 0x0248 }
            long r0 = X.AnonymousClass2S0.A00     // Catch:{ InterruptedException -> 0x0248 }
            long r7 = r7 - r0
            int r0 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r0 >= 0) goto L_0x002e
            r0 = 50
            java.lang.Thread.sleep(r0)     // Catch:{ InterruptedException -> 0x0248 }
            goto L_0x0013
        L_0x002e:
            java.lang.Object r10 = r3.A04     // Catch:{ InterruptedException -> 0x0248 }
            android.view.View r11 = r3.A00     // Catch:{ InterruptedException -> 0x0248 }
            java.lang.Object r0 = r11.getTag()     // Catch:{ InterruptedException -> 0x0248 }
            boolean r0 = r10.equals(r0)     // Catch:{ InterruptedException -> 0x0248 }
            r8 = 0
            if (r0 == 0) goto L_0x021e
            X.0tZ r7 = r3.A01     // Catch:{ InterruptedException -> 0x0248 }
            boolean r0 = r7 instanceof X.C16730tY     // Catch:{ InterruptedException -> 0x0248 }
            if (r0 == 0) goto L_0x01c3
            X.0tY r7 = (X.C16730tY) r7     // Catch:{ InterruptedException -> 0x0248 }
            X.0ta r2 = r7.A02     // Catch:{ InterruptedException -> 0x0248 }
            if (r2 == 0) goto L_0x017b
            java.io.File r0 = r2.A0F     // Catch:{ InterruptedException -> 0x0248 }
            if (r0 == 0) goto L_0x00fa
            boolean r0 = r0.canRead()     // Catch:{ InterruptedException -> 0x0248 }
            if (r0 == 0) goto L_0x00fa
            boolean r0 = r7 instanceof X.C38681rF     // Catch:{ InterruptedException -> 0x0248 }
            if (r0 == 0) goto L_0x005f
            java.io.File r0 = r2.A0F     // Catch:{ InterruptedException -> 0x0248 }
            android.graphics.Bitmap r7 = X.AnonymousClass25S.A00(r2, r3, r6, r0, r8)     // Catch:{ InterruptedException -> 0x0248 }
            goto L_0x0123
        L_0x005f:
            boolean r0 = r7 instanceof X.C38721rJ     // Catch:{ InterruptedException -> 0x0248 }
            if (r0 == 0) goto L_0x00cc
            X.1Vw r0 = r7.A11     // Catch:{ InterruptedException -> 0x0248 }
            boolean r12 = r0.A02     // Catch:{ InterruptedException -> 0x0248 }
            if (r12 == 0) goto L_0x0088
            boolean r0 = r2.A0P     // Catch:{ InterruptedException -> 0x0248 }
            if (r0 != 0) goto L_0x0088
            boolean r0 = r2.A0O     // Catch:{ InterruptedException -> 0x0248 }
            if (r0 != 0) goto L_0x0088
            long r0 = r2.A0D     // Catch:{ InterruptedException -> 0x0248 }
            r14 = 0
            int r7 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r7 < 0) goto L_0x0088
            long r7 = r2.A0E     // Catch:{ InterruptedException -> 0x0248 }
            int r13 = (r7 > r14 ? 1 : (r7 == r14 ? 0 : -1))
            if (r13 <= 0) goto L_0x0088
            java.io.File r7 = r2.A0F     // Catch:{ InterruptedException -> 0x0248 }
            long r0 = r0 * r16
            android.graphics.Bitmap r7 = X.C18830xK.A02(r7, r0)     // Catch:{ InterruptedException -> 0x0248 }
            goto L_0x008e
        L_0x0088:
            java.io.File r0 = r2.A0F     // Catch:{ InterruptedException -> 0x0248 }
            android.graphics.Bitmap r7 = X.C18830xK.A01(r0)     // Catch:{ InterruptedException -> 0x0248 }
        L_0x008e:
            if (r7 == 0) goto L_0x021e
            if (r12 == 0) goto L_0x0203
            boolean r0 = r2.A0P     // Catch:{ InterruptedException -> 0x0248 }
            if (r0 != 0) goto L_0x0203
            boolean r0 = r2.A0O     // Catch:{ InterruptedException -> 0x0248 }
            if (r0 != 0) goto L_0x0203
            java.lang.String r1 = r2.A0H     // Catch:{ InterruptedException -> 0x0248 }
            if (r1 == 0) goto L_0x0203
            X.0sb r0 = r4.A00     // Catch:{ InterruptedException -> 0x0248 }
            java.io.File r12 = X.C17970vw.A0E(r0, r1)     // Catch:{ InterruptedException -> 0x0248 }
            boolean r0 = r12.exists()     // Catch:{ InterruptedException -> 0x0248 }
            if (r0 == 0) goto L_0x0203
            X.0tz r0 = r6.A03     // Catch:{ InterruptedException -> 0x0248 }
            android.content.Context r8 = r0.A00     // Catch:{ InterruptedException -> 0x0248 }
            X.0um r2 = r4.A02     // Catch:{ InterruptedException -> 0x0248 }
            X.013 r1 = r4.A01     // Catch:{ InterruptedException -> 0x0248 }
            X.1MF r0 = r6.A08     // Catch:{ InterruptedException -> 0x0248 }
            X.3Bj r2 = X.C62033Bj.A02(r8, r1, r2, r0, r12)     // Catch:{ InterruptedException -> 0x0248 }
            if (r2 == 0) goto L_0x0203
            boolean r0 = r7.isMutable()     // Catch:{ InterruptedException -> 0x0248 }
            if (r0 != 0) goto L_0x00c7
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ InterruptedException -> 0x0248 }
            r0 = 1
            android.graphics.Bitmap r7 = r7.copy(r1, r0)     // Catch:{ InterruptedException -> 0x0248 }
        L_0x00c7:
            r0 = 0
            r2.A07(r7, r0, r0, r0)     // Catch:{ InterruptedException -> 0x0248 }
            goto L_0x0123
        L_0x00cc:
            boolean r0 = r7 instanceof X.C38631rA     // Catch:{ InterruptedException -> 0x0248 }
            if (r0 == 0) goto L_0x021e
            java.lang.String r1 = "application/pdf"
            java.lang.String r0 = r7.A06     // Catch:{ InterruptedException -> 0x0248 }
            boolean r0 = r1.equals(r0)     // Catch:{ InterruptedException -> 0x0248 }
            if (r0 == 0) goto L_0x021e
            java.io.File r0 = r2.A0F     // Catch:{ InterruptedException -> 0x0248 }
            java.lang.String r12 = r0.getAbsolutePath()     // Catch:{ InterruptedException -> 0x0248 }
            X.25V r0 = r3.A03     // Catch:{ InterruptedException -> 0x0248 }
            int r8 = r0.AG6()     // Catch:{ InterruptedException -> 0x0248 }
            int r0 = r0.AG6()     // Catch:{ InterruptedException -> 0x0248 }
            int r7 = r0 / 3
            r2 = 480(0x1e0, float:6.73E-43)
            r1 = 1
            boolean r0 = X.C41971wz.A06()     // Catch:{ InterruptedException -> 0x0248 }
            if (r0 != 0) goto L_0x021e
            android.graphics.Bitmap r7 = X.C18820xJ.A03(r12, r8, r7, r2, r1)     // Catch:{ InterruptedException -> 0x0248 }
            goto L_0x0123
        L_0x00fa:
            boolean r0 = r7 instanceof X.C38711rI     // Catch:{ InterruptedException -> 0x0248 }
            if (r0 == 0) goto L_0x0127
            r0 = r7
            X.1rI r0 = (X.C38711rI) r0     // Catch:{ InterruptedException -> 0x0248 }
            boolean r0 = X.C38621r6.A12(r0)     // Catch:{ InterruptedException -> 0x0248 }
            if (r0 == 0) goto L_0x0127
            X.0sb r2 = r6.A02     // Catch:{ InterruptedException -> 0x0248 }
            java.io.File r1 = r2.A0F(r7)     // Catch:{ InterruptedException -> 0x0248 }
            if (r1 == 0) goto L_0x021e
            boolean r0 = r1.exists()     // Catch:{ InterruptedException -> 0x0248 }
            if (r0 == 0) goto L_0x021e
            java.io.File r0 = r2.A0G(r1)     // Catch:{ InterruptedException -> 0x0248 }
            boolean r0 = r0.exists()     // Catch:{ InterruptedException -> 0x0248 }
            if (r0 == 0) goto L_0x021e
            android.graphics.Bitmap r7 = X.C18830xK.A01(r1)     // Catch:{ InterruptedException -> 0x0248 }
        L_0x0123:
            if (r7 == 0) goto L_0x021e
            goto L_0x0203
        L_0x0127:
            boolean r0 = r7 instanceof X.C38681rF     // Catch:{ InterruptedException -> 0x0248 }
            if (r0 == 0) goto L_0x017b
            X.1y4 r13 = r7.A12()     // Catch:{ InterruptedException -> 0x0248 }
            X.0sb r14 = r4.A00     // Catch:{ InterruptedException -> 0x0248 }
            X.0sc r1 = r14.A02     // Catch:{ InterruptedException -> 0x0248 }
            java.lang.String r0 = ".Thumbs"
            java.io.File r15 = r1.A07(r0)     // Catch:{ InterruptedException -> 0x0248 }
            java.lang.String r12 = ".prog.thumb.jpg"
            java.lang.String r1 = r7.A05     // Catch:{ InterruptedException -> 0x0248 }
            java.lang.String r0 = r7.A08     // Catch:{ InterruptedException -> 0x0248 }
            java.io.File r1 = X.C16180sb.A01(r15, r1, r0, r12)     // Catch:{ InterruptedException -> 0x0248 }
            java.io.File r12 = r14.A0F(r7)     // Catch:{ InterruptedException -> 0x0248 }
            boolean r0 = X.C40541uI.A03(r7)     // Catch:{ InterruptedException -> 0x0248 }
            if (r0 == 0) goto L_0x0166
            if (r13 == 0) goto L_0x0166
            if (r12 == 0) goto L_0x0166
            boolean r0 = r12.exists()     // Catch:{ InterruptedException -> 0x0248 }
            if (r0 == 0) goto L_0x0166
            X.1QO r0 = r6.A07     // Catch:{ InterruptedException -> 0x0248 }
            r0.A00(r13)     // Catch:{ InterruptedException -> 0x0248 }
            int[] r0 = r13.A06()     // Catch:{ InterruptedException -> 0x0248 }
            android.graphics.Bitmap r7 = X.AnonymousClass25S.A00(r2, r3, r6, r12, r0)     // Catch:{ InterruptedException -> 0x0248 }
            if (r7 != 0) goto L_0x0203
        L_0x0166:
            boolean r0 = r3.A05     // Catch:{ InterruptedException -> 0x0248 }
            if (r0 != 0) goto L_0x021e
            if (r1 == 0) goto L_0x021e
            boolean r0 = r1.exists()     // Catch:{ InterruptedException -> 0x0248 }
            if (r0 == 0) goto L_0x021e
            android.graphics.Bitmap r7 = X.AnonymousClass25S.A00(r2, r3, r6, r1, r8)     // Catch:{ InterruptedException -> 0x0248 }
            if (r7 == 0) goto L_0x021e
            r1 = 4
            goto L_0x01ff
        L_0x017b:
            boolean r0 = r7 instanceof X.C38641rB     // Catch:{ InterruptedException -> 0x0248 }
            if (r0 == 0) goto L_0x021e
            X.1rB r7 = (X.C38641rB) r7     // Catch:{ InterruptedException -> 0x0248 }
            boolean r0 = r7.A00     // Catch:{ InterruptedException -> 0x0248 }
            if (r0 == 0) goto L_0x021e
            android.content.Context r12 = r11.getContext()     // Catch:{ InterruptedException -> 0x0248 }
            X.1Vw r8 = r7.A11     // Catch:{ InterruptedException -> 0x0248 }
            X.0sb r2 = r4.A00     // Catch:{ InterruptedException -> 0x0248 }
            java.lang.String r1 = r7.A05     // Catch:{ InterruptedException -> 0x0248 }
            java.lang.String r0 = r7.A08     // Catch:{ InterruptedException -> 0x0248 }
            java.io.File r7 = r2.A0P(r1, r0)     // Catch:{ InterruptedException -> 0x0248 }
            if (r7 == 0) goto L_0x01b1
            boolean r0 = r7.exists()     // Catch:{ InterruptedException -> 0x0248 }
            if (r0 == 0) goto L_0x01b1
            android.content.res.Resources r1 = r12.getResources()     // Catch:{ InterruptedException -> 0x0248 }
            r0 = 2131165832(0x7f070288, float:1.7945892E38)
            int r2 = r1.getDimensionPixelSize(r0)     // Catch:{ InterruptedException -> 0x0248 }
            X.0xL r1 = r4.A03     // Catch:{ InterruptedException -> 0x0248 }
            java.lang.String r0 = r8.A01     // Catch:{ InterruptedException -> 0x0248 }
            android.graphics.Bitmap r7 = r1.A03(r7, r0, r2, r2)     // Catch:{ InterruptedException -> 0x0248 }
            goto L_0x01fc
        L_0x01b1:
            java.lang.String r1 = "MessageThumbFetcher/sticker thumbnail doesn't exist: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ InterruptedException -> 0x0248 }
            r0.<init>(r1)     // Catch:{ InterruptedException -> 0x0248 }
            r0.append(r7)     // Catch:{ InterruptedException -> 0x0248 }
            java.lang.String r0 = r0.toString()     // Catch:{ InterruptedException -> 0x0248 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ InterruptedException -> 0x0248 }
            goto L_0x021e
        L_0x01c3:
            boolean r0 = r7 instanceof X.C30581cc     // Catch:{ InterruptedException -> 0x0248 }
            if (r0 == 0) goto L_0x021e
            X.1cv r8 = r7.A0U     // Catch:{ InterruptedException -> 0x0248 }
            if (r8 == 0) goto L_0x021e
            X.0sb r1 = r4.A00     // Catch:{ InterruptedException -> 0x0248 }
            java.lang.String r0 = r8.A04     // Catch:{ InterruptedException -> 0x0248 }
            if (r0 == 0) goto L_0x01f6
            java.lang.String r2 = X.C004101u.A02(r0)     // Catch:{ InterruptedException -> 0x0248 }
        L_0x01d5:
            X.1jH r0 = r1.A05()     // Catch:{ InterruptedException -> 0x0248 }
            java.io.File r1 = r0.A0Q     // Catch:{ InterruptedException -> 0x0248 }
            r0 = 0
            X.C16180sb.A04(r1, r0)     // Catch:{ InterruptedException -> 0x0248 }
            X.AnonymousClass00B.A06(r2)     // Catch:{ InterruptedException -> 0x0248 }
            java.io.File r7 = X.C16180sb.A00(r1, r2)     // Catch:{ InterruptedException -> 0x0248 }
        L_0x01e6:
            int r2 = r8.A01     // Catch:{ InterruptedException -> 0x0248 }
            int r1 = r8.A00     // Catch:{ InterruptedException -> 0x0248 }
            X.25c r0 = new X.25c     // Catch:{ InterruptedException -> 0x0248 }
            r0.<init>(r2, r1)     // Catch:{ InterruptedException -> 0x0248 }
            X.25d r0 = X.C37741pe.A06(r0, r7)     // Catch:{ InterruptedException -> 0x0248 }
            android.graphics.Bitmap r7 = r0.A02     // Catch:{ InterruptedException -> 0x0248 }
            goto L_0x01fc
        L_0x01f6:
            java.lang.String r2 = r8.A06     // Catch:{ InterruptedException -> 0x0248 }
            if (r2 != 0) goto L_0x01d5
            r7 = 0
            goto L_0x01e6
        L_0x01fc:
            if (r7 != 0) goto L_0x0203
            goto L_0x021e
        L_0x01ff:
            r0 = 2
            com.whatsapp.filter.FilterUtils.blurNative(r7, r1, r0)     // Catch:{ InterruptedException -> 0x0248 }
        L_0x0203:
            java.lang.Object r0 = r11.getTag()     // Catch:{ InterruptedException -> 0x0248 }
            boolean r0 = r10.equals(r0)     // Catch:{ InterruptedException -> 0x0248 }
            if (r0 == 0) goto L_0x022a
            r9.incrementAndGet()     // Catch:{ InterruptedException -> 0x0248 }
            X.25Z r3 = r3.A02     // Catch:{ InterruptedException -> 0x0248 }
            android.os.Handler r2 = r6.A01     // Catch:{ InterruptedException -> 0x0248 }
            r1 = 23
            com.facebook.redex.RunnableRunnableShape2S0300000_I0_2 r0 = new com.facebook.redex.RunnableRunnableShape2S0300000_I0_2     // Catch:{ InterruptedException -> 0x0248 }
            r0.<init>(r4, r3, r7, r1)     // Catch:{ InterruptedException -> 0x0248 }
            r2.post(r0)     // Catch:{ InterruptedException -> 0x0248 }
        L_0x021e:
            boolean r0 = java.lang.Thread.interrupted()     // Catch:{ InterruptedException -> 0x0248 }
            if (r0 == 0) goto L_0x0005
            java.lang.String r0 = "MessageThumbsThread/run/Thread interrupted"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ InterruptedException -> 0x0248 }
            goto L_0x0247
        L_0x022a:
            r7.recycle()     // Catch:{ InterruptedException -> 0x0248 }
            goto L_0x021e
        L_0x022e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ InterruptedException -> 0x0248 }
            r1.<init>()     // Catch:{ InterruptedException -> 0x0248 }
            java.lang.String r0 = "MessageThumbsThread/too many result callbacks pending="
            r1.append(r0)     // Catch:{ InterruptedException -> 0x0248 }
            r1.append(r2)     // Catch:{ InterruptedException -> 0x0248 }
            java.lang.String r0 = r1.toString()     // Catch:{ InterruptedException -> 0x0248 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ InterruptedException -> 0x0248 }
            java.lang.Thread.sleep(r16)     // Catch:{ InterruptedException -> 0x0248 }
            goto L_0x0013
        L_0x0247:
            return
        L_0x0248:
            r1 = move-exception
            java.lang.String r0 = "MessageThumbsThread/run/InterruptedException"
            com.whatsapp.util.Log.e(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C447025e.run():void");
    }
}
