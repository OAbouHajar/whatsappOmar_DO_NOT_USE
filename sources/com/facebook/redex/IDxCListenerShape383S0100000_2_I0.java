package com.facebook.redex;

import X.C000900k;
import X.C12410kM;
import android.view.View;
import androidx.core.widget.NestedScrollView;
import com.obwhatsapp.R;
import com.obwhatsapp.privacy.usernotice.UserNoticeBottomSheetDialogFragment;

public class IDxCListenerShape383S0100000_2_I0 implements C12410kM {
    public Object A00;
    public final int A01;

    public IDxCListenerShape383S0100000_2_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final void AWl(NestedScrollView nestedScrollView, int i2, int i3, int i4, int i5) {
        if (this.A01 != 0) {
            View findViewById = ((C000900k) this.A00).findViewById(R.id.fade_view);
            int i6 = 8;
            if (i3 > 0) {
                i6 = 0;
            }
            findViewById.setVisibility(i6);
            return;
        }
        UserNoticeBottomSheetDialogFragment userNoticeBottomSheetDialogFragment = (UserNoticeBottomSheetDialogFragment) this.A00;
        userNoticeBottomSheetDialogFragment.A1P(false, false);
        userNoticeBottomSheetDialogFragment.A1N();
        Runnable runnable = userNoticeBottomSheetDialogFragment.A0G;
        if (runnable != null) {
            userNoticeBottomSheetDialogFragment.A09.A0J(runnable);
        }
        if ((userNoticeBottomSheetDialogFragment.A02.getY() - ((float) userNoticeBottomSheetDialogFragment.A08.getHeight())) - ((float) userNoticeBottomSheetDialogFragment.A08.getScrollY()) >= 0.0f) {
            RunnableRunnableShape12S0100000_I0_11 runnableRunnableShape12S0100000_I0_11 = new RunnableRunnableShape12S0100000_I0_11((Object) userNoticeBottomSheetDialogFragment, 19);
            userNoticeBottomSheetDialogFragment.A0G = runnableRunnableShape12S0100000_I0_11;
            userNoticeBottomSheetDialogFragment.A09.A0L(runnableRunnableShape12S0100000_I0_11, 600);
        }
    }
}
