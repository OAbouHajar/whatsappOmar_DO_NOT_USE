package X;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.obwhatsapp.R;

/* renamed from: X.527  reason: invalid class name */
public class AnonymousClass527 implements C38481qr {
    public final /* synthetic */ ImageView A00;
    public final /* synthetic */ AnonymousClass35B A01;
    public final /* synthetic */ String A02;

    public AnonymousClass527(ImageView imageView, AnonymousClass35B r2, String str) {
        this.A01 = r2;
        this.A02 = str;
        this.A00 = imageView;
    }

    public void ASi(Bitmap bitmap) {
        String str = this.A02;
        ImageView imageView = this.A00;
        if (str.equals(imageView.getTag())) {
            imageView.setImageBitmap(bitmap);
        }
    }

    public void ASq() {
        String str = this.A02;
        ImageView imageView = this.A00;
        if (str.equals(imageView.getTag())) {
            imageView.setImageResource(R.drawable.selector_sticker_pack_error);
        }
    }

    public void ASv(Bitmap bitmap) {
        String str = this.A02;
        ImageView imageView = this.A00;
        if (str.equals(imageView.getTag())) {
            imageView.setImageBitmap(bitmap);
        }
    }
}
