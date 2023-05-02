package X;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ContentResolver;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.mod.bomfab.R$styleable;
import com.obwhatsapp.R;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.1A9  reason: invalid class name */
public class AnonymousClass1A9 extends C17970vw {
    public final C16300so A00;
    public final C16180sb A01;
    public final C14870pt A02;
    public final AnonymousClass01V A03;
    public final C16980tz A04;
    public final AnonymousClass013 A05;
    public final C14730pf A06;
    public final C16510tB A07;
    public final C16320sq A08;

    public AnonymousClass1A9(C16300so r3, C16180sb r4, C14870pt r5, AnonymousClass01V r6, C16980tz r7, AnonymousClass013 r8, C14730pf r9, C16510tB r10, C16320sq r11) {
        this.A04 = r7;
        this.A02 = r5;
        this.A00 = r3;
        this.A08 = r11;
        this.A01 = r4;
        this.A06 = r9;
        this.A03 = r6;
        this.A05 = r8;
        this.A07 = r10;
        r10.A01.add("com.obwhatsapp.provider.MigrationContentProvider");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0033, code lost:
        r0 = r6.A03().A01;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A0O(X.C16730tY r5, X.C16220sf r6) {
        /*
            byte r1 = r5.A10
            int r0 = r5.A08
            X.1XK r4 = X.C31831f6.A01(r1, r0)
            X.1Vw r2 = r5.A11
            boolean r1 = r2.A02
            X.1XK r0 = X.AnonymousClass1XK.A0S
            r3 = 2
            if (r4 == r0) goto L_0x003e
            if (r1 == 0) goto L_0x0015
            r0 = 3
            return r0
        L_0x0015:
            X.0rv r2 = r2.A00
            X.AnonymousClass00B.A06(r2)
            X.0rt r1 = r6.A0K
            X.0sG r0 = r6.A09
            if (r2 == 0) goto L_0x0027
            int r0 = X.C40491uD.A00(r0, r1, r2)
            if (r0 <= 0) goto L_0x0027
            return r3
        L_0x0027:
            java.lang.String r0 = r2.getRawString()
            X.1WS r0 = r6.A07(r0)
            int r0 = r0.A01
            if (r0 != 0) goto L_0x003b
            X.1WS r0 = r6.A03()
            int r0 = r0.A01
            if (r0 == 0) goto L_0x003d
        L_0x003b:
            if (r0 != r3) goto L_0x003e
        L_0x003d:
            r3 = 1
        L_0x003e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1A9.A0O(X.0tY, X.0sf):int");
    }

    public static void A0P(Activity activity, C16180sb r6, C14870pt r7, C15830rv r8, C17020u3 r9, int i2, int i3) {
        Intent intent;
        if (i2 == 4) {
            intent = new Intent("android.media.action.VIDEO_CAPTURE");
            if (Build.VERSION.SDK_INT == 18 && Build.MODEL.contains("Nexus")) {
                intent.putExtra("output", Uri.fromFile(AnonymousClass20J.A00(r6, r9, AnonymousClass1XK.A0X, ".mp4", 1)));
            }
        } else if (i2 != 5) {
            switch (i2) {
                case R$styleable.FloatingActionMenu_menu_labels_singleLine /*21*/:
                    intent = new Intent("android.intent.action.PICK", MediaStore.Images.Media.INTERNAL_CONTENT_URI);
                    intent.setType("image/*");
                    break;
                case R$styleable.FloatingActionMenu_menu_labels_ellipsize /*22*/:
                    String packageName = activity.getPackageName();
                    intent = new Intent();
                    intent.setClassName(packageName, "com.obwhatsapp.gallerypicker.GalleryPicker");
                    intent.setAction("android.intent.action.PICK");
                    intent.setData(MediaStore.Images.Media.INTERNAL_CONTENT_URI);
                    intent.putExtra("max_items", i3);
                    intent.putExtra("skip_max_items_new_limit", false);
                    break;
                case R$styleable.FloatingActionMenu_menu_labels_maxLines /*23*/:
                    intent = new Intent("android.media.action.IMAGE_CAPTURE").putExtra("output", AnonymousClass1XI.A01(activity, AnonymousClass20J.A00(r6, r9, AnonymousClass1XK.A0B, ".jpg", 1)));
                    intent.setFlags(2);
                    break;
                default:
                    intent = null;
                    break;
            }
        } else {
            intent = new Intent();
            intent.setClassName(activity.getPackageName(), "com.obwhatsapp.audiopicker.AudioPickerActivity");
            intent.putExtra("jid", r8.getRawString());
        }
        try {
            activity.startActivityForResult(intent, i2);
        } catch (ActivityNotFoundException e2) {
            Log.e("mediafileutils/start-activity ", e2);
            r7.A09(R.string.str00a0, 0);
        }
    }

    public static void A0Q(Uri.Builder builder, AnonymousClass20I r5) {
        Uri uri = r5.A0G;
        int parseInt = ((uri.getQueryParameter("rotation") != null ? Integer.parseInt(uri.getQueryParameter("rotation")) : 0) + r5.A01()) % 360;
        if (parseInt != 0) {
            builder.appendQueryParameter("rotation", Integer.toString(parseInt));
        }
        if (uri.getQueryParameter("flip-h") != null) {
            builder.appendQueryParameter("flip-h", uri.getQueryParameter("flip-h"));
        }
    }

    public static void A0R(AnonymousClass1A9 r3, Collection collection, Collection collection2) {
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            AnonymousClass20I r1 = (AnonymousClass20I) it.next();
            if (collection.contains(r1.A05())) {
                r3.A0d(r1.A05());
                r3.A0d(r1.A03());
            }
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x002b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0030 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A0S(X.C18020w1 r14, X.C43061zH r15, java.io.File r16, java.io.File r17, java.io.OutputStream r18, java.lang.String r19, byte[] r20, int r21, int r22, int r23, long r24) {
        /*
            r5 = 1
            r4 = r22
            r0 = r24
            java.io.FileInputStream r7 = X.C17970vw.A0G(r16)     // Catch:{ 20H -> 0x0031 }
            X.20F r8 = new X.20F     // Catch:{ all -> 0x002c }
            r2 = r18
            r8.<init>(r2, r4)     // Catch:{ all -> 0x002c }
            X.20G r6 = new X.20G     // Catch:{ all -> 0x0027 }
            r2 = r20
            r6.<init>(r15, r2, r0)     // Catch:{ all -> 0x0027 }
            r10 = 0
            r2 = r21
            long r12 = (long) r2     // Catch:{ all -> 0x0027 }
            r9 = 0
            r6.A00(r7, r8, r9, r10, r12)     // Catch:{ all -> 0x0027 }
            r8.close()     // Catch:{ all -> 0x002c }
            r7.close()     // Catch:{ 20H -> 0x0031 }
            return r5
        L_0x0027:
            r2 = move-exception
            r8.close()     // Catch:{ all -> 0x002b }
        L_0x002b:
            throw r2     // Catch:{ all -> 0x002c }
        L_0x002c:
            r2 = move-exception
            r7.close()     // Catch:{ all -> 0x0030 }
        L_0x0030:
            throw r2     // Catch:{ 20H -> 0x0031 }
        L_0x0031:
            r6 = move-exception
            java.lang.String r3 = "CreateProgressiveThumbnail failed  tomatch hash for progressive jpeg thumbnail; mediaHash="
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r3)
            r3 = r19
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.whatsapp.util.Log.e(r2, r6)
            r2 = 0
            java.lang.Long r6 = java.lang.Long.valueOf(r2)
            int[] r7 = new int[r5]
            r11 = 0
            r7[r11] = r22
            r5 = r14
            r8 = r23
            r9 = r0
            r5.A0M(r6, r7, r8, r9, r11)
            r17.delete()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1A9.A0S(X.0w1, X.1zH, java.io.File, java.io.File, java.io.OutputStream, java.lang.String, byte[], int, int, int, long):boolean");
    }

    public static boolean A0T(String str) {
        return "video/mp4".equals(str) || "video/x.looping_mp4".equals(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r0 = X.AnonymousClass20E.A00(r2, r4, r6);
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0010  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] A0U(java.io.File r3, int r4, int r5, boolean r6) {
        /*
            r2 = 0
            if (r3 != 0) goto L_0x001b
            java.lang.String r0 = "mediafileutils/createVideoThumbnail/file=null"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0008:
            if (r2 == 0) goto L_0x0010
            byte[] r0 = X.AnonymousClass20E.A00(r2, r4, r6)
            if (r0 != 0) goto L_0x001a
        L_0x0010:
            android.graphics.Bitmap r1 = X.C18830xK.A01(r3)
            r0 = 100
            byte[] r0 = X.C18830xK.A03(r1, r0)
        L_0x001a:
            return r0
        L_0x001b:
            X.C41911wr.A04(r3)     // Catch:{ IOException -> 0x001f }
            goto L_0x0021
        L_0x001f:
            r0 = 0
            goto L_0x0022
        L_0x0021:
            r0 = 1
        L_0x0022:
            if (r0 == 0) goto L_0x0034
            android.graphics.Bitmap r2 = X.C41911wr.A00(r3)     // Catch:{ IOException | IllegalArgumentException -> 0x0029, Exception -> 0x002d }
            goto L_0x0008
        L_0x0029:
            r1 = move-exception
            java.lang.String r0 = "mediafileutils/createGifThumbnail/gif file not read "
            goto L_0x0030
        L_0x002d:
            r1 = move-exception
            java.lang.String r0 = "mediafileutils/createGifThumbnail/unexpected gif exception "
        L_0x0030:
            com.whatsapp.util.Log.e(r0, r1)
            goto L_0x0008
        L_0x0034:
            r1 = 1
            X.1wp r0 = new X.1wp
            r0.<init>(r3)
            android.graphics.Bitmap r2 = X.C18830xK.A00(r0, r5, r1)
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1A9.A0U(java.io.File, int, int, boolean):byte[]");
    }

    @Deprecated
    public Bitmap A0V(BitmapFactory.Options options, Matrix matrix, Uri uri, int i2, int i3, boolean z2) {
        InputStream A0b = A0b(uri, z2);
        try {
            Bitmap A022 = C37741pe.A02(options, A0b);
            if (A022 == null || A022.getWidth() == 0 || A022.getHeight() == 0) {
                throw new AnonymousClass20M();
            }
            A0b.close();
            return C17970vw.A07(A022, matrix, i2, i3);
        } catch (Throwable unused) {
        }
        throw th;
    }

    @Deprecated
    public Bitmap A0W(Uri uri, int i2, int i3) {
        return A0X(uri, i2, i3, true, true);
    }

    @Deprecated
    public Bitmap A0X(Uri uri, int i2, int i3, boolean z2, boolean z3) {
        Bitmap bitmap;
        Uri uri2 = uri;
        if (!TextUtils.isEmpty(uri.toString())) {
            Matrix A09 = C17970vw.A09(this.A03.A0C(), uri);
            int i4 = i2;
            boolean z4 = z2;
            BitmapFactory.Options A0Y = A0Y(uri, i2, z2, z3);
            int i5 = i3;
            try {
                bitmap = A0V(A0Y, A09, uri2, i4, i5, z4);
            } catch (OutOfMemoryError e2) {
                int i6 = A0Y.inSampleSize << 1;
                A0Y.inSampleSize = i6;
                StringBuilder sb = new StringBuilder("sample_rotate_image/oom ");
                sb.append(i6);
                Log.i(sb.toString(), e2);
                bitmap = A0V(A0Y, A09, uri2, i4, i5, z4);
            }
            bitmap.isMutable();
            StringBuilder sb2 = new StringBuilder("sample_rotate_image/final_size:");
            sb2.append(bitmap.getWidth());
            sb2.append(" | ");
            sb2.append(bitmap.getHeight());
            Log.i(sb2.toString());
            return bitmap;
        }
        StringBuilder sb3 = new StringBuilder("No file ");
        sb3.append(uri);
        throw new FileNotFoundException(sb3.toString());
    }

    @Deprecated
    public BitmapFactory.Options A0Y(Uri uri, int i2, boolean z2, boolean z3) {
        int i3;
        if (!TextUtils.isEmpty(uri.toString())) {
            BitmapFactory.Options options = new BitmapFactory.Options();
            InputStream A0b = A0b(uri, z2);
            try {
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeStream(A0b, (Rect) null, options);
                A0b.close();
                int i4 = options.outWidth;
                if (i4 <= 0 || (i3 = options.outHeight) <= 0) {
                    throw new AnonymousClass20M();
                }
                options.inSampleSize = 1;
                int i5 = 1;
                int max = Math.max(i4, i3);
                while (true) {
                    max >>= 1;
                    if (max > (i2 << 3) / 10) {
                        i5 <<= 1;
                        options.inSampleSize = i5;
                    } else {
                        options.inDither = true;
                        options.inJustDecodeBounds = false;
                        options.inScaled = false;
                        options.inPurgeable = true;
                        options.inInputShareable = true;
                        StringBuilder sb = new StringBuilder("sample_rotate_image/width=");
                        sb.append(i4);
                        sb.append(" | height=");
                        sb.append(i3);
                        sb.append(" | sample_size=");
                        sb.append(i5);
                        Log.i(sb.toString());
                        options.inPreferQualityOverSpeed = true;
                        options.inMutable = z3;
                        return options;
                    }
                }
            } catch (Throwable unused) {
            }
        } else {
            StringBuilder sb2 = new StringBuilder("No file ");
            sb2.append(uri);
            throw new FileNotFoundException(sb2.toString());
        }
        throw th;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01ef, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01f0, code lost:
        r0 = new java.lang.StringBuilder("mediafileutils/getfilefrommediastore/file-not-found; uri=");
        r0.append(r8);
        com.whatsapp.util.Log.w(r0.toString(), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0206, code lost:
        throw new java.io.IOException(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0207, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0208, code lost:
        r0 = new java.lang.StringBuilder("mediafileutils/getfilefrommediastore/unable to open stream; uri=");
        r0.append(r8);
        com.whatsapp.util.Log.w(r0.toString(), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x021e, code lost:
        throw new java.io.IOException(r2);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:101:0x01ee */
    /* JADX WARNING: Missing exception handler attribute for start block: B:38:0x00be */
    /* JADX WARNING: Missing exception handler attribute for start block: B:86:0x01dd */
    /* JADX WARNING: Missing exception handler attribute for start block: B:92:0x01e4 */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x01ef A[ExcHandler: SQLiteException | FileNotFoundException | NullPointerException (r2v2 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:50:0x00fd] */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0207 A[ExcHandler: IllegalStateException | SecurityException | UnsupportedOperationException (r2v1 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:50:0x00fd] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01a7 A[Catch:{ all -> 0x01d9, all -> 0x01dd, all -> 0x01de }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01ad A[Catch:{ all -> 0x01d9, all -> 0x01dd, all -> 0x01de }] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01bf A[Catch:{ all -> 0x01d9, all -> 0x01dd, all -> 0x01de }] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01d2 A[SYNTHETIC, Splitter:B:78:0x01d2] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:32:0x00b4=Splitter:B:32:0x00b4, B:38:0x00be=Splitter:B:38:0x00be} */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:75:0x01cd=Splitter:B:75:0x01cd, B:86:0x01dd=Splitter:B:86:0x01dd} */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:80:0x01d5=Splitter:B:80:0x01d5, B:101:0x01ee=Splitter:B:101:0x01ee} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.io.File A0Z(android.net.Uri r27) {
        /*
            r26 = this;
            r7 = r26
            X.0tB r2 = r7.A07
            r8 = r27
            r2.A01(r8)
            X.01V r0 = r7.A03
            android.content.ContentResolver r1 = r0.A0C()
            if (r1 == 0) goto L_0x021f
            java.lang.String r0 = "mediafileutils/getfilefrommediastore"
            X.1Zf r9 = new X.1Zf
            r9.<init>((java.lang.String) r0)
            java.lang.String r0 = r8.getScheme()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x00dc
            android.net.Uri$Builder r3 = r8.buildUpon()
            java.lang.String r0 = "file"
            android.net.Uri$Builder r0 = r3.scheme(r0)
            android.net.Uri r0 = r0.build()
        L_0x0030:
            java.io.File r3 = X.AnonymousClass1XI.A03(r0)
            if (r3 == 0) goto L_0x005a
            r0 = 0
            android.util.Pair r3 = android.util.Pair.create(r3, r0)
        L_0x003b:
            java.lang.Object r0 = r3.first
            r19 = r0
            r0 = r19
            java.io.File r0 = (java.io.File) r0
            r19 = r0
            java.lang.Object r6 = r3.second
            java.lang.String r6 = (java.lang.String) r6
            if (r0 == 0) goto L_0x00df
            X.0sb r3 = r7.A01
            boolean r0 = r3.A0U(r0)
            if (r0 == 0) goto L_0x00df
            boolean r0 = r19.exists()
            if (r0 == 0) goto L_0x00df
            return r19
        L_0x005a:
            java.lang.String r6 = "_data"
            java.lang.String r3 = r8.getAuthority()
            java.lang.String r0 = "media"
            boolean r0 = r0.equals(r3)
            r5 = 0
            if (r0 != 0) goto L_0x0070
            java.lang.String r0 = "not_media_store"
            android.util.Pair r3 = android.util.Pair.create(r5, r0)
            goto L_0x003b
        L_0x0070:
            r0 = 1
            java.lang.String[] r3 = new java.lang.String[r0]     // Catch:{ Exception -> 0x00bf }
            r0 = 0
            r3[r0] = r6     // Catch:{ Exception -> 0x00bf }
            r14 = r5
            r15 = r5
            r10 = r1
            r11 = r8
            r12 = r3
            r13 = r5
            android.database.Cursor r4 = r10.query(r11, r12, r13, r14, r15)     // Catch:{ Exception -> 0x00bf }
            if (r4 != 0) goto L_0x0089
            java.lang.String r0 = "no_cursor"
            android.util.Pair r3 = android.util.Pair.create(r5, r0)     // Catch:{ all -> 0x00b8 }
            goto L_0x003b
        L_0x0089:
            boolean r0 = r4.moveToFirst()     // Catch:{ all -> 0x00b8 }
            if (r0 != 0) goto L_0x0096
            java.lang.String r0 = "empty_cursor"
            android.util.Pair r3 = android.util.Pair.create(r5, r0)     // Catch:{ all -> 0x00b8 }
            goto L_0x00b4
        L_0x0096:
            int r0 = r4.getColumnIndexOrThrow(r6)     // Catch:{ all -> 0x00b8 }
            java.lang.String r3 = r4.getString(r0)     // Catch:{ all -> 0x00b8 }
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x00b8 }
            if (r0 == 0) goto L_0x00ab
            java.lang.String r0 = "empty"
            android.util.Pair r3 = android.util.Pair.create(r5, r0)     // Catch:{ all -> 0x00b8 }
            goto L_0x00b4
        L_0x00ab:
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x00b8 }
            r0.<init>(r3)     // Catch:{ all -> 0x00b8 }
            android.util.Pair r3 = android.util.Pair.create(r0, r5)     // Catch:{ all -> 0x00b8 }
        L_0x00b4:
            r4.close()     // Catch:{ Exception -> 0x00bf }
            goto L_0x003b
        L_0x00b8:
            r0 = move-exception
            if (r4 == 0) goto L_0x00be
            r4.close()     // Catch:{ all -> 0x00be }
        L_0x00be:
            throw r0     // Catch:{ Exception -> 0x00bf }
        L_0x00bf:
            r4 = move-exception
            java.lang.String r0 = "e="
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r0)
            java.lang.Class r0 = r4.getClass()
            java.lang.String r0 = r0.getName()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            android.util.Pair r3 = android.util.Pair.create(r5, r0)
            goto L_0x003b
        L_0x00dc:
            r0 = r8
            goto L_0x0030
        L_0x00df:
            java.lang.String r0 = "file searched"
            long r17 = r9.A02(r0)
            if (r19 == 0) goto L_0x00fb
            r3 = 268435456(0x10000000, float:2.5243549E-29)
            r0 = r19
            android.os.ParcelFileDescriptor r21 = android.os.ParcelFileDescriptor.open(r0, r3)     // Catch:{ Exception -> 0x00fb }
            r22 = 0
            long r24 = r21.getStatSize()     // Catch:{ Exception -> 0x00fb }
            android.content.res.AssetFileDescriptor r20 = new android.content.res.AssetFileDescriptor     // Catch:{ Exception -> 0x00fb }
            r20.<init>(r21, r22, r24)     // Catch:{ Exception -> 0x00fb }
            goto L_0x0117
        L_0x00fb:
            java.lang.String r0 = "r"
            android.content.res.AssetFileDescriptor r20 = r1.openAssetFileDescriptor(r8, r0)     // Catch:{ IllegalStateException | SecurityException | UnsupportedOperationException -> 0x0207, IllegalStateException | SecurityException | UnsupportedOperationException -> 0x0207, IllegalStateException | SecurityException | UnsupportedOperationException -> 0x0207, SQLiteException | FileNotFoundException | NullPointerException -> 0x01ef, SQLiteException | FileNotFoundException | NullPointerException -> 0x01ef, SQLiteException | FileNotFoundException | NullPointerException -> 0x01ef }
            if (r20 != 0) goto L_0x0117
            java.lang.String r1 = "mediafileutils/getfilefrommediastore/unable to open fd; uri="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ IllegalStateException | SecurityException | UnsupportedOperationException -> 0x0207, IllegalStateException | SecurityException | UnsupportedOperationException -> 0x0207, IllegalStateException | SecurityException | UnsupportedOperationException -> 0x0207, SQLiteException | FileNotFoundException | NullPointerException -> 0x01ef, SQLiteException | FileNotFoundException | NullPointerException -> 0x01ef, SQLiteException | FileNotFoundException | NullPointerException -> 0x01ef }
            r0.<init>(r1)     // Catch:{ IllegalStateException | SecurityException | UnsupportedOperationException -> 0x0207, IllegalStateException | SecurityException | UnsupportedOperationException -> 0x0207, IllegalStateException | SecurityException | UnsupportedOperationException -> 0x0207, SQLiteException | FileNotFoundException | NullPointerException -> 0x01ef, SQLiteException | FileNotFoundException | NullPointerException -> 0x01ef, SQLiteException | FileNotFoundException | NullPointerException -> 0x01ef }
            r0.append(r8)     // Catch:{ IllegalStateException | SecurityException | UnsupportedOperationException -> 0x0207, IllegalStateException | SecurityException | UnsupportedOperationException -> 0x0207, IllegalStateException | SecurityException | UnsupportedOperationException -> 0x0207, SQLiteException | FileNotFoundException | NullPointerException -> 0x01ef, SQLiteException | FileNotFoundException | NullPointerException -> 0x01ef, SQLiteException | FileNotFoundException | NullPointerException -> 0x01ef }
            java.lang.String r1 = r0.toString()     // Catch:{ IllegalStateException | SecurityException | UnsupportedOperationException -> 0x0207, IllegalStateException | SecurityException | UnsupportedOperationException -> 0x0207, IllegalStateException | SecurityException | UnsupportedOperationException -> 0x0207, SQLiteException | FileNotFoundException | NullPointerException -> 0x01ef, SQLiteException | FileNotFoundException | NullPointerException -> 0x01ef, SQLiteException | FileNotFoundException | NullPointerException -> 0x01ef }
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IllegalStateException | SecurityException | UnsupportedOperationException -> 0x0207, IllegalStateException | SecurityException | UnsupportedOperationException -> 0x0207, IllegalStateException | SecurityException | UnsupportedOperationException -> 0x0207, SQLiteException | FileNotFoundException | NullPointerException -> 0x01ef, SQLiteException | FileNotFoundException | NullPointerException -> 0x01ef, SQLiteException | FileNotFoundException | NullPointerException -> 0x01ef }
            r0.<init>(r1)     // Catch:{ IllegalStateException | SecurityException | UnsupportedOperationException -> 0x0207, IllegalStateException | SecurityException | UnsupportedOperationException -> 0x0207, IllegalStateException | SecurityException | UnsupportedOperationException -> 0x0207, SQLiteException | FileNotFoundException | NullPointerException -> 0x01ef, SQLiteException | FileNotFoundException | NullPointerException -> 0x01ef, SQLiteException | FileNotFoundException | NullPointerException -> 0x01ef }
            throw r0     // Catch:{ IllegalStateException | SecurityException | UnsupportedOperationException -> 0x0207, IllegalStateException | SecurityException | UnsupportedOperationException -> 0x0207, IllegalStateException | SecurityException | UnsupportedOperationException -> 0x0207, SQLiteException | FileNotFoundException | NullPointerException -> 0x01ef, SQLiteException | FileNotFoundException | NullPointerException -> 0x01ef, SQLiteException | FileNotFoundException | NullPointerException -> 0x01ef }
        L_0x0117:
            java.lang.String r0 = "opened"
            long r13 = r9.A02(r0)     // Catch:{ all -> 0x01ea }
            long r0 = r20.getLength()     // Catch:{ all -> 0x01ea }
            android.os.ParcelFileDescriptor r3 = r20.getParcelFileDescriptor()     // Catch:{ all -> 0x01ea }
            r2.A02(r3)     // Catch:{ all -> 0x01ea }
            java.lang.String r4 = X.C17970vw.A0H()     // Catch:{ all -> 0x01ea }
            long r2 = r20.getLength()     // Catch:{ all -> 0x01ea }
            java.io.File r12 = r7.A0a(r4, r2)     // Catch:{ all -> 0x01ea }
            java.io.FileInputStream r11 = r20.createInputStream()     // Catch:{ IOException -> 0x01e5 }
            java.io.FileOutputStream r10 = new java.io.FileOutputStream     // Catch:{ all -> 0x01de }
            r10.<init>(r12)     // Catch:{ all -> 0x01de }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x01d9 }
            r3.<init>()     // Catch:{ all -> 0x01d9 }
            java.lang.String r2 = "copy/start; size="
            r3.append(r2)     // Catch:{ all -> 0x01d9 }
            r3.append(r0)     // Catch:{ all -> 0x01d9 }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x01d9 }
            long r4 = r9.A02(r2)     // Catch:{ all -> 0x01d9 }
            X.AnonymousClass1XI.A0H(r11, r10)     // Catch:{ all -> 0x01d9 }
            java.lang.String r2 = "copy/end"
            long r2 = r9.A02(r2)     // Catch:{ all -> 0x01d9 }
            r15 = 10000000(0x989680, double:4.9406565E-317)
            int r9 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r9 >= 0) goto L_0x01cd
            r15 = 10000(0x2710, double:4.9407E-320)
            int r9 = (r2 > r15 ? 1 : (r2 == r15 ? 0 : -1))
            if (r9 <= 0) goto L_0x01cd
            X.0so r7 = r7.A00     // Catch:{ all -> 0x01d9 }
            r16 = r7
            java.lang.String r15 = "mediafileutils/getfilefrommediastore/slow"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x01d9 }
            r7.<init>()     // Catch:{ all -> 0x01d9 }
            java.lang.String r9 = "size="
            r7.append(r9)     // Catch:{ all -> 0x01d9 }
            r7.append(r0)     // Catch:{ all -> 0x01d9 }
            java.lang.String r0 = "; find="
            r7.append(r0)     // Catch:{ all -> 0x01d9 }
            r0 = r17
            r7.append(r0)     // Catch:{ all -> 0x01d9 }
            java.lang.String r0 = "; open="
            r7.append(r0)     // Catch:{ all -> 0x01d9 }
            r7.append(r13)     // Catch:{ all -> 0x01d9 }
            java.lang.String r0 = "; copyStart="
            r7.append(r0)     // Catch:{ all -> 0x01d9 }
            r7.append(r4)     // Catch:{ all -> 0x01d9 }
            java.lang.String r0 = "; copyEnd="
            r7.append(r0)     // Catch:{ all -> 0x01d9 }
            r7.append(r2)     // Catch:{ all -> 0x01d9 }
            java.lang.String r0 = "; found="
            r7.append(r0)     // Catch:{ all -> 0x01d9 }
            r2 = 0
            r0 = 0
            if (r19 == 0) goto L_0x01a8
            r0 = 1
        L_0x01a8:
            r7.append(r0)     // Catch:{ all -> 0x01d9 }
            if (r6 == 0) goto L_0x01bf
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01d9 }
            r1.<init>()     // Catch:{ all -> 0x01d9 }
            java.lang.String r0 = "; reason="
            r1.append(r0)     // Catch:{ all -> 0x01d9 }
            r1.append(r6)     // Catch:{ all -> 0x01d9 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x01d9 }
            goto L_0x01c1
        L_0x01bf:
            java.lang.String r0 = ""
        L_0x01c1:
            r7.append(r0)     // Catch:{ all -> 0x01d9 }
            java.lang.String r1 = r7.toString()     // Catch:{ all -> 0x01d9 }
            r0 = r16
            r0.AcB(r15, r1, r2)     // Catch:{ all -> 0x01d9 }
        L_0x01cd:
            r10.close()     // Catch:{ all -> 0x01de }
            if (r11 == 0) goto L_0x01d5
            r11.close()     // Catch:{ IOException -> 0x01e5 }
        L_0x01d5:
            r20.close()     // Catch:{ IllegalStateException | SecurityException | UnsupportedOperationException -> 0x0207, IllegalStateException | SecurityException | UnsupportedOperationException -> 0x0207, IllegalStateException | SecurityException | UnsupportedOperationException -> 0x0207, SQLiteException | FileNotFoundException | NullPointerException -> 0x01ef, SQLiteException | FileNotFoundException | NullPointerException -> 0x01ef, SQLiteException | FileNotFoundException | NullPointerException -> 0x01ef }
            return r12
        L_0x01d9:
            r0 = move-exception
            r10.close()     // Catch:{ all -> 0x01dd }
        L_0x01dd:
            throw r0     // Catch:{ all -> 0x01de }
        L_0x01de:
            r0 = move-exception
            if (r11 == 0) goto L_0x01e4
            r11.close()     // Catch:{ all -> 0x01e4 }
        L_0x01e4:
            throw r0     // Catch:{ IOException -> 0x01e5 }
        L_0x01e5:
            r0 = move-exception
            X.AnonymousClass1XI.A0N(r12)     // Catch:{ all -> 0x01ea }
            throw r0     // Catch:{ all -> 0x01ea }
        L_0x01ea:
            r0 = move-exception
            r20.close()     // Catch:{ all -> 0x01ee }
        L_0x01ee:
            throw r0     // Catch:{ IllegalStateException | SecurityException | UnsupportedOperationException -> 0x0207, IllegalStateException | SecurityException | UnsupportedOperationException -> 0x0207, IllegalStateException | SecurityException | UnsupportedOperationException -> 0x0207, SQLiteException | FileNotFoundException | NullPointerException -> 0x01ef, SQLiteException | FileNotFoundException | NullPointerException -> 0x01ef, SQLiteException | FileNotFoundException | NullPointerException -> 0x01ef }
        L_0x01ef:
            r2 = move-exception
            java.lang.String r1 = "mediafileutils/getfilefrommediastore/file-not-found; uri="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.w(r0, r2)
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r2)
            throw r0
        L_0x0207:
            r2 = move-exception
            java.lang.String r1 = "mediafileutils/getfilefrommediastore/unable to open stream; uri="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.w(r0, r2)
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r2)
            throw r0
        L_0x021f:
            java.lang.String r1 = "mediafileutils/getfilefrommediastore/no content resolver"
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1A9.A0Z(android.net.Uri):java.io.File");
    }

    public File A0a(String str, long j2) {
        long A022 = this.A06.A02();
        if (j2 < 0 || A022 - j2 <= 104857600) {
            StringBuilder sb = new StringBuilder("mediafileutils/getsharedfileforsize/returning external file; size=");
            sb.append(j2);
            sb.append("; internalAvailable=");
            sb.append(A022);
            Log.w(sb.toString());
            return this.A01.A0N(str);
        }
        File file = this.A01.A05().A09;
        C16180sb.A04(file, false);
        return C16180sb.A00(file, str);
    }

    public final InputStream A0b(Uri uri, boolean z2) {
        InputStream openInputStream;
        Uri build = uri.buildUpon().query((String) null).build();
        File A032 = AnonymousClass1XI.A03(build);
        if (A032 != null) {
            openInputStream = new FileInputStream(A032);
        } else {
            ContentResolver A0C = this.A03.A0C();
            if (A0C != null) {
                openInputStream = A0C.openInputStream(build);
                if (openInputStream == null) {
                    StringBuilder sb = new StringBuilder("Unable to open stream for uri=");
                    sb.append(build);
                    throw new IOException(sb.toString());
                }
            } else {
                throw new IOException("Could not get content resolver");
            }
        }
        if ((openInputStream instanceof FileInputStream) && z2) {
            this.A07.A05((FileInputStream) openInputStream);
        }
        return openInputStream;
    }

    public void A0c(Uri uri, C14600pS r10, AnonymousClass20K r11) {
        this.A08.Ack(new AnonymousClass20L(uri, r10, this.A02, this.A05, r11, this), new Void[0]);
    }

    public void A0d(File file) {
        if (file != null) {
            try {
                if (this.A01.A0U(file)) {
                    AnonymousClass1XI.A0N(file);
                }
            } catch (IOException e2) {
                StringBuilder sb = new StringBuilder("mediafileutils/unable to delete file ");
                sb.append(file);
                Log.e(sb.toString(), e2);
            }
        }
    }
}
