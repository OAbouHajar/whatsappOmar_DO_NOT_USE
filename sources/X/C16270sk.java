package X;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/* renamed from: X.0sk  reason: invalid class name and case insensitive filesystem */
public class C16270sk {
    public final C16980tz A00;

    public C16270sk(C16980tz r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x009b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C16950tw A00() {
        /*
            r6 = this;
            X.0tz r0 = r6.A00
            android.content.Context r3 = r0.A00
            java.io.File r2 = r3.getFilesDir()
            java.lang.String r0 = "password_data.key"
            java.io.File r1 = new java.io.File
            r1.<init>(r2, r0)
            boolean r0 = r1.exists()
            r5 = 0
            if (r0 != 0) goto L_0x005d
            java.io.File r2 = r3.getFilesDir()
            java.lang.String r1 = "password_hash.key"
            java.io.File r0 = new java.io.File
            r0.<init>(r2, r1)
            byte[] r4 = X.C004101u.A0H(r0)
            if (r4 == 0) goto L_0x005b
            int r2 = r4.length
            r1 = 64
            r0 = 0
            if (r2 != r1) goto L_0x002e
            r0 = 1
        L_0x002e:
            X.AnonymousClass00B.A0F(r0)
        L_0x0031:
            java.io.File r2 = r3.getFilesDir()
            java.lang.String r1 = "password_hash_salt.key"
            java.io.File r0 = new java.io.File
            r0.<init>(r2, r1)
            byte[] r3 = X.C004101u.A0H(r0)
            if (r3 == 0) goto L_0x0059
            int r2 = r3.length
            r1 = 64
            r0 = 0
            if (r2 != r1) goto L_0x0049
            r0 = 1
        L_0x0049:
            X.AnonymousClass00B.A0F(r0)
        L_0x004c:
            if (r4 == 0) goto L_0x0058
            if (r3 == 0) goto L_0x0058
            r0 = 100000(0x186a0, float:1.4013E-40)
            X.0tw r5 = new X.0tw
            r5.<init>(r4, r3, r0)
        L_0x0058:
            return r5
        L_0x0059:
            r3 = 0
            goto L_0x004c
        L_0x005b:
            r4 = 0
            goto L_0x0031
        L_0x005d:
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ IOException | ClassNotFoundException -> 0x009c }
            r0.<init>(r1)     // Catch:{ IOException | ClassNotFoundException -> 0x009c }
            java.io.ObjectInputStream r4 = new java.io.ObjectInputStream     // Catch:{ IOException | ClassNotFoundException -> 0x009c }
            r4.<init>(r0)     // Catch:{ IOException | ClassNotFoundException -> 0x009c }
            int r1 = r4.readInt()     // Catch:{ all -> 0x0097 }
            r0 = 1
            if (r0 != r1) goto L_0x0093
            java.lang.Object r3 = r4.readObject()     // Catch:{ all -> 0x0097 }
            byte[] r3 = (byte[]) r3     // Catch:{ all -> 0x0097 }
            if (r3 == 0) goto L_0x0093
            int r0 = r3.length     // Catch:{ all -> 0x0097 }
            r1 = 64
            if (r1 != r0) goto L_0x0093
            java.lang.Object r2 = r4.readObject()     // Catch:{ all -> 0x0097 }
            byte[] r2 = (byte[]) r2     // Catch:{ all -> 0x0097 }
            if (r2 == 0) goto L_0x0093
            int r0 = r2.length     // Catch:{ all -> 0x0097 }
            if (r1 != r0) goto L_0x0093
            int r1 = r4.readInt()     // Catch:{ all -> 0x0097 }
            X.0tw r0 = new X.0tw     // Catch:{ all -> 0x0097 }
            r0.<init>(r3, r2, r1)     // Catch:{ all -> 0x0097 }
            r4.close()     // Catch:{ IOException | ClassNotFoundException -> 0x009c }
            return r0
        L_0x0093:
            r4.close()     // Catch:{ IOException | ClassNotFoundException -> 0x009c }
            return r5
        L_0x0097:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x009b }
        L_0x009b:
            throw r0     // Catch:{ IOException | ClassNotFoundException -> 0x009c }
        L_0x009c:
            r1 = move-exception
            java.lang.String r0 = "EncBackupLocalStorage/failed to load password data"
            com.whatsapp.util.Log.e(r0, r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16270sk.A00():X.0tw");
    }

    public void A01(C16950tw r7) {
        byte[] bArr = r7.A01;
        boolean z2 = false;
        boolean z3 = false;
        if (bArr.length == 64) {
            z3 = true;
        }
        AnonymousClass00B.A0F(z3);
        byte[] bArr2 = r7.A02;
        if (bArr2.length == 64) {
            z2 = true;
        }
        AnonymousClass00B.A0F(z2);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(new File(this.A00.A00.getFilesDir(), "password_data.key")));
        try {
            objectOutputStream.writeInt(1);
            objectOutputStream.writeObject(bArr);
            objectOutputStream.writeObject(bArr2);
            objectOutputStream.writeInt(r7.A00);
            objectOutputStream.close();
            return;
        } catch (Throwable unused) {
        }
        throw th;
    }

    public void A02(byte[] bArr) {
        boolean z2 = false;
        if (bArr.length == 32) {
            z2 = true;
        }
        AnonymousClass00B.A0F(z2);
        C004101u.A09(new File(this.A00.A00.getFilesDir(), "encrypted_backup.key"), bArr);
    }

    public byte[] A03() {
        byte[] A0H = C004101u.A0H(new File(this.A00.A00.getFilesDir(), "encrypted_backup.key"));
        if (A0H == null) {
            return null;
        }
        boolean z2 = false;
        if (A0H.length == 32) {
            z2 = true;
        }
        AnonymousClass00B.A0F(z2);
        return A0H;
    }
}
