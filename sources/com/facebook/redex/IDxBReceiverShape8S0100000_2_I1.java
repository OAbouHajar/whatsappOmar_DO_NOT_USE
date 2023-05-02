package com.facebook.redex;

import X.C87364Wm;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.obwhatsapp.gallerypicker.GalleryPickerFragment;
import com.whatsapp.util.Log;

public class IDxBReceiverShape8S0100000_2_I1 extends BroadcastReceiver {
    public Object A00;
    public final int A01;

    public IDxBReceiverShape8S0100000_2_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public void onReceive(Context context, Intent intent) {
        String str;
        if (this.A01 != 0) {
            GalleryPickerFragment galleryPickerFragment = (GalleryPickerFragment) this.A00;
            String action = intent.getAction();
            if (action != null) {
                switch (action.hashCode()) {
                    case -1514214344:
                        if (action.equals("android.intent.action.MEDIA_MOUNTED")) {
                            Log.i("gallerypicker/receivemediabroadcast/ACTION_MEDIA_MOUNTED");
                            return;
                        }
                        return;
                    case -1142424621:
                        if (action.equals("android.intent.action.MEDIA_SCANNER_FINISHED")) {
                            Log.i("gallerypicker/receivemediabroadcast/ACTION_MEDIA_SCANNER_FINISHED");
                            galleryPickerFragment.A1D(false, false);
                            return;
                        }
                        return;
                    case -963871873:
                        if (action.equals("android.intent.action.MEDIA_UNMOUNTED")) {
                            str = "gallerypicker/receivemediabroadcast/ACTION_MEDIA_UNMOUNTED";
                            break;
                        } else {
                            return;
                        }
                    case -625887599:
                        if (action.equals("android.intent.action.MEDIA_EJECT")) {
                            str = "gallerypicker/receivemediabroadcast/ACTION_MEDIA_EJECT";
                            break;
                        } else {
                            return;
                        }
                    case 1412829408:
                        if (action.equals("android.intent.action.MEDIA_SCANNER_STARTED")) {
                            Log.i("gallerypicker/receivemediabroadcast/ACTION_MEDIA_SCANNER_STARTED");
                            galleryPickerFragment.A1D(false, true);
                            return;
                        }
                        return;
                    default:
                        return;
                }
                Log.i(str);
                galleryPickerFragment.A1D(true, false);
                return;
            }
            return;
        }
        ((C87364Wm) this.A00).A02();
    }
}
