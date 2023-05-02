package X;

import java.net.Socket;

/* renamed from: X.37a  reason: invalid class name and case insensitive filesystem */
public class C610237a extends AnonymousClass1ZS {
    public final C26611Ol A00;
    public final C82784Ed A01;
    public final String A02;
    public final String A03;
    public final Socket A04;

    public C610237a(C26611Ol r2, C82784Ed r3, String str, String str2, Socket socket) {
        super("DonorNetworkingThread");
        this.A02 = str;
        this.A03 = str2;
        this.A04 = socket;
        this.A00 = r2;
        this.A01 = r3;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:64:0x01c3 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:69:0x01c8 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:74:0x01cd */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r15 = this;
            java.lang.String r0 = "fpm/DonorNetworkingThread/Attempting to connect to receiver"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IOException -> 0x0227 }
            java.net.Socket r3 = r15.A04     // Catch:{ IOException -> 0x0227 }
            r0 = 0
            r3.bind(r0)     // Catch:{ IOException -> 0x0227 }
            java.lang.String r2 = r15.A03     // Catch:{ IOException -> 0x0227 }
            r0 = 8988(0x231c, float:1.2595E-41)
            java.net.InetSocketAddress r1 = new java.net.InetSocketAddress     // Catch:{ IOException -> 0x0227 }
            r1.<init>(r2, r0)     // Catch:{ IOException -> 0x0227 }
            r0 = 5000(0x1388, float:7.006E-42)
            r3.connect(r1, r0)     // Catch:{ IOException -> 0x0227 }
            java.lang.String r0 = "fpm/DonorNetworkingThread/Connected to receiver"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IOException -> 0x0227 }
            java.io.InputStream r14 = r3.getInputStream()     // Catch:{ IOException -> 0x0227 }
            java.io.OutputStream r11 = r3.getOutputStream()     // Catch:{ IOException -> 0x0227 }
            X.1Ol r3 = r15.A00     // Catch:{ IOException -> 0x0227 }
            java.lang.String r1 = r15.A02     // Catch:{ IOException -> 0x0227 }
            java.util.concurrent.CountDownLatch r0 = r3.A0B     // Catch:{ IOException | InterruptedException -> 0x0211 }
            r0.await()     // Catch:{ IOException | InterruptedException -> 0x0211 }
            java.lang.String r10 = X.AnonymousClass01S.A08     // Catch:{ IOException | InterruptedException -> 0x0211 }
            byte[] r1 = r1.getBytes(r10)     // Catch:{ IOException | InterruptedException -> 0x0211 }
            r0 = 400(0x190, float:5.6E-43)
            X.3v6 r4 = new X.3v6     // Catch:{ IOException | InterruptedException -> 0x0211 }
            r4.<init>(r0, r1)     // Catch:{ IOException | InterruptedException -> 0x0211 }
        L_0x003c:
            X.C87654Xz.A01(r4, r11)     // Catch:{ IOException | InterruptedException -> 0x0211 }
        L_0x003f:
            X.4bJ r2 = X.C87654Xz.A00(r14)     // Catch:{ IOException | InterruptedException -> 0x0211 }
            int r1 = r2.A01     // Catch:{ IOException | InterruptedException -> 0x0211 }
            r0 = 300(0x12c, float:4.2E-43)
            r4 = 1
            if (r1 == r0) goto L_0x01e8
            r0 = 301(0x12d, float:4.22E-43)
            if (r1 == r0) goto L_0x01de
            switch(r1) {
                case 100: goto L_0x00b9;
                case 101: goto L_0x00f8;
                case 102: goto L_0x0053;
                default: goto L_0x0051;
            }     // Catch:{ IOException | InterruptedException -> 0x0211 }
        L_0x0051:
            goto L_0x01ab
        L_0x0053:
            X.0sv r2 = r3.A07     // Catch:{ IOException | InterruptedException -> 0x0211 }
            long r8 = r2.A01()     // Catch:{ IOException | InterruptedException -> 0x0211 }
            long r0 = r2.A00()     // Catch:{ IOException | InterruptedException -> 0x0211 }
            long r8 = r8 + r0
            java.lang.System.currentTimeMillis()     // Catch:{ IOException | InterruptedException -> 0x0211 }
            X.57f r13 = r2.A03()     // Catch:{ IOException | InterruptedException -> 0x0211 }
            r6 = 0
            r2 = 0
        L_0x0068:
            boolean r0 = r13.hasNext()     // Catch:{ all -> 0x01b5 }
            if (r0 == 0) goto L_0x00a9
            java.lang.Object r12 = r13.next()     // Catch:{ all -> 0x01b5 }
            X.4No r12 = (X.C85214No) r12     // Catch:{ all -> 0x01b5 }
            java.io.File r5 = r12.A02     // Catch:{ all -> 0x01b5 }
            boolean r0 = r5.exists()     // Catch:{ all -> 0x01b5 }
            if (r0 == 0) goto L_0x0096
            java.lang.String r0 = r12.A04     // Catch:{ all -> 0x01b5 }
            byte[] r4 = r0.getBytes(r10)     // Catch:{ all -> 0x01b5 }
            r1 = 202(0xca, float:2.83E-43)
            X.3v6 r0 = new X.3v6     // Catch:{ all -> 0x01b5 }
            r0.<init>(r1, r4)     // Catch:{ all -> 0x01b5 }
            X.C87654Xz.A01(r0, r11)     // Catch:{ all -> 0x01b5 }
            r1 = 203(0xcb, float:2.84E-43)
            X.3v7 r0 = new X.3v7     // Catch:{ all -> 0x01b5 }
            r0.<init>(r5, r1)     // Catch:{ all -> 0x01b5 }
            X.C87654Xz.A01(r0, r11)     // Catch:{ all -> 0x01b5 }
        L_0x0096:
            long r0 = r12.A01     // Catch:{ all -> 0x01b5 }
            long r6 = r6 + r0
            r0 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r4 = (double) r6     // Catch:{ all -> 0x01b5 }
            double r4 = r4 * r0
            double r0 = (double) r8     // Catch:{ all -> 0x01b5 }
            double r4 = r4 / r0
            int r1 = (int) r4     // Catch:{ all -> 0x01b5 }
            if (r2 == r1) goto L_0x0068
            X.1Oj r0 = r3.A08     // Catch:{ all -> 0x01b5 }
            r0.A05(r1)     // Catch:{ all -> 0x01b5 }
            r2 = r1
            goto L_0x0068
        L_0x00a9:
            java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x01b5 }
            r13.close()     // Catch:{ IOException | InterruptedException -> 0x0211 }
            r2 = 300(0x12c, float:4.2E-43)
            r0 = 0
            X.4bJ r4 = new X.4bJ     // Catch:{ IOException | InterruptedException -> 0x0211 }
            r4.<init>(r2, r0)     // Catch:{ IOException | InterruptedException -> 0x0211 }
            goto L_0x003c
        L_0x00b9:
            X.1Oj r0 = r3.A08     // Catch:{ IOException | InterruptedException -> 0x0211 }
            java.util.Iterator r2 = X.C16590tJ.A00(r0)     // Catch:{ IOException | InterruptedException -> 0x0211 }
        L_0x00bf:
            boolean r0 = r2.hasNext()     // Catch:{ IOException | InterruptedException -> 0x0211 }
            if (r0 == 0) goto L_0x00d2
            java.lang.Object r0 = r2.next()     // Catch:{ IOException | InterruptedException -> 0x0211 }
            X.4zv r0 = (X.C103034zv) r0     // Catch:{ IOException | InterruptedException -> 0x0211 }
            com.obwhatsapp.migration.transfer.ui.DeviceTransferViewModel r1 = r0.A00     // Catch:{ IOException | InterruptedException -> 0x0211 }
            r0 = 3
            r1.A08(r0)     // Catch:{ IOException | InterruptedException -> 0x0211 }
            goto L_0x00bf
        L_0x00d2:
            X.1Bq r1 = r3.A06     // Catch:{ IOException | InterruptedException -> 0x0211 }
            java.lang.String r0 = "enc-metadata"
            java.io.File r5 = r1.A00(r0)     // Catch:{ IOException | InterruptedException -> 0x0211 }
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ IOException | InterruptedException -> 0x0211 }
            r0.<init>(r5)     // Catch:{ IOException | InterruptedException -> 0x0211 }
            java.util.zip.ZipOutputStream r4 = new java.util.zip.ZipOutputStream     // Catch:{ IOException | InterruptedException -> 0x0211 }
            r4.<init>(r0)     // Catch:{ IOException | InterruptedException -> 0x0211 }
            X.1Bs r2 = r3.A05     // Catch:{ all -> 0x01ba }
            android.os.CancellationSignal r1 = X.C26611Ol.A0C     // Catch:{ all -> 0x01ba }
            r0 = 0
            r2.A03(r1, r4, r0)     // Catch:{ all -> 0x01ba }
            r4.close()     // Catch:{ IOException | InterruptedException -> 0x0211 }
            r0 = 200(0xc8, float:2.8E-43)
            X.3v7 r1 = new X.3v7     // Catch:{ IOException | InterruptedException -> 0x0211 }
            r1.<init>(r5, r0)     // Catch:{ IOException | InterruptedException -> 0x0211 }
            goto L_0x01a6
        L_0x00f8:
            X.1Bq r6 = r3.A06     // Catch:{ IOException | InterruptedException -> 0x0211 }
            java.lang.String r0 = "messages"
            java.io.File r2 = r6.A00(r0)     // Catch:{ IOException | InterruptedException -> 0x0211 }
            X.0uv r1 = r3.A04     // Catch:{ IOException | InterruptedException -> 0x0211 }
            android.os.CancellationSignal r0 = X.C26611Ol.A0C     // Catch:{ IOException | InterruptedException -> 0x0211 }
            r1.A0H(r0, r2)     // Catch:{ IOException | InterruptedException -> 0x0211 }
            java.lang.String r0 = "fpm/DonorTransferTask/createMessagesExport()/data-exported"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IOException | InterruptedException -> 0x0211 }
            X.0sv r9 = r3.A07     // Catch:{ IOException | InterruptedException -> 0x0211 }
            java.lang.String r0 = "migration/messages_export.zip"
            long r1 = r9.A02(r2, r0, r4)     // Catch:{ IOException | InterruptedException -> 0x0211 }
            r4 = 0
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x01ce
            java.lang.String r0 = "manifest"
            java.io.File r5 = r6.A00(r0)     // Catch:{ IOException | InterruptedException -> 0x0211 }
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ IOException | InterruptedException -> 0x0211 }
            r4.<init>(r5)     // Catch:{ IOException | InterruptedException -> 0x0211 }
            java.io.OutputStreamWriter r0 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x01c9 }
            r0.<init>(r4, r10)     // Catch:{ all -> 0x01c9 }
            android.util.JsonWriter r2 = new android.util.JsonWriter     // Catch:{ all -> 0x01c9 }
            r2.<init>(r0)     // Catch:{ all -> 0x01c9 }
            r2.beginObject()     // Catch:{ all -> 0x01c4 }
            java.lang.String r0 = "totalSize"
            android.util.JsonWriter r8 = r2.name(r0)     // Catch:{ all -> 0x01c4 }
            long r0 = r9.A01()     // Catch:{ all -> 0x01c4 }
            long r6 = r9.A00()     // Catch:{ all -> 0x01c4 }
            long r0 = r0 + r6
            r8.value(r0)     // Catch:{ all -> 0x01c4 }
            java.lang.String r0 = "relativePaths"
            r2.name(r0)     // Catch:{ all -> 0x01c4 }
            r2.beginArray()     // Catch:{ all -> 0x01c4 }
            X.57f r9 = r9.A03()     // Catch:{ all -> 0x01c4 }
        L_0x0151:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x01bf }
            if (r0 == 0) goto L_0x018c
            java.lang.Object r8 = r9.next()     // Catch:{ all -> 0x01bf }
            X.4No r8 = (X.C85214No) r8     // Catch:{ all -> 0x01bf }
            java.lang.String r7 = r8.A04     // Catch:{ all -> 0x01bf }
            boolean r0 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x01bf }
            if (r0 != 0) goto L_0x0151
            r2.beginObject()     // Catch:{ all -> 0x01bf }
            java.lang.String r0 = "required"
            android.util.JsonWriter r1 = r2.name(r0)     // Catch:{ all -> 0x01bf }
            boolean r0 = r8.A05     // Catch:{ all -> 0x01bf }
            r1.value(r0)     // Catch:{ all -> 0x01bf }
            java.lang.String r0 = "size"
            android.util.JsonWriter r6 = r2.name(r0)     // Catch:{ all -> 0x01bf }
            long r0 = r8.A01     // Catch:{ all -> 0x01bf }
            r6.value(r0)     // Catch:{ all -> 0x01bf }
            java.lang.String r0 = "relative_path"
            android.util.JsonWriter r0 = r2.name(r0)     // Catch:{ all -> 0x01bf }
            r0.value(r7)     // Catch:{ all -> 0x01bf }
            r2.endObject()     // Catch:{ all -> 0x01bf }
            goto L_0x0151
        L_0x018c:
            r9.close()     // Catch:{ all -> 0x01c4 }
            r2.endArray()     // Catch:{ all -> 0x01c4 }
            android.util.JsonWriter r0 = r2.endObject()     // Catch:{ all -> 0x01c4 }
            r0.flush()     // Catch:{ all -> 0x01c4 }
            r2.close()     // Catch:{ all -> 0x01c9 }
            r4.close()     // Catch:{ IOException | InterruptedException -> 0x0211 }
            r0 = 201(0xc9, float:2.82E-43)
            X.3v7 r1 = new X.3v7     // Catch:{ IOException | InterruptedException -> 0x0211 }
            r1.<init>(r5, r0)     // Catch:{ IOException | InterruptedException -> 0x0211 }
        L_0x01a6:
            X.C87654Xz.A01(r1, r11)     // Catch:{ IOException | InterruptedException -> 0x0211 }
            goto L_0x003f
        L_0x01ab:
            java.lang.String r0 = "fpm/DonorTransferTask/Received unexpected message with type: "
            java.lang.String r0 = X.C13680ns.A0c(r1, r0)     // Catch:{ IOException | InterruptedException -> 0x0211 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ IOException | InterruptedException -> 0x0211 }
            goto L_0x022c
        L_0x01b5:
            r0 = move-exception
            r13.close()     // Catch:{ all -> 0x01cd }
            goto L_0x01cd
        L_0x01ba:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x01cd }
            goto L_0x01cd
        L_0x01bf:
            r0 = move-exception
            r9.close()     // Catch:{ all -> 0x01c3 }
        L_0x01c3:
            throw r0     // Catch:{ all -> 0x01c4 }
        L_0x01c4:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x01c8 }
        L_0x01c8:
            throw r0     // Catch:{ all -> 0x01c9 }
        L_0x01c9:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x01cd }
        L_0x01cd:
            throw r0     // Catch:{ IOException | InterruptedException -> 0x0211 }
        L_0x01ce:
            java.lang.String r0 = "fpm/DonorTransferTask/createMessagesExport()/Failed to register master file"
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0r(r0)     // Catch:{ IOException | InterruptedException -> 0x0211 }
            java.lang.String r1 = X.C13680ns.A0j(r0, r1)     // Catch:{ IOException | InterruptedException -> 0x0211 }
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException | InterruptedException -> 0x0211 }
            r0.<init>(r1)     // Catch:{ IOException | InterruptedException -> 0x0211 }
            throw r0     // Catch:{ IOException | InterruptedException -> 0x0211 }
        L_0x01de:
            int r2 = r2.A00     // Catch:{ IOException | InterruptedException -> 0x0211 }
            java.lang.String r1 = "received error message"
            X.40S r0 = new X.40S     // Catch:{ IOException | InterruptedException -> 0x0211 }
            r0.<init>(r2, r1)     // Catch:{ IOException | InterruptedException -> 0x0211 }
            throw r0     // Catch:{ IOException | InterruptedException -> 0x0211 }
        L_0x01e8:
            X.1Oj r0 = r3.A08     // Catch:{ IOException | InterruptedException -> 0x0211 }
            java.util.Iterator r2 = X.C16590tJ.A00(r0)     // Catch:{ IOException | InterruptedException -> 0x0211 }
        L_0x01ee:
            boolean r0 = r2.hasNext()     // Catch:{ IOException | InterruptedException -> 0x0211 }
            if (r0 == 0) goto L_0x0201
            java.lang.Object r0 = r2.next()     // Catch:{ IOException | InterruptedException -> 0x0211 }
            X.4zv r0 = (X.C103034zv) r0     // Catch:{ IOException | InterruptedException -> 0x0211 }
            com.obwhatsapp.migration.transfer.ui.DeviceTransferViewModel r1 = r0.A00     // Catch:{ IOException | InterruptedException -> 0x0211 }
            r0 = 4
            r1.A08(r0)     // Catch:{ IOException | InterruptedException -> 0x0211 }
            goto L_0x01ee
        L_0x0201:
            X.0y3 r0 = r3.A03     // Catch:{ IOException | InterruptedException -> 0x0211 }
            r0.A03(r4)     // Catch:{ IOException | InterruptedException -> 0x0211 }
            X.0yx r0 = r3.A0A     // Catch:{ IOException | InterruptedException -> 0x0211 }
            r0.A09()     // Catch:{ IOException | InterruptedException -> 0x0211 }
            java.lang.String r0 = "fpm/DonorTransferTask/onTransferComplete()/success"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IOException | InterruptedException -> 0x0211 }
            goto L_0x022c
        L_0x0211:
            r2 = move-exception
            X.1Oj r1 = r3.A08     // Catch:{ IOException -> 0x0227 }
            java.lang.String r0 = "fpm/TransferTaskUtils/failure during transfer process: "
            com.whatsapp.util.Log.e(r0, r2)     // Catch:{ IOException -> 0x0227 }
            boolean r0 = r2 instanceof X.AnonymousClass40S     // Catch:{ IOException -> 0x0227 }
            if (r0 == 0) goto L_0x0225
            X.40S r2 = (X.AnonymousClass40S) r2     // Catch:{ IOException -> 0x0227 }
            int r0 = r2.errorCode     // Catch:{ IOException -> 0x0227 }
        L_0x0221:
            r1.A04(r0)     // Catch:{ IOException -> 0x0227 }
            goto L_0x022c
        L_0x0225:
            r0 = 1
            goto L_0x0221
        L_0x0227:
            java.lang.String r0 = "fpm/DonorNetworkingThread/unable to connect to the receiver device"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0232 }
        L_0x022c:
            java.net.Socket r0 = r15.A04
            X.C30311c8.A07(r0)
            return
        L_0x0232:
            r1 = move-exception
            java.net.Socket r0 = r15.A04
            X.C30311c8.A07(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C610237a.run():void");
    }
}
