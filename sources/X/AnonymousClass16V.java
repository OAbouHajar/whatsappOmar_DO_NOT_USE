package X;

import android.database.sqlite.SQLiteConstraintException;
import com.whatsapp.util.Log;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.16V  reason: invalid class name */
public class AnonymousClass16V {
    public final C16820th A00;
    public final AnonymousClass179 A01;
    public final AnonymousClass17B A02;
    public final C16900tq A03;

    public AnonymousClass16V(C16820th r1, AnonymousClass179 r2, AnonymousClass17B r3, C16900tq r4) {
        this.A00 = r1;
        this.A03 = r4;
        this.A02 = r3;
        this.A01 = r2;
    }

    public Set A00(C28381Vw r3) {
        C42641yA A05;
        Object obj = this.A00.A03(r3) == null ? this.A01 : this.A02;
        if (obj instanceof AnonymousClass17B) {
            AnonymousClass17B r1 = (AnonymousClass17B) obj;
            C16740tZ A032 = r1.A01.A03(r3);
            if (A032 == null) {
                return new HashSet();
            }
            A05 = r1.A00(A032);
        } else {
            A05 = ((AnonymousClass179) obj).A05(r3);
        }
        return new HashSet(A05.A00.keySet());
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:46:0x018e */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:40:0x0186=Splitter:B:40:0x0186, B:46:0x018e=Splitter:B:46:0x018e} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(com.whatsapp.jid.DeviceJid r17, X.C16740tZ r18, long r19) {
        /*
            r16 = this;
            r11 = r18
            boolean r1 = r11 instanceof X.C38541qx
            r0 = r16
            if (r1 == 0) goto L_0x00bf
            X.179 r4 = r0.A01
        L_0x000a:
            boolean r0 = r11.A15
            if (r0 != 0) goto L_0x0198
            long r5 = r11.A13
            r1 = -1
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0198
            X.1yA r1 = r4.A00(r11)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            boolean r6 = r4 instanceof X.AnonymousClass17B
            if (r6 == 0) goto L_0x00bb
            java.lang.String r9 = "MessageReceiptDeviceStore/"
        L_0x0025:
            r10.append(r9)
            java.lang.String r0 = "updateDeviceReceiptsForMessage/key.jid="
            r10.append(r0)
            X.1Vw r8 = r11.A11
            X.0rv r0 = r8.A00
            r10.append(r0)
            java.lang.String r0 = "; deviceJid="
            r10.append(r0)
            r7 = r17
            r10.append(r7)
            java.lang.String r0 = "; receipt="
            r10.append(r0)
            java.util.concurrent.ConcurrentHashMap r5 = r1.A00
            java.lang.Object r0 = r5.get(r7)
            r10.append(r0)
            java.lang.String r0 = "; timestamp="
            r10.append(r0)
            r2 = r19
            r10.append(r2)
            java.lang.String r0 = "; rowId="
            r10.append(r0)
            long r0 = r11.A13
            r10.append(r0)
            java.lang.String r0 = r10.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r12 = 0
            int r0 = (r19 > r12 ? 1 : (r19 == r12 ? 0 : -1))
            if (r0 <= 0) goto L_0x0198
            java.lang.Object r10 = r5.get(r7)
            X.1yB r10 = (X.C42651yB) r10
            if (r10 != 0) goto L_0x00ad
            X.1yB r0 = new X.1yB
            r0.<init>(r2)
            r5.put(r7, r0)
        L_0x007e:
            X.14v r0 = r4.A02
            long r14 = r0.A01(r7)
            r0 = 3
            android.content.ContentValues r10 = new android.content.ContentValues
            r10.<init>(r0)
            if (r6 == 0) goto L_0x00aa
            java.lang.String r12 = "message_row_id"
        L_0x008e:
            long r0 = r11.A13
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r10.put(r12, r0)
            java.lang.String r1 = "receipt_device_timestamp"
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r10.put(r1, r0)
            java.lang.String r13 = "receipt_device_jid_row_id"
            java.lang.Long r0 = java.lang.Long.valueOf(r14)
            r10.put(r13, r0)
            goto L_0x00c3
        L_0x00aa:
            java.lang.String r12 = "message_add_on_row_id"
            goto L_0x008e
        L_0x00ad:
            long r0 = r10.A00
            int r5 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r5 <= 0) goto L_0x00b8
            int r5 = (r0 > r19 ? 1 : (r0 == r19 ? 0 : -1))
            if (r5 > 0) goto L_0x00b8
            return
        L_0x00b8:
            r10.A00 = r2
            goto L_0x007e
        L_0x00bb:
            java.lang.String r9 = "MessageAddOnReceiptDeviceStore/"
            goto L_0x0025
        L_0x00bf:
            X.17B r4 = r0.A02
            goto L_0x000a
        L_0x00c3:
            X.0tq r0 = r4.A04     // Catch:{ SQLiteDatabaseCorruptException -> 0x018f }
            X.0tf r5 = r0.A02()     // Catch:{ SQLiteDatabaseCorruptException -> 0x018f }
            X.0tg r2 = r5.A02     // Catch:{ all -> 0x018a }
            if (r6 == 0) goto L_0x0182
            java.lang.String r3 = "receipt_device"
        L_0x00cf:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x018a }
            r1.<init>()     // Catch:{ all -> 0x018a }
            r1.append(r12)     // Catch:{ all -> 0x018a }
            java.lang.String r0 = "=? AND "
            r1.append(r0)     // Catch:{ all -> 0x018a }
            r1.append(r13)     // Catch:{ all -> 0x018a }
            java.lang.String r0 = "=?"
            r1.append(r0)     // Catch:{ all -> 0x018a }
            java.lang.String r13 = r1.toString()     // Catch:{ all -> 0x018a }
            r0 = 2
            java.lang.String[] r12 = new java.lang.String[r0]     // Catch:{ all -> 0x018a }
            r6 = 0
            long r0 = r11.A13     // Catch:{ all -> 0x018a }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x018a }
            r12[r6] = r0     // Catch:{ all -> 0x018a }
            java.lang.String r0 = java.lang.String.valueOf(r14)     // Catch:{ all -> 0x018a }
            r6 = 1
            r12[r6] = r0     // Catch:{ all -> 0x018a }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x018a }
            r1.<init>()     // Catch:{ all -> 0x018a }
            r1.append(r9)     // Catch:{ all -> 0x018a }
            java.lang.String r0 = "writeDeviceReceipt/UPDATE_RECEIPT_DEVICE"
            r1.append(r0)     // Catch:{ all -> 0x018a }
            r1.toString()     // Catch:{ all -> 0x018a }
            int r0 = r2.A00(r3, r10, r13, r12)     // Catch:{ all -> 0x018a }
            long r0 = (long) r0     // Catch:{ all -> 0x018a }
            r12 = 0
            int r11 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r11 != 0) goto L_0x0186
            java.lang.String r11 = "primary_device_version"
            X.178 r1 = r4.A05     // Catch:{ all -> 0x018a }
            com.whatsapp.jid.UserJid r0 = r7.getUserJid()     // Catch:{ all -> 0x018a }
            java.lang.Long r0 = r1.A00(r0)     // Catch:{ all -> 0x018a }
            r10.put(r11, r0)     // Catch:{ all -> 0x018a }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x018a }
            r1.<init>()     // Catch:{ all -> 0x018a }
            r1.append(r9)     // Catch:{ all -> 0x018a }
            java.lang.String r0 = "writeDeviceReceipt/INSERT_RECEIPT_DEVICE"
            r1.append(r0)     // Catch:{ all -> 0x018a }
            r1.toString()     // Catch:{ all -> 0x018a }
            long r10 = r2.A02(r10, r3)     // Catch:{ all -> 0x018a }
            r1 = -1
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0186
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x018a }
            r1.<init>()     // Catch:{ all -> 0x018a }
            r1.append(r9)     // Catch:{ all -> 0x018a }
            java.lang.String r0 = "writedevicereceipt/replace/failed "
            r1.append(r0)     // Catch:{ all -> 0x018a }
            r1.append(r8)     // Catch:{ all -> 0x018a }
            java.lang.String r0 = " "
            r1.append(r0)     // Catch:{ all -> 0x018a }
            r1.append(r7)     // Catch:{ all -> 0x018a }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x018a }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x018a }
            X.0so r3 = r4.A01     // Catch:{ all -> 0x018a }
            java.lang.String r2 = "ReceiptsMessageStore: replace failed"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x018a }
            r1.<init>()     // Catch:{ all -> 0x018a }
            java.lang.String r0 = "key="
            r1.append(r0)     // Catch:{ all -> 0x018a }
            r1.append(r8)     // Catch:{ all -> 0x018a }
            java.lang.String r0 = " device="
            r1.append(r0)     // Catch:{ all -> 0x018a }
            r1.append(r7)     // Catch:{ all -> 0x018a }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x018a }
            r3.AcB(r2, r0, r6)     // Catch:{ all -> 0x018a }
            goto L_0x0186
        L_0x0182:
            java.lang.String r3 = "message_add_on_receipt_device"
            goto L_0x00cf
        L_0x0186:
            r5.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x018f }
            return
        L_0x018a:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x018e }
        L_0x018e:
            throw r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x018f }
        L_0x018f:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            X.0ym r0 = r4.A03
            r0.A02()
        L_0x0198:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass16V.A01(com.whatsapp.jid.DeviceJid, X.0tZ, long):void");
    }

    public void A02(C16740tZ r4, Set set) {
        AnonymousClass17A r1 = r4 instanceof C38541qx ? this.A01 : this.A02;
        C28381Vw r2 = r4.A11;
        set.size();
        try {
            r1.A02(r4, set, false);
        } catch (SQLiteConstraintException e2) {
            Log.e((Throwable) e2);
            StringBuilder sb = new StringBuilder("BaseReceiptDeviceStore: Tried to add message twice: Message id:");
            sb.append(r2.A01);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0022 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03(java.util.Set r4) {
        /*
            r3 = this;
            X.0tq r0 = r3.A03
            X.0tf r2 = r0.A02()
            X.1cj r1 = r2.A00()     // Catch:{ all -> 0x0023 }
            X.17B r0 = r3.A02     // Catch:{ all -> 0x001e }
            r0.A03(r4)     // Catch:{ all -> 0x001e }
            X.179 r0 = r3.A01     // Catch:{ all -> 0x001e }
            r0.A03(r4)     // Catch:{ all -> 0x001e }
            r1.A00()     // Catch:{ all -> 0x001e }
            r1.close()     // Catch:{ all -> 0x0023 }
            r2.close()
            return
        L_0x001e:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0022 }
        L_0x0022:
            throw r0     // Catch:{ all -> 0x0023 }
        L_0x0023:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0027 }
        L_0x0027:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass16V.A03(java.util.Set):void");
    }
}
