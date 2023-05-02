package m;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import c.d;
import com.obwhatsapp.yo.p;
import com.obwhatsapp.yo.q;
import com.obwhatsapp.yo.yo;
import com.obwhatsapp.youbasha.task.utils;
import com.obwhatsapp.youbasha.ui.YoSettings.UniversalStyle;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.net.URL;
import java.net.URLConnection;

public final class s extends AsyncTask {

    /* renamed from: h  reason: collision with root package name */
    public static final int f1840h = 0;

    /* renamed from: a  reason: collision with root package name */
    public final String f1841a = utils.dbsf("YUhSMGNITTZMeTluYVhSb2RXSXVZMjl0TDFsdlFtRnphR0V2YkdWaGNtNVNaV3hsWVhObGN5OXlaV3hsWVhObGN5OWtiM2R1Ykc5aFpDOTJNUzg", 2);

    /* renamed from: b  reason: collision with root package name */
    public File f1842b;

    /* renamed from: c  reason: collision with root package name */
    public File f1843c;

    /* renamed from: d  reason: collision with root package name */
    public final String f1844d;

    /* renamed from: e  reason: collision with root package name */
    public final String f1845e;

    /* renamed from: f  reason: collision with root package name */
    public final ProgressDialog f1846f;

    /* renamed from: g  reason: collision with root package name */
    public final UniversalStyle f1847g;

    public s(UniversalStyle universalStyle, String str, String str2) {
        this.f1847g = universalStyle;
        this.f1844d = str2;
        this.f1845e = str2 + "_emoji.zip";
        ProgressDialog progressDialog = new ProgressDialog(universalStyle);
        this.f1846f = progressDialog;
        progressDialog.setProgressStyle(1);
        progressDialog.setTitle(universalStyle.getString(yo.getID("sticker_pack_downloading_with_name", "string"), new Object[]{str}));
        progressDialog.setIndeterminate(false);
        progressDialog.setCancelable(false);
        progressDialog.setButton(-2, universalStyle.getString(17039360), new d(this, 16));
    }

    public final void a(String str, String str2) {
        UniversalStyle universalStyle = this.f1847g;
        try {
            File file = new File(this.f1842b.getAbsoluteFile(), str2);
            String str3 = "۟۠ۛۜۨۧۘۨۥۢۢۥۨۘۛۥۥۘۚ۠ۙ";
            while (true) {
                switch (str3.hashCode() ^ 1450640871) {
                    case -113315135:
                        str3 = "ۧۥۥۘۨۥۢ۠ۚ۫ۥۜۛ۫۠ۥۚ۬ۛۜۦۛ";
                        continue;
                    case 1568658:
                        if (file.exists()) {
                            str3 = "ۗۥۖۖ۫۫ۢۜۘۘۨ۟ۡۘۡۜ۟ۢ۟ۗۚۡۢۡۘ";
                            break;
                        } else {
                            str3 = "ۘۖۘۘۥ۟ۘۧۜۦۥۥۡۦۦۨۘ۬ۜۖۘۛ۟ۛۤۤۖۘ";
                            continue;
                        }
                    case 1613824022:
                        file.delete();
                        break;
                    case 1943489152:
                        break;
                    default:
                        continue;
                }
            }
            file.createNewFile();
            String str4 = "۟ۡۧۘۖۢۙ۫ۛۥ۬ۥۘۡۨ۫ۦ۟ۨۘۛۨۤۥ۟۟۠ۜۨۘ";
            while (true) {
                switch (str4.hashCode() ^ -42501274) {
                    case -1122548230:
                        universalStyle.runOnUiThread(new r(this, 0));
                        URLConnection openConnection = new URL(str + str2).openConnection();
                        openConnection.connect();
                        universalStyle.runOnUiThread(new q(this, openConnection.getContentLength(), 2));
                        BufferedInputStream bufferedInputStream = new BufferedInputStream(openConnection.getInputStream());
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        byte[] bArr = new byte[1024];
                        long j2 = 0;
                        while (true) {
                            long j3 = j2;
                            int read = bufferedInputStream.read(bArr);
                            String str5 = "ۙ۟ۜۙۨۨۘۘۖۘۚۢۘ۠ۨۧۡ۟ۨۘۜۛۨۖ۠ۖۘۧۛ";
                            while (true) {
                                switch (str5.hashCode() ^ -147121704) {
                                    case -872412865:
                                        if (read == -1) {
                                            str5 = "ۙ۬ۥۧ۠ۛ۠۬ۖۘۖ۟ۛۦ۫ۦۜۢ۬۟ۖۗۙۖۘۚۢۗ";
                                            break;
                                        } else {
                                            str5 = "۬ۥۥۢۥۘۖۗۛۙۡۙۡۦۧ";
                                            break;
                                        }
                                    case -469685821:
                                        String str6 = "ۘۨۦۘۢۤۦۛۘۦۘۚۢۦۖ۟ۧۗۜۧۘۙۘۜۘۧۘۡۘ";
                                        while (true) {
                                            switch (str6.hashCode() ^ -1839785288) {
                                                case 43047089:
                                                    universalStyle.runOnUiThread(new r(this, 1));
                                                    break;
                                                case 689089906:
                                                    if (!isCancelled()) {
                                                        str6 = "۠ۗۡ۟ۗۛۜۧۙۛۤ۬ۘ۫ۧۤۨۜ۟ۤۜۖ۬ۖۘ";
                                                        break;
                                                    } else {
                                                        str6 = "ۙۛۨۘ۠۬ۨ۫ۨۙۚۗۜ۟ۗۚۚۙۖۘۙۤۨۘۖۥۜۘۡۡۘۘ";
                                                        break;
                                                    }
                                                case 1184812389:
                                                    j2 = ((long) read) + j3;
                                                    fileOutputStream.write(bArr, 0, read);
                                                    publishProgress(new Integer[]{Integer.valueOf((int) j2)});
                                                case 2083279300:
                                                    str6 = "ۥۡۤ۬ۥۗۚۗ۫ۜۤۗۧۗۗ۬ۢۙۗۥۘ۫ۢۥۘ۠ۚۤ";
                                                    break;
                                            }
                                        }
                                        break;
                                    case 1041736922:
                                        str5 = "ۙۥۦۘۤۚۢ۬ۢۥ۬ۨۨۛ۫";
                                        break;
                                    case 2012209763:
                                        break;
                                }
                            }
                        }
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        bufferedInputStream.close();
                        return;
                    case -717511967:
                        return;
                    case -191833883:
                        if (!universalStyle.isFinishing()) {
                            str4 = "۟ۥۧۦۥۥۛۦۡ۬ۚۖۖۡۡ۟ۥۢۙۘ";
                            break;
                        } else {
                            str4 = "ۘۤۧۧۨۛۤۘۨۢ۫۟ۜ۬ۘ";
                            break;
                        }
                    case 957984929:
                        str4 = "ۨ۟۫ۧۙۥۨۨ۟ۜ۠ۧۘۛ۟۫ۧۧ۫ۘۨۢ۠";
                        break;
                }
            }
        } catch (Exception e2) {
        }
    }

    public final Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        File file = new File(yo.emojifolder + File.separator + this.f1844d);
        this.f1842b = file;
        String str = "ۖۜۡۢۡۦۜۘۜۘۦۧۜۘۙ۟ۨۘۛۧۦۘۨۚۜۧۙۧ";
        while (true) {
            switch (str.hashCode() ^ -186268029) {
                case -723509139:
                    break;
                case -708415197:
                    if (file.exists()) {
                        str = "۟ۚۜۜۙۗۙۙ۬۠ۘۘۜۘۗ";
                        break;
                    } else {
                        str = "ۥ۟ۘۛۛ۠ۗۚۧۦۧۤۦ۠ۨۘۢ۟ۚۨ۠ۚۛۢۡۚ۫ۢ";
                        continue;
                    }
                case 646618276:
                    str = "۠۟ۛۜۡۜۖۤۤۧۡۡ۟۫ۗ";
                    continue;
                case 1955559228:
                    this.f1842b.mkdirs();
                    break;
            }
        }
        File file2 = this.f1842b;
        String str2 = this.f1845e;
        this.f1843c = new File(file2, str2);
        try {
            a(this.f1841a, str2);
            return null;
        } catch (Exception e2) {
            return null;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onPostExecute(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Void r7 = (java.lang.Void) r7
            r1 = 1601478397(0x5f749efd, float:1.7626804E19)
            java.lang.String r0 = "۬ۚۜۘ۬ۗۜۨ۫ۙۜ۫ۖۘۨ۟ۘۦۗۜۘ"
        L_0x0007:
            int r2 = r0.hashCode()
            r2 = r2 ^ r1
            switch(r2) {
                case -1046275181: goto L_0x0016;
                case -767182901: goto L_0x002f;
                case 589575895: goto L_0x0021;
                case 766101915: goto L_0x0010;
                default: goto L_0x000f;
            }
        L_0x000f:
            goto L_0x0007
        L_0x0010:
            java.lang.String r0 = "۠ۖ۠۟ۚۜۘ۠ۤۖۘۜۗ۠۫ۦۨۦۤۧ۠ۚۥ۫۠ۗۛ"
            goto L_0x0007
        L_0x0013:
            java.lang.String r0 = "ۢۥ۬ۨۚۘۦۚۘۘۖۢۢۤۤۜۜۥۦ۟ۥۡۘۗۤۘۘۜۡ۫"
            goto L_0x0007
        L_0x0016:
            java.io.File r0 = r6.f1843c
            boolean r0 = r0.exists()
            if (r0 == 0) goto L_0x0013
            java.lang.String r0 = "ۗۗۘۚۨۢۛۥۘۘ۫ۚ۟ۘۢۚ"
            goto L_0x0007
        L_0x0021:
            r1 = 1803447469(0x6b7e6cad, float:3.0758037E26)
            java.lang.String r0 = "۠ۛۚۚۗۨۢۛۙۢۘۧۘۡۙۛ"
        L_0x0026:
            int r2 = r0.hashCode()
            r2 = r2 ^ r1
            switch(r2) {
                case -1721182983: goto L_0x0065;
                case -1471510427: goto L_0x0053;
                case -1264313294: goto L_0x002f;
                case -578397222: goto L_0x0062;
                default: goto L_0x002e;
            }
        L_0x002e:
            goto L_0x0026
        L_0x002f:
            r0 = 0
        L_0x0030:
            com.obwhatsapp.youbasha.ui.YoSettings.UniversalStyle r2 = r6.f1847g
            r3 = -1708106621(0xffffffff9a305c83, float:-3.6470677E-23)
            java.lang.String r1 = "ۢ۟ۧ۫ۛۢۦۡۦۘ۟ۨۨۡۙ۫ۥ۫ۡۧۢ۟ۨۙۤۧۦۤ"
        L_0x0037:
            int r4 = r1.hashCode()
            r4 = r4 ^ r3
            switch(r4) {
                case -2092848056: goto L_0x0040;
                case -902356828: goto L_0x0072;
                case 588166592: goto L_0x006f;
                case 1219646983: goto L_0x006a;
                default: goto L_0x003f;
            }
        L_0x003f:
            goto L_0x0037
        L_0x0040:
            java.lang.String r0 = "download_failed"
            java.lang.String r0 = com.obwhatsapp.yo.yo.getString((java.lang.String) r0)
        L_0x0046:
            com.obwhatsapp.yo.p r1 = new com.obwhatsapp.yo.p
            r3 = 7
            r1.<init>(r6, r0, r3)
            r2.runOnUiThread(r1)
            return
        L_0x0050:
            java.lang.String r0 = "ۛۖ۫ۖۖۚ۫ۡۜ۬ۦۧۡۜۜۛۘۘۚۛ۫ۡۛۘ"
            goto L_0x0026
        L_0x0053:
            java.io.File r0 = r6.f1843c
            long r2 = r0.length()
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0050
            java.lang.String r0 = "ۗۖۡۘۤۦۘۘۢۦۘۤۥۨۘۘۤۗۥۨۦۘۘۚۖۘ"
            goto L_0x0026
        L_0x0062:
            java.lang.String r0 = "ۤۘۥۘ۠ۧۦۖۛۥۖۛ۬ۘۘۧۙ۟ۢ"
            goto L_0x0026
        L_0x0065:
            r0 = 1
            goto L_0x0030
        L_0x0067:
            java.lang.String r1 = "ۗۘۨۖۧ۫ۡ۬۬ۘۧۢۘۡۖۘۘۖۦۖ۠ۦ۫ۚۥۘ۫ۥ۫"
            goto L_0x0037
        L_0x006a:
            if (r0 == 0) goto L_0x0067
            java.lang.String r1 = "ۗۜۥ۟ۥۚۢۢۦ۟ۢۛ۟۫ۜۘۨۜۥ"
            goto L_0x0037
        L_0x006f:
            java.lang.String r1 = "ۦۨۛۡۙۘۘ۫ۜۖۘۘ۫۬ۛ۠ۖۥۙۡۘ"
            goto L_0x0037
        L_0x0072:
            java.io.File r0 = r6.f1843c
            java.lang.String r0 = r0.getAbsolutePath()
            java.io.File r1 = r6.f1842b
            java.lang.String r1 = r1.getAbsolutePath()
            com.obwhatsapp.youbasha.task.ZipManager.unzip(r0, r1)
            java.io.File r1 = new java.io.File     // Catch:{ Exception -> 0x00bb }
            java.io.File r0 = r6.f1842b     // Catch:{ Exception -> 0x00bb }
            java.lang.String r3 = ".nomedia"
            r1.<init>(r0, r3)     // Catch:{ Exception -> 0x00bb }
            r3 = 426276715(0x1968776b, float:1.2018235E-23)
            java.lang.String r0 = "ۘۜ۬ۗ۟ۨۥۦۧۚۜ۠۫۫ۨ"
        L_0x008f:
            int r4 = r0.hashCode()     // Catch:{ Exception -> 0x00bb }
            r4 = r4 ^ r3
            switch(r4) {
                case -1278898800: goto L_0x0098;
                case -1256842282: goto L_0x009b;
                case -475918437: goto L_0x00b8;
                case 347248979: goto L_0x00af;
                default: goto L_0x0097;
            }     // Catch:{ Exception -> 0x00bb }
        L_0x0097:
            goto L_0x008f
        L_0x0098:
            r1.createNewFile()     // Catch:{ Exception -> 0x00bb }
        L_0x009b:
            java.lang.String r0 = "sticker_store_downloaded_content_description"
            java.lang.String r0 = com.obwhatsapp.yo.yo.getString((java.lang.String) r0)
            com.obwhatsapp.yo.d r1 = new com.obwhatsapp.yo.d
            r3 = 11
            r1.<init>(r2, r3)
            r2.runOnUiThread(r1)
            goto L_0x0046
        L_0x00ac:
            java.lang.String r0 = "ۚۘۖۘ۬ۚۥۘۗۛۨۛۦۤۤۦ۫ۥ۠ۢۚۖۜۘۗۧۙ"
            goto L_0x008f
        L_0x00af:
            boolean r0 = r1.exists()     // Catch:{ Exception -> 0x00bb }
            if (r0 != 0) goto L_0x00ac
            java.lang.String r0 = "ۡۗۡۘۧۨۘۥۖۜۘۢ۫ۢۗۜۢۤ۠ۘۘۚۚۨۚۛۢ"
            goto L_0x008f
        L_0x00b8:
            java.lang.String r0 = "ۚۚ۟ۗ۬۟ۦۜ۬۫ۙۢۡ۟ۜۦۡۘۗۘۚۜۛ۫"
            goto L_0x008f
        L_0x00bb:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x009b
        */
        throw new UnsupportedOperationException("Method not decompiled: m.s.onPostExecute(java.lang.Object):void");
    }

    public final void onProgressUpdate(Object[] objArr) {
        String str = "ۗۡۜۘۖۚۡۘۥۖۜۘۥۜ۫۫ۛۚۘۘۜ";
        p pVar = null;
        Integer[] numArr = null;
        while (true) {
            switch ((str.hashCode() ^ 966) ^ -365929081) {
                case -1840251463:
                    str = "ۥۢۢ۬ۥۛۜۖۖۘ۟ۤۦۗ۬ۘۥۧۛ۫۟ۥۘ۠ۢ۬ۖۥۤ";
                    break;
                case -1291179628:
                    return;
                case -806862286:
                    pVar = new p(this, numArr, 6);
                    str = "ۙۧ۫۠ۧۜۘۨۤۦۢۛۡۡۘۨ";
                    break;
                case -691303854:
                    this.f1847g.runOnUiThread(pVar);
                    str = "ۥۛ۫ۖۚۘۘ۬ۚۚۢ۬ۚۦ۫ۗ";
                    break;
                case 702741085:
                    str = "ۘۧۘۘۛۨۥ۫ۧۚۡۜۗۗ۬۠ۢۥۙۤۥ";
                    numArr = (Integer[]) objArr;
                    break;
                case 1833288017:
                    str = "۫ۥۗۦ۟ۡۘۜۨ۬ۜۢۗ۬ۤۦۘۡۥ۟ۛۜۧۗ۟ۗ";
                    break;
                case 1862788882:
                    super.onProgressUpdate(numArr);
                    str = "ۦ۠ۛۗ۬۫ۧۢ۠ۙۜ۫ۢ۠۫ۥ۫ۛ۟ۤ۬ۡۙۜ۬ۢۦ";
                    break;
            }
        }
    }
}
