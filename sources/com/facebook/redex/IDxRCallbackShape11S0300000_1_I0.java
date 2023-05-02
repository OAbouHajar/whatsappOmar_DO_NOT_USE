package com.facebook.redex;

import X.AnonymousClass000;
import X.AnonymousClass18X;
import X.C13680ns;
import X.C17030uP;
import X.C17240ul;
import X.C19550yc;
import X.C28371Vv;
import X.C29731b6;
import X.C29961bW;
import X.C29971bX;
import X.C34451kH;
import X.C40091tY;
import X.C40141td;
import X.C40871up;
import X.C49042Qm;
import X.C49052Qo;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

public class IDxRCallbackShape11S0300000_1_I0 implements C19550yc {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public IDxRCallbackShape11S0300000_1_I0(Object obj, Object obj2, Object obj3, int i2) {
        this.A03 = i2;
        this.A00 = obj2;
        this.A02 = obj3;
        this.A01 = obj;
    }

    public void APb(String str) {
        C29961bW r1;
        String str2;
        switch (this.A03) {
            case 0:
            case 1:
                Log.i(C13680ns.A0h("GroupXmppMethods/sendModifyAdmin/onDeliveryFailure; iq=", str));
                r1 = (C29961bW) this.A01;
                str2 = "sendModifyAdmin IQ was not delivered: iq=";
                break;
            case 2:
                Log.e(C13680ns.A0h("EncryptedBackupProtocolHelper/sendBeginLoginIq/onDeliveryFailure id=", str));
                ((C29731b6) this.A01).AQf(3, "delivery failure", -1);
                return;
            case 3:
                Log.i(C13680ns.A0h("BizVNameXmppMethods/sendGetBizVNameCert/onDeliveryFailure; iq=", str));
                r1 = (C29961bW) this.A02;
                str2 = "Delivery failure: iq=";
                break;
            default:
                r1 = (C29961bW) this.A01;
                str2 = "Failed deliver: iq=";
                break;
        }
        C29971bX.A03(r1, C13680ns.A0h(str2, str));
    }

    public void AQe(C28371Vv r7, String str) {
        Object obj;
        switch (this.A03) {
            case 0:
                ((C40871up) this.A02).AQR(C34451kH.A00(r7));
                break;
            case 1:
                int A002 = C34451kH.A00(r7);
                int i2 = 2019;
                if (A002 != 401) {
                    i2 = 2020;
                    if (A002 != 403) {
                        i2 = 2021;
                        if (A002 != 404) {
                            i2 = 2018;
                        }
                    }
                }
                C17240ul.A01(i2, (Object) null);
                ((C29961bW) this.A01).A04((Object) null);
                return;
            case 2:
                AnonymousClass18X.A00(r7, (C29731b6) this.A01, str);
                return;
            case 3:
                Log.i(C13680ns.A0h("BizVNameXmppMethods/sendGetBizVNameCert/onError; iq=", str));
                int A003 = C34451kH.A00(r7);
                UserJid userJid = (UserJid) this.A01;
                StringBuilder A0r = AnonymousClass000.A0r("recvmessagelistener/on-get-biz-vname-cert-error jid=");
                A0r.append(userJid);
                A0r.append(" errorCode=");
                A0r.append(A003);
                C13680ns.A1V(A0r);
                C17030uP r3 = (C17030uP) ((C49042Qm) this.A00).A06.get();
                r3.A0A.put(userJid, Long.valueOf(System.currentTimeMillis()));
                C40091tY r1 = r3.A03;
                new C40141td(userJid);
                r1.A04();
                obj = this.A02;
                break;
            default:
                int A004 = C34451kH.A00(r7);
                C49052Qo r4 = (C49052Qo) this.A02;
                if (A004 != 404) {
                    StringBuilder A0r2 = AnonymousClass000.A0r("error in response while running get status privacy job");
                    A0r2.append(C13680ns.A0j(AnonymousClass000.A0r("; persistentId="), r4.A00.A01));
                    Log.e(C13680ns.A0i("; code=", A0r2, A004));
                } else {
                    Log.i(AnonymousClass000.A0h(C13680ns.A0j(AnonymousClass000.A0r("; persistentId="), r4.A00.A01), AnonymousClass000.A0r("get status privacy job response is 'no settings found on server'")));
                }
                r4.A01.set(A004);
                break;
        }
        obj = this.A01;
        C29971bX.A04(obj);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:118:0x034b, code lost:
        X.C29971bX.A04(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x034e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x039a, code lost:
        ((X.C29961bW) r1.A01).A04(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void AYG(X.C28371Vv r25, java.lang.String r26) {
        /*
            r24 = this;
            r1 = r24
            int r0 = r1.A03
            r2 = r25
            r7 = r26
            switch(r0) {
                case 0: goto L_0x034f;
                case 1: goto L_0x0280;
                case 2: goto L_0x01b0;
                case 3: goto L_0x0119;
                default: goto L_0x000b;
            }
        L_0x000b:
            java.lang.String r0 = "privacy"
            X.1Vv r2 = r2.A0K(r0)
            java.lang.String r0 = "list"
            java.util.List r0 = r2.A0O(r0)
            java.util.Iterator r12 = r0.iterator()
            r5 = 0
            r7 = r5
            r8 = r5
        L_0x001e:
            r3 = 0
        L_0x001f:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x00a6
            X.1Vv r10 = X.C13690nt.A0S(r12)
            java.lang.String r0 = "user"
            java.util.List r2 = r10.A0O(r0)
            java.util.ArrayList r6 = new java.util.ArrayList
            int r0 = r2.size()
            r6.<init>(r0)
            java.util.Iterator r11 = r2.iterator()
        L_0x003d:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0059
            X.1Vv r9 = X.C13690nt.A0S(r11)
            java.lang.Class<com.whatsapp.jid.UserJid> r4 = com.whatsapp.jid.UserJid.class
            java.lang.Object r0 = r1.A00
            X.2Py r0 = (X.C48932Py) r0
            X.0so r2 = r0.A00
            java.lang.String r0 = "jid"
            com.whatsapp.jid.Jid r0 = r9.A0F(r2, r4, r0)
            r6.add(r0)
            goto L_0x003d
        L_0x0059:
            java.lang.String r0 = "type"
            java.lang.String r4 = r10.A0N(r0, r5)
            if (r4 == 0) goto L_0x009d
            java.lang.String r0 = "default"
            java.lang.String r2 = r10.A0N(r0, r5)
            java.lang.String r0 = "true"
            boolean r2 = r0.equals(r2)
            int r0 = r4.hashCode()
            switch(r0) {
                case -1653850041: goto L_0x0077;
                case -567451565: goto L_0x0085;
                case 1333012765: goto L_0x0090;
                default: goto L_0x0076;
            }
        L_0x0076:
            goto L_0x001f
        L_0x0077:
            java.lang.String r0 = "whitelist"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x001f
            if (r2 == 0) goto L_0x0083
            r3 = 1
        L_0x0083:
            r7 = r6
            goto L_0x001f
        L_0x0085:
            java.lang.String r0 = "contacts"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x001f
            if (r2 == 0) goto L_0x001f
            goto L_0x001e
        L_0x0090:
            java.lang.String r0 = "blacklist"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x001f
            if (r2 == 0) goto L_0x009b
            r3 = 2
        L_0x009b:
            r8 = r6
            goto L_0x001f
        L_0x009d:
            java.lang.String r0 = "status list type is null"
            X.1W9 r1 = new X.1W9
            r1.<init>((java.lang.String) r0)
            throw r1
        L_0x00a6:
            java.lang.Object r9 = r1.A02
            X.2Qo r9 = (X.C49052Qo) r9
            java.lang.String r0 = "get status privacy job response statusDistributionMode="
            java.lang.StringBuilder r4 = X.AnonymousClass000.A0r(r0)
            r4.append(r3)
            java.lang.String r0 = "; whiteList="
            r4.append(r0)
            java.lang.String r2 = "null"
            java.lang.String r6 = ","
            if (r7 != 0) goto L_0x0114
            r0 = r2
        L_0x00bf:
            r4.append(r0)
            java.lang.String r0 = "; blackList="
            r4.append(r0)
            if (r8 == 0) goto L_0x00cd
            java.lang.String r2 = android.text.TextUtils.join(r6, r8)
        L_0x00cd:
            java.lang.String r0 = X.AnonymousClass000.A0h(r2, r4)
            com.whatsapp.util.Log.i((java.lang.String) r0)
            com.obwhatsapp.jobqueue.job.GetStatusPrivacyJob r2 = r9.A00
            X.11G r0 = r2.A00
            boolean r0 = r0.A0G()
            if (r0 != 0) goto L_0x039a
            java.lang.String r0 = "save status privacy"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.11G r0 = r2.A00
            X.11I r4 = r0.A03
            java.lang.String r0 = "status_distribution"
            r4.A04(r0, r3)
            java.lang.String r3 = ""
            if (r8 != 0) goto L_0x010b
            r2 = r3
        L_0x00f3:
            java.lang.String r0 = "status_black_list"
            r4.A06(r0, r2)
            if (r7 == 0) goto L_0x0103
            java.lang.String[] r0 = X.C16030sJ.A0T(r7)
            java.lang.String r3 = android.text.TextUtils.join(r6, r0)
        L_0x0103:
            java.lang.String r0 = "status_white_list"
            r4.A06(r0, r3)
            goto L_0x039a
        L_0x010b:
            java.lang.String[] r0 = X.C16030sJ.A0T(r8)
            java.lang.String r2 = android.text.TextUtils.join(r6, r0)
            goto L_0x00f3
        L_0x0114:
            java.lang.String r0 = android.text.TextUtils.join(r6, r7)
            goto L_0x00bf
        L_0x0119:
            java.lang.String r0 = "BizVNameXmppMethods/sendGetBizVNameCert/onSuccess; iq="
            java.lang.String r0 = X.C13680ns.A0h(r0, r7)
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r0 = "verified_name"
            X.1Vv r7 = r2.A0J(r0)
            X.AnonymousClass00B.A06(r7)
            java.lang.Class<com.whatsapp.jid.UserJid> r3 = com.whatsapp.jid.UserJid.class
            java.lang.Object r11 = r1.A00
            X.2Qm r11 = (X.C49042Qm) r11
            X.0so r2 = r11.A00
            java.lang.String r0 = "jid"
            com.whatsapp.jid.Jid r0 = r7.A0F(r2, r3, r0)
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0
            if (r0 != 0) goto L_0x01ae
            java.lang.Object r9 = r1.A01
            com.whatsapp.jid.UserJid r9 = (com.whatsapp.jid.UserJid) r9
            if (r9 == 0) goto L_0x01ae
        L_0x0144:
            java.lang.String r0 = "v"
            r8 = 0
            java.lang.String r6 = r7.A0N(r0, r8)
            java.lang.String r0 = "verified_level"
            java.lang.String r3 = r7.A0N(r0, r8)
            r4 = 0
            java.lang.String r0 = "serial"
            long r14 = r7.A0D(r0, r4)
            java.lang.String r0 = "host_storage"
            java.lang.String r4 = r7.A0N(r0, r8)
            java.lang.String r0 = "actual_actors"
            java.lang.String r2 = r7.A0N(r0, r8)
            java.lang.String r0 = "privacy_mode_ts"
            java.lang.String r0 = r7.A0N(r0, r8)
            X.1ta r10 = new X.1ta
            r10.<init>((java.lang.String) r4, (java.lang.String) r2, (java.lang.String) r0)
            java.lang.String r0 = "1"
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L_0x0197
            if (r3 == 0) goto L_0x0197
            byte[] r12 = r7.A01
            int r13 = X.C53782gH.A00(r3)
            X.01D r0 = r11.A07
            java.lang.Object r0 = r0.get()
            X.0sq r0 = (X.C16320sq) r0
            X.56L r8 = new X.56L
            r8.<init>(r9, r10, r11, r12, r13, r14)
            r0.Acl(r8)
        L_0x0193:
            java.lang.Object r0 = r1.A02
            goto L_0x034b
        L_0x0197:
            java.lang.String r0 = "unknown vname cert payload version or vlevel: v="
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0r(r0)
            r2.append(r6)
            java.lang.String r0 = " vlevel="
            r2.append(r0)
            java.lang.String r0 = X.AnonymousClass000.A0h(r3, r2)
            com.whatsapp.util.Log.w((java.lang.String) r0)
            goto L_0x0193
        L_0x01ae:
            r9 = r0
            goto L_0x0144
        L_0x01b0:
            java.lang.Object r9 = r1.A02
            byte[] r9 = (byte[]) r9
            java.lang.Object r4 = r1.A01
            X.1b5 r4 = (X.C29721b5) r4
            java.lang.String r0 = "EncryptedBackupProtocolHelper/beginLoginOnSuccess id="
            java.lang.String r0 = X.C13680ns.A0h(r0, r7)
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r0 = "l2"
            byte[] r6 = X.AnonymousClass18X.A01(r2, r4, r0)
            java.lang.String r0 = "l2_sig"
            byte[] r10 = X.AnonymousClass18X.A01(r2, r4, r0)
            if (r6 == 0) goto L_0x03a1
            if (r10 == 0) goto L_0x03a1
            java.lang.String r0 = "backoff"
            X.1Vv r1 = r2.A0J(r0)
            r5 = -1
            if (r1 != 0) goto L_0x0200
            r11 = 0
        L_0x01db:
            byte[] r8 = X.AnonymousClass18X.A01
            int r3 = r8.length
            int r2 = r6.length
            int r0 = r3 + r2
            byte[] r1 = new byte[r0]
            r0 = 0
            java.lang.System.arraycopy(r8, r0, r1, r0, r3)
            java.lang.System.arraycopy(r6, r0, r1, r3, r2)
            boolean r0 = X.C16940tv.A03(r1, r10, r9)
            if (r0 != 0) goto L_0x020c
            java.lang.String r0 = "EncryptedBackupProtocolHelper/beginLoginOnSuccess/l2 cannot be verified with l2_sig and ed_pub id="
            java.lang.String r0 = X.C13680ns.A0h(r0, r7)
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r1 = 2
            java.lang.String r0 = "l2 cannot be verified with l2_sig and ed_pub"
            r4.AQf(r1, r0, r5)
            return
        L_0x0200:
            java.lang.String r0 = "value"
            java.lang.String r0 = X.C28371Vv.A05(r1, r0)
            int r11 = X.C29501aj.A00(r0, r5)
            goto L_0x01db
        L_0x020c:
            X.1ue r0 = r4.A00
            r0.A01()
            java.lang.Object r3 = r4.A0C
            monitor-enter(r3)
            byte[] r5 = r4.A06     // Catch:{ all -> 0x027d }
            X.4Ej r2 = r4.A03     // Catch:{ all -> 0x027d }
            int r0 = r4.A01     // Catch:{ all -> 0x027d }
            monitor-exit(r3)     // Catch:{ all -> 0x027d }
            r1 = 100000(0x186a0, float:1.4013E-40)
            long r13 = (long) r1
            com.facebook.simplejni.NativeHolder r15 = r2.A00
            r12 = 3
            r17 = r6
            r16 = r5
            java.lang.Object r1 = com.whatsapp.wamsys.JniBridge.jvidispatchOIOOO(r12, r13, r15, r16, r17)
            com.facebook.simplejni.NativeHolder r1 = (com.facebook.simplejni.NativeHolder) r1
            X.1b8 r7 = new X.1b8
            r7.<init>(r1)
            com.whatsapp.wamsys.JniBridge.getInstance()
            com.facebook.simplejni.NativeHolder r8 = r7.A00
            r1 = 72
            long r1 = (long) r1
            r5 = 1
            long r5 = com.whatsapp.wamsys.JniBridge.jvidispatchIIO(r5, r1, r8)
            int r1 = (int) r5
            r6 = -1
            if (r1 != r6) goto L_0x024f
            X.1b9 r6 = r4.A08
            java.lang.String r7 = "Login Failure Invalid Password"
            r8 = 8
            r9 = 2
            int r10 = r0 + -1
            r6.AQc(r7, r8, r9, r10, r11)
            return
        L_0x024f:
            if (r1 == 0) goto L_0x0260
            X.1b9 r2 = r4.A08
            java.lang.String r0 = "WESOpaqueClientCreateLoginFinish failed with WESOpaqueStatusType="
            java.lang.String r3 = X.C13680ns.A0c(r1, r0)
            r4 = 4
            r5 = 2
            r7 = -1
            r2.AQc(r3, r4, r5, r6, r7)
            return
        L_0x0260:
            com.whatsapp.wamsys.JniBridge.getInstance()
            r0 = 75
            long r1 = (long) r0
            r0 = 0
            java.lang.Object r0 = com.whatsapp.wamsys.JniBridge.jvidispatchOIO(r0, r1, r8)
            byte[] r0 = (byte[]) r0
            monitor-enter(r3)
            r4.A02 = r7     // Catch:{ all -> 0x027a }
            r4.A07 = r0     // Catch:{ all -> 0x027a }
            r0 = 2
            r4.A00 = r0     // Catch:{ all -> 0x027a }
            monitor-exit(r3)     // Catch:{ all -> 0x027a }
            r4.A01()
            return
        L_0x027a:
            r1 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x027a }
            throw r1
        L_0x027d:
            r1 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x027d }
            throw r1
        L_0x0280:
            java.util.HashMap r5 = X.AnonymousClass000.A0x()
            java.util.HashMap r3 = X.AnonymousClass000.A0x()
            java.lang.Object r0 = r1.A00
            X.0vd r0 = (X.C17780vd) r0
            X.0so r4 = r0.A00
            java.lang.String r0 = "admin"
            X.AnonymousClass3BT.A01(r4, r2, r0, r5, r3)
            java.lang.Object r7 = r1.A02
            X.2Or r7 = (X.AnonymousClass2Or) r7
            java.lang.String r0 = "modify-admins/"
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0r(r0)
            X.2O3 r10 = r7.A00
            X.0sL r0 = r10.A06
            r2.append(r0)
            java.lang.String r9 = "/"
            java.lang.String r0 = X.C13680ns.A0k(r2, r5, r3)
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r2)
            com.whatsapp.util.Log.i((java.lang.String) r0)
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x0349
            java.lang.StringBuilder r6 = X.AnonymousClass000.A0o()
            java.lang.ref.WeakReference r0 = r10.A07
            java.lang.Object r8 = r0.get()
            android.app.Activity r8 = (android.app.Activity) r8
            if (r8 == 0) goto L_0x0349
            boolean r0 = r8.isFinishing()
            if (r0 != 0) goto L_0x0349
            java.util.Iterator r13 = X.C13690nt.A0j(r3)
        L_0x02cf:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x033d
            java.util.Map$Entry r3 = X.AnonymousClass000.A0z(r13)
            java.lang.Object r4 = r3.getKey()
            X.0rv r4 = (X.C15830rv) r4
            java.lang.String r0 = "modify-admins/error/"
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0r(r0)
            r2.append(r4)
            r2.append(r9)
            java.lang.Object r0 = r3.getValue()
            java.lang.String r0 = X.AnonymousClass000.A0f(r0, r2)
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.lang.Object r0 = r3.getValue()
            int r3 = X.AnonymousClass000.A0D(r0)
            X.0sG r0 = r10.A01
            X.0sH r11 = r0.A0A(r4)
            java.util.List r0 = r10.A09
            boolean r12 = r0.contains(r4)
            r0 = 404(0x194, float:5.66E-43)
            java.lang.String r5 = "\n"
            r4 = 0
            r2 = 1
            if (r3 == r0) goto L_0x0334
            r0 = 406(0x196, float:5.69E-43)
            if (r3 == r0) goto L_0x0330
            r0 = 419(0x1a3, float:5.87E-43)
            if (r3 != r0) goto L_0x0334
            r3 = 2131893443(0x7f121cc3, float:1.9421663E38)
        L_0x031d:
            java.lang.Object[] r2 = new java.lang.Object[r2]
            X.0sP r0 = r10.A02
            java.lang.String r0 = r0.A08(r11)
            java.lang.String r0 = X.C13680ns.A0d(r8, r0, r2, r4, r3)
            r6.append(r0)
            r6.append(r5)
            goto L_0x02cf
        L_0x0330:
            r3 = 2131888221(0x7f12085d, float:1.9411071E38)
            goto L_0x031d
        L_0x0334:
            r3 = 2131888223(0x7f12085f, float:1.9411075E38)
            if (r12 == 0) goto L_0x031d
            r3 = 2131888179(0x7f120833, float:1.9410986E38)
            goto L_0x031d
        L_0x033d:
            X.0pt r3 = r10.A00
            r2 = 48
            com.facebook.redex.RunnableRunnableShape7S0200000_I0_5 r0 = new com.facebook.redex.RunnableRunnableShape7S0200000_I0_5
            r0.<init>(r7, r2, r6)
            r3.A0K(r0)
        L_0x0349:
            java.lang.Object r0 = r1.A01
        L_0x034b:
            X.C29971bX.A04(r0)
            return
        L_0x034f:
            X.1Vv r0 = r2.A0H()
            java.lang.Class<com.whatsapp.jid.UserJid> r3 = com.whatsapp.jid.UserJid.class
            java.lang.Object r2 = r1.A00
            X.0vd r2 = (X.C17780vd) r2
            X.0so r4 = r2.A00
            java.lang.String r2 = "creator"
            com.whatsapp.jid.Jid r11 = r0.A0F(r4, r3, r2)
            com.whatsapp.jid.UserJid r11 = (com.whatsapp.jid.UserJid) r11
            java.lang.String r2 = "creation"
            r5 = 0
            java.lang.String r6 = r0.A0N(r2, r5)
            r2 = 0
            long r20 = X.C29501aj.A01(r6, r2)
            r8 = 1000(0x3e8, double:4.94E-321)
            long r20 = r20 * r8
            java.lang.String r7 = "subject"
            java.lang.String r13 = r0.A0N(r7, r5)
            java.lang.String r6 = "s_t"
            java.lang.String r6 = r0.A0N(r6, r5)
            long r22 = X.C29501aj.A01(r6, r2)
            long r22 = r22 * r8
            java.lang.String r2 = "id"
            java.lang.String r3 = r0.A0N(r2, r5)
            r2 = 0
            if (r3 != 0) goto L_0x03a2
            java.lang.Object r2 = r1.A02
            X.1up r2 = (X.C40871up) r2
            r0 = 500(0x1f4, float:7.0E-43)
            r2.AQR(r0)
        L_0x039a:
            java.lang.Object r0 = r1.A01
            X.1bW r0 = (X.C29961bW) r0
            r0.A04(r5)
        L_0x03a1:
            return
        L_0x03a2:
            X.0sL r9 = X.C16030sJ.A01(r3)     // Catch:{ 1W4 -> 0x0410 }
            java.lang.String r3 = "type"
            java.lang.String r14 = r0.A0N(r3, r5)     // Catch:{ 1W4 -> 0x0410 }
            java.util.Map r16 = X.C53262fQ.A06(r4, r0)     // Catch:{ 1W4 -> 0x0410 }
            java.lang.String r3 = "size"
            java.lang.String r6 = r0.A0N(r3, r5)     // Catch:{ 1W4 -> 0x0410 }
            int r3 = r16.size()     // Catch:{ 1W4 -> 0x0410 }
            int r17 = X.C29501aj.A00(r6, r3)     // Catch:{ 1W4 -> 0x0410 }
            java.lang.String r3 = "parent"
            X.1Vv r3 = r0.A0J(r3)     // Catch:{ 1W4 -> 0x0410 }
            if (r3 == 0) goto L_0x03d3
            java.lang.String r6 = "num_sub_groups"
            java.lang.String r5 = r3.A0N(r6, r5)     // Catch:{ 1W4 -> 0x0410 }
            r3 = 0
            int r17 = X.C29501aj.A00(r5, r3)     // Catch:{ 1W4 -> 0x0410 }
        L_0x03d3:
            java.lang.Object r8 = r1.A02     // Catch:{ 1W4 -> 0x0410 }
            X.1up r8 = (X.C40871up) r8     // Catch:{ 1W4 -> 0x0410 }
            java.lang.String r3 = "description"
            X.1Vv r3 = r0.A0J(r3)     // Catch:{ 1W4 -> 0x0410 }
            X.1cF r12 = X.C53262fQ.A04(r4, r0, r3)     // Catch:{ 1W4 -> 0x0410 }
            int r18 = X.C53262fQ.A02(r0)     // Catch:{ 1W4 -> 0x0410 }
            boolean r3 = X.C53262fQ.A08(r0)     // Catch:{ 1W4 -> 0x0410 }
            if (r3 == 0) goto L_0x03f8
            java.lang.String r3 = "membership_approval_request"
            X.1Vv r3 = r0.A0J(r3)     // Catch:{ 1W4 -> 0x0410 }
            r19 = 1
            if (r3 == 0) goto L_0x03fa
            r19 = 2
            goto L_0x03fa
        L_0x03f8:
            r19 = 0
        L_0x03fa:
            java.lang.String r3 = "linked_parent"
            X.1Vv r3 = r0.A0J(r3)     // Catch:{ 1W4 -> 0x0410 }
            if (r3 == 0) goto L_0x040e
            java.lang.String r15 = r3.A0N(r7, r2)     // Catch:{ 1W4 -> 0x0410 }
        L_0x0406:
            X.0sL r10 = X.C53262fQ.A03(r4, r0)     // Catch:{ 1W4 -> 0x0410 }
            r8.ARw(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r22)     // Catch:{ 1W4 -> 0x0410 }
            goto L_0x042c
        L_0x040e:
            r15 = 0
            goto L_0x0406
        L_0x0410:
            r6 = move-exception
            java.lang.Object r3 = r1.A02
            X.1up r3 = (X.C40871up) r3
            r0 = 800(0x320, float:1.121E-42)
            r3.AQR(r0)
            java.lang.String r5 = "Connection/handleInvalidJidReceived"
            com.whatsapp.util.Log.e(r5, r6)
            r3 = 1
            java.lang.String r0 = "invalid-jid-received"
            r4.AcB(r5, r0, r3)
            java.lang.Object r0 = r1.A01
            X.1bW r0 = (X.C29961bW) r0
            r0.A04(r2)
        L_0x042c:
            java.lang.Object r0 = r1.A01
            X.1bW r0 = (X.C29961bW) r0
            r0.A04(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxRCallbackShape11S0300000_1_I0.AYG(X.1Vv, java.lang.String):void");
    }
}
