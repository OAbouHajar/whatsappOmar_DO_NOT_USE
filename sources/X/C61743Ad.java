package X;

/* renamed from: X.3Ad  reason: invalid class name and case insensitive filesystem */
public final class C61743Ad {
    public final long A00;
    public final long A01;
    public final AnonymousClass4WW A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public C61743Ad(AnonymousClass4WW r1, String str, String str2, String str3, String str4, long j2, long j3) {
        AnonymousClass00B.A06(str);
        this.A06 = str;
        AnonymousClass00B.A06(str2);
        this.A05 = str2;
        AnonymousClass00B.A06(str3);
        this.A04 = str3;
        AnonymousClass00B.A06(str4);
        this.A03 = str4;
        this.A00 = j2;
        this.A01 = j3;
        this.A02 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0005, code lost:
        if (r24 != null) goto L_0x0007;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C61743Ad A00(X.C16200sd r22, java.lang.String r23, java.lang.String r24, org.json.JSONObject r25, long r26) {
        /*
            r12 = r24
            if (r23 != 0) goto L_0x0007
            r1 = 0
            if (r24 == 0) goto L_0x0008
        L_0x0007:
            r1 = 1
        L_0x0008:
            java.lang.String r0 = "Either prefix or file upload path must be non-null"
            X.AnonymousClass00B.A0C(r0, r1)
            java.lang.String r6 = "name"
            r3 = r25
            java.lang.String r13 = r3.optString(r6)
            java.lang.String r0 = "mimeType"
            java.lang.String r14 = r3.optString(r0)
            java.lang.String r5 = "md5Hash"
            java.lang.String r1 = r3.optString(r5)
            java.lang.String r4 = "sizeBytes"
            java.lang.String r8 = r3.optString(r4)
            java.lang.String r2 = "updateTime"
            java.lang.String r7 = r3.optString(r2)
            boolean r0 = android.text.TextUtils.isEmpty(r13)
            if (r0 != 0) goto L_0x00e3
            boolean r0 = android.text.TextUtils.isEmpty(r14)
            if (r0 != 0) goto L_0x00e3
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x00e3
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 != 0) goto L_0x00e3
            r0 = 2
            byte[] r0 = android.util.Base64.decode(r1, r0)
            java.lang.String r15 = X.C004101u.A05(r0)
            if (r24 != 0) goto L_0x005a
            int r0 = r23.length()
            java.lang.String r12 = r13.substring(r0)
        L_0x005a:
            r0 = r26
            long r16 = X.C29501aj.A01(r8, r0)
            android.text.format.Time r1 = new android.text.format.Time
            r1.<init>()
            r1.parse3339(r7)
            r0 = 1
            long r18 = r1.toMillis(r0)
            java.lang.String r0 = "metadata"
            java.lang.String r7 = r3.optString(r0)
            java.lang.String r1 = "\""
            java.lang.String r10 = "gdrive/file-metadata/failed to parse metadata \""
            r9 = 0
            r8 = r22
            java.lang.String r0 = r8.A00(r7)     // Catch:{ Exception -> 0x00cd }
            if (r0 == 0) goto L_0x00dc
            org.json.JSONObject r3 = X.C13700nu.A0K(r0)     // Catch:{ TimeFormatException | JSONException -> 0x00bd }
            java.lang.String r22 = r3.optString(r6)     // Catch:{ TimeFormatException | JSONException -> 0x00bd }
            java.lang.String r23 = r3.optString(r5)     // Catch:{ TimeFormatException | JSONException -> 0x00bd }
            long r24 = r3.optLong(r4)     // Catch:{ TimeFormatException | JSONException -> 0x00bd }
            java.lang.String r2 = r3.optString(r2)     // Catch:{ TimeFormatException | JSONException -> 0x00bd }
            boolean r3 = android.text.TextUtils.isEmpty(r22)     // Catch:{ TimeFormatException | JSONException -> 0x00bd }
            if (r3 != 0) goto L_0x00dc
            boolean r3 = android.text.TextUtils.isEmpty(r23)     // Catch:{ TimeFormatException | JSONException -> 0x00bd }
            if (r3 != 0) goto L_0x00dc
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch:{ TimeFormatException | JSONException -> 0x00bd }
            if (r3 != 0) goto L_0x00dc
            android.text.format.Time r3 = new android.text.format.Time     // Catch:{ TimeFormatException | JSONException -> 0x00bd }
            r3.<init>()     // Catch:{ TimeFormatException | JSONException -> 0x00bd }
            r3.parse3339(r2)     // Catch:{ TimeFormatException | JSONException -> 0x00bd }
            r2 = 1
            long r26 = r3.toMillis(r2)     // Catch:{ TimeFormatException | JSONException -> 0x00bd }
            X.4WW r11 = new X.4WW     // Catch:{ TimeFormatException | JSONException -> 0x00bd }
            r20 = r11
            r21 = r8
            r20.<init>(r21, r22, r23, r24, r26)     // Catch:{ TimeFormatException | JSONException -> 0x00bd }
            goto L_0x00dd
        L_0x00bd:
            r3 = move-exception
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0q(r10)     // Catch:{ Exception -> 0x00cd }
            r2.append(r0)     // Catch:{ Exception -> 0x00cd }
            java.lang.String r0 = X.AnonymousClass000.A0h(r1, r2)     // Catch:{ Exception -> 0x00cd }
            com.whatsapp.util.Log.e(r0, r3)     // Catch:{ Exception -> 0x00cd }
            goto L_0x00dc
        L_0x00cd:
            r2 = move-exception
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0q(r10)
            r0.append(r7)
            java.lang.String r0 = X.AnonymousClass000.A0h(r1, r0)
            com.whatsapp.util.Log.e(r0, r2)
        L_0x00dc:
            r11 = r9
        L_0x00dd:
            X.3Ad r10 = new X.3Ad
            r10.<init>(r11, r12, r13, r14, r15, r16, r18)
            return r10
        L_0x00e3:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61743Ad.A00(X.0sd, java.lang.String, java.lang.String, org.json.JSONObject, long):X.3Ad");
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || C61743Ad.class != obj.getClass()) {
                return false;
            }
            C61743Ad r7 = (C61743Ad) obj;
            if (this.A00 != r7.A00 || this.A01 != r7.A01 || !this.A05.equals(r7.A05) || !this.A06.equals(r7.A06) || !this.A04.equals(r7.A04) || !this.A03.equals(r7.A03) || !C34901l3.A00(this.A02, r7.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[7];
        objArr[0] = this.A05;
        objArr[1] = this.A06;
        objArr[2] = this.A04;
        objArr[3] = this.A03;
        objArr[4] = Long.valueOf(this.A00);
        objArr[5] = Long.valueOf(this.A01);
        return AnonymousClass000.A0F(this.A02, objArr, 6);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("RemoteFile{name='");
        A0r.append(this.A05);
        A0r.append('\'');
        A0r.append(", uploadTitle='");
        A0r.append(this.A06);
        A0r.append('\'');
        A0r.append(", mimeType='");
        A0r.append(this.A04);
        A0r.append('\'');
        A0r.append(", md5Hash='");
        A0r.append(this.A03);
        A0r.append('\'');
        A0r.append(", sizeBytes=");
        A0r.append(this.A00);
        A0r.append(", updateTime=");
        A0r.append(this.A01);
        A0r.append(", metadata=");
        A0r.append(this.A02);
        return AnonymousClass000.A0k(A0r);
    }
}
