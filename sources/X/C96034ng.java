package X;

import android.content.Context;
import android.view.View;
import org.wawebrtc.MediaCodecVideoEncoder;

/* renamed from: X.4ng  reason: invalid class name and case insensitive filesystem */
public class C96034ng implements AnonymousClass5SJ {
    public final /* synthetic */ C31201dg A00;

    public C96034ng(C31201dg r1) {
        this.A00 = r1;
    }

    public /* bridge */ /* synthetic */ void A5M(Context context, Object obj, Object obj2, Object obj3) {
        View view = (View) obj;
        C31201dg r3 = this.A00;
        view.setScaleX(r3.A08(136, 1.0f));
        view.setScaleY(r3.A08(137, 1.0f));
        view.setTranslationX(r3.A08(MediaCodecVideoEncoder.MIN_ENCODER_HEIGHT, 0.0f));
        view.setTranslationY(r3.A08(145, 0.0f));
        view.setRotation(r3.A08(138, 0.0f));
        view.setAlpha(r3.A08(141, 1.0f));
    }

    public /* bridge */ /* synthetic */ boolean AfR(Object obj, Object obj2, Object obj3, Object obj4) {
        return true;
    }

    public /* bridge */ /* synthetic */ void Ah6(Context context, Object obj, Object obj2, Object obj3) {
        View view = (View) obj;
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        view.setRotation(0.0f);
        view.setAlpha(1.0f);
    }
}
