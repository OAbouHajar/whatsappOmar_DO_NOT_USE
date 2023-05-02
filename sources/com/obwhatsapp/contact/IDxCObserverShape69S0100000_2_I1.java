package com.obwhatsapp.contact;

import X.C15830rv;
import X.C16040sK;
import X.C33481ie;
import X.C57512rI;
import com.obwhatsapp.biz.BusinessProfileExtraFieldsActivity;
import com.obwhatsapp.calling.callhistory.group.GroupCallLogActivity;
import com.obwhatsapp.settings.Settings;
import com.whatsapp.jid.UserJid;
import java.util.Collection;

public class IDxCObserverShape69S0100000_2_I1 extends C33481ie {
    public Object A00;
    public final int A01;

    public IDxCObserverShape69S0100000_2_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public void A00(C15830rv r3) {
        switch (this.A01) {
            case 1:
                C57512rI.A00(((GroupCallLogActivity) this.A00).A01, r3);
                return;
            case 2:
                Settings settings = (Settings) this.A00;
                if (settings.A0M != null && settings.A01.A0I(r3)) {
                    C16040sK r0 = settings.A01;
                    r0.A0B();
                    settings.A0M = r0.A01;
                    settings.A36();
                    return;
                }
                return;
            default:
                super.A00(r3);
                return;
        }
    }

    public void A02(UserJid userJid) {
        if (2 - this.A01 != 0) {
            super.A02(userJid);
            return;
        }
        Settings settings = (Settings) this.A00;
        if (settings.A01.A0I(userJid)) {
            settings.A08.A0G(settings.A05.A00());
        }
    }

    public void A03(UserJid userJid) {
        switch (this.A01) {
            case 0:
                if (userJid != null) {
                    BusinessProfileExtraFieldsActivity businessProfileExtraFieldsActivity = (BusinessProfileExtraFieldsActivity) this.A00;
                    if (userJid.equals(businessProfileExtraFieldsActivity.A0D)) {
                        businessProfileExtraFieldsActivity.A35();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                C57512rI.A00(((GroupCallLogActivity) this.A00).A01, userJid);
                return;
            default:
                super.A03(userJid);
                return;
        }
    }

    public void A06(Collection collection) {
        if (this.A01 != 0) {
            super.A06(collection);
        } else {
            ((BusinessProfileExtraFieldsActivity) this.A00).A35();
        }
    }
}
