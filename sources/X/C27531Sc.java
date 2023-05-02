package X;

import android.database.Cursor;
import com.whatsapp.wamsys.JniBridge;

/* renamed from: X.1Sc  reason: invalid class name and case insensitive filesystem */
public class C27531Sc {
    public final C16300so A00;
    public final C14870pt A01;
    public final C16040sK A02;
    public final AnonymousClass17Z A03;
    public final C15810rt A04;
    public final C16460t6 A05;
    public final C27631Sn A06;
    public final AnonymousClass17G A07;
    public final C224217w A08;
    public final AnonymousClass17H A09;
    public final C221816y A0A;
    public final C17400v1 A0B;
    public final C19150xq A0C;
    public final C16900tq A0D;
    public final AnonymousClass18B A0E;
    public final AnonymousClass1HF A0F;
    public final C222917j A0G;
    public final C18860xN A0H;
    public final C14710pd A0I;
    public final C222517f A0J;
    public final AnonymousClass0y3 A0K;
    public final AnonymousClass1GC A0L;
    public final JniBridge A0M;

    public C27531Sc(C16300so r2, C14870pt r3, C16040sK r4, AnonymousClass17Z r5, C15810rt r6, C16460t6 r7, C27631Sn r8, AnonymousClass17G r9, C224217w r10, AnonymousClass17H r11, C221816y r12, C17400v1 r13, C19150xq r14, C16900tq r15, AnonymousClass18B r16, AnonymousClass1HF r17, C222917j r18, C18860xN r19, C14710pd r20, C222517f r21, AnonymousClass0y3 r22, AnonymousClass1GC r23, JniBridge jniBridge) {
        this.A0I = r20;
        this.A01 = r3;
        this.A00 = r2;
        this.A02 = r4;
        this.A04 = r6;
        this.A0M = jniBridge;
        this.A03 = r5;
        this.A0J = r21;
        this.A0F = r17;
        this.A05 = r7;
        this.A06 = r8;
        this.A07 = r9;
        this.A0C = r14;
        this.A0G = r18;
        this.A0K = r22;
        this.A09 = r11;
        this.A0D = r15;
        this.A08 = r10;
        this.A0B = r13;
        this.A0H = r19;
        this.A0A = r12;
        this.A0L = r23;
        this.A0E = r16;
    }

    public C16740tZ A00(C28381Vw r3) {
        Cursor A002 = this.A0B.A00(r3);
        if (A002 == null) {
            return null;
        }
        try {
            if (A002.moveToNext()) {
                C16740tZ A012 = this.A05.A0K.A01(A002);
                A002.close();
                return A012;
            }
            A002.close();
            return null;
        } catch (Throwable unused) {
        }
        throw th;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:89:0x024c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:94:0x0251 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(X.C16740tZ r28, boolean r29) {
        /*
            r27 = this;
            r3 = r28
            boolean r0 = r3 instanceof X.C30581cc
            if (r0 == 0) goto L_0x0272
            r7 = 131072(0x20000, float:1.83671E-40)
            boolean r0 = r3.A10(r7)
            if (r0 == 0) goto L_0x0272
            X.1sC r0 = r3.A0G()
            if (r0 == 0) goto L_0x0272
            X.1sC r0 = r3.A0G()
            X.1Vw r1 = r0.A02
            r5 = r27
            X.0t6 r0 = r5.A05
            X.0th r0 = r0.A0K
            X.0tZ r6 = r0.A03(r1)
            if (r6 != 0) goto L_0x008b
            X.0tZ r6 = r5.A00(r1)
            if (r6 != 0) goto L_0x008b
            X.1Sn r2 = r5.A06
            X.0pd r10 = r5.A0I
            X.0sK r8 = r5.A02
            com.whatsapp.wamsys.JniBridge r13 = r5.A0M
            X.1GC r4 = r5.A0L
            boolean r0 = r3.A10(r7)
            if (r0 == 0) goto L_0x0083
            X.1Vw r6 = r3.A11
            X.0rv r18 = r3.A0B()
            long r0 = r3.A0I
            r23 = 2
            X.1sC r5 = r3.A0G()
            X.1Vw r5 = r5.A02
            java.lang.String r5 = r5.A01
            r9 = 0
            r15 = 0
            X.1iD r7 = X.C33211iD.A0o
            X.1Wr r11 = r7.A0U()
            X.1iE r11 = (X.C33221iE) r11
            r16 = 1
            r14 = r9
            r17 = 0
            X.21Q r7 = new X.21Q
            r12 = r9
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r4.A01(r3, r7)
            X.1Wm r3 = r11.A02()
            byte[] r22 = r3.A02()
            X.2EB r3 = new X.2EB
            r24 = 0
            r19 = r9
            r20 = r6
            r21 = r5
            r25 = r0
            r17 = r3
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25)
            r2.A01(r3)
            return
        L_0x0083:
            java.lang.String r1 = "OrphanedEditMessage/fromEditedFMessage/Invalid edited message"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x008b:
            boolean r0 = r6 instanceof X.C30581cc
            java.lang.String r4 = " edited = "
            java.lang.String r2 = "Invalid edited message, current = "
            if (r0 == 0) goto L_0x0257
            boolean r0 = r6.A10(r7)
            if (r0 == 0) goto L_0x00ba
            X.1sC r0 = r6.A0G()
            if (r0 == 0) goto L_0x00ba
            X.1sC r0 = r3.A0G()
            long r7 = r0.A01
            X.1sC r0 = r6.A0G()
            long r0 = r0.A01
            int r9 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r9 >= 0) goto L_0x00ba
            java.lang.String r0 = "EditedMessageManager/handleEditedMessage the current edited message is newer"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.17f r0 = r5.A0J
            r0.A03(r3)
            return
        L_0x00ba:
            com.whatsapp.jid.UserJid r1 = r6.A0C()
            com.whatsapp.jid.UserJid r0 = r3.A0C()
            if (r1 != 0) goto L_0x00fb
            if (r0 != 0) goto L_0x0103
        L_0x00c6:
            X.1Vw r8 = r6.A11
            boolean r0 = r8.A02
            if (r0 == 0) goto L_0x0106
            X.1Vw r0 = r3.A11
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x00f2
            java.lang.String r0 = "EditMessageManager/validateEdit from me doesnt match"
        L_0x00d4:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            r0.append(r6)
            r0.append(r4)
            r0.append(r3)
            java.lang.String r1 = r0.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x00f2:
            boolean r0 = r6.A1D
            if (r0 == 0) goto L_0x0106
            if (r29 == 0) goto L_0x0106
            java.lang.String r0 = "EditMessageManager/validateEdit cant edit message that was not sent from this device"
            goto L_0x00d4
        L_0x00fb:
            if (r0 == 0) goto L_0x0103
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x00c6
        L_0x0103:
            java.lang.String r0 = "EditMessageManager/validateEdit the sender of the edit is not same as sender of current message"
            goto L_0x00d4
        L_0x0106:
            r2 = r6
            X.1cc r2 = (X.C30581cc) r2
            X.1cc r3 = (X.C30581cc) r3
            X.1Vw r0 = r3.A11
            X.0tZ r7 = r2.A6M(r0)
            X.1cc r7 = (X.C30581cc) r7
            long r0 = r2.A13
            r7.A13 = r0
            long r0 = r2.A14
            r7.A14 = r0
            java.lang.String r0 = r3.A0I()
            r7.A0k(r0)
            java.util.List r0 = r3.A0q
            r7.A0u(r0)
            java.lang.String r0 = r3.A07
            r7.A07 = r0
            java.lang.String r0 = r3.A03
            r7.A03 = r0
            java.lang.String r0 = r3.A06
            r7.A06 = r0
            java.lang.String r0 = r3.A04
            r7.A04 = r0
            int r0 = r3.A01
            r7.A01 = r0
            int r0 = r3.A00
            r7.A00 = r0
            byte[] r0 = r3.A08
            r7.A16(r0)
            X.1cv r0 = r3.A0U
            r7.A0h(r0)
            X.1sC r0 = r3.A0G()
            r7.A0g(r0)
            r0 = 131072(0x20000, float:1.83671E-40)
            r7.A0S(r0)
            r0 = 1
            r7.A0X(r0)
            if (r29 == 0) goto L_0x015e
            r7.A0R()
        L_0x015e:
            X.0tq r0 = r5.A0D
            X.0tf r4 = r0.A02()
            X.1cj r12 = r4.A00()     // Catch:{ all -> 0x0252 }
            X.1Vw r11 = r7.A11     // Catch:{ all -> 0x024d }
            boolean r0 = r11.A02     // Catch:{ all -> 0x024d }
            if (r0 != 0) goto L_0x0172
            boolean r0 = r7.A1D     // Catch:{ all -> 0x024d }
            if (r0 != 0) goto L_0x0188
        L_0x0172:
            X.16y r0 = r5.A0A     // Catch:{ all -> 0x024d }
            java.util.Set r2 = r0.A05(r6)     // Catch:{ all -> 0x024d }
            X.1HF r1 = r5.A0F     // Catch:{ all -> 0x024d }
            r1.A01(r6)     // Catch:{ all -> 0x024d }
            if (r2 == 0) goto L_0x0188
            boolean r0 = r2.isEmpty()     // Catch:{ all -> 0x024d }
            if (r0 != 0) goto L_0x0188
            r1.A02(r7, r2)     // Catch:{ all -> 0x024d }
        L_0x0188:
            X.17G r2 = r5.A07     // Catch:{ all -> 0x024d }
            r0 = 1
            java.lang.String[] r9 = new java.lang.String[r0]     // Catch:{ all -> 0x024d }
            long r0 = r7.A13     // Catch:{ all -> 0x024d }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x024d }
            r0 = 0
            r9[r0] = r1     // Catch:{ all -> 0x024d }
            X.0tq r0 = r2.A05     // Catch:{ all -> 0x024d }
            r0.A04()     // Catch:{ all -> 0x024d }
            X.1jC r0 = r0.A04     // Catch:{ all -> 0x024d }
            boolean r0 = r0.A0D(r4)     // Catch:{ all -> 0x024d }
            if (r0 == 0) goto L_0x01d4
            android.content.ContentValues r10 = new android.content.ContentValues     // Catch:{ all -> 0x024d }
            r10.<init>()     // Catch:{ all -> 0x024d }
            X.0sc r3 = r2.A01     // Catch:{ IOException -> 0x01d0 }
            X.0rv r0 = r11.A00     // Catch:{ IOException -> 0x01d0 }
            X.AnonymousClass00B.A06(r0)     // Catch:{ IOException -> 0x01d0 }
            java.lang.String r1 = r0.getRawString()     // Catch:{ IOException -> 0x01d0 }
            java.lang.String r0 = "key_remote_jid"
            r10.put(r0, r1)     // Catch:{ IOException -> 0x01d0 }
            X.C38611r4.A01(r10, r3, r7)     // Catch:{ IOException -> 0x01d0 }
            java.lang.String r3 = "_id"
            long r0 = r7.A13     // Catch:{ IOException -> 0x01d0 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ IOException -> 0x01d0 }
            r10.put(r3, r0)     // Catch:{ IOException -> 0x01d0 }
            X.0tg r3 = r4.A02     // Catch:{ IOException -> 0x01d0 }
            java.lang.String r1 = "messages"
            java.lang.String r0 = "_id = ?"
            r3.A00(r1, r10, r0, r9)     // Catch:{ IOException -> 0x01d0 }
            goto L_0x01d4
        L_0x01d0:
            r0 = move-exception
            r0.printStackTrace()     // Catch:{ all -> 0x024d }
        L_0x01d4:
            boolean r0 = r2.A09()     // Catch:{ all -> 0x024d }
            if (r0 == 0) goto L_0x01eb
            android.content.ContentValues r3 = new android.content.ContentValues     // Catch:{ all -> 0x024d }
            r3.<init>()     // Catch:{ all -> 0x024d }
            r2.A05(r3, r7)     // Catch:{ all -> 0x024d }
            X.0tg r2 = r4.A02     // Catch:{ all -> 0x024d }
            java.lang.String r1 = "message"
            java.lang.String r0 = "_id = ?"
            r2.A00(r1, r3, r0, r9)     // Catch:{ all -> 0x024d }
        L_0x01eb:
            X.17w r10 = r5.A08     // Catch:{ all -> 0x024d }
            r0 = 1
            java.lang.String[] r9 = new java.lang.String[r0]     // Catch:{ all -> 0x024d }
            long r0 = r7.A13     // Catch:{ all -> 0x024d }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x024d }
            r0 = 0
            r9[r0] = r1     // Catch:{ all -> 0x024d }
            X.0tq r0 = r10.A03     // Catch:{ all -> 0x024d }
            X.0tf r3 = r0.A02()     // Catch:{ all -> 0x024d }
            X.0tg r2 = r3.A02     // Catch:{ all -> 0x0248 }
            java.lang.String r1 = "message_mentions"
            java.lang.String r0 = "message_row_id = ?"
            r2.A01(r1, r0, r9)     // Catch:{ all -> 0x0248 }
            r3.close()     // Catch:{ all -> 0x024d }
            r10.A00(r7)     // Catch:{ all -> 0x024d }
            X.17j r0 = r5.A0G     // Catch:{ all -> 0x024d }
            r0.A01(r7)     // Catch:{ all -> 0x024d }
            X.0v1 r0 = r5.A0B     // Catch:{ all -> 0x024d }
            r0.A01(r7)     // Catch:{ all -> 0x024d }
            byte[] r1 = r7.A17()     // Catch:{ all -> 0x024d }
            if (r1 == 0) goto L_0x0223
            X.0xN r0 = r5.A0H     // Catch:{ all -> 0x024d }
            r0.A02(r7, r1)     // Catch:{ all -> 0x024d }
        L_0x0223:
            X.1cv r3 = r7.A0U     // Catch:{ all -> 0x024d }
            if (r3 == 0) goto L_0x022e
            X.18B r2 = r5.A0E     // Catch:{ all -> 0x024d }
            long r0 = r7.A13     // Catch:{ all -> 0x024d }
            r2.A00(r3, r0)     // Catch:{ all -> 0x024d }
        L_0x022e:
            X.17H r0 = r5.A09     // Catch:{ all -> 0x024d }
            r0.A03(r8)     // Catch:{ all -> 0x024d }
            r12.A00()     // Catch:{ all -> 0x024d }
            X.0pt r2 = r5.A01     // Catch:{ all -> 0x024d }
            r1 = 6
            com.facebook.redex.RunnableRunnableShape1S0300000_I0_1 r0 = new com.facebook.redex.RunnableRunnableShape1S0300000_I0_1     // Catch:{ all -> 0x024d }
            r0.<init>(r5, r6, r7, r1)     // Catch:{ all -> 0x024d }
            r2.A0K(r0)     // Catch:{ all -> 0x024d }
            r12.close()     // Catch:{ all -> 0x0252 }
            r4.close()
            return
        L_0x0248:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x024c }
        L_0x024c:
            throw r0     // Catch:{ all -> 0x024d }
        L_0x024d:
            r0 = move-exception
            r12.close()     // Catch:{ all -> 0x0251 }
        L_0x0251:
            throw r0     // Catch:{ all -> 0x0252 }
        L_0x0252:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0256 }
        L_0x0256:
            throw r0
        L_0x0257:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            r0.append(r6)
            r0.append(r4)
            r0.append(r3)
            java.lang.String r1 = r0.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0272:
            java.lang.String r1 = "Invalid edited message edited message "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r1 = r0.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27531Sc.A01(X.0tZ, boolean):void");
    }
}
