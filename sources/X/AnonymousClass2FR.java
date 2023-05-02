package X;

import android.app.backup.BackupManager;
import android.content.Context;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.concurrent.Executor;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.2FR  reason: invalid class name */
public class AnonymousClass2FR {
    public static final Object A00 = new Object();
    public static final byte[] A01 = {0, 2};

    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x001b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass197 A00(byte[] r3) {
        /*
            r2 = 5
            if (r3 == 0) goto L_0x0022
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream
            r0.<init>(r3)
            java.io.ObjectInputStream r1 = new java.io.ObjectInputStream     // Catch:{ IOException | ClassNotFoundException -> 0x001c }
            r1.<init>(r0)     // Catch:{ IOException | ClassNotFoundException -> 0x001c }
            java.lang.Object r0 = r1.readObject()     // Catch:{ all -> 0x0017 }
            X.197 r0 = (X.AnonymousClass197) r0     // Catch:{ all -> 0x0017 }
            r1.close()     // Catch:{ IOException | ClassNotFoundException -> 0x001c }
            return r0
        L_0x0017:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x001b }
        L_0x001b:
            throw r0     // Catch:{ IOException | ClassNotFoundException -> 0x001c }
        L_0x001c:
            r1 = move-exception
            java.lang.String r0 = "BackupTokenUtils/convertByteArrayToLRUCache/failed with exception:"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0022:
            X.197 r0 = new X.197
            r0.<init>(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2FR.A00(byte[]):X.197");
    }

    public static void A01(Context context, C16440t3 r11, C15860rz r12, AnonymousClass10J r13, C14710pd r14, String str, byte[] bArr) {
        byte[] bArr2;
        StringBuilder sb = new StringBuilder();
        sb.append(AnonymousClass021.A0N);
        sb.append(str.substring(Math.max(str.length() - 4, 0)));
        String obj = sb.toString();
        byte[] bArr3 = A01;
        try {
            byte[] A0E = C004101u.A0E(4);
            byte[] A0E2 = C004101u.A0E(16);
            SecretKeySpec secretKeySpec = new SecretKeySpec(new SecretKeySpec(C004101u.A07(obj.getBytes(), A0E, 16, 128).getEncoded(), "AES").getEncoded(), "AES/OFB/NoPadding");
            Cipher instance = Cipher.getInstance("AES/OFB/NoPadding");
            instance.init(1, secretKeySpec, new IvParameterSpec(A0E2));
            byte[] doFinal = instance.doFinal(bArr);
            bArr2 = new byte[(bArr3.length + A0E.length + A0E2.length + doFinal.length)];
            byte[][] bArr4 = {bArr3, A0E, A0E2, doFinal};
            int i2 = 0;
            int i3 = 0;
            while (true) {
                byte[] bArr5 = bArr4[i2];
                System.arraycopy(bArr5, 0, bArr2, i3, bArr5.length);
                i3 += bArr5.length;
                i2++;
                if (i2 >= 4) {
                    break;
                }
            }
        } catch (Exception e2) {
            Log.e("BackupTokenUtils/encrypt/unable to encrypt", e2);
            bArr2 = null;
        }
        if (A05(r13, r14)) {
            Log.i("BackupTokenUtils/encryptAndSaveToken/killswitch on, save token to LRUCache");
            AnonymousClass197 A002 = A00(A06(context));
            String A03 = C004101u.A03(str);
            if (!(TextUtils.isEmpty(A03) || bArr2 == null || bArr2.length == 0)) {
                A002.put(A03, bArr2);
            }
            StringBuilder sb2 = new StringBuilder("BackupTokenUtils/encryptAndSaveToken/updated LRUCache size is ");
            sb2.append(A002.size());
            Log.i(sb2.toString());
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(A002);
            objectOutputStream.flush();
            bArr2 = byteArrayOutputStream.toByteArray();
        } else {
            Log.i("BackupTokenUtils/encryptAndSaveToken/killswitch off");
        }
        if (!(bArr2 == null || bArr2.length == 0)) {
            A03(context, bArr2);
        }
        r12.A14("backup_token_file_timestamp", r11.A00());
    }

    public static void A02(Context context, C15860rz r6, AnonymousClass10J r7, C14710pd r8, String str) {
        if (A05(r7, r8)) {
            AnonymousClass197 A002 = A00(A06(context));
            String A03 = C004101u.A03(str);
            if (!TextUtils.isEmpty(A03)) {
                A002.remove(A03);
            }
            StringBuilder sb = new StringBuilder("BackupTokenUtils/deleteBackupToken/updated LRUCache size is ");
            sb.append(A002.size());
            Log.i(sb.toString());
            if (A002.size() == 0) {
                synchronized (A00) {
                    new File(context.getFilesDir(), "backup_token").delete();
                }
                r6.A0K().remove("backup_token_file_timestamp").apply();
            }
            byte[] bArr = null;
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                objectOutputStream.writeObject(A002);
                objectOutputStream.flush();
                bArr = byteArrayOutputStream.toByteArray();
            } catch (IOException e2) {
                Log.e("BackupTokenUtils/deleteBackupToken/write token byte array failed/IOException:", e2);
            }
            A03(context, bArr);
        } else {
            synchronized (A00) {
                new File(context.getFilesDir(), "backup_token").delete();
            }
            r6.A0K().remove("backup_token_file_timestamp").apply();
            if (C15450qv.A03()) {
                A04(context, new byte[0]);
            } else {
                new BackupManager(context).dataChanged();
            }
        }
        r6.A0K().remove("backup_token_source").apply();
    }

    public static void A03(Context context, byte[] bArr) {
        Log.i("BackupTokenUtils/saveEncryptedBackupToken");
        if (C15450qv.A03()) {
            Log.i("BackupTokenUtils/saveEncryptedBackupToken/update block store");
            A04(context, bArr);
        }
        synchronized (A00) {
            try {
                C004101u.A09(new File(context.getFilesDir(), "backup_token"), bArr);
                Log.i("BackupTokenUtils/saveEncryptedBackupToken/successfully write to backup_token file");
            } catch (IOException e2) {
                Log.e("BackupTokenUtils/saveEncryptedBackupToken/unable to write to backup_token file:", e2);
            }
        }
    }

    public static void A04(Context context, byte[] bArr) {
        AnonymousClass3WU r5 = new AnonymousClass3WU(context);
        AnonymousClass4GT r4 = new AnonymousClass4GT();
        C88714ay r3 = new C88714ay((AnonymousClass44J) null);
        r3.A03 = new AnonymousClass3Y2[]{AnonymousClass4BK.A04};
        r3.A01 = new C97934qp(r5);
        r3.A02 = false;
        r3.A00 = 1651;
        C14210on A012 = r5.A01(r3.A00(), 0);
        AnonymousClass3EQ r0 = new AnonymousClass3EQ(r5, r4, bArr);
        Executor executor = C14500pH.A00;
        A012.A06(r0, executor);
        A012.A05(new C98804t0(), executor);
    }

    public static boolean A05(AnonymousClass10J r3, C14710pd r4) {
        C16620tM r1 = C16620tM.A02;
        boolean A0E = r3.A0E(r1, 2559);
        boolean A0E2 = r4.A0E(r1, 2571);
        StringBuilder sb = new StringBuilder("BackupTokenUtils/shouldStoreMultipleTokens/preChatdKillSwitch=");
        sb.append(A0E);
        sb.append(", chatdKillSwitch=");
        sb.append(A0E2);
        Log.i(sb.toString());
        return A0E || A0E2;
    }

    public static byte[] A06(Context context) {
        byte[] A0H;
        File file = new File(context.getFilesDir(), "backup_token");
        if (!file.exists()) {
            Log.i("BackupTokenUtils/getBackupTokenFromLocalFile/no content found");
            return null;
        }
        synchronized (A00) {
            A0H = C004101u.A0H(file);
        }
        return A0H;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        if (r6.length == 0) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] A07(android.content.Context r13, X.C15860rz r14, X.AnonymousClass10J r15, X.C14710pd r16, java.lang.String r17) {
        /*
            java.lang.String r0 = "BackupTokenUtils/getTokenByPhoneNumber"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            byte[] r6 = A06(r13)
            if (r6 == 0) goto L_0x000f
            int r1 = r6.length
            r0 = 1
            if (r1 != 0) goto L_0x0010
        L_0x000f:
            r0 = 0
        L_0x0010:
            r13 = 0
            if (r0 != 0) goto L_0x0019
            java.lang.String r0 = "BackupTokenUtils/getTokenByPhoneNumber/no data read from backup_token file"
        L_0x0015:
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0018:
            return r13
        L_0x0019:
            r0 = r16
            boolean r0 = A05(r15, r0)
            r3 = r17
            if (r0 == 0) goto L_0x008b
            int r1 = r6.length
            r0 = 42
            if (r1 > r0) goto L_0x0054
            java.lang.String r0 = "BackupTokenUtils/getTokenByPhoneNumber/single token found"
        L_0x002a:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = X.AnonymousClass021.A0N
            r2.append(r0)
            int r0 = r3.length()
            int r1 = r0 + -4
            r0 = 0
            int r0 = java.lang.Math.max(r1, r0)
            java.lang.String r0 = r3.substring(r0)
            r2.append(r0)
            java.lang.String r12 = r2.toString()
            byte[] r11 = A01
            java.lang.String r8 = "AES/OFB/NoPadding"
            if (r6 == 0) goto L_0x0018
            goto L_0x0091
        L_0x0054:
            X.197 r2 = A00(r6)
            java.lang.String r0 = "BackupTokenUtils/getTokenByPhoneNumber/LRUCache size is "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            int r0 = r2.size()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r0 = X.C004101u.A03(r3)
            java.lang.Object r6 = r2.get(r0)
            byte[] r6 = (byte[]) r6
            if (r6 == 0) goto L_0x007f
            int r0 = r6.length
            if (r0 == 0) goto L_0x007f
            java.lang.String r0 = "BackupTokenUtils/getTokenByPhoneNumber/decrypt token from LRUCache"
            goto L_0x002a
        L_0x007f:
            byte[] r6 = r14.A1o()
            if (r6 == 0) goto L_0x008e
            int r0 = r6.length
            if (r0 == 0) goto L_0x008e
            java.lang.String r0 = "BackupTokenUtils/getTokenByPhoneNumber/decrypt token from shared preferences"
            goto L_0x002a
        L_0x008b:
            java.lang.String r0 = "BackupTokenUtils/getTokenByPhoneNumber/killswitch off/decrypt entire backup_token file content"
            goto L_0x002a
        L_0x008e:
            java.lang.String r0 = "BackupTokenUtils/getTokenByPhoneNumber/no token saved for this phone number"
            goto L_0x0015
        L_0x0091:
            int r10 = r11.length     // Catch:{ Exception -> 0x010b }
            r4 = 4
            int r9 = r10 + 4
            r3 = 16
            int r7 = r9 + 16
            int r2 = r7 + 20
            int r5 = r6.length     // Catch:{ Exception -> 0x010b }
            if (r5 < r2) goto L_0x00eb
            byte[] r0 = new byte[r10]     // Catch:{ Exception -> 0x010b }
            r1 = 0
            java.lang.System.arraycopy(r6, r1, r0, r1, r10)     // Catch:{ Exception -> 0x010b }
            boolean r0 = java.util.Arrays.equals(r0, r11)     // Catch:{ Exception -> 0x010b }
            if (r0 == 0) goto L_0x00e5
            byte[] r2 = new byte[r4]     // Catch:{ Exception -> 0x010b }
            java.lang.System.arraycopy(r6, r10, r2, r1, r4)     // Catch:{ Exception -> 0x010b }
            byte[] r4 = new byte[r3]     // Catch:{ Exception -> 0x010b }
            java.lang.System.arraycopy(r6, r9, r4, r1, r3)     // Catch:{ Exception -> 0x010b }
            byte[] r1 = r12.getBytes()     // Catch:{ Exception -> 0x010b }
            r0 = 128(0x80, float:1.794E-43)
            javax.crypto.SecretKey r0 = X.C004101u.A07(r1, r2, r3, r0)     // Catch:{ Exception -> 0x010b }
            byte[] r2 = r0.getEncoded()     // Catch:{ Exception -> 0x010b }
            java.lang.String r1 = "AES"
            javax.crypto.spec.SecretKeySpec r0 = new javax.crypto.spec.SecretKeySpec     // Catch:{ Exception -> 0x010b }
            r0.<init>(r2, r1)     // Catch:{ Exception -> 0x010b }
            byte[] r0 = r0.getEncoded()     // Catch:{ Exception -> 0x010b }
            javax.crypto.spec.SecretKeySpec r3 = new javax.crypto.spec.SecretKeySpec     // Catch:{ Exception -> 0x010b }
            r3.<init>(r0, r8)     // Catch:{ Exception -> 0x010b }
            javax.crypto.Cipher r2 = javax.crypto.Cipher.getInstance(r8)     // Catch:{ Exception -> 0x010b }
            r1 = 2
            javax.crypto.spec.IvParameterSpec r0 = new javax.crypto.spec.IvParameterSpec     // Catch:{ Exception -> 0x010b }
            r0.<init>(r4)     // Catch:{ Exception -> 0x010b }
            r2.init(r1, r3, r0)     // Catch:{ Exception -> 0x010b }
            int r5 = r5 - r7
            byte[] r13 = r2.doFinal(r6, r7, r5)     // Catch:{ Exception -> 0x010b }
            return r13
        L_0x00e5:
            X.03R r0 = new X.03R     // Catch:{ Exception -> 0x010b }
            r0.<init>()     // Catch:{ Exception -> 0x010b }
            throw r0     // Catch:{ Exception -> 0x010b }
        L_0x00eb:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x010b }
            r1.<init>()     // Catch:{ Exception -> 0x010b }
            java.lang.String r0 = "size mismatch expected length:"
            r1.append(r0)     // Catch:{ Exception -> 0x010b }
            r1.append(r2)     // Catch:{ Exception -> 0x010b }
            java.lang.String r0 = ", actual length:"
            r1.append(r0)     // Catch:{ Exception -> 0x010b }
            r1.append(r5)     // Catch:{ Exception -> 0x010b }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x010b }
            java.security.InvalidParameterException r0 = new java.security.InvalidParameterException     // Catch:{ Exception -> 0x010b }
            r0.<init>(r1)     // Catch:{ Exception -> 0x010b }
            throw r0     // Catch:{ Exception -> 0x010b }
        L_0x010b:
            r1 = move-exception
            java.lang.String r0 = "BackupTokenUtils/decrypt/unable to decrypt"
            com.whatsapp.util.Log.e(r0, r1)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2FR.A07(android.content.Context, X.0rz, X.10J, X.0pd, java.lang.String):byte[]");
    }
}
