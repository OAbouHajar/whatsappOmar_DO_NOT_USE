package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.os.SystemClock;
import com.whatsapp.util.Log;
import java.util.ArrayList;

/* renamed from: X.0yz  reason: invalid class name and case insensitive filesystem */
public class C19780yz {
    public final C16300so A00;
    public final C16440t3 A01;
    public final C16820th A02;
    public final C16920ts A03;
    public final C15810rt A04;
    public final C17620vN A05;
    public final C216314v A06;
    public final AnonymousClass17H A07;
    public final C19650ym A08;
    public final C16900tq A09;
    public final C223717r A0A;
    public final C14710pd A0B;
    public final C223017k A0C;

    public C19780yz(C16300so r1, C16440t3 r2, C16820th r3, C16920ts r4, C15810rt r5, C17620vN r6, C216314v r7, AnonymousClass17H r8, C19650ym r9, C16900tq r10, C223717r r11, C14710pd r12, C223017k r13) {
        this.A01 = r2;
        this.A0B = r12;
        this.A06 = r7;
        this.A03 = r4;
        this.A00 = r1;
        this.A04 = r5;
        this.A0C = r13;
        this.A02 = r3;
        this.A0A = r11;
        this.A05 = r6;
        this.A07 = r8;
        this.A09 = r10;
        this.A08 = r9;
    }

    public C16740tZ A00(C15830rv r7) {
        if (r7 == null) {
            Log.e("msgstore/last/message/jid is null");
            return null;
        }
        C15810rt r1 = this.A04;
        if (r1.A06(r7) == null) {
            StringBuilder sb = new StringBuilder("msgstore/last/message/no chat for ");
            sb.append(r7);
            Log.w(sb.toString());
            return null;
        }
        C15840rx A062 = r1.A06(r7);
        if (A062 == null) {
            return null;
        }
        long j2 = A062.A0L;
        if (j2 == 1) {
            return null;
        }
        C16740tZ r0 = A062.A0Y;
        if (r0 != null) {
            return r0;
        }
        C16740tZ A022 = A02(r7, j2);
        A062.A0Y = A022;
        return A022;
    }

    public C16740tZ A01(C15830rv r9) {
        C16740tZ r4;
        C16740tZ r2 = null;
        if (r9 == null) {
            Log.e("msgstore/last/message/jid is null");
        } else {
            C15810rt r0 = this.A04;
            C15840rx A062 = r0.A06(r9);
            if (A062 == null) {
                StringBuilder sb = new StringBuilder("msgstore/last/message/no chat for ");
                sb.append(r9);
                Log.w(sb.toString());
                return null;
            }
            r2 = A062.A0Z;
            if (r2 == null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                C15840rx A063 = r0.A06(r9);
                if (A063 != null) {
                    long j2 = A063.A0S;
                    if (j2 != 1) {
                        r4 = A02(r9, j2);
                        this.A05.A00("LastMessageStore/getLastChatsListDisplayedMessageFromDb", SystemClock.uptimeMillis() - uptimeMillis);
                        A062.A0Z = r4;
                        return r4;
                    }
                }
                r4 = null;
                A062.A0Z = r4;
                return r4;
            }
        }
        return r2;
    }

    public final C16740tZ A02(C15830rv r10, long j2) {
        C16740tZ A002 = this.A02.A00(j2);
        if (!C16030sJ.A0R(r10) || !(A002 instanceof AnonymousClass1WU)) {
            return A002;
        }
        AnonymousClass1WU r2 = (AnonymousClass1WU) A002;
        if (r2.A00 != 2) {
            return A002;
        }
        Log.i("msgstore/initialize/update-group-create-failed-msg");
        AnonymousClass1WU A003 = AnonymousClass122.A00(this.A00, r2.A11, (C30641ci) null, 3, r2.A0I);
        A003.A0k(r2.A0I());
        A003.A0t(((C39291sE) r2).A01);
        this.A07.A02(A003);
        return A003;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0025, code lost:
        if ((!(r2 instanceof X.AnonymousClass1WU) ? false : X.C40171tg.A01.contains(java.lang.Integer.valueOf(((X.AnonymousClass1WU) r2).A00))) != false) goto L_0x0027;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x00b4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList A03(X.C15830rv r12, int r13) {
        /*
            r11 = this;
            long r9 = android.os.SystemClock.uptimeMillis()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r8 = 1
            if (r13 != r8) goto L_0x0066
            X.0tZ r2 = r11.A01(r12)
            if (r2 == 0) goto L_0x0055
            X.1Vw r0 = r2.A11
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x0027
            X.17k r0 = r11.A0C
            boolean r0 = r0.A00(r2)
            if (r0 != 0) goto L_0x0027
            boolean r0 = r2 instanceof X.AnonymousClass1WU
            if (r0 != 0) goto L_0x0056
            r0 = 0
        L_0x0025:
            if (r0 == 0) goto L_0x0066
        L_0x0027:
            boolean r0 = r2 instanceof X.C38771rO
            if (r0 != 0) goto L_0x0066
            boolean r0 = r2 instanceof X.C38791rQ
            if (r0 != 0) goto L_0x0066
            X.0pd r3 = r11.A0B
            r1 = 1818(0x71a, float:2.548E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r3.A0E(r0, r1)
            if (r0 == 0) goto L_0x003f
            boolean r0 = r2 instanceof X.C38831rU
            if (r0 != 0) goto L_0x0066
        L_0x003f:
            boolean r0 = r2 instanceof X.C38701rH
            if (r0 == 0) goto L_0x0052
            int r0 = r2.A08
            if (r0 != r8) goto L_0x0052
            r0 = r2
            X.0tY r0 = (X.C16730tY) r0
            X.0ta r0 = r0.A02
            if (r0 == 0) goto L_0x0055
            boolean r0 = r0.A0P
            if (r0 == 0) goto L_0x0055
        L_0x0052:
            r4.add(r2)
        L_0x0055:
            return r4
        L_0x0056:
            r0 = r2
            X.1WU r0 = (X.AnonymousClass1WU) r0
            int r0 = r0.A00
            java.util.Set r1 = X.C40171tg.A01
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = r1.contains(r0)
            goto L_0x0025
        L_0x0066:
            X.0tq r0 = r11.A09
            X.0tf r5 = r0.get()
            X.17r r0 = r11.A0A     // Catch:{ all -> 0x00b5 }
            boolean r0 = r0.A02()     // Catch:{ all -> 0x00b5 }
            if (r0 == 0) goto L_0x0093
            java.lang.String r7 = X.C39511sb.A05     // Catch:{ all -> 0x00b5 }
        L_0x0076:
            X.0tg r6 = r5.A02     // Catch:{ all -> 0x00b5 }
            r0 = 2
            java.lang.String[] r3 = new java.lang.String[r0]     // Catch:{ all -> 0x00b5 }
            r2 = 0
            X.0ts r0 = r11.A03     // Catch:{ all -> 0x00b5 }
            long r0 = r0.A02(r12)     // Catch:{ all -> 0x00b5 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x00b5 }
            r3[r2] = r0     // Catch:{ all -> 0x00b5 }
            java.lang.String r0 = java.lang.String.valueOf(r13)     // Catch:{ all -> 0x00b5 }
            r3[r8] = r0     // Catch:{ all -> 0x00b5 }
            android.database.Cursor r1 = r6.A08(r7, r3)     // Catch:{ all -> 0x00b5 }
            goto L_0x0096
        L_0x0093:
            java.lang.String r7 = X.C39511sb.A06     // Catch:{ all -> 0x00b5 }
            goto L_0x0076
        L_0x0096:
            r11.A05(r1, r12, r4)     // Catch:{ all -> 0x00ae }
            if (r1 == 0) goto L_0x009e
            r1.close()     // Catch:{ all -> 0x00b5 }
        L_0x009e:
            r5.close()
            X.0vN r3 = r11.A05
            long r1 = android.os.SystemClock.uptimeMillis()
            long r1 = r1 - r9
            java.lang.String r0 = "LastMessageStore/getLastMessagesForNotification"
            r3.A00(r0, r1)
            return r4
        L_0x00ae:
            r0 = move-exception
            if (r1 == 0) goto L_0x00b4
            r1.close()     // Catch:{ all -> 0x00b4 }
        L_0x00b4:
            throw r0     // Catch:{ all -> 0x00b5 }
        L_0x00b5:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x00b9 }
        L_0x00b9:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19780yz.A03(X.0rv, int):java.util.ArrayList");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0066 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x006b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List A04(X.C15830rv r12, int r13) {
        /*
            r11 = this;
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            X.0tq r0 = r11.A09     // Catch:{ SQLiteDatabaseCorruptException -> 0x0073, IllegalStateException -> 0x006c }
            X.0tf r8 = r0.get()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0073, IllegalStateException -> 0x006c }
            X.0tg r5 = r8.A02     // Catch:{ all -> 0x0067 }
            java.lang.String r3 = X.AnonymousClass1WW.A05     // Catch:{ all -> 0x0067 }
            r0 = 2
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x0067 }
            X.0ts r0 = r11.A03     // Catch:{ all -> 0x0067 }
            long r0 = r0.A02(r12)     // Catch:{ all -> 0x0067 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0067 }
            r10 = 0
            r2[r10] = r0     // Catch:{ all -> 0x0067 }
            java.lang.String r1 = java.lang.String.valueOf(r13)     // Catch:{ all -> 0x0067 }
            r0 = 1
            r2[r0] = r1     // Catch:{ all -> 0x0067 }
            android.database.Cursor r9 = r5.A08(r3, r2)     // Catch:{ all -> 0x0067 }
            X.0rt r0 = r11.A04     // Catch:{ all -> 0x0060 }
            X.0rx r0 = r0.A06(r12)     // Catch:{ all -> 0x0060 }
            if (r0 == 0) goto L_0x0056
            long r1 = r0.A0O     // Catch:{ all -> 0x0060 }
        L_0x0034:
            boolean r0 = r9.moveToNext()     // Catch:{ all -> 0x0060 }
            if (r0 == 0) goto L_0x0059
            X.0th r0 = r11.A02     // Catch:{ all -> 0x0060 }
            X.0tZ r7 = r0.A02(r9, r12, r10)     // Catch:{ all -> 0x0060 }
            if (r7 == 0) goto L_0x0034
            long r5 = r7.A14     // Catch:{ all -> 0x0060 }
            int r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            r0 = 0
            if (r3 > 0) goto L_0x004a
            r0 = 1
        L_0x004a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0060 }
            android.util.Pair r0 = android.util.Pair.create(r7, r0)     // Catch:{ all -> 0x0060 }
            r4.add(r0)     // Catch:{ all -> 0x0060 }
            goto L_0x0034
        L_0x0056:
            r1 = -1
            goto L_0x0034
        L_0x0059:
            r9.close()     // Catch:{ all -> 0x0067 }
            r8.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0073, IllegalStateException -> 0x006c }
            return r4
        L_0x0060:
            r0 = move-exception
            if (r9 == 0) goto L_0x0066
            r9.close()     // Catch:{ all -> 0x0066 }
        L_0x0066:
            throw r0     // Catch:{ all -> 0x0067 }
        L_0x0067:
            r0 = move-exception
            r8.close()     // Catch:{ all -> 0x006b }
        L_0x006b:
            throw r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x0073, IllegalStateException -> 0x006c }
        L_0x006c:
            r1 = move-exception
            java.lang.String r0 = "msgstore/getlastsignificantincomingmessages/IllegalStateException "
            com.whatsapp.util.Log.i(r0, r1)
            return r4
        L_0x0073:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            X.0ym r0 = r11.A08
            r0.A02()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19780yz.A04(X.0rv, int):java.util.List");
    }

    public final void A05(Cursor cursor, C15830rv r6, ArrayList arrayList) {
        if (cursor != null) {
            while (cursor.moveToNext()) {
                try {
                    C16740tZ A022 = this.A02.A02(cursor, r6, false);
                    if (A022 != null) {
                        if ((A022 instanceof C38701rH) && A022.A08 == 1) {
                            C16750ta r0 = ((C38701rH) A022).A02;
                            if (r0 != null) {
                                if (!r0.A0P) {
                                }
                            }
                        } else if (this.A0B.A0E(C16620tM.A02, 1818)) {
                            if (!(A022 instanceof C38831rU)) {
                            }
                        }
                        arrayList.add(A022);
                    }
                } catch (SQLiteDatabaseCorruptException e2) {
                    Log.e((Throwable) e2);
                    this.A08.A02();
                } catch (IllegalStateException e3) {
                    Log.i("msgstore/getlastmessagesfornotification/IllegalStateException ", e3);
                } catch (Throwable th) {
                    cursor.close();
                    throw th;
                }
            }
            cursor.close();
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x005a */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:19:0x005a=Splitter:B:19:0x005a, B:11:0x004d=Splitter:B:11:0x004d} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A06(X.C15830rv r6, long r7) {
        /*
            r5 = this;
            r4 = 0
            if (r6 == 0) goto L_0x0060
            r0 = 2
            java.lang.String[] r2 = new java.lang.String[r0]
            X.0ts r0 = r5.A03
            long r0 = r0.A02(r6)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r2[r4] = r0
            java.lang.String r1 = java.lang.String.valueOf(r7)
            r0 = 1
            r2[r0] = r1
            X.0tq r0 = r5.A09
            X.0tf r3 = r0.get()
            X.0tg r1 = r3.A02     // Catch:{ all -> 0x005b }
            java.lang.String r0 = "SELECT  1  FROM available_message_view WHERE chat_row_id = ? AND timestamp >= ? AND message_type NOT IN ('7') AND from_me = 1 LIMIT 1"
            android.database.Cursor r2 = r1.A08(r0, r2)     // Catch:{ all -> 0x005b }
            if (r2 != 0) goto L_0x0046
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0054 }
            r1.<init>()     // Catch:{ all -> 0x0054 }
            java.lang.String r0 = "msgstore/get/no outgoing message for: "
            r1.append(r0)     // Catch:{ all -> 0x0054 }
            r1.append(r6)     // Catch:{ all -> 0x0054 }
            java.lang.String r0 = " after "
            r1.append(r0)     // Catch:{ all -> 0x0054 }
            r1.append(r7)     // Catch:{ all -> 0x0054 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0054 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0054 }
            goto L_0x0050
        L_0x0046:
            int r0 = r2.getCount()     // Catch:{ all -> 0x0054 }
            if (r0 <= 0) goto L_0x004d
            r4 = 1
        L_0x004d:
            r2.close()     // Catch:{ all -> 0x005b }
        L_0x0050:
            r3.close()
            return r4
        L_0x0054:
            r0 = move-exception
            if (r2 == 0) goto L_0x005a
            r2.close()     // Catch:{ all -> 0x005a }
        L_0x005a:
            throw r0     // Catch:{ all -> 0x005b }
        L_0x005b:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x005f }
        L_0x005f:
            throw r0
        L_0x0060:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19780yz.A06(X.0rv, long):boolean");
    }
}
