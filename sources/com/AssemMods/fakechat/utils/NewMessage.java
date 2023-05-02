package com.AssemMods.fakechat.utils;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.AssemMods.fakechat.model.WhatsAppMessage;
import java.util.Date;

public class NewMessage extends Dialog implements View.OnClickListener {
    private Context mContext;
    private TextView mDateTextView;
    private Button mDecHourButton;
    private Button mDecMinButton;
    private boolean mFromMe = false;
    private Handler mHandler;
    private EditText mHourEditText;
    private int mIdMessage;
    private Button mIncHourButton;
    private Button mIncMinButton;
    private EditText mMessageEditText;
    private EditText mMinEditText;
    private long mNextTs;
    private long mPreviousTs;
    private long mTs;

    public NewMessage(Context context, WhatsAppMessage whatsAppMessage, long j2, long j3, boolean z2, boolean z3, Handler handler) {
        super(context);
        this.mContext = context;
        this.mPreviousTs = j2;
        this.mNextTs = j3;
        this.mTs = whatsAppMessage.getTs();
        this.mHandler = handler;
        this.mIdMessage = whatsAppMessage.getId();
        initialize(z2, z3, whatsAppMessage);
        checkTimePicker();
        setDate();
    }

    private void checkTimePicker() {
        boolean z2 = false;
        Button button = this.mIncMinButton;
        long j2 = this.mNextTs;
        boolean z3 = false;
        button.setEnabled(j2 < 0 || this.mTs + 60000 < j2);
        Button button2 = this.mDecMinButton;
        long j3 = this.mPreviousTs;
        button2.setEnabled(j3 < 0 || this.mTs - 60000 > j3);
        Button button3 = this.mIncHourButton;
        long j4 = this.mNextTs;
        if (j4 < 0 || this.mTs + 3600000 < j4) {
            z3 = true;
        }
        button3.setEnabled(z3);
        Button button4 = this.mDecHourButton;
        long j5 = this.mPreviousTs;
        if (j5 < 0 || this.mTs - 3600000 > j5) {
            z2 = true;
        }
        button4.setEnabled(z2);
    }

    private void initialize(boolean z2, boolean z3, WhatsAppMessage whatsAppMessage) {
        setContentView(Resources.getLayout("AssemMods_new_message_layout"));
        findViewById(Resources.getId("new_message_button_cancel")).setOnClickListener(this);
        findViewById(Resources.getId("new_message_button_ok")).setOnClickListener(this);
        Button button = (Button) findViewById(Resources.getId("new_message_inc_hour"));
        this.mIncHourButton = button;
        button.setOnClickListener(this);
        Button button2 = (Button) findViewById(Resources.getId("new_message_dec_hour"));
        this.mDecHourButton = button2;
        button2.setOnClickListener(this);
        Button button3 = (Button) findViewById(Resources.getId("new_message_inc_min"));
        this.mIncMinButton = button3;
        button3.setOnClickListener(this);
        Button button4 = (Button) findViewById(Resources.getId("new_message_dec_min"));
        this.mDecMinButton = button4;
        button4.setOnClickListener(this);
        EditText editText = (EditText) findViewById(Resources.getId("new_message_hour"));
        this.mHourEditText = editText;
        editText.setFocusable(z3);
        EditText editText2 = (EditText) findViewById(Resources.getId("new_message_min"));
        this.mMinEditText = editText2;
        editText2.setFocusable(z3);
        this.mDateTextView = (TextView) findViewById(Resources.getId("new_message_date"));
        EditText editText3 = (EditText) findViewById(Resources.getId("new_message_message"));
        this.mMessageEditText = editText3;
        if (!z2) {
            editText3.setText(whatsAppMessage.getData());
            EditText editText4 = this.mMessageEditText;
            editText4.setSelection(0, editText4.getText().length());
            this.mMessageEditText.post(new fakeConv3(this));
            this.mMessageEditText.requestFocus();
        }
        setTitle(Resources.getString("modify_message_title"));
    }

    private void sendMessage() {
        String obj = this.mMessageEditText.getText().toString();
        if (TextUtils.isEmpty(obj) || obj.equals("")) {
            AppUtils.makeToast(this.mContext, Resources.getString("message_empty"));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("message", obj);
        bundle.putLong(AppUtils.HANDLER_TS_KEY, this.mTs);
        bundle.putInt("id", this.mIdMessage);
        bundle.putBoolean(AppUtils.HANDLER_FROMME_KEY, this.mFromMe);
        Message message = new Message();
        message.setData(bundle);
        this.mHandler.sendMessage(message);
    }

    private void setDate() {
        Date dateFromTs = AppUtils.getDateFromTs(this.mTs);
        int year = dateFromTs.getYear();
        int date = dateFromTs.getDate();
        int hours = dateFromTs.getHours();
        int minutes = dateFromTs.getMinutes();
        TextView textView = this.mDateTextView;
        textView.setText(date + "/" + (dateFromTs.getMonth() + 1) + "/" + (year + 1900));
        this.mHourEditText.setText(String.valueOf(hours));
        this.mMinEditText.setText(String.valueOf(minutes));
    }

    public /* synthetic */ void lambda$initialize$0$NewMessage() {
        this.mMessageEditText.requestFocusFromTouch();
        ((InputMethodManager) this.mContext.getSystemService("input_method")).showSoftInput(this.mMessageEditText, 0);
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == Resources.getId("new_message_inc_hour")) {
            this.mTs += 3600000;
        } else if (id == Resources.getId("new_message_dec_hour")) {
            this.mTs -= 3600000;
        } else if (id == Resources.getId("new_message_inc_min")) {
            this.mTs += 60000;
        } else if (id == Resources.getId("new_message_dec_min")) {
            this.mTs -= 60000;
        } else if (id == Resources.getId("new_message_button_ok")) {
            sendMessage();
            dismiss();
        } else if (id == Resources.getId("new_message_button_cancel")) {
            dismiss();
        }
        checkTimePicker();
        setDate();
    }
}
