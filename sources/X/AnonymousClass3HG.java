package X;

import android.content.Context;
import android.view.View;

/* renamed from: X.3HG  reason: invalid class name */
public class AnonymousClass3HG implements AnonymousClass25V {
    public boolean A00 = false;
    public final /* synthetic */ int A01;
    public final /* synthetic */ Context A02;
    public final /* synthetic */ View A03;
    public final /* synthetic */ C18640x1 A04;
    public final /* synthetic */ C38891ra A05;
    public final /* synthetic */ C25791Ld A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;

    public AnonymousClass3HG(Context context, View view, C18640x1 r4, C38891ra r5, C25791Ld r6, int i2, boolean z2, boolean z3) {
        this.A05 = r5;
        this.A02 = context;
        this.A04 = r4;
        this.A07 = z2;
        this.A08 = z3;
        this.A01 = i2;
        this.A06 = r6;
        this.A03 = view;
    }

    public int AG6() {
        return this.A06.A03(this.A03.getContext());
    }

    public /* synthetic */ void ARJ() {
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x007a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void AfV(android.graphics.Bitmap r28, android.view.View r29, X.C16740tZ r30) {
        /*
            r27 = this;
            r8 = r28
            r1 = r27
            boolean r0 = r1.A00
            if (r0 != 0) goto L_0x011a
            r0 = 1
            r1.A00 = r0
            r10 = 0
            if (r28 == 0) goto L_0x0054
            int r0 = r8.getWidth()
            if (r0 <= 0) goto L_0x0054
            int r0 = r8.getHeight()
            if (r0 <= 0) goto L_0x0054
        L_0x001a:
            X.1ra r0 = r1.A05
            android.content.Context r5 = r1.A02
            java.lang.String r14 = r0.A06
            android.app.Activity r3 = X.AnonymousClass22N.A00(r5)
            boolean r2 = r3 instanceof X.AnonymousClass1yP
            if (r2 == 0) goto L_0x007b
            X.1yP r3 = (X.AnonymousClass1yP) r3
            com.obwhatsapp.Conversation r3 = (com.obwhatsapp.Conversation) r3
            X.1yj r4 = r3.A00
            X.2Yq r7 = r4.A1N
            if (r7 != 0) goto L_0x003d
            X.1Ak r3 = r4.A1M
            X.1Al r2 = r4.A3Y
            X.2Yq r7 = new X.2Yq
            r7.<init>(r3, r2)
            r4.A1N = r7
        L_0x003d:
            if (r8 == 0) goto L_0x007c
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0q(r14)
            r2 = 95
            r3.append(r2)
            r2 = 3
            java.lang.String r6 = X.AnonymousClass000.A0l(r3, r2)
            X.1Ak r3 = r7.A01
            X.2yL r2 = r3.A02
            if (r2 == 0) goto L_0x007c
            goto L_0x0056
        L_0x0054:
            r8 = r10
            goto L_0x001a
        L_0x0056:
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x007c }
            r2.<init>()     // Catch:{ IOException -> 0x007c }
            byte[] r2 = X.C13690nt.A1X(r8, r2)     // Catch:{ IOException -> 0x007c }
            java.io.ByteArrayInputStream r4 = new java.io.ByteArrayInputStream     // Catch:{ IOException -> 0x007c }
            r4.<init>(r2)     // Catch:{ IOException -> 0x007c }
            X.2yL r2 = r3.A02     // Catch:{ all -> 0x0076 }
            java.lang.String r3 = X.C004101u.A02(r6)     // Catch:{ all -> 0x0076 }
            X.AnonymousClass00B.A06(r3)     // Catch:{ all -> 0x0076 }
            X.1zV r2 = r2.A03     // Catch:{ all -> 0x0076 }
            r2.A02(r4, r3)     // Catch:{ all -> 0x0076 }
            r4.close()     // Catch:{ IOException -> 0x007c }
            goto L_0x007c
        L_0x0076:
            r2 = move-exception
            r4.close()     // Catch:{ all -> 0x007a }
        L_0x007a:
            throw r2     // Catch:{ IOException -> 0x007c }
        L_0x007b:
            r7 = r10
        L_0x007c:
            java.util.ArrayList r2 = X.AnonymousClass000.A0u()
            r4 = 0
            r6 = 0
        L_0x0082:
            int r3 = r0.A00
            if (r6 >= r3) goto L_0x00a7
            if (r6 != 0) goto L_0x00a3
            if (r7 == 0) goto L_0x00a3
            if (r8 == 0) goto L_0x00a3
            int r17 = r8.getWidth()
            int r18 = r8.getHeight()
            java.lang.String r15 = ""
            X.1mL r13 = new X.1mL
            r16 = r15
            r13.<init>(r14, r15, r16, r17, r18)
            r2.add(r13)
        L_0x00a0:
            int r6 = r6 + 1
            goto L_0x0082
        L_0x00a3:
            r2.add(r10)
            goto L_0x00a0
        L_0x00a7:
            java.lang.String r15 = r0.A09
            java.lang.String r6 = ""
            if (r15 != 0) goto L_0x00ae
            r15 = r6
        L_0x00ae:
            java.lang.String r3 = r0.A04
            if (r3 != 0) goto L_0x00b3
            r3 = r6
        L_0x00b3:
            java.math.BigDecimal r8 = r0.A0A
            java.lang.String r6 = r0.A03
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 == 0) goto L_0x0120
            r13 = r10
        L_0x00be:
            java.lang.String r7 = r0.A07
            java.lang.String r6 = r0.A08
            X.1mK r11 = new X.1mK
            r18 = r10
            r19 = r10
            r20 = 0
            r21 = 0
            r16 = r11
            r17 = r10
            r16.<init>(r17, r18, r19, r20, r21)
            r23 = 99
            r22 = 0
            r25 = 0
            r26 = 0
            X.1mM r9 = new X.1mM
            r12 = r10
            r20 = r8
            r21 = r2
            r16 = r3
            r17 = r7
            r18 = r6
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r25, r26)
            X.0x1 r2 = r1.A04
            r2.A0C(r9, r10)
            com.whatsapp.jid.UserJid r8 = r0.A01
            X.AnonymousClass00B.A06(r8)
            java.lang.String r7 = r9.A0D
            boolean r6 = r1.A07
            boolean r0 = r1.A08
            int r3 = r1.A01
            if (r0 == 0) goto L_0x011b
            android.content.Intent r2 = X.C13680ns.A09()
            java.lang.String r1 = r5.getPackageName()
            java.lang.String r0 = "com.obwhatsapp.biz.product.view.activity.ProductDetailActivity"
            android.content.Intent r12 = r2.setClassName(r1, r0)
        L_0x010d:
            r15 = r10
            r11 = r5
            r13 = r8
            r14 = r10
            r16 = r7
            r17 = r3
            r18 = r6
            X.C61843Ap.A00(r11, r12, r13, r14, r15, r16, r17, r18)
        L_0x011a:
            return
        L_0x011b:
            android.content.Intent r12 = X.C14750ph.A0o(r5, r4)
            goto L_0x010d
        L_0x0120:
            java.lang.String r6 = r0.A03
            X.1sq r13 = new X.1sq
            r13.<init>(r6)
            goto L_0x00be
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3HG.AfV(android.graphics.Bitmap, android.view.View, X.0tZ):void");
    }

    public /* synthetic */ void Afm(View view) {
    }
}
