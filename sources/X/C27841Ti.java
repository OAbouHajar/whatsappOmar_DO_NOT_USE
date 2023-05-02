package X;

import android.net.Uri;
import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.1Ti  reason: invalid class name and case insensitive filesystem */
public class C27841Ti {
    public final C16180sb A00;
    public final C16190sc A01;
    public final AnonymousClass12W A02;
    public final C16980tz A03;
    public final C16260sj A04;
    public final C15860rz A05;
    public final C14730pf A06;
    public final C27851Tj A07;
    public final C27861Tk A08;

    public C27841Ti(C16180sb r1, C16190sc r2, AnonymousClass12W r3, C16980tz r4, C16260sj r5, C15860rz r6, C14730pf r7, C27851Tj r8, C27861Tk r9) {
        this.A03 = r4;
        this.A00 = r1;
        this.A01 = r2;
        this.A06 = r7;
        this.A02 = r3;
        this.A04 = r5;
        this.A05 = r6;
        this.A07 = r8;
        this.A08 = r9;
    }

    public static final Uri A00(String str, String str2, String str3) {
        Uri.Builder appendPath = new Uri.Builder().scheme("content").authority("com.obwhatsapp.provider.MigrationContentProvider").appendPath("media");
        if (str != null) {
            appendPath.appendQueryParameter("query_param_country_code", str);
        }
        if (str2 != null) {
            appendPath.appendQueryParameter("query_param_phone_number", str2);
        }
        if (str3 != null) {
            appendPath.appendQueryParameter("path", str3);
        }
        return appendPath.build();
    }

    public static boolean A01(File file) {
        StringBuilder sb;
        String str;
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            StringBuilder sb2 = new StringBuilder("MediaMigrationUtil/mediaFolderIsEmpty/no-files-in-folder: ");
            sb2.append(file);
            Log.i(sb2.toString());
        } else {
            int length = listFiles.length;
            int i2 = 0;
            while (i2 < length) {
                File file2 = listFiles[i2];
                if (file2.isDirectory() && !A01(file2)) {
                    sb = new StringBuilder();
                    str = "MediaMigrationUtil/mediaFolderIsEmpty/is-directory-and-contain-media-file-name: ";
                } else if (file2.isDirectory() || ".nomedia".equals(file2.getName())) {
                    i2++;
                } else {
                    sb = new StringBuilder();
                    str = "MediaMigrationUtil/mediaFolderIsEmpty/is-file-and-is-media-file-file-name: ";
                }
                sb.append(str);
                sb.append(file2);
                Log.i(sb.toString());
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0037, code lost:
        if (r4.A0Q().equals(((android.content.SharedPreferences) r6.get()).getString("registration_sibling_app_phone_number", (java.lang.String) null)) == false) goto L_0x0039;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:107:0x0274 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:74:0x01fd */
    /* JADX WARNING: Missing exception handler attribute for start block: B:79:0x0202 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:86:0x020b */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:107:0x0274=Splitter:B:107:0x0274, B:102:0x026c=Splitter:B:102:0x026c} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02() {
        /*
            r19 = this;
            java.lang.String r0 = "MediaMigrationUtil/moveMediaIfNeeded/moveMediaFromSisterApp"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r3 = r19
            X.0rz r4 = r3.A05
            java.lang.String r2 = r4.A0O()
            X.01D r6 = r4.A01
            java.lang.Object r1 = r6.get()
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1
            java.lang.String r0 = "registration_sibling_app_country_code"
            r5 = 0
            java.lang.String r0 = r1.getString(r0, r5)
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0039
            java.lang.String r2 = r4.A0Q()
            java.lang.Object r1 = r6.get()
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1
            java.lang.String r0 = "registration_sibling_app_phone_number"
            java.lang.String r0 = r1.getString(r0, r5)
            boolean r0 = r2.equals(r0)
            r2 = 1
            if (r0 != 0) goto L_0x003a
        L_0x0039:
            r2 = 0
        L_0x003a:
            java.lang.String r1 = "MediaMigrationUtil/shouldMoveAllMediaFromOtherApp/samePhoneNumberAsOtherApp= "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            if (r2 != 0) goto L_0x005e
            X.1Tj r1 = r3.A07
            r0 = 3
            X.2Ep r1 = r1.A01
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A05 = r0
            java.lang.String r0 = "MediaMigrationUtil/moveMediaFolderFromSisterApp/did-not-move-phone-number-not-matched"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x005e:
            java.lang.String r0 = "MediaMigrationUtil/moveMediaFolderFromSisterApp/moving media from sister app"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0sb r0 = r3.A00
            r0.A0Q()
            java.lang.String r5 = "Media"
            java.io.File r2 = android.os.Environment.getExternalStorageDirectory()
            java.lang.String r1 = "OBWhatsApp Business"
            java.io.File r0 = new java.io.File
            r0.<init>(r2, r1)
            java.io.File r2 = new java.io.File
            r2.<init>(r0, r5)
            X.0sc r0 = r3.A01
            r18 = r0
            java.io.File r9 = r18.A04()
            java.lang.String r0 = "MediaMigrationUtil/moveMediaFolderFromSisterApp/moving from= "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = r2.getAbsolutePath()
            r1.append(r0)
            java.lang.String r0 = " and to= "
            r1.append(r0)
            java.lang.String r0 = r9.getAbsolutePath()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0sj r7 = r3.A04
            boolean r0 = r7.A0B()
            r8 = 0
            if (r0 != 0) goto L_0x00bd
            java.lang.String r0 = "MediaMigrationUtil/moveMediaFolderFromSisterApp/destination-permission-not-granted"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1Tj r1 = r3.A07
            r0 = 6
        L_0x00b4:
            X.2Ep r1 = r1.A01
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A05 = r0
            return
        L_0x00bd:
            X.0tz r0 = r3.A03
            android.content.Context r5 = r0.A00
            r0 = 1
            java.lang.String[] r6 = X.C28971Zm.A00(r5, r8, r0)
            int r1 = r6.length
        L_0x00c7:
            if (r8 >= r1) goto L_0x00dd
            r0 = r6[r8]
            boolean r0 = X.C16260sj.A02(r5, r0)
            if (r0 != 0) goto L_0x00da
            java.lang.String r0 = "MediaMigrationUtil/moveMediaFolderFromSisterApp/origin-permission-not-granted"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1Tj r1 = r3.A07
            r0 = 5
            goto L_0x00b4
        L_0x00da:
            int r8 = r8 + 1
            goto L_0x00c7
        L_0x00dd:
            boolean r0 = A01(r9)
            if (r0 != 0) goto L_0x00ec
            java.lang.String r0 = "MediaMigrationUtil/moveMediaFolderFromSisterApp/destination-folder-not-empty-did-not-move"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1Tj r1 = r3.A07
            r0 = 2
            goto L_0x00b4
        L_0x00ec:
            boolean r0 = X.C16190sc.A01()
            if (r0 != 0) goto L_0x0101
            boolean r0 = A01(r2)
            if (r0 == 0) goto L_0x0101
            java.lang.String r0 = "MediaMigrationUtil/moveMediaFolderFromSisterApp/origin-folder-is-empty-nothing-to-move"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1Tj r1 = r3.A07
            r0 = 4
            goto L_0x00b4
        L_0x0101:
            java.lang.String r0 = "MediaMigrationUtil/moveMediaFolderFromSisterApp/all-conditions-are-met"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.AnonymousClass1XI.A0D(r9)
            java.io.File r0 = r18.A04()
            r0.mkdir()
            boolean r0 = X.C16190sc.A01()
            if (r0 != 0) goto L_0x012b
            boolean r0 = r7.A0B()
            if (r0 == 0) goto L_0x012b
            boolean r0 = r2.exists()
            if (r0 == 0) goto L_0x012b
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r1 < r0) goto L_0x012b
            r2.listFiles()
        L_0x012b:
            java.lang.String r1 = r4.A0O()
            java.lang.String r0 = r4.A0Q()
            r8 = 0
            android.net.Uri r7 = A00(r1, r0, r8)
            r2 = 0
            android.content.ContentResolver r6 = r5.getContentResolver()     // Catch:{ Exception -> 0x0275 }
            r10 = r8
            r11 = r8
            r9 = r8
            android.database.Cursor r7 = r6.query(r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x0275 }
            if (r7 == 0) goto L_0x0279
            int r9 = r7.getCount()     // Catch:{ all -> 0x0270 }
            if (r9 != 0) goto L_0x0153
            java.lang.String r0 = "MediaMigrationUtil/moveMediaWithContentProvider/origin-folder-is-empty-nothing-to-move"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0270 }
            goto L_0x026c
        L_0x0153:
            X.1Tk r10 = r3.A08     // Catch:{ all -> 0x0270 }
            X.0pt r8 = r10.A03     // Catch:{ all -> 0x0270 }
            java.lang.Runnable r6 = r10.A02     // Catch:{ all -> 0x0270 }
            r0 = 500(0x1f4, double:2.47E-321)
            r8.A0L(r6, r0)     // Catch:{ all -> 0x0270 }
            r12 = 0
            r11 = 0
        L_0x0160:
            boolean r0 = r7.moveToNext()     // Catch:{ all -> 0x0270 }
            if (r0 == 0) goto L_0x0257
            java.lang.String r13 = r7.getString(r2)     // Catch:{ all -> 0x0270 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0270 }
            r1.<init>()     // Catch:{ all -> 0x0270 }
            java.lang.String r0 = "MediaMigrationUtil/moveMediaWithContentProvider/file = "
            r1.append(r0)     // Catch:{ all -> 0x0270 }
            r1.append(r13)     // Catch:{ all -> 0x0270 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0270 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0270 }
            java.io.File r0 = r18.A04()     // Catch:{ all -> 0x0270 }
            java.io.File r14 = new java.io.File     // Catch:{ all -> 0x0270 }
            r14.<init>(r0, r13)     // Catch:{ all -> 0x0270 }
            boolean r0 = r14.exists()     // Catch:{ all -> 0x0270 }
            r17 = 0
            if (r0 == 0) goto L_0x01af
            boolean r0 = r14.delete()     // Catch:{ all -> 0x0270 }
            if (r0 != 0) goto L_0x01af
            java.lang.String r0 = "MediaMigrationUtil/moveMediaFile/file = "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0270 }
            r1.<init>(r0)     // Catch:{ all -> 0x0270 }
            r1.append(r14)     // Catch:{ all -> 0x0270 }
            java.lang.String r0 = " already exists"
            r1.append(r0)     // Catch:{ all -> 0x0270 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0270 }
        L_0x01a8:
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0270 }
            if (r17 != 0) goto L_0x024f
            goto L_0x0239
        L_0x01af:
            android.content.ContentResolver r15 = r5.getContentResolver()     // Catch:{ IOException | SecurityException -> 0x020c }
            java.lang.String r1 = r4.A0O()     // Catch:{ IOException | SecurityException -> 0x020c }
            java.lang.String r0 = r4.A0Q()     // Catch:{ IOException | SecurityException -> 0x020c }
            android.net.Uri r1 = A00(r1, r0, r13)     // Catch:{ IOException | SecurityException -> 0x020c }
            java.lang.String r0 = "r"
            android.os.ParcelFileDescriptor r16 = r15.openFileDescriptor(r1, r0)     // Catch:{ IOException | SecurityException -> 0x020c }
            if (r16 == 0) goto L_0x0239
            java.io.FileDescriptor r0 = r16.getFileDescriptor()     // Catch:{ all -> 0x0207 }
            if (r0 == 0) goto L_0x0203
            java.io.File r0 = r14.getParentFile()     // Catch:{ all -> 0x0207 }
            X.AnonymousClass00B.A06(r0)     // Catch:{ all -> 0x0207 }
            r0.mkdirs()     // Catch:{ all -> 0x0207 }
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ all -> 0x0207 }
            r1.<init>(r14)     // Catch:{ all -> 0x0207 }
            java.io.FileDescriptor r0 = r16.getFileDescriptor()     // Catch:{ all -> 0x01fe }
            java.io.FileInputStream r14 = new java.io.FileInputStream     // Catch:{ all -> 0x01fe }
            r14.<init>(r0)     // Catch:{ all -> 0x01fe }
            java.nio.channels.FileChannel r15 = r14.getChannel()     // Catch:{ all -> 0x01f9 }
            java.nio.channels.WritableByteChannel r0 = java.nio.channels.Channels.newChannel(r1)     // Catch:{ all -> 0x01f9 }
            X.AnonymousClass1XI.A0I(r15, r0)     // Catch:{ all -> 0x01f9 }
            r14.close()     // Catch:{ all -> 0x01fe }
            r1.close()     // Catch:{ all -> 0x0207 }
            r17 = 1
            goto L_0x0203
        L_0x01f9:
            r0 = move-exception
            r14.close()     // Catch:{ all -> 0x01fd }
        L_0x01fd:
            throw r0     // Catch:{ all -> 0x01fe }
        L_0x01fe:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0202 }
        L_0x0202:
            throw r0     // Catch:{ all -> 0x0207 }
        L_0x0203:
            r16.close()     // Catch:{ IOException | SecurityException -> 0x020c }
            goto L_0x0210
        L_0x0207:
            r0 = move-exception
            r16.close()     // Catch:{ all -> 0x020b }
        L_0x020b:
            throw r0     // Catch:{ IOException | SecurityException -> 0x020c }
        L_0x020c:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)     // Catch:{ all -> 0x0270 }
        L_0x0210:
            if (r17 == 0) goto L_0x0239
            android.content.ContentResolver r14 = r5.getContentResolver()     // Catch:{ all -> 0x0270 }
            java.lang.String r1 = r4.A0O()     // Catch:{ all -> 0x0270 }
            java.lang.String r0 = r4.A0Q()     // Catch:{ all -> 0x0270 }
            android.net.Uri r1 = A00(r1, r0, r13)     // Catch:{ all -> 0x0270 }
            r0 = 0
            int r0 = r14.delete(r1, r0, r0)     // Catch:{ all -> 0x0270 }
            if (r0 > 0) goto L_0x024f
            java.lang.String r1 = "MediaMigrationUtil/deleteMediaFile/Could not delete "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0270 }
            r0.<init>(r1)     // Catch:{ all -> 0x0270 }
            r0.append(r13)     // Catch:{ all -> 0x0270 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0270 }
            goto L_0x01a8
        L_0x0239:
            int r12 = r12 + 1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0270 }
            r1.<init>()     // Catch:{ all -> 0x0270 }
            java.lang.String r0 = "MediaMigrationUtil/moveMediaWithContentProvider/Failed to move file = "
            r1.append(r0)     // Catch:{ all -> 0x0270 }
            r1.append(r13)     // Catch:{ all -> 0x0270 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0270 }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0270 }
        L_0x024f:
            int r11 = r11 + 1
            r10.A00 = r11     // Catch:{ all -> 0x0270 }
            r10.A01 = r9     // Catch:{ all -> 0x0270 }
            goto L_0x0160
        L_0x0257:
            float r1 = (float) r12     // Catch:{ all -> 0x0270 }
            r0 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 * r0
            float r0 = (float) r9     // Catch:{ all -> 0x0270 }
            float r1 = r1 / r0
            double r4 = (double) r1     // Catch:{ all -> 0x0270 }
            r1 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x026c
            r7.close()     // Catch:{ Exception -> 0x0275 }
            r8.A0J(r6)
            r2 = 1
            goto L_0x0283
        L_0x026c:
            r7.close()     // Catch:{ Exception -> 0x0275 }
            goto L_0x0279
        L_0x0270:
            r0 = move-exception
            r7.close()     // Catch:{ all -> 0x0274 }
        L_0x0274:
            throw r0     // Catch:{ Exception -> 0x0275 }
        L_0x0275:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)     // Catch:{ all -> 0x029a }
        L_0x0279:
            X.1Tk r0 = r3.A08
            X.0pt r1 = r0.A03
            java.lang.Runnable r0 = r0.A02
            r1.A0J(r0)
            r2 = 0
        L_0x0283:
            java.lang.String r1 = "MediaMigrationUtil/moveMediaFolderFromSisterApp/successfully-renamed = "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1Tj r1 = r3.A07
            r0 = r2 ^ 1
            goto L_0x00b4
        L_0x029a:
            r2 = move-exception
            X.1Tk r0 = r3.A08
            X.0pt r1 = r0.A03
            java.lang.Runnable r0 = r0.A02
            r1.A0J(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27841Ti.A02():void");
    }
}
