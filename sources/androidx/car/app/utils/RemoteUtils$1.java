package androidx.car.app.utils;

import X.AnonymousClass000;
import X.AnonymousClass0Y7;
import X.C11620j4;
import androidx.car.app.IOnDoneCallback;

public class RemoteUtils$1 extends IOnDoneCallback.Stub {
    public final /* synthetic */ C11620j4 val$callback;

    public RemoteUtils$1(C11620j4 r1) {
        this.val$callback = r1;
    }

    public void onFailure(AnonymousClass0Y7 r2) {
        throw AnonymousClass000.A0W("onFailure");
    }

    public void onSuccess(AnonymousClass0Y7 r2) {
        throw AnonymousClass000.A0W("onSuccess");
    }
}
