package androidx.car.app.model;

import X.AnonymousClass0VJ;
import X.C11710jD;
import X.C11720jE;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.model.IOnClickListener;
import com.facebook.redex.IDxHCallShape351S0100000_I1;

public class OnClickDelegateImpl implements C11710jD {
    public final boolean mIsParkedOnly = false;
    public final IOnClickListener mListener = null;

    public class OnClickListenerStub extends IOnClickListener.Stub {
        public final C11720jE mOnClickListener;

        public static /* synthetic */ Object $r8$lambda$hBurHfjgoNp7dYb5RG4AbNHxQG4(OnClickListenerStub onClickListenerStub) {
            return null;
        }

        public OnClickListenerStub(C11720jE r1) {
            this.mOnClickListener = r1;
        }

        private /* synthetic */ Object lambda$onClick$0() {
            return null;
        }

        public void onClick(IOnDoneCallback iOnDoneCallback) {
            AnonymousClass0VJ.A00(iOnDoneCallback, new IDxHCallShape351S0100000_I1(this, 0), "onClick");
        }
    }
}
