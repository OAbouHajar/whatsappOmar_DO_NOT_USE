package X;

import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.os.Build;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.obwhatsapp.R;
import com.obwhatsapp.conversationslist.ConversationsFragment;
import com.whatsapp.util.Log;
import com.whatsapp.util.ViewOnClickCListenerShape5S0100000_I1_1;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: X.3BA  reason: invalid class name */
public class AnonymousClass3BA {
    public static final int[] A0E = {R.id.contact_icon1, R.id.contact_icon2, R.id.contact_icon3, R.id.contact_icon4, R.id.contact_icon5};
    public ObjectAnimator A00;
    public AnonymousClass36B A01;
    public C34331k5 A02;
    public boolean A03;
    public boolean A04;
    public final C16000sG A05;
    public final C16080sP A06;
    public final AnonymousClass120 A07;
    public final AnonymousClass2Ao A08;
    public final ConversationsFragment A09;
    public final AnonymousClass013 A0A;
    public final C14710pd A0B;
    public final C16490t9 A0C;
    public final AnonymousClass1WA A0D;

    public AnonymousClass3BA(C16000sG r3, C16080sP r4, AnonymousClass120 r5, AnonymousClass2Ao r6, ConversationsFragment conversationsFragment, AnonymousClass013 r8, C14710pd r9, C16490t9 r10, C16320sq r11) {
        this.A09 = conversationsFragment;
        this.A0B = r9;
        this.A0C = r10;
        this.A05 = r3;
        this.A06 = r4;
        this.A0A = r8;
        this.A07 = r5;
        this.A08 = r6;
        this.A0D = new AnonymousClass1WA(r11, false);
    }

    public static /* synthetic */ void A00(AnonymousClass01Q r13, AnonymousClass3BA r14) {
        String quantityString;
        r14.A01 = null;
        ConversationsFragment conversationsFragment = r14.A09;
        View view = conversationsFragment.A0A;
        C001000l A0C2 = conversationsFragment.A0C();
        if (view == null || A0C2 == null || A0C2.isFinishing() || r13 == null) {
            Log.w("conversations/updateNuxView: NUX view cannot be updated");
            return;
        }
        View findViewById = view.findViewById(R.id.conversations_empty_nux);
        Object obj = r13.A00;
        AbstractList A0u = obj == null ? AnonymousClass000.A0u() : (AbstractList) obj;
        Object obj2 = r13.A01;
        int A0D2 = obj2 == null ? 0 : AnonymousClass000.A0D(obj2);
        int size = A0u.size();
        int[] iArr = A0E;
        int length = iArr.length;
        boolean z2 = false;
        if (size <= length) {
            z2 = true;
        }
        AnonymousClass00B.A0G(z2);
        if (Build.VERSION.SDK_INT <= 16) {
            Collections.reverse(A0u);
        }
        ArrayList A0u2 = AnonymousClass000.A0u();
        for (int i2 = 0; i2 < size; i2++) {
            C16010sH r132 = (C16010sH) A0u.get(i2);
            ImageView A0K = C13680ns.A0K(findViewById, iArr[i2]);
            r14.A08.A06(A0K, r132);
            A0K.setVisibility(0);
            A0K.setOnClickListener(r14.A02);
            String escapeHtml = Html.escapeHtml(r14.A06.A0C(r132));
            A0u2.add(escapeHtml);
            A0K.setContentDescription(escapeHtml);
        }
        for (int i3 = size; i3 < length; i3++) {
            C13690nt.A11(findViewById, iArr[i3]);
        }
        if (!r14.A04) {
            A0D2 -= Math.min(size, 3);
            if (A0D2 > 0) {
                if (size != 0) {
                    Resources resources = A0C2.getResources();
                    if (size == 1) {
                        Object[] objArr = new Object[2];
                        objArr[0] = A0u2.get(0);
                        AnonymousClass000.A1M(objArr, A0D2, 1);
                        quantityString = resources.getQuantityString(R.plurals.plurals00f8, A0D2, objArr);
                    } else if (size != 2) {
                        Object[] A1a = C13690nt.A1a(A0u2, 4);
                        A1a[2] = A0u2.get(2);
                        AnonymousClass000.A1M(A1a, A0D2, 3);
                        quantityString = resources.getQuantityString(R.plurals.plurals00f9, A0D2, A1a);
                    } else {
                        Object[] A1a2 = C13690nt.A1a(A0u2, 3);
                        AnonymousClass000.A1M(A1a2, A0D2, 2);
                        quantityString = resources.getQuantityString(R.plurals.plurals00fa, A0D2, A1a2);
                    }
                    TextView A0L = C13680ns.A0L(findViewById, R.id.prompt_text);
                    A0L.setText(AnonymousClass1ZW.A01(quantityString, new Object[0]));
                    A0L.setVisibility(0);
                    TextView A0L2 = C13680ns.A0L(findViewById, R.id.instruction_text);
                    AnonymousClass1UP.A06(A0L2);
                    C34331k5.A03(A0L2, r14, 23);
                    C34331k5.A03(A0L, r14, 24);
                }
            } else if (size != 0) {
                if (size == 1) {
                    quantityString = C13680ns.A0d(A0C2, A0u2.get(0), new Object[1], 0, R.string.str0e84);
                } else if (size != 2) {
                    quantityString = C13680ns.A0d(A0C2, A0u2.get(2), C13690nt.A1a(A0u2, 3), 2, R.string.str0e85);
                } else {
                    Object[] objArr2 = new Object[2];
                    objArr2[0] = A0u2.get(0);
                    quantityString = C13680ns.A0d(A0C2, A0u2.get(1), objArr2, 1, R.string.str0e86);
                }
                TextView A0L3 = C13680ns.A0L(findViewById, R.id.prompt_text);
                A0L3.setText(AnonymousClass1ZW.A01(quantityString, new Object[0]));
                A0L3.setVisibility(0);
                TextView A0L22 = C13680ns.A0L(findViewById, R.id.instruction_text);
                AnonymousClass1UP.A06(A0L22);
                C34331k5.A03(A0L22, r14, 23);
                C34331k5.A03(A0L3, r14, 24);
            }
        }
        Resources resources2 = A0C2.getResources();
        Object[] objArr3 = new Object[1];
        AnonymousClass000.A1M(objArr3, A0D2, 0);
        quantityString = resources2.getQuantityString(R.plurals.plurals00f7, A0D2, objArr3);
        TextView A0L32 = C13680ns.A0L(findViewById, R.id.prompt_text);
        A0L32.setText(AnonymousClass1ZW.A01(quantityString, new Object[0]));
        A0L32.setVisibility(0);
        TextView A0L222 = C13680ns.A0L(findViewById, R.id.instruction_text);
        AnonymousClass1UP.A06(A0L222);
        C34331k5.A03(A0L222, r14, 23);
        C34331k5.A03(A0L32, r14, 24);
    }

    public void A01() {
        if (this.A03) {
            ConversationsFragment conversationsFragment = this.A09;
            View findViewById = conversationsFragment.A06().findViewById(R.id.conversations_empty_nux);
            if (this.A02 == null) {
                this.A04 = AnonymousClass000.A1R(conversationsFragment.A03().getConfiguration().screenLayout & 15, 1);
                AnonymousClass013 r2 = this.A0A;
                if (r2.A0T()) {
                    findViewById.findViewById(R.id.instruction_arrow).setRotationY(180.0f);
                }
                if (Build.VERSION.SDK_INT >= 17) {
                    View findViewById2 = findViewById.findViewById(R.id.linear_layout);
                    if (C13680ns.A1Z(r2)) {
                        C004601z.A0f(findViewById2, 1);
                    } else {
                        C004601z.A0f(findViewById2, 0);
                    }
                }
                this.A02 = new ViewOnClickCListenerShape5S0100000_I1_1(this, 22);
            }
            C13680ns.A1T(this.A01);
            this.A03 = false;
            AnonymousClass1WA r5 = this.A0D;
            r5.A00();
            C16000sG r4 = this.A05;
            AnonymousClass120 r1 = this.A07;
            C14710pd r22 = this.A0B;
            AnonymousClass36B r0 = new AnonymousClass36B(r4, r1, this, r22);
            this.A01 = r0;
            r0.A02.executeOnExecutor(r5, new Object[0]);
            this.A03 = false;
            if (r22.A0E(C16620tM.A02, 1266)) {
                C004601z.A0E(findViewById, R.id.instruction_text).setVisibility(8);
                C004601z.A0E(findViewById, R.id.instruction_badge).setVisibility(8);
                C004601z.A0E(findViewById, R.id.instruction_arrow).setVisibility(8);
            }
        }
    }
}
