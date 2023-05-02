package com.obwhatsapp.home.ui;

import X.AnonymousClass3MF;
import X.C003501o;
import X.C004601z;
import X.C011405n;
import X.C14550pN;
import X.C16320sq;
import X.C17110uY;
import X.C18450wi;
import X.C19240y6;
import X.C434920f;
import X.C49232Rs;
import X.C78863yo;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.OnLifecycleEvent;
import com.facebook.redex.RunnableRunnableShape9S0100000_I0_8;
import com.obwhatsapp.R;
import com.obwhatsapp.conversation.conversationrow.E2EEDescriptionBottomSheet;
import com.obwhatsapp.home.splitwindow.IDxWObserverShape84S0100000_2_I0;
import com.obwhatsapp.settings.chat.wallpaper.WallPaperView;

public final class HomePlaceholderActivity extends C14550pN {

    public class HomePlaceholderView extends C49232Rs implements C003501o {
        public ImageView A00 = ((ImageView) C004601z.A0E(this, R.id.image_placeholder));
        public TextView A01 = ((TextView) C004601z.A0E(this, R.id.txt_home_placeholder_sub_title));
        public TextView A02 = ((TextView) C004601z.A0E(this, R.id.txt_home_placeholder_title));
        public C19240y6 A03;
        public WallPaperView A04 = ((WallPaperView) C004601z.A0E(this, R.id.placeholder_background));
        public C17110uY A05;
        public C16320sq A06;
        public final IDxWObserverShape84S0100000_2_I0 A07;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public HomePlaceholderView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            C18450wi.A0H(context, 1);
            LinearLayout.inflate(context, R.layout.layout05d1, this);
            A01(getSplitWindowManager().A04());
            this.A07 = new IDxWObserverShape84S0100000_2_I0(this, 1);
        }

        private final void setPlaceholderE2EText(int i2) {
            TextView textView = this.A01;
            if (textView != null) {
                textView.setText(getLinkifier().A07(new RunnableRunnableShape9S0100000_I0_8(this, 39), getContext().getString(i2), "%s", R.color.color0659));
                textView.setMovementMethod(new AnonymousClass3MF());
            }
        }

        /* renamed from: setPlaceholderE2EText$lambda-0  reason: not valid java name */
        public static final void m9setPlaceholderE2EText$lambda0(HomePlaceholderView homePlaceholderView) {
            C14550pN r1;
            C18450wi.A0H(homePlaceholderView, 0);
            E2EEDescriptionBottomSheet A012 = E2EEDescriptionBottomSheet.A01(12);
            Context context = homePlaceholderView.getContext();
            if ((context instanceof C14550pN) && (r1 = (C14550pN) context) != null) {
                r1.Afc(A012);
            }
        }

        public final void A00() {
            C16320sq waWorkers = getWaWorkers();
            Context context = getContext();
            C18450wi.A0B(context);
            Resources resources = getResources();
            C18450wi.A0B(resources);
            waWorkers.Ack(new C78863yo(context, resources, this.A04), new Void[0]);
        }

        public final void A01(int i2) {
            int i3;
            if (i2 != 200) {
                if (i2 == 300) {
                    ImageView imageView = this.A00;
                    if (imageView != null) {
                        imageView.setImageResource(R.drawable.vec_ic_status_placeholder);
                    }
                    TextView textView = this.A02;
                    if (textView != null) {
                        textView.setText(R.string.str1693);
                    }
                    i3 = R.string.str1692;
                } else if (i2 == 400) {
                    ImageView imageView2 = this.A00;
                    if (imageView2 != null) {
                        imageView2.setImageResource(R.drawable.vec_ic_calls_placeholder);
                    }
                    TextView textView2 = this.A02;
                    if (textView2 != null) {
                        textView2.setText(R.string.str0380);
                    }
                    i3 = R.string.str037f;
                } else if (i2 == 600) {
                    ImageView imageView3 = this.A00;
                    if (imageView3 != null) {
                        imageView3.setImageResource(R.drawable.vec_ic_communities_placeholder);
                    }
                    TextView textView3 = this.A02;
                    if (textView3 != null) {
                        textView3.setText(R.string.str04d8);
                    }
                    i3 = R.string.str05ce;
                } else {
                    return;
                }
                setPlaceholderE2EText(i3);
                return;
            }
            ImageView imageView4 = this.A00;
            if (imageView4 != null) {
                imageView4.setImageResource(R.drawable.vec_ic_chat_placeholder);
            }
            TextView textView4 = this.A02;
            if (textView4 != null) {
                textView4.setText(R.string.str05cf);
            }
            setPlaceholderE2EText(R.string.str05ce);
            getSplitWindowManager().A05();
        }

        public final C17110uY getLinkifier() {
            C17110uY r0 = this.A05;
            if (r0 != null) {
                return r0;
            }
            C18450wi.A0O("linkifier");
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        }

        public final C19240y6 getSplitWindowManager() {
            C19240y6 r0 = this.A03;
            if (r0 != null) {
                return r0;
            }
            C18450wi.A0O("splitWindowManager");
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        }

        public final C16320sq getWaWorkers() {
            C16320sq r0 = this.A06;
            if (r0 != null) {
                return r0;
            }
            C18450wi.A0O("waWorkers");
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        }

        @OnLifecycleEvent(C011405n.ON_START)
        public final void onActivityStarted() {
            A00();
            if (getSplitWindowManager().A07()) {
                getSplitWindowManager().A02(this.A07);
            }
        }

        @OnLifecycleEvent(C011405n.ON_STOP)
        public final void onActivityStopped() {
            if (getSplitWindowManager().A07()) {
                getSplitWindowManager().A03(this.A07);
            }
        }

        public final void setLinkifier(C17110uY r2) {
            C18450wi.A0H(r2, 0);
            this.A05 = r2;
        }

        public final void setSplitWindowManager(C19240y6 r2) {
            C18450wi.A0H(r2, 0);
            this.A03 = r2;
        }

        public final void setWaWorkers(C16320sq r2) {
            C18450wi.A0H(r2, 0);
            this.A06 = r2;
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.layout004c);
        C434920f.A04(this, R.color.color0792);
        Window window = getWindow();
        if (window != null) {
            window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() | 256 | 1024);
        }
        HomePlaceholderView homePlaceholderView = (HomePlaceholderView) findViewById(R.id.home_placeholder);
        if (homePlaceholderView != null) {
            this.A06.A00(homePlaceholderView);
        }
    }
}
