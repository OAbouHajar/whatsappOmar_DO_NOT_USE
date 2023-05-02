package X;

import android.database.Cursor;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.19V  reason: invalid class name */
public class AnonymousClass19V {
    public final AnonymousClass19K A00;

    public AnonymousClass19V(AnonymousClass19K r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0035 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A00() {
        /*
            r5 = this;
            X.19K r0 = r5.A00
            X.0tf r4 = r0.get()
            X.0tg r2 = r4.A02     // Catch:{ all -> 0x0036 }
            java.lang.String r1 = "SELECT MAX ( epoch ) as max_epoch FROM crypto_info"
            r0 = 0
            android.database.Cursor r3 = r2.A08(r1, r0)     // Catch:{ all -> 0x0036 }
            boolean r0 = r3.moveToFirst()     // Catch:{ all -> 0x002f }
            if (r0 == 0) goto L_0x0027
            java.lang.String r0 = "max_epoch"
            int r0 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x002f }
            long r1 = r3.getLong(r0)     // Catch:{ all -> 0x002f }
            int r0 = (int) r1     // Catch:{ all -> 0x002f }
            r3.close()     // Catch:{ all -> 0x0036 }
            r4.close()
            return r0
        L_0x0027:
            r3.close()     // Catch:{ all -> 0x0036 }
            r4.close()
            r0 = 0
            return r0
        L_0x002f:
            r0 = move-exception
            if (r3 == 0) goto L_0x0035
            r3.close()     // Catch:{ all -> 0x0035 }
        L_0x0035:
            throw r0     // Catch:{ all -> 0x0036 }
        L_0x0036:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x003a }
        L_0x003a:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass19V.A00():int");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x002d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass1WY A01() {
        /*
            r4 = this;
            X.19K r0 = r4.A00
            X.0tf r3 = r0.get()
            X.0tg r1 = r3.A02     // Catch:{ all -> 0x002e }
            java.lang.String r0 = "SELECT device_id, epoch, key_data, timestamp, fingerprint FROM crypto_info ORDER BY epoch DESC, device_id ASC LIMIT 1"
            r2 = 0
            android.database.Cursor r1 = r1.A08(r0, r2)     // Catch:{ all -> 0x002e }
            boolean r0 = r1.moveToFirst()     // Catch:{ all -> 0x0027 }
            if (r0 == 0) goto L_0x0020
            X.1WY r0 = r4.A02(r1)     // Catch:{ all -> 0x0027 }
            r1.close()     // Catch:{ all -> 0x002e }
            r3.close()
            return r0
        L_0x0020:
            r1.close()     // Catch:{ all -> 0x002e }
            r3.close()
            return r2
        L_0x0027:
            r0 = move-exception
            if (r1 == 0) goto L_0x002d
            r1.close()     // Catch:{ all -> 0x002d }
        L_0x002d:
            throw r0     // Catch:{ all -> 0x002e }
        L_0x002e:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0032 }
        L_0x0032:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass19V.A01():X.1WY");
    }

    public final AnonymousClass1WY A02(Cursor cursor) {
        try {
            C35751mR A002 = C35751mR.A00((C35741mQ) C28541Wm.A0E(C35741mQ.A05, cursor.getBlob(cursor.getColumnIndexOrThrow("fingerprint"))));
            AnonymousClass00B.A06(A002);
            return new AnonymousClass1WY(new C28511Wj(A002, cursor.getBlob(cursor.getColumnIndexOrThrow("key_data")), cursor.getLong(cursor.getColumnIndexOrThrow("timestamp"))), new AnonymousClass1WK((int) cursor.getLong(cursor.getColumnIndexOrThrow("device_id")), (int) cursor.getLong(cursor.getColumnIndexOrThrow("epoch"))));
        } catch (C29791bD e2) {
            throw new IllegalStateException("SyncdCryptoStore/createSyncdKey", e2);
        }
    }

    public void A03(Collection collection, long j2) {
        HashSet hashSet = new HashSet(collection);
        hashSet.remove((Object) null);
        if (!hashSet.isEmpty()) {
            C16800tf A02 = this.A00.A02();
            try {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    AnonymousClass1WK r5 = (AnonymousClass1WK) it.next();
                    A02.A02.A0C("UPDATE crypto_info SET stale_timestamp = ?  WHERE device_id = ?  AND epoch = ? ", new String[]{String.valueOf(j2), String.valueOf(r5.A00()), String.valueOf(r5.A01())});
                }
                A02.close();
                return;
            } catch (Throwable unused) {
            }
        } else {
            return;
        }
        throw th;
    }
}
