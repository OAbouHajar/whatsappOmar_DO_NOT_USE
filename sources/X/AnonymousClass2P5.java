package X;

import android.app.Activity;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageButton;
import android.widget.TextView;
import com.facebook.redex.IDxAListenerShape211S0100000_2_I0;
import com.facebook.redex.IDxCListenerShape203S0100000_2_I0;
import com.facebook.redex.IDxEListenerShape200S0100000_2_I0;
import com.facebook.redex.IDxLListenerShape144S0100000_2_I0;
import com.facebook.redex.RunnableRunnableShape16S0100000_I0_15;
import com.obwhatsapp.R;
import com.obwhatsapp.emoji.search.EmojiSearchContainer;
import com.obwhatsapp.mentions.MentionableEntry;
import com.obwhatsapp.yo.Conversation;
import com.whatsapp.jid.GroupJid;
import java.util.List;

/* renamed from: X.2P5  reason: invalid class name */
public class AnonymousClass2P5 {
    public final View A00;
    public final ViewTreeObserver.OnGlobalLayoutListener A01;
    public final AnonymousClass5RN A02;
    public final AnonymousClass2JH A03;
    public final AnonymousClass29I A04;
    public final MentionableEntry A05;
    public final C23061Ai A06;

    public AnonymousClass2P5(Activity activity, View view, C16300so r36, AnonymousClass01V r37, C15860rz r38, AnonymousClass013 r39, C15810rt r40, C16010sH r41, C206711d r42, C17250um r43, AnonymousClass1BQ r44, C14710pd r45, C17020u3 r46, C23061Ai r47, String str, List list) {
        IDxCListenerShape203S0100000_2_I0 iDxCListenerShape203S0100000_2_I0 = new IDxCListenerShape203S0100000_2_I0(this, 13);
        this.A02 = iDxCListenerShape203S0100000_2_I0;
        IDxLListenerShape144S0100000_2_I0 iDxLListenerShape144S0100000_2_I0 = new IDxLListenerShape144S0100000_2_I0(this, 33);
        this.A01 = iDxLListenerShape144S0100000_2_I0;
        View view2 = view;
        this.A00 = view2;
        C23061Ai r0 = r47;
        this.A06 = r0;
        MentionableEntry mentionableEntry = (MentionableEntry) C004601z.A0E(view2, R.id.caption);
        this.A05 = mentionableEntry;
        mentionableEntry.setInputEnterAction(6);
        mentionableEntry.setFilters(new InputFilter[]{new C93744jh(1024)});
        mentionableEntry.setOnEditorActionListener(new IDxAListenerShape211S0100000_2_I0(this, 7));
        C17020u3 r20 = r46;
        AnonymousClass01V r13 = r37;
        AnonymousClass013 r15 = r39;
        C17250um r17 = r43;
        mentionableEntry.addTextChangedListener(new AnonymousClass35O(mentionableEntry, (TextView) view2.findViewById(R.id.counter), r13, r15, r17, r20, 1024, 30, true));
        C14710pd r6 = r45;
        C16010sH r9 = r41;
        if (r41 != null && r9.A0J()) {
            C15830rv r7 = r9.A0E;
            if ((r7 instanceof GroupJid) && !r40.A0H(r7)) {
                mentionableEntry.A04 = view2;
                mentionableEntry.A0D((ViewGroup) C004601z.A0E(view2, R.id.mention_attach), (C16050sL) r9.A08(C16050sL.class), r6.A0E(C16620tM.A01, 815), false, false);
            }
        }
        String str2 = str;
        if (!TextUtils.isEmpty(str2)) {
            mentionableEntry.setMentionableText(str2, list);
        }
        ImageButton imageButton = (ImageButton) view2.findViewById(R.id.emoji_picker_btn);
        Activity activity2 = activity;
        C206711d r16 = r42;
        AnonymousClass2JH r72 = new AnonymousClass2JH(activity2, imageButton, r36, (C15430qs) activity2.findViewById(R.id.main), mentionableEntry, r13, r38, r15, r16, r17, r44, r6, r20, r0);
        this.A03 = r72;
        int eswitch = Conversation.eswitch();
        r72.A00 = eswitch;
        r72.A03 = R.drawable.ib_keyboard;
        imageButton.setImageDrawable(AnonymousClass2SR.A02(imageButton.getContext(), eswitch, R.color.color04ca));
        AnonymousClass29I r92 = new AnonymousClass29I(activity2, r15, r72, r16, r17, (EmojiSearchContainer) view2.findViewById(R.id.emoji_search_container), r20);
        this.A04 = r92;
        r92.A00 = new IDxEListenerShape200S0100000_2_I0(this, 11);
        r72.A0C(iDxCListenerShape203S0100000_2_I0);
        r72.A0E = new RunnableRunnableShape16S0100000_I0_15(this, 4);
        view2.getViewTreeObserver().addOnGlobalLayoutListener(iDxLListenerShape144S0100000_2_I0);
    }
}
