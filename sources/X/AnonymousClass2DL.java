package X;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.os.Bundle;
import android.transition.Fade;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.redex.IDxObserverShape113S0100000_1_I0;
import com.facebook.redex.IDxObserverShape115S0100000_2_I0;
import com.obwhatsapp.ListItemWithLeftIcon;
import com.obwhatsapp.R;
import com.obwhatsapp.WaTextView;
import com.obwhatsapp.chatinfo.ContactInfoActivity;
import com.obwhatsapp.chatinfo.ListChatInfoActivity;
import com.obwhatsapp.chatinfo.view.custom.ChatInfoLayoutV2;
import com.obwhatsapp.conversation.ChatMediaEphemeralVisibilityDialog;
import com.obwhatsapp.conversation.ChatMediaVisibilityDialog;
import com.obwhatsapp.group.GroupChatInfoActivity;
import com.obwhatsapp.ui.media.MediaCard;
import java.util.HashSet;

/* renamed from: X.2DL  reason: invalid class name */
public abstract class AnonymousClass2DL extends AnonymousClass2DM {
    public long A00;
    public C16760tb A01;
    public C18640x1 A02;
    public C17170ue A03;
    public C17760vb A04;
    public C609936x A05;
    public C16000sG A06;
    public C16260sj A07;
    public AnonymousClass013 A08;
    public C15810rt A09;
    public C16460t6 A0A;
    public C25711Kv A0B;
    public C16070sO A0C;
    public C25701Ku A0D;
    public AnonymousClass17N A0E;
    public C16480t8 A0F;
    public C18600wx A0G;
    public C17240ul A0H;
    public AnonymousClass174 A0I;
    public C18090w8 A0J;
    public C18290wS A0K;
    public C218315p A0L;
    public C16730tY A0M;
    public C16220sf A0N;
    public C25721Kw A0O;
    public C25791Ld A0P;
    public boolean A0Q;
    public final HashSet A0R = new HashSet();

    public C15830rv A36() {
        return this instanceof GroupChatInfoActivity ? ((GroupChatInfoActivity) this).A3M() : this instanceof ListChatInfoActivity ? ((ListChatInfoActivity) this).A3M() : ((ContactInfoActivity) this).A3N();
    }

    public void A37() {
        if (this instanceof GroupChatInfoActivity) {
            GroupChatInfoActivity groupChatInfoActivity = (GroupChatInfoActivity) this;
            groupChatInfoActivity.A3B();
            C59952zc r0 = groupChatInfoActivity.A1G;
            if (r0 != null) {
                r0.A06(true);
                groupChatInfoActivity.A1G = null;
            }
            C16690tT r02 = groupChatInfoActivity.A1g;
            if (r02 != null) {
                r02.A06(true);
                groupChatInfoActivity.A1G = null;
            }
        } else if (this instanceof ListChatInfoActivity) {
            ListChatInfoActivity listChatInfoActivity = (ListChatInfoActivity) this;
            listChatInfoActivity.A3B();
            C73403nq r1 = listChatInfoActivity.A07;
            if (r1 != null) {
                r1.A06(true);
                listChatInfoActivity.A07 = null;
            }
        } else if (this instanceof ContactInfoActivity) {
            ContactInfoActivity contactInfoActivity = (ContactInfoActivity) this;
            contactInfoActivity.A3B();
            C59962zd r12 = contactInfoActivity.A0Y;
            if (r12 != null) {
                r12.A06(true);
                contactInfoActivity.A0Y = null;
            }
        } else {
            A3B();
        }
    }

    public void A38() {
        C55482jg r1;
        if (this instanceof GroupChatInfoActivity) {
            C75893st r12 = ((GroupChatInfoActivity) this).A14;
            if (r12 != null) {
                r12.A07 = Boolean.TRUE;
            }
        } else if (!(this instanceof ListChatInfoActivity) && (r1 = ((ContactInfoActivity) this).A13) != null) {
            r1.A06 = Boolean.TRUE;
        }
    }

    public void A39() {
        C15830rv A36 = A36();
        C15830rv A362 = A36();
        Afc((A362 == null || C40491uD.A00(this.A06, this.A09, A362) <= 0) ? ChatMediaVisibilityDialog.A01(new C82624Dn(this), A36) : new ChatMediaEphemeralVisibilityDialog());
    }

    public void A3A() {
        A3B();
        AnonymousClass013 r3 = this.A08;
        AnonymousClass17N r5 = this.A0E;
        C16480t8 r6 = this.A0F;
        C15830rv A36 = A36();
        AnonymousClass00B.A06(A36);
        C609936x r2 = new C609936x(r3, this.A0B, r5, r6, A36, (MediaCard) findViewById(R.id.media_card_view));
        this.A05 = r2;
        this.A05.Ack(r2, new Void[0]);
    }

    public void A3B() {
        C609936x r1 = this.A05;
        if (r1 != null) {
            r1.A06(true);
            this.A05 = null;
        }
    }

    public void A3C(int i2) {
        if (C15450qv.A03()) {
            Window window = getWindow();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0019, code lost:
        if (r1 <= 0) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A3D(int r6) {
        /*
            r5 = this;
            r0 = 2131364547(0x7f0a0ac3, float:1.8348934E38)
            android.view.View r4 = X.AnonymousClass00T.A05(r5, r0)
            r3 = 2131889395(0x7f120cf3, float:1.9413452E38)
            X.0rv r2 = r5.A36()
            X.0rt r1 = r5.A09
            X.0sG r0 = r5.A06
            if (r2 == 0) goto L_0x001b
            int r1 = X.C40491uD.A00(r0, r1, r2)
            r0 = 1
            if (r1 > 0) goto L_0x001c
        L_0x001b:
            r0 = 0
        L_0x001c:
            r2 = 0
            if (r0 != 0) goto L_0x0037
            r1 = 1
            if (r6 == 0) goto L_0x0029
            r1 = 0
            r0 = 2
            if (r0 != r6) goto L_0x0029
            r3 = 2131889396(0x7f120cf4, float:1.9413454E38)
        L_0x0029:
            boolean r0 = r4 instanceof com.obwhatsapp.ListItemWithLeftIcon
            if (r0 == 0) goto L_0x0036
            com.obwhatsapp.ListItemWithLeftIcon r4 = (com.obwhatsapp.ListItemWithLeftIcon) r4
            if (r1 == 0) goto L_0x0039
            r0 = 8
            r4.setDescriptionVisibility(r0)
        L_0x0036:
            return
        L_0x0037:
            r1 = 0
            goto L_0x0029
        L_0x0039:
            java.lang.String r0 = r5.getString(r3)
            r4.setDescription((java.lang.String) r0)
            r4.setDescriptionVisibility(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2DL.A3D(int):void");
    }

    public void A3E(long j2) {
        View findViewById = findViewById(R.id.payment_transactions_layout);
        View findViewById2 = findViewById(R.id.payment_transactions_separator);
        if (j2 == 0 || this.A01.A0G()) {
            findViewById.setVisibility(8);
            if (findViewById2 != null) {
                findViewById2.setVisibility(8);
                return;
            }
            return;
        }
        findViewById.setVisibility(0);
        if (findViewById2 != null) {
            findViewById2.setVisibility(0);
        }
        TextView textView = (TextView) findViewById(R.id.payment_transactions_count);
        if (findViewById instanceof ListItemWithLeftIcon) {
            ListItemWithLeftIcon listItemWithLeftIcon = (ListItemWithLeftIcon) findViewById;
            if (textView == null) {
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                textView = new WaTextView(this);
                textView.setId(R.id.payment_transactions_count);
                textView.setLayoutParams(layoutParams);
                listItemWithLeftIcon.A02(textView);
            }
            listItemWithLeftIcon.setIcon(this.A0L.A0A(this.A0I.A01()));
        } else if (textView == null) {
            return;
        }
        textView.setText(this.A08.A0K().format(j2));
    }

    public void A3F(long j2) {
        View findViewById = findViewById(R.id.starred_messages_layout);
        View findViewById2 = findViewById(R.id.starred_messages_separator);
        if (j2 == 0) {
            findViewById.setVisibility(8);
            if (findViewById2 != null) {
                findViewById2.setVisibility(8);
                return;
            }
            return;
        }
        findViewById.setVisibility(0);
        if (findViewById2 != null) {
            findViewById2.setVisibility(0);
        }
        TextView textView = (TextView) findViewById.findViewById(R.id.starred_messages_count);
        if (textView == null) {
            if (findViewById instanceof ListItemWithLeftIcon) {
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                textView = new WaTextView(this);
                textView.setId(R.id.starred_messages_count);
                textView.setLayoutParams(layoutParams);
                ((ListItemWithLeftIcon) findViewById).A02(textView);
            } else {
                return;
            }
        }
        textView.setText(this.A08.A0K().format(j2));
    }

    public void A3G(Bitmap bitmap) {
        ChatInfoLayoutV2 chatInfoLayoutV2 = (ChatInfoLayoutV2) ((C49662Uu) findViewById(R.id.content));
        C004601z.A0E(chatInfoLayoutV2, R.id.photo_progress).setVisibility(8);
        chatInfoLayoutV2.A06.setImageBitmap(bitmap);
        (chatInfoLayoutV2.A0C ? chatInfoLayoutV2.A06 : chatInfoLayoutV2.A04).setOnClickListener(chatInfoLayoutV2.A0A);
        AnonymousClass0QR r5 = new AnonymousClass0QR(bitmap);
        new C02290As(r5, new C95364mW(this)).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Bitmap[]{r5.A01});
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x008c, code lost:
        if (r15.A09() != false) goto L_0x008e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A3H(android.view.View r13, android.widget.CompoundButton.OnCheckedChangeListener r14, X.AnonymousClass1WS r15) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof com.obwhatsapp.ListItemWithLeftIcon
            if (r0 == 0) goto L_0x0115
            r2 = r13
            com.obwhatsapp.ListItemWithLeftIcon r2 = (com.obwhatsapp.ListItemWithLeftIcon) r2
            r0 = 2131364347(0x7f0a09fb, float:1.8348528E38)
            android.view.View r7 = X.C004601z.A0E(r2, r0)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r0 = 2131364345(0x7f0a09f9, float:1.8348524E38)
            android.view.View r5 = X.C004601z.A0E(r2, r0)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r0 = 2131364781(0x7f0a0bad, float:1.8349409E38)
            android.view.View r4 = r2.findViewById(r0)
            android.widget.CompoundButton r4 = (android.widget.CompoundButton) r4
            if (r4 != 0) goto L_0x003b
            r0 = -2
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r1.<init>(r0, r0)
            androidx.appcompat.widget.SwitchCompat r4 = new androidx.appcompat.widget.SwitchCompat
            r4.<init>(r12)
            r0 = 2131364781(0x7f0a0bad, float:1.8349409E38)
            r4.setId(r0)
            r4.setLayoutParams(r1)
            r2.A02(r4)
        L_0x003b:
            X.0rv r2 = r12.A36()
            X.0rt r1 = r12.A09
            X.0rz r0 = r12.A09
            boolean r3 = X.C222417e.A01(r0, r1, r2)
            r6 = 0
            r4.setOnCheckedChangeListener(r6)
            r2 = 8
            r5.setVisibility(r2)
            r1 = 2
            com.whatsapp.util.ViewOnClickCListenerShape0S0110000_I0 r0 = new com.whatsapp.util.ViewOnClickCListenerShape0S0110000_I0
            r0.<init>(r12, r1, r3)
            r13.setOnClickListener(r0)
            r0 = 2131886099(0x7f120013, float:1.9406767E38)
            if (r3 == 0) goto L_0x0061
            r0 = 2131886343(0x7f120107, float:1.9407262E38)
        L_0x0061:
            X.AnonymousClass2JP.A03(r13, r0)
            r0 = 2131100935(0x7f060507, float:1.7814265E38)
            if (r3 == 0) goto L_0x006c
            r0 = 2131100929(0x7f060501, float:1.7814253E38)
        L_0x006c:
            int r0 = X.AnonymousClass00T.A00(r12, r0)
            if (r3 != 0) goto L_0x0079
            r0 = 2131886122(0x7f12002a, float:1.9406814E38)
            java.lang.String r6 = r12.getString(r0)
        L_0x0079:
            r4.setContentDescription(r6)
            r0 = r3 ^ 1
            r4.setEnabled(r0)
            r4.setClickable(r0)
            r8 = 0
            if (r3 != 0) goto L_0x008e
            boolean r1 = r15.A09()
            r0 = 0
            if (r1 == 0) goto L_0x008f
        L_0x008e:
            r0 = 1
        L_0x008f:
            r4.setChecked(r0)
            if (r3 != 0) goto L_0x00c2
            boolean r0 = r15.A09()
            if (r0 == 0) goto L_0x0111
            long r2 = r15.A00()
            r6 = 0
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 > 0) goto L_0x00aa
            r6 = -1
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x00bf
        L_0x00aa:
            r5.setVisibility(r8)
            X.013 r6 = r12.A08
            r7 = -1
            int r0 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x00c3
            r0 = 2131889567(0x7f120d9f, float:1.9413801E38)
            java.lang.String r0 = r6.A09(r0)
        L_0x00bc:
            r5.setText(r0)
        L_0x00bf:
            r4.setOnCheckedChangeListener(r14)
        L_0x00c2:
            return
        L_0x00c3:
            long r0 = java.lang.System.currentTimeMillis()
            int r11 = X.C42681yF.A00(r0, r2)
            r10 = 0
            r8 = 1
            r9 = 2131889575(0x7f120da7, float:1.9413817E38)
            if (r11 == 0) goto L_0x0104
            r7 = -1
            r9 = 2131889576(0x7f120da8, float:1.941382E38)
            if (r11 == r7) goto L_0x0104
            r7 = -30
            if (r11 <= r7) goto L_0x00f4
            java.lang.String r1 = X.C28891Zc.A01(r6, r2)
            java.lang.String r0 = X.C47672Jx.A00(r6, r2)
            java.lang.String r2 = X.C42681yF.A05(r6, r1, r0)
        L_0x00e8:
            r1 = 2131889574(0x7f120da6, float:1.9413815E38)
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r10] = r2
            java.lang.String r0 = r6.A0C(r1, r0)
            goto L_0x00bc
        L_0x00f4:
            boolean r0 = X.C42681yF.A0B(r0, r2)
            if (r0 == 0) goto L_0x00ff
            java.lang.String r2 = X.C28891Zc.A01(r6, r2)
            goto L_0x00e8
        L_0x00ff:
            java.lang.String r2 = X.C28891Zc.A05(r6, r2)
            goto L_0x00e8
        L_0x0104:
            java.lang.Object[] r1 = new java.lang.Object[r8]
            java.lang.String r0 = X.C47672Jx.A00(r6, r2)
            r1[r10] = r0
            java.lang.String r0 = r6.A0C(r9, r1)
            goto L_0x00bc
        L_0x0111:
            r5.setVisibility(r2)
            goto L_0x00bf
        L_0x0115:
            r0 = 2131364781(0x7f0a0bad, float:1.8349409E38)
            android.view.View r4 = X.C004601z.A0E(r13, r0)
            android.widget.CompoundButton r4 = (android.widget.CompoundButton) r4
            r0 = 2131364775(0x7f0a0ba7, float:1.8349397E38)
            android.view.View r5 = X.C004601z.A0E(r13, r0)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r0 = 2131364777(0x7f0a0ba9, float:1.83494E38)
            android.view.View r7 = X.C004601z.A0E(r13, r0)
            android.widget.TextView r7 = (android.widget.TextView) r7
            goto L_0x003b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2DL.A3H(android.view.View, android.widget.CompoundButton$OnCheckedChangeListener, X.1WS):void");
    }

    public void A3I(AnonymousClass3Q1 r4) {
        r4.A00.A0A(this, new IDxObserverShape115S0100000_2_I0((Object) this, 94));
        r4.A02.A0A(this, new IDxObserverShape115S0100000_2_I0((Object) this, 95));
        r4.A04.A0A(this, new IDxObserverShape115S0100000_2_I0((Object) this, 97));
        r4.A01.A0A(this, new IDxObserverShape113S0100000_1_I0(this, 31));
        r4.A03.A0A(this, new IDxObserverShape115S0100000_2_I0((Object) this, 96));
    }

    public void A3J(Integer num) {
        C49662Uu r4 = (C49662Uu) findViewById(R.id.content);
        ChatInfoLayoutV2 chatInfoLayoutV2 = (ChatInfoLayoutV2) r4;
        C004601z.A0E(chatInfoLayoutV2, R.id.photo_progress).setVisibility(8);
        if (num != null) {
            ImageView imageView = chatInfoLayoutV2.A06;
            imageView.setImageBitmap(C17160ud.A00(imageView.getContext(), chatInfoLayoutV2.A00, num.intValue(), (int) chatInfoLayoutV2.getResources().getDimension(R.dimen.dimen0192)));
        }
        (chatInfoLayoutV2.A0C ? chatInfoLayoutV2.A06 : chatInfoLayoutV2.A04).setOnClickListener(chatInfoLayoutV2.A0A);
        r4.setColor(AnonymousClass00T.A00(this, R.color.color064b));
        findViewById(R.id.bottom_shade).setBackgroundColor(0);
        findViewById(R.id.top_shade).setBackgroundColor(0);
    }

    public void A3K(String str, int i2) {
        View A0E2 = C004601z.A0E(this.A00, R.id.exit_group_btn);
        if (A0E2 instanceof ListItemWithLeftIcon) {
            C48412Nd r1 = (C48412Nd) A0E2;
            r1.setTitle(str);
            r1.setIcon(i2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0095, code lost:
        if (r10 != 13) goto L_0x00ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00c7, code lost:
        if (r10 != 1) goto L_0x00c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00cc, code lost:
        if (r10 != 2) goto L_0x00ce;
     */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00d3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A3L(java.util.ArrayList r23) {
        /*
            r22 = this;
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            r0 = 2131364505(0x7f0a0a99, float:1.8348849E38)
            r7 = r22
            android.view.View r6 = r7.findViewById(r0)
            X.25v r6 = (X.C448425v) r6
            r5 = 1
            com.facebook.redex.IDxCListenerShape274S0100000_2_I0 r4 = new com.facebook.redex.IDxCListenerShape274S0100000_2_I0
            r4.<init>(r7, r5)
            if (r23 == 0) goto L_0x00e7
            boolean r0 = r23.isEmpty()
            if (r0 != 0) goto L_0x00e7
            java.util.Iterator r14 = r23.iterator()
        L_0x0022:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x00e7
            java.lang.Object r9 = r14.next()
            X.0tY r9 = (X.C16730tY) r9
            X.1Vw r0 = r9.A11
            java.lang.String r0 = r0.toString()
            java.lang.String r21 = X.C47612Jr.A04(r0)
            byte r10 = r9.A10
            r1 = 23
            r12 = 9
            r11 = 28
            java.lang.String r19 = " "
            r8 = 2
            r0 = 29
            r3 = 3
            r2 = 13
            if (r10 == r3) goto L_0x0086
            if (r10 == r8) goto L_0x0086
            if (r10 == r2) goto L_0x00b4
            if (r10 == r11) goto L_0x0086
            if (r10 == r0) goto L_0x00b4
            if (r10 == r12) goto L_0x009f
            r0 = 26
            if (r10 == r0) goto L_0x009f
            if (r10 != r1) goto L_0x00c0
            android.content.Context r2 = r7.getBaseContext()
            r1 = 2131232189(0x7f0805bd, float:1.808048E38)
            r0 = 2131101963(0x7f06090b, float:1.781635E38)
            android.graphics.drawable.Drawable r16 = X.AnonymousClass2SR.A02(r2, r1, r0)
        L_0x0068:
            r0 = 2131887589(0x7f1205e5, float:1.940979E38)
        L_0x006b:
            java.lang.String r20 = r7.getString(r0)
        L_0x006f:
            X.3HA r1 = new X.3HA
            r1.<init>(r7, r9)
            com.facebook.redex.IDxFListenerShape90S0200000_2_I0 r0 = new com.facebook.redex.IDxFListenerShape90S0200000_2_I0
            r0.<init>(r9, r5, r7)
            X.2hB r15 = new X.2hB
            r17 = r1
            r18 = r0
            r15.<init>(r16, r17, r18, r19, r20, r21)
            r13.add(r15)
            goto L_0x0022
        L_0x0086:
            int r0 = r9.A00
            X.013 r12 = r7.A08
            if (r0 == 0) goto L_0x0098
            long r0 = (long) r0
            java.lang.String r19 = X.C28961Zl.A04(r12, r0)
        L_0x0091:
            if (r10 == r3) goto L_0x00b8
            if (r10 == r11) goto L_0x00b8
            if (r10 == r2) goto L_0x00b4
            goto L_0x00ae
        L_0x0098:
            long r0 = r9.A01
            java.lang.String r19 = X.AnonymousClass2GQ.A03(r12, r0)
            goto L_0x0091
        L_0x009f:
            r0 = r9
            X.1rA r0 = (X.C38631rA) r0
            int r11 = r0.A00
            if (r11 == 0) goto L_0x00b1
            X.013 r1 = r7.A08
            java.lang.String r0 = r0.A06
            java.lang.String r19 = X.C18820xJ.A05(r1, r0, r11)
        L_0x00ae:
            r16 = 0
            goto L_0x00c9
        L_0x00b1:
            r19 = 0
            goto L_0x00ae
        L_0x00b4:
            r0 = 2131232132(0x7f080584, float:1.8080365E38)
            goto L_0x00bb
        L_0x00b8:
            r0 = 2131232133(0x7f080585, float:1.8080367E38)
        L_0x00bb:
            android.graphics.drawable.Drawable r16 = X.AnonymousClass00T.A04(r7, r0)
            goto L_0x00ce
        L_0x00c0:
            r16 = 0
            r19 = 0
            r0 = 2131887584(0x7f1205e0, float:1.940978E38)
            if (r10 == r5) goto L_0x006b
        L_0x00c9:
            r0 = 2131887573(0x7f1205d5, float:1.9409757E38)
            if (r10 == r8) goto L_0x006b
        L_0x00ce:
            r0 = 2131887593(0x7f1205e9, float:1.9409797E38)
            if (r10 == r3) goto L_0x006b
            r0 = 9
            if (r10 == r0) goto L_0x00e3
            r0 = 2131887580(0x7f1205dc, float:1.9409771E38)
            if (r10 == r2) goto L_0x006b
            r0 = 23
            if (r10 == r0) goto L_0x0068
            r20 = 0
            goto L_0x006f
        L_0x00e3:
            r0 = 2131887579(0x7f1205db, float:1.940977E38)
            goto L_0x006b
        L_0x00e7:
            r6.setSeeMoreClickListener(r4)
            r0 = 12
            r6.A08(r13, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2DL.A3L(java.util.ArrayList):void");
    }

    public void finishAfterTransition() {
        A37();
        super.finishAfterTransition();
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        if (i2 == 34 && i3 == -1) {
            viewMedia((View) null);
        }
    }

    public void onCreate(Bundle bundle) {
        C28381Vw A032;
        if (C455529g.A00) {
            Window window = getWindow();
            window.requestFeature(13);
            if (getIntent().getBooleanExtra("circular_transition", false)) {
                window.requestFeature(12);
                AnonymousClass3MX r2 = new AnonymousClass3MX(true, false);
                r2.addTarget(new C54602hp(this).A00(R.string.str1dd7));
                window.setSharedElementEnterTransition(r2);
                r2.addListener(new C70763hg(this));
            }
            Fade fade = new Fade();
            fade.excludeTarget(16908335, true);
            fade.excludeTarget(16908336, true);
            window.setReturnTransition(fade);
            window.setEnterTransition(fade);
            window.addFlags(Integer.MIN_VALUE);
            window.clearFlags(67108864);
        }
        A1X(5);
        super.onCreate(bundle);
        if (bundle != null && (A032 = AnonymousClass1yL.A03(bundle, "requested_message")) != null) {
            this.A0M = (C16730tY) this.A0A.A0K.A03(A032);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        A37();
    }

    public void onPause() {
        super.onPause();
        if (isFinishing()) {
            A37();
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        C16730tY r0 = this.A0M;
        if (r0 != null) {
            AnonymousClass1yL.A09(bundle, r0.A11, "requested_message");
        }
    }

    public final void viewMedia(View view) {
        if (this.A0M != null) {
            C54592ho r1 = new C54592ho(this);
            C15830rv A36 = A36();
            AnonymousClass00B.A06(A36);
            r1.A03 = A36;
            r1.A04 = this.A0M.A11;
            r1.A00 = 34;
            Intent A002 = r1.A00();
            if (view != null) {
                C455529g.A08(this, A002, view, new C54602hp(this), C47612Jr.A04(this.A0M.A11.toString()));
            } else {
                startActivity(A002);
            }
        }
    }
}
