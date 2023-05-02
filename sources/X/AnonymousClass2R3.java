package X;

import android.icu.text.DateTimePatternGenerator;
import android.icu.text.NumberFormat;
import android.icu.text.SimpleDateFormat;
import android.icu.util.Calendar;
import android.icu.util.ULocale;
import android.text.TextUtils;
import com.obwhatsapp.jobqueue.job.HSMRehydrationUtil$SendStructUnavailableException;
import com.whatsapp.util.Log;
import java.util.Locale;
import java.util.regex.Pattern;

/* renamed from: X.2R3  reason: invalid class name */
public class AnonymousClass2R3 {
    public static Pattern A00;

    public static C46082Cg A00(C19280yB r1, String str, String str2, Locale[] localeArr) {
        C46082Cg A02 = r1.A02(str, localeArr);
        if (A02 == null) {
            StringBuilder sb = new StringBuilder("HSMRehydrationUtil/requestLanguagePack/error missing hsm pack after requirements satisfied, loggableString=");
            sb.append(str2);
            Log.e(sb.toString());
            throw new HSMRehydrationUtil$SendStructUnavailableException(1002);
        } else if (A02.A02.size() != 0) {
            return A02;
        } else {
            StringBuilder sb2 = new StringBuilder("HSMRehydrationUtil/requestLanguagePack/error server had no hsm pack for namespace, loggableString=");
            sb2.append(str2);
            Log.e(sb2.toString());
            throw new HSMRehydrationUtil$SendStructUnavailableException(1002);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0259, code lost:
        if (r4 != null) goto L_0x0213;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x025b, code lost:
        r4 = r11.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x0461, code lost:
        r13.set(7, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x04f4, code lost:
        r2.append(r0);
        r2.append(r7);
        com.whatsapp.util.Log.e(r2.toString());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A01(android.content.Context r21, X.AnonymousClass2IQ r22, X.C46082Cg r23, X.C455029b r24, java.lang.String r25, boolean r26, boolean r27) {
        /*
            r0 = r23
            java.lang.String r1 = r0.A05
            java.lang.String r0 = r0.A04
            java.util.Locale r6 = new java.util.Locale
            r6.<init>(r1, r0)
            r5 = 0
            r3 = r22
            r8 = r24
            r7 = r25
            if (r24 == 0) goto L_0x004e
            int r0 = r3.A00
            r2 = 2
            r1 = r0 & 2
            r0 = 0
            if (r1 != r2) goto L_0x001d
            r0 = 1
        L_0x001d:
            if (r0 == 0) goto L_0x004e
            int r2 = r3.A02
            r0 = 1
            if (r2 < r0) goto L_0x004e
            int r2 = r2 - r0
            X.1XE r0 = r8.A01
            int r0 = r0.size()
            if (r2 > r0) goto L_0x01b8
            X.1XE r0 = r8.A01
            java.lang.Object r0 = r0.get(r2)
            X.2to r0 = (X.C58632to) r0
            java.lang.String r1 = r0.A03
        L_0x0037:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L_0x018f
            java.lang.String r1 = "HSMRehydrationUtil/validateMessageAndBuildHsmText/error message does not contain parameter at plural index, loggableParameters="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x004e:
            if (r27 == 0) goto L_0x00ed
            int r1 = r3.A01
            r0 = 1
            if (r1 != r0) goto L_0x008b
            X.2IR r0 = r3.A0d()
            java.lang.String r9 = r0.A08
        L_0x005b:
            if (r9 == 0) goto L_0x0530
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 == 0) goto L_0x0065
            if (r27 == 0) goto L_0x0530
        L_0x0065:
            int r1 = r9.length()
            java.lang.StringBuffer r20 = new java.lang.StringBuffer
            r0 = r20
            r0.<init>(r1)
            r10 = 0
            if (r24 == 0) goto L_0x0088
            X.1XE r0 = r8.A01
            int r19 = r0.size()
        L_0x0079:
            r0 = r19
            boolean[] r0 = new boolean[r0]
            r18 = r0
            java.util.regex.Pattern r0 = A00
            if (r0 != 0) goto L_0x01cc
            java.lang.Class<X.2R3> r1 = X.AnonymousClass2R3.class
            monitor-enter(r1)
            goto L_0x01bb
        L_0x0088:
            r19 = 0
            goto L_0x0079
        L_0x008b:
            r0 = 6
            if (r1 != r0) goto L_0x00ea
            X.2te r0 = r3.A0c()
            int r0 = r0.A01
            r2 = 3
            if (r0 != r2) goto L_0x00ae
            X.2te r1 = r3.A0c()
            int r0 = r1.A01
            if (r0 != r2) goto L_0x00a8
            java.lang.Object r0 = r1.A03
            X.2tG r0 = (X.C58292tG) r0
        L_0x00a3:
            if (r26 == 0) goto L_0x00ab
            java.lang.String r9 = r0.A01
            goto L_0x005b
        L_0x00a8:
            X.2tG r0 = X.C58292tG.A03
            goto L_0x00a3
        L_0x00ab:
            java.lang.String r9 = r0.A02
            goto L_0x005b
        L_0x00ae:
            X.2te r0 = r3.A0c()
            int r0 = r0.A01
            r2 = 2
            if (r0 != r2) goto L_0x00ce
            X.2te r1 = r3.A0c()
            int r0 = r1.A01
            if (r0 != r2) goto L_0x00c8
            java.lang.Object r0 = r1.A03
            X.2tH r0 = (X.C58302tH) r0
        L_0x00c3:
            if (r26 == 0) goto L_0x00cb
            java.lang.String r9 = r0.A01
            goto L_0x005b
        L_0x00c8:
            X.2tH r0 = X.C58302tH.A03
            goto L_0x00c3
        L_0x00cb:
            java.lang.String r9 = r0.A02
            goto L_0x005b
        L_0x00ce:
            X.2te r0 = r3.A0c()
            int r0 = r0.A01
            r2 = 1
            if (r0 != r2) goto L_0x00ea
            X.2te r1 = r3.A0c()
            int r0 = r1.A01
            if (r0 != r2) goto L_0x00e7
            java.lang.Object r0 = r1.A03
            X.2t1 r0 = (X.AnonymousClass2t1) r0
        L_0x00e3:
            java.lang.String r9 = r0.A01
            goto L_0x005b
        L_0x00e7:
            X.2t1 r0 = X.AnonymousClass2t1.A02
            goto L_0x00e3
        L_0x00ea:
            r9 = 0
            goto L_0x005b
        L_0x00ed:
            if (r5 == 0) goto L_0x018b
            X.1i6 r1 = X.C33141i6.A00(r6)
            java.lang.Object r0 = r5.second
            int r2 = r1.A04(r0)
            X.1XE r0 = r3.A03
            java.util.Iterator r9 = r0.iterator()
        L_0x00ff:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0149
            java.lang.Object r4 = r9.next()
            X.2tI r4 = (X.C58312tI) r4
            int r0 = r4.A01
            X.434 r1 = X.AnonymousClass434.A00(r0)
            if (r1 != 0) goto L_0x0115
            X.434 r1 = X.AnonymousClass434.A06
        L_0x0115:
            X.434 r0 = X.AnonymousClass434.A06
            if (r1 != r0) goto L_0x0120
            r0 = 1
            if (r2 != r0) goto L_0x0120
        L_0x011c:
            java.lang.String r9 = r4.A02
            goto L_0x005b
        L_0x0120:
            X.434 r0 = X.AnonymousClass434.A03
            if (r1 != r0) goto L_0x0128
            r0 = 2
            if (r2 != r0) goto L_0x0128
            goto L_0x011c
        L_0x0128:
            X.434 r0 = X.AnonymousClass434.A05
            if (r1 != r0) goto L_0x0130
            r0 = 4
            if (r2 != r0) goto L_0x0130
            goto L_0x011c
        L_0x0130:
            X.434 r0 = X.AnonymousClass434.A01
            if (r1 != r0) goto L_0x0139
            r0 = 8
            if (r2 != r0) goto L_0x0139
            goto L_0x011c
        L_0x0139:
            X.434 r0 = X.AnonymousClass434.A02
            if (r1 != r0) goto L_0x0142
            r0 = 16
            if (r2 != r0) goto L_0x0142
            goto L_0x011c
        L_0x0142:
            X.434 r0 = X.AnonymousClass434.A04
            if (r1 != r0) goto L_0x00ff
            if (r2 != 0) goto L_0x00ff
            goto L_0x011c
        L_0x0149:
            X.1XE r0 = r3.A03
            java.util.Iterator r2 = r0.iterator()
        L_0x014f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x016f
            java.lang.Object r4 = r2.next()
            X.2tI r4 = (X.C58312tI) r4
            int r0 = r4.A01
            X.434 r1 = X.AnonymousClass434.A00(r0)
            if (r1 != 0) goto L_0x0165
            X.434 r1 = X.AnonymousClass434.A06
        L_0x0165:
            X.434 r0 = X.AnonymousClass434.A04
            if (r1 != r0) goto L_0x014f
            java.lang.String r0 = "HSMRehydrationUtil/validateMessageAndBuildHsmText/error using fallback OTHER plural exception"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            goto L_0x011c
        L_0x016f:
            java.lang.String r0 = "HSMRehydrationUtil/validateMessageAndBuildHsmText/error cannot find plural exception for loc="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r6)
            java.lang.String r0 = "; loggableParameters="
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r9 = 0
            goto L_0x005b
        L_0x018b:
            java.lang.String r9 = r3.A07
            goto L_0x005b
        L_0x018f:
            X.AnonymousClass00B.A06(r1)     // Catch:{ NumberFormatException -> 0x01a4 }
            int r0 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x01a4 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            android.util.Pair r5 = android.util.Pair.create(r1, r0)
            goto L_0x004e
        L_0x01a4:
            r2 = move-exception
            java.lang.String r1 = "HSMRehydrationUtil/validateMessageAndBuildHsmText/error message parameter at plural index is not an integer, loggableParameters="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.w(r0, r2)
            goto L_0x004e
        L_0x01b8:
            r1 = r5
            goto L_0x0037
        L_0x01bb:
            java.util.regex.Pattern r0 = A00     // Catch:{ all -> 0x01c9 }
            if (r0 != 0) goto L_0x01c7
            java.lang.String r0 = "\\{\\{[1-9]+[0-9]*\\}\\}"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)     // Catch:{ all -> 0x01c9 }
            A00 = r0     // Catch:{ all -> 0x01c9 }
        L_0x01c7:
            monitor-exit(r1)     // Catch:{ all -> 0x01c9 }
            goto L_0x01cc
        L_0x01c9:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x01c9 }
            throw r0
        L_0x01cc:
            java.util.regex.Pattern r0 = A00
            java.util.regex.Matcher r17 = r0.matcher(r9)
        L_0x01d2:
            boolean r0 = r17.find()
            r4 = 0
            if (r0 == 0) goto L_0x04e0
            int r0 = r17.start()
            int r2 = r0 + 2
            int r0 = r17.end()
            int r1 = r0 + -2
            r3 = -1
            int r0 = r1 - r2
            r12 = 1
            if (r0 < r12) goto L_0x01f3
            java.lang.String r0 = r9.substring(r2, r1)     // Catch:{ NumberFormatException -> 0x01f3 }
            int r3 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x01f3 }
        L_0x01f3:
            if (r5 == 0) goto L_0x022d
            java.lang.Object r0 = r5.first
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            int r0 = r3 + -1
            if (r1 != r0) goto L_0x022d
            java.lang.Object r0 = r5.second
            java.lang.Number r0 = (java.lang.Number) r0
            int r3 = r0.intValue()
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 24
            if (r1 < r0) goto L_0x0223
            java.lang.String r4 = A03(r6, r3)
        L_0x0213:
            if (r4 != 0) goto L_0x0217
            java.lang.String r4 = ""
        L_0x0217:
            java.lang.String r2 = java.util.regex.Matcher.quoteReplacement(r4)
            r1 = r17
            r0 = r20
            r1.appendReplacement(r0, r2)
            goto L_0x01d2
        L_0x0223:
            java.text.NumberFormat r2 = java.text.NumberFormat.getIntegerInstance(r6)
            long r0 = (long) r3
            java.lang.String r4 = r2.format(r0)
            goto L_0x0213
        L_0x022d:
            if (r3 < r12) goto L_0x04bf
            if (r24 == 0) goto L_0x04bf
            X.1XE r0 = r8.A01
            int r0 = r0.size()
            if (r3 > r0) goto L_0x04bf
            int r1 = r3 + -1
            r18[r1] = r12
            X.1XE r0 = r8.A01
            java.lang.Object r11 = r0.get(r1)
            X.2to r11 = (X.C58632to) r11
            int r2 = r11.A01
            if (r2 == 0) goto L_0x04bb
            r0 = 2
            if (r2 == r0) goto L_0x04b7
            r0 = 3
            if (r2 == r0) goto L_0x04b3
            r0 = 0
        L_0x0250:
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L_0x025e;
                case 1: goto L_0x0332;
                default: goto L_0x0257;
            }
        L_0x0257:
            java.lang.String r4 = r11.A03
        L_0x0259:
            if (r4 != 0) goto L_0x0213
        L_0x025b:
            java.lang.String r4 = r11.A03
            goto L_0x0213
        L_0x025e:
            r0 = 2
            if (r2 != r0) goto L_0x0284
            java.lang.Object r4 = r11.A02
            X.2tR r4 = (X.C58402tR) r4
        L_0x0265:
            int r3 = r4.A00
            r1 = 1
            r0 = r3 & 1
            if (r0 == r12) goto L_0x026d
            r1 = 0
        L_0x026d:
            if (r1 == 0) goto L_0x032a
            r2 = 2
            r1 = r3 & 2
            r0 = 0
            if (r1 != r2) goto L_0x0276
            r0 = 1
        L_0x0276:
            if (r0 == 0) goto L_0x032a
            java.lang.String r13 = r4.A02
            long r3 = r4.A01
            double r1 = (double) r3
            r3 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r1 = r1 / r3
            goto L_0x0287
        L_0x0284:
            X.2tR r4 = X.C58402tR.A03
            goto L_0x0265
        L_0x0287:
            X.1sq r3 = new X.1sq     // Catch:{ IllegalArgumentException -> 0x0315 }
            r3.<init>(r13)     // Catch:{ IllegalArgumentException -> 0x0315 }
            java.lang.String r0 = X.AnonymousClass1WH.A03(r6)
            int r4 = X.C39751t0.A00(r0)
            r0 = r21
            java.lang.String r4 = X.C28911Ze.A01(r0, r6, r4)
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x02a2
            java.lang.String r4 = X.C39751t0.A0A
        L_0x02a2:
            X.1t3 r13 = new X.1t3
            r13.<init>(r4, r12)
            X.4MC r0 = r13.A01
            java.lang.String r14 = r0.A00
            X.4MC r0 = r13.A00
            java.lang.String r12 = r0.A00
            boolean r0 = r14.equals(r12)
            if (r0 != 0) goto L_0x02c9
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r14)
            java.lang.String r0 = ";"
            r4.append(r0)
            r4.append(r12)
            java.lang.String r14 = r4.toString()
        L_0x02c9:
            X.1t1 r4 = new X.1t1
            r4.<init>(r14, r6)
            X.1t0 r12 = new X.1t0
            r0 = r21
            r12.<init>(r0, r13, r4, r6)
            java.lang.String r4 = r3.A00
            r13 = r4
            r12.A00 = r4
            java.util.HashMap r0 = X.AnonymousClass38I.A02
            java.lang.Object r0 = r0.get(r4)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x02f2
            int r4 = r0.intValue()
            r0 = r21
            java.lang.String r0 = X.C28911Ze.A01(r0, r6, r4)
            java.lang.String r4 = r3.A04(r0)
        L_0x02f2:
            r12.A01 = r4
            int r3 = X.C39651sq.A00(r13)
            X.1t1 r0 = r12.A07
            r0.A03(r3)
            java.lang.String r4 = r0.A01(r1)
            X.1t3 r0 = r12.A02
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x0259
            r13 = 0
            int r3 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            r0 = 0
            if (r3 >= 0) goto L_0x030f
            r0 = 1
        L_0x030f:
            java.lang.String r4 = r12.A01(r4, r0)
            goto L_0x0259
        L_0x0315:
            r2 = move-exception
            java.lang.String r1 = "invalid ISO 4217 code; currencyCode="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r13)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.w(r0, r2)
            r4 = 0
            goto L_0x0259
        L_0x032a:
            java.lang.String r0 = "HSMRehydrationUtil/validateMessageAndBuildHsmText/error localized currency param missing fields"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r4 = 0
            goto L_0x0259
        L_0x0332:
            r0 = 3
            if (r2 != r0) goto L_0x0355
            java.lang.Object r0 = r11.A02
            X.2tS r0 = (X.C58412tS) r0
        L_0x0339:
            int r1 = r0.A01
            if (r1 == 0) goto L_0x0352
            if (r1 == r12) goto L_0x034f
            r0 = 2
            if (r1 == r0) goto L_0x034c
            r0 = 0
        L_0x0343:
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L_0x0358;
                case 1: goto L_0x047e;
                default: goto L_0x034a;
            }
        L_0x034a:
            goto L_0x025b
        L_0x034c:
            X.42S r0 = X.AnonymousClass42S.A03
            goto L_0x0343
        L_0x034f:
            X.42S r0 = X.AnonymousClass42S.A01
            goto L_0x0343
        L_0x0352:
            X.42S r0 = X.AnonymousClass42S.A02
            goto L_0x0343
        L_0x0355:
            X.2tS r0 = X.C58412tS.A03
            goto L_0x0339
        L_0x0358:
            r0 = 3
            if (r2 != r0) goto L_0x0396
            java.lang.Object r1 = r11.A02
            X.2tS r1 = (X.C58412tS) r1
        L_0x035f:
            int r0 = r1.A01
            if (r0 != r12) goto L_0x0393
            java.lang.Object r14 = r1.A02
            X.2uH r14 = (X.C58862uH) r14
        L_0x0367:
            int r0 = r14.A00
            r2 = 64
            r1 = r0 & 64
            r0 = 0
            if (r1 != r2) goto L_0x0371
            r0 = 1
        L_0x0371:
            if (r0 == 0) goto L_0x039d
            int r1 = r14.A01
            if (r1 == r12) goto L_0x0390
            r0 = 2
            if (r1 != r0) goto L_0x0390
            X.42K r1 = X.AnonymousClass42K.A02
        L_0x037c:
            X.42K r0 = X.AnonymousClass42K.A01
            if (r1 == r0) goto L_0x039d
            X.42K r0 = X.AnonymousClass42K.A02
            if (r1 != r0) goto L_0x0399
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 24
            if (r1 < r0) goto L_0x044f
            java.lang.String r4 = A02(r14, r6)
            goto L_0x0259
        L_0x0390:
            X.42K r1 = X.AnonymousClass42K.A01
            goto L_0x037c
        L_0x0393:
            X.2uH r14 = X.C58862uH.A08
            goto L_0x0367
        L_0x0396:
            X.2tS r1 = X.C58412tS.A03
            goto L_0x035f
        L_0x0399:
            java.lang.String r0 = "HSMRehydrationUtil/validateMessageAndBuildHsmText/error localized component time could not be constructed"
            goto L_0x0451
        L_0x039d:
            java.util.GregorianCalendar r13 = new java.util.GregorianCalendar
            r13.<init>()
            r13.clear()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            int r0 = r14.A00
            r2 = 2
            r1 = r0 & 2
            r0 = 0
            if (r1 != r2) goto L_0x03b3
            r0 = 1
        L_0x03b3:
            if (r0 == 0) goto L_0x03c0
            int r0 = r14.A07
            r13.set(r12, r0)
            java.lang.String r0 = "yyyy"
            r3.append(r0)
        L_0x03c0:
            int r0 = r14.A00
            r2 = 4
            r1 = r0 & 4
            r0 = 0
            if (r1 != r2) goto L_0x03c9
            r0 = 1
        L_0x03c9:
            r2 = 2
            if (r0 == 0) goto L_0x03d7
            int r0 = r14.A06
            int r0 = r0 - r12
            r13.set(r2, r0)
            java.lang.String r0 = "MMMM"
            r3.append(r0)
        L_0x03d7:
            int r0 = r14.A00
            r15 = 8
            r1 = r0 & 8
            r0 = 0
            if (r1 != r15) goto L_0x03e1
            r0 = 1
        L_0x03e1:
            if (r0 == 0) goto L_0x03ee
            int r1 = r14.A02
            r0 = 5
            r13.set(r0, r1)
            java.lang.String r0 = "d"
            r3.append(r0)
        L_0x03ee:
            int r1 = r14.A00
            r0 = r1 & 1
            if (r0 != r12) goto L_0x03f9
            java.lang.String r0 = "EEEE"
            r3.append(r0)
        L_0x03f9:
            r15 = 16
            r1 = r1 & 16
            r0 = 0
            if (r1 != r15) goto L_0x0401
            r0 = 1
        L_0x0401:
            r16 = 0
            if (r0 == 0) goto L_0x0421
            r1 = 11
            int r0 = r14.A04
            r13.set(r1, r0)
            int r0 = r14.A00
            r15 = 32
            r1 = r0 & 32
            r0 = 0
            if (r1 != r15) goto L_0x0416
            r0 = 1
        L_0x0416:
            r1 = 12
            if (r0 == 0) goto L_0x044b
            int r0 = r14.A05
            r13.set(r1, r0)
        L_0x041f:
            r16 = 1
        L_0x0421:
            int r15 = r14.A00
            r0 = r15 & 1
            if (r0 != r12) goto L_0x046c
            r0 = r15 & 2
            if (r0 == r2) goto L_0x046c
            r1 = r15 & 4
            r0 = 4
            if (r1 == r0) goto L_0x046c
            r0 = r15 & 8
            r1 = 8
            if (r0 == r1) goto L_0x046c
            int r0 = r14.A03
            X.439 r0 = X.AnonymousClass439.A00(r0)
            if (r0 != 0) goto L_0x0440
            X.439 r0 = X.AnonymousClass439.A02
        L_0x0440:
            int r0 = r0.ordinal()
            r1 = 7
            switch(r0) {
                case 0: goto L_0x0465;
                case 1: goto L_0x0460;
                case 2: goto L_0x045e;
                case 3: goto L_0x045c;
                case 4: goto L_0x045a;
                case 5: goto L_0x0456;
                case 6: goto L_0x0469;
                default: goto L_0x0448;
            }
        L_0x0448:
            java.lang.String r0 = "HSMRehydrationUtil: localized component time had invalid day-of-week"
            goto L_0x0451
        L_0x044b:
            r13.set(r1, r10)
            goto L_0x041f
        L_0x044f:
            java.lang.String r0 = "HSMRehydrationUtil/validateMessageAndBuildHsmText/error Solar Hijri calendar not supported"
        L_0x0451:
            com.whatsapp.util.Log.w((java.lang.String) r0)
            goto L_0x0259
        L_0x0456:
            r13.set(r1, r1)
            goto L_0x046c
        L_0x045a:
            r0 = 6
            goto L_0x0461
        L_0x045c:
            r0 = 5
            goto L_0x0461
        L_0x045e:
            r0 = 4
            goto L_0x0461
        L_0x0460:
            r0 = 3
        L_0x0461:
            r13.set(r1, r0)
            goto L_0x046c
        L_0x0465:
            r13.set(r1, r2)
            goto L_0x046c
        L_0x0469:
            r13.set(r1, r12)
        L_0x046c:
            java.lang.String r3 = r3.toString()
            java.util.Date r2 = r13.getTime()
            r1 = r21
            r0 = r16
            java.lang.String r4 = X.C42681yF.A03(r1, r3, r2, r6, r0)
            goto L_0x0259
        L_0x047e:
            r0 = 3
            if (r2 != r0) goto L_0x04a9
            java.lang.Object r2 = r11.A02
            X.2tS r2 = (X.C58412tS) r2
        L_0x0485:
            int r1 = r2.A01
            r0 = 2
            if (r1 != r0) goto L_0x04a6
            java.lang.Object r1 = r2.A02
            X.2t5 r1 = (X.C58182t5) r1
        L_0x048e:
            int r0 = r1.A00
            r0 = r0 & 1
            if (r0 != r12) goto L_0x04ac
            long r0 = r1.A01
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r2
            java.util.Date r2 = new java.util.Date
            r2.<init>(r0)
            r0 = r21
            java.lang.String r4 = X.C42681yF.A04(r0, r2, r6)
            goto L_0x0259
        L_0x04a6:
            X.2t5 r1 = X.C58182t5.A02
            goto L_0x048e
        L_0x04a9:
            X.2tS r2 = X.C58412tS.A03
            goto L_0x0485
        L_0x04ac:
            java.lang.String r0 = "HSMRehydrationUtil/validateMessageAndBuildHsmText/error localized unix epoch time param missing fields"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            goto L_0x0259
        L_0x04b3:
            X.42T r0 = X.AnonymousClass42T.A02
            goto L_0x0250
        L_0x04b7:
            X.42T r0 = X.AnonymousClass42T.A01
            goto L_0x0250
        L_0x04bb:
            X.42T r0 = X.AnonymousClass42T.A03
            goto L_0x0250
        L_0x04bf:
            int r1 = r17.start()
            int r0 = r17.end()
            java.lang.String r1 = r9.substring(r1, r0)
            java.lang.String r0 = "HSMRehydrationUtil/validateMessageAndBuildHsmText/error unexpected parameter index: replacement=\""
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r0)
            r2.append(r1)
            java.lang.String r0 = "\" paramIndex="
            r2.append(r0)
            r2.append(r3)
            java.lang.String r0 = " params="
            goto L_0x04f4
        L_0x04e0:
            r0 = r19
            if (r10 >= r0) goto L_0x0507
            boolean r0 = r18[r10]
            if (r0 != 0) goto L_0x0504
            java.lang.String r0 = "HSMRehydrationUtil/validateMessageAndBuildHsmText/error not all params are  used, paramIndex="
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r0)
            r2.append(r10)
            java.lang.String r0 = "; "
        L_0x04f4:
            r2.append(r0)
            r2.append(r7)
            java.lang.String r0 = r2.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0501:
            if (r4 == 0) goto L_0x0513
            return r4
        L_0x0504:
            int r10 = r10 + 1
            goto L_0x04e0
        L_0x0507:
            r1 = r17
            r0 = r20
            r1.appendTail(r0)
            java.lang.String r4 = r20.toString()
            goto L_0x0501
        L_0x0513:
            java.lang.String r1 = "HSMRehydrationUtil/validateMessageAndBuildHsmText/error params mismatch, loggableString="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r0 = 1000(0x3e8, float:1.401E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            com.obwhatsapp.jobqueue.job.HSMRehydrationUtil$SendStructUnavailableException r0 = new com.obwhatsapp.jobqueue.job.HSMRehydrationUtil$SendStructUnavailableException
            r0.<init>(r1)
            throw r0
        L_0x0530:
            java.lang.String r1 = "HSMRehydrationUtil/validateMessageAndBuildHsmText/error no translated_text available, loggableString="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r0 = 1001(0x3e9, float:1.403E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            com.obwhatsapp.jobqueue.job.HSMRehydrationUtil$SendStructUnavailableException r0 = new com.obwhatsapp.jobqueue.job.HSMRehydrationUtil$SendStructUnavailableException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2R3.A01(android.content.Context, X.2IQ, X.2Cg, X.29b, java.lang.String, boolean, boolean):java.lang.String");
    }

    public static String A02(C58862uH r9, Locale locale) {
        int i2;
        StringBuilder sb = new StringBuilder();
        sb.append(locale);
        sb.append("@calendar=persian");
        ULocale uLocale = new ULocale(sb.toString());
        Calendar instance = Calendar.getInstance(uLocale);
        instance.clear();
        StringBuilder sb2 = new StringBuilder();
        boolean z2 = false;
        if ((r9.A00 & 2) == 2) {
            z2 = true;
        }
        if (z2) {
            instance.set(1, r9.A07);
            sb2.append("yyyy");
        }
        boolean z3 = false;
        if ((r9.A00 & 4) == 4) {
            z3 = true;
        }
        if (z3) {
            instance.set(2, r9.A06 - 1);
            sb2.append("MMMM");
        }
        boolean z4 = false;
        if ((r9.A00 & 8) == 8) {
            z4 = true;
        }
        if (z4) {
            instance.set(5, r9.A02);
            sb2.append("d");
        }
        int i3 = r9.A00;
        if ((i3 & 1) == 1) {
            sb2.append("EEEE");
        }
        if ((i3 & 16) == 16) {
            sb2.append("jjmm");
            instance.set(10, r9.A04);
            boolean z5 = false;
            if ((r9.A00 & 32) == 32) {
                z5 = true;
            }
            instance.set(12, z5 ? r9.A05 : 0);
        }
        int i4 = r9.A00;
        if (!((i4 & 1) != 1 || (i4 & 2) == 2 || (i4 & 4) == 4 || (i4 & 8) == 8 || (i4 & 16) == 16)) {
            AnonymousClass439 A002 = AnonymousClass439.A00(r9.A03);
            if (A002 == null) {
                A002 = AnonymousClass439.A02;
            }
            switch (A002.ordinal()) {
                case 0:
                    instance.set(7, 2);
                    break;
                case 1:
                    i2 = 3;
                    break;
                case 2:
                    i2 = 4;
                    break;
                case 3:
                    instance.set(7, 5);
                    break;
                case 4:
                    i2 = 6;
                    break;
                case 5:
                    instance.set(7, 7);
                    break;
                case 6:
                    instance.set(7, 1);
                    break;
                default:
                    Log.w("HSMRehydrationUtil/validateMessageAndBuildHsmText/error localized component time had invalid day-of-week");
                    return null;
            }
            instance.set(7, i2);
        }
        return new SimpleDateFormat(DateTimePatternGenerator.getInstance(uLocale).getBestPattern(sb2.toString()).replaceAll("([^\\p{Alpha}']|('[\\p{Alpha}]+'))*G+([^\\p{Alpha}']|('[\\p{Alpha}]+'))*", ""), uLocale).format(instance.getTime());
    }

    public static String A03(Locale locale, int i2) {
        return NumberFormat.getIntegerInstance(locale).format((long) i2);
    }

    public static void A04(C455029b r2, String str) {
        if ((r2.A00 & 2) != 2 || TextUtils.isEmpty(r2.A06) || (r2.A00 & 1) != 1 || TextUtils.isEmpty(r2.A09)) {
            StringBuilder sb = new StringBuilder("HSMRehydrationUtil/validateHsmMessage/error hsm missing element, loggableString=");
            sb.append(str);
            Log.e(sb.toString());
            throw new HSMRehydrationUtil$SendStructUnavailableException((Integer) null);
        }
    }
}
