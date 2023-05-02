package com.facebook.redex;

import X.AnonymousClass00B;
import X.AnonymousClass1WA;
import X.AnonymousClass28S;
import X.AnonymousClass2AF;
import X.AnonymousClass2AS;
import X.AnonymousClass2VT;
import X.AnonymousClass3K3;
import X.AnonymousClass3K4;
import X.C15830rv;
import X.C16010sH;
import X.C16050sL;
import X.C30511cT;
import com.obwhatsapp.community.CommunityHomeActivity;
import com.obwhatsapp.group.GroupAdminPickerActivity;
import com.obwhatsapp.group.GroupChatInfoActivity;
import com.obwhatsapp.profile.ViewProfilePhoto;
import com.obwhatsapp.quickcontact.QuickContactActivity;

public class IDxCListenerShape227S0100000_2_I0 implements AnonymousClass28S {
    public Object A00;
    public final int A01;

    public IDxCListenerShape227S0100000_2_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final void ALq(C15830rv r3) {
        AnonymousClass1WA r1;
        int i2;
        switch (this.A01) {
            case 0:
                CommunityHomeActivity communityHomeActivity = (CommunityHomeActivity) this.A00;
                if (communityHomeActivity.A0s.equals(r3)) {
                    communityHomeActivity.invalidateOptionsMenu();
                    return;
                }
                return;
            case 1:
                r1 = ((AnonymousClass2AF) this.A00).A0K;
                i2 = 32;
                break;
            case 2:
                if (r3 != null) {
                    r1 = ((AnonymousClass2AS) this.A00).A0s;
                    i2 = 34;
                    break;
                } else {
                    return;
                }
            case 3:
                C30511cT r12 = (C30511cT) this.A00;
                if (r12.A0h.equals(r3)) {
                    r12.A04();
                    return;
                }
                return;
            case 4:
                AnonymousClass2VT r13 = (AnonymousClass2VT) this.A00;
                AnonymousClass00B.A06(r3);
                if (r3.equals(r13.A01)) {
                    r13.A06();
                    return;
                }
                return;
            case 5:
                GroupAdminPickerActivity groupAdminPickerActivity = (GroupAdminPickerActivity) this.A00;
                C16050sL r0 = groupAdminPickerActivity.A0L;
                AnonymousClass00B.A06(r0);
                if (r0.equals(r3)) {
                    groupAdminPickerActivity.A37();
                    groupAdminPickerActivity.A38(groupAdminPickerActivity.A0N);
                    return;
                }
                return;
            case 6:
                GroupChatInfoActivity groupChatInfoActivity = (GroupChatInfoActivity) this.A00;
                if (groupChatInfoActivity.A1M.equals(r3)) {
                    groupChatInfoActivity.A3Q();
                    return;
                }
                return;
            case 7:
                ViewProfilePhoto viewProfilePhoto = (ViewProfilePhoto) this.A00;
                C16010sH r02 = viewProfilePhoto.A0A;
                if (r02 != null) {
                    C15830rv A07 = r02.A07();
                    AnonymousClass00B.A06(A07);
                    if (A07.equals(r3)) {
                        viewProfilePhoto.A0a();
                        return;
                    }
                    return;
                }
                return;
            default:
                AnonymousClass3K4.A0t((QuickContactActivity) this.A00);
                return;
        }
        AnonymousClass3K3.A1H(r1, this, r3, i2);
    }
}
