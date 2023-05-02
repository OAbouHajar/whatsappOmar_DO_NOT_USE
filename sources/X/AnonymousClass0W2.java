package X;

import androidx.window.sidecar.SidecarDeviceState;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X.0W2  reason: invalid class name */
public final class AnonymousClass0W2 {
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.List A00(androidx.window.sidecar.SidecarWindowLayoutInfo r2) {
        /*
            java.util.List r0 = r2.displayFeatures     // Catch:{ NoSuchFieldError -> 0x0009 }
            if (r0 != 0) goto L_0x0015
            java.util.List r0 = X.AnonymousClass1JA.A0P()     // Catch:{ NoSuchFieldError -> 0x0009 }
            return r0
        L_0x0009:
            java.lang.Class<androidx.window.sidecar.SidecarWindowLayoutInfo> r1 = androidx.window.sidecar.SidecarWindowLayoutInfo.class
            java.lang.String r0 = "getDisplayFeatures"
            java.lang.Object r0 = X.AnonymousClass000.A0X(r1, r2, r0)     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x001d }
            if (r0 == 0) goto L_0x0016
            java.util.List r0 = (java.util.List) r0     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x001d }
        L_0x0015:
            return r0
        L_0x0016:
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0W(r0)     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x001d }
            throw r0     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x001d }
        L_0x001d:
            java.util.List r0 = X.AnonymousClass1JA.A0P()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0W2.A00(androidx.window.sidecar.SidecarWindowLayoutInfo):java.util.List");
    }

    public static final void A01(SidecarDeviceState sidecarDeviceState, int i2) {
        try {
            sidecarDeviceState.posture = i2;
        } catch (NoSuchFieldError unused) {
            Class<SidecarDeviceState> cls = SidecarDeviceState.class;
            try {
                Method A0s = AnonymousClass000.A0s(cls, Integer.TYPE, "setPosture", new Class[1], 0);
                Object[] objArr = new Object[1];
                AnonymousClass000.A1M(objArr, i2, 0);
                A0s.invoke(sidecarDeviceState, objArr);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            }
        }
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A02(androidx.window.sidecar.SidecarDeviceState r3) {
        /*
            r2 = this;
            int r1 = r3.posture     // Catch:{ NoSuchFieldError -> 0x0003 }
            goto L_0x0011
        L_0x0003:
            java.lang.Class<androidx.window.sidecar.SidecarDeviceState> r1 = androidx.window.sidecar.SidecarDeviceState.class
            java.lang.String r0 = "getPosture"
            java.lang.Object r0 = X.AnonymousClass000.A0X(r1, r3, r0)     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x001f }
            if (r0 == 0) goto L_0x0018
            int r1 = X.AnonymousClass000.A0D(r0)     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x001f }
        L_0x0011:
            if (r1 < 0) goto L_0x0016
            r0 = 4
            if (r1 <= r0) goto L_0x0017
        L_0x0016:
            r1 = 0
        L_0x0017:
            return r1
        L_0x0018:
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Int"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0W(r0)     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x001f }
            throw r0     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x001f }
        L_0x001f:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0W2.A02(androidx.window.sidecar.SidecarDeviceState):int");
    }
}
