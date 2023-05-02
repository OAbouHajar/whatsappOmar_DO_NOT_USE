package X;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.core.app.NotificationCompat$BigTextStyle;
import com.facebook.redex.RunnableRunnableShape10S0200000_I0_8;
import com.facebook.redex.RunnableRunnableShape13S0100000_I0_12;
import com.obwhatsapp.Me;
import com.obwhatsapp.R;
import com.obwhatsapp.yo.yo;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.0yx  reason: invalid class name and case insensitive filesystem */
public class C19760yx {
    public final Handler A00 = new Handler(Looper.getMainLooper());
    public final C16570tH A01;
    public final AnonymousClass129 A02;
    public final AnonymousClass12E A03;
    public final C14870pt A04;
    public final C16040sK A05;
    public final C211512z A06;
    public final C211212w A07;
    public final C15900s5 A08;
    public final C19000xb A09;
    public final C19740yv A0A;
    public final AnonymousClass12J A0B;
    public final C19670yo A0C;
    public final AnonymousClass12U A0D;
    public final AnonymousClass01Y A0E;
    public final C18930xU A0F;
    public final C17030uP A0G;
    public final AnonymousClass12A A0H;
    public final C19230xz A0I;
    public final C210712r A0J;
    public final AnonymousClass01V A0K;
    public final C16440t3 A0L;
    public final C16980tz A0M;
    public final C19380yL A0N;
    public final C15860rz A0O;
    public final C16290sm A0P;
    public final AnonymousClass013 A0Q;
    public final C18910xS A0R;
    public final C210912t A0S;
    public final C19650ym A0T;
    public final C16900tq A0U;
    public final AnonymousClass131 A0V;
    public final C19410yO A0W;
    public final AnonymousClass10J A0X;
    public final C14710pd A0Y;
    public final C17240ul A0Z;
    public final C19470yU A0a;
    public final C17190ug A0b;
    public final C19090xk A0c;
    public final AnonymousClass124 A0d;
    public final C14770pj A0e;
    public final C18320wV A0f;
    public final C17020u3 A0g;
    public final C19220xx A0h;
    public final C18990xa A0i;
    public final C15960sC A0j;
    public final AnonymousClass12L A0k;
    public final C211312x A0l;
    public final C211112v A0m;
    public final C211412y A0n;
    public final C19450yS A0o;
    public final AnonymousClass130 A0p;
    public final C16320sq A0q;
    public final AnonymousClass01D A0r;
    public final AnonymousClass01D A0s;
    public final AnonymousClass01D A0t;
    public final AnonymousClass01D A0u;
    public final List A0v = new CopyOnWriteArrayList();

    public C19760yx(C16570tH r3, AnonymousClass129 r4, AnonymousClass12E r5, C14870pt r6, C16040sK r7, C211512z r8, C211212w r9, C15900s5 r10, C19000xb r11, C19740yv r12, AnonymousClass12J r13, C19670yo r14, AnonymousClass12U r15, AnonymousClass01Y r16, C18930xU r17, C17030uP r18, AnonymousClass12A r19, C19230xz r20, C210712r r21, AnonymousClass01V r22, C16440t3 r23, C16980tz r24, C19380yL r25, C15860rz r26, C16290sm r27, AnonymousClass013 r28, C18910xS r29, C210912t r30, C19650ym r31, C16900tq r32, AnonymousClass131 r33, C19410yO r34, AnonymousClass10J r35, C14710pd r36, C17240ul r37, C19470yU r38, C17190ug r39, C19090xk r40, AnonymousClass124 r41, C14770pj r42, C18320wV r43, C17020u3 r44, C19220xx r45, C18990xa r46, C15960sC r47, AnonymousClass12L r48, C211312x r49, C211112v r50, C211412y r51, C19450yS r52, AnonymousClass130 r53, C16320sq r54, AnonymousClass01D r55, AnonymousClass01D r56, AnonymousClass01D r57, AnonymousClass01D r58) {
        this.A0M = r24;
        this.A0L = r23;
        this.A0Y = r36;
        this.A0m = r50;
        this.A04 = r6;
        this.A07 = r9;
        this.A0J = r21;
        this.A05 = r7;
        this.A0q = r54;
        this.A0l = r49;
        this.A0n = r51;
        this.A0R = r29;
        this.A0d = r41;
        this.A08 = r10;
        this.A0F = r17;
        this.A0i = r46;
        this.A09 = r11;
        this.A0b = r39;
        this.A0c = r40;
        this.A0t = r55;
        this.A0K = r22;
        this.A0Q = r28;
        this.A0X = r35;
        this.A0E = r16;
        this.A0Z = r37;
        this.A06 = r8;
        this.A0h = r45;
        this.A0A = r12;
        this.A0I = r20;
        this.A0S = r30;
        this.A02 = r4;
        this.A0H = r19;
        this.A0D = r15;
        this.A0U = r32;
        this.A0u = r56;
        this.A0G = r18;
        this.A0O = r26;
        this.A0e = r42;
        this.A0k = r48;
        this.A0N = r25;
        this.A0W = r34;
        this.A0o = r52;
        this.A0p = r53;
        this.A0a = r38;
        this.A0f = r43;
        this.A0j = r47;
        this.A0g = r44;
        this.A01 = r3;
        this.A0V = r33;
        this.A0P = r27;
        this.A0s = r57;
        this.A0C = r14;
        this.A0T = r31;
        this.A0B = r13;
        this.A03 = r5;
        this.A0r = r58;
    }

    public static String A00(Context context, String str) {
        String packageName = context.getPackageName();
        int length = packageName.length();
        return (!str.startsWith(packageName) || str.length() <= length || str.charAt(length) != '.') ? str : str.substring(length + 1);
    }

    public Intent A01() {
        A07();
        C211212w r2 = this.A07;
        r2.A01 = false;
        r2.A00 = null;
        r2.A08.A17((String) null, (String) null);
        AnonymousClass01Y r8 = this.A0E;
        r8.A0A();
        this.A0c.A0D(false);
        C16040sK r3 = this.A05;
        r3.A0B();
        C28881Zb r1 = r3.A01;
        if (r1 != null) {
            AnonymousClass12A r0 = this.A0H;
            r0.A00(r1);
            r0.A01(r1, 0, 0);
        }
        Context context = this.A0M.A00;
        File file = new File(context.getFilesDir(), "me");
        if (file.exists()) {
            file.delete();
        }
        r3.A09();
        A0C((String) null, (String) null, (String) null);
        this.A0V.A00();
        Intent A072 = C14750ph.A07(context);
        A072.addFlags(32768);
        A0A(1);
        this.A0l.A05();
        C19220xx r02 = this.A0h;
        r02.A03();
        r02.A05();
        this.A0U.A00 = false;
        this.A0S.A00 = true;
        C40691uX.A09(context);
        C15860rz r6 = this.A0O;
        r6.A0K().putInt("gdrive_successive_backup_failed_count", 0).apply();
        if (r6.A1f() && !r6.A1g()) {
            r6.A0K().putBoolean("encrypted_backup_show_forced_reg_after_logout", true).apply();
        }
        this.A0q.Acl(new RunnableRunnableShape13S0100000_I0_12((Object) this, 29));
        r8.A0B();
        r6.A1S(true);
        this.A0i.A04(false);
        SharedPreferences.Editor A0K2 = r6.A0K();
        A0K2.remove("show_pre_reg_do_not_share_code_warning");
        A0K2.apply();
        SharedPreferences.Editor A0K3 = r6.A0K();
        A0K3.remove("show_post_reg_logged_out_dialog");
        A0K3.apply();
        r6.A0K().putString("contact_qr_code", (String) null).apply();
        r6.A0K().putBoolean("support_ban_appeal_screen_before_verification", false).apply();
        AnonymousClass22O.A03(this.A03, (C15830rv) null);
        return A072;
    }

    public final C007503l A02(String str, String str2, String str3) {
        Context context = this.A0M.A00;
        C007503l A002 = C218415q.A00(context);
        A002.A0J = "critical_app_alerts@1";
        A002.A03 = 1;
        A002.A0B(str3);
        A002.A05(this.A0L.A00());
        A002.A02(3);
        A002.A0D(true);
        A002.A0A(str);
        A002.A09(str2);
        NotificationCompat$BigTextStyle notificationCompat$BigTextStyle = new NotificationCompat$BigTextStyle();
        notificationCompat$BigTextStyle.A09(str2);
        A002.A08(notificationCompat$BigTextStyle);
        A002.A09 = C42341xd.A00(context, 1, C14750ph.A04(context), 0);
        A002.A07.icon = yo.getNIcon(R.drawable.notifybar);
        return A002;
    }

    public void A03() {
        PendingIntent A012 = C42341xd.A01(this.A0M.A00, 0, new Intent("com.obwhatsapp.alarm.REGISTRATION_RETRY").setPackage("com.obwhatsapp"), 536870912);
        if (A012 != null) {
            AlarmManager A042 = this.A0K.A04();
            if (A042 != null) {
                A042.cancel(A012);
            } else {
                Log.w("RegistrationManager/cancelRegistrationRetryAlarm AlarmManager is null");
            }
            A012.cancel();
        }
    }

    public void A04() {
        C16040sK r0 = this.A05;
        Me A012 = r0.A01();
        if (A012 != null) {
            r0.A0A();
            this.A02.A00();
            C19470yU r2 = this.A0a;
            if (r2 instanceof AnonymousClass11B) {
                AnonymousClass11B r22 = (AnonymousClass11B) r2;
                if (r22.A04.A00.A05(C15910s6.A11)) {
                    r22.A05.A01();
                }
            }
            this.A0l.A05();
            AnonymousClass01Y r1 = this.A0E;
            r1.A0B();
            r1.A0N((AnonymousClass273) null);
            this.A0Z.A0E(3, true, false);
            this.A00.post(new RunnableRunnableShape10S0200000_I0_8(this, 17, A012));
            return;
        }
        Log.w("registrationmanager/response/ok already changed?");
    }

    public void A05() {
        this.A0A.A01();
        if (!this.A0j.A01()) {
            Log.i("registrationmanager/loginfailed/ignore as registration not verified");
        } else {
            this.A04.Acq(new RunnableRunnableShape13S0100000_I0_12((Object) this, 30));
        }
    }

    public void A06() {
        C16040sK r1 = this.A05;
        r1.A0B();
        if (r1.A00 != null) {
            Log.i("xmpp/service/reset-registered/updateparams");
            r1.A0B();
            AnonymousClass1ZT r2 = r1.A05;
            C19090xk r12 = this.A0c;
            if (r12.A0z) {
                r12.A05 = r2;
            }
        }
    }

    public void A07() {
        C17020u3 r2 = this.A0g;
        Context context = this.A0M.A00;
        r2.A00(A00(context, "com.obwhatsapp.registration.RegisterPhone")).edit().clear().apply();
        r2.A00(A00(context, "com.obwhatsapp.registration.VerifyPhoneNumber")).edit().clear().apply();
    }

    public void A08() {
        this.A05.A09();
        this.A0O.A0Y();
        C15810rt r1 = this.A0R.A0A;
        synchronized (r1) {
            r1.A0C().clear();
            r1.A00 = false;
        }
        A0A(1);
    }

    public void A09() {
        Log.i("registration-manager/unregister-user-from-device");
        this.A0d.A00();
        this.A0c.A0D(true);
        this.A0e.A0E(true);
        C16040sK r1 = this.A05;
        r1.A09();
        Log.i("memanager/deleteoldme");
        r1.A0B();
        new File(r1.A09.A00.getFilesDir(), "me").delete();
    }

    public void A0A(int i2) {
        if (this.A0P.A00.getInt("registration_state", -1) != i2) {
            AnonymousClass12L r1 = this.A0k;
            r1.A00 = null;
            r1.A01();
            r1.A01 = false;
            r1.A03 = false;
            r1.A04 = false;
            r1.A07 = false;
            r1.A08 = false;
            r1.A05 = false;
            r1.A06 = true;
            this.A0O.A0W();
        }
        this.A0j.A00.A00.edit().putInt("registration_state", i2).apply();
    }

    public void A0B(long j2) {
        if (j2 >= 60000) {
            if (!this.A0J.A02(C42341xd.A01(this.A0M.A00, 0, new Intent("com.obwhatsapp.alarm.REGISTRATION_RETRY").setPackage("com.obwhatsapp"), 134217728), 2, SystemClock.elapsedRealtime() + j2)) {
                Log.w("RegistrationManager/startRegistrationRetryAlarm AlarmManager is null");
            }
        }
    }

    public void A0C(String str, String str2, String str3) {
        C15860rz r0 = this.A0O;
        r0.A0v(str3);
        r0.A19(str, str2);
    }

    public boolean A0D() {
        AnonymousClass124 r3 = this.A0d;
        r3.A00();
        C19090xk r7 = this.A0c;
        r7.A0D(false);
        Log.i("registrationmanager/complete-change-number");
        C15860rz r15 = this.A0O;
        Me me = new Me(r15.A0O(), r15.A0Q(), r15.A0P());
        boolean z2 = false;
        if (me.jabber_id != null) {
            z2 = true;
        }
        Log.a(z2);
        C16040sK r1 = this.A05;
        r1.A0B();
        if (r1.A0H(me, "me")) {
            r1.A0B();
            r1.A0D(me);
            C16900tq r0 = this.A0U;
            r0.A04();
            boolean z3 = r0.A01;
            if (!z3) {
                C19650ym r2 = this.A0T;
                if (r2.A02.A07((C18370wa) null, false)) {
                    Log.i("registration-manager/complete-change-number/msgstoredb/healthy");
                    this.A0R.A07(false);
                    r2.A01();
                }
            }
            A06();
            r7.A04();
            if (!z3) {
                this.A0I.A04();
            }
            A0A(3);
            r15.A1V(new byte[0]);
            this.A0S.A00 = true;
            C16980tz r14 = this.A0M;
            C40691uX.A09(r14.A00);
            Log.i("registration-manager/complete-change-number/changenumber/setregverified");
            this.A0I.A05();
            this.A0f.A01(true, false);
            Log.i("registration-manager/complete-change-number/reinitalized-payments");
            C15900s5 r02 = this.A08;
            synchronized (C15910s6.class) {
                r02.A00.edit().putLong("groups_server_props_last_refresh_time", 0).apply();
            }
            C16320sq r5 = this.A0q;
            r5.Acl(new RunnableRunnableShape13S0100000_I0_12((Object) this, 28));
            new C46602Fc(this.A0L, r14, r15, this.A0X, this.A0Y, this.A0b, r5).A00();
            r3.A00();
            this.A0E.A0B();
            r15.A0i(3);
            r7.A0C((String) null, (String) null, 0, true, false, false, false, false, false);
            return true;
        }
        Log.i("registration-manager/complete-change-number/error-saving");
        return false;
    }

    public boolean A0E() {
        Log.i("registrationmanager/revert-to-old");
        C16040sK r2 = this.A05;
        Me A012 = r2.A01();
        r2.A0B();
        if (!r2.A0H(A012, "me")) {
            return false;
        }
        r2.A0B();
        r2.A0D(A012);
        C15860rz r0 = this.A0O;
        r0.A1L(false);
        r0.A1K(false);
        r2.A0A();
        this.A02.A00();
        C19650ym r22 = this.A0T;
        if (r22.A02.A07((C18370wa) null, false)) {
            Log.i("registrationmanager/revert/msgstoredb/healthy");
            this.A0R.A07(false);
            r22.A01();
            this.A0c.A04();
            this.A0I.A04();
            return true;
        }
        this.A0c.A05();
        return true;
    }

    public boolean A0F() {
        C15860rz r0 = this.A0O;
        Me me = new Me(r0.A0O(), r0.A0Q(), r0.A0P());
        if (me.jabber_id == null) {
            return false;
        }
        C16040sK r02 = this.A05;
        r02.A0B();
        r02.A0D(me);
        C19090xk r1 = this.A0c;
        r1.A0y = false;
        Log.i("registrationmanager/finishRegistration/set-connection/passive");
        A06();
        r1.A04();
        return true;
    }
}
