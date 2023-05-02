package X;

import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1iz  reason: invalid class name and case insensitive filesystem */
public class C33691iz extends C20380zx {
    public final C16040sK A00;
    public final AnonymousClass19W A01;
    public final C16440t3 A02;

    public C33691iz(C16040sK r1, AnonymousClass19W r2, C16440t3 r3, C20360zv r4) {
        super(r4);
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
    }

    public final List A0A(boolean z2) {
        ArrayList arrayList = new ArrayList();
        int A002 = this.A01.A08.A00();
        if (A002 != 0) {
            for (String r6 : AnonymousClass1WJ.A08) {
                arrayList.add(new C36901oI((AnonymousClass1WK) null, (String) null, r6, A002, this.A02.A00(), z2));
            }
        }
        return arrayList;
    }

    public void A0B(C36901oI r8, C36901oI r9) {
        if (r9 == null || r9.A00 <= r8.A00) {
            AnonymousClass19W r3 = this.A01;
            int i2 = r8.A00;
            StringBuilder sb = new StringBuilder("SyncdKeyManager/expireKeysWithEpochIfActive expiredKeyEpoch = ");
            sb.append(i2);
            Log.i(sb.toString());
            AnonymousClass19V r1 = r3.A08;
            AnonymousClass1WY A012 = r1.A01();
            if (A012 != null) {
                AnonymousClass1WK r6 = A012.A01;
                if (r6.A01() <= i2) {
                    C16800tf A022 = r1.A00.A02();
                    try {
                        A022.A02.A0C("UPDATE crypto_info SET timestamp = 0  WHERE device_id = ?  AND epoch = ? ", new String[]{String.valueOf(r6.A00()), String.valueOf(r6.A01())});
                        A022.close();
                    } catch (Throwable unused) {
                    }
                }
            }
            A08(r8, r9);
            return;
        }
        A06(r8);
        return;
        throw th;
    }
}
