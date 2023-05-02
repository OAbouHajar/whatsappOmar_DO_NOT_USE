package X;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import com.facebook.redex.RunnableRunnableShape8S0100000_I0_7;
import com.whatsapp.util.Log;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Iterator;

/* renamed from: X.1mm  reason: invalid class name and case insensitive filesystem */
public class C35961mm implements AnonymousClass03M {
    public final /* synthetic */ C208211s A00;

    public C35961mm(C208211s r1) {
        this.A00 = r1;
    }

    public void APQ() {
        this.A00.A0O();
    }

    public void APR(SQLiteDatabase sQLiteDatabase) {
        C208211s r3 = this.A00;
        long A002 = r3.A0D.A00() / 1000;
        C36011mr A003 = C28851Ya.A00();
        C36431nX r1 = new C36431nX(A003.A00, new AnonymousClass1WL(A003.A01));
        C30851d4 r10 = r3.A07;
        byte[] A004 = r1.A01.A00.A00();
        C36671nv r2 = r1.A00;
        byte[] bArr = r2.A01;
        try {
            int nextInt = SecureRandom.getInstance("SHA1PRNG").nextInt(2147483646) + 1;
            ContentValues contentValues = new ContentValues();
            contentValues.put("recipient_id", -1);
            contentValues.put("recipient_type", 0);
            contentValues.put("device_id", 0);
            contentValues.put("registration_id", Integer.valueOf(nextInt));
            contentValues.put("public_key", A004);
            contentValues.put("private_key", bArr);
            try {
                contentValues.put("next_prekey_id", Integer.valueOf(SecureRandom.getInstance("SHA1PRNG").nextInt(16777214) + 1));
                Long valueOf = Long.valueOf(A002);
                contentValues.put("timestamp", valueOf);
                sQLiteDatabase.insertOrThrow("identities", (String) null, contentValues);
                Log.i("axolotl inserted identity key pair");
                r10.A01 = new C31941fH(A004, bArr);
                r10.A00 = nextInt;
                C35981mo r8 = r3.A00;
                try {
                    C36011mr A005 = C28851Ya.A00();
                    C30351cD r12 = A005.A01;
                    byte[] A06 = C28851Ya.A06(r2, r12.A00());
                    C36691nx r22 = (C36691nx) C31801f3.A06.A0U();
                    r22.A05(0);
                    byte[] A006 = r12.A00();
                    r22.A08(C28631Ww.A01(A006, 0, A006.length));
                    byte[] bArr2 = A005.A00.A01;
                    r22.A07(C28631Ww.A01(bArr2, 0, bArr2.length));
                    r22.A09(C28631Ww.A01(A06, 0, A06.length));
                    r22.A06(r8.A01.A00());
                    byte[] A02 = r22.A02().A02();
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put("prekey_id", 0);
                    contentValues2.put("timestamp", valueOf);
                    contentValues2.put("record", A02);
                    sQLiteDatabase.insertOrThrow("signed_prekeys", (String) null, contentValues2);
                    Log.i("axolotl inserted signed prekey");
                    AnonymousClass16P r23 = r3.A0H;
                    r23.A00.submit(new RunnableRunnableShape8S0100000_I0_7(r3, 30));
                    r3.A0E.A1T(true);
                    Iterator it = r3.A0G.A01().iterator();
                    if (it.hasNext()) {
                        it.next();
                        throw new NullPointerException("onSignalStoreCreated");
                    }
                } catch (C31751ey e2) {
                    throw new RuntimeException(e2);
                }
            } catch (NoSuchAlgorithmException e3) {
                throw new AssertionError(e3);
            }
        } catch (NoSuchAlgorithmException e4) {
            throw new AssertionError(e4);
        }
    }
}
