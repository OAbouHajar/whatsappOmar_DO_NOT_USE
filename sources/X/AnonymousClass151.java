package X;

import android.content.ContentValues;
import com.whatsapp.util.Log;
import java.util.Map;

/* renamed from: X.151  reason: invalid class name */
public class AnonymousClass151 {
    public Map A00;
    public final C16440t3 A01;
    public final C16920ts A02;
    public final C15810rt A03;
    public final C216314v A04;
    public final C16900tq A05;
    public final AnonymousClass11I A06;
    public final AnonymousClass17C A07;

    public AnonymousClass151(C16440t3 r1, C16920ts r2, C15810rt r3, C216314v r4, C16900tq r5, AnonymousClass11I r6, AnonymousClass17C r7) {
        this.A01 = r1;
        this.A04 = r4;
        this.A02 = r2;
        this.A03 = r3;
        this.A06 = r6;
        this.A07 = r7;
        this.A05 = r5;
    }

    public static final void A00(C16800tf r4, C15830rv r5, byte b2, int i2) {
        ContentValues contentValues = new ContentValues(1);
        contentValues.put("jid", r5.getRawString());
        contentValues.put("type", Byte.valueOf(b2));
        contentValues.put("message_count", Integer.valueOf(i2));
        if (r4.A02.A02(contentValues, "frequents") == -1) {
            StringBuilder sb = new StringBuilder("frequentMessageStore/insertFrequents/failed jid=");
            sb.append(r5);
            sb.append(" type=");
            sb.append(b2);
            Log.e(sb.toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0050, code lost:
        if (r7 == 43) goto L_0x0052;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List A01(X.C42631y9 r10) {
        /*
            r9 = this;
            java.util.Map r0 = r9.A02()
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r8 = r0.iterator()
        L_0x0011:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0076
            java.lang.Object r1 = r8.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r0 = r1.getKey()
            X.1y8 r0 = (X.AnonymousClass1y8) r0
            X.0rv r4 = r0.A01
            java.lang.Object r0 = r1.getKey()
            X.1y8 r0 = (X.AnonymousClass1y8) r0
            byte r7 = r0.A00
            java.lang.Object r0 = r1.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r6 = r0.intValue()
            if (r10 == 0) goto L_0x0054
            int r3 = r10.A00
            int r2 = r10.A01
            int r1 = r10.A02
            r0 = 1
            if (r7 == r0) goto L_0x0053
            r0 = 3
            if (r7 == r0) goto L_0x0052
            r0 = 13
            if (r7 == r0) goto L_0x0074
            r0 = 42
            if (r7 == r0) goto L_0x0053
            r0 = 43
            r3 = 1
            if (r7 != r0) goto L_0x0053
        L_0x0052:
            r3 = r1
        L_0x0053:
            int r6 = r6 * r3
        L_0x0054:
            if (r6 == 0) goto L_0x0011
            java.lang.Object r2 = r5.get(r4)
            X.1pw r2 = (X.C37911pw) r2
            if (r2 != 0) goto L_0x006b
            X.1pw r2 = new X.1pw
            r2.<init>()
            X.0rt r0 = r9.A03
            long r0 = r0.A05(r4)
            r2.A01 = r0
        L_0x006b:
            int r0 = r2.A00
            int r0 = r0 + r6
            r2.A00 = r0
            r5.put(r4, r2)
            goto L_0x0011
        L_0x0074:
            r3 = r2
            goto L_0x0053
        L_0x0076:
            java.util.Set r0 = r5.entrySet()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r0)
            r1 = 18
            com.facebook.redex.IDxComparatorShape19S0000000_2_I0 r0 = new com.facebook.redex.IDxComparatorShape19S0000000_2_I0
            r0.<init>(r1)
            java.util.Collections.sort(r2, r0)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x0092:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00af
            java.lang.Object r1 = r2.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r0 = r1.getKey()
            r3.add(r0)
            r1.getKey()
            r1.getValue()
            r1.getValue()
            goto L_0x0092
        L_0x00af:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass151.A01(X.1y9):java.util.List");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x00af */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:24:0x00a5=Splitter:B:24:0x00a5, B:30:0x00af=Splitter:B:30:0x00af} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Map A02() {
        /*
            r9 = this;
            java.util.Map r0 = r9.A00
            if (r0 != 0) goto L_0x00b8
            boolean r1 = r9.A06()
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r9.A00 = r0
            X.0tq r0 = r9.A05
            X.0tf r5 = r0.get()
            if (r1 == 0) goto L_0x0061
            X.0tg r2 = r5.A02     // Catch:{ all -> 0x00b0 }
            java.lang.String r1 = "SELECT jid_row_id, type, message_count FROM frequent"
            r0 = 0
            android.database.Cursor r6 = r2.A08(r1, r0)     // Catch:{ all -> 0x00b0 }
            java.lang.String r0 = "jid_row_id"
            int r7 = r6.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00a9 }
            java.lang.String r0 = "type"
            int r4 = r6.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00a9 }
            java.lang.String r0 = "message_count"
            int r3 = r6.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00a9 }
        L_0x0033:
            boolean r0 = r6.moveToNext()     // Catch:{ all -> 0x00a9 }
            if (r0 == 0) goto L_0x00a5
            long r1 = r6.getLong(r7)     // Catch:{ all -> 0x00a9 }
            X.14v r8 = r9.A04     // Catch:{ all -> 0x00a9 }
            java.lang.Class<X.0rv> r0 = X.C15830rv.class
            com.whatsapp.jid.Jid r1 = r8.A07(r0, r1)     // Catch:{ all -> 0x00a9 }
            X.0rv r1 = (X.C15830rv) r1     // Catch:{ all -> 0x00a9 }
            if (r1 == 0) goto L_0x0033
            int r0 = r6.getInt(r4)     // Catch:{ all -> 0x00a9 }
            byte r0 = (byte) r0     // Catch:{ all -> 0x00a9 }
            X.1y8 r2 = new X.1y8     // Catch:{ all -> 0x00a9 }
            r2.<init>(r1, r0)     // Catch:{ all -> 0x00a9 }
            java.util.Map r1 = r9.A00     // Catch:{ all -> 0x00a9 }
            int r0 = r6.getInt(r3)     // Catch:{ all -> 0x00a9 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x00a9 }
            r1.put(r2, r0)     // Catch:{ all -> 0x00a9 }
            goto L_0x0033
        L_0x0061:
            X.0tg r2 = r5.A02     // Catch:{ all -> 0x00b0 }
            java.lang.String r1 = "SELECT jid, type, message_count FROM frequents"
            r0 = 0
            android.database.Cursor r6 = r2.A08(r1, r0)     // Catch:{ all -> 0x00b0 }
            java.lang.String r0 = "jid"
            int r7 = r6.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00a9 }
            java.lang.String r0 = "type"
            int r4 = r6.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00a9 }
            java.lang.String r0 = "message_count"
            int r3 = r6.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00a9 }
        L_0x007d:
            boolean r0 = r6.moveToNext()     // Catch:{ all -> 0x00a9 }
            if (r0 == 0) goto L_0x00a5
            java.lang.String r0 = r6.getString(r7)     // Catch:{ all -> 0x00a9 }
            X.0rv r1 = X.C15830rv.A02(r0)     // Catch:{ all -> 0x00a9 }
            if (r1 == 0) goto L_0x007d
            int r0 = r6.getInt(r4)     // Catch:{ all -> 0x00a9 }
            byte r0 = (byte) r0     // Catch:{ all -> 0x00a9 }
            X.1y8 r2 = new X.1y8     // Catch:{ all -> 0x00a9 }
            r2.<init>(r1, r0)     // Catch:{ all -> 0x00a9 }
            java.util.Map r1 = r9.A00     // Catch:{ all -> 0x00a9 }
            int r0 = r6.getInt(r3)     // Catch:{ all -> 0x00a9 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x00a9 }
            r1.put(r2, r0)     // Catch:{ all -> 0x00a9 }
            goto L_0x007d
        L_0x00a5:
            r6.close()     // Catch:{ all -> 0x00b0 }
            goto L_0x00b5
        L_0x00a9:
            r0 = move-exception
            if (r6 == 0) goto L_0x00af
            r6.close()     // Catch:{ all -> 0x00af }
        L_0x00af:
            throw r0     // Catch:{ all -> 0x00b0 }
        L_0x00b0:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x00b4 }
        L_0x00b4:
            throw r0
        L_0x00b5:
            r5.close()
        L_0x00b8:
            java.util.Map r0 = r9.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass151.A02():java.util.Map");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x004b, code lost:
        if (r15 <= r17) goto L_0x004d;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:58:0x0180 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03() {
        /*
            r19 = this;
            java.lang.String r5 = "frequents"
            r9 = 0
            X.1Zf r4 = new X.1Zf
            r4.<init>((boolean) r9)
            java.lang.String r0 = "frequentmsgstore/updateFrequents"
            r4.A04(r0)
            r7 = r19
            X.0tq r0 = r7.A05
            X.0tf r3 = r0.A02()
            X.0tg r11 = r3.A02     // Catch:{ all -> 0x0181 }
            X.0t3 r6 = r7.A01     // Catch:{ all -> 0x0181 }
            long r17 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0181 }
            r0 = 691200000(0x2932e000, double:3.414981744E-315)
            long r17 = r17 - r0
            r0 = 0
            java.lang.String r2 = "SELECT sort_id, received_timestamp FROM available_message_view ORDER BY sort_id DESC LIMIT 4096"
            r8 = 0
            android.database.Cursor r14 = r11.A08(r2, r8)     // Catch:{ all -> 0x0181 }
            java.lang.String r2 = "received_timestamp"
            int r13 = r14.getColumnIndexOrThrow(r2)     // Catch:{ all -> 0x017a }
            java.lang.String r2 = "sort_id"
            int r10 = r14.getColumnIndexOrThrow(r2)     // Catch:{ all -> 0x017a }
            r12 = 0
        L_0x0039:
            boolean r2 = r14.moveToNext()     // Catch:{ all -> 0x017a }
            if (r2 == 0) goto L_0x004d
            long r15 = r14.getLong(r13)     // Catch:{ all -> 0x017a }
            long r0 = r14.getLong(r10)     // Catch:{ all -> 0x017a }
            int r12 = r12 + 1
            int r2 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r2 > 0) goto L_0x0039
        L_0x004d:
            r14.close()     // Catch:{ all -> 0x0181 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x0181 }
            r10.<init>()     // Catch:{ all -> 0x0181 }
            java.lang.String r2 = "frequentmsgstore/updateFrequents/start sort_id:"
            r10.append(r2)     // Catch:{ all -> 0x0181 }
            r10.append(r0)     // Catch:{ all -> 0x0181 }
            java.lang.String r2 = " "
            r10.append(r2)     // Catch:{ all -> 0x0181 }
            r10.append(r12)     // Catch:{ all -> 0x0181 }
            java.lang.String r2 = r10.toString()     // Catch:{ all -> 0x0181 }
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ all -> 0x0181 }
            r2 = 2
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch:{ all -> 0x0181 }
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x0181 }
            r2[r9] = r0     // Catch:{ all -> 0x0181 }
            r0 = 6
            java.lang.String r0 = java.lang.Integer.toString(r0)     // Catch:{ all -> 0x0181 }
            r10 = 1
            r2[r10] = r0     // Catch:{ all -> 0x0181 }
            java.util.HashMap r9 = new java.util.HashMap     // Catch:{ all -> 0x0181 }
            r9.<init>()     // Catch:{ all -> 0x0181 }
            java.lang.String r0 = "SELECT chat_row_id, message_type FROM available_message_view WHERE sort_id >= ? AND from_me = 1 AND status != ?"
            android.database.Cursor r2 = r11.A08(r0, r2)     // Catch:{ all -> 0x0181 }
            java.lang.String r0 = "message_type"
            int r12 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0173 }
        L_0x008e:
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0173 }
            if (r0 == 0) goto L_0x00c7
            X.0ts r0 = r7.A02     // Catch:{ all -> 0x0173 }
            X.0rv r13 = r0.A06(r2)     // Catch:{ all -> 0x0173 }
            if (r13 == 0) goto L_0x008e
            boolean r0 = X.C16030sJ.A0Q(r13)     // Catch:{ all -> 0x0173 }
            if (r0 != 0) goto L_0x008e
            int r0 = r2.getInt(r12)     // Catch:{ all -> 0x0173 }
            byte r0 = (byte) r0     // Catch:{ all -> 0x0173 }
            X.1y8 r1 = new X.1y8     // Catch:{ all -> 0x0173 }
            r1.<init>(r13, r0)     // Catch:{ all -> 0x0173 }
            java.lang.Object r0 = r9.get(r1)     // Catch:{ all -> 0x0173 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x0173 }
            if (r0 != 0) goto L_0x00bc
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0173 }
        L_0x00b8:
            r9.put(r1, r0)     // Catch:{ all -> 0x0173 }
            goto L_0x008e
        L_0x00bc:
            int r0 = r0.intValue()     // Catch:{ all -> 0x0173 }
            int r0 = r0 + 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0173 }
            goto L_0x00b8
        L_0x00c7:
            r2.close()     // Catch:{ all -> 0x0181 }
            r9.size()     // Catch:{ all -> 0x0181 }
            X.1cj r14 = r3.A00()     // Catch:{ all -> 0x0181 }
            r11.A01(r5, r8, r8)     // Catch:{ all -> 0x016e }
            boolean r0 = r7.A06()     // Catch:{ all -> 0x016e }
            if (r0 != 0) goto L_0x00e8
            X.11I r12 = r7.A06     // Catch:{ all -> 0x016e }
            java.lang.String r2 = "migration_frequent_index"
            r0 = 0
            long r12 = r12.A01(r2, r0)     // Catch:{ all -> 0x016e }
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x00ed
        L_0x00e8:
            java.lang.String r0 = "frequent"
            r11.A01(r0, r8, r8)     // Catch:{ all -> 0x016e }
        L_0x00ed:
            java.util.Set r0 = r9.entrySet()     // Catch:{ all -> 0x016e }
            java.util.Iterator r11 = r0.iterator()     // Catch:{ all -> 0x016e }
        L_0x00f5:
            boolean r0 = r11.hasNext()     // Catch:{ all -> 0x016e }
            if (r0 == 0) goto L_0x011f
            java.lang.Object r8 = r11.next()     // Catch:{ all -> 0x016e }
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8     // Catch:{ all -> 0x016e }
            java.lang.Object r0 = r8.getKey()     // Catch:{ all -> 0x016e }
            X.1y8 r0 = (X.AnonymousClass1y8) r0     // Catch:{ all -> 0x016e }
            X.0rv r2 = r0.A01     // Catch:{ all -> 0x016e }
            java.lang.Object r0 = r8.getKey()     // Catch:{ all -> 0x016e }
            X.1y8 r0 = (X.AnonymousClass1y8) r0     // Catch:{ all -> 0x016e }
            byte r1 = r0.A00     // Catch:{ all -> 0x016e }
            java.lang.Object r0 = r8.getValue()     // Catch:{ all -> 0x016e }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x016e }
            int r0 = r0.intValue()     // Catch:{ all -> 0x016e }
            A00(r3, r2, r1, r0)     // Catch:{ all -> 0x016e }
            goto L_0x00f5
        L_0x011f:
            java.util.Set r0 = r9.entrySet()     // Catch:{ all -> 0x016e }
            java.util.Iterator r11 = r0.iterator()     // Catch:{ all -> 0x016e }
        L_0x0127:
            boolean r0 = r11.hasNext()     // Catch:{ all -> 0x016e }
            if (r0 == 0) goto L_0x0151
            java.lang.Object r8 = r11.next()     // Catch:{ all -> 0x016e }
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8     // Catch:{ all -> 0x016e }
            java.lang.Object r0 = r8.getKey()     // Catch:{ all -> 0x016e }
            X.1y8 r0 = (X.AnonymousClass1y8) r0     // Catch:{ all -> 0x016e }
            X.0rv r2 = r0.A01     // Catch:{ all -> 0x016e }
            java.lang.Object r0 = r8.getKey()     // Catch:{ all -> 0x016e }
            X.1y8 r0 = (X.AnonymousClass1y8) r0     // Catch:{ all -> 0x016e }
            byte r1 = r0.A00     // Catch:{ all -> 0x016e }
            java.lang.Object r0 = r8.getValue()     // Catch:{ all -> 0x016e }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x016e }
            int r0 = r0.intValue()     // Catch:{ all -> 0x016e }
            r7.A05(r2, r1, r0, r10)     // Catch:{ all -> 0x016e }
            goto L_0x0127
        L_0x0151:
            r14.A00()     // Catch:{ all -> 0x016e }
            r14.close()     // Catch:{ all -> 0x0181 }
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap     // Catch:{ all -> 0x0181 }
            r0.<init>(r9)     // Catch:{ all -> 0x0181 }
            r7.A00 = r0     // Catch:{ all -> 0x0181 }
            X.11I r2 = r7.A06     // Catch:{ all -> 0x0181 }
            long r0 = r6.A00()     // Catch:{ all -> 0x0181 }
            r2.A05(r5, r0)     // Catch:{ all -> 0x0181 }
            r3.close()
            r4.A01()
            return
        L_0x016e:
            r0 = move-exception
            r14.close()     // Catch:{ all -> 0x0180 }
            goto L_0x0180
        L_0x0173:
            r0 = move-exception
            if (r2 == 0) goto L_0x0180
            r2.close()     // Catch:{ all -> 0x0180 }
            goto L_0x0180
        L_0x017a:
            r0 = move-exception
            if (r14 == 0) goto L_0x0180
            r14.close()     // Catch:{ all -> 0x0180 }
        L_0x0180:
            throw r0     // Catch:{ all -> 0x0181 }
        L_0x0181:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0185 }
        L_0x0185:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass151.A03():void");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0091 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04(X.C15830rv r9) {
        /*
            r8 = this;
            X.0tq r0 = r8.A05
            X.0tf r4 = r0.A02()
            X.1cj r7 = r4.A00()     // Catch:{ all -> 0x0092 }
            X.0tg r6 = r4.A02     // Catch:{ all -> 0x008d }
            java.lang.String r5 = "frequents"
            java.lang.String r3 = "jid = ?"
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x008d }
            r1 = 0
            java.lang.String r0 = r9.getRawString()     // Catch:{ all -> 0x008d }
            r2[r1] = r0     // Catch:{ all -> 0x008d }
            r6.A01(r5, r3, r2)     // Catch:{ all -> 0x008d }
            boolean r0 = r8.A06()     // Catch:{ all -> 0x008d }
            if (r0 != 0) goto L_0x0031
            X.11I r3 = r8.A06     // Catch:{ all -> 0x008d }
            java.lang.String r0 = "migration_frequent_index"
            r1 = 0
            long r5 = r3.A01(r0, r1)     // Catch:{ all -> 0x008d }
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0046
        L_0x0031:
            X.14v r0 = r8.A04     // Catch:{ all -> 0x008d }
            long r2 = r0.A01(r9)     // Catch:{ all -> 0x008d }
            X.17C r1 = r8.A07     // Catch:{ all -> 0x008d }
            java.lang.String r0 = "DELETE FROM frequent WHERE jid_row_id = ?"
            X.1ou r1 = r1.A00(r0)     // Catch:{ all -> 0x008d }
            r0 = 1
            r1.A01(r0, r2)     // Catch:{ all -> 0x008d }
            r1.A00()     // Catch:{ all -> 0x008d }
        L_0x0046:
            r7.A00()     // Catch:{ all -> 0x008d }
            r7.close()     // Catch:{ all -> 0x0092 }
            r4.close()
            java.util.Map r0 = r8.A00
            if (r0 == 0) goto L_0x008c
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r2 = r0.iterator()
        L_0x0060:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0078
            java.lang.Object r1 = r2.next()
            X.1y8 r1 = (X.AnonymousClass1y8) r1
            X.0rv r0 = r1.A01
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0060
            r3.add(r1)
            goto L_0x0060
        L_0x0078:
            java.util.Iterator r2 = r3.iterator()
        L_0x007c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x008c
            java.lang.Object r1 = r2.next()
            java.util.Map r0 = r8.A00
            r0.remove(r1)
            goto L_0x007c
        L_0x008c:
            return
        L_0x008d:
            r0 = move-exception
            r7.close()     // Catch:{ all -> 0x0091 }
        L_0x0091:
            throw r0     // Catch:{ all -> 0x0092 }
        L_0x0092:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0096 }
        L_0x0096:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass151.A04(X.0rv):void");
    }

    public final void A05(C15830rv r9, byte b2, int i2, boolean z2) {
        if (A06() || this.A06.A01("migration_frequent_index", 0) > 0) {
            long A012 = this.A04.A01(r9);
            if (!z2) {
                C37281ou A002 = this.A07.A00("UPDATE frequent   SET message_count = ? WHERE jid_row_id = ? AND type = ?");
                A002.A01(2, A012);
                A002.A01(3, (long) b2);
                A002.A01(1, (long) i2);
                if (A002.A00.executeUpdateDelete() == 1) {
                    return;
                }
            }
            if (A06()) {
                C37281ou A003 = this.A07.A00("INSERT INTO frequent(jid_row_id, type, message_count) VALUES (?, ?, ?)");
                A003.A01(1, A012);
                A003.A01(2, (long) b2);
                A003.A01(3, (long) i2);
                if (A003.A00.executeInsert() == -1) {
                    StringBuilder sb = new StringBuilder("frequentMessageStore/insertOrUpdateFrequent/failed jid=");
                    sb.append(r9);
                    sb.append(" type=");
                    sb.append(b2);
                    Log.e(sb.toString());
                }
            }
        }
    }

    public boolean A06() {
        return this.A04.A0C() && this.A06.A01("frequent_ready", 0) == 1;
    }
}
