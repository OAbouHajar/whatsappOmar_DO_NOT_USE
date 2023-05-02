package X;

import android.net.Uri;
import android.text.TextUtils;
import com.AssemMods.translator.Language;
import com.whatsapp.util.Log;
import java.util.HashMap;
import java.util.Locale;

/* renamed from: X.5xh  reason: invalid class name and case insensitive filesystem */
public class C119395xh {
    public String A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public String A0J;
    public String A0K;
    public String A0L;
    public String A0M;
    public String A0N;
    public String A0O;
    public boolean A0P;

    public C119395xh() {
    }

    public C119395xh(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
        this.A09 = A04(str, false);
        this.A0A = A03(str2);
        this.A0K = A04(str3, false);
        this.A06 = A04(str4, false);
        this.A0J = A04(str5, false);
        this.A0F = A04(str6, false);
        this.A04 = A04(str7, false);
        this.A0C = A04(str8, false);
        this.A0B = A03(str9);
        this.A0O = A04(str10, true);
        this.A0I = A04(str11, false);
        this.A02 = str12;
    }

    public C119395xh(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21) {
        this.A09 = A04(str, false);
        this.A0A = A03(str2);
        this.A0K = A04(str3, false);
        this.A06 = A04(str4, false);
        this.A04 = A04(str5, false);
        this.A0C = A04(str6, false);
        this.A0O = A04(str7, true);
        this.A0I = A04(str8, false);
        this.A02 = str21;
        this.A00 = A04(str9, false);
        this.A07 = A04(str10, false);
        this.A05 = A04(str11, false);
        this.A0N = A04(str12, false);
        this.A0M = A04(str13, false);
        this.A03 = A04(str14, false);
        this.A0D = A04(str15, false);
        this.A0E = A04(str16, false);
        this.A0G = A04(str17, false);
        this.A0H = A04(str18, false);
        this.A01 = A04(str19, false);
        this.A0L = A04(str20, false);
    }

    public static C119395xh A00(Uri uri, String str) {
        Uri uri2 = uri;
        if (uri == null) {
            return null;
        }
        String str2 = str;
        if (uri2.toString().toLowerCase(Locale.US).startsWith("upi://mandate")) {
            return new C119395xh(A01(uri2, "pn"), A01(uri2, "am"), A01(uri2, Language.TURKISH), A01(uri2, "mc"), A02(uri2, str2), A01(uri2, "purpose"), A01(uri2, Language.PUNJABI), A01(uri2, "sign"), A01(uri2, "amrule"), A01(uri2, "tn"), A01(uri2, "mn"), A01(uri2, "validitystart"), A01(uri2, "validityend"), A01(uri2, "recur"), A01(uri2, "recurvalue"), A01(uri2, "recurtype"), A01(uri2, "rev"), A01(uri2, "share"), A01(uri2, "block"), A01(uri2, "umn"), str);
        }
        if ("upi".equalsIgnoreCase(uri2.getScheme())) {
            return new C119395xh(A01(uri2, "pn"), A01(uri2, "am"), A01(uri2, Language.TURKISH), A01(uri2, "mc"), A01(uri2, "tid"), uri2.getQueryParameter("url"), A02(uri2, str2), A01(uri2, "purpose"), A01(uri2, "mam"), A01(uri2, Language.PUNJABI), A01(uri2, "sign"), str2);
        }
        try {
            String obj = uri2.toString();
            C117805ta r1 = new C117805ta();
            HashMap A002 = r1.A00(obj.trim());
            HashMap A003 = r1.A00(C110115dX.A0g("26", A002));
            HashMap A004 = r1.A00(C110115dX.A0g("27", A002));
            return new C119395xh(C110115dX.A0g("59", A002), C110115dX.A0g("54", A002), C110115dX.A0g("01", A004), C110115dX.A0g("52", A002), (String) null, C110115dX.A0g("02", A004), "03", (String) null, C110115dX.A0g("02", A003), C110115dX.A0g("01", A003), (String) null, str2);
        } catch (Exception unused) {
            Log.e("PAY: unknown uri");
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r2.indexOf(63);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A01(android.net.Uri r1, java.lang.String r2) {
        /*
            java.lang.String r2 = r1.getQueryParameter(r2)
            if (r2 == 0) goto L_0x0018
            r0 = 63
            int r0 = r2.indexOf(r0)
            if (r0 <= 0) goto L_0x0018
            java.lang.String r1 = r2.substring(r0)
            java.lang.String r0 = ""
            java.lang.String r2 = r2.replace(r1, r0)
        L_0x0018:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C119395xh.A01(android.net.Uri, java.lang.String):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0021, code lost:
        if (r11.equals("GALLERY_QR_CODE") != false) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A02(android.net.Uri r10, java.lang.String r11) {
        /*
            java.lang.String r0 = "am"
            java.lang.String r0 = r10.getQueryParameter(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r9 = r0 ^ 1
            java.lang.String r0 = "mode"
            java.lang.String r8 = A01(r10, r0)
            java.lang.String r0 = "SCANNED_QR_CODE"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x0023
            java.lang.String r0 = "GALLERY_QR_CODE"
            boolean r0 = r11.equals(r0)
            r7 = 0
            if (r0 == 0) goto L_0x0024
        L_0x0023:
            r7 = 1
        L_0x0024:
            java.lang.String r0 = "DEEP_LINK"
            boolean r6 = r11.equals(r0)
            r5 = 0
            java.util.Locale r4 = java.util.Locale.US     // Catch:{ Exception -> 0x0040 }
            java.lang.String r3 = "%02d"
            java.lang.Object[] r2 = X.C13680ns.A1b()     // Catch:{ Exception -> 0x0040 }
            r1 = 0
            int r0 = java.lang.Integer.parseInt(r8)     // Catch:{ Exception -> 0x0040 }
            X.AnonymousClass000.A1M(r2, r0, r1)     // Catch:{ Exception -> 0x0040 }
            java.lang.String r5 = java.lang.String.format(r4, r3, r2)     // Catch:{ Exception -> 0x0040 }
            goto L_0x004a
        L_0x0040:
            r1 = move-exception
            java.lang.String r0 = "PAY: IndiaUpiInitiationModeUtil/getInitiationMode"
            java.lang.String r0 = X.AnonymousClass000.A0g(r0, r1)
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x004a:
            if (r7 == 0) goto L_0x0064
            if (r9 == 0) goto L_0x0059
            java.util.HashSet r0 = X.C115735qE.A00
            boolean r0 = r0.contains(r5)
            if (r0 != 0) goto L_0x0058
            java.lang.String r5 = "15"
        L_0x0058:
            return r5
        L_0x0059:
            java.util.HashSet r0 = X.C115735qE.A03
            boolean r0 = r0.contains(r5)
            if (r0 != 0) goto L_0x0058
            java.lang.String r5 = "01"
            return r5
        L_0x0064:
            if (r6 == 0) goto L_0x0071
            java.util.HashSet r0 = X.C115735qE.A01
            boolean r0 = r0.contains(r5)
            if (r0 != 0) goto L_0x0058
            java.lang.String r5 = "04"
            return r5
        L_0x0071:
            java.lang.String r5 = "00"
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C119395xh.A02(android.net.Uri, java.lang.String):java.lang.String");
    }

    public static final String A03(String str) {
        if (TextUtils.isEmpty(str) || "null".equalsIgnoreCase(str) || "0".equals(str) || "0.0".equals(str) || "0.00".equals(str)) {
            return null;
        }
        return str.trim();
    }

    public static final String A04(String str, boolean z2) {
        if (TextUtils.isEmpty(str) || "null".equalsIgnoreCase(str) || "na".equalsIgnoreCase(str)) {
            return null;
        }
        String trim = str.trim();
        return z2 ? trim.toLowerCase(Locale.US) : trim;
    }

    public static final void A05(String str, String str2, StringBuffer stringBuffer) {
        if (!TextUtils.isEmpty(str2)) {
            if (stringBuffer.length() > 0) {
                stringBuffer.append("&");
            }
            stringBuffer.append(str);
            stringBuffer.append("=");
            stringBuffer.append(Uri.encode(str2, "@"));
        }
    }

    public String A06() {
        StringBuffer stringBuffer = new StringBuffer();
        A05("pn", this.A09, stringBuffer);
        A05("am", this.A0A, stringBuffer);
        A05(Language.TURKISH, this.A0K, stringBuffer);
        A05("mc", this.A06, stringBuffer);
        A05("tid", this.A0J, stringBuffer);
        A05("url", this.A0F, stringBuffer);
        A05("mode", this.A04, stringBuffer);
        A05("purpose", this.A0C, stringBuffer);
        A05("mam", this.A0B, stringBuffer);
        A05(Language.PUNJABI, this.A0O, stringBuffer);
        A05("sign", this.A0I, stringBuffer);
        String obj = stringBuffer.toString();
        return AnonymousClass000.A0h(TextUtils.isEmpty(obj) ? "" : AnonymousClass000.A0h(obj, AnonymousClass000.A0r("?")), AnonymousClass000.A0r("upi://pay"));
    }
}
