package X;

import android.view.View;
import com.obwhatsapp.videoplayback.VideoSurfaceView;

/* renamed from: X.5yi  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C119585yi implements View.OnClickListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ VideoSurfaceView A01;

    public /* synthetic */ C119585yi(View view, VideoSurfaceView videoSurfaceView) {
        this.A00 = view;
        this.A01 = videoSurfaceView;
    }

    public final void onClick(View view) {
        View view2 = this.A00;
        VideoSurfaceView videoSurfaceView = this.A01;
        view2.setVisibility(8);
        if (!videoSurfaceView.isPlaying()) {
            videoSurfaceView.start();
        }
    }
}
