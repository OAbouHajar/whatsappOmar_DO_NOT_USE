package X;

import android.app.Activity;
import android.net.Uri;
import java.util.List;

/* renamed from: X.2KB  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2KB implements AnonymousClass20K {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ Uri A01;
    public final /* synthetic */ C14600pS A02;
    public final /* synthetic */ AnonymousClass2KA A03;
    public final /* synthetic */ AnonymousClass10X A04;
    public final /* synthetic */ C35541m6 A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ List A07;

    public /* synthetic */ AnonymousClass2KB(Activity activity, Uri uri, C14600pS r3, AnonymousClass2KA r4, AnonymousClass10X r5, C35541m6 r6, String str, List list) {
        this.A04 = r5;
        this.A01 = uri;
        this.A00 = activity;
        this.A07 = list;
        this.A06 = str;
        this.A05 = r6;
        this.A03 = r4;
        this.A02 = r3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00f0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void ARK(java.io.File r29) {
        /*
            r28 = this;
            r0 = r28
            X.10X r9 = r0.A04
            android.net.Uri r8 = r0.A01
            android.app.Activity r7 = r0.A00
            java.util.List r11 = r0.A07
            java.lang.String r10 = r0.A06
            X.1m6 r6 = r0.A05
            X.2KA r5 = r0.A03
            X.0pS r4 = r0.A02
            java.lang.String r0 = "doodle"
            java.lang.String r12 = r8.getQueryParameter(r0)     // Catch:{ IOException | NullPointerException -> 0x00c9 }
            r13 = 0
            if (r12 == 0) goto L_0x002f
            X.0sb r0 = r9.A00     // Catch:{ IOException | NullPointerException -> 0x00c9 }
            java.io.File r3 = X.C17970vw.A0E(r0, r12)     // Catch:{ IOException | NullPointerException -> 0x00c9 }
            X.0um r2 = r9.A09     // Catch:{ IOException | NullPointerException -> 0x00c9 }
            X.013 r1 = r9.A06     // Catch:{ IOException | NullPointerException -> 0x00c9 }
            X.1MF r0 = r9.A0I     // Catch:{ IOException | NullPointerException -> 0x00c9 }
            X.3Bj r13 = X.C62033Bj.A01(r7, r1, r2, r0, r3)     // Catch:{ IOException | NullPointerException -> 0x00c9 }
            if (r13 == 0) goto L_0x00c1
            r13.A05 = r12     // Catch:{ IOException | NullPointerException -> 0x00c9 }
        L_0x002f:
            r3 = 0
            r16 = 0
            r1 = r29
            boolean r14 = com.whatsapp.GifHelper.A01(r1)     // Catch:{ IOException | NullPointerException -> 0x00c9 }
            java.lang.String r0 = "sendmedia/sendmediafile - send video"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IOException | NullPointerException -> 0x00c9 }
            X.0ta r2 = new X.0ta     // Catch:{ IOException | NullPointerException -> 0x00c9 }
            r2.<init>()     // Catch:{ IOException | NullPointerException -> 0x00c9 }
            r2.A0F = r1     // Catch:{ IOException | NullPointerException -> 0x00c9 }
            r12 = 1
            if (r13 != 0) goto L_0x0053
            android.graphics.Bitmap r1 = X.C18830xK.A01(r1)     // Catch:{ IOException | NullPointerException -> 0x00c9 }
            r0 = 100
            byte[] r1 = X.C18830xK.A03(r1, r0)     // Catch:{ IOException | NullPointerException -> 0x00c9 }
            goto L_0x0091
        L_0x0053:
            android.graphics.Bitmap r1 = X.C18830xK.A01(r1)     // Catch:{ IOException | NullPointerException -> 0x00c9 }
            if (r1 == 0) goto L_0x008d
            boolean r0 = r1.isMutable()     // Catch:{ IOException | NullPointerException -> 0x00c9 }
            if (r0 != 0) goto L_0x0067
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ IOException | NullPointerException -> 0x00c9 }
            android.graphics.Bitmap r1 = r1.copy(r0, r12)     // Catch:{ IOException | NullPointerException -> 0x00c9 }
            if (r1 == 0) goto L_0x008d
        L_0x0067:
            r13.A07(r1, r3, r3, r3)     // Catch:{ IOException | NullPointerException -> 0x00c9 }
            r0 = 100
            byte[] r1 = X.C18830xK.A03(r1, r0)     // Catch:{ IOException | NullPointerException -> 0x00c9 }
        L_0x0070:
            java.lang.String r0 = r13.A05     // Catch:{ IOException | NullPointerException -> 0x00c9 }
            if (r0 != 0) goto L_0x008f
            java.lang.String r12 = X.C17970vw.A0H()     // Catch:{ IOException | NullPointerException -> 0x00c9 }
            r2.A0H = r12     // Catch:{ IOException | NullPointerException -> 0x00c9 }
            X.0sb r0 = r9.A00     // Catch:{ IOException | NullPointerException -> 0x00c9 }
            java.io.File r0 = X.C17970vw.A0E(r0, r12)     // Catch:{ IOException | NullPointerException -> 0x00c9 }
            boolean r0 = r13.A0A(r0)     // Catch:{ IOException | NullPointerException -> 0x00c9 }
            if (r0 != 0) goto L_0x0091
            X.0pt r1 = r9.A01     // Catch:{ IOException | NullPointerException -> 0x00c9 }
            r0 = 2131891709(0x7f1215fd, float:1.9418146E38)
            r6 = 0
            goto L_0x00b8
        L_0x008d:
            r1 = 0
            goto L_0x0070
        L_0x008f:
            r2.A0H = r0     // Catch:{ IOException | NullPointerException -> 0x00c9 }
        L_0x0091:
            X.0tb r0 = r9.A03     // Catch:{ IOException | NullPointerException -> 0x00c9 }
            X.0wK r15 = r9.A0C     // Catch:{ IOException | NullPointerException -> 0x00c9 }
            r24 = 3
            if (r14 == 0) goto L_0x009b
            r24 = 13
        L_0x009b:
            r22 = r16
            r23 = r16
            r25 = 0
            r26 = 0
            r27 = 0
            r19 = r16
            r20 = r10
            r21 = r11
            r18 = r6
            r17 = r2
            X.1zg r2 = r15.A00(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)     // Catch:{ IOException | NullPointerException -> 0x00c9 }
            r0.A07(r2, r1, r3, r3)     // Catch:{ IOException | NullPointerException -> 0x00c9 }
            r6 = 0
            goto L_0x00bb
        L_0x00b8:
            r1.A09(r0, r3)     // Catch:{ IOException | NullPointerException -> 0x00bf }
        L_0x00bb:
            r5.AZS(r8)     // Catch:{ IOException | NullPointerException -> 0x00bf }
            return
        L_0x00bf:
            r2 = move-exception
            goto L_0x00cb
        L_0x00c1:
            java.lang.String r1 = "Doodle object is null"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ IOException | NullPointerException -> 0x00c9 }
            r0.<init>(r1)     // Catch:{ IOException | NullPointerException -> 0x00c9 }
            throw r0     // Catch:{ IOException | NullPointerException -> 0x00c9 }
        L_0x00c9:
            r2 = move-exception
            r6 = 0
        L_0x00cb:
            java.lang.String r0 = r2.getMessage()
            if (r0 == 0) goto L_0x00f0
            java.lang.String r1 = r2.getMessage()
            java.lang.String r0 = "No space"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x00f0
            X.0pt r1 = r9.A01
            r0 = 2131888210(0x7f120852, float:1.9411049E38)
            java.lang.String r0 = r7.getString(r0)
            r1.A0G(r4, r0)
        L_0x00e9:
            java.lang.String r0 = "sendmedia/sendvideo/error "
            com.whatsapp.util.Log.e(r0, r2)
            return
        L_0x00f0:
            X.0pt r1 = r9.A01
            r0 = 2131891709(0x7f1215fd, float:1.9418146E38)
            r1.A09(r0, r6)
            goto L_0x00e9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2KB.ARK(java.io.File):void");
    }
}
