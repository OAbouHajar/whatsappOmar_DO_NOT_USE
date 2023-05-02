package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.ImageView;
import com.whatsapp.util.Log;

/* renamed from: X.5zi  reason: invalid class name and case insensitive filesystem */
public class C119845zi implements C1221868p {
    public final /* synthetic */ ImageView A00;
    public final /* synthetic */ C12380kI A01;

    public C119845zi(ImageView imageView, C12380kI r2) {
        this.A01 = r2;
        this.A00 = imageView;
    }

    public void AQQ() {
        Log.e("ImageComponentBinder/bindView/bitmap read failed");
    }

    public void AY2(Bitmap bitmap) {
        Number number = (Number) this.A01.get();
        if (number != null) {
            Paint paint = new Paint();
            paint.setColorFilter(new PorterDuffColorFilter(number.intValue(), PorterDuff.Mode.SRC_IN));
            Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
            new Canvas(createBitmap).drawBitmap(bitmap, 0.0f, 0.0f, paint);
            this.A00.setImageBitmap(createBitmap);
            return;
        }
        this.A00.setImageBitmap(bitmap);
    }
}
