package X;

import com.facebook.redex.IDxComparatorShape19S0000000_2_I0;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.119  reason: invalid class name */
public class AnonymousClass119 {
    public final C16440t3 A00;
    public final C16820th A01;
    public final C16920ts A02;
    public final AnonymousClass17H A03;
    public final AnonymousClass0y0 A04;
    public final C19650ym A05;
    public final C16900tq A06;
    public final AnonymousClass15B A07;
    public final Map A08;
    public final AtomicBoolean A09;

    public AnonymousClass119(C16440t3 r2, C16820th r3, C16920ts r4, AnonymousClass17H r5, AnonymousClass0y0 r6, C19650ym r7, C16900tq r8, AnonymousClass15B r9) {
        this.A00 = r2;
        this.A02 = r4;
        this.A07 = r9;
        this.A01 = r3;
        this.A04 = r6;
        this.A03 = r5;
        this.A06 = r8;
        this.A05 = r7;
        this.A08 = r5.A02;
        this.A09 = r5.A03;
    }

    public int A00(C15830rv r4) {
        int i2 = 0;
        if (r4 != null) {
            Iterator it = A01().iterator();
            while (it.hasNext()) {
                if (r4.equals(((C16740tZ) it.next()).A11.A00)) {
                    i2++;
                }
            }
        }
        return i2;
    }

    public ArrayList A01() {
        long A002 = this.A00.A00();
        if (!this.A09.get()) {
            A02();
        }
        Map map = this.A03.A02;
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            if (((C16740tZ) ((Map.Entry) it.next()).getValue()).A0I + 86400000 < A002) {
                it.remove();
            }
        }
        StringBuilder sb = new StringBuilder("msgstore/unsendmessages/cached:");
        sb.append(map.size());
        Log.i(sb.toString());
        ArrayList arrayList = new ArrayList(map.size());
        for (Object add : map.values()) {
            arrayList.add(add);
        }
        Collections.sort(arrayList, new IDxComparatorShape19S0000000_2_I0(36));
        return arrayList;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:48:0x00d7 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x00dc */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02() {
        /*
            r13 = this;
            java.util.concurrent.atomic.AtomicBoolean r4 = r13.A09
            monitor-enter(r4)
            boolean r0 = r4.get()     // Catch:{ all -> 0x0140 }
            if (r0 != 0) goto L_0x013e
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x0140 }
            r3.<init>()     // Catch:{ all -> 0x0140 }
            r10 = 0
            X.1Zf r7 = new X.1Zf     // Catch:{ all -> 0x0140 }
            r7.<init>((boolean) r10)     // Catch:{ all -> 0x0140 }
            java.lang.String r0 = "unsentmsgstore/unsendmessages"
            r7.A04(r0)     // Catch:{ all -> 0x0140 }
            X.15B r2 = r13.A07     // Catch:{ all -> 0x0140 }
            X.0t3 r0 = r13.A00     // Catch:{ all -> 0x0140 }
            long r0 = r0.A00()     // Catch:{ all -> 0x0140 }
            r5 = 86400000(0x5265c00, double:4.2687272E-316)
            long r0 = r0 - r5
            long r11 = r2.A04(r0)     // Catch:{ all -> 0x0140 }
            r6 = 1
            r5 = 0
            X.0tq r0 = r13.A06     // Catch:{ IllegalStateException -> 0x00e4, SQLiteDatabaseCorruptException -> 0x00ec, SQLiteFullException -> 0x00dd }
            X.0tf r2 = r0.get()     // Catch:{ IllegalStateException -> 0x00e4, SQLiteDatabaseCorruptException -> 0x00ec, SQLiteFullException -> 0x00dd }
            X.0tg r9 = r2.A02     // Catch:{ all -> 0x00d8 }
            java.lang.String r8 = X.AnonymousClass1WW.A0K     // Catch:{ all -> 0x00d8 }
            java.lang.String[] r1 = new java.lang.String[r6]     // Catch:{ all -> 0x00d8 }
            java.lang.String r0 = java.lang.String.valueOf(r11)     // Catch:{ all -> 0x00d8 }
            r1[r10] = r0     // Catch:{ all -> 0x00d8 }
            android.database.Cursor r8 = r9.A08(r8, r1)     // Catch:{ all -> 0x00d8 }
            if (r8 != 0) goto L_0x0049
            r2.close()     // Catch:{ IllegalStateException -> 0x00e4, SQLiteDatabaseCorruptException -> 0x00ec, SQLiteFullException -> 0x00dd }
            goto L_0x013e
        L_0x0049:
            java.lang.String r0 = "chat_row_id"
            int r9 = r8.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00d3 }
        L_0x004f:
            boolean r0 = r8.moveToNext()     // Catch:{ all -> 0x00d3 }
            if (r0 == 0) goto L_0x00cc
            X.0ts r10 = r13.A02     // Catch:{ all -> 0x00d3 }
            int r0 = r8.getInt(r9)     // Catch:{ all -> 0x00d3 }
            long r0 = (long) r0     // Catch:{ all -> 0x00d3 }
            X.0rv r1 = r10.A05(r0)     // Catch:{ all -> 0x00d3 }
            if (r1 != 0) goto L_0x0069
            java.lang.String r0 = "unsentmsgstore/unsent/jid is null!"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x00d3 }
            goto L_0x004f
        L_0x0069:
            X.0th r0 = r13.A01     // Catch:{ all -> 0x00d3 }
            X.0tZ r10 = r0.A02(r8, r1, r5)     // Catch:{ all -> 0x00d3 }
            if (r10 != 0) goto L_0x0078
            java.lang.String r0 = "unsentmsgstore/unsent/can't read message from cursor."
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x00d3 }
            goto L_0x004f
        L_0x0078:
            byte r12 = r10.A10     // Catch:{ all -> 0x00d3 }
            r0 = 8
            if (r12 == r0) goto L_0x004f
            r0 = 10
            if (r12 == r0) goto L_0x004f
            r0 = 7
            if (r12 == r0) goto L_0x004f
            int r11 = r10.A0C     // Catch:{ all -> 0x00d3 }
            if (r11 != r0) goto L_0x0094
            X.1Vw r0 = r10.A11     // Catch:{ all -> 0x00d3 }
            X.0rv r0 = r0.A00     // Catch:{ all -> 0x00d3 }
            boolean r0 = X.C16030sJ.A0L(r0)     // Catch:{ all -> 0x00d3 }
            if (r0 == 0) goto L_0x0094
            goto L_0x004f
        L_0x0094:
            boolean r0 = r10.A0t     // Catch:{ all -> 0x00d3 }
            if (r0 == 0) goto L_0x009f
            boolean r0 = X.C16030sJ.A0G(r1)     // Catch:{ all -> 0x00d3 }
            if (r0 != 0) goto L_0x009f
            goto L_0x004f
        L_0x009f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00d3 }
            r1.<init>()     // Catch:{ all -> 0x00d3 }
            java.lang.String r0 = "unsentmsgstore/unsent/add key="
            r1.append(r0)     // Catch:{ all -> 0x00d3 }
            X.1Vw r0 = r10.A11     // Catch:{ all -> 0x00d3 }
            java.lang.String r0 = r0.A01     // Catch:{ all -> 0x00d3 }
            r1.append(r0)     // Catch:{ all -> 0x00d3 }
            java.lang.String r0 = " type="
            r1.append(r0)     // Catch:{ all -> 0x00d3 }
            r1.append(r12)     // Catch:{ all -> 0x00d3 }
            java.lang.String r0 = " status="
            r1.append(r0)     // Catch:{ all -> 0x00d3 }
            r1.append(r11)     // Catch:{ all -> 0x00d3 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00d3 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00d3 }
            r3.add(r10)     // Catch:{ all -> 0x00d3 }
            goto L_0x004f
        L_0x00cc:
            r8.close()     // Catch:{ all -> 0x00d8 }
            r2.close()     // Catch:{ IllegalStateException -> 0x00e4, SQLiteDatabaseCorruptException -> 0x00ec, SQLiteFullException -> 0x00dd }
            goto L_0x00f5
        L_0x00d3:
            r0 = move-exception
            r8.close()     // Catch:{ all -> 0x00d7 }
        L_0x00d7:
            throw r0     // Catch:{ all -> 0x00d8 }
        L_0x00d8:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x00dc }
        L_0x00dc:
            throw r0     // Catch:{ IllegalStateException -> 0x00e4, SQLiteDatabaseCorruptException -> 0x00ec, SQLiteFullException -> 0x00dd }
        L_0x00dd:
            r1 = move-exception
            X.0y0 r0 = r13.A04     // Catch:{ all -> 0x0140 }
            r0.A00(r5)     // Catch:{ all -> 0x0140 }
            throw r1     // Catch:{ all -> 0x0140 }
        L_0x00e4:
            r1 = move-exception
            java.lang.String r0 = "unsentmsgstore/unsent/IllegalStateException "
            com.whatsapp.util.Log.i(r0, r1)     // Catch:{ all -> 0x0140 }
            goto L_0x00f5
        L_0x00ec:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)     // Catch:{ all -> 0x0140 }
            X.0ym r0 = r13.A05     // Catch:{ all -> 0x0140 }
            r0.A02()     // Catch:{ all -> 0x0140 }
        L_0x00f5:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0140 }
            r2.<init>()     // Catch:{ all -> 0x0140 }
            java.lang.String r0 = "unsentmsgstore/unsent "
            r2.append(r0)     // Catch:{ all -> 0x0140 }
            int r0 = r3.size()     // Catch:{ all -> 0x0140 }
            r2.append(r0)     // Catch:{ all -> 0x0140 }
            java.lang.String r0 = " | time spent:"
            r2.append(r0)     // Catch:{ all -> 0x0140 }
            long r0 = r7.A01()     // Catch:{ all -> 0x0140 }
            r2.append(r0)     // Catch:{ all -> 0x0140 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0140 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0140 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0140 }
        L_0x011e:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x0140 }
            if (r0 == 0) goto L_0x0132
            java.lang.Object r2 = r3.next()     // Catch:{ all -> 0x0140 }
            X.0tZ r2 = (X.C16740tZ) r2     // Catch:{ all -> 0x0140 }
            java.util.Map r1 = r13.A08     // Catch:{ all -> 0x0140 }
            X.1Vw r0 = r2.A11     // Catch:{ all -> 0x0140 }
            r1.put(r0, r2)     // Catch:{ all -> 0x0140 }
            goto L_0x011e
        L_0x0132:
            boolean r0 = r4.compareAndSet(r5, r6)     // Catch:{ all -> 0x0140 }
            if (r0 != 0) goto L_0x013e
            java.lang.String r0 = "unsent messages cache initialization failed to change the related flag"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0140 }
        L_0x013e:
            monitor-exit(r4)     // Catch:{ all -> 0x0140 }
            return
        L_0x0140:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0140 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass119.A02():void");
    }

    public boolean A03() {
        if (!this.A09.get()) {
            A02();
        }
        AnonymousClass17H r1 = this.A03;
        long A002 = this.A00.A00();
        Map map = r1.A02;
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            if (((C16740tZ) ((Map.Entry) it.next()).getValue()).A0I + 86400000 < A002) {
                it.remove();
            }
        }
        return !map.isEmpty();
    }
}
