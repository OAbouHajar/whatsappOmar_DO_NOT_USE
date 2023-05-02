package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.obwhatsapp.R;
import com.obwhatsapp.inappsupport.ui.AddScreenshotImageView;

/* renamed from: X.2pb  reason: invalid class name and case insensitive filesystem */
public final class C56992pb extends RelativeLayout implements AnonymousClass006 {
    public FrameLayout A00;
    public C16490t9 A01;
    public C108035Mk A02;
    public AddScreenshotImageView A03;
    public C52662eE A04;
    public boolean A05;

    public C56992pb(Context context) {
        super(context);
        if (!this.A05) {
            this.A05 = true;
            this.A01 = C16150sX.A0m(C52652eD.A00(generatedComponent()));
        }
        View inflate = RelativeLayout.inflate(getContext(), R.layout.layout037d, this);
        View findViewById = inflate.findViewById(R.id.screenshot_imageview);
        C18450wi.A0B(findViewById);
        setAddScreenshotImageView((AddScreenshotImageView) findViewById);
        View findViewById2 = inflate.findViewById(R.id.remove_button);
        C18450wi.A0B(findViewById2);
        setRemoveButton((FrameLayout) findViewById2);
        setRemoveButtonVisibility(false);
        C13680ns.A16(getRemoveButton(), this, 22);
    }

    private final void setRemoveButtonVisibility(boolean z2) {
        getRemoveButton().setVisibility(C13680ns.A02(z2 ? 1 : 0));
    }

    public final void A00() {
        AddScreenshotImageView addScreenshotImageView = getAddScreenshotImageView();
        Bitmap bitmap = addScreenshotImageView.A07;
        if (bitmap != null) {
            bitmap.recycle();
            addScreenshotImageView.A07 = null;
        }
        addScreenshotImageView.A04();
        setRemoveButtonVisibility(false);
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A04;
        if (r0 == null) {
            r0 = C52662eE.A00(this);
            this.A04 = r0;
        }
        return r0.generatedComponent();
    }

    public final AddScreenshotImageView getAddScreenshotImageView() {
        AddScreenshotImageView addScreenshotImageView = this.A03;
        if (addScreenshotImageView != null) {
            return addScreenshotImageView;
        }
        throw C18450wi.A03("addScreenshotImageView");
    }

    public final FrameLayout getRemoveButton() {
        FrameLayout frameLayout = this.A00;
        if (frameLayout != null) {
            return frameLayout;
        }
        throw C18450wi.A03("removeButton");
    }

    public final C16490t9 getWamRuntime() {
        C16490t9 r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        throw C18450wi.A03("wamRuntime");
    }

    public final void setAddScreenshotImageView(AddScreenshotImageView addScreenshotImageView) {
        C18450wi.A0H(addScreenshotImageView, 0);
        this.A03 = addScreenshotImageView;
    }

    public final void setOnRemoveScreenshotListener(C108035Mk r2) {
        C18450wi.A0H(r2, 0);
        this.A02 = r2;
    }

    public final void setRemoveButton(FrameLayout frameLayout) {
        C18450wi.A0H(frameLayout, 0);
        this.A00 = frameLayout;
    }

    public final void setScreenshot(Bitmap bitmap) {
        C18450wi.A0H(bitmap, 0);
        getAddScreenshotImageView().setScreenshot(bitmap);
        setRemoveButtonVisibility(true);
    }

    public final void setWamRuntime(C16490t9 r2) {
        C18450wi.A0H(r2, 0);
        this.A01 = r2;
    }
}
