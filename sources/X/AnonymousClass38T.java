package X;

/* renamed from: X.38T  reason: invalid class name */
public class AnonymousClass38T {
    public AnonymousClass47L A00;

    public AnonymousClass38T(AnonymousClass47L r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C88154a2 A00(android.os.Bundle r9) {
        /*
            r8 = this;
            java.lang.String r0 = "error_code"
            r3 = 1
            int r7 = r9.getInt(r0, r3)
            java.lang.String r1 = "exception"
            android.os.Parcelable r0 = r9.getParcelable(r1)
            android.os.Bundle r0 = (android.os.Bundle) r0
            r6 = 0
            if (r0 == 0) goto L_0x002a
            java.io.Serializable r2 = r0.getSerializable(r1)     // Catch:{ all -> 0x0020 }
            java.lang.Throwable r2 = (java.lang.Throwable) r2     // Catch:{ all -> 0x0020 }
            if (r2 == 0) goto L_0x001d
            X.41i r1 = X.C797941i.Deserialized     // Catch:{ all -> 0x0022 }
            goto L_0x002d
        L_0x001d:
            X.41i r1 = X.C797941i.NotIncluded     // Catch:{ all -> 0x0022 }
            goto L_0x002d
        L_0x0020:
            r0 = move-exception
            goto L_0x0024
        L_0x0022:
            r0 = move-exception
            r6 = r2
        L_0x0024:
            X.C13700nu.A0c(r0)
            X.41i r1 = X.C797941i.DeserializationFailed
            goto L_0x002e
        L_0x002a:
            X.41i r1 = X.C797941i.NotIncluded
            goto L_0x002e
        L_0x002d:
            r6 = r2
        L_0x002e:
            X.41i r0 = X.C797941i.NotIncluded
            if (r1 != r0) goto L_0x0038
            java.lang.String r0 = "serialization_result"
            r9.getBoolean(r0, r3)
        L_0x0038:
            java.lang.String r0 = "stringified_exception"
            java.lang.String r5 = r9.getString(r0)
            java.lang.String r0 = "exception_hierarchies"
            java.util.ArrayList r0 = r9.getStringArrayList(r0)
            X.3cL r4 = X.C34641kb.builder()
            if (r0 == 0) goto L_0x0075
            X.3cL r3 = X.C34641kb.builder()
            java.util.Iterator r2 = r0.iterator()
        L_0x0053:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0075
            java.lang.String r1 = X.AnonymousClass000.A0m(r2)
            java.lang.String r0 = "--"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0071
            X.1kb r0 = r3.build()
            r4.add((java.lang.Object) r0)
            X.3cL r3 = X.C34641kb.builder()
            goto L_0x0053
        L_0x0071:
            r3.add((java.lang.Object) r1)
            goto L_0x0053
        L_0x0075:
            X.1kb r1 = r4.build()
            X.4a2 r0 = new X.4a2
            r0.<init>(r1, r5, r6, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass38T.A00(android.os.Bundle):X.4a2");
    }
}
