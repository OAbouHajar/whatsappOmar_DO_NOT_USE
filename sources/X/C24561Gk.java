package X;

import android.telephony.PhoneNumberUtils;
import com.whatsapp.util.Log;
import java.util.regex.Pattern;

/* renamed from: X.1Gk  reason: invalid class name and case insensitive filesystem */
public class C24561Gk {
    public static Pattern A00;
    public static Pattern A01;
    public static Pattern A02;

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00c4 A[Catch:{ Exception -> 0x00ec, ExceptionInInitializerError -> 0x00cf }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A00(X.C26071Mf r9, java.lang.String r10) {
        /*
            java.lang.String r4 = " "
            java.lang.String r6 = "ZZ"
            java.lang.String r5 = "+"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r5)
            r0.append(r10)
            java.lang.String r3 = r0.toString()
            X.3HS r2 = r9.A0E(r3, r6)     // Catch:{ Exception -> 0x00ec, ExceptionInInitializerError -> 0x00cf }
            int r7 = r2.countryCode_     // Catch:{ Exception -> 0x00ec, ExceptionInInitializerError -> 0x00cf }
            long r0 = r2.nationalNumber_     // Catch:{ Exception -> 0x00ec, ExceptionInInitializerError -> 0x00cf }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x00ec, ExceptionInInitializerError -> 0x00cf }
            r0 = 52
            if (r0 != r7) goto L_0x004b
            int r8 = r1.length()     // Catch:{ Exception -> 0x00ec, ExceptionInInitializerError -> 0x00cf }
            r0 = 11
            if (r8 != r0) goto L_0x00c1
            r0 = 0
            char r8 = r1.charAt(r0)     // Catch:{ Exception -> 0x00ec, ExceptionInInitializerError -> 0x00cf }
            r0 = 49
            if (r8 != r0) goto L_0x00c1
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00ec, ExceptionInInitializerError -> 0x00cf }
            r8.<init>()     // Catch:{ Exception -> 0x00ec, ExceptionInInitializerError -> 0x00cf }
            r8.append(r5)     // Catch:{ Exception -> 0x00ec, ExceptionInInitializerError -> 0x00cf }
            r8.append(r7)     // Catch:{ Exception -> 0x00ec, ExceptionInInitializerError -> 0x00cf }
            r0 = 1
            java.lang.String r0 = r1.substring(r0)     // Catch:{ Exception -> 0x00ec, ExceptionInInitializerError -> 0x00cf }
            r8.append(r0)     // Catch:{ Exception -> 0x00ec, ExceptionInInitializerError -> 0x00cf }
        L_0x0046:
            java.lang.String r0 = r8.toString()     // Catch:{ Exception -> 0x00ec, ExceptionInInitializerError -> 0x00cf }
            goto L_0x00c2
        L_0x004b:
            r0 = 225(0xe1, float:3.15E-43)
            if (r0 != r7) goto L_0x00c1
            java.util.regex.Pattern r0 = A00     // Catch:{ Exception -> 0x00ec, ExceptionInInitializerError -> 0x00cf }
            if (r0 != 0) goto L_0x005b
            java.lang.String r0 = "((?:0[1-3]|[457][0-3])\\d{6})"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)     // Catch:{ Exception -> 0x00ec, ExceptionInInitializerError -> 0x00cf }
            A00 = r0     // Catch:{ Exception -> 0x00ec, ExceptionInInitializerError -> 0x00cf }
        L_0x005b:
            java.util.regex.Matcher r0 = r0.matcher(r1)     // Catch:{ Exception -> 0x00ec, ExceptionInInitializerError -> 0x00cf }
            boolean r0 = r0.matches()     // Catch:{ Exception -> 0x00ec, ExceptionInInitializerError -> 0x00cf }
            if (r0 == 0) goto L_0x0079
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00ec, ExceptionInInitializerError -> 0x00cf }
            r8.<init>()     // Catch:{ Exception -> 0x00ec, ExceptionInInitializerError -> 0x00cf }
            r8.append(r5)     // Catch:{ Exception -> 0x00ec, ExceptionInInitializerError -> 0x00cf }
            r8.append(r7)     // Catch:{ Exception -> 0x00ec, ExceptionInInitializerError -> 0x00cf }
            java.lang.String r0 = "01"
        L_0x0072:
            r8.append(r0)     // Catch:{ Exception -> 0x00ec, ExceptionInInitializerError -> 0x00cf }
            r8.append(r1)     // Catch:{ Exception -> 0x00ec, ExceptionInInitializerError -> 0x00cf }
            goto L_0x0046
        L_0x0079:
            java.util.regex.Pattern r0 = A01     // Catch:{ Exception -> 0x00ec, ExceptionInInitializerError -> 0x00cf }
            if (r0 != 0) goto L_0x0085
            java.lang.String r0 = "([04-9][4-6]\\d{6})"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)     // Catch:{ Exception -> 0x00ec, ExceptionInInitializerError -> 0x00cf }
            A01 = r0     // Catch:{ Exception -> 0x00ec, ExceptionInInitializerError -> 0x00cf }
        L_0x0085:
            java.util.regex.Matcher r0 = r0.matcher(r1)     // Catch:{ Exception -> 0x00ec, ExceptionInInitializerError -> 0x00cf }
            boolean r0 = r0.matches()     // Catch:{ Exception -> 0x00ec, ExceptionInInitializerError -> 0x00cf }
            if (r0 == 0) goto L_0x009d
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00ec, ExceptionInInitializerError -> 0x00cf }
            r8.<init>()     // Catch:{ Exception -> 0x00ec, ExceptionInInitializerError -> 0x00cf }
            r8.append(r5)     // Catch:{ Exception -> 0x00ec, ExceptionInInitializerError -> 0x00cf }
            r8.append(r7)     // Catch:{ Exception -> 0x00ec, ExceptionInInitializerError -> 0x00cf }
            java.lang.String r0 = "05"
            goto L_0x0072
        L_0x009d:
            java.util.regex.Pattern r0 = A02     // Catch:{ Exception -> 0x00ec, ExceptionInInitializerError -> 0x00cf }
            if (r0 != 0) goto L_0x00a9
            java.lang.String r0 = "((?:[04-8][7-9]|9[78])\\d{6})"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)     // Catch:{ Exception -> 0x00ec, ExceptionInInitializerError -> 0x00cf }
            A02 = r0     // Catch:{ Exception -> 0x00ec, ExceptionInInitializerError -> 0x00cf }
        L_0x00a9:
            java.util.regex.Matcher r0 = r0.matcher(r1)     // Catch:{ Exception -> 0x00ec, ExceptionInInitializerError -> 0x00cf }
            boolean r0 = r0.matches()     // Catch:{ Exception -> 0x00ec, ExceptionInInitializerError -> 0x00cf }
            if (r0 == 0) goto L_0x00c1
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00ec, ExceptionInInitializerError -> 0x00cf }
            r8.<init>()     // Catch:{ Exception -> 0x00ec, ExceptionInInitializerError -> 0x00cf }
            r8.append(r5)     // Catch:{ Exception -> 0x00ec, ExceptionInInitializerError -> 0x00cf }
            r8.append(r7)     // Catch:{ Exception -> 0x00ec, ExceptionInInitializerError -> 0x00cf }
            java.lang.String r0 = "07"
            goto L_0x0072
        L_0x00c1:
            r0 = 0
        L_0x00c2:
            if (r0 == 0) goto L_0x00c8
            X.3HS r2 = r9.A0E(r0, r6)     // Catch:{ Exception -> 0x00ec, ExceptionInInitializerError -> 0x00cf }
        L_0x00c8:
            X.40u r0 = X.C796640u.INTERNATIONAL     // Catch:{ Exception -> 0x00ec, ExceptionInInitializerError -> 0x00cf }
            java.lang.String r3 = r9.A0G(r0, r2)     // Catch:{ Exception -> 0x00ec, ExceptionInInitializerError -> 0x00cf }
            return r3
        L_0x00cf:
            r2 = move-exception
            java.lang.String r0 = "contact/formatter-init-exception num:"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r3)
            r1.append(r4)
            java.lang.String r0 = r2.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e(r0, r2)
            return r3
        L_0x00ec:
            r2 = move-exception
            java.lang.String r0 = "contact/formatter-exception num:"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r3)
            r1.append(r4)
            java.lang.String r0 = r2.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e(r0, r2)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24561Gk.A00(X.1Mf, java.lang.String):java.lang.String");
    }

    public static String A01(C16010sH r1) {
        return A04((C15830rv) r1.A08(C15830rv.class));
    }

    public static String A02(C15830rv r2) {
        String replaceAll;
        String A04 = A04(r2);
        if (A04 == null || (replaceAll = A04.replaceAll("\\D", "")) == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder("+");
        sb.append(replaceAll);
        return sb.toString();
    }

    public static String A03(C15830rv r4) {
        String str;
        int indexOf;
        if (r4 instanceof AnonymousClass1ZT) {
            return r4.user;
        }
        if (!C16030sJ.A0L(r4) || r4 == null || (str = r4.user) == null || (indexOf = str.indexOf("-")) == -1) {
            return null;
        }
        return str.substring(0, indexOf);
    }

    public static String A04(C15830rv r3) {
        C26071Mf A002 = C26071Mf.A00();
        if (r3 == null) {
            Log.w("contact/phonenumber/jid/null");
            return null;
        } else if (C16030sJ.A0P(r3)) {
            StringBuilder sb = new StringBuilder("+");
            sb.append(r3.user);
            return sb.toString();
        } else {
            String A03 = A03(r3);
            if (!PhoneNumberUtils.isGlobalPhoneNumber(A03)) {
                return A03;
            }
            AnonymousClass00B.A06(A03);
            return A00(A002, A03);
        }
    }
}
