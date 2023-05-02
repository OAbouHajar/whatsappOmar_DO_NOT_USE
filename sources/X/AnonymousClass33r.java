package X;

import android.text.InputFilter;
import android.text.TextUtils;
import android.view.View;
import com.obwhatsapp.R;
import com.obwhatsapp.WaEditText;
import com.obwhatsapp.polls.PollCreatorViewModel;

/* renamed from: X.33r  reason: invalid class name */
public class AnonymousClass33r extends C64633Rb {
    public int A00 = -1;
    public final WaEditText A01;
    public final AnonymousClass01V A02;
    public final C33741j5 A03;
    public final C33741j5 A04;

    public AnonymousClass33r(View view, AnonymousClass01V r14, AnonymousClass013 r15, C17250um r16, C14710pd r17, PollCreatorViewModel pollCreatorViewModel, C17020u3 r19) {
        super(view);
        this.A02 = r14;
        this.A03 = C33741j5.A00(view, R.id.duplicated_option);
        this.A04 = C33741j5.A00(view, R.id.max_option_text_view);
        WaEditText waEditText = (WaEditText) C004601z.A0E(view, R.id.poll_option_edit_text);
        this.A01 = waEditText;
        waEditText.setRawInputType(16385);
        C14710pd r8 = r17;
        PollCreatorViewModel pollCreatorViewModel2 = pollCreatorViewModel;
        waEditText.setOnFocusChangeListener(new C62263Ct(r8, this, pollCreatorViewModel2));
        waEditText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(2500), new C93744jh(r8.A03(C16620tM.A02, 1407))});
        AnonymousClass2JP.A04(waEditText, R.string.str12d4);
        waEditText.addTextChangedListener(new AnonymousClass35N(r14, r15, r16, r8, this, pollCreatorViewModel2, r19));
    }

    public void A07(C77753wU r7, boolean z2, boolean z3, boolean z4) {
        this.A00 = r7.A00;
        String str = r7.A00;
        WaEditText waEditText = this.A01;
        if (waEditText.getText() != null && !TextUtils.equals(C13680ns.A0f(waEditText), str)) {
            waEditText.setText(str);
        }
        if (z4) {
            View view = this.A0H;
            AnonymousClass2JP.A00(view.getContext(), this.A02, view.getContext().getString(R.string.str12dc));
            this.A04.A03(0);
        } else {
            this.A04.A03(8);
            waEditText.setSelection(str.length());
        }
        if (z3) {
            waEditText.requestFocus();
            waEditText.setSelection(str.length());
        } else {
            waEditText.clearFocus();
        }
        this.A03.A03(C13680ns.A02(z2 ? 1 : 0));
    }
}
