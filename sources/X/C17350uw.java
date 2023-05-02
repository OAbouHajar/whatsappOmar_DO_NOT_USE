package X;

import com.obwhatsapp.R;
import java.util.Map;

/* renamed from: X.0uw  reason: invalid class name and case insensitive filesystem */
public class C17350uw implements C17360ux {
    public final C27221Qx A00;

    public C17350uw(C27221Qx r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0032  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(X.AnonymousClass225 r9, java.lang.String r10, java.lang.String r11, java.util.Map r12) {
        /*
            r8 = this;
            X.1Qx r4 = r8.A00
            monitor-enter(r4)
            java.util.Map r1 = r4.A00     // Catch:{ all -> 0x006a }
            java.lang.Object r5 = r1.get(r10)     // Catch:{ all -> 0x006a }
            X.1Qw r5 = (X.C27211Qw) r5     // Catch:{ all -> 0x006a }
            if (r5 != 0) goto L_0x0018
            X.01J r0 = r4.A01     // Catch:{ all -> 0x006a }
            java.lang.Object r5 = r0.get()     // Catch:{ all -> 0x006a }
            X.1Qw r5 = (X.C27211Qw) r5     // Catch:{ all -> 0x006a }
            r1.put(r10, r5)     // Catch:{ all -> 0x006a }
        L_0x0018:
            monitor-enter(r5)     // Catch:{ all -> 0x006a }
            int r0 = r9.ordinal()     // Catch:{ all -> 0x0067 }
            if (r0 == 0) goto L_0x004e
            java.util.Map r0 = r5.A00     // Catch:{ all -> 0x0067 }
        L_0x0021:
            r0.putAll(r12)     // Catch:{ all -> 0x0067 }
        L_0x0024:
            java.util.Map r7 = r5.A00(r11)     // Catch:{ all -> 0x0067 }
            java.util.Map r6 = r5.A02     // Catch:{ all -> 0x0067 }
            java.lang.Object r0 = r6.get(r11)     // Catch:{ all -> 0x0067 }
            X.01Q r0 = (X.AnonymousClass01Q) r0     // Catch:{ all -> 0x0067 }
            if (r0 == 0) goto L_0x0064
            java.lang.Object r3 = r0.A00     // Catch:{ all -> 0x0067 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x0067 }
            java.lang.Object r2 = r0.A01     // Catch:{ all -> 0x0067 }
            X.226 r2 = (X.AnonymousClass226) r2     // Catch:{ all -> 0x0067 }
            java.lang.ref.WeakReference r0 = r2.A01     // Catch:{ all -> 0x0067 }
            java.lang.Object r1 = r0.get()     // Catch:{ all -> 0x0067 }
            X.0pz r1 = (X.C14910pz) r1     // Catch:{ all -> 0x0067 }
            if (r1 == 0) goto L_0x0061
            X.227 r0 = r2.A00     // Catch:{ all -> 0x0067 }
            boolean r0 = r0.A00     // Catch:{ all -> 0x0067 }
            if (r0 != 0) goto L_0x0061
            r1.A07(r3, r7)     // Catch:{ all -> 0x0067 }
            goto L_0x0064
        L_0x004e:
            java.util.Map r1 = r5.A01     // Catch:{ all -> 0x0067 }
            java.lang.Object r0 = r1.get(r11)     // Catch:{ all -> 0x0067 }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ all -> 0x0067 }
            if (r0 != 0) goto L_0x0021
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ all -> 0x0067 }
            r0.<init>(r12)     // Catch:{ all -> 0x0067 }
            r1.put(r11, r0)     // Catch:{ all -> 0x0067 }
            goto L_0x0024
        L_0x0061:
            r6.remove(r11)     // Catch:{ all -> 0x0067 }
        L_0x0064:
            monitor-exit(r5)     // Catch:{ all -> 0x006a }
            monitor-exit(r4)
            return
        L_0x0067:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x006a }
            throw r0     // Catch:{ all -> 0x006a }
        L_0x006a:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17350uw.A00(X.225, java.lang.String, java.lang.String, java.util.Map):void");
    }

    public AnonymousClass22B Aew(C14990q7 r8, C14910pz r9, AnonymousClass228 r10, AnonymousClass229 r11, C14970q5 r12) {
        AnonymousClass22B r1;
        Map map = r11.A02;
        if (map != null) {
            AnonymousClass1MR r2 = (AnonymousClass1MR) r8.A02.A00().get(R.id.bloks_data_module_namespace_manager);
            if (!"fetch".equals(map.get("mode"))) {
                return new AnonymousClass22B((Runnable) null, (Object) null);
            }
            C27221Qx r5 = this.A00;
            String str = r2.A00;
            String str2 = r2.A01;
            String str3 = r11.A00;
            synchronized (r5) {
                Map map2 = r5.A00;
                C27211Qw r4 = (C27211Qw) map2.get(str);
                if (r4 == null) {
                    r4 = (C27211Qw) r5.A01.get();
                    map2.put(str, r4);
                }
                synchronized (r4) {
                    AnonymousClass226 r3 = new AnonymousClass226(r9);
                    r4.A02.put(str2, new AnonymousClass01Q(str3, r3));
                    r1 = new AnonymousClass22B(r3.A00, r4.A00(str2));
                }
            }
            return r1;
        }
        throw new IllegalStateException("Manifest entry is null");
    }
}
