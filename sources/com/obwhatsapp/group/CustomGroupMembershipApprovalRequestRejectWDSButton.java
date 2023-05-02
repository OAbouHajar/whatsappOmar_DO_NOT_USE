package com.obwhatsapp.group;

import X.AnonymousClass00T;
import X.C18450wi;
import X.C54392hN;
import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import com.obwhatsapp.R;
import com.obwhatsapp.wds.components.button.WDSButton;

public final class CustomGroupMembershipApprovalRequestRejectWDSButton extends WDSButton {
    public boolean A00;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CustomGroupMembershipApprovalRequestRejectWDSButton(Context context) {
        this(context, (AttributeSet) null, false);
        C18450wi.A0H(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CustomGroupMembershipApprovalRequestRejectWDSButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, false);
        C18450wi.A0H(context, 1);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CustomGroupMembershipApprovalRequestRejectWDSButton(Context context, AttributeSet attributeSet, boolean z2) {
        super(context, attributeSet, z2);
        C18450wi.A0H(context, 1);
        this.A00 = z2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CustomGroupMembershipApprovalRequestRejectWDSButton(Context context, AttributeSet attributeSet, boolean z2, int i2, C54392hN r6) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? false : z2);
    }

    public final boolean getOverrideButtonMigration2() {
        return this.A00;
    }

    public final void setOverrideButtonMigration2(boolean z2) {
        this.A00 = z2;
    }

    public void setupBackgroundStyle(ColorStateList colorStateList) {
        C18450wi.A0H(colorStateList, 0);
        ColorStateList A03 = AnonymousClass00T.A03(getContext(), R.color.color04ab);
        if (A03 != null) {
            colorStateList = A03;
        }
        super.setupBackgroundStyle(colorStateList);
    }

    public void setupContentStyle(ColorStateList colorStateList) {
        C18450wi.A0H(colorStateList, 0);
        ColorStateList A03 = AnonymousClass00T.A03(getContext(), R.color.color04ac);
        if (A03 != null) {
            colorStateList = A03;
        }
        super.setupContentStyle(colorStateList);
    }
}
