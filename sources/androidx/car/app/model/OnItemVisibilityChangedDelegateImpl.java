package androidx.car.app.model;

import X.AnonymousClass000;
import X.AnonymousClass0VJ;
import X.C07130af;
import X.C11680jA;
import X.C11730jF;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.model.IOnItemVisibilityChangedListener;

public class OnItemVisibilityChangedDelegateImpl implements C11730jF {
    public final IOnItemVisibilityChangedListener mStub = null;

    public class OnItemVisibilityChangedListenerStub extends IOnItemVisibilityChangedListener.Stub {
        public final C11680jA mListener;

        public static /* synthetic */ Object $r8$lambda$L9b2ADhpclS72pxSCs8LEKoinxM(OnItemVisibilityChangedListenerStub onItemVisibilityChangedListenerStub, int i2, int i3) {
            throw AnonymousClass000.A0W("onItemVisibilityChanged");
        }

        public OnItemVisibilityChangedListenerStub(C11680jA r1) {
            this.mListener = r1;
        }

        private /* synthetic */ Object lambda$onItemVisibilityChanged$0(int i2, int i3) {
            throw AnonymousClass000.A0W("onItemVisibilityChanged");
        }

        public void onItemVisibilityChanged(int i2, int i3, IOnDoneCallback iOnDoneCallback) {
            AnonymousClass0VJ.A00(iOnDoneCallback, new C07130af(this, i2, i3), "onItemVisibilityChanged");
        }
    }
}
