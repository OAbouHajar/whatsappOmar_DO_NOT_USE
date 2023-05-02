package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.obwhatsapp.biz.linkedaccounts.LinkedAccountsMediaCard;
import com.obwhatsapp.chatinfo.view.custom.ChatInfoMediaCardV2;
import com.obwhatsapp.ui.media.MediaCardGrid;

/* renamed from: X.25y  reason: invalid class name and case insensitive filesystem */
public abstract class C448625y extends LinearLayout implements AnonymousClass006 {
    public C52662eE A00;
    public boolean A01;

    public C448625y(Context context) {
        super(context);
        A00();
    }

    public C448625y(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }

    public C448625y(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        A00();
    }

    public C448625y(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        A00();
    }

    public void A00() {
        ChatInfoMediaCardV2 chatInfoMediaCardV2;
        if (this instanceof MediaCardGrid) {
            MediaCardGrid mediaCardGrid = (MediaCardGrid) this;
            if (!mediaCardGrid.A04) {
                mediaCardGrid.A04 = true;
                C16150sX r1 = ((C52652eD) ((C52642eC) mediaCardGrid.generatedComponent())).A07;
                mediaCardGrid.A0B = (AnonymousClass013) r1.AR8.get();
                mediaCardGrid.A01 = (AnonymousClass01V) r1.AOi.get();
            }
        } else if (this instanceof C448325u) {
            C448325u r3 = (C448325u) this;
            if (r3 instanceof ChatInfoMediaCardV2) {
                ChatInfoMediaCardV2 chatInfoMediaCardV22 = (ChatInfoMediaCardV2) r3;
                if (!chatInfoMediaCardV22.A00) {
                    chatInfoMediaCardV22.A00 = true;
                    chatInfoMediaCardV2 = chatInfoMediaCardV22;
                } else {
                    return;
                }
            } else if (r3 instanceof LinkedAccountsMediaCard) {
                LinkedAccountsMediaCard linkedAccountsMediaCard = (LinkedAccountsMediaCard) r3;
                if (!linkedAccountsMediaCard.A07) {
                    linkedAccountsMediaCard.A07 = true;
                    C52652eD r2 = (C52652eD) ((C52642eC) linkedAccountsMediaCard.generatedComponent());
                    C16150sX r12 = r2.A07;
                    linkedAccountsMediaCard.A0B = (AnonymousClass013) r12.AR8.get();
                    linkedAccountsMediaCard.A01 = (C19980zJ) r12.A0P.get();
                    linkedAccountsMediaCard.A04 = (C26781Pd) r12.ADO.get();
                    linkedAccountsMediaCard.A05 = (AnonymousClass1P1) r12.ADP.get();
                    linkedAccountsMediaCard.A02 = (C52932eg) r2.A02.get();
                    return;
                }
                return;
            } else if (!r3.A00) {
                r3.A00 = true;
                chatInfoMediaCardV2 = r3;
            } else {
                return;
            }
            chatInfoMediaCardV2.A0B = (AnonymousClass013) ((C52652eD) ((C52642eC) chatInfoMediaCardV2.generatedComponent())).A07.AR8.get();
        } else if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A00;
        if (r0 == null) {
            r0 = new C52662eE(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }
}
