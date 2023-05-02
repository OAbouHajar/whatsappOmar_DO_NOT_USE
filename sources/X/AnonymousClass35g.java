package X;

import android.view.View;
import com.whatsapp.util.Log;
import java.util.Map;

/* renamed from: X.35g  reason: invalid class name */
public class AnonymousClass35g extends C34331k5 {
    public final /* synthetic */ C62623Eh A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ Map A02;
    public final /* synthetic */ boolean A03;

    public AnonymousClass35g(C62623Eh r1, String str, Map map, boolean z2) {
        this.A00 = r1;
        this.A03 = z2;
        this.A01 = str;
        this.A02 = map;
    }

    public void A06(View view) {
        AnonymousClass1VI r4;
        Log.i("UserNoticeBanner/update/banner tapped");
        boolean z2 = this.A03;
        C62623Eh r5 = this.A00;
        C19220xx r0 = r5.A05;
        if (z2) {
            AnonymousClass13F r1 = r0.A05;
            C13680ns.A0x(r1.A00().edit(), "current_user_notice_banner_dismiss_timestamp", r0.A01.A00());
            AnonymousClass1PN r2 = r5.A03;
            r4 = r5.A01;
            r2.A01(r4.getContext(), true);
        } else {
            r0.A04();
            AnonymousClass1PN r3 = r5.A03;
            String str = this.A01;
            Map map = this.A02;
            r4 = r5.A01;
            r3.A00(r4.getContext(), str, map);
        }
        r5.A04.A01(C13680ns.A0Z());
        View view2 = r5.A00;
        AnonymousClass00B.A04(view2);
        view2.setVisibility(8);
        AnonymousClass01J r12 = r5.A06;
        if (r12.get() != null) {
            r4.A02((AnonymousClass1VJ) r12.get());
        }
    }
}
