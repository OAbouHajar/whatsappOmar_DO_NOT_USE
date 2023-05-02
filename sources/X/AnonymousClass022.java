package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Build;
import androidx.work.impl.WorkDatabase;
import com.obwhatsapp.R;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: X.022  reason: invalid class name */
public class AnonymousClass022 {
    public static AnonymousClass022 A0B;
    public static AnonymousClass022 A0C;
    public static final Object A0D = new Object();
    public BroadcastReceiver.PendingResult A00;
    public Context A01;
    public AnonymousClass0Pz A02;
    public C08080d0 A03;
    public WorkDatabase A04;
    public AnonymousClass0NW A05;
    public AnonymousClass04d A06;
    public List A07;
    public boolean A08;
    public final AnonymousClass0U8 A09;
    public volatile C03970Kp A0A;

    static {
        C06530Wm.A01("WorkManagerImpl");
    }

    public AnonymousClass022(Context context, AnonymousClass0Pz r12, AnonymousClass04d r13) {
        Context context2 = context;
        AnonymousClass04d r8 = r13;
        WorkDatabase A002 = A00(context.getApplicationContext(), ((C08190dE) r8).A01, context.getResources().getBoolean(R.bool.notification_main_column_padding_top));
        Context applicationContext = context.getApplicationContext();
        AnonymousClass0Pz r6 = r12;
        C06530Wm r1 = new C06530Wm(r12.A00);
        synchronized (C06530Wm.A01) {
            C06530Wm.A02 = r1;
        }
        AnonymousClass0U8 r3 = new AnonymousClass0U8(applicationContext, r13);
        this.A09 = r3;
        List asList = Arrays.asList(new C13220lf[]{C06310Vf.A00(applicationContext, this), new C08100d3(applicationContext, r12, this, r3)});
        C08080d0 r4 = new C08080d0(context2, r6, A002, r8, asList);
        Context applicationContext2 = context.getApplicationContext();
        this.A01 = applicationContext2;
        this.A02 = r12;
        this.A06 = r13;
        this.A04 = A002;
        this.A07 = asList;
        this.A03 = r4;
        this.A05 = new AnonymousClass0NW(A002);
        this.A08 = false;
        if (Build.VERSION.SDK_INT < 24 || !AnonymousClass0MJ.A00(applicationContext2)) {
            this.A06.A8p(new C10610hP(applicationContext2, this));
            return;
        }
        throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
    }

    public static final WorkDatabase A00(Context context, Executor executor, boolean z2) {
        AnonymousClass0Qe A002;
        C18450wi.A0H(context, 0);
        C18450wi.A0H(executor, 1);
        if (z2) {
            A002 = new AnonymousClass0Qe(context, (String) null);
            A002.A08 = true;
        } else {
            A002 = C05740Su.A00(context);
            A002.A01 = new C07720cM(context);
        }
        A002.A05 = executor;
        A002.A0D.add(AnonymousClass0TA.A00);
        A002.A01(AnonymousClass0G5.A00);
        A002.A01(new AnonymousClass0G0(context, 2, 3));
        A002.A01(AnonymousClass0G6.A00);
        A002.A01(AnonymousClass0G7.A00);
        A002.A01(new AnonymousClass0G0(context, 5, 6));
        A002.A01(AnonymousClass0G8.A00);
        A002.A01(AnonymousClass0G9.A00);
        A002.A01(AnonymousClass0GA.A00);
        A002.A01(new AnonymousClass0G1(context));
        A002.A01(new AnonymousClass0G0(context, 10, 11));
        A002.A01(AnonymousClass0G2.A00);
        A002.A01(AnonymousClass0G3.A00);
        A002.A01(AnonymousClass0G4.A00);
        A002.A09 = false;
        A002.A07 = true;
        return (WorkDatabase) A002.A00();
    }

    public static AnonymousClass022 A01(Context context) {
        AnonymousClass022 r0;
        synchronized (A0D) {
            try {
                r0 = A0C;
                if (r0 == null && (r0 = A0B) == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext instanceof AnonymousClass005) {
                        AnonymousClass0Pz workManagerConfiguration = ((AnonymousClass005) applicationContext).getWorkManagerConfiguration();
                        if (A0C == null) {
                            Context applicationContext2 = applicationContext.getApplicationContext();
                            AnonymousClass022 r1 = A0B;
                            if (r1 == null) {
                                r1 = new AnonymousClass022(applicationContext2, workManagerConfiguration, new C08190dE(workManagerConfiguration.A06));
                                A0B = r1;
                            }
                            A0C = r1;
                        } else if (A0B != null) {
                            throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                        }
                        r0 = A01(applicationContext);
                    } else {
                        th = new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                        throw th;
                    }
                }
            } catch (Throwable th) {
                th = th;
            }
        }
        return r0;
    }

    public final AnonymousClass04Q A02(AnonymousClass03z r7, AnonymousClass043 r8, String str) {
        List singletonList = Collections.singletonList(r8);
        if (!singletonList.isEmpty()) {
            return new AnonymousClass04Q(r7, this, str, singletonList, (List) null);
        }
        throw new IllegalArgumentException("beginUniqueWork needs at least one OneTimeWorkRequest.");
    }

    public C29981bY A03() {
        C10520hG r1 = new C10520hG(this);
        ((C08190dE) this.A06).A01.execute(r1);
        return r1.A00();
    }

    public void A04() {
        synchronized (A0D) {
            this.A08 = true;
            BroadcastReceiver.PendingResult pendingResult = this.A00;
            if (pendingResult != null) {
                pendingResult.finish();
                this.A00 = null;
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public void A05() {
        if (Build.VERSION.SDK_INT >= 23) {
            AnonymousClass0d2.A03(this.A01);
        }
        WorkDatabase workDatabase = this.A04;
        C08170dC r0 = (C08170dC) workDatabase.A0J();
        AnonymousClass0SM r3 = r0.A01;
        r3.A09();
        C05450Rm r2 = r0.A08;
        C13500mT A002 = r2.A00();
        r3.A0A();
        try {
            ((AnonymousClass0GC) A002).A00.executeUpdateDelete();
            r3.A0C();
            r3.A0B();
            r2.A03(A002);
            C06310Vf.A01(this.A02, workDatabase, this.A07);
        } catch (Throwable th) {
            r3.A0B();
            r2.A03(A002);
            throw th;
        }
    }

    public void A06(AnonymousClass03z r7, AnonymousClass043 r8, String str) {
        AnonymousClass03z r1 = r7;
        new AnonymousClass04Q(r1, this, str, Collections.singletonList(r8), (List) null).A03();
    }

    public final void A07(AnonymousClass03k r7) {
        List singletonList = Collections.singletonList(r7);
        if (!singletonList.isEmpty()) {
            new AnonymousClass04Q(AnonymousClass03z.KEEP, this, (String) null, singletonList, (List) null).A03();
            return;
        }
        throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
    }

    public void A08(AnonymousClass0NV r4) {
        this.A06.A8p(new C10580hM(r4, this, false));
    }

    public void A09(String str) {
        this.A06.A8p(new AnonymousClass0H5(this, str));
    }

    public void A0A(String str) {
        this.A06.A8p(new AnonymousClass0H6(this, str, true));
    }
}
