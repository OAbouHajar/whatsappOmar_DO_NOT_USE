package X;

import android.hardware.camera2.CameraDevice;
import com.facebook.optic.IDxSCallbackShape43S0100000_3_I1;
import com.facebook.redex.IDxCallableShape150S0100000_3_I1;
import java.util.concurrent.ExecutionException;

/* renamed from: X.5td  reason: invalid class name and case insensitive filesystem */
public class C117835td {
    public final /* synthetic */ AnonymousClass5zD A00;

    public C117835td(AnonymousClass5zD r1) {
        this.A00 = r1;
    }

    public void A00(CameraDevice cameraDevice) {
        AnonymousClass5zD r5 = this.A00;
        if (r5.A0h == cameraDevice) {
            r5.A0n = false;
            r5.A0h = null;
            r5.A0E = null;
            r5.A0C = null;
            r5.A0D = null;
            r5.A05 = null;
            C119335wv r0 = r5.A09;
            if (r0 != null) {
                r0.A03();
            }
            r5.A0X.A0G = false;
            r5.A0V.A02();
            C119325wu r1 = r5.A0Z;
            if (r1.A0D && (!r5.A0p || r1.A0C)) {
                try {
                    r5.A0d.A00(new IDxSCallbackShape43S0100000_3_I1(this, 6), "on_camera_closed_stop_video_recording", new IDxCallableShape150S0100000_3_I1(this, 8)).get();
                } catch (InterruptedException | ExecutionException unused) {
                    AnonymousClass5xH.A00();
                }
            }
            AnonymousClass5xW r3 = r5.A0Y;
            if (r3.A09 != null) {
                synchronized (AnonymousClass5xW.A0S) {
                    AnonymousClass5zJ r12 = r3.A08;
                    if (r12 != null) {
                        r12.A0G = false;
                        r3.A08 = null;
                    }
                }
                try {
                    r3.A09.A02();
                    r3.A09.A03();
                } catch (Exception unused2) {
                }
                r3.A09 = null;
            }
            String id = cameraDevice.getId();
            C111145fP r13 = r5.A0T;
            if (id.equals(r13.A00)) {
                r13.A01();
                r13.A00 = null;
            }
        }
    }
}
