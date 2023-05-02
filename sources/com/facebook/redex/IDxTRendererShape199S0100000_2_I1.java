package com.facebook.redex;

import X.AnonymousClass25V;
import X.AnonymousClass2Q7;
import X.AnonymousClass30X;
import X.AnonymousClass31D;
import X.AnonymousClass31L;
import X.AnonymousClass31O;
import X.AnonymousClass31P;
import X.AnonymousClass31Q;
import X.C13680ns;
import X.C13700nu;
import X.C61783Ah;
import X.C70593hK;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.obwhatsapp.R;
import com.whatsapp.util.Log;

public class IDxTRendererShape199S0100000_2_I1 implements AnonymousClass25V {
    public Object A00;
    public final int A01;

    public IDxTRendererShape199S0100000_2_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public int AG6() {
        Resources resources;
        int i2;
        switch (this.A01) {
            case 0:
                return 0;
            case 1:
                return 96;
            case 2:
                resources = ((View) this.A00).getResources();
                i2 = R.dimen.dimen0276;
                break;
            case 3:
                resources = C13680ns.A0D(((C61783Ah) this.A00).A0F);
                i2 = R.dimen.dimen0288;
                break;
            case 4:
                return ((AnonymousClass31L) this.A00).A0D.getRowWidth();
            case 5:
                resources = ((AnonymousClass31Q) this.A00).A01;
                i2 = R.dimen.dimen05d3;
                break;
            case 6:
                resources = ((AnonymousClass31P) this.A00).A01;
                break;
            default:
                C70593hK r0 = ((AnonymousClass31O) this.A00).A00;
                if (r0 != null) {
                    resources = C13680ns.A0D(r0);
                    break;
                } else {
                    return 0;
                }
        }
        i2 = R.dimen.dimen04c9;
        return resources.getDimensionPixelSize(i2);
    }

    public /* synthetic */ void ARJ() {
        switch (this.A01) {
            case 3:
                Log.w("ConversationRowSticker/onFileReadError");
                ((C61783Ah) this.A00).A01 = false;
                return;
            case 4:
                ((AnonymousClass2Q7) this.A00).A1P();
                return;
            default:
                return;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x007b, code lost:
        if (r5 != null) goto L_0x007d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007d, code lost:
        r2.setImageBitmap(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0080, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x009a, code lost:
        r2.setImageResource(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x009d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00ac, code lost:
        r0.setImageBitmap(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00af, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b0, code lost:
        r0 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b2, code lost:
        r2.setVisibility(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00b5, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void AfV(android.graphics.Bitmap r5, android.view.View r6, X.C16740tZ r7) {
        /*
            r4 = this;
            int r0 = r4.A01
            switch(r0) {
                case 0: goto L_0x000d;
                case 1: goto L_0x005d;
                case 2: goto L_0x0069;
                case 3: goto L_0x0081;
                case 4: goto L_0x0026;
                case 5: goto L_0x009e;
                case 6: goto L_0x0075;
                default: goto L_0x0005;
            }
        L_0x0005:
            if (r5 == 0) goto L_0x0020
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            r6.setImageBitmap(r5)
        L_0x000c:
            return
        L_0x000d:
            if (r5 == 0) goto L_0x000c
            java.lang.Object r0 = r4.A00
            X.38N r0 = (X.AnonymousClass38N) r0
            com.obwhatsapp.WaImageView r2 = r0.A06
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.CENTER_CROP
            r2.setScaleType(r0)
            r2.setImageBitmap(r5)
            r0 = 0
            goto L_0x00b2
        L_0x0020:
            r0 = 8
            r6.setVisibility(r0)
            return
        L_0x0026:
            r3 = 0
            java.lang.Object r2 = r4.A00
            X.31L r2 = (X.AnonymousClass31L) r2
            if (r5 == 0) goto L_0x0047
            android.content.res.Resources r1 = X.C13680ns.A0D(r2)
            android.graphics.drawable.BitmapDrawable r0 = new android.graphics.drawable.BitmapDrawable
            r0.<init>(r1, r5)
            r2.setThumbnail(r0)
            com.obwhatsapp.conversation.conversationrow.ConversationRowVideo$RowVideoView r2 = r2.A0D
            int r1 = r5.getWidth()
            int r0 = r5.getHeight()
            r2.A02(r1, r0, r3)
            return
        L_0x0047:
            r2.A03 = r3
            android.content.Context r1 = r2.getContext()
            r0 = 2131100093(0x7f0601bd, float:1.7812558E38)
            int r1 = X.AnonymousClass00T.A00(r1, r0)
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>(r1)
            r2.setThumbnail(r0)
            return
        L_0x005d:
            java.lang.Object r0 = r4.A00
            X.30X r0 = (X.AnonymousClass30X) r0
            android.widget.ImageView r2 = r0.A05
            if (r5 != 0) goto L_0x007d
            r0 = 2131230913(0x7f0800c1, float:1.8077892E38)
            goto L_0x009a
        L_0x0069:
            java.lang.Object r0 = r4.A00
            X.31D r0 = (X.AnonymousClass31D) r0
            android.widget.ImageView r2 = r0.A0A
            if (r5 != 0) goto L_0x007d
            r0 = 2131232138(0x7f08058a, float:1.8080377E38)
            goto L_0x009a
        L_0x0075:
            java.lang.Object r0 = r4.A00
            X.31P r0 = (X.AnonymousClass31P) r0
            com.obwhatsapp.WaImageView r2 = r0.A00
            if (r5 == 0) goto L_0x00b0
        L_0x007d:
            r2.setImageBitmap(r5)
            return
        L_0x0081:
            if (r5 == 0) goto L_0x008e
            boolean r0 = r7 instanceof X.C16730tY
            if (r0 == 0) goto L_0x008e
            java.lang.Object r0 = r4.A00
            X.3Ah r0 = (X.C61783Ah) r0
            com.whatsapp.stickers.StickerView r0 = r0.A0F
            goto L_0x00ac
        L_0x008e:
            java.lang.Object r1 = r4.A00
            X.3Ah r1 = (X.C61783Ah) r1
            r0 = 0
            r1.A01 = r0
            com.whatsapp.stickers.StickerView r2 = r1.A0F
            r0 = 2131232490(0x7f0806ea, float:1.808109E38)
        L_0x009a:
            r2.setImageResource(r0)
            return
        L_0x009e:
            java.lang.Object r1 = r4.A00
            X.31Q r1 = (X.AnonymousClass31Q) r1
            com.obwhatsapp.WaImageView r2 = r1.A00
            if (r5 == 0) goto L_0x00b0
            r0 = 0
            r2.setVisibility(r0)
            com.obwhatsapp.WaImageView r0 = r1.A00
        L_0x00ac:
            r0.setImageBitmap(r5)
            return
        L_0x00b0:
            r0 = 8
        L_0x00b2:
            r2.setVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxTRendererShape199S0100000_2_I1.AfV(android.graphics.Bitmap, android.view.View, X.0tZ):void");
    }

    public /* synthetic */ void Afm(View view) {
        ImageView imageView;
        int i2;
        switch (this.A01) {
            case 0:
                return;
            case 1:
                imageView = ((AnonymousClass30X) this.A00).A05;
                i2 = R.drawable.avatar_group;
                break;
            case 2:
                ImageView imageView2 = ((AnonymousClass31D) this.A00).A0A;
                imageView2.setImageDrawable((Drawable) null);
                imageView2.setBackgroundColor(-7829368);
                return;
            case 3:
                Log.w("ConversationRowSticker/showPlaceholder");
                C61783Ah r1 = (C61783Ah) this.A00;
                r1.A01 = false;
                imageView = r1.A0F;
                i2 = R.drawable.sticker_error_in_conversation;
                break;
            case 4:
                AnonymousClass31L r2 = (AnonymousClass31L) this.A00;
                r2.A03 = false;
                r2.setThumbnail(new ColorDrawable(-7829368));
                return;
            case 5:
                C13700nu.A0L(view.getContext(), ((AnonymousClass31Q) this.A00).A00, R.drawable.vec_ic_receipt_24dp);
                return;
            case 6:
                ((AnonymousClass31P) this.A00).A00.setVisibility(8);
                return;
            default:
                view.setVisibility(8);
                return;
        }
        imageView.setImageResource(i2);
    }
}
