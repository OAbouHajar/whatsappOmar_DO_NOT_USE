package X;

import android.content.Context;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.facebook.redex.IDxCallbackShape335S0100000_2_I1;

/* renamed from: X.3n8  reason: invalid class name and case insensitive filesystem */
public final class C73013n8 extends AnonymousClass53K {
    public final SurfaceHolder.Callback A00;
    public final SurfaceView A01;

    public C73013n8(SurfaceView surfaceView, boolean z2, boolean z3) {
        super("voip/VideoPort/SurfaceViewVideoPort/", z2, z3);
        IDxCallbackShape335S0100000_2_I1 iDxCallbackShape335S0100000_2_I1 = new IDxCallbackShape335S0100000_2_I1(this, 0);
        this.A00 = iDxCallbackShape335S0100000_2_I1;
        this.A01 = surfaceView;
        SurfaceHolder holder = surfaceView.getHolder();
        if (z2) {
            holder.setFormat(1);
        }
        holder.addCallback(iDxCallbackShape335S0100000_2_I1);
        A04();
    }

    public Context getContext() {
        return this.A01.getContext();
    }

    public void release() {
        this.A01.getHolder().removeCallback(this.A00);
        super.release();
    }
}
