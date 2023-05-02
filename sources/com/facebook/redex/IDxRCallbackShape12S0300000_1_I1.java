package com.facebook.redex;

import X.AnonymousClass000;
import X.AnonymousClass4F3;
import X.AnonymousClass4F4;
import X.AnonymousClass4NK;
import X.C13680ns;
import X.C19550yc;
import X.C28371Vv;
import X.C29961bW;
import X.C29971bX;
import X.C34451kH;
import X.C40871up;
import com.obwhatsapp.report.ReportActivity;
import com.whatsapp.util.Log;

public class IDxRCallbackShape12S0300000_1_I1 implements C19550yc {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public IDxRCallbackShape12S0300000_1_I1(Object obj, Object obj2, Object obj3, int i2) {
        this.A03 = i2;
        this.A00 = obj2;
        this.A02 = obj3;
        this.A01 = obj;
    }

    public void APb(String str) {
        C29961bW r1;
        String str2;
        String str3;
        switch (this.A03) {
            case 0:
                Log.i(C13680ns.A0h("GroupXmppMethods/sendGetGroupInfoByInviteAddKey/onDeliveryFailure; iq=", str));
                r1 = (C29961bW) this.A01;
                str2 = "sendGetGroupInfoByInviteAddKey IQ was not delivered: iq=";
                break;
            case 1:
                Log.i(C13680ns.A0h("GroupXmppMethods/sendGetGroupProfile/onDeliveryFailure; iq=", str));
                return;
            case 2:
                Log.i(C13680ns.A0h("GroupXmppMethods/sendSetGroupDescription/onDeliveryFailure; iq=", str));
                r1 = (C29961bW) this.A01;
                str2 = "sendSetGroupDescription IQ was not delivered: iq=";
                break;
            case 3:
                str3 = "GdprXmppMethods/sendRequestGdprReport/onDeliveryFailure; iq=";
                break;
            case 4:
                str3 = "GdprXmppMethods/sendGetGdprReport/onDeliveryFailure; iq=";
                break;
            default:
                return;
        }
        Log.i(C13680ns.A0h(str3, str));
        r1 = (C29961bW) this.A01;
        str2 = "XMPP IQ was not delivered: iq=";
        C29971bX.A03(r1, C13680ns.A0h(str2, str));
    }

    public void AQe(C28371Vv r7, String str) {
        switch (this.A03) {
            case 0:
                ((C40871up) this.A02).AQR(C34451kH.A00(r7));
                break;
            case 1:
                Log.w(C13680ns.A0c(C34451kH.A00(r7), "ViewGroupInviteActivity/failed-to-get-group-photo/"));
                return;
            case 2:
                AnonymousClass4NK r0 = (AnonymousClass4NK) this.A02;
                r0.A00.A0K(new RunnableRunnableShape1S1101000_I1(r0.A03, r0.A04, C34451kH.A00(r7), 1));
                break;
            case 3:
                int A002 = C34451kH.A00(r7);
                StringBuilder A0r = AnonymousClass000.A0r("GdprXmppMethods/sendRequestGdprReport/onError; iq=");
                A0r.append(str);
                A0r.append(", error=");
                A0r.append(A002);
                C13680ns.A1V(A0r);
                Log.e(C13680ns.A0c(A002, "send-request-gdpr-report/failed/error "));
                ReportActivity reportActivity = ((AnonymousClass4F3) this.A02).A00;
                reportActivity.A05.A0K(new RunnableRunnableShape14S0100000_I0_13((Object) reportActivity, 7));
                break;
            case 4:
                int A003 = C34451kH.A00(r7);
                StringBuilder A0r2 = AnonymousClass000.A0r("GdprXmppMethods/sendGetGdprReport/onError; iq=");
                A0r2.append(str);
                A0r2.append(", errorCode=");
                A0r2.append(A003);
                C13680ns.A1V(A0r2);
                AnonymousClass4F4 r1 = (AnonymousClass4F4) this.A02;
                if (A003 != 404) {
                    Log.e(C13680ns.A0c(A003, "send-get-gdpr-report/failed/error "));
                    break;
                } else {
                    ReportActivity reportActivity2 = r1.A00;
                    if (reportActivity2.A0M.A01() == 1) {
                        reportActivity2.A0M.A04();
                        break;
                    }
                }
                break;
            default:
                return;
        }
        C29971bX.A04(this.A01);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void AYG(X.C28371Vv r24, java.lang.String r25) {
        /*
            r23 = this;
            r3 = r23
            int r0 = r3.A03
            r1 = r24
            r4 = r25
            switch(r0) {
                case 0: goto L_0x0113;
                case 1: goto L_0x00e7;
                case 2: goto L_0x00d1;
                case 3: goto L_0x0096;
                case 4: goto L_0x000c;
                default: goto L_0x000b;
            }
        L_0x000b:
            return
        L_0x000c:
            java.lang.String r0 = "GdprXmppMethods/sendGetGdprReport/onSuccess; iq="
            java.lang.String r0 = X.C13680ns.A0h(r0, r4)
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r0 = "gdpr"
            X.1Vv r2 = r1.A0J(r0)
            if (r2 == 0) goto L_0x006f
            java.lang.String r0 = "document"
            X.1Vv r7 = r2.A0J(r0)
            r4 = 0
            r8 = 1000(0x3e8, double:4.94E-321)
            if (r7 == 0) goto L_0x0060
            java.lang.Object r6 = r3.A02
            X.4F4 r6 = (X.AnonymousClass4F4) r6
            java.lang.String r0 = "creation"
            long r11 = r7.A0D(r0, r4)
            long r11 = r11 * r8
            byte[] r10 = r7.A01
            java.lang.Object r0 = r3.A00
            X.4Ig r0 = (X.C83844Ig) r0
            X.0t3 r0 = r0.A00
            long r1 = r0.A00()
            r4 = 2592000000(0x9a7ec800, double:1.280618154E-314)
            long r1 = r1 + r4
            long r1 = r1 / r8
            java.lang.String r0 = "expiration"
            long r13 = r7.A0D(r0, r1)
            long r13 = r13 * r8
            com.obwhatsapp.report.ReportActivity r2 = r6.A00
            X.12x r0 = r2.A0M
            int r1 = r0.A01()
            r0 = 3
            if (r1 >= r0) goto L_0x00e1
            X.12x r9 = r2.A0M
            r9.A06(r10, r11, r13)
            goto L_0x00e1
        L_0x0060:
            java.lang.Object r1 = r3.A02
            X.4F4 r1 = (X.AnonymousClass4F4) r1
            java.lang.String r0 = "timestamp"
            long r4 = r2.A0D(r0, r4)
            long r4 = r4 * r8
            com.obwhatsapp.report.ReportActivity r0 = r1.A00
            goto L_0x00b9
        L_0x006f:
            java.lang.String r0 = "GdprXmppMethods/sendGetGdprReport/onSuccess; no GDPR node, iq="
            java.lang.String r0 = X.C13680ns.A0h(r0, r4)
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r1 = 0
            java.lang.String r0 = "send-get-gdpr-report/failed/error "
            java.lang.String r0 = X.C13680ns.A0c(r1, r0)
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.lang.Object r2 = r3.A01
            X.1bW r2 = (X.C29961bW) r2
            java.lang.String r0 = "Invalid response from server for GDPR report request: iq="
            java.lang.String r1 = X.C13680ns.A0h(r0, r4)
            X.1W9 r0 = new X.1W9
            r0.<init>((java.lang.String) r1)
            r2.A05(r0)
            return
        L_0x0096:
            java.lang.String r0 = "GdprXmppMethods/sendRequestGdprReport/onSuccess; iq="
            java.lang.String r0 = X.C13680ns.A0h(r0, r4)
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r0 = "gdpr"
            X.1Vv r1 = r1.A0J(r0)
            r4 = 0
            if (r1 == 0) goto L_0x00b3
            java.lang.String r0 = "timestamp"
            long r0 = r1.A0D(r0, r4)
            r4 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 * r0
        L_0x00b3:
            java.lang.Object r0 = r3.A02
            X.4F3 r0 = (X.AnonymousClass4F3) r0
            com.obwhatsapp.report.ReportActivity r0 = r0.A00
        L_0x00b9:
            X.12x r2 = r0.A0M
            monitor-enter(r2)
            java.lang.String r0 = "gdpr/on-report-requested"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00ce }
            X.0rz r1 = r2.A0D     // Catch:{ all -> 0x00ce }
            r0 = 1
            r1.A0h(r0)     // Catch:{ all -> 0x00ce }
            java.lang.String r0 = "gdpr_report_timestamp"
            r1.A14(r0, r4)     // Catch:{ all -> 0x00ce }
            monitor-exit(r2)
            goto L_0x00e1
        L_0x00ce:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x00d1:
            java.lang.Object r0 = r3.A02
            X.4NK r0 = (X.AnonymousClass4NK) r0
            X.11A r2 = r0.A01
            X.0sH r0 = r0.A02
            X.0rv r1 = X.C16010sH.A02(r0)
            r0 = 0
            r2.A08(r1, r0)
        L_0x00e1:
            java.lang.Object r0 = r3.A01
            X.C29971bX.A04(r0)
            return
        L_0x00e7:
            java.lang.String r0 = "picture"
            X.1Vv r2 = r1.A0K(r0)
            java.lang.String r0 = "id"
            r1 = 0
            r2.A0N(r0, r1)
            java.lang.String r0 = "type"
            r2.A0N(r0, r1)
            java.lang.String r0 = "url"
            r2.A0N(r0, r1)
            byte[] r4 = r2.A01
            java.lang.Object r3 = r3.A02
            X.2Om r3 = (X.C48692Om) r3
            com.obwhatsapp.invites.ViewGroupInviteActivity r0 = r3.A00
            X.0pt r2 = r0.A05
            r1 = 3
            com.facebook.redex.RunnableRunnableShape8S0200000_I0_6 r0 = new com.facebook.redex.RunnableRunnableShape8S0200000_I0_6
            r0.<init>(r3, r1, r4)
            r2.A0K(r0)
            return
        L_0x0113:
            X.1Vv r0 = r1.A0H()
            java.lang.Class<com.whatsapp.jid.UserJid> r2 = com.whatsapp.jid.UserJid.class
            java.lang.Object r1 = r3.A00
            X.0vd r1 = (X.C17780vd) r1
            X.0so r4 = r1.A00
            java.lang.String r1 = "creator"
            com.whatsapp.jid.Jid r10 = r0.A0F(r4, r2, r1)
            com.whatsapp.jid.UserJid r10 = (com.whatsapp.jid.UserJid) r10
            java.lang.String r1 = "creation"
            r5 = 0
            java.lang.String r6 = r0.A0N(r1, r5)
            r1 = 0
            long r19 = X.C29501aj.A01(r6, r1)
            r8 = 1000(0x3e8, double:4.94E-321)
            long r19 = r19 * r8
            java.lang.String r6 = "subject"
            java.lang.String r12 = r0.A0N(r6, r5)
            java.lang.String r7 = "s_t"
            java.lang.String r7 = r0.A0N(r7, r5)
            long r21 = X.C29501aj.A01(r7, r1)
            long r21 = r21 * r8
            r1 = 0
            java.lang.String r2 = "id"
            java.lang.String r2 = r0.A0N(r2, r5)     // Catch:{ 1W4 -> 0x01b1 }
            X.AnonymousClass00B.A06(r2)     // Catch:{ 1W4 -> 0x01b1 }
            X.0sL r8 = X.C16030sJ.A01(r2)     // Catch:{ 1W4 -> 0x01b1 }
            java.lang.String r2 = "type"
            java.lang.String r13 = r0.A0N(r2, r5)     // Catch:{ 1W4 -> 0x01b1 }
            java.util.Map r15 = X.C53262fQ.A06(r4, r0)     // Catch:{ 1W4 -> 0x01b1 }
            java.lang.String r2 = "size"
            java.lang.String r5 = r0.A0N(r2, r5)     // Catch:{ 1W4 -> 0x01b1 }
            int r2 = r15.size()     // Catch:{ 1W4 -> 0x01b1 }
            int r16 = X.C29501aj.A00(r5, r2)     // Catch:{ 1W4 -> 0x01b1 }
            java.lang.Object r7 = r3.A02     // Catch:{ 1W4 -> 0x01b1 }
            X.1up r7 = (X.C40871up) r7     // Catch:{ 1W4 -> 0x01b1 }
            java.lang.String r2 = "description"
            X.1Vv r2 = r0.A0J(r2)     // Catch:{ 1W4 -> 0x01b1 }
            X.1cF r11 = X.C53262fQ.A04(r4, r0, r2)     // Catch:{ 1W4 -> 0x01b1 }
            int r17 = X.C53262fQ.A02(r0)     // Catch:{ 1W4 -> 0x01b1 }
            boolean r2 = X.C53262fQ.A08(r0)     // Catch:{ 1W4 -> 0x01b1 }
            if (r2 == 0) goto L_0x0199
            java.lang.String r2 = "membership_approval_request"
            X.1Vv r2 = r0.A0J(r2)     // Catch:{ 1W4 -> 0x01b1 }
            r18 = 1
            if (r2 == 0) goto L_0x019b
            r18 = 2
            goto L_0x019b
        L_0x0199:
            r18 = 0
        L_0x019b:
            java.lang.String r2 = "linked_parent"
            X.1Vv r2 = r0.A0J(r2)     // Catch:{ 1W4 -> 0x01b1 }
            if (r2 == 0) goto L_0x01af
            java.lang.String r14 = r2.A0N(r6, r1)     // Catch:{ 1W4 -> 0x01b1 }
        L_0x01a7:
            X.0sL r9 = X.C53262fQ.A03(r4, r0)     // Catch:{ 1W4 -> 0x01b1 }
            r7.ARw(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r21)     // Catch:{ 1W4 -> 0x01b1 }
            goto L_0x01cd
        L_0x01af:
            r14 = 0
            goto L_0x01a7
        L_0x01b1:
            r6 = move-exception
            java.lang.Object r2 = r3.A02
            X.1up r2 = (X.C40871up) r2
            r0 = 800(0x320, float:1.121E-42)
            r2.AQR(r0)
            java.lang.String r5 = "Connection/handleInvalidJidReceived"
            com.whatsapp.util.Log.e(r5, r6)
            r2 = 1
            java.lang.String r0 = "invalid-jid-received"
            r4.AcB(r5, r0, r2)
            java.lang.Object r0 = r3.A01
            X.1bW r0 = (X.C29961bW) r0
            r0.A04(r1)
        L_0x01cd:
            java.lang.Object r0 = r3.A01
            X.1bW r0 = (X.C29961bW) r0
            r0.A04(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxRCallbackShape12S0300000_1_I1.AYG(X.1Vv, java.lang.String):void");
    }
}
