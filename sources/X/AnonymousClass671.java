package X;

import android.hardware.camera2.CameraManager;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: X.671  reason: invalid class name */
public class AnonymousClass671 implements Callable {
    public final /* synthetic */ AnonymousClass5zD A00;
    public final /* synthetic */ C117775tX A01;

    public AnonymousClass671(AnonymousClass5zD r1, C117775tX r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public /* bridge */ /* synthetic */ Object call() {
        AnonymousClass5zJ r3;
        AnonymousClass5zD r2 = this.A00;
        if (r2.A0C == null || r2.A06 == null || r2.A0h == null || r2.A0E == null) {
            throw AnonymousClass000.A0V("Cannot modify settings, camera was closed.");
        }
        C111185fT r0 = r2.A0C;
        C115835qO r4 = AnonymousClass5wI.A0J;
        boolean A1X = AnonymousClass000.A1X(r0.A05(r4));
        C111185fT r02 = r2.A0C;
        C115835qO r32 = AnonymousClass5wI.A02;
        HashMap hashMap = new HashMap((Map) r02.A05(r32));
        if (r2.A0C.A07(this.A01)) {
            AnonymousClass5xW r1 = r2.A0Y;
            if (r1.A0Q) {
                if (r2.A0A != null) {
                    boolean A1X2 = AnonymousClass000.A1X(r2.A0C.A05(r4));
                    HashMap hashMap2 = new HashMap((Map) r2.A0C.A05(r32));
                    if (A1X == A1X2) {
                        if (A1X && A1X2 && !hashMap2.equals(hashMap)) {
                            r2.A0E(true);
                            AnonymousClass5zD.A08(r2, r2.A0h.getId());
                        }
                    }
                }
                r2.A0m = AnonymousClass000.A1X(r2.A0C.A05(AnonymousClass5wI.A0R));
                if (AnonymousClass000.A1X(r2.A0C.A05(AnonymousClass5wI.A0N)) && r2.A0j != null) {
                    r2.A0V.A0A(r2.A0j);
                }
                r1.A07();
                C119375wz.A02(r2.A06, r2.A0C, r2.A0E, 0);
                C119375wz.A02(r2.A06, r2.A0C, r2.A0E, 1);
                C119375wz.A02(r2.A06, r2.A0C, r2.A0E, 2);
                C119375wz.A02(r2.A06, r2.A0C, r2.A0E, 3);
                C119375wz.A02(r2.A06, r2.A0C, r2.A0E, 4);
                C119375wz.A02(r2.A06, r2.A0C, r2.A0E, 5);
                C119375wz.A02(r2.A06, r2.A0C, r2.A0E, 6);
                C119375wz.A02(r2.A06, r2.A0C, r2.A0E, 7);
                C119375wz.A02(r2.A06, r2.A0C, r2.A0E, 8);
                C119375wz.A02(r2.A06, r2.A0C, r2.A0E, 9);
                C119375wz.A02(r2.A06, r2.A0C, r2.A0E, 10);
                C119375wz.A02(r2.A06, r2.A0C, r2.A0E, 11);
                C119375wz.A02(r2.A06, r2.A0C, r2.A0E, 12);
                C119375wz.A02(r2.A06, r2.A0C, r2.A0E, 13);
                C119375wz.A02(r2.A06, r2.A0C, r2.A0E, 14);
                C119375wz.A02(r2.A06, r2.A0C, r2.A0E, 15);
                CameraManager A012 = r2.A0N;
                C119375wz.A00(A012, r2.A06, r2.A0C, r2.A0E, r2.A0h.getId(), 0);
                C119375wz.A00(A012, r2.A06, r2.A0C, r2.A0E, r2.A0h.getId(), 1);
                if (AnonymousClass5wJ.A02(AnonymousClass5wJ.A0B, r2.A0E)) {
                    r2.A0C.A05(AnonymousClass5wI.A0h);
                }
                C111185fT r42 = r1.A0C;
                if (!(r42 == null || (r3 = r1.A08) == null)) {
                    r3.A0F = AnonymousClass000.A1X(r42.A05(AnonymousClass5wI.A0P));
                }
                r1.A05();
            }
        }
        return r2.A0C;
    }
}
