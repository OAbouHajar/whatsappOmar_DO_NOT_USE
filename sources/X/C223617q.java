package X;

import android.content.ContentValues;
import android.text.TextUtils;
import com.whatsapp.jid.UserJid;

/* renamed from: X.17q  reason: invalid class name and case insensitive filesystem */
public class C223617q {
    public final C16300so A00;
    public final C16190sc A01;
    public final C223917t A02;
    public final C16920ts A03;
    public final AnonymousClass185 A04;
    public final C17610vM A05;
    public final C216314v A06;
    public final C224317x A07;
    public final AnonymousClass17G A08;
    public final AnonymousClass17I A09;
    public final C224217w A0A;
    public final AnonymousClass17H A0B;
    public final C16900tq A0C;
    public final C223117l A0D;
    public final AnonymousClass187 A0E;
    public final C221116r A0F;
    public final C224017u A0G;
    public final AnonymousClass11I A0H;
    public final C224517z A0I;
    public final C222917j A0J;
    public final C223217m A0K;
    public final AnonymousClass190 A0L;
    public final C222617g A0M;

    public C223617q(C16300so r2, C16190sc r3, C223917t r4, C16920ts r5, AnonymousClass185 r6, C17610vM r7, C216314v r8, C224317x r9, AnonymousClass17G r10, AnonymousClass17I r11, C224217w r12, AnonymousClass17H r13, C16900tq r14, C223117l r15, AnonymousClass187 r16, C221116r r17, C224017u r18, AnonymousClass11I r19, C224517z r20, C222917j r21, C223217m r22, AnonymousClass190 r23, C222617g r24) {
        this.A06 = r8;
        this.A03 = r5;
        this.A00 = r2;
        this.A01 = r3;
        this.A0M = r24;
        this.A08 = r10;
        this.A0J = r21;
        this.A0D = r15;
        this.A0H = r19;
        this.A0K = r22;
        this.A02 = r4;
        this.A0A = r12;
        this.A0B = r13;
        this.A0C = r14;
        this.A0G = r18;
        this.A07 = r9;
        this.A0I = r20;
        this.A09 = r11;
        this.A0L = r23;
        this.A05 = r7;
        this.A04 = r6;
        this.A0F = r17;
        this.A0E = r16;
    }

    public final ContentValues A00(C15830rv r8, C16740tZ r9, long j2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("message_row_id", Long.valueOf(j2));
        C16920ts r6 = this.A03;
        long A022 = r6.A02(r8);
        contentValues.put("parent_message_chat_row_id", Long.valueOf(A022));
        C28381Vw r3 = r9.A11;
        C15830rv r0 = r3.A00;
        if (r0 != null) {
            AnonymousClass00B.A06(r0);
            A022 = r6.A02(r0);
        } else {
            AnonymousClass00B.A0B("Quoted message chatJid is not specified, parentJid is not a UserJid.", r8 instanceof UserJid);
        }
        contentValues.put("chat_row_id", Long.valueOf(A022));
        contentValues.put("from_me", Integer.valueOf(r3.A02 ? 1 : 0));
        C15830rv A0B2 = r9.A0B();
        contentValues.put("sender_jid_row_id", Long.valueOf(A0B2 == null ? 0 : this.A06.A01(A0B2)));
        contentValues.put("key_id", r3.A01);
        contentValues.put("timestamp", Long.valueOf(r9.A0I));
        contentValues.put("message_type", Byte.valueOf(r9.A10));
        contentValues.put("origin", Integer.valueOf(r9.A08));
        contentValues.put("text_data", r9.A0P());
        contentValues.put("payment_transaction_id", r9.A0n);
        contentValues.put("lookup_tables", Long.valueOf(r9.A0A()));
        return contentValues;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x0091 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00a0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(X.C16740tZ r11) {
        /*
            r10 = this;
            X.0tZ r8 = r11.A0D()
            if (r8 == 0) goto L_0x00a9
            int r2 = r8.A08()
            r3 = 0
            r1 = 2
            r0 = 0
            if (r2 != r1) goto L_0x0010
            r0 = 1
        L_0x0010:
            X.AnonymousClass00B.A0G(r0)
            X.0tq r0 = r10.A0C
            X.0tf r5 = r0.A02()
            X.1cj r9 = r5.A00()     // Catch:{ all -> 0x00a1 }
            boolean r0 = r10.A06()     // Catch:{ all -> 0x009c }
            if (r0 == 0) goto L_0x003a
            long r0 = r11.A13     // Catch:{ all -> 0x009c }
            X.1Vw r2 = r11.A11     // Catch:{ all -> 0x009c }
            X.0rv r2 = r2.A00     // Catch:{ all -> 0x009c }
            X.AnonymousClass00B.A06(r2)     // Catch:{ all -> 0x009c }
            android.content.ContentValues r2 = r10.A00(r2, r8, r0)     // Catch:{ all -> 0x009c }
            X.0tg r1 = r5.A02     // Catch:{ all -> 0x009c }
            java.lang.String r0 = "message_quoted"
            r1.A05(r2, r0)     // Catch:{ all -> 0x009c }
            r10.A05(r11, r3)     // Catch:{ all -> 0x009c }
        L_0x003a:
            boolean r0 = r8 instanceof X.C30591cd     // Catch:{ all -> 0x009c }
            if (r0 == 0) goto L_0x0095
            X.17z r6 = r10.A0I     // Catch:{ all -> 0x009c }
            X.1cd r8 = (X.C30591cd) r8     // Catch:{ all -> 0x009c }
            long r3 = r11.A13     // Catch:{ all -> 0x009c }
            r7 = 1
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            r1 = 0
            if (r0 <= 0) goto L_0x004d
            r1 = 1
        L_0x004d:
            java.lang.String r0 = "TemplateMessageStore/fillQuotedTemplateData/parent message row must be set"
            X.AnonymousClass00B.A0C(r0, r1)     // Catch:{ all -> 0x009c }
            X.0tq r0 = r6.A01     // Catch:{ all -> 0x009c }
            X.0tf r6 = r0.A02()     // Catch:{ all -> 0x009c }
            X.1cf r2 = r8.AGV()     // Catch:{ all -> 0x008d }
            r0 = 3
            android.content.ContentValues r8 = new android.content.ContentValues     // Catch:{ all -> 0x008d }
            r8.<init>(r0)     // Catch:{ all -> 0x008d }
            java.lang.Long r1 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x008d }
            java.lang.String r0 = "message_row_id"
            r8.put(r0, r1)     // Catch:{ all -> 0x008d }
            java.lang.String r1 = r2.A02     // Catch:{ all -> 0x008d }
            java.lang.String r0 = "content_text_data"
            r8.put(r0, r1)     // Catch:{ all -> 0x008d }
            java.lang.String r1 = r2.A03     // Catch:{ all -> 0x008d }
            java.lang.String r0 = "footer_text_data"
            r8.put(r0, r1)     // Catch:{ all -> 0x008d }
            X.0tg r2 = r6.A02     // Catch:{ all -> 0x008d }
            java.lang.String r1 = "message_template_quoted"
            r0 = 5
            long r1 = r2.A06(r8, r1, r0)     // Catch:{ all -> 0x008d }
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0087
            r7 = 0
        L_0x0087:
            java.lang.String r0 = "TemplateMessageStore/insertOrUpdateTemplateQuotedData/inserted row should have same row_id"
            X.AnonymousClass00B.A0D(r0, r7)     // Catch:{ all -> 0x008d }
            goto L_0x0092
        L_0x008d:
            r0 = move-exception
            r6.close()     // Catch:{ all -> 0x0091 }
        L_0x0091:
            throw r0     // Catch:{ all -> 0x009c }
        L_0x0092:
            r6.close()     // Catch:{ all -> 0x009c }
        L_0x0095:
            r9.A00()     // Catch:{ all -> 0x009c }
            r9.close()     // Catch:{ all -> 0x00a1 }
            goto L_0x00a6
        L_0x009c:
            r0 = move-exception
            r9.close()     // Catch:{ all -> 0x00a0 }
        L_0x00a0:
            throw r0     // Catch:{ all -> 0x00a1 }
        L_0x00a1:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x00a5 }
        L_0x00a5:
            throw r0
        L_0x00a6:
            r5.close()
        L_0x00a9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C223617q.A01(X.0tZ):void");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x00a4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(X.C16740tZ r14) {
        /*
            r13 = this;
            X.0tZ r6 = r14.A0D()
            if (r6 == 0) goto L_0x00b8
            int r3 = r6.A08()
            r5 = 0
            r2 = 1
            r1 = 2
            r0 = 0
            if (r3 != r1) goto L_0x0011
            r0 = 1
        L_0x0011:
            X.AnonymousClass00B.A0G(r0)
            X.0tq r0 = r13.A0C
            X.0tf r4 = r0.A02()
            X.1cj r12 = r4.A00()     // Catch:{ all -> 0x00a5 }
            android.content.ContentValues r8 = new android.content.ContentValues     // Catch:{ all -> 0x00a0 }
            r8.<init>()     // Catch:{ all -> 0x00a0 }
            X.0sc r10 = r13.A01     // Catch:{ all -> 0x00a0 }
            X.1Vw r7 = r14.A11     // Catch:{ all -> 0x00a0 }
            X.0rv r9 = r7.A00     // Catch:{ all -> 0x00a0 }
            X.1Vw r0 = r6.A11     // Catch:{ all -> 0x00a0 }
            X.0rv r3 = r0.A00     // Catch:{ all -> 0x00a0 }
            if (r3 == 0) goto L_0x0031
            r9 = r3
            goto L_0x0038
        L_0x0031:
            boolean r1 = r9 instanceof com.whatsapp.jid.UserJid     // Catch:{ all -> 0x00a0 }
            java.lang.String r0 = "Quoted message chatJid is not specified, parentJid is not a UserJid."
            X.AnonymousClass00B.A0B(r0, r1)     // Catch:{ all -> 0x00a0 }
        L_0x0038:
            X.AnonymousClass00B.A06(r9)     // Catch:{ all -> 0x00a0 }
            java.lang.String r1 = r9.getRawString()     // Catch:{ all -> 0x00a0 }
            java.lang.String r0 = "key_remote_jid"
            r8.put(r0, r1)     // Catch:{ all -> 0x00a0 }
            X.C38611r4.A01(r8, r10, r6)     // Catch:{ all -> 0x00a0 }
            X.0tg r1 = r4.A02     // Catch:{ all -> 0x00a0 }
            java.lang.String r0 = "messages_quotes"
            long r0 = r1.A02(r8, r0)     // Catch:{ all -> 0x00a0 }
            r14.A0F = r0     // Catch:{ all -> 0x00a0 }
            r10 = 0
            int r8 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r8 > 0) goto L_0x007b
            X.0so r9 = r13.A00     // Catch:{ all -> 0x00a0 }
            java.lang.String r8 = "QuotedMessageStore/insertQuotedMessageInOldTable/Error"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a0 }
            r1.<init>()     // Catch:{ all -> 0x00a0 }
            java.lang.String r0 = "quoted message type : "
            r1.append(r0)     // Catch:{ all -> 0x00a0 }
            byte r0 = r6.A10     // Catch:{ all -> 0x00a0 }
            r1.append(r0)     // Catch:{ all -> 0x00a0 }
            java.lang.String r0 = " ,parent message type: "
            r1.append(r0)     // Catch:{ all -> 0x00a0 }
            byte r0 = r14.A10     // Catch:{ all -> 0x00a0 }
            r1.append(r0)     // Catch:{ all -> 0x00a0 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00a0 }
            r9.AcB(r8, r0, r2)     // Catch:{ all -> 0x00a0 }
        L_0x007b:
            long r1 = r14.A0F     // Catch:{ all -> 0x00a0 }
            int r0 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r0 <= 0) goto L_0x0082
            r5 = 1
        L_0x0082:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a0 }
            r1.<init>()     // Catch:{ all -> 0x00a0 }
            java.lang.String r0 = "QuotedMessageStore/insertQuotedMessageInOldTable/Error insert quoted message; parentMsg.key="
            r1.append(r0)     // Catch:{ all -> 0x00a0 }
            r1.append(r7)     // Catch:{ all -> 0x00a0 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00a0 }
            X.AnonymousClass00B.A0D(r0, r5)     // Catch:{ all -> 0x00a0 }
            r13.A03(r14)     // Catch:{ all -> 0x00a0 }
            r12.A00()     // Catch:{ all -> 0x00a0 }
            r12.close()     // Catch:{ all -> 0x00a5 }
            goto L_0x00aa
        L_0x00a0:
            r0 = move-exception
            r12.close()     // Catch:{ all -> 0x00a4 }
        L_0x00a4:
            throw r0     // Catch:{ all -> 0x00a5 }
        L_0x00a5:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x00a9 }
        L_0x00a9:
            throw r0
        L_0x00aa:
            r4.close()
            boolean r0 = r6 instanceof X.C38651rC
            if (r0 == 0) goto L_0x00b8
            if (r3 == 0) goto L_0x00b8
            X.0ts r0 = r13.A03
            r0.A02(r3)
        L_0x00b8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C223617q.A02(X.0tZ):void");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0089 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(X.C16740tZ r11) {
        /*
            r10 = this;
            X.0tZ r0 = r11.A0D()
            boolean r1 = r0 instanceof X.C39021rn
            if (r1 == 0) goto L_0x009c
            X.17l r5 = r10.A0D
            long r1 = r11.A0F
            r7 = 1
            r8 = 0
            int r4 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            r3 = 0
            if (r4 <= 0) goto L_0x0015
            r3 = 1
        L_0x0015:
            java.lang.String r2 = "OrderMessageStore/insertOrUpdateQuotedOrderMessageLegacy/message must have quoted_row_id set; key="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r2)
            X.1Vw r6 = r11.A11
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            X.AnonymousClass00B.A0C(r1, r3)
            X.0tZ r4 = r11.A0D()
            boolean r3 = r4 instanceof X.C39021rn
            java.lang.String r2 = "OrderMessageStore/insertOrUpdateQuotedOrderMessageLegacy/message must be a order message; key="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r2)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            X.AnonymousClass00B.A0C(r1, r3)
            int r2 = r4.A08()
            r1 = 2
            r3 = 0
            if (r2 != r1) goto L_0x0048
            r3 = 1
        L_0x0048:
            java.lang.String r1 = "OrderMessageStore/insertOrUpdateQuotedOrderMessageLegacy/message in main storage; key="
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            X.1Vw r1 = r4.A11
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            X.AnonymousClass00B.A0C(r1, r3)
            X.0tq r1 = r5.A01     // Catch:{ SQLiteConstraintException -> 0x008a }
            X.0tf r6 = r1.A02()     // Catch:{ SQLiteConstraintException -> 0x008a }
            android.content.ContentValues r3 = new android.content.ContentValues     // Catch:{ all -> 0x0085 }
            r3.<init>()     // Catch:{ all -> 0x0085 }
            long r1 = r11.A0F     // Catch:{ all -> 0x0085 }
            X.1rn r4 = (X.C39021rn) r4     // Catch:{ all -> 0x0085 }
            r5.A00(r3, r4, r1)     // Catch:{ all -> 0x0085 }
            X.0tg r2 = r6.A02     // Catch:{ all -> 0x0085 }
            java.lang.String r1 = "quoted_message_order"
            long r4 = r2.A03(r3, r1)     // Catch:{ all -> 0x0085 }
            long r2 = r11.A0F     // Catch:{ all -> 0x0085 }
            int r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r1 == 0) goto L_0x007c
            r7 = 0
        L_0x007c:
            java.lang.String r1 = "OrderMessageStore/insertOrUpdateQuotedOrderMessageLegacy/inserted row should have same row_id"
            X.AnonymousClass00B.A0D(r1, r7)     // Catch:{ all -> 0x0085 }
            r6.close()     // Catch:{ SQLiteConstraintException -> 0x008a }
            goto L_0x009c
        L_0x0085:
            r1 = move-exception
            r6.close()     // Catch:{ all -> 0x0089 }
        L_0x0089:
            throw r1     // Catch:{ SQLiteConstraintException -> 0x008a }
        L_0x008a:
            r3 = move-exception
            java.lang.String r2 = "OrderMessageStore/insertOrUpdateQuotedOrderMessageLegacy/fail to insert. Error message is: "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r1)
        L_0x009c:
            boolean r1 = r0 instanceof X.C38891ra
            if (r1 == 0) goto L_0x011d
            X.17u r8 = r10.A0G
            long r1 = r11.A0F
            r7 = 1
            r5 = 0
            int r4 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            r3 = 0
            if (r4 <= 0) goto L_0x00ad
            r3 = 1
        L_0x00ad:
            java.lang.String r2 = "ProductMessageStore/insertOrUpdateQuotedProductMessageLegacy/message must have quoted_row_id set; key="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r2)
            X.1Vw r4 = r11.A11
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            X.AnonymousClass00B.A0C(r1, r3)
            X.0tZ r5 = r11.A0D()
            boolean r3 = r5 instanceof X.C38891ra
            java.lang.String r2 = "ProductMessageStore/insertOrUpdateQuotedProductMessageLegacy/message must be a product message; key="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            X.AnonymousClass00B.A0C(r1, r3)
            int r2 = r5.A08()
            r1 = 2
            r3 = 0
            if (r2 != r1) goto L_0x00e0
            r3 = 1
        L_0x00e0:
            java.lang.String r1 = "ProductMessageStore/insertOrUpdateQuotedProductMessageLegacy/message in main storage; key="
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            X.1Vw r1 = r5.A11
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            X.AnonymousClass00B.A0C(r1, r3)
            X.0tq r1 = r8.A02
            X.0tf r6 = r1.A02()
            android.content.ContentValues r4 = new android.content.ContentValues     // Catch:{ all -> 0x019c }
            r4.<init>()     // Catch:{ all -> 0x019c }
            X.1ra r5 = (X.C38891ra) r5     // Catch:{ all -> 0x019c }
            long r1 = r11.A0F     // Catch:{ all -> 0x019c }
            r8.A00(r4, r5, r1)     // Catch:{ all -> 0x019c }
            X.0tg r3 = r6.A02     // Catch:{ all -> 0x019c }
            java.lang.String r2 = "quoted_message_product"
            r1 = 5
            long r4 = r3.A06(r4, r2, r1)     // Catch:{ all -> 0x019c }
            long r2 = r11.A0F     // Catch:{ all -> 0x019c }
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 == 0) goto L_0x0115
            r7 = 0
        L_0x0115:
            java.lang.String r1 = "ProductMessageStore/insertOrUpdateQuotedProductMessage/inserted row should have same row_id"
            X.AnonymousClass00B.A0D(r1, r7)     // Catch:{ all -> 0x019c }
            r6.close()
        L_0x011d:
            boolean r1 = r0 instanceof X.C38981rj
            if (r1 == 0) goto L_0x01a4
            X.17t r8 = r10.A02
            long r1 = r11.A0F
            r7 = 1
            r5 = 0
            int r4 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            r3 = 0
            if (r4 <= 0) goto L_0x012e
            r3 = 1
        L_0x012e:
            java.lang.String r2 = "CatalogMessageStore/insertOrUpdateQuotedCatalogMessageLegacy/message must have quoted_row_id set; key="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r2)
            X.1Vw r4 = r11.A11
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            X.AnonymousClass00B.A0C(r1, r3)
            X.0tZ r5 = r11.A0D()
            boolean r3 = r5 instanceof X.C38981rj
            java.lang.String r2 = "CatalogMessageStore/insertOrUpdateQuotedCatalogMessageLegacy/message must be a catalog message; key="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            X.AnonymousClass00B.A0C(r1, r3)
            int r2 = r5.A08()
            r1 = 2
            r3 = 0
            if (r2 != r1) goto L_0x0161
            r3 = 1
        L_0x0161:
            java.lang.String r1 = "CatalogMessageStore/insertOrUpdateQuotedCatalogMessageLegacy/message in main storage; key="
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            X.1Vw r1 = r5.A11
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            X.AnonymousClass00B.A0C(r1, r3)
            X.0tq r1 = r8.A01
            X.0tf r6 = r1.A02()
            android.content.ContentValues r4 = new android.content.ContentValues     // Catch:{ all -> 0x019c }
            r4.<init>()     // Catch:{ all -> 0x019c }
            X.1rj r5 = (X.C38981rj) r5     // Catch:{ all -> 0x019c }
            long r1 = r11.A0F     // Catch:{ all -> 0x019c }
            r8.A00(r4, r5, r1)     // Catch:{ all -> 0x019c }
            X.0tg r3 = r6.A02     // Catch:{ all -> 0x019c }
            java.lang.String r2 = "quoted_message_product"
            r1 = 5
            long r4 = r3.A06(r4, r2, r1)     // Catch:{ all -> 0x019c }
            long r2 = r11.A0F     // Catch:{ all -> 0x019c }
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 == 0) goto L_0x0196
            r7 = 0
        L_0x0196:
            java.lang.String r1 = "CatalogMessageStore/insertOrUpdateQuotedCatalogMessageLegacy/inserted row should have same row_id"
            X.AnonymousClass00B.A0D(r1, r7)     // Catch:{ all -> 0x019c }
            goto L_0x01a1
        L_0x019c:
            r0 = move-exception
            r6.close()     // Catch:{ all -> 0x01c6 }
            throw r0
        L_0x01a1:
            r6.close()
        L_0x01a4:
            boolean r1 = r0 instanceof X.C30071bh
            if (r1 == 0) goto L_0x01ca
            X.185 r6 = r10.A04
            r4 = r0
            X.1bh r4 = (X.C30071bh) r4
            long r1 = r11.A0F
            X.0tq r3 = r6.A02
            X.0tf r5 = r3.A02()
            android.content.ContentValues r4 = r6.A02(r4, r1)     // Catch:{ all -> 0x01c2 }
            X.0tg r3 = r5.A02     // Catch:{ all -> 0x01c2 }
            java.lang.String r2 = "message_quoted_group_invite_legacy"
            r1 = 5
            r3.A06(r4, r2, r1)     // Catch:{ all -> 0x01c2 }
            goto L_0x01c7
        L_0x01c2:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x01c6 }
        L_0x01c6:
            throw r0
        L_0x01c7:
            r5.close()
        L_0x01ca:
            boolean r1 = r0 instanceof X.C16840tj
            if (r1 == 0) goto L_0x01d8
            X.0vM r4 = r10.A05
            r3 = r0
            X.0tj r3 = (X.C16840tj) r3
            long r1 = r11.A0F
            r4.A0H(r3, r1)
        L_0x01d8:
            boolean r1 = r0 instanceof X.C39041rp
            if (r1 == 0) goto L_0x01f9
            X.0vM r4 = r10.A05
            r3 = r0
            X.1rp r3 = (X.C39041rp) r3
            long r8 = r11.A0F
            java.lang.String r6 = "message_quoted_ui_elements_reply_legacy"
            android.content.ContentValues r5 = r4.A06(r3)
            java.lang.Long r2 = java.lang.Long.valueOf(r8)
            java.lang.String r1 = "message_row_id"
            r5.put(r1, r2)
            int r7 = r4.A05(r3)
            r4.A07(r5, r6, r7, r8)
        L_0x01f9:
            boolean r1 = r0 instanceof X.C39051rq
            if (r1 == 0) goto L_0x0209
            X.0vM r5 = r10.A05
            r4 = r0
            X.1rq r4 = (X.C39051rq) r4
            long r2 = r11.A0F
            java.lang.String r1 = "message_quoted_ui_elements_reply_legacy"
            r5.A0C(r4, r1, r2)
        L_0x0209:
            boolean r1 = r0 instanceof X.C39061rr
            if (r1 == 0) goto L_0x021d
            X.187 r2 = r10.A0E
            r1 = r0
            X.1rr r1 = (X.C39061rr) r1
            long r5 = r11.A0F
            int r4 = r1.A00
            long r7 = r1.A01
            java.lang.String r3 = "messages_quotes_payment_invite_legacy"
            r2.A01(r3, r4, r5, r7)
        L_0x021d:
            if (r0 == 0) goto L_0x0234
            boolean r1 = r0.A0x()
            if (r1 == 0) goto L_0x0234
            X.0vM r4 = r10.A05
            X.1sA r0 = r0.A0E()
            X.1sB r3 = r0.A00
            long r1 = r11.A0F
            java.lang.String r0 = "message_quoted_ui_elements"
            r4.A09(r3, r0, r1)
        L_0x0234:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C223617q.A03(X.0tZ):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00c3, code lost:
        if (r1 == null) goto L_0x00c5;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00fe */
    /* JADX WARNING: Missing exception handler attribute for start block: B:46:0x0103 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04(X.C16740tZ r19, long r20) {
        /*
            r18 = this;
            r4 = r19
            r6 = r18
            X.0tq r0 = r6.A0C
            X.0tf r17 = r0.get()
            boolean r0 = r4 instanceof X.C16730tY     // Catch:{ all -> 0x0170 }
            if (r0 == 0) goto L_0x0023
            X.17I r3 = r6.A09     // Catch:{ all -> 0x0170 }
            r0 = r4
            X.0tY r0 = (X.C16730tY) r0     // Catch:{ all -> 0x0170 }
            X.0ta r2 = r0.A02     // Catch:{ all -> 0x0170 }
            if (r2 == 0) goto L_0x0023
            java.io.File r1 = r2.A0F     // Catch:{ all -> 0x0170 }
            if (r1 == 0) goto L_0x0023
            X.0sc r0 = r3.A00     // Catch:{ all -> 0x0170 }
            java.io.File r0 = r0.A06(r1)     // Catch:{ all -> 0x0170 }
            r2.A0F = r0     // Catch:{ all -> 0x0170 }
        L_0x0023:
            boolean r0 = r4 instanceof X.C38891ra     // Catch:{ all -> 0x0170 }
            if (r0 == 0) goto L_0x0031
            X.17u r2 = r6.A0G     // Catch:{ all -> 0x0170 }
            r1 = r4
            X.1ra r1 = (X.C38891ra) r1     // Catch:{ all -> 0x0170 }
            java.lang.String r0 = "SELECT message_row_id, business_owner_jid, product_id, title, description, currency_code, amount_1000, retailer_id, url, product_image_count, sale_amount_1000, body, footer FROM quoted_message_product WHERE message_row_id = ?"
            r2.A02(r1, r0)     // Catch:{ all -> 0x0170 }
        L_0x0031:
            boolean r0 = r4 instanceof X.C38981rj     // Catch:{ all -> 0x0170 }
            if (r0 == 0) goto L_0x003f
            X.17t r2 = r6.A02     // Catch:{ all -> 0x0170 }
            r1 = r4
            X.1rj r1 = (X.C38981rj) r1     // Catch:{ all -> 0x0170 }
            java.lang.String r0 = "SELECT message_row_id, business_owner_jid, title, description FROM quoted_message_product WHERE message_row_id = ?"
            r2.A02(r1, r0)     // Catch:{ all -> 0x0170 }
        L_0x003f:
            boolean r0 = r4 instanceof X.C30071bh     // Catch:{ all -> 0x0170 }
            if (r0 == 0) goto L_0x0107
            X.185 r14 = r6.A04     // Catch:{ all -> 0x0170 }
            r11 = r4
            X.1bh r11 = (X.C30071bh) r11     // Catch:{ all -> 0x0170 }
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x0170 }
            long r0 = r11.A13     // Catch:{ all -> 0x0170 }
            java.lang.String r1 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x0170 }
            r0 = 0
            r2[r0] = r1     // Catch:{ all -> 0x0170 }
            X.0tq r0 = r14.A02     // Catch:{ all -> 0x0170 }
            X.0tf r5 = r0.get()     // Catch:{ all -> 0x0170 }
            X.0tg r1 = r5.A02     // Catch:{ all -> 0x00ff }
            java.lang.String r0 = "SELECT group_jid_row_id, admin_jid_row_id, group_name, invite_code, expiration, expired, group_type FROM message_quoted_group_invite_legacy WHERE message_row_id = ?"
            android.database.Cursor r9 = r1.A08(r0, r2)     // Catch:{ all -> 0x00ff }
            boolean r0 = r9.moveToNext()     // Catch:{ all -> 0x00f8 }
            if (r0 == 0) goto L_0x00df
            java.lang.String r0 = "expiration"
            int r0 = r9.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00f8 }
            long r7 = r9.getLong(r0)     // Catch:{ all -> 0x00f8 }
            java.lang.String r0 = "group_jid_row_id"
            int r0 = r9.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00f8 }
            long r2 = r9.getLong(r0)     // Catch:{ all -> 0x00f8 }
            java.lang.String r0 = "admin_jid_row_id"
            int r0 = r9.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00f8 }
            long r0 = r9.getLong(r0)     // Catch:{ all -> 0x00f8 }
            java.lang.String r10 = "group_name"
            int r10 = r9.getColumnIndexOrThrow(r10)     // Catch:{ all -> 0x00f8 }
            java.lang.String r13 = r9.getString(r10)     // Catch:{ all -> 0x00f8 }
            java.lang.String r10 = "invite_code"
            int r10 = r9.getColumnIndexOrThrow(r10)     // Catch:{ all -> 0x00f8 }
            java.lang.String r12 = r9.getString(r10)     // Catch:{ all -> 0x00f8 }
            java.lang.String r10 = "expired"
            int r10 = r9.getColumnIndexOrThrow(r10)     // Catch:{ all -> 0x00f8 }
            int r16 = r9.getInt(r10)     // Catch:{ all -> 0x00f8 }
            java.lang.String r10 = "group_type"
            int r10 = r9.getColumnIndexOrThrow(r10)     // Catch:{ all -> 0x00f8 }
            int r10 = r9.getInt(r10)     // Catch:{ all -> 0x00f8 }
            X.14v r14 = r14.A01     // Catch:{ all -> 0x00f8 }
            java.lang.Class<X.0sL> r15 = X.C16050sL.class
            com.whatsapp.jid.Jid r2 = r14.A07(r15, r2)     // Catch:{ all -> 0x00f8 }
            X.0sL r2 = (X.C16050sL) r2     // Catch:{ all -> 0x00f8 }
            java.lang.Class<com.whatsapp.jid.UserJid> r3 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r1 = r14.A07(r3, r0)     // Catch:{ all -> 0x00f8 }
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1     // Catch:{ all -> 0x00f8 }
            if (r2 == 0) goto L_0x00c5
            r0 = 1
            if (r1 != 0) goto L_0x00c6
        L_0x00c5:
            r0 = 0
        L_0x00c6:
            X.AnonymousClass00B.A0G(r0)     // Catch:{ all -> 0x00f8 }
            r0 = 0
            if (r16 == 0) goto L_0x00cd
            r0 = 1
        L_0x00cd:
            r11.A02 = r2     // Catch:{ all -> 0x00f8 }
            r11.A03 = r1     // Catch:{ all -> 0x00f8 }
            r11.A05 = r13     // Catch:{ all -> 0x00f8 }
            r11.A06 = r12     // Catch:{ all -> 0x00f8 }
            r11.A01 = r7     // Catch:{ all -> 0x00f8 }
            r11.A07 = r0     // Catch:{ all -> 0x00f8 }
            r11.A00 = r10     // Catch:{ all -> 0x00f8 }
            r9.close()     // Catch:{ all -> 0x00ff }
            goto L_0x0104
        L_0x00df:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f8 }
            r2.<init>()     // Catch:{ all -> 0x00f8 }
            java.lang.String r0 = "GroupInviteMessageStore/fillQuotedGroupInviteInfoLegacy/missing group invite info for quoted message; rowId="
            r2.append(r0)     // Catch:{ all -> 0x00f8 }
            long r0 = r11.A13     // Catch:{ all -> 0x00f8 }
            r2.append(r0)     // Catch:{ all -> 0x00f8 }
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x00f8 }
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x00f8 }
            r0.<init>(r1)     // Catch:{ all -> 0x00f8 }
            throw r0     // Catch:{ all -> 0x00f8 }
        L_0x00f8:
            r0 = move-exception
            if (r9 == 0) goto L_0x00fe
            r9.close()     // Catch:{ all -> 0x00fe }
        L_0x00fe:
            throw r0     // Catch:{ all -> 0x00ff }
        L_0x00ff:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x0103 }
        L_0x0103:
            throw r0     // Catch:{ all -> 0x0170 }
        L_0x0104:
            r5.close()     // Catch:{ all -> 0x0170 }
        L_0x0107:
            boolean r0 = r4 instanceof X.C39021rn     // Catch:{ all -> 0x0170 }
            if (r0 == 0) goto L_0x0116
            X.17l r3 = r6.A0D     // Catch:{ all -> 0x0170 }
            r2 = r4
            X.1rn r2 = (X.C39021rn) r2     // Catch:{ all -> 0x0170 }
            java.lang.String r1 = "SELECT message_row_id, order_id, thumbnail, order_title, item_count, status, surface, message, seller_jid, token, currency_code,total_amount_1000 FROM quoted_message_order WHERE message_row_id=?"
            r0 = 1
            r3.A03(r2, r1, r0)     // Catch:{ all -> 0x0170 }
        L_0x0116:
            boolean r0 = r4 instanceof X.C30591cd     // Catch:{ all -> 0x0170 }
            if (r0 == 0) goto L_0x0124
            X.17z r1 = r6.A0I     // Catch:{ all -> 0x0170 }
            r0 = r4
            X.1cd r0 = (X.C30591cd) r0     // Catch:{ all -> 0x0170 }
            r2 = r20
            r1.A03(r0, r2)     // Catch:{ all -> 0x0170 }
        L_0x0124:
            boolean r0 = r4.A0x()     // Catch:{ all -> 0x0170 }
            if (r0 == 0) goto L_0x0133
            X.0vM r3 = r6.A05     // Catch:{ all -> 0x0170 }
            long r1 = r4.A13     // Catch:{ all -> 0x0170 }
            java.lang.String r0 = "SELECT element_type, element_content FROM message_quoted_ui_elements WHERE message_row_id = ?"
            r3.A08(r4, r0, r1)     // Catch:{ all -> 0x0170 }
        L_0x0133:
            boolean r0 = r4 instanceof X.C16840tj     // Catch:{ all -> 0x0170 }
            if (r0 == 0) goto L_0x0143
            X.0vM r5 = r6.A05     // Catch:{ all -> 0x0170 }
            r3 = r4
            X.0tj r3 = (X.C16840tj) r3     // Catch:{ all -> 0x0170 }
            long r1 = r4.A13     // Catch:{ all -> 0x0170 }
            java.lang.String r0 = "SELECT element_type, element_content FROM message_quoted_ui_elements WHERE message_row_id = ?"
            r5.A0I(r3, r0, r1)     // Catch:{ all -> 0x0170 }
        L_0x0143:
            boolean r0 = r4 instanceof X.C39061rr     // Catch:{ all -> 0x0170 }
            if (r0 == 0) goto L_0x0151
            X.187 r2 = r6.A0E     // Catch:{ all -> 0x0170 }
            r1 = r4
            X.1rr r1 = (X.C39061rr) r1     // Catch:{ all -> 0x0170 }
            java.lang.String r0 = "SELECT message_row_id, service, expiration_timestamp FROM messages_quotes_payment_invite_legacy WHERE message_row_id = ?"
            r2.A00(r1, r0)     // Catch:{ all -> 0x0170 }
        L_0x0151:
            boolean r0 = r4 instanceof X.C39041rp     // Catch:{ all -> 0x0170 }
            if (r0 == 0) goto L_0x015f
            X.0vM r2 = r6.A05     // Catch:{ all -> 0x0170 }
            r1 = r4
            X.1rp r1 = (X.C39041rp) r1     // Catch:{ all -> 0x0170 }
            java.lang.String r0 = "SELECT message_row_id, element_type, reply_values, reply_description FROM message_quoted_ui_elements_reply_legacy WHERE message_row_id=?"
            r2.A0F(r1, r0)     // Catch:{ all -> 0x0170 }
        L_0x015f:
            boolean r0 = r4 instanceof X.C39051rq     // Catch:{ all -> 0x0170 }
            if (r0 == 0) goto L_0x016c
            X.0vM r1 = r6.A05     // Catch:{ all -> 0x0170 }
            X.1rq r4 = (X.C39051rq) r4     // Catch:{ all -> 0x0170 }
            java.lang.String r0 = "SELECT message_row_id, element_type, reply_values, reply_description FROM message_quoted_ui_elements_reply_legacy WHERE message_row_id=?"
            r1.A0B(r4, r0)     // Catch:{ all -> 0x0170 }
        L_0x016c:
            r17.close()
            return
        L_0x0170:
            r0 = move-exception
            r17.close()     // Catch:{ all -> 0x0174 }
        L_0x0174:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C223617q.A04(X.0tZ, long):void");
    }

    public final void A05(C16740tZ r13, boolean z2) {
        AnonymousClass00B.A0G(A06());
        C16740tZ A0D2 = r13.A0D();
        if (A0D2 instanceof C30901d9) {
            this.A07.A01((C30901d9) A0D2, r13.A13);
        }
        if (A0D2 instanceof C16730tY) {
            this.A09.A08((C16730tY) A0D2, r13.A13);
        }
        if (A0D2 instanceof C38891ra) {
            this.A0G.A01((C38891ra) A0D2, r13.A13);
        }
        if (A0D2 instanceof C38981rj) {
            this.A02.A01((C38981rj) A0D2, r13.A13);
        }
        if (A0D2 instanceof C30071bh) {
            this.A04.A04((C30071bh) A0D2, r13.A13);
        }
        if (A0D2 instanceof C39021rn) {
            this.A0D.A02((C39021rn) A0D2, r13.A13);
        }
        if (A0D2 instanceof C16840tj) {
            this.A05.A0H((C16840tj) A0D2, r13.A13);
        }
        if (A0D2 instanceof C39041rp) {
            this.A05.A0E((C39041rp) A0D2, r13.A13);
        }
        if (A0D2 instanceof C39051rq) {
            this.A05.A0C((C39051rq) A0D2, "message_quoted_ui_elements_reply", r13.A13);
        }
        if (A0D2 != null) {
            if (A0D2.A0y()) {
                this.A0A.A01(A0D2, r13.A13);
            }
            if (A0D2.A0x()) {
                this.A05.A09(A0D2.A0E().A00, "message_quoted_ui_elements", r13.A13);
            }
        }
        if (A0D2 instanceof C38741rL) {
            C223217m r5 = this.A0K;
            long j2 = r13.A13;
            String A12 = ((C38741rL) A0D2).A12();
            if (!TextUtils.isEmpty(A12)) {
                r5.A06(A12, j2);
            }
        } else if (A0D2 instanceof C38811rS) {
            this.A0K.A04((C38811rS) A0D2, r13.A13);
        }
        if (A0D2 instanceof C30581cc) {
            this.A0J.A00(A0D2, r13.A13, z2);
        }
        if (A0D2 instanceof C39061rr) {
            C39061rr r0 = (C39061rr) A0D2;
            this.A0E.A01("message_quoted_payment_invite", r0.A00, r13.A13, r0.A01);
        }
        if (A0D2 instanceof C38651rC) {
            this.A0L.A00((C38651rC) A0D2, r13.A13);
        }
    }

    public boolean A06() {
        return this.A0H.A01("quoted_message_ready", 0) == 2;
    }
}
