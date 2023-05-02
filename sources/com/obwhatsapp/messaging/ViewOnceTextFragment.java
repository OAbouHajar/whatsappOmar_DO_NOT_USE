package com.obwhatsapp.messaging;

import X.AnonymousClass013;
import X.AnonymousClass02C;
import X.AnonymousClass08E;
import X.AnonymousClass1PH;
import X.AnonymousClass2SR;
import X.C000900k;
import X.C004601z;
import X.C018208n;
import X.C13680ns;
import X.C13700nu;
import X.C16440t3;
import X.C16620tM;
import X.C16740tZ;
import X.C25831Lh;
import X.C28961Zl;
import X.C39001rl;
import X.C47672Jx;
import X.C83734Hv;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import com.obwhatsapp.ephemeral.ViewOnceNUXDialog;
import com.obwhatsapp.ephemeral.ViewOnceNuxBottomSheet;

public class ViewOnceTextFragment extends Hilt_ViewOnceTextFragment {
    public ViewGroup A00;
    public TextView A01;
    public TextEmojiLabel A02;
    public TextEmojiLabel A03;
    public C25831Lh A04;
    public AnonymousClass1PH A05;
    public C16440t3 A06;
    public AnonymousClass013 A07;

    public void A0z(Menu menu, MenuInflater menuInflater) {
        menu.clear();
        menu.add(0, 0, 1, R.string.str19e9).setIcon(AnonymousClass2SR.A02(A02(), R.drawable.ic_viewonce, R.color.color090b)).setShowAsAction(1);
        menu.addSubMenu(1, 0, 0, R.string.str19e9).clearHeader();
    }

    public boolean A10(MenuItem menuItem) {
        boolean A0E = this.A01.A0E(C16620tM.A02, 1710);
        AnonymousClass02C A0G = A0G();
        if (A0E) {
            ViewOnceNuxBottomSheet.A01(A0G, (C83734Hv) null, (C16740tZ) ((C39001rl) this.A03), true);
            return true;
        }
        ViewOnceNUXDialog.A01(A0G, (C16740tZ) ((C39001rl) this.A03), true);
        return true;
    }

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.layout05d7, viewGroup, false);
        C13680ns.A0u(A02(), inflate, R.color.color07d1);
        inflate.setVisibility(0);
        this.A01 = C13680ns.A0L(inflate, R.id.date);
        this.A00 = C13700nu.A07(inflate, R.id.date_wrapper);
        this.A02 = C13680ns.A0Q(inflate, R.id.date_bubble);
        A0a(true);
        return inflate;
    }

    public void A18(Bundle bundle, View view) {
        Toolbar toolbar = (Toolbar) C004601z.A0E(A06(), R.id.toolbar);
        if (toolbar != null) {
            toolbar.A07();
            Drawable A032 = C018208n.A03(AnonymousClass08E.A01(A02(), R.drawable.ic_close));
            C018208n.A0A(A032, -1);
            toolbar.setNavigationIcon(A032);
            ((C000900k) A0D()).Aem(toolbar);
            if (((C000900k) A0D()).x() != null) {
                ((C000900k) A0D()).x().A0Q(false);
                ((C000900k) A0D()).x().A0N(true);
            }
        }
        TextEmojiLabel A0Q = C13680ns.A0Q(A06(), R.id.message_text);
        this.A03 = A0Q;
        A0Q.setAutoLinkMask(0);
        this.A03.setLinksClickable(false);
        this.A03.setFocusable(false);
        this.A03.setClickable(false);
        this.A03.setLongClickable(false);
        C16740tZ r4 = this.A03;
        if (r4 != null) {
            r4.A0I();
            TextEmojiLabel textEmojiLabel = this.A03;
            textEmojiLabel.getContext();
            C25831Lh r2 = this.A04;
            float A022 = r2.A02(A06().getResources(), r2.A02);
            float A002 = AnonymousClass1PH.A00(A06(), this.A03, A022);
            if (A002 != -1.0f) {
                textEmojiLabel.setTextSize(A002);
            } else {
                textEmojiLabel.setTextSize(A022);
            }
            textEmojiLabel.setText(r4.A0I());
        }
        this.A03.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        this.A03.clearAnimation();
        this.A03.setMovementMethod(new ScrollingMovementMethod());
        this.A03.setEllipsize(TextUtils.TruncateAt.END);
        this.A03.setMaxLines(15);
        C16740tZ r0 = this.A03;
        TextView textView = this.A01;
        ViewGroup viewGroup = this.A00;
        if (textView != null) {
            textView.setVisibility(0);
            textView.setText(C47672Jx.A00(this.A07, this.A06.A02(r0.A0I)));
        }
        if (viewGroup != null) {
            viewGroup.setVisibility(0);
        }
        this.A02.setText(C28961Zl.A09(this.A07, System.currentTimeMillis()));
        this.A02.setTextSize(this.A04.A00(A03()));
        if (this.A02.getVisibility() != 0) {
            this.A02.setVisibility(0);
        }
    }
}
