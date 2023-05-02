package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.Patterns;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.mod2.fblibs.FacebookFacade;
import com.whatsapp.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.1ZR  reason: invalid class name */
public class AnonymousClass1ZR implements C17810vg {
    public static final Set A0X = new HashSet(Arrays.asList(new String[]{"og:image", "og:image:type", "og:video", "og:video:type", "og:video:url", "og:video:secure_url", "og:video:width", "og:video:height", "image", "og:thumbnail", "thumbnail", "twitter:image", "og:title", "title", "twitter:title", "og:description", FacebookFacade.RequestParameter.DESCRIPTION, "twitter:description", "og:url", "og:site_name", "twitter:url", "invite_link_type_v2", "parent_group_subject", "wa:artist", "wa:song", "wa:song:url", "wa:author:name", "wa:author:url", "wa:author:profile_image", "wa:post:caption", "wa:landing:page", "wa:landing:label"}));
    public static final Pattern A0Y = Pattern.compile("(?i)\\bcharset=\\s*\"?([^\\s;\"]*)", 34);
    public static final Pattern A0Z = Pattern.compile("<head[^>]*>(.*)</head>", 34);
    public static final Pattern A0a = Pattern.compile("\\s*([^=]+)\\s*=\\s*(?:\"([^\"]+)\"|\\'([^\\']+)\\')", 34);
    public static final Pattern A0b = Pattern.compile("<link([^>]+?)/?>", 34);
    public static final Pattern A0c = Pattern.compile("<meta([^>]+?)/?>", 34);
    public static final Pattern A0d = Pattern.compile("<title[^>]*>(.*)</title>", 34);
    public static final Pattern A0e = Pattern.compile("https://(www\\.)?pbs\\.twimg\\.com/profile_images", 2);
    public static final Pattern A0f = Pattern.compile("https://(www\\.)?pbs\\.twimg\\.com", 2);
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public long A05;
    public long A06;
    public Bitmap A07;
    public Bitmap A08;
    public C55642k5 A09;
    public C76703uY A0A;
    public Integer A0B = null;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F = null;
    public String A0G;
    public String A0H;
    public String A0I;
    public String A0J;
    public String A0K;
    public URL A0L;
    public URL A0M;
    public URL A0N;
    public URL A0O;
    public LinkedHashSet A0P = new LinkedHashSet();
    public boolean A0Q;
    public boolean A0R;
    public byte[] A0S;
    public byte[] A0T;
    public byte[] A0U;
    public final C17130ua A0V;
    public final String A0W;

    public AnonymousClass1ZR(C17130ua r2, String str) {
        this.A0W = str;
        this.A0V = r2;
    }

    public static String A00(HashMap hashMap, String... strArr) {
        for (String str : strArr) {
            String str2 = (String) hashMap.get(str);
            if (str2 != null) {
                return str2.trim();
            }
        }
        return null;
    }

    public static final URL A01(HashMap hashMap, String... strArr) {
        try {
            String A002 = A00(hashMap, strArr);
            if (A002 != null) {
                return new URL(A002);
            }
            return null;
        } catch (MalformedURLException e2) {
            StringBuilder sb = new StringBuilder("WebPageInfo/");
            sb.append(strArr);
            sb.append("  Bad URL");
            Log.w(sb.toString(), e2);
            return null;
        }
    }

    public static HashMap A02(String str) {
        HashMap hashMap = new HashMap();
        Matcher matcher = A0a.matcher(str);
        while (matcher.find()) {
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            if (group2 == null) {
                group2 = matcher.group(3);
            }
            hashMap.put(group, group2);
        }
        return hashMap;
    }

    public Bitmap A03() {
        if (this.A0U == null) {
            return null;
        }
        Bitmap bitmap = this.A08;
        if (bitmap != null) {
            return bitmap;
        }
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inDither = true;
            options.inPreferredConfig = Bitmap.Config.RGB_565;
            byte[] bArr = this.A0U;
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            this.A08 = decodeByteArray;
            return decodeByteArray;
        } catch (OutOfMemoryError unused) {
            return null;
        }
    }

    public final C55642k5 A04(String str, String str2, int i2) {
        if (!"image/gif".equals(str2) || i2 == -1) {
            return null;
        }
        if (str.endsWith("giphy.gif")) {
            try {
                if (new URI(str).getHost().contains("giphy.com")) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str.substring(0, str.length() - 9));
                    sb.append("200.mp4");
                    str = sb.toString();
                    HttpURLConnection httpURLConnection = null;
                    try {
                        httpURLConnection = A07((String) null, new URL(str));
                        if (httpURLConnection != null) {
                            String headerField = httpURLConnection.getHeaderField("Content-Type");
                            if (headerField.equals("video/mp4")) {
                                C55642k5 r3 = new C55642k5(str, headerField, httpURLConnection.getContentLength());
                                A0E(httpURLConnection);
                                return r3;
                            }
                        }
                    } catch (IOException e2) {
                        Log.w("WebPageInfo/checkForMp4 Cannot connect.", e2);
                    } catch (Throwable th) {
                        A0E((HttpURLConnection) null);
                        throw th;
                    }
                    A0E(httpURLConnection);
                }
            } catch (URISyntaxException e3) {
                Log.w("WebPageInfo/getGifInfo Cannot connect.", e3);
            }
        }
        return new C55642k5(str, str2, i2);
    }

    public final C55642k5 A05(Map map, String... strArr) {
        HttpURLConnection httpURLConnection;
        HttpURLConnection httpURLConnection2 = null;
        for (String str : strArr) {
            String str2 = (String) map.get(str);
            if (str2 != null && Patterns.WEB_URL.matcher(str2).matches()) {
                try {
                    httpURLConnection = A07((String) null, new URL(str2));
                    if (httpURLConnection != null) {
                        try {
                            C55642k5 A042 = A04(str2, httpURLConnection.getHeaderField("Content-Type"), httpURLConnection.getContentLength());
                            if (A042 != null) {
                                A0E(httpURLConnection);
                                return A042;
                            }
                        } catch (IOException e2) {
                            e = e2;
                            try {
                                Log.w("WebPageInfo/getGifOnPage Cannot connect.", e);
                                A0E(httpURLConnection);
                            } catch (Throwable th) {
                                th = th;
                                httpURLConnection2 = httpURLConnection;
                                A0E(httpURLConnection2);
                                throw th;
                            }
                        }
                    }
                } catch (IOException e3) {
                    e = e3;
                    httpURLConnection = null;
                    Log.w("WebPageInfo/getGifOnPage Cannot connect.", e);
                    A0E(httpURLConnection);
                } catch (Throwable th2) {
                    th = th2;
                    A0E(httpURLConnection2);
                    throw th;
                }
                A0E(httpURLConnection);
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0232, code lost:
        if ("video/mp4".equalsIgnoreCase((java.lang.String) r3.get("og:video:type")) == false) goto L_0x0234;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String A06(java.lang.String r18, java.lang.String r19, java.lang.String r20, java.net.URL r21, int r22) {
        /*
            r17 = this;
            r4 = r18
            java.util.regex.Pattern r0 = A0Z
            java.util.regex.Matcher r1 = r0.matcher(r4)
            boolean r0 = r1.find()
            r5 = 1
            if (r0 == 0) goto L_0x0013
            java.lang.String r4 = r1.group(r5)
        L_0x0013:
            r2 = 0
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.util.regex.Pattern r0 = A0c
            java.util.regex.Matcher r6 = r0.matcher(r4)
        L_0x001f:
            boolean r0 = r6.find()
            r1 = r17
            if (r0 == 0) goto L_0x00ea
            java.lang.String r0 = r6.group(r5)
            java.util.HashMap r8 = A02(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r19)
            java.lang.String r7 = "content"
            if (r0 == 0) goto L_0x00a3
            java.lang.String r0 = "charset"
            java.lang.Object r9 = r8.get(r0)
            java.lang.String r9 = (java.lang.String) r9
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 != 0) goto L_0x0057
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 != 0) goto L_0x00a2
            java.lang.String r0 = X.AnonymousClass01S.A08
            boolean r0 = r0.equalsIgnoreCase(r9)
            if (r0 != 0) goto L_0x00a2
            r1.A0A()
            return r9
        L_0x0057:
            java.lang.String r0 = "http-equiv"
            java.lang.Object r9 = r8.get(r0)
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r0 = "Content-Type"
            boolean r0 = r0.equalsIgnoreCase(r9)
            if (r0 == 0) goto L_0x00a3
            java.lang.Object r9 = r8.get(r7)
            java.lang.String r9 = (java.lang.String) r9
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 != 0) goto L_0x00a3
            java.util.regex.Pattern r0 = A0Y
            java.util.regex.Matcher r9 = r0.matcher(r9)
            boolean r0 = r9.find()
            if (r0 == 0) goto L_0x00a3
            java.lang.String r0 = r9.group(r5)
            X.AnonymousClass00B.A06(r0)
            java.lang.String r2 = r0.trim()
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r2 = r2.toUpperCase(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x00a3
            java.lang.String r0 = X.AnonymousClass01S.A08
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 != 0) goto L_0x00a3
            r1.A0A()
            return r2
        L_0x00a2:
            r2 = r9
        L_0x00a3:
            java.lang.String r0 = "property"
            java.lang.Object r1 = r8.get(r0)
            java.lang.String r1 = (java.lang.String) r1
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L_0x00c7
            java.lang.String r0 = "name"
            java.lang.Object r1 = r8.get(r0)
            java.lang.String r1 = (java.lang.String) r1
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L_0x00c7
            java.lang.String r0 = "itemprop"
            java.lang.Object r1 = r8.get(r0)
            java.lang.String r1 = (java.lang.String) r1
        L_0x00c7:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x001f
            java.util.Set r0 = A0X
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x001f
            java.lang.Object r0 = r8.get(r7)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x001f
            android.text.Spanned r0 = android.text.Html.fromHtml(r0)
            java.lang.String r0 = r0.toString()
            r3.put(r1, r0)
            goto L_0x001f
        L_0x00ea:
            java.lang.String r0 = r21.toString()
            r7 = r20
            r6 = r22
            X.2k5 r8 = r1.A04(r0, r7, r6)
            if (r8 != 0) goto L_0x0128
            r0 = 3
            java.lang.String[] r8 = new java.lang.String[r0]
            java.lang.String r0 = "og:url"
            r7 = 0
            r8[r7] = r0
            java.lang.String r0 = "twitter:url"
            r8[r5] = r0
            r6 = 2
            java.lang.String r0 = "og:video"
            r8[r6] = r0
            X.2k5 r8 = r1.A05(r3, r8)
            if (r8 != 0) goto L_0x0128
            java.lang.String r0 = "og:image:type"
            java.lang.Object r6 = r3.get(r0)
            java.lang.String r0 = "image/gif"
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L_0x0128
            java.lang.String[] r6 = new java.lang.String[r5]
            java.lang.String r0 = "og:image"
            r6[r7] = r0
            X.2k5 r8 = r1.A05(r3, r6)
        L_0x0128:
            r1.A09 = r8
            r9 = 5
            java.lang.String[] r8 = new java.lang.String[r9]
            r6 = 0
            java.lang.String r0 = "og:image"
            r8[r6] = r0
            java.lang.String r0 = "twitter:image"
            r8[r5] = r0
            r6 = 2
            java.lang.String r0 = "image"
            r8[r6] = r0
            r6 = 3
            java.lang.String r0 = "og:thumbnail"
            r8[r6] = r0
            r6 = 4
            java.lang.String r0 = "thumbnail"
            r8[r6] = r0
            java.util.LinkedHashSet r7 = new java.util.LinkedHashSet
            r7.<init>()
            r6 = 0
        L_0x014d:
            if (r6 >= r9) goto L_0x0163
            r0 = r8[r6]
            java.lang.Object r0 = r3.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x0160
            java.lang.String r0 = r0.trim()
            r7.add(r0)
        L_0x0160:
            int r6 = r6 + 1
            goto L_0x014d
        L_0x0163:
            r1.A0P = r7
            java.lang.String[] r6 = new java.lang.String[r5]
            java.lang.String r0 = "wa:artist"
            r13 = 0
            r6[r13] = r0
            java.lang.String r0 = A00(r3, r6)
            r1.A0I = r0
            java.lang.String[] r6 = new java.lang.String[r5]
            java.lang.String r0 = "wa:song"
            r6[r13] = r0
            java.lang.String r0 = A00(r3, r6)
            r1.A0J = r0
            java.lang.String[] r6 = new java.lang.String[r5]
            java.lang.String r0 = "wa:song:url"
            r6[r13] = r0
            java.net.URL r0 = A01(r3, r6)
            r1.A0O = r0
            java.lang.String[] r6 = new java.lang.String[r5]
            java.lang.String r0 = "wa:author:name"
            r6[r13] = r0
            java.lang.String r0 = A00(r3, r6)
            r1.A0C = r0
            java.lang.String[] r6 = new java.lang.String[r5]
            java.lang.String r0 = "wa:post:caption"
            r6[r13] = r0
            java.lang.String r0 = A00(r3, r6)
            r1.A0G = r0
            java.lang.String[] r6 = new java.lang.String[r5]
            java.lang.String r0 = "wa:author:url"
            r6[r13] = r0
            java.net.URL r0 = A01(r3, r6)
            r1.A0M = r0
            java.lang.String[] r6 = new java.lang.String[r5]
            java.lang.String r0 = "wa:author:profile_image"
            r6[r13] = r0
            java.net.URL r0 = A01(r3, r6)
            r1.A0L = r0
            java.lang.String[] r6 = new java.lang.String[r5]
            java.lang.String r0 = "wa:landing:page"
            r6[r13] = r0
            java.net.URL r0 = A01(r3, r6)
            r1.A0N = r0
            java.lang.String[] r6 = new java.lang.String[r5]
            java.lang.String r0 = "wa:landing:label"
            r6[r13] = r0
            java.lang.String r0 = A00(r3, r6)
            r1.A0E = r0
            r10 = 3
            java.lang.String[] r8 = new java.lang.String[r10]
            java.lang.String r0 = "og:title"
            r7 = 0
            r8[r13] = r0
            java.lang.String r0 = "twitter:title"
            r8[r5] = r0
            java.lang.String r0 = "title"
            r6 = 2
            r8[r6] = r0
            java.lang.String r0 = A00(r3, r8)
            r1.A0K = r0
            java.lang.String[] r8 = new java.lang.String[r10]
            java.lang.String r0 = "og:description"
            r8[r13] = r0
            java.lang.String r0 = "twitter:description"
            r8[r5] = r0
            java.lang.String r0 = "description"
            r8[r6] = r0
            java.lang.String r0 = A00(r3, r8)
            r1.A0H = r0
            java.lang.String[] r8 = new java.lang.String[r6]
            java.lang.String r0 = "og:url"
            r8[r13] = r0
            java.lang.String r0 = "twitter:url"
            r8[r5] = r0
            java.lang.String r0 = A00(r3, r8)
            r1.A0D = r0
            java.lang.String r9 = "og:video"
            boolean r0 = r3.containsKey(r9)
            java.lang.String r8 = "og:video:type"
            if (r0 == 0) goto L_0x0234
            java.lang.Object r11 = r3.get(r8)
            java.lang.String r11 = (java.lang.String) r11
            java.lang.String r0 = "video/mp4"
            boolean r11 = r0.equalsIgnoreCase(r11)
            r0 = 1
            if (r11 != 0) goto L_0x0235
        L_0x0234:
            r0 = 0
        L_0x0235:
            r1.A0Q = r0
            if (r0 == 0) goto L_0x026d
            java.lang.String r0 = "og:site_name"
            java.lang.Object r11 = r3.get(r0)
            java.lang.String r11 = (java.lang.String) r11
            java.lang.String r0 = "Facebook Watch"
            boolean r0 = r0.equalsIgnoreCase(r11)
            if (r0 == 0) goto L_0x026d
            java.lang.String r0 = r1.A0D
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x026d
            java.lang.String r0 = r1.A0D
            android.net.Uri r0 = android.net.Uri.parse(r0)
            android.net.Uri$Builder r12 = r0.buildUpon()
            java.lang.String r11 = "fw"
            java.lang.String r0 = "1"
            android.net.Uri$Builder r0 = r12.appendQueryParameter(r11, r0)
            android.net.Uri r0 = r0.build()
            java.lang.String r0 = r0.toString()
            r1.A0D = r0
        L_0x026d:
            java.lang.String r0 = r1.A0D
            if (r0 != 0) goto L_0x0275
            java.lang.String r0 = r21.toString()
        L_0x0275:
            int r0 = X.C42181xM.A01(r0)
            r1.A03 = r0
            java.lang.String[] r0 = new java.lang.String[r10]
            r0[r13] = r9
            java.lang.String r13 = "og:video:url"
            r0[r5] = r13
            java.lang.String r12 = "og:video:secure_url"
            r0[r6] = r12
            java.lang.String r11 = A00(r3, r0)
            int r10 = r1.A03
            java.lang.Object r8 = r3.get(r8)
            java.lang.String r8 = (java.lang.String) r8
            if (r10 == 0) goto L_0x0388
            r0 = 4
            if (r10 == r0) goto L_0x0383
            java.lang.String r0 = "video/mp4"
        L_0x029b:
            boolean r10 = r0.equalsIgnoreCase(r8)
        L_0x029f:
            int r8 = r1.A03
            if (r11 == 0) goto L_0x037f
            if (r8 == 0) goto L_0x037f
            java.lang.String r0 = r21.toString()
            boolean r0 = android.webkit.URLUtil.isHttpsUrl(r0)
            if (r0 == 0) goto L_0x037f
            r0 = 4
            if (r8 != r0) goto L_0x02ba
            java.lang.String r0 = "embed"
            boolean r0 = r11.contains(r0)
            if (r0 == 0) goto L_0x037f
        L_0x02ba:
            if (r10 == 0) goto L_0x037f
            r1.A02 = r5
        L_0x02be:
            boolean r0 = r1.A0Q
            if (r0 == 0) goto L_0x0304
            int r8 = r1.A03
            if (r8 == 0) goto L_0x0304
            r0 = 4
            if (r8 == r0) goto L_0x0304
            r0 = 3
            java.lang.String[] r0 = new java.lang.String[r0]
            r0[r7] = r9
            r0[r5] = r13
            r0[r6] = r12
            java.lang.String r11 = A00(r3, r0)
            if (r11 == 0) goto L_0x037d
            java.lang.String r0 = "og:video:width"
            java.lang.Object r10 = r3.get(r0)
            java.lang.String r10 = (java.lang.String) r10
            java.lang.String r0 = "og:video:height"
            java.lang.Object r8 = r3.get(r0)
            java.lang.String r8 = (java.lang.String) r8
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            r9 = -1
            if (r0 != 0) goto L_0x037b
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 != 0) goto L_0x037b
            int r9 = java.lang.Integer.parseInt(r10)
            int r8 = java.lang.Integer.parseInt(r8)
        L_0x02fd:
            X.3uY r0 = new X.3uY
            r0.<init>(r9, r11, r8)
        L_0x0302:
            r1.A0A = r0
        L_0x0304:
            java.util.LinkedHashSet r0 = r1.A0P
            java.util.LinkedHashSet r8 = new java.util.LinkedHashSet
            r8.<init>(r0)
            java.util.LinkedHashSet r0 = r1.A0P
            r0.clear()
            java.util.Iterator r14 = r8.iterator()
        L_0x0314:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x038b
            java.lang.Object r10 = r14.next()
            java.lang.String r10 = (java.lang.String) r10
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 != 0) goto L_0x0375
            java.util.regex.Pattern r8 = A0f
            java.lang.String[] r0 = X.C30931dC.A03
            java.lang.String r0 = X.C30931dC.A03(r10, r0)
            java.util.regex.Matcher r0 = r8.matcher(r0)
            boolean r0 = r0.find()
            if (r0 == 0) goto L_0x0375
            java.lang.String r13 = ":large"
            boolean r0 = r10.endsWith(r13)
            r12 = 3
            java.lang.String r11 = ":thumb"
            java.lang.String r9 = ":medium"
            java.lang.String r8 = ":small"
            if (r0 == 0) goto L_0x0353
            java.lang.String[] r0 = new java.lang.String[r12]
            r0[r7] = r9
            r0[r5] = r8
            r0[r6] = r11
            r1.A0D(r10, r13, r0)
            goto L_0x0314
        L_0x0353:
            boolean r0 = r10.endsWith(r9)
            if (r0 == 0) goto L_0x0365
            java.lang.String[] r0 = new java.lang.String[r12]
            r0[r7] = r9
            r0[r5] = r8
            r0[r6] = r11
            r1.A0D(r10, r9, r0)
            goto L_0x0314
        L_0x0365:
            boolean r0 = r10.endsWith(r8)
            if (r0 == 0) goto L_0x0375
            java.lang.String[] r0 = new java.lang.String[r6]
            r0[r7] = r8
            r0[r5] = r11
            r1.A0D(r10, r8, r0)
            goto L_0x0314
        L_0x0375:
            java.util.LinkedHashSet r0 = r1.A0P
            r0.add(r10)
            goto L_0x0314
        L_0x037b:
            r8 = -1
            goto L_0x02fd
        L_0x037d:
            r0 = 0
            goto L_0x0302
        L_0x037f:
            r1.A02 = r7
            goto L_0x02be
        L_0x0383:
            java.lang.String r0 = "text/html"
            goto L_0x029b
        L_0x0388:
            r10 = 0
            goto L_0x029f
        L_0x038b:
            java.util.LinkedHashSet r0 = r1.A0P
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0459
            java.util.regex.Pattern r0 = A0b
            java.util.regex.Matcher r8 = r0.matcher(r4)
            r7 = 0
        L_0x039a:
            boolean r0 = r8.find()
            if (r0 == 0) goto L_0x03dd
            java.lang.String r0 = r8.group(r5)
            java.util.HashMap r6 = A02(r0)
            java.lang.String r0 = "rel"
            java.lang.Object r9 = r6.get(r0)
            java.lang.String r9 = (java.lang.String) r9
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 != 0) goto L_0x039a
            java.lang.String r0 = "icon"
            boolean r0 = r0.equals(r9)
            if (r0 != 0) goto L_0x03d6
            java.lang.String r0 = "image_src"
            boolean r0 = r0.equals(r9)
            if (r0 != 0) goto L_0x03d6
            java.lang.String r0 = "apple-touch-icon-precomposed"
            boolean r0 = r0.equals(r9)
            if (r0 != 0) goto L_0x03d6
            java.lang.String r0 = "apple-touch-icon"
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L_0x039a
        L_0x03d6:
            java.lang.String r0 = "href"
            java.lang.Object r7 = r6.get(r0)
            goto L_0x039a
        L_0x03dd:
            if (r7 == 0) goto L_0x03e4
            java.util.LinkedHashSet r0 = r1.A0P
            r0.add(r7)
        L_0x03e4:
            java.util.LinkedHashSet r0 = r1.A0P
            java.util.LinkedHashSet r7 = new java.util.LinkedHashSet
            r7.<init>()
            java.util.Iterator r8 = r0.iterator()
        L_0x03ef:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0457
            java.lang.Object r14 = r8.next()
            java.lang.String r14 = (java.lang.String) r14
            boolean r0 = android.text.TextUtils.isEmpty(r14)
            if (r0 != 0) goto L_0x0429
            java.lang.String r0 = "http"
            boolean r0 = r14.startsWith(r0)
            if (r0 != 0) goto L_0x0429
            java.lang.String r0 = "//"
            boolean r0 = r14.startsWith(r0)
            if (r0 == 0) goto L_0x042f
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = r21.getProtocol()
            r6.append(r0)
            java.lang.String r0 = ":"
            r6.append(r0)
            r6.append(r14)
            java.lang.String r14 = r6.toString()
        L_0x0429:
            if (r14 == 0) goto L_0x03ef
            r7.add(r14)
            goto L_0x03ef
        L_0x042f:
            java.lang.String r10 = r21.getProtocol()     // Catch:{ MalformedURLException | URISyntaxException -> 0x0450 }
            java.lang.String r11 = r21.getUserInfo()     // Catch:{ MalformedURLException | URISyntaxException -> 0x0450 }
            java.lang.String r12 = r21.getHost()     // Catch:{ MalformedURLException | URISyntaxException -> 0x0450 }
            int r13 = r21.getPort()     // Catch:{ MalformedURLException | URISyntaxException -> 0x0450 }
            r15 = 0
            java.net.URI r9 = new java.net.URI     // Catch:{ MalformedURLException | URISyntaxException -> 0x0450 }
            r16 = r15
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ MalformedURLException | URISyntaxException -> 0x0450 }
            java.net.URL r0 = r9.toURL()     // Catch:{ MalformedURLException | URISyntaxException -> 0x0450 }
            java.lang.String r14 = r0.toString()     // Catch:{ MalformedURLException | URISyntaxException -> 0x0450 }
            goto L_0x0429
        L_0x0450:
            r6 = move-exception
            java.lang.String r0 = "WebPageInfo/ensureThumbUrl Bad URL"
            com.whatsapp.util.Log.w(r0, r6)
            goto L_0x0429
        L_0x0457:
            r1.A0P = r7
        L_0x0459:
            java.lang.String r0 = r1.A0K
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x047b
            java.util.regex.Pattern r0 = A0d
            java.util.regex.Matcher r4 = r0.matcher(r4)
        L_0x0467:
            boolean r0 = r4.find()
            if (r0 == 0) goto L_0x047b
            java.lang.String r0 = r4.group(r5)
            X.AnonymousClass00B.A06(r0)
            java.lang.String r0 = r0.trim()
            r1.A0K = r0
            goto L_0x0467
        L_0x047b:
            java.lang.String r0 = r1.A0K
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x048f
            java.lang.String r0 = r1.A0K
            android.text.Spanned r0 = android.text.Html.fromHtml(r0)
            java.lang.String r0 = r0.toString()
            r1.A0K = r0
        L_0x048f:
            java.lang.String r0 = r1.A0H
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x04a3
            java.lang.String r0 = r1.A0H
            android.text.Spanned r0 = android.text.Html.fromHtml(r0)
            java.lang.String r0 = r0.toString()
            r1.A0H = r0
        L_0x04a3:
            java.lang.String r0 = r21.toString()
            boolean r0 = X.C61863As.A02(r0)
            if (r0 == 0) goto L_0x04d0
            java.lang.String r0 = "invite_link_type_v2"
            java.lang.Object r4 = r3.get(r0)
            java.lang.String r0 = "PARENT"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x04d1
            r4 = 1
        L_0x04bc:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r1.A0B = r0
            java.lang.String r0 = "parent_group_subject"
            java.lang.Object r0 = r3.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            r1.A0F = r0
            if (r0 == 0) goto L_0x04d0
            r1.A0H = r0
        L_0x04d0:
            return r2
        L_0x04d1:
            java.lang.String r0 = "SUB"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x04db
            r4 = 2
            goto L_0x04bc
        L_0x04db:
            java.lang.String r0 = "DEFAULT_SUB"
            boolean r0 = r0.equals(r4)
            r4 = 0
            if (r0 == 0) goto L_0x04bc
            r4 = 3
            goto L_0x04bc
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1ZR.A06(java.lang.String, java.lang.String, java.lang.String, java.net.URL, int):java.lang.String");
    }

    public final HttpURLConnection A07(String str, URL url) {
        URL url2;
        try {
            url2 = new URL(new URI(url.toString()).toASCIIString());
        } catch (MalformedURLException | URISyntaxException unused) {
            url2 = null;
        }
        if (url2 == null) {
            return null;
        }
        URLConnection openConnection = url2.openConnection();
        if (!(openConnection instanceof HttpURLConnection)) {
            return null;
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
        httpURLConnection.setConnectTimeout(SearchActionVerificationClientService.NOTIFICATION_ID);
        httpURLConnection.setReadTimeout(SearchActionVerificationClientService.NOTIFICATION_ID);
        if (str != null) {
            httpURLConnection.setRequestProperty("Accept-Language", str);
        }
        StringBuilder sb = new StringBuilder("OBWhatsApp/");
        sb.append("2.23.1.76".replace(' ', '_'));
        sb.append(" A");
        httpURLConnection.setRequestProperty("User-Agent", sb.toString());
        return httpURLConnection;
    }

    public void A08() {
        String str;
        StringBuilder sb = new StringBuilder(" hasOgVideo:");
        sb.append(this.A0Q);
        sb.append(10);
        sb.append("page loaded in ");
        sb.append(this.A05);
        sb.append(" ms, ");
        sb.append(this.A06);
        sb.append(" bytes");
        sb.append(10);
        long j2 = this.A04;
        if (j2 > 0) {
            Locale locale = Locale.US;
            sb.append(String.format(locale, "image loaded in %dms, image dimension %dx%d", new Object[]{Long.valueOf(j2), Integer.valueOf(this.A01), Integer.valueOf(this.A00)}));
            byte[] bArr = this.A0T;
            if (bArr != null) {
                sb.append(String.format(locale, ", small thumbnail %dbytes", new Object[]{Integer.valueOf(bArr.length)}));
            }
            byte[] bArr2 = this.A0U;
            if (bArr2 != null) {
                str = String.format(locale, ", large thumbnail %dbytes", new Object[]{Integer.valueOf(bArr2.length)});
            }
            sb.toString();
        }
        str = " image not loaded";
        sb.append(str);
        sb.toString();
    }

    public void A09() {
        Iterator it = this.A0P.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (i2 >= 2) {
                String.format(Locale.US, "WebPageInfo/loadThumbRetrySmall Remaining %d thumbnails are not loaded.", new Object[]{Integer.valueOf(this.A0P.size() - i2)});
                return;
            }
            i2++;
            try {
                A0C(str);
                return;
            } catch (AnonymousClass40B unused) {
                Log.w("WebPageInfo/loadThumbRetrySmall Cannot fetch large thumbnail");
            }
        }
    }

    public void A0A() {
        this.A0K = null;
        this.A0H = null;
        this.A0D = null;
        this.A0P.clear();
        this.A0Q = false;
        this.A02 = 0;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:75|76|77|78|79) */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01a2, code lost:
        if (r0 != 2) goto L_0x01a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:?, code lost:
        r15 = new java.lang.String(r5, X.AnonymousClass01S.A08);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:103:0x01e8 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:73:0x018e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:78:0x0193 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:80:0x0194 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:95:0x01bc */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x01f6  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x020a  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x017f A[EDGE_INSN: B:122:0x017f->B:65:0x017f ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0160 A[Catch:{ all -> 0x018a, all -> 0x018e, all -> 0x018f }] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01a1 A[Catch:{ all -> 0x021e }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0B(java.lang.String r21) {
        /*
            r20 = this;
            r14 = r20
            java.lang.String r2 = r14.A0W
            r0 = 0
            r14.A05 = r0
            long r12 = android.os.SystemClock.uptimeMillis()
            java.net.URL r1 = new java.net.URL
            r1.<init>(r2)
            java.lang.String r4 = r1.getHost()
            if (r4 == 0) goto L_0x0021
            java.lang.String r4 = java.net.IDN.toASCII(r4)     // Catch:{ IllegalArgumentException -> 0x001b }
        L_0x001b:
            java.util.Locale r0 = java.util.Locale.ENGLISH
            java.lang.String r4 = r4.toLowerCase(r0)
        L_0x0021:
            java.lang.String r2 = r1.getProtocol()
            if (r2 == 0) goto L_0x002d
            java.util.Locale r0 = java.util.Locale.ENGLISH
            java.lang.String r2 = r2.toLowerCase(r0)
        L_0x002d:
            java.net.URI r0 = r1.toURI()
            java.lang.String r3 = r0.getUserInfo()
            int r5 = r0.getPort()
            java.lang.String r6 = r0.getPath()
            java.lang.String r7 = r0.getQuery()
            java.lang.String r8 = r1.getRef()
            java.net.URI r1 = new java.net.URI
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            java.net.URL r4 = r1.toURL()
            r0 = r21
            java.net.HttpURLConnection r2 = r14.A07(r0, r4)
            r5 = 0
            if (r2 == 0) goto L_0x0223
            r0 = 1
            r2.setInstanceFollowRedirects(r0)
            r2.connect()     // Catch:{ ProtocolException -> 0x0063 }
            int r0 = r2.getResponseCode()     // Catch:{ ProtocolException -> 0x0063 }
            goto L_0x0083
        L_0x0063:
            r3 = move-exception
            java.lang.String r1 = r3.toString()
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r1 = r1.toLowerCase(r0)
            java.lang.String r0 = "too many redirects"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x0081
            java.lang.String r0 = "too many follow-up requests"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x0081
            throw r3
        L_0x0081:
            r0 = 303(0x12f, float:4.25E-43)
        L_0x0083:
            int r0 = r0 / 100
            r9 = 2
            if (r0 == r9) goto L_0x010f
            r8 = 3
            if (r0 != r8) goto L_0x01a4
            r14.A0E(r2)
            java.net.HttpURLConnection r2 = r14.A07(r5, r4)
            if (r2 == 0) goto L_0x0223
            r7 = 0
            r2.setInstanceFollowRedirects(r7)
            r2.connect()
            int r0 = r2.getResponseCode()
            java.lang.String r10 = ""
            r6 = 0
        L_0x00a2:
            int r0 = r0 / 100
            if (r0 != r8) goto L_0x01a2
            r0 = 20
            if (r6 >= r0) goto L_0x01a4
            java.lang.String r0 = "Location"
            java.lang.String r3 = r2.getHeaderField(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x01a4
            java.lang.String r0 = "Set-Cookie"
            java.lang.String r11 = r2.getHeaderField(r0)
            if (r11 == 0) goto L_0x00c9
            java.lang.String r0 = ";"
            java.lang.String[] r1 = r11.split(r0)
            int r0 = r1.length
            if (r0 <= 0) goto L_0x00c9
            r11 = r1[r7]
        L_0x00c9:
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 != 0) goto L_0x00e0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r10)
            java.lang.String r0 = "; "
            r1.append(r0)
            java.lang.String r10 = r1.toString()
        L_0x00e0:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r10)
            r0.append(r11)
            java.lang.String r10 = r0.toString()
            r14.A0E(r2)
            java.net.URL r0 = new java.net.URL
            r0.<init>(r3)
            java.net.HttpURLConnection r2 = r14.A07(r5, r0)
            if (r2 == 0) goto L_0x0223
            r2.setInstanceFollowRedirects(r7)
            java.lang.String r0 = "Cookie"
            r2.setRequestProperty(r0, r10)
            r2.connect()
            int r0 = r2.getResponseCode()
            int r6 = r6 + 1
            goto L_0x00a2
        L_0x010f:
            java.lang.String r0 = "Content-Type"
            java.lang.String r1 = r2.getHeaderField(r0)     // Catch:{ all -> 0x021e }
            if (r1 == 0) goto L_0x01a8
            java.util.regex.Pattern r0 = A0Y     // Catch:{ all -> 0x021e }
            java.util.regex.Matcher r1 = r0.matcher(r1)     // Catch:{ all -> 0x021e }
            boolean r0 = r1.find()     // Catch:{ all -> 0x021e }
            if (r0 == 0) goto L_0x01a8
            r0 = 1
            java.lang.String r0 = r1.group(r0)     // Catch:{ all -> 0x021e }
            X.AnonymousClass00B.A06(r0)     // Catch:{ all -> 0x021e }
            java.lang.String r1 = r0.trim()     // Catch:{ all -> 0x021e }
            java.util.Locale r0 = java.util.Locale.US     // Catch:{ all -> 0x021e }
            java.lang.String r16 = r1.toUpperCase(r0)     // Catch:{ all -> 0x021e }
        L_0x0135:
            java.lang.String r17 = r2.getContentType()     // Catch:{ all -> 0x021e }
            int r19 = r2.getContentLength()     // Catch:{ all -> 0x021e }
            r6 = 0
            X.0ua r3 = r14.A0V     // Catch:{ OutOfMemoryError -> 0x0194 }
            r0 = 23
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ OutOfMemoryError -> 0x0194 }
            java.io.InputStream r0 = r2.getInputStream()     // Catch:{ OutOfMemoryError -> 0x0194 }
            X.1qW r7 = new X.1qW     // Catch:{ OutOfMemoryError -> 0x0194 }
            r7.<init>(r3, r0, r5, r1)     // Catch:{ OutOfMemoryError -> 0x0194 }
            java.io.ByteArrayOutputStream r8 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x018f }
            r8.<init>()     // Catch:{ all -> 0x018f }
            r9 = 1024(0x400, float:1.435E-42)
            byte[] r5 = new byte[r9]     // Catch:{ all -> 0x018a }
            r3 = 0
        L_0x0159:
            int r1 = r7.read(r5, r6, r9)     // Catch:{ all -> 0x018a }
            r0 = -1
            if (r1 == r0) goto L_0x017f
            r8.write(r5, r6, r1)     // Catch:{ all -> 0x018a }
            int r3 = r3 + r1
            r0 = 65536(0x10000, float:9.18355E-41)
            if (r3 > r0) goto L_0x017f
            byte[] r10 = r8.toByteArray()     // Catch:{ all -> 0x018a }
            java.lang.String r0 = X.AnonymousClass01S.A08     // Catch:{ all -> 0x018a }
            java.lang.String r1 = new java.lang.String     // Catch:{ all -> 0x018a }
            r1.<init>(r10, r0)     // Catch:{ all -> 0x018a }
            java.util.regex.Pattern r0 = A0Z     // Catch:{ all -> 0x018a }
            java.util.regex.Matcher r0 = r0.matcher(r1)     // Catch:{ all -> 0x018a }
            boolean r0 = r0.find()     // Catch:{ all -> 0x018a }
            if (r0 == 0) goto L_0x0159
        L_0x017f:
            byte[] r5 = r8.toByteArray()     // Catch:{ all -> 0x018a }
            r8.close()     // Catch:{ all -> 0x018f }
            r7.close()     // Catch:{ OutOfMemoryError -> 0x0194 }
            goto L_0x019e
        L_0x018a:
            r0 = move-exception
            r8.close()     // Catch:{ all -> 0x018e }
        L_0x018e:
            throw r0     // Catch:{ all -> 0x018f }
        L_0x018f:
            r0 = move-exception
            r7.close()     // Catch:{ all -> 0x0193 }
        L_0x0193:
            throw r0     // Catch:{ OutOfMemoryError -> 0x0194 }
        L_0x0194:
            java.lang.System.gc()     // Catch:{ all -> 0x021e }
            java.lang.String r0 = "WebPageInfo/readData OutOfMemoryError"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x021e }
            byte[] r5 = new byte[r6]     // Catch:{ all -> 0x021e }
        L_0x019e:
            int r3 = r5.length     // Catch:{ all -> 0x021e }
            if (r3 == 0) goto L_0x01a4
            goto L_0x01ab
        L_0x01a2:
            if (r0 == r9) goto L_0x010f
        L_0x01a4:
            r14.A0E(r2)
            return
        L_0x01a8:
            java.lang.String r16 = ""
            goto L_0x0135
        L_0x01ab:
            boolean r0 = android.text.TextUtils.isEmpty(r16)     // Catch:{ UnsupportedEncodingException -> 0x01bc }
            if (r0 == 0) goto L_0x01b9
            java.lang.String r0 = X.AnonymousClass01S.A08     // Catch:{ UnsupportedEncodingException -> 0x01bc }
        L_0x01b3:
            java.lang.String r15 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x01bc }
            r15.<init>(r5, r0)     // Catch:{ UnsupportedEncodingException -> 0x01bc }
            goto L_0x01c3
        L_0x01b9:
            r0 = r16
            goto L_0x01b3
        L_0x01bc:
            java.lang.String r0 = X.AnonymousClass01S.A08     // Catch:{ all -> 0x021e }
            java.lang.String r15 = new java.lang.String     // Catch:{ all -> 0x021e }
            r15.<init>(r5, r0)     // Catch:{ all -> 0x021e }
        L_0x01c3:
            r18 = r4
            java.lang.String r1 = r14.A06(r15, r16, r17, r18, r19)     // Catch:{ all -> 0x021e }
            boolean r0 = android.text.TextUtils.isEmpty(r16)     // Catch:{ all -> 0x021e }
            if (r0 == 0) goto L_0x01e8
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x021e }
            if (r0 != 0) goto L_0x01e8
            java.lang.String r0 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x01e8 }
            r0.<init>(r5, r1)     // Catch:{ UnsupportedEncodingException -> 0x01e8 }
            r14.A0A()     // Catch:{ UnsupportedEncodingException -> 0x01e8 }
            r5 = r14
            r6 = r0
            r7 = r1
            r8 = r17
            r9 = r4
            r10 = r19
            r5.A06(r6, r7, r8, r9, r10)     // Catch:{ UnsupportedEncodingException -> 0x01e8 }
        L_0x01e8:
            long r0 = (long) r3     // Catch:{ all -> 0x021e }
            r14.A06 = r0     // Catch:{ all -> 0x021e }
            r14.A0E(r2)
            java.lang.String r0 = r14.A0K
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0202
            java.lang.String r0 = r14.A0K
            android.text.Spanned r0 = android.text.Html.fromHtml(r0)
            java.lang.String r0 = r0.toString()
            r14.A0K = r0
        L_0x0202:
            java.lang.String r0 = r14.A0H
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0216
            java.lang.String r0 = r14.A0H
            android.text.Spanned r0 = android.text.Html.fromHtml(r0)
            java.lang.String r0 = r0.toString()
            r14.A0H = r0
        L_0x0216:
            long r0 = android.os.SystemClock.uptimeMillis()
            long r0 = r0 - r12
            r14.A05 = r0
            return
        L_0x021e:
            r0 = move-exception
            r14.A0E(r2)
            throw r0
        L_0x0223:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1ZR.A0B(java.lang.String):void");
    }

    public void A0C(String str) {
        int min;
        int i2;
        this.A04 = 0;
        long currentTimeMillis = System.currentTimeMillis();
        byte[] A0J2 = A0J(str);
        if (A0J2 != null) {
            this.A0T = A0K(A0J2, 100, 100, 140, 140, false);
            if (TextUtils.isEmpty(str) || !A0e.matcher(C30931dC.A03(str, C30931dC.A03)).find() || this.A03 != 0) {
                int i3 = this.A01;
                int i4 = this.A00;
                if (i3 > i4) {
                    i2 = Math.min(i3, 1024);
                    min = (i4 * i2) / i3;
                } else {
                    min = Math.min(i4, 1024);
                    i2 = (min * i3) / i4;
                    if (i2 < 300) {
                        min = (i4 * 300) / i3;
                        i2 = 300;
                    }
                }
                this.A0U = A0K(A0J2, 300, 75, i2, min, true);
            }
            this.A04 = System.currentTimeMillis() - currentTimeMillis;
        }
    }

    public final void A0D(String str, String str2, String... strArr) {
        String substring = str.substring(0, str.length() - str2.length());
        for (String append : strArr) {
            LinkedHashSet linkedHashSet = this.A0P;
            StringBuilder sb = new StringBuilder();
            sb.append(substring);
            sb.append(append);
            linkedHashSet.add(sb.toString());
        }
    }

    public final void A0E(HttpURLConnection httpURLConnection) {
        if (httpURLConnection != null) {
            try {
                C30311c8.A04(new C38271qW(this.A0V, httpURLConnection.getInputStream(), (Integer) null, 23));
            } catch (IOException unused) {
            }
            httpURLConnection.disconnect();
        }
    }

    public boolean A0F() {
        boolean z2;
        boolean z3 = !TextUtils.isEmpty(this.A0K);
        boolean z4 = !TextUtils.isEmpty(this.A0H);
        C55642k5 r0 = this.A09;
        if (r0 != null) {
            String str = r0.A01;
            if ("image/gif".equals(str) || "video/mp4".equals(str)) {
                z2 = true;
                return !z3 ? true : true;
            }
        }
        z2 = false;
        return !z3 ? true : true;
    }

    public boolean A0G() {
        return false;
    }

    public byte[] A0H(Bitmap bitmap) {
        int min = Math.min(140, Math.min(bitmap.getWidth(), bitmap.getHeight()));
        int min2 = Math.min(bitmap.getWidth(), bitmap.getHeight());
        return A0I(bitmap, new Rect((bitmap.getWidth() - min2) >> 1, (bitmap.getHeight() - min2) >> 1, (bitmap.getWidth() + min2) >> 1, (bitmap.getHeight() + min2) >> 1), min, min, 80);
    }

    public final byte[] A0I(Bitmap bitmap, Rect rect, int i2, int i3, int i4) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            Bitmap.Config config = bitmap.getConfig();
            if (config == null) {
                config = Bitmap.Config.ARGB_8888;
            }
            Bitmap createBitmap = Bitmap.createBitmap(i2, i3, config);
            Canvas canvas = new Canvas(createBitmap);
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setFilterBitmap(true);
            canvas.drawColor(-1);
            canvas.drawBitmap(bitmap, rect, new Rect(0, 0, i2, i3), paint);
            if (createBitmap != null) {
                createBitmap.compress(Bitmap.CompressFormat.JPEG, i4, byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                if (!createBitmap.isRecycled()) {
                    createBitmap.recycle();
                }
                return byteArray;
            }
        } catch (OutOfMemoryError unused) {
            System.gc();
            Log.e("WebPageInfo/convertToByteArray OutOfMemoryError");
        }
        bitmap.compress(Bitmap.CompressFormat.JPEG, i4, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x0090 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] A0J(java.lang.String r12) {
        /*
            r11 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            r2 = 0
            if (r0 != 0) goto L_0x0096
            java.net.URL r1 = new java.net.URL
            r1.<init>(r12)
            java.lang.String r0 = X.AnonymousClass01S.A08
            java.lang.String r0 = java.net.URLDecoder.decode(r12, r0)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x003d
            java.lang.String r4 = r1.getProtocol()
            java.lang.String r5 = r1.getUserInfo()
            java.lang.String r6 = r1.getHost()
            int r7 = r1.getPort()
            java.lang.String r8 = r1.getPath()
            java.lang.String r9 = r1.getQuery()
            java.lang.String r10 = r1.getRef()
            java.net.URI r3 = new java.net.URI
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            java.net.URL r1 = r3.toURL()
        L_0x003d:
            java.net.HttpURLConnection r4 = r11.A07(r2, r1)
            if (r4 == 0) goto L_0x0096
            r0 = 10000(0x2710, float:1.4013E-41)
            r4.setConnectTimeout(r0)
            r0 = 20000(0x4e20, float:2.8026E-41)
            r4.setReadTimeout(r0)
            X.0ua r3 = r11.A0V
            r0 = 23
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.io.InputStream r0 = r4.getInputStream()
            X.1qW r7 = new X.1qW
            r7.<init>(r3, r0, r2, r1)
            java.io.ByteArrayOutputStream r6 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x0091 }
            r6.<init>()     // Catch:{ all -> 0x0091 }
            r5 = 1024(0x400, float:1.435E-42)
            byte[] r4 = new byte[r5]     // Catch:{ all -> 0x008c }
            r3 = 0
            r2 = 0
        L_0x0069:
            int r1 = r7.read(r4, r3, r5)     // Catch:{ all -> 0x008c }
            r0 = -1
            if (r1 != r0) goto L_0x0075
            byte[] r2 = r6.toByteArray()     // Catch:{ all -> 0x008c }
            goto L_0x007f
        L_0x0075:
            r6.write(r4, r3, r1)     // Catch:{ all -> 0x008c }
            int r2 = r2 + r1
            r0 = 307200(0x4b000, float:4.30479E-40)
            if (r2 <= r0) goto L_0x0069
            goto L_0x0086
        L_0x007f:
            r6.close()     // Catch:{ all -> 0x0091 }
            r7.close()
            return r2
        L_0x0086:
            X.40B r0 = new X.40B     // Catch:{ all -> 0x008c }
            r0.<init>()     // Catch:{ all -> 0x008c }
            throw r0     // Catch:{ all -> 0x008c }
        L_0x008c:
            r0 = move-exception
            r6.close()     // Catch:{ all -> 0x0090 }
        L_0x0090:
            throw r0     // Catch:{ all -> 0x0091 }
        L_0x0091:
            r0 = move-exception
            r7.close()     // Catch:{ all -> 0x0095 }
        L_0x0095:
            throw r0
        L_0x0096:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1ZR.A0J(java.lang.String):byte[]");
    }

    public byte[] A0K(byte[] bArr, int i2, int i3, int i4, int i5, boolean z2) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        byte[] bArr2 = bArr;
        BitmapFactory.decodeByteArray(bArr2, 0, bArr2.length, options);
        int i6 = options.outWidth;
        this.A01 = i6;
        int i7 = options.outHeight;
        this.A00 = i7;
        if (i6 < i2 || i7 < i3) {
            return null;
        }
        options.inDither = true;
        options.inScaled = false;
        options.inPreferQualityOverSpeed = true;
        if (this.A0R) {
            options.inPreferredConfig = Bitmap.Config.RGB_565;
        }
        int i8 = i4;
        int i9 = i5;
        Bitmap bitmap = C37741pe.A05((C43231zf) null, new C446825c(options, (Long) null, i8, i9, !z2), bArr2, false).A02;
        if (bitmap == null) {
            return null;
        }
        byte[] A0I2 = z2 ? A0I(bitmap, new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight()), i8, i9, 50) : A0H(bitmap);
        bitmap.recycle();
        return A0I2;
    }
}
