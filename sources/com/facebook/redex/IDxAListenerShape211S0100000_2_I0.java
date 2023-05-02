package com.facebook.redex;

import X.AnonymousClass29G;
import X.AnonymousClass2A5;
import X.AnonymousClass2P5;
import android.view.KeyEvent;
import android.widget.TextView;
import com.obwhatsapp.WaEditText;
import com.obwhatsapp.gifsearch.GifSearchContainer;
import com.obwhatsapp.notification.PopupNotification;
import com.obwhatsapp.search.SearchViewModel;
import com.obwhatsapp.search.views.TokenizedSearchInput;
import com.obwhatsapp.status.playback.MessageReplyActivity;
import com.obwhatsapp.textstatuscomposer.TextStatusComposerActivity;
import com.whatsapp.util.Log;

public class IDxAListenerShape211S0100000_2_I0 implements TextView.OnEditorActionListener {
    public Object A00;
    public final int A01;

    public IDxAListenerShape211S0100000_2_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
        switch (this.A01) {
            case 0:
                GifSearchContainer gifSearchContainer = (GifSearchContainer) this.A00;
                if (i2 == 3) {
                    WaEditText waEditText = gifSearchContainer.A07;
                    if (waEditText != null) {
                        waEditText.A03();
                        break;
                    }
                } else {
                    return false;
                }
                break;
            case 1:
                AnonymousClass2A5 r2 = (AnonymousClass2A5) this.A00;
                if (keyEvent != null && keyEvent.getKeyCode() == 66) {
                    r2.A07.A03();
                    break;
                } else {
                    return false;
                }
                break;
            case 2:
                AnonymousClass29G r1 = (AnonymousClass29G) this.A00;
                if (i2 == 6) {
                    Log.i("MediaCaptionDialog/dismiss/send");
                    r1.onDismiss();
                    break;
                } else {
                    return false;
                }
            case 3:
                PopupNotification popupNotification = (PopupNotification) this.A00;
                if (i2 == 4) {
                    popupNotification.A2q();
                    break;
                } else {
                    return false;
                }
            case 4:
                SearchViewModel searchViewModel = ((TokenizedSearchInput) this.A00).A0C;
                if (searchViewModel != null && i2 == 3) {
                    searchViewModel.A0Y(false);
                    break;
                } else {
                    return false;
                }
            case 5:
                MessageReplyActivity messageReplyActivity = (MessageReplyActivity) this.A00;
                if (i2 == 4) {
                    messageReplyActivity.A3C(false);
                    break;
                } else {
                    return false;
                }
            case 6:
                TextStatusComposerActivity textStatusComposerActivity = (TextStatusComposerActivity) this.A00;
                if (i2 == 4) {
                    textStatusComposerActivity.A3A();
                    textStatusComposerActivity.A39();
                    break;
                } else {
                    return false;
                }
            default:
                AnonymousClass2P5 r22 = (AnonymousClass2P5) this.A00;
                if (keyEvent != null && keyEvent.getKeyCode() == 66) {
                    r22.A05.A03();
                    break;
                } else {
                    return false;
                }
        }
        return true;
    }
}
