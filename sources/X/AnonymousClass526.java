package X;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.obwhatsapp.R;
import java.lang.ref.WeakReference;

/* renamed from: X.526  reason: invalid class name */
public class AnonymousClass526 implements C38481qr {
    public final String A00;
    public final WeakReference A01;

    public AnonymousClass526(ImageView imageView, String str) {
        this.A01 = C13690nt.A0h(imageView);
        this.A00 = str;
        imageView.setTag(str);
    }

    public void ASi(Bitmap bitmap) {
        ImageView imageView = (ImageView) this.A01.get();
        if (imageView != null && this.A00.equals(imageView.getTag())) {
            imageView.setImageBitmap(bitmap);
        }
    }

    public void ASq() {
        ImageView imageView = (ImageView) this.A01.get();
        if (imageView != null && this.A00.equals(imageView.getTag())) {
            imageView.setImageResource(R.drawable.selector_sticker_pack_error);
        }
    }

    public void ASv(Bitmap bitmap) {
        ImageView imageView = (ImageView) this.A01.get();
        if (imageView != null && this.A00.equals(imageView.getTag())) {
            imageView.setImageBitmap(bitmap);
        }
    }
}
