package X;

import com.obwhatsapp.dmsetting.DisappearingMessagesSettingActivity;

/* renamed from: X.5gL  reason: invalid class name and case insensitive filesystem */
public abstract class C111495gL extends C14530pL {
    public boolean A00 = false;

    public C111495gL() {
        C110105dW.A0t(this, 2);
    }

    public void A1q() {
        if (!this.A00) {
            this.A00 = true;
            DisappearingMessagesSettingActivity disappearingMessagesSettingActivity = (DisappearingMessagesSettingActivity) this;
            C49132Rg r3 = (C49132Rg) C110115dX.A08(this);
            C16150sX r1 = r3.A1s;
            C14550pN.A15(r1, disappearingMessagesSettingActivity);
            C14530pL.A0b(r3, r1, disappearingMessagesSettingActivity, C110105dW.A0F(r1));
            disappearingMessagesSettingActivity.A07 = (C17220uj) r1.A9x.get();
            disappearingMessagesSettingActivity.A06 = r3.A0H();
            disappearingMessagesSettingActivity.A04 = (C18600wx) r1.A78.get();
            disappearingMessagesSettingActivity.A03 = (C15800rs) r1.A5c.get();
            disappearingMessagesSettingActivity.A05 = r3.A0G();
        }
    }
}
