package X;

import android.net.Uri;
import android.text.TextUtils;
import com.whatsapp.jid.UserJid;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

/* renamed from: X.0w2  reason: invalid class name and case insensitive filesystem */
public class C18030w2 {
    public static final int A06 = C40051tU.A05;
    public final C16040sK A00;
    public final C226818w A01;
    public final C14710pd A02;
    public final C18090w8 A03;
    public final C15960sC A04;
    public final C226918x A05;

    public C18030w2(C16040sK r1, C226818w r2, C14710pd r3, C18090w8 r4, C15960sC r5, C226918x r6) {
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
        this.A05 = r6;
        this.A03 = r4;
        this.A04 = r5;
    }

    public static UserJid A00(Uri uri) {
        String queryParameter = uri.getQueryParameter("phoneNumber");
        if ("wa.me".equals(uri.getHost())) {
            boolean z2 = false;
            if (uri.getPathSegments().size() == 2) {
                z2 = true;
            }
            AnonymousClass00B.A0F(z2);
            queryParameter = uri.getLastPathSegment();
        }
        if (queryParameter == null) {
            return null;
        }
        try {
            return AnonymousClass1ZT.A03(queryParameter);
        } catch (AnonymousClass1W4 unused) {
            return null;
        }
    }

    public static String A01(Uri uri) {
        String queryParameter = uri.getQueryParameter("phone");
        String host = uri.getHost();
        if (!TextUtils.isEmpty(host)) {
            host = host.toLowerCase(Locale.US);
        }
        return "wa.me".equals(host) ? uri.getLastPathSegment() : queryParameter;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0039, code lost:
        if (r4 != null) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A02(android.net.Uri r4, X.C14710pd r5) {
        /*
            java.lang.String r0 = "entry_point"
            java.lang.String r4 = r4.getQueryParameter(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto L_0x0039
            java.lang.String r4 = "click_to_chat_link"
        L_0x000e:
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L_0x003c
            r1 = 533(0x215, float:7.47E-43)
            X.0tM r0 = X.C16620tM.A02
            java.lang.String r1 = r5.A06(r0, r1)
            if (r1 == 0) goto L_0x003d
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x003d
            java.lang.String r0 = ","
            java.lang.String[] r3 = r1.split(r0)
            int r2 = r3.length
            r1 = 0
        L_0x002c:
            if (r1 >= r2) goto L_0x003c
            r0 = r3[r1]
            boolean r0 = r4.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x003d
            int r1 = r1 + 1
            goto L_0x002c
        L_0x0039:
            if (r4 == 0) goto L_0x003c
            goto L_0x000e
        L_0x003c:
            r4 = 0
        L_0x003d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18030w2.A02(android.net.Uri, X.0pd):java.lang.String");
    }

    public static String A03(Uri uri, C14710pd r5, boolean z2) {
        String A062;
        String queryParameter = uri.getQueryParameter("app");
        if (z2) {
            queryParameter = "whatsapp";
        } else if (queryParameter == null) {
            return queryParameter;
        }
        if (TextUtils.isEmpty(queryParameter) || (A062 = r5.A06(C16620tM.A02, 534)) == null || TextUtils.isEmpty(A062)) {
            return queryParameter;
        }
        for (String equalsIgnoreCase : A062.split(",")) {
            if (queryParameter.equalsIgnoreCase(equalsIgnoreCase)) {
                return queryParameter;
            }
        }
        return null;
    }

    public static boolean A04(Uri uri, C14710pd r4) {
        C16620tM r1 = C16620tM.A02;
        return (r4.A0E(r1, 1483) || r4.A0E(r1, 1849)) && uri.isHierarchical() && !uri.getQueryParameterNames().isEmpty() && uri.getQueryParameterNames().contains("type") && "business_profile".equals(uri.getQueryParameter("type"));
    }

    public static boolean A05(C14710pd r4, String str) {
        Uri build;
        C16620tM r1 = C16620tM.A02;
        if (r4.A0E(r1, 1483) || r4.A0E(r1, 1849)) {
            String lowerCase = str.toLowerCase(Locale.US);
            if (lowerCase.startsWith("wa.me")) {
                lowerCase = lowerCase.replace("wa.me", "https://wa.me");
            }
            Uri parse = Uri.parse(lowerCase);
            String str2 = null;
            if (parse.getHost() != null) {
                str2 = parse.getHost().toLowerCase(Locale.US);
            }
            if ("wa.me".equals(str2) && (build = new Uri.Builder().scheme("https").encodedAuthority(str2).encodedPath(parse.getEncodedPath()).encodedQuery(parse.getEncodedQuery()).encodedFragment(parse.getEncodedFragment()).build()) != null) {
                String scheme = build.getScheme();
                if (!TextUtils.isEmpty(scheme)) {
                    String host = build.getHost();
                    if (!TextUtils.isEmpty(host) && A07(scheme, host)) {
                        List<String> pathSegments = build.getPathSegments();
                        return pathSegments.size() == 1 && Pattern.matches("^(?![0-9.]+$)[a-zA-Z0-9.]{5,35}$", pathSegments.get(0));
                    }
                }
            }
        }
    }

    public static boolean A06(C14710pd r3, String str) {
        if (!A05(r3, str)) {
            return false;
        }
        try {
            Uri parse = Uri.parse(str.toLowerCase(Locale.US));
            return parse != null && !parse.getQueryParameterNames().isEmpty() && "1".equals(parse.getQueryParameter("qr"));
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean A07(String str, String str2) {
        return ("http".equals(str) || "https".equals(str)) && "wa.me".equals(str2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x008a, code lost:
        if (r4.A02.A0E(X.C16620tM.A02, 2690) == false) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x03d5, code lost:
        if (r7.equals(r0) != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:348:?, code lost:
        return 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:375:?, code lost:
        return 32;
     */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x030f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x0315  */
    /* JADX WARNING: Removed duplicated region for block: B:309:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:350:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A08(android.net.Uri r26) {
        /*
            r25 = this;
            r6 = r26
            java.lang.String r1 = r6.getScheme()
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            r9 = 1
            if (r0 != 0) goto L_0x0624
            java.util.Locale r3 = java.util.Locale.US
            java.lang.String r13 = r1.toLowerCase(r3)
            java.util.List r2 = r6.getPathSegments()
            java.lang.String r1 = r6.getHost()
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0624
            java.lang.String r7 = r1.toLowerCase(r3)
            boolean r0 = A07(r13, r7)
            java.lang.String r24 = "biztab"
            java.lang.String r23 = "biz-edit-description"
            java.lang.String r5 = "privacy-settings"
            java.lang.String r22 = "manage-ads"
            java.lang.String r1 = "support"
            java.lang.String r9 = "biz-edit-profile"
            java.lang.String r21 = "ph"
            java.lang.String r12 = "status"
            r20 = 26
            r19 = 13
            r18 = 6
            r17 = 5
            java.lang.String r11 = "pay"
            java.lang.String r10 = "advertise"
            r16 = 10
            r8 = 0
            r4 = r25
            if (r0 == 0) goto L_0x00ba
            int r0 = r2.size()
            r7 = 1
            if (r0 != r7) goto L_0x0098
            java.lang.Object r0 = r2.get(r8)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.toLowerCase(r3)
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x0098
        L_0x0065:
            java.util.Set r3 = r6.getQueryParameterNames()
            r1 = 1
            if (r3 == 0) goto L_0x0095
            int r0 = r3.size()
            if (r0 != r1) goto L_0x008c
            java.lang.String r0 = "text"
            java.lang.String r0 = r6.getQueryParameter(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x008c
            X.0pd r2 = r4.A02
            r1 = 2690(0xa82, float:3.77E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r2.A0E(r0, r1)
            r1 = 1
            if (r0 != 0) goto L_0x008d
        L_0x008c:
            r1 = 0
        L_0x008d:
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x0095
            if (r1 == 0) goto L_0x0158
        L_0x0095:
            r3 = 41
        L_0x0097:
            return r3
        L_0x0098:
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x0221
            java.lang.Object r0 = r2.get(r8)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.toLowerCase(r3)
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x0221
            int r1 = r2.size()
            r0 = 2
            if (r1 < r0) goto L_0x00f1
            int r0 = r2.size()
            goto L_0x00e8
        L_0x00ba:
            java.lang.String r0 = "api.whatsapp.com"
            boolean r0 = r0.equals(r7)
            java.lang.String r8 = "send"
            if (r0 == 0) goto L_0x0111
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x00f7
            r0 = 0
            java.lang.Object r0 = r2.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.toLowerCase(r3)
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x00f7
            int r1 = r2.size()
            r0 = 2
            if (r1 < r0) goto L_0x00f1
            int r0 = r2.size()
            r7 = 1
        L_0x00e8:
            java.util.List r0 = r2.subList(r7, r0)
        L_0x00ec:
            int r3 = r4.A0A(r0)
            return r3
        L_0x00f1:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            goto L_0x00ec
        L_0x00f7:
            r14 = 1
            int r0 = r2.size()
            if (r0 != r14) goto L_0x0111
            r0 = 0
            java.lang.Object r0 = r2.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.toLowerCase(r3)
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0111
            r0 = 2
            return r0
        L_0x0111:
            java.lang.String r0 = "call.whatsapp.com"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x0136
            X.0pd r15 = r4.A02
            X.0sK r14 = r4.A00
            boolean r0 = X.C32601gl.A04(r14, r15)
            if (r0 != 0) goto L_0x0133
            boolean r0 = r14.A0G()
            if (r0 != 0) goto L_0x0133
            X.0tM r14 = X.C16620tM.A02
            r0 = 1129(0x469, float:1.582E-42)
            boolean r0 = r15.A0E(r14, r0)
            if (r0 == 0) goto L_0x0136
        L_0x0133:
            r3 = 33
            return r3
        L_0x0136:
            java.lang.String r0 = "www.whatsapp.com"
            boolean r0 = r0.equals(r7)
            if (r0 != 0) goto L_0x0612
            java.lang.String r0 = "whatsapp"
            boolean r0 = r0.equals(r13)
            if (r0 != 0) goto L_0x0151
            java.lang.String r0 = "whatsapp-consumer"
            boolean r0 = r0.equals(r13)
            if (r0 == 0) goto L_0x0158
        L_0x0151:
            int r0 = r7.hashCode()
            switch(r0) {
                case -1992233120: goto L_0x04f1;
                case -1854767153: goto L_0x042e;
                case -1801891768: goto L_0x03fd;
                case -1562078008: goto L_0x0173;
                case -1522518477: goto L_0x0182;
                case -1388591710: goto L_0x03d9;
                case -1127103024: goto L_0x01b3;
                case -962584979: goto L_0x03cf;
                case -892481550: goto L_0x03c7;
                case -690411481: goto L_0x03b8;
                case -436339243: goto L_0x01a2;
                case -318452137: goto L_0x03ae;
                case -309474065: goto L_0x0270;
                case -265966801: goto L_0x0192;
                case 3576: goto L_0x0266;
                case 3617: goto L_0x015a;
                case 110760: goto L_0x0525;
                case 115032: goto L_0x0258;
                case 3045982: goto L_0x0501;
                case 3184262: goto L_0x0254;
                case 3526536: goto L_0x0244;
                case 555704345: goto L_0x0217;
                case 954925063: goto L_0x020d;
                case 1059243776: goto L_0x0203;
                case 1298628776: goto L_0x01d4;
                case 1434631203: goto L_0x01f5;
                case 1519332396: goto L_0x01c4;
                case 1597539542: goto L_0x01ea;
                case 1850498144: goto L_0x0163;
                default: goto L_0x0158;
            }
        L_0x0158:
            r3 = 1
            return r3
        L_0x015a:
            java.lang.String r0 = "qr"
            boolean r0 = r7.equals(r0)
            r3 = 3
            goto L_0x04cd
        L_0x0163:
            java.lang.String r0 = "biz-linked-accounts"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0158
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0158
            goto L_0x05b1
        L_0x0173:
            boolean r0 = r7.equals(r5)
            if (r0 == 0) goto L_0x0158
            r3 = 1
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0097
            goto L_0x05cb
        L_0x0182:
            r0 = r23
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0158
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0158
            goto L_0x0596
        L_0x0192:
            java.lang.String r0 = "biz-location"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0158
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0158
            goto L_0x057b
        L_0x01a2:
            java.lang.String r0 = "biz-hours"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0158
            r3 = 1
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0097
            goto L_0x0560
        L_0x01b3:
            java.lang.String r0 = "biz-edit-catalog"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0158
            r3 = 1
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0097
            goto L_0x0545
        L_0x01c4:
            java.lang.String r0 = "disappearing_messages"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0158
            int r0 = r2.size()
            if (r0 != 0) goto L_0x03fb
            goto L_0x0376
        L_0x01d4:
            java.lang.String r0 = "biztools"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0158
            int r1 = r2.size()
            r0 = 1
            if (r1 != r0) goto L_0x0312
            r0 = 0
            java.lang.Object r0 = r2.get(r0)
            goto L_0x0301
        L_0x01ea:
            java.lang.String r0 = "stickerpack"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L_0x02c4
            goto L_0x0158
        L_0x01f5:
            java.lang.String r0 = "settings"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0158
            int r3 = r4.A09(r6, r2)
            return r3
        L_0x0203:
            java.lang.String r0 = "archive_settings"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L_0x035d
            goto L_0x0158
        L_0x020d:
            java.lang.String r0 = "message"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L_0x02dd
            goto L_0x0158
        L_0x0217:
            java.lang.String r0 = "catalog"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L_0x0243
            goto L_0x0158
        L_0x0221:
            int r0 = r2.size()
            if (r0 <= 0) goto L_0x022a
            r2.get(r8)
        L_0x022a:
            int r7 = r2.size()
            r0 = 2
            if (r7 != r0) goto L_0x027a
            java.lang.Object r0 = r2.get(r8)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r7 = r0.toLowerCase(r3)
            java.lang.String r0 = "c"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x027a
        L_0x0243:
            return r18
        L_0x0244:
            boolean r0 = r7.equals(r8)
            if (r0 == 0) goto L_0x0158
            X.0pd r0 = r4.A02
            boolean r0 = A04(r6, r0)
            if (r0 != 0) goto L_0x02dd
            r3 = 2
            return r3
        L_0x0254:
            java.lang.String r0 = "guia"
            goto L_0x03d1
        L_0x0258:
            java.lang.String r0 = "tos"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0158
            int r3 = r4.A0B(r2)
            return r3
        L_0x0266:
            r0 = r21
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L_0x03fb
            goto L_0x0158
        L_0x0270:
            java.lang.String r0 = "product"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L_0x0293
            goto L_0x0158
        L_0x027a:
            int r7 = r2.size()
            r0 = 3
            if (r7 != r0) goto L_0x0294
            java.lang.Object r0 = r2.get(r8)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r7 = r0.toLowerCase(r3)
            java.lang.String r0 = "p"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x0294
        L_0x0293:
            return r17
        L_0x0294:
            java.lang.String r7 = r6.toString()
            java.lang.String r0 = "https://wa.me/qr/"
            boolean r0 = r7.startsWith(r0)
            if (r0 == 0) goto L_0x02aa
            int r7 = r7.length()
            r0 = 17
            if (r7 <= r0) goto L_0x02aa
            r9 = 3
            return r9
        L_0x02aa:
            int r0 = r2.size()
            r10 = 2
            if (r0 != r10) goto L_0x02c5
            java.lang.Object r0 = r2.get(r8)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r7 = r0.toLowerCase(r3)
            java.lang.String r0 = "stickerpack"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x02c5
        L_0x02c4:
            return r19
        L_0x02c5:
            int r0 = r2.size()
            if (r0 != r10) goto L_0x02de
            java.lang.Object r0 = r2.get(r8)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r7 = r0.toLowerCase(r3)
            java.lang.String r0 = "message"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x02de
        L_0x02dd:
            return r16
        L_0x02de:
            int r0 = r2.size()
            r7 = 1
            if (r0 < r7) goto L_0x031f
            java.lang.Object r0 = r2.get(r8)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r10 = r0.toLowerCase(r3)
            java.lang.String r0 = "biztools"
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L_0x031f
            int r0 = r2.size()
            if (r0 <= r7) goto L_0x0312
            java.lang.Object r0 = r2.get(r7)
        L_0x0301:
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = r0.toLowerCase(r3)
        L_0x0307:
            java.lang.String r0 = "directory"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0315
            r3 = 31
            return r3
        L_0x0312:
            java.lang.String r1 = ""
            goto L_0x0307
        L_0x0315:
            java.lang.String r0 = "accounts"
            boolean r0 = r1.equals(r0)
            r3 = 20
            goto L_0x04cd
        L_0x031f:
            int r0 = r2.size()
            if (r0 < r7) goto L_0x0345
            java.lang.Object r0 = r2.get(r8)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r10 = r0.toLowerCase(r3)
            java.lang.String r0 = "settings"
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L_0x0345
            int r0 = r2.size()
            java.util.List r0 = r2.subList(r7, r0)
            int r3 = r4.A09(r6, r0)
            return r3
        L_0x0345:
            int r0 = r2.size()
            if (r0 < r7) goto L_0x035e
            java.lang.Object r0 = r2.get(r8)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r10 = r0.toLowerCase(r3)
            java.lang.String r0 = "archive_settings"
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L_0x035e
        L_0x035d:
            return r20
        L_0x035e:
            int r0 = r2.size()
            if (r0 != r7) goto L_0x0388
            java.lang.Object r0 = r2.get(r8)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r10 = r0.toLowerCase(r3)
            java.lang.String r0 = "disappearing_messages"
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L_0x0388
        L_0x0376:
            X.0sK r0 = r4.A00
            r0.A0B()
            com.obwhatsapp.Me r0 = r0.A00
            if (r0 == 0) goto L_0x03fb
            X.0sC r0 = r4.A04
            boolean r0 = r0.A01()
            r9 = 25
            goto L_0x03f9
        L_0x0388:
            int r0 = r2.size()
            if (r0 < r7) goto L_0x0436
            java.lang.Object r0 = r2.get(r8)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r10 = r0.toLowerCase(r3)
            java.lang.String r0 = "tos"
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L_0x0436
            int r0 = r2.size()
            java.util.List r0 = r2.subList(r7, r0)
            int r3 = r4.A0B(r0)
            return r3
        L_0x03ae:
            java.lang.String r0 = "premium"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L_0x04b3
            goto L_0x0158
        L_0x03b8:
            boolean r0 = r7.equals(r10)
            if (r0 == 0) goto L_0x0158
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x04c0
            r3 = 38
            return r3
        L_0x03c7:
            boolean r0 = r7.equals(r12)
            if (r0 != 0) goto L_0x0065
            goto L_0x0158
        L_0x03cf:
            java.lang.String r0 = "directory"
        L_0x03d1:
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L_0x060f
            goto L_0x0158
        L_0x03d9:
            r0 = r24
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0158
            r1 = 1
            int r0 = r2.size()
            if (r0 < r1) goto L_0x03fb
            r0 = 0
            java.lang.Object r0 = r2.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.toLowerCase(r3)
            boolean r0 = r10.equals(r0)
            r9 = 45
        L_0x03f9:
            if (r0 != 0) goto L_0x0624
        L_0x03fb:
            r9 = 1
            return r9
        L_0x03fd:
            r0 = r22
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0158
            int r1 = r2.size()
            r0 = 1
            if (r1 < r0) goto L_0x042b
            r0 = 0
            java.lang.Object r0 = r2.get(r0)
            java.lang.String r0 = (java.lang.String) r0
        L_0x0413:
            java.lang.String r1 = r0.toLowerCase(r3)
            java.lang.String r0 = "ad-details"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0428
            int r1 = r2.size()
            r0 = 2
            r3 = 40
            if (r1 >= r0) goto L_0x0097
        L_0x0428:
            r3 = 39
            return r3
        L_0x042b:
            java.lang.String r0 = ""
            goto L_0x0413
        L_0x042e:
            boolean r0 = r7.equals(r1)
            if (r0 != 0) goto L_0x044c
            goto L_0x0158
        L_0x0436:
            int r0 = r2.size()
            if (r0 != r7) goto L_0x044f
            java.lang.Object r0 = r2.get(r8)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.toLowerCase(r3)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x044f
        L_0x044c:
            r3 = 30
            return r3
        L_0x044f:
            boolean r0 = X.C40071tW.A00(r6)
            if (r0 != 0) goto L_0x060f
            int r1 = r2.size()
            r0 = 2
            if (r1 != r0) goto L_0x049b
            java.lang.Object r0 = r2.get(r8)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = r0.toLowerCase(r3)
            java.lang.String r0 = "community"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x049b
            X.0pd r5 = r4.A02
            r1 = 1173(0x495, float:1.644E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r5.A0E(r0, r1)
            if (r0 == 0) goto L_0x0483
            X.0sK r0 = r4.A00
            boolean r0 = r0.A0G()
            if (r0 != 0) goto L_0x0483
            r8 = 1
        L_0x0483:
            r9 = 1
            if (r8 == 0) goto L_0x0624
            java.lang.Object r0 = r2.get(r7)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = r0.toLowerCase(r3)
            java.lang.String r0 = "create"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0624
            r3 = 37
            return r3
        L_0x049b:
            int r0 = r2.size()
            if (r0 < r7) goto L_0x04d1
            java.lang.Object r0 = r2.get(r8)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = r0.toLowerCase(r3)
            java.lang.String r0 = "premium"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x04d1
        L_0x04b3:
            X.0pd r2 = r4.A02
            r1 = 2562(0xa02, float:3.59E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r2.A0E(r0, r1)
            r3 = 42
            goto L_0x04cd
        L_0x04c0:
            r0 = 0
            java.lang.Object r1 = r2.get(r0)
            java.lang.String r0 = "catalog"
            boolean r0 = r0.equals(r1)
            r3 = 44
        L_0x04cd:
            if (r0 != 0) goto L_0x0097
            goto L_0x0158
        L_0x04d1:
            r2.size()
            r2.size()
            r2.size()
            int r0 = r2.size()
            if (r0 != r7) goto L_0x052d
            java.lang.Object r0 = r2.get(r8)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.toLowerCase(r3)
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x052d
            goto L_0x04fe
        L_0x04f1:
            boolean r0 = r7.equals(r9)
            if (r0 == 0) goto L_0x0158
            r3 = 1
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0097
        L_0x04fe:
            r3 = 46
            return r3
        L_0x0501:
            java.lang.String r0 = "call"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0158
            X.0pd r2 = r4.A02
            X.0sK r1 = r4.A00
            boolean r0 = X.C32601gl.A04(r1, r2)
            if (r0 != 0) goto L_0x0133
            boolean r0 = r1.A0G()
            if (r0 != 0) goto L_0x0133
            r1 = 1129(0x469, float:1.582E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r2.A0E(r0, r1)
            if (r0 == 0) goto L_0x0158
            goto L_0x0133
        L_0x0525:
            boolean r0 = r7.equals(r11)
            if (r0 != 0) goto L_0x0612
            goto L_0x0158
        L_0x052d:
            int r0 = r2.size()
            if (r0 != r7) goto L_0x0548
            java.lang.Object r0 = r2.get(r8)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = r0.toLowerCase(r3)
            java.lang.String r0 = "biz-edit-catalog"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0548
        L_0x0545:
            r3 = 48
            return r3
        L_0x0548:
            int r0 = r2.size()
            if (r0 != r7) goto L_0x0563
            java.lang.Object r0 = r2.get(r8)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = r0.toLowerCase(r3)
            java.lang.String r0 = "biz-hours"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0563
        L_0x0560:
            r3 = 49
            return r3
        L_0x0563:
            int r0 = r2.size()
            if (r0 != r7) goto L_0x057e
            java.lang.Object r0 = r2.get(r8)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = r0.toLowerCase(r3)
            java.lang.String r0 = "biz-location"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x057e
        L_0x057b:
            r3 = 50
            return r3
        L_0x057e:
            int r0 = r2.size()
            if (r0 != r7) goto L_0x0599
            java.lang.Object r0 = r2.get(r8)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = r0.toLowerCase(r3)
            r0 = r23
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0599
        L_0x0596:
            r3 = 53
            return r3
        L_0x0599:
            int r0 = r2.size()
            if (r0 != r7) goto L_0x05b4
            java.lang.Object r0 = r2.get(r8)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = r0.toLowerCase(r3)
            java.lang.String r0 = "biz-linked-accounts"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x05b4
        L_0x05b1:
            r3 = 51
            return r3
        L_0x05b4:
            int r0 = r2.size()
            r9 = 1
            if (r0 != r7) goto L_0x05ce
            java.lang.Object r0 = r2.get(r8)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.toLowerCase(r3)
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x05ce
        L_0x05cb:
            r3 = 52
            return r3
        L_0x05ce:
            X.0pd r1 = r4.A02
            java.lang.String r0 = r6.toString()
            boolean r0 = A05(r1, r0)
            if (r0 == 0) goto L_0x0617
            X.18w r1 = r4.A01
            java.lang.String r8 = "DeepLinkHelper"
            java.lang.String r6 = "fetch_biz_info"
            java.util.Map r5 = r1.A02
            java.lang.Object r2 = r5.get(r6)
            X.1dR r2 = (X.C31081dR) r2
            if (r2 != 0) goto L_0x0609
            X.18v r4 = r1.A00
            r0 = 701183835(0x29cb375b, float:9.0246136E-14)
            X.1dS r3 = new X.1dS
            r3.<init>(r0)
            X.0pd r2 = r1.A01
            r1 = 2560(0xa00, float:3.587E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r2.A0E(r0, r1)
            if (r0 == 0) goto L_0x0602
            r3.A03 = r7
        L_0x0602:
            X.1dR r2 = r4.A00(r3, r6)
            r5.put(r6, r2)
        L_0x0609:
            r0 = -1
            r2.A0D(r8, r0)
            return r16
        L_0x060f:
            r3 = 32
            return r3
        L_0x0612:
            int r3 = r4.A0A(r2)
            return r3
        L_0x0617:
            int r0 = r2.size()
            if (r0 == r7) goto L_0x0623
            int r0 = r2.size()
            if (r0 != 0) goto L_0x0624
        L_0x0623:
            r9 = 2
        L_0x0624:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18030w2.A08(android.net.Uri):int");
    }

    public final int A09(Uri uri, List list) {
        if (this.A02.A0E(C16620tM.A02, 504)) {
            C16040sK r0 = this.A00;
            r0.A0B();
            if (r0.A00 != null && this.A04.A01()) {
                Locale locale = Locale.US;
                String lowerCase = ((String) list.get(0)).toLowerCase(locale);
                if ("account".equals(lowerCase)) {
                    String lowerCase2 = ((String) list.get(1)).toLowerCase(locale);
                    if ("delete".equals(lowerCase2)) {
                        return 22;
                    }
                    if ("request_info".equals(lowerCase2)) {
                        return 23;
                    }
                } else if ("chats".equals(lowerCase)) {
                    if (list.size() > 1 && "history".equals(((String) list.get(1)).toLowerCase(locale))) {
                        return 24;
                    }
                    String queryParameter = uri.getQueryParameter("page");
                    if (list.size() == 1) {
                        if (!uri.getQueryParameterNames().isEmpty()) {
                            return (queryParameter == null || (!queryParameter.equalsIgnoreCase("theme") && !queryParameter.equalsIgnoreCase("font") && !queryParameter.equalsIgnoreCase("language"))) ? 1 : 36;
                        }
                        return 36;
                    }
                }
            }
        }
    }

    public final int A0A(List list) {
        Object obj = "";
        Object obj2 = list.isEmpty() ? obj : list.get(0);
        if (list.size() > 1) {
            obj = list.get(1);
        }
        if ("upi".equals(obj2)) {
            return "signup".equals(obj) ? 19 : 1;
        }
        if ("br".equals(obj2) && "signup".equals(obj)) {
            return 19;
        }
        if ("virality".equals(obj2) || "virality".equals(obj)) {
            return 21;
        }
        return "tpp".equals(obj2) ? this.A02.A0E(C16620tM.A02, 848) ? 29 : 1 : this.A03.A09() ? 4 : 1;
    }

    public final int A0B(List list) {
        if (!list.isEmpty()) {
            C16040sK r0 = this.A00;
            r0.A0B();
            if (r0.A00 != null && this.A04.A01()) {
                return (!this.A02.A0E(C16620tM.A02, 728) || !"20210210".equals(list.get(0))) ? 1 : 27;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0015, code lost:
        if (r0 != false) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A0C(android.net.Uri r3) {
        /*
            r2 = this;
            java.lang.String r0 = r3.getScheme()
            java.lang.String r1 = r3.getHost()
            boolean r0 = A07(r0, r1)
            if (r0 != 0) goto L_0x0017
            java.lang.String r0 = "api.whatsapp.com"
            boolean r0 = r0.equals(r1)
            r1 = 0
            if (r0 == 0) goto L_0x0018
        L_0x0017:
            r1 = 1
        L_0x0018:
            java.util.List r0 = r3.getPathSegments()
            int r0 = r0.size()
            if (r0 > r1) goto L_0x0024
            r0 = 0
            return r0
        L_0x0024:
            java.util.List r0 = r3.getPathSegments()
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18030w2.A0C(android.net.Uri):java.lang.String");
    }

    public boolean A0D(String str) {
        return !TextUtils.isEmpty(str) && 6 == A08(Uri.parse(str));
    }
}
