package X;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import com.facebook.redex.IDxCallableShape150S0100000_3_I1;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* renamed from: X.5vk  reason: invalid class name and case insensitive filesystem */
public class C118995vk {
    public Map A00 = Collections.emptyMap();
    public final CameraManager A01;
    public final C118945vf A02;
    public final C119355wx A03;
    public volatile C117175sZ[] A04 = null;

    public C118995vk(CameraManager cameraManager, C118945vf r3, C119355wx r4) {
        this.A01 = cameraManager;
        this.A03 = r4;
        this.A02 = r3;
    }

    public int A00(int i2) {
        try {
            return Integer.parseInt(A05(i2).A03);
        } catch (CameraAccessException unused) {
            AnonymousClass5xH.A01("CameraInventory", "Failed to load CameraInfo to obtain camera id");
            return 0;
        }
    }

    public int A01(int i2) {
        try {
            return A05(i2).A02;
        } catch (CameraAccessException unused) {
            throw AnonymousClass000.A0a("Could not get camera info, for orientation");
        }
    }

    public final int A02(int i2) {
        if (this.A04 == null) {
            A07();
        }
        if (!(this.A04 == null || this.A04.length == 0)) {
            for (int i3 = 0; i3 < this.A04.length; i3++) {
                if (this.A04[i3].A00 == i2) {
                    return i3;
                }
            }
            AnonymousClass5xH.A01("CameraInventory", C13680ns.A0c(i2, "Could not get CameraInfo for CameraFacing id: "));
        }
        return -1;
    }

    public int A03(int i2, int i3) {
        if (i3 != -1) {
            try {
                C117175sZ A05 = A05(i2);
                int i4 = ((i3 + 45) / 90) * 90;
                return A05.A01 == 0 ? ((A05.A02 - i4) + 360) % 360 : (A05.A02 + i4) % 360;
            } catch (CameraAccessException e2) {
                AnonymousClass5xH.A01("CameraInventory", AnonymousClass000.A0h(e2.getMessage(), AnonymousClass000.A0r("Failed to get info to calculate media rotation: ")));
            }
        }
        return 0;
    }

    public int A04(String str) {
        if (this.A04 == null) {
            A07();
        }
        for (C117175sZ r1 : this.A04) {
            if (r1.A03.equals(str)) {
                return r1.A00;
            }
        }
        AnonymousClass5xH.A01("CameraInventory", AnonymousClass000.A0h(str, AnonymousClass000.A0r("Failed to find camera facing for id: ")));
        return 0;
    }

    public final C117175sZ A05(int i2) {
        if (this.A04 == null) {
            A07();
        }
        int A022 = A02(i2);
        if (A022 != -1) {
            return this.A04[A022];
        }
        throw AnonymousClass000.A0T("Camera facing did not resolve to a camera info instance");
    }

    public String A06(int i2) {
        try {
            return A05(i2).A03;
        } catch (CameraAccessException e2) {
            throw new RuntimeException("Failed to get camera info", e2);
        }
    }

    public final void A07() {
        if (this.A04 == null) {
            C119355wx r2 = this.A03;
            if (r2.A09()) {
                A08();
                return;
            }
            try {
                r2.A01(new C111115fM(), new IDxCallableShape150S0100000_3_I1(this, 13)).get();
            } catch (InterruptedException | ExecutionException e2) {
                AnonymousClass5xH.A01("CameraInventory", AnonymousClass000.A0h(e2.getMessage(), AnonymousClass000.A0r("failed to load camera infos: ")));
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: X.5sZ[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A08() {
        /*
            r12 = this;
            android.hardware.camera2.CameraManager r10 = r12.A01
            java.lang.String[] r9 = r10.getCameraIdList()
            int r8 = r9.length
            java.util.HashMap r7 = X.AnonymousClass000.A0x()
            r11 = 0
            r6 = 0
        L_0x000d:
            if (r6 >= r8) goto L_0x0057
            r5 = r9[r6]
            android.hardware.camera2.CameraCharacteristics r1 = r10.getCameraCharacteristics(r5)
            android.hardware.camera2.CameraCharacteristics$Key r0 = android.hardware.camera2.CameraCharacteristics.LENS_FACING
            java.lang.Object r0 = r1.get(r0)
            int r4 = X.AnonymousClass000.A0D(r0)
            r0 = 1
            r3 = 0
            if (r4 == r0) goto L_0x0024
            r3 = 1
        L_0x0024:
            java.util.Map r0 = r12.A00
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            boolean r0 = r0.containsKey(r2)
            if (r0 == 0) goto L_0x003c
            java.util.Map r0 = r12.A00
            java.lang.String r0 = X.C13690nt.A0e(r2, r0)
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x0042
        L_0x003c:
            boolean r0 = r7.containsKey(r2)
            if (r0 != 0) goto L_0x0054
        L_0x0042:
            android.hardware.camera2.CameraCharacteristics$Key r0 = android.hardware.camera2.CameraCharacteristics.SENSOR_ORIENTATION
            java.lang.Object r0 = r1.get(r0)
            int r1 = X.AnonymousClass000.A0D(r0)
            X.5sZ r0 = new X.5sZ
            r0.<init>(r5, r3, r4, r1)
            r7.put(r2, r0)
        L_0x0054:
            int r6 = r6 + 1
            goto L_0x000d
        L_0x0057:
            int r0 = r7.size()
            X.5sZ[] r3 = new X.C117175sZ[r0]
            java.util.Iterator r2 = X.C13690nt.A0j(r7)
        L_0x0061:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0075
            java.util.Map$Entry r0 = X.AnonymousClass000.A0z(r2)
            java.lang.Object r1 = r0.getValue()
            int r0 = r11 + 1
            r3[r11] = r1
            r11 = r0
            goto L_0x0061
        L_0x0075:
            r12.A04 = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C118995vk.A08():void");
    }

    public boolean A09(Integer num) {
        if (this.A04 == null) {
            A07();
        }
        if (this.A04 == null) {
            AnonymousClass5xH.A01("CameraInventory", "Failed to detect camera, cameraInfos was null");
        } else {
            int i2 = 1;
            if (num.intValue() == 1) {
                i2 = 0;
            }
            if (A02(i2) != -1) {
                return true;
            }
        }
        return false;
    }
}
