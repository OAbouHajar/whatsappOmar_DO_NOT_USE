package X;

import android.database.Cursor;
import android.text.TextUtils;
import android.util.Pair;
import com.obwhatsapp.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.math.BigDecimal;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

/* renamed from: X.17F  reason: invalid class name */
public class AnonymousClass17F {
    public static final Pattern A0I = Pattern.compile("((?<= )|(?= ))");
    public static final int[] A0J = {105, 118, 103, 97, 100, AnonymousClass2EA.A03, 111};
    public final C16300so A00;
    public final C16040sK A01;
    public final C19000xb A02;
    public final C16000sG A03;
    public final C16080sP A04;
    public final AnonymousClass013 A05;
    public final C16820th A06;
    public final C16920ts A07;
    public final C216114t A08;
    public final AnonymousClass17R A09;
    public final C216314v A0A;
    public final C18550ws A0B;
    public final C19650ym A0C;
    public final C16900tq A0D;
    public final AnonymousClass11I A0E;
    public final AnonymousClass17S A0F;
    public final Map A0G = new HashMap();
    public final boolean A0H;

    public AnonymousClass17F(C16300so r4, C16040sK r5, C19000xb r6, C16000sG r7, C16080sP r8, AnonymousClass013 r9, C16820th r10, C16920ts r11, C216114t r12, AnonymousClass17R r13, C216314v r14, C18550ws r15, C19650ym r16, C16900tq r17, AnonymousClass11I r18, C14710pd r19, AnonymousClass17S r20) {
        this.A0A = r14;
        this.A07 = r11;
        this.A00 = r4;
        this.A01 = r5;
        this.A02 = r6;
        this.A0B = r15;
        this.A03 = r7;
        this.A04 = r8;
        this.A05 = r9;
        this.A0E = r18;
        this.A06 = r10;
        this.A0D = r17;
        this.A09 = r13;
        this.A0F = r20;
        this.A08 = r12;
        this.A0C = r16;
        A0L(new C42361xf());
        A0L(new C42381xh());
        this.A0H = r19.A0E(C16620tM.A02, 2822);
    }

    public static final String A00(C39261sB r4, String str) {
        String str2;
        String str3 = "";
        if (r4 == null) {
            str2 = str3;
        } else {
            str2 = r4.A00;
            str3 = r4.A01;
        }
        if (!TextUtils.isEmpty(str)) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" ");
            sb.append(str2);
            str2 = sb.toString();
        }
        if (TextUtils.isEmpty(str3)) {
            return str2;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str2);
        sb2.append(" ");
        sb2.append(str3);
        return sb2.toString();
    }

    public static String A01(List list, List list2) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("SELECT ");
        sb2.append(C16910tr.A00);
        sb2.append(" FROM ");
        sb2.append("message_view AS message JOIN ( ");
        sb.append(sb2.toString());
        sb.append("SELECT message_row_id FROM labeled_messages JOIN labels ON labeled_messages.label_id = labels._id WHERE label_name = ?");
        list2.add(list.get(0));
        for (int i2 = 1; i2 < list.size(); i2++) {
            sb.append(" INTERSECT ");
            sb.append("SELECT message_row_id FROM labeled_messages JOIN labels ON labeled_messages.label_id = labels._id WHERE label_name = ?");
            list2.add(list.get(i2));
        }
        sb.append(") ON message._id = message_row_id");
        return sb.toString();
    }

    public static boolean A02(AnonymousClass024 r1) {
        return r1 != null && r1.A04();
    }

    public static final boolean A03(C16740tZ r1, boolean z2) {
        C15830rv r0 = r1.A11.A00;
        return r0 == null || C16030sJ.A0Q(r0) || (r1 instanceof C29871bM) || (r1 instanceof C38601r3) || (r1 instanceof C38971ri) || (r1 instanceof C39231s8) || (!z2 && (r1 instanceof C38641rB)) || (r1 instanceof AnonymousClass1WU) || (r1 instanceof C38991rk) || (r1 instanceof C39011rm) || (r1 instanceof C39241s9);
    }

    public long A04() {
        long A012 = this.A0E.A01("fts_ready", 0);
        long j2 = 1;
        if (!(A012 == 1 || A012 == 3)) {
            j2 = 5;
            if (!(A012 == 0 || A012 == 2 || A012 == 5)) {
                AnonymousClass00B.A08("Unknown Fts version, using V2");
            }
        }
        return j2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x006c, code lost:
        if (r0.isEmpty() != false) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01d5, code lost:
        if (r11.A04.A01("labeled_jids_ready", 0) != 1) goto L_0x01d7;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:168:0x0435 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:173:0x043a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:202:0x04e2 */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x038d  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x03a0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.util.Pair A05(X.AnonymousClass024 r22, X.C42391xi r23, java.lang.Integer r24) {
        /*
            r21 = this;
            java.lang.String r18 = "fts_done"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r10 = r23
            X.0rv r1 = r10.A04
            r0 = 0
            if (r1 == 0) goto L_0x000f
            r0 = 1
        L_0x000f:
            if (r0 == 0) goto L_0x048b
            java.lang.String r0 = "FtsMessageStore/search-with-jid/"
        L_0x0013:
            r2.append(r0)
            java.lang.String r0 = r10.A02()
            int r0 = r0.length()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            X.1Zf r8 = new X.1Zf
            r8.<init>((java.lang.String) r0)
            r7 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.util.Pair r6 = new android.util.Pair
            r6.<init>(r1, r0)
            r5 = r21
            boolean r0 = r5.A0P()
            r9 = r24
            if (r0 != 0) goto L_0x0053
            X.17S r1 = r5.A0F
            java.lang.String r0 = "fts_not_ready"
            X.C42421xl.A02(r1, r9, r0)
            java.lang.String r4 = "FtsMessageStore not ready"
        L_0x004c:
            r8.A02(r4)
            r8.A01()
            return r6
        L_0x0053:
            r20 = r22
            boolean r0 = A02(r20)
            java.lang.String r4 = "cancelled"
            java.lang.String r17 = "fts_cancelled"
            if (r0 != 0) goto L_0x0482
            long r11 = r5.A04()
            java.util.List r0 = r10.A0D
            if (r0 == 0) goto L_0x006e
            boolean r0 = r0.isEmpty()
            r3 = 1
            if (r0 == 0) goto L_0x006f
        L_0x006e:
            r3 = 0
        L_0x006f:
            r15 = 1
            java.util.List r0 = r10.A03()
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r3 != 0) goto L_0x0142
            if (r0 != 0) goto L_0x0099
            int r1 = r10.A02
            r0 = 0
            if (r1 == 0) goto L_0x0085
            r0 = 1
        L_0x0085:
            if (r0 != 0) goto L_0x0099
            X.0rv r1 = r10.A04
            r0 = 0
            if (r1 == 0) goto L_0x008d
            r0 = 1
        L_0x008d:
            if (r0 != 0) goto L_0x0099
            X.17S r1 = r5.A0F
            java.lang.String r0 = "fts_empty"
            X.C42421xl.A02(r1, r9, r0)
            java.lang.String r4 = "empty"
            goto L_0x004c
        L_0x0099:
            X.0rv r0 = r10.A04
            r1 = 0
            if (r0 == 0) goto L_0x009f
            r1 = 1
        L_0x009f:
            int r0 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r1 != 0) goto L_0x00da
            if (r0 != 0) goto L_0x0373
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = X.C42431xm.A07
            r1.append(r0)
            java.lang.String r0 = " ORDER BY docid DESC"
            r1.append(r0)
            java.lang.String r2 = r1.toString()
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]
            java.util.List r0 = r10.A03()
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00d8
            java.lang.String r0 = r10.A02()
            java.lang.String r0 = r5.A0G(r0)
        L_0x00cf:
            r1[r7] = r0
            android.util.Pair r12 = new android.util.Pair
            r12.<init>(r2, r1)
            goto L_0x0172
        L_0x00d8:
            r0 = 0
            goto L_0x00cf
        L_0x00da:
            if (r0 != 0) goto L_0x0373
            java.util.List r0 = r10.A03()
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x00ec
            java.lang.String r4 = "no jid v1"
            goto L_0x004c
        L_0x00ec:
            X.0rv r1 = r10.A04
            r12 = 1
            r0 = 0
            if (r1 == 0) goto L_0x00f3
            r0 = 1
        L_0x00f3:
            X.AnonymousClass00B.A0G(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = X.C42431xm.A06
            r1.append(r0)
            java.lang.String r0 = " ORDER BY "
            r1.append(r0)
            java.lang.String r0 = "_id"
            r1.append(r0)
            java.lang.String r0 = " DESC"
            r1.append(r0)
            java.lang.String r11 = r1.toString()
            r0 = 2
            java.lang.String[] r2 = new java.lang.String[r0]
            java.util.List r0 = r10.A03()
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0140
            java.lang.String r0 = r10.A02()
            java.lang.String r0 = r5.A0G(r0)
        L_0x012a:
            r2[r7] = r0
            X.0ts r1 = r5.A07
            X.0rv r0 = r10.A04
            long r0 = r1.A02(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r2[r12] = r0
            android.util.Pair r12 = new android.util.Pair
            r12.<init>(r11, r2)
            goto L_0x0172
        L_0x0140:
            r0 = 0
            goto L_0x012a
        L_0x0142:
            if (r0 != 0) goto L_0x01a7
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.util.List r0 = r10.A0D
            if (r0 != 0) goto L_0x0157
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L_0x0157:
            java.lang.String r0 = A01(r0, r2)
            r1.append(r0)
        L_0x015e:
            java.lang.String r0 = " ORDER BY message._id DESC"
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String[] r0 = new java.lang.String[r7]
            java.lang.Object[] r0 = r2.toArray(r0)
            android.util.Pair r12 = new android.util.Pair
            r12.<init>(r1, r0)
        L_0x0172:
            boolean r0 = A02(r20)
            if (r0 != 0) goto L_0x0482
            java.lang.Object r15 = r12.first
            java.lang.String r15 = (java.lang.String) r15
            java.lang.Object r13 = r12.second
            java.lang.String[] r13 = (java.lang.String[]) r13
            java.lang.String r0 = "compiled"
            r8.A02(r0)
            X.17S r2 = r5.A0F
            X.C42421xl.A02(r2, r9, r0)
            boolean r0 = r15.isEmpty()
            r11 = 1
            r1 = r0 ^ 1
            java.lang.String r0 = "FtsMessageStore/search/sql empty"
            X.AnonymousClass00B.A0B(r0, r1)
            int r0 = r10.A01
            if (r0 != 0) goto L_0x019b
            r11 = 0
        L_0x019b:
            java.lang.String r0 = "FtsMessageStore/refusing to query unbounded search"
            X.AnonymousClass00B.A0B(r0, r11)
            int r14 = r10.A01
            int r0 = r10.A00
            int r14 = r14 * r0
            goto L_0x03a6
        L_0x01a7:
            int r0 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r0 != 0) goto L_0x0373
            X.0ws r11 = r5.A0B
            java.util.List r12 = r10.A0D
            if (r12 != 0) goto L_0x01b6
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
        L_0x01b6:
            java.lang.String[] r0 = new java.lang.String[r7]
            java.lang.Object[] r2 = r12.toArray(r0)
            java.lang.String[] r2 = (java.lang.String[]) r2
            X.14v r0 = r11.A01
            r19 = r0
            boolean r0 = r19.A0C()
            if (r0 == 0) goto L_0x01d7
            X.11I r14 = r11.A04
            r0 = 0
            java.lang.String r13 = "labeled_jids_ready"
            long r13 = r14.A01(r13, r0)
            int r0 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            r1 = 1
            if (r0 == 0) goto L_0x01d8
        L_0x01d7:
            r1 = 0
        L_0x01d8:
            int r13 = r12.size()
            java.util.HashSet r12 = new java.util.HashSet
            r12.<init>()
            X.0tq r0 = r11.A03
            X.0tf r11 = r0.get()
            if (r1 == 0) goto L_0x0230
            X.0tg r0 = r11.A02     // Catch:{ all -> 0x04e3 }
            r16 = r0
            java.lang.String r15 = "SELECT jid_row_id FROM labeled_jid JOIN labels ON labeled_jid.label_id = labels._id WHERE label_name = ?"
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ all -> 0x04e3 }
            r14.<init>(r15)     // Catch:{ all -> 0x04e3 }
            r1 = 1
        L_0x01f5:
            if (r1 >= r13) goto L_0x0202
            java.lang.String r0 = " INTERSECT "
            r14.append(r0)     // Catch:{ all -> 0x04e3 }
            r14.append(r15)     // Catch:{ all -> 0x04e3 }
            int r1 = r1 + 1
            goto L_0x01f5
        L_0x0202:
            java.lang.String r1 = r14.toString()     // Catch:{ all -> 0x04e3 }
            r0 = r16
            android.database.Cursor r13 = r0.A08(r1, r2)     // Catch:{ all -> 0x04e3 }
            java.lang.String r0 = "jid_row_id"
            int r14 = r13.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x04d5 }
        L_0x0212:
            boolean r0 = r13.moveToNext()     // Catch:{ all -> 0x04d5 }
            if (r0 == 0) goto L_0x022c
            long r1 = r13.getLong(r14)     // Catch:{ all -> 0x04d5 }
            java.lang.Class<X.0rv> r15 = X.C15830rv.class
            r0 = r19
            com.whatsapp.jid.Jid r0 = r0.A07(r15, r1)     // Catch:{ all -> 0x04d5 }
            X.0rv r0 = (X.C15830rv) r0     // Catch:{ all -> 0x04d5 }
            if (r0 == 0) goto L_0x0212
            r12.add(r0)     // Catch:{ all -> 0x04d5 }
            goto L_0x0212
        L_0x022c:
            r13.close()     // Catch:{ all -> 0x04e3 }
            goto L_0x0270
        L_0x0230:
            X.0tg r0 = r11.A02     // Catch:{ all -> 0x04e3 }
            r16 = r0
            java.lang.String r15 = "SELECT jid FROM labeled_jids JOIN labels ON labeled_jids.label_id = labels._id WHERE label_name = ?"
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ all -> 0x04e3 }
            r14.<init>(r15)     // Catch:{ all -> 0x04e3 }
            r1 = 1
        L_0x023c:
            if (r1 >= r13) goto L_0x0249
            java.lang.String r0 = " INTERSECT "
            r14.append(r0)     // Catch:{ all -> 0x04e3 }
            r14.append(r15)     // Catch:{ all -> 0x04e3 }
            int r1 = r1 + 1
            goto L_0x023c
        L_0x0249:
            java.lang.String r1 = r14.toString()     // Catch:{ all -> 0x04e3 }
            r0 = r16
            android.database.Cursor r2 = r0.A08(r1, r2)     // Catch:{ all -> 0x04e3 }
            java.lang.String r0 = "jid"
            int r1 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x04dc }
        L_0x0259:
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x04dc }
            if (r0 == 0) goto L_0x026d
            java.lang.String r0 = r2.getString(r1)     // Catch:{ all -> 0x04dc }
            X.0rv r0 = X.C15830rv.A02(r0)     // Catch:{ all -> 0x04dc }
            if (r0 == 0) goto L_0x0259
            r12.add(r0)     // Catch:{ all -> 0x04dc }
            goto L_0x0259
        L_0x026d:
            r2.close()     // Catch:{ all -> 0x04e3 }
        L_0x0270:
            r11.close()
            int r0 = r12.size()
            java.util.HashSet r14 = new java.util.HashSet
            r14.<init>(r0)
            java.util.Iterator r2 = r12.iterator()
        L_0x0280:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x029a
            java.lang.Object r1 = r2.next()
            X.0rv r1 = (X.C15830rv) r1
            X.0ts r0 = r5.A07
            long r0 = r0.A02(r1)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r14.add(r0)
            goto L_0x0280
        L_0x029a:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.List r0 = r10.A0D
            if (r0 != 0) goto L_0x02a8
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L_0x02a8:
            java.lang.String r12 = A01(r0, r2)
            java.util.List r0 = r10.A03()
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x034f
            java.lang.String r0 = r10.A02()
            java.lang.String r11 = r5.A0G(r0)
        L_0x02c0:
            X.AnonymousClass00B.A06(r11)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r12)
            java.lang.String r0 = " JOIN messages_fts ON docid = message._id WHERE messages_fts.content MATCH ?"
            r1.append(r0)
            java.lang.String r12 = r1.toString()
            r2.add(r11)
            boolean r0 = r14.isEmpty()
            if (r0 != 0) goto L_0x0369
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r12)
            java.lang.String r0 = " UNION "
            r1.append(r0)
            java.lang.String r0 = "SELECT "
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>(r0)
            java.lang.String r0 = X.C16910tr.A00
            r12.append(r0)
            java.lang.String r0 = " FROM "
            r12.append(r0)
            java.lang.String r0 = "available_message_view AS message JOIN messages_fts AS messages_fts ON messages_fts.docid = message.sort_id"
            r12.append(r0)
            java.lang.String r0 = " WHERE content MATCH ?"
            r12.append(r0)
            java.lang.String r0 = r12.toString()
            r2.add(r11)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r0)
            java.lang.String r0 = " AND chat_row_id in ("
            r11.append(r0)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.util.Iterator r0 = r14.iterator()
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L_0x0352
            r15 = 1
            java.util.Iterator r14 = r14.iterator()
        L_0x032d:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x0352
            java.lang.Object r12 = r14.next()
            if (r12 == 0) goto L_0x032d
            if (r15 == 0) goto L_0x0349
            r15 = 0
        L_0x033c:
            java.lang.String r0 = "?"
            r13.append(r0)
            java.lang.String r0 = java.lang.String.valueOf(r12)
            r2.add(r0)
            goto L_0x032d
        L_0x0349:
            java.lang.String r0 = ", "
            r13.append(r0)
            goto L_0x033c
        L_0x034f:
            r11 = 0
            goto L_0x02c0
        L_0x0352:
            java.lang.String r0 = r13.toString()
            r11.append(r0)
            java.lang.String r0 = ")"
            r11.append(r0)
            java.lang.String r0 = r11.toString()
            r1.append(r0)
            java.lang.String r12 = r1.toString()
        L_0x0369:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r12)
            goto L_0x015e
        L_0x0373:
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]
            r0 = r20
            java.lang.String r0 = r5.A0B(r0, r10, r9)
            r2[r7] = r0
            java.lang.String r11 = X.C42431xm.A08
            X.0sK r0 = r5.A01
            boolean r0 = r0.A0G()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            if (r0 == 0) goto L_0x03a0
            r1.append(r11)
            java.lang.String r0 = " ORDER BY timestamp DESC"
        L_0x0392:
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.util.Pair r12 = new android.util.Pair
            r12.<init>(r0, r2)
            goto L_0x0172
        L_0x03a0:
            r1.append(r11)
            java.lang.String r0 = " ORDER BY docid DESC"
            goto L_0x0392
        L_0x03a6:
            X.0tq r0 = r5.A0D     // Catch:{ SQLiteDatabaseCorruptException -> 0x0496, 057 -> 0x049f, SQLiteException -> 0x043b, Exception -> 0x0490 }
            X.0tf r11 = r0.get()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0496, 057 -> 0x049f, SQLiteException -> 0x043b, Exception -> 0x0490 }
            X.0tg r12 = r11.A02     // Catch:{ all -> 0x0436 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0436 }
            r1.<init>()     // Catch:{ all -> 0x0436 }
            r1.append(r15)     // Catch:{ all -> 0x0436 }
            java.lang.String r0 = "  LIMIT "
            r1.append(r0)     // Catch:{ all -> 0x0436 }
            int r0 = r10.A01     // Catch:{ all -> 0x0436 }
            r1.append(r0)     // Catch:{ all -> 0x0436 }
            java.lang.String r0 = " OFFSET "
            r1.append(r0)     // Catch:{ all -> 0x0436 }
            r1.append(r14)     // Catch:{ all -> 0x0436 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0436 }
            r0 = r20
            android.database.Cursor r10 = r12.A07(r0, r1, r13)     // Catch:{ all -> 0x0436 }
        L_0x03d2:
            boolean r0 = r10.moveToNext()     // Catch:{ all -> 0x0431 }
            if (r0 == 0) goto L_0x042a
            boolean r0 = A02(r20)     // Catch:{ all -> 0x0431 }
            if (r0 == 0) goto L_0x03f7
            r0 = r17
            X.C42421xl.A02(r2, r9, r0)     // Catch:{ all -> 0x0431 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x0431 }
            java.lang.Object r0 = r6.second     // Catch:{ all -> 0x0431 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x0431 }
            android.util.Pair r3 = new android.util.Pair     // Catch:{ all -> 0x0431 }
            r3.<init>(r1, r0)     // Catch:{ all -> 0x0431 }
            r8.A02(r4)     // Catch:{ all -> 0x0431 }
            r8.A01()     // Catch:{ all -> 0x0431 }
            goto L_0x0423
        L_0x03f7:
            X.0th r0 = r5.A06     // Catch:{ all -> 0x0431 }
            X.0tZ r12 = r0.A01(r10)     // Catch:{ all -> 0x0431 }
            int r7 = r7 + 1
            if (r12 == 0) goto L_0x03d2
            int r0 = r12.A06()     // Catch:{ all -> 0x0431 }
            r13 = 1
            if (r0 == r13) goto L_0x0413
            X.17R r0 = r5.A09     // Catch:{ all -> 0x0431 }
            long r0 = r0.A00     // Catch:{ all -> 0x0431 }
            boolean r0 = X.C38621r6.A0v(r12, r0)     // Catch:{ all -> 0x0431 }
            if (r0 == 0) goto L_0x0413
            r13 = 0
        L_0x0413:
            if (r13 == 0) goto L_0x03d2
            boolean r0 = A03(r12, r3)     // Catch:{ all -> 0x0431 }
            if (r0 != 0) goto L_0x03d2
            java.lang.Object r0 = r6.second     // Catch:{ all -> 0x0431 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x0431 }
            r0.add(r12)     // Catch:{ all -> 0x0431 }
            goto L_0x03d2
        L_0x0423:
            r10.close()     // Catch:{ all -> 0x0436 }
            r11.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0496, 057 -> 0x049f, SQLiteException -> 0x043b, Exception -> 0x0490 }
            goto L_0x048f
        L_0x042a:
            r10.close()     // Catch:{ all -> 0x0436 }
            r11.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0496, 057 -> 0x049f, SQLiteException -> 0x043b, Exception -> 0x0490 }
            goto L_0x049f
        L_0x0431:
            r0 = move-exception
            r10.close()     // Catch:{ all -> 0x0435 }
        L_0x0435:
            throw r0     // Catch:{ all -> 0x0436 }
        L_0x0436:
            r0 = move-exception
            r11.close()     // Catch:{ all -> 0x043a }
        L_0x043a:
            throw r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x0496, 057 -> 0x049f, SQLiteException -> 0x043b, Exception -> 0x0490 }
        L_0x043b:
            r3 = move-exception
            java.lang.String r0 = r3.getMessage()
            if (r0 == 0) goto L_0x0468
            java.lang.String r1 = r3.getMessage()
            java.lang.String r0 = "FTS expression tree is too large"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x0468
            java.lang.String r0 = "FtsMessageStore/search/error/query-too-large"
            com.whatsapp.util.Log.e(r0, r3)
            java.lang.String r0 = "fts_query_too_large"
            X.C42421xl.A02(r2, r9, r0)
            r0 = -2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r6.second
            android.util.Pair r6 = new android.util.Pair
            r6.<init>(r1, r0)
            java.lang.String r4 = "query-too-large"
            goto L_0x004c
        L_0x0468:
            java.lang.String r0 = "FtsMessageStore/search/error"
            com.whatsapp.util.Log.e(r0, r3)
            r0 = r18
            X.C42421xl.A02(r2, r9, r0)
            r0 = -3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r6.second
            android.util.Pair r6 = new android.util.Pair
            r6.<init>(r1, r0)
            java.lang.String r4 = "error"
            goto L_0x004c
        L_0x0482:
            X.17S r1 = r5.A0F
            r0 = r17
            X.C42421xl.A02(r1, r9, r0)
            goto L_0x004c
        L_0x048b:
            java.lang.String r0 = "FtsMessageStore/search/"
            goto L_0x0013
        L_0x048f:
            return r3
        L_0x0490:
            r1 = move-exception
            boolean r0 = r1 instanceof android.os.OperationCanceledException
            if (r0 != 0) goto L_0x049f
            throw r1
        L_0x0496:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            X.0ym r0 = r5.A0C
            r0.A02()
        L_0x049f:
            r0 = r18
            X.C42421xl.A02(r2, r9, r0)
            java.lang.String r0 = "found: "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r7)
            java.lang.String r0 = "|:"
            r1.append(r0)
            java.lang.Object r0 = r6.second
            java.util.List r0 = (java.util.List) r0
            int r0 = r0.size()
            r1.append(r0)
            java.lang.String r3 = r1.toString()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)
            java.lang.Object r1 = r6.second
            android.util.Pair r0 = new android.util.Pair
            r0.<init>(r2, r1)
            r8.A02(r3)
            r8.A01()
            return r0
        L_0x04d5:
            r0 = move-exception
            if (r13 == 0) goto L_0x04e2
            r13.close()     // Catch:{ all -> 0x04e2 }
            goto L_0x04e2
        L_0x04dc:
            r0 = move-exception
            if (r2 == 0) goto L_0x04e2
            r2.close()     // Catch:{ all -> 0x04e2 }
        L_0x04e2:
            throw r0     // Catch:{ all -> 0x04e3 }
        L_0x04e3:
            r0 = move-exception
            r11.close()     // Catch:{ all -> 0x04e7 }
        L_0x04e7:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass17F.A05(X.024, X.1xi, java.lang.Integer):android.util.Pair");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:1|2|3|4|5|6|8|9) */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0044, code lost:
        r14 = new X.C42441xn(1, r4.A02.A03(r5, "messages_fts"), r14.A01);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x002d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C42441xn A06(X.C42441xn r14, java.lang.String r15) {
        /*
            r13 = this;
            java.lang.String r6 = "docid"
            X.0tq r0 = r13.A0D
            X.0tf r4 = r0.A02()
            r0 = 2
            android.content.ContentValues r5 = new android.content.ContentValues     // Catch:{ all -> 0x0049 }
            r5.<init>(r0)     // Catch:{ all -> 0x0049 }
            long r0 = r14.A02     // Catch:{ all -> 0x0049 }
            java.lang.Long r2 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0049 }
            r5.put(r6, r2)     // Catch:{ all -> 0x0049 }
            java.lang.String r2 = "content"
            r5.put(r2, r15)     // Catch:{ all -> 0x0049 }
            X.0tg r3 = r4.A02     // Catch:{ SQLiteConstraintException -> 0x002d }
            java.lang.String r2 = "messages_fts"
            long r9 = r3.A03(r5, r2)     // Catch:{ SQLiteConstraintException -> 0x002d }
            long r11 = r14.A01     // Catch:{ SQLiteConstraintException -> 0x002d }
            r8 = 1
            X.1xn r7 = new X.1xn     // Catch:{ SQLiteConstraintException -> 0x002d }
            r7.<init>(r8, r9, r11)     // Catch:{ SQLiteConstraintException -> 0x002d }
            goto L_0x0044
        L_0x002d:
            r5.remove(r6)     // Catch:{ all -> 0x0049 }
            X.0tg r8 = r4.A02     // Catch:{ all -> 0x0049 }
            java.lang.String r7 = "messages_fts"
            java.lang.String r6 = "docid = ?"
            r2 = 1
            java.lang.String[] r3 = new java.lang.String[r2]     // Catch:{ all -> 0x0049 }
            r2 = 0
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0049 }
            r3[r2] = r0     // Catch:{ all -> 0x0049 }
            r8.A00(r7, r5, r6, r3)     // Catch:{ all -> 0x0049 }
            goto L_0x0045
        L_0x0044:
            r14 = r7
        L_0x0045:
            r4.close()
            return r14
        L_0x0049:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x004d }
        L_0x004d:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass17F.A06(X.1xn, java.lang.String):X.1xn");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:25|26|27|28|29|30|32|(1:45)(2:36|37)) */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00eb, code lost:
        r12 = new X.C42441xn(1, r6.A02.A03(r7, "message_ftsv2"), r13.A01);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00d4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C42441xn A07(X.C16740tZ r21, java.util.Map r22, long r23, boolean r25) {
        /*
            r20 = this;
            r2 = r20
            if (r25 != 0) goto L_0x0010
            boolean r0 = r2.A0P()
            if (r0 != 0) goto L_0x0010
            r0 = -5
        L_0x000b:
            X.1xn r12 = X.C42441xn.A00(r0)
        L_0x000f:
            return r12
        L_0x0010:
            r7 = r21
            X.1Vw r6 = r7.A11
            X.0rv r5 = r6.A00
            r0 = 0
            boolean r0 = A03(r7, r0)
            if (r0 == 0) goto L_0x001f
            r0 = -6
            goto L_0x000b
        L_0x001f:
            java.lang.String r4 = r2.A0E(r7)
            long r0 = r7.A14
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r1 = r22
            java.lang.Object r3 = r1.get(r0)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 != 0) goto L_0x004d
            int r1 = r4.length()
            r0 = 4096(0x1000, float:5.74E-42)
            if (r1 >= r0) goto L_0x0083
            java.util.regex.Pattern r0 = X.C42471xq.A00
            java.util.regex.Matcher r0 = r0.matcher(r4)
            boolean r0 = r0.find()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0083
            java.lang.String r3 = r2.A0H(r4)
        L_0x004d:
            X.0rv r0 = r7.A0B()
            com.whatsapp.jid.UserJid r9 = com.whatsapp.jid.UserJid.of(r0)
            java.lang.String r4 = r2.A0F(r7)
            long r15 = r7.A14
            long r0 = r7.A13
            r14 = 1
            X.1xn r13 = new X.1xn
            r12 = r13
            r17 = r0
            r13.<init>(r14, r15, r17)
            boolean r0 = r6.A02
            java.lang.String r8 = "docid"
            if (r9 != 0) goto L_0x007e
            if (r0 == 0) goto L_0x007b
            java.lang.String r10 = "1"
        L_0x0070:
            java.lang.String r9 = r2.A0D(r5)
            X.0tq r0 = r2.A0D
            X.0tf r6 = r0.A02()
            goto L_0x008f
        L_0x007b:
            java.lang.String r10 = "0"
            goto L_0x0070
        L_0x007e:
            java.lang.String r10 = r2.A0D(r9)
            goto L_0x0070
        L_0x0083:
            X.0xb r1 = r2.A02
            com.obwhatsapp.jobqueue.job.messagejob.AsyncMessageTokenizationJob r0 = new com.obwhatsapp.jobqueue.job.messagejob.AsyncMessageTokenizationJob
            r0.<init>(r7)
            r1.A00(r0)
            r3 = r4
            goto L_0x004d
        L_0x008f:
            r0 = 4
            android.content.ContentValues r7 = new android.content.ContentValues     // Catch:{ all -> 0x0100 }
            r7.<init>(r0)     // Catch:{ all -> 0x0100 }
            java.lang.String r0 = "content"
            r7.put(r0, r3)     // Catch:{ all -> 0x0100 }
            java.lang.String r5 = "fts_jid"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0100 }
            r1.<init>()     // Catch:{ all -> 0x0100 }
            r1.append(r10)     // Catch:{ all -> 0x0100 }
            java.lang.String r0 = " "
            r1.append(r0)     // Catch:{ all -> 0x0100 }
            r1.append(r9)     // Catch:{ all -> 0x0100 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0100 }
            r7.put(r5, r0)     // Catch:{ all -> 0x0100 }
            java.lang.String r0 = "fts_namespace"
            r7.put(r0, r4)     // Catch:{ all -> 0x0100 }
            long r4 = r13.A02     // Catch:{ all -> 0x0100 }
            java.lang.Long r0 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x0100 }
            r7.put(r8, r0)     // Catch:{ all -> 0x0100 }
            X.0tg r1 = r6.A02     // Catch:{ SQLiteConstraintException -> 0x00d4 }
            java.lang.String r0 = "message_ftsv2"
            long r16 = r1.A03(r7, r0)     // Catch:{ SQLiteConstraintException -> 0x00d4 }
            long r0 = r13.A01     // Catch:{ SQLiteConstraintException -> 0x00d4 }
            r15 = 1
            X.1xn r14 = new X.1xn     // Catch:{ SQLiteConstraintException -> 0x00d4 }
            r18 = r0
            r14.<init>(r15, r16, r18)     // Catch:{ SQLiteConstraintException -> 0x00d4 }
            goto L_0x00eb
        L_0x00d4:
            r7.remove(r8)     // Catch:{ all -> 0x0100 }
            X.0tg r11 = r6.A02     // Catch:{ all -> 0x0100 }
            java.lang.String r10 = "message_ftsv2"
            java.lang.String r9 = "docid = ?"
            r0 = 1
            java.lang.String[] r8 = new java.lang.String[r0]     // Catch:{ all -> 0x0100 }
            r1 = 0
            java.lang.String r0 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x0100 }
            r8[r1] = r0     // Catch:{ all -> 0x0100 }
            r11.A00(r10, r7, r9, r8)     // Catch:{ all -> 0x0100 }
            goto L_0x00ec
        L_0x00eb:
            r12 = r14
        L_0x00ec:
            r6.close()
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x000f
            r4 = 1
            int r0 = (r23 > r4 ? 1 : (r23 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x000f
            X.1xn r12 = r2.A06(r13, r3)
            return r12
        L_0x0100:
            r0 = move-exception
            r6.close()     // Catch:{ all -> 0x0104 }
        L_0x0104:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass17F.A07(X.0tZ, java.util.Map, long, boolean):X.1xn");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0040 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x0045 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C42441xn A08(java.lang.String r10, java.lang.String r11, java.lang.String[] r12) {
        /*
            r9 = this;
            X.0tq r0 = r9.A0D     // Catch:{ SQLiteException -> 0x0046 }
            X.0tf r1 = r0.get()     // Catch:{ SQLiteException -> 0x0046 }
            X.0tg r0 = r1.A02     // Catch:{ all -> 0x0041 }
            android.database.Cursor r2 = r0.A08(r10, r12)     // Catch:{ all -> 0x0041 }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x003a }
            if (r0 == 0) goto L_0x0033
            java.lang.String r0 = "docid"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x003a }
            long r5 = r2.getLong(r0)     // Catch:{ all -> 0x003a }
            java.lang.String r0 = "_id"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x003a }
            long r7 = r2.getLong(r0)     // Catch:{ all -> 0x003a }
            r4 = 1
            X.1xn r3 = new X.1xn     // Catch:{ all -> 0x003a }
            r3.<init>(r4, r5, r7)     // Catch:{ all -> 0x003a }
            r2.close()     // Catch:{ all -> 0x0041 }
            r1.close()     // Catch:{ SQLiteException -> 0x0046 }
            return r3
        L_0x0033:
            r2.close()     // Catch:{ all -> 0x0041 }
            r1.close()     // Catch:{ SQLiteException -> 0x0046 }
            goto L_0x007f
        L_0x003a:
            r0 = move-exception
            if (r2 == 0) goto L_0x0040
            r2.close()     // Catch:{ all -> 0x0040 }
        L_0x0040:
            throw r0     // Catch:{ all -> 0x0041 }
        L_0x0041:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0045 }
        L_0x0045:
            throw r0     // Catch:{ SQLiteException -> 0x0046 }
        L_0x0046:
            r2 = move-exception
            java.lang.String r0 = r2.getMessage()
            if (r0 == 0) goto L_0x006c
            java.lang.String r1 = r2.getMessage()
            java.lang.String r0 = "FTS expression tree is too large"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x006c
            java.lang.String r1 = "FtsMessageStore/getRowIdForJidSearch/too-large/"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r11)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.e(r0, r2)
            r0 = -2
            goto L_0x0080
        L_0x006c:
            java.lang.String r1 = "FtsMessageStore/getRowIdForJidSearch/error/"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r11)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.e(r0, r2)
            r0 = -3
            goto L_0x0080
        L_0x007f:
            r0 = -4
        L_0x0080:
            X.1xn r0 = X.C42441xn.A00(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass17F.A08(java.lang.String, java.lang.String, java.lang.String[]):X.1xn");
    }

    public C42391xi A09(C15830rv r4) {
        C42391xi r2 = new C42391xi(this.A05);
        r2.A04 = r4;
        if (C16030sJ.A0L(r4)) {
            List singletonList = Collections.singletonList(new C42411xk());
            if (r2.A0B != null) {
                Log.e("FtsQuery/cannot re-set contactPreFilter");
                return r2;
            }
            r2.A0B = singletonList;
            return r2;
        }
        r2.A0C = Collections.emptyList();
        return r2;
    }

    public C16740tZ A0A(Cursor cursor, int i2, int i3) {
        try {
            long j2 = cursor.getLong(i3);
            C15830rv A052 = this.A07.A05(cursor.getLong(i2));
            if (C16030sJ.A0Q(A052) || A052 == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("FtsMessageStore/FtsMessageStoreMigration/getMessageForFtsFromCursor/missing cursor chatjid; rowId=");
                sb.append(j2);
                Log.e(sb.toString());
                return null;
            }
            try {
                C16740tZ A022 = this.A06.A02(cursor, A052, false);
                if (A022 != null) {
                    return A022;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("FtsMessageStore/FtsMessageStoreMigration/getMessageForFtsFromCursor/null message; rowId=");
                sb2.append(j2);
                Log.e(sb2.toString());
                return null;
            } catch (AssertionError | ClassCastException e2) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("FtsMessageStore/FtsMessageStoreMigration/getMessageForFtsFromCursor/bad message; rowId=");
                sb3.append(j2);
                Log.e(sb3.toString(), e2);
                return null;
            }
        } catch (Exception e3) {
            Log.e("FtsMessageStore/FtsMessageStoreMigration/getMessageForFtsFromCursor/failed on cursor", e3);
            return null;
        }
    }

    public String A0B(AnonymousClass024 r13, C42391xi r14, Integer num) {
        String str = "";
        if (!r14.A03().isEmpty()) {
            String A022 = r14.A02();
            if (A022.startsWith("\"") && A022.endsWith("\"") && A022.length() > 2) {
                str = A022;
            } else if (!r14.A0F || !C42451xo.A00(this)) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                List<String> A032 = r14.A03();
                ArrayList arrayList = new ArrayList(A032.size());
                for (String append : A032) {
                    StringBuilder sb2 = new StringBuilder("content:");
                    sb2.append(append);
                    arrayList.add(sb2.toString());
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append(TextUtils.join(" ", arrayList));
                sb3.append("*");
                sb.append(sb3.toString());
                str = sb.toString();
            } else {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                if (!r14.A03().isEmpty()) {
                    List A0J2 = A0J(r13, r14, num);
                    StringBuilder sb5 = new StringBuilder();
                    int size = A0J2.size();
                    for (int i2 = 0; i2 < size && !A02(r13); i2++) {
                        boolean z2 = false;
                        if (i2 == size - 1) {
                            z2 = true;
                        }
                        sb5.append(" ");
                        Pair pair = (Pair) A0J2.get(i2);
                        StringBuilder sb6 = new StringBuilder("content:");
                        sb6.append((String) pair.first);
                        if (z2) {
                            sb6.append('*');
                        }
                        for (int i3 = 0; i3 < ((List) pair.second).size(); i3++) {
                            C15830rv r11 = (C15830rv) ((List) pair.second).get(i3);
                            if (C16030sJ.A0O(r11) || C16030sJ.A0L(r11)) {
                                sb6.append(" OR ");
                                sb6.append("fts_jid:");
                                sb6.append(A0D(r11));
                            }
                        }
                        sb5.append(sb6.toString());
                    }
                    str = sb5.toString().trim();
                }
                sb4.append(str);
                str = sb4.toString();
            }
        }
        C15830rv r5 = r14.A04;
        if (r5 != null) {
            AnonymousClass00B.A06(r5);
            StringBuilder sb7 = new StringBuilder();
            sb7.append(str);
            sb7.append(" ");
            boolean z3 = r14.A0G;
            StringBuilder sb8 = new StringBuilder("fts_jid:");
            sb8.append(A0D(r5));
            String obj = sb8.toString();
            if (z3 && !C16030sJ.A0L(r5)) {
                StringBuilder sb9 = new StringBuilder();
                sb9.append(obj);
                sb9.append(" fts_jid:0 OR fts_jid:1");
                obj = sb9.toString();
            }
            sb7.append(obj);
            str = sb7.toString();
        }
        return A0C(r13, r14, str);
    }

    public final String A0C(AnonymousClass024 r11, C42391xi r12, String str) {
        ArrayList arrayList = new ArrayList();
        boolean z2 = false;
        boolean z3 = false;
        for (Map.Entry entry : this.A0G.entrySet()) {
            if (A02(r11)) {
                break;
            }
            String str2 = (String) entry.getKey();
            C42401xj ADs = ((C42371xg) entry.getValue()).ADs(r12);
            if (ADs != null) {
                for (String str3 : ADs.A00) {
                    if (A02(r11)) {
                        break;
                    }
                    StringBuilder sb = new StringBuilder("fts_namespace:");
                    sb.append(str2);
                    sb.append(str3);
                    arrayList.add(sb.toString());
                    z3 = true;
                }
                for (String str4 : ADs.A01) {
                    if (A02(r11)) {
                        break;
                    }
                    StringBuilder sb2 = new StringBuilder("fts_namespace:-");
                    sb2.append(str2);
                    sb2.append(str4);
                    arrayList.add(sb2.toString());
                    z2 = true;
                }
            }
        }
        if (A02(r11) || !z2 || z3 || !TextUtils.isEmpty(str)) {
            String join = TextUtils.join(" ", arrayList);
            if (TextUtils.isEmpty(join)) {
                return str;
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str);
            sb3.append(" ");
            sb3.append(join);
            return sb3.toString();
        }
        throw new IllegalStateException("Compiled FTS query comprised entirely of NOTs");
    }

    public String A0D(C15830rv r5) {
        return Long.toString(this.A0A.A01(r5) + 10, 36);
    }

    public String A0E(C16740tZ r10) {
        String A002;
        StringBuilder sb;
        BigDecimal bigDecimal;
        C15830rv r1;
        int i2;
        UserJid userJid;
        C28401Vy r0;
        String str;
        if (r10 instanceof C16840tj) {
            C42101xE A012 = C42091xD.A01((C16840tj) r10);
            if (A012 != null) {
                AnonymousClass013 r7 = this.A05;
                if (A012 instanceof C42461xp) {
                    C16880tn r5 = A012.A00;
                    A002 = null;
                    C35251lc r02 = r5.A01;
                    if (r02 != null) {
                        String A0C2 = r7.A0C(R.string.str0457, Integer.valueOf(r02.A05.A08.size()));
                        StringBuilder sb2 = new StringBuilder();
                        C42101xE.A00(r5.A01.A05.A00(), " ", sb2);
                        C35251lc r12 = r5.A01;
                        if (!(r12.A04 == null || r12.A06 == null)) {
                            C42101xE.A00(r12.A03(r7), " ", sb2);
                        }
                        C42101xE.A00(A0C2, " ", sb2);
                        C42101xE.A00(r5.A07, " ", sb2);
                        C42101xE.A00(r5.A08, " ", sb2);
                        A002 = sb2.toString();
                    }
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    C42101xE.A00(A012.A03(), " ", sb3);
                    C16880tn r13 = A012.A00;
                    C35201lX r03 = r13.A02;
                    C42101xE.A00(r03 != null ? r03.A00 : null, " ", sb3);
                    C42101xE.A00(r13.A07, " ", sb3);
                    C42101xE.A00(r13.A08, " ", sb3);
                    A002 = sb3.toString();
                }
            }
        } else if (r10 instanceof C30591cd) {
            A002 = ((C30591cd) r10).ACS();
        } else if (r10 instanceof C30581cc) {
            C30581cc r102 = (C30581cc) r10;
            boolean A0x = r102.A0x();
            A002 = r102.A0I();
            if (A0x) {
                A002 = A00(r102.A0E().A00, A002);
            } else {
                if (!TextUtils.isEmpty(r102.A06)) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(A002);
                    sb4.append(" ");
                    sb4.append(r102.A06);
                    A002 = sb4.toString();
                }
                if (!TextUtils.isEmpty(r102.A04)) {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(A002);
                    sb5.append(" ");
                    sb5.append(r102.A04);
                    A002 = sb5.toString();
                }
                if (!TextUtils.isEmpty(r102.A07)) {
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append(A002);
                    sb6.append(" ");
                    sb6.append(r102.A07);
                    A002 = sb6.toString();
                }
                AnonymousClass1Vt r14 = r102.A0L;
                if (!(r14 == null || (r0 = r14.A08) == null)) {
                    BigDecimal bigDecimal2 = r0.A00;
                    String str2 = r14.A0I;
                    if (bigDecimal2 == null || TextUtils.isEmpty(bigDecimal2.toPlainString()) || TextUtils.isEmpty(str2)) {
                        str = null;
                    } else {
                        str = bigDecimal2.toPlainString();
                        try {
                            C39651sq r3 = new C39651sq(str2);
                            StringBuilder sb7 = new StringBuilder();
                            sb7.append(str);
                            sb7.append(" ");
                            sb7.append(r3.A03(this.A05, bigDecimal2, true));
                            str = sb7.toString();
                        } catch (IllegalArgumentException unused) {
                        }
                    }
                    if (!TextUtils.isEmpty(str)) {
                        StringBuilder sb8 = new StringBuilder();
                        sb8.append(A002);
                        sb8.append(" ");
                        sb8.append(str);
                        A002 = sb8.toString();
                    }
                }
            }
        } else if (r10 instanceof AnonymousClass1WU) {
            AnonymousClass1WU r103 = (AnonymousClass1WU) r10;
            String A0I2 = TextUtils.isEmpty(r103.A0I()) ? "" : r103.A0I();
            if ((r103 instanceof AnonymousClass1WT) && (userJid = ((AnonymousClass1WT) r103).A01) != null) {
                StringBuilder sb9 = new StringBuilder();
                sb9.append(A0I2);
                sb9.append(" ");
                sb9.append(userJid.getRawString());
                A0I2 = sb9.toString();
            }
            if (r103 instanceof C39311sG) {
                C39311sG r32 = (C39311sG) r103;
                if (!TextUtils.isEmpty(r32.A00) && (r1 = r103.A11.A00) != null) {
                    C16010sH A0A2 = this.A03.A0A(r1);
                    boolean z2 = true;
                    if (!A0A2.A0H() || !((i2 = A0A2.A06) == 2 || i2 == 1)) {
                        z2 = false;
                    }
                    if (!z2) {
                        StringBuilder sb10 = new StringBuilder();
                        sb10.append(A002);
                        sb10.append(" ");
                        sb10.append(r32.A00);
                        A002 = sb10.toString();
                    }
                }
            }
        } else {
            if ((r10 instanceof C38681rF) || (r10 instanceof C38721rJ)) {
                if (r10 instanceof C38891ra) {
                    C38891ra r104 = (C38891ra) r10;
                    String str3 = r104.A09;
                    if (TextUtils.isEmpty(str3)) {
                        str3 = "";
                    }
                    String str4 = r104.A02;
                    if (!TextUtils.isEmpty(str4)) {
                        StringBuilder sb11 = new StringBuilder();
                        sb11.append(str3);
                        sb11.append(" ");
                        sb11.append(str4);
                        str3 = sb11.toString();
                    }
                    String str5 = r104.A05;
                    if (!TextUtils.isEmpty(str5)) {
                        StringBuilder sb12 = new StringBuilder();
                        sb12.append(str3);
                        sb12.append(" ");
                        sb12.append(str5);
                        str3 = sb12.toString();
                    }
                    if (!TextUtils.isEmpty(r104.A04)) {
                        StringBuilder sb13 = new StringBuilder();
                        sb13.append(str3);
                        sb13.append(" ");
                        sb13.append(r104.A04);
                        str3 = sb13.toString();
                    }
                    if (r104.A0A != null && !TextUtils.isEmpty(r104.A03)) {
                        C39651sq r72 = new C39651sq(r104.A03);
                        AnonymousClass013 r52 = this.A05;
                        String A032 = r72.A03(r52, r104.A0A, true);
                        BigDecimal bigDecimal3 = r104.A0B;
                        if (!(bigDecimal3 == null || BigDecimal.ZERO.compareTo(bigDecimal3) == 0)) {
                            StringBuilder sb14 = new StringBuilder();
                            sb14.append(A032);
                            sb14.append(" ");
                            sb14.append(r72.A03(r52, r104.A0B, true));
                            A032 = sb14.toString();
                        }
                        StringBuilder sb15 = new StringBuilder();
                        sb15.append(A002);
                        sb15.append(" ");
                        sb15.append(A032);
                        A002 = sb15.toString();
                    }
                } else if (!r10.A0x()) {
                    A002 = ((C16730tY) r10).A13();
                }
            } else if (r10 instanceof C38841rV) {
                A002 = ((C38841rV) r10).A03;
            } else if (r10 instanceof C38631rA) {
                if (!r10.A0x()) {
                    A002 = ((C38631rA) r10).A19();
                }
            } else if (r10 instanceof C38751rM) {
                if (!r10.A0x()) {
                    A002 = ((C38751rM) r10).A15();
                }
            } else if (r10 instanceof C38741rL) {
                A002 = ((C38741rL) r10).A00;
            } else {
                if (r10 instanceof C38811rS) {
                    List<C39691su> list = ((C38811rS) r10).A02;
                    if (list == null) {
                        A002 = null;
                    } else {
                        sb = new StringBuilder();
                        for (C39691su r04 : list) {
                            sb.append(r04.A01.A02());
                            sb.append(" ");
                        }
                    }
                } else if (r10 instanceof C30071bh) {
                    A002 = r10.A0J();
                } else if (r10 instanceof C39021rn) {
                    C39021rn r105 = (C39021rn) r10;
                    AnonymousClass013 r53 = this.A05;
                    String str6 = !TextUtils.isEmpty(r105.A07) ? r105.A07 : "";
                    if (!TextUtils.isEmpty(r105.A05)) {
                        StringBuilder sb16 = new StringBuilder();
                        sb16.append(str6);
                        sb16.append(" ");
                        sb16.append(r105.A05);
                        str6 = sb16.toString();
                    }
                    String str7 = r105.A04;
                    if (!(str7 == null || (bigDecimal = r105.A09) == null)) {
                        StringBuilder sb17 = new StringBuilder();
                        sb17.append(A002);
                        sb17.append(" ");
                        sb17.append(new C39651sq(str7).A03(r53, bigDecimal, true));
                        A002 = sb17.toString();
                    }
                } else {
                    if (r10 instanceof C39171s2) {
                        C39171s2 r106 = (C39171s2) r10;
                        sb = new StringBuilder();
                        sb.append(r106.A03);
                        if (this.A0H) {
                            for (C39631sn r05 : r106.A05) {
                                sb.append(" ");
                                sb.append(r05.A03);
                            }
                        }
                    }
                }
                A002 = sb.toString();
            }
            A002 = A00(r10.A0E().A00, r10.A0I());
        }
        return A002 != null ? A002 : "";
    }

    public final String A0F(C16740tZ r7) {
        Set<String> ADX;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.A0G.entrySet()) {
            if (!(entry == null || entry.getValue() == null || (ADX = ((C42371xg) entry.getValue()).ADX(r7)) == null)) {
                String str = (String) entry.getKey();
                for (String str2 : ADX) {
                    if (str2 != null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(str);
                        sb.append(str2);
                        arrayList.add(sb.toString());
                    }
                }
            }
        }
        return TextUtils.join(" ", arrayList);
    }

    @Deprecated
    public String A0G(String str) {
        boolean z2;
        String obj;
        StringBuilder sb;
        String trim = A0H(str).trim();
        int length = trim.length();
        if (length == 0) {
            return trim;
        }
        if (!trim.startsWith("\"") || !trim.endsWith("\"") || length <= 2) {
            z2 = false;
        } else {
            z2 = true;
            trim = trim.substring(1, length - 1);
        }
        String trim2 = C40661uU.A02.matcher(trim).replaceAll(" ").trim();
        if (trim2.length() == 0) {
            return trim2;
        }
        if (z2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("\"");
            sb2.append(trim2);
            sb2.append("\"");
            obj = sb2.toString();
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(trim2);
            sb3.append("*");
            obj = sb3.toString();
        }
        if (obj.indexOf(105) == -1) {
            return obj;
        }
        if (z2) {
            sb = new StringBuilder();
            sb.append(obj);
            sb.append(" OR ");
            sb.append(obj.replace('i', 305));
        } else {
            String[] split = A0I.split(obj);
            sb = new StringBuilder();
            for (String str2 : split) {
                if (str2.indexOf(105) != -1) {
                    sb.append(str2);
                    sb.append(" OR ");
                    str2 = str2.replace('i', 305);
                }
                sb.append(str2);
            }
        }
        return sb.toString();
    }

    public String A0H(String str) {
        AnonymousClass013 r1 = this.A05;
        if (str.isEmpty()) {
            return str;
        }
        boolean z2 = false;
        if (!C42471xq.A00.matcher(str).find()) {
            z2 = true;
            str = AnonymousClass1ZW.A09(str);
        }
        StringBuilder sb = new StringBuilder(str.length());
        BreakIterator A012 = C40661uU.A01(r1);
        A012.setText(str);
        int first = A012.first();
        while (true) {
            int next = A012.next();
            int i2 = first;
            first = next;
            if (next == -1) {
                break;
            } else if (next - i2 != 1 || str.codePointAt(i2) != 32) {
                CharSequence subSequence = str.subSequence(i2, next);
                if (!z2) {
                    subSequence = AnonymousClass1ZW.A09(subSequence);
                }
                sb.append(subSequence);
                sb.append(' ');
            }
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0164, code lost:
        r4.A02("counted");
        r2 = new java.util.ArrayList(r12.entrySet());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0176, code lost:
        if (A02(r10) != false) goto L_0x0192;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0178, code lost:
        java.util.Collections.sort(r2, new com.facebook.redex.IDxComparatorShape19S0000000_2_I0(19));
        r4.A02("sorted");
        r13 = r2.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0190, code lost:
        if (A02(r10) == false) goto L_0x0199;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x019d, code lost:
        if (r13.hasNext() == false) goto L_0x01fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01a4, code lost:
        if (r3.size() >= 5) goto L_0x01fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01aa, code lost:
        if (A02(r10) != false) goto L_0x0192;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01ac, code lost:
        r1 = (java.lang.String) ((java.util.Map.Entry) r13.next()).getKey();
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01bd, code lost:
        if (android.text.TextUtils.isEmpty(r1) != false) goto L_0x01e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01c5, code lost:
        if (r1.equals("0") != false) goto L_0x01e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01d7, code lost:
        r5 = (X.C15830rv) r7.A0A.A07(X.C15830rv.class, java.lang.Long.parseLong(r1, 36) - 10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:?, code lost:
        r4.A02("lookup");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:100:0x0210 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:95:0x020b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List A0I(X.AnonymousClass024 r18, X.C42391xi r19) {
        /*
            r17 = this;
            java.lang.String r0 = "FtsMessageStore/findChats/"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r8 = r19
            java.lang.String r0 = r8.A02()
            int r0 = r0.length()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            X.1Zf r4 = new X.1Zf
            r4.<init>((java.lang.String) r0)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r7 = r17
            boolean r0 = r7.A0P()
            if (r0 != 0) goto L_0x0033
            java.lang.String r0 = "FtsMessageStore not ready"
        L_0x002c:
            r4.A02(r0)
        L_0x002f:
            r4.A01()
            return r3
        L_0x0033:
            r10 = r18
            boolean r0 = A02(r10)
            java.lang.String r9 = "cancelled"
            if (r0 == 0) goto L_0x0041
            r4.A02(r9)
            goto L_0x002f
        L_0x0041:
            java.util.List r0 = r8.A03()
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x0050
            java.lang.String r0 = "empty"
            goto L_0x002c
        L_0x0050:
            long r5 = r7.A04()
            r1 = 1
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x005e
            java.lang.String r0 = "v1"
            goto L_0x002c
        L_0x005e:
            java.util.List r0 = r8.A03()
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x0071
            java.lang.String r2 = ""
        L_0x006c:
            if (r2 != 0) goto L_0x00e3
            java.lang.String r0 = "no user"
            goto L_0x002c
        L_0x0071:
            r0 = 0
            java.util.List r0 = r7.A0J(r10, r8, r0)
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>()
            java.util.Iterator r6 = r0.iterator()
        L_0x007f:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x00a5
            java.lang.Object r0 = r6.next()
            android.util.Pair r0 = (android.util.Pair) r0
            java.lang.Object r0 = r0.second
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r2 = r0.iterator()
        L_0x0093:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x007f
            java.lang.Object r1 = r2.next()
            boolean r0 = r1 instanceof com.whatsapp.jid.UserJid
            if (r0 == 0) goto L_0x0093
            r5.add(r1)
            goto L_0x0093
        L_0x00a5:
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x00ad
            r2 = 0
            goto L_0x006c
        L_0x00ad:
            int r0 = r5.size()
            java.lang.String[] r11 = new java.lang.String[r0]
            r12 = 0
            java.util.Iterator r6 = r5.iterator()
        L_0x00b8:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x00dc
            java.lang.Object r5 = r6.next()
            X.0rv r5 = (X.C15830rv) r5
            int r2 = r12 + 1
            java.lang.String r0 = "fts_jid:"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = r7.A0D(r5)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r11[r12] = r0
            r12 = r2
            goto L_0x00b8
        L_0x00dc:
            java.lang.String r0 = " OR "
            java.lang.String r2 = android.text.TextUtils.join(r0, r11)
            goto L_0x006c
        L_0x00e3:
            r0 = 0
            java.lang.String r1 = r7.A0B(r10, r8, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r15 = " "
            r0.append(r15)
            r0.append(r2)
            java.lang.String r6 = r0.toString()
            java.lang.String r0 = "matchterm"
            r4.A02(r0)
            X.0tq r0 = r7.A0D     // Catch:{ SQLiteDatabaseCorruptException -> 0x0221, SQLiteException -> 0x0217, 057 -> 0x022a, Exception -> 0x0211 }
            X.0tf r8 = r0.get()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0221, SQLiteException -> 0x0217, 057 -> 0x022a, Exception -> 0x0211 }
            X.0tg r5 = r8.A02     // Catch:{ all -> 0x020c }
            java.lang.String r2 = "SELECT fts_jid, count(*) AS count FROM message_ftsv2 WHERE message_ftsv2 MATCH ? GROUP BY fts_jid"
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x020c }
            r0 = 0
            r1[r0] = r6     // Catch:{ all -> 0x020c }
            android.database.Cursor r6 = r5.A07(r10, r2, r1)     // Catch:{ all -> 0x020c }
            java.lang.String r0 = "fts_jid"
            int r14 = r6.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0207 }
            java.lang.String r0 = "count"
            int r13 = r6.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0207 }
            java.util.HashMap r12 = new java.util.HashMap     // Catch:{ all -> 0x0207 }
            r12.<init>()     // Catch:{ all -> 0x0207 }
        L_0x0126:
            boolean r0 = r6.moveToNext()     // Catch:{ all -> 0x0207 }
            if (r0 == 0) goto L_0x0164
            boolean r0 = A02(r10)     // Catch:{ all -> 0x0207 }
            if (r0 != 0) goto L_0x0192
            java.lang.String r0 = r6.getString(r14)     // Catch:{ all -> 0x0207 }
            java.lang.String[] r11 = android.text.TextUtils.split(r0, r15)     // Catch:{ all -> 0x0207 }
            int r16 = r6.getInt(r13)     // Catch:{ all -> 0x0207 }
            int r5 = r11.length     // Catch:{ all -> 0x0207 }
            r2 = 0
        L_0x0140:
            if (r2 >= r5) goto L_0x0126
            r1 = r11[r2]     // Catch:{ all -> 0x0207 }
            java.lang.Object r0 = r12.get(r1)     // Catch:{ all -> 0x0207 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x0207 }
            if (r0 != 0) goto L_0x0154
            java.lang.Integer r0 = java.lang.Integer.valueOf(r16)     // Catch:{ all -> 0x0207 }
            r12.put(r1, r0)     // Catch:{ all -> 0x0207 }
            goto L_0x0161
        L_0x0154:
            int r0 = r0.intValue()     // Catch:{ all -> 0x0207 }
            int r0 = r0 + r16
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0207 }
            r12.put(r1, r0)     // Catch:{ all -> 0x0207 }
        L_0x0161:
            int r2 = r2 + 1
            goto L_0x0140
        L_0x0164:
            java.lang.String r0 = "counted"
            r4.A02(r0)     // Catch:{ all -> 0x0207 }
            java.util.Set r0 = r12.entrySet()     // Catch:{ all -> 0x0207 }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x0207 }
            r2.<init>(r0)     // Catch:{ all -> 0x0207 }
            boolean r0 = A02(r10)     // Catch:{ all -> 0x0207 }
            if (r0 != 0) goto L_0x0192
            r1 = 19
            com.facebook.redex.IDxComparatorShape19S0000000_2_I0 r0 = new com.facebook.redex.IDxComparatorShape19S0000000_2_I0     // Catch:{ all -> 0x0207 }
            r0.<init>(r1)     // Catch:{ all -> 0x0207 }
            java.util.Collections.sort(r2, r0)     // Catch:{ all -> 0x0207 }
            java.lang.String r0 = "sorted"
            r4.A02(r0)     // Catch:{ all -> 0x0207 }
            java.util.Iterator r13 = r2.iterator()     // Catch:{ all -> 0x0207 }
            boolean r0 = A02(r10)     // Catch:{ all -> 0x0207 }
            if (r0 == 0) goto L_0x0199
        L_0x0192:
            r4.A02(r9)     // Catch:{ all -> 0x0207 }
            r4.A01()     // Catch:{ all -> 0x0207 }
            goto L_0x01f4
        L_0x0199:
            boolean r0 = r13.hasNext()     // Catch:{ all -> 0x0207 }
            if (r0 == 0) goto L_0x01fb
            int r1 = r3.size()     // Catch:{ all -> 0x0207 }
            r0 = 5
            if (r1 >= r0) goto L_0x01fb
            boolean r0 = A02(r10)     // Catch:{ all -> 0x0207 }
            if (r0 != 0) goto L_0x0192
            java.lang.Object r0 = r13.next()     // Catch:{ all -> 0x0207 }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ all -> 0x0207 }
            java.lang.Object r1 = r0.getKey()     // Catch:{ all -> 0x0207 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x0207 }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0207 }
            r5 = 0
            if (r0 != 0) goto L_0x01e4
            java.lang.String r0 = "0"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0207 }
            if (r0 != 0) goto L_0x01e4
            r0 = 36
            long r0 = java.lang.Long.parseLong(r1, r0)     // Catch:{ Exception -> 0x01ce }
            goto L_0x01d7
        L_0x01ce:
            r2 = move-exception
            X.0so r1 = r7.A00     // Catch:{ all -> 0x0207 }
            java.lang.String r0 = "ftsMessageStore/corrupt_db"
            r1.A03(r0, r5, r2)     // Catch:{ all -> 0x0207 }
            goto L_0x01e4
        L_0x01d7:
            X.14v r5 = r7.A0A     // Catch:{ all -> 0x0207 }
            java.lang.Class<X.0rv> r2 = X.C15830rv.class
            r11 = 10
            long r0 = r0 - r11
            com.whatsapp.jid.Jid r5 = r5.A07(r2, r0)     // Catch:{ all -> 0x0207 }
            X.0rv r5 = (X.C15830rv) r5     // Catch:{ all -> 0x0207 }
        L_0x01e4:
            boolean r0 = X.C16030sJ.A0O(r5)     // Catch:{ all -> 0x0207 }
            if (r0 == 0) goto L_0x0199
            X.14t r0 = r7.A08     // Catch:{ all -> 0x0207 }
            X.0sH r0 = r0.A01(r5)     // Catch:{ all -> 0x0207 }
            r3.add(r0)     // Catch:{ all -> 0x0207 }
            goto L_0x0199
        L_0x01f4:
            r6.close()     // Catch:{ all -> 0x020c }
            r8.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0221, SQLiteException -> 0x0217, 057 -> 0x022a, Exception -> 0x0211 }
            goto L_0x022e
        L_0x01fb:
            java.lang.String r0 = "lookup"
            r4.A02(r0)     // Catch:{ all -> 0x0207 }
            r6.close()     // Catch:{ all -> 0x020c }
            r8.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0221, SQLiteException -> 0x0217, 057 -> 0x022a, Exception -> 0x0211 }
            goto L_0x022a
        L_0x0207:
            r0 = move-exception
            r6.close()     // Catch:{ all -> 0x020b }
        L_0x020b:
            throw r0     // Catch:{ all -> 0x020c }
        L_0x020c:
            r0 = move-exception
            r8.close()     // Catch:{ all -> 0x0210 }
        L_0x0210:
            throw r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x0221, SQLiteException -> 0x0217, 057 -> 0x022a, Exception -> 0x0211 }
        L_0x0211:
            r1 = move-exception
            boolean r0 = r1 instanceof android.os.OperationCanceledException
            if (r0 != 0) goto L_0x022a
            throw r1
        L_0x0217:
            r1 = move-exception
            java.lang.String r0 = "FtsMessageStore/search/error"
            com.whatsapp.util.Log.e(r0, r1)
            java.lang.String r0 = "error"
            goto L_0x002c
        L_0x0221:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            X.0ym r0 = r7.A0C
            r0.A02()
        L_0x022a:
            java.lang.String r0 = "complete"
            goto L_0x002c
        L_0x022e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass17F.A0I(X.024, X.1xi):java.util.List");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: java.util.ArrayList} */
    /* JADX WARNING: type inference failed for: r9v1 */
    /* JADX WARNING: type inference failed for: r9v3, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List A0J(X.AnonymousClass024 r22, X.C42391xi r23, java.lang.Integer r24) {
        /*
            r21 = this;
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r4 = r23
            java.util.List r20 = r4.A03()
            r3 = 0
        L_0x000c:
            int r0 = r20.size()
            if (r3 >= r0) goto L_0x011a
            boolean r0 = A02(r22)
            if (r0 != 0) goto L_0x011a
            r0 = r20
            java.lang.Object r6 = r0.get(r3)
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L_0x0110
            int r0 = r20.size()
            r13 = 1
            int r0 = r0 - r13
            r19 = 0
            if (r3 != r0) goto L_0x002e
            r19 = 1
        L_0x002e:
            monitor-enter(r4)
            java.util.Map r12 = r4.A0E     // Catch:{ all -> 0x0117 }
            if (r12 != 0) goto L_0x003a
            java.util.concurrent.ConcurrentHashMap r12 = new java.util.concurrent.ConcurrentHashMap     // Catch:{ all -> 0x0117 }
            r12.<init>()     // Catch:{ all -> 0x0117 }
            r4.A0E = r12     // Catch:{ all -> 0x0117 }
        L_0x003a:
            monitor-exit(r4)
            java.lang.Object r10 = r4.A0I
            monitor-enter(r10)
            java.lang.Object r8 = r12.get(r6)     // Catch:{ all -> 0x0114 }
            java.util.List r8 = (java.util.List) r8     // Catch:{ all -> 0x0114 }
            r11 = r21
            r7 = r24
            if (r8 == 0) goto L_0x0053
            X.17S r2 = r11.A0F     // Catch:{ all -> 0x0114 }
            java.lang.String r0 = "fts_cached_jids"
            X.C42421xl.A02(r2, r7, r0)     // Catch:{ all -> 0x0114 }
        L_0x0051:
            monitor-exit(r10)     // Catch:{ all -> 0x0114 }
            goto L_0x00cc
        L_0x0053:
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ all -> 0x0114 }
            r8.<init>()     // Catch:{ all -> 0x0114 }
            java.util.List r18 = java.util.Collections.singletonList(r6)     // Catch:{ all -> 0x0114 }
            r11.A0N(r4)     // Catch:{ all -> 0x0114 }
            X.17S r2 = r11.A0F     // Catch:{ all -> 0x0114 }
            java.lang.String r0 = "fts_warm_cache"
            X.C42421xl.A02(r2, r7, r0)     // Catch:{ all -> 0x0114 }
            java.util.List r0 = r4.A0C     // Catch:{ all -> 0x0114 }
            r1 = 0
            if (r0 == 0) goto L_0x006c
            r1 = 1
        L_0x006c:
            java.lang.String r0 = "contact list null after warming"
            X.AnonymousClass00B.A0B(r0, r1)     // Catch:{ all -> 0x0114 }
            java.lang.String r1 = "FtsMessageStore/filter"
            X.1Zf r17 = new X.1Zf     // Catch:{ all -> 0x0114 }
            r0 = r17
            r0.<init>((java.lang.String) r1)     // Catch:{ all -> 0x0114 }
            java.util.List r0 = r4.A0C     // Catch:{ all -> 0x0114 }
            X.AnonymousClass00B.A06(r0)     // Catch:{ all -> 0x0114 }
            java.util.Iterator r16 = r0.iterator()     // Catch:{ all -> 0x0114 }
        L_0x0083:
            boolean r0 = r16.hasNext()     // Catch:{ all -> 0x0114 }
            if (r0 == 0) goto L_0x00c0
            java.lang.Object r15 = r16.next()     // Catch:{ all -> 0x0114 }
            X.0sH r15 = (X.C16010sH) r15     // Catch:{ all -> 0x0114 }
            boolean r0 = A02(r22)     // Catch:{ all -> 0x0114 }
            if (r0 == 0) goto L_0x0098
            if (r19 == 0) goto L_0x0098
            goto L_0x00f1
        L_0x0098:
            java.lang.Class<X.0rv> r0 = X.C15830rv.class
            com.whatsapp.jid.Jid r14 = r15.A08(r0)     // Catch:{ all -> 0x0114 }
            X.0rv r14 = (X.C15830rv) r14     // Catch:{ all -> 0x0114 }
            if (r14 == 0) goto L_0x0083
            boolean r0 = r14 instanceof com.whatsapp.jid.UserJid     // Catch:{ all -> 0x0114 }
            if (r0 != 0) goto L_0x00aa
            boolean r0 = r14 instanceof com.whatsapp.jid.GroupJid     // Catch:{ all -> 0x0114 }
            if (r0 == 0) goto L_0x0083
        L_0x00aa:
            X.0sP r9 = r11.A04     // Catch:{ all -> 0x0114 }
            int r0 = r6.length()     // Catch:{ all -> 0x0114 }
            r1 = 0
            if (r0 <= r13) goto L_0x00b4
            r1 = 1
        L_0x00b4:
            r0 = r18
            boolean r0 = r9.A0T(r15, r0, r1)     // Catch:{ all -> 0x0114 }
            if (r0 == 0) goto L_0x0083
            r8.add(r14)     // Catch:{ all -> 0x0114 }
            goto L_0x0083
        L_0x00c0:
            r12.put(r6, r8)     // Catch:{ all -> 0x0114 }
            java.lang.String r0 = "fts_search"
            X.C42421xl.A02(r2, r7, r0)     // Catch:{ all -> 0x0114 }
            r17.A01()     // Catch:{ all -> 0x0114 }
            goto L_0x0051
        L_0x00cc:
            java.util.List r0 = r4.A0A
            if (r0 == 0) goto L_0x00f8
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r8 = r8.iterator()
        L_0x00d9:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x00ff
            java.lang.Object r1 = r8.next()
            X.0rv r1 = (X.C15830rv) r1
            java.util.List r0 = r4.A0A
            boolean r0 = X.C216114t.A00(r1, r0)
            if (r0 == 0) goto L_0x00d9
            r9.add(r1)
            goto L_0x00d9
        L_0x00f1:
            java.lang.String r0 = "fts_last_cancel"
            X.C42421xl.A02(r2, r7, r0)     // Catch:{ all -> 0x0114 }
            monitor-exit(r10)     // Catch:{ all -> 0x0114 }
            goto L_0x00fd
        L_0x00f8:
            java.lang.String r0 = "fts_unfiltered"
            X.C42421xl.A02(r2, r7, r0)
        L_0x00fd:
            r9 = r8
            goto L_0x0104
        L_0x00ff:
            java.lang.String r0 = "fts_filtered"
            X.C42421xl.A02(r2, r7, r0)
        L_0x0104:
            java.lang.String r0 = "fts_token_jids"
            X.C42421xl.A02(r2, r7, r0)
            android.util.Pair r0 = android.util.Pair.create(r6, r9)
            r5.add(r0)
        L_0x0110:
            int r3 = r3 + 1
            goto L_0x000c
        L_0x0114:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0114 }
            throw r0
        L_0x0117:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x011a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass17F.A0J(X.024, X.1xi, java.lang.Integer):java.util.List");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0057 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0K() {
        /*
            r7 = this;
            java.lang.String r0 = "FtsMessageStore/drop"
            X.1Zf r5 = new X.1Zf
            r5.<init>((java.lang.String) r0)
            X.0tq r2 = r7.A0D
            X.0tf r4 = r2.A02()
            X.1cj r6 = r4.A00()     // Catch:{ all -> 0x0058 }
            X.0tg r1 = r4.A02     // Catch:{ all -> 0x0053 }
            java.lang.String r0 = "messages_fts"
            java.lang.String r0 = X.C34031ja.A00(r0)     // Catch:{ all -> 0x0053 }
            r1.A0B(r0)     // Catch:{ all -> 0x0053 }
            java.lang.String r0 = "message_ftsv2"
            java.lang.String r0 = X.C34031ja.A00(r0)     // Catch:{ all -> 0x0053 }
            r1.A0B(r0)     // Catch:{ all -> 0x0053 }
            r2.A04()     // Catch:{ all -> 0x0053 }
            X.1jC r0 = r2.A04     // Catch:{ all -> 0x0053 }
            r0.A06(r4)     // Catch:{ all -> 0x0053 }
            X.11I r3 = r7.A0E     // Catch:{ all -> 0x0053 }
            java.lang.String r0 = "migration_fts_index"
            r3.A03(r0)     // Catch:{ all -> 0x0053 }
            java.lang.String r0 = "migration_fts_retry"
            r3.A03(r0)     // Catch:{ all -> 0x0053 }
            java.lang.String r1 = "fts_index_start"
            r0 = 0
            r3.A04(r1, r0)     // Catch:{ all -> 0x0053 }
            java.lang.String r2 = "fts_ready"
            r0 = 0
            r3.A05(r2, r0)     // Catch:{ all -> 0x0053 }
            r6.A00()     // Catch:{ all -> 0x0053 }
            r6.close()     // Catch:{ all -> 0x0058 }
            r4.close()
            r5.A01()
            return
        L_0x0053:
            r0 = move-exception
            r6.close()     // Catch:{ all -> 0x0057 }
        L_0x0057:
            throw r0     // Catch:{ all -> 0x0058 }
        L_0x0058:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x005c }
        L_0x005c:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass17F.A0K():void");
    }

    public void A0L(C42371xg r4) {
        String ADr = r4.ADr();
        Map map = this.A0G;
        if (map.containsKey(ADr)) {
            AnonymousClass00B.A08("Namespace already registered");
        }
        map.put(ADr, r4);
    }

    public void A0M(C42391xi r3) {
        try {
            A0N(r3);
        } catch (IllegalStateException e2) {
            Log.e("FtsMessageStore/safeWarm/failed to warm contact list", e2);
        }
    }

    public void A0N(C42391xi r6) {
        if (r6.A0C == null) {
            synchronized (r6.A0I) {
                if (r6.A0C == null) {
                    C28921Zf r4 = new C28921Zf("FtsMessageStore/getSearchableContacts");
                    LinkedList linkedList = new LinkedList(this.A08.A04().values());
                    r6.A0C = linkedList;
                    if (r6.A0B != null) {
                        Iterator it = linkedList.iterator();
                        while (it.hasNext()) {
                            C15830rv r1 = (C15830rv) ((C16010sH) it.next()).A08(C15830rv.class);
                            if (r1 == null || !C216114t.A00(r1, r6.A0B)) {
                                it.remove();
                            }
                        }
                    }
                    List list = r6.A0C;
                    AnonymousClass00B.A06(list);
                    list.size();
                    r4.A01();
                }
            }
        }
    }

    public void A0O(C16740tZ r7) {
        C16740tZ r1 = r7;
        A07(r1, Collections.emptyMap(), A04(), false);
    }

    public boolean A0P() {
        return this.A0E.A01("fts_ready", 0) % 2 != 0;
    }
}
