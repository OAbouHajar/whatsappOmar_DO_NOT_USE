package X;

import android.content.Intent;
import com.obwhatsapp.R;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: X.121  reason: invalid class name */
public class AnonymousClass121 {
    public final C208811y A00;
    public final C16180sb A01;
    public final C14870pt A02;
    public final C14870pt A03;
    public final C16040sK A04;
    public final C18260wP A05;
    public final C16000sG A06;
    public final C17140ub A07;
    public final AnonymousClass120 A08;
    public final AnonymousClass120 A09;
    public final AnonymousClass12A A0A;
    public final AnonymousClass01V A0B;
    public final C16440t3 A0C;
    public final AnonymousClass013 A0D;
    public final C16460t6 A0E;
    public final C16070sO A0F;
    public final C19780yz A0G;
    public final C14710pd A0H;
    public final C16490t9 A0I;
    public final C26141Mm A0J;
    public final C211613a A0K;
    public final AnonymousClass12B A0L;
    public final AnonymousClass122 A0M;
    public final AnonymousClass15V A0N;
    public final C17770vc A0O;
    public final C16320sq A0P;

    public AnonymousClass121(C208811y r2, C16180sb r3, C14870pt r4, C16040sK r5, C18260wP r6, C16000sG r7, C17140ub r8, AnonymousClass120 r9, AnonymousClass12A r10, AnonymousClass01V r11, C16440t3 r12, AnonymousClass013 r13, C16460t6 r14, C16070sO r15, C19780yz r16, C14710pd r17, C16490t9 r18, C26141Mm r19, C211613a r20, AnonymousClass12B r21, AnonymousClass122 r22, AnonymousClass15V r23, C17770vc r24, C16320sq r25) {
        this.A0H = r17;
        this.A02 = r4;
        this.A04 = r5;
        this.A0P = r25;
        this.A01 = r3;
        this.A0N = r23;
        this.A0D = r13;
        this.A0B = r11;
        this.A0J = r19;
        this.A09 = r9;
        this.A0C = r12;
        this.A03 = r4;
        this.A0I = r18;
        this.A0K = r20;
        this.A06 = r7;
        this.A00 = r2;
        this.A07 = r8;
        this.A0E = r14;
        this.A0O = r24;
        this.A0G = r16;
        this.A08 = r9;
        this.A0A = r10;
        this.A0L = r21;
        this.A0M = r22;
        this.A0F = r15;
        this.A05 = r6;
    }

    public AnonymousClass27A A00(C15830rv r20, byte[] bArr, byte[] bArr2, boolean z2) {
        C16440t3 r7 = this.A0C;
        C14870pt r1 = this.A03;
        C16040sK r2 = this.A04;
        C16490t9 r11 = this.A0I;
        C211613a r13 = this.A0K;
        C16000sG r3 = this.A06;
        C17140ub r4 = this.A07;
        C16460t6 r8 = this.A0E;
        C19780yz r10 = this.A0G;
        return new AnonymousClass27A(r1, r2, r3, r4, this.A08, this.A0A, r7, r8, this.A0F, r10, r11, r20, r13, this, this.A0M, bArr, bArr2, z2);
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0073 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C453528b A01(byte[] r14) {
        /*
            r13 = this;
            android.graphics.BitmapFactory$Options r8 = new android.graphics.BitmapFactory$Options
            r8.<init>()
            r6 = 0
            r8.inScaled = r6
            r12 = 1
            r8.inDither = r12
            r8.inPreferQualityOverSpeed = r12
            r10 = 96
            r9 = 0
            r11 = 96
            X.25c r7 = new X.25c
            r7.<init>(r8, r9, r10, r11, r12)
            X.25d r0 = X.C37741pe.A05(r9, r7, r14, r6)
            android.graphics.Bitmap r7 = r0.A02
            if (r7 == 0) goto L_0x00a3
            android.graphics.Bitmap$Config r0 = r7.getConfig()
            if (r0 != 0) goto L_0x0027
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
        L_0x0027:
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r10, r10, r0)
            android.graphics.Canvas r5 = new android.graphics.Canvas
            r5.<init>(r3)
            android.graphics.Paint r4 = new android.graphics.Paint
            r4.<init>()
            r4.setAntiAlias(r12)
            r4.setFilterBitmap(r12)
            r4.setDither(r12)
            int r2 = r7.getWidth()
            int r0 = r7.getHeight()
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>(r6, r6, r2, r0)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>(r6, r6, r10, r10)
            r5.drawBitmap(r7, r1, r0, r4)
            r7.recycle()
            X.0sb r1 = r13.A01     // Catch:{ IOException -> 0x0074 }
            java.lang.String r0 = "tmpt"
            java.io.File r0 = r1.A0N(r0)     // Catch:{ IOException -> 0x0074 }
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0074 }
            r2.<init>(r0)     // Catch:{ IOException -> 0x0074 }
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ all -> 0x006f }
            r0 = 75
            r3.compress(r1, r0, r2)     // Catch:{ all -> 0x006f }
            r2.close()     // Catch:{ IOException -> 0x0074 }
            goto L_0x007a
        L_0x006f:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0073 }
        L_0x0073:
            throw r0     // Catch:{ IOException -> 0x0074 }
        L_0x0074:
            r1 = move-exception
            java.lang.String r0 = "profileinfo/sendphoto/cannot save thumb"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x007a:
            r3.recycle()
            X.0sb r1 = r13.A01
            java.lang.String r0 = "tmpt"
            java.io.File r3 = r1.A0N(r0)
            long r1 = r3.length()
            int r0 = (int) r1
            byte[] r2 = new byte[r0]
            java.io.FileInputStream r1 = new java.io.FileInputStream
            r1.<init>(r3)
            r1.read(r2)     // Catch:{ all -> 0x009e }
            r1.close()
            X.28b r0 = new X.28b
            r0.<init>(r14, r2)
            return r0
        L_0x009e:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x00a2 }
        L_0x00a2:
            throw r0
        L_0x00a3:
            java.lang.String r0 = "profileinfo/sendphoto/cannot decode thumb"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass121.A01(byte[]):X.28b");
    }

    public File A02(C16010sH r4) {
        if (!(r4 instanceof C34721kl)) {
            return this.A01.A0N("tmpi");
        }
        C16180sb r2 = this.A01;
        StringBuilder sb = new StringBuilder("tmpi");
        sb.append(((C34721kl) r4).A00);
        return r2.A0N(sb.toString());
    }

    public void A03(Intent intent, C14550pN r4) {
        int intExtra = intent.getIntExtra("error_message_id", -1);
        if (intExtra > 0) {
            this.A02.A0F(r4, intExtra);
        }
    }

    public void A04(Intent intent, C14550pN r8, int i2) {
        A05(intent, r8, r8, (C16010sH) null, i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        if (r3 == null) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A05(android.content.Intent r13, X.C14550pN r14, X.C14610pT r15, X.C16010sH r16, int r17) {
        /*
            r12 = this;
            r10 = 0
            r4 = r14
            r9 = r16
            if (r13 == 0) goto L_0x0013
            android.net.Uri r3 = r13.getData()
            java.lang.String r0 = "webImageSource"
            java.lang.String r10 = r13.getStringExtra(r0)
            if (r3 != 0) goto L_0x0033
        L_0x0013:
            java.io.File r0 = r12.A02(r9)
            boolean r0 = r0.exists()
            if (r0 == 0) goto L_0x0027
            java.io.File r0 = r12.A02(r9)
            android.net.Uri r3 = android.net.Uri.fromFile(r0)
            if (r3 != 0) goto L_0x0033
        L_0x0027:
            java.lang.String r0 = "profileinfo/cropphoto/no-data"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r0 = 2131888192(0x7f120840, float:1.9411012E38)
            r14.Afg(r0)
            return
        L_0x0033:
            X.01V r7 = r12.A0B
            X.013 r8 = r12.A0D
            X.120 r6 = r12.A09
            r0 = 0
            X.28c r2 = new X.28c
            r5 = r15
            r11 = r17
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            X.0sq r1 = r12.A0P
            java.lang.Void[] r0 = new java.lang.Void[r0]
            r1.Acn(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass121.A05(android.content.Intent, X.0pN, X.0pT, X.0sH, int):void");
    }

    public void A06(C000900k r8, C16010sH r9, int i2) {
        A07(r8, r9, i2, 1, true, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0155, code lost:
        if (r10 != false) goto L_0x0157;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x02fc, code lost:
        if (r12 != false) goto L_0x0157;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0300, code lost:
        if (r11 != false) goto L_0x0302;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0353, code lost:
        r0 = com.obwhatsapp.R.string.str0af1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A07(X.C000900k r14, X.C16010sH r15, int r16, int r17, boolean r18, boolean r19) {
        /*
            r13 = this;
            X.0sb r1 = r13.A01
            java.lang.String r0 = "tmpi"
            java.io.File r0 = r1.A0N(r0)
            r0.delete()
            X.0pd r5 = r13.A0H
            r0 = 689(0x2b1, float:9.65E-43)
            X.0tM r4 = X.C16620tM.A02
            boolean r1 = r5.A0E(r4, r0)
            r0 = 4
            java.util.ArrayList r3 = new java.util.ArrayList
            r6 = r19
            if (r1 == 0) goto L_0x020b
            r3.<init>(r0)
            r10 = 0
            if (r15 == 0) goto L_0x0208
            boolean r0 = r15.A0J()
            if (r0 == 0) goto L_0x0208
            r9 = 1
            X.1l4 r0 = r15.A0G
            if (r0 == 0) goto L_0x002f
            r10 = 1
        L_0x002f:
            if (r18 == 0) goto L_0x0087
            if (r15 == 0) goto L_0x0087
            X.120 r0 = r13.A08
            java.io.File r0 = r0.A01(r15)
            if (r0 == 0) goto L_0x0087
            boolean r0 = r0.exists()
            if (r0 == 0) goto L_0x0087
            if (r9 == 0) goto L_0x01f2
            android.content.Intent r7 = new android.content.Intent
            r7.<init>()
            java.lang.String r1 = r14.getPackageName()
            java.lang.String r0 = "com.obwhatsapp.profile.ResetGroupPhoto"
            if (r10 == 0) goto L_0x01ed
            r7.setClassName(r1, r0)
            java.lang.String r1 = "IS_COMMUNITY_KEY"
            r0 = 1
            r7.putExtra(r1, r0)
        L_0x0059:
            r1 = 2131891190(0x7f1213f6, float:1.9417093E38)
            r0 = 2131231405(0x7f0802ad, float:1.807889E38)
            X.28W r2 = new X.28W
            r2.<init>(r1, r0, r7)
            r0 = 1
            r2.A04 = r0
            r0 = 2131364625(0x7f0a0b11, float:1.8349092E38)
            r2.A00 = r0
            r0 = 2
            r2.A01 = r0
            android.content.res.Resources r1 = r14.getResources()
            r0 = 2131100882(0x7f0604d2, float:1.7814158E38)
            int r0 = r1.getColor(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A02 = r0
            X.1lF r0 = r2.A00()
            r3.add(r0)
        L_0x0087:
            java.lang.Class<com.obwhatsapp.profile.CapturePhoto> r0 = com.obwhatsapp.profile.CapturePhoto.class
            android.content.Intent r2 = new android.content.Intent
            r2.<init>(r14, r0)
            java.io.File r0 = r13.A02(r15)
            android.net.Uri r1 = X.AnonymousClass1XI.A01(r14, r0)
            java.lang.String r0 = "target_file_uri"
            android.content.Intent r0 = r2.putExtra(r0, r1)
            java.lang.String r7 = "should_return_photo_source"
            android.content.Intent r8 = r0.putExtra(r7, r6)
            r1 = 2131887023(0x7f1203af, float:1.9408641E38)
            r0 = 2131231568(0x7f080350, float:1.807922E38)
            X.28W r2 = new X.28W
            r2.<init>(r1, r0, r8)
            android.content.res.Resources r1 = r14.getResources()
            r0 = 2131101273(0x7f060659, float:1.7814951E38)
            int r0 = r1.getColor(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A02 = r0
            X.1lF r0 = r2.A00()
            r3.add(r0)
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r1 = r14.getPackageName()
            java.lang.String r0 = "com.obwhatsapp.gallerypicker.GalleryPickerLauncher"
            r2.setClassName(r1, r0)
            android.content.Intent r2 = r2.putExtra(r7, r6)
            r1 = 0
            java.lang.String r0 = "photo_type"
            android.content.Intent r6 = r2.putExtra(r0, r1)
            r1 = 2131888433(0x7f120931, float:1.9411501E38)
            r0 = 2131231463(0x7f0802e7, float:1.8079008E38)
            X.28W r2 = new X.28W
            r2.<init>(r1, r0, r6)
            android.content.res.Resources r1 = r14.getResources()
            r0 = 2131101273(0x7f060659, float:1.7814951E38)
            int r0 = r1.getColor(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A02 = r0
            X.1lF r0 = r2.A00()
            r3.add(r0)
            X.0sK r0 = r13.A04
            boolean r0 = r0.A0G()
            if (r0 != 0) goto L_0x0168
            r0 = 1396(0x574, float:1.956E-42)
            boolean r0 = r5.A0E(r4, r0)
            if (r0 == 0) goto L_0x0168
            if (r9 != 0) goto L_0x0168
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r1 = r14.getPackageName()
            java.lang.String r0 = "com.obwhatsapp.avatar.profilephoto.AvatarProfilePhotoActivity"
            r2.setClassName(r1, r0)
            r1 = 2131886389(0x7f120135, float:1.9407355E38)
            r0 = 2131231476(0x7f0802f4, float:1.8079034E38)
            X.28W r4 = new X.28W
            r4.<init>(r1, r0, r2)
            X.1Mm r0 = r13.A0J
            boolean r1 = r0.A01()
            r0 = 2
            if (r1 == 0) goto L_0x0139
            r0 = 17
        L_0x0139:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.A03 = r0
            X.1lF r0 = r4.A00()
            r3.add(r0)
            goto L_0x0168
        L_0x0147:
            X.1lF r0 = r4.A00()
            r3.add(r0)
            java.lang.String r0 = "profile/photo/updater/run chooser"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            if (r9 == 0) goto L_0x0358
            if (r10 == 0) goto L_0x0353
        L_0x0157:
            r0 = 2131887363(0x7f120503, float:1.940933E38)
        L_0x015a:
            X.02C r1 = r14.AGM()
            r2 = r16
            com.obwhatsapp.IntentChooserBottomSheetDialogFragment r0 = com.obwhatsapp.IntentChooserBottomSheetDialogFragment.A01(r3, r0, r2)
            X.C453428a.A00(r0, r1)
            return
        L_0x0168:
            X.120 r0 = r13.A09
            java.io.File r0 = r0.A02(r15)
            android.net.Uri r1 = android.net.Uri.fromFile(r0)
            android.content.Intent r4 = new android.content.Intent
            r4.<init>()
            java.lang.String r0 = "com.obwhatsapp.group.GroupProfileEmojiEditor"
            r4.setClassName(r14, r0)
            java.lang.String r0 = "emojiEditorImageResult"
            r4.putExtra(r0, r1)
            java.lang.String r0 = "emojiEditorProfileTarget"
            r1 = r17
            r4.putExtra(r0, r1)
            r1 = 2131888882(0x7f120af2, float:1.9412412E38)
            r0 = 2131231621(0x7f080385, float:1.8079328E38)
            X.28W r2 = new X.28W
            r2.<init>(r1, r0, r4)
            android.content.res.Resources r1 = r14.getResources()
            r0 = 2131101273(0x7f060659, float:1.7814951E38)
            int r0 = r1.getColor(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A02 = r0
            X.1lF r0 = r2.A00()
            r3.add(r0)
            java.io.File r0 = r13.A02(r15)
            android.net.Uri r5 = android.net.Uri.fromFile(r0)
            java.lang.String r4 = r15.A09()
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r1 = r14.getPackageName()
            java.lang.String r0 = "com.obwhatsapp.profile.WebImagePicker"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "output"
            r2.putExtra(r0, r5)
            java.lang.String r0 = "query"
            r2.putExtra(r0, r4)
            r1 = 2131891378(0x7f1214b2, float:1.9417474E38)
            r0 = 2131231426(0x7f0802c2, float:1.8078933E38)
            X.28W r4 = new X.28W
            r4.<init>(r1, r0, r2)
            android.content.res.Resources r1 = r14.getResources()
            r0 = 2131101273(0x7f060659, float:1.7814951E38)
            int r0 = r1.getColor(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.A02 = r0
            goto L_0x0147
        L_0x01ed:
            r7.setClassName(r1, r0)
            goto L_0x0059
        L_0x01f2:
            r2 = 0
            android.content.Intent r7 = new android.content.Intent
            r7.<init>()
            java.lang.String r1 = r14.getPackageName()
            java.lang.String r0 = "com.obwhatsapp.profile.ResetPhoto"
            r7.setClassName(r1, r0)
            java.lang.String r0 = "photo_type"
            r7.putExtra(r0, r2)
            goto L_0x0059
        L_0x0208:
            r9 = 0
            goto L_0x002f
        L_0x020b:
            r3.<init>(r0)
            r12 = 0
            if (r15 == 0) goto L_0x0350
            boolean r0 = r15.A0J()
            if (r0 == 0) goto L_0x0350
            r11 = 1
            X.1l4 r0 = r15.A0G
            if (r0 == 0) goto L_0x021d
            r12 = 1
        L_0x021d:
            if (r18 == 0) goto L_0x0255
            if (r15 == 0) goto L_0x0255
            X.120 r0 = r13.A08
            java.io.File r0 = r0.A01(r15)
            if (r0 == 0) goto L_0x0255
            boolean r0 = r0.exists()
            if (r0 == 0) goto L_0x0255
            if (r11 == 0) goto L_0x0337
            android.content.Intent r7 = new android.content.Intent
            r7.<init>()
            java.lang.String r1 = r14.getPackageName()
            java.lang.String r0 = "com.obwhatsapp.profile.ResetGroupPhoto"
            if (r12 == 0) goto L_0x0332
            r7.setClassName(r1, r0)
            java.lang.String r1 = "IS_COMMUNITY_KEY"
            r0 = 1
            r7.putExtra(r1, r0)
        L_0x0247:
            r2 = 2131891189(0x7f1213f5, float:1.9417091E38)
        L_0x024a:
            r1 = 2131231084(0x7f08016c, float:1.807824E38)
            X.1lF r0 = new X.1lF
            r0.<init>(r2, r1, r7)
            r3.add(r0)
        L_0x0255:
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r1 = r14.getPackageName()
            java.lang.String r0 = "com.obwhatsapp.gallerypicker.GalleryPickerLauncher"
            r2.setClassName(r1, r0)
            java.lang.String r10 = "should_return_photo_source"
            android.content.Intent r1 = r2.putExtra(r10, r6)
            r0 = 0
            r9 = 0
            java.lang.String r8 = "photo_type"
            android.content.Intent r7 = r1.putExtra(r8, r0)
            r2 = 2131888433(0x7f120931, float:1.9411501E38)
            r1 = 2131231663(0x7f0803af, float:1.8079413E38)
            X.1lF r0 = new X.1lF
            r0.<init>(r2, r1, r7)
            r3.add(r0)
            java.io.File r0 = r13.A02(r15)
            android.net.Uri r7 = X.AnonymousClass1XI.A01(r14, r0)
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r1 = r14.getPackageName()
            java.lang.String r0 = "com.obwhatsapp.profile.CapturePhoto"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "target_file_uri"
            r2.putExtra(r0, r7)
            android.content.Intent r0 = r2.putExtra(r10, r6)
            android.content.Intent r6 = r0.putExtra(r8, r9)
            r2 = 2131887023(0x7f1203af, float:1.9408641E38)
            r1 = 2131231572(0x7f080354, float:1.8079229E38)
            X.1lF r0 = new X.1lF
            r0.<init>(r2, r1, r6)
            r3.add(r0)
            X.0sK r0 = r13.A04
            boolean r0 = r0.A0G()
            if (r0 != 0) goto L_0x0300
            r0 = 1396(0x574, float:1.956E-42)
            boolean r0 = r5.A0E(r4, r0)
            if (r0 == 0) goto L_0x0300
            if (r11 != 0) goto L_0x0302
            android.content.Intent r4 = new android.content.Intent
            r4.<init>()
            java.lang.String r1 = r14.getPackageName()
            java.lang.String r0 = "com.obwhatsapp.avatar.profilephoto.AvatarProfilePhotoActivity"
            r4.setClassName(r1, r0)
            r1 = 2131886389(0x7f120135, float:1.9407355E38)
            r0 = 2131231476(0x7f0802f4, float:1.8079034E38)
            X.28W r2 = new X.28W
            r2.<init>(r1, r0, r4)
            X.1Mm r0 = r13.A0J
            boolean r1 = r0.A01()
            r0 = 2
            if (r1 == 0) goto L_0x02e8
            r0 = 17
        L_0x02e8:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A03 = r0
            X.1lF r4 = r2.A00()
        L_0x02f2:
            r3.add(r4)
        L_0x02f5:
            java.lang.String r0 = "profile/photo/updater/run chooser"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            if (r11 == 0) goto L_0x0358
            if (r12 == 0) goto L_0x0353
            goto L_0x0157
        L_0x0300:
            if (r11 == 0) goto L_0x02f5
        L_0x0302:
            java.io.File r0 = r13.A02(r15)
            android.net.Uri r5 = android.net.Uri.fromFile(r0)
            java.lang.String r4 = r15.A09()
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r1 = r14.getPackageName()
            java.lang.String r0 = "com.obwhatsapp.profile.WebImagePicker"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "output"
            r2.putExtra(r0, r5)
            java.lang.String r0 = "query"
            r2.putExtra(r0, r4)
            r1 = 2131891378(0x7f1214b2, float:1.9417474E38)
            r0 = 2131231844(0x7f080464, float:1.807978E38)
            X.1lF r4 = new X.1lF
            r4.<init>(r1, r0, r2)
            goto L_0x02f2
        L_0x0332:
            r7.setClassName(r1, r0)
            goto L_0x0247
        L_0x0337:
            r2 = 0
            android.content.Intent r7 = new android.content.Intent
            r7.<init>()
            java.lang.String r1 = r14.getPackageName()
            java.lang.String r0 = "com.obwhatsapp.profile.ResetPhoto"
            r7.setClassName(r1, r0)
            java.lang.String r0 = "photo_type"
            r7.putExtra(r0, r2)
            r2 = 2131891190(0x7f1213f6, float:1.9417093E38)
            goto L_0x024a
        L_0x0350:
            r11 = 0
            goto L_0x021d
        L_0x0353:
            r0 = 2131888881(0x7f120af1, float:1.941241E38)
            goto L_0x015a
        L_0x0358:
            r0 = 2131893610(0x7f121d6a, float:1.9422001E38)
            goto L_0x015a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass121.A07(X.00k, X.0sH, int, int, boolean, boolean):void");
    }

    public void A08(C16010sH r5) {
        if (!this.A05.A0A()) {
            this.A03.A09(R.string.str0474, 0);
            return;
        }
        AnonymousClass12B r2 = this.A0L;
        Jid A082 = r5.A08(C15830rv.class);
        AnonymousClass00B.A06(A082);
        r2.A03(A00((C15830rv) A082, (byte[]) null, (byte[]) null, false));
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x0070 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x0075 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A09(X.C16010sH r10) {
        /*
            r9 = this;
            X.120 r0 = r9.A08
            java.io.File r3 = r0.A00(r10)
            java.io.File r1 = r0.A01(r10)
            if (r3 == 0) goto L_0x008f
            boolean r0 = r3.exists()
            if (r0 == 0) goto L_0x008f
            if (r1 == 0) goto L_0x008f
            boolean r0 = r1.exists()
            if (r0 == 0) goto L_0x008f
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0076 }
            r5.<init>(r1)     // Catch:{ IOException -> 0x0076 }
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ all -> 0x0071 }
            r4.<init>(r3)     // Catch:{ all -> 0x0071 }
            long r0 = r1.length()     // Catch:{ all -> 0x006c }
            int r2 = (int) r0     // Catch:{ all -> 0x006c }
            byte[] r7 = new byte[r2]     // Catch:{ all -> 0x006c }
            r6 = 0
            r1 = 0
        L_0x002d:
            r8 = -1
            if (r1 >= r2) goto L_0x003a
            int r0 = r2 - r1
            int r0 = r5.read(r7, r1, r0)     // Catch:{ all -> 0x006c }
            if (r0 == r8) goto L_0x003a
            int r1 = r1 + r0
            goto L_0x002d
        L_0x003a:
            long r0 = r3.length()     // Catch:{ all -> 0x006c }
            int r3 = (int) r0     // Catch:{ all -> 0x006c }
            byte[] r2 = new byte[r3]     // Catch:{ all -> 0x006c }
            r1 = 0
        L_0x0042:
            if (r1 >= r3) goto L_0x004e
            int r0 = r3 - r1
            int r0 = r4.read(r2, r1, r0)     // Catch:{ all -> 0x006c }
            if (r0 == r8) goto L_0x004e
            int r1 = r1 + r0
            goto L_0x0042
        L_0x004e:
            java.lang.Class<X.0rv> r0 = X.C15830rv.class
            com.whatsapp.jid.Jid r0 = r10.A08(r0)     // Catch:{ all -> 0x006c }
            X.0rv r0 = (X.C15830rv) r0     // Catch:{ all -> 0x006c }
            X.AnonymousClass00B.A06(r0)     // Catch:{ all -> 0x006c }
            X.27A r1 = r9.A00(r0, r2, r7, r6)     // Catch:{ all -> 0x006c }
            r0 = 1
            r1.A04 = r0     // Catch:{ all -> 0x006c }
            X.12B r0 = r9.A0L     // Catch:{ all -> 0x006c }
            r0.A03(r1)     // Catch:{ all -> 0x006c }
            r4.close()     // Catch:{ all -> 0x0071 }
            r5.close()     // Catch:{ IOException -> 0x0076 }
            return
        L_0x006c:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0070 }
        L_0x0070:
            throw r0     // Catch:{ all -> 0x0071 }
        L_0x0071:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x0075 }
        L_0x0075:
            throw r0     // Catch:{ IOException -> 0x0076 }
        L_0x0076:
            r2 = move-exception
            java.lang.String r0 = "profileinfo/resend/jid "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            X.0rv r0 = r10.A0E
            r1.append(r0)
            java.lang.String r0 = "/failed"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e(r0, r2)
        L_0x008f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass121.A09(X.0sH):void");
    }

    public boolean A0A(C16010sH r4) {
        File file = this.A08.A00.A05().A09;
        C16180sb.A04(file, false);
        return A0B(r4, C16180sb.A00(file, "tmpp"), (byte[]) null, false);
    }

    public final boolean A0B(C16010sH r8, File file, byte[] bArr, boolean z2) {
        C453528b r6;
        if (!this.A05.A0A()) {
            this.A03.A09(R.string.str0474, 0);
            return false;
        }
        if (file != null) {
            r6 = A01(AnonymousClass1XI.A0T(file));
        } else {
            try {
                AnonymousClass00B.A06(bArr);
                r6 = A01(bArr);
            } catch (FileNotFoundException | IOException e2) {
                this.A03.A09(R.string.str0848, 0);
                Log.e("profileinfo/sendphoto", e2);
                return false;
            }
        }
        AnonymousClass12B r3 = this.A0L;
        Jid A082 = r8.A08(C15830rv.class);
        AnonymousClass00B.A06(A082);
        r3.A03(A00((C15830rv) A082, r6.A00, r6.A01, z2));
        return true;
    }
}
