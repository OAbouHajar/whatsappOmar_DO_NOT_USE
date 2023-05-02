package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import com.obwhatsapp.R;

/* renamed from: X.06z  reason: invalid class name */
public class AnonymousClass06z extends ImageButton implements AnonymousClass015, C006102p {
    public final AnonymousClass08Q A00;
    public final C018108m A01;

    public AnonymousClass06z(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.attr02d0);
    }

    public AnonymousClass06z(Context context, AttributeSet attributeSet, int i2) {
        super(AnonymousClass08O.A00(context), attributeSet, i2);
        AnonymousClass08P.A03(getContext(), this);
        AnonymousClass08Q r0 = new AnonymousClass08Q(this);
        this.A00 = r0;
        r0.A05(attributeSet, i2);
        C018108m r02 = new C018108m(this);
        this.A01 = r02;
        r02.A02(attributeSet, i2);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        AnonymousClass08Q r0 = this.A00;
        if (r0 != null) {
            r0.A00();
        }
        C018108m r02 = this.A01;
        if (r02 != null) {
            r02.A00();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        AnonymousClass08Y r0;
        AnonymousClass08Q r02 = this.A00;
        if (r02 == null || (r0 = r02.A01) == null) {
            return null;
        }
        return r0.A00;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        AnonymousClass08Y r0;
        AnonymousClass08Q r02 = this.A00;
        if (r02 == null || (r0 = r02.A01) == null) {
            return null;
        }
        return r0.A01;
    }

    public ColorStateList getSupportImageTintList() {
        AnonymousClass08Y r0;
        C018108m r02 = this.A01;
        if (r02 == null || (r0 = r02.A00) == null) {
            return null;
        }
        return r0.A00;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        AnonymousClass08Y r0;
        C018108m r02 = this.A01;
        if (r02 == null || (r0 = r02.A00) == null) {
            return null;
        }
        return r0.A01;
    }

    public boolean hasOverlappingRendering() {
        return this.A01.A03() && super.hasOverlappingRendering();
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        AnonymousClass08Q r0 = this.A00;
        if (r0 != null) {
            r0.A01();
        }
    }

    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        AnonymousClass08Q r0 = this.A00;
        if (r0 != null) {
            r0.A02(i2);
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C018108m r0 = this.A01;
        if (r0 != null) {
            r0.A00();
        }
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        C018108m r0 = this.A01;
        if (r0 != null) {
            r0.A00();
        }
    }

    public void setImageResource(int i2) {
        this.A01.A01(i2);
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C018108m r0 = this.A01;
        if (r0 != null) {
            r0.A00();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        AnonymousClass08Q r0 = this.A00;
        if (r0 != null) {
            r0.A03(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        AnonymousClass08Q r0 = this.A00;
        if (r0 != null) {
            r0.A04(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        C018108m r2 = this.A01;
        if (r2 != null) {
            AnonymousClass08Y r1 = r2.A00;
            if (r1 == null) {
                r1 = new AnonymousClass08Y();
                r2.A00 = r1;
            }
            r1.A00 = colorStateList;
            r1.A02 = true;
            r2.A00();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C018108m r2 = this.A01;
        if (r2 != null) {
            AnonymousClass08Y r1 = r2.A00;
            if (r1 == null) {
                r1 = new AnonymousClass08Y();
                r2.A00 = r1;
            }
            r1.A01 = mode;
            r1.A03 = true;
            r2.A00();
        }
    }
}
