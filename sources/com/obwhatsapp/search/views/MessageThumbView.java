package com.obwhatsapp.search.views;

import X.AnonymousClass25V;
import X.AnonymousClass2JP;
import X.C16730tY;
import X.C25791Ld;
import X.C38621r6;
import X.C38681rF;
import X.C38711rI;
import X.C38801rR;
import X.C38991rk;
import X.C39011rm;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.redex.IDxTRendererShape198S0100000_2_I0;
import com.obwhatsapp.R;
import com.obwhatsapp.WaImageView;

public class MessageThumbView extends WaImageView {
    public int A00;
    public C16730tY A01;
    public C25791Ld A02;
    public boolean A03;
    public final AnonymousClass25V A04;

    public MessageThumbView(Context context) {
        this(context, (AttributeSet) null);
    }

    public MessageThumbView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A02();
        this.A04 = new IDxTRendererShape198S0100000_2_I0(this, 2);
    }

    public MessageThumbView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        A02();
        this.A04 = new IDxTRendererShape198S0100000_2_I0(this, 2);
    }

    public MessageThumbView(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet);
        A02();
    }

    private int getNotDownloadedContentDescription() {
        C16730tY r1 = this.A01;
        if ((r1 instanceof C38681rF) || (r1 instanceof C38991rk)) {
            return R.string.str05d1;
        }
        if (r1 instanceof C38801rR) {
            return R.string.str1c41;
        }
        if ((r1 instanceof C38711rI) || (r1 instanceof C39011rm)) {
            return R.string.str1c42;
        }
        return -1;
    }

    public void setMessage(C16730tY r3) {
        if (this.A02 != null) {
            this.A01 = r3;
            AnonymousClass25V r1 = this.A04;
            r1.Afm(this);
            this.A02.A07(this, r3, r1);
        }
    }

    public void setRadius(int i2) {
        this.A00 = i2;
    }

    public void setStatus(int i2) {
        Resources resources;
        int i3;
        if (this.A00 != null && this.A01 != null) {
            AnonymousClass2JP.A01(this);
            if (i2 == 0 || i2 == 1) {
                resources = getResources();
                i3 = R.string.str0b3a;
            } else if (i2 == 2 || i2 == 3) {
                resources = getResources();
                i3 = R.string.str0095;
            } else {
                AnonymousClass2JP.A03(this, R.string.str0326);
                setOnClickListener((View.OnClickListener) null);
                int notDownloadedContentDescription = getNotDownloadedContentDescription();
                if (notDownloadedContentDescription != -1) {
                    setContentDescription(getResources().getString(notDownloadedContentDescription, new Object[]{C38621r6.A0I(this.A00, this.A01.A01)}));
                    return;
                }
                return;
            }
            setContentDescription(resources.getString(i3));
            setOnClickListener((View.OnClickListener) null);
        }
    }
}
