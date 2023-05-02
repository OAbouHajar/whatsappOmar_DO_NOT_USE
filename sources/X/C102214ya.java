package X;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.Window;
import com.obwhatsapp.BidiToolbar;
import com.obwhatsapp.profile.ViewProfilePhoto;

/* renamed from: X.4ya  reason: invalid class name and case insensitive filesystem */
public class C102214ya implements C109635Sz {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ Drawable A02;
    public final /* synthetic */ BidiToolbar A03;
    public final /* synthetic */ ViewProfilePhoto A04;
    public final /* synthetic */ boolean A05;

    public C102214ya(Drawable drawable, BidiToolbar bidiToolbar, ViewProfilePhoto viewProfilePhoto, int i2, int i3, boolean z2) {
        this.A04 = viewProfilePhoto;
        this.A05 = z2;
        this.A02 = drawable;
        this.A03 = bidiToolbar;
        this.A01 = i2;
        this.A00 = i3;
    }

    public /* synthetic */ boolean AIj(View view) {
        return true;
    }

    public void APs(View view) {
        boolean z2 = this.A05;
        ViewProfilePhoto viewProfilePhoto = this.A04;
        if (z2) {
            viewProfilePhoto.onBackPressed();
        } else {
            AnonymousClass3K4.A0j(viewProfilePhoto);
        }
    }

    public void AQA(int i2) {
    }

    public void AX7(View view) {
    }

    public void AXK(View view, float f2) {
        int i2;
        float f3 = 1.0f - f2;
        float f4 = f3 < 0.8f ? 0.0f : (f3 - 0.8f) / 0.19999999f;
        this.A02.setAlpha((int) (255.0f * f4));
        this.A03.setAlpha(f4);
        if (Build.VERSION.SDK_INT >= 21 && (i2 = this.A01) != 0) {
            ViewProfilePhoto viewProfilePhoto = this.A04;
            Window window = viewProfilePhoto.getWindow();
            int A032 = AnonymousClass090.A03(f4, i2, -16777216);
            viewProfilePhoto.getWindow().setNavigationBarColor(AnonymousClass090.A03(f4, this.A00, -16777216));
        }
    }
}
