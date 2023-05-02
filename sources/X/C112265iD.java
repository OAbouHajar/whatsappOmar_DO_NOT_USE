package X;

import org.json.JSONObject;

/* renamed from: X.5iD  reason: invalid class name and case insensitive filesystem */
public class C112265iD extends C116635rh {
    public JSONObject A00;
    public JSONObject A01;
    public JSONObject A02;
    public JSONObject A03;
    public final C16440t3 A04;
    public final C14710pd A05;
    public final C17190ug A06;

    public C112265iD(C16440t3 r2, C14710pd r3, C17190ug r4, C119365wy r5, C18310wU r6) {
        super(r5.A04, r6);
        this.A04 = r2;
        this.A05 = r3;
        this.A06 = r4;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00eb, code lost:
        if (r4.A03.equals(r0.A01.getString(r10)) == false) goto L_0x00fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ed, code lost:
        r3 = "Matches";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00ef, code lost:
        r5.put(r6, X.AnonymousClass000.A0h(" in salt and request params", X.AnonymousClass000.A0q(r3)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00fd, code lost:
        r3 = "Mismatches";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(java.lang.String r23, java.util.List r24) {
        /*
            r22 = this;
            r0 = r22
            X.0pd r2 = r0.A05
            r1 = 635(0x27b, float:8.9E-43)
            boolean r1 = r2.A0C(r1)
            if (r1 == 0) goto L_0x0015
            r2 = r23
            int r1 = r2.hashCode()
            switch(r1) {
                case -120834421: goto L_0x0042;
                case 83413: goto L_0x0035;
                case 1282366491: goto L_0x0016;
                default: goto L_0x0015;
            }
        L_0x0015:
            return
        L_0x0016:
            java.lang.String r3 = "SIM_SWAP"
            boolean r1 = r2.equals(r3)
            if (r1 == 0) goto L_0x0015
            java.lang.String r5 = "event-ts"
            java.util.ArrayList r4 = X.AnonymousClass000.A0u()
            java.lang.String r2 = "action"
            java.lang.String r1 = "upi-log-event"
            X.C110105dW.A1P(r2, r1, r4)
            java.lang.String r1 = "event-id"
            X.C110105dW.A1P(r1, r3, r4)
            long r2 = java.lang.System.currentTimeMillis()
            goto L_0x0060
        L_0x0035:
            java.lang.String r9 = "U66"
            boolean r1 = r2.equals(r9)
            if (r1 == 0) goto L_0x0015
            org.json.JSONObject r1 = r0.A01
            if (r1 == 0) goto L_0x0015
            goto L_0x008e
        L_0x0042:
            java.lang.String r3 = "SKIPPED_DEVICE_BINDING"
            boolean r1 = r2.equals(r3)
            if (r1 == 0) goto L_0x0015
            java.util.ArrayList r6 = X.AnonymousClass000.A0u()
            java.lang.String r2 = "action"
            java.lang.String r1 = "upi-log-event"
            X.C110105dW.A1P(r2, r1, r6)
            java.lang.String r1 = "event-id"
            X.C110105dW.A1P(r1, r3, r6)
            long r3 = java.lang.System.currentTimeMillis()
            goto L_0x01b3
        L_0x0060:
            org.json.JSONObject r1 = r0.A03     // Catch:{ JSONException -> 0x006b }
            r1.put(r5, r2)     // Catch:{ JSONException -> 0x006b }
            org.json.JSONObject r1 = r0.A02     // Catch:{ JSONException -> 0x006b }
            r1.put(r5, r2)     // Catch:{ JSONException -> 0x006b }
            goto L_0x006f
        L_0x006b:
            r1 = move-exception
            r1.printStackTrace()
        L_0x006f:
            org.json.JSONObject r1 = r0.A03
            java.lang.String r2 = r1.toString()
            java.lang.String r1 = "event-info"
            X.C110105dW.A1P(r1, r2, r4)
            org.json.JSONObject r1 = r0.A02
            java.lang.String r2 = r1.toString()
            java.lang.String r1 = "event-dl-info"
            X.C110105dW.A1P(r1, r2, r4)
            X.0wU r5 = r0.A01
            X.1Vv r3 = X.C110105dW.A0V(r4)
            r2 = 0
            goto L_0x01dc
        L_0x008e:
            X.0ug r12 = r0.A06     // Catch:{ JSONException -> 0x01ad }
            java.lang.String r15 = r12.A02()     // Catch:{ JSONException -> 0x01ad }
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ JSONException -> 0x01ad }
            org.json.JSONObject r7 = X.C13700nu.A0J()     // Catch:{ JSONException -> 0x01ad }
            java.lang.String r8 = "event-ts"
            r7.put(r8, r1)     // Catch:{ JSONException -> 0x01ad }
            org.json.JSONObject r5 = X.C13700nu.A0J()     // Catch:{ JSONException -> 0x01ad }
            java.util.Iterator r11 = r24.iterator()     // Catch:{ JSONException -> 0x01ad }
        L_0x00a9:
            boolean r3 = r11.hasNext()     // Catch:{ JSONException -> 0x01ad }
            if (r3 == 0) goto L_0x0100
            java.lang.Object r4 = r11.next()     // Catch:{ JSONException -> 0x01ad }
            X.1lL r4 = (X.C35081lL) r4     // Catch:{ JSONException -> 0x01ad }
            java.lang.String r6 = r4.A02     // Catch:{ JSONException -> 0x01ad }
            int r3 = r6.hashCode()     // Catch:{ JSONException -> 0x01ad }
            switch(r3) {
                case -1413853096: goto L_0x00d5;
                case -756180983: goto L_0x00ca;
                case 996422991: goto L_0x00bf;
                default: goto L_0x00be;
            }     // Catch:{ JSONException -> 0x01ad }
        L_0x00be:
            goto L_0x00a9
        L_0x00bf:
            java.lang.String r3 = "sender-vpa"
            boolean r3 = r6.equals(r3)     // Catch:{ JSONException -> 0x01ad }
            if (r3 == 0) goto L_0x00a9
            java.lang.String r10 = "payerAddr"
            goto L_0x00df
        L_0x00ca:
            java.lang.String r3 = "receiver-vpa"
            boolean r3 = r6.equals(r3)     // Catch:{ JSONException -> 0x01ad }
            if (r3 == 0) goto L_0x00a9
            java.lang.String r10 = "payeeAddr"
            goto L_0x00df
        L_0x00d5:
            java.lang.String r3 = "amount"
            boolean r3 = r6.equals(r3)     // Catch:{ JSONException -> 0x01ad }
            if (r3 == 0) goto L_0x00a9
            java.lang.String r10 = "txnAmount"
        L_0x00df:
            java.lang.String r4 = r4.A03     // Catch:{ JSONException -> 0x01ad }
            org.json.JSONObject r3 = r0.A01     // Catch:{ JSONException -> 0x01ad }
            java.lang.String r3 = r3.getString(r10)     // Catch:{ JSONException -> 0x01ad }
            boolean r3 = r4.equals(r3)     // Catch:{ JSONException -> 0x01ad }
            if (r3 == 0) goto L_0x00fd
            java.lang.String r3 = "Matches"
        L_0x00ef:
            java.lang.StringBuilder r4 = X.AnonymousClass000.A0q(r3)     // Catch:{ JSONException -> 0x01ad }
            java.lang.String r3 = " in salt and request params"
            java.lang.String r3 = X.AnonymousClass000.A0h(r3, r4)     // Catch:{ JSONException -> 0x01ad }
            r5.put(r6, r3)     // Catch:{ JSONException -> 0x01ad }
            goto L_0x00a9
        L_0x00fd:
            java.lang.String r3 = "Mismatches"
            goto L_0x00ef
        L_0x0100:
            java.lang.String r6 = "request-params"
            r7.put(r6, r5)     // Catch:{ JSONException -> 0x01ad }
            org.json.JSONObject r5 = X.C13700nu.A0J()     // Catch:{ JSONException -> 0x01ad }
            r5.put(r8, r1)     // Catch:{ JSONException -> 0x01ad }
            org.json.JSONObject r4 = X.C13700nu.A0J()     // Catch:{ JSONException -> 0x01ad }
            org.json.JSONObject r1 = r0.A01     // Catch:{ JSONException -> 0x01ad }
            java.util.Iterator r3 = r1.keys()     // Catch:{ JSONException -> 0x01ad }
        L_0x0116:
            boolean r1 = r3.hasNext()     // Catch:{ JSONException -> 0x01ad }
            if (r1 == 0) goto L_0x012e
            java.lang.String r2 = X.AnonymousClass000.A0m(r3)     // Catch:{ JSONException -> 0x01ad }
            org.json.JSONObject r1 = r0.A01     // Catch:{ JSONException -> 0x01ad }
            java.lang.Object r1 = r1.get(r2)     // Catch:{ JSONException -> 0x01ad }
            java.lang.String r1 = r1.toString()     // Catch:{ JSONException -> 0x01ad }
            r4.put(r2, r1)     // Catch:{ JSONException -> 0x01ad }
            goto L_0x0116
        L_0x012e:
            java.lang.String r1 = "salt-params"
            r5.put(r1, r4)     // Catch:{ JSONException -> 0x01ad }
            org.json.JSONObject r4 = X.C13700nu.A0J()     // Catch:{ JSONException -> 0x01ad }
            java.util.Iterator r3 = r24.iterator()     // Catch:{ JSONException -> 0x01ad }
        L_0x013b:
            boolean r1 = r3.hasNext()     // Catch:{ JSONException -> 0x01ad }
            if (r1 == 0) goto L_0x014f
            java.lang.Object r1 = r3.next()     // Catch:{ JSONException -> 0x01ad }
            X.1lL r1 = (X.C35081lL) r1     // Catch:{ JSONException -> 0x01ad }
            java.lang.String r2 = r1.A02     // Catch:{ JSONException -> 0x01ad }
            java.lang.String r1 = r1.A03     // Catch:{ JSONException -> 0x01ad }
            r4.put(r2, r1)     // Catch:{ JSONException -> 0x01ad }
            goto L_0x013b
        L_0x014f:
            r5.put(r6, r4)     // Catch:{ JSONException -> 0x01ad }
            java.lang.String r8 = r7.toString()     // Catch:{ JSONException -> 0x01ad }
            java.lang.String r7 = r5.toString()     // Catch:{ JSONException -> 0x01ad }
            X.2cK r4 = new X.2cK     // Catch:{ JSONException -> 0x01ad }
            r4.<init>(r15)     // Catch:{ JSONException -> 0x01ad }
            X.1gQ r6 = X.C110105dW.A0X()     // Catch:{ JSONException -> 0x01ad }
            X.1gQ r3 = X.C110105dW.A0Y(r6)     // Catch:{ JSONException -> 0x01ad }
            java.lang.String r2 = "action"
            java.lang.String r1 = "upi-log-event"
            X.C32461gQ.A00(r3, r2, r1)     // Catch:{ JSONException -> 0x01ad }
            r5 = 0
            r1 = 1
            boolean r1 = X.C110115dX.A1A(r9, r1, r5)     // Catch:{ JSONException -> 0x01ad }
            if (r1 == 0) goto L_0x017c
            java.lang.String r1 = "event-id"
            X.C32461gQ.A00(r3, r1, r9)     // Catch:{ JSONException -> 0x01ad }
        L_0x017c:
            r19 = 10000(0x2710, double:4.9407E-320)
            r17 = 1
            r21 = 0
            r16 = r8
            boolean r1 = X.C32271fx.A0D(r16, r17, r19, r21)     // Catch:{ JSONException -> 0x01ad }
            if (r1 == 0) goto L_0x018f
            java.lang.String r1 = "event-info"
            X.C32461gQ.A00(r3, r1, r8)     // Catch:{ JSONException -> 0x01ad }
        L_0x018f:
            r16 = r7
            boolean r1 = X.C32271fx.A0D(r16, r17, r19, r21)     // Catch:{ JSONException -> 0x01ad }
            if (r1 == 0) goto L_0x019c
            java.lang.String r1 = "event-dl-info"
            X.C32461gQ.A00(r3, r1, r7)     // Catch:{ JSONException -> 0x01ad }
        L_0x019c:
            X.1Vv r14 = X.C110105dW.A0T(r3, r6, r4)     // Catch:{ JSONException -> 0x01ad }
            r16 = 204(0xcc, float:2.86E-43)
            com.facebook.redex.IDxRCallbackShape232S0100000_3_I1 r13 = new com.facebook.redex.IDxRCallbackShape232S0100000_3_I1     // Catch:{ JSONException -> 0x01ad }
            r13.<init>(r0, r5)     // Catch:{ JSONException -> 0x01ad }
            r17 = 0
            r12.A0A(r13, r14, r15, r16, r17)     // Catch:{ JSONException -> 0x01ad }
            return
        L_0x01ad:
            java.lang.String r0 = "PAY: IndiaUpiLogEventAction: exception while creating collecting U66 event info"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        L_0x01b3:
            org.json.JSONObject r2 = r0.A00     // Catch:{ JSONException -> 0x01bb }
            java.lang.String r1 = "event-ts"
            r2.put(r1, r3)     // Catch:{ JSONException -> 0x01bb }
            goto L_0x01bf
        L_0x01bb:
            r1 = move-exception
            r1.printStackTrace()
        L_0x01bf:
            org.json.JSONObject r1 = r0.A00
            java.lang.String r2 = r1.toString()
            java.lang.String r1 = "event-info"
            X.C110105dW.A1P(r1, r2, r6)
            org.json.JSONObject r1 = r0.A00
            java.lang.String r2 = r1.toString()
            java.lang.String r1 = "event-dl-info"
            X.C110105dW.A1P(r1, r2, r6)
            X.0wU r5 = r0.A01
            X.1Vv r3 = X.C110105dW.A0V(r6)
            r2 = 1
        L_0x01dc:
            com.facebook.redex.IDxRCallbackShape449S0100000_3_I1 r1 = new com.facebook.redex.IDxRCallbackShape449S0100000_3_I1
            r1.<init>(r0, r2)
            r5.A0D(r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C112265iD.A00(java.lang.String, java.util.List):void");
    }
}
