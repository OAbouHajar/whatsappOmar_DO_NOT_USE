package X;

import android.net.Uri;
import android.os.Bundle;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

/* renamed from: X.12l  reason: invalid class name and case insensitive filesystem */
public class C210112l {
    public final C16270sk A00;
    public final C16980tz A01;
    public final C15860rz A02;
    public final AnonymousClass12X A03;

    public C210112l(C16270sk r1, C16980tz r2, C15860rz r3, AnonymousClass12X r4) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
        this.A03 = r4;
    }

    public static final Uri A00(String str, String str2, String str3) {
        Uri.Builder appendPath = new Uri.Builder().scheme("content").authority("com.obwhatsapp.provider.MigrationContentProvider").appendPath(str);
        if (str2 != null) {
            appendPath.appendQueryParameter("query_param_country_code", str2);
        }
        if (str3 != null) {
            appendPath.appendQueryParameter("query_param_phone_number", str3);
        }
        return appendPath.build();
    }

    public static final byte[] A01(Bundle bundle, String str, byte[] bArr) {
        byte[] byteArray = bundle.getByteArray(str);
        if (byteArray == null) {
            Log.e("MigrateFileDirectlyHelper/getEncryptedData erk is null");
            return null;
        }
        try {
            PrivateKey generatePrivate = KeyFactory.getInstance("RSA").generatePrivate(new PKCS8EncodedKeySpec(bArr));
            Cipher instance = Cipher.getInstance("RSA/ECB/OAEPWithSHA-256AndMGF1Padding");
            instance.init(2, generatePrivate);
            return instance.doFinal(byteArray);
        } catch (InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException unused) {
            Log.e("MigrateFileDirectlyHelper/getEncryptedData failed to decrypt erk");
            return null;
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x002e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0033 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A02(java.io.File r5, java.io.FileDescriptor r6) {
        /*
            r4 = this;
            java.lang.String r0 = "MigrateFileDirectlyHelper/replaceFile"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.12X r0 = r4.A03     // Catch:{ Exception -> 0x0034 }
            X.1XH r0 = r0.A00     // Catch:{ Exception -> 0x0034 }
            X.1uh r3 = new X.1uh     // Catch:{ Exception -> 0x0034 }
            r3.<init>(r0, r5)     // Catch:{ Exception -> 0x0034 }
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ all -> 0x002f }
            r2.<init>(r6)     // Catch:{ all -> 0x002f }
            java.nio.channels.FileChannel r1 = r2.getChannel()     // Catch:{ all -> 0x002a }
            java.nio.channels.WritableByteChannel r0 = java.nio.channels.Channels.newChannel(r3)     // Catch:{ all -> 0x002a }
            X.AnonymousClass1XI.A0I(r1, r0)     // Catch:{ all -> 0x002a }
            r3.close()     // Catch:{ all -> 0x002a }
            r1 = 19
            r2.close()     // Catch:{ all -> 0x002f }
            r3.close()     // Catch:{ Exception -> 0x0034 }
            return r1
        L_0x002a:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x002e }
        L_0x002e:
            throw r0     // Catch:{ all -> 0x002f }
        L_0x002f:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0033 }
        L_0x0033:
            throw r0     // Catch:{ Exception -> 0x0034 }
        L_0x0034:
            r2 = move-exception
            java.lang.String r0 = "MigrateFileDirectlyHelper/replaceFile/error while moving file. File to replace is "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = r5.toString()
            r1.append(r0)
            java.lang.String r0 = " error message is: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.lang.String r0 = r2.getMessage()
            if (r0 == 0) goto L_0x0065
            java.lang.String r1 = r2.getMessage()
            java.lang.String r0 = "No space"
            boolean r0 = r1.contains(r0)
            r1 = 5
            if (r0 != 0) goto L_0x0067
        L_0x0065:
            r1 = 15
        L_0x0067:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C210112l.A02(java.io.File, java.io.FileDescriptor):int");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0041 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A03(java.io.File r4, java.lang.String r5) {
        /*
            r3 = this;
            X.0tz r0 = r3.A01     // Catch:{ IOException | SecurityException -> 0x0042 }
            android.content.Context r0 = r0.A00     // Catch:{ IOException | SecurityException -> 0x0042 }
            android.content.ContentResolver r2 = r0.getContentResolver()     // Catch:{ IOException | SecurityException -> 0x0042 }
            X.0rz r0 = r3.A02     // Catch:{ IOException | SecurityException -> 0x0042 }
            java.lang.String r1 = r0.A0O()     // Catch:{ IOException | SecurityException -> 0x0042 }
            java.lang.String r0 = r0.A0Q()     // Catch:{ IOException | SecurityException -> 0x0042 }
            android.net.Uri r1 = A00(r5, r1, r0)     // Catch:{ IOException | SecurityException -> 0x0042 }
            java.lang.String r0 = "r"
            android.os.ParcelFileDescriptor r1 = r2.openFileDescriptor(r1, r0)     // Catch:{ IOException | SecurityException -> 0x0042 }
            if (r1 == 0) goto L_0x0030
            java.io.FileDescriptor r0 = r1.getFileDescriptor()     // Catch:{ all -> 0x003b }
            if (r0 == 0) goto L_0x0030
            java.io.FileDescriptor r0 = r1.getFileDescriptor()     // Catch:{ all -> 0x003b }
            int r0 = r3.A02(r4, r0)     // Catch:{ all -> 0x003b }
            r1.close()     // Catch:{ IOException | SecurityException -> 0x0042 }
            return r0
        L_0x0030:
            java.lang.String r0 = "MigrateFileDirectlyHelper/migrateFile/consumer file is null"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x003b }
            if (r1 == 0) goto L_0x005c
            r1.close()     // Catch:{ IOException | SecurityException -> 0x0042 }
            goto L_0x005c
        L_0x003b:
            r0 = move-exception
            if (r1 == 0) goto L_0x0041
            r1.close()     // Catch:{ all -> 0x0041 }
        L_0x0041:
            throw r0     // Catch:{ IOException | SecurityException -> 0x0042 }
        L_0x0042:
            r2 = move-exception
            java.lang.String r0 = "MigrateFileDirectlyHelper/migrateFile/error while fetching internal file: "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r5)
            java.lang.String r0 = " from consumer app. error message is: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x005c:
            r0 = 15
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C210112l.A03(java.io.File, java.lang.String):int");
    }

    public boolean A04() {
        try {
            KeyPairGenerator instance = KeyPairGenerator.getInstance("RSA");
            instance.initialize(2024);
            KeyPair generateKeyPair = instance.generateKeyPair();
            Bundle bundle = new Bundle();
            C15860rz r7 = this.A02;
            bundle.putString("query_param_country_code", r7.A0O());
            bundle.putString("query_param_phone_number", r7.A0Q());
            bundle.putByteArray("pk", generateKeyPair.getPublic().getEncoded());
            Bundle call = this.A01.A00.getContentResolver().call(A00("", r7.A0O(), r7.A0Q()), "retrieve_rk", (String) null, bundle);
            if (call == null) {
                Log.e("MigrateFileDirectlyHelper/migrateBackupEncryptionKey null returned");
                return false;
            }
            byte[] encoded = generateKeyPair.getPrivate().getEncoded();
            byte[] A012 = A01(call, "erk", encoded);
            if (A012 == null) {
                Log.e("MigrateFileDirectlyHelper/migrateBackupEncryptionKey root key is null");
                return false;
            }
            C16270sk r5 = this.A00;
            r5.A02(A012);
            byte[] A013 = A01(call, "ph", encoded);
            byte[] A014 = A01(call, "ps", encoded);
            int i2 = call.getInt("ic", 100000);
            r7.A1O(true);
            if (A013 == null || A014 == null) {
                r7.A1P(true);
                return true;
            }
            r5.A01(new C16950tw(A013, A014, i2));
            r7.A1P(false);
            return true;
        } catch (IOException | NoSuchAlgorithmException e2) {
            Log.e("MigrateFileDirectlyHelper/migrateBackupEncryptionKey failed", e2);
            return false;
        }
    }
}
