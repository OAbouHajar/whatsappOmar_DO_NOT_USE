package com.facebook.redex;

public class RunnableRunnableShape0S2100000_I0 implements Runnable {
    public Object A00;
    public String A01;
    public String A02;
    public final int A03;

    public RunnableRunnableShape0S2100000_I0(Object obj, String str, String str2, int i2) {
        this.A03 = i2;
        this.A00 = obj;
        this.A01 = str;
        this.A02 = str2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0204, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:164:0x035b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:89:0x015a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r14 = this;
            int r0 = r14.A03
            switch(r0) {
                case 0: goto L_0x003c;
                case 1: goto L_0x0174;
                case 2: goto L_0x0180;
                case 3: goto L_0x018c;
                case 4: goto L_0x0195;
                case 5: goto L_0x01bb;
                case 6: goto L_0x020d;
                case 7: goto L_0x0287;
                case 8: goto L_0x0295;
                case 9: goto L_0x02c0;
                case 10: goto L_0x001a;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r14.A00
            X.2KF r0 = (X.AnonymousClass2KF) r0
            X.1H4 r0 = r0.A00
            X.01D r0 = r0.A02
            java.lang.Object r2 = r0.get()
            X.0ps r2 = (X.C14860ps) r2
            r1 = -1
            java.lang.String r0 = "Delivery failure."
            r2.A03(r0, r1)
        L_0x0019:
            return
        L_0x001a:
            java.lang.Object r0 = r14.A00
            X.1CX r0 = (X.AnonymousClass1CX) r0
            java.lang.String r3 = r14.A01
            java.lang.String r2 = r14.A02
            X.14W r0 = r0.A0K
            java.lang.Iterable r0 = r0.A01()
            java.util.Iterator r1 = r0.iterator()
        L_0x002c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0019
            java.lang.Object r0 = r1.next()
            X.1we r0 = (X.C41781we) r0
            r0.A07(r3, r2)
            goto L_0x002c
        L_0x003c:
            java.lang.Object r4 = r14.A00
            com.whatsapp.anr.SigquitBasedANRDetector r4 = (com.whatsapp.anr.SigquitBasedANRDetector) r4
            java.lang.String r3 = r14.A01
            java.lang.String r2 = r14.A02
            java.lang.String r0 = "SigquitBasedANRDetector/processing ANR start"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r0 = "SigquitBasedANRDetector/persisting ANR report start"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            if (r2 == 0) goto L_0x0062
            java.lang.String r1 = "  | detected using Sigquit based detector\n"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r3 = r3.replace(r2, r0)
        L_0x0062:
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            java.lang.Thread r0 = r0.getThread()
            java.lang.StackTraceElement[] r2 = r0.getStackTrace()
            java.lang.String r0 = "ANR detected"
            java.lang.Exception r1 = new java.lang.Exception
            r1.<init>(r0)
            r1.setStackTrace(r2)
            java.lang.String r0 = "SigquitBasedANRDetector/Generating ANR Report"
            com.whatsapp.util.Log.e(r0, r1)
            X.10s r0 = r4.A05     // Catch:{ IOException -> 0x015b }
            X.0tz r0 = r0.A00     // Catch:{ IOException -> 0x015b }
            android.content.Context r0 = r0.A00     // Catch:{ IOException -> 0x015b }
            java.io.File r1 = r0.getCacheDir()     // Catch:{ IOException -> 0x015b }
            java.lang.String r0 = "traces"
            java.io.File r2 = new java.io.File     // Catch:{ IOException -> 0x015b }
            r2.<init>(r1, r0)     // Catch:{ IOException -> 0x015b }
            boolean r0 = r2.exists()     // Catch:{ IOException -> 0x015b }
            if (r0 != 0) goto L_0x0098
            r2.mkdirs()     // Catch:{ IOException -> 0x015b }
        L_0x0098:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x015b }
            r1.<init>()     // Catch:{ IOException -> 0x015b }
            java.lang.String r0 = "2.23.1.76"
            r1.append(r0)     // Catch:{ IOException -> 0x015b }
            java.lang.String r0 = "_"
            r1.append(r0)     // Catch:{ IOException -> 0x015b }
            java.lang.String r0 = X.C17080uV.A08     // Catch:{ IOException -> 0x015b }
            r1.append(r0)     // Catch:{ IOException -> 0x015b }
            java.lang.String r0 = r1.toString()     // Catch:{ IOException -> 0x015b }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x015b }
            r1.<init>()     // Catch:{ IOException -> 0x015b }
            r1.append(r0)     // Catch:{ IOException -> 0x015b }
            java.lang.String r0 = ".stacktrace"
            r1.append(r0)     // Catch:{ IOException -> 0x015b }
            java.lang.String r0 = r1.toString()     // Catch:{ IOException -> 0x015b }
            java.io.File r5 = new java.io.File     // Catch:{ IOException -> 0x015b }
            r5.<init>(r2, r0)     // Catch:{ IOException -> 0x015b }
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x015b }
            r1.<init>(r5)     // Catch:{ IOException -> 0x015b }
            java.io.PrintWriter r0 = new java.io.PrintWriter     // Catch:{ all -> 0x0156 }
            r0.<init>(r1)     // Catch:{ all -> 0x0156 }
            r0.write(r3)     // Catch:{ all -> 0x0156 }
            r0.flush()     // Catch:{ all -> 0x0156 }
            r1.close()     // Catch:{ IOException -> 0x015b }
            java.lang.String r0 = "anr-helper/stored anr report: "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x015b }
            r1.<init>(r0)     // Catch:{ IOException -> 0x015b }
            java.lang.String r0 = r5.getName()     // Catch:{ IOException -> 0x015b }
            r1.append(r0)     // Catch:{ IOException -> 0x015b }
            java.lang.String r0 = r1.toString()     // Catch:{ IOException -> 0x015b }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IOException -> 0x015b }
            java.lang.Object r2 = r4.A08
            monitor-enter(r2)
            X.1gs r6 = r4.A06     // Catch:{ all -> 0x0153 }
            monitor-enter(r6)     // Catch:{ all -> 0x0153 }
            int r0 = r6.A00     // Catch:{ all -> 0x0150 }
            monitor-exit(r6)     // Catch:{ all -> 0x0153 }
            if (r0 == 0) goto L_0x0113
            monitor-enter(r6)     // Catch:{ all -> 0x0153 }
            int r0 = r6.A00     // Catch:{ all -> 0x0110 }
            if (r0 == 0) goto L_0x010e
            X.1gu r3 = r6.A02     // Catch:{ all -> 0x0110 }
            java.lang.Object r1 = r3.A04     // Catch:{ all -> 0x0110 }
            monitor-enter(r1)     // Catch:{ all -> 0x0110 }
            r0 = 1
            r3.A01 = r0     // Catch:{ all -> 0x010b }
            r1.notifyAll()     // Catch:{ all -> 0x010b }
            monitor-exit(r1)     // Catch:{ all -> 0x010b }
            goto L_0x010e
        L_0x010b:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x010b }
            throw r0     // Catch:{ all -> 0x0110 }
        L_0x010e:
            monitor-exit(r6)     // Catch:{ all -> 0x0110 }
            goto L_0x0113
        L_0x0110:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0110 }
            goto L_0x0152
        L_0x0113:
            java.lang.String r0 = "SigquitBasedANRDetector/About to start process anr error monitor"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0153 }
            X.1gt r7 = new X.1gt     // Catch:{ all -> 0x0153 }
            r7.<init>(r4, r5)     // Catch:{ all -> 0x0153 }
            monitor-enter(r6)     // Catch:{ all -> 0x0153 }
            X.1gu r3 = r6.A02     // Catch:{ all -> 0x014d }
            if (r3 == 0) goto L_0x0134
            int r0 = r6.A00     // Catch:{ all -> 0x014d }
            if (r0 == 0) goto L_0x0134
            java.lang.Object r1 = r3.A04     // Catch:{ all -> 0x014d }
            monitor-enter(r1)     // Catch:{ all -> 0x014d }
            r0 = 1
            r3.A01 = r0     // Catch:{ all -> 0x0131 }
            r1.notifyAll()     // Catch:{ all -> 0x0131 }
            monitor-exit(r1)     // Catch:{ all -> 0x0131 }
            goto L_0x0134
        L_0x0131:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0131 }
            throw r0     // Catch:{ all -> 0x014d }
        L_0x0134:
            long r9 = r6.A01     // Catch:{ all -> 0x014d }
            r0 = 1
            long r9 = r9 + r0
            r6.A01 = r9     // Catch:{ all -> 0x014d }
            X.01V r8 = r6.A04     // Catch:{ all -> 0x014d }
            X.1gu r5 = new X.1gu     // Catch:{ all -> 0x014d }
            r5.<init>(r6, r7, r8, r9)     // Catch:{ all -> 0x014d }
            r6.A02 = r5     // Catch:{ all -> 0x014d }
            r0 = 1
            r6.A00 = r0     // Catch:{ all -> 0x014d }
            r5.start()     // Catch:{ all -> 0x014d }
            monitor-exit(r6)     // Catch:{ all -> 0x014d }
            monitor-exit(r2)     // Catch:{ all -> 0x0153 }
            goto L_0x016e
        L_0x014d:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x014d }
            goto L_0x0152
        L_0x0150:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0153 }
        L_0x0152:
            throw r0     // Catch:{ all -> 0x0153 }
        L_0x0153:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0153 }
            throw r0
        L_0x0156:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x015a }
        L_0x015a:
            throw r0     // Catch:{ IOException -> 0x015b }
        L_0x015b:
            r1 = move-exception
            java.lang.String r0 = "SigquitBasedANRDetector/Error saving ANR report"
            com.whatsapp.util.Log.e(r0, r1)
            java.lang.String r0 = "SigquitBasedANRDetector/couldn't write ANR to file, aborting"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.lang.String r0 = "SigquitBasedANRDetector/abortANR"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 0
            r4.A0A = r0
        L_0x016e:
            java.lang.String r0 = "SigquitBasedANRDetector/processing ANR finish"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x0174:
            java.lang.Object r2 = r14.A00
            X.2YL r2 = (X.AnonymousClass2YL) r2
            java.lang.String r1 = r14.A01
            java.lang.String r0 = r14.A02
            r2.A3C(r1, r0)
            return
        L_0x0180:
            java.lang.Object r2 = r14.A00
            com.obwhatsapp.backup.google.SettingsGoogleDrive r2 = (com.obwhatsapp.backup.google.SettingsGoogleDrive) r2
            java.lang.String r1 = r14.A01
            java.lang.String r0 = r14.A02
            r2.A3F(r1, r0)
            return
        L_0x018c:
            java.lang.Object r4 = r14.A00
            X.2JE r4 = (X.AnonymousClass2JE) r4
            java.lang.String r3 = r14.A01
            java.lang.String r2 = r14.A02
            goto L_0x01ae
        L_0x0195:
            java.lang.Object r4 = r14.A00
            X.2JE r4 = (X.AnonymousClass2JE) r4
            java.lang.String r3 = r14.A01
            java.lang.String r2 = r14.A02
            java.lang.String r1 = "conversations-gdrive-observer/set-message "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x01ae:
            com.obwhatsapp.conversationslist.ConversationsFragment r1 = r4.A04
            android.widget.TextView r0 = r1.A0D
            r0.setText(r2)
            android.widget.TextView r0 = r1.A0C
            r0.setText(r3)
            return
        L_0x01bb:
            java.lang.Object r1 = r14.A00
            com.obwhatsapp.location.StopLiveLocationDialogFragment r1 = (com.obwhatsapp.location.StopLiveLocationDialogFragment) r1
            java.lang.String r5 = r14.A01
            java.lang.String r0 = r14.A02
            X.0yQ r4 = r1.A00
            X.0rv r3 = X.C15830rv.A02(r0)
            X.AnonymousClass00B.A06(r3)
            java.lang.String r0 = "LocationSharingManager/cancelShareLocation; msgId="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r5)
            java.lang.String r0 = "; jid="
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Object r2 = r4.A0S
            monitor-enter(r2)
            java.util.Map r0 = r4.A0A()     // Catch:{ all -> 0x020a }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ all -> 0x020a }
            X.28s r0 = (X.C454628s) r0     // Catch:{ all -> 0x020a }
            if (r0 != 0) goto L_0x0205
            r1 = 1
            X.1Vw r0 = new X.1Vw     // Catch:{ all -> 0x020a }
            r0.<init>(r3, r5, r1)     // Catch:{ all -> 0x020a }
            X.1rV r0 = r4.A06(r0)     // Catch:{ all -> 0x020a }
            if (r0 == 0) goto L_0x0203
            r4.A0W(r0)     // Catch:{ all -> 0x020a }
        L_0x0203:
            monitor-exit(r2)     // Catch:{ all -> 0x020a }
            return
        L_0x0205:
            monitor-exit(r2)     // Catch:{ all -> 0x020a }
            r4.A0O(r3)
            return
        L_0x020a:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x020a }
            throw r0
        L_0x020d:
            java.lang.Object r5 = r14.A00
            X.108 r5 = (X.AnonymousClass108) r5
            java.lang.String r1 = r14.A01
            java.lang.String r0 = r14.A02
            X.01Q r9 = new X.01Q
            r9.<init>(r1, r0)
            monitor-enter(r5)
            java.lang.Object r1 = r9.A00     // Catch:{ all -> 0x0284 }
            r0 = r1
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0     // Catch:{ all -> 0x0284 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0284 }
            if (r0 == 0) goto L_0x022e
            X.1Vo r1 = r5.A08     // Catch:{ all -> 0x0284 }
            java.lang.String r0 = "addUnreadPaymentMethodUpdate empty credentialId"
            r1.A05(r0)     // Catch:{ all -> 0x0284 }
            goto L_0x027f
        L_0x022e:
            X.11I r6 = r5.A04     // Catch:{ all -> 0x0284 }
            java.lang.String r4 = "unread_payment_method_credential_ids"
            java.lang.String r0 = r6.A02(r4)     // Catch:{ all -> 0x0284 }
            if (r0 != 0) goto L_0x023b
            java.lang.String r0 = ""
        L_0x023b:
            java.lang.String r8 = ";"
            java.lang.String[] r0 = android.text.TextUtils.split(r0, r8)     // Catch:{ all -> 0x0284 }
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch:{ all -> 0x0284 }
            java.util.HashSet r7 = new java.util.HashSet     // Catch:{ all -> 0x0284 }
            r7.<init>(r0)     // Catch:{ all -> 0x0284 }
            java.lang.String r3 = ":"
            r0 = 2
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x0284 }
            r0 = 0
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x0284 }
            r2[r0] = r1     // Catch:{ all -> 0x0284 }
            r1 = 1
            java.lang.Object r0 = r9.A01     // Catch:{ all -> 0x0284 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0284 }
            r2[r1] = r0     // Catch:{ all -> 0x0284 }
            java.lang.String r0 = android.text.TextUtils.join(r3, r2)     // Catch:{ all -> 0x0284 }
            r7.add(r0)     // Catch:{ all -> 0x0284 }
            java.lang.String r3 = android.text.TextUtils.join(r8, r7)     // Catch:{ all -> 0x0284 }
            X.1Vo r2 = r5.A08     // Catch:{ all -> 0x0284 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0284 }
            r1.<init>()     // Catch:{ all -> 0x0284 }
            java.lang.String r0 = "addUnreadPaymentMethodUpdate/unreadCredential:"
            r1.append(r0)     // Catch:{ all -> 0x0284 }
            r1.append(r3)     // Catch:{ all -> 0x0284 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0284 }
            r2.A06(r0)     // Catch:{ all -> 0x0284 }
            r6.A06(r4, r3)     // Catch:{ all -> 0x0284 }
        L_0x027f:
            monitor-exit(r5)
            r5.A01()
            return
        L_0x0284:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x0287:
            java.lang.Object r0 = r14.A00
            X.13A r0 = (X.AnonymousClass13A) r0
            java.lang.String r2 = r14.A01
            java.lang.String r1 = r14.A02
            X.12w r0 = r0.A03
            r0.A02(r2, r1)
            return
        L_0x0295:
            java.lang.Object r7 = r14.A00
            com.obwhatsapp.registration.RegisterName r7 = (com.obwhatsapp.registration.RegisterName) r7
            java.lang.String r6 = r14.A01
            java.lang.String r5 = r14.A02
            X.2S5 r1 = r7.A13
            r0 = 2131365817(0x7f0a0fb9, float:1.835151E38)
            android.view.View r4 = r1.findViewById(r0)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r3 = 2131889295(0x7f120c8f, float:1.941325E38)
            r0 = 3
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r1 = 0
            r0 = 0
            r2[r1] = r0
            r0 = 1
            r2[r0] = r6
            r0 = 2
            r2[r0] = r5
            java.lang.String r0 = r7.getString(r3, r2)
            r4.setText(r0)
            return
        L_0x02c0:
            java.lang.Object r6 = r14.A00
            X.1CX r6 = (X.AnonymousClass1CX) r6
            java.lang.String r5 = r14.A01
            java.lang.String r4 = r14.A02
            X.1Qf r9 = r6.A0O     // Catch:{ Exception -> 0x0369 }
            X.1Qe r0 = r9.A02     // Catch:{ Exception -> 0x0369 }
            X.1pi r7 = r0.A03(r5, r4)     // Catch:{ Exception -> 0x0369 }
            X.0tz r0 = r9.A01     // Catch:{ Exception -> 0x0369 }
            android.content.Context r0 = r0.A00     // Catch:{ Exception -> 0x0369 }
            byte[] r1 = X.C27031Qe.A02(r0, r7)     // Catch:{ Exception -> 0x0369 }
            X.1Qd r0 = r9.A05     // Catch:{ Exception -> 0x0369 }
            r0.A00(r7, r1)     // Catch:{ Exception -> 0x0369 }
            boolean r0 = r7.A0O     // Catch:{ Exception -> 0x0369 }
            if (r0 != 0) goto L_0x035c
            X.1M8 r1 = r9.A04     // Catch:{ Exception -> 0x0369 }
            java.util.List r0 = r7.A04     // Catch:{ Exception -> 0x0369 }
            r1.A02(r5, r4, r0)     // Catch:{ Exception -> 0x0369 }
            java.util.List r0 = r7.A04     // Catch:{ Exception -> 0x0369 }
            java.util.Iterator r13 = r0.iterator()     // Catch:{ Exception -> 0x0369 }
        L_0x02ee:
            boolean r0 = r13.hasNext()     // Catch:{ Exception -> 0x0369 }
            if (r0 == 0) goto L_0x035c
            java.lang.Object r11 = r13.next()     // Catch:{ Exception -> 0x0369 }
            X.1jm r11 = (X.C34151jm) r11     // Catch:{ Exception -> 0x0369 }
            java.lang.String r10 = r11.A0D     // Catch:{ Exception -> 0x0369 }
            if (r10 == 0) goto L_0x02ee
            X.1XO r0 = r11.A04     // Catch:{ Exception -> 0x0369 }
            if (r0 == 0) goto L_0x02ee
            X.1pj[] r12 = r0.A09     // Catch:{ Exception -> 0x0369 }
            if (r12 == 0) goto L_0x02ee
            X.1Qc r3 = r9.A06     // Catch:{ Exception -> 0x0369 }
            int r8 = r12.length     // Catch:{ Exception -> 0x0369 }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ Exception -> 0x0369 }
            r2.<init>(r8)     // Catch:{ Exception -> 0x0369 }
            r1 = 0
        L_0x030f:
            if (r1 >= r8) goto L_0x031d
            r0 = r12[r1]     // Catch:{ Exception -> 0x0369 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0369 }
            r2.add(r0)     // Catch:{ Exception -> 0x0369 }
            int r1 = r1 + 1
            goto L_0x030f
        L_0x031d:
            java.lang.String r0 = " "
            java.lang.String r2 = android.text.TextUtils.join(r0, r2)     // Catch:{ Exception -> 0x0369 }
            java.lang.String r1 = r11.A0A     // Catch:{ Exception -> 0x0369 }
            android.content.ContentValues r8 = new android.content.ContentValues     // Catch:{ Exception -> 0x0369 }
            r8.<init>()     // Catch:{ Exception -> 0x0369 }
            java.lang.String r0 = "plaintext_hash"
            r8.put(r0, r10)     // Catch:{ Exception -> 0x0369 }
            java.lang.String r0 = "authority"
            r8.put(r0, r5)     // Catch:{ Exception -> 0x0369 }
            java.lang.String r0 = "sticker_pack_id"
            r8.put(r0, r4)     // Catch:{ Exception -> 0x0369 }
            java.lang.String r0 = "emojis"
            r8.put(r0, r2)     // Catch:{ Exception -> 0x0369 }
            java.lang.String r0 = "hash_of_image_part"
            r8.put(r0, r1)     // Catch:{ Exception -> 0x0369 }
            X.12j r0 = r3.A00     // Catch:{ Exception -> 0x0369 }
            X.0tf r3 = r0.A02()     // Catch:{ Exception -> 0x0369 }
            X.0tg r2 = r3.A02     // Catch:{ all -> 0x0357 }
            java.lang.String r1 = "third_party_sticker_emoji_mapping"
            r0 = 5
            r2.A06(r8, r1, r0)     // Catch:{ all -> 0x0357 }
            r3.close()     // Catch:{ Exception -> 0x0369 }
            goto L_0x02ee
        L_0x0357:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x035b }
        L_0x035b:
            throw r0     // Catch:{ Exception -> 0x0369 }
        L_0x035c:
            X.0sZ r0 = r9.A07     // Catch:{ Exception -> 0x0369 }
            r0.A01(r7, r5, r4)     // Catch:{ Exception -> 0x0369 }
            X.14Z r1 = r6.A0X     // Catch:{ Exception -> 0x0369 }
            java.lang.String r0 = r7.A0F     // Catch:{ Exception -> 0x0369 }
            r1.A01(r0)     // Catch:{ Exception -> 0x0369 }
            goto L_0x036e
        L_0x0369:
            java.lang.String r0 = "StickerRepository/InstallThirdPartyStickerPackAsyncTask failed to install third party pack"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x036e:
            X.0pt r2 = r6.A05
            r1 = 10
            com.facebook.redex.RunnableRunnableShape0S2100000_I0 r0 = new com.facebook.redex.RunnableRunnableShape0S2100000_I0
            r0.<init>(r6, r5, r4, r1)
            r2.A0K(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.RunnableRunnableShape0S2100000_I0.run():void");
    }
}
