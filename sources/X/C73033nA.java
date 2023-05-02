package X;

import android.view.TextureView;
import com.facebook.redex.IDxTListenerShape371S0100000_2_I1;

/* renamed from: X.3nA  reason: invalid class name and case insensitive filesystem */
public class C73033nA extends C87374Wn {
    public final TextureView.SurfaceTextureListener A00 = new IDxTListenerShape371S0100000_2_I1(this, 1);
    public final TextureView A01;

    public C73033nA(TextureView textureView) {
        this.A01 = textureView;
        textureView.setOpaque(false);
    }
}
