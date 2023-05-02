package X;

import android.view.View;
import com.obwhatsapp.avatar.profilephoto.AvatarProfilePhotoColorView;

/* renamed from: X.3Sm  reason: invalid class name and case insensitive filesystem */
public abstract class C65003Sm extends C005602k {
    public C65003Sm(View view) {
        super(view);
    }

    public void A07(C807845n r9, AnonymousClass22J r10) {
        C70793hk r7 = (C70793hk) this;
        C70833ho r6 = (C70833ho) r9;
        boolean z2 = r6.A03;
        AnonymousClass41E r4 = z2 ? AnonymousClass41E.SELECTED : AnonymousClass41E.IDLE;
        AvatarProfilePhotoColorView avatarProfilePhotoColorView = r7.A00;
        int i2 = r6.A00;
        int i3 = r6.A01;
        C18450wi.A0H(r4, 0);
        avatarProfilePhotoColorView.A00 = r4;
        avatarProfilePhotoColorView.A01.setColor(i2);
        avatarProfilePhotoColorView.A02.setColor(i3);
        avatarProfilePhotoColorView.invalidate();
        avatarProfilePhotoColorView.setSelected(z2);
        avatarProfilePhotoColorView.setContentDescription(r6.A02);
        C13680ns.A1B(r7.A0H, r10, r9, 3);
    }
}
