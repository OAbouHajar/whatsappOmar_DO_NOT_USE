package com.obwhatsapp.conversation.conversationrow;

import X.AnonymousClass000;
import X.AnonymousClass1L6;
import X.C13680ns;
import X.C13690nt;
import X.C16030sJ;
import X.C32241fu;
import X.C88684av;
import X.C91274fe;
import android.app.Dialog;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.ArrayAdapter;
import com.obwhatsapp.R;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.List;

public class ConversationRowContact$MessageSharedContactDialogFragment extends Hilt_ConversationRowContact_MessageSharedContactDialogFragment {
    public AnonymousClass1L6 A00;

    public static ConversationRowContact$MessageSharedContactDialogFragment A01(String str, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        ConversationRowContact$MessageSharedContactDialogFragment conversationRowContact$MessageSharedContactDialogFragment = new ConversationRowContact$MessageSharedContactDialogFragment();
        Bundle A0D = C13690nt.A0D();
        A0D.putStringArrayList("jids", C16030sJ.A06(arrayList));
        A0D.putStringArrayList("phones", arrayList2);
        A0D.putStringArrayList("labels", arrayList3);
        A0D.putString("business_name", str);
        conversationRowContact$MessageSharedContactDialogFragment.A0T(A0D);
        return conversationRowContact$MessageSharedContactDialogFragment;
    }

    public Dialog A1B(Bundle bundle) {
        String A0h;
        List A08 = C16030sJ.A08(UserJid.class, A04().getStringArrayList("jids"));
        ArrayList<String> stringArrayList = this.A05.getStringArrayList("phones");
        ArrayList<String> stringArrayList2 = this.A05.getStringArrayList("labels");
        String string = this.A05.getString("business_name");
        ArrayList A0u = AnonymousClass000.A0u();
        if (!(stringArrayList2 == null || stringArrayList == null)) {
            for (int i2 = 0; i2 < A08.size(); i2++) {
                if (A08.get(i2) != null) {
                    StringBuilder A0o = AnonymousClass000.A0o();
                    A0o.append(C13680ns.A0d(A0u(), stringArrayList.get(i2), C13680ns.A1b(), 0, R.string.str0d32));
                    if (TextUtils.isEmpty(stringArrayList2.get(i2))) {
                        A0h = "";
                    } else {
                        StringBuilder A0r = AnonymousClass000.A0r(" (");
                        A0r.append(stringArrayList2.get(i2));
                        A0h = AnonymousClass000.A0h(")", A0r);
                    }
                    A0u.add(new C88684av((UserJid) A08.get(i2), AnonymousClass000.A0h(A0h, A0o)));
                }
            }
        }
        C32241fu A002 = C32241fu.A00(A02());
        A002.A04(new C91274fe(this, string, A0u), new ArrayAdapter(A0u(), R.layout.layout053b, A0u));
        return A002.create();
    }
}
