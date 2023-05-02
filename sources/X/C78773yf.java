package X;

import android.graphics.Bitmap;
import android.view.View;
import com.obwhatsapp.R;
import com.obwhatsapp.biz.catalog.view.CatalogHeader;
import java.lang.ref.WeakReference;

/* renamed from: X.3yf  reason: invalid class name and case insensitive filesystem */
public class C78773yf extends C16690tT {
    public final AnonymousClass152 A00;
    public final C16010sH A01;
    public final WeakReference A02;

    public C78773yf(CatalogHeader catalogHeader, AnonymousClass152 r3, C16010sH r4) {
        this.A01 = r4;
        this.A00 = r3;
        this.A02 = C13690nt.A0h(catalogHeader);
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        View view = (View) this.A02.get();
        if (view != null) {
            return this.A00.A01(view.getContext(), this.A01, 0.0f, 640);
        }
        return null;
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        CatalogHeader catalogHeader = (CatalogHeader) this.A02.get();
        if (catalogHeader == null) {
            return;
        }
        if (bitmap == null) {
            catalogHeader.A00.setImageResource(R.drawable.avatar_contact_large);
        } else {
            catalogHeader.A00.setImageBitmap(bitmap);
        }
    }
}
