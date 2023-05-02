package X;

import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: X.4Yo  reason: invalid class name */
public class AnonymousClass4Yo {
    public static Map A00 = Collections.synchronizedMap(new WeakHashMap());

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C107315Hg A00(java.net.URI r22, java.security.cert.X509Certificate r23, java.util.List r24, X.AnonymousClass5I1 r25, X.C85284Nv r26, X.AnonymousClass5NQ r27) {
        /*
            java.lang.String r21 = "configuration error: "
            java.util.Map r2 = A00
            r8 = r22
            java.lang.Object r0 = r2.get(r8)
            java.lang.ref.Reference r0 = (java.lang.ref.Reference) r0
            r6 = 0
            r7 = r25
            r3 = r26
            if (r0 == 0) goto L_0x0096
            java.lang.Object r10 = r0.get()
            java.util.Map r10 = (java.util.Map) r10
            if (r10 == 0) goto L_0x0096
            java.lang.Object r9 = r10.get(r7)
            X.5Hg r9 = (X.C107315Hg) r9
            if (r9 == 0) goto L_0x0096
            X.5Ht r0 = r9.A01
            X.5Ib r0 = r0.A01
            X.5Ib r0 = X.C107405Ib.A01(r0)
            byte[] r1 = r0.A00
            boolean r0 = r1 instanceof X.AnonymousClass5I0
            if (r0 == 0) goto L_0x0085
            X.5I0 r1 = (X.AnonymousClass5I0) r1
        L_0x0033:
            X.5IC r0 = r1.A02
            if (r0 != 0) goto L_0x0038
            r0 = 0
        L_0x0038:
            X.1gJ r11 = r0.A02
            r5 = 0
        L_0x003b:
            int r0 = r11.A0A()
            if (r5 == r0) goto L_0x0093
            X.1fb r1 = r11.A0C(r5)
            boolean r0 = r1 instanceof X.AnonymousClass5Hj
            if (r0 == 0) goto L_0x0077
            X.5Hj r1 = (X.AnonymousClass5Hj) r1
        L_0x004b:
            X.5I1 r0 = r1.A02
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0074
            X.5Ia r12 = r1.A00
            if (r12 == 0) goto L_0x0074
            java.util.Date r0 = r3.A04     // Catch:{ ParseException -> 0x0070 }
            long r0 = r0.getTime()     // Catch:{ ParseException -> 0x0070 }
            java.util.Date r4 = new java.util.Date     // Catch:{ ParseException -> 0x0070 }
            r4.<init>(r0)     // Catch:{ ParseException -> 0x0070 }
            java.util.Date r0 = r12.A0C()     // Catch:{ ParseException -> 0x0070 }
            boolean r0 = r4.after(r0)     // Catch:{ ParseException -> 0x0070 }
            if (r0 == 0) goto L_0x0074
            r10.remove(r7)     // Catch:{ ParseException -> 0x0070 }
            goto L_0x0073
        L_0x0070:
            r10.remove(r7)
        L_0x0073:
            r9 = r6
        L_0x0074:
            int r5 = r5 + 1
            goto L_0x003b
        L_0x0077:
            if (r1 == 0) goto L_0x0083
            X.1gJ r0 = X.C32411gJ.A00(r1)
            X.5Hj r1 = new X.5Hj
            r1.<init>(r0)
            goto L_0x004b
        L_0x0083:
            r1 = 0
            goto L_0x004b
        L_0x0085:
            if (r1 == 0) goto L_0x0091
            X.1gJ r0 = X.C32411gJ.A00(r1)
            X.5I0 r1 = new X.5I0
            r1.<init>(r0)
            goto L_0x0033
        L_0x0091:
            r1 = 0
            goto L_0x0033
        L_0x0093:
            if (r9 == 0) goto L_0x0096
            return r9
        L_0x0096:
            java.net.URL r14 = r8.toURL()     // Catch:{ MalformedURLException -> 0x01fe }
            X.1gH r11 = new X.1gH
            r11.<init>()
            X.5Hf r0 = new X.5Hf
            r0.<init>(r7)
            r11.A02(r0)
            X.1gH r10 = new X.1gH
            r10.<init>()
            r9 = r6
            r12 = 0
        L_0x00ae:
            r1 = r24
            int r0 = r1.size()
            if (r12 == r0) goto L_0x00e4
            java.lang.Object r13 = r1.get(r12)
            java.security.cert.Extension r13 = (java.security.cert.Extension) r13
            byte[] r5 = r13.getValue()
            java.lang.String r1 = "1.3.6.1.5.5.7.48.1.2"
            java.lang.String r0 = r13.getId()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00cd
            r9 = r5
        L_0x00cd:
            java.lang.String r0 = r13.getId()
            X.1fY r4 = X.AnonymousClass3K3.A0w(r0)
            boolean r1 = r13.isCritical()
            X.5IH r0 = new X.5IH
            r0.<init>(r4, r5, r1)
            r10.A02(r0)
            int r12 = r12 + 1
            goto L_0x00ae
        L_0x00e4:
            X.1gI r4 = new X.1gI
            r4.<init>((X.C32391gH) r11)
            X.1gI r0 = new X.1gI
            r0.<init>((X.C32391gH) r10)
            X.5Hu r0 = X.C107335Hu.A01(r0)
            X.5Hy r1 = new X.5Hy
            r1.<init>(r4, r0)
            X.5Hd r0 = new X.5Hd     // Catch:{  }
            r0.<init>(r1)     // Catch:{  }
            byte[] r5 = r0.A01()     // Catch:{  }
            java.net.URLConnection r4 = r14.openConnection()     // Catch:{  }
            java.net.HttpURLConnection r4 = (java.net.HttpURLConnection) r4     // Catch:{  }
            r0 = 15000(0x3a98, float:2.102E-41)
            r4.setConnectTimeout(r0)     // Catch:{  }
            r4.setReadTimeout(r0)     // Catch:{  }
            r0 = 1
            r4.setDoOutput(r0)     // Catch:{  }
            r4.setDoInput(r0)     // Catch:{  }
            java.lang.String r0 = "POST"
            r4.setRequestMethod(r0)     // Catch:{  }
            java.lang.String r1 = "Content-type"
            java.lang.String r0 = "application/ocsp-request"
            r4.setRequestProperty(r1, r0)     // Catch:{  }
            java.lang.String r1 = "Content-length"
            int r0 = r5.length     // Catch:{  }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{  }
            r4.setRequestProperty(r1, r0)     // Catch:{  }
            java.io.OutputStream r0 = r4.getOutputStream()     // Catch:{  }
            r0.write(r5)     // Catch:{  }
            r0.flush()     // Catch:{  }
            java.io.InputStream r15 = r4.getInputStream()     // Catch:{  }
            int r0 = r4.getContentLength()     // Catch:{  }
            if (r0 >= 0) goto L_0x0142
            r0 = 32768(0x8000, float:4.5918E-41)
        L_0x0142:
            java.io.ByteArrayOutputStream r14 = new java.io.ByteArrayOutputStream     // Catch:{  }
            r14.<init>()     // Catch:{  }
            long r4 = (long) r0     // Catch:{  }
            r13 = 4096(0x1000, float:5.74E-42)
            byte[] r12 = new byte[r13]     // Catch:{  }
            r19 = 0
        L_0x014e:
            r11 = 0
            int r10 = r15.read(r12, r11, r13)     // Catch:{  }
            if (r10 < 0) goto L_0x0168
            long r17 = r4 - r19
            long r0 = (long) r10     // Catch:{  }
            int r16 = (r17 > r0 ? 1 : (r17 == r0 ? 0 : -1))
            if (r16 < 0) goto L_0x0162
            long r19 = r19 + r0
            r14.write(r12, r11, r10)     // Catch:{  }
            goto L_0x014e
        L_0x0162:
            X.40E r0 = new X.40E     // Catch:{  }
            r0.<init>()     // Catch:{  }
            throw r0     // Catch:{  }
        L_0x0168:
            byte[] r4 = r14.toByteArray()     // Catch:{  }
            boolean r0 = r4 instanceof X.C107315Hg     // Catch:{  }
            if (r0 == 0) goto L_0x0181
            X.5Hg r4 = (X.C107315Hg) r4     // Catch:{  }
        L_0x0172:
            X.5He r0 = r4.A00     // Catch:{  }
            X.5IZ r1 = r0.A00     // Catch:{  }
            int r0 = r1.A0A()     // Catch:{  }
            if (r0 != 0) goto L_0x01e5
            X.5Ht r5 = r4.A01     // Catch:{  }
            if (r5 != 0) goto L_0x0190
            goto L_0x018f
        L_0x0181:
            if (r4 == 0) goto L_0x018d
            X.1gJ r0 = X.C32411gJ.A00(r4)     // Catch:{  }
            X.5Hg r4 = new X.5Hg     // Catch:{  }
            r4.<init>(r0)     // Catch:{  }
            goto L_0x0172
        L_0x018d:
            r4 = 0
            goto L_0x0172
        L_0x018f:
            r5 = 0
        L_0x0190:
            X.1fY r1 = r5.A00     // Catch:{  }
            X.1fY r0 = X.C109655Tb.A02     // Catch:{  }
            boolean r0 = r1.A04(r0)     // Catch:{  }
            if (r0 == 0) goto L_0x01de
            X.5Ib r0 = r5.A01     // Catch:{  }
            byte[] r1 = r0.A00     // Catch:{  }
            boolean r0 = r1 instanceof X.AnonymousClass5I0     // Catch:{  }
            if (r0 == 0) goto L_0x01c0
            X.5I0 r1 = (X.AnonymousClass5I0) r1     // Catch:{  }
        L_0x01a4:
            r5 = r23
            r0 = r27
            boolean r0 = X.AnonymousClass5A7.A00(r5, r1, r3, r0, r9)     // Catch:{  }
            if (r0 == 0) goto L_0x01de
            java.lang.Object r0 = r2.get(r8)     // Catch:{  }
            java.lang.ref.Reference r0 = (java.lang.ref.Reference) r0     // Catch:{  }
            if (r0 == 0) goto L_0x01cf
            java.lang.Object r0 = r0.get()     // Catch:{  }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{  }
            r0.put(r7, r4)     // Catch:{  }
            goto L_0x01ce
        L_0x01c0:
            if (r1 == 0) goto L_0x01cc
            X.1gJ r0 = X.C32411gJ.A00(r1)     // Catch:{  }
            X.5I0 r1 = new X.5I0     // Catch:{  }
            r1.<init>(r0)     // Catch:{  }
            goto L_0x01a4
        L_0x01cc:
            r1 = 0
            goto L_0x01a4
        L_0x01ce:
            return r4
        L_0x01cf:
            java.util.HashMap r0 = X.AnonymousClass000.A0x()     // Catch:{  }
            r0.put(r7, r4)     // Catch:{  }
            java.lang.ref.WeakReference r0 = X.C13690nt.A0h(r0)     // Catch:{  }
            r2.put(r8, r0)     // Catch:{  }
            return r4
        L_0x01de:
            java.lang.String r0 = "OCSP response failed to validate"
            java.security.cert.CertPathValidatorException r0 = X.C85284Nv.A00(r0, r6, r3)     // Catch:{  }
            goto L_0x01fd
        L_0x01e5:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0o()     // Catch:{  }
            java.lang.String r0 = "OCSP responder failed: "
            r2.append(r0)     // Catch:{  }
            byte[] r1 = r1.A01     // Catch:{  }
            java.math.BigInteger r0 = new java.math.BigInteger     // Catch:{  }
            r0.<init>(r1)     // Catch:{  }
            java.lang.String r0 = X.AnonymousClass000.A0f(r0, r2)     // Catch:{  }
            java.security.cert.CertPathValidatorException r0 = X.C85284Nv.A00(r0, r6, r3)     // Catch:{  }
        L_0x01fd:
            throw r0     // Catch:{  }
        L_0x01fe:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0q(r21)
            java.lang.String r0 = r2.getMessage()
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)
            java.security.cert.CertPathValidatorException r0 = X.C85284Nv.A00(r0, r2, r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4Yo.A00(java.net.URI, java.security.cert.X509Certificate, java.util.List, X.5I1, X.4Nv, X.5NQ):X.5Hg");
    }
}
