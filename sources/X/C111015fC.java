package X;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatRadioButton;
import com.obwhatsapp.R;
import com.obwhatsapp.WaImageView;

/* renamed from: X.5fC  reason: invalid class name and case insensitive filesystem */
public class C111015fC extends C005602k {
    public View A00;
    public TextView A01;
    public TextView A02;
    public AppCompatRadioButton A03;
    public AppCompatRadioButton A04;
    public WaImageView A05;
    public final /* synthetic */ C110825et A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C111015fC(View view, C110825et r4) {
        super(view);
        this.A06 = r4;
        View view2 = this.A0H;
        this.A05 = (WaImageView) view2.findViewById(R.id.image);
        this.A03 = (AppCompatRadioButton) view2.findViewById(R.id.radio);
        this.A02 = C13680ns.A0M(view2, R.id.title);
        this.A01 = C13680ns.A0M(view2, R.id.description);
        this.A04 = (AppCompatRadioButton) view2.findViewById(R.id.right_radio);
        this.A00 = view2.findViewById(R.id.divider);
        this.A03.setClickable(false);
        this.A04.setClickable(false);
    }
}
