package X;

import android.net.TrafficStats;
import android.text.TextUtils;
import com.mod2.fblibs.Facebook;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import java.util.zip.InflaterInputStream;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONObject;

/* renamed from: X.1Kf  reason: invalid class name and case insensitive filesystem */
public class C25551Kf {
    public final C17130ua A00;
    public final C18260wP A01;
    public final C16440t3 A02;
    public final C25561Kg A03;
    public final C17670vS A04;
    public final C17660vR A05;
    public final C16320sq A06;

    public C25551Kf(C17130ua r1, C18260wP r2, C16440t3 r3, C25561Kg r4, C17670vS r5, C17660vR r6, C16320sq r7) {
        this.A02 = r3;
        this.A06 = r7;
        this.A05 = r6;
        this.A00 = r1;
        this.A04 = r5;
        this.A03 = r4;
        this.A01 = r2;
    }

    public C83744Hw A00(C16650tP r13, String str, String str2, String str3, JSONObject jSONObject, int i2, int i3) {
        InputStream inflaterInputStream;
        int i4;
        JSONObject jSONObject2 = null;
        if (!this.A01.A0A()) {
            i4 = -1;
        } else {
            TrafficStats.setThreadStatsTag(i2);
            if (!str2.startsWith("https://")) {
                StringBuilder sb = new StringBuilder();
                sb.append("https://");
                sb.append(str2);
                str2 = sb.toString();
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            sb2.append(str3);
            sb2.append(str);
            sb2.append("?");
            sb2.append(Facebook.TOKEN);
            sb2.append("=");
            sb2.append(AnonymousClass021.A09);
            sb2.append("|");
            sb2.append(AnonymousClass021.A0K);
            URL url = new URL(sb2.toString());
            URLConnection openConnection = url.openConnection();
            if (openConnection instanceof HttpsURLConnection) {
                HttpsURLConnection httpsURLConnection = (HttpsURLConnection) openConnection;
                httpsURLConnection.setSSLSocketFactory(this.A04.A00());
                httpsURLConnection.setRequestMethod("POST");
                httpsURLConnection.setConnectTimeout(15000);
                httpsURLConnection.setReadTimeout(30000);
                httpsURLConnection.setUseCaches(false);
                httpsURLConnection.setDoInput(true);
                httpsURLConnection.setDoOutput(true);
                httpsURLConnection.setRequestProperty("Content-Type", A01("Content-Type"));
                httpsURLConnection.setRequestProperty("Accept-Encoding", A01("Accept-Encoding"));
                httpsURLConnection.setRequestProperty("User-Agent", A01("User-Agent"));
                C17130ua r5 = this.A00;
                Integer valueOf = Integer.valueOf(i3);
                C37811pm r2 = new C37811pm(r5, httpsURLConnection.getOutputStream(), (Integer) null, valueOf);
                String obj = jSONObject.toString();
                if (TextUtils.isEmpty(obj)) {
                    i4 = 3;
                } else {
                    r2.write(obj.getBytes(AnonymousClass01S.A08));
                    r2.flush();
                    long currentTimeMillis = System.currentTimeMillis();
                    httpsURLConnection.connect();
                    int responseCode = httpsURLConnection.getResponseCode();
                    httpsURLConnection.getResponseMessage();
                    Integer valueOf2 = Integer.valueOf(responseCode);
                    Long valueOf3 = Long.valueOf(System.currentTimeMillis() - currentTimeMillis);
                    if (!(r13 instanceof AnonymousClass32K)) {
                        C25531Kd r8 = ((AnonymousClass32L) r13).A01;
                        C75393s5 r22 = new C75393s5();
                        r22.A03 = r8.A00;
                        r22.A04 = "HttpsUrlConnection";
                        r22.A02 = 0L;
                        r22.A00 = valueOf3;
                        r22.A05 = str;
                        if (valueOf2 != null) {
                            r22.A01 = Long.valueOf((long) responseCode);
                        }
                        r8.A02.A06(r22);
                    }
                    if (responseCode / 100 == 2) {
                        String contentEncoding = httpsURLConnection.getContentEncoding();
                        InputStream r1 = new C38271qW(r5, httpsURLConnection.getInputStream(), (Integer) null, valueOf);
                        if ("gzip".equalsIgnoreCase(contentEncoding)) {
                            inflaterInputStream = new GZIPInputStream(r1);
                        } else {
                            if ("deflate".equalsIgnoreCase(contentEncoding)) {
                                inflaterInputStream = new InflaterInputStream(r1);
                            }
                            jSONObject2 = C30311c8.A03(r1);
                        }
                        r1 = inflaterInputStream;
                        jSONObject2 = C30311c8.A03(r1);
                    }
                    httpsURLConnection.disconnect();
                    return new C83744Hw(jSONObject2, responseCode);
                }
            } else {
                StringBuilder sb3 = new StringBuilder("Failed to create a HTTPS connection with ");
                sb3.append(url.toString());
                throw new IOException(sb3.toString());
            }
        }
        return new C83744Hw((JSONObject) null, i4);
    }

    public final String A01(String str) {
        String str2;
        switch (str.hashCode()) {
            case -1844712829:
                if (str.equals("User-Agent")) {
                    C17660vR r1 = this.A05;
                    synchronized (r1) {
                        str2 = r1.A02;
                        if (str2 == null) {
                            str2 = r1.A02((Map) null);
                            r1.A02 = str2;
                        }
                    }
                    return str2;
                }
                break;
            case -1099743112:
                if (str.equals("Accept-Encoding")) {
                    return "gzip";
                }
                break;
            case 949037134:
                if (str.equals("Content-Type")) {
                    return "application/json";
                }
                break;
        }
        StringBuilder sb = new StringBuilder("GraphApiProviderImpl/getResponseFamily unsupported header name: ");
        sb.append(str);
        Log.e(sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append("GraphApiProviderImpl/getResponseFamily unsupported header name: ");
        sb2.append(str);
        throw new IllegalStateException(sb2.toString());
    }
}
