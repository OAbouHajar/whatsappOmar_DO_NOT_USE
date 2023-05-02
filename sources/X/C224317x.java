package X;

import android.content.ContentValues;
import android.database.sqlite.SQLiteConstraintException;

/* renamed from: X.17x  reason: invalid class name and case insensitive filesystem */
public class C224317x {
    public final C16040sK A00;
    public final C16920ts A01;
    public final C16900tq A02;
    public final AnonymousClass11I A03;

    public C224317x(C16040sK r1, C16920ts r2, C16900tq r3, AnonymousClass11I r4) {
        this.A01 = r2;
        this.A00 = r1;
        this.A03 = r4;
        this.A02 = r3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x00ce A[Catch:{ SQLiteConstraintException -> 0x0131, all -> 0x014e }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x012a A[Catch:{ SQLiteConstraintException -> 0x0131, all -> 0x014e }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(X.C30901d9 r15) {
        /*
            r14 = this;
            boolean r0 = r14.A02()
            if (r0 != 0) goto L_0x001c
            long r3 = r15.A13
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0156
            long r3 = r15.A13
            X.11I r5 = r14.A03
            java.lang.String r0 = "migration_message_location_index"
            long r1 = r5.A01(r0, r1)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0156
        L_0x001c:
            long r1 = r15.A13
            r3 = 0
            r13 = 0
            r8 = 1
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r2 = 0
            if (r0 <= 0) goto L_0x0028
            r2 = 1
        L_0x0028:
            java.lang.String r1 = "LocationMessageStore/insertOrUpdateLocationMessage/message must have row_id set; key="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            X.1Vw r3 = r15.A11
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            X.AnonymousClass00B.A0C(r0, r2)
            int r0 = r15.A08()
            r2 = 0
            if (r0 != r8) goto L_0x0043
            r2 = 1
        L_0x0043:
            java.lang.String r1 = "LocationMessageStore/insertOrUpdateLocationMessage/message in main storage; key="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            X.AnonymousClass00B.A0C(r0, r2)
            X.0tq r0 = r14.A02
            X.0tf r7 = r0.A02()
            android.content.ContentValues r9 = new android.content.ContentValues     // Catch:{ all -> 0x014e }
            r9.<init>()     // Catch:{ all -> 0x014e }
            long r0 = r15.A13     // Catch:{ SQLiteConstraintException -> 0x0131 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ SQLiteConstraintException -> 0x0131 }
            java.lang.String r0 = "message_row_id"
            r9.put(r0, r1)     // Catch:{ SQLiteConstraintException -> 0x0131 }
            X.0ts r1 = r14.A01     // Catch:{ SQLiteConstraintException -> 0x0131 }
            X.0rv r0 = r3.A00     // Catch:{ SQLiteConstraintException -> 0x0131 }
            X.AnonymousClass00B.A06(r0)     // Catch:{ SQLiteConstraintException -> 0x0131 }
            long r0 = r1.A02(r0)     // Catch:{ SQLiteConstraintException -> 0x0131 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ SQLiteConstraintException -> 0x0131 }
            java.lang.String r0 = "chat_row_id"
            r9.put(r0, r1)     // Catch:{ SQLiteConstraintException -> 0x0131 }
            double r0 = r15.A00     // Catch:{ SQLiteConstraintException -> 0x0131 }
            java.lang.Double r1 = java.lang.Double.valueOf(r0)     // Catch:{ SQLiteConstraintException -> 0x0131 }
            java.lang.String r0 = "latitude"
            r9.put(r0, r1)     // Catch:{ SQLiteConstraintException -> 0x0131 }
            double r0 = r15.A01     // Catch:{ SQLiteConstraintException -> 0x0131 }
            java.lang.Double r1 = java.lang.Double.valueOf(r0)     // Catch:{ SQLiteConstraintException -> 0x0131 }
            java.lang.String r0 = "longitude"
            r9.put(r0, r1)     // Catch:{ SQLiteConstraintException -> 0x0131 }
            boolean r0 = r15 instanceof X.C38751rM     // Catch:{ SQLiteConstraintException -> 0x0131 }
            java.lang.String r6 = "live_location_sequence_number"
            java.lang.String r1 = "live_location_share_duration"
            java.lang.String r10 = "url"
            java.lang.String r11 = "place_address"
            java.lang.String r12 = "place_name"
            java.lang.String r2 = "live_location_final_timestamp"
            java.lang.String r4 = "live_location_final_longitude"
            java.lang.String r5 = "live_location_final_latitude"
            if (r0 == 0) goto L_0x00cf
            r3 = r15
            X.1rM r3 = (X.C38751rM) r3     // Catch:{ SQLiteConstraintException -> 0x0131 }
            java.lang.String r0 = r3.A01     // Catch:{ SQLiteConstraintException -> 0x0131 }
            X.C38611r4.A04(r9, r12, r0)     // Catch:{ SQLiteConstraintException -> 0x0131 }
            java.lang.String r0 = r3.A00     // Catch:{ SQLiteConstraintException -> 0x0131 }
            X.C38611r4.A04(r9, r11, r0)     // Catch:{ SQLiteConstraintException -> 0x0131 }
            java.lang.String r0 = r3.A02     // Catch:{ SQLiteConstraintException -> 0x0131 }
            X.C38611r4.A04(r9, r10, r0)     // Catch:{ SQLiteConstraintException -> 0x0131 }
            r9.putNull(r1)     // Catch:{ SQLiteConstraintException -> 0x0131 }
            r9.putNull(r6)     // Catch:{ SQLiteConstraintException -> 0x0131 }
        L_0x00c1:
            r9.putNull(r5)     // Catch:{ SQLiteConstraintException -> 0x0131 }
            r9.putNull(r4)     // Catch:{ SQLiteConstraintException -> 0x0131 }
            r9.putNull(r2)     // Catch:{ SQLiteConstraintException -> 0x0131 }
        L_0x00ca:
            int r0 = r15.A02     // Catch:{ SQLiteConstraintException -> 0x0131 }
            if (r0 != r8) goto L_0x0112
            goto L_0x0111
        L_0x00cf:
            boolean r0 = r15 instanceof X.C38841rV     // Catch:{ SQLiteConstraintException -> 0x0131 }
            if (r0 == 0) goto L_0x00ca
            r9.putNull(r12)     // Catch:{ SQLiteConstraintException -> 0x0131 }
            r9.putNull(r11)     // Catch:{ SQLiteConstraintException -> 0x0131 }
            r9.putNull(r10)     // Catch:{ SQLiteConstraintException -> 0x0131 }
            r3 = r15
            X.1rV r3 = (X.C38841rV) r3     // Catch:{ SQLiteConstraintException -> 0x0131 }
            int r0 = r3.A00     // Catch:{ SQLiteConstraintException -> 0x0131 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ SQLiteConstraintException -> 0x0131 }
            r9.put(r1, r0)     // Catch:{ SQLiteConstraintException -> 0x0131 }
            long r0 = r3.A01     // Catch:{ SQLiteConstraintException -> 0x0131 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ SQLiteConstraintException -> 0x0131 }
            r9.put(r6, r0)     // Catch:{ SQLiteConstraintException -> 0x0131 }
            X.1sx r3 = r3.A02     // Catch:{ SQLiteConstraintException -> 0x0131 }
            if (r3 == 0) goto L_0x00c1
            double r0 = r3.A00     // Catch:{ SQLiteConstraintException -> 0x0131 }
            java.lang.Double r0 = java.lang.Double.valueOf(r0)     // Catch:{ SQLiteConstraintException -> 0x0131 }
            r9.put(r5, r0)     // Catch:{ SQLiteConstraintException -> 0x0131 }
            double r0 = r3.A01     // Catch:{ SQLiteConstraintException -> 0x0131 }
            java.lang.Double r0 = java.lang.Double.valueOf(r0)     // Catch:{ SQLiteConstraintException -> 0x0131 }
            r9.put(r4, r0)     // Catch:{ SQLiteConstraintException -> 0x0131 }
            long r0 = r3.A05     // Catch:{ SQLiteConstraintException -> 0x0131 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ SQLiteConstraintException -> 0x0131 }
            r9.put(r2, r0)     // Catch:{ SQLiteConstraintException -> 0x0131 }
            goto L_0x00ca
        L_0x0111:
            r0 = 0
        L_0x0112:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ SQLiteConstraintException -> 0x0131 }
            java.lang.String r0 = "map_download_status"
            r9.put(r0, r1)     // Catch:{ SQLiteConstraintException -> 0x0131 }
            X.0tg r1 = r7.A02     // Catch:{ SQLiteConstraintException -> 0x0131 }
            java.lang.String r0 = "message_location"
            long r3 = r1.A03(r9, r0)     // Catch:{ SQLiteConstraintException -> 0x0131 }
            long r0 = r15.A13     // Catch:{ SQLiteConstraintException -> 0x0131 }
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            r1 = 0
            if (r2 != 0) goto L_0x012b
            r1 = 1
        L_0x012b:
            java.lang.String r0 = "LocationMessageStore/insertOrUpdateLocationMessage/inserted row should have same row_id"
            X.AnonymousClass00B.A0D(r0, r1)     // Catch:{ SQLiteConstraintException -> 0x0131 }
            goto L_0x0153
        L_0x0131:
            r6 = move-exception
            java.lang.String r0 = "message_row_id"
            r9.remove(r0)     // Catch:{ all -> 0x014e }
            X.0tg r5 = r7.A02     // Catch:{ all -> 0x014e }
            java.lang.String r4 = "message_location"
            java.lang.String r3 = "message_row_id = ?"
            java.lang.String[] r2 = new java.lang.String[r8]     // Catch:{ all -> 0x014e }
            long r0 = r15.A13     // Catch:{ all -> 0x014e }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x014e }
            r2[r13] = r0     // Catch:{ all -> 0x014e }
            int r0 = r5.A00(r4, r9, r3, r2)     // Catch:{ all -> 0x014e }
            if (r0 == r8) goto L_0x0153
            throw r6     // Catch:{ all -> 0x014e }
        L_0x014e:
            r0 = move-exception
            r7.close()     // Catch:{ all -> 0x0152 }
        L_0x0152:
            throw r0
        L_0x0153:
            r7.close()
        L_0x0156:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C224317x.A00(X.1d9):void");
    }

    public void A01(C30901d9 r11, long j2) {
        ContentValues contentValues;
        boolean z2 = false;
        if (r11.A08() == 2) {
            z2 = true;
        }
        StringBuilder sb = new StringBuilder("LocationMessageStore/insertOrUpdateQuotedLocationMessage/message in main storage; key=");
        sb.append(r11.A11);
        AnonymousClass00B.A0C(sb.toString(), z2);
        C16800tf A022 = this.A02.A02();
        try {
            contentValues = new ContentValues();
            contentValues.put("message_row_id", Long.valueOf(j2));
            contentValues.put("latitude", Double.valueOf(r11.A00));
            contentValues.put("longitude", Double.valueOf(r11.A01));
            if (r11 instanceof C38751rM) {
                C38751rM r1 = (C38751rM) r11;
                C38611r4.A04(contentValues, "place_name", r1.A01);
                C38611r4.A04(contentValues, "place_address", r1.A00);
                C38611r4.A04(contentValues, "url", r1.A02);
            } else if (r11 instanceof C38841rV) {
                contentValues.putNull("place_name");
                contentValues.putNull("place_address");
                contentValues.putNull("url");
            }
            C38611r4.A06(contentValues, "thumbnail", r11.A0F().A07());
            boolean z3 = false;
            if (A022.A02.A03(contentValues, "message_quoted_location") == j2) {
                z3 = true;
            }
            AnonymousClass00B.A0D("LocationMessageStore/insertOrUpdateQuotedLocationMessage/inserted row should have same row_id", z3);
        } catch (SQLiteConstraintException e2) {
            contentValues.remove("message_row_id");
            if (A022.A02.A00("message_quoted_location", contentValues, "message_row_id = ?", new String[]{String.valueOf(j2)}) != 1) {
                throw e2;
            }
        } catch (Throwable th) {
            try {
                A022.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
        A022.close();
    }

    public boolean A02() {
        return this.A01.A0H() && this.A03.A01("location_ready", 0) == 2;
    }
}
