package X;

import com.obwhatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentV2ViewModel;
import com.whatsapp.util.Log;
import java.util.Collection;

/* renamed from: X.53I  reason: invalid class name */
public class AnonymousClass53I implements C109505Sk {
    public final /* synthetic */ AnonymousClass3BC A00;

    public AnonymousClass53I(AnonymousClass3BC r1) {
        this.A00 = r1;
    }

    public void ANt() {
        Log.i("CallsHistoryDataSource/onCallLogDeleted");
        C82514Dc r1 = this.A00.A01;
        if (r1 != null) {
            Log.i("CallsHistoryViewModel/onCallLogCleared");
            CallsHistoryFragmentV2ViewModel callsHistoryFragmentV2ViewModel = r1.A00;
            if (callsHistoryFragmentV2ViewModel.A03.size() > 0) {
                callsHistoryFragmentV2ViewModel.A03 = AnonymousClass000.A0u();
            }
            callsHistoryFragmentV2ViewModel.A06();
            callsHistoryFragmentV2ViewModel.A05();
        }
    }

    public void ANu(C37831po r2) {
        Log.i("CallsHistoryDataSource/onCallLogUpdated");
        this.A00.A01();
    }

    public void ANv(Collection collection) {
    }
}
