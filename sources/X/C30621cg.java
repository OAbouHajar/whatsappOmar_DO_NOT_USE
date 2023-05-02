package X;

import android.content.Context;
import androidx.fragment.app.DialogFragment;
import com.obwhatsapp.R;
import com.obwhatsapp.conversationslist.ConversationsFragment;
import com.whatsapp.util.Log;
import java.util.Set;

/* renamed from: X.1cg  reason: invalid class name and case insensitive filesystem */
public class C30621cg {
    public final Context A00;
    public final C14870pt A01;
    public final C18930xU A02;
    public final C16000sG A03;
    public final C30631ch A04;
    public final C16440t3 A05;
    public final C18910xS A06;
    public final AnonymousClass119 A07;
    public final C17240ul A08;
    public final C16220sf A09;
    public final C25721Kw A0A;
    public final C16320sq A0B;

    public C30621cg(Context context, C14870pt r2, C18930xU r3, C16000sG r4, C30631ch r5, C16440t3 r6, C18910xS r7, AnonymousClass119 r8, C17240ul r9, C16220sf r10, C25721Kw r11, C16320sq r12) {
        this.A00 = context;
        this.A05 = r6;
        this.A01 = r2;
        this.A0B = r12;
        this.A06 = r7;
        this.A02 = r3;
        this.A03 = r4;
        this.A08 = r9;
        this.A09 = r10;
        this.A07 = r8;
        this.A0A = r11;
        this.A04 = r5;
    }

    public static /* synthetic */ void A00(AnonymousClass02C r4, C30621cg r5, C15830rv r6, boolean z2) {
        C16010sH A0A2 = r5.A03.A0A(r6);
        if (r4 == null) {
            return;
        }
        if (A0A2.A0J()) {
            StringBuilder sb = new StringBuilder("conversations/delete/group:");
            sb.append(A0A2);
            Log.i(sb.toString());
            if (r5.A08.A13) {
                r5.A01.A09(R.string.str0b1a, 0);
                return;
            }
            ConversationsFragment.DeleteGroupDialogFragment deleteGroupDialogFragment = new ConversationsFragment.DeleteGroupDialogFragment();
            AnonymousClass3A4.A00(deleteGroupDialogFragment, A0A2);
            deleteGroupDialogFragment.A04().putBoolean("chatContainsStarredMessages", z2);
            deleteGroupDialogFragment.A1G(r4, (String) null);
        } else if (C16030sJ.A0G(A0A2.A0E)) {
            ConversationsFragment.DeleteBroadcastListDialogFragment deleteBroadcastListDialogFragment = new ConversationsFragment.DeleteBroadcastListDialogFragment();
            AnonymousClass3A4.A00(deleteBroadcastListDialogFragment, A0A2);
            deleteBroadcastListDialogFragment.A04().putBoolean("chatContainsStarredMessages", z2);
            deleteBroadcastListDialogFragment.A1G(r4, (String) null);
        } else {
            r5.A0B.Ack(new AnonymousClass37R((DialogFragment) new ConversationsFragment.DeleteContactDialogFragment(), r4, r5.A07, A0A2, z2), new Object[0]);
        }
    }

    public void A01(C15830rv r8, long j2) {
        if (!C16030sJ.A0R(r8)) {
            C18930xU r6 = this.A02;
            Set A0D = r6.A0D(r8, true);
            C16220sf r4 = this.A09;
            boolean z2 = false;
            if (j2 > 0) {
                z2 = true;
            }
            AnonymousClass00B.A0B("Pinned time should be strictly positive", z2);
            if (r4.A08(r8, j2, true) != null) {
                r6.A0V(A0D);
            } else {
                r6.A0U(A0D);
            }
        }
    }
}
