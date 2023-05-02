package X;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.IDxIDecorationShape5S0101000_2_I1;
import com.facebook.redex.IDxSListenerShape438S0100000_2_I1;
import com.facebook.redex.IDxTListenerShape32S0000000_2_I1;
import com.obwhatsapp.InterceptingEditText;
import com.obwhatsapp.R;
import com.obwhatsapp.emoji.search.EmojiSearchContainer;
import com.whatsapp.util.ViewOnClickCListenerShape0S0200000_I0;
import com.whatsapp.util.ViewOnClickCListenerShape1S0100000_I0_1;

/* renamed from: X.38w  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C614338w {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ AnonymousClass013 A01;
    public final /* synthetic */ AnonymousClass2JH A02;
    public final /* synthetic */ C206711d A03;
    public final /* synthetic */ C17250um A04;
    public final /* synthetic */ EmojiSearchContainer A05;
    public final /* synthetic */ AnonymousClass29I A06;
    public final /* synthetic */ C17020u3 A07;

    public /* synthetic */ C614338w(Activity activity, AnonymousClass013 r2, AnonymousClass2JH r3, C206711d r4, C17250um r5, EmojiSearchContainer emojiSearchContainer, AnonymousClass29I r7, C17020u3 r8) {
        this.A06 = r7;
        this.A02 = r3;
        this.A05 = emojiSearchContainer;
        this.A00 = activity;
        this.A04 = r5;
        this.A03 = r4;
        this.A01 = r2;
        this.A07 = r8;
    }

    public final void A00(AnonymousClass1BQ r13) {
        AnonymousClass29I r6 = this.A06;
        AnonymousClass2JH r4 = this.A02;
        EmojiSearchContainer emojiSearchContainer = this.A05;
        Activity activity = this.A00;
        C17250um r7 = this.A04;
        C206711d r2 = this.A03;
        AnonymousClass013 r5 = this.A01;
        C17020u3 r1 = this.A07;
        r4.A08(r4.A0K);
        r4.A0C = r6;
        IDxSListenerShape438S0100000_2_I1 iDxSListenerShape438S0100000_2_I1 = new IDxSListenerShape438S0100000_2_I1(r6, 1);
        emojiSearchContainer.A00 = activity;
        emojiSearchContainer.A07 = r7;
        emojiSearchContainer.A05 = r5;
        emojiSearchContainer.A06 = r2;
        emojiSearchContainer.A09 = r13;
        emojiSearchContainer.A0A = iDxSListenerShape438S0100000_2_I1;
        emojiSearchContainer.A0B = r1;
        if (!emojiSearchContainer.A0E) {
            emojiSearchContainer.A0E = true;
            activity.getLayoutInflater().inflate(R.layout.layout0253, emojiSearchContainer, true);
            emojiSearchContainer.A02 = emojiSearchContainer.findViewById(R.id.no_results);
            emojiSearchContainer.A03 = (RecyclerView) emojiSearchContainer.findViewById(R.id.search_result);
            emojiSearchContainer.A03.A0m(new IDxIDecorationShape5S0101000_2_I1(emojiSearchContainer, emojiSearchContainer.getResources().getDimensionPixelSize(R.dimen.dimen06e2), 1));
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
            linearLayoutManager.A1P(0);
            emojiSearchContainer.A03.setLayoutManager(linearLayoutManager);
            emojiSearchContainer.A01 = emojiSearchContainer.findViewById(R.id.progress_container);
            InterceptingEditText interceptingEditText = (InterceptingEditText) emojiSearchContainer.findViewById(R.id.search_bar);
            emojiSearchContainer.A04 = interceptingEditText;
            interceptingEditText.setHint(activity.getString(R.string.str0783));
            View findViewById = emojiSearchContainer.findViewById(R.id.clear_search_btn);
            findViewById.setOnClickListener(new ViewOnClickCListenerShape1S0100000_I0_1(emojiSearchContainer, 39));
            emojiSearchContainer.setOnTouchListener(new IDxTListenerShape32S0000000_2_I1(1));
            InterceptingEditText interceptingEditText2 = emojiSearchContainer.A04;
            interceptingEditText2.A00 = new C99904um(r6);
            interceptingEditText2.addTextChangedListener(new C48592Ob(findViewById, emojiSearchContainer));
            emojiSearchContainer.findViewById(R.id.back).setOnClickListener(new ViewOnClickCListenerShape0S0200000_I0(r6, 19, emojiSearchContainer));
            C447725m.A01(emojiSearchContainer.getContext(), C13680ns.A0K(emojiSearchContainer, R.id.back), r5, R.drawable.ic_emoji_search_back);
        }
        emojiSearchContainer.setVisibility(0);
        emojiSearchContainer.A02.setVisibility(0);
        emojiSearchContainer.A01.setVisibility(8);
        C57552rM r42 = new C57552rM(emojiSearchContainer.A00, emojiSearchContainer.A05, emojiSearchContainer.A07, emojiSearchContainer, new IDxSListenerShape438S0100000_2_I1(emojiSearchContainer, 0), emojiSearchContainer.A0B, emojiSearchContainer.getResources().getDimensionPixelSize(R.dimen.dimen035b));
        emojiSearchContainer.A08 = r42;
        emojiSearchContainer.A03.setAdapter(r42);
        emojiSearchContainer.A0D = "";
        emojiSearchContainer.A00("");
        emojiSearchContainer.A04.setText("");
        emojiSearchContainer.A04.requestFocus();
        emojiSearchContainer.A04.A04(false);
        emojiSearchContainer.A04.performAccessibilityAction(64, (Bundle) null);
    }
}
