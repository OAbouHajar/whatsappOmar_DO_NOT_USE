package com.facebook.redex;

import X.AnonymousClass000;
import X.AnonymousClass5yJ;
import X.C118855vM;
import X.C119335wv;
import android.os.Handler;
import android.os.Message;
import java.util.List;

public class IDxCallbackShape189S0100000_3_I1 implements Handler.Callback {
    public Object A00;
    public final int A01;

    public IDxCallbackShape189S0100000_3_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public static boolean A00(Message message, IDxCallbackShape189S0100000_3_I1 iDxCallbackShape189S0100000_3_I1) {
        C119335wv r6 = (C119335wv) iDxCallbackShape189S0100000_3_I1.A00;
        if (message.what != 1) {
            return false;
        }
        List list = r6.A09;
        List list2 = r6.A08;
        int i2 = message.arg1;
        r6.A01();
        if (list == null || list2 == null || i2 >= list.size()) {
            return true;
        }
        C118855vM r1 = r6.A0E;
        list2.get(list2.size() - 1);
        list.get(list.size() - 1);
        List list3 = r1.A00;
        if (0 >= list3.size()) {
            return true;
        }
        list3.get(0);
        throw AnonymousClass000.A0W("onZoomChange");
    }

    public boolean handleMessage(Message message) {
        String str;
        if (this.A01 != 0) {
            return A00(message, this);
        }
        if (message.what == 1) {
            AnonymousClass5yJ r4 = (AnonymousClass5yJ) this.A00;
            if (r4.A0B) {
                List list = r4.A0A;
                int i2 = message.arg1;
                if (list == null || i2 >= list.size()) {
                    return true;
                }
                list.get(i2);
                list.get(0);
                list.get(list.size() - 1);
                List list2 = r4.A05.A00;
                if (0 >= list2.size()) {
                    return true;
                }
                list2.get(0);
                str = "onZoomChange";
                throw AnonymousClass000.A0W(str);
            }
        }
        if (message.what != 2) {
            return false;
        }
        List list3 = ((AnonymousClass5yJ) this.A00).A05.A00;
        if (0 >= list3.size()) {
            return true;
        }
        list3.get(0);
        str = "onZoomError";
        throw AnonymousClass000.A0W(str);
    }
}
