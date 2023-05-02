package com.mod.bomfab.bomb;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.TranslateAnimation;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.mod.bomfab.fab.FloatingActionButton;
import com.mod.bomfab.utils.Prefs;
import com.mod.bomfab.utils.Tools;
import com.obwhatsapp.yo.yo;

public class AutoText {
    static TranslateAnimation animate;
    static int count = 0;
    static boolean hidden = true;
    static ImageView mAutoSet;
    static ImageView mAutotext;
    static LinearLayout mContainer;
    static EditText mCount;
    static EditText mEditSend;
    static ImageView mImageSend;
    static EditText mInput;
    static ImageView mSettings;
    static FrameLayout mTombolHide;
    static FloatingActionButton menu1;
    static FloatingActionButton menu2;
    static FloatingActionButton menu3;
    static FloatingActionButton menu4;
    static FloatingActionButton menu5;
    static ImageView tAutotext;

    /* renamed from: v  reason: collision with root package name */
    private static View f470v;

    AutoText() {
    }

    public static void bomPing(Activity activity) {
        Handler handler = new Handler();
        handler.post(new Runnable(activity, handler) {
            int times = 0;
            private final Activity val$activity;
            private final Handler val$mHandler;

            {
                this.val$activity = r2;
                this.val$mHandler = r3;
            }

            public void run() {
                if (this.times < AutoText.setBomCount()) {
                    this.times++;
                    AutoText.gotoSend(this.val$activity);
                    this.val$mHandler.post(this);
                }
            }
        });
    }

    public static void fabBomb(Activity activity) {
        menu1 = (FloatingActionButton) activity.findViewById(Tools.intId("subFloatingMenu1"));
        menu2 = (FloatingActionButton) activity.findViewById(Tools.intId("subFloatingMenu3"));
        menu1.setOnClickListener(new View.OnClickListener(activity) {
            private final Activity val$act;

            {
                this.val$act = r1;
            }

            @Override
            public void onClick(View view) {
                AutoText.bomPing(this.val$act);
            }
        });
        menu1.setOnLongClickListener(new OnContinuousClickListener(activity) {
            private final Activity val$act;

            {
                this.val$act = r1;
            }

            public void onContinuousClick(View view) {
                AutoText.gotoSend(this.val$act);
            }
        });
        menu2.setOnClickListener(new View.OnClickListener(activity) {
            private final Activity val$act;

            {
                this.val$act = r1;
            }

            @Override
            public void onClick(View view) {
                AutoText.showDialogBom(this.val$act, 0);
            }
        });
    }

    private static void getClick(Activity activity) {
        mTombolHide.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (AutoText.hidden) {
                    TranslateAnimation translateAnimation = new TranslateAnimation((float) AutoText.mContainer.getWidth(), 0.0f, 0.0f, 0.0f);
                    translateAnimation.setDuration((long) 500);
                    translateAnimation.setFillAfter(true);
                    AutoText.mContainer.startAnimation(translateAnimation);
                    AutoText.mContainer.setVisibility(0);
                    AutoText.hidden = false;
                    return;
                }
                AutoText.animate = new TranslateAnimation(0.0f, (float) AutoText.mContainer.getWidth(), 0.0f, 0.0f);
                AutoText.animate.setDuration((long) 500);
                AutoText.animate.setFillAfter(true);
                AutoText.mContainer.startAnimation(AutoText.animate);
                AutoText.mContainer.setVisibility(8);
                AutoText.hidden = true;
            }
        });
        mSettings.setOnClickListener(new View.OnClickListener(activity) {
            private final Activity val$activity;

            {
                this.val$activity = r1;
            }

            public void onClick(View view) {
                this.val$activity.finish();
            }
        });
        mAutoSet.setOnClickListener(new View.OnClickListener(activity) {
            private final Activity val$activity;

            {
                this.val$activity = r1;
            }

            public void onClick(View view) {
                AutoText.showDialogBom(this.val$activity, 0);
            }
        });
        mAutotext.setOnLongClickListener(new OnContinuousClickListener(activity) {
            private final Activity val$activity;

            {
                this.val$activity = r1;
            }

            public void onContinuousClick(View view) {
                AutoText.gotoSend(this.val$activity);
            }
        });
        mAutotext.setOnClickListener(new View.OnClickListener(activity) {
            private final Activity val$activity;

            {
                this.val$activity = r1;
            }

            public void onClick(View view) {
                AutoText.bomPing(this.val$activity);
            }
        });
    }

    private static void getIds(Activity activity) {
        mContainer = (LinearLayout) activity.findViewById(Tools.intId("mContainer"));
        mTombolHide = (FrameLayout) activity.findViewById(Tools.intId("mHide"));
        mSettings = (ImageView) activity.findViewById(Tools.intId("mSettings"));
        mAutoSet = (ImageView) activity.findViewById(Tools.intId("mAutoSet"));
        mAutotext = (ImageView) activity.findViewById(Tools.intId("mAutotext"));
    }

    public static void gotoSend(Activity activity) {
        try {
            mEditSend = (EditText) activity.findViewById(Tools.intId("entry"));
            mEditSend.setText(Prefs.getString("ciben_ganti_text", yo.getString("Assem_Send")));
            mImageSend = (ImageView) activity.findViewById(Tools.intId("send"));
            mImageSend.performClick();
        } catch (Exception e2) {
            Log.v("Error", e2.toString());
        }
    }

    public static int setBomCount() {
        return Integer.parseInt(Prefs.getString("ciben_set_jumlah", "3"));
    }

    public static void showDialogBom(Activity activity, int i2) {
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        View inflate = LayoutInflater.from(activity).inflate(Tools.intLayout("bom_dialog"), (ViewGroup) null);
        builder.setView(inflate);
        mInput = (EditText) inflate.findViewById(Tools.intId("mInput"));
        mCount = (EditText) inflate.findViewById(Tools.intId("mCount"));
        mInput.setText(Prefs.getString("ciben_ganti_text", yo.getString("Assem_Send")));
        mCount.setText(Prefs.getString("ciben_set_jumlah", "3"));
        builder.setPositiveButton(i2 == 0 ? yo.getString("assem_tercih_kaydet") : "GÖNDER", new DialogInterface.OnClickListener(i2, activity) {
            private final Activity val$activity;
            private final int val$type;

            {
                this.val$type = r1;
                this.val$activity = r2;
            }

            public void onClick(DialogInterface dialogInterface, int i2) {
                if (AutoText.mInput.getText().toString().equals("")) {
                    Prefs.putString("ciben_ganti_text", yo.getString("Assem_Send"));
                } else {
                    Prefs.putString("ciben_ganti_text", AutoText.mInput.getText().toString());
                }
                if (AutoText.mCount.getText().toString().equals("") || AutoText.mCount.getText().toString().equals(new Integer(0))) {
                    Prefs.putString("ciben_set_jumlah", "3");
                } else {
                    Prefs.putString("ciben_set_jumlah", AutoText.mCount.getText().toString());
                }
                if (this.val$type == 1) {
                    AutoText.bomPing(this.val$activity);
                }
            }
        });
        builder.show();
    }

    public static void showTopView(Activity activity) {
        getIds(activity);
        getClick(activity);
    }
}
