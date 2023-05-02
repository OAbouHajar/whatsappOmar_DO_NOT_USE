package X;

import android.graphics.Bitmap;
import android.view.View;
import com.obwhatsapp.R;
import com.whatsapp.stickers.StickerView;

/* renamed from: X.52a  reason: invalid class name and case insensitive filesystem */
public class C1036052a implements AnonymousClass25V {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C25801Le A01;
    public final /* synthetic */ C34151jm A02;
    public final /* synthetic */ AnonymousClass1MF A03;
    public final /* synthetic */ StickerView A04;

    public C1036052a(C25801Le r1, C34151jm r2, AnonymousClass1MF r3, StickerView stickerView, int i2) {
        this.A01 = r1;
        this.A04 = stickerView;
        this.A03 = r3;
        this.A02 = r2;
        this.A00 = i2;
    }

    public int AG6() {
        return this.A00;
    }

    public /* synthetic */ void ARJ() {
    }

    public void AfV(Bitmap bitmap, View view, C16740tZ r12) {
        if (bitmap == null || bitmap.getWidth() <= 0 || bitmap.getHeight() <= 0) {
            AnonymousClass1MF r0 = this.A03;
            C34151jm r2 = this.A02;
            StickerView stickerView = this.A04;
            int i2 = this.A00;
            r0.A04(stickerView, r2, (C436420x) null, 1, i2, i2, false, false);
            return;
        }
        this.A04.setImageBitmap(bitmap);
    }

    public void Afm(View view) {
        this.A04.setImageResource(R.drawable.sticker_error_in_conversation);
    }
}
