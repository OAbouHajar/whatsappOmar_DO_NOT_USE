package X;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.widget.ImageView;
import com.obwhatsapp.R;

/* renamed from: X.1ql  reason: invalid class name and case insensitive filesystem */
public class C38421ql implements C38431qm {
    public final Drawable A00;
    public final Drawable A01;

    public C38421ql(Drawable drawable, Drawable drawable2) {
        this.A00 = drawable2;
        this.A01 = drawable;
    }

    public static final boolean A00(C100204vG r3) {
        ImageView ACj = r3.ACj();
        return (ACj == null || ACj.getTag(R.id.loaded_image_id) == null || !ACj.getTag(R.id.loaded_image_id).equals(r3.A06)) ? false : true;
    }

    public /* bridge */ /* synthetic */ void AMd(AnonymousClass5TC r3) {
        C100204vG r32 = (C100204vG) r3;
        ImageView ACj = r32.ACj();
        if (ACj != null && A00(r32)) {
            Drawable drawable = r32.A03;
            if (drawable == null) {
                drawable = this.A01;
            }
            ACj.setImageDrawable(drawable);
        }
    }

    public /* bridge */ /* synthetic */ void ASn(AnonymousClass5TC r3) {
        C100204vG r32 = (C100204vG) r3;
        ImageView ACj = r32.ACj();
        if (ACj != null && A00(r32)) {
            Drawable drawable = r32.A02;
            if (drawable == null) {
                drawable = this.A00;
            }
            ACj.setImageDrawable(drawable);
        }
        C109485Sh r0 = r32.A04;
        if (r0 != null) {
            r0.ASm();
        }
    }

    public /* bridge */ /* synthetic */ void ASt(AnonymousClass5TC r4) {
        C100204vG r42 = (C100204vG) r4;
        ImageView ACj = r42.ACj();
        if (ACj != null) {
            ACj.setTag(R.id.loaded_image_id, r42.A06);
        }
        C109485Sh r0 = r42.A04;
        if (r0 != null) {
            r0.AYo();
        }
    }

    public /* bridge */ /* synthetic */ void ASx(Bitmap bitmap, AnonymousClass5TC r7, boolean z2) {
        C100204vG r72 = (C100204vG) r7;
        ImageView ACj = r72.ACj();
        if (ACj != null && A00(r72)) {
            if ((ACj.getDrawable() == null || (ACj.getDrawable() instanceof ColorDrawable)) && !z2) {
                Drawable[] drawableArr = new Drawable[2];
                drawableArr[0] = ACj.getDrawable() == null ? new ColorDrawable(0) : ACj.getDrawable();
                drawableArr[1] = new BitmapDrawable(ACj.getResources(), bitmap);
                TransitionDrawable transitionDrawable = new TransitionDrawable(drawableArr);
                transitionDrawable.setCrossFadeEnabled(true);
                transitionDrawable.startTransition(200);
                ACj.setImageDrawable(transitionDrawable);
            } else {
                ACj.setImageBitmap(bitmap);
            }
            C109485Sh r0 = r72.A04;
            if (r0 != null) {
                r0.AYp();
            }
        }
    }
}
