package com.facebook.redex;

import X.C13680ns;
import X.C13690nt;
import X.C17220uj;
import X.C74583qm;
import X.C75073rZ;
import android.content.DialogInterface;
import android.net.Uri;
import com.obwhatsapp.chatinfo.ChatInfoActivity$EncryptionExplanationDialogFragment;
import com.obwhatsapp.conversation.conversationrow.BusinessTransitionInfoDialogFragment;
import com.obwhatsapp.conversation.conversationrow.VerifiedBusinessInfoDialogFragment;

public class IDxCListenerShape7S0101000_2_I1 implements DialogInterface.OnClickListener {
    public int A00;
    public Object A01;
    public final int A02;

    public IDxCListenerShape7S0101000_2_I1(Object obj, int i2, int i3) {
        this.A02 = i3;
        this.A01 = obj;
        this.A00 = i2;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        switch (this.A02) {
            case 0:
                ChatInfoActivity$EncryptionExplanationDialogFragment chatInfoActivity$EncryptionExplanationDialogFragment = (ChatInfoActivity$EncryptionExplanationDialogFragment) this.A01;
                int i3 = this.A00;
                C17220uj r2 = chatInfoActivity$EncryptionExplanationDialogFragment.A07;
                chatInfoActivity$EncryptionExplanationDialogFragment.A00.A06(chatInfoActivity$EncryptionExplanationDialogFragment.A02(), C13690nt.A0B(i3 == 1 ? r2.A04("28030015") : r2.A05("security-and-privacy", "end-to-end-encryption-for-business-messages")));
                chatInfoActivity$EncryptionExplanationDialogFragment.A1C();
                return;
            case 1:
                BusinessTransitionInfoDialogFragment businessTransitionInfoDialogFragment = (BusinessTransitionInfoDialogFragment) this.A01;
                int i4 = this.A00;
                C75073rZ r1 = businessTransitionInfoDialogFragment.A05;
                if (r1 != null) {
                    r1.A01 = 2;
                    businessTransitionInfoDialogFragment.A04.A06(r1);
                }
                if (i4 == 30) {
                    C74583qm r12 = new C74583qm();
                    r12.A00 = 2;
                    r12.A01 = 14;
                    businessTransitionInfoDialogFragment.A04.A06(r12);
                }
                businessTransitionInfoDialogFragment.A00.A06(businessTransitionInfoDialogFragment.A0u(), C13690nt.A0B(businessTransitionInfoDialogFragment.A06.A05("security-and-privacy", "end-to-end-encryption-for-business-messages")));
                businessTransitionInfoDialogFragment.A1C();
                return;
            default:
                VerifiedBusinessInfoDialogFragment verifiedBusinessInfoDialogFragment = (VerifiedBusinessInfoDialogFragment) this.A01;
                int i5 = this.A00;
                Uri A04 = verifiedBusinessInfoDialogFragment.A03.A04("26000089");
                if (i5 == 46) {
                    C74583qm r13 = new C74583qm();
                    r13.A00 = C13680ns.A0Z();
                    r13.A01 = 14;
                    verifiedBusinessInfoDialogFragment.A02.A06(r13);
                }
                verifiedBusinessInfoDialogFragment.A00.A06(verifiedBusinessInfoDialogFragment.A0u(), C13690nt.A0B(A04));
                verifiedBusinessInfoDialogFragment.A1C();
                return;
        }
    }
}
