package X;

import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import com.obwhatsapp.R;

/* renamed from: X.3S2  reason: invalid class name */
public class AnonymousClass3S2 extends C005602k {
    public final CheckBox A00;
    public final TextView A01;

    public AnonymousClass3S2(View view) {
        super(view);
        this.A01 = C13680ns.A0L(view, R.id.media_section);
        CheckBox checkBox = (CheckBox) C004601z.A0E(view, R.id.media_select_all_checkbox);
        this.A00 = checkBox;
        checkBox.setText(view.getResources().getText(R.string.str14c1));
        checkBox.setOnCheckedChangeListener(new C94714lM());
    }
}
