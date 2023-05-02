package X;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.redex.IDxBLoaderShape91S0200000_2_I0;
import com.facebook.redex.IDxBRecipientShape30S0300000_1_I0;
import com.obwhatsapp.R;
import com.obwhatsapp.WaMediaThumbnailView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2hJ  reason: invalid class name and case insensitive filesystem */
public final class C54362hJ extends AnonymousClass01X {
    public final LayoutInflater A00;
    public final AnonymousClass2OM A01;
    public final List A02 = new ArrayList();

    public C54362hJ(LayoutInflater layoutInflater, AnonymousClass2OM r3) {
        C18450wi.A0H(r3, 2);
        this.A00 = layoutInflater;
        this.A01 = r3;
    }

    public /* bridge */ /* synthetic */ void A07(C005602k r3) {
        AnonymousClass3SU r32 = (AnonymousClass3SU) r3;
        C18450wi.A0H(r32, 0);
        WaMediaThumbnailView waMediaThumbnailView = r32.A03;
        waMediaThumbnailView.setImageDrawable((Drawable) null);
        waMediaThumbnailView.A01 = null;
        waMediaThumbnailView.setThumbnail((Bitmap) null);
        waMediaThumbnailView.setTag((Object) null);
    }

    public int A0C() {
        return this.A02.size();
    }

    public /* bridge */ /* synthetic */ void ANf(C005602k r6, int i2) {
        AnonymousClass2OV r2;
        AnonymousClass3SU r62 = (AnonymousClass3SU) r6;
        C18450wi.A0H(r62, 0);
        AnonymousClass2BF r4 = (AnonymousClass2BF) this.A02.get(i2);
        WaMediaThumbnailView waMediaThumbnailView = r62.A03;
        waMediaThumbnailView.A01 = r4;
        Object tag = waMediaThumbnailView.getTag();
        if ((tag instanceof AnonymousClass2OV) && (r2 = (AnonymousClass2OV) tag) != null) {
            r62.A04.A01(r2);
        }
        if (r4 != null) {
            waMediaThumbnailView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            IDxBLoaderShape91S0200000_2_I0 iDxBLoaderShape91S0200000_2_I0 = new IDxBLoaderShape91S0200000_2_I0(r4, 1, r62);
            waMediaThumbnailView.setTag(iDxBLoaderShape91S0200000_2_I0);
            r62.A04.A02(iDxBLoaderShape91S0200000_2_I0, new IDxBRecipientShape30S0300000_1_I0(iDxBLoaderShape91S0200000_2_I0, r62, r4, 1));
            return;
        }
        waMediaThumbnailView.setScaleType(ImageView.ScaleType.CENTER);
        waMediaThumbnailView.setBackgroundColor(r62.A01);
        waMediaThumbnailView.setImageDrawable((Drawable) null);
    }

    public /* bridge */ /* synthetic */ C005602k APF(ViewGroup viewGroup, int i2) {
        C18450wi.A0H(viewGroup, 0);
        View inflate = this.A00.inflate(R.layout.layout053e, viewGroup, false);
        C18450wi.A0B(inflate);
        return new AnonymousClass3SU(inflate, this.A01);
    }
}
