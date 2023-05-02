package com.obwhatsapp.group;

import X.C108785Pi;
import X.C13690nt;
import X.C14710pd;
import X.C17110uY;
import X.C19980zJ;
import X.C23071Aj;
import X.C48432Nf;
import android.content.Context;
import android.os.Bundle;
import android.text.Spanned;
import android.util.AttributeSet;
import com.facebook.redex.RunnableRunnableShape9S0100000_I0_8;
import com.facebook.redex.ViewOnClickCListenerShape10S0100000_I0_3;
import com.obwhatsapp.R;
import com.whatsapp.voipcalling.CallLinkInfo;

public class GroupSettingMembershipApprovalRowV1 extends GroupSettingsRowView implements C48432Nf {
    public C19980zJ A00;
    public C23071Aj A01;
    public C14710pd A02;
    public C108785Pi A03;
    public C17110uY A04;
    public boolean A05;
    public boolean A06;

    public class MembershipApprovalModeDialogFragment extends Hilt_GroupSettingMembershipApprovalRowV1_MembershipApprovalModeDialogFragment {
        public C108785Pi A00;

        public static MembershipApprovalModeDialogFragment A01(C108785Pi r4, boolean z2) {
            MembershipApprovalModeDialogFragment membershipApprovalModeDialogFragment = new MembershipApprovalModeDialogFragment();
            Bundle A0D = C13690nt.A0D();
            A0D.putBoolean(CallLinkInfo.DEFAULT_CALL_LINK_CALL_ID, !z2);
            membershipApprovalModeDialogFragment.A0T(A0D);
            membershipApprovalModeDialogFragment.A00 = r4;
            return membershipApprovalModeDialogFragment;
        }

        public String A1N() {
            return A02().getString(R.string.str0b08);
        }

        public String A1O() {
            return A02().getString(R.string.str0b07);
        }

        public String A1P() {
            return A02().getString(R.string.str0b05);
        }

        public String A1Q() {
            return A02().getString(R.string.str0afe);
        }

        public void A1R(boolean z2) {
            C108785Pi r1 = this.A00;
            if (r1 != null) {
                r1.ATd(!z2);
            }
        }

        public boolean A1S() {
            return false;
        }
    }

    public GroupSettingMembershipApprovalRowV1(Context context) {
        super(context, (AttributeSet) null);
        A00();
    }

    public GroupSettingMembershipApprovalRowV1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }

    public GroupSettingMembershipApprovalRowV1(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        A00();
    }

    public GroupSettingMembershipApprovalRowV1(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet);
        A00();
    }

    public void A01(Context context, AttributeSet attributeSet) {
        super.A01(context, attributeSet);
        setTitleText(R.string.str0b0a);
        setDescriptionText((Spanned) this.A04.A07(new RunnableRunnableShape9S0100000_I0_8(this, 31), context.getString(R.string.str0b06), "", R.color.color08a6));
        setOnClickListener(new ViewOnClickCListenerShape10S0100000_I0_3((Object) this, 16));
    }

    public void setCallback(C108785Pi r1) {
        this.A03 = r1;
    }

    public void setMembershipRequiresApproval(boolean z2) {
        this.A06 = z2;
        int i2 = R.string.str0b07;
        if (z2) {
            i2 = R.string.str0b08;
        }
        setInfoText(i2);
    }
}
