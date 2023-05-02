package com.facebook.redex;

import X.AnonymousClass2Sv;
import X.AnonymousClass342;
import X.AnonymousClass3K4;
import X.C13680ns;
import android.app.Activity;
import android.content.Intent;
import com.obwhatsapp.backup.google.NotEnoughStorageDialogFragment;
import com.obwhatsapp.community.AddGroupsToCommunityActivity;
import com.obwhatsapp.community.deactivate.DeactivateCommunityDisclaimerActivity;
import com.obwhatsapp.group.GroupChatInfoActivity;

public class IDxCListenerShape238S0100000_2_I1 implements AnonymousClass2Sv {
    public Object A00;
    public final int A01;

    public IDxCListenerShape238S0100000_2_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final void AOW() {
        AnonymousClass342 r1;
        boolean z2;
        switch (this.A01) {
            case 0:
                NotEnoughStorageDialogFragment.A01((NotEnoughStorageDialogFragment) this.A00);
                return;
            case 1:
                Activity activity = (Activity) this.A00;
                activity.setResult(0);
                Intent A09 = C13680ns.A09();
                A09.putExtra("get_collection_error_code", 404);
                activity.setIntent(A09);
                activity.finish();
                return;
            case 2:
                ((AddGroupsToCommunityActivity) this.A00).A36();
                return;
            case 3:
                ((DeactivateCommunityDisclaimerActivity) this.A00).A35();
                return;
            case 4:
                ((GroupChatInfoActivity) this.A00).A3N();
                return;
            case 5:
                AnonymousClass3K4.A0y(this.A00);
                return;
            case 6:
                r1 = (AnonymousClass342) this.A00;
                z2 = true;
                break;
            default:
                r1 = (AnonymousClass342) this.A00;
                z2 = false;
                break;
        }
        r1.A37(z2);
    }
}
