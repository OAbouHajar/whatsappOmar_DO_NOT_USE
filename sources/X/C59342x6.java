package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.obwhatsapp.R;
import com.obwhatsapp.avatar.profilephoto.AvatarProfilePhotoImageView;

/* renamed from: X.2x6  reason: invalid class name and case insensitive filesystem */
public final class C59342x6 extends C65003Sm {
    public final float A00;
    public final AvatarProfilePhotoImageView A01;

    public C59342x6(View view) {
        super(view);
        this.A01 = (AvatarProfilePhotoImageView) view;
        this.A00 = view.getResources().getDimension(R.dimen.dimen0098);
    }

    public void A07(C807845n r7, AnonymousClass22J r8) {
        C70823hn r72 = (C70823hn) r7;
        if (r72 instanceof C70803hl) {
            C70803hl r73 = (C70803hl) r72;
            A08(r73.A03, r73.A00);
            View view = this.A0H;
            int A002 = AnonymousClass00T.A00(view.getContext(), R.color.color0792);
            AvatarProfilePhotoImageView avatarProfilePhotoImageView = this.A01;
            avatarProfilePhotoImageView.setAvatarPoseBackgroundColor(A002);
            avatarProfilePhotoImageView.setImageBitmap(r73.A01);
            C13680ns.A1B(view, r8, r73, 4);
            String str = r73.A02;
            if (str != null) {
                Context context = view.getContext();
                avatarProfilePhotoImageView.setContentDescription(TextUtils.isEmpty(str) ? context.getString(R.string.str169e) : C13680ns.A0d(context, str, C13680ns.A1b(), 0, R.string.str169f));
            }
        } else if (r72 instanceof C70813hm) {
            C70813hm r74 = (C70813hm) r72;
            View view2 = this.A0H;
            int A003 = AnonymousClass00T.A00(view2.getContext(), R.color.color088a);
            AvatarProfilePhotoImageView avatarProfilePhotoImageView2 = this.A01;
            avatarProfilePhotoImageView2.setAvatarPoseBackgroundColor(A003);
            Integer num = r74.A00;
            if (num != null) {
                A08(r74.A01, num.intValue());
            } else {
                avatarProfilePhotoImageView2.A06();
            }
            view2.setOnClickListener((View.OnClickListener) null);
        }
    }

    public final void A08(boolean z2, int i2) {
        AnonymousClass41E r2;
        if (z2) {
            r2 = AnonymousClass41E.SELECTED;
        } else if (!z2) {
            r2 = AnonymousClass41E.IDLE;
        } else {
            throw new AnonymousClass2Xe();
        }
        AvatarProfilePhotoImageView avatarProfilePhotoImageView = this.A01;
        avatarProfilePhotoImageView.setSelected(z2);
        avatarProfilePhotoImageView.A08(r2, this.A00, i2);
    }
}
