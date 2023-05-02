package X;

import android.text.Editable;
import android.widget.TextView;
import com.obwhatsapp.WaEditText;
import com.obwhatsapp.calling.callrating.viewmodel.CallRatingViewModel;

/* renamed from: X.3yC  reason: invalid class name and case insensitive filesystem */
public final class C78513yC extends AnonymousClass35O {
    public final /* synthetic */ WaEditText A00;
    public final /* synthetic */ CallRatingViewModel A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C78513yC(WaEditText waEditText, CallRatingViewModel callRatingViewModel, AnonymousClass01V r13, AnonymousClass013 r14, C17250um r15, C17020u3 r16) {
        super(waEditText, (TextView) null, r13, r14, r15, r16, 1024, 0, false);
        this.A00 = waEditText;
        this.A01 = callRatingViewModel;
    }

    public void afterTextChanged(Editable editable) {
        C18450wi.A0H(editable, 0);
        super.afterTextChanged(editable);
        CallRatingViewModel callRatingViewModel = this.A01;
        String obj = C008603x.A04(editable.toString()).toString();
        C18450wi.A0H(obj, 0);
        callRatingViewModel.A06 = obj;
        AnonymousClass425 r3 = AnonymousClass425.PROBLEM_OTHER;
        boolean z2 = true;
        if (obj.codePointCount(0, obj.length()) < 3) {
            z2 = false;
        }
        callRatingViewModel.A05(r3, z2);
    }
}
