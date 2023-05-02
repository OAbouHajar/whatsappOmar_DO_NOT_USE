package com.obwhatsapp.contact;

import X.C112825ja;
import X.C14870pt;
import X.C15830rv;
import X.C33481ie;
import com.obwhatsapp.R;
import com.obwhatsapp.ephemeral.ChangeEphemeralSettingActivity;
import com.obwhatsapp.payments.ui.PaymentGroupParticipantPickerActivity;
import com.whatsapp.jid.UserJid;
import java.util.Collection;

public class IDxCObserverShape70S0100000_3_I1 extends C33481ie {
    public Object A00;
    public final int A01;

    public IDxCObserverShape70S0100000_3_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public void A00(C15830rv r3) {
        if (1 - this.A01 != 0) {
            super.A00(r3);
        } else if (r3 != null) {
            C112825ja r1 = (C112825ja) this.A00;
            if (r3.equals(r1.A0C)) {
                r1.A3q();
            }
        }
    }

    public void A01(C15830rv r3) {
        if (1 - this.A01 != 0) {
            super.A01(r3);
        } else if (r3 != null) {
            C112825ja r1 = (C112825ja) this.A00;
            if (r3.equals(r1.A0C)) {
                r1.A3q();
            }
        }
    }

    public void A03(UserJid userJid) {
        if (1 - this.A01 != 0) {
            super.A03(userJid);
        } else if (userJid != null) {
            C112825ja r1 = (C112825ja) this.A00;
            if (userJid.equals(r1.A0C)) {
                r1.A3q();
            }
        }
    }

    public void A04(Collection collection) {
        switch (this.A01) {
            case 0:
                ChangeEphemeralSettingActivity changeEphemeralSettingActivity = (ChangeEphemeralSettingActivity) this.A00;
                C15830rv r2 = changeEphemeralSettingActivity.A0H;
                if ((r2 instanceof UserJid) && changeEphemeralSettingActivity.A04.A0V(UserJid.of(r2)) && !changeEphemeralSettingActivity.isFinishing()) {
                    C14870pt r22 = changeEphemeralSettingActivity.A05;
                    int i2 = changeEphemeralSettingActivity.A02;
                    int i3 = R.string.str0831;
                    if (i2 == 0) {
                        i3 = R.string.str0830;
                    }
                    r22.A09(i3, 1);
                    changeEphemeralSettingActivity.finish();
                    return;
                }
                return;
            case 2:
                ((PaymentGroupParticipantPickerActivity) this.A00).A0F.notifyDataSetChanged();
                return;
            default:
                super.A04(collection);
                return;
        }
    }
}
