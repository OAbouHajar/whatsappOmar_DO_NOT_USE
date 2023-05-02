package X;

import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

/* renamed from: X.1Bn  reason: invalid class name and case insensitive filesystem */
public class C23321Bn {
    public final C16300so A00;
    public final C16040sK A01;
    public final C15900s5 A02;
    public final C19000xb A03;
    public final AnonymousClass19E A04;
    public final C16000sG A05;
    public final AnonymousClass12G A06;
    public final C16440t3 A07;
    public final C208211s A08;
    public final C15810rt A09;
    public final C16460t6 A0A;
    public final C16070sO A0B;
    public final AnonymousClass192 A0C;
    public final C17290uq A0D;
    public final AnonymousClass15B A0E;
    public final AnonymousClass128 A0F;
    public final AnonymousClass11G A0G;
    public final C217815k A0H;
    public final C17580vJ A0I;
    public final AnonymousClass15H A0J;
    public final C17590vK A0K;
    public final AnonymousClass16Q A0L;
    public final AnonymousClass19M A0M;
    public final C14710pd A0N;
    public final C16490t9 A0O;
    public final C18040w3 A0P;
    public final AnonymousClass12X A0Q;
    public final C217915l A0R;
    public final C18220wL A0S;
    public final C17300ur A0T;
    public final C222617g A0U;
    public final C212613k A0V;
    public final Random A0W = new Random();

    public C23321Bn(C16300so r2, C16040sK r3, C15900s5 r4, C19000xb r5, AnonymousClass19E r6, C16000sG r7, AnonymousClass12G r8, C16440t3 r9, C208211s r10, C15810rt r11, C16460t6 r12, C16070sO r13, AnonymousClass192 r14, C17290uq r15, AnonymousClass15B r16, AnonymousClass128 r17, AnonymousClass11G r18, C217815k r19, C17580vJ r20, AnonymousClass15H r21, C17590vK r22, AnonymousClass16Q r23, AnonymousClass19M r24, C14710pd r25, C16490t9 r26, C18040w3 r27, AnonymousClass12X r28, C217915l r29, C18220wL r30, C17300ur r31, C222617g r32, C212613k r33) {
        this.A07 = r9;
        this.A0N = r25;
        this.A00 = r2;
        this.A01 = r3;
        this.A09 = r11;
        this.A0D = r15;
        this.A0O = r26;
        this.A0E = r16;
        this.A02 = r4;
        this.A0G = r18;
        this.A03 = r5;
        this.A0H = r19;
        this.A05 = r7;
        this.A0V = r33;
        this.A0U = r32;
        this.A0S = r30;
        this.A0A = r12;
        this.A0T = r31;
        this.A0I = r20;
        this.A04 = r6;
        this.A0M = r24;
        this.A08 = r10;
        this.A0R = r29;
        this.A0F = r17;
        this.A0P = r27;
        this.A06 = r8;
        this.A0J = r21;
        this.A0B = r13;
        this.A0K = r22;
        this.A0C = r14;
        this.A0L = r23;
        this.A0Q = r28;
    }

    public static final C29921bR A00(int i2) {
        if (i2 == 0) {
            return C29921bR.A02;
        }
        if (i2 == 1) {
            return C29921bR.A03;
        }
        if (i2 == 2) {
            return C29921bR.A06;
        }
        if (i2 == 3) {
            return C29921bR.A01;
        }
        if (i2 == 4) {
            return C29921bR.A05;
        }
        if (i2 == 5) {
            return C29921bR.A04;
        }
        StringBuilder sb = new StringBuilder("Unexpected type (");
        sb.append(i2);
        sb.append(")");
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x00b1 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:21:0x00b1=Splitter:B:21:0x00b1, B:12:0x0045=Splitter:B:12:0x0045} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long A01(X.AnonymousClass1WM r30, com.whatsapp.jid.DeviceJid r31, X.C29911bQ r32, java.lang.String r33, int r34, int r35, int r36, int r37, long r38, long r40, long r42, long r44, long r46) {
        /*
            r29 = this;
            r9 = r29
            r6 = r30
            r13 = r35
            r14 = r36
            X.12X r0 = r9.A0Q     // Catch:{ IOException -> 0x00b7 }
            X.1XH r1 = r0.A00     // Catch:{ IOException -> 0x00b7 }
            java.lang.String r0 = ""
            java.io.File r11 = r1.A00(r0)     // Catch:{ IOException -> 0x00b7 }
            r11.getAbsolutePath()     // Catch:{ IOException -> 0x00b7 }
            r10 = r32
            X.1Wm r5 = r10.A02()     // Catch:{ IOException -> 0x00b7 }
            r1 = 1
            r0 = 0
            java.util.zip.Deflater r4 = new java.util.zip.Deflater     // Catch:{ IOException -> 0x00b7 }
            r4.<init>(r1, r0)     // Catch:{ IOException -> 0x00b7 }
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ all -> 0x00b2 }
            r0.<init>(r11)     // Catch:{ all -> 0x00b2 }
            java.util.zip.DeflaterOutputStream r3 = new java.util.zip.DeflaterOutputStream     // Catch:{ all -> 0x00b2 }
            r3.<init>(r0, r4)     // Catch:{ all -> 0x00b2 }
            int r2 = r5.AFw()     // Catch:{ all -> 0x00ad }
            r0 = 4096(0x1000, float:5.74E-42)
            if (r2 <= r0) goto L_0x0036
            r2 = 4096(0x1000, float:5.74E-42)
        L_0x0036:
            X.24u r1 = new X.24u     // Catch:{ all -> 0x00ad }
            r1.<init>(r3, r2)     // Catch:{ all -> 0x00ad }
            r5.AiJ(r1)     // Catch:{ all -> 0x00ad }
            int r0 = r1.A00     // Catch:{ all -> 0x00ad }
            if (r0 <= 0) goto L_0x0045
            r1.A0J()     // Catch:{ all -> 0x00ad }
        L_0x0045:
            r3.close()     // Catch:{ all -> 0x00b2 }
            r4.end()     // Catch:{ IOException -> 0x00b7 }
            r0 = 1
            r3 = 0
            X.1XJ r1 = new X.1XJ
            r1.<init>(r3, r3, r0)
            r0 = 0
            X.1XK r19 = X.AnonymousClass1XK.A0K
            android.net.Uri r15 = android.net.Uri.fromFile(r11)
            r26 = 1
            r17 = r0
            r20 = r0
            r21 = r0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 1
            r16 = r0
            r18 = r1
            X.1XL r5 = X.AnonymousClass1XL.A00(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            long r19 = r11.length()
            X.19E r4 = r9.A04
            long r1 = (long) r14
            r21 = r4
            r22 = r6
            r23 = r13
            r24 = r1
            r21.A0C(r22, r23, r24, r26)
            X.0wL r2 = r9.A0S
            X.1XP r8 = r2.A03(r5, r3)
            java.lang.String r1 = "mms"
            r8.A0U = r1
            r2.A0D(r8, r0)
            X.24x r5 = new X.24x
            r7 = r31
            r17 = r44
            r12 = r33
            r27 = r46
            r15 = r34
            r16 = r37
            r21 = r38
            r23 = r40
            r25 = r42
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r19, r21, r23, r25, r27)
            X.1XS r1 = r8.A0A
            r1.A03(r5, r0)
            return r19
        L_0x00ad:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x00b1 }
        L_0x00b1:
            throw r0     // Catch:{ all -> 0x00b2 }
        L_0x00b2:
            r0 = move-exception
            r4.end()     // Catch:{ IOException -> 0x00b7 }
            throw r0     // Catch:{ IOException -> 0x00b7 }
        L_0x00b7:
            r1 = move-exception
            java.lang.String r0 = "history-sync-send-methods/save-to-file: failed"
            com.whatsapp.util.Log.e(r0, r1)
            X.19E r2 = r9.A04
            long r0 = (long) r14
            r7 = 0
            r3 = r6
            r4 = r13
            r5 = r0
            r2.A0C(r3, r4, r5, r7)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23321Bn.A01(X.1WM, com.whatsapp.jid.DeviceJid, X.1bQ, java.lang.String, int, int, int, int, long, long, long, long, long):long");
    }

    public void A02(AnonymousClass1WM r28, DeviceJid deviceJid, String str, int i2) {
        int A032 = this.A0N.A03(C16620tM.A02, 1181);
        try {
            ArrayList A0F2 = this.A05.A0F();
            C29911bQ r11 = (C29911bQ) C29901bP.A0D.A0U();
            r11.A07(C29921bR.A05);
            Iterator it = A0F2.iterator();
            int i3 = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C16010sH r6 = (C16010sH) it.next();
                UserJid userJid = (UserJid) r6.A08(UserJid.class);
                if (userJid != null && !TextUtils.isEmpty(r6.A0W)) {
                    C446124t r3 = (C446124t) C446024s.A03.A0U();
                    String rawString = userJid.getRawString();
                    r3.A03();
                    C446024s r1 = (C446024s) r3.A00;
                    r1.A00 |= 1;
                    r1.A01 = rawString;
                    String str2 = r6.A0W;
                    r3.A03();
                    C446024s r12 = (C446024s) r3.A00;
                    r12.A00 |= 2;
                    r12.A02 = str2;
                    C446024s r32 = (C446024s) r3.A02();
                    r11.A03();
                    C29901bP r2 = (C29901bP) r11.A00;
                    AnonymousClass1XE r13 = r2.A09;
                    if (!((AnonymousClass1XF) r13).A00) {
                        r13 = C28541Wm.A0G(r13);
                        r2.A09 = r13;
                    }
                    r13.add(r32);
                    i3++;
                    if (A032 > 0 && i3 >= A032) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("history-sync-send-methods/send-push-names reach limit=");
                        sb.append(A032);
                        Log.i(sb.toString());
                        break;
                    }
                }
            }
            A01(r28, deviceJid, r11, str, 1, 4, 100, i2, -1, -1, -1, 0, 0);
        } catch (Exception e2) {
            Log.e("history-sync-send-methods/send-push-names: error", e2);
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00fb */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(X.C15830rv r8, X.C29931bS r9, long r10, long r12) {
        /*
            r7 = this;
            X.15B r2 = r7.A0E
            X.0rt r0 = r2.A02
            X.0rx r4 = r0.A06(r8)
            r5 = -9223372036854775808
            if (r4 == 0) goto L_0x0101
            long r0 = r4.A0F
            int r3 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x005e
            r0 = 1
            java.lang.String[] r3 = new java.lang.String[r0]
            r5 = 0
            X.0ts r0 = r2.A01
            long r0 = r0.A02(r8)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r3[r5] = r0
            X.0tq r0 = r2.A04
            X.0tf r2 = r0.get()
            X.0tg r1 = r2.A02     // Catch:{ all -> 0x00fc }
            java.lang.String r0 = "   SELECT sort_id FROM available_message_view WHERE chat_row_id = ? AND (message_type != '8') ORDER BY sort_id ASC LIMIT 1"
            android.database.Cursor r3 = r1.A08(r0, r3)     // Catch:{ all -> 0x00fc }
            boolean r0 = r3.moveToFirst()     // Catch:{ all -> 0x00f5 }
            if (r0 == 0) goto L_0x0044
            java.lang.String r0 = "sort_id"
            int r0 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00f5 }
            long r0 = r3.getLong(r0)     // Catch:{ all -> 0x00f5 }
            r4.A0F = r0     // Catch:{ all -> 0x00f5 }
            goto L_0x0058
        L_0x0044:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f5 }
            r1.<init>()     // Catch:{ all -> 0x00f5 }
            java.lang.String r0 = "msgstore/getfirstsortref can't get value for "
            r1.append(r0)     // Catch:{ all -> 0x00f5 }
            r1.append(r8)     // Catch:{ all -> 0x00f5 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00f5 }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x00f5 }
        L_0x0058:
            r3.close()     // Catch:{ all -> 0x00fc }
            r2.close()
        L_0x005e:
            long r0 = r4.A0F
            r3 = -9223372036854775808
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x0101
            int r2 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r2 < 0) goto L_0x007e
            X.1cK r2 = X.C30421cK.A01
        L_0x006c:
            r9.A03()
            X.1Wm r1 = r9.A00
            X.1bT r1 = (X.C29941bT) r1
            int r0 = r1.A01
            r0 = r0 | 512(0x200, float:7.175E-43)
            r1.A01 = r0
            int r0 = r2.value
            r1.A03 = r0
            return
        L_0x007e:
            int r2 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r2 >= 0) goto L_0x0101
            X.0uq r2 = r7.A0D
            r0 = 3
            java.lang.String[] r3 = new java.lang.String[r0]
            X.0ts r0 = r2.A02
            long r0 = r0.A02(r8)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r4 = 0
            r3[r4] = r0
            java.lang.String r1 = java.lang.Long.toString(r12)
            r0 = 1
            r3[r0] = r1
            java.lang.String r1 = java.lang.Long.toString(r10)
            r0 = 2
            r3[r0] = r1
            X.0tq r0 = r2.A06
            X.0tf r2 = r0.get()
            X.0tg r1 = r2.A02     // Catch:{ all -> 0x00fc }
            java.lang.String r0 = "SELECT COUNT(*) as count FROM available_message_view WHERE chat_row_id = ? AND (message_type != '8') AND _id > ? AND _id <= ?"
            android.database.Cursor r3 = r1.A08(r0, r3)     // Catch:{ all -> 0x00fc }
            boolean r0 = r3.moveToNext()     // Catch:{ all -> 0x00f5 }
            if (r0 == 0) goto L_0x00d5
            java.lang.String r0 = "count"
            int r0 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00f5 }
            int r4 = r3.getInt(r0)     // Catch:{ all -> 0x00f5 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f5 }
            r1.<init>()     // Catch:{ all -> 0x00f5 }
            java.lang.String r0 = "msgstore/getmessagesatid/pos:"
            r1.append(r0)     // Catch:{ all -> 0x00f5 }
            r1.append(r4)     // Catch:{ all -> 0x00f5 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00f5 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00f5 }
            goto L_0x00e9
        L_0x00d5:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f5 }
            r1.<init>()     // Catch:{ all -> 0x00f5 }
            java.lang.String r0 = "msgstore/getmessagesatid/db no message for "
            r1.append(r0)     // Catch:{ all -> 0x00f5 }
            r1.append(r8)     // Catch:{ all -> 0x00f5 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00f5 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00f5 }
        L_0x00e9:
            r3.close()     // Catch:{ all -> 0x00fc }
            r2.close()
            if (r4 != 0) goto L_0x0101
            X.1cK r2 = X.C30421cK.A02
            goto L_0x006c
        L_0x00f5:
            r0 = move-exception
            if (r3 == 0) goto L_0x00fb
            r3.close()     // Catch:{ all -> 0x00fb }
        L_0x00fb:
            throw r0     // Catch:{ all -> 0x00fc }
        L_0x00fc:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0100 }
        L_0x0100:
            throw r0
        L_0x0101:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23321Bn.A03(X.0rv, X.1bS, long, long):void");
    }

    public final void A04(C29911bQ r12) {
        C212613k r1 = this.A0V;
        List<Pair> A0D2 = r1.A0D();
        Map A0E2 = r1.A0E();
        A0D2.size();
        for (Pair pair : A0D2) {
            C34151jm r3 = (C34151jm) pair.first;
            Number number = (Number) pair.second;
            C28581Wr A0U2 = C445924r.A0C.A0U();
            String str = r3.A0G;
            if (!TextUtils.isEmpty(str)) {
                A0U2.A03();
                C445924r r13 = (C445924r) A0U2.A00;
                r13.A01 |= 1;
                r13.A0B = str;
            }
            String str2 = r3.A0D;
            if (!TextUtils.isEmpty(str2)) {
                byte[] decode = Base64.decode(str2, 0);
                C28631Ww A012 = C28631Ww.A01(decode, 0, decode.length);
                A0U2.A03();
                C445924r r14 = (C445924r) A0U2.A00;
                r14.A01 |= 2;
                r14.A07 = A012;
            }
            String str3 = r3.A08;
            if (!TextUtils.isEmpty(str3)) {
                byte[] decode2 = Base64.decode(str3, 0);
                C28631Ww A013 = C28631Ww.A01(decode2, 0, decode2.length);
                A0U2.A03();
                C445924r r15 = (C445924r) A0U2.A00;
                r15.A01 |= 4;
                r15.A06 = A013;
            }
            String str4 = r3.A0B;
            if (!TextUtils.isEmpty(str4)) {
                byte[] decode3 = Base64.decode(str4, 1);
                C28631Ww A014 = C28631Ww.A01(decode3, 0, decode3.length);
                A0U2.A03();
                C445924r r16 = (C445924r) A0U2.A00;
                r16.A01 |= 8;
                r16.A08 = A014;
            }
            String str5 = r3.A06;
            if (!TextUtils.isEmpty(str5)) {
                A0U2.A03();
                C445924r r17 = (C445924r) A0U2.A00;
                r17.A01 |= 128;
                r17.A09 = str5;
            }
            String str6 = r3.A0C;
            A0U2.A03();
            C445924r r18 = (C445924r) A0U2.A00;
            r18.A01 |= 16;
            r18.A0A = str6;
            int i2 = r3.A02;
            A0U2.A03();
            C445924r r19 = (C445924r) A0U2.A00;
            r19.A01 |= 32;
            r19.A02 = i2;
            int i3 = r3.A03;
            A0U2.A03();
            C445924r r110 = (C445924r) A0U2.A00;
            r110.A01 |= 64;
            r110.A03 = i3;
            A0U2.A03();
            C445924r r32 = (C445924r) A0U2.A00;
            r32.A01 |= 256;
            r32.A04 = (long) r3.A00;
            float floatValue = number.floatValue();
            A0U2.A03();
            C445924r r111 = (C445924r) A0U2.A00;
            r111.A01 |= 512;
            r111.A00 = floatValue;
            long longValue = (str2 == null || !A0E2.containsKey(str2)) ? 0 : ((Number) A0E2.get(str2)).longValue();
            A0U2.A03();
            C445924r r112 = (C445924r) A0U2.A00;
            r112.A01 |= 1024;
            r112.A05 = longValue;
            r12.A03();
            C29901bP r2 = (C29901bP) r12.A00;
            AnonymousClass1XE r113 = r2.A0A;
            if (!((AnonymousClass1XF) r113).A00) {
                r113 = C28541Wm.A0G(r113);
                r2.A0A = r113;
            }
            r113.add(A0U2.A02());
        }
    }
}
