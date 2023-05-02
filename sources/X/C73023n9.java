package X;

import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.facebook.redex.IDxCallbackShape335S0100000_2_I1;

/* renamed from: X.3n9  reason: invalid class name and case insensitive filesystem */
public class C73023n9 extends C87374Wn {
    public final SurfaceHolder.Callback A00 = new IDxCallbackShape335S0100000_2_I1(this, 1);
    public final SurfaceView A01;

    public C73023n9(SurfaceView surfaceView) {
        this.A01 = surfaceView;
        surfaceView.getHolder().setFormat(1);
    }
}
