package b.mihai.listapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ItemAdapter extends BaseAdapter {

    LayoutInflater mInflate;
    String[] items;
    String[] prices;
    String[] description;

    public ItemAdapter(Context c, String[] items, String[] prices, String[] description) {
        this.items = items;
        this.prices = prices;
        this.description = description;
        this.mInflate = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }

    @Override
    public int getCount() {
        return this.items.length;
    }

    @Override
    public Object getItem(int position) {
        return this.items[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = this.mInflate.inflate(R.layout.my_listview_detail, null);
        TextView nameTextView = (TextView) v.findViewById(R.id.nameTextView);
        TextView descriptionTextView = (TextView) v.findViewById(R.id.desTextView);
        TextView priceTextView = (TextView) v.findViewById(R.id.priceTextView);

        String name = this.items[position];
        String cost = this.prices[position];
        String desc = this.description[position];

        nameTextView.setText(name);
        descriptionTextView.setText(desc);
        priceTextView.setText(cost);

        return v;
    }
}
