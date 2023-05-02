package X;

import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import com.whatsapp.util.Log;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;
import org.json.JSONException;

/* renamed from: X.3AX  reason: invalid class name */
public final class AnonymousClass3AX {
    public static final Pair A0F = Pair.create((Object) null, (Object) null);
    public static final Pattern A0G = Pattern.compile("bytes=0-(\\d*)");
    public static final boolean A0H;
    public final int A00;
    public final C16300so A01;
    public final C16200sd A02;
    public final C108475Od A03;
    public final AnonymousClass12T A04;
    public final AnonymousClass2GJ A05;
    public final AnonymousClass3BK A06;
    public final AnonymousClass2GM A07;
    public final C615839m A08;
    public final C18260wP A09;
    public final C16190sc A0A;
    public final C16260sj A0B;
    public final C14710pd A0C;
    public final C16320sq A0D;
    public final String A0E;

    static {
        boolean z2 = false;
        if (Build.VERSION.SDK_INT <= 20) {
            z2 = true;
        }
        A0H = z2;
    }

    public AnonymousClass3AX(C16300so r2, C16200sd r3, C108475Od r4, AnonymousClass12T r5, AnonymousClass2GJ r6, AnonymousClass3BK r7, AnonymousClass2GM r8, C615839m r9, C18260wP r10, C16190sc r11, C16260sj r12, C14710pd r13, C16320sq r14, int i2) {
        this.A0C = r13;
        this.A01 = r2;
        this.A0A = r11;
        this.A02 = r3;
        this.A04 = r5;
        this.A0B = r12;
        this.A06 = r7;
        this.A08 = r9;
        this.A00 = i2;
        this.A03 = r4;
        this.A05 = r6;
        this.A07 = r8;
        this.A0E = r8.A0F;
        this.A09 = r10;
        this.A0D = r14;
    }

    public static void A00(AnonymousClass3AX r4, AtomicLong atomicLong, long j2) {
        r4.A03.APP((atomicLong.get() + j2) * -1);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:334|335|336|337|338|339) */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x05ce, code lost:
        if (r7 == null) goto L_0x05d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:340:0x0809, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:341:0x080b, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:?, code lost:
        com.whatsapp.util.Log.e("GoogleBackupApi/upload-file", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:345:0x0811, code lost:
        if (r7 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:349:0x081b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:351:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:410:?, code lost:
        return null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:206:0x05e4 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:306:0x07cd */
    /* JADX WARNING: Missing exception handler attribute for start block: B:338:0x0808 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:395:0x08e0 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:56:0x0202 */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x056e A[Catch:{ all -> 0x058e }] */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x058d A[SYNTHETIC, Splitter:B:165:0x058d] */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x05b3  */
    /* JADX WARNING: Removed duplicated region for block: B:341:0x080b A[ExcHandler: IOException (r1v17 'e' java.io.IOException A[CUSTOM_DECLARE]), PHI: r7 
      PHI: (r7v10 X.4x3) = (r7v6 X.4x3), (r7v6 X.4x3), (r7v11 X.4x3), (r7v11 X.4x3), (r7v6 X.4x3), (r7v6 X.4x3), (r7v15 X.4x3), (r7v15 X.4x3), (r7v15 X.4x3), (r7v15 X.4x3), (r7v15 X.4x3), (r7v15 X.4x3) binds: [B:212:0x05f9, B:213:?, B:338:0x0808, B:339:?, B:331:0x07ff, B:324:0x07f5, B:315:0x07e3, B:316:?, B:291:0x07ae, B:292:?, B:234:0x068b, B:235:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:212:0x05f9] */
    /* JADX WARNING: Removed duplicated region for block: B:349:0x081b A[ExcHandler: FileNotFoundException (r0v71 'e' java.io.FileNotFoundException A[CUSTOM_DECLARE]), PHI: r7 
      PHI: (r7v8 X.4x3) = (r7v6 X.4x3), (r7v6 X.4x3), (r7v11 X.4x3), (r7v11 X.4x3), (r7v6 X.4x3), (r7v6 X.4x3), (r7v15 X.4x3), (r7v15 X.4x3), (r7v15 X.4x3), (r7v15 X.4x3), (r7v15 X.4x3), (r7v15 X.4x3) binds: [B:212:0x05f9, B:213:?, B:338:0x0808, B:339:?, B:331:0x07ff, B:324:0x07f5, B:315:0x07e3, B:316:?, B:291:0x07ae, B:292:?, B:234:0x068b, B:235:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:212:0x05f9] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:146:0x0547=Splitter:B:146:0x0547, B:168:0x058f=Splitter:B:168:0x058f} */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:206:0x05e4=Splitter:B:206:0x05e4, B:186:0x05c5=Splitter:B:186:0x05c5, B:200:0x05dc=Splitter:B:200:0x05dc} */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:285:0x0798=Splitter:B:285:0x0798, B:306:0x07cd=Splitter:B:306:0x07cd} */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:289:0x07a5=Splitter:B:289:0x07a5, B:313:0x07da=Splitter:B:313:0x07da} */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:324:0x07f5=Splitter:B:324:0x07f5, B:338:0x0808=Splitter:B:338:0x0808} */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:395:0x08e0=Splitter:B:395:0x08e0, B:97:0x03d1=Splitter:B:97:0x03d1, B:375:0x0877=Splitter:B:375:0x0877} */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:56:0x0202=Splitter:B:56:0x0202, B:29:0x0115=Splitter:B:29:0x0115, B:51:0x01f9=Splitter:B:51:0x01f9} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C61743Ad A01() {
        /*
            r35 = this;
            r2 = r35
            X.39m r0 = r2.A08
            r34 = r0
            java.io.File r0 = r34.A01()
            boolean r0 = r0.exists()
            if (r0 == 0) goto L_0x08f4
            java.lang.String r4 = " are not identical to ones on the disk, so, we will have to re-upload them"
            X.12T r0 = r2.A04
            r33 = r0
            java.lang.String r0 = r2.A0E
            r32 = r0
            r0 = r34
            java.lang.String r9 = r0.A06
            android.content.SharedPreferences r3 = r33.A00()
            java.lang.String r16 = "-"
            java.lang.String r15 = "gbackup-ResumableUrl-"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r15)
            r0 = r32
            r1.append(r0)
            r0 = r16
            r1.append(r0)
            java.lang.String r0 = X.AnonymousClass000.A0h(r9, r1)
            java.lang.String r8 = X.C13700nu.A0E(r3, r0)
            if (r8 != 0) goto L_0x0049
            android.util.Pair r0 = A0F
        L_0x0040:
            r7 = 0
            if (r0 != 0) goto L_0x0211
            java.lang.String r0 = "GoogleBackupApi/upload-file/error-while-fetching-previous-upload-session"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return r7
        L_0x0049:
            X.2GJ r0 = r2.A05
            boolean r0 = r0.A05()
            r20 = 0
            if (r0 == 0) goto L_0x020d
            long r0 = r34.A00()     // Catch:{ IOException -> 0x0203 }
            boolean r6 = A0H     // Catch:{ IOException -> 0x0203 }
            r5 = 0
            r3 = 1
            java.lang.String r12 = "bytes */%d"
            java.lang.String r11 = "Content-Range"
            if (r6 == 0) goto L_0x008b
            org.apache.http.client.methods.HttpPut r6 = new org.apache.http.client.methods.HttpPut     // Catch:{ IOException -> 0x0203 }
            r6.<init>(r8)     // Catch:{ IOException -> 0x0203 }
            java.util.Locale r7 = java.util.Locale.ENGLISH     // Catch:{ IOException -> 0x0203 }
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ IOException -> 0x0203 }
            X.C13690nt.A1Q(r3, r5, r0)     // Catch:{ IOException -> 0x0203 }
            java.lang.String r0 = java.lang.String.format(r7, r12, r3)     // Catch:{ IOException -> 0x0203 }
            r6.setHeader(r11, r0)     // Catch:{ IOException -> 0x0203 }
            r6.getRequestLine()     // Catch:{ IOException -> 0x0203 }
            X.2GM r7 = r2.A07     // Catch:{ IOException -> 0x0203 }
            org.apache.http.HttpResponse r1 = X.AnonymousClass2GM.A00(r7, r6)     // Catch:{ IOException -> 0x0203 }
            java.net.URI r0 = r6.getURI()     // Catch:{ IOException -> 0x0203 }
            java.net.URL r0 = r0.toURL()     // Catch:{ IOException -> 0x0203 }
            X.4vA r3 = new X.4vA     // Catch:{ IOException -> 0x0203 }
            r3.<init>(r0, r1)     // Catch:{ IOException -> 0x0203 }
            goto L_0x00b7
        L_0x008b:
            X.2GM r7 = r2.A07     // Catch:{ IOException -> 0x0203 }
            java.lang.String r18 = "PUT"
            r22 = 0
            r21 = r20
            r17 = r7
            r19 = r8
            javax.net.ssl.HttpsURLConnection r10 = r17.A08(r18, r19, r20, r21, r22)     // Catch:{ IOException -> 0x0203 }
            java.util.Locale r6 = java.util.Locale.ENGLISH     // Catch:{ IOException -> 0x0203 }
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ IOException -> 0x0203 }
            X.C13690nt.A1Q(r3, r5, r0)     // Catch:{ IOException -> 0x0203 }
            java.lang.String r0 = java.lang.String.format(r6, r12, r3)     // Catch:{ IOException -> 0x0203 }
            r10.addRequestProperty(r11, r0)     // Catch:{ IOException -> 0x0203 }
            r10.connect()     // Catch:{ IOException -> 0x0203 }
            r10.getURL()     // Catch:{ IOException -> 0x0203 }
            r10.getRequestMethod()     // Catch:{ IOException -> 0x0203 }
            X.3uE r3 = new X.3uE     // Catch:{ IOException -> 0x0203 }
            r3.<init>(r10)     // Catch:{ IOException -> 0x0203 }
        L_0x00b7:
            int r6 = r3.A6O()     // Catch:{ all -> 0x01fe }
            r0 = 308(0x134, float:4.32E-43)
            java.lang.String r10 = " "
            if (r6 == r0) goto L_0x011a
            r0 = 401(0x191, float:5.62E-43)
            if (r6 == r0) goto L_0x0112
            r0 = 403(0x193, float:5.65E-43)
            if (r6 == r0) goto L_0x00f1
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()     // Catch:{ all -> 0x01fe }
            java.lang.String r0 = "GoogleBackupApi/upload-file/unexpected-response-code "
            r1.append(r0)     // Catch:{ all -> 0x01fe }
            r1.append(r6)     // Catch:{ all -> 0x01fe }
            r1.append(r10)     // Catch:{ all -> 0x01fe }
            java.lang.String r0 = r3.AFa()     // Catch:{ all -> 0x01fe }
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)     // Catch:{ all -> 0x01fe }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x01fe }
            r3.A6O()     // Catch:{ all -> 0x01fe }
            r3.AFa()     // Catch:{ all -> 0x01fe }
            r1 = r33
            r0 = r32
            r1.A02(r0, r9)     // Catch:{ all -> 0x01fe }
            goto L_0x0115
        L_0x00f1:
            java.lang.String r4 = r3.AC0()     // Catch:{ all -> 0x01fe }
            r1 = r33
            r0 = r32
            r1.A02(r0, r9)     // Catch:{ all -> 0x01fe }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()     // Catch:{ all -> 0x01fe }
            java.lang.String r0 = "GoogleBackupApi/api disabled upload-file "
            r1.append(r0)     // Catch:{ all -> 0x01fe }
            java.lang.String r0 = X.AnonymousClass000.A0h(r4, r1)     // Catch:{ all -> 0x01fe }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x01fe }
            X.3iQ r0 = new X.3iQ     // Catch:{ all -> 0x01fe }
            r0.<init>()     // Catch:{ all -> 0x01fe }
            throw r0     // Catch:{ all -> 0x01fe }
        L_0x0112:
            r7.A0A()     // Catch:{ all -> 0x01fe }
        L_0x0115:
            r3.close()     // Catch:{ IOException -> 0x0203 }
            goto L_0x020d
        L_0x011a:
            r3.A6O()     // Catch:{ all -> 0x01fe }
            r3.AFa()     // Catch:{ all -> 0x01fe }
            java.lang.String r0 = "Range"
            java.util.List r6 = r3.AHl(r0)     // Catch:{ all -> 0x01fe }
            r7 = 1
            if (r6 == 0) goto L_0x01f0
            int r0 = r6.size()     // Catch:{ all -> 0x01fe }
            if (r0 != r7) goto L_0x01d3
            java.util.regex.Pattern r1 = A0G     // Catch:{ all -> 0x01fe }
            java.lang.Object r0 = r6.get(r5)     // Catch:{ all -> 0x01fe }
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0     // Catch:{ all -> 0x01fe }
            java.util.regex.Matcher r1 = r1.matcher(r0)     // Catch:{ all -> 0x01fe }
            boolean r0 = r1.find()     // Catch:{ all -> 0x01fe }
            if (r0 == 0) goto L_0x01bc
            java.lang.String r0 = r1.group(r7)     // Catch:{ all -> 0x01fe }
            long r0 = java.lang.Long.parseLong(r0)     // Catch:{ all -> 0x01fe }
            r5 = 1
            long r0 = r0 + r5
            java.lang.String r5 = "X-Range-MD5"
            java.lang.String r10 = r3.AHk(r5)     // Catch:{ all -> 0x01fe }
            X.0sc r6 = r2.A0A     // Catch:{ all -> 0x01fe }
            X.0sj r5 = r2.A0B     // Catch:{ all -> 0x01fe }
            java.io.File r11 = r34.A01()     // Catch:{ all -> 0x01fe }
            java.lang.String r7 = X.AnonymousClass2GK.A09(r6, r5, r11, r0)     // Catch:{ all -> 0x01fe }
            java.lang.String r6 = "gdrive-api/save-file/check-md5 "
            if (r10 != 0) goto L_0x018c
            java.lang.StringBuilder r6 = X.AnonymousClass000.A0q(r6)     // Catch:{ all -> 0x01fe }
            java.lang.String r5 = r11.getAbsolutePath()     // Catch:{ all -> 0x01fe }
            r6.append(r5)     // Catch:{ all -> 0x01fe }
            java.lang.String r5 = " downloaded but its remote md5 is null."
        L_0x016f:
            java.lang.String r5 = X.AnonymousClass000.A0h(r5, r6)     // Catch:{ all -> 0x01fe }
            com.whatsapp.util.Log.e((java.lang.String) r5)     // Catch:{ all -> 0x01fe }
            java.lang.StringBuilder r6 = X.AnonymousClass000.A0o()     // Catch:{ all -> 0x01fe }
            java.lang.String r5 = "GoogleBackupApi/upload-file for a file bytes already uploaded: "
            r6.append(r5)     // Catch:{ all -> 0x01fe }
            r6.append(r0)     // Catch:{ all -> 0x01fe }
            java.lang.String r0 = X.AnonymousClass000.A0h(r4, r6)     // Catch:{ all -> 0x01fe }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x01fe }
            android.util.Pair r0 = A0F     // Catch:{ all -> 0x01fe }
            goto L_0x01f9
        L_0x018c:
            boolean r5 = r10.equals(r7)     // Catch:{ all -> 0x01fe }
            if (r5 != 0) goto L_0x01b0
            java.lang.StringBuilder r6 = X.AnonymousClass000.A0q(r6)     // Catch:{ all -> 0x01fe }
            java.lang.String r5 = r11.getAbsolutePath()     // Catch:{ all -> 0x01fe }
            r6.append(r5)     // Catch:{ all -> 0x01fe }
            java.lang.String r5 = " downloaded but its MD5("
            r6.append(r5)     // Catch:{ all -> 0x01fe }
            r6.append(r7)     // Catch:{ all -> 0x01fe }
            java.lang.String r5 = ") does not match remote md5("
            r6.append(r5)     // Catch:{ all -> 0x01fe }
            r6.append(r10)     // Catch:{ all -> 0x01fe }
            java.lang.String r5 = ")."
            goto L_0x016f
        L_0x01b0:
            r34.A00()     // Catch:{ all -> 0x01fe }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x01fe }
            android.util.Pair r0 = android.util.Pair.create(r8, r0)     // Catch:{ all -> 0x01fe }
            goto L_0x01f9
        L_0x01bc:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()     // Catch:{ all -> 0x01fe }
            java.lang.String r0 = "GoogleBackupApi/upload-file cannot find uploaded length in "
            r1.append(r0)     // Catch:{ all -> 0x01fe }
            java.lang.String r0 = X.AnonymousClass000.A0n(r6, r5)     // Catch:{ all -> 0x01fe }
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)     // Catch:{ all -> 0x01fe }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x01fe }
            android.util.Pair r0 = A0F     // Catch:{ all -> 0x01fe }
            goto L_0x01f9
        L_0x01d3:
            int r0 = r6.size()     // Catch:{ all -> 0x01fe }
            if (r0 <= r7) goto L_0x01f0
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()     // Catch:{ all -> 0x01fe }
            java.lang.String r0 = "GoogleBackupApi/upload-file error: multiple range headers, ignoring: "
            r1.append(r0)     // Catch:{ all -> 0x01fe }
            java.lang.String r0 = android.text.TextUtils.join(r10, r6)     // Catch:{ all -> 0x01fe }
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)     // Catch:{ all -> 0x01fe }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x01fe }
            android.util.Pair r0 = A0F     // Catch:{ all -> 0x01fe }
            goto L_0x01f9
        L_0x01f0:
            r1 = r33
            r0 = r32
            r1.A02(r0, r9)     // Catch:{ all -> 0x01fe }
            android.util.Pair r0 = A0F     // Catch:{ all -> 0x01fe }
        L_0x01f9:
            r3.close()     // Catch:{ IOException -> 0x0203 }
            goto L_0x0040
        L_0x01fe:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0202 }
        L_0x0202:
            throw r0     // Catch:{ IOException -> 0x0203 }
        L_0x0203:
            r1 = move-exception
            java.lang.String r0 = "GoogleBackupApi/upload-file"
            com.whatsapp.util.Log.e(r0, r1)
            r0 = r20
            goto L_0x0040
        L_0x020d:
            r0 = r20
            goto L_0x0040
        L_0x0211:
            java.lang.Object r8 = r0.first
            if (r8 == 0) goto L_0x0224
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r0 = r0.second
            long r0 = X.C13700nu.A01(r0)
            X.5Od r3 = r2.A03
            r3.APP(r0)
            goto L_0x03d8
        L_0x0224:
            X.2GJ r0 = r2.A05
            boolean r0 = r0.A05()
            if (r0 == 0) goto L_0x08ee
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()     // Catch:{ URISyntaxException -> 0x08e1 }
            java.lang.String r0 = "/upload/v1/clients/wa/backups/"
            r1.append(r0)     // Catch:{ URISyntaxException -> 0x08e1 }
            X.3BK r3 = r2.A06     // Catch:{ URISyntaxException -> 0x08e1 }
            java.lang.String r0 = r3.A0A     // Catch:{ URISyntaxException -> 0x08e1 }
            r1.append(r0)     // Catch:{ URISyntaxException -> 0x08e1 }
            java.lang.String r0 = "/files/"
            r1.append(r0)     // Catch:{ URISyntaxException -> 0x08e1 }
            java.lang.String r22 = X.AnonymousClass000.A0h(r9, r1)     // Catch:{ URISyntaxException -> 0x08e1 }
            java.lang.String r18 = "https"
            r6 = 0
            java.lang.String r20 = "backup.googleapis.com"
            r1 = -1
            r21 = -1
            r23 = r7
            r24 = r7
            java.net.URI r17 = new java.net.URI     // Catch:{ URISyntaxException -> 0x08e1 }
            r19 = r7
            r17.<init>(r18, r19, r20, r21, r22, r23, r24)     // Catch:{ URISyntaxException -> 0x08e1 }
            java.lang.String r5 = r17.toASCIIString()     // Catch:{ URISyntaxException -> 0x08e1 }
            java.lang.String r4 = "\\+"
            java.lang.String r0 = "%2B"
            java.lang.String r8 = r5.replaceAll(r4, r0)     // Catch:{ URISyntaxException -> 0x08e1 }
            boolean r14 = A0H     // Catch:{ IOException -> 0x08e8 }
            r0 = 2
            java.util.HashMap r5 = new java.util.HashMap     // Catch:{ IOException -> 0x08e8 }
            r5.<init>(r0)     // Catch:{ IOException -> 0x08e8 }
            java.lang.String r3 = r3.A02()     // Catch:{ IOException -> 0x08e8 }
            X.AnonymousClass00B.A06(r3)     // Catch:{ IOException -> 0x08e8 }
            java.lang.String r0 = "transaction_id"
            r5.put(r0, r3)     // Catch:{ IOException -> 0x08e8 }
            int r0 = r2.A00     // Catch:{ IOException -> 0x08e8 }
            java.lang.String r3 = java.lang.Integer.toString(r0)     // Catch:{ IOException -> 0x08e8 }
            java.lang.String r0 = "retryCount"
            r5.put(r0, r3)     // Catch:{ IOException -> 0x08e8 }
            java.lang.String r3 = "uploadType"
            java.lang.String r0 = "resumable"
            r5.put(r3, r0)     // Catch:{ IOException -> 0x08e8 }
            r0 = r34
            X.4WW r13 = r0.A02     // Catch:{ IOException -> 0x08e8 }
            if (r13 == 0) goto L_0x02e0
            X.0sd r10 = r13.A02     // Catch:{ IOException -> 0x08e8 }
            X.0rz r0 = r10.A03     // Catch:{ IOException -> 0x08e8 }
            boolean r0 = r0.A1f()     // Catch:{ IOException -> 0x08e8 }
            if (r0 == 0) goto L_0x02e0
            android.text.format.Time r11 = new android.text.format.Time     // Catch:{ JSONException -> 0x02da }
            r11.<init>()     // Catch:{ JSONException -> 0x02da }
            long r3 = r13.A01     // Catch:{ JSONException -> 0x02da }
            r11.set(r3)     // Catch:{ JSONException -> 0x02da }
            org.json.JSONObject r4 = X.C13700nu.A0J()     // Catch:{ JSONException -> 0x02da }
            java.lang.String r3 = "name"
            java.lang.String r0 = r13.A04     // Catch:{ JSONException -> 0x02da }
            org.json.JSONObject r4 = r4.put(r3, r0)     // Catch:{ JSONException -> 0x02da }
            java.lang.String r3 = "md5Hash"
            java.lang.String r0 = r13.A03     // Catch:{ JSONException -> 0x02da }
            org.json.JSONObject r12 = r4.put(r3, r0)     // Catch:{ JSONException -> 0x02da }
            java.lang.String r0 = "sizeBytes"
            long r3 = r13.A00     // Catch:{ JSONException -> 0x02da }
            org.json.JSONObject r4 = r12.put(r0, r3)     // Catch:{ JSONException -> 0x02da }
            java.lang.String r3 = "updateTime"
            r0 = 0
            java.lang.String r0 = r11.format3339(r0)     // Catch:{ JSONException -> 0x02da }
            org.json.JSONObject r0 = r4.put(r3, r0)     // Catch:{ JSONException -> 0x02da }
            java.lang.String r0 = r0.toString()     // Catch:{ JSONException -> 0x02da }
            java.lang.String r6 = r10.A01(r0)     // Catch:{ JSONException -> 0x02da }
            goto L_0x02e0
        L_0x02da:
            r3 = move-exception
            java.lang.String r0 = "gdrive/file-metadata/failed to create metadata"
            com.whatsapp.util.Log.e(r0, r3)     // Catch:{ IOException -> 0x08e8 }
        L_0x02e0:
            java.lang.String r0 = "{\"mimeType\":\"application/binary\""
            java.lang.StringBuilder r4 = X.AnonymousClass000.A0r(r0)     // Catch:{ IOException -> 0x08e8 }
            if (r6 == 0) goto L_0x0345
            java.lang.String r0 = ",\"metadata\":\""
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0r(r0)     // Catch:{ IOException -> 0x08e8 }
            r3.append(r6)     // Catch:{ IOException -> 0x08e8 }
            java.lang.String r0 = "\""
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r3)     // Catch:{ IOException -> 0x08e8 }
        L_0x02f8:
            r4.append(r0)     // Catch:{ IOException -> 0x08e8 }
            java.lang.String r0 = "}"
            java.lang.String r10 = X.AnonymousClass000.A0h(r0, r4)     // Catch:{ IOException -> 0x08e8 }
            java.lang.String r3 = "X-Upload-Content-Length"
            if (r14 == 0) goto L_0x0348
            X.2GM r4 = r2.A07     // Catch:{ IOException -> 0x08e8 }
            java.lang.String r0 = r4.A06(r8, r5)     // Catch:{ IOException -> 0x08e8 }
            org.apache.http.client.methods.HttpPut r8 = new org.apache.http.client.methods.HttpPut     // Catch:{ IOException -> 0x08e8 }
            r8.<init>(r0)     // Catch:{ IOException -> 0x08e8 }
            java.lang.String r5 = "Content-Type"
            java.lang.String r0 = "application/json; charset=UTF-8"
            r8.setHeader(r5, r0)     // Catch:{ IOException -> 0x08e8 }
            long r5 = r34.A00()     // Catch:{ IOException -> 0x08e8 }
            java.lang.String r0 = java.lang.Long.toString(r5)     // Catch:{ IOException -> 0x08e8 }
            r8.setHeader(r3, r0)     // Catch:{ IOException -> 0x08e8 }
            java.lang.String r3 = X.AnonymousClass01S.A08     // Catch:{ IOException -> 0x08e8 }
            org.apache.http.entity.StringEntity r0 = new org.apache.http.entity.StringEntity     // Catch:{ IOException -> 0x08e8 }
            r0.<init>(r10, r3)     // Catch:{ IOException -> 0x08e8 }
            r8.setEntity(r0)     // Catch:{ IOException -> 0x08e8 }
            org.apache.http.HttpResponse r5 = X.AnonymousClass2GM.A00(r4, r8)     // Catch:{ IOException -> 0x08e8 }
            r8.getRequestLine()     // Catch:{ IOException -> 0x08e8 }
            r5.getStatusLine()     // Catch:{ IOException -> 0x08e8 }
            java.net.URI r0 = r8.getURI()     // Catch:{ IOException -> 0x08e8 }
            java.net.URL r0 = r0.toURL()     // Catch:{ IOException -> 0x08e8 }
            X.4vA r3 = new X.4vA     // Catch:{ IOException -> 0x08e8 }
            r3.<init>(r0, r5)     // Catch:{ IOException -> 0x08e8 }
            goto L_0x0384
        L_0x0345:
            java.lang.String r0 = ""
            goto L_0x02f8
        L_0x0348:
            X.2GM r4 = r2.A07     // Catch:{ IOException -> 0x08e8 }
            r22 = 1
            java.lang.String r18 = "PUT"
            java.lang.String r20 = "application/json; charset=UTF-8"
            r21 = r5
            r17 = r4
            r19 = r8
            javax.net.ssl.HttpsURLConnection r8 = r17.A08(r18, r19, r20, r21, r22)     // Catch:{ IOException -> 0x08e8 }
            long r5 = r34.A00()     // Catch:{ IOException -> 0x08e8 }
            java.lang.String r0 = java.lang.Long.toString(r5)     // Catch:{ IOException -> 0x08e8 }
            r8.setRequestProperty(r3, r0)     // Catch:{ IOException -> 0x08e8 }
            r8.getURL()     // Catch:{ IOException -> 0x08e8 }
            r8.getRequestMethod()     // Catch:{ IOException -> 0x08e8 }
            r8.connect()     // Catch:{ IOException -> 0x08e8 }
            java.io.OutputStream r3 = r8.getOutputStream()     // Catch:{ IOException -> 0x08e8 }
            byte[] r0 = r10.getBytes()     // Catch:{ IOException -> 0x08e8 }
            r3.write(r0)     // Catch:{ IOException -> 0x08e8 }
            r8.getResponseCode()     // Catch:{ IOException -> 0x08e8 }
            r8.getResponseMessage()     // Catch:{ IOException -> 0x08e8 }
            X.3uE r3 = new X.3uE     // Catch:{ IOException -> 0x08e8 }
            r3.<init>(r8)     // Catch:{ IOException -> 0x08e8 }
        L_0x0384:
            int r6 = r3.A6O()     // Catch:{ all -> 0x08dc }
            r3.AFa()     // Catch:{ all -> 0x08dc }
            r0 = 200(0xc8, float:2.8E-43)
            if (r6 != r0) goto L_0x0870
            r3.AAu()     // Catch:{ all -> 0x08dc }
            java.lang.String r0 = "Location"
            java.util.List r4 = r3.AHl(r0)     // Catch:{ all -> 0x08dc }
            if (r4 == 0) goto L_0x084c
            int r1 = r4.size()     // Catch:{ all -> 0x08dc }
            r0 = 1
            if (r1 != r0) goto L_0x084c
            r0 = 0
            r4.get(r0)     // Catch:{ all -> 0x08dc }
            java.lang.String r8 = X.AnonymousClass000.A0n(r4, r0)     // Catch:{ all -> 0x08dc }
            android.content.SharedPreferences r0 = r33.A00()     // Catch:{ all -> 0x08dc }
            android.content.SharedPreferences$Editor r4 = r0.edit()     // Catch:{ all -> 0x08dc }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0q(r15)     // Catch:{ all -> 0x08dc }
            r0 = r32
            r1.append(r0)     // Catch:{ all -> 0x08dc }
            r0 = r16
            r1.append(r0)     // Catch:{ all -> 0x08dc }
            java.lang.String r0 = X.AnonymousClass000.A0h(r9, r1)     // Catch:{ all -> 0x08dc }
            r4.putString(r0, r8)     // Catch:{ all -> 0x08dc }
            boolean r0 = r4.commit()     // Catch:{ all -> 0x08dc }
            if (r0 != 0) goto L_0x03d1
            java.lang.String r0 = "gdrive-api/insert-resumable-uri unable to commit resumable uri to shared prefs."
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x08dc }
        L_0x03d1:
            r3.close()     // Catch:{ IOException -> 0x08e8 }
            if (r8 == 0) goto L_0x08ee
            r0 = 0
        L_0x03d8:
            boolean r3 = A0H     // Catch:{ FileNotFoundException -> 0x0826 }
            if (r3 == 0) goto L_0x05eb
            long r5 = r34.A00()     // Catch:{ FileNotFoundException -> 0x0826 }
            r3 = 1
            long r10 = r5 - r3
            r21 = 0
            java.io.File r3 = r34.A01()     // Catch:{ IOException -> 0x05e5 }
            java.io.FileInputStream r15 = new java.io.FileInputStream     // Catch:{ IOException -> 0x05e5 }
            r15.<init>(r3)     // Catch:{ IOException -> 0x05e5 }
            long r3 = r15.skip(r0)     // Catch:{ IOException -> 0x05d6 }
            int r7 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r7 == 0) goto L_0x0419
            java.lang.StringBuilder r12 = X.AnonymousClass000.A0o()     // Catch:{ IOException -> 0x05d6 }
            java.lang.String r7 = "GoogleBackupApi/upload-file/ "
            r12.append(r7)     // Catch:{ IOException -> 0x05d6 }
            java.lang.String r7 = "<file>"
            r12.append(r7)     // Catch:{ IOException -> 0x05d6 }
            java.lang.String r7 = " seek required: "
            r12.append(r7)     // Catch:{ IOException -> 0x05d6 }
            r12.append(r0)     // Catch:{ IOException -> 0x05d6 }
            java.lang.String r7 = " seek actual: "
            r12.append(r7)     // Catch:{ IOException -> 0x05d6 }
            java.lang.String r3 = X.C13680ns.A0j(r12, r3)     // Catch:{ IOException -> 0x05d6 }
            com.whatsapp.util.Log.e((java.lang.String) r3)     // Catch:{ IOException -> 0x05d6 }
        L_0x0419:
            X.2GJ r3 = r2.A05     // Catch:{ all -> 0x05e0 }
            boolean r3 = r3.A05()     // Catch:{ all -> 0x05e0 }
            if (r3 == 0) goto L_0x05dc
            java.util.HashMap r7 = X.AnonymousClass000.A0x()     // Catch:{ all -> 0x05e0 }
            java.lang.String r4 = "retryCount"
            int r3 = r2.A00     // Catch:{ all -> 0x05e0 }
            java.lang.String r3 = java.lang.Integer.toString(r3)     // Catch:{ all -> 0x05e0 }
            r7.put(r4, r3)     // Catch:{ all -> 0x05e0 }
            X.2GM r13 = r2.A07     // Catch:{ all -> 0x05e0 }
            java.lang.String r3 = r13.A06(r8, r7)     // Catch:{ all -> 0x05e0 }
            org.apache.http.client.methods.HttpPut r14 = new org.apache.http.client.methods.HttpPut     // Catch:{ all -> 0x05e0 }
            r14.<init>(r3)     // Catch:{ all -> 0x05e0 }
            java.lang.String r4 = "Content-Range"
            java.lang.StringBuilder r7 = X.AnonymousClass000.A0o()     // Catch:{ all -> 0x05e0 }
            java.lang.String r3 = "bytes "
            r7.append(r3)     // Catch:{ all -> 0x05e0 }
            r7.append(r0)     // Catch:{ all -> 0x05e0 }
            r3 = r16
            r7.append(r3)     // Catch:{ all -> 0x05e0 }
            r7.append(r10)     // Catch:{ all -> 0x05e0 }
            java.lang.String r3 = "/"
            r7.append(r3)     // Catch:{ all -> 0x05e0 }
            java.lang.String r3 = X.C13680ns.A0j(r7, r5)     // Catch:{ all -> 0x05e0 }
            r14.setHeader(r4, r3)     // Catch:{ all -> 0x05e0 }
            java.lang.String r4 = "Content-Type"
            java.lang.String r3 = "application/binary"
            r14.setHeader(r4, r3)     // Catch:{ all -> 0x05e0 }
            r3 = 0
            java.util.concurrent.atomic.AtomicLong r12 = new java.util.concurrent.atomic.AtomicLong     // Catch:{ all -> 0x05e0 }
            r12.<init>(r3)     // Catch:{ all -> 0x05e0 }
            java.io.File r24 = r34.A01()     // Catch:{ all -> 0x05e0 }
            X.5HG r20 = new X.5HG     // Catch:{ all -> 0x05e0 }
            r22 = r20
            r23 = r2
            r25 = r15
            r26 = r12
            r27 = r14
            r28 = r10
            r30 = r0
            r22.<init>(r23, r24, r25, r26, r27, r28, r30)     // Catch:{ all -> 0x05e0 }
            r3 = r20
            r14.setEntity(r3)     // Catch:{ all -> 0x05e0 }
            android.os.Handler r8 = X.AnonymousClass000.A0L()     // Catch:{ all -> 0x05e0 }
            X.4x2 r7 = new X.4x2     // Catch:{ FileNotFoundException -> 0x05ca, IOException -> 0x05aa, all -> 0x05a8 }
            r7.<init>(r2, r14)     // Catch:{ FileNotFoundException -> 0x05ca, IOException -> 0x05aa, all -> 0x05a8 }
            r3 = 35
            X.C13700nu.A0O(r8, r2, r7, r3)     // Catch:{ FileNotFoundException -> 0x05a6, IOException -> 0x05a4, all -> 0x05a2 }
            boolean r3 = r14.isAborted()     // Catch:{ FileNotFoundException -> 0x05a6, IOException -> 0x05a4, all -> 0x05a2 }
            if (r3 == 0) goto L_0x04a3
            java.lang.String r0 = "GoogleBackupApi/upload-file/request-aborted"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ FileNotFoundException -> 0x05a6, IOException -> 0x05a4, all -> 0x05a2 }
            goto L_0x05bb
        L_0x04a3:
            r18 = -1
            org.apache.http.HttpResponse r10 = X.AnonymousClass2GM.A00(r13, r14)     // Catch:{ IllegalStateException -> 0x0565, all -> 0x0561 }
            r14.getRequestLine()     // Catch:{ IllegalStateException -> 0x0565, all -> 0x0561 }
            r10.getStatusLine()     // Catch:{ IllegalStateException -> 0x0565, all -> 0x0561 }
            org.apache.http.StatusLine r3 = r10.getStatusLine()     // Catch:{ IllegalStateException -> 0x0565, all -> 0x0561 }
            int r4 = r3.getStatusCode()     // Catch:{ IllegalStateException -> 0x0565, all -> 0x0561 }
            org.apache.http.HttpEntity r17 = r10.getEntity()     // Catch:{ IllegalStateException -> 0x0565, all -> 0x0561 }
            java.net.URI r3 = r14.getURI()     // Catch:{ IllegalStateException -> 0x055f }
            java.net.URL r3 = r3.toURL()     // Catch:{ IllegalStateException -> 0x055f }
            org.apache.http.HttpEntity r16 = r10.getEntity()     // Catch:{ IllegalStateException -> 0x055f }
            r11 = 200(0xc8, float:2.8E-43)
            if (r4 == r11) goto L_0x0531
            r11 = 201(0xc9, float:2.82E-43)
            if (r4 == r11) goto L_0x0531
            r5 = 401(0x191, float:5.62E-43)
            if (r4 != r5) goto L_0x04dc
            java.lang.String r3 = "GoogleBackupApi/upload-file/unauthorized"
            com.whatsapp.util.Log.i((java.lang.String) r3)     // Catch:{ IllegalStateException -> 0x055f }
            r13.A0A()     // Catch:{ IllegalStateException -> 0x055f }
            goto L_0x0547
        L_0x04dc:
            r5 = 403(0x193, float:5.65E-43)
            if (r4 == r5) goto L_0x0517
            r5 = 429(0x1ad, float:6.01E-43)
            java.lang.String r6 = "upload-file"
            if (r4 != r5) goto L_0x04fe
            X.0pd r9 = r2.A0C     // Catch:{ IllegalStateException -> 0x055f }
            r5 = 916(0x394, float:1.284E-42)
            X.0tM r4 = X.C16620tM.A02     // Catch:{ IllegalStateException -> 0x055f }
            boolean r5 = r9.A0E(r4, r5)     // Catch:{ IllegalStateException -> 0x055f }
            X.4vA r4 = new X.4vA     // Catch:{ IllegalStateException -> 0x055f }
            r4.<init>(r3, r10)     // Catch:{ IllegalStateException -> 0x055f }
            X.AnonymousClass3BQ.A00(r4, r6, r5)     // Catch:{ IllegalStateException -> 0x055f }
            java.lang.RuntimeException r3 = X.AnonymousClass000.A0Z()     // Catch:{ IllegalStateException -> 0x055f }
            throw r3     // Catch:{ IllegalStateException -> 0x055f }
        L_0x04fe:
            java.lang.String r5 = org.apache.http.util.EntityUtils.toString(r16)     // Catch:{ IllegalStateException -> 0x055f }
            java.lang.String r3 = "GoogleBackupApi/upload-file/unexpected-response/"
            java.lang.String r3 = X.C13680ns.A0h(r3, r5)     // Catch:{ IllegalStateException -> 0x055f }
            com.whatsapp.util.Log.e((java.lang.String) r3)     // Catch:{ IllegalStateException -> 0x055f }
            X.0so r3 = r2.A01     // Catch:{ IllegalStateException -> 0x055f }
            X.AnonymousClass2GM.A01(r3, r6, r4)     // Catch:{ IllegalStateException -> 0x055f }
            r4 = -1
            X.1da r3 = new X.1da     // Catch:{ IllegalStateException -> 0x055f }
            r3.<init>(r5, r4)     // Catch:{ IllegalStateException -> 0x055f }
            throw r3     // Catch:{ IllegalStateException -> 0x055f }
        L_0x0517:
            r4 = r33
            r3 = r32
            r4.A02(r3, r9)     // Catch:{ IllegalStateException -> 0x055f }
            java.lang.String r4 = org.apache.http.util.EntityUtils.toString(r16)     // Catch:{ IllegalStateException -> 0x055f }
            java.lang.String r3 = "GoogleBackupApi/api disabled upload-file "
            java.lang.String r3 = X.C13680ns.A0h(r3, r4)     // Catch:{ IllegalStateException -> 0x055f }
            com.whatsapp.util.Log.e((java.lang.String) r3)     // Catch:{ IllegalStateException -> 0x055f }
            X.3iQ r3 = new X.3iQ     // Catch:{ IllegalStateException -> 0x055f }
            r3.<init>()     // Catch:{ IllegalStateException -> 0x055f }
            throw r3     // Catch:{ IllegalStateException -> 0x055f }
        L_0x0531:
            java.lang.String r3 = org.apache.http.util.EntityUtils.toString(r16)     // Catch:{ IllegalStateException -> 0x055f }
            X.3Ad r21 = r2.A02(r3, r9, r5)     // Catch:{ IllegalStateException -> 0x055f }
            if (r21 == 0) goto L_0x0547
            java.lang.String r3 = "GoogleBackupApi/upload-file uploaded successfully."
            com.whatsapp.util.Log.i((java.lang.String) r3)     // Catch:{ IllegalStateException -> 0x055f }
            r4 = r33
            r3 = r32
            r4.A02(r3, r9)     // Catch:{ IllegalStateException -> 0x055f }
        L_0x0547:
            X.5Od r5 = r2.A03     // Catch:{ FileNotFoundException -> 0x05a6, IOException -> 0x05a4 }
            long r3 = r12.get()     // Catch:{ FileNotFoundException -> 0x05a6, IOException -> 0x05a4 }
            long r3 = r3 + r0
            long r3 = r3 * r18
            r5.APP(r3)     // Catch:{ FileNotFoundException -> 0x05a6, IOException -> 0x05a4 }
            X.AnonymousClass3BQ.A02(r20)     // Catch:{ FileNotFoundException -> 0x05a6, IOException -> 0x05a4 }
            X.AnonymousClass3BQ.A02(r17)     // Catch:{ FileNotFoundException -> 0x05a6, IOException -> 0x05a4 }
            r0 = 38
            X.C13700nu.A0O(r8, r2, r7, r0)     // Catch:{ all -> 0x05e0 }
            goto L_0x05dc
        L_0x055f:
            r4 = move-exception
            goto L_0x0568
        L_0x0561:
            r6 = move-exception
            r17 = 0
            goto L_0x058f
        L_0x0565:
            r4 = move-exception
            r17 = 0
        L_0x0568:
            boolean r3 = r14.isAborted()     // Catch:{ all -> 0x058e }
            if (r3 == 0) goto L_0x058d
            java.lang.String r3 = "GoogleBackupApi/upload-file/aborted"
            com.whatsapp.util.Log.i(r3, r4)     // Catch:{ all -> 0x058e }
            X.5Od r5 = r2.A03     // Catch:{ FileNotFoundException -> 0x05a6, IOException -> 0x05a4 }
            long r3 = r12.get()     // Catch:{ FileNotFoundException -> 0x05a6, IOException -> 0x05a4 }
            long r3 = r3 + r0
            long r3 = r3 * r18
            r5.APP(r3)     // Catch:{ FileNotFoundException -> 0x05a6, IOException -> 0x05a4 }
            X.AnonymousClass3BQ.A02(r20)     // Catch:{ FileNotFoundException -> 0x05a6, IOException -> 0x05a4 }
            X.AnonymousClass3BQ.A02(r17)     // Catch:{ FileNotFoundException -> 0x05a6, IOException -> 0x05a4 }
            r0 = 38
            com.facebook.redex.RunnableRunnableShape12S0200000_I1 r1 = new com.facebook.redex.RunnableRunnableShape12S0200000_I1     // Catch:{ all -> 0x05e0 }
            r1.<init>(r2, r0, r7)     // Catch:{ all -> 0x05e0 }
            goto L_0x05c2
        L_0x058d:
            throw r4     // Catch:{ all -> 0x058e }
        L_0x058e:
            r6 = move-exception
        L_0x058f:
            X.5Od r5 = r2.A03     // Catch:{ FileNotFoundException -> 0x05a6, IOException -> 0x05a4 }
            long r3 = r12.get()     // Catch:{ FileNotFoundException -> 0x05a6, IOException -> 0x05a4 }
            long r3 = r3 + r0
            long r3 = r3 * r18
            r5.APP(r3)     // Catch:{ FileNotFoundException -> 0x05a6, IOException -> 0x05a4 }
            X.AnonymousClass3BQ.A02(r20)     // Catch:{ FileNotFoundException -> 0x05a6, IOException -> 0x05a4 }
            X.AnonymousClass3BQ.A02(r17)     // Catch:{ FileNotFoundException -> 0x05a6, IOException -> 0x05a4 }
            throw r6     // Catch:{ FileNotFoundException -> 0x05a6, IOException -> 0x05a4 }
        L_0x05a2:
            r1 = move-exception
            goto L_0x05d0
        L_0x05a4:
            r1 = move-exception
            goto L_0x05ac
        L_0x05a6:
            r0 = move-exception
            goto L_0x05cc
        L_0x05a8:
            r1 = move-exception
            goto L_0x05d5
        L_0x05aa:
            r1 = move-exception
            r7 = 0
        L_0x05ac:
            java.lang.String r0 = "GoogleBackupApi/upload-file"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x05cd }
            if (r7 == 0) goto L_0x05c5
            r0 = 38
            com.facebook.redex.RunnableRunnableShape12S0200000_I1 r1 = new com.facebook.redex.RunnableRunnableShape12S0200000_I1     // Catch:{ all -> 0x05e0 }
            r1.<init>(r2, r0, r7)     // Catch:{ all -> 0x05e0 }
            goto L_0x05c2
        L_0x05bb:
            r0 = 38
            com.facebook.redex.RunnableRunnableShape12S0200000_I1 r1 = new com.facebook.redex.RunnableRunnableShape12S0200000_I1     // Catch:{ all -> 0x05e0 }
            r1.<init>(r2, r0, r7)     // Catch:{ all -> 0x05e0 }
        L_0x05c2:
            r8.post(r1)     // Catch:{ all -> 0x05e0 }
        L_0x05c5:
            r15.close()     // Catch:{ IOException -> 0x05e5 }
            goto L_0x0818
        L_0x05ca:
            r0 = move-exception
            r7 = 0
        L_0x05cc:
            throw r0     // Catch:{ all -> 0x05cd }
        L_0x05cd:
            r1 = move-exception
            if (r7 == 0) goto L_0x05d5
        L_0x05d0:
            r0 = 38
            X.C13700nu.A0O(r8, r2, r7, r0)     // Catch:{ all -> 0x05e0 }
        L_0x05d5:
            throw r1     // Catch:{ all -> 0x05e0 }
        L_0x05d6:
            r1 = move-exception
            java.lang.String r0 = "GoogleBackupApi/upload-file/error-during-seek"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x05e0 }
        L_0x05dc:
            r15.close()     // Catch:{ IOException -> 0x05e5 }
            return r21
        L_0x05e0:
            r0 = move-exception
            r15.close()     // Catch:{ all -> 0x05e4 }
        L_0x05e4:
            throw r0     // Catch:{ IOException -> 0x05e5 }
        L_0x05e5:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)     // Catch:{ FileNotFoundException -> 0x0826 }
            goto L_0x0818
        L_0x05eb:
            long r10 = r34.A00()     // Catch:{ FileNotFoundException -> 0x0826 }
            r5 = 1
            long r3 = r10 - r5
            android.os.Handler r12 = X.AnonymousClass000.A0L()     // Catch:{ FileNotFoundException -> 0x0826 }
            r21 = 0
            java.io.File r6 = r34.A01()     // Catch:{ FileNotFoundException -> 0x081b, IOException -> 0x080b, all -> 0x0809 }
            java.io.FileInputStream r18 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x081b, IOException -> 0x080b, all -> 0x0809 }
            r5 = r18
            r5.<init>(r6)     // Catch:{ FileNotFoundException -> 0x081b, IOException -> 0x080b, all -> 0x0809 }
            long r5 = r5.skip(r0)     // Catch:{ IOException -> 0x07f9 }
            int r13 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r13 == 0) goto L_0x062e
            java.lang.StringBuilder r14 = X.AnonymousClass000.A0o()     // Catch:{ IOException -> 0x07f9 }
            java.lang.String r13 = "GoogleBackupApi/upload-file/ "
            r14.append(r13)     // Catch:{ IOException -> 0x07f9 }
            java.lang.String r13 = "<file>"
            r14.append(r13)     // Catch:{ IOException -> 0x07f9 }
            java.lang.String r13 = " seek required: "
            r14.append(r13)     // Catch:{ IOException -> 0x07f9 }
            r14.append(r0)     // Catch:{ IOException -> 0x07f9 }
            java.lang.String r13 = " seek actual: "
            r14.append(r13)     // Catch:{ IOException -> 0x07f9 }
            java.lang.String r5 = X.C13680ns.A0j(r14, r5)     // Catch:{ IOException -> 0x07f9 }
            com.whatsapp.util.Log.e((java.lang.String) r5)     // Catch:{ IOException -> 0x07f9 }
        L_0x062e:
            X.2GJ r5 = r2.A05     // Catch:{ all -> 0x0803 }
            r20 = r5
            boolean r5 = r20.A05()     // Catch:{ all -> 0x0803 }
            if (r5 == 0) goto L_0x07f5
            X.2GM r5 = r2.A07     // Catch:{ all -> 0x0803 }
            r19 = r5
            boolean r5 = r19.A0B()     // Catch:{ all -> 0x0803 }
            if (r5 == 0) goto L_0x0649
            java.lang.String r0 = "GoogleBackupApi/upload-file/interrupted"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x07f3 }
            goto L_0x07f5
        L_0x0649:
            java.util.HashMap r6 = X.AnonymousClass000.A0x()     // Catch:{ all -> 0x0803 }
            java.lang.String r7 = "retryCount"
            int r5 = r2.A00     // Catch:{ all -> 0x0803 }
            java.lang.String r5 = java.lang.Integer.toString(r5)     // Catch:{ all -> 0x0803 }
            r6.put(r7, r5)     // Catch:{ all -> 0x0803 }
            r5 = 13
            android.net.TrafficStats.setThreadStatsTag(r5)     // Catch:{ all -> 0x0803 }
            java.lang.String r23 = "PUT"
            java.lang.String r25 = "application/binary"
            r27 = 1
            r22 = r19
            r24 = r8
            r26 = r6
            javax.net.ssl.HttpsURLConnection r13 = r22.A08(r23, r24, r25, r26, r27)     // Catch:{ all -> 0x0803 }
            r6 = 0
            java.util.concurrent.atomic.AtomicBoolean r17 = new java.util.concurrent.atomic.AtomicBoolean     // Catch:{ all -> 0x0803 }
            r5 = r17
            r5.<init>(r6)     // Catch:{ all -> 0x0803 }
            X.4x3 r7 = new X.4x3     // Catch:{ all -> 0x0803 }
            r7.<init>(r2, r5, r13)     // Catch:{ all -> 0x0803 }
            r5 = 36
            X.C13700nu.A0O(r12, r2, r7, r5)     // Catch:{ all -> 0x07f3 }
            boolean r5 = r17.get()     // Catch:{ all -> 0x07f3 }
            if (r5 == 0) goto L_0x0690
            java.lang.String r0 = "GoogleBackupApi/upload-file/request-aborted"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x07f3 }
            r18.close()     // Catch:{ FileNotFoundException -> 0x081b, IOException -> 0x080b }
            goto L_0x07b9
        L_0x0690:
            r5 = 0
            java.util.concurrent.atomic.AtomicLong r8 = new java.util.concurrent.atomic.AtomicLong     // Catch:{ all -> 0x07f3 }
            r8.<init>(r5)     // Catch:{ all -> 0x07f3 }
            java.lang.String r6 = "Content-Range"
            java.lang.StringBuilder r14 = X.AnonymousClass000.A0o()     // Catch:{ IllegalStateException -> 0x07ce }
            java.lang.String r5 = "bytes "
            r14.append(r5)     // Catch:{ IllegalStateException -> 0x07ce }
            r14.append(r0)     // Catch:{ IllegalStateException -> 0x07ce }
            r5 = r16
            r14.append(r5)     // Catch:{ IllegalStateException -> 0x07ce }
            r14.append(r3)     // Catch:{ IllegalStateException -> 0x07ce }
            java.lang.String r5 = "/"
            r14.append(r5)     // Catch:{ IllegalStateException -> 0x07ce }
            java.lang.String r5 = X.C13680ns.A0j(r14, r10)     // Catch:{ IllegalStateException -> 0x07ce }
            r13.addRequestProperty(r6, r5)     // Catch:{ IllegalStateException -> 0x07ce }
            java.lang.String r14 = "Content-Length"
            long r3 = r3 - r0
            r5 = 1
            long r3 = r3 + r5
            java.lang.String r5 = java.lang.Long.toString(r3)     // Catch:{ IllegalStateException -> 0x07ce }
            r13.addRequestProperty(r14, r5)     // Catch:{ IllegalStateException -> 0x07ce }
            int r6 = android.os.Build.VERSION.SDK_INT     // Catch:{ IllegalStateException -> 0x07ce }
            r5 = 19
            if (r6 < r5) goto L_0x06e4
            r13.setFixedLengthStreamingMode(r3)     // Catch:{ IllegalStateException -> 0x07ce }
        L_0x06cf:
            r13.getURL()     // Catch:{ IllegalStateException -> 0x07ce }
            r13.getRequestMethod()     // Catch:{ IllegalStateException -> 0x07ce }
            r13.connect()     // Catch:{ IllegalStateException -> 0x07ce }
            java.io.OutputStream r4 = r13.getOutputStream()     // Catch:{ IllegalStateException -> 0x07ce }
            java.io.BufferedOutputStream r16 = new java.io.BufferedOutputStream     // Catch:{ IllegalStateException -> 0x07ce }
            r3 = r16
            r3.<init>(r4)     // Catch:{ IllegalStateException -> 0x07ce }
            goto L_0x06e9
        L_0x06e4:
            int r5 = (int) r3     // Catch:{ IllegalStateException -> 0x07ce }
            r13.setFixedLengthStreamingMode(r5)     // Catch:{ IllegalStateException -> 0x07ce }
            goto L_0x06cf
        L_0x06e9:
            r3 = 16384(0x4000, float:2.2959E-41)
            byte[] r14 = new byte[r3]     // Catch:{ all -> 0x07c4 }
        L_0x06ed:
            boolean r3 = r20.A05()     // Catch:{ all -> 0x07c4 }
            r6 = 0
            if (r3 != 0) goto L_0x06f5
            goto L_0x070e
        L_0x06f5:
            r4 = 16384(0x4000, float:2.2959E-41)
            r3 = r18
            int r5 = r3.read(r14, r6, r4)     // Catch:{ all -> 0x07c4 }
            if (r5 <= 0) goto L_0x0716
            long r3 = (long) r5     // Catch:{ all -> 0x07c4 }
            r8.addAndGet(r3)     // Catch:{ all -> 0x07c4 }
            X.5Od r15 = r2.A03     // Catch:{ all -> 0x07c4 }
            r15.APP(r3)     // Catch:{ all -> 0x07c4 }
            r3 = r16
            r3.write(r14, r6, r5)     // Catch:{ all -> 0x07c4 }
            goto L_0x06ed
        L_0x070e:
            X.C30311c8.A04(r18)     // Catch:{ all -> 0x07c9 }
            r16.close()     // Catch:{ IllegalStateException -> 0x07ce }
            goto L_0x07da
        L_0x0716:
            r16.flush()     // Catch:{ all -> 0x07c4 }
            X.C30311c8.A04(r18)     // Catch:{ all -> 0x07c9 }
            r16.close()     // Catch:{ IllegalStateException -> 0x07ce }
            int r4 = r13.getResponseCode()     // Catch:{ IllegalStateException -> 0x07ce }
            r13.getResponseCode()     // Catch:{ IllegalStateException -> 0x07ce }
            r13.getResponseMessage()     // Catch:{ IllegalStateException -> 0x07ce }
            r3 = 200(0xc8, float:2.8E-43)
            if (r4 == r3) goto L_0x078e
            r3 = 201(0xc9, float:2.82E-43)
            if (r4 == r3) goto L_0x078e
            r3 = 401(0x191, float:5.62E-43)
            if (r4 != r3) goto L_0x073e
            java.lang.String r3 = "GoogleBackupApi/upload-file/unauthorized"
            com.whatsapp.util.Log.i((java.lang.String) r3)     // Catch:{ IllegalStateException -> 0x07ce }
            r19.A0A()     // Catch:{ IllegalStateException -> 0x07ce }
            goto L_0x07a5
        L_0x073e:
            r3 = 403(0x193, float:5.65E-43)
            if (r4 == r3) goto L_0x0774
            r3 = 429(0x1ad, float:6.01E-43)
            java.lang.String r6 = "upload-file"
            if (r4 != r3) goto L_0x075b
            X.0pd r5 = r2.A0C     // Catch:{ IllegalStateException -> 0x07ce }
            r4 = 916(0x394, float:1.284E-42)
            X.0tM r3 = X.C16620tM.A02     // Catch:{ IllegalStateException -> 0x07ce }
            boolean r3 = r5.A0E(r3, r4)     // Catch:{ IllegalStateException -> 0x07ce }
            X.AnonymousClass3BQ.A01(r6, r13, r3)     // Catch:{ IllegalStateException -> 0x07ce }
            java.lang.RuntimeException r3 = X.AnonymousClass000.A0Z()     // Catch:{ IllegalStateException -> 0x07ce }
            throw r3     // Catch:{ IllegalStateException -> 0x07ce }
        L_0x075b:
            java.lang.String r5 = X.C30311c8.A01(r13)     // Catch:{ IllegalStateException -> 0x07ce }
            java.lang.String r3 = "GoogleBackupApi/upload-file/unexpected-response/"
            java.lang.String r3 = X.C13680ns.A0h(r3, r5)     // Catch:{ IllegalStateException -> 0x07ce }
            com.whatsapp.util.Log.i((java.lang.String) r3)     // Catch:{ IllegalStateException -> 0x07ce }
            X.0so r3 = r2.A01     // Catch:{ IllegalStateException -> 0x07ce }
            X.AnonymousClass2GM.A01(r3, r6, r4)     // Catch:{ IllegalStateException -> 0x07ce }
            r4 = -1
            X.1da r3 = new X.1da     // Catch:{ IllegalStateException -> 0x07ce }
            r3.<init>(r5, r4)     // Catch:{ IllegalStateException -> 0x07ce }
            throw r3     // Catch:{ IllegalStateException -> 0x07ce }
        L_0x0774:
            r4 = r33
            r3 = r32
            r4.A02(r3, r9)     // Catch:{ IllegalStateException -> 0x07ce }
            java.lang.String r4 = X.C30311c8.A01(r13)     // Catch:{ IllegalStateException -> 0x07ce }
            java.lang.String r3 = "GoogleBackupApi/api disabled upload-file "
            java.lang.String r3 = X.C13680ns.A0h(r3, r4)     // Catch:{ IllegalStateException -> 0x07ce }
            com.whatsapp.util.Log.e((java.lang.String) r3)     // Catch:{ IllegalStateException -> 0x07ce }
            X.3iQ r3 = new X.3iQ     // Catch:{ IllegalStateException -> 0x07ce }
            r3.<init>()     // Catch:{ IllegalStateException -> 0x07ce }
            throw r3     // Catch:{ IllegalStateException -> 0x07ce }
        L_0x078e:
            java.io.InputStream r3 = r13.getInputStream()     // Catch:{ IOException -> 0x0797 }
            java.lang.String r3 = X.C30311c8.A00(r3)     // Catch:{ IOException -> 0x0797 }
            goto L_0x0798
        L_0x0797:
            r3 = 0
        L_0x0798:
            X.3Ad r21 = r2.A02(r3, r9, r10)     // Catch:{ IllegalStateException -> 0x07ce }
            if (r21 == 0) goto L_0x07a5
            r4 = r33
            r3 = r32
            r4.A02(r3, r9)     // Catch:{ IllegalStateException -> 0x07ce }
        L_0x07a5:
            A00(r2, r8, r0)     // Catch:{ all -> 0x07f3 }
            r13.disconnect()     // Catch:{ all -> 0x07f3 }
            android.net.TrafficStats.clearThreadStatsTag()     // Catch:{ all -> 0x07f3 }
            r18.close()     // Catch:{ FileNotFoundException -> 0x081b, IOException -> 0x080b }
            r0 = 37
            com.facebook.redex.RunnableRunnableShape12S0200000_I1 r1 = new com.facebook.redex.RunnableRunnableShape12S0200000_I1     // Catch:{ FileNotFoundException -> 0x0826 }
            r1.<init>(r2, r0, r7)     // Catch:{ FileNotFoundException -> 0x0826 }
            goto L_0x07c0
        L_0x07b9:
            r0 = 37
            com.facebook.redex.RunnableRunnableShape12S0200000_I1 r1 = new com.facebook.redex.RunnableRunnableShape12S0200000_I1     // Catch:{ FileNotFoundException -> 0x0826 }
            r1.<init>(r2, r0, r7)     // Catch:{ FileNotFoundException -> 0x0826 }
        L_0x07c0:
            r12.post(r1)     // Catch:{ FileNotFoundException -> 0x0826 }
            return r21
        L_0x07c4:
            r3 = move-exception
            X.C30311c8.A04(r18)     // Catch:{ all -> 0x07c9 }
            throw r3     // Catch:{ all -> 0x07c9 }
        L_0x07c9:
            r3 = move-exception
            r16.close()     // Catch:{ all -> 0x07cd }
        L_0x07cd:
            throw r3     // Catch:{ IllegalStateException -> 0x07ce }
        L_0x07ce:
            r4 = move-exception
            boolean r3 = r17.get()     // Catch:{ all -> 0x07e8 }
            if (r3 == 0) goto L_0x07e7
            java.lang.String r3 = "GoogleBackupApi/upload-file/aborted"
            com.whatsapp.util.Log.i(r3, r4)     // Catch:{ all -> 0x07e8 }
        L_0x07da:
            A00(r2, r8, r0)     // Catch:{ all -> 0x07f3 }
            r13.disconnect()     // Catch:{ all -> 0x07f3 }
            android.net.TrafficStats.clearThreadStatsTag()     // Catch:{ all -> 0x07f3 }
            r18.close()     // Catch:{ FileNotFoundException -> 0x081b, IOException -> 0x080b }
            goto L_0x0813
        L_0x07e7:
            throw r4     // Catch:{ all -> 0x07e8 }
        L_0x07e8:
            r3 = move-exception
            A00(r2, r8, r0)     // Catch:{ all -> 0x07f3 }
            r13.disconnect()     // Catch:{ all -> 0x07f3 }
            android.net.TrafficStats.clearThreadStatsTag()     // Catch:{ all -> 0x07f3 }
            throw r3     // Catch:{ all -> 0x07f3 }
        L_0x07f3:
            r0 = move-exception
            goto L_0x0805
        L_0x07f5:
            r18.close()     // Catch:{ FileNotFoundException -> 0x081b, IOException -> 0x080b }
            return r21
        L_0x07f9:
            r1 = move-exception
            java.lang.String r0 = "GoogleBackupApi/upload-file/error-during-seek"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0803 }
            r18.close()     // Catch:{ FileNotFoundException -> 0x081b, IOException -> 0x080b, all -> 0x0809 }
            return r21
        L_0x0803:
            r0 = move-exception
            r7 = 0
        L_0x0805:
            r18.close()     // Catch:{ all -> 0x0808 }
        L_0x0808:
            throw r0     // Catch:{ FileNotFoundException -> 0x081b, IOException -> 0x080b }
        L_0x0809:
            r1 = move-exception
            goto L_0x0825
        L_0x080b:
            r1 = move-exception
            java.lang.String r0 = "GoogleBackupApi/upload-file"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x081d }
            if (r7 == 0) goto L_0x0818
        L_0x0813:
            r0 = 37
            X.C13700nu.A0O(r12, r2, r7, r0)     // Catch:{ FileNotFoundException -> 0x0826 }
        L_0x0818:
            r21 = 0
            return r21
        L_0x081b:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x081d }
        L_0x081d:
            r1 = move-exception
            if (r7 == 0) goto L_0x0825
            r0 = 37
            X.C13700nu.A0O(r12, r2, r7, r0)     // Catch:{ FileNotFoundException -> 0x0826 }
        L_0x0825:
            throw r1     // Catch:{ FileNotFoundException -> 0x0826 }
        L_0x0826:
            r3 = move-exception
            X.0sc r1 = r2.A0A
            java.io.File r0 = r34.A01()
            boolean r0 = r1.A0B(r0)
            if (r0 == 0) goto L_0x091a
            X.0sj r0 = r2.A0B
            boolean r0 = r0.A0E()
            if (r0 == 0) goto L_0x091a
            java.lang.String r1 = "GoogleBackupApi/upload-file/missing-read-external-storage-permission/ "
            r0 = r34
            java.lang.String r0 = X.AnonymousClass000.A0g(r1, r0)
            com.whatsapp.util.Log.e(r0, r3)
            X.3iZ r0 = new X.3iZ
            r0.<init>(r3)
            throw r0
        L_0x084c:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()     // Catch:{ all -> 0x08dc }
            java.lang.String r0 = "GoogleBackupApi/upload-file exactly one location header should have been returned by Google drive, it returned "
            r1.append(r0)     // Catch:{ all -> 0x08dc }
            if (r4 != 0) goto L_0x0858
            goto L_0x0861
        L_0x0858:
            int r0 = r4.size()     // Catch:{ all -> 0x08dc }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x08dc }
            goto L_0x0863
        L_0x0861:
            java.lang.String r0 = "no"
        L_0x0863:
            r1.append(r0)     // Catch:{ all -> 0x08dc }
            java.lang.String r0 = " headers."
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)     // Catch:{ all -> 0x08dc }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x08dc }
            goto L_0x0877
        L_0x0870:
            r0 = 401(0x191, float:5.62E-43)
            if (r6 != r0) goto L_0x087b
            r4.A0A()     // Catch:{ all -> 0x08dc }
        L_0x0877:
            r3.close()     // Catch:{ IOException -> 0x08e8 }
            goto L_0x08ee
        L_0x087b:
            r0 = 403(0x193, float:5.65E-43)
            if (r6 == r0) goto L_0x08c2
            r0 = 404(0x194, float:5.66E-43)
            if (r6 == r0) goto L_0x08b8
            r0 = 429(0x1ad, float:6.01E-43)
            java.lang.String r5 = "upload-file"
            if (r6 != r0) goto L_0x089c
            X.0pd r2 = r2.A0C     // Catch:{ all -> 0x08dc }
            r1 = 916(0x394, float:1.284E-42)
            X.0tM r0 = X.C16620tM.A02     // Catch:{ all -> 0x08dc }
            boolean r0 = r2.A0E(r0, r1)     // Catch:{ all -> 0x08dc }
            X.AnonymousClass3BQ.A00(r3, r5, r0)     // Catch:{ all -> 0x08dc }
            java.lang.RuntimeException r0 = X.AnonymousClass000.A0Z()     // Catch:{ all -> 0x08dc }
            throw r0     // Catch:{ all -> 0x08dc }
        L_0x089c:
            java.lang.StringBuilder r4 = X.AnonymousClass000.A0o()     // Catch:{ all -> 0x08dc }
            java.lang.String r0 = "GoogleBackupApi/upload-file/unexpected-response/"
            java.lang.String r0 = X.C13680ns.A0i(r0, r4, r6)     // Catch:{ all -> 0x08dc }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x08dc }
            java.lang.String r4 = r3.AC0()     // Catch:{ all -> 0x08dc }
            X.0so r0 = r2.A01     // Catch:{ all -> 0x08dc }
            X.AnonymousClass2GM.A01(r0, r5, r6)     // Catch:{ all -> 0x08dc }
            X.1da r0 = new X.1da     // Catch:{ all -> 0x08dc }
            r0.<init>(r4, r1)     // Catch:{ all -> 0x08dc }
            throw r0     // Catch:{ all -> 0x08dc }
        L_0x08b8:
            java.lang.String r1 = r3.AC0()     // Catch:{ all -> 0x08dc }
            X.3iM r0 = new X.3iM     // Catch:{ all -> 0x08dc }
            r0.<init>(r1)     // Catch:{ all -> 0x08dc }
            throw r0     // Catch:{ all -> 0x08dc }
        L_0x08c2:
            java.lang.String r2 = r3.AC0()     // Catch:{ all -> 0x08dc }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()     // Catch:{ all -> 0x08dc }
            java.lang.String r0 = "GoogleBackupApi/api disabled upload-file "
            r1.append(r0)     // Catch:{ all -> 0x08dc }
            java.lang.String r0 = X.AnonymousClass000.A0h(r2, r1)     // Catch:{ all -> 0x08dc }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x08dc }
            X.3iQ r0 = new X.3iQ     // Catch:{ all -> 0x08dc }
            r0.<init>()     // Catch:{ all -> 0x08dc }
            throw r0     // Catch:{ all -> 0x08dc }
        L_0x08dc:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x08e0 }
        L_0x08e0:
            throw r0     // Catch:{ IOException -> 0x08e8 }
        L_0x08e1:
            r1 = move-exception
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x08e8 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x08e8 }
            throw r0     // Catch:{ IOException -> 0x08e8 }
        L_0x08e8:
            r1 = move-exception
            java.lang.String r0 = "GoogleBackupApi/upload-file"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x08ee:
            java.lang.String r0 = "GoogleBackupApi/upload-file/error-creating-new-session"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return r7
        L_0x08f4:
            java.lang.String r0 = "GoogleBackupApi/upload-file file "
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0r(r0)
            java.lang.String r2 = "<file>"
            r0.append(r2)
            java.lang.String r1 = " does not exist."
            java.lang.String r0 = X.AnonymousClass000.A0h(r1, r0)
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.lang.String r0 = "file "
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0r(r0)
            r0.append(r2)
            java.lang.String r0 = X.AnonymousClass000.A0h(r1, r0)
            java.io.FileNotFoundException r3 = new java.io.FileNotFoundException
            r3.<init>(r0)
        L_0x091a:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3AX.A01():X.3Ad");
    }

    public final C61743Ad A02(String str, String str2, long j2) {
        if (TextUtils.isEmpty(str)) {
            Log.e("GoogleBackupApi/upload-file/unexpected-response/file-uploaded-but-no-entity-in-response");
            return null;
        }
        try {
            C61743Ad A002 = C61743Ad.A00(this.A02, (String) null, str2, C13700nu.A0K(str), j2);
            if (A002 == null) {
                Log.e("GoogleBackupApi/upload-file/some attributes are missing");
            }
            return A002;
        } catch (JSONException e2) {
            Log.e(C13680ns.A0h("GoogleBackupApi/upload-file/malformed-json-response/", str), e2);
            return null;
        }
    }
}
