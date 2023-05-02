package com.facebook.redex;

import X.AnonymousClass1L6;
import X.AnonymousClass1Y3;
import X.AnonymousClass2AW;
import X.C13690nt;
import X.C39701sv;
import X.C64263Nl;
import X.C93514jK;
import android.app.Activity;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.os.Bundle;
import com.obwhatsapp.contact.picker.PhoneNumberSelectionDialog;
import com.obwhatsapp.groupsuspend.CreateGroupSuspendDialog;
import com.obwhatsapp.viewsharedcontacts.ViewSharedContactArrayActivity;
import com.whatsapp.jid.Jid;
import java.util.AbstractList;
import java.util.ArrayList;

public class IDxCListenerShape22S0300000_2_I1 implements DialogInterface.OnClickListener {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public IDxCListenerShape22S0300000_2_I1(Object obj, Object obj2, Object obj3, int i2) {
        this.A03 = i2;
        this.A00 = obj2;
        this.A01 = obj3;
        this.A02 = obj;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        switch (this.A03) {
            case 0:
                PhoneNumberSelectionDialog phoneNumberSelectionDialog = (PhoneNumberSelectionDialog) this.A00;
                AbstractList abstractList = (AbstractList) this.A01;
                C64263Nl r0 = (C64263Nl) this.A02;
                AnonymousClass2AW r1 = phoneNumberSelectionDialog.A00;
                if (r1 != null) {
                    r1.AU5(((C93514jK) abstractList.get(r0.A00)).A00);
                }
                phoneNumberSelectionDialog.A1C();
                return;
            case 1:
                CreateGroupSuspendDialog createGroupSuspendDialog = (CreateGroupSuspendDialog) this.A00;
                Activity activity = (Activity) this.A02;
                Bundle A0D = C13690nt.A0D();
                A0D.putParcelable("com.obwhatsapp.support.DescribeProblemActivity.suspendedEntityJid", (Jid) this.A01);
                activity.startActivity(createGroupSuspendDialog.A00.A00(activity, A0D, (AnonymousClass1Y3) null, (Integer) null, "group-suspend-appeal", (String) null, (ArrayList) null, (ArrayList) null, createGroupSuspendDialog.A02.A00()));
                return;
            case 2:
                ViewSharedContactArrayActivity viewSharedContactArrayActivity = (ViewSharedContactArrayActivity) this.A00;
                if (viewSharedContactArrayActivity.A00.A09(viewSharedContactArrayActivity, AnonymousClass1L6.A00(viewSharedContactArrayActivity, (Bitmap) this.A02, (C39701sv) this.A01, true), 1)) {
                    viewSharedContactArrayActivity.A0F.A02(true, 10);
                    return;
                }
                return;
            default:
                ViewSharedContactArrayActivity viewSharedContactArrayActivity2 = (ViewSharedContactArrayActivity) this.A00;
                if (viewSharedContactArrayActivity2.A00.A09(viewSharedContactArrayActivity2, AnonymousClass1L6.A00(viewSharedContactArrayActivity2, (Bitmap) this.A02, (C39701sv) this.A01, false), 1)) {
                    viewSharedContactArrayActivity2.A0F.A02(false, 10);
                    return;
                }
                return;
        }
    }
}
