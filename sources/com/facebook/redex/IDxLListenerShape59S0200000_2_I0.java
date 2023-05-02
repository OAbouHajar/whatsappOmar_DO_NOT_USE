package com.facebook.redex;

import X.AnonymousClass000;
import X.AnonymousClass3K2;
import X.AnonymousClass3K3;
import X.C018508q;
import android.content.Context;
import android.view.View;
import android.view.ViewTreeObserver;
import com.obwhatsapp.R;
import com.obwhatsapp.privacy.usernotice.UserNoticeBottomSheetDialogFragment;
import com.obwhatsapp.registration.RegisterPhone;
import com.whatsapp.util.Log;

public class IDxLListenerShape59S0200000_2_I0 implements ViewTreeObserver.OnGlobalLayoutListener {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxLListenerShape59S0200000_2_I0(Object obj, int i2, Object obj2) {
        this.A02 = i2;
        this.A01 = obj2;
        this.A00 = obj;
    }

    public void onGlobalLayout() {
        switch (this.A02) {
            case 0:
                AnonymousClass3K2.A0z((View) this.A01, this);
                UserNoticeBottomSheetDialogFragment userNoticeBottomSheetDialogFragment = (UserNoticeBottomSheetDialogFragment) this.A00;
                userNoticeBottomSheetDialogFragment.A07.setVisibility(4);
                userNoticeBottomSheetDialogFragment.A06.setVisibility(8);
                userNoticeBottomSheetDialogFragment.A1N();
                return;
            case 1:
                RegisterPhone registerPhone = (RegisterPhone) this.A00;
                View view = (View) this.A01;
                int height = registerPhone.A06.getRootView().getHeight() - registerPhone.A06.getHeight();
                if (height > registerPhone.getResources().getDimensionPixelSize(R.dimen.dimen069a)) {
                    registerPhone.A06.smoothScrollTo(0, view.getTop());
                    StringBuilder A0r = AnonymousClass000.A0r("register/name/layout heightDiff:");
                    A0r.append(height);
                    Log.i(AnonymousClass000.A0h("scroll view", A0r));
                    return;
                }
                return;
            case 2:
                AnonymousClass3K3.A16((View) this.A01, this);
                ((Runnable) this.A00).run();
                return;
            default:
                View view2 = (View) this.A01;
                AnonymousClass3K2.A0z(view2, this);
                view2.animate().translationY(-((Context) this.A00).getResources().getDimension(R.dimen.dimen056a)).setDuration(250).setInterpolator(new C018508q()).start();
                return;
        }
    }
}
