package X;

import android.view.MotionEvent;
import com.obwhatsapp.InteractiveAnnotation;
import com.obwhatsapp.mediaview.MediaViewFragment;
import com.obwhatsapp.mediaview.PhotoView;

/* renamed from: X.3ux  reason: invalid class name and case insensitive filesystem */
public class C76933ux extends C94264kd {
    public final /* synthetic */ MediaViewFragment A00;
    public final /* synthetic */ PhotoView A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C76933ux(MediaViewFragment mediaViewFragment, PhotoView photoView, PhotoView photoView2, C16730tY r4) {
        super(photoView, r4);
        this.A00 = mediaViewFragment;
        this.A01 = photoView2;
    }

    public void A00(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 1) {
            MediaViewFragment mediaViewFragment = this.A00;
            mediaViewFragment.A1P(true ^ mediaViewFragment.A0G, true);
        }
    }

    public void A01(InteractiveAnnotation interactiveAnnotation) {
        MediaViewFragment.A04(interactiveAnnotation, this.A00, this.A01);
    }
}
