package X;

import com.obwhatsapp.conversationslist.LeaveGroupsDialogFragment;
import java.util.Collections;
import java.util.Set;

/* renamed from: X.2jd  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C55452jd implements AnonymousClass025 {
    public final /* synthetic */ C55442jc A00;
    public final /* synthetic */ C16050sL A01;

    public /* synthetic */ C55452jd(C55442jc r1, C16050sL r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final Object apply(Object obj) {
        C55442jc r2 = this.A00;
        C16050sL r0 = this.A01;
        C56062kt r10 = (C56062kt) obj;
        C14600pS r1 = r2.A03;
        r1.Ac1();
        Set singleton = Collections.singleton(r0);
        String str = "group_spam_banner_exit";
        if (r2.A01) {
            str = "triggered_block";
        }
        r1.Afc(LeaveGroupsDialogFragment.A01(r10.A01, str, singleton, 0, 2, true, false));
        return null;
    }
}
