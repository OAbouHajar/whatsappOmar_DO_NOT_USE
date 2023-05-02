package X;

import com.obwhatsapp.group.GroupSettingsActivity;
import com.obwhatsapp.group.GroupSettingsViewModel;
import com.whatsapp.util.Log;

/* renamed from: X.4yv  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C102424yv implements C108785Pi {
    public final /* synthetic */ GroupSettingsActivity A00;

    public /* synthetic */ C102424yv(GroupSettingsActivity groupSettingsActivity) {
        this.A00 = groupSettingsActivity;
    }

    public final void ATd(boolean z2) {
        AnonymousClass028 r1;
        GroupSettingsActivity groupSettingsActivity = this.A00;
        GroupSettingsViewModel groupSettingsViewModel = groupSettingsActivity.A0C;
        C16050sL r2 = groupSettingsActivity.A0F;
        Log.i(AnonymousClass000.A0h(z2 ? "On" : "Off", AnonymousClass000.A0r("GroupSettingsActivity require membership approval toggled ")));
        if (z2) {
            groupSettingsViewModel.A09.A00(r2, true);
            r1 = groupSettingsViewModel.A03;
        } else {
            r1 = groupSettingsViewModel.A0A;
        }
        r1.A09(Boolean.TRUE);
    }
}
