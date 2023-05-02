package X;

import android.database.Cursor;
import com.obwhatsapp.yo.yo;
import java.util.Map;

/* renamed from: X.0th  reason: invalid class name and case insensitive filesystem */
public class C16820th {
    public final C16300so A00;
    public final C16440t3 A01;
    public final AnonymousClass181 A02;
    public final AnonymousClass199 A03;
    public final C223917t A04;
    public final C16920ts A05;
    public final C15810rt A06;
    public final C17620vN A07;
    public final AnonymousClass182 A08;
    public final AnonymousClass189 A09;
    public final AnonymousClass188 A0A;
    public final AnonymousClass183 A0B;
    public final C223317n A0C;
    public final AnonymousClass185 A0D;
    public final C17610vM A0E;
    public final C224317x A0F;
    public final AnonymousClass17G A0G;
    public final AnonymousClass17I A0H;
    public final C224217w A0I;
    public final C39521sc A0J;
    public final C17400v1 A0K;
    public final C223417o A0L;
    public final C16900tq A0M;
    public final C223517p A0N;
    public final AnonymousClass18B A0O;
    public final C223117l A0P;
    public final AnonymousClass187 A0Q;
    public final C221116r A0R;
    public final C222817i A0S;
    public final AnonymousClass186 A0T;
    public final C224017u A0U;
    public final C223617q A0V;
    public final C224117v A0W;
    public final C224517z A0X;
    public final C222917j A0Y;
    public final C223217m A0Z;
    public final AnonymousClass180 A0a;
    public final Map A0b;

    public C16820th(C16300so r3, C16440t3 r4, AnonymousClass181 r5, AnonymousClass199 r6, C223917t r7, C16920ts r8, C15810rt r9, C17620vN r10, AnonymousClass182 r11, AnonymousClass189 r12, AnonymousClass188 r13, AnonymousClass183 r14, C223317n r15, AnonymousClass185 r16, C17610vM r17, C224317x r18, AnonymousClass17G r19, AnonymousClass17I r20, C224217w r21, AnonymousClass17H r22, C17400v1 r23, C223417o r24, C16900tq r25, C223517p r26, AnonymousClass18B r27, C223117l r28, AnonymousClass187 r29, C221116r r30, C222817i r31, AnonymousClass186 r32, C224017u r33, C223617q r34, C224117v r35, C224517z r36, C222917j r37, C223217m r38, AnonymousClass180 r39) {
        this.A01 = r4;
        this.A05 = r8;
        this.A00 = r3;
        this.A06 = r9;
        this.A03 = r6;
        this.A0G = r19;
        this.A0S = r31;
        this.A0Y = r37;
        this.A0P = r28;
        this.A0Z = r38;
        this.A0C = r15;
        this.A0L = r24;
        this.A0N = r26;
        this.A0V = r34;
        this.A04 = r7;
        this.A07 = r10;
        this.A0I = r21;
        this.A0M = r25;
        this.A0U = r33;
        this.A0W = r35;
        this.A0K = r23;
        this.A0X = r36;
        this.A0F = r18;
        this.A0a = r39;
        this.A02 = r5;
        this.A08 = r11;
        this.A0B = r14;
        this.A0H = r20;
        this.A0E = r17;
        this.A0D = r16;
        this.A0R = r30;
        this.A0T = r32;
        this.A0Q = r29;
        this.A0A = r13;
        this.A09 = r12;
        this.A0O = r27;
        AnonymousClass17H r1 = r22;
        this.A0J = r1.A01;
        this.A0b = r1.A02;
    }

    public static C16820th A21() {
        return (C16820th) yo.mSingletonC.A3B.get();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:24|25|26|27|28) */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0022, code lost:
        r0 = r8.A05.A05(r3.getLong(r3.getColumnIndexOrThrow("chat_row_id")));
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0053 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0058 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:22:0x0053=Splitter:B:22:0x0053, B:12:0x003a=Splitter:B:12:0x003a} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C16740tZ A00(long r9) {
        /*
            r8 = this;
            long r6 = android.os.SystemClock.uptimeMillis()
            X.0tq r0 = r8.A0M     // Catch:{ all -> 0x0059 }
            X.0tf r5 = r0.get()     // Catch:{ all -> 0x0059 }
            X.0tg r3 = r5.A02     // Catch:{ all -> 0x0054 }
            java.lang.String r2 = X.AnonymousClass1WW.A0A     // Catch:{ all -> 0x0054 }
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x0054 }
            r4 = 0
            java.lang.String r0 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x0054 }
            r1[r4] = r0     // Catch:{ all -> 0x0054 }
            android.database.Cursor r3 = r3.A08(r2, r1)     // Catch:{ all -> 0x0054 }
            boolean r0 = r3.moveToLast()     // Catch:{ all -> 0x004d }
            if (r0 == 0) goto L_0x0039
            java.lang.String r0 = "chat_row_id"
            int r0 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x004d }
            long r1 = r3.getLong(r0)     // Catch:{ all -> 0x004d }
            X.0ts r0 = r8.A05     // Catch:{ all -> 0x004d }
            X.0rv r0 = r0.A05(r1)     // Catch:{ all -> 0x004d }
            if (r0 == 0) goto L_0x0039
            X.0tZ r4 = r8.A02(r3, r0, r4)     // Catch:{ all -> 0x004d }
            goto L_0x003a
        L_0x0039:
            r4 = 0
        L_0x003a:
            r3.close()     // Catch:{ all -> 0x0054 }
            r5.close()     // Catch:{ all -> 0x0059 }
            X.0vN r3 = r8.A07
            long r1 = android.os.SystemClock.uptimeMillis()
            long r1 = r1 - r6
            java.lang.String r0 = "CachedMessageStore/getMessage/rowId"
            r3.A00(r0, r1)
            return r4
        L_0x004d:
            r0 = move-exception
            if (r3 == 0) goto L_0x0053
            r3.close()     // Catch:{ all -> 0x0053 }
        L_0x0053:
            throw r0     // Catch:{ all -> 0x0054 }
        L_0x0054:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x0058 }
        L_0x0058:
            throw r0     // Catch:{ all -> 0x0059 }
        L_0x0059:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16820th.A00(long):X.0tZ");
    }

    public C16740tZ A01(Cursor cursor) {
        C15830rv A062 = this.A05.A06(cursor);
        if (A062 == null) {
            return null;
        }
        return A02(cursor, A062, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1061:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0323, code lost:
        if (r6.size() > 0) goto L_0x0325;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:351:0x07f4, code lost:
        if (r4 == null) goto L_0x07f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00e4, code lost:
        if (r10 == 7) goto L_0x00e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:555:0x0cb7, code lost:
        if (r3 == null) goto L_0x0cb9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:873:0x1355, code lost:
        if (r5 == null) goto L_0x153a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:991:0x15d6, code lost:
        if (r1 == null) goto L_0x15db;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1018:0x160e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1024:0x1615 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1033:0x1621 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1039:0x1628 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1044:0x162d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1050:0x1634 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1055:0x1639 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1060:0x163e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:215:0x04c5 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:324:0x075a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:332:0x0765 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:567:0x0cdf */
    /* JADX WARNING: Missing exception handler attribute for start block: B:658:0x0ee8 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:685:0x0f4a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:690:0x0f4f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:707:0x0f7a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:712:0x0f7f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:719:0x0f89 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:86:0x0227 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:948:0x152d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:957:0x153a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:994:0x15db */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x015e  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:1024:0x1615=Splitter:B:1024:0x1615, B:357:0x080c=Splitter:B:357:0x080c} */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:197:0x0464=Splitter:B:197:0x0464, B:1050:0x1634=Splitter:B:1050:0x1634} */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:215:0x04c5=Splitter:B:215:0x04c5, B:209:0x04bb=Splitter:B:209:0x04bb} */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:481:0x0b2b=Splitter:B:481:0x0b2b, B:690:0x0f4f=Splitter:B:690:0x0f4f} */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:561:0x0cd5=Splitter:B:561:0x0cd5, B:567:0x0cdf=Splitter:B:567:0x0cdf} */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:685:0x0f4a=Splitter:B:685:0x0f4a, B:677:0x0f3d=Splitter:B:677:0x0f3d} */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:692:0x0f50=Splitter:B:692:0x0f50, B:712:0x0f7f=Splitter:B:712:0x0f7f} */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:942:0x1523=Splitter:B:942:0x1523, B:948:0x152d=Splitter:B:948:0x152d} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C16740tZ A02(android.database.Cursor r43, X.C15830rv r44, boolean r45) {
        /*
            r42 = this;
            r6 = r43
            int r0 = r6.getColumnCount()
            r4 = 1
            r2 = r42
            if (r0 != r4) goto L_0x0015
            r0 = 0
            long r0 = r6.getLong(r0)
            X.0tZ r0 = r2.A00(r0)
        L_0x0014:
            return r0
        L_0x0015:
            X.17G r3 = r2.A0G
            java.lang.String r20 = "key_id"
            r0 = r20
            int r0 = r6.getColumnIndex(r0)
            if (r0 >= 0) goto L_0x0027
            r0 = r20
            int r0 = r6.getColumnIndexOrThrow(r0)
        L_0x0027:
            java.lang.String r7 = r6.getString(r0)
            java.lang.String r21 = "from_me"
            r0 = r21
            int r0 = r6.getColumnIndex(r0)
            if (r0 >= 0) goto L_0x003b
            java.lang.String r0 = "key_from_me"
            int r0 = r6.getColumnIndexOrThrow(r0)
        L_0x003b:
            int r0 = r6.getInt(r0)
            r1 = 1
            if (r0 == r4) goto L_0x0043
            r1 = 0
        L_0x0043:
            r5 = r44
            if (r7 == 0) goto L_0x006c
            java.lang.String r0 = "-1"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L_0x006c
            X.1Vw r16 = new X.1Vw
            r0 = r16
            r0.<init>(r5, r7, r1)
        L_0x0056:
            r22 = 0
            if (r16 != 0) goto L_0x0080
            java.lang.String r1 = "CachedMessageStore/getMessage/can't read key; jid="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return r22
        L_0x006c:
            java.lang.String r1 = "CachedMessageStore/getMessage/id is null or no messages for jid="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r16 = 0
            goto L_0x0056
        L_0x0080:
            r0 = r16
            X.0tZ r0 = r2.A04(r0)
            if (r0 != 0) goto L_0x0014
            r0 = r16
            X.0tZ r0 = r3.A01(r6, r0)     // Catch:{ all -> 0x163f }
            if (r0 != 0) goto L_0x0162
            r7 = -1
            java.lang.String r11 = "message_type"
            int r0 = r6.getColumnIndex(r11)     // Catch:{ all -> 0x163f }
            if (r0 < 0) goto L_0x009d
            int r7 = r6.getInt(r0)     // Catch:{ all -> 0x163f }
        L_0x009d:
            java.lang.String r9 = "timestamp"
            int r0 = r6.getColumnIndex(r9)     // Catch:{ all -> 0x163f }
            if (r0 < 0) goto L_0x00dc
            long r0 = r6.getLong(r0)     // Catch:{ all -> 0x163f }
            java.lang.String r10 = "yyyy-MM-dd"
            java.util.Locale r5 = java.util.Locale.US     // Catch:{ all -> 0x163f }
            java.text.SimpleDateFormat r8 = new java.text.SimpleDateFormat     // Catch:{ all -> 0x163f }
            r8.<init>(r10, r5)     // Catch:{ all -> 0x163f }
            java.util.Date r5 = new java.util.Date     // Catch:{ all -> 0x163f }
            r5.<init>(r0)     // Catch:{ all -> 0x163f }
            java.lang.String r8 = r8.format(r5)     // Catch:{ all -> 0x163f }
        L_0x00bd:
            int r0 = r6.getColumnIndexOrThrow(r11)     // Catch:{ all -> 0x163f }
            int r0 = r6.getInt(r0)     // Catch:{ all -> 0x163f }
            byte r10 = (byte) r0     // Catch:{ all -> 0x163f }
            int r0 = r6.getColumnIndexOrThrow(r9)     // Catch:{ all -> 0x163f }
            long r0 = r6.getLong(r0)     // Catch:{ all -> 0x163f }
            java.lang.String r5 = "status"
            int r5 = r6.getColumnIndexOrThrow(r5)     // Catch:{ all -> 0x163f }
            int r9 = r6.getInt(r5)     // Catch:{ all -> 0x163f }
            if (r10 != 0) goto L_0x00e3
            goto L_0x00df
        L_0x00dc:
            r8 = r22
            goto L_0x00bd
        L_0x00df:
            r5 = 6
            if (r9 == r5) goto L_0x00e6
            goto L_0x010f
        L_0x00e3:
            r5 = 7
            if (r10 != r5) goto L_0x010f
        L_0x00e6:
            X.17r r10 = r3.A07     // Catch:{ all -> 0x163f }
            java.lang.String r5 = "media_size"
            int r5 = r6.getColumnIndexOrThrow(r5)     // Catch:{ all -> 0x163f }
            int r9 = r6.getInt(r5)     // Catch:{ all -> 0x163f }
            r5 = 38
            if (r9 != r5) goto L_0x0101
            X.17g r10 = r10.A06     // Catch:{ all -> 0x163f }
            r9 = 33
            r5 = r16
            X.0tZ r1 = r10.A01(r5, r9, r0)     // Catch:{ all -> 0x163f }
            goto L_0x0117
        L_0x0101:
            X.0so r5 = r10.A00     // Catch:{ all -> 0x163f }
            r10 = r5
            r11 = r16
            r12 = r22
            r13 = r9
            r14 = r0
            X.1WU r1 = X.AnonymousClass122.A00(r10, r11, r12, r13, r14)     // Catch:{ all -> 0x163f }
            goto L_0x0117
        L_0x010f:
            X.17g r9 = r3.A08     // Catch:{ all -> 0x163f }
            r5 = r16
            X.0tZ r1 = r9.A01(r5, r10, r0)     // Catch:{ all -> 0x163f }
        L_0x0117:
            X.14v r0 = r3.A04     // Catch:{ all -> 0x163f }
            r1.A0a(r6, r0)     // Catch:{ all -> 0x163f }
            r1.A0Z(r6)     // Catch:{ all -> 0x163f }
            boolean r0 = r1 instanceof X.AnonymousClass1WU     // Catch:{ all -> 0x163f }
            if (r0 == 0) goto L_0x015e
            X.1WU r1 = (X.AnonymousClass1WU) r1     // Catch:{ all -> 0x163f }
            int r0 = r1.A00     // Catch:{ all -> 0x163f }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x163f }
        L_0x012b:
            X.0so r3 = r2.A00     // Catch:{ all -> 0x163f }
            java.lang.String r2 = "CachedMessageStore/getMessage/message is null"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x163f }
            r1.<init>()     // Catch:{ all -> 0x163f }
            java.lang.String r0 = "key="
            r1.append(r0)     // Catch:{ all -> 0x163f }
            r0 = r16
            r1.append(r0)     // Catch:{ all -> 0x163f }
            java.lang.String r0 = ", date="
            r1.append(r0)     // Catch:{ all -> 0x163f }
            r1.append(r8)     // Catch:{ all -> 0x163f }
            java.lang.String r0 = ", type="
            r1.append(r0)     // Catch:{ all -> 0x163f }
            r1.append(r7)     // Catch:{ all -> 0x163f }
            java.lang.String r0 = ", action="
            r1.append(r0)     // Catch:{ all -> 0x163f }
            r1.append(r5)     // Catch:{ all -> 0x163f }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x163f }
            r3.AcB(r2, r0, r4)     // Catch:{ all -> 0x163f }
            goto L_0x0161
        L_0x015e:
            r5 = r22
            goto L_0x012b
        L_0x0161:
            return r22
        L_0x0162:
            java.lang.String r1 = r0.A0n     // Catch:{ all -> 0x163f }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x163f }
            if (r1 != 0) goto L_0x0180
            X.16r r7 = r2.A0R     // Catch:{ all -> 0x163f }
            boolean r1 = r7.A0i()     // Catch:{ all -> 0x163f }
            if (r1 == 0) goto L_0x018f
            long r3 = r0.A13     // Catch:{ all -> 0x163f }
            X.1Vw r1 = r0.A11     // Catch:{ all -> 0x163f }
            java.lang.String r6 = r1.A01     // Catch:{ all -> 0x163f }
            java.lang.String r1 = r0.A0n     // Catch:{ all -> 0x163f }
            X.1Vt r1 = r7.A0N(r6, r1, r3)     // Catch:{ all -> 0x163f }
            r0.A0L = r1     // Catch:{ all -> 0x163f }
        L_0x0180:
            boolean r1 = r0 instanceof X.C38961rh     // Catch:{ all -> 0x163f }
            if (r1 == 0) goto L_0x023c
            X.17z r1 = r2.A0X     // Catch:{ all -> 0x163f }
            long r3 = r0.A13     // Catch:{ all -> 0x163f }
            X.0tq r1 = r1.A01     // Catch:{ all -> 0x163f }
            X.0tf r6 = r1.get()     // Catch:{ all -> 0x163f }
            goto L_0x019c
        L_0x018f:
            X.1Vw r1 = r0.A11     // Catch:{ all -> 0x163f }
            java.lang.String r3 = r1.A01     // Catch:{ all -> 0x163f }
            java.lang.String r1 = r0.A0n     // Catch:{ all -> 0x163f }
            X.1Vt r1 = r7.A0M(r3, r1)     // Catch:{ all -> 0x163f }
            r0.A0L = r1     // Catch:{ all -> 0x163f }
            goto L_0x0180
        L_0x019c:
            X.0tg r9 = r6.A02     // Catch:{ all -> 0x0228 }
            java.lang.String r8 = "SELECT _id, text_data, extra_data, button_type, used, selected_index, otp_button_type FROM message_template_button WHERE message_row_id = ?"
            r7 = 1
            java.lang.String[] r1 = new java.lang.String[r7]     // Catch:{ all -> 0x0228 }
            java.lang.String r10 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x0228 }
            r13 = 0
            r1[r13] = r10     // Catch:{ all -> 0x0228 }
            android.database.Cursor r1 = r9.A08(r8, r1)     // Catch:{ all -> 0x0228 }
            if (r1 == 0) goto L_0x0204
            boolean r8 = r1.moveToFirst()     // Catch:{ all -> 0x0221 }
            if (r8 == 0) goto L_0x0204
            java.lang.String r3 = "_id"
            int r3 = r1.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x0221 }
            long r3 = r1.getLong(r3)     // Catch:{ all -> 0x0221 }
            java.lang.String r8 = "text_data"
            int r8 = r1.getColumnIndexOrThrow(r8)     // Catch:{ all -> 0x0221 }
            java.lang.String r9 = r1.getString(r8)     // Catch:{ all -> 0x0221 }
            java.lang.String r8 = "extra_data"
            int r8 = r1.getColumnIndexOrThrow(r8)     // Catch:{ all -> 0x0221 }
            java.lang.String r10 = r1.getString(r8)     // Catch:{ all -> 0x0221 }
            java.lang.String r8 = "button_type"
            int r8 = r1.getColumnIndexOrThrow(r8)     // Catch:{ all -> 0x0221 }
            int r11 = r1.getInt(r8)     // Catch:{ all -> 0x0221 }
            java.lang.String r8 = "used"
            int r8 = r1.getColumnIndexOrThrow(r8)     // Catch:{ all -> 0x0221 }
            int r8 = r1.getInt(r8)     // Catch:{ all -> 0x0221 }
            r14 = 0
            if (r8 != r7) goto L_0x01ee
            r14 = 1
        L_0x01ee:
            java.lang.String r7 = "selected_index"
            int r7 = r1.getColumnIndexOrThrow(r7)     // Catch:{ all -> 0x0221 }
            int r12 = r1.getInt(r7)     // Catch:{ all -> 0x0221 }
            X.1sy r8 = new X.1sy     // Catch:{ all -> 0x0221 }
            r8.<init>(r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x0221 }
            r8.A00 = r3     // Catch:{ all -> 0x0221 }
            r1.close()     // Catch:{ all -> 0x0228 }
            goto L_0x022e
        L_0x0204:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0221 }
            r8.<init>()     // Catch:{ all -> 0x0221 }
            java.lang.String r7 = "TemplateMessageStore/getTemplateButtonReplyData/Template button reply data doesn't exist in the table; messageRowId="
            r8.append(r7)     // Catch:{ all -> 0x0221 }
            r8.append(r3)     // Catch:{ all -> 0x0221 }
            java.lang.String r3 = r8.toString()     // Catch:{ all -> 0x0221 }
            com.whatsapp.util.Log.e((java.lang.String) r3)     // Catch:{ all -> 0x0221 }
            if (r1 == 0) goto L_0x021d
            r1.close()     // Catch:{ all -> 0x0228 }
        L_0x021d:
            r6.close()     // Catch:{ all -> 0x163f }
            goto L_0x023c
        L_0x0221:
            r0 = move-exception
            if (r1 == 0) goto L_0x0227
            r1.close()     // Catch:{ all -> 0x0227 }
        L_0x0227:
            throw r0     // Catch:{ all -> 0x0228 }
        L_0x0228:
            r0 = move-exception
            r6.close()     // Catch:{ all -> 0x163e }
            goto L_0x163e
        L_0x022e:
            r6.close()     // Catch:{ all -> 0x163f }
            r3 = r0
            X.1rh r3 = (X.C38961rh) r3     // Catch:{ all -> 0x163f }
            java.lang.String r1 = r8.A05     // Catch:{ all -> 0x163f }
            r3.A01 = r1     // Catch:{ all -> 0x163f }
            int r1 = r8.A02     // Catch:{ all -> 0x163f }
            r3.A00 = r1     // Catch:{ all -> 0x163f }
        L_0x023c:
            boolean r1 = r2.A06(r0)     // Catch:{ all -> 0x163f }
            if (r1 == 0) goto L_0x0259
            if (r45 != 0) goto L_0x0259
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x163f }
            r1.<init>()     // Catch:{ all -> 0x163f }
            java.lang.String r0 = "CachedMessageStore/getMessage/message is deleted for jid="
            r1.append(r0)     // Catch:{ all -> 0x163f }
            r1.append(r5)     // Catch:{ all -> 0x163f }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x163f }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x163f }
            return r22
        L_0x0259:
            long r17 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x163f }
            r3 = 1
            r0.A0X(r3)     // Catch:{ all -> 0x163f }
            X.0tq r1 = r2.A0M     // Catch:{ all -> 0x163f }
            X.0tf r25 = r1.get()     // Catch:{ all -> 0x163f }
            r1.A04()     // Catch:{ all -> 0x163a }
            X.1jC r4 = r1.A04     // Catch:{ all -> 0x163a }
            r1 = r25
            X.0tg r1 = r1.A02     // Catch:{ all -> 0x163a }
            boolean r1 = r4.A0E(r1)     // Catch:{ all -> 0x163a }
            if (r1 == 0) goto L_0x032d
            X.1Vw r1 = r0.A11     // Catch:{ all -> 0x163a }
            X.0rv r4 = r1.A00     // Catch:{ all -> 0x163a }
            boolean r1 = X.C16030sJ.A0G(r4)     // Catch:{ all -> 0x163a }
            if (r1 == 0) goto L_0x032d
            boolean r1 = X.C16030sJ.A0Q(r4)     // Catch:{ all -> 0x163a }
            if (r1 != 0) goto L_0x032d
            X.181 r7 = r2.A02     // Catch:{ all -> 0x163a }
            boolean r1 = r0 instanceof X.AnonymousClass1WU     // Catch:{ all -> 0x163a }
            if (r1 != 0) goto L_0x032d
            java.util.HashSet r6 = new java.util.HashSet     // Catch:{ all -> 0x163a }
            r6.<init>()     // Catch:{ all -> 0x163a }
            X.0tq r10 = r7.A02     // Catch:{ all -> 0x163a }
            X.0tf r1 = r10.get()     // Catch:{ all -> 0x163a }
            X.0tg r11 = r1.A02     // Catch:{ all -> 0x153b }
            java.lang.String r9 = "SELECT receipt_device_jid_row_id, receipt_device_timestamp FROM receipt_device WHERE message_row_id = ?"
            java.lang.String[] r8 = new java.lang.String[r3]     // Catch:{ all -> 0x153b }
            long r4 = r0.A13     // Catch:{ all -> 0x153b }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x153b }
            r12 = 0
            r8[r12] = r4     // Catch:{ all -> 0x153b }
            android.database.Cursor r9 = r11.A08(r9, r8)     // Catch:{ all -> 0x153b }
            java.lang.String r4 = "receipt_device_jid_row_id"
            int r11 = r9.getColumnIndexOrThrow(r4)     // Catch:{ all -> 0x0314 }
        L_0x02b0:
            boolean r4 = r9.moveToNext()     // Catch:{ all -> 0x0314 }
            if (r4 == 0) goto L_0x02ce
            X.14v r8 = r7.A01     // Catch:{ all -> 0x0314 }
            long r4 = r9.getLong(r11)     // Catch:{ all -> 0x0314 }
            com.whatsapp.jid.Jid r4 = r8.A03(r4)     // Catch:{ all -> 0x0314 }
            com.whatsapp.jid.DeviceJid r4 = com.whatsapp.jid.DeviceJid.of(r4)     // Catch:{ all -> 0x0314 }
            if (r4 == 0) goto L_0x02b0
            com.whatsapp.jid.UserJid r4 = r4.getUserJid()     // Catch:{ all -> 0x0314 }
            r6.add(r4)     // Catch:{ all -> 0x0314 }
            goto L_0x02b0
        L_0x02ce:
            r9.close()     // Catch:{ all -> 0x153b }
            r1.close()     // Catch:{ all -> 0x163a }
            int r1 = r6.size()     // Catch:{ all -> 0x163a }
            if (r1 > 0) goto L_0x0325
            X.0tf r1 = r10.get()     // Catch:{ all -> 0x163a }
            X.0tg r10 = r1.A02     // Catch:{ all -> 0x153b }
            java.lang.String r9 = "SELECT receipt_user_jid_row_id,receipt_timestamp,read_timestamp,played_timestamp FROM receipt_user WHERE message_row_id = ?"
            java.lang.String[] r8 = new java.lang.String[r3]     // Catch:{ all -> 0x153b }
            long r4 = r0.A13     // Catch:{ all -> 0x153b }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x153b }
            r8[r12] = r4     // Catch:{ all -> 0x153b }
            android.database.Cursor r9 = r10.A08(r9, r8)     // Catch:{ all -> 0x153b }
            java.lang.String r4 = "receipt_user_jid_row_id"
            int r10 = r9.getColumnIndexOrThrow(r4)     // Catch:{ all -> 0x0314 }
        L_0x02f6:
            boolean r4 = r9.moveToNext()     // Catch:{ all -> 0x0314 }
            if (r4 == 0) goto L_0x0310
            X.14v r8 = r7.A01     // Catch:{ all -> 0x0314 }
            long r4 = r9.getLong(r10)     // Catch:{ all -> 0x0314 }
            com.whatsapp.jid.Jid r4 = r8.A03(r4)     // Catch:{ all -> 0x0314 }
            com.whatsapp.jid.UserJid r4 = com.whatsapp.jid.UserJid.of(r4)     // Catch:{ all -> 0x0314 }
            if (r4 == 0) goto L_0x02f6
            r6.add(r4)     // Catch:{ all -> 0x0314 }
            goto L_0x02f6
        L_0x0310:
            r9.close()     // Catch:{ all -> 0x153b }
            goto L_0x031c
        L_0x0314:
            r0 = move-exception
            if (r9 == 0) goto L_0x153a
            r9.close()     // Catch:{ all -> 0x153a }
            goto L_0x153a
        L_0x031c:
            r1.close()     // Catch:{ all -> 0x163a }
            int r1 = r6.size()     // Catch:{ all -> 0x163a }
            if (r1 <= 0) goto L_0x032d
        L_0x0325:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x163a }
            r1.<init>(r6)     // Catch:{ all -> 0x163a }
            r0.A0t(r1)     // Catch:{ all -> 0x163a }
        L_0x032d:
            boolean r1 = r0 instanceof X.C16730tY     // Catch:{ all -> 0x163a }
            if (r1 == 0) goto L_0x0351
            X.17I r1 = r2.A0H     // Catch:{ all -> 0x163a }
            r9 = r0
            X.0tY r9 = (X.C16730tY) r9     // Catch:{ all -> 0x163a }
            boolean r4 = r1.A09()     // Catch:{ all -> 0x163a }
            if (r4 != 0) goto L_0x036b
            java.lang.String r4 = "MediaCoreMessageStore/fillMediaInfo/mediaCoreMessageStore not ready"
            com.whatsapp.util.Log.w((java.lang.String) r4)     // Catch:{ all -> 0x163a }
            X.0ta r5 = r9.A02     // Catch:{ all -> 0x163a }
            if (r5 == 0) goto L_0x0351
            java.io.File r4 = r5.A0F     // Catch:{ all -> 0x163a }
            if (r4 == 0) goto L_0x0351
            X.0sc r1 = r1.A00     // Catch:{ all -> 0x163a }
            java.io.File r1 = r1.A06(r4)     // Catch:{ all -> 0x163a }
            r5.A0F = r1     // Catch:{ all -> 0x163a }
        L_0x0351:
            boolean r1 = r0 instanceof X.C38631rA     // Catch:{ all -> 0x163a }
            if (r1 == 0) goto L_0x04cf
            X.17m r5 = r2.A0Z     // Catch:{ all -> 0x163a }
            r9 = r0
            X.1rA r9 = (X.C38631rA) r9     // Catch:{ all -> 0x163a }
            int r4 = r9.A08     // Catch:{ all -> 0x163a }
            r1 = 7
            if (r4 != r1) goto L_0x04cf
            X.0ta r1 = r9.A02     // Catch:{ all -> 0x163a }
            if (r1 == 0) goto L_0x04cf
            X.0tq r1 = r5.A09     // Catch:{ all -> 0x163a }
            X.0tf r8 = r1.get()     // Catch:{ all -> 0x163a }
            goto L_0x0494
        L_0x036b:
            long r4 = r9.A13     // Catch:{ all -> 0x163a }
            r10 = 0
            r28 = 0
            int r7 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            r6 = 0
            if (r7 <= 0) goto L_0x0377
            r6 = 1
        L_0x0377:
            java.lang.String r4 = "MediaCoreMessageStore/fillMediaInfo/message must have row_id set; key="
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x163a }
            r5.<init>(r4)     // Catch:{ all -> 0x163a }
            X.1Vw r4 = r9.A11     // Catch:{ all -> 0x163a }
            r5.append(r4)     // Catch:{ all -> 0x163a }
            java.lang.String r4 = r5.toString()     // Catch:{ all -> 0x163a }
            X.AnonymousClass00B.A0C(r4, r6)     // Catch:{ all -> 0x163a }
            java.lang.String[] r6 = new java.lang.String[r3]     // Catch:{ all -> 0x163a }
            long r4 = r9.A13     // Catch:{ all -> 0x163a }
            java.lang.String r4 = java.lang.Long.toString(r4)     // Catch:{ all -> 0x163a }
            r6[r28] = r4     // Catch:{ all -> 0x163a }
            X.0tq r7 = r1.A02     // Catch:{ all -> 0x163a }
            X.0tf r27 = r7.get()     // Catch:{ all -> 0x163a }
            r4 = r27
            X.0tg r5 = r4.A02     // Catch:{ all -> 0x1635 }
            java.lang.String r4 = "SELECT message_row_id, chat_row_id, autotransfer_retry_enabled, multicast_id, media_job_uuid, transferred, transcoded, file_path, file_size, suspicious_content, trim_from, trim_to, face_x, face_y, media_key, media_key_timestamp, width, height, has_streaming_sidecar, gif_attribution, thumbnail_height_width_ratio, direct_path, first_scan_sidecar, first_scan_length, message_url, mime_type, file_length, media_name, file_hash, media_duration, page_count, enc_file_hash, partial_media_hash, partial_media_enc_hash, is_animated_sticker, original_file_hash, mute_video, media_caption FROM message_media WHERE message_row_id = ?"
            android.database.Cursor r10 = r5.A08(r4, r6)     // Catch:{ all -> 0x1635 }
            boolean r4 = r10.moveToNext()     // Catch:{ all -> 0x162e }
            if (r4 == 0) goto L_0x0464
            X.0ta r13 = r1.A02(r10)     // Catch:{ all -> 0x162e }
            long r4 = r9.A13     // Catch:{ all -> 0x162e }
            r11 = 0
            int r1 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            r6 = 0
            if (r1 <= 0) goto L_0x03b8
            r6 = 1
        L_0x03b8:
            java.lang.String r1 = "MediaCoreMessageStore/loadInteractiveAnnotations/invalid row_id"
            X.AnonymousClass00B.A0C(r1, r6)     // Catch:{ all -> 0x162e }
            X.0tf r26 = r7.get()     // Catch:{ all -> 0x162e }
            r1 = r26
            X.0tg r12 = r1.A02     // Catch:{ all -> 0x1629 }
            java.lang.String r6 = "SELECT _id, message_row_id, location_latitude, location_longitude, location_name, sort_order FROM message_media_interactive_annotation WHERE message_row_id = ? ORDER BY sort_order"
            java.lang.String[] r1 = new java.lang.String[r3]     // Catch:{ all -> 0x1629 }
            java.lang.String r4 = java.lang.Long.toString(r4)     // Catch:{ all -> 0x1629 }
            r1[r28] = r4     // Catch:{ all -> 0x1629 }
            android.database.Cursor r8 = r12.A08(r6, r1)     // Catch:{ all -> 0x1629 }
            int r11 = r8.getCount()     // Catch:{ all -> 0x1622 }
            com.obwhatsapp.InteractiveAnnotation[] r1 = new com.obwhatsapp.InteractiveAnnotation[r11]     // Catch:{ all -> 0x1622 }
            r24 = 0
        L_0x03db:
            boolean r4 = r8.moveToNext()     // Catch:{ all -> 0x1622 }
            if (r4 == 0) goto L_0x0456
            java.lang.String r4 = "_id"
            int r4 = r8.getColumnIndexOrThrow(r4)     // Catch:{ all -> 0x1622 }
            long r6 = r8.getLong(r4)     // Catch:{ all -> 0x1622 }
            java.lang.String r5 = "SELECT message_media_interactive_annotation_row_id, x, y, sort_order FROM message_media_interactive_annotation_vertex WHERE message_media_interactive_annotation_row_id = ? ORDER BY sort_order"
            java.lang.String[] r4 = new java.lang.String[r3]     // Catch:{ all -> 0x1622 }
            java.lang.String r6 = java.lang.Long.toString(r6)     // Catch:{ all -> 0x1622 }
            r4[r28] = r6     // Catch:{ all -> 0x1622 }
            android.database.Cursor r15 = r12.A08(r5, r4)     // Catch:{ all -> 0x1622 }
            int r4 = r15.getCount()     // Catch:{ all -> 0x161b }
            com.obwhatsapp.SerializablePoint[] r4 = new com.obwhatsapp.SerializablePoint[r4]     // Catch:{ all -> 0x161b }
            r23 = r4
            r19 = 0
        L_0x0403:
            boolean r4 = r15.moveToNext()     // Catch:{ all -> 0x161b }
            if (r4 == 0) goto L_0x0429
            java.lang.String r4 = "x"
            int r4 = r15.getColumnIndexOrThrow(r4)     // Catch:{ all -> 0x161b }
            double r6 = r15.getDouble(r4)     // Catch:{ all -> 0x161b }
            java.lang.String r4 = "y"
            int r4 = r15.getColumnIndexOrThrow(r4)     // Catch:{ all -> 0x161b }
            double r4 = r15.getDouble(r4)     // Catch:{ all -> 0x161b }
            com.obwhatsapp.SerializablePoint r14 = new com.obwhatsapp.SerializablePoint     // Catch:{ all -> 0x161b }
            r14.<init>(r6, r4)     // Catch:{ all -> 0x161b }
            r23[r19] = r14     // Catch:{ all -> 0x161b }
            int r19 = r19 + 1
            goto L_0x0403
        L_0x0429:
            r15.close()     // Catch:{ all -> 0x1622 }
            java.lang.String r4 = "location_latitude"
            int r4 = r8.getColumnIndexOrThrow(r4)     // Catch:{ all -> 0x1622 }
            double r32 = r8.getDouble(r4)     // Catch:{ all -> 0x1622 }
            java.lang.String r4 = "location_longitude"
            int r4 = r8.getColumnIndexOrThrow(r4)     // Catch:{ all -> 0x1622 }
            double r34 = r8.getDouble(r4)     // Catch:{ all -> 0x1622 }
            java.lang.String r4 = "location_name"
            int r4 = r8.getColumnIndexOrThrow(r4)     // Catch:{ all -> 0x1622 }
            java.lang.String r30 = r8.getString(r4)     // Catch:{ all -> 0x1622 }
            com.obwhatsapp.InteractiveAnnotation r29 = new com.obwhatsapp.InteractiveAnnotation     // Catch:{ all -> 0x1622 }
            r31 = r23
            r29.<init>(r30, r31, r32, r34)     // Catch:{ all -> 0x1622 }
            r1[r24] = r29     // Catch:{ all -> 0x1622 }
            int r24 = r24 + 1
            goto L_0x03db
        L_0x0456:
            r8.close()     // Catch:{ all -> 0x1629 }
            r26.close()     // Catch:{ all -> 0x162e }
            if (r11 != 0) goto L_0x045f
            r1 = 0
        L_0x045f:
            r13.A0V = r1     // Catch:{ all -> 0x162e }
            r9.A15(r10, r13)     // Catch:{ all -> 0x162e }
        L_0x0464:
            r10.close()     // Catch:{ all -> 0x1635 }
            r27.close()     // Catch:{ all -> 0x163a }
            X.0ta r1 = r9.A02     // Catch:{ all -> 0x163a }
            if (r1 != 0) goto L_0x0351
            java.lang.String r1 = "MediaCoreMessageStore/fillMediaInfo; media was not found for message: id="
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x163a }
            r6.<init>(r1)     // Catch:{ all -> 0x163a }
            long r4 = r9.A13     // Catch:{ all -> 0x163a }
            r6.append(r4)     // Catch:{ all -> 0x163a }
            java.lang.String r1 = ", type="
            r6.append(r1)     // Catch:{ all -> 0x163a }
            byte r1 = r9.A10     // Catch:{ all -> 0x163a }
            r6.append(r1)     // Catch:{ all -> 0x163a }
            java.lang.String r1 = r6.toString()     // Catch:{ all -> 0x163a }
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ all -> 0x163a }
            X.0ta r1 = new X.0ta     // Catch:{ all -> 0x163a }
            r1.<init>()     // Catch:{ all -> 0x163a }
            r9.A02 = r1     // Catch:{ all -> 0x163a }
            goto L_0x0351
        L_0x0494:
            X.0tg r7 = r8.A02     // Catch:{ all -> 0x04c6 }
            java.lang.String r6 = "SELECT count FROM message_media_vcard_count WHERE message_row_id = ?"
            java.lang.String[] r1 = new java.lang.String[r3]     // Catch:{ all -> 0x04c6 }
            r10 = 0
            long r4 = r9.A13     // Catch:{ all -> 0x04c6 }
            java.lang.String r4 = java.lang.Long.toString(r4)     // Catch:{ all -> 0x04c6 }
            r1[r10] = r4     // Catch:{ all -> 0x04c6 }
            android.database.Cursor r4 = r7.A08(r6, r1)     // Catch:{ all -> 0x04c6 }
            boolean r1 = r4.moveToFirst()     // Catch:{ all -> 0x04bf }
            if (r1 == 0) goto L_0x04bb
            X.0ta r5 = r9.A02     // Catch:{ all -> 0x04bf }
            java.lang.String r1 = "count"
            int r1 = r4.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x04bf }
            int r1 = r4.getInt(r1)     // Catch:{ all -> 0x04bf }
            r5.A01 = r1     // Catch:{ all -> 0x04bf }
        L_0x04bb:
            r4.close()     // Catch:{ all -> 0x04c6 }
            goto L_0x04cc
        L_0x04bf:
            r0 = move-exception
            if (r4 == 0) goto L_0x04c5
            r4.close()     // Catch:{ all -> 0x04c5 }
        L_0x04c5:
            throw r0     // Catch:{ all -> 0x04c6 }
        L_0x04c6:
            r0 = move-exception
            r8.close()     // Catch:{ all -> 0x1639 }
            goto L_0x1639
        L_0x04cc:
            r8.close()     // Catch:{ all -> 0x163a }
        L_0x04cf:
            boolean r1 = r0 instanceof X.C30591cd     // Catch:{ all -> 0x163a }
            if (r1 == 0) goto L_0x04d8
            X.17z r1 = r2.A0X     // Catch:{ all -> 0x163a }
            r1.A01(r0)     // Catch:{ all -> 0x163a }
        L_0x04d8:
            boolean r1 = r0 instanceof X.C38891ra     // Catch:{ all -> 0x163a }
            if (r1 == 0) goto L_0x04e6
            X.17u r5 = r2.A0U     // Catch:{ all -> 0x163a }
            r4 = r0
            X.1ra r4 = (X.C38891ra) r4     // Catch:{ all -> 0x163a }
            java.lang.String r1 = "SELECT message_row_id, business_owner_jid, product_id, title, description, currency_code, amount_1000, retailer_id, url, product_image_count, sale_amount_1000, body, footer FROM message_product WHERE message_row_id= ?"
            r5.A02(r4, r1)     // Catch:{ all -> 0x163a }
        L_0x04e6:
            boolean r1 = r0 instanceof X.C38981rj     // Catch:{ all -> 0x163a }
            if (r1 == 0) goto L_0x04f4
            X.17t r5 = r2.A04     // Catch:{ all -> 0x163a }
            r4 = r0
            X.1rj r4 = (X.C38981rj) r4     // Catch:{ all -> 0x163a }
            java.lang.String r1 = "SELECT message_row_id, business_owner_jid, title, description FROM message_product WHERE message_row_id=?"
            r5.A02(r4, r1)     // Catch:{ all -> 0x163a }
        L_0x04f4:
            boolean r1 = r0 instanceof X.C38741rL     // Catch:{ all -> 0x163a }
            if (r1 == 0) goto L_0x0519
            X.17m r8 = r2.A0Z     // Catch:{ all -> 0x163a }
            r6 = r0
            X.1rL r6 = (X.C38741rL) r6     // Catch:{ all -> 0x163a }
            boolean r1 = r8.A09()     // Catch:{ all -> 0x163a }
            if (r1 == 0) goto L_0x0519
            long r4 = r6.A13     // Catch:{ all -> 0x163a }
            r7 = 0
            java.util.List r4 = r8.A01(r4, r7)     // Catch:{ all -> 0x163a }
            boolean r1 = r4.isEmpty()     // Catch:{ all -> 0x163a }
            if (r1 != 0) goto L_0x0519
            java.lang.Object r1 = r4.get(r7)     // Catch:{ all -> 0x163a }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x163a }
            r6.A13(r1)     // Catch:{ all -> 0x163a }
        L_0x0519:
            boolean r1 = r0 instanceof X.C38811rS     // Catch:{ all -> 0x163a }
            if (r1 == 0) goto L_0x0538
            X.17m r7 = r2.A0Z     // Catch:{ all -> 0x163a }
            r6 = r0
            X.1rS r6 = (X.C38811rS) r6     // Catch:{ all -> 0x163a }
            boolean r1 = r7.A09()     // Catch:{ all -> 0x163a }
            if (r1 == 0) goto L_0x0538
            long r4 = r6.A13     // Catch:{ all -> 0x163a }
            r1 = 0
            java.util.List r4 = r7.A01(r4, r1)     // Catch:{ all -> 0x163a }
            boolean r1 = r4.isEmpty()     // Catch:{ all -> 0x163a }
            if (r1 != 0) goto L_0x0538
            r6.A13(r4)     // Catch:{ all -> 0x163a }
        L_0x0538:
            boolean r1 = r0 instanceof X.C38761rN     // Catch:{ all -> 0x163a }
            if (r1 == 0) goto L_0x0556
            r8 = r0
            X.1rN r8 = (X.C38761rN) r8     // Catch:{ all -> 0x163a }
            X.199 r6 = r2.A03     // Catch:{ all -> 0x163a }
            boolean r1 = r8.A00     // Catch:{ all -> 0x163a }
            if (r1 == 0) goto L_0x0569
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x163a }
            r5.<init>()     // Catch:{ all -> 0x163a }
            X.1po r1 = r8.A12()     // Catch:{ all -> 0x163a }
            if (r1 == 0) goto L_0x0553
            r5.add(r1)     // Catch:{ all -> 0x163a }
        L_0x0553:
            r8.A14(r5)     // Catch:{ all -> 0x163a }
        L_0x0556:
            boolean r1 = r0 instanceof X.C38771rO     // Catch:{ all -> 0x163a }
            if (r1 == 0) goto L_0x076f
            r5 = r0
            X.1rO r5 = (X.C38771rO) r5     // Catch:{ all -> 0x163a }
            X.17p r8 = r2.A0N     // Catch:{ all -> 0x163a }
            boolean r1 = r5.A00     // Catch:{ all -> 0x163a }
            if (r1 == 0) goto L_0x0666
            X.1po r6 = r5.A12()     // Catch:{ all -> 0x163a }
            goto L_0x074a
        L_0x0569:
            java.lang.String[] r1 = new java.lang.String[r3]     // Catch:{ all -> 0x163a }
            long r4 = r8.A13     // Catch:{ all -> 0x163a }
            java.lang.String r4 = java.lang.Long.toString(r4)     // Catch:{ all -> 0x163a }
            r39 = 0
            r1[r39] = r4     // Catch:{ all -> 0x163a }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x163a }
            r5.<init>()     // Catch:{ all -> 0x163a }
            X.0tq r4 = r6.A03     // Catch:{ all -> 0x163a }
            X.0tf r23 = r4.get()     // Catch:{ all -> 0x163a }
            r4.A04()     // Catch:{ all -> 0x1616 }
            java.lang.String r6 = "call_logs"
            r4 = r23
            X.0tg r7 = r4.A02     // Catch:{ all -> 0x1616 }
            X.AnonymousClass00B.A06(r7)     // Catch:{ all -> 0x1616 }
            java.lang.String r4 = "table"
            java.lang.String r4 = X.C33961jT.A00(r7, r4, r6)     // Catch:{ all -> 0x1616 }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x1616 }
            r4 = r4 ^ 1
            if (r4 == 0) goto L_0x0661
            java.lang.String r4 = "SELECT _id, transaction_id, timestamp, video_call, duration, call_result, bytes_transferred FROM call_logs WHERE message_row_id = ?"
            android.database.Cursor r1 = r7.A08(r4, r1)     // Catch:{ all -> 0x1616 }
            java.lang.String r6 = "_id"
            int r19 = r1.getColumnIndexOrThrow(r6)     // Catch:{ all -> 0x160f }
        L_0x05a7:
            boolean r4 = r1.moveToNext()     // Catch:{ all -> 0x160f }
            if (r4 == 0) goto L_0x065e
            r4 = r19
            long r10 = r1.getLong(r4)     // Catch:{ all -> 0x160f }
            java.lang.String[] r9 = new java.lang.String[r3]     // Catch:{ all -> 0x160f }
            java.lang.String r4 = java.lang.Long.toString(r10)     // Catch:{ all -> 0x160f }
            r9[r39] = r4     // Catch:{ all -> 0x160f }
            java.lang.String r4 = "SELECT _id, jid, call_result FROM call_log_participant WHERE call_logs_row_id = ? ORDER BY _id"
            android.database.Cursor r4 = r7.A08(r4, r9)     // Catch:{ all -> 0x160f }
            int r9 = r1.getColumnIndexOrThrow(r6)     // Catch:{ all -> 0x1608 }
            long r32 = r1.getLong(r9)     // Catch:{ all -> 0x1608 }
            java.lang.String r9 = "transaction_id"
            int r9 = r1.getColumnIndexOrThrow(r9)     // Catch:{ all -> 0x1608 }
            int r29 = r1.getInt(r9)     // Catch:{ all -> 0x1608 }
            java.lang.String r9 = "timestamp"
            int r9 = r1.getColumnIndexOrThrow(r9)     // Catch:{ all -> 0x1608 }
            long r34 = r1.getLong(r9)     // Catch:{ all -> 0x1608 }
            java.lang.String r9 = "video_call"
            int r9 = r1.getColumnIndexOrThrow(r9)     // Catch:{ all -> 0x1608 }
            int r9 = r1.getInt(r9)     // Catch:{ all -> 0x1608 }
            r38 = 0
            if (r9 <= 0) goto L_0x05f0
            r38 = 1
        L_0x05f0:
            java.lang.String r9 = "duration"
            int r9 = r1.getColumnIndexOrThrow(r9)     // Catch:{ all -> 0x1608 }
            int r30 = r1.getInt(r9)     // Catch:{ all -> 0x1608 }
            java.lang.String r10 = "call_result"
            int r9 = r1.getColumnIndexOrThrow(r10)     // Catch:{ all -> 0x1608 }
            int r31 = r1.getInt(r9)     // Catch:{ all -> 0x1608 }
            java.lang.String r9 = "bytes_transferred"
            int r9 = r1.getColumnIndexOrThrow(r9)     // Catch:{ all -> 0x1608 }
            long r36 = r1.getLong(r9)     // Catch:{ all -> 0x1608 }
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch:{ all -> 0x1608 }
            r15.<init>()     // Catch:{ all -> 0x1608 }
        L_0x0613:
            boolean r9 = r4.moveToNext()     // Catch:{ all -> 0x1608 }
            if (r9 == 0) goto L_0x0646
            int r9 = r4.getColumnIndexOrThrow(r6)     // Catch:{ all -> 0x1608 }
            long r11 = r4.getLong(r9)     // Catch:{ all -> 0x1608 }
            java.lang.String r9 = "jid"
            int r9 = r4.getColumnIndexOrThrow(r9)     // Catch:{ all -> 0x1608 }
            java.lang.String r9 = r4.getString(r9)     // Catch:{ all -> 0x1608 }
            com.whatsapp.jid.UserJid r14 = com.whatsapp.jid.UserJid.getNullable(r9)     // Catch:{ all -> 0x1608 }
            boolean r9 = X.C16030sJ.A0O(r14)     // Catch:{ all -> 0x1608 }
            if (r9 == 0) goto L_0x0613
            int r9 = r4.getColumnIndexOrThrow(r10)     // Catch:{ all -> 0x1608 }
            int r13 = r4.getInt(r9)     // Catch:{ all -> 0x1608 }
            X.1r1 r9 = new X.1r1     // Catch:{ all -> 0x1608 }
            r9.<init>(r14, r13, r11)     // Catch:{ all -> 0x1608 }
            r15.add(r9)     // Catch:{ all -> 0x1608 }
            goto L_0x0613
        L_0x0646:
            r40 = 0
            r41 = 0
            r26 = r22
            r27 = r8
            r28 = r15
            X.1po r9 = X.C37831po.A00(r26, r27, r28, r29, r30, r31, r32, r34, r36, r38, r39, r40, r41)     // Catch:{ all -> 0x1608 }
            if (r9 == 0) goto L_0x0659
            r5.add(r9)     // Catch:{ all -> 0x1608 }
        L_0x0659:
            r4.close()     // Catch:{ all -> 0x160f }
            goto L_0x05a7
        L_0x065e:
            r1.close()     // Catch:{ all -> 0x1616 }
        L_0x0661:
            r23.close()     // Catch:{ all -> 0x163a }
            goto L_0x0553
        L_0x0666:
            X.0tq r1 = r8.A01     // Catch:{ all -> 0x163a }
            X.0tf r15 = r1.get()     // Catch:{ all -> 0x163a }
            X.0tg r9 = r15.A02     // Catch:{ all -> 0x0766 }
            java.lang.String r4 = "SELECT _id, timestamp, video_call, group_jid_row_id, is_joinable_group_call, is_dnd_mode_on FROM missed_call_logs WHERE message_row_id = ? ORDER BY timestamp ASC"
            java.lang.String[] r1 = new java.lang.String[r3]     // Catch:{ all -> 0x0766 }
            long r6 = r5.A13     // Catch:{ all -> 0x0766 }
            java.lang.String r6 = java.lang.Long.toString(r6)     // Catch:{ all -> 0x0766 }
            r29 = 0
            r1[r29] = r6     // Catch:{ all -> 0x0766 }
            android.database.Cursor r1 = r9.A08(r4, r1)     // Catch:{ all -> 0x0766 }
            boolean r4 = r1.moveToNext()     // Catch:{ all -> 0x075f }
            if (r4 == 0) goto L_0x075b
            java.lang.String r7 = "_id"
            int r4 = r1.getColumnIndexOrThrow(r7)     // Catch:{ all -> 0x075f }
            long r10 = r1.getLong(r4)     // Catch:{ all -> 0x075f }
            java.lang.String r6 = "SELECT _id, jid, call_result FROM missed_call_log_participant WHERE call_logs_row_id = ? ORDER BY _id ASC"
            java.lang.String[] r4 = new java.lang.String[r3]     // Catch:{ all -> 0x075f }
            java.lang.String r10 = java.lang.Long.toString(r10)     // Catch:{ all -> 0x075f }
            r4[r29] = r10     // Catch:{ all -> 0x075f }
            android.database.Cursor r4 = r9.A08(r6, r4)     // Catch:{ all -> 0x075f }
            int r6 = r1.getColumnIndexOrThrow(r7)     // Catch:{ all -> 0x0754 }
            long r32 = r1.getLong(r6)     // Catch:{ all -> 0x0754 }
            java.lang.String r6 = "timestamp"
            int r6 = r1.getColumnIndexOrThrow(r6)     // Catch:{ all -> 0x0754 }
            long r34 = r1.getLong(r6)     // Catch:{ all -> 0x0754 }
            java.lang.String r6 = "video_call"
            int r6 = r1.getColumnIndexOrThrow(r6)     // Catch:{ all -> 0x0754 }
            int r6 = r1.getInt(r6)     // Catch:{ all -> 0x0754 }
            r38 = 0
            if (r6 <= 0) goto L_0x06c2
            r38 = 1
        L_0x06c2:
            java.lang.String r6 = "group_jid_row_id"
            int r6 = r1.getColumnIndexOrThrow(r6)     // Catch:{ all -> 0x0754 }
            int r13 = r1.getInt(r6)     // Catch:{ all -> 0x0754 }
            java.lang.String r6 = "is_joinable_group_call"
            int r6 = r1.getColumnIndexOrThrow(r6)     // Catch:{ all -> 0x0754 }
            int r6 = r1.getInt(r6)     // Catch:{ all -> 0x0754 }
            r41 = 0
            if (r6 <= 0) goto L_0x06dc
            r41 = 1
        L_0x06dc:
            java.lang.String r6 = "is_dnd_mode_on"
            int r6 = r1.getColumnIndexOrThrow(r6)     // Catch:{ all -> 0x0754 }
            int r6 = r1.getInt(r6)     // Catch:{ all -> 0x0754 }
            r39 = 0
            if (r6 <= 0) goto L_0x06ec
            r39 = 1
        L_0x06ec:
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch:{ all -> 0x0754 }
            r14.<init>()     // Catch:{ all -> 0x0754 }
        L_0x06f1:
            boolean r6 = r4.moveToNext()     // Catch:{ all -> 0x0754 }
            if (r6 == 0) goto L_0x0726
            int r6 = r4.getColumnIndexOrThrow(r7)     // Catch:{ all -> 0x0754 }
            long r10 = r4.getLong(r6)     // Catch:{ all -> 0x0754 }
            java.lang.String r6 = "jid"
            int r6 = r4.getColumnIndexOrThrow(r6)     // Catch:{ all -> 0x0754 }
            java.lang.String r6 = r4.getString(r6)     // Catch:{ all -> 0x0754 }
            com.whatsapp.jid.UserJid r12 = com.whatsapp.jid.UserJid.getNullable(r6)     // Catch:{ all -> 0x0754 }
            boolean r6 = X.C16030sJ.A0O(r12)     // Catch:{ all -> 0x0754 }
            if (r6 == 0) goto L_0x06f1
            java.lang.String r6 = "call_result"
            int r6 = r4.getColumnIndexOrThrow(r6)     // Catch:{ all -> 0x0754 }
            int r9 = r4.getInt(r6)     // Catch:{ all -> 0x0754 }
            X.1r1 r6 = new X.1r1     // Catch:{ all -> 0x0754 }
            r6.<init>(r12, r9, r10)     // Catch:{ all -> 0x0754 }
            r14.add(r6)     // Catch:{ all -> 0x0754 }
            goto L_0x06f1
        L_0x0726:
            r31 = 2
            r36 = 0
            X.14v r8 = r8.A00     // Catch:{ all -> 0x0754 }
            long r6 = (long) r13     // Catch:{ all -> 0x0754 }
            com.whatsapp.jid.Jid r6 = r8.A03(r6)     // Catch:{ all -> 0x0754 }
            com.whatsapp.jid.GroupJid r26 = com.whatsapp.jid.GroupJid.of(r6)     // Catch:{ all -> 0x0754 }
            r30 = 0
            r40 = 1
            r27 = r5
            r28 = r14
            X.1po r6 = X.C37831po.A00(r26, r27, r28, r29, r30, r31, r32, r34, r36, r38, r39, r40, r41)     // Catch:{ all -> 0x0754 }
            r4.close()     // Catch:{ all -> 0x075f }
            r1.close()     // Catch:{ all -> 0x0766 }
            r15.close()     // Catch:{ all -> 0x163a }
        L_0x074a:
            if (r6 == 0) goto L_0x076f
            java.util.List r1 = java.util.Collections.singletonList(r6)     // Catch:{ all -> 0x163a }
            r5.A14(r1)     // Catch:{ all -> 0x163a }
            goto L_0x076f
        L_0x0754:
            r0 = move-exception
            if (r4 == 0) goto L_0x075a
            r4.close()     // Catch:{ all -> 0x075a }
        L_0x075a:
            throw r0     // Catch:{ all -> 0x075f }
        L_0x075b:
            r1.close()     // Catch:{ all -> 0x0766 }
            goto L_0x076c
        L_0x075f:
            r0 = move-exception
            if (r1 == 0) goto L_0x0765
            r1.close()     // Catch:{ all -> 0x0765 }
        L_0x0765:
            throw r0     // Catch:{ all -> 0x0766 }
        L_0x0766:
            r0 = move-exception
            r15.close()     // Catch:{ all -> 0x1639 }
            goto L_0x1639
        L_0x076c:
            r15.close()     // Catch:{ all -> 0x163a }
        L_0x076f:
            boolean r1 = r0 instanceof X.C30071bh     // Catch:{ all -> 0x163a }
            if (r1 == 0) goto L_0x081b
            X.185 r1 = r2.A0D     // Catch:{ all -> 0x163a }
            r15 = r0
            X.1bh r15 = (X.C30071bh) r15     // Catch:{ all -> 0x163a }
            java.lang.String[] r6 = new java.lang.String[r3]     // Catch:{ all -> 0x163a }
            long r4 = r15.A13     // Catch:{ all -> 0x163a }
            java.lang.String r5 = java.lang.Long.toString(r4)     // Catch:{ all -> 0x163a }
            r4 = 0
            r6[r4] = r5     // Catch:{ all -> 0x163a }
            X.0tq r4 = r1.A02     // Catch:{ all -> 0x163a }
            X.0tf r23 = r4.get()     // Catch:{ all -> 0x163a }
            r4 = r23
            X.0tg r5 = r4.A02     // Catch:{ all -> 0x1616 }
            java.lang.String r4 = "SELECT group_jid_row_id, admin_jid_row_id, group_name, invite_code, expiration , expired , group_type FROM message_group_invite WHERE message_row_id = ?"
            android.database.Cursor r14 = r5.A08(r4, r6)     // Catch:{ all -> 0x1616 }
            boolean r4 = r14.moveToNext()     // Catch:{ all -> 0x0810 }
            if (r4 == 0) goto L_0x080c
            java.lang.String r4 = "expiration"
            int r4 = r14.getColumnIndexOrThrow(r4)     // Catch:{ all -> 0x0810 }
            long r8 = r14.getLong(r4)     // Catch:{ all -> 0x0810 }
            java.lang.String r4 = "group_jid_row_id"
            int r4 = r14.getColumnIndexOrThrow(r4)     // Catch:{ all -> 0x0810 }
            long r6 = r14.getLong(r4)     // Catch:{ all -> 0x0810 }
            java.lang.String r4 = "admin_jid_row_id"
            int r4 = r14.getColumnIndexOrThrow(r4)     // Catch:{ all -> 0x0810 }
            long r4 = r14.getLong(r4)     // Catch:{ all -> 0x0810 }
            java.lang.String r10 = "group_name"
            int r10 = r14.getColumnIndexOrThrow(r10)     // Catch:{ all -> 0x0810 }
            java.lang.String r13 = r14.getString(r10)     // Catch:{ all -> 0x0810 }
            java.lang.String r10 = "invite_code"
            int r10 = r14.getColumnIndexOrThrow(r10)     // Catch:{ all -> 0x0810 }
            java.lang.String r12 = r14.getString(r10)     // Catch:{ all -> 0x0810 }
            java.lang.String r10 = "expired"
            int r10 = r14.getColumnIndexOrThrow(r10)     // Catch:{ all -> 0x0810 }
            int r19 = r14.getInt(r10)     // Catch:{ all -> 0x0810 }
            java.lang.String r10 = "group_type"
            int r10 = r14.getColumnIndexOrThrow(r10)     // Catch:{ all -> 0x0810 }
            int r11 = r14.getInt(r10)     // Catch:{ all -> 0x0810 }
            X.14v r10 = r1.A01     // Catch:{ all -> 0x0810 }
            java.lang.Class<X.0sL> r1 = X.C16050sL.class
            com.whatsapp.jid.Jid r6 = r10.A07(r1, r6)     // Catch:{ all -> 0x0810 }
            X.0sL r6 = (X.C16050sL) r6     // Catch:{ all -> 0x0810 }
            java.lang.Class<com.whatsapp.jid.UserJid> r1 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r4 = r10.A07(r1, r4)     // Catch:{ all -> 0x0810 }
            com.whatsapp.jid.UserJid r4 = (com.whatsapp.jid.UserJid) r4     // Catch:{ all -> 0x0810 }
            if (r6 == 0) goto L_0x07f6
            r1 = 1
            if (r4 != 0) goto L_0x07f7
        L_0x07f6:
            r1 = 0
        L_0x07f7:
            X.AnonymousClass00B.A0G(r1)     // Catch:{ all -> 0x0810 }
            r1 = 0
            if (r19 == 0) goto L_0x07fe
            r1 = 1
        L_0x07fe:
            r15.A02 = r6     // Catch:{ all -> 0x0810 }
            r15.A03 = r4     // Catch:{ all -> 0x0810 }
            r15.A05 = r13     // Catch:{ all -> 0x0810 }
            r15.A06 = r12     // Catch:{ all -> 0x0810 }
            r15.A01 = r8     // Catch:{ all -> 0x0810 }
            r15.A07 = r1     // Catch:{ all -> 0x0810 }
            r15.A00 = r11     // Catch:{ all -> 0x0810 }
        L_0x080c:
            r14.close()     // Catch:{ all -> 0x1616 }
            goto L_0x0818
        L_0x0810:
            r0 = move-exception
            if (r14 == 0) goto L_0x1615
            r14.close()     // Catch:{ all -> 0x1615 }
            goto L_0x1615
        L_0x0818:
            r23.close()     // Catch:{ all -> 0x163a }
        L_0x081b:
            boolean r1 = r0 instanceof X.C39021rn     // Catch:{ all -> 0x163a }
            if (r1 == 0) goto L_0x082a
            X.17l r6 = r2.A0P     // Catch:{ all -> 0x163a }
            r5 = r0
            X.1rn r5 = (X.C39021rn) r5     // Catch:{ all -> 0x163a }
            java.lang.String r4 = "SELECT message_row_id, order_id, thumbnail, order_title, item_count, status, surface, message, seller_jid, token, currency_code,total_amount_1000 FROM message_order WHERE message_row_id=?"
            r1 = 0
            r6.A03(r5, r4, r1)     // Catch:{ all -> 0x163a }
        L_0x082a:
            boolean r1 = r0 instanceof X.C30901d9     // Catch:{ all -> 0x163a }
            if (r1 == 0) goto L_0x0880
            X.17x r7 = r2.A0F     // Catch:{ all -> 0x163a }
            r6 = r0
            X.1d9 r6 = (X.C30901d9) r6     // Catch:{ all -> 0x163a }
            boolean r1 = r7.A02()     // Catch:{ all -> 0x163a }
            if (r1 == 0) goto L_0x0880
            long r4 = r6.A13     // Catch:{ all -> 0x163a }
            r10 = 0
            r9 = 0
            int r1 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            r5 = 0
            if (r1 <= 0) goto L_0x0844
            r5 = 1
        L_0x0844:
            java.lang.String r1 = "LocationMessageStore/fillLocationInfo/message must have row_id set; key="
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x163a }
            r4.<init>(r1)     // Catch:{ all -> 0x163a }
            X.1Vw r1 = r6.A11     // Catch:{ all -> 0x163a }
            r4.append(r1)     // Catch:{ all -> 0x163a }
            java.lang.String r1 = r4.toString()     // Catch:{ all -> 0x163a }
            X.AnonymousClass00B.A0C(r1, r5)     // Catch:{ all -> 0x163a }
            java.lang.String[] r8 = new java.lang.String[r3]     // Catch:{ all -> 0x163a }
            long r4 = r6.A13     // Catch:{ all -> 0x163a }
            java.lang.String r1 = java.lang.Long.toString(r4)     // Catch:{ all -> 0x163a }
            r8[r9] = r1     // Catch:{ all -> 0x163a }
            X.0tq r1 = r7.A02     // Catch:{ all -> 0x163a }
            X.0tf r1 = r1.get()     // Catch:{ all -> 0x163a }
            X.0tg r5 = r1.A02     // Catch:{ all -> 0x153b }
            java.lang.String r4 = "SELECT latitude, longitude, place_name, place_address, url, live_location_share_duration, live_location_sequence_number, live_location_final_latitude, live_location_final_longitude, live_location_final_timestamp, map_download_status FROM message_location WHERE message_row_id = ?"
            android.database.Cursor r4 = r5.A08(r4, r8)     // Catch:{ all -> 0x153b }
            boolean r5 = r4.moveToNext()     // Catch:{ all -> 0x0a09 }
            if (r5 == 0) goto L_0x087a
            X.0sK r5 = r7.A00     // Catch:{ all -> 0x0a09 }
            r6.A13(r4, r5)     // Catch:{ all -> 0x0a09 }
        L_0x087a:
            r4.close()     // Catch:{ all -> 0x153b }
            r1.close()     // Catch:{ all -> 0x163a }
        L_0x0880:
            boolean r1 = r0 instanceof X.C30581cc     // Catch:{ all -> 0x163a }
            if (r1 == 0) goto L_0x095a
            X.17j r8 = r2.A0Y     // Catch:{ all -> 0x163a }
            r7 = r0
            X.1cc r7 = (X.C30581cc) r7     // Catch:{ all -> 0x163a }
            java.lang.String r6 = "font_style"
            boolean r1 = r8.A03()     // Catch:{ all -> 0x163a }
            if (r1 == 0) goto L_0x095a
            long r4 = r7.A13     // Catch:{ all -> 0x163a }
            r11 = 0
            r10 = 0
            int r1 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            r4 = 0
            if (r1 <= 0) goto L_0x089c
            r4 = 1
        L_0x089c:
            java.lang.String r1 = "TextMessageStore/fillTextInfo/message must have row_id set; key="
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x163a }
            r5.<init>(r1)     // Catch:{ all -> 0x163a }
            X.1Vw r1 = r7.A11     // Catch:{ all -> 0x163a }
            r5.append(r1)     // Catch:{ all -> 0x163a }
            java.lang.String r1 = r5.toString()     // Catch:{ all -> 0x163a }
            X.AnonymousClass00B.A0C(r1, r4)     // Catch:{ all -> 0x163a }
            java.lang.String[] r9 = new java.lang.String[r3]     // Catch:{ all -> 0x163a }
            long r4 = r7.A13     // Catch:{ all -> 0x163a }
            java.lang.String r1 = java.lang.Long.toString(r4)     // Catch:{ all -> 0x163a }
            r9[r10] = r1     // Catch:{ all -> 0x163a }
            X.0tq r1 = r8.A01     // Catch:{ all -> 0x163a }
            X.0tf r1 = r1.get()     // Catch:{ all -> 0x163a }
            X.0tg r5 = r1.A02     // Catch:{ all -> 0x153b }
            java.lang.String r4 = "SELECT description, page_title, url, font_style, text_color, background_color, preview_type, invite_link_group_type, counter_abuse_token FROM message_text WHERE message_row_id = ?"
            android.database.Cursor r4 = r5.A08(r4, r9)     // Catch:{ all -> 0x153b }
            boolean r5 = r4.moveToNext()     // Catch:{ all -> 0x0a09 }
            if (r5 == 0) goto L_0x094b
            java.lang.String r5 = "description"
            int r5 = r4.getColumnIndexOrThrow(r5)     // Catch:{ all -> 0x0a09 }
            java.lang.String r5 = r4.getString(r5)     // Catch:{ all -> 0x0a09 }
            r7.A04 = r5     // Catch:{ all -> 0x0a09 }
            java.lang.String r5 = "page_title"
            int r5 = r4.getColumnIndexOrThrow(r5)     // Catch:{ all -> 0x0a09 }
            java.lang.String r5 = r4.getString(r5)     // Catch:{ all -> 0x0a09 }
            r7.A06 = r5     // Catch:{ all -> 0x0a09 }
            java.lang.String r5 = "url"
            int r5 = r4.getColumnIndexOrThrow(r5)     // Catch:{ all -> 0x0a09 }
            java.lang.String r5 = r4.getString(r5)     // Catch:{ all -> 0x0a09 }
            r7.A07 = r5     // Catch:{ all -> 0x0a09 }
            int r5 = r4.getColumnIndexOrThrow(r6)     // Catch:{ all -> 0x0a09 }
            boolean r5 = r4.isNull(r5)     // Catch:{ all -> 0x0a09 }
            if (r5 != 0) goto L_0x0927
            com.obwhatsapp.TextData r5 = new com.obwhatsapp.TextData     // Catch:{ all -> 0x0a09 }
            r5.<init>()     // Catch:{ all -> 0x0a09 }
            int r6 = r4.getColumnIndexOrThrow(r6)     // Catch:{ all -> 0x0a09 }
            int r6 = r4.getInt(r6)     // Catch:{ all -> 0x0a09 }
            r5.fontStyle = r6     // Catch:{ all -> 0x0a09 }
            java.lang.String r6 = "text_color"
            int r6 = r4.getColumnIndexOrThrow(r6)     // Catch:{ all -> 0x0a09 }
            int r6 = r4.getInt(r6)     // Catch:{ all -> 0x0a09 }
            r5.textColor = r6     // Catch:{ all -> 0x0a09 }
            java.lang.String r6 = "background_color"
            int r6 = r4.getColumnIndexOrThrow(r6)     // Catch:{ all -> 0x0a09 }
            int r6 = r4.getInt(r6)     // Catch:{ all -> 0x0a09 }
            r5.backgroundColor = r6     // Catch:{ all -> 0x0a09 }
            r7.A14(r5)     // Catch:{ all -> 0x0a09 }
        L_0x0927:
            java.lang.String r5 = "preview_type"
            int r5 = r4.getColumnIndexOrThrow(r5)     // Catch:{ all -> 0x0a09 }
            int r5 = r4.getInt(r5)     // Catch:{ all -> 0x0a09 }
            r7.A01 = r5     // Catch:{ all -> 0x0a09 }
            java.lang.String r5 = "invite_link_group_type"
            int r5 = r4.getColumnIndexOrThrow(r5)     // Catch:{ all -> 0x0a09 }
            int r5 = r4.getInt(r5)     // Catch:{ all -> 0x0a09 }
            r7.A00 = r5     // Catch:{ all -> 0x0a09 }
            java.lang.String r5 = "counter_abuse_token"
            int r5 = r4.getColumnIndexOrThrow(r5)     // Catch:{ all -> 0x0a09 }
            java.lang.String r5 = r4.getString(r5)     // Catch:{ all -> 0x0a09 }
            r7.A03 = r5     // Catch:{ all -> 0x0a09 }
        L_0x094b:
            r4.close()     // Catch:{ all -> 0x153b }
            r1.close()     // Catch:{ all -> 0x163a }
            X.0xN r1 = r8.A03     // Catch:{ all -> 0x163a }
            byte[] r1 = r1.A09(r7)     // Catch:{ all -> 0x163a }
            r7.A16(r1)     // Catch:{ all -> 0x163a }
        L_0x095a:
            boolean r1 = r0 instanceof X.C38791rQ     // Catch:{ all -> 0x163a }
            r19 = r1
            if (r1 == 0) goto L_0x09cd
            X.17n r1 = r2.A0C     // Catch:{ all -> 0x163a }
            r6 = r0
            X.1rQ r6 = (X.C38791rQ) r6     // Catch:{ all -> 0x163a }
            X.11I r8 = r1.A01     // Catch:{ all -> 0x163a }
            java.lang.String r7 = "future_ready"
            r4 = 0
            long r9 = r8.A01(r7, r4)     // Catch:{ all -> 0x163a }
            r7 = 1
            int r4 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r4 != 0) goto L_0x09cd
            X.C223317n.A00(r6)     // Catch:{ all -> 0x163a }
            java.lang.String[] r7 = new java.lang.String[r3]     // Catch:{ all -> 0x163a }
            r8 = 0
            long r4 = r6.A13     // Catch:{ all -> 0x163a }
            java.lang.String r4 = java.lang.Long.toString(r4)     // Catch:{ all -> 0x163a }
            r7[r8] = r4     // Catch:{ all -> 0x163a }
            X.0tq r1 = r1.A00     // Catch:{ all -> 0x163a }
            X.0tf r1 = r1.get()     // Catch:{ all -> 0x163a }
            X.0tg r5 = r1.A02     // Catch:{ all -> 0x153b }
            java.lang.String r4 = "SELECT version, data, future_message_type FROM message_future WHERE message_row_id = ?"
            android.database.Cursor r8 = r5.A08(r4, r7)     // Catch:{ all -> 0x153b }
            boolean r4 = r8.moveToNext()     // Catch:{ all -> 0x09c2 }
            if (r4 == 0) goto L_0x09be
            java.lang.String r4 = "version"
            int r4 = r8.getColumnIndexOrThrow(r4)     // Catch:{ all -> 0x09c2 }
            long r4 = r8.getLong(r4)     // Catch:{ all -> 0x09c2 }
            int r7 = (int) r4     // Catch:{ all -> 0x09c2 }
            r6.A01 = r7     // Catch:{ all -> 0x09c2 }
            java.lang.String r4 = "data"
            int r4 = r8.getColumnIndexOrThrow(r4)     // Catch:{ all -> 0x09c2 }
            byte[] r4 = r8.getBlob(r4)     // Catch:{ all -> 0x09c2 }
            r6.A0v(r4)     // Catch:{ all -> 0x09c2 }
            java.lang.String r4 = "future_message_type"
            int r4 = r8.getColumnIndexOrThrow(r4)     // Catch:{ all -> 0x09c2 }
            int r4 = r8.getInt(r4)     // Catch:{ all -> 0x09c2 }
            r6.A00 = r4     // Catch:{ all -> 0x09c2 }
        L_0x09be:
            r8.close()     // Catch:{ all -> 0x153b }
            goto L_0x09ca
        L_0x09c2:
            r0 = move-exception
            if (r8 == 0) goto L_0x153a
            r8.close()     // Catch:{ all -> 0x153a }
            goto L_0x153a
        L_0x09ca:
            r1.close()     // Catch:{ all -> 0x163a }
        L_0x09cd:
            boolean r1 = r0.A10(r3)     // Catch:{ all -> 0x163a }
            if (r1 == 0) goto L_0x0a14
            X.183 r1 = r2.A0B     // Catch:{ all -> 0x163a }
            X.0tq r1 = r1.A00     // Catch:{ all -> 0x163a }
            X.0tf r1 = r1.get()     // Catch:{ all -> 0x163a }
            X.0tg r7 = r1.A02     // Catch:{ all -> 0x153b }
            java.lang.String r6 = "SELECT forward_score FROM message_forwarded WHERE message_row_id = ?"
            r5 = 1
            java.lang.String[] r8 = new java.lang.String[r3]     // Catch:{ all -> 0x153b }
            r9 = 0
            long r3 = r0.A13     // Catch:{ all -> 0x153b }
            java.lang.String r3 = java.lang.Long.toString(r3)     // Catch:{ all -> 0x153b }
            r8[r9] = r3     // Catch:{ all -> 0x153b }
            android.database.Cursor r4 = r7.A08(r6, r8)     // Catch:{ all -> 0x153b }
            if (r4 == 0) goto L_0x0a01
            boolean r3 = r4.moveToNext()     // Catch:{ all -> 0x0a09 }
            if (r3 == 0) goto L_0x0a01
            java.lang.String r3 = "forward_score"
            int r3 = r4.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x0a09 }
            int r5 = r4.getInt(r3)     // Catch:{ all -> 0x0a09 }
        L_0x0a01:
            r0.A05 = r5     // Catch:{ all -> 0x0a09 }
            if (r4 == 0) goto L_0x0a11
            r4.close()     // Catch:{ all -> 0x153b }
            goto L_0x0a11
        L_0x0a09:
            r0 = move-exception
            if (r4 == 0) goto L_0x153a
            r4.close()     // Catch:{ all -> 0x153a }
            goto L_0x153a
        L_0x0a11:
            r1.close()     // Catch:{ all -> 0x163a }
        L_0x0a14:
            long r3 = r0.A0F     // Catch:{ all -> 0x163a }
            r5 = 0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0a25
            long r7 = r0.A17     // Catch:{ all -> 0x163a }
            r9 = 2
            long r7 = r7 & r9
            int r1 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r1 != 0) goto L_0x0a31
        L_0x0a25:
            X.17q r7 = r2.A0V     // Catch:{ all -> 0x163a }
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 > 0) goto L_0x0a4f
            boolean r1 = r7.A06()     // Catch:{ all -> 0x163a }
            if (r1 != 0) goto L_0x0a4f
        L_0x0a31:
            long r3 = r0.A17     // Catch:{ all -> 0x163a }
            r7 = 1
            long r3 = r3 & r7
            int r1 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r1 != 0) goto L_0x0fd8
            X.17w r8 = r2.A0I     // Catch:{ all -> 0x163a }
            boolean r1 = r8.A02()     // Catch:{ all -> 0x163a }
            if (r1 == 0) goto L_0x0fd8
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ all -> 0x163a }
            r7.<init>()     // Catch:{ all -> 0x163a }
            X.0tq r1 = r8.A03     // Catch:{ all -> 0x163a }
            X.0tf r1 = r1.get()     // Catch:{ all -> 0x163a }
            goto L_0x0f9d
        L_0x0a4f:
            X.0tq r1 = r7.A0C     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0f8a }
            r26 = r1
            X.0tf r23 = r26.get()     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0f8a }
            boolean r1 = r7.A06()     // Catch:{ all -> 0x0f85 }
            if (r1 == 0) goto L_0x0b38
            long r3 = r0.A13     // Catch:{ all -> 0x0f85 }
            X.0tf r24 = r26.get()     // Catch:{ all -> 0x0f85 }
            r1 = r24
            X.0tg r9 = r1.A02     // Catch:{ all -> 0x0f54 }
            java.lang.String r8 = "SELECT chat_row_id, from_me, sender_jid_row_id, key_id, timestamp, message_type, origin, text_data, payment_transaction_id, lookup_tables FROM message_quoted WHERE message_row_id = ?"
            r13 = 1
            java.lang.String[] r1 = new java.lang.String[r13]     // Catch:{ all -> 0x0f54 }
            java.lang.String r11 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x0f54 }
            r10 = 0
            r1[r10] = r11     // Catch:{ all -> 0x0f54 }
            android.database.Cursor r10 = r9.A08(r8, r1)     // Catch:{ all -> 0x0f54 }
            boolean r1 = r10.moveToLast()     // Catch:{ all -> 0x0b30 }
            if (r1 == 0) goto L_0x0b17
            X.0ts r1 = r7.A03     // Catch:{ all -> 0x0b30 }
            java.lang.String r8 = "chat_row_id"
            int r8 = r10.getColumnIndexOrThrow(r8)     // Catch:{ all -> 0x0b30 }
            long r8 = r10.getLong(r8)     // Catch:{ all -> 0x0b30 }
            X.0rv r15 = r1.A05(r8)     // Catch:{ all -> 0x0b30 }
            if (r15 == 0) goto L_0x0b2b
            r1 = r21
            int r1 = r10.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x0b30 }
            int r1 = r10.getInt(r1)     // Catch:{ all -> 0x0b30 }
            if (r1 > 0) goto L_0x0a9c
            r13 = 0
        L_0x0a9c:
            r1 = r20
            int r1 = r10.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x0b30 }
            java.lang.String r14 = r10.getString(r1)     // Catch:{ all -> 0x0b30 }
            java.lang.String r1 = "timestamp"
            int r1 = r10.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x0b30 }
            long r8 = r10.getLong(r1)     // Catch:{ all -> 0x0b30 }
            java.lang.String r1 = "message_type"
            int r1 = r10.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x0b30 }
            int r1 = r10.getInt(r1)     // Catch:{ all -> 0x0b30 }
            byte r12 = (byte) r1     // Catch:{ all -> 0x0b30 }
            X.17g r11 = r7.A0M     // Catch:{ all -> 0x0b30 }
            X.1Vw r1 = new X.1Vw     // Catch:{ all -> 0x0b30 }
            r1.<init>(r15, r14, r13)     // Catch:{ all -> 0x0b30 }
            X.0tZ r1 = r11.A01(r1, r12, r8)     // Catch:{ all -> 0x0b30 }
            X.14v r11 = r7.A06     // Catch:{ all -> 0x0b30 }
            java.lang.String r8 = "sender_jid_row_id"
            int r8 = r10.getColumnIndexOrThrow(r8)     // Catch:{ all -> 0x0b30 }
            long r8 = r10.getLong(r8)     // Catch:{ all -> 0x0b30 }
            com.whatsapp.jid.Jid r8 = r11.A03(r8)     // Catch:{ all -> 0x0b30 }
            com.whatsapp.jid.UserJid r8 = com.whatsapp.jid.UserJid.of(r8)     // Catch:{ all -> 0x0b30 }
            r1.A0b(r8)     // Catch:{ all -> 0x0b30 }
            java.lang.String r8 = "origin"
            int r8 = r10.getColumnIndexOrThrow(r8)     // Catch:{ all -> 0x0b30 }
            int r8 = r10.getInt(r8)     // Catch:{ all -> 0x0b30 }
            r1.A08 = r8     // Catch:{ all -> 0x0b30 }
            java.lang.String r8 = "text_data"
            int r8 = r10.getColumnIndexOrThrow(r8)     // Catch:{ all -> 0x0b30 }
            java.lang.String r8 = r10.getString(r8)     // Catch:{ all -> 0x0b30 }
            r1.A0s(r8)     // Catch:{ all -> 0x0b30 }
            r1.A13 = r3     // Catch:{ all -> 0x0b30 }
            java.lang.String r3 = "payment_transaction_id"
            int r3 = r10.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x0b30 }
            java.lang.String r3 = r10.getString(r3)     // Catch:{ all -> 0x0b30 }
            r1.A0n = r3     // Catch:{ all -> 0x0b30 }
            java.lang.String r3 = "lookup_tables"
            int r3 = r10.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x0b30 }
            long r3 = r10.getLong(r3)     // Catch:{ all -> 0x0b30 }
            r1.A17 = r3     // Catch:{ all -> 0x0b30 }
            r10.close()     // Catch:{ all -> 0x0f54 }
            goto L_0x0b69
        L_0x0b17:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0b30 }
            r8.<init>()     // Catch:{ all -> 0x0b30 }
            java.lang.String r1 = "QuotedMessageStore/readQuotedMessage/no quote; rowId="
            r8.append(r1)     // Catch:{ all -> 0x0b30 }
            r8.append(r3)     // Catch:{ all -> 0x0b30 }
            java.lang.String r1 = r8.toString()     // Catch:{ all -> 0x0b30 }
            com.whatsapp.util.Log.w((java.lang.String) r1)     // Catch:{ all -> 0x0b30 }
        L_0x0b2b:
            r10.close()     // Catch:{ all -> 0x0f54 }
            goto L_0x0f50
        L_0x0b30:
            r1 = move-exception
            if (r10 == 0) goto L_0x0f4f
            r10.close()     // Catch:{ all -> 0x0f4f }
            goto L_0x0f4f
        L_0x0b38:
            long r3 = r0.A0F     // Catch:{ all -> 0x0f85 }
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 <= 0) goto L_0x0f80
            X.0tf r9 = r26.get()     // Catch:{ all -> 0x0f85 }
            X.0tg r10 = r9.A02     // Catch:{ all -> 0x0f7b }
            java.lang.String r8 = X.C40551uJ.A00     // Catch:{ all -> 0x0f7b }
            r1 = 1
            java.lang.String[] r1 = new java.lang.String[r1]     // Catch:{ all -> 0x0f7b }
            r12 = 0
            java.lang.String r11 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x0f7b }
            r1[r12] = r11     // Catch:{ all -> 0x0f7b }
            android.database.Cursor r8 = r10.A08(r8, r1)     // Catch:{ all -> 0x0f7b }
            boolean r1 = r8.moveToLast()     // Catch:{ all -> 0x0f74 }
            if (r1 == 0) goto L_0x0f59
            X.17G r1 = r7.A08     // Catch:{ all -> 0x0f74 }
            X.0tZ r1 = r1.A00(r8)     // Catch:{ all -> 0x0f74 }
            r8.close()     // Catch:{ all -> 0x0f7b }
            r9.close()     // Catch:{ all -> 0x0f85 }
            if (r1 == 0) goto L_0x0f80
            goto L_0x0b6c
        L_0x0b69:
            r24.close()     // Catch:{ all -> 0x0f85 }
        L_0x0b6c:
            X.1Vw r4 = r1.A11     // Catch:{ all -> 0x0f85 }
            r3 = 2
            r1.A0X(r3)     // Catch:{ all -> 0x0f85 }
            r0.A0e(r1)     // Catch:{ all -> 0x0f85 }
            java.lang.String r3 = r1.A0n     // Catch:{ all -> 0x0f85 }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x0f85 }
            if (r3 != 0) goto L_0x0b89
            X.16r r8 = r7.A0F     // Catch:{ all -> 0x0f85 }
            java.lang.String r4 = r4.A01     // Catch:{ all -> 0x0f85 }
            java.lang.String r3 = r1.A0n     // Catch:{ all -> 0x0f85 }
            X.1Vt r3 = r8.A0M(r4, r3)     // Catch:{ all -> 0x0f85 }
            r1.A0L = r3     // Catch:{ all -> 0x0f85 }
        L_0x0b89:
            boolean r3 = r7.A06()     // Catch:{ all -> 0x0f85 }
            if (r3 != 0) goto L_0x0b96
            long r3 = r0.A13     // Catch:{ all -> 0x0f85 }
            r7.A04(r1, r3)     // Catch:{ all -> 0x0f85 }
            goto L_0x0f80
        L_0x0b96:
            long r3 = r0.A13     // Catch:{ all -> 0x0f85 }
            r29 = r3
            X.0tf r24 = r26.get()     // Catch:{ all -> 0x0f85 }
            boolean r3 = r1 instanceof X.C30591cd     // Catch:{ all -> 0x0f54 }
            if (r3 == 0) goto L_0x0bac
            X.17z r9 = r7.A0I     // Catch:{ all -> 0x0f54 }
            r8 = r1
            X.1cd r8 = (X.C30591cd) r8     // Catch:{ all -> 0x0f54 }
            r3 = r29
            r9.A03(r8, r3)     // Catch:{ all -> 0x0f54 }
        L_0x0bac:
            boolean r3 = r1.A0x()     // Catch:{ all -> 0x0f54 }
            if (r3 == 0) goto L_0x0bbb
            X.0vM r9 = r7.A05     // Catch:{ all -> 0x0f54 }
            long r3 = r1.A13     // Catch:{ all -> 0x0f54 }
            java.lang.String r8 = "SELECT element_type, element_content FROM message_quoted_ui_elements WHERE message_row_id = ?"
            r9.A08(r1, r8, r3)     // Catch:{ all -> 0x0f54 }
        L_0x0bbb:
            long r3 = r1.A17     // Catch:{ all -> 0x0f54 }
            r9 = 1
            long r3 = r3 & r9
            int r8 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r8 != 0) goto L_0x0c15
            X.17w r12 = r7.A0A     // Catch:{ all -> 0x0f54 }
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ all -> 0x0f54 }
            r11.<init>()     // Catch:{ all -> 0x0f54 }
            X.0tq r3 = r12.A03     // Catch:{ all -> 0x0f54 }
            X.0tf r10 = r3.get()     // Catch:{ all -> 0x0f54 }
            X.0tg r8 = r10.A02     // Catch:{ all -> 0x0f4b }
            java.lang.String r4 = "SELECT jid_row_id FROM message_quoted_mentions WHERE message_row_id = ?"
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch:{ all -> 0x0f4b }
            r13 = 0
            java.lang.String r9 = java.lang.Long.toString(r29)     // Catch:{ all -> 0x0f4b }
            r3[r13] = r9     // Catch:{ all -> 0x0f4b }
            android.database.Cursor r9 = r8.A08(r4, r3)     // Catch:{ all -> 0x0f4b }
        L_0x0be3:
            boolean r3 = r9.moveToNext()     // Catch:{ all -> 0x0c07 }
            if (r3 == 0) goto L_0x0c03
            java.lang.String r3 = "jid_row_id"
            int r3 = r9.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x0c07 }
            long r3 = r9.getLong(r3)     // Catch:{ all -> 0x0c07 }
            X.14v r8 = r12.A02     // Catch:{ all -> 0x0c07 }
            com.whatsapp.jid.Jid r3 = r8.A03(r3)     // Catch:{ all -> 0x0c07 }
            com.whatsapp.jid.UserJid r3 = com.whatsapp.jid.UserJid.of(r3)     // Catch:{ all -> 0x0c07 }
            if (r3 == 0) goto L_0x0be3
            r11.add(r3)     // Catch:{ all -> 0x0c07 }
            goto L_0x0be3
        L_0x0c03:
            r9.close()     // Catch:{ all -> 0x0f4b }
            goto L_0x0c0f
        L_0x0c07:
            r1 = move-exception
            if (r9 == 0) goto L_0x0f4a
            r9.close()     // Catch:{ all -> 0x0f4a }
            goto L_0x0f4a
        L_0x0c0f:
            r10.close()     // Catch:{ all -> 0x0f54 }
            r1.A0u(r11)     // Catch:{ all -> 0x0f54 }
        L_0x0c15:
            boolean r3 = r1 instanceof X.C38891ra     // Catch:{ all -> 0x0f54 }
            if (r3 == 0) goto L_0x0c23
            X.17u r8 = r7.A0G     // Catch:{ all -> 0x0f54 }
            r4 = r1
            X.1ra r4 = (X.C38891ra) r4     // Catch:{ all -> 0x0f54 }
            java.lang.String r3 = "SELECT message_row_id, business_owner_jid, product_id, title, description, currency_code, amount_1000, retailer_id, url, product_image_count, sale_amount_1000, body, footer FROM message_quoted_product WHERE message_row_id=?"
            r8.A02(r4, r3)     // Catch:{ all -> 0x0f54 }
        L_0x0c23:
            boolean r3 = r1 instanceof X.C38981rj     // Catch:{ all -> 0x0f54 }
            if (r3 == 0) goto L_0x0c31
            X.17t r8 = r7.A02     // Catch:{ all -> 0x0f54 }
            r4 = r1
            X.1rj r4 = (X.C38981rj) r4     // Catch:{ all -> 0x0f54 }
            java.lang.String r3 = "SELECT message_row_id, business_owner_jid, title, description FROM message_quoted_product WHERE message_row_id = ?"
            r8.A02(r4, r3)     // Catch:{ all -> 0x0f54 }
        L_0x0c31:
            boolean r3 = r1 instanceof X.C30071bh     // Catch:{ all -> 0x0f54 }
            if (r3 == 0) goto L_0x0ce9
            X.185 r12 = r7.A04     // Catch:{ all -> 0x0f54 }
            r13 = r1
            X.1bh r13 = (X.C30071bh) r13     // Catch:{ all -> 0x0f54 }
            r3 = 1
            java.lang.String[] r8 = new java.lang.String[r3]     // Catch:{ all -> 0x0f54 }
            long r3 = r13.A13     // Catch:{ all -> 0x0f54 }
            java.lang.String r4 = java.lang.Long.toString(r3)     // Catch:{ all -> 0x0f54 }
            r3 = 0
            r8[r3] = r4     // Catch:{ all -> 0x0f54 }
            X.0tq r3 = r12.A02     // Catch:{ all -> 0x0f54 }
            X.0tf r28 = r3.get()     // Catch:{ all -> 0x0f54 }
            r3 = r28
            X.0tg r4 = r3.A02     // Catch:{ all -> 0x0ce0 }
            java.lang.String r3 = "SELECT group_jid_row_id, admin_jid_row_id, group_name, invite_code, expiration, expired, group_type FROM message_quoted_group_invite WHERE message_row_id = ?"
            android.database.Cursor r14 = r4.A08(r3, r8)     // Catch:{ all -> 0x0ce0 }
            boolean r3 = r14.moveToNext()     // Catch:{ all -> 0x0cd9 }
            if (r3 == 0) goto L_0x0cd5
            java.lang.String r3 = "expiration"
            int r3 = r14.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x0cd9 }
            long r10 = r14.getLong(r3)     // Catch:{ all -> 0x0cd9 }
            java.lang.String r3 = "group_jid_row_id"
            int r3 = r14.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x0cd9 }
            long r8 = r14.getLong(r3)     // Catch:{ all -> 0x0cd9 }
            java.lang.String r3 = "admin_jid_row_id"
            int r3 = r14.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x0cd9 }
            long r3 = r14.getLong(r3)     // Catch:{ all -> 0x0cd9 }
            java.lang.String r15 = "group_name"
            int r15 = r14.getColumnIndexOrThrow(r15)     // Catch:{ all -> 0x0cd9 }
            java.lang.String r27 = r14.getString(r15)     // Catch:{ all -> 0x0cd9 }
            java.lang.String r15 = "invite_code"
            int r15 = r14.getColumnIndexOrThrow(r15)     // Catch:{ all -> 0x0cd9 }
            java.lang.String r26 = r14.getString(r15)     // Catch:{ all -> 0x0cd9 }
            java.lang.String r15 = "expired"
            int r15 = r14.getColumnIndexOrThrow(r15)     // Catch:{ all -> 0x0cd9 }
            int r21 = r14.getInt(r15)     // Catch:{ all -> 0x0cd9 }
            java.lang.String r15 = "group_type"
            int r15 = r14.getColumnIndexOrThrow(r15)     // Catch:{ all -> 0x0cd9 }
            int r20 = r14.getInt(r15)     // Catch:{ all -> 0x0cd9 }
            X.14v r15 = r12.A01     // Catch:{ all -> 0x0cd9 }
            java.lang.Class<X.0sL> r12 = X.C16050sL.class
            com.whatsapp.jid.Jid r9 = r15.A07(r12, r8)     // Catch:{ all -> 0x0cd9 }
            X.0sL r9 = (X.C16050sL) r9     // Catch:{ all -> 0x0cd9 }
            java.lang.Class<com.whatsapp.jid.UserJid> r8 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r3 = r15.A07(r8, r3)     // Catch:{ all -> 0x0cd9 }
            com.whatsapp.jid.UserJid r3 = (com.whatsapp.jid.UserJid) r3     // Catch:{ all -> 0x0cd9 }
            if (r9 == 0) goto L_0x0cb9
            r4 = 1
            if (r3 != 0) goto L_0x0cba
        L_0x0cb9:
            r4 = 0
        L_0x0cba:
            X.AnonymousClass00B.A0G(r4)     // Catch:{ all -> 0x0cd9 }
            r4 = 0
            if (r21 == 0) goto L_0x0cc1
            r4 = 1
        L_0x0cc1:
            r13.A02 = r9     // Catch:{ all -> 0x0cd9 }
            r13.A03 = r3     // Catch:{ all -> 0x0cd9 }
            r3 = r27
            r13.A05 = r3     // Catch:{ all -> 0x0cd9 }
            r3 = r26
            r13.A06 = r3     // Catch:{ all -> 0x0cd9 }
            r13.A01 = r10     // Catch:{ all -> 0x0cd9 }
            r13.A07 = r4     // Catch:{ all -> 0x0cd9 }
            r3 = r20
            r13.A00 = r3     // Catch:{ all -> 0x0cd9 }
        L_0x0cd5:
            r14.close()     // Catch:{ all -> 0x0ce0 }
            goto L_0x0ce6
        L_0x0cd9:
            r1 = move-exception
            if (r14 == 0) goto L_0x0cdf
            r14.close()     // Catch:{ all -> 0x0cdf }
        L_0x0cdf:
            throw r1     // Catch:{ all -> 0x0ce0 }
        L_0x0ce0:
            r1 = move-exception
            r28.close()     // Catch:{ all -> 0x0f4f }
            goto L_0x0f4f
        L_0x0ce6:
            r28.close()     // Catch:{ all -> 0x0f54 }
        L_0x0ce9:
            boolean r3 = r1 instanceof X.C39021rn     // Catch:{ all -> 0x0f54 }
            if (r3 == 0) goto L_0x0cf8
            X.17l r9 = r7.A0D     // Catch:{ all -> 0x0f54 }
            r8 = r1
            X.1rn r8 = (X.C39021rn) r8     // Catch:{ all -> 0x0f54 }
            java.lang.String r4 = "SELECT message_row_id, order_id, thumbnail, order_title, item_count, status, surface, message, seller_jid, token, currency_code,total_amount_1000 FROM message_quoted_order WHERE message_row_id=?"
            r3 = 1
            r9.A03(r8, r4, r3)     // Catch:{ all -> 0x0f54 }
        L_0x0cf8:
            boolean r3 = r1 instanceof X.C16840tj     // Catch:{ all -> 0x0f54 }
            if (r3 == 0) goto L_0x0d08
            X.0vM r10 = r7.A05     // Catch:{ all -> 0x0f54 }
            r9 = r1
            X.0tj r9 = (X.C16840tj) r9     // Catch:{ all -> 0x0f54 }
            long r3 = r1.A13     // Catch:{ all -> 0x0f54 }
            java.lang.String r8 = "SELECT element_type, element_content FROM message_quoted_ui_elements WHERE message_row_id = ?"
            r10.A0I(r9, r8, r3)     // Catch:{ all -> 0x0f54 }
        L_0x0d08:
            boolean r3 = r1 instanceof X.C39041rp     // Catch:{ all -> 0x0f54 }
            if (r3 == 0) goto L_0x0d16
            X.0vM r8 = r7.A05     // Catch:{ all -> 0x0f54 }
            r4 = r1
            X.1rp r4 = (X.C39041rp) r4     // Catch:{ all -> 0x0f54 }
            java.lang.String r3 = "SELECT message_row_id, element_type, reply_values, reply_description FROM message_quoted_ui_elements_reply WHERE message_row_id=?"
            r8.A0F(r4, r3)     // Catch:{ all -> 0x0f54 }
        L_0x0d16:
            boolean r3 = r1 instanceof X.C39051rq     // Catch:{ all -> 0x0f54 }
            if (r3 == 0) goto L_0x0d24
            X.0vM r8 = r7.A05     // Catch:{ all -> 0x0f54 }
            r4 = r1
            X.1rq r4 = (X.C39051rq) r4     // Catch:{ all -> 0x0f54 }
            java.lang.String r3 = "SELECT message_row_id, element_type, reply_values, reply_description FROM message_quoted_ui_elements_reply WHERE message_row_id=?"
            r8.A0B(r4, r3)     // Catch:{ all -> 0x0f54 }
        L_0x0d24:
            boolean r3 = r1 instanceof X.C30901d9     // Catch:{ all -> 0x0f54 }
            if (r3 == 0) goto L_0x0d71
            X.17x r9 = r7.A07     // Catch:{ all -> 0x0f54 }
            r8 = r1
            X.1d9 r8 = (X.C30901d9) r8     // Catch:{ all -> 0x0f54 }
            long r3 = r8.A13     // Catch:{ all -> 0x0f54 }
            r10 = 1
            r13 = 0
            int r12 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            r11 = 0
            if (r12 <= 0) goto L_0x0d37
            r11 = 1
        L_0x0d37:
            java.lang.String r3 = "LocationMessageStore/fillLocationInfoForQuotedMessage/message must have row_id set; key="
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0f54 }
            r4.<init>(r3)     // Catch:{ all -> 0x0f54 }
            X.1Vw r3 = r8.A11     // Catch:{ all -> 0x0f54 }
            r4.append(r3)     // Catch:{ all -> 0x0f54 }
            java.lang.String r3 = r4.toString()     // Catch:{ all -> 0x0f54 }
            X.AnonymousClass00B.A0C(r3, r11)     // Catch:{ all -> 0x0f54 }
            java.lang.String[] r10 = new java.lang.String[r10]     // Catch:{ all -> 0x0f54 }
            long r3 = r8.A13     // Catch:{ all -> 0x0f54 }
            java.lang.String r3 = java.lang.Long.toString(r3)     // Catch:{ all -> 0x0f54 }
            r10[r13] = r3     // Catch:{ all -> 0x0f54 }
            X.0tq r3 = r9.A02     // Catch:{ all -> 0x0f54 }
            X.0tf r12 = r3.get()     // Catch:{ all -> 0x0f54 }
            X.0tg r4 = r12.A02     // Catch:{ all -> 0x0ee9 }
            java.lang.String r3 = "SELECT latitude, longitude, place_name, place_address, url, thumbnail FROM message_quoted_location WHERE message_row_id = ?"
            android.database.Cursor r4 = r4.A08(r3, r10)     // Catch:{ all -> 0x0ee9 }
            boolean r3 = r4.moveToNext()     // Catch:{ all -> 0x0ee2 }
            if (r3 == 0) goto L_0x0d6b
            r8.A12(r4)     // Catch:{ all -> 0x0ee2 }
        L_0x0d6b:
            r4.close()     // Catch:{ all -> 0x0ee9 }
            r12.close()     // Catch:{ all -> 0x0f54 }
        L_0x0d71:
            boolean r3 = r1 instanceof X.C16730tY     // Catch:{ all -> 0x0f54 }
            if (r3 == 0) goto L_0x0e51
            X.17I r9 = r7.A09     // Catch:{ all -> 0x0f54 }
            r8 = r1
            X.0tY r8 = (X.C16730tY) r8     // Catch:{ all -> 0x0f54 }
            long r3 = r8.A13     // Catch:{ all -> 0x0f54 }
            r10 = 1
            r13 = 0
            int r12 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            r11 = 0
            if (r12 <= 0) goto L_0x0d84
            r11 = 1
        L_0x0d84:
            java.lang.String r3 = "MediaCoreMessageStore/fillMediaInfoForQuotedMessage/message must have row_id set; key="
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0f54 }
            r4.<init>(r3)     // Catch:{ all -> 0x0f54 }
            X.1Vw r3 = r8.A11     // Catch:{ all -> 0x0f54 }
            r4.append(r3)     // Catch:{ all -> 0x0f54 }
            java.lang.String r3 = r4.toString()     // Catch:{ all -> 0x0f54 }
            X.AnonymousClass00B.A0C(r3, r11)     // Catch:{ all -> 0x0f54 }
            java.lang.String[] r10 = new java.lang.String[r10]     // Catch:{ all -> 0x0f54 }
            long r3 = r8.A13     // Catch:{ all -> 0x0f54 }
            java.lang.String r3 = java.lang.Long.toString(r3)     // Catch:{ all -> 0x0f54 }
            r10[r13] = r3     // Catch:{ all -> 0x0f54 }
            X.0tq r3 = r9.A02     // Catch:{ all -> 0x0f54 }
            X.0tf r12 = r3.get()     // Catch:{ all -> 0x0f54 }
            X.0tg r4 = r12.A02     // Catch:{ all -> 0x0ee9 }
            java.lang.String r3 = "SELECT message_row_id, media_job_uuid, transferred, file_path, file_size, media_key, media_key_timestamp, width, height, direct_path, message_url, mime_type, file_length, media_name, file_hash, media_duration, page_count, enc_file_hash, thumbnail, media_caption FROM message_quoted_media WHERE message_row_id= ?"
            android.database.Cursor r11 = r4.A08(r3, r10)     // Catch:{ all -> 0x0ee9 }
            boolean r3 = r11.moveToNext()     // Catch:{ all -> 0x0e46 }
            if (r3 == 0) goto L_0x0e42
            X.0ta r10 = new X.0ta     // Catch:{ all -> 0x0e46 }
            r10.<init>()     // Catch:{ all -> 0x0e46 }
            java.lang.String r3 = "media_job_uuid"
            int r3 = r11.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x0e46 }
            java.lang.String r3 = r11.getString(r3)     // Catch:{ all -> 0x0e46 }
            r10.A0I = r3     // Catch:{ all -> 0x0e46 }
            java.lang.String r3 = "transferred"
            int r3 = r11.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x0e46 }
            long r20 = r11.getLong(r3)     // Catch:{ all -> 0x0e46 }
            r13 = 1
            int r4 = (r20 > r13 ? 1 : (r20 == r13 ? 0 : -1))
            r3 = 0
            if (r4 != 0) goto L_0x0dd9
            r3 = 1
        L_0x0dd9:
            r10.A0P = r3     // Catch:{ all -> 0x0e46 }
            java.lang.String r3 = "file_size"
            int r3 = r11.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x0e46 }
            long r3 = r11.getLong(r3)     // Catch:{ all -> 0x0e46 }
            r10.A0A = r3     // Catch:{ all -> 0x0e46 }
            java.lang.String r3 = "media_key"
            int r3 = r11.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x0e46 }
            byte[] r3 = r11.getBlob(r3)     // Catch:{ all -> 0x0e46 }
            r10.A0U = r3     // Catch:{ all -> 0x0e46 }
            java.lang.String r3 = "media_key_timestamp"
            int r3 = r11.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x0e46 }
            long r3 = r11.getLong(r3)     // Catch:{ all -> 0x0e46 }
            r10.A0B = r3     // Catch:{ all -> 0x0e46 }
            java.lang.String r3 = "width"
            int r3 = r11.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x0e46 }
            int r3 = r11.getInt(r3)     // Catch:{ all -> 0x0e46 }
            r10.A08 = r3     // Catch:{ all -> 0x0e46 }
            java.lang.String r3 = "height"
            int r3 = r11.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x0e46 }
            int r3 = r11.getInt(r3)     // Catch:{ all -> 0x0e46 }
            r10.A06 = r3     // Catch:{ all -> 0x0e46 }
            java.lang.String r3 = "direct_path"
            int r3 = r11.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x0e46 }
            java.lang.String r3 = r11.getString(r3)     // Catch:{ all -> 0x0e46 }
            r10.A0G = r3     // Catch:{ all -> 0x0e46 }
            java.lang.String r3 = "file_path"
            int r3 = r11.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x0e46 }
            java.lang.String r3 = r11.getString(r3)     // Catch:{ all -> 0x0e46 }
            if (r3 != 0) goto L_0x0e32
            r4 = 0
            goto L_0x0e37
        L_0x0e32:
            java.io.File r4 = new java.io.File     // Catch:{ all -> 0x0e46 }
            r4.<init>(r3)     // Catch:{ all -> 0x0e46 }
        L_0x0e37:
            X.0sc r3 = r9.A00     // Catch:{ all -> 0x0e46 }
            java.io.File r3 = r3.A06(r4)     // Catch:{ all -> 0x0e46 }
            r10.A0F = r3     // Catch:{ all -> 0x0e46 }
            r8.A16(r11, r10)     // Catch:{ all -> 0x0e46 }
        L_0x0e42:
            r11.close()     // Catch:{ all -> 0x0ee9 }
            goto L_0x0e4e
        L_0x0e46:
            r1 = move-exception
            if (r11 == 0) goto L_0x0ee8
            r11.close()     // Catch:{ all -> 0x0ee8 }
            goto L_0x0ee8
        L_0x0e4e:
            r12.close()     // Catch:{ all -> 0x0f54 }
        L_0x0e51:
            boolean r3 = r1 instanceof X.C38741rL     // Catch:{ all -> 0x0f54 }
            if (r3 == 0) goto L_0x0e84
            X.17m r10 = r7.A0K     // Catch:{ all -> 0x0f54 }
            r8 = r1
            X.1rL r8 = (X.C38741rL) r8     // Catch:{ all -> 0x0f54 }
            r9 = 1
            r3 = r29
            java.util.List r4 = r10.A01(r3, r9)     // Catch:{ all -> 0x0f54 }
            boolean r3 = r4.isEmpty()     // Catch:{ all -> 0x0f54 }
            if (r3 != 0) goto L_0x0e71
            r3 = 0
            java.lang.Object r3 = r4.get(r3)     // Catch:{ all -> 0x0f54 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x0f54 }
            r8.A13(r3)     // Catch:{ all -> 0x0f54 }
        L_0x0e71:
            boolean r3 = r1 instanceof X.C30581cc     // Catch:{ all -> 0x0f54 }
            if (r3 == 0) goto L_0x0ef1
            X.17j r10 = r7.A0J     // Catch:{ all -> 0x0f54 }
            r9 = r1
            X.1cc r9 = (X.C30581cc) r9     // Catch:{ all -> 0x0f54 }
            long r3 = r9.A13     // Catch:{ all -> 0x0f54 }
            r8 = 1
            r13 = 0
            int r12 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            r11 = 0
            if (r12 <= 0) goto L_0x0e9f
            goto L_0x0e9e
        L_0x0e84:
            boolean r3 = r1 instanceof X.C38811rS     // Catch:{ all -> 0x0f54 }
            if (r3 == 0) goto L_0x0e71
            X.17m r10 = r7.A0K     // Catch:{ all -> 0x0f54 }
            r9 = r1
            X.1rS r9 = (X.C38811rS) r9     // Catch:{ all -> 0x0f54 }
            r8 = 1
            r3 = r29
            java.util.List r3 = r10.A01(r3, r8)     // Catch:{ all -> 0x0f54 }
            boolean r4 = r3.isEmpty()     // Catch:{ all -> 0x0f54 }
            if (r4 != 0) goto L_0x0e71
            r9.A13(r3)     // Catch:{ all -> 0x0f54 }
            goto L_0x0e71
        L_0x0e9e:
            r11 = 1
        L_0x0e9f:
            java.lang.String r3 = "TextMessageStore/fillTextInfoForQuotedMessage/message must have row_id set; key="
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0f54 }
            r4.<init>(r3)     // Catch:{ all -> 0x0f54 }
            X.1Vw r3 = r9.A11     // Catch:{ all -> 0x0f54 }
            r4.append(r3)     // Catch:{ all -> 0x0f54 }
            java.lang.String r3 = r4.toString()     // Catch:{ all -> 0x0f54 }
            X.AnonymousClass00B.A0C(r3, r11)     // Catch:{ all -> 0x0f54 }
            java.lang.String[] r8 = new java.lang.String[r8]     // Catch:{ all -> 0x0f54 }
            long r3 = r9.A13     // Catch:{ all -> 0x0f54 }
            java.lang.String r3 = java.lang.Long.toString(r3)     // Catch:{ all -> 0x0f54 }
            r8[r13] = r3     // Catch:{ all -> 0x0f54 }
            X.0tq r3 = r10.A01     // Catch:{ all -> 0x0f54 }
            X.0tf r12 = r3.get()     // Catch:{ all -> 0x0f54 }
            X.0tg r4 = r12.A02     // Catch:{ all -> 0x0ee9 }
            java.lang.String r3 = "SELECT thumbnail FROM message_quoted_text WHERE message_row_id = ?"
            android.database.Cursor r4 = r4.A08(r3, r8)     // Catch:{ all -> 0x0ee9 }
            boolean r3 = r4.moveToNext()     // Catch:{ all -> 0x0ee2 }
            if (r3 == 0) goto L_0x0ede
            java.lang.String r3 = "thumbnail"
            int r3 = r4.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x0ee2 }
            byte[] r3 = r4.getBlob(r3)     // Catch:{ all -> 0x0ee2 }
            r9.A16(r3)     // Catch:{ all -> 0x0ee2 }
        L_0x0ede:
            r4.close()     // Catch:{ all -> 0x0ee9 }
            goto L_0x0eee
        L_0x0ee2:
            r1 = move-exception
            if (r4 == 0) goto L_0x0ee8
            r4.close()     // Catch:{ all -> 0x0ee8 }
        L_0x0ee8:
            throw r1     // Catch:{ all -> 0x0ee9 }
        L_0x0ee9:
            r1 = move-exception
            r12.close()     // Catch:{ all -> 0x0f4f }
            goto L_0x0f4f
        L_0x0eee:
            r12.close()     // Catch:{ all -> 0x0f54 }
        L_0x0ef1:
            boolean r3 = r1 instanceof X.C39061rr     // Catch:{ all -> 0x0f54 }
            if (r3 == 0) goto L_0x0eff
            X.187 r8 = r7.A0E     // Catch:{ all -> 0x0f54 }
            r4 = r1
            X.1rr r4 = (X.C39061rr) r4     // Catch:{ all -> 0x0f54 }
            java.lang.String r3 = "SELECT message_row_id, service, expiration_timestamp FROM message_quoted_payment_invite WHERE message_row_id = ?"
            r8.A00(r4, r3)     // Catch:{ all -> 0x0f54 }
        L_0x0eff:
            boolean r3 = r1 instanceof X.C38651rC     // Catch:{ all -> 0x0f54 }
            if (r3 == 0) goto L_0x0f50
            X.190 r3 = r7.A0L     // Catch:{ all -> 0x0f54 }
            X.1rC r1 = (X.C38651rC) r1     // Catch:{ all -> 0x0f54 }
            X.0tq r3 = r3.A00     // Catch:{ all -> 0x0f54 }
            X.0tf r10 = r3.get()     // Catch:{ all -> 0x0f54 }
            X.0tg r8 = r10.A02     // Catch:{ all -> 0x0f4b }
            java.lang.String r4 = "SELECT message_row_id, parent_group_jid, group_subject FROM message_quoted_blank_reply WHERE message_row_id = ?"
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch:{ all -> 0x0f4b }
            r11 = 0
            java.lang.String r9 = java.lang.Long.toString(r29)     // Catch:{ all -> 0x0f4b }
            r3[r11] = r9     // Catch:{ all -> 0x0f4b }
            android.database.Cursor r4 = r8.A08(r4, r3)     // Catch:{ all -> 0x0f4b }
            boolean r3 = r4.moveToLast()     // Catch:{ all -> 0x0f44 }
            if (r3 == 0) goto L_0x0f3d
            java.lang.String r3 = "parent_group_jid"
            int r3 = r4.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x0f44 }
            java.lang.String r3 = r4.getString(r3)     // Catch:{ all -> 0x0f44 }
            r1.A01 = r3     // Catch:{ all -> 0x0f44 }
            java.lang.String r3 = "group_subject"
            int r3 = r4.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x0f44 }
            java.lang.String r3 = r4.getString(r3)     // Catch:{ all -> 0x0f44 }
            r1.A00 = r3     // Catch:{ all -> 0x0f44 }
        L_0x0f3d:
            r4.close()     // Catch:{ all -> 0x0f4b }
            r10.close()     // Catch:{ all -> 0x0f54 }
            goto L_0x0f50
        L_0x0f44:
            r1 = move-exception
            if (r4 == 0) goto L_0x0f4a
            r4.close()     // Catch:{ all -> 0x0f4a }
        L_0x0f4a:
            throw r1     // Catch:{ all -> 0x0f4b }
        L_0x0f4b:
            r1 = move-exception
            r10.close()     // Catch:{ all -> 0x0f4f }
        L_0x0f4f:
            throw r1     // Catch:{ all -> 0x0f54 }
        L_0x0f50:
            r24.close()     // Catch:{ all -> 0x0f85 }
            goto L_0x0f80
        L_0x0f54:
            r1 = move-exception
            r24.close()     // Catch:{ all -> 0x0f7f }
            goto L_0x0f7f
        L_0x0f59:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x0f74 }
            r10.<init>()     // Catch:{ all -> 0x0f74 }
            java.lang.String r1 = "QuotedMessageStore/readQuotedMessageFromLegacyTable/no quote; rowId="
            r10.append(r1)     // Catch:{ all -> 0x0f74 }
            r10.append(r3)     // Catch:{ all -> 0x0f74 }
            java.lang.String r1 = r10.toString()     // Catch:{ all -> 0x0f74 }
            com.whatsapp.util.Log.w((java.lang.String) r1)     // Catch:{ all -> 0x0f74 }
            r8.close()     // Catch:{ all -> 0x0f7b }
            r9.close()     // Catch:{ all -> 0x0f85 }
            goto L_0x0f80
        L_0x0f74:
            r1 = move-exception
            if (r8 == 0) goto L_0x0f7a
            r8.close()     // Catch:{ all -> 0x0f7a }
        L_0x0f7a:
            throw r1     // Catch:{ all -> 0x0f7b }
        L_0x0f7b:
            r1 = move-exception
            r9.close()     // Catch:{ all -> 0x0f7f }
        L_0x0f7f:
            throw r1     // Catch:{ all -> 0x0f85 }
        L_0x0f80:
            r23.close()     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0f8a }
            goto L_0x0a31
        L_0x0f85:
            r1 = move-exception
            r23.close()     // Catch:{ all -> 0x0f89 }
        L_0x0f89:
            throw r1     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0f8a }
        L_0x0f8a:
            r3 = move-exception
            r1 = r22
            r0.A0P = r1     // Catch:{ all -> 0x163a }
            X.0so r7 = r7.A00     // Catch:{ all -> 0x163a }
            java.lang.String r4 = r3.toString()     // Catch:{ all -> 0x163a }
            r3 = 1
            java.lang.String r1 = "QuotedMessageStore/fillQuotedMessage/failed to load quoted message"
            r7.AcB(r1, r4, r3)     // Catch:{ all -> 0x163a }
            goto L_0x0a31
        L_0x0f9d:
            X.0tg r11 = r1.A02     // Catch:{ all -> 0x153b }
            java.lang.String r10 = "SELECT jid_row_id FROM message_mentions WHERE message_row_id = ?"
            r3 = 1
            java.lang.String[] r9 = new java.lang.String[r3]     // Catch:{ all -> 0x153b }
            r12 = 0
            long r3 = r0.A13     // Catch:{ all -> 0x153b }
            java.lang.String r3 = java.lang.Long.toString(r3)     // Catch:{ all -> 0x153b }
            r9[r12] = r3     // Catch:{ all -> 0x153b }
            android.database.Cursor r10 = r11.A08(r10, r9)     // Catch:{ all -> 0x153b }
        L_0x0fb1:
            boolean r3 = r10.moveToNext()     // Catch:{ all -> 0x10eb }
            if (r3 == 0) goto L_0x0fcf
            java.lang.String r3 = "jid_row_id"
            int r3 = r10.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x10eb }
            long r3 = r10.getLong(r3)     // Catch:{ all -> 0x10eb }
            X.14v r9 = r8.A02     // Catch:{ all -> 0x10eb }
            com.whatsapp.jid.Jid r3 = r9.A03(r3)     // Catch:{ all -> 0x10eb }
            com.whatsapp.jid.UserJid r3 = com.whatsapp.jid.UserJid.of(r3)     // Catch:{ all -> 0x10eb }
            r7.add(r3)     // Catch:{ all -> 0x10eb }
            goto L_0x0fb1
        L_0x0fcf:
            r10.close()     // Catch:{ all -> 0x153b }
            r1.close()     // Catch:{ all -> 0x163a }
            r0.A0u(r7)     // Catch:{ all -> 0x163a }
        L_0x0fd8:
            long r3 = r0.A17     // Catch:{ all -> 0x163a }
            r7 = 4
            long r3 = r3 & r7
            int r1 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r1 != 0) goto L_0x100c
            X.16r r7 = r2.A0R     // Catch:{ all -> 0x163a }
            boolean r1 = r7.A0i()     // Catch:{ all -> 0x163a }
            if (r1 == 0) goto L_0x0ff8
            long r3 = r0.A13     // Catch:{ all -> 0x163a }
            X.1Vw r1 = r0.A11     // Catch:{ all -> 0x163a }
            java.lang.String r8 = r1.A01     // Catch:{ all -> 0x163a }
            r1 = r22
            X.1Vt r1 = r7.A0N(r8, r1, r3)     // Catch:{ all -> 0x163a }
            r0.A0L = r1     // Catch:{ all -> 0x163a }
            goto L_0x1004
        L_0x0ff8:
            X.1Vw r1 = r0.A11     // Catch:{ all -> 0x163a }
            java.lang.String r3 = r1.A01     // Catch:{ all -> 0x163a }
            java.lang.String r1 = r0.A0n     // Catch:{ all -> 0x163a }
            X.1Vt r1 = r7.A0M(r3, r1)     // Catch:{ all -> 0x163a }
            r0.A0L = r1     // Catch:{ all -> 0x163a }
        L_0x1004:
            if (r1 == 0) goto L_0x102e
            java.lang.String r1 = r1.A0K     // Catch:{ all -> 0x163a }
            if (r1 == 0) goto L_0x102e
        L_0x100a:
            r0.A0n = r1     // Catch:{ all -> 0x163a }
        L_0x100c:
            boolean r1 = r0 instanceof X.C38831rU     // Catch:{ all -> 0x163a }
            if (r1 == 0) goto L_0x10f6
            X.17v r9 = r2.A0W     // Catch:{ all -> 0x163a }
            r8 = r0
            X.1rU r8 = (X.C38831rU) r8     // Catch:{ all -> 0x163a }
            X.11I r3 = r9.A04     // Catch:{ all -> 0x163a }
            java.lang.String r1 = "revoked_ready"
            long r10 = r3.A01(r1, r5)     // Catch:{ all -> 0x163a }
            r3 = 1
            int r1 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x10f6
            long r3 = r8.A13     // Catch:{ all -> 0x163a }
            r10 = 0
            r7 = 1
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            r4 = 0
            if (r1 <= 0) goto L_0x1032
            goto L_0x1031
        L_0x102e:
            java.lang.String r1 = "UNSET"
            goto L_0x100a
        L_0x1031:
            r4 = 1
        L_0x1032:
            java.lang.String r3 = "RevokedMessageStore/fillRevokedInfo/message must have row_id set; key="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x163a }
            r1.<init>(r3)     // Catch:{ all -> 0x163a }
            X.1Vw r5 = r8.A11     // Catch:{ all -> 0x163a }
            r1.append(r5)     // Catch:{ all -> 0x163a }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x163a }
            X.AnonymousClass00B.A0C(r1, r4)     // Catch:{ all -> 0x163a }
            java.lang.String[] r6 = new java.lang.String[r7]     // Catch:{ all -> 0x163a }
            long r3 = r8.A13     // Catch:{ all -> 0x163a }
            java.lang.String r1 = java.lang.Long.toString(r3)     // Catch:{ all -> 0x163a }
            r6[r10] = r1     // Catch:{ all -> 0x163a }
            X.0tq r1 = r9.A03     // Catch:{ all -> 0x163a }
            X.0tf r1 = r1.get()     // Catch:{ all -> 0x163a }
            X.0tg r4 = r1.A02     // Catch:{ all -> 0x153b }
            java.lang.String r3 = "SELECT revoked_key_id,admin_jid_row_id,revoke_timestamp FROM message_revoked WHERE message_row_id = ?"
            android.database.Cursor r10 = r4.A08(r3, r6)     // Catch:{ all -> 0x153b }
            boolean r3 = r10.moveToNext()     // Catch:{ all -> 0x10eb }
            if (r3 == 0) goto L_0x10e7
            java.lang.String r3 = "revoked_key_id"
            int r3 = r10.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x10eb }
            java.lang.String r3 = r10.getString(r3)     // Catch:{ all -> 0x10eb }
            r8.A01 = r3     // Catch:{ all -> 0x10eb }
            java.lang.String r3 = "admin_jid_row_id"
            int r4 = r10.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x10eb }
            boolean r3 = r10.isNull(r4)     // Catch:{ all -> 0x10eb }
            if (r3 != 0) goto L_0x1096
            long r3 = r10.getLong(r4)     // Catch:{ all -> 0x10eb }
            boolean r6 = r8 instanceof X.C39161s1     // Catch:{ all -> 0x10eb }
            if (r6 == 0) goto L_0x10a4
            r5 = r8
            X.1s1 r5 = (X.C39161s1) r5     // Catch:{ all -> 0x10eb }
            X.14v r7 = r9.A02     // Catch:{ all -> 0x10eb }
            java.lang.Class<com.whatsapp.jid.UserJid> r6 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r3 = r7.A07(r6, r3)     // Catch:{ all -> 0x10eb }
            com.whatsapp.jid.UserJid r3 = (com.whatsapp.jid.UserJid) r3     // Catch:{ all -> 0x10eb }
            X.AnonymousClass00B.A06(r3)     // Catch:{ all -> 0x10eb }
            r5.A00 = r3     // Catch:{ all -> 0x10eb }
        L_0x1096:
            java.lang.String r3 = "revoke_timestamp"
            int r3 = r10.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x10eb }
            long r3 = r10.getLong(r3)     // Catch:{ all -> 0x10eb }
            r8.A00 = r3     // Catch:{ all -> 0x10eb }
            goto L_0x10e7
        L_0x10a4:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x10eb }
            r4.<init>()     // Catch:{ all -> 0x10eb }
            java.lang.String r3 = "mediaType:"
            r4.append(r3)     // Catch:{ all -> 0x10eb }
            X.0w2 r3 = r9.A05     // Catch:{ all -> 0x10eb }
            int r3 = X.C18020w1.A02(r3, r8)     // Catch:{ all -> 0x10eb }
            r4.append(r3)     // Catch:{ all -> 0x10eb }
            java.lang.String r3 = " chatJidType:"
            r4.append(r3)     // Catch:{ all -> 0x10eb }
            X.0rv r3 = r5.A00     // Catch:{ all -> 0x10eb }
            int r3 = X.C18020w1.A04(r3)     // Catch:{ all -> 0x10eb }
            r4.append(r3)     // Catch:{ all -> 0x10eb }
            java.lang.String r3 = " senderJidType:"
            r4.append(r3)     // Catch:{ all -> 0x10eb }
            X.0sK r5 = r9.A01     // Catch:{ all -> 0x10eb }
            X.0rv r3 = r8.A0B()     // Catch:{ all -> 0x10eb }
            com.whatsapp.jid.DeviceJid r3 = com.whatsapp.jid.DeviceJid.of(r3)     // Catch:{ all -> 0x10eb }
            int r3 = X.C18020w1.A01(r5, r3)     // Catch:{ all -> 0x10eb }
            r4.append(r3)     // Catch:{ all -> 0x10eb }
            java.lang.String r5 = r4.toString()     // Catch:{ all -> 0x10eb }
            X.0so r4 = r9.A00     // Catch:{ all -> 0x10eb }
            java.lang.String r3 = "RevokedMessageStore/fillRevokedInfo invalid cast"
            r4.AcB(r3, r5, r7)     // Catch:{ all -> 0x10eb }
            goto L_0x1096
        L_0x10e7:
            r10.close()     // Catch:{ all -> 0x153b }
            goto L_0x10f3
        L_0x10eb:
            r0 = move-exception
            if (r10 == 0) goto L_0x153a
            r10.close()     // Catch:{ all -> 0x153a }
            goto L_0x153a
        L_0x10f3:
            r1.close()     // Catch:{ all -> 0x163a }
        L_0x10f6:
            boolean r1 = r0 instanceof X.C38971ri     // Catch:{ all -> 0x163a }
            if (r1 == 0) goto L_0x1116
            X.189 r1 = r2.A09     // Catch:{ all -> 0x163a }
            r5 = r0
            X.1ri r5 = (X.C38971ri) r5     // Catch:{ all -> 0x163a }
            long r3 = r5.A13     // Catch:{ all -> 0x163a }
            int r3 = r1.A00(r3)     // Catch:{ all -> 0x163a }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x163a }
            if (r3 > 0) goto L_0x1110
            r1 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x163a }
        L_0x1110:
            int r1 = r1.intValue()     // Catch:{ all -> 0x163a }
            r5.A00 = r1     // Catch:{ all -> 0x163a }
        L_0x1116:
            boolean r1 = r0 instanceof X.C39231s8     // Catch:{ all -> 0x163a }
            if (r1 == 0) goto L_0x1136
            X.189 r1 = r2.A09     // Catch:{ all -> 0x163a }
            r5 = r0
            X.1s8 r5 = (X.C39231s8) r5     // Catch:{ all -> 0x163a }
            long r3 = r5.A13     // Catch:{ all -> 0x163a }
            int r3 = r1.A00(r3)     // Catch:{ all -> 0x163a }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x163a }
            if (r3 > 0) goto L_0x1130
            r1 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x163a }
        L_0x1130:
            int r1 = r1.intValue()     // Catch:{ all -> 0x163a }
            r5.A00 = r1     // Catch:{ all -> 0x163a }
        L_0x1136:
            boolean r1 = r0 instanceof X.C40191ti     // Catch:{ all -> 0x163a }
            if (r1 == 0) goto L_0x1147
            X.189 r1 = r2.A09     // Catch:{ all -> 0x163a }
            r5 = r0
            X.1ti r5 = (X.C40191ti) r5     // Catch:{ all -> 0x163a }
            long r3 = r5.A13     // Catch:{ all -> 0x163a }
            int r1 = r1.A00(r3)     // Catch:{ all -> 0x163a }
            r5.A00 = r1     // Catch:{ all -> 0x163a }
        L_0x1147:
            boolean r1 = r0 instanceof X.C40261tp     // Catch:{ all -> 0x163a }
            if (r1 == 0) goto L_0x1158
            X.189 r1 = r2.A09     // Catch:{ all -> 0x163a }
            r5 = r0
            X.1tp r5 = (X.C40261tp) r5     // Catch:{ all -> 0x163a }
            long r3 = r5.A13     // Catch:{ all -> 0x163a }
            int r1 = r1.A00(r3)     // Catch:{ all -> 0x163a }
            r5.A00 = r1     // Catch:{ all -> 0x163a }
        L_0x1158:
            boolean r1 = r0 instanceof X.C40281tr     // Catch:{ all -> 0x163a }
            if (r1 == 0) goto L_0x11a2
            X.189 r7 = r2.A09     // Catch:{ all -> 0x163a }
            r6 = r0
            X.1tr r6 = (X.C40281tr) r6     // Catch:{ all -> 0x163a }
            long r3 = r6.A13     // Catch:{ all -> 0x163a }
            int r1 = r7.A00(r3)     // Catch:{ all -> 0x163a }
            r6.A00 = r1     // Catch:{ all -> 0x163a }
            long r4 = r6.A13     // Catch:{ all -> 0x163a }
            X.0tq r1 = r7.A04     // Catch:{ all -> 0x163a }
            X.0tf r3 = r1.get()     // Catch:{ all -> 0x163a }
            X.0tg r8 = r3.A02     // Catch:{ all -> 0x15dc }
            java.lang.String r7 = "SELECT setting_reason FROM message_ephemeral_setting WHERE message_row_id = ?"
            r1 = 1
            java.lang.String[] r1 = new java.lang.String[r1]     // Catch:{ all -> 0x15dc }
            java.lang.String r4 = java.lang.Long.toString(r4)     // Catch:{ all -> 0x15dc }
            r5 = 0
            r1[r5] = r4     // Catch:{ all -> 0x15dc }
            android.database.Cursor r1 = r8.A08(r7, r1)     // Catch:{ all -> 0x15dc }
            if (r1 == 0) goto L_0x119d
            boolean r4 = r1.moveToNext()     // Catch:{ all -> 0x119a }
            if (r4 == 0) goto L_0x1196
            java.lang.String r4 = "setting_reason"
            int r4 = r1.getColumnIndexOrThrow(r4)     // Catch:{ all -> 0x119a }
            int r5 = r1.getInt(r4)     // Catch:{ all -> 0x119a }
        L_0x1196:
            r1.close()     // Catch:{ all -> 0x15dc }
            goto L_0x119d
        L_0x119a:
            r0 = move-exception
            goto L_0x15d8
        L_0x119d:
            r3.close()     // Catch:{ all -> 0x163a }
            r6.A00 = r5     // Catch:{ all -> 0x163a }
        L_0x11a2:
            boolean r1 = r0 instanceof X.C40201tj     // Catch:{ all -> 0x163a }
            if (r1 == 0) goto L_0x11b3
            X.189 r1 = r2.A09     // Catch:{ all -> 0x163a }
            r5 = r0
            X.1tj r5 = (X.C40201tj) r5     // Catch:{ all -> 0x163a }
            long r3 = r5.A13     // Catch:{ all -> 0x163a }
            int r1 = r1.A00(r3)     // Catch:{ all -> 0x163a }
            r5.A00 = r1     // Catch:{ all -> 0x163a }
        L_0x11b3:
            boolean r1 = r0 instanceof X.C16840tj     // Catch:{ all -> 0x163a }
            if (r1 == 0) goto L_0x11c3
            X.0vM r6 = r2.A0E     // Catch:{ all -> 0x163a }
            r5 = r0
            X.0tj r5 = (X.C16840tj) r5     // Catch:{ all -> 0x163a }
            long r3 = r0.A13     // Catch:{ all -> 0x163a }
            java.lang.String r1 = "SELECT element_type, element_content FROM message_ui_elements WHERE message_row_id = ?"
            r6.A0I(r5, r1, r3)     // Catch:{ all -> 0x163a }
        L_0x11c3:
            boolean r1 = r0 instanceof X.C39041rp     // Catch:{ all -> 0x163a }
            if (r1 == 0) goto L_0x11d1
            X.0vM r4 = r2.A0E     // Catch:{ all -> 0x163a }
            r3 = r0
            X.1rp r3 = (X.C39041rp) r3     // Catch:{ all -> 0x163a }
            java.lang.String r1 = "SELECT message_row_id, element_type, reply_values, reply_description FROM message_ui_elements_reply WHERE message_row_id=?"
            r4.A0F(r3, r1)     // Catch:{ all -> 0x163a }
        L_0x11d1:
            boolean r1 = r0 instanceof X.C39051rq     // Catch:{ all -> 0x163a }
            if (r1 == 0) goto L_0x11df
            X.0vM r4 = r2.A0E     // Catch:{ all -> 0x163a }
            r3 = r0
            X.1rq r3 = (X.C39051rq) r3     // Catch:{ all -> 0x163a }
            java.lang.String r1 = "SELECT message_row_id, element_type, reply_values, reply_description FROM message_ui_elements_reply WHERE message_row_id=?"
            r4.A0B(r3, r1)     // Catch:{ all -> 0x163a }
        L_0x11df:
            r1 = 256(0x100, float:3.59E-43)
            boolean r1 = r0.A10(r1)     // Catch:{ all -> 0x163a }
            if (r1 == 0) goto L_0x123e
            X.182 r1 = r2.A08     // Catch:{ all -> 0x163a }
            X.0tq r1 = r1.A05     // Catch:{ all -> 0x163a }
            X.0tf r1 = r1.get()     // Catch:{ all -> 0x163a }
            X.0tg r8 = r1.A02     // Catch:{ all -> 0x153b }
            java.lang.String r7 = "SELECT duration, expire_timestamp, keep_in_chat FROM message_ephemeral WHERE message_row_id = ?"
            r3 = 1
            java.lang.String[] r6 = new java.lang.String[r3]     // Catch:{ all -> 0x153b }
            r5 = 0
            long r3 = r0.A13     // Catch:{ all -> 0x153b }
            java.lang.String r3 = java.lang.Long.toString(r3)     // Catch:{ all -> 0x153b }
            r6[r5] = r3     // Catch:{ all -> 0x153b }
            android.database.Cursor r5 = r8.A08(r7, r6)     // Catch:{ all -> 0x153b }
            if (r5 == 0) goto L_0x123b
            boolean r3 = r5.moveToNext()     // Catch:{ all -> 0x1238 }
            if (r3 == 0) goto L_0x1234
            java.lang.String r3 = "duration"
            int r7 = r5.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x1238 }
            java.lang.String r3 = "expire_timestamp"
            int r4 = r5.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x1238 }
            java.lang.String r3 = "keep_in_chat"
            int r6 = r5.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x1238 }
            int r3 = r5.getInt(r7)     // Catch:{ all -> 0x1238 }
            r0.A0T(r3)     // Catch:{ all -> 0x1238 }
            long r3 = r5.getLong(r4)     // Catch:{ all -> 0x1238 }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x1238 }
            r0.A0Z = r3     // Catch:{ all -> 0x1238 }
            int r3 = r5.getInt(r6)     // Catch:{ all -> 0x1238 }
            r0.A06 = r3     // Catch:{ all -> 0x1238 }
        L_0x1234:
            r5.close()     // Catch:{ all -> 0x153b }
            goto L_0x123b
        L_0x1238:
            r0 = move-exception
            goto L_0x1357
        L_0x123b:
            r1.close()     // Catch:{ all -> 0x163a }
        L_0x123e:
            r1 = 1024(0x400, float:1.435E-42)
            boolean r1 = r0.A10(r1)     // Catch:{ all -> 0x163a }
            if (r1 == 0) goto L_0x1314
            X.188 r1 = r2.A0A     // Catch:{ all -> 0x163a }
            X.0tq r1 = r1.A00     // Catch:{ all -> 0x163a }
            X.0tf r3 = r1.get()     // Catch:{ all -> 0x163a }
            X.0tg r9 = r3.A02     // Catch:{ all -> 0x15dc }
            java.lang.String r8 = "SELECT title, body, media_type, thumbnail_url, full_thumbnail, micro_thumbnail, media_url, source_type, source_id, source_url, render_larger_thumbnail, show_ad_attribution, has_icebreaker_auto_response  FROM message_external_ad_content WHERE message_row_id = ?"
            r1 = 1
            java.lang.String[] r7 = new java.lang.String[r1]     // Catch:{ all -> 0x15dc }
            r6 = 0
            long r4 = r0.A13     // Catch:{ all -> 0x15dc }
            java.lang.String r1 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x15dc }
            r7[r6] = r1     // Catch:{ all -> 0x15dc }
            android.database.Cursor r1 = r9.A08(r8, r7)     // Catch:{ all -> 0x15dc }
            boolean r4 = r1.moveToLast()     // Catch:{ all -> 0x15d5 }
            if (r4 == 0) goto L_0x130e
            java.lang.String r4 = "title"
            int r4 = r1.getColumnIndexOrThrow(r4)     // Catch:{ all -> 0x15d5 }
            java.lang.String r27 = r1.getString(r4)     // Catch:{ all -> 0x15d5 }
            java.lang.String r4 = "body"
            int r4 = r1.getColumnIndexOrThrow(r4)     // Catch:{ all -> 0x15d5 }
            java.lang.String r28 = r1.getString(r4)     // Catch:{ all -> 0x15d5 }
            java.lang.String r4 = "media_type"
            int r4 = r1.getColumnIndexOrThrow(r4)     // Catch:{ all -> 0x15d5 }
            int r37 = r1.getInt(r4)     // Catch:{ all -> 0x15d5 }
            java.lang.String r4 = "thumbnail_url"
            int r4 = r1.getColumnIndexOrThrow(r4)     // Catch:{ all -> 0x15d5 }
            java.lang.String r29 = r1.getString(r4)     // Catch:{ all -> 0x15d5 }
            java.lang.String r4 = "micro_thumbnail"
            int r4 = r1.getColumnIndexOrThrow(r4)     // Catch:{ all -> 0x15d5 }
            byte[] r35 = r1.getBlob(r4)     // Catch:{ all -> 0x15d5 }
            java.lang.String r4 = "full_thumbnail"
            int r4 = r1.getColumnIndexOrThrow(r4)     // Catch:{ all -> 0x15d5 }
            byte[] r36 = r1.getBlob(r4)     // Catch:{ all -> 0x15d5 }
            java.lang.String r4 = "media_url"
            int r4 = r1.getColumnIndexOrThrow(r4)     // Catch:{ all -> 0x15d5 }
            java.lang.String r30 = r1.getString(r4)     // Catch:{ all -> 0x15d5 }
            java.lang.String r4 = "source_type"
            int r4 = r1.getColumnIndexOrThrow(r4)     // Catch:{ all -> 0x15d5 }
            java.lang.String r31 = r1.getString(r4)     // Catch:{ all -> 0x15d5 }
            java.lang.String r4 = "source_id"
            int r4 = r1.getColumnIndexOrThrow(r4)     // Catch:{ all -> 0x15d5 }
            java.lang.String r32 = r1.getString(r4)     // Catch:{ all -> 0x15d5 }
            java.lang.String r4 = "source_url"
            int r4 = r1.getColumnIndexOrThrow(r4)     // Catch:{ all -> 0x15d5 }
            java.lang.String r33 = r1.getString(r4)     // Catch:{ all -> 0x15d5 }
            java.lang.String r4 = "render_larger_thumbnail"
            int r4 = r1.getColumnIndexOrThrow(r4)     // Catch:{ all -> 0x15d5 }
            int r4 = r1.getInt(r4)     // Catch:{ all -> 0x15d5 }
            r38 = 0
            if (r4 == 0) goto L_0x12e1
            r38 = 1
        L_0x12e1:
            java.lang.String r4 = "show_ad_attribution"
            int r4 = r1.getColumnIndexOrThrow(r4)     // Catch:{ all -> 0x15d5 }
            int r4 = r1.getInt(r4)     // Catch:{ all -> 0x15d5 }
            r39 = 0
            if (r4 == 0) goto L_0x12f2
            r39 = 1
        L_0x12f2:
            java.lang.String r4 = "has_icebreaker_auto_response"
            int r4 = r1.getColumnIndexOrThrow(r4)     // Catch:{ all -> 0x15d5 }
            int r4 = r1.getInt(r4)     // Catch:{ all -> 0x15d5 }
            r40 = 0
            if (r4 == 0) goto L_0x1302
            r40 = 1
        L_0x1302:
            X.1uH r4 = new X.1uH     // Catch:{ all -> 0x15d5 }
            r26 = r4
            r34 = r22
            r26.<init>(r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)     // Catch:{ all -> 0x15d5 }
            r0.A0c(r4)     // Catch:{ all -> 0x15d5 }
        L_0x130e:
            r1.close()     // Catch:{ all -> 0x15dc }
            r3.close()     // Catch:{ all -> 0x163a }
        L_0x1314:
            boolean r1 = r0 instanceof X.C39001rl     // Catch:{ all -> 0x163a }
            if (r1 == 0) goto L_0x1362
            X.180 r1 = r2.A0a     // Catch:{ all -> 0x163a }
            r6 = r0
            X.1rl r6 = (X.C39001rl) r6     // Catch:{ all -> 0x163a }
            long r3 = r0.A13     // Catch:{ all -> 0x163a }
            X.0tq r1 = r1.A01     // Catch:{ all -> 0x163a }
            X.0tf r1 = r1.get()     // Catch:{ all -> 0x163a }
            X.0tg r9 = r1.A02     // Catch:{ all -> 0x153b }
            java.lang.String r8 = "SELECT state FROM message_view_once_media WHERE message_row_id = ?"
            r5 = 1
            java.lang.String[] r7 = new java.lang.String[r5]     // Catch:{ all -> 0x153b }
            r5 = 0
            java.lang.String r3 = java.lang.Long.toString(r3)     // Catch:{ all -> 0x153b }
            r7[r5] = r3     // Catch:{ all -> 0x153b }
            android.database.Cursor r5 = r9.A08(r8, r7)     // Catch:{ all -> 0x153b }
            java.lang.String r3 = "state"
            int r4 = r5.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x1354 }
            boolean r3 = r5.moveToNext()     // Catch:{ all -> 0x1354 }
            if (r3 == 0) goto L_0x134c
            int r3 = r5.getInt(r4)     // Catch:{ all -> 0x1354 }
            r5.close()     // Catch:{ all -> 0x153b }
            goto L_0x135c
        L_0x134c:
            r5.close()     // Catch:{ all -> 0x153b }
            r1.close()     // Catch:{ all -> 0x163a }
            r3 = 2
            goto L_0x135f
        L_0x1354:
            r0 = move-exception
            if (r5 == 0) goto L_0x153a
        L_0x1357:
            r5.close()     // Catch:{ all -> 0x153a }
            goto L_0x153a
        L_0x135c:
            r1.close()     // Catch:{ all -> 0x163a }
        L_0x135f:
            r6.Aey(r3)     // Catch:{ all -> 0x163a }
        L_0x1362:
            r1 = 2048(0x800, float:2.87E-42)
            boolean r1 = r0.A10(r1)     // Catch:{ all -> 0x163a }
            if (r1 == 0) goto L_0x1431
            X.18B r6 = r2.A0O     // Catch:{ all -> 0x163a }
            long r3 = r0.A13     // Catch:{ all -> 0x163a }
            X.0tq r1 = r6.A01     // Catch:{ all -> 0x163a }
            X.0tf r1 = r1.get()     // Catch:{ all -> 0x163a }
            X.0tg r9 = r1.A02     // Catch:{ all -> 0x153b }
            java.lang.String r8 = "SELECT message_row_id, direct_path, media_key, media_key_timestamp, enc_thumb_hash, thumb_hash, thumb_width, thumb_height, transferred, micro_thumbnail, insert_timestamp FROM mms_thumbnail_metadata WHERE message_row_id = ?"
            r5 = 1
            java.lang.String[] r7 = new java.lang.String[r5]     // Catch:{ all -> 0x153b }
            r5 = 0
            java.lang.String r3 = java.lang.Long.toString(r3)     // Catch:{ all -> 0x153b }
            r7[r5] = r3     // Catch:{ all -> 0x153b }
            android.database.Cursor r7 = r9.A08(r8, r7)     // Catch:{ all -> 0x153b }
            boolean r3 = r7.moveToLast()     // Catch:{ all -> 0x141e }
            if (r3 == 0) goto L_0x140d
            X.1cv r5 = new X.1cv     // Catch:{ all -> 0x141e }
            r5.<init>()     // Catch:{ all -> 0x141e }
            java.lang.String r3 = "direct_path"
            int r3 = r7.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x141e }
            java.lang.String r3 = r7.getString(r3)     // Catch:{ all -> 0x141e }
            r5.A04 = r3     // Catch:{ all -> 0x141e }
            java.lang.String r3 = "media_key"
            int r3 = r7.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x141e }
            byte[] r3 = r7.getBlob(r3)     // Catch:{ all -> 0x141e }
            r5.A09 = r3     // Catch:{ all -> 0x141e }
            java.lang.String r3 = "media_key_timestamp"
            int r3 = r7.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x141e }
            long r3 = r7.getLong(r3)     // Catch:{ all -> 0x141e }
            r5.A02 = r3     // Catch:{ all -> 0x141e }
            java.lang.String r3 = "enc_thumb_hash"
            int r3 = r7.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x141e }
            java.lang.String r3 = r7.getString(r3)     // Catch:{ all -> 0x141e }
            r5.A05 = r3     // Catch:{ all -> 0x141e }
            java.lang.String r3 = "thumb_hash"
            int r3 = r7.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x141e }
            java.lang.String r3 = r7.getString(r3)     // Catch:{ all -> 0x141e }
            r5.A07 = r3     // Catch:{ all -> 0x141e }
            java.lang.String r3 = "thumb_width"
            int r3 = r7.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x141e }
            int r3 = r7.getInt(r3)     // Catch:{ all -> 0x141e }
            r5.A01 = r3     // Catch:{ all -> 0x141e }
            java.lang.String r3 = "thumb_height"
            int r3 = r7.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x141e }
            int r3 = r7.getInt(r3)     // Catch:{ all -> 0x141e }
            r5.A00 = r3     // Catch:{ all -> 0x141e }
            java.lang.String r3 = "transferred"
            int r3 = r7.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x141e }
            long r10 = r7.getLong(r3)     // Catch:{ all -> 0x141e }
            r8 = 1
            int r4 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            r3 = 0
            if (r4 != 0) goto L_0x13fb
            r3 = 1
        L_0x13fb:
            r5.A08 = r3     // Catch:{ all -> 0x141e }
            java.lang.String r3 = "micro_thumbnail"
            int r3 = r7.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x141e }
            byte[] r3 = r7.getBlob(r3)     // Catch:{ all -> 0x141e }
            r5.A0A = r3     // Catch:{ all -> 0x141e }
            r7.close()     // Catch:{ all -> 0x153b }
            goto L_0x1415
        L_0x140d:
            r7.close()     // Catch:{ all -> 0x153b }
            r1.close()     // Catch:{ all -> 0x163a }
            r5 = 0
            goto L_0x1418
        L_0x1415:
            r1.close()     // Catch:{ all -> 0x163a }
        L_0x1418:
            r0.A0h(r5)     // Catch:{ all -> 0x163a }
            if (r5 == 0) goto L_0x1431
            goto L_0x1426
        L_0x141e:
            r0 = move-exception
            if (r7 == 0) goto L_0x153a
            r7.close()     // Catch:{ all -> 0x153a }
            goto L_0x153a
        L_0x1426:
            X.0pd r1 = r6.A02     // Catch:{ all -> 0x163a }
            boolean r1 = X.C40541uI.A01(r1, r0)     // Catch:{ all -> 0x163a }
            if (r1 == 0) goto L_0x1431
            r1 = 1
            r5.A0B = r1     // Catch:{ all -> 0x163a }
        L_0x1431:
            r1 = 4096(0x1000, float:5.74E-42)
            boolean r1 = r0.A10(r1)     // Catch:{ all -> 0x163a }
            if (r1 == 0) goto L_0x144b
            X.186 r1 = r2.A0T     // Catch:{ all -> 0x163a }
            long r3 = r0.A13     // Catch:{ all -> 0x163a }
            X.1uG r3 = r1.A00(r3)     // Catch:{ all -> 0x163a }
            if (r3 == 0) goto L_0x144b
            java.lang.String r1 = r3.A01     // Catch:{ all -> 0x163a }
            r0.A0i = r1     // Catch:{ all -> 0x163a }
            X.1ta r1 = r3.A00     // Catch:{ all -> 0x163a }
            r0.A0V = r1     // Catch:{ all -> 0x163a }
        L_0x144b:
            boolean r1 = r0.A0x()     // Catch:{ all -> 0x163a }
            if (r1 == 0) goto L_0x145a
            X.0vM r5 = r2.A0E     // Catch:{ all -> 0x163a }
            long r3 = r0.A13     // Catch:{ all -> 0x163a }
            java.lang.String r1 = "SELECT element_type, element_content FROM message_ui_elements WHERE message_row_id = ?"
            r5.A08(r0, r1, r3)     // Catch:{ all -> 0x163a }
        L_0x145a:
            boolean r1 = r0 instanceof X.C39061rr     // Catch:{ all -> 0x163a }
            if (r1 == 0) goto L_0x1468
            X.187 r4 = r2.A0Q     // Catch:{ all -> 0x163a }
            r3 = r0
            X.1rr r3 = (X.C39061rr) r3     // Catch:{ all -> 0x163a }
            java.lang.String r1 = "SELECT message_row_id, service, expiration_timestamp FROM message_payment_invite WHERE message_row_id = ?"
            r4.A00(r3, r1)     // Catch:{ all -> 0x163a }
        L_0x1468:
            boolean r15 = r0 instanceof X.C39171s2     // Catch:{ all -> 0x163a }
            if (r15 == 0) goto L_0x1544
            X.17i r1 = r2.A0S     // Catch:{ all -> 0x163a }
            r14 = r0
            X.1s2 r14 = (X.C39171s2) r14     // Catch:{ all -> 0x163a }
            X.0tq r5 = r1.A03     // Catch:{ all -> 0x163a }
            X.0tf r1 = r5.get()     // Catch:{ all -> 0x163a }
            X.0tg r8 = r1.A02     // Catch:{ all -> 0x153b }
            java.lang.String r7 = "SELECT selectable_options_count, invalid_state, poll_logging_id FROM message_poll WHERE message_row_id = ?"
            r3 = 1
            java.lang.String[] r6 = new java.lang.String[r3]     // Catch:{ all -> 0x153b }
            r9 = 0
            long r3 = r14.A13     // Catch:{ all -> 0x153b }
            java.lang.String r3 = java.lang.Long.toString(r3)     // Catch:{ all -> 0x153b }
            r6[r9] = r3     // Catch:{ all -> 0x153b }
            android.database.Cursor r6 = r8.A08(r7, r6)     // Catch:{ all -> 0x153b }
            boolean r3 = r6.moveToLast()     // Catch:{ all -> 0x1534 }
            if (r3 == 0) goto L_0x14b6
            java.lang.String r3 = "selectable_options_count"
            int r8 = r6.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x1534 }
            java.lang.String r3 = "invalid_state"
            int r7 = r6.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x1534 }
            java.lang.String r3 = "poll_logging_id"
            int r4 = r6.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x1534 }
            int r3 = r6.getInt(r8)     // Catch:{ all -> 0x1534 }
            r14.A01 = r3     // Catch:{ all -> 0x1534 }
            int r3 = r6.getInt(r7)     // Catch:{ all -> 0x1534 }
            r14.A00 = r3     // Catch:{ all -> 0x1534 }
            long r3 = r6.getLong(r4)     // Catch:{ all -> 0x1534 }
            r14.A02 = r3     // Catch:{ all -> 0x1534 }
        L_0x14b6:
            r6.close()     // Catch:{ all -> 0x153b }
            r1.close()     // Catch:{ all -> 0x163a }
            X.0tf r20 = r5.get()     // Catch:{ all -> 0x163a }
            r1 = r20
            X.0tg r7 = r1.A02     // Catch:{ all -> 0x152e }
            java.lang.String r6 = "SELECT _id, option_sha256, option_name, vote_total FROM message_poll_option WHERE message_row_id = ?"
            r1 = 1
            java.lang.String[] r5 = new java.lang.String[r1]     // Catch:{ all -> 0x152e }
            long r3 = r14.A13     // Catch:{ all -> 0x152e }
            java.lang.String r1 = java.lang.Long.toString(r3)     // Catch:{ all -> 0x152e }
            r5[r9] = r1     // Catch:{ all -> 0x152e }
            android.database.Cursor r13 = r7.A08(r6, r5)     // Catch:{ all -> 0x152e }
            boolean r1 = r13.moveToFirst()     // Catch:{ all -> 0x1527 }
            if (r1 == 0) goto L_0x1523
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ all -> 0x1527 }
            r12.<init>()     // Catch:{ all -> 0x1527 }
            java.lang.String r1 = "_id"
            int r11 = r13.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x1527 }
            java.lang.String r1 = "option_name"
            int r10 = r13.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x1527 }
            java.lang.String r1 = "option_sha256"
            int r9 = r13.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x1527 }
            java.lang.String r1 = "vote_total"
            int r8 = r13.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x1527 }
        L_0x14f9:
            long r5 = r13.getLong(r11)     // Catch:{ all -> 0x1527 }
            java.lang.String r7 = r13.getString(r10)     // Catch:{ all -> 0x1527 }
            java.lang.String r4 = r13.getString(r9)     // Catch:{ all -> 0x1527 }
            int r3 = r13.getInt(r8)     // Catch:{ all -> 0x1527 }
            X.1sn r1 = new X.1sn     // Catch:{ all -> 0x1527 }
            r1.<init>(r7, r4)     // Catch:{ all -> 0x1527 }
            r1.A01 = r5     // Catch:{ all -> 0x1527 }
            r1.A00 = r3     // Catch:{ all -> 0x1527 }
            r12.add(r1)     // Catch:{ all -> 0x1527 }
            boolean r1 = r13.moveToNext()     // Catch:{ all -> 0x1527 }
            if (r1 != 0) goto L_0x14f9
            java.util.List r1 = r14.A05     // Catch:{ all -> 0x1527 }
            r1.clear()     // Catch:{ all -> 0x1527 }
            r1.addAll(r12)     // Catch:{ all -> 0x1527 }
        L_0x1523:
            r13.close()     // Catch:{ all -> 0x152e }
            goto L_0x1541
        L_0x1527:
            r0 = move-exception
            if (r13 == 0) goto L_0x152d
            r13.close()     // Catch:{ all -> 0x152d }
        L_0x152d:
            throw r0     // Catch:{ all -> 0x152e }
        L_0x152e:
            r0 = move-exception
            r20.close()     // Catch:{ all -> 0x1639 }
            goto L_0x1639
        L_0x1534:
            r0 = move-exception
            if (r6 == 0) goto L_0x153a
            r6.close()     // Catch:{ all -> 0x153a }
        L_0x153a:
            throw r0     // Catch:{ all -> 0x153b }
        L_0x153b:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x1639 }
            goto L_0x1639
        L_0x1541:
            r20.close()     // Catch:{ all -> 0x163a }
        L_0x1544:
            X.0rt r3 = r2.A06     // Catch:{ all -> 0x163a }
            if (r15 != 0) goto L_0x155c
            if (r19 != 0) goto L_0x155c
            boolean r1 = r0.A0v     // Catch:{ all -> 0x163a }
            if (r1 != 0) goto L_0x155c
            boolean r1 = r0 instanceof X.C38541qx     // Catch:{ all -> 0x163a }
            if (r1 != 0) goto L_0x1568
            X.1Vw r1 = r0.A11     // Catch:{ all -> 0x163a }
            X.0rv r1 = r1.A00     // Catch:{ all -> 0x163a }
            boolean r1 = r3.A0H(r1)     // Catch:{ all -> 0x163a }
            if (r1 == 0) goto L_0x1568
        L_0x155c:
            X.17o r5 = r2.A0L     // Catch:{ all -> 0x163a }
            long r3 = r0.A13     // Catch:{ all -> 0x163a }
            byte[] r1 = r5.A01(r3)     // Catch:{ all -> 0x163a }
            if (r1 == 0) goto L_0x1579
            r0.A1F = r1     // Catch:{ all -> 0x163a }
        L_0x1568:
            r1 = 131072(0x20000, float:1.83671E-40)
            boolean r1 = r0.A10(r1)     // Catch:{ all -> 0x163a }
            if (r1 == 0) goto L_0x15e1
            X.0v1 r1 = r2.A0K     // Catch:{ all -> 0x163a }
            X.0tq r1 = r1.A01     // Catch:{ all -> 0x163a }
            X.0tf r3 = r1.get()     // Catch:{ all -> 0x163a }
            goto L_0x1582
        L_0x1579:
            X.0t9 r4 = r5.A01     // Catch:{ all -> 0x163a }
            r3 = 1
            java.lang.String r1 = "MessageSecretStore/fillMessageSecretForMessage"
            X.AnonymousClass1H2.A00(r4, r1, r3)     // Catch:{ all -> 0x163a }
            goto L_0x1568
        L_0x1582:
            X.0tg r9 = r3.A02     // Catch:{ all -> 0x15dc }
            java.lang.String r8 = "SELECT original_key_id,edited_timestamp,sender_timestamp FROM message_edit_info WHERE message_row_id = ?"
            r1 = 1
            java.lang.String[] r7 = new java.lang.String[r1]     // Catch:{ all -> 0x15dc }
            r6 = 0
            long r4 = r0.A13     // Catch:{ all -> 0x15dc }
            java.lang.String r1 = java.lang.Long.toString(r4)     // Catch:{ all -> 0x15dc }
            r7[r6] = r1     // Catch:{ all -> 0x15dc }
            android.database.Cursor r1 = r9.A08(r8, r7)     // Catch:{ all -> 0x15dc }
            boolean r4 = r1.moveToNext()     // Catch:{ all -> 0x15d5 }
            if (r4 == 0) goto L_0x15ce
            java.lang.String r4 = "original_key_id"
            int r4 = r1.getColumnIndexOrThrow(r4)     // Catch:{ all -> 0x15d5 }
            java.lang.String r6 = r1.getString(r4)     // Catch:{ all -> 0x15d5 }
            java.lang.String r4 = "edited_timestamp"
            int r4 = r1.getColumnIndexOrThrow(r4)     // Catch:{ all -> 0x15d5 }
            long r8 = r1.getLong(r4)     // Catch:{ all -> 0x15d5 }
            java.lang.String r4 = "sender_timestamp"
            int r4 = r1.getColumnIndexOrThrow(r4)     // Catch:{ all -> 0x15d5 }
            long r10 = r1.getLong(r4)     // Catch:{ all -> 0x15d5 }
            X.1Vw r4 = r0.A11     // Catch:{ all -> 0x15d5 }
            X.0rv r5 = r4.A00     // Catch:{ all -> 0x15d5 }
            boolean r4 = r4.A02     // Catch:{ all -> 0x15d5 }
            X.1Vw r7 = new X.1Vw     // Catch:{ all -> 0x15d5 }
            r7.<init>(r5, r6, r4)     // Catch:{ all -> 0x15d5 }
            X.1sC r6 = new X.1sC     // Catch:{ all -> 0x15d5 }
            r6.<init>(r7, r8, r10)     // Catch:{ all -> 0x15d5 }
            r0.A0g(r6)     // Catch:{ all -> 0x15d5 }
        L_0x15ce:
            r1.close()     // Catch:{ all -> 0x15dc }
            r3.close()     // Catch:{ all -> 0x163a }
            goto L_0x15e1
        L_0x15d5:
            r0 = move-exception
            if (r1 == 0) goto L_0x15db
        L_0x15d8:
            r1.close()     // Catch:{ all -> 0x15db }
        L_0x15db:
            throw r0     // Catch:{ all -> 0x15dc }
        L_0x15dc:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x1639 }
            goto L_0x1639
        L_0x15e1:
            r25.close()     // Catch:{ all -> 0x163f }
            X.0vN r5 = r2.A07     // Catch:{ all -> 0x163f }
            long r3 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x163f }
            long r3 = r3 - r17
            java.lang.String r1 = "CachedMessageStore/fillMessageFromExtraTables"
            r5.A00(r1, r3)     // Catch:{ all -> 0x163f }
            X.1sc r3 = r2.A0J
            monitor-enter(r3)
            r1 = r16
            X.0tZ r1 = r2.A04(r1)     // Catch:{ all -> 0x1605 }
            if (r1 == 0) goto L_0x15fe
            r0 = r1
            goto L_0x1603
        L_0x15fe:
            X.1Vw r1 = r0.A11     // Catch:{ all -> 0x1605 }
            r3.A00(r0, r1)     // Catch:{ all -> 0x1605 }
        L_0x1603:
            monitor-exit(r3)     // Catch:{ all -> 0x1605 }
            return r0
        L_0x1605:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x1605 }
            throw r0
        L_0x1608:
            r0 = move-exception
            if (r4 == 0) goto L_0x160e
            r4.close()     // Catch:{ all -> 0x160e }
        L_0x160e:
            throw r0     // Catch:{ all -> 0x160f }
        L_0x160f:
            r0 = move-exception
            if (r1 == 0) goto L_0x1615
            r1.close()     // Catch:{ all -> 0x1615 }
        L_0x1615:
            throw r0     // Catch:{ all -> 0x1616 }
        L_0x1616:
            r0 = move-exception
            r23.close()     // Catch:{ all -> 0x1639 }
            goto L_0x1639
        L_0x161b:
            r0 = move-exception
            if (r15 == 0) goto L_0x1621
            r15.close()     // Catch:{ all -> 0x1621 }
        L_0x1621:
            throw r0     // Catch:{ all -> 0x1622 }
        L_0x1622:
            r0 = move-exception
            if (r8 == 0) goto L_0x1628
            r8.close()     // Catch:{ all -> 0x1628 }
        L_0x1628:
            throw r0     // Catch:{ all -> 0x1629 }
        L_0x1629:
            r0 = move-exception
            r26.close()     // Catch:{ all -> 0x162d }
        L_0x162d:
            throw r0     // Catch:{ all -> 0x162e }
        L_0x162e:
            r0 = move-exception
            if (r10 == 0) goto L_0x1634
            r10.close()     // Catch:{ all -> 0x1634 }
        L_0x1634:
            throw r0     // Catch:{ all -> 0x1635 }
        L_0x1635:
            r0 = move-exception
            r27.close()     // Catch:{ all -> 0x1639 }
        L_0x1639:
            throw r0     // Catch:{ all -> 0x163a }
        L_0x163a:
            r0 = move-exception
            r25.close()     // Catch:{ all -> 0x163e }
        L_0x163e:
            throw r0     // Catch:{ all -> 0x163f }
        L_0x163f:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16820th.A02(android.database.Cursor, X.0rv, boolean):X.0tZ");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0068 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:18:0x0052=Splitter:B:18:0x0052, B:25:0x0068=Splitter:B:25:0x0068} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C16740tZ A03(X.C28381Vw r12) {
        /*
            r11 = this;
            if (r12 == 0) goto L_0x0072
            X.0rv r3 = r12.A00
            if (r3 == 0) goto L_0x0072
            X.0tq r0 = r11.A0M
            X.0tf r4 = r0.get()
            X.0tZ r10 = r11.A04(r12)     // Catch:{ all -> 0x006d }
            if (r10 != 0) goto L_0x0069
            long r8 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x006d }
            X.0tg r7 = r4.A02     // Catch:{ all -> 0x006d }
            java.lang.String r6 = X.C39511sb.A03     // Catch:{ all -> 0x006d }
            r0 = 3
            java.lang.String[] r5 = new java.lang.String[r0]     // Catch:{ all -> 0x006d }
            X.0ts r0 = r11.A05     // Catch:{ all -> 0x006d }
            long r0 = r0.A02(r3)     // Catch:{ all -> 0x006d }
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x006d }
            r2 = 0
            r5[r2] = r0     // Catch:{ all -> 0x006d }
            boolean r0 = r12.A02     // Catch:{ all -> 0x006d }
            r1 = 1
            if (r0 == 0) goto L_0x0030
            r2 = 1
        L_0x0030:
            java.lang.String r0 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x006d }
            r5[r1] = r0     // Catch:{ all -> 0x006d }
            r1 = 2
            java.lang.String r0 = r12.A01     // Catch:{ all -> 0x006d }
            r5[r1] = r0     // Catch:{ all -> 0x006d }
            android.database.Cursor r1 = r7.A08(r6, r5)     // Catch:{ all -> 0x006d }
            if (r1 != 0) goto L_0x0047
            java.lang.String r0 = "CachedMessageStore/getmessage no cursor!"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0062 }
            goto L_0x0055
        L_0x0047:
            boolean r0 = r1.moveToLast()     // Catch:{ all -> 0x0062 }
            if (r0 == 0) goto L_0x0052
            r0 = 0
            X.0tZ r10 = r11.A02(r1, r3, r0)     // Catch:{ all -> 0x0062 }
        L_0x0052:
            r1.close()     // Catch:{ all -> 0x006d }
        L_0x0055:
            X.0vN r3 = r11.A07     // Catch:{ all -> 0x006d }
            java.lang.String r2 = "CachedMessageStore/getMessage/key"
            long r0 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x006d }
            long r0 = r0 - r8
            r3.A00(r2, r0)     // Catch:{ all -> 0x006d }
            goto L_0x0069
        L_0x0062:
            r0 = move-exception
            if (r1 == 0) goto L_0x0068
            r1.close()     // Catch:{ all -> 0x0068 }
        L_0x0068:
            throw r0     // Catch:{ all -> 0x006d }
        L_0x0069:
            r4.close()
            return r10
        L_0x006d:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0071 }
        L_0x0071:
            throw r0
        L_0x0072:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16820th.A03(X.1Vw):X.0tZ");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0032, code lost:
        r0 = r1.A0Z;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003e, code lost:
        r2 = r1.A0Z;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C16740tZ A04(X.C28381Vw r6) {
        /*
            r5 = this;
            X.1sc r4 = r5.A0J
            monitor-enter(r4)
            X.03L r3 = r4.A01     // Catch:{ all -> 0x004b }
            java.lang.Object r2 = r3.A02(r6)     // Catch:{ all -> 0x004b }
            X.0tZ r2 = (X.C16740tZ) r2     // Catch:{ all -> 0x004b }
            if (r2 != 0) goto L_0x0025
            java.util.Map r1 = r4.A02     // Catch:{ all -> 0x004b }
            java.lang.Object r0 = r1.get(r6)     // Catch:{ all -> 0x004b }
            java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0     // Catch:{ all -> 0x004b }
            if (r0 == 0) goto L_0x0025
            java.lang.Object r2 = r0.get()     // Catch:{ all -> 0x004b }
            X.0tZ r2 = (X.C16740tZ) r2     // Catch:{ all -> 0x004b }
            r1.remove(r6)     // Catch:{ all -> 0x004b }
            if (r2 == 0) goto L_0x0025
            r3.A06(r6, r2)     // Catch:{ all -> 0x004b }
        L_0x0025:
            monitor-exit(r4)
            if (r2 != 0) goto L_0x004a
            X.0rt r1 = r5.A06
            X.0rv r0 = r6.A00
            X.0rx r1 = r1.A06(r0)
            if (r1 == 0) goto L_0x0042
            X.0tZ r0 = r1.A0Z
            if (r0 == 0) goto L_0x0042
            X.1Vw r0 = r0.A11
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0042
            X.0tZ r2 = r1.A0Z
            if (r2 != 0) goto L_0x004a
        L_0x0042:
            java.util.Map r0 = r5.A0b
            java.lang.Object r2 = r0.get(r6)
            X.0tZ r2 = (X.C16740tZ) r2
        L_0x004a:
            return r2
        L_0x004b:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16820th.A04(X.1Vw):X.0tZ");
    }

    public void A05(C28381Vw r3) {
        if (r3 != null) {
            C39521sc r1 = this.A0J;
            synchronized (r1) {
                r1.A02.remove(r3);
                r1.A01.A03(r3);
            }
            this.A0b.remove(r3);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0047, code lost:
        if (r3 > (r0 == null ? Long.MIN_VALUE : r0.A0B)) goto L_0x0049;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A06(X.C16740tZ r9) {
        /*
            r8 = this;
            X.1Vw r0 = r9.A11
            X.0rv r6 = r0.A00
            X.AnonymousClass00B.A06(r6)
            byte r5 = r9.A10
            r0 = 8
            if (r5 == r0) goto L_0x0035
            boolean r0 = r9.A0x
            if (r0 != 0) goto L_0x0021
            long r2 = r9.A14
            X.0rt r0 = r8.A06
            X.0rx r0 = r0.A06(r6)
            if (r0 != 0) goto L_0x0089
            r0 = -9223372036854775808
        L_0x001d:
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 <= 0) goto L_0x007e
        L_0x0021:
            boolean r0 = r9.A0x
            if (r0 == 0) goto L_0x0035
            long r2 = r9.A14
            X.0rt r0 = r8.A06
            X.0rx r0 = r0.A06(r6)
            if (r0 != 0) goto L_0x0086
            r0 = -9223372036854775808
        L_0x0031:
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 <= 0) goto L_0x007e
        L_0x0035:
            boolean r0 = r9.A0x
            if (r0 != 0) goto L_0x0049
            long r3 = r9.A14
            X.0rt r7 = r8.A06
            X.0rx r0 = r7.A06(r6)
            if (r0 != 0) goto L_0x0083
            r1 = -9223372036854775808
        L_0x0045:
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x005d
        L_0x0049:
            boolean r0 = r9.A0x
            if (r0 == 0) goto L_0x008c
            long r3 = r9.A14
            X.0rt r7 = r8.A06
            X.0rx r0 = r7.A06(r6)
            if (r0 != 0) goto L_0x0080
            r1 = -9223372036854775808
        L_0x0059:
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x008c
        L_0x005d:
            X.0rx r0 = r7.A06(r6)
            if (r0 == 0) goto L_0x007e
            java.lang.String r2 = r0.A0c
            if (r2 == 0) goto L_0x007e
            java.lang.String r1 = "\""
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r5)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L_0x008c
        L_0x007e:
            r0 = 1
            return r0
        L_0x0080:
            long r1 = r0.A0C
            goto L_0x0059
        L_0x0083:
            long r1 = r0.A0B
            goto L_0x0045
        L_0x0086:
            long r0 = r0.A0E
            goto L_0x0031
        L_0x0089:
            long r0 = r0.A0D
            goto L_0x001d
        L_0x008c:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16820th.A06(X.0tZ):boolean");
    }
}
