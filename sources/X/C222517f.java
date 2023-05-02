package X;

import android.os.Handler;
import android.os.Message;
import com.mod2.fblibs.FacebookFacade;
import com.obwhatsapp.jobqueue.job.SendReadReceiptJob;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.17f  reason: invalid class name and case insensitive filesystem */
public class C222517f {
    public final C19000xb A00;
    public final AnonymousClass17G A01;
    public final AnonymousClass19A A02;
    public final C17190ug A03;
    public final C19790z0 A04;
    public final C207811o A05;

    public C222517f(C19000xb r1, AnonymousClass17G r2, AnonymousClass19A r3, C17190ug r4, C19790z0 r5, C207811o r6) {
        this.A00 = r1;
        this.A03 = r4;
        this.A01 = r2;
        this.A04 = r5;
        this.A05 = r6;
        this.A02 = r3;
    }

    public static HashMap A00(Collection collection) {
        String str;
        StringBuilder sb;
        String str2;
        HashMap hashMap = new HashMap();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C16740tZ r6 = (C16740tZ) it.next();
            if (r6.A0C == 16) {
                sb = new StringBuilder();
                str2 = "skipping read receipt since its already sent; message.key=";
            } else {
                byte b2 = r6.A10;
                if (b2 == 11) {
                    sb = new StringBuilder();
                    str2 = "skipping read receipt due to decryption failure; message.key=";
                } else if (b2 == 31) {
                    sb = new StringBuilder();
                    str2 = "skipping read receipt due to multi device placeholder; message.key=";
                } else {
                    if (C38621r6.A0o(r6)) {
                        str = "skip read receipt for revoked message";
                    } else if (b2 == 19) {
                        sb = new StringBuilder();
                        str2 = "skip read receipt for hsm rejection message. key=";
                    } else if (b2 == 21) {
                        str = "skip sending read receipt for request declined message.";
                    } else {
                        C28381Vw r4 = r6.A11;
                        C38551qy r0 = new C38551qy(r4.A00, r6.A0B(), r6 instanceof C38541qx);
                        AbstractCollection abstractCollection = (AbstractCollection) hashMap.get(r0);
                        if (abstractCollection == null) {
                            abstractCollection = new ArrayList();
                            hashMap.put(r0, abstractCollection);
                        }
                        abstractCollection.add(r4.A01);
                    }
                    Log.i(str);
                }
            }
            sb.append(str2);
            sb.append(r6.A11);
            str = sb.toString();
            Log.i(str);
        }
        return hashMap;
    }

    public final void A01(Message message, long j2) {
        this.A05.A03(j2);
        this.A03.A09(message, false);
    }

    public void A02(Jid jid, String str, long j2) {
        if (str != null) {
            C34481kL r1 = new C34481kL();
            r1.A01 = jid;
            r1.A02 = null;
            r1.A07 = str;
            r1.A00 = j2;
            r1.A08 = FacebookFacade.RequestParameter.PICTURE;
            r1.A05 = "notification";
            this.A03.A0E(r1.A00());
        }
    }

    public void A03(C16740tZ r7) {
        if (r7.A10 == 31) {
            A06(r7, (String) null);
        } else if (!C16030sJ.A0P(r7.A0B()) && !r7.A0w) {
            if (r7.A0C == 13) {
                C19790z0 r5 = this.A04;
                if (r5.A00(r7.A11.A00) && r7.A0I >= 1415214000000L && !C38621r6.A0o(r7) && !r7.A1D) {
                    if (r7.A1E) {
                        if (!r5.A02(r7)) {
                            A01(Message.obtain((Handler) null, 0, 9, 0, r7), r7.A16);
                        }
                        r7.A1E = false;
                    }
                    A04(r7);
                    return;
                }
            }
            A01(Message.obtain((Handler) null, 0, 9, 0, r7), r7.A16);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002b, code lost:
        if (X.C16030sJ.A0P(r5) != false) goto L_0x002d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04(X.C16740tZ r14) {
        /*
            r13 = this;
            int r1 = r14.A0C
            r0 = 16
            if (r1 == r0) goto L_0x004b
            boolean r0 = X.C38621r6.A0o(r14)
            if (r0 != 0) goto L_0x004b
            byte r1 = r14.A10
            r0 = 19
            if (r1 == r0) goto L_0x004b
            r0 = 21
            if (r1 == r0) goto L_0x004b
            boolean r0 = X.C41061vA.A0I(r14)
            if (r0 != 0) goto L_0x004b
            X.0rv r5 = r14.A0B()
            boolean r0 = r14 instanceof X.C38541qx
            r3 = 0
            r2 = 1
            if (r0 != 0) goto L_0x002d
            boolean r0 = X.C16030sJ.A0P(r5)
            r12 = 0
            if (r0 == 0) goto L_0x002e
        L_0x002d:
            r12 = 1
        L_0x002e:
            X.0xb r1 = r13.A00
            X.1Vw r0 = r14.A11
            X.0rv r4 = r0.A00
            X.AnonymousClass00B.A06(r4)
            com.whatsapp.jid.DeviceJid r6 = r14.A19
            java.lang.String[] r7 = new java.lang.String[r2]
            java.lang.String r0 = r0.A01
            r7[r3] = r0
            long r8 = r14.A0I
            long r10 = r14.A16
            com.obwhatsapp.jobqueue.job.SendReadReceiptJob r3 = new com.obwhatsapp.jobqueue.job.SendReadReceiptJob
            r3.<init>(r4, r5, r6, r7, r8, r10, r12)
            r1.A00(r3)
        L_0x004b:
            X.1Vw r0 = r14.A11
            X.0rv r2 = r0.A00
            boolean r0 = X.C16030sJ.A0Q(r2)
            if (r0 != 0) goto L_0x0066
            X.0z0 r0 = r13.A04
            boolean r0 = r0.A02(r14)
            if (r0 == 0) goto L_0x0066
            int r1 = r14.A0C
            r0 = 17
            if (r1 != r0) goto L_0x0067
            r13.A05(r14)
        L_0x0066:
            return
        L_0x0067:
            X.19A r1 = r13.A02
            X.AnonymousClass00B.A06(r2)
            long r3 = r14.A13
            long r5 = r14.A14
            r1.A00(r2, r3, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C222517f.A04(X.0tZ):void");
    }

    public final void A05(C16740tZ r3) {
        if (!(r3 instanceof C38541qx)) {
            r3.A0W(16);
            try {
                this.A01.A07(r3, false);
            } catch (IOException e2) {
                Log.e("Failed to update msg status back to 16", e2);
            }
        }
    }

    public void A06(C16740tZ r11, String str) {
        long j2 = r11.A16;
        C28381Vw r0 = r11.A11;
        C15830rv r4 = r0.A00;
        AnonymousClass00B.A06(r4);
        C15830rv A0B = r11.A0B();
        String str2 = r0.A01;
        C15830rv r3 = A0B;
        if (!C16030sJ.A0G(A0B)) {
            r3 = r4;
            r4 = A0B;
        }
        A01(Message.obtain((Handler) null, 0, 129, 0, new C41051v9(r3, r4, str2, str, (String) null, j2)), j2);
    }

    public void A07(C30161br r7) {
        if (!r7.A0f) {
            C16740tZ r0 = r7.A0B;
            if (r0 == null) {
                A01(Message.obtain((Handler) null, 0, 9, 0, r7.A02((byte) 0)), r7.A06);
                return;
            }
            A03(r0);
        }
    }

    public void A08(C30161br r12, String str, String str2) {
        long j2 = r12.A06;
        C15830rv A002 = C16030sJ.A00(r12.A0k);
        C15830rv A003 = C16030sJ.A00(r12.A08);
        String str3 = r12.A0o;
        C15830rv r4 = A003;
        if (!C16030sJ.A0G(A003)) {
            r4 = A002;
            A002 = A003;
        }
        A01(Message.obtain((Handler) null, 0, 129, 0, new C41051v9(r4, A002, str3, str, str2, j2)), j2);
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public void A09(java.util.Collection r13) {
        /*
            r12 = this;
            java.util.HashMap r0 = A00(r13)
            r12.A0A(r0)
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.util.Iterator r10 = r13.iterator()
        L_0x0015:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0079
            java.lang.Object r8 = r10.next()
            X.0tZ r8 = (X.C16740tZ) r8
            X.0z0 r0 = r12.A04
            boolean r0 = r0.A02(r8)
            if (r0 == 0) goto L_0x0015
            int r1 = r8.A0C
            r0 = 17
            if (r1 != r0) goto L_0x0033
            r12.A05(r8)
            goto L_0x0015
        L_0x0033:
            X.1Vw r0 = r8.A11
            X.0rv r9 = r0.A00
            boolean r0 = X.C16030sJ.A0Q(r9)
            if (r0 == 0) goto L_0x0064
            X.0rv r2 = r8.A0B()
            boolean r0 = X.C16030sJ.A0O(r2)
            if (r0 == 0) goto L_0x0015
            java.lang.Object r0 = r3.get(r2)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 != 0) goto L_0x0059
            long r0 = r8.A14
        L_0x0051:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3.put(r2, r0)
            goto L_0x0015
        L_0x0059:
            long r4 = r0.longValue()
            long r0 = r8.A14
            long r0 = java.lang.Math.max(r4, r0)
            goto L_0x0051
        L_0x0064:
            java.lang.Object r6 = r7.get(r9)
            X.0tZ r6 = (X.C16740tZ) r6
            if (r6 == 0) goto L_0x0075
            long r4 = r6.A14
            long r1 = r8.A14
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0075
            r8 = r6
        L_0x0075:
            r7.put(r9, r8)
            goto L_0x0015
        L_0x0079:
            java.util.Set r0 = r7.entrySet()
            java.util.Iterator r2 = r0.iterator()
        L_0x0081:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00a9
            java.lang.Object r1 = r2.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            X.19A r4 = r12.A02
            java.lang.Object r5 = r1.getKey()
            X.0rv r5 = (X.C15830rv) r5
            java.lang.Object r0 = r1.getValue()
            X.0tZ r0 = (X.C16740tZ) r0
            long r6 = r0.A13
            java.lang.Object r0 = r1.getValue()
            X.0tZ r0 = (X.C16740tZ) r0
            long r8 = r0.A14
            r4.A00(r5, r6, r8)
            goto L_0x0081
        L_0x00a9:
            java.util.Set r0 = r3.entrySet()
            java.util.Iterator r11 = r0.iterator()
        L_0x00b1:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0188
            java.lang.Object r0 = r11.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            X.19A r5 = r12.A02
            java.lang.Object r8 = r0.getKey()
            com.whatsapp.jid.UserJid r8 = (com.whatsapp.jid.UserJid) r8
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            java.lang.String r2 = "msgstore/setstatusreadreceiptssent/"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            r3.append(r8)
            java.lang.String r2 = " "
            r3.append(r2)
            r3.append(r0)
            java.lang.String r2 = r3.toString()
            com.whatsapp.util.Log.i((java.lang.String) r2)
            X.11G r10 = r5.A08
            X.1dI r6 = r10.A06(r8)
            if (r6 != 0) goto L_0x0102
            java.lang.String r1 = "msgstore/setstatusreadreceiptssent/no status for "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            goto L_0x00b1
        L_0x0102:
            monitor-enter(r6)
            long r2 = r6.A07     // Catch:{ all -> 0x0185 }
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x010b
            r6.A07 = r0     // Catch:{ all -> 0x0185 }
        L_0x010b:
            X.1dI r2 = r6.A05()     // Catch:{ all -> 0x0185 }
            monitor-exit(r6)
            monitor-enter(r2)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0175, Error | RuntimeException -> 0x0180 }
            long r0 = r2.A07     // Catch:{ all -> 0x0172 }
            monitor-exit(r2)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0175, Error | RuntimeException -> 0x0180 }
            boolean r7 = r10.A0H()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0175, Error | RuntimeException -> 0x0180 }
            X.0tq r2 = r10.A02     // Catch:{ SQLiteDatabaseCorruptException -> 0x0175, Error | RuntimeException -> 0x0180 }
            X.0tf r6 = r2.A02()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0175, Error | RuntimeException -> 0x0180 }
            android.content.ContentValues r9 = new android.content.ContentValues     // Catch:{ all -> 0x016d }
            r9.<init>()     // Catch:{ all -> 0x016d }
            java.lang.String r2 = "last_read_receipt_sent_message_table_id"
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x016d }
            r9.put(r2, r0)     // Catch:{ all -> 0x016d }
            X.0tg r4 = r6.A02     // Catch:{ all -> 0x016d }
            if (r7 == 0) goto L_0x0162
            java.lang.String r3 = "status_list"
            java.lang.String r2 = "key_remote_jid=?"
        L_0x0135:
            java.lang.String[] r1 = r10.A0K(r8, r7)     // Catch:{ all -> 0x016d }
            java.lang.String r0 = "updateLastReadReceiptSentMessageRowId/UPDATE"
            X.AnonymousClass11G.A01(r0, r7)     // Catch:{ all -> 0x016d }
            int r0 = r4.A00(r3, r9, r2, r1)     // Catch:{ all -> 0x016d }
            if (r0 != 0) goto L_0x0168
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x016d }
            r1.<init>()     // Catch:{ all -> 0x016d }
            java.lang.String r0 = "StatusStore/updateLastReadReceiptSentMessageTableId/no status saved for "
            r1.append(r0)     // Catch:{ all -> 0x016d }
            r1.append(r8)     // Catch:{ all -> 0x016d }
            java.lang.String r0 = "; shouldUseDeprecatedTable="
            r1.append(r0)     // Catch:{ all -> 0x016d }
            r1.append(r7)     // Catch:{ all -> 0x016d }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x016d }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x016d }
            goto L_0x0168
        L_0x0162:
            java.lang.String r3 = "status"
            java.lang.String r2 = "jid_row_id=?"
            goto L_0x0135
        L_0x0168:
            r6.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0175, Error | RuntimeException -> 0x0180 }
            goto L_0x00b1
        L_0x016d:
            r0 = move-exception
            r6.close()     // Catch:{ all -> 0x0171 }
        L_0x0171:
            throw r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x0175, Error | RuntimeException -> 0x0180 }
        L_0x0172:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0175, Error | RuntimeException -> 0x0180 }
            throw r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x0175, Error | RuntimeException -> 0x0180 }
        L_0x0175:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            X.0ym r0 = r5.A06
            r0.A02()
            goto L_0x00b1
        L_0x0180:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            throw r0
        L_0x0185:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L_0x0188:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C222517f.A09(java.util.Collection):void");
    }

    public void A0A(HashMap hashMap) {
        for (Map.Entry entry : hashMap.entrySet()) {
            int size = ((AbstractCollection) entry.getValue()).size();
            int i2 = 0;
            while (i2 < size) {
                int min = Math.min(i2 + 256, size);
                this.A00.A00(new SendReadReceiptJob(((C38551qy) entry.getKey()).A00, ((C38551qy) entry.getKey()).A01, (DeviceJid) null, (String[]) ((AbstractList) entry.getValue()).subList(i2, min).toArray(new String[0]), -1, 0, ((C38551qy) entry.getKey()).A02));
                i2 = min;
            }
        }
    }
}
