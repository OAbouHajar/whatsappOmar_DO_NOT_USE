package X;

import android.database.Cursor;
import android.view.View;
import com.obwhatsapp.Conversation;
import com.obwhatsapp.R;
import com.obwhatsapp.conversation.ConversationListView;
import java.lang.ref.WeakReference;

/* renamed from: X.376  reason: invalid class name */
public class AnonymousClass376 extends C16690tT {
    public int A00;
    public long A01 = 1;
    public C34651kc A02;
    public C16740tZ A03;
    public final C16440t3 A04;
    public final C16460t6 A05;
    public final AnonymousClass17F A06;
    public final C42391xi A07;
    public final AnonymousClass15B A08;
    public final C15830rv A09;
    public final C16740tZ A0A;
    public final WeakReference A0B;
    public final boolean A0C;

    public AnonymousClass376(C42791yg r3, C16440t3 r4, C16460t6 r5, AnonymousClass17F r6, C42391xi r7, AnonymousClass15B r8, C16740tZ r9, boolean z2) {
        this.A04 = r4;
        this.A08 = r8;
        this.A06 = r6;
        this.A05 = r5;
        C15830rv r0 = r7.A04;
        AnonymousClass00B.A06(r0);
        this.A09 = r0;
        this.A07 = r7;
        this.A0C = z2;
        this.A0A = r9;
        this.A0B = C13690nt.A0h(r3);
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:44:0x025b */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:37:0x0239=Splitter:B:37:0x0239, B:44:0x025b=Splitter:B:44:0x025b} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r22) {
        /*
            r21 = this;
            long r18 = android.os.SystemClock.elapsedRealtime()
            r0 = r21
            X.17F r9 = r0.A06
            X.0tZ r3 = r0.A0A
            boolean r5 = r0.A0C
            X.1xi r8 = r0.A07
            boolean r1 = r9.A0P()
            if (r1 == 0) goto L_0x0149
            java.lang.String r1 = "FtsMessageStore/searchforjid"
            X.1Zf r12 = new X.1Zf
            r12.<init>((java.lang.String) r1)
            X.0rv r1 = r8.A04
            X.AnonymousClass00B.A06(r1)
            long r2 = X.C38621r6.A07(r3)
            r10 = -4
            r6 = -9223372036854775808
            int r4 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r4 != 0) goto L_0x008c
            java.lang.String r1 = "FtsMessageStore/searchforjid/startSortId < 0"
            com.whatsapp.util.Log.e((java.lang.String) r1)
        L_0x0030:
            X.1xn r1 = X.C42441xn.A00(r10)
        L_0x0034:
            long r6 = r1.A01
            r3 = 0
            int r2 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r2 <= 0) goto L_0x007b
            X.0t6 r3 = r0.A05
            X.0rv r4 = r0.A09
            r5 = 100
            r8 = -1
            X.1kc r2 = r3.A0B(r4, r5, r6, r8)
            r0.A02 = r2
            X.0th r2 = r3.A0K
            X.0tZ r2 = r2.A00(r6)
            r0.A03 = r2
            X.15B r3 = r0.A08
            X.1kc r2 = r0.A02
            long r5 = r2.A02
            long r7 = r1.A02
            int r1 = r3.A02(r4, r5, r7)
            r0.A00 = r1
            X.1kc r1 = r0.A02
            android.database.Cursor r1 = r1.A00
            if (r1 == 0) goto L_0x007b
            int r2 = r1.getCount()
            int r1 = r0.A00
            int r2 = r2 - r1
            int r3 = r2 + -50
            X.1kc r1 = r0.A02
            android.database.Cursor r2 = r1.A00
            r1 = 0
            int r1 = java.lang.Math.max(r1, r3)
            r2.moveToPosition(r1)
        L_0x007b:
            long r3 = r0.A01
            r1 = 1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x008a
            r2 = 300(0x12c, double:1.48E-321)
            r0 = r18
            X.C14550pN.A0y(r0, r2)
        L_0x008a:
            r0 = 0
            return r0
        L_0x008c:
            java.lang.String r4 = "start:"
            java.lang.StringBuilder r6 = X.AnonymousClass000.A0r(r4)
            r6.append(r2)
            java.lang.String r4 = " up:"
            r6.append(r4)
            r6.append(r5)
            java.lang.String r4 = r6.toString()
            r12.A02(r4)
            java.util.List r4 = r8.A03()
            boolean r4 = X.C13700nu.A0i(r4)
            if (r4 == 0) goto L_0x0030
            long r16 = r9.A04()
            r14 = 1
            java.lang.String r13 = ""
            r11 = 2
            r10 = 1
            r7 = 0
            r6 = 0
            int r4 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            if (r4 != 0) goto L_0x0121
            java.lang.String r4 = X.C42431xm.A06
            java.lang.StringBuilder r13 = X.AnonymousClass000.A0r(r4)
            X.C224417y.A01(r13, r5)
            java.lang.String r4 = " LIMIT 1"
            java.lang.String r13 = X.AnonymousClass000.A0h(r4, r13)
            java.lang.String r4 = r8.A02()
            java.lang.String r5 = r9.A0G(r4)
            r4 = 3
            java.lang.String[] r14 = new java.lang.String[r4]
            r14[r7] = r5
            X.0ts r4 = r9.A07
            long r4 = r4.A02(r1)
            X.C13700nu.A0e(r14, r10, r4)
            X.C13700nu.A0e(r14, r11, r2)
            java.lang.String r4 = "FIND_FTS_MESSAGE_FOR_JID_DEPRECATED"
        L_0x00e9:
            X.AnonymousClass00B.A06(r14)
            java.lang.String r1 = "compiled"
            r12.A02(r1)
            X.1xn r1 = r9.A08(r13, r4, r14)
            int r5 = r1.A00
            r4 = -2
            if (r5 != r4) goto L_0x010d
            r8.A0F = r7
            java.lang.String r1 = r9.A0B(r6, r8, r6)
            java.lang.String[] r4 = new java.lang.String[r11]
            r4[r7] = r1
            X.C13700nu.A0e(r4, r10, r2)
            java.lang.String r1 = "FIND_FTS_MESSAGE_FOR_JID_CONTENT_ONLY"
            X.1xn r1 = r9.A08(r13, r1, r4)
        L_0x010d:
            java.lang.String r2 = "found: "
            java.lang.StringBuilder r4 = X.AnonymousClass000.A0r(r2)
            long r2 = r1.A01
            java.lang.String r2 = X.C13680ns.A0j(r4, r2)
            r12.A02(r2)
            r12.A01()
            goto L_0x0034
        L_0x0121:
            r14 = 5
            int r1 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            if (r1 != 0) goto L_0x0146
            r8.A0F = r10
            java.lang.String r1 = X.C42431xm.A08
            java.lang.StringBuilder r4 = X.AnonymousClass000.A0r(r1)
            X.C224417y.A01(r4, r5)
            java.lang.String r1 = " LIMIT 1"
            java.lang.String r13 = X.AnonymousClass000.A0h(r1, r4)
            java.lang.String r1 = r9.A0B(r6, r8, r6)
            java.lang.String[] r14 = new java.lang.String[r11]
            r14[r7] = r1
            X.C13700nu.A0e(r14, r10, r2)
            java.lang.String r4 = "FIND_FTS_MESSAGE_FOR_JID"
            goto L_0x00e9
        L_0x0146:
            r4 = r13
            r14 = r6
            goto L_0x00e9
        L_0x0149:
            java.lang.String r2 = "FtsMessageStore/like/searchforjid"
            X.1Zf r17 = new X.1Zf
            r1 = r17
            r1.<init>((java.lang.String) r2)
            X.0rv r1 = r8.A04
            r20 = r1
            X.AnonymousClass00B.A06(r20)
            long r3 = X.C38621r6.A07(r3)
            r16 = -4
            r6 = -9223372036854775808
            int r1 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r1 != 0) goto L_0x0170
            java.lang.String r1 = "FtsMessageStore/like/searchforjid/startid < 0"
            com.whatsapp.util.Log.e((java.lang.String) r1)
            X.1xn r1 = X.C42441xn.A00(r16)
            goto L_0x0034
        L_0x0170:
            java.lang.String r6 = r8.A02()
            java.lang.String r2 = "'"
            java.lang.String r1 = "''"
            java.lang.String r6 = r6.replace(r2, r1)
            java.lang.String r2 = "%"
            java.lang.String r1 = "\\%"
            java.lang.String r13 = r6.replace(r2, r1)
            java.lang.String r14 = "("
            java.lang.StringBuilder r6 = X.AnonymousClass000.A0r(r14)
            r6.append(r14)
            java.lang.String r1 = "data"
            r6.append(r1)
            java.lang.String r12 = " LIKE '%"
            r6.append(r12)
            r6.append(r13)
            java.lang.String r15 = "%' ESCAPE '\\' AND "
            r6.append(r15)
            java.lang.String r11 = "message_type"
            r6.append(r11)
            java.lang.String r8 = " = '"
            r6.append(r8)
            r10 = 0
            r6.append(r10)
            java.lang.String r7 = "') "
            r6.append(r7)
            java.lang.String r2 = " OR "
            r6.append(r2)
            r6.append(r14)
            java.lang.String r1 = "media_name"
            X.C13680ns.A1Y(r1, r12, r13, r6)
            X.C13680ns.A1Y(r15, r11, r8, r6)
            r1 = 5
            r6.append(r1)
            X.C13680ns.A1Y(r7, r2, r14, r6)
            java.lang.String r1 = "media_caption"
            X.C13680ns.A1Y(r1, r12, r13, r6)
            java.lang.String r1 = "%' ESCAPE '\\' AND NOT "
            X.C13680ns.A1Y(r1, r11, r8, r6)
            r6.append(r10)
            r6.append(r7)
            java.lang.String r1 = ")"
            r6.append(r1)
            java.lang.String r1 = "   SELECT _id, sort_id FROM available_message_view WHERE chat_row_id = ?"
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0r(r1)
            java.lang.String r1 = " AND "
            r2.append(r1)
            r2.append(r6)
            X.C224417y.A01(r2, r5)
            java.lang.String r1 = " LIMIT 1"
            java.lang.String r8 = X.AnonymousClass000.A0h(r1, r2)
            X.1xn r1 = X.C42441xn.A00(r16)
            r2 = 2
            java.lang.String[] r7 = new java.lang.String[r2]
            X.0ts r5 = r9.A07
            r2 = r20
            long r5 = r5.A02(r2)
            X.C13700nu.A0e(r7, r10, r5)
            r2 = 1
            X.C13700nu.A0e(r7, r2, r3)
            X.0tq r2 = r9.A0D
            X.0tf r4 = r2.get()
            X.0tg r2 = r4.A02     // Catch:{ all -> 0x025c }
            android.database.Cursor r3 = r2.A08(r8, r7)     // Catch:{ all -> 0x025c }
            boolean r2 = r3.moveToNext()     // Catch:{ all -> 0x0255 }
            if (r2 == 0) goto L_0x0239
            java.lang.String r1 = "sort_id"
            int r1 = r3.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x0255 }
            long r7 = r3.getLong(r1)     // Catch:{ all -> 0x0255 }
            java.lang.String r1 = "_id"
            int r1 = r3.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x0255 }
            long r9 = r3.getLong(r1)     // Catch:{ all -> 0x0255 }
            r6 = 1
            X.1xn r1 = new X.1xn     // Catch:{ all -> 0x0255 }
            r5 = r1
            r5.<init>(r6, r7, r9)     // Catch:{ all -> 0x0255 }
        L_0x0239:
            r3.close()     // Catch:{ all -> 0x025c }
            r4.close()
            java.lang.String r2 = "found: "
            java.lang.StringBuilder r4 = X.AnonymousClass000.A0r(r2)
            long r2 = r1.A01
            java.lang.String r3 = X.C13680ns.A0j(r4, r2)
            r2 = r17
            r2.A02(r3)
            r17.A01()
            goto L_0x0034
        L_0x0255:
            r0 = move-exception
            if (r3 == 0) goto L_0x025b
            r3.close()     // Catch:{ all -> 0x025b }
        L_0x025b:
            throw r0     // Catch:{ all -> 0x025c }
        L_0x025c:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0260 }
        L_0x0260:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass376.A08(java.lang.Object[]):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        Cursor cursor;
        C42791yg r0 = (C42791yg) this.A0B.get();
        if (r0 != null) {
            C34651kc r7 = this.A02;
            C16740tZ r2 = this.A03;
            int i2 = this.A00;
            C42821yj r3 = ((Conversation) r0).A00;
            if (C42451xo.A00(r3.A2f)) {
                View view = r3.A0G;
                if (!(view == null || r3.A0E == null || r3.A0H == null || r3.A0F == null)) {
                    view.setEnabled(true);
                    r3.A0E.setEnabled(true);
                    r3.A0H.setVisibility(8);
                    r3.A0F.setVisibility(8);
                }
            } else {
                r3.A22.Ac1();
            }
            if (r2 != null) {
                C48952Qa conversationCursorAdapter = r3.A1n.getConversationCursorAdapter();
                conversationCursorAdapter.A0W.add(r2.A11);
                if (r7 == null || (cursor = r7.A00) == null) {
                    r3.A1n.A02();
                } else {
                    r3.A2C.A0G(r7.A01);
                    r3.A2C.A0H(r7.A02);
                    r3.A2C.A0I(r7);
                    r3.A1n.A08(cursor);
                }
                ConversationListView conversationListView = r3.A1n;
                conversationListView.A07(i2 + conversationListView.getHeaderViewsCount(), r3.A22.getResources().getDimensionPixelSize(R.dimen.dimen0277));
                r3.A42.A01();
            } else {
                r3.A0J();
            }
            r3.A1q = null;
        }
    }
}
