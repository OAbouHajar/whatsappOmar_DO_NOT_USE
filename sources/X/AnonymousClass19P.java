package X;

import android.content.ContentValues;
import com.facebook.redex.IDxTListenerShape94S0200000_2_I0;
import com.facebook.redex.RunnableRunnableShape7S0200000_I0_5;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import java.util.AbstractMap;

/* renamed from: X.19P  reason: invalid class name */
public class AnonymousClass19P {
    public final C216314v A00;
    public final C16900tq A01;
    public final C37381p4 A02 = new C37381p4();
    public final C16320sq A03;

    public AnonymousClass19P(C216314v r2, C16900tq r3, C16320sq r4) {
        this.A00 = r2;
        this.A03 = r4;
        this.A01 = r3;
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 177 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x00e0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Map A00(java.util.Set r22) {
        /*
            r21 = this;
            r10 = r21
            X.14v r9 = r10.A00
            boolean r0 = r9.A0C()
            if (r0 == 0) goto L_0x01a5
            boolean r0 = r22.isEmpty()
            if (r0 != 0) goto L_0x01a5
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r22.iterator()
        L_0x001e:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x004c
            java.lang.Object r2 = r3.next()
            com.whatsapp.jid.Jid r2 = (com.whatsapp.jid.Jid) r2
            X.1p4 r0 = r10.A02
            java.util.Map r1 = r0.A00
            boolean r0 = r1.containsKey(r2)
            if (r0 == 0) goto L_0x004a
            java.lang.Object r0 = r1.get(r2)
        L_0x0038:
            if (r0 == 0) goto L_0x003e
            r8.put(r2, r0)
            goto L_0x001e
        L_0x003e:
            long r0 = r9.A01(r2)
            java.lang.String r0 = java.lang.Long.toString(r0)
            r4.add(r0)
            goto L_0x001e
        L_0x004a:
            r0 = 0
            goto L_0x0038
        L_0x004c:
            java.lang.String[] r0 = X.AnonymousClass01S.A0H
            java.lang.Object[] r1 = r4.toArray(r0)
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            X.0tq r0 = r10.A01
            X.0tf r14 = r0.get()
            monitor-enter(r10)     // Catch:{ all -> 0x01a0 }
            java.util.HashSet r6 = new java.util.HashSet     // Catch:{ all -> 0x019d }
            r6.<init>()     // Catch:{ all -> 0x019d }
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch:{ all -> 0x019d }
            r13.<init>()     // Catch:{ all -> 0x019d }
            r0 = 975(0x3cf, float:1.366E-42)
            X.1jh r12 = new X.1jh     // Catch:{ all -> 0x019d }
            r12.<init>(r1, r0)     // Catch:{ all -> 0x019d }
        L_0x006f:
            boolean r0 = r12.hasNext()     // Catch:{ all -> 0x019d }
            if (r0 == 0) goto L_0x00e1
            java.lang.Object r4 = r12.next()     // Catch:{ all -> 0x019d }
            java.lang.String[] r4 = (java.lang.String[]) r4     // Catch:{ all -> 0x019d }
            X.0tg r3 = r14.A02     // Catch:{ all -> 0x019d }
            int r2 = r4.length     // Catch:{ all -> 0x019d }
            java.lang.String r0 = "SELECT user_jid_row_id, device_jid_row_id, key_index FROM user_device WHERE user_jid_row_id IN "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x019d }
            r1.<init>(r0)     // Catch:{ all -> 0x019d }
            java.lang.String r0 = X.C34111ji.A00(r2)     // Catch:{ all -> 0x019d }
            r1.append(r0)     // Catch:{ all -> 0x019d }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x019d }
            android.database.Cursor r5 = r3.A08(r0, r4)     // Catch:{ all -> 0x019d }
            java.lang.String r0 = "user_jid_row_id"
            int r4 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00da }
            java.lang.String r0 = "device_jid_row_id"
            int r3 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00da }
            java.lang.String r0 = "key_index"
            int r2 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00da }
        L_0x00a7:
            boolean r0 = r5.moveToNext()     // Catch:{ all -> 0x00da }
            if (r0 == 0) goto L_0x00d6
            long r0 = r5.getLong(r4)     // Catch:{ all -> 0x00da }
            long r17 = r5.getLong(r3)     // Catch:{ all -> 0x00da }
            long r19 = r5.getLong(r2)     // Catch:{ all -> 0x00da }
            java.lang.Long r11 = java.lang.Long.valueOf(r17)     // Catch:{ all -> 0x00da }
            r6.add(r11)     // Catch:{ all -> 0x00da }
            java.lang.Class<com.whatsapp.jid.UserJid> r11 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r0 = r9.A07(r11, r0)     // Catch:{ all -> 0x00da }
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0     // Catch:{ all -> 0x00da }
            X.AnonymousClass00B.A06(r0)     // Catch:{ all -> 0x00da }
            X.1p5 r15 = new X.1p5     // Catch:{ all -> 0x00da }
            r16 = r0
            r15.<init>(r16, r17, r19)     // Catch:{ all -> 0x00da }
            r13.add(r15)     // Catch:{ all -> 0x00da }
            goto L_0x00a7
        L_0x00d6:
            r5.close()     // Catch:{ all -> 0x019d }
            goto L_0x006f
        L_0x00da:
            r0 = move-exception
            if (r5 == 0) goto L_0x00e0
            r5.close()     // Catch:{ all -> 0x00e0 }
        L_0x00e0:
            throw r0     // Catch:{ all -> 0x019d }
        L_0x00e1:
            java.lang.Class<com.whatsapp.jid.DeviceJid> r0 = com.whatsapp.jid.DeviceJid.class
            java.util.Map r5 = r9.A09(r0, r6)     // Catch:{ all -> 0x019d }
            java.util.Iterator r6 = r13.iterator()     // Catch:{ all -> 0x019d }
        L_0x00eb:
            boolean r0 = r6.hasNext()     // Catch:{ all -> 0x019d }
            if (r0 == 0) goto L_0x0122
            java.lang.Object r4 = r6.next()     // Catch:{ all -> 0x019d }
            X.1p5 r4 = (X.C37391p5) r4     // Catch:{ all -> 0x019d }
            com.whatsapp.jid.UserJid r0 = r4.A02     // Catch:{ all -> 0x019d }
            java.lang.Object r3 = r7.get(r0)     // Catch:{ all -> 0x019d }
            java.util.Map r3 = (java.util.Map) r3     // Catch:{ all -> 0x019d }
            if (r3 != 0) goto L_0x0109
            java.util.HashMap r3 = new java.util.HashMap     // Catch:{ all -> 0x019d }
            r3.<init>()     // Catch:{ all -> 0x019d }
            r7.put(r0, r3)     // Catch:{ all -> 0x019d }
        L_0x0109:
            long r0 = r4.A00     // Catch:{ all -> 0x019d }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x019d }
            java.lang.Object r2 = r5.get(r0)     // Catch:{ all -> 0x019d }
            com.whatsapp.jid.DeviceJid r2 = (com.whatsapp.jid.DeviceJid) r2     // Catch:{ all -> 0x019d }
            X.AnonymousClass00B.A06(r2)     // Catch:{ all -> 0x019d }
            long r0 = r4.A01     // Catch:{ all -> 0x019d }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x019d }
            r3.put(r2, r0)     // Catch:{ all -> 0x019d }
            goto L_0x00eb
        L_0x0122:
            java.util.Set r0 = r7.entrySet()     // Catch:{ all -> 0x019d }
            java.util.Iterator r5 = r0.iterator()     // Catch:{ all -> 0x019d }
        L_0x012a:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x019d }
            if (r0 == 0) goto L_0x017a
            java.lang.Object r0 = r5.next()     // Catch:{ all -> 0x019d }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ all -> 0x019d }
            java.lang.Object r4 = r0.getKey()     // Catch:{ all -> 0x019d }
            com.whatsapp.jid.UserJid r4 = (com.whatsapp.jid.UserJid) r4     // Catch:{ all -> 0x019d }
            X.1C5 r3 = new X.1C5     // Catch:{ all -> 0x019d }
            r3.<init>()     // Catch:{ all -> 0x019d }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x019d }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ all -> 0x019d }
            java.util.Set r0 = r0.entrySet()     // Catch:{ all -> 0x019d }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ all -> 0x019d }
        L_0x014f:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x019d }
            if (r0 == 0) goto L_0x016b
            java.lang.Object r0 = r2.next()     // Catch:{ all -> 0x019d }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ all -> 0x019d }
            java.lang.Object r1 = r0.getKey()     // Catch:{ all -> 0x019d }
            com.whatsapp.jid.DeviceJid r1 = (com.whatsapp.jid.DeviceJid) r1     // Catch:{ all -> 0x019d }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x019d }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x019d }
            r3.put(r1, r0)     // Catch:{ all -> 0x019d }
            goto L_0x014f
        L_0x016b:
            X.0vs r1 = r3.build()     // Catch:{ all -> 0x019d }
            X.1p4 r0 = r10.A02     // Catch:{ all -> 0x019d }
            java.util.Map r0 = r0.A00     // Catch:{ all -> 0x019d }
            r0.put(r4, r1)     // Catch:{ all -> 0x019d }
            r8.put(r4, r1)     // Catch:{ all -> 0x019d }
            goto L_0x012a
        L_0x017a:
            java.util.Iterator r2 = r22.iterator()     // Catch:{ all -> 0x019d }
        L_0x017e:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x019d }
            if (r0 == 0) goto L_0x0198
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x019d }
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1     // Catch:{ all -> 0x019d }
            boolean r0 = r8.containsKey(r1)     // Catch:{ all -> 0x019d }
            if (r0 != 0) goto L_0x017e
            X.0vs r0 = X.C17930vs.of()     // Catch:{ all -> 0x019d }
            r8.put(r1, r0)     // Catch:{ all -> 0x019d }
            goto L_0x017e
        L_0x0198:
            monitor-exit(r10)     // Catch:{ all -> 0x019d }
            r14.close()
            return r8
        L_0x019d:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x019d }
            throw r0     // Catch:{ all -> 0x01a0 }
        L_0x01a0:
            r0 = move-exception
            r14.close()     // Catch:{ all -> 0x01a4 }
        L_0x01a4:
            throw r0
        L_0x01a5:
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass19P.A00(java.util.Set):java.util.Map");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x004e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0060 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(X.C17380uz r16, com.whatsapp.jid.UserJid r17) {
        /*
            r15 = this;
            X.0tq r10 = r15.A01
            X.0tf r7 = r10.A02()
            X.1cj r14 = r7.A00()     // Catch:{ all -> 0x0061 }
            X.1Ub r13 = r16.iterator()     // Catch:{ all -> 0x005c }
        L_0x000e:
            boolean r0 = r13.hasNext()     // Catch:{ all -> 0x005c }
            r2 = r17
            if (r0 == 0) goto L_0x004f
            java.lang.Object r1 = r13.next()     // Catch:{ all -> 0x005c }
            com.whatsapp.jid.DeviceJid r1 = (com.whatsapp.jid.DeviceJid) r1     // Catch:{ all -> 0x005c }
            X.14v r0 = r15.A00     // Catch:{ all -> 0x005c }
            long r11 = r0.A01(r2)     // Catch:{ all -> 0x005c }
            long r8 = r0.A01(r1)     // Catch:{ all -> 0x005c }
            X.0tf r6 = r10.A02()     // Catch:{ all -> 0x005c }
            X.0tg r5 = r6.A02     // Catch:{ all -> 0x004a }
            java.lang.String r4 = "user_device"
            java.lang.String r3 = "user_jid_row_id= ? AND device_jid_row_id = ?"
            r0 = 2
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x004a }
            r1 = 0
            java.lang.String r0 = java.lang.String.valueOf(r11)     // Catch:{ all -> 0x004a }
            r2[r1] = r0     // Catch:{ all -> 0x004a }
            r1 = 1
            java.lang.String r0 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x004a }
            r2[r1] = r0     // Catch:{ all -> 0x004a }
            r5.A01(r4, r3, r2)     // Catch:{ all -> 0x004a }
            r6.close()     // Catch:{ all -> 0x005c }
            goto L_0x000e
        L_0x004a:
            r0 = move-exception
            r6.close()     // Catch:{ all -> 0x004e }
        L_0x004e:
            throw r0     // Catch:{ all -> 0x005c }
        L_0x004f:
            r14.A00()     // Catch:{ all -> 0x005c }
            r15.A02(r7, r2)     // Catch:{ all -> 0x005c }
            r14.close()     // Catch:{ all -> 0x0061 }
            r7.close()
            return
        L_0x005c:
            r0 = move-exception
            r14.close()     // Catch:{ all -> 0x0060 }
        L_0x0060:
            throw r0     // Catch:{ all -> 0x0061 }
        L_0x0061:
            r0 = move-exception
            r7.close()     // Catch:{ all -> 0x0065 }
        L_0x0065:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass19P.A01(X.0uz, com.whatsapp.jid.UserJid):void");
    }

    public final void A02(C16800tf r5, UserJid userJid) {
        RunnableRunnableShape7S0200000_I0_5 runnableRunnableShape7S0200000_I0_5 = new RunnableRunnableShape7S0200000_I0_5(this, 17, userJid);
        AnonymousClass00B.A0G(r5.A02.A00.inTransaction());
        C33921jP r2 = r5.A01;
        IDxTListenerShape94S0200000_2_I0 iDxTListenerShape94S0200000_2_I0 = new IDxTListenerShape94S0200000_2_I0(r2, 0, runnableRunnableShape7S0200000_I0_5);
        Object obj = r2.A02.get();
        AnonymousClass00B.A06(obj);
        ((AbstractMap) obj).put(userJid, iDxTListenerShape94S0200000_2_I0);
    }

    public void A03(DeviceJid deviceJid, UserJid userJid, long j2) {
        C16800tf A022 = this.A01.A02();
        try {
            C216314v r0 = this.A00;
            long A012 = r0.A01(userJid);
            long A013 = r0.A01(deviceJid);
            ContentValues contentValues = new ContentValues(3);
            contentValues.put("user_jid_row_id", Long.valueOf(A012));
            contentValues.put("device_jid_row_id", Long.valueOf(A013));
            contentValues.put("key_index", Long.valueOf(j2));
            A022.A02.A06(contentValues, "user_device", 4);
            A022.close();
            return;
        } catch (Throwable unused) {
        }
        throw th;
    }
}
