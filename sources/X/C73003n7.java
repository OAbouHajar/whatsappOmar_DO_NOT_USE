package X;

import android.content.Context;
import android.view.TextureView;
import com.facebook.redex.IDxTListenerShape371S0100000_2_I1;

/* renamed from: X.3n7  reason: invalid class name and case insensitive filesystem */
public class C73003n7 extends AnonymousClass53K {
    public final TextureView.SurfaceTextureListener A00;
    public final TextureView A01;

    public C73003n7(TextureView textureView, boolean z2, boolean z3) {
        super("voip/video/TextureViewVideoPort/", z2, z3);
        IDxTListenerShape371S0100000_2_I1 iDxTListenerShape371S0100000_2_I1 = new IDxTListenerShape371S0100000_2_I1(this, 0);
        this.A00 = iDxTListenerShape371S0100000_2_I1;
        this.A01 = textureView;
        if (z2) {
            textureView.setOpaque(false);
        }
        textureView.setSurfaceTextureListener(iDxTListenerShape371S0100000_2_I1);
        A04();
    }

    public Context getContext() {
        return this.A01.getContext();
    }

    public void release() {
        this.A01.setSurfaceTextureListener((TextureView.SurfaceTextureListener) null);
        super.release();
    }
}
