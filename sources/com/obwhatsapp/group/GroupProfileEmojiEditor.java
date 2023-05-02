package com.obwhatsapp.group;

import X.AnonymousClass000;
import X.AnonymousClass00T;
import X.AnonymousClass013;
import X.AnonymousClass01V;
import X.AnonymousClass04o;
import X.AnonymousClass14W;
import X.AnonymousClass1CX;
import X.AnonymousClass1MJ;
import X.AnonymousClass1yX;
import X.AnonymousClass2SR;
import X.AnonymousClass3H7;
import X.AnonymousClass3Pj;
import X.AnonymousClass3Q4;
import X.AnonymousClass525;
import X.AnonymousClass5C9;
import X.AnonymousClass5QT;
import X.AnonymousClass5RN;
import X.C001500q;
import X.C006602z;
import X.C13680ns;
import X.C13690nt;
import X.C14530pL;
import X.C14550pN;
import X.C14570pP;
import X.C16150sX;
import X.C16320sq;
import X.C16490t9;
import X.C17250um;
import X.C206711d;
import X.C212613k;
import X.C218115n;
import X.C23061Ai;
import X.C25841Li;
import X.C25861Lk;
import X.C26151Mn;
import X.C26171Mp;
import X.C41791wf;
import X.C447725m;
import X.C47562Jm;
import X.C47572Jn;
import X.C49132Rg;
import X.C57392r6;
import X.C609336r;
import X.C95244mK;
import X.C99004tK;
import X.C99884uk;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.DialogFragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.IDxLListenerShape145S0100000_2_I1;
import com.facebook.redex.IDxObserverShape37S0200000_2_I1;
import com.obwhatsapp.KeyboardPopupLayout;
import com.obwhatsapp.R;
import com.obwhatsapp.WaEditText;
import com.obwhatsapp.emoji.search.EmojiSearchContainer;
import com.obwhatsapp.gifsearch.GifSearchContainer;
import com.obwhatsapp.picker.search.PickerSearchDialogFragment;
import java.util.Map;

public class GroupProfileEmojiEditor extends C14530pL implements AnonymousClass1yX {
    public static final Map A0D = new AnonymousClass5C9();
    public Bitmap A00;
    public View A01;
    public ImageView A02;
    public KeyboardPopupLayout A03;
    public AnonymousClass1MJ A04;
    public C218115n A05;
    public AnonymousClass3Pj A06;
    public C26171Mp A07;
    public AnonymousClass3H7 A08;
    public C212613k A09;
    public AnonymousClass14W A0A;
    public AnonymousClass1CX A0B;
    public boolean A0C;

    public GroupProfileEmojiEditor() {
        this(0);
    }

    public GroupProfileEmojiEditor(int i2) {
        this.A0C = false;
        C13680ns.A1G(this, 75);
    }

    public void A1q() {
        if (!this.A0C) {
            this.A0C = true;
            C49132Rg A1T = C14570pP.A1T(this);
            C16150sX r1 = A1T.A1s;
            C14550pN.A15(r1, this);
            C14530pL.A0b(A1T, r1, this, C14550pN.A0v(r1));
            this.A09 = (C212613k) r1.AK2.get();
            this.A0A = (AnonymousClass14W) r1.ANc.get();
            this.A0B = (AnonymousClass1CX) r1.ANk.get();
            this.A04 = (AnonymousClass1MJ) r1.A69.get();
            this.A05 = (C218115n) r1.AH2.get();
            this.A07 = (C26171Mp) r1.ABa.get();
        }
    }

    public void AUl(PickerSearchDialogFragment pickerSearchDialogFragment) {
        this.A08.A02(pickerSearchDialogFragment);
    }

    public void Afa(DialogFragment dialogFragment) {
        Afc(dialogFragment);
    }

    public void onBackPressed() {
        if (!this.A07.A03.A02()) {
            super.onBackPressed();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.layout02e1);
        int[] intArray = getResources().getIntArray(R.array.array0011);
        int[] intArray2 = getResources().getIntArray(R.array.array0010);
        Object A0Y = AnonymousClass000.A0Y(A0D, getIntent().getIntExtra("emojiEditorProfileTarget", 1));
        if (A0Y == null) {
            A0Y = C99004tK.A00;
        }
        this.A06 = (AnonymousClass3Pj) new C006602z((AnonymousClass04o) new C95244mK(this, intArray), (C001500q) this).A01(AnonymousClass3Pj.class);
        KeyboardPopupLayout keyboardPopupLayout = (KeyboardPopupLayout) findViewById(R.id.popup_keyboard_root);
        this.A03 = keyboardPopupLayout;
        keyboardPopupLayout.setKeyboardPopupBackgroundColor(AnonymousClass00T.A00(this, R.color.color01f5));
        AnonymousClass3Q4 r4 = (AnonymousClass3Q4) new C006602z(this).A01(AnonymousClass3Q4.class);
        AnonymousClass1CX r10 = this.A0B;
        C16320sq r9 = this.A05;
        C212613k r8 = this.A09;
        AnonymousClass14W r2 = this.A0A;
        C41791wf r11 = new C41791wf(this.A09, r8, r2, r10, r9);
        AnonymousClass3H7 r82 = new AnonymousClass3H7(r11);
        this.A08 = r82;
        C26171Mp r22 = this.A07;
        KeyboardPopupLayout keyboardPopupLayout2 = this.A03;
        AnonymousClass1MJ r0 = this.A04;
        r22.A04 = r4;
        r22.A06 = r11;
        r22.A05 = r82;
        r22.A01 = r0;
        C26151Mn r112 = r22.A0D;
        r112.A00 = this;
        AnonymousClass1MJ r13 = r22.A01;
        r112.A07 = r13.A01(r22.A0I, r22.A06);
        r112.A05 = r13.A00();
        r112.A02 = keyboardPopupLayout2;
        r112.A01 = null;
        r112.A03 = (WaEditText) AnonymousClass00T.A05(this, R.id.keyboardInput);
        r112.A08 = true;
        r22.A02 = r112.A00();
        Resources resources = getResources();
        C99884uk r02 = new C99884uk(resources, r22);
        r22.A00 = r02;
        C47572Jn r102 = r22.A02;
        r102.A0C(r02);
        AnonymousClass525 r03 = new AnonymousClass525(resources, this, r22, r82);
        r102.A0J(r03);
        r82.A04 = r03;
        C25841Li r222 = r22.A0E;
        C23061Ai r26 = r22.A0J;
        C16490t9 r20 = r22.A0C;
        AnonymousClass01V r28 = r22.A07;
        C25861Lk r24 = r22.A0F;
        C47572Jn r14 = r22.A02;
        C17250um r12 = r22.A0B;
        C206711d r113 = r22.A0A;
        AnonymousClass013 r103 = r22.A09;
        C47562Jm r122 = new C47562Jm(this, r28, r22.A08, r103, r113, r12, (EmojiSearchContainer) keyboardPopupLayout2.findViewById(R.id.emoji_search_container), r20, r14, r222, (GifSearchContainer) keyboardPopupLayout2.findViewById(R.id.gif_search_container), r24, r22.A0G, r26);
        r22.A03 = r122;
        r122.A00 = r22;
        C47572Jn r04 = r22.A02;
        r82.A02 = this;
        r82.A00 = r04;
        r04.A03 = r82;
        C41791wf r05 = r22.A06;
        r05.A0A.A02(r05.A09);
        Toolbar toolbar = (Toolbar) AnonymousClass00T.A05(this, R.id.toolbar);
        toolbar.setNavigationIcon((Drawable) new C447725m(AnonymousClass2SR.A02(this, R.drawable.ic_back, R.color.color04d2), this.A01));
        Aem(toolbar);
        C13690nt.A0N(this).A0B(R.string.str0af2);
        x().A0Q(true);
        x().A0N(true);
        RecyclerView recyclerView = (RecyclerView) AnonymousClass00T.A05(this, R.id.colors_recycler);
        recyclerView.setAdapter(new C57392r6(this, this.A06, intArray, intArray2));
        recyclerView.setLayoutManager(new LinearLayoutManager(0));
        this.A02 = (ImageView) AnonymousClass00T.A05(this, R.id.picturePreview);
        this.A06.A00.A0A(this, new IDxObserverShape37S0200000_2_I1(A0Y, 4, this));
        C13680ns.A1M(this, r4.A00, 24);
        this.A01 = LayoutInflater.from(this).inflate(R.layout.layout02e3, (ViewGroup) this.A00, false);
        this.A03.getViewTreeObserver().addOnGlobalLayoutListener(new IDxLListenerShape145S0100000_2_I1(this, 8));
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, R.id.done, 0, R.string.str072c).setIcon(new C447725m(AnonymousClass2SR.A02(this, R.drawable.action_profile_photo_editor_done, R.color.color04d2), this.A01)).setShowAsAction(2);
        return true;
    }

    public void onDestroy() {
        super.onDestroy();
        C26171Mp r2 = this.A07;
        C47572Jn r0 = r2.A02;
        r0.A0C((AnonymousClass5RN) null);
        r0.A0J((AnonymousClass5QT) null);
        r2.A05.A04 = null;
        r2.A03.A00 = null;
        r2.A06.A03();
        r2.A05.A01();
        r2.A02.dismiss();
        r2.A02.A0E();
        r2.A06 = null;
        r2.A05 = null;
        r2.A03 = null;
        r2.A00 = null;
        r2.A01 = null;
        r2.A02 = null;
        r2.A04 = null;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.done) {
            C13680ns.A1U(new C609336r(this), this.A05);
            return true;
        } else if (menuItem.getItemId() != 16908332) {
            return true;
        } else {
            finish();
            return true;
        }
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        menu.findItem(R.id.done).setVisible(AnonymousClass000.A1V(this.A00));
        return true;
    }
}
