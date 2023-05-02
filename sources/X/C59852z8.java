package X;

import android.text.TextUtils;
import android.view.View;
import com.obwhatsapp.CircleWaImageView;
import com.obwhatsapp.R;
import com.obwhatsapp.WaImageView;
import com.obwhatsapp.WaTextView;
import java.util.List;

/* renamed from: X.2z8  reason: invalid class name and case insensitive filesystem */
public class C59852z8 extends C72823ml {
    public C33481ie A00;
    public AnonymousClass2Ao A01;
    public final CircleWaImageView A02;
    public final WaImageView A03;
    public final WaTextView A04;
    public final WaTextView A05;
    public final C19860z7 A06;
    public final C17140ub A07;

    public C59852z8(View view, C19860z7 r4, C17140ub r5, C17200uh r6) {
        super(view);
        this.A07 = r5;
        this.A01 = r6.A04(view.getContext(), "business-profile-recent-item");
        this.A06 = r4;
        this.A02 = (CircleWaImageView) C004601z.A0E(view, R.id.business_avatar);
        this.A04 = C13680ns.A0S(view, R.id.business_name);
        this.A05 = C13680ns.A0S(view, R.id.category);
        this.A03 = C13690nt.A0R(view, R.id.delete_button);
    }

    public void A07() {
        this.A01.A00();
        C33481ie r1 = this.A00;
        if (r1 != null) {
            this.A07.A03(r1);
        }
        this.A06.A00();
    }

    public /* bridge */ /* synthetic */ void A08(Object obj) {
        C72103lZ r5 = (C72103lZ) obj;
        this.A01.A08(this.A02, new C16010sH(C15830rv.A02(r5.A03)), false);
        C73593oP r1 = new C73593oP(r5, this);
        this.A00 = r1;
        this.A07.A02(r1);
        List list = r5.A04;
        if (list.isEmpty() || AnonymousClass000.A0n(list, 0).isEmpty()) {
            this.A05.setVisibility(8);
        } else {
            WaTextView waTextView = this.A05;
            waTextView.setText(TextUtils.join(", ", list));
            waTextView.setVisibility(0);
        }
        this.A04.setText(r5.A02);
        C13680ns.A18(this.A03, r5, 8);
        C13680ns.A1B(this.A0H, this, r5, 17);
    }
}
