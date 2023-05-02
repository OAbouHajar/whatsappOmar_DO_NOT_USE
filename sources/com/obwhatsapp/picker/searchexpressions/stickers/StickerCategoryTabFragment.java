package com.obwhatsapp.picker.searchexpressions.stickers;

import X.C13690nt;
import android.os.Bundle;
import com.obwhatsapp.picker.searchexpressions.ExpressionCategoryTabFragment;
import java.util.List;

public class StickerCategoryTabFragment extends ExpressionCategoryTabFragment {
    public static StickerCategoryTabFragment A01(int i2) {
        Bundle A0D = C13690nt.A0D();
        A0D.putInt("category_tab", i2);
        StickerCategoryTabFragment stickerCategoryTabFragment = new StickerCategoryTabFragment();
        stickerCategoryTabFragment.A0T(A0D);
        return stickerCategoryTabFragment;
    }

    public List A1A(int i2) {
        return this.A03.A08(i2);
    }
}
