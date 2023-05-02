package com.facebook.redex;

import X.AnonymousClass000;
import X.C12290k9;
import androidx.car.app.model.InputCallbackDelegateImpl;
import androidx.car.app.model.SearchCallbackDelegateImpl;

public class IDxHCallShape4S1100000_I1 implements C12290k9 {
    public Object A00;
    public String A01;
    public final int A02;

    public IDxHCallShape4S1100000_I1(int i2, String str, Object obj) {
        this.A02 = i2;
        this.A00 = obj;
        this.A01 = str;
    }

    public final Object A86() {
        int i2 = this.A02;
        Object obj = this.A00;
        switch (i2) {
            case 0:
                InputCallbackDelegateImpl.OnInputCallbackStub.$r8$lambda$eBHPiP8W8cRmVPgNJbI3aEtxKRI((InputCallbackDelegateImpl.OnInputCallbackStub) obj, this.A01);
                break;
            case 1:
                InputCallbackDelegateImpl.OnInputCallbackStub.m3$r8$lambda$fXh5ps0gWZC7E28te7xLK6HzGw((InputCallbackDelegateImpl.OnInputCallbackStub) obj, this.A01);
                break;
            case 2:
                SearchCallbackDelegateImpl.SearchCallbackStub.$r8$lambda$7_1W9_T5a2DIwVbigN8QKwBUMDg((SearchCallbackDelegateImpl.SearchCallbackStub) obj, this.A01);
                break;
            default:
                SearchCallbackDelegateImpl.SearchCallbackStub.m4$r8$lambda$lWaSliOrYxg3ODag2RALLEM1OQ((SearchCallbackDelegateImpl.SearchCallbackStub) obj, this.A01);
                break;
        }
        throw AnonymousClass000.A0Z();
    }
}
