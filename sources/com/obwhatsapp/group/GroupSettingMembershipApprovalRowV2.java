package com.obwhatsapp.group;

import X.C108785Pi;
import X.C14710pd;
import X.C17110uY;
import X.C19980zJ;
import X.C23071Aj;
import X.C48432Nf;
import android.content.Context;
import android.text.Spanned;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import androidx.appcompat.widget.SwitchCompat;
import com.facebook.redex.IDxCListenerShape219S0100000_2_I0;
import com.facebook.redex.RunnableRunnableShape9S0100000_I0_8;
import com.obwhatsapp.ListItemWithLeftIcon;
import com.obwhatsapp.R;

public class GroupSettingMembershipApprovalRowV2 extends ListItemWithLeftIcon implements C48432Nf {
    public SwitchCompat A00;
    public C19980zJ A01;
    public C23071Aj A02;
    public C14710pd A03;
    public C108785Pi A04;
    public C17110uY A05;
    public boolean A06;
    public final CompoundButton.OnCheckedChangeListener A07;

    public GroupSettingMembershipApprovalRowV2(Context context) {
        super(context);
        A00();
        this.A07 = new IDxCListenerShape219S0100000_2_I0(this, 3);
    }

    public GroupSettingMembershipApprovalRowV2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
        this.A07 = new IDxCListenerShape219S0100000_2_I0(this, 3);
    }

    public GroupSettingMembershipApprovalRowV2(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        A00();
        this.A07 = new IDxCListenerShape219S0100000_2_I0(this, 3);
    }

    public GroupSettingMembershipApprovalRowV2(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet);
        A00();
    }

    public void A01(AttributeSet attributeSet) {
        super.A01(attributeSet);
        setDescription((Spanned) this.A05.A07(new RunnableRunnableShape9S0100000_I0_8(this, 32), getContext().getString(R.string.str0b06), "", R.color.color08a6));
        SwitchCompat switchCompat = new SwitchCompat(getContext());
        this.A00 = switchCompat;
        switchCompat.setId(R.id.group_require_membership_approval_switch);
        this.A00.setOnCheckedChangeListener(this.A07);
        A02(this.A00);
    }

    public void setCallback(C108785Pi r1) {
        this.A04 = r1;
    }

    public void setMembershipRequiresApproval(boolean z2) {
        this.A00.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        this.A00.setChecked(z2);
        this.A00.setOnCheckedChangeListener(this.A07);
    }
}
