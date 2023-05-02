package X;

import android.text.Editable;
import android.widget.EditText;
import android.widget.TextView;
import com.obwhatsapp.calling.callrating.CallRatingActivity;

/* renamed from: X.3yB  reason: invalid class name and case insensitive filesystem */
public class C78503yB extends AnonymousClass35O {
    public final /* synthetic */ CallRatingActivity A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C78503yB(EditText editText, CallRatingActivity callRatingActivity, AnonymousClass01V r13, AnonymousClass013 r14, C17250um r15, C17020u3 r16) {
        super(editText, (TextView) null, r13, r14, r15, r16, 1024, 0, false);
        this.A00 = callRatingActivity;
    }

    public void afterTextChanged(Editable editable) {
        super.afterTextChanged(editable);
        this.A00.A2B();
    }
}
