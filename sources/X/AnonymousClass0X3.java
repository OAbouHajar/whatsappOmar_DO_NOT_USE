package X;

import android.graphics.Rect;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0X3  reason: invalid class name */
public final class AnonymousClass0X3 {
    public static final AnonymousClass0W2 A01 = new AnonymousClass0W2();
    public final C03670Jk A00;

    public AnonymousClass0X3() {
        this(C03670Jk.QUIET);
    }

    public AnonymousClass0X3(C03670Jk r2) {
        C18450wi.A0H(r2, 1);
        this.A00 = r2;
    }

    public static final AnonymousClass0Q6 A00(C12550ka r1, C03670Jk r2, Object obj) {
        C18450wi.A0H(r2, 2);
        return new AnonymousClass0GY(r1, r2, obj);
    }

    public static final boolean A01(SidecarDeviceState sidecarDeviceState, SidecarDeviceState sidecarDeviceState2) {
        if (C18450wi.A0R(sidecarDeviceState, sidecarDeviceState2)) {
            return true;
        }
        if (sidecarDeviceState == null) {
            return false;
        }
        AnonymousClass0W2 r0 = A01;
        return r0.A02(sidecarDeviceState) == r0.A02(sidecarDeviceState2);
    }

    public static final boolean A02(SidecarDisplayFeature sidecarDisplayFeature, SidecarDisplayFeature sidecarDisplayFeature2) {
        if (C18450wi.A0R(sidecarDisplayFeature, sidecarDisplayFeature2)) {
            return true;
        }
        if (sidecarDisplayFeature == null || sidecarDisplayFeature2 == null || sidecarDisplayFeature.getType() != sidecarDisplayFeature2.getType()) {
            return false;
        }
        return C18450wi.A0R(sidecarDisplayFeature.getRect(), sidecarDisplayFeature2.getRect());
    }

    public final C12020ji A03(SidecarDeviceState sidecarDeviceState, SidecarDisplayFeature sidecarDisplayFeature) {
        AnonymousClass0UQ r3;
        AnonymousClass0UP r2;
        C18450wi.A0H(sidecarDisplayFeature, 0);
        SidecarDisplayFeature sidecarDisplayFeature2 = (SidecarDisplayFeature) A00(new C07880ce(), this.A00, sidecarDisplayFeature).A00("Type must be either TYPE_FOLD or TYPE_HINGE", new C11450in()).A00("Feature bounds must not be 0", new C11460io()).A00("TYPE_FOLD must have 0 area", new C11470ip()).A00("Feature be pinned to either left or top", new C11480iq()).A01();
        if (sidecarDisplayFeature2 != null) {
            int type = sidecarDisplayFeature2.getType();
            if (type == 1) {
                r3 = AnonymousClass0UQ.A01;
            } else if (type == 2) {
                r3 = AnonymousClass0UQ.A02;
            }
            int A02 = A01.A02(sidecarDeviceState);
            if (A02 == 0 || A02 == 1) {
                return null;
            }
            if (A02 == 2) {
                r2 = AnonymousClass0UP.A02;
            } else if (A02 != 3) {
                return null;
            } else {
                r2 = AnonymousClass0UP.A01;
            }
            Rect rect = sidecarDisplayFeature.getRect();
            C18450wi.A0B(rect);
            return new C07950cl(new AnonymousClass0RQ(rect), r2, r3);
        }
        return null;
    }

    public final C05370Qr A04(SidecarDeviceState sidecarDeviceState, SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
        List A05;
        if (sidecarWindowLayoutInfo == null) {
            A05 = AnonymousClass1JA.A0P();
        } else {
            SidecarDeviceState sidecarDeviceState2 = new SidecarDeviceState();
            AnonymousClass0W2.A01(sidecarDeviceState2, A01.A02(sidecarDeviceState));
            A05 = A05(sidecarDeviceState2, AnonymousClass0W2.A00(sidecarWindowLayoutInfo));
        }
        return new C05370Qr(A05);
    }

    public final List A05(SidecarDeviceState sidecarDeviceState, List list) {
        C18450wi.A0H(list, 0);
        ArrayList A0u = AnonymousClass000.A0u();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C12020ji A03 = A03(sidecarDeviceState, (SidecarDisplayFeature) it.next());
            if (A03 != null) {
                A0u.add(A03);
            }
        }
        return A0u;
    }

    public final boolean A06(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarWindowLayoutInfo sidecarWindowLayoutInfo2) {
        if (C18450wi.A0R(sidecarWindowLayoutInfo, sidecarWindowLayoutInfo2)) {
            return true;
        }
        if (sidecarWindowLayoutInfo == null) {
            return false;
        }
        List A002 = AnonymousClass0W2.A00(sidecarWindowLayoutInfo);
        List A003 = AnonymousClass0W2.A00(sidecarWindowLayoutInfo2);
        if (A002 == A003) {
            return true;
        }
        if (A002 == null || A003 == null || A002.size() != A003.size()) {
            return false;
        }
        int size = A002.size();
        int i2 = 0;
        while (i2 < size) {
            boolean A02 = A02((SidecarDisplayFeature) A002.get(i2), (SidecarDisplayFeature) A003.get(i2));
            i2++;
            if (!A02) {
                return false;
            }
        }
        return true;
    }
}
