package X;

import android.view.View;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.obwhatsapp.R;
import com.obwhatsapp.WaTextView;

/* renamed from: X.3SG  reason: invalid class name */
public final class AnonymousClass3SG extends C005602k {
    public final AppCompatCheckBox A00;
    public final WaTextView A01;
    public final /* synthetic */ C64583Qw A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3SG(View view, C64583Qw r3) {
        super(view);
        this.A02 = r3;
        this.A00 = (AppCompatCheckBox) C18450wi.A00(view, R.id.problem_check_box);
        this.A01 = (WaTextView) C18450wi.A00(view, R.id.user_problem_text);
    }
}
