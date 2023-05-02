package com.facebook.redex;

import X.AnonymousClass02W;
import X.AnonymousClass38N;
import X.AnonymousClass3K2;
import X.AnonymousClass3K3;
import X.C13680ns;
import X.C72683mX;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.TranslateAnimation;
import android.widget.ScrollView;
import androidx.recyclerview.widget.GridLayoutManager;
import com.obwhatsapp.WaImageView;
import com.obwhatsapp.avatar.profilephoto.AvatarProfilePhotoActivity;
import com.obwhatsapp.avatar.profilephoto.AvatarProfilePhotoImageView;
import com.obwhatsapp.greenalert.GreenAlertActivity;

public class IDxLListenerShape60S0200000_2_I1 implements ViewTreeObserver.OnGlobalLayoutListener {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxLListenerShape60S0200000_2_I1(Object obj, int i2, Object obj2) {
        this.A02 = i2;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public void onGlobalLayout() {
        switch (this.A02) {
            case 0:
                AnonymousClass3K2.A0z((View) this.A00, this);
                AvatarProfilePhotoActivity avatarProfilePhotoActivity = (AvatarProfilePhotoActivity) this.A01;
                View view = avatarProfilePhotoActivity.A02;
                ViewGroup.LayoutParams layoutParams = null;
                if (view != null) {
                    int width = view.getWidth();
                    View view2 = avatarProfilePhotoActivity.A02;
                    if (view2 != null) {
                        int height = view2.getHeight();
                        if (width >= height) {
                            width = height;
                        }
                        int i2 = (int) (((double) width) * 0.65d);
                        AvatarProfilePhotoImageView avatarProfilePhotoImageView = avatarProfilePhotoActivity.A08;
                        if (avatarProfilePhotoImageView != null) {
                            ViewGroup.LayoutParams layoutParams2 = avatarProfilePhotoImageView.getLayoutParams();
                            if (layoutParams2 != null) {
                                layoutParams2.width = i2;
                                layoutParams2.height = i2;
                                layoutParams = layoutParams2;
                            }
                            avatarProfilePhotoImageView.setLayoutParams(layoutParams);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 1:
                C72683mX r0 = (C72683mX) this.A00;
                View view3 = (View) this.A01;
                AnonymousClass02W r2 = r0.A00;
                if (!r0.A02.A04()) {
                    GridLayoutManager gridLayoutManager = (GridLayoutManager) r2;
                    int A0F = AnonymousClass3K3.A0F(view3.getResources(), view3);
                    if (A0F != gridLayoutManager.A00) {
                        gridLayoutManager.A1g(A0F);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                AnonymousClass38N r3 = (AnonymousClass38N) this.A00;
                ViewGroup viewGroup = r3.A01;
                int height2 = viewGroup.getHeight();
                if (height2 > 0) {
                    AnonymousClass3K2.A0z(viewGroup, this);
                    WaImageView waImageView = r3.A06;
                    ViewGroup.LayoutParams layoutParams3 = waImageView.getLayoutParams();
                    layoutParams3.width = height2;
                    layoutParams3.height = height2;
                    waImageView.setLayoutParams(layoutParams3);
                    C13680ns.A1O(r3.A08, ((View) this.A01).getHeight());
                    return;
                }
                return;
            case 3:
                AnonymousClass3K2.A0z((View) this.A01, this);
                GreenAlertActivity greenAlertActivity = (GreenAlertActivity) this.A00;
                greenAlertActivity.A38(greenAlertActivity.A06.getCurrentLogicalItem());
                return;
            case 4:
                ScrollView scrollView = (ScrollView) this.A01;
                if (((View) this.A00).hasFocus()) {
                    scrollView.smoothScrollBy(0, scrollView.getMaxScrollAmount());
                    return;
                }
                return;
            default:
                View view4 = (View) this.A01;
                AnonymousClass3K3.A16(view4, this);
                TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
                translateAnimation.setDuration(200);
                view4.startAnimation(translateAnimation);
                return;
        }
    }
}
