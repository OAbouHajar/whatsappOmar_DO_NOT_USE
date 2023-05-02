package com.facebook.redex;

import X.AnonymousClass00B;
import X.AnonymousClass1ZK;
import X.AnonymousClass1yR;
import X.AnonymousClass1yV;
import X.AnonymousClass29F;
import X.AnonymousClass2A5;
import X.AnonymousClass2JH;
import X.AnonymousClass2P5;
import X.AnonymousClass2Sy;
import X.AnonymousClass3K2;
import X.AnonymousClass5RN;
import X.C108705Pa;
import X.C15910s6;
import X.C16740tZ;
import X.C42821yj;
import android.support.v4.view.accessibility.AccessibilityEventCompat;
import com.obwhatsapp.biz.cart.view.fragment.CartFragment;
import com.obwhatsapp.contact.picker.SharedTextPreviewDialogFragment;
import com.obwhatsapp.group.NewGroup;
import com.obwhatsapp.notification.PopupNotification;
import com.obwhatsapp.profile.ProfilePhotoReminder;
import com.obwhatsapp.reactions.ReactionsTrayViewModel;
import com.obwhatsapp.registration.RegisterName;
import com.obwhatsapp.status.playback.MessageReplyActivity;
import com.obwhatsapp.textstatuscomposer.TextStatusComposerActivity;

public class IDxCListenerShape203S0100000_2_I0 implements AnonymousClass5RN {
    public Object A00;
    public final int A01;

    public IDxCListenerShape203S0100000_2_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public void ANC() {
        switch (this.A01) {
            case 0:
                AnonymousClass3K2.A0y(((CartFragment) this.A00).A0n);
                return;
            case 1:
                AnonymousClass3K2.A0y(((SharedTextPreviewDialogFragment) this.A00).A0D);
                return;
            case 2:
                return;
            case 3:
                C42821yj r1 = (C42821yj) this.A00;
                if (!r1.A22.AJX()) {
                    AnonymousClass3K2.A0y(r1.A37);
                    return;
                }
                return;
            case 4:
                AnonymousClass2JH r0 = (AnonymousClass2JH) this.A00;
                r0.AcT();
                AnonymousClass5RN r12 = r0.A06;
                if (r12 != null) {
                    C108705Pa r02 = r0.A0A;
                    if (r02 == null || r02.AIx()) {
                        r12.ANC();
                        return;
                    }
                    return;
                }
                return;
            case 5:
                AnonymousClass3K2.A0y(((NewGroup) this.A00).A07);
                return;
            case 6:
                AnonymousClass3K2.A0y(((AnonymousClass2A5) this.A00).A07);
                return;
            case 7:
                AnonymousClass3K2.A0y(((AnonymousClass29F) this.A00).A03.A04.A0B);
                return;
            case 8:
                AnonymousClass3K2.A0y(((PopupNotification) this.A00).A0d);
                return;
            case 9:
                AnonymousClass3K2.A0y(((ProfilePhotoReminder) this.A00).A05);
                return;
            case 10:
                AnonymousClass3K2.A0y(((RegisterName) this.A00).A0A);
                return;
            case 11:
                AnonymousClass3K2.A0y(((MessageReplyActivity) this.A00).A0m);
                return;
            case 12:
                AnonymousClass3K2.A0y(((TextStatusComposerActivity) this.A00).A0a);
                return;
            default:
                AnonymousClass3K2.A0y(((AnonymousClass2P5) this.A00).A05);
                return;
        }
    }

    public void AQH(int[] iArr) {
        switch (this.A01) {
            case 0:
                AnonymousClass2Sy.A08(((CartFragment) this.A00).A0n, iArr, AccessibilityEventCompat.TYPE_VIEW_ACCESSIBILITY_FOCUS_CLEARED);
                return;
            case 1:
                AnonymousClass2Sy.A08(((SharedTextPreviewDialogFragment) this.A00).A0D, iArr, 0);
                return;
            case 2:
                AnonymousClass1yR r1 = (AnonymousClass1yR) this.A00;
                if (r1.AJX()) {
                    ReactionsTrayViewModel reactionsTrayViewModel = r1.A00.A0j;
                    AnonymousClass00B.A06(reactionsTrayViewModel);
                    reactionsTrayViewModel.A06(AnonymousClass2Sy.A06(iArr));
                    return;
                }
                return;
            case 3:
                C42821yj r2 = (C42821yj) this.A00;
                if (r2.A22.AJX()) {
                    ReactionsTrayViewModel reactionsTrayViewModel2 = ((AnonymousClass1yR) r2.A22).A00.A0j;
                    AnonymousClass00B.A06(reactionsTrayViewModel2);
                    reactionsTrayViewModel2.A06(AnonymousClass2Sy.A06(iArr));
                    AnonymousClass1yV r12 = r2.A22;
                    C16740tZ r0 = ((AnonymousClass1yR) r12).A00.A0j.A02;
                    AnonymousClass00B.A06(r0);
                    r12.Agy(r0);
                    return;
                }
                AnonymousClass2Sy.A08(r2.A37, iArr, 0);
                r2.A37.callOnClick();
                return;
            case 4:
                AnonymousClass2JH r02 = (AnonymousClass2JH) this.A00;
                r02.AcT();
                AnonymousClass5RN r13 = r02.A06;
                if (r13 != null) {
                    C108705Pa r03 = r02.A0A;
                    if (r03 == null || r03.AIx()) {
                        r13.AQH(iArr);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                NewGroup newGroup = (NewGroup) this.A00;
                AnonymousClass2Sy.A08(newGroup.A07, iArr, newGroup.A06.A02(C15910s6.A20));
                return;
            case 6:
                AnonymousClass2Sy.A08(((AnonymousClass2A5) this.A00).A07, iArr, 1024);
                return;
            case 7:
                AnonymousClass2Sy.A08(((AnonymousClass29F) this.A00).A03.A04.A0B, iArr, 1024);
                return;
            case 8:
                PopupNotification popupNotification = (PopupNotification) this.A00;
                if (popupNotification.A1I.A0P == null) {
                    AnonymousClass2Sy.A08(popupNotification.A0d, iArr, 0);
                    return;
                }
                return;
            case 9:
                AnonymousClass2Sy.A08(((ProfilePhotoReminder) this.A00).A05, iArr, 25);
                return;
            case 10:
                AnonymousClass2Sy.A08(((RegisterName) this.A00).A0A, iArr, 25);
                return;
            case 11:
                MessageReplyActivity messageReplyActivity = (MessageReplyActivity) this.A00;
                AnonymousClass1ZK r04 = messageReplyActivity.A16;
                if (r04 == null || r04.A0P == null) {
                    AnonymousClass2Sy.A08(messageReplyActivity.A0m, iArr, 0);
                    return;
                }
                return;
            case 12:
                AnonymousClass2Sy.A08(((TextStatusComposerActivity) this.A00).A0a, iArr, 0);
                return;
            default:
                AnonymousClass2Sy.A08(((AnonymousClass2P5) this.A00).A05, iArr, 1024);
                return;
        }
    }
}
