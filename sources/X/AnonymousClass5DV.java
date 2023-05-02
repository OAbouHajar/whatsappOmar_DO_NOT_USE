package X;

import android.os.Bundle;
import com.obwhatsapp.calling.callrating.CallRatingActivityV2;
import com.obwhatsapp.calling.callrating.CallRatingBottomSheet;

/* renamed from: X.5DV  reason: invalid class name */
public final class AnonymousClass5DV extends AnonymousClass1DR implements AnonymousClass1DU {
    public final /* synthetic */ CallRatingActivityV2 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5DV(CallRatingActivityV2 callRatingActivityV2) {
        super(0);
        this.this$0 = callRatingActivityV2;
    }

    public /* bridge */ /* synthetic */ Object AIT() {
        Bundle extras = this.this$0.getIntent().getExtras();
        CallRatingBottomSheet callRatingBottomSheet = new CallRatingBottomSheet();
        if (extras != null) {
            callRatingBottomSheet.A0T(extras);
        }
        return callRatingBottomSheet;
    }
}
