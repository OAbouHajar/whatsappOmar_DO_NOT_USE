package com.obwhatsapp.mediacomposer.bottombar;

import X.AnonymousClass006;
import X.C004601z;
import X.C14710pd;
import X.C16150sX;
import X.C16620tM;
import X.C52652eD;
import X.C52662eE;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.obwhatsapp.R;
import com.obwhatsapp.WaImageButton;

public class BottomBarView extends RelativeLayout implements AnonymousClass006 {
    public C14710pd A00;
    public C52662eE A01;
    public boolean A02;
    public final WaImageButton A03;
    public final boolean A04;

    public BottomBarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        boolean A0E = this.A00.A0E(C16620tM.A01, 815);
        this.A04 = A0E;
        RelativeLayout.inflate(context, A0E ? R.layout.layout0406 : R.layout.layout03c6, this);
        this.A03 = (WaImageButton) C004601z.A0E(this, R.id.add_button_standalone);
    }

    public BottomBarView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet);
        if (!this.A02) {
            this.A02 = true;
            this.A00 = C16150sX.A0k(C52652eD.A00(generatedComponent()));
        }
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A01;
        if (r0 == null) {
            r0 = C52662eE.A00(this);
            this.A01 = r0;
        }
        return r0.generatedComponent();
    }

    public boolean getIsAudienceSelectorEnabled() {
        return this.A04;
    }

    public void setAddStandaloneButtonClick(View.OnClickListener onClickListener) {
        this.A03.setOnClickListener(onClickListener);
    }

    public void setAddStandaloneButtonVisibility(int i2) {
        this.A03.setVisibility(i2);
    }
}
