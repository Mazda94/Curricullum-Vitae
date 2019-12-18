package com.mazda94.allicv.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.mazda94.allicv.Model.Education.EducationData;
import com.mazda94.allicv.R;

import java.util.List;

public class EduAdapter extends RecyclerView.Adapter<EduAdapter.EduViewHolder> {

    List<EducationData> data;
    Context context;
    ItemClickListener listener;

    public EduAdapter(List<EducationData> data, Context context, ItemClickListener clickListener) {
        this.data = data;
        this.context = context;
        this.listener = clickListener;
    }

    @NonNull
    @Override
    public EduViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from( parent.getContext() ).inflate( R.layout.item_edu, parent, false );
        return new EduViewHolder( view, listener );
    }

    @Override
    public void onBindViewHolder(@NonNull EduViewHolder holder, int position) {
        EducationData education = data.get( position );
        holder.school.setClipToOutline( true );
        Glide.with( context )
                .load( education.getImg() )
                .into( holder.school );
        holder.name.setText( education.getNama() );
    }

    @Override
    public int getItemCount() {
        return data.size();
    }


    public interface ItemClickListener {
        void onItemClick(View v, int position);
    }

    public class EduViewHolder extends RecyclerView.ViewHolder {
        ImageView school;
        TextView name;
        LinearLayout itemLayout;

        public EduViewHolder(@NonNull View itemView, ItemClickListener clickListener) {
            super( itemView );
            school = itemView.findViewById( R.id.school_img );
            name = itemView.findViewById( R.id.name );
            itemLayout = itemView.findViewById( R.id.item_layout );
            itemLayout.setOnClickListener( v -> clickListener.onItemClick( v, getAdapterPosition() ) );
        }
    }
}
