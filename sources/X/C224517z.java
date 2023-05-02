package X;

import android.content.ContentValues;

/* renamed from: X.17z  reason: invalid class name and case insensitive filesystem */
public class C224517z {
    public final C16300so A00;
    public final C16900tq A01;

    public C224517z(C16300so r1, C16900tq r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public static final ContentValues A00(C39731sy r3, long j2) {
        ContentValues contentValues = new ContentValues(6);
        contentValues.put("message_row_id", Long.valueOf(j2));
        contentValues.put("text_data", r3.A04);
        contentValues.put("extra_data", r3.A05);
        contentValues.put("button_type", Integer.valueOf(r3.A03));
        contentValues.put("used", Integer.valueOf(r3.A01 ? 1 : 0));
        contentValues.put("selected_index", Integer.valueOf(r3.A02));
        contentValues.put("otp_button_type", Integer.valueOf(r3.A06.get()));
        return contentValues;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:42:0x013d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(X.C16740tZ r30) {
        /*
            r29 = this;
            r0 = r30
            boolean r2 = r0 instanceof X.C30591cd
            java.lang.String r1 = "TemplateMessageStore/fillTemplateData/message needs to be FMessageTemplate."
            X.AnonymousClass00B.A0C(r1, r2)
            long r1 = r0.A13
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r10 = r29
            X.0tq r3 = r10.A01
            X.0tf r14 = r3.get()
            X.0tg r3 = r14.A02     // Catch:{ all -> 0x013e }
            java.lang.String r9 = "SELECT content_text_data, footer_text_data, template_id, csat_trigger_expiration_ts, category FROM message_template WHERE message_row_id = ?"
            r6 = 1
            java.lang.String[] r5 = new java.lang.String[r6]     // Catch:{ all -> 0x013e }
            java.lang.String r8 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x013e }
            r7 = 0
            r5[r7] = r8     // Catch:{ all -> 0x013e }
            android.database.Cursor r5 = r3.A08(r9, r5)     // Catch:{ all -> 0x013e }
            if (r5 == 0) goto L_0x0101
            boolean r1 = r5.moveToFirst()     // Catch:{ all -> 0x0137 }
            if (r1 == 0) goto L_0x0101
            java.lang.String r1 = "content_text_data"
            int r1 = r5.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x0137 }
            java.lang.String r24 = r5.getString(r1)     // Catch:{ all -> 0x0137 }
            java.lang.String r1 = "footer_text_data"
            int r1 = r5.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x0137 }
            java.lang.String r25 = r5.getString(r1)     // Catch:{ all -> 0x0137 }
            java.lang.String r1 = "template_id"
            int r1 = r5.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x0137 }
            java.lang.String r26 = r5.getString(r1)     // Catch:{ all -> 0x0137 }
            java.lang.String r1 = "csat_trigger_expiration_ts"
            int r1 = r5.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x0137 }
            long r15 = r5.getLong(r1)     // Catch:{ all -> 0x0137 }
            java.lang.String r1 = "category"
            int r1 = r5.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x0137 }
            java.lang.String r27 = r5.getString(r1)     // Catch:{ all -> 0x0137 }
            r5.close()     // Catch:{ all -> 0x013e }
            java.lang.String r2 = "SELECT _id, text_data, extra_data, button_type, used, selected_index, otp_button_type FROM message_template_button WHERE message_row_id = ?"
            java.lang.String[] r1 = new java.lang.String[r6]     // Catch:{ all -> 0x013e }
            r1[r7] = r8     // Catch:{ all -> 0x013e }
            android.database.Cursor r5 = r3.A08(r2, r1)     // Catch:{ all -> 0x013e }
            java.lang.String r1 = "_id"
            int r13 = r5.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x0137 }
            java.lang.String r1 = "text_data"
            int r12 = r5.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x0137 }
            java.lang.String r1 = "extra_data"
            int r11 = r5.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x0137 }
            java.lang.String r1 = "button_type"
            int r10 = r5.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x0137 }
            java.lang.String r1 = "used"
            int r9 = r5.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x0137 }
            java.lang.String r1 = "selected_index"
            int r8 = r5.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x0137 }
            java.lang.String r1 = "otp_button_type"
            int r6 = r5.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x0137 }
        L_0x009f:
            boolean r1 = r5.moveToNext()     // Catch:{ all -> 0x0137 }
            if (r1 == 0) goto L_0x00d5
            long r1 = r5.getLong(r13)     // Catch:{ all -> 0x0137 }
            java.lang.String r18 = r5.getString(r12)     // Catch:{ all -> 0x0137 }
            java.lang.String r19 = r5.getString(r11)     // Catch:{ all -> 0x0137 }
            int r20 = r5.getInt(r10)     // Catch:{ all -> 0x0137 }
            int r7 = r5.getInt(r9)     // Catch:{ all -> 0x0137 }
            r3 = 1
            r23 = 0
            if (r7 != r3) goto L_0x00c0
            r23 = 1
        L_0x00c0:
            int r21 = r5.getInt(r8)     // Catch:{ all -> 0x0137 }
            int r22 = r5.getInt(r6)     // Catch:{ all -> 0x0137 }
            X.1sy r3 = new X.1sy     // Catch:{ all -> 0x0137 }
            r17 = r3
            r17.<init>(r18, r19, r20, r21, r22, r23)     // Catch:{ all -> 0x0137 }
            r3.A00 = r1     // Catch:{ all -> 0x0137 }
            r4.add(r3)     // Catch:{ all -> 0x0137 }
            goto L_0x009f
        L_0x00d5:
            r5.close()     // Catch:{ all -> 0x013e }
            r14.close()
            X.AnonymousClass00B.A06(r24)
            int r1 = r4.size()
            if (r1 != 0) goto L_0x00e5
            r4 = 0
        L_0x00e5:
            r2 = 0
            int r1 = (r15 > r2 ? 1 : (r15 == r2 ? 0 : -1))
            if (r1 != 0) goto L_0x00fc
            r23 = 0
        L_0x00ed:
            X.1cf r1 = new X.1cf
            r22 = r1
            r28 = r4
            r22.<init>(r23, r24, r25, r26, r27, r28)
            X.1cd r0 = (X.C30591cd) r0
            r0.Aep(r1)
            return
        L_0x00fc:
            java.lang.Long r23 = java.lang.Long.valueOf(r15)
            goto L_0x00ed
        L_0x0101:
            java.lang.String r1 = "TemplateMessageStore/getTemplateData/no template data in the table."
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ all -> 0x0137 }
            if (r5 == 0) goto L_0x010b
            r5.close()     // Catch:{ all -> 0x013e }
        L_0x010b:
            r14.close()
            r4 = 0
            X.0so r3 = r10.A00
            java.lang.String r1 = "message.key"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            X.1Vw r1 = r0.A11
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            java.lang.String r1 = "TemplateMessageStore/fillTemplateData/template data is missing."
            r3.AcB(r1, r2, r6)
            X.1cd r0 = (X.C30591cd) r0
            java.lang.String r5 = ""
            r7 = r4
            r8 = r4
            r9 = r4
            X.1cf r3 = new X.1cf
            r6 = r4
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r0.Aep(r3)
            return
        L_0x0137:
            r0 = move-exception
            if (r5 == 0) goto L_0x013d
            r5.close()     // Catch:{ all -> 0x013d }
        L_0x013d:
            throw r0     // Catch:{ all -> 0x013e }
        L_0x013e:
            r0 = move-exception
            r14.close()     // Catch:{ all -> 0x0142 }
        L_0x0142:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C224517z.A01(X.0tZ):void");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x00c4 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:40:0x00d3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(X.C16740tZ r17) {
        /*
            r16 = this;
            r12 = r17
            boolean r0 = r12 instanceof X.C30591cd
            if (r0 == 0) goto L_0x00e1
            long r3 = r12.A13
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00d9
            r0 = r16
            X.0tq r11 = r0.A01
            X.0tf r10 = r11.A02()
            X.1cj r15 = r10.A00()     // Catch:{ all -> 0x00d4 }
            r5 = r12
            X.1cd r5 = (X.C30591cd) r5     // Catch:{ all -> 0x00cf }
            X.1cf r2 = r5.AGV()     // Catch:{ all -> 0x00cf }
            r0 = 5
            android.content.ContentValues r3 = new android.content.ContentValues     // Catch:{ all -> 0x00cf }
            r3.<init>(r0)     // Catch:{ all -> 0x00cf }
            java.lang.String r4 = "message_row_id"
            long r0 = r12.A13     // Catch:{ all -> 0x00cf }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x00cf }
            r3.put(r4, r0)     // Catch:{ all -> 0x00cf }
            java.lang.String r1 = "content_text_data"
            java.lang.String r0 = r2.A02     // Catch:{ all -> 0x00cf }
            r3.put(r1, r0)     // Catch:{ all -> 0x00cf }
            java.lang.String r1 = "footer_text_data"
            java.lang.String r0 = r2.A03     // Catch:{ all -> 0x00cf }
            r3.put(r1, r0)     // Catch:{ all -> 0x00cf }
            java.lang.String r1 = "template_id"
            java.lang.String r0 = r2.A04     // Catch:{ all -> 0x00cf }
            r3.put(r1, r0)     // Catch:{ all -> 0x00cf }
            java.lang.String r1 = "csat_trigger_expiration_ts"
            java.lang.Long r0 = r2.A00     // Catch:{ all -> 0x00cf }
            r3.put(r1, r0)     // Catch:{ all -> 0x00cf }
            java.lang.String r1 = "category"
            java.lang.String r0 = r2.A01     // Catch:{ all -> 0x00cf }
            r3.put(r1, r0)     // Catch:{ all -> 0x00cf }
            X.0tg r2 = r10.A02     // Catch:{ all -> 0x00cf }
            java.lang.String r1 = "message_template"
            r0 = 5
            long r3 = r2.A06(r3, r1, r0)     // Catch:{ all -> 0x00cf }
            long r1 = r12.A13     // Catch:{ all -> 0x00cf }
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            r1 = 0
            if (r0 != 0) goto L_0x0067
            r1 = 1
        L_0x0067:
            java.lang.String r0 = "TemplateMessageStore/insertOrUpdateTemplateData/inserted row should have same row_id"
            X.AnonymousClass00B.A0D(r0, r1)     // Catch:{ all -> 0x00cf }
            X.1cf r0 = r5.AGV()     // Catch:{ all -> 0x00cf }
            java.util.List r0 = r0.A05     // Catch:{ all -> 0x00cf }
            if (r0 == 0) goto L_0x00c5
            java.util.Iterator r14 = r0.iterator()     // Catch:{ all -> 0x00cf }
        L_0x0078:
            boolean r0 = r14.hasNext()     // Catch:{ all -> 0x00cf }
            if (r0 == 0) goto L_0x00c5
            java.lang.Object r2 = r14.next()     // Catch:{ all -> 0x00cf }
            X.1sy r2 = (X.C39731sy) r2     // Catch:{ all -> 0x00cf }
            long r0 = r12.A13     // Catch:{ all -> 0x00cf }
            X.0tf r9 = r11.A02()     // Catch:{ all -> 0x00cf }
            android.content.ContentValues r13 = A00(r2, r0)     // Catch:{ all -> 0x00c0 }
            long r6 = r2.A00     // Catch:{ all -> 0x00c0 }
            r3 = -1
            int r0 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x00a1
            X.0tg r1 = r9.A02     // Catch:{ all -> 0x00c0 }
            java.lang.String r0 = "message_template_button"
            long r0 = r1.A02(r13, r0)     // Catch:{ all -> 0x00c0 }
            r2.A00 = r0     // Catch:{ all -> 0x00c0 }
            goto L_0x00bc
        L_0x00a1:
            X.0tg r8 = r9.A02     // Catch:{ all -> 0x00c0 }
            java.lang.String r5 = "message_template_button"
            java.lang.String r4 = "_id = ?"
            r3 = 1
            java.lang.String[] r2 = new java.lang.String[r3]     // Catch:{ all -> 0x00c0 }
            r1 = 0
            java.lang.String r0 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x00c0 }
            r2[r1] = r0     // Catch:{ all -> 0x00c0 }
            int r0 = r8.A00(r5, r13, r4, r2)     // Catch:{ all -> 0x00c0 }
            if (r0 == r3) goto L_0x00bc
            java.lang.String r0 = "TemplateMessageStore/insertOrUpdateTemplateButton/fail to update template button."
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x00c0 }
        L_0x00bc:
            r9.close()     // Catch:{ all -> 0x00cf }
            goto L_0x0078
        L_0x00c0:
            r0 = move-exception
            r9.close()     // Catch:{ all -> 0x00c4 }
        L_0x00c4:
            throw r0     // Catch:{ all -> 0x00cf }
        L_0x00c5:
            r15.A00()     // Catch:{ all -> 0x00cf }
            r15.close()     // Catch:{ all -> 0x00d4 }
            r10.close()
            return
        L_0x00cf:
            r0 = move-exception
            r15.close()     // Catch:{ all -> 0x00d3 }
        L_0x00d3:
            throw r0     // Catch:{ all -> 0x00d4 }
        L_0x00d4:
            r0 = move-exception
            r10.close()     // Catch:{ all -> 0x00d8 }
        L_0x00d8:
            throw r0
        L_0x00d9:
            java.lang.String r1 = "main message part must be inserted before"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x00e1:
            java.lang.String r1 = "message must be template message"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C224517z.A02(X.0tZ):void");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0074 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03(X.C30591cd r10, long r11) {
        /*
            r9 = this;
            r6 = 1
            r5 = 0
            r1 = 0
            int r0 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            r1 = 0
            if (r0 <= 0) goto L_0x000a
            r1 = 1
        L_0x000a:
            java.lang.String r0 = "TemplateMessageStore/fillQuotedTemplateData/parent message row must be set"
            X.AnonymousClass00B.A0C(r0, r1)
            X.0tq r0 = r9.A01
            X.0tf r2 = r0.get()
            X.0tg r4 = r2.A02     // Catch:{ all -> 0x0075 }
            java.lang.String r3 = "SELECT content_text_data, footer_text_data FROM message_template_quoted WHERE message_row_id = ?"
            java.lang.String[] r1 = new java.lang.String[r6]     // Catch:{ all -> 0x0075 }
            java.lang.String r0 = java.lang.String.valueOf(r11)     // Catch:{ all -> 0x0075 }
            r1[r5] = r0     // Catch:{ all -> 0x0075 }
            android.database.Cursor r3 = r4.A08(r3, r1)     // Catch:{ all -> 0x0075 }
            if (r3 == 0) goto L_0x0057
            boolean r0 = r3.moveToFirst()     // Catch:{ all -> 0x006e }
            if (r0 == 0) goto L_0x0057
            java.lang.String r0 = "content_text_data"
            int r0 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x006e }
            java.lang.String r4 = r3.getString(r0)     // Catch:{ all -> 0x006e }
            java.lang.String r0 = "footer_text_data"
            int r0 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x006e }
            java.lang.String r5 = r3.getString(r0)     // Catch:{ all -> 0x006e }
            r3.close()     // Catch:{ all -> 0x0075 }
            r2.close()
            X.AnonymousClass00B.A06(r4)
            r3 = 0
            r7 = r3
            r8 = r3
            X.1cf r2 = new X.1cf
            r6 = r3
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r10.Aep(r2)
            return
        L_0x0057:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x006e }
            r1.<init>()     // Catch:{ all -> 0x006e }
            java.lang.String r0 = "TemplateMessageStore/fillQuotedTemplateData/missing template info for quoted message; rowId="
            r1.append(r0)     // Catch:{ all -> 0x006e }
            r1.append(r11)     // Catch:{ all -> 0x006e }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x006e }
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x006e }
            r0.<init>(r1)     // Catch:{ all -> 0x006e }
            throw r0     // Catch:{ all -> 0x006e }
        L_0x006e:
            r0 = move-exception
            if (r3 == 0) goto L_0x0074
            r3.close()     // Catch:{ all -> 0x0074 }
        L_0x0074:
            throw r0     // Catch:{ all -> 0x0075 }
        L_0x0075:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0079 }
        L_0x0079:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C224517z.A03(X.1cd, long):void");
    }
}
