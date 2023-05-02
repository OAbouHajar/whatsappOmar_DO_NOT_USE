package X;

import android.content.Context;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.obwhatsapp.R;
import com.obwhatsapp.WaImageView;
import com.obwhatsapp.WaRoundCornerImageView;
import com.obwhatsapp.components.button.ThumbnailPickerButton;
import com.obwhatsapp.inappsupport.ui.AddScreenshotImageView;
import com.obwhatsapp.location.ContactLiveLocationThumbnail;
import com.obwhatsapp.search.views.MessageThumbView;
import com.whatsapp.stickers.StickerView;

/* renamed from: X.1e7  reason: invalid class name and case insensitive filesystem */
public abstract class C31401e7 extends C006002o implements AnonymousClass006 {
    public C52662eE A00;
    public boolean A01;

    public C31401e7(Context context) {
        super(context, (AttributeSet) null);
        A02();
    }

    public C31401e7(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A02();
    }

    public C31401e7(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        A02();
    }

    public static Paint A01(View view) {
        Paint paint = new Paint();
        paint.setColor(AnonymousClass00T.A00(view.getContext(), R.color.color06c5));
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setDither(true);
        return paint;
    }

    public void A02() {
        if (this instanceof StickerView) {
            StickerView stickerView = (StickerView) this;
            if (!stickerView.A02) {
                stickerView.A02 = true;
                stickerView.A00 = (AnonymousClass013) ((C52652eD) ((C52642eC) stickerView.generatedComponent())).A07.AR8.get();
            }
        } else if (this instanceof MessageThumbView) {
            MessageThumbView messageThumbView = (MessageThumbView) this;
            if (!messageThumbView.A03) {
                messageThumbView.A03 = true;
                C16150sX r1 = ((C52652eD) ((C52642eC) messageThumbView.generatedComponent())).A07;
                messageThumbView.A00 = (AnonymousClass013) r1.AR8.get();
                messageThumbView.A02 = (C25791Ld) r1.AFY.get();
            }
        } else if (this instanceof AddScreenshotImageView) {
            AddScreenshotImageView addScreenshotImageView = (AddScreenshotImageView) this;
            if (!addScreenshotImageView.A0G) {
                addScreenshotImageView.A0G = true;
                addScreenshotImageView.A00 = (AnonymousClass013) ((C52652eD) ((C52642eC) addScreenshotImageView.generatedComponent())).A07.AR8.get();
            }
        } else if (this instanceof AnonymousClass2QI) {
            AnonymousClass2QI r12 = (AnonymousClass2QI) this;
            if (r12 instanceof C55362jQ) {
                C55362jQ r13 = (C55362jQ) r12;
                if (r13 instanceof C55372jR) {
                    C55372jR r14 = (C55372jR) r13;
                    if (!r14.A00) {
                        r14.A00 = true;
                        r14.A00 = (AnonymousClass013) ((C52652eD) ((C52642eC) r14.generatedComponent())).A07.AR8.get();
                    }
                } else if (!r13.A00) {
                    r13.A00 = true;
                    r13.A00 = (AnonymousClass013) ((C52652eD) ((C52642eC) r13.generatedComponent())).A07.AR8.get();
                }
            } else if (r12 instanceof ContactLiveLocationThumbnail) {
                ContactLiveLocationThumbnail contactLiveLocationThumbnail = (ContactLiveLocationThumbnail) r12;
                if (!contactLiveLocationThumbnail.A04) {
                    contactLiveLocationThumbnail.A04 = true;
                    contactLiveLocationThumbnail.A00 = (AnonymousClass013) ((C52652eD) ((C52642eC) contactLiveLocationThumbnail.generatedComponent())).A07.AR8.get();
                }
            } else if (r12 instanceof ThumbnailPickerButton) {
                ThumbnailPickerButton thumbnailPickerButton = (ThumbnailPickerButton) r12;
                if (!thumbnailPickerButton.A01) {
                    thumbnailPickerButton.A01 = true;
                    thumbnailPickerButton.A00 = (AnonymousClass013) ((C52652eD) ((C52642eC) thumbnailPickerButton.generatedComponent())).A07.AR8.get();
                }
            } else if (r12 instanceof C55382jV) {
                C55382jV r15 = (C55382jV) r12;
                if (!r15.A00) {
                    r15.A00 = true;
                    r15.A00 = (AnonymousClass013) ((C52652eD) ((C52642eC) r15.generatedComponent())).A07.AR8.get();
                }
            } else if (!r12.A00) {
                r12.A00 = true;
                r12.A00 = (AnonymousClass013) ((C52652eD) ((C52642eC) r12.generatedComponent())).A07.AR8.get();
            }
        } else if (this instanceof WaRoundCornerImageView) {
            WaRoundCornerImageView waRoundCornerImageView = (WaRoundCornerImageView) this;
            if (!waRoundCornerImageView.A03) {
                waRoundCornerImageView.A03 = true;
                waRoundCornerImageView.A00 = (AnonymousClass013) ((C52652eD) ((C52642eC) waRoundCornerImageView.generatedComponent())).A07.AR8.get();
            }
        } else if (this instanceof C55392jX) {
            C55392jX r16 = (C55392jX) this;
            if (!r16.A00) {
                r16.A00 = true;
                r16.A00 = (AnonymousClass013) ((C52652eD) ((C52642eC) r16.generatedComponent())).A07.AR8.get();
            }
        } else if (!this.A01) {
            this.A01 = true;
            ((WaImageView) this).A00 = (AnonymousClass013) ((C52652eD) ((C52642eC) generatedComponent())).A07.AR8.get();
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
