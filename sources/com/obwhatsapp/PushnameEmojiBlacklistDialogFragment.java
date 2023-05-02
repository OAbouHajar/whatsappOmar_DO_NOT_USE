package com.obwhatsapp;

import X.AnonymousClass00B;
import X.AnonymousClass013;
import X.AnonymousClass2Sy;
import X.C005702l;
import X.C13690nt;
import X.C17220uj;
import X.C17250um;
import X.C32241fu;
import X.C81954Al;
import android.app.Dialog;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.redex.IDxCListenerShape23S0000000_2_I1;
import com.facebook.redex.IDxCListenerShape2S1100000_2_I1;
import java.util.ArrayList;

public class PushnameEmojiBlacklistDialogFragment extends Hilt_PushnameEmojiBlacklistDialogFragment {
    public AnonymousClass013 A00;
    public C17250um A01;
    public C17220uj A02;

    public static PushnameEmojiBlacklistDialogFragment A01(String str) {
        PushnameEmojiBlacklistDialogFragment pushnameEmojiBlacklistDialogFragment = new PushnameEmojiBlacklistDialogFragment();
        Bundle A0D = C13690nt.A0D();
        ArrayList A0i = C13690nt.A0i(r4);
        for (String str2 : C81954Al.A01) {
            if (str.contains(str2)) {
                A0i.add(str2);
            }
        }
        A0D.putStringArrayList("invalid_emojis", A0i);
        pushnameEmojiBlacklistDialogFragment.A0T(A0D);
        return pushnameEmojiBlacklistDialogFragment;
    }

    public Dialog A1B(Bundle bundle) {
        C32241fu A002 = C32241fu.A00(A0C());
        ArrayList<String> stringArrayList = A04().getStringArrayList("invalid_emojis");
        AnonymousClass00B.A06(stringArrayList);
        String obj = this.A02.A04("26000056").toString();
        A002.A06(AnonymousClass2Sy.A05(A0C().getApplicationContext(), this.A01, this.A00.A0J(new Object[]{TextUtils.join(" ", stringArrayList)}, R.plurals.plurals011b, (long) stringArrayList.size())));
        A002.A0B(new IDxCListenerShape2S1100000_2_I1(0, obj, this), R.string.str1cf6);
        A002.setPositiveButton(R.string.str0e87, new IDxCListenerShape23S0000000_2_I1(0));
        C005702l create = A002.create();
        create.setCanceledOnTouchOutside(true);
        return create;
    }
}
