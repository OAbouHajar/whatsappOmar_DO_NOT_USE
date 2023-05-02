package X;

import android.view.Menu;
import android.view.MenuItem;
import com.obwhatsapp.R;

/* renamed from: X.30A  reason: invalid class name */
public class AnonymousClass30A extends AnonymousClass2AK {
    public AnonymousClass30A(C000900k r1, C14600pS r2, C14870pt r3, C16040sK r4, C15900s5 r5, C16760tb r6, C19740yv r7, C54602hp r8, C17650vQ r9, AnonymousClass127 r10, C17760vb r11, C17140ub r12, C17030uP r13, AnonymousClass1yP r14, AnonymousClass2a9 r15, AnonymousClass1M1 r16, AnonymousClass15I r17, C20270zm r18, AnonymousClass12W r19, C15860rz r20, AnonymousClass013 r21, C14730pf r22, C15810rt r23, C216114t r24, C16010sH r25, C17580vJ r26, C19410yO r27, C14710pd r28, C20260zl r29, AnonymousClass18R r30, C34841kx r31, C16220sf r32, C25781Lc r33, AnonymousClass15V r34, C25721Kw r35, C16320sq r36) {
        super(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36);
    }

    public boolean AUD(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 21) {
            C000900k r4 = this.A01;
            r4.startActivity(C14750ph.A0R(r4, this.A00.A0E), C455529g.A05(r4, r4.findViewById(R.id.transition_start), this.A08.A00(R.string.str1dd7)));
        } else if (itemId != 22) {
            return super.AUD(menuItem);
        }
        return true;
    }

    public boolean AVB(Menu menu) {
        StringBuilder A0r = AnonymousClass000.A0r("listconversationmenu/onprepareoptionsmenu ");
        A0r.append(menu.size());
        C13680ns.A1V(A0r);
        if (menu.size() == 0) {
            return false;
        }
        return super.AVB(menu);
    }
}
