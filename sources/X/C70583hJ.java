package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import com.obwhatsapp.WaFrameLayout;
import com.obwhatsapp.WaImageView;

/* renamed from: X.3hJ  reason: invalid class name and case insensitive filesystem */
public class C70583hJ extends WaFrameLayout {
    public final TextEmojiLabel A00 = C13680ns.A0Q(this, R.id.items_count);
    public final TextEmojiLabel A01 = C13680ns.A0Q(this, R.id.header_title);
    public final WaImageView A02 = C13690nt.A0R(this, R.id.thumbnail);

    public C70583hJ(Context context) {
        super(context, (AttributeSet) null);
        LayoutInflater.from(context).inflate(R.layout.layout0197, this, true);
    }
}
