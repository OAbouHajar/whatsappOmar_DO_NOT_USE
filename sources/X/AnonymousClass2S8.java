package X;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.redex.RunnableRunnableShape19S0100000_I1_2;
import com.obwhatsapp.R;
import com.obwhatsapp.mediacomposer.MediaComposerActivity;

/* renamed from: X.2S8  reason: invalid class name */
public class AnonymousClass2S8 {
    public float A00;
    public float A01;
    public Drawable A02;
    public Drawable A03;
    public Uri A04;
    public View A05;
    public View A06;
    public ViewGroup A07;
    public ViewGroup A08;
    public ImageView A09;
    public TextView A0A;
    public boolean A0B;
    public final Handler A0C = new Handler(Looper.getMainLooper());
    public final Runnable A0D = new RunnableRunnableShape19S0100000_I1_2(this, 0);
    public final int[] A0E = new int[2];
    public final /* synthetic */ MediaComposerActivity A0F;

    public AnonymousClass2S8(Activity activity, MediaComposerActivity mediaComposerActivity, boolean z2) {
        this.A0F = mediaComposerActivity;
        this.A03 = AnonymousClass00T.A04(activity, R.drawable.ic_remove_white);
        this.A02 = AnonymousClass00T.A04(activity, R.drawable.ic_remove_red);
        this.A08 = (ViewGroup) activity.findViewById(R.id.remove_frame);
        this.A0A = (TextView) activity.findViewById(R.id.drag_remove);
        this.A05 = activity.findViewById(R.id.drag_remove_padding);
        this.A07 = (ViewGroup) activity.findViewById(R.id.drag_frame);
        AnonymousClass2pm r1 = new AnonymousClass2pm(activity, this, z2);
        this.A09 = r1;
        r1.setSelected(true);
        this.A09.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.A07.addView(this.A09);
    }
}
