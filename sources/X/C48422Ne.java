package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.obwhatsapp.group.GroupSettingMembershipApprovalRowV2;

/* renamed from: X.2Ne  reason: invalid class name and case insensitive filesystem */
public abstract class C48422Ne extends LinearLayout implements AnonymousClass006 {
    public C52662eE A00;
    public boolean A01;

    public C48422Ne(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        A00();
    }

    public void A00() {
        if (this instanceof GroupSettingMembershipApprovalRowV2) {
            GroupSettingMembershipApprovalRowV2 groupSettingMembershipApprovalRowV2 = (GroupSettingMembershipApprovalRowV2) this;
            if (!groupSettingMembershipApprovalRowV2.A06) {
                groupSettingMembershipApprovalRowV2.A06 = true;
                C16150sX r1 = ((C52652eD) ((C52642eC) groupSettingMembershipApprovalRowV2.generatedComponent())).A07;
                groupSettingMembershipApprovalRowV2.A04 = (AnonymousClass013) r1.AR8.get();
                groupSettingMembershipApprovalRowV2.A03 = (AnonymousClass01V) r1.AOi.get();
                groupSettingMembershipApprovalRowV2.A03 = (C14710pd) r1.A05.get();
                groupSettingMembershipApprovalRowV2.A05 = (C17110uY) r1.ADT.get();
                groupSettingMembershipApprovalRowV2.A01 = (C19980zJ) r1.A0P.get();
                groupSettingMembershipApprovalRowV2.A02 = (C23071Aj) r1.AQb.get();
            }
        } else if (!this.A01) {
            this.A01 = true;
            C48412Nd r2 = (C48412Nd) this;
            C16150sX r12 = ((C52652eD) ((C52642eC) generatedComponent())).A07;
            r2.A04 = (AnonymousClass013) r12.AR8.get();
            r2.A03 = (AnonymousClass01V) r12.AOi.get();
        }
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A00;
        if (r0 == null) {
            r0 = new C52662eE(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }
}
