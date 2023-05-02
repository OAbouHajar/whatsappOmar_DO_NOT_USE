package X;

import android.content.Context;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import com.facebook.redex.IDxCListenerShape242S0100000_3_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.emoji.search.EmojiSearchContainer;
import com.obwhatsapp.gifsearch.GifSearchContainer;
import com.obwhatsapp.mentions.MentionableEntry;
import com.obwhatsapp.text.IDxWAdapterShape104S0100000_3_I1;
import com.whatsapp.stickers.StickerView;

/* renamed from: X.62e  reason: invalid class name and case insensitive filesystem */
public class C1205762e implements AnonymousClass5Si {
    public View.OnFocusChangeListener A00;
    public View A01;
    public View A02;
    public ImageButton A03;
    public ImageButton A04;
    public LinearLayout A05;
    public LinearLayout A06;
    public EmojiSearchContainer A07;
    public GifSearchContainer A08;
    public MentionableEntry A09;
    public C1205562c A0A;
    public C34151jm A0B;
    public StickerView A0C;
    public Integer A0D;
    public final Context A0E;
    public final TextWatcher A0F = new IDxWAdapterShape104S0100000_3_I1(this, 2);
    public final AnonymousClass01V A0G;
    public final AnonymousClass013 A0H;
    public final C17250um A0I;
    public final C14710pd A0J;
    public final C17020u3 A0K;
    public final AnonymousClass1MF A0L;

    public C1205762e(Context context, AnonymousClass01V r4, AnonymousClass013 r5, C17250um r6, C14710pd r7, C1205562c r8, C17020u3 r9, AnonymousClass1MF r10) {
        this.A0E = context;
        this.A0J = r7;
        this.A0I = r6;
        this.A0G = r4;
        this.A0H = r5;
        this.A0L = r10;
        this.A0K = r9;
        this.A0A = r8;
    }

    public void A00(C34151jm r13, Integer num) {
        this.A06.setVisibility(0);
        AnonymousClass1MF r3 = this.A0L;
        StickerView stickerView = this.A0C;
        Context context = this.A0E;
        r3.A04(stickerView, r13, new AnonymousClass62W(this, r13, num), 1, context.getResources().getDimensionPixelSize(R.dimen.dimen05e5), context.getResources().getDimensionPixelSize(R.dimen.dimen05e4), true, false);
    }

    public /* bridge */ /* synthetic */ void A5O(Object obj) {
        this.A09.setText((String) obj);
    }

    public int AD5() {
        return R.layout.layout0559;
    }

    public void AZf(View view) {
        this.A05 = C110115dX.A05(view, R.id.input_layout_content);
        this.A04 = (ImageButton) C004601z.A0E(view, R.id.emoji_picker_btn);
        this.A09 = (MentionableEntry) C004601z.A0E(view, R.id.send_payment_note);
        this.A02 = C004601z.A0E(view, R.id.text_entry_layout);
        this.A08 = (GifSearchContainer) C004601z.A0E(view, R.id.gif_search_container);
        this.A07 = (EmojiSearchContainer) C004601z.A0E(view, R.id.emoji_search_container);
        if (this.A0J.A0C(811)) {
            LinearLayout A052 = C110115dX.A05(view, R.id.sticker_preview_layout);
            this.A06 = A052;
            this.A0C = (StickerView) C004601z.A0E(A052, R.id.sticker_preview);
            this.A03 = (ImageButton) C004601z.A0E(this.A06, R.id.sticker_remove_cta);
        }
        ViewStub viewStub = (ViewStub) view.findViewById(R.id.payment_entry_action_stub);
        if (viewStub != null) {
            C811947f.A00(viewStub, this.A0A);
        } else {
            this.A0A.AZf(C004601z.A0E(view, R.id.payment_entry_action_inflated));
        }
        this.A01 = C004601z.A0E(view, R.id.payment_entry_action_inflated);
        this.A09.addTextChangedListener(this.A0F);
        this.A09.setHint(view.getContext().getString(R.string.str14f8));
        this.A09.setFilters(new InputFilter[]{new InputFilter.LengthFilter(1024)});
        this.A09.setOnFocusChangeListener(new IDxCListenerShape242S0100000_3_I1(this, 2));
        C17250um r6 = this.A0I;
        this.A09.addTextChangedListener(new AnonymousClass35O(this.A09, C13680ns.A0L(view, R.id.counter), this.A0G, this.A0H, r6, this.A0K, 1024, 30, true));
    }
}
