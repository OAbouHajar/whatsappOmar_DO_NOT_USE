package androidx.work.impl.workers;

import X.AnonymousClass000;
import X.AnonymousClass022;
import X.AnonymousClass02O;
import X.AnonymousClass02P;
import X.AnonymousClass0H9;
import X.AnonymousClass0UL;
import X.AnonymousClass0d6;
import X.AnonymousClass1JB;
import X.C007303i;
import X.C02890Gc;
import X.C06340Vi;
import X.C06530Wm;
import X.C09600fm;
import X.C10080gY;
import X.C13110lU;
import X.C13360lu;
import X.C18450wi;
import X.C29981bY;
import android.content.Context;
import android.util.Log;
import androidx.work.WorkerParameters;
import java.util.List;
import java.util.UUID;

public final class ConstraintTrackingWorker extends AnonymousClass02O implements C13110lU {
    public AnonymousClass02O A00;
    public final WorkerParameters A01;
    public final AnonymousClass0H9 A02 = AnonymousClass0H9.A00();
    public final Object A03 = new Object();
    public volatile boolean A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C18450wi.A0H(context, 1);
        C18450wi.A0H(workerParameters, 2);
        this.A01 = workerParameters;
    }

    public static final void A00(ConstraintTrackingWorker constraintTrackingWorker, C29981bY r3) {
        synchronized (constraintTrackingWorker.A03) {
            if (constraintTrackingWorker.A04) {
                constraintTrackingWorker.A02.A09(new AnonymousClass02P());
            } else {
                constraintTrackingWorker.A02.A08(r3);
            }
        }
    }

    public C29981bY A02() {
        this.A01.A09.execute(new C09600fm(this));
        return this.A02;
    }

    public void A03() {
        AnonymousClass02O r1 = this.A00;
        if (r1 != null && !r1.A03) {
            r1.A03 = true;
            r1.A03();
        }
    }

    public final void A04() {
        AnonymousClass0H9 r5 = this.A02;
        if (!r5.isCancelled()) {
            WorkerParameters workerParameters = this.A01;
            String A032 = workerParameters.A01.A03("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
            C06530Wm A002 = C06530Wm.A00();
            C18450wi.A0B(A002);
            if (A032 == null || A032.length() == 0) {
                Log.e(C06340Vi.A00, "No worker to delegate to.");
            } else {
                AnonymousClass0UL r2 = workerParameters.A04;
                Context context = this.A00;
                AnonymousClass02O A003 = r2.A00(context, this.A01, A032);
                this.A00 = A003;
                if (A003 == null) {
                    A002.A02(C06340Vi.A00, "No worker to delegate to.");
                } else {
                    AnonymousClass022 A012 = AnonymousClass022.A01(context);
                    C18450wi.A0B(A012);
                    C13360lu A0J = A012.A04.A0J();
                    UUID uuid = workerParameters.A08;
                    String obj = uuid.toString();
                    C18450wi.A0B(obj);
                    C007303i AH8 = A0J.AH8(obj);
                    if (AH8 != null) {
                        AnonymousClass0d6 r1 = new AnonymousClass0d6(this, A012.A09);
                        r1.Ac9(AnonymousClass1JB.A0V(AH8));
                        String obj2 = uuid.toString();
                        C18450wi.A0B(obj2);
                        boolean A004 = r1.A00(obj2);
                        String str = C06340Vi.A00;
                        if (A004) {
                            A002.A02(str, AnonymousClass000.A0h(A032, AnonymousClass000.A0r("Constraints met for delegate ")));
                            try {
                                AnonymousClass02O r0 = this.A00;
                                C18450wi.A0F(r0);
                                C29981bY A022 = r0.A02();
                                C18450wi.A0B(A022);
                                A022.A4b(new C10080gY(this, A022), workerParameters.A09);
                                return;
                            } catch (Throwable th) {
                                StringBuilder A0r = AnonymousClass000.A0r("Delegated worker ");
                                A0r.append(A032);
                                String A0h = AnonymousClass000.A0h(" threw exception in startWork.", A0r);
                                if (A002.A00 <= 3) {
                                    Log.d(str, A0h, th);
                                }
                                synchronized (this.A03) {
                                    if (this.A04) {
                                        A002.A02(str, "Constraints were unmet, Retrying.");
                                        r5.A09(new AnonymousClass02P());
                                    } else {
                                        r5.A09(new C02890Gc());
                                    }
                                    return;
                                }
                            }
                        } else {
                            StringBuilder A0r2 = AnonymousClass000.A0r("Constraints not met for delegate ");
                            A0r2.append(A032);
                            A002.A02(str, AnonymousClass000.A0h(". Requesting retry.", A0r2));
                            r5.A09(new AnonymousClass02P());
                            return;
                        }
                    }
                }
            }
            r5.A09(new C02890Gc());
        }
    }

    public void AMN(List list) {
    }

    public void AMO(List list) {
        C06530Wm.A00().A02(C06340Vi.A00, AnonymousClass000.A0g("Constraints changed for ", list));
        synchronized (this.A03) {
            this.A04 = true;
        }
    }
}
