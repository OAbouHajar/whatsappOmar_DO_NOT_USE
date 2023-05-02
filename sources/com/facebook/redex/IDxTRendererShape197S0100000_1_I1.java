package com.facebook.redex;

import X.AnonymousClass00T;
import X.AnonymousClass1A9;
import X.AnonymousClass25V;
import X.AnonymousClass2Q7;
import X.AnonymousClass2SR;
import X.AnonymousClass318;
import X.AnonymousClass319;
import X.AnonymousClass31B;
import X.C13680ns;
import X.C16730tY;
import X.C16740tZ;
import X.C16750ta;
import X.C18820xJ;
import X.C30031bd;
import X.C31171dd;
import X.C57722re;
import X.C602430q;
import X.C602930v;
import X.C603030w;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.ImageView;
import com.obwhatsapp.R;
import com.obwhatsapp.components.button.ThumbnailButton;
import com.obwhatsapp.conversation.conversationrow.ConversationRowImage$RowImageView;
import com.obwhatsapp.conversation.conversationrow.ConversationRowVideo$RowVideoView;
import com.obwhatsapp.webpagepreview.WebPagePreviewView;

public class IDxTRendererShape197S0100000_1_I1 implements AnonymousClass25V {
    public Object A00;
    public final int A01;

    public IDxTRendererShape197S0100000_1_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public int AG6() {
        switch (this.A01) {
            case 0:
                return ((View) this.A00).getResources().getDimensionPixelSize(R.dimen.dimen0276);
            case 1:
            case 3:
                return C31171dd.A02((View) this.A00);
            case 2:
                return ((AnonymousClass31B) this.A00).A04.A02.A03();
            case 4:
                C30031bd r2 = (C30031bd) this.A00;
                int i2 = 72;
                if (r2.A0S) {
                    i2 = 100;
                }
                return C31171dd.A01(r2.getContext(), i2);
            default:
                C57722re r22 = (C57722re) this.A00;
                return r22.A0A.A06.A03(r22.A09.A0N.getContext());
        }
    }

    public void ARJ() {
        if (5 - this.A01 != 0) {
            ((AnonymousClass2Q7) this.A00).A1P();
        }
    }

    public void AfV(Bitmap bitmap, View view, C16740tZ r8) {
        AnonymousClass318 r3;
        ImageView imageView;
        int i2;
        ImageView.ScaleType scaleType;
        int i3;
        int i4;
        C16750ta r0;
        int i5;
        int i6;
        switch (this.A01) {
            case 0:
                if (bitmap != null) {
                    String str = ((C16730tY) r8).A06;
                    if (str == null || (!C18820xJ.A07(str) && !AnonymousClass1A9.A0T(str))) {
                        r3 = (AnonymousClass318) this.A00;
                        imageView = r3.A09;
                        scaleType = ImageView.ScaleType.MATRIX;
                    } else {
                        r3 = (AnonymousClass318) this.A00;
                        imageView = r3.A09;
                        scaleType = ImageView.ScaleType.CENTER_CROP;
                    }
                    imageView.setScaleType(scaleType);
                    imageView.setImageBitmap(bitmap);
                    i2 = 0;
                } else {
                    r3 = (AnonymousClass318) this.A00;
                    imageView = r3.A09;
                    imageView.setTag((Object) null);
                    i2 = 8;
                }
                imageView.setVisibility(i2);
                r3.A04.setVisibility(i2);
                return;
            case 1:
                C602430q r4 = (C602430q) this.A00;
                if (bitmap != null) {
                    ConversationRowVideo$RowVideoView conversationRowVideo$RowVideoView = r4.A0A;
                    conversationRowVideo$RowVideoView.setImageDrawable(new BitmapDrawable(C13680ns.A0D(r4), bitmap));
                    int width = bitmap.getWidth();
                    int height = bitmap.getHeight();
                    if (r4.A00 <= 0 || r4.A01 <= 0) {
                        r4.A00 = height;
                        r4.A01 = width;
                    }
                    conversationRowVideo$RowVideoView.A02(width, height, false);
                    return;
                }
                r4.A0A.setImageDrawable(new ColorDrawable(AnonymousClass00T.A00(r4.getContext(), R.color.color01bd)));
                return;
            case 2:
                if (bitmap == null || !(r8 instanceof C16730tY)) {
                    AnonymousClass31B r2 = (AnonymousClass31B) this.A00;
                    ConversationRowImage$RowImageView conversationRowImage$RowImageView = r2.A04;
                    conversationRowImage$RowImageView.setScaleType(ImageView.ScaleType.CENTER);
                    conversationRowImage$RowImageView.setImageDrawable(AnonymousClass2SR.A05(r2.getResources(), conversationRowImage$RowImageView, r2));
                    r2.A07 = false;
                    return;
                }
                C16750ta A002 = C16730tY.A00((C16730tY) r8);
                int i7 = A002.A08;
                if (!(i7 == 0 || (i3 = A002.A06) == 0)) {
                    AnonymousClass31B r02 = (AnonymousClass31B) this.A00;
                    boolean z2 = r02 instanceof AnonymousClass319;
                    ConversationRowImage$RowImageView conversationRowImage$RowImageView2 = r02.A04;
                    conversationRowImage$RowImageView2.A04(i7, i3);
                    conversationRowImage$RowImageView2.setScaleType((r02.A0S || z2) ? ImageView.ScaleType.CENTER_CROP : ImageView.ScaleType.MATRIX);
                }
                ((AnonymousClass31B) this.A00).A04.setImageBitmap(bitmap);
                return;
            case 3:
                C602930v r03 = (C602930v) this.A00;
                ConversationRowVideo$RowVideoView conversationRowVideo$RowVideoView2 = r03.A06;
                if (bitmap != null) {
                    conversationRowVideo$RowVideoView2.setImageDrawable(new BitmapDrawable(C13680ns.A0D(r03), bitmap));
                    i5 = bitmap.getWidth();
                    i6 = bitmap.getHeight();
                } else {
                    conversationRowVideo$RowVideoView2.setImageDrawable(new ColorDrawable(AnonymousClass00T.A00(r03.getContext(), R.color.color01bd)));
                    if ((r8 instanceof C16730tY) && (r0 = ((C16730tY) r8).A02) != null) {
                        i5 = r0.A08;
                        i6 = r0.A06;
                    } else {
                        return;
                    }
                }
                conversationRowVideo$RowVideoView2.A02(i5, i6, false);
                return;
            case 4:
                if (bitmap == null || !(r8 instanceof C16730tY)) {
                    C603030w r22 = (C603030w) this.A00;
                    ConversationRowImage$RowImageView conversationRowImage$RowImageView3 = r22.A0G;
                    conversationRowImage$RowImageView3.setScaleType(ImageView.ScaleType.CENTER);
                    conversationRowImage$RowImageView3.setImageDrawable(AnonymousClass2SR.A05(r22.getResources(), conversationRowImage$RowImageView3, r22));
                    return;
                }
                C16750ta A003 = C16730tY.A00((C16730tY) r8);
                int i8 = A003.A08;
                if (!(i8 == 0 || (i4 = A003.A06) == 0)) {
                    ConversationRowImage$RowImageView conversationRowImage$RowImageView4 = ((C603030w) this.A00).A0G;
                    conversationRowImage$RowImageView4.A04(i8, i4);
                    conversationRowImage$RowImageView4.setScaleType(ImageView.ScaleType.CENTER_CROP);
                }
                ((C603030w) this.A00).A0G.setImageBitmap(bitmap);
                return;
            default:
                WebPagePreviewView webPagePreviewView = ((C57722re) this.A00).A09;
                webPagePreviewView.A0N.setVisibility(0);
                if (bitmap == null || bitmap.getHeight() == 0 || bitmap.getWidth() == 0) {
                    ThumbnailButton thumbnailButton = webPagePreviewView.A0N;
                    thumbnailButton.setImageDrawable(AnonymousClass2SR.A02(thumbnailButton.getContext(), R.drawable.ic_group_invite_link, R.color.color0930));
                    webPagePreviewView.A0N.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                    webPagePreviewView.A0N.setScaleY(1.5f);
                    webPagePreviewView.A0N.setScaleX(1.5f);
                    ThumbnailButton thumbnailButton2 = webPagePreviewView.A0N;
                    C13680ns.A0u(thumbnailButton2.getContext(), thumbnailButton2, R.color.color0540);
                    return;
                }
                webPagePreviewView.A0N.setScaleType(ImageView.ScaleType.CENTER_CROP);
                webPagePreviewView.A0N.setImageBitmap(bitmap);
                return;
        }
    }

    public void Afm(View view) {
        switch (this.A01) {
            case 0:
                AnonymousClass318 r3 = (AnonymousClass318) this.A00;
                ImageView imageView = r3.A09;
                imageView.setImageDrawable(new ColorDrawable(-7829368));
                imageView.setVisibility(0);
                r3.A04.setVisibility(0);
                return;
            case 1:
                ((C602430q) this.A00).A0A.setImageDrawable(new ColorDrawable(-7829368));
                return;
            case 2:
                AnonymousClass31B r1 = (AnonymousClass31B) this.A00;
                r1.A07 = false;
                r1.A04.setBackgroundColor(-7829368);
                return;
            case 3:
                ((C602930v) this.A00).A06.setBackgroundColor(-7829368);
                return;
            case 4:
                ((C603030w) this.A00).A0G.setBackgroundColor(-7829368);
                return;
            default:
                WebPagePreviewView webPagePreviewView = ((C57722re) this.A00).A09;
                webPagePreviewView.A0N.setScaleType(ImageView.ScaleType.CENTER_CROP);
                webPagePreviewView.A0N.setImageDrawable(new ColorDrawable(-7829368));
                return;
        }
    }
}
