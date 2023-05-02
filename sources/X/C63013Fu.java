package X;

import android.util.Pair;
import com.facebook.redex.IDxCListenerShape72S0200000_2_I1;
import com.facebook.redex.RunnableRunnableShape4S0200000_I0_2;
import com.obwhatsapp.R;
import com.obwhatsapp.community.ManageGroupsInCommunityActivity;
import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.3Fu  reason: invalid class name and case insensitive filesystem */
public class C63013Fu implements C109425Sb {
    public final /* synthetic */ ManageGroupsInCommunityActivity A00;
    public final /* synthetic */ C39461sW A01;

    public C63013Fu(ManageGroupsInCommunityActivity manageGroupsInCommunityActivity, C39461sW r2) {
        this.A00 = manageGroupsInCommunityActivity;
        this.A01 = r2;
    }

    public void AQR(int i2) {
        Log.e(C13680ns.A0c(i2, "ManageGroupsInCommunityActivityUnlinkSubgroupsProtocolHelper/error = "));
        ManageGroupsInCommunityActivity manageGroupsInCommunityActivity = this.A00;
        manageGroupsInCommunityActivity.Ac1();
        manageGroupsInCommunityActivity.A2b(new IDxCListenerShape72S0200000_2_I1(this.A01, 1, manageGroupsInCommunityActivity), R.string.str1893, R.string.str1892, R.string.str0a48, R.string.str0394);
    }

    public void AYu() {
        Log.e("ManageGroupsInCommunityActivityUnlinkSubgroupsProtocolHelper/timeout");
        ManageGroupsInCommunityActivity manageGroupsInCommunityActivity = this.A00;
        manageGroupsInCommunityActivity.Ac1();
        manageGroupsInCommunityActivity.A2b(new IDxCListenerShape72S0200000_2_I1(this.A01, 1, manageGroupsInCommunityActivity), R.string.str1893, R.string.str1892, R.string.str0a48, R.string.str0394);
    }

    public void AZN(Set set) {
        ManageGroupsInCommunityActivity manageGroupsInCommunityActivity = this.A00;
        manageGroupsInCommunityActivity.Ac1();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int A0D = AnonymousClass000.A0D(((Pair) it.next()).second);
            if (A0D != -1) {
                int i2 = R.string.str1890;
                if (A0D != 400) {
                    if (A0D != 404) {
                        manageGroupsInCommunityActivity.A2b(new IDxCListenerShape72S0200000_2_I1(this.A01, 1, manageGroupsInCommunityActivity), R.string.str1893, R.string.str1892, R.string.str0a48, R.string.str0394);
                    } else {
                        i2 = R.string.str1891;
                    }
                }
                manageGroupsInCommunityActivity.Afg(i2);
            }
            AnonymousClass2AS r4 = manageGroupsInCommunityActivity.A07;
            r4.A0s.execute(new RunnableRunnableShape4S0200000_I0_2(r4, 11, this.A01));
        }
    }
}
