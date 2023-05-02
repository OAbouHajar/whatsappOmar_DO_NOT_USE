package androidx.car.app.model;

import X.AnonymousClass000;
import X.AnonymousClass0VJ;
import X.C11660j8;
import X.C11670j9;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.model.IInputCallback;
import com.facebook.redex.IDxHCallShape4S1100000_I1;

public class InputCallbackDelegateImpl implements C11670j9 {
    public final IInputCallback mCallback = null;

    public class OnInputCallbackStub extends IInputCallback.Stub {
        public final C11660j8 mCallback;

        public static /* synthetic */ Object $r8$lambda$eBHPiP8W8cRmVPgNJbI3aEtxKRI(OnInputCallbackStub onInputCallbackStub, String str) {
            onInputCallbackStub.lambda$onInputTextChanged$1(str);
            throw AnonymousClass000.A0Z();
        }

        /* renamed from: $r8$lambda$fXh5ps0gWZC7E28te7-xLK6HzGw  reason: not valid java name */
        public static /* synthetic */ Object m3$r8$lambda$fXh5ps0gWZC7E28te7xLK6HzGw(OnInputCallbackStub onInputCallbackStub, String str) {
            onInputCallbackStub.lambda$onInputSubmitted$0(str);
            throw AnonymousClass000.A0Z();
        }

        public OnInputCallbackStub(C11660j8 r1) {
            this.mCallback = r1;
        }

        private /* synthetic */ Object lambda$onInputSubmitted$0(String str) {
            throw AnonymousClass000.A0W("onInputSubmitted");
        }

        private /* synthetic */ Object lambda$onInputTextChanged$1(String str) {
            throw AnonymousClass000.A0W("onInputTextChanged");
        }

        public void onInputSubmitted(String str, IOnDoneCallback iOnDoneCallback) {
            AnonymousClass0VJ.A00(iOnDoneCallback, new IDxHCallShape4S1100000_I1(1, str, this), "onInputSubmitted");
        }

        public void onInputTextChanged(String str, IOnDoneCallback iOnDoneCallback) {
            AnonymousClass0VJ.A00(iOnDoneCallback, new IDxHCallShape4S1100000_I1(0, str, this), "onInputTextChanged");
        }
    }
}
