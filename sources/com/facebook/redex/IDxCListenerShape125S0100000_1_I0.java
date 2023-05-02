package com.facebook.redex;

import X.AnonymousClass000;
import X.AnonymousClass00B;
import X.AnonymousClass29T;
import X.C001000l;
import X.C13680ns;
import X.C14750ph;
import X.C14870pt;
import X.C16010sH;
import X.C16050sL;
import X.C16070sO;
import X.C17240ul;
import X.C17780vd;
import X.C18260wP;
import X.C30661ck;
import X.C76463tx;
import android.content.DialogInterface;
import android.content.Intent;
import com.obwhatsapp.DisplayExceptionDialogFactory$LoginFailedDialogFragment;
import com.obwhatsapp.R;
import com.obwhatsapp.group.GroupChatInfoActivity;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.Collections;
import java.util.List;

public class IDxCListenerShape125S0100000_1_I0 implements DialogInterface.OnClickListener {
    public Object A00;
    public final int A01;

    public IDxCListenerShape125S0100000_1_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        IDxRCallbackShape6S0400000_1_I1 iDxRCallbackShape6S0400000_1_I1;
        if (this.A01 != 0) {
            GroupChatInfoActivity groupChatInfoActivity = (GroupChatInfoActivity) this.A00;
            AnonymousClass29T.A00(groupChatInfoActivity, 6);
            UserJid userJid = (UserJid) C16010sH.A03(groupChatInfoActivity.A0x);
            if (groupChatInfoActivity.A1A.A06(userJid)) {
                C17240ul r5 = groupChatInfoActivity.A0H;
                C16050sL r3 = groupChatInfoActivity.A1M;
                r5.A0M(r3, Collections.singletonList(userJid));
                r5.A07.A0K(new RunnableRunnableShape7S0200000_I0_5(r5, 38, r3));
            } else {
                C30661ck A05 = C16070sO.A00(groupChatInfoActivity.A0C, groupChatInfoActivity.A1M).A05(userJid);
                if (A05 != null && A05.A01 == 2) {
                    Object[] A1b = C13680ns.A1b();
                    A1b[0] = groupChatInfoActivity.A0f.A08(groupChatInfoActivity.A06.A0A(userJid));
                    groupChatInfoActivity.Afj(A1b, 0, R.string.str0860);
                    return;
                } else if (!groupChatInfoActivity.A07.A0A()) {
                    C14870pt r2 = groupChatInfoActivity.A05;
                    boolean A02 = C18260wP.A02(groupChatInfoActivity.getApplicationContext());
                    int i3 = R.string.str0dc2;
                    if (A02) {
                        i3 = R.string.str0dc3;
                    }
                    r2.A06(i3);
                } else {
                    groupChatInfoActivity.Afr(R.string.str0f22, R.string.str13db);
                    C76463tx r8 = new C76463tx(groupChatInfoActivity.A0q, groupChatInfoActivity, groupChatInfoActivity.A0H, groupChatInfoActivity.A1M, Collections.singletonList(userJid));
                    C17780vd r22 = groupChatInfoActivity.A1E;
                    C16050sL r32 = r8.A01;
                    List list = r8.A05;
                    AnonymousClass00B.A06(list);
                    if (r8.A00) {
                        StringBuilder A0r = AnonymousClass000.A0r("GroupIqResponseUtil/remove-participants/timeout; groupId=");
                        A0r.append(r32);
                        Log.e(AnonymousClass000.A0e(list, "; participants=", A0r));
                        iDxRCallbackShape6S0400000_1_I1 = null;
                    } else {
                        iDxRCallbackShape6S0400000_1_I1 = new IDxRCallbackShape6S0400000_1_I1(r8, r22, r8, r8, 0);
                    }
                    r22.A09(r32, iDxRCallbackShape6S0400000_1_I1, "remove", list, 30, false);
                    return;
                }
            }
            groupChatInfoActivity.A3Q();
            return;
        }
        DisplayExceptionDialogFactory$LoginFailedDialogFragment displayExceptionDialogFactory$LoginFailedDialogFragment = (DisplayExceptionDialogFactory$LoginFailedDialogFragment) this.A00;
        Log.i("loggedout/verify/tos");
        C001000l A0C = displayExceptionDialogFactory$LoginFailedDialogFragment.A0C();
        if (A0C != null) {
            String A0Q = displayExceptionDialogFactory$LoginFailedDialogFragment.A01.A0Q();
            String A0O = displayExceptionDialogFactory$LoginFailedDialogFragment.A01.A0O();
            Intent A012 = C14750ph.A01(A0C);
            if (displayExceptionDialogFactory$LoginFailedDialogFragment.A00.A00() < C13680ns.A08(C13680ns.A0B(displayExceptionDialogFactory$LoginFailedDialogFragment.A01), "post_reg_notification_time") + 1800000) {
                Log.i("loggedout/verify/tos/reregister/pref-fill");
                A012.putExtra("com.obwhatsapp.registration.RegisterPhone.phone_number", A0Q);
                A012.putExtra("com.obwhatsapp.registration.RegisterPhone.country_code", A0O);
                A012.putExtra("com.obwhatsapp.registration.RegisterPhone.clear_phone_number", false);
            }
            displayExceptionDialogFactory$LoginFailedDialogFragment.A02.A01();
            displayExceptionDialogFactory$LoginFailedDialogFragment.A02.A0A(0);
            A0C.startActivity(A012);
            A0C.finishAffinity();
        }
    }
}
