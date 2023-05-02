package com.whatsapp.util;

import X.AnonymousClass00B;
import X.AnonymousClass00T;
import X.AnonymousClass1GE;
import X.AnonymousClass3AW;
import X.C15830rv;
import X.C15860rz;
import X.C16010sH;
import X.C34331k5;
import X.C43041zF;
import X.C49182Rm;
import android.view.View;
import com.obwhatsapp.permissions.RequestPermissionsBottomSheet;
import com.whatsapp.jid.Jid;

public class ViewOnClickCListenerShape0S1200000_I0 extends C34331k5 {
    public Object A00;
    public Object A01;
    public String A02;
    public final int A03;

    public ViewOnClickCListenerShape0S1200000_I0(Object obj, String str, Object obj2, int i2) {
        this.A03 = i2;
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = str;
    }

    public void A06(View view) {
        if (this.A03 != 0) {
            String str = this.A02;
            if (str != null) {
                ((RequestPermissionsBottomSheet) this.A00).A06.A04(str, "continue");
            }
            RequestPermissionsBottomSheet requestPermissionsBottomSheet = (RequestPermissionsBottomSheet) this.A00;
            requestPermissionsBottomSheet.A1C();
            C15860rz r6 = requestPermissionsBottomSheet.A04;
            String[] strArr = (String[]) this.A01;
            for (String str2 : strArr) {
                r6.A0K().putBoolean(str2, true).apply();
                if (C43041zF.A03(str2, AnonymousClass1GE.A07)) {
                    r6.A1M(true);
                    r6.A1N(true);
                }
            }
            AnonymousClass00T.A0F(requestPermissionsBottomSheet.A0D(), strArr, 0);
            return;
        }
        Jid A08 = ((C16010sH) this.A01).A08(C15830rv.class);
        AnonymousClass00B.A06(A08);
        AnonymousClass3AW r1 = new AnonymousClass3AW(view, (C15830rv) A08, (Integer) null);
        r1.A04 = this.A02;
        r1.A02(((C49182Rm) this.A00).A03.A0C());
    }
}
