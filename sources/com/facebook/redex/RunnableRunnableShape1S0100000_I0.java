package com.facebook.redex;

import android.content.BroadcastReceiver;
import com.mod.bomfab.R$styleable;
import com.obwhatsapp.HomeActivity;
import com.obwhatsapp.calling.crypto.DefaultCryptoCallback;

public class RunnableRunnableShape1S0100000_I0 implements Runnable {
    public Object A00;
    public final int A01;

    public RunnableRunnableShape1S0100000_I0(BroadcastReceiver.PendingResult pendingResult) {
        this.A01 = 6;
        this.A00 = pendingResult;
    }

    public RunnableRunnableShape1S0100000_I0(HomeActivity homeActivity, int i2) {
        this.A01 = i2;
        switch (i2) {
            case R$styleable.FloatingActionMenu_menu_colorNormal /*31*/:
            case 32:
            case R$styleable.FloatingActionMenu_menu_colorRipple /*33*/:
            case R$styleable.FloatingActionMenu_menu_openDirection /*34*/:
            case R$styleable.FloatingActionMenu_menu_backgroundColor /*35*/:
            case R$styleable.FloatingActionMenu_menu_fab_label /*36*/:
            case R$styleable.FloatingActionMenu_menu_fab_show_animation /*37*/:
            case R$styleable.FloatingActionMenu_menu_fab_hide_animation /*38*/:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case DefaultCryptoCallback.E2E_EXTENDED_V2_KEY_LENGTH /*46*/:
            case 47:
                this.A00 = homeActivity;
                return;
            default:
                this.A00 = homeActivity;
                return;
        }
    }

    public RunnableRunnableShape1S0100000_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public RunnableRunnableShape1S0100000_I0(Runnable runnable) {
        this.A01 = 12;
        this.A00 = runnable;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:164:0x033c, code lost:
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0344, code lost:
        r11 = new X.C15260qa(r12, r12, r12, false, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0374, code lost:
        r11.A00 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x0384, code lost:
        r11 = r11.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x0388, code lost:
        if (r2 == null) goto L_0x033c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x038c, code lost:
        if (r11.A04 != false) goto L_0x033c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x038e, code lost:
        r3 = ((X.C15350qj) r8.A01).A9x().A02(r3).iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x03a2, code lost:
        if (r3.hasNext() == false) goto L_0x033c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x03a4, code lost:
        r0 = (java.io.File) r3.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:?, code lost:
        r1 = r0.getCanonicalPath();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x03af, code lost:
        r1 = r0.getAbsolutePath();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:374:0x07ad, code lost:
        if (r0 == false) goto L_0x07af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:453:0x0950, code lost:
        if (r8.A03 == 600) goto L_0x0952;
     */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0281  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0290  */
    /* JADX WARNING: Removed duplicated region for block: B:476:0x0218 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r20 = this;
            r5 = r20
            int r0 = r5.A01
            switch(r0) {
                case 0: goto L_0x0550;
                case 1: goto L_0x082c;
                case 2: goto L_0x0824;
                case 3: goto L_0x01f7;
                case 4: goto L_0x081c;
                case 5: goto L_0x01e9;
                case 6: goto L_0x01df;
                case 7: goto L_0x01bf;
                case 8: goto L_0x0814;
                case 9: goto L_0x07f6;
                case 10: goto L_0x07e6;
                case 11: goto L_0x07d1;
                case 12: goto L_0x07c5;
                case 13: goto L_0x06e1;
                case 14: goto L_0x0190;
                case 15: goto L_0x0696;
                case 16: goto L_0x0685;
                case 17: goto L_0x067b;
                case 18: goto L_0x065e;
                case 19: goto L_0x0653;
                case 20: goto L_0x0180;
                case 21: goto L_0x063f;
                case 22: goto L_0x012a;
                case 23: goto L_0x011e;
                case 24: goto L_0x0637;
                case 25: goto L_0x062f;
                case 26: goto L_0x0627;
                case 27: goto L_0x00fd;
                case 28: goto L_0x061f;
                case 29: goto L_0x0617;
                case 30: goto L_0x0608;
                case 31: goto L_0x00e5;
                case 32: goto L_0x0840;
                case 33: goto L_0x00d5;
                case 34: goto L_0x084f;
                case 35: goto L_0x00b4;
                case 36: goto L_0x0087;
                case 37: goto L_0x05fb;
                case 38: goto L_0x05f3;
                case 39: goto L_0x05ea;
                case 40: goto L_0x006c;
                case 41: goto L_0x05dd;
                case 42: goto L_0x0007;
                case 43: goto L_0x05d5;
                case 44: goto L_0x0007;
                case 45: goto L_0x0056;
                case 46: goto L_0x05be;
                case 47: goto L_0x003c;
                case 48: goto L_0x055d;
                case 49: goto L_0x000f;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r1 = r5.A00
            com.obwhatsapp.HomeActivity r1 = (com.obwhatsapp.HomeActivity) r1
            r0 = 0
            r1.A1a = r0
        L_0x000e:
            return
        L_0x000f:
            java.lang.Object r5 = r5.A00
            com.obwhatsapp.HomeActivity r5 = (com.obwhatsapp.HomeActivity) r5
            boolean r0 = r5.A3c()
            if (r0 == 0) goto L_0x000e
            X.0pd r1 = r5.A0C
            X.0pf r0 = r5.A06
            long r3 = X.C14740pg.A01(r0, r1)
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            r1 = 0
            if (r0 <= 0) goto L_0x0029
            r1 = 1
        L_0x0029:
            java.lang.String r0 = "required free space should be > 0"
            X.AnonymousClass00B.A0B(r0, r1)
            android.content.Intent r1 = X.C14750ph.A0C(r5, r3)
            boolean r0 = r5.AIm()
            if (r0 != 0) goto L_0x0849
            r5.startActivity(r1)
            return
        L_0x003c:
            java.lang.Object r2 = r5.A00
            com.obwhatsapp.HomeActivity r2 = (com.obwhatsapp.HomeActivity) r2
            int r1 = r2.A03
            r0 = 400(0x190, float:5.6E-43)
            if (r0 == r1) goto L_0x0050
            boolean r0 = com.obwhatsapp.yo.yo.isGrpSeparateEnabled()
            if (r0 == 0) goto L_0x000e
            r0 = 500(0x1f4, float:7.0E-43)
            if (r1 != r0) goto L_0x000e
        L_0x0050:
            X.0pi r0 = r2.A1L
            r0.A01()
            return
        L_0x0056:
            java.lang.Object r2 = r5.A00
            com.obwhatsapp.HomeActivity r2 = (com.obwhatsapp.HomeActivity) r2
            int r1 = r2.A03
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 != r0) goto L_0x000e
            X.0pj r1 = r2.A1K
            r0 = 1
            r1.A0E(r0)
            X.0pi r0 = r2.A1L
            r0.A02()
            return
        L_0x006c:
            java.lang.Object r3 = r5.A00
            com.obwhatsapp.HomeActivity r3 = (com.obwhatsapp.HomeActivity) r3
            X.0pk r2 = r3.A39()
            if (r2 == 0) goto L_0x000e
            X.0pl r1 = r3.A0R
            r0 = r2
            X.0pm r0 = (X.C14800pm) r0
            X.AnonymousClass00B.A06(r0)
            r1.A02(r0)
            X.0pn r0 = r3.A23
            r2.A4c(r0)
            return
        L_0x0087:
            java.lang.Object r3 = r5.A00
            com.obwhatsapp.HomeActivity r3 = (com.obwhatsapp.HomeActivity) r3
            int r0 = r3.A03
            r2 = 600(0x258, float:8.41E-43)
            if (r0 != r2) goto L_0x000e
            java.util.List r1 = com.obwhatsapp.HomeActivity.A2E
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x000e
            X.0po r1 = r3.A0Q
            X.013 r0 = r3.A01
            int r0 = com.obwhatsapp.HomeActivity.A02(r0, r2)
            X.0pq r1 = r1.A0H(r0)
            int r0 = r1.A00
            if (r0 == 0) goto L_0x000e
            r0 = 0
            r1.A00 = r0
            r3.A3J()
            return
        L_0x00b4:
            java.lang.Object r2 = r5.A00
            com.obwhatsapp.HomeActivity r2 = (com.obwhatsapp.HomeActivity) r2
            X.0pr r0 = r2.A1Q
            int r1 = r0.A00
            r0 = 3
            if (r1 == r0) goto L_0x00c2
            r0 = 2
            if (r1 != r0) goto L_0x000e
        L_0x00c2:
            X.0ps r0 = r2.A1d
            boolean r0 = r0.A06()
            if (r0 == 0) goto L_0x000e
            X.0pt r3 = r2.A05
            r0 = 37
            com.facebook.redex.RunnableRunnableShape1S0100000_I0 r1 = new com.facebook.redex.RunnableRunnableShape1S0100000_I0
            r1.<init>((com.obwhatsapp.HomeActivity) r2, (int) r0)
            goto L_0x095e
        L_0x00d5:
            java.lang.Object r0 = r5.A00
            com.obwhatsapp.HomeActivity r0 = (com.obwhatsapp.HomeActivity) r0
            X.0pk r1 = r0.A39()
            if (r1 == 0) goto L_0x000e
            X.0pn r0 = r0.A23
            r1.A4c(r0)
            return
        L_0x00e5:
            java.lang.Object r2 = r5.A00
            com.obwhatsapp.HomeActivity r2 = (com.obwhatsapp.HomeActivity) r2
            int r1 = r2.A03
            r0 = 300(0x12c, float:4.2E-43)
            if (r0 == r1) goto L_0x00f9
            boolean r0 = com.obwhatsapp.yo.yo.isGrpSeparateEnabled()
            if (r0 == 0) goto L_0x000e
            r0 = 400(0x190, float:5.6E-43)
            if (r1 != r0) goto L_0x000e
        L_0x00f9:
            r2.A3D()
            return
        L_0x00fd:
            java.lang.Object r2 = r5.A00
            X.0pv r2 = (X.C14890pv) r2
            com.obwhatsapp.CodeInputField r1 = r2.A04
            java.lang.String r0 = r1.getCode()
            r1.setCode(r0)
            android.os.Handler r0 = r1.getHandler()
            if (r0 == 0) goto L_0x000e
            java.lang.Runnable r0 = r2.A02
            if (r0 == 0) goto L_0x000e
            android.os.Handler r1 = r1.getHandler()
            java.lang.Runnable r0 = r2.A02
            r1.removeCallbacks(r0)
            return
        L_0x011e:
            java.lang.Object r1 = r5.A00
            X.0pz r1 = (X.C14910pz) r1
            int r0 = r1.A00
            if (r0 != 0) goto L_0x000e
            r1.A04()
            return
        L_0x012a:
            java.lang.Object r7 = r5.A00
            X.0q0 r7 = (X.C14920q0) r7
            X.017 r8 = r7.A04
            java.lang.ref.WeakReference r6 = r8.A04
            java.lang.Object r4 = r6.get()
            if (r4 == 0) goto L_0x0155
            X.0q1 r3 = r8.A02
            X.0q2 r2 = new X.0q2
            r2.<init>()
            r1 = 0
            java.lang.String r0 = r8.A03
            r2.A02(r0, r1)
            r0 = 1
            r2.A02(r4, r0)
            java.util.List r0 = r2.A00
            X.0q3 r1 = new X.0q3
            r1.<init>(r0)
            X.0q4 r0 = r8.A01
            X.C14980q6.A00(r0, r1, r3)
        L_0x0155:
            boolean r0 = r7.A06
            if (r0 == 0) goto L_0x0169
            boolean r0 = r7.A00
            if (r0 != 0) goto L_0x000e
            boolean r0 = r7.A01
            if (r0 != 0) goto L_0x000e
            android.os.Handler r2 = r7.A03
            long r0 = r7.A02
            r2.postDelayed(r5, r0)
            return
        L_0x0169:
            java.lang.Object r2 = r6.get()
            X.0q7 r2 = (X.C14990q7) r2
            if (r2 == 0) goto L_0x000e
            java.lang.String r1 = r8.A03
            r0 = 2131362245(0x7f0a01c5, float:1.8344265E38)
            java.lang.Object r0 = r2.A02(r0)
            java.util.AbstractMap r0 = (java.util.AbstractMap) r0
            r0.remove(r1)
            return
        L_0x0180:
            java.lang.Object r1 = r5.A00
            com.google.firebase.iid.FirebaseInstanceId r1 = (com.google.firebase.iid.FirebaseInstanceId) r1
            X.0og r0 = r1.A02
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x000e
            r1.A06()
            return
        L_0x0190:
            android.os.Looper r1 = android.os.Looper.myLooper()
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            java.lang.Object r6 = r5.A00
            com.google.android.gms.internal.gtm.zzcw r6 = (com.google.android.gms.internal.gtm.zzcw) r6
            if (r1 != r0) goto L_0x01ab
            com.google.android.gms.internal.gtm.zzbv r0 = r6.zzb
            X.0qA r0 = r0.zzg
            X.C13710nw.A01(r0)
            X.0qB r0 = r0.A03
            r0.submit(r5)
            return
        L_0x01ab:
            long r3 = r6.zzd
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            r2 = 0
            if (r0 == 0) goto L_0x01b5
            r2 = 1
        L_0x01b5:
            r0 = 0
            r6.zzd = r0
            if (r2 == 0) goto L_0x000e
            r6.zza()
            return
        L_0x01bf:
            java.lang.Object r0 = r5.A00
            X.0qC r0 = (X.C15020qC) r0
            android.content.Context r2 = r0.A0B
            java.util.concurrent.atomic.AtomicBoolean r1 = X.C15040qE.A02
            r0 = 1
            boolean r0 = r1.getAndSet(r0)
            if (r0 != 0) goto L_0x000e
            java.lang.String r0 = "notification"
            java.lang.Object r1 = r2.getSystemService(r0)     // Catch:{ SecurityException -> 0x000e }
            android.app.NotificationManager r1 = (android.app.NotificationManager) r1     // Catch:{ SecurityException -> 0x000e }
            if (r1 == 0) goto L_0x000e
            r0 = 10436(0x28c4, float:1.4624E-41)
            r1.cancel(r0)     // Catch:{ SecurityException -> 0x000e }
            goto L_0x0965
        L_0x01df:
            java.lang.Object r0 = r5.A00
            android.content.BroadcastReceiver$PendingResult r0 = (android.content.BroadcastReceiver.PendingResult) r0
            if (r0 == 0) goto L_0x000e
            r0.finish()
            return
        L_0x01e9:
            java.lang.Object r1 = r5.A00
            X.0qF r1 = (X.C15050qF) r1
            boolean r0 = r1.A0H
            if (r0 != 0) goto L_0x000e
            X.0qM r0 = r1.A09
            r0.AP8(r1)
            return
        L_0x01f7:
            java.lang.Object r0 = r5.A00
            X.0qO r0 = (X.C15140qO) r0
            X.0qV r9 = r0.A01
            X.0qW r0 = r9.A00
            java.lang.Object r5 = r0.getValue()
            X.0qX r5 = (X.C15230qX) r5
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            X.0qZ r0 = r5.A02
            java.util.Map r0 = r0.A00()
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r14 = r0.iterator()
        L_0x0218:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x02ac
            java.lang.Object r1 = r14.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r3 = r1.getKey()
            java.lang.String r3 = (java.lang.String) r3
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x0218
            java.lang.Object r6 = r1.getValue()
            org.json.JSONObject r6 = (org.json.JSONObject) r6
            java.lang.String r0 = "size_config"
            org.json.JSONObject r0 = r6.optJSONObject(r0)
            r8 = 0
            if (r0 == 0) goto L_0x02aa
            X.0qa r7 = X.C15260qa.A00(r0)
        L_0x0244:
            java.lang.String r0 = "staleness_config"
            org.json.JSONObject r11 = r6.optJSONObject(r0)
            if (r11 == 0) goto L_0x02a8
            java.lang.String r2 = "stale_age_s"
            r0 = -1
            long r0 = r11.optLong(r2, r0)
            r12 = 0
            int r2 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r2 < 0) goto L_0x02a8
            r10 = 0
            java.lang.String r2 = "is_itemized"
            boolean r2 = r11.optBoolean(r2, r10)
            X.0qd r10 = new X.0qd
            r10.<init>(r0, r2)
        L_0x0268:
            if (r7 != 0) goto L_0x026d
            if (r10 != 0) goto L_0x026d
            goto L_0x0218
        L_0x026d:
            java.lang.String r0 = "cache_name"
            java.lang.String r2 = r6.optString(r0)
            java.lang.String r1 = "eviction_type"
            java.lang.String r0 = "file"
            java.lang.String r1 = r6.optString(r1, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x0282
            r8 = r2
        L_0x0282:
            X.0qe r2 = new X.0qe
            r2.<init>(r7, r10, r1, r8)
            X.0qd r0 = r2.A02
            if (r0 != 0) goto L_0x0290
            X.0qa r0 = r2.A01
            if (r0 != 0) goto L_0x0290
            goto L_0x0218
        L_0x0290:
            java.lang.String r0 = r2.A00
            if (r0 != 0) goto L_0x029e
            java.lang.String r1 = "feature_name"
            java.lang.String r0 = "n/a"
            java.lang.String r0 = r6.optString(r1, r0)
            r2.A00 = r0
        L_0x029e:
            java.io.File r0 = new java.io.File
            r0.<init>(r3)
            r4.put(r0, r2)
            goto L_0x0218
        L_0x02a8:
            r10 = r8
            goto L_0x0268
        L_0x02aa:
            r7 = r8
            goto L_0x0244
        L_0x02ac:
            java.util.Map r1 = r5.A04
            monitor-enter(r1)
            r4.putAll(r1)     // Catch:{ all -> 0x0966 }
            monitor-exit(r1)     // Catch:{ all -> 0x0966 }
            java.util.Set r0 = r4.entrySet()
            java.util.Iterator r4 = r0.iterator()
        L_0x02bb:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x02d1
            java.lang.Object r3 = r4.next()
            java.util.concurrent.Executor r2 = r5.A05
            r1 = 1
            com.facebook.redex.RunnableRunnableShape2S0200000_I0 r0 = new com.facebook.redex.RunnableRunnableShape2S0200000_I0
            r0.<init>(r3, r1, r5)
            r2.execute(r0)
            goto L_0x02bb
        L_0x02d1:
            X.0qW r0 = r9.A01
            java.lang.Object r8 = r0.getValue()
            X.0qf r8 = (X.C15310qf) r8
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            X.0qZ r6 = r8.A00
            java.util.Map r0 = r6.A00()
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r4 = r0.iterator()
        L_0x02ec:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x032b
            java.lang.Object r0 = r4.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r3 = r0.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r1 = r0.getValue()
            org.json.JSONObject r1 = (org.json.JSONObject) r1
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x02ec
            X.0qa r2 = X.C15260qa.A00(r1)
            if (r2 != 0) goto L_0x0314
            r6.A02(r3)
            goto L_0x02ec
        L_0x0314:
            java.lang.String r0 = "feature_name"
            java.lang.String r1 = r1.optString(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L_0x0322
            java.lang.String r1 = "n/a"
        L_0x0322:
            X.0qg r0 = new X.0qg
            r0.<init>(r2, r1)
            r7.put(r3, r0)
            goto L_0x02ec
        L_0x032b:
            int[] r5 = X.C15330qh.A01()
            int r10 = r5.length
            r4 = 0
        L_0x0331:
            if (r4 >= r10) goto L_0x03c2
            r3 = r5[r4]
            java.lang.String r2 = X.C15330qh.A00(r3)
            switch(r3) {
                case 100: goto L_0x033f;
                case 101: goto L_0x033f;
                case 102: goto L_0x033f;
                case 103: goto L_0x033f;
                case 104: goto L_0x033f;
                case 105: goto L_0x0342;
                case 106: goto L_0x0351;
                case 107: goto L_0x035d;
                case 108: goto L_0x035d;
                case 109: goto L_0x0369;
                case 110: goto L_0x033c;
                case 111: goto L_0x0377;
                default: goto L_0x033c;
            }
        L_0x033c:
            int r4 = r4 + 1
            goto L_0x0331
        L_0x033f:
            r12 = 1024(0x400, double:5.06E-321)
            goto L_0x0344
        L_0x0342:
            r12 = 8
        L_0x0344:
            r18 = 0
            X.0qa r11 = new X.0qa
            r14 = r12
            r16 = r12
            r19 = r18
            r11.<init>(r12, r14, r16, r18, r19)
            goto L_0x0388
        L_0x0351:
            X.0qr r11 = new X.0qr
            r11.<init>()
            r0 = 1
            r11.A04 = r0
            r0 = 104857600(0x6400000, double:5.1806538E-316)
            goto L_0x0374
        L_0x035d:
            X.0qr r11 = new X.0qr
            r11.<init>()
            r0 = 1
            r11.A04 = r0
            r0 = 52428800(0x3200000, double:2.5903269E-316)
            goto L_0x0374
        L_0x0369:
            X.0qr r11 = new X.0qr
            r11.<init>()
            r0 = 1
            r11.A04 = r0
            r0 = 10485760(0xa00000, double:5.180654E-317)
        L_0x0374:
            r11.A00 = r0
            goto L_0x0384
        L_0x0377:
            X.0qr r11 = new X.0qr
            r11.<init>()
            r0 = 12582912(0xc00000, double:6.2167845E-317)
            r11.A00 = r0
            r0 = 1
            r11.A04 = r0
        L_0x0384:
            X.0qa r11 = r11.A00()
        L_0x0388:
            if (r2 == 0) goto L_0x033c
            boolean r0 = r11.A04
            if (r0 != 0) goto L_0x033c
            X.0qi r0 = r8.A01
            X.0qj r0 = (X.C15350qj) r0
            X.0qk r0 = r0.A9x()
            java.util.Set r0 = r0.A02(r3)
            java.util.Iterator r3 = r0.iterator()
        L_0x039e:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x033c
            java.lang.Object r0 = r3.next()
            java.io.File r0 = (java.io.File) r0
            java.lang.String r1 = r0.getCanonicalPath()     // Catch:{ IOException -> 0x03af }
            goto L_0x03b3
        L_0x03af:
            java.lang.String r1 = r0.getAbsolutePath()
        L_0x03b3:
            boolean r0 = r7.containsKey(r1)
            if (r0 != 0) goto L_0x039e
            X.0qg r0 = new X.0qg
            r0.<init>(r11, r2)
            r7.put(r1, r0)
            goto L_0x039e
        L_0x03c2:
            java.util.Set r0 = r7.entrySet()
            java.util.Iterator r13 = r0.iterator()
            r14 = 0
        L_0x03cc:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x041d
            java.lang.Object r0 = r13.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r10 = r0.getKey()
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r11 = r0.getValue()
            X.0qg r11 = (X.C15320qg) r11
            X.0qb r12 = r11.A00
            X.0qa r12 = (X.C15260qa) r12
            X.0qi r7 = r8.A01
            r0 = r7
            X.0ql r0 = (X.C15370ql) r0
            boolean r0 = r0.AJ8()
            if (r0 == 0) goto L_0x041a
            long r3 = r12.A01
        L_0x03f5:
            int r0 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r0 <= 0) goto L_0x03cc
            java.io.File r5 = new java.io.File
            r5.<init>(r10)
            X.0qn r0 = X.C15380qm.A01(r5)
            long r1 = r0.A02
            boolean r0 = r12.A03
            if (r0 == 0) goto L_0x040c
            r8.A00(r11, r5, r1)
            goto L_0x03cc
        L_0x040c:
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x03cc
            r7.A7o(r5)
            r6.A02(r10)
            r5.mkdirs()
            goto L_0x03cc
        L_0x041a:
            long r3 = r12.A00
            goto L_0x03f5
        L_0x041d:
            X.0qW r0 = r9.A02
            java.lang.Object r7 = r0.getValue()
            X.0qo r7 = (X.C15400qo) r7
            java.util.HashMap r13 = new java.util.HashMap
            r13.<init>()
            X.0qZ r6 = r7.A00
            java.util.Map r0 = r6.A00()
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r10 = r0.iterator()
        L_0x0438:
            boolean r0 = r10.hasNext()
            r1 = -1
            if (r0 == 0) goto L_0x0491
            java.lang.Object r0 = r10.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r8 = r0.getKey()
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r9 = r0.getValue()
            org.json.JSONObject r9 = (org.json.JSONObject) r9
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 != 0) goto L_0x0438
            java.lang.String r0 = "stale_age_s"
            long r3 = r9.optLong(r0, r1)
            int r0 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r0 >= 0) goto L_0x0467
            r6.A02(r8)
            goto L_0x0438
        L_0x0467:
            r5 = 0
            java.lang.String r0 = "is_itemized"
            boolean r0 = r9.optBoolean(r0, r5)
            X.0qd r5 = new X.0qd
            r5.<init>(r3, r0)
            java.lang.String r0 = "feature_name"
            java.lang.String r3 = r9.optString(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L_0x0481
            java.lang.String r3 = "n/a"
        L_0x0481:
            java.lang.String r0 = "usage_timestamp_s"
            long r1 = r9.optLong(r0, r1)
            X.0qp r0 = new X.0qp
            r0.<init>(r5, r3, r1)
            r13.put(r8, r0)
            goto L_0x0438
        L_0x0491:
            int[] r12 = X.C15330qh.A01()
            int r11 = r12.length
            r10 = 0
        L_0x0497:
            if (r10 >= r11) goto L_0x04ef
            r3 = r12[r10]
            java.lang.String r5 = X.C15330qh.A00(r3)
            switch(r3) {
                case 100: goto L_0x04a5;
                case 101: goto L_0x04a5;
                case 102: goto L_0x04a5;
                case 103: goto L_0x04a5;
                case 104: goto L_0x04a5;
                case 105: goto L_0x04a5;
                case 106: goto L_0x04a7;
                case 107: goto L_0x04aa;
                case 108: goto L_0x04aa;
                case 109: goto L_0x04aa;
                case 110: goto L_0x04ad;
                default: goto L_0x04a2;
            }
        L_0x04a2:
            int r10 = r10 + 1
            goto L_0x0497
        L_0x04a5:
            r0 = 0
            goto L_0x04ae
        L_0x04a7:
            r0 = 90
            goto L_0x04ae
        L_0x04aa:
            r0 = 28
            goto L_0x04ae
        L_0x04ad:
            r0 = 1
        L_0x04ae:
            long r8 = (long) r0
            r14 = 86400(0x15180, double:4.26873E-319)
            long r8 = r8 * r14
            r0 = 0
            X.0qd r4 = new X.0qd
            r4.<init>(r8, r0)
            if (r5 == 0) goto L_0x04a2
            X.0qi r0 = r7.A01
            X.0qj r0 = (X.C15350qj) r0
            X.0qk r0 = r0.A9x()
            java.util.Set r0 = r0.A02(r3)
            java.util.Iterator r8 = r0.iterator()
        L_0x04cb:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x04a2
            java.lang.Object r0 = r8.next()
            java.io.File r0 = (java.io.File) r0
            java.lang.String r3 = r0.getCanonicalPath()     // Catch:{ IOException -> 0x04dc }
            goto L_0x04e0
        L_0x04dc:
            java.lang.String r3 = r0.getAbsolutePath()
        L_0x04e0:
            boolean r0 = r13.containsKey(r3)
            if (r0 != 0) goto L_0x04cb
            X.0qp r0 = new X.0qp
            r0.<init>(r4, r5, r1)
            r13.put(r3, r0)
            goto L_0x04cb
        L_0x04ef:
            java.util.Set r0 = r13.entrySet()
            java.util.Iterator r14 = r0.iterator()
            r12 = 0
        L_0x04f9:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x000e
            java.lang.Object r0 = r14.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r5 = r0.getKey()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r1 = r0.getValue()
            X.0qp r1 = (X.C15410qp) r1
            java.io.File r4 = new java.io.File
            r4.<init>(r5)
            long r10 = java.lang.System.currentTimeMillis()
            r8 = 1000(0x3e8, double:4.94E-321)
            long r10 = r10 / r8
            long r2 = r1.A00
            int r0 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r0 > 0) goto L_0x0528
            long r2 = r4.lastModified()
            long r2 = r2 / r8
        L_0x0528:
            int r0 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r0 <= 0) goto L_0x0531
            int r0 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x0531
            goto L_0x04f9
        L_0x0531:
            int r0 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r0 <= 0) goto L_0x04f9
            X.0qb r0 = r1.A00
            X.0qd r0 = (X.C15290qd) r0
            long r0 = r0.A00
            long r2 = r2 + r0
            int r0 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r0 <= 0) goto L_0x04f9
            int r0 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r0 >= 0) goto L_0x04f9
            X.0qi r0 = r7.A01
            r0.A7o(r4)
            r6.A02(r5)
            r4.mkdirs()
            goto L_0x04f9
        L_0x0550:
            r0 = 0
            android.os.Process.setThreadPriority(r0)
            boolean r0 = com.facebook.profilo.provider.stacktrace.CPUProfiler.sInitialized     // Catch:{ Exception -> 0x096a }
            if (r0 == 0) goto L_0x000e
            com.facebook.profilo.provider.stacktrace.CPUProfiler.nativeLoggerLoop()     // Catch:{ Exception -> 0x096a }
            goto L_0x0969
        L_0x055d:
            java.lang.Object r8 = r5.A00
            X.0pN r8 = (X.C14550pN) r8
            boolean r0 = X.C15450qv.A06()
            r7 = 2131890637(0x7f1211cd, float:1.9415971E38)
            r6 = 2131889740(0x7f120e4c, float:1.9414152E38)
            r5 = 2131889742(0x7f120e4e, float:1.9414156E38)
            r4 = 2131231889(0x7f080491, float:1.8079872E38)
            r3 = 2131231877(0x7f080485, float:1.8079847E38)
            r1 = 2131231937(0x7f0804c1, float:1.807997E38)
            if (r0 == 0) goto L_0x058b
            r7 = 2131889738(0x7f120e4a, float:1.9414148E38)
            r6 = 2131889739(0x7f120e4b, float:1.941415E38)
            r5 = 2131889741(0x7f120e4d, float:1.9414154E38)
            r4 = 2131231403(0x7f0802ab, float:1.8078886E38)
            r3 = 2131231366(0x7f080286, float:1.807881E38)
            r1 = 2131231889(0x7f080491, float:1.8079872E38)
        L_0x058b:
            X.0qw r2 = new X.0qw
            r2.<init>()
            r0 = 2131889744(0x7f120e50, float:1.941416E38)
            r2.A09 = r0
            r0 = 2131889743(0x7f120e4f, float:1.9414158E38)
            r2.A07 = r0
            r0 = 2131231877(0x7f080485, float:1.8079847E38)
            r2.A00 = r0
            r2.A01 = r4
            r2.A03 = r3
            r2.A05 = r1
            r2.A02 = r7
            r2.A04 = r6
            r2.A06 = r5
            r0 = 1
            r2.A0B = r0
            com.obwhatsapp.permissions.NotificationPermissionBottomSheet r1 = new com.obwhatsapp.permissions.NotificationPermissionBottomSheet
            r1.<init>()
            android.os.Bundle r0 = r2.A00()
            r1.A0T(r0)
            r8.Afc(r1)
            return
        L_0x05be:
            java.lang.Object r3 = r5.A00
            X.0pN r3 = (X.C14550pN) r3
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "com.obwhatsapp.profile.ProfilePhotoReminder"
            r2.setClassName(r1, r0)
            r0 = 0
            r3.A2X(r2, r0)
            return
        L_0x05d5:
            java.lang.Object r0 = r5.A00
            com.obwhatsapp.HomeActivity r0 = (com.obwhatsapp.HomeActivity) r0
            r0.A3I()
            return
        L_0x05dd:
            java.lang.Object r0 = r5.A00
            com.obwhatsapp.HomeActivity r0 = (com.obwhatsapp.HomeActivity) r0
            X.0r5 r3 = r0.A0m
            r2 = 0
            r1 = 0
            r0 = 1
            r3.A00(r1, r2, r0)
            return
        L_0x05ea:
            java.lang.Object r1 = r5.A00
            com.obwhatsapp.HomeActivity r1 = (com.obwhatsapp.HomeActivity) r1
            r0 = 0
            r1.A3U(r0)
            return
        L_0x05f3:
            java.lang.Object r0 = r5.A00
            com.obwhatsapp.HomeActivity r0 = (com.obwhatsapp.HomeActivity) r0
            r0.A3J()
            return
        L_0x05fb:
            java.lang.Object r1 = r5.A00
            X.0pN r1 = (X.C14550pN) r1
            com.obwhatsapp.authentication.VerifyTwoFactorAuthCodeDialogFragment r0 = new com.obwhatsapp.authentication.VerifyTwoFactorAuthCodeDialogFragment
            r0.<init>()
            r1.Afc(r0)
            return
        L_0x0608:
            java.lang.Object r0 = r5.A00
            com.obwhatsapp.DisplayExceptionDialogFactory$CompanionModeIncorrectAccessFragment r0 = (com.obwhatsapp.DisplayExceptionDialogFactory$CompanionModeIncorrectAccessFragment) r0
            X.0r5 r3 = r0.A02
            r2 = 1
            java.lang.String r1 = "user_initiated"
            r0 = 0
            r3.A00(r1, r2, r0)
            return
        L_0x0617:
            java.lang.Object r0 = r5.A00
            X.0pN r0 = (X.C14550pN) r0
            r0.Ac1()
            return
        L_0x061f:
            java.lang.Object r0 = r5.A00
            java.util.Set r0 = (java.util.Set) r0
            r0.clear()
            return
        L_0x0627:
            java.lang.Object r0 = r5.A00
            X.0rB r0 = (X.AnonymousClass0rB) r0
            r0.A00()
            return
        L_0x062f:
            java.lang.Object r0 = r5.A00
            com.obwhatsapp.AbstractAppShellDelegate r0 = (com.obwhatsapp.AbstractAppShellDelegate) r0
            r0.lambda$installAnrDetector$0()
            return
        L_0x0637:
            java.lang.Object r0 = r5.A00
            com.instagram.common.bloks.component.BloksEditText r0 = (com.instagram.common.bloks.component.BloksEditText) r0
            X.C15490rD.A04(r0)
            return
        L_0x063f:
            java.lang.Object r2 = r5.A00
            X.0rE r2 = (X.C15500rE) r2
            monitor-enter(r2)
            int r0 = r2.A00     // Catch:{ all -> 0x0650 }
            r1 = 1
            if (r0 != r1) goto L_0x064e
            java.lang.String r0 = "Timed out while binding"
            r2.A01(r1, r0)     // Catch:{ all -> 0x0650 }
        L_0x064e:
            monitor-exit(r2)
            return
        L_0x0650:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x0653:
            java.lang.Object r2 = r5.A00
            X.0rE r2 = (X.C15500rE) r2
            r1 = 2
            java.lang.String r0 = "Service disconnected"
            r2.A01(r1, r0)
            return
        L_0x065e:
            java.lang.Object r0 = r5.A00
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r0 = r0.getKey()
            X.0rF r0 = (X.C15510rF) r0
            X.0og r1 = r0.A00
            monitor-enter(r1)
            boolean r0 = r1.A00()     // Catch:{ all -> 0x0678 }
            if (r0 == 0) goto L_0x0676
            com.google.firebase.iid.FirebaseInstanceId r0 = r1.A05     // Catch:{ all -> 0x0678 }
            r0.A06()     // Catch:{ all -> 0x0678 }
        L_0x0676:
            monitor-exit(r1)     // Catch:{ all -> 0x0678 }
            return
        L_0x0678:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0678 }
            throw r0
        L_0x067b:
            java.lang.Object r0 = r5.A00
            X.0rG r0 = (X.C15520rG) r0
            X.0rI r1 = r0.A00
            r1.A01()
            return
        L_0x0685:
            java.lang.Object r0 = r5.A00
            X.0pI r0 = (X.C14510pI) r0
            java.lang.Object r1 = r0.A01
            monitor-enter(r1)
            X.0os r0 = r0.A00     // Catch:{ all -> 0x0693 }
            r0.AO5()     // Catch:{ all -> 0x0693 }
            monitor-exit(r1)     // Catch:{ all -> 0x0693 }
            return
        L_0x0693:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0693 }
            throw r0
        L_0x0696:
            java.lang.Object r4 = r5.A00
            X.0rJ r4 = (X.C15550rJ) r4
            java.lang.Object r3 = r4.A0B
            monitor-enter(r3)
            boolean r0 = r4.A03()     // Catch:{ all -> 0x06de }
            if (r0 == 0) goto L_0x06dc
            java.lang.String r2 = "WakeLock"
            java.lang.String r0 = r4.A0C     // Catch:{ all -> 0x06de }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x06de }
            java.lang.String r0 = " ** IS FORCE-RELEASED ON TIMEOUT **"
            java.lang.String r0 = r1.concat(r0)     // Catch:{ all -> 0x06de }
            android.util.Log.e(r2, r0)     // Catch:{ all -> 0x06de }
            java.util.Set r2 = r4.A0E     // Catch:{ all -> 0x06de }
            boolean r0 = r2.isEmpty()     // Catch:{ all -> 0x06de }
            if (r0 != 0) goto L_0x06d0
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x06de }
            r1.<init>(r2)     // Catch:{ all -> 0x06de }
            r2.clear()     // Catch:{ all -> 0x06de }
            int r0 = r1.size()     // Catch:{ all -> 0x06de }
            if (r0 <= 0) goto L_0x06d0
            r0 = 0
            r1.get(r0)     // Catch:{ all -> 0x06de }
            r0 = 0
            throw r0     // Catch:{ all -> 0x06de }
        L_0x06d0:
            boolean r0 = r4.A03()     // Catch:{ all -> 0x06de }
            if (r0 == 0) goto L_0x06dc
            r0 = 1
            r4.A00 = r0     // Catch:{ all -> 0x06de }
            r4.A01()     // Catch:{ all -> 0x06de }
        L_0x06dc:
            monitor-exit(r3)     // Catch:{ all -> 0x06de }
            return
        L_0x06de:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x06de }
            throw r0
        L_0x06e1:
            java.lang.Object r4 = r5.A00
            com.google.android.gms.internal.gtm.zzck r4 = (com.google.android.gms.internal.gtm.zzck) r4
            r4.zzW()
            X.C15000qA.A00()
            com.google.android.gms.internal.gtm.zzbv r0 = r4.zza
            android.content.Context r5 = r0.zzb
            boolean r0 = com.google.android.gms.internal.gtm.zzfi.zza(r5)
            if (r0 != 0) goto L_0x07b8
            java.lang.String r0 = "AnalyticsReceiver is not registered or is disabled. Register the receiver for reliable dispatching on non-Google Play devices. See http://goo.gl/8Rd3yj for instructions."
            r4.zzR(r0)
        L_0x06fa:
            X.C13710nw.A01(r5)
            java.lang.Boolean r0 = com.google.android.gms.analytics.CampaignTrackingReceiver.zza
            if (r0 == 0) goto L_0x0794
            boolean r1 = r0.booleanValue()
        L_0x0705:
            if (r1 != 0) goto L_0x070c
            java.lang.String r0 = "CampaignTrackingReceiver is not registered, not exported or is disabled. Installation campaign tracking is not possible. See http://goo.gl/8Rd3yj for instructions."
            r4.zzR(r0)
        L_0x070c:
            com.google.android.gms.internal.gtm.zzbv r1 = r4.zza
            com.google.android.gms.internal.gtm.zzfh r0 = r1.zzk
            com.google.android.gms.internal.gtm.zzbv.zzs(r0)
            com.google.android.gms.internal.gtm.zzfh r0 = r1.zzk
            r0.zza()
            java.lang.String r1 = "android.permission.ACCESS_NETWORK_STATE"
            com.google.android.gms.internal.gtm.zzbv r0 = r4.zza
            android.content.Context r0 = r0.zzb
            X.0rR r0 = X.C15560rQ.A00(r0)
            android.content.Context r0 = r0.A00
            int r0 = r0.checkCallingOrSelfPermission(r1)
            if (r0 == 0) goto L_0x0740
            java.lang.String r0 = "Missing required android.permission.ACCESS_NETWORK_STATE. Google Analytics disabled. See http://goo.gl/8Rd3yj for instructions"
            r4.zzJ(r0)
            r4.zzW()
            X.C15000qA.A00()
            r0 = 1
            r4.zzk = r0
            com.google.android.gms.internal.gtm.zzcc r0 = r4.zze
            r0.zzc()
            r4.zzae()
        L_0x0740:
            java.lang.String r1 = "android.permission.INTERNET"
            com.google.android.gms.internal.gtm.zzbv r0 = r4.zza
            android.content.Context r0 = r0.zzb
            X.0rR r0 = X.C15560rQ.A00(r0)
            android.content.Context r0 = r0.A00
            int r0 = r0.checkCallingOrSelfPermission(r1)
            if (r0 == 0) goto L_0x0768
            java.lang.String r0 = "Missing required android.permission.INTERNET. Google Analytics disabled. See http://goo.gl/8Rd3yj for instructions"
            r4.zzJ(r0)
            r4.zzW()
            X.C15000qA.A00()
            r0 = 1
            r4.zzk = r0
            com.google.android.gms.internal.gtm.zzcc r0 = r4.zze
            r0.zzc()
            r4.zzae()
        L_0x0768:
            com.google.android.gms.internal.gtm.zzbv r0 = r4.zza
            android.content.Context r0 = r0.zzb
            boolean r0 = com.google.android.gms.internal.gtm.zzfn.zzh(r0)
            if (r0 == 0) goto L_0x078e
            java.lang.String r0 = "AnalyticsService registered in the app manifest and enabled"
            r4.zzO(r0)
        L_0x0777:
            boolean r0 = r4.zzk
            if (r0 != 0) goto L_0x078a
            com.google.android.gms.internal.gtm.zzce r0 = r4.zzb
            long r5 = r0.zzb()
            r1 = 0
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x078a
            r4.zzi()
        L_0x078a:
            r4.zzae()
            return
        L_0x078e:
            java.lang.String r0 = "AnalyticsService not registered in the app manifest. Hits might not be delivered reliably. See http://goo.gl/8Rd3yj for instructions."
            r4.zzR(r0)
            goto L_0x0777
        L_0x0794:
            java.lang.String r3 = "com.google.android.gms.analytics.CampaignTrackingReceiver"
            r2 = 0
            android.content.pm.PackageManager r1 = r5.getPackageManager()     // Catch:{ NameNotFoundException -> 0x07af }
            android.content.ComponentName r0 = new android.content.ComponentName     // Catch:{ NameNotFoundException -> 0x07af }
            r0.<init>(r5, r3)     // Catch:{ NameNotFoundException -> 0x07af }
            android.content.pm.ActivityInfo r1 = r1.getReceiverInfo(r0, r2)     // Catch:{ NameNotFoundException -> 0x07af }
            if (r1 == 0) goto L_0x07af
            boolean r0 = r1.enabled     // Catch:{ NameNotFoundException -> 0x07af }
            if (r0 == 0) goto L_0x07af
            boolean r0 = r1.exported     // Catch:{ NameNotFoundException -> 0x07af }
            r1 = 1
            if (r0 != 0) goto L_0x07b0
        L_0x07af:
            r1 = 0
        L_0x07b0:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            com.google.android.gms.analytics.CampaignTrackingReceiver.zza = r0
            goto L_0x0705
        L_0x07b8:
            boolean r0 = com.google.android.gms.internal.gtm.zzfn.zzh(r5)
            if (r0 != 0) goto L_0x06fa
            java.lang.String r0 = "AnalyticsService is not registered or is disabled. Analytics service at risk of not starting. See http://goo.gl/8Rd3yj for instructions."
            r4.zzJ(r0)
            goto L_0x06fa
        L_0x07c5:
            r0 = 0
            android.os.Process.setThreadPriority(r0)
            java.lang.Object r0 = r5.A00
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r0.run()
            return
        L_0x07d1:
            java.lang.Object r0 = r5.A00
            X.0rV r0 = (X.C15580rV) r0
            java.util.concurrent.locks.Lock r1 = r0.A0D
            r1.lock()
            X.C15580rV.A00(r0)     // Catch:{ all -> 0x07e1 }
            r1.unlock()
            return
        L_0x07e1:
            r0 = move-exception
            r1.unlock()
            throw r0
        L_0x07e6:
            java.lang.Object r0 = r5.A00
            X.0rX r0 = (X.C15600rX) r0
            X.0rg r2 = r0.A00
            r1 = 4
            X.0rh r0 = new X.0rh
            r0.<init>(r1)
            r2.AiY(r0)
            return
        L_0x07f6:
            java.lang.Object r0 = r5.A00
            X.0rk r0 = (X.C15720rk) r0
            X.0rl r0 = r0.A00
            X.0rn r2 = r0.A04
            java.lang.Class r0 = r2.getClass()
            java.lang.String r1 = r0.getName()
            java.lang.String r0 = " disconnecting because it was signed out."
            java.lang.String r0 = r1.concat(r0)
            X.0rp r2 = (X.C15770rp) r2
            r2.A0S = r0
            r2.A80()
            return
        L_0x0814:
            java.lang.Object r0 = r5.A00
            X.0rl r0 = (X.C15730rl) r0
            r0.A01()
            return
        L_0x081c:
            java.lang.Object r0 = r5.A00
            X.0qF r0 = (X.C15050qF) r0
            r0.A03()
            return
        L_0x0824:
            java.lang.Object r0 = r5.A00
            X.0rq r0 = (X.C15780rq) r0
            r0.AcU()
            return
        L_0x082c:
            java.lang.Object r2 = r5.A00
            com.facebook.redex.RunnableRunnableShape0S0111000_I0 r2 = (com.facebook.redex.RunnableRunnableShape0S0111000_I0) r2
            r2.run()
            java.lang.Class<X.0rr> r1 = X.C15790rr.class
            monitor-enter(r1)
            java.util.List r0 = X.C15790rr.A01     // Catch:{ all -> 0x083d }
            r0.remove(r2)     // Catch:{ all -> 0x083d }
            monitor-exit(r1)
            return
        L_0x083d:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x0840:
            java.lang.String r1 = "reverse"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x0849:
            java.lang.String r0 = "home/show-low-free-space-on-internal-storage/cannot-start/home-activity-ended"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        L_0x084f:
            java.lang.Object r8 = r5.A00
            com.obwhatsapp.HomeActivity r8 = (com.obwhatsapp.HomeActivity) r8
            X.0po r2 = r8.A0Q
            r1 = 200(0xc8, float:2.8E-43)
            X.013 r0 = r8.A01
            int r0 = com.obwhatsapp.HomeActivity.A02(r0, r1)
            X.0pq r6 = r2.A0H(r0)
            X.0rs r0 = r8.A0t
            X.0rt r5 = r0.A00
            r5.A0C()
            java.util.ArrayList r4 = r0.A01
            monitor-enter(r4)
            java.util.Iterator r7 = r4.iterator()     // Catch:{ all -> 0x0962 }
            r3 = 0
            com.obwhatsapp.yo.yo.resetUnreadCh()     // Catch:{ all -> 0x0962 }
        L_0x0873:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x0962 }
            if (r0 == 0) goto L_0x08ba
            java.lang.Object r1 = r7.next()     // Catch:{ all -> 0x0962 }
            X.0ru r1 = (X.C15820ru) r1     // Catch:{ all -> 0x0962 }
            X.0rv r0 = r1.A01     // Catch:{ all -> 0x0962 }
            boolean r2 = com.obwhatsapp.yo.yo.H3T((X.C15830rv) r0)     // Catch:{ all -> 0x0962 }
            if (r2 != 0) goto L_0x0873
            boolean r0 = r5.A0G(r0)     // Catch:{ all -> 0x0962 }
            if (r0 != 0) goto L_0x0873
            X.0rv r2 = r1.A01     // Catch:{ all -> 0x0962 }
            int r0 = r5.A00(r2)     // Catch:{ all -> 0x0962 }
            com.obwhatsapp.yo.yo.unreadCh(r2, r0)     // Catch:{ all -> 0x0962 }
            if (r0 != 0) goto L_0x08b7
            java.lang.Boolean r2 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0962 }
            X.0rv r1 = r1.A01     // Catch:{ all -> 0x0962 }
            java.util.concurrent.ConcurrentHashMap r0 = r5.A0C()     // Catch:{ all -> 0x0962 }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ all -> 0x0962 }
            X.0rx r0 = (X.C15840rx) r0     // Catch:{ all -> 0x0962 }
            if (r0 != 0) goto L_0x08aa
            r0 = 0
            goto L_0x08b1
        L_0x08aa:
            monitor-enter(r0)     // Catch:{ all -> 0x0962 }
            monitor-exit(r0)     // Catch:{ all -> 0x0962 }
            r0 = 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0962 }
        L_0x08b1:
            boolean r0 = r2.equals(r0)     // Catch:{ all -> 0x0962 }
            if (r0 == 0) goto L_0x0873
        L_0x08b7:
            int r3 = r3 + 1
            goto L_0x0873
        L_0x08ba:
            monitor-exit(r4)     // Catch:{ all -> 0x0962 }
            r6.A00 = r3
            java.util.List r2 = com.obwhatsapp.HomeActivity.A2E
            r3 = 400(0x190, float:5.6E-43)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L_0x0900
            X.0po r1 = r8.A0Q     // Catch:{ all -> 0x08fe }
            X.013 r0 = r8.A01     // Catch:{ all -> 0x08fe }
            int r0 = com.obwhatsapp.HomeActivity.A02(r0, r3)     // Catch:{ all -> 0x08fe }
            X.0pq r1 = r1.A0H(r0)     // Catch:{ all -> 0x08fe }
            X.0ry r0 = r8.A0f     // Catch:{ all -> 0x08fe }
            r0.A00()     // Catch:{ all -> 0x08fe }
            java.util.Set r0 = r0.A00     // Catch:{ all -> 0x08fe }
            int r0 = r0.size()     // Catch:{ all -> 0x08fe }
            if (r0 <= 0) goto L_0x08f2
            X.0ry r0 = r8.A0f     // Catch:{ all -> 0x08fe }
            r0.A00()     // Catch:{ all -> 0x08fe }
            java.util.Set r0 = r0.A00     // Catch:{ all -> 0x08fe }
            int r0 = r0.size()     // Catch:{ all -> 0x08fe }
        L_0x08ef:
            r1.A00 = r0     // Catch:{ all -> 0x08fe }
            goto L_0x0900
        L_0x08f2:
            X.0pi r0 = r8.A1L     // Catch:{ all -> 0x08fe }
            r0.A03()     // Catch:{ all -> 0x08fe }
            java.util.List r0 = r0.A00     // Catch:{ all -> 0x08fe }
            int r0 = r0.size()     // Catch:{ all -> 0x08fe }
            goto L_0x08ef
        L_0x08fe:
            r0 = move-exception
            throw r0
        L_0x0900:
            r0 = 600(0x258, float:8.41E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            boolean r0 = r2.contains(r1)
            if (r0 == 0) goto L_0x0955
            r7 = 600(0x258, float:8.41E-43)
            boolean r0 = r2.contains(r1)
            if (r0 == 0) goto L_0x0955
            X.0po r1 = r8.A0Q
            X.013 r0 = r8.A01
            int r0 = com.obwhatsapp.HomeActivity.A02(r0, r7)
            X.0pq r6 = r1.A0H(r0)
            X.0pt r1 = r8.A05
            java.lang.Runnable r0 = r8.A24
            r1.A0J(r0)
            X.0rz r0 = r8.A09
            X.01D r0 = r0.A01
            java.lang.Object r1 = r0.get()
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1
            java.lang.String r0 = "last_community_activity"
            r2 = 0
            long r4 = r1.getLong(r0, r2)
            X.0rz r0 = r8.A09
            X.01D r0 = r0.A01
            java.lang.Object r1 = r0.get()
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1
            java.lang.String r0 = "last_seen_community_activity"
            long r1 = r1.getLong(r0, r2)
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0952
            int r1 = r8.A03
            r0 = 1
            if (r1 != r7) goto L_0x0953
        L_0x0952:
            r0 = 0
        L_0x0953:
            r6.A00 = r0
        L_0x0955:
            X.0pt r3 = r8.A05
            r0 = 38
            com.facebook.redex.RunnableRunnableShape1S0100000_I0 r1 = new com.facebook.redex.RunnableRunnableShape1S0100000_I0
            r1.<init>((com.obwhatsapp.HomeActivity) r8, (int) r0)
        L_0x095e:
            r3.A0K(r1)
            return
        L_0x0962:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0962 }
            throw r0
        L_0x0965:
            return
        L_0x0966:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0966 }
            throw r0
        L_0x0969:
            return
        L_0x096a:
            r2 = move-exception
            java.lang.String r1 = r2.getMessage()
            java.lang.String r0 = "StackFrameThread"
            android.util.Log.e(r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.RunnableRunnableShape1S0100000_I0.run():void");
    }
}
