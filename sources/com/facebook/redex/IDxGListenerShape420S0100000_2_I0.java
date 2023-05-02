package com.facebook.redex;

import X.C109225Re;
import com.obwhatsapp.businessdirectory.view.activity.DirectorySetLocationMapActivity;

public class IDxGListenerShape420S0100000_2_I0 implements C109225Re {
    public Object A00;
    public final int A01;

    public IDxGListenerShape420S0100000_2_I0(DirectorySetLocationMapActivity directorySetLocationMapActivity, int i2) {
        this.A01 = i2;
        this.A00 = directorySetLocationMapActivity;
    }

    public void ARi(int i2) {
        int i3 = this.A01;
        DirectorySetLocationMapActivity directorySetLocationMapActivity = (DirectorySetLocationMapActivity) this.A00;
        if (i3 != 0) {
            directorySetLocationMapActivity.A3B(new IDxCListenerShape128S0100000_2_I1(this, 26), i2);
            return;
        }
        directorySetLocationMapActivity.A09.A06.setVisibility(8);
        directorySetLocationMapActivity.A09.A00();
    }

    public void ARj(String str) {
        if (this.A01 != 0) {
            DirectorySetLocationMapActivity directorySetLocationMapActivity = (DirectorySetLocationMapActivity) this.A00;
            directorySetLocationMapActivity.A09.A03(str);
            directorySetLocationMapActivity.A35();
            return;
        }
        DirectorySetLocationMapActivity directorySetLocationMapActivity2 = (DirectorySetLocationMapActivity) this.A00;
        directorySetLocationMapActivity2.A09.A06.setVisibility(8);
        directorySetLocationMapActivity2.A09.A03(str);
    }
}
