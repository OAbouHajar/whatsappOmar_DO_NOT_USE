package com.facebook.redex;

import X.AnonymousClass000;
import X.AnonymousClass00B;
import X.AnonymousClass11A;
import X.AnonymousClass36U;
import X.AnonymousClass3K4;
import X.AnonymousClass5SB;
import X.C001000l;
import X.C13690nt;
import X.C14550pN;
import X.C15830rv;
import X.C15860rz;
import X.C16010sH;
import X.C16320sq;
import X.C16760tb;
import android.os.SystemClock;
import com.obwhatsapp.R;
import com.obwhatsapp.conversationslist.ConversationsFragment;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IDxCListenerShape85S0200000_2_I1 implements AnonymousClass5SB {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxCListenerShape85S0200000_2_I1(Object obj, int i2, Object obj2) {
        this.A02 = i2;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public void ATt() {
        int i2 = this.A02;
        AnonymousClass3K4.A0z(this.A00);
    }

    public void AUz(boolean z2) {
        C14550pN r3;
        C16010sH r2;
        C16320sq r1;
        C16760tb r4;
        C15860rz r5;
        AnonymousClass11A r6;
        boolean z3 = z2;
        switch (this.A02) {
            case 0:
                Log.i("conversations/bulk-delete");
                ConversationsFragment.BulkDeleteConversationDialogFragment bulkDeleteConversationDialogFragment = (ConversationsFragment.BulkDeleteConversationDialogFragment) this.A00;
                bulkDeleteConversationDialogFragment.A1C();
                ArrayList A0u = AnonymousClass000.A0u();
                for (C15830rv A0A : (List) this.A01) {
                    A0u.add(bulkDeleteConversationDialogFragment.A01.A0A(A0A));
                }
                C001000l A0C = bulkDeleteConversationDialogFragment.A0C();
                AnonymousClass00B.A06(A0C);
                C14550pN r13 = (C14550pN) A0C;
                C16320sq r22 = bulkDeleteConversationDialogFragment.A07;
                C16760tb r14 = bulkDeleteConversationDialogFragment.A00;
                C15860rz r15 = bulkDeleteConversationDialogFragment.A03;
                AnonymousClass11A r12 = bulkDeleteConversationDialogFragment.A04;
                r13.Afq(R.string.str13db);
                AnonymousClass11A r16 = r12;
                r22.Ack(new AnonymousClass36U(r13, r14, r15, r16, C13690nt.A0h(r13), A0u, SystemClock.elapsedRealtime(), z3), new Object[0]);
                return;
            case 1:
                Log.i("conversations/delete-list");
                ConversationsFragment.DeleteBroadcastListDialogFragment deleteBroadcastListDialogFragment = (ConversationsFragment.DeleteBroadcastListDialogFragment) this.A00;
                deleteBroadcastListDialogFragment.A1C();
                r3 = (C14550pN) deleteBroadcastListDialogFragment.A0C();
                r2 = (C16010sH) this.A01;
                r1 = deleteBroadcastListDialogFragment.A08;
                r4 = deleteBroadcastListDialogFragment.A00;
                r5 = deleteBroadcastListDialogFragment.A04;
                r6 = deleteBroadcastListDialogFragment.A05;
                break;
            case 2:
                Log.i("conversations/delete-contact");
                ConversationsFragment.DeleteContactDialogFragment deleteContactDialogFragment = (ConversationsFragment.DeleteContactDialogFragment) this.A00;
                deleteContactDialogFragment.A1C();
                r3 = (C14550pN) deleteContactDialogFragment.A0C();
                r2 = (C16010sH) this.A01;
                r1 = deleteContactDialogFragment.A08;
                r4 = deleteContactDialogFragment.A00;
                r5 = deleteContactDialogFragment.A04;
                r6 = deleteContactDialogFragment.A05;
                break;
            default:
                Log.i("conversations/user-deleteGroup");
                ConversationsFragment.DeleteGroupDialogFragment deleteGroupDialogFragment = (ConversationsFragment.DeleteGroupDialogFragment) this.A00;
                deleteGroupDialogFragment.A1C();
                r3 = (C14550pN) deleteGroupDialogFragment.A0C();
                r2 = (C16010sH) this.A01;
                r1 = deleteGroupDialogFragment.A09;
                r4 = deleteGroupDialogFragment.A00;
                r5 = deleteGroupDialogFragment.A04;
                r6 = deleteGroupDialogFragment.A05;
                break;
        }
        List singletonList = Collections.singletonList(r2);
        r3.Afq(R.string.str13db);
        r1.Ack(new AnonymousClass36U(r3, r4, r5, r6, C13690nt.A0h(r3), singletonList, SystemClock.elapsedRealtime(), z3), new Object[0]);
    }
}
