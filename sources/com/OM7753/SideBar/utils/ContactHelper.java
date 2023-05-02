package com.OM7753.SideBar.utils;

import X.C15810rt;
import X.C15830rv;
import X.C16000sG;
import X.C16010sH;
import X.C24561Gk;
import com.obwhatsapp.yo.yo;

public class ContactHelper {
    private C16010sH mContactInfoActivity;
    private C15830rv mJabberId;

    public ContactHelper(C15830rv r2) {
        this.mJabberId = r2;
        this.mContactInfoActivity = C16000sG.A21().A0A(r2);
    }

    public String getBestName() {
        return this.mContactInfoActivity.A0L != null ? this.mContactInfoActivity.A0L : getPhoneNumber();
    }

    public C16010sH getContactInfo() {
        return this.mContactInfoActivity;
    }

    public String getFullName() {
        return this.mContactInfoActivity.A0L;
    }

    public C15830rv getIdJabber() {
        return this.mJabberId;
    }

    public String getJabberId() {
        C15830rv r0 = this.mJabberId;
        return r0 == null ? "" : r0.getRawString();
    }

    public String getPhoneNumber() {
        return C24561Gk.A03(this.mJabberId);
    }

    public int getUnreadCount() {
        return ((C15810rt) yo.A00(0)).A00(this.mJabberId);
    }
}
