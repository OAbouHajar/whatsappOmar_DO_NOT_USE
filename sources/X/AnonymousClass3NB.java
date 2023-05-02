package X;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.obwhatsapp.R;
import com.whatsapp.voipcalling.VoipCallControlBottomSheetV2;

/* renamed from: X.3NB  reason: invalid class name */
public class AnonymousClass3NB extends ViewOutlineProvider {
    public final /* synthetic */ VoipCallControlBottomSheetV2 A00;

    public AnonymousClass3NB(VoipCallControlBottomSheetV2 voipCallControlBottomSheetV2) {
        this.A00 = voipCallControlBottomSheetV2;
    }

    public void getOutline(View view, Outline outline) {
        float dimension = C13680ns.A0D(this.A00.A07).getDimension(R.dimen.dimen0104);
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight() + ((int) dimension), dimension);
    }
}
