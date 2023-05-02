package X;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1Gn  reason: invalid class name and case insensitive filesystem */
public class C24591Gn {
    public final AnonymousClass12E A00;
    public final C16760tb A01;
    public final AnonymousClass19D A02;
    public final C16440t3 A03;
    public final C16460t6 A04;
    public final AnonymousClass10G A05;

    public C24591Gn(AnonymousClass12E r1, C16760tb r2, AnonymousClass19D r3, C16440t3 r4, C16460t6 r5, AnonymousClass10G r6) {
        this.A03 = r4;
        this.A01 = r2;
        this.A04 = r5;
        this.A02 = r3;
        this.A05 = r6;
        this.A00 = r1;
    }

    public final List A00(C15830rv r7, Set set, boolean z2) {
        ArrayList arrayList = new ArrayList();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C37901pv r0 = (C37901pv) it.next();
            C16460t6 r3 = this.A04;
            C16740tZ A032 = r3.A0K.A03(new C28381Vw(r7, r0.A03, r0.A04));
            if (A032 != null && (!A032.A0x || z2)) {
                arrayList.add(A032);
            }
        }
        return arrayList;
    }

    public void A01(C36801o8 r25, C15830rv r26, boolean z2, boolean z3) {
        Throwable th;
        Cursor A0A;
        boolean z4;
        int i2;
        C36801o8 r14 = r25;
        long j2 = r14.A00;
        long max = Math.max(j2, r14.A01);
        C16460t6 r6 = this.A04;
        C15830rv r8 = r26;
        long A08 = r6.A08(r8, max);
        String[] strArr = {String.valueOf(r6.A0N.A02(r8)), String.valueOf(A08), String.valueOf(r6.A0F.A00()), String.valueOf(1000)};
        C16800tf A012 = r6.A0v.get();
        try {
            Cursor A082 = A012.A02.A08("   SELECT _id, sort_id, key_id, from_me, timestamp, receipt_server_timestamp, starred, media_size, status FROM available_message_view WHERE chat_row_id = ? AND sort_id <= ? AND (message_type != '7') AND (expire_timestamp IS NULL OR expire_timestamp >= ? OR keep_in_chat = 1)  ORDER BY sort_id DESC  LIMIT ? ", strArr);
            A012.close();
            ArrayList arrayList = new ArrayList();
            if (A082 != null) {
                while (A082.moveToNext()) {
                    try {
                        arrayList.add(new C47752Kg(A082, r8));
                    } catch (Throwable unused) {
                    }
                }
                A082.close();
            }
            Iterator it = arrayList.iterator();
            long j3 = Long.MAX_VALUE;
            while (it.hasNext()) {
                C47752Kg r1 = (C47752Kg) it.next();
                long j4 = r1.A00;
                if (j4 < j3 && r1.A01 >= j2) {
                    j3 = j4;
                }
            }
            long j5 = -1;
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                C47752Kg r4 = (C47752Kg) it2.next();
                long j6 = r4.A00;
                if (j6 < j3 && j6 > j5 && r4.A01 < j2) {
                    j5 = j6;
                }
            }
            A0A = r6.A0A(r8, j5, A08, max);
            ArrayList arrayList2 = new ArrayList();
            if (A0A != null) {
                while (A0A.moveToNext()) {
                    arrayList2.add(new C47752Kg(A0A, r8));
                }
                A0A.close();
            }
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            Iterator it3 = arrayList.iterator();
            while (true) {
                z4 = z3;
                if (!it3.hasNext()) {
                    break;
                }
                C47752Kg r5 = (C47752Kg) it3.next();
                if (r5.A00 > j5 && ((!r5.A03 || z3) && r5.A01 < j2)) {
                    arrayList4.add(r6.A0K.A03(r5.A02));
                }
            }
            arrayList3.addAll(arrayList4);
            ArrayList arrayList5 = new ArrayList();
            Iterator it4 = arrayList2.iterator();
            while (it4.hasNext()) {
                C47752Kg r12 = (C47752Kg) it4.next();
                long j7 = r12.A01;
                if (j7 <= max) {
                    AnonymousClass1WU r10 = (AnonymousClass1WU) r6.A0K.A03(r12.A02);
                    if (!(r10 == null || (i2 = r10.A00) == 67)) {
                        if (!((Set) C40171tg.A00.get()).contains(Integer.valueOf(i2)) || j7 < this.A03.A00() - TimeUnit.DAYS.toMillis(1)) {
                            arrayList5.add(r10);
                        }
                    }
                }
            }
            arrayList3.addAll(arrayList5);
            arrayList3.addAll(A00(r8, r14.A02, z4));
            arrayList3.addAll(A00(r8, r14.A03, z4));
            boolean z5 = z2;
            if (j5 != -1) {
                Long valueOf = Long.valueOf(j5);
                if (z3) {
                    this.A05.A03(r8, valueOf);
                }
                r6.A0U(r8, true);
                r6.A0S(r8, valueOf, true, z5);
            }
            if (!arrayList3.isEmpty()) {
                r6.A0m(arrayList3, z5 ? 1 : 0);
            }
        } catch (Throwable th2) {
            th = th2;
            A012.close();
            throw th;
        }
    }
}
