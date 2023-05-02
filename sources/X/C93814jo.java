package X;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import com.obwhatsapp.WaEditText;
import com.obwhatsapp.polls.PollCreatorViewModel;

/* renamed from: X.4jo  reason: invalid class name and case insensitive filesystem */
public class C93814jo implements TextWatcher {
    public final /* synthetic */ AnonymousClass01V A00;
    public final /* synthetic */ C17250um A01;
    public final /* synthetic */ AnonymousClass33q A02;
    public final /* synthetic */ PollCreatorViewModel A03;
    public final /* synthetic */ C17020u3 A04;

    public C93814jo(AnonymousClass01V r1, C17250um r2, AnonymousClass33q r3, PollCreatorViewModel pollCreatorViewModel, C17020u3 r5) {
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
        this.A04 = r5;
        this.A03 = pollCreatorViewModel;
    }

    public void afterTextChanged(Editable editable) {
        WaEditText waEditText = this.A02.A00;
        Context context = waEditText.getContext();
        C17250um r5 = this.A01;
        C45922Bq.A06(context, waEditText.getPaint(), editable, this.A00, r5, this.A04);
        AnonymousClass2Sy.A07(waEditText.getContext(), waEditText.getPaint(), editable, r5, 1.3f);
        this.A03.A09.A00 = editable.toString();
    }

    public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
    }

    public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
    }
}
