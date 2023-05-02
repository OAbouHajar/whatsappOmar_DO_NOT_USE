package com.obwhatsapp.calling.views;

import X.AnonymousClass006;
import X.C004601z;
import X.C14710pd;
import X.C15860rz;
import X.C16150sX;
import X.C52642eC;
import X.C52652eD;
import X.C52662eE;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import com.obwhatsapp.R;
import com.obwhatsapp.youbasha.others;

public class VoipCallFooter extends LinearLayout implements AnonymousClass006 {
    public View A00;
    public View A01;
    public View A02;
    public ImageButton A03;
    public ImageButton A04;
    public ImageButton A05;
    public ImageButton A06;
    public ImageButton A07;
    public C15860rz A08;
    public C14710pd A09;
    public C52662eE A0A;
    public boolean A0B;

    public VoipCallFooter(Context context) {
        this(context, (AttributeSet) null);
    }

    public VoipCallFooter(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VoipCallFooter(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        if (!this.A0B) {
            this.A0B = true;
            C16150sX r1 = ((C52652eD) ((C52642eC) generatedComponent())).A07;
            this.A09 = (C14710pd) r1.A05.get();
            this.A08 = (C15860rz) r1.AQh.get();
        }
        LayoutInflater.from(context).inflate(R.layout.layout05f2, this, true);
        ImageButton imageButton = (ImageButton) findViewById(R.id.speaker_btn);
        others.setVoipIc(imageButton);
        this.A06 = imageButton;
        ImageButton imageButton2 = (ImageButton) findViewById(R.id.bluetooth_btn);
        others.setVoipIc(imageButton2);
        this.A03 = imageButton2;
        this.A00 = findViewById(R.id.bluetooth_btn_layout);
        ImageButton imageButton3 = (ImageButton) findViewById(R.id.toggle_video_btn);
        others.setVoipIc(imageButton3);
        this.A07 = imageButton3;
        this.A02 = findViewById(R.id.toggle_video_btn_layout);
        ImageButton imageButton4 = (ImageButton) findViewById(R.id.mute_btn);
        others.setVoipIc(imageButton4);
        this.A05 = imageButton4;
        ImageButton imageButton5 = (ImageButton) C004601z.A0E(this, R.id.footer_end_call_btn);
        others.setVoipIc(imageButton5);
        this.A04 = imageButton5;
        this.A01 = C004601z.A0E(this, R.id.end_call_btn_layout);
    }

    public void A00() {
        this.A06.setImageResource(R.drawable.ic_voip_speaker_control);
        ImageButton imageButton = this.A07;
        imageButton.setImageResource(R.drawable.ic_voip_video_control);
        imageButton.setContentDescription(getContext().getString(R.string.str1a8c));
        A03(false);
    }

    public void A01() {
        this.A06.setImageResource(R.drawable.ic_voip_switch_camera_control);
        ImageButton imageButton = this.A07;
        imageButton.setImageResource(R.drawable.ic_voip_switch_to_voice_control);
        imageButton.setContentDescription(getContext().getString(R.string.str1a8b));
        A03(true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002b, code lost:
        if (r12 != false) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x005f, code lost:
        if (r3.A0A != false) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
        if (r10.videoEnabled != false) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(com.whatsapp.voipcalling.CallInfo r10, int r11, boolean r12, boolean r13) {
        /*
            r9 = this;
            com.whatsapp.voipcalling.CallState r6 = r10.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.NONE
            if (r6 == r0) goto L_0x0044
            boolean r0 = com.whatsapp.voipcalling.Voip.A09(r6)
            if (r0 != 0) goto L_0x0044
            boolean r0 = r10.isGroupCall
            if (r0 != 0) goto L_0x0014
            java.lang.String r0 = r10.callLinkToken
            if (r0 == 0) goto L_0x0019
        L_0x0014:
            boolean r0 = r10.videoEnabled
            r2 = 1
            if (r0 == 0) goto L_0x001a
        L_0x0019:
            r2 = 0
        L_0x001a:
            android.view.View r1 = r9.A02
            r5 = 8
            r4 = 0
            r0 = 0
            if (r2 == 0) goto L_0x0024
            r0 = 8
        L_0x0024:
            r1.setVisibility(r0)
            if (r2 == 0) goto L_0x002d
            r0 = 1082130432(0x40800000, float:4.0)
            if (r12 == 0) goto L_0x002e
        L_0x002d:
            r0 = 0
        L_0x002e:
            r9.setWeightSum(r0)
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.LINK
            if (r6 != r0) goto L_0x0045
            android.widget.ImageButton r0 = r9.A06
            X.C62043Bk.A05(r0, r4)
            android.widget.ImageButton r0 = r9.A07
            X.C62043Bk.A05(r0, r4)
            android.widget.ImageButton r0 = r9.A05
            X.C62043Bk.A05(r0, r4)
        L_0x0044:
            return
        L_0x0045:
            X.1fU r3 = r10.self
            boolean r0 = r10.videoEnabled
            r7 = 3
            r2 = 1
            android.widget.ImageButton r1 = r9.A06
            if (r0 == 0) goto L_0x00b8
            if (r13 != 0) goto L_0x0061
            int r8 = r3.A05
            r0 = 6
            if (r8 == r0) goto L_0x0061
            int r0 = com.whatsapp.voipcalling.Voip.getCameraCount()
            if (r0 <= r2) goto L_0x0061
            boolean r0 = r3.A0A
            r8 = 1
            if (r0 == 0) goto L_0x0062
        L_0x0061:
            r8 = 0
        L_0x0062:
            X.C62043Bk.A05(r1, r8)
            r1.setSelected(r4)
            android.widget.ImageButton r1 = r9.A03
            r0 = 0
            if (r11 != r7) goto L_0x006e
            r0 = 1
        L_0x006e:
            r1.setSelected(r0)
            boolean r0 = r3.A0A
            r0 = r0 ^ 1
            X.C62043Bk.A05(r1, r0)
            android.widget.ImageButton r1 = r9.A07
            int r8 = r3.A05
            r7 = 6
            r0 = 0
            if (r8 != r7) goto L_0x0081
            r0 = 1
        L_0x0081:
            r1.setSelected(r0)
        L_0x0084:
            android.view.View r0 = r9.A00
            if (r12 == 0) goto L_0x0089
            r5 = 0
        L_0x0089:
            r0.setVisibility(r5)
            if (r13 != 0) goto L_0x00a5
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r6 == r0) goto L_0x0096
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.CONNECTED_LONELY
            if (r6 != r0) goto L_0x00a5
        L_0x0096:
            boolean r0 = r10.isGroupCall
            if (r0 == 0) goto L_0x009e
            boolean r0 = r10.videoEnabled
            if (r0 == 0) goto L_0x00a5
        L_0x009e:
            boolean r0 = r10.isCallOnHold()
            if (r0 != 0) goto L_0x00a5
            r4 = 1
        L_0x00a5:
            X.C62043Bk.A05(r1, r4)
            android.widget.ImageButton r1 = r9.A05
            X.C62043Bk.A05(r1, r2)
            boolean r0 = r3.A0D
            r1.setSelected(r0)
            boolean r0 = r10.videoEnabled
            r9.A03(r0)
            return
        L_0x00b8:
            boolean r0 = r3.A0A
            r0 = r0 ^ 1
            X.C62043Bk.A05(r1, r0)
            r0 = 0
            if (r11 != r2) goto L_0x00c3
            r0 = 1
        L_0x00c3:
            r1.setSelected(r0)
            android.widget.ImageButton r1 = r9.A03
            r0 = 0
            if (r11 != r7) goto L_0x00cc
            r0 = 1
        L_0x00cc:
            r1.setSelected(r0)
            boolean r0 = r3.A0A
            r0 = r0 ^ 1
            X.C62043Bk.A05(r1, r0)
            android.widget.ImageButton r1 = r9.A07
            r1.setSelected(r4)
            goto L_0x0084
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.calling.views.VoipCallFooter.A02(com.whatsapp.voipcalling.CallInfo, int, boolean, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004a, code lost:
        if (r5.A07.isSelected() != false) goto L_0x004c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(boolean r6) {
        /*
            r5 = this;
            android.content.Context r4 = r5.getContext()
            android.widget.ImageButton r2 = r5.A06
            if (r6 != 0) goto L_0x0090
            boolean r1 = r2.isSelected()
            r0 = 2131892955(0x7f121adb, float:1.9420673E38)
            if (r1 == 0) goto L_0x0014
            r0 = 2131892954(0x7f121ada, float:1.942067E38)
        L_0x0014:
            java.lang.String r1 = r4.getString(r0)
            r0 = 0
            if (r6 == 0) goto L_0x0022
            r0 = 2131892949(0x7f121ad5, float:1.942066E38)
            java.lang.String r0 = r4.getString(r0)
        L_0x0022:
            X.C62043Bk.A04(r2, r1, r0)
            android.widget.ImageButton r2 = r5.A03
            boolean r1 = r2.isSelected()
            r0 = 2131892899(0x7f121aa3, float:1.942056E38)
            if (r1 == 0) goto L_0x0033
            r0 = 2131892898(0x7f121aa2, float:1.9420557E38)
        L_0x0033:
            java.lang.String r1 = r4.getString(r0)
            r0 = 2131892916(0x7f121ab4, float:1.9420594E38)
            java.lang.String r0 = r4.getString(r0)
            X.C62043Bk.A04(r2, r1, r0)
            if (r6 == 0) goto L_0x004c
            android.widget.ImageButton r0 = r5.A07
            boolean r0 = r0.isSelected()
            r3 = 1
            if (r0 == 0) goto L_0x004d
        L_0x004c:
            r3 = 0
        L_0x004d:
            android.widget.ImageButton r2 = r5.A07
            r0 = 2131892953(0x7f121ad9, float:1.9420669E38)
            if (r3 == 0) goto L_0x0057
            r0 = 2131892951(0x7f121ad7, float:1.9420665E38)
        L_0x0057:
            java.lang.String r1 = r4.getString(r0)
            r0 = 2131892952(0x7f121ad8, float:1.9420667E38)
            if (r3 == 0) goto L_0x0063
            r0 = 2131892950(0x7f121ad6, float:1.9420663E38)
        L_0x0063:
            java.lang.String r0 = r4.getString(r0)
            X.C62043Bk.A04(r2, r1, r0)
            android.widget.ImageButton r3 = r5.A05
            boolean r1 = r3.isSelected()
            r0 = 2131892939(0x7f121acb, float:1.942064E38)
            if (r1 == 0) goto L_0x0078
            r0 = 2131892958(0x7f121ade, float:1.9420679E38)
        L_0x0078:
            java.lang.String r2 = r4.getString(r0)
            boolean r1 = r3.isSelected()
            r0 = 2131892938(0x7f121aca, float:1.9420638E38)
            if (r1 == 0) goto L_0x0088
            r0 = 2131892957(0x7f121add, float:1.9420677E38)
        L_0x0088:
            java.lang.String r0 = r4.getString(r0)
            X.C62043Bk.A04(r3, r2, r0)
            return
        L_0x0090:
            r0 = 2131892949(0x7f121ad5, float:1.942066E38)
            goto L_0x0014
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.calling.views.VoipCallFooter.A03(boolean):void");
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A0A;
        if (r0 == null) {
            r0 = new C52662eE(this);
            this.A0A = r0;
        }
        return r0.generatedComponent();
    }

    public void setBluetoothButtonClickListener(View.OnClickListener onClickListener) {
        this.A03.setOnClickListener(onClickListener);
    }

    public void setEndCallButtonClickListener(View.OnClickListener onClickListener) {
        this.A04.setOnClickListener(onClickListener);
    }

    public void setMuteButtonClickListener(View.OnClickListener onClickListener) {
        this.A05.setOnClickListener(onClickListener);
    }

    public void setSpeakerButtonClickListener(View.OnClickListener onClickListener) {
        this.A06.setOnClickListener(onClickListener);
    }

    public void setToggleVideoButtonClickListener(View.OnClickListener onClickListener) {
        this.A07.setOnClickListener(onClickListener);
    }

    public void setToggleVideoButtonSelected(boolean z2) {
        this.A07.setSelected(z2);
    }
}
