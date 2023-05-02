package X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.view.View;
import com.obwhatsapp.R;
import com.obwhatsapp.qrcode.contactqr.ContactQrContactCardView;

/* renamed from: X.38k  reason: invalid class name and case insensitive filesystem */
public class C613138k {
    public final /* synthetic */ C16010sH A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ boolean A03;

    public C613138k(C16010sH r1, String str, String str2, boolean z2) {
        this.A00 = r1;
        this.A03 = z2;
        this.A02 = str;
        this.A01 = str2;
    }

    public Bitmap A00(C14550pN r10) {
        ContactQrContactCardView contactQrContactCardView;
        Resources resources = r10.getResources();
        C004301w A1S = r10.A1S();
        int i2 = ((AnonymousClass06G) A1S).A01;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 17) {
            A1S.A0B(1);
            contactQrContactCardView = new ContactQrContactCardView(r10);
            contactQrContactCardView.setGravity(17);
            contactQrContactCardView.setStyle(1);
            contactQrContactCardView.A02(this.A00, this.A03);
            contactQrContactCardView.setPrompt(this.A02);
            contactQrContactCardView.setQrCode(this.A01);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(resources.getDimension(R.dimen.dimen020e));
            gradientDrawable.setColor(resources.getColor(R.color.color017d));
            contactQrContactCardView.findViewById(R.id.qr_card).setBackground(gradientDrawable);
        } else {
            contactQrContactCardView = new ContactQrContactCardView(C434920f.A01(r10));
            contactQrContactCardView.setGravity(17);
            contactQrContactCardView.setStyle(1);
            contactQrContactCardView.A02(this.A00, this.A03);
            contactQrContactCardView.setPrompt(this.A02);
            contactQrContactCardView.setQrCode(this.A01);
        }
        contactQrContactCardView.measure(View.MeasureSpec.makeMeasureSpec(resources.getDimensionPixelSize(R.dimen.dimen0219), 1073741824), View.MeasureSpec.makeMeasureSpec(resources.getDimensionPixelSize(R.dimen.dimen0215), 1073741824));
        contactQrContactCardView.layout(0, 0, contactQrContactCardView.getMeasuredWidth(), contactQrContactCardView.getMeasuredHeight());
        Bitmap createBitmap = Bitmap.createBitmap(contactQrContactCardView.getWidth(), contactQrContactCardView.getHeight(), Bitmap.Config.ARGB_8888);
        contactQrContactCardView.draw(new Canvas(createBitmap));
        if (i3 < 17) {
            A1S.A0B(i2);
        }
        return createBitmap;
    }
}
