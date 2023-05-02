package androidx.car.app.navigation.model;

import X.AnonymousClass000;
import X.AnonymousClass0VJ;
import X.C11810jN;
import X.C11820jO;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.navigation.model.IPanModeListener;
import com.facebook.redex.IDxHCallShape2S0110000_I1;

public class PanModeDelegateImpl implements C11810jN {
    public final IPanModeListener mStub = null;

    public class PanModeListenerStub extends IPanModeListener.Stub {
        public final C11820jO mListener;

        public static /* synthetic */ Object $r8$lambda$LqYy1vRrRropiFqxnLxOFkdo8I0(PanModeListenerStub panModeListenerStub, boolean z2) {
            panModeListenerStub.lambda$onPanModeChanged$0(z2);
            throw AnonymousClass000.A0Z();
        }

        public PanModeListenerStub(C11820jO r1) {
            this.mListener = r1;
        }

        private /* synthetic */ Object lambda$onPanModeChanged$0(boolean z2) {
            throw AnonymousClass000.A0W("onPanModeChanged");
        }

        public void onPanModeChanged(boolean z2, IOnDoneCallback iOnDoneCallback) {
            AnonymousClass0VJ.A00(iOnDoneCallback, new IDxHCallShape2S0110000_I1(this, 1, z2), "onPanModeChanged");
        }
    }
}
