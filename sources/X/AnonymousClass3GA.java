package X;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.obwhatsapp.R;
import com.obwhatsapp.biz.catalog.CatalogMediaViewFragment;
import com.obwhatsapp.mediaview.IDxPViewShape89S0100000_2_I1;
import com.obwhatsapp.ui.media.MediaCaptionTextView;
import com.whatsapp.util.ViewOnClickCListenerShape4S0100000_I1;

/* renamed from: X.3GA  reason: invalid class name */
public class AnonymousClass3GA implements AnonymousClass5T0 {
    public final /* synthetic */ CatalogMediaViewFragment A00;

    public AnonymousClass3GA(CatalogMediaViewFragment catalogMediaViewFragment) {
        this.A00 = catalogMediaViewFragment;
    }

    public AnonymousClass01Q A7f(int i2) {
        CatalogMediaViewFragment catalogMediaViewFragment = this.A00;
        ViewGroup viewGroup = (ViewGroup) catalogMediaViewFragment.A05().inflate(R.layout.layout03d7, (ViewGroup) null);
        ViewGroup A0K = C13690nt.A0K(viewGroup, R.id.footer);
        IDxPViewShape89S0100000_2_I1 iDxPViewShape89S0100000_2_I1 = new IDxPViewShape89S0100000_2_I1(catalogMediaViewFragment.A02(), this, 0);
        iDxPViewShape89S0100000_2_I1.A0M = new ViewOnClickCListenerShape4S0100000_I1(this, 15);
        if (i2 == catalogMediaViewFragment.A00) {
            C004601z.A0n(iDxPViewShape89S0100000_2_I1, C47612Jr.A04(AnonymousClass1KX.A00(i2, catalogMediaViewFragment.A02.A0D)));
        }
        int i3 = 0;
        viewGroup.addView(iDxPViewShape89S0100000_2_I1, 0);
        iDxPViewShape89S0100000_2_I1.A01 = 0.2f;
        iDxPViewShape89S0100000_2_I1.A0Y = true;
        catalogMediaViewFragment.A05.A02(iDxPViewShape89S0100000_2_I1, (C35691mL) catalogMediaViewFragment.A02.A06.get(i2), (C108515Oh) null, new C100484vi(catalogMediaViewFragment, iDxPViewShape89S0100000_2_I1, i2), 1);
        if (!TextUtils.isEmpty(catalogMediaViewFragment.A02.A0A)) {
            View inflate = catalogMediaViewFragment.A05().inflate(R.layout.layout03d2, (ViewGroup) null);
            A0K.addView(inflate, 0);
            C13690nt.A16(A0K, catalogMediaViewFragment);
            ((MediaCaptionTextView) C004601z.A0E(inflate, R.id.caption)).setCaptionText(catalogMediaViewFragment.A02.A0A);
        }
        if (!catalogMediaViewFragment.A0G) {
            i3 = 8;
        }
        A0K.setVisibility(i3);
        return new AnonymousClass01Q(viewGroup, AnonymousClass1KX.A00(i2, catalogMediaViewFragment.A02.A0D));
    }

    public void A7w(int i2) {
    }

    public /* bridge */ /* synthetic */ int AF8(Object obj) {
        int i2 = 0;
        while (true) {
            CatalogMediaViewFragment catalogMediaViewFragment = this.A00;
            if (i2 >= catalogMediaViewFragment.A02.A06.size()) {
                return 0;
            }
            if (AnonymousClass1KX.A00(i2, catalogMediaViewFragment.A02.A0D).equals(obj)) {
                return i2;
            }
            i2++;
        }
    }

    public void ARO() {
    }

    public int getCount() {
        return this.A00.A02.A06.size();
    }
}
