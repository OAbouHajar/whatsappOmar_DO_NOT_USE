package X;

import android.graphics.Bitmap;
import com.obwhatsapp.wabloks.commerce.ui.viewmodel.WaExtensionsNavBarViewModel;
import com.whatsapp.util.Log;

/* renamed from: X.4w4  reason: invalid class name and case insensitive filesystem */
public final class C100704w4 implements C1221868p {
    public final /* synthetic */ WaExtensionsNavBarViewModel A00;

    public C100704w4(WaExtensionsNavBarViewModel waExtensionsNavBarViewModel) {
        this.A00 = waExtensionsNavBarViewModel;
    }

    public void AQQ() {
        Log.e("WaGalaxyImageViewModel/setupTopNavBar/Error while loading image");
    }

    public void AY2(Bitmap bitmap) {
        this.A00.A01.A0B(bitmap);
    }
}
