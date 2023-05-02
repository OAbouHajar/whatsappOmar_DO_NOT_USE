package X;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.obwhatsapp.R;
import com.whatsapp.filter.FilterUtils;
import java.util.HashSet;

/* renamed from: X.4x8  reason: invalid class name and case insensitive filesystem */
public class C101344x8 implements AnonymousClass2OY {
    public boolean A00;
    public final C34711kk A01;
    public final C17160ud A02;
    public final HashSet A03 = C13680ns.A0o();

    public C101344x8(C34711kk r2, C17160ud r3) {
        this.A02 = r3;
        this.A01 = r2;
    }

    public final void A00(Bitmap bitmap, ImageView imageView, String str) {
        if (this.A03.contains(Integer.valueOf(imageView.hashCode()))) {
            Bitmap bitmap2 = null;
            if (str != null && !this.A00) {
                bitmap2 = (Bitmap) this.A01.A00(str);
            }
            this.A00 = false;
            if (bitmap2 != null) {
                imageView.setImageBitmap(bitmap2);
                return;
            }
            try {
                Bitmap copy = bitmap.copy(Bitmap.Config.ARGB_8888, true);
                if (copy != null) {
                    FilterUtils.blurNative(copy, 30, 2);
                    if (str != null) {
                        this.A01.A03(str, copy);
                    }
                    imageView.setImageBitmap(copy);
                }
            } catch (Throwable th) {
                th.getMessage();
            }
        } else {
            imageView.setImageBitmap(bitmap);
        }
    }

    public void AfW(Bitmap bitmap, ImageView imageView, boolean z2) {
        if (bitmap != null) {
            A00(bitmap, imageView, imageView.getTag() instanceof String ? (String) imageView.getTag() : null);
        } else {
            Afn(imageView);
        }
    }

    public void Afn(ImageView imageView) {
        A00(this.A02.A03(imageView.getContext(), R.drawable.avatar_contact_voip), imageView, "default_avatar");
    }
}
