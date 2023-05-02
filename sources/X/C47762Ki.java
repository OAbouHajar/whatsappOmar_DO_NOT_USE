package X;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import com.obwhatsapp.backup.google.GoogleDriveRestoreAnimationView;

/* renamed from: X.2Ki  reason: invalid class name and case insensitive filesystem */
public class C47762Ki extends Animation {
    public final GoogleDriveRestoreAnimationView A00;

    public C47762Ki(GoogleDriveRestoreAnimationView googleDriveRestoreAnimationView) {
        this.A00 = googleDriveRestoreAnimationView;
    }

    public void applyTransformation(float f2, Transformation transformation) {
        GoogleDriveRestoreAnimationView googleDriveRestoreAnimationView = this.A00;
        googleDriveRestoreAnimationView.A00 = f2;
        googleDriveRestoreAnimationView.invalidate();
    }
}
