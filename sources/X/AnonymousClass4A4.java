package X;

/* renamed from: X.4A4  reason: invalid class name */
public final class AnonymousClass4A4 {
    public static final AnonymousClass4SX A00;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: X.4SX} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v17, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: X.4SX} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.Class<X.4SX> r7 = X.AnonymousClass4SX.class
            java.lang.String r0 = "java.specification.version"
            java.lang.String r6 = java.lang.System.getProperty(r0)
            r4 = 65542(0x10006, float:9.1844E-41)
            if (r6 == 0) goto L_0x0043
            r5 = 0
            r0 = 46
            int r1 = r6.indexOf(r0, r5)
            r3 = 65536(0x10000, float:9.18355E-41)
            if (r1 >= 0) goto L_0x001e
            int r4 = java.lang.Integer.parseInt(r6)     // Catch:{ NumberFormatException -> 0x0043 }
            int r4 = r4 * r3
            goto L_0x0043
        L_0x001e:
            int r2 = r1 + 1
            int r0 = r6.indexOf(r0, r2)
            if (r0 >= 0) goto L_0x002a
            int r0 = r6.length()
        L_0x002a:
            java.lang.String r1 = r6.substring(r5, r1)
            X.C18450wi.A0B(r1)
            java.lang.String r0 = r6.substring(r2, r0)
            X.C18450wi.A0B(r0)
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x0043 }
            int r1 = r1 * r3
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x0043 }
            int r4 = r1 + r0
        L_0x0043:
            java.lang.String r5 = "Instance classloader: "
            r0 = 65544(0x10008, float:9.1847E-41)
            if (r4 < r0) goto L_0x0095
            java.lang.Class<X.5D5> r0 = X.AnonymousClass5D5.class
            java.lang.Object r0 = r0.newInstance()     // Catch:{ ClassNotFoundException -> 0x006e }
            X.C18450wi.A0B(r0)     // Catch:{ ClassNotFoundException -> 0x006e }
            r1 = r0
            X.4SX r1 = (X.AnonymousClass4SX) r1     // Catch:{ ClassCastException -> 0x0058 }
            goto L_0x00e9
        L_0x0058:
            r3 = move-exception
            java.lang.Class r0 = r0.getClass()     // Catch:{ ClassNotFoundException -> 0x006e }
            java.lang.ClassLoader r2 = r0.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x006e }
            java.lang.ClassLoader r1 = r7.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x006e }
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0q(r5)     // Catch:{ ClassNotFoundException -> 0x006e }
            java.lang.Throwable r0 = A00(r2, r1, r0, r3)     // Catch:{ ClassNotFoundException -> 0x006e }
            throw r0     // Catch:{ ClassNotFoundException -> 0x006e }
        L_0x006e:
            java.lang.String r0 = "kotlin.internal.JRE8PlatformImplementations"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException -> 0x0095 }
            java.lang.Object r0 = r0.newInstance()     // Catch:{ ClassNotFoundException -> 0x0095 }
            X.C18450wi.A0B(r0)     // Catch:{ ClassNotFoundException -> 0x0095 }
            r1 = r0
            X.4SX r1 = (X.AnonymousClass4SX) r1     // Catch:{ ClassCastException -> 0x007f }
            goto L_0x00e9
        L_0x007f:
            r3 = move-exception
            java.lang.Class r0 = r0.getClass()     // Catch:{ ClassNotFoundException -> 0x0095 }
            java.lang.ClassLoader r2 = r0.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0095 }
            java.lang.ClassLoader r1 = r7.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0095 }
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0q(r5)     // Catch:{ ClassNotFoundException -> 0x0095 }
            java.lang.Throwable r0 = A00(r2, r1, r0, r3)     // Catch:{ ClassNotFoundException -> 0x0095 }
            throw r0     // Catch:{ ClassNotFoundException -> 0x0095 }
        L_0x0095:
            r0 = 65543(0x10007, float:9.1845E-41)
            if (r4 < r0) goto L_0x00e4
            java.lang.Class<X.5D6> r0 = X.AnonymousClass5D6.class
            java.lang.Object r0 = r0.newInstance()     // Catch:{ ClassNotFoundException -> 0x00bd }
            X.C18450wi.A0B(r0)     // Catch:{ ClassNotFoundException -> 0x00bd }
            r1 = r0
            X.4SX r1 = (X.AnonymousClass4SX) r1     // Catch:{ ClassCastException -> 0x00a7 }
            goto L_0x00e9
        L_0x00a7:
            r3 = move-exception
            java.lang.Class r0 = r0.getClass()     // Catch:{ ClassNotFoundException -> 0x00bd }
            java.lang.ClassLoader r2 = r0.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x00bd }
            java.lang.ClassLoader r1 = r7.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x00bd }
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0q(r5)     // Catch:{ ClassNotFoundException -> 0x00bd }
            java.lang.Throwable r0 = A00(r2, r1, r0, r3)     // Catch:{ ClassNotFoundException -> 0x00bd }
            throw r0     // Catch:{ ClassNotFoundException -> 0x00bd }
        L_0x00bd:
            java.lang.String r0 = "kotlin.internal.JRE7PlatformImplementations"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException -> 0x00e4 }
            java.lang.Object r0 = r0.newInstance()     // Catch:{ ClassNotFoundException -> 0x00e4 }
            X.C18450wi.A0B(r0)     // Catch:{ ClassNotFoundException -> 0x00e4 }
            r1 = r0
            X.4SX r1 = (X.AnonymousClass4SX) r1     // Catch:{ ClassCastException -> 0x00ce }
            goto L_0x00e9
        L_0x00ce:
            r3 = move-exception
            java.lang.Class r0 = r0.getClass()     // Catch:{ ClassNotFoundException -> 0x00e4 }
            java.lang.ClassLoader r2 = r0.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x00e4 }
            java.lang.ClassLoader r1 = r7.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x00e4 }
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0q(r5)     // Catch:{ ClassNotFoundException -> 0x00e4 }
            java.lang.Throwable r0 = A00(r2, r1, r0, r3)     // Catch:{ ClassNotFoundException -> 0x00e4 }
            throw r0     // Catch:{ ClassNotFoundException -> 0x00e4 }
        L_0x00e4:
            X.4SX r1 = new X.4SX
            r1.<init>()
        L_0x00e9:
            A00 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4A4.<clinit>():void");
    }

    public static Throwable A00(Object obj, Object obj2, StringBuilder sb, Throwable th) {
        sb.append(obj);
        sb.append(", base type classloader: ");
        sb.append(obj2);
        Throwable initCause = new ClassCastException(sb.toString()).initCause(th);
        C18450wi.A0B(initCause);
        return initCause;
    }
}
