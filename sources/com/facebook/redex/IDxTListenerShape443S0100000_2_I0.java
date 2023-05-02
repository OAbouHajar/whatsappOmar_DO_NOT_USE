package com.facebook.redex;

import X.C108735Pd;
import X.C54662hw;
import android.graphics.PointF;
import com.obwhatsapp.mediacomposer.MediaComposerActivity;
import com.obwhatsapp.mediacomposer.MediaComposerFragment;
import com.obwhatsapp.mediacomposer.doodle.DoodleView;
import com.obwhatsapp.mediaview.MediaViewBaseFragment;

public class IDxTListenerShape443S0100000_2_I0 implements C108735Pd {
    public Object A00;
    public final int A01;

    public IDxTListenerShape443S0100000_2_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final int AYy(float f2, float f3) {
        MediaComposerFragment A37;
        boolean A1J;
        if (this.A01 != 0) {
            MediaViewBaseFragment mediaViewBaseFragment = ((C54662hw) this.A00).A00;
            if (!mediaViewBaseFragment.A0D().isFinishing()) {
                A1J = MediaViewBaseFragment.A09(mediaViewBaseFragment);
            }
        }
        MediaComposerActivity mediaComposerActivity = (MediaComposerActivity) this.A00;
        if (!mediaComposerActivity.isFinishing() && (A37 = mediaComposerActivity.A37()) != null) {
            PointF pointF = mediaComposerActivity.A1O;
            pointF.x = f2;
            pointF.y = f3;
            DoodleView doodleView = A37.A0D.A0H;
            int[] iArr = A37.A0O;
            doodleView.getLocationOnScreen(iArr);
            float f4 = pointF.x - ((float) iArr[0]);
            pointF.x = f4;
            float f5 = pointF.y - ((float) iArr[1]);
            pointF.y = f5;
            A1J = A37.A1J(f4, f5);
        }
        return !A1J ? 0 : 3;
    }
}
