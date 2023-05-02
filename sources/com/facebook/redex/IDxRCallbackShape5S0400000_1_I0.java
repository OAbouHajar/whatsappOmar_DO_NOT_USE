package com.facebook.redex;

import X.AnonymousClass000;
import X.AnonymousClass18X;
import X.AnonymousClass1C5;
import X.AnonymousClass1W9;
import X.C13680ns;
import X.C13690nt;
import X.C16050sL;
import X.C16940tv;
import X.C17240ul;
import X.C17380uz;
import X.C17780vd;
import X.C17930vs;
import X.C18390wc;
import X.C19550yc;
import X.C28371Vv;
import X.C29731b6;
import X.C29961bW;
import X.C29971bX;
import X.C34451kH;
import X.C40841um;
import X.C40881uq;
import X.C40901us;
import X.C79083zA;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.Iterator;

public class IDxRCallbackShape5S0400000_1_I0 implements C19550yc {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public IDxRCallbackShape5S0400000_1_I0(Object obj, Object obj2, Object obj3, Object obj4, int i2) {
        this.A04 = i2;
        this.A00 = obj2;
        this.A02 = obj4;
        this.A03 = obj3;
        this.A01 = obj;
    }

    public void APb(String str) {
        C29961bW r1;
        String str2;
        switch (this.A04) {
            case 0:
                Log.i(C13680ns.A0h("GroupXmppMethods/sendRevokeGroupInvites/onDeliveryFailure; iq=", str));
                r1 = (C29961bW) this.A01;
                str2 = "sendRevokeGroupInvites IQ was not delivered: iq=";
                break;
            case 1:
                Log.i(C13680ns.A0h("GroupXmppMethods/sendJoinGroupByCode/onDeliveryFailure; iq=", str));
                r1 = (C29961bW) this.A01;
                str2 = "joinGroupByCode IQ was not delivered: iq=";
                break;
            default:
                Log.e(C13680ns.A0h("EncryptedBackupProtocolHelper/sendBeginRegI/onDeliveryFailure id=", str));
                ((C29731b6) this.A01).AQf(3, "delivery failure", -1);
                return;
        }
        C29971bX.A03(r1, C13680ns.A0h(str2, str));
    }

    public void AQe(C28371Vv r3, String str) {
        switch (this.A04) {
            case 0:
                C40901us r0 = (C40901us) this.A03;
                if (r0 != null) {
                    r0.A00.A00 = C34451kH.A00(r3);
                    break;
                }
                break;
            case 1:
                ((C40841um) this.A02).Ach(C34451kH.A00(r3));
                break;
            default:
                AnonymousClass18X.A00(r3, (C29731b6) this.A01, str);
                return;
        }
        C29971bX.A04(this.A01);
    }

    public void AYG(C28371Vv r13, String str) {
        C40881uq r3;
        Jid A0F;
        int i2;
        switch (this.A04) {
            case 0:
                C18390wc r6 = new C18390wc();
                AnonymousClass1C5 r5 = new AnonymousClass1C5();
                Iterator it = r13.A0K("revoke").A0O("participant").iterator();
                while (it.hasNext()) {
                    C28371Vv A0S = C13690nt.A0S(it);
                    Jid A0F2 = A0S.A0F(((C17780vd) this.A00).A00, UserJid.class, "jid");
                    String A05 = C28371Vv.A05(A0S, "error");
                    if (A0F2 != null) {
                        if (A05 != null) {
                            try {
                                r5.put(A0F2, Integer.valueOf(Integer.parseInt(A05)));
                            } catch (Exception unused) {
                            }
                        } else {
                            r6.add((Object) A0F2);
                        }
                    }
                }
                C17380uz build = r6.build();
                C17930vs build2 = r5.build();
                C17240ul r32 = (C17240ul) ((C17780vd) this.A00).A04.get();
                r32.A10.Acl(new RunnableRunnableShape0S0400000_I0(r32, this.A02, build2, build, 25));
                C40901us r0 = (C40901us) this.A03;
                if (r0 != null) {
                    C79083zA r02 = r0.A00;
                    r02.A02 = build;
                    r02.A01 = build2;
                }
                C29971bX.A04(this.A01);
                return;
            case 1:
                C28371Vv A0H = r13.A0H();
                String str2 = A0H.A00;
                if ("group".equals(str2)) {
                    r3 = (C40881uq) this.A03;
                    A0F = A0H.A0F(((C17780vd) this.A00).A00, C16050sL.class, "jid");
                    i2 = 0;
                } else if ("membership_approval_request".equals(str2)) {
                    r3 = (C40881uq) this.A03;
                    A0F = A0H.A0F(((C17780vd) this.A00).A00, C16050sL.class, "jid");
                    i2 = 1;
                } else {
                    StringBuilder A0r = AnonymousClass000.A0r("Connection/sendJoinGroupByCode unrecognized node:");
                    A0r.append(r13);
                    A0r.append(" tag:");
                    AnonymousClass1W9 r1 = new AnonymousClass1W9(AnonymousClass000.A0h(str2, A0r));
                    ((C29961bW) this.A01).A04((Object) null);
                    throw r1;
                }
                r3.Acj(A0F, i2);
                ((C29961bW) this.A01).A04((Object) null);
                return;
            default:
                Object obj = this.A03;
                byte[] bArr = (byte[]) this.A02;
                C29731b6 r7 = (C29731b6) this.A01;
                Log.i(C13680ns.A0h("EncryptedBackupProtocolHelper/beginRegOnSuccess id=", str));
                byte[] A012 = AnonymousClass18X.A01(r13, r7, "r2");
                byte[] A013 = AnonymousClass18X.A01(r13, r7, "r2_sig");
                byte[] A014 = AnonymousClass18X.A01(r13, r7, "opaque_c");
                if (A012 != null && A013 != null && A014 != null) {
                    byte[] bArr2 = AnonymousClass18X.A02;
                    int length = bArr2.length;
                    int length2 = A012.length;
                    byte[] bArr3 = new byte[(length + length2)];
                    System.arraycopy(bArr2, 0, bArr3, 0, length);
                    System.arraycopy(A012, 0, bArr3, length, length2);
                    if (!C16940tv.A03(bArr3, A013, bArr)) {
                        Log.e(C13680ns.A0h("EncryptedBackupProtocolHelper/beginLoginOnSuccess/r2 cannot be verified with r2_sig and ed_pub id=", str));
                        r7.AQf(2, "r2 cannot be verified with r2_sig and ed_pub", -1);
                        return;
                    }
                    r7.A00.A01();
                    r7.A01.Acl(new RunnableRunnableShape0S0400000_I0(r7, obj, A014, A012, 9));
                    return;
                }
                return;
        }
    }
}
