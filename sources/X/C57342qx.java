package X;

import androidx.recyclerview.widget.RecyclerView;
import com.obwhatsapp.polls.PollCreatorActivity;
import com.obwhatsapp.polls.PollCreatorViewModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.2qx  reason: invalid class name and case insensitive filesystem */
public class C57342qx extends AnonymousClass0FZ {
    public final /* synthetic */ PollCreatorActivity A00;

    public C57342qx(PollCreatorActivity pollCreatorActivity) {
        this.A00 = pollCreatorActivity;
    }

    public int A01(C005602k r5, RecyclerView recyclerView) {
        PollCreatorActivity pollCreatorActivity = this.A00;
        if (pollCreatorActivity.A0D) {
            int A002 = r5.A00() - 2;
            if (r5 instanceof AnonymousClass33q) {
                return 0;
            }
            List list = pollCreatorActivity.A0A.A0G;
            if (A002 < list.size() && ((C77753wU) list.get(A002)).A00.isEmpty()) {
                return 0;
            }
        } else if (r5 instanceof AnonymousClass33q) {
            return 0;
        } else {
            PollCreatorViewModel pollCreatorViewModel = pollCreatorActivity.A0A;
            int A003 = r5.A00() - 2;
            List list2 = pollCreatorViewModel.A0G;
            if (list2.size() > 0 && ((C77753wU) list2.get(C13700nu.A00(list2, 1))).A00.isEmpty() && A003 == C13700nu.A00(list2, 1)) {
                return 0;
            }
        }
        return super.A01(r5, recyclerView);
    }

    public void A03(C005602k r4, int i2) {
        if (i2 == 2) {
            if (r4 != null) {
                this.A00.A02.hideSoftInputFromWindow(r4.A0H.getWindowToken(), 0);
            }
        } else if (i2 == 0) {
            PollCreatorActivity pollCreatorActivity = this.A00;
            boolean z2 = pollCreatorActivity.A0D;
            PollCreatorViewModel pollCreatorViewModel = pollCreatorActivity.A0A;
            if (z2) {
                pollCreatorViewModel.A09(true);
            } else {
                pollCreatorViewModel.A08(true);
            }
        }
    }

    public boolean A06(C005602k r3, C005602k r4, RecyclerView recyclerView) {
        return !(r4 instanceof AnonymousClass33q) || !(r4 instanceof C77733wS);
    }

    public boolean A07(C005602k r8, C005602k r9, RecyclerView recyclerView) {
        int A002 = r8.A00() - 2;
        int A003 = r9.A00() - 2;
        PollCreatorActivity pollCreatorActivity = this.A00;
        PollCreatorViewModel pollCreatorViewModel = pollCreatorActivity.A0A;
        if (A002 == A003 || A002 < 0) {
            return false;
        }
        List list = pollCreatorViewModel.A0G;
        if (A002 >= list.size() || A003 < 0 || A003 >= list.size()) {
            return false;
        }
        if (list.size() > 0 && ((C77753wU) list.get(C13700nu.A00(list, 1))).A00.isEmpty() && (A002 == C13700nu.A00(list, 1) || A003 == C13700nu.A00(list, 1))) {
            return false;
        }
        ArrayList A0n = C13680ns.A0n(list);
        Collections.swap(A0n, A002, A003);
        list.clear();
        list.addAll(A0n);
        pollCreatorViewModel.A05();
        pollCreatorActivity.A09.A03 = true;
        pollCreatorActivity.A01.vibrate(3);
        return true;
    }
}
