package com.facebook.redex;

import X.AnonymousClass11E;
import X.C14710pd;
import X.C24821Hk;
import android.os.ConditionVariable;

public class RunnableRunnableShape1S0400000_I1 implements Runnable {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public RunnableRunnableShape1S0400000_I1(ConditionVariable conditionVariable, C24821Hk r3, AnonymousClass11E r4, C14710pd r5) {
        this.A04 = 7;
        this.A00 = r5;
        this.A03 = r4;
        this.A01 = r3;
        this.A02 = conditionVariable;
    }

    public RunnableRunnableShape1S0400000_I1(Object obj, Object obj2, Object obj3, Object obj4, int i2) {
        this.A04 = i2;
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = obj3;
        this.A03 = obj4;
    }

    /* JADX WARNING: Removed duplicated region for block: B:114:0x0336 A[Catch:{ all -> 0x03c5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x038d A[Catch:{ all -> 0x03c5 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r12 = this;
            int r0 = r12.A04
            switch(r0) {
                case 0: goto L_0x0148;
                case 1: goto L_0x0162;
                case 2: goto L_0x0197;
                case 3: goto L_0x01f1;
                case 4: goto L_0x0030;
                case 5: goto L_0x0236;
                case 6: goto L_0x00ee;
                case 7: goto L_0x011d;
                case 8: goto L_0x0260;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r12.A01
            X.01D r0 = (X.AnonymousClass01D) r0
            java.lang.Object r1 = r12.A02
            X.0sK r1 = (X.C16040sK) r1
            java.lang.Object r3 = r12.A03
            X.18r r3 = (X.C226318r) r3
            java.lang.Object r0 = r0.get()
            X.1No r0 = (X.C26401No) r0
            r0.APJ()
            r1.A0B()
            com.obwhatsapp.Me r0 = r1.A00
            if (r0 == 0) goto L_0x002f
            java.lang.String r1 = r0.cc
            java.lang.String r0 = r0.number
            java.lang.String r2 = X.C18160wF.A01(r1, r0)
            r1 = 6833(0x1ab1, float:9.575E-42)
            r0 = 2
            r3.A02(r2, r1, r0)
        L_0x002f:
            return
        L_0x0030:
            java.lang.Object r0 = r12.A00
            com.whatsapp.util.ViewOnClickCListenerShape0S0400000_I0 r0 = (com.whatsapp.util.ViewOnClickCListenerShape0S0400000_I0) r0
            java.lang.Object r4 = r12.A01
            android.content.Context r4 = (android.content.Context) r4
            java.lang.Object r2 = r12.A02
            X.0tZ r2 = (X.C16740tZ) r2
            java.lang.Object r5 = r12.A03
            X.0tZ r5 = (X.C16740tZ) r5
            java.lang.Object r3 = r0.A00
            X.1bb r3 = (X.C30011bb) r3
            boolean r0 = r5 instanceof X.C38651rC
            if (r0 == 0) goto L_0x007f
            X.1Vw r0 = r5.A11
            X.0rv r6 = r0.A00
            if (r6 == 0) goto L_0x0067
            X.1rC r5 = (X.C38651rC) r5
            java.lang.String r2 = r5.A01
            java.lang.String r0 = r6.getRawString()
            X.0sL r1 = X.C16050sL.A05(r0)
            if (r2 == 0) goto L_0x0067
            if (r1 == 0) goto L_0x0067
            X.0sO r0 = r3.A0z
            boolean r0 = r0.A09(r1)
            if (r0 != 0) goto L_0x0067
            return
        L_0x0067:
            X.0sG r0 = r3.A0a
            X.0sH r0 = r0.A09(r6)
            if (r0 == 0) goto L_0x002f
            X.0zJ r2 = r3.A0I
            X.0ph r0 = X.C14750ph.A0q()
            android.content.Intent r1 = r0.A0x(r4, r6)
            java.lang.String r0 = "ConversationRow"
            r2.A08(r4, r1, r0)
            return
        L_0x007f:
            X.0t6 r0 = r3.A0w
            X.1Vw r9 = r5.A11
            X.0tZ r7 = X.C16460t6.A00(r0, r9)
            if (r7 != 0) goto L_0x00a5
            boolean r0 = r9.A02
            if (r0 == 0) goto L_0x009f
            X.0t6 r8 = r3.A0w
            X.1kq r7 = X.C34771kq.A00
            r6 = 1
            java.lang.String r1 = r9.A01
            X.1Vw r0 = new X.1Vw
            r0.<init>(r7, r1, r6)
            X.0tZ r7 = X.C16460t6.A00(r8, r0)
            if (r7 != 0) goto L_0x00a5
        L_0x009f:
            X.1Sc r0 = r3.A0x
            X.0tZ r7 = r0.A00(r9)
        L_0x00a5:
            boolean r0 = r5 instanceof X.C38891ra
            if (r0 == 0) goto L_0x00c0
            java.lang.String r1 = r9.A01
            java.lang.String r0 = "product_inquiry"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x00c0
            X.0pt r2 = r3.A0J
            r1 = 14
            com.facebook.redex.RunnableRunnableShape5S0200000_I0_3 r0 = new com.facebook.redex.RunnableRunnableShape5S0200000_I0_3
            r0.<init>(r3, r1, r5)
            r2.A0K(r0)
            return
        L_0x00c0:
            if (r7 == 0) goto L_0x002f
            X.1Vw r6 = r7.A11
            X.0rv r1 = r6.A00
            boolean r0 = X.C16030sJ.A0Q(r1)
            if (r0 == 0) goto L_0x0274
            X.11G r0 = r3.A14
            boolean r0 = r0.A0I(r7)
            if (r0 != 0) goto L_0x002f
            X.0rv r1 = r7.A0B()
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            android.content.Intent r5 = X.C14750ph.A0K(r4, r1, r0)
            X.AnonymousClass1yL.A00(r5, r6)
            X.0pt r2 = r3.A0J
            r1 = 12
            com.facebook.redex.RunnableRunnableShape5S0200000_I0_3 r0 = new com.facebook.redex.RunnableRunnableShape5S0200000_I0_3
            r0.<init>(r4, r1, r5)
            r2.A0K(r0)
            return
        L_0x00ee:
            java.lang.Object r3 = r12.A00
            X.4O9 r3 = (X.AnonymousClass4O9) r3
            java.lang.Object r4 = r12.A01
            X.0rv r4 = (X.C15830rv) r4
            java.lang.Object r2 = r12.A02
            java.lang.Object r5 = r12.A03
            X.0sf r1 = r3.A05
            java.lang.String r0 = r4.getRawString()
            X.1WS r0 = r1.A07(r0)
            int r1 = r0.A00
            r0 = 1
            if (r1 != r0) goto L_0x002f
            X.0pt r0 = r3.A02
            r6 = 5
            com.facebook.redex.RunnableRunnableShape1S0400000_I1 r1 = new com.facebook.redex.RunnableRunnableShape1S0400000_I1
            r1.<init>(r2, r3, r4, r5, r6)
            r0.A0K(r1)
            X.1DH r1 = r3.A04
            r0 = 4
            com.whatsapp.jid.GroupJid r4 = (com.whatsapp.jid.GroupJid) r4
            r1.A00(r4, r0)
            return
        L_0x011d:
            java.lang.Object r4 = r12.A01
            X.1Hk r4 = (X.C24821Hk) r4
            X.11I r11 = r4.A08
            X.0t3 r2 = r4.A03
            long r5 = r2.A00()
            java.lang.String r3 = "db_migration_attempt_timestamp"
            r0 = 0
            long r7 = r11.A01(r3, r0)
            long r0 = r5 - r7
            long r9 = java.lang.Math.abs(r0)
            r7 = 43200000(0x2932e00, double:2.1343636E-316)
            int r0 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r0 < 0) goto L_0x002f
            r11.A05(r3, r5)
            java.lang.String r0 = "DatabaseMigrationAsyncTask/run/execute async task"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x02c0
        L_0x0148:
            java.lang.Object r5 = r12.A00
            X.2nl r5 = (X.C56502nl) r5
            java.lang.Object r4 = r12.A01
            X.5RO[] r4 = (X.AnonymousClass5RO[]) r4
            java.lang.Object r3 = r12.A02
            android.view.View r3 = (android.view.View) r3
            java.lang.Object r2 = r12.A03
            android.view.MotionEvent r2 = (android.view.MotionEvent) r2
            r1 = 0
            r0 = 1
            r5.A00 = r0
            r0 = r4[r1]
            r0.ATD(r2, r3)
            return
        L_0x0162:
            java.lang.Object r4 = r12.A00
            com.facebook.redex.IDxDListenerShape33S0300000_2_I0 r4 = (com.facebook.redex.IDxDListenerShape33S0300000_2_I0) r4
            java.lang.Object r0 = r12.A01
            X.0tY r0 = (X.C16730tY) r0
            java.lang.Object r1 = r12.A02
            X.1cu r1 = (X.C30761cu) r1
            java.lang.Object r3 = r12.A03
            X.0tZ r3 = (X.C16740tZ) r3
            X.0ta r0 = r0.A02
            java.io.File r2 = r1.A03()
            if (r0 == 0) goto L_0x018e
            if (r2 == 0) goto L_0x0191
            r0.A0F = r2
            java.lang.Object r1 = r4.A00
            X.0yD r1 = (X.C19300yD) r1
            X.0t6 r0 = r1.A0L
            r0.A0b(r3)
            X.01Z r1 = r1.A05
            r0 = 1
            r1.A05(r2, r0, r0)
            return
        L_0x018e:
            java.lang.String r0 = "MainMessageObserver/downloadQuotedMessageForSticker null mediaDataV2"
            goto L_0x0193
        L_0x0191:
            java.lang.String r0 = "MainMessageObserver/downloadQuotedMessageForSticker null download onComplete"
        L_0x0193:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x0197:
            java.lang.Object r1 = r12.A00
            X.4Ri r1 = (X.C86134Ri) r1
            java.lang.Object r0 = r12.A01
            X.26O r0 = (X.AnonymousClass26O) r0
            java.lang.Object r3 = r12.A02
            X.22J r3 = (X.AnonymousClass22J) r3
            java.lang.Object r5 = r12.A03
            X.2GI r5 = (X.AnonymousClass2GI) r5
            X.4HU r6 = r1.A02
            com.whatsapp.jid.UserJid r4 = r0.A05
            X.C18450wi.A0A(r4)
            X.4Ka r1 = r0.A00
            if (r1 == 0) goto L_0x01eb
            X.0qW r0 = r6.A01
            java.lang.Object r0 = r0.getValue()
            java.util.concurrent.atomic.AtomicReference r0 = (java.util.concurrent.atomic.AtomicReference) r0
            java.lang.Object r2 = r0.get()
            java.lang.String r1 = r1.A02
            X.4Vf r0 = new X.4Vf
            r0.<init>(r4, r1)
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x01eb
            X.2GH r0 = r5.A00
            X.C18450wi.A0A(r0)
            r6.A00 = r0
            java.util.List r0 = r5.A01
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x01e5
            X.3nc r0 = new X.3nc
            r0.<init>(r5)
            r3.AIU(r0)
            return
        L_0x01e5:
            X.3ng r0 = X.C73313ng.A00
            r3.AIU(r0)
            return
        L_0x01eb:
            X.3nh r0 = X.C73323nh.A00
            r3.AIU(r0)
            return
        L_0x01f1:
            java.lang.Object r1 = r12.A00
            com.facebook.redex.IDxDListenerShape33S0300000_2_I0 r1 = (com.facebook.redex.IDxDListenerShape33S0300000_2_I0) r1
            java.lang.Object r0 = r12.A01
            X.1cu r0 = (X.C30761cu) r0
            java.lang.Object r10 = r12.A02
            X.2dg r10 = (X.C52362dg) r10
            java.lang.Object r9 = r12.A03
            X.4He r9 = (X.C83564He) r9
            java.io.File r8 = r0.A03()
            X.AnonymousClass00B.A06(r8)
            java.lang.Object r7 = r1.A00
            X.1Hx r7 = (X.C24951Hx) r7
            X.1Hw r0 = r7.A0J
            java.lang.String r6 = r10.A08
            java.lang.String r5 = r8.getAbsolutePath()
            X.AnonymousClass00B.A00()
            X.19K r0 = r0.A01
            X.0tf r4 = r0.A02()
            X.0tg r3 = r4.A02     // Catch:{ all -> 0x0231 }
            java.lang.String r2 = "UPDATE history_sync_companion SET local_path = ? WHERE message_id = ?"
            r0 = 2
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x0231 }
            X.C13690nt.A1L(r5, r6, r1)     // Catch:{ all -> 0x0231 }
            r3.A0C(r2, r1)     // Catch:{ all -> 0x0231 }
            r4.close()
            r7.A01(r9, r10, r8)
            return
        L_0x0231:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0235 }
        L_0x0235:
            throw r0
        L_0x0236:
            java.lang.Object r5 = r12.A00
            android.content.Context r5 = (android.content.Context) r5
            java.lang.Object r0 = r12.A01
            X.4O9 r0 = (X.AnonymousClass4O9) r0
            java.lang.Object r4 = r12.A02
            X.0rv r4 = (X.C15830rv) r4
            java.lang.Object r3 = r12.A03
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            r2 = 0
            X.2of r1 = new X.2of
            r1.<init>(r5)
            r0.A00 = r1
            com.whatsapp.jid.GroupJid r4 = (com.whatsapp.jid.GroupJid) r4
            X.C18450wi.A0H(r4, r2)
            X.38v r0 = r1.getViewModel()
            r0.A00 = r4
            r3.setVisibility(r2)
            r3.addView(r1)
            return
        L_0x0260:
            java.lang.Object r3 = r12.A00
            X.0tb r3 = (X.C16760tb) r3
            java.lang.Object r2 = r12.A01
            java.util.Collection r2 = (java.util.Collection) r2
            java.lang.Object r1 = r12.A02
            X.0pt r1 = (X.C14870pt) r1
            java.lang.Object r0 = r12.A03
            android.app.Activity r0 = (android.app.Activity) r0
            X.C810146m.A00(r0, r1, r3, r2)
            return
        L_0x0274:
            X.AnonymousClass00B.A06(r1)
            X.1Vw r0 = r2.A11
            X.0rv r0 = r0.A00
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x02b3
            X.0ph r0 = X.C14750ph.A0q()
            android.content.Intent r5 = r0.A0x(r4, r1)
            long r1 = r7.A13
            java.lang.String r0 = "row_id"
            r5.putExtra(r0, r1)
            long r1 = r7.A14
            java.lang.String r0 = "sort_id"
            r5.putExtra(r0, r1)
            long r1 = android.os.SystemClock.uptimeMillis()
            java.lang.String r0 = "start_t"
            r5.putExtra(r0, r1)
            X.AnonymousClass1yL.A00(r5, r6)
            X.0pt r2 = r3.A0J
            r1 = 42
            com.facebook.redex.RunnableRunnableShape0S0300000_I0 r0 = new com.facebook.redex.RunnableRunnableShape0S0300000_I0
            r0.<init>(r3, r4, r5, r1)
            r2.A0K(r0)
            return
        L_0x02b3:
            X.0pt r2 = r3.A0J
            r1 = 43
            com.facebook.redex.RunnableRunnableShape0S0300000_I0 r0 = new com.facebook.redex.RunnableRunnableShape0S0300000_I0
            r0.<init>(r3, r4, r7, r1)
            r2.A0K(r0)
            return
        L_0x02c0:
            X.1Hi r5 = r4.A0A     // Catch:{ all -> 0x03c5 }
            X.0pd r3 = r5.A01     // Catch:{ all -> 0x03c5 }
            r0 = 200(0xc8, float:2.8E-43)
            X.0tM r6 = X.C16620tM.A02     // Catch:{ all -> 0x03c5 }
            int r0 = r3.A03(r6, r0)     // Catch:{ all -> 0x03c5 }
            long r0 = (long) r0     // Catch:{ all -> 0x03c5 }
            r8 = 0
            int r7 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r7 <= 0) goto L_0x031d
            boolean r0 = r5.A00()     // Catch:{ all -> 0x03c5 }
            if (r0 != 0) goto L_0x031a
            X.1Hh r7 = r5.A03     // Catch:{ all -> 0x03c5 }
            r1 = 1
            X.0tK r0 = r7.A00     // Catch:{ all -> 0x03c5 }
            boolean r0 = r0.A05     // Catch:{ all -> 0x03c5 }
            if (r0 == 0) goto L_0x02f3
            java.lang.String r0 = "sendmethods/sendGetABProps"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x03c5 }
            X.01J r0 = r7.A01     // Catch:{ all -> 0x03c5 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x03c5 }
            X.1Tt r0 = (X.C27951Tt) r0     // Catch:{ all -> 0x03c5 }
            r0.A00(r1)     // Catch:{ all -> 0x03c5 }
        L_0x02f3:
            long r0 = X.C24801Hi.A04     // Catch:{ all -> 0x03c5 }
            long r9 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x03c5 }
            long r9 = r9 + r0
        L_0x02fa:
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x03c5 }
            boolean r0 = r0.isInterrupted()     // Catch:{ all -> 0x03c5 }
            if (r0 != 0) goto L_0x0318
            boolean r0 = r5.A00()     // Catch:{ all -> 0x03c5 }
            if (r0 != 0) goto L_0x031a
            long r7 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x03c5 }
            int r0 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r0 <= 0) goto L_0x0318
            r0 = 100
            android.os.SystemClock.sleep(r0)     // Catch:{ all -> 0x03c5 }
            goto L_0x02fa
        L_0x0318:
            r0 = 0
            goto L_0x0327
        L_0x031a:
            r0 = 201(0xc9, float:2.82E-43)
            goto L_0x031f
        L_0x031d:
            r0 = 0
            goto L_0x0323
        L_0x031f:
            boolean r0 = r3.A0E(r6, r0)     // Catch:{ all -> 0x03c5 }
        L_0x0323:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x03c5 }
        L_0x0327:
            X.4QF r1 = new X.4QF     // Catch:{ all -> 0x03c5 }
            r1.<init>(r0)     // Catch:{ all -> 0x03c5 }
            java.lang.Boolean r0 = r1.A00     // Catch:{ all -> 0x03c5 }
            if (r0 == 0) goto L_0x038d
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x03c5 }
            if (r0 != 0) goto L_0x038d
            X.0ts r0 = r4.A05     // Catch:{ all -> 0x03c5 }
            boolean r0 = r0.A0H()     // Catch:{ all -> 0x03c5 }
            if (r0 != 0) goto L_0x0344
            java.lang.String r0 = "DatabaseMigrationAsyncTask/run; migration skipped because chat store is not ready."
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x03c5 }
            goto L_0x03bd
        L_0x0344:
            java.lang.Object r5 = r12.A03     // Catch:{ all -> 0x03c5 }
            X.11E r5 = (X.AnonymousClass11E) r5     // Catch:{ all -> 0x03c5 }
            r0 = 1
            X.1bj[] r3 = new X.C30091bj[r0]     // Catch:{ all -> 0x03c5 }
            X.12s r1 = r4.A02     // Catch:{ all -> 0x03c5 }
            X.1bn r0 = new X.1bn     // Catch:{ all -> 0x03c5 }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x03c5 }
            r4 = 0
            r3[r4] = r0     // Catch:{ all -> 0x03c5 }
            X.1bk r2 = new X.1bk     // Catch:{ all -> 0x03c5 }
            r2.<init>(r3)     // Catch:{ all -> 0x03c5 }
            X.11D r0 = r5.A0B     // Catch:{ all -> 0x03c5 }
            X.0vs r0 = r0.A00()     // Catch:{ all -> 0x03c5 }
            X.0uz r1 = r0.keySet()     // Catch:{ all -> 0x03c5 }
            r0 = 7
            r5.A04(r2, r1, r0, r4)     // Catch:{ all -> 0x03c5 }
            X.0rz r1 = r5.A05     // Catch:{ all -> 0x03c5 }
            X.0t3 r0 = r5.A04     // Catch:{ all -> 0x03c5 }
            long r2 = r0.A00()     // Catch:{ all -> 0x03c5 }
            android.content.SharedPreferences r0 = X.C13680ns.A0B(r1)     // Catch:{ all -> 0x03c5 }
            android.content.SharedPreferences$Editor r1 = r0.edit()     // Catch:{ all -> 0x03c5 }
            java.lang.String r0 = "db_last_all_migrations_attempt_timestamp"
            X.C13680ns.A0x(r1, r0, r2)     // Catch:{ all -> 0x03c5 }
            java.lang.Object r1 = r12.A00     // Catch:{ all -> 0x03c5 }
            X.0pd r1 = (X.C14710pd) r1     // Catch:{ all -> 0x03c5 }
            r0 = 424(0x1a8, float:5.94E-43)
            boolean r0 = r1.A0E(r6, r0)     // Catch:{ all -> 0x03c5 }
            if (r0 == 0) goto L_0x03bd
            r5.A02(r4)     // Catch:{ all -> 0x03c5 }
            goto L_0x03bd
        L_0x038d:
            X.3qj r5 = new X.3qj     // Catch:{ all -> 0x03c5 }
            r5.<init>()     // Catch:{ all -> 0x03c5 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x03c5 }
            r5.A01 = r0     // Catch:{ all -> 0x03c5 }
            r0 = 200(0xc8, float:2.8E-43)
            int r0 = r3.A03(r6, r0)     // Catch:{ all -> 0x03c5 }
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x03c5 }
            long r1 = (long) r0     // Catch:{ all -> 0x03c5 }
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MINUTES     // Catch:{ all -> 0x03c5 }
            long r2 = r3.convert(r1, r0)     // Catch:{ all -> 0x03c5 }
            long r0 = X.C24801Hi.A05     // Catch:{ all -> 0x03c5 }
            long r0 = java.lang.Math.max(r2, r0)     // Catch:{ all -> 0x03c5 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x03c5 }
            r5.A00 = r0     // Catch:{ all -> 0x03c5 }
            X.0t9 r0 = r4.A0E     // Catch:{ all -> 0x03c5 }
            r0.A06(r5)     // Catch:{ all -> 0x03c5 }
            java.lang.String r0 = "DatabaseMigrationAsyncTask/run; migration skipped due to kill switch."
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x03c5 }
        L_0x03bd:
            java.lang.Object r0 = r12.A02
            android.os.ConditionVariable r0 = (android.os.ConditionVariable) r0
            r0.open()
            return
        L_0x03c5:
            r1 = move-exception
            java.lang.Object r0 = r12.A02
            android.os.ConditionVariable r0 = (android.os.ConditionVariable) r0
            r0.open()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.RunnableRunnableShape1S0400000_I1.run():void");
    }
}
