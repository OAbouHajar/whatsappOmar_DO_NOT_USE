package com.AssemMods.fakechat.adapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.AssemMods.fakechat.database.DB;
import com.AssemMods.fakechat.model.Chat;
import com.AssemMods.fakechat.model.ChatRow;
import com.AssemMods.fakechat.utils.CircleImageView;
import com.AssemMods.fakechat.utils.Resources;
import java.io.File;
import java.util.List;

public class ChatRowAdapter extends ArrayAdapter<Chat> {
    private boolean[] mHidden;
    private LayoutInflater mInflater;
    private List<Chat> mItems;

    public ChatRowAdapter(Context context, List<Chat> list) {
        super(context, Resources.getLayout("AssemMods_chat_row"), Resources.getId("chat_row_name"), list);
        this.mInflater = LayoutInflater.from(context);
        this.mItems = list;
        this.mHidden = new boolean[list.size()];
        for (int i2 = 0; i2 < this.mItems.size(); i2++) {
            this.mHidden[i2] = false;
        }
    }

    private int getHiddenCount() {
        int i2 = 0;
        for (int i3 = 0; i3 < this.mItems.size(); i3++) {
            if (this.mHidden[i3]) {
                i2++;
            }
        }
        return i2;
    }

    private int getHiddenCountUpTo(int i2) {
        int i3 = 0;
        for (int i4 = 0; i4 <= i2; i4++) {
            if (this.mHidden[i4]) {
                i3++;
            }
        }
        return i3;
    }

    private boolean imageExists(String str) {
        return new File(str).exists();
    }

    private String jidToPath(String str) {
        return DB.WHATSAPP_AVATARS_PATH + str + ".j";
    }

    public int getCount() {
        return this.mItems.size() - getHiddenCount();
    }

    public int getRealPosition(int i2) {
        int hiddenCountUpTo = getHiddenCountUpTo(i2);
        int i3 = 0;
        int i4 = 0;
        while (i4 < hiddenCountUpTo) {
            i3++;
            if (this.mHidden[i2 + i3]) {
                i4--;
            }
            i4++;
        }
        return i2 + i3;
    }

    public View getView(int i2, View view, ViewGroup viewGroup) {
        TextView textView;
        TextView textView2;
        TextView textView3;
        CircleImageView circleImageView;
        String str;
        Chat chat = (Chat) getItem(getRealPosition(i2));
        if (view == null) {
            view = this.mInflater.inflate(Resources.getLayout("AssemMods_chat_row"), (ViewGroup) null);
            circleImageView = (CircleImageView) view.findViewById(Resources.getId("chat_row_image"));
            textView3 = (TextView) view.findViewById(Resources.getId("chat_row_name"));
            textView2 = (TextView) view.findViewById(Resources.getId("chat_row_lastmessage"));
            textView = (TextView) view.findViewById(Resources.getId("chat_row_time"));
            view.setTag(new ChatRow(circleImageView, textView3, textView2, textView));
        } else {
            ChatRow chatRow = (ChatRow) view.getTag();
            CircleImageView image = chatRow.getImage();
            TextView name = chatRow.getName();
            TextView lastMessage = chatRow.getLastMessage();
            TextView time = chatRow.getTime();
            circleImageView = image;
            textView3 = name;
            textView2 = lastMessage;
            textView = time;
        }
        if (imageExists(jidToPath(chat.getJid()))) {
            circleImageView.setImageDrawable(Drawable.createFromPath(jidToPath(chat.getJid())));
        } else {
            circleImageView.setImageResource(Resources.getDrawable("avatar_contact"));
        }
        textView3.setText(chat.getName());
        if (!(chat.getLastMessage() == null || chat.getLastMessage().getData() == null)) {
            StringBuilder sb = new StringBuilder();
            if (chat.isGroup()) {
                str = chat.getLastMessage().getMsgFrom() + ": ";
            } else {
                str = "";
            }
            sb.append(str);
            sb.append(chat.getLastMessage().getData());
            String sb2 = sb.toString();
            if (sb2.length() > 50) {
                textView2.setText(sb2.substring(0, 50) + "...");
            } else {
                textView2.setText(sb2);
            }
            textView.setText(chat.getLastMessage().getTime());
        }
        return view;
    }
}
