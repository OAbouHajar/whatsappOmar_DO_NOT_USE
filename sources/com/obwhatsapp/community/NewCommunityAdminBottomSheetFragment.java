package com.obwhatsapp.community;

import X.AnonymousClass1UP;
import X.AnonymousClass3MF;
import X.AnonymousClass3Q6;
import X.C004601z;
import X.C16050sL;
import X.C17110uY;
import X.C23071Aj;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.redex.IDxObserverShape115S0100000_2_I0;
import com.facebook.redex.RunnableRunnableShape0S0000000_I0;
import com.facebook.redex.ViewOnClickCListenerShape9S0100000_I0_2;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import com.whatsapp.util.Log;
import com.whatsapp.util.ViewOnClickCListenerShape1S0100000_I0_1;

public class NewCommunityAdminBottomSheetFragment extends Hilt_NewCommunityAdminBottomSheetFragment {
    public C23071Aj A00;
    public AnonymousClass3Q6 A01;
    public C17110uY A02;

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C16050sL r1 = (C16050sL) A04().getParcelable("parent_group_jid");
        if (r1 != null) {
            this.A01.A00 = r1;
            return layoutInflater.inflate(R.layout.layout0401, viewGroup, true);
        }
        Log.e("NewCommunityAdminBottomSheetFragment/onCreateView parent jid was null");
        A1C();
        return null;
    }

    public void A17(Bundle bundle) {
        super.A17(bundle);
        this.A01.A01.A0A(this, new IDxObserverShape115S0100000_2_I0((Object) this, 126));
    }

    public void A18(Bundle bundle, View view) {
        C004601z.A0E(view, R.id.bottom_sheet_close_button).setOnClickListener(new ViewOnClickCListenerShape9S0100000_I0_2(this, 8));
        AnonymousClass1UP.A06((TextView) C004601z.A0E(view, R.id.newCommunityAdminNux_title));
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) C004601z.A0E(view, R.id.newCommunityAdminNux_description);
        textEmojiLabel.A07 = new AnonymousClass3MF();
        String[] strArr = {this.A00.A00("https://www.whatsapp.com/communities/learning").toString()};
        Runnable[] runnableArr = {new RunnableRunnableShape0S0000000_I0(11)};
        textEmojiLabel.setText(this.A02.A05(A0K(R.string.str0dc9, "learn-more"), runnableArr, new String[]{"learn-more"}, strArr));
        C004601z.A0E(view, R.id.newCommunityAdminNux_continueButton).setOnClickListener(new ViewOnClickCListenerShape1S0100000_I0_1(this, 5));
        C004601z.A0E(view, R.id.newCommunityAdminNux_removeAsAdminButton).setOnClickListener(new ViewOnClickCListenerShape1S0100000_I0_1(this, 6));
    }
}
