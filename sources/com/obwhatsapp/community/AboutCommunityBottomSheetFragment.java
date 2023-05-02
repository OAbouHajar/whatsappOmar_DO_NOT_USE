package com.obwhatsapp.community;

import X.AnonymousClass01V;
import X.AnonymousClass04o;
import X.AnonymousClass1L3;
import X.AnonymousClass1UP;
import X.AnonymousClass1W4;
import X.AnonymousClass3MF;
import X.C001500q;
import X.C004601z;
import X.C006602z;
import X.C14710pd;
import X.C16050sL;
import X.C16620tM;
import X.C17110uY;
import X.C17220uj;
import X.C17230uk;
import X.C18450wi;
import X.C50132Yc;
import X.C50152Ye;
import X.C57102q8;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.redex.IDxFactoryShape55S0200000_2_I0;
import com.facebook.redex.RunnableRunnableShape0S0000000_I0;
import com.facebook.redex.ViewOnClickCListenerShape9S0100000_I0_2;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.util.ViewOnClickCListenerShape0S0100000_I0;

public class AboutCommunityBottomSheetFragment extends Hilt_AboutCommunityBottomSheetFragment {
    public C50132Yc A00;
    public C17230uk A01;
    public AnonymousClass1L3 A02;
    public AnonymousClass01V A03;
    public C14710pd A04;
    public C16050sL A05;
    public C17220uj A06;
    public C17110uY A07;

    public static AboutCommunityBottomSheetFragment A01(GroupJid groupJid) {
        AboutCommunityBottomSheetFragment aboutCommunityBottomSheetFragment = new AboutCommunityBottomSheetFragment();
        Bundle bundle = new Bundle();
        bundle.putString("EXTRA_PARENT_GROUP_JID", groupJid.getRawString());
        aboutCommunityBottomSheetFragment.A0T(bundle);
        return aboutCommunityBottomSheetFragment;
    }

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(R.layout.layout001d, viewGroup, true);
    }

    public void A17(Bundle bundle) {
        super.A17(bundle);
        try {
            C16050sL A042 = C16050sL.A04(A04().getString("EXTRA_PARENT_GROUP_JID"));
            this.A05 = A042;
            C50132Yc r2 = this.A00;
            C18450wi.A0H(r2, 1);
            C18450wi.A0H(A042, 2);
            C50152Ye r0 = (C50152Ye) new C006602z((AnonymousClass04o) new IDxFactoryShape55S0200000_2_I0(A042, 0, r2), (C001500q) this).A01(C50152Ye.class);
            r0.A01.A00("community_home", r0.A00);
        } catch (AnonymousClass1W4 e2) {
            throw new RuntimeException(e2);
        }
    }

    public void A18(Bundle bundle, View view) {
        C004601z.A0E(view, R.id.bottom_sheet_close_button).setOnClickListener(new ViewOnClickCListenerShape9S0100000_I0_2(this, 1));
        AnonymousClass1UP.A06((TextView) C004601z.A0E(view, R.id.about_community_title));
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) C004601z.A0E(view, R.id.about_community_description);
        C14710pd r0 = this.A04;
        C16620tM r3 = C16620tM.A02;
        if (r0.A0E(r3, 2356)) {
            textEmojiLabel.setText(R.string.str0002);
        } else {
            String[] strArr = {this.A06.A04("570221114584995").toString()};
            Runnable[] runnableArr = {new RunnableRunnableShape0S0000000_I0(9)};
            SpannableString A052 = this.A07.A05(A0K(R.string.str0001, "learn-more"), runnableArr, new String[]{"learn-more"}, strArr);
            textEmojiLabel.setAccessibilityHelper(new C57102q8(textEmojiLabel, this.A03));
            textEmojiLabel.A07 = new AnonymousClass3MF();
            textEmojiLabel.setText(A052);
        }
        TextEmojiLabel textEmojiLabel2 = (TextEmojiLabel) C004601z.A0E(view, R.id.additional_community_description);
        if (this.A04.A0E(r3, 2356)) {
            String[] strArr2 = {this.A06.A04("812356880201038").toString()};
            Runnable[] runnableArr2 = {new RunnableRunnableShape0S0000000_I0(10)};
            SpannableString A053 = this.A07.A05(A0K(R.string.str0004, "learn-more"), runnableArr2, new String[]{"learn-more"}, strArr2);
            textEmojiLabel2.setAccessibilityHelper(new C57102q8(textEmojiLabel2, this.A03));
            textEmojiLabel2.A07 = new AnonymousClass3MF();
            textEmojiLabel2.setText(A053);
        } else {
            textEmojiLabel2.setText(R.string.str0003);
        }
        C004601z.A0E(view, R.id.about_community_join_button).setOnClickListener(new ViewOnClickCListenerShape0S0100000_I0(this, 45));
    }
}
