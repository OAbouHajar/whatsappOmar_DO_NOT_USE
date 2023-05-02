package com.OM7753.SideBar.quick;

import X.C005602k;
import X.C49902Wp;
import android.content.Intent;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.OM7753.GOLD;
import com.OM7753.SideBar.utils.ContactHelper;
import com.obwhatsapp.Conversation;
import com.obwhatsapp.yo.dep;
import com.obwhatsapp.yo.tf;
import com.obwhatsapp.yo.yo;

public class QuickAdapter extends RecyclerView.Adapter<QuickAdapterHolder> {
    QuickFragment AQF;
    String mJabberId;
    QuickPresenter quickPresenter;

    public class QuickAdapterHolder extends C005602k {
        public TextView mContactName;
        public ImageView mContactPhoto;
        public TextView mCounter;
        public View mHolder;

        public QuickAdapterHolder(View view) {
            super(view);
            this.mContactPhoto = (ImageView) view.findViewById(yo.getID("mContactPhoto", "id"));
            this.mContactName = (TextView) view.findViewById(yo.getID("mContactName", "id"));
            this.mHolder = view.findViewById(yo.getID("mHolder", "id"));
            this.mCounter = (TextView) view.findViewById(yo.getID("mCounter", "id"));
        }
    }

    public QuickAdapter(QuickFragment quickFragment, String str, QuickPresenter quickPresenter2) {
        this.mJabberId = str;
        this.AQF = quickFragment;
        this.quickPresenter = quickPresenter2;
    }

    public int A0C() {
        return this.AQF.A1D().size();
    }

    /* renamed from: AKd */
    public void ANf(QuickAdapterHolder quickAdapterHolder, int i2) {
        final ContactHelper contactHelper = new ContactHelper(((C49902Wp) this.AQF.A1D().get(i2)).ACx());
        if (this.mJabberId.equals(contactHelper.getJabberId())) {
            quickAdapterHolder.mHolder.setLayoutParams(new RelativeLayout.LayoutParams(0, 0));
            return;
        }
        quickAdapterHolder.mHolder.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
        final int unreadCount = contactHelper.getUnreadCount();
        String num = unreadCount > 99 ? "99+" : Integer.toString(unreadCount);
        if (unreadCount > 0) {
            this.quickPresenter.getBadgeCounter(A0C(), unreadCount);
            quickAdapterHolder.mCounter.setVisibility(0);
            quickAdapterHolder.mCounter.setText(num);
        } else {
            quickAdapterHolder.mCounter.setVisibility(8);
        }
        TextView textView = quickAdapterHolder.mContactName;
        textView.setText(contactHelper.getBestName());
        tf.names(textView, Typeface.DEFAULT_BOLD);
        dep.loadCImage(contactHelper.getJabberId(), quickAdapterHolder.mContactPhoto);
        ImageView imageView = quickAdapterHolder.mContactPhoto;
        TextView textView2 = quickAdapterHolder.mContactName;
        AnonymousClass1 r5 = new View.OnClickListener() {
            public void onClick(View view) {
                QuickAdapter.this.onClicked(contactHelper.getJabberId());
            }
        };
        imageView.setOnClickListener(r5);
        textView2.setOnClickListener(r5);
    }

    /* renamed from: ALv */
    public QuickAdapterHolder APF(ViewGroup viewGroup, int i2) {
        return new QuickAdapterHolder(LayoutInflater.from(viewGroup.getContext()).inflate(yo.getID("delta_quick_item", "layout"), viewGroup, false));
    }

    public void onClicked(String str) {
        this.AQF.mHomeActivity.finish();
        this.AQF.mHomeActivity.startActivity(new Intent(this.AQF.mHomeActivity, Conversation.class).putExtra("jid", str));
        this.AQF.mHomeActivity.overridePendingTransition(0, GOLD.getAnim("fade_out"));
    }
}
