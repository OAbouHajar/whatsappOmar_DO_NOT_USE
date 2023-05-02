package X;

import java.util.HashSet;
import java.util.Set;

/* renamed from: X.1I1  reason: invalid class name */
public class AnonymousClass1I1 {
    public final C16300so A00;
    public final C16190sc A01;
    public final C16980tz A02;
    public final C15860rz A03;
    public final C16480t8 A04;
    public final C14710pd A05;

    public AnonymousClass1I1(C16300so r1, C16190sc r2, C16980tz r3, C15860rz r4, C16480t8 r5, C14710pd r6) {
        this.A05 = r6;
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
        this.A04 = r5;
        this.A03 = r4;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x00e2 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:20:0x00e2=Splitter:B:20:0x00e2, B:12:0x00d5=Splitter:B:12:0x00d5} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long A00(java.util.Set r9) {
        /*
            r8 = this;
            X.0pd r4 = r8.A05
            r0 = 1239(0x4d7, float:1.736E-42)
            X.0tM r3 = X.C16620tM.A02
            int r0 = r4.A03(r3, r0)
            long r1 = (long) r0
            r6 = 1000000(0xf4240, double:4.940656E-318)
            long r1 = r1 * r6
            r0 = 1240(0x4d8, float:1.738E-42)
            int r0 = r4.A03(r3, r0)
            long r4 = (long) r0
            long r4 = r4 * r6
            X.0t8 r3 = r8.A04
            java.lang.String r0 = "mediamsgstore/getSizeOfSpecifiedTypesOfMediaFilesFromTimestamp for message types "
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r0)
            r6.append(r9)
            java.lang.String r0 = " with maxDocumentSize"
            r6.append(r0)
            r6.append(r4)
            java.lang.String r0 = " and maxMediaSize"
            r6.append(r0)
            r6.append(r1)
            java.lang.String r0 = r6.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            int r7 = r9.size()
            java.lang.String r0 = "SELECT SUM (file_size) as total_file_size  FROM ("
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r0)
            java.lang.String r0 = "SELECT * FROM message_media AS message_media JOIN available_message_view AS message ON message_media.message_row_id = message._id WHERE "
            r6.append(r0)
            java.lang.String r0 = " message.message_type IN "
            r6.append(r0)
            java.lang.String r0 = X.C34111ji.A00(r7)
            r6.append(r0)
            java.lang.String r0 = " AND "
            r6.append(r0)
            java.lang.String r0 = "(  CASE  WHEN  (message.message_type IN (26,9))"
            r6.append(r0)
            java.lang.String r0 = " THEN message_media.file_size <= "
            r6.append(r0)
            r6.append(r4)
            java.lang.String r0 = " ELSE message_media."
            r6.append(r0)
            java.lang.String r0 = "file_size"
            r6.append(r0)
            java.lang.String r0 = " <= "
            r6.append(r0)
            r6.append(r1)
            java.lang.String r0 = " END )"
            r6.append(r0)
            java.lang.String r0 = " GROUP BY message_media."
            r6.append(r0)
            java.lang.String r0 = "file_hash"
            r6.append(r0)
            java.lang.String r0 = ")"
            r6.append(r0)
            java.lang.String r4 = r6.toString()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r9.iterator()
        L_0x009b:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00ad
            java.lang.Object r0 = r1.next()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r2.add(r0)
            goto L_0x009b
        L_0x00ad:
            X.0tq r0 = r3.A0B
            X.0tf r3 = r0.get()
            X.0tg r1 = r3.A02     // Catch:{ all -> 0x00e3 }
            java.lang.String[] r0 = X.C16480t8.A0E     // Catch:{ all -> 0x00e3 }
            java.lang.Object[] r0 = r2.toArray(r0)     // Catch:{ all -> 0x00e3 }
            java.lang.String[] r0 = (java.lang.String[]) r0     // Catch:{ all -> 0x00e3 }
            android.database.Cursor r2 = r1.A08(r4, r0)     // Catch:{ all -> 0x00e3 }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x00dc }
            if (r0 == 0) goto L_0x00d3
            java.lang.String r0 = "total_file_size"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00dc }
            long r0 = r2.getLong(r0)     // Catch:{ all -> 0x00dc }
            goto L_0x00d5
        L_0x00d3:
            r0 = 0
        L_0x00d5:
            r2.close()     // Catch:{ all -> 0x00e3 }
            r3.close()
            return r0
        L_0x00dc:
            r0 = move-exception
            if (r2 == 0) goto L_0x00e2
            r2.close()     // Catch:{ all -> 0x00e2 }
        L_0x00e2:
            throw r0     // Catch:{ all -> 0x00e3 }
        L_0x00e3:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x00e7 }
        L_0x00e7:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1I1.A00(java.util.Set):long");
    }

    public Set A01() {
        HashSet hashSet = new HashSet();
        hashSet.add((byte) 2);
        hashSet.add((byte) 9);
        hashSet.add((byte) 26);
        hashSet.add((byte) 20);
        hashSet.add((byte) 13);
        hashSet.add((byte) 29);
        hashSet.add((byte) 1);
        hashSet.add((byte) 25);
        if (this.A03.A1a()) {
            hashSet.add((byte) 3);
            hashSet.add((byte) 28);
        }
        return hashSet;
    }
}
