package X;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.util.Log;
import com.facebook.redex.IDxCListenerShape23S0000000_2_I1;
import com.facebook.redex.IDxCListenerShape29S0200000_2_I1;
import com.obwhatsapp.R;
import java.io.FileNotFoundException;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.37W  reason: invalid class name */
public class AnonymousClass37W extends C16690tT {
    public final C16570tH A00;
    public final C16180sb A01;
    public final C14870pt A02;
    public final C16190sc A03;
    public final AnonymousClass01V A04;
    public final C16440t3 A05;
    public final C16980tz A06;
    public final C20020zN A07;
    public final C16320sq A08;
    public final WeakReference A09;
    public final AtomicLong A0A = new AtomicLong();

    public AnonymousClass37W(Activity activity, C16570tH r3, C16180sb r4, C14870pt r5, C16190sc r6, AnonymousClass01V r7, C16440t3 r8, C16980tz r9, C20020zN r10, C16320sq r11) {
        this.A09 = C13690nt.A0h(activity);
        this.A06 = r9;
        this.A05 = r8;
        this.A02 = r5;
        this.A08 = r11;
        this.A01 = r4;
        this.A03 = r6;
        this.A04 = r7;
        this.A07 = r10;
        this.A00 = r3;
    }

    public static String A03(Context context, Uri uri, String str) {
        Cursor cursor = null;
        try {
            cursor = context.getContentResolver().query(uri, new String[]{str}, (String) null, (String[]) null, (String) null);
            if (cursor.moveToFirst() && !cursor.isNull(0)) {
                String string = cursor.getString(0);
                A06(cursor);
                return string;
            }
        } catch (Exception e2) {
            Log.w("DocumentFile", AnonymousClass000.A0e(e2, "Failed query: ", AnonymousClass000.A0o()));
        } catch (Throwable th) {
            A06((AutoCloseable) null);
            throw th;
        }
        A06(cursor);
        return null;
    }

    public static /* synthetic */ void A04(Activity activity, AnonymousClass37W r13) {
        C16320sq r11 = r13.A08;
        C16980tz r9 = r13.A06;
        C16440t3 r8 = r13.A05;
        C14870pt r5 = r13.A02;
        Activity activity2 = activity;
        r11.Ack(new AnonymousClass37W(activity2, r13.A00, r13.A01, r5, r13.A03, r13.A04, r8, r9, r13.A07, r11), new Uri[0]);
    }

    public static /* synthetic */ void A05(Activity activity, AnonymousClass37W r2) {
        activity.startActivity(C14750ph.A04(activity));
        r2.A07.A05("ManualExternalDirMigration");
    }

    public static void A06(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                autoCloseable.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    public static boolean A07(Context context, Uri uri) {
        Uri uri2 = uri;
        if (DocumentsContract.isDocumentUri(context, uri)) {
            Cursor cursor = null;
            try {
                cursor = context.getContentResolver().query(uri2, new String[]{"flags"}, (String) null, (String[]) null, (String) null);
                if (cursor.moveToFirst() && !cursor.isNull(0)) {
                    long j2 = cursor.getLong(0);
                    A06(cursor);
                    if ((j2 & 512) != 0) {
                        return true;
                    }
                }
            } catch (Exception e2) {
                Log.w("DocumentFile", AnonymousClass000.A0e(e2, "Failed query: ", AnonymousClass000.A0o()));
            } catch (Throwable th) {
                A06((AutoCloseable) null);
                throw th;
            }
            A06(cursor);
            return false;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00f3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r17) {
        /*
            r16 = this;
            r3 = r17
            android.net.Uri[] r3 = (android.net.Uri[]) r3
            r0 = 0
            java.util.concurrent.atomic.AtomicLong r15 = new java.util.concurrent.atomic.AtomicLong
            r15.<init>(r0)
            if (r3 == 0) goto L_0x0105
            int r2 = r3.length
            r5 = 1
            if (r2 != r5) goto L_0x0105
            r2 = 0
            r3 = r3[r2]
            if (r3 == 0) goto L_0x0105
            java.util.ArrayList r14 = X.AnonymousClass000.A0u()
            r10 = r16
            X.0tz r4 = r10.A06
            android.content.Context r2 = r4.A00
            X.0UT r9 = X.AnonymousClass0UT.A00(r2, r3)
            java.lang.String r2 = "externaldirmigration/manual/going to migrate "
            java.lang.String r2 = X.AnonymousClass000.A0g(r2, r9)
            com.whatsapp.util.Log.i((java.lang.String) r2)
            if (r9 == 0) goto L_0x00c4
            android.content.Context r6 = r9.A00
            android.net.Uri r3 = r9.A01
            boolean r2 = A07(r6, r3)
            if (r2 != 0) goto L_0x00c4
            java.lang.String r2 = "_display_name"
            java.lang.String r2 = A03(r6, r3, r2)
            if (r2 == 0) goto L_0x00c4
            java.lang.String r2 = "mime_type"
            java.lang.String r3 = A03(r6, r3, r2)
            java.lang.String r2 = "vnd.android.document/directory"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x00c4
            X.01V r2 = r10.A04
            android.content.ContentResolver r11 = r2.A0C()
            if (r11 != 0) goto L_0x0078
            java.lang.String r2 = "externaldirmigration/manual/no content resolver"
            com.whatsapp.util.Log.e((java.lang.String) r2)
        L_0x005d:
            r15.incrementAndGet()
        L_0x0060:
            boolean r2 = r14.isEmpty()
            if (r2 != 0) goto L_0x00e1
            java.util.concurrent.CountDownLatch r6 = new java.util.concurrent.CountDownLatch
            r6.<init>(r5)
            X.0sb r4 = r10.A01
            r3 = 33
            com.facebook.redex.RunnableRunnableShape6S0100000_I0_5 r2 = new com.facebook.redex.RunnableRunnableShape6S0100000_I0_5
            r2.<init>(r6, r3)
            r4.A0S(r2, r14)
            goto L_0x00d7
        L_0x0078:
            X.0sc r2 = r10.A03
            java.io.File r13 = r2.A05()
            X.AnonymousClass00B.A06(r13)
            X.0UT[] r8 = r9.A01()
            int r7 = r8.length
            r6 = 1
            r3 = 0
        L_0x0088:
            if (r3 >= r7) goto L_0x0096
            r12 = r8[r3]
            boolean r2 = r10.A0C(r11, r12, r13, r14, r15)
            if (r2 != 0) goto L_0x0093
            r6 = 0
        L_0x0093:
            int r3 = r3 + 1
            goto L_0x0088
        L_0x0096:
            if (r6 == 0) goto L_0x009c
            boolean r6 = r10.A0B(r11, r9)
        L_0x009c:
            java.lang.String r2 = "externaldirmigration/manual/succeeded: "
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0r(r2)
            r2.append(r6)
            X.C13680ns.A1V(r2)
            if (r6 == 0) goto L_0x0060
            java.io.File r3 = android.os.Environment.getExternalStorageDirectory()
            java.lang.String r2 = "OBWhatsApp"
            java.io.File r3 = X.C13700nu.A0C(r3, r2)
            android.net.Uri r2 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI
            X.C26301Ne.A00(r2, r4, r3)
            android.net.Uri r2 = android.provider.MediaStore.Video.Media.EXTERNAL_CONTENT_URI
            X.C26301Ne.A00(r2, r4, r3)
            android.net.Uri r2 = android.provider.MediaStore.Audio.Media.EXTERNAL_CONTENT_URI
            X.C26301Ne.A00(r2, r4, r3)
            goto L_0x0060
        L_0x00c4:
            java.lang.String r2 = "externaldirmigration/manual/not a suitable tree to migrate ("
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0r(r2)
            r3.append(r9)
            java.lang.String r2 = ")"
            java.lang.String r2 = X.AnonymousClass000.A0h(r2, r3)
            com.whatsapp.util.Log.w((java.lang.String) r2)
            goto L_0x005d
        L_0x00d7:
            r6.await()     // Catch:{ InterruptedException -> 0x00db }
            goto L_0x00e1
        L_0x00db:
            r3 = move-exception
            java.lang.String r2 = "OBWhatsAppscan interrupted"
            com.whatsapp.util.Log.w(r2, r3)
        L_0x00e1:
            r6 = 300(0x12c, double:1.48E-321)
            long r4 = java.lang.System.currentTimeMillis()
            java.util.concurrent.atomic.AtomicLong r2 = r10.A0A
            long r2 = r2.get()
            long r4 = r4 - r2
            long r6 = r6 - r4
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x00f6
            android.os.SystemClock.sleep(r6)
        L_0x00f6:
            int r0 = r14.size()
            long r2 = (long) r0
            long r0 = r15.get()
            X.4Ii r4 = new X.4Ii
            r4.<init>(r2, r0)
            return r4
        L_0x0105:
            long r2 = r15.get()
            X.4Ii r4 = new X.4Ii
            r4.<init>(r0, r2)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass37W.A08(java.lang.Object[]):java.lang.Object");
    }

    public void A09() {
        this.A0A.set(System.currentTimeMillis());
        this.A02.A08(0, R.string.str0cac);
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        C32241fu A002;
        int i2;
        int i3;
        C83864Ii r10 = (C83864Ii) obj;
        this.A02.A05();
        StringBuilder A0r = AnonymousClass000.A0r("externaldirmigration/manual/migration results: moved ");
        A0r.append(r10.A01);
        A0r.append(" failed ");
        long j2 = r10.A00;
        A0r.append(j2);
        C13680ns.A1V(A0r);
        C16190sc r2 = this.A03;
        boolean z2 = !r2.A0A();
        if (!z2) {
            r2.A09("scoped");
        }
        Activity activity = (Activity) this.A09.get();
        if (activity != null && !AnonymousClass29T.A03(activity) && this.A00.A00) {
            if (z2) {
                A002 = C32241fu.A00(activity);
                A002.A02(R.string.str0ca8);
                A002.A06(C13680ns.A0d(activity, activity.getString(R.string.str1cf7), new Object[1], 0, R.string.str0cad));
                A002.A07(false);
                i2 = R.string.str0e87;
                i3 = 30;
            } else {
                int i4 = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
                A002 = C32241fu.A00(activity);
                if (i4 == 0) {
                    A002.A02(R.string.str0ca9);
                    A002.A01(R.string.str0cae);
                    A002.A07(false);
                    A002.setPositiveButton(R.string.str0e87, new IDxCListenerShape23S0000000_2_I1(19));
                    C13690nt.A1G(A002);
                    return;
                }
                A002.A02(R.string.str0cab);
                A002.A01(R.string.str0caa);
                A002.A07(false);
                A002.setNegativeButton(R.string.str0394, new IDxCListenerShape23S0000000_2_I1(18));
                i2 = R.string.str0caf;
                i3 = 29;
            }
            A002.setPositiveButton(i2, new IDxCListenerShape29S0200000_2_I1(activity, i3, this));
            C13690nt.A1G(A002);
        } else if (z2) {
            this.A07.A05("ManualExternalDirMigration");
        }
    }

    public final boolean A0B(ContentResolver contentResolver, AnonymousClass0UT r15) {
        Uri uri = r15.A01;
        boolean z2 = true;
        Cursor query = contentResolver.query(uri, new String[]{"flags"}, (String) null, (String[]) null, (String) null);
        if (query != null) {
            try {
                if (query.moveToFirst()) {
                    int columnIndexOrThrow = query.getColumnIndexOrThrow("flags");
                    if (!query.isNull(columnIndexOrThrow)) {
                        if ((query.getLong(columnIndexOrThrow) & 4) == 0) {
                            z2 = false;
                        }
                        query.close();
                        if (z2) {
                            try {
                                return DocumentsContract.deleteDocument(contentResolver, uri);
                            } catch (FileNotFoundException e2) {
                                com.whatsapp.util.Log.e("externaldirmigration/manual/", e2);
                                return false;
                            }
                        }
                    }
                }
                query.close();
            } catch (Throwable unused) {
            }
        }
        com.whatsapp.util.Log.w("externaldirmigration/manual/file deletion is not supported");
        return true;
        throw th;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x00c7 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x00ce */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:53:0x00c7=Splitter:B:53:0x00c7, B:26:0x0079=Splitter:B:26:0x0079} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0C(android.content.ContentResolver r16, X.AnonymousClass0UT r17, java.io.File r18, java.util.List r19, java.util.concurrent.atomic.AtomicLong r20) {
        /*
            r15 = this;
            r4 = 1
            r5 = r17
            if (r17 == 0) goto L_0x00bb
            android.content.Context r8 = r5.A00
            android.net.Uri r2 = r5.A01
            boolean r0 = A07(r8, r2)
            if (r0 != 0) goto L_0x00bb
            java.lang.String r0 = "_display_name"
            java.lang.String r1 = A03(r8, r2, r0)
            if (r1 != 0) goto L_0x001d
            java.lang.String r0 = "externaldirmigration/manual/file name is null"
        L_0x0019:
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x001c:
            return r4
        L_0x001d:
            r0 = r18
            java.io.File r12 = X.C13700nu.A0C(r0, r1)
            java.lang.String r7 = "mime_type"
            java.lang.String r3 = A03(r8, r2, r7)
            java.lang.String r0 = "vnd.android.document/directory"
            boolean r0 = r0.equals(r3)
            java.lang.String r6 = "externaldirmigration/manual/failed to delete source file for "
            r3 = 0
            r9 = r15
            r10 = r16
            r13 = r19
            r14 = r20
            if (r0 != 0) goto L_0x007f
            int r0 = r8.checkCallingOrSelfUriPermission(r2, r4)
            if (r0 != 0) goto L_0x00d9
            java.lang.String r0 = A03(r8, r2, r7)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00d9
            boolean r0 = r12.exists()
            if (r0 == 0) goto L_0x0059
            java.lang.String r0 = "externaldirmigration/manual/target file already exists "
            java.lang.String r0 = X.AnonymousClass000.A0g(r0, r12)
            goto L_0x0019
        L_0x0059:
            java.io.InputStream r2 = r10.openInputStream(r2)     // Catch:{ IOException -> 0x00cf }
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ all -> 0x00c8 }
            r1.<init>(r12)     // Catch:{ all -> 0x00c8 }
            X.AnonymousClass1XI.A0H(r2, r1)     // Catch:{ all -> 0x00c3 }
            r13.add(r12)     // Catch:{ all -> 0x00c3 }
            boolean r0 = r15.A0B(r10, r5)     // Catch:{ all -> 0x00c3 }
            if (r0 != 0) goto L_0x0079
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0q(r6)     // Catch:{ all -> 0x00c3 }
            java.lang.String r0 = X.AnonymousClass000.A0f(r12, r0)     // Catch:{ all -> 0x00c3 }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x00c3 }
        L_0x0079:
            r1.close()     // Catch:{ all -> 0x00c8 }
            if (r2 == 0) goto L_0x001c
            goto L_0x00bf
        L_0x007f:
            boolean r0 = r12.exists()
            if (r0 != 0) goto L_0x0095
            boolean r0 = r12.mkdirs()
            if (r0 != 0) goto L_0x0095
            java.lang.String r0 = "externaldirmigration/manual/failed to create target directory "
            java.lang.String r0 = X.AnonymousClass000.A0g(r0, r12)
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return r3
        L_0x0095:
            X.0UT[] r3 = r5.A01()
            int r2 = r3.length
            r1 = 0
        L_0x009b:
            if (r1 >= r2) goto L_0x00a9
            r11 = r3[r1]
            boolean r0 = r9.A0C(r10, r11, r12, r13, r14)
            if (r0 != 0) goto L_0x00a6
            r4 = 0
        L_0x00a6:
            int r1 = r1 + 1
            goto L_0x009b
        L_0x00a9:
            if (r4 == 0) goto L_0x001c
            boolean r0 = r15.A0B(r10, r5)
            if (r0 != 0) goto L_0x001c
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0q(r6)
            java.lang.String r0 = X.AnonymousClass000.A0f(r12, r0)
            goto L_0x0019
        L_0x00bb:
            java.lang.String r0 = "externaldirmigration/manual/doc file either null or virtual"
            goto L_0x0019
        L_0x00bf:
            r2.close()     // Catch:{ IOException -> 0x00cf }
            return r4
        L_0x00c3:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x00c7 }
        L_0x00c7:
            throw r0     // Catch:{ all -> 0x00c8 }
        L_0x00c8:
            r0 = move-exception
            if (r2 == 0) goto L_0x00ce
            r2.close()     // Catch:{ all -> 0x00ce }
        L_0x00ce:
            throw r0     // Catch:{ IOException -> 0x00cf }
        L_0x00cf:
            r1 = move-exception
            java.lang.String r0 = "externaldirmigration/manual//failed to copy file"
            com.whatsapp.util.Log.e(r0, r1)
            r14.incrementAndGet()
            return r3
        L_0x00d9:
            java.lang.String r0 = "externaldirmigration/manual/cannot read file "
            java.lang.String r0 = X.C13680ns.A0h(r0, r1)
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r14.incrementAndGet()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass37W.A0C(android.content.ContentResolver, X.0UT, java.io.File, java.util.List, java.util.concurrent.atomic.AtomicLong):boolean");
    }
}
