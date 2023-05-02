package X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.google.android.material.chip.Chip;
import com.obwhatsapp.R;

/* renamed from: X.4wE  reason: invalid class name and case insensitive filesystem */
public final class C100804wE implements C109245Rg {
    public final /* synthetic */ C87234Vy A00;
    public final /* synthetic */ AnonymousClass3SP A01;

    public C100804wE(C87234Vy r1, AnonymousClass3SP r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public void ANg() {
        AnonymousClass3SP r4 = this.A01;
        Chip chip = r4.A02;
        C87234Vy r1 = this.A00;
        String str = r1.A01.A00;
        C18450wi.A0A(str);
        chip.setChipIconResource(C52602e7.A01(str));
        Drawable chipIcon = chip.getChipIcon();
        if (chipIcon != null) {
            Resources resources = r4.A01;
            boolean z2 = r1.A02;
            int i2 = R.color.color06c2;
            if (z2) {
                i2 = R.color.color090b;
            }
            AnonymousClass2SR.A06(chipIcon, resources.getColor(i2));
        }
    }

    public void ANh(Bitmap bitmap) {
        AnonymousClass3SP r0 = this.A01;
        Chip chip = r0.A02;
        BitmapDrawable bitmapDrawable = new BitmapDrawable(bitmap);
        Resources resources = r0.A01;
        boolean z2 = this.A00.A02;
        int i2 = R.color.color06c2;
        if (z2) {
            i2 = R.color.color090b;
        }
        chip.setChipIcon(AnonymousClass2SR.A06(bitmapDrawable, resources.getColor(i2)));
    }
}
