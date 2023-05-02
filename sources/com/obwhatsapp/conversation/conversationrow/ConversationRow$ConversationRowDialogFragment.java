package com.obwhatsapp.conversation.conversationrow;

import X.AnonymousClass000;
import X.AnonymousClass00B;
import X.C13680ns;
import X.C13690nt;
import X.C15830rv;
import X.C16000sG;
import X.C16010sH;
import X.C16040sK;
import X.C16080sP;
import X.C32241fu;
import X.C88684av;
import android.app.Dialog;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import com.facebook.redex.IDxCListenerShape20S0300000_1_I1;
import com.obwhatsapp.R;
import java.util.ArrayList;

public class ConversationRow$ConversationRowDialogFragment extends Hilt_ConversationRow_ConversationRowDialogFragment {
    public C16040sK A00;
    public C16000sG A01;
    public C16080sP A02;

    public static ConversationRow$ConversationRowDialogFragment A01(C15830rv r4) {
        ConversationRow$ConversationRowDialogFragment conversationRow$ConversationRowDialogFragment = new ConversationRow$ConversationRowDialogFragment();
        Bundle A0D = C13690nt.A0D();
        A0D.putString("jid", r4.getRawString());
        conversationRow$ConversationRowDialogFragment.A0T(A0D);
        return conversationRow$ConversationRowDialogFragment;
    }

    public Dialog A1B(Bundle bundle) {
        String string = this.A05.getString("jid");
        C15830rv A022 = C15830rv.A02(string);
        AnonymousClass00B.A07(A022, C13680ns.A0h("ConversationRow/onCreateDialog/invalid jid=", string));
        C16010sH A002 = C16000sG.A00(this.A01, A022);
        ArrayList A0u = AnonymousClass000.A0u();
        if (!A002.A0G() && (!this.A00.A0G())) {
            A0u.add(new C88684av(A0u().getString(R.string.str00a6), (int) R.id.menuitem_add_to_contacts));
            A0u.add(new C88684av(A0u().getString(R.string.str00af), (int) R.id.menuitem_add_to_existing_contact));
        }
        String A0C = this.A02.A0C(A002);
        A0u.add(new C88684av(C13680ns.A0d(A0u(), A0C, new Object[1], 0, R.string.str0d32), (int) R.id.menuitem_message_contact));
        A0u.add(new C88684av(C13680ns.A0d(A0u(), A0C, new Object[1], 0, R.string.str1a43), (int) R.id.menuitem_voice_call_contact));
        A0u.add(new C88684av(C13680ns.A0d(A0u(), A0C, new Object[1], 0, R.string.viewallmsgs), (int) R.id.button1));
        A0u.add(new C88684av(C13680ns.A0d(A0u(), A0C, new Object[1], 0, R.string.str19b8), (int) R.id.menuitem_video_call_contact));
        C32241fu A003 = C32241fu.A00(A0u());
        A003.A04(new IDxCListenerShape20S0300000_1_I1(this, A022, A0u, 0), new ArrayAdapter(A0u(), 17367043, A0u));
        return A003.create();
    }
}
