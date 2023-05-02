package X;

import com.whatsapp.GifHelper;

/* renamed from: X.0vv  reason: invalid class name and case insensitive filesystem */
public class C17960vv extends C17970vw {
    public final AnonymousClass01V A00;
    public final C16510tB A01;

    public C17960vv(AnonymousClass01V r3, C16510tB r4) {
        this.A00 = r3;
        this.A01 = r4;
        r4.A01.add("com.obwhatsapp.provider.MigrationContentProvider");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001a, code lost:
        if (r2 != null) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte A00(android.net.Uri r4) {
        /*
            r3 = this;
            X.01V r0 = r3.A00
            android.content.ContentResolver r1 = r0.A0C()
            if (r1 != 0) goto L_0x0016
            java.lang.String r0 = "media-file-utils/get-media-mime cr=null"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x000d:
            java.lang.String r0 = X.C17970vw.A0I(r4)
            java.lang.String r2 = X.C17970vw.A0J(r0)
            goto L_0x001c
        L_0x0016:
            java.lang.String r2 = r1.getType(r4)
            if (r2 == 0) goto L_0x000d
        L_0x001c:
            java.lang.String r0 = "image/gif"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0036 }
            if (r0 == 0) goto L_0x003c
            X.0tB r0 = r3.A01     // Catch:{ IOException -> 0x0036 }
            X.C41911wr.A02(r1, r4, r0)     // Catch:{ IOException -> 0x003c }
            X.1ws r0 = X.C41911wr.A02(r1, r4, r0)     // Catch:{ IOException -> 0x0036 }
            boolean r0 = r0.A02     // Catch:{ IOException -> 0x0036 }
            r1 = r0 ^ 1
            r0 = 13
            if (r1 == 0) goto L_0x0046
            goto L_0x0045
        L_0x0036:
            r1 = move-exception
            java.lang.String r0 = "Media file cannot be read"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x003c:
            byte r0 = X.C17970vw.A00(r2)
            if (r0 != 0) goto L_0x0046
            r0 = 9
            return r0
        L_0x0045:
            r0 = 1
        L_0x0046:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17960vv.A00(android.net.Uri):byte");
    }

    public byte A01(AnonymousClass20I r4) {
        Byte A06 = r4.A06();
        if (A06 == null) {
            byte A002 = A00(r4.A0G);
            A06 = Byte.valueOf(A002);
            if (A002 == 3 && GifHelper.A01(r4.A05())) {
                A06 = (byte) 13;
            }
        }
        return A06.byteValue();
    }
}
