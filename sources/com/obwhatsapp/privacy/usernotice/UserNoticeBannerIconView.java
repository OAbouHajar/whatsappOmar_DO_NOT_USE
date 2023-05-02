package com.obwhatsapp.privacy.usernotice;

import X.C16150sX;
import X.C52652eD;
import X.C77773wZ;
import android.content.Context;
import android.util.AttributeSet;
import com.obwhatsapp.R;

public class UserNoticeBannerIconView extends C77773wZ {
    public boolean A00;

    public UserNoticeBannerIconView(Context context) {
        super(context);
        A02();
    }

    public UserNoticeBannerIconView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A02();
    }

    public UserNoticeBannerIconView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        A02();
    }

    public UserNoticeBannerIconView(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet);
        A02();
    }

    public void A02() {
        if (!this.A00) {
            this.A00 = true;
            C16150sX A002 = C52652eD.A00(generatedComponent());
            this.A00 = C16150sX.A0Z(A002);
            this.A01 = C16150sX.A1B(A002);
        }
    }

    public int getTargetIconSize() {
        return getResources().getDimensionPixelSize(R.dimen.dimen07f0);
    }
}
