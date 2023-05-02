package androidx.car.app.model;

import X.AnonymousClass000;
import X.AnonymousClass0VJ;
import X.C11750jH;
import X.C11760jI;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.model.ISearchCallback;
import com.facebook.redex.IDxHCallShape4S1100000_I1;

public class SearchCallbackDelegateImpl implements C11750jH {
    public final ISearchCallback mStubCallback = null;

    public class SearchCallbackStub extends ISearchCallback.Stub {
        public final C11760jI mCallback;

        public static /* synthetic */ Object $r8$lambda$7_1W9_T5a2DIwVbigN8QKwBUMDg(SearchCallbackStub searchCallbackStub, String str) {
            searchCallbackStub.lambda$onSearchSubmitted$1(str);
            throw AnonymousClass000.A0Z();
        }

        /* renamed from: $r8$lambda$lWaS-liOrYxg3ODag2RALLEM1OQ  reason: not valid java name */
        public static /* synthetic */ Object m4$r8$lambda$lWaSliOrYxg3ODag2RALLEM1OQ(SearchCallbackStub searchCallbackStub, String str) {
            searchCallbackStub.lambda$onSearchTextChanged$0(str);
            throw AnonymousClass000.A0Z();
        }

        public SearchCallbackStub(C11760jI r1) {
            this.mCallback = r1;
        }

        private /* synthetic */ Object lambda$onSearchSubmitted$1(String str) {
            throw AnonymousClass000.A0W("onSearchSubmitted");
        }

        private /* synthetic */ Object lambda$onSearchTextChanged$0(String str) {
            throw AnonymousClass000.A0W("onSearchTextChanged");
        }

        public void onSearchSubmitted(String str, IOnDoneCallback iOnDoneCallback) {
            AnonymousClass0VJ.A00(iOnDoneCallback, new IDxHCallShape4S1100000_I1(2, str, this), "onSearchSubmitted");
        }

        public void onSearchTextChanged(String str, IOnDoneCallback iOnDoneCallback) {
            AnonymousClass0VJ.A00(iOnDoneCallback, new IDxHCallShape4S1100000_I1(3, str, this), "onSearchTextChanged");
        }
    }
}
