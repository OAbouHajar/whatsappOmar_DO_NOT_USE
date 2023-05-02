package X;

import com.obwhatsapp.blockbusiness.blockreasonlist.BlockReasonListFragment;
import com.obwhatsapp.components.Button;

/* renamed from: X.5FC  reason: invalid class name */
public final class AnonymousClass5FC extends AnonymousClass1DR implements AnonymousClass22J {
    public final /* synthetic */ BlockReasonListFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5FC(BlockReasonListFragment blockReasonListFragment) {
        super(1);
        this.this$0 = blockReasonListFragment;
    }

    public /* bridge */ /* synthetic */ Object AIU(Object obj) {
        Button button = this.this$0.A03;
        if (button == null) {
            throw C18450wi.A03("blockButton");
        }
        button.setEnabled(true);
        return AnonymousClass22M.A00;
    }
}
