package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import com.obwhatsapp.WaFrameLayout;
import com.obwhatsapp.WaImageView;

/* renamed from: X.3hL  reason: invalid class name and case insensitive filesystem */
public class C70603hL extends WaFrameLayout {
    public final View A00 = C004601z.A0E(this, R.id.status_container);
    public final View A01 = C004601z.A0E(this, R.id.title_quantity_container);
    public final TextEmojiLabel A02 = C13680ns.A0Q(this, R.id.total_price);
    public final TextEmojiLabel A03 = C13680ns.A0Q(this, R.id.quantity);
    public final TextEmojiLabel A04 = C13680ns.A0Q(this, R.id.order_recipient);
    public final TextEmojiLabel A05 = C13680ns.A0Q(this, R.id.reference_id);
    public final TextEmojiLabel A06 = C13680ns.A0Q(this, R.id.order_status);
    public final TextEmojiLabel A07 = C13680ns.A0Q(this, R.id.header_title);
    public final WaImageView A08 = C13690nt.A0R(this, R.id.currency_icon);
    public final WaImageView A09 = C13690nt.A0R(this, R.id.thumbnail);

    public C70603hL(Context context) {
        super(context, (AttributeSet) null);
        LayoutInflater.from(context).inflate(R.layout.layout0196, this, true);
    }
}
