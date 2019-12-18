package com.mazda94.allicv.Adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.google.android.material.card.MaterialCardView;
import com.mazda94.allicv.Model.Experiences.ExperienceData;
import com.mazda94.allicv.Model.Project.ProjectData;
import com.mazda94.allicv.R;

import java.util.List;

public class ProjectAdapter extends RecyclerView.Adapter<ProjectAdapter.ViewHolder> {

    List<ProjectData> data;
    Context context;
    ItemClickListener listener;

    public ProjectAdapter(List<ProjectData> data, Context context, ItemClickListener listener) {
        this.data = data;
        this.context = context;
        this.listener = listener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from( parent.getContext() ).inflate( R.layout.item_project, parent, false );
        return new ViewHolder( view , listener);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ProjectData projectData= data.get( position );
        holder.projectImg.setClipToOutline( true );
        if (projectData.getScreenshoot().size() != 0){
            Log.d( "onBindViewHolder: " , String.valueOf( projectData.getScreenshoot().get( 0 ) ) );
            Glide.with( context )
                    .load( projectData.getScreenshoot().get( 0 ) )
                    .into( holder.projectImg );
        }
        holder.projectName.setText( projectData.getProjectName() );
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView projectImg;
        TextView projectName;
        LinearLayout itemLayout;

        public ViewHolder(@NonNull View itemView, ItemClickListener listener) {
            super( itemView );
            projectImg = itemView.findViewById( R.id.project_img);
            projectName= itemView.findViewById( R.id.project_name);
            itemLayout = itemView.findViewById( R.id.item_layout );
            itemLayout.setOnClickListener( v -> listener.onItemClick( v, getAdapterPosition() ) );
        }
    }

    public interface ItemClickListener {
        void onItemClick(View view, int position);
    }
}
