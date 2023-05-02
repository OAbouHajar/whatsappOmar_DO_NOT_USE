package com.obwhatsapp.registration.directmigration;

import X.AnonymousClass00B;
import X.AnonymousClass01Q;
import X.C15860rz;
import X.C15870s2;
import X.C15900s5;
import X.C16040sK;
import X.C16180sb;
import X.C16190sc;
import X.C16200sd;
import X.C16210se;
import X.C16220sf;
import X.C16250si;
import X.C16260sj;
import X.C16270sk;
import X.C16280sl;
import X.C16290sm;
import X.C16900tq;
import X.C16940tv;
import X.C16950tw;
import X.C16960tx;
import X.C16990u0;
import X.C17000u1;
import android.content.ContentValues;
import android.content.SharedPreferences;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import org.json.JSONArray;

public class MigrationContentProvider extends C15870s2 {
    public static UriMatcher A0D;
    public static final List A0E;
    public C16180sb A00;
    public C16040sK A01;
    public C15900s5 A02;
    public C16270sk A03;
    public C16200sd A04;
    public C16190sc A05;
    public C16260sj A06;
    public C15860rz A07;
    public C16290sm A08;
    public C16250si A09;
    public C16220sf A0A;
    public C16210se A0B;
    public C16280sl A0C;

    static {
        ArrayList arrayList = new ArrayList(Arrays.asList(new AnonymousClass01Q[]{new AnonymousClass01Q("push_name", 2), new AnonymousClass01Q("interface_gdrive_backup_frequency", 2), new AnonymousClass01Q("interface_gdrive_backup_network_setting", 2), new AnonymousClass01Q("gdrive_include_videos_in_backup", 1)}));
        arrayList.addAll(C15860rz.A00());
        A0E = Collections.unmodifiableList(arrayList);
    }

    public static synchronized UriMatcher A00() {
        UriMatcher uriMatcher;
        synchronized (MigrationContentProvider.class) {
            if (A0D == null) {
                UriMatcher uriMatcher2 = new UriMatcher(-1);
                A0D = uriMatcher2;
                uriMatcher2.addURI("com.obwhatsapp.provider.MigrationContentProvider", "msg_store", 1);
                A0D.addURI("com.obwhatsapp.provider.MigrationContentProvider", "wallpaper", 2);
                A0D.addURI("com.obwhatsapp.provider.MigrationContentProvider", "chat_setting_store", 3);
                A0D.addURI("com.obwhatsapp.provider.MigrationContentProvider", "sticker_store", 4);
                A0D.addURI("com.obwhatsapp.provider.MigrationContentProvider", "share_preferences", 5);
                A0D.addURI("com.obwhatsapp.provider.MigrationContentProvider", "media", 7);
            }
            uriMatcher = A0D;
        }
        return uriMatcher;
    }

    public final int A01(Uri uri, int i2) {
        return A02(uri.getQueryParameter("query_param_country_code"), uri.getQueryParameter("query_param_phone_number"), i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0068, code lost:
        if (r0 != false) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0078, code lost:
        if (r3 < r1) goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0081, code lost:
        if (r11 == 268435456) goto L_0x0083;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A02(java.lang.String r9, java.lang.String r10, int r11) {
        /*
            r8 = this;
            android.content.Context r3 = r8.getContext()
            if (r3 != 0) goto L_0x0008
            r0 = 7
        L_0x0007:
            return r0
        L_0x0008:
            android.content.pm.PackageManager r1 = r3.getPackageManager()
            int r0 = android.os.Binder.getCallingUid()
            java.lang.String r2 = r1.getNameForUid(r0)
            r7 = 0
            android.content.pm.PackageManager r4 = r3.getPackageManager()     // Catch:{ RuntimeException -> 0x002a }
            android.content.pm.ApplicationInfo r0 = r3.getApplicationInfo()     // Catch:{ RuntimeException -> 0x002a }
            int r1 = r0.uid     // Catch:{ RuntimeException -> 0x002a }
            int r0 = android.os.Binder.getCallingUid()     // Catch:{ RuntimeException -> 0x002a }
            int r0 = r4.checkSignatures(r1, r0)     // Catch:{ RuntimeException -> 0x002a }
            if (r0 != 0) goto L_0x003e
            goto L_0x003d
        L_0x002a:
            r4 = move-exception
            java.lang.String r1 = "FileSharingHelper/checkSameSignatureCaller. Error is : "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x003e
        L_0x003d:
            r7 = 1
        L_0x003e:
            X.0sK r0 = r8.A01
            r0.A0B()
            com.obwhatsapp.Me r1 = r0.A00
            r6 = 0
            if (r1 == 0) goto L_0x0059
            java.lang.String r0 = r1.cc
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L_0x0059
            java.lang.String r0 = r1.number
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L_0x0059
            r6 = 1
        L_0x0059:
            java.lang.String r0 = "com.obwhatsapp.w4b"
            boolean r1 = r0.equals(r2)
            java.lang.String r0 = "com.obwhatsapp"
            boolean r0 = r0.equals(r2)
            if (r1 != 0) goto L_0x006a
            r5 = 0
            if (r0 == 0) goto L_0x006b
        L_0x006a:
            r5 = 1
        L_0x006b:
            if (r2 == 0) goto L_0x007a
            long r3 = X.AnonymousClass01R.A00(r3, r2)
            if (r1 == 0) goto L_0x0088
            r1 = 597(0x255, double:2.95E-321)
        L_0x0075:
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            r2 = 1
            if (r0 >= 0) goto L_0x007b
        L_0x007a:
            r2 = 0
        L_0x007b:
            r0 = -1
            if (r11 == r0) goto L_0x0083
            r1 = 268435456(0x10000000, float:2.5243549E-29)
            r0 = 0
            if (r11 != r1) goto L_0x0084
        L_0x0083:
            r0 = 1
        L_0x0084:
            if (r7 != 0) goto L_0x008e
            r0 = 2
            return r0
        L_0x0088:
            if (r0 == 0) goto L_0x007a
            r1 = 452962(0x6e962, double:2.23793E-318)
            goto L_0x0075
        L_0x008e:
            if (r5 != 0) goto L_0x0092
            r0 = 3
            return r0
        L_0x0092:
            if (r2 != 0) goto L_0x0096
            r0 = 4
            return r0
        L_0x0096:
            if (r0 != 0) goto L_0x009a
            r0 = 5
            return r0
        L_0x009a:
            r0 = 0
            if (r6 != 0) goto L_0x0007
            r0 = 6
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.registration.directmigration.MigrationContentProvider.A02(java.lang.String, java.lang.String, int):int");
    }

    public final File A03(String str) {
        if (!TextUtils.isEmpty(str) && this.A06.A0B()) {
            File file = new File(this.A05.A04(), str);
            try {
                if (!this.A00.A0T(file) || !file.exists()) {
                    return null;
                }
                return file;
            } catch (IOException unused) {
            }
        }
        return null;
    }

    public final void A04(MatrixCursor matrixCursor, File file, int i2) {
        int length;
        if (i2 != 0) {
            File[] listFiles = file.listFiles();
            if (listFiles == null || (length = listFiles.length) == 0) {
                StringBuilder sb = new StringBuilder("MigrationContentProvider/fillMediaCursor/skipping folder ");
                sb.append(file);
                Log.i(sb.toString());
                return;
            }
            int i3 = 0;
            do {
                File file2 = listFiles[i3];
                if (file2.isDirectory()) {
                    A04(matrixCursor, file2, i2 - 1);
                } else {
                    matrixCursor.addRow(new String[]{file2.getAbsolutePath().replace(this.A05.A04().getAbsolutePath(), "")});
                }
                i3++;
            } while (i3 < length);
        }
    }

    public Bundle call(String str, String str2, Bundle bundle) {
        String str3;
        String str4;
        A00();
        if (bundle == null) {
            Log.e("MigrationContentProvider/call no params passed");
            str4 = "No params passed";
        } else {
            int A022 = A02(bundle.getString("query_param_country_code"), bundle.getString("query_param_phone_number"), -1);
            if (A022 != 0) {
                StringBuilder sb = new StringBuilder("MigrationContentProvider/call denied ");
                sb.append(A022);
                Log.w(sb.toString());
                StringBuilder sb2 = new StringBuilder("call denied (");
                sb2.append(A022);
                sb2.append(")");
                throw new SecurityException(sb2.toString());
            } else if (!"retrieve_rk".equals(str)) {
                StringBuilder sb3 = new StringBuilder("MigrationContentProvider/call failed/unsupported method ");
                sb3.append(str);
                Log.e(sb3.toString());
                StringBuilder sb4 = new StringBuilder("Unsupported method (");
                sb4.append(str);
                sb4.append(")");
                str4 = sb4.toString();
            } else {
                if (!this.A04.A03.A1f()) {
                    str3 = "MigrationContentProvider/retrieveRK/encryption disabled";
                } else {
                    byte[] byteArray = bundle.getByteArray("pk");
                    if (byteArray == null) {
                        Log.e("MigrationContentProvider/retrieveRK/no public key");
                        str4 = "No key provided";
                    } else {
                        byte[] A032 = this.A03.A03();
                        if (A032 == null) {
                            str3 = "MigrationContentProvider/retrieveRK/no root key";
                        } else {
                            try {
                                Bundle bundle2 = new Bundle(1);
                                bundle2.putByteArray("erk", C16940tv.A04(A032, byteArray));
                                C16950tw A002 = this.A03.A00();
                                if (this.A07.A1g() || A002 == null) {
                                    return bundle2;
                                }
                                bundle2.putByteArray("ph", C16940tv.A04(A002.A01, byteArray));
                                bundle2.putByteArray("ps", C16940tv.A04(A002.A02, byteArray));
                                bundle2.putInt("ic", A002.A00);
                                return bundle2;
                            } catch (InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e2) {
                                Log.w("MigrationContentProvider/call encryption failed", e2);
                                Bundle bundle3 = new Bundle();
                                bundle3.putString("error", "MigrationContentProvider/call encryption failed");
                                StringWriter stringWriter = new StringWriter();
                                e2.printStackTrace(new PrintWriter(stringWriter));
                                bundle3.putString("exception", stringWriter.toString());
                                return bundle3;
                            }
                        }
                    }
                }
                Log.e(str3);
                return null;
            }
        }
        Bundle bundle4 = new Bundle();
        bundle4.putString("error", str4);
        return bundle4;
    }

    public Bundle call(String str, String str2, String str3, Bundle bundle) {
        A00();
        if (!"com.obwhatsapp.provider.MigrationContentProvider".equals(str)) {
            return null;
        }
        return call(str2, str3, bundle);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0016, code lost:
        r0 = A03(r4.getQueryParameter("path"));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int delete(android.net.Uri r4, java.lang.String r5, java.lang.String[] r6) {
        /*
            r3 = this;
            r3.A00()
            r0 = -1
            int r0 = r3.A01(r4, r0)
            r2 = 0
            if (r0 != 0) goto L_0x0029
            android.content.UriMatcher r0 = A00()
            int r1 = r0.match(r4)
            r0 = 7
            if (r1 != r0) goto L_0x0029
            java.lang.String r0 = "path"
            java.lang.String r0 = r4.getQueryParameter(r0)
            java.io.File r0 = r3.A03(r0)
            if (r0 == 0) goto L_0x0029
            boolean r0 = r0.delete()
            if (r0 == 0) goto L_0x0029
            r2 = 1
        L_0x0029:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.registration.directmigration.MigrationContentProvider.delete(android.net.Uri, java.lang.String, java.lang.String[]):int");
    }

    public String getType(Uri uri) {
        A00();
        if (A01(uri, -1) == 0) {
            if (1 == A00().match(uri)) {
                try {
                    Log.i("MigrationContentProvider/getType");
                    File A0A2 = this.A09.A0A();
                    if (A0A2 != null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("MigrationContentProvider/getType/msgstore-file-name = ");
                        sb.append(A0A2.getName());
                        Log.i(sb.toString());
                        return A0A2.getName();
                    }
                } catch (Exception e2) {
                    Log.i("MigrationContentProvider/getType/exception = ", e2);
                    return null;
                }
            } else {
                StringBuilder sb2 = new StringBuilder("This operation is not supported ");
                sb2.append(uri);
                throw new UnsupportedOperationException(sb2.toString());
            }
        }
        return null;
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        A00();
        return null;
    }

    public ParcelFileDescriptor openFile(Uri uri, String str) {
        int i2;
        int i3;
        String obj;
        File A0A2;
        A00();
        if ("r".equals(str)) {
            i2 = 268435456;
        } else if ("w".equals(str) || "wt".equals(str)) {
            i2 = 738197504;
        } else if ("wa".equals(str)) {
            i2 = 704643072;
        } else if ("rw".equals(str)) {
            i2 = 939524096;
        } else if ("rwt".equals(str)) {
            i2 = 1006632960;
        } else {
            StringBuilder sb = new StringBuilder("Invalid mode: ");
            sb.append(str);
            throw new IllegalArgumentException(sb.toString());
        }
        int A012 = A01(uri, i2);
        if (A012 == 0) {
            StringBuilder sb2 = new StringBuilder("MigrationContentProvider/openFile/");
            sb2.append(uri.getPath());
            Log.i(sb2.toString());
            int match = A00().match(uri);
            if (match == 1) {
                C16250si r6 = this.A09;
                C16990u0 r3 = r6.A0e;
                boolean z2 = true;
                synchronized (r3) {
                    r3.A00 = true;
                }
                C16900tq r0 = r6.A0Q;
                r0.A04();
                if (r0.A06.exists()) {
                    Log.i("MessageStoreBackup/getFileForMigration/backup-db");
                    int A062 = r6.A06((C17000u1) null);
                    StringBuilder sb3 = new StringBuilder("MessageStoreBackup/finish-backup-db-successful? = ");
                    if (A062 != 0) {
                        z2 = false;
                    }
                    sb3.append(z2);
                    Log.i(sb3.toString());
                    if (A062 == 0) {
                        try {
                            A0A2 = r6.A0A();
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append("MessageStoreBackup/getFileForMigration/latest-backup-file");
                            sb4.append(A0A2);
                            Log.i(sb4.toString());
                        } catch (IOException e2) {
                            Log.e("MessageStoreBackup/getFileForMigration/exception = ", e2);
                            StringBuilder sb5 = new StringBuilder("MessageStoreBackup/failed-to-get-backup-file");
                            sb5.append(e2);
                            throw new FileNotFoundException(sb5.toString());
                        }
                    } else {
                        StringBuilder sb6 = new StringBuilder("MessageStoreBackup/getFileForMigration/backup-failed/backup-result = ");
                        sb6.append(A062);
                        sb6.append(" log = ");
                        synchronized (r3) {
                            obj = r3.A01.toString();
                        }
                        sb6.append(obj);
                        throw new FileNotFoundException(sb6.toString());
                    }
                } else {
                    throw new FileNotFoundException("14");
                }
            } else if (match == 2) {
                A0A2 = this.A0B.A07();
            } else if (match == 3) {
                C16220sf r32 = this.A0A;
                ReentrantReadWriteLock.WriteLock writeLock = r32.A01().A05.writeLock();
                AnonymousClass00B.A06(writeLock);
                writeLock.lock();
                try {
                    A0A2 = r32.A0G.A00.getDatabasePath("chatsettings.db");
                    if (A0A2.exists()) {
                        r32.A01().close();
                    } else {
                        A0A2 = null;
                    }
                } finally {
                    writeLock.unlock();
                }
            } else if (match == 4) {
                A0A2 = this.A0C.A00(C16960tx.A08);
            } else if (match == 7) {
                A0A2 = A03(uri.getQueryParameter("path"));
            } else {
                StringBuilder sb7 = new StringBuilder("Unknown URI ");
                sb7.append(uri);
                throw new IllegalArgumentException(sb7.toString());
            }
            if (A0A2 != null) {
                return ParcelFileDescriptor.open(A0A2, i2);
            }
            return null;
        }
        switch (A012) {
            case 1:
                i3 = 8;
                break;
            case 2:
                i3 = 9;
                break;
            case 3:
                i3 = 10;
                break;
            case 4:
                i3 = 11;
                break;
            case 5:
                i3 = 12;
                break;
            case 6:
                i3 = 13;
                break;
            default:
                i3 = 0;
                break;
        }
        throw new FileNotFoundException(String.valueOf(i3));
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        String str3;
        A00();
        int A012 = A01(uri, -1);
        if (A012 != 0) {
            StringBuilder sb = new StringBuilder("MigrationContentProvider/query denied ");
            sb.append(A012);
            Log.w(sb.toString());
            return null;
        }
        int match = A00().match(uri);
        if (match == 5) {
            MatrixCursor matrixCursor = new MatrixCursor(new String[]{"key", "value", "valueType"});
            for (AnonymousClass01Q r0 : A0E) {
                MatrixCursor.RowBuilder newRow = matrixCursor.newRow();
                Object obj = r0.A00;
                newRow.add(obj);
                Object obj2 = r0.A01;
                AnonymousClass00B.A06(obj2);
                int intValue = ((Number) obj2).intValue();
                AnonymousClass00B.A06(obj);
                String str4 = (String) obj;
                if (intValue != 0) {
                    if (intValue != 1) {
                        if (intValue != 2) {
                            if (intValue == 3) {
                                Set<String> stringSet = ((SharedPreferences) this.A07.A01.get()).getStringSet(str4, new HashSet());
                                AnonymousClass00B.A06(stringSet);
                                newRow.add(new JSONArray(stringSet).toString());
                            } else if (intValue != 1) {
                                if (intValue != 2) {
                                    if (intValue != 3) {
                                        throw new IllegalArgumentException("unexpected type");
                                    }
                                }
                            }
                            str3 = "string_set";
                        } else {
                            newRow.add("push_name".equals(str4) ? this.A08.A00.getString("push_name", "") : ((SharedPreferences) this.A07.A01.get()).getString(str4, ""));
                        }
                        str3 = "string";
                    } else {
                        newRow.add(Integer.valueOf(((SharedPreferences) this.A07.A01.get()).getBoolean(str4, false) ? 1 : 0));
                    }
                    str3 = "boolean";
                } else {
                    newRow.add(Integer.valueOf(((SharedPreferences) this.A07.A01.get()).getInt(str4, 0)));
                    str3 = "int";
                }
                newRow.add(str3);
            }
            return matrixCursor;
        } else if (match == 7) {
            File A042 = this.A05.A04();
            MatrixCursor matrixCursor2 = new MatrixCursor(new String[]{"path"});
            if (this.A06.A0B() && A042.exists()) {
                A04(matrixCursor2, A042, 4);
            }
            return matrixCursor2;
        } else {
            StringBuilder sb2 = new StringBuilder("Unknown URI ");
            sb2.append(uri);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        A00();
        return 0;
    }
}
