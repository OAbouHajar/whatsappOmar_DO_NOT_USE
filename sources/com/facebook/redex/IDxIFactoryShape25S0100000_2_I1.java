package com.facebook.redex;

import X.AnonymousClass000;
import X.C003401n;
import X.C014206u;
import X.C16000sG;
import X.C16320sq;
import X.C16980tz;
import X.C17240ul;
import X.C23131Ap;
import X.C64403Pa;
import android.app.Application;
import com.obwhatsapp.contact.picker.ContactsAttachmentSelector;
import com.obwhatsapp.group.GroupSettingsActivity;
import com.obwhatsapp.group.GroupSettingsViewModel;

public class IDxIFactoryShape25S0100000_2_I1 extends C014206u {
    public Object A00;
    public final int A01;

    public IDxIFactoryShape25S0100000_2_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public C003401n A6s(Class cls) {
        if (this.A01 != 0) {
            if (cls.isAssignableFrom(GroupSettingsViewModel.class)) {
                GroupSettingsActivity groupSettingsActivity = (GroupSettingsActivity) this.A00;
                C16320sq r6 = groupSettingsActivity.A05;
                C17240ul r4 = groupSettingsActivity.A08;
                return new GroupSettingsViewModel(groupSettingsActivity.A00, groupSettingsActivity.A04, groupSettingsActivity.A05, r4, groupSettingsActivity.A0E, r6);
            }
        } else if (cls.isAssignableFrom(C64403Pa.class)) {
            ContactsAttachmentSelector contactsAttachmentSelector = (ContactsAttachmentSelector) this.A00;
            Application application = contactsAttachmentSelector.getApplication();
            C16980tz r42 = contactsAttachmentSelector.A03;
            C16000sG r3 = contactsAttachmentSelector.A0J;
            C23131Ap r62 = contactsAttachmentSelector.A04;
            return new C64403Pa(application, contactsAttachmentSelector.A00, r3, r42, contactsAttachmentSelector.A0S, r62);
        }
        throw AnonymousClass000.A0T("Invalid viewModel");
    }
}
