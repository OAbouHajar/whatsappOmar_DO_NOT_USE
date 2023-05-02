package com.facebook.redex;

import X.AnonymousClass000;
import X.AnonymousClass00B;
import X.AnonymousClass01Y;
import X.AnonymousClass027;
import X.AnonymousClass1Vo;
import X.AnonymousClass273;
import X.AnonymousClass2HJ;
import X.AnonymousClass68L;
import X.C110105dW;
import X.C110755em;
import X.C114005my;
import X.C114125nA;
import X.C114175nF;
import X.C117725tS;
import X.C119265wo;
import X.C30801cy;
import X.C35301lh;
import android.content.Context;
import android.text.TextUtils;
import com.obwhatsapp.R;
import com.whatsapp.jid.UserJid;

public class IDxICallbackShape7S1200000_3_I1 implements AnonymousClass68L {
    public Object A00;
    public Object A01;
    public String A02;
    public final int A03;

    public IDxICallbackShape7S1200000_3_I1(Object obj, String str, Object obj2, int i2) {
        this.A03 = i2;
        this.A00 = obj2;
        this.A01 = obj;
        this.A02 = str;
    }

    public final void AWU(UserJid userJid, C35301lh r8, C35301lh r9, C35301lh r10, AnonymousClass2HJ r11, String str, String str2, String str3, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        C117725tS A002;
        C30801cy r0;
        C117725tS r1;
        C30801cy r12;
        C117725tS A003;
        String A004;
        C117725tS r13;
        boolean z7 = z4;
        if (this.A03 != 0) {
            C110755em r2 = (C110755em) this.A00;
            C114005my r14 = (C114005my) this.A01;
            String str4 = this.A02;
            r14.A01 = 0;
            r14.A02 = 8;
            AnonymousClass027 r15 = r2.A02;
            r15.A0B(r15.A01());
            if (r11 != null || !z2) {
                r2.A0f.A05(AnonymousClass000.A0g("viewContactInfo error: ", r11));
                if (r11 == null || (A004 = r2.A0W.A00(r11.A00)) == null) {
                    r12 = r2.A09;
                    A003 = C117725tS.A00(6);
                } else {
                    A003 = C117725tS.A00(8);
                    A003.A0C = A004;
                    r12 = r2.A09;
                }
                r12.A0B(A003);
                return;
            }
            if (userJid != null) {
                AnonymousClass1Vo r3 = r2.A0f;
                StringBuilder A0r = AnonymousClass000.A0r("viewContactInfo jid: ");
                A0r.append(userJid);
                A0r.append(" blocked: ");
                A0r.append(z7);
                C110105dW.A1L(r3, A0r);
                AnonymousClass01Y r16 = r2.A0L;
                UserJid of = UserJid.of(userJid);
                AnonymousClass00B.A06(of);
                if (z7 != r16.A0V(of)) {
                    r16.A0N((AnonymousClass273) null);
                }
                C117725tS A005 = C117725tS.A00(4);
                A005.A03 = r2.A0M.A0A(userJid);
                r13 = A005;
            } else {
                C117725tS A006 = C117725tS.A00(5);
                A006.A0F = str4;
                A006.A0E = str;
                A006.A07 = r8;
                r13 = A006;
            }
            r0 = r2.A09;
            r1 = r13;
        } else {
            C114175nF r32 = (C114175nF) this.A00;
            C35301lh r4 = (C35301lh) this.A01;
            String str5 = this.A02;
            AnonymousClass1Vo r17 = r32.A0f;
            r17.A06("IN- HANDLE_SEND_AGAIN vpa valid check response");
            r32.A0S(false);
            if (!z2 || r11 != null) {
                if (!z4) {
                    if (r11 != null) {
                        r17.A06("IN- HANDLE_SEND_AGAIN error from server");
                        A002 = C117725tS.A00(8);
                        C119265wo A04 = r32.A0D.A04(r32.A06.A04, r11.A00);
                        Context context = r32.A0P.A00;
                        String A012 = A04.A01(context);
                        if (TextUtils.isEmpty(A012)) {
                            A012 = context.getString(R.string.str0f65);
                        }
                        A002.A0C = A012;
                    } else {
                        r17.A05("Unable to validate the receiver to send payment again");
                        return;
                    }
                }
                r17.A06("IN- HANDLE_SEND_AGAIN server said user blocked");
                A002 = C117725tS.A00(13);
                A002.A06 = userJid;
                A002.A0F = str5;
            } else {
                if (!z4) {
                    r17.A06("IN- HANDLE_SEND_AGAIN starting payment");
                    C114125nA r18 = new C114125nA(105);
                    r18.A00 = r4;
                    r18.A0E = str;
                    r18.A07 = r8;
                    r0 = r32.A09;
                    r1 = r18;
                }
                r17.A06("IN- HANDLE_SEND_AGAIN server said user blocked");
                A002 = C117725tS.A00(13);
                A002.A06 = userJid;
                A002.A0F = str5;
            }
            C110755em.A01(r32, A002);
            return;
        }
        r0.A0B(r1);
    }
}
