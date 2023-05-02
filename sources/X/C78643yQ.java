package X;

import android.view.View;
import android.widget.AdapterView;
import com.obwhatsapp.calling.callhistory.CallsHistoryFragment;
import com.whatsapp.util.Log;

/* renamed from: X.3yQ  reason: invalid class name and case insensitive filesystem */
public class C78643yQ extends C94694lK {
    public final /* synthetic */ CallsHistoryFragment A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C78643yQ(CallsHistoryFragment callsHistoryFragment, C16440t3 r2) {
        super(r2);
        this.A00 = callsHistoryFragment;
    }

    public void A00(AdapterView adapterView, View view, int i2, long j2) {
        AnonymousClass4QA r2 = (AnonymousClass4QA) view.getTag();
        if (r2 == null) {
            Log.e("voip/CallsFragment/onItemClick/empty");
        } else {
            this.A00.A1K(r2.A00, r2);
        }
    }

    public void onItemClick(AdapterView adapterView, View view, int i2, long j2) {
        if (this.A00.A03 == null) {
            super.onItemClick(adapterView, view, i2, j2);
        } else {
            A00(adapterView, view, i2, j2);
        }
    }
}
