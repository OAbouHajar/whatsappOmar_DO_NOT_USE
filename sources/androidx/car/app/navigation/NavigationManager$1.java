package androidx.car.app.navigation;

import X.AnonymousClass000;
import X.AnonymousClass0T5;
import X.C009704q;
import X.C07110Zw;
import X.C10390h3;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.navigation.INavigationManager;
import com.facebook.redex.IDxHCallShape351S0100000_I1;

public class NavigationManager$1 extends INavigationManager.Stub {
    public final /* synthetic */ C07110Zw this$0;
    public final /* synthetic */ C009704q val$lifecycle;

    public static /* synthetic */ Object $r8$lambda$RsBMa_HbLu0DtZV9bYmvxrUt9U4(NavigationManager$1 navigationManager$1) {
        navigationManager$1.lambda$onStopNavigation$0();
        throw AnonymousClass000.A0Z();
    }

    public NavigationManager$1(C07110Zw r1, C009704q r2) {
        this.this$0 = r1;
        this.val$lifecycle = r2;
    }

    private /* synthetic */ Object lambda$onStopNavigation$0() {
        throw AnonymousClass000.A0W("onStopNavigation");
    }

    public void onStopNavigation(IOnDoneCallback iOnDoneCallback) {
        AnonymousClass0T5.A00(new C10390h3(iOnDoneCallback, new IDxHCallShape351S0100000_I1(this, 1), this.val$lifecycle, "onStopNavigation"));
    }
}
