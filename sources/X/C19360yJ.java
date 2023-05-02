package X;

import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.0yJ  reason: invalid class name and case insensitive filesystem */
public class C19360yJ implements C19370yK {
    public C28421Wa A00 = null;
    public final C16040sK A01;
    public final AnonymousClass11Q A02;
    public final AnonymousClass1CY A03;
    public final AnonymousClass1RP A04;
    public final AnonymousClass19E A05;
    public final AnonymousClass139 A06;
    public final AnonymousClass19W A07;
    public final C217515h A08;
    public final AnonymousClass11R A09;
    public final AnonymousClass16Q A0A;
    public final C217615i A0B;
    public final C20360zv A0C;
    public final Object A0D = new Object();

    public C19360yJ(C16040sK r2, AnonymousClass11Q r3, AnonymousClass1CY r4, AnonymousClass1RP r5, AnonymousClass19E r6, AnonymousClass139 r7, AnonymousClass19W r8, C217515h r9, AnonymousClass11R r10, AnonymousClass16Q r11, C217615i r12, C20360zv r13) {
        this.A01 = r2;
        this.A07 = r8;
        this.A08 = r9;
        this.A05 = r6;
        this.A03 = r4;
        this.A0C = r13;
        this.A0B = r12;
        this.A06 = r7;
        this.A02 = r3;
        this.A0A = r11;
        this.A09 = r10;
        this.A04 = r5;
    }

    public void A00() {
        int i2;
        int i3;
        synchronized (this.A0D) {
            C16040sK r2 = this.A01;
            boolean A0G = r2.A0G();
            StringBuilder sb = new StringBuilder();
            sb.append("SyncdBootstrapManager/bootstrapNewFeatures isCompanion=");
            sb.append(A0G);
            Log.i(sb.toString());
            if (!A0G) {
                i2 = this.A06.A01().getInt("syncd_bootstrap_state", 0);
                i3 = 4;
            } else {
                i2 = this.A09.A00().getInt("companion_syncd_critical_bootstrap_state", 0);
                i3 = 3;
            }
            if (i2 == i3) {
                AnonymousClass139 r7 = this.A06;
                if (r7.A02().isEmpty()) {
                    r7.A07(new HashSet(Arrays.asList(new String[]{"star", "mute", "archive", "contact", "deleteMessageForMe", "setting_pushName", "setting_locale", "markChatAsRead", "sentinel"})));
                }
                Set A022 = r7.A02();
                C217515h r5 = this.A08;
                Set<String> A032 = r5.A03();
                A032.removeAll(A022);
                if (r2.A0G()) {
                    A032.retainAll(new HashSet(Arrays.asList(new String[]{"favoriteSticker"})));
                }
                if (!A032.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    for (String A023 : A032) {
                        C20380zx r22 = (C20380zx) r5.A02(A023);
                        if (r22 != null) {
                            arrayList.addAll(r22.A02(true));
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("SyncdBootstrapManager/bootstrapNewFeatures adding mutations for ");
                            sb2.append(r22.getClass().getCanonicalName());
                            Log.i(sb2.toString());
                        } else {
                            Log.e("SyncdBootstrapManager/bootstrapNewFeatures handler not found");
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        r5.A09(arrayList);
                    }
                    r7.A07(A032);
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00f9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01() {
        /*
            r12 = this;
            X.139 r2 = r12.A06
            android.content.SharedPreferences r3 = r2.A01()
            java.lang.String r1 = "syncd_bootstrap_state"
            r0 = 0
            int r5 = r3.getInt(r1, r0)
            r3 = r12
            monitor-enter(r3)
            X.1Wa r0 = r12.A00     // Catch:{ all -> 0x0117 }
            monitor-exit(r3)
            java.lang.String r1 = "SyncdBootstrapManager/onSyncdSuccess "
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r1)
            r3.append(r0)
            java.lang.String r1 = "; bootstrapState: "
            r3.append(r1)
            r3.append(r5)
            java.lang.String r1 = r3.toString()
            com.whatsapp.util.Log.i((java.lang.String) r1)
            r4 = 2
            r6 = 1
            if (r5 == r6) goto L_0x004a
            if (r5 == r4) goto L_0x006e
            r1 = 3
            if (r5 != r1) goto L_0x0049
            java.util.Set r1 = X.AnonymousClass1WJ.A08
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>(r1)
            java.util.Set r1 = X.AnonymousClass1WJ.A09
            r3.removeAll(r1)
            X.0zv r1 = r12.A0C
            boolean r1 = r1.A0K(r3)
            if (r1 != 0) goto L_0x00f3
        L_0x0049:
            return
        L_0x004a:
            X.0zv r3 = r12.A0C
            java.util.Set r1 = X.AnonymousClass1WJ.A09
            boolean r1 = r3.A0K(r1)
            if (r1 == 0) goto L_0x0049
            r2.A04(r4)
            X.16Q r1 = r12.A0A
            r1.A02(r6)
            if (r0 == 0) goto L_0x006e
            X.19E r4 = r12.A05
            X.1WM r5 = r0.A02
            monitor-enter(r0)
            long r7 = r0.A00     // Catch:{ all -> 0x0100 }
            monitor-exit(r0)
            monitor-enter(r0)
            long r9 = r0.A01     // Catch:{ all -> 0x0100 }
            monitor-exit(r0)
            r11 = 1
            r4.A0B(r5, r6, r7, r9, r11)
        L_0x006e:
            java.lang.String r1 = "SyncdBootstrapManager/prepareAppStateSyncNonCriticalBootstrap"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            java.util.HashSet r8 = new java.util.HashSet
            r8.<init>()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Set r1 = X.AnonymousClass1WJ.A08
            java.util.HashSet r6 = new java.util.HashSet
            r6.<init>(r1)
            java.util.Set r1 = X.AnonymousClass1WJ.A09
            r6.removeAll(r1)
            X.15h r5 = r12.A08
            java.util.Set r1 = r5.A03()
            java.util.Iterator r10 = r1.iterator()
        L_0x0093:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L_0x00dc
            java.lang.Object r4 = r10.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r9 = r5.A02(r4)
            X.0zx r9 = (X.C20380zx) r9
            if (r9 != 0) goto L_0x00ad
            java.lang.String r1 = "SyncdBootstrapManager/prepareAppStateSyncNonCriticalBootstrap handler not found"
            com.whatsapp.util.Log.e((java.lang.String) r1)
            goto L_0x0093
        L_0x00ad:
            java.lang.String r1 = r9.A00()
            boolean r1 = r6.contains(r1)
            if (r1 == 0) goto L_0x0093
            r1 = 0
            java.util.List r1 = r9.A02(r1)
            r7.addAll(r1)
            java.lang.String r1 = "SyncdBootstrapManager/prepareAppStateSyncNonCriticalBootstrap adding mutations for "
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r1)
            java.lang.Class r1 = r9.getClass()
            java.lang.String r1 = r1.getCanonicalName()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            com.whatsapp.util.Log.i((java.lang.String) r1)
            r8.add(r4)
            goto L_0x0093
        L_0x00dc:
            r5.A09(r7)
            r2.A07(r8)
            r1 = 3
            r2.A04(r1)
            boolean r1 = r7.isEmpty()
            if (r1 == 0) goto L_0x0049
            java.util.List r1 = java.util.Collections.emptyList()
            r12.A03(r1)
        L_0x00f3:
            r1 = 4
            r2.A04(r1)
            if (r0 == 0) goto L_0x0112
            X.19E r1 = r12.A05
            X.1WM r2 = r0.A02
            r8 = 1
            monitor-enter(r0)
            goto L_0x0103
        L_0x0100:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x0103:
            long r4 = r0.A00     // Catch:{ all -> 0x010a }
            monitor-exit(r0)
            monitor-enter(r0)
            long r6 = r0.A01     // Catch:{ all -> 0x010a }
            goto L_0x010d
        L_0x010a:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x010d:
            monitor-exit(r0)
            r3 = 2
            r1.A0B(r2, r3, r4, r6, r8)
        L_0x0112:
            r0 = 0
            r12.A02(r0)
            return
        L_0x0117:
            r1 = move-exception
            monitor-exit(r3)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19360yJ.A01():void");
    }

    public synchronized void A02(C28421Wa r2) {
        this.A00 = r2;
    }

    public void A03(List list) {
        C28421Wa r5;
        AnonymousClass1XC r4;
        synchronized (this) {
            r5 = this.A00;
        }
        if (r5 != null) {
            synchronized (r5) {
                Iterator it = list.iterator();
                long j2 = 0;
                while (it.hasNext()) {
                    C28471Wf r42 = (C28471Wf) it.next();
                    if (r42 != null && "critical_unblock_low".equals(r42.A01)) {
                        for (Object obj : r42.A02) {
                            if (obj instanceof C36991oR) {
                                j2++;
                            }
                        }
                    }
                }
                r5.A00 = j2;
                Iterator it2 = list.iterator();
                long j3 = 0;
                while (it2.hasNext()) {
                    C28471Wf r0 = (C28471Wf) it2.next();
                    if (!(r0 == null || (r4 = r0.A00) == null)) {
                        j3 += (long) r4.AFw();
                        if ((r4.A00 & 2) == 2) {
                            AnonymousClass1XB r02 = r4.A06;
                            if (r02 == null) {
                                r02 = AnonymousClass1XB.A07;
                            }
                            j3 += r02.A01;
                        }
                    }
                }
                r5.A01 = j3;
            }
            StringBuilder sb = new StringBuilder("SyncdBootstrapManager/syncdRequestPrepared: ");
            sb.append(r5);
            Log.i(sb.toString());
            int i2 = this.A06.A01().getInt("syncd_bootstrap_state", 0);
            AnonymousClass19E r3 = this.A05;
            AnonymousClass1WM r2 = r5.A02;
            int i3 = 2;
            if (i2 == 1) {
                i3 = 1;
            }
            r3.A0D(r2, i3, true);
        }
    }

    public void AYg() {
        Log.i("SyncdBootstrapManager/onSyncdFailed");
        this.A0A.A02(false);
    }

    public void AYh() {
        A01();
    }
}
