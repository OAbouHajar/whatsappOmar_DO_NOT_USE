package com.obwhatsapp.chatinfo.view.custom;

import X.AnonymousClass000;
import X.AnonymousClass01Y;
import X.AnonymousClass1ZX;
import X.AnonymousClass5EC;
import X.C001000l;
import X.C106615En;
import X.C106705Ew;
import X.C14550pN;
import X.C15220qW;
import X.C16740tZ;
import X.C16760tb;
import X.C17110uY;
import X.C18450wi;
import X.C222617g;
import X.C32521gW;
import X.C39221s7;
import android.view.View;
import com.facebook.redex.IDxCCallbackShape66S0200000_2_I1;
import com.facebook.redex.IDxUnblockerShape35S0300000_2_I1;
import com.facebook.redex.RunnableRunnableShape2S0200000_I0;
import com.obwhatsapp.R;
import com.obwhatsapp.blocklist.UnblockDialogFragment;
import com.obwhatsapp.chatinfo.SharePhoneNumberViewModel;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;

public final class SharePhoneNumberBottomSheet extends Hilt_SharePhoneNumberBottomSheet {
    public AnonymousClass01Y A00;
    public C17110uY A01;
    public final C15220qW A02 = C32521gW.A01(new C106705Ew(this));
    public final C15220qW A03 = C32521gW.A01(new C106615En(this));
    public final C15220qW A04 = C32521gW.A00(new AnonymousClass5EC(this));

    public void A13() {
        SharePhoneNumberViewModel sharePhoneNumberViewModel = (SharePhoneNumberViewModel) this.A04.getValue();
        Jid jid = (Jid) this.A03.getValue();
        int A0D = AnonymousClass000.A0D(this.A02.getValue());
        C18450wi.A0H(jid, 0);
        if (jid instanceof AnonymousClass1ZX) {
            sharePhoneNumberViewModel.A02.A00((AnonymousClass1ZX) jid, 5, A0D, false);
        }
        super.A13();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0029, code lost:
        if (r1 == 5) goto L_0x002b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A18(android.os.Bundle r8, android.view.View r9) {
        /*
            r7 = this;
            r2 = 0
            X.C18450wi.A0H(r9, r2)
            super.A18(r8, r9)
            android.widget.TextView r1 = r7.A02
            if (r1 == 0) goto L_0x0011
            r0 = 2131891729(0x7f121611, float:1.9418186E38)
            X.C13680ns.A1F(r1, r7, r0)
        L_0x0011:
            android.widget.TextView r3 = r7.A05
            r6 = 5
            r4 = 4
            r5 = 3
            if (r3 == 0) goto L_0x0031
            X.0qW r0 = r7.A02
            java.lang.Object r0 = r0.getValue()
            int r1 = X.AnonymousClass000.A0D(r0)
            if (r1 == r5) goto L_0x002b
            if (r1 == r4) goto L_0x002b
            r0 = 2131891728(0x7f121610, float:1.9418184E38)
            if (r1 != r6) goto L_0x002e
        L_0x002b:
            r0 = 2131891727(0x7f12160f, float:1.9418182E38)
        L_0x002e:
            X.C13680ns.A1F(r3, r7, r0)
        L_0x0031:
            android.widget.TextView r3 = r7.A04
            if (r3 == 0) goto L_0x004e
            X.0qW r0 = r7.A02
            java.lang.Object r0 = r0.getValue()
            int r1 = X.AnonymousClass000.A0D(r0)
            if (r1 == r5) goto L_0x0097
            if (r1 == r4) goto L_0x0097
            r0 = 2131891724(0x7f12160c, float:1.9418176E38)
            if (r1 == r6) goto L_0x004b
            r0 = 2131891726(0x7f12160e, float:1.941818E38)
        L_0x004b:
            X.C13680ns.A1F(r3, r7, r0)
        L_0x004e:
            android.widget.TextView r1 = r7.A01
            if (r1 == 0) goto L_0x0058
            r0 = 2131891722(0x7f12160a, float:1.9418172E38)
            X.C13680ns.A1F(r1, r7, r0)
        L_0x0058:
            android.widget.TextView r1 = r7.A03
            if (r1 == 0) goto L_0x0062
            r0 = 2131891723(0x7f12160b, float:1.9418174E38)
            X.C13680ns.A1F(r1, r7, r0)
        L_0x0062:
            X.0qW r0 = r7.A04
            java.lang.Object r6 = r0.getValue()
            com.obwhatsapp.chatinfo.SharePhoneNumberViewModel r6 = (com.obwhatsapp.chatinfo.SharePhoneNumberViewModel) r6
            X.0qW r0 = r7.A03
            java.lang.Object r5 = r0.getValue()
            com.whatsapp.jid.Jid r5 = (com.whatsapp.jid.Jid) r5
            X.0qW r0 = r7.A02
            java.lang.Object r0 = r0.getValue()
            int r1 = X.AnonymousClass000.A0D(r0)
            X.C18450wi.A0H(r5, r2)
            X.027 r3 = r6.A00
            boolean r0 = r5 instanceof X.AnonymousClass1ZX
            if (r0 == 0) goto L_0x008c
            X.16z r0 = r6.A02
            X.1ZX r5 = (X.AnonymousClass1ZX) r5
            r0.A00(r5, r4, r1, r2)
        L_0x008c:
            r1 = 61
            com.facebook.redex.IDxObserverShape116S0100000_2_I1 r0 = new com.facebook.redex.IDxObserverShape116S0100000_2_I1
            r0.<init>(r7, r1)
            r3.A0A(r7, r0)
            return
        L_0x0097:
            r0 = 2131891725(0x7f12160d, float:1.9418178E38)
            goto L_0x004b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.chatinfo.view.custom.SharePhoneNumberBottomSheet.A18(android.os.Bundle, android.view.View):void");
    }

    public void onClick(View view) {
        C18450wi.A0H(view, 0);
        int id = view.getId();
        if (!(id == R.id.share_pn_close_button || id == R.id.share_pn_cta_negative)) {
            if (id == R.id.share_pn_cta_positive) {
                C001000l A0C = A0C();
                if (A0C != null) {
                    AnonymousClass01Y r2 = this.A00;
                    if (r2 != null) {
                        C15220qW r1 = this.A03;
                        if (r2.A0V(UserJid.of((Jid) r1.getValue()))) {
                            A1D();
                            ((C14550pN) A0C).Afc(UnblockDialogFragment.A01(new IDxUnblockerShape35S0300000_2_I1(A0C, new IDxCCallbackShape66S0200000_2_I1(A0C, 0, this), this, 1), A0J(R.string.str12c8), 0, false));
                            return;
                        } else if (r1.getValue() instanceof AnonymousClass1ZX) {
                            r1.getValue();
                            SharePhoneNumberViewModel sharePhoneNumberViewModel = (SharePhoneNumberViewModel) this.A04.getValue();
                            Jid jid = (Jid) r1.getValue();
                            int A0D = AnonymousClass000.A0D(this.A02.getValue());
                            C18450wi.A0H(jid, 0);
                            if (jid instanceof AnonymousClass1ZX) {
                                C16760tb r6 = sharePhoneNumberViewModel.A01;
                                AnonymousClass1ZX r5 = (AnonymousClass1ZX) jid;
                                C222617g r10 = r6.A1N;
                                C16740tZ A012 = r10.A01(r10.A05.A02(r5, true), (byte) 73, r6.A0Q.A00());
                                if (A012 instanceof C39221s7) {
                                    r6.A0e.A0W(A012);
                                    r6.A1Y.Acl(new RunnableRunnableShape2S0200000_I0(r5, 39, r6));
                                    sharePhoneNumberViewModel.A02.A00(r5, 6, A0D, false);
                                } else {
                                    throw AnonymousClass000.A0T("FMessageFactory/newFMessageMedia/wrong message type; mediaWaType=\" + mediaWaType");
                                }
                            }
                        } else {
                            return;
                        }
                    } else {
                        throw C18450wi.A03("blockListManager");
                    }
                } else {
                    throw AnonymousClass000.A0W("null cannot be cast to non-null type android.app.Activity");
                }
            } else {
                return;
            }
        }
        A1D();
    }
}
