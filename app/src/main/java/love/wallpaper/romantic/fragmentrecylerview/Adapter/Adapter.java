package love.wallpaper.romantic.fragmentrecylerview.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import love.wallpaper.romantic.fragmentrecylerview.Modal.Modal;
import love.wallpaper.romantic.fragmentrecylerview.R;

public class Adapter extends RecyclerView.Adapter<Adapter.Holder> {
    Context context;
    ArrayList<Modal> data;

    public Adapter(Context context, ArrayList<Modal> data) {
        this.context = context;
        this.data = data;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.fragment2_item, parent, false);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
        holder.title.setText(data.get(position).getTitle());
        holder.Des.setText(data.get(position).getDes());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class Holder extends RecyclerView.ViewHolder {
        TextView title, Des;

        public Holder(@NonNull View itemView) {
            super(itemView);

            title = itemView.findViewById(R.id.fragtitle);
            Des = itemView.findViewById(R.id.fragdes);
        }
    }
}
