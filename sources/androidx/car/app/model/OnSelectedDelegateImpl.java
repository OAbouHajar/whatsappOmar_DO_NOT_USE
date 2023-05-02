package androidx.car.app.model;

import X.AnonymousClass000;
import X.AnonymousClass0VJ;
import X.C07120ae;
import X.C11690jB;
import X.C11740jG;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.model.IOnSelectedListener;

public class OnSelectedDelegateImpl implements C11740jG {
    public final IOnSelectedListener mStub = null;

    public class OnSelectedListenerStub extends IOnSelectedListener.Stub {
        public final C11690jB mListener;

        public static /* synthetic */ Object $r8$lambda$fKUdzFllb1AVIyam1QyB6oddRTc(OnSelectedListenerStub onSelectedListenerStub, int i2) {
            onSelectedListenerStub.lambda$onSelected$0(i2);
            throw AnonymousClass000.A0Z();
        }

        public OnSelectedListenerStub(C11690jB r1) {
            this.mListener = r1;
        }

        private /* synthetic */ Object lambda$onSelected$0(int i2) {
            throw AnonymousClass000.A0W("onSelected");
        }

        public void onSelected(int i2, IOnDoneCallback iOnDoneCallback) {
            AnonymousClass0VJ.A00(iOnDoneCallback, new C07120ae(this, i2), "onSelectedListener");
        }
    }
}
