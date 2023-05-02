package com.obwhatsapp.messaging;

import X.AnonymousClass1yL;
import X.C14710pd;
import X.C16460t6;
import X.C16740tZ;
import X.C17800vf;
import X.C39001rl;
import X.C83734Hv;
import android.os.Bundle;
import com.obwhatsapp.ephemeral.ViewOnceNuxBottomSheet;

public abstract class BaseViewOnceMessageViewerFragment extends Hilt_BaseViewOnceMessageViewerFragment {
    public C16460t6 A00;
    public C14710pd A01;
    public C17800vf A02;
    public C16740tZ A03;

    public void A17(Bundle bundle) {
        super.A17(bundle);
        C16740tZ A002 = C16460t6.A00(this.A00, AnonymousClass1yL.A03(A04(), ""));
        this.A03 = A002;
        ViewOnceNuxBottomSheet.A02(A0G(), (C83734Hv) null, this.A02, (C16740tZ) ((C39001rl) A002));
    }
}
