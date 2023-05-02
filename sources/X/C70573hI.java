package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import com.obwhatsapp.WaFrameLayout;

/* renamed from: X.3hI  reason: invalid class name and case insensitive filesystem */
public class C70573hI extends WaFrameLayout {
    public final TextEmojiLabel A00;

    public C70573hI(Context context) {
        super(context, (AttributeSet) null);
        LayoutInflater.from(context).inflate(R.layout.layout0199, this, true);
        TextEmojiLabel A0Q = C13680ns.A0Q(this, R.id.im_header_title);
        this.A00 = A0Q;
        C30531cW.A02(A0Q);
        A0Q.setAutoLinkMask(0);
        A0Q.setLinksClickable(false);
        A0Q.setFocusable(false);
        A0Q.setClickable(false);
        A0Q.setLongClickable(false);
    }
}
