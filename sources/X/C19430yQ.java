package X;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.location.Location;
import android.os.Handler;
import android.util.Pair;
import com.facebook.redex.IDxCallableShape45S0200000_2_I0;
import com.facebook.redex.RunnableRunnableShape10S0100000_I0_9;
import com.facebook.redex.RunnableRunnableShape8S0200000_I0_6;
import com.obwhatsapp.contact.IDxCObserverShape68S0100000_2_I0;
import com.obwhatsapp.data.IDxMObserverShape73S0100000_1_I0;
import com.obwhatsapp.jobqueue.job.SendFinalLiveLocationNotificationJob;
import com.obwhatsapp.jobqueue.job.SendLiveLocationKeyJob;
import com.obwhatsapp.location.FinalLiveLocationBroadcastReceiver;
import com.obwhatsapp.location.LocationSharingService;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;

/* renamed from: X.0yQ  reason: invalid class name and case insensitive filesystem */
public class C19430yQ {
    public int A00 = 0;
    public long A01 = 0;
    public C33481ie A02;
    public C18940xV A03;
    public C39721sx A04;
    public Long A05 = null;
    public Map A06;
    public Map A07;
    public final Handler A08 = new Handler();
    public final C16040sK A09;
    public final C19000xb A0A;
    public final C19250y7 A0B;
    public final C16000sG A0C;
    public final C17140ub A0D;
    public final C210712r A0E;
    public final AnonymousClass01V A0F;
    public final C16440t3 A0G;
    public final C16980tz A0H;
    public final C208211s A0I;
    public final AnonymousClass16P A0J;
    public final AnonymousClass11A A0K;
    public final C19150xq A0L;
    public final AnonymousClass1GE A0M;
    public final C27461Rv A0N;
    public final C27471Rw A0O;
    public final AnonymousClass01D A0P;
    public final Object A0Q = new Object();
    public final Object A0R = new Object();
    public final Object A0S = new Object();
    public final Runnable A0T = new RunnableRunnableShape10S0100000_I0_9((Object) this, 26);
    public final Runnable A0U = new RunnableRunnableShape10S0100000_I0_9((Object) this, 25);
    public final HashSet A0V = new HashSet();
    public final List A0W = new ArrayList();
    public final List A0X = new ArrayList();
    public final Map A0Y = new HashMap();
    public final Map A0Z = new HashMap();
    public final Map A0a = new HashMap();
    public final Map A0b = new HashMap();
    public final Map A0c = new HashMap();
    public volatile AnonymousClass01D A0d;

    public C19430yQ(C16040sK r3, C19000xb r4, C19250y7 r5, C16000sG r6, C17140ub r7, C210712r r8, AnonymousClass01V r9, C16440t3 r10, C16980tz r11, C208211s r12, AnonymousClass16P r13, AnonymousClass11A r14, C19150xq r15, AnonymousClass1GE r16, C27461Rv r17, C27471Rw r18, AnonymousClass01D r19) {
        this.A0H = r11;
        this.A0G = r10;
        this.A0E = r8;
        this.A09 = r3;
        this.A0A = r4;
        this.A0C = r6;
        this.A0J = r13;
        this.A0F = r9;
        this.A0D = r7;
        this.A0L = r15;
        this.A0M = r16;
        this.A0I = r12;
        this.A0B = r5;
        this.A0O = r18;
        this.A0P = r19;
        this.A0N = r17;
        this.A0K = r14;
        IDxCObserverShape68S0100000_2_I0 iDxCObserverShape68S0100000_2_I0 = new IDxCObserverShape68S0100000_2_I0(this, 21);
        this.A02 = iDxCObserverShape68S0100000_2_I0;
        r7.A02(iDxCObserverShape68S0100000_2_I0);
        IDxMObserverShape73S0100000_1_I0 iDxMObserverShape73S0100000_1_I0 = new IDxMObserverShape73S0100000_1_I0(this, 3);
        this.A03 = iDxMObserverShape73S0100000_1_I0;
        r15.A02(iDxMObserverShape73S0100000_1_I0);
    }

    public static final C39721sx A00(UserJid userJid, C33211iD r6, C38841rV r7) {
        C438621v r3 = r6.A0T;
        if (r3 == null) {
            r3 = C438621v.A0B;
        }
        C39721sx r62 = new C39721sx(userJid);
        r62.A00 = r3.A00;
        r62.A01 = r3.A01;
        r62.A03 = r3.A03;
        int i2 = r3.A04;
        if ((i2 & 8) == 8) {
            float f2 = r3.A02;
            if (!Float.isNaN(f2)) {
                r62.A02 = f2;
            }
        }
        r62.A04 = r3.A05;
        if ((i2 & 128) == 128 && r7 != null) {
            r62.A05 = r7.A0I + (((long) r3.A06) * 1000);
        }
        return r62;
    }

    public static boolean A01(long j2, long j3) {
        return j2 == 0 || j2 > j3;
    }

    public final long A02() {
        long j2;
        synchronized (this.A0S) {
            AnonymousClass01D r9 = this.A0P;
            long j3 = ((SharedPreferences) ((C15860rz) r9.get()).A01.get()).getLong("live_location_sequence_number", -1);
            long A012 = this.A0G.A01() * 1000;
            if (A012 > j3) {
                StringBuilder sb = new StringBuilder();
                sb.append("LocationSharingManager/getNextSequenceNumber; got a new sequence number; currentSequenceNumber=");
                sb.append(A012);
                Log.i(sb.toString());
                j3 = A012;
            }
            j2 = j3 + 1;
            ((C15860rz) r9.get()).A0K().putLong("live_location_sequence_number", j2).apply();
        }
        return j2;
    }

    public long A03(C15830rv r4) {
        long j2;
        synchronized (this.A0S) {
            C454628s r0 = (C454628s) A0A().get(r4);
            j2 = r0 != null ? r0.A01 : -1;
        }
        return j2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0013, code lost:
        r1 = (X.AnonymousClass28x) r1.get(r5.A0C());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long A04(X.C38841rV r5) {
        /*
            r4 = this;
            java.lang.Object r3 = r4.A0R
            monitor-enter(r3)
            java.util.Map r1 = r4.A09()     // Catch:{ all -> 0x002f }
            X.1Vw r2 = r5.A11     // Catch:{ all -> 0x002f }
            X.0rv r0 = r2.A00     // Catch:{ all -> 0x002f }
            java.lang.Object r1 = r1.get(r0)     // Catch:{ all -> 0x002f }
            java.util.Map r1 = (java.util.Map) r1     // Catch:{ all -> 0x002f }
            if (r1 == 0) goto L_0x002b
            com.whatsapp.jid.UserJid r0 = r5.A0C()     // Catch:{ all -> 0x002f }
            java.lang.Object r1 = r1.get(r0)     // Catch:{ all -> 0x002f }
            X.28x r1 = (X.AnonymousClass28x) r1     // Catch:{ all -> 0x002f }
            if (r1 == 0) goto L_0x002b
            X.1Vw r0 = r1.A02     // Catch:{ all -> 0x002f }
            boolean r0 = r2.equals(r0)     // Catch:{ all -> 0x002f }
            if (r0 == 0) goto L_0x002b
            long r0 = r1.A00     // Catch:{ all -> 0x002f }
        L_0x0029:
            monitor-exit(r3)     // Catch:{ all -> 0x002f }
            goto L_0x002e
        L_0x002b:
            r0 = -1
            goto L_0x0029
        L_0x002e:
            return r0
        L_0x002f:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x002f }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19430yQ.A04(X.1rV):long");
    }

    public long A05(C38841rV r5) {
        long j2;
        C28381Vw r3 = r5.A11;
        C15830rv r1 = r3.A00;
        AnonymousClass00B.A06(r1);
        synchronized (this.A0S) {
            C454628s r12 = (C454628s) A0A().get(r1);
            j2 = (r12 == null || !r12.A02.equals(r3)) ? -1 : r12.A01;
        }
        return j2;
    }

    public final C38841rV A06(C28381Vw r4) {
        C16740tZ A032 = ((C16460t6) this.A0d.get()).A0K.A03(r4);
        if (!(A032 instanceof C38841rV) || A032.A15) {
            return null;
        }
        return (C38841rV) A032;
    }

    public List A07() {
        ArrayList arrayList;
        synchronized (this.A0S) {
            A0A();
            Set A0B2 = A0B();
            A0B2.removeAll(this.A0V);
            StringBuilder sb = new StringBuilder();
            sb.append("LocationSharingManager/getJidsNeedingSenderKey; jids.size=");
            sb.append(A0B2.size());
            Log.i(sb.toString());
            arrayList = new ArrayList(A0B2);
        }
        return arrayList;
    }

    public List A08(C15830rv r9) {
        ArrayList arrayList = new ArrayList();
        synchronized (this.A0R) {
            Map map = (Map) A09().get(r9);
            long A002 = this.A0G.A00();
            if (map != null) {
                for (AnonymousClass28x r4 : map.values()) {
                    if (A01(r4.A00, A002)) {
                        arrayList.add(r4.A01);
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x0153 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:62:0x0158 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map A09() {
        /*
            r19 = this;
            r6 = r19
            java.lang.Object r2 = r6.A0R
            monitor-enter(r2)
            java.util.Map r0 = r6.A06     // Catch:{ all -> 0x017f }
            if (r0 != 0) goto L_0x017b
            java.util.Map r7 = r6.A0c     // Catch:{ all -> 0x017f }
            X.1Rv r5 = r6.A0N     // Catch:{ all -> 0x017f }
            long r9 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x017f }
            java.util.HashMap r4 = new java.util.HashMap     // Catch:{ all -> 0x017f }
            r4.<init>()     // Catch:{ all -> 0x017f }
            X.1Ru r0 = r5.A00     // Catch:{ Exception -> 0x0159 }
            X.0tf r3 = r0.get()     // Catch:{ Exception -> 0x0159 }
            X.0tg r11 = r3.A02     // Catch:{ all -> 0x0154 }
            java.lang.String r12 = "location_cache"
            java.lang.String[] r13 = X.AnonymousClass28y.A00     // Catch:{ all -> 0x0154 }
            r14 = 0
            r16 = r14
            r17 = r14
            r18 = r14
            r15 = r14
            android.database.Cursor r8 = r11.A09(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x0154 }
            if (r8 != 0) goto L_0x0039
            java.lang.String r0 = "LocationSharingStore/getAllUserLocations/unable to get user location cache"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x014d }
            r3.close()     // Catch:{ Exception -> 0x0159 }
            goto L_0x0084
        L_0x0039:
            boolean r0 = r8.moveToNext()     // Catch:{ all -> 0x014d }
            if (r0 == 0) goto L_0x005c
            r0 = 0
            java.lang.String r0 = r8.getString(r0)     // Catch:{ all -> 0x014d }
            com.whatsapp.jid.UserJid r1 = com.whatsapp.jid.UserJid.getNullable(r0)     // Catch:{ all -> 0x014d }
            if (r1 != 0) goto L_0x004b
            goto L_0x0051
        L_0x004b:
            X.28z r0 = new X.28z     // Catch:{ all -> 0x014d }
            r0.<init>(r8, r1)     // Catch:{ all -> 0x014d }
            goto L_0x0052
        L_0x0051:
            r0 = r14
        L_0x0052:
            if (r0 == 0) goto L_0x0039
            X.1sx r1 = r0.A00     // Catch:{ all -> 0x014d }
            com.whatsapp.jid.UserJid r0 = r1.A06     // Catch:{ all -> 0x014d }
            r4.put(r0, r1)     // Catch:{ all -> 0x014d }
            goto L_0x0039
        L_0x005c:
            r8.close()     // Catch:{ all -> 0x0154 }
            r3.close()     // Catch:{ Exception -> 0x0159 }
            java.lang.String r0 = "LocationSharingStore/getAllUserLocations/returned "
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x017f }
            r3.<init>(r0)     // Catch:{ all -> 0x017f }
            int r0 = r4.size()     // Catch:{ all -> 0x017f }
            r3.append(r0)     // Catch:{ all -> 0x017f }
            java.lang.String r0 = " user locations sharer | time: "
            r3.append(r0)     // Catch:{ all -> 0x017f }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x017f }
            long r0 = r0 - r9
            r3.append(r0)     // Catch:{ all -> 0x017f }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x017f }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x017f }
        L_0x0084:
            r7.putAll(r4)     // Catch:{ all -> 0x017f }
            java.util.Set r0 = r7.keySet()     // Catch:{ all -> 0x017f }
            java.util.HashSet r9 = new java.util.HashSet     // Catch:{ all -> 0x017f }
            r9.<init>(r0)     // Catch:{ all -> 0x017f }
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ all -> 0x017f }
            r0.<init>()     // Catch:{ all -> 0x017f }
            r6.A06 = r0     // Catch:{ all -> 0x017f }
            X.0t3 r0 = r6.A0G     // Catch:{ all -> 0x017f }
            long r0 = r0.A00()     // Catch:{ all -> 0x017f }
            r3 = 0
            r5.A01(r0, r3)     // Catch:{ all -> 0x017f }
            r0 = 0
            java.util.List r0 = r5.A00(r0, r3)     // Catch:{ all -> 0x017f }
            java.util.HashMap r10 = new java.util.HashMap     // Catch:{ all -> 0x017f }
            r10.<init>()     // Catch:{ all -> 0x017f }
            java.util.Iterator r11 = r0.iterator()     // Catch:{ all -> 0x017f }
        L_0x00b0:
            boolean r0 = r11.hasNext()     // Catch:{ all -> 0x017f }
            if (r0 == 0) goto L_0x00e1
            java.lang.Object r3 = r11.next()     // Catch:{ all -> 0x017f }
            X.28r r3 = (X.C454528r) r3     // Catch:{ all -> 0x017f }
            X.0rv r1 = r3.A01     // Catch:{ all -> 0x017f }
            boolean r0 = r10.containsKey(r1)     // Catch:{ all -> 0x017f }
            if (r0 != 0) goto L_0x00cc
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ all -> 0x017f }
            r0.<init>()     // Catch:{ all -> 0x017f }
            r10.put(r1, r0)     // Catch:{ all -> 0x017f }
        L_0x00cc:
            java.lang.Object r8 = r10.get(r1)     // Catch:{ all -> 0x017f }
            java.util.Map r8 = (java.util.Map) r8     // Catch:{ all -> 0x017f }
            com.whatsapp.jid.UserJid r7 = r3.A02     // Catch:{ all -> 0x017f }
            long r0 = r3.A00     // Catch:{ all -> 0x017f }
            X.1Vw r4 = r3.A03     // Catch:{ all -> 0x017f }
            X.28x r3 = new X.28x     // Catch:{ all -> 0x017f }
            r3.<init>(r7, r4, r0)     // Catch:{ all -> 0x017f }
            r8.put(r7, r3)     // Catch:{ all -> 0x017f }
            goto L_0x00b0
        L_0x00e1:
            java.util.HashSet r8 = new java.util.HashSet     // Catch:{ all -> 0x017f }
            r8.<init>()     // Catch:{ all -> 0x017f }
            java.util.Set r0 = r10.keySet()     // Catch:{ all -> 0x017f }
            java.util.Iterator r11 = r0.iterator()     // Catch:{ all -> 0x017f }
        L_0x00ee:
            boolean r0 = r11.hasNext()     // Catch:{ all -> 0x017f }
            if (r0 == 0) goto L_0x0165
            java.lang.Object r3 = r11.next()     // Catch:{ all -> 0x017f }
            X.0rv r3 = (X.C15830rv) r3     // Catch:{ all -> 0x017f }
            X.0sG r0 = r6.A0C     // Catch:{ all -> 0x017f }
            X.0sH r0 = r0.A09(r3)     // Catch:{ all -> 0x017f }
            if (r0 == 0) goto L_0x0149
            java.util.Map r0 = r6.A06     // Catch:{ all -> 0x017f }
            boolean r0 = r0.containsKey(r3)     // Catch:{ all -> 0x017f }
            if (r0 != 0) goto L_0x0114
            java.util.Map r1 = r6.A06     // Catch:{ all -> 0x017f }
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ all -> 0x017f }
            r0.<init>()     // Catch:{ all -> 0x017f }
            r1.put(r3, r0)     // Catch:{ all -> 0x017f }
        L_0x0114:
            java.lang.Object r7 = r10.get(r3)     // Catch:{ all -> 0x017f }
            java.util.Map r7 = (java.util.Map) r7     // Catch:{ all -> 0x017f }
            X.AnonymousClass00B.A06(r7)     // Catch:{ all -> 0x017f }
            java.util.Map r0 = r6.A06     // Catch:{ all -> 0x017f }
            java.lang.Object r4 = r0.get(r3)     // Catch:{ all -> 0x017f }
            java.util.Map r4 = (java.util.Map) r4     // Catch:{ all -> 0x017f }
            X.AnonymousClass00B.A06(r4)     // Catch:{ all -> 0x017f }
            java.util.Set r0 = r7.keySet()     // Catch:{ all -> 0x017f }
            java.util.Iterator r3 = r0.iterator()     // Catch:{ all -> 0x017f }
        L_0x0130:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x017f }
            if (r0 == 0) goto L_0x00ee
            java.lang.Object r1 = r3.next()     // Catch:{ all -> 0x017f }
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1     // Catch:{ all -> 0x017f }
            java.lang.Object r0 = r7.get(r1)     // Catch:{ all -> 0x017f }
            X.28x r0 = (X.AnonymousClass28x) r0     // Catch:{ all -> 0x017f }
            r4.put(r1, r0)     // Catch:{ all -> 0x017f }
            r9.remove(r1)     // Catch:{ all -> 0x017f }
            goto L_0x0130
        L_0x0149:
            r8.add(r3)     // Catch:{ all -> 0x017f }
            goto L_0x00ee
        L_0x014d:
            r0 = move-exception
            if (r8 == 0) goto L_0x0153
            r8.close()     // Catch:{ all -> 0x0153 }
        L_0x0153:
            throw r0     // Catch:{ all -> 0x0154 }
        L_0x0154:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0158 }
        L_0x0158:
            throw r0     // Catch:{ Exception -> 0x0159 }
        L_0x0159:
            r1 = move-exception
            java.lang.String r0 = "LocationSharingStore/getAllUserLocations/error getting user locations"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x017f }
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x017f }
            r0.<init>(r1)     // Catch:{ all -> 0x017f }
            throw r0     // Catch:{ all -> 0x017f }
        L_0x0165:
            boolean r0 = r8.isEmpty()     // Catch:{ all -> 0x017f }
            if (r0 != 0) goto L_0x016f
            r0 = 0
            r5.A04(r8, r0)     // Catch:{ all -> 0x017f }
        L_0x016f:
            boolean r0 = r9.isEmpty()     // Catch:{ all -> 0x017f }
            if (r0 != 0) goto L_0x0178
            r5.A05(r9)     // Catch:{ all -> 0x017f }
        L_0x0178:
            r6.A0L()     // Catch:{ all -> 0x017f }
        L_0x017b:
            java.util.Map r0 = r6.A06     // Catch:{ all -> 0x017f }
            monitor-exit(r2)     // Catch:{ all -> 0x017f }
            return r0
        L_0x017f:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x017f }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19430yQ.A09():java.util.Map");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:50:0x0112 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:55:0x0117 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map A0A() {
        /*
            r19 = this;
            r3 = r19
            java.lang.Object r2 = r3.A0S
            monitor-enter(r2)
            java.util.Map r0 = r3.A07     // Catch:{ all -> 0x0165 }
            if (r0 != 0) goto L_0x0161
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ all -> 0x0165 }
            r0.<init>()     // Catch:{ all -> 0x0165 }
            r3.A07 = r0     // Catch:{ all -> 0x0165 }
            X.0t3 r6 = r3.A0G     // Catch:{ all -> 0x0165 }
            long r0 = r6.A00()     // Catch:{ all -> 0x0165 }
            X.1Rv r7 = r3.A0N     // Catch:{ all -> 0x0165 }
            r4 = 604800000(0x240c8400, double:2.988109026E-315)
            long r0 = r0 - r4
            r4 = 1
            r7.A01(r0, r4)     // Catch:{ all -> 0x0165 }
            long r0 = r6.A00()     // Catch:{ all -> 0x0165 }
            java.util.List r1 = r7.A00(r0, r4)     // Catch:{ all -> 0x0165 }
            int r0 = r1.size()     // Catch:{ all -> 0x0165 }
            java.util.HashMap r8 = new java.util.HashMap     // Catch:{ all -> 0x0165 }
            r8.<init>(r0)     // Catch:{ all -> 0x0165 }
            java.util.Iterator r11 = r1.iterator()     // Catch:{ all -> 0x0165 }
        L_0x0035:
            boolean r0 = r11.hasNext()     // Catch:{ all -> 0x0165 }
            if (r0 == 0) goto L_0x0077
            java.lang.Object r9 = r11.next()     // Catch:{ all -> 0x0165 }
            X.28r r9 = (X.C454528r) r9     // Catch:{ all -> 0x0165 }
            X.0rv r10 = r9.A01     // Catch:{ all -> 0x0165 }
            boolean r0 = r8.containsKey(r10)     // Catch:{ all -> 0x0165 }
            if (r0 != 0) goto L_0x0056
            long r0 = r9.A00     // Catch:{ all -> 0x0165 }
            r6 = 0
            X.1Vw r5 = r9.A03     // Catch:{ all -> 0x0165 }
            X.28s r4 = new X.28s     // Catch:{ all -> 0x0165 }
            r4.<init>(r5, r6, r0)     // Catch:{ all -> 0x0165 }
            r8.put(r10, r4)     // Catch:{ all -> 0x0165 }
        L_0x0056:
            java.lang.Object r0 = r8.get(r10)     // Catch:{ all -> 0x0165 }
            X.AnonymousClass00B.A06(r0)     // Catch:{ all -> 0x0165 }
            X.28s r0 = (X.C454628s) r0     // Catch:{ all -> 0x0165 }
            X.1Vw r1 = r9.A03     // Catch:{ all -> 0x0165 }
            X.1Vw r0 = r0.A02     // Catch:{ all -> 0x0165 }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0165 }
            if (r0 == 0) goto L_0x0035
            java.lang.Object r0 = r8.get(r10)     // Catch:{ all -> 0x0165 }
            X.28s r0 = (X.C454628s) r0     // Catch:{ all -> 0x0165 }
            java.util.List r1 = r0.A03     // Catch:{ all -> 0x0165 }
            com.whatsapp.jid.UserJid r0 = r9.A02     // Catch:{ all -> 0x0165 }
            r1.add(r0)     // Catch:{ all -> 0x0165 }
            goto L_0x0035
        L_0x0077:
            java.util.HashSet r6 = new java.util.HashSet     // Catch:{ all -> 0x0165 }
            r6.<init>()     // Catch:{ all -> 0x0165 }
            java.util.Set r0 = r8.keySet()     // Catch:{ all -> 0x0165 }
            java.util.Iterator r5 = r0.iterator()     // Catch:{ all -> 0x0165 }
        L_0x0084:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x0165 }
            if (r0 == 0) goto L_0x00a8
            java.lang.Object r4 = r5.next()     // Catch:{ all -> 0x0165 }
            X.0rv r4 = (X.C15830rv) r4     // Catch:{ all -> 0x0165 }
            X.0sG r0 = r3.A0C     // Catch:{ all -> 0x0165 }
            X.0sH r0 = r0.A09(r4)     // Catch:{ all -> 0x0165 }
            if (r0 == 0) goto L_0x00a4
            java.util.Map r1 = r3.A07     // Catch:{ all -> 0x0165 }
            java.lang.Object r0 = r8.get(r4)     // Catch:{ all -> 0x0165 }
            X.28s r0 = (X.C454628s) r0     // Catch:{ all -> 0x0165 }
            r1.put(r4, r0)     // Catch:{ all -> 0x0165 }
            goto L_0x0084
        L_0x00a4:
            r6.add(r4)     // Catch:{ all -> 0x0165 }
            goto L_0x0084
        L_0x00a8:
            boolean r0 = r6.isEmpty()     // Catch:{ all -> 0x0165 }
            if (r0 != 0) goto L_0x00b2
            r0 = 1
            r7.A04(r6, r0)     // Catch:{ all -> 0x0165 }
        L_0x00b2:
            java.util.HashSet r5 = r3.A0V     // Catch:{ all -> 0x0165 }
            java.lang.String r8 = "jid"
            long r9 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0165 }
            java.util.HashSet r6 = new java.util.HashSet     // Catch:{ all -> 0x0165 }
            r6.<init>()     // Catch:{ all -> 0x0165 }
            X.1Ru r0 = r7.A00     // Catch:{ Exception -> 0x0118 }
            X.0tf r1 = r0.get()     // Catch:{ Exception -> 0x0118 }
            X.0tg r11 = r1.A02     // Catch:{ all -> 0x0113 }
            java.lang.String r12 = "location_key_distribution"
            r0 = 1
            java.lang.String[] r13 = new java.lang.String[r0]     // Catch:{ all -> 0x0113 }
            r4 = 0
            r13[r4] = r8     // Catch:{ all -> 0x0113 }
            java.lang.String r14 = "sent_to_server = ?"
            java.lang.String[] r15 = new java.lang.String[r0]     // Catch:{ all -> 0x0113 }
            java.lang.String r0 = "1"
            r15[r4] = r0     // Catch:{ all -> 0x0113 }
            r16 = 0
            r18 = r16
            r17 = r16
            android.database.Cursor r7 = r11.A09(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x0113 }
            if (r7 != 0) goto L_0x00ed
            java.lang.String r0 = "LocationSharingStore/getAllLocationSharers/unable to read location key distribution table"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x010c }
            r1.close()     // Catch:{ Exception -> 0x0118 }
            goto L_0x0146
        L_0x00ed:
            int r4 = r7.getColumnIndexOrThrow(r8)     // Catch:{ all -> 0x010c }
        L_0x00f1:
            boolean r0 = r7.moveToNext()     // Catch:{ all -> 0x010c }
            if (r0 == 0) goto L_0x0105
            java.lang.String r0 = r7.getString(r4)     // Catch:{ all -> 0x010c }
            com.whatsapp.jid.UserJid r0 = com.whatsapp.jid.UserJid.getNullable(r0)     // Catch:{ all -> 0x010c }
            if (r0 == 0) goto L_0x00f1
            r6.add(r0)     // Catch:{ all -> 0x010c }
            goto L_0x00f1
        L_0x0105:
            r7.close()     // Catch:{ all -> 0x0113 }
            r1.close()     // Catch:{ Exception -> 0x0118 }
            goto L_0x0124
        L_0x010c:
            r0 = move-exception
            if (r7 == 0) goto L_0x0112
            r7.close()     // Catch:{ all -> 0x0112 }
        L_0x0112:
            throw r0     // Catch:{ all -> 0x0113 }
        L_0x0113:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0117 }
        L_0x0117:
            throw r0     // Catch:{ Exception -> 0x0118 }
        L_0x0118:
            r1 = move-exception
            java.lang.String r0 = "LocationSharingStore/getAllLocationReceiverHasKey/error reading database"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0165 }
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x0165 }
            r0.<init>(r1)     // Catch:{ all -> 0x0165 }
            throw r0     // Catch:{ all -> 0x0165 }
        L_0x0124:
            java.lang.String r0 = "LocationSharingStore/getAllLocationReceiverHasKey/returned "
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0165 }
            r4.<init>(r0)     // Catch:{ all -> 0x0165 }
            int r0 = r6.size()     // Catch:{ all -> 0x0165 }
            r4.append(r0)     // Catch:{ all -> 0x0165 }
            java.lang.String r0 = " location receivers has key | time: "
            r4.append(r0)     // Catch:{ all -> 0x0165 }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0165 }
            long r0 = r0 - r9
            r4.append(r0)     // Catch:{ all -> 0x0165 }
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x0165 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0165 }
        L_0x0146:
            r5.addAll(r6)     // Catch:{ all -> 0x0165 }
            java.util.HashSet r1 = new java.util.HashSet     // Catch:{ all -> 0x0165 }
            r1.<init>(r5)     // Catch:{ all -> 0x0165 }
            java.util.Set r0 = r3.A0B()     // Catch:{ all -> 0x0165 }
            r1.removeAll(r0)     // Catch:{ all -> 0x0165 }
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x0165 }
            if (r0 != 0) goto L_0x015e
            r3.A0G()     // Catch:{ all -> 0x0165 }
        L_0x015e:
            r3.A0M()     // Catch:{ all -> 0x0165 }
        L_0x0161:
            java.util.Map r0 = r3.A07     // Catch:{ all -> 0x0165 }
            monitor-exit(r2)     // Catch:{ all -> 0x0165 }
            return r0
        L_0x0165:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0165 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19430yQ.A0A():java.util.Map");
    }

    public final Set A0B() {
        Map A0A2 = A0A();
        HashSet hashSet = new HashSet();
        long A002 = this.A0G.A00();
        for (C454628s r4 : A0A2.values()) {
            if (A01(r4.A01, A002)) {
                hashSet.addAll(r4.A03);
            }
        }
        return hashSet;
    }

    public void A0C() {
        Log.i("LocationSharingManager/cancelShareLocation");
        synchronized (this.A0S) {
            Iterator it = new ArrayList(A0A().keySet()).iterator();
            while (it.hasNext()) {
                A0O((C15830rv) it.next());
            }
        }
    }

    public void A0D() {
        if (A0Z()) {
            boolean z2 = true;
            Object obj = this.A0Q;
            synchronized (obj) {
                if ((this.A00 & 1) != 1) {
                    z2 = false;
                }
            }
            if (!z2) {
                Context context = this.A0H.A00;
                LocationSharingService.A00(context, new Intent(context, LocationSharingService.class).setAction("com.obwhatsapp.ShareLocationService.START_LOCATION_REPORTING").putExtra("duration", 40000));
                synchronized (obj) {
                    this.A00 = 1 | this.A00;
                }
            }
        }
    }

    public void A0E() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.A0S) {
            Map A0A2 = A0A();
            A0A2.size();
            long A002 = this.A0G.A00();
            for (Map.Entry entry : A0A2.entrySet()) {
                long j2 = ((C454628s) entry.getValue()).A01;
                if (j2 != 0 && j2 <= A002) {
                    arrayList.add((C15830rv) entry.getKey());
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            A0O((C15830rv) it.next());
        }
        A0M();
    }

    public void A0F() {
        Log.i("LocationSharingManager/onStopLocationReporting");
        synchronized (this.A0Q) {
            this.A00 = -3 & this.A00;
        }
        Context context = this.A0H.A00;
        C446524y.A00(context, new Intent(context, LocationSharingService.class).setAction("com.obwhatsapp.ShareLocationService.STOP_LOCATION_REPORTING"));
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0G() {
        /*
            r5 = this;
            java.lang.String r0 = "LocationSharingManager/removeMyLocationSenderKey"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0sK r0 = r5.A09
            r0.A0B()
            X.1Za r0 = r0.A04
            X.AnonymousClass00B.A06(r0)
            X.1Yb r3 = X.C28851Ya.A02(r0)
            java.lang.Object r4 = r5.A0S
            monitor-enter(r4)
            X.16P r2 = r5.A0J     // Catch:{ all -> 0x0077 }
            r0 = 11
            com.facebook.redex.RunnableRunnableShape8S0200000_I0_6 r1 = new com.facebook.redex.RunnableRunnableShape8S0200000_I0_6     // Catch:{ all -> 0x0077 }
            r1.<init>(r5, r0, r3)     // Catch:{ all -> 0x0077 }
            java.util.concurrent.ThreadPoolExecutor r0 = r2.A00     // Catch:{ all -> 0x0077 }
            r0.execute(r1)     // Catch:{ all -> 0x0077 }
            java.util.HashSet r0 = r5.A0V     // Catch:{ all -> 0x0077 }
            r0.clear()     // Catch:{ all -> 0x0077 }
            java.util.Map r0 = r5.A0b     // Catch:{ all -> 0x0077 }
            r0.clear()     // Catch:{ all -> 0x0077 }
            X.1Rv r0 = r5.A0N     // Catch:{ all -> 0x0077 }
            X.1Ru r0 = r0.A00     // Catch:{ Exception -> 0x006b }
            X.0tf r3 = r0.A02()     // Catch:{ Exception -> 0x006b }
            X.0tg r2 = r3.A02     // Catch:{ all -> 0x0066 }
            java.lang.String r1 = "location_key_distribution"
            r0 = 0
            int r2 = r2.A01(r1, r0, r0)     // Catch:{ all -> 0x0066 }
            r3.close()     // Catch:{ Exception -> 0x006b }
            java.lang.String r0 = "LocationSharingStore/deleteAllLocationReceiverHasKey/deleted "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0077 }
            r1.<init>(r0)     // Catch:{ all -> 0x0077 }
            r1.append(r2)     // Catch:{ all -> 0x0077 }
            java.lang.String r0 = " rows"
            r1.append(r0)     // Catch:{ all -> 0x0077 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0077 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0077 }
            monitor-exit(r4)     // Catch:{ all -> 0x0077 }
            X.0y7 r0 = r5.A0B
            X.1nt r1 = new X.1nt
            r1.<init>()
            X.1mi r0 = r0.A00
            r0.A01(r1)
            return
        L_0x0066:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x006a }
        L_0x006a:
            throw r0     // Catch:{ Exception -> 0x006b }
        L_0x006b:
            r1 = move-exception
            java.lang.String r0 = "LocationSharingStore/deleteAllLocationReceiverHasKey/delete failed"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0077 }
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x0077 }
            r0.<init>(r1)     // Catch:{ all -> 0x0077 }
            throw r0     // Catch:{ all -> 0x0077 }
        L_0x0077:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0077 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19430yQ.A0G():void");
    }

    public void A0H() {
        C39721sx r4;
        int i2;
        synchronized (this) {
            r4 = this.A04;
        }
        if (r4 != null) {
            if (A0Z()) {
                synchronized (this.A0S) {
                    boolean z2 = false;
                    for (C454628s r11 : A0A().values()) {
                        long j2 = r11.A01;
                        C28381Vw r6 = r11.A02;
                        C38841rV A062 = A06(r6);
                        if (!(A062 == null || j2 == 0)) {
                            C39721sx r9 = r11.A00;
                            if (r9 == null) {
                                r9 = A062.A02;
                                if (r9 != null) {
                                    r11.A00 = r9;
                                    z2 = true;
                                } else {
                                    long j3 = r4.A05;
                                    if (j2 >= j3 && j2 <= j3 + 240000) {
                                        r9 = new C39721sx(r4.A06);
                                        r11.A00 = r9;
                                        r9.A00(r4);
                                        this.A0A.A00(new SendFinalLiveLocationNotificationJob(r6, r4, (int) ((r4.A05 - A062.A0I) / 1000)));
                                        z2 = true;
                                    }
                                }
                            }
                            if (r9.A05 + AnonymousClass1NO.A0L < j2) {
                                long j4 = r4.A05;
                                if (j2 >= j4 && j2 <= j4 + AnonymousClass1NO.A0L) {
                                    r9.A00(r4);
                                    this.A0A.A00(new SendFinalLiveLocationNotificationJob(r6, r4, (int) ((r4.A05 - A062.A0I) / 1000)));
                                    z2 = true;
                                }
                            }
                        }
                    }
                    if (z2) {
                        A0M();
                    }
                }
                if (!A0Z()) {
                    synchronized (this.A0Q) {
                        i2 = -2 & this.A00;
                        this.A00 = i2;
                    }
                    if (i2 == 0) {
                        Context context = this.A0H.A00;
                        C446524y.A00(context, new Intent(context, LocationSharingService.class).setAction("com.obwhatsapp.ShareLocationService.STOP_LOCATION_REPORTING"));
                    }
                }
            }
            C33211iD A022 = this.A0M.A02(r4, (Integer) null);
            long max = Math.max(0, (this.A0G.A00() - r4.A05) / 1000);
            try {
                AnonymousClass16P r42 = this.A0J;
                IDxCallableShape45S0200000_2_I0 iDxCallableShape45S0200000_2_I0 = new IDxCallableShape45S0200000_2_I0(this, 4, A022);
                C27471Rw r5 = this.A0O;
                StringBuilder sb = new StringBuilder("sendmethods/sendLocation elapsed=");
                sb.append(max);
                Log.i(sb.toString());
                r5.A01.A0D(new C28371Vv(new C28371Vv(C454228o.A00((C30821d1) r42.A00.submit(iDxCallableShape45S0200000_2_I0).get(), 0), "location", max != 0 ? new C35081lL[]{new C35081lL("elapsed", Long.toString(max))} : C27471Rw.A04), "ib", (C35081lL[]) null), 84);
            } catch (InterruptedException | ExecutionException e2) {
                Log.e("LocationSharingManager/encryptAndSendLocation error", e2);
            }
        } else {
            Log.w("LocationSharingManager/sendLatestLocation/try to send location, but no location available");
        }
    }

    public final void A0I() {
        Context context = this.A0H.A00;
        PendingIntent A012 = C42341xd.A01(context, 0, new Intent(context, FinalLiveLocationBroadcastReceiver.class), 536870912);
        if (A012 != null) {
            AlarmManager A042 = this.A0F.A04();
            if (A042 != null) {
                A042.cancel(A012);
            } else {
                Log.w("LocationSharingManager/cancelFinalLiveLocationUpdateAlarm/AlarmManager is null");
            }
            A012.cancel();
        }
    }

    public final void A0J() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.A0R) {
            Map A092 = A09();
            A092.size();
            long A002 = this.A0G.A00();
            for (Map.Entry entry : A092.entrySet()) {
                for (AnonymousClass28x r5 : ((Map) entry.getValue()).values()) {
                    long j2 = r5.A00;
                    if (j2 != 0 && j2 <= A002) {
                        arrayList.add(Pair.create((C15830rv) entry.getKey(), r5.A01));
                    }
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            A0P((C15830rv) pair.first, (UserJid) pair.second);
        }
        A0L();
    }

    public final void A0K() {
        synchronized (this.A0S) {
            Set A0B2 = A0B();
            HashSet hashSet = new HashSet(this.A0V);
            hashSet.removeAll(A0B2);
            if (!hashSet.isEmpty()) {
                A0G();
            }
        }
    }

    public final void A0L() {
        Long l2;
        Handler handler = this.A08;
        Runnable runnable = this.A0T;
        handler.removeCallbacks(runnable);
        synchronized (this.A0R) {
            l2 = null;
            for (Map values : A09().values()) {
                for (AnonymousClass28x r7 : values.values()) {
                    if (l2 == null || r7.A00 < l2.longValue()) {
                        l2 = Long.valueOf(r7.A00);
                    }
                }
            }
        }
        if (l2 != null) {
            long A002 = this.A0G.A00();
            long longValue = l2.longValue();
            if (longValue > A002) {
                handler.postDelayed(runnable, longValue - A002);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x008c, code lost:
        if (r0 < r21.longValue()) goto L_0x008e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00f6 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0148  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0M() {
        /*
            r33 = this;
            r12 = r33
            android.os.Handler r0 = r12.A08
            r32 = r0
            java.lang.Runnable r0 = r12.A0U
            r31 = r0
            r1 = r32
            r1.removeCallbacks(r0)
            X.0t3 r15 = r12.A0G
            long r8 = r15.A00()
            X.01D r0 = r12.A0P
            r30 = r0
            java.lang.Object r0 = r30.get()
            X.0rz r0 = (X.C15860rz) r0
            X.01D r0 = r0.A01
            java.lang.Object r1 = r0.get()
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1
            java.lang.String r29 = "live_location_sharing_session_total_time"
            r6 = 0
            r0 = r29
            long r27 = r1.getLong(r0, r6)
            java.lang.Object r0 = r30.get()
            X.0rz r0 = (X.C15860rz) r0
            X.01D r0 = r0.A01
            java.lang.Object r1 = r0.get()
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1
            java.lang.String r26 = "live_location_sharing_session_start_time"
            r0 = r26
            long r13 = r1.getLong(r0, r6)
            java.lang.Object r0 = r30.get()
            X.0rz r0 = (X.C15860rz) r0
            X.01D r0 = r0.A01
            java.lang.Object r1 = r0.get()
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1
            java.lang.String r25 = "live_location_sharing_session_end_time"
            r0 = r25
            long r23 = r1.getLong(r0, r6)
            java.lang.Object r0 = r12.A0S
            r22 = r0
            monitor-enter(r22)
            java.util.Map r0 = r12.A0A()     // Catch:{ all -> 0x01b2 }
            java.util.Collection r0 = r0.values()     // Catch:{ all -> 0x01b2 }
            java.util.Iterator r19 = r0.iterator()     // Catch:{ all -> 0x01b2 }
            r18 = 0
            r21 = r18
            r4 = 0
            r2 = 0
        L_0x0076:
            boolean r0 = r19.hasNext()     // Catch:{ all -> 0x01b2 }
            if (r0 == 0) goto L_0x00c8
            java.lang.Object r11 = r19.next()     // Catch:{ all -> 0x01b2 }
            X.28s r11 = (X.C454628s) r11     // Catch:{ all -> 0x01b2 }
            if (r21 == 0) goto L_0x008e
            long r0 = r11.A01     // Catch:{ all -> 0x01b2 }
            long r16 = r21.longValue()     // Catch:{ all -> 0x01b2 }
            int r10 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r10 >= 0) goto L_0x0094
        L_0x008e:
            long r0 = r11.A01     // Catch:{ all -> 0x01b2 }
            java.lang.Long r21 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x01b2 }
        L_0x0094:
            if (r18 == 0) goto L_0x009e
            long r16 = r18.longValue()     // Catch:{ all -> 0x01b2 }
            int r10 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r10 <= 0) goto L_0x00a2
        L_0x009e:
            java.lang.Long r18 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x01b2 }
        L_0x00a2:
            int r10 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r10 <= 0) goto L_0x0076
            X.1sx r11 = r11.A00     // Catch:{ all -> 0x01b2 }
            if (r11 != 0) goto L_0x00b2
            boolean r10 = A01(r2, r0)     // Catch:{ all -> 0x01b2 }
            if (r10 == 0) goto L_0x0076
            r2 = r0
            goto L_0x0076
        L_0x00b2:
            int r10 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r10 <= 0) goto L_0x0076
            long r10 = r11.A05     // Catch:{ all -> 0x01b2 }
            r16 = 30000(0x7530, double:1.4822E-319)
            long r10 = r10 + r16
            int r16 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r16 >= 0) goto L_0x0076
            boolean r10 = A01(r4, r0)     // Catch:{ all -> 0x01b2 }
            if (r10 == 0) goto L_0x0076
            r4 = r0
            goto L_0x0076
        L_0x00c8:
            if (r18 == 0) goto L_0x00d8
            long r0 = r18.longValue()     // Catch:{ all -> 0x01b2 }
            int r10 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r10 <= 0) goto L_0x00d8
            int r10 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r10 != 0) goto L_0x00e8
            r13 = r8
            goto L_0x00e8
        L_0x00d8:
            r0 = r23
            long r6 = java.lang.Math.min(r8, r0)     // Catch:{ all -> 0x01b2 }
            long r6 = r6 - r13
            r0 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 / r0
            long r27 = r27 + r6
            r13 = 0
            r0 = 0
        L_0x00e8:
            long r19 = r15.A00()     // Catch:{ all -> 0x01b2 }
            r6 = 0
            int r10 = (r2 > r19 ? 1 : (r2 == r19 ? 0 : -1))
            if (r10 >= 0) goto L_0x0102
            int r10 = (r4 > r19 ? 1 : (r4 == r19 ? 0 : -1))
            if (r10 >= 0) goto L_0x0102
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x01b0 }
            r12.A05 = r2     // Catch:{ all -> 0x01b0 }
            r12.A01 = r6     // Catch:{ all -> 0x01b0 }
            r12.A0I()     // Catch:{ all -> 0x01b0 }
            goto L_0x0136
        L_0x0102:
            r17 = 30000(0x7530, double:1.4822E-319)
            int r10 = (r2 > r19 ? 1 : (r2 == r19 ? 0 : -1))
            if (r10 >= 0) goto L_0x0109
            goto L_0x012c
        L_0x0109:
            r15 = 180000(0x2bf20, double:8.8932E-319)
            int r10 = (r4 > r19 ? 1 : (r4 == r19 ? 0 : -1))
            if (r10 >= 0) goto L_0x0118
            java.lang.Long r4 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x01b0 }
            r12.A05 = r4     // Catch:{ all -> 0x01b0 }
            long r2 = r2 - r15
            goto L_0x0129
        L_0x0118:
            long r10 = java.lang.Math.min(r2, r4)     // Catch:{ all -> 0x01b0 }
            java.lang.Long r10 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x01b0 }
            r12.A05 = r10     // Catch:{ all -> 0x01b0 }
            long r2 = r2 - r15
            long r4 = r4 - r17
            long r2 = java.lang.Math.min(r2, r4)     // Catch:{ all -> 0x01b0 }
        L_0x0129:
            r12.A01 = r2     // Catch:{ all -> 0x01b0 }
            goto L_0x0136
        L_0x012c:
            java.lang.Long r2 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x01b0 }
            r12.A05 = r2     // Catch:{ all -> 0x01b0 }
            long r4 = r4 - r17
            r12.A01 = r4     // Catch:{ all -> 0x01b0 }
        L_0x0136:
            long r4 = r12.A01     // Catch:{ all -> 0x01b0 }
            long r4 = r4 - r19
            java.lang.Long r2 = r12.A05     // Catch:{ all -> 0x01b0 }
            long r10 = r2.longValue()     // Catch:{ all -> 0x01b0 }
            int r2 = (r10 > r19 ? 1 : (r10 == r19 ? 0 : -1))
            if (r2 >= 0) goto L_0x0148
            r12.A0I()     // Catch:{ all -> 0x01b0 }
            goto L_0x017b
        L_0x0148:
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 > 0) goto L_0x0150
            r12.A0D()     // Catch:{ all -> 0x01b0 }
            goto L_0x017b
        L_0x0150:
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x01b0 }
            long r2 = r2 + r4
            X.01V r4 = r12.A0F     // Catch:{ all -> 0x01b0 }
            android.app.AlarmManager r4 = r4.A04()     // Catch:{ all -> 0x01b0 }
            if (r4 == 0) goto L_0x0176
            X.0tz r4 = r12.A0H     // Catch:{ all -> 0x01b0 }
            android.content.Context r7 = r4.A00     // Catch:{ all -> 0x01b0 }
            r6 = 0
            java.lang.Class<com.obwhatsapp.location.FinalLiveLocationBroadcastReceiver> r4 = com.obwhatsapp.location.FinalLiveLocationBroadcastReceiver.class
            android.content.Intent r5 = new android.content.Intent     // Catch:{ all -> 0x01b0 }
            r5.<init>(r7, r4)     // Catch:{ all -> 0x01b0 }
            r4 = 134217728(0x8000000, float:3.85186E-34)
            android.app.PendingIntent r6 = X.C42341xd.A01(r7, r6, r5, r4)     // Catch:{ all -> 0x01b0 }
            X.12r r5 = r12.A0E     // Catch:{ all -> 0x01b0 }
            r4 = 2
            r5.A02(r6, r4, r2)     // Catch:{ all -> 0x01b0 }
            goto L_0x017b
        L_0x0176:
            java.lang.String r2 = "LocationSharingManager/startFinalLiveLocationUpdateAlarm/AlarmManager is null"
            com.whatsapp.util.Log.w((java.lang.String) r2)     // Catch:{ all -> 0x01b0 }
        L_0x017b:
            java.lang.Object r2 = r30.get()     // Catch:{ all -> 0x01b2 }
            X.0rz r2 = (X.C15860rz) r2     // Catch:{ all -> 0x01b2 }
            android.content.SharedPreferences$Editor r5 = r2.A0K()     // Catch:{ all -> 0x01b2 }
            r4 = r29
            r2 = r27
            android.content.SharedPreferences$Editor r3 = r5.putLong(r4, r2)     // Catch:{ all -> 0x01b2 }
            r2 = r26
            android.content.SharedPreferences$Editor r3 = r3.putLong(r2, r13)     // Catch:{ all -> 0x01b2 }
            r2 = r25
            android.content.SharedPreferences$Editor r0 = r3.putLong(r2, r0)     // Catch:{ all -> 0x01b2 }
            r0.apply()     // Catch:{ all -> 0x01b2 }
            monitor-exit(r22)     // Catch:{ all -> 0x01b2 }
            if (r21 == 0) goto L_0x01af
            long r2 = r21.longValue()
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x01af
            long r2 = r2 - r8
            r1 = r32
            r0 = r31
            r1.postDelayed(r0, r2)
        L_0x01af:
            return
        L_0x01b0:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x01b2 }
        L_0x01b2:
            r0 = move-exception
            monitor-exit(r22)     // Catch:{ all -> 0x01b2 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19430yQ.A0M():void");
    }

    public void A0N(Location location) {
        AnonymousClass1GE r2 = this.A0M;
        C16040sK r0 = r2.A02;
        r0.A0B();
        AnonymousClass1ZT r02 = r0.A05;
        AnonymousClass00B.A06(r02);
        C39721sx r6 = new C39721sx(r02);
        r6.A00 = ((double) Math.round(location.getLatitude() * 1000000.0d)) / 1000000.0d;
        r6.A01 = ((double) Math.round(location.getLongitude() * 1000000.0d)) / 1000000.0d;
        if (location.hasAccuracy()) {
            r6.A03 = (int) location.getAccuracy();
        }
        if (location.hasSpeed()) {
            r6.A02 = ((float) ((int) (location.getSpeed() * 100.0f))) / 100.0f;
        }
        if (location.hasBearing()) {
            r6.A04 = (int) location.getBearing();
        }
        long time = location.getTime();
        r6.A05 = time;
        C16440t3 r3 = r2.A04;
        if (time > r3.A00()) {
            r6.A05 = r3.A00();
        }
        synchronized (this) {
            C39721sx r03 = this.A04;
            if (r03 == null || r6.A05 > r03.A05) {
                this.A04 = r6;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0060, code lost:
        r1 = r6.A0W.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006a, code lost:
        if (r1.hasNext() == false) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006c, code lost:
        ((X.C454728t) r1.next()).AXz(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0076, code lost:
        A0M();
        r6.A08.post(new com.facebook.redex.RunnableRunnableShape8S0200000_I0_6(r6, 17, r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0089, code lost:
        if (A0a() != false) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x008b, code lost:
        A0F();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x008e, code lost:
        r6.A0A.A00(new com.obwhatsapp.jobqueue.job.SendDisableLiveLocationJob(r7, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0098, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0O(X.C15830rv r7) {
        /*
            r6 = this;
            java.lang.String r1 = "LocationSharingManager/cancelShareLocation; jid="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Object r4 = r6.A0S
            monitor-enter(r4)
            java.util.Map r0 = r6.A0A()     // Catch:{ all -> 0x0099 }
            java.lang.Object r5 = r0.remove(r7)     // Catch:{ all -> 0x0099 }
            X.28s r5 = (X.C454628s) r5     // Catch:{ all -> 0x0099 }
            if (r5 != 0) goto L_0x0022
            monitor-exit(r4)     // Catch:{ all -> 0x0099 }
            return
        L_0x0022:
            X.1Vw r0 = r5.A02     // Catch:{ all -> 0x0099 }
            X.1rV r0 = r6.A06(r0)     // Catch:{ all -> 0x0099 }
            if (r0 == 0) goto L_0x002d
            r6.A0W(r0)     // Catch:{ all -> 0x0099 }
        L_0x002d:
            X.1Rv r3 = r6.A0N     // Catch:{ all -> 0x0099 }
            java.util.List r2 = java.util.Collections.singletonList(r5)     // Catch:{ all -> 0x0099 }
            X.0t3 r0 = r6.A0G     // Catch:{ all -> 0x0099 }
            long r0 = r0.A00()     // Catch:{ all -> 0x0099 }
            r3.A06(r2, r0)     // Catch:{ all -> 0x0099 }
            java.util.Set r2 = r6.A0B()     // Catch:{ all -> 0x0099 }
            java.util.List r0 = r5.A03     // Catch:{ all -> 0x0099 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x0099 }
        L_0x0046:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0099 }
            if (r0 == 0) goto L_0x005b
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0099 }
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0     // Catch:{ all -> 0x0099 }
            boolean r0 = r2.contains(r0)     // Catch:{ all -> 0x0099 }
            if (r0 != 0) goto L_0x0046
            r6.A0G()     // Catch:{ all -> 0x0099 }
        L_0x005b:
            long r2 = r6.A02()     // Catch:{ all -> 0x0099 }
            monitor-exit(r4)     // Catch:{ all -> 0x0099 }
            java.util.List r0 = r6.A0W
            java.util.Iterator r1 = r0.iterator()
        L_0x0066:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0076
            java.lang.Object r0 = r1.next()
            X.28t r0 = (X.C454728t) r0
            r0.AXz(r7)
            goto L_0x0066
        L_0x0076:
            r6.A0M()
            android.os.Handler r4 = r6.A08
            r1 = 17
            com.facebook.redex.RunnableRunnableShape8S0200000_I0_6 r0 = new com.facebook.redex.RunnableRunnableShape8S0200000_I0_6
            r0.<init>(r6, r1, r7)
            r4.post(r0)
            boolean r0 = r6.A0a()
            if (r0 != 0) goto L_0x008e
            r6.A0F()
        L_0x008e:
            X.0xb r1 = r6.A0A
            com.obwhatsapp.jobqueue.job.SendDisableLiveLocationJob r0 = new com.obwhatsapp.jobqueue.job.SendDisableLiveLocationJob
            r0.<init>(r7, r2)
            r1.A00(r0)
            return
        L_0x0099:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0099 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19430yQ.A0O(X.0rv):void");
    }

    public final void A0P(C15830rv r7, UserJid userJid) {
        StringBuilder sb = new StringBuilder("LocationSharingManager/onReceiveStopSharing; jid=");
        sb.append(r7);
        sb.append("; participant=");
        sb.append(userJid);
        Log.i(sb.toString());
        synchronized (this.A0R) {
            Map A092 = A09();
            Map map = (Map) A092.get(r7);
            if (map != null) {
                UserJid userJid2 = userJid;
                if (userJid == null) {
                    userJid2 = r7;
                }
                A0T((AnonymousClass28x) map.remove(userJid2));
                C27461Rv r2 = this.A0N;
                AnonymousClass00B.A06(r7);
                if (userJid != null) {
                    r2.A02(r7, Collections.singletonList(userJid), false);
                } else {
                    r2.A04(Collections.singletonList(r7), false);
                }
                if (map.isEmpty()) {
                    A092.remove(r7);
                }
            }
            A0Y(A092);
        }
        for (AnonymousClass290 AVo : this.A0X) {
            AVo.AVo(r7, userJid);
        }
        A0L();
        this.A08.post(new RunnableRunnableShape8S0200000_I0_6(this, 12, r7));
    }

    public void A0Q(C15830rv r9, List list) {
        boolean z2;
        StringBuilder sb = new StringBuilder("LocationSharingManager/onParticipantsLeftGroup; gjid=");
        sb.append(r9);
        sb.append("; participants.size=");
        sb.append(list.size());
        Log.i(sb.toString());
        synchronized (this.A0S) {
            Map A0A2 = A0A();
            C454628s r6 = (C454628s) A0A2.get(r9);
            z2 = false;
            if (r6 != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    UserJid userJid = (UserJid) it.next();
                    List list2 = r6.A03;
                    if (list2.contains(userJid)) {
                        list2.remove(userJid);
                        z2 = true;
                    }
                }
                if (r6.A03.isEmpty()) {
                    C454628s r0 = (C454628s) A0A2.remove(r9);
                    AnonymousClass00B.A06(r0);
                    C38841rV A062 = A06(r0.A02);
                    if (A062 != null) {
                        A0W(A062);
                    }
                }
                this.A0N.A02(r9, list, true);
                A0K();
            }
        }
        if (z2) {
            A0M();
            this.A08.post(new RunnableRunnableShape8S0200000_I0_6(this, 16, r9));
        }
        synchronized (this.A0R) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                A0P(r9, (UserJid) it2.next());
            }
        }
    }

    public void A0R(C16050sL r3) {
        Map map;
        StringBuilder sb = new StringBuilder("LocationSharingManager/onMeLeftGroup; gjid=");
        sb.append(r3);
        Log.i(sb.toString());
        A0O(r3);
        synchronized (this.A0R) {
            map = (Map) A09().remove(r3);
        }
        if (map != null) {
            for (AnonymousClass28x r0 : map.values()) {
                A0P(r3, r0.A01);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0074, code lost:
        r2 = r9.A0Y;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0076, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r7 = r9.A0G.A00();
        r6 = (android.util.Pair) r2.get(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0083, code lost:
        if (r6 == null) goto L_0x00be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0085, code lost:
        r0 = r7 - ((java.lang.Long) r6.first).longValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0094, code lost:
        if (r0 >= 60000) goto L_0x00be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x009e, code lost:
        if (((java.lang.Integer) r6.second).intValue() < r12) goto L_0x00be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a0, code lost:
        r4 = new java.lang.StringBuilder();
        r4.append("LocationSharingManager/sendLocationKeyRetryRequest/retry too soon; remote_resource=");
        r4.append(r10);
        r4.append("; timeElapsed=");
        r4.append(r0);
        com.whatsapp.util.Log.i(r4.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00bc, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00bd, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00be, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append("LocationSharingManager/sendLocationKeyRetryRequest/send; remote_resource=");
        r1.append(r10);
        r1.append("; retryCount=");
        r1.append(r12);
        com.whatsapp.util.Log.i(r1.toString());
        r2.put(r10, android.util.Pair.create(java.lang.Long.valueOf(r7), java.lang.Integer.valueOf(r12)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00e9, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00ea, code lost:
        r3 = r9.A0O.A01;
        r3.A0D(new X.C28371Vv(new X.C28371Vv("encrypt", (X.C35081lL[]) null, new X.C28371Vv[]{new X.C28371Vv("request", new X.C35081lL[]{new X.C35081lL("retry", java.lang.String.valueOf(r12))}), new X.C28371Vv("registration", r11, (X.C35081lL[]) null)}), "notification", new X.C35081lL[]{new X.C35081lL("id", r3.A02()), new X.C35081lL((com.whatsapp.jid.Jid) r10, "to"), new X.C35081lL("type", "location")}), 125);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x014f, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0S(com.whatsapp.jid.UserJid r10, byte[] r11, int r12) {
        /*
            r9 = this;
            r0 = 4
            if (r12 <= r0) goto L_0x001d
            java.lang.String r0 = "LocationSharingManager/sendLocationKeyRetryRequest/reached max retry; remote_resource="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r10)
            java.lang.String r0 = "; retryCount="
            r1.append(r0)
            r1.append(r12)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        L_0x001d:
            java.lang.Object r2 = r9.A0R
            monitor-enter(r2)
            java.util.Map r0 = r9.A09()     // Catch:{ all -> 0x0153 }
            r4 = 0
            java.util.Set r0 = r0.entrySet()     // Catch:{ all -> 0x0153 }
            java.util.Iterator r3 = r0.iterator()     // Catch:{ all -> 0x0153 }
        L_0x002d:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x0153 }
            if (r0 == 0) goto L_0x005b
            java.lang.Object r0 = r3.next()     // Catch:{ all -> 0x0153 }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ all -> 0x0153 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0153 }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ all -> 0x0153 }
            java.util.Set r0 = r0.keySet()     // Catch:{ all -> 0x0153 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x0153 }
        L_0x0047:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0153 }
            if (r0 == 0) goto L_0x002d
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0153 }
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0     // Catch:{ all -> 0x0153 }
            boolean r0 = r10.equals(r0)     // Catch:{ all -> 0x0153 }
            if (r0 == 0) goto L_0x0047
            r4 = 1
            goto L_0x002d
        L_0x005b:
            if (r4 != 0) goto L_0x0073
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0153 }
            r1.<init>()     // Catch:{ all -> 0x0153 }
            java.lang.String r0 = "LocationSharingManager/sendLocationKeyRetryRequest/should not receive location updates from this user; jid="
            r1.append(r0)     // Catch:{ all -> 0x0153 }
            r1.append(r10)     // Catch:{ all -> 0x0153 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0153 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0153 }
            monitor-exit(r2)     // Catch:{ all -> 0x0153 }
            return
        L_0x0073:
            monitor-exit(r2)     // Catch:{ all -> 0x0153 }
            java.util.Map r2 = r9.A0Y
            monitor-enter(r2)
            X.0t3 r0 = r9.A0G     // Catch:{ all -> 0x0150 }
            long r7 = r0.A00()     // Catch:{ all -> 0x0150 }
            java.lang.Object r6 = r2.get(r10)     // Catch:{ all -> 0x0150 }
            android.util.Pair r6 = (android.util.Pair) r6     // Catch:{ all -> 0x0150 }
            if (r6 == 0) goto L_0x00be
            java.lang.Object r0 = r6.first     // Catch:{ all -> 0x0150 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x0150 }
            long r3 = r0.longValue()     // Catch:{ all -> 0x0150 }
            long r0 = r7 - r3
            r4 = 60000(0xea60, double:2.9644E-319)
            int r3 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r3 >= 0) goto L_0x00be
            java.lang.Object r3 = r6.second     // Catch:{ all -> 0x0150 }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ all -> 0x0150 }
            int r3 = r3.intValue()     // Catch:{ all -> 0x0150 }
            if (r3 < r12) goto L_0x00be
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0150 }
            r4.<init>()     // Catch:{ all -> 0x0150 }
            java.lang.String r3 = "LocationSharingManager/sendLocationKeyRetryRequest/retry too soon; remote_resource="
            r4.append(r3)     // Catch:{ all -> 0x0150 }
            r4.append(r10)     // Catch:{ all -> 0x0150 }
            java.lang.String r3 = "; timeElapsed="
            r4.append(r3)     // Catch:{ all -> 0x0150 }
            r4.append(r0)     // Catch:{ all -> 0x0150 }
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x0150 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0150 }
            monitor-exit(r2)     // Catch:{ all -> 0x0150 }
            return
        L_0x00be:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0150 }
            r1.<init>()     // Catch:{ all -> 0x0150 }
            java.lang.String r0 = "LocationSharingManager/sendLocationKeyRetryRequest/send; remote_resource="
            r1.append(r0)     // Catch:{ all -> 0x0150 }
            r1.append(r10)     // Catch:{ all -> 0x0150 }
            java.lang.String r0 = "; retryCount="
            r1.append(r0)     // Catch:{ all -> 0x0150 }
            r1.append(r12)     // Catch:{ all -> 0x0150 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0150 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0150 }
            java.lang.Long r1 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x0150 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x0150 }
            android.util.Pair r0 = android.util.Pair.create(r1, r0)     // Catch:{ all -> 0x0150 }
            r2.put(r10, r0)     // Catch:{ all -> 0x0150 }
            monitor-exit(r2)     // Catch:{ all -> 0x0150 }
            X.1Rw r0 = r9.A0O
            X.0ug r3 = r0.A01
            java.lang.String r2 = r3.A02()
            r0 = 3
            X.1lL[] r4 = new X.C35081lL[r0]
            java.lang.String r1 = "id"
            X.1lL r0 = new X.1lL
            r0.<init>((java.lang.String) r1, (java.lang.String) r2)
            r8 = 0
            r4[r8] = r0
            java.lang.String r1 = "to"
            X.1lL r0 = new X.1lL
            r0.<init>((com.whatsapp.jid.Jid) r10, (java.lang.String) r1)
            r7 = 1
            r4[r7] = r0
            java.lang.String r2 = "type"
            java.lang.String r0 = "location"
            X.1lL r1 = new X.1lL
            r1.<init>((java.lang.String) r2, (java.lang.String) r0)
            r0 = 2
            r4[r0] = r1
            X.1Vv[] r5 = new X.C28371Vv[r0]
            X.1lL[] r6 = new X.C35081lL[r7]
            java.lang.String r2 = java.lang.String.valueOf(r12)
            java.lang.String r1 = "retry"
            X.1lL r0 = new X.1lL
            r0.<init>((java.lang.String) r1, (java.lang.String) r2)
            r6[r8] = r0
            java.lang.String r1 = "request"
            X.1Vv r0 = new X.1Vv
            r0.<init>(r1, r6)
            r5[r8] = r0
            java.lang.String r2 = "registration"
            r1 = 0
            X.1Vv r0 = new X.1Vv
            r0.<init>((java.lang.String) r2, (byte[]) r11, (X.C35081lL[]) r1)
            r5[r7] = r0
            java.lang.String r0 = "encrypt"
            X.1Vv r2 = new X.1Vv
            r2.<init>((java.lang.String) r0, (X.C35081lL[]) r1, (X.C28371Vv[]) r5)
            java.lang.String r0 = "notification"
            X.1Vv r1 = new X.1Vv
            r1.<init>((X.C28371Vv) r2, (java.lang.String) r0, (X.C35081lL[]) r4)
            r0 = 125(0x7d, float:1.75E-43)
            r3.A0D(r1, r0)
            return
        L_0x0150:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0150 }
            throw r0
        L_0x0153:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0153 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19430yQ.A0S(com.whatsapp.jid.UserJid, byte[], int):void");
    }

    public final void A0T(AnonymousClass28x r2) {
        C38841rV A062;
        if (r2 != null && (A062 = A06(r2.A02)) != null) {
            A0W(A062);
        }
    }

    public void A0U(C454728t r3) {
        List list = this.A0W;
        if (!list.contains(r3)) {
            list.add(r3);
        }
    }

    public void A0V(C39721sx r7, C38841rV r8) {
        C28381Vw r1 = r8.A11;
        C15830rv r5 = r1.A00;
        boolean z2 = r1.A02;
        UserJid of = z2 ? null : C16030sJ.A0L(r5) ? UserJid.of(r8.A0B()) : UserJid.of(r5);
        String str = r1.A01;
        StringBuilder sb = new StringBuilder("LocationSharingManager/storeFinalLiveLocation/jid=");
        sb.append(r5);
        sb.append("; fromMe=");
        sb.append(z2);
        sb.append("; msgId=");
        sb.append(str);
        sb.append("; participant=");
        sb.append(of);
        sb.append("; location.time=");
        sb.append(r7.A05);
        Log.i(sb.toString());
        r8.A02 = r7;
        ((C16460t6) this.A0d.get()).A0e(r8, 18);
    }

    public final void A0W(C38841rV r5) {
        int A002 = (int) ((this.A0G.A00() - r5.A0I) / 1000);
        if (A002 < r5.A00) {
            r5.A00 = A002;
            if (r5.A02 == 1) {
                r5.A02 = 0;
            }
            ((C16460t6) this.A0d.get()).A0e(r5, 19);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00f4, code lost:
        r1 = r5.A0X.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00fe, code lost:
        if (r1.hasNext() == false) goto L_0x010a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0100, code lost:
        ((X.AnonymousClass290) r1.next()).AVn(r14, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x010a, code lost:
        A0L();
        r5.A08.post(new com.facebook.redex.RunnableRunnableShape8S0200000_I0_6(r5, 15, r14));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0119, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0X(X.C38841rV r20, long r21) {
        /*
            r19 = this;
            java.lang.String r0 = "LocationSharingManager/onReceiveSharing; message.key.remote_jid="
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r0)
            r6 = r20
            X.1Vw r7 = r6.A11
            X.0rv r14 = r7.A00
            r2.append(r14)
            java.lang.String r0 = "; message.remote_resource="
            r2.append(r0)
            X.0rv r0 = r6.A0B()
            r2.append(r0)
            java.lang.String r0 = "; expiration="
            r2.append(r0)
            r9 = r21
            r2.append(r9)
            java.lang.String r0 = "; message.sequenceNumber="
            r2.append(r0)
            long r0 = r6.A01
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0rv r0 = r6.A0B()
            if (r0 != 0) goto L_0x0047
            com.whatsapp.jid.UserJid r15 = com.whatsapp.jid.UserJid.of(r14)
        L_0x0041:
            r5 = r19
            java.lang.Object r4 = r5.A0R
            monitor-enter(r4)
            goto L_0x004c
        L_0x0047:
            com.whatsapp.jid.UserJid r15 = com.whatsapp.jid.UserJid.of(r0)
            goto L_0x0041
        L_0x004c:
            java.util.Map r3 = r5.A09()     // Catch:{ all -> 0x011a }
            android.util.Pair r13 = android.util.Pair.create(r14, r15)     // Catch:{ all -> 0x011a }
            java.util.Map r8 = r5.A0a     // Catch:{ all -> 0x011a }
            java.lang.Object r0 = r8.get(r13)     // Catch:{ all -> 0x011a }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x011a }
            if (r0 == 0) goto L_0x006f
            long r11 = r0.longValue()     // Catch:{ all -> 0x011a }
            long r0 = r6.A01     // Catch:{ all -> 0x011a }
            int r2 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r2 < 0) goto L_0x006f
            java.lang.String r0 = "LocationSharingManager/onReceiveSharing; received message with old sequence number; not set receiving"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x011a }
            monitor-exit(r4)     // Catch:{ all -> 0x011a }
            return
        L_0x006f:
            r8.remove(r13)     // Catch:{ all -> 0x011a }
            boolean r0 = r3.containsKey(r14)     // Catch:{ all -> 0x011a }
            if (r0 != 0) goto L_0x0080
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ all -> 0x011a }
            r0.<init>()     // Catch:{ all -> 0x011a }
            r3.put(r14, r0)     // Catch:{ all -> 0x011a }
        L_0x0080:
            java.lang.Object r1 = r3.get(r14)     // Catch:{ all -> 0x011a }
            java.util.Map r1 = (java.util.Map) r1     // Catch:{ all -> 0x011a }
            X.AnonymousClass00B.A06(r1)     // Catch:{ all -> 0x011a }
            java.lang.Object r0 = r1.get(r15)     // Catch:{ all -> 0x011a }
            X.28x r0 = (X.AnonymousClass28x) r0     // Catch:{ all -> 0x011a }
            r5.A0T(r0)     // Catch:{ all -> 0x011a }
            X.AnonymousClass00B.A06(r15)     // Catch:{ all -> 0x011a }
            X.28x r0 = new X.28x     // Catch:{ all -> 0x011a }
            r0.<init>(r15, r7, r9)     // Catch:{ all -> 0x011a }
            r1.put(r15, r0)     // Catch:{ all -> 0x011a }
            java.util.Map r1 = r5.A0c     // Catch:{ all -> 0x011a }
            boolean r0 = r1.containsKey(r15)     // Catch:{ all -> 0x011a }
            if (r0 != 0) goto L_0x00b0
            X.AnonymousClass00B.A06(r15)     // Catch:{ all -> 0x011a }
            X.1sx r0 = new X.1sx     // Catch:{ all -> 0x011a }
            r0.<init>(r15)     // Catch:{ all -> 0x011a }
            r1.put(r15, r0)     // Catch:{ all -> 0x011a }
        L_0x00b0:
            java.lang.Object r8 = r1.get(r15)     // Catch:{ all -> 0x011a }
            X.1sx r8 = (X.C39721sx) r8     // Catch:{ all -> 0x011a }
            X.AnonymousClass00B.A06(r8)     // Catch:{ all -> 0x011a }
            long r0 = r8.A05     // Catch:{ all -> 0x011a }
            long r2 = r6.A0I     // Catch:{ all -> 0x011a }
            int r11 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r11 > 0) goto L_0x00d0
            double r0 = r6.A00     // Catch:{ all -> 0x011a }
            r8.A00 = r0     // Catch:{ all -> 0x011a }
            double r0 = r6.A01     // Catch:{ all -> 0x011a }
            r8.A01 = r0     // Catch:{ all -> 0x011a }
            r8.A05 = r2     // Catch:{ all -> 0x011a }
            X.1Rv r0 = r5.A0N     // Catch:{ all -> 0x011a }
            r0.A03(r8)     // Catch:{ all -> 0x011a }
        L_0x00d0:
            X.1Rv r3 = r5.A0N     // Catch:{ all -> 0x011a }
            X.AnonymousClass00B.A06(r14)     // Catch:{ all -> 0x011a }
            X.AnonymousClass00B.A06(r15)     // Catch:{ all -> 0x011a }
            java.lang.String r2 = r7.A01     // Catch:{ all -> 0x011a }
            r1 = 0
            X.1Vw r0 = new X.1Vw     // Catch:{ all -> 0x011a }
            r0.<init>(r14, r2, r1)     // Catch:{ all -> 0x011a }
            X.28r r13 = new X.28r     // Catch:{ all -> 0x011a }
            r17 = r9
            r16 = r0
            r13.<init>(r14, r15, r16, r17)     // Catch:{ all -> 0x011a }
            java.util.List r0 = java.util.Collections.singletonList(r13)     // Catch:{ all -> 0x011a }
            r3.A07(r0)     // Catch:{ all -> 0x011a }
            r5.A0V(r8, r6)     // Catch:{ all -> 0x011a }
            monitor-exit(r4)     // Catch:{ all -> 0x011a }
            java.util.List r0 = r5.A0X
            java.util.Iterator r1 = r0.iterator()
        L_0x00fa:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x010a
            java.lang.Object r0 = r1.next()
            X.290 r0 = (X.AnonymousClass290) r0
            r0.AVn(r14, r15)
            goto L_0x00fa
        L_0x010a:
            r5.A0L()
            android.os.Handler r2 = r5.A08
            r1 = 15
            com.facebook.redex.RunnableRunnableShape8S0200000_I0_6 r0 = new com.facebook.redex.RunnableRunnableShape8S0200000_I0_6
            r0.<init>(r5, r1, r14)
            r2.post(r0)
            return
        L_0x011a:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x011a }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19430yQ.A0X(X.1rV, long):void");
    }

    public final void A0Y(Map map) {
        HashSet hashSet = new HashSet(this.A0c.keySet());
        for (Map values : map.values()) {
            for (AnonymousClass28x r0 : values.values()) {
                hashSet.remove(r0.A01);
            }
        }
        if (!hashSet.isEmpty()) {
            this.A0N.A05(hashSet);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0024, code lost:
        if (r5 != null) goto L_0x0026;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        if (r3 <= r7) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0Z() {
        /*
            r9 = this;
            X.0t3 r0 = r9.A0G
            long r7 = r0.A00()
            java.lang.Object r6 = r9.A0S
            monitor-enter(r6)
            java.lang.Long r5 = r9.A05     // Catch:{ all -> 0x003d }
            monitor-exit(r6)     // Catch:{ all -> 0x003d }
            if (r5 == 0) goto L_0x001c
            long r3 = r5.longValue()
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0026
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 > 0) goto L_0x0026
        L_0x001c:
            java.lang.String r0 = "LocationSharingManager/hasExpiringLocationReceivers/triggered clearing"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r9.A0E()
            if (r5 == 0) goto L_0x003b
        L_0x0026:
            long r1 = r5.longValue()
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 < 0) goto L_0x003b
            monitor-enter(r6)
            long r2 = r9.A01     // Catch:{ all -> 0x0033 }
            monitor-exit(r6)     // Catch:{ all -> 0x0033 }
            goto L_0x0036
        L_0x0033:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0033 }
            throw r0
        L_0x0036:
            int r1 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            r0 = 1
            if (r1 <= 0) goto L_0x003c
        L_0x003b:
            r0 = 0
        L_0x003c:
            return r0
        L_0x003d:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x003d }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19430yQ.A0Z():boolean");
    }

    public boolean A0a() {
        boolean z2;
        synchronized (this.A0S) {
            Map A0A2 = A0A();
            long A002 = this.A0G.A00();
            Iterator it = A0A2.values().iterator();
            while (true) {
                if (it.hasNext()) {
                    if (A01(((C454628s) it.next()).A01, A002)) {
                        z2 = true;
                        break;
                    }
                } else {
                    z2 = false;
                    break;
                }
            }
        }
        return z2;
    }

    public boolean A0b() {
        synchronized (this.A0S) {
            List<UserJid> A072 = A07();
            Map map = this.A0b;
            A072.removeAll(map.keySet());
            if (A072.isEmpty()) {
                return false;
            }
            for (UserJid put : A072) {
                map.put(put, 0);
            }
            this.A0A.A00(new SendLiveLocationKeyJob(A072));
            return true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0024, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0c(X.C15830rv r6) {
        /*
            r5 = this;
            java.lang.Object r4 = r5.A0S
            monitor-enter(r4)
            java.util.Map r0 = r5.A0A()     // Catch:{ all -> 0x0026 }
            java.lang.Object r0 = r0.get(r6)     // Catch:{ all -> 0x0026 }
            X.28s r0 = (X.C454628s) r0     // Catch:{ all -> 0x0026 }
            if (r0 == 0) goto L_0x0023
            long r2 = r0.A01     // Catch:{ all -> 0x0026 }
            X.0t3 r0 = r5.A0G     // Catch:{ all -> 0x0026 }
            long r0 = r0.A00()     // Catch:{ all -> 0x0026 }
            boolean r0 = A01(r2, r0)     // Catch:{ all -> 0x0026 }
            if (r0 == 0) goto L_0x0020
            r0 = 1
            monitor-exit(r4)     // Catch:{ all -> 0x0026 }
            return r0
        L_0x0020:
            r5.A0O(r6)     // Catch:{ all -> 0x0026 }
        L_0x0023:
            monitor-exit(r4)     // Catch:{ all -> 0x0026 }
            r0 = 0
            return r0
        L_0x0026:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0026 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19430yQ.A0c(X.0rv):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0072, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0074, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0d(com.whatsapp.jid.UserJid r9, int r10) {
        /*
            r8 = this;
            r7 = 0
            r0 = 4
            if (r10 <= r0) goto L_0x001e
            java.lang.String r0 = "LocationSharingManager/shouldUserGetLocationKeyRetry/reached max retry; remote_resource="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r9)
            java.lang.String r0 = "; retryCount="
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return r7
        L_0x001e:
            java.lang.Object r4 = r8.A0S
            monitor-enter(r4)
            java.util.Set r0 = r8.A0B()     // Catch:{ all -> 0x0076 }
            boolean r0 = r0.contains(r9)     // Catch:{ all -> 0x0076 }
            if (r0 == 0) goto L_0x0071
            X.0t3 r0 = r8.A0G     // Catch:{ all -> 0x0078 }
            long r1 = r0.A00()     // Catch:{ all -> 0x0078 }
            java.util.Map r0 = r8.A0Z     // Catch:{ all -> 0x0078 }
            java.lang.Object r3 = r0.get(r9)     // Catch:{ all -> 0x0078 }
            android.util.Pair r3 = (android.util.Pair) r3     // Catch:{ all -> 0x0078 }
            if (r3 == 0) goto L_0x0073
            java.lang.Object r0 = r3.first     // Catch:{ all -> 0x0078 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x0078 }
            long r5 = r0.longValue()     // Catch:{ all -> 0x0078 }
            long r1 = r1 - r5
            r5 = 60000(0xea60, double:2.9644E-319)
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x0073
            java.lang.Object r0 = r3.second     // Catch:{ all -> 0x0078 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x0078 }
            int r0 = r0.intValue()     // Catch:{ all -> 0x0078 }
            if (r0 < r10) goto L_0x0073
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0078 }
            r3.<init>()     // Catch:{ all -> 0x0078 }
            java.lang.String r0 = "LocationSharingManager/shouldUserGetLocationKeyRetry/retry too soon; remote_resource="
            r3.append(r0)     // Catch:{ all -> 0x0078 }
            r3.append(r9)     // Catch:{ all -> 0x0078 }
            java.lang.String r0 = "; timeElapsed="
            r3.append(r0)     // Catch:{ all -> 0x0078 }
            r3.append(r1)     // Catch:{ all -> 0x0078 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x0078 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0078 }
        L_0x0071:
            monitor-exit(r4)     // Catch:{ all -> 0x0078 }
            return r7
        L_0x0073:
            monitor-exit(r4)     // Catch:{ all -> 0x0078 }
            r0 = 1
            return r0
        L_0x0076:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0078 }
        L_0x0078:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0078 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19430yQ.A0d(com.whatsapp.jid.UserJid, int):boolean");
    }

    public boolean A0e(C39721sx r13) {
        boolean z2;
        C38841rV A062;
        synchronized (this.A0R) {
            Map map = this.A0c;
            UserJid userJid = r13.A06;
            C39721sx r4 = (C39721sx) map.get(userJid);
            z2 = false;
            if (r4 == null || r4.A05 <= r13.A05) {
                for (Map map2 : A09().values()) {
                    AnonymousClass28x r9 = (AnonymousClass28x) map2.get(userJid);
                    if (!(r9 == null || r13.A05 > r9.A00 || (A062 = A06(r9.A02)) == null)) {
                        A0V(r13, A062);
                        z2 = true;
                    }
                }
                if (z2) {
                    if (r4 == null) {
                        map.put(userJid, r13);
                    } else {
                        r4.A00(r13);
                    }
                    this.A0N.A03(r13);
                }
            }
        }
        return z2;
    }
}
