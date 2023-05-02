package X;

import android.content.res.AssetManager;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.Map;

/* renamed from: X.0Ow  reason: invalid class name and case insensitive filesystem */
public class C05010Ow {
    public C03980Kq A00 = null;
    public final AssetManager A01;
    public final AnonymousClass0R7 A02 = new AnonymousClass0R7();
    public final Map A03 = AnonymousClass000.A0x();
    public final Map A04 = AnonymousClass000.A0x();

    public C05010Ow(Drawable.Callback callback) {
        AssetManager assets;
        if (!(callback instanceof View)) {
            C05770Sy.A00("LottieDrawable must be inside of a view for images to work.");
            assets = null;
        } else {
            assets = ((View) callback).getContext().getAssets();
        }
        this.A01 = assets;
    }
}
