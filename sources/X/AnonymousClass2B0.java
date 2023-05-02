package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.obwhatsapp.R;
import com.obwhatsapp.status.playback.widget.AudioVolumeView;
import com.obwhatsapp.status.playback.widget.StatusPlaybackProgressView;

/* renamed from: X.2B0  reason: invalid class name */
public class AnonymousClass2B0 {
    public Button A00;
    public final View A01;
    public final View A02;
    public final View A03;
    public final View A04;
    public final View A05;
    public final View A06;
    public final ViewGroup A07;
    public final ViewStub A08;
    public final FrameLayout A09;
    public final ImageView A0A;
    public final ImageView A0B;
    public final TextView A0C;
    public final AudioVolumeView A0D;
    public final StatusPlaybackProgressView A0E;

    public AnonymousClass2B0(View view) {
        this.A09 = (FrameLayout) C004601z.A0E(view, R.id.root_view);
        this.A0E = (StatusPlaybackProgressView) C004601z.A0E(view, R.id.playback_progress);
        this.A07 = (ViewGroup) C004601z.A0E(view, R.id.status_container);
        this.A0D = (AudioVolumeView) C004601z.A0E(view, R.id.volume);
        this.A0A = (ImageView) C004601z.A0E(view, R.id.back);
        this.A0C = (TextView) C004601z.A0E(view, R.id.date);
        this.A06 = C004601z.A0E(view, R.id.title_bar);
        this.A05 = C004601z.A0E(view, R.id.title_protection);
        this.A01 = C004601z.A0E(view, R.id.header);
        this.A04 = C004601z.A0E(view, R.id.status_header);
        this.A03 = C004601z.A0E(view, R.id.menu);
        this.A02 = C004601z.A0E(view, R.id.progress);
        this.A0B = (ImageView) C004601z.A0E(view, R.id.profile_picture);
        ViewStub viewStub = (ViewStub) C004601z.A0E(view, R.id.action_link_button_view_stub);
        this.A08 = viewStub;
        viewStub.setVisibility(8);
    }
}
