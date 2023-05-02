package X;

import android.text.TextUtils;
import com.obwhatsapp.R;
import java.io.File;
import java.lang.ref.WeakReference;

/* renamed from: X.36u  reason: invalid class name and case insensitive filesystem */
public class C609636u extends C16690tT {
    public WeakReference A00;
    public final C14870pt A01;
    public final C17130ua A02;
    public final C16490t9 A03;
    public final C87394Wp A04 = new C87394Wp();
    public final File A05;

    public C609636u(C14550pN r2, C14870pt r3, C17130ua r4, C16490t9 r5, File file) {
        this.A01 = r3;
        this.A02 = r4;
        this.A03 = r5;
        this.A00 = C13690nt.A0h(r2);
        this.A05 = file;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00fe, code lost:
        if (r2 == null) goto L_0x0103;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x00ef */
    /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00f4 */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x010d  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:33:0x00f4=Splitter:B:33:0x00f4, B:23:0x00e7=Splitter:B:23:0x00e7} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r12) {
        /*
            r11 = this;
            java.lang.String r6 = "\r\n"
            java.lang.String r5 = "*****"
            java.io.File r8 = r11.A05
            boolean r0 = r8.exists()
            r4 = 0
            if (r0 != 0) goto L_0x0013
            java.lang.String r0 = "GoogleReverseImageSearchAsyncTask/doInBackground invalid file to search"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return r4
        L_0x0013:
            X.4Wp r3 = r11.A04
            r3.A02()
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0q(r5)     // Catch:{ IOException | URISyntaxException -> 0x00f7, all -> 0x010a }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ IOException | URISyntaxException -> 0x00f7, all -> 0x010a }
            r2.append(r0)     // Catch:{ IOException | URISyntaxException -> 0x00f7, all -> 0x010a }
            java.lang.String r7 = X.AnonymousClass000.A0h(r5, r2)     // Catch:{ IOException | URISyntaxException -> 0x00f7, all -> 0x010a }
            java.lang.String r1 = "https://images.google.com/searchbyimage/upload"
            java.net.URL r0 = new java.net.URL     // Catch:{ IOException | URISyntaxException -> 0x00f7, all -> 0x010a }
            r0.<init>(r1)     // Catch:{ IOException | URISyntaxException -> 0x00f7, all -> 0x010a }
            java.net.URLConnection r2 = r0.openConnection()     // Catch:{ IOException | URISyntaxException -> 0x00f7, all -> 0x010a }
            javax.net.ssl.HttpsURLConnection r2 = (javax.net.ssl.HttpsURLConnection) r2     // Catch:{ IOException | URISyntaxException -> 0x00f7, all -> 0x010a }
            r10 = 1
            r2.setDoInput(r10)     // Catch:{ IOException | URISyntaxException -> 0x00f5 }
            r0 = 0
            r2.setDoOutput(r0)     // Catch:{ IOException | URISyntaxException -> 0x00f5 }
            r2.setUseCaches(r0)     // Catch:{ IOException | URISyntaxException -> 0x00f5 }
            r0 = 15000(0x3a98, float:2.102E-41)
            r2.setConnectTimeout(r0)     // Catch:{ IOException | URISyntaxException -> 0x00f5 }
            r0 = 30000(0x7530, float:4.2039E-41)
            r2.setReadTimeout(r0)     // Catch:{ IOException | URISyntaxException -> 0x00f5 }
            java.lang.String r0 = "POST"
            r2.setRequestMethod(r0)     // Catch:{ IOException | URISyntaxException -> 0x00f5 }
            java.lang.String r1 = "Connection"
            java.lang.String r0 = "Keep-Alive"
            r2.setRequestProperty(r1, r0)     // Catch:{ IOException | URISyntaxException -> 0x00f5 }
            java.lang.String r1 = "Cache-Control"
            java.lang.String r0 = "no-cache"
            r2.setRequestProperty(r1, r0)     // Catch:{ IOException | URISyntaxException -> 0x00f5 }
            java.lang.String r5 = "Content-Type"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()     // Catch:{ IOException | URISyntaxException -> 0x00f5 }
            java.lang.String r0 = "multipart/form-data; boundary="
            r1.append(r0)     // Catch:{ IOException | URISyntaxException -> 0x00f5 }
            java.lang.String r0 = X.AnonymousClass000.A0h(r7, r1)     // Catch:{ IOException | URISyntaxException -> 0x00f5 }
            r2.setRequestProperty(r5, r0)     // Catch:{ IOException | URISyntaxException -> 0x00f5 }
            X.0ua r9 = r11.A02     // Catch:{ IOException | URISyntaxException -> 0x00f5 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r10)     // Catch:{ IOException | URISyntaxException -> 0x00f5 }
            java.io.OutputStream r1 = r2.getOutputStream()     // Catch:{ IOException | URISyntaxException -> 0x00f5 }
            X.1pm r0 = new X.1pm     // Catch:{ IOException | URISyntaxException -> 0x00f5 }
            r0.<init>(r9, r1, r4, r5)     // Catch:{ IOException | URISyntaxException -> 0x00f5 }
            java.io.DataOutputStream r5 = new java.io.DataOutputStream     // Catch:{ IOException | URISyntaxException -> 0x00f5 }
            r5.<init>(r0)     // Catch:{ IOException | URISyntaxException -> 0x00f5 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()     // Catch:{ all -> 0x00f0 }
            java.lang.String r0 = "--"
            r1.append(r0)     // Catch:{ all -> 0x00f0 }
            r1.append(r7)     // Catch:{ all -> 0x00f0 }
            java.lang.String r0 = X.AnonymousClass000.A0h(r6, r1)     // Catch:{ all -> 0x00f0 }
            r5.writeBytes(r0)     // Catch:{ all -> 0x00f0 }
            java.lang.String r0 = "Content-Disposition: form-data; name=\"encoded_image\"\r\n"
            r5.writeBytes(r0)     // Catch:{ all -> 0x00f0 }
            java.lang.String r0 = "Content-Type: image/jpeg\r\n"
            r5.writeBytes(r0)     // Catch:{ all -> 0x00f0 }
            java.lang.String r0 = "Content-Transfer-Encoding: binary\r\n"
            r5.writeBytes(r0)     // Catch:{ all -> 0x00f0 }
            r5.writeBytes(r6)     // Catch:{ all -> 0x00f0 }
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch:{ all -> 0x00f0 }
            r6.<init>(r8)     // Catch:{ all -> 0x00f0 }
            X.AnonymousClass1XI.A0H(r6, r5)     // Catch:{ all -> 0x00eb }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()     // Catch:{ all -> 0x00eb }
            java.lang.String r0 = "\r\n--"
            r1.append(r0)     // Catch:{ all -> 0x00eb }
            r1.append(r7)     // Catch:{ all -> 0x00eb }
            java.lang.String r0 = "--\r\n"
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)     // Catch:{ all -> 0x00eb }
            r5.writeBytes(r0)     // Catch:{ all -> 0x00eb }
            r6.close()     // Catch:{ all -> 0x00f0 }
            int r1 = r2.getResponseCode()     // Catch:{ all -> 0x00f0 }
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 != r0) goto L_0x00e7
            java.net.URL r0 = r2.getURL()     // Catch:{ all -> 0x00f0 }
            java.net.URI r0 = r0.toURI()     // Catch:{ all -> 0x00f0 }
            if (r0 == 0) goto L_0x00e7
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00f0 }
            r5.close()     // Catch:{ IOException | URISyntaxException -> 0x00f5 }
            r2.disconnect()
            r3.A00()
            return r0
        L_0x00e7:
            r5.close()     // Catch:{ IOException | URISyntaxException -> 0x00f5 }
            goto L_0x0100
        L_0x00eb:
            r0 = move-exception
            r6.close()     // Catch:{ all -> 0x00ef }
        L_0x00ef:
            throw r0     // Catch:{ all -> 0x00f0 }
        L_0x00f0:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x00f4 }
        L_0x00f4:
            throw r0     // Catch:{ IOException | URISyntaxException -> 0x00f5 }
        L_0x00f5:
            r1 = move-exception
            goto L_0x00f9
        L_0x00f7:
            r1 = move-exception
            r2 = r4
        L_0x00f9:
            java.lang.String r0 = "GoogleReverseImageSearchAsyncTask/searchImage/malformedUrl "
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0107 }
            if (r2 == 0) goto L_0x0103
        L_0x0100:
            r2.disconnect()
        L_0x0103:
            r3.A00()
            return r4
        L_0x0107:
            r0 = move-exception
            r4 = r2
            goto L_0x010b
        L_0x010a:
            r0 = move-exception
        L_0x010b:
            if (r4 == 0) goto L_0x0110
            r4.disconnect()
        L_0x0110:
            r3.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C609636u.A08(java.lang.Object[]):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        String str = (String) obj;
        C14550pN r3 = (C14550pN) this.A00.get();
        if (r3 != null && !r3.AIm()) {
            r3.Ac1();
            if (TextUtils.isEmpty(str)) {
                this.A01.A07(R.string.str1498, 0);
                return;
            }
            C74263qC r2 = new C74263qC();
            r2.A00 = Long.valueOf(this.A04.A00);
            this.A03.A05(r2);
            r3.A2X(C13680ns.A0A(str), false);
        }
    }
}
