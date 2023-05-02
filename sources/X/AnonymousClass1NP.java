package X;

/* renamed from: X.1NP  reason: invalid class name */
public class AnonymousClass1NP {
    public final C16350st A00;

    public AnonymousClass1NP(C16350st r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Missing exception handler attribute for start block: B:64:0x010d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C88724az A00(java.io.InputStream r11) {
        /*
            r10 = this;
            java.util.zip.ZipInputStream r2 = new java.util.zip.ZipInputStream
            r2.<init>(r11)
        L_0x0005:
            java.util.zip.ZipEntry r0 = r2.getNextEntry()     // Catch:{ all -> 0x0116 }
            if (r0 == 0) goto L_0x010e
            java.lang.String r1 = r0.getName()     // Catch:{ all -> 0x0116 }
            java.lang.String r0 = "metadata.json"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x0116 }
            if (r0 == 0) goto L_0x0005
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch:{ all -> 0x0116 }
            r0.<init>(r2)     // Catch:{ all -> 0x0116 }
            android.util.JsonReader r3 = new android.util.JsonReader     // Catch:{ all -> 0x0116 }
            r3.<init>(r0)     // Catch:{ all -> 0x0116 }
            r3.beginObject()     // Catch:{ all -> 0x0109 }
            r6 = 0
            r5 = r6
            r8 = r6
            r4 = r6
        L_0x0028:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x0109 }
            if (r0 == 0) goto L_0x00d4
            java.lang.String r1 = r3.nextName()     // Catch:{ all -> 0x0109 }
            java.lang.String r0 = "scheme"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x0109 }
            if (r0 == 0) goto L_0x0040
            java.lang.String r6 = r3.nextString()     // Catch:{ all -> 0x0109 }
            goto L_0x0028
        L_0x0040:
            java.lang.String r0 = "data_id"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x0109 }
            if (r0 == 0) goto L_0x004d
            java.lang.String r5 = r3.nextString()     // Catch:{ all -> 0x0109 }
            goto L_0x0028
        L_0x004d:
            java.lang.String r0 = "source_id"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x0109 }
            if (r0 == 0) goto L_0x005b
            java.lang.String r4 = r3.nextString()     // Catch:{ all -> 0x0109 }
            goto L_0x0028
        L_0x005b:
            java.lang.String r0 = "key_id"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x0109 }
            if (r0 == 0) goto L_0x00bf
            r3.beginObject()     // Catch:{ all -> 0x0109 }
            r9 = 0
            r7 = r9
            r1 = r9
        L_0x0069:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x0109 }
            if (r0 == 0) goto L_0x00ab
            java.lang.String r8 = r3.nextName()     // Catch:{ all -> 0x0109 }
            int r0 = r8.hashCode()     // Catch:{ all -> 0x0109 }
            switch(r0) {
                case -758621230: goto L_0x009d;
                case 351608024: goto L_0x008b;
                case 1091060704: goto L_0x007e;
                default: goto L_0x007a;
            }     // Catch:{ all -> 0x0109 }
        L_0x007a:
            r3.skipValue()     // Catch:{ all -> 0x0109 }
            goto L_0x0069
        L_0x007e:
            java.lang.String r0 = "account_hash"
            boolean r0 = r8.equals(r0)     // Catch:{ all -> 0x0109 }
            if (r0 == 0) goto L_0x007a
            java.lang.String r7 = r3.nextString()     // Catch:{ all -> 0x0109 }
            goto L_0x0069
        L_0x008b:
            java.lang.String r0 = "version"
            boolean r0 = r8.equals(r0)     // Catch:{ all -> 0x0109 }
            if (r0 == 0) goto L_0x007a
            int r0 = r3.nextInt()     // Catch:{ all -> 0x0109 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0109 }
            goto L_0x0069
        L_0x009d:
            java.lang.String r0 = "server_salt"
            boolean r0 = r8.equals(r0)     // Catch:{ all -> 0x0109 }
            if (r0 == 0) goto L_0x007a
            java.lang.String r1 = r3.nextString()     // Catch:{ all -> 0x0109 }
            goto L_0x0069
        L_0x00ab:
            r3.endObject()     // Catch:{ all -> 0x0109 }
            if (r9 == 0) goto L_0x00cc
            if (r7 == 0) goto L_0x00c4
            if (r1 == 0) goto L_0x0101
            java.lang.String r0 = r9.toString()     // Catch:{ all -> 0x0109 }
            X.4RG r8 = new X.4RG     // Catch:{ all -> 0x0109 }
            r8.<init>(r0, r7, r1)     // Catch:{ all -> 0x0109 }
            goto L_0x0028
        L_0x00bf:
            r3.skipValue()     // Catch:{ all -> 0x0109 }
            goto L_0x0028
        L_0x00c4:
            java.lang.String r0 = "Invalid key info: account hash is missing."
            java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x0109 }
            r1.<init>(r0)     // Catch:{ all -> 0x0109 }
            goto L_0x0108
        L_0x00cc:
            java.lang.String r0 = "Invalid key info: version is missing."
            java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x0109 }
            r1.<init>(r0)     // Catch:{ all -> 0x0109 }
            goto L_0x0108
        L_0x00d4:
            r3.endObject()     // Catch:{ all -> 0x0109 }
            if (r6 == 0) goto L_0x00f9
            if (r5 == 0) goto L_0x00f1
            if (r8 == 0) goto L_0x00e9
            X.4az r0 = new X.4az     // Catch:{ all -> 0x0109 }
            r0.<init>(r8, r6, r5, r4)     // Catch:{ all -> 0x0109 }
            r3.close()     // Catch:{ all -> 0x0116 }
            r2.close()
            return r0
        L_0x00e9:
            java.lang.String r0 = "Invalid metadata file: key info is missing."
            java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x0109 }
            r1.<init>(r0)     // Catch:{ all -> 0x0109 }
            goto L_0x0108
        L_0x00f1:
            java.lang.String r0 = "Invalid metadata file: data id is missing."
            java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x0109 }
            r1.<init>(r0)     // Catch:{ all -> 0x0109 }
            goto L_0x0108
        L_0x00f9:
            java.lang.String r0 = "Invalid metadata file: scheme is missing."
            java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x0109 }
            r1.<init>(r0)     // Catch:{ all -> 0x0109 }
            goto L_0x0108
        L_0x0101:
            java.lang.String r0 = "Invalid key info: server salt is missing."
            java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x0109 }
            r1.<init>(r0)     // Catch:{ all -> 0x0109 }
        L_0x0108:
            throw r1     // Catch:{ all -> 0x0109 }
        L_0x0109:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x010d }
        L_0x010d:
            throw r0     // Catch:{ all -> 0x0116 }
        L_0x010e:
            java.lang.String r1 = "metadata.json was not found in zip file."
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException     // Catch:{ all -> 0x0116 }
            r0.<init>(r1)     // Catch:{ all -> 0x0116 }
            throw r0     // Catch:{ all -> 0x0116 }
        L_0x0116:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x011a }
        L_0x011a:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1NP.A00(java.io.InputStream):X.4az");
    }
}
