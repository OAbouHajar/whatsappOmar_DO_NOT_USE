package X;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ProgressBar;

/* renamed from: X.47k  reason: invalid class name and case insensitive filesystem */
public class C812447k {
    public static void A00(ProgressBar progressBar, int i2) {
        if (progressBar != null && Build.VERSION.SDK_INT < 21) {
            Drawable indeterminateDrawable = progressBar.getIndeterminateDrawable();
            if (indeterminateDrawable != null) {
                indeterminateDrawable.setColorFilter(i2, PorterDuff.Mode.MULTIPLY);
                progressBar.setIndeterminateDrawable(indeterminateDrawable);
            }
            Drawable progressDrawable = progressBar.getProgressDrawable();
            if (progressDrawable != null) {
                progressDrawable.setColorFilter(i2, PorterDuff.Mode.MULTIPLY);
                progressBar.setProgressDrawable(progressDrawable);
            }
        }
    }
}
