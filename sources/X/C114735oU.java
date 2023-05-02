package X;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;
import com.obwhatsapp.R;
import com.obwhatsapp.wabloks.ui.WaBloksActivity;

/* renamed from: X.5oU  reason: invalid class name and case insensitive filesystem */
public class C114735oU extends C114745oV {
    public C114735oU(AnonymousClass013 r2, WaBloksActivity waBloksActivity) {
        super(r2, waBloksActivity);
        C434920f.A03(waBloksActivity, R.color.color064b);
    }

    public void A03(Intent intent, Bundle bundle) {
        super.A03(intent, bundle);
        A07();
    }

    public void A04(C108615Or r1) {
        super.A04(r1);
        A07();
    }

    public final void A07() {
        WaBloksActivity waBloksActivity = this.A03;
        Toolbar toolbar = (Toolbar) AnonymousClass00T.A05(waBloksActivity, R.id.wabloks_screen_toolbar);
        C447725m r0 = new C447725m(AnonymousClass2SR.A06(waBloksActivity.getResources().getDrawable(R.drawable.ic_back), waBloksActivity.getResources().getColor(R.color.color090b)), this.A02);
        r0.clearColorFilter();
        toolbar.setNavigationIcon((Drawable) r0);
        toolbar.setBackgroundColor(waBloksActivity.getResources().getColor(R.color.color064b));
        toolbar.setTitleTextColor(waBloksActivity.getResources().getColor(R.color.color06ac));
        Drawable overflowIcon = toolbar.getOverflowIcon();
        if (overflowIcon != null) {
            Drawable A03 = C018208n.A03(overflowIcon);
            C018208n.A0A(A03.mutate(), waBloksActivity.getResources().getColor(R.color.color090b));
            toolbar.setOverflowIcon(A03);
        }
    }
}
