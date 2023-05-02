package com.obwhatsapp.community.deactivate;

import X.AnonymousClass00B;
import X.AnonymousClass1UP;
import X.AnonymousClass1ZW;
import X.C001000l;
import X.C005702l;
import X.C107945Mb;
import X.C13680ns;
import X.C13690nt;
import X.C16000sG;
import X.C16010sH;
import X.C16050sL;
import X.C16080sP;
import X.C18450wi;
import X.C32241fu;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.facebook.redex.IDxCListenerShape126S0100000_1_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import java.util.List;

public final class DeactivateCommunityConfirmationFragment extends Hilt_DeactivateCommunityConfirmationFragment {
    public C107945Mb A00;
    public C16000sG A01;
    public C16080sP A02;

    public void A0q() {
        super.A0q();
        Dialog dialog = this.A03;
        if (dialog instanceof C005702l) {
            Button button = ((C005702l) dialog).A00.A0G;
            C13680ns.A0v(button.getContext(), button, R.color.color0699);
        }
    }

    public void A16(Context context) {
        C18450wi.A0H(context, 0);
        super.A16(context);
        AnonymousClass00B.A06(context);
        this.A00 = (C107945Mb) context;
    }

    public Dialog A1B(Bundle bundle) {
        String str;
        String string = A04().getString("parent_group_jid");
        AnonymousClass00B.A06(string);
        C18450wi.A0B(string);
        C16050sL A04 = C16050sL.A04(string);
        C18450wi.A0B(A04);
        C16000sG r0 = this.A01;
        if (r0 != null) {
            C16010sH A0A = r0.A0A(A04);
            C001000l A0D = A0D();
            View inflate = LayoutInflater.from(A0D).inflate(R.layout.layout020c, (ViewGroup) null);
            Object[] objArr = new Object[1];
            C16080sP r02 = this.A02;
            if (r02 != null) {
                String A0d = C13680ns.A0d(A0D, r02.A08(A0A), objArr, 0, R.string.str0640);
                C18450wi.A0B(A0d);
                Object[] objArr2 = new Object[1];
                C16080sP r03 = this.A02;
                if (r03 != null) {
                    Spanned A012 = AnonymousClass1ZW.A01(C13680ns.A0d(A0D, Html.escapeHtml(r03.A08(A0A)), objArr2, 0, R.string.str063f), new Object[0]);
                    C18450wi.A0B(A012);
                    TextEmojiLabel textEmojiLabel = (TextEmojiLabel) C18450wi.A00(inflate, R.id.deactivate_community_confirm_dialog_title);
                    textEmojiLabel.A0I((List) null, A0d);
                    AnonymousClass1UP.A06(textEmojiLabel);
                    C13680ns.A0Q(inflate, R.id.deactivate_community_confirm_dialog_message).A0I((List) null, A012);
                    C32241fu A002 = C32241fu.A00(A0D);
                    A002.setView(inflate);
                    A002.A07(true);
                    C13690nt.A1H(A002, this, 38, R.string.str0394);
                    A002.setPositiveButton(R.string.str063e, new IDxCListenerShape126S0100000_1_I1(this, 1));
                    return A002.create();
                }
            }
            str = "waContactNames";
        } else {
            str = "contactManager";
        }
        throw C18450wi.A03(str);
    }
}
