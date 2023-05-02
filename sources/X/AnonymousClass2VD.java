package X;

import android.graphics.Paint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.obwhatsapp.R;
import com.obwhatsapp.camera.overlays.AutofocusOverlay;
import com.obwhatsapp.camera.overlays.ShutterOverlay;
import com.obwhatsapp.camera.overlays.ZoomOverlay;

/* renamed from: X.2VD  reason: invalid class name */
public class AnonymousClass2VD {
    public boolean A00;
    public final View A01;
    public final AnonymousClass2Qt A02;
    public final AutofocusOverlay A03;
    public final ShutterOverlay A04;
    public final ZoomOverlay A05;

    public AnonymousClass2VD(ViewGroup viewGroup, AnonymousClass2Qt r6, boolean z2) {
        this.A02 = r6;
        this.A01 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout00e8, viewGroup, true);
        this.A00 = z2;
        AutofocusOverlay autofocusOverlay = (AutofocusOverlay) C004601z.A0E(viewGroup, R.id.autofocus_overlay);
        this.A03 = autofocusOverlay;
        this.A05 = (ZoomOverlay) C004601z.A0E(viewGroup, R.id.zoom_overlay);
        ShutterOverlay shutterOverlay = (ShutterOverlay) C004601z.A0E(viewGroup, R.id.shutter_overlay);
        this.A04 = shutterOverlay;
        if (z2) {
            Paint paint = shutterOverlay.A03;
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(-16777216);
        }
        autofocusOverlay.A05 = z2;
        if (z2) {
            autofocusOverlay.A06.setStrokeWidth(autofocusOverlay.getResources().getDimension(R.dimen.dimen0092));
            autofocusOverlay.A00 = autofocusOverlay.getResources().getDimension(R.dimen.dimen0090);
        }
    }
}
