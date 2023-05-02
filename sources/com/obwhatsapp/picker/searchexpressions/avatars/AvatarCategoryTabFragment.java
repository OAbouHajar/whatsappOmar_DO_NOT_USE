package com.obwhatsapp.picker.searchexpressions.avatars;

import X.C13690nt;
import android.os.Bundle;
import com.obwhatsapp.picker.searchexpressions.ExpressionCategoryTabFragment;
import java.util.List;

public class AvatarCategoryTabFragment extends ExpressionCategoryTabFragment {
    public static AvatarCategoryTabFragment A01(int i2) {
        Bundle A0D = C13690nt.A0D();
        A0D.putInt("category_tab", i2);
        AvatarCategoryTabFragment avatarCategoryTabFragment = new AvatarCategoryTabFragment();
        avatarCategoryTabFragment.A0T(A0D);
        return avatarCategoryTabFragment;
    }

    public List A1A(int i2) {
        return this.A03.A07(i2);
    }
}
