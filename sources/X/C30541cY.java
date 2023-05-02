package X;

import android.content.Context;
import android.util.AttributeSet;
import com.obwhatsapp.CopyableTextView;
import com.obwhatsapp.FAQTextView;
import com.obwhatsapp.TextEmojiLabel;
import com.obwhatsapp.WaTextView;
import com.obwhatsapp.biz.catalog.view.EllipsizedTextEmojiLabel;
import com.obwhatsapp.storage.SizeTickerView;
import com.obwhatsapp.text.AutoSizeTextView;
import com.obwhatsapp.text.CondensedTextView;
import com.obwhatsapp.ui.media.MediaCaptionTextView;

/* renamed from: X.1cY  reason: invalid class name and case insensitive filesystem */
public abstract class C30541cY extends AnonymousClass02Z implements AnonymousClass006 {
    public C52662eE A00;
    public boolean A01;

    public C30541cY(Context context) {
        super(context, (AttributeSet) null);
        A00();
    }

    public C30541cY(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }

    public C30541cY(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        A00();
    }

    public void A00() {
        C52642eC r1;
        C52642eC r0;
        MediaCaptionTextView mediaCaptionTextView;
        CondensedTextView condensedTextView;
        if (this instanceof CondensedTextView) {
            CondensedTextView condensedTextView2 = (CondensedTextView) this;
            if (!condensedTextView2.A02) {
                condensedTextView2.A02 = true;
                r1 = (C52642eC) condensedTextView2.generatedComponent();
                condensedTextView = condensedTextView2;
            } else {
                return;
            }
        } else if (this instanceof AutoSizeTextView) {
            AutoSizeTextView autoSizeTextView = (AutoSizeTextView) this;
            if (!autoSizeTextView.A03) {
                autoSizeTextView.A03 = true;
                r1 = (C52642eC) autoSizeTextView.generatedComponent();
                condensedTextView = autoSizeTextView;
            } else {
                return;
            }
        } else if (this instanceof SizeTickerView) {
            SizeTickerView sizeTickerView = (SizeTickerView) this;
            if (!sizeTickerView.A07) {
                sizeTickerView.A07 = true;
                r1 = (C52642eC) sizeTickerView.generatedComponent();
                condensedTextView = sizeTickerView;
            } else {
                return;
            }
        } else if (this instanceof C30531cW) {
            C30531cW r12 = (C30531cW) this;
            if (r12 instanceof C49742Vo) {
                C49742Vo r13 = (C49742Vo) r12;
                if (r13 instanceof MediaCaptionTextView) {
                    MediaCaptionTextView mediaCaptionTextView2 = (MediaCaptionTextView) r13;
                    if (!mediaCaptionTextView2.A00) {
                        mediaCaptionTextView2.A00 = true;
                        r0 = (C52642eC) mediaCaptionTextView2.generatedComponent();
                        mediaCaptionTextView = mediaCaptionTextView2;
                    } else {
                        return;
                    }
                } else if (!r13.A00) {
                    r13.A00 = true;
                    r0 = (C52642eC) r13.generatedComponent();
                    mediaCaptionTextView = r13;
                } else {
                    return;
                }
            } else if (r12 instanceof EllipsizedTextEmojiLabel) {
                EllipsizedTextEmojiLabel ellipsizedTextEmojiLabel = (EllipsizedTextEmojiLabel) r12;
                if (!ellipsizedTextEmojiLabel.A06) {
                    ellipsizedTextEmojiLabel.A06 = true;
                    r0 = (C52642eC) ellipsizedTextEmojiLabel.generatedComponent();
                    mediaCaptionTextView = ellipsizedTextEmojiLabel;
                } else {
                    return;
                }
            } else if (r12 instanceof FAQTextView) {
                FAQTextView fAQTextView = (FAQTextView) r12;
                if (!fAQTextView.A03) {
                    fAQTextView.A03 = true;
                    C16150sX r2 = ((C52652eD) ((C52642eC) fAQTextView.generatedComponent())).A07;
                    fAQTextView.A01 = (AnonymousClass013) r2.AR8.get();
                    fAQTextView.A02 = (C14710pd) r2.A05.get();
                    fAQTextView.A0A = (C17250um) r2.A7e.get();
                    fAQTextView.A09 = (AnonymousClass01V) r2.AOi.get();
                    fAQTextView.A0B = (C17020u3) r2.AMG.get();
                    fAQTextView.A00 = (C14870pt) r2.AB3.get();
                    fAQTextView.A02 = (C17220uj) r2.A9x.get();
                    fAQTextView.A01 = (C17090uW) r2.ADM.get();
                    return;
                }
                return;
            } else if (!r12.A00) {
                r12.A00 = true;
                r0 = (C52642eC) r12.generatedComponent();
                mediaCaptionTextView = (TextEmojiLabel) r12;
            } else {
                return;
            }
            C16150sX r22 = ((C52652eD) r0).A07;
            mediaCaptionTextView.A01 = (AnonymousClass013) r22.AR8.get();
            mediaCaptionTextView.A02 = (C14710pd) r22.A05.get();
            mediaCaptionTextView.A0A = (C17250um) r22.A7e.get();
            mediaCaptionTextView.A09 = (AnonymousClass01V) r22.AOi.get();
            mediaCaptionTextView.A0B = (C17020u3) r22.AMG.get();
            return;
        } else if (this instanceof CopyableTextView) {
            CopyableTextView copyableTextView = (CopyableTextView) this;
            if (!copyableTextView.A04) {
                copyableTextView.A04 = true;
                C16150sX r14 = ((C52652eD) ((C52642eC) copyableTextView.generatedComponent())).A07;
                copyableTextView.A01 = (AnonymousClass013) r14.AR8.get();
                copyableTextView.A02 = (C14710pd) r14.A05.get();
                copyableTextView.A00 = (C14870pt) r14.AB3.get();
                copyableTextView.A01 = (AnonymousClass01V) r14.AOi.get();
                return;
            }
            return;
        } else if (!this.A01) {
            this.A01 = true;
            r1 = (C52642eC) generatedComponent();
            condensedTextView = (WaTextView) this;
        } else {
            return;
        }
        C16150sX r23 = ((C52652eD) r1).A07;
        condensedTextView.A01 = (AnonymousClass013) r23.AR8.get();
        condensedTextView.A02 = (C14710pd) r23.A05.get();
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
