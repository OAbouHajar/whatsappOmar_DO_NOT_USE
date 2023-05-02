package X;

import android.os.SystemClock;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.1HF  reason: invalid class name */
public class AnonymousClass1HF {
    public final AnonymousClass03L A00 = new AnonymousClass03L(250);
    public final C16440t3 A01;
    public final C16460t6 A02;
    public final C17620vN A03;
    public final C16900tq A04;
    public final AnonymousClass16V A05;
    public final C26891Pq A06;
    public final C218715t A07;
    public final Set A08 = new HashSet();

    public AnonymousClass1HF(C16440t3 r3, C16460t6 r4, C17620vN r5, C16900tq r6, AnonymousClass16V r7, C26891Pq r8, C218715t r9) {
        this.A01 = r3;
        this.A02 = r4;
        this.A06 = r8;
        this.A03 = r5;
        this.A04 = r6;
        this.A05 = r7;
        this.A07 = r9;
    }

    public AnonymousClass21M A00(C16740tZ r9) {
        long uptimeMillis = SystemClock.uptimeMillis();
        C28381Vw r4 = r9.A11;
        AnonymousClass03L r3 = this.A00;
        AnonymousClass21M r5 = (AnonymousClass21M) r3.A02(r4);
        if (r5 == null) {
            C26891Pq r52 = this.A06;
            if (r52.A03.A00("receipt_user_ready", 0) == 2) {
                r5 = r52.A00(r9.A13);
            } else {
                C15830rv r1 = r4.A00;
                r5 = (C16030sJ.A0L(r1) || C16030sJ.A0Q(r1)) ? this.A07.A01(r4) : this.A07.A00(r9);
            }
            r3.A06(r4, r5);
            this.A03.A00("ReceiptManager/getMessageReceipts", SystemClock.uptimeMillis() - uptimeMillis);
        }
        return r5;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00c8 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:42:0x00cd */
    /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00d2 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:25:0x009c=Splitter:B:25:0x009c, B:42:0x00cd=Splitter:B:42:0x00cd} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(X.C16740tZ r14) {
        /*
            r13 = this;
            long r11 = android.os.SystemClock.uptimeMillis()
            X.0tq r0 = r13.A04
            X.0tf r3 = r0.A02()
            X.1cj r10 = r3.A00()     // Catch:{ all -> 0x00d3 }
            X.1Pq r8 = r13.A06     // Catch:{ all -> 0x00ce }
            long r0 = r14.A13     // Catch:{ all -> 0x00ce }
            X.0tq r2 = r8.A02     // Catch:{ all -> 0x00ce }
            X.0tf r7 = r2.A02()     // Catch:{ all -> 0x00ce }
            X.1cj r9 = r7.A00()     // Catch:{ all -> 0x00c9 }
            r2 = 1
            java.lang.String[] r6 = new java.lang.String[r2]     // Catch:{ all -> 0x00c4 }
            r4 = 0
            java.lang.String r2 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x00c4 }
            r6[r4] = r2     // Catch:{ all -> 0x00c4 }
            X.0tg r5 = r7.A02     // Catch:{ all -> 0x00c4 }
            java.lang.String r4 = "receipt_user"
            java.lang.String r2 = "message_row_id=?"
            r5.A01(r4, r2, r6)     // Catch:{ all -> 0x00c4 }
            r9.A00()     // Catch:{ all -> 0x00c4 }
            r4 = 2
            com.facebook.redex.RunnableRunnableShape0S0100100_I0 r2 = new com.facebook.redex.RunnableRunnableShape0S0100100_I0     // Catch:{ all -> 0x00c4 }
            r2.<init>(r8, r0, r4)     // Catch:{ all -> 0x00c4 }
            r7.A03(r2)     // Catch:{ all -> 0x00c4 }
            r9.close()     // Catch:{ all -> 0x00c9 }
            r7.close()     // Catch:{ all -> 0x00ce }
            X.16V r0 = r13.A05     // Catch:{ all -> 0x00ce }
            long r1 = r14.A13     // Catch:{ all -> 0x00ce }
            X.17B r8 = r0.A02     // Catch:{ all -> 0x00ce }
            X.0tq r0 = r8.A04     // Catch:{ all -> 0x00ce }
            X.0tf r7 = r0.A02()     // Catch:{ all -> 0x00ce }
            X.1cj r9 = r7.A00()     // Catch:{ all -> 0x00c9 }
            r0 = 1
            java.lang.String[] r6 = new java.lang.String[r0]     // Catch:{ all -> 0x00c4 }
            r4 = 0
            java.lang.String r0 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x00c4 }
            r6[r4] = r0     // Catch:{ all -> 0x00c4 }
            X.0tg r5 = r7.A02     // Catch:{ all -> 0x00c4 }
            java.lang.String r4 = "receipt_device"
            java.lang.String r0 = "message_row_id = ?"
            r5.A01(r4, r0, r6)     // Catch:{ all -> 0x00c4 }
            r9.A00()     // Catch:{ all -> 0x00c4 }
            r4 = 1
            com.facebook.redex.RunnableRunnableShape0S0100100_I0 r0 = new com.facebook.redex.RunnableRunnableShape0S0100100_I0     // Catch:{ all -> 0x00c4 }
            r0.<init>(r8, r1, r4)     // Catch:{ all -> 0x00c4 }
            r7.A03(r0)     // Catch:{ all -> 0x00c4 }
            r9.close()     // Catch:{ all -> 0x00c9 }
            r7.close()     // Catch:{ all -> 0x00ce }
            X.15t r0 = r13.A07     // Catch:{ all -> 0x00ce }
            X.1Vw r6 = r14.A11     // Catch:{ all -> 0x00ce }
            X.0tq r0 = r0.A05     // Catch:{ all -> 0x00ce }
            X.0tf r5 = r0.A02()     // Catch:{ all -> 0x00ce }
            X.0rv r2 = r6.A00     // Catch:{ all -> 0x00bf }
            if (r2 == 0) goto L_0x009c
            r0 = 2
            java.lang.String[] r4 = new java.lang.String[r0]     // Catch:{ all -> 0x00bf }
            r1 = 0
            java.lang.String r0 = r2.getRawString()     // Catch:{ all -> 0x00bf }
            r4[r1] = r0     // Catch:{ all -> 0x00bf }
            r1 = 1
            java.lang.String r0 = r6.A01     // Catch:{ all -> 0x00bf }
            r4[r1] = r0     // Catch:{ all -> 0x00bf }
            X.0tg r2 = r5.A02     // Catch:{ all -> 0x00bf }
            java.lang.String r1 = "receipts"
            java.lang.String r0 = "key_remote_jid = ? AND key_id = ?"
            r2.A01(r1, r0, r4)     // Catch:{ all -> 0x00bf }
        L_0x009c:
            r5.close()     // Catch:{ all -> 0x00ce }
            r10.A00()     // Catch:{ all -> 0x00ce }
            r1 = 45
            com.facebook.redex.RunnableRunnableShape6S0200000_I0_4 r0 = new com.facebook.redex.RunnableRunnableShape6S0200000_I0_4     // Catch:{ all -> 0x00ce }
            r0.<init>(r13, r1, r14)     // Catch:{ all -> 0x00ce }
            r3.A03(r0)     // Catch:{ all -> 0x00ce }
            r10.close()     // Catch:{ all -> 0x00d3 }
            r3.close()
            X.0vN r3 = r13.A03
            long r1 = android.os.SystemClock.uptimeMillis()
            long r1 = r1 - r11
            java.lang.String r0 = "ReceiptManager/deleteMessageReceiptsOnRevoke"
            r3.A00(r0, r1)
            return
        L_0x00bf:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x00cd }
            goto L_0x00cd
        L_0x00c4:
            r0 = move-exception
            r9.close()     // Catch:{ all -> 0x00c8 }
        L_0x00c8:
            throw r0     // Catch:{ all -> 0x00c9 }
        L_0x00c9:
            r0 = move-exception
            r7.close()     // Catch:{ all -> 0x00cd }
        L_0x00cd:
            throw r0     // Catch:{ all -> 0x00ce }
        L_0x00ce:
            r0 = move-exception
            r10.close()     // Catch:{ all -> 0x00d2 }
        L_0x00d2:
            throw r0     // Catch:{ all -> 0x00d3 }
        L_0x00d3:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x00d7 }
        L_0x00d7:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1HF.A01(X.0tZ):void");
    }

    public void A02(C16740tZ r6, Set set) {
        AnonymousClass16V r1 = this.A05;
        AnonymousClass17A r4 = r6 instanceof C38541qx ? r1.A01 : r1.A02;
        set.size();
        r4.A00.A03(Long.valueOf(r6.A13));
        r4.A02(r6, set, true);
    }
}
