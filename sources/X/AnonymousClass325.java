package X;

import android.database.Cursor;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.obwhatsapp.R;
import com.obwhatsapp.gallery.LinksGalleryFragment;
import java.util.Calendar;

/* renamed from: X.325  reason: invalid class name */
public class AnonymousClass325 extends AnonymousClass3R5 implements C54622hr {
    public final /* synthetic */ LinksGalleryFragment A00;

    public AnonymousClass325(LinksGalleryFragment linksGalleryFragment) {
        this.A00 = linksGalleryFragment;
    }

    public /* bridge */ /* synthetic */ void A0F(Cursor cursor, C005602k r5) {
        int A02 = C13690nt.A02(cursor, "link_index");
        LinksGalleryFragment linksGalleryFragment = this.A00;
        ((C57722re) r5).A07(linksGalleryFragment.A06.A0G(cursor, linksGalleryFragment.A0D), A02);
    }

    public int AB1(int i2) {
        return ((C56112kz) this.A00.A0I.get(i2)).count;
    }

    public int ACY() {
        return this.A00.A0I.size();
    }

    public long ACZ(int i2) {
        return -((Calendar) this.A00.A0I.get(i2)).getTimeInMillis();
    }

    public /* bridge */ /* synthetic */ void ANd(C005602k r3, int i2) {
        ((C64703Ri) r3).A00.setText(this.A00.A0I.get(i2).toString());
    }

    public /* bridge */ /* synthetic */ C005602k APB(ViewGroup viewGroup) {
        LinksGalleryFragment linksGalleryFragment = this.A00;
        View inflate = linksGalleryFragment.A0C().getLayoutInflater().inflate(R.layout.layout03ca, viewGroup, false);
        inflate.setClickable(false);
        C13680ns.A0u(linksGalleryFragment.A0u(), inflate, R.color.color045a);
        return new C64703Ri(inflate);
    }

    public /* bridge */ /* synthetic */ C005602k APF(ViewGroup viewGroup, int i2) {
        LinksGalleryFragment linksGalleryFragment = this.A00;
        View A0H = C13680ns.A0H(linksGalleryFragment.A0C().getLayoutInflater(), viewGroup, R.layout.layout0380);
        ((FrameLayout) A0H.findViewById(R.id.link_preview_frame)).setForeground(AnonymousClass00T.A04(linksGalleryFragment.A0u(), R.drawable.selector_orange_gradient));
        C447725m.A01(linksGalleryFragment.A0u(), C13680ns.A0K(A0H, R.id.chevron), linksGalleryFragment.A05, R.drawable.chevron);
        return new C57722re(A0H, linksGalleryFragment);
    }

    public /* bridge */ /* synthetic */ boolean AXu(MotionEvent motionEvent, C005602k r3, int i2) {
        return false;
    }
}
