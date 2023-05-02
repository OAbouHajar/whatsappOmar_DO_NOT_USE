package X;

import com.facebook.redex.RunnableRunnableShape0S0101000_I0;
import com.obwhatsapp.group.GroupMembershipApprovalRequestsFragment;

/* renamed from: X.5FL  reason: invalid class name */
public final class AnonymousClass5FL extends AnonymousClass1DR implements AnonymousClass22J {
    public final /* synthetic */ GroupMembershipApprovalRequestsFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5FL(GroupMembershipApprovalRequestsFragment groupMembershipApprovalRequestsFragment) {
        super(1);
        this.this$0 = groupMembershipApprovalRequestsFragment;
    }

    public /* bridge */ /* synthetic */ Object AIU(Object obj) {
        String str;
        int A0D = AnonymousClass000.A0D(obj);
        C14870pt r0 = this.this$0.A01;
        if (r0 != null) {
            if (r0.A0O()) {
                AnonymousClass2O4 r3 = this.this$0.A05;
                if (r3 == null) {
                    str = "viewModel";
                } else {
                    r3.A0D.Acl(new RunnableRunnableShape0S0101000_I0((Object) r3, A0D, 16));
                }
            }
            return AnonymousClass22M.A00;
        }
        str = "globalUi";
        throw C18450wi.A03(str);
    }
}
