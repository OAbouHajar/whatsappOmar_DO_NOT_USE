package com.obwhatsapp.migration.export.api;

import X.AnonymousClass4R0;
import X.C14710pd;
import X.C15870s2;
import X.C15880s3;
import X.C16300so;
import X.C16310sp;
import X.C16380sw;
import X.C16390sx;
import X.C16400sy;
import X.C16620tM;
import X.C16800tf;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import com.whatsapp.util.Log;
import java.io.FileNotFoundException;

public class ExportMigrationContentProvider extends C15870s2 {
    public UriMatcher A00;
    public C16300so A01;
    public C14710pd A02;
    public C16380sw A03;
    public C16400sy A04;
    public C16310sp A05;
    public C16390sx A06;

    public synchronized void A01() {
        SecurityException securityException;
        A00();
        try {
            if (!this.A02.A0E(C16620tM.A02, 843)) {
                securityException = new SecurityException("Provider access is disabled.");
            } else if (this.A04.A05()) {
                this.A05.A00().A00();
                C16390sx r2 = this.A06;
                C15880s3 A002 = r2.A01.A00();
                if (!A002.A03) {
                    A002.A00();
                }
                AnonymousClass4R0 r0 = r2.A02;
                String str = A002.A01;
                if (!r0.A00(str)) {
                    StringBuilder sb = new StringBuilder("Caller ");
                    sb.append(str);
                    sb.append(" does not have a correctly declared permission ");
                    sb.append("com.apple.movetoios.ACCESS");
                    throw new SecurityException(sb.toString());
                }
            } else {
                securityException = new SecurityException("Provider component is disabled.");
            }
            throw securityException;
        } catch (SecurityException e2) {
            this.A01.A03("xpm-export-provider-security", e2.toString(), e2);
            throw e2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0080, code lost:
        if ("FAILURE".equals(r7.getString("state")) == false) goto L_0x0082;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.os.Bundle call(java.lang.String r5, java.lang.String r6, android.os.Bundle r7) {
        /*
            r4 = this;
            r4.A00()
            r4.A01()
            if (r5 == 0) goto L_0x00be
            X.0sy r0 = r4.A04
            r0.A04()
            java.lang.String r2 = "ExportMigrationContentProvider/call/"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r2)
            r1.append(r5)
            java.lang.String r0 = " Arg: "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = " Bundle: "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            int r0 = r5.hashCode()
            r3 = 0
            switch(r0) {
                case 94756344: goto L_0x005b;
                case 1139677387: goto L_0x00a4;
                case 1976339394: goto L_0x00b1;
                default: goto L_0x0036;
            }
        L_0x0036:
            X.0so r1 = r4.A01
            java.lang.String r0 = "xpm-export-provider-unsupported-method"
            r1.AcB(r0, r5, r3)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            r1.append(r5)
            java.lang.String r0 = " not found"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>(r5)
            throw r0
        L_0x005b:
            java.lang.String r0 = "close"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0036
            java.lang.String r0 = "ExportMigrationContentProvider/close() is called"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0sw r2 = r4.A03
            if (r7 == 0) goto L_0x0082
            java.lang.String r1 = "state"
            boolean r0 = r7.containsKey(r1)
            if (r0 == 0) goto L_0x0082
            java.lang.String r1 = r7.getString(r1)
            java.lang.String r0 = "FAILURE"
            boolean r1 = r0.equals(r1)
            r0 = 0
            if (r1 != 0) goto L_0x0083
        L_0x0082:
            r0 = 1
        L_0x0083:
            X.0sr r1 = r2.A02
            if (r0 == 0) goto L_0x0090
            r1.A03()
        L_0x008a:
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            return r0
        L_0x0090:
            X.0sy r0 = r1.A0A
            r0.A02()
            X.0so r2 = r1.A02
            java.lang.String r1 = "xpm-export-disabled-provider-with-failure"
            r0 = 0
            r2.AcB(r1, r0, r3)
            java.lang.String r0 = "ExportFlowManager/disableExportProviderAndClearMigrationFlags/complete/failure"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x008a
        L_0x00a4:
            java.lang.String r0 = "get_label"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0036
            android.os.Bundle r0 = X.C16380sw.A01()
            return r0
        L_0x00b1:
            java.lang.String r0 = "get_icon"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0036
            android.os.Bundle r0 = X.C16380sw.A00()
            return r0
        L_0x00be:
            java.lang.String r1 = "method is null"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.migration.export.api.ExportMigrationContentProvider.call(java.lang.String, java.lang.String, android.os.Bundle):android.os.Bundle");
    }

    public int delete(Uri uri, String str, String[] strArr) {
        A00();
        A01();
        this.A01.AcB("xpm-export-provider-delete-unsupported", uri.getPath(), false);
        throw new UnsupportedOperationException();
    }

    public String getType(Uri uri) {
        return null;
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        A00();
        A01();
        this.A01.AcB("xpm-export-provider-insert-unsupported", uri.getPath(), false);
        throw new UnsupportedOperationException();
    }

    public ParcelFileDescriptor openFile(Uri uri, String str) {
        return openFile(uri, str, new CancellationSignal());
    }

    public ParcelFileDescriptor openFile(Uri uri, String str, CancellationSignal cancellationSignal) {
        A01();
        try {
            this.A04.A04();
            StringBuilder sb = new StringBuilder();
            sb.append("ExportMigrationContentProvider/openFile/uriPath=");
            sb.append(uri.getPath());
            Log.i(sb.toString());
            if (this.A00.match(uri) == 2) {
                return this.A03.A03(cancellationSignal, Long.parseLong(uri.getPathSegments().get(1)));
            }
            throw new FileNotFoundException(uri.toString());
        } catch (FileNotFoundException e2) {
            if (e2.getMessage() == null || e2.getMessage().isEmpty()) {
                C16300so r2 = this.A01;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(uri);
                sb2.append("; FileNotFoundException without message");
                r2.A03("xpm-export-provider-file-not-found-other", sb2.toString(), e2);
                StringBuilder sb3 = new StringBuilder("File not found without reason: ");
                sb3.append(uri);
                throw new FileNotFoundException(sb3.toString());
            }
            C16300so r22 = this.A01;
            StringBuilder sb4 = new StringBuilder();
            sb4.append(uri);
            sb4.append(";");
            sb4.append(e2.getMessage());
            r22.A03("xpm-export-provider-file-not-found", sb4.toString(), e2);
            throw e2;
        } catch (Exception e3) {
            C16300so r23 = this.A01;
            StringBuilder sb5 = new StringBuilder();
            sb5.append(uri);
            sb5.append(";");
            sb5.append(e3.getMessage());
            r23.A03("xpm-export-provider-open-file", sb5.toString(), e3);
            StringBuilder sb6 = new StringBuilder("Unexplained error opening ");
            sb6.append(uri);
            sb6.append(";");
            sb6.append(e3);
            throw new FileNotFoundException(sb6.toString());
        }
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        Throwable th;
        C16800tf r7;
        Cursor cursor;
        A00();
        A01();
        this.A04.A04();
        int match = this.A00.match(uri);
        if (match == 1) {
            StringBuilder sb = new StringBuilder("ExportMigrationContentProvider/query/supported-request ");
            sb.append(uri);
            Log.i(sb.toString());
            String queryParameter = uri.getQueryParameter("offset");
            String queryParameter2 = uri.getQueryParameter("limit");
            if (queryParameter == null || queryParameter2 == null) {
                C16800tf A002 = this.A03.A03.A01.A00.A00();
                try {
                    Cursor A08 = A002.A02.A08("SELECT   f._id AS _id,  ('xpm-import/' || f.exported_path)  AS path, f.file_size AS original_size, f.required AS required, 0 AS include_in_backups FROM exported_files_metadata AS f ORDER BY   f.required DESC , f.file_size DESC , f._id ASC ", (String[]) null);
                    A002.close();
                    return A08;
                } catch (Throwable unused) {
                }
            } else {
                long parseLong = Long.parseLong(queryParameter);
                long parseLong2 = Long.parseLong(queryParameter2);
                r7 = this.A03.A03.A01.A00.A00();
                try {
                    cursor = r7.A02.A08("SELECT   f._id AS _id,  ('xpm-import/' ||  f.exported_path)  AS path, f.file_size AS original_size, f.required AS required, 0 AS include_in_backups FROM exported_files_metadata AS f ORDER BY   f.required DESC , f.file_size DESC , f._id ASC  LIMIT ?, ?", new String[]{Long.toString(parseLong), Long.toString(parseLong2)});
                } catch (Throwable th2) {
                    th = th2;
                    r7.close();
                    throw th;
                }
            }
        } else if (match == 2) {
            StringBuilder sb2 = new StringBuilder("ExportMigrationContentProvider/query/ignored-request ");
            sb2.append(uri);
            Log.i(sb2.toString());
            long parseLong3 = Long.parseLong(uri.getPathSegments().get(1));
            r7 = this.A03.A03.A01.A00.A00();
            cursor = r7.A02.A08("SELECT   f._id AS _id,  ('xpm-import/' || f.exported_path)  AS path, f.file_size AS original_size, f.required AS required, 0 AS include_in_backups FROM exported_files_metadata AS f WHERE f._id = ?", new String[]{Long.toString(parseLong3)});
        } else {
            StringBuilder sb3 = new StringBuilder("ExportMigrationContentProvider/query/unsupported-request ");
            sb3.append(uri);
            Log.e(sb3.toString());
            StringBuilder sb4 = new StringBuilder("Unsupported URI: ");
            sb4.append(uri);
            throw new IllegalArgumentException(sb4.toString());
        }
        r7.close();
        return cursor;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        A00();
        A01();
        this.A01.AcB("xpm-export-provider-update-unsupported", uri.getPath(), false);
        throw new UnsupportedOperationException();
    }
}
