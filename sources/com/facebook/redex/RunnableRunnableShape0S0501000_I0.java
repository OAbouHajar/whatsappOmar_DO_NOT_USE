package com.facebook.redex;

public class RunnableRunnableShape0S0501000_I0 implements Runnable {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public final int A06;

    public RunnableRunnableShape0S0501000_I0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i2, int i3) {
        this.A06 = i3;
        this.A02 = obj;
        this.A05 = obj2;
        this.A03 = obj3;
        this.A01 = obj4;
        this.A00 = i2;
        this.A04 = obj5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:115:0x02c0, code lost:
        r2 = r1.A00;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:80:0x01f1 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:85:0x01f6 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r27 = this;
            r22 = 0
            r1 = r27
            int r0 = r1.A06
            switch(r0) {
                case 0: goto L_0x0318;
                case 1: goto L_0x0205;
                case 2: goto L_0x0009;
                case 3: goto L_0x0009;
                case 4: goto L_0x0278;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r0 = r1.A01
            r18 = r0
            r0 = r18
            X.1SV r0 = (X.AnonymousClass1SV) r0
            r18 = r0
            java.lang.Object r5 = r1.A02
            byte[] r5 = (byte[]) r5
            int r0 = r1.A00
            byte r2 = (byte) r0
            java.lang.Object r3 = r1.A03
            byte[] r3 = (byte[]) r3
            java.lang.Object r4 = r1.A04
            byte[][] r4 = (byte[][]) r4
            java.lang.Object r6 = r1.A05
            byte[] r6 = (byte[]) r6
            r0 = r18
            X.0xT r0 = r0.A05
            java.util.concurrent.locks.Lock r17 = r0.A01()
            if (r17 == 0) goto L_0x0033
            r17.lock()     // Catch:{ all -> 0x01fe }
        L_0x0033:
            r0 = 5
            r1 = 0
            if (r2 == r0) goto L_0x0047
            r0 = r18
            X.12z r0 = r0.A00     // Catch:{ all -> 0x01fe }
            r0.A00()     // Catch:{ all -> 0x01fe }
            r0 = r18
            X.0rz r0 = r0.A02     // Catch:{ all -> 0x01fe }
            r0.A1S(r1)     // Catch:{ all -> 0x01fe }
            goto L_0x01e5
        L_0x0047:
            int r2 = X.C28641Wx.A00(r5)     // Catch:{ all -> 0x01fe }
            r0 = r18
            X.11s r10 = r0.A03     // Catch:{ all -> 0x01fe }
            X.1d4 r0 = r10.A07     // Catch:{ all -> 0x01fe }
            int r0 = r0.A01()     // Catch:{ all -> 0x01fe }
            if (r2 == r0) goto L_0x0067
            r0 = r18
            X.12z r0 = r0.A00     // Catch:{ all -> 0x01fe }
            r0.A00()     // Catch:{ all -> 0x01fe }
            r0 = r18
            X.0rz r0 = r0.A02     // Catch:{ all -> 0x01fe }
            r0.A1S(r1)     // Catch:{ all -> 0x01fe }
            goto L_0x01e5
        L_0x0067:
            byte[] r8 = r10.A0h()     // Catch:{ all -> 0x01fe }
            X.1dG r7 = r10.A0I()     // Catch:{ all -> 0x01fe }
            byte[] r0 = r7.A01     // Catch:{ all -> 0x01fe }
            boolean r0 = java.util.Arrays.equals(r0, r3)     // Catch:{ all -> 0x01fe }
            if (r0 != 0) goto L_0x0087
            r0 = r18
            X.12z r0 = r0.A00     // Catch:{ all -> 0x01fe }
            r0.A00()     // Catch:{ all -> 0x01fe }
            r0 = r18
            X.0rz r0 = r0.A02     // Catch:{ all -> 0x01fe }
            r0.A1S(r1)     // Catch:{ all -> 0x01fe }
            goto L_0x01e5
        L_0x0087:
            int r3 = r4.length     // Catch:{ all -> 0x01fe }
            int[] r9 = new int[r3]     // Catch:{ all -> 0x01fe }
            r2 = 0
        L_0x008b:
            if (r2 >= r3) goto L_0x0098
            r0 = r4[r2]     // Catch:{ all -> 0x01fe }
            int r0 = X.C28641Wx.A01(r0)     // Catch:{ all -> 0x01fe }
            r9[r2] = r0     // Catch:{ all -> 0x01fe }
            int r2 = r2 + 1
            goto L_0x008b
        L_0x0098:
            X.0xT r0 = r10.A0I     // Catch:{ all -> 0x01fe }
            java.util.concurrent.locks.Lock r16 = r0.A01()     // Catch:{ all -> 0x01fe }
            if (r16 != 0) goto L_0x00a6
            X.16P r0 = r10.A0H     // Catch:{ all -> 0x01f7 }
            r0.A00()     // Catch:{ all -> 0x01f7 }
            goto L_0x00a9
        L_0x00a6:
            r16.lock()     // Catch:{ all -> 0x01f7 }
        L_0x00a9:
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x01f7 }
            r4.<init>(r3)     // Catch:{ all -> 0x01f7 }
            android.util.SparseArray r5 = new android.util.SparseArray     // Catch:{ all -> 0x01f7 }
            r5.<init>(r3)     // Catch:{ all -> 0x01f7 }
            X.1es r0 = r10.A09     // Catch:{ all -> 0x01f7 }
            java.lang.String r13 = "record"
            java.lang.String r12 = "prekey_id"
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ all -> 0x01f7 }
            r11.<init>()     // Catch:{ all -> 0x01f7 }
            X.01d r0 = r0.A02     // Catch:{ all -> 0x01f7 }
            X.0tf r10 = r0.get()     // Catch:{ all -> 0x01f7 }
            X.0tg r2 = r10.A02     // Catch:{ all -> 0x01f2 }
            java.lang.String r20 = "prekeys"
            r0 = 2
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch:{ all -> 0x01f2 }
            r0[r1] = r12     // Catch:{ all -> 0x01f2 }
            r14 = 1
            r0[r14] = r13     // Catch:{ all -> 0x01f2 }
            r24 = r22
            r25 = r22
            r26 = r22
            r19 = r2
            r21 = r0
            r23 = r22
            android.database.Cursor r14 = r19.A09(r20, r21, r22, r23, r24, r25, r26)     // Catch:{ all -> 0x01f2 }
        L_0x00e0:
            boolean r0 = r14.moveToNext()     // Catch:{ all -> 0x01eb }
            if (r0 == 0) goto L_0x00ff
            int r0 = r14.getColumnIndexOrThrow(r12)     // Catch:{ all -> 0x01eb }
            int r15 = r14.getInt(r0)     // Catch:{ all -> 0x01eb }
            int r0 = r14.getColumnIndexOrThrow(r13)     // Catch:{ all -> 0x01eb }
            byte[] r2 = r14.getBlob(r0)     // Catch:{ all -> 0x01eb }
            X.1ew r0 = new X.1ew     // Catch:{ all -> 0x01eb }
            r0.<init>(r15, r2)     // Catch:{ all -> 0x01eb }
            r11.add(r0)     // Catch:{ all -> 0x01eb }
            goto L_0x00e0
        L_0x00ff:
            r14.close()     // Catch:{ all -> 0x01f2 }
            r10.close()     // Catch:{ all -> 0x01f7 }
            java.util.Iterator r12 = r11.iterator()     // Catch:{ all -> 0x01f7 }
        L_0x0109:
            boolean r0 = r12.hasNext()     // Catch:{ all -> 0x01f7 }
            if (r0 == 0) goto L_0x0139
            java.lang.Object r11 = r12.next()     // Catch:{ all -> 0x01f7 }
            X.1ew r11 = (X.C31731ew) r11     // Catch:{ all -> 0x01f7 }
            int r2 = r11.A00     // Catch:{ IOException -> 0x0121 }
            byte[] r0 = r11.A01     // Catch:{ IOException -> 0x0121 }
            X.1dG r0 = X.C208211s.A01(r0, r2)     // Catch:{ IOException -> 0x0121 }
            r5.put(r2, r0)     // Catch:{ IOException -> 0x0121 }
            goto L_0x0109
        L_0x0121:
            r10 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x01f7 }
            r2.<init>()     // Catch:{ all -> 0x01f7 }
            java.lang.String r0 = "error reading prekey "
            r2.append(r0)     // Catch:{ all -> 0x01f7 }
            int r0 = r11.A00     // Catch:{ all -> 0x01f7 }
            r2.append(r0)     // Catch:{ all -> 0x01f7 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x01f7 }
            com.whatsapp.util.Log.e(r0, r10)     // Catch:{ all -> 0x01f7 }
            goto L_0x0109
        L_0x0139:
            r2 = 0
        L_0x013a:
            if (r2 >= r3) goto L_0x014d
            r0 = r9[r2]     // Catch:{ all -> 0x01f7 }
            java.lang.Object r0 = r5.get(r0)     // Catch:{ all -> 0x01f7 }
            X.1dG r0 = (X.C30971dG) r0     // Catch:{ all -> 0x01f7 }
            if (r0 != 0) goto L_0x0147
            goto L_0x0173
        L_0x0147:
            r4.add(r0)     // Catch:{ all -> 0x01f7 }
            int r2 = r2 + 1
            goto L_0x013a
        L_0x014d:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x01f7 }
            r2.<init>()     // Catch:{ all -> 0x01f7 }
            java.lang.String r0 = "axolotl reporting back "
            r2.append(r0)     // Catch:{ all -> 0x01f7 }
            int r0 = r4.size()     // Catch:{ all -> 0x01f7 }
            r2.append(r0)     // Catch:{ all -> 0x01f7 }
            java.lang.String r0 = " sequenced prekeys"
            r2.append(r0)     // Catch:{ all -> 0x01f7 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x01f7 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x01f7 }
            X.1dG[] r0 = new X.C30971dG[r1]     // Catch:{ all -> 0x01f7 }
            java.lang.Object[] r5 = r4.toArray(r0)     // Catch:{ all -> 0x01f7 }
            X.1dG[] r5 = (X.C30971dG[]) r5     // Catch:{ all -> 0x01f7 }
            goto L_0x0174
        L_0x0173:
            r5 = 0
        L_0x0174:
            if (r16 == 0) goto L_0x0179
            r16.unlock()     // Catch:{ all -> 0x01fe }
        L_0x0179:
            if (r5 == 0) goto L_0x01d7
            int r4 = r5.length     // Catch:{ all -> 0x01fe }
            if (r4 != r3) goto L_0x01d7
            java.lang.String r0 = "SHA1"
            java.security.MessageDigest r3 = java.security.MessageDigest.getInstance(r0)     // Catch:{ NoSuchAlgorithmException -> 0x01c2 }
            r3.update(r8)     // Catch:{ all -> 0x01fe }
            byte[] r0 = r7.A00     // Catch:{ all -> 0x01fe }
            r3.update(r0)     // Catch:{ all -> 0x01fe }
            byte[] r0 = r7.A02     // Catch:{ all -> 0x01fe }
            r3.update(r0)     // Catch:{ all -> 0x01fe }
            r2 = 0
        L_0x0192:
            if (r2 >= r4) goto L_0x019e
            r0 = r5[r2]     // Catch:{ all -> 0x01fe }
            byte[] r0 = r0.A00     // Catch:{ all -> 0x01fe }
            r3.update(r0)     // Catch:{ all -> 0x01fe }
            int r2 = r2 + 1
            goto L_0x0192
        L_0x019e:
            byte[] r0 = r3.digest()     // Catch:{ all -> 0x01fe }
            boolean r0 = java.util.Arrays.equals(r0, r6)     // Catch:{ all -> 0x01fe }
            if (r0 != 0) goto L_0x01bc
            java.lang.String r0 = "prekey digest check failed"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x01fe }
            r0 = r18
            X.12z r0 = r0.A00     // Catch:{ all -> 0x01fe }
            r0.A00()     // Catch:{ all -> 0x01fe }
        L_0x01b4:
            r0 = r18
            X.0rz r0 = r0.A02     // Catch:{ all -> 0x01fe }
            r0.A1S(r1)     // Catch:{ all -> 0x01fe }
            goto L_0x01e5
        L_0x01bc:
            java.lang.String r0 = "prekey digest check passed"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x01fe }
            goto L_0x01b4
        L_0x01c2:
            r2 = move-exception
            java.lang.String r0 = "prekey digest SHA1 algorithm unknown"
            com.whatsapp.util.Log.w(r0, r2)     // Catch:{ all -> 0x01fe }
            r0 = r18
            X.12z r0 = r0.A00     // Catch:{ all -> 0x01fe }
            r0.A00()     // Catch:{ all -> 0x01fe }
            r0 = r18
            X.0rz r0 = r0.A02     // Catch:{ all -> 0x01fe }
            r0.A1S(r1)     // Catch:{ all -> 0x01fe }
            goto L_0x01e5
        L_0x01d7:
            r0 = r18
            X.12z r0 = r0.A00     // Catch:{ all -> 0x01fe }
            r0.A00()     // Catch:{ all -> 0x01fe }
            r0 = r18
            X.0rz r0 = r0.A02     // Catch:{ all -> 0x01fe }
            r0.A1S(r1)     // Catch:{ all -> 0x01fe }
        L_0x01e5:
            if (r17 == 0) goto L_0x0373
            r17.unlock()
            return
        L_0x01eb:
            r0 = move-exception
            if (r14 == 0) goto L_0x01f1
            r14.close()     // Catch:{ all -> 0x01f1 }
        L_0x01f1:
            throw r0     // Catch:{ all -> 0x01f2 }
        L_0x01f2:
            r0 = move-exception
            r10.close()     // Catch:{ all -> 0x01f6 }
        L_0x01f6:
            throw r0     // Catch:{ all -> 0x01f7 }
        L_0x01f7:
            r0 = move-exception
            if (r16 == 0) goto L_0x01fd
            r16.unlock()     // Catch:{ all -> 0x01fe }
        L_0x01fd:
            throw r0     // Catch:{ all -> 0x01fe }
        L_0x01fe:
            r0 = move-exception
            if (r17 == 0) goto L_0x0204
            r17.unlock()
        L_0x0204:
            throw r0
        L_0x0205:
            java.lang.Object r5 = r1.A01
            X.0ul r5 = (X.C17240ul) r5
            java.lang.Object r3 = r1.A02
            X.1WP r3 = (X.AnonymousClass1WP) r3
            java.lang.Object r4 = r1.A03
            X.0tZ r4 = (X.C16740tZ) r4
            int r2 = r1.A00
            java.lang.Object r9 = r1.A04
            java.io.File r9 = (java.io.File) r9
            java.lang.Object r10 = r1.A05
            java.io.File r10 = (java.io.File) r10
            r0 = 300(0x12c, double:1.48E-321)
            android.os.SystemClock.sleep(r0)
            java.lang.String r0 = "group/create again, jid:"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r3)
            java.lang.String r0 = " subject:"
            r1.append(r0)
            java.lang.String r0 = r4.A0I()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            java.lang.String r21 = r4.A0I()
            java.util.List r23 = r4.A0Q()
            r25 = 0
            X.4OC r7 = new X.4OC
            r18 = r7
            r19 = r22
            r20 = r3
            r24 = r2
            r18.<init>(r19, r20, r21, r22, r23, r24, r25)
            X.0t3 r2 = r5.A0L
            X.0t6 r4 = r5.A0T
            X.122 r8 = r5.A0y
            X.11A r3 = r5.A0S
            X.3uB r1 = new X.3uB
            r6 = r5
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            X.0pd r10 = r5.A0f
            X.0so r7 = r5.A06
            X.0sK r8 = r5.A08
            X.0ug r14 = r5.A0q
            X.4OC r13 = r1.A04
            X.3Gi r6 = new X.3Gi
            r9 = r2
            r11 = r5
            r12 = r1
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14)
            r6.A00()
            return
        L_0x0278:
            java.lang.Object r4 = r1.A01
            X.0tH r4 = (X.C16570tH) r4
            boolean r0 = r4.A00
            if (r0 == 0) goto L_0x02b2
            java.lang.Object r0 = r1.A05
            X.0yW r0 = (X.C19490yW) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x02b2
            java.lang.Object r3 = r1.A03
            X.150 r3 = (X.AnonymousClass150) r3
            X.4Eh r0 = r3.A00
            if (r0 == 0) goto L_0x0373
            com.obwhatsapp.notification.PopupNotification r0 = r0.A00
            boolean r0 = r0.A1Q
            if (r0 == 0) goto L_0x0373
            java.lang.String r0 = "messagenotification/popupnotification/foreground"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Object r1 = r1.A04
            X.0rv r1 = (X.C15830rv) r1
            X.4Eh r0 = r3.A00
            if (r0 == 0) goto L_0x02a8
            com.obwhatsapp.notification.PopupNotification r0 = r0.A00
            r0.A2u(r1)
        L_0x02a8:
            X.4Eh r0 = r3.A00
            if (r0 == 0) goto L_0x0373
            com.obwhatsapp.notification.PopupNotification r0 = r0.A00
            r0.A2m()
            return
        L_0x02b2:
            java.lang.String r0 = "messagenotification/popupnotification/background"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Object r0 = r1.A05
            X.0yW r0 = (X.C19490yW) r0
            boolean r0 = r0.A00
            r3 = 3
            if (r0 == 0) goto L_0x02c7
            int r2 = r1.A00
            r0 = 2
            if (r2 == r0) goto L_0x02cf
            if (r2 == r3) goto L_0x02cf
        L_0x02c7:
            boolean r0 = r4.A00
            if (r0 != 0) goto L_0x02e6
            int r0 = r1.A00
            if (r0 == r3) goto L_0x02e6
        L_0x02cf:
            r4 = 1
        L_0x02d0:
            java.lang.Object r3 = r1.A03
            X.150 r3 = (X.AnonymousClass150) r3
            X.4Eh r0 = r3.A00
            if (r0 == 0) goto L_0x02e8
            com.obwhatsapp.notification.PopupNotification r2 = r0.A00
            boolean r0 = r2.A1Q
            if (r0 == 0) goto L_0x02e8
            java.lang.Object r0 = r1.A04
            X.0rv r0 = (X.C15830rv) r0
            r2.A2u(r0)
            goto L_0x02a8
        L_0x02e6:
            r4 = 0
            goto L_0x02d0
        L_0x02e8:
            if (r4 == 0) goto L_0x0373
            java.lang.Object r5 = r1.A02
            android.content.Context r5 = (android.content.Context) r5
            java.lang.Object r4 = r1.A04
            com.whatsapp.jid.Jid r4 = (com.whatsapp.jid.Jid) r4
            r3 = 0
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r1 = r5.getPackageName()
            java.lang.String r0 = "com.obwhatsapp.notification.PopupNotification"
            r2.setClassName(r1, r0)
            java.lang.String r1 = X.C16030sJ.A03(r4)
            java.lang.String r0 = "popup_notification_extra_quick_reply_jid"
            r2.putExtra(r0, r1)
            java.lang.String r0 = "popup_notification_extra_dismiss_notification"
            r2.putExtra(r0, r3)
            r0 = 268697600(0x10040000, float:2.603241E-29)
            r2.setFlags(r0)
            r5.startActivity(r2)
            return
        L_0x0318:
            X.3sP r4 = new X.3sP
            r4.<init>()
            java.lang.Object r2 = r1.A03
            X.0yz r2 = (X.C19780yz) r2
            java.lang.Object r0 = r1.A04
            X.0rv r0 = (X.C15830rv) r0
            X.0tZ r5 = r2.A00(r0)
            if (r5 == 0) goto L_0x0351
            byte r3 = r5.A10
            int r2 = r5.A08
            boolean r0 = X.C30921dB.A04(r5)
            int r0 = X.C42141xI.A00(r3, r2, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.A00 = r0
            long r2 = r5.A0I
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r4.A05 = r0
            X.1Vw r0 = r5.A11
            java.lang.String r0 = r0.A01
            r4.A06 = r0
            java.lang.String r0 = X.C42601y5.A00(r5)
            r4.A07 = r0
        L_0x0351:
            int r0 = r1.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.A02 = r0
            java.lang.Object r0 = r1.A02
            java.lang.Integer r0 = (java.lang.Integer) r0
            r4.A03 = r0
            r0 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.A04 = r0
            java.lang.Object r0 = r1.A01
            java.lang.Integer r0 = (java.lang.Integer) r0
            r4.A01 = r0
            java.lang.Object r0 = r1.A05
            X.0t9 r0 = (X.C16490t9) r0
            r0.A06(r4)
        L_0x0373:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.RunnableRunnableShape0S0501000_I0.run():void");
    }
}
