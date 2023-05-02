package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import com.obwhatsapp.WaTextView;
import com.obwhatsapp.components.ConversationListRowHeaderView;
import com.obwhatsapp.conversationslist.ViewHolder;

/* renamed from: X.31f  reason: invalid class name and case insensitive filesystem */
public class C603731f extends C62083Bo {
    public C73953pO A00;
    public final Context A01;
    public final C16000sG A02;
    public final C85934Qo A03;
    public final AnonymousClass2J6 A04;
    public final AnonymousClass013 A05;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C603731f(android.app.Activity r27, android.content.Context r28, X.C16040sK r29, X.C15900s5 r30, X.AnonymousClass15Z r31, X.C17150uc r32, X.AnonymousClass01Y r33, X.C16000sG r34, X.C16080sP r35, X.C85934Qo r36, X.AnonymousClass2J6 r37, com.obwhatsapp.conversationslist.ViewHolder r38, X.C16440t3 r39, X.C16980tz r40, X.AnonymousClass013 r41, X.C15810rt r42, X.C18560wt r43, X.C14710pd r44, X.C20260zl r45, X.C17240ul r46, X.C19990zK r47, X.C18090w8 r48, X.C18290wS r49, X.C218315p r50, X.AnonymousClass2TP r51) {
        /*
            r26 = this;
            r12 = r38
            r11 = r37
            r10 = r35
            r9 = r34
            r8 = r33
            r7 = r32
            r6 = r31
            r5 = r30
            r4 = r29
            r3 = r28
            r2 = r27
            r1 = r26
            r25 = r51
            r24 = r50
            r23 = r49
            r22 = r48
            r21 = r47
            r20 = r46
            r19 = r45
            r18 = r44
            r17 = r43
            r16 = r42
            r15 = r41
            r14 = r40
            r13 = r39
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r1.A01 = r3
            r1.A05 = r15
            r0 = r36
            r1.A03 = r0
            r1.A04 = r11
            r1.A02 = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C603731f.<init>(android.app.Activity, android.content.Context, X.0sK, X.0s5, X.15Z, X.0uc, X.01Y, X.0sG, X.0sP, X.4Qo, X.2J6, com.obwhatsapp.conversationslist.ViewHolder, X.0t3, X.0tz, X.013, X.0rt, X.0wt, X.0pd, X.0zl, X.0ul, X.0zK, X.0w8, X.0wS, X.15p, X.2TP):void");
    }

    public final void A0A(AnonymousClass4KU r17) {
        AnonymousClass4KU r0 = r17;
        C16740tZ r14 = r0.A02;
        C16010sH r12 = r0.A00;
        C16010sH r13 = r0.A01;
        AnonymousClass013 r5 = this.A05;
        ViewHolder viewHolder = this.A0A;
        View view = viewHolder.A06;
        Context context = this.A01;
        C45902Bo.A0A(view, r5, context.getResources().getDimensionPixelSize(R.dimen.dimen04ec), 0, 0, 0);
        View view2 = viewHolder.A05;
        view2.setVisibility(8);
        viewHolder.A0G.setVisibility(8);
        viewHolder.A0E.setVisibility(8);
        viewHolder.A0B.setVisibility(8);
        viewHolder.A0D.setVisibility(8);
        viewHolder.A0C.setVisibility(8);
        viewHolder.A03.setVisibility(8);
        viewHolder.A0J(false, 0);
        TextEmojiLabel textEmojiLabel = viewHolder.A0L;
        textEmojiLabel.setVisibility(0);
        C13680ns.A0v(context, textEmojiLabel, R.color.color0505);
        textEmojiLabel.setPlaceholder(0);
        C87244Vz r2 = viewHolder.A00;
        int A002 = AnonymousClass00T.A00(context, R.color.color0505);
        ConversationListRowHeaderView conversationListRowHeaderView = r2.A00;
        WaTextView waTextView = conversationListRowHeaderView.A01;
        conversationListRowHeaderView.A01.setVisibility(0);
        ImageView imageView = viewHolder.A09;
        imageView.setEnabled(false);
        imageView.setOnClickListener((View.OnClickListener) null);
        imageView.setOnLongClickListener((View.OnLongClickListener) null);
        view2.setOnClickListener((View.OnClickListener) null);
        view2.setOnLongClickListener((View.OnLongClickListener) null);
        C13680ns.A1C(viewHolder.A0H, this, r14, 21);
        r2.A02(r12, this.A0N, this.A04.AF2());
        r2.A02.A09(r12);
        A08((C16010sH) null, r12, r13, r14, (C39531sd) null);
    }
}
