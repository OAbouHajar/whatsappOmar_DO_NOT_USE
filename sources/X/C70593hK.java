package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import com.obwhatsapp.WaFrameLayout;
import com.obwhatsapp.WaImageView;
import com.obwhatsapp.WaTextView;

/* renamed from: X.3hK  reason: invalid class name and case insensitive filesystem */
public class C70593hK extends WaFrameLayout {
    public final TextEmojiLabel A00 = C13680ns.A0Q(this, R.id.subtitle);
    public final TextEmojiLabel A01 = C13680ns.A0Q(this, R.id.header_title);
    public final WaImageView A02 = C13690nt.A0R(this, R.id.thumbnail);
    public final WaTextView A03 = C13680ns.A0S(this, R.id.surface);

    public C70593hK(Context context) {
        super(context, (AttributeSet) null);
        LayoutInflater.from(context).inflate(R.layout.layout0198, this, true);
    }
}
