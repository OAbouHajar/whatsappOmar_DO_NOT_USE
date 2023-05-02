package X;

import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.redex.IDxBListenerShape285S0100000_2_I1;
import com.facebook.redex.IDxSListenerShape268S0100000_2_I1;
import com.obwhatsapp.CatalogImageListActivity;
import com.obwhatsapp.R;
import com.whatsapp.util.ViewOnClickCListenerShape0S0101000_I1;

/* renamed from: X.2r1  reason: invalid class name */
public class AnonymousClass2r1 extends AnonymousClass01X {
    public final C54602hp A00;
    public final /* synthetic */ CatalogImageListActivity A01;

    public AnonymousClass2r1(CatalogImageListActivity catalogImageListActivity, C54602hp r2) {
        this.A01 = catalogImageListActivity;
        this.A00 = r2;
    }

    public int A0C() {
        return this.A01.A05.A06.size();
    }

    public /* bridge */ /* synthetic */ void ANf(C005602k r10, int i2) {
        AnonymousClass3SN r102 = (AnonymousClass3SN) r10;
        r102.A00 = AnonymousClass000.A1R(i2, this.A01.A00);
        CatalogImageListActivity catalogImageListActivity = r102.A03;
        IDxSListenerShape268S0100000_2_I1 iDxSListenerShape268S0100000_2_I1 = new IDxSListenerShape268S0100000_2_I1(r102, 0);
        IDxBListenerShape285S0100000_2_I1 iDxBListenerShape285S0100000_2_I1 = new IDxBListenerShape285S0100000_2_I1(r102, 0);
        ImageView imageView = r102.A01;
        catalogImageListActivity.A08.A02(imageView, (C35691mL) catalogImageListActivity.A05.A06.get(i2), iDxBListenerShape285S0100000_2_I1, iDxSListenerShape268S0100000_2_I1, 1);
        imageView.setOnClickListener(new ViewOnClickCListenerShape0S0101000_I1(r102, i2, 0));
        C004601z.A0n(imageView, C47612Jr.A04(AnonymousClass1KX.A00(i2, catalogImageListActivity.A05.A0D)));
    }

    public /* bridge */ /* synthetic */ C005602k APF(ViewGroup viewGroup, int i2) {
        CatalogImageListActivity catalogImageListActivity = this.A01;
        return new AnonymousClass3SN(C13680ns.A0H(catalogImageListActivity.getLayoutInflater(), viewGroup, R.layout.layout00bc), catalogImageListActivity, this.A00);
    }
}
