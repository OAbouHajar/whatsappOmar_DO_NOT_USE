package com.obwhatsapp.privacy.usernotice;

import X.C16150sX;
import X.C52652eD;
import X.C77773wZ;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.obwhatsapp.R;

public class UserNoticeModalIconView extends C77773wZ {
    public ImageView A00;
    public boolean A01;

    public UserNoticeModalIconView(Context context) {
        super(context);
        A02();
    }

    public UserNoticeModalIconView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A02();
    }

    public UserNoticeModalIconView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        A02();
    }

    public UserNoticeModalIconView(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet);
        A02();
    }

    public void A02() {
        if (!this.A01) {
            this.A01 = true;
            C16150sX A002 = C52652eD.A00(generatedComponent());
            this.A00 = C16150sX.A0Z(A002);
            this.A01 = C16150sX.A1B(A002);
        }
    }

    public int getTargetIconSize() {
        return getResources().getDimensionPixelSize(R.dimen.dimen07fe);
    }

    public void setDefaultIconView(ImageView imageView) {
        this.A00 = imageView;
    }
}
