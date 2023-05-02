package X;

import android.app.Activity;
import android.text.InputFilter;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageButton;
import android.widget.TextView;
import com.facebook.redex.IDxAListenerShape211S0100000_2_I0;
import com.facebook.redex.IDxCListenerShape203S0100000_2_I0;
import com.facebook.redex.IDxEListenerShape200S0100000_2_I0;
import com.facebook.redex.IDxLListenerShape144S0100000_2_I0;
import com.facebook.redex.RunnableRunnableShape10S0100000_I0_9;
import com.obwhatsapp.R;
import com.obwhatsapp.emoji.search.EmojiSearchContainer;
import com.obwhatsapp.mentions.MentionableEntry;

/* renamed from: X.2A5  reason: invalid class name */
public class AnonymousClass2A5 {
    public final View A00;
    public final View A01;
    public final ViewTreeObserver.OnGlobalLayoutListener A02;
    public final ImageButton A03;
    public final AnonymousClass5RN A04;
    public final AnonymousClass2JH A05;
    public final AnonymousClass29I A06;
    public final MentionableEntry A07;
    public final C23061Ai A08;

    public AnonymousClass2A5(Activity activity, View view, C16300so r34, AnonymousClass01V r35, C15860rz r36, AnonymousClass013 r37, C15810rt r38, C206711d r39, C17250um r40, AnonymousClass1BQ r41, C14710pd r42, C15830rv r43, C17020u3 r44, C23061Ai r45) {
        IDxCListenerShape203S0100000_2_I0 iDxCListenerShape203S0100000_2_I0 = new IDxCListenerShape203S0100000_2_I0(this, 6);
        this.A04 = iDxCListenerShape203S0100000_2_I0;
        IDxLListenerShape144S0100000_2_I0 iDxLListenerShape144S0100000_2_I0 = new IDxLListenerShape144S0100000_2_I0(this, 18);
        this.A02 = iDxLListenerShape144S0100000_2_I0;
        View view2 = view;
        this.A01 = view2;
        C23061Ai r4 = r45;
        this.A08 = r4;
        this.A00 = view2.findViewById(R.id.emoji_btn_holder);
        MentionableEntry mentionableEntry = (MentionableEntry) view2.findViewById(R.id.comment);
        this.A07 = mentionableEntry;
        mentionableEntry.setInputEnterAction(6);
        mentionableEntry.setFilters(new InputFilter[]{new C93744jh(1024)});
        mentionableEntry.setOnEditorActionListener(new IDxAListenerShape211S0100000_2_I0(this, 1));
        C17020u3 r20 = r44;
        AnonymousClass01V r13 = r35;
        AnonymousClass013 r15 = r37;
        C17250um r17 = r40;
        mentionableEntry.addTextChangedListener(new AnonymousClass35O(mentionableEntry, (TextView) view2.findViewById(R.id.counter), r13, r15, r17, r20, 1024, 30, true));
        C15830rv r6 = r43;
        if (C16030sJ.A0L(r6) && !r38.A0H(r6)) {
            mentionableEntry.A0D((ViewGroup) C004601z.A0E(view2, R.id.mention_attach), C16050sL.A03(r6), false, true, true);
        }
        ImageButton imageButton = (ImageButton) view2.findViewById(R.id.emoji_picker_btn);
        this.A03 = imageButton;
        Activity activity2 = activity;
        C206711d r16 = r39;
        AnonymousClass2JH r7 = new AnonymousClass2JH(activity2, imageButton, r34, (C15430qs) activity2.findViewById(R.id.main), mentionableEntry, r13, r36, r15, r16, r17, r41, r42, r20, r4);
        this.A05 = r7;
        AnonymousClass29I r9 = new AnonymousClass29I(activity2, r15, r7, r16, r17, (EmojiSearchContainer) view2.findViewById(R.id.emoji_search_container), r20);
        this.A06 = r9;
        r9.A00 = new IDxEListenerShape200S0100000_2_I0(this, 4);
        r7.A0C(iDxCListenerShape203S0100000_2_I0);
        r7.A0E = new RunnableRunnableShape10S0100000_I0_9((Object) this, 21);
        view2.getViewTreeObserver().addOnGlobalLayoutListener(iDxLListenerShape144S0100000_2_I0);
    }
}
