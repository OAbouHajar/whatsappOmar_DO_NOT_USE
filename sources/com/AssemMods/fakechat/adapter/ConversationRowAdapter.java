package com.AssemMods.fakechat.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.AssemMods.fakechat.model.ConversationRow;
import com.AssemMods.fakechat.model.WhatsAppMessage;
import com.AssemMods.fakechat.utils.Resources;
import java.util.List;

public class ConversationRowAdapter extends ArrayAdapter<WhatsAppMessage> {
    private Context mContext;
    private LayoutInflater mInflater;
    private TextView mMessage;
    private TextView mTime;

    public ConversationRowAdapter(Context context, List<WhatsAppMessage> list) {
        super(context, Resources.getLayout("AssemMods_conversation_row"), Resources.getId("conversation_row_message"), list);
        this.mInflater = LayoutInflater.from(context);
        this.mContext = context;
    }

    private void setBackground(RelativeLayout relativeLayout, boolean z2) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) relativeLayout.getLayoutParams();
        if (z2) {
            layoutParams.addRule(11);
        } else {
            layoutParams.addRule(9);
        }
        relativeLayout.setLayoutParams(layoutParams);
        relativeLayout.setBackgroundResource(z2 ? Resources.getDrawable("balloon_outgoing_normal") : Resources.getDrawable("balloon_incoming_normal"));
        relativeLayout.setPadding(z2 ? 0 : (int) this.mContext.getResources().getDimension(Resources.getDimen("bubble_padding")), 0, z2 ? (int) this.mContext.getResources().getDimension(Resources.getDimen("bubble_padding")) : 10, 10);
    }

    public View getView(int i2, View view, ViewGroup viewGroup) {
        String str;
        WhatsAppMessage whatsAppMessage = (WhatsAppMessage) getItem(i2);
        if (view == null) {
            view = this.mInflater.inflate(Resources.getLayout("AssemMods_conversation_row"), viewGroup, false);
            this.mMessage = (TextView) view.findViewById(Resources.getId("conversation_row_message"));
            TextView textView = (TextView) view.findViewById(Resources.getId("conversation_row_time"));
            this.mTime = textView;
            view.setTag(new ConversationRow(this.mMessage, textView));
        } else {
            ConversationRow conversationRow = (ConversationRow) view.getTag();
            this.mMessage = conversationRow.getMessage();
            this.mTime = conversationRow.getTime();
        }
        TextView textView2 = this.mMessage;
        StringBuilder sb = new StringBuilder();
        if (whatsAppMessage.isGroup()) {
            str = whatsAppMessage.getMsgFrom() + ": ";
        } else {
            str = "";
        }
        sb.append(str);
        sb.append(whatsAppMessage.getData());
        textView2.setText(sb.toString());
        this.mTime.setText(whatsAppMessage.getTime());
        setBackground((RelativeLayout) view.findViewById(Resources.getId("conversation_row_layout")), whatsAppMessage.getFromMe());
        return view;
    }
}
