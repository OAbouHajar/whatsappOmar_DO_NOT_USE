package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;

/* renamed from: X.5nN  reason: invalid class name and case insensitive filesystem */
public class C114225nN extends C110365dz {
    public AnonymousClass01V A00;
    public C17110uY A01;
    public final ImageButton A02;
    public final ImageView A03;
    public final TextView A04;
    public final AppCompatButton A05;
    public final TextEmojiLabel A06;

    public C114225nN(Context context) {
        super(context);
        View inflate = LayoutInflater.from(context).inflate(getLayoutRes(), this, true);
        this.A04 = C13680ns.A0M(inflate, R.id.nux_title);
        this.A05 = (AppCompatButton) C004601z.A0E(inflate, R.id.nux_cta);
        this.A02 = (ImageButton) C004601z.A0E(inflate, R.id.nux_close);
        this.A03 = C13680ns.A0J(inflate, R.id.nux_icon);
        this.A06 = C13680ns.A0Q(inflate, R.id.nux_description);
    }

    public int getLayoutRes() {
        return R.layout.layout045f;
    }

    public void setCloseButtonOnClickListener(View.OnClickListener onClickListener) {
        this.A02.setOnClickListener(onClickListener);
    }

    public void setCtaButtonOnClickListener(View.OnClickListener onClickListener) {
        this.A05.setOnClickListener(onClickListener);
    }
}
