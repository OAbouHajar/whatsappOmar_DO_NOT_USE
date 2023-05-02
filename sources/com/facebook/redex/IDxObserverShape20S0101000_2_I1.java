package com.facebook.redex;

import X.AnonymousClass023;
import X.AnonymousClass1Y3;
import X.AnonymousClass4IS;
import X.C57482rF;
import android.content.DialogInterface;
import android.os.Bundle;
import com.obwhatsapp.picker.searchexpressions.ExpressionCategoryTabFragment;
import com.obwhatsapp.userban.ui.BanAppealActivity;
import com.obwhatsapp.userban.ui.viewmodel.BanAppealViewModel;
import java.util.ArrayList;

public class IDxObserverShape20S0101000_2_I1 implements AnonymousClass023 {
    public int A00;
    public Object A01;
    public final int A02;

    public IDxObserverShape20S0101000_2_I1(Object obj, int i2, int i3) {
        this.A02 = i3;
        this.A01 = obj;
        this.A00 = i2;
    }

    public final void AOH(Object obj) {
        C57482rF r1;
        BanAppealViewModel banAppealViewModel;
        boolean z2;
        if (this.A02 != 0) {
            BanAppealActivity banAppealActivity = (BanAppealActivity) this.A01;
            int i2 = this.A00;
            ((DialogInterface) obj).dismiss();
            if (i2 == -2) {
                banAppealViewModel = banAppealActivity.A00;
                z2 = true;
            } else if (i2 == 3) {
                banAppealViewModel = banAppealActivity.A00;
                z2 = false;
            } else if (i2 == 4) {
                banAppealActivity.startActivity(banAppealActivity.A00.A03.A00(banAppealActivity, (Bundle) null, (AnonymousClass1Y3) null, (Integer) null, "blocked_ban_appeals", (String) null, (ArrayList) null, (ArrayList) null, false));
                return;
            } else {
                return;
            }
            banAppealViewModel.A08(banAppealActivity, z2);
            return;
        }
        ExpressionCategoryTabFragment expressionCategoryTabFragment = (ExpressionCategoryTabFragment) this.A01;
        int i3 = this.A00;
        if (((AnonymousClass4IS) obj).A00 == 0 && (r1 = expressionCategoryTabFragment.A04) != null) {
            r1.A0E(expressionCategoryTabFragment.A1A(i3));
            expressionCategoryTabFragment.A04.A01();
        }
    }
}
