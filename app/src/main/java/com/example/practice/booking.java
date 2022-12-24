package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.practice.adapter.ticketadapter;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.practice.model.ticketsview;

import java.util.ArrayList;
import java.util.List;

public class booking extends AppCompatActivity {
    RecyclerView ticketrecycler;
    ImageButton imageButton;
    ticketadapter ticketadapter;
List<resource> resourceList=new ArrayList<>();
ConstraintLayout discount,ticket;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking);
        discount=findViewById(R.id.discount);
        ticket=findViewById(R.id.ticket);
        discount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                discount.setBackground(getResources().getDrawable(R.drawable.bg_tag_filled));
                ticket.setBackground(getResources().getDrawable(R.drawable.bg_tag));
            }
        });
        ticket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ticket.setBackground(getResources().getDrawable(R.drawable.bg_tag_filled));
                discount.setBackground(getResources().getDrawable(R.drawable.bg_tag));
            }
        });
        resourceList.add(new resource("dots_grid_white","dots_grid_black",R.id.imageButton));
        resourceList.add(new resource("trainwhite","trainblack",R.id.imageButton2));
        resourceList.add(new resource("taxiwhite","taxiblack",R.id.imageButton3));
        resourceList.add(new resource("buswhite","busblack",R.id.imageButton4));
        String add="Travel Time ";
        List<ticketsview>ticketList=new ArrayList<>();
        ticketList.add(new ticketsview("Home","Airport","11:00","11:35",add+"35 min","$ 7.3","12km"));
        ticketList.add(new ticketsview("Home","Airport","12:00","12:40",add+"40 min","$ 5.2","12km"));
        ticketList.add(new ticketsview("Home","Airport","12:30","01:15",add+"45 min","$ 5.0","12km"));
        ticketList.add(new ticketsview("Home","Airport","12:45","01:35",add+"50 min","$ 6.0","12km"));
        setTicketRecycler(ticketList);
    }
    private void setTicketRecycler(List<ticketsview>ticketlist)
    {
        ticketrecycler=findViewById(R.id.ticketrecycler);
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(this,RecyclerView.VERTICAL,false);
        ticketrecycler.setLayoutManager(layoutManager);
        ticketadapter= new ticketadapter(this,ticketlist);
        ticketrecycler.setAdapter(ticketadapter);
    }
    public void setImageButtonResource(String white,String black,boolean buttonOnOff)
    {
        int resID1 = booking.this.getResources().getIdentifier(white, "drawable", booking.this.getPackageName());
        int resID2 = getResources().getIdentifier(black, "drawable", booking.this.getPackageName());
        if(buttonOnOff) {
            if(resID1!=0)
                imageButton.setImageResource(resID1);
            imageButton.setBackground(getResources().getDrawable(R.drawable.bg_buttonsecondactivity_orange));
        }
        else
        {
            if(resID2!=0)
            imageButton.setImageResource(resID2);
            imageButton.setBackground(getResources().getDrawable(R.drawable.bg_buttonsecondactivity_bluish_white));

        }
    }
    public void UpperTray(View view)
    {
        switch (view.getId()) {
            case R.id.imageButton:

                for(int i=0;i<resourceList.size();i++)
                {
                    imageButton=findViewById(resourceList.get(i).getImageurl());
                    boolean bof=false;
                    if(i==0)
                        bof=true;
                setImageButtonResource(resourceList.get(i).getWhite(),resourceList.get(i).getBlack(),bof);

                }
                break;
            case R.id.imageButton2:
                imageButton=findViewById(R.id.imageButton2);
                for(int i=0;i<resourceList.size();i++)
                {
                    imageButton=findViewById(resourceList.get(i).getImageurl());
                    boolean bof=false;
                    if(i==1)
                        bof=true;
                        setImageButtonResource(resourceList.get(i).getWhite(),resourceList.get(i).getBlack(),bof);
                }
                break;
            case R.id.imageButton3:
                imageButton=findViewById(R.id.imageButton3);
                for(int i=0;i<resourceList.size();i++)
                {
                    imageButton=findViewById(resourceList.get(i).getImageurl());
                    boolean bof=false;
                    if(i==2)
                        bof=true;
                        setImageButtonResource(resourceList.get(i).getWhite(),resourceList.get(i).getBlack(),bof);
                }
                break;
            case R.id.imageButton4:
                imageButton=findViewById(R.id.imageButton4);
                for(int i=0;i<resourceList.size();i++)
                {
                    imageButton=findViewById(resourceList.get(i).getImageurl());
                    boolean bof=false;
                    if(i==3)
                        bof=true;
                        setImageButtonResource(resourceList.get(i).getWhite(),resourceList.get(i).getBlack(),bof);
                }
                break;
            default:
                Toast.makeText(this, "IDK how the fuck u did this", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}