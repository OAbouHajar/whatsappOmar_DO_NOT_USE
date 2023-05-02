package com.facebook.redex;

import X.C101994yE;
import X.C37781pj;
import X.C37941pz;
import X.C56972pY;
import X.C56982pZ;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.ImageView;
import com.obwhatsapp.WaTextView;
import com.obwhatsapp.emoji.EmojiContainerView;
import com.obwhatsapp.status.playback.MessageReplyActivity;

public class IDxCListenerShape0S0700000_2_I0 implements View.OnLongClickListener {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public final int A07;

    public IDxCListenerShape0S0700000_2_I0(Resources resources, GridLayout gridLayout, ImageView imageView, WaTextView waTextView, C37781pj r5, EmojiContainerView emojiContainerView, MessageReplyActivity messageReplyActivity, int i2) {
        this.A07 = i2;
        this.A00 = messageReplyActivity;
        this.A01 = r5;
        this.A02 = gridLayout;
        this.A03 = emojiContainerView;
        this.A04 = imageView;
        this.A05 = resources;
        this.A06 = waTextView;
    }

    public final boolean onLongClick(View view) {
        int i2 = this.A07;
        MessageReplyActivity messageReplyActivity = (MessageReplyActivity) this.A00;
        C37781pj r0 = (C37781pj) this.A01;
        ViewGroup viewGroup = (ViewGroup) this.A02;
        View view2 = (View) this.A03;
        ImageView imageView = (ImageView) this.A04;
        Resources resources = (Resources) this.A05;
        WaTextView waTextView = (WaTextView) this.A06;
        if (i2 != 0) {
            C37941pz.A01(imageView, view2.getRootView(), new C56982pZ(imageView, new C101994yE(resources, view2, viewGroup, imageView, waTextView, messageReplyActivity, true), messageReplyActivity.A0B, r0.A00));
            return true;
        }
        C37941pz.A01(imageView, view2.getRootView(), new C56972pY(imageView, new C101994yE(resources, view2, viewGroup, imageView, waTextView, messageReplyActivity, false), messageReplyActivity.A0B, r0.A00));
        return true;
    }
}
