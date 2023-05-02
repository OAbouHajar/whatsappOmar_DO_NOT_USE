package com.obwhatsapp.community;

import X.AnonymousClass00B;
import X.C004601z;
import X.C005702l;
import X.C13680ns;
import X.C13690nt;
import X.C14550pN;
import X.C14870pt;
import X.C15830rv;
import X.C16000sG;
import X.C16010sH;
import X.C16050sL;
import X.C16320sq;
import X.C25931Lr;
import X.C32241fu;
import X.C91414fs;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import com.obwhatsapp.R;

public class CommunitySpamReportDialogFragment extends Hilt_CommunitySpamReportDialogFragment {
    public C14870pt A00;
    public C16000sG A01;
    public C25931Lr A02;
    public C16320sq A03;

    public static CommunitySpamReportDialogFragment A01(C16050sL r4, boolean z2) {
        Bundle A0D = C13690nt.A0D();
        A0D.putString("jid", r4.getRawString());
        A0D.putString("spamFlow", "community_home");
        A0D.putBoolean("shouldUpsellExit", z2);
        CommunitySpamReportDialogFragment communitySpamReportDialogFragment = new CommunitySpamReportDialogFragment();
        communitySpamReportDialogFragment.A0T(A0D);
        return communitySpamReportDialogFragment;
    }

    public Dialog A1B(Bundle bundle) {
        C14550pN r6 = (C14550pN) A0C();
        C15830rv A022 = C15830rv.A02(A04().getString("jid"));
        AnonymousClass00B.A06(A022);
        String string = A04().getString("spamFlow");
        C16010sH A0A = this.A01.A0A(A022);
        View inflate = LayoutInflater.from(A0u()).inflate(R.layout.layout022d, (ViewGroup) null);
        TextView A0L = C13680ns.A0L(inflate, R.id.report_spam_dialog_message);
        CheckBox checkBox = (CheckBox) C004601z.A0E(inflate, R.id.block_checkbox);
        AnonymousClass00B.A06(r6);
        C32241fu A002 = C32241fu.A00(r6);
        A002.setView(inflate);
        A002.A02(R.string.str1415);
        A0L.setText(R.string.str1429);
        boolean z2 = A04().getBoolean("shouldUpsellExit");
        if (z2) {
            View findViewById = inflate.findViewById(R.id.block_checkbox_text);
            AnonymousClass00B.A04(findViewById);
            ((TextView) findViewById).setText(R.string.str142a);
        } else {
            C004601z.A0E(inflate, R.id.block_container).setVisibility(8);
        }
        A002.setPositiveButton(R.string.str1420, new C91414fs(checkBox, r6, this, A0A, string, z2));
        A002.setNegativeButton(R.string.str0394, (DialogInterface.OnClickListener) null);
        C005702l create = A002.create();
        create.setCanceledOnTouchOutside(true);
        return create;
    }
}
