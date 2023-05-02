package com.facebook.redex;

import X.AnonymousClass01A;
import X.AnonymousClass030;
import X.AnonymousClass3K3;
import X.C016507v;
import X.C55322jK;
import android.graphics.Rect;
import android.view.View;
import com.obwhatsapp.HomeActivity;
import com.obwhatsapp.R;
import com.obwhatsapp.camera.CameraActivity;
import com.obwhatsapp.mediaview.MediaViewBaseFragment;
import com.obwhatsapp.status.playback.StatusPlaybackActivity;
import com.obwhatsapp.status.playback.fragment.StatusPlaybackFragment;

public class IDxIListenerShape217S0100000_2_I0 implements C016507v {
    public Object A00;
    public final int A01;

    public IDxIListenerShape217S0100000_2_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public AnonymousClass030 AMY(View view, AnonymousClass030 r6) {
        switch (this.A01) {
            case 0:
                view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), r6.A03());
                return r6;
            case 1:
                HomeActivity homeActivity = (HomeActivity) this.A00;
                Rect rect = homeActivity.A1w;
                AnonymousClass3K3.A10(rect, r6);
                homeActivity.findViewById(R.id.navigation_bar_protection).setPadding(0, 0, 0, rect.bottom);
                return r6;
            case 2:
                AnonymousClass3K3.A10(((CameraActivity) this.A00).A0E, r6);
                return r6;
            case 3:
                ((MediaViewBaseFragment) this.A00).A1M(r6);
                return r6;
            case 4:
                StatusPlaybackActivity statusPlaybackActivity = (StatusPlaybackActivity) this.A00;
                Rect rect2 = statusPlaybackActivity.A0N;
                AnonymousClass3K3.A10(rect2, r6);
                for (AnonymousClass01A r1 : statusPlaybackActivity.A2E()) {
                    if (r1 instanceof StatusPlaybackFragment) {
                        ((StatusPlaybackFragment) r1).A1E(rect2);
                    }
                }
                return r6;
            default:
                return C55322jK.A02(view, r6, (C55322jK) this.A00);
        }
    }
}
