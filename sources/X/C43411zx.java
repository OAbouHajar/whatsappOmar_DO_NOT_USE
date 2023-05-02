package X;

/* renamed from: X.1zx  reason: invalid class name and case insensitive filesystem */
public abstract class C43411zx implements Runnable, C30721cq {
    public final C43381zu A00;

    public C43411zx(C43381zu r1) {
        this.A00 = r1;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v10, resolved type: java.lang.Boolean} */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0234, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0239, code lost:
        if (r1.getMessage() != null) goto L_0x023b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x023b, code lost:
        r1 = r1.getMessage().contains("No space");
        r0 = com.obwhatsapp.R.string.str0852;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0248, code lost:
        if (r1 == false) goto L_0x024a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x024b, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:?, code lost:
        com.whatsapp.util.Log.e("mediatranscodequeue/filenotfound", r1);
        r0 = com.obwhatsapp.R.string.str0846;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0255, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:?, code lost:
        com.whatsapp.util.Log.e("mediatranscodequeue/badaudio", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x025f, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:?, code lost:
        com.whatsapp.util.Log.e("mediatranscodequeue/illegalstate", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0265, code lost:
        r0 = com.obwhatsapp.R.string.str0859;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0019, code lost:
        if (r8.exists() != false) goto L_0x001b;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:106:0x0173 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x008b */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0234 A[ExcHandler: IOException (r1v6 'e' java.io.IOException A[CUSTOM_DECLARE]), Splitter:B:112:0x018d] */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x024b A[ExcHandler: FileNotFoundException (r1v5 'e' java.io.FileNotFoundException A[CUSTOM_DECLARE]), Splitter:B:112:0x018d] */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x0255 A[ExcHandler: 3yN (r1v4 'e' X.3yN A[CUSTOM_DECLARE]), Splitter:B:112:0x018d] */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x025f A[ExcHandler: IllegalStateException (r1v3 'e' java.lang.IllegalStateException A[CUSTOM_DECLARE]), Splitter:B:112:0x018d] */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x028d  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x029d  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0031  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass21C A01() {
        /*
            r14 = this;
            r3 = r14
            boolean r0 = r14 instanceof X.AnonymousClass206
            if (r0 == 0) goto L_0x012d
            X.206 r3 = (X.AnonymousClass206) r3
            X.205 r5 = r3.A04
            java.lang.String r10 = r5.A01
            r4 = 1
            r13 = 0
            if (r10 == 0) goto L_0x004f
            X.01Z r0 = r3.A02
            java.io.File r8 = r0.A03(r10)
            boolean r0 = r8.exists()
            if (r0 == 0) goto L_0x0050
        L_0x001b:
            r13 = 1
        L_0x001c:
            X.AnonymousClass00B.A06(r8)
            java.lang.String r0 = r8.getAbsolutePath()
            X.AnonymousClass00B.A06(r0)
            long r6 = r8.length()
            r1 = 1048576(0x100000, double:5.180654E-318)
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0041
            r0 = 2131891869(0x7f12169d, float:1.941847E38)
        L_0x0034:
            r5.A00(r0)
            r12 = -1
            r13 = 0
            r9 = 0
        L_0x003a:
            X.3uj r7 = new X.3uj
            r11 = r9
            r7.<init>(r8, r9, r10, r11, r12, r13)
            return r7
        L_0x0041:
            java.lang.String r0 = r8.getAbsolutePath()
            com.whatsapp.stickers.WebpInfo r0 = com.whatsapp.stickers.WebpUtils.verifyWebpFileIntegrity(r0)
            if (r0 != 0) goto L_0x010c
            r0 = 2131887017(0x7f1203a9, float:1.940863E38)
            goto L_0x0034
        L_0x004f:
            r8 = 0
        L_0x0050:
            java.io.File r1 = r5.A02
            if (r1 == 0) goto L_0x005c
            boolean r0 = r1.exists()
            if (r0 == 0) goto L_0x005c
            r8 = r1
            goto L_0x001b
        L_0x005c:
            java.io.File r2 = r5.A06
            java.lang.String r6 = r5.A03
            if (r6 == 0) goto L_0x008c
            X.0tz r0 = r3.A03     // Catch:{ Exception -> 0x0093 }
            android.content.Context r0 = r0.A00     // Catch:{ Exception -> 0x0093 }
            android.content.ContentResolver r1 = r0.getContentResolver()     // Catch:{ Exception -> 0x0093 }
            android.net.Uri r0 = android.net.Uri.parse(r6)     // Catch:{ Exception -> 0x0093 }
            java.io.InputStream r6 = r1.openInputStream(r0)     // Catch:{ Exception -> 0x0093 }
            if (r6 != 0) goto L_0x007a
            java.lang.String r0 = "ProcessStickerTask/copyStickerFileFromUri failed to open input stream"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0085 }
            goto L_0x0091
        L_0x007a:
            r0 = 500000(0x7a120, double:2.47033E-318)
            boolean r0 = X.AnonymousClass1XI.A0R(r2, r6, r0)     // Catch:{ all -> 0x0085 }
            r6.close()     // Catch:{ Exception -> 0x0093 }
            goto L_0x009a
        L_0x0085:
            r0 = move-exception
            if (r6 == 0) goto L_0x008b
            r6.close()     // Catch:{ all -> 0x008b }
        L_0x008b:
            throw r0     // Catch:{ Exception -> 0x0093 }
        L_0x008c:
            java.lang.String r0 = "ProcessStickerTask/copyStickerFileFromUri/sticker uri is null "
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0091:
            r0 = 0
            goto L_0x009a
        L_0x0093:
            r1 = move-exception
            java.lang.String r0 = "ProcessStickerTask/copyStickerFileFromUri/copyStickerFileFromUri exception "
            com.whatsapp.util.Log.e(r0, r1)
            r0 = 0
        L_0x009a:
            r9 = 0
            if (r0 == 0) goto L_0x00eb
            java.lang.String r0 = r2.getAbsolutePath()
            com.whatsapp.stickers.WebpInfo r6 = com.whatsapp.stickers.WebpUtils.verifyWebpFileIntegrity(r0)
            if (r6 == 0) goto L_0x00e3
            int r0 = r6.height
            r1 = 512(0x200, float:7.175E-43)
            if (r0 != r1) goto L_0x00e3
            int r0 = r6.width
            if (r0 != r1) goto L_0x00e3
            X.1XO r0 = r5.A00
            if (r0 == 0) goto L_0x00e6
            byte[] r0 = r0.A01()
            boolean r0 = com.whatsapp.stickers.WebpUtils.A01(r2, r0)
            if (r0 == 0) goto L_0x00e6
            java.lang.String r10 = X.C37981q3.A00(r2)     // Catch:{ IOException -> 0x00db }
            if (r10 == 0) goto L_0x00f7
            X.01Z r0 = r3.A02
            java.io.File r8 = r0.A03(r10)
            boolean r0 = r8.exists()
            if (r0 != 0) goto L_0x00d9
            X.0sb r0 = r3.A01     // Catch:{ IOException -> 0x00ed }
            X.0tB r0 = r0.A04     // Catch:{ IOException -> 0x00ed }
            X.AnonymousClass1XI.A0C(r0, r2, r8)     // Catch:{ IOException -> 0x00ed }
            goto L_0x00f3
        L_0x00d9:
            r13 = 1
            goto L_0x00f7
        L_0x00db:
            r1 = move-exception
            java.lang.String r0 = "ProcessStickerTask/processMedia/unable to get sticker hash"
            com.whatsapp.util.Log.e(r0, r1)
            r10 = r9
            goto L_0x00f7
        L_0x00e3:
            java.lang.String r0 = "ProcessStickerTask/processMedia/sticker uri in processMediaRequestData was invalid"
            goto L_0x00e8
        L_0x00e6:
            java.lang.String r0 = "ProcessStickerTask/processMedia/there is no sticker metadata object in processMediaRequestData"
        L_0x00e8:
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x00eb:
            r10 = r9
            goto L_0x00f7
        L_0x00ed:
            r1 = move-exception
            java.lang.String r0 = "ProcessStickerTask/processMedia failed to move file to destination "
            com.whatsapp.util.Log.e(r0, r1)
        L_0x00f3:
            boolean r13 = r8.exists()
        L_0x00f7:
            boolean r0 = r2.exists()
            if (r0 == 0) goto L_0x0100
            r2.delete()
        L_0x0100:
            if (r13 != 0) goto L_0x001c
            r0 = 2131891709(0x7f1215fd, float:1.9418146E38)
            r5.A00(r0)
            r12 = -1
            r13 = 0
            goto L_0x003a
        L_0x010c:
            int r0 = r0.numFrames
            if (r0 <= r4) goto L_0x0124
            java.lang.String r0 = r8.getAbsolutePath()
            int r12 = com.whatsapp.stickers.WebpUtils.getFirstWebpThumbnailMinimumFileLength(r0)
            byte[] r11 = r3.A02(r8)
            java.lang.Boolean r9 = java.lang.Boolean.TRUE
        L_0x011e:
            X.3uj r7 = new X.3uj
            r7.<init>(r8, r9, r10, r11, r12, r13)
            return r7
        L_0x0124:
            byte[] r11 = r3.A02(r8)
            r12 = -1
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            r13 = 1
            goto L_0x011e
        L_0x012d:
            boolean r0 = r14 instanceof X.AnonymousClass208
            if (r0 == 0) goto L_0x0180
            X.208 r3 = (X.AnonymousClass208) r3
            X.207 r2 = r3.A01
            java.lang.String r0 = r2.A00
            android.net.Uri r1 = android.net.Uri.parse(r0)
            r5 = 0
            r4 = 0
            if (r1 != 0) goto L_0x0145
            X.3uh r3 = new X.3uh
            r3.<init>(r4, r5)
            return r3
        L_0x0145:
            java.io.File r2 = r2.A06
            X.0tz r0 = r3.A00     // Catch:{ IOException -> 0x0174 }
            android.content.Context r0 = r0.A00     // Catch:{ IOException -> 0x0174 }
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch:{ IOException -> 0x0174 }
            java.io.InputStream r1 = r0.openInputStream(r1)     // Catch:{ IOException -> 0x0174 }
            if (r1 == 0) goto L_0x0162
            X.AnonymousClass1XI.A0Q(r2, r1)     // Catch:{ all -> 0x016d }
            r0 = 1
            X.3uh r3 = new X.3uh     // Catch:{ all -> 0x016d }
            r3.<init>(r2, r0)     // Catch:{ all -> 0x016d }
            r1.close()     // Catch:{ IOException -> 0x0174 }
            return r3
        L_0x0162:
            java.lang.String r0 = "ProcessCopyTask/processMedia failed to open input stream"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x016d }
            X.3uh r3 = new X.3uh     // Catch:{ all -> 0x016d }
            r3.<init>(r4, r5)     // Catch:{ all -> 0x016d }
            return r3
        L_0x016d:
            r0 = move-exception
            if (r1 == 0) goto L_0x0173
            r1.close()     // Catch:{ all -> 0x0173 }
        L_0x0173:
            throw r0     // Catch:{ IOException -> 0x0174 }
        L_0x0174:
            r1 = move-exception
            java.lang.String r0 = "ProcessCopyTask/processMedia exception "
            com.whatsapp.util.Log.e(r0, r1)
            X.3uh r3 = new X.3uh
            r3.<init>(r4, r5)
            return r3
        L_0x0180:
            X.202 r3 = (X.AnonymousClass202) r3
            X.201 r5 = r3.A04
            java.io.File r2 = r5.A06
            java.io.File r8 = r5.A00
            long r12 = X.C17970vw.A04(r8)
            r4 = 0
            android.os.PowerManager$WakeLock r6 = r3.A00     // Catch:{ IllegalStateException -> 0x025f, 3yN -> 0x0255, FileNotFoundException -> 0x024b, IOException -> 0x0234, 20O -> 0x022d }
            if (r6 == 0) goto L_0x0194
            r6.acquire()     // Catch:{ IllegalStateException -> 0x025f, 3yN -> 0x0255, FileNotFoundException -> 0x024b, IOException -> 0x0234, 20O -> 0x022d }
        L_0x0194:
            boolean r0 = r5.A01     // Catch:{ IllegalStateException -> 0x025f, 3yN -> 0x0255, FileNotFoundException -> 0x024b, IOException -> 0x0234, 20O -> 0x022d }
            java.lang.String r7 = "audio was not transcoded correctly"
            if (r0 == 0) goto L_0x01fd
            boolean r0 = X.C43311zn.A00(r8)     // Catch:{ IllegalStateException -> 0x025f, 3yN -> 0x0255, FileNotFoundException -> 0x024b, IOException -> 0x0234, 20O -> 0x022d }
            if (r0 == 0) goto L_0x01f0
            java.lang.String r0 = "mediatranscodequeue/audio/transcode"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IllegalStateException -> 0x025f, 3yN -> 0x0255, FileNotFoundException -> 0x024b, IOException -> 0x0234, 20O -> 0x022d }
            r9 = 0
            r11 = 96000(0x17700, float:1.34525E-40)
            int r0 = (r12 > r9 ? 1 : (r12 == r9 ? 0 : -1))
            if (r0 != 0) goto L_0x01b2
            r9 = 96000(0x17700, float:1.34525E-40)
            goto L_0x01bb
        L_0x01b2:
            long r0 = r8.length()     // Catch:{ IllegalStateException -> 0x025f, 3yN -> 0x0255, FileNotFoundException -> 0x024b, IOException -> 0x0234, 20O -> 0x022d }
            r9 = 8000(0x1f40, double:3.9525E-320)
            long r0 = r0 * r9
            long r0 = r0 / r12
            int r9 = (int) r0     // Catch:{ IllegalStateException -> 0x025f, 3yN -> 0x0255, FileNotFoundException -> 0x024b, IOException -> 0x0234, 20O -> 0x022d }
        L_0x01bb:
            r1 = 12200(0x2fa8, float:1.7096E-41)
            int r0 = java.lang.Math.min(r9, r11)     // Catch:{ IllegalStateException -> 0x025f, 3yN -> 0x0255, FileNotFoundException -> 0x024b, IOException -> 0x0234, 20O -> 0x022d }
            int r1 = java.lang.Math.max(r1, r0)     // Catch:{ IllegalStateException -> 0x025f, 3yN -> 0x0255, FileNotFoundException -> 0x024b, IOException -> 0x0234, 20O -> 0x022d }
            X.4NM r0 = new X.4NM     // Catch:{ IllegalStateException -> 0x025f, 3yN -> 0x0255, FileNotFoundException -> 0x024b, IOException -> 0x0234, 20O -> 0x022d }
            r0.<init>(r8, r2)     // Catch:{ IllegalStateException -> 0x025f, 3yN -> 0x0255, FileNotFoundException -> 0x024b, IOException -> 0x0234, 20O -> 0x022d }
            r0.A00 = r1     // Catch:{ IllegalStateException -> 0x025f, 3yN -> 0x0255, FileNotFoundException -> 0x024b, IOException -> 0x0234, 20O -> 0x022d }
            X.1zn r1 = new X.1zn     // Catch:{ IllegalStateException -> 0x025f, 3yN -> 0x0255, FileNotFoundException -> 0x024b, IOException -> 0x0234, 20O -> 0x022d }
            r1.<init>(r0)     // Catch:{ IllegalStateException -> 0x025f, 3yN -> 0x0255, FileNotFoundException -> 0x024b, IOException -> 0x0234, 20O -> 0x022d }
            com.facebook.redex.IDxListenerShape345S0100000_2_I0 r0 = new com.facebook.redex.IDxListenerShape345S0100000_2_I0     // Catch:{ IllegalStateException -> 0x025f, 3yN -> 0x0255, FileNotFoundException -> 0x024b, IOException -> 0x0234, 20O -> 0x022d }
            r0.<init>(r5, r4)     // Catch:{ IllegalStateException -> 0x025f, 3yN -> 0x0255, FileNotFoundException -> 0x024b, IOException -> 0x0234, 20O -> 0x022d }
            r1.A01 = r0     // Catch:{ IllegalStateException -> 0x025f, 3yN -> 0x0255, FileNotFoundException -> 0x024b, IOException -> 0x0234, 20O -> 0x022d }
            r5.A01(r1)     // Catch:{ IllegalStateException -> 0x025f, 3yN -> 0x0255, FileNotFoundException -> 0x024b, IOException -> 0x0234, 20O -> 0x022d }
            r1.A01()     // Catch:{ IllegalStateException -> 0x025f, 3yN -> 0x0255, FileNotFoundException -> 0x024b, IOException -> 0x0234, 20O -> 0x022d }
            boolean r0 = r1.A08     // Catch:{ IllegalStateException -> 0x025f, 3yN -> 0x0255, FileNotFoundException -> 0x024b, IOException -> 0x0234, 20O -> 0x022d }
            if (r0 != 0) goto L_0x027a
            X.1QS r0 = r3.A05     // Catch:{ IllegalStateException -> 0x025f, 3yN -> 0x0255, FileNotFoundException -> 0x024b, IOException -> 0x0234, 20O -> 0x022d }
            boolean r0 = r0.A0D(r2)     // Catch:{ IllegalStateException -> 0x025f, 3yN -> 0x0255, FileNotFoundException -> 0x024b, IOException -> 0x0234, 20O -> 0x022d }
            if (r0 != 0) goto L_0x0220
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ IllegalStateException -> 0x025f, 3yN -> 0x0255, FileNotFoundException -> 0x024b, IOException -> 0x0234, 20O -> 0x022d }
            r0.<init>(r7)     // Catch:{ IllegalStateException -> 0x025f, 3yN -> 0x0255, FileNotFoundException -> 0x024b, IOException -> 0x0234, 20O -> 0x022d }
            throw r0     // Catch:{ IllegalStateException -> 0x025f, 3yN -> 0x0255, FileNotFoundException -> 0x024b, IOException -> 0x0234, 20O -> 0x022d }
        L_0x01f0:
            java.lang.String r0 = "mediatranscodequeue/audio/cannot-transcode"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IllegalStateException -> 0x025f, 3yN -> 0x0255, FileNotFoundException -> 0x024b, IOException -> 0x0234, 20O -> 0x022d }
            java.lang.String r1 = "cannot transcode audio"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ IllegalStateException -> 0x025f, 3yN -> 0x0255, FileNotFoundException -> 0x024b, IOException -> 0x0234, 20O -> 0x022d }
            r0.<init>(r1)     // Catch:{ IllegalStateException -> 0x025f, 3yN -> 0x0255, FileNotFoundException -> 0x024b, IOException -> 0x0234, 20O -> 0x022d }
            throw r0     // Catch:{ IllegalStateException -> 0x025f, 3yN -> 0x0255, FileNotFoundException -> 0x024b, IOException -> 0x0234, 20O -> 0x022d }
        L_0x01fd:
            X.1QS r1 = r3.A05     // Catch:{ IllegalStateException -> 0x025f, 3yN -> 0x0255, FileNotFoundException -> 0x024b, IOException -> 0x0234, 20O -> 0x022d }
            boolean r0 = r1.A0D(r8)     // Catch:{ IllegalStateException -> 0x025f, 3yN -> 0x0255, FileNotFoundException -> 0x024b, IOException -> 0x0234, 20O -> 0x022d }
            if (r0 == 0) goto L_0x0222
            java.lang.String r0 = "mediatranscodequeue/audio/copy-and-repair"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IllegalStateException -> 0x025f, 3yN -> 0x0255, FileNotFoundException -> 0x024b, IOException -> 0x0234, 20O -> 0x022d }
            X.0sb r0 = r3.A02     // Catch:{ IllegalStateException -> 0x025f, 3yN -> 0x0255, FileNotFoundException -> 0x024b, IOException -> 0x0234, 20O -> 0x022d }
            X.0tB r0 = r0.A04     // Catch:{ IllegalStateException -> 0x025f, 3yN -> 0x0255, FileNotFoundException -> 0x024b, IOException -> 0x0234, 20O -> 0x022d }
            X.AnonymousClass1XI.A0B(r0, r8, r2)     // Catch:{ IllegalStateException -> 0x025f, 3yN -> 0x0255, FileNotFoundException -> 0x024b, IOException -> 0x0234, 20O -> 0x022d }
            X.1zC r0 = X.AnonymousClass1QS.A04(r2, r4)     // Catch:{ IllegalStateException -> 0x025f, 3yN -> 0x0255, FileNotFoundException -> 0x024b, IOException -> 0x0234, 20O -> 0x022d }
            int r1 = r0.A01     // Catch:{ IllegalStateException -> 0x025f, 3yN -> 0x0255, FileNotFoundException -> 0x024b, IOException -> 0x0234, 20O -> 0x022d }
            r0 = 2
            if (r1 != r0) goto L_0x0220
            com.whatsapp.Mp4Ops.A03(r2, r4)     // Catch:{ 20O -> 0x021e, IllegalStateException -> 0x025f, 3yN -> 0x0255, FileNotFoundException -> 0x024b, IOException -> 0x0234 }
            goto L_0x0220
        L_0x021e:
            r0 = move-exception
            throw r0     // Catch:{ IllegalStateException -> 0x025f, 3yN -> 0x0255, FileNotFoundException -> 0x024b, IOException -> 0x0234, 20O -> 0x022d }
        L_0x0220:
            r3 = 1
            goto L_0x027b
        L_0x0222:
            java.lang.String r0 = "mediatranscodequeue/audio/ineligible-file"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IllegalStateException -> 0x025f, 3yN -> 0x0255, FileNotFoundException -> 0x024b, IOException -> 0x0234, 20O -> 0x022d }
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ IllegalStateException -> 0x025f, 3yN -> 0x0255, FileNotFoundException -> 0x024b, IOException -> 0x0234, 20O -> 0x022d }
            r0.<init>(r7)     // Catch:{ IllegalStateException -> 0x025f, 3yN -> 0x0255, FileNotFoundException -> 0x024b, IOException -> 0x0234, 20O -> 0x022d }
            throw r0     // Catch:{ IllegalStateException -> 0x025f, 3yN -> 0x0255, FileNotFoundException -> 0x024b, IOException -> 0x0234, 20O -> 0x022d }
        L_0x022d:
            r1 = move-exception
            java.lang.String r0 = "mediatranscodequeue/libmp4muxexception"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x02a0 }
            goto L_0x025b
        L_0x0234:
            r1 = move-exception
            java.lang.String r0 = r1.getMessage()     // Catch:{ all -> 0x02a0 }
            if (r0 == 0) goto L_0x0265
            java.lang.String r1 = r1.getMessage()     // Catch:{ all -> 0x02a0 }
            java.lang.String r0 = "No space"
            boolean r1 = r1.contains(r0)     // Catch:{ all -> 0x02a0 }
            r0 = 2131888210(0x7f120852, float:1.9411049E38)
            if (r1 != 0) goto L_0x0268
            goto L_0x0265
        L_0x024b:
            r1 = move-exception
            java.lang.String r0 = "mediatranscodequeue/filenotfound"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x02a0 }
            r0 = 2131888198(0x7f120846, float:1.9411025E38)
            goto L_0x0268
        L_0x0255:
            r1 = move-exception
            java.lang.String r0 = "mediatranscodequeue/badaudio"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x02a0 }
        L_0x025b:
            r0 = 2131888186(0x7f12083a, float:1.9411E38)
            goto L_0x0268
        L_0x025f:
            r1 = move-exception
            java.lang.String r0 = "mediatranscodequeue/illegalstate"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x02a0 }
        L_0x0265:
            r0 = 2131888217(0x7f120859, float:1.9411063E38)
        L_0x0268:
            r5.A00(r0)     // Catch:{ all -> 0x02a0 }
            android.os.PowerManager$WakeLock r1 = r3.A00
            if (r1 == 0) goto L_0x0278
            boolean r0 = r1.isHeld()
            if (r0 == 0) goto L_0x0278
            r1.release()
        L_0x0278:
            r3 = 0
            goto L_0x0286
        L_0x027a:
            r3 = 0
        L_0x027b:
            if (r6 == 0) goto L_0x0286
            boolean r0 = r6.isHeld()
            if (r0 == 0) goto L_0x0286
            r6.release()
        L_0x0286:
            X.3ue r1 = new X.3ue
            r1.<init>()
            if (r3 == 0) goto L_0x029d
            int r0 = X.C17970vw.A03(r2)
            r1.A00 = r0
            r1.A00 = r2
            r0 = 1
            r1.A02 = r0
        L_0x0298:
            X.3ui r0 = r1.A00()
            return r0
        L_0x029d:
            r1.A02 = r4
            goto L_0x0298
        L_0x02a0:
            r2 = move-exception
            android.os.PowerManager$WakeLock r1 = r3.A00
            if (r1 == 0) goto L_0x02ae
            boolean r0 = r1.isHeld()
            if (r0 == 0) goto L_0x02ae
            r1.release()
        L_0x02ae:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43411zx.A01():X.21C");
    }

    public synchronized void cancel() {
        C43301zm r0;
        C43381zu r1 = this.A00;
        synchronized (r1) {
            r0 = r1.A00;
        }
        if (r0 != null) {
            r0.cancel();
        }
    }

    public void run() {
        this.A00.A05.ARN(A01());
    }
}
