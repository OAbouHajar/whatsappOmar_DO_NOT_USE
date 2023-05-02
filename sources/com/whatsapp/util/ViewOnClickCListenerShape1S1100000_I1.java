package com.whatsapp.util;

import X.AnonymousClass000;
import X.AnonymousClass34C;
import X.C13690nt;
import X.C30011bb;
import X.C34331k5;
import android.content.ActivityNotFoundException;
import android.net.Uri;
import android.view.View;
import com.obwhatsapp.R;
import com.obwhatsapp.conversation.ConversationAttachmentContentView;

public class ViewOnClickCListenerShape1S1100000_I1 extends C34331k5 {
    public Object A00;
    public String A01;
    public final int A02;

    public ViewOnClickCListenerShape1S1100000_I1(int i2, String str, Object obj) {
        this.A02 = i2;
        this.A00 = obj;
        this.A01 = str;
    }

    public void A06(View view) {
        switch (this.A02) {
            case 0:
                ((ConversationAttachmentContentView) this.A00).A0D.A0D(this.A01, false);
                return;
            case 1:
                String str = this.A01;
                Uri parse = Uri.parse(str);
                if (parse.getScheme() == null) {
                    parse = Uri.parse(AnonymousClass000.A0h(str, AnonymousClass000.A0r("http://")));
                }
                try {
                    ((View) this.A00).getContext().startActivity(C13690nt.A0B(parse));
                    return;
                } catch (ActivityNotFoundException unused) {
                    ((C30011bb) this.A00).A0J.A09(R.string.str00a0, 0);
                    return;
                }
            default:
                AnonymousClass34C r0 = (AnonymousClass34C) this.A00;
                r0.A01.Act(r0.getContext(), Uri.parse(this.A01));
                return;
        }
    }
}
