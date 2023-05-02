package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.obwhatsapp.R;
import java.io.File;

/* renamed from: X.1AB  reason: invalid class name */
public class AnonymousClass1AB extends C16210se {
    public final AnonymousClass027 A00 = new AnonymousClass027(0);
    public final C14870pt A01;
    public final C16440t3 A02;
    public final AnonymousClass1AA A03;
    public final AnonymousClass1A9 A04;
    public final C16320sq A05;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass1AB(X.C14870pt r14, X.C16040sK r15, X.C16200sd r16, X.C16190sc r17, X.AnonymousClass12W r18, X.C16440t3 r19, X.C16980tz r20, X.C18790xG r21, X.AnonymousClass12X r22, X.AnonymousClass1AA r23, X.C16230sg r24, X.C16990u0 r25, X.AnonymousClass12V r26, X.AnonymousClass1A9 r27, X.C16320sq r28) {
        /*
            r13 = this;
            r11 = r25
            r10 = r24
            r3 = r15
            r2 = r13
            r12 = r26
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r20
            r8 = r21
            r9 = r22
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r0 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            X.027 r0 = new X.027
            r0.<init>(r1)
            r13.A00 = r0
            r0 = r19
            r13.A02 = r0
            r13.A01 = r14
            r0 = r27
            r13.A04 = r0
            r0 = r28
            r13.A05 = r0
            r0 = r23
            r13.A03 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1AB.<init>(X.0pt, X.0sK, X.0sd, X.0sc, X.12W, X.0t3, X.0tz, X.0xG, X.12X, X.1AA, X.0sg, X.0u0, X.12V, X.1A9, X.0sq):void");
    }

    public final Drawable A0B(Context context, C40931uv r7) {
        int i2 = 0;
        try {
            String str = r7.A02;
            if (str != null) {
                i2 = Integer.parseInt(str);
            }
        } catch (NumberFormatException unused) {
        }
        int[] intArray = context.getResources().getIntArray(R.array.array001c);
        Bitmap createBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.RGB_565);
        createBitmap.setPixel(0, 0, intArray[i2]);
        return new BitmapDrawable(context.getResources(), createBitmap);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C86864Ul A0C(android.content.Context r8, X.C40931uv r9, boolean r10) {
        /*
            r7 = this;
            java.lang.String r3 = r9.A01
            X.AnonymousClass00B.A06(r3)
            android.content.res.Resources r4 = r8.getResources()
            int r0 = r3.hashCode()
            r1 = 2
            r2 = 1
            r5 = 0
            switch(r0) {
                case -2032180703: goto L_0x00d8;
                case -1770733785: goto L_0x00b8;
                case -899329064: goto L_0x002d;
                case 175331287: goto L_0x0029;
                case 1804184360: goto L_0x001c;
                default: goto L_0x0013;
            }
        L_0x0013:
            r2 = 0
        L_0x0014:
            java.lang.Integer r1 = r9.A00
            X.4Ul r0 = new X.4Ul
            r0.<init>(r2, r1, r3, r10)
            return r0
        L_0x001c:
            java.lang.String r0 = "COLOR_ONLY"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0013
            android.graphics.drawable.Drawable r2 = r7.A0B(r8, r9)
            goto L_0x0014
        L_0x0029:
            java.lang.String r0 = "USER_PROVIDED"
            goto L_0x00ba
        L_0x002d:
            java.lang.String r0 = "COLOR_WITH_WA_OVERLAY"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0013
            r4 = 0
            java.lang.String r0 = r9.A02     // Catch:{ NumberFormatException -> 0x003e }
            if (r0 == 0) goto L_0x003e
            int r4 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x003e }
        L_0x003e:
            android.graphics.drawable.Drawable r0 = r7.A0B(r8, r9)
            android.graphics.drawable.Drawable[] r6 = new android.graphics.drawable.Drawable[r1]
            r6[r5] = r0
            android.content.res.Resources r1 = r8.getResources()
            r0 = 2130903072(0x7f030020, float:1.7412952E38)
            int[] r0 = r1.getIntArray(r0)
            r1 = r0[r4]
            r0 = 2131232690(0x7f0807b2, float:1.8081496E38)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass00T.A04(r8, r0)
            X.AnonymousClass00B.A06(r0)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass2SR.A06(r0, r1)
            r6[r2] = r0
            android.graphics.drawable.LayerDrawable r4 = new android.graphics.drawable.LayerDrawable
            r4.<init>(r6)
            boolean r0 = r4 instanceof android.graphics.drawable.BitmapDrawable
            if (r0 == 0) goto L_0x0083
            r1 = r4
            android.graphics.drawable.BitmapDrawable r1 = (android.graphics.drawable.BitmapDrawable) r1
            android.graphics.Bitmap r0 = r1.getBitmap()
            if (r0 == 0) goto L_0x0083
            android.graphics.Bitmap r6 = r1.getBitmap()
        L_0x0079:
            android.content.res.Resources r0 = r8.getResources()
            android.graphics.drawable.BitmapDrawable r2 = new android.graphics.drawable.BitmapDrawable
            r2.<init>(r0, r6)
            goto L_0x0014
        L_0x0083:
            int r0 = r4.getIntrinsicWidth()
            if (r0 <= 0) goto L_0x00b1
            int r0 = r4.getIntrinsicHeight()
            if (r0 <= 0) goto L_0x00b1
            int r2 = r4.getIntrinsicWidth()
            int r1 = r4.getIntrinsicHeight()
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r6 = android.graphics.Bitmap.createBitmap(r2, r1, r0)
        L_0x009d:
            android.graphics.Canvas r2 = new android.graphics.Canvas
            r2.<init>(r6)
            int r1 = r2.getWidth()
            int r0 = r2.getHeight()
            r4.setBounds(r5, r5, r1, r0)
            r4.draw(r2)
            goto L_0x0079
        L_0x00b1:
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r6 = android.graphics.Bitmap.createBitmap(r2, r2, r0)
            goto L_0x009d
        L_0x00b8:
            java.lang.String r0 = "DOWNLOADED"
        L_0x00ba:
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0013
            java.lang.String r0 = r9.A02
            android.net.Uri r0 = android.net.Uri.parse(r0)
            java.lang.String r1 = r0.getPath()
            X.AnonymousClass00B.A06(r1)
            java.io.File r0 = new java.io.File
            r0.<init>(r1)
            android.graphics.drawable.Drawable r2 = X.C62063Bm.A01(r8, r4, r0)
            goto L_0x0014
        L_0x00d8:
            java.lang.String r0 = "DEFAULT"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0013
            android.graphics.drawable.Drawable r2 = X.C62063Bm.A00(r8, r4)
            goto L_0x0014
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1AB.A0C(android.content.Context, X.1uv, boolean):X.4Ul");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0047 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C40931uv A0D(android.content.Context r6, android.graphics.drawable.BitmapDrawable r7, X.C15830rv r8) {
        /*
            r5 = this;
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r3 = X.C004101u.A02(r0)
            if (r3 != 0) goto L_0x0016
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.String r3 = java.lang.String.valueOf(r0)
        L_0x0016:
            java.io.File r2 = r6.getFilesDir()
            java.lang.String r1 = "Wallpapers"
            java.io.File r0 = new java.io.File
            r0.<init>(r2, r1)
            r0.mkdirs()
            java.io.File r4 = new java.io.File
            r4.<init>(r0, r3)
            boolean r0 = r4.exists()
            if (r0 != 0) goto L_0x004f
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0048 }
            r3.<init>(r4)     // Catch:{ IOException -> 0x0048 }
            android.graphics.Bitmap r2 = r7.getBitmap()     // Catch:{ all -> 0x0043 }
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ all -> 0x0043 }
            r0 = 90
            r2.compress(r1, r0, r3)     // Catch:{ all -> 0x0043 }
            r3.close()     // Catch:{ IOException -> 0x0048 }
            goto L_0x004f
        L_0x0043:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0047 }
        L_0x0047:
            throw r0     // Catch:{ IOException -> 0x0048 }
        L_0x0048:
            r1 = move-exception
            java.lang.String r0 = "wallpaper/v2/save-wallpaper-file/failed to save wallpaper"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x004f:
            android.net.Uri r0 = android.net.Uri.fromFile(r4)
            java.lang.String r3 = r0.toString()
            r0 = 25
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "USER_PROVIDED"
            X.1uv r0 = new X.1uv
            r0.<init>(r2, r1, r3)
            r5.A0G(r6, r8, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1AB.A0D(android.content.Context, android.graphics.drawable.BitmapDrawable, X.0rv):X.1uv");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0034, code lost:
        if (r7.equals(r0) == false) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0036, code lost:
        r0 = r1.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0038, code lost:
        if (r0 != null) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003a, code lost:
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003b, code lost:
        r5 = r10.getResources().getIntArray(com.obwhatsapp.R.array.array001b)[r2];
        r4 = r10.getResources().getIntArray(com.obwhatsapp.R.array.array001c);
        r3 = r4.length;
        r2 = 0;
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0056, code lost:
        if (r2 >= r3) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005a, code lost:
        if (r4[r2] == r5) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005c, code lost:
        r1 = r1 + 1;
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0061, code lost:
        r2 = r0.intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0066, code lost:
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0067, code lost:
        r1 = java.lang.String.valueOf(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0072, code lost:
        if (r7.equals(r0) == false) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0074, code lost:
        r1 = new java.io.File(r10.getFilesDir(), "wallpaper.jpg");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0084, code lost:
        if (r1.exists() == false) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0086, code lost:
        r1 = android.net.Uri.fromFile(r1).toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        r2 = new X.C40931uv(0, r7, r1);
        A0G(r10, (X.C15830rv) null, r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C40931uv A0E(android.content.Context r10, boolean r11) {
        /*
            r9 = this;
            X.0sg r0 = r9.A08
            r6 = 0
            X.1uv r2 = r0.AH3(r6, r11)
            if (r2 != 0) goto L_0x0027
            X.1AA r1 = r9.A03
            r0 = 1
            X.3xc r1 = r1.A0B(r10, r0)
            java.lang.String r7 = r1.A02
            int r0 = r7.hashCode()
            r8 = 0
            switch(r0) {
                case -1770733785: goto L_0x006c;
                case -899329064: goto L_0x002e;
                case 175331287: goto L_0x002b;
                case 1804184360: goto L_0x0028;
                default: goto L_0x001a;
            }
        L_0x001a:
            r1 = 0
        L_0x001b:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            X.1uv r2 = new X.1uv
            r2.<init>(r0, r7, r1)
            r9.A0G(r10, r6, r2)
        L_0x0027:
            return r2
        L_0x0028:
            java.lang.String r0 = "COLOR_ONLY"
            goto L_0x0030
        L_0x002b:
            java.lang.String r0 = "USER_PROVIDED"
            goto L_0x006e
        L_0x002e:
            java.lang.String r0 = "COLOR_WITH_WA_OVERLAY"
        L_0x0030:
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x001a
            java.lang.Integer r0 = r1.A00
            if (r0 != 0) goto L_0x0061
            r2 = 0
        L_0x003b:
            android.content.res.Resources r1 = r10.getResources()
            r0 = 2130903067(0x7f03001b, float:1.7412942E38)
            int[] r0 = r1.getIntArray(r0)
            r5 = r0[r2]
            android.content.res.Resources r1 = r10.getResources()
            r0 = 2130903068(0x7f03001c, float:1.7412944E38)
            int[] r4 = r1.getIntArray(r0)
            int r3 = r4.length
            r2 = 0
            r1 = 0
        L_0x0056:
            if (r2 >= r3) goto L_0x0066
            r0 = r4[r2]
            if (r0 == r5) goto L_0x0067
            int r1 = r1 + 1
            int r2 = r2 + 1
            goto L_0x0056
        L_0x0061:
            int r2 = r0.intValue()
            goto L_0x003b
        L_0x0066:
            r1 = 0
        L_0x0067:
            java.lang.String r1 = java.lang.String.valueOf(r1)
            goto L_0x001b
        L_0x006c:
            java.lang.String r0 = "DOWNLOADED"
        L_0x006e:
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x001a
            java.io.File r2 = r10.getFilesDir()
            java.lang.String r0 = "wallpaper.jpg"
            java.io.File r1 = new java.io.File
            r1.<init>(r2, r0)
            boolean r0 = r1.exists()
            if (r0 == 0) goto L_0x001a
            android.net.Uri r0 = android.net.Uri.fromFile(r1)
            java.lang.String r1 = r0.toString()
            goto L_0x001b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1AB.A0E(android.content.Context, boolean):X.1uv");
    }

    public final void A0F() {
        File[] listFiles;
        C16220sf r3 = (C16220sf) this.A08;
        C16800tf A022 = r3.A01().A02();
        try {
            C16810tg r1 = A022.A02;
            r1.A0B("UPDATE settings SET wallpaper_light_type = NULL, wallpaper_light_value = NULL, wallpaper_dark_type = NULL, wallpaper_dark_value = NULL, wallpaper_dark_opacity = NULL WHERE jid != 'individual_chat_defaults'");
            r1.A0B("UPDATE settings SET wallpaper_light_type = 'DEFAULT', wallpaper_light_value = NULL, wallpaper_dark_type = 'DEFAULT', wallpaper_dark_value = NULL, wallpaper_dark_opacity = NULL WHERE jid = 'individual_chat_defaults'");
            A022.close();
            r3.A0X.clear();
            File file = new File(this.A05.A00.getFilesDir(), "Wallpapers");
            if (file.exists() && (listFiles = file.listFiles()) != null) {
                for (File delete : listFiles) {
                    delete.delete();
                }
                return;
            }
            return;
        } catch (Throwable unused) {
        }
        throw th;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0028, code lost:
        if (r1.equalsIgnoreCase(r10.A02) == false) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002b, code lost:
        if (r6 != null) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0035, code lost:
        if ("USER_PROVIDED".equalsIgnoreCase(r6.A01) == false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0037, code lost:
        if (r3 != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0039, code lost:
        r1 = android.net.Uri.parse(r6.A02).getPath();
        X.AnonymousClass00B.A06(r1);
        new java.io.File(r1).delete();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0015, code lost:
        if ("USER_PROVIDED".equalsIgnoreCase(r10.A01) == false) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0G(android.content.Context r8, X.C15830rv r9, X.C40931uv r10) {
        /*
            r7 = this;
            boolean r4 = X.C434920f.A09(r8)
            X.0sg r2 = r7.A08
            X.1uv r6 = r2.AH3(r9, r4)
            if (r10 == 0) goto L_0x0017
            java.lang.String r1 = r10.A01
            java.lang.String r0 = "USER_PROVIDED"
            boolean r1 = r0.equalsIgnoreCase(r1)
            r0 = 1
            if (r1 != 0) goto L_0x0018
        L_0x0017:
            r0 = 0
        L_0x0018:
            r5 = 1
            if (r0 == 0) goto L_0x002a
            if (r6 == 0) goto L_0x004e
            java.lang.String r1 = r6.A02
            if (r1 == 0) goto L_0x002a
            java.lang.String r0 = r10.A02
            boolean r0 = r1.equalsIgnoreCase(r0)
            r3 = 1
            if (r0 != 0) goto L_0x002d
        L_0x002a:
            r3 = 0
            if (r6 == 0) goto L_0x004e
        L_0x002d:
            java.lang.String r1 = r6.A01
            java.lang.String r0 = "USER_PROVIDED"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x004e
            if (r3 != 0) goto L_0x004e
            java.lang.String r0 = r6.A02
            android.net.Uri r0 = android.net.Uri.parse(r0)
            java.lang.String r1 = r0.getPath()
            X.AnonymousClass00B.A06(r1)
            java.io.File r0 = new java.io.File
            r0.<init>(r1)
            r0.delete()
        L_0x004e:
            r7.A00 = r5
            X.0sf r2 = (X.C16220sf) r2
            if (r9 != 0) goto L_0x0079
            X.1WS r0 = r2.A03()
        L_0x0058:
            if (r4 == 0) goto L_0x0076
            r0.A05 = r10
        L_0x005c:
            r2.A0K(r0)
            if (r9 == 0) goto L_0x0072
            r1 = r4 ^ 1
            java.lang.String r0 = r9.getRawString()
            X.1WS r0 = r2.A07(r0)
            if (r1 == 0) goto L_0x0073
            r0.A05 = r10
        L_0x006f:
            r2.A0K(r0)
        L_0x0072:
            return
        L_0x0073:
            r0.A06 = r10
            goto L_0x006f
        L_0x0076:
            r0.A06 = r10
            goto L_0x005c
        L_0x0079:
            java.lang.String r0 = r9.getRawString()
            X.1WS r0 = r2.A07(r0)
            goto L_0x0058
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1AB.A0G(android.content.Context, X.0rv, X.1uv):void");
    }
}
