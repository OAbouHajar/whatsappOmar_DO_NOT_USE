package com.obwhatsapp.instrumentation.api;

import X.C15870s2;
import X.C15880s3;
import X.C15890s4;
import X.C15910s6;
import X.C15940sA;
import X.C15960sC;
import X.C15970sD;
import X.C15980sE;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.text.TextUtils;

public class InstrumentationProvider extends C15870s2 {
    public C15890s4 A00;
    public C15980sE A01;
    public C15970sD A02;
    public C15940sA A03;
    public C15960sC A04;

    public final C15880s3 A01(Uri uri) {
        A00();
        if (this.A00.A00.A05(C15910s6.A11)) {
            C15880s3 A002 = this.A03.A00();
            A002.A00();
            if (this.A04.A01()) {
                synchronized (this.A00) {
                }
                if (Binder.getCallingUid() != Process.myUid()) {
                    C15970sD r3 = this.A02;
                    String string = r3.A01().getString(C15970sD.A00(A002.A01, "auth/token"), (String) null);
                    String queryParameter = uri.getQueryParameter("authorization_token");
                    if (!TextUtils.isEmpty(string) && string.equals(queryParameter)) {
                        return A002;
                    }
                    throw new SecurityException("Access denied: auth token is missing");
                }
                throw new SecurityException("Access checks is executed outside of binder context.");
            }
            throw new SecurityException("OBWhatsApp is not active.");
        }
        throw new SecurityException("Feature is disabled.");
    }

    public int bulkInsert(Uri uri, ContentValues[] contentValuesArr) {
        A01(uri);
        throw new UnsupportedOperationException();
    }

    public int delete(Uri uri, Bundle bundle) {
        A01(uri);
        throw new UnsupportedOperationException();
    }

    public int delete(Uri uri, String str, String[] strArr) {
        A01(uri);
        throw new UnsupportedOperationException();
    }

    public String getType(Uri uri) {
        return null;
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        A01(uri);
        throw new UnsupportedOperationException();
    }

    public Uri insert(Uri uri, ContentValues contentValues, Bundle bundle) {
        A01(uri);
        throw new UnsupportedOperationException();
    }

    public ParcelFileDescriptor openFile(Uri uri, String str) {
        A01(uri);
        throw new UnsupportedOperationException();
    }

    public ParcelFileDescriptor openFile(Uri uri, String str, CancellationSignal cancellationSignal) {
        A01(uri);
        throw new UnsupportedOperationException();
    }

    public Cursor query(Uri uri, String[] strArr, Bundle bundle, CancellationSignal cancellationSignal) {
        A01(uri);
        return super.query(uri, strArr, bundle, cancellationSignal);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0062, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0067, code lost:
        if (r6.getMessage() == null) goto L_0x0137;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0075, code lost:
        r2 = new java.lang.StringBuilder();
        r2.append("contactmanagerdb/getAllDBContacts/illegal-state-exception/cursor count=");
        r2.append(r7);
        r2.append("; partial list size=");
        r2.append(r3.size());
        X.AnonymousClass00B.A09(r2.toString(), r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:?, code lost:
        throw r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0138, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0139, code lost:
        if (r8 != null) goto L_0x013b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:10:0x004c, B:13:0x0054] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:64:0x013e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:69:0x0143 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:24:0x0095=Splitter:B:24:0x0095, B:64:0x013e=Splitter:B:64:0x013e} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.database.Cursor query(android.net.Uri r26, java.lang.String[] r27, java.lang.String r28, java.lang.String[] r29, java.lang.String r30) {
        /*
            r25 = this;
            r0 = r25
            r3 = r26
            X.0s3 r17 = r0.A01(r3)
            X.0sE r2 = r0.A01
            android.content.UriMatcher r0 = r2.A00
            int r1 = r0.match(r3)
            r0 = 1
            if (r1 != r0) goto L_0x0149
            X.01D r0 = r2.A01
            java.lang.Object r1 = r0.get()
            X.0sF r1 = (X.C15990sF) r1
            long r9 = android.os.Binder.clearCallingIdentity()
            X.0sG r0 = r1.A01     // Catch:{ all -> 0x0144 }
            X.18c r5 = r0.A06     // Catch:{ all -> 0x0144 }
            r0 = 1
            X.1Zf r4 = new X.1Zf     // Catch:{ all -> 0x0144 }
            r4.<init>((boolean) r0)     // Catch:{ all -> 0x0144 }
            r4.A03()     // Catch:{ all -> 0x0144 }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x0144 }
            r3.<init>()     // Catch:{ all -> 0x0144 }
            X.11X r0 = r5.A00     // Catch:{ all -> 0x0144 }
            X.0tf r18 = r0.get()     // Catch:{ all -> 0x0144 }
            java.lang.String r19 = "wa_contacts LEFT JOIN wa_vnames ON (wa_contacts.jid = wa_vnames.jid) LEFT JOIN wa_group_descriptions ON (wa_contacts.jid = wa_group_descriptions.jid) LEFT JOIN wa_group_admin_settings ON (wa_contacts.jid = wa_group_admin_settings.jid)"
            java.lang.String[] r23 = X.C224818c.A08     // Catch:{ all -> 0x013f }
            r20 = 0
            java.lang.String r22 = "CONTACTS"
            r24 = r20
            r21 = r20
            android.database.Cursor r8 = X.AnonymousClass15L.A03(r18, r19, r20, r21, r22, r23, r24)     // Catch:{ all -> 0x013f }
            if (r8 != 0) goto L_0x0050
            java.lang.String r0 = "contact-mgr-db/unable to get all db contacts"
            X.AnonymousClass00B.A08(r0)     // Catch:{ all -> 0x0138 }
            goto L_0x00a5
        L_0x0050:
            int r7 = r8.getCount()     // Catch:{ all -> 0x0138 }
        L_0x0054:
            boolean r0 = r8.moveToNext()     // Catch:{ IllegalStateException -> 0x0062 }
            if (r0 == 0) goto L_0x0095
            X.0sH r0 = X.C34761kp.A00(r8)     // Catch:{ IllegalStateException -> 0x0062 }
            r3.add(r0)     // Catch:{ IllegalStateException -> 0x0062 }
            goto L_0x0054
        L_0x0062:
            r6 = move-exception
            java.lang.String r0 = r6.getMessage()     // Catch:{ all -> 0x0138 }
            if (r0 == 0) goto L_0x0137
            java.lang.String r2 = r6.getMessage()     // Catch:{ all -> 0x0138 }
            java.lang.String r0 = "Make sure the Cursor is initialized correctly before accessing data from it"
            boolean r0 = r2.contains(r0)     // Catch:{ all -> 0x0138 }
            if (r0 == 0) goto L_0x0137
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0138 }
            r2.<init>()     // Catch:{ all -> 0x0138 }
            java.lang.String r0 = "contactmanagerdb/getAllDBContacts/illegal-state-exception/cursor count="
            r2.append(r0)     // Catch:{ all -> 0x0138 }
            r2.append(r7)     // Catch:{ all -> 0x0138 }
            java.lang.String r0 = "; partial list size="
            r2.append(r0)     // Catch:{ all -> 0x0138 }
            int r0 = r3.size()     // Catch:{ all -> 0x0138 }
            r2.append(r0)     // Catch:{ all -> 0x0138 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0138 }
            X.AnonymousClass00B.A09(r0, r6)     // Catch:{ all -> 0x0138 }
        L_0x0095:
            r8.close()     // Catch:{ all -> 0x013f }
            r18.close()     // Catch:{ all -> 0x0144 }
            r5.A0P(r3)     // Catch:{ all -> 0x0144 }
            r3.size()     // Catch:{ all -> 0x0144 }
            r4.A00()     // Catch:{ all -> 0x0144 }
            goto L_0x00a8
        L_0x00a5:
            r18.close()     // Catch:{ all -> 0x0144 }
        L_0x00a8:
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x0144 }
            r2.<init>()     // Catch:{ all -> 0x0144 }
            java.util.Iterator r7 = r3.iterator()     // Catch:{ all -> 0x0144 }
        L_0x00b1:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x0144 }
            if (r0 == 0) goto L_0x011e
            java.lang.Object r4 = r7.next()     // Catch:{ all -> 0x0144 }
            X.0sH r4 = (X.C16010sH) r4     // Catch:{ all -> 0x0144 }
            java.lang.Class<X.0rv> r6 = X.C15830rv.class
            com.whatsapp.jid.Jid r3 = r4.A08(r6)     // Catch:{ all -> 0x0144 }
            X.0rv r3 = (X.C15830rv) r3     // Catch:{ all -> 0x0144 }
            r5 = 0
            if (r3 == 0) goto L_0x00b1
            X.0sI r0 = r1.A08     // Catch:{ all -> 0x0144 }
            boolean r0 = r0.A01(r3)     // Catch:{ all -> 0x0144 }
            if (r0 == 0) goto L_0x00b1
            com.whatsapp.jid.Jid r0 = r4.A08(r6)     // Catch:{ all -> 0x0144 }
            if (r0 == 0) goto L_0x00b1
            boolean r0 = r4.A0i     // Catch:{ all -> 0x0144 }
            if (r0 == 0) goto L_0x00b1
            X.0rv r0 = r4.A0E     // Catch:{ all -> 0x0144 }
            boolean r0 = X.C16030sJ.A0G(r0)     // Catch:{ all -> 0x0144 }
            if (r0 != 0) goto L_0x00b1
            X.0sK r3 = r1.A00     // Catch:{ all -> 0x0144 }
            X.0rv r0 = r4.A0E     // Catch:{ all -> 0x0144 }
            boolean r0 = r3.A0I(r0)     // Catch:{ all -> 0x0144 }
            if (r0 != 0) goto L_0x00b1
            X.0rv r0 = r4.A0E     // Catch:{ all -> 0x0144 }
            boolean r0 = X.C16030sJ.A0F(r0)     // Catch:{ all -> 0x0144 }
            if (r0 == 0) goto L_0x00b1
            boolean r0 = r4.A0J()     // Catch:{ all -> 0x0144 }
            if (r0 == 0) goto L_0x010c
            X.0rv r3 = r4.A0E     // Catch:{ all -> 0x0144 }
            boolean r0 = r3 instanceof X.C16050sL     // Catch:{ all -> 0x0144 }
            if (r0 == 0) goto L_0x010c
            com.whatsapp.jid.GroupJid r3 = (com.whatsapp.jid.GroupJid) r3     // Catch:{ all -> 0x0144 }
            X.0sO r0 = r1.A03     // Catch:{ all -> 0x0144 }
            boolean r0 = r0.A09(r3)     // Catch:{ all -> 0x0144 }
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x00b1
        L_0x010c:
            X.0sP r0 = r1.A02     // Catch:{ all -> 0x0144 }
            X.0sQ r0 = r0.A07(r4, r5)     // Catch:{ all -> 0x0144 }
            java.lang.String r0 = r0.A01     // Catch:{ all -> 0x0144 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0144 }
            if (r0 != 0) goto L_0x00b1
            r2.add(r4)     // Catch:{ all -> 0x0144 }
            goto L_0x00b1
        L_0x011e:
            X.0sP r12 = r1.A02     // Catch:{ all -> 0x0144 }
            X.0sR r0 = r1.A07     // Catch:{ all -> 0x0144 }
            X.0sS r13 = r1.A04     // Catch:{ all -> 0x0144 }
            X.0sT r15 = r1.A06     // Catch:{ all -> 0x0144 }
            X.0sU r14 = r1.A05     // Catch:{ all -> 0x0144 }
            X.0sV r11 = new X.0sV     // Catch:{ all -> 0x0144 }
            r19 = r27
            r16 = r0
            r18 = r2
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19)     // Catch:{ all -> 0x0144 }
            android.os.Binder.restoreCallingIdentity(r9)
            return r11
        L_0x0137:
            throw r6     // Catch:{ all -> 0x0138 }
        L_0x0138:
            r0 = move-exception
            if (r8 == 0) goto L_0x013e
            r8.close()     // Catch:{ all -> 0x013e }
        L_0x013e:
            throw r0     // Catch:{ all -> 0x013f }
        L_0x013f:
            r0 = move-exception
            r18.close()     // Catch:{ all -> 0x0143 }
        L_0x0143:
            throw r0     // Catch:{ all -> 0x0144 }
        L_0x0144:
            r0 = move-exception
            android.os.Binder.restoreCallingIdentity(r9)
            throw r0
        L_0x0149:
            java.lang.String r1 = "Access denied to "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r1 = r0.toString()
            java.lang.SecurityException r0 = new java.lang.SecurityException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.instrumentation.api.InstrumentationProvider.query(android.net.Uri, java.lang.String[], java.lang.String, java.lang.String[], java.lang.String):android.database.Cursor");
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) {
        A01(uri);
        return super.query(uri, strArr, str, strArr2, str2, cancellationSignal);
    }

    public int update(Uri uri, ContentValues contentValues, Bundle bundle) {
        A01(uri);
        throw new UnsupportedOperationException();
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        A01(uri);
        throw new UnsupportedOperationException();
    }
}
