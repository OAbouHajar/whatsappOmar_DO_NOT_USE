package X;

import com.facebook.redex.RunnableRunnableShape20S0100000_I1_3;
import com.obwhatsapp.wabloks.commerce.ui.viewmodel.WaExtensionsMetaDataViewModel;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4vO  reason: invalid class name and case insensitive filesystem */
public final class C100284vO implements AnonymousClass236 {
    public final /* synthetic */ WaExtensionsMetaDataViewModel A00;
    public final /* synthetic */ String A01;

    public C100284vO(WaExtensionsMetaDataViewModel waExtensionsMetaDataViewModel, String str) {
        this.A00 = waExtensionsMetaDataViewModel;
        this.A01 = str;
    }

    public void ALZ(AnonymousClass239 r5) {
        WaExtensionsMetaDataViewModel waExtensionsMetaDataViewModel;
        C14870pt r2;
        int i2;
        if (r5 != null) {
            List list = r5.A00;
            String str = this.A01;
            waExtensionsMetaDataViewModel = this.A00;
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (C18450wi.A0R(((AnonymousClass238) it.next()).A03, str)) {
                        r2 = waExtensionsMetaDataViewModel.A02;
                        i2 = 21;
                        break;
                    }
                } else {
                    break;
                }
            }
            r2.A0K(new RunnableRunnableShape20S0100000_I1_3(waExtensionsMetaDataViewModel, i2));
        }
        waExtensionsMetaDataViewModel = this.A00;
        r2 = waExtensionsMetaDataViewModel.A02;
        i2 = 20;
        r2.A0K(new RunnableRunnableShape20S0100000_I1_3(waExtensionsMetaDataViewModel, i2));
    }
}
