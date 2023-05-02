package X;

import android.graphics.Path;
import android.os.Build;
import android.view.ViewTreeObserver;
import com.obwhatsapp.WaRoundCornerImageView;

/* renamed from: X.4kg  reason: invalid class name and case insensitive filesystem */
public class C94294kg implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ WaRoundCornerImageView A00;

    public C94294kg(WaRoundCornerImageView waRoundCornerImageView) {
        this.A00 = waRoundCornerImageView;
    }

    public void onGlobalLayout() {
        if (Build.VERSION.SDK_INT >= 21) {
            WaRoundCornerImageView waRoundCornerImageView = this.A00;
            Path path = new Path();
            waRoundCornerImageView.A01 = path;
            float f2 = waRoundCornerImageView.A00;
            path.addRoundRect((float) (waRoundCornerImageView.getLeft() + waRoundCornerImageView.getPaddingLeft()), (float) (waRoundCornerImageView.getTop() + waRoundCornerImageView.getPaddingTop()), (float) (waRoundCornerImageView.getRight() - waRoundCornerImageView.getPaddingRight()), (float) (waRoundCornerImageView.getBottom() - waRoundCornerImageView.getPaddingBottom()), f2, f2, Path.Direction.CCW);
        }
    }
}
