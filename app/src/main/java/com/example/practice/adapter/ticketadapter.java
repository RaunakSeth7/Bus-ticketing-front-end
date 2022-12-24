package com.example.practice.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.practice.R;
import com.example.practice.model.ticketsview;
import com.example.practice.ticket_bought_view;

import java.util.List;

public class ticketadapter extends RecyclerView.Adapter<ticketadapter.ticketviewHolder>{
   Context context;
   List<ticketsview> ticketList;

    public ticketadapter(Context context, List<ticketsview> ticketList) {
        this.context = context;
        this.ticketList = ticketList;
    }

    @NonNull
    @Override
    public ticketviewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.ticket_layout,parent,false);
        return new ticketviewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ticketviewHolder holder, int position) {
     holder.price.setText(ticketList.get(position).getPrice());
        holder.time1.setText(ticketList.get(position).getTime1());
        holder.time2.setText(ticketList.get(position).getTime2());
        holder.desti1.setText(ticketList.get(position).getDesti1());
        holder.desti2.setText(ticketList.get(position).getDesti2());
        holder.tottime.setText(ticketList.get(position).getTottime());
        holder.distance.setText(ticketList.get(position).getDistance());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(context,ticket_bought_view.class);
                context.startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return ticketList.size();
    }

    public static final class ticketviewHolder extends RecyclerView.ViewHolder{
        Button price;
        TextView time1,time2,desti1,desti2,tottime,distance;
        public ticketviewHolder(@NonNull View itemView) {
            super(itemView);
            price=itemView.findViewById(R.id.price);
            time1=itemView.findViewById(R.id.time1);
            time2=itemView.findViewById(R.id.time2);
            desti1=itemView.findViewById(R.id.destination1);
            desti2=itemView.findViewById(R.id.destination2);
            tottime=itemView.findViewById(R.id.totaltime);
            distance=itemView.findViewById(R.id.distance);
        }
    }
}
