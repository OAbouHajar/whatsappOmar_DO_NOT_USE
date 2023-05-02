package com.facebook.redex;

import X.AnonymousClass00B;
import X.AnonymousClass1yR;
import X.AnonymousClass29F;
import X.AnonymousClass2A5;
import X.AnonymousClass2P5;
import X.AnonymousClass2Sy;
import X.AnonymousClass5RN;
import X.C26181Mq;
import X.C37781pj;
import com.obwhatsapp.biz.cart.view.fragment.CartFragment;
import com.obwhatsapp.contact.picker.SharedTextPreviewDialogFragment;
import com.obwhatsapp.group.NewGroup;
import com.obwhatsapp.notification.PopupNotification;
import com.obwhatsapp.profile.ProfilePhotoReminder;
import com.obwhatsapp.reactions.ReactionsTrayViewModel;
import com.obwhatsapp.registration.RegisterName;
import com.obwhatsapp.status.playback.MessageReplyActivity;
import com.obwhatsapp.textstatuscomposer.TextStatusComposerActivity;

public class IDxEListenerShape200S0100000_2_I0 implements C26181Mq {
    public Object A00;
    public final int A01;

    public IDxEListenerShape200S0100000_2_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final void AQI(C37781pj r3) {
        AnonymousClass5RN r1;
        int i2 = this.A01;
        Object obj = this.A00;
        switch (i2) {
            case 0:
                r1 = ((CartFragment) obj).A0z;
                break;
            case 1:
                r1 = ((SharedTextPreviewDialogFragment) obj).A0R;
                break;
            case 2:
                ReactionsTrayViewModel reactionsTrayViewModel = ((AnonymousClass1yR) obj).A00.A0j;
                AnonymousClass00B.A06(reactionsTrayViewModel);
                reactionsTrayViewModel.A06(AnonymousClass2Sy.A06(r3.A00));
                return;
            case 3:
                ((NewGroup) obj).A0Z.AQH(r3.A00);
                return;
            case 4:
                r1 = ((AnonymousClass2A5) obj).A04;
                break;
            case 5:
                r1 = ((AnonymousClass29F) obj).A0F;
                break;
            case 6:
                r1 = ((PopupNotification) obj).A0I;
                break;
            case 7:
                r1 = ((ProfilePhotoReminder) obj).A0K;
                break;
            case 8:
                r1 = ((RegisterName) obj).A1Z;
                break;
            case 9:
                r1 = ((MessageReplyActivity) obj).A1B;
                break;
            case 10:
                r1 = ((TextStatusComposerActivity) obj).A0s;
                break;
            default:
                r1 = ((AnonymousClass2P5) obj).A02;
                break;
        }
        r1.AQH(r3.A00);
    }
}
