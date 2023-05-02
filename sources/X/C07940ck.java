package X;

import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.os.IBinder;
import androidx.window.layout.SidecarCompat$DistinctSidecarElementCallback;
import androidx.window.layout.SidecarCompat$TranslatingCallback;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarProvider;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.0ck  reason: invalid class name and case insensitive filesystem */
public final class C07940ck implements C13090lS {
    public C12560kb A00;
    public final AnonymousClass0X3 A01;
    public final SidecarInterface A02;
    public final Map A03 = new LinkedHashMap();
    public final Map A04 = new LinkedHashMap();

    public C07940ck(Context context) {
        SidecarInterface sidecarImpl = SidecarProvider.getSidecarImpl(context.getApplicationContext());
        AnonymousClass0X3 r0 = new AnonymousClass0X3(C03670Jk.QUIET);
        this.A02 = sidecarImpl;
        this.A01 = r0;
    }

    public final C05370Qr A00(Activity activity) {
        SidecarDeviceState sidecarDeviceState;
        IBinder A002 = AnonymousClass0MG.A00(activity);
        if (A002 == null) {
            return new C05370Qr(AnonymousClass1JA.A0P());
        }
        SidecarInterface sidecarInterface = this.A02;
        SidecarWindowLayoutInfo sidecarWindowLayoutInfo = null;
        if (sidecarInterface != null) {
            sidecarWindowLayoutInfo = sidecarInterface.getWindowLayoutInfo(A002);
        }
        AnonymousClass0X3 r1 = this.A01;
        if (sidecarInterface == null || (sidecarDeviceState = sidecarInterface.getDeviceState()) == null) {
            sidecarDeviceState = new SidecarDeviceState();
        }
        return r1.A04(sidecarDeviceState, sidecarWindowLayoutInfo);
    }

    public final SidecarInterface A01() {
        return this.A02;
    }

    public final void A02(Activity activity, IBinder iBinder) {
        Map map = this.A04;
        map.put(iBinder, activity);
        SidecarInterface sidecarInterface = this.A02;
        if (sidecarInterface != null) {
            sidecarInterface.onWindowLayoutChangeListenerAdded(iBinder);
        }
        if (map.size() == 1 && sidecarInterface != null) {
            sidecarInterface.onDeviceStateListenersChanged(false);
        }
        C12560kb r1 = this.A00;
        if (r1 != null) {
            r1.AZo(activity, A00(activity));
        }
        Map map2 = this.A03;
        if (map2.get(activity) == null) {
            AnonymousClass0Xe r0 = new AnonymousClass0Xe(activity, this);
            map2.put(activity, r0);
            activity.registerComponentCallbacks(r0);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000d, code lost:
        r0 = X.AnonymousClass000.A0s((r3 = r6.getClass()), androidx.window.sidecar.SidecarInterface.SidecarCallback.class, "setSidecarCallback", new java.lang.Class[1], 0);
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0051 A[Catch:{ NoSuchFieldError -> 0x009d, all -> 0x011b }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00f7 A[Catch:{ NoSuchFieldError -> 0x009d, all -> 0x011b }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A03() {
        /*
            r8 = this;
            r5 = 1
            r7 = 0
            androidx.window.sidecar.SidecarInterface r6 = r8.A02     // Catch:{ all -> 0x011b }
            r4 = 0
            if (r6 == 0) goto L_0x0026
            java.lang.Class r3 = r6.getClass()     // Catch:{ all -> 0x011b }
            if (r3 == 0) goto L_0x0026
            java.lang.String r2 = "setSidecarCallback"
            java.lang.Class[] r1 = new java.lang.Class[r5]     // Catch:{ all -> 0x011b }
            java.lang.Class<androidx.window.sidecar.SidecarInterface$SidecarCallback> r0 = androidx.window.sidecar.SidecarInterface.SidecarCallback.class
            java.lang.reflect.Method r0 = X.AnonymousClass000.A0s(r3, r0, r2, r1, r7)     // Catch:{ all -> 0x011b }
            if (r0 == 0) goto L_0x0026
            java.lang.Class r1 = r0.getReturnType()     // Catch:{ all -> 0x011b }
        L_0x001d:
            java.lang.Class r0 = java.lang.Void.TYPE     // Catch:{ all -> 0x011b }
            boolean r0 = X.C18450wi.A0R(r1, r0)     // Catch:{ all -> 0x011b }
            if (r0 == 0) goto L_0x0103
            goto L_0x0028
        L_0x0026:
            r1 = r4
            goto L_0x001d
        L_0x0028:
            if (r6 == 0) goto L_0x002b
            goto L_0x002d
        L_0x002b:
            r1 = r4
            goto L_0x0049
        L_0x002d:
            r6.getDeviceState()     // Catch:{ all -> 0x011b }
            r6.onDeviceStateListenersChanged(r5)     // Catch:{ all -> 0x011b }
            java.lang.Class r3 = r6.getClass()     // Catch:{ all -> 0x011b }
            if (r3 == 0) goto L_0x002b
            java.lang.String r2 = "getWindowLayoutInfo"
            java.lang.Class[] r1 = new java.lang.Class[r5]     // Catch:{ all -> 0x011b }
            java.lang.Class<android.os.IBinder> r0 = android.os.IBinder.class
            java.lang.reflect.Method r0 = X.AnonymousClass000.A0s(r3, r0, r2, r1, r7)     // Catch:{ all -> 0x011b }
            if (r0 == 0) goto L_0x002b
            java.lang.Class r1 = r0.getReturnType()     // Catch:{ all -> 0x011b }
        L_0x0049:
            java.lang.Class<androidx.window.sidecar.SidecarWindowLayoutInfo> r0 = androidx.window.sidecar.SidecarWindowLayoutInfo.class
            boolean r0 = X.C18450wi.A0R(r1, r0)     // Catch:{ all -> 0x011b }
            if (r0 == 0) goto L_0x00f7
            if (r6 == 0) goto L_0x0054
            goto L_0x0056
        L_0x0054:
            r1 = r4
            goto L_0x006c
        L_0x0056:
            java.lang.Class r3 = r6.getClass()     // Catch:{ all -> 0x011b }
            if (r3 == 0) goto L_0x0054
            java.lang.String r2 = "onWindowLayoutChangeListenerAdded"
            java.lang.Class[] r1 = new java.lang.Class[r5]     // Catch:{ all -> 0x011b }
            java.lang.Class<android.os.IBinder> r0 = android.os.IBinder.class
            java.lang.reflect.Method r0 = X.AnonymousClass000.A0s(r3, r0, r2, r1, r7)     // Catch:{ all -> 0x011b }
            if (r0 == 0) goto L_0x0054
            java.lang.Class r1 = r0.getReturnType()     // Catch:{ all -> 0x011b }
        L_0x006c:
            java.lang.Class r0 = java.lang.Void.TYPE     // Catch:{ all -> 0x011b }
            boolean r0 = X.C18450wi.A0R(r1, r0)     // Catch:{ all -> 0x011b }
            if (r0 == 0) goto L_0x00eb
            if (r6 == 0) goto L_0x008c
            java.lang.Class r3 = r6.getClass()     // Catch:{ all -> 0x011b }
            if (r3 == 0) goto L_0x008c
            java.lang.String r2 = "onWindowLayoutChangeListenerRemoved"
            java.lang.Class[] r1 = new java.lang.Class[r5]     // Catch:{ all -> 0x011b }
            java.lang.Class<android.os.IBinder> r0 = android.os.IBinder.class
            java.lang.reflect.Method r0 = X.AnonymousClass000.A0s(r3, r0, r2, r1, r7)     // Catch:{ all -> 0x011b }
            if (r0 == 0) goto L_0x008c
            java.lang.Class r4 = r0.getReturnType()     // Catch:{ all -> 0x011b }
        L_0x008c:
            java.lang.Class r0 = java.lang.Void.TYPE     // Catch:{ all -> 0x011b }
            boolean r0 = X.C18450wi.A0R(r4, r0)     // Catch:{ all -> 0x011b }
            if (r0 == 0) goto L_0x010f
            androidx.window.sidecar.SidecarDeviceState r6 = new androidx.window.sidecar.SidecarDeviceState     // Catch:{ all -> 0x011b }
            r6.<init>()     // Catch:{ all -> 0x011b }
            r4 = 3
            r6.posture = r4     // Catch:{ NoSuchFieldError -> 0x009d }
            goto L_0x00c9
        L_0x009d:
            java.lang.Class<androidx.window.sidecar.SidecarDeviceState> r3 = androidx.window.sidecar.SidecarDeviceState.class
            java.lang.String r2 = "setPosture"
            java.lang.Class[] r1 = new java.lang.Class[r5]     // Catch:{ all -> 0x011b }
            java.lang.Class r0 = java.lang.Integer.TYPE     // Catch:{ all -> 0x011b }
            java.lang.reflect.Method r1 = X.AnonymousClass000.A0s(r3, r0, r2, r1, r7)     // Catch:{ all -> 0x011b }
            java.lang.Object[] r0 = new java.lang.Object[r5]     // Catch:{ all -> 0x011b }
            X.AnonymousClass000.A1M(r0, r4, r7)     // Catch:{ all -> 0x011b }
            r1.invoke(r6, r0)     // Catch:{ all -> 0x011b }
            java.lang.String r0 = "getPosture"
            java.lang.Object r0 = X.AnonymousClass000.A0X(r3, r6, r0)     // Catch:{ all -> 0x011b }
            if (r0 == 0) goto L_0x00e4
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x011b }
            int r0 = r0.intValue()     // Catch:{ all -> 0x011b }
            if (r0 == r4) goto L_0x00c9
            java.lang.String r0 = "Invalid device posture getter/setter"
            java.lang.Exception r1 = new java.lang.Exception     // Catch:{ all -> 0x011b }
            r1.<init>(r0)     // Catch:{ all -> 0x011b }
            goto L_0x011a
        L_0x00c9:
            androidx.window.sidecar.SidecarDisplayFeature r1 = new androidx.window.sidecar.SidecarDisplayFeature     // Catch:{ all -> 0x011b }
            r1.<init>()     // Catch:{ all -> 0x011b }
            android.graphics.Rect r0 = r1.getRect()     // Catch:{ all -> 0x011b }
            X.C18450wi.A0B(r0)     // Catch:{ all -> 0x011b }
            r1.setRect(r0)     // Catch:{ all -> 0x011b }
            r1.getType()     // Catch:{ all -> 0x011b }
            r1.setType(r5)     // Catch:{ all -> 0x011b }
            androidx.window.sidecar.SidecarWindowLayoutInfo r0 = new androidx.window.sidecar.SidecarWindowLayoutInfo     // Catch:{ all -> 0x011b }
            r0.<init>()     // Catch:{ all -> 0x011b }
            return r5
        L_0x00e4:
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Int"
            java.lang.NullPointerException r1 = X.AnonymousClass000.A0W(r0)     // Catch:{ all -> 0x011b }
            goto L_0x011a
        L_0x00eb:
            java.lang.String r0 = "Illegal return type for 'onWindowLayoutChangeListenerAdded': "
            java.lang.String r0 = X.C18450wi.A06(r0, r1)     // Catch:{ all -> 0x011b }
            java.lang.NoSuchMethodException r1 = new java.lang.NoSuchMethodException     // Catch:{ all -> 0x011b }
            r1.<init>(r0)     // Catch:{ all -> 0x011b }
            goto L_0x011a
        L_0x00f7:
            java.lang.String r0 = "Illegal return type for 'getWindowLayoutInfo': "
            java.lang.String r0 = X.C18450wi.A06(r0, r1)     // Catch:{ all -> 0x011b }
            java.lang.NoSuchMethodException r1 = new java.lang.NoSuchMethodException     // Catch:{ all -> 0x011b }
            r1.<init>(r0)     // Catch:{ all -> 0x011b }
            goto L_0x011a
        L_0x0103:
            java.lang.String r0 = "Illegal return type for 'setSidecarCallback': "
            java.lang.String r0 = X.C18450wi.A06(r0, r1)     // Catch:{ all -> 0x011b }
            java.lang.NoSuchMethodException r1 = new java.lang.NoSuchMethodException     // Catch:{ all -> 0x011b }
            r1.<init>(r0)     // Catch:{ all -> 0x011b }
            goto L_0x011a
        L_0x010f:
            java.lang.String r0 = "Illegal return type for 'onWindowLayoutChangeListenerRemoved': "
            java.lang.String r0 = X.C18450wi.A06(r0, r4)     // Catch:{ all -> 0x011b }
            java.lang.NoSuchMethodException r1 = new java.lang.NoSuchMethodException     // Catch:{ all -> 0x011b }
            r1.<init>(r0)     // Catch:{ all -> 0x011b }
        L_0x011a:
            throw r1     // Catch:{ all -> 0x011b }
        L_0x011b:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C07940ck.A03():boolean");
    }

    public void AZn(Activity activity) {
        IBinder A002 = AnonymousClass0MG.A00(activity);
        if (A002 != null) {
            SidecarInterface sidecarInterface = this.A02;
            if (sidecarInterface != null) {
                sidecarInterface.onWindowLayoutChangeListenerRemoved(A002);
            }
            Map map = this.A03;
            activity.unregisterComponentCallbacks((ComponentCallbacks) map.get(activity));
            map.remove(activity);
            Map map2 = this.A04;
            boolean A1R = AnonymousClass000.A1R(map2.size(), 1);
            map2.remove(A002);
            if (A1R && sidecarInterface != null) {
                sidecarInterface.onDeviceStateListenersChanged(true);
            }
        }
    }

    public void Adv(C12560kb r5) {
        this.A00 = new C07930cj(r5);
        SidecarInterface sidecarInterface = this.A02;
        if (sidecarInterface != null) {
            sidecarInterface.setSidecarCallback(new SidecarCompat$DistinctSidecarElementCallback(this.A01, new SidecarCompat$TranslatingCallback(this)));
        }
    }
}
