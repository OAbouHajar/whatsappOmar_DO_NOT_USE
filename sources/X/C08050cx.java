package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.0cx  reason: invalid class name and case insensitive filesystem */
public class C08050cx implements C12580kd {
    public static final String A04 = C06530Wm.A01("CommandHandler");
    public final Context A00;
    public final AnonymousClass0Rl A01;
    public final Object A02 = new Object();
    public final Map A03 = AnonymousClass000.A0x();

    public C08050cx(Context context, AnonymousClass0Rl r3) {
        this.A00 = context;
        this.A01 = r3;
    }

    public static void A00(Intent intent, AnonymousClass0R5 r3) {
        intent.putExtra("KEY_WORKSPEC_ID", r3.A01);
        intent.putExtra("KEY_WORKSPEC_GENERATION", r3.A00);
    }

    public void A01(Intent intent, C08060cy r13, int i2) {
        List<AnonymousClass0NV> list;
        String action = intent.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            C06530Wm.A00().A02(A04, AnonymousClass000.A0g("Handling constraints changed ", intent));
            Context context = this.A00;
            AnonymousClass022 r1 = r13.A05;
            AnonymousClass0d6 r5 = new AnonymousClass0d6((C13110lU) null, r1.A09);
            List<C007303i> AFj = r1.A04.A0J().AFj();
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = false;
            boolean z5 = false;
            for (C007303i r0 : AFj) {
                AnonymousClass042 r12 = r0.A0A;
                z2 |= r12.A04;
                z3 |= r12.A05;
                z4 |= r12.A07;
                boolean z6 = false;
                if (r12.A02 != AnonymousClass041.NOT_REQUIRED) {
                    z6 = true;
                }
                z5 |= z6;
                if (z2 && z3 && z4 && z5) {
                    break;
                }
            }
            Intent intent2 = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
            intent2.setComponent(new ComponentName(context, ConstraintProxyUpdateReceiver.class));
            intent2.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z2).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z3).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z4).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z5);
            context.sendBroadcast(intent2);
            r5.Ac9(AFj);
            ArrayList A0w = AnonymousClass000.A0w(AFj);
            long currentTimeMillis = System.currentTimeMillis();
            for (C007303i r4 : AFj) {
                String str = r4.A0J;
                if (currentTimeMillis >= r4.A02() && (!r4.A03() || r5.A00(str))) {
                    A0w.add(r4);
                }
            }
            Iterator it = A0w.iterator();
            while (it.hasNext()) {
                C007303i r02 = (C007303i) it.next();
                String str2 = r02.A0J;
                AnonymousClass0R5 A002 = AnonymousClass0MO.A00(r02);
                Intent intent3 = new Intent(context, SystemAlarmService.class);
                intent3.setAction("ACTION_DELAY_MET");
                A00(intent3, A002);
                C06530Wm A003 = C06530Wm.A00();
                String str3 = C04450Mp.A00;
                StringBuilder A0r = AnonymousClass000.A0r("Creating a delay_met command for workSpec with id (");
                A0r.append(str2);
                A003.A02(str3, AnonymousClass000.A0h(")", A0r));
                C10330gx.A00(intent3, r13, ((C08190dE) r13.A08).A02, i2);
            }
            r5.reset();
        } else if ("ACTION_RESCHEDULE".equals(action)) {
            C06530Wm A004 = C06530Wm.A00();
            String str4 = A04;
            StringBuilder A0r2 = AnonymousClass000.A0r("Handling reschedule ");
            AnonymousClass000.A1H(intent, A0r2);
            A004.A02(str4, AnonymousClass000.A0l(A0r2, i2));
            r13.A05.A05();
        } else {
            Bundle extras = intent.getExtras();
            String[] strArr = {"KEY_WORKSPEC_ID"};
            if (extras == null || extras.isEmpty() || extras.get(strArr[0]) == null) {
                C06530Wm.A00();
                String str5 = A04;
                StringBuilder A0r3 = AnonymousClass000.A0r("Invalid request for ");
                A0r3.append(action);
                A0r3.append(" , requires ");
                A0r3.append("KEY_WORKSPEC_ID");
                Log.e(str5, AnonymousClass000.A0h(" .", A0r3));
            } else if ("ACTION_SCHEDULE_WORK".equals(action)) {
                AnonymousClass0R5 r7 = new AnonymousClass0R5(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_WORKSPEC_GENERATION", 0));
                C06530Wm A005 = C06530Wm.A00();
                String str6 = A04;
                A005.A02(str6, AnonymousClass000.A0g("Handling schedule work for ", r7));
                WorkDatabase workDatabase = r13.A05.A04;
                workDatabase.A0A();
                try {
                    C007303i AH8 = workDatabase.A0J().AH8(r7.A01);
                    if (AH8 == null) {
                        C06530Wm.A00();
                        StringBuilder A0q = AnonymousClass000.A0q("Skipping scheduling ");
                        A0q.append(r7);
                        Log.w(str6, AnonymousClass000.A0h(" because it's no longer in the DB", A0q));
                    } else if (AH8.A0E.A00()) {
                        C06530Wm.A00();
                        StringBuilder A0q2 = AnonymousClass000.A0q("Skipping scheduling ");
                        A0q2.append(r7);
                        Log.w(str6, AnonymousClass000.A0h("because it is finished.", A0q2));
                    } else {
                        long A022 = AH8.A02();
                        if (!AH8.A03()) {
                            C06530Wm A006 = C06530Wm.A00();
                            StringBuilder A0o = AnonymousClass000.A0o();
                            AnonymousClass000.A1F(r7, "Setting up Alarms for ", "at ", A0o);
                            A0o.append(A022);
                            A006.A02(str6, A0o.toString());
                            AnonymousClass0Wc.A00(this.A00, workDatabase, r7, A022);
                        } else {
                            C06530Wm A007 = C06530Wm.A00();
                            StringBuilder A0o2 = AnonymousClass000.A0o();
                            AnonymousClass000.A1F(r7, "Opportunistically setting an alarm for ", "at ", A0o2);
                            A0o2.append(A022);
                            A007.A02(str6, A0o2.toString());
                            Context context2 = this.A00;
                            AnonymousClass0Wc.A00(context2, workDatabase, r7, A022);
                            Intent intent4 = new Intent(context2, SystemAlarmService.class);
                            intent4.setAction("ACTION_CONSTRAINTS_CHANGED");
                            C10330gx.A00(intent4, r13, ((C08190dE) r13.A08).A02, i2);
                        }
                        workDatabase.A0C();
                    }
                } finally {
                    workDatabase.A0B();
                }
            } else if ("ACTION_DELAY_MET".equals(action)) {
                synchronized (this.A02) {
                    AnonymousClass0R5 r52 = new AnonymousClass0R5(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_WORKSPEC_GENERATION", 0));
                    C06530Wm A008 = C06530Wm.A00();
                    String str7 = A04;
                    A008.A02(str7, AnonymousClass000.A0e(r52, "Handing delay met for ", AnonymousClass000.A0o()));
                    Map map = this.A03;
                    if (!map.containsKey(r52)) {
                        AnonymousClass0d5 r42 = new AnonymousClass0d5(this.A00, this.A01.A01(r52), r13, i2);
                        map.put(r52, r42);
                        String str8 = r42.A08.A01;
                        Context context3 = r42.A04;
                        StringBuilder A0q3 = AnonymousClass000.A0q(str8);
                        A0q3.append(" (");
                        A0q3.append(r42.A03);
                        r42.A01 = AnonymousClass0TC.A00(context3, AnonymousClass000.A0h(")", A0q3));
                        C06530Wm A009 = C06530Wm.A00();
                        String str9 = AnonymousClass0d5.A0C;
                        StringBuilder A0r4 = AnonymousClass000.A0r("Acquiring wakelock ");
                        A0r4.append(r42.A01);
                        A0r4.append("for WorkSpec ");
                        A009.A02(str9, AnonymousClass000.A0h(str8, A0r4));
                        r42.A01.acquire();
                        C007303i AH82 = r42.A06.A05.A04.A0J().AH8(str8);
                        if (AH82 == null) {
                            r42.A0B.execute(new C09570fj(r42));
                        } else {
                            boolean A032 = AH82.A03();
                            r42.A02 = A032;
                            if (!A032) {
                                C06530Wm.A00().A02(str9, AnonymousClass000.A0h(str8, AnonymousClass000.A0r("No constraints for ")));
                                r42.AMN(Collections.singletonList(AH82));
                            } else {
                                r42.A07.Ac9(Collections.singletonList(AH82));
                            }
                        }
                    } else {
                        C06530Wm A0010 = C06530Wm.A00();
                        StringBuilder A0o3 = AnonymousClass000.A0o();
                        A0o3.append("WorkSpec ");
                        A0o3.append(r52);
                        A0010.A02(str7, AnonymousClass000.A0h(" is is already being handled for ACTION_DELAY_MET", A0o3));
                    }
                }
            } else if ("ACTION_STOP_WORK".equals(action)) {
                Bundle extras2 = intent.getExtras();
                String string = extras2.getString("KEY_WORKSPEC_ID");
                if (extras2.containsKey("KEY_WORKSPEC_GENERATION")) {
                    int i3 = extras2.getInt("KEY_WORKSPEC_GENERATION");
                    ArrayList arrayList = new ArrayList(1);
                    AnonymousClass0NV A0011 = this.A01.A00(new AnonymousClass0R5(string, i3));
                    list = arrayList;
                    if (A0011 != null) {
                        arrayList.add(A0011);
                        list = arrayList;
                    }
                } else {
                    list = this.A01.A02(string);
                }
                for (AnonymousClass0NV r3 : list) {
                    C06530Wm.A00().A02(A04, AnonymousClass000.A0h(string, AnonymousClass000.A0r("Handing stopWork work for ")));
                    AnonymousClass022 r03 = r13.A05;
                    r03.A08(r3);
                    Context context4 = this.A00;
                    WorkDatabase workDatabase2 = r03.A04;
                    AnonymousClass0R5 r9 = r3.A00;
                    C13140lX A0G = workDatabase2.A0G();
                    AnonymousClass0RF AGO = A0G.AGO(r9);
                    if (AGO != null) {
                        AnonymousClass0Wc.A01(context4, r9, AGO.A01);
                        C06530Wm A0012 = C06530Wm.A00();
                        String str10 = AnonymousClass0Wc.A00;
                        StringBuilder A0r5 = AnonymousClass000.A0r("Removing SystemIdInfo for workSpecId (");
                        A0r5.append(r9);
                        A0012.A02(str10, AnonymousClass000.A0h(")", A0r5));
                        String str11 = r9.A01;
                        int i4 = r9.A00;
                        C08140d9 r43 = (C08140d9) A0G;
                        AnonymousClass0SM r53 = r43.A01;
                        r53.A09();
                        C05450Rm r44 = r43.A02;
                        C13500mT A0013 = r44.A00();
                        A0013.A5S(1, str11);
                        A0013.A5Q(2, (long) i4);
                        r53.A0A();
                        try {
                            AnonymousClass0GC.A00(r53, A0013);
                        } finally {
                            r53.A0B();
                            r44.A03(A0013);
                        }
                    }
                    r13.AQm(r9, false);
                }
            } else if ("ACTION_EXECUTION_COMPLETED".equals(action)) {
                AnonymousClass0R5 r45 = new AnonymousClass0R5(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_WORKSPEC_GENERATION", 0));
                boolean z7 = intent.getExtras().getBoolean("KEY_NEEDS_RESCHEDULE");
                C06530Wm A0014 = C06530Wm.A00();
                String str12 = A04;
                StringBuilder A0r6 = AnonymousClass000.A0r("Handling onExecutionCompleted ");
                AnonymousClass000.A1H(intent, A0r6);
                A0014.A02(str12, AnonymousClass000.A0l(A0r6, i2));
                AQm(r45, z7);
            } else {
                C06530Wm.A00();
                Log.w(A04, AnonymousClass000.A0g("Ignoring intent ", intent));
            }
        }
    }

    public void AQm(AnonymousClass0R5 r7, boolean z2) {
        synchronized (this.A02) {
            AnonymousClass0d5 r5 = (AnonymousClass0d5) this.A03.remove(r7);
            this.A01.A00(r7);
            if (r5 != null) {
                C06530Wm A002 = C06530Wm.A00();
                String str = AnonymousClass0d5.A0C;
                StringBuilder A0r = AnonymousClass000.A0r("onExecuted ");
                AnonymousClass0R5 r2 = r5.A08;
                AnonymousClass000.A1H(r2, A0r);
                A0r.append(z2);
                A002.A02(str, A0r.toString());
                r5.A00();
                if (z2) {
                    Intent intent = new Intent(r5.A04, SystemAlarmService.class);
                    intent.setAction("ACTION_SCHEDULE_WORK");
                    A00(intent, r2);
                    C10330gx.A00(intent, r5.A06, r5.A0A, r5.A03);
                }
                if (r5.A02) {
                    Intent intent2 = new Intent(r5.A04, SystemAlarmService.class);
                    intent2.setAction("ACTION_CONSTRAINTS_CHANGED");
                    C10330gx.A00(intent2, r5.A06, r5.A0A, r5.A03);
                }
            }
        }
    }
}
