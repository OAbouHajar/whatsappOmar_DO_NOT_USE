package androidx.car.app;

import X.AnonymousClass000;
import X.AnonymousClass0AL;
import X.C009604p;
import X.C009704q;
import X.C011005f;
import X.C09740g0;
import X.C11630j5;
import androidx.car.app.IOnRequestPermissionsListener;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;

public class CarContext$1 extends IOnRequestPermissionsListener.Stub {
    public final /* synthetic */ AnonymousClass0AL this$0;
    public final /* synthetic */ Executor val$executor;
    public final /* synthetic */ C009704q val$lifecycle;
    public final /* synthetic */ C11630j5 val$listener;

    /* renamed from: $r8$lambda$JkwbRKtcw-K0At_ARcPdE2GdQW0  reason: not valid java name */
    public static /* synthetic */ void m2$r8$lambda$JkwbRKtcwK0At_ARcPdE2GdQW0(C11630j5 r0, List list, List list2) {
        throw AnonymousClass000.A0W("onRequestPermissionsResult");
    }

    public CarContext$1(AnonymousClass0AL r1, C009704q r2, Executor executor, C11630j5 r4) {
        this.this$0 = r1;
        this.val$lifecycle = r2;
        this.val$executor = executor;
        this.val$listener = r4;
    }

    public static /* synthetic */ void lambda$onRequestPermissionsResult$0(C11630j5 r0, List list, List list2) {
        throw AnonymousClass000.A0W("onRequestPermissionsResult");
    }

    public void onRequestPermissionsResult(String[] strArr, String[] strArr2) {
        if (((C009604p) this.val$lifecycle).A02.A00(C011005f.CREATED)) {
            this.val$executor.execute(new C09740g0(Arrays.asList(strArr), Arrays.asList(strArr2)));
        }
    }
}
