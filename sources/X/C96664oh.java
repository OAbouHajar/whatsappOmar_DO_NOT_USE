package X;

import java.lang.reflect.Constructor;
import java.util.List;

/* renamed from: X.4oh  reason: invalid class name and case insensitive filesystem */
public final class C96664oh implements C108255Ng {
    public static final Constructor A00;
    public static final int[] A01 = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 14};

    static {
        Constructor<? extends U> constructor = null;
        try {
            if (Boolean.TRUE.equals(Class.forName("com.google.android.exoplayer2.ext.flac.FlacLibrary").getMethod("isAvailable", new Class[0]).invoke((Object) null, new Object[0]))) {
                constructor = Class.forName("com.google.android.exoplayer2.ext.flac.FlacExtractor").asSubclass(C55132it.class).getConstructor(new Class[]{Integer.TYPE});
            }
        } catch (ClassNotFoundException unused) {
        } catch (Exception e2) {
            throw new RuntimeException("Error instantiating FLAC extension", e2);
        }
        A00 = constructor;
    }

    public final void A00(List list, int i2) {
        switch (i2) {
            case 0:
                list.add(new C96474oO());
                return;
            case 1:
                list.add(new C96484oP());
                return;
            case 2:
                list.add(new C96494oQ());
                return;
            case 3:
                list.add(new C96584oZ());
                return;
            case 4:
                Constructor constructor = A00;
                if (constructor != null) {
                    try {
                        list.add((C55132it) AnonymousClass3K4.A0W(0, constructor, new Object[1], 0));
                        return;
                    } catch (Exception e2) {
                        throw new IllegalStateException("Unexpected error creating FLAC extractor", e2);
                    }
                } else {
                    list.add(new C96544oV());
                    return;
                }
            case 5:
                list.add(new C96554oW());
                return;
            case 6:
                list.add(new C96594oa());
                return;
            case 7:
                list.add(new C96564oX());
                return;
            case 8:
                list.add(new C96604ob());
                list.add(new C96754oq());
                return;
            case 9:
                list.add(new C96524oT());
                return;
            case 10:
                list.add(new C96504oR());
                return;
            case 11:
                list.add(new C96514oS());
                return;
            case 12:
                list.add(new C96574oY());
                return;
            case 14:
                list.add(new C96534oU());
                return;
            default:
                return;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00ac, code lost:
        r0 = r1.equals(r0);
        r5 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00be, code lost:
        r0 = r1.equals(r0);
        r5 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00c6, code lost:
        r0 = r1.equals(r0);
        r5 = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00e0, code lost:
        r0 = r1.equals(r0);
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00e5, code lost:
        if (r0 == false) goto L_0x00e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00ea, code lost:
        A00(r4, r5);
     */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0218  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized X.C55132it[] A7N(android.net.Uri r9, java.util.Map r10) {
        /*
            r8 = this;
            monitor-enter(r8)
            r0 = 14
            java.util.ArrayList r4 = X.C13690nt.A0i(r0)     // Catch:{ all -> 0x0232 }
            java.lang.String r0 = "Content-Type"
            java.lang.Object r1 = r10.get(r0)     // Catch:{ all -> 0x0232 }
            java.util.List r1 = (java.util.List) r1     // Catch:{ all -> 0x0232 }
            if (r1 == 0) goto L_0x00e8
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x0232 }
            if (r0 != 0) goto L_0x00e8
            java.lang.Object r1 = X.C13690nt.A0Z(r1)     // Catch:{ all -> 0x0232 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x0232 }
            if (r1 == 0) goto L_0x00e8
            int r0 = r1.hashCode()     // Catch:{ all -> 0x0232 }
            switch(r0) {
                case -1007807498: goto L_0x002f;
                case -586683234: goto L_0x003a;
                case 187090231: goto L_0x0045;
                default: goto L_0x0026;
            }     // Catch:{ all -> 0x0232 }
        L_0x0026:
            int r0 = r1.hashCode()     // Catch:{ all -> 0x0232 }
            switch(r0) {
                case -2123537834: goto L_0x00de;
                case -1662384011: goto L_0x00d5;
                case -1662384007: goto L_0x00cc;
                case -1662095187: goto L_0x00c4;
                case -1606874997: goto L_0x00bc;
                case -1487394660: goto L_0x00b3;
                case -1248337486: goto L_0x00aa;
                case -1004728940: goto L_0x00a1;
                case -387023398: goto L_0x009e;
                case -43467528: goto L_0x009b;
                case 13915911: goto L_0x0093;
                case 187078296: goto L_0x0090;
                case 187078297: goto L_0x0088;
                case 187078669: goto L_0x0085;
                case 187090232: goto L_0x0082;
                case 187091926: goto L_0x0079;
                case 187099443: goto L_0x0070;
                case 1331848029: goto L_0x006d;
                case 1503095341: goto L_0x006a;
                case 1504578661: goto L_0x0067;
                case 1504619009: goto L_0x005f;
                case 1504831518: goto L_0x0056;
                case 1505118770: goto L_0x0053;
                case 2039520277: goto L_0x0050;
                default: goto L_0x002d;
            }     // Catch:{ all -> 0x0232 }
        L_0x002d:
            goto L_0x00e8
        L_0x002f:
            java.lang.String r0 = "audio/x-flac"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0232 }
            if (r0 == 0) goto L_0x0026
            java.lang.String r1 = "audio/flac"
            goto L_0x0026
        L_0x003a:
            java.lang.String r0 = "audio/x-wav"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0232 }
            if (r0 == 0) goto L_0x0026
            java.lang.String r1 = "audio/wav"
            goto L_0x0026
        L_0x0045:
            java.lang.String r0 = "audio/mp3"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0232 }
            if (r0 == 0) goto L_0x0026
            java.lang.String r1 = "audio/mpeg"
            goto L_0x0026
        L_0x0050:
            java.lang.String r0 = "video/x-matroska"
            goto L_0x00c6
        L_0x0053:
            java.lang.String r0 = "audio/webm"
            goto L_0x00c6
        L_0x0056:
            java.lang.String r0 = "audio/mpeg"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0232 }
            r5 = 7
            goto L_0x00e5
        L_0x005f:
            java.lang.String r0 = "audio/flac"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0232 }
            r5 = 4
            goto L_0x00e5
        L_0x0067:
            java.lang.String r0 = "audio/eac3"
            goto L_0x00e0
        L_0x006a:
            java.lang.String r0 = "audio/3gpp"
            goto L_0x00be
        L_0x006d:
            java.lang.String r0 = "video/mp4"
            goto L_0x00ac
        L_0x0070:
            java.lang.String r0 = "audio/wav"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0232 }
            r5 = 12
            goto L_0x00e5
        L_0x0079:
            java.lang.String r0 = "audio/ogg"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0232 }
            r5 = 9
            goto L_0x00e5
        L_0x0082:
            java.lang.String r0 = "audio/mp4"
            goto L_0x00ac
        L_0x0085:
            java.lang.String r0 = "audio/amr"
            goto L_0x00be
        L_0x0088:
            java.lang.String r0 = "audio/ac4"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0232 }
            r5 = 1
            goto L_0x00e5
        L_0x0090:
            java.lang.String r0 = "audio/ac3"
            goto L_0x00e0
        L_0x0093:
            java.lang.String r0 = "video/x-flv"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0232 }
            r5 = 5
            goto L_0x00e5
        L_0x009b:
            java.lang.String r0 = "application/webm"
            goto L_0x00c6
        L_0x009e:
            java.lang.String r0 = "audio/x-matroska"
            goto L_0x00c6
        L_0x00a1:
            java.lang.String r0 = "text/vtt"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0232 }
            r5 = 13
            goto L_0x00e5
        L_0x00aa:
            java.lang.String r0 = "application/mp4"
        L_0x00ac:
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0232 }
            r5 = 8
            goto L_0x00e5
        L_0x00b3:
            java.lang.String r0 = "image/jpeg"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0232 }
            r5 = 14
            goto L_0x00e5
        L_0x00bc:
            java.lang.String r0 = "audio/amr-wb"
        L_0x00be:
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0232 }
            r5 = 3
            goto L_0x00e5
        L_0x00c4:
            java.lang.String r0 = "video/webm"
        L_0x00c6:
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0232 }
            r5 = 6
            goto L_0x00e5
        L_0x00cc:
            java.lang.String r0 = "video/mp2t"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0232 }
            r5 = 11
            goto L_0x00e5
        L_0x00d5:
            java.lang.String r0 = "video/mp2p"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0232 }
            r5 = 10
            goto L_0x00e5
        L_0x00de:
            java.lang.String r0 = "audio/eac3-joc"
        L_0x00e0:
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0232 }
            r5 = 0
        L_0x00e5:
            if (r0 == 0) goto L_0x00e8
            goto L_0x00ea
        L_0x00e8:
            r5 = -1
            goto L_0x00ed
        L_0x00ea:
            r8.A00(r4, r5)     // Catch:{ all -> 0x0232 }
        L_0x00ed:
            java.lang.String r1 = r9.getLastPathSegment()     // Catch:{ all -> 0x0232 }
            if (r1 == 0) goto L_0x020d
            java.lang.String r0 = ".ac3"
            boolean r0 = r1.endsWith(r0)     // Catch:{ all -> 0x0232 }
            if (r0 != 0) goto L_0x0207
            java.lang.String r0 = ".ec3"
            boolean r0 = r1.endsWith(r0)     // Catch:{ all -> 0x0232 }
            if (r0 != 0) goto L_0x0207
            java.lang.String r0 = ".ac4"
            boolean r0 = r1.endsWith(r0)     // Catch:{ all -> 0x0232 }
            if (r0 == 0) goto L_0x010e
            r6 = 1
            goto L_0x020a
        L_0x010e:
            java.lang.String r0 = ".adts"
            boolean r0 = r1.endsWith(r0)     // Catch:{ all -> 0x0232 }
            if (r0 != 0) goto L_0x0205
            java.lang.String r0 = ".aac"
            boolean r0 = r1.endsWith(r0)     // Catch:{ all -> 0x0232 }
            if (r0 != 0) goto L_0x0205
            java.lang.String r0 = ".amr"
            boolean r0 = r1.endsWith(r0)     // Catch:{ all -> 0x0232 }
            if (r0 == 0) goto L_0x0128
            goto L_0x0209
        L_0x0128:
            java.lang.String r0 = ".flac"
            boolean r0 = r1.endsWith(r0)     // Catch:{ all -> 0x0232 }
            r2 = 4
            if (r0 == 0) goto L_0x0134
            r6 = 4
            goto L_0x020a
        L_0x0134:
            java.lang.String r0 = ".flv"
            boolean r0 = r1.endsWith(r0)     // Catch:{ all -> 0x0232 }
            r7 = 5
            if (r0 == 0) goto L_0x0140
            r6 = 5
            goto L_0x020a
        L_0x0140:
            int r6 = r1.length()     // Catch:{ all -> 0x0232 }
            int r3 = r6 - r2
            java.lang.String r0 = ".mk"
            boolean r0 = r1.startsWith(r0, r3)     // Catch:{ all -> 0x0232 }
            if (r0 != 0) goto L_0x0203
            java.lang.String r0 = ".webm"
            boolean r0 = r1.endsWith(r0)     // Catch:{ all -> 0x0232 }
            if (r0 != 0) goto L_0x0203
            java.lang.String r0 = ".mp3"
            boolean r0 = r1.endsWith(r0)     // Catch:{ all -> 0x0232 }
            if (r0 == 0) goto L_0x0161
            r6 = 7
            goto L_0x020a
        L_0x0161:
            java.lang.String r2 = ".mp4"
            boolean r0 = r1.endsWith(r2)     // Catch:{ all -> 0x0232 }
            if (r0 != 0) goto L_0x0200
            java.lang.String r0 = ".m4"
            boolean r0 = r1.startsWith(r0, r3)     // Catch:{ all -> 0x0232 }
            if (r0 != 0) goto L_0x0200
            int r6 = r6 - r7
            boolean r0 = r1.startsWith(r2, r6)     // Catch:{ all -> 0x0232 }
            if (r0 != 0) goto L_0x0200
            java.lang.String r0 = ".cmf"
            boolean r0 = r1.startsWith(r0, r6)     // Catch:{ all -> 0x0232 }
            if (r0 != 0) goto L_0x0200
            java.lang.String r0 = ".og"
            boolean r0 = r1.startsWith(r0, r3)     // Catch:{ all -> 0x0232 }
            if (r0 != 0) goto L_0x01fd
            java.lang.String r0 = ".opus"
            boolean r0 = r1.endsWith(r0)     // Catch:{ all -> 0x0232 }
            if (r0 != 0) goto L_0x01fd
            java.lang.String r0 = ".ps"
            boolean r0 = r1.endsWith(r0)     // Catch:{ all -> 0x0232 }
            if (r0 != 0) goto L_0x01fa
            java.lang.String r0 = ".mpeg"
            boolean r0 = r1.endsWith(r0)     // Catch:{ all -> 0x0232 }
            if (r0 != 0) goto L_0x01fa
            java.lang.String r0 = ".mpg"
            boolean r0 = r1.endsWith(r0)     // Catch:{ all -> 0x0232 }
            if (r0 != 0) goto L_0x01fa
            java.lang.String r0 = ".m2p"
            boolean r0 = r1.endsWith(r0)     // Catch:{ all -> 0x0232 }
            if (r0 != 0) goto L_0x01fa
            java.lang.String r2 = ".ts"
            boolean r0 = r1.endsWith(r2)     // Catch:{ all -> 0x0232 }
            if (r0 != 0) goto L_0x01f7
            boolean r0 = r1.startsWith(r2, r3)     // Catch:{ all -> 0x0232 }
            if (r0 != 0) goto L_0x01f7
            java.lang.String r0 = ".wav"
            boolean r0 = r1.endsWith(r0)     // Catch:{ all -> 0x0232 }
            if (r0 != 0) goto L_0x01f4
            java.lang.String r0 = ".wave"
            boolean r0 = r1.endsWith(r0)     // Catch:{ all -> 0x0232 }
            if (r0 != 0) goto L_0x01f4
            java.lang.String r0 = ".vtt"
            boolean r0 = r1.endsWith(r0)     // Catch:{ all -> 0x0232 }
            if (r0 != 0) goto L_0x01f1
            java.lang.String r0 = ".webvtt"
            boolean r0 = r1.endsWith(r0)     // Catch:{ all -> 0x0232 }
            if (r0 != 0) goto L_0x01f1
            java.lang.String r0 = ".jpg"
            boolean r0 = r1.endsWith(r0)     // Catch:{ all -> 0x0232 }
            if (r0 != 0) goto L_0x01ee
            java.lang.String r0 = ".jpeg"
            boolean r0 = r1.endsWith(r0)     // Catch:{ all -> 0x0232 }
            if (r0 == 0) goto L_0x020d
        L_0x01ee:
            r6 = 14
            goto L_0x020a
        L_0x01f1:
            r6 = 13
            goto L_0x020a
        L_0x01f4:
            r6 = 12
            goto L_0x020a
        L_0x01f7:
            r6 = 11
            goto L_0x020a
        L_0x01fa:
            r6 = 10
            goto L_0x020a
        L_0x01fd:
            r6 = 9
            goto L_0x020a
        L_0x0200:
            r6 = 8
            goto L_0x020a
        L_0x0203:
            r6 = 6
            goto L_0x020a
        L_0x0205:
            r6 = 2
            goto L_0x020a
        L_0x0207:
            r6 = 0
            goto L_0x020a
        L_0x0209:
            r6 = 3
        L_0x020a:
            if (r6 == r5) goto L_0x0212
            goto L_0x020f
        L_0x020d:
            r6 = -1
            goto L_0x0212
        L_0x020f:
            r8.A00(r4, r6)     // Catch:{ all -> 0x0232 }
        L_0x0212:
            int[] r3 = A01     // Catch:{ all -> 0x0232 }
            int r2 = r3.length     // Catch:{ all -> 0x0232 }
            r1 = 0
        L_0x0216:
            if (r1 >= r2) goto L_0x0224
            r0 = r3[r1]     // Catch:{ all -> 0x0232 }
            if (r0 == r5) goto L_0x0221
            if (r0 == r6) goto L_0x0221
            r8.A00(r4, r0)     // Catch:{ all -> 0x0232 }
        L_0x0221:
            int r1 = r1 + 1
            goto L_0x0216
        L_0x0224:
            int r0 = r4.size()     // Catch:{ all -> 0x0232 }
            X.2it[] r0 = new X.C55132it[r0]     // Catch:{ all -> 0x0232 }
            java.lang.Object[] r0 = r4.toArray(r0)     // Catch:{ all -> 0x0232 }
            X.2it[] r0 = (X.C55132it[]) r0     // Catch:{ all -> 0x0232 }
            monitor-exit(r8)
            return r0
        L_0x0232:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C96664oh.A7N(android.net.Uri, java.util.Map):X.2it[]");
    }
}
