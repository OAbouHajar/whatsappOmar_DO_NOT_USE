package X;

import android.view.View;
import com.obwhatsapp.mediaview.MediaViewFragment;

/* renamed from: X.4kZ  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C94224kZ implements View.OnSystemUiVisibilityChangeListener {
    public final /* synthetic */ MediaViewFragment A00;
    public final /* synthetic */ AnonymousClass29C A01;

    public /* synthetic */ C94224kZ(MediaViewFragment mediaViewFragment, AnonymousClass29C r2) {
        this.A00 = mediaViewFragment;
        this.A01 = r2;
    }

    public final void onSystemUiVisibilityChange(int i2) {
        MediaViewFragment mediaViewFragment = this.A00;
        if (this.A01.A0G) {
            mediaViewFragment.A1P(AnonymousClass000.A1P(i2 & 4), false);
        }
    }
}
