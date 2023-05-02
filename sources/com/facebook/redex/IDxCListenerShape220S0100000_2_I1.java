package com.facebook.redex;

import X.AnonymousClass3SI;
import X.C13680ns;
import X.C14550pN;
import X.C606134l;
import X.C84334Kd;
import android.content.SharedPreferences;
import android.widget.CompoundButton;
import com.obwhatsapp.R;
import com.obwhatsapp.RequestPermissionActivity;
import com.obwhatsapp.conversationslist.ArchiveNotificationSettingActivity;
import com.obwhatsapp.registration.ChangeNumberNotifyContacts;

public class IDxCListenerShape220S0100000_2_I1 implements CompoundButton.OnCheckedChangeListener {
    public Object A00;
    public final int A01;

    public IDxCListenerShape220S0100000_2_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
        SharedPreferences.Editor editor;
        String str;
        switch (this.A01) {
            case 0:
                editor = ((C14550pN) this.A00).A09.A0K();
                str = "auto_archive_inactive_chats";
                break;
            case 1:
                ((ArchiveNotificationSettingActivity) this.A00).A00.A03(!z2);
                return;
            case 2:
                C84334Kd r1 = ((AnonymousClass3SI) this.A00).A00;
                if (r1.A00 != z2) {
                    r1.A00 = z2;
                    if (z2) {
                        r1.A01.A09(r1);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                ChangeNumberNotifyContacts changeNumberNotifyContacts = (ChangeNumberNotifyContacts) this.A00;
                if (!z2) {
                    changeNumberNotifyContacts.A01 = 0;
                    changeNumberNotifyContacts.A03.setVisibility(8);
                    changeNumberNotifyContacts.A0F.clear();
                } else if (!changeNumberNotifyContacts.A0C.A00()) {
                    RequestPermissionActivity.A0D(changeNumberNotifyContacts, R.string.str11be, R.string.str11bd);
                    return;
                } else {
                    changeNumberNotifyContacts.A37();
                }
                changeNumberNotifyContacts.A38();
                return;
            case 4:
                editor = ((C14550pN) this.A00).A09.A0K();
                str = "security_notifications";
                break;
            default:
                C606134l r0 = (C606134l) this.A00;
                r0.A00 = z2;
                r0.A06();
                return;
        }
        C13680ns.A0z(editor, str, z2);
    }
}
