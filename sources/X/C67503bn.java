package X;

import android.content.Context;
import com.obwhatsapp.calling.callrating.viewmodel.CallRatingViewModel;

/* renamed from: X.3bn  reason: invalid class name and case insensitive filesystem */
public final class C67503bn extends C57012pj {
    public final CallRatingViewModel A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C67503bn(Context context, CallRatingViewModel callRatingViewModel, int i2) {
        super(context, i2);
        C18450wi.A0H(callRatingViewModel, 3);
        this.A00 = callRatingViewModel;
    }

    public void cancel() {
        this.A00.A08.A0B(C72943mz.A00);
    }
}
