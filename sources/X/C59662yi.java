package X;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import com.whatsapp.jid.UserJid;
import java.util.Date;

/* renamed from: X.2yi  reason: invalid class name and case insensitive filesystem */
public abstract class C59662yi extends C65123Sy {
    public final int A00;
    public final int A01;
    public final int A02;
    public final FrameLayout A03;
    public final ImageView A04;
    public final TextView A05;
    public final TextEmojiLabel A06;
    public final TextEmojiLabel A07;
    public final AnonymousClass4D4 A08;
    public final C50262Yq A09;
    public final C32191fn A0A;
    public final AnonymousClass013 A0B;
    public final UserJid A0C;
    public final Date A0D = new Date();

    public C59662yi(View view, AnonymousClass4D4 r3, C50262Yq r4, C32191fn r5, AnonymousClass013 r6, UserJid userJid) {
        super(view);
        this.A0C = userJid;
        this.A0B = r6;
        this.A03 = (FrameLayout) view.findViewById(R.id.catalog_item_view);
        this.A04 = C13680ns.A0K(view, R.id.catalog_list_product_image);
        TextEmojiLabel A0R = C13680ns.A0R(view, R.id.catalog_list_product_title);
        this.A07 = A0R;
        this.A02 = A0R.getTextColors().getDefaultColor();
        TextView A0M = C13680ns.A0M(view, R.id.catalog_list_product_price);
        this.A05 = A0M;
        this.A01 = A0M.getTextColors().getDefaultColor();
        TextEmojiLabel A0R2 = C13680ns.A0R(view, R.id.catalog_list_product_description);
        this.A06 = A0R2;
        this.A00 = A0R2.getTextColors().getDefaultColor();
        this.A09 = r4;
        this.A0A = r5;
        this.A08 = r3;
    }
}
