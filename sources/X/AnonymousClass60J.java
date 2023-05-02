package X;

import java.io.IOException;

/* renamed from: X.60J  reason: invalid class name */
public class AnonymousClass60J implements C448025p {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass4UI A01;
    public final /* synthetic */ AnonymousClass2WZ A02;
    public final /* synthetic */ C35001lD A03;
    public final /* synthetic */ AnonymousClass5SD A04;
    public final /* synthetic */ C114685oK A05;
    public final /* synthetic */ Boolean A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ boolean A0A;

    public AnonymousClass60J(AnonymousClass4UI r1, AnonymousClass2WZ r2, C35001lD r3, AnonymousClass5SD r4, C114685oK r5, Boolean bool, String str, String str2, String str3, int i2, boolean z2) {
        this.A05 = r5;
        this.A08 = str;
        this.A03 = r3;
        this.A09 = str2;
        this.A07 = str3;
        this.A06 = bool;
        this.A02 = r2;
        this.A0A = z2;
        this.A04 = r4;
        this.A00 = i2;
        this.A01 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x008d, code lost:
        r5 = r1.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x009b, code lost:
        if ((8 - r0) != 0) goto L_0x009d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A5s(X.AnonymousClass2JT r21) {
        /*
            r20 = this;
            r0 = r21
            X.14R r3 = r0.A03
            X.14O r5 = r0.A02
            int r0 = r0.A00
            r12 = r20
            if (r0 != 0) goto L_0x0051
            java.lang.Object r0 = r5.A00
            if (r0 == 0) goto L_0x002e
            X.5oK r6 = r12.A05
            java.lang.String r4 = r12.A08
            java.lang.String r0 = (java.lang.String) r0
            int r0 = r0.length()
            java.lang.String r3 = "bloksPayloadResponse"
            java.util.HashMap r2 = X.AnonymousClass000.A0x()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "size"
            r2.put(r0, r1)
            X.5wM r0 = r6.A07
            r0.A01(r2, r4, r3)
        L_0x002e:
            X.1lD r3 = r12.A03
            if (r3 == 0) goto L_0x0149
            X.5oK r0 = r12.A05     // Catch:{ Exception -> 0x0143 }
            X.0zZ r13 = r0.A04     // Catch:{ Exception -> 0x0143 }
            java.lang.String r15 = r3.A01     // Catch:{ Exception -> 0x0143 }
            X.1IZ r2 = r0.A01     // Catch:{ Exception -> 0x0143 }
            java.lang.String r1 = r12.A09     // Catch:{ Exception -> 0x0143 }
            java.lang.String r0 = r12.A07     // Catch:{ Exception -> 0x0143 }
            java.lang.String r16 = r2.A00(r1, r0)     // Catch:{ Exception -> 0x0143 }
            java.lang.Object r14 = r5.A00     // Catch:{ Exception -> 0x0143 }
            long r0 = r3.A00     // Catch:{ Exception -> 0x0143 }
            boolean r2 = r3.A02     // Catch:{ Exception -> 0x0143 }
            r19 = r2
            r17 = r0
            r13.A03(r14, r15, r16, r17, r19)     // Catch:{ Exception -> 0x0143 }
            goto L_0x0149
        L_0x0051:
            X.5oK r1 = r12.A05
            X.2WZ r9 = r12.A02
            java.lang.String r14 = r12.A09
            X.4UI r8 = r12.A01
            java.lang.String r15 = r12.A07
            boolean r2 = r12.A0A
            X.1lD r10 = r12.A03
            java.lang.String r0 = r12.A08
            java.lang.Boolean r13 = r12.A06
            X.5SD r11 = r12.A04
            X.66v r7 = new X.66v
            r17 = r2
            r16 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r2 = 4
            if (r3 == 0) goto L_0x011b
            java.util.Map r0 = r3.A00
            if (r0 == 0) goto L_0x011b
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x011b
            java.lang.Object r6 = r3.A00(r9)
            java.lang.String r6 = (java.lang.String) r6
            X.5uR r0 = r1.A06
            X.5s7 r0 = r0.A00(r14)
            X.5s6 r0 = r0.A01
            X.144 r0 = r0.A01
            if (r0 == 0) goto L_0x009d
            X.14L r5 = r1.A02
            X.28T r4 = r5.A00(r0)
            if (r4 == 0) goto L_0x009d
            int r0 = r9.A00
            if (r0 == r2) goto L_0x00b0
            int r0 = 8 - r0
            if (r0 == 0) goto L_0x00c4
        L_0x009d:
            if (r6 == 0) goto L_0x0120
            r1.A02(r9, r11, r6)
        L_0x00a2:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = r0.equals(r13)
            if (r0 == 0) goto L_0x0167
            int r0 = r12.A00
            X.C114685oK.A00(r1, r0)
            return
        L_0x00b0:
            java.lang.Exception r0 = r9.A02
            if (r0 == 0) goto L_0x00c4
            boolean r0 = r0 instanceof org.json.JSONException
            if (r0 == 0) goto L_0x00c4
            boolean r0 = r8.A01()
            if (r0 == 0) goto L_0x00c4
            X.0sq r0 = r1.A03
            r0.Acl(r7)
            goto L_0x00a2
        L_0x00c4:
            boolean r0 = r8.A01()
            if (r0 == 0) goto L_0x00dc
            r19 = 0
            com.facebook.redex.IDxECallbackShape17S0400000_3_I1 r14 = new com.facebook.redex.IDxECallbackShape17S0400000_3_I1
            r15 = r9
            r16 = r11
            r17 = r1
            r18 = r7
            r14.<init>(r15, r16, r17, r18, r19)
            r5.A01(r4, r14, r8)
            goto L_0x00a2
        L_0x00dc:
            boolean r0 = r8.A01()
            if (r0 == 0) goto L_0x0109
            r19 = 1
            com.facebook.redex.IDxECallbackShape17S0400000_3_I1 r14 = new com.facebook.redex.IDxECallbackShape17S0400000_3_I1
            r15 = r9
            r16 = r11
            r17 = r1
            r18 = r7
            r14.<init>(r15, r16, r17, r18, r19)
            X.01D r0 = r5.A02
            java.lang.Object r3 = r0.get()
            X.14J r3 = (X.AnonymousClass14J) r3
            X.144 r2 = r4.A01
            X.5ha r0 = new X.5ha
            r9 = r14
            r10 = r5
            r11 = r8
            r6 = r0
            r7 = r4
            r8 = r14
            r6.<init>(r7, r8, r9, r10, r11)
            r3.A01(r2, r0)
            goto L_0x00a2
        L_0x0109:
            java.lang.Long r0 = r8.A00()
            if (r0 == 0) goto L_0x009d
            X.0sq r4 = r1.A03
            long r2 = r0.longValue()
            java.lang.String r0 = "BloksLayoutFetcherImpl/retryWithBackoff"
            r4.Ad4(r7, r0, r2)
            goto L_0x00a2
        L_0x011b:
            r9.A00 = r2
            java.lang.String r0 = "Something went wrong"
            goto L_0x013e
        L_0x0120:
            java.util.Map r0 = r3.A00
            java.util.Iterator r0 = X.AnonymousClass000.A0y(r0)
            java.util.Map$Entry r3 = X.AnonymousClass000.A0z(r0)
            r9.A00 = r2
            java.lang.String r0 = "Something went wrong :"
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0r(r0)
            java.lang.Object r0 = r3.getValue()
            X.1fg r0 = (X.C32121fg) r0
            java.lang.String r0 = r0.A04
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r2)
        L_0x013e:
            r1.A02(r9, r11, r0)
            goto L_0x00a2
        L_0x0143:
            r1 = move-exception
            java.lang.String r0 = "BloksLayoutFetcherImpl failed to save the bk-cache"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0149:
            java.lang.Boolean r0 = r12.A06
            if (r0 == 0) goto L_0x0168
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0168
            X.5oK r0 = r12.A05
            X.5wM r3 = r0.A07
            int r0 = r12.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r2 = X.AnonymousClass5wM.A00(r0)
            r1 = 0
            java.lang.String r0 = "prefetchResponse"
            r3.A01(r1, r2, r0)
        L_0x0167:
            return
        L_0x0168:
            X.5oK r4 = r12.A05
            java.lang.Object r3 = r5.A00
            java.lang.String r3 = (java.lang.String) r3
            X.2WZ r2 = r12.A02
            boolean r1 = r12.A0A
            X.5SD r0 = r12.A04
            r4.A00(r2, r0, r3, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass60J.A5s(X.2JT):void");
    }

    public void APZ(IOException iOException) {
        AnonymousClass2WZ r3 = this.A02;
        r3.A02 = iOException;
        r3.A00 = 7;
        C114685oK r2 = this.A05;
        r2.A02(r3, this.A04, iOException.getLocalizedMessage());
        C114685oK.A00(r2, this.A00);
    }

    public void AQa(Exception exc) {
        AnonymousClass2WZ r3 = this.A02;
        r3.A02 = exc;
        r3.A00 = 4;
        C114685oK r2 = this.A05;
        r2.A02(r3, this.A04, exc.getLocalizedMessage());
        C114685oK.A00(r2, this.A00);
    }
}
