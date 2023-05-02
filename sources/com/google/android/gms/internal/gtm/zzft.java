package com.google.android.gms.internal.gtm;

public final class zzft extends zzbs {
    public String zza;
    public String zzb;
    public boolean zzc;
    public int zzd;
    public boolean zze;
    public boolean zzf;

    public zzft(zzbv zzbv) {
        super(zzbv);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00c8, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        r3.zzT("Error parsing bool configuration value", r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00f9, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        r3.zzT("Error parsing int configuration value", r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x010b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:?, code lost:
        r3.zzK("Error parsing tracker configuration file", r0);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x010b A[ExcHandler: IOException | XmlPullParserException (r0v35 'e' java.lang.Object A[CUSTOM_DECLARE]), Splitter:B:11:0x003a] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzd() {
        /*
            r7 = this;
            com.google.android.gms.internal.gtm.zzbv r0 = r7.zza
            android.content.Context r0 = r0.zzb
            android.content.pm.PackageManager r2 = r0.getPackageManager()     // Catch:{ NameNotFoundException -> 0x01a1 }
            java.lang.String r1 = r0.getPackageName()     // Catch:{ NameNotFoundException -> 0x01a1 }
            r0 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r0 = r2.getApplicationInfo(r1, r0)     // Catch:{ NameNotFoundException -> 0x01a1 }
            if (r0 == 0) goto L_0x01a7
            android.os.Bundle r1 = r0.metaData
            if (r1 == 0) goto L_0x0181
            java.lang.String r0 = "com.google.android.gms.analytics.globalConfigResource"
            int r2 = r1.getInt(r0)
            if (r2 <= 0) goto L_0x0181
            com.google.android.gms.internal.gtm.zzbv r1 = r7.zza
            com.google.android.gms.internal.gtm.zzev r0 = new com.google.android.gms.internal.gtm.zzev
            r0.<init>(r1)
            com.google.android.gms.internal.gtm.zzcs r3 = new com.google.android.gms.internal.gtm.zzcs
            r3.<init>(r1, r0)
            com.google.android.gms.internal.gtm.zzbv r0 = r3.zza     // Catch:{ NotFoundException -> 0x0116 }
            android.content.Context r0 = r0.zzc     // Catch:{ NotFoundException -> 0x0116 }
            android.content.res.Resources r0 = r0.getResources()     // Catch:{ NotFoundException -> 0x0116 }
            android.content.res.XmlResourceParser r5 = r0.getXml(r2)     // Catch:{ NotFoundException -> 0x0116 }
            java.lang.String r4 = "Error parsing tracker configuration file"
            r5.next()     // Catch:{ IOException | XmlPullParserException -> 0x010b }
            int r1 = r5.getEventType()     // Catch:{ IOException | XmlPullParserException -> 0x010b }
        L_0x0041:
            r0 = 1
            if (r1 == r0) goto L_0x010f
            int r1 = r5.getEventType()     // Catch:{ IOException | XmlPullParserException -> 0x010b }
            r0 = 2
            if (r1 != r0) goto L_0x0105
            java.lang.String r1 = r5.getName()     // Catch:{ IOException | XmlPullParserException -> 0x010b }
            java.util.Locale r0 = java.util.Locale.US     // Catch:{ IOException | XmlPullParserException -> 0x010b }
            java.lang.String r6 = r1.toLowerCase(r0)     // Catch:{ IOException | XmlPullParserException -> 0x010b }
            java.lang.String r0 = "screenname"
            boolean r0 = r6.equals(r0)     // Catch:{ IOException | XmlPullParserException -> 0x010b }
            java.lang.String r2 = "name"
            r1 = 0
            if (r0 == 0) goto L_0x0080
            java.lang.String r2 = r5.getAttributeValue(r1, r2)     // Catch:{ IOException | XmlPullParserException -> 0x010b }
            java.lang.String r0 = r5.nextText()     // Catch:{ IOException | XmlPullParserException -> 0x010b }
            java.lang.String r1 = r0.trim()     // Catch:{ IOException | XmlPullParserException -> 0x010b }
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch:{ IOException | XmlPullParserException -> 0x010b }
            if (r0 != 0) goto L_0x0105
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ IOException | XmlPullParserException -> 0x010b }
            if (r0 != 0) goto L_0x0105
            com.google.android.gms.internal.gtm.zzcr r0 = r3.zza     // Catch:{ IOException | XmlPullParserException -> 0x010b }
            r0.zzb(r2, r1)     // Catch:{ IOException | XmlPullParserException -> 0x010b }
            goto L_0x0105
        L_0x0080:
            java.lang.String r0 = "string"
            boolean r0 = r6.equals(r0)     // Catch:{ IOException | XmlPullParserException -> 0x010b }
            if (r0 == 0) goto L_0x009e
            java.lang.String r2 = r5.getAttributeValue(r1, r2)     // Catch:{ IOException | XmlPullParserException -> 0x010b }
            java.lang.String r0 = r5.nextText()     // Catch:{ IOException | XmlPullParserException -> 0x010b }
            java.lang.String r1 = r0.trim()     // Catch:{ IOException | XmlPullParserException -> 0x010b }
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch:{ IOException | XmlPullParserException -> 0x010b }
            if (r0 != 0) goto L_0x0105
            if (r1 == 0) goto L_0x0105
            goto L_0x0100
        L_0x009e:
            java.lang.String r0 = "bool"
            boolean r0 = r6.equals(r0)     // Catch:{ IOException | XmlPullParserException -> 0x010b }
            if (r0 == 0) goto L_0x00cf
            java.lang.String r6 = r5.getAttributeValue(r1, r2)     // Catch:{ IOException | XmlPullParserException -> 0x010b }
            java.lang.String r0 = r5.nextText()     // Catch:{ IOException | XmlPullParserException -> 0x010b }
            java.lang.String r2 = r0.trim()     // Catch:{ IOException | XmlPullParserException -> 0x010b }
            boolean r0 = android.text.TextUtils.isEmpty(r6)     // Catch:{ IOException | XmlPullParserException -> 0x010b }
            if (r0 != 0) goto L_0x0105
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch:{ IOException | XmlPullParserException -> 0x010b }
            if (r0 != 0) goto L_0x0105
            boolean r1 = java.lang.Boolean.parseBoolean(r2)     // Catch:{ NumberFormatException -> 0x00c8, IOException | XmlPullParserException -> 0x010b }
            com.google.android.gms.internal.gtm.zzcr r0 = r3.zza     // Catch:{ NumberFormatException -> 0x00c8, IOException | XmlPullParserException -> 0x010b }
            r0.zzc(r6, r1)     // Catch:{ NumberFormatException -> 0x00c8, IOException | XmlPullParserException -> 0x010b }
            goto L_0x0105
        L_0x00c8:
            r1 = move-exception
            java.lang.String r0 = "Error parsing bool configuration value"
            r3.zzT(r0, r2, r1)     // Catch:{ IOException | XmlPullParserException -> 0x010b }
            goto L_0x0105
        L_0x00cf:
            java.lang.String r0 = "integer"
            boolean r0 = r6.equals(r0)     // Catch:{ IOException | XmlPullParserException -> 0x010b }
            if (r0 == 0) goto L_0x0105
            java.lang.String r6 = r5.getAttributeValue(r1, r2)     // Catch:{ IOException | XmlPullParserException -> 0x010b }
            java.lang.String r0 = r5.nextText()     // Catch:{ IOException | XmlPullParserException -> 0x010b }
            java.lang.String r2 = r0.trim()     // Catch:{ IOException | XmlPullParserException -> 0x010b }
            boolean r0 = android.text.TextUtils.isEmpty(r6)     // Catch:{ IOException | XmlPullParserException -> 0x010b }
            if (r0 != 0) goto L_0x0105
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch:{ IOException | XmlPullParserException -> 0x010b }
            if (r0 != 0) goto L_0x0105
            int r1 = java.lang.Integer.parseInt(r2)     // Catch:{ NumberFormatException -> 0x00f9, IOException | XmlPullParserException -> 0x010b }
            com.google.android.gms.internal.gtm.zzcr r0 = r3.zza     // Catch:{ NumberFormatException -> 0x00f9, IOException | XmlPullParserException -> 0x010b }
            r0.zzd(r6, r1)     // Catch:{ NumberFormatException -> 0x00f9, IOException | XmlPullParserException -> 0x010b }
            goto L_0x0105
        L_0x00f9:
            r1 = move-exception
            java.lang.String r0 = "Error parsing int configuration value"
            r3.zzT(r0, r2, r1)     // Catch:{ IOException | XmlPullParserException -> 0x010b }
            goto L_0x0105
        L_0x0100:
            com.google.android.gms.internal.gtm.zzcr r0 = r3.zza     // Catch:{ IOException | XmlPullParserException -> 0x010b }
            r0.zze(r2, r1)     // Catch:{ IOException | XmlPullParserException -> 0x010b }
        L_0x0105:
            int r1 = r5.next()     // Catch:{ IOException | XmlPullParserException -> 0x010b }
            goto L_0x0041
        L_0x010b:
            r0 = move-exception
            r3.zzK(r4, r0)     // Catch:{ NotFoundException -> 0x0116 }
        L_0x010f:
            com.google.android.gms.internal.gtm.zzcr r0 = r3.zza     // Catch:{ NotFoundException -> 0x0116 }
            com.google.android.gms.internal.gtm.zzcq r5 = r0.zza()     // Catch:{ NotFoundException -> 0x0116 }
            goto L_0x011d
        L_0x0116:
            r1 = move-exception
            java.lang.String r0 = "inflate() called with unknown resourceId"
            r3.zzS(r0, r1)
            r5 = 0
        L_0x011d:
            com.google.android.gms.internal.gtm.zzew r5 = (com.google.android.gms.internal.gtm.zzew) r5
            if (r5 == 0) goto L_0x0181
            java.lang.String r0 = "Loading global XML config values"
            r7.zzO(r0)
            java.lang.String r1 = r5.zza
            if (r1 == 0) goto L_0x0131
            r7.zzb = r1
            java.lang.String r0 = "XML config - app name"
            r7.zzG(r0, r1)
        L_0x0131:
            java.lang.String r1 = r5.zzb
            if (r1 == 0) goto L_0x013c
            r7.zza = r1
            java.lang.String r0 = "XML config - app version"
            r7.zzG(r0, r1)
        L_0x013c:
            java.lang.String r1 = r5.zzc
            r4 = 0
            r3 = -1
            r2 = 1
            if (r1 == 0) goto L_0x015c
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r1 = r1.toLowerCase(r0)
            java.lang.String r0 = "verbose"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0182
            r0 = 0
        L_0x0153:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "XML config - log level"
            r7.zzP(r0, r1)
        L_0x015c:
            int r0 = r5.zzd
            if (r0 < 0) goto L_0x016d
            r7.zzd = r0
            r7.zzc = r2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "XML config - dispatch period (sec)"
            r7.zzG(r0, r1)
        L_0x016d:
            int r0 = r5.zze
            if (r0 == r3) goto L_0x0181
            if (r2 != r0) goto L_0x0174
            r4 = 1
        L_0x0174:
            r7.zzf = r4
            r7.zze = r2
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r4)
            java.lang.String r0 = "XML config - dry run"
            r7.zzG(r0, r1)
        L_0x0181:
            return
        L_0x0182:
            java.lang.String r0 = "info"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x018c
            r0 = 1
            goto L_0x0153
        L_0x018c:
            java.lang.String r0 = "warning"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0197
            r0 = 2
            goto L_0x0153
        L_0x0197:
            java.lang.String r0 = "error"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x015c
            r0 = 3
            goto L_0x0153
        L_0x01a1:
            r1 = move-exception
            java.lang.String r0 = "PackageManager doesn't know about the app package"
            r7.zzS(r0, r1)
        L_0x01a7:
            java.lang.String r0 = "Couldn't get ApplicationInfo to load global config"
            r7.zzR(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzft.zzd():void");
    }
}
