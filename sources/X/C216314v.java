package X;

import android.database.Cursor;
import android.text.TextUtils;
import com.facebook.redex.RunnableRunnableShape0S0200100_I0;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.14v  reason: invalid class name and case insensitive filesystem */
public class C216314v {
    public final C16300so A00;
    public final C16900tq A01;
    public final AnonymousClass11I A02;
    public final Map A03 = new ConcurrentHashMap();
    public final Map A04 = new ConcurrentHashMap();

    public C216314v(C16300so r2, C16900tq r3, AnonymousClass11I r4) {
        this.A00 = r2;
        this.A02 = r4;
        this.A01 = r3;
    }

    public static final void A00(String str, String str2, String str3, String str4, int i2, int i3, int i4) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" user=");
        sb.append(str2);
        sb.append(" server=");
        sb.append(str3);
        sb.append(" agent=");
        sb.append(i2);
        sb.append(" device=");
        sb.append(i3);
        sb.append(" type=");
        sb.append(i4);
        sb.append(" rawString=");
        sb.append(str4);
        Log.e(sb.toString());
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:58|61|62|63|64) */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x023a, code lost:
        if (r6 == null) goto L_0x023f;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:63:0x023f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:83:0x02a1 */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0231 A[Catch:{ SQLiteConstraintException -> 0x00bf, all -> 0x029d, all -> 0x0239, all -> 0x0237 }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:51:0x022c=Splitter:B:51:0x022c, B:63:0x023f=Splitter:B:63:0x023f} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long A01(com.whatsapp.jid.Jid r25) {
        /*
            r24 = this;
            java.lang.String r14 = "jid"
            java.lang.String r23 = "raw_string"
            java.lang.String r22 = "type"
            java.lang.String r13 = "device"
            java.lang.String r12 = "agent"
            java.lang.String r11 = "server"
            java.lang.String r9 = "user"
            r8 = r24
            java.util.Map r0 = r8.A03
            r10 = r25
            java.lang.Object r0 = r0.get(r10)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x0024
            long r0 = r0.longValue()
            return r0
        L_0x0024:
            java.lang.String r0 = r10.user
            r1 = -1
            if (r0 != 0) goto L_0x003c
            java.lang.String r3 = "JidStore/getRowIdForJid/Error creating a valid Jid object; jid="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r3)
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return r1
        L_0x003c:
            X.0tq r0 = r8.A01
            X.0tf r7 = r0.A02()
            long r0 = r8.A02(r10)     // Catch:{ all -> 0x02a2 }
            java.lang.String r21 = "; rowId="
            r17 = 0
            int r2 = (r0 > r17 ? 1 : (r0 == r17 ? 0 : -1))
            if (r2 <= 0) goto L_0x006d
            X.0tg r2 = r7.A02     // Catch:{ all -> 0x02a2 }
            android.database.sqlite.SQLiteDatabase r2 = r2.A00     // Catch:{ all -> 0x02a2 }
            boolean r2 = r2.inTransaction()     // Catch:{ all -> 0x02a2 }
            if (r2 == 0) goto L_0x0066
            r14 = 5
            com.facebook.redex.RunnableRunnableShape0S0200100_I0 r2 = new com.facebook.redex.RunnableRunnableShape0S0200100_I0     // Catch:{ all -> 0x02a2 }
            r11 = r2
            r12 = r8
            r13 = r10
            r15 = r0
            r11.<init>(r12, r13, r14, r15)     // Catch:{ all -> 0x02a2 }
            r7.A03(r2)     // Catch:{ all -> 0x02a2 }
            goto L_0x0069
        L_0x0066:
            r8.A0B(r10, r0)     // Catch:{ all -> 0x02a2 }
        L_0x0069:
            r7.close()
            return r0
        L_0x006d:
            X.1cj r20 = r7.A01()     // Catch:{ all -> 0x02a2 }
            long r1 = r8.A02(r10)     // Catch:{ all -> 0x029d }
            int r0 = (r1 > r17 ? 1 : (r1 == r17 ? 0 : -1))
            if (r0 > 0) goto L_0x025d
            r0 = 6
            android.content.ContentValues r3 = new android.content.ContentValues     // Catch:{ SQLiteConstraintException -> 0x00bf }
            r3.<init>(r0)     // Catch:{ SQLiteConstraintException -> 0x00bf }
            java.lang.String r0 = r10.user     // Catch:{ SQLiteConstraintException -> 0x00bf }
            r3.put(r9, r0)     // Catch:{ SQLiteConstraintException -> 0x00bf }
            java.lang.String r0 = r10.getServer()     // Catch:{ SQLiteConstraintException -> 0x00bf }
            r3.put(r11, r0)     // Catch:{ SQLiteConstraintException -> 0x00bf }
            int r0 = r10.getAgent()     // Catch:{ SQLiteConstraintException -> 0x00bf }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ SQLiteConstraintException -> 0x00bf }
            r3.put(r12, r0)     // Catch:{ SQLiteConstraintException -> 0x00bf }
            int r0 = r10.getDevice()     // Catch:{ SQLiteConstraintException -> 0x00bf }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ SQLiteConstraintException -> 0x00bf }
            r3.put(r13, r0)     // Catch:{ SQLiteConstraintException -> 0x00bf }
            int r0 = r10.getType()     // Catch:{ SQLiteConstraintException -> 0x00bf }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)     // Catch:{ SQLiteConstraintException -> 0x00bf }
            r0 = r22
            r3.put(r0, r4)     // Catch:{ SQLiteConstraintException -> 0x00bf }
            java.lang.String r4 = r10.getRawString()     // Catch:{ SQLiteConstraintException -> 0x00bf }
            r0 = r23
            r3.put(r0, r4)     // Catch:{ SQLiteConstraintException -> 0x00bf }
            X.0tg r0 = r7.A02     // Catch:{ SQLiteConstraintException -> 0x00bf }
            long r1 = r0.A03(r3, r14)     // Catch:{ SQLiteConstraintException -> 0x00bf }
            goto L_0x025d
        L_0x00bf:
            r19 = move-exception
            X.0tg r0 = r7.A02     // Catch:{ all -> 0x029d }
            java.lang.String r5 = "SELECT _id, user, server, agent, device, type, raw_string FROM jid WHERE raw_string = ?"
            r3 = 1
            java.lang.String[] r4 = new java.lang.String[r3]     // Catch:{ all -> 0x029d }
            java.lang.String r6 = r10.getRawString()     // Catch:{ all -> 0x029d }
            r3 = 0
            r4[r3] = r6     // Catch:{ all -> 0x029d }
            android.database.Cursor r6 = r0.A08(r5, r4)     // Catch:{ all -> 0x029d }
            boolean r3 = r6.moveToLast()     // Catch:{ all -> 0x0239 }
            if (r3 == 0) goto L_0x0211
            java.lang.String r3 = "_id"
            int r3 = r6.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x0237 }
            long r4 = r6.getLong(r3)     // Catch:{ all -> 0x0237 }
            java.util.Map r15 = r8.A04     // Catch:{ all -> 0x0237 }
            java.lang.Long r3 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x0237 }
            boolean r16 = r15.containsKey(r3)     // Catch:{ all -> 0x0237 }
            com.whatsapp.jid.Jid r3 = r8.A03(r4)     // Catch:{ all -> 0x0237 }
            java.lang.String r15 = "; errorRowId="
            if (r3 == 0) goto L_0x01e7
            int r14 = r6.getColumnIndexOrThrow(r13)     // Catch:{ all -> 0x0237 }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x0237 }
            r13.<init>()     // Catch:{ all -> 0x0237 }
            java.lang.String r0 = "JidStore/getRowIdForJid/raw_string UNIQUE constraint failed; jid="
            r13.append(r0)     // Catch:{ all -> 0x0237 }
            java.lang.String r0 = r10.getRawString()     // Catch:{ all -> 0x0237 }
            r13.append(r0)     // Catch:{ all -> 0x0237 }
            java.lang.String r0 = "; db.user="
            r13.append(r0)     // Catch:{ all -> 0x0237 }
            int r0 = r6.getColumnIndexOrThrow(r9)     // Catch:{ all -> 0x0237 }
            java.lang.String r0 = r6.getString(r0)     // Catch:{ all -> 0x0237 }
            r13.append(r0)     // Catch:{ all -> 0x0237 }
            java.lang.String r0 = "; db.server="
            r13.append(r0)     // Catch:{ all -> 0x0237 }
            int r0 = r6.getColumnIndexOrThrow(r11)     // Catch:{ all -> 0x0237 }
            java.lang.String r0 = r6.getString(r0)     // Catch:{ all -> 0x0237 }
            r13.append(r0)     // Catch:{ all -> 0x0237 }
            java.lang.String r0 = "; db.agent="
            r13.append(r0)     // Catch:{ all -> 0x0237 }
            int r0 = r6.getColumnIndexOrThrow(r12)     // Catch:{ all -> 0x0237 }
            int r0 = r6.getInt(r0)     // Catch:{ all -> 0x0237 }
            r13.append(r0)     // Catch:{ all -> 0x0237 }
            java.lang.String r0 = "; db.device="
            r13.append(r0)     // Catch:{ all -> 0x0237 }
            boolean r0 = r6.isNull(r14)     // Catch:{ all -> 0x0237 }
            if (r0 == 0) goto L_0x01dd
            java.lang.String r0 = "<null>"
        L_0x0146:
            r13.append(r0)     // Catch:{ all -> 0x0237 }
            java.lang.String r0 = "; db.type="
            r13.append(r0)     // Catch:{ all -> 0x0237 }
            r0 = r22
            int r0 = r6.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0237 }
            int r0 = r6.getInt(r0)     // Catch:{ all -> 0x0237 }
            r13.append(r0)     // Catch:{ all -> 0x0237 }
            java.lang.String r0 = "; db.raw_string="
            r13.append(r0)     // Catch:{ all -> 0x0237 }
            r0 = r23
            int r0 = r6.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0237 }
            java.lang.String r0 = r6.getString(r0)     // Catch:{ all -> 0x0237 }
            r13.append(r0)     // Catch:{ all -> 0x0237 }
            r13.append(r15)     // Catch:{ all -> 0x0237 }
            r13.append(r4)     // Catch:{ all -> 0x0237 }
            java.lang.String r0 = "; inCache="
            r13.append(r0)     // Catch:{ all -> 0x0237 }
            r0 = r16
            r13.append(r0)     // Catch:{ all -> 0x0237 }
            java.lang.String r0 = "; jidFromDb.user="
            r13.append(r0)     // Catch:{ all -> 0x0237 }
            java.lang.String r0 = r3.user     // Catch:{ all -> 0x0237 }
            r13.append(r0)     // Catch:{ all -> 0x0237 }
            java.lang.String r0 = "; jidFromDb.server="
            r13.append(r0)     // Catch:{ all -> 0x0237 }
            java.lang.String r0 = r3.getServer()     // Catch:{ all -> 0x0237 }
            r13.append(r0)     // Catch:{ all -> 0x0237 }
            java.lang.String r0 = "; jidFromDb.agent="
            r13.append(r0)     // Catch:{ all -> 0x0237 }
            int r0 = r3.getAgent()     // Catch:{ all -> 0x0237 }
            r13.append(r0)     // Catch:{ all -> 0x0237 }
            java.lang.String r0 = "; jidFromDb.device="
            r13.append(r0)     // Catch:{ all -> 0x0237 }
            int r0 = r3.getDevice()     // Catch:{ all -> 0x0237 }
            r13.append(r0)     // Catch:{ all -> 0x0237 }
            java.lang.String r0 = "; jidFromDb.type="
            r13.append(r0)     // Catch:{ all -> 0x0237 }
            int r0 = r3.getType()     // Catch:{ all -> 0x0237 }
            r13.append(r0)     // Catch:{ all -> 0x0237 }
            java.lang.String r0 = "; jidFromDb.raw_string="
            r13.append(r0)     // Catch:{ all -> 0x0237 }
            java.lang.String r0 = r3.getRawString()     // Catch:{ all -> 0x0237 }
            r13.append(r0)     // Catch:{ all -> 0x0237 }
            java.lang.String r0 = "; matchingJid="
            r13.append(r0)     // Catch:{ all -> 0x0237 }
            boolean r0 = r10.equals(r3)     // Catch:{ all -> 0x0237 }
            r13.append(r0)     // Catch:{ all -> 0x0237 }
            java.lang.String r0 = r13.toString()     // Catch:{ all -> 0x0237 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0237 }
            boolean r0 = r10.equals(r3)     // Catch:{ all -> 0x0237 }
            if (r0 == 0) goto L_0x022b
            goto L_0x022a
        L_0x01dd:
            int r0 = r6.getInt(r14)     // Catch:{ all -> 0x0237 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0237 }
            goto L_0x0146
        L_0x01e7:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x0237 }
            r9.<init>()     // Catch:{ all -> 0x0237 }
            java.lang.String r3 = "JidStore/getRowIdForJid/raw_string UNIQUE constraint failed, but jid not found by row_id; jid="
            r9.append(r3)     // Catch:{ all -> 0x0237 }
            r9.append(r10)     // Catch:{ all -> 0x0237 }
            r9.append(r15)     // Catch:{ all -> 0x0237 }
            r9.append(r4)     // Catch:{ all -> 0x0237 }
            java.lang.String r3 = r9.toString()     // Catch:{ all -> 0x0237 }
            com.whatsapp.util.Log.e((java.lang.String) r3)     // Catch:{ all -> 0x0237 }
            java.lang.String r11 = "raw_string = ?"
            r9 = 1
            java.lang.String[] r5 = new java.lang.String[r9]     // Catch:{ all -> 0x0237 }
            java.lang.String r4 = r10.getRawString()     // Catch:{ all -> 0x0237 }
            r3 = 0
            r5[r3] = r4     // Catch:{ all -> 0x0237 }
            r0.A01(r14, r11, r5)     // Catch:{ all -> 0x0237 }
            goto L_0x022c
        L_0x0211:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0237 }
            r3.<init>()     // Catch:{ all -> 0x0237 }
            java.lang.String r0 = "JidStore/getRowIdForJid/raw_string UNIQUE constraint failed, but jid not found by raw_string; jid="
            r3.append(r0)     // Catch:{ all -> 0x0237 }
            java.lang.String r0 = r10.getRawString()     // Catch:{ all -> 0x0237 }
            r3.append(r0)     // Catch:{ all -> 0x0237 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x0237 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0237 }
            goto L_0x022b
        L_0x022a:
            r1 = r4
        L_0x022b:
            r9 = 0
        L_0x022c:
            r6.close()     // Catch:{ all -> 0x029d }
            if (r9 != 0) goto L_0x025d
            int r0 = (r1 > r17 ? 1 : (r1 == r17 ? 0 : -1))
            if (r0 <= 0) goto L_0x0236
            goto L_0x0240
        L_0x0236:
            throw r19     // Catch:{ all -> 0x029d }
        L_0x0237:
            r0 = move-exception
            goto L_0x023c
        L_0x0239:
            r0 = move-exception
            if (r6 == 0) goto L_0x023f
        L_0x023c:
            r6.close()     // Catch:{ all -> 0x023f }
        L_0x023f:
            throw r0     // Catch:{ all -> 0x029d }
        L_0x0240:
            X.0so r5 = r8.A00     // Catch:{ all -> 0x029d }
            java.lang.String r4 = "JidStore/raw_string-constraint-failed"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x029d }
            r3.<init>()     // Catch:{ all -> 0x029d }
            java.lang.String r0 = "jid found by raws string; jid="
            r3.append(r0)     // Catch:{ all -> 0x029d }
            java.lang.String r0 = r10.getRawString()     // Catch:{ all -> 0x029d }
            r3.append(r0)     // Catch:{ all -> 0x029d }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x029d }
            r0 = 0
            r5.AcB(r4, r3, r0)     // Catch:{ all -> 0x029d }
        L_0x025d:
            r20.A00()     // Catch:{ all -> 0x029d }
            int r0 = (r1 > r17 ? 1 : (r1 == r17 ? 0 : -1))
            if (r0 > 0) goto L_0x0289
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x029d }
            r3.<init>()     // Catch:{ all -> 0x029d }
            java.lang.String r0 = "JidStore/getRowIdForJid/Error inserting jid; jid="
            r3.append(r0)     // Catch:{ all -> 0x029d }
            r3.append(r10)     // Catch:{ all -> 0x029d }
            r0 = r21
            r3.append(r0)     // Catch:{ all -> 0x029d }
            r3.append(r1)     // Catch:{ all -> 0x029d }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x029d }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x029d }
            r20.close()     // Catch:{ all -> 0x02a2 }
            r7.close()
            r0 = -1
            return r0
        L_0x0289:
            r14 = 4
            com.facebook.redex.RunnableRunnableShape0S0200100_I0 r0 = new com.facebook.redex.RunnableRunnableShape0S0200100_I0     // Catch:{ all -> 0x029d }
            r11 = r0
            r12 = r8
            r13 = r10
            r15 = r1
            r11.<init>(r12, r13, r14, r15)     // Catch:{ all -> 0x029d }
            r7.A03(r0)     // Catch:{ all -> 0x029d }
            r20.close()     // Catch:{ all -> 0x02a2 }
            r7.close()
            return r1
        L_0x029d:
            r0 = move-exception
            r20.close()     // Catch:{ all -> 0x02a1 }
        L_0x02a1:
            throw r0     // Catch:{ all -> 0x02a2 }
        L_0x02a2:
            r0 = move-exception
            r7.close()     // Catch:{ all -> 0x02a6 }
        L_0x02a6:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C216314v.A01(com.whatsapp.jid.Jid):long");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0098 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:25:0x0098=Splitter:B:25:0x0098, B:17:0x008b=Splitter:B:17:0x008b} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long A02(com.whatsapp.jid.Jid r14) {
        /*
            r13 = this;
            X.0tq r0 = r13.A01
            X.0tf r4 = r0.A02()
            boolean r0 = r14 instanceof com.whatsapp.jid.DeviceJid     // Catch:{ all -> 0x0099 }
            java.lang.String r5 = "_id"
            r12 = 3
            r11 = 2
            r10 = 1
            r9 = 0
            r6 = 4
            r7 = -1
            if (r0 == 0) goto L_0x0055
            X.0tg r3 = r4.A02     // Catch:{ all -> 0x0099 }
            java.lang.String r2 = "SELECT _id FROM jid WHERE user = ? AND server = ? AND agent = ? AND device = ? AND type = ?"
            r0 = 5
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x0099 }
            java.lang.String r0 = r14.user     // Catch:{ all -> 0x0099 }
            r1[r9] = r0     // Catch:{ all -> 0x0099 }
            java.lang.String r0 = r14.getServer()     // Catch:{ all -> 0x0099 }
            r1[r10] = r0     // Catch:{ all -> 0x0099 }
            int r0 = r14.getAgent()     // Catch:{ all -> 0x0099 }
            java.lang.String r0 = java.lang.Integer.toString(r0)     // Catch:{ all -> 0x0099 }
            r1[r11] = r0     // Catch:{ all -> 0x0099 }
            int r0 = r14.getDevice()     // Catch:{ all -> 0x0099 }
            java.lang.String r0 = java.lang.Integer.toString(r0)     // Catch:{ all -> 0x0099 }
            r1[r12] = r0     // Catch:{ all -> 0x0099 }
            int r0 = r14.getType()     // Catch:{ all -> 0x0099 }
            java.lang.String r0 = java.lang.Integer.toString(r0)     // Catch:{ all -> 0x0099 }
            r1[r6] = r0     // Catch:{ all -> 0x0099 }
            android.database.Cursor r1 = r3.A08(r2, r1)     // Catch:{ all -> 0x0099 }
            boolean r0 = r1.moveToLast()     // Catch:{ all -> 0x0092 }
            if (r0 == 0) goto L_0x008b
            int r0 = r1.getColumnIndexOrThrow(r5)     // Catch:{ all -> 0x0092 }
            long r7 = r1.getLong(r0)     // Catch:{ all -> 0x0092 }
            goto L_0x008b
        L_0x0055:
            X.0tg r3 = r4.A02     // Catch:{ all -> 0x0099 }
            java.lang.String r2 = "SELECT _id FROM jid WHERE user = ? AND server = ? AND agent = ? AND type = ?"
            java.lang.String[] r1 = new java.lang.String[r6]     // Catch:{ all -> 0x0099 }
            java.lang.String r0 = r14.user     // Catch:{ all -> 0x0099 }
            r1[r9] = r0     // Catch:{ all -> 0x0099 }
            java.lang.String r0 = r14.getServer()     // Catch:{ all -> 0x0099 }
            r1[r10] = r0     // Catch:{ all -> 0x0099 }
            int r0 = r14.getAgent()     // Catch:{ all -> 0x0099 }
            java.lang.String r0 = java.lang.Integer.toString(r0)     // Catch:{ all -> 0x0099 }
            r1[r11] = r0     // Catch:{ all -> 0x0099 }
            int r0 = r14.getType()     // Catch:{ all -> 0x0099 }
            java.lang.String r0 = java.lang.Integer.toString(r0)     // Catch:{ all -> 0x0099 }
            r1[r12] = r0     // Catch:{ all -> 0x0099 }
            android.database.Cursor r1 = r3.A08(r2, r1)     // Catch:{ all -> 0x0099 }
            boolean r0 = r1.moveToLast()     // Catch:{ all -> 0x0092 }
            if (r0 == 0) goto L_0x008b
            int r0 = r1.getColumnIndexOrThrow(r5)     // Catch:{ all -> 0x0092 }
            long r7 = r1.getLong(r0)     // Catch:{ all -> 0x0092 }
        L_0x008b:
            r1.close()     // Catch:{ all -> 0x0099 }
            r4.close()
            return r7
        L_0x0092:
            r0 = move-exception
            if (r1 == 0) goto L_0x0098
            r1.close()     // Catch:{ all -> 0x0098 }
        L_0x0098:
            throw r0     // Catch:{ all -> 0x0099 }
        L_0x0099:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x009d }
        L_0x009d:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C216314v.A02(com.whatsapp.jid.Jid):long");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0074 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:20:0x0074=Splitter:B:20:0x0074, B:12:0x0067=Splitter:B:12:0x0067} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.whatsapp.jid.Jid A03(long r18) {
        /*
            r17 = this;
            r5 = 0
            r1 = 0
            r15 = r18
            int r0 = (r18 > r1 ? 1 : (r18 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x001d
            r6 = r17
            java.util.Map r2 = r6.A04
            java.lang.Long r1 = java.lang.Long.valueOf(r15)
            boolean r0 = r2.containsKey(r1)
            if (r0 == 0) goto L_0x001e
            java.lang.Object r5 = r2.get(r1)
            com.whatsapp.jid.Jid r5 = (com.whatsapp.jid.Jid) r5
        L_0x001d:
            return r5
        L_0x001e:
            X.0tq r0 = r6.A01
            X.0tf r8 = r0.get()
            X.0tg r4 = r8.A02     // Catch:{ all -> 0x0075 }
            java.lang.String r3 = "SELECT user, server, agent, device, type, raw_string FROM jid WHERE _id = ?"
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x0075 }
            r1 = 0
            java.lang.String r0 = java.lang.Long.toString(r15)     // Catch:{ all -> 0x0075 }
            r2[r1] = r0     // Catch:{ all -> 0x0075 }
            android.database.Cursor r7 = r4.A08(r3, r2)     // Catch:{ all -> 0x0075 }
            boolean r0 = r7.moveToLast()     // Catch:{ all -> 0x006e }
            if (r0 == 0) goto L_0x0067
            java.lang.String r0 = "user"
            int r9 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x006e }
            java.lang.String r0 = "server"
            int r10 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x006e }
            java.lang.String r0 = "agent"
            int r11 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x006e }
            java.lang.String r0 = "device"
            int r12 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x006e }
            java.lang.String r0 = "type"
            int r13 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x006e }
            java.lang.String r0 = "raw_string"
            int r14 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x006e }
            com.whatsapp.jid.Jid r5 = r6.A05(r7, r8, r9, r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x006e }
        L_0x0067:
            r7.close()     // Catch:{ all -> 0x0075 }
            r8.close()
            return r5
        L_0x006e:
            r0 = move-exception
            if (r7 == 0) goto L_0x0074
            r7.close()     // Catch:{ all -> 0x0074 }
        L_0x0074:
            throw r0     // Catch:{ all -> 0x0075 }
        L_0x0075:
            r0 = move-exception
            r8.close()     // Catch:{ all -> 0x0079 }
        L_0x0079:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C216314v.A03(long):com.whatsapp.jid.Jid");
    }

    public Jid A04(Cursor cursor, int i2, int i3, int i4, int i5, int i6, int i7) {
        String A022 = C33931jQ.A02(cursor, i2);
        String A023 = C33931jQ.A02(cursor, i3);
        int i8 = cursor.getInt(i4);
        int i9 = cursor.isNull(i5) ? 0 : cursor.getInt(i5);
        int i10 = cursor.getInt(i6);
        String A024 = C33931jQ.A02(cursor, i7);
        try {
            Jid jid = Jid.get(A024);
            if (i10 == 0) {
                if (jid instanceof DeviceJid) {
                    jid = ((DeviceJid) jid).getUserJid();
                }
            } else if (i10 == 17 && (jid instanceof UserJid)) {
                jid = DeviceJid.of(jid);
                AnonymousClass00B.A06(jid);
            }
            if (AnonymousClass1ZW.A0F(A022, jid.user) && AnonymousClass1ZW.A0F(A023, jid.getServer()) && i8 == jid.getAgent() && i9 == jid.getDevice() && i10 == jid.getType()) {
                return jid;
            }
            A00("jidstore/readjidfromcursor/cursormismatch", A022, A023, A024, i8, i9, i10);
            return null;
        } catch (AnonymousClass1W4 unused) {
            if (i10 == 11 && TextUtils.isEmpty(A022) && TextUtils.isEmpty(A023) && i8 == 0 && i9 == 0 && TextUtils.isEmpty(A024)) {
                return C34091jg.A00;
            }
            A00("jidstore/readjidfromcursor/invalidjid", A022, A023, A024, i8, i9, i10);
            return null;
        }
    }

    public Jid A05(Cursor cursor, C16800tf r15, int i2, int i3, int i4, int i5, int i6, int i7, long j2) {
        long j3 = j2;
        if (j2 <= 0) {
            return null;
        }
        Map map = this.A04;
        Long valueOf = Long.valueOf(j3);
        if (map.containsKey(valueOf)) {
            return (Jid) map.get(valueOf);
        }
        Jid A042 = A04(cursor, i2, i3, i4, i5, i6, i7);
        if (A042 == null) {
            return A042;
        }
        if (r15.A02.A00.inTransaction()) {
            r15.A03(new RunnableRunnableShape0S0200100_I0(this, A042, 3, j3));
            return A042;
        }
        A0B(A042, j3);
        return A042;
    }

    public Jid A06(Cursor cursor, C16800tf r16, Class cls, int i2, int i3, int i4, int i5, int i6, int i7, long j2) {
        long j3 = j2;
        try {
            return (Jid) cls.cast(A05(cursor, r16, i2, i3, i4, i5, i6, i7, j3));
        } catch (ClassCastException e2) {
            StringBuilder sb = new StringBuilder("JidStore/readJidByRowId/jid wrong class; rowId=");
            sb.append(j3);
            sb.append("; db_data=");
            sb.append(A08(j3));
            Log.e(sb.toString(), e2);
            this.A00.AcB("invalid-jid-in-store", (String) null, false);
            return null;
        }
    }

    public Jid A07(Class cls, long j2) {
        try {
            return (Jid) cls.cast(A03(j2));
        } catch (ClassCastException e2) {
            StringBuilder sb = new StringBuilder("JidStore/readJidByRowId/jid wrong class; rowId=");
            sb.append(j2);
            sb.append("; db_data=");
            sb.append(A08(j2));
            Log.e(sb.toString(), e2);
            this.A00.AcB("JidStore/readJidByRowId", "invalid-jid-in-store", true);
            return null;
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00fe */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String A08(long r15) {
        /*
            r14 = this;
            X.0tq r0 = r14.A01
            X.0tf r2 = r0.get()
            X.0tg r5 = r2.A02     // Catch:{ all -> 0x00ff }
            java.lang.String r4 = "SELECT user, server, agent, device, type, raw_string FROM jid WHERE _id = ?"
            r0 = 1
            java.lang.String[] r3 = new java.lang.String[r0]     // Catch:{ all -> 0x00ff }
            java.lang.String r1 = java.lang.Long.toString(r15)     // Catch:{ all -> 0x00ff }
            r0 = 0
            r3[r0] = r1     // Catch:{ all -> 0x00ff }
            android.database.Cursor r3 = r5.A08(r4, r3)     // Catch:{ all -> 0x00ff }
            boolean r0 = r3.moveToLast()     // Catch:{ all -> 0x00f8 }
            if (r0 == 0) goto L_0x00f0
            java.lang.String r0 = "user"
            int r0 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00f8 }
            java.lang.String r10 = r3.getString(r0)     // Catch:{ all -> 0x00f8 }
            java.lang.String r0 = "server"
            int r0 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00f8 }
            java.lang.String r9 = r3.getString(r0)     // Catch:{ all -> 0x00f8 }
            java.lang.String r0 = "agent"
            int r0 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00f8 }
            int r8 = r3.getInt(r0)     // Catch:{ all -> 0x00f8 }
            java.lang.String r0 = "device"
            int r1 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00f8 }
            boolean r0 = r3.isNull(r1)     // Catch:{ all -> 0x00f8 }
            if (r0 == 0) goto L_0x004c
            r7 = 0
            goto L_0x0050
        L_0x004c:
            int r7 = r3.getInt(r1)     // Catch:{ all -> 0x00f8 }
        L_0x0050:
            java.lang.String r0 = "type"
            int r0 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00f8 }
            int r6 = r3.getInt(r0)     // Catch:{ all -> 0x00f8 }
            java.lang.String r0 = "raw_string"
            int r0 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00f8 }
            java.lang.String r5 = r3.getString(r0)     // Catch:{ all -> 0x00f8 }
            boolean r13 = r3.isNull(r1)     // Catch:{ all -> 0x00f8 }
            if (r10 == 0) goto L_0x00a2
            r0 = 42
            java.lang.Character r12 = java.lang.Character.valueOf(r0)     // Catch:{ all -> 0x00f8 }
            r1 = r10
            r11 = 4
            r0 = 1
            X.AnonymousClass00B.A0F(r0)     // Catch:{ all -> 0x00f8 }
            int r0 = r10.length()     // Catch:{ all -> 0x00f8 }
            if (r0 <= r11) goto L_0x009b
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f8 }
            r4.<init>()     // Catch:{ all -> 0x00f8 }
            int r0 = r0 - r11
            java.util.List r1 = java.util.Collections.nCopies(r0, r12)     // Catch:{ all -> 0x00f8 }
            java.lang.String r0 = ""
            java.lang.String r0 = android.text.TextUtils.join(r0, r1)     // Catch:{ all -> 0x00f8 }
            r4.append(r0)     // Catch:{ all -> 0x00f8 }
            java.lang.String r0 = X.AnonymousClass1ZW.A03(r11, r10)     // Catch:{ all -> 0x00f8 }
            r4.append(r0)     // Catch:{ all -> 0x00f8 }
            java.lang.String r1 = r4.toString()     // Catch:{ all -> 0x00f8 }
        L_0x009b:
            if (r5 == 0) goto L_0x00a1
            java.lang.String r5 = r5.replace(r10, r1)     // Catch:{ all -> 0x00f8 }
        L_0x00a1:
            r10 = r1
        L_0x00a2:
            java.lang.String r0 = "user="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f8 }
            r1.<init>(r0)     // Catch:{ all -> 0x00f8 }
            r1.append(r10)     // Catch:{ all -> 0x00f8 }
            java.lang.String r0 = "; server="
            r1.append(r0)     // Catch:{ all -> 0x00f8 }
            r1.append(r9)     // Catch:{ all -> 0x00f8 }
            java.lang.String r0 = "; agent="
            r1.append(r0)     // Catch:{ all -> 0x00f8 }
            r1.append(r8)     // Catch:{ all -> 0x00f8 }
            java.lang.String r0 = "; device="
            r1.append(r0)     // Catch:{ all -> 0x00f8 }
            r1.append(r7)     // Catch:{ all -> 0x00f8 }
            java.lang.String r0 = "; type="
            r1.append(r0)     // Catch:{ all -> 0x00f8 }
            r1.append(r6)     // Catch:{ all -> 0x00f8 }
            java.lang.String r0 = "; rawString="
            r1.append(r0)     // Catch:{ all -> 0x00f8 }
            r1.append(r5)     // Catch:{ all -> 0x00f8 }
            java.lang.String r0 = "; has_device="
            r1.append(r0)     // Catch:{ all -> 0x00f8 }
            if (r13 == 0) goto L_0x00df
            java.lang.String r0 = "no"
            goto L_0x00e2
        L_0x00df:
            java.lang.String r0 = "yes"
        L_0x00e2:
            r1.append(r0)     // Catch:{ all -> 0x00f8 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00f8 }
            r3.close()     // Catch:{ all -> 0x00ff }
            r2.close()
            return r0
        L_0x00f0:
            r3.close()     // Catch:{ all -> 0x00ff }
            r2.close()
            r0 = 0
            return r0
        L_0x00f8:
            r0 = move-exception
            if (r3 == 0) goto L_0x00fe
            r3.close()     // Catch:{ all -> 0x00fe }
        L_0x00fe:
            throw r0     // Catch:{ all -> 0x00ff }
        L_0x00ff:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0103 }
        L_0x0103:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C216314v.A08(long):java.lang.String");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x00c0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Map A09(java.lang.Class r21, java.util.Collection r22) {
        /*
            r20 = this;
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r5 = r22.iterator()
        L_0x000e:
            boolean r0 = r5.hasNext()
            r8 = r20
            r11 = r21
            if (r0 == 0) goto L_0x003a
            java.lang.Object r4 = r5.next()
            java.lang.Number r4 = (java.lang.Number) r4
            long r1 = r4.longValue()
            java.util.Map r0 = r8.A04
            boolean r0 = r0.containsKey(r4)
            if (r0 == 0) goto L_0x0032
            com.whatsapp.jid.Jid r0 = r8.A07(r11, r1)
            r3.put(r4, r0)
            goto L_0x000e
        L_0x0032:
            java.lang.String r0 = java.lang.Long.toString(r1)
            r6.add(r0)
            goto L_0x000e
        L_0x003a:
            java.lang.String[] r0 = X.AnonymousClass01S.A0H
            java.lang.Object[] r1 = r6.toArray(r0)
            r4 = 0
            X.0tq r0 = r8.A01
            X.0tf r10 = r0.get()
            r0 = 975(0x3cf, float:1.366E-42)
            X.1jh r2 = new X.1jh     // Catch:{ all -> 0x00dd }
            r2.<init>(r1, r0)     // Catch:{ all -> 0x00dd }
        L_0x004e:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x00dd }
            if (r0 == 0) goto L_0x00c1
            java.lang.Object r7 = r2.next()     // Catch:{ all -> 0x00dd }
            java.lang.String[] r7 = (java.lang.String[]) r7     // Catch:{ all -> 0x00dd }
            X.0tg r6 = r10.A02     // Catch:{ all -> 0x00dd }
            int r5 = r7.length     // Catch:{ all -> 0x00dd }
            java.lang.String r0 = "SELECT _id, user, server, agent, device, type, raw_string FROM jid WHERE _id IN "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00dd }
            r1.<init>(r0)     // Catch:{ all -> 0x00dd }
            java.lang.String r0 = X.C34111ji.A00(r5)     // Catch:{ all -> 0x00dd }
            r1.append(r0)     // Catch:{ all -> 0x00dd }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00dd }
            android.database.Cursor r9 = r6.A08(r0, r7)     // Catch:{ all -> 0x00dd }
            java.lang.String r0 = "_id"
            int r1 = r9.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00ba }
            java.lang.String r0 = "user"
            int r12 = r9.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00ba }
            java.lang.String r0 = "server"
            int r13 = r9.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00ba }
            java.lang.String r0 = "agent"
            int r14 = r9.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00ba }
            java.lang.String r0 = "device"
            int r15 = r9.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00ba }
            java.lang.String r0 = "type"
            int r16 = r9.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00ba }
            java.lang.String r0 = "raw_string"
            int r17 = r9.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00ba }
        L_0x00a0:
            boolean r0 = r9.moveToNext()     // Catch:{ all -> 0x00ba }
            if (r0 == 0) goto L_0x00b6
            long r18 = r9.getLong(r1)     // Catch:{ all -> 0x00ba }
            com.whatsapp.jid.Jid r0 = r8.A06(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x00ba }
            java.lang.Long r5 = java.lang.Long.valueOf(r18)     // Catch:{ all -> 0x00ba }
            r3.put(r5, r0)     // Catch:{ all -> 0x00ba }
            goto L_0x00a0
        L_0x00b6:
            r9.close()     // Catch:{ all -> 0x00dd }
            goto L_0x004e
        L_0x00ba:
            r0 = move-exception
            if (r9 == 0) goto L_0x00c0
            r9.close()     // Catch:{ all -> 0x00c0 }
        L_0x00c0:
            throw r0     // Catch:{ all -> 0x00dd }
        L_0x00c1:
            r10.close()
            java.util.Iterator r2 = r22.iterator()
        L_0x00c8:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00dc
            java.lang.Object r1 = r2.next()
            boolean r0 = r3.containsKey(r1)
            if (r0 != 0) goto L_0x00c8
            r3.put(r1, r4)
            goto L_0x00c8
        L_0x00dc:
            return r3
        L_0x00dd:
            r0 = move-exception
            r10.close()     // Catch:{ all -> 0x00e1 }
        L_0x00e1:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C216314v.A09(java.lang.Class, java.util.Collection):java.util.Map");
    }

    public final void A0A(Cursor cursor) {
        while (cursor.moveToNext()) {
            String A022 = C33931jQ.A02(cursor, 0);
            if (!TextUtils.isEmpty(A022)) {
                for (String nullable : A022.split(",")) {
                    Jid nullable2 = Jid.getNullable(nullable);
                    if (nullable2 != null) {
                        A01(nullable2);
                    }
                }
            }
        }
    }

    public final void A0B(Jid jid, long j2) {
        Map map = this.A04;
        Long valueOf = Long.valueOf(j2);
        map.put(valueOf, jid);
        this.A03.put(jid, valueOf);
    }

    public boolean A0C() {
        C16900tq r0 = this.A01;
        r0.A04();
        return r0.A01 && this.A02.A01("jid_ready", 0) != 0;
    }
}
