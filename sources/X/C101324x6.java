package X;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.obwhatsapp.R;

/* renamed from: X.4x6  reason: invalid class name and case insensitive filesystem */
public class C101324x6 implements AnonymousClass2OY {
    public void AfW(Bitmap bitmap, ImageView imageView, boolean z2) {
        if (bitmap != null) {
            imageView.setImageBitmap(bitmap);
        } else {
            Afn(imageView);
        }
    }

    public void Afn(ImageView imageView) {
        imageView.setImageResource(R.drawable.avatar_contact);
    }
}
