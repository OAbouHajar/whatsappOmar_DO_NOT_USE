package X;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import androidx.appcompat.widget.Toolbar;
import com.facebook.redex.IDxCListenerShape204S0100000_2_I1;
import com.facebook.redex.IDxEListenerShape201S0100000_2_I1;
import com.facebook.redex.ViewOnClickCListenerShape17S0100000_I1_2;
import com.obwhatsapp.KeyboardPopupLayout;
import com.obwhatsapp.R;
import com.obwhatsapp.emoji.search.EmojiSearchContainer;
import com.obwhatsapp.mentions.MentionableEntry;

/* renamed from: X.2uy  reason: invalid class name and case insensitive filesystem */
public class C59172uy extends AnonymousClass2S7 {
    public View A00;
    public FrameLayout A01;
    public AnonymousClass5RN A02 = new IDxCListenerShape204S0100000_2_I1(this, 0);
    public KeyboardPopupLayout A03;
    public AnonymousClass29I A04;
    public MentionableEntry A05;
    public final C16300so A06;
    public final C16760tb A07;
    public final C15860rz A08;
    public final C206711d A09;
    public final C17250um A0A;
    public final AnonymousClass1BQ A0B;
    public final C14710pd A0C;
    public final C17020u3 A0D;
    public final C30581cc A0E;
    public final C23061Ai A0F;

    public C59172uy(Activity activity, C16300so r10, C16760tb r11, AnonymousClass01V r12, C16440t3 r13, C15860rz r14, AnonymousClass013 r15, C206711d r16, C17250um r17, AnonymousClass1BQ r18, C14710pd r19, C17020u3 r20, C30581cc r21, C23061Ai r22) {
        super(activity, r12, r13, r15, R.layout.layout024a);
        this.A0C = r19;
        this.A0E = r21;
        this.A0F = r22;
        this.A06 = r10;
        this.A0A = r17;
        this.A07 = r11;
        this.A09 = r16;
        this.A0B = r18;
        this.A08 = r14;
        this.A0D = r20;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle((int) R.string.str076b);
        Activity activity = this.A01;
        toolbar.setTitleTextColor(AnonymousClass00T.A00(activity, R.color.color090b));
        C13680ns.A0u(activity, toolbar, R.color.color0655);
        AnonymousClass013 r8 = this.A04;
        toolbar.setNavigationIcon((Drawable) C447725m.A00(activity, r8, R.drawable.ic_back));
        toolbar.setNavigationContentDescription((int) R.string.str014a);
        toolbar.setNavigationOnClickListener(new ViewOnClickCListenerShape17S0100000_I1_2(this, 15));
        this.A03 = (KeyboardPopupLayout) findViewById(R.id.conversation_layout);
        this.A01 = (FrameLayout) findViewById(R.id.message_bubble_place_holder);
        this.A05 = (MentionableEntry) findViewById(R.id.entry);
        C30581cc r4 = this.A0E;
        AnonymousClass31K r1 = new AnonymousClass31K(activity, (AnonymousClass1YG) null, r4);
        this.A01.addView(r1);
        r1.setEnabled(false);
        C14710pd r16 = this.A0C;
        C23061Ai r15 = this.A0F;
        C16300so r13 = this.A06;
        C17250um r10 = this.A0A;
        C206711d r7 = this.A09;
        AnonymousClass01V r12 = this.A02;
        AnonymousClass1BQ r11 = this.A0B;
        C15860rz r6 = this.A08;
        C17020u3 r5 = this.A0D;
        KeyboardPopupLayout keyboardPopupLayout = this.A03;
        C23061Ai r26 = r15;
        C17250um r22 = r10;
        C206711d r21 = r7;
        AnonymousClass013 r20 = r8;
        C15860rz r19 = r6;
        AnonymousClass01V r18 = r12;
        MentionableEntry mentionableEntry = this.A05;
        KeyboardPopupLayout keyboardPopupLayout2 = keyboardPopupLayout;
        C16300so r152 = r13;
        Activity activity2 = activity;
        AnonymousClass2JH r122 = new AnonymousClass2JH(activity2, (ImageButton) findViewById(R.id.emoji_picker_btn), r152, keyboardPopupLayout2, mentionableEntry, r18, r19, r20, r21, r22, r11, r16, r5, r26);
        r122.A0C(this.A02);
        AnonymousClass29I r102 = new AnonymousClass29I(activity, r8, r122, r7, r10, (EmojiSearchContainer) C004601z.A0E(this.A03, R.id.emoji_search_container), r5);
        this.A04 = r102;
        r102.A00 = new IDxEListenerShape201S0100000_2_I1(this, 0);
        Window window = getWindow();
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = -1;
            attributes.gravity = 48;
            window.setAttributes(attributes);
            if (Build.VERSION.SDK_INT >= 21) {
                window.addFlags(Integer.MIN_VALUE);
                window.clearFlags(67108864);
                int A002 = AnonymousClass00T.A00(getContext(), R.color.color064b);
            }
        }
        getWindow().setSoftInputMode(5);
        this.A05.setText(r4.A0I());
        this.A05.setSelection(r4.A0I().length());
        this.A05.A04(false);
        View findViewById = findViewById(R.id.send);
        this.A00 = findViewById;
        C34331k5.A03(findViewById, this, 0);
    }
}
