package com.facebook.redex;

import X.C108865Pu;

public class IDxCListenerShape93S0200000_1_I0 implements C108865Pu {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxCListenerShape93S0200000_1_I0(Object obj, int i2, Object obj2) {
        this.A02 = i2;
        this.A00 = obj2;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00b6, code lost:
        if (r6.equals("video/x.looping_mp4") != false) goto L_0x00b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0035, code lost:
        if ("video/x.looping_mp4".equals(r3) != false) goto L_0x0037;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onCommitContent(androidx.core.view.inputmethod.InputContentInfoCompat r17, int r18, android.os.Bundle r19) {
        /*
            r16 = this;
            r1 = r16
            int r0 = r1.A02
            r5 = r17
            r2 = r18
            if (r0 == 0) goto L_0x0095
            java.lang.Object r4 = r1.A00
            com.obwhatsapp.textstatuscomposer.TextStatusComposerActivity r4 = (com.obwhatsapp.textstatuscomposer.TextStatusComposerActivity) r4
            java.lang.Object r0 = r1.A01
            X.4ag r0 = (X.C88544ag) r0
            X.4Gu r0 = r0.A00(r5, r2)
            if (r0 == 0) goto L_0x010b
            android.net.Uri r7 = r0.A00
            java.lang.String r3 = r0.A01
            if (r7 == 0) goto L_0x0085
            java.util.ArrayList r6 = X.AnonymousClass000.A0u()
            r6.add(r7)
            java.lang.String r0 = "image/gif"
            boolean r0 = r0.equals(r3)
            java.lang.String r2 = "video/x.looping_mp4"
            if (r0 != 0) goto L_0x0037
            boolean r0 = r2.equals(r3)
            r5 = 5
            if (r0 == 0) goto L_0x0039
        L_0x0037:
            r5 = 23
        L_0x0039:
            com.obwhatsapp.status.playback.widget.StatusEditText r0 = r4.A0a
            java.lang.String r0 = r0.getStringText()
            java.lang.String r0 = X.C40651uT.A05(r0)
            X.20I r1 = new X.20I
            r1.<init>(r7)
            r1.A0D(r0)
            boolean r0 = r2.equals(r3)
            if (r0 == 0) goto L_0x005a
            r0 = 13
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)
            r1.A0C(r0)
        L_0x005a:
            X.29Q r3 = new X.29Q
            r3.<init>(r1)
            X.2KC r2 = new X.2KC
            r2.<init>(r4)
            r2.A0E = r6
            X.1kq r0 = X.C34771kq.A00
            java.lang.String r0 = r0.getRawString()
            r2.A0A = r0
            r2.A02 = r5
            r1 = 1
            r2.A0I = r1
            android.os.Bundle r0 = X.C13690nt.A0D()
            r3.A02(r0)
            r2.A08 = r0
            android.content.Intent r0 = r2.A00()
            r4.startActivityForResult(r0, r1)
        L_0x0083:
            r0 = 1
            return r0
        L_0x0085:
            java.lang.String r0 = "textstatus/setuppreview/share-failed"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.0pt r2 = r4.A05
            r1 = 2131891709(0x7f1215fd, float:1.9418146E38)
            r0 = 0
            r2.A09(r1, r0)
            goto L_0x0083
        L_0x0095:
            java.lang.Object r3 = r1.A00
            X.1yj r3 = (X.C42821yj) r3
            java.lang.Object r0 = r1.A01
            X.4ag r0 = (X.C88544ag) r0
            X.4Gu r4 = r0.A00(r5, r2)
            r13 = 0
            if (r4 == 0) goto L_0x010b
            java.lang.String r6 = r4.A01
            java.lang.String r0 = "image/gif"
            boolean r0 = r6.equals(r0)
            java.lang.String r1 = "video/x.looping_mp4"
            if (r0 != 0) goto L_0x00b8
            boolean r0 = r6.equals(r1)
            r5 = 5
            if (r0 == 0) goto L_0x00ba
        L_0x00b8:
            r5 = 23
        L_0x00ba:
            boolean r0 = r6.equals(r1)
            r9 = 0
            if (r0 == 0) goto L_0x0100
            r0 = 13
            java.lang.Byte r2 = java.lang.Byte.valueOf(r0)
        L_0x00c7:
            java.lang.String r0 = "image/webp.wasticker"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0102
            X.1jm r2 = new X.1jm
            r2.<init>()
            X.1pj[] r12 = new X.C37781pj[r13]
            java.lang.String r6 = ""
            r8 = r6
            r11 = r9
            r14 = 0
            r15 = 0
            X.1XO r5 = new X.1XO
            r7 = r6
            r10 = r9
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r2.A04 = r5
            r0 = 512(0x200, float:7.175E-43)
            r2.A03 = r0
            r2.A02 = r0
            java.lang.String r0 = "image/webp"
            r2.A0C = r0
            android.net.Uri r0 = r4.A00
            java.lang.String r1 = r0.toString()
            r0 = 3
            r2.A09 = r1
            r2.A01 = r0
            X.5QT r0 = r3.A5B
            r0.AXt(r2, r9, r13)
            goto L_0x0083
        L_0x0100:
            r2 = r9
            goto L_0x00c7
        L_0x0102:
            X.2jf r1 = r3.A1i
            android.net.Uri r0 = r4.A00
            r1.A0A(r0, r2, r5)
            goto L_0x0083
        L_0x010b:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxCListenerShape93S0200000_1_I0.onCommitContent(androidx.core.view.inputmethod.InputContentInfoCompat, int, android.os.Bundle):boolean");
    }
}
