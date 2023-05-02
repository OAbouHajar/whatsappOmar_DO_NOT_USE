package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.obwhatsapp.group.GroupSettingMembershipApprovalRowV1;
import com.obwhatsapp.group.GroupSettingsRowView;

/* renamed from: X.2OS  reason: invalid class name */
public abstract class AnonymousClass2OS extends LinearLayout implements AnonymousClass006 {
    public C52662eE A00;
    public boolean A01;

    public AnonymousClass2OS(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }

    public AnonymousClass2OS(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        A00();
    }

    public void A00() {
        if (this instanceof GroupSettingMembershipApprovalRowV1) {
            GroupSettingMembershipApprovalRowV1 groupSettingMembershipApprovalRowV1 = (GroupSettingMembershipApprovalRowV1) this;
            if (!groupSettingMembershipApprovalRowV1.A05) {
                groupSettingMembershipApprovalRowV1.A05 = true;
                C16150sX r1 = ((C52652eD) ((C52642eC) groupSettingMembershipApprovalRowV1.generatedComponent())).A07;
                groupSettingMembershipApprovalRowV1.A04 = (AnonymousClass01V) r1.AOi.get();
                groupSettingMembershipApprovalRowV1.A02 = (C14710pd) r1.A05.get();
                groupSettingMembershipApprovalRowV1.A04 = (C17110uY) r1.ADT.get();
                groupSettingMembershipApprovalRowV1.A00 = (C19980zJ) r1.A0P.get();
                groupSettingMembershipApprovalRowV1.A01 = (C23071Aj) r1.AQb.get();
            }
        } else if (!this.A01) {
            this.A01 = true;
            ((GroupSettingsRowView) this).A04 = (AnonymousClass01V) ((C52652eD) ((C52642eC) generatedComponent())).A07.AOi.get();
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
