package X;

import android.os.Bundle;
import com.obwhatsapp.group.GroupSettingsActivity;
import com.obwhatsapp.group.GroupSettingsViewModel;

/* renamed from: X.4lz  reason: invalid class name and case insensitive filesystem */
public class C95104lz implements AnonymousClass07E {
    public final /* synthetic */ GroupSettingsActivity A00;

    public C95104lz(GroupSettingsActivity groupSettingsActivity) {
        this.A00 = groupSettingsActivity;
    }

    public void ARb(String str, Bundle bundle) {
        AnonymousClass027 r1;
        Boolean bool;
        boolean z2 = bundle.getBoolean("is_approve_all_pending_requests");
        GroupSettingsActivity groupSettingsActivity = this.A00;
        if (z2) {
            GroupSettingsViewModel groupSettingsViewModel = groupSettingsActivity.A0C;
            groupSettingsViewModel.A09.A00(groupSettingsActivity.A0F, false);
            r1 = groupSettingsViewModel.A03;
            bool = Boolean.FALSE;
        } else {
            r1 = groupSettingsActivity.A0C.A03;
            bool = Boolean.TRUE;
        }
        r1.A09(bool);
    }
}
