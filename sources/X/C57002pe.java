package X;

import android.content.Context;
import android.text.Spanned;
import android.util.AttributeSet;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.ScrollView;
import com.obwhatsapp.R;
import com.obwhatsapp.WaTextView;
import com.obwhatsapp.components.Button;

/* renamed from: X.2pe  reason: invalid class name and case insensitive filesystem */
public class C57002pe extends ScrollView {
    public final ViewStub A00;
    public final RadioButton A01 = ((RadioButton) C004601z.A0E(this, R.id.only_share_with_button));
    public final RadioButton A02 = ((RadioButton) C004601z.A0E(this, R.id.my_contacts_except_button));
    public final RadioButton A03 = ((RadioButton) C004601z.A0E(this, R.id.my_contacts_button));
    public final WaTextView A04;
    public final WaTextView A05;
    public final WaTextView A06;
    public final WaTextView A07;
    public final Button A08;

    public C57002pe(Context context) {
        super(context, (AttributeSet) null);
        ScrollView.inflate(getContext(), R.layout.layout04d1, this);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2, 80));
        setPadding(0, getResources().getDimensionPixelSize(R.dimen.dimen076c), 0, getResources().getDimensionPixelSize(R.dimen.dimen0765));
        WaTextView A0S = C13680ns.A0S(this, R.id.status_privacy_bottom_sheet_title);
        this.A07 = A0S;
        WaTextView A0S2 = C13680ns.A0S(this, R.id.excluded);
        this.A04 = A0S2;
        WaTextView A0S3 = C13680ns.A0S(this, R.id.included);
        this.A06 = A0S3;
        this.A00 = (ViewStub) C004601z.A0E(this, R.id.status_privacy_stub);
        this.A05 = C13680ns.A0S(this, R.id.footer_text);
        this.A08 = (Button) C004601z.A0E(this, R.id.done_btn);
        AnonymousClass1UP.A06(A0S);
        AnonymousClass1UP.A06(A0S2);
        AnonymousClass1UP.A06(A0S3);
    }

    public final void A00() {
        this.A02.setChecked(false);
        this.A03.setChecked(false);
        this.A01.setChecked(false);
    }

    public void setBottomSheetTitle(String str) {
        this.A07.setText(str);
    }

    public void setFooterText(Spanned spanned) {
        this.A05.setText(spanned);
    }
}
