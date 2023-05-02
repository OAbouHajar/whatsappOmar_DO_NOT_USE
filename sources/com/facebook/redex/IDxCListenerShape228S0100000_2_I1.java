package com.facebook.redex;

import X.AnonymousClass28S;
import X.AnonymousClass3K4;
import X.C15830rv;
import X.C56862ok;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import com.obwhatsapp.contact.picker.AddGroupParticipantsSelector;
import com.obwhatsapp.group.GroupSettingsActivity;
import com.obwhatsapp.group.GroupSettingsViewModel;

public class IDxCListenerShape228S0100000_2_I1 implements AnonymousClass28S {
    public Object A00;
    public final int A01;

    public IDxCListenerShape228S0100000_2_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final void ALq(C15830rv r5) {
        switch (this.A01) {
            case 0:
                AddGroupParticipantsSelector addGroupParticipantsSelector = (AddGroupParticipantsSelector) this.A00;
                if (addGroupParticipantsSelector.A06.equals(r5) && addGroupParticipantsSelector.A0C.A0C(1863)) {
                    addGroupParticipantsSelector.A3g((TextEmojiLabel) addGroupParticipantsSelector.findViewById(R.id.disclaimer_warning_text), addGroupParticipantsSelector.A06);
                    return;
                }
                return;
            case 1:
                GroupSettingsActivity groupSettingsActivity = (GroupSettingsActivity) this.A00;
                if (groupSettingsActivity.A0F.equals(r5)) {
                    GroupSettingsViewModel groupSettingsViewModel = groupSettingsActivity.A0C;
                    AnonymousClass3K4.A0u(groupSettingsViewModel.A0C, groupSettingsViewModel, groupSettingsActivity.A0F, 23);
                    return;
                }
                return;
            default:
                C56862ok r1 = (C56862ok) this.A00;
                if (r5 != null && r5.equals(r1.A05)) {
                    r1.A00();
                    return;
                }
                return;
        }
    }
}
