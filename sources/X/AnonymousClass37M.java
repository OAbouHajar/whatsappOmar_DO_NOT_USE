package X;

import java.util.Iterator;

/* renamed from: X.37M  reason: invalid class name */
public class AnonymousClass37M extends C16690tT {
    public final int A00;
    public final C16490t9 A01;
    public final C211613a A02;
    public final AnonymousClass14W A03;
    public final AnonymousClass5QS A04;
    public final C20080zT A05;
    public final C214714f A06;
    public final Integer A07;
    public final String A08;
    public final boolean A09;

    public AnonymousClass37M(C16490t9 r1, C211613a r2, AnonymousClass14W r3, AnonymousClass5QS r4, C20080zT r5, C214714f r6, Integer num, String str, int i2, boolean z2) {
        this.A02 = r2;
        this.A03 = r3;
        this.A06 = r6;
        this.A05 = r5;
        this.A08 = str;
        this.A04 = r4;
        this.A01 = r1;
        this.A00 = i2;
        this.A09 = z2;
        this.A07 = num;
    }

    /* JADX WARNING: type inference failed for: r0v205, types: [X.1pi] */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00a6, code lost:
        if ((!r0.isEmpty()) != false) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x022e, code lost:
        if (r0 == false) goto L_0x0230;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0249, code lost:
        r10 = new X.C41211vQ(X.AnonymousClass000.A0V("cancelled"));
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:187:0x0556 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:208:0x05b2 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:79:0x0200 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:87:0x0220 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0258  */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x05b8  */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x0252 A[EDGE_INSN: B:227:0x0252->B:99:0x0252 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x01c3  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x023b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r23) {
        /*
            r22 = this;
            r1 = r23
            X.1pi[] r1 = (X.C37771pi[]) r1
            r2 = r22
            X.14f r7 = r2.A06
            r0 = 0
            r1 = r1[r0]
            X.528 r10 = new X.528
            r10.<init>(r2)
            java.lang.Integer r6 = r2.A07
            r5 = 0
            X.C18450wi.A0H(r1, r0)
            r4 = 1
            X.14d r0 = r7.A0A
            r0.A00()
            X.37M r0 = r10.A00
            X.0tU r8 = r0.A02
            boolean r0 = r8.isCancelled()
            r3 = 0
            if (r0 == 0) goto L_0x002f
            java.lang.String r0 = "cancelled"
            X.4Mf r6 = new X.4Mf
            r6.<init>(r3, r0, r3, r5)
            return r6
        L_0x002f:
            r19 = r1
            boolean r0 = r1.A0Q
            if (r0 == 0) goto L_0x0063
            java.util.List r0 = r1.A04
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x009b
            X.14a r13 = r7.A02
            X.1kE r12 = new X.1kE
            r12.<init>()
            X.5FO r11 = new X.5FO
            r11.<init>(r12)
            X.5FP r9 = new X.5FP
            r9.<init>(r12)
            X.0sq r2 = r13.A01
            com.facebook.redex.RunnableRunnableShape1S0300000_I0_1 r0 = new com.facebook.redex.RunnableRunnableShape1S0300000_I0_1
            r0.<init>(r13, r9, r11)
            r2.Aco(r0)
            java.lang.Object r19 = r12.get()     // Catch:{ all -> 0x006c }
            r0 = r19
            X.1pi r0 = (X.C37771pi) r0     // Catch:{ all -> 0x006c }
            r19 = r0
            goto L_0x0074
        L_0x0063:
            X.14b r2 = r7.A06
            java.lang.String r0 = r1.A0F
            X.1pi r19 = r2.A00(r3, r0)
            goto L_0x008b
        L_0x006c:
            r2 = move-exception
            X.1vQ r19 = new X.1vQ
            r0 = r19
            r0.<init>(r2)
        L_0x0074:
            java.lang.Throwable r0 = X.C41201vP.A00(r19)
            if (r0 == 0) goto L_0x007d
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
        L_0x007d:
            r0 = r19
            boolean r0 = r0 instanceof X.C41211vQ
            if (r0 == 0) goto L_0x0085
            r19 = 0
        L_0x0085:
            r0 = r19
            X.1pi r0 = (X.C37771pi) r0
            r19 = r0
        L_0x008b:
            if (r19 != 0) goto L_0x00a8
            java.lang.String r2 = r1.A0F
            java.lang.String r0 = "StickerPackDownloader/StickerError/could not get sticker pack by id, sticker pack id: "
            java.lang.String r0 = X.C18450wi.A06(r0, r2)
            X.4Mf r6 = new X.4Mf
            r6.<init>(r1, r0, r3, r5)
            return r6
        L_0x009b:
            java.util.List r0 = r1.A04
            X.C18450wi.A0B(r0)
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0063
        L_0x00a8:
            X.13p r9 = r7.A09
            X.AnonymousClass00B.A00()
            r0 = r19
            boolean r0 = r0.A0R
            if (r0 != 0) goto L_0x0116
            java.lang.String r0 = "https://static.whatsapp.net/sticker?img="
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            r0 = r19
            java.lang.String r0 = r0.A0L
            java.lang.String r2 = X.AnonymousClass000.A0h(r0, r1)
            if (r2 == 0) goto L_0x0116
            X.0pd r11 = r9.A02
            r1 = 2565(0xa05, float:3.594E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r11.A0E(r0, r1)
            if (r0 != r4) goto L_0x023b
            X.13o r0 = r9.A04
            java.lang.String r2 = r0.A00(r2)
        L_0x00d5:
            X.C18450wi.A0E(r2)
            r0 = r19
            boolean r0 = r0.A0Q
            if (r0 == 0) goto L_0x01c3
            r0 = r19
            java.lang.String r0 = r0.A0F
            X.C18450wi.A0B(r0)
            java.io.File r11 = r9.A00(r0)
            if (r11 == 0) goto L_0x0116
            X.0tz r0 = r9.A01
            android.content.Context r1 = r0.A00
            r0 = 2131231481(0x7f0802f9, float:1.8079044E38)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass00T.A04(r1, r0)
            android.graphics.drawable.BitmapDrawable r0 = (android.graphics.drawable.BitmapDrawable) r0
            android.graphics.Bitmap r12 = r0.getBitmap()
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream
            r2.<init>()
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.PNG
            r0 = 100
            r12.compress(r1, r0, r2)
            byte[] r0 = r2.toByteArray()
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream
            r2.<init>(r0)
            r0 = 2048(0x800, double:1.0118E-320)
            X.AnonymousClass1XI.A0R(r11, r2, r0)
        L_0x0116:
            r0 = r19
            java.util.List r2 = r0.A04
            X.C18450wi.A0B(r2)
            int r12 = r2.size()
            X.54b r11 = new X.54b
            r11.<init>()
            X.5Ex r1 = new X.5Ex
            r1.<init>(r0, r10, r11, r12)
            java.util.List r0 = r0.A04
            X.C18450wi.A0B(r0)
            java.util.ArrayList r10 = X.AnonymousClass1J9.A0N(r0)
            java.util.Iterator r17 = r0.iterator()
        L_0x0138:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x0252
            java.lang.Object r13 = r17.next()
            X.1jm r13 = (X.C34151jm) r13
            boolean r0 = r8.isCancelled()
            java.lang.String r16 = "cancelled"
            if (r0 != 0) goto L_0x0249
            X.14V r14 = r7.A08
            X.C18450wi.A09(r13)
            java.lang.String r15 = r13.A0D
            if (r15 == 0) goto L_0x01a6
            int r0 = r15.length()
            if (r0 == 0) goto L_0x01a6
            X.01Z r12 = r14.A00
            java.io.File r0 = r12.A02(r15)
            if (r0 != 0) goto L_0x019d
            java.io.File r12 = r12.A03(r15)
            X.14U r0 = r14.A01
            java.io.File r12 = r0.A00(r13, r12)
            if (r12 == 0) goto L_0x01a9
            java.lang.String r0 = r12.getAbsolutePath()
            r13.A09 = r0
            r13.A01 = r4
            java.lang.String r0 = r12.getAbsolutePath()
            byte[] r0 = com.whatsapp.stickers.WebpUtils.fetchWebpMetadata(r0)
            X.1XO r0 = X.AnonymousClass1XO.A00(r0)
            r13.A04 = r0
        L_0x0185:
            X.3y4 r12 = new X.3y4
            r12.<init>(r13)
        L_0x018a:
            boolean r0 = r12 instanceof X.C78443y3
            if (r0 != 0) goto L_0x0249
            boolean r0 = r12 instanceof X.C78453y4
            if (r0 == 0) goto L_0x0243
            r1.AIT()
            X.3y4 r12 = (X.C78453y4) r12
            X.1jm r0 = r12.A00
            r10.add(r0)
            goto L_0x0138
        L_0x019d:
            java.lang.String r0 = r0.getAbsolutePath()
            r13.A09 = r0
            r13.A01 = r4
            goto L_0x0185
        L_0x01a6:
            java.lang.String r0 = "StickerDownloader/error: plain file hash is null or empty"
            goto L_0x01bd
        L_0x01a9:
            java.lang.String r0 = "StickerDownloader/error: sticker download failed, could not save file (hash="
            java.lang.StringBuilder r12 = X.AnonymousClass000.A0r(r0)
            java.lang.String r0 = r13.A0D
            r12.append(r0)
            r0 = 41
            r12.append(r0)
            java.lang.String r0 = r12.toString()
        L_0x01bd:
            X.3y3 r12 = new X.3y3
            r12.<init>(r0)
            goto L_0x018a
        L_0x01c3:
            X.13n r14 = r9.A05
            r0 = r19
            java.lang.String r11 = r0.A0F
            X.C18450wi.A0B(r11)
            java.io.File r13 = r9.A00(r11)
            java.lang.String r15 = "StaticContentDownloader/download/error downloading: "
            if (r13 == 0) goto L_0x0230
            X.0zG r0 = r14.A01     // Catch:{ IOException -> 0x0221 }
            X.1pl r12 = r0.AFY(r2)     // Catch:{ IOException -> 0x0221 }
            int r1 = r12.A6O()     // Catch:{ all -> 0x021c }
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 != r0) goto L_0x0201
            X.0ua r1 = r14.A00     // Catch:{ all -> 0x021c }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x021c }
            java.io.InputStream r0 = r12.A9k(r1, r0, r0)     // Catch:{ all -> 0x021c }
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream     // Catch:{ all -> 0x021c }
            r1.<init>(r0)     // Catch:{ all -> 0x021c }
            boolean r0 = X.AnonymousClass1XI.A0Q(r13, r1)     // Catch:{ all -> 0x01fc }
            r1.close()     // Catch:{ all -> 0x021c }
            r12.close()     // Catch:{ IOException -> 0x0221 }
            goto L_0x022e
        L_0x01fc:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0200 }
        L_0x0200:
            throw r0     // Catch:{ all -> 0x021c }
        L_0x0201:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0q(r15)     // Catch:{ all -> 0x021c }
            r1.append(r2)     // Catch:{ all -> 0x021c }
            java.lang.String r0 = ", returned code: "
            r1.append(r0)     // Catch:{ all -> 0x021c }
            int r0 = r12.A6O()     // Catch:{ all -> 0x021c }
            java.lang.String r0 = X.AnonymousClass000.A0l(r1, r0)     // Catch:{ all -> 0x021c }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x021c }
            r12.close()     // Catch:{ IOException -> 0x0221 }
            goto L_0x0230
        L_0x021c:
            r0 = move-exception
            r12.close()     // Catch:{ all -> 0x0220 }
        L_0x0220:
            throw r0     // Catch:{ IOException -> 0x0221 }
        L_0x0221:
            r1 = move-exception
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0q(r15)
            java.lang.String r0 = X.AnonymousClass000.A0h(r2, r0)
            com.whatsapp.util.Log.e(r0, r1)
            goto L_0x0230
        L_0x022e:
            if (r0 != 0) goto L_0x0116
        L_0x0230:
            java.lang.String r0 = "StickerPackTrayIconDownloader/failed to download tray icon for sticker pack "
            java.lang.String r0 = X.C18450wi.A06(r0, r11)
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x0116
        L_0x023b:
            if (r0 == 0) goto L_0x00d5
            X.2Xe r0 = new X.2Xe
            r0.<init>()
            throw r0
        L_0x0243:
            X.2Xe r0 = new X.2Xe
            r0.<init>()
            throw r0
        L_0x0249:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0V(r16)
            X.1vQ r10 = new X.1vQ
            r10.<init>(r0)
        L_0x0252:
            java.lang.Throwable r8 = X.C41201vP.A00(r10)
            if (r8 != 0) goto L_0x05b8
            java.util.List r10 = (java.util.List) r10
            r0 = r19
            r0.A04 = r10
            java.lang.String r8 = "stickers_downloaded"
            if (r6 == 0) goto L_0x026c
            X.0yX r1 = r7.A03
            int r0 = r6.intValue()
            r1.AL5(r0, r8)
        L_0x026c:
            r0 = r19
            java.lang.String r8 = r0.A0F
            java.lang.String r0 = "StickerPackDownloader/finished fetching stickers/sticker pack id: "
            java.lang.String r0 = X.C18450wi.A06(r0, r8)
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = r19
            boolean r0 = r0.A0Q
            r16 = r0
            if (r0 == 0) goto L_0x028c
            r0 = r19
            java.lang.String r11 = r0.A0K
            if (r11 != 0) goto L_0x02c2
            java.lang.String r0 = "StickerPackDownloader/avatar stickerpack without tray icon template"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x028c:
            X.14X r10 = r7.A0B
            X.1pi r1 = r10.A01(r8)
            if (r1 == 0) goto L_0x03de
            java.lang.String r0 = "StickerPackDownloader/deletePreviouslyInstalledStickerPack"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.util.List r0 = r1.A04
            X.C18450wi.A0B(r0)
            java.util.Iterator r9 = r0.iterator()
        L_0x02a2:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x03d1
            java.lang.Object r1 = r9.next()
            X.1jm r1 = (X.C34151jm) r1
            java.lang.String r0 = r1.A09
            if (r0 == 0) goto L_0x02a2
            int r0 = r0.length()
            if (r0 == 0) goto L_0x02a2
            java.lang.String r1 = r1.A0D
            if (r1 == 0) goto L_0x02a2
            X.01Z r0 = r7.A01
            r0.A07(r1)
            goto L_0x02a2
        L_0x02c2:
            java.lang.String r0 = "StickerPackDownloader/updateAvatarStickerPackTrayIcon"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.14Y r0 = r7.A07
            X.C18450wi.A0B(r8)
            X.1Cv r0 = r0.A00
            X.1kk r0 = r0.A04()
            X.1km r0 = r0.A02
            r0.A03(r8)
            r0 = r19
            java.util.List r0 = r0.A04
            r17 = r0
            X.C18450wi.A0B(r17)
            boolean r0 = r17.isEmpty()
            if (r0 != 0) goto L_0x0320
            X.13m r10 = r9.A03
            java.util.Iterator r13 = r17.iterator()
        L_0x02ec:
            boolean r0 = r13.hasNext()
            r12 = 0
            if (r0 == 0) goto L_0x030c
            java.lang.Object r12 = r13.next()
            r1 = r12
            X.1jm r1 = (X.C34151jm) r1
            java.lang.String r0 = r1.A05
            if (r0 != 0) goto L_0x0306
            X.1XO r0 = r1.A04
            if (r0 == 0) goto L_0x02ec
            java.lang.String r0 = r0.A00
            if (r0 == 0) goto L_0x02ec
        L_0x0306:
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x02ec
        L_0x030c:
            X.1jm r12 = (X.C34151jm) r12
            if (r12 != 0) goto L_0x0316
            java.lang.Object r12 = X.C003101j.A03(r17)
            X.1jm r12 = (X.C34151jm) r12
        L_0x0316:
            java.lang.String r0 = r12.A09
            r1 = 0
            if (r0 != 0) goto L_0x0330
            java.lang.String r0 = "AvatarTrayIconManager/createIcon filePath is null"
        L_0x031d:
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0320:
            java.lang.String r9 = "tray_icon_updated"
            if (r6 == 0) goto L_0x028c
            X.0yX r1 = r7.A03
            int r0 = r6.intValue()
            r1.AL5(r0, r9)
            goto L_0x028c
        L_0x0330:
            android.graphics.Bitmap r15 = android.graphics.BitmapFactory.decodeFile(r0)     // Catch:{ all -> 0x0335 }
            goto L_0x033b
        L_0x0335:
            r0 = move-exception
            X.1vQ r15 = new X.1vQ
            r15.<init>(r0)
        L_0x033b:
            boolean r0 = r15 instanceof X.C41211vQ
            if (r0 == 0) goto L_0x0340
            r15 = r1
        L_0x0340:
            android.graphics.Bitmap r15 = (android.graphics.Bitmap) r15
            if (r15 != 0) goto L_0x0347
            java.lang.String r0 = "AvatarTrayIconManager/createIcon stickerBitmap is null"
            goto L_0x031d
        L_0x0347:
            X.0tz r0 = r10.A00
            android.content.Context r11 = r0.A00
            android.content.res.Resources r1 = r11.getResources()
            r0 = 2131165340(0x7f07009c, float:1.7944894E38)
            int r10 = r1.getDimensionPixelSize(r0)
            r0 = 2131101963(0x7f06090b, float:1.781635E38)
            int r1 = X.AnonymousClass00T.A00(r11, r0)
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r13 = android.graphics.Bitmap.createBitmap(r10, r10, r0)
            android.graphics.Canvas r14 = new android.graphics.Canvas
            r14.<init>(r13)
            android.graphics.Paint r12 = X.C13700nu.A05()
            r12.setAntiAlias(r4)
            r12.setDither(r4)
            r12.setFilterBitmap(r4)
            r12.setColor(r1)
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_OVER
            android.graphics.PorterDuffXfermode r0 = new android.graphics.PorterDuffXfermode
            r0.<init>(r1)
            r12.setXfermode(r0)
            int r1 = r15.getWidth()
            int r0 = r15.getHeight()
            android.graphics.Rect r11 = new android.graphics.Rect
            r11.<init>(r5, r5, r1, r0)
            float r10 = (float) r10
            r1 = 0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>(r1, r1, r10, r10)
            r14.drawARGB(r5, r5, r5, r5)
            r14.drawOval(r0, r12)
            r14.drawBitmap(r15, r11, r0, r12)
            r15.recycle()
            if (r13 == 0) goto L_0x0320
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            r1.<init>()
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.PNG
            r13.compress(r0, r5, r1)
            byte[] r0 = r1.toByteArray()
            java.io.ByteArrayInputStream r10 = new java.io.ByteArrayInputStream
            r10.<init>(r0)
            r0 = r17
            java.lang.Object r0 = r0.get(r5)
            X.1jm r0 = (X.C34151jm) r0
            java.lang.String r0 = r0.A0F
            if (r0 == 0) goto L_0x0320
            java.io.File r9 = r9.A00(r0)
            if (r9 == 0) goto L_0x0320
            r0 = 500000(0x7a120, double:2.47033E-318)
            X.AnonymousClass1XI.A0R(r9, r10, r0)
            goto L_0x0320
        L_0x03d1:
            java.lang.String r9 = "previous_stickers_deleted"
            if (r6 == 0) goto L_0x03de
            X.0yX r1 = r7.A03
            int r0 = r6.intValue()
            r1.AL5(r0, r9)
        L_0x03de:
            X.AnonymousClass00B.A00()
            X.1Qg r11 = r10.A03
            int r9 = r11.A00(r8)
            java.lang.String r0 = "StickerPackDownloader/installStickerPack(order="
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            r1.append(r9)
            r0 = 41
            r1.append(r0)
            X.C13680ns.A1V(r1)
            X.AnonymousClass00B.A00()
            r0 = r19
            r10.A02(r0, r4)
            X.1Qh r0 = r10.A04
            X.12j r0 = r0.A01
            X.0tf r14 = r0.A02()
            X.1cj r15 = r14.A00()     // Catch:{ all -> 0x05b3 }
            X.0tg r13 = r14.A02     // Catch:{ all -> 0x05ae }
            android.content.ContentValues r12 = new android.content.ContentValues     // Catch:{ all -> 0x05ae }
            r12.<init>()     // Catch:{ all -> 0x05ae }
            java.lang.String r0 = "installed_id"
            r12.put(r0, r8)     // Catch:{ all -> 0x05ae }
            r0 = r19
            java.lang.String r1 = r0.A0H     // Catch:{ all -> 0x05ae }
            java.lang.String r0 = "installed_name"
            r12.put(r0, r1)     // Catch:{ all -> 0x05ae }
            r0 = r19
            java.lang.String r1 = r0.A09     // Catch:{ all -> 0x05ae }
            java.lang.String r0 = "installed_description"
            r12.put(r0, r1)     // Catch:{ all -> 0x05ae }
            r0 = r19
            java.lang.String r1 = r0.A0J     // Catch:{ all -> 0x05ae }
            java.lang.String r0 = "installed_publisher"
            r12.put(r0, r1)     // Catch:{ all -> 0x05ae }
            r0 = r19
            long r0 = r0.A08     // Catch:{ all -> 0x05ae }
            r20 = r0
            java.lang.Long r1 = java.lang.Long.valueOf(r20)     // Catch:{ all -> 0x05ae }
            java.lang.String r0 = "installed_size"
            r12.put(r0, r1)     // Catch:{ all -> 0x05ae }
            r0 = r19
            java.lang.String r1 = r0.A0G     // Catch:{ all -> 0x05ae }
            java.lang.String r0 = "installed_image_data_hash"
            r12.put(r0, r1)     // Catch:{ all -> 0x05ae }
            r0 = r19
            java.lang.String r1 = r0.A0L     // Catch:{ all -> 0x05ae }
            java.lang.String r0 = "installed_tray_image_id"
            r12.put(r0, r1)     // Catch:{ all -> 0x05ae }
            r0 = r19
            java.lang.String r1 = r0.A0M     // Catch:{ all -> 0x05ae }
            java.lang.String r0 = "installed_tray_image_preview_id"
            r12.put(r0, r1)     // Catch:{ all -> 0x05ae }
            r0 = r19
            boolean r0 = r0.A0N     // Catch:{ all -> 0x05ae }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x05ae }
            java.lang.String r0 = "installed_animated_pack"
            r12.put(r0, r1)     // Catch:{ all -> 0x05ae }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r16)     // Catch:{ all -> 0x05ae }
            java.lang.String r0 = "installed_is_avatar_pack"
            r12.put(r0, r1)     // Catch:{ all -> 0x05ae }
            r0 = r19
            java.lang.String r1 = r0.A0C     // Catch:{ all -> 0x05ae }
            java.lang.String r0 = "installed_empty_favorites_avatar_template_id"
            r12.put(r0, r1)     // Catch:{ all -> 0x05ae }
            r0 = r19
            java.lang.String r1 = r0.A0D     // Catch:{ all -> 0x05ae }
            java.lang.String r0 = "installed_empty_recents_avatar_template_id"
            r12.put(r0, r1)     // Catch:{ all -> 0x05ae }
            java.lang.String r0 = "installed_sticker_packs"
            r1 = 5
            r13.A06(r12, r0, r1)     // Catch:{ all -> 0x05ae }
            r15.A00()     // Catch:{ all -> 0x05ae }
            r15.close()     // Catch:{ all -> 0x05b3 }
            r14.close()
            r0 = r19
            java.util.List r0 = r0.A04
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x055f
            X.12k r13 = r10.A05
            r0 = r19
            java.util.List r12 = r0.A04
            X.12j r0 = r13.A00
            X.0tf r18 = r0.A02()
            X.1cj r17 = r18.A00()     // Catch:{ all -> 0x0557 }
            java.util.Iterator r16 = r12.iterator()     // Catch:{ all -> 0x0552 }
        L_0x04b2:
            boolean r0 = r16.hasNext()     // Catch:{ all -> 0x0552 }
            if (r0 == 0) goto L_0x054b
            java.lang.Object r12 = r16.next()     // Catch:{ all -> 0x0552 }
            X.1jm r12 = (X.C34151jm) r12     // Catch:{ all -> 0x0552 }
            r0 = r18
            X.0tg r14 = r0.A02     // Catch:{ all -> 0x0552 }
            android.content.ContentValues r13 = new android.content.ContentValues     // Catch:{ all -> 0x0552 }
            r13.<init>()     // Catch:{ all -> 0x0552 }
            java.lang.String r15 = r12.A0D     // Catch:{ all -> 0x0552 }
            java.lang.String r0 = "plain_file_hash"
            r13.put(r0, r15)     // Catch:{ all -> 0x0552 }
            java.lang.String r15 = r12.A08     // Catch:{ all -> 0x0552 }
            java.lang.String r0 = "encrypted_file_hash"
            r13.put(r0, r15)     // Catch:{ all -> 0x0552 }
            java.lang.String r15 = r12.A0B     // Catch:{ all -> 0x0552 }
            java.lang.String r0 = "media_key"
            r13.put(r0, r15)     // Catch:{ all -> 0x0552 }
            java.lang.String r15 = r12.A0C     // Catch:{ all -> 0x0552 }
            java.lang.String r0 = "mime_type"
            r13.put(r0, r15)     // Catch:{ all -> 0x0552 }
            int r0 = r12.A02     // Catch:{ all -> 0x0552 }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0552 }
            java.lang.String r0 = "height"
            r13.put(r0, r15)     // Catch:{ all -> 0x0552 }
            int r0 = r12.A03     // Catch:{ all -> 0x0552 }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0552 }
            java.lang.String r0 = "width"
            r13.put(r0, r15)     // Catch:{ all -> 0x0552 }
            java.lang.String r15 = r12.A0F     // Catch:{ all -> 0x0552 }
            java.lang.String r0 = "sticker_pack_id"
            r13.put(r0, r15)     // Catch:{ all -> 0x0552 }
            java.lang.String r15 = r12.A09     // Catch:{ all -> 0x0552 }
            java.lang.String r0 = "file_path"
            r13.put(r0, r15)     // Catch:{ all -> 0x0552 }
            int r0 = r12.A00     // Catch:{ all -> 0x0552 }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0552 }
            java.lang.String r0 = "file_size"
            r13.put(r0, r15)     // Catch:{ all -> 0x0552 }
            java.lang.String r15 = r12.A0G     // Catch:{ all -> 0x0552 }
            java.lang.String r0 = "url"
            r13.put(r0, r15)     // Catch:{ all -> 0x0552 }
            java.lang.String r15 = r12.A06     // Catch:{ all -> 0x0552 }
            java.lang.String r0 = "direct_path"
            r13.put(r0, r15)     // Catch:{ all -> 0x0552 }
            java.lang.String r15 = r12.A07     // Catch:{ all -> 0x0552 }
            java.lang.String r0 = "emojis"
            r13.put(r0, r15)     // Catch:{ all -> 0x0552 }
            java.lang.String r15 = r12.A0A     // Catch:{ all -> 0x0552 }
            java.lang.String r0 = "hash_of_image_part"
            r13.put(r0, r15)     // Catch:{ all -> 0x0552 }
            boolean r0 = r12.A0H     // Catch:{ all -> 0x0552 }
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0552 }
            java.lang.String r0 = "is_avatar"
            r13.put(r0, r15)     // Catch:{ all -> 0x0552 }
            java.lang.String r12 = r12.A05     // Catch:{ all -> 0x0552 }
            java.lang.String r0 = "avatar_template_id"
            r13.put(r0, r12)     // Catch:{ all -> 0x0552 }
            java.lang.String r0 = "stickers"
            r14.A06(r13, r0, r1)     // Catch:{ all -> 0x0552 }
            goto L_0x04b2
        L_0x054b:
            r17.A00()     // Catch:{ all -> 0x0552 }
            r17.close()     // Catch:{ all -> 0x0557 }
            goto L_0x055c
        L_0x0552:
            r0 = move-exception
            r17.close()     // Catch:{ all -> 0x0556 }
        L_0x0556:
            throw r0     // Catch:{ all -> 0x0557 }
        L_0x0557:
            r0 = move-exception
            r18.close()     // Catch:{ all -> 0x05b7 }
            throw r0
        L_0x055c:
            r18.close()
        L_0x055f:
            int r1 = r11.A00(r8)
            r0 = r19
            r0.A00 = r1
            java.lang.String r11 = "stickerpack_installed"
            if (r6 == 0) goto L_0x0575
            X.0yX r1 = r7.A03
            int r0 = r6.intValue()
            r1.AL5(r0, r11)
        L_0x0575:
            X.14Z r0 = r7.A0C
            r0.A01(r8)
            X.1pi r8 = r10.A01(r8)
            if (r8 != 0) goto L_0x05a5
            r8 = r3
        L_0x0581:
            if (r6 == 0) goto L_0x059f
            X.0yX r7 = r7.A03
            int r6 = r6.intValue()
            java.lang.String r5 = "stickerpack_size"
            r0 = r20
            r7.AKh(r6, r5, r0)
            r0 = r19
            java.util.List r0 = r0.A04
            int r1 = r0.size()
            java.lang.String r0 = "stickerpack_amount"
            r7.AKg(r6, r0, r1)
        L_0x059f:
            X.4Mf r6 = new X.4Mf
            r6.<init>(r8, r3, r2, r4)
            return r6
        L_0x05a5:
            r8.A04 = r2
            r8.A05 = r5
            r8.A00 = r9
            r8.A07 = r4
            goto L_0x0581
        L_0x05ae:
            r0 = move-exception
            r15.close()     // Catch:{ all -> 0x05b2 }
        L_0x05b2:
            throw r0     // Catch:{ all -> 0x05b3 }
        L_0x05b3:
            r0 = move-exception
            r14.close()     // Catch:{ all -> 0x05b7 }
        L_0x05b7:
            throw r0
        L_0x05b8:
            r8.getMessage()
            r1 = 0
        L_0x05bc:
            int r0 = r11.element
            if (r1 >= r0) goto L_0x05d3
            int r4 = r1 + 1
            java.lang.Object r0 = r2.get(r1)
            X.1jm r0 = (X.C34151jm) r0
            java.lang.String r1 = r0.A0D
            if (r1 == 0) goto L_0x05d1
            X.01Z r0 = r7.A01
            r0.A07(r1)
        L_0x05d1:
            r1 = r4
            goto L_0x05bc
        L_0x05d3:
            java.lang.String r1 = r8.getMessage()
            X.4Mf r6 = new X.4Mf
            r0 = r19
            r6.<init>(r0, r1, r3, r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass37M.A08(java.lang.Object[]):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        C84874Mf r1 = (C84874Mf) obj;
        AnonymousClass00B.A06(r1);
        A0B(r1);
    }

    public final void A0B(C84874Mf r5) {
        C37771pi r3;
        if (r5.A02 == null || (r3 = r5.A00) == null) {
            AnonymousClass00B.A06(r5.A01);
            AnonymousClass14W r0 = this.A03;
            String str = this.A08;
            Iterator A002 = C16590tJ.A00(r0);
            while (A002.hasNext()) {
                ((C41781we) A002.next()).A04(str);
            }
        } else {
            Iterator A003 = C16590tJ.A00(this.A03);
            while (A003.hasNext()) {
                ((C41781we) A003.next()).A02(r3);
            }
            if (!this.A09) {
                C75343s0 r2 = new C75343s0();
                r2.A03 = Integer.valueOf(this.A00);
                r2.A02 = Boolean.TRUE;
                boolean z2 = r3.A0Q;
                r2.A01 = Boolean.valueOf(z2);
                if (z2) {
                    r2.A04 = this.A02.A03;
                }
                r2.A00 = Boolean.valueOf(AnonymousClass000.A1V(r5.A01));
                this.A01.A06(r2);
            }
        }
        C20080zT r22 = this.A05;
        String str2 = this.A08;
        r22.A01.remove(str2);
        r22.A00.remove(str2);
        AnonymousClass5QS r02 = this.A04;
        if (r02 != null) {
            r02.AXk(r5);
        }
    }
}
