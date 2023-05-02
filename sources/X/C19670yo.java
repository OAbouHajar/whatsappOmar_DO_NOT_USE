package X;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.wifi.WifiManager;
import android.os.ConditionVariable;
import android.os.Environment;
import com.facebook.redex.RunnableRunnableShape3S0100000_I0_2;
import com.obwhatsapp.backup.google.IDxTConditionShape56S0100000_2_I0;
import com.whatsapp.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.0yo  reason: invalid class name and case insensitive filesystem */
public class C19670yo implements C18000vz {
    public int A00;
    public int A01 = 0;
    public int A02 = 0;
    public WifiManager.WifiLock A03;
    public boolean A04 = false;
    public boolean A05 = false;
    public boolean A06 = false;
    public boolean A07 = false;
    public boolean A08 = false;
    public boolean A09 = false;
    public final ConditionVariable A0A = new ConditionVariable(false);
    public final ConditionVariable A0B = new ConditionVariable(false);
    public final ConditionVariable A0C = new ConditionVariable(false);
    public final ConditionVariable A0D = new ConditionVariable(false);
    public final ConditionVariable A0E = new ConditionVariable(false);
    public final ConditionVariable A0F = new ConditionVariable(false);
    public final ConditionVariable A0G = new ConditionVariable(false);
    public final C16040sK A0H;
    public final C18900xR A0I;
    public final C15900s5 A0J;
    public final C16600tK A0K;
    public final AnonymousClass12M A0L;
    public final AnonymousClass2GJ A0M = new IDxTConditionShape56S0100000_2_I0(this, 0);
    public final C19080xj A0N;
    public final C210812s A0O;
    public final C18260wP A0P;
    public final AnonymousClass01V A0Q;
    public final C16980tz A0R;
    public final C15860rz A0S;
    public final C16900tq A0T;
    public final C17190ug A0U;
    public final C17020u3 A0V;
    public final C18990xa A0W;
    public final C15960sC A0X;
    public final C16320sq A0Y;
    public final AtomicBoolean A0Z = new AtomicBoolean(false);
    public final AtomicBoolean A0a = new AtomicBoolean(false);
    public final AtomicBoolean A0b = new AtomicBoolean(false);
    public final AtomicBoolean A0c = new AtomicBoolean(false);
    public final AtomicBoolean A0d = new AtomicBoolean(false);
    public final AtomicBoolean A0e = new AtomicBoolean(false);
    public final AtomicBoolean A0f = new AtomicBoolean(false);
    public final AtomicBoolean A0g = new AtomicBoolean(false);
    public final AtomicBoolean A0h = new AtomicBoolean(false);
    public final AtomicBoolean A0i = new AtomicBoolean(false);
    public final AtomicBoolean A0j = new AtomicBoolean(false);
    public final AtomicBoolean A0k = new AtomicBoolean(false);

    public C19670yo(C16040sK r3, C18900xR r4, C15900s5 r5, C16600tK r6, AnonymousClass12M r7, C19080xj r8, C210812s r9, C18260wP r10, AnonymousClass01V r11, C16980tz r12, C15860rz r13, C16900tq r14, C17190ug r15, C17020u3 r16, C18990xa r17, C15960sC r18, C16320sq r19) {
        this.A0R = r12;
        this.A0H = r3;
        this.A0Y = r19;
        this.A0I = r4;
        this.A0J = r5;
        this.A0W = r17;
        this.A0U = r15;
        this.A0N = r8;
        this.A0Q = r11;
        this.A0K = r6;
        this.A0T = r14;
        this.A0S = r13;
        this.A0O = r9;
        this.A0X = r18;
        this.A0V = r16;
        this.A0P = r10;
        this.A0L = r7;
    }

    public void A00() {
        if (this.A03 == null) {
            AnonymousClass01V r3 = this.A0Q;
            WifiManager wifiManager = r3.A0E;
            if (wifiManager == null) {
                wifiManager = (WifiManager) r3.A0S("wifi", false);
                r3.A0E = wifiManager;
                if (wifiManager == null) {
                    Log.w("GoogleBackupConditionsManager/create-wifi-lock wm=null");
                }
            }
            WifiManager.WifiLock createWifiLock = wifiManager.createWifiLock(1, "backup-lock");
            this.A03 = createWifiLock;
            createWifiLock.setReferenceCounted(false);
        }
        WifiManager.WifiLock wifiLock = this.A03;
        if (wifiLock != null && !wifiLock.isHeld()) {
            this.A03.acquire();
        }
    }

    public void A01() {
        this.A04 = true;
        this.A0Y.Acl(new RunnableRunnableShape3S0100000_I0_2(this, 8));
    }

    public void A02() {
        this.A0S.A0K().putString("gdrive_media_restore_network_setting", String.valueOf(1)).apply();
        A05();
        this.A0Y.Acl(new RunnableRunnableShape3S0100000_I0_2(this, 8));
    }

    public void A03() {
        this.A08 = true;
        A08(this.A0O.A00);
        this.A0Y.Acl(new RunnableRunnableShape3S0100000_I0_2(this, 6));
    }

    public void A04() {
        String str;
        StringBuilder sb;
        boolean z2;
        AnonymousClass00B.A00();
        C15860rz r5 = this.A0S;
        if (AnonymousClass2GK.A0H(r5)) {
            AtomicBoolean atomicBoolean = this.A0e;
            if (!atomicBoolean.get()) {
                A09(Environment.getExternalStorageState());
                A05();
                A07();
                AtomicBoolean atomicBoolean2 = this.A0i;
                if (!atomicBoolean2.get() || !this.A07 || !this.A09) {
                    sb = new StringBuilder("restore>GoogleBackupConditionsManager/trigger-nothing media-restore-pending: ");
                    sb.append(AnonymousClass2GK.A0H(r5));
                    sb.append(" media-restore-running: ");
                    sb.append(atomicBoolean.get());
                    sb.append(" network_available_for_media_restore: ");
                    sb.append(atomicBoolean2.get());
                    sb.append(" battery_available_for_media_restore: ");
                    z2 = this.A07;
                    sb.append(z2);
                    sb.append(" sdcard_available: ");
                    sb.append(this.A09);
                    str = sb.toString();
                    Log.i(str);
                }
                Log.i("restore>GoogleBackupConditionsManager/trigger-pending-media-restore");
                Context context = this.A0R.A00;
                C446524y.A00(context, C14750ph.A0d(context, "action_restore_media"));
                return;
            }
        }
        if (AnonymousClass2GK.A0G(r5)) {
            AtomicBoolean atomicBoolean3 = this.A0c;
            if (!atomicBoolean3.get()) {
                A09(Environment.getExternalStorageState());
                A05();
                A07();
                AtomicBoolean atomicBoolean4 = this.A0g;
                if (!atomicBoolean4.get() || !this.A05 || !this.A09) {
                    sb = new StringBuilder("GoogleBackupConditionsManager/trigger-nothing is-backup-pending: ");
                    sb.append(AnonymousClass2GK.A0G(r5));
                    sb.append(" is-backup-running: ");
                    sb.append(atomicBoolean3.get());
                    sb.append(" network_available_for_backup: ");
                    sb.append(atomicBoolean4.get());
                    sb.append(" battery_available_for_backup: ");
                    z2 = this.A05;
                    sb.append(z2);
                    sb.append(" sdcard_available: ");
                    sb.append(this.A09);
                    str = sb.toString();
                    Log.i(str);
                }
                Context context2 = this.A0R.A00;
                Intent A0d2 = C14750ph.A0d(context2, "action_backup");
                A0d2.putExtra("only_if_pending", true);
                C446524y.A00(context2, A0d2);
                str = "GoogleBackupConditionsManager/trigger-pending-backup";
                Log.i(str);
            }
        }
        if (this.A0j.get() || this.A0k.get()) {
            Log.i("GoogleBackupConditionsManager/service-running/recalculate-network-and-sdcard");
            A09(Environment.getExternalStorageState());
            A05();
            A07();
            return;
        }
        str = "GoogleBackupConditionsManager/trigger-nothing/nothing-pending";
        Log.i(str);
    }

    public void A05() {
        int i2;
        try {
            C15860rz r1 = this.A0S;
            this.A01 = r1.A07();
            try {
                i2 = Integer.parseInt(((SharedPreferences) r1.A01.get()).getString("gdrive_media_restore_network_setting", String.valueOf(0)));
            } catch (NumberFormatException e2) {
                Log.e("wa-shared-preferences/get-media-restore-network-setting", e2);
                i2 = 0;
            }
            this.A02 = i2;
        } catch (NumberFormatException e3) {
            Log.e((Throwable) e3);
        }
    }

    public void A06() {
        WifiManager.WifiLock wifiLock = this.A03;
        if (wifiLock != null && wifiLock.isHeld()) {
            this.A03.release();
        }
    }

    public synchronized void A07() {
        boolean z2;
        AtomicBoolean atomicBoolean;
        boolean z3;
        AtomicBoolean atomicBoolean2;
        AtomicBoolean atomicBoolean3;
        boolean z4;
        boolean z5;
        AnonymousClass00B.A00();
        C18260wP r0 = this.A0P;
        boolean z6 = true;
        int A042 = r0.A04(true);
        this.A00 = A042;
        boolean z7 = false;
        if (A042 != 0) {
            if (A042 == 1) {
                AnonymousClass1UW A062 = r0.A06();
                if (A062 == null) {
                    Log.i("GoogleBackupConditionsManager/can-use-network/active_network/wifi active network info is null, no connection");
                    this.A0E.close();
                    this.A0F.close();
                    this.A0D.close();
                    atomicBoolean = this.A0h;
                    boolean andSet = atomicBoolean.getAndSet(false);
                    atomicBoolean2 = this.A0i;
                    z2 = andSet | atomicBoolean2.getAndSet(false);
                    atomicBoolean3 = this.A0g;
                    z3 = atomicBoolean3.getAndSet(false);
                } else if (!A062.A06 || !C18260wP.A01()) {
                    Log.i("GoogleBackupConditionsManager/can-use-network/active_network/wifi");
                    this.A0E.open();
                    this.A0F.open();
                    this.A0D.open();
                    atomicBoolean = this.A0h;
                    boolean z8 = false;
                    if (!atomicBoolean.getAndSet(true)) {
                        z8 = true;
                    }
                    atomicBoolean2 = this.A0i;
                    if (!atomicBoolean2.getAndSet(true)) {
                        z7 = true;
                    }
                    z2 = z8 | z7;
                    atomicBoolean3 = this.A0g;
                    z4 = atomicBoolean3.getAndSet(true);
                } else {
                    Log.i("GoogleBackupConditionsManager/can-use-network/active_network/wifi/captive");
                    this.A0E.close();
                    this.A0F.close();
                    this.A0D.close();
                    atomicBoolean = this.A0h;
                    boolean andSet2 = atomicBoolean.getAndSet(false);
                    atomicBoolean2 = this.A0i;
                    z2 = andSet2 | atomicBoolean2.getAndSet(false);
                    atomicBoolean3 = this.A0g;
                    z3 = atomicBoolean3.getAndSet(false);
                }
            } else if (A042 == 2) {
                Log.i("GoogleBackupConditionsManager/can-use-network/active_network/cellular");
                this.A0E.open();
                atomicBoolean = this.A0h;
                boolean z9 = false;
                if (!atomicBoolean.getAndSet(true)) {
                    z9 = true;
                }
                if (this.A04 || this.A01 == 1) {
                    this.A0D.open();
                    atomicBoolean3 = this.A0g;
                    z5 = !atomicBoolean3.getAndSet(true);
                } else {
                    this.A0D.close();
                    atomicBoolean3 = this.A0g;
                    z5 = atomicBoolean3.getAndSet(false);
                }
                z2 = z9 | z5;
                if (this.A02 == 1) {
                    this.A0F.open();
                    atomicBoolean2 = this.A0i;
                    z4 = atomicBoolean2.getAndSet(true);
                } else {
                    this.A0F.close();
                    atomicBoolean2 = this.A0i;
                    z3 = atomicBoolean2.getAndSet(false);
                }
            } else if (A042 == 3) {
                Log.i("GoogleBackupConditionsManager/can-use-network/active_network/roaming");
                this.A0E.open();
                this.A0F.close();
                this.A0D.close();
                atomicBoolean = this.A0h;
                if (atomicBoolean.getAndSet(true)) {
                    z6 = false;
                }
                atomicBoolean2 = this.A0i;
                z2 = atomicBoolean2.getAndSet(false) | z6;
                atomicBoolean3 = this.A0g;
                z3 = atomicBoolean3.getAndSet(false);
            }
            z3 = true ^ z4;
        } else {
            Log.i("GoogleBackupConditionsManager/can-use-network/active_network/none");
            this.A0E.close();
            this.A0F.close();
            this.A0D.close();
            atomicBoolean = this.A0h;
            boolean andSet3 = atomicBoolean.getAndSet(false);
            atomicBoolean2 = this.A0i;
            z2 = andSet3 | atomicBoolean2.getAndSet(false);
            atomicBoolean3 = this.A0g;
            z3 = atomicBoolean3.getAndSet(false);
        }
        if (z2 || z3) {
            StringBuilder sb = new StringBuilder();
            sb.append("restore>GoogleBackupConditionsManager/can-use-network/message-restore/");
            sb.append(atomicBoolean.get());
            Log.i(sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append("restore>GoogleBackupConditionsManager/can-use-network/media-restore/");
            sb2.append(atomicBoolean2.get());
            Log.i(sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append("GoogleBackupConditionsManager/can-use-network/backup/");
            sb3.append(atomicBoolean3.get());
            Log.i(sb3.toString());
        }
    }

    public void A08(C46192Cv r7) {
        double A002 = r7.A00();
        boolean z2 = false;
        int i2 = !Double.isNaN(A002) ? (int) A002 : 0;
        this.A0B.open();
        boolean z3 = true;
        this.A06 = true;
        if (this.A08 || r7.A02()) {
            this.A0A.open();
            this.A0C.open();
            if (!this.A05 || !this.A07) {
                z2 = true;
            }
            this.A05 = true;
            this.A07 = true;
            z3 = z2;
        } else {
            this.A0A.close();
            this.A0C.close();
            if (!this.A05 && !this.A07) {
                z3 = false;
            }
            this.A05 = false;
            this.A07 = false;
        }
        if (z3) {
            StringBuilder sb = new StringBuilder("GoogleBackupConditionsManager/can-use-battery/battery-level/");
            sb.append(i2);
            Log.i(sb.toString());
            StringBuilder sb2 = new StringBuilder("GoogleBackupConditionsManager/can-use-battery-for-backup/");
            sb2.append(this.A05);
            Log.i(sb2.toString());
            StringBuilder sb3 = new StringBuilder("restore>GoogleBackupConditionsManager/can-use-battery-for-media-restore/");
            sb3.append(this.A07);
            Log.i(sb3.toString());
            StringBuilder sb4 = new StringBuilder("GoogleBackupConditionsManager/ignore-battery-status/");
            sb4.append(this.A08);
            Log.i(sb4.toString());
        }
    }

    public void A09(String str) {
        AnonymousClass00B.A00();
        boolean equals = "mounted".equals(str);
        ConditionVariable conditionVariable = this.A0G;
        if (equals) {
            conditionVariable.open();
            if (!this.A09) {
                this.A09 = true;
                if (A0A()) {
                    A04();
                    return;
                }
                return;
            }
            return;
        }
        conditionVariable.close();
        this.A09 = false;
    }

    public boolean A0A() {
        if (!this.A0J.A05(C15910s6.A0Q)) {
            Log.i("GoogleBackupConditionsManager/isGoogleDriveAccessPossible/gdrive disabled by serverprops");
            return false;
        }
        Context context = this.A0R.A00;
        int A002 = C437421i.A00(context);
        if (A002 == 0) {
            return true;
        }
        try {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
            StringBuilder sb = new StringBuilder();
            sb.append("GoogleBackupConditionsManager/isGoogleDriveAccessPossible/Google Play services are missing and can be installed,  status code: ");
            sb.append(AnonymousClass2GK.A03(A002));
            Log.i(sb.toString());
            return true;
        } catch (Exception e2) {
            StringBuilder sb2 = new StringBuilder("GoogleBackupConditionsManager/isGoogleDriveAccessPossible/Google Play services are missing and cannot be installed, status code: ");
            sb2.append(AnonymousClass2GK.A03(A002));
            Log.i(sb2.toString(), e2);
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0072, code lost:
        if (r4.A0M() == null) goto L_0x0074;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0B() {
        /*
            r10 = this;
            X.0sK r0 = r10.A0H
            boolean r0 = r0.A0G()
            r9 = 0
            if (r0 != 0) goto L_0x0014
            boolean r0 = r10.A0A()
            if (r0 != 0) goto L_0x0015
            java.lang.String r0 = "GoogleBackupConditionsManager/should-start/false/gdrive-access-not-allowed"
        L_0x0011:
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0014:
            return r9
        L_0x0015:
            X.0sC r0 = r10.A0X
            boolean r0 = r0.A01()
            if (r0 != 0) goto L_0x0020
            java.lang.String r0 = "GoogleBackupConditionsManager/should-start/false/reg-not-verified"
            goto L_0x0011
        L_0x0020:
            X.0xa r0 = r10.A0W
            boolean r0 = r0.A00
            if (r0 == 0) goto L_0x0029
            java.lang.String r0 = "GoogleBackupConditionsManager/should-start/false/login-failed"
            goto L_0x0011
        L_0x0029:
            X.0xR r1 = r10.A0I
            boolean r0 = r1.A03()
            if (r0 == 0) goto L_0x0034
            java.lang.String r0 = "GoogleBackupConditionsManager/should-start/false/clock-wrong"
            goto L_0x0011
        L_0x0034:
            boolean r0 = r1.A02()
            if (r0 == 0) goto L_0x003d
            java.lang.String r0 = "GoogleBackupConditionsManager/should-start/false/software-expired"
            goto L_0x0011
        L_0x003d:
            X.0tq r0 = r10.A0T
            int r0 = r0.A00()
            r8 = 1
            if (r0 > r8) goto L_0x0049
            java.lang.String r0 = "GoogleBackupConditionsManager/should-start/false/message-count-low"
            goto L_0x0011
        L_0x0049:
            X.0rz r4 = r10.A0S
            int r2 = r4.A06()
            if (r2 == 0) goto L_0x0074
            if (r2 == r8) goto L_0x006e
            r0 = 2
            if (r2 == r0) goto L_0x006e
            r0 = 3
            if (r2 == r0) goto L_0x006e
            r0 = 4
            if (r2 == r0) goto L_0x006e
            java.lang.String r1 = "GoogleBackupConditionsManager/should-start/unexpected-backup-freq/"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x0074
        L_0x006e:
            java.lang.String r0 = r4.A0M()
            if (r0 != 0) goto L_0x0014
        L_0x0074:
            java.lang.String r3 = "gdrive_next_prompt_for_setup_timestamp"
            r1 = -1
            X.01D r0 = r4.A01     // Catch:{ NumberFormatException -> 0x00b7 }
            java.lang.Object r0 = r0.get()     // Catch:{ NumberFormatException -> 0x00b7 }
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0     // Catch:{ NumberFormatException -> 0x00b7 }
            long r6 = r0.getLong(r3, r1)     // Catch:{ NumberFormatException -> 0x00b7 }
            long r4 = java.lang.System.currentTimeMillis()
            java.util.Locale r3 = java.util.Locale.ENGLISH
            r0 = 3
            java.lang.Object[] r2 = new java.lang.Object[r0]
            java.lang.Long r0 = java.lang.Long.valueOf(r6)
            r2[r9] = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            r2[r8] = r0
            r1 = 2
            long r4 = r4 - r6
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            r2[r1] = r0
            java.lang.String r0 = "saved time: %d, current time: %d, difference: %d"
            java.lang.String.format(r3, r0, r2)
            r1 = 0
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x00bd
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0014
            java.lang.String r0 = "GoogleBackupConditionsManager/sufficient-time-passed-since-last-user-prompt/true"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x00bd
        L_0x00b7:
            r1 = move-exception
            java.lang.String r0 = "GoogleBackupConditionsManager/sufficient-time-passed-since-last-user-prompt/"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x00bd:
            r9 = 1
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19670yo.A0B():boolean");
    }

    public boolean A0C() {
        String str;
        if (this.A0c.get() || this.A0d.get()) {
            if (this.A0D.block(1800000)) {
                return true;
            }
            str = "GoogleBackupConditionsManager/network-wait/backup 1800000 milliseconds, giving up now.";
        } else if (this.A0e.get()) {
            if (this.A0F.block(1800000)) {
                return true;
            }
            Log.e("restore>GoogleBackupConditionsManager/network-wait/media-restore 1800000 milliseconds, giving up now.");
            return true;
        } else if (this.A0E.block(1800000)) {
            return true;
        } else {
            str = "restore>GoogleBackupConditionsManager/network-wait/message-restore 1800000 milliseconds, giving up now.";
        }
        Log.e(str);
        return false;
    }

    public boolean A0D(int i2) {
        AnonymousClass00B.A00();
        if (i2 == 0 || i2 == 1) {
            this.A01 = i2;
            A07();
            this.A0S.A0K().putString("interface_gdrive_backup_network_setting", String.valueOf(i2)).apply();
            return true;
        }
        StringBuilder sb = new StringBuilder("GoogleBackupConditionsManager/set-backup-network-setting/incorrect-value/");
        sb.append(i2);
        Log.e(sb.toString());
        return false;
    }

    public boolean A0E(long j2) {
        if (this.A0G.block(j2)) {
            return true;
        }
        StringBuilder sb = new StringBuilder("GoogleBackupConditionsManager/sdcard-wait ");
        sb.append(j2);
        sb.append(" milliseconds, giving up now.");
        Log.e(sb.toString());
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:107:0x0221  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0F(X.AnonymousClass2GL r19, X.AnonymousClass2GM r20) {
        /*
            r18 = this;
            r6 = 0
            r10 = r20
            if (r20 == 0) goto L_0x024c
            r5 = r18
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.A0h
            boolean r17 = r0.get()
            boolean r9 = r5.A06
            X.0tK r0 = r5.A0K
            boolean r0 = r0.A08()
            r8 = 1
            if (r0 != 0) goto L_0x0028
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.A0c
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x0248
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.A0d
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x0248
        L_0x0028:
            r16 = 1
        L_0x002a:
            java.util.concurrent.atomic.AtomicBoolean r11 = r5.A0c
            boolean r0 = r11.get()
            if (r0 != 0) goto L_0x023e
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.A0d
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x023e
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.A0e
            boolean r0 = r0.get()
            if (r0 == 0) goto L_0x004a
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.A0i
            boolean r17 = r0.get()
            boolean r9 = r5.A07
        L_0x004a:
            if (r17 == 0) goto L_0x005e
            if (r9 == 0) goto L_0x005e
            boolean r0 = r5.A09
            if (r0 == 0) goto L_0x005e
            if (r16 == 0) goto L_0x005e
        L_0x0054:
            X.0xj r1 = r5.A0N
            r10.A09(r8)
            r0 = 2
            r1.A00(r0, r8)
            return r8
        L_0x005e:
            android.net.wifi.WifiManager$WifiLock r0 = r5.A03
            if (r0 == 0) goto L_0x009d
            boolean r0 = r0.isHeld()
            if (r0 == 0) goto L_0x009d
            r15 = 1
            r5.A06()
        L_0x006c:
            r4 = 2
            r7 = r19
            if (r17 != 0) goto L_0x00e9
            X.0rz r0 = r5.A0S
            int r0 = r0.A09()
            if (r0 == r8) goto L_0x00af
            if (r0 != r4) goto L_0x00e9
            int r14 = r5.A02
            X.12M r12 = r5.A0L
            long r2 = r7.A00
            long r0 = r7.A01
            java.lang.Iterable r12 = r12.A01()
            java.util.Iterator r13 = r12.iterator()
            if (r14 != 0) goto L_0x009f
        L_0x008d:
            boolean r12 = r13.hasNext()
            if (r12 == 0) goto L_0x00e1
            java.lang.Object r12 = r13.next()
            X.12R r12 = (X.AnonymousClass12R) r12
            r12.ATW(r2, r0)
            goto L_0x008d
        L_0x009d:
            r15 = 0
            goto L_0x006c
        L_0x009f:
            boolean r12 = r13.hasNext()
            if (r12 == 0) goto L_0x00e1
            java.lang.Object r12 = r13.next()
            X.12R r12 = (X.AnonymousClass12R) r12
            r12.ATS(r2, r0)
            goto L_0x009f
        L_0x00af:
            int r14 = r5.A01
            X.12M r12 = r5.A0L
            long r2 = r7.A03
            long r0 = r7.A02
            java.lang.Iterable r12 = r12.A01()
            java.util.Iterator r13 = r12.iterator()
            if (r14 != 0) goto L_0x00d1
        L_0x00c1:
            boolean r12 = r13.hasNext()
            if (r12 == 0) goto L_0x00e1
            java.lang.Object r12 = r13.next()
            X.12R r12 = (X.AnonymousClass12R) r12
            r12.ANO(r2, r0)
            goto L_0x00c1
        L_0x00d1:
            boolean r12 = r13.hasNext()
            if (r12 == 0) goto L_0x00e1
            java.lang.Object r12 = r13.next()
            X.12R r12 = (X.AnonymousClass12R) r12
            r12.ANK(r2, r0)
            goto L_0x00d1
        L_0x00e1:
            X.0xj r0 = r5.A0N
            r10.A09(r6)
            r0.A00(r4, r6)
        L_0x00e9:
            if (r9 != 0) goto L_0x0139
            X.0rz r0 = r5.A0S
            int r0 = r0.A09()
            if (r0 == r8) goto L_0x0113
            if (r0 != r4) goto L_0x0139
            X.12M r12 = r5.A0L
            long r2 = r7.A00
            long r0 = r7.A01
            java.lang.Iterable r12 = r12.A01()
            java.util.Iterator r13 = r12.iterator()
        L_0x0103:
            boolean r12 = r13.hasNext()
            if (r12 == 0) goto L_0x0131
            java.lang.Object r12 = r13.next()
            X.12R r12 = (X.AnonymousClass12R) r12
            r12.ATT(r2, r0)
            goto L_0x0103
        L_0x0113:
            X.12M r12 = r5.A0L
            long r2 = r7.A03
            long r0 = r7.A02
            java.lang.Iterable r12 = r12.A01()
            java.util.Iterator r13 = r12.iterator()
        L_0x0121:
            boolean r12 = r13.hasNext()
            if (r12 == 0) goto L_0x0131
            java.lang.Object r12 = r13.next()
            X.12R r12 = (X.AnonymousClass12R) r12
            r12.ANL(r2, r0)
            goto L_0x0121
        L_0x0131:
            X.0xj r0 = r5.A0N
            r10.A09(r6)
            r0.A00(r4, r6)
        L_0x0139:
            boolean r0 = r5.A09
            if (r0 != 0) goto L_0x01ba
            X.0rz r0 = r5.A0S
            int r0 = r0.A09()
            java.lang.String r1 = "unmounted"
            if (r0 == r8) goto L_0x0182
            if (r0 != r4) goto L_0x01ba
            java.lang.String r0 = android.os.Environment.getExternalStorageState()
            boolean r13 = r1.equals(r0)
            X.12M r12 = r5.A0L
            long r0 = r7.A00
            long r2 = r7.A01
            java.lang.Iterable r7 = r12.A01()
            java.util.Iterator r12 = r7.iterator()
            if (r13 == 0) goto L_0x0172
        L_0x0162:
            boolean r7 = r12.hasNext()
            if (r7 == 0) goto L_0x01ba
            java.lang.Object r7 = r12.next()
            X.12R r7 = (X.AnonymousClass12R) r7
            r7.ATV(r0, r2)
            goto L_0x0162
        L_0x0172:
            boolean r7 = r12.hasNext()
            if (r7 == 0) goto L_0x01ba
            java.lang.Object r7 = r12.next()
            X.12R r7 = (X.AnonymousClass12R) r7
            r7.ATU(r0, r2)
            goto L_0x0172
        L_0x0182:
            java.lang.String r0 = android.os.Environment.getExternalStorageState()
            boolean r13 = r1.equals(r0)
            X.12M r12 = r5.A0L
            long r0 = r7.A03
            long r2 = r7.A02
            java.lang.Iterable r7 = r12.A01()
            java.util.Iterator r12 = r7.iterator()
            if (r13 == 0) goto L_0x01aa
        L_0x019a:
            boolean r7 = r12.hasNext()
            if (r7 == 0) goto L_0x01ba
            java.lang.Object r7 = r12.next()
            X.12R r7 = (X.AnonymousClass12R) r7
            r7.ANN(r0, r2)
            goto L_0x019a
        L_0x01aa:
            boolean r7 = r12.hasNext()
            if (r7 == 0) goto L_0x01ba
            java.lang.Object r7 = r12.next()
            X.12R r7 = (X.AnonymousClass12R) r7
            r7.ANM(r0, r2)
            goto L_0x01aa
        L_0x01ba:
            if (r16 != 0) goto L_0x01c4
            X.0xj r0 = r5.A0N
            r10.A09(r6)
            r0.A00(r4, r6)
        L_0x01c4:
            boolean r0 = r5.A0C()
            if (r0 == 0) goto L_0x01f0
            boolean r2 = r11.get()
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            if (r2 != 0) goto L_0x020d
            java.util.concurrent.atomic.AtomicBoolean r2 = r5.A0d
            boolean r2 = r2.get()
            if (r2 != 0) goto L_0x020d
            java.util.concurrent.atomic.AtomicBoolean r2 = r5.A0e
            boolean r2 = r2.get()
            if (r2 == 0) goto L_0x0218
            android.os.ConditionVariable r2 = r5.A0C
            boolean r0 = r2.block(r0)
            if (r0 != 0) goto L_0x0218
            java.lang.String r0 = "restore>GoogleBackupConditionsManager/battery-wait/media-restore 86400000 milliseconds, giving up now."
        L_0x01ed:
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x01f0:
            r0 = 3
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r17)
            r1[r6] = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r9)
            r1[r8] = r0
            boolean r0 = r5.A09
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1[r4] = r0
            java.lang.String r0 = "gdrive-service/wait-for-suitable-conditions network-available:%b, battery-available:%b sdcard-available:%b"
            java.lang.String.format(r0, r1)
            return r6
        L_0x020d:
            android.os.ConditionVariable r2 = r5.A0A
            boolean r0 = r2.block(r0)
            if (r0 != 0) goto L_0x0218
            java.lang.String r0 = "GoogleBackupConditionsManager/battery-wait/backup 86400000 milliseconds, giving up now."
            goto L_0x01ed
        L_0x0218:
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            boolean r0 = r5.A0E(r0)
            if (r0 == 0) goto L_0x01f0
            boolean r0 = r11.get()
            if (r0 != 0) goto L_0x022f
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.A0d
            boolean r0 = r0.get()
            if (r0 == 0) goto L_0x0237
        L_0x022f:
            X.0ug r2 = r5.A0U     // Catch:{ 1kR -> 0x01f0 }
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            r2.A07(r0)     // Catch:{ 1kR -> 0x01f0 }
        L_0x0237:
            if (r15 == 0) goto L_0x0054
            r5.A00()
            goto L_0x0054
        L_0x023e:
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.A0g
            boolean r17 = r0.get()
            boolean r9 = r5.A05
            goto L_0x004a
        L_0x0248:
            r16 = 0
            goto L_0x002a
        L_0x024c:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19670yo.A0F(X.2GL, X.2GM):boolean");
    }

    public void AP4(AnonymousClass1UX r4) {
        this.A0Y.Acl(new RunnableRunnableShape3S0100000_I0_2(this, 9));
    }
}
