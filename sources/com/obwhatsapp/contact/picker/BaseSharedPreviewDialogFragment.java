package com.obwhatsapp.contact.picker;

import X.AnonymousClass00B;
import X.AnonymousClass00T;
import X.AnonymousClass01V;
import X.AnonymousClass1A9;
import X.C14870pt;
import X.C15830rv;
import X.C16000sG;
import X.C16030sJ;
import X.C16080sP;
import X.C16180sb;
import X.C40631uR;
import X.C447725m;
import X.C49212Rq;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.Toolbar;
import com.facebook.redex.ViewOnClickCListenerShape9S0100000_I0_2;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import com.obwhatsapp.emoji.search.EmojiSearchContainer;
import com.obwhatsapp.webpagepreview.WebPagePreviewView;
import java.util.ArrayList;
import java.util.List;

public class BaseSharedPreviewDialogFragment extends Hilt_BaseSharedPreviewDialogFragment {
    public View A00;
    public View A01;
    public ViewGroup A02;
    public ImageButton A03;
    public LinearLayout A04;
    public LinearLayout A05;
    public RelativeLayout A06;
    public C16180sb A07;
    public C14870pt A08;
    public C16000sG A09;
    public C16080sP A0A;
    public C49212Rq A0B;
    public AnonymousClass01V A0C;
    public EmojiSearchContainer A0D;
    public AnonymousClass1A9 A0E;
    public WebPagePreviewView A0F;
    public List A0G;

    public void A0n(Bundle bundle) {
        this.A0V = true;
        Toolbar toolbar = (Toolbar) this.A00.findViewById(R.id.toolbar);
        toolbar.setBackgroundColor(AnonymousClass00T.A00(A0D(), R.color.color064b));
        toolbar.A0C(A0C(), R.style.style02e9);
        toolbar.setTitle((int) R.string.str14fd);
        toolbar.setNavigationIcon((Drawable) new C447725m(AnonymousClass00T.A04(A0C(), R.drawable.ic_back), this.A02));
        toolbar.setNavigationOnClickListener(new ViewOnClickCListenerShape9S0100000_I0_2(this, 15));
        toolbar.setNavigationContentDescription((int) R.string.str014a);
        if (Build.VERSION.SDK_INT >= 21) {
            Window window = this.A03.getWindow();
            AnonymousClass00B.A06(window);
            window.clearFlags(67108864);
            int A002 = AnonymousClass00T.A00(A0C(), R.color.color0655);
        }
    }

    public void A0q() {
        Dialog dialog = this.A03;
        if (dialog != null) {
            Window window = dialog.getWindow();
            AnonymousClass00B.A06(window);
            window.setLayout(-1, -1);
            dialog.getWindow().setBackgroundDrawable(new ColorDrawable(-16777216));
            dialog.getWindow().getAttributes().windowAnimations = R.style.style018a;
        }
        super.A0q();
    }

    public void A0t(Menu menu) {
        menu.findItem(R.id.menuitem_search).setVisible(false);
    }

    public boolean A10(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        A1C();
        return true;
    }

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.A00 = A0D().getLayoutInflater().inflate(R.layout.layout008d, viewGroup, false);
        A0a(true);
        A1E(2, 0);
        this.A04 = (LinearLayout) this.A00.findViewById(R.id.top_layout);
        this.A05 = (LinearLayout) this.A00.findViewById(R.id.view_placeholder);
        this.A06 = (RelativeLayout) this.A00.findViewById(R.id.footer);
        this.A03 = (ImageButton) this.A00.findViewById(R.id.send);
        this.A02 = (ViewGroup) this.A00.findViewById(R.id.web_page_preview_container);
        this.A01 = this.A00.findViewById(R.id.link_preview_divider);
        this.A02.setVisibility(8);
        this.A01.setVisibility(8);
        EmojiSearchContainer emojiSearchContainer = (EmojiSearchContainer) this.A00.findViewById(R.id.emoji_search_container);
        this.A0D = emojiSearchContainer;
        emojiSearchContainer.setVisibility(8);
        ArrayList arrayList = new ArrayList();
        for (C15830rv r2 : this.A0G) {
            arrayList.add(0, C16030sJ.A0Q(r2) ? A0J(R.string.str0dac) : this.A0A.A08(this.A09.A0A(r2)));
        }
        ((TextEmojiLabel) this.A00.findViewById(R.id.recipients)).A0I((List) null, C40631uR.A00(this.A0A.A07, arrayList, false));
        A1N();
        return this.A00;
    }

    public void A17(Bundle bundle) {
        super.A17(bundle);
        if (!(A0C() instanceof C49212Rq)) {
            throw new RuntimeException("Activity must implement BaseSharedPreviewDialogFragment.Host");
        }
    }

    public Dialog A1B(Bundle bundle) {
        ArrayList<String> stringArrayList = A04().getStringArrayList("jids");
        AnonymousClass00B.A07(stringArrayList, "null jids");
        this.A0G = C16030sJ.A08(C15830rv.class, stringArrayList);
        C49212Rq r0 = (C49212Rq) A0C();
        this.A0B = r0;
        if (r0 != null) {
            ((ContactPicker) r0).A03 = this;
        }
        A1E(0, R.style.style018c);
        return super.A1B(bundle);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        if (r0 != 0) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1N() {
        /*
            r3 = this;
            android.widget.RelativeLayout r0 = r3.A06
            android.view.ViewGroup$LayoutParams r2 = r0.getLayoutParams()
            com.obwhatsapp.webpagepreview.WebPagePreviewView r0 = r3.A0F
            if (r0 == 0) goto L_0x0013
            int r0 = r0.getVisibility()
            r1 = 2131167040(0x7f070740, float:1.7948342E38)
            if (r0 == 0) goto L_0x0016
        L_0x0013:
            r1 = 2131167041(0x7f070741, float:1.7948344E38)
        L_0x0016:
            android.content.res.Resources r0 = r3.A03()
            int r1 = r0.getDimensionPixelSize(r1)
            r2.height = r1
            android.widget.RelativeLayout r0 = r3.A06
            int r0 = r0.getHeight()
            if (r1 == r0) goto L_0x002d
            android.widget.RelativeLayout r0 = r3.A06
            r0.setLayoutParams(r2)
        L_0x002d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.contact.picker.BaseSharedPreviewDialogFragment.A1N():void");
    }

    public void onDismiss(DialogInterface dialogInterface) {
        C49212Rq r1 = this.A0B;
        if (r1 != null) {
            ((ContactPicker) r1).A03 = null;
        }
        super.onDismiss(dialogInterface);
    }
}
