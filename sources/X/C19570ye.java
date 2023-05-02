package X;

import android.app.Activity;
import android.app.Application;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.Window;
import com.facebook.redex.RunnableRunnableShape0S0210000_I0;
import com.facebook.redex.RunnableRunnableShape0S1100000_I0;
import com.facebook.redex.RunnableRunnableShape11S0100000_I0_10;
import com.facebook.redex.RunnableRunnableShape1S0100000_I0;
import com.facebook.redex.RunnableRunnableShape3S0100000_I0_2;
import com.facebook.redex.RunnableRunnableShape8S0200000_I0_6;
import com.obwhatsapp.Main;
import com.obwhatsapp.messaging.MessageService;
import com.obwhatsapp.yo.shp;
import com.whatsapp.util.Log;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.0ye  reason: invalid class name and case insensitive filesystem */
public class C19570ye implements Application.ActivityLifecycleCallbacks {
    public int A00;
    public boolean A01;
    public boolean A02 = true;
    public boolean A03;
    public boolean A04;
    public final C24691Gx A05;
    public final C16570tH A06;
    public final C19870z8 A07;
    public final C24651Gt A08;
    public final C18900xR A09;
    public final AnonymousClass15P A0A;
    public final C19080xj A0B;
    public final AnonymousClass01V A0C;
    public final C17080uV A0D;
    public final C14710pd A0E;
    public final C16490t9 A0F;
    public final C24641Gs A0G;
    public final C24681Gw A0H;
    public final AnonymousClass0y1 A0I;
    public final C24631Gr A0J;
    public final C19090xk A0K;
    public final AnonymousClass1DX A0L;
    public final AnonymousClass10F A0M;
    public final C24671Gv A0N;
    public final C19190xu A0O;
    public final AnonymousClass1A4 A0P;
    public final C19160xr A0Q;
    public final C16320sq A0R;

    public C19570ye(C24691Gx r2, C16570tH r3, C19870z8 r4, C24651Gt r5, C18900xR r6, AnonymousClass15P r7, C19080xj r8, AnonymousClass01V r9, C17080uV r10, C14710pd r11, C16490t9 r12, C24641Gs r13, C24681Gw r14, AnonymousClass0y1 r15, C24631Gr r16, C19090xk r17, AnonymousClass1DX r18, AnonymousClass10F r19, C24671Gv r20, C19190xu r21, AnonymousClass1A4 r22, C19160xr r23, C16320sq r24) {
        this.A0E = r11;
        this.A07 = r4;
        this.A0R = r24;
        this.A09 = r6;
        this.A0F = r12;
        this.A0G = r13;
        this.A0A = r7;
        this.A0B = r8;
        this.A0K = r17;
        this.A0M = r19;
        this.A0C = r9;
        this.A0Q = r23;
        this.A0L = r18;
        this.A0O = r21;
        this.A0I = r15;
        this.A0H = r14;
        this.A0N = r20;
        this.A06 = r3;
        this.A08 = r5;
        this.A0J = r16;
        this.A0P = r22;
        this.A0D = r10;
        this.A05 = r2;
        this.A00 = 0;
    }

    public static final void A00(Activity activity, Boolean bool, String str) {
        if (activity instanceof C14580pQ) {
            C14580pQ r2 = (C14580pQ) activity;
            if (r2.A1r() == 78318969) {
                Boolean bool2 = r2.A02;
                if (bool2 == null) {
                    bool2 = Boolean.FALSE;
                }
                if (!bool2.booleanValue()) {
                    return;
                }
                if (bool.booleanValue()) {
                    r2.AKw(str);
                } else {
                    r2.AKv(str);
                }
            }
        }
    }

    public final void A01(Activity activity, String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(activity.getClass().getName());
        sb.append(".on");
        sb.append(str);
        Log.i(sb.toString());
        this.A0D.A02(activity, str2);
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        A01(activity, "Create", "Create");
        if (this.A00 == 0) {
            this.A0M.A08 = true;
        }
        if (activity instanceof C001000l) {
            ((C001000l) activity).AGM().A0T.A01.add(new C010404z(this.A08));
        }
        Window window = activity.getWindow();
        window.setCallback(new AnonymousClass2KZ(window.getCallback(), this.A0Q));
    }

    public void onActivityDestroyed(Activity activity) {
        Activity activity2 = activity;
        A01(activity, "Destroy", "Destroy");
        this.A0J.A00();
        AnonymousClass0y1 r5 = this.A0I;
        StringBuilder sb = new StringBuilder("Activity_");
        sb.append(activity.getClass().getSimpleName());
        sb.append("_");
        sb.append(activity.hashCode());
        String obj = sb.toString();
        ConcurrentHashMap concurrentHashMap = r5.A05;
        if (!concurrentHashMap.containsKey(obj) && ((long) concurrentHashMap.size()) <= 100) {
            concurrentHashMap.put(obj, new C455329e(activity2, obj, r5.A04, SystemClock.elapsedRealtime()));
            r5.A02.Acm(new RunnableRunnableShape11S0100000_I0_10((Object) r5, 7), "MemoryLeakReporter.pruneRefs");
        }
    }

    public void onActivityPaused(Activity activity) {
        if (!(activity instanceof Main)) {
            AnonymousClass10F r2 = this.A0M;
            StringBuilder sb = new StringBuilder("pause_");
            sb.append(activity.getClass());
            r2.A06(sb.toString());
        }
        if (!(activity instanceof AnonymousClass1yP)) {
            this.A0L.A00();
        }
        A01(activity, "Pause", "Pause");
        if (this.A03) {
            this.A0R.Aco(new RunnableRunnableShape0S0210000_I0(this, activity, 0, this.A04));
        }
    }

    public void onActivityPostCreated(Activity activity, Bundle bundle) {
        A00(activity, Boolean.FALSE, "onCreated");
    }

    public void onActivityPostResumed(Activity activity) {
        A00(activity, Boolean.FALSE, "onResumed");
        A00(activity, Boolean.TRUE, "onRendered");
    }

    public void onActivityPostStarted(Activity activity) {
        A00(activity, Boolean.FALSE, "onStarted");
    }

    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        if (activity instanceof C14580pQ) {
            C14580pQ r2 = (C14580pQ) activity;
            if (r2.A1r() == 78318969 && r2.A1t(this.A0E).booleanValue()) {
                C47712Kc r4 = r2.A01;
                r4.A01.A0D(activity.getClass().getSimpleName(), -1);
            }
        }
        A00(activity, Boolean.TRUE, "onCreated");
    }

    public void onActivityPreResumed(Activity activity) {
        A00(activity, Boolean.TRUE, "onResumed");
    }

    public void onActivityPreStarted(Activity activity) {
        A00(activity, Boolean.TRUE, "onStarted");
    }

    public void onActivityResumed(Activity activity) {
        boolean z2;
        A01(activity, "Resume", "Resume");
        if ((activity instanceof C14620pU ? ((C14620pU) activity).AFf() : AnonymousClass01S.A03).A00()) {
            z2 = true;
            if (new Random().nextBoolean()) {
                this.A04 = true;
            } else {
                this.A04 = false;
                this.A03 = true;
                return;
            }
        } else {
            this.A04 = false;
            z2 = false;
        }
        this.A03 = false;
        if (z2) {
            this.A0R.Aco(new RunnableRunnableShape0S0210000_I0(this, activity, 0, z2));
        }
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        A01(activity, "SaveInstanceState", "Save");
    }

    public void onActivityStarted(Activity activity) {
        A01(activity, "Start", "Start");
        if (this.A00 == 0 && !this.A01) {
            Log.i("app-init/application foregrounded");
            MessageService.A01(activity, this.A0P);
            C18900xR r1 = this.A09;
            if (!r1.A03() && !r1.A02()) {
                this.A0K.A0C((String) null, (String) null, 1, true, false, false, false, false, false);
            }
            C19080xj r3 = this.A0B;
            r3.A0G.execute(new RunnableRunnableShape3S0100000_I0_2(r3, 39));
            AnonymousClass15P r0 = this.A0A;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            C15860rz r4 = r0.A03;
            if (elapsedRealtime < ((SharedPreferences) r4.A01.get()).getLong("app_background_time", 0)) {
                r4.A0K().putLong("app_background_time", -1800000).apply();
            }
            C16570tH r12 = this.A06;
            r12.A00 = true;
            for (C19050xg AMW : r12.A01()) {
                AMW.AMW();
            }
        }
        int i2 = this.A00;
        boolean z2 = false;
        if (i2 == 0) {
            z2 = true;
        }
        this.A02 = z2;
        this.A00 = i2 + 1;
        Window window = activity.getWindow();
        Window.Callback callback = window.getCallback();
        if (!(callback instanceof AnonymousClass2KZ)) {
            window.setCallback(new AnonymousClass2KZ(callback, this.A0Q));
        }
        AnonymousClass15P r32 = this.A0A;
        if (!r32.A03()) {
            C15860rz r13 = r32.A03;
            if (r13.A1h()) {
                Log.i("AppAuthManager/resetAppAuthSettingIfNecessary: no biometrics enrolled and setting was enabled");
                r13.A0K().putBoolean("privacy_fingerprint_enabled", false).apply();
                shp.setFingerprintEnabled(false);
                r32.A02(false);
            }
        }
    }

    public void onActivityStopped(Activity activity) {
        AnonymousClass2KW r9;
        Activity activity2 = activity;
        A01(activity2, "Stop", "Stop");
        boolean isChangingConfigurations = activity2.isChangingConfigurations();
        this.A01 = isChangingConfigurations;
        int i2 = this.A00 - 1;
        this.A00 = i2;
        if (i2 == 0 && !isChangingConfigurations) {
            C17080uV r4 = this.A0D;
            r4.A03.execute(new RunnableRunnableShape0S1100000_I0(31, "App backgrounded", r4));
            Log.i("app-init/application backgrounded");
            AnonymousClass10F r1 = this.A0M;
            r1.A06("app_session_ended");
            r1.A08 = false;
            C24681Gw r42 = this.A0H;
            r42.A05.Acl(new RunnableRunnableShape8S0200000_I0_6(r42, 37, this.A0C));
            if (!"com.obwhatsapp.authentication.AppAuthenticationActivity".equals(activity2.getClass().getName())) {
                AnonymousClass15P r3 = this.A0A;
                C15860rz r43 = r3.A03;
                if (!((SharedPreferences) r43.A01.get()).getBoolean("fingerprint_authentication_needed", false)) {
                    Log.i("AppAuthManager/onApplicationBackground");
                    r3.A02(true);
                    r43.A0K().putLong("app_background_time", SystemClock.elapsedRealtime()).apply();
                }
            }
            C24671Gv r10 = this.A0N;
            if ((r10.A03() || r10.A05.AJC(689639794)) && (r9 = r10.A00) != null) {
                if (r9.A02) {
                    Map map = r9.A06;
                    for (Map.Entry entry : map.entrySet()) {
                        C47722Kd r7 = new C47722Kd();
                        AnonymousClass2KY r11 = (AnonymousClass2KY) entry.getValue();
                        r7.A03 = Long.valueOf(r11.A03);
                        r7.A02 = (Integer) entry.getKey();
                        long j2 = r11.A03;
                        if (j2 > 0) {
                            double d2 = (double) j2;
                            r7.A00 = Double.valueOf((r11.A01 * 60000.0d) / d2);
                            r7.A01 = Double.valueOf((r11.A00 * 60000.0d) / d2);
                        }
                        r9.A04.A06(r7);
                    }
                    map.clear();
                }
                r10.A01 = Boolean.FALSE;
                r10.A00 = null;
            }
            C19080xj r32 = this.A0B;
            r32.A0G.execute(new RunnableRunnableShape3S0100000_I0_2(r32, 38));
            List<C47732Ke> list = (List) this.A05.A00.get(0);
            if (list != null) {
                for (C47732Ke r0 : list) {
                    C15140qO r33 = r0.A00;
                    ((C27301Rf) r33.A02).AC5(C47742Kf.CONCURRENT).execute(new RunnableRunnableShape1S0100000_I0((Object) r33, 3));
                }
            }
            C16570tH r12 = this.A06;
            r12.A00 = false;
            for (C19050xg AMV : r12.A01()) {
                AMV.AMV();
            }
            this.A02 = true;
        }
    }
}
