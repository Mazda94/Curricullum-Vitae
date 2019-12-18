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
import com.mazda94.allicv.Model.Experiences.ExperienceData;
import com.mazda94.allicv.R;

import java.util.List;

public class ExperienceAdapter extends RecyclerView.Adapter<ExperienceAdapter.ViewHolder> {

    List<ExperienceData> data;
    Context context;
    ItemClickListener listener;

    public ExperienceAdapter(List<ExperienceData> data, Context context, ItemClickListener listener) {
        this.data = data;
        this.context = context;
        this.listener = listener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from( parent.getContext() ).inflate( R.layout.item_exp, parent, false );
        return new ViewHolder( view , listener);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ExperienceData experienceData = data.get( position );
        holder.companyLogo.setClipToOutline( true );
        Glide.with( context )
                .load( experienceData.getLogoPerusahaan() )
                .into( holder.companyLogo );
        holder.companyName.setText( experienceData.getNamaPerusahaan() );
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView companyLogo;
        TextView companyName;
        LinearLayout itemLayout;

        public ViewHolder(@NonNull View itemView, ItemClickListener listener) {
            super( itemView );
            companyLogo = itemView.findViewById( R.id.company_logo );
            companyName = itemView.findViewById( R.id.company_name );
            itemLayout = itemView.findViewById( R.id.item_layout );
            itemLayout.setOnClickListener( v -> listener.onItemClick( v, getAdapterPosition() ) );
        }
    }

    public interface ItemClickListener {
        void onItemClick(View view, int position);
    }
}
