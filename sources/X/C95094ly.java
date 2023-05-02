package X;

import android.os.Bundle;
import com.obwhatsapp.group.GroupSettingsActivity;
import com.obwhatsapp.group.GroupSettingsViewModel;

/* renamed from: X.4ly  reason: invalid class name and case insensitive filesystem */
public class C95094ly implements AnonymousClass07E {
    public final /* synthetic */ GroupSettingsActivity A00;

    public C95094ly(GroupSettingsActivity groupSettingsActivity) {
        this.A00 = groupSettingsActivity;
    }

    public void ARb(String str, Bundle bundle) {
        AnonymousClass027 r1;
        Boolean bool;
        int i2;
        boolean z2 = bundle.getBoolean("is_approve_all_pending_requests");
        GroupSettingsActivity groupSettingsActivity = this.A00;
        if (z2) {
            GroupSettingsViewModel groupSettingsViewModel = groupSettingsActivity.A0C;
            C16050sL r4 = groupSettingsActivity.A0F;
            int i3 = groupSettingsViewModel.A00;
            if (i3 <= 0 || i3 <= (i2 = groupSettingsViewModel.A01)) {
                groupSettingsViewModel.A09.A00(r4, false);
                r1 = groupSettingsViewModel.A03;
                bool = Boolean.FALSE;
            } else {
                groupSettingsViewModel.A0B.A09(new C83774Hz(i2, i3));
                return;
            }
        } else {
            r1 = groupSettingsActivity.A0C.A03;
            bool = Boolean.TRUE;
        }
        r1.A09(bool);
    }
}
