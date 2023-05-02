package X;

import android.content.Context;
import android.util.AttributeSet;
import com.obwhatsapp.R;
import com.obwhatsapp.privacy.usernotice.UserNoticeModalIconView;

/* renamed from: X.3wZ  reason: invalid class name and case insensitive filesystem */
public abstract class C77773wZ extends C70613hM {
    public C78883yq A00;
    public C16320sq A01;

    public C77773wZ(Context context) {
        super(context);
    }

    public C77773wZ(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public C77773wZ(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }

    public void A04(AnonymousClass2Dq r6) {
        setContentDescription(r6.A02);
        C78883yq r0 = this.A00;
        if (r0 != null) {
            r0.A06(true);
        }
        if (r6.A00(getContext()) == null) {
            A05(r6);
            return;
        }
        C78883yq r4 = new C78883yq(r6, this);
        this.A00 = r4;
        this.A01.Ack(r4, r6.A00(getContext()));
    }

    public void A05(AnonymousClass2Dq r5) {
        int i2;
        if (this instanceof UserNoticeModalIconView) {
            UserNoticeModalIconView userNoticeModalIconView = (UserNoticeModalIconView) this;
            userNoticeModalIconView.setBackground(AnonymousClass00T.A04(userNoticeModalIconView.getContext(), R.drawable.user_notice_modal_default_icon_background));
            userNoticeModalIconView.A00.setImageResource(R.drawable.user_notice_banner_icon);
            userNoticeModalIconView.A00.setColorFilter(userNoticeModalIconView.getResources().getColor(R.color.color07b3));
            userNoticeModalIconView.A00.setVisibility(0);
            return;
        }
        if (!(r5 instanceof AnonymousClass2E6)) {
            setColorFilter(getResources().getColor(R.color.color07b3));
            i2 = R.drawable.user_notice_banner_icon;
        } else {
            i2 = R.drawable.ga_banner;
        }
        setImageResource(i2);
    }

    public abstract int getTargetIconSize();
}
