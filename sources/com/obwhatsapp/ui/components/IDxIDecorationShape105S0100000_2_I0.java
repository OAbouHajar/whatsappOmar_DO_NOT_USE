package com.obwhatsapp.ui.components;

import X.C57572rO;
import android.graphics.drawable.Drawable;
import com.obwhatsapp.community.CommunityFragment;

public class IDxIDecorationShape105S0100000_2_I0 extends C57572rO {
    public Object A00;
    public final int A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IDxIDecorationShape105S0100000_2_I0(Drawable drawable, CommunityFragment communityFragment, int i2) {
        super(drawable);
        this.A01 = i2;
        this.A00 = communityFragment;
    }

    public boolean A04(int i2, int i3) {
        int i4;
        if (this.A01 == 0) {
            i4 = 8;
            if (i3 == -1) {
                return i2 != 10;
            }
        } else if (i2 != 8) {
            return false;
        } else {
            i4 = 13;
            if (i3 == 4) {
                return true;
            }
        }
        return i3 == i4;
    }
}
