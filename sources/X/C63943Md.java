package X;

import android.content.Context;
import android.view.OrientationEventListener;

/* renamed from: X.3Md  reason: invalid class name and case insensitive filesystem */
public class C63943Md extends OrientationEventListener {
    public int A00;
    public final /* synthetic */ C49062Qp A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63943Md(Context context, C49062Qp r3) {
        super(context);
        this.A01 = r3;
        this.A00 = r3.A0U.getRotation();
    }

    public void enable() {
        super.enable();
        this.A00 = this.A01.A0U.getRotation();
    }

    public void onOrientationChanged(int i2) {
        int i3;
        C49062Qp r3 = this.A01;
        int rotation = r3.A0U.getRotation();
        if (!(rotation == -1 || rotation == (i3 = this.A00) || AnonymousClass000.A09(i3, rotation) % 2 != 0)) {
            r3.surfaceChanged(r3.A0V, 0, 0, 0);
        }
        this.A00 = rotation;
    }
}
