package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.IDxSListenerShape52S0000000_2_I1;
import com.google.android.gms.maps.model.LatLng;
import com.obwhatsapp.R;
import com.obwhatsapp.WaTextView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2z4  reason: invalid class name and case insensitive filesystem */
public final class C59812z4 extends C72823ml {
    public final View A00;
    public final WaTextView A01;
    public final C17570vI A02;

    public C59812z4(View view, C17570vI r3) {
        super(view);
        this.A00 = view;
        this.A02 = r3;
        this.A01 = (WaTextView) C18450wi.A00(view, R.id.view_all_btn);
        ((RecyclerView) C004601z.A0E(view, R.id.business_list)).setAdapter(r3);
    }

    public /* bridge */ /* synthetic */ void A08(Object obj) {
        LatLng latLng;
        boolean z2;
        C72233lm r6 = (C72233lm) obj;
        C18450wi.A0H(r6, 0);
        WaTextView waTextView = this.A01;
        List list = r6.A02;
        int i2 = 0;
        if (list.size() <= 3) {
            i2 = 8;
        }
        waTextView.setVisibility(i2);
        C13680ns.A18(waTextView, r6, 22);
        C17570vI r7 = this.A02;
        List<AnonymousClass1US> A0C = C003101j.A0C(list, 3);
        ArrayList A0N = AnonymousClass1J9.A0N(A0C);
        for (AnonymousClass1US r15 : A0C) {
            AnonymousClass26B r8 = r6.A00;
            if (!C18450wi.A0R(r8.A08, "country_default")) {
                Double d2 = r8.A03;
                C18450wi.A0F(d2);
                C18450wi.A0B(d2);
                double doubleValue = d2.doubleValue();
                Double d3 = r8.A04;
                C18450wi.A0F(d3);
                C18450wi.A0B(d3);
                latLng = new LatLng(doubleValue, d3.doubleValue());
            } else {
                latLng = null;
            }
            int A002 = r8.A00();
            if (r8.A02()) {
                z2 = true;
                if (r15.A04()) {
                    C72243ln r10 = new C72243ln(latLng, new C100934wR(r6, r15), new IDxSListenerShape52S0000000_2_I1(1), (AnonymousClass5T6) null, r15, A002, z2, false);
                    r10.A02 = false;
                    A0N.add(r10);
                }
            }
            z2 = false;
            C72243ln r102 = new C72243ln(latLng, new C100934wR(r6, r15), new IDxSListenerShape52S0000000_2_I1(1), (AnonymousClass5T6) null, r15, A002, z2, false);
            r102.A02 = false;
            A0N.add(r102);
        }
        r7.A0F(A0N);
    }
}
