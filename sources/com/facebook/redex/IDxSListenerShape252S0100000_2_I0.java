package com.facebook.redex;

import X.AnonymousClass2JH;
import X.AnonymousClass3NN;
import X.C14700pc;
import X.C34771kq;
import X.C49662Uu;
import android.view.View;
import android.view.animation.Animation;
import android.widget.AbsListView;
import com.obwhatsapp.calling.callhistory.CallLogActivity;
import com.obwhatsapp.chatinfo.ListChatInfoActivity;
import com.obwhatsapp.contact.picker.ContactPickerFragment;
import com.obwhatsapp.conversationslist.ConversationsFragment;
import com.obwhatsapp.emoji.EmojiPopupFooter;

public class IDxSListenerShape252S0100000_2_I0 implements AbsListView.OnScrollListener {
    public Object A00;
    public final int A01;

    public IDxSListenerShape252S0100000_2_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public void onScroll(AbsListView absListView, int i2, int i3, int i4) {
        switch (this.A01) {
            case 0:
                ((CallLogActivity) this.A00).A36();
                return;
            case 1:
                ((ListChatInfoActivity) this.A00).A3Q();
                return;
            case 2:
                ((C49662Uu) this.A00).A08();
                return;
            case 3:
                ContactPickerFragment contactPickerFragment = (ContactPickerFragment) this.A00;
                View view = contactPickerFragment.A0B;
                if (view == null) {
                    return;
                }
                if (i2 != 0) {
                    view.setVisibility(8);
                    return;
                } else if (contactPickerFragment.A2w.containsKey(C34771kq.A00)) {
                    contactPickerFragment.A0B.setVisibility(0);
                    View childAt = absListView.getChildAt(0);
                    if (childAt != null) {
                        contactPickerFragment.A0B.setAlpha(((float) (childAt.getHeight() + childAt.getTop())) / ((float) childAt.getHeight()));
                        contactPickerFragment.A0B.setTranslationY((float) childAt.getTop());
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 4:
                return;
            default:
                AnonymousClass2JH r3 = (AnonymousClass2JH) this.A00;
                int height = r3.A08.getHeight();
                int i5 = r3.A02;
                if (i5 >= i2) {
                    height = -1;
                    if (i5 > i2) {
                        height = 0;
                    }
                }
                r3.A02 = i2;
                if (height >= 0) {
                    EmojiPopupFooter emojiPopupFooter = r3.A08;
                    if (height != emojiPopupFooter.A00) {
                        Animation animation = emojiPopupFooter.getAnimation();
                        if (!(animation instanceof AnonymousClass3NN) || ((AnonymousClass3NN) animation).A00 != height) {
                            if (animation != null) {
                                animation.cancel();
                            }
                            r3.A08.startAnimation(new AnonymousClass3NN(r3, height));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public void onScrollStateChanged(AbsListView absListView, int i2) {
        switch (this.A01) {
            case 2:
                ((C49662Uu) this.A00).A08();
                return;
            case 4:
                if (i2 != 0) {
                    if (i2 == 1) {
                        ((ConversationsFragment) this.A00).A23.A01(2);
                    }
                    C14700pc r0 = ((ConversationsFragment) this.A00).A2C;
                    if (r0 != null) {
                        r0.A00();
                        return;
                    }
                    return;
                }
                ((ConversationsFragment) this.A00).A23.A00();
                return;
            default:
                return;
        }
    }
}
