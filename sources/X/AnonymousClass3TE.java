package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import com.obwhatsapp.notification.PopupNotification;

/* renamed from: X.3TE  reason: invalid class name */
public class AnonymousClass3TE extends AnonymousClass012 {
    public final /* synthetic */ PopupNotification A00;

    public AnonymousClass3TE(PopupNotification popupNotification) {
        this.A00 = popupNotification;
    }

    public int A01() {
        return C13680ns.A07(this.A00.A1O);
    }

    public Object A05(ViewGroup viewGroup, int i2) {
        PopupNotification popupNotification = this.A00;
        RelativeLayout relativeLayout = new RelativeLayout(popupNotification);
        ScrollView scrollView = new ScrollView(popupNotification);
        C16740tZ r0 = (C16740tZ) popupNotification.A1O.get(i2);
        View A02 = PopupNotification.A02(popupNotification, r0);
        relativeLayout.setTag(r0.A11);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(13);
        scrollView.addView(A02);
        relativeLayout.addView(scrollView, layoutParams);
        viewGroup.addView(relativeLayout);
        return relativeLayout;
    }

    public void A0D(ViewGroup viewGroup, Object obj, int i2) {
        viewGroup.removeView((View) obj);
    }

    public boolean A0E(View view, Object obj) {
        return AnonymousClass000.A1Y(view, obj);
    }
}
