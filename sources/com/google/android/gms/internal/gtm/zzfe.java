package com.google.android.gms.internal.gtm;

import X.AnonymousClass000;
import X.C13690nt;
import X.C13710nw;
import X.C15000qA;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import com.facebook.msys.mci.DefaultCrypto;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import org.apache.commons.io.IOUtils;

public final class zzfe extends zzbs {
    public static final byte[] zza = IOUtils.LINE_SEPARATOR_UNIX.getBytes();
    public final String zzb;
    public final zzfo zzc;

    public zzfe(zzbv zzbv) {
        super(zzbv);
        String str = zzbt.zza;
        String str2 = Build.VERSION.RELEASE;
        String zzd = zzfs.zzd(Locale.getDefault());
        String str3 = Build.MODEL;
        String str4 = Build.ID;
        Object[] objArr = new Object[6];
        C13690nt.A1L("GoogleAnalytics", str, objArr);
        objArr[2] = str2;
        objArr[3] = zzd;
        objArr[4] = str3;
        objArr[5] = str4;
        this.zzb = String.format("%s/%s (Linux; U; Android %s; %s; %s Build/%s)", objArr);
        this.zzc = new zzfo(zzbv.zzd);
    }

    /* JADX WARNING: type inference failed for: r5v0 */
    /* JADX WARNING: type inference failed for: r5v1, types: [java.io.OutputStream] */
    /* JADX WARNING: type inference failed for: r5v2, types: [java.net.HttpURLConnection] */
    /* JADX WARNING: type inference failed for: r5v3 */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007c A[SYNTHETIC, Splitter:B:26:0x007c] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0090 A[SYNTHETIC, Splitter:B:35:0x0090] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int zzg(java.net.URL r7, byte[] r8) {
        /*
            r6 = this;
            java.lang.String r3 = "Error closing http post connection output stream"
            X.C13710nw.A01(r7)
            X.C13710nw.A01(r8)
            int r2 = r8.length
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            java.lang.String r0 = "POST bytes, url"
            r6.zzH(r0, r1, r7)
            com.google.android.gms.internal.gtm.zzet r0 = com.google.android.gms.internal.gtm.zzeu.zzc
            java.lang.Object r1 = r0.zzb()
            java.lang.String r1 = (java.lang.String) r1
            r0 = 2
            boolean r0 = android.util.Log.isLoggable(r1, r0)
            if (r0 == 0) goto L_0x002b
            java.lang.String r1 = new java.lang.String
            r1.<init>(r8)
            java.lang.String r0 = "Post payload\n"
            r6.zzP(r0, r1)
        L_0x002b:
            r5 = 0
            com.google.android.gms.internal.gtm.zzbv r0 = r6.zza     // Catch:{ IOException -> 0x0073, all -> 0x009e }
            android.content.Context r0 = r0.zzb     // Catch:{ IOException -> 0x0073, all -> 0x009e }
            r0.getPackageName()     // Catch:{ IOException -> 0x0073, all -> 0x009e }
            java.net.HttpURLConnection r4 = r6.zzb(r7)     // Catch:{ IOException -> 0x0073, all -> 0x009e }
            r0 = 1
            r4.setDoOutput(r0)     // Catch:{ IOException -> 0x006f, all -> 0x006d }
            r4.setFixedLengthStreamingMode(r2)     // Catch:{ IOException -> 0x006f, all -> 0x006d }
            r4.connect()     // Catch:{ IOException -> 0x006f, all -> 0x006d }
            java.io.OutputStream r5 = r4.getOutputStream()     // Catch:{ IOException -> 0x006f, all -> 0x006d }
            r5.write(r8)     // Catch:{ IOException -> 0x006f, all -> 0x006d }
            r6.zzk(r4)     // Catch:{ IOException -> 0x006f, all -> 0x006d }
            int r2 = r4.getResponseCode()     // Catch:{ IOException -> 0x006f, all -> 0x006d }
            r0 = 200(0xc8, float:2.8E-43)
            if (r2 != r0) goto L_0x0058
            X.C15000qA.A01(r6)     // Catch:{ IOException -> 0x006f, all -> 0x006d }
            r2 = 200(0xc8, float:2.8E-43)
        L_0x0058:
            java.lang.String r1 = "POST status"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)     // Catch:{ IOException -> 0x006f, all -> 0x006d }
            r6.zzG(r1, r0)     // Catch:{ IOException -> 0x006f, all -> 0x006d }
            r5.close()     // Catch:{ IOException -> 0x0065 }
            goto L_0x0069
        L_0x0065:
            r0 = move-exception
            r6.zzK(r3, r0)
        L_0x0069:
            r4.disconnect()
            return r2
        L_0x006d:
            r1 = move-exception
            goto L_0x008e
        L_0x006f:
            r1 = move-exception
            r2 = r5
            r5 = r4
            goto L_0x0075
        L_0x0073:
            r1 = move-exception
            r2 = r5
        L_0x0075:
            java.lang.String r0 = "Network POST connection error"
            r6.zzS(r0, r1)     // Catch:{ all -> 0x008b }
            if (r2 == 0) goto L_0x0084
            r2.close()     // Catch:{ IOException -> 0x0080 }
            goto L_0x0084
        L_0x0080:
            r0 = move-exception
            r6.zzK(r3, r0)
        L_0x0084:
            if (r5 == 0) goto L_0x0089
            r5.disconnect()
        L_0x0089:
            r0 = 0
            return r0
        L_0x008b:
            r1 = move-exception
            r4 = r5
            r5 = r2
        L_0x008e:
            if (r5 == 0) goto L_0x0098
            r5.close()     // Catch:{ IOException -> 0x0094 }
            goto L_0x0098
        L_0x0094:
            r0 = move-exception
            r6.zzK(r3, r0)
        L_0x0098:
            if (r4 == 0) goto L_0x009f
            r4.disconnect()
            throw r1
        L_0x009e:
            r1 = move-exception
        L_0x009f:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzfe.zzg(java.net.URL, byte[]):int");
    }

    private final void zzk(HttpURLConnection httpURLConnection) {
        InputStream inputStream = httpURLConnection.getInputStream();
        try {
            do {
            } while (inputStream.read(new byte[1024]) > 0);
            try {
                inputStream.close();
            } catch (IOException e2) {
                zzK("Error closing http connection input stream", e2);
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                    throw th;
                } catch (IOException e3) {
                    zzK("Error closing http connection input stream", e3);
                    throw th;
                }
            }
            throw th;
        }
    }

    public static final void zzl(StringBuilder sb, String str, String str2) {
        if (sb.length() != 0) {
            sb.append('&');
        }
        sb.append(URLEncoder.encode(str, DefaultCrypto.UTF_8));
        sb.append('=');
        sb.append(URLEncoder.encode(str2, DefaultCrypto.UTF_8));
    }

    public final String zza(zzex zzex, boolean z2) {
        C13710nw.A01(zzex);
        StringBuilder A0o = AnonymousClass000.A0o();
        try {
            Iterator A0y = AnonymousClass000.A0y(zzex.zza);
            while (A0y.hasNext()) {
                Map.Entry A0z = AnonymousClass000.A0z(A0y);
                String A0f = C13690nt.A0f(A0z);
                if (!"ht".equals(A0f) && !"qt".equals(A0f) && !"AppUID".equals(A0f) && !"z".equals(A0f) && !"_gmsv".equals(A0f)) {
                    zzl(A0o, A0f, (String) A0z.getValue());
                }
            }
            zzl(A0o, "ht", String.valueOf(zzex.zzd));
            zzl(A0o, "qt", String.valueOf(System.currentTimeMillis() - zzex.zzd));
            if (z2) {
                C13710nw.A05("_s");
                C13710nw.A03("Short param name required", !"_s".startsWith("&"));
                String A0e = C13690nt.A0e("_s", zzex.zza);
                if (A0e == null) {
                    A0e = "0";
                }
                long j2 = 0;
                try {
                    j2 = Long.parseLong(A0e);
                } catch (NumberFormatException unused) {
                }
                zzl(A0o, "z", j2 != 0 ? String.valueOf(j2) : String.valueOf(zzex.zzc));
            }
            return A0o.toString();
        } catch (UnsupportedEncodingException e2) {
            zzK("Failed to encode name or value", e2);
            return null;
        }
    }

    public final HttpURLConnection zzb(URL url) {
        URLConnection openConnection = url.openConnection();
        if (openConnection instanceof HttpURLConnection) {
            HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
            httpURLConnection.setDefaultUseCaches(false);
            httpURLConnection.setConnectTimeout(AnonymousClass000.A0D(zzeu.zzE.zzb()));
            httpURLConnection.setReadTimeout(AnonymousClass000.A0D(zzeu.zzF.zzb()));
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setRequestProperty("User-Agent", this.zzb);
            httpURLConnection.setDoInput(true);
            return httpURLConnection;
        }
        throw new IOException("Failed to obtain http connection");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005f, code lost:
        if ("BATCH_BY_SIZE".equalsIgnoreCase(r1) != false) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0071, code lost:
        if (true != "GZIP".equalsIgnoreCase((java.lang.String) com.google.android.gms.internal.gtm.zzeu.zzw.zzb())) goto L_0x0073;
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0223  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0253 A[SYNTHETIC, Splitter:B:110:0x0253] */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x025d  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x038e  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x0395  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x0122 A[EDGE_INSN: B:189:0x0122->B:51:0x0122 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x02a0 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00cd A[LOOP:0: B:23:0x009d->B:33:0x00cd, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01fc A[SYNTHETIC, Splitter:B:89:0x01fc] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0206  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0219  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List zzc(java.util.List r16) {
        /*
            r15 = this;
            java.lang.String r2 = "Error closing http compressed post connection output stream"
            X.C15000qA.A00()
            r15.zzW()
            X.C13710nw.A01(r16)
            com.google.android.gms.internal.gtm.zzbv r0 = r15.zza
            com.google.android.gms.internal.gtm.zzct r0 = r0.zze
            java.util.Set r0 = r0.zza()
            boolean r0 = r0.isEmpty()
            r3 = 1
            if (r0 != 0) goto L_0x011f
            com.google.android.gms.internal.gtm.zzfo r4 = r15.zzc
            com.google.android.gms.internal.gtm.zzet r0 = com.google.android.gms.internal.gtm.zzeu.zzC
            java.lang.Object r0 = r0.zzb()
            int r0 = X.AnonymousClass000.A0D(r0)
            long r0 = X.C13690nt.A08(r0)
            boolean r0 = r4.zzc(r0)
            if (r0 == 0) goto L_0x011f
            com.google.android.gms.internal.gtm.zzet r0 = com.google.android.gms.internal.gtm.zzeu.zzv
            java.lang.Object r1 = r0.zzb()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = "BATCH_BY_SESSION"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L_0x0061
            java.lang.String r0 = "BATCH_BY_TIME"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L_0x0061
            java.lang.String r0 = "BATCH_BY_BRUTE_FORCE"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L_0x0061
            java.lang.String r0 = "BATCH_BY_COUNT"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L_0x0061
            java.lang.String r0 = "BATCH_BY_SIZE"
            boolean r0 = r0.equalsIgnoreCase(r1)
            r4 = 0
            if (r0 == 0) goto L_0x0062
        L_0x0061:
            r4 = 1
        L_0x0062:
            com.google.android.gms.internal.gtm.zzet r0 = com.google.android.gms.internal.gtm.zzeu.zzw
            java.lang.Object r1 = r0.zzb()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = "GZIP"
            boolean r0 = r0.equalsIgnoreCase(r1)
            r10 = 1
            if (r3 == r0) goto L_0x0074
        L_0x0073:
            r10 = 0
        L_0x0074:
            r5 = 200(0xc8, float:2.8E-43)
            if (r4 == 0) goto L_0x0261
            boolean r0 = X.C13700nu.A0i(r16)
            if (r0 == 0) goto L_0x0399
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r10)
            int r0 = r16.size()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "Uploading batched hits. compression, count"
            r15.zzQ(r0, r3, r1)
            r14 = 0
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream
            r3.<init>()
            java.util.ArrayList r4 = X.AnonymousClass000.A0u()
            java.util.Iterator r9 = r16.iterator()
        L_0x009d:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0122
            java.lang.Object r6 = r9.next()
            com.google.android.gms.internal.gtm.zzex r6 = (com.google.android.gms.internal.gtm.zzex) r6
            X.C13710nw.A01(r6)
            int r7 = r14 + 1
            com.google.android.gms.internal.gtm.zzet r0 = com.google.android.gms.internal.gtm.zzeu.zzp
            java.lang.Object r0 = r0.zzb()
            int r1 = X.AnonymousClass000.A0D(r0)
            r0 = 0
            if (r7 > r1) goto L_0x011d
            java.lang.String r0 = r15.zza(r6, r0)
            if (r0 != 0) goto L_0x00d3
            com.google.android.gms.internal.gtm.zzfb r1 = X.C13690nt.A0P(r15)
            java.lang.String r0 = "Error formatting hit"
        L_0x00c7:
            r1.zzb(r6, r0)
        L_0x00ca:
            r0 = 1
        L_0x00cb:
            if (r0 == 0) goto L_0x0122
            long r0 = r6.zzc
            X.C13700nu.A0d(r4, r0)
            goto L_0x009d
        L_0x00d3:
            byte[] r7 = r0.getBytes()
            int r8 = r7.length
            com.google.android.gms.internal.gtm.zzet r0 = com.google.android.gms.internal.gtm.zzeu.zzy
            java.lang.Object r0 = r0.zzb()
            int r0 = X.AnonymousClass000.A0D(r0)
            if (r8 <= r0) goto L_0x00eb
            com.google.android.gms.internal.gtm.zzfb r1 = X.C13690nt.A0P(r15)
            java.lang.String r0 = "Hit size exceeds the maximum size limit"
            goto L_0x00c7
        L_0x00eb:
            int r0 = r3.size()
            if (r0 <= 0) goto L_0x00f3
            int r8 = r8 + 1
        L_0x00f3:
            int r1 = r3.size()
            int r1 = r1 + r8
            com.google.android.gms.internal.gtm.zzet r0 = com.google.android.gms.internal.gtm.zzeu.zzA
            java.lang.Object r0 = r0.zzb()
            int r0 = X.AnonymousClass000.A0D(r0)
            if (r1 > r0) goto L_0x011d
            int r0 = r3.size()     // Catch:{ IOException -> 0x0115 }
            if (r0 <= 0) goto L_0x010f
            byte[] r0 = zza     // Catch:{ IOException -> 0x0115 }
            r3.write(r0)     // Catch:{ IOException -> 0x0115 }
        L_0x010f:
            r3.write(r7)     // Catch:{ IOException -> 0x0115 }
            int r14 = r14 + 1
            goto L_0x00ca
        L_0x0115:
            r1 = move-exception
            java.lang.String r0 = "Failed to write payload when batching hits"
            r15.zzK(r0, r1)
            r0 = 1
            goto L_0x00cb
        L_0x011d:
            r0 = 0
            goto L_0x00cb
        L_0x011f:
            r4 = 0
            goto L_0x0073
        L_0x0122:
            if (r14 == 0) goto L_0x039f
            com.google.android.gms.internal.gtm.zzet r0 = com.google.android.gms.internal.gtm.zzeu.zzr
            java.lang.Object r1 = r0.zzb()
            java.lang.String r1 = (java.lang.String) r1
            com.google.android.gms.internal.gtm.zzet r0 = com.google.android.gms.internal.gtm.zzeu.zzt
            java.lang.Object r0 = r0.zzb()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = X.C13680ns.A0g(r0, r1)
            java.net.URL r9 = new java.net.URL     // Catch:{ MalformedURLException -> 0x013e }
            r9.<init>(r0)     // Catch:{ MalformedURLException -> 0x013e }
            goto L_0x0145
        L_0x013e:
            r1 = move-exception
            java.lang.String r0 = "Error trying to parse the hardcoded host url"
            r15.zzK(r0, r1)
            r9 = 0
        L_0x0145:
            if (r9 != 0) goto L_0x0151
            java.lang.String r0 = "Failed to build batching endpoint url"
            r15.zzJ(r0)
        L_0x014c:
            java.util.List r4 = java.util.Collections.emptyList()
            return r4
        L_0x0151:
            if (r10 == 0) goto L_0x020b
            byte[] r10 = r3.toByteArray()
            X.C13710nw.A01(r10)
            com.google.android.gms.internal.gtm.zzbv r0 = r15.zza     // Catch:{ IOException -> 0x01f0, all -> 0x024e }
            android.content.Context r0 = r0.zzb     // Catch:{ IOException -> 0x01f0, all -> 0x024e }
            r0.getPackageName()     // Catch:{ IOException -> 0x01f0, all -> 0x024e }
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x01f0, all -> 0x024e }
            r1.<init>()     // Catch:{ IOException -> 0x01f0, all -> 0x024e }
            java.util.zip.GZIPOutputStream r0 = new java.util.zip.GZIPOutputStream     // Catch:{ IOException -> 0x01f0, all -> 0x024e }
            r0.<init>(r1)     // Catch:{ IOException -> 0x01f0, all -> 0x024e }
            r0.write(r10)     // Catch:{ IOException -> 0x01f0, all -> 0x024e }
            r0.close()     // Catch:{ IOException -> 0x01f0, all -> 0x024e }
            r1.close()     // Catch:{ IOException -> 0x01f0, all -> 0x024e }
            byte[] r8 = r1.toByteArray()     // Catch:{ IOException -> 0x01f0, all -> 0x024e }
            java.lang.String r13 = "POST compressed size, ratio %, url"
            int r3 = r8.length     // Catch:{ IOException -> 0x01f0, all -> 0x024e }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r3)     // Catch:{ IOException -> 0x01f0, all -> 0x024e }
            long r6 = (long) r3     // Catch:{ IOException -> 0x01f0, all -> 0x024e }
            r0 = 100
            long r6 = r6 * r0
            int r12 = r10.length     // Catch:{ IOException -> 0x01f0, all -> 0x024e }
            long r0 = (long) r12     // Catch:{ IOException -> 0x01f0, all -> 0x024e }
            long r6 = r6 / r0
            java.lang.Long r0 = java.lang.Long.valueOf(r6)     // Catch:{ IOException -> 0x01f0, all -> 0x024e }
            r15.zzI(r13, r11, r0, r9)     // Catch:{ IOException -> 0x01f0, all -> 0x024e }
            if (r3 <= r12) goto L_0x0198
            java.lang.String r1 = "Compressed payload is larger then uncompressed. compressed, uncompressed"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r12)     // Catch:{ IOException -> 0x01f0, all -> 0x024e }
            r15.zzT(r1, r11, r0)     // Catch:{ IOException -> 0x01f0, all -> 0x024e }
        L_0x0198:
            com.google.android.gms.internal.gtm.zzet r0 = com.google.android.gms.internal.gtm.zzeu.zzc     // Catch:{ IOException -> 0x01f0, all -> 0x024e }
            java.lang.Object r1 = r0.zzb()     // Catch:{ IOException -> 0x01f0, all -> 0x024e }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ IOException -> 0x01f0, all -> 0x024e }
            r0 = 2
            boolean r0 = android.util.Log.isLoggable(r1, r0)     // Catch:{ IOException -> 0x01f0, all -> 0x024e }
            if (r0 == 0) goto L_0x01b7
            java.lang.String r6 = "Post payload"
            java.lang.String r1 = "\n"
            java.lang.String r0 = new java.lang.String     // Catch:{ IOException -> 0x01f0, all -> 0x024e }
            r0.<init>(r10)     // Catch:{ IOException -> 0x01f0, all -> 0x024e }
            java.lang.String r0 = X.C13680ns.A0g(r0, r1)     // Catch:{ IOException -> 0x01f0, all -> 0x024e }
            r15.zzP(r6, r0)     // Catch:{ IOException -> 0x01f0, all -> 0x024e }
        L_0x01b7:
            java.net.HttpURLConnection r6 = r15.zzb(r9)     // Catch:{ IOException -> 0x01f0, all -> 0x024e }
            r0 = 1
            r6.setDoOutput(r0)     // Catch:{ IOException -> 0x01f3, all -> 0x0249 }
            java.lang.String r1 = "Content-Encoding"
            java.lang.String r0 = "gzip"
            r6.addRequestProperty(r1, r0)     // Catch:{ IOException -> 0x01f3, all -> 0x0249 }
            r6.setFixedLengthStreamingMode(r3)     // Catch:{ IOException -> 0x01f3, all -> 0x0249 }
            r6.connect()     // Catch:{ IOException -> 0x01f3, all -> 0x0249 }
            java.io.OutputStream r3 = r6.getOutputStream()     // Catch:{ IOException -> 0x01f3, all -> 0x0249 }
            r3.write(r8)     // Catch:{ IOException -> 0x01ee }
            r3.close()     // Catch:{ IOException -> 0x01ee }
            r15.zzk(r6)     // Catch:{ IOException -> 0x01f3, all -> 0x0249 }
            int r3 = r6.getResponseCode()     // Catch:{ IOException -> 0x01f3, all -> 0x0249 }
            if (r3 != r5) goto L_0x01e4
            X.C15000qA.A01(r15)     // Catch:{ IOException -> 0x01f3, all -> 0x0249 }
            r3 = 200(0xc8, float:2.8E-43)
        L_0x01e4:
            java.lang.String r1 = "POST status"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)     // Catch:{ IOException -> 0x01f3, all -> 0x0249 }
            r15.zzG(r1, r0)     // Catch:{ IOException -> 0x01f3, all -> 0x0249 }
            goto L_0x0214
        L_0x01ee:
            r1 = move-exception
            goto L_0x01f5
        L_0x01f0:
            r1 = move-exception
            r6 = 0
            goto L_0x01f4
        L_0x01f3:
            r1 = move-exception
        L_0x01f4:
            r3 = 0
        L_0x01f5:
            java.lang.String r0 = "Network compressed POST connection error"
            r15.zzS(r0, r1)     // Catch:{ all -> 0x024c }
            if (r3 == 0) goto L_0x0204
            r3.close()     // Catch:{ IOException -> 0x0200 }
            goto L_0x0204
        L_0x0200:
            r0 = move-exception
            r15.zzK(r2, r0)
        L_0x0204:
            if (r6 == 0) goto L_0x0209
            r6.disconnect()
        L_0x0209:
            r3 = 0
            goto L_0x0217
        L_0x020b:
            byte[] r0 = r3.toByteArray()
            int r3 = r15.zzg(r9, r0)
            goto L_0x0217
        L_0x0214:
            r6.disconnect()
        L_0x0217:
            if (r3 != r5) goto L_0x0223
            java.lang.Integer r1 = java.lang.Integer.valueOf(r14)
            java.lang.String r0 = "Batched upload completed. Hits batched"
            r15.zzP(r0, r1)
            return r4
        L_0x0223:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            java.lang.String r0 = "Network error uploading hits. status code"
            r15.zzP(r0, r1)
            com.google.android.gms.internal.gtm.zzbv r0 = r15.zza
            com.google.android.gms.internal.gtm.zzct r0 = r0.zze
            java.util.Set r0 = r0.zza()
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x014c
            java.lang.String r0 = "Server instructed the client to stop batching"
            r15.zzR(r0)
            com.google.android.gms.internal.gtm.zzfo r2 = r15.zzc
            long r0 = android.os.SystemClock.elapsedRealtime()
            r2.zzb = r0
            goto L_0x014c
        L_0x0249:
            r1 = move-exception
            r3 = 0
            goto L_0x0251
        L_0x024c:
            r1 = move-exception
            goto L_0x0251
        L_0x024e:
            r1 = move-exception
            r3 = 0
            r6 = 0
        L_0x0251:
            if (r3 == 0) goto L_0x025b
            r3.close()     // Catch:{ IOException -> 0x0257 }
            goto L_0x025b
        L_0x0257:
            r0 = move-exception
            r15.zzK(r2, r0)
        L_0x025b:
            if (r6 == 0) goto L_0x0260
            r6.disconnect()
        L_0x0260:
            throw r1
        L_0x0261:
            java.util.ArrayList r4 = X.AnonymousClass000.A0w(r16)
            java.util.Iterator r10 = r16.iterator()
        L_0x0269:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x039f
            java.lang.Object r6 = r10.next()
            com.google.android.gms.internal.gtm.zzex r6 = (com.google.android.gms.internal.gtm.zzex) r6
            X.C13710nw.A01(r6)
            boolean r0 = r6.zzf
            r0 = r0 ^ 1
            java.lang.String r8 = r15.zza(r6, r0)
            if (r8 != 0) goto L_0x02a1
            com.google.android.gms.internal.gtm.zzfb r1 = X.C13690nt.A0P(r15)
            java.lang.String r0 = "Error formatting hit for upload"
        L_0x0288:
            r1.zzb(r6, r0)
        L_0x028b:
            long r0 = r6.zzc
            X.C13700nu.A0d(r4, r0)
            int r1 = r4.size()
            com.google.android.gms.internal.gtm.zzet r0 = com.google.android.gms.internal.gtm.zzeu.zzo
            java.lang.Object r0 = r0.zzb()
            int r0 = X.AnonymousClass000.A0D(r0)
            if (r1 < r0) goto L_0x0269
            return r4
        L_0x02a1:
            int r9 = r8.length()
            com.google.android.gms.internal.gtm.zzet r0 = com.google.android.gms.internal.gtm.zzeu.zzu
            java.lang.Object r0 = r0.zzb()
            int r0 = X.AnonymousClass000.A0D(r0)
            if (r9 > r0) goto L_0x031f
            boolean r0 = r6.zzf
            java.lang.String r7 = "?"
            if (r0 == 0) goto L_0x02df
            com.google.android.gms.internal.gtm.zzet r0 = com.google.android.gms.internal.gtm.zzeu.zzr
        L_0x02b9:
            java.lang.Object r3 = r0.zzb()
            java.lang.String r3 = (java.lang.String) r3
            com.google.android.gms.internal.gtm.zzet r0 = com.google.android.gms.internal.gtm.zzeu.zzs
            java.lang.Object r2 = r0.zzb()
            java.lang.String r2 = (java.lang.String) r2
            int r0 = r3.length()
            int r1 = r2.length()
            int r0 = r0 + 1
            int r0 = r0 + r1
            int r0 = r0 + r9
            java.lang.StringBuilder r0 = X.C13690nt.A0g(r0)
            X.C13680ns.A1Y(r3, r2, r7, r0)
            java.lang.String r0 = X.AnonymousClass000.A0h(r8, r0)
            goto L_0x02e2
        L_0x02df:
            com.google.android.gms.internal.gtm.zzet r0 = com.google.android.gms.internal.gtm.zzeu.zzq
            goto L_0x02b9
        L_0x02e2:
            java.net.URL r1 = new java.net.URL     // Catch:{ MalformedURLException -> 0x02e8 }
            r1.<init>(r0)     // Catch:{ MalformedURLException -> 0x02e8 }
            goto L_0x02ef
        L_0x02e8:
            r1 = move-exception
            java.lang.String r0 = "Error trying to parse the hardcoded host url"
            r15.zzK(r0, r1)
            r1 = 0
        L_0x02ef:
            if (r1 != 0) goto L_0x02f5
            java.lang.String r0 = "Failed to build collect GET endpoint url"
            goto L_0x0374
        L_0x02f5:
            java.lang.String r0 = "GET request"
            r15.zzG(r0, r1)
            java.net.HttpURLConnection r3 = r15.zzb(r1)     // Catch:{ IOException -> 0x0385, all -> 0x0382 }
            r3.connect()     // Catch:{ IOException -> 0x0380 }
            r15.zzk(r3)     // Catch:{ IOException -> 0x0380 }
            int r2 = r3.getResponseCode()     // Catch:{ IOException -> 0x0380 }
            if (r2 != r5) goto L_0x030f
            X.C15000qA.A01(r15)     // Catch:{ IOException -> 0x0380 }
            r2 = 200(0xc8, float:2.8E-43)
        L_0x030f:
            java.lang.String r1 = "GET status"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)     // Catch:{ IOException -> 0x0380 }
            r15.zzG(r1, r0)     // Catch:{ IOException -> 0x0380 }
            r3.disconnect()
            if (r2 != r5) goto L_0x039f
            goto L_0x028b
        L_0x031f:
            r0 = 0
            java.lang.String r0 = r15.zza(r6, r0)
            if (r0 != 0) goto L_0x032e
            com.google.android.gms.internal.gtm.zzfb r1 = X.C13690nt.A0P(r15)
            java.lang.String r0 = "Error formatting hit for POST upload"
            goto L_0x0288
        L_0x032e:
            byte[] r2 = r0.getBytes()
            int r1 = r2.length
            com.google.android.gms.internal.gtm.zzet r0 = com.google.android.gms.internal.gtm.zzeu.zzz
            java.lang.Object r0 = r0.zzb()
            int r0 = X.AnonymousClass000.A0D(r0)
            if (r1 <= r0) goto L_0x0347
            com.google.android.gms.internal.gtm.zzfb r1 = X.C13690nt.A0P(r15)
            java.lang.String r0 = "Hit payload exceeds size limit"
            goto L_0x0288
        L_0x0347:
            boolean r0 = r6.zzf
            if (r0 == 0) goto L_0x0360
            com.google.android.gms.internal.gtm.zzet r0 = com.google.android.gms.internal.gtm.zzeu.zzr
        L_0x034d:
            java.lang.Object r1 = r0.zzb()
            java.lang.String r1 = (java.lang.String) r1
            com.google.android.gms.internal.gtm.zzet r0 = com.google.android.gms.internal.gtm.zzeu.zzs
            java.lang.Object r0 = r0.zzb()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = X.C13680ns.A0g(r0, r1)
            goto L_0x0363
        L_0x0360:
            com.google.android.gms.internal.gtm.zzet r0 = com.google.android.gms.internal.gtm.zzeu.zzq
            goto L_0x034d
        L_0x0363:
            java.net.URL r0 = new java.net.URL     // Catch:{ MalformedURLException -> 0x0369 }
            r0.<init>(r1)     // Catch:{ MalformedURLException -> 0x0369 }
            goto L_0x0370
        L_0x0369:
            r1 = move-exception
            java.lang.String r0 = "Error trying to parse the hardcoded host url"
            r15.zzK(r0, r1)
            r0 = 0
        L_0x0370:
            if (r0 != 0) goto L_0x0378
            java.lang.String r0 = "Failed to build collect POST endpoint url"
        L_0x0374:
            r15.zzJ(r0)
            return r4
        L_0x0378:
            int r0 = r15.zzg(r0, r2)
            if (r0 != r5) goto L_0x039f
            goto L_0x028b
        L_0x0380:
            r1 = move-exception
            goto L_0x0387
        L_0x0382:
            r0 = move-exception
            r3 = 0
            goto L_0x0393
        L_0x0385:
            r1 = move-exception
            r3 = 0
        L_0x0387:
            java.lang.String r0 = "Network GET connection error"
            r15.zzS(r0, r1)     // Catch:{ all -> 0x0392 }
            if (r3 == 0) goto L_0x039f
            r3.disconnect()
            return r4
        L_0x0392:
            r0 = move-exception
        L_0x0393:
            if (r3 == 0) goto L_0x039e
            r3.disconnect()
            throw r0
        L_0x0399:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
        L_0x039e:
            throw r0
        L_0x039f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzfe.zzc(java.util.List):java.util.List");
    }

    public final void zzd() {
        zzP("Network initialized. User agent", this.zzb);
    }

    public final boolean zze() {
        C15000qA.A00();
        zzW();
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.zza.zzb.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                return true;
            }
        } catch (SecurityException unused) {
        }
        zzO("No network connectivity");
        return false;
    }
}
