package X;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.view.View;
import com.facebook.redex.RunnableRunnableShape1S0201000_I1;
import com.obwhatsapp.conversationslist.ViewHolder;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* renamed from: X.3FR  reason: invalid class name */
public class AnonymousClass3FR implements AnonymousClass2J6 {
    public final Context A00;
    public final C14870pt A01;
    public final C17230uk A02;
    public final C16440t3 A03;
    public final C18550ws A04;
    public final AnonymousClass1DY A05;
    public final C18570wu A06;
    public final C25781Lc A07;
    public final C16320sq A08;
    public final Runnable A09;
    public final Runnable A0A;

    public AnonymousClass3FR(Context context, C14870pt r2, C17230uk r3, C16440t3 r4, C18550ws r5, AnonymousClass1DY r6, C18570wu r7, C25781Lc r8, C16320sq r9, Runnable runnable, Runnable runnable2) {
        this.A00 = context;
        this.A09 = runnable;
        this.A0A = runnable2;
        this.A03 = r4;
        this.A01 = r2;
        this.A08 = r9;
        this.A04 = r5;
        this.A05 = r6;
        this.A07 = r8;
        this.A06 = r7;
        this.A02 = r3;
    }

    public final void A00(C15830rv r6, int i2) {
        new C14750ph();
        Context context = this.A00;
        Intent putExtra = C14750ph.A0Q(context, r6).putExtra("start_t", SystemClock.uptimeMillis());
        if (i2 == 5) {
            putExtra.setFlags(67108864);
        }
        AnonymousClass22U.A00(putExtra, "CommunityHomeActivity:onClickConversation");
        this.A05.A00();
        context.startActivity(putExtra);
        if (r6 instanceof C16050sL) {
            this.A08.Acl(new RunnableRunnableShape1S0201000_I1(r6, i2, this, 5));
        }
    }

    public /* synthetic */ void A6C() {
    }

    public /* synthetic */ C15830rv ACc() {
        return null;
    }

    public List AF2() {
        return Collections.emptyList();
    }

    public /* synthetic */ Set AFt() {
        return C13680ns.A0o();
    }

    public void AOa(ViewHolder viewHolder, C15830rv r3, int i2) {
        A00(r3, i2);
        Runnable runnable = this.A09;
        if (runnable != null) {
            runnable.run();
        }
    }

    public void AOb(View view, ViewHolder viewHolder, C15830rv r4, int i2, int i3) {
        A00(r4, -1);
        Runnable runnable = this.A0A;
        if (runnable != null) {
            runnable.run();
        }
    }

    public /* synthetic */ void AOc(ViewHolder viewHolder, C16740tZ r2) {
    }

    public void AOe(AnonymousClass1WP r2) {
        Log.e("CommunityHomeActivity/pending group in search results");
    }

    public void ATE(View view, ViewHolder viewHolder, C15830rv r4, int i2) {
        A00(r4, -1);
    }

    public /* synthetic */ boolean Abu(Jid jid) {
        return false;
    }
}
