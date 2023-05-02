package X;

import android.os.IInterface;
import android.os.RemoteCallbackList;
import androidx.room.MultiInstanceInvalidationService;

/* renamed from: X.0BM  reason: invalid class name */
public final class AnonymousClass0BM extends RemoteCallbackList {
    public final /* synthetic */ MultiInstanceInvalidationService A00;

    public AnonymousClass0BM(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.A00 = multiInstanceInvalidationService;
    }

    public void A00(Object obj) {
        C18450wi.A0H(obj, 1);
        this.A00.A03.remove(obj);
    }

    public /* bridge */ /* synthetic */ void onCallbackDied(IInterface iInterface, Object obj) {
        A00(obj);
    }
}
