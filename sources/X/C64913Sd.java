package X;

import android.view.View;
import androidx.appcompat.widget.AppCompatRadioButton;
import com.obwhatsapp.R;
import com.obwhatsapp.WaEditText;
import com.obwhatsapp.WaTextView;

/* renamed from: X.3Sd  reason: invalid class name and case insensitive filesystem */
public final class C64913Sd extends C005602k {
    public AnonymousClass35O A00;
    public C41651wK A01;
    public final AppCompatRadioButton A02;
    public final WaEditText A03;
    public final WaTextView A04;
    public final AnonymousClass01V A05;
    public final AnonymousClass013 A06;
    public final C17250um A07;
    public final C17020u3 A08;

    public C64913Sd(View view, AnonymousClass01V r3, AnonymousClass013 r4, C17250um r5, C17020u3 r6) {
        super(view);
        this.A07 = r5;
        this.A05 = r3;
        this.A06 = r4;
        this.A08 = r6;
        this.A04 = (WaTextView) AnonymousClass3K4.A0L(view, R.id.counter);
        this.A03 = (WaEditText) AnonymousClass3K4.A0L(view, R.id.text);
        this.A02 = (AppCompatRadioButton) AnonymousClass3K4.A0L(view, R.id.reason);
    }
}
