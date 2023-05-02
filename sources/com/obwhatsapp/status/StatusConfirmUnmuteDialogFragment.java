package com.obwhatsapp.status;

import X.AnonymousClass000;
import X.AnonymousClass00B;
import X.AnonymousClass1L1;
import X.AnonymousClass3I8;
import X.AnonymousClass3K2;
import X.AnonymousClass3K4;
import X.C13680ns;
import X.C13690nt;
import X.C16000sG;
import X.C16010sH;
import X.C16080sP;
import X.C26941Pv;
import X.C32241fu;
import X.C34691ki;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.obwhatsapp.R;
import com.whatsapp.jid.UserJid;

public class StatusConfirmUnmuteDialogFragment extends Hilt_StatusConfirmUnmuteDialogFragment {
    public C16000sG A00;
    public C16080sP A01;
    public C34691ki A02;
    public C26941Pv A03;
    public AnonymousClass1L1 A04;

    public static StatusConfirmUnmuteDialogFragment A01(UserJid userJid, Long l2, String str, String str2, String str3, boolean z2) {
        StatusConfirmUnmuteDialogFragment statusConfirmUnmuteDialogFragment = new StatusConfirmUnmuteDialogFragment();
        Bundle A0D = C13690nt.A0D();
        A0D.putString("jid", userJid.getRawString());
        A0D.putString("message_id", str);
        A0D.putLong("status_item_index", l2 != null ? l2.longValue() : 0);
        A0D.putString("psa_campaign_id", str2);
        A0D.putString("psa_campaign_ids", str3);
        A0D.putBoolean("is_message_sampled", z2);
        statusConfirmUnmuteDialogFragment.A0T(A0D);
        return statusConfirmUnmuteDialogFragment;
    }

    public static /* synthetic */ void A02(UserJid userJid, StatusConfirmUnmuteDialogFragment statusConfirmUnmuteDialogFragment) {
        StringBuilder A0r = AnonymousClass000.A0r("statusesfragment/unmute status for ");
        A0r.append(userJid);
        C13680ns.A1V(A0r);
        statusConfirmUnmuteDialogFragment.A03.A07.A00(userJid, false);
        AnonymousClass1L1 r3 = statusConfirmUnmuteDialogFragment.A04;
        String string = statusConfirmUnmuteDialogFragment.A04().getString("message_id");
        Long valueOf = Long.valueOf(statusConfirmUnmuteDialogFragment.A04().getLong("status_item_index"));
        String string2 = statusConfirmUnmuteDialogFragment.A04().getString("psa_campaign_id");
        String string3 = statusConfirmUnmuteDialogFragment.A04().getString("psa_campaign_ids");
        r3.A0F.Acl(new AnonymousClass3I8(userJid, r3, C13680ns.A0Z(), valueOf, string2, string, string3, statusConfirmUnmuteDialogFragment.A04().getBoolean("is_message_sampled")));
        statusConfirmUnmuteDialogFragment.A1C();
    }

    public void A17(Bundle bundle) {
        super.A17(bundle);
        try {
            this.A02 = (C34691ki) A0A();
        } catch (ClassCastException unused) {
            throw new ClassCastException("Calling fragment must implement Host interface");
        }
    }

    public Dialog A1B(Bundle bundle) {
        this.A02.APj(this, true);
        UserJid nullable = UserJid.getNullable(A04().getString("jid"));
        AnonymousClass00B.A06(nullable);
        C16010sH A0A = this.A00.A0A(nullable);
        C32241fu A0R = AnonymousClass3K2.A0R(this);
        A0R.setTitle(C13690nt.A0c(this, this.A01.A0C(A0A), new Object[1], 0, R.string.str1898));
        A0R.A06(C13690nt.A0c(this, this.A01.A08(A0A), new Object[1], 0, R.string.str1897));
        C13690nt.A1H(A0R, this, 103, R.string.str0394);
        AnonymousClass3K4.A0n(A0R, nullable, this, 33, R.string.str1896);
        return A0R.create();
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        this.A02.APj(this, false);
    }
}
