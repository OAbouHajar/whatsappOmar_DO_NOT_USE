package com.obwhatsapp.conversation;

import X.AnonymousClass00B;
import X.AnonymousClass023;
import X.C001000l;
import X.C13690nt;
import X.C15830rv;
import X.C16220sf;
import X.C32241fu;
import X.C82624Dn;
import android.app.Dialog;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.redex.IDxCListenerShape128S0100000_2_I1;
import com.facebook.redex.IDxObserverShape116S0100000_2_I1;
import com.obwhatsapp.R;

public class ChatMediaVisibilityDialog extends Hilt_ChatMediaVisibilityDialog {
    public int A00;
    public int A01;
    public C82624Dn A02;
    public C15830rv A03;
    public C16220sf A04;
    public boolean A05;

    public ChatMediaVisibilityDialog() {
    }

    public ChatMediaVisibilityDialog(C82624Dn r1) {
        this.A02 = r1;
    }

    public static ChatMediaVisibilityDialog A01(C82624Dn r4, C15830rv r5) {
        AnonymousClass00B.A06(r5);
        ChatMediaVisibilityDialog chatMediaVisibilityDialog = new ChatMediaVisibilityDialog(r4);
        Bundle A0D = C13690nt.A0D();
        A0D.putString("chatJid", r5.getRawString());
        chatMediaVisibilityDialog.A0T(A0D);
        return chatMediaVisibilityDialog;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x002e, code lost:
        if (r2 == 2) goto L_0x0030;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A17(android.os.Bundle r4) {
        /*
            r3 = this;
            super.A17(r4)
            android.os.Bundle r1 = r3.A04()
            java.lang.String r0 = "chatJid"
            java.lang.String r0 = r1.getString(r0)
            X.0rv r2 = X.C15830rv.A02(r0)
            java.lang.String r0 = "Chat jid must be passed to "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            java.lang.String r0 = "ChatMediaVisibilityDialog"
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)
            X.AnonymousClass00B.A07(r2, r0)
            r3.A03 = r2
            X.0sf r0 = r3.A04
            X.1WS r0 = r0.A03()
            int r2 = r0.A01
            if (r2 == 0) goto L_0x0030
            r1 = 2
            r0 = 0
            if (r2 != r1) goto L_0x0031
        L_0x0030:
            r0 = 1
        L_0x0031:
            r3.A05 = r0
            X.0sf r1 = r3.A04
            X.0rv r0 = r3.A03
            X.1WS r0 = r1.A06(r0)
            int r0 = r0.A01
            r3.A00 = r0
            r3.A01 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.conversation.ChatMediaVisibilityDialog.A17(android.os.Bundle):void");
    }

    public Dialog A1B(Bundle bundle) {
        CharSequence[] charSequenceArr = new CharSequence[3];
        boolean z2 = this.A05;
        int i2 = R.string.str0661;
        if (z2) {
            i2 = R.string.str0662;
        }
        int i3 = 0;
        charSequenceArr[0] = A0J(i2);
        charSequenceArr[1] = A0J(R.string.str1ba6);
        charSequenceArr[2] = A0J(R.string.str0de3);
        int i4 = this.A00;
        if (i4 == 1) {
            i3 = 2;
        } else if (i4 == 2) {
            i3 = 1;
        }
        C001000l A0D = A0D();
        TextView textView = (TextView) A0D.getLayoutInflater().inflate(R.layout.layout0207, (ViewGroup) null);
        textView.setText(R.string.str0442);
        C32241fu A002 = C32241fu.A00(A0D);
        A002.A01.A0B = textView;
        A002.A05(new IDxCListenerShape128S0100000_2_I1(this, 42), charSequenceArr, i3);
        A002.A0F(this, new IDxObserverShape116S0100000_2_I1(this, 80), R.string.str0e87);
        A002.A0E(this, (AnonymousClass023) null, R.string.str0394);
        return A002.create();
    }
}
