package androidx.car.app;

import X.AnonymousClass000;
import X.AnonymousClass0AL;
import X.C07100Zv;
import androidx.car.app.IAppManager;

public class AppManager$1 extends IAppManager.Stub {
    public final /* synthetic */ C07100Zv this$0;
    public final /* synthetic */ AnonymousClass0AL val$carContext;

    public static /* synthetic */ Object $r8$lambda$NKkyZSNJIuneEAx2Wz9JePzKUFM(AnonymousClass0AL r0) {
        lambda$onBackPressed$0(r0);
        throw AnonymousClass000.A0Z();
    }

    public static /* synthetic */ Object $r8$lambda$bSiDtEuzdXQrOiLjh2gWLDABVIE(AnonymousClass0AL r0) {
        lambda$stopLocationUpdates$2(r0);
        throw AnonymousClass000.A0Z();
    }

    public static /* synthetic */ Object $r8$lambda$mF3wITa1U124Ftl34lKBHATGd6M(AnonymousClass0AL r0) {
        lambda$startLocationUpdates$1(r0);
        throw AnonymousClass000.A0Z();
    }

    public AppManager$1(C07100Zv r1, AnonymousClass0AL r2) {
        this.this$0 = r1;
        this.val$carContext = r2;
    }

    public static /* synthetic */ Object lambda$onBackPressed$0(AnonymousClass0AL r0) {
        throw AnonymousClass000.A0W("onBackPressed");
    }

    public static /* synthetic */ Object lambda$startLocationUpdates$1(AnonymousClass0AL r0) {
        throw AnonymousClass000.A0W("getCarService");
    }

    public static /* synthetic */ Object lambda$stopLocationUpdates$2(AnonymousClass0AL r0) {
        throw AnonymousClass000.A0W("getCarService");
    }

    public void getTemplate(IOnDoneCallback iOnDoneCallback) {
        throw AnonymousClass000.A0W("getLifecycle");
    }

    public void onBackPressed(IOnDoneCallback iOnDoneCallback) {
        throw AnonymousClass000.A0W("getLifecycle");
    }

    public void startLocationUpdates(IOnDoneCallback iOnDoneCallback) {
        throw AnonymousClass000.A0W("checkSelfPermission");
    }

    public void stopLocationUpdates(IOnDoneCallback iOnDoneCallback) {
        throw AnonymousClass000.A0W("getLifecycle");
    }
}
