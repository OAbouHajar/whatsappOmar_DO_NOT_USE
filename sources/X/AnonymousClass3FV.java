package X;

/* renamed from: X.3FV  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3FV implements AnonymousClass2G3 {
    public final /* synthetic */ C46562Ew A00;

    public /* synthetic */ AnonymousClass3FV(C46562Ew r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00b9, code lost:
        if (r6 != null) goto L_0x00bb;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x00c6 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:23:0x00c6=Splitter:B:23:0x00c6, B:17:0x00bb=Splitter:B:17:0x00bb} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C34121jj Acb() {
        /*
            r12 = this;
            X.2Ew r2 = r12.A00
            java.lang.String r0 = "restore>PrepareMessageStoreTransferTask/restoring-via-direct-database-transfer"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.2Eu r0 = r2.A00
            X.0si r5 = r0.A01
            X.4F5 r1 = new X.4F5
            r1.<init>(r2)
            java.lang.String r0 = "MessageStoreBackup/restoreFromMigration"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.2Ew r0 = r1.A00
            X.0tU r7 = r0.A02
            boolean r0 = r7.isCancelled()
            java.lang.String r11 = "MessageStoreBackup/restoreFromMigration/canceled"
            if (r0 != 0) goto L_0x0142
            X.131 r0 = r5.A0R
            r0.A00()
            X.0ym r0 = r5.A0P
            X.0tq r0 = r0.A02
            r0.A04()
            r0.A05()
            X.12l r3 = r5.A0d
            java.lang.String r0 = "MigrateFileDirectlyHelper/migrateMsgStoreFile"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r2 = 0
            X.0tz r0 = r3.A01     // Catch:{ IOException | SecurityException -> 0x00c7 }
            android.content.Context r8 = r0.A00     // Catch:{ IOException | SecurityException -> 0x00c7 }
            android.content.ContentResolver r4 = r8.getContentResolver()     // Catch:{ IOException | SecurityException -> 0x00c7 }
            java.lang.String r9 = "msg_store"
            X.0rz r10 = r3.A02     // Catch:{ IOException | SecurityException -> 0x00c7 }
            java.lang.String r1 = r10.A0O()     // Catch:{ IOException | SecurityException -> 0x00c7 }
            java.lang.String r0 = r10.A0Q()     // Catch:{ IOException | SecurityException -> 0x00c7 }
            android.net.Uri r1 = X.C210112l.A00(r9, r1, r0)     // Catch:{ IOException | SecurityException -> 0x00c7 }
            java.lang.String r0 = "r"
            android.os.ParcelFileDescriptor r6 = r4.openFileDescriptor(r1, r0)     // Catch:{ IOException | SecurityException -> 0x00c7 }
            if (r6 == 0) goto L_0x00a9
            java.io.FileDescriptor r0 = r6.getFileDescriptor()     // Catch:{ all -> 0x00c0 }
            if (r0 == 0) goto L_0x00a9
            android.content.ContentResolver r4 = r8.getContentResolver()     // Catch:{ all -> 0x00c0 }
            java.lang.String r1 = r10.A0O()     // Catch:{ all -> 0x00c0 }
            java.lang.String r0 = r10.A0Q()     // Catch:{ all -> 0x00c0 }
            android.net.Uri r0 = X.C210112l.A00(r9, r1, r0)     // Catch:{ all -> 0x00c0 }
            java.lang.String r1 = r4.getType(r0)     // Catch:{ all -> 0x00c0 }
            java.io.File r0 = r8.getFilesDir()     // Catch:{ all -> 0x00c0 }
            java.io.File r4 = X.C13700nu.A0C(r0, r1)     // Catch:{ all -> 0x00c0 }
            boolean r0 = r4.exists()     // Catch:{ all -> 0x00c0 }
            if (r0 == 0) goto L_0x0097
            boolean r0 = r4.delete()     // Catch:{ all -> 0x00c0 }
            if (r0 != 0) goto L_0x0097
            java.lang.String r0 = "MigrateFileDirectlyHelper/migrateMsgStoreFile/failed-to-delete"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00c0 }
            r1 = 15
            X.3ph r0 = new X.3ph     // Catch:{ all -> 0x00c0 }
            r0.<init>(r1)     // Catch:{ all -> 0x00c0 }
            android.util.Pair r0 = X.C13690nt.A0I(r0, r2)     // Catch:{ all -> 0x00c0 }
            goto L_0x00bb
        L_0x0097:
            java.io.FileDescriptor r0 = r6.getFileDescriptor()     // Catch:{ all -> 0x00c0 }
            int r1 = r3.A02(r4, r0)     // Catch:{ all -> 0x00c0 }
            X.3ph r0 = new X.3ph     // Catch:{ all -> 0x00c0 }
            r0.<init>(r1)     // Catch:{ all -> 0x00c0 }
            android.util.Pair r0 = X.C13690nt.A0I(r0, r4)     // Catch:{ all -> 0x00c0 }
            goto L_0x00bb
        L_0x00a9:
            java.lang.String r0 = "MigrateFileDirectlyHelper/migrateMsgStoreFile/consumer file is null"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00c0 }
            r1 = 15
            X.3ph r0 = new X.3ph     // Catch:{ all -> 0x00c0 }
            r0.<init>(r1)     // Catch:{ all -> 0x00c0 }
            android.util.Pair r0 = X.C13690nt.A0I(r0, r2)     // Catch:{ all -> 0x00c0 }
            if (r6 == 0) goto L_0x0161
        L_0x00bb:
            r6.close()     // Catch:{ IOException | SecurityException -> 0x00c7 }
            goto L_0x0161
        L_0x00c0:
            r0 = move-exception
            if (r6 == 0) goto L_0x00c6
            r6.close()     // Catch:{ all -> 0x00c6 }
        L_0x00c6:
            throw r0     // Catch:{ IOException | SecurityException -> 0x00c7 }
        L_0x00c7:
            r0 = move-exception
            java.lang.String r4 = r0.toString()
            java.lang.String r6 = "MigrateFileDirectlyHelper/parseErrorCodeIfPossible/"
            java.lang.String r0 = ":\\s"
            java.lang.String[] r8 = r4.split(r0)     // Catch:{ NumberFormatException -> 0x0147 }
            int r1 = r8.length     // Catch:{ NumberFormatException -> 0x0147 }
            r0 = 2
            if (r1 != r0) goto L_0x014b
            r0 = 1
            r0 = r8[r0]     // Catch:{ NumberFormatException -> 0x0147 }
            int r8 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x0147 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()     // Catch:{ NumberFormatException -> 0x0147 }
            java.lang.String r0 = "MigrateFileDirectlyHelper/parseErrorCodeIfPossible/error while fetching msg store: error is = "
            r1.append(r0)     // Catch:{ NumberFormatException -> 0x0147 }
            switch(r8) {
                case 0: goto L_0x00f7;
                case 1: goto L_0x00fa;
                case 2: goto L_0x00fd;
                case 3: goto L_0x0100;
                case 4: goto L_0x0103;
                case 5: goto L_0x0106;
                case 6: goto L_0x0109;
                case 7: goto L_0x010c;
                case 8: goto L_0x010f;
                case 9: goto L_0x0112;
                case 10: goto L_0x0115;
                case 11: goto L_0x0118;
                case 12: goto L_0x011b;
                case 13: goto L_0x011e;
                case 14: goto L_0x0121;
                case 15: goto L_0x0124;
                case 16: goto L_0x0127;
                case 17: goto L_0x012a;
                case 18: goto L_0x012d;
                case 19: goto L_0x0130;
                case 20: goto L_0x0133;
                default: goto L_0x00eb;
            }     // Catch:{ NumberFormatException -> 0x0147 }
        L_0x00eb:
            java.lang.String r0 = "state is not recognized = "
            java.lang.String r0 = X.C13680ns.A0c(r8, r0)     // Catch:{ NumberFormatException -> 0x0147 }
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0T(r0)     // Catch:{ NumberFormatException -> 0x0147 }
            throw r0     // Catch:{ NumberFormatException -> 0x0147 }
        L_0x00f7:
            java.lang.String r0 = "FAILED"
            goto L_0x0135
        L_0x00fa:
            java.lang.String r0 = "SUCCESS_RESTORED"
            goto L_0x0135
        L_0x00fd:
            java.lang.String r0 = "SUCCESS_CREATED"
            goto L_0x0135
        L_0x0100:
            java.lang.String r0 = "FAILED_JID_MISMATCH"
            goto L_0x0135
        L_0x0103:
            java.lang.String r0 = "FAILED_FILE_INTEGRITY_CHECK"
            goto L_0x0135
        L_0x0106:
            java.lang.String r0 = "FAILED_OUT_OF_SPACE"
            goto L_0x0135
        L_0x0109:
            java.lang.String r0 = "FAILED_MSG_STORE_ALREADY_EXISTS"
            goto L_0x0135
        L_0x010c:
            java.lang.String r0 = "FAILED_CANCELED"
            goto L_0x0135
        L_0x010f:
            java.lang.String r0 = "PROVIDER_SERVER_PROP_NOT_ENABLED"
            goto L_0x0135
        L_0x0112:
            java.lang.String r0 = "APP_SIGNATURE_MISMATCH"
            goto L_0x0135
        L_0x0115:
            java.lang.String r0 = "INCORRECT_CALLER_PACKAGE_NAME"
            goto L_0x0135
        L_0x0118:
            java.lang.String r0 = "REQUESTER_APP_VERSION_INCORRECT"
            goto L_0x0135
        L_0x011b:
            java.lang.String r0 = "INCORRECT_FILE_MODE"
            goto L_0x0135
        L_0x011e:
            java.lang.String r0 = "PHONE_NUMBER_MISMATCH"
            goto L_0x0135
        L_0x0121:
            java.lang.String r0 = "MSG_DB_DOES_NOT_EXIST"
            goto L_0x0135
        L_0x0124:
            java.lang.String r0 = "FAILED_TO_GET_BACKUP_FILE"
            goto L_0x0135
        L_0x0127:
            java.lang.String r0 = "BACKUP_FAILED_GENERIC"
            goto L_0x0135
        L_0x012a:
            java.lang.String r0 = "BACKUP_FAILED_OUT_OF_SPACE"
            goto L_0x0135
        L_0x012d:
            java.lang.String r0 = "BACKUP_FAILED_INVALID"
            goto L_0x0135
        L_0x0130:
            java.lang.String r0 = "SUCCESS_TRANSFER_DB_FILE"
            goto L_0x0135
        L_0x0133:
            java.lang.String r0 = "FAILED_DECRYPTION_KEY_MISSING"
        L_0x0135:
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)     // Catch:{ NumberFormatException -> 0x0147 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ NumberFormatException -> 0x0147 }
            X.3ph r1 = new X.3ph     // Catch:{ NumberFormatException -> 0x0147 }
            r1.<init>(r8)     // Catch:{ NumberFormatException -> 0x0147 }
            goto L_0x015d
        L_0x0142:
            com.whatsapp.util.Log.i((java.lang.String) r11)
            r0 = 7
            goto L_0x01a5
        L_0x0147:
            r0 = move-exception
            com.whatsapp.util.Log.e(r6, r0)
        L_0x014b:
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0q(r6)
            java.lang.String r0 = X.AnonymousClass000.A0h(r4, r0)
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r0 = 15
            X.3ph r1 = new X.3ph
            r1.<init>(r0)
        L_0x015d:
            android.util.Pair r0 = X.C13690nt.A0I(r1, r2)
        L_0x0161:
            java.lang.Object r2 = r0.first
            X.1jj r2 = (X.C34121jj) r2
            java.lang.Object r6 = r0.second
            java.io.File r6 = (java.io.File) r6
            boolean r0 = r7.isCancelled()
            if (r0 != 0) goto L_0x0142
            r1 = 19
            int r0 = r2.A00
            if (r1 != r0) goto L_0x01aa
            if (r6 == 0) goto L_0x01aa
            java.lang.String r0 = "MessageStoreBackup/restoreFromMigration/received-file-decrypting"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r0 = r6.getName()
            X.0tx r1 = X.C40721ua.A00(r0)
            X.0tx r0 = X.C16960tx.A07
            if (r1 != r0) goto L_0x01ab
            boolean r0 = r3.A04()
        L_0x018c:
            if (r0 == 0) goto L_0x01d9
            boolean r0 = r7.isCancelled()
            if (r0 != 0) goto L_0x0142
            java.lang.String r0 = "MessageStoreBackup/restoreFromMigration/restore-db-from-backup-now"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.util.List r2 = java.util.Collections.singletonList(r6)
            r1 = 1
            r0 = 0
            X.1jj r0 = r5.A08(r0, r2, r1)
            int r0 = r0.A00
        L_0x01a5:
            X.3ph r2 = new X.3ph
            r2.<init>(r0)
        L_0x01aa:
            return r2
        L_0x01ab:
            X.0xG r4 = r5.A0I
            X.1kE r3 = new X.1kE
            r3.<init>()
            java.util.List r2 = java.util.Collections.singletonList(r6)
            r1 = 3
            com.facebook.redex.RunnableRunnableShape6S0200000_I0_4 r0 = new com.facebook.redex.RunnableRunnableShape6S0200000_I0_4
            r0.<init>(r4, r1, r3)
            r4.A00(r0, r2)
            java.lang.String r0 = "MessageStoreBackup/restoreFromMigration/try to get cipher key"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x01d3 }
            r5.A00 = r1     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x01d3 }
            r1 = 32000(0x7d00, double:1.581E-319)
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x01d3 }
            java.lang.Object r0 = r3.get(r1, r0)     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x01d3 }
            boolean r0 = X.AnonymousClass000.A1X(r0)     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x01d3 }
            goto L_0x018c
        L_0x01d3:
            r1 = move-exception
            java.lang.String r0 = "MessageStoreBackup/restoreFromMigration/exception"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x01d9:
            r0 = 20
            goto L_0x01a5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3FV.Acb():X.1jj");
    }
}
