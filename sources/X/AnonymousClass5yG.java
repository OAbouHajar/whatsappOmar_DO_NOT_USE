package X;

import android.graphics.Point;
import android.hardware.Camera;

/* renamed from: X.5yG  reason: invalid class name */
public class AnonymousClass5yG implements Camera.AutoFocusCallback {
    public final /* synthetic */ Point A00;
    public final /* synthetic */ AnonymousClass687 A01;
    public final /* synthetic */ C118525up A02;

    public AnonymousClass5yG(Point point, AnonymousClass687 r2, C118525up r3) {
        this.A02 = r3;
        this.A00 = point;
        this.A01 = r2;
    }

    public void onAutoFocus(boolean z2, Camera camera) {
        C118525up r3 = this.A02;
        r3.A07 = z2;
        r3.A08 = false;
        if (r3.A0A) {
            r3.A04 = false;
        }
        C114875ok r2 = z2 ? C114875ok.SUCCESS : C114875ok.FAILED;
        Point point = this.A00;
        r3.A00(point, r2, r3.A02);
        r3.A00(point, r2, this.A01);
    }
}
