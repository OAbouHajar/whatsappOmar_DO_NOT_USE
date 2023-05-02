package X;

import android.text.InputFilter;
import android.view.View;
import com.obwhatsapp.R;
import com.obwhatsapp.WaEditText;
import com.obwhatsapp.WaTextView;
import com.obwhatsapp.polls.PollCreatorViewModel;

/* renamed from: X.33q  reason: invalid class name */
public class AnonymousClass33q extends C64633Rb {
    public final WaEditText A00;
    public final WaTextView A01;

    public AnonymousClass33q(View view, AnonymousClass01V r12, C17250um r13, C14710pd r14, PollCreatorViewModel pollCreatorViewModel, C17020u3 r16) {
        super(view);
        this.A01 = C13680ns.A0S(view, R.id.poll_question_label);
        WaEditText waEditText = (WaEditText) C004601z.A0E(view, R.id.poll_question_edit_text);
        this.A00 = waEditText;
        waEditText.setRawInputType(16385);
        waEditText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(5000), new C93744jh(r14.A03(C16620tM.A02, 1406))});
        waEditText.setOnFocusChangeListener(new C94104kN(view, this));
        waEditText.addTextChangedListener(new C93814jo(r12, r13, this, pollCreatorViewModel, r16));
        waEditText.requestFocus();
    }
}
