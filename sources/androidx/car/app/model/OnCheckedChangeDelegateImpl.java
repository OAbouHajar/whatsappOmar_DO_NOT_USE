package androidx.car.app.model;

import X.AnonymousClass000;
import X.AnonymousClass0VJ;
import X.C11700jC;
import X.C11780jK;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.model.IOnCheckedChangeListener;
import com.facebook.redex.IDxHCallShape2S0110000_I1;

public class OnCheckedChangeDelegateImpl implements C11700jC {
    public final IOnCheckedChangeListener mStub = null;

    public class OnCheckedChangeListenerStub extends IOnCheckedChangeListener.Stub {
        public final C11780jK mListener;

        public static /* synthetic */ Object $r8$lambda$ajJY3J__wF0eQzHmi5qujwF7Tbg(OnCheckedChangeListenerStub onCheckedChangeListenerStub, boolean z2) {
            onCheckedChangeListenerStub.lambda$onCheckedChange$0(z2);
            throw AnonymousClass000.A0Z();
        }

        public OnCheckedChangeListenerStub(C11780jK r1) {
            this.mListener = r1;
        }

        private /* synthetic */ Object lambda$onCheckedChange$0(boolean z2) {
            throw AnonymousClass000.A0W("onCheckedChange");
        }

        public void onCheckedChange(boolean z2, IOnDoneCallback iOnDoneCallback) {
            AnonymousClass0VJ.A00(iOnDoneCallback, new IDxHCallShape2S0110000_I1(this, 0, z2), "onCheckedChange");
        }
    }
}
