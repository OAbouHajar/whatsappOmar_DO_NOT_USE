package X;

import androidx.window.sidecar.SidecarDisplayFeature;

/* renamed from: X.0in  reason: invalid class name and case insensitive filesystem */
public final class C11450in extends AnonymousClass1DR implements AnonymousClass22J {
    public C11450in() {
        super(1);
    }

    public static final Boolean A00(SidecarDisplayFeature sidecarDisplayFeature) {
        C18450wi.A0H(sidecarDisplayFeature, 0);
        boolean z2 = true;
        if (!(sidecarDisplayFeature.getType() == 1 || sidecarDisplayFeature.getType() == 2)) {
            z2 = false;
        }
        return Boolean.valueOf(z2);
    }

    public /* bridge */ /* synthetic */ Object AIU(Object obj) {
        return A00((SidecarDisplayFeature) obj);
    }
}
