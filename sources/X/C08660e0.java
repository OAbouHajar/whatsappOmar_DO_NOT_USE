package X;

/* renamed from: X.0e0  reason: invalid class name and case insensitive filesystem */
public class C08660e0 implements C12710kq {
    public final /* synthetic */ AnonymousClass0X5 A00;
    public final /* synthetic */ C12710kq A01;
    public final /* synthetic */ C13410lz A02;

    public C08660e0(AnonymousClass0X5 r1, C12710kq r2, C13410lz r3) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00bd, code lost:
        throw r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0130, code lost:
        r1.AL7(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0133, code lost:
        throw r16;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void AW3(int r19) {
        /*
            r18 = this;
            java.lang.String r1 = "initial_content_step"
            java.lang.String r13 = "Bloks Request Error."
            java.lang.String r12 = "stream_on_load_actions_end"
            java.lang.String r11 = "stream_on_load_actions_start"
            java.lang.String r10 = "render_load_action_start"
            java.lang.String r9 = "render_data_end"
            java.lang.String r8 = "render_end"
            java.lang.String r7 = "render_start"
            java.lang.String r6 = "initial_render_data_end"
            java.lang.String r5 = "initial_render_end"
            java.lang.String r4 = "initial_render_start"
            java.lang.String r17 = "Fetch summary is missing."
            r3 = r18
            r14 = r19
            X.0kq r0 = r3.A01     // Catch:{ all -> 0x00ab }
            if (r0 == 0) goto L_0x0023
            r0.AW3(r14)     // Catch:{ all -> 0x00ab }
        L_0x0023:
            X.0X5 r0 = r3.A00
            java.util.concurrent.atomic.AtomicReference r2 = r0.A0A
            java.lang.Object r15 = r2.get()
            if (r15 == 0) goto L_0x0134
            X.4bG r15 = (X.C88894bG) r15
            int r2 = r15.A00
            switch(r19) {
                case 1: goto L_0x0061;
                case 2: goto L_0x0068;
                case 3: goto L_0x0035;
                case 4: goto L_0x0034;
                case 5: goto L_0x006f;
                case 6: goto L_0x007f;
                case 7: goto L_0x0086;
                case 8: goto L_0x0034;
                case 9: goto L_0x008d;
                case 10: goto L_0x0034;
                case 11: goto L_0x009a;
                case 12: goto L_0x00a1;
                case 13: goto L_0x005a;
                default: goto L_0x0034;
            }
        L_0x0034:
            return
        L_0x0035:
            X.0lz r3 = r3.A02
            java.lang.String r2 = X.AnonymousClass0X5.A02(r2, r6)
            r3.AL7(r2)
            X.0WJ r2 = r0.A00
            if (r2 != 0) goto L_0x0050
            r5 = 0
            X.0l4 r2 = r0.A07
            long r7 = r2.now()
            r9 = 1
            java.lang.String r4 = "bloks_query"
            r3.A5o(r4, r5, r7, r9)
        L_0x0050:
            X.0Qa r0 = r0.A05
            java.lang.String r0 = r0.A04
            if (r0 != 0) goto L_0x0034
            r3.AgK(r1)
            return
        L_0x005a:
            X.0lz r1 = r3.A02
            java.lang.String r0 = X.AnonymousClass0X5.A02(r2, r12)
            goto L_0x00a7
        L_0x0061:
            X.0lz r1 = r3.A02
            java.lang.String r0 = X.AnonymousClass0X5.A02(r2, r4)
            goto L_0x00a7
        L_0x0068:
            X.0lz r1 = r3.A02
            java.lang.String r0 = X.AnonymousClass0X5.A02(r2, r5)
            goto L_0x00a7
        L_0x006f:
            java.lang.Throwable r0 = r0.A06()
            if (r0 == 0) goto L_0x0079
            java.lang.String r13 = r0.getMessage()
        L_0x0079:
            X.0lz r0 = r3.A02
            r0.A8t(r13)
            return
        L_0x007f:
            X.0lz r1 = r3.A02
            java.lang.String r0 = X.AnonymousClass0X5.A02(r2, r7)
            goto L_0x00a7
        L_0x0086:
            X.0lz r1 = r3.A02
            java.lang.String r0 = X.AnonymousClass0X5.A02(r2, r8)
            goto L_0x00a7
        L_0x008d:
            X.0lz r3 = r3.A02
            java.lang.String r1 = X.AnonymousClass0X5.A02(r2, r9)
            r3.AL7(r1)
            r0.A0B(r3, r15)
            return
        L_0x009a:
            X.0lz r1 = r3.A02
            java.lang.String r0 = X.AnonymousClass0X5.A02(r2, r10)
            goto L_0x00a7
        L_0x00a1:
            X.0lz r1 = r3.A02
            java.lang.String r0 = X.AnonymousClass0X5.A02(r2, r11)
        L_0x00a7:
            r1.AL7(r0)
            return
        L_0x00ab:
            r16 = move-exception
            X.0X5 r2 = r3.A00
            java.util.concurrent.atomic.AtomicReference r0 = r2.A0A
            java.lang.Object r15 = r0.get()
            if (r15 == 0) goto L_0x0134
            X.4bG r15 = (X.C88894bG) r15
            int r0 = r15.A00
            switch(r19) {
                case 1: goto L_0x00ea;
                case 2: goto L_0x00f1;
                case 3: goto L_0x00be;
                case 4: goto L_0x00bd;
                case 5: goto L_0x00f8;
                case 6: goto L_0x0108;
                case 7: goto L_0x010f;
                case 8: goto L_0x00bd;
                case 9: goto L_0x0116;
                case 10: goto L_0x00bd;
                case 11: goto L_0x0123;
                case 12: goto L_0x012a;
                case 13: goto L_0x00e3;
                default: goto L_0x00bd;
            }
        L_0x00bd:
            throw r16
        L_0x00be:
            X.0lz r3 = r3.A02
            java.lang.String r0 = X.AnonymousClass0X5.A02(r0, r6)
            r3.AL7(r0)
            X.0WJ r0 = r2.A00
            if (r0 != 0) goto L_0x00d9
            r5 = 0
            X.0l4 r0 = r2.A07
            long r7 = r0.now()
            r9 = 1
            java.lang.String r4 = "bloks_query"
            r3.A5o(r4, r5, r7, r9)
        L_0x00d9:
            X.0Qa r0 = r2.A05
            java.lang.String r0 = r0.A04
            if (r0 != 0) goto L_0x00bd
            r3.AgK(r1)
            throw r16
        L_0x00e3:
            X.0lz r1 = r3.A02
            java.lang.String r0 = X.AnonymousClass0X5.A02(r0, r12)
            goto L_0x0130
        L_0x00ea:
            X.0lz r1 = r3.A02
            java.lang.String r0 = X.AnonymousClass0X5.A02(r0, r4)
            goto L_0x0130
        L_0x00f1:
            X.0lz r1 = r3.A02
            java.lang.String r0 = X.AnonymousClass0X5.A02(r0, r5)
            goto L_0x0130
        L_0x00f8:
            java.lang.Throwable r0 = r2.A06()
            if (r0 == 0) goto L_0x0102
            java.lang.String r13 = r0.getMessage()
        L_0x0102:
            X.0lz r0 = r3.A02
            r0.A8t(r13)
            throw r16
        L_0x0108:
            X.0lz r1 = r3.A02
            java.lang.String r0 = X.AnonymousClass0X5.A02(r0, r7)
            goto L_0x0130
        L_0x010f:
            X.0lz r1 = r3.A02
            java.lang.String r0 = X.AnonymousClass0X5.A02(r0, r8)
            goto L_0x0130
        L_0x0116:
            X.0lz r1 = r3.A02
            java.lang.String r0 = X.AnonymousClass0X5.A02(r0, r9)
            r1.AL7(r0)
            r2.A0B(r1, r15)
            throw r16
        L_0x0123:
            X.0lz r1 = r3.A02
            java.lang.String r0 = X.AnonymousClass0X5.A02(r0, r10)
            goto L_0x0130
        L_0x012a:
            X.0lz r1 = r3.A02
            java.lang.String r0 = X.AnonymousClass0X5.A02(r0, r11)
        L_0x0130:
            r1.AL7(r0)
            throw r16
        L_0x0134:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0T(r17)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C08660e0.AW3(int):void");
    }
}
