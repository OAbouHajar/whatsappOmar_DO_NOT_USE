package com.obwhatsapp.conversation.conversationrow.messagerating;

import X.AnonymousClass00B;
import X.AnonymousClass43C;
import X.C004601z;
import X.C006602z;
import X.C13680ns;
import X.C13690nt;
import X.C14870pt;
import X.C15830rv;
import X.C16030sJ;
import X.C16740tZ;
import X.C28381Vw;
import X.C34331k5;
import X.C99974ut;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.redex.RunnableRunnableShape1S1200000_I1;
import com.facebook.redex.RunnableRunnableShape1S1300000_I1;
import com.obwhatsapp.FAQTextView;
import com.obwhatsapp.R;
import com.obwhatsapp.StarRatingBar;
import com.obwhatsapp.WaTextView;
import com.obwhatsapp.components.Button;

public class MessageRatingFragment extends Hilt_MessageRatingFragment {
    public static final int[] A05 = {R.string.str0d47, R.string.str0d48, R.string.str0d49, R.string.str0d4a, R.string.str0d4b};
    public C14870pt A00;
    public AnonymousClass43C A01;
    public MessageRatingViewModel A02;
    public C15830rv A03;
    public String A04;

    public static MessageRatingFragment A01(AnonymousClass43C r5, C16740tZ r6) {
        MessageRatingFragment messageRatingFragment = new MessageRatingFragment();
        Bundle A0D = C13690nt.A0D();
        C28381Vw r2 = r6.A11;
        A0D.putString("chat_jid", C16030sJ.A03(r2.A00));
        A0D.putString("message_id", r2.A01);
        A0D.putParcelable("entry_point", r5);
        messageRatingFragment.A0T(A0D);
        return messageRatingFragment;
    }

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View A0H = C13680ns.A0H(layoutInflater, viewGroup, R.layout.layout03eb);
        C34331k5.A03(C004601z.A0E(A0H, R.id.close_button), this, 20);
        ((FAQTextView) C004601z.A0E(A0H, R.id.description)).setEducationTextFromNamedArticle(new SpannableString(A0J(R.string.str0d4c)), "chats", "controls-when-messaging-businesses");
        StarRatingBar starRatingBar = (StarRatingBar) C004601z.A0E(A0H, R.id.rating_bar);
        Button button = (Button) C004601z.A0E(A0H, R.id.submit);
        WaTextView A0S = C13680ns.A0S(A0H, R.id.rating_label);
        C34331k5.A04(button, this, starRatingBar, 37);
        starRatingBar.A01 = new C99974ut(A0S, button, this);
        C13680ns.A1N(A0H(), this.A02.A01, starRatingBar, 84);
        MessageRatingViewModel messageRatingViewModel = this.A02;
        C15830rv r4 = this.A03;
        messageRatingViewModel.A05.Acl(new RunnableRunnableShape1S1200000_I1(messageRatingViewModel, this.A04, r4, 7));
        return A0H;
    }

    public void A17(Bundle bundle) {
        super.A17(bundle);
        this.A02 = (MessageRatingViewModel) new C006602z(this).A01(MessageRatingViewModel.class);
        this.A03 = C15830rv.A02(A04().getString("chat_jid"));
        String string = A04().getString("message_id");
        AnonymousClass00B.A06(string);
        this.A04 = string;
        Parcelable parcelable = A04().getParcelable("entry_point");
        AnonymousClass00B.A06(parcelable);
        AnonymousClass43C r6 = (AnonymousClass43C) parcelable;
        this.A01 = r6;
        MessageRatingViewModel messageRatingViewModel = this.A02;
        C15830rv r5 = this.A03;
        messageRatingViewModel.A05.Acl(new RunnableRunnableShape1S1300000_I1(5, this.A04, messageRatingViewModel, r5, r6));
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        MessageRatingViewModel messageRatingViewModel = this.A02;
        C15830rv r5 = this.A03;
        String str = this.A04;
        AnonymousClass43C r6 = this.A01;
        if (!messageRatingViewModel.A00) {
            messageRatingViewModel.A05.Acl(new RunnableRunnableShape1S1300000_I1(6, str, messageRatingViewModel, r5, r6));
        }
    }
}
