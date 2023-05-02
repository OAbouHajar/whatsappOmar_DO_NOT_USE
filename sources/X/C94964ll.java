package X;

import com.obwhatsapp.conversationslist.LeaveGroupsDialogFragment;
import com.obwhatsapp.dialogs.ProgressDialogFragment;
import java.util.Set;

/* renamed from: X.4ll  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C94964ll implements AnonymousClass025 {
    public final /* synthetic */ AnonymousClass02C A00;
    public final /* synthetic */ ProgressDialogFragment A01;
    public final /* synthetic */ Set A02;

    public /* synthetic */ C94964ll(AnonymousClass02C r1, ProgressDialogFragment progressDialogFragment, Set set) {
        this.A01 = progressDialogFragment;
        this.A02 = set;
        this.A00 = r1;
    }

    public final Object apply(Object obj) {
        ProgressDialogFragment progressDialogFragment = this.A01;
        Set set = this.A02;
        AnonymousClass02C r1 = this.A00;
        C56062kt r10 = (C56062kt) obj;
        progressDialogFragment.A1N();
        LeaveGroupsDialogFragment.A01(r10.A01, (String) null, set, r10.A00, 1, false, true).A1G(r1, (String) null);
        return null;
    }
}
