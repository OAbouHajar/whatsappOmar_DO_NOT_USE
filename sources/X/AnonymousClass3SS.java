package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import com.whatsapp.jid.UserJid;

/* renamed from: X.3SS  reason: invalid class name */
public class AnonymousClass3SS extends C005602k {
    public UserJid A00;
    public final ImageView A01;
    public final TextView A02;
    public final TextEmojiLabel A03;

    public AnonymousClass3SS(View view) {
        super(view);
        ImageView A0K = C13680ns.A0K(view, R.id.contact_photo);
        this.A01 = A0K;
        A0K.setEnabled(false);
        TextEmojiLabel A0R = C13680ns.A0R(view, R.id.contact_name);
        this.A03 = A0R;
        AnonymousClass1UP.A06(A0R);
        this.A02 = C13680ns.A0M(view, R.id.date_time);
    }
}
