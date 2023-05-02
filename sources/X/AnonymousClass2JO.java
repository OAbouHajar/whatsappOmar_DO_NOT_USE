package X;

import com.whatsapp.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2JO  reason: invalid class name */
public class AnonymousClass2JO {
    public static int A00(AnonymousClass1G1 r9, String str, String str2) {
        try {
            int length = str.length();
            if (length < 1 || length > 3) {
                StringBuilder sb = new StringBuilder();
                sb.append("enterphone/cc/bad-length cc=");
                sb.append(str);
                Log.w(sb.toString());
                return 2;
            }
            try {
                if (C29221aF.A01.indexOfKey(Integer.parseInt(str)) >= 0) {
                    if (str2 == null || str2.length() == 0 || str2.replaceAll("\\D", "").length() == 0) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("enterphone/num/error/empty cc=");
                        sb2.append(str);
                        Log.w(sb2.toString());
                        return 4;
                    }
                    int parseInt = Integer.parseInt(str);
                    String A02 = r9.A02(parseInt, str2.replaceAll("\\D", ""));
                    int length2 = A02.length();
                    r9.A05();
                    Iterator it = r9.A02.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        C29211aE r1 = (C29211aE) it.next();
                        if (r1.A00 == parseInt) {
                            int A00 = r1.A00(length2);
                            if (A00 != 0) {
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append("enterphone/num/error/invalid cc=");
                                sb3.append(parseInt);
                                sb3.append(" phone=");
                                sb3.append(A02);
                                sb3.append(" res=");
                                sb3.append(A00);
                                Log.w(sb3.toString());
                                return A00 < 0 ? 5 : 6;
                            }
                        }
                    }
                    int i2 = length + length2;
                    if (i2 <= 15 && i2 >= 8) {
                        return 1;
                    }
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("enterphone/num/error/length cc=");
                    sb4.append(str);
                    sb4.append(" ph=");
                    sb4.append(A02);
                    Log.w(sb4.toString());
                    return 7;
                }
            } catch (NumberFormatException unused) {
            }
            StringBuilder sb5 = new StringBuilder();
            sb5.append("enterphone/cc/bad-name ");
            sb5.append(str);
            Log.w(sb5.toString());
            return 3;
        } catch (IOException e2) {
            Log.e("enterphone/error trimLeadingZero or nativeNameFromCallingCode from CountryPhoneInfo IOException", e2);
            return 7;
        }
    }

    public static int A01(AnonymousClass1G1 r3, String str, String str2) {
        int A00 = A00(r3, str, str2);
        if (A00 != 7 && A00 != 5 && A00 != 6) {
            return A00;
        }
        int length = str.length() + str2.length();
        if (length > 17 || length < 6) {
            StringBuilder sb = new StringBuilder("enterphone/num/allow-landline/error/length input=");
            sb.append(str2);
            Log.w(sb.toString());
            return 7;
        }
        StringBuilder sb2 = new StringBuilder("enterphone/num/allow-landline/ok/length input=");
        sb2.append(str2);
        Log.i(sb2.toString());
        return 1;
    }

    public static String A02(AnonymousClass1G1 r1, String str, String str2) {
        try {
            return r1.A02(Integer.parseInt(str), str2);
        } catch (IOException e2) {
            Log.e("phonenumberutils/trim/error", e2);
            return str2;
        }
    }

    public static List A03(AnonymousClass1G1 r5, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C93524jL r2 = (C93524jL) it.next();
            if (A00(r5, r2.A00, r2.A02) == 1) {
                arrayList.add(r2);
            }
        }
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0028, code lost:
        r7 = "9";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0036, code lost:
        r0 = new java.lang.StringBuilder();
        r0.append(r11);
        r0.append(r9);
        r6 = r0.toString();
        r5 = A05(r8, r9, r6, r7, r2);
        r4 = A05(r10, r9, r6, r7, r2);
        r1 = r2 - r11.length();
        r3 = A05(r9, r8, r10, r7, r1);
        r2 = A05(r6, r8, r10, r7, r2);
        r0 = A05(r8, r9, r6, r7, r1);
        r1 = A05(r10, r9, r6, r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0063, code lost:
        if (r5 != false) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0065, code lost:
        if (r4 != false) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0067, code lost:
        if (r3 != false) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0069, code lost:
        if (r2 != false) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006b, code lost:
        if (r0 != false) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006e, code lost:
        if (r1 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0070, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A04(java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11) {
        /*
            int r0 = r11.hashCode()
            r1 = 0
            switch(r0) {
                case 1693: goto L_0x0009;
                case 1695: goto L_0x0015;
                case 1696: goto L_0x001f;
                case 49686: goto L_0x002b;
                default: goto L_0x0008;
            }
        L_0x0008:
            return r1
        L_0x0009:
            java.lang.String r0 = "52"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x0008
            r2 = 2
            java.lang.String r7 = "1"
            goto L_0x0036
        L_0x0015:
            java.lang.String r0 = "54"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x0008
            r2 = 2
            goto L_0x0028
        L_0x001f:
            java.lang.String r0 = "55"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x0008
            r2 = 4
        L_0x0028:
            java.lang.String r7 = "9"
            goto L_0x0036
        L_0x002b:
            java.lang.String r0 = "237"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x0008
            r2 = 3
            java.lang.String r7 = "6"
        L_0x0036:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r11)
            r0.append(r9)
            java.lang.String r6 = r0.toString()
            boolean r5 = A05(r8, r9, r6, r7, r2)
            boolean r4 = A05(r10, r9, r6, r7, r2)
            int r0 = r11.length()
            int r1 = r2 - r0
            boolean r3 = A05(r9, r8, r10, r7, r1)
            boolean r2 = A05(r6, r8, r10, r7, r2)
            boolean r0 = A05(r8, r9, r6, r7, r1)
            boolean r1 = A05(r10, r9, r6, r7, r1)
            if (r5 != 0) goto L_0x0070
            if (r4 != 0) goto L_0x0070
            if (r3 != 0) goto L_0x0070
            if (r2 != 0) goto L_0x0070
            if (r0 != 0) goto L_0x0070
            r0 = 0
            if (r1 == 0) goto L_0x0071
        L_0x0070:
            r0 = 1
        L_0x0071:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2JO.A04(java.lang.String, java.lang.String, java.lang.String, java.lang.String):boolean");
    }

    public static boolean A05(String str, String str2, String str3, String str4, int i2) {
        if (str.length() < i2) {
            return false;
        }
        StringBuilder sb = new StringBuilder(str);
        sb.insert(i2, str4);
        String obj = sb.toString();
        return obj.equals(str2) || obj.equals(str3);
    }
}
