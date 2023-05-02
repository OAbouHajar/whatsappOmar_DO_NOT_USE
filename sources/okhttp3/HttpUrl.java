package okhttp3;

import a.a;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;
import okhttp3.internal.Util;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import okio.Buffer;
import org.apache.commons.io.IOUtils;

/* compiled from: XFMFile */
public final class HttpUrl {

    /* renamed from: j  reason: collision with root package name */
    public static final char[] f1968j = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a  reason: collision with root package name */
    public final String f1969a;

    /* renamed from: b  reason: collision with root package name */
    public final String f1970b;

    /* renamed from: c  reason: collision with root package name */
    public final String f1971c;

    /* renamed from: d  reason: collision with root package name */
    public final String f1972d;

    /* renamed from: e  reason: collision with root package name */
    public final int f1973e;

    /* renamed from: f  reason: collision with root package name */
    public final List f1974f;

    /* renamed from: g  reason: collision with root package name */
    public final List f1975g;

    /* renamed from: h  reason: collision with root package name */
    public final String f1976h;

    /* renamed from: i  reason: collision with root package name */
    public final String f1977i;

    /* compiled from: XFMFile */
    public final class Builder {

        /* renamed from: a  reason: collision with root package name */
        public String f1978a;

        /* renamed from: b  reason: collision with root package name */
        public String f1979b = "";

        /* renamed from: c  reason: collision with root package name */
        public String f1980c = "";

        /* renamed from: d  reason: collision with root package name */
        public String f1981d;

        /* renamed from: e  reason: collision with root package name */
        public int f1982e = -1;

        /* renamed from: f  reason: collision with root package name */
        public final ArrayList f1983f;

        /* renamed from: g  reason: collision with root package name */
        public ArrayList f1984g;

        /* renamed from: h  reason: collision with root package name */
        public String f1985h;

        public Builder() {
            ArrayList arrayList = new ArrayList();
            this.f1983f = arrayList;
            arrayList.add("");
        }

        public static boolean b(String str) {
            return str.equals(".") || str.equalsIgnoreCase("%2e");
        }

        public static boolean c(String str) {
            return str.equals("..") || str.equalsIgnoreCase("%2e.") || str.equalsIgnoreCase(".%2e") || str.equalsIgnoreCase("%2e%2e");
        }

        public final void a(String str, boolean z2) {
            int i2 = 0;
            do {
                int delimiterOffset = Util.delimiterOffset(str, i2, str.length(), "/\\");
                e(str, i2, delimiterOffset, delimiterOffset < str.length(), z2);
                i2 = delimiterOffset + 1;
            } while (i2 <= str.length());
        }

        public Builder addEncodedPathSegment(String str) {
            if (str != null) {
                e(str, 0, str.length(), false, true);
                return this;
            }
            throw new NullPointerException("encodedPathSegment == null");
        }

        public Builder addEncodedPathSegments(String str) {
            if (str != null) {
                a(str, true);
                return this;
            }
            throw new NullPointerException("encodedPathSegments == null");
        }

        public Builder addEncodedQueryParameter(String str, @Nullable String str2) {
            if (str != null) {
                if (this.f1984g == null) {
                    this.f1984g = new ArrayList();
                }
                this.f1984g.add(HttpUrl.b(str, " \"'<>#&=", true, false, true, true));
                this.f1984g.add(str2 != null ? HttpUrl.b(str2, " \"'<>#&=", true, false, true, true) : null);
                return this;
            }
            throw new NullPointerException("encodedName == null");
        }

        public Builder addPathSegment(String str) {
            if (str != null) {
                e(str, 0, str.length(), false, false);
                return this;
            }
            throw new NullPointerException("pathSegment == null");
        }

        public Builder addPathSegments(String str) {
            if (str != null) {
                a(str, false);
                return this;
            }
            throw new NullPointerException("pathSegments == null");
        }

        public Builder addQueryParameter(String str, @Nullable String str2) {
            if (str != null) {
                if (this.f1984g == null) {
                    this.f1984g = new ArrayList();
                }
                this.f1984g.add(HttpUrl.b(str, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, true));
                this.f1984g.add(str2 != null ? HttpUrl.b(str2, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, true) : null);
                return this;
            }
            throw new NullPointerException("name == null");
        }

        public HttpUrl build() {
            if (this.f1978a == null) {
                throw new IllegalStateException("scheme == null");
            } else if (this.f1981d != null) {
                return new HttpUrl(this);
            } else {
                throw new IllegalStateException("host == null");
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:104:0x021a, code lost:
            if (r1 <= 65535) goto L_0x0223;
         */
        /* JADX WARNING: Removed duplicated region for block: B:112:0x0246  */
        /* JADX WARNING: Removed duplicated region for block: B:115:0x025e  */
        /* JADX WARNING: Removed duplicated region for block: B:126:0x02ad  */
        /* JADX WARNING: Removed duplicated region for block: B:150:0x01eb A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x0065  */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x00b0  */
        /* JADX WARNING: Removed duplicated region for block: B:60:0x011d  */
        /* JADX WARNING: Removed duplicated region for block: B:61:0x0122  */
        /* JADX WARNING: Removed duplicated region for block: B:84:0x01cf  */
        /* JADX WARNING: Removed duplicated region for block: B:99:0x01f2  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void d(okhttp3.HttpUrl r26, java.lang.String r27) {
            /*
                r25 = this;
                r0 = r25
                r1 = r26
                r10 = r27
                int r2 = r27.length()
                r11 = 0
                int r8 = okhttp3.internal.Util.skipLeadingAsciiWhitespace(r10, r11, r2)
                int r2 = r27.length()
                int r12 = okhttp3.internal.Util.skipTrailingAsciiWhitespace(r10, r8, r2)
                int r2 = r12 - r8
                r9 = 2
                r13 = 58
                r14 = -1
                r15 = 1
                if (r2 >= r9) goto L_0x0021
                goto L_0x0062
            L_0x0021:
                char r2 = r10.charAt(r8)
                r3 = 90
                r4 = 122(0x7a, float:1.71E-43)
                r5 = 65
                r6 = 97
                if (r2 < r6) goto L_0x0031
                if (r2 <= r4) goto L_0x0036
            L_0x0031:
                if (r2 < r5) goto L_0x0062
                if (r2 <= r3) goto L_0x0036
                goto L_0x0062
            L_0x0036:
                r2 = r8
            L_0x0037:
                int r2 = r2 + r15
                if (r2 >= r12) goto L_0x0062
                char r7 = r10.charAt(r2)
                if (r7 < r6) goto L_0x0042
                if (r7 <= r4) goto L_0x005f
            L_0x0042:
                if (r7 < r5) goto L_0x0046
                if (r7 <= r3) goto L_0x005f
            L_0x0046:
                r3 = 48
                if (r7 < r3) goto L_0x004e
                r3 = 57
                if (r7 <= r3) goto L_0x005f
            L_0x004e:
                r3 = 43
                if (r7 == r3) goto L_0x005f
                r3 = 45
                if (r7 == r3) goto L_0x005f
                r3 = 46
                if (r7 != r3) goto L_0x005b
                goto L_0x005f
            L_0x005b:
                if (r7 != r13) goto L_0x0062
                r7 = r2
                goto L_0x0063
            L_0x005f:
                r3 = 90
                goto L_0x0037
            L_0x0062:
                r7 = -1
            L_0x0063:
                if (r7 == r14) goto L_0x00b0
                r3 = 1
                java.lang.String r5 = "https:"
                r6 = 0
                r16 = 6
                r2 = r27
                r4 = r8
                r15 = r7
                r7 = r16
                boolean r2 = r2.regionMatches(r3, r4, r5, r6, r7)
                if (r2 == 0) goto L_0x007e
                java.lang.String r2 = "https"
                r0.f1978a = r2
                int r8 = r8 + 6
                goto L_0x00b6
            L_0x007e:
                r3 = 1
                java.lang.String r5 = "http:"
                r6 = 0
                r7 = 5
                r2 = r27
                r4 = r8
                boolean r2 = r2.regionMatches(r3, r4, r5, r6, r7)
                if (r2 == 0) goto L_0x0093
                java.lang.String r2 = "http"
                r0.f1978a = r2
                int r8 = r8 + 5
                goto L_0x00b6
            L_0x0093:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r3 = "Expected URL scheme 'http' or 'https' but was '"
                r2.<init>(r3)
                java.lang.String r3 = r10.substring(r11, r15)
                r2.append(r3)
                java.lang.String r3 = "'"
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
            L_0x00b0:
                if (r1 == 0) goto L_0x02c8
                java.lang.String r2 = r1.f1969a
                r0.f1978a = r2
            L_0x00b6:
                r2 = r8
                r3 = 0
            L_0x00b8:
                r15 = 92
                r7 = 47
                if (r2 >= r12) goto L_0x00cb
                char r4 = r10.charAt(r2)
                if (r4 == r15) goto L_0x00c6
                if (r4 != r7) goto L_0x00cb
            L_0x00c6:
                int r3 = r3 + 1
                int r2 = r2 + 1
                goto L_0x00b8
            L_0x00cb:
                r6 = 63
                r5 = 35
                if (r3 >= r9) goto L_0x010f
                if (r1 == 0) goto L_0x010f
                java.lang.String r2 = r1.f1969a
                java.lang.String r4 = r0.f1978a
                boolean r2 = r2.equals(r4)
                if (r2 != 0) goto L_0x00de
                goto L_0x010f
            L_0x00de:
                java.lang.String r2 = r26.encodedUsername()
                r0.f1979b = r2
                java.lang.String r2 = r26.encodedPassword()
                r0.f1980c = r2
                java.lang.String r2 = r1.f1972d
                r0.f1981d = r2
                int r2 = r1.f1973e
                r0.f1982e = r2
                java.util.ArrayList r2 = r0.f1983f
                r2.clear()
                java.util.List r3 = r26.encodedPathSegments()
                r2.addAll(r3)
                if (r8 == r12) goto L_0x0106
                char r2 = r10.charAt(r8)
                if (r2 != r5) goto L_0x025f
            L_0x0106:
                java.lang.String r1 = r26.encodedQuery()
                r0.encodedQuery(r1)
                goto L_0x025f
            L_0x010f:
                int r8 = r8 + r3
                r9 = r8
                r16 = 0
                r17 = 0
            L_0x0115:
                java.lang.String r1 = "@/\\?#"
                int r8 = okhttp3.internal.Util.delimiterOffset((java.lang.String) r10, (int) r9, (int) r12, (java.lang.String) r1)
                if (r8 == r12) goto L_0x0122
                char r1 = r10.charAt(r8)
                goto L_0x0123
            L_0x0122:
                r1 = -1
            L_0x0123:
                if (r1 == r14) goto L_0x01cb
                if (r1 == r5) goto L_0x01cb
                if (r1 == r7) goto L_0x01cb
                if (r1 == r15) goto L_0x01cb
                if (r1 == r6) goto L_0x01cb
                r2 = 64
                if (r1 == r2) goto L_0x0135
                r18 = 47
                goto L_0x01bf
            L_0x0135:
                java.lang.String r4 = "%40"
                if (r16 != 0) goto L_0x0193
                int r3 = okhttp3.internal.Util.delimiterOffset((java.lang.String) r10, (int) r9, (int) r8, (char) r13)
                java.lang.String r18 = " \"':;<=>@[]^`{}|/\\?#"
                r19 = 1
                r20 = 0
                r21 = 0
                r22 = 1
                r23 = 0
                r1 = r27
                r2 = r9
                r9 = r3
                r15 = r4
                r4 = r18
                r5 = r19
                r6 = r20
                r18 = 47
                r7 = r21
                r14 = r8
                r8 = r22
                r11 = r9
                r9 = r23
                java.lang.String r1 = okhttp3.HttpUrl.a(r1, r2, r3, r4, r5, r6, r7, r8, r9)
                if (r17 == 0) goto L_0x0178
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = r0.f1979b
                r2.append(r3)
                r2.append(r15)
                r2.append(r1)
                java.lang.String r1 = r2.toString()
            L_0x0178:
                r0.f1979b = r1
                if (r11 == r14) goto L_0x0190
                int r2 = r11 + 1
                java.lang.String r4 = " \"':;<=>@[]^`{}|/\\?#"
                r5 = 1
                r6 = 0
                r7 = 0
                r8 = 1
                r9 = 0
                r1 = r27
                r3 = r14
                java.lang.String r1 = okhttp3.HttpUrl.a(r1, r2, r3, r4, r5, r6, r7, r8, r9)
                r0.f1980c = r1
                r16 = 1
            L_0x0190:
                r17 = 1
                goto L_0x01bd
            L_0x0193:
                r15 = r4
                r14 = r8
                r18 = 47
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                java.lang.String r1 = r0.f1980c
                r11.append(r1)
                r11.append(r15)
                java.lang.String r4 = " \"':;<=>@[]^`{}|/\\?#"
                r5 = 1
                r6 = 0
                r7 = 0
                r8 = 1
                r15 = 0
                r1 = r27
                r2 = r9
                r3 = r14
                r9 = r15
                java.lang.String r1 = okhttp3.HttpUrl.a(r1, r2, r3, r4, r5, r6, r7, r8, r9)
                r11.append(r1)
                java.lang.String r1 = r11.toString()
                r0.f1980c = r1
            L_0x01bd:
                int r9 = r14 + 1
            L_0x01bf:
                r5 = 35
                r6 = 63
                r7 = 47
                r11 = 0
                r14 = -1
                r15 = 92
                goto L_0x0115
            L_0x01cb:
                r14 = r8
                r8 = r9
            L_0x01cd:
                if (r8 >= r14) goto L_0x01eb
                char r1 = r10.charAt(r8)
                if (r1 == r13) goto L_0x01e9
                r2 = 91
                if (r1 == r2) goto L_0x01db
                r1 = 1
                goto L_0x01e7
            L_0x01db:
                r1 = 1
            L_0x01dc:
                int r8 = r8 + r1
                if (r8 >= r14) goto L_0x01e7
                char r2 = r10.charAt(r8)
                r3 = 93
                if (r2 != r3) goto L_0x01dc
            L_0x01e7:
                int r8 = r8 + r1
                goto L_0x01cd
            L_0x01e9:
                r11 = r8
                goto L_0x01ec
            L_0x01eb:
                r11 = r14
            L_0x01ec:
                int r13 = r11 + 1
                r15 = 34
                if (r13 >= r14) goto L_0x0246
                r1 = 0
                java.lang.String r1 = okhttp3.HttpUrl.e(r10, r9, r11, r1)
                java.lang.String r1 = okhttp3.internal.Util.canonicalizeHost(r1)
                r0.f1981d = r1
                java.lang.String r4 = ""
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 1
                r16 = 0
                r1 = r27
                r2 = r13
                r3 = r14
                r24 = r9
                r9 = r16
                java.lang.String r1 = okhttp3.HttpUrl.a(r1, r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ NumberFormatException -> 0x021d }
                int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x021d }
                if (r1 <= 0) goto L_0x0222
                r2 = 65535(0xffff, float:9.1834E-41)
                if (r1 > r2) goto L_0x0222
                goto L_0x0223
            L_0x021d:
                goto L_0x0222
            L_0x021f:
                r24 = r9
                goto L_0x021d
            L_0x0222:
                r1 = -1
            L_0x0223:
                r0.f1982e = r1
                r2 = -1
                if (r1 == r2) goto L_0x022b
                r8 = r24
                goto L_0x025a
            L_0x022b:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r3 = "Invalid URL port: \""
                r2.<init>(r3)
                java.lang.String r3 = r10.substring(r13, r14)
                r2.append(r3)
                r2.append(r15)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
            L_0x0246:
                r8 = r9
                r1 = 0
                java.lang.String r1 = okhttp3.HttpUrl.e(r10, r8, r11, r1)
                java.lang.String r1 = okhttp3.internal.Util.canonicalizeHost(r1)
                r0.f1981d = r1
                java.lang.String r1 = r0.f1978a
                int r1 = okhttp3.HttpUrl.defaultPort(r1)
                r0.f1982e = r1
            L_0x025a:
                java.lang.String r1 = r0.f1981d
                if (r1 == 0) goto L_0x02ad
                r8 = r14
            L_0x025f:
                java.lang.String r1 = "?#"
                int r1 = okhttp3.internal.Util.delimiterOffset((java.lang.String) r10, (int) r8, (int) r12, (java.lang.String) r1)
                r0.g(r10, r8, r1)
                if (r1 >= r12) goto L_0x0290
                char r2 = r10.charAt(r1)
                r3 = 63
                if (r2 != r3) goto L_0x0290
                r11 = 35
                int r13 = okhttp3.internal.Util.delimiterOffset((java.lang.String) r10, (int) r1, (int) r12, (char) r11)
                int r2 = r1 + 1
                java.lang.String r4 = " \"'<>#"
                r5 = 1
                r6 = 0
                r7 = 1
                r8 = 1
                r9 = 0
                r1 = r27
                r3 = r13
                java.lang.String r1 = okhttp3.HttpUrl.a(r1, r2, r3, r4, r5, r6, r7, r8, r9)
                java.util.ArrayList r1 = okhttp3.HttpUrl.h(r1)
                r0.f1984g = r1
                r1 = r13
                goto L_0x0292
            L_0x0290:
                r11 = 35
            L_0x0292:
                if (r1 >= r12) goto L_0x02ac
                char r2 = r10.charAt(r1)
                if (r2 != r11) goto L_0x02ac
                r2 = 1
                int r2 = r2 + r1
                java.lang.String r4 = ""
                r5 = 1
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                r1 = r27
                r3 = r12
                java.lang.String r1 = okhttp3.HttpUrl.a(r1, r2, r3, r4, r5, r6, r7, r8, r9)
                r0.f1985h = r1
            L_0x02ac:
                return
            L_0x02ad:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r3 = "Invalid URL host: \""
                r2.<init>(r3)
                java.lang.String r3 = r10.substring(r8, r11)
                r2.append(r3)
                r2.append(r15)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
            L_0x02c8:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "Expected URL scheme 'http' or 'https' but no colon was found"
                r1.<init>(r2)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.HttpUrl.Builder.d(okhttp3.HttpUrl, java.lang.String):void");
        }

        public final void e(String str, int i2, int i3, boolean z2, boolean z3) {
            String a2 = HttpUrl.a(str, i2, i3, " \"<>^`{}|/\\?#", z3, false, false, true, (Charset) null);
            if (!b(a2)) {
                boolean c2 = c(a2);
                ArrayList arrayList = this.f1983f;
                if (!c2) {
                    if (((String) arrayList.get(arrayList.size() - 1)).isEmpty()) {
                        arrayList.set(arrayList.size() - 1, a2);
                    } else {
                        arrayList.add(a2);
                    }
                    if (z2) {
                        arrayList.add("");
                    }
                } else if (!((String) arrayList.remove(arrayList.size() - 1)).isEmpty() || arrayList.isEmpty()) {
                    arrayList.add("");
                } else {
                    arrayList.set(arrayList.size() - 1, "");
                }
            }
        }

        public Builder encodedFragment(@Nullable String str) {
            this.f1985h = str != null ? HttpUrl.b(str, "", true, false, false, false) : null;
            return this;
        }

        public Builder encodedPassword(String str) {
            if (str != null) {
                this.f1980c = HttpUrl.b(str, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true);
                return this;
            }
            throw new NullPointerException("encodedPassword == null");
        }

        public Builder encodedPath(String str) {
            if (str == null) {
                throw new NullPointerException("encodedPath == null");
            } else if (str.startsWith("/")) {
                g(str, 0, str.length());
                return this;
            } else {
                throw new IllegalArgumentException("unexpected encodedPath: ".concat(str));
            }
        }

        public Builder encodedQuery(@Nullable String str) {
            this.f1984g = str != null ? HttpUrl.h(HttpUrl.b(str, " \"'<>#", true, false, true, true)) : null;
            return this;
        }

        public Builder encodedUsername(String str) {
            if (str != null) {
                this.f1979b = HttpUrl.b(str, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true);
                return this;
            }
            throw new NullPointerException("encodedUsername == null");
        }

        public final void f(String str) {
            int size = this.f1984g.size();
            while (true) {
                size -= 2;
                if (size < 0) {
                    return;
                }
                if (str.equals(this.f1984g.get(size))) {
                    this.f1984g.remove(size + 1);
                    this.f1984g.remove(size);
                    if (this.f1984g.isEmpty()) {
                        this.f1984g = null;
                        return;
                    }
                }
            }
        }

        public Builder fragment(@Nullable String str) {
            this.f1985h = str != null ? HttpUrl.b(str, "", false, false, false, false) : null;
            return this;
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0040 A[SYNTHETIC] */
        public final void g(java.lang.String r10, int r11, int r12) {
            /*
                r9 = this;
                if (r11 != r12) goto L_0x0003
                return
            L_0x0003:
                char r0 = r10.charAt(r11)
                java.util.ArrayList r1 = r9.f1983f
                r2 = 1
                r3 = 47
                java.lang.String r4 = ""
                if (r0 == r3) goto L_0x001f
                r3 = 92
                if (r0 != r3) goto L_0x0015
                goto L_0x001f
            L_0x0015:
                int r0 = r1.size()
                int r0 = r0 - r2
                r1.set(r0, r4)
                r0 = r9
                goto L_0x0027
            L_0x001f:
                r1.clear()
                r1.add(r4)
                r0 = r9
            L_0x0026:
                int r11 = r11 + r2
            L_0x0027:
                r5 = r11
                if (r5 >= r12) goto L_0x0040
                java.lang.String r11 = "/\\"
                int r11 = okhttp3.internal.Util.delimiterOffset((java.lang.String) r10, (int) r5, (int) r12, (java.lang.String) r11)
                if (r11 >= r12) goto L_0x0034
                r1 = 1
                goto L_0x0035
            L_0x0034:
                r1 = 0
            L_0x0035:
                r8 = 1
                r3 = r0
                r4 = r10
                r6 = r11
                r7 = r1
                r3.e(r4, r5, r6, r7, r8)
                if (r1 == 0) goto L_0x0027
                goto L_0x0026
            L_0x0040:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.HttpUrl.Builder.g(java.lang.String, int, int):void");
        }

        public Builder host(String str) {
            if (str != null) {
                String canonicalizeHost = Util.canonicalizeHost(HttpUrl.e(str, 0, str.length(), false));
                if (canonicalizeHost != null) {
                    this.f1981d = canonicalizeHost;
                    return this;
                }
                throw new IllegalArgumentException("unexpected host: ".concat(str));
            }
            throw new NullPointerException("host == null");
        }

        public Builder password(String str) {
            if (str != null) {
                this.f1980c = HttpUrl.b(str, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
                return this;
            }
            throw new NullPointerException("password == null");
        }

        public Builder port(int i2) {
            if (i2 <= 0 || i2 > 65535) {
                throw new IllegalArgumentException(a.d("unexpected port: ", i2));
            }
            this.f1982e = i2;
            return this;
        }

        public Builder query(@Nullable String str) {
            this.f1984g = str != null ? HttpUrl.h(HttpUrl.b(str, " \"'<>#", false, false, true, true)) : null;
            return this;
        }

        public Builder removeAllEncodedQueryParameters(String str) {
            if (str == null) {
                throw new NullPointerException("encodedName == null");
            } else if (this.f1984g == null) {
                return this;
            } else {
                f(HttpUrl.b(str, " \"'<>#&=", true, false, true, true));
                return this;
            }
        }

        public Builder removeAllQueryParameters(String str) {
            if (str == null) {
                throw new NullPointerException("name == null");
            } else if (this.f1984g == null) {
                return this;
            } else {
                f(HttpUrl.b(str, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, true));
                return this;
            }
        }

        public Builder removePathSegment(int i2) {
            ArrayList arrayList = this.f1983f;
            arrayList.remove(i2);
            if (arrayList.isEmpty()) {
                arrayList.add("");
            }
            return this;
        }

        public Builder scheme(String str) {
            if (str != null) {
                String str2 = "http";
                if (!str.equalsIgnoreCase(str2)) {
                    str2 = "https";
                    if (!str.equalsIgnoreCase(str2)) {
                        throw new IllegalArgumentException("unexpected scheme: ".concat(str));
                    }
                }
                this.f1978a = str2;
                return this;
            }
            throw new NullPointerException("scheme == null");
        }

        public Builder setEncodedPathSegment(int i2, String str) {
            if (str != null) {
                String a2 = HttpUrl.a(str, 0, str.length(), " \"<>^`{}|/\\?#", true, false, false, true, (Charset) null);
                this.f1983f.set(i2, a2);
                if (!b(a2) && !c(a2)) {
                    return this;
                }
                throw new IllegalArgumentException("unexpected path segment: ".concat(str));
            }
            throw new NullPointerException("encodedPathSegment == null");
        }

        public Builder setEncodedQueryParameter(String str, @Nullable String str2) {
            removeAllEncodedQueryParameters(str);
            addEncodedQueryParameter(str, str2);
            return this;
        }

        public Builder setPathSegment(int i2, String str) {
            if (str != null) {
                String a2 = HttpUrl.a(str, 0, str.length(), " \"<>^`{}|/\\?#", false, false, false, true, (Charset) null);
                if (b(a2) || c(a2)) {
                    throw new IllegalArgumentException("unexpected path segment: ".concat(str));
                }
                this.f1983f.set(i2, a2);
                return this;
            }
            throw new NullPointerException("pathSegment == null");
        }

        public Builder setQueryParameter(String str, @Nullable String str2) {
            removeAllQueryParameters(str);
            addQueryParameter(str, str2);
            return this;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f1978a);
            sb.append("://");
            if (!this.f1979b.isEmpty() || !this.f1980c.isEmpty()) {
                sb.append(this.f1979b);
                if (!this.f1980c.isEmpty()) {
                    sb.append(':');
                    sb.append(this.f1980c);
                }
                sb.append('@');
            }
            if (this.f1981d.indexOf(58) != -1) {
                sb.append('[');
                sb.append(this.f1981d);
                sb.append(']');
            } else {
                sb.append(this.f1981d);
            }
            int i2 = this.f1982e;
            if (i2 == -1) {
                i2 = HttpUrl.defaultPort(this.f1978a);
            }
            if (i2 != HttpUrl.defaultPort(this.f1978a)) {
                sb.append(':');
                sb.append(i2);
            }
            ArrayList arrayList = this.f1983f;
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                sb.append(IOUtils.DIR_SEPARATOR_UNIX);
                sb.append((String) arrayList.get(i3));
            }
            if (this.f1984g != null) {
                sb.append('?');
                HttpUrl.d(sb, this.f1984g);
            }
            if (this.f1985h != null) {
                sb.append('#');
                sb.append(this.f1985h);
            }
            return sb.toString();
        }

        public Builder username(String str) {
            if (str != null) {
                this.f1979b = HttpUrl.b(str, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
                return this;
            }
            throw new NullPointerException("username == null");
        }
    }

    public HttpUrl(Builder builder) {
        this.f1969a = builder.f1978a;
        String str = builder.f1979b;
        this.f1970b = e(str, 0, str.length(), false);
        String str2 = builder.f1980c;
        this.f1971c = e(str2, 0, str2.length(), false);
        this.f1972d = builder.f1981d;
        int i2 = builder.f1982e;
        this.f1973e = i2 == -1 ? defaultPort(builder.f1978a) : i2;
        this.f1974f = f(builder.f1983f, false);
        ArrayList arrayList = builder.f1984g;
        String str3 = null;
        this.f1975g = arrayList != null ? f(arrayList, true) : null;
        String str4 = builder.f1985h;
        this.f1976h = str4 != null ? e(str4, 0, str4.length(), false) : str3;
        this.f1977i = builder.toString();
    }

    public static String a(String str, int i2, int i3, String str2, boolean z2, boolean z3, boolean z4, boolean z5, Charset charset) {
        String str3 = str;
        int i4 = i3;
        String str4 = str2;
        Charset charset2 = charset;
        int i5 = i2;
        while (i5 < i4) {
            int codePointAt = str3.codePointAt(i5);
            int i6 = -1;
            if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && z5) || str4.indexOf(codePointAt) != -1 || ((codePointAt == 37 && (!z2 || (z3 && !g(str3, i5, i4)))) || (codePointAt == 43 && z4)))) {
                Buffer buffer = new Buffer();
                buffer.writeUtf8(str3, i2, i5);
                Buffer buffer2 = null;
                while (i5 < i4) {
                    int codePointAt2 = str3.codePointAt(i5);
                    if (!z2 || !(codePointAt2 == 9 || codePointAt2 == 10 || codePointAt2 == 12 || codePointAt2 == 13)) {
                        if (codePointAt2 == 43 && z4) {
                            buffer.writeUtf8(z2 ? "+" : "%2B");
                        } else if (codePointAt2 < 32 || codePointAt2 == 127 || ((codePointAt2 >= 128 && z5) || str4.indexOf(codePointAt2) != i6 || (codePointAt2 == 37 && (!z2 || (z3 && !g(str3, i5, i4)))))) {
                            if (buffer2 == null) {
                                buffer2 = new Buffer();
                            }
                            if (charset2 == null || charset2.equals(Util.UTF_8)) {
                                buffer2.writeUtf8CodePoint(codePointAt2);
                            } else {
                                buffer2.writeString(str3, i5, Character.charCount(codePointAt2) + i5, charset2);
                            }
                            while (!buffer2.exhausted()) {
                                byte readByte = buffer2.readByte() & 255;
                                buffer.writeByte(37);
                                char[] cArr = f1968j;
                                buffer.writeByte((int) cArr[(readByte >> 4) & 15]);
                                buffer.writeByte((int) cArr[readByte & 15]);
                            }
                        } else {
                            buffer.writeUtf8CodePoint(codePointAt2);
                        }
                    }
                    i5 += Character.charCount(codePointAt2);
                    i6 = -1;
                }
                return buffer.readUtf8();
            }
            i5 += Character.charCount(codePointAt);
        }
        int i7 = i2;
        return str.substring(i2, i3);
    }

    public static String b(String str, String str2, boolean z2, boolean z3, boolean z4, boolean z5) {
        return a(str, 0, str.length(), str2, z2, z3, z4, z5, (Charset) null);
    }

    public static String c(String str, boolean z2, Charset charset) {
        return a(str, 0, str.length(), " \"':;<=>@[]^`{}|/\\?#&!$(),~", z2, false, true, true, charset);
    }

    public static void d(StringBuilder sb, List list) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2 += 2) {
            String str = (String) list.get(i2);
            String str2 = (String) list.get(i2 + 1);
            if (i2 > 0) {
                sb.append('&');
            }
            sb.append(str);
            if (str2 != null) {
                sb.append('=');
                sb.append(str2);
            }
        }
    }

    public static int defaultPort(String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    public static String e(String str, int i2, int i3, boolean z2) {
        int i4;
        int i5 = i2;
        while (i5 < i3) {
            char charAt = str.charAt(i5);
            if (charAt == '%' || (charAt == '+' && z2)) {
                Buffer buffer = new Buffer();
                buffer.writeUtf8(str, i2, i5);
                while (i5 < i3) {
                    int codePointAt = str.codePointAt(i5);
                    if (codePointAt == 37 && (i4 = i5 + 2) < i3) {
                        int decodeHexDigit = Util.decodeHexDigit(str.charAt(i5 + 1));
                        int decodeHexDigit2 = Util.decodeHexDigit(str.charAt(i4));
                        if (!(decodeHexDigit == -1 || decodeHexDigit2 == -1)) {
                            buffer.writeByte((decodeHexDigit << 4) + decodeHexDigit2);
                            i5 = i4;
                            i5 += Character.charCount(codePointAt);
                        }
                    } else if (codePointAt == 43 && z2) {
                        buffer.writeByte(32);
                        i5 += Character.charCount(codePointAt);
                    }
                    buffer.writeUtf8CodePoint(codePointAt);
                    i5 += Character.charCount(codePointAt);
                }
                return buffer.readUtf8();
            }
            i5++;
        }
        return str.substring(i2, i3);
    }

    public static List f(List list, boolean z2) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            String str = (String) list.get(i2);
            arrayList.add(str != null ? e(str, 0, str.length(), z2) : null);
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static boolean g(String str, int i2, int i3) {
        int i4 = i2 + 2;
        return i4 < i3 && str.charAt(i2) == '%' && Util.decodeHexDigit(str.charAt(i2 + 1)) != -1 && Util.decodeHexDigit(str.charAt(i4)) != -1;
    }

    public static HttpUrl get(String str) {
        Builder builder = new Builder();
        builder.d((HttpUrl) null, str);
        return builder.build();
    }

    @Nullable
    public static HttpUrl get(URI uri) {
        return parse(uri.toString());
    }

    @Nullable
    public static HttpUrl get(URL url) {
        return parse(url.toString());
    }

    public static ArrayList h(String str) {
        String str2;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 <= str.length()) {
            int indexOf = str.indexOf(38, i2);
            if (indexOf == -1) {
                indexOf = str.length();
            }
            int indexOf2 = str.indexOf(61, i2);
            if (indexOf2 == -1 || indexOf2 > indexOf) {
                arrayList.add(str.substring(i2, indexOf));
                str2 = null;
            } else {
                arrayList.add(str.substring(i2, indexOf2));
                str2 = str.substring(indexOf2 + 1, indexOf);
            }
            arrayList.add(str2);
            i2 = indexOf + 1;
        }
        return arrayList;
    }

    @Nullable
    public static HttpUrl parse(String str) {
        try {
            return get(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @Nullable
    public String encodedFragment() {
        if (this.f1976h == null) {
            return null;
        }
        String str = this.f1977i;
        return str.substring(str.indexOf(35) + 1);
    }

    public String encodedPassword() {
        if (this.f1971c.isEmpty()) {
            return "";
        }
        String str = this.f1977i;
        return str.substring(str.indexOf(58, this.f1969a.length() + 3) + 1, str.indexOf(64));
    }

    public String encodedPath() {
        String str = this.f1977i;
        int indexOf = str.indexOf(47, this.f1969a.length() + 3);
        return str.substring(indexOf, Util.delimiterOffset(str, indexOf, str.length(), "?#"));
    }

    public List<String> encodedPathSegments() {
        String str = this.f1977i;
        int indexOf = str.indexOf(47, this.f1969a.length() + 3);
        int delimiterOffset = Util.delimiterOffset(str, indexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (indexOf < delimiterOffset) {
            int i2 = indexOf + 1;
            int delimiterOffset2 = Util.delimiterOffset(str, i2, delimiterOffset, (char) IOUtils.DIR_SEPARATOR_UNIX);
            arrayList.add(str.substring(i2, delimiterOffset2));
            indexOf = delimiterOffset2;
        }
        return arrayList;
    }

    @Nullable
    public String encodedQuery() {
        if (this.f1975g == null) {
            return null;
        }
        String str = this.f1977i;
        int indexOf = str.indexOf(63) + 1;
        return str.substring(indexOf, Util.delimiterOffset(str, indexOf, str.length(), '#'));
    }

    public String encodedUsername() {
        if (this.f1970b.isEmpty()) {
            return "";
        }
        int length = this.f1969a.length() + 3;
        String str = this.f1977i;
        return str.substring(length, Util.delimiterOffset(str, length, str.length(), ":@"));
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof HttpUrl) && ((HttpUrl) obj).f1977i.equals(this.f1977i);
    }

    @Nullable
    public String fragment() {
        return this.f1976h;
    }

    public int hashCode() {
        return this.f1977i.hashCode();
    }

    public String host() {
        return this.f1972d;
    }

    public boolean isHttps() {
        return this.f1969a.equals("https");
    }

    public Builder newBuilder() {
        Builder builder = new Builder();
        String str = this.f1969a;
        builder.f1978a = str;
        builder.f1979b = encodedUsername();
        builder.f1980c = encodedPassword();
        builder.f1981d = this.f1972d;
        int defaultPort = defaultPort(str);
        int i2 = this.f1973e;
        if (i2 == defaultPort) {
            i2 = -1;
        }
        builder.f1982e = i2;
        ArrayList arrayList = builder.f1983f;
        arrayList.clear();
        arrayList.addAll(encodedPathSegments());
        builder.encodedQuery(encodedQuery());
        builder.f1985h = encodedFragment();
        return builder;
    }

    @Nullable
    public Builder newBuilder(String str) {
        try {
            Builder builder = new Builder();
            builder.d(this, str);
            return builder;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public String password() {
        return this.f1971c;
    }

    public List<String> pathSegments() {
        return this.f1974f;
    }

    public int pathSize() {
        return this.f1974f.size();
    }

    public int port() {
        return this.f1973e;
    }

    @Nullable
    public String query() {
        List list = this.f1975g;
        if (list == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        d(sb, list);
        return sb.toString();
    }

    @Nullable
    public String queryParameter(String str) {
        List list = this.f1975g;
        if (list == null) {
            return null;
        }
        int size = list.size();
        for (int i2 = 0; i2 < size; i2 += 2) {
            if (str.equals(list.get(i2))) {
                return (String) list.get(i2 + 1);
            }
        }
        return null;
    }

    public String queryParameterName(int i2) {
        List list = this.f1975g;
        if (list != null) {
            return (String) list.get(i2 * 2);
        }
        throw new IndexOutOfBoundsException();
    }

    public Set<String> queryParameterNames() {
        List list = this.f1975g;
        if (list == null) {
            return Collections.emptySet();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int size = list.size();
        for (int i2 = 0; i2 < size; i2 += 2) {
            linkedHashSet.add(list.get(i2));
        }
        return Collections.unmodifiableSet(linkedHashSet);
    }

    public String queryParameterValue(int i2) {
        List list = this.f1975g;
        if (list != null) {
            return (String) list.get((i2 * 2) + 1);
        }
        throw new IndexOutOfBoundsException();
    }

    public List<String> queryParameterValues(String str) {
        List list = this.f1975g;
        if (list == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i2 = 0; i2 < size; i2 += 2) {
            if (str.equals(list.get(i2))) {
                arrayList.add(list.get(i2 + 1));
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public int querySize() {
        List list = this.f1975g;
        if (list != null) {
            return list.size() / 2;
        }
        return 0;
    }

    public String redact() {
        return newBuilder("/...").username("").password("").build().toString();
    }

    @Nullable
    public HttpUrl resolve(String str) {
        Builder newBuilder = newBuilder(str);
        if (newBuilder != null) {
            return newBuilder.build();
        }
        return null;
    }

    public String scheme() {
        return this.f1969a;
    }

    public String toString() {
        return this.f1977i;
    }

    @Nullable
    public String topPrivateDomain() {
        String str = this.f1972d;
        if (Util.verifyAsIpAddress(str)) {
            return null;
        }
        return PublicSuffixDatabase.get().getEffectiveTldPlusOne(str);
    }

    public URI uri() {
        Builder newBuilder = newBuilder();
        ArrayList arrayList = newBuilder.f1983f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.set(i2, b((String) arrayList.get(i2), "[]", true, true, false, true));
        }
        ArrayList arrayList2 = newBuilder.f1984g;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                String str = (String) newBuilder.f1984g.get(i3);
                if (str != null) {
                    newBuilder.f1984g.set(i3, b(str, "\\^`{|}", true, true, true, true));
                }
            }
        }
        String str2 = newBuilder.f1985h;
        if (str2 != null) {
            newBuilder.f1985h = b(str2, " \"#<>\\^`{|}", true, true, false, false);
        }
        String builder = newBuilder.toString();
        try {
            return new URI(builder);
        } catch (URISyntaxException e2) {
            try {
                return URI.create(builder.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", ""));
            } catch (Exception unused) {
                throw new RuntimeException(e2);
            }
        }
    }

    public URL url() {
        try {
            return new URL(this.f1977i);
        } catch (MalformedURLException e2) {
            throw new RuntimeException(e2);
        }
    }

    public String username() {
        return this.f1970b;
    }
}
