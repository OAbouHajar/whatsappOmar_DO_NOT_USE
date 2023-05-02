package com.facebook.redex;

import X.AnonymousClass2HV;
import X.AnonymousClass2WI;
import X.AnonymousClass2WP;
import X.AnonymousClass2WT;
import X.C14870pt;
import X.C17330uu;
import X.C18450wi;
import X.C34421kE;
import com.obwhatsapp.avatar.home.AvatarHomeViewModel;
import com.whatsapp.util.Log;

public class IDxUCallbackShape360S0100000_2_I0 implements AnonymousClass2HV {
    public Object A00;
    public final int A01;

    public IDxUCallbackShape360S0100000_2_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public void AQu(Exception exc) {
        switch (this.A01) {
            case 0:
                Log.i("onConfirmDeleteAvatarClicked/error");
                ((AvatarHomeViewModel) this.A00).A00.A0B(new AnonymousClass2WP(AnonymousClass2WT.A00, false, true, false));
                return;
            case 1:
                C18450wi.A0H(exc, 0);
                Log.e("AvatarBackup/restore failed", exc);
                ((C34421kE) this.A00).A01(exc);
                return;
            default:
                C18450wi.A0H(exc, 0);
                Log.e("AvatarUserManagementHelper/generateTokenAfterMigration failed", exc);
                return;
        }
    }

    public void onSuccess() {
        switch (this.A01) {
            case 0:
                Log.i("onConfirmDeleteAvatarClicked/success");
                ((AvatarHomeViewModel) this.A00).A00.A0B(new AnonymousClass2WI(true));
                return;
            case 1:
                ((C34421kE) this.A00).A02(Boolean.TRUE);
                return;
            default:
                C17330uu r2 = (C17330uu) this.A00;
                C14870pt.A01(r2.A00, r2, 15);
                return;
        }
    }
}
