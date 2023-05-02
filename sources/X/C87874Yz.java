package X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;

/* renamed from: X.4Yz  reason: invalid class name and case insensitive filesystem */
public final class C87874Yz {
    public static Context A00;
    public static AnonymousClass5U9 A01;

    public static Context A00(Context context) {
        Context context2 = A00;
        if (context2 == null) {
            try {
                context2 = C90844ev.A06(context, C90844ev.A09, "com.google.android.gms.maps_dynamite").A00;
            } catch (Exception e2) {
                Log.e("zzca", "Failed to load maps module, use legacy", e2);
                try {
                    context2 = context.createPackageContext("com.google.android.gms", 3);
                } catch (PackageManager.NameNotFoundException unused) {
                    context2 = null;
                }
            }
            A00 = context2;
        }
        return context2;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x006f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass5U9 A01(android.content.Context r4) {
        /*
            X.C13710nw.A01(r4)
            X.5U9 r0 = A01
            if (r0 != 0) goto L_0x009c
            r0 = 13400000(0xcc77c0, float:1.87774E-38)
            int r1 = X.C15040qE.A00(r4, r0)
            if (r1 != 0) goto L_0x0094
            java.lang.String r1 = "zzca"
            java.lang.String r0 = "Making Creator dynamically"
            android.util.Log.i(r1, r0)
            android.content.Context r0 = A00(r4)
            java.lang.ClassLoader r1 = r0.getClassLoader()
            java.lang.String r0 = "com.google.android.gms.maps.internal.CreatorImpl"
            X.C13710nw.A01(r1)     // Catch:{ ClassNotFoundException -> 0x008d }
            java.lang.Class r0 = r1.loadClass(r0)     // Catch:{ ClassNotFoundException -> 0x008d }
            java.lang.Object r1 = r0.newInstance()     // Catch:{ InstantiationException -> 0x007e, IllegalAccessException -> 0x006f }
            android.os.IBinder r1 = (android.os.IBinder) r1
            if (r1 != 0) goto L_0x0032
            r3 = 0
            goto L_0x003e
        L_0x0032:
            java.lang.String r0 = "com.google.android.gms.maps.internal.ICreator"
            android.os.IInterface r3 = r1.queryLocalInterface(r0)
            boolean r0 = r3 instanceof X.AnonymousClass5U9
            if (r0 == 0) goto L_0x0041
            X.5U9 r3 = (X.AnonymousClass5U9) r3
        L_0x003e:
            A01 = r3
            goto L_0x0047
        L_0x0041:
            X.3aH r3 = new X.3aH
            r3.<init>(r1)
            goto L_0x003e
        L_0x0047:
            android.content.Context r0 = A00(r4)     // Catch:{ RemoteException -> 0x0068 }
            android.content.res.Resources r0 = r0.getResources()     // Catch:{ RemoteException -> 0x0068 }
            X.2sR r2 = new X.2sR     // Catch:{ RemoteException -> 0x0068 }
            r2.<init>(r0)     // Catch:{ RemoteException -> 0x0068 }
            X.1e1 r3 = (X.C31361e1) r3     // Catch:{ RemoteException -> 0x0068 }
            r0 = 12451000(0xbdfcb8, float:1.7447567E-38)
            android.os.Parcel r1 = r3.A01()     // Catch:{ RemoteException -> 0x0068 }
            X.C90334dy.A00(r2, r1)     // Catch:{ RemoteException -> 0x0068 }
            r1.writeInt(r0)     // Catch:{ RemoteException -> 0x0068 }
            r0 = 6
            r3.A03(r0, r1)     // Catch:{ RemoteException -> 0x0068 }
            goto L_0x009a
        L_0x0068:
            r1 = move-exception
            X.5Ab r0 = new X.5Ab
            r0.<init>(r1)
            throw r0
        L_0x006f:
            java.lang.String r1 = r0.getName()     // Catch:{ ClassNotFoundException -> 0x008d }
            java.lang.String r0 = "Unable to call the default constructor of "
            java.lang.String r0 = X.C13680ns.A0g(r1, r0)     // Catch:{ ClassNotFoundException -> 0x008d }
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0V(r0)     // Catch:{ ClassNotFoundException -> 0x008d }
            goto L_0x008c
        L_0x007e:
            java.lang.String r1 = r0.getName()     // Catch:{ ClassNotFoundException -> 0x008d }
            java.lang.String r0 = "Unable to instantiate the dynamic class "
            java.lang.String r0 = X.C13680ns.A0g(r1, r0)     // Catch:{ ClassNotFoundException -> 0x008d }
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0V(r0)     // Catch:{ ClassNotFoundException -> 0x008d }
        L_0x008c:
            throw r0     // Catch:{ ClassNotFoundException -> 0x008d }
        L_0x008d:
            java.lang.String r0 = "Unable to find dynamic class com.google.android.gms.maps.internal.CreatorImpl"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0V(r0)
            throw r0
        L_0x0094:
            X.2Hl r0 = new X.2Hl
            r0.<init>(r1)
            throw r0
        L_0x009a:
            X.5U9 r0 = A01
        L_0x009c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C87874Yz.A01(android.content.Context):X.5U9");
    }
}
