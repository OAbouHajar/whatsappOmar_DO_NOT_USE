package X;

import android.net.Uri;
import android.text.TextUtils;
import com.facebook.redex.IDxComparatorShape19S0000000_2_I0;
import com.whatsapp.stickers.WebpUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: X.1M8  reason: invalid class name */
public class AnonymousClass1M8 {
    public static final Comparator A02 = new IDxComparatorShape19S0000000_2_I0(41);
    public final C16180sb A00;
    public final C37821pn A01;

    public AnonymousClass1M8(C16180sb r3, C16980tz r4) {
        C37821pn r0 = new C37821pn(r4.A00);
        this.A00 = r3;
        this.A01 = r0;
    }

    public final File A00(String str, String str2) {
        File file = new File(this.A00.A03.A00.getCacheDir(), "stickers_cache");
        C16180sb.A04(file, false);
        StringBuilder sb = new StringBuilder();
        sb.append(Uri.encode(str));
        sb.append(File.separatorChar);
        sb.append(Uri.encode(str2));
        return new File(file, sb.toString());
    }

    public final synchronized List A01(String str, String str2, String str3) {
        List list;
        AnonymousClass1XO A002;
        File A003 = A00(str, str2);
        if (A003.exists()) {
            File[] listFiles = A003.listFiles();
            Arrays.sort(listFiles, A02);
            int length = listFiles.length;
            ArrayList arrayList = new ArrayList(length);
            String A012 = C27031Qe.A01(str, str2);
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    arrayList.size();
                    list = Collections.unmodifiableList(arrayList);
                    break;
                }
                File file = listFiles[i2];
                String name = file.getName();
                String decode = Uri.decode(AnonymousClass1XI.A09(name.substring(3)));
                C34151jm r1 = new C34151jm();
                r1.A0D = decode;
                r1.A09 = new File(A003, name).getAbsolutePath();
                r1.A01 = 2;
                r1.A0C = "image/webp";
                r1.A03 = 512;
                r1.A02 = 512;
                r1.A0A = WebpUtils.A00(file);
                r1.A0F = A012;
                byte[] fetchWebpMetadata = WebpUtils.fetchWebpMetadata(file.getAbsolutePath());
                if (!(fetchWebpMetadata == null || (A002 = AnonymousClass1XO.A00(fetchWebpMetadata)) == null)) {
                    r1.A04 = A002;
                }
                boolean z2 = false;
                if (str3 != null) {
                    z2 = true;
                }
                if (z2 && TextUtils.equals(str3, decode)) {
                    arrayList.size();
                    list = Collections.singletonList(r1);
                    break;
                }
                arrayList.add(r1);
                i2++;
            }
        } else {
            list = Collections.emptyList();
        }
        return list;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00a0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void A02(java.lang.String r9, java.lang.String r10, java.util.List r11) {
        /*
            r8 = this;
            monitor-enter(r8)
            int r1 = r11.size()     // Catch:{ all -> 0x00e2 }
            r0 = 100
            if (r1 >= r0) goto L_0x00c7
            java.io.File r3 = r8.A00(r9, r10)     // Catch:{ all -> 0x00e2 }
            X.AnonymousClass1XI.A0D(r3)     // Catch:{ all -> 0x00e2 }
            boolean r0 = r3.exists()     // Catch:{ all -> 0x00e2 }
            if (r0 != 0) goto L_0x0021
            boolean r0 = r3.mkdirs()     // Catch:{ all -> 0x00e2 }
            if (r0 != 0) goto L_0x0021
            r3.getAbsolutePath()     // Catch:{ all -> 0x00e2 }
            goto L_0x00c5
        L_0x0021:
            r2 = 0
        L_0x0022:
            int r0 = r11.size()     // Catch:{ all -> 0x00e2 }
            if (r2 >= r0) goto L_0x00c5
            java.lang.Object r6 = r11.get(r2)     // Catch:{ all -> 0x00e2 }
            X.1jm r6 = (X.C34151jm) r6     // Catch:{ all -> 0x00e2 }
            java.lang.String r7 = r6.A0D     // Catch:{ all -> 0x00e2 }
            r0 = 100
            if (r2 >= r0) goto L_0x00b1
            java.lang.String r5 = ".webp"
            java.lang.String r4 = "_"
            r0 = 10
            if (r2 >= r0) goto L_0x00ab
            java.lang.String r0 = "0"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e2 }
            r1.<init>(r0)     // Catch:{ all -> 0x00e2 }
        L_0x0043:
            r1.append(r2)     // Catch:{ all -> 0x00e2 }
            r1.append(r4)     // Catch:{ all -> 0x00e2 }
            java.lang.String r0 = android.net.Uri.encode(r7)     // Catch:{ all -> 0x00e2 }
            r1.append(r0)     // Catch:{ all -> 0x00e2 }
            r1.append(r5)     // Catch:{ all -> 0x00e2 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00e2 }
            java.io.File r5 = new java.io.File     // Catch:{ all -> 0x00e2 }
            r5.<init>(r3, r0)     // Catch:{ all -> 0x00e2 }
            X.1pn r4 = r8.A01     // Catch:{ IOException -> 0x00a1 }
            java.lang.String r0 = r6.A09     // Catch:{ IOException -> 0x00a1 }
            android.net.Uri r1 = android.net.Uri.parse(r0)     // Catch:{ IOException -> 0x00a1 }
            android.content.Context r0 = r4.A00     // Catch:{ FileNotFoundException -> 0x008a }
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch:{ FileNotFoundException -> 0x008a }
            java.io.InputStream r1 = r0.openInputStream(r1)     // Catch:{ FileNotFoundException -> 0x008a }
            if (r1 == 0) goto L_0x0091
            boolean r0 = X.AnonymousClass1XI.A0Q(r5, r1)     // Catch:{ all -> 0x009a }
            if (r0 == 0) goto L_0x0091
            X.1XO r0 = r6.A04     // Catch:{ all -> 0x009a }
            if (r0 == 0) goto L_0x0083
            X.1XO r0 = r6.A04     // Catch:{ all -> 0x009a }
            byte[] r0 = r0.A01()     // Catch:{ all -> 0x009a }
            com.whatsapp.stickers.WebpUtils.A01(r5, r0)     // Catch:{ all -> 0x009a }
        L_0x0083:
            r5.getAbsolutePath()     // Catch:{ all -> 0x009a }
            r1.close()     // Catch:{ IOException -> 0x00a1 }
            goto L_0x00a7
        L_0x008a:
            r1 = move-exception
            java.lang.String r0 = "error openUri"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ IOException -> 0x00a1 }
            r1 = 0
        L_0x0091:
            X.AnonymousClass1XI.A0D(r3)     // Catch:{ all -> 0x009a }
            if (r1 == 0) goto L_0x00c5
            r1.close()     // Catch:{ IOException -> 0x00a1 }
            goto L_0x00c5
        L_0x009a:
            r0 = move-exception
            if (r1 == 0) goto L_0x00a0
            r1.close()     // Catch:{ all -> 0x00a0 }
        L_0x00a0:
            throw r0     // Catch:{ IOException -> 0x00a1 }
        L_0x00a1:
            r1 = move-exception
            java.lang.String r0 = "error closing the input stream."
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x00e2 }
        L_0x00a7:
            int r2 = r2 + 1
            goto L_0x0022
        L_0x00ab:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e2 }
            r1.<init>()     // Catch:{ all -> 0x00e2 }
            goto L_0x0043
        L_0x00b1:
            java.lang.String r1 = "ThirdPartyStickerStorage/createStickerFileName/sticker index is more more than 100. Index: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e2 }
            r0.<init>(r1)     // Catch:{ all -> 0x00e2 }
            r0.append(r2)     // Catch:{ all -> 0x00e2 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00e2 }
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00e2 }
            r1.<init>(r0)     // Catch:{ all -> 0x00e2 }
            goto L_0x00e1
        L_0x00c5:
            monitor-exit(r8)
            return
        L_0x00c7:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e2 }
            r1.<init>()     // Catch:{ all -> 0x00e2 }
            java.lang.String r0 = "ThirdPartyStickerStorage/addStickersInPack/total amount of stickers in pack is more than 100, size: "
            r1.append(r0)     // Catch:{ all -> 0x00e2 }
            int r0 = r11.size()     // Catch:{ all -> 0x00e2 }
            r1.append(r0)     // Catch:{ all -> 0x00e2 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00e2 }
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00e2 }
            r1.<init>(r0)     // Catch:{ all -> 0x00e2 }
        L_0x00e1:
            throw r1     // Catch:{ all -> 0x00e2 }
        L_0x00e2:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1M8.A02(java.lang.String, java.lang.String, java.util.List):void");
    }
}
